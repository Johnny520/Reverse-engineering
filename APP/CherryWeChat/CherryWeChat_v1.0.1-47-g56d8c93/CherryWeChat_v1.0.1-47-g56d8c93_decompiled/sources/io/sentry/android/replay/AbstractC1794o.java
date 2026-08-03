package io.sentry.android.replay;

/* JADX INFO: renamed from: io.sentry.android.replay.o */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1794o {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6516a;

    static {
        int[] iArr = new int[EnumC1796q.values().length];
        try {
            iArr[EnumC1796q.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1796q.STARTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC1796q.RESUMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC1796q.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC1796q.STOPPED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC1796q.CLOSED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f6516a = iArr;
    }
}
