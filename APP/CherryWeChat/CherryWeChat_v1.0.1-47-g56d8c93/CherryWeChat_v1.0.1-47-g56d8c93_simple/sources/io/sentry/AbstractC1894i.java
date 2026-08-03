package io.sentry;

/* JADX INFO: renamed from: io.sentry.i */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1894i {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6764a = null;

    static {
        int[] r0 = new int[EnumC2027u1.values().length];
        f6764a = r0;
        r0[EnumC2027u1.CURRENT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
    L10:
        f6764a[EnumC2027u1.ISOLATION.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
    L12:
        f6764a[EnumC2027u1.GLOBAL.ordinal()] = 3;     // Catch: NoSuchFieldError -> L9
        return;
    }
}
