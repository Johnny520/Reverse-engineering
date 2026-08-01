package com.android.dx.dex.code;

import bsh.C2633;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.type.Type;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DalvCode {
    private CatchTable catches;
    private DalvInsnList insns;
    private LocalList locals;
    private final int positionInfo;
    private PositionList positions;
    private CatchBuilder unprocessedCatches;
    private OutputFinisher unprocessedInsns;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface AssignIndicesCallback {
        int getIndex(Constant constant);
    }

    public DalvCode(int i, OutputFinisher outputFinisher, CatchBuilder catchBuilder) {
        if (outputFinisher == null) {
            C2633.m5343("unprocessedInsns == null");
            throw null;
        }
        if (catchBuilder == null) {
            C2633.m5343("unprocessedCatches == null");
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
