package com.android.dx.dex.code;

import bsh.C2632;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.type.Type;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class DalvCode {
    private CatchTable catches;
    private DalvInsnList insns;
    private LocalList locals;
    private final int positionInfo;
    private PositionList positions;
    private CatchBuilder unprocessedCatches;
    private OutputFinisher unprocessedInsns;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface AssignIndicesCallback {
        int getIndex(Constant constant);
    }

    public DalvCode(int i, OutputFinisher outputFinisher, CatchBuilder catchBuilder) {
        if (outputFinisher == null) {
            C2632.m5298("unprocessedInsns == null");
            throw null;
        }
        if (catchBuilder == null) {
            C2632.m5298("unprocessedCatches == null");
            throw null;
        }
        this.positionInfo = i;
        this.unprocessedInsns = outputFinisher;
        this.unprocessedCatches = catchBuilder;
        this.catches = null;
        this.positions = null;
        this.locals = null;
        this.insns = null;
    }

    private void finishProcessingIfNecessary() {
        if (this.insns != null) {
            return;
        }
        DalvInsnList dalvInsnListFinishProcessingAndGetList = this.unprocessedInsns.finishProcessingAndGetList();
        this.insns = dalvInsnListFinishProcessingAndGetList;
        this.positions = PositionList.make(dalvInsnListFinishProcessingAndGetList, this.positionInfo);
        this.locals = LocalList.make(this.insns);
        this.catches = this.unprocessedCatches.build();
        this.unprocessedInsns = null;
        this.unprocessedCatches = null;
    }

    public void assignIndices(AssignIndicesCallback assignIndicesCallback) {
        this.unprocessedInsns.assignIndices(assignIndicesCallback);
    }

    public HashSet<Type> getCatchTypes() {
        return this.unprocessedCatches.getCatchTypes();
    }

    public CatchTable getCatches() {
        finishProcessingIfNecessary();
        return this.catches;
    }

    public HashSet<Constant> getInsnConstants() {
        return this.unprocessedInsns.getAllConstants();
    }

    public DalvInsnList getInsns() {
        finishProcessingIfNecessary();
        return this.insns;
    }

    public LocalList getLocals() {
        finishProcessingIfNecessary();
        return this.locals;
    }

    public PositionList getPositions() {
        finishProcessingIfNecessary();
        return this.positions;
    }

    public boolean hasAnyCatches() {
        return this.unprocessedCatches.hasAnyCatches();
    }

    public boolean hasLocals() {
        return this.unprocessedInsns.hasAnyLocalInfo();
    }

    public boolean hasPositions() {
        return this.positionInfo != 1 && this.unprocessedInsns.hasAnyPositionInfo();
    }
}
