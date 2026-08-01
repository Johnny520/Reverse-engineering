package com.android.p002dx.dex.code.form;

import com.android.p002dx.dex.code.DalvInsn;
import com.android.p002dx.dex.code.InsnFormat;
import com.android.p002dx.dex.code.SimpleInsn;
import com.android.p002dx.rop.code.RegisterSpec;
import com.android.p002dx.rop.code.RegisterSpecList;
import com.android.p002dx.util.AnnotatedOutput;
import java.util.BitSet;
import lin.xposed.hook.javaplugin.C6385;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Form12x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form12x();

    private Form12x() {
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public int codeSize() {
        return 1;
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(2);
        int reg = registers.get(0).getReg();
        int reg2 = registers.get(1).getReg();
        int size = registers.size();
        if (size == 2) {
            bitSet.set(0, InsnFormat.unsignedFitsInNibble(reg));
            bitSet.set(1, InsnFormat.unsignedFitsInNibble(reg2));
            return bitSet;
        }
        if (size != 3) {
            C6385.m11429();
            return null;
        }
        if (reg != reg2) {
            bitSet.set(0, false);
            bitSet.set(1, false);
        } else {
            boolean zUnsignedFitsInNibble = InsnFormat.unsignedFitsInNibble(reg2);
            bitSet.set(0, zUnsignedFitsInNibble);
            bitSet.set(1, zUnsignedFitsInNibble);
        }
        bitSet.set(2, InsnFormat.unsignedFitsInNibble(registers.get(2).getReg()));
        return bitSet;
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public String insnArgString(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        return registers.get(size - 2).regString() + ", " + registers.get(size - 1).regString();
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return "";
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpec registerSpec;
        RegisterSpec registerSpec2;
        if (!(dalvInsn instanceof SimpleInsn)) {
            return false;
        }
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        if (size == 2) {
            registerSpec = registers.get(0);
            registerSpec2 = registers.get(1);
        } else {
            if (size != 3) {
                return false;
            }
            registerSpec = registers.get(1);
            registerSpec2 = registers.get(2);
            if (registerSpec.getReg() != registers.get(0).getReg()) {
                return false;
            }
        }
        return InsnFormat.unsignedFitsInNibble(registerSpec.getReg()) && InsnFormat.unsignedFitsInNibble(registerSpec2.getReg());
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        int size = registers.size();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, InsnFormat.makeByte(registers.get(size - 2).getReg(), registers.get(size - 1).getReg())));
    }
}
