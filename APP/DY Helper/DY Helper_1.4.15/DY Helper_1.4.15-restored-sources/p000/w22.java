package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class w22 {

    /* JADX INFO: renamed from: α */
    public final p000.x22 f11548;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f11549;

    /* JADX INFO: renamed from: γ */
    public boolean f11550;

    /* JADX INFO: renamed from: δ */
    public p000.t22 f11551;

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f11552;

    /* JADX INFO: renamed from: ζ */
    public boolean f11553;

    public w22(p000.x22 r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f11548 = r1
            r0.f11549 = r2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f11552 = r1
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m6309(p000.w22 r1, java.lang.String r2, p000.p70 r3) {
            r1.getClass()
            r2.getClass()
            r3.getClass()
            wk1 r0 = new wk1
            r0.<init>(r2, r3)
            r2 = 0
            r1.m6311(r0, r2)
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.f11549
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final boolean m6310() {
            r6 = this;
            t22 r0 = r6.f11551
            r1 = 1
            if (r0 == 0) goto Lb
            boolean r0 = r0.f10140
            if (r0 == 0) goto Lb
            r6.f11553 = r1
        Lb:
            java.util.ArrayList r0 = r6.f11552
            int r2 = r0.size()
            int r2 = r2 - r1
            r3 = 0
        L13:
            r4 = -1
            if (r4 >= r2) goto L3e
            java.lang.Object r4 = r0.get(r2)
            t22 r4 = (p000.t22) r4
            boolean r4 = r4.f10140
            if (r4 == 0) goto L3b
            x22 r3 = r6.f11548
            java.util.logging.Logger r3 = r3.f12010
            java.lang.Object r4 = r0.get(r2)
            t22 r4 = (p000.t22) r4
            java.util.logging.Level r5 = java.util.logging.Level.FINE
            boolean r5 = r3.isLoggable(r5)
            if (r5 == 0) goto L37
            java.lang.String r5 = "canceled"
            p000.p91.m4417(r3, r4, r6, r5)
        L37:
            r0.remove(r2)
            r3 = r1
        L3b:
            int r2 = r2 + (-1)
            goto L13
        L3e:
            return r3
    }

    /* JADX INFO: renamed from: γ */
    public final void m6311(p000.t22 r3, long r4) {
            r2 = this;
            r3.getClass()
            x22 r0 = r2.f11548
            monitor-enter(r0)
            boolean r1 = r2.f11550     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L37
            boolean r4 = r3.f10140     // Catch: java.lang.Throwable -> L20
            x22 r5 = r2.f11548
            java.util.logging.Logger r5 = r5.f12010
            if (r4 == 0) goto L24
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L20
            boolean r4 = r5.isLoggable(r4)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L22
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            p000.p91.m4417(r5, r3, r2, r4)     // Catch: java.lang.Throwable -> L20
            goto L22
        L20:
            r2 = move-exception
            goto L45
        L22:
            monitor-exit(r0)
            return
        L24:
            java.util.logging.Level r4 = java.util.logging.Level.FINE     // Catch: java.lang.Throwable -> L20
            boolean r4 = r5.isLoggable(r4)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L31
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            p000.p91.m4417(r5, r3, r2, r4)     // Catch: java.lang.Throwable -> L20
        L31:
            java.util.concurrent.RejectedExecutionException r2 = new java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L20
            r2.<init>()     // Catch: java.lang.Throwable -> L20
            throw r2     // Catch: java.lang.Throwable -> L20
        L37:
            r1 = 0
            boolean r3 = r2.m6312(r3, r4, r1)     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L43
            x22 r3 = r2.f11548     // Catch: java.lang.Throwable -> L20
            r3.m6508(r2)     // Catch: java.lang.Throwable -> L20
        L43:
            monitor-exit(r0)
            return
        L45:
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: δ */
    public final boolean m6312(p000.t22 r12, long r13, boolean r15) {
            r11 = this;
            x22 r0 = r11.f11548
            java.util.logging.Logger r0 = r0.f12010
            r12.getClass()
            w22 r1 = r12.f10141
            if (r1 != r11) goto Lc
            goto L10
        Lc:
            if (r1 != 0) goto L88
            r12.f10141 = r11
        L10:
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.f11552
            int r6 = r5.indexOf(r12)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L37
            long r9 = r12.f10142
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L34
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L87
            java.lang.String r13 = "already scheduled"
            p000.p91.m4417(r0, r12, r11, r13)
            return r7
        L34:
            r5.remove(r6)
        L37:
            r12.f10142 = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L5d
            if (r15 == 0) goto L4f
            long r3 = r3 - r1
            java.lang.String r15 = p000.p91.m4427(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L5a
        L4f:
            long r3 = r3 - r1
            java.lang.String r15 = p000.p91.m4427(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L5a:
            p000.p91.m4417(r0, r12, r11, r15)
        L5d:
            java.util.Iterator r11 = r5.iterator()
            r15 = r7
        L62:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r11.next()
            t22 r0 = (p000.t22) r0
            long r3 = r0.f10142
            long r3 = r3 - r1
            int r0 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r0 <= 0) goto L76
            goto L7a
        L76:
            int r15 = r15 + 1
            goto L62
        L79:
            r15 = r8
        L7a:
            if (r15 != r8) goto L80
            int r15 = r5.size()
        L80:
            r5.add(r15, r12)
            if (r15 != 0) goto L87
            r11 = 1
            return r11
        L87:
            return r7
        L88:
            java.lang.String r11 = "task is in multiple queues"
            p000.C1080.m7279(r11)
            r11 = 0
            return r11
    }

    /* JADX INFO: renamed from: ε */
    public final void m6313() {
            r2 = this;
            x22 r0 = r2.f11548
            java.util.TimeZone r1 = p000.ud2.f10709
            monitor-enter(r0)
            r1 = 1
            r2.f11550 = r1     // Catch: java.lang.Throwable -> L14
            boolean r1 = r2.m6310()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L16
            x22 r1 = r2.f11548     // Catch: java.lang.Throwable -> L14
            r1.m6508(r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r2 = move-exception
            goto L18
        L16:
            monitor-exit(r0)
            return
        L18:
            monitor-exit(r0)
            throw r2
    }
}
