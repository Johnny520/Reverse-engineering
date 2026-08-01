package com.android.p002dx.p003cf.iface;

import bsh.C3466;
import com.android.p002dx.rop.cst.CstNat;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.cst.CstType;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class StdMember implements Member {
    private final int accessFlags;
    private final AttributeList attributes;
    private final CstType definingClass;
    private final CstNat nat;

    public StdMember(CstType cstType, int i, CstNat cstNat, AttributeList attributeList) {
        if (cstType == null) {
            C3466.m5903("definingClass == null");
            throw null;
        }
        if (cstNat == null) {
            C3466.m5903("nat == null");
            throw null;
        }
        if (attributeList == null) {
            C3466.m5903("attributes == null");
            throw null;
        }
        this.definingClass = cstType;
        this.accessFlags = i;
        this.nat = cstNat;
        this.attributes = attributeList;
    }

    @Override // com.android.p002dx.p003cf.iface.Member
    public final int getAccessFlags() {
        return this.accessFlags;
    }

    @Override // com.android.p002dx.p003cf.iface.Member, com.android.p002dx.p003cf.iface.HasAttribute
    public final AttributeList getAttributes() {
        return this.attributes;
    }

    @Override // com.android.p002dx.p003cf.iface.Member
    public final CstType getDefiningClass() {
        return this.definingClass;
    }

    @Override // com.android.p002dx.p003cf.iface.Member
    public final CstString getDescriptor() {
        return this.nat.getDescriptor();
    }

    @Override // com.android.p002dx.p003cf.iface.Member
    public final CstString getName() {
        return this.nat.getName();
    }

    @Override // com.android.p002dx.p003cf.iface.Member
    public final CstNat getNat() {
        return this.nat;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(this.nat.toHuman());
        sb.append('}');
        return sb.toString();
    }
}
