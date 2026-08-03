package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
public class StdAttributeFactory extends com.android.dx.cf.direct.AttributeFactory {
    public static final com.android.dx.cf.direct.StdAttributeFactory THE_ONE = null;

    static {
            com.android.dx.cf.direct.StdAttributeFactory r0 = new com.android.dx.cf.direct.StdAttributeFactory
            r0.<init>()
            com.android.dx.cf.direct.StdAttributeFactory.THE_ONE = r0
            return
    }

    public StdAttributeFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    private com.android.dx.cf.iface.Attribute annotationDefault(com.android.dx.cf.direct.DirectClassFile r2, int r3, int r4, com.android.dx.cf.iface.ParseObserver r5) {
            r1 = this;
            r0 = 2
            if (r4 >= r0) goto L6
            throwSeverelyTruncated()
        L6:
            com.android.dx.cf.direct.AnnotationParser r0 = new com.android.dx.cf.direct.AnnotationParser
            r0.<init>(r2, r3, r4, r5)
            com.android.dx.rop.cst.Constant r2 = r0.parseValueAttribute()
            com.android.dx.cf.attrib.AttAnnotationDefault r3 = new com.android.dx.cf.attrib.AttAnnotationDefault
            r3.<init>(r2, r4)
            return r3
    }

    private com.android.dx.cf.iface.Attribute bootstrapMethods(com.android.dx.cf.direct.DirectClassFile r9, int r10, int r11, com.android.dx.cf.iface.ParseObserver r12) {
            r8 = this;
            r0 = 2
            if (r11 >= r0) goto L8
            com.android.dx.cf.iface.Attribute r9 = throwSeverelyTruncated()
            return r9
        L8:
            com.android.dx.util.ByteArray r1 = r9.getBytes()
            int r4 = r1.getUnsignedShort(r10)
            if (r12 == 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "num_boostrap_methods: "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u2(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12.parsed(r1, r10, r0, r2)
        L2a:
            int r5 = r10 + 2
            int r6 = r11 + (-2)
            com.android.dx.rop.cst.ConstantPool r2 = r9.getConstantPool()
            com.android.dx.rop.cst.CstType r3 = r9.getThisClass()
            r0 = r8
            r7 = r12
            com.android.dx.cf.code.BootstrapMethodsList r9 = r0.parseBootstrapMethods(r1, r2, r3, r4, r5, r6, r7)
            com.android.dx.cf.attrib.AttBootstrapMethods r10 = new com.android.dx.cf.attrib.AttBootstrapMethods
            r10.<init>(r9)
            return r10
    }

    private com.android.dx.cf.iface.Attribute code(com.android.dx.cf.direct.DirectClassFile r23, int r24, int r25, com.android.dx.cf.iface.ParseObserver r26) {
            r22 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = 12
            if (r1 >= r3) goto Lf
            com.android.dx.cf.iface.Attribute r0 = throwSeverelyTruncated()
            return r0
        Lf:
            com.android.dx.util.ByteArray r3 = r23.getBytes()
            com.android.dx.rop.cst.ConstantPool r4 = r23.getConstantPool()
            int r6 = r3.getUnsignedShort(r0)
            int r5 = r0 + 2
            int r7 = r3.getUnsignedShort(r5)
            int r8 = r0 + 4
            int r9 = r3.getInt(r8)
            r10 = 2
            if (r2 == 0) goto L73
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "max_stack: "
            r11.append(r12)
            java.lang.String r12 = com.android.dx.util.Hex.u2(r6)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r2.parsed(r3, r0, r10, r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "max_locals: "
            r11.append(r12)
            java.lang.String r12 = com.android.dx.util.Hex.u2(r7)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r2.parsed(r3, r5, r10, r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "code_length: "
            r5.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u4(r9)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r11 = 4
            r2.parsed(r3, r8, r11, r5)
        L73:
            int r5 = r0 + 8
            int r1 = r1 + (-8)
            int r8 = r9 + 4
            if (r1 >= r8) goto L80
            com.android.dx.cf.iface.Attribute r0 = throwTruncated()
            return r0
        L80:
            int r8 = r5 + r9
            int r1 = r1 - r9
            com.android.dx.cf.code.BytecodeArray r9 = new com.android.dx.cf.code.BytecodeArray
            com.android.dx.util.ByteArray r5 = r3.slice(r5, r8)
            r9.<init>(r5, r4)
            if (r2 == 0) goto L9a
            com.android.dx.cf.direct.CodeObserver r5 = new com.android.dx.cf.direct.CodeObserver
            com.android.dx.util.ByteArray r11 = r9.getBytes()
            r5.<init>(r11, r2)
            r9.forEach(r5)
        L9a:
            int r5 = r3.getUnsignedShort(r8)
            if (r5 != 0) goto La3
            com.android.dx.cf.code.ByteCatchList r11 = com.android.dx.cf.code.ByteCatchList.EMPTY
            goto La8
        La3:
            com.android.dx.cf.code.ByteCatchList r11 = new com.android.dx.cf.code.ByteCatchList
            r11.<init>(r5)
        La8:
            if (r2 == 0) goto Lc2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "exception_table_length: "
            r12.append(r13)
            java.lang.String r13 = com.android.dx.util.Hex.u2(r5)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r2.parsed(r3, r8, r10, r12)
        Lc2:
            int r8 = r8 + r10
            int r1 = r1 + (-2)
            int r12 = r5 * 8
            int r12 = r12 + r10
            if (r1 >= r12) goto Lcf
            com.android.dx.cf.iface.Attribute r0 = throwTruncated()
            return r0
        Lcf:
            r10 = 0
        Ld0:
            if (r10 >= r5) goto L150
            if (r2 == 0) goto Ld8
            r12 = 1
            r2.changeIndent(r12)
        Ld8:
            int r18 = r3.getUnsignedShort(r8)
            int r12 = r8 + 2
            int r19 = r3.getUnsignedShort(r12)
            int r12 = r8 + 4
            int r20 = r3.getUnsignedShort(r12)
            int r12 = r8 + 6
            int r12 = r3.getUnsignedShort(r12)
            com.android.dx.rop.cst.Constant r12 = r4.get0Ok(r12)
            r21 = r12
            com.android.dx.rop.cst.CstType r21 = (com.android.dx.rop.cst.CstType) r21
            r12 = r11
            r13 = r10
            r14 = r18
            r15 = r19
            r16 = r20
            r17 = r21
            r12.set(r13, r14, r15, r16, r17)
            if (r2 == 0) goto L143
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = com.android.dx.util.Hex.u2(r18)
            r12.append(r13)
            java.lang.String r13 = ".."
            r12.append(r13)
            java.lang.String r13 = com.android.dx.util.Hex.u2(r19)
            r12.append(r13)
            java.lang.String r13 = " -> "
            r12.append(r13)
            java.lang.String r13 = com.android.dx.util.Hex.u2(r20)
            r12.append(r13)
            java.lang.String r13 = " "
            r12.append(r13)
            if (r21 != 0) goto L133
            java.lang.String r13 = "<any>"
            goto L137
        L133:
            java.lang.String r13 = r21.toHuman()
        L137:
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r13 = 8
            r2.parsed(r3, r8, r13, r12)
        L143:
            int r8 = r8 + 8
            int r1 = r1 + (-8)
            if (r2 == 0) goto L14d
            r12 = -1
            r2.changeIndent(r12)
        L14d:
            int r10 = r10 + 1
            goto Ld0
        L150:
            r11.setImmutable()
            com.android.dx.cf.direct.AttributeListParser r3 = new com.android.dx.cf.direct.AttributeListParser
            r4 = 3
            r12 = r22
            r5 = r23
            r3.<init>(r5, r4, r8, r12)
            r3.setObserver(r2)
            com.android.dx.cf.iface.StdAttributeList r10 = r3.getList()
            r10.setImmutable()
            int r2 = r3.getEndOffset()
            int r2 = r2 - r8
            if (r2 == r1) goto L175
            int r8 = r8 - r0
            int r2 = r2 + r8
            com.android.dx.cf.iface.Attribute r0 = throwBadLength(r2)
            return r0
        L175:
            com.android.dx.cf.attrib.AttCode r0 = new com.android.dx.cf.attrib.AttCode
            r5 = r0
            r8 = r9
            r9 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            return r0
    }

    private com.android.dx.cf.iface.Attribute constantValue(com.android.dx.cf.direct.DirectClassFile r5, int r6, int r7, com.android.dx.cf.iface.ParseObserver r8) {
            r4 = this;
            r0 = 2
            if (r7 == r0) goto L8
            com.android.dx.cf.iface.Attribute r5 = throwBadLength(r0)
            return r5
        L8:
            com.android.dx.util.ByteArray r7 = r5.getBytes()
            com.android.dx.rop.cst.ConstantPool r5 = r5.getConstantPool()
            int r1 = r7.getUnsignedShort(r6)
            com.android.dx.rop.cst.Constant r5 = r5.get(r1)
            com.android.dx.rop.cst.TypedConstant r5 = (com.android.dx.rop.cst.TypedConstant) r5
            com.android.dx.cf.attrib.AttConstantValue r1 = new com.android.dx.cf.attrib.AttConstantValue
            r1.<init>(r5)
            if (r8 == 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "value: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r8.parsed(r7, r6, r0, r5)
        L35:
            return r1
    }

    private com.android.dx.cf.iface.Attribute deprecated(com.android.dx.cf.direct.DirectClassFile r1, int r2, int r3, com.android.dx.cf.iface.ParseObserver r4) {
            r0 = this;
            if (r3 == 0) goto L8
            r1 = 0
            com.android.dx.cf.iface.Attribute r1 = throwBadLength(r1)
            return r1
        L8:
            com.android.dx.cf.attrib.AttDeprecated r1 = new com.android.dx.cf.attrib.AttDeprecated
            r1.<init>()
            return r1
    }

    private com.android.dx.cf.iface.Attribute enclosingMethod(com.android.dx.cf.direct.DirectClassFile r6, int r7, int r8, com.android.dx.cf.iface.ParseObserver r9) {
            r5 = this;
            r0 = 4
            if (r8 == r0) goto L6
            throwBadLength(r0)
        L6:
            com.android.dx.util.ByteArray r8 = r6.getBytes()
            com.android.dx.rop.cst.ConstantPool r6 = r6.getConstantPool()
            int r0 = r8.getUnsignedShort(r7)
            com.android.dx.rop.cst.Constant r0 = r6.get(r0)
            com.android.dx.rop.cst.CstType r0 = (com.android.dx.rop.cst.CstType) r0
            int r1 = r7 + 2
            int r2 = r8.getUnsignedShort(r1)
            com.android.dx.rop.cst.Constant r6 = r6.get0Ok(r2)
            com.android.dx.rop.cst.CstNat r6 = (com.android.dx.rop.cst.CstNat) r6
            com.android.dx.cf.attrib.AttEnclosingMethod r2 = new com.android.dx.cf.attrib.AttEnclosingMethod
            r2.<init>(r0, r6)
            if (r9 == 0) goto L58
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "class: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r3 = 2
            r9.parsed(r8, r7, r3, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "method: "
            r7.append(r0)
            java.lang.String r6 = com.android.dx.cf.direct.DirectClassFile.stringOrNone(r6)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r9.parsed(r8, r1, r3, r6)
        L58:
            return r2
    }

    private com.android.dx.cf.iface.Attribute exceptions(com.android.dx.cf.direct.DirectClassFile r6, int r7, int r8, com.android.dx.cf.iface.ParseObserver r9) {
            r5 = this;
            r0 = 2
            if (r8 >= r0) goto L8
            com.android.dx.cf.iface.Attribute r6 = throwSeverelyTruncated()
            return r6
        L8:
            com.android.dx.util.ByteArray r1 = r6.getBytes()
            int r2 = r1.getUnsignedShort(r7)
            if (r9 == 0) goto L2a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "number_of_exceptions: "
            r3.append(r4)
            java.lang.String r4 = com.android.dx.util.Hex.u2(r2)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r9.parsed(r1, r7, r0, r3)
        L2a:
            int r7 = r7 + r0
            int r8 = r8 + (-2)
            int r9 = r2 * 2
            if (r8 == r9) goto L35
            int r9 = r9 + r0
            throwBadLength(r9)
        L35:
            com.android.dx.rop.type.TypeList r6 = r6.makeTypeList(r7, r2)
            com.android.dx.cf.attrib.AttExceptions r7 = new com.android.dx.cf.attrib.AttExceptions
            r7.<init>(r6)
            return r7
    }

    private com.android.dx.cf.iface.Attribute innerClasses(com.android.dx.cf.direct.DirectClassFile r22, int r23, int r24, com.android.dx.cf.iface.ParseObserver r25) {
            r21 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = 2
            if (r1 >= r3) goto Le
            com.android.dx.cf.iface.Attribute r0 = throwSeverelyTruncated()
            return r0
        Le:
            com.android.dx.util.ByteArray r4 = r22.getBytes()
            com.android.dx.rop.cst.ConstantPool r5 = r22.getConstantPool()
            int r6 = r4.getUnsignedShort(r0)
            if (r2 == 0) goto L34
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "number_of_classes: "
            r7.append(r8)
            java.lang.String r8 = com.android.dx.util.Hex.u2(r6)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r2.parsed(r4, r0, r3, r7)
        L34:
            int r0 = r0 + r3
            int r1 = r1 + (-2)
            int r7 = r6 * 8
            if (r1 == r7) goto L3f
            int r7 = r7 + r3
            throwBadLength(r7)
        L3f:
            com.android.dx.cf.attrib.InnerClassList r1 = new com.android.dx.cf.attrib.InnerClassList
            r1.<init>(r6)
            r7 = 0
        L45:
            if (r7 >= r6) goto Lee
            int r8 = r4.getUnsignedShort(r0)
            int r14 = r0 + 2
            int r9 = r4.getUnsignedShort(r14)
            int r15 = r0 + 4
            int r10 = r4.getUnsignedShort(r15)
            int r13 = r0 + 6
            int r16 = r4.getUnsignedShort(r13)
            com.android.dx.rop.cst.Constant r8 = r5.get(r8)
            r17 = r8
            com.android.dx.rop.cst.CstType r17 = (com.android.dx.rop.cst.CstType) r17
            com.android.dx.rop.cst.Constant r8 = r5.get0Ok(r9)
            r18 = r8
            com.android.dx.rop.cst.CstType r18 = (com.android.dx.rop.cst.CstType) r18
            com.android.dx.rop.cst.Constant r8 = r5.get0Ok(r10)
            r19 = r8
            com.android.dx.rop.cst.CstString r19 = (com.android.dx.rop.cst.CstString) r19
            r8 = r1
            r9 = r7
            r10 = r17
            r11 = r18
            r12 = r19
            r20 = r13
            r13 = r16
            r8.set(r9, r10, r11, r12, r13)
            if (r2 == 0) goto Le8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "inner_class: "
            r8.append(r9)
            java.lang.String r9 = com.android.dx.cf.direct.DirectClassFile.stringOrNone(r17)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r2.parsed(r4, r0, r3, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "  outer_class: "
            r8.append(r9)
            java.lang.String r9 = com.android.dx.cf.direct.DirectClassFile.stringOrNone(r18)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r2.parsed(r4, r14, r3, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "  name: "
            r8.append(r9)
            java.lang.String r9 = com.android.dx.cf.direct.DirectClassFile.stringOrNone(r19)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r2.parsed(r4, r15, r3, r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "  access_flags: "
            r8.append(r9)
            java.lang.String r9 = com.android.dx.rop.code.AccessFlags.innerClassString(r16)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r9 = r20
            r2.parsed(r4, r9, r3, r8)
        Le8:
            int r0 = r0 + 8
            int r7 = r7 + 1
            goto L45
        Lee:
            r1.setImmutable()
            com.android.dx.cf.attrib.AttInnerClasses r0 = new com.android.dx.cf.attrib.AttInnerClasses
            r0.<init>(r1)
            return r0
    }

    private com.android.dx.cf.iface.Attribute lineNumberTable(com.android.dx.cf.direct.DirectClassFile r6, int r7, int r8, com.android.dx.cf.iface.ParseObserver r9) {
            r5 = this;
            r0 = 2
            if (r8 >= r0) goto L8
            com.android.dx.cf.iface.Attribute r6 = throwSeverelyTruncated()
            return r6
        L8:
            com.android.dx.util.ByteArray r6 = r6.getBytes()
            int r1 = r6.getUnsignedShort(r7)
            if (r9 == 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "line_number_table_length: "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u2(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r9.parsed(r6, r7, r0, r2)
        L2a:
            int r7 = r7 + r0
            int r8 = r8 + (-2)
            int r2 = r1 * 4
            if (r8 == r2) goto L35
            int r2 = r2 + r0
            throwBadLength(r2)
        L35:
            com.android.dx.cf.code.LineNumberList r8 = new com.android.dx.cf.code.LineNumberList
            r8.<init>(r1)
            r0 = 0
        L3b:
            if (r0 >= r1) goto L6d
            int r2 = r6.getUnsignedShort(r7)
            int r3 = r7 + 2
            int r3 = r6.getUnsignedShort(r3)
            r8.set(r0, r2, r3)
            if (r9 == 0) goto L68
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = com.android.dx.util.Hex.u2(r2)
            r4.append(r2)
            java.lang.String r2 = " "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r3 = 4
            r9.parsed(r6, r7, r3, r2)
        L68:
            int r7 = r7 + 4
            int r0 = r0 + 1
            goto L3b
        L6d:
            r8.setImmutable()
            com.android.dx.cf.attrib.AttLineNumberTable r6 = new com.android.dx.cf.attrib.AttLineNumberTable
            r6.<init>(r8)
            return r6
    }

    private com.android.dx.cf.iface.Attribute localVariableTable(com.android.dx.cf.direct.DirectClassFile r9, int r10, int r11, com.android.dx.cf.iface.ParseObserver r12) {
            r8 = this;
            r0 = 2
            if (r11 >= r0) goto L8
            com.android.dx.cf.iface.Attribute r9 = throwSeverelyTruncated()
            return r9
        L8:
            com.android.dx.util.ByteArray r1 = r9.getBytes()
            int r6 = r1.getUnsignedShort(r10)
            if (r12 == 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "local_variable_table_length: "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u2(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12.parsed(r1, r10, r0, r2)
        L2a:
            int r0 = r10 + 2
            int r10 = r10 + r11
            com.android.dx.util.ByteArray r3 = r1.slice(r0, r10)
            com.android.dx.rop.cst.ConstantPool r4 = r9.getConstantPool()
            r7 = 0
            r2 = r8
            r5 = r12
            com.android.dx.cf.code.LocalVariableList r9 = r2.parseLocalVariables(r3, r4, r5, r6, r7)
            com.android.dx.cf.attrib.AttLocalVariableTable r10 = new com.android.dx.cf.attrib.AttLocalVariableTable
            r10.<init>(r9)
            return r10
    }

    private com.android.dx.cf.iface.Attribute localVariableTypeTable(com.android.dx.cf.direct.DirectClassFile r9, int r10, int r11, com.android.dx.cf.iface.ParseObserver r12) {
            r8 = this;
            r0 = 2
            if (r11 >= r0) goto L8
            com.android.dx.cf.iface.Attribute r9 = throwSeverelyTruncated()
            return r9
        L8:
            com.android.dx.util.ByteArray r1 = r9.getBytes()
            int r6 = r1.getUnsignedShort(r10)
            if (r12 == 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "local_variable_type_table_length: "
            r2.append(r3)
            java.lang.String r3 = com.android.dx.util.Hex.u2(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r12.parsed(r1, r10, r0, r2)
        L2a:
            int r0 = r10 + 2
            int r10 = r10 + r11
            com.android.dx.util.ByteArray r3 = r1.slice(r0, r10)
            com.android.dx.rop.cst.ConstantPool r4 = r9.getConstantPool()
            r7 = 1
            r2 = r8
            r5 = r12
            com.android.dx.cf.code.LocalVariableList r9 = r2.parseLocalVariables(r3, r4, r5, r6, r7)
            com.android.dx.cf.attrib.AttLocalVariableTypeTable r10 = new com.android.dx.cf.attrib.AttLocalVariableTypeTable
            r10.<init>(r9)
            return r10
    }

    private com.android.dx.cf.code.BootstrapMethodsList parseBootstrapMethods(com.android.dx.util.ByteArray r17, com.android.dx.rop.cst.ConstantPool r18, com.android.dx.rop.cst.CstType r19, int r20, int r21, int r22, com.android.dx.cf.iface.ParseObserver r23) throws com.android.dx.cf.iface.ParseException {
            r16 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r23
            com.android.dx.cf.code.BootstrapMethodsList r4 = new com.android.dx.cf.code.BootstrapMethodsList
            r4.<init>(r2)
            r6 = r21
            r7 = r22
            r8 = 0
        L12:
            if (r8 >= r2) goto Lb0
            r9 = 4
            if (r7 >= r9) goto L1a
            throwTruncated()
        L1a:
            int r9 = r0.getUnsignedShort(r6)
            int r10 = r6 + 2
            int r11 = r0.getUnsignedShort(r10)
            r12 = 2
            if (r3 == 0) goto L57
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "bootstrap_method_ref: "
            r13.append(r14)
            java.lang.String r14 = com.android.dx.util.Hex.u2(r9)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r3.parsed(r0, r6, r12, r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "num_bootstrap_arguments: "
            r13.append(r14)
            java.lang.String r14 = com.android.dx.util.Hex.u2(r11)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r3.parsed(r0, r10, r12, r13)
        L57:
            int r6 = r6 + 4
            int r7 = r7 + (-4)
            int r10 = r11 * 2
            if (r7 >= r10) goto L62
            throwTruncated()
        L62:
            com.android.dx.cf.code.BootstrapMethodArgumentsList r10 = new com.android.dx.cf.code.BootstrapMethodArgumentsList
            r10.<init>(r11)
            r13 = 0
        L68:
            if (r13 >= r11) goto L9e
            int r14 = r0.getUnsignedShort(r6)
            if (r3 == 0) goto L90
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r5 = "bootstrap_arguments["
            r15.append(r5)
            r15.append(r13)
            java.lang.String r5 = "]"
            r15.append(r5)
            java.lang.String r5 = com.android.dx.util.Hex.u2(r14)
            r15.append(r5)
            java.lang.String r5 = r15.toString()
            r3.parsed(r0, r6, r12, r5)
        L90:
            com.android.dx.rop.cst.Constant r5 = r1.get(r14)
            r10.set(r13, r5)
            int r13 = r13 + 1
            int r6 = r6 + 2
            int r7 = r7 + (-2)
            goto L68
        L9e:
            r10.setImmutable()
            com.android.dx.rop.cst.Constant r5 = r1.get(r9)
            com.android.dx.rop.cst.CstMethodHandle r5 = (com.android.dx.rop.cst.CstMethodHandle) r5
            r9 = r19
            r4.set(r8, r9, r5, r10)
            int r8 = r8 + 1
            goto L12
        Lb0:
            r4.setImmutable()
            if (r7 == 0) goto Lb8
            throwBadLength(r7)
        Lb8:
            return r4
    }

    private com.android.dx.cf.code.LocalVariableList parseLocalVariables(com.android.dx.util.ByteArray r21, com.android.dx.rop.cst.ConstantPool r22, com.android.dx.cf.iface.ParseObserver r23, int r24, boolean r25) {
            r20 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            java.lang.String r3 = " "
            int r4 = r21.size()
            int r5 = r2 * 10
            if (r4 == r5) goto L15
            int r5 = r5 + 2
            throwBadLength(r5)
        L15:
            com.android.dx.util.ByteArray$MyDataInputStream r4 = r21.makeDataInputStream()
            com.android.dx.cf.code.LocalVariableList r13 = new com.android.dx.cf.code.LocalVariableList
            r13.<init>(r2)
            r5 = 0
            r14 = r5
        L20:
            if (r14 >= r2) goto Lb4
            int r15 = r4.readUnsignedShort()     // Catch: java.io.IOException -> La4
            int r16 = r4.readUnsignedShort()     // Catch: java.io.IOException -> La4
            int r5 = r4.readUnsignedShort()     // Catch: java.io.IOException -> La4
            int r6 = r4.readUnsignedShort()     // Catch: java.io.IOException -> La4
            int r17 = r4.readUnsignedShort()     // Catch: java.io.IOException -> La4
            com.android.dx.rop.cst.Constant r5 = r0.get(r5)     // Catch: java.io.IOException -> La4
            r18 = r5
            com.android.dx.rop.cst.CstString r18 = (com.android.dx.rop.cst.CstString) r18     // Catch: java.io.IOException -> La4
            com.android.dx.rop.cst.Constant r5 = r0.get(r6)     // Catch: java.io.IOException -> La4
            r19 = r5
            com.android.dx.rop.cst.CstString r19 = (com.android.dx.rop.cst.CstString) r19     // Catch: java.io.IOException -> La4
            r5 = 0
            if (r25 == 0) goto L4d
            r10 = r5
            r11 = r19
            goto L50
        L4d:
            r11 = r5
            r10 = r19
        L50:
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r18
            r12 = r17
            r5.set(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.io.IOException -> La4
            if (r1 == 0) goto La6
            int r5 = r14 * 10
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> La4
            r6.<init>()     // Catch: java.io.IOException -> La4
            java.lang.String r7 = com.android.dx.util.Hex.u2(r15)     // Catch: java.io.IOException -> La4
            r6.append(r7)     // Catch: java.io.IOException -> La4
            java.lang.String r7 = ".."
            r6.append(r7)     // Catch: java.io.IOException -> La4
            int r15 = r15 + r16
            java.lang.String r7 = com.android.dx.util.Hex.u2(r15)     // Catch: java.io.IOException -> La4
            r6.append(r7)     // Catch: java.io.IOException -> La4
            r6.append(r3)     // Catch: java.io.IOException -> La4
            java.lang.String r7 = com.android.dx.util.Hex.u2(r17)     // Catch: java.io.IOException -> La4
            r6.append(r7)     // Catch: java.io.IOException -> La4
            r6.append(r3)     // Catch: java.io.IOException -> La4
            java.lang.String r7 = r18.toHuman()     // Catch: java.io.IOException -> La4
            r6.append(r7)     // Catch: java.io.IOException -> La4
            r6.append(r3)     // Catch: java.io.IOException -> La4
            java.lang.String r7 = r19.toHuman()     // Catch: java.io.IOException -> La4
            r6.append(r7)     // Catch: java.io.IOException -> La4
            java.lang.String r6 = r6.toString()     // Catch: java.io.IOException -> La4
            r7 = 10
            r8 = r21
            r1.parsed(r8, r5, r7, r6)     // Catch: java.io.IOException -> La4
            goto La8
        La4:
            r0 = move-exception
            goto Lac
        La6:
            r8 = r21
        La8:
            int r14 = r14 + 1
            goto L20
        Lac:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "shouldn't happen"
            r1.<init>(r2, r0)
            throw r1
        Lb4:
            r13.setImmutable()
            return r13
    }

    private com.android.dx.cf.iface.Attribute runtimeInvisibleAnnotations(com.android.dx.cf.direct.DirectClassFile r2, int r3, int r4, com.android.dx.cf.iface.ParseObserver r5) {
            r1 = this;
            r0 = 2
            if (r4 >= r0) goto L6
            throwSeverelyTruncated()
        L6:
            com.android.dx.cf.direct.AnnotationParser r0 = new com.android.dx.cf.direct.AnnotationParser
            r0.<init>(r2, r3, r4, r5)
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.BUILD
            com.android.dx.rop.annotation.Annotations r2 = r0.parseAnnotationAttribute(r2)
            com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations r3 = new com.android.dx.cf.attrib.AttRuntimeInvisibleAnnotations
            r3.<init>(r2, r4)
            return r3
    }

    private com.android.dx.cf.iface.Attribute runtimeInvisibleParameterAnnotations(com.android.dx.cf.direct.DirectClassFile r2, int r3, int r4, com.android.dx.cf.iface.ParseObserver r5) {
            r1 = this;
            r0 = 2
            if (r4 >= r0) goto L6
            throwSeverelyTruncated()
        L6:
            com.android.dx.cf.direct.AnnotationParser r0 = new com.android.dx.cf.direct.AnnotationParser
            r0.<init>(r2, r3, r4, r5)
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.BUILD
            com.android.dx.rop.annotation.AnnotationsList r2 = r0.parseParameterAttribute(r2)
            com.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations r3 = new com.android.dx.cf.attrib.AttRuntimeInvisibleParameterAnnotations
            r3.<init>(r2, r4)
            return r3
    }

    private com.android.dx.cf.iface.Attribute runtimeVisibleAnnotations(com.android.dx.cf.direct.DirectClassFile r2, int r3, int r4, com.android.dx.cf.iface.ParseObserver r5) {
            r1 = this;
            r0 = 2
            if (r4 >= r0) goto L6
            throwSeverelyTruncated()
        L6:
            com.android.dx.cf.direct.AnnotationParser r0 = new com.android.dx.cf.direct.AnnotationParser
            r0.<init>(r2, r3, r4, r5)
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.RUNTIME
            com.android.dx.rop.annotation.Annotations r2 = r0.parseAnnotationAttribute(r2)
            com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations r3 = new com.android.dx.cf.attrib.AttRuntimeVisibleAnnotations
            r3.<init>(r2, r4)
            return r3
    }

    private com.android.dx.cf.iface.Attribute runtimeVisibleParameterAnnotations(com.android.dx.cf.direct.DirectClassFile r2, int r3, int r4, com.android.dx.cf.iface.ParseObserver r5) {
            r1 = this;
            r0 = 2
            if (r4 >= r0) goto L6
            throwSeverelyTruncated()
        L6:
            com.android.dx.cf.direct.AnnotationParser r0 = new com.android.dx.cf.direct.AnnotationParser
            r0.<init>(r2, r3, r4, r5)
            com.android.dx.rop.annotation.AnnotationVisibility r2 = com.android.dx.rop.annotation.AnnotationVisibility.RUNTIME
            com.android.dx.rop.annotation.AnnotationsList r2 = r0.parseParameterAttribute(r2)
            com.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations r3 = new com.android.dx.cf.attrib.AttRuntimeVisibleParameterAnnotations
            r3.<init>(r2, r4)
            return r3
    }

    private com.android.dx.cf.iface.Attribute signature(com.android.dx.cf.direct.DirectClassFile r5, int r6, int r7, com.android.dx.cf.iface.ParseObserver r8) {
            r4 = this;
            r0 = 2
            if (r7 == r0) goto L6
            throwBadLength(r0)
        L6:
            com.android.dx.util.ByteArray r7 = r5.getBytes()
            com.android.dx.rop.cst.ConstantPool r5 = r5.getConstantPool()
            int r1 = r7.getUnsignedShort(r6)
            com.android.dx.rop.cst.Constant r5 = r5.get(r1)
            com.android.dx.rop.cst.CstString r5 = (com.android.dx.rop.cst.CstString) r5
            com.android.dx.cf.attrib.AttSignature r1 = new com.android.dx.cf.attrib.AttSignature
            r1.<init>(r5)
            if (r8 == 0) goto L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "signature: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r8.parsed(r7, r6, r0, r5)
        L33:
            return r1
    }

    private com.android.dx.cf.iface.Attribute sourceDebugExtension(com.android.dx.cf.direct.DirectClassFile r5, int r6, int r7, com.android.dx.cf.iface.ParseObserver r8) {
            r4 = this;
            com.android.dx.util.ByteArray r5 = r5.getBytes()
            int r0 = r6 + r7
            com.android.dx.util.ByteArray r5 = r5.slice(r6, r0)
            com.android.dx.rop.cst.CstString r0 = new com.android.dx.rop.cst.CstString
            r0.<init>(r5)
            com.android.dx.cf.attrib.AttSourceDebugExtension r1 = new com.android.dx.cf.attrib.AttSourceDebugExtension
            r1.<init>(r0)
            if (r8 == 0) goto L2e
            java.lang.String r0 = r0.getString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "sourceDebugExtension: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r8.parsed(r5, r6, r7, r0)
        L2e:
            return r1
    }

    private com.android.dx.cf.iface.Attribute sourceFile(com.android.dx.cf.direct.DirectClassFile r5, int r6, int r7, com.android.dx.cf.iface.ParseObserver r8) {
            r4 = this;
            r0 = 2
            if (r7 == r0) goto L6
            throwBadLength(r0)
        L6:
            com.android.dx.util.ByteArray r7 = r5.getBytes()
            com.android.dx.rop.cst.ConstantPool r5 = r5.getConstantPool()
            int r1 = r7.getUnsignedShort(r6)
            com.android.dx.rop.cst.Constant r5 = r5.get(r1)
            com.android.dx.rop.cst.CstString r5 = (com.android.dx.rop.cst.CstString) r5
            com.android.dx.cf.attrib.AttSourceFile r1 = new com.android.dx.cf.attrib.AttSourceFile
            r1.<init>(r5)
            if (r8 == 0) goto L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "source: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r8.parsed(r7, r6, r0, r5)
        L33:
            return r1
    }

    private com.android.dx.cf.iface.Attribute synthetic(com.android.dx.cf.direct.DirectClassFile r1, int r2, int r3, com.android.dx.cf.iface.ParseObserver r4) {
            r0 = this;
            if (r3 == 0) goto L8
            r1 = 0
            com.android.dx.cf.iface.Attribute r1 = throwBadLength(r1)
            return r1
        L8:
            com.android.dx.cf.attrib.AttSynthetic r1 = new com.android.dx.cf.attrib.AttSynthetic
            r1.<init>()
            return r1
    }

    private static com.android.dx.cf.iface.Attribute throwBadLength(int r3) {
            com.android.dx.cf.iface.ParseException r0 = new com.android.dx.cf.iface.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bad attribute length; expected length "
            r1.append(r2)
            java.lang.String r3 = com.android.dx.util.Hex.u4(r3)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    private static com.android.dx.cf.iface.Attribute throwSeverelyTruncated() {
            com.android.dx.cf.iface.ParseException r0 = new com.android.dx.cf.iface.ParseException
            java.lang.String r1 = "severely truncated attribute"
            r0.<init>(r1)
            throw r0
    }

    private static com.android.dx.cf.iface.Attribute throwTruncated() {
            com.android.dx.cf.iface.ParseException r0 = new com.android.dx.cf.iface.ParseException
            java.lang.String r1 = "truncated attribute"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.android.dx.cf.direct.AttributeFactory
    public com.android.dx.cf.iface.Attribute parse0(com.android.dx.cf.direct.DirectClassFile r7, int r8, java.lang.String r9, int r10, int r11, com.android.dx.cf.iface.ParseObserver r12) {
            r6 = this;
            java.lang.String r0 = "Synthetic"
            java.lang.String r1 = "Signature"
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            java.lang.String r3 = "RuntimeInvisibleAnnotations"
            java.lang.String r4 = "Deprecated"
            if (r8 == 0) goto Lae
            r5 = 1
            if (r8 == r5) goto L82
            r5 = 2
            if (r8 == r5) goto L32
            r0 = 3
            if (r8 == r0) goto L17
            goto Lfe
        L17:
            java.lang.String r0 = "LineNumberTable"
            if (r9 != r0) goto L20
            com.android.dx.cf.iface.Attribute r7 = r6.lineNumberTable(r7, r10, r11, r12)
            return r7
        L20:
            java.lang.String r0 = "LocalVariableTable"
            if (r9 != r0) goto L29
            com.android.dx.cf.iface.Attribute r7 = r6.localVariableTable(r7, r10, r11, r12)
            return r7
        L29:
            java.lang.String r0 = "LocalVariableTypeTable"
            if (r9 != r0) goto Lfe
            com.android.dx.cf.iface.Attribute r7 = r6.localVariableTypeTable(r7, r10, r11, r12)
            return r7
        L32:
            java.lang.String r5 = "AnnotationDefault"
            if (r9 != r5) goto L3b
            com.android.dx.cf.iface.Attribute r7 = r6.annotationDefault(r7, r10, r11, r12)
            return r7
        L3b:
            java.lang.String r5 = "Code"
            if (r9 != r5) goto L44
            com.android.dx.cf.iface.Attribute r7 = r6.code(r7, r10, r11, r12)
            return r7
        L44:
            if (r9 != r4) goto L4b
            com.android.dx.cf.iface.Attribute r7 = r6.deprecated(r7, r10, r11, r12)
            return r7
        L4b:
            java.lang.String r4 = "Exceptions"
            if (r9 != r4) goto L54
            com.android.dx.cf.iface.Attribute r7 = r6.exceptions(r7, r10, r11, r12)
            return r7
        L54:
            if (r9 != r3) goto L5b
            com.android.dx.cf.iface.Attribute r7 = r6.runtimeInvisibleAnnotations(r7, r10, r11, r12)
            return r7
        L5b:
            if (r9 != r2) goto L62
            com.android.dx.cf.iface.Attribute r7 = r6.runtimeVisibleAnnotations(r7, r10, r11, r12)
            return r7
        L62:
            java.lang.String r2 = "RuntimeInvisibleParameterAnnotations"
            if (r9 != r2) goto L6b
            com.android.dx.cf.iface.Attribute r7 = r6.runtimeInvisibleParameterAnnotations(r7, r10, r11, r12)
            return r7
        L6b:
            java.lang.String r2 = "RuntimeVisibleParameterAnnotations"
            if (r9 != r2) goto L74
            com.android.dx.cf.iface.Attribute r7 = r6.runtimeVisibleParameterAnnotations(r7, r10, r11, r12)
            return r7
        L74:
            if (r9 != r1) goto L7b
            com.android.dx.cf.iface.Attribute r7 = r6.signature(r7, r10, r11, r12)
            return r7
        L7b:
            if (r9 != r0) goto Lfe
            com.android.dx.cf.iface.Attribute r7 = r6.synthetic(r7, r10, r11, r12)
            return r7
        L82:
            java.lang.String r5 = "ConstantValue"
            if (r9 != r5) goto L8b
            com.android.dx.cf.iface.Attribute r7 = r6.constantValue(r7, r10, r11, r12)
            return r7
        L8b:
            if (r9 != r4) goto L92
            com.android.dx.cf.iface.Attribute r7 = r6.deprecated(r7, r10, r11, r12)
            return r7
        L92:
            if (r9 != r3) goto L99
            com.android.dx.cf.iface.Attribute r7 = r6.runtimeInvisibleAnnotations(r7, r10, r11, r12)
            return r7
        L99:
            if (r9 != r2) goto La0
            com.android.dx.cf.iface.Attribute r7 = r6.runtimeVisibleAnnotations(r7, r10, r11, r12)
            return r7
        La0:
            if (r9 != r1) goto La7
            com.android.dx.cf.iface.Attribute r7 = r6.signature(r7, r10, r11, r12)
            return r7
        La7:
            if (r9 != r0) goto Lfe
            com.android.dx.cf.iface.Attribute r7 = r6.synthetic(r7, r10, r11, r12)
            return r7
        Lae:
            java.lang.String r5 = "BootstrapMethods"
            if (r9 != r5) goto Lb7
            com.android.dx.cf.iface.Attribute r7 = r6.bootstrapMethods(r7, r10, r11, r12)
            return r7
        Lb7:
            if (r9 != r4) goto Lbe
            com.android.dx.cf.iface.Attribute r7 = r6.deprecated(r7, r10, r11, r12)
            return r7
        Lbe:
            java.lang.String r4 = "EnclosingMethod"
            if (r9 != r4) goto Lc7
            com.android.dx.cf.iface.Attribute r7 = r6.enclosingMethod(r7, r10, r11, r12)
            return r7
        Lc7:
            java.lang.String r4 = "InnerClasses"
            if (r9 != r4) goto Ld0
            com.android.dx.cf.iface.Attribute r7 = r6.innerClasses(r7, r10, r11, r12)
            return r7
        Ld0:
            if (r9 != r3) goto Ld7
            com.android.dx.cf.iface.Attribute r7 = r6.runtimeInvisibleAnnotations(r7, r10, r11, r12)
            return r7
        Ld7:
            if (r9 != r2) goto Lde
            com.android.dx.cf.iface.Attribute r7 = r6.runtimeVisibleAnnotations(r7, r10, r11, r12)
            return r7
        Lde:
            if (r9 != r0) goto Le5
            com.android.dx.cf.iface.Attribute r7 = r6.synthetic(r7, r10, r11, r12)
            return r7
        Le5:
            if (r9 != r1) goto Lec
            com.android.dx.cf.iface.Attribute r7 = r6.signature(r7, r10, r11, r12)
            return r7
        Lec:
            java.lang.String r0 = "SourceDebugExtension"
            if (r9 != r0) goto Lf5
            com.android.dx.cf.iface.Attribute r7 = r6.sourceDebugExtension(r7, r10, r11, r12)
            return r7
        Lf5:
            java.lang.String r0 = "SourceFile"
            if (r9 != r0) goto Lfe
            com.android.dx.cf.iface.Attribute r7 = r6.sourceFile(r7, r10, r11, r12)
            return r7
        Lfe:
            com.android.dx.cf.iface.Attribute r7 = super.parse0(r7, r8, r9, r10, r11, r12)
            return r7
    }
}
