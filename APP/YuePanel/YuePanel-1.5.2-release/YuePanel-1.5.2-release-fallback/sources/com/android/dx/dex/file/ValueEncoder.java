package com.android.dx.dex.file;

/* JADX INFO: loaded from: classes.dex */
public final class ValueEncoder {
    private static final int VALUE_ANNOTATION = 29;
    private static final int VALUE_ARRAY = 28;
    private static final int VALUE_BOOLEAN = 31;
    private static final int VALUE_BYTE = 0;
    private static final int VALUE_CHAR = 3;
    private static final int VALUE_DOUBLE = 17;
    private static final int VALUE_ENUM = 27;
    private static final int VALUE_FIELD = 25;
    private static final int VALUE_FLOAT = 16;
    private static final int VALUE_INT = 4;
    private static final int VALUE_LONG = 6;
    private static final int VALUE_METHOD = 26;
    private static final int VALUE_METHOD_HANDLE = 22;
    private static final int VALUE_METHOD_TYPE = 21;
    private static final int VALUE_NULL = 30;
    private static final int VALUE_SHORT = 2;
    private static final int VALUE_STRING = 23;
    private static final int VALUE_TYPE = 24;
    private final com.android.dx.dex.file.DexFile file;
    private final com.android.dx.util.AnnotatedOutput out;

