package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f1300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1306n;

    public /* synthetic */ p(java.lang.Object r1, boolean r2, java.util.concurrent.atomic.AtomicBoolean r3, java.util.concurrent.atomic.AtomicBoolean r4, wb.kv r5, android.app.Activity r6, fg.l r7, int r8) {
            r0 = this;
            r0.f1299g = r8
            r0.f1303k = r1
            r0.f1300h = r2
            r0.f1301i = r3
            r0.f1304l = r4
            r0.f1305m = r5
            r0.f1302j = r6
            r0.f1306n = r7
            r0.<init>()
            return
    }

    public /* synthetic */ p(java.util.concurrent.atomic.AtomicBoolean r2, android.app.Activity r3, java.lang.Object r4, fg.l r5, java.lang.String r6, java.lang.String r7, boolean r8) {
            r1 = this;
            r0 = 0
            r1.f1299g = r0
            r1.<init>()
            r1.f1301i = r2
            r1.f1302j = r3
            r1.f1303k = r4
            r1.f1304l = r5
            r1.f1305m = r6
            r1.f1306n = r7
            r1.f1300h = r8
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r13 = this;
            int r0 = r13.f1299g
            switch(r0) {
                case 0: goto L6d;
                case 1: goto L39;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r13.f1303k
            r8 = r0
            hb.i0 r8 = (hb.i0) r8
            boolean r0 = r13.f1300h
            java.util.concurrent.atomic.AtomicBoolean r2 = r13.f1301i
            java.lang.Object r1 = r13.f1304l
            r3 = r1
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Object r1 = r13.f1305m
            r4 = r1
            wb.kv r4 = (wb.kv) r4
            android.app.Activity r5 = r13.f1302j
            java.lang.Object r1 = r13.f1306n
            r7 = r1
            hb.x r7 = (hb.x) r7
            hb.l r1 = hb.m.f5433a     // Catch: java.lang.Throwable -> L27
            java.util.List r0 = hb.m.c(r0)     // Catch: java.lang.Throwable -> L27
            r6 = r0
            goto L2e
        L27:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r6 = r1
        L2e:
            android.os.Handler r0 = r8.f5402c
            ca.j r1 = new ca.j
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.post(r1)
            return
        L39:
            java.lang.Object r0 = r13.f1303k
            r8 = r0
            ca.e0 r8 = (ca.e0) r8
            boolean r0 = r13.f1300h
            java.util.concurrent.atomic.AtomicBoolean r2 = r13.f1301i
            java.lang.Object r1 = r13.f1304l
            r3 = r1
            java.util.concurrent.atomic.AtomicBoolean r3 = (java.util.concurrent.atomic.AtomicBoolean) r3
            java.lang.Object r1 = r13.f1305m
            r4 = r1
            wb.kv r4 = (wb.kv) r4
            android.app.Activity r5 = r13.f1302j
            java.lang.Object r1 = r13.f1306n
            r7 = r1
            ca.l r7 = (ca.l) r7
            hb.l r1 = hb.m.f5433a     // Catch: java.lang.Throwable -> L5b
            java.util.List r0 = hb.m.c(r0)     // Catch: java.lang.Throwable -> L5b
            r6 = r0
            goto L62
        L5b:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r6 = r1
        L62:
            android.os.Handler r0 = r8.f1484d
            ca.j r1 = new ca.j
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.post(r1)
            return
        L6d:
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.f1301i
            android.app.Activity r1 = r13.f1302j
            java.lang.Object r12 = r13.f1303k
            java.lang.Object r2 = r13.f1304l
            r3 = r2
            fg.l r3 = (fg.l) r3
            java.lang.Object r2 = r13.f1305m
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r13.f1306n
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            boolean r10 = r13.f1300h
            android.os.Handler r2 = c9.b0.f1104a
            boolean r0 = r0.get()
            if (r0 != 0) goto Ld0
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto Ld0
            boolean r0 = r1.isDestroyed()
            if (r0 == 0) goto L99
            goto Ld0
        L99:
            boolean r0 = r12 instanceof sf.f
            if (r0 != 0) goto Lba
            r2 = r12
            java.util.List r2 = (java.util.List) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lac
            java.lang.String r0 = "没有可选择的会话"
            c9.b0.h(r1, r0)
            goto Lba
        Lac:
            bi.c r4 = new bi.c
            r0 = 6
            r4.<init>(r0)
            r9 = 0
            r11 = 2944(0xb80, float:4.125E-42)
            r7 = 1
            r8 = 0
            wb.y2.U1(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        Lba:
            java.lang.Throwable r0 = sf.g.b(r12)
            if (r0 == 0) goto Ld0
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = "[Hchat:ConversationGroup] "
            java.lang.String r4 = " 读取会话失败: "
            eh.a.w(r3, r5, r4, r2, r0)
            java.lang.String r0 = "读取会话失败"
            c9.b0.h(r1, r0)
        Ld0:
            return
    }
}
