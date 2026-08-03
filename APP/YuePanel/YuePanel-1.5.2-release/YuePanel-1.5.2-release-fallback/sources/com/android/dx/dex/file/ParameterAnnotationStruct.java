package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class ParameterAnnotationStruct implements com.android.dx.util.ToHuman, java.lang.Comparable<com.android.dx.dex.file.ParameterAnnotationStruct> {
    private final com.android.dx.dex.file.UniformListItem<com.android.dx.dex.file.AnnotationSetRefItem> annotationsItem;
    private final com.android.dx.rop.annotation.AnnotationsList annotationsList;
    private final com.android.dx.rop.cst.CstMethodRef method;

    public ParameterAnnotationStruct(com.android.dx.rop.cst.CstMethodRef r5, com.android.dx.rop.annotation.AnnotationsList r6, com.android.dx.dex.file.DexFile r7) {
            r4 = this;
            r4.<init>()
            if (r5 == 0) goto L3d
            if (r6 == 0) goto L35
            r4.method = r5
            r4.annotationsList = r6
            int r5 = r6.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            r1 = 0
        L15:
            if (r1 >= r5) goto L2b
            com.android.dx.rop.annotation.Annotations r2 = r6.get(r1)
            com.android.dx.dex.file.AnnotationSetItem r3 = new com.android.dx.dex.file.AnnotationSetItem
            r3.<init>(r2, r7)
            com.android.dx.dex.file.AnnotationSetRefItem r2 = new com.android.dx.dex.file.AnnotationSetRefItem
            r2.<init>(r3)
            r0.add(r2)
            int r1 = r1 + 1
            goto L15
        L2b:
            com.android.dx.dex.file.UniformListItem r5 = new com.android.dx.dex.file.UniformListItem
            com.android.dx.dex.file.ItemType r6 = com.android.dx.dex.file.ItemType.TYPE_ANNOTATION_SET_REF_LIST
            r5.<init>(r6, r0)
            r4.annotationsItem = r5
            return
        L35:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "annotationsList == null"
            r5.<init>(r6)
            throw r5
        L3d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "method == null"
            r5.<init>(r6)
            throw r5
    }

    public void addContents(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            com.android.dx.dex.file.MethodIdsSection r0 = r3.getMethodIds()
            com.android.dx.dex.file.MixedItemSection r3 = r3.getWordData()
            com.android.dx.rop.cst.CstMethodRef r1 = r2.method
            r0.intern(r1)
            com.android.dx.dex.file.UniformListItem<com.android.dx.dex.file.AnnotationSetRefItem> r0 = r2.annotationsItem
            r3.add(r0)
            return
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(com.android.dx.dex.file.ParameterAnnotationStruct r2) {
            r1 = this;
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            com.android.dx.rop.cst.CstMethodRef r2 = r2.method
            int r2 = r0.compareTo2(r2)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(com.android.dx.dex.file.ParameterAnnotationStruct r1) {
            r0 = this;
            com.android.dx.dex.file.ParameterAnnotationStruct r1 = (com.android.dx.dex.file.ParameterAnnotationStruct) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.dex.file.ParameterAnnotationStruct
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.android.dx.rop.cst.CstMethodRef r0 = r1.method
            com.android.dx.dex.file.ParameterAnnotationStruct r2 = (com.android.dx.dex.file.ParameterAnnotationStruct) r2
            com.android.dx.rop.cst.CstMethodRef r2 = r2.method
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.android.dx.rop.annotation.AnnotationsList getAnnotationsList() {
            r1 = this;
            com.android.dx.rop.annotation.AnnotationsList r0 = r1.annotationsList
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
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.android.dx.rop.cst.CstMethodRef r1 = r5.method
            java.lang.String r1 = r1.toHuman()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            com.android.dx.dex.file.UniformListItem<com.android.dx.dex.file.AnnotationSetRefItem> r1 = r5.annotationsItem
            java.util.List r1 = r1.getItems()
            java.util.Iterator r1 = r1.iterator()
            r2 = 1
        L1e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r1.next()
            com.android.dx.dex.file.AnnotationSetRefItem r3 = (com.android.dx.dex.file.AnnotationSetRefItem) r3
            if (r2 == 0) goto L2e
            r2 = 0
            goto L33
        L2e:
            java.lang.String r4 = ", "
            r0.append(r4)
        L33:
            java.lang.String r3 = r3.toHuman()
            r0.append(r3)
            goto L1e
        L3b:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void writeTo(com.android.dx.dex.file.DexFile r5, com.android.dx.util.AnnotatedOutput r6) {
            r4 = this;
            com.android.dx.dex.file.MethodIdsSection r5 = r5.getMethodIds()
            com.android.dx.rop.cst.CstMethodRef r0 = r4.method
            int r5 = r5.indexOf(r0)
            com.android.dx.dex.file.UniformListItem<com.android.dx.dex.file.AnnotationSetRefItem> r0 = r4.annotationsItem
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
