package net.bytebuddy.jar.asm.commons;

import net.bytebuddy.jar.asm.AnnotationVisitor;
import net.bytebuddy.jar.asm.FieldVisitor;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.jar.asm.TypePath;

/* JADX INFO: loaded from: classes2.dex */
public class FieldRemapper extends FieldVisitor {
    protected final Remapper remapper;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldRemapper(FieldVisitor fieldVisitor, Remapper remapper) {
        this(Opcodes.ASM9, fieldVisitor, remapper);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public AnnotationVisitor createAnnotationRemapper(AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }

    @Override // net.bytebuddy.jar.asm.FieldVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitAnnotation);
    }

    @Override // net.bytebuddy.jar.asm.FieldVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        if (annotationVisitorVisitTypeAnnotation == null) {
            return null;
        }
        return createAnnotationRemapper(str, annotationVisitorVisitTypeAnnotation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public FieldRemapper(int i, FieldVisitor fieldVisitor, Remapper remapper) {
        super(i, fieldVisitor);
        this.remapper = remapper;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AnnotationVisitor createAnnotationRemapper(String str, AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }
}
