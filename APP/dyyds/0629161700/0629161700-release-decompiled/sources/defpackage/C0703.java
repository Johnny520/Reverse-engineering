package defpackage;

/* JADX INFO: renamed from: ᛴᛷᛳᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0703 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.Object f3353;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f3354;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public boolean f3355;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f3356;

    public C0703(defpackage.C0246 r1, defpackage.C0251 r2) {
            r0 = this;
            r0.<init>()
            r0.f3353 = r1
            r0.f3356 = r2
            boolean r2 = r2.f1462
            if (r2 == 0) goto Ld
            r1 = 0
            goto L11
        Ld:
            int r1 = r1.f1442
            boolean[] r1 = new boolean[r1]
        L11:
            r0.f3354 = r1
            return
    }

    public C0703(defpackage.C1065 r1, defpackage.InterfaceC0845 r2, defpackage.InterfaceC1559 r3) {
            r0 = this;
            r0.<init>()
            r0.f3356 = r1
            r0.f3354 = r2
            r0.f3353 = r3
            return
    }

    public C0703(defpackage.C2243 r2, defpackage.C1314 r3) {
            r1 = this;
            r1.<init>()
            ᛷᛴᛱᛸ r0 = new ᛷᛴᛱᛸ
            r0.<init>(r1)
            r1.f3353 = r0
            r1.f3354 = r2
            r1.f3356 = r3
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.io.IOException m1592(defpackage.C0703 r11, boolean r12, java.io.IOException r13, int r14) {
            r0 = r14 & 4
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r14 = r14 & 8
            if (r14 == 0) goto Lf
            r14 = r2
            goto L10
        Lf:
            r14 = r1
        L10:
            if (r13 == 0) goto L15
            r11.m1599(r13)
        L15:
            if (r14 == 0) goto L26
            java.lang.Object r3 = r11.f3356
            ᛶᛴᲈ r3 = (defpackage.C1065) r3
            ᛳᛳᲀᲁ r3 = r3.f4740
            if (r13 == 0) goto L23
            r3.getClass()
            goto L26
        L23:
            r3.getClass()
        L26:
            if (r0 == 0) goto L37
            java.lang.Object r3 = r11.f3356
            ᛶᛴᲈ r3 = (defpackage.C1065) r3
            ᛳᛳᲀᲁ r3 = r3.f4740
            if (r13 == 0) goto L34
            r3.getClass()
            goto L37
        L34:
            r3.getClass()
        L37:
            java.lang.Object r3 = r11.f3356
            r4 = r3
            ᛶᛴᲈ r4 = (defpackage.C1065) r4
            if (r14 == 0) goto L42
            if (r12 != 0) goto L42
            r6 = r1
            goto L43
        L42:
            r6 = r2
        L43:
            if (r0 == 0) goto L49
            if (r12 != 0) goto L49
            r7 = r1
            goto L4a
        L49:
            r7 = r2
        L4a:
            if (r14 == 0) goto L50
            if (r12 == 0) goto L50
            r9 = r1
            goto L51
        L50:
            r9 = r2
        L51:
            if (r0 == 0) goto L59
            if (r12 == 0) goto L59
            r8 = r1
        L56:
            r5 = r11
            r10 = r13
            goto L5b
        L59:
            r8 = r2
            goto L56
        L5b:
            java.io.IOException r11 = r4.m2026(r5, r6, r7, r8, r9, r10)
            return r11
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public defpackage.C0682 m1593() {
            r3 = this;
            java.lang.Object r0 = r3.f3356
            ᛶᛴᲈ r0 = (defpackage.C1065) r0
            boolean r1 = r0.f4726
            if (r1 != 0) goto L69
            r1 = 1
            r0.f4726 = r1
            ᛵᛴᲇᲈ r2 = r0.f4742
            r2.m3419()
            monitor-enter(r0)
            ᛴᛷᛳᲀ r2 = r0.f4729     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L5f
            boolean r2 = r0.f4741     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L57
            boolean r2 = r0.f4738     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L57
            boolean r2 = r0.f4737     // Catch: java.lang.Throwable -> L45
            if (r2 != 0) goto L4f
            boolean r2 = r0.f4730     // Catch: java.lang.Throwable -> L45
            if (r2 == 0) goto L47
            r2 = 0
            r0.f4730 = r2     // Catch: java.lang.Throwable -> L45
            r0.f4741 = r1     // Catch: java.lang.Throwable -> L45
            r0.f4738 = r1     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)
            java.lang.Object r0 = r3.f3353
            ᛸᲀᛷ r0 = (defpackage.InterfaceC1559) r0
            ᛳᲁᲀᲇ r0 = r0.mo1516()
            ᲁᛸᛲᛶ r0 = (defpackage.C1894) r0
            java.net.Socket r1 = r0.f8201
            r1.setSoTimeout(r2)
            r0.mo1355()
            ᛴᛵᲇᲇ r0 = new ᛴᛵᲇᲇ
            r0.<init>(r3)
            return r0
        L45:
            r3 = move-exception
            goto L67
        L47:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L45
            throw r3     // Catch: java.lang.Throwable -> L45
        L4f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L45
            throw r3     // Catch: java.lang.Throwable -> L45
        L57:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L45
            throw r3     // Catch: java.lang.Throwable -> L45
        L5f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "Check failed."
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L45
            throw r3     // Catch: java.lang.Throwable -> L45
        L67:
            monitor-exit(r0)
            throw r3
        L69:
            java.lang.String r3 = "Check failed."
            defpackage.C2264.m3676(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C1383 m1594(defpackage.C0569 r9) {
            r8 = this;
            java.lang.String r0 = "Content-Type"
            ᛱᛱᛷᛳ r1 = r9.f2820     // Catch: java.io.IOException -> L30
            java.lang.String r0 = r1.m324(r0)     // Catch: java.io.IOException -> L30
            if (r0 != 0) goto Lb
            r0 = 0
        Lb:
            java.lang.Object r1 = r8.f3353     // Catch: java.io.IOException -> L30
            ᛸᲀᛷ r1 = (defpackage.InterfaceC1559) r1     // Catch: java.io.IOException -> L30
            long r5 = r1.mo1505(r9)     // Catch: java.io.IOException -> L30
            java.lang.Object r1 = r8.f3353     // Catch: java.io.IOException -> L30
            ᛸᲀᛷ r1 = (defpackage.InterfaceC1559) r1     // Catch: java.io.IOException -> L30
            ᲈᛱᲇᛳ r4 = r1.mo1514(r9)     // Catch: java.io.IOException -> L30
            ᛴᲇᲀᲇ r2 = new ᛴᲇᲀᲇ     // Catch: java.io.IOException -> L30
            r7 = 0
            r3 = r8
            r2.<init>(r3, r4, r5, r7)     // Catch: java.io.IOException -> L2d
            ᛷᲇᛲᲇ r8 = new ᛷᲇᛲᲇ     // Catch: java.io.IOException -> L2d
            ᲈᛵᲈᛵ r9 = new ᲈᛵᲈᛵ     // Catch: java.io.IOException -> L2d
            r9.<init>(r2)     // Catch: java.io.IOException -> L2d
            r8.<init>(r0, r5, r9)     // Catch: java.io.IOException -> L2d
            return r8
        L2d:
            r0 = move-exception
        L2e:
            r8 = r0
            goto L33
        L30:
            r0 = move-exception
            r3 = r8
            goto L2e
        L33:
            java.lang.Object r9 = r3.f3356
            ᛶᛴᲈ r9 = (defpackage.C1065) r9
            ᛳᛳᲀᲁ r9 = r9.f4740
            r9.getClass()
            r3.m1599(r8)
            throw r8
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.io.File m1595() {
            r5 = this;
            java.lang.Object r0 = r5.f3353
            ᛲᛲᛳᛳ r0 = (defpackage.C0246) r0
            monitor-enter(r0)
            java.lang.Object r1 = r5.f3356     // Catch: java.lang.Throwable -> L1a
            ᛲᛲᛵᛱ r1 = (defpackage.C0251) r1     // Catch: java.lang.Throwable -> L1a
            ᛴᛷᛳᲀ r2 = r1.f1467     // Catch: java.lang.Throwable -> L1a
            if (r2 != r5) goto L2b
            boolean r2 = r1.f1462     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            if (r2 != 0) goto L1c
            java.lang.Object r2 = r5.f3354     // Catch: java.lang.Throwable -> L1a
            boolean[] r2 = (boolean[]) r2     // Catch: java.lang.Throwable -> L1a
            r4 = 1
            r2[r3] = r4     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r5 = move-exception
            goto L31
        L1c:
            java.io.File[] r1 = r1.f1463     // Catch: java.lang.Throwable -> L1a
            r1 = r1[r3]     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r5 = r5.f3353     // Catch: java.lang.Throwable -> L1a
            ᛲᛲᛳᛳ r5 = (defpackage.C0246) r5     // Catch: java.lang.Throwable -> L1a
            java.io.File r5 = r5.f1447     // Catch: java.lang.Throwable -> L1a
            r5.mkdirs()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            return r1
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r5.<init>()     // Catch: java.lang.Throwable -> L1a
            throw r5     // Catch: java.lang.Throwable -> L1a
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C1894 m1596() {
            r2 = this;
            java.lang.Object r2 = r2.f3353
            ᛸᲀᛷ r2 = (defpackage.InterfaceC1559) r2
            ᛳᲁᲀᲇ r2 = r2.mo1516()
            boolean r0 = r2 instanceof defpackage.C1894
            r1 = 0
            if (r0 == 0) goto L10
            ᲁᛸᛲᛶ r2 = (defpackage.C1894) r2
            goto L11
        L10:
            r2 = r1
        L11:
            if (r2 == 0) goto L14
            return r2
        L14:
            java.lang.String r2 = "no connection for CONNECT tunnels"
            defpackage.C2264.m3676(r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m1597() {
            r2 = this;
            java.lang.Object r0 = r2.f3353
            ᛲᛲᛳᛳ r0 = (defpackage.C0246) r0
            r1 = 0
            r0.m871(r2, r1)
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0147 m1598(boolean r2) {
            r1 = this;
            java.lang.Object r0 = r1.f3353     // Catch: java.io.IOException -> Ld
            ᛸᲀᛷ r0 = (defpackage.InterfaceC1559) r0     // Catch: java.io.IOException -> Ld
            ᛱᛸᛵᲁ r2 = r0.mo1513(r2)     // Catch: java.io.IOException -> Ld
            if (r2 == 0) goto Lf
            r2.f1108 = r1     // Catch: java.io.IOException -> Ld
            return r2
        Ld:
            r2 = move-exception
            goto L10
        Lf:
            return r2
        L10:
            java.lang.Object r0 = r1.f3356
            ᛶᛴᲈ r0 = (defpackage.C1065) r0
            ᛳᛳᲀᲁ r0 = r0.f4740
            r0.getClass()
            r1.m1599(r2)
            throw r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public void m1599(java.io.IOException r2) {
            r1 = this;
            r0 = 1
            r1.f3355 = r0
            java.lang.Object r0 = r1.f3353
            ᛸᲀᛷ r0 = (defpackage.InterfaceC1559) r0
            ᛳᲁᲀᲇ r0 = r0.mo1516()
            java.lang.Object r1 = r1.f3356
            ᛶᛴᲈ r1 = (defpackage.C1065) r1
            r0.mo1356(r1, r2)
            return
    }
}
