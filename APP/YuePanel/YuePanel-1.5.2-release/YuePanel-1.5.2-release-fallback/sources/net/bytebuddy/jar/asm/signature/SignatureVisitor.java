package net.bytebuddy.jar.asm.signature;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char INSTANCEOF = '=';
    public static final char SUPER = '-';
    protected final int api;

    public SignatureVisitor(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 589824(0x90000, float:8.2652E-40)
            if (r4 == r0) goto L37
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r4 == r0) goto L37
            r0 = 458752(0x70000, float:6.42848E-40)
            if (r4 == r0) goto L37
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r4 == r0) goto L37
            r0 = 327680(0x50000, float:4.59177E-40)
            if (r4 == r0) goto L37
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r4 == r0) goto L37
            r0 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r4 != r0) goto L20
            goto L37
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported api "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L37:
            r3.api = r4
            return
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitArrayType() {
            r0 = this;
            return r0
    }

    public void visitBaseType(char r1) {
            r0 = this;
            return
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitClassBound() {
            r0 = this;
            return r0
    }

    public void visitClassType(java.lang.String r1) {
            r0 = this;
            return
    }

    public void visitEnd() {
            r0 = this;
            return
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitExceptionType() {
            r0 = this;
            return r0
    }

    public void visitFormalTypeParameter(java.lang.String r1) {
            r0 = this;
            return
    }

    public void visitInnerClassType(java.lang.String r1) {
            r0 = this;
            return
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterface() {
            r0 = this;
            return r0
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterfaceBound() {
            r0 = this;
            return r0
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitParameterType() {
            r0 = this;
            return r0
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitReturnType() {
            r0 = this;
            return r0
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitSuperclass() {
            r0 = this;
            return r0
    }

    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitTypeArgument(char r1) {
            r0 = this;
            return r0
    }

    public void visitTypeArgument() {
            r0 = this;
            return
    }

    public void visitTypeVariable(java.lang.String r1) {
            r0 = this;
            return
    }
}
