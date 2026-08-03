package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1259g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1260h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wb.kv f1261i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1262j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f1267o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1268p;

    public /* synthetic */ m(java.util.List r2, java.util.concurrent.atomic.AtomicBoolean r3, wb.kv r4, android.app.Activity r5, java.util.concurrent.atomic.AtomicBoolean r6, fg.l r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r1 = this;
            r0 = 1
            r1.f1259g = r0
            r1.<init>()
            r1.f1268p = r2
            r1.f1260h = r3
            r1.f1261i = r4
            r1.f1262j = r5
            r1.f1263k = r6
            r1.f1264l = r7
            r1.f1265m = r8
            r1.f1266n = r9
            r1.f1267o = r10
            return
    }

    public /* synthetic */ m(java.util.concurrent.atomic.AtomicBoolean r2, qb.k r3, qb.i r4, java.util.concurrent.atomic.AtomicBoolean r5, wb.kv r6, android.app.Activity r7, boolean r8, b.e r9, java.util.List r10) {
            r1 = this;
            r0 = 3
            r1.f1259g = r0
            r1.<init>()
            r1.f1260h = r2
            r1.f1268p = r3
            r1.f1264l = r4
            r1.f1263k = r5
            r1.f1261i = r6
            r1.f1262j = r7
            r1.f1267o = r8
            r1.f1265m = r9
            r1.f1266n = r10
            return
    }

    public /* synthetic */ m(java.util.concurrent.atomic.AtomicBoolean r2, wb.kv r3, android.app.Activity r4, java.util.concurrent.atomic.AtomicBoolean r5, java.lang.Object r6, fg.l r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            r1 = this;
            r0 = 0
            r1.f1259g = r0
            r1.<init>()
            r1.f1260h = r2
            r1.f1261i = r3
            r1.f1262j = r4
            r1.f1263k = r5
            r1.f1268p = r6
            r1.f1264l = r7
            r1.f1265m = r8
            r1.f1266n = r9
            r1.f1267o = r10
            return
    }

    public /* synthetic */ m(qb.k r2, java.util.ArrayList r3, boolean r4, java.util.concurrent.atomic.AtomicBoolean r5, java.util.concurrent.atomic.AtomicBoolean r6, wb.kv r7, android.app.Activity r8, b.e r9, java.util.List r10) {
            r1 = this;
            r0 = 2
            r1.f1259g = r0
            r1.<init>()
            r1.f1268p = r2
            r1.f1264l = r3
            r1.f1267o = r4
            r1.f1260h = r5
            r1.f1263k = r6
            r1.f1261i = r7
            r1.f1262j = r8
            r1.f1265m = r9
            r1.f1266n = r10
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r21 = this;
            r1 = r21
            int r0 = r1.f1259g
            r2 = 0
            r3 = 1
            wb.kv r4 = r1.f1261i
            java.util.concurrent.atomic.AtomicBoolean r5 = r1.f1260h
            java.lang.Object r6 = r1.f1268p
            java.lang.Object r7 = r1.f1266n
            java.lang.Object r8 = r1.f1265m
            java.lang.Object r9 = r1.f1264l
            switch(r0) {
                case 0: goto Lf5;
                case 1: goto Lc1;
                case 2: goto L77;
                default: goto L15;
            }
        L15:
            r12 = r6
            qb.k r12 = (qb.k) r12
            r13 = r9
            qb.i r13 = (qb.i) r13
            r15 = r8
            b.e r15 = (b.e) r15
            r16 = r7
            java.util.List r16 = (java.util.List) r16
            boolean r0 = r5.get()
            if (r0 == 0) goto L33
            java.util.List r0 = a.a.A0(r13)
            r12.getClass()
            qb.k.i(r0)
            goto L76
        L33:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f1263k
            r0.set(r3)
            r4.close()
            android.app.Activity r11 = r1.f1262j
            boolean r0 = r11.isFinishing()
            if (r0 != 0) goto L6c
            boolean r0 = r11.isDestroyed()
            if (r0 == 0) goto L4a
            goto L6c
        L4a:
            android.view.Window r0 = r11.getWindow()
            if (r0 == 0) goto L54
            android.view.View r2 = r0.getDecorView()
        L54:
            if (r2 != 0) goto L61
            java.util.List r0 = a.a.A0(r13)
            r12.getClass()
            qb.k.i(r0)
            goto L76
        L61:
            qb.e r10 = new qb.e
            boolean r14 = r1.f1267o
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r2.postOnAnimation(r10)
            goto L76
        L6c:
            java.util.List r0 = a.a.A0(r13)
            r12.getClass()
            qb.k.i(r0)
        L76:
            return
        L77:
            r4 = r6
            qb.k r4 = (qb.k) r4
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            boolean r3 = r1.f1267o
            r10 = r8
            b.e r10 = (b.e) r10
            r11 = r7
            java.util.List r11 = (java.util.List) r11
            qb.i r0 = r4.x(r9, r3)     // Catch: java.lang.Throwable -> L89
            goto L90
        L89:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L90:
            java.lang.Throwable r5 = sf.g.b(r0)
            if (r5 == 0) goto L9d
            ia.t r6 = r4.f10835b
            java.lang.String r7 = "合并语音失败"
            r6.invoke(r7, r5)
        L9d:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto La2
            goto La3
        La2:
            r2 = r0
        La3:
            r5 = r2
            qb.i r5 = (qb.i) r5
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            c9.m r2 = new c9.m
            r9 = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.f1260h
            java.util.concurrent.atomic.AtomicBoolean r6 = r1.f1263k
            wb.kv r7 = r1.f1261i
            android.app.Activity r8 = r1.f1262j
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.post(r2)
            return
        Lc1:
            java.util.List r6 = (java.util.List) r6
            r16 = r9
            fg.l r16 = (fg.l) r16
            r17 = r8
            java.lang.String r17 = (java.lang.String) r17
            r18 = r7
            java.lang.String r18 = (java.lang.String) r18
            android.os.Handler r0 = c9.b0.f1104a
            java.util.List r0 = c9.b0.b(r6)     // Catch: java.lang.Throwable -> Ld7
            r15 = r0
            goto Lde
        Ld7:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r15 = r2
        Lde:
            android.os.Handler r0 = c9.b0.f1104a
            c9.m r10 = new c9.m
            java.util.concurrent.atomic.AtomicBoolean r11 = r1.f1260h
            wb.kv r12 = r1.f1261i
            android.app.Activity r13 = r1.f1262j
            java.util.concurrent.atomic.AtomicBoolean r14 = r1.f1263k
            boolean r2 = r1.f1267o
            r19 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.post(r10)
            return
        Lf5:
            r6 = r9
            fg.l r6 = (fg.l) r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r7 = (java.lang.String) r7
            r5.set(r3)
            r4.close()
            android.app.Activity r4 = r1.f1262j
            android.view.Window r0 = r4.getWindow()
            if (r0 == 0) goto L123
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L123
            c9.p r2 = new c9.p
            java.util.concurrent.atomic.AtomicBoolean r3 = r1.f1263k
            java.lang.Object r5 = r1.f1268p
            boolean r9 = r1.f1267o
            r20 = r8
            r8 = r7
            r7 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.postOnAnimation(r2)
        L123:
            return
    }
}
