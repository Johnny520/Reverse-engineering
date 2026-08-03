package com.android.dx.dex.code;

/* JADX INFO: loaded from: classes.dex */
public final class DalvCode {
    private com.android.dx.dex.code.CatchTable catches;
    private com.android.dx.dex.code.DalvInsnList insns;
    private com.android.dx.dex.code.LocalList locals;
    private final int positionInfo;
    private com.android.dx.dex.code.PositionList positions;
    private com.android.dx.dex.code.CatchBuilder unprocessedCatches;
    private com.android.dx.dex.code.OutputFinisher unprocessedInsns;

    public interface AssignIndicesCallback {
        int getIndex(com.android.dx.rop.cst.Constant r1);
    }

    public DalvCode(int r1, com.android.dx.dex.code.OutputFinisher r2, com.android.dx.dex.code.CatchBuilder r3) {
            r0 = this;
            r0.<init>()
            if (r2 == 0) goto L1f
            if (r3 == 0) goto L17
            r0.positionInfo = r1
            r0.unprocessedInsns = r2
            r0.unprocessedCatches = r3
            r1 = 0
            r0.catches = r1
            r0.positions = r1
            r0.locals = r1
            r0.insns = r1
            return
        L17:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "unprocessedCatches == null"
            r1.<init>(r2)
            throw r1
        L1f:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "unprocessedInsns == null"
            r1.<init>(r2)
            throw r1
    }

    private void finishProcessingIfNecessary() {
            r2 = this;
            com.android.dx.dex.code.DalvInsnList r0 = r2.insns
            if (r0 == 0) goto L5
            return
        L5:
            com.android.dx.dex.code.OutputFinisher r0 = r2.unprocessedInsns
            com.android.dx.dex.code.DalvInsnList r0 = r0.finishProcessingAndGetList()
            r2.insns = r0
            int r1 = r2.positionInfo
            com.android.dx.dex.code.PositionList r0 = com.android.dx.dex.code.PositionList.make(r0, r1)
            r2.positions = r0
            com.android.dx.dex.code.DalvInsnList r0 = r2.insns
            com.android.dx.dex.code.LocalList r0 = com.android.dx.dex.code.LocalList.make(r0)
            r2.locals = r0
            com.android.dx.dex.code.CatchBuilder r0 = r2.unprocessedCatches
            com.android.dx.dex.code.CatchTable r0 = r0.build()
            r2.catches = r0
            r0 = 0
            r2.unprocessedInsns = r0
            r2.unprocessedCatches = r0
            return
    }

    public void assignIndices(com.android.dx.dex.code.DalvCode.AssignIndicesCallback r2) {
            r1 = this;
            com.android.dx.dex.code.OutputFinisher r0 = r1.unprocessedInsns
            r0.assignIndices(r2)
            return
    }

    public java.util.HashSet<com.android.dx.rop.type.Type> getCatchTypes() {
            r1 = this;
            com.android.dx.dex.code.CatchBuilder r0 = r1.unprocessedCatches
            java.util.HashSet r0 = r0.getCatchTypes()
            return r0
    }

    public com.android.dx.dex.code.CatchTable getCatches() {
            r1 = this;
            r1.finishProcessingIfNecessary()
            com.android.dx.dex.code.CatchTable r0 = r1.catches
            return r0
    }

    public java.util.HashSet<com.android.dx.rop.cst.Constant> getInsnConstants() {
            r1 = this;
            com.android.dx.dex.code.OutputFinisher r0 = r1.unprocessedInsns
            java.util.HashSet r0 = r0.getAllConstants()
            return r0
    }

    public com.android.dx.dex.code.DalvInsnList getInsns() {
            r1 = this;
            r1.finishProcessingIfNecessary()
            com.android.dx.dex.code.DalvInsnList r0 = r1.insns
            return r0
    }

    public com.android.dx.dex.code.LocalList getLocals() {
            r1 = this;
            r1.finishProcessingIfNecessary()
            com.android.dx.dex.code.LocalList r0 = r1.locals
            return r0
    }

    public com.android.dx.dex.code.PositionList getPositions() {
            r1 = this;
            r1.finishProcessingIfNecessary()
            com.android.dx.dex.code.PositionList r0 = r1.positions
            return r0
    }

    public boolean hasAnyCatches() {
            r1 = this;
            com.android.dx.dex.code.CatchBuilder r0 = r1.unprocessedCatches
            boolean r0 = r0.hasAnyCatches()
            return r0
    }

    public boolean hasLocals() {
            r1 = this;
            com.android.dx.dex.code.OutputFinisher r0 = r1.unprocessedInsns
            boolean r0 = r0.hasAnyLocalInfo()
            return r0
    }

    public boolean hasPositions() {
            r2 = this;
            int r0 = r2.positionInfo
            r1 = 1
            if (r0 == r1) goto Le
            com.android.dx.dex.code.OutputFinisher r0 = r2.unprocessedInsns
            boolean r0 = r0.hasAnyPositionInfo()
            if (r0 == 0) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }
}
