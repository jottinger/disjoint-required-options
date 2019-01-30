package com.autumncode.options;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import java.util.StringJoiner;

@Parameters(separators = "=")
public class A extends Command {
    @Parameter(names = "-e", required = true)
    private String e;
    @Parameter(names = "-f", required = true)
    private String f;

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", A.class.getSimpleName() + "[", "]")
                .add("e='" + e + "'")
                .add("f='" + f + "'")
                .toString();
    }
}
