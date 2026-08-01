package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.util.AnnotatedOutput;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class HighRegisterPrefix extends VariableSizeInsn {
    private SimpleInsn[] insns;

    public HighRegisterPrefix(SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        super(sourcePosition, registerSpecList);
        if (registerSpecList.size() != 0) {
            this.insns = null;
        } else {
            C5919.m11249("registers.size() == 0");
            throw null;
        }
    }

    private void calculateInsnsIfNecessary() {
        if (this.insns != null) {
            return;
        }
        RegisterSpecList registers = getRegisters();
        int size = registers.size();
        this.insns = new SimpleInsn[size];
        int category = 0;
        for (int i = 0; i < size; i++) {
            RegisterSpec registerSpec = registers.get(i);
            this.insns[i] = moveInsnFor(registerSpec, category);
            category += registerSpec.getCategory();
        }
    }

    private static SimpleInsn moveInsnFor(RegisterSpec registerSpec, int i) {
        return DalvInsn.makeMove(SourcePosition.NO_INFO, RegisterSpec.make(i, registerSpec.getType()), registerSpec);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String argString() {
        return null;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public int codeSize() {
        calculateInsnsIfNecessary();
        int iCodeSize = 0;
        for (SimpleInsn simpleInsn : this.insns) {
            iCodeSize += simpleInsn.codeSize();
        }
        return iCodeSize;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String listingString0(boolean z) {
        RegisterSpecList registers = getRegisters();
        int size = registers.size();
        StringBuilder sb = new StringBuilder(100);
        int category = 0;
        for (int i = 0; i < size; i++) {
            RegisterSpec registerSpec = registers.get(i);
            SimpleInsn simpleInsnMoveInsnFor = moveInsnFor(registerSpec, category);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(simpleInsnMoveInsnFor.listingString0(z));
            category += registerSpec.getCategory();
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new HighRegisterPrefix(getPosition(), registerSpecList);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public void writeTo(AnnotatedOutput annotatedOutput) {
        calculateInsnsIfNecessary();
        for (SimpleInsn simpleInsn : this.insns) {
            simpleInsn.writeTo(annotatedOutput);
        }
    }
}
