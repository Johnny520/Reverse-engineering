package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i2.z f8073a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m.x1 f8074b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final m.w1 f8075c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m.y1 f8076d = null;

    static {
            i2.z r0 = new i2.z
            r1 = 24
            r0.<init>(r1)
            m.a2.f8073a = r0
            m.x1 r0 = new m.x1
            r0.<init>()
            m.a2.f8074b = r0
            m.w1 r0 = new m.w1
            r0.<init>()
            m.a2.f8075c = r0
            m.y1 r0 = new m.y1
            r0.<init>()
            m.a2.f8076d = r0
            return
    }

    public static final java.lang.Object a(m.o2 r10, long r11, yf.c r13) {
            boolean r0 = r13 instanceof m.z1
            if (r0 == 0) goto L13
            r0 = r13
            m.z1 r0 = (m.z1) r0
            int r1 = r0.f8435j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8435j = r1
            goto L18
        L13:
            m.z1 r0 = new m.z1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f8434i
            int r1 = r0.f8435j
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            gg.r r10 = r0.f8433h
            m.o2 r11 = r0.f8432g
            f8.i.I0(r13)
            r7 = r10
            r10 = r11
            goto L55
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            return r10
        L32:
            f8.i.I0(r13)
            gg.r r7 = new gg.r
            r7.<init>()
            c0.i r3 = new c0.i
            r8 = 0
            r9 = 4
            r4 = r10
            r5 = r11
            r3.<init>(r4, r5, r7, r8, r9)
            r0.f8432g = r4
            r0.f8433h = r7
            r0.f8435j = r2
            k.d1 r10 = k.d1.f6939g
            java.lang.Object r10 = r4.f(r10, r3, r0)
            xf.a r11 = xf.a.f21579g
            if (r10 != r11) goto L54
            return r11
        L54:
            r10 = r4
        L55:
            float r11 = r7.f4561g
            long r10 = r10.h(r11)
            e1.b r12 = new e1.b
            r12.<init>(r10)
            return r12
    }

    public static y0.o b(w.i1 r1, m.p1 r2, boolean r3, boolean r4) {
            m.v1 r0 = new m.v1
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
