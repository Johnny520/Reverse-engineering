package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ tg.e f13258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ int f13259j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ tg.y f13260k;

    public x(tg.y r1, wf.c r2) {
            r0 = this;
            r0.f13260k = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            tg.e r3 = (tg.e) r3
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            wf.c r5 = (wf.c) r5
            tg.x r0 = new tg.x
            tg.y r1 = r2.f13260k
            r0.<init>(r1, r5)
            r0.f13258i = r3
            r0.f13259j = r4
            sf.n r3 = sf.n.f12433a
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f13257h
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            xf.a r6 = xf.a.f21579g
            if (r0 == 0) goto L33
            if (r0 == r5) goto L2f
            if (r0 == r4) goto L29
            if (r0 == r3) goto L23
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L16
            goto L2f
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r8)
            r8 = 0
            return r8
        L1d:
            tg.e r0 = r7.f13258i
            f8.i.I0(r8)
            goto L71
        L23:
            tg.e r0 = r7.f13258i
            f8.i.I0(r8)
            goto L61
        L29:
            tg.e r0 = r7.f13258i
            f8.i.I0(r8)
            goto L54
        L2f:
            f8.i.I0(r8)
            goto L7f
        L33:
            f8.i.I0(r8)
            tg.e r0 = r7.f13258i
            int r8 = r7.f13259j
            if (r8 <= 0) goto L47
            r7.f13257h = r5
            tg.u r8 = tg.u.f13250g
            java.lang.Object r8 = r0.e(r8, r7)
            if (r8 != r6) goto L7f
            goto L7e
        L47:
            r7.f13258i = r0
            r7.f13257h = r4
            r4 = 0
            java.lang.Object r8 = qg.v.f(r4, r7)
            if (r8 != r6) goto L54
            goto L7e
        L54:
            r7.f13258i = r0
            r7.f13257h = r3
            tg.u r8 = tg.u.f13251h
            java.lang.Object r8 = r0.e(r8, r7)
            if (r8 != r6) goto L61
            goto L7e
        L61:
            r7.f13258i = r0
            r7.f13257h = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r8 = qg.v.f(r2, r7)
            if (r8 != r6) goto L71
            goto L7e
        L71:
            r8 = 0
            r7.f13258i = r8
            r7.f13257h = r1
            tg.u r8 = tg.u.f13252i
            java.lang.Object r8 = r0.e(r8, r7)
            if (r8 != r6) goto L7f
        L7e:
            return r6
        L7f:
            sf.n r8 = sf.n.f12433a
            return r8
    }
}
