package com.android.dx.command;

/* JADX INFO: loaded from: classes.dex */
public class Main {
    private static final java.lang.String USAGE_MESSAGE = "usage:\n  dx --dex [--debug] [--verbose] [--positions=<style>] [--no-locals]\n  [--no-optimize] [--statistics] [--[no-]optimize-list=<file>] [--no-strict]\n  [--keep-classes] [--output=<file>] [--dump-to=<file>] [--dump-width=<n>]\n  [--dump-method=<name>[*]] [--verbose-dump] [--no-files] [--core-library]\n  [--num-threads=<n>] [--incremental] [--force-jumbo] [--no-warning]\n  [--multi-dex [--main-dex-list=<file> [--minimal-main-dex]]\n  [--input-list=<file>] [--min-sdk-version=<n>]\n  [--allow-all-interface-method-invokes]\n  [<file>.class | <file>.{zip,jar,apk} | <directory>] ...\n    Convert a set of classfiles into a dex file, optionally embedded in a\n    jar/zip. Output name must end with one of: .dex .jar .zip .apk or be a\n    directory.\n    Positions options: none, important, lines.\n    --multi-dex: allows to generate several dex files if needed. This option is\n    exclusive with --incremental, causes --num-threads to be ignored and only\n    supports folder or archive output.\n    --main-dex-list=<file>: <file> is a list of class file names, classes\n    defined by those class files are put in classes.dex.\n    --minimal-main-dex: only classes selected by --main-dex-list are to be put\n    in the main dex.\n    --input-list: <file> is a list of inputs.\n    Each line in <file> must end with one of: .class .jar .zip .apk or be a\n    directory.\n    --min-sdk-version=<n>: Enable dex file features that require at least sdk\n    version <n>.\n  dx --annotool --annotation=<class> [--element=<element types>]\n  [--print=<print types>]\n  dx --dump [--debug] [--strict] [--bytes] [--optimize]\n  [--basic-blocks | --rop-blocks | --ssa-blocks | --dot] [--ssa-step=<step>]\n  [--width=<n>] [<file>.class | <file>.txt] ...\n    Dump classfiles, or transformations thereof, in a human-oriented format.\n  dx --find-usages <file.dex> <declaring type> <member>\n    Find references and declarations to a field or method.\n    <declaring type> is a class name in internal form, like Ljava/lang/Object;\n    <member> is a field or method name, like hashCode.\n  dx -J<option> ... <arguments, in one of the above forms>\n    Pass VM-specific options to the virtual machine that runs dx.\n  dx --version\n    Print the version of this tool (1.16).\n  dx --help\n    Print this message.";

