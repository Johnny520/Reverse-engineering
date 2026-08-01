package com.android.dx.ssa;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.util.IntList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class BasicRegisterMapper extends RegisterMapper {
    private final IntList oldToNew;
    private int runningCountNewRegisters;

    public BasicRegisterMapper(int i) {
        this.oldToNew = new IntList(i);
    }

    public void addMapping(int i, int i2, int i3) {
        if (i >= this.oldToNew.size()) {
            for (int size = i - this.oldToNew.size(); size >= 0; size--) {
                this.oldToNew.add(-1);
            }
        }
        this.oldToNew.set(i, i2);
        int i4 = i2 + i3;
        if (this.runningCountNewRegisters < i4) {
            this.runningCountNewRegisters = i4;
        }
    }

    @Override // com.android.dx.ssa.RegisterMapper
    public int getNewRegisterCount() {
        return this.runningCountNewRegisters;
    }

    @Override // com.android.dx.ssa.RegisterMapper
    public RegisterSpec map(RegisterSpec registerSpec) {
        int i;
        if (registerSpec == null) {
            return null;
        }
        try {
            i = this.oldToNew.get(registerSpec.getReg());
        } catch (IndexOutOfBoundsException unused) {
            i = -1;
        }
        if (i >= 0) {
            return registerSpec.withReg(i);
        }
        C2633.m5339("no mapping specified for register");
        return null;
    }

    public int oldToNew(int i) {
        if (i >= this.oldToNew.size()) {
            return -1;
        }
        return this.oldToNew.get(i);
    }

    public String toHuman() {
        StringBuilder sb = new StringBuilder("Old\tNew\n");
        int size = this.oldToNew.size();
        for (int i = 0; i < size; i++) {
            sb.append(i);
            sb.append('\t');
            sb.append(this.oldToNew.get(i));
            sb.append('\n');
        }
        sb.append("new reg count:");
        return AbstractC0053.m156(sb, this.runningCountNewRegisters, '\n');
    }
}
