package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form10x extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form10x r0 = new com.android.dx.dex.code.form.Form10x
            r0.<init>()
            com.android.dx.dex.code.form.Form10x.THE_ONE = r0
            return
    }

    private Form10x() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r1) {
            r0 = this;
            java.lang.String r1 = ""
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2) {
            r0 = this;
            java.lang.String r1 = ""
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.dex.code.SimpleInsn
            if (r0 == 0) goto L10
            com.android.dx.rop.code.RegisterSpecList r2 = r2.getRegisters()
            int r2 = r2.size()
            if (r2 != 0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r2, com.android.dx.dex.code.DalvInsn r3) {
            r1 = this;
            r0 = 0
            short r3 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r3, r0)
            com.android.dx.dex.code.InsnFormat.write(r2, r3)
            return
    }
}
