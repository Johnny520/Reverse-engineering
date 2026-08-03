package net.bytebuddy.jar.asm.signature;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char INSTANCEOF = '=';
    public static final char SUPER = '-';
    protected final int api;

    public SignatureVisitor(int i) {
        if (i == 589824 || i == 524288 || i == 458752 || i == 393216 || i == 327680 || i == 262144 || i == 17432576) {
            this.api = i;
            return;
        }
        throw new IllegalArgumentException("Unsupported api " + i);
    }

    public SignatureVisitor visitArrayType() {
        return this;
    }

    public void visitBaseType(char c) {
    }

    public SignatureVisitor visitClassBound() {
        return this;
    }

    public void visitClassType(String str) {
    }

    public void visitEnd() {
    }

    public SignatureVisitor visitExceptionType() {
        return this;
    }

    public void visitFormalTypeParameter(String str) {
    }

    public void visitInnerClassType(String str) {
    }

    public SignatureVisitor visitInterface() {
        return this;
    }

    public SignatureVisitor visitInterfaceBound() {
        return this;
    }

    public SignatureVisitor visitParameterType() {
        return this;
    }

    public SignatureVisitor visitReturnType() {
        return this;
    }

    public SignatureVisitor visitSuperclass() {
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SignatureVisitor visitTypeArgument(char c) {
        return this;
    }

    public void visitTypeVariable(String str) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void visitTypeArgument() {
    }
}
