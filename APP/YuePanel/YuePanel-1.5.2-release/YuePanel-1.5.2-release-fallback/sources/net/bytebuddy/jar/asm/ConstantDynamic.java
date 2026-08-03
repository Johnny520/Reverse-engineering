package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstantDynamic {
    private final net.bytebuddy.jar.asm.Handle bootstrapMethod;
    private final java.lang.Object[] bootstrapMethodArguments;
    private final java.lang.String descriptor;
    private final java.lang.String name;

    public ConstantDynamic(java.lang.String r1, java.lang.String r2, net.bytebuddy.jar.asm.Handle r3, java.lang.Object... r4) {
            r0 = this;
            r0.<init>()
            r0.name = r1
            r0.descriptor = r2
            r0.bootstrapMethod = r3
            r0.bootstrapMethodArguments = r4
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof net.bytebuddy.jar.asm.ConstantDynamic
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            net.bytebuddy.jar.asm.ConstantDynamic r5 = (net.bytebuddy.jar.asm.ConstantDynamic) r5
            java.lang.String r1 = r4.name
            java.lang.String r3 = r5.name
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            java.lang.String r1 = r4.descriptor
            java.lang.String r3 = r5.descriptor
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            net.bytebuddy.jar.asm.Handle r1 = r4.bootstrapMethod
            net.bytebuddy.jar.asm.Handle r3 = r5.bootstrapMethod
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L35
            java.lang.Object[] r1 = r4.bootstrapMethodArguments
            java.lang.Object[] r5 = r5.bootstrapMethodArguments
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 == 0) goto L35
            goto L36
        L35:
            r0 = r2
        L36:
            return r0
    }

    public net.bytebuddy.jar.asm.Handle getBootstrapMethod() {
            r1 = this;
            net.bytebuddy.jar.asm.Handle r0 = r1.bootstrapMethod
            return r0
    }

    public java.lang.Object getBootstrapMethodArgument(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.bootstrapMethodArguments
            r2 = r0[r2]
            return r2
    }

    public int getBootstrapMethodArgumentCount() {
            r1 = this;
            java.lang.Object[] r0 = r1.bootstrapMethodArguments
            int r0 = r0.length
            return r0
    }

    public java.lang.Object[] getBootstrapMethodArgumentsUnsafe() {
            r1 = this;
            java.lang.Object[] r0 = r1.bootstrapMethodArguments
            return r0
    }

    public java.lang.String getDescriptor() {
            r1 = this;
            java.lang.String r0 = r1.descriptor
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public int getSize() {
            r2 = this;
            java.lang.String r0 = r2.descriptor
            r1 = 0
            char r0 = r0.charAt(r1)
            r1 = 74
            if (r0 == r1) goto L12
            r1 = 68
            if (r0 != r1) goto L10
            goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 2
        L13:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.name
            int r0 = r0.hashCode()
            java.lang.String r1 = r3.descriptor
            int r1 = r1.hashCode()
            r2 = 8
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            net.bytebuddy.jar.asm.Handle r1 = r3.bootstrapMethod
            int r1 = r1.hashCode()
            r2 = 16
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            java.lang.Object[] r1 = r3.bootstrapMethodArguments
            int r1 = java.util.Arrays.hashCode(r1)
            r2 = 24
            int r1 = java.lang.Integer.rotateLeft(r1, r2)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.name
            r0.append(r1)
            java.lang.String r1 = " : "
            r0.append(r1)
            java.lang.String r1 = r3.descriptor
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            net.bytebuddy.jar.asm.Handle r2 = r3.bootstrapMethod
            r0.append(r2)
            r0.append(r1)
            java.lang.Object[] r1 = r3.bootstrapMethodArguments
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
