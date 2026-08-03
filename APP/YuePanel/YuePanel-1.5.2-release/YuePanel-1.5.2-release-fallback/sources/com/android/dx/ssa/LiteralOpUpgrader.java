package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class LiteralOpUpgrader {
    private final com.android.dx.ssa.SsaMethod ssaMeth;


    private LiteralOpUpgrader(com.android.dx.ssa.SsaMethod r1) {
            r0 = this;
            r0.<init>()
            r0.ssaMeth = r1
            return
    }

    public static /* synthetic */ boolean access$000(com.android.dx.ssa.LiteralOpUpgrader r0, com.android.dx.ssa.NormalSsaInsn r1) {
            boolean r0 = r0.tryReplacingWithConstant(r1)
            return r0
    }

    public static /* synthetic */ boolean access$100(com.android.dx.rop.code.RegisterSpec r0) {
            boolean r0 = isConstIntZeroOrKnownNull(r0)
            return r0
    }

    public static /* synthetic */ void access$200(com.android.dx.ssa.LiteralOpUpgrader r0, com.android.dx.ssa.NormalSsaInsn r1, com.android.dx.rop.code.RegisterSpecList r2, int r3, com.android.dx.rop.cst.Constant r4) {
            r0.replacePlainInsn(r1, r2, r3, r4)
            return
    }

    private static boolean isConstIntZeroOrKnownNull(com.android.dx.rop.code.RegisterSpec r6) {
            com.android.dx.rop.type.TypeBearer r6 = r6.getTypeBearer()
            boolean r0 = r6 instanceof com.android.dx.rop.cst.CstLiteralBits
            r1 = 0
            if (r0 == 0) goto L16
            com.android.dx.rop.cst.CstLiteralBits r6 = (com.android.dx.rop.cst.CstLiteralBits) r6
            long r2 = r6.getLongBits()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L16
            r1 = 1
        L16:
            return r1
    }

    public static void process(com.android.dx.ssa.SsaMethod r1) {
            com.android.dx.ssa.LiteralOpUpgrader r0 = new com.android.dx.ssa.LiteralOpUpgrader
            r0.<init>(r1)
            r0.run()
            return
    }

    private void replacePlainInsn(com.android.dx.ssa.NormalSsaInsn r9, com.android.dx.rop.code.RegisterSpecList r10, int r11, com.android.dx.rop.cst.Constant r12) {
            r8 = this;
            com.android.dx.rop.code.Insn r0 = r9.getOriginalRopInsn()
            com.android.dx.rop.code.RegisterSpec r1 = r9.getResult()
            com.android.dx.rop.code.Rop r3 = com.android.dx.rop.code.Rops.ropFor(r11, r1, r10, r12)
            if (r12 != 0) goto L1c
            com.android.dx.rop.code.PlainInsn r11 = new com.android.dx.rop.code.PlainInsn
            com.android.dx.rop.code.SourcePosition r12 = r0.getPosition()
            com.android.dx.rop.code.RegisterSpec r0 = r9.getResult()
            r11.<init>(r3, r12, r0, r10)
            goto L2c
        L1c:
            com.android.dx.rop.code.PlainCstInsn r11 = new com.android.dx.rop.code.PlainCstInsn
            com.android.dx.rop.code.SourcePosition r4 = r0.getPosition()
            com.android.dx.rop.code.RegisterSpec r5 = r9.getResult()
            r2 = r11
            r6 = r10
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7)
        L2c:
            com.android.dx.ssa.NormalSsaInsn r10 = new com.android.dx.ssa.NormalSsaInsn
            com.android.dx.ssa.SsaBasicBlock r12 = r9.getBlock()
            r10.<init>(r11, r12)
            com.android.dx.ssa.SsaBasicBlock r11 = r9.getBlock()
            java.util.ArrayList r11 = r11.getInsns()
            com.android.dx.ssa.SsaMethod r12 = r8.ssaMeth
            r12.onInsnRemoved(r9)
            int r9 = r11.lastIndexOf(r9)
            r11.set(r9, r10)
            com.android.dx.ssa.SsaMethod r9 = r8.ssaMeth
            r9.onInsnAdded(r10)
            return
    }

    private void run() {
            r3 = this;
            com.android.dx.rop.code.TranslationAdvice r0 = com.android.dx.ssa.Optimizer.getAdvice()
            com.android.dx.ssa.SsaMethod r1 = r3.ssaMeth
            com.android.dx.ssa.LiteralOpUpgrader$1 r2 = new com.android.dx.ssa.LiteralOpUpgrader$1
            r2.<init>(r3, r0)
            r1.forEachInsn(r2)
            return
    }

    private boolean tryReplacingWithConstant(com.android.dx.ssa.NormalSsaInsn r7) {
            r6 = this;
            com.android.dx.rop.code.Insn r0 = r7.getOriginalRopInsn()
            com.android.dx.rop.code.Rop r0 = r0.getOpcode()
            com.android.dx.rop.code.RegisterSpec r1 = r7.getResult()
            r2 = 0
            if (r1 == 0) goto L6f
            com.android.dx.ssa.SsaMethod r3 = r6.ssaMeth
            boolean r1 = r3.isRegALocal(r1)
            if (r1 != 0) goto L6f
            int r1 = r0.getOpcode()
            r3 = 5
            if (r1 == r3) goto L6f
            com.android.dx.rop.code.RegisterSpec r1 = r7.getResult()
            com.android.dx.rop.type.TypeBearer r1 = r1.getTypeBearer()
            boolean r4 = r1.isConstant()
            if (r4 == 0) goto L6f
            int r4 = r1.getBasicType()
            r5 = 6
            if (r4 != r5) goto L6f
            com.android.dx.rop.code.RegisterSpecList r4 = com.android.dx.rop.code.RegisterSpecList.EMPTY
            com.android.dx.rop.cst.Constant r1 = (com.android.dx.rop.cst.Constant) r1
            r6.replacePlainInsn(r7, r4, r3, r1)
            int r0 = r0.getOpcode()
            r1 = 56
            r3 = 1
            if (r0 != r1) goto L6e
            com.android.dx.ssa.SsaBasicBlock r7 = r7.getBlock()
            java.util.BitSet r7 = r7.getPredecessors()
            int r7 = r7.nextSetBit(r2)
            com.android.dx.ssa.SsaMethod r0 = r6.ssaMeth
            java.util.ArrayList r0 = r0.getBlocks()
            java.lang.Object r7 = r0.get(r7)
            com.android.dx.ssa.SsaBasicBlock r7 = (com.android.dx.ssa.SsaBasicBlock) r7
            java.util.ArrayList r7 = r7.getInsns()
            int r0 = r7.size()
            int r0 = r0 - r3
            java.lang.Object r7 = r7.get(r0)
            com.android.dx.ssa.NormalSsaInsn r7 = (com.android.dx.ssa.NormalSsaInsn) r7
            r0 = 0
            r6.replacePlainInsn(r7, r4, r5, r0)
        L6e:
            return r3
        L6f:
            return r2
    }
}
