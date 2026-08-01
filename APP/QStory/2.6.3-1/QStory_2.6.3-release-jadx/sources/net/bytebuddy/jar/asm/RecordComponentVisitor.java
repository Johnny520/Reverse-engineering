package net.bytebuddy.jar.asm;

import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class RecordComponentVisitor {
    protected final int api;
    protected RecordComponentVisitor delegate;

    public RecordComponentVisitor(int i, RecordComponentVisitor recordComponentVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            C6755.m11869(stringConcat$0(i));
            throw null;
        }
        if (i == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.delegate = recordComponentVisitor;
    }

    private static /* synthetic */ String stringConcat$0(int i) {
        return AbstractC7012.m12147(i, "Unsupported api ");
    }

    public RecordComponentVisitor getDelegate() {
        return this.delegate;
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        RecordComponentVisitor recordComponentVisitor = this.delegate;
        if (recordComponentVisitor != null) {
            return recordComponentVisitor.visitAnnotation(str, z);
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        RecordComponentVisitor recordComponentVisitor = this.delegate;
        if (recordComponentVisitor != null) {
            recordComponentVisitor.visitAttribute(attribute);
        }
    }

    public void visitEnd() {
        RecordComponentVisitor recordComponentVisitor = this.delegate;
        if (recordComponentVisitor != null) {
            recordComponentVisitor.visitEnd();
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        RecordComponentVisitor recordComponentVisitor = this.delegate;
        if (recordComponentVisitor != null) {
            return recordComponentVisitor.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public RecordComponentVisitor(int i) {
        this(i, null);
    }
}
