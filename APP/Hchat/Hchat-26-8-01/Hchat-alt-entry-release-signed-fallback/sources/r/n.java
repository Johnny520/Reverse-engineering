package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.w f11194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.k f11195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s.f0 f11196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f11197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s.f0 f11199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y0.e f11202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y0.f f11203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11204k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f11205l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f11206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r.z f11207n;

    public n(long r1, boolean r3, r.k r4, s.f0 r5, int r6, int r7, y0.e r8, y0.f r9, int r10, int r11, long r12, r.z r14) {
            r0 = this;
            r0.f11198e = r3
            r0.f11199f = r5
            r0.f11200g = r6
            r0.f11201h = r7
            r0.f11202i = r8
            r0.f11203j = r9
            r0.f11204k = r10
            r0.f11205l = r11
            r0.f11206m = r12
            r0.f11207n = r14
            r0.<init>()
            f.w r6 = f.l.f2854a
            f.w r6 = new f.w
            r6.<init>()
            r0.f11194a = r6
            r0.f11195b = r4
            r0.f11196c = r5
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == 0) goto L2e
            int r5 = u2.a.h(r1)
            goto L2f
        L2e:
            r5 = r4
        L2f:
            if (r3 != 0) goto L35
            int r4 = u2.a.g(r1)
        L35:
            r1 = 5
            r2 = 0
            long r1 = u2.b.b(r2, r5, r2, r4, r1)
            r0.f11197d = r1
            return
    }

    public final r.q a(int r19, long r20) {
            r18 = this;
            r0 = r18
            r2 = r19
            r.k r1 = r0.f11195b
            java.lang.Object r13 = r1.d(r2)
            java.lang.Object r14 = r1.b(r2)
            f.w r1 = r0.f11194a
            java.lang.Object r3 = r1.b(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            if (r3 == 0) goto L1c
            r9 = r20
            goto L66
        L1c:
            s.f0 r3 = r0.f11196c
            r.k r5 = r3.f12010i
            f.w r6 = r3.f12011j
            java.lang.Object r7 = r6.b(r2)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L2b
            goto L42
        L2b:
            java.lang.Object r7 = r5.d(r2)
            java.lang.Object r5 = r5.b(r2)
            s.b0 r8 = r3.f12008g
            fg.p r5 = r8.a(r7, r2, r5)
            v1.k1 r3 = r3.f12009h
            java.util.List r7 = r3.N(r5, r7)
            r6.h(r2, r7)
        L42:
            int r3 = r7.size()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r3)
            r6 = r4
        L4c:
            if (r6 >= r3) goto L60
            java.lang.Object r8 = r7.get(r6)
            v1.m0 r8 = (v1.m0) r8
            r9 = r20
            v1.b1 r8 = r8.Q(r9)
            r5.add(r8)
            int r6 = r6 + 1
            goto L4c
        L60:
            r9 = r20
            r1.h(r2, r5)
            r3 = r5
        L66:
            int r1 = r0.f11200g
            int r1 = r1 + (-1)
            if (r2 != r1) goto L6d
            goto L6f
        L6d:
            int r4 = r0.f11201h
        L6f:
            r.q r1 = new r.q
            s.f0 r5 = r0.f11199f
            v1.k1 r5 = r5.f12009h
            u2.m r7 = r5.getLayoutDirection()
            r.z r5 = r0.f11207n
            s.z r15 = r5.f11294o
            r10 = r4
            boolean r4 = r0.f11198e
            y0.e r5 = r0.f11202i
            y0.f r6 = r0.f11203j
            int r8 = r0.f11204k
            int r9 = r0.f11205l
            long r11 = r0.f11206m
            r16 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            return r1
    }
}
