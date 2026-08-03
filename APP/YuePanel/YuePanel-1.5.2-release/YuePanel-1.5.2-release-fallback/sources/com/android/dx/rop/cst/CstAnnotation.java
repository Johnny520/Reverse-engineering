package com.android.dx.rop.cst;

/* JADX INFO: loaded from: classes.dex */
public final class CstAnnotation extends com.android.dx.rop.cst.Constant {
    private final com.android.dx.rop.annotation.Annotation annotation;

    public CstAnnotation(com.android.dx.rop.annotation.Annotation r2) {
            r1 = this;
            r1.<init>()
            if (r2 == 0) goto Lb
            r2.throwIfMutable()
            r1.annotation = r2
            return
        Lb:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "annotation == null"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(com.android.dx.rop.cst.Constant r2) {
            r1 = this;
            com.android.dx.rop.annotation.Annotation r0 = r1.annotation
            com.android.dx.rop.cst.CstAnnotation r2 = (com.android.dx.rop.cst.CstAnnotation) r2
            com.android.dx.rop.annotation.Annotation r2 = r2.annotation
            int r2 = r0.compareTo2(r2)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.android.dx.rop.cst.CstAnnotation
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            com.android.dx.rop.annotation.Annotation r0 = r1.annotation
            com.android.dx.rop.cst.CstAnnotation r2 = (com.android.dx.rop.cst.CstAnnotation) r2
            com.android.dx.rop.annotation.Annotation r2 = r2.annotation
            boolean r2 = r0.equals(r2)
            return r2
    }

    public com.android.dx.rop.annotation.Annotation getAnnotation() {
            r1 = this;
            com.android.dx.rop.annotation.Annotation r0 = r1.annotation
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.android.dx.rop.annotation.Annotation r0 = r1.annotation
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
            com.android.dx.rop.annotation.Annotation r0 = r1.annotation
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            com.android.dx.rop.annotation.Annotation r0 = r1.annotation
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // com.android.dx.rop.cst.Constant
    public java.lang.String typeName() {
            r1 = this;
            java.lang.String r0 = "annotation"
            return r0
    }
}
