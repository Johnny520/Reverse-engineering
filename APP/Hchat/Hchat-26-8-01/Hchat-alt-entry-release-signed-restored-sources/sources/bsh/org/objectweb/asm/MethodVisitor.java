package bsh.org.objectweb.asm;

import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class MethodVisitor {
    private static final String REQUIRES_ASM5 = "This feature requires ASM5";
    protected final int api;

    /* JADX INFO: renamed from: mv */
    protected MethodVisitor f1004mv;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MethodVisitor(int i9, MethodVisitor methodVisitor) {
        if (i9 != 393216 && i9 != 327680 && i9 != 262144) {
            C2104o.m5289o();
            throw null;
        }
        this.api = i9;
        this.f1004mv = methodVisitor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitAnnotableParameterCount(int i9, boolean z9) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitAnnotableParameterCount(i9, z9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitAttribute(Attribute attribute) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitAttribute(attribute);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitCode() {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitEnd() {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitEnd();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitFieldInsn(int i9, String str, String str2, String str3) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitFieldInsn(i9, str, str2, str3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitFrame(int i9, int i10, Object[] objArr, int i11, Object[] objArr2) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitFrame(i9, i10, objArr, i11, objArr2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitIincInsn(int i9, int i10) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitIincInsn(i9, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitInsn(int i9) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitInsn(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitIntInsn(int i9, int i10) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitIntInsn(i9, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitInvokeDynamicInsn(String str, String str2, Handle handle, Object... objArr) {
        if (this.api < 327680) {
            C2104o.m5297w(REQUIRES_ASM5);
            return;
        }
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitInvokeDynamicInsn(str, str2, handle, objArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitJumpInsn(int i9, Label label) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitJumpInsn(i9, label);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitLabel(Label label) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitLabel(label);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitLdcInsn(Object obj) {
        if (this.api < 327680 && ((obj instanceof Handle) || ((obj instanceof Type) && ((Type) obj).getSort() == 11))) {
            C2104o.m5297w(REQUIRES_ASM5);
            return;
        }
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitLdcInsn(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitLineNumber(int i9, Label label) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitLineNumber(i9, label);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitLocalVariable(String str, String str2, String str3, Label label, Label label2, int i9) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitLocalVariable(str, str2, str3, label, label2, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitLookupSwitchInsn(Label label, int[] iArr, Label[] labelArr) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitLookupSwitchInsn(label, iArr, labelArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitMaxs(int i9, int i10) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitMaxs(i9, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitMethodInsn(int i9, String str, String str2, String str3, boolean z9) {
        if (this.api < 327680) {
            if (z9 == (i9 == 185)) {
                visitMethodInsn(i9, str, str2, str3);
                return;
            } else {
                C2104o.m5294t("INVOKESPECIAL/STATIC on interfaces requires ASM5");
                return;
            }
        }
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitMethodInsn(i9, str, str2, str3, z9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitMultiANewArrayInsn(String str, int i9) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitMultiANewArrayInsn(str, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitParameter(String str, int i9) {
        if (this.api < 327680) {
            C2104o.m5297w(REQUIRES_ASM5);
            return;
        }
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitParameter(str, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitTableSwitchInsn(int i9, int i10, Label label, Label... labelArr) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitTableSwitchInsn(i9, i10, label, labelArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitTryCatchBlock(Label label, Label label2, Label label3, String str) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitTryCatchBlock(label, label2, label3, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitTypeInsn(int i9, String str) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitTypeInsn(i9, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void visitVarInsn(int i9, int i10) {
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitVarInsn(i9, i10);
        }
    }

    public MethodVisitor(int i9) {
        this(i9, null);
    }

    @Deprecated
    public void visitMethodInsn(int i9, String str, String str2, String str3) {
        if (this.api >= 327680) {
            visitMethodInsn(i9, str, str2, str3, i9 == 185);
            return;
        }
        MethodVisitor methodVisitor = this.f1004mv;
        if (methodVisitor != null) {
            methodVisitor.visitMethodInsn(i9, str, str2, str3);
        }
    }
}
