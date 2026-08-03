package io.sentry.android.core;

import io.sentry.EnumC1657a2;

/* JADX INFO: renamed from: io.sentry.android.core.j */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1728j {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6270a;

    static {
        int[] iArr = new int[EnumC1657a2.values().length];
        f6270a = iArr;
        try {
            iArr[EnumC1657a2.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6270a[EnumC1657a2.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6270a[EnumC1657a2.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6270a[EnumC1657a2.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6270a[EnumC1657a2.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
