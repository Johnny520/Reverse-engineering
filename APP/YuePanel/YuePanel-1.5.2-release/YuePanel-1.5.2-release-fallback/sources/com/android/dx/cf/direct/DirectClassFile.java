package com.android.dx.cf.direct;

/* JADX INFO: loaded from: classes.dex */
public class DirectClassFile implements com.android.dx.cf.iface.ClassFile {
    private static final int CLASS_FILE_MAGIC = -889275714;
    private static final int CLASS_FILE_MAX_MAJOR_VERSION = 53;
    private static final int CLASS_FILE_MAX_MINOR_VERSION = 0;
    private static final int CLASS_FILE_MIN_MAJOR_VERSION = 45;
    private int accessFlags;
    private com.android.dx.cf.direct.AttributeFactory attributeFactory;
    private com.android.dx.cf.iface.StdAttributeList attributes;
    private final com.android.dx.util.ByteArray bytes;
    private com.android.dx.cf.iface.FieldList fields;
    private final java.lang.String filePath;
    private com.android.dx.rop.type.TypeList interfaces;
    private com.android.dx.cf.iface.MethodList methods;
    private com.android.dx.cf.iface.ParseObserver observer;
    private com.android.dx.rop.cst.StdConstantPool pool;
    private final boolean strictParse;
    private com.android.dx.rop.cst.CstType superClass;
    private com.android.dx.rop.cst.CstType thisClass;

    public static class DcfTypeList implements com.android.dx.rop.type.TypeList {
        private final com.android.dx.util.ByteArray bytes;
        private final com.android.dx.rop.cst.StdConstantPool pool;
        private final int size;

        public DcfTypeList(com.android.dx.util.ByteArray r5, int r6, int r7, com.android.dx.rop.cst.StdConstantPool r8, com.android.dx.cf.iface.ParseObserver r9) {
                r4 = this;
                r4.<init>()
                if (r7 < 0) goto L45
                int r0 = r7 * 2
                int r0 = r0 + r6
                com.android.dx.util.ByteArray r5 = r5.slice(r6, r0)
                r4.bytes = r5
                r4.size = r7
                r4.pool = r8
                r6 = 0
            L13:
                if (r6 >= r7) goto L44
                int r0 = r6 * 2
                int r1 = r5.getUnsignedShort(r0)
                com.android.dx.rop.cst.Constant r1 = r8.get(r1)     // Catch: java.lang.ClassCastException -> L3b
                com.android.dx.rop.cst.CstType r1 = (com.android.dx.rop.cst.CstType) r1     // Catch: java.lang.ClassCastException -> L3b
                if (r9 == 0) goto L38
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "  "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r2 = 2
                r9.parsed(r5, r0, r2, r1)
            L38:
                int r6 = r6 + 1
                goto L13
            L3b:
                r5 = move-exception
                java.lang.RuntimeException r6 = new java.lang.RuntimeException
                java.lang.String r7 = "bogus class cpi"
                r6.<init>(r7, r5)
                throw r6
            L44:
                return
            L45:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "size < 0"
                r5.<init>(r6)
                throw r5
        }

        @Override // com.android.dx.rop.type.TypeList
        public com.android.dx.rop.type.Type getType(int r2) {
                r1 = this;
                com.android.dx.util.ByteArray r0 = r1.bytes
                int r2 = r2 * 2
                int r2 = r0.getUnsignedShort(r2)
                com.android.dx.rop.cst.StdConstantPool r0 = r1.pool
                com.android.dx.rop.cst.Constant r2 = r0.get(r2)
                com.android.dx.rop.cst.CstType r2 = (com.android.dx.rop.cst.CstType) r2
                com.android.dx.rop.type.Type r2 = r2.getClassType()
                return r2
        }

        @Override // com.android.dx.rop.type.TypeList
        public int getWordCount() {
                r1 = this;
                int r0 = r1.size
                return r0
        }

        @Override // com.android.dx.rop.type.TypeList
        public boolean isMutable() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.android.dx.rop.type.TypeList
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }

