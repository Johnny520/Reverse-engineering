package com.android.dx.cf.iface;

/* JADX INFO: loaded from: classes.dex */
public interface ClassFile extends com.android.dx.cf.iface.HasAttribute {
    int getAccessFlags();

    @Override // com.android.dx.cf.iface.HasAttribute
    com.android.dx.cf.iface.AttributeList getAttributes();

    com.android.dx.cf.code.BootstrapMethodsList getBootstrapMethods();

    com.android.dx.rop.cst.ConstantPool getConstantPool();

    com.android.dx.cf.iface.FieldList getFields();

    com.android.dx.rop.type.TypeList getInterfaces();

    int getMagic();

    int getMajorVersion();

    com.android.dx.cf.iface.MethodList getMethods();

    int getMinorVersion();

    com.android.dx.rop.cst.CstString getSourceFile();

    com.android.dx.rop.cst.CstType getSuperclass();

    com.android.dx.rop.cst.CstType getThisClass();
}
