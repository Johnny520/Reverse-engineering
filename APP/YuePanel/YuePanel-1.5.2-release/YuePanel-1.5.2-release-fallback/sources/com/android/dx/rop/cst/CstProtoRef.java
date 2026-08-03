package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstProtoRef extends com.android.dx.rop.cst.TypedConstant {
    private final com.android.dx.rop.type.Prototype prototype;

    public CstProtoRef(com.android.dx.rop.type.Prototype r1) {
            r0 = this;
            r0.<init>()
            r0.prototype = r1
            return
    }

    public static com.android.dx.rop.cst.CstProtoRef make(com.android.dx.rop.cst.CstString r1) {
            java.lang.String r1 = r1.getString()
            com.android.dx.rop.type.Prototype r1 = com.android.dx.rop.type.Prototype.fromDescriptor(r1)
            com.android.dx.rop.cst.CstProtoRef r0 = new com.android.dx.rop.cst.CstProtoRef
            r0.<init>(r1)
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            com.android.dx.rop.cst.CstProtoRef r2 = (com.android.dx.rop.cst.CstProtoRef) r2
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            com.android.dx.rop.type.Prototype r2 = r2.getPrototype()
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstProtoRef
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.android.dx.rop.cst.CstProtoRef r2 = (com.android.dx.rop.cst.CstProtoRef) r2
            com.android.dx.rop.type.Prototype r0 = r1.getPrototype()
            com.android.dx.rop.type.Prototype r2 = r2.getPrototype()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.android.dx.rop.type.Prototype getPrototype() {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            return r0
    }

    @Override // com.android.dx.rop.type.TypeBearer
    public com.android.dx.rop.type.Type getType() {
            r1 = this;
            com.android.dx.rop.type.Type r0 = com.android.dx.rop.type.Type.METHOD_TYPE
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            int r0 = r0.hashCode()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.android.dx.util.ToHuman
    public java.lang.String toHuman() {
            r1 = this;
            com.android.dx.rop.type.Prototype r0 = r1.prototype
            java.lang.String r0 = r0.getDescriptor()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.typeName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            java.lang.String r1 = r2.toHuman()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "proto"
            return r0
    }
}
