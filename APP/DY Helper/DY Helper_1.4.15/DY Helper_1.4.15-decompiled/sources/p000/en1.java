package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class en1 {

    /* JADX INFO: renamed from: α */
    public java.util.Set f3603;

    /* JADX INFO: renamed from: β */
    public p000.C0990xn f3604;

    /* JADX INFO: renamed from: γ */
    public final p000.k21 f3605;

    /* JADX INFO: renamed from: δ */
    public p000.c21 f3606;

    /* JADX INFO: renamed from: ε */
    public p000.k21 f3607;

    /* JADX INFO: renamed from: ζ */
    public final p000.k21 f3608;

    /* JADX INFO: renamed from: η */
    public final p000.k21 f3609;

    /* JADX INFO: renamed from: θ */
    public p000.c21 f3610;

    /* JADX INFO: renamed from: ι */
    public p000.b21 f3611;

    /* JADX INFO: renamed from: κ */
    public java.util.ArrayList f3612;

    /* JADX INFO: renamed from: λ */
    public p000.c21 f3613;

    public en1() {
            r3 = this;
            r3.<init>()
            k21 r0 = new k21
            r1 = 16
            a90[] r2 = new p000.a90[r1]
            r0.<init>(r2)
            r3.f3605 = r0
            int r2 = p000.uq1.f10933
            c21 r2 = new c21
            r2.<init>()
            r3.f3606 = r2
            r3.f3607 = r0
            k21 r0 = new k21
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2)
            r3.f3608 = r0
            k21 r0 = new k21
            p70[] r1 = new p000.p70[r1]
            r0.<init>(r1)
            r3.f3609 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m1937() {
            r3 = this;
            r0 = 0
            r3.f3603 = r0
            r3.f3604 = r0
            k21 r1 = r3.f3605
            r1.m3132()
            c21 r2 = r3.f3606
            r2.m1108()
            r3.f3607 = r1
            k21 r1 = r3.f3608
            r1.m3132()
            k21 r1 = r3.f3609
            r1.m3132()
            r3.f3610 = r0
            r3.f3611 = r0
            r3.f3612 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final void m1938() {
            r1 = this;
            java.util.Set r1 = r1.f3603
            if (r1 != 0) goto L5
            goto L33
        L5:
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L33
            java.lang.String r0 = "Compose:abandons"
            android.os.Trace.beginSection(r0)
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2e
        L17:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L2e
            fn1 r0 = (p000.fn1) r0     // Catch: java.lang.Throwable -> L2e
            r1.remove()     // Catch: java.lang.Throwable -> L2e
            r0.mo1782()     // Catch: java.lang.Throwable -> L2e
            goto L17
        L2a:
            android.os.Trace.endSection()
            return
        L2e:
            r1 = move-exception
            android.os.Trace.endSection()
            throw r1
        L33:
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m1939() {
            r6 = this;
            java.util.Set r0 = r6.f3603
            if (r0 != 0) goto L6
            goto La4
        L6:
            r1 = 0
            r6.f3613 = r1
            k21 r1 = r6.f3608
            int r2 = r1.f5718
            if (r2 == 0) goto L66
            java.lang.String r2 = "Compose:onForgotten"
            android.os.Trace.beginSection(r2)
            c21 r2 = r6.f3610     // Catch: java.lang.Throwable -> L61
            int r3 = r1.f5718     // Catch: java.lang.Throwable -> L61
            int r3 = r3 + (-1)
        L1a:
            r4 = -1
            if (r4 >= r3) goto L5d
            java.lang.Object[] r4 = r1.f5716     // Catch: java.lang.Throwable -> L61
            r4 = r4[r3]     // Catch: java.lang.Throwable -> L61
            boolean r5 = r4 instanceof p000.a90     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L33
            r5 = r4
            a90 r5 = (p000.a90) r5     // Catch: java.lang.Throwable -> L31
            fn1 r5 = r5.f145     // Catch: java.lang.Throwable -> L31
            r0.remove(r5)     // Catch: java.lang.Throwable -> L31
            r5.mo1783()     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r0 = move-exception
            goto L4f
        L33:
            boolean r5 = r4 instanceof p000.InterfaceC0291fn     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L4c
            if (r2 == 0) goto L46
            boolean r5 = r2.m1109(r4)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L46
            r5 = r4
            fn r5 = (p000.InterfaceC0291fn) r5     // Catch: java.lang.Throwable -> L31
            r5.mo407()     // Catch: java.lang.Throwable -> L31
            goto L4c
        L46:
            r5 = r4
            fn r5 = (p000.InterfaceC0291fn) r5     // Catch: java.lang.Throwable -> L31
            r5.mo409()     // Catch: java.lang.Throwable -> L31
        L4c:
            int r3 = r3 + (-1)
            goto L1a
        L4f:
            xn r6 = r6.f3604     // Catch: java.lang.Throwable -> L61
            if (r6 == 0) goto L5c
            p3 r1 = new p3     // Catch: java.lang.Throwable -> L61
            r2 = 3
            r1.<init>(r6, r2, r4)     // Catch: java.lang.Throwable -> L61
            p000.jx0.m3063(r0, r1)     // Catch: java.lang.Throwable -> L61
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L61
        L5d:
            android.os.Trace.endSection()
            goto L66
        L61:
            r6 = move-exception
            android.os.Trace.endSection()
            throw r6
        L66:
            k21 r0 = r6.f3605
            int r1 = r0.f5718
            if (r1 == 0) goto La4
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.util.Set r1 = r6.f3603     // Catch: java.lang.Throwable -> L9f
            if (r1 != 0) goto L76
            goto L9b
        L76:
            java.lang.Object[] r2 = r0.f5716     // Catch: java.lang.Throwable -> L9f
            int r0 = r0.f5718     // Catch: java.lang.Throwable -> L9f
            r3 = 0
        L7b:
            if (r3 >= r0) goto L9b
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L9f
            a90 r4 = (p000.a90) r4     // Catch: java.lang.Throwable -> L9f
            fn1 r5 = r4.f145     // Catch: java.lang.Throwable -> L9f
            r1.remove(r5)     // Catch: java.lang.Throwable -> L9f
            r5.mo1781()     // Catch: java.lang.Throwable -> L8c
            int r3 = r3 + 1
            goto L7b
        L8c:
            r0 = move-exception
            xn r6 = r6.f3604     // Catch: java.lang.Throwable -> L9f
            if (r6 == 0) goto L9a
            p3 r1 = new p3     // Catch: java.lang.Throwable -> L9f
            r2 = 3
            r1.<init>(r6, r2, r4)     // Catch: java.lang.Throwable -> L9f
            p000.jx0.m3063(r0, r1)     // Catch: java.lang.Throwable -> L9f
        L9a:
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9b:
            android.os.Trace.endSection()
            return
        L9f:
            r6 = move-exception
            android.os.Trace.endSection()
            throw r6
        La4:
            return
    }

    /* JADX INFO: renamed from: δ */
    public final void m1940(p000.a90 r5) {
            r4 = this;
            c21 r0 = r4.f3606
            boolean r0 = r0.m1109(r5)
            if (r0 == 0) goto L3f
            c21 r0 = r4.f3606
            r0.m1117(r5)
            k21 r0 = r4.f3607
            boolean r0 = r0.m3135(r5)
            if (r0 != 0) goto L34
            k21 r0 = r4.f3605
            boolean r1 = r0.m3135(r5)
            if (r1 == 0) goto L1e
            goto L34
        L1e:
            java.lang.Object[] r1 = r0.f5716
            int r0 = r0.f5718
            r2 = 0
        L23:
            if (r2 >= r0) goto L34
            r3 = r1[r2]
            a90 r3 = (p000.a90) r3
            fn1 r3 = r3.f145
            boolean r3 = r3 instanceof p000.ba1
            if (r3 != 0) goto L32
            int r2 = r2 + 1
            goto L23
        L32:
            r4 = 0
            throw r4
        L34:
            java.util.Set r4 = r4.f3603
            if (r4 != 0) goto L39
            goto L4a
        L39:
            fn1 r5 = r5.f145
            r4.add(r5)
            return
        L3f:
            c21 r0 = r4.f3613
            if (r0 == 0) goto L4b
            boolean r0 = r0.m1109(r5)
            if (r0 != 0) goto L4a
            goto L4b
        L4a:
            return
        L4b:
            k21 r4 = r4.f3608
            r4.m3127(r5)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m1941(java.util.Set r1, p000.C0990xn r2) {
            r0 = this;
            r0.m1937()
            r0.f3603 = r1
            r0.f3604 = r2
            return
    }
}
