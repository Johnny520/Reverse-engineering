package com.android.dx.rop.annotation;

import bsh.C2632;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstString;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class NameValuePair implements Comparable<NameValuePair> {
    private final CstString name;
    private final Constant value;

    public NameValuePair(CstString cstString, Constant constant) {
        if (cstString == null) {
            C2632.m5298("name == null");
            throw null;
        }
        if (constant == null) {
            C2632.m5298("value == null");
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
