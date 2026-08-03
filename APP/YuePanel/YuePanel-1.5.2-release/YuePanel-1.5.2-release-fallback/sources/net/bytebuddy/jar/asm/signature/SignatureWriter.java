package net.bytebuddy.jar.asm.signature;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureWriter extends net.bytebuddy.jar.asm.signature.SignatureVisitor {
    private int argumentStack;
    private boolean hasFormals;
    private boolean hasParameters;
    private final java.lang.StringBuilder stringBuilder;

    public SignatureWriter() {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.<init>(r0)
            return
    }

    private SignatureWriter(java.lang.StringBuilder r2) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0)
            r0 = 1
            r1.argumentStack = r0
            r1.stringBuilder = r2
            return
    }

    private void endArguments() {
            r3 = this;
            int r0 = r3.argumentStack
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto Ld
            java.lang.StringBuilder r0 = r3.stringBuilder
            r2 = 62
            r0.append(r2)
        Ld:
            int r0 = r3.argumentStack
            int r0 = r0 >>> r1
            r3.argumentStack = r0
            return
    }

    private void endFormals() {
            r2 = this;
            boolean r0 = r2.hasFormals
            if (r0 == 0) goto Le
            r0 = 0
            r2.hasFormals = r0
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 62
            r0.append(r1)
        Le:
            return
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.StringBuilder r0 = r1.stringBuilder
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitArrayType() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 91
            r0.append(r1)
            return r2
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitBaseType(char r2) {
            r1 = this;
            java.lang.StringBuilder r0 = r1.stringBuilder
            r0.append(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitClassBound() {
            r0 = this;
            return r0
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitClassType(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 76
            r0.append(r1)
            java.lang.StringBuilder r0 = r2.stringBuilder
            r0.append(r3)
            int r3 = r2.argumentStack
            int r3 = r3 << 1
            r2.argumentStack = r3
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitEnd() {
            r2 = this;
            r2.endArguments()
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 59
            r0.append(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitExceptionType() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 94
            r0.append(r1)
            return r2
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.hasFormals
            if (r0 != 0) goto Le
            r0 = 1
            r2.hasFormals = r0
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 60
            r0.append(r1)
        Le:
            java.lang.StringBuilder r0 = r2.stringBuilder
            r0.append(r3)
            java.lang.StringBuilder r3 = r2.stringBuilder
            r0 = 58
            r3.append(r0)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitInnerClassType(java.lang.String r3) {
            r2 = this;
            r2.endArguments()
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 46
            r0.append(r1)
            java.lang.StringBuilder r0 = r2.stringBuilder
            r0.append(r3)
            int r3 = r2.argumentStack
            int r3 = r3 << 1
            r2.argumentStack = r3
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterface() {
            r0 = this;
            return r0
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterfaceBound() {
            r2 = this;
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 58
            r0.append(r1)
            return r2
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitParameterType() {
            r2 = this;
            r2.endFormals()
            boolean r0 = r2.hasParameters
            if (r0 != 0) goto L11
            r0 = 1
            r2.hasParameters = r0
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 40
            r0.append(r1)
        L11:
            return r2
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitReturnType() {
            r2 = this;
            r2.endFormals()
            boolean r0 = r2.hasParameters
            if (r0 != 0) goto Le
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 40
            r0.append(r1)
        Le:
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 41
            r0.append(r1)
            return r2
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitSuperclass() {
            r0 = this;
            r0.endFormals()
            return r0
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitTypeArgument(char r3) {
            r2 = this;
            int r0 = r2.argumentStack
            r1 = r0 & 1
            if (r1 != 0) goto L11
            r0 = r0 | 1
            r2.argumentStack = r0
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 60
            r0.append(r1)
        L11:
            r0 = 61
            if (r3 == r0) goto L1a
            java.lang.StringBuilder r0 = r2.stringBuilder
            r0.append(r3)
        L1a:
            int r3 = r2.argumentStack
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r0
            if (r3 != 0) goto L23
            r3 = r2
            goto L2a
        L23:
            net.bytebuddy.jar.asm.signature.SignatureWriter r3 = new net.bytebuddy.jar.asm.signature.SignatureWriter
            java.lang.StringBuilder r0 = r2.stringBuilder
            r3.<init>(r0)
        L2a:
            return r3
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
            r2 = this;
            int r0 = r2.argumentStack
            r1 = r0 & 1
            if (r1 != 0) goto L11
            r0 = r0 | 1
            r2.argumentStack = r0
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 60
            r0.append(r1)
        L11:
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 42
            r0.append(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitTypeVariable(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = r2.stringBuilder
            r1 = 84
            r0.append(r1)
            java.lang.StringBuilder r0 = r2.stringBuilder
            r0.append(r3)
            java.lang.StringBuilder r3 = r2.stringBuilder
            r0 = 59
            r3.append(r0)
            return
    }
}
