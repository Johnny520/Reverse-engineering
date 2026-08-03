package net.bytebuddy.jar.asm.signature;

import Yue.C8039;
import net.bytebuddy.jar.asm.Opcodes;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureWriter extends SignatureVisitor {
    private int argumentStack;
    private boolean hasFormals;
    private boolean hasParameters;
    private final StringBuilder stringBuilder;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public SignatureWriter() {
        this(new StringBuilder());
    }

    private void endArguments() {
        if ((this.argumentStack & 1) == 1) {
            this.stringBuilder.append(C8039.f23876);
        }
        this.argumentStack >>>= 1;
    }

    private void endFormals() {
        if (this.hasFormals) {
            this.hasFormals = false;
            this.stringBuilder.append(C8039.f23876);
        }
    }

    public String toString() {
        return this.stringBuilder.toString();
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public SignatureVisitor visitArrayType() {
        this.stringBuilder.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
        return this;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitBaseType(char c) {
        this.stringBuilder.append(c);
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public SignatureVisitor visitClassBound() {
        return this;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitClassType(String str) {
        this.stringBuilder.append('L');
        this.stringBuilder.append(str);
        this.argumentStack <<= 1;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitEnd() {
        endArguments();
        this.stringBuilder.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public SignatureVisitor visitExceptionType() {
        this.stringBuilder.append('^');
        return this;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitFormalTypeParameter(String str) {
        if (!this.hasFormals) {
            this.hasFormals = true;
            this.stringBuilder.append(C8039.f23875);
        }
        this.stringBuilder.append(str);
        this.stringBuilder.append(':');
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitInnerClassType(String str) {
        endArguments();
        this.stringBuilder.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        this.stringBuilder.append(str);
        this.argumentStack <<= 1;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterface() {
        return this;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public SignatureVisitor visitInterfaceBound() {
        this.stringBuilder.append(':');
        return this;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public SignatureVisitor visitParameterType() {
        endFormals();
        if (!this.hasParameters) {
            this.hasParameters = true;
            this.stringBuilder.append('(');
        }
        return this;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public SignatureVisitor visitReturnType() {
        endFormals();
        if (!this.hasParameters) {
            this.stringBuilder.append('(');
        }
        this.stringBuilder.append(')');
        return this;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public SignatureVisitor visitSuperclass() {
        endFormals();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitTypeArgument() {
        int i = this.argumentStack;
        if ((i & 1) == 0) {
            this.argumentStack = i | 1;
            this.stringBuilder.append(C8039.f23875);
        }
        this.stringBuilder.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.WILDCARD_TYPE_PATH);
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public void visitTypeVariable(String str) {
        this.stringBuilder.append('T');
        this.stringBuilder.append(str);
        this.stringBuilder.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private SignatureWriter(StringBuilder sb) {
        super(Opcodes.ASM9);
        this.argumentStack = 1;
        this.stringBuilder = sb;
    }

    @Override // net.bytebuddy.jar.asm.signature.SignatureVisitor
    public SignatureVisitor visitTypeArgument(char c) {
        int i = this.argumentStack;
        if ((i & 1) == 0) {
            this.argumentStack = i | 1;
            this.stringBuilder.append(C8039.f23875);
        }
        if (c != '=') {
            this.stringBuilder.append(c);
        }
        return (this.argumentStack & Integer.MIN_VALUE) == 0 ? this : new SignatureWriter(this.stringBuilder);
    }
}
