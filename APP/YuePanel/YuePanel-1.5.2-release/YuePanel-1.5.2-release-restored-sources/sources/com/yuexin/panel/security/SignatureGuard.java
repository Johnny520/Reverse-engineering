package com.yuexin.panel.security;

import com.nmmedit.protect.NativeUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureGuard {
    static {
        NativeUtil.classesInit0(309);
    }

    private SignatureGuard() {
    }

    public static native void assertValid(String str);

    private static native void failFast();

    private static native boolean nativeCheckSignature(String str);
}
