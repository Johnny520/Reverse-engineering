package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public final class MethodTooLargeException extends java.lang.IndexOutOfBoundsException {
    private static final long serialVersionUID = 6807380416709738314L;
    private final java.lang.String className;
    private final int codeSize;
    private final java.lang.String descriptor;
    private final java.lang.String methodName;

    public MethodTooLargeException(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Method too large: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = " "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.className = r3
            r2.methodName = r4
            r2.descriptor = r5
            r2.codeSize = r6
            return
    }

    public java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public int getCodeSize() {
            r1 = this;
            int r0 = r1.codeSize
            return r0
    }

    public java.lang.String getDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            return r0
    }

    public java.lang.String getMethodName() {
            r1 = this;
            java.lang.String r0 = r1.methodName
            return r0
    }
}
