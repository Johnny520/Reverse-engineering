package com.android.p002dx.rop.cst;

import bsh.C3466;
import com.android.p002dx.rop.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CstAnnotation extends Constant {
    private final Annotation annotation;

    public CstAnnotation(Annotation annotation) {
        if (annotation == null) {
            C3466.m5903("annotation == null");
            throw null;
        }
        annotation.throwIfMutable();
        this.annotation = annotation;
    }

    @Override // com.android.p002dx.rop.cst.Constant
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

    @Override // com.android.p002dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.p002dx.util.ToHuman
    public String toHuman() {
        return this.annotation.toString();
    }

    public String toString() {
        return this.annotation.toString();
    }

    @Override // com.android.p002dx.rop.cst.Constant
    public String typeName() {
        return "annotation";
    }
}
