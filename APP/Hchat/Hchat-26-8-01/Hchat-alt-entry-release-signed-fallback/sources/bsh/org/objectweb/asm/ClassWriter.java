package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ClassWriter extends bsh.org.objectweb.asm.ClassVisitor {
    public static final int COMPUTE_FRAMES = 2;
    public static final int COMPUTE_MAXS = 1;
    private int accessFlags;
    private int compute;
    private bsh.org.objectweb.asm.ByteVector debugExtension;
    private int enclosingClassIndex;
    private int enclosingMethodIndex;
    private bsh.org.objectweb.asm.Attribute firstAttribute;
    private bsh.org.objectweb.asm.FieldWriter firstField;
    private bsh.org.objectweb.asm.MethodWriter firstMethod;
    private bsh.org.objectweb.asm.ByteVector innerClasses;
    private int interfaceCount;
    private int[] interfaces;
    private bsh.org.objectweb.asm.FieldWriter lastField;
    private bsh.org.objectweb.asm.MethodWriter lastMethod;
    private int numberOfInnerClasses;
    private int signatureIndex;
    private int sourceFileIndex;
    private int superClass;
    private final bsh.org.objectweb.asm.SymbolTable symbolTable;
    private int thisClass;
    private int version;

    public ClassWriter(int r2) {
            r1 = this;
            r0 = 393216(0x60000, float:5.51013E-40)
            r1.<init>(r0)
            bsh.org.objectweb.asm.SymbolTable r0 = new bsh.org.objectweb.asm.SymbolTable
            r0.<init>(r1)
            r1.symbolTable = r0
            r0 = r2 & 2
            if (r0 == 0) goto L14
            r2 = 4
            r1.compute = r2
            return
        L14:
            r0 = 1
            r2 = r2 & r0
            if (r2 == 0) goto L1b
            r1.compute = r0
            return
        L1b:
            r2 = 0
            r1.compute = r2
            return
    }

    private bsh.org.objectweb.asm.Attribute[] getAttributePrototypes() {
            r2 = this;
            bsh.org.objectweb.asm.Attribute$Set r0 = new bsh.org.objectweb.asm.Attribute$Set
            r0.<init>()
            bsh.org.objectweb.asm.Attribute r1 = r2.firstAttribute
            r0.addAttributes(r1)
            bsh.org.objectweb.asm.FieldWriter r1 = r2.firstField
        Lc:
            if (r1 == 0) goto L16
            r1.collectAttributePrototypes(r0)
            bsh.org.objectweb.asm.FieldVisitor r1 = r1.fv
            bsh.org.objectweb.asm.FieldWriter r1 = (bsh.org.objectweb.asm.FieldWriter) r1
            goto Lc
        L16:
            bsh.org.objectweb.asm.MethodWriter r1 = r2.firstMethod
        L18:
            if (r1 == 0) goto L22
            r1.collectAttributePrototypes(r0)
            bsh.org.objectweb.asm.MethodVisitor r1 = r1.mv
            bsh.org.objectweb.asm.MethodWriter r1 = (bsh.org.objectweb.asm.MethodWriter) r1
            goto L18
        L22:
            bsh.org.objectweb.asm.Attribute[] r0 = r0.toArray()
            return r0
    }

    private byte[] replaceAsmInstructions(byte[] r1, boolean r2) {
            r0 = this;
            r0.getAttributePrototypes()
            r1 = 0
            r0.firstField = r1
            r0.lastField = r1
            r0.firstMethod = r1
            r0.lastMethod = r1
            r0.firstAttribute = r1
            if (r2 == 0) goto L12
            r1 = 3
            goto L13
        L12:
            r1 = 0
        L13:
            r0.compute = r1
            byte[] r1 = r0.toByteArray()
            return r1
    }

    public java.lang.String getCommonSuperClass(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 46
            r2 = 47
            java.lang.String r3 = r7.replace(r2, r1)     // Catch: java.lang.Exception -> L55
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3, r4, r0)     // Catch: java.lang.Exception -> L55
            java.lang.String r5 = r8.replace(r2, r1)     // Catch: java.lang.Exception -> L4e
            java.lang.Class r0 = java.lang.Class.forName(r5, r4, r0)     // Catch: java.lang.Exception -> L4e
            boolean r4 = r3.isAssignableFrom(r0)
            if (r4 == 0) goto L24
            return r7
        L24:
            boolean r7 = r0.isAssignableFrom(r3)
            if (r7 == 0) goto L2b
            return r8
        L2b:
            boolean r7 = r3.isInterface()
            if (r7 != 0) goto L4b
            boolean r7 = r0.isInterface()
            if (r7 == 0) goto L38
            goto L4b
        L38:
            java.lang.Class r3 = r3.getSuperclass()
            boolean r7 = r3.isAssignableFrom(r0)
            if (r7 == 0) goto L38
            java.lang.String r7 = r3.getName()
            java.lang.String r7 = r7.replace(r1, r2)
            return r7
        L4b:
            java.lang.String r7 = "java/lang/Object"
            return r7
        L4e:
            r7 = move-exception
            java.lang.TypeNotPresentException r0 = new java.lang.TypeNotPresentException
            r0.<init>(r8, r7)
            throw r0
        L55:
            r8 = move-exception
            java.lang.TypeNotPresentException r0 = new java.lang.TypeNotPresentException
            r0.<init>(r7, r8)
            throw r0
    }

    public int newClass(java.lang.String r2) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r2 = r0.addConstantClass(r2)
            int r2 = r2.index
            return r2
    }

    public int newConst(java.lang.Object r2) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r2 = r0.addConstant(r2)
            int r2 = r2.index
            return r2
    }

    public int newField(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r2 = r0.addConstantFieldref(r2, r3, r4)
            int r2 = r2.index
            return r2
    }

    @java.lang.Deprecated
    public int newHandle(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            r0 = 9
            if (r8 != r0) goto Lc
            r0 = 1
        L5:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r0
            goto Le
        Lc:
            r0 = 0
            goto L5
        Le:
            int r8 = r1.newHandle(r2, r3, r4, r5, r6)
            return r8
    }

    public int newHandle(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r6 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r6.symbolTable
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            bsh.org.objectweb.asm.Symbol r7 = r0.addConstantMethodHandle(r1, r2, r3, r4, r5)
            int r7 = r7.index
            return r7
    }

    public int newInvokeDynamic(java.lang.String r2, java.lang.String r3, bsh.org.objectweb.asm.Handle r4, java.lang.Object... r5) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r2 = r0.addConstantInvokeDynamic(r2, r3, r4, r5)
            int r2 = r2.index
            return r2
    }

    public int newMethod(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r2 = r0.addConstantMethodref(r2, r3, r4, r5)
            int r2 = r2.index
            return r2
    }

    public int newMethodType(java.lang.String r2) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r2 = r0.addConstantMethodType(r2)
            int r2 = r2.index
            return r2
    }

    public int newModule(java.lang.String r2) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r2 = r0.addConstantModule(r2)
            int r2 = r2.index
            return r2
    }

    public int newNameType(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            int r2 = r0.addConstantNameAndType(r2, r3)
            return r2
    }

    public int newPackage(java.lang.String r2) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r2 = r0.addConstantPackage(r2)
            int r2 = r2.index
            return r2
    }

    public int newUTF8(java.lang.String r2) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            int r2 = r0.addConstantUtf8(r2)
            return r2
    }

    public byte[] toByteArray() {
            r18 = this;
            r0 = r18
            int r1 = r0.interfaceCount
            r2 = 2
            int r1 = r1 * r2
            int r1 = r1 + 24
            bsh.org.objectweb.asm.FieldWriter r3 = r0.firstField
            r5 = 0
        Lb:
            if (r3 == 0) goto L19
            int r5 = r5 + 1
            int r6 = r3.computeFieldInfoSize()
            int r1 = r1 + r6
            bsh.org.objectweb.asm.FieldVisitor r3 = r3.fv
            bsh.org.objectweb.asm.FieldWriter r3 = (bsh.org.objectweb.asm.FieldWriter) r3
            goto Lb
        L19:
            bsh.org.objectweb.asm.MethodWriter r3 = r0.firstMethod
            r6 = 0
        L1c:
            if (r3 == 0) goto L2a
            int r6 = r6 + 1
            int r7 = r3.computeMethodInfoSize()
            int r1 = r1 + r7
            bsh.org.objectweb.asm.MethodVisitor r3 = r3.mv
            bsh.org.objectweb.asm.MethodWriter r3 = (bsh.org.objectweb.asm.MethodWriter) r3
            goto L1c
        L2a:
            bsh.org.objectweb.asm.ByteVector r3 = r0.innerClasses
            java.lang.String r7 = "InnerClasses"
            if (r3 == 0) goto L3c
            int r3 = r3.length
            int r3 = r3 + 8
            int r1 = r1 + r3
            bsh.org.objectweb.asm.SymbolTable r3 = r0.symbolTable
            r3.addConstantUtf8(r7)
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            int r8 = r0.enclosingClassIndex
            java.lang.String r9 = "EnclosingMethod"
            if (r8 == 0) goto L4c
            int r3 = r3 + 1
            int r1 = r1 + 10
            bsh.org.objectweb.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r9)
        L4c:
            int r8 = r0.accessFlags
            r10 = 4096(0x1000, float:5.74E-42)
            r8 = r8 & r10
            java.lang.String r11 = "Synthetic"
            r12 = 49
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r8 == 0) goto L68
            int r8 = r0.version
            r8 = r8 & r13
            if (r8 >= r12) goto L68
            int r3 = r3 + 1
            int r1 = r1 + 6
            bsh.org.objectweb.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r11)
        L68:
            int r8 = r0.signatureIndex
            java.lang.String r14 = "Signature"
            if (r8 == 0) goto L77
            int r3 = r3 + 1
            int r1 = r1 + 8
            bsh.org.objectweb.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r14)
        L77:
            int r8 = r0.sourceFileIndex
            java.lang.String r15 = "SourceFile"
            if (r8 == 0) goto L86
            int r3 = r3 + 1
            int r1 = r1 + 8
            bsh.org.objectweb.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r15)
        L86:
            bsh.org.objectweb.asm.ByteVector r8 = r0.debugExtension
            r16 = r2
            java.lang.String r2 = "SourceDebugExtension"
            if (r8 == 0) goto L9a
            int r3 = r3 + 1
            int r8 = r8.length
            int r8 = r8 + 6
            int r1 = r1 + r8
            bsh.org.objectweb.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r2)
        L9a:
            int r8 = r0.accessFlags
            r17 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 & r17
            java.lang.String r10 = "Deprecated"
            if (r8 == 0) goto Lad
            int r3 = r3 + 1
            int r1 = r1 + 6
            bsh.org.objectweb.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r10)
        Lad:
            bsh.org.objectweb.asm.SymbolTable r8 = r0.symbolTable
            int r8 = r8.computeBootstrapMethodsSize()
            if (r8 <= 0) goto Lbe
            int r3 = r3 + 1
            bsh.org.objectweb.asm.SymbolTable r8 = r0.symbolTable
            int r8 = r8.computeBootstrapMethodsSize()
            int r1 = r1 + r8
        Lbe:
            bsh.org.objectweb.asm.Attribute r8 = r0.firstAttribute
            if (r8 == 0) goto Ld0
            int r8 = r8.getAttributeCount()
            int r3 = r3 + r8
            bsh.org.objectweb.asm.Attribute r8 = r0.firstAttribute
            bsh.org.objectweb.asm.SymbolTable r4 = r0.symbolTable
            int r4 = r8.computeAttributesSize(r4)
            int r1 = r1 + r4
        Ld0:
            bsh.org.objectweb.asm.SymbolTable r4 = r0.symbolTable
            int r4 = r4.getConstantPoolLength()
            int r1 = r1 + r4
            bsh.org.objectweb.asm.SymbolTable r4 = r0.symbolTable
            int r4 = r4.getConstantPoolCount()
            if (r4 > r13) goto L22d
            bsh.org.objectweb.asm.ByteVector r4 = new bsh.org.objectweb.asm.ByteVector
            r4.<init>(r1)
            r1 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            bsh.org.objectweb.asm.ByteVector r1 = r4.putInt(r1)
            int r8 = r0.version
            r1.putInt(r8)
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            r1.putConstantPool(r4)
            int r1 = r0.version
            r1 = r1 & r13
            if (r1 >= r12) goto Lfd
            r1 = 4096(0x1000, float:5.74E-42)
            goto Lfe
        Lfd:
            r1 = 0
        Lfe:
            int r8 = r0.accessFlags
            int r1 = ~r1
            r1 = r1 & r8
            bsh.org.objectweb.asm.ByteVector r1 = r4.putShort(r1)
            int r8 = r0.thisClass
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r8)
            int r8 = r0.superClass
            r1.putShort(r8)
            int r1 = r0.interfaceCount
            r4.putShort(r1)
            r1 = 0
        L117:
            int r8 = r0.interfaceCount
            if (r1 >= r8) goto L125
            int[] r8 = r0.interfaces
            r8 = r8[r1]
            r4.putShort(r8)
            int r1 = r1 + 1
            goto L117
        L125:
            r4.putShort(r5)
            bsh.org.objectweb.asm.FieldWriter r1 = r0.firstField
        L12a:
            if (r1 == 0) goto L134
            r1.putFieldInfo(r4)
            bsh.org.objectweb.asm.FieldVisitor r1 = r1.fv
            bsh.org.objectweb.asm.FieldWriter r1 = (bsh.org.objectweb.asm.FieldWriter) r1
            goto L12a
        L134:
            r4.putShort(r6)
            bsh.org.objectweb.asm.MethodWriter r1 = r0.firstMethod
            r5 = 0
            r6 = 0
        L13b:
            if (r1 == 0) goto L14f
            boolean r8 = r1.hasFrames()
            r5 = r5 | r8
            boolean r8 = r1.hasAsmInstructions()
            r6 = r6 | r8
            r1.putMethodInfo(r4)
            bsh.org.objectweb.asm.MethodVisitor r1 = r1.mv
            bsh.org.objectweb.asm.MethodWriter r1 = (bsh.org.objectweb.asm.MethodWriter) r1
            goto L13b
        L14f:
            r4.putShort(r3)
            bsh.org.objectweb.asm.ByteVector r1 = r0.innerClasses
            if (r1 == 0) goto L17a
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r7)
            bsh.org.objectweb.asm.ByteVector r1 = r4.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r3 = r0.innerClasses
            int r3 = r3.length
            int r3 = r3 + 2
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r3)
            int r3 = r0.numberOfInnerClasses
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r3)
            bsh.org.objectweb.asm.ByteVector r3 = r0.innerClasses
            byte[] r7 = r3.data
            int r3 = r3.length
            r8 = 0
            r1.putByteArray(r7, r8, r3)
        L17a:
            int r1 = r0.enclosingClassIndex
            if (r1 == 0) goto L198
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r9)
            bsh.org.objectweb.asm.ByteVector r1 = r4.putShort(r1)
            r3 = 4
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r3)
            int r3 = r0.enclosingClassIndex
            bsh.org.objectweb.asm.ByteVector r1 = r1.putShort(r3)
            int r3 = r0.enclosingMethodIndex
            r1.putShort(r3)
        L198:
            int r1 = r0.accessFlags
            r3 = 4096(0x1000, float:5.74E-42)
            r1 = r1 & r3
            if (r1 == 0) goto L1b2
            int r1 = r0.version
            r1 = r1 & r13
            if (r1 >= r12) goto L1b2
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r11)
            bsh.org.objectweb.asm.ByteVector r1 = r4.putShort(r1)
            r8 = 0
            r1.putInt(r8)
        L1b2:
            int r1 = r0.signatureIndex
            if (r1 == 0) goto L1cc
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r14)
            bsh.org.objectweb.asm.ByteVector r1 = r4.putShort(r1)
            r3 = r16
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r3)
            int r7 = r0.signatureIndex
            r1.putShort(r7)
            goto L1ce
        L1cc:
            r3 = r16
        L1ce:
            int r1 = r0.sourceFileIndex
            if (r1 == 0) goto L1e5
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r15)
            bsh.org.objectweb.asm.ByteVector r1 = r4.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r1 = r1.putInt(r3)
            int r3 = r0.sourceFileIndex
            r1.putShort(r3)
        L1e5:
            bsh.org.objectweb.asm.ByteVector r1 = r0.debugExtension
            if (r1 == 0) goto L202
            int r1 = r1.length
            bsh.org.objectweb.asm.SymbolTable r3 = r0.symbolTable
            int r2 = r3.addConstantUtf8(r2)
            bsh.org.objectweb.asm.ByteVector r2 = r4.putShort(r2)
            bsh.org.objectweb.asm.ByteVector r2 = r2.putInt(r1)
            bsh.org.objectweb.asm.ByteVector r3 = r0.debugExtension
            byte[] r3 = r3.data
            r8 = 0
            r2.putByteArray(r3, r8, r1)
            goto L203
        L202:
            r8 = 0
        L203:
            int r1 = r0.accessFlags
            r1 = r1 & r17
            if (r1 == 0) goto L216
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r10)
            bsh.org.objectweb.asm.ByteVector r1 = r4.putShort(r1)
            r1.putInt(r8)
        L216:
            bsh.org.objectweb.asm.SymbolTable r1 = r0.symbolTable
            r1.putBootstrapMethods(r4)
            bsh.org.objectweb.asm.Attribute r1 = r0.firstAttribute
            if (r1 == 0) goto L224
            bsh.org.objectweb.asm.SymbolTable r2 = r0.symbolTable
            r1.putAttributes(r2, r4)
        L224:
            byte[] r1 = r4.data
            if (r6 == 0) goto L22c
            byte[] r1 = r0.replaceAsmInstructions(r1, r5)
        L22c:
            return r1
        L22d:
            java.lang.String r1 = "Class file too large!"
            okio.a.i(r1)
            r1 = 0
            return r1
    }

    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visit(int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String[] r7) {
            r1 = this;
            r1.version = r2
            r1.accessFlags = r3
            bsh.org.objectweb.asm.SymbolTable r3 = r1.symbolTable
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r3 = r3.setMajorVersionAndClassName(r2, r4)
            r1.thisClass = r3
            if (r5 == 0) goto L1a
            bsh.org.objectweb.asm.SymbolTable r3 = r1.symbolTable
            int r3 = r3.addConstantUtf8(r5)
            r1.signatureIndex = r3
        L1a:
            r3 = 0
            if (r6 != 0) goto L1f
            r4 = r3
            goto L27
        L1f:
            bsh.org.objectweb.asm.SymbolTable r4 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r4 = r4.addConstantClass(r6)
            int r4 = r4.index
        L27:
            r1.superClass = r4
            if (r7 == 0) goto L4a
            int r4 = r7.length
            if (r4 <= 0) goto L4a
            int r4 = r7.length
            r1.interfaceCount = r4
            int[] r4 = new int[r4]
            r1.interfaces = r4
        L35:
            int r4 = r1.interfaceCount
            if (r3 >= r4) goto L4a
            int[] r4 = r1.interfaces
            bsh.org.objectweb.asm.SymbolTable r5 = r1.symbolTable
            r6 = r7[r3]
            bsh.org.objectweb.asm.Symbol r5 = r5.addConstantClass(r6)
            int r5 = r5.index
            r4[r3] = r5
            int r3 = r3 + 1
            goto L35
        L4a:
            int r3 = r1.compute
            r4 = 1
            if (r3 != r4) goto L56
            r3 = 51
            if (r2 < r3) goto L56
            r2 = 2
            r1.compute = r2
        L56:
            return
    }

    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitAttribute(bsh.org.objectweb.asm.Attribute r2) {
            r1 = this;
            bsh.org.objectweb.asm.Attribute r0 = r1.firstAttribute
            r2.nextAttribute = r0
            r1.firstAttribute = r2
            return
    }

    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitEnd() {
            r0 = this;
            return
    }

    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final bsh.org.objectweb.asm.FieldVisitor visitField(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.Object r12) {
            r7 = this;
            bsh.org.objectweb.asm.FieldWriter r0 = new bsh.org.objectweb.asm.FieldWriter
            bsh.org.objectweb.asm.SymbolTable r1 = r7.symbolTable
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            bsh.org.objectweb.asm.FieldWriter r8 = r7.firstField
            if (r8 != 0) goto L13
            r7.firstField = r0
            goto L17
        L13:
            bsh.org.objectweb.asm.FieldWriter r8 = r7.lastField
            r8.fv = r0
        L17:
            r7.lastField = r0
            return r0
    }

    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitInnerClass(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            r3 = this;
            bsh.org.objectweb.asm.ByteVector r0 = r3.innerClasses
            if (r0 != 0) goto Lb
            bsh.org.objectweb.asm.ByteVector r0 = new bsh.org.objectweb.asm.ByteVector
            r0.<init>()
            r3.innerClasses = r0
        Lb:
            bsh.org.objectweb.asm.SymbolTable r0 = r3.symbolTable
            bsh.org.objectweb.asm.Symbol r4 = r0.addConstantClass(r4)
            int r0 = r4.info
            if (r0 != 0) goto L4b
            int r0 = r3.numberOfInnerClasses
            int r0 = r0 + 1
            r3.numberOfInnerClasses = r0
            bsh.org.objectweb.asm.ByteVector r0 = r3.innerClasses
            int r1 = r4.index
            r0.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r0 = r3.innerClasses
            r1 = 0
            if (r5 != 0) goto L29
            r5 = r1
            goto L31
        L29:
            bsh.org.objectweb.asm.SymbolTable r2 = r3.symbolTable
            bsh.org.objectweb.asm.Symbol r5 = r2.addConstantClass(r5)
            int r5 = r5.index
        L31:
            r0.putShort(r5)
            bsh.org.objectweb.asm.ByteVector r5 = r3.innerClasses
            if (r6 != 0) goto L39
            goto L3f
        L39:
            bsh.org.objectweb.asm.SymbolTable r0 = r3.symbolTable
            int r1 = r0.addConstantUtf8(r6)
        L3f:
            r5.putShort(r1)
            bsh.org.objectweb.asm.ByteVector r5 = r3.innerClasses
            r5.putShort(r7)
            int r5 = r3.numberOfInnerClasses
            r4.info = r5
        L4b:
            return
    }

    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final bsh.org.objectweb.asm.MethodVisitor visitMethod(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String[] r13) {
            r8 = this;
            bsh.org.objectweb.asm.MethodWriter r0 = new bsh.org.objectweb.asm.MethodWriter
            bsh.org.objectweb.asm.SymbolTable r1 = r8.symbolTable
            int r7 = r8.compute
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            bsh.org.objectweb.asm.MethodWriter r9 = r8.firstMethod
            if (r9 != 0) goto L15
            r8.firstMethod = r0
            goto L19
        L15:
            bsh.org.objectweb.asm.MethodWriter r9 = r8.lastMethod
            r9.mv = r0
        L19:
            r8.lastMethod = r0
            return r0
    }

    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitOuterClass(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            bsh.org.objectweb.asm.SymbolTable r0 = r1.symbolTable
            bsh.org.objectweb.asm.Symbol r2 = r0.addConstantClass(r2)
            int r2 = r2.index
            r1.enclosingClassIndex = r2
            if (r3 == 0) goto L16
            if (r4 == 0) goto L16
            bsh.org.objectweb.asm.SymbolTable r2 = r1.symbolTable
            int r2 = r2.addConstantNameAndType(r3, r4)
            r1.enclosingMethodIndex = r2
        L16:
            return
    }

    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitSource(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto La
            bsh.org.objectweb.asm.SymbolTable r0 = r2.symbolTable
            int r3 = r0.addConstantUtf8(r3)
            r2.sourceFileIndex = r3
        La:
            if (r4 == 0) goto L1b
            bsh.org.objectweb.asm.ByteVector r3 = new bsh.org.objectweb.asm.ByteVector
            r3.<init>()
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            bsh.org.objectweb.asm.ByteVector r3 = r3.encodeUTF8(r4, r0, r1)
            r2.debugExtension = r3
        L1b:
            return
    }
}
