package com.android.p002dx.rop.cst;

import bsh.C3466;
import com.android.p002dx.rop.type.Prototype;
import com.android.p002dx.rop.type.Type;
import java.util.ArrayList;
import java.util.List;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CstInvokeDynamic extends Constant {
    private final int bootstrapMethodIndex;
    private CstCallSite callSite;
    private CstType declaringClass;
    private final CstNat nat;
    private final Prototype prototype;
    private final List<CstCallSiteRef> references = new ArrayList();

    private CstInvokeDynamic(int i, CstNat cstNat) {
        this.bootstrapMethodIndex = i;
        this.nat = cstNat;
        this.prototype = Prototype.fromDescriptor(cstNat.getDescriptor().toHuman());
    }

    public static CstInvokeDynamic make(int i, CstNat cstNat) {
        return new CstInvokeDynamic(i, cstNat);
    }

    public CstCallSiteRef addReference() {
        CstCallSiteRef cstCallSiteRef = new CstCallSiteRef(this, this.references.size());
        this.references.add(cstCallSiteRef);
        return cstCallSiteRef;
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        CstInvokeDynamic cstInvokeDynamic = (CstInvokeDynamic) constant;
        int iCompare = Integer.compare(this.bootstrapMethodIndex, cstInvokeDynamic.getBootstrapMethodIndex());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompareTo = this.nat.compareTo((Constant) cstInvokeDynamic.getNat());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.declaringClass.compareTo((Constant) cstInvokeDynamic.getDeclaringClass());
        return iCompareTo2 != 0 ? iCompareTo2 : this.callSite.compareTo((Constant) cstInvokeDynamic.getCallSite());
    }

    public int getBootstrapMethodIndex() {
        return this.bootstrapMethodIndex;
    }

    public CstCallSite getCallSite() {
        return this.callSite;
    }

    public CstType getDeclaringClass() {
        return this.declaringClass;
    }

    public CstNat getNat() {
        return this.nat;
    }

    public Prototype getPrototype() {
        return this.prototype;
    }

    public List<CstCallSiteRef> getReferences() {
        return this.references;
    }

    public Type getReturnType() {
        return this.prototype.getReturnType();
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    public void setCallSite(CstCallSite cstCallSite) {
        if (this.callSite != null) {
            C6755.m11869("already added call site");
        } else if (cstCallSite != null) {
            this.callSite = cstCallSite;
        } else {
            C3466.m5903("callSite == null");
        }
    }

    public void setDeclaringClass(CstType cstType) {
        if (this.declaringClass != null) {
            C6755.m11869("already added declaring class");
        } else if (cstType != null) {
            this.declaringClass = cstType;
        } else {
            C3466.m5903("declaringClass == null");
        }
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        CstType cstType = this.declaringClass;
        StringBuilder sbM12144 = AbstractC7012.m12144("InvokeDynamic(", cstType != null ? cstType.toHuman() : "Unknown", ":");
        sbM12144.append(this.bootstrapMethodIndex);
        sbM12144.append(", ");
        sbM12144.append(this.nat.toHuman());
        sbM12144.append(")");
        return sbM12144.toString();
    }

    public String toString() {
        return toHuman();
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "InvokeDynamic";
    }
}
