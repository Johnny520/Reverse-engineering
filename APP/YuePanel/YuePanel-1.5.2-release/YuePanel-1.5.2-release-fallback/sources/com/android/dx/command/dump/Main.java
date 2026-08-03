package com.android.dx.command.dump;

/* JADX INFO: loaded from: classes.dex */
public class Main {
    private final com.android.dx.command.dump.Args parsedArgs;

    private Main() {
            r1 = this;
            r1.<init>()
            com.android.dx.command.dump.Args r0 = new com.android.dx.command.dump.Args
            r0.<init>()
            r1.parsedArgs = r0
            return
    }

    public static void main(java.lang.String[] r1) {
            com.android.dx.command.dump.Main r0 = new com.android.dx.command.dump.Main
            r0.<init>()
            r0.run(r1)
            return
    }

    private void processOne(java.lang.String r4, byte[] r5) {
            r3 = this;
            com.android.dx.command.dump.Args r0 = r3.parsedArgs
            boolean r1 = r0.dotDump
            if (r1 == 0) goto La
            com.android.dx.command.dump.DotDumper.dump(r5, r4, r0)
            goto L31
        La:
            boolean r1 = r0.basicBlocks
            r2 = 0
            if (r1 == 0) goto L15
            java.io.PrintStream r1 = java.lang.System.out
            com.android.dx.command.dump.BlockDumper.dump(r5, r1, r4, r2, r0)
            goto L31
        L15:
            boolean r1 = r0.ropBlocks
            if (r1 == 0) goto L20
            java.io.PrintStream r1 = java.lang.System.out
            r2 = 1
            com.android.dx.command.dump.BlockDumper.dump(r5, r1, r4, r2, r0)
            goto L31
        L20:
            boolean r1 = r0.ssaBlocks
            if (r1 == 0) goto L2c
            r0.optimize = r2
            java.io.PrintStream r1 = java.lang.System.out
            com.android.dx.command.dump.SsaDumper.dump(r5, r1, r4, r0)
            goto L31
        L2c:
            java.io.PrintStream r1 = java.lang.System.out
            com.android.dx.command.dump.ClassDumper.dump(r5, r1, r4, r0)
        L31:
            return
    }

