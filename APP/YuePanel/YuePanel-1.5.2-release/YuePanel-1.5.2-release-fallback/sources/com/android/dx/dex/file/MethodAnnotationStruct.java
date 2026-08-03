package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class MethodAnnotationStruct implements com.android.dx.util.ToHuman, java.lang.Comparable<com.android.dx.dex.file.MethodAnnotationStruct> {
    private com.android.dx.dex.file.AnnotationSetItem annotations;
    private final com.android.dx.rop.cst.CstMethodRef method;

    public MethodAnnotationStruct(com.android.dx.rop.cst.CstMethodRef r1, com.android.dx.dex.file.AnnotationSetItem r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.method = r1
            r0.annotations = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "annotations == null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "method == null"
            r1.<init>(r2)
            throw r1
    }

    public void addContents(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            com.android.dx.dex.file.MethodIdsSection r0 = r3.getMethodIds()
            com.android.dx.dex.file.MixedItemSection r3 = r3.getWordData()
            com.android.dx.rop.cst.CstMethodRef r1 = r2.method
            r0.intern(r1)
            com.android.dx.dex.file.AnnotationSetItem r0 = r2.annotations
            com.android.dx.dex.file.OffsettedItem r3 = r3.intern(r0)
            com.android.dx.dex.file.AnnotationSetItem r3 = (com.android.dx.dex.file.AnnotationSetItem) r3
            r2.annotations = r3
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.dex.file.MethodAnnotationStruct r2) {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            com.android.dx.rop.cst.CstMethodRef r2 = r2.method
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.file.MethodAnnotationStruct r1) {
            r0 = this;
            com.android.dx.dex.file.MethodAnnotationStruct r1 = (com.android.dx.dex.file.MethodAnnotationStruct) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.dex.file.MethodAnnotationStruct
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            com.android.dx.dex.file.MethodAnnotationStruct r2 = (com.android.dx.dex.file.MethodAnnotationStruct) r2
            com.android.dx.rop.cst.CstMethodRef r2 = r2.method
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.android.dx.rop.annotation.Annotations getAnnotations() {
            r1 = this;
            com.android.dx.dex.file.AnnotationSetItem r0 = r1.annotations
            com.android.dx.rop.annotation.Annotations r0 = r0.getAnnotations()
            return r0
    }

    public com.android.dx.rop.cst.CstMethodRef getMethod() {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.cst.CstMethodRef r1 = r2.method
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            com.android.dx.dex.file.AnnotationSetItem r1 = r2.annotations
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeTo(com.android.dx.dex.file.DexFile r5, com.android.dx.util.AnnotatedOutput r6) {
            r4 = this;
            com.android.dx.dex.file.MethodIdsSection r5 = r5.getMethodIds()
            com.android.dx.rop.cst.CstMethodRef r0 = r4.method
            int r5 = r5.indexOf(r0)
            com.android.dx.dex.file.AnnotationSetItem r0 = r4.annotations
            int r0 = r0.getAbsoluteOffset()
            boolean r1 = r6.annotates()
            if (r1 == 0) goto L62
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "    "
            r1.append(r2)
            com.android.dx.rop.cst.CstMethodRef r2 = r4.method
            java.lang.String r2 = r2.toHuman()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r6.annotate(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "      method_idx:      "
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u4(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 4
            r6.annotate(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "      annotations_off: "
            r1.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r6.annotate(r2, r1)
        L62:
            r6.writeInt(r5)
            r6.writeInt(r0)
            return
    }
}
