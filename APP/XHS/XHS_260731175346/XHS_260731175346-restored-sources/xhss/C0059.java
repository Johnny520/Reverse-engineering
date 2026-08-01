package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛷᛴᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0059 extends xhss.AbstractC1202 implements xhss.InterfaceC0517 {

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0259 f338;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f339;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f340;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.String f341;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f342;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f343;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f344;

    public C0059(java.lang.Object r1, java.lang.Object r2, java.lang.String r3, java.lang.String r4, android.content.Context r5, xhss.InterfaceC0038 r6) {
            r0 = this;
            r0.f342 = r1
            r0.f340 = r2
            r0.f339 = r3
            r0.f341 = r4
            r0.f344 = r5
            r0.<init>(r6)
            return
    }

    @Override // xhss.InterfaceC0517
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final java.lang.Object mo115(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            xhss.ᛲᛸᲁᲇ r1 = (xhss.InterfaceC0197) r1
            xhss.ᛱᛴᛶᛴ r2 = (xhss.InterfaceC0038) r2
            xhss.ᛱᛴᛶᛴ r0 = r0.mo117(r1, r2)
            xhss.ᛱᛷᛴᲀ r0 = (xhss.C0059) r0
            xhss.ᛵᛷᲈᛶ r1 = xhss.C0500.f1817
            java.lang.Object r0 = r0.mo116(r1)
            return r0
    }

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᛸᛲᲀᛵ */
    public final java.lang.Object mo116(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f343
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 != r1) goto L16
            xhss.ᛳᛴᛵ r9 = r9.f338
            xhss.C0614.m1058(r10)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            goto La1
        Le:
            r0 = move-exception
            r10 = r0
            goto L117
        L12:
            r0 = move-exception
            r10 = r0
            goto Ld0
        L16:
            r9 = -257591125313605(0xffff15b8e47a77bb, double:NaN)
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            xhss.C0532.m950(r9)
            r9 = 0
            return r9
        L24:
            xhss.C0614.m1058(r10)
            r2 = -257359197079621(0xffff15eee47a77bb, double:NaN)
            java.lang.String r10 = "保存中"
            xhss.ᛳᛴᛵ r10 = xhss.C0259.m568(r10)
            java.lang.Object r0 = r9.f342     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            if (r0 == 0) goto L5e
            xhss.ᲇᲁᛱᛸ r2 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r3 = -257376376948805(0xffff15eae47a77bb, double:NaN)
            java.lang.String r3 = "jpg"     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.lang.Object r4 = r9.f340     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r2.getClass()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.io.File r0 = xhss.C1085.m1759(r0, r3, r4)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
        L4c:
            r6 = r0
            goto L7e
        L4e:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L117
        L53:
            r8 = r10
            r10 = r9
            r9 = r8
            goto Ld0
        L58:
            r0 = move-exception
            r9 = r0
            goto L4e
        L5b:
            r0 = move-exception
            r9 = r0
            goto L53
        L5e:
            xhss.ᲇᲁᛱᛸ r0 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r2 = -257393556817989(0xffff15e6e47a77bb, double:NaN)
            java.lang.String r2 = "xhs_live_"     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r3 = -257436506490949(0xffff15dce47a77bb, double:NaN)
            java.lang.String r3 = "jpg"     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r0.getClass()     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.lang.String r0 = xhss.C1085.m1767(r2, r3)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.io.File r0 = xhss.C1085.m1757(r0)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            goto L4c
        L7e:
            java.lang.String r4 = r9.f339     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.lang.String r5 = r9.f341     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            android.content.Context r3 = r9.f344     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r9.f338 = r10     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r9.f343 = r1     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            xhss.ᛴᲇᲈᛲ r2 = new xhss.ᛴᲇᲈᛲ     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            xhss.ᛴᛱᛶᛸ r0 = new xhss.ᛴᛱᛶᛸ     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            xhss.ᛴᛵᛳᛵ r1 = r9.f2508     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            r0.<init>(r1, r9)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            java.lang.Object r9 = xhss.AbstractC0955.m1555(r0, r0, r2)     // Catch: java.lang.Throwable -> L58 java.lang.Exception -> L5b
            xhss.ᛸᛴᛸᲈ r0 = xhss.EnumC0757.f2533
            if (r9 != r0) goto L9e
            return r0
        L9e:
            r8 = r10
            r10 = r9
            r9 = r8
        La1:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            if (r10 == 0) goto Lbb
            xhss.ᲇᲁᛱᛸ r10 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            r0 = -257453686360133(0xffff15d8e47a77bb, double:NaN)
            java.lang.String r0 = "保存成功"     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            r10.getClass()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            xhss.C1085.m1766(r0)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            goto Lcc
        Lbb:
            xhss.ᲇᲁᛱᛸ r10 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            r0 = -257475161196613(0xffff15d3e47a77bb, double:NaN)
            java.lang.String r0 = "保存失败"     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            r10.getClass()     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
            xhss.C1085.m1766(r0)     // Catch: java.lang.Throwable -> Le java.lang.Exception -> L12
        Lcc:
            r9.m571()
            goto L114
        Ld0:
            r0 = -257496636033093(0xffff15cee47a77bb, double:NaN)
            java.lang.String r0 = "saveLive error"     // Catch: java.lang.Throwable -> Le
            r1 = -278279982778437(0xffff02e7e47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Throwable -> Le
            r1 = -278314342516805(0xffff02dfe47a77bb, double:NaN)
        /* removed unused decoded string */ // Catch: java.lang.Throwable -> Le
            xhss.ᲇᲁᛱᛸ r1 = xhss.C1085.f3497     // Catch: java.lang.Throwable -> Le
            r1.getClass()     // Catch: java.lang.Throwable -> Le
            xhss.C1085.m1764(r0, r10)     // Catch: java.lang.Throwable -> Le
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le
            r0.<init>()     // Catch: java.lang.Throwable -> Le
            r2 = -257561060542533(0xffff15bfe47a77bb, double:NaN)
            java.lang.String r2 = "保存失败: "     // Catch: java.lang.Throwable -> Le
            r0.append(r2)     // Catch: java.lang.Throwable -> Le
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> Le
            r0.append(r10)     // Catch: java.lang.Throwable -> Le
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> Le
            r1.getClass()     // Catch: java.lang.Throwable -> Le
            xhss.C1085.m1766(r10)     // Catch: java.lang.Throwable -> Le
            goto Lcc
        L114:
            xhss.ᛵᛷᲈᛶ r9 = xhss.C0500.f1817
            return r9
        L117:
            r9.m571()
            throw r10
    }

    @Override // xhss.AbstractC0631
    /* JADX INFO: renamed from: ᲀᲇᛳᲁ */
    public final xhss.InterfaceC0038 mo117(java.lang.Object r8, xhss.InterfaceC0038 r9) {
            r7 = this;
            xhss.ᛱᛷᛴᲀ r0 = new xhss.ᛱᛷᛴᲀ
            java.lang.String r4 = r7.f341
            android.content.Context r5 = r7.f344
            java.lang.Object r1 = r7.f342
            java.lang.Object r2 = r7.f340
            java.lang.String r3 = r7.f339
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }
}
