package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class xn extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public wb.s0 f20229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r.z f20231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20234m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20235n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20236o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20237p;

    public xn(r.z r1, android.content.Context r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, wf.c r8) {
            r0 = this;
            r0.f20231j = r1
            r0.f20232k = r2
            r0.f20233l = r3
            r0.f20234m = r4
            r0.f20235n = r5
            r0.f20236o = r6
            r0.f20237p = r7
            r1 = 2
            r0.<init>(r1, r8)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r10, wf.c r11) {
            r9 = this;
            wb.xn r0 = new wb.xn
            i0.a1 r6 = r9.f20236o
            i0.a1 r7 = r9.f20237p
            r.z r1 = r9.f20231j
            android.content.Context r2 = r9.f20232k
            i0.a1 r3 = r9.f20233l
            i0.a1 r4 = r9.f20234m
            i0.a1 r5 = r9.f20235n
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            wb.xn r1 = (wb.xn) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f20230i
            sf.n r1 = sf.n.f12433a
            i0.a1 r2 = r13.f20236o
            i0.a1 r3 = r13.f20235n
            tf.t r4 = tf.t.f13167g
            i0.a1 r5 = r13.f20234m
            r6 = 1
            if (r0 == 0) goto L1f
            if (r0 != r6) goto L18
            wb.s0 r0 = r13.f20229h
            f8.i.I0(r14)
        L16:
            r9 = r0
            goto L5d
        L18:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r14)
            r14 = 0
            return r14
        L1f:
            f8.i.I0(r14)
            og.k r14 = wb.ho.f16633a
            i0.a1 r14 = r13.f20233l
            java.lang.Object r14 = r14.getValue()
            r0 = r14
            wb.s0 r0 = (wb.s0) r0
            java.lang.String r14 = ""
            if (r0 != 0) goto L3d
            r5.setValue(r4)
            r3.setValue(r14)
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            r2.setValue(r14)
            return r1
        L3d:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r2.setValue(r7)
            r3.setValue(r14)
            r5.setValue(r4)
            i0.a1 r7 = r13.f20237p
            r7.setValue(r14)
            r13.f20229h = r0
            r13.f20230i = r6
            r.z r14 = r13.f20231j
            r6 = 0
            java.lang.Object r14 = r.z.m(r14, r6, r13)
            xf.a r6 = xf.a.f21579g
            if (r14 != r6) goto L16
            return r6
        L5d:
            wb.la r11 = new wb.la
            r14 = 16
            r11.<init>(r2, r3, r5, r14)
            og.k r14 = wb.ho.f16633a
            g8.i r8 = wb.en.c()
            if (r8 == 0) goto L8e
            boolean r14 = r8.G()
            if (r14 != 0) goto L73
            goto L8e
        L73:
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r14 = android.os.Looper.getMainLooper()
            r10.<init>(r14)
            java.lang.Thread r14 = new java.lang.Thread
            b9.c r7 = new b9.c
            r12 = 20
            r7.<init>(r8, r9, r10, r11, r12)
            java.lang.String r0 = "HchatGroupMemberPicker"
            r14.<init>(r7, r0)
            r14.start()
            return r1
        L8e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "群成员列表不可用"
            r14.<init>(r0)
            r11.invoke(r4, r14)
            return r1
    }
}
