package io.sentry.android.core;

import io.sentry.EnumC1606M;

/* JADX INFO: renamed from: io.sentry.android.core.L */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1669L {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f5979a = null;

    static {
        int[] r0 = new int[EnumC1606M.values().length];
        f5979a = r0;
        r0[EnumC1606M.DISCONNECTED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L6
    L8:
        f5979a[EnumC1606M.CONNECTED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L7
        return;
    }
}
