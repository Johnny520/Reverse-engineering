package net.bytebuddy.jar.asm.commons;

/* JADX INFO: loaded from: classes2.dex */
public class AnnotationRemapper extends net.bytebuddy.jar.asm.AnnotationVisitor {
    protected final java.lang.String descriptor;
    protected final net.bytebuddy.jar.asm.commons.Remapper remapper;

    public AnnotationRemapper(int r1, java.lang.String r2, net.bytebuddy.jar.asm.AnnotationVisitor r3, net.bytebuddy.jar.asm.commons.Remapper r4) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.descriptor = r2
            r0.remapper = r4
            return
    }

    @java.lang.Deprecated
    public AnnotationRemapper(int r2, net.bytebuddy.jar.asm.AnnotationVisitor r3, net.bytebuddy.jar.asm.commons.Remapper r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public AnnotationRemapper(java.lang.String r2, net.bytebuddy.jar.asm.AnnotationVisitor r3, net.bytebuddy.jar.asm.commons.Remapper r4) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0, r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public AnnotationRemapper(net.bytebuddy.jar.asm.AnnotationVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2, r3)
            return
    }

    private java.lang.String mapAnnotationAttributeName(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = r2.descriptor
            if (r0 != 0) goto L5
            return r3
        L5:
            net.bytebuddy.jar.asm.commons.Remapper r1 = r2.remapper
            java.lang.String r3 = r1.mapAnnotationAttributeName(r0, r3)
            return r3
    }

    public net.bytebuddy.jar.asm.AnnotationVisitor createAnnotationRemapper(java.lang.String r4, net.bytebuddy.jar.asm.AnnotationVisitor r5) {
            r3 = this;
            net.bytebuddy.jar.asm.commons.AnnotationRemapper r0 = new net.bytebuddy.jar.asm.commons.AnnotationRemapper
            int r1 = r3.api
            net.bytebuddy.jar.asm.commons.Remapper r2 = r3.remapper
            r0.<init>(r1, r4, r5, r2)
            net.bytebuddy.jar.asm.AnnotationVisitor r4 = r3.createAnnotationRemapper(r5)
            net.bytebuddy.jar.asm.AnnotationVisitor r4 = r0.orDeprecatedValue(r4)
            return r4
    }

    @java.lang.Deprecated
    public net.bytebuddy.jar.asm.AnnotationVisitor createAnnotationRemapper(net.bytebuddy.jar.asm.AnnotationVisitor r5) {
            r4 = this;
            net.bytebuddy.jar.asm.commons.AnnotationRemapper r0 = new net.bytebuddy.jar.asm.commons.AnnotationRemapper
            int r1 = r4.api
            r2 = 0
            net.bytebuddy.jar.asm.commons.Remapper r3 = r4.remapper
            r0.<init>(r1, r2, r5, r3)
            return r0
    }

    public final net.bytebuddy.jar.asm.AnnotationVisitor orDeprecatedValue(net.bytebuddy.jar.asm.AnnotationVisitor r4) {
            r3 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 != r1) goto L20
            r0 = r4
            net.bytebuddy.jar.asm.commons.AnnotationRemapper r0 = (net.bytebuddy.jar.asm.commons.AnnotationRemapper) r0
            int r1 = r0.api
            int r2 = r3.api
            if (r1 != r2) goto L20
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = r0.av
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r3.av
            if (r1 != r2) goto L20
            net.bytebuddy.jar.asm.commons.Remapper r0 = r0.remapper
            net.bytebuddy.jar.asm.commons.Remapper r1 = r3.remapper
            if (r0 != r1) goto L20
            return r3
        L20:
            return r4
    }

    @Override // net.bytebuddy.jar.asm.AnnotationVisitor
    public void visit(java.lang.String r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r2 = r1.mapAnnotationAttributeName(r2)
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.Object r3 = r0.mapValue(r3)
            super.visit(r2, r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.AnnotationVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String r2 = r1.mapAnnotationAttributeName(r2)
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r3)
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitAnnotation(r2, r0)
            if (r2 != 0) goto L12
            r2 = 0
            return r2
        L12:
            net.bytebuddy.jar.asm.AnnotationVisitor r0 = r1.av
            if (r2 != r0) goto L18
            r2 = r1
            goto L1c
        L18:
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r1.createAnnotationRemapper(r3, r2)
        L1c:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.AnnotationVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitArray(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r2.mapAnnotationAttributeName(r3)
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitArray(r3)
            r0 = 0
            if (r3 != 0) goto Lc
            return r0
        Lc:
            net.bytebuddy.jar.asm.AnnotationVisitor r1 = r2.av
            if (r3 != r1) goto L12
            r3 = r2
            goto L16
        L12:
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = r2.createAnnotationRemapper(r0, r3)
        L16:
            return r3
    }

    @Override // net.bytebuddy.jar.asm.AnnotationVisitor
    public void visitEnum(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r2 = r1.mapAnnotationAttributeName(r2)
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r3 = r0.mapDesc(r3)
            super.visitEnum(r2, r3, r4)
            return
    }
}
