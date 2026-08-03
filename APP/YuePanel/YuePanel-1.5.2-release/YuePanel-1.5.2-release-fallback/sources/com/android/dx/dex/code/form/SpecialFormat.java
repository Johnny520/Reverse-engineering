package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class SpecialFormat extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.SpecialFormat r0 = new com.android.dx.dex.code.form.SpecialFormat
            r0.<init>()
            com.android.dx.dex.code.form.SpecialFormat.THE_ONE = r0
            return
    }

    private SpecialFormat() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r2) {
            r1 = this;
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r0 = "unsupported"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r1, com.android.dx.dex.code.DalvInsn r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "unsupported"
            r1.<init>(r2)
            throw r1
    }
}
