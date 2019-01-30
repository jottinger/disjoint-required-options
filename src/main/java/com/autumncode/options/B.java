package com.autumncode.options;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import java.util.StringJoiner;

@Parameters(separators = "=")
public class B extends Command {
    @Parameter(names = "-c", required = true)
    private String c;
    @Parameter(names = "-d", required = true)
    private String d;

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", B.class.getSimpleName() + "[", "]")
                .add("c='" + c + "'")
                .add("d='" + d + "'")
                .toString();
    }
}