        @Override // com.android.dx.rop.type.TypeList
        public com.android.dx.rop.type.TypeList withAddedType(com.android.dx.rop.type.Type r2) {
                r1 = this;
                java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "unsupported"
                r2.<init>(r0)
                throw r2
        }
    }

    public DirectClassFile(com.android.dx.util.ByteArray r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L19
            if (r2 == 0) goto L11
            r0.filePath = r2
            r0.bytes = r1
            r0.strictParse = r3
            r1 = -1
            r0.accessFlags = r1
            return
        L11:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "filePath == null"
            r1.<init>(r2)
            throw r1
        L19:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "bytes == null"
            r1.<init>(r2)
            throw r1
    }

    public DirectClassFile(byte[] r2, java.lang.String r3, boolean r4) {
            r1 = this;
            com.android.dx.util.ByteArray r0 = new com.android.dx.util.ByteArray
            r0.<init>(r2)
            r1.<init>(r0, r3, r4)
            return
    }

    private boolean isGoodMagic(int r2) {
            r1 = this;
            r0 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            if (r2 != r0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    private boolean isGoodVersion(int r3, int r4) {
            r2 = this;
            if (r3 < 0) goto L11
            r0 = 1
            r1 = 53
            if (r4 != r1) goto La
            if (r3 > 0) goto L11
            return r0
        La:
            if (r4 >= r1) goto L11
            r3 = 45
            if (r4 < r3) goto L11
            return r0
        L11:
            r3 = 0
            return r3
    }

    private void parse() {
            r3 = this;
            java.lang.String r0 = "...while parsing "
            r3.parse0()     // Catch: java.lang.RuntimeException -> L6 com.android.dx.cf.iface.ParseException -> L21
            return
        L6:
            r1 = move-exception
            com.android.dx.cf.iface.ParseException r2 = new com.android.dx.cf.iface.ParseException
            r2.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r3.filePath
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.addContext(r0)
            throw r2
        L21:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = r3.filePath
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.addContext(r0)
            throw r1
    }

    private void parse0() {
            r14 = this;
            com.android.dx.util.ByteArray r0 = r14.bytes
            int r0 = r0.size()
            r1 = 10
            if (r0 < r1) goto L281
            com.android.dx.cf.iface.ParseObserver r0 = r14.observer
            r1 = 6
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L79
            com.android.dx.util.ByteArray r4 = r14.bytes
            java.lang.String r5 = "begin classfile"
            r0.parsed(r4, r2, r2, r5)
            com.android.dx.cf.iface.ParseObserver r0 = r14.observer
            com.android.dx.util.ByteArray r4 = r14.bytes
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "magic: "
            r5.append(r6)
            int r6 = r14.getMagic0()
            java.lang.String r6 = com.android.dx.util.Hex.u4(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = 4
            r0.parsed(r4, r2, r6, r5)
            com.android.dx.cf.iface.ParseObserver r0 = r14.observer
            com.android.dx.util.ByteArray r4 = r14.bytes
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "minor_version: "
            r5.append(r7)
            int r7 = r14.getMinorVersion0()
            java.lang.String r7 = com.android.dx.util.Hex.u2(r7)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            r0.parsed(r4, r6, r3, r5)
            com.android.dx.cf.iface.ParseObserver r0 = r14.observer
            com.android.dx.util.ByteArray r4 = r14.bytes
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "major_version: "
            r5.append(r6)
            int r6 = r14.getMajorVersion0()
            java.lang.String r6 = com.android.dx.util.Hex.u2(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.parsed(r4, r1, r3, r5)
        L79:
            boolean r0 = r14.strictParse
            java.lang.String r4 = ")"
            if (r0 == 0) goto Le1
            int r0 = r14.getMagic0()
            boolean r0 = r14.isGoodMagic(r0)
            if (r0 == 0) goto Lbf
            int r0 = r14.getMinorVersion0()
            int r5 = r14.getMajorVersion0()
            boolean r0 = r14.isGoodVersion(r0, r5)
            if (r0 == 0) goto L98
            goto Le1
        L98:
            com.android.dx.cf.iface.ParseException r0 = new com.android.dx.cf.iface.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unsupported class file version "
            r1.append(r2)
            int r2 = r14.getMajorVersion0()
            r1.append(r2)
            java.lang.String r2 = "."
            r1.append(r2)
            int r2 = r14.getMinorVersion0()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lbf:
            com.android.dx.cf.iface.ParseException r0 = new com.android.dx.cf.iface.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "bad class file magic ("
            r1.append(r2)
            int r2 = r14.getMagic0()
            java.lang.String r2 = com.android.dx.util.Hex.u4(r2)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Le1:
            com.android.dx.cf.cst.ConstantPoolParser r0 = new com.android.dx.cf.cst.ConstantPoolParser
            com.android.dx.util.ByteArray r5 = r14.bytes
            r0.<init>(r5)
            com.android.dx.cf.iface.ParseObserver r5 = r14.observer
            r0.setObserver(r5)
            com.android.dx.rop.cst.StdConstantPool r5 = r0.getPool()
            r14.pool = r5
            r5.setImmutable()
            int r0 = r0.getEndOffset()
            com.android.dx.util.ByteArray r5 = r14.bytes
            int r5 = r5.getUnsignedShort(r0)
            com.android.dx.util.ByteArray r6 = r14.bytes
            int r7 = r0 + 2
            int r6 = r6.getUnsignedShort(r7)
            com.android.dx.rop.cst.StdConstantPool r8 = r14.pool
            com.android.dx.rop.cst.Constant r6 = r8.get(r6)
            com.android.dx.rop.cst.CstType r6 = (com.android.dx.rop.cst.CstType) r6
            r14.thisClass = r6
            com.android.dx.util.ByteArray r6 = r14.bytes
            int r8 = r0 + 4
            int r6 = r6.getUnsignedShort(r8)
            com.android.dx.rop.cst.StdConstantPool r9 = r14.pool
            com.android.dx.rop.cst.Constant r6 = r9.get0Ok(r6)
            com.android.dx.rop.cst.CstType r6 = (com.android.dx.rop.cst.CstType) r6
            r14.superClass = r6
            com.android.dx.util.ByteArray r6 = r14.bytes
            int r9 = r0 + 6
            int r6 = r6.getUnsignedShort(r9)
            com.android.dx.cf.iface.ParseObserver r10 = r14.observer
            if (r10 == 0) goto L1ab
            com.android.dx.util.ByteArray r11 = r14.bytes
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "access_flags: "
            r12.append(r13)
            java.lang.String r13 = com.android.dx.rop.code.AccessFlags.classString(r5)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r10.parsed(r11, r0, r3, r12)
            com.android.dx.cf.iface.ParseObserver r10 = r14.observer
            com.android.dx.util.ByteArray r11 = r14.bytes
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "this_class: "
            r12.append(r13)
            com.android.dx.rop.cst.CstType r13 = r14.thisClass
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r10.parsed(r11, r7, r3, r12)
            com.android.dx.cf.iface.ParseObserver r7 = r14.observer
            com.android.dx.util.ByteArray r10 = r14.bytes
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "super_class: "
            r11.append(r12)
            com.android.dx.rop.cst.CstType r12 = r14.superClass
            java.lang.String r12 = stringOrNone(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r7.parsed(r10, r8, r3, r11)
            com.android.dx.cf.iface.ParseObserver r7 = r14.observer
            com.android.dx.util.ByteArray r8 = r14.bytes
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "interfaces_count: "
            r10.append(r11)
            java.lang.String r11 = com.android.dx.util.Hex.u2(r6)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r7.parsed(r8, r9, r3, r10)
            if (r6 == 0) goto L1ab
            com.android.dx.cf.iface.ParseObserver r7 = r14.observer
            com.android.dx.util.ByteArray r8 = r14.bytes
            int r9 = r0 + 8
            java.lang.String r10 = "interfaces:"
            r7.parsed(r8, r9, r2, r10)
        L1ab:
            int r0 = r0 + 8
            com.android.dx.rop.type.TypeList r7 = r14.makeTypeList(r0, r6)
            r14.interfaces = r7
            int r6 = r6 * r3
            int r0 = r0 + r6
            boolean r3 = r14.strictParse
            if (r3 == 0) goto L207
            com.android.dx.rop.cst.CstType r3 = r14.thisClass
            com.android.dx.rop.type.Type r3 = r3.getClassType()
            java.lang.String r3 = r3.getClassName()
            java.lang.String r6 = r14.filePath
            java.lang.String r7 = ".class"
            boolean r6 = r6.endsWith(r7)
            if (r6 == 0) goto L1e3
            java.lang.String r6 = r14.filePath
            boolean r6 = r6.startsWith(r3)
            if (r6 == 0) goto L1e3
            java.lang.String r6 = r14.filePath
            int r6 = r6.length()
            int r7 = r3.length()
            int r7 = r7 + r1
            if (r6 != r7) goto L1e3
            goto L207
        L1e3:
            com.android.dx.cf.iface.ParseException r0 = new com.android.dx.cf.iface.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "class name ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ") does not match path ("
            r1.append(r2)
            java.lang.String r2 = r14.filePath
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L207:
            r14.accessFlags = r5
            com.android.dx.cf.direct.FieldListParser r1 = new com.android.dx.cf.direct.FieldListParser
            com.android.dx.rop.cst.CstType r3 = r14.thisClass
            com.android.dx.cf.direct.AttributeFactory r4 = r14.attributeFactory
            r1.<init>(r14, r3, r0, r4)
            com.android.dx.cf.iface.ParseObserver r0 = r14.observer
            r1.setObserver(r0)
            com.android.dx.cf.iface.StdFieldList r0 = r1.getList()
            r14.fields = r0
            int r0 = r1.getEndOffset()
            com.android.dx.cf.direct.MethodListParser r1 = new com.android.dx.cf.direct.MethodListParser
            com.android.dx.rop.cst.CstType r3 = r14.thisClass
            com.android.dx.cf.direct.AttributeFactory r4 = r14.attributeFactory
            r1.<init>(r14, r3, r0, r4)
            com.android.dx.cf.iface.ParseObserver r0 = r14.observer
            r1.setObserver(r0)
            com.android.dx.cf.iface.StdMethodList r0 = r1.getList()
            r14.methods = r0
            int r0 = r1.getEndOffset()
            com.android.dx.cf.direct.AttributeListParser r1 = new com.android.dx.cf.direct.AttributeListParser
            com.android.dx.cf.direct.AttributeFactory r3 = r14.attributeFactory
            r1.<init>(r14, r2, r0, r3)
            com.android.dx.cf.iface.ParseObserver r0 = r14.observer
            r1.setObserver(r0)
            com.android.dx.cf.iface.StdAttributeList r0 = r1.getList()
            r14.attributes = r0
            r0.setImmutable()
            int r0 = r1.getEndOffset()
            com.android.dx.util.ByteArray r1 = r14.bytes
            int r1 = r1.size()
            if (r0 != r1) goto L266
            com.android.dx.cf.iface.ParseObserver r1 = r14.observer
            if (r1 == 0) goto L265
            com.android.dx.util.ByteArray r3 = r14.bytes
            java.lang.String r4 = "end classfile"
            r1.parsed(r3, r0, r2, r4)
        L265:
            return
        L266:
            com.android.dx.cf.iface.ParseException r1 = new com.android.dx.cf.iface.ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "extra bytes at end of class file, at offset "
            r2.append(r3)
            java.lang.String r0 = com.android.dx.util.Hex.u4(r0)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L281:
            com.android.dx.cf.iface.ParseException r0 = new com.android.dx.cf.iface.ParseException
            java.lang.String r1 = "severely truncated class file"
            r0.<init>(r1)
            throw r0
    }

    private void parseToEndIfNecessary() {
            r1 = this;
            com.android.dx.cf.iface.StdAttributeList r0 = r1.attributes
            if (r0 != 0) goto L7
            r1.parse()
        L7:
            return
    }

    private void parseToInterfacesIfNecessary() {
            r2 = this;
            int r0 = r2.accessFlags
            r1 = -1
            if (r0 != r1) goto L8
            r2.parse()
        L8:
            return
    }

    public static java.lang.String stringOrNone(java.lang.Object r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = "(none)"
            return r0
        L5:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public int getAccessFlags() {
            r1 = this;
            r1.parseToInterfacesIfNecessary()
            int r0 = r1.accessFlags
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile, com.android.dx.cf.iface.HasAttribute
    public com.android.dx.cf.iface.AttributeList getAttributes() {
            r1 = this;
            r1.parseToEndIfNecessary()
            com.android.dx.cf.iface.StdAttributeList r0 = r1.attributes
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public com.android.dx.cf.code.BootstrapMethodsList getBootstrapMethods() {
            r2 = this;
            com.android.dx.cf.iface.AttributeList r0 = r2.getAttributes()
            java.lang.String r1 = "BootstrapMethods"
            com.android.dx.cf.iface.Attribute r0 = r0.findFirst(r1)
            com.android.dx.cf.attrib.AttBootstrapMethods r0 = (com.android.dx.cf.attrib.AttBootstrapMethods) r0
            if (r0 == 0) goto L13
            com.android.dx.cf.code.BootstrapMethodsList r0 = r0.getBootstrapMethods()
            return r0
        L13:
            com.android.dx.cf.code.BootstrapMethodsList r0 = com.android.dx.cf.code.BootstrapMethodsList.EMPTY
            return r0
    }

    public com.android.dx.util.ByteArray getBytes() {
            r1 = this;
            com.android.dx.util.ByteArray r0 = r1.bytes
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public com.android.dx.rop.cst.ConstantPool getConstantPool() {
            r1 = this;
            r1.parseToInterfacesIfNecessary()
            com.android.dx.rop.cst.StdConstantPool r0 = r1.pool
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public com.android.dx.cf.iface.FieldList getFields() {
            r1 = this;
            r1.parseToEndIfNecessary()
            com.android.dx.cf.iface.FieldList r0 = r1.fields
            return r0
    }

    public java.lang.String getFilePath() {
            r1 = this;
            java.lang.String r0 = r1.filePath
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public com.android.dx.rop.type.TypeList getInterfaces() {
            r1 = this;
            r1.parseToInterfacesIfNecessary()
            com.android.dx.rop.type.TypeList r0 = r1.interfaces
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public int getMagic() {
            r1 = this;
            r1.parseToInterfacesIfNecessary()
            int r0 = r1.getMagic0()
            return r0
    }

    public int getMagic0() {
            r2 = this;
            com.android.dx.util.ByteArray r0 = r2.bytes
            r1 = 0
            int r0 = r0.getInt(r1)
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public int getMajorVersion() {
            r1 = this;
            r1.parseToInterfacesIfNecessary()
            int r0 = r1.getMajorVersion0()
            return r0
    }

    public int getMajorVersion0() {
            r2 = this;
            com.android.dx.util.ByteArray r0 = r2.bytes
            r1 = 6
            int r0 = r0.getUnsignedShort(r1)
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public com.android.dx.cf.iface.MethodList getMethods() {
            r1 = this;
            r1.parseToEndIfNecessary()
            com.android.dx.cf.iface.MethodList r0 = r1.methods
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public int getMinorVersion() {
            r1 = this;
            r1.parseToInterfacesIfNecessary()
            int r0 = r1.getMinorVersion0()
            return r0
    }

    public int getMinorVersion0() {
            r2 = this;
            com.android.dx.util.ByteArray r0 = r2.bytes
            r1 = 4
            int r0 = r0.getUnsignedShort(r1)
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public com.android.dx.rop.cst.CstString getSourceFile() {
            r2 = this;
            com.android.dx.cf.iface.AttributeList r0 = r2.getAttributes()
            java.lang.String r1 = "SourceFile"
            com.android.dx.cf.iface.Attribute r0 = r0.findFirst(r1)
            boolean r1 = r0 instanceof com.android.dx.cf.attrib.AttSourceFile
            if (r1 == 0) goto L15
            com.android.dx.cf.attrib.AttSourceFile r0 = (com.android.dx.cf.attrib.AttSourceFile) r0
            com.android.dx.rop.cst.CstString r0 = r0.getSourceFile()
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public com.android.dx.rop.cst.CstType getSuperclass() {
            r1 = this;
            r1.parseToInterfacesIfNecessary()
            com.android.dx.rop.cst.CstType r0 = r1.superClass
            return r0
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public com.android.dx.rop.cst.CstType getThisClass() {
            r1 = this;
            r1.parseToInterfacesIfNecessary()
            com.android.dx.rop.cst.CstType r0 = r1.thisClass
            return r0
    }

    public com.android.dx.rop.type.TypeList makeTypeList(int r8, int r9) {
            r7 = this;
            if (r9 != 0) goto L5
            com.android.dx.rop.type.StdTypeList r8 = com.android.dx.rop.type.StdTypeList.EMPTY
            return r8
        L5:
            com.android.dx.rop.cst.StdConstantPool r4 = r7.pool
            if (r4 == 0) goto L16
            com.android.dx.cf.direct.DirectClassFile$DcfTypeList r6 = new com.android.dx.cf.direct.DirectClassFile$DcfTypeList
            com.android.dx.util.ByteArray r1 = r7.bytes
            com.android.dx.cf.iface.ParseObserver r5 = r7.observer
            r0 = r6
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "pool not yet initialized"
            r8.<init>(r9)
            throw r8
    }

    public void setAttributeFactory(com.android.dx.cf.direct.AttributeFactory r2) {
            r1 = this;
            if (r2 == 0) goto L5
            r1.attributeFactory = r2
            return
        L5:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "attributeFactory == null"
            r2.<init>(r0)
            throw r2
    }

    public void setObserver(com.android.dx.cf.iface.ParseObserver r1) {
            r0 = this;
            r0.observer = r1
            return
    }
}
