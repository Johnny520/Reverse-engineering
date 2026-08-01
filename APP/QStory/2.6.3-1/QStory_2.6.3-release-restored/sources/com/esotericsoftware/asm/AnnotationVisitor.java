package com.esotericsoftware.asm;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: loaded from: classes.dex */
public abstract class AnnotationVisitor {
    protected final int api;

    /* JADX INFO: renamed from: av */
    protected AnnotationVisitor f96av;

    public AnnotationVisitor(int i, AnnotationVisitor annotationVisitor) {
        if (i != 262144 && i != 327680) {
            C6755.m11865();
            throw null;
        }
        this.api = i;
        this.f96av = annotationVisitor;
    }

    public void visit(String str, Object obj) {
        AnnotationVisitor annotationVisitor = this.f96av;
        if (annotationVisitor != null) {
            annotationVisitor.visit(str, obj);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, String str2) {
        AnnotationVisitor annotationVisitor = this.f96av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitAnnotation(str, str2);
        }
        return null;
    }

    public AnnotationVisitor visitArray(String str) {
        AnnotationVisitor annotationVisitor = this.f96av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitArray(str);
        }
        return null;
    }

    public void visitEnd() {
        AnnotationVisitor annotationVisitor = this.f96av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
    }

    public void visitEnum(String str, String str2, String str3) {
        AnnotationVisitor annotationVisitor = this.f96av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnum(str, str2, str3);
        }
    }

    public AnnotationVisitor(int i) {
        this(i, null);
    }
}
