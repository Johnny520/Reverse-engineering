package com.esotericsoftware.asm;

import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: loaded from: classes.dex */
public abstract class FieldVisitor {
    protected final int api;

    /* JADX INFO: renamed from: fv */
    protected FieldVisitor f177fv;

    public FieldVisitor(int i, FieldVisitor fieldVisitor) {
        if (i != 262144 && i != 327680) {
            C6755.m11865();
            throw null;
        }
        this.api = i;
        this.f177fv = fieldVisitor;
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        FieldVisitor fieldVisitor = this.f177fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitAnnotation(str, z);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        FieldVisitor fieldVisitor = this.f177fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        FieldVisitor fieldVisitor = this.f177fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitEnd();
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.api < 327680) {
            throw new RuntimeException();
        }
        FieldVisitor fieldVisitor = this.f177fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public FieldVisitor(int i) {
        this(i, null);
    }
}
