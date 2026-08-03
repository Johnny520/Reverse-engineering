package a5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class a implements v5.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f55g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f56h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.Object f57i;

    public a() {
            r1 = this;
            r0 = 3
            r1.f55g = r0
            r1.<init>()
            r0 = 1
            r1.f56h = r0
            r0 = 0
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r1.f57i = r0
            return
    }

    public /* synthetic */ a(byte r1, int r2) {
            r0 = this;
            r0.f55g = r2
            r0.<init>()
            return
    }

    public a(int r1, int r2) {
            r0 = this;
            r0.f55g = r2
            switch(r2) {
                case 11: goto L12;
                default: goto L5;
            }
        L5:
            r0.<init>()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r0.f57i = r2
            r0.f56h = r1
            return
        L12:
            r0.<init>()
            z4.g r2 = new z4.g
            r2.<init>(r1)
            r0.f57i = r2
            return
    }

    public /* synthetic */ a(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f55g = r2
            r0.f57i = r3
            r0.f56h = r1
            r0.<init>()
            return
    }

    public a(ac.k r2) {
            r1 = this;
            r0 = 4
            r1.f55g = r0
            r1.<init>()
            r1.f57i = r2
            return
    }

    public a(java.util.ArrayList r2) {
            r1 = this;
            r0 = 3
            r1.f55g = r0
            r1.<init>()
            r0 = 0
            r1.f56h = r0
            r1.f57i = r2
            return
    }

    public static void b(a5.a r3) {
            java.lang.Object r0 = r3.f57i
            d7.g r0 = (d7.g) r0
            boolean r1 = r3.g()
            r2 = 1
            if (r1 != r2) goto Lc
            return
        Lc:
            int r3 = r3.f56h
            int r3 = r3 + r2
            byte[] r0 = r0.f11553k
            r1 = r0[r3]
            r1 = r1 & 247(0xf7, float:3.46E-43)
            r1 = r1 | 8
            byte r1 = (byte) r1
            r0[r3] = r1
            return
    }

    @Override // v5.b
    public void a() {
            r4 = this;
            v5.a r0 = new v5.a
            java.lang.Object r1 = r4.f57i
            f5.h r1 = (f5.h) r1
            int r2 = r1.f3302h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.f56h
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "%d@%d"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2, r1)
            throw r0
    }

    public void c(long r5) {
            r4 = this;
            boolean r0 = r4.e(r5)
            if (r0 != 0) goto L28
            int r0 = r4.f56h
            java.lang.Object r1 = r4.f57i
            long[] r1 = (long[]) r1
            int r2 = r1.length
            if (r0 < r2) goto L1e
            int r2 = r0 + 1
            int r3 = r1.length
            int r3 = r3 * 2
            int r2 = java.lang.Math.max(r2, r3)
            long[] r1 = java.util.Arrays.copyOf(r1, r2)
            r4.f57i = r1
        L1e:
            r1[r0] = r5
            int r5 = r4.f56h
            if (r0 < r5) goto L28
            int r0 = r0 + 1
            r4.f56h = r0
        L28:
            return
    }

    public void d(int r4, int r5, int r6) {
            r3 = this;
            java.lang.Object r0 = r3.f57i
            z4.g r0 = (z4.g) r0
            int r1 = r0.f22552i
            if (r4 < r1) goto L13
            int r1 = r4 - r1
        La:
            if (r1 < 0) goto L13
            r2 = -1
            r0.l(r2)
            int r1 = r1 + (-1)
            goto La
        L13:
            r0.q(r4, r5)
            int r4 = r3.f56h
            int r5 = r5 + r6
            if (r4 >= r5) goto L1d
            r3.f56h = r5
        L1d:
            return
    }

    public boolean e(long r7) {
            r6 = this;
            int r0 = r6.f56h
            r1 = 0
            r2 = r1
        L4:
            if (r2 >= r0) goto L15
            java.lang.Object r3 = r6.f57i
            long[] r3 = (long[]) r3
            r4 = r3[r2]
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 != 0) goto L12
            r7 = 1
            return r7
        L12:
            int r2 = r2 + 1
            goto L4
        L15:
            return r1
    }

    public int f() {
            r2 = this;
            java.lang.Object r0 = r2.f57i
            ac.k r0 = (ac.k) r0
            r1 = 12
            r0.B(r1)
            java.lang.Object r0 = r0.f178i
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt()
            return r0
    }

    public boolean g() {
            r3 = this;
            java.lang.Object r0 = r3.f57i
            d7.g r0 = (d7.g) r0
            int r1 = r3.f56h
            int r1 = r1 + 1
            r2 = 3
            byte[] r0 = r0.f11553k
            boolean r0 = k7.a.q(r0, r1, r2)
            return r0
    }

    public int h(int r5) {
            r4 = this;
            java.lang.Object r0 = r4.f57i
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.getClass()
            int r1 = r4.f56h
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r2 = 1
            if (r5 == r2) goto L6d
            r2 = 2
            if (r5 == r2) goto L62
            r2 = 3
            if (r5 == r2) goto L4e
            r2 = 4
            if (r5 != r2) goto L37
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = r1 + 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            int r3 = r1 + 3
            r0 = r0[r3]
            int r0 = r0 << 24
        L35:
            r0 = r0 | r2
            goto L6f
        L37:
            d6.f r0 = new d6.f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r1 = r4.f56h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r1}
            r1 = 0
            java.lang.String r2 = "Invalid size %d for sized int at offset 0x%x"
            r0.<init>(r1, r2, r5)
            throw r0
        L4e:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = r1 + 2
            r0 = r0[r3]
            int r0 = r0 << 16
            goto L35
        L62:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r0 = r0[r3]
            int r0 = r0 << 8
            goto L35
        L6d:
            r0 = r0[r1]
        L6f:
            int r1 = r1 + r5
            r4.f56h = r1
            return r0
    }

    public long i(int r13) {
            r12 = this;
            java.lang.Object r0 = r12.f57i
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.getClass()
            int r1 = r12.f56h
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r2 = 48
            r3 = 40
            r4 = 32
            r5 = 24
            r6 = 255(0xff, double:1.26E-321)
            switch(r13) {
                case 1: goto L14e;
                case 2: goto L143;
                case 3: goto L12d;
                case 4: goto L10d;
                case 5: goto Le4;
                case 6: goto Lb2;
                case 7: goto L77;
                case 8: goto L31;
                default: goto L1a;
            }
        L1a:
            d6.f r0 = new d6.f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            int r1 = r12.f56h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r1}
            r1 = 0
            java.lang.String r2 = "Invalid size %d for sized long at offset 0x%x"
            r0.<init>(r1, r2, r13)
            throw r0
        L31:
            r8 = r0[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r1 + 1
            r9 = r0[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            r8 = r8 | r9
            int r9 = r1 + 2
            r9 = r0[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
            r8 = r8 | r9
            long r8 = (long) r8
            int r10 = r1 + 3
            r10 = r0[r10]
            long r10 = (long) r10
            long r10 = r10 & r6
            long r10 = r10 << r5
            long r8 = r8 | r10
            int r5 = r1 + 4
            r5 = r0[r5]
            long r10 = (long) r5
            long r10 = r10 & r6
            long r4 = r10 << r4
            long r4 = r4 | r8
            int r8 = r1 + 5
            r8 = r0[r8]
            long r8 = (long) r8
            long r8 = r8 & r6
            long r8 = r8 << r3
            long r3 = r4 | r8
            int r5 = r1 + 6
            r5 = r0[r5]
            long r8 = (long) r5
            long r5 = r8 & r6
            long r5 = r5 << r2
            long r2 = r3 | r5
            int r4 = r1 + 7
            r0 = r0[r4]
            long r4 = (long) r0
            r0 = 56
            long r4 = r4 << r0
        L74:
            long r2 = r2 | r4
            goto L151
        L77:
            r8 = r0[r1]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r9 = r1 + 1
            r9 = r0[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            r8 = r8 | r9
            int r9 = r1 + 2
            r9 = r0[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
            r8 = r8 | r9
            long r8 = (long) r8
            int r10 = r1 + 3
            r10 = r0[r10]
            long r10 = (long) r10
            long r10 = r10 & r6
            long r10 = r10 << r5
            long r8 = r8 | r10
            int r5 = r1 + 4
            r5 = r0[r5]
            long r10 = (long) r5
            long r10 = r10 & r6
            long r4 = r10 << r4
            long r4 = r4 | r8
            int r8 = r1 + 5
            r8 = r0[r8]
            long r8 = (long) r8
            long r6 = r6 & r8
            long r6 = r6 << r3
            long r3 = r4 | r6
            int r5 = r1 + 6
            r0 = r0[r5]
            long r5 = (long) r0
            long r5 = r5 << r2
            long r2 = r3 | r5
            goto L151
        Lb2:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r8 = r1 + 1
            r8 = r0[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 8
            r2 = r2 | r8
            int r8 = r1 + 2
            r8 = r0[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << 16
            r2 = r2 | r8
            long r8 = (long) r2
            int r2 = r1 + 3
            r2 = r0[r2]
            long r10 = (long) r2
            long r10 = r10 & r6
            long r10 = r10 << r5
            long r8 = r8 | r10
            int r2 = r1 + 4
            r2 = r0[r2]
            long r10 = (long) r2
            long r5 = r10 & r6
            long r4 = r5 << r4
            long r4 = r4 | r8
            int r2 = r1 + 5
            r0 = r0[r2]
            long r6 = (long) r0
            long r2 = r6 << r3
            long r2 = r2 | r4
            goto L151
        Le4:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = r1 + 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            long r2 = (long) r2
            int r8 = r1 + 3
            r8 = r0[r8]
            long r8 = (long) r8
            long r6 = r6 & r8
            long r5 = r6 << r5
            long r2 = r2 | r5
            int r5 = r1 + 4
            r0 = r0[r5]
            long r5 = (long) r0
            long r4 = r5 << r4
            goto L74
        L10d:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = r1 + 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            long r2 = (long) r2
            int r4 = r1 + 3
            r0 = r0[r4]
            long r6 = (long) r0
            long r4 = r6 << r5
            goto L74
        L12d:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = r1 + 2
            r0 = r0[r3]
            int r0 = r0 << 16
        L140:
            r0 = r0 | r2
        L141:
            long r2 = (long) r0
            goto L151
        L143:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r0 = r0[r3]
            int r0 = r0 << 8
            goto L140
        L14e:
            r0 = r0[r1]
            goto L141
        L151:
            int r1 = r1 + r13
            r12.f56h = r1
            return r2
    }

    public int j(int r5) {
            r4 = this;
            java.lang.Object r0 = r4.f57i
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.getClass()
            int r1 = r4.f56h
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r2 = 1
            if (r5 == r2) goto L6d
            r2 = 2
            if (r5 == r2) goto L62
            r2 = 3
            if (r5 == r2) goto L4e
            r2 = 4
            if (r5 != r2) goto L37
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r2 = r2 | r3
            int r3 = r1 + 2
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            int r3 = r1 + 3
            r0 = r0[r3]
        L33:
            int r0 = r0 << 24
            r0 = r0 | r2
            goto L71
        L37:
            d6.f r0 = new d6.f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r1 = r4.f56h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r1}
            r1 = 0
            java.lang.String r2 = "Invalid size %d for sized, right extended int at offset 0x%x"
            r0.<init>(r1, r2, r5)
            throw r0
        L4e:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            int r3 = r1 + 1
            r3 = r0[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 16
            r2 = r2 | r3
            int r3 = r1 + 2
            r0 = r0[r3]
            goto L33
        L62:
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            int r3 = r1 + 1
            r0 = r0[r3]
            goto L33
        L6d:
            r0 = r0[r1]
            int r0 = r0 << 24
        L71:
            int r1 = r1 + r5
            r4.f56h = r1
            return r0
    }

    public long k(int r14) {
            r13 = this;
            java.lang.Object r0 = r13.f57i
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.getClass()
            int r1 = r13.f56h
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r2 = 24
            r3 = 32
            r4 = 40
            r5 = 48
            r6 = 56
            r7 = 255(0xff, double:1.26E-321)
            switch(r14) {
                case 1: goto L13b;
                case 2: goto L130;
                case 3: goto L11c;
                case 4: goto Lff;
                case 5: goto Lda;
                case 6: goto Lac;
                case 7: goto L75;
                case 8: goto L33;
                default: goto L1c;
            }
        L1c:
            d6.f r0 = new d6.f
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r1 = r13.f56h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r1}
            r1 = 0
            java.lang.String r2 = "Invalid size %d for sized, right extended long at offset 0x%x"
            r0.<init>(r1, r2, r14)
            throw r0
        L33:
            r9 = r0[r1]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r10 = r1 + 1
            r10 = r0[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r9 = r9 | r10
            int r10 = r1 + 2
            r10 = r0[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r9 = r9 | r10
            long r9 = (long) r9
            int r11 = r1 + 3
            r11 = r0[r11]
            long r11 = (long) r11
            long r11 = r11 & r7
            long r11 = r11 << r2
            long r9 = r9 | r11
            int r2 = r1 + 4
            r2 = r0[r2]
            long r11 = (long) r2
            long r11 = r11 & r7
            long r2 = r11 << r3
            long r2 = r2 | r9
            int r9 = r1 + 5
            r9 = r0[r9]
            long r9 = (long) r9
            long r9 = r9 & r7
            long r9 = r9 << r4
            long r2 = r2 | r9
            int r4 = r1 + 6
            r4 = r0[r4]
            long r9 = (long) r4
            long r7 = r7 & r9
            long r4 = r7 << r5
            long r2 = r2 | r4
            int r4 = r1 + 7
            r0 = r0[r4]
        L70:
            long r4 = (long) r0
            long r4 = r4 << r6
            long r2 = r2 | r4
            goto L13f
        L75:
            r9 = r0[r1]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 8
            int r10 = r1 + 1
            r10 = r0[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 16
            r9 = r9 | r10
            long r9 = (long) r9
            int r11 = r1 + 2
            r11 = r0[r11]
            long r11 = (long) r11
            long r11 = r11 & r7
            long r11 = r11 << r2
            long r9 = r9 | r11
            int r2 = r1 + 3
            r2 = r0[r2]
            long r11 = (long) r2
            long r11 = r11 & r7
            long r2 = r11 << r3
            long r2 = r2 | r9
            int r9 = r1 + 4
            r9 = r0[r9]
            long r9 = (long) r9
            long r9 = r9 & r7
            long r9 = r9 << r4
            long r2 = r2 | r9
            int r4 = r1 + 5
            r4 = r0[r4]
            long r9 = (long) r4
            long r7 = r7 & r9
            long r4 = r7 << r5
            long r2 = r2 | r4
            int r4 = r1 + 6
            r0 = r0[r4]
            goto L70
        Lac:
            r9 = r0[r1]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
            long r9 = (long) r9
            int r11 = r1 + 1
            r11 = r0[r11]
            long r11 = (long) r11
            long r11 = r11 & r7
            long r11 = r11 << r2
            long r9 = r9 | r11
            int r2 = r1 + 2
            r2 = r0[r2]
            long r11 = (long) r2
            long r11 = r11 & r7
            long r2 = r11 << r3
            long r2 = r2 | r9
            int r9 = r1 + 3
            r9 = r0[r9]
            long r9 = (long) r9
            long r9 = r9 & r7
            long r9 = r9 << r4
            long r2 = r2 | r9
            int r4 = r1 + 4
            r4 = r0[r4]
            long r9 = (long) r4
            long r7 = r7 & r9
            long r4 = r7 << r5
            long r2 = r2 | r4
            int r4 = r1 + 5
            r0 = r0[r4]
            goto L70
        Lda:
            r9 = r0[r1]
            long r9 = (long) r9
            long r9 = r9 & r7
            long r9 = r9 << r2
            int r2 = r1 + 1
            r2 = r0[r2]
            long r11 = (long) r2
            long r11 = r11 & r7
            long r2 = r11 << r3
            long r2 = r2 | r9
            int r9 = r1 + 2
            r9 = r0[r9]
            long r9 = (long) r9
            long r9 = r9 & r7
            long r9 = r9 << r4
            long r2 = r2 | r9
            int r4 = r1 + 3
            r4 = r0[r4]
            long r9 = (long) r4
            long r7 = r7 & r9
            long r4 = r7 << r5
            long r2 = r2 | r4
            int r4 = r1 + 4
            r0 = r0[r4]
            goto L70
        Lff:
            r2 = r0[r1]
            long r9 = (long) r2
            long r9 = r9 & r7
            long r2 = r9 << r3
            int r9 = r1 + 1
            r9 = r0[r9]
            long r9 = (long) r9
            long r9 = r9 & r7
            long r9 = r9 << r4
            long r2 = r2 | r9
            int r4 = r1 + 2
            r4 = r0[r4]
            long r9 = (long) r4
            long r7 = r7 & r9
            long r4 = r7 << r5
            long r2 = r2 | r4
            int r4 = r1 + 3
            r0 = r0[r4]
            goto L70
        L11c:
            r2 = r0[r1]
            long r2 = (long) r2
            long r2 = r2 & r7
            long r2 = r2 << r4
            int r4 = r1 + 1
            r4 = r0[r4]
            long r9 = (long) r4
            long r7 = r7 & r9
            long r4 = r7 << r5
            long r2 = r2 | r4
            int r4 = r1 + 2
            r0 = r0[r4]
            goto L70
        L130:
            r2 = r0[r1]
            long r2 = (long) r2
            long r2 = r2 & r7
            long r2 = r2 << r5
            int r4 = r1 + 1
            r0 = r0[r4]
            goto L70
        L13b:
            r0 = r0[r1]
            long r2 = (long) r0
            long r2 = r2 << r6
        L13f:
            int r1 = r1 + r14
            r13.f56h = r1
            return r2
    }

    public int l(int r5) {
            r4 = this;
            java.lang.Object r0 = r4.f57i
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.getClass()
            int r1 = r4.f56h
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            r2 = 1
            r3 = 0
            if (r5 == r2) goto L5c
            r2 = 2
            if (r5 == r2) goto L53
            r2 = 3
            if (r5 == r2) goto L4a
            r2 = 4
            r3 = 0
            if (r5 != r2) goto L34
            int r2 = r1 + 3
            r2 = r0[r2]
            if (r2 < 0) goto L24
            int r3 = r2 << 24
            goto L4a
        L24:
            d6.f r5 = new d6.f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Encountered valid sized uint that is out of range at offset 0x%x"
            r5.<init>(r3, r1, r0)
            throw r5
        L34:
            d6.f r0 = new d6.f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r1 = r4.f56h
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r1}
            java.lang.String r1 = "Invalid size %d for sized uint at offset 0x%x"
            r0.<init>(r3, r1, r5)
            throw r0
        L4a:
            int r2 = r1 + 2
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r3 = r3 | r2
        L53:
            int r2 = r1 + 1
            r2 = r0[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r3 = r3 | r2
        L5c:
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | r3
            int r1 = r1 + r5
            r4.f56h = r1
            return r0
    }

    public int m() {
            r7 = this;
            java.lang.Object r0 = r7.f57i
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.getClass()
            int r1 = r7.f56h
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            int r2 = r1 + 1
            r3 = r0[r1]
            r4 = r3 & 255(0xff, float:3.57E-43)
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 > r5) goto L1c
            int r0 = r4 << 25
            int r0 = r0 >> 25
            goto L5e
        L1c:
            int r4 = r1 + 2
            r2 = r0[r2]
            r6 = r2 & 255(0xff, float:3.57E-43)
            r3 = r3 & r5
            r2 = r2 & r5
            int r2 = r2 << 7
            r2 = r2 | r3
            if (r6 > r5) goto L2f
            int r0 = r2 << 18
            int r0 = r0 >> 18
        L2d:
            r2 = r4
            goto L5e
        L2f:
            int r3 = r1 + 3
            r4 = r0[r4]
            r6 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 & r5
            int r4 = r4 << 14
            r2 = r2 | r4
            if (r6 > r5) goto L41
            int r0 = r2 << 11
            int r0 = r0 >> 11
        L3f:
            r2 = r3
            goto L5e
        L41:
            int r4 = r1 + 4
            r3 = r0[r3]
            r6 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 & r5
            int r3 = r3 << 21
            r2 = r2 | r3
            if (r6 > r5) goto L52
            int r0 = r2 << 4
            int r0 = r0 >> 4
            goto L2d
        L52:
            int r3 = r1 + 5
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 > r5) goto L61
            int r0 = r0 << 28
            r0 = r0 | r2
            goto L3f
        L5e:
            r7.f56h = r2
            return r0
        L61:
            d6.f r0 = new d6.f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 0
            java.lang.String r3 = "Invalid sleb128 integer encountered at offset 0x%x"
            r0.<init>(r2, r3, r1)
            throw r0
    }

    public int n() {
            r2 = this;
            int r0 = r2.f56h
            java.lang.Object r1 = r2.f57i
            androidx.lifecycle.x r1 = (androidx.lifecycle.x) r1
            int r1 = r1.O(r0)
            int r0 = r0 + 1
            r2.f56h = r0
            return r1
    }

    public int o(boolean r10) {
            r9 = this;
            java.lang.Object r0 = r9.f57i
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.getClass()
            int r1 = r9.f56h
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            int r2 = r1 + 1
            r3 = r0[r1]
            r4 = r3 & 255(0xff, float:3.57E-43)
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 <= r5) goto L72
            int r4 = r1 + 2
            r2 = r0[r2]
            r6 = r2 & 255(0xff, float:3.57E-43)
            r3 = r3 & r5
            r2 = r2 & r5
            r7 = 7
            int r2 = r2 << r7
            r2 = r2 | r3
            if (r6 <= r5) goto L6f
            int r3 = r1 + 3
            r4 = r0[r4]
            r6 = r4 & 255(0xff, float:3.57E-43)
            r4 = r4 & r5
            int r4 = r4 << 14
            r4 = r4 | r2
            if (r6 <= r5) goto L5d
            int r2 = r1 + 4
            r3 = r0[r3]
            r6 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 & r5
            int r3 = r3 << 21
            r4 = r4 | r3
            if (r6 <= r5) goto L72
            int r3 = r1 + 5
            r0 = r0[r2]
            r2 = 0
            if (r0 < 0) goto L5f
            r5 = r0 & 15
            if (r5 <= r7) goto L5a
            if (r10 == 0) goto L4a
            goto L5a
        L4a:
            d6.f r10 = new d6.f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Encountered valid uleb128 that is out of range at offset 0x%x"
            r10.<init>(r2, r1, r0)
            throw r10
        L5a:
            int r10 = r0 << 28
            r4 = r4 | r10
        L5d:
            r2 = r3
            goto L72
        L5f:
            d6.f r10 = new d6.f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "Invalid uleb128 integer encountered at offset 0x%x"
            r10.<init>(r2, r1, r0)
            throw r10
        L6f:
            r8 = r4
            r4 = r2
            r2 = r8
        L72:
            r9.f56h = r2
            return r4
    }

    public void p(long r6) {
            r5 = this;
            int r0 = r5.f56h
            r1 = 0
        L3:
            if (r1 >= r0) goto L2b
            java.lang.Object r2 = r5.f57i
            long[] r2 = (long[]) r2
            r3 = r2[r1]
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 != 0) goto L28
            int r6 = r5.f56h
            int r6 = r6 + (-1)
        L13:
            if (r1 >= r6) goto L21
            java.lang.Object r7 = r5.f57i
            long[] r7 = (long[]) r7
            int r0 = r1 + 1
            r2 = r7[r0]
            r7[r1] = r2
            r1 = r0
            goto L13
        L21:
            int r6 = r5.f56h
            int r6 = r6 + (-1)
            r5.f56h = r6
            return
        L28:
            int r1 = r1 + 1
            goto L3
        L2b:
            return
    }

    public void q() {
            r4 = this;
            java.lang.Object r0 = r4.f57i
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            r0.getClass()
            int r1 = r4.f56h
            java.lang.Object r0 = r0.f310h
            byte[] r0 = (byte[]) r0
            int r2 = r1 + 1
            r3 = r0[r1]
            if (r3 >= 0) goto L3e
            int r3 = r1 + 2
            r2 = r0[r2]
            if (r2 >= 0) goto L3d
            int r2 = r1 + 3
            r3 = r0[r3]
            if (r3 >= 0) goto L3e
            int r3 = r1 + 4
            r2 = r0[r2]
            if (r2 >= 0) goto L3d
            int r2 = r1 + 5
            r0 = r0[r3]
            if (r0 < 0) goto L2c
            goto L3e
        L2c:
            d6.f r0 = new d6.f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r2 = 0
            java.lang.String r3 = "Invalid uleb128 integer encountered at offset 0x%x"
            r0.<init>(r2, r3, r1)
            throw r0
        L3d:
            r2 = r3
        L3e:
            r4.f56h = r2
            return
    }

    public void r(java.util.function.Consumer r12) {
            r11 = this;
            gf.a r0 = new gf.a
            java.lang.Object r1 = r11.f57i
            ac.k r1 = (ac.k) r1
            ac.k r2 = r1.g()
            r0.<init>(r11, r2)
            r2 = 12
            r1.B(r2)
            java.lang.Object r2 = r1.f178i
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r3 = r2.getInt()
            r4 = 0
            r5 = r4
        L1c:
            if (r5 >= r3) goto Lc9
            r2.position()
            int r6 = r1.L()
            gf.c[] r7 = gf.c.f4531e
            r7 = r6 & 255(0xff, float:3.57E-43)
            if (r7 != 0) goto L3a
            if (r6 == 0) goto L3a
            java.util.concurrent.ConcurrentHashMap r7 = gf.c.f4532f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            java.lang.Object r7 = r7.get(r8)
            gf.c r7 = (gf.c) r7
            goto L3e
        L3a:
            gf.c[] r8 = gf.c.f4531e
            r7 = r8[r7]
        L3e:
            r0.f4498h = r5
            r0.f4494d = r7
            r0.f4496f = r6
            r6 = 0
            r0.f4504n = r6
            r0.f4495e = r4
            r6 = 1
            if (r7 == 0) goto L57
            gf.b r7 = r7.f4535c
            int r8 = r7.f4529b
            r0.f4500j = r8
            int r7 = r7.f4528a
            r0.f4497g = r7
            goto L5b
        L57:
            r0.f4500j = r4
            r0.f4497g = r6
        L5b:
            r12.accept(r0)
            boolean r7 = r0.f4495e
            if (r7 != 0) goto Lc4
            gf.c r7 = r0.f4494d
            if (r7 == 0) goto Lc4
            gf.b r7 = r7.f4535c
            a5.a r8 = r0.f4491a
            java.lang.Object r8 = r8.f57i
            ac.k r8 = (ac.k) r8
            int r9 = r7.f4530c
            switch(r9) {
                case 19: goto Lb3;
                case 20: goto La3;
                case 21: goto L73;
                case 22: goto L80;
                default: goto L73;
            }
        L73:
            int r7 = r7.f4528a
            if (r7 != r6) goto L78
            goto Lc4
        L78:
            int r7 = r7 + (-1)
            int r7 = r7 * 2
            r8.M(r7)
            goto Lc4
        L80:
            int r7 = r8.L()
            java.lang.Object r9 = r8.f178i
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            int r9 = r9.getInt()
            if (r7 != r6) goto L95
            int r10 = r9 % 2
            int r10 = r10 + r9
            r8.M(r10)
            goto L9a
        L95:
            int r10 = r9 * r7
            r8.M(r10)
        L9a:
            int r9 = r9 * r7
            int r9 = r9 + r6
            int r9 = r9 / 2
            int r9 = r9 + 4
            r0.f4497g = r9
            goto Lc4
        La3:
            int r6 = r8.L()
            int r7 = r6 * 8
            r8.M(r7)
            int r6 = r6 * 4
            int r6 = r6 + 2
            r0.f4497g = r6
            goto Lc4
        Lb3:
            int r6 = r8.L()
            int r7 = r6 * 4
            int r7 = r7 + 4
            r8.M(r7)
            int r6 = r6 * 2
            int r6 = r6 + 4
            r0.f4497g = r6
        Lc4:
            int r6 = r0.f4497g
            int r5 = r5 + r6
            goto L1c
        Lc9:
            return
    }

    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.f55g
            switch(r0) {
                case 1: goto L2d;
                case 2: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = super.toString()
            return r0
        La:
            int r0 = r5.f56h
            r1 = 1
            if (r0 == r1) goto L18
            r1 = 2
            if (r0 == r1) goto L15
            java.lang.String r0 = "null"
            goto L1a
        L15:
            java.lang.String r0 = "FLAG"
            goto L1a
        L18:
            java.lang.String r0 = "ENUM"
        L1a:
            java.lang.Object r1 = r5.f57i
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = ", "
            java.lang.String r3 = "]"
            java.lang.String r4 = "["
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
        L2d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Enc="
            r0.<init>(r1)
            java.lang.Object r1 = r5.f57i
            d7.g r1 = (d7.g) r1
            int r2 = r5.f56h
            r3 = 0
            byte[] r4 = r1.f11553k
            boolean r3 = k7.a.q(r4, r2, r3)
            r0.append(r3)
            java.lang.String r3 = ", Descriptor="
            r0.append(r3)
            r3 = 3
            byte[] r4 = r1.f11553k
            boolean r3 = k7.a.q(r4, r2, r3)
            r0.append(r3)
            java.lang.String r3 = ", StrongEnc="
            r0.append(r3)
            r3 = 6
            byte[] r1 = r1.f11553k
            boolean r1 = k7.a.q(r1, r2, r3)
            r0.append(r1)
            java.lang.String r1 = ", UTF8="
            r0.append(r1)
            boolean r1 = r5.g()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
