package io.sentry;

import io.sentry.vendor.gson.stream.EnumC2050b;

/* JADX INFO: renamed from: io.sentry.s0 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1999s0 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f7167a;

    static {
        int[] iArr = new int[EnumC2050b.values().length];
        f7167a = iArr;
        try {
            iArr[EnumC2050b.BEGIN_ARRAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f7167a[EnumC2050b.END_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f7167a[EnumC2050b.BEGIN_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f7167a[EnumC2050b.END_OBJECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f7167a[EnumC2050b.NAME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f7167a[EnumC2050b.STRING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f7167a[EnumC2050b.NUMBER.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f7167a[EnumC2050b.BOOLEAN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f7167a[EnumC2050b.NULL.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            f7167a[EnumC2050b.END_DOCUMENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
