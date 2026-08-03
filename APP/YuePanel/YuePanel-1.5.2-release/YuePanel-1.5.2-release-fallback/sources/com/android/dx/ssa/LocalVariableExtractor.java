package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class LocalVariableExtractor {
    private final java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> blocks;
    private final com.android.dx.ssa.SsaMethod method;
    private final com.android.dx.ssa.LocalVariableInfo resultInfo;
    private final java.util.BitSet workSet;

    private LocalVariableExtractor(com.android.dx.ssa.SsaMethod r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L20
            java.util.ArrayList r0 = r3.getBlocks()
            r2.method = r3
            r2.blocks = r0
            com.android.dx.ssa.LocalVariableInfo r1 = new com.android.dx.ssa.LocalVariableInfo
            r1.<init>(r3)
            r2.resultInfo = r1
            java.util.BitSet r3 = new java.util.BitSet
            int r0 = r0.size()
            r3.<init>(r0)
            r2.workSet = r3
            return
        L20:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "method == null"
            r3.<init>(r0)
            throw r3
    }

    private com.android.dx.ssa.LocalVariableInfo doit() {
            r2 = this;
            com.android.dx.ssa.SsaMethod r0 = r2.method
            int r0 = r0.getRegCount()
            if (r0 <= 0) goto L20
            com.android.dx.ssa.SsaMethod r0 = r2.method
            int r0 = r0.getEntryBlockIndex()
        Le:
            if (r0 < 0) goto L20
            java.util.BitSet r1 = r2.workSet
            r1.clear(r0)
            r2.processBlock(r0)
            java.util.BitSet r0 = r2.workSet
            r1 = 0
            int r0 = r0.nextSetBit(r1)
            goto Le
        L20:
            com.android.dx.ssa.LocalVariableInfo r0 = r2.resultInfo
            r0.setImmutable()
            com.android.dx.ssa.LocalVariableInfo r0 = r2.resultInfo
            return r0
    }

    public static com.android.dx.ssa.LocalVariableInfo extract(com.android.dx.ssa.SsaMethod r1) {
            com.android.dx.ssa.LocalVariableExtractor r0 = new com.android.dx.ssa.LocalVariableExtractor
            r0.<init>(r1)
            com.android.dx.ssa.LocalVariableInfo r1 = r0.doit()
            return r1
    }

    private void processBlock(int r14) {
            r13 = this;
            com.android.dx.ssa.LocalVariableInfo r0 = r13.resultInfo
            com.android.dx.rop.code.RegisterSpecSet r0 = r0.mutableCopyOfStarts(r14)
            java.util.ArrayList<com.android.dx.ssa.SsaBasicBlock> r1 = r13.blocks
            java.lang.Object r1 = r1.get(r14)
            com.android.dx.ssa.SsaBasicBlock r1 = (com.android.dx.ssa.SsaBasicBlock) r1
            java.util.ArrayList r2 = r1.getInsns()
            int r3 = r2.size()
            com.android.dx.ssa.SsaMethod r4 = r13.method
            int r4 = r4.getExitBlockIndex()
            if (r14 != r4) goto L1f
            return
        L1f:
            int r14 = r3 + (-1)
            java.lang.Object r4 = r2.get(r14)
            com.android.dx.ssa.SsaInsn r4 = (com.android.dx.ssa.SsaInsn) r4
            com.android.dx.rop.code.Insn r5 = r4.getOriginalRopInsn()
            com.android.dx.rop.type.TypeList r5 = r5.getCatches()
            int r5 = r5.size()
            r6 = 0
            if (r5 == 0) goto L3e
            com.android.dx.rop.code.RegisterSpec r4 = r4.getResult()
            if (r4 == 0) goto L3e
            r4 = 1
            goto L3f
        L3e:
            r4 = r6
        L3f:
            r7 = r0
            r5 = r6
        L41:
            if (r5 >= r3) goto La6
            if (r4 == 0) goto L4e
            if (r5 != r14) goto L4e
            r7.setImmutable()
            com.android.dx.rop.code.RegisterSpecSet r7 = r7.mutableCopy()
        L4e:
            java.lang.Object r8 = r2.get(r5)
            com.android.dx.ssa.SsaInsn r8 = (com.android.dx.ssa.SsaInsn) r8
            com.android.dx.rop.code.RegisterSpec r9 = r8.getLocalAssignment()
            if (r9 != 0) goto L76
            com.android.dx.rop.code.RegisterSpec r8 = r8.getResult()
            if (r8 == 0) goto La3
            int r9 = r8.getReg()
            com.android.dx.rop.code.RegisterSpec r9 = r7.get(r9)
            if (r9 == 0) goto La3
            int r8 = r8.getReg()
            com.android.dx.rop.code.RegisterSpec r8 = r7.get(r8)
            r7.remove(r8)
            goto La3
        L76:
            com.android.dx.rop.code.RegisterSpec r9 = r9.withSimpleType()
            com.android.dx.rop.code.RegisterSpec r10 = r7.get(r9)
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto La3
            com.android.dx.rop.code.LocalItem r10 = r9.getLocalItem()
            com.android.dx.rop.code.RegisterSpec r10 = r7.localItemToSpec(r10)
            if (r10 == 0) goto L9b
            int r11 = r10.getReg()
            int r12 = r9.getReg()
            if (r11 == r12) goto L9b
            r7.remove(r10)
        L9b:
            com.android.dx.ssa.LocalVariableInfo r10 = r13.resultInfo
            r10.addAssignment(r8, r9)
            r7.put(r9)
        La3:
            int r5 = r5 + 1
            goto L41
        La6:
            r7.setImmutable()
            com.android.dx.util.IntList r14 = r1.getSuccessorList()
            int r2 = r14.size()
            int r1 = r1.getPrimarySuccessorIndex()
        Lb5:
            if (r6 >= r2) goto Ld0
            int r3 = r14.get(r6)
            if (r3 != r1) goto Lbf
            r4 = r7
            goto Lc0
        Lbf:
            r4 = r0
        Lc0:
            com.android.dx.ssa.LocalVariableInfo r5 = r13.resultInfo
            boolean r4 = r5.mergeStarts(r3, r4)
            if (r4 == 0) goto Lcd
            java.util.BitSet r4 = r13.workSet
            r4.set(r3)
        Lcd:
            int r6 = r6 + 1
            goto Lb5
        Ld0:
            return
    }
}
