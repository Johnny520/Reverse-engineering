package net.bytebuddy.jar.asm.commons;

/* JADX INFO: loaded from: classes2.dex */
public class RecordComponentRemapper extends net.bytebuddy.jar.asm.RecordComponentVisitor {
    protected final net.bytebuddy.jar.asm.commons.Remapper remapper;

    public RecordComponentRemapper(int r1, net.bytebuddy.jar.asm.RecordComponentVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.remapper = r3
            return
    }

    public RecordComponentRemapper(net.bytebuddy.jar.asm.RecordComponentVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0, r2, r3)
            return
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

    @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitAnnotation(java.lang.String r2, boolean r3) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r2)
            net.bytebuddy.jar.asm.AnnotationVisitor r3 = super.visitAnnotation(r0, r3)
            if (r3 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r1.createAnnotationRemapper(r2, r3)
        L12:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.RecordComponentVisitor
    public net.bytebuddy.jar.asm.AnnotationVisitor visitTypeAnnotation(int r2, net.bytebuddy.jar.asm.TypePath r3, java.lang.String r4, boolean r5) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r0 = r0.mapDesc(r4)
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = super.visitTypeAnnotation(r2, r3, r0, r5)
            if (r2 != 0) goto Le
            r2 = 0
            goto L12
        Le:
            net.bytebuddy.jar.asm.AnnotationVisitor r2 = r1.createAnnotationRemapper(r4, r2)
        L12:
            return r2
    }
}
