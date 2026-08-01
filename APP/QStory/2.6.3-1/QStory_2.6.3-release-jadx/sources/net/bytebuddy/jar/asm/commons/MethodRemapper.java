package net.bytebuddy.jar.asm.commons;

import net.bytebuddy.jar.asm.AnnotationVisitor;
import net.bytebuddy.jar.asm.Handle;
import net.bytebuddy.jar.asm.Label;
import net.bytebuddy.jar.asm.MethodVisitor;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.jar.asm.TypePath;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class MethodRemapper extends MethodVisitor {
    protected final Remapper remapper;

    public MethodRemapper(MethodVisitor methodVisitor, Remapper remapper) {
        this(Opcodes.ASM9, methodVisitor, remapper);
    }

    private Object[] remapFrameTypes(int i, Object[] objArr) {
        if (objArr == null) {
            return objArr;
        }
        Object[] objArr2 = null;
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] instanceof String) {
                if (objArr2 == null) {
                    objArr2 = new Object[i];
                    System.arraycopy(objArr, 0, objArr2, 0, i);
                }
                objArr2[i2] = this.remapper.mapType((String) objArr[i2]);
            }
        }
        return objArr2 == null ? objArr : objArr2;
    }

    public AnnotationVisitor createAnnotationRemapper(String str, AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, str, annotationVisitor, this.remapper).orDeprecatedValue(createAnnotationRemapper(annotationVisitor));
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitAnnotation = super.visitAnnotation(this.remapper.mapDesc(str), z);
        return annotationVisitorVisitAnnotation == null ? annotationVisitorVisitAnnotation : createAnnotationRemapper(str, annotationVisitorVisitAnnotation);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public AnnotationVisitor visitAnnotationDefault() {
        AnnotationVisitor annotationVisitorVisitAnnotationDefault = super.visitAnnotationDefault();
        return annotationVisitorVisitAnnotationDefault == null ? annotationVisitorVisitAnnotationDefault : createAnnotationRemapper(null, annotationVisitorVisitAnnotationDefault);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitFieldInsn(int i, String str, String str2, String str3) {
        super.visitFieldInsn(i, this.remapper.mapType(str), this.remapper.mapFieldName(str, str2, str3), this.remapper.mapDesc(str3));
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        super.visitFrame(i, i2, remapFrameTypes(i2, objArr), i3, remapFrameTypes(i3, objArr2));
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitInsnAnnotation = super.visitInsnAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitInsnAnnotation == null ? annotationVisitorVisitInsnAnnotation : createAnnotationRemapper(str, annotationVisitorVisitInsnAnnotation);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        Remapper remapper = this.remapper;
        String strMapInvokeDynamicMethodName = remapper.api == 0 ? remapper.mapInvokeDynamicMethodName(str, str2) : remapper.mapInvokeDynamicMethodName(str, str2, handle, objArr);
        Object[] objArr2 = new Object[objArr.length];
        int i = 0;
        while (true) {
            int length = objArr.length;
            Remapper remapper2 = this.remapper;
            if (i >= length) {
                super.visitInvokeDynamicInsn(strMapInvokeDynamicMethodName, remapper2.mapMethodDesc(str2), (Handle) this.remapper.mapValue(handle), objArr2);
                return;
            } else {
                objArr2[i] = remapper2.mapValue(objArr[i]);
                i++;
            }
        }
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLdcInsn(Object obj) {
        super.visitLdcInsn(this.remapper.mapValue(obj));
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        super.visitLocalVariable(str, this.remapper.mapDesc(str2), this.remapper.mapSignature(str3, true), label, label2, i);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitLocalVariableAnnotation = super.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitLocalVariableAnnotation == null ? annotationVisitorVisitLocalVariableAnnotation : createAnnotationRemapper(str, annotationVisitorVisitLocalVariableAnnotation);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.api >= 327680 || (i & 256) != 0) {
            super.visitMethodInsn(i, this.remapper.mapType(str), this.remapper.mapMethodName(str, str2, str3), this.remapper.mapMethodDesc(str3), z);
        } else {
            super.visitMethodInsn(i, str, str2, str3, z);
        }
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitMultiANewArrayInsn(String str, int i) {
        super.visitMultiANewArrayInsn(this.remapper.mapDesc(str), i);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitParameterAnnotation = super.visitParameterAnnotation(i, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitParameterAnnotation == null ? annotationVisitorVisitParameterAnnotation : createAnnotationRemapper(str, annotationVisitorVisitParameterAnnotation);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitTryCatchAnnotation = super.visitTryCatchAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitTryCatchAnnotation == null ? annotationVisitorVisitTryCatchAnnotation : createAnnotationRemapper(str, annotationVisitorVisitTryCatchAnnotation);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        super.visitTryCatchBlock(label, label2, label3, str == null ? null : this.remapper.mapType(str));
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        AnnotationVisitor annotationVisitorVisitTypeAnnotation = super.visitTypeAnnotation(i, typePath, this.remapper.mapDesc(str), z);
        return annotationVisitorVisitTypeAnnotation == null ? annotationVisitorVisitTypeAnnotation : createAnnotationRemapper(str, annotationVisitorVisitTypeAnnotation);
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    public void visitTypeInsn(int i, String str) {
        super.visitTypeInsn(i, this.remapper.mapType(str));
    }

    public MethodRemapper(int i, MethodVisitor methodVisitor, Remapper remapper) {
        super(i, methodVisitor);
        this.remapper = remapper;
    }

    @Deprecated(forRemoval = false)
    public AnnotationVisitor createAnnotationRemapper(AnnotationVisitor annotationVisitor) {
        return new AnnotationRemapper(this.api, null, annotationVisitor, this.remapper);
    }
}
