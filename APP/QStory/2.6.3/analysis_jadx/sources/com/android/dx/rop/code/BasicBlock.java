package com.android.dx.rop.code;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.Hex;
import com.android.dx.util.IntList;
import com.android.dx.util.LabeledItem;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class BasicBlock implements LabeledItem {
    private final InsnList insns;
    private final int label;
    private final int primarySuccessor;
    private final IntList successors;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface Visitor {
        void visitBlock(BasicBlock basicBlock);
    }

    public BasicBlock(int i, InsnList insnList, IntList intList, int i2) {
        if (i < 0) {
            C5925.m11310("label < 0");
            throw null;
        }
        try {
            insnList.throwIfMutable();
            int size = insnList.size();
            if (size == 0) {
                C5925.m11310("insns.size() == 0");
                throw null;
            }
            for (int i3 = size - 2; i3 >= 0; i3--) {
                if (insnList.get(i3).getOpcode().getBranchingness() != 1) {
                    C5925.m11310(AbstractC0053.m162(i3, "insns[", "] is a branch or can throw"));
                    throw null;
                }
            }
            if (insnList.get(size - 1).getOpcode().getBranchingness() == 1) {
                C5925.m11310("insns does not end with a branch or throwing instruction");
                throw null;
            }
            try {
                intList.throwIfMutable();
                if (i2 < -1) {
                    C5925.m11310("primarySuccessor < -1");
                    throw null;
                }
                if (i2 < 0 || intList.contains(i2)) {
                    this.label = i;
                    this.insns = insnList;
                    this.successors = intList;
                    this.primarySuccessor = i2;
                    return;
                }
                throw new IllegalArgumentException("primarySuccessor " + i2 + " not in successors " + intList);
            } catch (NullPointerException unused) {
                C2633.m5343("successors == null");
                throw null;
            }
        } catch (NullPointerException unused2) {
            C2633.m5343("insns == null");
            throw null;
        }
    }

    public boolean canThrow() {
        return this.insns.getLast().canThrow();
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public TypeList getExceptionHandlerTypes() {
        return this.insns.getLast().getCatches();
    }

    public Insn getFirstInsn() {
        return this.insns.get(0);
    }

    public InsnList getInsns() {
        return this.insns;
    }

    @Override // com.android.dx.util.LabeledItem
    public int getLabel() {
        return this.label;
    }

    public Insn getLastInsn() {
        return this.insns.getLast();
    }

    public int getPrimarySuccessor() {
        return this.primarySuccessor;
    }

    public int getSecondarySuccessor() {
        if (this.successors.size() == 2) {
            int i = this.successors.get(0);
            return i == this.primarySuccessor ? this.successors.get(1) : i;
        }
        C5925.m11308("block doesn't have exactly two successors");
        return 0;
    }

    public IntList getSuccessors() {
        return this.successors;
    }

    public boolean hasExceptionHandlers() {
        return this.insns.getLast().getCatches().size() != 0;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    public String toString() {
        return "{" + Hex.u2(this.label) + '}';
    }

    public BasicBlock withRegisterOffset(int i) {
        return new BasicBlock(this.label, this.insns.withRegisterOffset(i), this.successors, this.primarySuccessor);
    }
}