    private void run(java.lang.String[] r7) {
            r6 = this;
            r0 = 0
        L1:
            int r1 = r7.length
            java.lang.String r2 = "usage"
            if (r0 >= r1) goto Led
            r1 = r7[r0]
            java.lang.String r3 = "--"
            boolean r4 = r1.equals(r3)
            if (r4 != 0) goto Led
            boolean r3 = r1.startsWith(r3)
            if (r3 != 0) goto L18
            goto Led
        L18:
            java.lang.String r3 = "--bytes"
            boolean r3 = r1.equals(r3)
            r4 = 1
            if (r3 == 0) goto L27
            com.android.dx.command.dump.Args r1 = r6.parsedArgs
            r1.rawBytes = r4
            goto Lcd
        L27:
            java.lang.String r3 = "--basic-blocks"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L35
            com.android.dx.command.dump.Args r1 = r6.parsedArgs
            r1.basicBlocks = r4
            goto Lcd
        L35:
            java.lang.String r3 = "--rop-blocks"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L43
            com.android.dx.command.dump.Args r1 = r6.parsedArgs
            r1.ropBlocks = r4
            goto Lcd
        L43:
            java.lang.String r3 = "--optimize"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L51
            com.android.dx.command.dump.Args r1 = r6.parsedArgs
            r1.optimize = r4
            goto Lcd
        L51:
            java.lang.String r3 = "--ssa-blocks"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L5f
            com.android.dx.command.dump.Args r1 = r6.parsedArgs
            r1.ssaBlocks = r4
            goto Lcd
        L5f:
            java.lang.String r3 = "--ssa-step="
            boolean r3 = r1.startsWith(r3)
            r5 = 61
            if (r3 == 0) goto L77
            com.android.dx.command.dump.Args r2 = r6.parsedArgs
            int r3 = r1.indexOf(r5)
            int r3 = r3 + r4
            java.lang.String r1 = r1.substring(r3)
            r2.ssaStep = r1
            goto Lcd
        L77:
            java.lang.String r3 = "--debug"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L84
            com.android.dx.command.dump.Args r1 = r6.parsedArgs
            r1.debug = r4
            goto Lcd
        L84:
            java.lang.String r3 = "--dot"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L91
            com.android.dx.command.dump.Args r1 = r6.parsedArgs
            r1.dotDump = r4
            goto Lcd
        L91:
            java.lang.String r3 = "--strict"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L9e
            com.android.dx.command.dump.Args r1 = r6.parsedArgs
            r1.strictParse = r4
            goto Lcd
        L9e:
            java.lang.String r3 = "--width="
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto Lb8
            int r2 = r1.indexOf(r5)
            int r2 = r2 + r4
            java.lang.String r1 = r1.substring(r2)
            com.android.dx.command.dump.Args r2 = r6.parsedArgs
            int r1 = java.lang.Integer.parseInt(r1)
            r2.width = r1
            goto Lcd
        Lb8:
            java.lang.String r3 = "--method="
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto Ld1
            int r2 = r1.indexOf(r5)
            int r2 = r2 + r4
            java.lang.String r1 = r1.substring(r2)
            com.android.dx.command.dump.Args r2 = r6.parsedArgs
            r2.method = r1
        Lcd:
            int r0 = r0 + 1
            goto L1
        Ld1:
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "unknown option: "
            r0.append(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.println(r0)
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r2)
            throw r7
        Led:
            int r1 = r7.length
            if (r0 == r1) goto L14f
        Lf0:
            int r1 = r7.length
            if (r0 >= r1) goto L14e
            r1 = r7[r0]     // Catch: com.android.dx.cf.iface.ParseException -> L128
            java.io.PrintStream r2 = java.lang.System.out     // Catch: com.android.dx.cf.iface.ParseException -> L128
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: com.android.dx.cf.iface.ParseException -> L128
            r3.<init>()     // Catch: com.android.dx.cf.iface.ParseException -> L128
            java.lang.String r4 = "reading "
            r3.append(r4)     // Catch: com.android.dx.cf.iface.ParseException -> L128
            r3.append(r1)     // Catch: com.android.dx.cf.iface.ParseException -> L128
            java.lang.String r4 = "..."
            r3.append(r4)     // Catch: com.android.dx.cf.iface.ParseException -> L128
            java.lang.String r3 = r3.toString()     // Catch: com.android.dx.cf.iface.ParseException -> L128
            r2.println(r3)     // Catch: com.android.dx.cf.iface.ParseException -> L128
            byte[] r2 = com.android.dex.util.FileUtils.readFile(r1)     // Catch: com.android.dx.cf.iface.ParseException -> L128
            java.lang.String r3 = ".class"
            boolean r3 = r1.endsWith(r3)     // Catch: com.android.dx.cf.iface.ParseException -> L128
            if (r3 != 0) goto L133
            java.lang.String r3 = new java.lang.String     // Catch: com.android.dx.cf.iface.ParseException -> L128 java.io.UnsupportedEncodingException -> L12a
            java.lang.String r4 = "utf-8"
            r3.<init>(r2, r4)     // Catch: com.android.dx.cf.iface.ParseException -> L128 java.io.UnsupportedEncodingException -> L12a
            byte[] r2 = com.android.dx.util.HexParser.parse(r3)     // Catch: com.android.dx.cf.iface.ParseException -> L128
            goto L133
        L128:
            r1 = move-exception
            goto L137
        L12a:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: com.android.dx.cf.iface.ParseException -> L128
            java.lang.String r3 = "shouldn't happen"
            r2.<init>(r3, r1)     // Catch: com.android.dx.cf.iface.ParseException -> L128
            throw r2     // Catch: com.android.dx.cf.iface.ParseException -> L128
        L133:
            r6.processOne(r1, r2)     // Catch: com.android.dx.cf.iface.ParseException -> L128
            goto L14b
        L137:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r3 = "\ntrouble parsing:"
            r2.println(r3)
            com.android.dx.command.dump.Args r3 = r6.parsedArgs
            boolean r3 = r3.debug
            if (r3 == 0) goto L148
            r1.printStackTrace()
            goto L14b
        L148:
            r1.printContext(r2)
        L14b:
            int r0 = r0 + 1
            goto Lf0
        L14e:
            return
        L14f:
            java.io.PrintStream r7 = java.lang.System.err
            java.lang.String r0 = "no input files specified"
            r7.println(r0)
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            r7.<init>(r2)
            throw r7
    }
}
