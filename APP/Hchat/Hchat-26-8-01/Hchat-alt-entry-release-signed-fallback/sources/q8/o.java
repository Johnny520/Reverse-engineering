package q8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i8.f f10729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile java.lang.ref.WeakReference f10730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f10731c;

    public o(i8.f r3) {
            r2 = this;
            r2.<init>()
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            r2.f10730b = r0
            r2.f10729a = r3
            return
    }

    public final android.app.Activity a() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.f10730b
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
