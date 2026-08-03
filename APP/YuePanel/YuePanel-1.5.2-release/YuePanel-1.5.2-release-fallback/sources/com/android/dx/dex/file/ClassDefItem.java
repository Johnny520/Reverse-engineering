package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class ClassDefItem extends com.android.dx.dex.file.IndexedItem {
    private final int accessFlags;
    private com.android.dx.dex.file.AnnotationsDirectoryItem annotationsDirectory;
    private final com.android.dx.dex.file.ClassDataItem classData;
    private com.android.dx.dex.file.TypeListItem interfaces;
    private final com.android.dx.rop.cst.CstString sourceFile;
    private com.android.dx.dex.file.EncodedArrayItem staticValuesItem;
    private final com.android.dx.rop.cst.CstType superclass;
    private final com.android.dx.rop.cst.CstType thisClass;

    public ClassDefItem(com.android.dx.rop.cst.CstType r1, int r2, com.android.dx.rop.cst.CstType r3, com.android.dx.rop.type.TypeList r4, com.android.dx.rop.cst.CstString r5) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L38
            if (r4 == 0) goto L30
            r0.thisClass = r1
            r0.accessFlags = r2
            r0.superclass = r3
            int r2 = r4.size()
            r3 = 0
            if (r2 != 0) goto L16
            r2 = r3
            goto L1b
        L16:
            com.android.dx.dex.file.TypeListItem r2 = new com.android.dx.dex.file.TypeListItem
            r2.<init>(r4)
        L1b:
            r0.interfaces = r2
            r0.sourceFile = r5
            com.android.dx.dex.file.ClassDataItem r2 = new com.android.dx.dex.file.ClassDataItem
            r2.<init>(r1)
            r0.classData = r2
            r0.staticValuesItem = r3
            com.android.dx.dex.file.AnnotationsDirectoryItem r1 = new com.android.dx.dex.file.AnnotationsDirectoryItem
            r1.<init>()
            r0.annotationsDirectory = r1
            return
        L30:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "interfaces == null"
            r1.<init>(r2)
            throw r1
        L38:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "thisClass == null"
            r1.<init>(r2)
            throw r1
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r7) {
            r6 = this;
            com.android.dx.dex.file.TypeIdsSection r0 = r7.getTypeIds()
            com.android.dx.dex.file.MixedItemSection r1 = r7.getByteData()
            com.android.dx.dex.file.MixedItemSection r2 = r7.getWordData()
            com.android.dx.dex.file.MixedItemSection r3 = r7.getTypeLists()
            com.android.dx.dex.file.StringIdsSection r4 = r7.getStringIds()
            com.android.dx.rop.cst.CstType r5 = r6.thisClass
            r0.intern(r5)
            com.android.dx.dex.file.ClassDataItem r5 = r6.classData
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L3f
            com.android.dx.dex.file.MixedItemSection r7 = r7.getClassData()
            com.android.dx.dex.file.ClassDataItem r5 = r6.classData
            r7.add(r5)
            com.android.dx.dex.file.ClassDataItem r7 = r6.classData
            com.android.dx.rop.cst.CstArray r7 = r7.getStaticValuesConstant()
            if (r7 == 0) goto L3f
            com.android.dx.dex.file.EncodedArrayItem r5 = new com.android.dx.dex.file.EncodedArrayItem
            r5.<init>(r7)
            com.android.dx.dex.file.OffsettedItem r7 = r1.intern(r5)
            com.android.dx.dex.file.EncodedArrayItem r7 = (com.android.dx.dex.file.EncodedArrayItem) r7
            r6.staticValuesItem = r7
        L3f:
            com.android.dx.rop.cst.CstType r7 = r6.superclass
            if (r7 == 0) goto L46
            r0.intern(r7)
        L46:
            com.android.dx.dex.file.TypeListItem r7 = r6.interfaces
            if (r7 == 0) goto L52
            com.android.dx.dex.file.OffsettedItem r7 = r3.intern(r7)
            com.android.dx.dex.file.TypeListItem r7 = (com.android.dx.dex.file.TypeListItem) r7
            r6.interfaces = r7
        L52:
            com.android.dx.rop.cst.CstString r7 = r6.sourceFile
            if (r7 == 0) goto L59
            r4.intern(r7)
        L59:
            com.android.dx.dex.file.AnnotationsDirectoryItem r7 = r6.annotationsDirectory
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L79
            com.android.dx.dex.file.AnnotationsDirectoryItem r7 = r6.annotationsDirectory
            boolean r7 = r7.isInternable()
            if (r7 == 0) goto L74
            com.android.dx.dex.file.AnnotationsDirectoryItem r7 = r6.annotationsDirectory
            com.android.dx.dex.file.OffsettedItem r7 = r2.intern(r7)
            com.android.dx.dex.file.AnnotationsDirectoryItem r7 = (com.android.dx.dex.file.AnnotationsDirectoryItem) r7
            r6.annotationsDirectory = r7
            goto L79
        L74:
            com.android.dx.dex.file.AnnotationsDirectoryItem r7 = r6.annotationsDirectory
            r2.add(r7)
        L79:
            return
    }

    public void addDirectMethod(com.android.dx.dex.file.EncodedMethod r2) {
            r1 = this;
            com.android.dx.dex.file.ClassDataItem r0 = r1.classData
            r0.addDirectMethod(r2)
            return
    }

    public void addFieldAnnotations(com.android.dx.rop.cst.CstFieldRef r2, com.android.dx.rop.annotation.Annotations r3, com.android.dx.dex.file.DexFile r4) {
            r1 = this;
            com.android.dx.dex.file.AnnotationsDirectoryItem r0 = r1.annotationsDirectory
            r0.addFieldAnnotations(r2, r3, r4)
            return
    }

    public void addInstanceField(com.android.dx.dex.file.EncodedField r2) {
            r1 = this;
            com.android.dx.dex.file.ClassDataItem r0 = r1.classData
            r0.addInstanceField(r2)
            return
    }

    public void addMethodAnnotations(com.android.dx.rop.cst.CstMethodRef r2, com.android.dx.rop.annotation.Annotations r3, com.android.dx.dex.file.DexFile r4) {
            r1 = this;
            com.android.dx.dex.file.AnnotationsDirectoryItem r0 = r1.annotationsDirectory
            r0.addMethodAnnotations(r2, r3, r4)
            return
    }

    public void addParameterAnnotations(com.android.dx.rop.cst.CstMethodRef r2, com.android.dx.rop.annotation.AnnotationsList r3, com.android.dx.dex.file.DexFile r4) {
            r1 = this;
            com.android.dx.dex.file.AnnotationsDirectoryItem r0 = r1.annotationsDirectory
            r0.addParameterAnnotations(r2, r3, r4)
            return
    }

    public void addStaticField(com.android.dx.dex.file.EncodedField r2, com.android.dx.rop.cst.Constant r3) {
            r1 = this;
            com.android.dx.dex.file.ClassDataItem r0 = r1.classData
            r0.addStaticField(r2, r3)
            return
    }

    public void addVirtualMethod(com.android.dx.dex.file.EncodedMethod r2) {
            r1 = this;
            com.android.dx.dex.file.ClassDataItem r0 = r1.classData
            r0.addVirtualMethod(r2)
            return
    }

    public void debugPrint(java.io.Writer r5, boolean r6) {
            r4 = this;
            java.io.PrintWriter r0 = com.android.dx.util.Writers.printWriterFor(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class<com.android.dx.dex.file.ClassDefItem> r2 = com.android.dx.dex.file.ClassDefItem.class
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " {"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "  accessFlags: "
            r1.append(r2)
            int r2 = r4.accessFlags
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "  superclass: "
            r1.append(r2)
            com.android.dx.rop.cst.CstType r2 = r4.superclass
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "  interfaces: "
            r1.append(r2)
            com.android.dx.dex.file.TypeListItem r2 = r4.interfaces
            java.lang.String r3 = "<none>"
            if (r2 != 0) goto L5f
            r2 = r3
        L5f:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "  sourceFile: "
            r1.append(r2)
            com.android.dx.rop.cst.CstString r2 = r4.sourceFile
            if (r2 != 0) goto L78
            goto L7c
        L78:
            java.lang.String r3 = r2.toQuoted()
        L7c:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            com.android.dx.dex.file.ClassDataItem r1 = r4.classData
            r1.debugPrint(r5, r6)
            com.android.dx.dex.file.AnnotationsDirectoryItem r5 = r4.annotationsDirectory
            r5.debugPrint(r0)
            java.lang.String r5 = "}"
            r0.println(r5)
            return
    }

    public int getAccessFlags() {
            r1 = this;
            int r0 = r1.accessFlags
            return r0
    }

    public com.android.dx.rop.type.TypeList getInterfaces() {
            r1 = this;
            com.android.dx.dex.file.TypeListItem r0 = r1.interfaces
            if (r0 != 0) goto L7
            com.android.dx.rop.type.StdTypeList r0 = com.android.dx.rop.type.StdTypeList.EMPTY
            return r0
        L7:
            com.android.dx.rop.type.TypeList r0 = r0.getList()
            return r0
    }

    public com.android.dx.rop.annotation.Annotations getMethodAnnotations(com.android.dx.rop.cst.CstMethodRef r2) {
            r1 = this;
            com.android.dx.dex.file.AnnotationsDirectoryItem r0 = r1.annotationsDirectory
            com.android.dx.rop.annotation.Annotations r2 = r0.getMethodAnnotations(r2)
            return r2
    }

    public java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> getMethods() {
            r1 = this;
            com.android.dx.dex.file.ClassDataItem r0 = r1.classData
            java.util.ArrayList r0 = r0.getMethods()
            return r0
    }

    public com.android.dx.rop.annotation.AnnotationsList getParameterAnnotations(com.android.dx.rop.cst.CstMethodRef r2) {
            r1 = this;
            com.android.dx.dex.file.AnnotationsDirectoryItem r0 = r1.annotationsDirectory
            com.android.dx.rop.annotation.AnnotationsList r2 = r0.getParameterAnnotations(r2)
            return r2
    }

    public com.android.dx.rop.cst.CstString getSourceFile() {
            r1 = this;
            com.android.dx.rop.cst.CstString r0 = r1.sourceFile
            return r0
    }

    public com.android.dx.rop.cst.CstType getSuperclass() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.superclass
            return r0
    }

    public com.android.dx.rop.cst.CstType getThisClass() {
            r1 = this;
            com.android.dx.rop.cst.CstType r0 = r1.thisClass
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_CLASS_DEF_ITEM
            return r0
    }

    public void setClassAnnotations(com.android.dx.rop.annotation.Annotations r2, com.android.dx.dex.file.DexFile r3) {
            r1 = this;
            com.android.dx.dex.file.AnnotationsDirectoryItem r0 = r1.annotationsDirectory
            r0.setClassAnnotations(r2, r3)
            return
    }

    @Override // com.android.dx.dex.file.Item
    public int writeSize() {
            r1 = this;
            r0 = 32
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void writeTo(com.android.dx.dex.file.DexFile r17, com.android.dx.util.AnnotatedOutput r18) {
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r18.annotates()
            com.android.dx.dex.file.TypeIdsSection r3 = r17.getTypeIds()
            com.android.dx.rop.cst.CstType r4 = r0.thisClass
            int r4 = r3.indexOf(r4)
            com.android.dx.rop.cst.CstType r5 = r0.superclass
            r6 = -1
            if (r5 != 0) goto L19
            r3 = r6
            goto L1d
        L19:
            int r3 = r3.indexOf(r5)
        L1d:
            com.android.dx.dex.file.TypeListItem r5 = r0.interfaces
            int r5 = com.android.dx.dex.file.OffsettedItem.getAbsoluteOffsetOr0(r5)
            com.android.dx.dex.file.AnnotationsDirectoryItem r7 = r0.annotationsDirectory
            boolean r7 = r7.isEmpty()
            r8 = 0
            if (r7 == 0) goto L2e
            r7 = r8
            goto L34
        L2e:
            com.android.dx.dex.file.AnnotationsDirectoryItem r7 = r0.annotationsDirectory
            int r7 = r7.getAbsoluteOffset()
        L34:
            com.android.dx.rop.cst.CstString r9 = r0.sourceFile
            if (r9 != 0) goto L39
            goto L43
        L39:
            com.android.dx.dex.file.StringIdsSection r6 = r17.getStringIds()
            com.android.dx.rop.cst.CstString r9 = r0.sourceFile
            int r6 = r6.indexOf(r9)
        L43:
            com.android.dx.dex.file.ClassDataItem r9 = r0.classData
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L4d
            r9 = r8
            goto L53
        L4d:
            com.android.dx.dex.file.ClassDataItem r9 = r0.classData
            int r9 = r9.getAbsoluteOffset()
        L53:
            com.android.dx.dex.file.EncodedArrayItem r10 = r0.staticValuesItem
            int r10 = com.android.dx.dex.file.OffsettedItem.getAbsoluteOffsetOr0(r10)
            if (r2 == 0) goto L194
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = r16.indexString()
            r2.append(r11)
            r11 = 32
            r2.append(r11)
            com.android.dx.rop.cst.CstType r11 = r0.thisClass
            java.lang.String r11 = r11.toHuman()
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.annotate(r8, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "  class_idx:           "
            r2.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u4(r4)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r11 = 4
            r1.annotate(r11, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "  access_flags:        "
            r2.append(r12)
            int r12 = r0.accessFlags
            java.lang.String r12 = com.android.dx.rop.code.AccessFlags.classString(r12)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            r1.annotate(r11, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r12 = "  superclass_idx:      "
            r2.append(r12)
            java.lang.String r12 = com.android.dx.util.Hex.u4(r3)
            r2.append(r12)
            java.lang.String r12 = " // "
            r2.append(r12)
            com.android.dx.rop.cst.CstType r13 = r0.superclass
            java.lang.String r14 = "<none>"
            if (r13 != 0) goto Lcd
            r13 = r14
            goto Ld1
        Lcd:
            java.lang.String r13 = r13.toHuman()
        Ld1:
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.annotate(r11, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = "  interfaces_off:      "
            r2.append(r13)
            java.lang.String r13 = com.android.dx.util.Hex.u4(r5)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r1.annotate(r11, r2)
            if (r5 == 0) goto L124
            com.android.dx.dex.file.TypeListItem r2 = r0.interfaces
            com.android.dx.rop.type.TypeList r2 = r2.getList()
            int r13 = r2.size()
            r15 = r8
        L100:
            if (r15 >= r13) goto L124
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r8 = "    "
            r11.append(r8)
            com.android.dx.rop.type.Type r8 = r2.getType(r15)
            java.lang.String r8 = r8.toHuman()
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r11 = 0
            r1.annotate(r11, r8)
            int r15 = r15 + 1
            r8 = r11
            r11 = 4
            goto L100
        L124:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "  source_file_idx:     "
            r2.append(r8)
            java.lang.String r8 = com.android.dx.util.Hex.u4(r6)
            r2.append(r8)
            r2.append(r12)
            com.android.dx.rop.cst.CstString r8 = r0.sourceFile
            if (r8 != 0) goto L13d
            goto L141
        L13d:
            java.lang.String r14 = r8.toHuman()
        L141:
            r2.append(r14)
            java.lang.String r2 = r2.toString()
            r8 = 4
            r1.annotate(r8, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "  annotations_off:     "
            r2.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u4(r7)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.annotate(r8, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "  class_data_off:      "
            r2.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u4(r9)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.annotate(r8, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r11 = "  static_values_off:   "
            r2.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u4(r10)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.annotate(r8, r2)
        L194:
            r1.writeInt(r4)
            int r2 = r0.accessFlags
            r1.writeInt(r2)
            r1.writeInt(r3)
            r1.writeInt(r5)
            r1.writeInt(r6)
            r1.writeInt(r7)
            r1.writeInt(r9)
            r1.writeInt(r10)
            return
    }
}
