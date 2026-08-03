package bsh.org.objectweb.asm;

import bsh.org.objectweb.asm.Attribute;
import okhttp3.internal.http2.Settings;
import okio.C3193a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ClassWriter extends ClassVisitor {
    public static final int COMPUTE_FRAMES = 2;
    public static final int COMPUTE_MAXS = 1;
    private int accessFlags;
    private int compute;
    private ByteVector debugExtension;
    private int enclosingClassIndex;
    private int enclosingMethodIndex;
    private Attribute firstAttribute;
    private FieldWriter firstField;
    private MethodWriter firstMethod;
    private ByteVector innerClasses;
    private int interfaceCount;
    private int[] interfaces;
    private FieldWriter lastField;
    private MethodWriter lastMethod;
    private int numberOfInnerClasses;
    private int signatureIndex;
    private int sourceFileIndex;
    private int superClass;
    private final SymbolTable symbolTable;
    private int thisClass;
    private int version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassWriter(int i9) {
        super(Opcodes.ASM6);
        this.symbolTable = new SymbolTable(this);
        if ((i9 & 2) != 0) {
            this.compute = 4;
        } else if ((i9 & 1) != 0) {
            this.compute = 1;
        } else {
            this.compute = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Attribute[] getAttributePrototypes() {
        Attribute.Set set = new Attribute.Set();
        set.addAttributes(this.firstAttribute);
        for (FieldWriter fieldWriter = this.firstField; fieldWriter != null; fieldWriter = (FieldWriter) fieldWriter.f1003fv) {
            fieldWriter.collectAttributePrototypes(set);
        }
        for (MethodWriter methodWriter = this.firstMethod; methodWriter != null; methodWriter = (MethodWriter) methodWriter.f1004mv) {
            methodWriter.collectAttributePrototypes(set);
        }
        return set.toArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private byte[] replaceAsmInstructions(byte[] bArr, boolean z9) {
        getAttributePrototypes();
        this.firstField = null;
        this.lastField = null;
        this.firstMethod = null;
        this.lastMethod = null;
        this.firstAttribute = null;
        this.compute = z9 ? 3 : 0;
        return toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getCommonSuperClass(String str, String str2) {
        ClassLoader classLoader = getClass().getClassLoader();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, classLoader);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, classLoader);
                if (cls.isAssignableFrom(cls2)) {
                    return str;
                }
                if (cls2.isAssignableFrom(cls)) {
                    return str2;
                }
                if (cls.isInterface() || cls2.isInterface()) {
                    return "java/lang/Object";
                }
                do {
                    cls = cls.getSuperclass();
                } while (!cls.isAssignableFrom(cls2));
                return cls.getName().replace('.', '/');
            } catch (Exception e6) {
                throw new TypeNotPresentException(str2, e6);
            }
        } catch (Exception e7) {
            throw new TypeNotPresentException(str, e7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newClass(String str) {
        return this.symbolTable.addConstantClass(str).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newConst(Object obj) {
        return this.symbolTable.addConstant(obj).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newField(String str, String str2, String str3) {
        return this.symbolTable.addConstantFieldref(str, str2, str3).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public int newHandle(int i9, String str, String str2, String str3) {
        return newHandle(i9, str, str2, str3, i9 == 9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newInvokeDynamic(String str, String str2, Handle handle, Object... objArr) {
        return this.symbolTable.addConstantInvokeDynamic(str, str2, handle, objArr).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newMethod(String str, String str2, String str3, boolean z9) {
        return this.symbolTable.addConstantMethodref(str, str2, str3, z9).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newMethodType(String str) {
        return this.symbolTable.addConstantMethodType(str).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newModule(String str) {
        return this.symbolTable.addConstantModule(str).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newNameType(String str, String str2) {
        return this.symbolTable.addConstantNameAndType(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newPackage(String str) {
        return this.symbolTable.addConstantPackage(str).index;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int newUTF8(String str) {
        return this.symbolTable.addConstantUtf8(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] toByteArray() {
        int attributeCount;
        int i9;
        int i10;
        int iComputeAttributesSize = (this.interfaceCount * 2) + 24;
        int i11 = 0;
        for (FieldWriter fieldWriter = this.firstField; fieldWriter != null; fieldWriter = (FieldWriter) fieldWriter.f1003fv) {
            i11++;
            iComputeAttributesSize += fieldWriter.computeFieldInfoSize();
        }
        int i12 = 0;
        for (MethodWriter methodWriter = this.firstMethod; methodWriter != null; methodWriter = (MethodWriter) methodWriter.f1004mv) {
            i12++;
            iComputeAttributesSize += methodWriter.computeMethodInfoSize();
        }
        ByteVector byteVector = this.innerClasses;
        if (byteVector != null) {
            iComputeAttributesSize += byteVector.length + 8;
            this.symbolTable.addConstantUtf8("InnerClasses");
            attributeCount = 1;
        } else {
            attributeCount = 0;
        }
        if (this.enclosingClassIndex != 0) {
            attributeCount++;
            iComputeAttributesSize += 10;
            this.symbolTable.addConstantUtf8("EnclosingMethod");
        }
        if ((this.accessFlags & 4096) != 0 && (this.version & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
            attributeCount++;
            iComputeAttributesSize += 6;
            this.symbolTable.addConstantUtf8("Synthetic");
        }
        if (this.signatureIndex != 0) {
            attributeCount++;
            iComputeAttributesSize += 8;
            this.symbolTable.addConstantUtf8("Signature");
        }
        if (this.sourceFileIndex != 0) {
            attributeCount++;
            iComputeAttributesSize += 8;
            this.symbolTable.addConstantUtf8("SourceFile");
        }
        ByteVector byteVector2 = this.debugExtension;
        if (byteVector2 != null) {
            attributeCount++;
            iComputeAttributesSize += byteVector2.length + 6;
            this.symbolTable.addConstantUtf8("SourceDebugExtension");
        }
        if ((this.accessFlags & Opcodes.ACC_DEPRECATED) != 0) {
            attributeCount++;
            iComputeAttributesSize += 6;
            this.symbolTable.addConstantUtf8("Deprecated");
        }
        if (this.symbolTable.computeBootstrapMethodsSize() > 0) {
            attributeCount++;
            iComputeAttributesSize += this.symbolTable.computeBootstrapMethodsSize();
        }
        Attribute attribute = this.firstAttribute;
        if (attribute != null) {
            attributeCount += attribute.getAttributeCount();
            iComputeAttributesSize += this.firstAttribute.computeAttributesSize(this.symbolTable);
        }
        int constantPoolLength = iComputeAttributesSize + this.symbolTable.getConstantPoolLength();
        if (this.symbolTable.getConstantPoolCount() > 65535) {
            C3193a.m6820i("Class file too large!");
            return null;
        }
        ByteVector byteVector3 = new ByteVector(constantPoolLength);
        byteVector3.putInt(-889275714).putInt(this.version);
        this.symbolTable.putConstantPool(byteVector3);
        byteVector3.putShort((~((this.version & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49 ? 4096 : 0)) & this.accessFlags).putShort(this.thisClass).putShort(this.superClass);
        byteVector3.putShort(this.interfaceCount);
        for (int i13 = 0; i13 < this.interfaceCount; i13++) {
            byteVector3.putShort(this.interfaces[i13]);
        }
        byteVector3.putShort(i11);
        for (FieldWriter fieldWriter2 = this.firstField; fieldWriter2 != null; fieldWriter2 = (FieldWriter) fieldWriter2.f1003fv) {
            fieldWriter2.putFieldInfo(byteVector3);
        }
        byteVector3.putShort(i12);
        boolean zHasFrames = false;
        boolean zHasAsmInstructions = false;
        for (MethodWriter methodWriter2 = this.firstMethod; methodWriter2 != null; methodWriter2 = (MethodWriter) methodWriter2.f1004mv) {
            zHasFrames |= methodWriter2.hasFrames();
            zHasAsmInstructions |= methodWriter2.hasAsmInstructions();
            methodWriter2.putMethodInfo(byteVector3);
        }
        byteVector3.putShort(attributeCount);
        if (this.innerClasses != null) {
            ByteVector byteVectorPutShort = byteVector3.putShort(this.symbolTable.addConstantUtf8("InnerClasses")).putInt(this.innerClasses.length + 2).putShort(this.numberOfInnerClasses);
            ByteVector byteVector4 = this.innerClasses;
            byteVectorPutShort.putByteArray(byteVector4.data, 0, byteVector4.length);
        }
        if (this.enclosingClassIndex != 0) {
            byteVector3.putShort(this.symbolTable.addConstantUtf8("EnclosingMethod")).putInt(4).putShort(this.enclosingClassIndex).putShort(this.enclosingMethodIndex);
        }
        if ((this.accessFlags & 4096) != 0 && (this.version & Settings.DEFAULT_INITIAL_WINDOW_SIZE) < 49) {
            byteVector3.putShort(this.symbolTable.addConstantUtf8("Synthetic")).putInt(0);
        }
        if (this.signatureIndex != 0) {
            i9 = 2;
            byteVector3.putShort(this.symbolTable.addConstantUtf8("Signature")).putInt(2).putShort(this.signatureIndex);
        } else {
            i9 = 2;
        }
        if (this.sourceFileIndex != 0) {
            byteVector3.putShort(this.symbolTable.addConstantUtf8("SourceFile")).putInt(i9).putShort(this.sourceFileIndex);
        }
        ByteVector byteVector5 = this.debugExtension;
        if (byteVector5 != null) {
            int i14 = byteVector5.length;
            i10 = 0;
            byteVector3.putShort(this.symbolTable.addConstantUtf8("SourceDebugExtension")).putInt(i14).putByteArray(this.debugExtension.data, 0, i14);
        } else {
            i10 = 0;
        }
        if ((this.accessFlags & Opcodes.ACC_DEPRECATED) != 0) {
            byteVector3.putShort(this.symbolTable.addConstantUtf8("Deprecated")).putInt(i10);
        }
        this.symbolTable.putBootstrapMethods(byteVector3);
        Attribute attribute2 = this.firstAttribute;
        if (attribute2 != null) {
            attribute2.putAttributes(this.symbolTable, byteVector3);
        }
        byte[] bArr = byteVector3.data;
        return zHasAsmInstructions ? replaceAsmInstructions(bArr, zHasFrames) : bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visit(int i9, int i10, String str, String str2, String str3, String[] strArr) {
        this.version = i9;
        this.accessFlags = i10;
        SymbolTable symbolTable = this.symbolTable;
        int i11 = i9 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        this.thisClass = symbolTable.setMajorVersionAndClassName(i11, str);
        if (str2 != null) {
            this.signatureIndex = this.symbolTable.addConstantUtf8(str2);
        }
        this.superClass = str3 == null ? 0 : this.symbolTable.addConstantClass(str3).index;
        if (strArr != null && strArr.length > 0) {
            int length = strArr.length;
            this.interfaceCount = length;
            this.interfaces = new int[length];
            for (int i12 = 0; i12 < this.interfaceCount; i12++) {
                this.interfaces[i12] = this.symbolTable.addConstantClass(strArr[i12]).index;
            }
        }
        if (this.compute != 1 || i11 < 51) {
            return;
        }
        this.compute = 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitAttribute(Attribute attribute) {
        attribute.nextAttribute = this.firstAttribute;
        this.firstAttribute = attribute;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final FieldVisitor visitField(int i9, String str, String str2, String str3, Object obj) {
        FieldWriter fieldWriter = new FieldWriter(this.symbolTable, i9, str, str2, str3, obj);
        if (this.firstField == null) {
            this.firstField = fieldWriter;
        } else {
            this.lastField.f1003fv = fieldWriter;
        }
        this.lastField = fieldWriter;
        return fieldWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitInnerClass(String str, String str2, String str3, int i9) {
        if (this.innerClasses == null) {
            this.innerClasses = new ByteVector();
        }
        Symbol symbolAddConstantClass = this.symbolTable.addConstantClass(str);
        if (symbolAddConstantClass.info == 0) {
            this.numberOfInnerClasses++;
            this.innerClasses.putShort(symbolAddConstantClass.index);
            this.innerClasses.putShort(str2 == null ? 0 : this.symbolTable.addConstantClass(str2).index);
            this.innerClasses.putShort(str3 != null ? this.symbolTable.addConstantUtf8(str3) : 0);
            this.innerClasses.putShort(i9);
            symbolAddConstantClass.info = this.numberOfInnerClasses;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final MethodVisitor visitMethod(int i9, String str, String str2, String str3, String[] strArr) {
        MethodWriter methodWriter = new MethodWriter(this.symbolTable, i9, str, str2, str3, strArr, this.compute);
        if (this.firstMethod == null) {
            this.firstMethod = methodWriter;
        } else {
            this.lastMethod.f1004mv = methodWriter;
        }
        this.lastMethod = methodWriter;
        return methodWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitOuterClass(String str, String str2, String str3) {
        this.enclosingClassIndex = this.symbolTable.addConstantClass(str).index;
        if (str2 == null || str3 == null) {
            return;
        }
        this.enclosingMethodIndex = this.symbolTable.addConstantNameAndType(str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitSource(String str, String str2) {
        if (str != null) {
            this.sourceFileIndex = this.symbolTable.addConstantUtf8(str);
        }
        if (str2 != null) {
            this.debugExtension = new ByteVector().encodeUTF8(str2, 0, Integer.MAX_VALUE);
        }
    }

    public int newHandle(int i9, String str, String str2, String str3, boolean z9) {
        return this.symbolTable.addConstantMethodHandle(i9, str, str2, str3, z9).index;
    }

    @Override // bsh.org.objectweb.asm.ClassVisitor
    public final void visitEnd() {
    }
}
