package bsh.org.objectweb.asm;

import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldVisitor {
    protected final int api;

    /* JADX INFO: renamed from: fv */
    protected FieldVisitor f1003fv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldVisitor(int i9, FieldVisitor fieldVisitor) {
        if (i9 != 393216 && i9 != 327680 && i9 != 262144) {
            C2104o.m5289o();
            throw null;
        }
        this.api = i9;
        this.f1003fv = fieldVisitor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitAttribute(Attribute attribute) {
        FieldVisitor fieldVisitor = this.f1003fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitAttribute(attribute);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitEnd() {
        FieldVisitor fieldVisitor = this.f1003fv;
        if (fieldVisitor != null) {
            fieldVisitor.visitEnd();
        }
    }

    public FieldVisitor(int i9) {
        this(i9, null);
    }
}
