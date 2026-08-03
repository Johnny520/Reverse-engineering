package com.android.dx.dex.code.form;

/* JADX INFO: loaded from: classes.dex */
public final class Form20t extends com.android.dx.dex.code.InsnFormat {
    public static final com.android.dx.dex.code.InsnFormat THE_ONE = null;

    static {
            com.android.dx.dex.code.form.Form20t r0 = new com.android.dx.dex.code.form.Form20t
            r0.<init>()
            com.android.dx.dex.code.form.Form20t.THE_ONE = r0
            return
    }

    private Form20t() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean branchFits(com.android.dx.dex.code.TargetInsn r1) {
            r0 = this;
            int r1 = r1.getTargetOffset()
            if (r1 == 0) goto Le
            boolean r1 = com.android.dx.dex.code.InsnFormat.signedFitsInShort(r1)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public int codeSize() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnArgString(com.android.dx.dex.code.DalvInsn r1) {
            r0 = this;
            java.lang.String r1 = com.android.dx.dex.code.InsnFormat.branchString(r1)
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public java.lang.String insnCommentString(com.android.dx.dex.code.DalvInsn r1, boolean r2) {
            r0 = this;
            java.lang.String r1 = com.android.dx.dex.code.InsnFormat.branchComment(r1)
            return r1
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public boolean isCompatible(com.android.dx.dex.code.DalvInsn r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.dex.code.TargetInsn
            if (r0 == 0) goto L1e
            com.android.dx.rop.code.RegisterSpecList r0 = r2.getRegisters()
            int r0 = r0.size()
            if (r0 == 0) goto Lf
            goto L1e
        Lf:
            com.android.dx.dex.code.TargetInsn r2 = (com.android.dx.dex.code.TargetInsn) r2
            boolean r0 = r2.hasTargetOffset()
            if (r0 == 0) goto L1c
            boolean r2 = r1.branchFits(r2)
            goto L1d
        L1c:
            r2 = 1
        L1d:
            return r2
        L1e:
            r2 = 0
            return r2
    }

    @Override // com.android.dx.dex.code.InsnFormat
    public void writeTo(com.android.dx.util.AnnotatedOutput r3, com.android.dx.dex.code.DalvInsn r4) {
            r2 = this;
            r0 = r4
            com.android.dx.dex.code.TargetInsn r0 = (com.android.dx.dex.code.TargetInsn) r0
            int r0 = r0.getTargetOffset()
            r1 = 0
            short r4 = com.android.dx.dex.code.InsnFormat.opcodeUnit(r4, r1)
            short r0 = (short) r0
            com.android.dx.dex.code.InsnFormat.write(r3, r4, r0)
            return
    }
}
