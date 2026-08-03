package a;

/* JADX INFO: renamed from: a.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0297o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f619a;
    public volatile a.EnumC0333q6 b;
    public final java.util.concurrent.atomic.AtomicInteger c;
    public final java.util.concurrent.atomic.AtomicLong d;
    public final java.util.concurrent.atomic.AtomicLong e;
    public volatile java.lang.String f;
    public volatile java.lang.String g;
    public volatile long h;
    public volatile int i;

    public C0297o6(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            r2.f619a = r3
            a.q6 r3 = a.EnumC0333q6.f652a
            r2.b = r3
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r0 = 0
            r3.<init>(r0)
            r2.c = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r0 = 0
            r3.<init>(r0)
            r2.d = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r3.<init>(r0)
            r2.e = r3
            return
    }

    public static java.lang.Object a(a.C0297o6 r9, a.InterfaceC0369s7 r10) {
            a.q6 r0 = r9.b
            a.q6 r1 = a.EnumC0333q6.b
            r2 = 0
            if (r0 == r1) goto L14d
            a.q6 r0 = r9.b
            a.q6 r3 = a.EnumC0333q6.c
            if (r0 != r3) goto Lf
            goto L14d
        Lf:
            java.util.concurrent.atomic.AtomicLong r0 = r9.e
            r0.incrementAndGet()
            r0 = 0
            java.lang.Object r10 = r10.a()     // Catch: java.lang.Throwable -> L1f
            java.util.concurrent.atomic.AtomicInteger r3 = r9.c     // Catch: java.lang.Throwable -> L1f
            r3.set(r0)     // Catch: java.lang.Throwable -> L1f
            return r10
        L1f:
            r10 = move-exception
            java.util.concurrent.atomic.AtomicInteger r3 = r9.c
            int r3 = r3.incrementAndGet()
            java.util.concurrent.atomic.AtomicLong r4 = r9.d
            r4.incrementAndGet()
            java.lang.Class r4 = r10.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r9.f = r4
            java.lang.String r4 = r10.getMessage()
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 == 0) goto L42
            java.lang.String r4 = a.Ce.X(r4, r5)
            goto L43
        L42:
            r4 = r2
        L43:
            r9.g = r4
            long r6 = java.lang.System.currentTimeMillis()
            r9.h = r6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r4 = a.E8.f71a
            java.lang.String r4 = r9.f619a
            java.lang.String r6 = "/callback"
            java.lang.String r4 = r4.concat(r6)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r6 = a.E8.f71a
            java.lang.Object r4 = r6.get(r4)
            a.F8 r4 = (a.F8) r4
            if (r4 == 0) goto L70
            java.util.concurrent.atomic.AtomicLong r4 = r4.f81a
            r4.incrementAndGet()
            java.lang.String r4 = r10.getMessage()
            if (r4 == 0) goto L6d
            a.Ce.X(r4, r5)
        L6d:
            java.lang.System.currentTimeMillis()
        L70:
            r4 = 3
            java.lang.String r5 = "StabilityLayer"
            java.lang.String r6 = ": "
            java.lang.String r7 = "["
            if (r3 < r4) goto L10c
            r9.b = r1
            int r1 = r9.i
            int r1 = r1 + 1
            r9.i = r1
            java.lang.String r1 = r9.f619a
            java.util.concurrent.atomic.AtomicInteger r9 = r9.c
            int r9 = r9.get()
            java.lang.Class r3 = r10.getClass()
            java.lang.String r3 = r3.getSimpleName()
            java.lang.String r4 = r10.getMessage()
            if (r4 == 0) goto L9e
            r8 = 150(0x96, float:2.1E-43)
            java.lang.String r4 = a.Ce.X(r4, r8)
            goto L9f
        L9e:
            r4 = r2
        L9f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r7)
            r8.append(r1)
            java.lang.String r1 = "] ISOLATED after "
            r8.append(r1)
            r8.append(r9)
            java.lang.String r9 = " consecutive failures. Last: "
            r8.append(r9)
            r8.append(r3)
            r8.append(r6)
            r8.append(r4)
            java.lang.String r9 = r8.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r5, r9}
            a.C0453x1.a(r9)
            r10.getMessage()     // Catch: java.lang.Throwable -> L14d
            java.lang.StackTraceElement[] r9 = r10.getStackTrace()     // Catch: java.lang.Throwable -> L14d
            java.lang.String r10 = "getStackTrace(...)"
            a.C0193i9.d(r9, r10)     // Catch: java.lang.Throwable -> L14d
            int r10 = r9.length     // Catch: java.lang.Throwable -> L14d
            r1 = 5
            if (r1 < r10) goto Ldd
            java.util.List r9 = a.N1.g0(r9)     // Catch: java.lang.Throwable -> L14d
            goto Lf4
        Ldd:
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14d
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L14d
            int r3 = r9.length     // Catch: java.lang.Throwable -> L14d
            r4 = r0
        Le4:
            if (r0 >= r3) goto Lf3
            r5 = r9[r0]     // Catch: java.lang.Throwable -> L14d
            r10.add(r5)     // Catch: java.lang.Throwable -> L14d
            int r4 = r4 + 1
            if (r4 != r1) goto Lf0
            goto Lf3
        Lf0:
            int r0 = r0 + 1
            goto Le4
        Lf3:
            r9 = r10
        Lf4:
            a.g2 r10 = new a.g2     // Catch: java.lang.Throwable -> L14d
            r0 = 9
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L14d
            java.lang.String r0 = "\n"
            r1 = 30
            java.lang.String r9 = a.C0383t3.p0(r9, r0, r10, r1)     // Catch: java.lang.Throwable -> L14d
            a.C0492z4.a()     // Catch: java.lang.Throwable -> L14d
            java.lang.String r10 = "stackSummary"
            a.C0193i9.e(r9, r10)     // Catch: java.lang.Throwable -> L14d
            goto L14d
        L10c:
            java.lang.String r9 = r9.f619a
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r10 = r10.getMessage()
            if (r10 == 0) goto L123
            r1 = 100
            java.lang.String r10 = a.Ce.X(r10, r1)
            goto L124
        L123:
            r10 = r2
        L124:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r9)
            java.lang.String r9 = "] hook error ("
            r1.append(r9)
            r1.append(r3)
            java.lang.String r9 = "/3): "
            r1.append(r9)
            r1.append(r0)
            r1.append(r6)
            r1.append(r10)
            java.lang.String r9 = r1.toString()
            java.lang.Object[] r9 = new java.lang.Object[]{r5, r9}
            a.C0453x1.e(r9)
        L14d:
            return r2
    }
}
