package io.sentry.android.replay;

/* JADX INFO: renamed from: io.sentry.android.replay.o */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1794o {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6516a = null;

    static {
        int[] r0 = new int[EnumC1796q.values().length];
        r0[EnumC1796q.INITIAL.ordinal()] = 1;     // Catch: NoSuchFieldError -> L11
    L19:
        r0[EnumC1796q.STARTED.ordinal()] = 2;     // Catch: NoSuchFieldError -> L12
    L27:
        r0[EnumC1796q.RESUMED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L13
    L21:
        r0[EnumC1796q.PAUSED.ordinal()] = 4;     // Catch: NoSuchFieldError -> L14
    L23:
        r0[EnumC1796q.STOPPED.ordinal()] = 5;     // Catch: NoSuchFieldError -> L15
    L17:
        r0[EnumC1796q.CLOSED.ordinal()] = 6;     // Catch: NoSuchFieldError -> L16
    L9:
        f6516a = r0;
    }
}
