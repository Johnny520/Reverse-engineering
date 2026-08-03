package com.android.dx.rop.code;

/* JADX INFO: loaded from: classes.dex */
public final class LocalVariableExtractor {
    private final com.android.dx.rop.code.BasicBlockList blocks;
    private final com.android.dx.rop.code.RopMethod method;
    private final com.android.dx.rop.code.LocalVariableInfo resultInfo;
    private final int[] workSet;

    private LocalVariableExtractor(com.android.dx.rop.code.RopMethod r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L1f
            com.android.dx.rop.code.BasicBlockList r0 = r3.getBlocks()
            int r1 = r0.getMaxLabel()
            r2.method = r3
            r2.blocks = r0
            com.android.dx.rop.code.LocalVariableInfo r0 = new com.android.dx.rop.code.LocalVariableInfo
            r0.<init>(r3)
            r2.resultInfo = r0
            int[] r3 = com.android.dx.util.Bits.makeBitSet(r1)
            r2.workSet = r3
            return
        L1f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "method == null"
            r3.<init>(r0)
            throw r3
    }

    private com.android.dx.rop.code.LocalVariableInfo doit() {
            r2 = this;
            com.android.dx.rop.code.RopMethod r0 = r2.method
            int r0 = r0.getFirstLabel()
        L6:
            if (r0 < 0) goto L18
            int[] r1 = r2.workSet
            com.android.dx.util.Bits.clear(r1, r0)
            r2.processBlock(r0)
            int[] r0 = r2.workSet
            r1 = 0
            int r0 = com.android.dx.util.Bits.findFirst(r0, r1)
            goto L6
        L18:
            com.android.dx.rop.code.LocalVariableInfo r0 = r2.resultInfo
            r0.setImmutable()
            com.android.dx.rop.code.LocalVariableInfo r0 = r2.resultInfo
            return r0
    }

    public static com.android.dx.rop.code.LocalVariableInfo extract(com.android.dx.rop.code.RopMethod r1) {
            com.android.dx.rop.code.LocalVariableExtractor r0 = new com.android.dx.rop.code.LocalVariableExtractor
            r0.<init>(r1)
            com.android.dx.rop.code.LocalVariableInfo r1 = r0.doit()
            return r1
    }

    private void processBlock(int r14) {
            r13 = this;
            com.android.dx.rop.code.LocalVariableInfo r0 = r13.resultInfo
            com.android.dx.rop.code.RegisterSpecSet r0 = r0.mutableCopyOfStarts(r14)
            com.android.dx.rop.code.BasicBlockList r1 = r13.blocks
            com.android.dx.rop.code.BasicBlock r14 = r1.labelToBlock(r14)
            com.android.dx.rop.code.InsnList r1 = r14.getInsns()
            int r2 = r1.size()
            boolean r3 = r14.hasExceptionHandlers()
            r4 = 0
            if (r3 == 0) goto L27
            com.android.dx.rop.code.Insn r3 = r1.getLast()
            com.android.dx.rop.code.RegisterSpec r3 = r3.getResult()
            if (r3 == 0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = r4
        L28:
            int r5 = r2 + (-1)
            r7 = r0
            r6 = r4
        L2c:
            if (r6 >= r2) goto L8f
            if (r3 == 0) goto L39
            if (r6 != r5) goto L39
            r7.setImmutable()
            com.android.dx.rop.code.RegisterSpecSet r7 = r7.mutableCopy()
        L39:
            com.android.dx.rop.code.Insn r8 = r1.get(r6)
            com.android.dx.rop.code.RegisterSpec r9 = r8.getLocalAssignment()
            if (r9 != 0) goto L5f
            com.android.dx.rop.code.RegisterSpec r8 = r8.getResult()
            if (r8 == 0) goto L8c
            int r9 = r8.getReg()
            com.android.dx.rop.code.RegisterSpec r9 = r7.get(r9)
            if (r9 == 0) goto L8c
            int r8 = r8.getReg()
            com.android.dx.rop.code.RegisterSpec r8 = r7.get(r8)
            r7.remove(r8)
            goto L8c
        L5f:
            com.android.dx.rop.code.RegisterSpec r9 = r9.withSimpleType()
            com.android.dx.rop.code.RegisterSpec r10 = r7.get(r9)
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto L8c
            com.android.dx.rop.code.LocalItem r10 = r9.getLocalItem()
            com.android.dx.rop.code.RegisterSpec r10 = r7.localItemToSpec(r10)
            if (r10 == 0) goto L84
            int r11 = r10.getReg()
            int r12 = r9.getReg()
            if (r11 == r12) goto L84
            r7.remove(r10)
        L84:
            com.android.dx.rop.code.LocalVariableInfo r10 = r13.resultInfo
            r10.addAssignment(r8, r9)
            r7.put(r9)
        L8c:
            int r6 = r6 + 1
            goto L2c
        L8f:
            r7.setImmutable()
            com.android.dx.util.IntList r1 = r14.getSuccessors()
            int r2 = r1.size()
            int r14 = r14.getPrimarySuccessor()
        L9e:
            if (r4 >= r2) goto Lb9
            int r3 = r1.get(r4)
            if (r3 != r14) goto La8
            r5 = r7
            goto La9
        La8:
            r5 = r0
        La9:
            com.android.dx.rop.code.LocalVariableInfo r6 = r13.resultInfo
            boolean r5 = r6.mergeStarts(r3, r5)
            if (r5 == 0) goto Lb6
            int[] r5 = r13.workSet
            com.android.dx.util.Bits.set(r5, r3)
        Lb6:
            int r4 = r4 + 1
            goto L9e
        Lb9:
            return
    }
}
