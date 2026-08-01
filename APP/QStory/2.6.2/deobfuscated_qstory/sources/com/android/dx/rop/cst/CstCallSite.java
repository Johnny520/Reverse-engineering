package com.android.dx.rop.cst;

import bsh.C2632;
import com.android.dx.cf.code.BootstrapMethodArgumentsList;
import com.android.dx.rop.cst.CstArray;
import com.android.dx.rop.type.Prototype;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class CstCallSite extends CstArray {
    private CstCallSite(CstArray.List list) {
        super(list);
    }

    public static CstCallSite make(CstMethodHandle cstMethodHandle, CstNat cstNat, BootstrapMethodArgumentsList bootstrapMethodArgumentsList) {
        if (cstMethodHandle == null) {
            C2632.m5298("bootstrapMethodHandle == null");
            return null;
        }
        if (cstNat == null) {
            C2632.m5298("nat == null");
            return null;
        }
        CstArray.List list = new CstArray.List(bootstrapMethodArgumentsList.size() + 3);
        list.set(0, cstMethodHandle);
        list.set(1, cstNat.getName());
        list.set(2, new CstProtoRef(Prototype.fromDescriptor(cstNat.getDescriptor().getString())));
        for (int i = 0; i < bootstrapMethodArgumentsList.size(); i++) {
            list.set(i + 3, bootstrapMethodArgumentsList.get(i));
        }
        list.setImmutable();
        return new CstCallSite(list);
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        return getList().compareTo(((CstCallSite) constant).getList());
    }

    @Override // com.android.dx.rop.cst.CstArray
    public boolean equals(Object obj) {
        if (obj instanceof CstCallSite) {
            return getList().equals(((CstCallSite) obj).getList());
        }
        return false;
    }

    @Override // com.android.dx.rop.cst.CstArray
    public int hashCode() {
        return getList().hashCode();
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.util.ToHuman
    public String toHuman() {
        return getList().toHuman("{", ", ", "}");
    }

    @Override // com.android.dx.rop.cst.CstArray
    public String toString() {
        return getList().toString("call site{", ", ", "}");
    }

    @Override // com.android.dx.rop.cst.CstArray, com.android.dx.rop.cst.Constant
    public String typeName() {
        return "call site";
    }
}
