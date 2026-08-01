package net.bytebuddy.jar.asm;

import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class MethodVisitor {
    private static final String REQUIRES_ASM5 = "This feature requires ASM5";
    protected final int api;
    protected MethodVisitor mv;

    public MethodVisitor(int i, MethodVisitor methodVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            C5925.m11310(stringConcat$0(i));
            throw null;
        }
        if (i == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.mv = methodVisitor;
    }

    private static /* synthetic */ String stringConcat$0(int i) {
        return AbstractC6183.m11588(i, "Unsupported api ");
    }

    public MethodVisitor getDelegate() {
        return this.mv;
    }

    public void visitAnnotableParameterCount(int i, boolean z) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitAnnotableParameterCount(i, z);
        }
    }

    public AnnotationVisitor visitAnnotation(String str, boolean z) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitAnnotation(str, z);
        }
        return null;
    }

    public AnnotationVisitor visitAnnotationDefault() {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitAnnotationDefault();
        }
        return null;
    }

    public void visitAttribute(Attribute attribute) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitAttribute(attribute);
        }
    }

    public void visitCode() {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitCode();
        }
    }

    public void visitEnd() {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitEnd();
        }
    }

    public void visitFieldInsn(int i, String str, String str2, String str3) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitFieldInsn(i, str, str2, str3);
        }
    }

    public void visitFrame(int i, int i2, Object[] objArr, int i3, Object[] objArr2) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitFrame(i, i2, objArr, i3, objArr2);
        }
    }

    public void visitIincInsn(int i, int i2) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitIincInsn(i, i2);
        }
    }

    public void visitInsn(int i) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitInsn(i);
        }
    }

    public AnnotationVisitor visitInsnAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.api < 327680) {
            C5925.m11308(REQUIRES_ASM5);
            return null;
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitInsnAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitIntInsn(int i, int i2) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitIntInsn(i, i2);
        }
    }

    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        if (this.api < 327680) {
            C5925.m11308(REQUIRES_ASM5);
            return;
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitInvokeDynamicInsn(str, str2, handle, objArr);
        }
    }

    public void visitJumpInsn(int i, Label label) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitJumpInsn(i, label);
        }
    }

    public void visitLabel(Label label) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLabel(label);
        }
    }

    public void visitLdcInsn(Object obj) {
        if (this.api < 327680 && ((obj instanceof Handle) || ((obj instanceof Type) && ((Type) obj).getSort() == 11))) {
            C5925.m11308(REQUIRES_ASM5);
            return;
        }
        if (this.api < 458752 && (obj instanceof ConstantDynamic)) {
            C5925.m11308("This feature requires ASM7");
            return;
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLdcInsn(obj);
        }
    }

    public void visitLineNumber(int i, Label label) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLineNumber(i, label);
        }
    }

    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLocalVariable(str, str2, str3, label, label2, i);
        }
    }

    public AnnotationVisitor visitLocalVariableAnnotation(int i, TypePath typePath, Label[] labelArr, Label[] labelArr2, int[] iArr, String str, boolean z) {
        if (this.api < 327680) {
            C5925.m11308(REQUIRES_ASM5);
            return null;
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitLocalVariableAnnotation(i, typePath, labelArr, labelArr2, iArr, str, z);
        }
        return null;
    }

    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitLookupSwitchInsn(label, iArr, labelArr);
        }
    }

    public void visitMaxs(int i, int i2) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitMaxs(i, i2);
        }
    }

    public void visitMethodInsn(int i, String str, String str2, String str3, boolean z) {
        if (this.api >= 327680 || (i & 256) != 0) {
            MethodVisitor methodVisitor = this.mv;
            if (methodVisitor != null) {
                methodVisitor.visitMethodInsn(i & (-257), str, str2, str3, z);
                return;
            }
            return;
        }
        if (z == (i == 185)) {
            visitMethodInsn(i, str, str2, str3);
        } else {
            C5925.m11308("INVOKESPECIAL/STATIC on interfaces requires ASM5");
        }
    }

    public void visitMultiANewArrayInsn(String str, int i) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitMultiANewArrayInsn(str, i);
        }
    }

    public void visitParameter(String str, int i) {
        if (this.api < 327680) {
            C5925.m11308(REQUIRES_ASM5);
            return;
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitParameter(str, i);
        }
    }

    public AnnotationVisitor visitParameterAnnotation(int i, String str, boolean z) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitParameterAnnotation(i, str, z);
        }
        return null;
    }

    public void visitTableSwitchInsn(int i, int i2, Label label, Label... labelArr) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitTableSwitchInsn(i, i2, label, labelArr);
        }
    }

    public AnnotationVisitor visitTryCatchAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.api < 327680) {
            C5925.m11308(REQUIRES_ASM5);
            return null;
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitTryCatchAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitTryCatchBlock(label, label2, label3, str);
        }
    }

    public AnnotationVisitor visitTypeAnnotation(int i, TypePath typePath, String str, boolean z) {
        if (this.api < 327680) {
            C5925.m11308(REQUIRES_ASM5);
            return null;
        }
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            return methodVisitor.visitTypeAnnotation(i, typePath, str, z);
        }
        return null;
    }

    public void visitTypeInsn(int i, String str) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitTypeInsn(i, str);
        }
    }

    public void visitVarInsn(int i, int i2) {
        MethodVisitor methodVisitor = this.mv;
        if (methodVisitor != null) {
            methodVisitor.visitVarInsn(i, i2);
        }
    }

    @Deprecated(forRemoval = false)
    public void visitMethodInsn(int i, String str, String str2, String str3) {
        visitMethodInsn(i | (this.api < 327680 ? 256 : 0), str, str2, str3, i == 185);
    }

    public MethodVisitor(int i) {
        this(i, null);
    }
}
