package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class ClassDataItem extends com.android.dx.dex.file.OffsettedItem {
    private final java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> directMethods;
    private byte[] encodedForm;
    private final java.util.ArrayList<com.android.dx.dex.file.EncodedField> instanceFields;
    private final java.util.ArrayList<com.android.dx.dex.file.EncodedField> staticFields;
    private final java.util.HashMap<com.android.dx.dex.file.EncodedField, com.android.dx.rop.cst.Constant> staticValues;
    private com.android.dx.rop.cst.CstArray staticValuesConstant;
    private final com.android.dx.rop.cst.CstType thisClass;
    private final java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> virtualMethods;

    public ClassDataItem(com.android.dx.rop.cst.CstType r3) {
            r2 = this;
            r0 = 1
            r1 = -1
            r2.<init>(r0, r1)
            if (r3 == 0) goto L34
            r2.thisClass = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 20
            r3.<init>(r0)
            r2.staticFields = r3
            java.util.HashMap r3 = new java.util.HashMap
            r1 = 40
            r3.<init>(r1)
            r2.staticValues = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r2.instanceFields = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r2.directMethods = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r2.virtualMethods = r3
            r3 = 0
            r2.staticValuesConstant = r3
            return
        L34:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "thisClass == null"
            r3.<init>(r0)
            throw r3
    }

    private static void encodeList(com.android.dx.dex.file.DexFile r4, com.android.dx.util.AnnotatedOutput r5, java.lang.String r6, java.util.ArrayList<? extends com.android.dx.dex.file.EncodedMember> r7) {
            int r0 = r7.size()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = r5.annotates()
            r2 = 0
            if (r1 == 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "  "
            r1.append(r3)
            r1.append(r6)
            java.lang.String r6 = ":"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r5.annotate(r2, r6)
        L27:
            r6 = r2
        L28:
            if (r2 >= r0) goto L37
            java.lang.Object r1 = r7.get(r2)
            com.android.dx.dex.file.EncodedMember r1 = (com.android.dx.dex.file.EncodedMember) r1
            int r6 = r1.encode(r4, r5, r6, r2)
            int r2 = r2 + 1
            goto L28
        L37:
            return
    }

    private void encodeOutput(com.android.dx.dex.file.DexFile r7, com.android.dx.util.AnnotatedOutput r8) {
            r6 = this;
            boolean r0 = r8.annotates()
            if (r0 == 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.offsetString()
            r1.append(r2)
            java.lang.String r2 = " class data for "
            r1.append(r2)
            com.android.dx.rop.cst.CstType r2 = r6.thisClass
            java.lang.String r2 = r2.toHuman()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r8.annotate(r2, r1)
        L28:
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r1 = r6.staticFields
            int r1 = r1.size()
            java.lang.String r2 = "static_fields"
            encodeSize(r7, r8, r2, r1)
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r1 = r6.instanceFields
            int r1 = r1.size()
            java.lang.String r3 = "instance_fields"
            encodeSize(r7, r8, r3, r1)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r1 = r6.directMethods
            int r1 = r1.size()
            java.lang.String r4 = "direct_methods"
            encodeSize(r7, r8, r4, r1)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r1 = r6.virtualMethods
            int r1 = r1.size()
            java.lang.String r5 = "virtual_methods"
            encodeSize(r7, r8, r5, r1)
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r1 = r6.staticFields
            encodeList(r7, r8, r2, r1)
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r1 = r6.instanceFields
            encodeList(r7, r8, r3, r1)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r1 = r6.directMethods
            encodeList(r7, r8, r4, r1)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r1 = r6.virtualMethods
            encodeList(r7, r8, r5, r1)
            if (r0 == 0) goto L6d
            r8.endAnnotation()
        L6d:
            return
    }

    private static void encodeSize(com.android.dx.dex.file.DexFile r0, com.android.dx.util.AnnotatedOutput r1, java.lang.String r2, int r3) {
            boolean r0 = r1.annotates()
            if (r0 == 0) goto L28
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "_size:"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "  %-21s %08x"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.annotate(r0)
        L28:
            r1.writeUleb128(r3)
            return
    }

    private com.android.dx.rop.cst.CstArray makeStaticValuesConstant() {
            r5 = this;
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r5.staticFields
            java.util.Collections.sort(r0)
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r5.staticFields
            int r0 = r0.size()
        Lb:
            if (r0 <= 0) goto L36
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r1 = r5.staticFields
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)
            com.android.dx.dex.file.EncodedField r1 = (com.android.dx.dex.file.EncodedField) r1
            java.util.HashMap<com.android.dx.dex.file.EncodedField, com.android.dx.rop.cst.Constant> r2 = r5.staticValues
            java.lang.Object r1 = r2.get(r1)
            com.android.dx.rop.cst.Constant r1 = (com.android.dx.rop.cst.Constant) r1
            boolean r2 = r1 instanceof com.android.dx.rop.cst.CstLiteralBits
            if (r2 == 0) goto L30
            com.android.dx.rop.cst.CstLiteralBits r1 = (com.android.dx.rop.cst.CstLiteralBits) r1
            long r1 = r1.getLongBits()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L33
            goto L36
        L30:
            if (r1 == 0) goto L33
            goto L36
        L33:
            int r0 = r0 + (-1)
            goto Lb
        L36:
            if (r0 != 0) goto L3a
            r0 = 0
            return r0
        L3a:
            com.android.dx.rop.cst.CstArray$List r1 = new com.android.dx.rop.cst.CstArray$List
            r1.<init>(r0)
            r2 = 0
        L40:
            if (r2 >= r0) goto L66
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r3 = r5.staticFields
            java.lang.Object r3 = r3.get(r2)
            com.android.dx.dex.file.EncodedField r3 = (com.android.dx.dex.file.EncodedField) r3
            java.util.HashMap<com.android.dx.dex.file.EncodedField, com.android.dx.rop.cst.Constant> r4 = r5.staticValues
            java.lang.Object r4 = r4.get(r3)
            com.android.dx.rop.cst.Constant r4 = (com.android.dx.rop.cst.Constant) r4
            if (r4 != 0) goto L60
            com.android.dx.rop.cst.CstFieldRef r3 = r3.getRef()
            com.android.dx.rop.type.Type r3 = r3.getType()
            com.android.dx.rop.cst.Constant r4 = com.android.dx.rop.cst.Zeroes.zeroFor(r3)
        L60:
            r1.set(r2, r4)
            int r2 = r2 + 1
            goto L40
        L66:
            r1.setImmutable()
            com.android.dx.rop.cst.CstArray r0 = new com.android.dx.rop.cst.CstArray
            r0.<init>(r1)
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public void addContents(com.android.dx.dex.file.DexFile r3) {
            r2 = this;
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r2.staticFields
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
            r2.getStaticValuesConstant()
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r2.staticFields
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.EncodedField r1 = (com.android.dx.dex.file.EncodedField) r1
            r1.addContents(r3)
            goto L11
        L21:
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r2.instanceFields
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L44
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r2.instanceFields
            java.util.Collections.sort(r0)
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r2.instanceFields
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.EncodedField r1 = (com.android.dx.dex.file.EncodedField) r1
            r1.addContents(r3)
            goto L34
        L44:
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r2.directMethods
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L67
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r2.directMethods
            java.util.Collections.sort(r0)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r2.directMethods
            java.util.Iterator r0 = r0.iterator()
        L57:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.EncodedMethod r1 = (com.android.dx.dex.file.EncodedMethod) r1
            r1.addContents(r3)
            goto L57
        L67:
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r2.virtualMethods
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8a
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r2.virtualMethods
            java.util.Collections.sort(r0)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r2.virtualMethods
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8a
            java.lang.Object r1 = r0.next()
            com.android.dx.dex.file.EncodedMethod r1 = (com.android.dx.dex.file.EncodedMethod) r1
            r1.addContents(r3)
            goto L7a
        L8a:
            return
    }

    public void addDirectMethod(com.android.dx.dex.file.EncodedMethod r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r1.directMethods
            r0.add(r2)
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "method == null"
            r2.<init>(r0)
            throw r2
    }

    public void addInstanceField(com.android.dx.dex.file.EncodedField r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r1.instanceFields
            r0.add(r2)
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "field == null"
            r2.<init>(r0)
            throw r2
    }

    public void addStaticField(com.android.dx.dex.file.EncodedField r2, com.android.dx.rop.cst.Constant r3) {
            r1 = this;
            if (r2 == 0) goto L19
            com.android.dx.rop.cst.CstArray r0 = r1.staticValuesConstant
            if (r0 != 0) goto L11
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r1.staticFields
            r0.add(r2)
            java.util.HashMap<com.android.dx.dex.file.EncodedField, com.android.dx.rop.cst.Constant> r0 = r1.staticValues
            r0.put(r2, r3)
            return
        L11:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "static fields already sorted"
            r2.<init>(r3)
            throw r2
        L19:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "field == null"
            r2.<init>(r3)
            throw r2
    }

    public void addVirtualMethod(com.android.dx.dex.file.EncodedMethod r2) {
            r1 = this;
            if (r2 == 0) goto L8
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r1.virtualMethods
            r0.add(r2)
            return
        L8:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "method == null"
            r2.<init>(r0)
            throw r2
    }

    public void debugPrint(java.io.Writer r7, boolean r8) {
            r6 = this;
            java.io.PrintWriter r7 = com.android.dx.util.Writers.printWriterFor(r7)
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r6.staticFields
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        Lc:
            java.lang.String r3 = "]: "
            if (r2 >= r0) goto L33
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "  sfields["
            r4.append(r5)
            r4.append(r2)
            r4.append(r3)
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r3 = r6.staticFields
            java.lang.Object r3 = r3.get(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r7.println(r3)
            int r2 = r2 + 1
            goto Lc
        L33:
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r6.instanceFields
            int r0 = r0.size()
            r2 = r1
        L3a:
            if (r2 >= r0) goto L5f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "  ifields["
            r4.append(r5)
            r4.append(r2)
            r4.append(r3)
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r5 = r6.instanceFields
            java.lang.Object r5 = r5.get(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r7.println(r4)
            int r2 = r2 + 1
            goto L3a
        L5f:
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r6.directMethods
            int r0 = r0.size()
            r2 = r1
        L66:
            java.lang.String r3 = "]:"
            if (r2 >= r0) goto L8f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "  dmeths["
            r4.append(r5)
            r4.append(r2)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r7.println(r3)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r3 = r6.directMethods
            java.lang.Object r3 = r3.get(r2)
            com.android.dx.dex.file.EncodedMethod r3 = (com.android.dx.dex.file.EncodedMethod) r3
            r3.debugPrint(r7, r8)
            int r2 = r2 + 1
            goto L66
        L8f:
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r6.virtualMethods
            int r0 = r0.size()
        L95:
            if (r1 >= r0) goto Lbc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "  vmeths["
            r2.append(r4)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r7.println(r2)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r2 = r6.virtualMethods
            java.lang.Object r2 = r2.get(r1)
            com.android.dx.dex.file.EncodedMethod r2 = (com.android.dx.dex.file.EncodedMethod) r2
            r2.debugPrint(r7, r8)
            int r1 = r1 + 1
            goto L95
        Lbc:
            return
    }

    public java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> getMethods() {
            r2 = this;
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r2.directMethods
            int r0 = r0.size()
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r1 = r2.virtualMethods
            int r1 = r1.size()
            int r0 = r0 + r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r2.directMethods
            r1.addAll(r0)
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r2.virtualMethods
            r1.addAll(r0)
            return r1
    }

    public com.android.dx.rop.cst.CstArray getStaticValuesConstant() {
            r1 = this;
            com.android.dx.rop.cst.CstArray r0 = r1.staticValuesConstant
            if (r0 != 0) goto L12
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r1.staticFields
            int r0 = r0.size()
            if (r0 == 0) goto L12
            com.android.dx.rop.cst.CstArray r0 = r1.makeStaticValuesConstant()
            r1.staticValuesConstant = r0
        L12:
            com.android.dx.rop.cst.CstArray r0 = r1.staticValuesConstant
            return r0
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r1.staticFields
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.ArrayList<com.android.dx.dex.file.EncodedField> r0 = r1.instanceFields
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r1.directMethods
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            java.util.ArrayList<com.android.dx.dex.file.EncodedMethod> r0 = r1.virtualMethods
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    @Override // com.android.dx.dex.file.Item
    public com.android.dx.dex.file.ItemType itemType() {
            r1 = this;
            com.android.dx.dex.file.ItemType r0 = com.android.dx.dex.file.ItemType.TYPE_CLASS_DATA_ITEM
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void place0(com.android.dx.dex.file.Section r1, int r2) {
            r0 = this;
            com.android.dx.util.ByteArrayAnnotatedOutput r2 = new com.android.dx.util.ByteArrayAnnotatedOutput
            r2.<init>()
            com.android.dx.dex.file.DexFile r1 = r1.getFile()
            r0.encodeOutput(r1, r2)
            byte[] r1 = r2.toByteArray()
            r0.encodedForm = r1
            int r1 = r1.length
            r0.setWriteSize(r1)
            return
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public java.lang.String toHuman() {
            r1 = this;
            java.lang.String r0 = r1.toString()
            return r0
    }

    @Override // com.android.dx.dex.file.OffsettedItem
    public void writeTo0(com.android.dx.dex.file.DexFile r2, com.android.dx.util.AnnotatedOutput r3) {
            r1 = this;
            boolean r0 = r3.annotates()
            if (r0 == 0) goto La
            r1.encodeOutput(r2, r3)
            goto Lf
        La:
            byte[] r2 = r1.encodedForm
            r3.write(r2)
        Lf:
            return
    }
}
