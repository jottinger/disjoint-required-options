# disjoint-required-options

    ./gradlew shadowJar
    java -jar build/libs/disjoint-required-options.jar a -e=foo -f=bar
    java -jar build/libs/disjoint-required-options.jar a -e=foo
    java -jar build/libs/disjoint-required-options.jar b -c=foo -d=bar
    java -jar build/libs/disjoint-required-options.jar b -c=foo