    private Main() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void main(java.lang.String[] r6) {
            java.lang.String r0 = "--"
            r1 = 0
            r2 = r1
        L4:
            r3 = 1
            int r4 = r6.length     // Catch: java.lang.Throwable -> L7f java.lang.RuntimeException -> L82 com.android.dx.command.UsageException -> Lb4
            if (r2 >= r4) goto L85
            r4 = r6[r2]     // Catch: java.lang.Throwable -> L7f java.lang.RuntimeException -> L82 com.android.dx.command.UsageException -> Lb4
            boolean r5 = r4.equals(r0)     // Catch: java.lang.Throwable -> L7f java.lang.RuntimeException -> L82 com.android.dx.command.UsageException -> Lb4
            if (r5 != 0) goto Lb4
            boolean r5 = r4.startsWith(r0)     // Catch: java.lang.Throwable -> L7f java.lang.RuntimeException -> L82 com.android.dx.command.UsageException -> Lb4
            if (r5 != 0) goto L18
            goto Lb4
        L18:
            java.lang.String r5 = "--dex"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            if (r5 == 0) goto L33
            java.lang.String[] r6 = without(r6, r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            com.android.dx.command.dexer.Main.main(r6)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            goto L6e
        L28:
            r6 = move-exception
            r0 = r3
            goto L87
        L2c:
            r6 = move-exception
            r0 = r3
            goto La5
        L30:
            r1 = r3
            goto Lb4
        L33:
            java.lang.String r5 = "--dump"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            if (r5 == 0) goto L43
            java.lang.String[] r6 = without(r6, r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            com.android.dx.command.dump.Main.main(r6)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            goto L6e
        L43:
            java.lang.String r5 = "--annotool"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            if (r5 == 0) goto L53
            java.lang.String[] r6 = without(r6, r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            com.android.dx.command.annotool.Main.main(r6)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            goto L6e
        L53:
            java.lang.String r5 = "--find-usages"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            if (r5 == 0) goto L63
            java.lang.String[] r6 = without(r6, r2)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            com.android.dx.command.findusages.Main.main(r6)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            goto L6e
        L63:
            java.lang.String r5 = "--version"
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            if (r5 == 0) goto L71
            version()     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
        L6e:
            r6 = r1
            r1 = r3
            goto Lb5
        L71:
            java.lang.String r5 = "--help"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L28 java.lang.RuntimeException -> L2c com.android.dx.command.UsageException -> L30
            if (r4 == 0) goto L7c
            r6 = r3
            r1 = r6
            goto Lb5
        L7c:
            int r2 = r2 + 1
            goto L4
        L7f:
            r6 = move-exception
            r0 = r1
            goto L87
        L82:
            r6 = move-exception
            r0 = r1
            goto La5
        L85:
            r6 = r1
            goto Lb5
        L87:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r4 = "\nUNEXPECTED TOP-LEVEL ERROR:"
            r2.println(r4)
            r6.printStackTrace()
            boolean r4 = r6 instanceof java.lang.NoClassDefFoundError
            if (r4 != 0) goto L99
            boolean r6 = r6 instanceof java.lang.NoSuchMethodError
            if (r6 == 0) goto L9e
        L99:
            java.lang.String r6 = "Note: You may be using an incompatible virtual machine or class library.\n(This program is known to be incompatible with recent releases of GCJ.)"
            r2.println(r6)
        L9e:
            r6 = 3
            java.lang.System.exit(r6)
        La2:
            r6 = r1
            r1 = r0
            goto Lb5
        La5:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r4 = "\nUNEXPECTED TOP-LEVEL EXCEPTION:"
            r2.println(r4)
            r6.printStackTrace()
            r6 = 2
            java.lang.System.exit(r6)
            goto La2
        Lb4:
            r6 = r3
        Lb5:
            if (r1 != 0) goto Lbf
            java.io.PrintStream r6 = java.lang.System.err
            java.lang.String r0 = "error: no command specified"
            r6.println(r0)
            r6 = r3
        Lbf:
            if (r6 == 0) goto Lc7
            usage()
            java.lang.System.exit(r3)
        Lc7:
            return
    }

    private static void usage() {
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "usage:\n  dx --dex [--debug] [--verbose] [--positions=<style>] [--no-locals]\n  [--no-optimize] [--statistics] [--[no-]optimize-list=<file>] [--no-strict]\n  [--keep-classes] [--output=<file>] [--dump-to=<file>] [--dump-width=<n>]\n  [--dump-method=<name>[*]] [--verbose-dump] [--no-files] [--core-library]\n  [--num-threads=<n>] [--incremental] [--force-jumbo] [--no-warning]\n  [--multi-dex [--main-dex-list=<file> [--minimal-main-dex]]\n  [--input-list=<file>] [--min-sdk-version=<n>]\n  [--allow-all-interface-method-invokes]\n  [<file>.class | <file>.{zip,jar,apk} | <directory>] ...\n    Convert a set of classfiles into a dex file, optionally embedded in a\n    jar/zip. Output name must end with one of: .dex .jar .zip .apk or be a\n    directory.\n    Positions options: none, important, lines.\n    --multi-dex: allows to generate several dex files if needed. This option is\n    exclusive with --incremental, causes --num-threads to be ignored and only\n    supports folder or archive output.\n    --main-dex-list=<file>: <file> is a list of class file names, classes\n    defined by those class files are put in classes.dex.\n    --minimal-main-dex: only classes selected by --main-dex-list are to be put\n    in the main dex.\n    --input-list: <file> is a list of inputs.\n    Each line in <file> must end with one of: .class .jar .zip .apk or be a\n    directory.\n    --min-sdk-version=<n>: Enable dex file features that require at least sdk\n    version <n>.\n  dx --annotool --annotation=<class> [--element=<element types>]\n  [--print=<print types>]\n  dx --dump [--debug] [--strict] [--bytes] [--optimize]\n  [--basic-blocks | --rop-blocks | --ssa-blocks | --dot] [--ssa-step=<step>]\n  [--width=<n>] [<file>.class | <file>.txt] ...\n    Dump classfiles, or transformations thereof, in a human-oriented format.\n  dx --find-usages <file.dex> <declaring type> <member>\n    Find references and declarations to a field or method.\n    <declaring type> is a class name in internal form, like Ljava/lang/Object;\n    <member> is a field or method name, like hashCode.\n  dx -J<option> ... <arguments, in one of the above forms>\n    Pass VM-specific options to the virtual machine that runs dx.\n  dx --version\n    Print the version of this tool (1.16).\n  dx --help\n    Print this message."
            r0.println(r1)
            return
    }

    private static void version() {
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.String r1 = "dx version 1.16"
            r0.println(r1)
            r0 = 0
            java.lang.System.exit(r0)
            return
    }

    private static java.lang.String[] without(java.lang.String[] r3, int r4) {
            int r0 = r3.length
            int r0 = r0 + (-1)
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.System.arraycopy(r3, r2, r1, r2, r4)
            int r2 = r4 + 1
            int r0 = r0 - r4
            java.lang.System.arraycopy(r3, r2, r1, r4, r0)
            return r1
    }
}
