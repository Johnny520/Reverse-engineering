package net.bytebuddy.jar.asm;

import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class FieldVisitor {
    protected final int api;

    /* JADX INFO: renamed from: fv */
    protected FieldVisitor f321fv;

    public FieldVisitor(int i, FieldVisitor fieldVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            C6755.m11869(stringConcat$0(i));
            throw null;
        }
        if (i == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.f321fv = fieldVisitor;
    }

    private static /* synthetic */ String stringConcat$0(int i) {
        return AbstractC7012.m12147(i, "Unsupported api ");
    }

    public FieldVisitor getDelegate() {
        return this.f321fv;
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        FieldVisitor fieldVisitor = this.f321fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitAnnotation(str, z);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        FieldVisitor fieldVisitor = this.f321fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        FieldVisitor fieldVisitor = this.f321fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitEnd();
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.api < 327680) {
            C6755.m11867("This feature requires ASM5");
            return null;
        }
        FieldVisitor fieldVisitor = this.f321fv;
        if (fieldVisitor != null) {
            return fieldVisitor.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public FieldVisitor(int i) {
        this(i, null);
    }
}
