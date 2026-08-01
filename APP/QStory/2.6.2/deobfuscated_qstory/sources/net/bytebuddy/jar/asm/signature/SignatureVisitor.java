package net.bytebuddy.jar.asm.signature;

import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
            C5919.m11249(stringConcat$0(i));
            throw null;
        }
    }

    private static /* synthetic */ String stringConcat$0(int i) {
        return AbstractC6136.m11556(i, "Unsupported api ");
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
