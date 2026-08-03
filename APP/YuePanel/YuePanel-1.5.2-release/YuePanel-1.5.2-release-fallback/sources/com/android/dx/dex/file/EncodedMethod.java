package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class EncodedMethod extends com.android.dx.dex.file.EncodedMember implements java.lang.Comparable<com.android.dx.dex.file.EncodedMethod> {
    private final com.android.dx.dex.file.CodeItem code;
    private final com.android.dx.rop.cst.CstMethodRef method;

    public EncodedMethod(com.android.dx.rop.cst.CstMethodRef r2, int r3, com.android.dx.dex.code.DalvCode r4, com.android.dx.rop.type.TypeList r5) {
            r1 = this;
            r1.<init>(r3)
            if (r2 == 0) goto L1c
            r1.method = r2
            if (r4 != 0) goto Ld
            r2 = 0
            r1.code = r2
            goto L1b
        Ld:
            r3 = r3 & 8
            if (r3 == 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            com.android.dx.dex.file.CodeItem r0 = new com.android.dx.dex.file.CodeItem
            r0.<init>(r2, r4, r3, r5)
            r1.code = r0
        L1b:
            return
        L1c:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "method == null"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void addContents(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            com.android.dx.dex.file.MethodIdsSection r0 = r3.getMethodIds()
            com.android.dx.dex.file.MixedItemSection r3 = r3.getWordData()
            com.android.dx.rop.cst.CstMethodRef r1 = r2.method
            r0.intern(r1)
            com.android.dx.dex.file.CodeItem r0 = r2.code
            if (r0 == 0) goto L14
            r3.add(r0)
        L14:
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.dex.file.EncodedMethod r2) {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            com.android.dx.rop.cst.CstMethodRef r2 = r2.method
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.file.EncodedMethod r1) {
            r0 = this;
            com.android.dx.dex.file.EncodedMethod r1 = (com.android.dx.dex.file.EncodedMethod) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public void debugPrint(java.io.PrintWriter r3, boolean r4) {
            r2 = this;
            com.android.dx.dex.file.CodeItem r0 = r2.code
            if (r0 != 0) goto L21
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.android.dx.rop.cst.CstMethodRef r0 = r2.getRef()
            java.lang.String r0 = r0.toHuman()
            r4.append(r0)
            java.lang.String r0 = ": abstract or native"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.println(r4)
            goto L26
        L21:
            java.lang.String r1 = "  "
            r0.debugPrint(r3, r1, r4)
        L26:
            return
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public int encode(com.android.dx.dex.file.DexFile r7, com.android.dx.util.AnnotatedOutput r8, int r9, int r10) {
            r6 = this;
            com.android.dx.dex.file.MethodIdsSection r7 = r7.getMethodIds()
            com.android.dx.rop.cst.CstMethodRef r0 = r6.method
            int r7 = r7.indexOf(r0)
            int r9 = r7 - r9
            int r0 = r6.getAccessFlags()
            com.android.dx.dex.file.CodeItem r1 = r6.code
            int r1 = com.android.dx.dex.file.OffsettedItem.getAbsoluteOffsetOr0(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1c
            r4 = r2
            goto L1d
        L1c:
            r4 = r3
        L1d:
            r5 = r0 & 1280(0x500, float:1.794E-42)
            if (r5 != 0) goto L22
            goto L23
        L22:
            r2 = r3
        L23:
            if (r4 != r2) goto La0
            boolean r2 = r8.annotates()
            if (r2 == 0) goto L96
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            com.android.dx.rop.cst.CstMethodRef r2 = r6.method
            java.lang.String r2 = r2.toHuman()
            java.lang.Object[] r10 = new java.lang.Object[]{r10, r2}
            java.lang.String r2 = "  [%x] %s"
            java.lang.String r10 = java.lang.String.format(r2, r10)
            r8.annotate(r3, r10)
            int r10 = com.android.dex.Leb128.unsignedLeb128Size(r9)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "    method_idx:   "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r7)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r8.annotate(r10, r2)
            int r10 = com.android.dex.Leb128.unsignedLeb128Size(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "    access_flags: "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.rop.code.AccessFlags.methodString(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r8.annotate(r10, r2)
            int r10 = com.android.dex.Leb128.unsignedLeb128Size(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "    code_off:     "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r8.annotate(r10, r2)
        L96:
            r8.writeUleb128(r9)
            r8.writeUleb128(r0)
            r8.writeUleb128(r1)
            return r7
        La0:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.String r8 = "code vs. access_flags mismatch"
            r7.<init>(r8)
            throw r7
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.android.dx.dex.file.EncodedMethod
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.android.dx.dex.file.EncodedMethod r3 = (com.android.dx.dex.file.EncodedMethod) r3
            int r3 = r2.compareTo2(r3)
            if (r3 != 0) goto Lf
            r1 = 1
        Lf:
            return r1
    }

    @Override // com.android.dx.dex.file.EncodedMember
    public final com.android.dx.rop.cst.CstString getName() {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            com.android.dx.rop.cst.CstNat r0 = r0.getNat()
            com.android.dx.rop.cst.CstString r0 = r0.getName()
            return r0
    }

    public final com.android.dx.rop.cst.CstMethodRef getRef() {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public final java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            java.lang.String r0 = r0.toHuman()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 100
            r0.<init>(r1)
            java.lang.Class<com.android.dx.dex.file.EncodedMethod> r1 = com.android.dx.dex.file.EncodedMethod.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            int r1 = r3.getAccessFlags()
            java.lang.String r1 = com.android.dx.util.Hex.u2(r1)
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            com.android.dx.rop.cst.CstMethodRef r2 = r3.method
            r0.append(r2)
            com.android.dx.dex.file.CodeItem r2 = r3.code
            if (r2 == 0) goto L36
            r0.append(r1)
            com.android.dx.dex.file.CodeItem r1 = r3.code
            r0.append(r1)
        L36:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
