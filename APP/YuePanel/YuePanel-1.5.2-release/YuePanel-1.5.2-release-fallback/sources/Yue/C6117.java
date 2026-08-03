package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡ۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6117 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ void m22935(Yue.AbstractC6111 r0, Yue.C6118 r1, java.lang.String r2) {
            m22937(r0, r1, r2)
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String m22936(long r12) {
            r0 = -999500000(0xffffffffc46cd720, double:NaN)
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            java.lang.String r1 = " s "
            r2 = 1000000000(0x3b9aca00, float:0.0047237873)
            r3 = 500000000(0x1dcd6500, float:5.436748E-21)
            if (r0 > 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r3 = (long) r3
            long r12 = r12 - r3
            long r2 = (long) r2
            long r12 = r12 / r2
            r0.append(r12)
            r0.append(r1)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L24:
            r4 = -999500(0xfffffffffff0bfb4, double:NaN)
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            java.lang.String r4 = " ms"
            r5 = 1000000(0xf4240, float:1.401298E-39)
            r6 = 500000(0x7a120, float:7.00649E-40)
            if (r0 > 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r6
            long r12 = r12 - r1
            long r1 = (long) r5
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r4)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L47:
            r7 = 0
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            java.lang.String r7 = " µs"
            r8 = 1000(0x3e8, float:1.401E-42)
            r9 = 500(0x1f4, float:7.0E-43)
            if (r0 > 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r9
            long r12 = r12 - r1
            long r1 = (long) r8
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r7)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L67:
            r10 = 999500(0xf404c, double:4.938186E-318)
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 >= 0) goto L82
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r9
            long r12 = r12 + r1
            long r1 = (long) r8
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r7)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L82:
            r7 = 999500000(0x3b9328e0, double:4.93818613E-315)
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 >= 0) goto L9d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = (long) r6
            long r12 = r12 + r1
            long r1 = (long) r5
            long r12 = r12 / r1
            r0.append(r12)
            r0.append(r4)
            java.lang.String r12 = r0.toString()
            goto Lb0
        L9d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r3 = (long) r3
            long r12 = r12 + r3
            long r2 = (long) r2
            long r12 = r12 / r2
            r0.append(r12)
            r0.append(r1)
            java.lang.String r12 = r0.toString()
        Lb0:
            Yue.ۥۢ۠ۡ۟ r13 = Yue.C5968.f21745
            r13 = 1
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r13)
            java.lang.String r13 = "%6s"
            java.lang.String r12 = java.lang.String.format(r13, r12)
            java.lang.String r13 = "format(format, *args)"
            Yue.C3329.m13905(r12, r13)
            return r12
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m22937(Yue.AbstractC6111 r2, Yue.C6118 r3, java.lang.String r4) {
            Yue.ۥۢۡ۟ۢ$ۥ۟ r0 = Yue.C6122.f22072
            java.util.logging.Logger r0 = r0.m22977()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.m22949()
            r1.append(r3)
            r3 = 32
            r1.append(r3)
            Yue.ۥۢ۠ۡ۟ r3 = Yue.C5968.f21745
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r4 = "%-22s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            java.lang.String r4 = "format(format, *args)"
            Yue.C3329.m13905(r3, r4)
            r1.append(r3)
            java.lang.String r3 = ": "
            r1.append(r3)
            java.lang.String r2 = r2.m22927()
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.fine(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m22938(@Yue.InterfaceC4418 Yue.AbstractC6111 r6, @Yue.InterfaceC4418 Yue.C6118 r7, @Yue.InterfaceC4418 Yue.InterfaceC2823<? extends T> r8) {
            java.lang.String r0 = "task"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "queue"
            Yue.C3329.m13906(r7, r0)
            java.lang.String r0 = "block"
            Yue.C3329.m13906(r8, r0)
            Yue.ۥۢۡ۟ۢ$ۥ۟ r0 = Yue.C6122.f22072
            java.util.logging.Logger r0 = r0.m22977()
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L2f
            Yue.ۥۢۡ۟ۢ r1 = r7.m22952()
            Yue.ۥۢۡ۟ۢ$ۥ r1 = r1.m22969()
            long r1 = r1.mo22975()
            java.lang.String r3 = "starting"
            m22935(r6, r7, r3)
            goto L31
        L2f:
            r1 = -1
        L31:
            r3 = 1
            java.lang.Object r8 = r8.invoke()     // Catch: java.lang.Throwable -> L64
            Yue.C3249.m13687(r3)
            if (r0 == 0) goto L60
            Yue.ۥۢۡ۟ۢ r0 = r7.m22952()
            Yue.ۥۢۡ۟ۢ$ۥ r0 = r0.m22969()
            long r4 = r0.mo22975()
            long r4 = r4 - r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "finished run in "
            r0.append(r1)
            java.lang.String r1 = m22936(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m22935(r6, r7, r0)
        L60:
            Yue.C3249.m13686(r3)
            return r8
        L64:
            r8 = move-exception
            Yue.C3249.m13687(r3)
            if (r0 == 0) goto L8f
            Yue.ۥۢۡ۟ۢ r0 = r7.m22952()
            Yue.ۥۢۡ۟ۢ$ۥ r0 = r0.m22969()
            long r4 = r0.mo22975()
            long r4 = r4 - r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "failed a run in "
            r0.append(r1)
            java.lang.String r1 = m22936(r4)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m22935(r6, r7, r0)
        L8f:
            Yue.C3249.m13686(r3)
            throw r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final void m22939(@Yue.InterfaceC4418 Yue.AbstractC6111 r2, @Yue.InterfaceC4418 Yue.C6118 r3, @Yue.InterfaceC4418 Yue.InterfaceC2823<java.lang.String> r4) {
            java.lang.String r0 = "task"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "queue"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "messageBlock"
            Yue.C3329.m13906(r4, r0)
            Yue.ۥۢۡ۟ۢ$ۥ۟ r0 = Yue.C6122.f22072
            java.util.logging.Logger r0 = r0.m22977()
            java.util.logging.Level r1 = java.util.logging.Level.FINE
            boolean r0 = r0.isLoggable(r1)
            if (r0 == 0) goto L26
            java.lang.Object r4 = r4.invoke()
            java.lang.String r4 = (java.lang.String) r4
            m22935(r2, r3, r4)
        L26:
            return
    }
}
