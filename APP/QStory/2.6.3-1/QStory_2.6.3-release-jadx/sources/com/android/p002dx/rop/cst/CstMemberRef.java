package com.android.p002dx.rop.cst;

import bsh.C3466;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CstMemberRef extends TypedConstant {
    private final CstType definingClass;
    private final CstNat nat;

    public CstMemberRef(CstType cstType, CstNat cstNat) {
        if (cstType == null) {
            C3466.m5903("definingClass == null");
            throw null;
        }
        if (cstNat == null) {
            C3466.m5903("nat == null");
            throw null;
        }
        this.definingClass = cstType;
        this.nat = cstNat;
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        CstMemberRef cstMemberRef = (CstMemberRef) constant;
        int iCompareTo = this.definingClass.compareTo((Constant) cstMemberRef.definingClass);
        return iCompareTo != 0 ? iCompareTo : this.nat.getName().compareTo((Constant) cstMemberRef.nat.getName());
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass() == obj.getClass()) {
            CstMemberRef cstMemberRef = (CstMemberRef) obj;
            if (this.definingClass.equals(cstMemberRef.definingClass) && this.nat.equals(cstMemberRef.nat)) {
                return true;
            }
        }
        return false;
    }

    public final CstType getDefiningClass() {
        return this.definingClass;
    }

    public final CstNat getNat() {
        return this.nat;
    }

    public final int hashCode() {
        return this.nat.hashCode() ^ (this.definingClass.hashCode() * 31);
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public final boolean isCategory2() {
        return false;
    }

    @Override // com.android.p002dx.util.ToHuman
    public final String toHuman() {
        return this.definingClass.toHuman() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + this.nat.toHuman();
    }

    public final String toString() {
        return typeName() + '{' + toHuman() + '}';
    }
}
