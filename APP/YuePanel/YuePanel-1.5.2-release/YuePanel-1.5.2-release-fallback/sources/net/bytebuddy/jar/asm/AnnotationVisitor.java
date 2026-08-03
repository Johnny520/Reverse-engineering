package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AnnotationVisitor {
    protected final int api;
    protected net.bytebuddy.jar.asm.AnnotationVisitor av;

    public AnnotationVisitor(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AnnotationVisitor(int r3, net.bytebuddy.jar.asm.AnnotationVisitor r4) {
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
            r2.av = r4
            return
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor getDelegate() {
            r1 = this;
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r1.av
            return r0
    }

    public void visit(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r1.av
            if (r0 == 0) goto L7
            r0.visit(r2, r3)
        L7:
            return
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r1.av
            if (r0 == 0) goto L9
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor visitArray(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r1.av
            if (r0 == 0) goto L9
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitArray(r2)
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void visitEnd() {
            r1 = this;
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r1.av
            if (r0 == 0) goto L7
            r0.visitEnd()
        L7:
            return
    }

    public void visitEnum(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r1.av
            if (r0 == 0) goto L7
            r0.visitEnum(r2, r3, r4)
        L7:
            return
    }
}
