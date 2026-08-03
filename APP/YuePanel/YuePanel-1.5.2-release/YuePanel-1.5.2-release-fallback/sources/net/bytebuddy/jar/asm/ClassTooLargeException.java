package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public final class ClassTooLargeException extends java.lang.IndexOutOfBoundsException {
    private static final long serialVersionUID = 160715609518896765L;
    private final java.lang.String className;
    private final int constantPoolCount;

    public ClassTooLargeException(java.lang.String r3, int r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class too large: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.className = r3
            r2.constantPoolCount = r4
            return
    }

    public java.lang.String getClassName() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }

    public int getConstantPoolCount() {
            r1 = this;
            int r0 = r1.constantPoolCount
            return r0
    }
}
