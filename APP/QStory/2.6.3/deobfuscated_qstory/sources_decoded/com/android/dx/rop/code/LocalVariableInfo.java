package com.android.dx.rop.code;

import bsh.C2633;
import com.android.dx.util.MutabilityControl;
import java.util.HashMap;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class LocalVariableInfo extends MutabilityControl {
    private final RegisterSpecSet[] blockStarts;
    private final RegisterSpecSet emptySet;
    private final HashMap<Insn, RegisterSpec> insnAssignments;
    private final int regCount;

    public LocalVariableInfo(RopMethod ropMethod) {
        if (ropMethod == null) {
            C2633.m5343("method == null");
            throw null;
        }
        BasicBlockList blocks = ropMethod.getBlocks();
        int maxLabel = blocks.getMaxLabel();
        int regCount = blocks.getRegCount();
        this.regCount = regCount;
        RegisterSpecSet registerSpecSet = new RegisterSpecSet(regCount);
        this.emptySet = registerSpecSet;
        this.blockStarts = new RegisterSpecSet[maxLabel];
        this.insnAssignments = new HashMap<>(blocks.getInstructionCount());
        registerSpecSet.setImmutable();
    }

    private RegisterSpecSet getStarts0(int i) {
        try {
            return this.blockStarts[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C5925.m11310("bogus label");
            return null;
        }
    }

    public void addAssignment(Insn insn, RegisterSpec registerSpec) {
        throwIfImmutable();
        if (insn == null) {
            C2633.m5343("insn == null");
        } else if (registerSpec != null) {
            this.insnAssignments.put(insn, registerSpec);
        } else {
            C2633.m5343("spec == null");
        }
    }

    public void debugDump() {
        int i = 0;
        while (true) {
            RegisterSpecSet[] registerSpecSetArr = this.blockStarts;
            if (i >= registerSpecSetArr.length) {
                return;
            }
            RegisterSpecSet registerSpecSet = registerSpecSetArr[i];
            if (registerSpecSet != null) {
                if (registerSpecSet == this.emptySet) {
                    System.out.printf("%04x: empty set\n", Integer.valueOf(i));
                } else {
                    System.out.printf("%04x: %s\n", Integer.valueOf(i), this.blockStarts[i]);
                }
            }
            i++;
        }
    }

    public RegisterSpec getAssignment(Insn insn) {
        return this.insnAssignments.get(insn);
    }

    public int getAssignmentCount() {
        return this.insnAssignments.size();
    }

    public RegisterSpecSet getStarts(int i) {
        RegisterSpecSet starts0 = getStarts0(i);
        return starts0 != null ? starts0 : this.emptySet;
    }

    public boolean mergeStarts(int i, RegisterSpecSet registerSpecSet) {
        RegisterSpecSet starts0 = getStarts0(i);
        if (starts0 == null) {
            setStarts(i, registerSpecSet);
            return true;
        }
        RegisterSpecSet registerSpecSetMutableCopy = starts0.mutableCopy();
        if (starts0.size() != 0) {
            registerSpecSetMutableCopy.intersect(registerSpecSet, true);
        } else {
            registerSpecSetMutableCopy = registerSpecSet.mutableCopy();
        }
        if (starts0.equals(registerSpecSetMutableCopy)) {
            return false;
        }
        registerSpecSetMutableCopy.setImmutable();
        setStarts(i, registerSpecSetMutableCopy);
        return true;
    }

    public RegisterSpecSet mutableCopyOfStarts(int i) {
        RegisterSpecSet starts0 = getStarts0(i);
        return starts0 != null ? starts0.mutableCopy() : new RegisterSpecSet(this.regCount);
    }

    public void setStarts(int i, RegisterSpecSet registerSpecSet) {
        throwIfImmutable();
        if (registerSpecSet == null) {
            C2633.m5343("specs == null");
            return;
        }
        try {
            this.blockStarts[i] = registerSpecSet;
        } catch (ArrayIndexOutOfBoundsException unused) {
            C5925.m11310("bogus label");
        }
    }

    public RegisterSpecSet getStarts(BasicBlock basicBlock) {
        return getStarts(basicBlock.getLabel());
    }
}
