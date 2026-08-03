package io.sentry.android.core;

import io.sentry.EnumC1657a2;

/* JADX INFO: renamed from: io.sentry.android.core.j */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1728j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6270a = null;

    static {
        int[] r0 = new int[EnumC1657a2.values().length];
        f6270a = r0;
        r0[EnumC1657a2.INFO.ordinal()] = 1;     // Catch: NoSuchFieldError -> L9
    L14:
        f6270a[EnumC1657a2.WARNING.ordinal()] = 2;     // Catch: NoSuchFieldError -> L10
    L18:
        f6270a[EnumC1657a2.ERROR.ordinal()] = 3;     // Catch: NoSuchFieldError -> L11
    L22:
        f6270a[EnumC1657a2.FATAL.ordinal()] = 4;     // Catch: NoSuchFieldError -> L12
    L16:
        f6270a[EnumC1657a2.DEBUG.ordinal()] = 5;     // Catch: NoSuchFieldError -> L13
        return;
    }
}
