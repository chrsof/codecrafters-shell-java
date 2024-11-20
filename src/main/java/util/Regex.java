package util;

import shell.ShellCommand;

import java.util.function.Supplier;
import java.util.regex.Pattern;

public final class Regex {

    public static final Supplier<Pattern> PATH = () -> Pattern.compile("^([a-zA-Z0-9-_:/]+)");

    public static final Supplier<Pattern> EXIT = () -> Pattern.compile("^%s\\s(\\d+)".formatted(ShellCommand.EXIT.getCommand()));

    public static final Supplier<Pattern> ECHO = () -> Pattern.compile("^%s\\s(.+)".formatted(ShellCommand.ECHO.getCommand()));

    public static final Supplier<Pattern> TYPE = () -> Pattern.compile("^%s\\s(\\w+)".formatted(ShellCommand.TYPE.getCommand()));

    public static final Supplier<Pattern> BUILTIN = () -> Pattern.compile("^(%s)".formatted(ShellCommand.builtinCommands()));

}
