package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@Yue.InterfaceC5840({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,250:1\n1#2:251\n1774#3,4:252\n608#4,4:256\n608#4,4:260\n608#4,4:264\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n60#1:252,4\n95#1:256,4\n106#1:260,4\n215#1:264,4\n*E\n"})
public final class C5225 {

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5225.C5226 f19614 = null;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int f19615;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long f19616;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C6118 f19617;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final Yue.C5225.C5227 f19618;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public final java.util.concurrent.ConcurrentLinkedQueue<Yue.C5219> f19619;

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۦ$ۥ, reason: contains not printable characters */
    public static final class C5226 {
        public C5226() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5226(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final Yue.C5225 m19748(@Yue.InterfaceC4418 Yue.C1485 r2) {
                r1 = this;
                java.lang.String r0 = "connectionPool"
                Yue.C3329.m13906(r2, r0)
                Yue.ۥۡۦ۠ۦ r2 = r2.m7322()
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦ۠ۦ$ۥ۟, reason: contains not printable characters */
    public static final class C5227 extends Yue.AbstractC6111 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C5225 f19620;

        public C5227(Yue.C5225 r3, java.lang.String r4) {
                r2 = this;
                r2.f19620 = r3
                r3 = 2
                r0 = 0
                r1 = 0
                r2.<init>(r4, r1, r3, r0)
                return
        }

        @Override // Yue.AbstractC6111
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public long mo8734() {
                r3 = this;
                Yue.ۥۡۦ۠ۦ r0 = r3.f19620
                long r1 = java.lang.System.nanoTime()
                long r0 = r0.m19741(r1)
                return r0
        }
    }

    static {
            Yue.ۥۡۦ۠ۦ$ۥ r0 = new Yue.ۥۡۦ۠ۦ$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5225.f19614 = r0
            return
    }

    public C5225(@Yue.InterfaceC4418 Yue.C6122 r3, int r4, long r5, @Yue.InterfaceC4418 java.util.concurrent.TimeUnit r7) {
            r2 = this;
            java.lang.String r0 = "taskRunner"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "timeUnit"
            Yue.C3329.m13906(r7, r0)
            r2.<init>()
            r2.f19615 = r4
            long r0 = r7.toNanos(r5)
            r2.f19616 = r0
            Yue.ۥۢۡ۟ۡ r3 = r3.m22971()
            r2.f19617 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = Yue.C6656.f23212
            r3.append(r4)
            java.lang.String r4 = " ConnectionPool"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            Yue.ۥۡۦ۠ۦ$ۥ۟ r4 = new Yue.ۥۡۦ۠ۦ$ۥ۟
            r4.<init>(r2, r3)
            r2.f19618 = r4
            java.util.concurrent.ConcurrentLinkedQueue r3 = new java.util.concurrent.ConcurrentLinkedQueue
            r3.<init>()
            r2.f19619 = r3
            r3 = 0
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 <= 0) goto L43
            return
        L43:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "keepAliveDuration <= 0: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final boolean m19740(@Yue.InterfaceC4418 Yue.C0296 r4, @Yue.InterfaceC4418 Yue.C5215 r5, @Yue.InterfaceC4543 java.util.List<Yue.C5436> r6, boolean r7) {
            r3 = this;
            java.lang.String r0 = "address"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = "call"
            Yue.C3329.m13906(r5, r0)
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r0 = r3.f19619
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            Yue.ۥۡۦ۠ۥ r1 = (Yue.C5219) r1
            java.lang.String r2 = "connection"
            Yue.C3329.m13905(r1, r2)
            monitor-enter(r1)
            if (r7 == 0) goto L2d
            boolean r2 = r1.m19727()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            goto L2d
        L2b:
            r4 = move-exception
            goto L3d
        L2d:
            boolean r2 = r1.m19725(r4, r6)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L39
            r5.m19674(r1)     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            r4 = 1
            return r4
        L39:
            Yue.ۥۣۢ۠ۤ r2 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L2b
            monitor-exit(r1)
            goto L10
        L3d:
            monitor-exit(r1)
            throw r4
        L3f:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final long m19741(long r11) {
            r10 = this;
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r0 = r10.f19619
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
            r3 = -9223372036854775808
            r4 = r3
            r3 = r2
            r2 = r1
        Ld:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r0.next()
            Yue.ۥۡۦ۠ۥ r6 = (Yue.C5219) r6
            java.lang.String r7 = "connection"
            Yue.C3329.m13905(r6, r7)
            monitor-enter(r6)
            int r7 = r10.m19746(r6, r11)     // Catch: java.lang.Throwable -> L3a
            if (r7 <= 0) goto L28
            int r2 = r2 + 1
            goto L38
        L28:
            int r1 = r1 + 1
            long r7 = r6.m19721()     // Catch: java.lang.Throwable -> L3a
            long r7 = r11 - r7
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 <= 0) goto L36
            r3 = r6
            r4 = r7
        L36:
            Yue.ۥۣۢ۠ۤ r7 = Yue.C6593.f23016     // Catch: java.lang.Throwable -> L3a
        L38:
            monitor-exit(r6)
            goto Ld
        L3a:
            r11 = move-exception
            monitor-exit(r6)
            throw r11
        L3d:
            long r6 = r10.f19616
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L52
            int r0 = r10.f19615
            if (r1 <= r0) goto L48
            goto L52
        L48:
            if (r1 <= 0) goto L4c
            long r6 = r6 - r4
            return r6
        L4c:
            if (r2 <= 0) goto L4f
            return r6
        L4f:
            r11 = -1
            return r11
        L52:
            Yue.C3329.m13903(r3)
            monitor-enter(r3)
            java.util.List r0 = r3.m19719()     // Catch: java.lang.Throwable -> L8f
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8f
            r1 = 1
            r0 = r0 ^ r1
            r6 = 0
            if (r0 == 0) goto L66
            monitor-exit(r3)
            return r6
        L66:
            long r8 = r3.m19721()     // Catch: java.lang.Throwable -> L8f
            long r8 = r8 + r4
            int r11 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r11 == 0) goto L71
            monitor-exit(r3)
            return r6
        L71:
            r3.m19734(r1)     // Catch: java.lang.Throwable -> L8f
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r11 = r10.f19619     // Catch: java.lang.Throwable -> L8f
            r11.remove(r3)     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r3)
            java.net.Socket r11 = r3.mo7319()
            Yue.C6656.m25569(r11)
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r11 = r10.f19619
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L8e
            Yue.ۥۢۡ۟ۡ r11 = r10.f19617
            r11.m22943()
        L8e:
            return r6
        L8f:
            r11 = move-exception
            monitor-exit(r3)
            throw r11
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final boolean m19742(@Yue.InterfaceC4418 Yue.C5219 r8) {
            r7 = this;
            java.lang.String r0 = "connection"
            Yue.C3329.m13906(r8, r0)
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r8)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L37:
            boolean r0 = r8.m19722()
            if (r0 != 0) goto L4f
            int r0 = r7.f19615
            if (r0 != 0) goto L42
            goto L4f
        L42:
            Yue.ۥۢۡ۟ۡ r1 = r7.f19617
            Yue.ۥۡۦ۠ۦ$ۥ۟ r2 = r7.f19618
            r5 = 2
            r6 = 0
            r3 = 0
            Yue.C6118.m22941(r1, r2, r3, r5, r6)
            r8 = 0
            goto L66
        L4f:
            r0 = 1
            r8.m19734(r0)
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r1 = r7.f19619
            r1.remove(r8)
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r8 = r7.f19619
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L65
            Yue.ۥۢۡ۟ۡ r8 = r7.f19617
            r8.m22943()
        L65:
            r8 = r0
        L66:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m19743() {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r0 = r1.f19619
            int r0 = r0.size()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m19744() {
            r3 = this;
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r0 = r3.f19619
            java.util.Iterator r0 = r0.iterator()
            java.lang.String r1 = "connections.iterator()"
            Yue.C3329.m13905(r0, r1)
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            Yue.ۥۡۦ۠ۥ r1 = (Yue.C5219) r1
            java.lang.String r2 = "connection"
            Yue.C3329.m13905(r1, r2)
            monitor-enter(r1)
            java.util.List r2 = r1.m19719()     // Catch: java.lang.Throwable -> L33
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L35
            r0.remove()     // Catch: java.lang.Throwable -> L33
            r2 = 1
            r1.m19734(r2)     // Catch: java.lang.Throwable -> L33
            java.net.Socket r2 = r1.mo7319()     // Catch: java.lang.Throwable -> L33
            goto L36
        L33:
            r0 = move-exception
            goto L3d
        L35:
            r2 = 0
        L36:
            monitor-exit(r1)
            if (r2 == 0) goto Lb
            Yue.C6656.m25569(r2)
            goto Lb
        L3d:
            monitor-exit(r1)
            throw r0
        L3f:
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r0 = r3.f19619
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4c
            Yue.ۥۢۡ۟ۡ r0 = r3.f19617
            r0.m22943()
        L4c:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final int m19745() {
            r4 = this;
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r0 = r4.f19619
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            goto L3a
        Le:
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            Yue.ۥۡۦ۠ۥ r1 = (Yue.C5219) r1
            java.lang.String r3 = "it"
            Yue.C3329.m13905(r1, r3)
            monitor-enter(r1)
            java.util.List r3 = r1.m19719()     // Catch: java.lang.Throwable -> L37
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r1)
            if (r3 == 0) goto L12
            int r2 = r2 + 1
            if (r2 >= 0) goto L12
            Yue.C1208.m6227()
            goto L12
        L37:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L3a:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final int m19746(Yue.C5219 r7, long r8) {
            r6 = this;
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L32
            boolean r0 = java.lang.Thread.holdsLock(r7)
            if (r0 == 0) goto Lb
            goto L32
        Lb:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Thread "
            r9.append(r0)
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            r9.append(r0)
            java.lang.String r0 = " MUST hold lock on "
            r9.append(r0)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        L32:
            java.util.List r0 = r7.m19719()
            r1 = 0
            r2 = r1
        L38:
            int r3 = r0.size()
            if (r2 >= r3) goto L97
            java.lang.Object r3 = r0.get(r2)
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3
            java.lang.Object r4 = r3.get()
            if (r4 == 0) goto L4d
            int r2 = r2 + 1
            goto L38
        L4d:
            java.lang.String r4 = "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference"
            Yue.C3329.m13904(r3, r4)
            Yue.ۥۡۦ۠ۤ$ۥ۟ r3 = (Yue.C5215.C5217) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "A connection to "
            r4.append(r5)
            Yue.ۥۣۡۧ۠ r5 = r7.mo7317()
            Yue.ۥ۟۠ۢ r5 = r5.m20512()
            Yue.ۥ۠ۤۨۥ r5 = r5.m1318()
            r4.append(r5)
            java.lang.String r5 = " was leaked. Did you forget to close a response body?"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            Yue.ۥۡۤۡۢ$ۥ r5 = Yue.C4773.f15123
            Yue.ۥۡۤۡۢ r5 = r5.m19021()
            java.lang.Object r3 = r3.m19706()
            r5.mo1424(r4, r3)
            r0.remove(r2)
            r3 = 1
            r7.m19734(r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L38
            long r2 = r6.f19616
            long r8 = r8 - r2
            r7.m19733(r8)
            return r1
        L97:
            int r7 = r0.size()
            return r7
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m19747(@Yue.InterfaceC4418 Yue.C5219 r8) {
            r7 = this;
            java.lang.String r0 = "connection"
            Yue.C3329.m13906(r8, r0)
            boolean r0 = Yue.C6656.f23211
            if (r0 == 0) goto L37
            boolean r0 = java.lang.Thread.holdsLock(r8)
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Thread "
            r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " MUST hold lock on "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        L37:
            java.util.concurrent.ConcurrentLinkedQueue<Yue.ۥۡۦ۠ۥ> r0 = r7.f19619
            r0.add(r8)
            Yue.ۥۢۡ۟ۡ r1 = r7.f19617
            Yue.ۥۡۦ۠ۦ$ۥ۟ r2 = r7.f19618
            r5 = 2
            r6 = 0
            r3 = 0
            Yue.C6118.m22941(r1, r2, r3, r5, r6)
            return
    }
}
