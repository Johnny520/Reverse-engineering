package ca;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ca.e0 f1553h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f1554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ wb.kv f1555j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1557l;

    public /* synthetic */ q(ca.e0 r1, java.util.concurrent.atomic.AtomicBoolean r2, wb.kv r3, java.lang.String r4, android.app.Activity r5, int r6) {
            r0 = this;
            r0.f1552g = r6
            r0.f1553h = r1
            r0.f1554i = r2
            r0.f1555j = r3
            r0.f1556k = r4
            r0.f1557l = r5
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            int r0 = r10.f1552g
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r5 = r11.intValue()
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r6 = r12.intValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r3 = r13.booleanValue()
            switch(r0) {
                case 0: goto L2f;
                default: goto L17;
            }
        L17:
            ca.e0 r7 = r10.f1553h
            android.os.Handler r11 = r7.f1484d
            ca.v r0 = new ca.v
            r9 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.f1554i
            wb.kv r2 = r10.f1555j
            java.lang.String r4 = r10.f1556k
            android.app.Activity r8 = r10.f1557l
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.post(r0)
        L2c:
            sf.n r11 = sf.n.f12433a
            return r11
        L2f:
            ca.e0 r7 = r10.f1553h
            android.os.Handler r11 = r7.f1484d
            ca.v r0 = new ca.v
            r9 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r10.f1554i
            wb.kv r2 = r10.f1555j
            java.lang.String r4 = r10.f1556k
            android.app.Activity r8 = r10.f1557l
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r11.post(r0)
            goto L2c
    }
}
