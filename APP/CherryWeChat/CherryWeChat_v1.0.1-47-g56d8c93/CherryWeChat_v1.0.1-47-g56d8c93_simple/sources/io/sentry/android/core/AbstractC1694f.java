package io.sentry.android.core;

import io.sentry.EnumC1877g1;

/* JADX INFO: renamed from: io.sentry.android.core.f */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1694f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6110a = null;

    static {
        int[] r0 = new int[EnumC1877g1.values().length];
        f6110a = r0;
        r0[EnumC1877g1.TRACE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L6
    L8:
        f6110a[EnumC1877g1.MANUAL.ordinal()] = 2;     // Catch: NoSuchFieldError -> L7
        return;
    }
}
