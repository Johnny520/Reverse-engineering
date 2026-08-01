package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class x22 {

    /* JADX INFO: renamed from: λ */
    public static final java.util.logging.Logger f12007 = null;

    /* JADX INFO: renamed from: μ */
    public static final p000.x22 f12008 = null;

    /* JADX INFO: renamed from: α */
    public final p000.y21 f12009;

    /* JADX INFO: renamed from: β */
    public final java.util.logging.Logger f12010;

    /* JADX INFO: renamed from: γ */
    public int f12011;

    /* JADX INFO: renamed from: δ */
    public boolean f12012;

    /* JADX INFO: renamed from: ε */
    public long f12013;

    /* JADX INFO: renamed from: ζ */
    public int f12014;

    /* JADX INFO: renamed from: η */
    public int f12015;

    /* JADX INFO: renamed from: θ */
    public final java.util.ArrayList f12016;

    /* JADX INFO: renamed from: ι */
    public final java.util.ArrayList f12017;

    /* JADX INFO: renamed from: κ */
    public final p000.RunnableC0196d1 f12018;

    static {
            java.lang.Class<x22> r0 = p000.x22.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            r0.getClass()
            p000.x22.f12007 = r0
            x22 r0 = new x22
            y21 r1 = new y21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = p000.ud2.f10710
            java.lang.String r4 = " TaskRunner"
            java.lang.String r2 = p000.lz1.m3691(r2, r3, r4)
            td2 r10 = new td2
            r3 = 1
            r10.<init>(r2, r3)
            r1.<init>()
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.SynchronousQueue r9 = new java.util.concurrent.SynchronousQueue
            r9.<init>()
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 60
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            r3.<init>(r4, r5, r6, r8, r9, r10)
            r1.f12428 = r3
            r0.<init>(r1)
            p000.x22.f12008 = r0
            return
    }

    public x22(p000.y21 r2) {
            r1 = this;
            java.util.logging.Logger r0 = p000.x22.f12007
            r0.getClass()
            r1.<init>()
            r1.f12009 = r2
            r1.f12010 = r0
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.f12011 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f12016 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f12017 = r2
            d1 r2 = new d1
            r0 = 10
            r2.<init>(r0, r1)
            r1.f12018 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m6506(p000.x22 r4, p000.t22 r5, long r6, boolean r8) {
            java.util.TimeZone r0 = p000.ud2.f10709
            w22 r0 = r5.f10141
            r0.getClass()
            t22 r1 = r0.f11551
            if (r1 != r5) goto L3b
            boolean r1 = r0.f11553
            r2 = 0
            r0.f11553 = r2
            r2 = 0
            r0.f11551 = r2
            java.util.ArrayList r2 = r4.f12016
            r2.remove(r0)
            r2 = -1
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L28
            if (r1 != 0) goto L28
            boolean r1 = r0.f11550
            if (r1 != 0) goto L28
            r1 = 1
            r0.m6312(r5, r6, r1)
        L28:
            java.util.ArrayList r5 = r0.f11552
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L3a
            java.util.ArrayList r5 = r4.f12017
            r5.add(r0)
            if (r8 != 0) goto L3a
            r4.m6510()
        L3a:
            return
        L3b:
            java.lang.String r4 = "Check failed."
            p000.C1080.m7279(r4)
            return
    }

    /* JADX INFO: renamed from: β */
    public final p000.t22 m6507() {
            r17 = this;
            r1 = r17
            java.util.TimeZone r0 = p000.ud2.f10709
        L4:
            java.util.ArrayList r0 = r1.f12017
            boolean r2 = r0.isEmpty()
            r3 = 0
            if (r2 == 0) goto Lf
            goto L86
        Lf:
            long r4 = java.lang.System.nanoTime()
            java.util.Iterator r2 = r0.iterator()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = r3
        L1d:
            boolean r9 = r2.hasNext()
            r10 = 1
            r11 = 0
            r13 = 0
            if (r9 == 0) goto L4b
            java.lang.Object r9 = r2.next()
            w22 r9 = (p000.w22) r9
            java.util.ArrayList r9 = r9.f11552
            java.lang.Object r9 = r9.get(r13)
            t22 r9 = (p000.t22) r9
            long r14 = r9.f10142
            long r14 = r14 - r4
            long r14 = java.lang.Math.max(r11, r14)
            int r16 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r16 <= 0) goto L45
            long r6 = java.lang.Math.min(r14, r6)
            goto L1d
        L45:
            if (r8 == 0) goto L49
            r2 = r10
            goto L4c
        L49:
            r8 = r9
            goto L1d
        L4b:
            r2 = r13
        L4c:
            java.util.ArrayList r9 = r1.f12016
            if (r8 == 0) goto L78
            java.util.TimeZone r3 = p000.ud2.f10709
            r3 = -1
            r8.f10142 = r3
            w22 r3 = r8.f10141
            r3.getClass()
            java.util.ArrayList r4 = r3.f11552
            r4.remove(r8)
            r0.remove(r3)
            r3.f11551 = r8
            r9.add(r3)
            if (r2 != 0) goto L74
            boolean r2 = r1.f12012
            if (r2 != 0) goto L77
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L77
        L74:
            r1.m6510()
        L77:
            return r8
        L78:
            boolean r2 = r1.f12012
            if (r2 == 0) goto L87
            long r8 = r1.f12013
            long r8 = r8 - r4
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L86
            r1.notify()
        L86:
            return r3
        L87:
            r1.f12012 = r10
            long r4 = r4 + r6
            r1.f12013 = r4
            java.util.TimeZone r2 = p000.ud2.f10709     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Laa
            int r2 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r2 <= 0) goto La6
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r14 = r6 / r3
            long r3 = r3 * r14
            long r6 = r6 - r3
            int r3 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r3 > 0) goto L9f
            if (r2 <= 0) goto La6
        L9f:
            int r2 = (int) r6     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Laa
            r1.wait(r14, r2)     // Catch: java.lang.Throwable -> La4 java.lang.InterruptedException -> Laa
            goto La6
        La4:
            r0 = move-exception
            goto Lde
        La6:
            r1.f12012 = r13
            goto L4
        Laa:
            java.util.TimeZone r2 = p000.ud2.f10709     // Catch: java.lang.Throwable -> La4
            int r2 = r9.size()     // Catch: java.lang.Throwable -> La4
            int r2 = r2 - r10
        Lb1:
            r3 = -1
            if (r3 >= r2) goto Lc0
            java.lang.Object r3 = r9.get(r2)     // Catch: java.lang.Throwable -> La4
            w22 r3 = (p000.w22) r3     // Catch: java.lang.Throwable -> La4
            r3.m6310()     // Catch: java.lang.Throwable -> La4
            int r2 = r2 + (-1)
            goto Lb1
        Lc0:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> La4
            int r2 = r2 - r10
        Lc5:
            if (r3 >= r2) goto La6
            java.lang.Object r4 = r0.get(r2)     // Catch: java.lang.Throwable -> La4
            w22 r4 = (p000.w22) r4     // Catch: java.lang.Throwable -> La4
            r4.m6310()     // Catch: java.lang.Throwable -> La4
            java.util.ArrayList r4 = r4.f11552     // Catch: java.lang.Throwable -> La4
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La4
            if (r4 == 0) goto Ldb
            r0.remove(r2)     // Catch: java.lang.Throwable -> La4
        Ldb:
            int r2 = r2 + (-1)
            goto Lc5
        Lde:
            r1.f12012 = r13
            throw r0
    }

    /* JADX INFO: renamed from: γ */
    public final void m6508(p000.w22 r3) {
            r2 = this;
            r3.getClass()
            java.util.TimeZone r0 = p000.ud2.f10709
            t22 r0 = r3.f11551
            if (r0 != 0) goto L25
            java.util.ArrayList r0 = r3.f11552
            boolean r0 = r0.isEmpty()
            java.util.ArrayList r1 = r2.f12017
            if (r0 != 0) goto L22
            byte[] r0 = p000.sd2.f9867
            r1.getClass()
            boolean r0 = r1.contains(r3)
            if (r0 != 0) goto L25
            r1.add(r3)
            goto L25
        L22:
            r1.remove(r3)
        L25:
            boolean r3 = r2.f12012
            if (r3 == 0) goto L2d
            r2.notify()
            return
        L2d:
            r2.m6510()
            return
    }

    /* JADX INFO: renamed from: δ */
    public final p000.w22 m6509() {
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.f12011     // Catch: java.lang.Throwable -> L14
            int r1 = r0 + 1
            r3.f12011 = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            w22 r1 = new w22
            java.lang.String r2 = "Q"
            java.lang.String r0 = p000.a12.m17(r2, r0)
            r1.<init>(r3, r0)
            return r1
        L14:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ε */
    public final void m6510() {
            r2 = this;
            java.util.TimeZone r0 = p000.ud2.f10709
            int r0 = r2.f12014
            int r1 = r2.f12015
            if (r0 <= r1) goto L9
            return
        L9:
            int r0 = r0 + 1
            r2.f12014 = r0
            d1 r0 = r2.f12018
            r0.getClass()
            y21 r2 = r2.f12009
            java.lang.Object r2 = r2.f12428
            java.util.concurrent.ThreadPoolExecutor r2 = (java.util.concurrent.ThreadPoolExecutor) r2
            r2.execute(r0)
            return
    }
}
