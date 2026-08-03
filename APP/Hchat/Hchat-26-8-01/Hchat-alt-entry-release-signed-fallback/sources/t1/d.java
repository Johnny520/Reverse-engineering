package t1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.c f12987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t1.a[] f12989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f12991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f12992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f12993h;

    public /* synthetic */ d() {
            r2 = this;
            t1.c r0 = t1.c.f12983g
            r1 = 0
            r2.<init>(r1, r0)
            return
    }

    public d(int r2) {
            r1 = this;
            r2 = 1
            t1.c r0 = t1.c.f12984h
            r1.<init>(r2, r0)
            return
    }

    public d(boolean r2, t1.c r3) {
            r1 = this;
            r1.<init>()
            r1.f12986a = r2
            r1.f12987b = r3
            if (r2 == 0) goto L19
            t1.c r2 = t1.c.f12983g
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L12
            goto L19
        L12:
            java.lang.String r2 = "Lsq2 not (yet) supported for differential axes"
            j8.o.A(r2)
            r2 = 0
            throw r2
        L19:
            int r2 = r3.ordinal()
            r3 = 3
            if (r2 == 0) goto L2a
            r0 = 1
            if (r2 != r0) goto L25
            r2 = 2
            goto L2b
        L25:
            okio.a.k()
            r2 = 0
            throw r2
        L2a:
            r2 = r3
        L2b:
            r1.f12988c = r2
            r2 = 20
            t1.a[] r0 = new t1.a[r2]
            r1.f12989d = r0
            float[] r0 = new float[r2]
            r1.f12991f = r0
            float[] r2 = new float[r2]
            r1.f12992g = r2
            float[] r2 = new float[r3]
            r1.f12993h = r2
            return
    }

    public final void a(long r4, float r6) {
            r3 = this;
            int r0 = r3.f12990e
            int r0 = r0 + 1
            int r0 = r0 % 20
            r3.f12990e = r0
            t1.a[] r1 = r3.f12989d
            r2 = r1[r0]
            if (r2 != 0) goto L1a
            t1.a r2 = new t1.a
            r2.<init>()
            r2.f12978a = r4
            r2.f12979b = r6
            r1[r0] = r2
            return
        L1a:
            r2.f12978a = r4
            r2.f12979b = r6
            return
    }

    public final float b(float r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 <= 0) goto La
            goto L1b
        La:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "maximumVelocity should be a positive value. You specified="
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            u1.a.b(r3)
        L1b:
            int r3 = r0.f12990e
            t1.a[] r4 = r0.f12989d
            r5 = r4[r3]
            if (r5 != 0) goto L27
            r16 = r2
            goto Lf6
        L27:
            r6 = 0
            r7 = r5
        L29:
            r8 = r4[r3]
            boolean r10 = r0.f12986a
            t1.c r11 = r0.f12987b
            float[] r12 = r0.f12991f
            float[] r13 = r0.f12992g
            if (r8 != 0) goto L3b
            r16 = r2
            r18 = r10
            r15 = 1
            goto L7f
        L3b:
            long r14 = r5.f12978a
            r16 = r2
            r17 = r3
            long r2 = r8.f12978a
            long r14 = r14 - r2
            float r14 = (float) r14
            r18 = r10
            r15 = 1
            long r9 = r7.f12978a
            long r2 = r2 - r9
            long r2 = java.lang.Math.abs(r2)
            float r2 = (float) r2
            t1.c r3 = t1.c.f12983g
            if (r11 == r3) goto L59
            if (r18 == 0) goto L57
            goto L59
        L57:
            r7 = r5
            goto L5a
        L59:
            r7 = r8
        L5a:
            r3 = 1120403456(0x42c80000, float:100.0)
            int r3 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r3 > 0) goto L7f
            r3 = 1109393408(0x42200000, float:40.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L67
            goto L7f
        L67:
            float r2 = r8.f12979b
            r12[r6] = r2
            float r2 = -r14
            r13[r6] = r2
            r2 = 20
            if (r17 != 0) goto L74
            r3 = r2
            goto L76
        L74:
            r3 = r17
        L76:
            int r3 = r3 - r15
            int r6 = r6 + 1
            if (r6 < r2) goto L7c
            goto L7f
        L7c:
            r2 = r16
            goto L29
        L7f:
            int r2 = r0.f12988c
            if (r6 < r2) goto Lf4
            int r2 = r11.ordinal()
            if (r2 == 0) goto Le4
            if (r2 != r15) goto Ldf
            int r6 = r6 - r15
            r2 = r13[r6]
            r3 = r6
            r4 = r16
        L91:
            r5 = 2
            if (r3 <= 0) goto Lcd
            int r7 = r3 + (-1)
            r8 = r13[r7]
            int r9 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r9 != 0) goto L9d
            goto Lc9
        L9d:
            if (r18 == 0) goto La3
            r7 = r12[r7]
            float r7 = -r7
            goto La9
        La3:
            r9 = r12[r3]
            r7 = r12[r7]
            float r7 = r9 - r7
        La9:
            float r2 = r2 - r8
            float r7 = r7 / r2
            float r2 = java.lang.Math.signum(r4)
            float r5 = (float) r5
            float r9 = java.lang.Math.abs(r4)
            float r9 = r9 * r5
            double r9 = (double) r9
            double r9 = java.lang.Math.sqrt(r9)
            float r5 = (float) r9
            float r2 = r2 * r5
            float r2 = r7 - r2
            float r5 = java.lang.Math.abs(r7)
            float r5 = r5 * r2
            float r4 = r4 + r5
            if (r3 != r6) goto Lc9
            r2 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r2
        Lc9:
            int r3 = r3 + (-1)
            r2 = r8
            goto L91
        Lcd:
            float r2 = java.lang.Math.signum(r4)
            float r3 = (float) r5
            float r4 = java.lang.Math.abs(r4)
            float r4 = r4 * r3
            double r3 = (double) r4
            double r3 = java.lang.Math.sqrt(r3)
            float r3 = (float) r3
            float r2 = r2 * r3
            goto Lef
        Ldf:
            okio.a.k()
            r1 = 0
            return r1
        Le4:
            float[] r2 = r0.f12993h     // Catch: java.lang.IllegalArgumentException -> Led
            g4.a.F(r13, r12, r6, r2)     // Catch: java.lang.IllegalArgumentException -> Led
            r15 = 1
            r2 = r2[r15]     // Catch: java.lang.IllegalArgumentException -> Led
            goto Lef
        Led:
            r2 = r16
        Lef:
            r3 = 1000(0x3e8, float:1.401E-42)
            float r3 = (float) r3
            float r2 = r2 * r3
            goto Lf6
        Lf4:
            r2 = r16
        Lf6:
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 != 0) goto Lfb
            goto L101
        Lfb:
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 == 0) goto L104
        L101:
            r2 = r16
            goto L116
        L104:
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 <= 0) goto L110
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 <= 0) goto L10d
            goto L10e
        L10d:
            r1 = r2
        L10e:
            r2 = r1
            goto L116
        L110:
            float r1 = -r1
            int r3 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r3 >= 0) goto L116
            goto L10e
        L116:
            return r2
    }
}
