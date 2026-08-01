package net.bytebuddy.jar.asm.signature;

import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class SignatureVisitor {
    public static final char EXTENDS = '+';
    public static final char INSTANCEOF = '=';
    public static final char SUPER = '-';
    protected final int api;

    public SignatureVisitor(int i) {
        if (i == 589824 || i == 524288 || i == 458752 || i == 393216 || i == 327680 || i == 262144 || i == 17432576) {
            this.api = i;
        } else {
            C6755.m11869(stringConcat$0(i));
            throw null;
        }
    }

    private static /* synthetic */ String stringConcat$0(int i) {
        return AbstractC7012.m12147(i, "Unsupported api ");
    }

    public void visitTypeArgument() {
    }

    public SignatureVisitor visitArrayType() {
        return this;
    }

    public SignatureVisitor visitClassBound() {
        return this;
    }

    public void visitEnd() {
    }

    public SignatureVisitor visitExceptionType() {
        return this;
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

    public void visitBaseType(char c) {
    }

    public void visitClassType(String str) {
    }

    public void visitFormalTypeParameter(String str) {
    }

    public void visitInnerClassType(String str) {
    }

    public SignatureVisitor visitTypeArgument(char c) {
        return this;
    }

    public void visitTypeVariable(String str) {
    }
}
