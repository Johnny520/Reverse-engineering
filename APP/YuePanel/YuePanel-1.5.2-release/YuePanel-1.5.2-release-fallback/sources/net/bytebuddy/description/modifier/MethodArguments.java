package net.bytebuddy.description.modifier;

/* JADX INFO: loaded from: classes2.dex */
public enum MethodArguments extends java.lang.Enum<net.bytebuddy.description.modifier.MethodArguments> implements net.bytebuddy.description.modifier.ModifierContributor.ForMethod {
    private static final /* synthetic */ net.bytebuddy.description.modifier.MethodArguments[] $VALUES = null;
    public static final net.bytebuddy.description.modifier.MethodArguments PLAIN = null;
    public static final net.bytebuddy.description.modifier.MethodArguments VARARGS = null;
    private final int mask;

    static {
            net.bytebuddy.description.modifier.MethodArguments r0 = new net.bytebuddy.description.modifier.MethodArguments
            java.lang.String r1 = "PLAIN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            net.bytebuddy.description.modifier.MethodArguments.PLAIN = r0
            net.bytebuddy.description.modifier.MethodArguments r1 = new net.bytebuddy.description.modifier.MethodArguments
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            java.lang.String r4 = "VARARGS"
            r1.<init>(r4, r2, r3)
            net.bytebuddy.description.modifier.MethodArguments.VARARGS = r1
            net.bytebuddy.description.modifier.MethodArguments[] r0 = new net.bytebuddy.description.modifier.MethodArguments[]{r0, r1}
            net.bytebuddy.description.modifier.MethodArguments.$VALUES = r0
            return
    }

    MethodArguments(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mask = r3
            return
    }

    public static net.bytebuddy.description.modifier.MethodArguments valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.description.modifier.MethodArguments> r0 = net.bytebuddy.description.modifier.MethodArguments.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.description.modifier.MethodArguments r1 = (net.bytebuddy.description.modifier.MethodArguments) r1
            return r1
    }

    public static net.bytebuddy.description.modifier.MethodArguments[] values() {
            net.bytebuddy.description.modifier.MethodArguments[] r0 = net.bytebuddy.description.modifier.MethodArguments.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.description.modifier.MethodArguments[] r0 = (net.bytebuddy.description.modifier.MethodArguments[]) r0
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getMask() {
            r1 = this;
            int r0 = r1.mask
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public int getRange() {
            r1 = this;
            r0 = 128(0x80, float:1.8E-43)
            return r0
    }

    @Override // net.bytebuddy.description.modifier.ModifierContributor
    public boolean isDefault() {
            r1 = this;
            net.bytebuddy.description.modifier.MethodArguments r0 = net.bytebuddy.description.modifier.MethodArguments.PLAIN
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean isVarArgs() {
            r1 = this;
            net.bytebuddy.description.modifier.MethodArguments r0 = net.bytebuddy.description.modifier.MethodArguments.VARARGS
            if (r1 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }
}
