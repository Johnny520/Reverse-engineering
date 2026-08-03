package io.sentry.android.core;

import io.sentry.EnumC1606M;

/* JADX INFO: renamed from: io.sentry.android.core.s */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1745s {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6344a;

    static {
        int[] iArr = new int[EnumC1606M.values().length];
        f6344a = iArr;
        try {
            iArr[EnumC1606M.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6344a[EnumC1606M.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6344a[EnumC1606M.NO_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
