package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class wt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wb.yt f20052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f20053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.Handler f20054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wb.cr f20057f;

    public wt(android.content.Context r1, wb.yt r2) {
            r0 = this;
            r0.<init>()
            r0.f20052a = r2
            android.content.Context r2 = r1.getApplicationContext()
            if (r2 == 0) goto Lc
            r1 = r2
        Lc:
            r0.f20053b = r1
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.f20054c = r1
            wb.cr r1 = new wb.cr
            r2 = 1
            r1.<init>(r0, r2)
            r0.f20057f = r1
            return
    }

    public final void a() {
            r3 = this;
            fb.g1 r0 = fb.g1.f3523a
            wb.yt r0 = r3.f20052a
            i0.j1 r1 = r0.f20476d
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r1 = fb.g1.h(r1)
            if (r1 != 0) goto L13
            return
        L13:
            long r1 = android.os.SystemClock.uptimeMillis()
            r3.f20056e = r1
            android.content.Context r1 = r3.f20053b
            fb.d1 r0 = wb.yt.N(r0)
            fb.g1.o(r1, r0)
            return
    }

    public final void b(boolean r7) {
            r6 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            wb.cr r2 = r6.f20057f
            android.os.Handler r3 = r6.f20054c
            if (r7 != 0) goto L27
            long r4 = r6.f20056e
            long r0 = r0 - r4
            r4 = 600(0x258, double:2.964E-321)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 < 0) goto L14
            goto L27
        L14:
            boolean r7 = r6.f20055d
            if (r7 != 0) goto L26
            r7 = 1
            r6.f20055d = r7
            long r4 = r4 - r0
            r0 = 1
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 >= 0) goto L23
            r4 = r0
        L23:
            r3.postDelayed(r2, r4)
        L26:
            return
        L27:
            r3.removeCallbacks(r2)
            r7 = 0
            r6.f20055d = r7
            r6.a()
            return
    }
}
