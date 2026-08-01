package com.android.dx.rop.cst;

import bsh.C2632;
import com.android.dx.rop.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class CstAnnotation extends Constant {
    private final Annotation annotation;

    public CstAnnotation(Annotation annotation) {
        if (annotation == null) {
            C2632.m5298("annotation == null");
            throw null;
        }
        annotation.throwIfMutable();
        this.annotation = annotation;
    }

    @Override // com.android.dx.rop.cst.Constant
    public int compareTo0(Constant constant) {
        return this.annotation.compareTo(((CstAnnotation) constant).annotation);
    }

    public boolean equals(Object obj) {
        if (obj instanceof CstAnnotation) {
            return this.annotation.equals(((CstAnnotation) obj).annotation);
        }
        return false;
    }

    public Annotation getAnnotation() {
        return this.annotation;
    }

    public int hashCode() {
        return this.annotation.hashCode();
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return this.annotation.toString();
    }

    public String toString() {
        return this.annotation.toString();
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "annotation";
    }
}
