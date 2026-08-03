package m0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0.h0 f8439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0.a f8440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.m0 f8442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f8446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8447i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8448j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8449k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8450l;

    public b(i0.h0 r1, m0.a r2) {
            r0 = this;
            r0.<init>()
            r0.f8439a = r1
            r0.f8440b = r2
            i0.m0 r1 = new i0.m0
            r1.<init>()
            r0.f8442d = r1
            r1 = 1
            r0.f8443e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f8446h = r1
            r1 = -1
            r0.f8447i = r1
            r0.f8448j = r1
            r0.f8449k = r1
            return
    }

    public final void a() {
            r2 = this;
            r2.c()
            java.util.ArrayList r0 = r2.f8446h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L15
            int r1 = r0.size()
            int r1 = r1 + (-1)
            r0.remove(r1)
            return
        L15:
            int r0 = r2.f8445g
            int r0 = r0 + 1
            r2.f8445g = r0
            return
    }

    public final void b() {
            r7 = this;
            int r0 = r7.f8445g
            r1 = 0
            if (r0 <= 0) goto L21
            m0.a r2 = r7.f8440b
            m0.l0 r2 = r2.f8437j
            m0.h0 r3 = m0.h0.f8464c
            r2.U(r3)
            int[] r3 = r2.f8474e
            int r4 = r2.f8475f
            m0.j0[] r5 = r2.f8472c
            int r2 = r2.f8473d
            int r2 = r2 + (-1)
            r2 = r5[r2]
            int r2 = r2.f8468a
            int r4 = r4 - r2
            r3[r4] = r0
            r7.f8445g = r1
        L21:
            java.util.ArrayList r0 = r7.f8446h
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L50
            m0.a r2 = r7.f8440b
            int r3 = r0.size()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = r1
        L32:
            if (r5 >= r3) goto L3d
            java.lang.Object r6 = r0.get(r5)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L32
        L3d:
            r2.getClass()
            if (r3 != 0) goto L43
            goto L4d
        L43:
            m0.l0 r2 = r2.f8437j
            m0.k r3 = m0.k.f8470c
            r2.U(r3)
            f8.i.F0(r2, r1, r4)
        L4d:
            r0.clear()
        L50:
            return
    }

    public final void c() {
            r8 = this;
            int r0 = r8.f8450l
            if (r0 <= 0) goto L5d
            int r1 = r8.f8447i
            r2 = -1
            if (r1 < 0) goto L2d
            r8.b()
            m0.a r3 = r8.f8440b
            m0.l0 r3 = r3.f8437j
            m0.z r4 = m0.z.f8495c
            r3.U(r4)
            int r4 = r3.f8475f
            m0.j0[] r5 = r3.f8472c
            int r6 = r3.f8473d
            int r6 = r6 + (-1)
            r5 = r5[r6]
            int r5 = r5.f8468a
            int r4 = r4 - r5
            int[] r3 = r3.f8474e
            r3[r4] = r1
            int r4 = r4 + 1
            r3[r4] = r0
            r8.f8447i = r2
            goto L5a
        L2d:
            int r1 = r8.f8449k
            int r3 = r8.f8448j
            r8.b()
            m0.a r4 = r8.f8440b
            m0.l0 r4 = r4.f8437j
            m0.v r5 = m0.v.f8491c
            r4.U(r5)
            int r5 = r4.f8475f
            m0.j0[] r6 = r4.f8472c
            int r7 = r4.f8473d
            int r7 = r7 + (-1)
            r6 = r6[r7]
            int r6 = r6.f8468a
            int r5 = r5 - r6
            int[] r4 = r4.f8474e
            int r6 = r5 + 1
            r4[r6] = r1
            r4[r5] = r3
            int r5 = r5 + 2
            r4[r5] = r0
            r8.f8448j = r2
            r8.f8449k = r2
        L5a:
            r0 = 0
            r8.f8450l = r0
        L5d:
            return
    }

    public final void d(boolean r6) {
            r5 = this;
            i0.h0 r0 = r5.f8439a
            l0.g r0 = r0.G
            if (r6 == 0) goto L9
            int r6 = r0.f7674i
            goto Lb
        L9:
            int r6 = r0.f7672g
        Lb:
            int r0 = r5.f8444f
            int r0 = r6 - r0
            if (r0 < 0) goto L12
            goto L17
        L12:
            java.lang.String r1 = "Tried to seek backward"
            i0.m.a(r1)
        L17:
            if (r0 <= 0) goto L35
            m0.a r1 = r5.f8440b
            m0.l0 r1 = r1.f8437j
            m0.d r2 = m0.d.f8455c
            r1.U(r2)
            int[] r2 = r1.f8474e
            int r3 = r1.f8475f
            m0.j0[] r4 = r1.f8472c
            int r1 = r1.f8473d
            int r1 = r1 + (-1)
            r1 = r4[r1]
            int r1 = r1.f8468a
            int r3 = r3 - r1
            r2[r3] = r0
            r5.f8444f = r6
        L35:
            return
    }

    public final void e(int r3, int r4) {
            r2 = this;
            if (r4 <= 0) goto L2b
            if (r3 < 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid remove index "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            i0.m.a(r0)
        L1a:
            int r0 = r2.f8447i
            if (r0 != r3) goto L24
            int r3 = r2.f8450l
            int r3 = r3 + r4
            r2.f8450l = r3
            return
        L24:
            r2.c()
            r2.f8447i = r3
            r2.f8450l = r4
        L2b:
            return
    }
}
