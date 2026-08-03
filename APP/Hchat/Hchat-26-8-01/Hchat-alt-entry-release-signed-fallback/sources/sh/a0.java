package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12485g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f12486h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12487i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f12488j;

    public /* synthetic */ a0(long r2, i0.f1 r4, i.c r5) {
            r1 = this;
            r0 = 1
            r1.f12485g = r0
            r1.<init>()
            r1.f12486h = r2
            r1.f12487i = r4
            r1.f12488j = r5
            return
    }

    public /* synthetic */ a0(fg.a r2, fg.a r3, long r4) {
            r1 = this;
            r0 = 0
            r1.f12485g = r0
            r1.<init>()
            r1.f12487i = r2
            r1.f12488j = r3
            r1.f12486h = r4
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f12485g
            switch(r0) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.f12487i
            i0.f1 r0 = (i0.f1) r0
            java.lang.Object r1 = r10.f12488j
            i.c r1 = (i.c) r1
            r2 = r11
            h1.d r2 = (h1.d) r2
            r2.getClass()
            long r3 = r10.f12486h
            float r11 = f1.w.d(r3)
            float r0 = r0.g()
            float r0 = r0 * r11
            java.lang.Object r11 = r1.d()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            float r11 = r11 * r0
            long r3 = f1.w.b(r3, r11)
            r8 = 0
            r9 = 126(0x7e, float:1.77E-43)
            r5 = 0
            r7 = 0
            h1.d.Z(r2, r3, r5, r7, r8, r9)
        L36:
            sf.n r11 = sf.n.f12433a
            return r11
        L39:
            java.lang.Object r0 = r10.f12487i
            fg.a r0 = (fg.a) r0
            java.lang.Object r1 = r10.f12488j
            fg.a r1 = (fg.a) r1
            f1.d0 r11 = (f1.d0) r11
            r11.getClass()
            java.lang.Object r0 = r0.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r2 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r2
            r2 = 1041865114(0x3e19999a, float:0.15)
            float r0 = r0 + r2
            r11.q(r0)
            r11.i(r0)
            java.lang.Object r0 = r1.invoke()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r11.n(r0)
            long r0 = r10.f12486h
            r11.H0(r0)
            goto L36
    }
}
