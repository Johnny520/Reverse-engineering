package com.android.dx.command.dump;

/* JADX INFO: loaded from: classes.dex */
public class SsaDumper extends com.android.dx.command.dump.BlockDumper {
    private SsaDumper(byte[] r7, java.io.PrintStream r8, java.lang.String r9, com.android.dx.command.dump.Args r10) {
            r6 = this;
            r4 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static void dump(byte[] r1, java.io.PrintStream r2, java.lang.String r3, com.android.dx.command.dump.Args r4) {
            com.android.dx.command.dump.SsaDumper r0 = new com.android.dx.command.dump.SsaDumper
            r0.<init>(r1, r2, r3, r4)
            r0.dump()
            return
    }

    @Override // com.android.dx.command.dump.BlockDumper, com.android.dx.command.dump.BaseDumper, com.android.dx.cf.iface.ParseObserver
    public void endParsingMember(com.android.dx.util.ByteArray r9, int r10, java.lang.String r11, java.lang.String r12, com.android.dx.cf.iface.Member r13) {
            r8 = this;
            boolean r10 = r13 instanceof com.android.dx.cf.iface.Method
            if (r10 != 0) goto L5
            return
        L5:
            boolean r10 = r8.shouldDumpMethod(r11)
            if (r10 != 0) goto Lc
            return
        Lc:
            int r10 = r13.getAccessFlags()
            r10 = r10 & 1280(0x500, float:1.794E-42)
            if (r10 == 0) goto L15
            return
        L15:
            com.android.dx.cf.code.ConcreteMethod r10 = new com.android.dx.cf.code.ConcreteMethod
            com.android.dx.cf.iface.Method r13 = (com.android.dx.cf.iface.Method) r13
            com.android.dx.cf.direct.DirectClassFile r11 = r8.classFile
            r12 = 1
            r10.<init>(r13, r11, r12, r12)
            com.android.dx.rop.code.DexTranslationAdvice r4 = com.android.dx.rop.code.DexTranslationAdvice.THE_ONE
            com.android.dx.cf.direct.DirectClassFile r11 = r8.classFile
            com.android.dx.cf.iface.MethodList r11 = r11.getMethods()
            com.android.dx.dex.DexOptions r13 = r8.dexOptions
            com.android.dx.rop.code.RopMethod r0 = com.android.dx.cf.code.Ropper.convert(r10, r4, r11, r13)
            int r11 = r10.getAccessFlags()
            boolean r2 = com.android.dx.rop.code.AccessFlags.isStatic(r11)
            int r1 = com.android.dx.command.dump.BaseDumper.computeParamWidth(r10, r2)
            com.android.dx.command.dump.Args r10 = r8.args
            java.lang.String r10 = r10.ssaStep
            if (r10 != 0) goto L4b
            java.lang.Class<com.android.dx.ssa.Optimizer$OptionalStep> r10 = com.android.dx.ssa.Optimizer.OptionalStep.class
            java.util.EnumSet r5 = java.util.EnumSet.allOf(r10)
            r3 = 1
            com.android.dx.ssa.SsaMethod r10 = com.android.dx.ssa.Optimizer.debugNoRegisterAllocation(r0, r1, r2, r3, r4, r5)
            goto L8c
        L4b:
            java.lang.String r11 = "edge-split"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L58
            com.android.dx.ssa.SsaMethod r10 = com.android.dx.ssa.Optimizer.debugEdgeSplit(r0, r1, r2, r12, r4)
            goto L8c
        L58:
            com.android.dx.command.dump.Args r10 = r8.args
            java.lang.String r10 = r10.ssaStep
            java.lang.String r11 = "phi-placement"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L69
            com.android.dx.ssa.SsaMethod r10 = com.android.dx.ssa.Optimizer.debugPhiPlacement(r0, r1, r2, r12, r4)
            goto L8c
        L69:
            com.android.dx.command.dump.Args r10 = r8.args
            java.lang.String r10 = r10.ssaStep
            java.lang.String r11 = "renaming"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L7a
            com.android.dx.ssa.SsaMethod r10 = com.android.dx.ssa.Optimizer.debugRenaming(r0, r1, r2, r12, r4)
            goto L8c
        L7a:
            com.android.dx.command.dump.Args r10 = r8.args
            java.lang.String r10 = r10.ssaStep
            java.lang.String r11 = "dead-code"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L8b
            com.android.dx.ssa.SsaMethod r10 = com.android.dx.ssa.Optimizer.debugDeadCodeRemover(r0, r1, r2, r12, r4)
            goto L8c
        L8b:
            r10 = 0
        L8c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r13 = 2000(0x7d0, float:2.803E-42)
            r11.<init>(r13)
            java.lang.String r13 = "first "
            r11.append(r13)
            int r13 = r10.getEntryBlockIndex()
            int r13 = r10.blockIndexToRopLabel(r13)
            java.lang.String r13 = com.android.dx.util.Hex.u2(r13)
            r11.append(r13)
            r13 = 10
            r11.append(r13)
            java.util.ArrayList r0 = r10.getBlocks()
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Comparator<com.android.dx.ssa.SsaBasicBlock> r1 = com.android.dx.ssa.SsaBasicBlock.LABEL_COMPARATOR
            java.util.Collections.sort(r0, r1)
            java.util.Iterator r0 = r0.iterator()
        Lbf:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1a2
            java.lang.Object r1 = r0.next()
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            java.lang.String r3 = "block "
            r11.append(r3)
            int r3 = r1.getRopLabel()
            java.lang.String r3 = com.android.dx.util.Hex.u2(r3)
            r11.append(r3)
            r11.append(r13)
            java.util.BitSet r3 = r1.getPredecessors()
            int r4 = r3.nextSetBit(r2)
        Le7:
            if (r4 < 0) goto L103
            java.lang.String r5 = "  pred "
            r11.append(r5)
            int r5 = r10.blockIndexToRopLabel(r4)
            java.lang.String r5 = com.android.dx.util.Hex.u2(r5)
            r11.append(r5)
            r11.append(r13)
            int r4 = r4 + 1
            int r4 = r3.nextSetBit(r4)
            goto Le7
        L103:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "  live in:"
            r3.append(r4)
            com.android.dx.util.IntSet r4 = r1.getLiveInRegs()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r11.append(r3)
            java.lang.String r3 = "\n"
            r11.append(r3)
            java.util.ArrayList r4 = r1.getInsns()
            java.util.Iterator r4 = r4.iterator()
        L128:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L144
            java.lang.Object r5 = r4.next()
            com.android.dx.ssa.SsaInsn r5 = (com.android.dx.ssa.SsaInsn) r5
            java.lang.String r6 = "  "
            r11.append(r6)
            java.lang.String r5 = r5.toHuman()
            r11.append(r5)
            r11.append(r13)
            goto L128
        L144:
            java.util.BitSet r4 = r1.getSuccessors()
            int r4 = r4.cardinality()
            if (r4 != 0) goto L154
            java.lang.String r2 = "  returns\n"
            r11.append(r2)
            goto L185
        L154:
            int r4 = r1.getPrimarySuccessorRopLabel()
            com.android.dx.util.IntList r5 = r1.getRopLabelSuccessorList()
            int r6 = r5.size()
        L160:
            if (r2 >= r6) goto L185
            java.lang.String r7 = "  next "
            r11.append(r7)
            int r7 = r5.get(r2)
            java.lang.String r7 = com.android.dx.util.Hex.u2(r7)
            r11.append(r7)
            if (r6 == r12) goto L17f
            int r7 = r5.get(r2)
            if (r4 != r7) goto L17f
            java.lang.String r7 = " *"
            r11.append(r7)
        L17f:
            r11.append(r13)
            int r2 = r2 + 1
            goto L160
        L185:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "  live out:"
            r2.append(r4)
            com.android.dx.util.IntSet r1 = r1.getLiveOutRegs()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r11.append(r1)
            r11.append(r3)
            goto Lbf
        L1a2:
            r8.suppressDump = r2
            int r10 = r9.size()
            java.lang.String r11 = r11.toString()
            r8.parsed(r9, r2, r10, r11)
            r8.suppressDump = r12
            return
    }
}
