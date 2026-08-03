package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public class ClassWriter extends net.bytebuddy.jar.asm.ClassVisitor {
    public static final int COMPUTE_FRAMES = 2;
    public static final int COMPUTE_MAXS = 1;
    private int accessFlags;
    private int compute;
    private net.bytebuddy.jar.asm.ByteVector debugExtension;
    private int enclosingClassIndex;
    private int enclosingMethodIndex;
    private net.bytebuddy.jar.asm.Attribute firstAttribute;
    private net.bytebuddy.jar.asm.FieldWriter firstField;
    private net.bytebuddy.jar.asm.MethodWriter firstMethod;
    private net.bytebuddy.jar.asm.RecordComponentWriter firstRecordComponent;
    private final int flags;
    private net.bytebuddy.jar.asm.ByteVector innerClasses;
    private int interfaceCount;
    private int[] interfaces;
    private net.bytebuddy.jar.asm.FieldWriter lastField;
    private net.bytebuddy.jar.asm.MethodWriter lastMethod;
    private net.bytebuddy.jar.asm.RecordComponentWriter lastRecordComponent;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeInvisibleAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeInvisibleTypeAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeVisibleAnnotation;
    private net.bytebuddy.jar.asm.AnnotationWriter lastRuntimeVisibleTypeAnnotation;
    private net.bytebuddy.jar.asm.ModuleWriter moduleWriter;
    private int nestHostClassIndex;
    private net.bytebuddy.jar.asm.ByteVector nestMemberClasses;
    private int numberOfInnerClasses;
    private int numberOfNestMemberClasses;
    private int numberOfPermittedSubclasses;
    private net.bytebuddy.jar.asm.ByteVector permittedSubclasses;
    private int signatureIndex;
    private int sourceFileIndex;
    private int superClass;
    private final net.bytebuddy.jar.asm.SymbolTable symbolTable;
    private int thisClass;
    private int version;

    public ClassWriter(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public ClassWriter(net.bytebuddy.jar.asm.ClassReader r2, int r3) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0)
            r1.flags = r3
            if (r2 != 0) goto Lf
            net.bytebuddy.jar.asm.SymbolTable r2 = new net.bytebuddy.jar.asm.SymbolTable
            r2.<init>(r1)
            goto L15
        Lf:
            net.bytebuddy.jar.asm.SymbolTable r0 = new net.bytebuddy.jar.asm.SymbolTable
            r0.<init>(r1, r2)
            r2 = r0
        L15:
            r1.symbolTable = r2
            r2 = r3 & 2
            if (r2 == 0) goto L1f
            r2 = 4
            r1.compute = r2
            goto L29
        L1f:
            r2 = 1
            r3 = r3 & r2
            if (r3 == 0) goto L26
            r1.compute = r2
            goto L29
        L26:
            r2 = 0
            r1.compute = r2
        L29:
            return
    }

    private net.bytebuddy.jar.asm.Attribute[] getAttributePrototypes() {
            r2 = this;
            net.bytebuddy.jar.asm.Attribute$Set r0 = new net.bytebuddy.jar.asm.Attribute$Set
            r0.<init>()
            net.bytebuddy.jar.asm.Attribute r1 = r2.firstAttribute
            r0.addAttributes(r1)
            net.bytebuddy.jar.asm.FieldWriter r1 = r2.firstField
        Lc:
            if (r1 == 0) goto L16
            r1.collectAttributePrototypes(r0)
            net.bytebuddy.jar.asm.FieldVisitor r1 = r1.fv
            net.bytebuddy.jar.asm.FieldWriter r1 = (net.bytebuddy.jar.asm.FieldWriter) r1
            goto Lc
        L16:
            net.bytebuddy.jar.asm.MethodWriter r1 = r2.firstMethod
        L18:
            if (r1 == 0) goto L22
            r1.collectAttributePrototypes(r0)
            net.bytebuddy.jar.asm.MethodVisitor r1 = r1.mv
            net.bytebuddy.jar.asm.MethodWriter r1 = (net.bytebuddy.jar.asm.MethodWriter) r1
            goto L18
        L22:
            net.bytebuddy.jar.asm.RecordComponentWriter r1 = r2.firstRecordComponent
        L24:
            if (r1 == 0) goto L2e
            r1.collectAttributePrototypes(r0)
            net.bytebuddy.jar.asm.RecordComponentVisitor r1 = r1.delegate
            net.bytebuddy.jar.asm.RecordComponentWriter r1 = (net.bytebuddy.jar.asm.RecordComponentWriter) r1
            goto L24
        L2e:
            net.bytebuddy.jar.asm.Attribute[] r0 = r0.toArray()
            return r0
    }

    private byte[] replaceAsmInstructions(byte[] r4, boolean r5) {
            r3 = this;
            net.bytebuddy.jar.asm.Attribute[] r0 = r3.getAttributePrototypes()
            r1 = 0
            r3.firstField = r1
            r3.lastField = r1
            r3.firstMethod = r1
            r3.lastMethod = r1
            r3.lastRuntimeVisibleAnnotation = r1
            r3.lastRuntimeInvisibleAnnotation = r1
            r3.lastRuntimeVisibleTypeAnnotation = r1
            r3.lastRuntimeInvisibleTypeAnnotation = r1
            r3.moduleWriter = r1
            r2 = 0
            r3.nestHostClassIndex = r2
            r3.numberOfNestMemberClasses = r2
            r3.nestMemberClasses = r1
            r3.numberOfPermittedSubclasses = r2
            r3.permittedSubclasses = r1
            r3.firstRecordComponent = r1
            r3.lastRecordComponent = r1
            r3.firstAttribute = r1
            if (r5 == 0) goto L2c
            r1 = 3
            goto L2d
        L2c:
            r1 = r2
        L2d:
            r3.compute = r1
            net.bytebuddy.jar.asm.ClassReader r1 = new net.bytebuddy.jar.asm.ClassReader
            r1.<init>(r4, r2, r2)
            if (r5 == 0) goto L38
            r2 = 8
        L38:
            r4 = r2 | 256(0x100, float:3.59E-43)
            r1.accept(r3, r0, r4)
            byte[] r4 = r3.toByteArray()
            return r4
    }

    public java.lang.ClassLoader getClassLoader() {
            r1 = this;
            java.lang.Class r0 = r1.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            return r0
    }

    public java.lang.String getCommonSuperClass(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.lang.ClassLoader r0 = r6.getClassLoader()
            r1 = 46
            r2 = 47
            java.lang.String r3 = r7.replace(r2, r1)     // Catch: java.lang.ClassNotFoundException -> L51
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3, r4, r0)     // Catch: java.lang.ClassNotFoundException -> L51
            java.lang.String r5 = r8.replace(r2, r1)     // Catch: java.lang.ClassNotFoundException -> L4a
            java.lang.Class r0 = java.lang.Class.forName(r5, r4, r0)     // Catch: java.lang.ClassNotFoundException -> L4a
            boolean r4 = r3.isAssignableFrom(r0)
            if (r4 == 0) goto L20
            return r7
        L20:
            boolean r7 = r0.isAssignableFrom(r3)
            if (r7 == 0) goto L27
            return r8
        L27:
            boolean r7 = r3.isInterface()
            if (r7 != 0) goto L47
            boolean r7 = r0.isInterface()
            if (r7 == 0) goto L34
            goto L47
        L34:
            java.lang.Class r3 = r3.getSuperclass()
            boolean r7 = r3.isAssignableFrom(r0)
            if (r7 == 0) goto L34
            java.lang.String r7 = r3.getName()
            java.lang.String r7 = r7.replace(r1, r2)
            return r7
        L47:
            java.lang.String r7 = "java/lang/Object"
            return r7
        L4a:
            r7 = move-exception
            java.lang.TypeNotPresentException r0 = new java.lang.TypeNotPresentException
            r0.<init>(r8, r7)
            throw r0
        L51:
            r8 = move-exception
            java.lang.TypeNotPresentException r0 = new java.lang.TypeNotPresentException
            r0.<init>(r7, r8)
            throw r0
    }

    public boolean hasFlags(int r2) {
            r1 = this;
            int r0 = r1.flags
            r0 = r0 & r2
            if (r0 != r2) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    public int newClass(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantClass(r2)
            int r2 = r2.index
            return r2
    }

    public int newConst(java.lang.Object r2) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstant(r2)
            int r2 = r2.index
            return r2
    }

    public int newConstantDynamic(java.lang.String r2, java.lang.String r3, net.bytebuddy.jar.asm.Handle r4, java.lang.Object... r5) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantDynamic(r2, r3, r4, r5)
            int r2 = r2.index
            return r2
    }

    public int newField(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantFieldref(r2, r3, r4)
            int r2 = r2.index
            return r2
    }

    @java.lang.Deprecated
    public int newHandle(int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            r0 = 9
            if (r8 != r0) goto L7
            r0 = 1
        L5:
            r6 = r0
            goto L9
        L7:
            r0 = 0
            goto L5
        L9:
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            int r8 = r1.newHandle(r2, r3, r4, r5, r6)
            return r8
    }

    public int newHandle(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
            r6 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r6.symbolTable
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            net.bytebuddy.jar.asm.Symbol r7 = r0.addConstantMethodHandle(r1, r2, r3, r4, r5)
            int r7 = r7.index
            return r7
    }

    public int newInvokeDynamic(java.lang.String r2, java.lang.String r3, net.bytebuddy.jar.asm.Handle r4, java.lang.Object... r5) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantInvokeDynamic(r2, r3, r4, r5)
            int r2 = r2.index
            return r2
    }

    public int newMethod(java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantMethodref(r2, r3, r4, r5)
            int r2 = r2.index
            return r2
    }

    public int newMethodType(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantMethodType(r2)
            int r2 = r2.index
            return r2
    }

    public int newModule(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantModule(r2)
            int r2 = r2.index
            return r2
    }

    public int newNameType(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            int r2 = r0.addConstantNameAndType(r2, r3)
            return r2
    }

    public int newPackage(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantPackage(r2)
            int r2 = r2.index
            return r2
    }

    public int newUTF8(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            int r2 = r0.addConstantUtf8(r2)
            return r2
    }

    public byte[] toByteArray() {
            r28 = this;
            r0 = r28
            int r1 = r0.interfaceCount
            r2 = 2
            int r1 = r1 * r2
            int r1 = r1 + 24
            net.bytebuddy.jar.asm.FieldWriter r3 = r0.firstField
            r5 = 0
        Lb:
            if (r3 == 0) goto L19
            int r5 = r5 + 1
            int r6 = r3.computeFieldInfoSize()
            int r1 = r1 + r6
            net.bytebuddy.jar.asm.FieldVisitor r3 = r3.fv
            net.bytebuddy.jar.asm.FieldWriter r3 = (net.bytebuddy.jar.asm.FieldWriter) r3
            goto Lb
        L19:
            net.bytebuddy.jar.asm.MethodWriter r3 = r0.firstMethod
            r6 = 0
        L1c:
            if (r3 == 0) goto L2a
            int r6 = r6 + 1
            int r7 = r3.computeMethodInfoSize()
            int r1 = r1 + r7
            net.bytebuddy.jar.asm.MethodVisitor r3 = r3.mv
            net.bytebuddy.jar.asm.MethodWriter r3 = (net.bytebuddy.jar.asm.MethodWriter) r3
            goto L1c
        L2a:
            net.bytebuddy.jar.asm.ByteVector r3 = r0.innerClasses
            java.lang.String r7 = "InnerClasses"
            if (r3 == 0) goto L3c
            int r3 = r3.length
            int r3 = r3 + 8
            int r1 = r1 + r3
            net.bytebuddy.jar.asm.SymbolTable r3 = r0.symbolTable
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
            net.bytebuddy.jar.asm.SymbolTable r8 = r0.symbolTable
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
            net.bytebuddy.jar.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r11)
        L68:
            int r8 = r0.signatureIndex
            java.lang.String r14 = "Signature"
            if (r8 == 0) goto L77
            int r3 = r3 + 1
            int r1 = r1 + 8
            net.bytebuddy.jar.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r14)
        L77:
            int r8 = r0.sourceFileIndex
            java.lang.String r15 = "SourceFile"
            if (r8 == 0) goto L86
            int r3 = r3 + 1
            int r1 = r1 + 8
            net.bytebuddy.jar.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r15)
        L86:
            net.bytebuddy.jar.asm.ByteVector r8 = r0.debugExtension
            java.lang.String r10 = "SourceDebugExtension"
            if (r8 == 0) goto L98
            int r3 = r3 + 1
            int r8 = r8.length
            int r8 = r8 + 6
            int r1 = r1 + r8
            net.bytebuddy.jar.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r10)
        L98:
            int r8 = r0.accessFlags
            r16 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 & r16
            java.lang.String r4 = "Deprecated"
            if (r8 == 0) goto Lab
            int r3 = r3 + 1
            int r1 = r1 + 6
            net.bytebuddy.jar.asm.SymbolTable r8 = r0.symbolTable
            r8.addConstantUtf8(r4)
        Lab:
            net.bytebuddy.jar.asm.AnnotationWriter r8 = r0.lastRuntimeVisibleAnnotation
            if (r8 == 0) goto Lb8
            int r3 = r3 + 1
            java.lang.String r2 = "RuntimeVisibleAnnotations"
            int r2 = r8.computeAnnotationsSize(r2)
            int r1 = r1 + r2
        Lb8:
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r0.lastRuntimeInvisibleAnnotation
            if (r2 == 0) goto Lc5
            int r3 = r3 + 1
            java.lang.String r8 = "RuntimeInvisibleAnnotations"
            int r2 = r2.computeAnnotationsSize(r8)
            int r1 = r1 + r2
        Lc5:
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r0.lastRuntimeVisibleTypeAnnotation
            if (r2 == 0) goto Ld2
            int r3 = r3 + 1
            java.lang.String r8 = "RuntimeVisibleTypeAnnotations"
            int r2 = r2.computeAnnotationsSize(r8)
            int r1 = r1 + r2
        Ld2:
            net.bytebuddy.jar.asm.AnnotationWriter r2 = r0.lastRuntimeInvisibleTypeAnnotation
            if (r2 == 0) goto Ldf
            int r3 = r3 + 1
            java.lang.String r8 = "RuntimeInvisibleTypeAnnotations"
            int r2 = r2.computeAnnotationsSize(r8)
            int r1 = r1 + r2
        Ldf:
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            int r2 = r2.computeBootstrapMethodsSize()
            if (r2 <= 0) goto Lf0
            int r3 = r3 + 1
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            int r2 = r2.computeBootstrapMethodsSize()
            int r1 = r1 + r2
        Lf0:
            net.bytebuddy.jar.asm.ModuleWriter r2 = r0.moduleWriter
            if (r2 == 0) goto L100
            int r2 = r2.getAttributeCount()
            int r3 = r3 + r2
            net.bytebuddy.jar.asm.ModuleWriter r2 = r0.moduleWriter
            int r2 = r2.computeAttributesSize()
            int r1 = r1 + r2
        L100:
            int r2 = r0.nestHostClassIndex
            java.lang.String r8 = "NestHost"
            if (r2 == 0) goto L10f
            int r3 = r3 + 1
            int r1 = r1 + 8
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            r2.addConstantUtf8(r8)
        L10f:
            net.bytebuddy.jar.asm.ByteVector r2 = r0.nestMemberClasses
            java.lang.String r12 = "NestMembers"
            if (r2 == 0) goto L121
            int r3 = r3 + 1
            int r2 = r2.length
            int r2 = r2 + 8
            int r1 = r1 + r2
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            r2.addConstantUtf8(r12)
        L121:
            net.bytebuddy.jar.asm.ByteVector r2 = r0.permittedSubclasses
            java.lang.String r13 = "PermittedSubclasses"
            if (r2 == 0) goto L133
            int r3 = r3 + 1
            int r2 = r2.length
            int r2 = r2 + 8
            int r1 = r1 + r2
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            r2.addConstantUtf8(r13)
        L133:
            int r2 = r0.accessFlags
            r17 = 65536(0x10000, float:9.1835E-41)
            r2 = r2 & r17
            r18 = r13
            java.lang.String r13 = "Record"
            if (r2 != 0) goto L149
            net.bytebuddy.jar.asm.RecordComponentWriter r2 = r0.firstRecordComponent
            if (r2 == 0) goto L144
            goto L149
        L144:
            r19 = 0
            r20 = 0
            goto L168
        L149:
            net.bytebuddy.jar.asm.RecordComponentWriter r2 = r0.firstRecordComponent
            r19 = 0
            r20 = 0
        L14f:
            if (r2 == 0) goto L15e
            int r20 = r20 + 1
            int r21 = r2.computeRecordComponentInfoSize()
            int r19 = r19 + r21
            net.bytebuddy.jar.asm.RecordComponentVisitor r2 = r2.delegate
            net.bytebuddy.jar.asm.RecordComponentWriter r2 = (net.bytebuddy.jar.asm.RecordComponentWriter) r2
            goto L14f
        L15e:
            int r3 = r3 + 1
            int r2 = r19 + 8
            int r1 = r1 + r2
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            r2.addConstantUtf8(r13)
        L168:
            net.bytebuddy.jar.asm.Attribute r2 = r0.firstAttribute
            if (r2 == 0) goto L17e
            int r2 = r2.getAttributeCount()
            int r3 = r3 + r2
            net.bytebuddy.jar.asm.Attribute r2 = r0.firstAttribute
            r21 = r3
            net.bytebuddy.jar.asm.SymbolTable r3 = r0.symbolTable
            int r2 = r2.computeAttributesSize(r3)
            int r1 = r1 + r2
            r3 = r21
        L17e:
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            int r2 = r2.getConstantPoolLength()
            int r1 = r1 + r2
            net.bytebuddy.jar.asm.SymbolTable r2 = r0.symbolTable
            int r2 = r2.getConstantPoolCount()
            r21 = r13
            r13 = 65535(0xffff, float:9.1834E-41)
            if (r2 > r13) goto L3a3
            net.bytebuddy.jar.asm.ByteVector r2 = new net.bytebuddy.jar.asm.ByteVector
            r2.<init>(r1)
            r1 = -889275714(0xffffffffcafebabe, float:-8346975.0)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putInt(r1)
            int r13 = r0.version
            r1.putInt(r13)
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            r1.putConstantPool(r2)
            int r1 = r0.version
            r13 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r13
            r13 = 49
            if (r1 >= r13) goto L1b5
            r1 = 4096(0x1000, float:5.74E-42)
            goto L1b6
        L1b5:
            r1 = 0
        L1b6:
            int r13 = r0.accessFlags
            int r1 = ~r1
            r1 = r1 & r13
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            int r13 = r0.thisClass
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r13)
            int r13 = r0.superClass
            r1.putShort(r13)
            int r1 = r0.interfaceCount
            r2.putShort(r1)
            r1 = 0
        L1cf:
            int r13 = r0.interfaceCount
            if (r1 >= r13) goto L1dd
            int[] r13 = r0.interfaces
            r13 = r13[r1]
            r2.putShort(r13)
            int r1 = r1 + 1
            goto L1cf
        L1dd:
            r2.putShort(r5)
            net.bytebuddy.jar.asm.FieldWriter r1 = r0.firstField
        L1e2:
            if (r1 == 0) goto L1ec
            r1.putFieldInfo(r2)
            net.bytebuddy.jar.asm.FieldVisitor r1 = r1.fv
            net.bytebuddy.jar.asm.FieldWriter r1 = (net.bytebuddy.jar.asm.FieldWriter) r1
            goto L1e2
        L1ec:
            r2.putShort(r6)
            net.bytebuddy.jar.asm.MethodWriter r1 = r0.firstMethod
            r5 = 0
            r6 = 0
        L1f3:
            if (r1 == 0) goto L207
            boolean r13 = r1.hasFrames()
            r5 = r5 | r13
            boolean r13 = r1.hasAsmInstructions()
            r6 = r6 | r13
            r1.putMethodInfo(r2)
            net.bytebuddy.jar.asm.MethodVisitor r1 = r1.mv
            net.bytebuddy.jar.asm.MethodWriter r1 = (net.bytebuddy.jar.asm.MethodWriter) r1
            goto L1f3
        L207:
            r2.putShort(r3)
            net.bytebuddy.jar.asm.ByteVector r1 = r0.innerClasses
            if (r1 == 0) goto L232
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r7)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r3 = r0.innerClasses
            int r3 = r3.length
            r7 = 2
            int r3 = r3 + r7
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putInt(r3)
            int r3 = r0.numberOfInnerClasses
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r3)
            net.bytebuddy.jar.asm.ByteVector r3 = r0.innerClasses
            byte[] r7 = r3.data
            int r3 = r3.length
            r13 = 0
            r1.putByteArray(r7, r13, r3)
        L232:
            int r1 = r0.enclosingClassIndex
            if (r1 == 0) goto L250
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r9)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            r3 = 4
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putInt(r3)
            int r3 = r0.enclosingClassIndex
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r3)
            int r3 = r0.enclosingMethodIndex
            r1.putShort(r3)
        L250:
            int r1 = r0.accessFlags
            r3 = 4096(0x1000, float:5.74E-42)
            r1 = r1 & r3
            if (r1 == 0) goto L26f
            int r1 = r0.version
            r3 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            r3 = 49
            if (r1 >= r3) goto L26f
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r11)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            r3 = 0
            r1.putInt(r3)
        L26f:
            int r1 = r0.signatureIndex
            if (r1 == 0) goto L288
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r14)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            r3 = 2
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putInt(r3)
            int r7 = r0.signatureIndex
            r1.putShort(r7)
            goto L289
        L288:
            r3 = 2
        L289:
            int r1 = r0.sourceFileIndex
            if (r1 == 0) goto L2a0
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r15)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putInt(r3)
            int r3 = r0.sourceFileIndex
            r1.putShort(r3)
        L2a0:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.debugExtension
            if (r1 == 0) goto L2bd
            int r1 = r1.length
            net.bytebuddy.jar.asm.SymbolTable r3 = r0.symbolTable
            int r3 = r3.addConstantUtf8(r10)
            net.bytebuddy.jar.asm.ByteVector r3 = r2.putShort(r3)
            net.bytebuddy.jar.asm.ByteVector r3 = r3.putInt(r1)
            net.bytebuddy.jar.asm.ByteVector r7 = r0.debugExtension
            byte[] r7 = r7.data
            r9 = 0
            r3.putByteArray(r7, r9, r1)
            goto L2be
        L2bd:
            r9 = 0
        L2be:
            int r1 = r0.accessFlags
            r1 = r1 & r16
            if (r1 == 0) goto L2d1
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r4)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            r1.putInt(r9)
        L2d1:
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r3 = r0.lastRuntimeVisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r4 = r0.lastRuntimeInvisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r7 = r0.lastRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r9 = r0.lastRuntimeInvisibleTypeAnnotation
            r22 = r1
            r23 = r3
            r24 = r4
            r25 = r7
            r26 = r9
            r27 = r2
            net.bytebuddy.jar.asm.AnnotationWriter.putAnnotations(r22, r23, r24, r25, r26, r27)
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            r1.putBootstrapMethods(r2)
            net.bytebuddy.jar.asm.ModuleWriter r1 = r0.moduleWriter
            if (r1 == 0) goto L2f6
            r1.putAttributes(r2)
        L2f6:
            int r1 = r0.nestHostClassIndex
            if (r1 == 0) goto L30e
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r8)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            r3 = 2
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putInt(r3)
            int r3 = r0.nestHostClassIndex
            r1.putShort(r3)
        L30e:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.nestMemberClasses
            if (r1 == 0) goto L336
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            int r1 = r1.addConstantUtf8(r12)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r3 = r0.nestMemberClasses
            int r3 = r3.length
            r4 = 2
            int r3 = r3 + r4
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putInt(r3)
            int r3 = r0.numberOfNestMemberClasses
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r3)
            net.bytebuddy.jar.asm.ByteVector r3 = r0.nestMemberClasses
            byte[] r4 = r3.data
            int r3 = r3.length
            r7 = 0
            r1.putByteArray(r4, r7, r3)
        L336:
            net.bytebuddy.jar.asm.ByteVector r1 = r0.permittedSubclasses
            if (r1 == 0) goto L360
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            r3 = r18
            int r1 = r1.addConstantUtf8(r3)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r3 = r0.permittedSubclasses
            int r3 = r3.length
            r4 = 2
            int r3 = r3 + r4
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putInt(r3)
            int r3 = r0.numberOfPermittedSubclasses
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putShort(r3)
            net.bytebuddy.jar.asm.ByteVector r3 = r0.permittedSubclasses
            byte[] r4 = r3.data
            int r3 = r3.length
            r7 = 0
            r1.putByteArray(r4, r7, r3)
        L360:
            int r1 = r0.accessFlags
            r1 = r1 & r17
            if (r1 != 0) goto L36a
            net.bytebuddy.jar.asm.RecordComponentWriter r1 = r0.firstRecordComponent
            if (r1 == 0) goto L38e
        L36a:
            net.bytebuddy.jar.asm.SymbolTable r1 = r0.symbolTable
            r3 = r21
            int r1 = r1.addConstantUtf8(r3)
            net.bytebuddy.jar.asm.ByteVector r1 = r2.putShort(r1)
            r3 = 2
            int r3 = r19 + 2
            net.bytebuddy.jar.asm.ByteVector r1 = r1.putInt(r3)
            r3 = r20
            r1.putShort(r3)
            net.bytebuddy.jar.asm.RecordComponentWriter r1 = r0.firstRecordComponent
        L384:
            if (r1 == 0) goto L38e
            r1.putRecordComponentInfo(r2)
            net.bytebuddy.jar.asm.RecordComponentVisitor r1 = r1.delegate
            net.bytebuddy.jar.asm.RecordComponentWriter r1 = (net.bytebuddy.jar.asm.RecordComponentWriter) r1
            goto L384
        L38e:
            net.bytebuddy.jar.asm.Attribute r1 = r0.firstAttribute
            if (r1 == 0) goto L397
            net.bytebuddy.jar.asm.SymbolTable r3 = r0.symbolTable
            r1.putAttributes(r3, r2)
        L397:
            if (r6 == 0) goto L3a0
            byte[] r1 = r2.data
            byte[] r1 = r0.replaceAsmInstructions(r1, r5)
            return r1
        L3a0:
            byte[] r1 = r2.data
            return r1
        L3a3:
            net.bytebuddy.jar.asm.ClassTooLargeException r1 = new net.bytebuddy.jar.asm.ClassTooLargeException
            net.bytebuddy.jar.asm.SymbolTable r3 = r0.symbolTable
            java.lang.String r3 = r3.getClassName()
            r1.<init>(r3, r2)
            throw r1
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visit(int r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String[] r7) {
            r1 = this;
            r1.version = r2
            r1.accessFlags = r3
            net.bytebuddy.jar.asm.SymbolTable r3 = r1.symbolTable
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r3 = r3.setMajorVersionAndClassName(r2, r4)
            r1.thisClass = r3
            if (r5 == 0) goto L1a
            net.bytebuddy.jar.asm.SymbolTable r3 = r1.symbolTable
            int r3 = r3.addConstantUtf8(r5)
            r1.signatureIndex = r3
        L1a:
            r3 = 0
            if (r6 != 0) goto L1f
            r4 = r3
            goto L27
        L1f:
            net.bytebuddy.jar.asm.SymbolTable r4 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r4 = r4.addConstantClass(r6)
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
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            r6 = r7[r3]
            net.bytebuddy.jar.asm.Symbol r5 = r5.addConstantClass(r6)
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

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
            r1 = this;
            if (r3 == 0) goto Ld
            net.bytebuddy.jar.asm.SymbolTable r3 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeVisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r3, r2, r0)
            r1.lastRuntimeVisibleAnnotation = r2
            return r2
        Ld:
            net.bytebuddy.jar.asm.SymbolTable r3 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeInvisibleAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r3, r2, r0)
            r1.lastRuntimeInvisibleAnnotation = r2
            return r2
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitAttribute(net.bytebuddy.jar.asm.Attribute r2) {
            r1 = this;
            net.bytebuddy.jar.asm.Attribute r0 = r1.firstAttribute
            r2.nextAttribute = r0
            r1.firstAttribute = r2
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitEnd() {
            r0 = this;
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final net.bytebuddy.jar.asm.FieldVisitor visitField(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.Object r13) {
            r8 = this;
            net.bytebuddy.jar.asm.FieldWriter r7 = new net.bytebuddy.jar.asm.FieldWriter
            net.bytebuddy.jar.asm.SymbolTable r1 = r8.symbolTable
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            net.bytebuddy.jar.asm.FieldWriter r9 = r8.firstField
            if (r9 != 0) goto L14
            r8.firstField = r7
            goto L18
        L14:
            net.bytebuddy.jar.asm.FieldWriter r9 = r8.lastField
            r9.fv = r7
        L18:
            r8.lastField = r7
            return r7
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitInnerClass(java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7) {
            r3 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r3.innerClasses
            if (r0 != 0) goto Lb
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            r3.innerClasses = r0
        Lb:
            net.bytebuddy.jar.asm.SymbolTable r0 = r3.symbolTable
            net.bytebuddy.jar.asm.Symbol r4 = r0.addConstantClass(r4)
            int r0 = r4.info
            if (r0 != 0) goto L4b
            int r0 = r3.numberOfInnerClasses
            int r0 = r0 + 1
            r3.numberOfInnerClasses = r0
            net.bytebuddy.jar.asm.ByteVector r0 = r3.innerClasses
            int r1 = r4.index
            r0.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r0 = r3.innerClasses
            r1 = 0
            if (r5 != 0) goto L29
            r5 = r1
            goto L31
        L29:
            net.bytebuddy.jar.asm.SymbolTable r2 = r3.symbolTable
            net.bytebuddy.jar.asm.Symbol r5 = r2.addConstantClass(r5)
            int r5 = r5.index
        L31:
            r0.putShort(r5)
            net.bytebuddy.jar.asm.ByteVector r5 = r3.innerClasses
            if (r6 != 0) goto L39
            goto L3f
        L39:
            net.bytebuddy.jar.asm.SymbolTable r0 = r3.symbolTable
            int r1 = r0.addConstantUtf8(r6)
        L3f:
            r5.putShort(r1)
            net.bytebuddy.jar.asm.ByteVector r5 = r3.innerClasses
            r5.putShort(r7)
            int r5 = r3.numberOfInnerClasses
            r4.info = r5
        L4b:
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
            r9 = this;
            net.bytebuddy.jar.asm.MethodWriter r8 = new net.bytebuddy.jar.asm.MethodWriter
            net.bytebuddy.jar.asm.SymbolTable r1 = r9.symbolTable
            int r7 = r9.compute
            r0 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            net.bytebuddy.jar.asm.MethodWriter r10 = r9.firstMethod
            if (r10 != 0) goto L16
            r9.firstMethod = r8
            goto L1a
        L16:
            net.bytebuddy.jar.asm.MethodWriter r10 = r9.lastMethod
            r10.mv = r8
        L1a:
            r9.lastMethod = r8
            return r8
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final net.bytebuddy.jar.asm.ModuleVisitor visitModule(java.lang.String r4, int r5, java.lang.String r6) {
            r3 = this;
            net.bytebuddy.jar.asm.ModuleWriter r0 = new net.bytebuddy.jar.asm.ModuleWriter
            net.bytebuddy.jar.asm.SymbolTable r1 = r3.symbolTable
            net.bytebuddy.jar.asm.Symbol r4 = r1.addConstantModule(r4)
            int r4 = r4.index
            if (r6 != 0) goto Le
            r6 = 0
            goto L14
        Le:
            net.bytebuddy.jar.asm.SymbolTable r2 = r3.symbolTable
            int r6 = r2.addConstantUtf8(r6)
        L14:
            r0.<init>(r1, r4, r5, r6)
            r3.moduleWriter = r0
            return r0
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitNestHost(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantClass(r2)
            int r2 = r2.index
            r1.nestHostClassIndex = r2
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitNestMember(java.lang.String r3) {
            r2 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r2.nestMemberClasses
            if (r0 != 0) goto Lb
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            r2.nestMemberClasses = r0
        Lb:
            int r0 = r2.numberOfNestMemberClasses
            int r0 = r0 + 1
            r2.numberOfNestMemberClasses = r0
            net.bytebuddy.jar.asm.ByteVector r0 = r2.nestMemberClasses
            net.bytebuddy.jar.asm.SymbolTable r1 = r2.symbolTable
            net.bytebuddy.jar.asm.Symbol r3 = r1.addConstantClass(r3)
            int r3 = r3.index
            r0.putShort(r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitOuterClass(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            net.bytebuddy.jar.asm.SymbolTable r0 = r1.symbolTable
            net.bytebuddy.jar.asm.Symbol r2 = r0.addConstantClass(r2)
            int r2 = r2.index
            r1.enclosingClassIndex = r2
            if (r3 == 0) goto L16
            if (r4 == 0) goto L16
            net.bytebuddy.jar.asm.SymbolTable r2 = r1.symbolTable
            int r2 = r2.addConstantNameAndType(r3, r4)
            r1.enclosingMethodIndex = r2
        L16:
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitPermittedSubclass(java.lang.String r3) {
            r2 = this;
            net.bytebuddy.jar.asm.ByteVector r0 = r2.permittedSubclasses
            if (r0 != 0) goto Lb
            net.bytebuddy.jar.asm.ByteVector r0 = new net.bytebuddy.jar.asm.ByteVector
            r0.<init>()
            r2.permittedSubclasses = r0
        Lb:
            int r0 = r2.numberOfPermittedSubclasses
            int r0 = r0 + 1
            r2.numberOfPermittedSubclasses = r0
            net.bytebuddy.jar.asm.ByteVector r0 = r2.permittedSubclasses
            net.bytebuddy.jar.asm.SymbolTable r1 = r2.symbolTable
            net.bytebuddy.jar.asm.Symbol r3 = r1.addConstantClass(r3)
            int r3 = r3.index
            r0.putShort(r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final net.bytebuddy.jar.asm.RecordComponentVisitor visitRecordComponent(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            net.bytebuddy.jar.asm.RecordComponentWriter r0 = new net.bytebuddy.jar.asm.RecordComponentWriter
            net.bytebuddy.jar.asm.SymbolTable r1 = r2.symbolTable
            r0.<init>(r1, r3, r4, r5)
            net.bytebuddy.jar.asm.RecordComponentWriter r3 = r2.firstRecordComponent
            if (r3 != 0) goto Le
            r2.firstRecordComponent = r0
            goto L12
        Le:
            net.bytebuddy.jar.asm.RecordComponentWriter r3 = r2.lastRecordComponent
            r3.delegate = r0
        L12:
            r2.lastRecordComponent = r0
            return r0
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final void visitSource(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            if (r3 == 0) goto La
            net.bytebuddy.jar.asm.SymbolTable r0 = r2.symbolTable
            int r3 = r0.addConstantUtf8(r3)
            r2.sourceFileIndex = r3
        La:
            if (r4 == 0) goto L1b
            net.bytebuddy.jar.asm.ByteVector r3 = new net.bytebuddy.jar.asm.ByteVector
            r3.<init>()
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            net.bytebuddy.jar.asm.ByteVector r3 = r3.encodeUtf8(r4, r0, r1)
            r2.debugExtension = r3
        L1b:
            return
    }

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public final net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            if (r5 == 0) goto Ld
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeVisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastRuntimeVisibleTypeAnnotation = r2
            return r2
        Ld:
            net.bytebuddy.jar.asm.SymbolTable r5 = r1.symbolTable
            net.bytebuddy.jar.asm.AnnotationWriter r0 = r1.lastRuntimeInvisibleTypeAnnotation
            net.bytebuddy.jar.asm.AnnotationWriter r2 = net.bytebuddy.jar.asm.AnnotationWriter.create(r5, r2, r3, r4, r0)
            r1.lastRuntimeInvisibleTypeAnnotation = r2
            return r2
    }
}
