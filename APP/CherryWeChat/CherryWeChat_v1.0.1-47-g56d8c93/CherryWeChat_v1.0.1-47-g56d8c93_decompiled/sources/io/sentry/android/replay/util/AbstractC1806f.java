package io.sentry.android.replay.util;

/* JADX INFO: renamed from: io.sentry.android.replay.util.f */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1806f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6538a;

    static {
        int[] iArr = new int[EnumC1805e.values().length];
        try {
            iArr[EnumC1805e.SOC_MODEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1805e.SOC_MANUFACTURER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f6538a = iArr;
    }
}
