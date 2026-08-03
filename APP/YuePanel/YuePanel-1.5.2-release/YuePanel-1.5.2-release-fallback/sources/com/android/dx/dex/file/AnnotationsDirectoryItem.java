package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationsDirectoryItem extends com.android.dx.dex.file.OffsettedItem {
    private static final int ALIGNMENT = 4;
    private static final int ELEMENT_SIZE = 8;
    private static final int HEADER_SIZE = 16;
    private com.android.dx.dex.file.AnnotationSetItem classAnnotations;
    private java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> fieldAnnotations;
    private java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> methodAnnotations;
    private java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> parameterAnnotations;

    public AnnotationsDirectoryItem() {
            r2 = this;
            r0 = 4
            r1 = -1
            r2.<init>(r0, r1)
            r0 = 0
            r2.classAnnotations = r0
            r2.fieldAnnotations = r0
            r2.methodAnnotations = r0
            r2.parameterAnnotations = r0
            return
    }

    private static int listSize(java.util.ArrayList<?> r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.size()
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            com.android.dx.dex.file.MixedItemSection r0 = r3.getWordData()
            com.android.dx.dex.file.AnnotationSetItem r1 = r2.classAnnotations
            if (r1 == 0) goto L10
            com.android.dx.dex.file.OffsettedItem r0 = r0.intern(r1)
            com.android.dx.dex.file.AnnotationSetItem r0 = (com.android.dx.dex.file.AnnotationSetItem) r0
            r2.classAnnotations = r0
        L10:
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r0 = r2.fieldAnnotations
            if (r0 == 0) goto L28
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.FieldAnnotationStruct r1 = (com.android.dx.dex.file.FieldAnnotationStruct) r1
            r1.addContents(r3)
            goto L18
        L28:
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r0 = r2.methodAnnotations
            if (r0 == 0) goto L40
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.MethodAnnotationStruct r1 = (com.android.dx.dex.file.MethodAnnotationStruct) r1
            r1.addContents(r3)
            goto L30
        L40:
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r0 = r2.parameterAnnotations
            if (r0 == 0) goto L58
            java.util.Iterator r0 = r0.iterator()
        L48:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.ParameterAnnotationStruct r1 = (com.android.dx.dex.file.ParameterAnnotationStruct) r1
            r1.addContents(r3)
            goto L48
        L58:
            return
    }

    public void addFieldAnnotations(com.android.dx.rop.cst.CstFieldRef r4, com.android.dx.rop.annotation.Annotations r5, com.android.dx.dex.file.DexFile r6) {
            r3 = this;
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r0 = r3.fieldAnnotations
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.fieldAnnotations = r0
        Lb:
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r0 = r3.fieldAnnotations
            com.android.dx.dex.file.FieldAnnotationStruct r1 = new com.android.dx.dex.file.FieldAnnotationStruct
            com.android.dx.dex.file.AnnotationSetItem r2 = new com.android.dx.dex.file.AnnotationSetItem
            r2.<init>(r5, r6)
            r1.<init>(r4, r2)
            r0.add(r1)
            return
    }

    public void addMethodAnnotations(com.android.dx.rop.cst.CstMethodRef r4, com.android.dx.rop.annotation.Annotations r5, com.android.dx.dex.file.DexFile r6) {
            r3 = this;
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r0 = r3.methodAnnotations
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.methodAnnotations = r0
        Lb:
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r0 = r3.methodAnnotations
            com.android.dx.dex.file.MethodAnnotationStruct r1 = new com.android.dx.dex.file.MethodAnnotationStruct
            com.android.dx.dex.file.AnnotationSetItem r2 = new com.android.dx.dex.file.AnnotationSetItem
            r2.<init>(r5, r6)
            r1.<init>(r4, r2)
            r0.add(r1)
            return
    }

    public void addParameterAnnotations(com.android.dx.rop.cst.CstMethodRef r3, com.android.dx.rop.annotation.AnnotationsList r4, com.android.dx.dex.file.DexFile r5) {
            r2 = this;
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r0 = r2.parameterAnnotations
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.parameterAnnotations = r0
        Lb:
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r0 = r2.parameterAnnotations
            com.android.dx.dex.file.ParameterAnnotationStruct r1 = new com.android.dx.dex.file.ParameterAnnotationStruct
            r1.<init>(r3, r4, r5)
            r0.add(r1)
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public int compareTo0(com.android.dx.dex.file.OffsettedItem r2) {
            r1 = this;
            boolean r0 = r1.isInternable()
            if (r0 == 0) goto L11
            com.android.dx.dex.file.AnnotationsDirectoryItem r2 = (com.android.dx.dex.file.AnnotationsDirectoryItem) r2
            com.android.dx.dex.file.AnnotationSetItem r0 = r1.classAnnotations
            com.android.dx.dex.file.AnnotationSetItem r2 = r2.classAnnotations
            int r2 = r0.compareTo2(r2)
            return r2
        L11:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "uninternable instance"
            r2.<init>(r0)
            throw r2
    }

    public void debugPrint(java.io.PrintWriter r5) {
            r4 = this;
            com.android.dx.dex.file.AnnotationSetItem r0 = r4.classAnnotations
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  class annotations: "
            r0.append(r1)
            com.android.dx.dex.file.AnnotationSetItem r1 = r4.classAnnotations
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
        L1a:
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r0 = r4.fieldAnnotations
            java.lang.String r1 = "    "
            if (r0 == 0) goto L4e
            java.lang.String r0 = "  field annotations:"
            r5.println(r0)
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r0 = r4.fieldAnnotations
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r0.next()
            com.android.dx.dex.file.FieldAnnotationStruct r2 = (com.android.dx.dex.file.FieldAnnotationStruct) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r2 = r2.toHuman()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r5.println(r2)
            goto L2b
        L4e:
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r0 = r4.methodAnnotations
            if (r0 == 0) goto L80
            java.lang.String r0 = "  method annotations:"
            r5.println(r0)
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r0 = r4.methodAnnotations
            java.util.Iterator r0 = r0.iterator()
        L5d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r0.next()
            com.android.dx.dex.file.MethodAnnotationStruct r2 = (com.android.dx.dex.file.MethodAnnotationStruct) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r2 = r2.toHuman()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r5.println(r2)
            goto L5d
        L80:
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r0 = r4.parameterAnnotations
            if (r0 == 0) goto Lb2
            java.lang.String r0 = "  parameter annotations:"
            r5.println(r0)
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r0 = r4.parameterAnnotations
            java.util.Iterator r0 = r0.iterator()
        L8f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r0.next()
            com.android.dx.dex.file.ParameterAnnotationStruct r2 = (com.android.dx.dex.file.ParameterAnnotationStruct) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r2 = r2.toHuman()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r5.println(r2)
            goto L8f
        Lb2:
            return
    }

    public com.android.dx.rop.annotation.Annotations getMethodAnnotations(com.android.dx.rop.cst.CstMethodRef r5) {
            r4 = this;
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r0 = r4.methodAnnotations
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            com.android.dx.dex.file.MethodAnnotationStruct r2 = (com.android.dx.dex.file.MethodAnnotationStruct) r2
            com.android.dx.rop.cst.CstMethodRef r3 = r2.getMethod()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto La
            com.android.dx.rop.annotation.Annotations r5 = r2.getAnnotations()
            return r5
        L25:
            return r1
    }

    public com.android.dx.rop.annotation.AnnotationsList getParameterAnnotations(com.android.dx.rop.cst.CstMethodRef r5) {
            r4 = this;
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r0 = r4.parameterAnnotations
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            com.android.dx.dex.file.ParameterAnnotationStruct r2 = (com.android.dx.dex.file.ParameterAnnotationStruct) r2
            com.android.dx.rop.cst.CstMethodRef r3 = r2.getMethod()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto La
            com.android.dx.rop.annotation.AnnotationsList r5 = r2.getAnnotationsList()
            return r5
        L25:
            return r1
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.dex.file.AnnotationSetItem r0 = r1.classAnnotations
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            com.android.dx.dex.file.AnnotationSetItem r0 = r1.classAnnotations
            if (r0 != 0) goto L12
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r0 = r1.fieldAnnotations
            if (r0 != 0) goto L12
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r0 = r1.methodAnnotations
            if (r0 != 0) goto L12
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r0 = r1.parameterAnnotations
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean isInternable() {
            r1 = this;
            com.android.dx.dex.file.AnnotationSetItem r0 = r1.classAnnotations
            if (r0 == 0) goto L12
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r0 = r1.fieldAnnotations
            if (r0 != 0) goto L12
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r0 = r1.methodAnnotations
            if (r0 != 0) goto L12
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r0 = r1.parameterAnnotations
            if (r0 != 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_ANNOTATIONS_DIRECTORY_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void place0(com.android.dx.dex.file.Section r1, int r2) {
            r0 = this;
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r1 = r0.fieldAnnotations
            int r1 = listSize(r1)
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r2 = r0.methodAnnotations
            int r2 = listSize(r2)
            int r1 = r1 + r2
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r2 = r0.parameterAnnotations
            int r2 = listSize(r2)
            int r1 = r1 + r2
            int r1 = r1 * 8
            int r1 = r1 + 16
            r0.setWriteSize(r1)
            return
    }

    public void setClassAnnotations(com.android.dx.rop.annotation.Annotations r2, com.android.dx.dex.file.DexFile r3) {
            r1 = this;
            if (r2 == 0) goto L16
            com.android.dx.dex.file.AnnotationSetItem r0 = r1.classAnnotations
            if (r0 != 0) goto Le
            com.android.dx.dex.file.AnnotationSetItem r0 = new com.android.dx.dex.file.AnnotationSetItem
            r0.<init>(r2, r3)
            r1.classAnnotations = r0
            return
        Le:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "class annotations already set"
            r2.<init>(r3)
            throw r2
        L16:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "annotations == null"
            r2.<init>(r3)
            throw r2
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r2 = this;
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r10, com.android.dx.util.AnnotatedOutput r11) {
            r9 = this;
            boolean r0 = r11.annotates()
            com.android.dx.dex.file.AnnotationSetItem r1 = r9.classAnnotations
            int r1 = com.android.dx.dex.file.OffsettedItem.getAbsoluteOffsetOr0(r1)
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r2 = r9.fieldAnnotations
            int r2 = listSize(r2)
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r3 = r9.methodAnnotations
            int r3 = listSize(r3)
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r4 = r9.parameterAnnotations
            int r4 = listSize(r4)
            r5 = 0
            if (r0 == 0) goto L98
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r9.offsetString()
            r6.append(r7)
            java.lang.String r7 = " annotations directory"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r11.annotate(r5, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "  class_annotations_off: "
            r6.append(r7)
            java.lang.String r7 = com.android.dx.util.Hex.u4(r1)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r7 = 4
            r11.annotate(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "  fields_size:           "
            r6.append(r8)
            java.lang.String r8 = com.android.dx.util.Hex.u4(r2)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r11.annotate(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "  methods_size:          "
            r6.append(r8)
            java.lang.String r8 = com.android.dx.util.Hex.u4(r3)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r11.annotate(r7, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "  parameters_size:       "
            r6.append(r8)
            java.lang.String r8 = com.android.dx.util.Hex.u4(r4)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            r11.annotate(r7, r6)
        L98:
            r11.writeInt(r1)
            r11.writeInt(r2)
            r11.writeInt(r3)
            r11.writeInt(r4)
            if (r2 == 0) goto Lc8
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r1 = r9.fieldAnnotations
            java.util.Collections.sort(r1)
            if (r0 == 0) goto Lb2
            java.lang.String r1 = "  fields:"
            r11.annotate(r5, r1)
        Lb2:
            java.util.ArrayList<com.android.dx.dex.file.FieldAnnotationStruct> r1 = r9.fieldAnnotations
            java.util.Iterator r1 = r1.iterator()
        Lb8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc8
            java.lang.Object r2 = r1.next()
            com.android.dx.dex.file.FieldAnnotationStruct r2 = (com.android.dx.dex.file.FieldAnnotationStruct) r2
            r2.writeTo(r10, r11)
            goto Lb8
        Lc8:
            if (r3 == 0) goto Lec
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r1 = r9.methodAnnotations
            java.util.Collections.sort(r1)
            if (r0 == 0) goto Ld6
            java.lang.String r1 = "  methods:"
            r11.annotate(r5, r1)
        Ld6:
            java.util.ArrayList<com.android.dx.dex.file.MethodAnnotationStruct> r1 = r9.methodAnnotations
            java.util.Iterator r1 = r1.iterator()
        Ldc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lec
            java.lang.Object r2 = r1.next()
            com.android.dx.dex.file.MethodAnnotationStruct r2 = (com.android.dx.dex.file.MethodAnnotationStruct) r2
            r2.writeTo(r10, r11)
            goto Ldc
        Lec:
            if (r4 == 0) goto L110
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r1 = r9.parameterAnnotations
            java.util.Collections.sort(r1)
            if (r0 == 0) goto Lfa
            java.lang.String r0 = "  parameters:"
            r11.annotate(r5, r0)
        Lfa:
            java.util.ArrayList<com.android.dx.dex.file.ParameterAnnotationStruct> r0 = r9.parameterAnnotations
            java.util.Iterator r0 = r0.iterator()
        L100:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L110
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.ParameterAnnotationStruct r1 = (com.android.dx.dex.file.ParameterAnnotationStruct) r1
            r1.writeTo(r10, r11)
            goto L100
        L110:
            return
    }
}
