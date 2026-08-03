package io.sentry.android.core;

import io.sentry.EnumC1606M;

/* JADX INFO: renamed from: io.sentry.android.core.s */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1745s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6344a = null;

    static {
        int[] r0 = new int[EnumC1606M.values().length];
        f6344a = r0;
        r0[EnumC1606M.CONNECTED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
    L10:
        f6344a[EnumC1606M.UNKNOWN.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
    L12:
        f6344a[EnumC1606M.NO_PERMISSION.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
        return;
    }
}
