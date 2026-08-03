package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FieldVisitor {
    protected final int api;
    protected net.bytebuddy.jar.asm.FieldVisitor fv;

    public FieldVisitor(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FieldVisitor(int r3, net.bytebuddy.jar.asm.FieldVisitor r4) {
            r2 = this;
            r2.<init>()
            r0 = 589824(0x90000, float:8.2652E-40)
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r3 == r0) goto L37
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r3 == r0) goto L37
            r0 = 458752(0x70000, float:6.42848E-40)
            if (r3 == r0) goto L37
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r0) goto L37
            r0 = 327680(0x50000, float:4.59177E-40)
            if (r3 == r0) goto L37
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r3 == r0) goto L37
            if (r3 != r1) goto L20
            goto L37
        L20:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported api "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L37:
            if (r3 != r1) goto L3c
            net.bytebuddy.jar.asm.Constants.checkAsmExperimental(r2)
        L3c:
            r2.api = r3
            r2.fv = r4
            return
    }

    public net.bytebuddy.jar.asm.FieldVisitor getDelegate() {
            r1 = this;
            net.bytebuddy.jar.asm.FieldVisitor r0 = r1.fv
            return r0
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
            r1 = this;
            net.bytebuddy.jar.asm.FieldVisitor r0 = r1.fv
            if (r0 == 0) goto L9
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void visitAttribute(net.bytebuddy.jar.asm.Attribute r2) {
            r1 = this;
            net.bytebuddy.jar.asm.FieldVisitor r0 = r1.fv
            if (r0 == 0) goto L7
            r0.visitAttribute(r2)
        L7:
            return
    }

    public void visitEnd() {
            r1 = this;
            net.bytebuddy.jar.asm.FieldVisitor r0 = r1.fv
            if (r0 == 0) goto L7
            r0.visitEnd()
        L7:
            return
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r3, net.bytebuddy.jar.asm.TypePath r4, java.lang.String r5, boolean r6) {
            r2 = this;
            int r0 = r2.api
            r1 = 327680(0x50000, float:4.59177E-40)
            if (r0 < r1) goto L11
            net.bytebuddy.jar.asm.FieldVisitor r0 = r2.fv
            if (r0 == 0) goto Lf
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r0.visitTypeAnnotation(r3, r4, r5, r6)
            return r3
        Lf:
            r3 = 0
            return r3
        L11:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "This feature requires ASM5"
            r3.<init>(r4)
            throw r3
    }
}
