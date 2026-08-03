package com.android.dx.command.dump;

/* JADX INFO: loaded from: classes.dex */
public class DotDumper implements com.android.dx.cf.iface.ParseObserver {
    private final com.android.dx.command.dump.Args args;
    private final byte[] bytes;
    private com.android.dx.cf.direct.DirectClassFile classFile;
    private final com.android.dx.dex.DexOptions dexOptions;
    private final java.lang.String filePath;
    private final boolean optimize;
    private final boolean strictParse;

    public DotDumper(byte[] r1, java.lang.String r2, com.android.dx.command.dump.Args r3) {
            r0 = this;
            r0.<init>()
            r0.bytes = r1
            r0.filePath = r2
            boolean r1 = r3.strictParse
            r0.strictParse = r1
            boolean r1 = r3.optimize
            r0.optimize = r1
            r0.args = r3
            com.android.dx.dex.DexOptions r1 = new com.android.dx.dex.DexOptions
            r1.<init>()
            r0.dexOptions = r1
            return
    }

    public static void dump(byte[] r1, java.lang.String r2, com.android.dx.command.dump.Args r3) {
            com.android.dx.command.dump.DotDumper r0 = new com.android.dx.command.dump.DotDumper
            r0.<init>(r1, r2, r3)
            r0.run()
            return
    }

    private void run() {
            r5 = this;
            com.android.dx.util.ByteArray r0 = new com.android.dx.util.ByteArray
            byte[] r1 = r5.bytes
            r0.<init>(r1)
            com.android.dx.cf.direct.DirectClassFile r1 = new com.android.dx.cf.direct.DirectClassFile
            java.lang.String r2 = r5.filePath
            boolean r3 = r5.strictParse
            r1.<init>(r0, r2, r3)
            r5.classFile = r1
            com.android.dx.cf.direct.StdAttributeFactory r2 = com.android.dx.cf.direct.StdAttributeFactory.THE_ONE
            r1.setAttributeFactory(r2)
            com.android.dx.cf.direct.DirectClassFile r1 = r5.classFile
            r1.getMagic()
            com.android.dx.cf.direct.DirectClassFile r1 = new com.android.dx.cf.direct.DirectClassFile
            java.lang.String r3 = r5.filePath
            boolean r4 = r5.strictParse
            r1.<init>(r0, r3, r4)
            r1.setAttributeFactory(r2)
            r1.setObserver(r5)
            r1.getMagic()
            return
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void changeIndent(int r1) {
            r0 = this;
            return
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void endParsingMember(com.android.dx.util.ByteArray r17, int r18, java.lang.String r19, java.lang.String r20, com.android.dx.cf.iface.Member r21) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r21
            boolean r3 = r2 instanceof com.android.dx.cf.iface.Method
            if (r3 != 0) goto Lb
            return
        Lb:
            boolean r3 = r0.shouldDumpMethod(r1)
            if (r3 != 0) goto L12
            return
        L12:
            com.android.dx.cf.code.ConcreteMethod r3 = new com.android.dx.cf.code.ConcreteMethod
            com.android.dx.cf.iface.Method r2 = (com.android.dx.cf.iface.Method) r2
            com.android.dx.cf.direct.DirectClassFile r4 = r0.classFile
            r5 = 1
            r3.<init>(r2, r4, r5, r5)
            com.android.dx.rop.code.DexTranslationAdvice r2 = com.android.dx.rop.code.DexTranslationAdvice.THE_ONE
            com.android.dx.cf.direct.DirectClassFile r4 = r0.classFile
            com.android.dx.cf.iface.MethodList r4 = r4.getMethods()
            com.android.dx.dex.DexOptions r6 = r0.dexOptions
            com.android.dx.rop.code.RopMethod r4 = com.android.dx.cf.code.Ropper.convert(r3, r2, r4, r6)
            boolean r6 = r0.optimize
            if (r6 == 0) goto L3e
            int r6 = r3.getAccessFlags()
            boolean r6 = com.android.dx.rop.code.AccessFlags.isStatic(r6)
            int r3 = com.android.dx.command.dump.BaseDumper.computeParamWidth(r3, r6)
            com.android.dx.rop.code.RopMethod r4 = com.android.dx.ssa.Optimizer.optimize(r4, r3, r6, r5, r2)
        L3e:
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "digraph "
            r3.append(r6)
            r3.append(r1)
            java.lang.String r1 = "{"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "\tfirst -> n"
            r1.append(r3)
            int r3 = r4.getFirstLabel()
            java.lang.String r3 = com.android.dx.util.Hex.u2(r3)
            r1.append(r3)
            java.lang.String r3 = ";"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.println(r1)
            com.android.dx.rop.code.BasicBlockList r1 = r4.getBlocks()
            int r2 = r1.size()
            r4 = 0
            r6 = r4
        L84:
            if (r6 >= r2) goto L172
            com.android.dx.rop.code.BasicBlock r7 = r1.get(r6)
            int r8 = r7.getLabel()
            com.android.dx.util.IntList r9 = r7.getSuccessors()
            int r10 = r9.size()
            java.lang.String r11 = "\tn"
            if (r10 != 0) goto Lb9
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            java.lang.String r8 = com.android.dx.util.Hex.u2(r8)
            r9.append(r8)
            java.lang.String r8 = " -> returns;"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.println(r8)
            goto L16d
        Lb9:
            int r10 = r9.size()
            java.lang.String r12 = " -> n"
            if (r10 != r5) goto Lec
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            java.lang.String r8 = com.android.dx.util.Hex.u2(r8)
            r10.append(r8)
            r10.append(r12)
            int r8 = r9.get(r4)
            java.lang.String r8 = com.android.dx.util.Hex.u2(r8)
            r10.append(r8)
            r10.append(r3)
            java.lang.String r8 = r10.toString()
            r7.println(r8)
            goto L16d
        Lec:
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            java.lang.String r14 = com.android.dx.util.Hex.u2(r8)
            r13.append(r14)
            java.lang.String r14 = " -> {"
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r10.print(r13)
            r10 = r4
        L10a:
            int r13 = r9.size()
            if (r10 >= r13) goto L13d
            int r13 = r9.get(r10)
            int r14 = r7.getPrimarySuccessor()
            if (r13 == r14) goto L139
            java.io.PrintStream r14 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r4 = " n"
            r15.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r13)
            r15.append(r4)
            java.lang.String r4 = " "
            r15.append(r4)
            java.lang.String r4 = r15.toString()
            r14.print(r4)
        L139:
            int r10 = r10 + 1
            r4 = 0
            goto L10a
        L13d:
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.String r9 = "};"
            r4.println(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            java.lang.String r8 = com.android.dx.util.Hex.u2(r8)
            r9.append(r8)
            r9.append(r12)
            int r7 = r7.getPrimarySuccessor()
            java.lang.String r7 = com.android.dx.util.Hex.u2(r7)
            r9.append(r7)
            java.lang.String r7 = " [label=\"primary\"];"
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r4.println(r7)
        L16d:
            int r6 = r6 + 1
            r4 = 0
            goto L84
        L172:
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.String r2 = "}"
            r1.println(r2)
            return
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void parsed(com.android.dx.util.ByteArray r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            return
    }

    public boolean shouldDumpMethod(java.lang.String r2) {
            r1 = this;
            com.android.dx.command.dump.Args r0 = r1.args
            java.lang.String r0 = r0.method
            if (r0 == 0) goto Lf
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // com.android.dx.cf.iface.ParseObserver
    public void startParsingMember(com.android.dx.util.ByteArray r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            return
    }
}
