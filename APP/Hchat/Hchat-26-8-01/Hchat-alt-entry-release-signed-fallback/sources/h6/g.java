package h6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j6.d f5119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f5122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f5123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f5124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h6.a f5128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f5131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f5132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.ArrayDeque f5133o;

    public g() {
            r2 = this;
            r2.<init>()
            j6.d r0 = j6.d.f6723j
            r2.f5119a = r0
            r0 = 1
            r2.f5120b = r0
            r2.f5121c = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.f5122d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f5123e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f5124f = r1
            h6.a r1 = h6.f.f5108i
            r1 = 2
            r2.f5125g = r1
            r2.f5126h = r1
            r2.f5127i = r0
            h6.a r1 = h6.f.f5108i
            r2.f5128j = r1
            r1 = 0
            r2.f5129k = r1
            r2.f5130l = r0
            int r0 = h6.f.f5109j
            r2.f5131m = r0
            int r0 = h6.f.f5110k
            r2.f5132n = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.f5133o = r0
            return
    }

    public final h6.f a() {
            r13 = this;
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.ArrayList r0 = r13.f5123e
            int r1 = r0.size()
            java.util.ArrayList r2 = r13.f5124f
            int r3 = r2.size()
            int r3 = r3 + r1
            int r3 = r3 + 3
            r9.<init>(r3)
            r9.addAll(r0)
            java.util.Collections.reverse(r9)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            java.util.Collections.reverse(r1)
            r9.addAll(r1)
            boolean r1 = m6.f.f8727a
            int r3 = r13.f5125g
            int r4 = r13.f5126h
            r5 = 2
            if (r3 != r5) goto L30
            if (r4 == r5) goto L73
        L30:
            k6.h r5 = new k6.h
            k6.f r6 = k6.g.f7345b
            r5.<init>(r6, r3, r4)
            k6.s0 r6 = k6.c1.f7317a
            k6.s0 r6 = new k6.s0
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            r8 = 0
            r6.<init>(r7, r5, r8)
            if (r1 == 0) goto L66
            m6.e r5 = m6.f.f8729c
            r5.getClass()
            k6.h r7 = new k6.h
            r7.<init>(r5, r3, r4)
            java.lang.Class r5 = r5.f7346a
            k6.s0 r10 = new k6.s0
            r10.<init>(r5, r7, r8)
            m6.e r5 = m6.f.f8728b
            r5.getClass()
            k6.h r7 = new k6.h
            r7.<init>(r5, r3, r4)
            java.lang.Class r3 = r5.f7346a
            k6.s0 r4 = new k6.s0
            r4.<init>(r3, r7, r8)
            goto L68
        L66:
            r10 = 0
            r4 = r10
        L68:
            r9.add(r6)
            if (r1 == 0) goto L73
            r9.add(r10)
            r9.add(r4)
        L73:
            r1 = r0
            h6.f r0 = new h6.f
            r3 = r1
            j6.d r1 = r13.f5119a
            r4 = r2
            int r2 = r13.f5121c
            r5 = r3
            java.util.HashMap r3 = new java.util.HashMap
            java.util.HashMap r6 = r13.f5122d
            r3.<init>(r6)
            r6 = r4
            boolean r4 = r13.f5127i
            r7 = r5
            h6.a r5 = r13.f5128j
            r8 = r6
            int r6 = r13.f5129k
            r10 = r7
            boolean r7 = r13.f5130l
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r8)
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.ArrayDeque r8 = r13.f5133o
            r12.<init>(r8)
            int r8 = r13.f5120b
            int r10 = r13.f5131m
            int r11 = r13.f5132n
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }
}
