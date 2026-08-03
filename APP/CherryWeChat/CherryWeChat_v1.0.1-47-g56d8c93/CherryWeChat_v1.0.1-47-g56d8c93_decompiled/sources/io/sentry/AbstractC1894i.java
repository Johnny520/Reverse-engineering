package io.sentry;

/* JADX INFO: renamed from: io.sentry.i */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1894i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6764a;

    static {
        int[] iArr = new int[EnumC2027u1.values().length];
        f6764a = iArr;
        try {
            iArr[EnumC2027u1.CURRENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6764a[EnumC2027u1.ISOLATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6764a[EnumC2027u1.GLOBAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
