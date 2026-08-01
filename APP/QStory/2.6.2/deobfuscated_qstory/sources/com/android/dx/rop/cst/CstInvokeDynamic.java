package com.android.dx.rop.cst;

import bsh.C2632;
import com.android.dx.rop.type.Prototype;
import com.android.dx.rop.type.Type;
import java.util.ArrayList;
import java.util.List;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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

    @Override // com.android.dx.rop.cst.Constant
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

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    public void setCallSite(CstCallSite cstCallSite) {
        if (this.callSite != null) {
            C5919.m11249("already added call site");
        } else if (cstCallSite != null) {
            this.callSite = cstCallSite;
        } else {
            C2632.m5298("callSite == null");
        }
    }

    public void setDeclaringClass(CstType cstType) {
        if (this.declaringClass != null) {
            C5919.m11249("already added declaring class");
        } else if (cstType != null) {
            this.declaringClass = cstType;
        } else {
            C2632.m5298("declaringClass == null");
        }
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        CstType cstType = this.declaringClass;
        StringBuilder sbM11550 = AbstractC6136.m11550("InvokeDynamic(", cstType != null ? cstType.toHuman() : "Unknown", ":");
        sbM11550.append(this.bootstrapMethodIndex);
        sbM11550.append(", ");
        sbM11550.append(this.nat.toHuman());
        sbM11550.append(")");
        return sbM11550.toString();
    }

    public String toString() {
        return toHuman();
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "InvokeDynamic";
    }
}
