package io.sentry.android.core;

import io.sentry.EnumC1877g1;

/* JADX INFO: renamed from: io.sentry.android.core.f */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1694f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6110a;

    static {
        int[] iArr = new int[EnumC1877g1.values().length];
        f6110a = iArr;
        try {
            iArr[EnumC1877g1.TRACE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6110a[EnumC1877g1.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
