package io.sentry.android.core;

import io.sentry.EnumC1606M;

/* JADX INFO: renamed from: io.sentry.android.core.L */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1669L {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f5979a;

    static {
        int[] iArr = new int[EnumC1606M.values().length];
        f5979a = iArr;
        try {
            iArr[EnumC1606M.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5979a[EnumC1606M.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
