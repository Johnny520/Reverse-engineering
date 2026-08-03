package l0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0.h f7666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f7667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object[] f7669d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7674i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i0.m0 f7675j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7676k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f7677l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7678m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f7679n;

    public g(l0.h r3) {
            r2 = this;
            r2.<init>()
            r2.f7666a = r3
            int[] r0 = r3.f7680g
            r2.f7667b = r0
            int r0 = r3.f7681h
            r2.f7668c = r0
            java.lang.Object[] r1 = r3.f7682i
            r2.f7669d = r1
            int r3 = r3.f7683j
            r2.f7670e = r3
            r2.f7673h = r0
            r3 = -1
            r2.f7674i = r3
            i0.m0 r3 = new i0.m0
            r3.<init>()
            r2.f7675j = r3
            return
    }

    public final l0.b a(int r4) {
            r3 = this;
            l0.h r0 = r3.f7666a
            java.util.ArrayList r0 = r0.f7688o
            int r1 = r3.f7668c
            int r1 = l0.j.e(r0, r4, r1)
            if (r1 >= 0) goto L18
            l0.b r2 = new l0.b
            r2.<init>(r4)
            int r1 = r1 + 1
            int r4 = -r1
            r0.add(r4, r2)
            return r2
        L18:
            java.lang.Object r4 = r0.get(r1)
            l0.b r4 = (l0.b) r4
            return r4
    }

    public final java.lang.Object b(int[] r4, int r5) {
            r3 = this;
            int r5 = r5 * 5
            int r0 = r5 + 1
            r0 = r4[r0]
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L20
            java.lang.Object[] r1 = r3.f7669d
            int r2 = r4.length
            if (r5 < r2) goto L12
            int r4 = r4.length
            goto L1d
        L12:
            int r5 = r5 + 4
            r4 = r4[r5]
            int r5 = r0 >> 29
            int r5 = java.lang.Integer.bitCount(r5)
            int r4 = r4 + r5
        L1d:
            r4 = r1[r4]
            return r4
        L20:
            i0.e r4 = i0.l.f5952a
            return r4
    }

    public final void c() {
            r2 = this;
            r0 = 1
            r2.f7671f = r0
            l0.h r0 = r2.f7666a
            int r1 = r0.f7684k
            if (r1 <= 0) goto La
            goto Lf
        La:
            java.lang.String r1 = "Unexpected reader close()"
            i0.m.a(r1)
        Lf:
            int r1 = r0.f7684k
            int r1 = r1 + (-1)
            r0.f7684k = r1
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2.f7669d = r0
            return
    }

    public final boolean d(int r3) {
            r2 = this;
            int r3 = r3 * 5
            r0 = 1
            int r3 = r3 + r0
            int[] r1 = r2.f7667b
            r3 = r1[r3]
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r3 = r3 & r1
            if (r3 == 0) goto Le
            return r0
        Le:
            r3 = 0
            return r3
    }

    public final void e() {
            r4 = this;
            int r0 = r4.f7676k
            if (r0 != 0) goto L4c
            int r0 = r4.f7672g
            int r1 = r4.f7673h
            if (r0 != r1) goto Lb
            goto L10
        Lb:
            java.lang.String r0 = "endGroup() not called at the end of a group"
            i0.m.a(r0)
        L10:
            int r0 = r4.f7674i
            int r0 = r0 * 5
            int r0 = r0 + 2
            int[] r1 = r4.f7667b
            r0 = r1[r0]
            r4.f7674i = r0
            int r2 = r4.f7668c
            if (r0 >= 0) goto L22
            r3 = r2
            goto L29
        L22:
            int r3 = r0 * 5
            int r3 = r3 + 3
            r3 = r1[r3]
            int r3 = r3 + r0
        L29:
            r4.f7673h = r3
            i0.m0 r3 = r4.f7675j
            int r3 = r3.b()
            if (r3 >= 0) goto L39
            r0 = 0
            r4.f7677l = r0
            r4.f7678m = r0
            return
        L39:
            r4.f7677l = r3
            int r2 = r2 + (-1)
            if (r0 < r2) goto L42
            int r0 = r4.f7670e
            goto L4a
        L42:
            int r0 = r0 + 1
            int r0 = r0 * 5
            int r0 = r0 + 4
            r0 = r1[r0]
        L4a:
            r4.f7678m = r0
        L4c:
            return
    }

    public final java.lang.Object f() {
            r2 = this;
            int r0 = r2.f7672g
            int r1 = r2.f7673h
            if (r0 >= r1) goto Ld
            int[] r1 = r2.f7667b
            java.lang.Object r0 = r2.b(r1, r0)
            return r0
        Ld:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    public final int g() {
            r2 = this;
            int r0 = r2.f7672g
            int r1 = r2.f7673h
            if (r0 >= r1) goto Ld
            int r0 = r0 * 5
            int[] r1 = r2.f7667b
            r0 = r1[r0]
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final java.lang.Object h(int r4, int r5) {
            r3 = this;
            int[] r0 = r3.f7667b
            int r1 = l0.j.b(r0, r4)
            int r4 = r4 + 1
            int r2 = r3.f7668c
            if (r4 >= r2) goto L13
            int r4 = r4 * 5
            int r4 = r4 + 4
            r4 = r0[r4]
            goto L15
        L13:
            int r4 = r3.f7670e
        L15:
            int r1 = r1 + r5
            if (r1 >= r4) goto L1d
            java.lang.Object[] r4 = r3.f7669d
            r4 = r4[r1]
            return r4
        L1d:
            i0.e r4 = i0.l.f5952a
            return r4
    }

    public final int i(int r2) {
            r1 = this;
            int r2 = r2 * 5
            int[] r0 = r1.f7667b
            r2 = r0[r2]
            return r2
    }

    public final boolean j(int r3) {
            r2 = this;
            int r3 = r3 * 5
            r0 = 1
            int r3 = r3 + r0
            int[] r1 = r2.f7667b
            r3 = r1[r3]
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r3 = r3 & r1
            if (r3 == 0) goto Le
            return r0
        Le:
            r3 = 0
            return r3
    }

    public final boolean k(int r3) {
            r2 = this;
            int r3 = r3 * 5
            r0 = 1
            int r3 = r3 + r0
            int[] r1 = r2.f7667b
            r3 = r1[r3]
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r3 = r3 & r1
            if (r3 == 0) goto Le
            return r0
        Le:
            r3 = 0
            return r3
    }

    public final boolean l(int r3) {
            r2 = this;
            int r3 = r3 * 5
            r0 = 1
            int r3 = r3 + r0
            int[] r1 = r2.f7667b
            r3 = r1[r3]
            r1 = 1073741824(0x40000000, float:2.0)
            r3 = r3 & r1
            if (r3 == 0) goto Le
            return r0
        Le:
            r3 = 0
            return r3
    }

    public final java.lang.Object m() {
            r3 = this;
            int r0 = r3.f7676k
            if (r0 > 0) goto L17
            int r0 = r3.f7677l
            int r1 = r3.f7678m
            if (r0 < r1) goto Lb
            goto L17
        Lb:
            r1 = 1
            r3.f7679n = r1
            java.lang.Object[] r1 = r3.f7669d
            int r2 = r0 + 1
            r3.f7677l = r2
            r0 = r1[r0]
            return r0
        L17:
            r0 = 0
            r3.f7679n = r0
            i0.e r0 = i0.l.f5952a
            return r0
    }

    public final java.lang.Object n(int r4) {
            r3 = this;
            int r4 = r4 * 5
            int r0 = r4 + 1
            int[] r1 = r3.f7667b
            r0 = r1[r0]
            r2 = 1073741824(0x40000000, float:2.0)
            r0 = r0 & r2
            if (r0 == 0) goto L1b
            if (r0 == 0) goto L18
            java.lang.Object[] r0 = r3.f7669d
            int r4 = r4 + 4
            r4 = r1[r4]
            r4 = r0[r4]
            return r4
        L18:
            i0.e r4 = i0.l.f5952a
            return r4
        L1b:
            r4 = 0
            return r4
    }

    public final int o(int r2) {
            r1 = this;
            int r2 = r2 * 5
            int r2 = r2 + 1
            int[] r0 = r1.f7667b
            r2 = r0[r2]
            r0 = 67108863(0x3ffffff, float:1.5046327E-36)
            r2 = r2 & r0
            return r2
    }

    public final java.lang.Object p(int[] r3, int r4) {
            r2 = this;
            int r4 = r4 * 5
            int r0 = r4 + 1
            r0 = r3[r0]
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L1b
            java.lang.Object[] r1 = r2.f7669d
            int r4 = r4 + 4
            r3 = r3[r4]
            int r4 = r0 >> 30
            int r4 = java.lang.Integer.bitCount(r4)
            int r4 = r4 + r3
            r3 = r1[r4]
            return r3
        L1b:
            r3 = 0
            return r3
    }

    public final int q(int r2) {
            r1 = this;
            int r2 = r2 * 5
            int r2 = r2 + 2
            int[] r0 = r1.f7667b
            r2 = r0[r2]
            return r2
    }

    public final void r(int r4) {
            r3 = this;
            int r0 = r3.f7676k
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Cannot reposition while in an empty region"
            i0.m.a(r0)
        La:
            r3.f7672g = r4
            int[] r0 = r3.f7667b
            int r1 = r3.f7668c
            if (r4 >= r1) goto L19
            int r4 = r4 * 5
            int r4 = r4 + 2
            r4 = r0[r4]
            goto L1a
        L19:
            r4 = -1
        L1a:
            int r2 = r3.f7674i
            if (r4 == r2) goto L33
            r3.f7674i = r4
            if (r4 >= 0) goto L25
            r3.f7673h = r1
            goto L2e
        L25:
            int r1 = r4 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r4
            r3.f7673h = r0
        L2e:
            r4 = 0
            r3.f7677l = r4
            r3.f7678m = r4
        L33:
            return
    }

    public final int s() {
            r5 = this;
            int r0 = r5.f7676k
            if (r0 != 0) goto L5
            goto La
        L5:
            java.lang.String r0 = "Cannot skip while in an empty region"
            i0.m.a(r0)
        La:
            int r0 = r5.f7672g
            int r1 = r0 * 5
            int r2 = r1 + 1
            int[] r3 = r5.f7667b
            r2 = r3[r2]
            r4 = 1073741824(0x40000000, float:2.0)
            r4 = r4 & r2
            if (r4 == 0) goto L1b
            r2 = 1
            goto L1f
        L1b:
            r4 = 67108863(0x3ffffff, float:1.5046327E-36)
            r2 = r2 & r4
        L1f:
            int r1 = r1 + 3
            r1 = r3[r1]
            int r1 = r1 + r0
            r5.f7672g = r1
            return r2
    }

    public final void t() {
            r2 = this;
            int r0 = r2.f7676k
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = r1
        L8:
            if (r0 != 0) goto Lf
            java.lang.String r0 = "Cannot skip the enclosing group while in an empty region"
            i0.m.a(r0)
        Lf:
            int r0 = r2.f7673h
            r2.f7672g = r0
            r2.f7677l = r1
            r2.f7678m = r1
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SlotReader(current="
            r0.<init>(r1)
            int r1 = r3.f7672g
            r0.append(r1)
            java.lang.String r1 = ", key="
            r0.append(r1)
            int r1 = r3.g()
            r0.append(r1)
            java.lang.String r1 = ", parent="
            r0.append(r1)
            int r1 = r3.f7674i
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r3.f7673h
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }

    public final void u() {
            r6 = this;
            int r0 = r6.f7676k
            if (r0 > 0) goto L4e
            int r0 = r6.f7674i
            int r1 = r6.f7672g
            int r2 = r1 * 5
            int r3 = r2 + 2
            int[] r4 = r6.f7667b
            r3 = r4[r3]
            if (r3 != r0) goto L13
            goto L18
        L13:
            java.lang.String r0 = "Invalid slot table detected"
            i0.n1.a(r0)
        L18:
            int r0 = r6.f7677l
            int r3 = r6.f7678m
            i0.m0 r5 = r6.f7675j
            if (r0 != 0) goto L27
            if (r3 != 0) goto L27
            r0 = -1
            r5.c(r0)
            goto L2a
        L27:
            r5.c(r0)
        L2a:
            r6.f7674i = r1
            int r2 = r2 + 3
            r0 = r4[r2]
            int r0 = r0 + r1
            r6.f7673h = r0
            int r0 = r1 + 1
            r6.f7672g = r0
            int r2 = l0.j.b(r4, r1)
            r6.f7677l = r2
            int r2 = r6.f7668c
            int r2 = r2 + (-1)
            if (r1 < r2) goto L46
            int r0 = r6.f7670e
            goto L4c
        L46:
            int r0 = r0 * 5
            int r0 = r0 + 4
            r0 = r4[r0]
        L4c:
            r6.f7678m = r0
        L4e:
            return
    }
}
