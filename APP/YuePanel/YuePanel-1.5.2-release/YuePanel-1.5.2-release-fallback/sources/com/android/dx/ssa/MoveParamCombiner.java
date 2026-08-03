package com.android.dx.ssa;

/* JADX INFO: loaded from: classes.dex */
public class MoveParamCombiner {
    private final com.android.dx.ssa.SsaMethod ssaMeth;


    private MoveParamCombiner(com.android.dx.ssa.SsaMethod r1) {
            r0 = this;
            r0.<init>()
            r0.ssaMeth = r1
            return
    }

    public static /* synthetic */ int access$000(com.android.dx.ssa.MoveParamCombiner r0, com.android.dx.ssa.NormalSsaInsn r1) {
            int r0 = r0.getParamIndex(r1)
            return r0
    }

    public static /* synthetic */ com.android.dx.ssa.SsaMethod access$100(com.android.dx.ssa.MoveParamCombiner r0) {
            com.android.dx.ssa.SsaMethod r0 = r0.ssaMeth
            return r0
    }

    private int getParamIndex(com.android.dx.ssa.NormalSsaInsn r1) {
            r0 = this;
            com.android.dx.rop.code.Insn r1 = r1.getOriginalRopInsn()
            com.android.dx.rop.code.CstInsn r1 = (com.android.dx.rop.code.CstInsn) r1
            com.android.dx.rop.cst.Constant r1 = r1.getConstant()
            com.android.dx.rop.cst.CstInteger r1 = (com.android.dx.rop.cst.CstInteger) r1
            int r1 = r1.getValue()
            return r1
    }

    public static void process(com.android.dx.ssa.SsaMethod r1) {
            com.android.dx.ssa.MoveParamCombiner r0 = new com.android.dx.ssa.MoveParamCombiner
            r0.<init>(r1)
            r0.run()
            return
    }

    private void run() {
            r4 = this;
            com.android.dx.ssa.SsaMethod r0 = r4.ssaMeth
            int r0 = r0.getParamWidth()
            com.android.dx.rop.code.RegisterSpec[] r0 = new com.android.dx.rop.code.RegisterSpec[r0]
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.android.dx.ssa.SsaMethod r2 = r4.ssaMeth
            com.android.dx.ssa.MoveParamCombiner$1 r3 = new com.android.dx.ssa.MoveParamCombiner$1
            r3.<init>(r4, r0, r1)
            r2.forEachInsn(r3)
            com.android.dx.ssa.SsaMethod r0 = r4.ssaMeth
            r0.deleteInsns(r1)
            return
    }
}
