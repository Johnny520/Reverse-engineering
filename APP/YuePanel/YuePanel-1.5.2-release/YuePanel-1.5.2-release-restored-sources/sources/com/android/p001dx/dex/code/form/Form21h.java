package com.android.p001dx.dex.code.form;

import com.android.p001dx.dex.code.CstInsn;
import com.android.p001dx.dex.code.DalvInsn;
import com.android.p001dx.dex.code.InsnFormat;
import com.android.p001dx.rop.code.RegisterSpecList;
import com.android.p001dx.rop.cst.Constant;
import com.android.p001dx.rop.cst.CstLiteralBits;
import com.android.p001dx.util.AnnotatedOutput;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class Form21h extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form21h();

    private Form21h() {
    }

    @Override // com.android.p001dx.dex.code.InsnFormat
    public int codeSize() {
        return 2;
    }

    @Override // com.android.p001dx.dex.code.InsnFormat
    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        BitSet bitSet = new BitSet(1);
        bitSet.set(0, InsnFormat.unsignedFitsInByte(registers.get(0).getReg()));
        return bitSet;
    }

    @Override // com.android.p001dx.dex.code.InsnFormat
    public String insnArgString(DalvInsn dalvInsn) {
        return dalvInsn.getRegisters().get(0).regString() + ", " + InsnFormat.literalBitsString((CstLiteralBits) ((CstInsn) dalvInsn).getConstant());
    }

    @Override // com.android.p001dx.dex.code.InsnFormat
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return InsnFormat.literalBitsComment((CstLiteralBits) ((CstInsn) dalvInsn).getConstant(), dalvInsn.getRegisters().get(0).getCategory() == 1 ? 32 : 64);
    }

    @Override // com.android.p001dx.dex.code.InsnFormat
    public boolean isCompatible(DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        if (!(dalvInsn instanceof CstInsn) || registers.size() != 1 || !InsnFormat.unsignedFitsInByte(registers.get(0).getReg())) {
            return false;
        }
        Constant constant = ((CstInsn) dalvInsn).getConstant();
        if (!(constant instanceof CstLiteralBits)) {
            return false;
        }
        CstLiteralBits cstLiteralBits = (CstLiteralBits) constant;
        return registers.get(0).getCategory() == 1 ? (cstLiteralBits.getIntBits() & 65535) == 0 : (cstLiteralBits.getLongBits() & 281474976710655L) == 0;
    }

    @Override // com.android.p001dx.dex.code.InsnFormat
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        RegisterSpecList registers = dalvInsn.getRegisters();
        CstLiteralBits cstLiteralBits = (CstLiteralBits) ((CstInsn) dalvInsn).getConstant();
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, registers.get(0).getReg()), (short) (registers.get(0).getCategory() == 1 ? cstLiteralBits.getIntBits() >>> 16 : (int) (cstLiteralBits.getLongBits() >>> 48)));
    }
}
