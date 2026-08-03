package s;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f12018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s.j0 f12019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s.h0 f12022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i0.j1 f12024g;

    public h0(java.lang.Object r1, s.j0 r2) {
            r0 = this;
            r0.<init>()
            r0.f12018a = r1
            r0.f12019b = r2
            r1 = -1
            r0.f12020c = r1
            r1 = 0
            i0.j1 r1 = i0.r.u(r1)
            r0.f12024g = r1
            return
    }

    public final s.h0 a() {
            r1 = this;
            boolean r0 = r1.f12023f
            if (r0 == 0) goto L9
            java.lang.String r0 = "Pin should not be called on an already disposed item "
            o.b.c(r0)
        L9:
            int r0 = r1.f12021d
            if (r0 != 0) goto L25
            s.j0 r0 = r1.f12019b
            w0.p r0 = r0.f12036g
            r0.add(r1)
            i0.j1 r0 = r1.f12024g
            java.lang.Object r0 = r0.getValue()
            s.h0 r0 = (s.h0) r0
            if (r0 == 0) goto L22
            r0.a()
            goto L23
        L22:
            r0 = 0
        L23:
            r1.f12022e = r0
        L25:
            int r0 = r1.f12021d
            int r0 = r0 + 1
            r1.f12021d = r0
            return r1
    }

    public final void b() {
            r1 = this;
            boolean r0 = r1.f12023f
            if (r0 == 0) goto L5
            goto L28
        L5:
            int r0 = r1.f12021d
            if (r0 <= 0) goto La
            goto Lf
        La:
            java.lang.String r0 = "Release should only be called once"
            o.b.c(r0)
        Lf:
            int r0 = r1.f12021d
            int r0 = r0 + (-1)
            r1.f12021d = r0
            if (r0 != 0) goto L28
            s.j0 r0 = r1.f12019b
            w0.p r0 = r0.f12036g
            r0.remove(r1)
            s.h0 r0 = r1.f12022e
            if (r0 == 0) goto L25
            r0.b()
        L25:
            r0 = 0
            r1.f12022e = r0
        L28:
            return
    }
}
