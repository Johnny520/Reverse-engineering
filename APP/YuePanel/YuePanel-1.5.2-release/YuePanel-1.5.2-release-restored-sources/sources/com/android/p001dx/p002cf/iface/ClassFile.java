package com.android.p001dx.p002cf.iface;

import com.android.p001dx.p002cf.code.BootstrapMethodsList;
import com.android.p001dx.rop.cst.ConstantPool;
import com.android.p001dx.rop.cst.CstString;
import com.android.p001dx.rop.cst.CstType;
import com.android.p001dx.rop.type.TypeList;

/* JADX INFO: loaded from: classes.dex */
public interface ClassFile extends HasAttribute {
    int getAccessFlags();

    @Override // com.android.p001dx.p002cf.iface.HasAttribute
    AttributeList getAttributes();

    BootstrapMethodsList getBootstrapMethods();

    ConstantPool getConstantPool();

    FieldList getFields();

    TypeList getInterfaces();

    int getMagic();

    int getMajorVersion();

    MethodList getMethods();

    int getMinorVersion();

    CstString getSourceFile();

    CstType getSuperclass();

    CstType getThisClass();
}
