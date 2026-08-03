package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oc implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18051g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18052h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18053i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f18054j;

    public /* synthetic */ oc(android.content.Context r2, i0.a1 r3, i0.a1 r4) {
            r1 = this;
            r0 = 1
            r1.f18051g = r0
            r1.<init>()
            r1.f18052h = r2
            r1.f18053i = r3
            r1.f18054j = r4
            return
    }

    public /* synthetic */ oc(i0.a1 r2, android.content.Context r3, i0.a1 r4) {
            r1 = this;
            r0 = 0
            r1.f18051g = r0
            r1.<init>()
            r1.f18053i = r2
            r1.f18052h = r3
            r1.f18054j = r4
            return
    }

    public /* synthetic */ oc(i0.a1 r2, i0.a1 r3, android.content.Context r4) {
            r1 = this;
            r0 = 2
            r1.f18051g = r0
            r1.<init>()
            r1.f18053i = r2
            r1.f18054j = r3
            r1.f18052h = r4
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f18051g
            r1 = 1
            android.content.Context r2 = r12.f18052h
            i0.a1 r3 = r12.f18054j
            i0.a1 r4 = r12.f18053i
            sf.n r5 = sf.n.f12433a
            switch(r0) {
                case 0: goto L64;
                case 1: goto L43;
                default: goto Le;
            }
        Le:
            r.h r13 = (r.h) r13
            r13.getClass()
            s0.d r0 = wb.p0.f18361v0
            r6 = 0
            r7 = 3
            r.h.a(r13, r6, r0, r7)
            wb.t1 r0 = new wb.t1
            r8 = 24
            r0.<init>(r8, r4, r3)
            s0.d r4 = new s0.d
            r8 = 2004525492(0x777aa1b4, float:5.0834138E33)
            r4.<init>(r8, r0, r1)
            r.h.a(r13, r6, r4, r7)
            s0.d r0 = wb.p0.f18368w0
            r.h.a(r13, r6, r0, r7)
            wb.oa r0 = new wb.oa
            r4 = 6
            r0.<init>(r2, r3, r4)
            s0.d r2 = new s0.d
            r3 = -755045134(0xffffffffd2feecf2, float:-5.474485E11)
            r2.<init>(r3, r0, r1)
            r.h.a(r13, r6, r2, r7)
            return r5
        L43:
            java.lang.String r13 = (java.lang.String) r13
            r13.getClass()
            boolean r0 = og.m.t0(r13)
            if (r0 != 0) goto L63
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r1) goto L60
            java.util.concurrent.atomic.AtomicBoolean r0 = e9.q.f2460a
            java.lang.String r13 = e9.q.h(r2, r13)
        L60:
            r3.setValue(r13)
        L63:
            return r5
        L64:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r8 = r13.booleanValue()
            i0.a1 r10 = r12.f18053i
            java.lang.Object r0 = r10.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            r10.setValue(r13)
            java.lang.Thread r13 = new java.lang.Thread
            wb.gg r6 = new wb.gg
            android.content.Context r7 = r12.f18052h
            i0.a1 r11 = r12.f18054j
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.String r0 = "Hchat-Script-Global"
            r13.<init>(r6, r0)
            r13.start()
            return r5
    }
}
