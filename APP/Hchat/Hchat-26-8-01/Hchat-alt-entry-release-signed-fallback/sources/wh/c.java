package wh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f20799a = null;

    static {
            androidx.lifecycle.k[] r0 = androidx.lifecycle.k.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_START     // Catch: java.lang.NoSuchFieldError -> L10
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
            r2 = 1
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
        L10:
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_STOP     // Catch: java.lang.NoSuchFieldError -> L19
            int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
            r2 = 2
            r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
        L19:
            wh.c.f20799a = r0
            return
    }
}
