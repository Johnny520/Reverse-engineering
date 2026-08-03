package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ld implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f17444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f17445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f17448k;

    public /* synthetic */ ld(android.content.Context r2, i0.a1 r3, i0.a1 r4, i0.a1 r5) {
            r1 = this;
            r0 = 1
            r1.f17444g = r0
            r1.<init>()
            r1.f17445h = r2
            r1.f17446i = r3
            r1.f17447j = r4
            r1.f17448k = r5
            return
    }

    public /* synthetic */ ld(i0.a1 r2, android.content.Context r3, i0.a1 r4, i0.a1 r5) {
            r1 = this;
            r0 = 0
            r1.f17444g = r0
            r1.<init>()
            r1.f17446i = r2
            r1.f17445h = r3
            r1.f17447j = r4
            r1.f17448k = r5
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f17444g
            switch(r0) {
                case 0: goto L5b;
                default: goto L5;
            }
        L5:
            android.content.Context r1 = r12.f17445h
            i0.a1 r0 = r12.f17446i
            i0.a1 r2 = r12.f17447j
            i0.a1 r3 = r12.f17448k
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L39
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L39
            fb.t0 r13 = fb.w.u(r1, r0, r13)     // Catch: java.lang.Throwable -> L39
            java.lang.String r13 = r13.f3784b     // Catch: java.lang.Throwable -> L39
            r2.setValue(r13)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r13 = r3.getValue()     // Catch: java.lang.Throwable -> L39
            java.lang.Number r13 = (java.lang.Number) r13     // Catch: java.lang.Throwable -> L39
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L39
            int r0 = r13 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L39
            r3.setValue(r0)     // Catch: java.lang.Throwable -> L39
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L39
            goto L41
        L39:
            r0 = move-exception
            r13 = r0
            sf.f r0 = new sf.f
            r0.<init>(r13)
            r13 = r0
        L41:
            java.lang.Throwable r13 = sf.g.b(r13)
            if (r13 == 0) goto L58
            java.lang.String r13 = r13.getMessage()
            if (r13 == 0) goto L4e
            goto L50
        L4e:
            java.lang.String r13 = "重命名失败"
        L50:
            r0 = 0
            android.widget.Toast r13 = android.widget.Toast.makeText(r1, r13, r0)
            r13.show()
        L58:
            sf.n r13 = sf.n.f12433a
            return r13
        L5b:
            r.h r13 = (r.h) r13
            r13.getClass()
            i0.a1 r2 = r12.f17446i
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r7 = r0.iterator()
            r0 = 0
            r3 = r0
        L6e:
            boolean r0 = r7.hasNext()
            r8 = 3
            r9 = 0
            r10 = 1
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r7.next()
            int r11 = r3 + 1
            if (r3 < 0) goto Lab
            r1 = r0
            x8.s r1 = (x8.s) r1
            wb.yb r0 = new wb.yb
            r4 = 2
            r0.<init>(r3, r4)
            s0.d r4 = new s0.d
            r5 = 557486494(0x213a919e, float:6.3211974E-19)
            r4.<init>(r5, r0, r10)
            r.h.a(r13, r9, r4, r8)
            wb.mc r0 = new wb.mc
            android.content.Context r4 = r12.f17445h
            i0.a1 r5 = r12.f17447j
            i0.a1 r6 = r12.f17448k
            r0.<init>(r1, r2, r3, r4, r5, r6)
            s0.d r1 = new s0.d
            r3 = 1481039879(0x5846e007, float:8.74662E14)
            r1.<init>(r3, r0, r10)
            r.h.a(r13, r9, r1, r8)
            r3 = r11
            goto L6e
        Lab:
            a.a.Q0()
            throw r9
        Laf:
            s0.d r0 = wb.p0.f18355u1
            r.h.a(r13, r9, r0, r8)
            wb.uf r0 = new wb.uf
            r1 = 3
            r0.<init>(r2, r1)
            s0.d r1 = new s0.d
            r2 = 838014583(0x31f31677, float:7.0747848E-9)
            r1.<init>(r2, r0, r10)
            r.h.a(r13, r9, r1, r8)
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
