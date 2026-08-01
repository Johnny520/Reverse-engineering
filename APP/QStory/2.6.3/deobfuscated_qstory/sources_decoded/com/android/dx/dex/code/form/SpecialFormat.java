package com.android.dx.dex.code.form;

import com.android.dx.dex.code.DalvInsn;
import com.android.dx.dex.code.InsnFormat;
import com.android.dx.util.AnnotatedOutput;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class SpecialFormat extends InsnFormat {
    public static final InsnFormat THE_ONE = new SpecialFormat();

    private SpecialFormat() {
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
        throw new RuntimeException("unsupported");
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public String insnArgString(DalvInsn dalvInsn) {
        throw new RuntimeException("unsupported");
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public String insnCommentString(DalvInsn dalvInsn, boolean z) {
        throw new RuntimeException("unsupported");
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(DalvInsn dalvInsn) {
        return true;
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn) {
        throw new RuntimeException("unsupported");
    }
}
