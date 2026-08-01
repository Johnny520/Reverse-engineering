package com.android.p002dx.rop.code;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import com.android.p002dx.rop.type.TypeList;
import com.android.p002dx.util.Hex;
import com.android.p002dx.util.IntList;
import com.android.p002dx.util.LabeledItem;
import top.suzhelan.qstory.hook.item.C6755;

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
            C6755.m11869("label < 0");
            throw null;
        }
        try {
            insnList.throwIfMutable();
            int size = insnList.size();
            if (size == 0) {
                C6755.m11869("insns.size() == 0");
                throw null;
            }
            for (int i3 = size - 2; i3 >= 0; i3--) {
                if (insnList.get(i3).getOpcode().getBranchingness() != 1) {
                    C6755.m11869(AbstractC0900.m722(i3, "insns[", "] is a branch or can throw"));
                    throw null;
                }
            }
            if (insnList.get(size - 1).getOpcode().getBranchingness() == 1) {
                C6755.m11869("insns does not end with a branch or throwing instruction");
                throw null;
            }
            try {
                intList.throwIfMutable();
                if (i2 < -1) {
                    C6755.m11869("primarySuccessor < -1");
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
                C3466.m5903("successors == null");
                throw null;
            }
        } catch (NullPointerException unused2) {
            C3466.m5903("insns == null");
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

    @Override // com.android.p002dx.util.LabeledItem
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
        C6755.m11867("block doesn't have exactly two successors");
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
        return "{" + Hex.m28u2(this.label) + '}';
    }

    public BasicBlock withRegisterOffset(int i) {
        return new BasicBlock(this.label, this.insns.withRegisterOffset(i), this.successors, this.primarySuccessor);
    }
}
