package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22002g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y1.t f22003h;

    public /* synthetic */ n(y1.t r1, int r2) {
            r0 = this;
            r0.f22002g = r2
            r0.f22003h = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = r6.f22002g
            switch(r0) {
                case 0: goto L7c;
                case 1: goto L2c;
                case 2: goto Lc;
                default: goto L5;
            }
        L5:
            y1.t r0 = r6.f22003h
            y1.t.i(r0)
            r0 = 0
            return r0
        Lc:
            y1.t r0 = r6.f22003h
            android.view.MotionEvent r1 = r0.C0
            if (r1 == 0) goto L29
            int r1 = r1.getActionMasked()
            r2 = 7
            if (r1 == r2) goto L1e
            r2 = 9
            if (r1 == r2) goto L1e
            goto L29
        L1e:
            long r1 = android.os.SystemClock.uptimeMillis()
            r0.D0 = r1
            rg.f r1 = r0.I0
            r0.post(r1)
        L29:
            sf.n r0 = sf.n.f12433a
            return r0
        L2c:
            y1.t r0 = r6.f22003h
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            d3.a r1 = new d3.a
            d3.b r2 = new d3.b
            r2.<init>(r0)
            r1.<init>(r2)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L54
            android.os.LocaleList r0 = android.os.LocaleList.getDefault()
            d3.a r1 = new d3.a
            d3.b r2 = new d3.b
            r2.<init>(r0)
            r1.<init>(r2)
        L54:
            d3.b r0 = r1.f1972a
            android.os.LocaleList r0 = r0.f1973a
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r3 = 0
        L62:
            if (r3 >= r1) goto L76
            p2.a r4 = new p2.a
            java.util.Locale r5 = r0.get(r3)
            r5.getClass()
            r4.<init>(r5)
            r2.add(r4)
            int r3 = r3 + 1
            goto L62
        L76:
            p2.b r0 = new p2.b
            r0.<init>(r2)
            return r0
        L7c:
            y1.t r0 = r6.f22003h
            i0.j1 r0 = r0.f22113w
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            return r0
    }
}
