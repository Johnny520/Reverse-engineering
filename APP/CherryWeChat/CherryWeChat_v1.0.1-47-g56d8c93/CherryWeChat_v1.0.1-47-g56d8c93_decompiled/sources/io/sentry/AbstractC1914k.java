package io.sentry;

/* JADX INFO: renamed from: io.sentry.k */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1914k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6803a;

    static {
        int[] iArr = new int[EnumC2027u1.values().length];
        f6803a = iArr;
        try {
            iArr[EnumC2027u1.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6803a[EnumC2027u1.ISOLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6803a[EnumC2027u1.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f6803a[EnumC2027u1.COMBINED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
