package com.android.p002dx.rop.annotation;

import bsh.C3466;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.CstString;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class NameValuePair implements Comparable<NameValuePair> {
    private final CstString name;
    private final Constant value;

    public NameValuePair(CstString cstString, Constant constant) {
        if (cstString == null) {
            C3466.m5903("name == null");
            throw null;
        }
        if (constant == null) {
            C3466.m5903("value == null");
            throw null;
        }
        this.name = cstString;
        this.value = constant;
    }

    @Override // java.lang.Comparable
    public int compareTo(NameValuePair nameValuePair) {
        int iCompareTo = this.name.compareTo((Constant) nameValuePair.name);
        return iCompareTo != 0 ? iCompareTo : this.value.compareTo(nameValuePair.value);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof NameValuePair)) {
            return false;
        }
        NameValuePair nameValuePair = (NameValuePair) obj;
        return this.name.equals(nameValuePair.name) && this.value.equals(nameValuePair.value);
    }

    public CstString getName() {
        return this.name;
    }

    public Constant getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.toHuman() + ":" + this.value;
    }
}
