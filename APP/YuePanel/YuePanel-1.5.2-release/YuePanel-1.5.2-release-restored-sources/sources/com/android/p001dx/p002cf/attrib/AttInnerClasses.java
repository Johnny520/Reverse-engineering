package com.android.p001dx.p002cf.attrib;

import com.android.p001dx.util.MutabilityException;

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
            throw new NullPointerException("innerClasses == null");
        }
    }

    @Override // com.android.p001dx.p002cf.iface.Attribute
    public int byteLength() {
        return (this.innerClasses.size() * 8) + 8;
    }

    public InnerClassList getInnerClasses() {
        return this.innerClasses;
    }
}
