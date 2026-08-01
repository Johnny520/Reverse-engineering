package com.android.p002dx.p003cf.attrib;

import bsh.C3466;
import com.android.p002dx.util.MutabilityException;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class AttInnerClasses extends BaseAttribute {
    public static final String ATTRIBUTE_NAME = "InnerClasses";
    private final InnerClassList innerClasses;

    public AttInnerClasses(InnerClassList innerClassList) {
        super(ATTRIBUTE_NAME);
        try {
            if (innerClassList.isMutable()) {
                throw new MutabilityException("innerClasses.isMutable()");
            }
            this.innerClasses = innerClassList;
        } catch (NullPointerException unused) {
            C3466.m5903("innerClasses == null");
            throw null;
        }
    }

    @Override // com.android.p002dx.p003cf.iface.Attribute
    public int byteLength() {
        return (this.innerClasses.size() * 8) + 8;
    }

    public InnerClassList getInnerClasses() {
        return this.innerClasses;
    }
}
