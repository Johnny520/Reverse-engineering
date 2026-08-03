package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements java.lang.CharSequence {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.List f6313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f6314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f6315i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f6316j;

    static {
            p4.t r0 = i2.d0.f6262a
            return
    }

    public /* synthetic */ g(java.lang.String r2) {
            r1 = this;
            tf.t r0 = tf.t.f13167g
            r1.<init>(r2, r0)
            return
    }

    public g(java.lang.String r2, java.util.List r3) {
            r1 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            r3 = 0
        L7:
            r1.<init>(r3, r2)
            return
    }

    public g(java.util.List r9, java.lang.String r10) {
            r8 = this;
            r8.<init>()
            r8.f6313g = r9
            r8.f6314h = r10
            r10 = 0
            r0 = 0
            if (r9 == 0) goto L3c
            int r1 = r9.size()
            r2 = r10
            r3 = r0
            r4 = r3
        L12:
            if (r2 >= r1) goto L3e
            java.lang.Object r5 = r9.get(r2)
            i2.e r5 = (i2.e) r5
            java.lang.Object r6 = r5.f6288a
            boolean r7 = r6 instanceof i2.f0
            if (r7 == 0) goto L2b
            if (r3 != 0) goto L27
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L27:
            r3.add(r5)
            goto L39
        L2b:
            boolean r6 = r6 instanceof i2.u
            if (r6 == 0) goto L39
            if (r4 != 0) goto L36
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L36:
            r4.add(r5)
        L39:
            int r2 = r2 + 1
            goto L12
        L3c:
            r3 = r0
            r4 = r3
        L3e:
            r8.f6315i = r3
            r8.f6316j = r4
            if (r4 == 0) goto L4e
            i2.f r9 = new i2.f
            r9.<init>(r10)
            java.util.List r9 = tf.m.K1(r4, r9)
            goto L4f
        L4e:
            r9 = r0
        L4f:
            if (r9 == 0) goto Lba
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L58
            goto Lba
        L58:
            java.lang.Object r10 = tf.m.t1(r9)
            i2.e r10 = (i2.e) r10
            int r10 = r10.f6290c
            f.v r1 = f.j.f2840a
            f.v r1 = new f.v
            r2 = 1
            r1.<init>(r2)
            r1.a(r10)
            int r10 = r9.size()
        L6f:
            if (r2 >= r10) goto Lba
            java.lang.Object r3 = r9.get(r2)
            i2.e r3 = (i2.e) r3
        L77:
            int r4 = r1.f2916b
            if (r4 == 0) goto Lb2
            if (r4 == 0) goto Lac
            int[] r5 = r1.f2915a
            int r6 = r4 + (-1)
            r5 = r5[r6]
            int r6 = r3.f6289b
            int r7 = r3.f6290c
            if (r6 < r5) goto L8f
            int r4 = r4 + (-1)
            r1.d(r4)
            goto L77
        L8f:
            if (r7 > r5) goto L92
            goto Lb2
        L92:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Paragraph overlap not allowed, end "
            r4.<init>(r6)
            r4.append(r7)
            java.lang.String r6 = " should be less than or equal to "
            r4.append(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            o2.a.a(r4)
            goto Lb2
        Lac:
            java.lang.String r9 = "IntList is empty."
            j8.o.l(r9)
            throw r0
        Lb2:
            int r3 = r3.f6290c
            r1.a(r3)
            int r2 = r2 + 1
            goto L6f
        Lba:
            return
    }

    public final java.util.List a(int r9) {
            r8 = this;
            java.util.List r0 = r8.f6313g
            if (r0 == 0) goto L33
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L13:
            if (r4 >= r2) goto L32
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            i2.e r6 = (i2.e) r6
            java.lang.Object r7 = r6.f6288a
            boolean r7 = r7 instanceof i2.m
            if (r7 == 0) goto L2f
            int r7 = r6.f6289b
            int r6 = r6.f6290c
            boolean r6 = i2.h.b(r3, r9, r7, r6)
            if (r6 == 0) goto L2f
            r1.add(r5)
        L2f:
            int r4 = r4 + 1
            goto L13
        L32:
            return r1
        L33:
            tf.t r9 = tf.t.f13167g
            return r9
    }

    public final i2.g b(int r11, int r12) {
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            o2.a.a(r1)
        L26:
            java.lang.String r1 = r10.f6314h
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            i2.g r4 = i2.h.f6321a
            if (r11 > r12) goto L3a
            goto L54
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            o2.a.a(r2)
        L54:
            java.util.List r2 = r10.f6313g
            if (r2 != 0) goto L59
            goto L99
        L59:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L66:
            if (r0 >= r4) goto L93
            java.lang.Object r5 = r2.get(r0)
            i2.e r5 = (i2.e) r5
            int r6 = r5.f6289b
            int r7 = r5.f6290c
            boolean r6 = i2.h.b(r11, r12, r6, r7)
            if (r6 == 0) goto L90
            i2.e r6 = new i2.e
            java.lang.Object r8 = r5.f6288a
            int r9 = r5.f6289b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f6291d
            r6.<init>(r5, r9, r7, r8)
            r3.add(r6)
        L90:
            int r0 = r0 + 1
            goto L66
        L93:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9a
        L99:
            r3 = 0
        L9a:
            i2.g r11 = new i2.g
            r11.<init>(r3, r1)
            return r11
    }

    @Override // java.lang.CharSequence
    public final char charAt(int r2) {
            r1 = this;
            java.lang.String r0 = r1.f6314h
            char r2 = r0.charAt(r2)
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof i2.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            i2.g r5 = (i2.g) r5
            java.lang.String r1 = r5.f6314h
            java.lang.String r3 = r4.f6314h
            boolean r1 = gg.l.a(r3, r1)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List r1 = r4.f6313g
            java.util.List r5 = r5.f6313g
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f6314h
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r2.f6313g
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.CharSequence
    public final int length() {
            r1 = this;
            java.lang.String r0 = r1.f6314h
            int r0 = r0.length()
            return r0
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ /* synthetic */ java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            i2.g r1 = r0.b(r1, r2)
            return r1
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f6314h
            return r0
    }
}
