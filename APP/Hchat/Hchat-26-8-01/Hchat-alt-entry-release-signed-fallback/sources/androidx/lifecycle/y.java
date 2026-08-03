package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements androidx.lifecycle.q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final androidx.lifecycle.y f311o = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public android.os.Handler f316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.lifecycle.s f317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a1.a f318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final androidx.lifecycle.x f319n;

    static {
            androidx.lifecycle.y r0 = new androidx.lifecycle.y
            r0.<init>()
            androidx.lifecycle.y.f311o = r0
            return
    }

    public y() {
            r2 = this;
            r2.<init>()
            r0 = 1
            r2.f314i = r0
            r2.f315j = r0
            androidx.lifecycle.s r1 = new androidx.lifecycle.s
            r1.<init>(r2, r0)
            r2.f317l = r1
            a1.a r0 = new a1.a
            r1 = 1
            r0.<init>(r2, r1)
            r2.f318m = r0
            androidx.lifecycle.x r0 = new androidx.lifecycle.x
            r1 = 0
            r0.<init>(r2, r1)
            r2.f319n = r0
            return
    }

    public final void a() {
            r2 = this;
            int r0 = r2.f313h
            r1 = 1
            int r0 = r0 + r1
            r2.f313h = r0
            if (r0 != r1) goto L21
            boolean r0 = r2.f314i
            if (r0 == 0) goto L17
            androidx.lifecycle.s r0 = r2.f317l
            androidx.lifecycle.k r1 = androidx.lifecycle.k.ON_RESUME
            r0.d(r1)
            r0 = 0
            r2.f314i = r0
            return
        L17:
            android.os.Handler r0 = r2.f316k
            r0.getClass()
            a1.a r1 = r2.f318m
            r0.removeCallbacks(r1)
        L21:
            return
    }

    @Override // androidx.lifecycle.q
    public final androidx.lifecycle.s f() {
            r1 = this;
            androidx.lifecycle.s r0 = r1.f317l
            return r0
    }
}
