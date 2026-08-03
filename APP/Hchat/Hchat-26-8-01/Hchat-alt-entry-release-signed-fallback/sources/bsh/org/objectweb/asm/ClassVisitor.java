package bsh.org.objectweb.asm;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ClassVisitor {
    protected final int api;
    protected bsh.org.objectweb.asm.ClassVisitor cv;

    public ClassVisitor(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ClassVisitor(int r2, bsh.org.objectweb.asm.ClassVisitor r3) {
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
            r1.cv = r3
            return
    }

    public void visit(int r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String[] r13) {
            r7 = this;
            bsh.org.objectweb.asm.ClassVisitor r0 = r7.cv
            if (r0 == 0) goto Ld
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.visit(r1, r2, r3, r4, r5, r6)
        Ld:
            return
    }

    public void visitAttribute(bsh.org.objectweb.asm.Attribute r2) {
            r1 = this;
            bsh.org.objectweb.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitAttribute(r2)
        L7:
            return
    }

    public void visitEnd() {
            r1 = this;
            bsh.org.objectweb.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitEnd()
        L7:
            return
    }

    public bsh.org.objectweb.asm.FieldVisitor visitField(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.Object r11) {
            r6 = this;
            bsh.org.objectweb.asm.ClassVisitor r0 = r6.cv
            if (r0 == 0) goto Le
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            bsh.org.objectweb.asm.FieldVisitor r7 = r0.visitField(r1, r2, r3, r4, r5)
            return r7
        Le:
            r7 = 0
            return r7
    }

    public void visitInnerClass(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            bsh.org.objectweb.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitInnerClass(r2, r3, r4, r5)
        L7:
            return
    }

    public bsh.org.objectweb.asm.MethodVisitor visitMethod(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String[] r11) {
            r6 = this;
            bsh.org.objectweb.asm.ClassVisitor r0 = r6.cv
            if (r0 == 0) goto Le
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            bsh.org.objectweb.asm.MethodVisitor r7 = r0.visitMethod(r1, r2, r3, r4, r5)
            return r7
        Le:
            r7 = 0
            return r7
    }

    public void visitOuterClass(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            bsh.org.objectweb.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitOuterClass(r2, r3, r4)
        L7:
            return
    }

    public void visitSource(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            bsh.org.objectweb.asm.ClassVisitor r0 = r1.cv
            if (r0 == 0) goto L7
            r0.visitSource(r2, r3)
        L7:
            return
    }
}
