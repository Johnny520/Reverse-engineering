package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f668k;

    public /* synthetic */ h(bb.k r1, java.lang.String r2, java.lang.String r3, long r4, int r6) {
            r0 = this;
            r0.f664g = r6
            r0.f665h = r1
            r0.f666i = r2
            r0.f667j = r3
            r0.f668k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ h(r9.d0 r2, java.lang.Object r3, java.lang.String r4, long r5) {
            r1 = this;
            r0 = 2
            r1.f664g = r0
            r1.<init>()
            r1.f665h = r2
            r1.f667j = r3
            r1.f666i = r4
            r1.f668k = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.f664g
            long r1 = r12.f668k
            java.lang.String r3 = r12.f666i
            java.lang.Object r4 = r12.f667j
            java.lang.Object r5 = r12.f665h
            switch(r0) {
                case 0: goto L5e;
                case 1: goto L1c;
                default: goto Ld;
            }
        Ld:
            r9.d0 r5 = (r9.d0) r5
            r5.E0(r4, r3)
            android.widget.TextView r0 = r5.y(r4, r1)
            if (r0 == 0) goto L1b
            r0.setText(r3)
        L1b:
            return
        L1c:
            bb.k r5 = (bb.k) r5
            java.lang.String r4 = (java.lang.String) r4
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r5.f682h
            r6 = 12000(0x2ee0, double:5.929E-320)
            java.lang.Thread.sleep(r6)     // Catch: java.lang.Throwable -> L27
        L27:
            java.lang.String r6 = bb.k.n(r3, r4)
            boolean r7 = r5.f(r1, r6)
            if (r7 == 0) goto L5d
            boolean r7 = r0.contains(r4)
            if (r7 != 0) goto L38
            goto L5d
        L38:
            r5.b(r1, r6)
            r0.remove(r4)
            r5.l()
            java.lang.String r0 = bb.k.n(r3, r4)
            java.util.concurrent.ConcurrentHashMap r1 = r5.f683i
            r1.remove(r0)
            java.util.concurrent.ConcurrentHashMap r1 = r5.f684j
            long r2 = java.lang.System.currentTimeMillis()
            r6 = 6000(0x1770, double:2.9644E-320)
            long r2 = r2 + r6
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.put(r0, r2)
            r5.j()
        L5d:
            return
        L5e:
            r7 = r5
            bb.k r7 = (bb.k) r7
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            b9.f r1 = r7.f676b
            bb.j r6 = new bb.j
            java.lang.String r9 = r12.f666i
            long r10 = r12.f668k
            r6.<init>(r7, r8, r9, r10)
            java.util.Map r0 = r1.f538b
            r9.getClass()
            r8.getClass()
            og.k r2 = bb.l.f693c
            boolean r2 = fb.v0.A(r9)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L83
        L81:
            r0 = r4
            goto Le0
        L83:
            boolean r2 = r1.c()
            if (r2 != 0) goto L8a
            goto L81
        L8a:
            java.lang.Object r2 = r1.f543g
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            if (r2 == 0) goto L81
            java.lang.Object[] r5 = new java.lang.Object[]{r9, r8}     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.newInstance(r2, r5)     // Catch: java.lang.Throwable -> Lba
            if (r2 == 0) goto Lbc
            r0.getClass()     // Catch: java.lang.Throwable -> Lba
            r5 = r0
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> Lba
            r5.put(r2, r6)     // Catch: java.lang.Throwable -> Lba
            m8.a r5 = h.Hchat.hooks.api.core.WeChatApis.network()     // Catch: java.lang.Throwable -> Lba
            if (r5 == 0) goto Lb3
            m8.c r5 = r5.f8777a     // Catch: java.lang.Throwable -> Lba
            boolean r5 = r5.j(r2)     // Catch: java.lang.Throwable -> Lba
            if (r5 != r3) goto Lb3
            r5 = r3
            goto Lb4
        Lb3:
            r5 = r4
        Lb4:
            if (r5 != 0) goto Lbd
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lba
            goto Lbd
        Lba:
            r0 = move-exception
            goto Lc2
        Lbc:
            r5 = r4
        Lbd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> Lba
            goto Lc8
        Lc2:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Lc8:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 != 0) goto Lcf
            goto Lda
        Lcf:
            java.lang.Object r0 = r1.f541e
            ab.b r0 = (ab.b) r0
            java.lang.String r1 = "实名查询请求失败"
            r0.invoke(r1, r2)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        Lda:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        Le0:
            if (r0 != 0) goto L157
            java.lang.String r0 = bb.k.n(r8, r9)
            boolean r1 = r7.f(r10, r0)
            if (r1 != 0) goto Led
            goto L157
        Led:
            r7.b(r10, r0)
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r7.f682h
            r0.remove(r9)
            r7.l()
            java.util.concurrent.ConcurrentHashMap r0 = r7.f684j
            r10 = r8
            java.lang.String r8 = bb.k.n(r10, r9)
            java.util.concurrent.ConcurrentHashMap r1 = r7.f683i
            java.lang.Object r2 = r1.get(r8)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L10d
            int r4 = r2.intValue()
        L10d:
            int r4 = r4 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r1.put(r8, r2)
            if (r4 != r3) goto L145
            double r1 = java.lang.Math.random()
            r3 = 7000(0x1b58, double:3.4585E-320)
            double r3 = (double) r3
            double r1 = r1 * r3
            long r1 = (long) r1
            r3 = 8000(0x1f40, double:3.9525E-320)
            long r1 = r1 + r3
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 + r1
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.put(r8, r3)
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.tasks()
            if (r0 == 0) goto L154
            java.lang.String r3 = "real_tail_retry_"
            java.lang.String r3 = r3.concat(r8)
            b9.c r6 = new b9.c
            r11 = 2
            r6.<init>(r7, r8, r9, r10, r11)
            r0.f(r3, r1, r6)
            goto L154
        L145:
            long r1 = java.lang.System.currentTimeMillis()
            r3 = 60000(0xea60, double:2.9644E-319)
            long r1 = r1 + r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.put(r8, r1)
        L154:
            r7.j()
        L157:
            return
    }
}
