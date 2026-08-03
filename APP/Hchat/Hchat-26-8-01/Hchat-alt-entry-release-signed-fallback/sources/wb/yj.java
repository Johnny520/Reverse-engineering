package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yj implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f20404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20409m;

    public /* synthetic */ yj(android.content.SharedPreferences r2, android.content.Context r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 1
            r1.f20403g = r0
            r1.<init>()
            r1.f20404h = r2
            r1.f20405i = r3
            r1.f20406j = r4
            r1.f20407k = r5
            r1.f20408l = r6
            r1.f20409m = r7
            return
    }

    public /* synthetic */ yj(i0.a1 r2, android.content.Context r3, android.content.SharedPreferences r4, i0.a1 r5, i0.a1 r6, i0.a1 r7) {
            r1 = this;
            r0 = 0
            r1.f20403g = r0
            r1.<init>()
            r1.f20406j = r2
            r1.f20405i = r3
            r1.f20404h = r4
            r1.f20407k = r5
            r1.f20408l = r6
            r1.f20409m = r7
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f20403g
            switch(r0) {
                case 0: goto L3d;
                default: goto L5;
            }
        L5:
            r.h r13 = (r.h) r13
            r13.getClass()
            s0.d r0 = wb.p0.f18363v2
            r1 = 0
            r2 = 3
            r.h.a(r13, r1, r0, r2)
            wb.e1 r3 = new wb.e1
            r10 = 14
            android.content.SharedPreferences r4 = r12.f20404h
            android.content.Context r5 = r12.f20405i
            i0.a1 r6 = r12.f20406j
            i0.a1 r7 = r12.f20407k
            i0.a1 r8 = r12.f20408l
            i0.a1 r9 = r12.f20409m
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            s0.d r0 = new s0.d
            r4 = -1772312925(0xffffffff965ca6a3, float:-1.782404E-25)
            r5 = 1
            r0.<init>(r4, r3, r5)
            r.h.a(r13, r1, r0, r2)
            s0.d r0 = wb.p0.f18370w2
            r.h.a(r13, r1, r0, r2)
            s0.d r0 = wb.p0.f18383y2
            r.h.a(r13, r1, r0, r2)
        L3a:
            sf.n r13 = sf.n.f12433a
            return r13
        L3d:
            r3 = r13
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            i0.a1 r2 = r12.f20406j
            java.lang.Object r13 = r2.getValue()
            java.util.List r13 = (java.util.List) r13
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L54:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r13.next()
            r4 = r1
            ua.h r4 = (ua.h) r4
            java.lang.String r4 = r4.f13622e
            boolean r4 = gg.l.a(r4, r3)
            if (r4 == 0) goto L54
            r0.add(r1)
            goto L54
        L6d:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r1 = tf.n.e1(r0)
            r13.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L7a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r0.next()
            ua.h r1 = (ua.h) r1
            java.lang.String r1 = r1.f13619b
            r13.add(r1)
            goto L7a
        L8c:
            java.lang.String r8 = wb.ho.D5(r13)
            wb.v0 r13 = new wb.v0
            eb.p r0 = new eb.p
            android.content.Context r1 = r12.f20405i
            android.content.SharedPreferences r4 = r12.f20404h
            i0.a1 r5 = r12.f20407k
            i0.a1 r6 = r12.f20408l
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10 = 1
            r11 = 192(0xc0, float:2.69E-43)
            java.lang.String r5 = "批量套用收款模板"
            wb.u0 r6 = wb.u0.f19346i
            r7 = 1
            r4 = r13
            r9 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            i0.a1 r13 = r12.f20409m
            r13.setValue(r4)
            goto L3a
    }
}
