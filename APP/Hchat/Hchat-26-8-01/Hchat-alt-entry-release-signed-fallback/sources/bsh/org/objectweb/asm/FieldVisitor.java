package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FieldVisitor {
    protected final int api;
    protected bsh.org.objectweb.asm.FieldVisitor fv;

    public FieldVisitor(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FieldVisitor(int r2, bsh.org.objectweb.asm.FieldVisitor r3) {
            r1 = this;
            r1.<init>()
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r2 == r0) goto L15
            r0 = 327680(0x50000, float:4.59177E-40)
            if (r2 == r0) goto L15
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r2 != r0) goto L10
            goto L15
        L10:
            j8.o.o()
            r2 = 0
            throw r2
        L15:
            r1.api = r2
            r1.fv = r3
            return
    }

    public void visitAttribute(bsh.org.objectweb.asm.Attribute r2) {
            r1 = this;
            bsh.org.objectweb.asm.FieldVisitor r0 = r1.fv
            if (r0 == 0) goto L7
            r0.visitAttribute(r2)
        L7:
            return
    }

    public void visitEnd() {
            r1 = this;
            bsh.org.objectweb.asm.FieldVisitor r0 = r1.fv
            if (r0 == 0) goto L7
            r0.visitEnd()
        L7:
            return
    }
}
