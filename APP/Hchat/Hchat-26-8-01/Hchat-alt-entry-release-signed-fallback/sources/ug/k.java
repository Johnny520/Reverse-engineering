package ug;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends yf.c implements tg.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final tg.e f13827g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wf.g f13828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13829i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wf.g f13830j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public wf.c f13831k;

    public k(tg.e r3, wf.g r4) {
            r2 = this;
            ug.i r0 = ug.i.f13825g
            wf.h r1 = wf.h.f20786g
            r2.<init>(r0, r1)
            r2.f13827g = r3
            r2.f13828h = r4
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            i2.y r0 = new i2.y
            r1 = 25
            r0.<init>(r1)
            java.lang.Object r3 = r4.k(r0, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r2.f13829i = r3
            return
    }

    @Override // tg.e
    public final java.lang.Object e(java.lang.Object r2, wf.c r3) {
            r1 = this;
            java.lang.Object r2 = r1.f(r3, r2)     // Catch: java.lang.Throwable -> Lc
            xf.a r3 = xf.a.f21579g
            if (r2 != r3) goto L9
            return r2
        L9:
            sf.n r2 = sf.n.f12433a
            return r2
        Lc:
            r2 = move-exception
            ug.h r0 = new ug.h
            wf.g r3 = r3.getContext()
            r0.<init>(r2, r3)
            r1.f13830j = r0
            throw r2
    }

    public final java.lang.Object f(wf.c r5, java.lang.Object r6) {
            r4 = this;
            wf.g r0 = r5.getContext()
            qg.v.g(r0)
            wf.g r1 = r4.f13830j
            if (r1 == r0) goto L80
            boolean r2 = r1 instanceof ug.h
            if (r2 != 0) goto L53
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            b0.t r2 = new b0.t
            r3 = 21
            r2.<init>(r4, r3)
            java.lang.Object r1 = r0.k(r2, r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r4.f13829i
            if (r1 != r2) goto L2c
            r4.f13830j = r0
            goto L80
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Flow invariant is violated:\n\t\tFlow was collected in "
            r6.<init>(r1)
            wf.g r1 = r4.f13828h
            r6.append(r1)
            java.lang.String r1 = ",\n\t\tbut emission happened in "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r0 = ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L53:
            ug.h r1 = (ug.h) r1
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception "
            r0.<init>(r2)
            java.lang.Throwable r1 = r1.f13824h
            r0.append(r1)
            java.lang.String r1 = ", but then emission attempt of value '"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = og.n.R(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L80:
            r4.f13831k = r5
            fg.q r5 = ug.m.f13833a
            tg.e r0 = r4.f13827g
            r0.getClass()
            java.lang.Object r5 = r5.b(r0, r6, r4)
            xf.a r6 = xf.a.f21579g
            boolean r6 = gg.l.a(r5, r6)
            if (r6 != 0) goto L98
            r6 = 0
            r4.f13831k = r6
        L98:
            return r5
    }

    @Override // yf.a, yf.d
    public final yf.d getCallerFrame() {
            r2 = this;
            wf.c r0 = r2.f13831k
            boolean r1 = r0 instanceof yf.d
            if (r1 == 0) goto L9
            yf.d r0 = (yf.d) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // yf.c, wf.c
    public final wf.g getContext() {
            r1 = this;
            wf.g r0 = r1.f13830j
            if (r0 != 0) goto L6
            wf.h r0 = wf.h.f20786g
        L6:
            return r0
    }

    @Override // yf.a
    public final java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            java.lang.Throwable r0 = sf.g.b(r4)
            if (r0 == 0) goto L11
            ug.h r1 = new ug.h
            wf.g r2 = r3.getContext()
            r1.<init>(r0, r2)
            r3.f13830j = r1
        L11:
            wf.c r0 = r3.f13831k
            if (r0 == 0) goto L18
            r0.resumeWith(r4)
        L18:
            xf.a r4 = xf.a.f21579g
            return r4
    }
}
