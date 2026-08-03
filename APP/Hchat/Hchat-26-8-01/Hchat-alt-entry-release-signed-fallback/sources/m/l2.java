package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m.o2 f8257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gg.t f8258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f8259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8260k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m.o2 f8262m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gg.t f8263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f8264o;

    public l2(m.o2 r1, gg.t r2, long r3, wf.c r5) {
            r0 = this;
            r0.f8262m = r1
            r0.f8263n = r2
            r0.f8264o = r3
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r7, wf.c r8) {
            r6 = this;
            m.l2 r0 = new m.l2
            gg.t r2 = r6.f8263n
            long r3 = r6.f8264o
            m.o2 r1 = r6.f8262m
            r5 = r8
            r0.<init>(r1, r2, r3, r5)
            r0.f8261l = r7
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            m.m2 r1 = (m.m2) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            m.l2 r1 = (m.l2) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            int r0 = r11.f8260k
            m.p1 r1 = m.p1.f8325h
            r2 = 1
            if (r0 == 0) goto L1e
            if (r0 != r2) goto L17
            long r3 = r11.f8259j
            gg.t r0 = r11.f8258i
            m.o2 r5 = r11.f8257h
            java.lang.Object r6 = r11.f8261l
            m.o2 r6 = (m.o2) r6
            f8.i.I0(r12)
            goto L67
        L17:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r12 = 0
            return r12
        L1e:
            f8.i.I0(r12)
            java.lang.Object r12 = r11.f8261l
            m.m2 r12 = (m.m2) r12
            m.k2 r0 = new m.k2
            r3 = 0
            m.o2 r5 = r11.f8262m
            r0.<init>(r5, r3, r12)
            m.p r12 = r5.f8307c
            gg.t r3 = r11.f8263n
            long r6 = r3.f4563g
            m.p1 r4 = r5.f8308d
            long r8 = r11.f8264o
            if (r4 != r1) goto L3e
            float r4 = u2.q.b(r8)
            goto L42
        L3e:
            float r4 = u2.q.c(r8)
        L42:
            float r4 = r5.d(r4)
            r11.f8261l = r5
            r11.f8257h = r5
            r11.f8258i = r3
            r11.f8259j = r6
            r11.f8260k = r2
            r12.getClass()
            m.w1 r8 = r12.f8319b
            m.o r9 = new m.o
            r10 = 0
            r9.<init>(r4, r12, r0, r10)
            java.lang.Object r12 = qg.v.x(r8, r9, r11)
            xf.a r0 = xf.a.f21579g
            if (r12 != r0) goto L64
            return r0
        L64:
            r0 = r3
            r3 = r6
            r6 = r5
        L67:
            java.lang.Number r12 = (java.lang.Number) r12
            float r12 = r12.floatValue()
            float r12 = r6.d(r12)
            m.p1 r5 = r5.f8308d
            r6 = 0
            if (r5 != r1) goto L7c
            r1 = 2
            long r1 = u2.q.a(r12, r6, r1, r3)
            goto L80
        L7c:
            long r1 = u2.q.a(r6, r12, r2, r3)
        L80:
            r0.f4563g = r1
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
