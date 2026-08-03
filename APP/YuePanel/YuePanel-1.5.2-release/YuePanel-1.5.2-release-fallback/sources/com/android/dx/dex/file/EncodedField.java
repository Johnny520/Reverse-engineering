package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class EncodedField extends com.android.dx.dex.file.EncodedMember implements java.lang.Comparable<com.android.dx.dex.file.EncodedField> {
    private final com.android.dx.rop.cst.CstFieldRef field;

    public EncodedField(com.android.dx.rop.cst.CstFieldRef r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            if (r1 == 0) goto L8
            r0.field = r1
            return
        L8:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "field == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void addContents(com.android.dx.dex.file.DexFile r2) {
            r1 = this;
            com.android.dx.dex.file.FieldIdsSection r2 = r2.getFieldIds()
            com.android.dx.rop.cst.CstFieldRef r0 = r1.field
            r2.intern(r0)
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.dex.file.EncodedField r2) {
            r1 = this;
            com.android.dx.rop.cst.CstFieldRef r0 = r1.field
            com.android.dx.rop.cst.CstFieldRef r2 = r2.field
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.file.EncodedField r1) {
            r0 = this;
            com.android.dx.dex.file.EncodedField r1 = (com.android.dx.dex.file.EncodedField) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void debugPrint(java.io.PrintWriter r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = r0.toString()
            r1.println(r2)
            return
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public int encode(com.android.dx.dex.file.DexFile r4, com.android.dx.util.AnnotatedOutput r5, int r6, int r7) {
            r3 = this;
            com.android.dx.dex.file.FieldIdsSection r4 = r4.getFieldIds()
            com.android.dx.rop.cst.CstFieldRef r0 = r3.field
            int r4 = r4.indexOf(r0)
            int r6 = r4 - r6
            int r0 = r3.getAccessFlags()
            boolean r1 = r5.annotates()
            if (r1 == 0) goto L66
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            com.android.dx.rop.cst.CstFieldRef r1 = r3.field
            java.lang.String r1 = r1.toHuman()
            java.lang.Object[] r7 = new java.lang.Object[]{r7, r1}
            java.lang.String r1 = "  [%x] %s"
            java.lang.String r7 = java.lang.String.format(r1, r7)
            r1 = 0
            r5.annotate(r1, r7)
            int r7 = com.android.dex.Leb128.unsignedLeb128Size(r6)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "    field_idx:    "
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5.annotate(r7, r1)
            int r7 = com.android.dex.Leb128.unsignedLeb128Size(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "    access_flags: "
            r1.append(r2)
            java.lang.String r2 = com.android.dx.rop.code.AccessFlags.fieldString(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r5.annotate(r7, r1)
        L66:
            r5.writeUleb128(r6)
            r5.writeUleb128(r0)
            return r4
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.android.dx.dex.file.EncodedField
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.dex.file.EncodedField r3 = (com.android.dx.dex.file.EncodedField) r3
            int r3 = r2.compareTo2(r3)
            if (r3 != 0) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public com.android.dx.rop.cst.CstString getName() {
            r1 = this;
            com.android.dx.rop.cst.CstFieldRef r0 = r1.field
            com.android.dx.rop.cst.CstNat r0 = r0.getNat()
            com.android.dx.rop.cst.CstString r0 = r0.getName()
            return r0
    }

    public com.android.dx.rop.cst.CstFieldRef getRef() {
            r1 = this;
            com.android.dx.rop.cst.CstFieldRef r0 = r1.field
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.cst.CstFieldRef r0 = r1.field
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.cst.CstFieldRef r0 = r1.field
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class<com.android.dx.dex.file.EncodedField> r1 = com.android.dx.dex.file.EncodedField.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r2.getAccessFlags()
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.android.dx.rop.cst.CstFieldRef r1 = r2.field
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
