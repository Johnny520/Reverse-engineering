package com.android.p002dx.dex.code.form;

import com.android.p002dx.dex.code.DalvInsn;
import com.android.p002dx.dex.code.InsnFormat;
import com.android.p002dx.dex.code.SimpleInsn;
import com.android.p002dx.util.AnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class Form10x extends InsnFormat {
    public static final InsnFormat THE_ONE = new Form10x();

    private Form10x() {
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public int codeSize() {
        return 1;
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public String insnArgString(DalvInsn dalvInsn) {
        return "";
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        return "";
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public boolean isCompatible(DalvInsn dalvInsn) {
        return (dalvInsn instanceof SimpleInsn) && dalvInsn.getRegisters().size() == 0;
    }

    @Override // com.android.p002dx.dex.code.InsnFormat
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        InsnFormat.write(annotatedOutput, InsnFormat.opcodeUnit(dalvInsn, 0));
    }
}