    public ValueEncoder(com.android.dx.dex.file.DexFile r1, com.android.dx.util.AnnotatedOutput r2) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L14
            if (r2 == 0) goto Lc
            r0.file = r1
            r0.out = r2
            return
        Lc:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "out == null"
            r1.<init>(r2)
            throw r1
        L14:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "file == null"
            r1.<init>(r2)
            throw r1
    }

    public static void addContents(com.android.dx.dex.file.DexFile r3, com.android.dx.rop.annotation.Annotation r4) {
            com.android.dx.dex.file.TypeIdsSection r0 = r3.getTypeIds()
            com.android.dx.dex.file.StringIdsSection r1 = r3.getStringIds()
            com.android.dx.rop.cst.CstType r2 = r4.getType()
            r0.intern(r2)
            java.util.Collection r4 = r4.getNameValuePairs()
            java.util.Iterator r4 = r4.iterator()
        L17:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r4.next()
            com.android.dx.rop.annotation.NameValuePair r0 = (com.android.dx.rop.annotation.NameValuePair) r0
            com.android.dx.rop.cst.CstString r2 = r0.getName()
            r1.intern(r2)
            com.android.dx.rop.cst.Constant r0 = r0.getValue()
            addContents(r3, r0)
            goto L17
        L32:
            return
    }

    public static void addContents(com.android.dx.dex.file.DexFile r3, com.android.dx.rop.cst.Constant r4) {
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstAnnotation
            if (r0 == 0) goto Le
            com.android.dx.rop.cst.CstAnnotation r4 = (com.android.dx.rop.cst.CstAnnotation) r4
            com.android.dx.rop.annotation.Annotation r4 = r4.getAnnotation()
            addContents(r3, r4)
            goto L2c
        Le:
            boolean r0 = r4 instanceof com.android.dx.rop.cst.CstArray
            if (r0 == 0) goto L29
            com.android.dx.rop.cst.CstArray r4 = (com.android.dx.rop.cst.CstArray) r4
            com.android.dx.rop.cst.CstArray$List r4 = r4.getList()
            int r0 = r4.size()
            r1 = 0
        L1d:
            if (r1 >= r0) goto L2c
            com.android.dx.rop.cst.Constant r2 = r4.get(r1)
            addContents(r3, r2)
            int r1 = r1 + 1
            goto L1d
        L29:
            r3.internIfAppropriate(r4)
        L2c:
            return
    }

    public static java.lang.String constantToHuman(com.android.dx.rop.cst.Constant r2) {
            int r0 = constantToValueType(r2)
            r1 = 30
            if (r0 != r1) goto Lb
            java.lang.String r2 = "null"
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.typeName()
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r2 = r2.toHuman()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static int constantToValueType(com.android.dx.rop.cst.Constant r1) {
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstByte
            if (r0 == 0) goto L6
            r1 = 0
            return r1
        L6:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstShort
            if (r0 == 0) goto Lc
            r1 = 2
            return r1
        Lc:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstChar
            if (r0 == 0) goto L12
            r1 = 3
            return r1
        L12:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstInteger
            if (r0 == 0) goto L18
            r1 = 4
            return r1
        L18:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstLong
            if (r0 == 0) goto L1e
            r1 = 6
            return r1
        L1e:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstFloat
            if (r0 == 0) goto L25
            r1 = 16
            return r1
        L25:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstDouble
            if (r0 == 0) goto L2c
            r1 = 17
            return r1
        L2c:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r0 == 0) goto L33
            r1 = 21
            return r1
        L33:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstMethodHandle
            if (r0 == 0) goto L3a
            r1 = 22
            return r1
        L3a:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstString
            if (r0 == 0) goto L41
            r1 = 23
            return r1
        L41:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstType
            if (r0 == 0) goto L48
            r1 = 24
            return r1
        L48:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstFieldRef
            if (r0 == 0) goto L4f
            r1 = 25
            return r1
        L4f:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstMethodRef
            if (r0 == 0) goto L56
            r1 = 26
            return r1
        L56:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstEnumRef
            if (r0 == 0) goto L5d
            r1 = 27
            return r1
        L5d:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstArray
            if (r0 == 0) goto L64
            r1 = 28
            return r1
        L64:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstAnnotation
            if (r0 == 0) goto L6b
            r1 = 29
            return r1
        L6b:
            boolean r0 = r1 instanceof com.android.dx.rop.cst.CstKnownNull
            if (r0 == 0) goto L72
            r1 = 30
            return r1
        L72:
            boolean r1 = r1 instanceof com.android.dx.rop.cst.CstBoolean
            if (r1 == 0) goto L79
            r1 = 31
            return r1
        L79:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Shouldn't happen"
            r1.<init>(r0)
            throw r1
    }

    public void writeAnnotation(com.android.dx.rop.annotation.Annotation r11, boolean r12) {
            r10 = this;
            r0 = 0
            if (r12 == 0) goto Ld
            com.android.dx.util.AnnotatedOutput r12 = r10.out
            boolean r12 = r12.annotates()
            if (r12 == 0) goto Ld
            r12 = 1
            goto Le
        Ld:
            r12 = r0
        Le:
            com.android.dx.dex.file.DexFile r1 = r10.file
            com.android.dx.dex.file.StringIdsSection r1 = r1.getStringIds()
            com.android.dx.dex.file.DexFile r2 = r10.file
            com.android.dx.dex.file.TypeIdsSection r2 = r2.getTypeIds()
            com.android.dx.rop.cst.CstType r3 = r11.getType()
            int r4 = r2.indexOf(r3)
            java.lang.String r5 = " // "
            if (r12 == 0) goto L4a
            com.android.dx.util.AnnotatedOutput r6 = r10.out
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "  type_idx: "
            r7.append(r8)
            java.lang.String r4 = com.android.dx.util.Hex.u4(r4)
            r7.append(r4)
            r7.append(r5)
            java.lang.String r3 = r3.toHuman()
            r7.append(r3)
            java.lang.String r3 = r7.toString()
            r6.annotate(r3)
        L4a:
            com.android.dx.util.AnnotatedOutput r3 = r10.out
            com.android.dx.rop.cst.CstType r4 = r11.getType()
            int r2 = r2.indexOf(r4)
            r3.writeUleb128(r2)
            java.util.Collection r11 = r11.getNameValuePairs()
            int r2 = r11.size()
            if (r12 == 0) goto L7b
            com.android.dx.util.AnnotatedOutput r3 = r10.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "  size: "
            r4.append(r6)
            java.lang.String r6 = com.android.dx.util.Hex.u4(r2)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.annotate(r4)
        L7b:
            com.android.dx.util.AnnotatedOutput r3 = r10.out
            r3.writeUleb128(r2)
            java.util.Iterator r11 = r11.iterator()
            r2 = r0
        L85:
            boolean r3 = r11.hasNext()
            if (r3 == 0) goto L105
            java.lang.Object r3 = r11.next()
            com.android.dx.rop.annotation.NameValuePair r3 = (com.android.dx.rop.annotation.NameValuePair) r3
            com.android.dx.rop.cst.CstString r4 = r3.getName()
            int r6 = r1.indexOf(r4)
            com.android.dx.rop.cst.Constant r3 = r3.getValue()
            if (r12 == 0) goto Le0
            com.android.dx.util.AnnotatedOutput r7 = r10.out
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "  elements["
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = "]:"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.annotate(r0, r8)
            int r2 = r2 + 1
            com.android.dx.util.AnnotatedOutput r7 = r10.out
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "    name_idx: "
            r8.append(r9)
            java.lang.String r9 = com.android.dx.util.Hex.u4(r6)
            r8.append(r9)
            r8.append(r5)
            java.lang.String r4 = r4.toHuman()
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r7.annotate(r4)
        Le0:
            com.android.dx.util.AnnotatedOutput r4 = r10.out
            r4.writeUleb128(r6)
            if (r12 == 0) goto L101
            com.android.dx.util.AnnotatedOutput r4 = r10.out
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "    value: "
            r6.append(r7)
            java.lang.String r7 = constantToHuman(r3)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.annotate(r6)
        L101:
            r10.writeConstant(r3)
            goto L85
        L105:
            if (r12 == 0) goto L10c
            com.android.dx.util.AnnotatedOutput r11 = r10.out
            r11.endAnnotation()
        L10c:
            return
    }

    public void writeArray(com.android.dx.rop.cst.CstArray r7, boolean r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto Ld
            com.android.dx.util.AnnotatedOutput r8 = r6.out
            boolean r8 = r8.annotates()
            if (r8 == 0) goto Ld
            r8 = 1
            goto Le
        Ld:
            r8 = r0
        Le:
            com.android.dx.rop.cst.CstArray$List r7 = r7.getList()
            int r1 = r7.size()
            if (r8 == 0) goto L32
            com.android.dx.util.AnnotatedOutput r2 = r6.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "  size: "
            r3.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u4(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.annotate(r3)
        L32:
            com.android.dx.util.AnnotatedOutput r2 = r6.out
            r2.writeUleb128(r1)
        L37:
            if (r0 >= r1) goto L6b
            com.android.dx.rop.cst.Constant r2 = r7.get(r0)
            if (r8 == 0) goto L65
            com.android.dx.util.AnnotatedOutput r3 = r6.out
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "  ["
            r4.append(r5)
            java.lang.String r5 = java.lang.Integer.toHexString(r0)
            r4.append(r5)
            java.lang.String r5 = "] "
            r4.append(r5)
            java.lang.String r5 = constantToHuman(r2)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.annotate(r4)
        L65:
            r6.writeConstant(r2)
            int r0 = r0 + 1
            goto L37
        L6b:
            if (r8 == 0) goto L72
            com.android.dx.util.AnnotatedOutput r7 = r6.out
            r7.endAnnotation()
        L72:
            return
    }

    public void writeConstant(com.android.dx.rop.cst.Constant r5) {
            r4 = this;
            int r0 = constantToValueType(r5)
            if (r0 == 0) goto L110
            r1 = 6
            if (r0 == r1) goto L110
            r1 = 2
            if (r0 == r1) goto L110
            r1 = 3
            if (r0 == r1) goto L104
            r1 = 4
            if (r0 == r1) goto L110
            r1 = 16
            if (r0 == r1) goto Lf5
            r1 = 17
            if (r0 == r1) goto Le9
            r1 = 0
            switch(r0) {
                case 21: goto Ld2;
                case 22: goto Lbf;
                case 23: goto Lac;
                case 24: goto L99;
                case 25: goto L85;
                case 26: goto L71;
                case 27: goto L59;
                case 28: goto L4d;
                case 29: goto L3d;
                case 30: goto L36;
                case 31: goto L26;
                default: goto L1e;
            }
        L1e:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Shouldn't happen"
            r5.<init>(r0)
            throw r5
        L26:
            com.android.dx.rop.cst.CstBoolean r5 = (com.android.dx.rop.cst.CstBoolean) r5
            int r5 = r5.getIntBits()
            com.android.dx.util.AnnotatedOutput r1 = r4.out
            int r5 = r5 << 5
            r5 = r5 | r0
            r1.writeByte(r5)
            goto L11b
        L36:
            com.android.dx.util.AnnotatedOutput r5 = r4.out
            r5.writeByte(r0)
            goto L11b
        L3d:
            com.android.dx.util.AnnotatedOutput r2 = r4.out
            r2.writeByte(r0)
            com.android.dx.rop.cst.CstAnnotation r5 = (com.android.dx.rop.cst.CstAnnotation) r5
            com.android.dx.rop.annotation.Annotation r5 = r5.getAnnotation()
            r4.writeAnnotation(r5, r1)
            goto L11b
        L4d:
            com.android.dx.util.AnnotatedOutput r2 = r4.out
            r2.writeByte(r0)
            com.android.dx.rop.cst.CstArray r5 = (com.android.dx.rop.cst.CstArray) r5
            r4.writeArray(r5, r1)
            goto L11b
        L59:
            com.android.dx.rop.cst.CstEnumRef r5 = (com.android.dx.rop.cst.CstEnumRef) r5
            com.android.dx.rop.cst.CstFieldRef r5 = r5.getFieldRef()
            com.android.dx.dex.file.DexFile r1 = r4.file
            com.android.dx.dex.file.FieldIdsSection r1 = r1.getFieldIds()
            int r5 = r1.indexOf(r5)
            com.android.dx.util.AnnotatedOutput r1 = r4.out
            long r2 = (long) r5
            com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r1, r0, r2)
            goto L11b
        L71:
            com.android.dx.dex.file.DexFile r1 = r4.file
            com.android.dx.dex.file.MethodIdsSection r1 = r1.getMethodIds()
            com.android.dx.rop.cst.CstMethodRef r5 = (com.android.dx.rop.cst.CstMethodRef) r5
            int r5 = r1.indexOf(r5)
            com.android.dx.util.AnnotatedOutput r1 = r4.out
            long r2 = (long) r5
            com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r1, r0, r2)
            goto L11b
        L85:
            com.android.dx.dex.file.DexFile r1 = r4.file
            com.android.dx.dex.file.FieldIdsSection r1 = r1.getFieldIds()
            com.android.dx.rop.cst.CstFieldRef r5 = (com.android.dx.rop.cst.CstFieldRef) r5
            int r5 = r1.indexOf(r5)
            com.android.dx.util.AnnotatedOutput r1 = r4.out
            long r2 = (long) r5
            com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r1, r0, r2)
            goto L11b
        L99:
            com.android.dx.dex.file.DexFile r1 = r4.file
            com.android.dx.dex.file.TypeIdsSection r1 = r1.getTypeIds()
            com.android.dx.rop.cst.CstType r5 = (com.android.dx.rop.cst.CstType) r5
            int r5 = r1.indexOf(r5)
            com.android.dx.util.AnnotatedOutput r1 = r4.out
            long r2 = (long) r5
            com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r1, r0, r2)
            goto L11b
        Lac:
            com.android.dx.dex.file.DexFile r1 = r4.file
            com.android.dx.dex.file.StringIdsSection r1 = r1.getStringIds()
            com.android.dx.rop.cst.CstString r5 = (com.android.dx.rop.cst.CstString) r5
            int r5 = r1.indexOf(r5)
            com.android.dx.util.AnnotatedOutput r1 = r4.out
            long r2 = (long) r5
            com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r1, r0, r2)
            goto L11b
        Lbf:
            com.android.dx.dex.file.DexFile r1 = r4.file
            com.android.dx.dex.file.MethodHandlesSection r1 = r1.getMethodHandles()
            com.android.dx.rop.cst.CstMethodHandle r5 = (com.android.dx.rop.cst.CstMethodHandle) r5
            int r5 = r1.indexOf(r5)
            com.android.dx.util.AnnotatedOutput r1 = r4.out
            long r2 = (long) r5
            com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r1, r0, r2)
            goto L11b
        Ld2:
            com.android.dx.dex.file.DexFile r1 = r4.file
            com.android.dx.dex.file.ProtoIdsSection r1 = r1.getProtoIds()
            com.android.dx.rop.cst.CstProtoRef r5 = (com.android.dx.rop.cst.CstProtoRef) r5
            com.android.dx.rop.type.Prototype r5 = r5.getPrototype()
            int r5 = r1.indexOf(r5)
            com.android.dx.util.AnnotatedOutput r1 = r4.out
            long r2 = (long) r5
            com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r1, r0, r2)
            goto L11b
        Le9:
            com.android.dx.rop.cst.CstDouble r5 = (com.android.dx.rop.cst.CstDouble) r5
            long r1 = r5.getLongBits()
            com.android.dx.util.AnnotatedOutput r5 = r4.out
            com.android.dex.EncodedValueCodec.writeRightZeroExtendedValue(r5, r0, r1)
            goto L11b
        Lf5:
            com.android.dx.rop.cst.CstFloat r5 = (com.android.dx.rop.cst.CstFloat) r5
            long r1 = r5.getLongBits()
            r5 = 32
            long r1 = r1 << r5
            com.android.dx.util.AnnotatedOutput r5 = r4.out
            com.android.dex.EncodedValueCodec.writeRightZeroExtendedValue(r5, r0, r1)
            goto L11b
        L104:
            com.android.dx.rop.cst.CstLiteralBits r5 = (com.android.dx.rop.cst.CstLiteralBits) r5
            long r1 = r5.getLongBits()
            com.android.dx.util.AnnotatedOutput r5 = r4.out
            com.android.dex.EncodedValueCodec.writeUnsignedIntegralValue(r5, r0, r1)
            goto L11b
        L110:
            com.android.dx.rop.cst.CstLiteralBits r5 = (com.android.dx.rop.cst.CstLiteralBits) r5
            long r1 = r5.getLongBits()
            com.android.dx.util.AnnotatedOutput r5 = r4.out
            com.android.dex.EncodedValueCodec.writeSignedIntegralValue(r5, r0, r1)
        L11b:
            return
    }
}
