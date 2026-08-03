package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements y0.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.content.Context f22183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vg.c f22184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i0.f1 f22185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public qg.e1 f22186j;

    public z1(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.f22183g = r2
            i0.f1 r2 = new i0.f1
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0)
            r1.f22185i = r2
            return
    }

    @Override // wf.g
    public final wf.g e(wf.g r1) {
            r0 = this;
            wf.g r1 = f8.i.q0(r0, r1)
            return r1
    }

    @Override // y0.p
    public final float i() {
            r10 = this;
            qg.e1 r0 = r10.f22186j
            if (r0 != 0) goto L97
            android.content.Context r6 = r10.f22183g
            f.k0 r8 = y1.v2.f22138a
            monitor-enter(r8)
            java.lang.Object r0 = r8.g(r6)     // Catch: java.lang.Throwable -> L67
            r9 = 0
            if (r0 != 0) goto L69
            android.content.ContentResolver r2 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L67
            java.lang.String r0 = "animator_duration_scale"
            android.net.Uri r3 = android.provider.Settings.Global.getUriFor(r0)     // Catch: java.lang.Throwable -> L67
            r0 = -1
            r1 = 6
            sg.c r5 = sg.j.a(r0, r1, r9)     // Catch: java.lang.Throwable -> L67
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L67
            android.os.Handler r0 = a.a.C(r0)     // Catch: java.lang.Throwable -> L67
            y1.u2 r4 = new y1.u2     // Catch: java.lang.Throwable -> L67
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L67
            wb.on r1 = new wb.on     // Catch: java.lang.Throwable -> L67
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L67
            m.a r0 = new m.a     // Catch: java.lang.Throwable -> L67
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L67
            vg.c r1 = new vg.c     // Catch: java.lang.Throwable -> L67
            qg.g1 r2 = new qg.g1     // Catch: java.lang.Throwable -> L67
            r2.<init>(r9)     // Catch: java.lang.Throwable -> L67
            xg.e r3 = qg.c0.f11038a     // Catch: java.lang.Throwable -> L67
            rg.e r3 = vg.m.f14353a     // Catch: java.lang.Throwable -> L67
            wf.g r2 = f8.i.q0(r2, r3)     // Catch: java.lang.Throwable -> L67
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L67
            tg.y r2 = new tg.y     // Catch: java.lang.Throwable -> L67
            r2.<init>()     // Catch: java.lang.Throwable -> L67
            android.content.ContentResolver r3 = r6.getContentResolver()     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = "animator_duration_scale"
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = android.provider.Settings.Global.getFloat(r3, r4, r5)     // Catch: java.lang.Throwable -> L67
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.Throwable -> L67
            tg.o r0 = tg.s.h(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L67
            r8.m(r6, r0)     // Catch: java.lang.Throwable -> L67
            goto L69
        L67:
            r0 = move-exception
            goto L95
        L69:
            tg.z r0 = (tg.z) r0     // Catch: java.lang.Throwable -> L67
            monitor-exit(r8)
            java.lang.Object r1 = r0.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            i0.f1 r2 = r10.f22185i
            r2.h(r1)
            vg.c r1 = r10.f22184h
            if (r1 == 0) goto L8e
            ci.j r2 = new ci.j
            r3 = 27
            r2.<init>(r0, r10, r9, r3)
            r0 = 3
            qg.e1 r0 = qg.v.q(r1, r9, r2, r0)
            r10.f22186j = r0
            goto L97
        L8e:
            java.lang.String r0 = "MotionDurationScale scale factor requested before recomposer loop start"
            j8.o.A(r0)
            r0 = 0
            return r0
        L95:
            monitor-exit(r8)
            throw r0
        L97:
            i0.f1 r0 = r10.f22185i
            float r0 = r0.g()
            return r0
    }

    @Override // wf.g
    public final java.lang.Object k(fg.p r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object r1 = r1.invoke(r2, r0)
            return r1
    }

    @Override // wf.g
    public final wf.e s(wf.f r1) {
            r0 = this;
            wf.e r1 = f8.i.w(r0, r1)
            return r1
    }

    @Override // wf.g
    public final wf.g t(wf.f r1) {
            r0 = this;
            wf.g r1 = f8.i.l0(r0, r1)
            return r1
    }
}
