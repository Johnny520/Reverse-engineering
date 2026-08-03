package com.android.dx.command.dump;

/* JADX INFO: loaded from: classes.dex */
public class BlockDumper extends com.android.dx.command.dump.BaseDumper {
    protected com.android.dx.cf.direct.DirectClassFile classFile;
    private boolean first;
    private final boolean optimize;
    private final boolean rop;
    protected boolean suppressDump;

    public BlockDumper(byte[] r1, java.io.PrintStream r2, java.lang.String r3, boolean r4, com.android.dx.command.dump.Args r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r5)
            r0.rop = r4
            r1 = 0
            r0.classFile = r1
            r1 = 1
            r0.suppressDump = r1
            r0.first = r1
            boolean r1 = r5.optimize
            r0.optimize = r1
            return
    }

    public static void dump(byte[] r7, java.io.PrintStream r8, java.lang.String r9, boolean r10, com.android.dx.command.dump.Args r11) {
            com.android.dx.command.dump.BlockDumper r6 = new com.android.dx.command.dump.BlockDumper
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.dump()
            return
    }

    private void regularDump(com.android.dx.cf.code.ConcreteMethod r17) {
            r16 = this;
            r0 = r16
            com.android.dx.cf.code.BytecodeArray r1 = r17.getCode()
            com.android.dx.util.ByteArray r2 = r1.getBytes()
            com.android.dx.cf.code.ByteBlockList r3 = com.android.dx.cf.code.BasicBlocker.identifyBlocks(r17)
            int r4 = r3.size()
            com.android.dx.cf.direct.CodeObserver r5 = new com.android.dx.cf.direct.CodeObserver
            r5.<init>(r2, r0)
            r6 = 0
            r0.suppressDump = r6
            r7 = r6
            r8 = r7
        L1c:
            java.lang.String r9 = "dead code "
            java.lang.String r10 = ".."
            if (r7 >= r4) goto L113
            com.android.dx.cf.code.ByteBlock r12 = r3.get(r7)
            int r13 = r12.getStart()
            int r14 = r12.getEnd()
            if (r8 >= r13) goto L52
            int r15 = r13 - r8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            java.lang.String r9 = com.android.dx.util.Hex.u2(r8)
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = com.android.dx.util.Hex.u2(r13)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            r0.parsed(r2, r8, r15, r9)
        L52:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "block "
            r8.append(r9)
            int r9 = r12.getLabel()
            java.lang.String r9 = com.android.dx.util.Hex.u2(r9)
            r8.append(r9)
            java.lang.String r9 = ": "
            r8.append(r9)
            java.lang.String r9 = com.android.dx.util.Hex.u2(r13)
            r8.append(r9)
            r8.append(r10)
            java.lang.String r9 = com.android.dx.util.Hex.u2(r14)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r0.parsed(r2, r13, r6, r8)
            r8 = 1
            r0.changeIndent(r8)
        L88:
            if (r13 >= r14) goto L93
            int r8 = r1.parseInstruction(r13, r5)
            r5.setPreviousOffset(r13)
            int r13 = r13 + r8
            goto L88
        L93:
            com.android.dx.util.IntList r8 = r12.getSuccessors()
            int r9 = r8.size()
            if (r9 != 0) goto La3
            java.lang.String r8 = "returns"
            r0.parsed(r2, r14, r6, r8)
            goto Lc5
        La3:
            r10 = r6
        La4:
            if (r10 >= r9) goto Lc5
            int r11 = r8.get(r10)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "next "
            r13.append(r15)
            java.lang.String r11 = com.android.dx.util.Hex.u2(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r0.parsed(r2, r14, r6, r11)
            int r10 = r10 + 1
            goto La4
        Lc5:
            com.android.dx.cf.code.ByteCatchList r8 = r12.getCatches()
            int r9 = r8.size()
            r10 = r6
        Lce:
            if (r10 >= r9) goto L10a
            com.android.dx.cf.code.ByteCatchList$Item r11 = r8.get(r10)
            com.android.dx.rop.cst.CstType r12 = r11.getExceptionClass()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "catch "
            r13.append(r15)
            com.android.dx.rop.cst.CstType r15 = com.android.dx.rop.cst.CstType.OBJECT
            if (r12 != r15) goto Le9
            java.lang.String r12 = "<any>"
            goto Led
        Le9:
            java.lang.String r12 = r12.toHuman()
        Led:
            r13.append(r12)
            java.lang.String r12 = " -> "
            r13.append(r12)
            int r11 = r11.getHandlerPc()
            java.lang.String r11 = com.android.dx.util.Hex.u2(r11)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r0.parsed(r2, r14, r6, r11)
            int r10 = r10 + 1
            goto Lce
        L10a:
            r8 = -1
            r0.changeIndent(r8)
            int r7 = r7 + 1
            r8 = r14
            goto L1c
        L113:
            int r1 = r2.size()
            if (r8 >= r1) goto L13b
            int r3 = r1 - r8
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            java.lang.String r5 = com.android.dx.util.Hex.u2(r8)
            r4.append(r5)
            r4.append(r10)
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.parsed(r2, r8, r3, r1)
        L13b:
            r1 = 1
            r0.suppressDump = r1
            return
    }

    private void ropDump(com.android.dx.cf.code.ConcreteMethod r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            com.android.dx.rop.code.DexTranslationAdvice r2 = com.android.dx.rop.code.DexTranslationAdvice.THE_ONE
            com.android.dx.cf.code.BytecodeArray r3 = r17.getCode()
            com.android.dx.util.ByteArray r3 = r3.getBytes()
            com.android.dx.cf.direct.DirectClassFile r4 = r0.classFile
            com.android.dx.cf.iface.MethodList r4 = r4.getMethods()
            com.android.dx.dex.DexOptions r5 = r0.dexOptions
            com.android.dx.rop.code.RopMethod r4 = com.android.dx.cf.code.Ropper.convert(r1, r2, r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r6 = 2000(0x7d0, float:2.803E-42)
            r5.<init>(r6)
            boolean r6 = r0.optimize
            r7 = 1
            if (r6 == 0) goto L36
            int r6 = r17.getAccessFlags()
            boolean r6 = com.android.dx.rop.code.AccessFlags.isStatic(r6)
            int r1 = com.android.dx.command.dump.BaseDumper.computeParamWidth(r1, r6)
            com.android.dx.rop.code.RopMethod r4 = com.android.dx.ssa.Optimizer.optimize(r4, r1, r6, r7, r2)
        L36:
            com.android.dx.rop.code.BasicBlockList r1 = r4.getBlocks()
            int[] r2 = r1.getLabelsInOrder()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "first "
            r6.append(r8)
            int r8 = r4.getFirstLabel()
            java.lang.String r8 = com.android.dx.util.Hex.u2(r8)
            r6.append(r8)
            java.lang.String r8 = "\n"
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r5.append(r6)
            int r6 = r2.length
            r10 = 0
        L61:
            if (r10 >= r6) goto Lfb
            r11 = r2[r10]
            int r12 = r1.indexOfLabel(r11)
            com.android.dx.rop.code.BasicBlock r12 = r1.get(r12)
            java.lang.String r13 = "block "
            r5.append(r13)
            java.lang.String r13 = com.android.dx.util.Hex.u2(r11)
            r5.append(r13)
            r5.append(r8)
            com.android.dx.util.IntList r11 = r4.labelToPredecessors(r11)
            int r13 = r11.size()
            r14 = 0
        L85:
            if (r14 >= r13) goto L9d
            java.lang.String r15 = "  pred "
            r5.append(r15)
            int r15 = r11.get(r14)
            java.lang.String r15 = com.android.dx.util.Hex.u2(r15)
            r5.append(r15)
            r5.append(r8)
            int r14 = r14 + 1
            goto L85
        L9d:
            com.android.dx.rop.code.InsnList r11 = r12.getInsns()
            int r13 = r11.size()
            r14 = 0
        La6:
            if (r14 >= r13) goto Lc1
            r11.get(r14)
            java.lang.String r15 = "  "
            r5.append(r15)
            com.android.dx.rop.code.Insn r15 = r11.get(r14)
            java.lang.String r15 = r15.toHuman()
            r5.append(r15)
            r5.append(r8)
            int r14 = r14 + 1
            goto La6
        Lc1:
            com.android.dx.util.IntList r11 = r12.getSuccessors()
            int r13 = r11.size()
            if (r13 != 0) goto Ld1
            java.lang.String r11 = "  returns\n"
            r5.append(r11)
            goto Lf7
        Ld1:
            int r12 = r12.getPrimarySuccessor()
            r14 = 0
        Ld6:
            if (r14 >= r13) goto Lf7
            int r15 = r11.get(r14)
            java.lang.String r9 = "  next "
            r5.append(r9)
            java.lang.String r9 = com.android.dx.util.Hex.u2(r15)
            r5.append(r9)
            if (r13 == r7) goto Lf1
            if (r15 != r12) goto Lf1
            java.lang.String r9 = " *"
            r5.append(r9)
        Lf1:
            r5.append(r8)
            int r14 = r14 + 1
            goto Ld6
        Lf7:
            int r10 = r10 + 1
            goto L61
        Lfb:
            r9 = 0
            r0.suppressDump = r9
            int r1 = r3.size()
            java.lang.String r2 = r5.toString()
            r0.parsed(r3, r9, r1, r2)
            r0.suppressDump = r7
            return
    }

    @Override // com.android.dx.command.dump.BaseDumper, com.android.dx.cf.iface.ParseObserver
    public void changeIndent(int r2) {
            r1 = this;
            boolean r0 = r1.suppressDump
            if (r0 != 0) goto L7
            super.changeIndent(r2)
        L7:
            return
    }

    public void dump() {
            r5 = this;
            byte[] r0 = r5.getBytes()
            com.android.dx.util.ByteArray r1 = new com.android.dx.util.ByteArray
            r1.<init>(r0)
            com.android.dx.cf.direct.DirectClassFile r0 = new com.android.dx.cf.direct.DirectClassFile
            java.lang.String r2 = r5.getFilePath()
            boolean r3 = r5.getStrictParse()
            r0.<init>(r1, r2, r3)
            r5.classFile = r0
            com.android.dx.cf.direct.StdAttributeFactory r2 = com.android.dx.cf.direct.StdAttributeFactory.THE_ONE
            r0.setAttributeFactory(r2)
            com.android.dx.cf.direct.DirectClassFile r0 = r5.classFile
            r0.getMagic()
            com.android.dx.cf.direct.DirectClassFile r0 = new com.android.dx.cf.direct.DirectClassFile
            java.lang.String r3 = r5.getFilePath()
            boolean r4 = r5.getStrictParse()
            r0.<init>(r1, r3, r4)
            r0.setAttributeFactory(r2)
            r0.setObserver(r5)
            r0.getMagic()
            return
    }

    @Override // com.android.dx.command.dump.BaseDumper, com.android.dx.cf.iface.ParseObserver
    public void endParsingMember(com.android.dx.util.ByteArray r1, int r2, java.lang.String r3, java.lang.String r4, com.android.dx.cf.iface.Member r5) {
            r0 = this;
            boolean r1 = r5 instanceof com.android.dx.cf.iface.Method
            if (r1 != 0) goto L5
            return
        L5:
            boolean r1 = r0.shouldDumpMethod(r3)
            if (r1 != 0) goto Lc
            return
        Lc:
            int r1 = r5.getAccessFlags()
            r1 = r1 & 1280(0x500, float:1.794E-42)
            if (r1 == 0) goto L15
            return
        L15:
            com.android.dx.cf.code.ConcreteMethod r1 = new com.android.dx.cf.code.ConcreteMethod
            com.android.dx.cf.iface.Method r5 = (com.android.dx.cf.iface.Method) r5
            com.android.dx.cf.direct.DirectClassFile r2 = r0.classFile
            r3 = 1
            r1.<init>(r5, r2, r3, r3)
            boolean r2 = r0.rop
            if (r2 == 0) goto L27
            r0.ropDump(r1)
            goto L2a
        L27:
            r0.regularDump(r1)
        L2a:
            return
    }

    @Override // com.android.dx.command.dump.BaseDumper, com.android.dx.cf.iface.ParseObserver
    public void parsed(com.android.dx.util.ByteArray r2, int r3, int r4, java.lang.String r5) {
            r1 = this;
            boolean r0 = r1.suppressDump
            if (r0 != 0) goto L7
            super.parsed(r2, r3, r4, r5)
        L7:
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

    @Override // com.android.dx.command.dump.BaseDumper, com.android.dx.cf.iface.ParseObserver
    public void startParsingMember(com.android.dx.util.ByteArray r4, int r5, java.lang.String r6, java.lang.String r7) {
            r3 = this;
            r0 = 40
            int r0 = r7.indexOf(r0)
            if (r0 >= 0) goto L9
            return
        L9:
            boolean r0 = r3.shouldDumpMethod(r6)
            if (r0 != 0) goto L10
            return
        L10:
            r0 = 0
            r3.suppressDump = r0
            boolean r1 = r3.first
            if (r1 == 0) goto L1a
            r3.first = r0
            goto L1f
        L1a:
            java.lang.String r1 = "\n"
            r3.parsed(r4, r5, r0, r1)
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "method "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r3.parsed(r4, r5, r0, r6)
            r4 = 1
            r3.suppressDump = r4
            return
    }
}
