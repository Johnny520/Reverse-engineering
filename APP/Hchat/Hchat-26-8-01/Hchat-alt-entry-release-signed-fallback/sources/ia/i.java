package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6576g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p8.l f6577h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ia.q f6578i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f6579j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f6580k;

    public /* synthetic */ i(int r2, android.app.Activity r3, ia.q r4, p8.l r5) {
            r1 = this;
            r0 = 1
            r1.f6576g = r0
            r1.<init>()
            r1.f6577h = r5
            r1.f6578i = r4
            r1.f6579j = r2
            r1.f6580k = r3
            return
    }

    public /* synthetic */ i(ia.q r1, android.app.Activity r2, p8.l r3, int r4, int r5) {
            r0 = this;
            r0.f6576g = r5
            r0.f6578i = r1
            r0.f6580k = r2
            r0.f6577h = r3
            r0.f6579j = r4
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r14) {
            r13 = this;
            int r0 = r13.f6576g
            switch(r0) {
                case 0: goto L80;
                case 1: goto L46;
                default: goto L5;
            }
        L5:
            r4 = r14
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            ia.q r14 = r13.f6578i
            b5.c r0 = r14.f6621a
            p8.l r8 = r13.f6577h
            java.lang.String r9 = r8.f10391a
            if (r9 == 0) goto L43
            ia.c r10 = r0.l(r9)
            java.util.List r1 = r10.f6559b
            java.util.ArrayList r11 = tf.m.R1(r1)
            int r12 = r13.f6579j
            java.lang.Object r1 = tf.m.w1(r12, r11)
            ia.b r1 = (ia.b) r1
            if (r1 == 0) goto L43
            r5 = 0
            r7 = 23
            r2 = 0
            r3 = 0
            ia.b r1 = ia.b.a(r1, r2, r3, r4, r5, r7)
            r11.set(r12, r1)
            r0.Q(r9, r11)
            ia.a0 r0 = r14.f6622b
            android.app.Activity r1 = r13.f6580k
            r0.a(r1, r8, r10)
            r14.g(r1, r8)
        L43:
            sf.n r14 = sf.n.f12433a
            return r14
        L46:
            ia.q r0 = r13.f6578i
            b5.c r1 = r0.f6621a
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L53
            goto L7d
        L53:
            p8.l r14 = r13.f6577h
            java.lang.String r2 = r14.f10391a
            if (r2 == 0) goto L7d
            ia.c r3 = r1.l(r2)
            java.util.List r4 = r3.f6559b
            java.util.ArrayList r4 = tf.m.R1(r4)
            int r5 = r13.f6579j
            if (r5 < 0) goto L70
            int r6 = r4.size()
            if (r5 >= r6) goto L70
            r4.remove(r5)
        L70:
            r1.Q(r2, r4)
            ia.a0 r1 = r0.f6622b
            android.app.Activity r2 = r13.f6580k
            r1.a(r2, r14, r3)
            r0.g(r2, r14)
        L7d:
            sf.n r14 = sf.n.f12433a
            return r14
        L80:
            java.lang.Long r14 = (java.lang.Long) r14
            long r4 = r14.longValue()
            ia.q r14 = r13.f6578i
            b5.c r7 = r14.f6621a
            p8.l r8 = r13.f6577h
            java.lang.String r9 = r8.f10391a
            if (r9 == 0) goto Lbd
            ia.c r10 = r7.l(r9)
            java.util.List r0 = r10.f6559b
            java.util.ArrayList r11 = tf.m.R1(r0)
            int r12 = r13.f6579j
            java.lang.Object r0 = tf.m.w1(r12, r11)
            ia.b r0 = (ia.b) r0
            if (r0 == 0) goto Lbd
            r3 = 0
            r6 = 15
            r1 = 0
            r2 = 0
            ia.b r0 = ia.b.a(r0, r1, r2, r3, r4, r6)
            r11.set(r12, r0)
            r7.Q(r9, r11)
            ia.a0 r0 = r14.f6622b
            android.app.Activity r1 = r13.f6580k
            r0.a(r1, r8, r10)
            r14.g(r1, r8)
        Lbd:
            sf.n r14 = sf.n.f12433a
            return r14
    }
}
