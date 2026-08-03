package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n2 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f8286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m.o2 f8287k;

    public n2(m.o2 r1, wf.c r2) {
            r0 = this;
            r0.f8287k = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            m.n2 r0 = new m.n2
            m.o2 r1 = r2.f8287k
            r0.<init>(r1, r4)
            u2.q r3 = (u2.q) r3
            long r3 = r3.f13362a
            r0.f8286j = r3
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            u2.q r4 = (u2.q) r4
            long r0 = r4.f13362a
            wf.c r5 = (wf.c) r5
            m.n2 r4 = new m.n2
            m.o2 r2 = r3.f8287k
            r4.<init>(r2, r5)
            r4.f8286j = r0
            sf.n r5 = sf.n.f12433a
            java.lang.Object r4 = r4.invokeSuspend(r5)
            return r4
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            r14 = this;
            int r0 = r14.f8285i
            r1 = 3
            r2 = 2
            r3 = 1
            m.o2 r4 = r14.f8287k
            xf.a r5 = xf.a.f21579g
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L19
            long r0 = r14.f8284h
            long r2 = r14.f8286j
            f8.i.I0(r15)
            goto L70
        L19:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r15 = 0
            return r15
        L20:
            long r2 = r14.f8284h
            long r6 = r14.f8286j
            f8.i.I0(r15)
            goto L56
        L28:
            long r6 = r14.f8286j
            f8.i.I0(r15)
            goto L40
        L2e:
            f8.i.I0(r15)
            long r6 = r14.f8286j
            r1.d r15 = r4.f8310f
            r14.f8286j = r6
            r14.f8285i = r3
            java.lang.Object r15 = r15.c(r6, r14)
            if (r15 != r5) goto L40
            goto L6d
        L40:
            u2.q r15 = (u2.q) r15
            long r8 = r15.f13362a
            long r8 = u2.q.d(r6, r8)
            r14.f8286j = r6
            r14.f8284h = r8
            r14.f8285i = r2
            java.lang.Object r15 = r4.a(r8, r14)
            if (r15 != r5) goto L55
            goto L6d
        L55:
            r2 = r8
        L56:
            u2.q r15 = (u2.q) r15
            long r11 = r15.f13362a
            r1.d r8 = r4.f8310f
            long r9 = u2.q.d(r2, r11)
            r14.f8286j = r6
            r14.f8284h = r11
            r14.f8285i = r1
            r13 = r14
            java.lang.Object r15 = r8.a(r9, r11, r13)
            if (r15 != r5) goto L6e
        L6d:
            return r5
        L6e:
            r2 = r6
            r0 = r11
        L70:
            u2.q r15 = (u2.q) r15
            long r4 = r15.f13362a
            long r0 = u2.q.d(r0, r4)
            long r0 = u2.q.d(r2, r0)
            u2.q r15 = new u2.q
            r15.<init>(r0)
            return r15
    }
}
