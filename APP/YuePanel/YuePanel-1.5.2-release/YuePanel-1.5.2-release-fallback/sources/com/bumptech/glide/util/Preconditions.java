package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void checkArgument(boolean r1) {
            java.lang.String r0 = ""
            checkArgument(r1, r0)
            return
    }

    public static void checkArgument(boolean r0, @Yue.InterfaceC4410 java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    @Yue.InterfaceC4410
    public static java.lang.String checkNotEmpty(@Yue.InterfaceC4544 java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must not be null or empty"
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4410
    public static <T extends java.util.Collection<Y>, Y> T checkNotEmpty(@Yue.InterfaceC4410 T r1) {
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Must not be empty."
            r1.<init>(r0)
            throw r1
    }

    @Yue.InterfaceC4410
    public static <T> T checkNotNull(@Yue.InterfaceC4544 T r1) {
            java.lang.String r0 = "Argument must not be null"
            java.lang.Object r1 = checkNotNull(r1, r0)
            return r1
    }

    @Yue.InterfaceC4410
    public static <T> T checkNotNull(@Yue.InterfaceC4544 T r0, @Yue.InterfaceC4410 java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }
}
