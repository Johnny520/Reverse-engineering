package com.yuexin.panel.security;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureGuard {
    static {
            r0 = 309(0x135, float:4.33E-43)
            com.nmmedit.protect.NativeUtil.classesInit0(r0)
            return
    }

    private SignatureGuard() {
            r0 = this;
            r0.<init>()
            return
    }

    public static native void assertValid(java.lang.String r0);

    private static native void failFast();

    private static native boolean nativeCheckSignature(java.lang.String r0);
}
