package net.bytebuddy.jar.asm;

import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
        StringBuilder sbM12141 = AbstractC7012.m12141("Method too large: ", str, ".", str2, " ");
        sbM12141.append(str3);
        return sbM12141.toString();
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
