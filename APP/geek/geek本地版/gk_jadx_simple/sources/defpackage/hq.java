package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class hq {
    public static final /* synthetic */ int[] a = null;

    static {
        int[] r0 = new int[iq.values().length];
        r0[iq.ON_CREATE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L12
    L21:
        r0[iq.ON_STOP.ordinal()] = 2;     // Catch: NoSuchFieldError -> L13
    L31:
        r0[iq.ON_START.ordinal()] = 3;     // Catch: NoSuchFieldError -> L14
    L23:
        r0[iq.ON_PAUSE.ordinal()] = 4;     // Catch: NoSuchFieldError -> L15
    L25:
        r0[iq.ON_RESUME.ordinal()] = 5;     // Catch: NoSuchFieldError -> L16
    L19:
        r0[iq.ON_DESTROY.ordinal()] = 6;     // Catch: NoSuchFieldError -> L17
    L27:
        r0[iq.ON_ANY.ordinal()] = 7;     // Catch: NoSuchFieldError -> L18
    L10:
        a = r0;
    }
}
