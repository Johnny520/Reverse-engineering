package net.bytebuddy.jar.asm;

import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class MethodTooLargeException extends IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;
    private final String className;
    private final int codeSize;
    private final String descriptor;
    private final String methodName;

    public MethodTooLargeException(String str, String str2, String str3, int i) {
        super(stringConcat$0(str, str2, str3));
        this.className = str;
        this.methodName = str2;
        this.descriptor = str3;
        this.codeSize = i;
    }

    private static /* synthetic */ String stringConcat$0(String str, String str2, String str3) {
        StringBuilder sbM11551 = AbstractC6136.m11551("Method too large: ", str, ".", str2, " ");
        sbM11551.append(str3);
        return sbM11551.toString();
    }

    public String getClassName() {
        return this.className;
    }

    public int getCodeSize() {
        return this.codeSize;
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getMethodName() {
        return this.methodName;
    }
}
