package com.android.dx.cf.attrib;

import bsh.C2633;
import com.android.dx.util.MutabilityException;

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
            C2633.m5343("innerClasses == null");
            throw null;
        }
    }

    @Override // com.android.dx.cf.iface.Attribute
    public int byteLength() {
        return (this.innerClasses.size() * 8) + 8;
    }

    public InnerClassList getInnerClasses() {
        return this.innerClasses;
    }
}
