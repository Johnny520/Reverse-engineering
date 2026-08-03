package s1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f12294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f12301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f12302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f12303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f12304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f12305o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f12306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public s1.t f12307q;

    public t(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, int r35, java.util.ArrayList r36, long r37, float r39, long r40, long r42) {
            r21 = this;
            r14 = 0
            r0 = r21
            r1 = r22
            r3 = r24
            r5 = r26
            r7 = r28
            r8 = r29
            r9 = r30
            r11 = r32
            r13 = r34
            r15 = r35
            r16 = r37
            r18 = r39
            r19 = r40
            r0.<init>(r1, r3, r5, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19)
            r1 = r36
            r0.f12303m = r1
            r1 = r42
            r0.f12304n = r1
            return
    }

    public t(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, boolean r14, int r15, long r16, float r18, long r19) {
            r0 = this;
            r0.<init>()
            r0.f12291a = r1
            r0.f12292b = r3
            r0.f12293c = r5
            r0.f12294d = r7
            r0.f12295e = r8
            r0.f12296f = r9
            r0.f12297g = r11
            r0.f12298h = r13
            r1 = r15
            r0.f12299i = r1
            r1 = r16
            r0.f12300j = r1
            r1 = r18
            r0.f12301k = r1
            r1 = r19
            r0.f12302l = r1
            r1 = 0
            r0.f12304n = r1
            r0.f12305o = r14
            r0.f12306p = r14
            return
    }

    public final void a() {
            r1 = this;
            s1.t r0 = r1.f12307q
            if (r0 != 0) goto La
            r0 = 1
            r1.f12305o = r0
            r1.f12306p = r0
            return
        La:
            if (r0 == 0) goto Lf
            r0.a()
        Lf:
            return
    }

    public final boolean b() {
            r1 = this;
            s1.t r0 = r1.f12307q
            if (r0 == 0) goto L9
            boolean r0 = r0.b()
            return r0
        L9:
            boolean r0 = r1.f12305o
            if (r0 != 0) goto L14
            boolean r0 = r1.f12306p
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            return r0
        L14:
            r0 = 1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerInputChange(id="
            r0.<init>(r1)
            long r1 = r3.f12291a
            java.lang.String r1 = s1.s.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.f12292b
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.f12293c
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", pressed="
            r0.append(r1)
            boolean r1 = r3.f12294d
            r0.append(r1)
            java.lang.String r1 = ", pressure="
            r0.append(r1)
            float r1 = r3.f12295e
            r0.append(r1)
            java.lang.String r1 = ", previousUptimeMillis="
            r0.append(r1)
            long r1 = r3.f12296f
            r0.append(r1)
            java.lang.String r1 = ", previousPosition="
            r0.append(r1)
            long r1 = r3.f12297g
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", previousPressed="
            r0.append(r1)
            boolean r1 = r3.f12298h
            r0.append(r1)
            java.lang.String r1 = ", isConsumed="
            r0.append(r1)
            boolean r1 = r3.b()
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r3.f12299i
            java.lang.String r1 = s1.d0.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", historical="
            r0.append(r1)
            java.util.ArrayList r1 = r3.f12303m
            if (r1 != 0) goto L83
            tf.t r1 = tf.t.f13167g
        L83:
            r0.append(r1)
            java.lang.String r1 = ", scrollDelta="
            r0.append(r1)
            long r1 = r3.f12300j
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", scaleFactor="
            r0.append(r1)
            float r1 = r3.f12301k
            r0.append(r1)
            java.lang.String r1 = ", panOffset="
            r0.append(r1)
            long r1 = r3.f12302l
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
