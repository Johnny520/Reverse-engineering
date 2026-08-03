package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1289g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f1290h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1291i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1292j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ aa.c f1293k;

    public /* synthetic */ o(android.app.Activity r1, java.lang.String r2, java.lang.String r3, aa.c r4, int r5) {
            r0 = this;
            r0.f1289g = r5
            r0.f1290h = r1
            r0.f1291i = r2
            r0.f1292j = r3
            r0.f1293k = r4
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r23) {
            r22 = this;
            r0 = r22
            int r1 = r0.f1289g
            sf.n r2 = sf.n.f12433a
            switch(r1) {
                case 0: goto L64;
                default: goto L9;
            }
        L9:
            r1 = r23
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            android.os.Handler r3 = c9.b0.f1104a
            android.app.Activity r3 = r0.f1290h
            if (r1 == 0) goto L5e
            java.lang.String r1 = r0.f1291i
            c9.a r4 = c9.b0.c(r3, r1)
            if (r4 == 0) goto L63
            java.util.concurrent.ConcurrentHashMap r1 = d9.o.f2133a
            java.lang.String r1 = r0.f1292j
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = ""
            if (r1 != 0) goto L30
            r1 = r5
        L30:
            int r6 = r1.length()
            r7 = 0
            if (r6 <= 0) goto L38
            goto L39
        L38:
            r1 = r7
        L39:
            if (r1 == 0) goto L43
            java.io.File r1 = d9.o.a(r3, r1)
            java.lang.String r7 = r1.getAbsolutePath()
        L43:
            if (r7 != 0) goto L47
            r12 = r5
            goto L48
        L47:
            r12 = r7
        L48:
            r15 = 0
            r16 = 3967(0xf7f, float:5.559E-42)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            c9.a r1 = c9.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            aa.c r4 = r0.f1293k
            c9.b0.j(r3, r1, r4)
            goto L63
        L5e:
            java.lang.String r1 = "头像设置失败"
            c9.b0.h(r3, r1)
        L63:
            return r2
        L64:
            r1 = r23
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            android.os.Handler r3 = c9.b0.f1104a
            android.app.Activity r5 = r0.f1290h
            java.lang.String r7 = r0.f1291i
            java.lang.String r6 = r0.f1292j
            aa.c r8 = r0.f1293k
            if (r1 != 0) goto L85
            c9.o r4 = new c9.o
            r9 = 1
            r4.<init>(r5, r6, r7, r8, r9)
            d9.f r1 = d9.f.f2096a
            r3 = 0
            r1.b(r5, r4, r7, r3)
            goto Lbd
        L85:
            boolean r1 = d9.o.g(r5, r7)
            java.lang.String r3 = "恢复默认头像失败"
            if (r1 != 0) goto L91
            c9.b0.h(r5, r3)
            goto Lbd
        L91:
            c9.a r9 = c9.b0.c(r5, r6)
            if (r9 == 0) goto Lbd
            r20 = 0
            r21 = 3967(0xf7f, float:5.559E-42)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r17 = ""
            r18 = 0
            r19 = 0
            c9.a r1 = c9.a.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = c9.o2.u(r5, r1)
            if (r1 == 0) goto Lb6
            r8.invoke()
        Lb6:
            if (r1 == 0) goto Lba
            java.lang.String r3 = "已恢复默认头像"
        Lba:
            c9.b0.h(r5, r3)
        Lbd:
            return r2
    }
}
