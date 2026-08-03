package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotationParser {
    private final com.android.dx.util.ByteArray bytes;
    private final com.android.dx.cf.direct.DirectClassFile cf;
    private final com.android.dx.util.ByteArray.MyDataInputStream input;
    private final com.android.dx.cf.iface.ParseObserver observer;
    private int parseCursor;
    private final com.android.dx.rop.cst.ConstantPool pool;

    public AnnotationParser(com.android.dx.cf.direct.DirectClassFile r2, int r3, int r4, com.android.dx.cf.iface.ParseObserver r5) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto L24
            r1.cf = r2
            com.android.dx.rop.cst.ConstantPool r0 = r2.getConstantPool()
            r1.pool = r0
            r1.observer = r5
            com.android.dx.util.ByteArray r2 = r2.getBytes()
            int r4 = r4 + r3
            com.android.dx.util.ByteArray r2 = r2.slice(r3, r4)
            r1.bytes = r2
            com.android.dx.util.ByteArray$MyDataInputStream r2 = r2.makeDataInputStream()
            r1.input = r2
            r2 = 0
            r1.parseCursor = r2
            return
        L24:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "cf == null"
            r2.<init>(r3)
            throw r2
    }

    private void changeIndent(int r2) {
            r1 = this;
            com.android.dx.cf.iface.ParseObserver r0 = r1.observer
            r0.changeIndent(r2)
            return
    }

    private com.android.dx.rop.annotation.Annotation parseAnnotation(com.android.dx.rop.annotation.AnnotationVisibility r6) throws java.io.IOException {
            r5 = this;
            r0 = 4
            r5.requireLength(r0)
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r5.input
            int r0 = r0.readUnsignedShort()
            com.android.dx.util.ByteArray$MyDataInputStream r1 = r5.input
            int r1 = r1.readUnsignedShort()
            com.android.dx.rop.cst.ConstantPool r2 = r5.pool
            com.android.dx.rop.cst.Constant r0 = r2.get(r0)
            com.android.dx.rop.cst.CstString r0 = (com.android.dx.rop.cst.CstString) r0
            com.android.dx.rop.cst.CstType r2 = new com.android.dx.rop.cst.CstType
            java.lang.String r0 = r0.getString()
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.intern(r0)
            r2.<init>(r0)
            com.android.dx.cf.iface.ParseObserver r0 = r5.observer
            if (r0 == 0) goto L56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "type: "
            r0.append(r3)
            java.lang.String r3 = r2.toHuman()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r3 = 2
            r5.parsed(r3, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "num_elements: "
            r0.append(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.parsed(r3, r0)
        L56:
            com.android.dx.rop.annotation.Annotation r0 = new com.android.dx.rop.annotation.Annotation
            r0.<init>(r2, r6)
            r6 = 0
            r2 = r6
        L5d:
            if (r2 >= r1) goto L92
            com.android.dx.cf.iface.ParseObserver r3 = r5.observer
            if (r3 == 0) goto L80
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "elements["
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = "]:"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r5.parsed(r6, r3)
            r3 = 1
            r5.changeIndent(r3)
        L80:
            com.android.dx.rop.annotation.NameValuePair r3 = r5.parseElement()
            r0.add(r3)
            com.android.dx.cf.iface.ParseObserver r3 = r5.observer
            if (r3 == 0) goto L8f
            r3 = -1
            r5.changeIndent(r3)
        L8f:
            int r2 = r2 + 1
            goto L5d
        L92:
            r0.setImmutable()
            return r0
    }

    private com.android.dx.rop.annotation.Annotations parseAnnotations(com.android.dx.rop.annotation.AnnotationVisibility r7) throws java.io.IOException {
            r6 = this;
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r6.input
            int r0 = r0.readUnsignedShort()
            com.android.dx.cf.iface.ParseObserver r1 = r6.observer
            if (r1 == 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "num_annotations: "
            r1.append(r2)
            java.lang.String r2 = com.android.dx.util.Hex.u2(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            r6.parsed(r2, r1)
        L23:
            com.android.dx.rop.annotation.Annotations r1 = new com.android.dx.rop.annotation.Annotations
            r1.<init>()
            r2 = 0
            r3 = r2
        L2a:
            if (r3 >= r0) goto L5f
            com.android.dx.cf.iface.ParseObserver r4 = r6.observer
            if (r4 == 0) goto L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "annotations["
            r4.append(r5)
            r4.append(r3)
            java.lang.String r5 = "]:"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r6.parsed(r2, r4)
            r4 = 1
            r6.changeIndent(r4)
        L4d:
            com.android.dx.rop.annotation.Annotation r4 = r6.parseAnnotation(r7)
            r1.add(r4)
            com.android.dx.cf.iface.ParseObserver r4 = r6.observer
            if (r4 == 0) goto L5c
            r5 = -1
            r4.changeIndent(r5)
        L5c:
            int r3 = r3 + 1
            goto L2a
        L5f:
            r1.setImmutable()
            return r1
    }

    private com.android.dx.rop.annotation.AnnotationsList parseAnnotationsList(com.android.dx.rop.annotation.AnnotationVisibility r8) throws java.io.IOException {
            r7 = this;
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r7.input
            int r0 = r0.readUnsignedByte()
            com.android.dx.cf.iface.ParseObserver r1 = r7.observer
            r2 = 1
            if (r1 == 0) goto L23
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "num_parameters: "
            r1.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u1(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r7.parsed(r2, r1)
        L23:
            com.android.dx.rop.annotation.AnnotationsList r1 = new com.android.dx.rop.annotation.AnnotationsList
            r1.<init>(r0)
            r3 = 0
            r4 = r3
        L2a:
            if (r4 >= r0) goto L5e
            com.android.dx.cf.iface.ParseObserver r5 = r7.observer
            if (r5 == 0) goto L4c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "parameter_annotations["
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = "]:"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r7.parsed(r3, r5)
            r7.changeIndent(r2)
        L4c:
            com.android.dx.rop.annotation.Annotations r5 = r7.parseAnnotations(r8)
            r1.set(r4, r5)
            com.android.dx.cf.iface.ParseObserver r5 = r7.observer
            if (r5 == 0) goto L5b
            r6 = -1
            r5.changeIndent(r6)
        L5b:
            int r4 = r4 + 1
            goto L2a
        L5e:
            r1.setImmutable()
            return r1
    }

    private com.android.dx.rop.cst.Constant parseConstant() throws java.io.IOException {
            r4 = this;
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r4.input
            int r0 = r0.readUnsignedShort()
            com.android.dx.rop.cst.ConstantPool r1 = r4.pool
            com.android.dx.rop.cst.Constant r0 = r1.get(r0)
            com.android.dx.cf.iface.ParseObserver r1 = r4.observer
            if (r1 == 0) goto L35
            boolean r1 = r0 instanceof com.android.dx.rop.cst.CstString
            if (r1 == 0) goto L1c
            r1 = r0
            com.android.dx.rop.cst.CstString r1 = (com.android.dx.rop.cst.CstString) r1
            java.lang.String r1 = r1.toQuoted()
            goto L20
        L1c:
            java.lang.String r1 = r0.toHuman()
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "constant_value: "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r2 = 2
            r4.parsed(r2, r1)
        L35:
            return r0
    }

    private com.android.dx.rop.annotation.NameValuePair parseElement() throws java.io.IOException {
            r3 = this;
            r0 = 5
            r3.requireLength(r0)
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r3.input
            int r0 = r0.readUnsignedShort()
            com.android.dx.rop.cst.ConstantPool r1 = r3.pool
            com.android.dx.rop.cst.Constant r0 = r1.get(r0)
            com.android.dx.rop.cst.CstString r0 = (com.android.dx.rop.cst.CstString) r0
            com.android.dx.cf.iface.ParseObserver r1 = r3.observer
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "element_name: "
            r1.append(r2)
            java.lang.String r2 = r0.toHuman()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 2
            r3.parsed(r2, r1)
            r1 = 0
            java.lang.String r2 = "value: "
            r3.parsed(r1, r2)
            r1 = 1
            r3.changeIndent(r1)
        L39:
            com.android.dx.rop.cst.Constant r1 = r3.parseValue()
            com.android.dx.cf.iface.ParseObserver r2 = r3.observer
            if (r2 == 0) goto L45
            r2 = -1
            r3.changeIndent(r2)
        L45:
            com.android.dx.rop.annotation.NameValuePair r2 = new com.android.dx.rop.annotation.NameValuePair
            r2.<init>(r0, r1)
            return r2
    }

    private com.android.dx.rop.cst.Constant parseValue() throws java.io.IOException {
            r7 = this;
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r7.input
            int r0 = r0.readUnsignedByte()
            com.android.dx.cf.iface.ParseObserver r1 = r7.observer
            r2 = 1
            if (r1 == 0) goto L2d
            com.android.dx.rop.cst.CstString r1 = new com.android.dx.rop.cst.CstString
            char r3 = (char) r0
            java.lang.String r3 = java.lang.Character.toString(r3)
            r1.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "tag: "
            r3.append(r4)
            java.lang.String r1 = r1.toQuoted()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r7.parsed(r2, r1)
        L2d:
            r1 = 64
            if (r0 == r1) goto L1d6
            r1 = 70
            if (r0 == r1) goto L1cf
            r1 = 83
            if (r0 == r1) goto L1c0
            r1 = 99
            r3 = 2
            if (r0 == r1) goto L188
            r1 = 101(0x65, float:1.42E-43)
            if (r0 == r1) goto L129
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L124
            r1 = 73
            if (r0 == r1) goto L11d
            r1 = 74
            if (r0 == r1) goto L116
            r1 = 90
            if (r0 == r1) goto L107
            r1 = 91
            if (r0 == r1) goto L9c
            switch(r0) {
                case 66: goto L8d;
                case 67: goto L7b;
                case 68: goto L74;
                default: goto L59;
            }
        L59:
            com.android.dx.cf.iface.ParseException r1 = new com.android.dx.cf.iface.ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "unknown annotation tag: "
            r2.append(r3)
            java.lang.String r0 = com.android.dx.util.Hex.u1(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L74:
            com.android.dx.rop.cst.Constant r0 = r7.parseConstant()
            com.android.dx.rop.cst.CstDouble r0 = (com.android.dx.rop.cst.CstDouble) r0
            return r0
        L7b:
            com.android.dx.rop.cst.Constant r0 = r7.parseConstant()
            com.android.dx.rop.cst.CstInteger r0 = (com.android.dx.rop.cst.CstInteger) r0
            r0.getValue()
            int r0 = r0.getValue()
            com.android.dx.rop.cst.CstChar r0 = com.android.dx.rop.cst.CstChar.make(r0)
            return r0
        L8d:
            com.android.dx.rop.cst.Constant r0 = r7.parseConstant()
            com.android.dx.rop.cst.CstInteger r0 = (com.android.dx.rop.cst.CstInteger) r0
            int r0 = r0.getValue()
            com.android.dx.rop.cst.CstByte r0 = com.android.dx.rop.cst.CstByte.make(r0)
            return r0
        L9c:
            r7.requireLength(r3)
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r7.input
            int r0 = r0.readUnsignedShort()
            com.android.dx.rop.cst.CstArray$List r1 = new com.android.dx.rop.cst.CstArray$List
            r1.<init>(r0)
            com.android.dx.cf.iface.ParseObserver r4 = r7.observer
            if (r4 == 0) goto Lc5
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "num_values: "
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r7.parsed(r3, r4)
            r7.changeIndent(r2)
        Lc5:
            r3 = 0
            r4 = r3
        Lc7:
            r5 = -1
            if (r4 >= r0) goto Lf7
            com.android.dx.cf.iface.ParseObserver r6 = r7.observer
            if (r6 == 0) goto Led
            r7.changeIndent(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "element_value["
            r5.append(r6)
            r5.append(r4)
            java.lang.String r6 = "]:"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r7.parsed(r3, r5)
            r7.changeIndent(r2)
        Led:
            com.android.dx.rop.cst.Constant r5 = r7.parseValue()
            r1.set(r4, r5)
            int r4 = r4 + 1
            goto Lc7
        Lf7:
            com.android.dx.cf.iface.ParseObserver r0 = r7.observer
            if (r0 == 0) goto Lfe
            r7.changeIndent(r5)
        Lfe:
            r1.setImmutable()
            com.android.dx.rop.cst.CstArray r0 = new com.android.dx.rop.cst.CstArray
            r0.<init>(r1)
            return r0
        L107:
            com.android.dx.rop.cst.Constant r0 = r7.parseConstant()
            com.android.dx.rop.cst.CstInteger r0 = (com.android.dx.rop.cst.CstInteger) r0
            int r0 = r0.getValue()
            com.android.dx.rop.cst.CstBoolean r0 = com.android.dx.rop.cst.CstBoolean.make(r0)
            return r0
        L116:
            com.android.dx.rop.cst.Constant r0 = r7.parseConstant()
            com.android.dx.rop.cst.CstLong r0 = (com.android.dx.rop.cst.CstLong) r0
            return r0
        L11d:
            com.android.dx.rop.cst.Constant r0 = r7.parseConstant()
            com.android.dx.rop.cst.CstInteger r0 = (com.android.dx.rop.cst.CstInteger) r0
            return r0
        L124:
            com.android.dx.rop.cst.Constant r0 = r7.parseConstant()
            return r0
        L129:
            r0 = 4
            r7.requireLength(r0)
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r7.input
            int r0 = r0.readUnsignedShort()
            com.android.dx.util.ByteArray$MyDataInputStream r1 = r7.input
            int r1 = r1.readUnsignedShort()
            com.android.dx.rop.cst.ConstantPool r2 = r7.pool
            com.android.dx.rop.cst.Constant r0 = r2.get(r0)
            com.android.dx.rop.cst.CstString r0 = (com.android.dx.rop.cst.CstString) r0
            com.android.dx.rop.cst.ConstantPool r2 = r7.pool
            com.android.dx.rop.cst.Constant r1 = r2.get(r1)
            com.android.dx.rop.cst.CstString r1 = (com.android.dx.rop.cst.CstString) r1
            com.android.dx.cf.iface.ParseObserver r2 = r7.observer
            if (r2 == 0) goto L17d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "type_name: "
            r2.append(r4)
            java.lang.String r4 = r0.toHuman()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.parsed(r3, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "const_name: "
            r2.append(r4)
            java.lang.String r4 = r1.toHuman()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.parsed(r3, r2)
        L17d:
            com.android.dx.rop.cst.CstEnumRef r2 = new com.android.dx.rop.cst.CstEnumRef
            com.android.dx.rop.cst.CstNat r3 = new com.android.dx.rop.cst.CstNat
            r3.<init>(r1, r0)
            r2.<init>(r3)
            return r2
        L188:
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r7.input
            int r0 = r0.readUnsignedShort()
            com.android.dx.rop.cst.ConstantPool r1 = r7.pool
            com.android.dx.rop.cst.Constant r0 = r1.get(r0)
            com.android.dx.rop.cst.CstString r0 = (com.android.dx.rop.cst.CstString) r0
            java.lang.String r0 = r0.getString()
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.internReturnType(r0)
            com.android.dx.cf.iface.ParseObserver r1 = r7.observer
            if (r1 == 0) goto L1ba
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "class_info: "
            r1.append(r2)
            java.lang.String r2 = r0.toHuman()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7.parsed(r3, r1)
        L1ba:
            com.android.dx.rop.cst.CstType r1 = new com.android.dx.rop.cst.CstType
            r1.<init>(r0)
            return r1
        L1c0:
            com.android.dx.rop.cst.Constant r0 = r7.parseConstant()
            com.android.dx.rop.cst.CstInteger r0 = (com.android.dx.rop.cst.CstInteger) r0
            int r0 = r0.getValue()
            com.android.dx.rop.cst.CstShort r0 = com.android.dx.rop.cst.CstShort.make(r0)
            return r0
        L1cf:
            com.android.dx.rop.cst.Constant r0 = r7.parseConstant()
            com.android.dx.rop.cst.CstFloat r0 = (com.android.dx.rop.cst.CstFloat) r0
            return r0
        L1d6:
            com.android.dx.rop.annotation.AnnotationVisibility r0 = com.android.dx.rop.annotation.AnnotationVisibility.EMBEDDED
            com.android.dx.rop.annotation.Annotation r0 = r7.parseAnnotation(r0)
            com.android.dx.rop.cst.CstAnnotation r1 = new com.android.dx.rop.cst.CstAnnotation
            r1.<init>(r0)
            return r1
    }

    private void parsed(int r4, java.lang.String r5) {
            r3 = this;
            com.android.dx.cf.iface.ParseObserver r0 = r3.observer
            com.android.dx.util.ByteArray r1 = r3.bytes
            int r2 = r3.parseCursor
            r0.parsed(r1, r2, r4, r5)
            int r5 = r3.parseCursor
            int r5 = r5 + r4
            r3.parseCursor = r5
            return
    }

    private void requireLength(int r2) throws java.io.IOException {
            r1 = this;
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r1.input
            int r0 = r0.available()
            if (r0 < r2) goto L9
            return
        L9:
            com.android.dx.cf.iface.ParseException r2 = new com.android.dx.cf.iface.ParseException
            java.lang.String r0 = "truncated annotation attribute"
            r2.<init>(r0)
            throw r2
    }

    public com.android.dx.rop.annotation.Annotations parseAnnotationAttribute(com.android.dx.rop.annotation.AnnotationVisibility r3) {
            r2 = this;
            com.android.dx.rop.annotation.Annotations r3 = r2.parseAnnotations(r3)     // Catch: java.io.IOException -> L15
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r2.input     // Catch: java.io.IOException -> L15
            int r0 = r0.available()     // Catch: java.io.IOException -> L15
            if (r0 != 0) goto Ld
            return r3
        Ld:
            com.android.dx.cf.iface.ParseException r3 = new com.android.dx.cf.iface.ParseException     // Catch: java.io.IOException -> L15
            java.lang.String r0 = "extra data in attribute"
            r3.<init>(r0)     // Catch: java.io.IOException -> L15
            throw r3     // Catch: java.io.IOException -> L15
        L15:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "shouldn't happen"
            r0.<init>(r1, r3)
            throw r0
    }

    public com.android.dx.rop.annotation.AnnotationsList parseParameterAttribute(com.android.dx.rop.annotation.AnnotationVisibility r3) {
            r2 = this;
            com.android.dx.rop.annotation.AnnotationsList r3 = r2.parseAnnotationsList(r3)     // Catch: java.io.IOException -> L15
            com.android.dx.util.ByteArray$MyDataInputStream r0 = r2.input     // Catch: java.io.IOException -> L15
            int r0 = r0.available()     // Catch: java.io.IOException -> L15
            if (r0 != 0) goto Ld
            return r3
        Ld:
            com.android.dx.cf.iface.ParseException r3 = new com.android.dx.cf.iface.ParseException     // Catch: java.io.IOException -> L15
            java.lang.String r0 = "extra data in attribute"
            r3.<init>(r0)     // Catch: java.io.IOException -> L15
            throw r3     // Catch: java.io.IOException -> L15
        L15:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "shouldn't happen"
            r0.<init>(r1, r3)
            throw r0
    }

    public com.android.dx.rop.cst.Constant parseValueAttribute() {
            r3 = this;
            com.android.dx.rop.cst.Constant r0 = r3.parseValue()     // Catch: java.io.IOException -> L15
            com.android.dx.util.ByteArray$MyDataInputStream r1 = r3.input     // Catch: java.io.IOException -> L15
            int r1 = r1.available()     // Catch: java.io.IOException -> L15
            if (r1 != 0) goto Ld
            return r0
        Ld:
            com.android.dx.cf.iface.ParseException r0 = new com.android.dx.cf.iface.ParseException     // Catch: java.io.IOException -> L15
            java.lang.String r1 = "extra data in attribute"
            r0.<init>(r1)     // Catch: java.io.IOException -> L15
            throw r0     // Catch: java.io.IOException -> L15
        L15:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "shouldn't happen"
            r1.<init>(r2, r0)
            throw r1
    }
}
