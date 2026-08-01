package com.alibaba.fastjson2.internal.asm;

import com.alibaba.fastjson2.C1573e;
import com.alibaba.fastjson2.C1605j;
import com.alibaba.fastjson2.util.TypeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import okhttp3.internal.http2.Settings;
import p319w2.C9079i0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ClassWriter {
    private int accessFlags;
    private FieldWriter firstField;
    private MethodWriter firstMethod;
    private int interfaceCount;
    private int[] interfaces;
    private FieldWriter lastField;
    private MethodWriter lastMethod;
    private int superClass;
    private final SymbolTable symbolTable = new SymbolTable(this);
    private int thisClass;
    private final Function<String, Class> typeProvider;
    private int version;

    public ClassWriter(Function<String, Class> function) {
        this.typeProvider = function;
    }

    public String getCommonSuperClass(String str, String str2) {
        Class<? super Object> clsLoadClass = loadClass(str);
        if (clsLoadClass == null) {
            C1605j.m6294a("class not found ", str);
            return null;
        }
        Class<?> clsLoadClass2 = loadClass(str2);
        if (clsLoadClass2 == null) {
            return ASMUtils.TYPE_OBJECT;
        }
        if (clsLoadClass.isAssignableFrom(clsLoadClass2)) {
            return str;
        }
        if (clsLoadClass2.isAssignableFrom(clsLoadClass)) {
            return str2;
        }
        if (clsLoadClass.isInterface() || clsLoadClass2.isInterface()) {
            return ASMUtils.TYPE_OBJECT;
        }
        do {
            clsLoadClass = clsLoadClass.getSuperclass();
        } while (!clsLoadClass.isAssignableFrom(clsLoadClass2));
        return clsLoadClass.getName().replace('.', '/');
    }

    public Class loadClass(String str) {
        str.getClass();
        switch (str) {
            case "java/util/List":
                return List.class;
            case "java/util/ArrayList":
                return ArrayList.class;
            case "java/lang/Object":
                return Object.class;
            default:
                String strReplace = str.replace('/', '.');
                Function<String, Class> function = this.typeProvider;
                Class clsApply = function != null ? function.apply(strReplace) : null;
                return clsApply == null ? TypeUtils.loadClass(strReplace) : clsApply;
        }
    }

    public byte[] toByteArray() {
        int iComputeMethodInfoSize = (this.interfaceCount * 2) + 24;
        int i10 = 0;
        for (FieldWriter fieldWriter = this.firstField; fieldWriter != null; fieldWriter = fieldWriter.f4558fv) {
            i10++;
            iComputeMethodInfoSize += 8;
        }
        int i11 = 0;
        for (MethodWriter methodWriter = this.firstMethod; methodWriter != null; methodWriter = methodWriter.f4559mv) {
            i11++;
            iComputeMethodInfoSize += methodWriter.computeMethodInfoSize();
        }
        SymbolTable symbolTable = this.symbolTable;
        int i12 = iComputeMethodInfoSize + symbolTable.constantPool.length;
        int i13 = symbolTable.constantPoolCount;
        if (i13 > 65535) {
            C1573e.m6261a("Class too large: ", this.symbolTable.className, ", constantPoolCount ", i13);
            return null;
        }
        ByteVector byteVector = new ByteVector(i12);
        byteVector.putInt(-889275714).putInt(this.version);
        ByteVector byteVectorPutShort = byteVector.putShort(i13);
        ByteVector byteVector2 = this.symbolTable.constantPool;
        byteVectorPutShort.putByteArray(byteVector2.data, 0, byteVector2.length);
        byteVector.putShort(this.accessFlags).putShort(this.thisClass).putShort(this.superClass);
        byteVector.putShort(this.interfaceCount);
        for (int i14 = 0; i14 < this.interfaceCount; i14++) {
            byteVector.putShort(this.interfaces[i14]);
        }
        byteVector.putShort(i10);
        for (FieldWriter fieldWriter2 = this.firstField; fieldWriter2 != null; fieldWriter2 = fieldWriter2.f4558fv) {
            fieldWriter2.putFieldInfo(byteVector);
        }
        byteVector.putShort(i11);
        boolean z10 = false;
        for (MethodWriter methodWriter2 = this.firstMethod; methodWriter2 != null; methodWriter2 = methodWriter2.f4559mv) {
            z10 |= methodWriter2.hasAsmInstructions;
            methodWriter2.putMethodInfo(byteVector);
        }
        byteVector.putShort(0);
        if (!z10) {
            return byteVector.data;
        }
        C9079i0.m35296a();
        return null;
    }

    public final void visit(int i10, int i11, String str, String str2, String[] strArr) {
        this.version = i10;
        this.accessFlags = i11;
        this.thisClass = this.symbolTable.setMajorVersionAndClassName(i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE, str);
        this.superClass = str2 == null ? 0 : this.symbolTable.addConstantUtf8Reference(7, str2).index;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.interfaceCount = length;
        this.interfaces = new int[length];
        for (int i12 = 0; i12 < this.interfaceCount; i12++) {
            this.interfaces[i12] = this.symbolTable.addConstantUtf8Reference(7, strArr[i12]).index;
        }
    }

    public final FieldWriter visitField(int i10, String str, String str2) {
        FieldWriter fieldWriter = new FieldWriter(this.symbolTable, i10, str, str2);
        if (this.firstField == null) {
            this.firstField = fieldWriter;
        } else {
            this.lastField.f4558fv = fieldWriter;
        }
        this.lastField = fieldWriter;
        return fieldWriter;
    }

    public final MethodWriter visitMethod(int i10, String str, String str2, int i11) {
        MethodWriter methodWriter = new MethodWriter(this.symbolTable, i10, str, str2, i11);
        if (this.firstMethod == null) {
            this.firstMethod = methodWriter;
        } else {
            this.lastMethod.f4559mv = methodWriter;
        }
        this.lastMethod = methodWriter;
        return methodWriter;
    }
}
