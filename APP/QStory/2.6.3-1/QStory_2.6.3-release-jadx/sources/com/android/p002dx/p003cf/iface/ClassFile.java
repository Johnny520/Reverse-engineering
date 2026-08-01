package com.android.p002dx.p003cf.iface;

import com.android.p002dx.p003cf.code.BootstrapMethodsList;
import com.android.p002dx.rop.cst.ConstantPool;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.cst.CstType;
import com.android.p002dx.rop.type.TypeList;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public interface ClassFile extends HasAttribute {
    int getAccessFlags();

    @Override // com.android.p002dx.p003cf.iface.HasAttribute
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
