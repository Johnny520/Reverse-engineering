package net.bytebuddy.jar.asm;

import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AnnotationVisitor {
    protected final int api;
    protected AnnotationVisitor av;

    public AnnotationVisitor(int i, AnnotationVisitor annotationVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            C5919.m11249(stringConcat$0(i));
            throw null;
        }
        if (i == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.av = annotationVisitor;
    }

    private static /* synthetic */ String stringConcat$0(int i) {
        return AbstractC6136.m11556(i, "Unsupported api ");
    }

    public AnnotationVisitor getDelegate() {
        return this.av;
    }

    public void visit(String str, Object obj) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visit(str, obj);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, String str2) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitAnnotation(str, str2);
        }
        return null;
    }

    public AnnotationVisitor visitArray(String str) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            return annotationVisitor.visitArray(str);
        }
        return null;
    }

    public void visitEnd() {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnd();
        }
    }

    public void visitEnum(String str, String str2, String str3) {
        AnnotationVisitor annotationVisitor = this.av;
        if (annotationVisitor != null) {
            annotationVisitor.visitEnum(str, str2, str3);
        }
    }

    public AnnotationVisitor(int i) {
        this(i, null);
    }
}
