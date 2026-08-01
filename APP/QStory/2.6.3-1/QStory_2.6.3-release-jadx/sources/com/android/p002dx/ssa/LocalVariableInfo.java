package com.android.p002dx.ssa;

import bsh.C3466;
import com.android.p002dx.rop.code.RegisterSpec;
import com.android.p002dx.rop.code.RegisterSpecSet;
import com.android.p002dx.util.MutabilityControl;
import java.util.ArrayList;
import java.util.HashMap;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class LocalVariableInfo extends MutabilityControl {
    private final RegisterSpecSet[] blockStarts;
    private final RegisterSpecSet emptySet;
    private final HashMap<SsaInsn, RegisterSpec> insnAssignments;
    private final int regCount;

    public LocalVariableInfo(SsaMethod ssaMethod) {
        if (ssaMethod == null) {
            C3466.m5903("method == null");
            throw null;
        }
        ArrayList<SsaBasicBlock> blocks = ssaMethod.getBlocks();
        int regCount = ssaMethod.getRegCount();
        this.regCount = regCount;
        RegisterSpecSet registerSpecSet = new RegisterSpecSet(regCount);
        this.emptySet = registerSpecSet;
        this.blockStarts = new RegisterSpecSet[blocks.size()];
        this.insnAssignments = new HashMap<>();
        registerSpecSet.setImmutable();
    }

    private RegisterSpecSet getStarts0(int i) {
        try {
            return this.blockStarts[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            C6755.m11869("bogus index");
            return null;
        }
    }

    public void addAssignment(SsaInsn ssaInsn, RegisterSpec registerSpec) {
        throwIfImmutable();
        if (ssaInsn == null) {
            C3466.m5903("insn == null");
        } else if (registerSpec != null) {
            this.insnAssignments.put(ssaInsn, registerSpec);
        } else {
            C3466.m5903("spec == null");
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

    public RegisterSpec getAssignment(SsaInsn ssaInsn) {
        return this.insnAssignments.get(ssaInsn);
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
        registerSpecSetMutableCopy.intersect(registerSpecSet, true);
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
            C3466.m5903("specs == null");
            return;
        }
        try {
            this.blockStarts[i] = registerSpecSet;
        } catch (ArrayIndexOutOfBoundsException unused) {
            C6755.m11869("bogus index");
        }
    }

    public RegisterSpecSet getStarts(SsaBasicBlock ssaBasicBlock) {
        return getStarts(ssaBasicBlock.getIndex());
    }
}
