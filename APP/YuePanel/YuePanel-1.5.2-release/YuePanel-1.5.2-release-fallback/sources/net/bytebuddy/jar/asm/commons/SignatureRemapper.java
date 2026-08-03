package net.bytebuddy.jar.asm.commons;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureRemapper extends net.bytebuddy.jar.asm.signature.SignatureVisitor {
    private java.util.ArrayList<java.lang.String> classNames;
    private final net.bytebuddy.jar.asm.commons.Remapper remapper;
    private final net.bytebuddy.jar.asm.signature.SignatureVisitor signatureVisitor;

    public SignatureRemapper(int r1, net.bytebuddy.jar.asm.signature.SignatureVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.classNames = r1
            r0.signatureVisitor = r2
            r0.remapper = r3
            return
    }

    public SignatureRemapper(net.bytebuddy.jar.asm.signature.SignatureVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitArrayType() {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitArrayType()
            return r1
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitBaseType(char r2) {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitBaseType(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitClassBound() {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitClassBound()
            return r1
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitClassType(java.lang.String r3) {
            r2 = this;
            java.util.ArrayList<java.lang.String> r0 = r2.classNames
            r0.add(r3)
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r2.signatureVisitor
            net.bytebuddy.jar.asm.commons.Remapper r1 = r2.remapper
            java.lang.String r3 = r1.mapType(r3)
            r0.visitClassType(r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitEnd() {
            r2 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r2.signatureVisitor
            r0.visitEnd()
            java.util.ArrayList<java.lang.String> r0 = r2.classNames
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitExceptionType() {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitExceptionType()
            return r1
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitFormalTypeParameter(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitInnerClassType(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList<java.lang.String> r0 = r4.classNames
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.remove(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r2 = 36
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.util.ArrayList<java.lang.String> r1 = r4.classNames
            r1.add(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            net.bytebuddy.jar.asm.commons.Remapper r3 = r4.remapper
            java.lang.String r0 = r3.mapType(r0)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            net.bytebuddy.jar.asm.commons.Remapper r1 = r4.remapper
            java.lang.String r5 = r1.mapType(r5)
            boolean r1 = r5.startsWith(r0)
            if (r1 == 0) goto L4d
            int r0 = r0.length()
            goto L53
        L4d:
            int r0 = r5.lastIndexOf(r2)
            int r0 = r0 + 1
        L53:
            net.bytebuddy.jar.asm.signature.SignatureVisitor r1 = r4.signatureVisitor
            java.lang.String r5 = r5.substring(r0)
            r1.visitInnerClassType(r5)
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterface() {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitInterface()
            return r1
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitInterfaceBound() {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitInterfaceBound()
            return r1
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitParameterType() {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitParameterType()
            return r1
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitReturnType() {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitReturnType()
            return r1
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitSuperclass() {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitSuperclass()
            return r1
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public net.bytebuddy.jar.asm.signature.SignatureVisitor visitTypeArgument(char r2) {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitTypeArgument(r2)
            return r1
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitTypeArgument()
            return
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitTypeVariable(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = r1.signatureVisitor
            r0.visitTypeVariable(r2)
            return
    }
}
