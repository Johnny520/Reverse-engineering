package io.sentry;

/* JADX INFO: renamed from: io.sentry.k */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1914k {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6803a = null;

    static {
        int[] r0 = new int[EnumC2027u1.values().length];
        f6803a = r0;
        r0[EnumC2027u1.CURRENT.ordinal()] = 1;     // Catch: NoSuchFieldError -> L8
    L12:
        f6803a[EnumC2027u1.ISOLATION.ordinal()] = 2;     // Catch: NoSuchFieldError -> L9
    L14:
        f6803a[EnumC2027u1.GLOBAL.ordinal()] = 3;     // Catch: NoSuchFieldError -> L10
    L18:
        f6803a[EnumC2027u1.COMBINED.ordinal()] = 4;     // Catch: NoSuchFieldError -> L11
        return;
    }
}
