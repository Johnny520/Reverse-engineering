package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class fw1 {

    /* JADX INFO: renamed from: ε */
    public int[] f4155;

    /* JADX INFO: renamed from: ζ */
    public java.lang.Object[] f4156;

    /* JADX INFO: renamed from: η */
    public int f4157;

    public fw1(int r1) {
            r0 = this;
            r0.<init>()
            int[] r1 = p000.AbstractC1021yh.f12616
            r0.f4155 = r1
            java.lang.Object[] r1 = p000.AbstractC1021yh.f12618
            r0.f4156 = r1
            return
    }

    public final void clear() {
            r1 = this;
            int r0 = r1.f4157
            if (r0 <= 0) goto Lf
            int[] r0 = p000.AbstractC1021yh.f12616
            r1.f4155 = r0
            java.lang.Object[] r0 = p000.AbstractC1021yh.f12618
            r1.f4156 = r0
            r0 = 0
            r1.f4157 = r0
        Lf:
            int r1 = r1.f4157
            if (r1 > 0) goto L14
            return
        L14:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.m2213(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.m2211(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            boolean r2 = r8 instanceof p000.fw1     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L3a
            int r2 = r7.f4157     // Catch: java.lang.Throwable -> L77
            r3 = r8
            fw1 r3 = (p000.fw1) r3     // Catch: java.lang.Throwable -> L77
            int r3 = r3.f4157     // Catch: java.lang.Throwable -> L77
            if (r2 == r3) goto L13
            return r1
        L13:
            fw1 r8 = (p000.fw1) r8     // Catch: java.lang.Throwable -> L77
            r3 = r1
        L16:
            if (r3 >= r2) goto L39
            java.lang.Object r4 = r7.m2215(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r7.m2218(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r8.get(r4)     // Catch: java.lang.Throwable -> L77
            if (r5 != 0) goto L2f
            if (r6 != 0) goto L2e
            boolean r4 = r8.containsKey(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L36
        L2e:
            return r1
        L2f:
            boolean r4 = r5.equals(r6)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L36
            return r1
        L36:
            int r3 = r3 + 1
            goto L16
        L39:
            return r0
        L3a:
            boolean r2 = r8 instanceof java.util.Map     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L77
            int r2 = r7.f4157     // Catch: java.lang.Throwable -> L77
            r3 = r8
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L77
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L77
            if (r2 == r3) goto L4a
            return r1
        L4a:
            int r2 = r7.f4157     // Catch: java.lang.Throwable -> L77
            r3 = r1
        L4d:
            if (r3 >= r2) goto L76
            java.lang.Object r4 = r7.m2215(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r7.m2218(r3)     // Catch: java.lang.Throwable -> L77
            r6 = r8
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L77
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L77
            if (r5 != 0) goto L6c
            if (r6 != 0) goto L6b
            r5 = r8
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L77
            boolean r4 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L73
        L6b:
            return r1
        L6c:
            boolean r4 = r5.equals(r6)     // Catch: java.lang.Throwable -> L77
            if (r4 != 0) goto L73
            return r1
        L73:
            int r3 = r3 + 1
            goto L4d
        L76:
            return r0
        L77:
            return r1
    }

    public java.lang.Object get(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m2213(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r0 = r0.f4156
            int r1 = r1 << 1
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public final java.lang.Object getOrDefault(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.m2213(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r0 = r0.f4156
            int r1 = r1 << 1
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
        Lf:
            return r2
    }

    public final int hashCode() {
            r8 = this;
            int[] r0 = r8.f4155
            java.lang.Object[] r1 = r8.f4156
            int r8 = r8.f4157
            r2 = 0
            r3 = 1
            r4 = r2
            r5 = r4
        La:
            if (r4 >= r8) goto L1f
            r6 = r1[r3]
            r7 = r0[r4]
            if (r6 == 0) goto L17
            int r6 = r6.hashCode()
            goto L18
        L17:
            r6 = r2
        L18:
            r6 = r6 ^ r7
            int r5 = r5 + r6
            int r4 = r4 + 1
            int r3 = r3 + 2
            goto La
        L1f:
            return r5
    }

    public final boolean isEmpty() {
            r0 = this;
            int r0 = r0.f4157
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final java.lang.Object put(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f4157
            if (r8 == 0) goto L9
            int r1 = r8.hashCode()
            goto La
        L9:
            r1 = 0
        La:
            if (r8 == 0) goto L11
            int r2 = r7.m2212(r1, r8)
            goto L15
        L11:
            int r2 = r7.m2214()
        L15:
            if (r2 < 0) goto L22
            int r8 = r2 << 1
            int r8 = r8 + 1
            java.lang.Object[] r7 = r7.f4156
            r0 = r7[r8]
            r7[r8] = r9
            return r0
        L22:
            int r2 = ~r2
            int[] r3 = r7.f4155
            int r4 = r3.length
            if (r0 < r4) goto L50
            r4 = 8
            if (r0 < r4) goto L30
            int r4 = r0 >> 1
            int r4 = r4 + r0
            goto L35
        L30:
            r5 = 4
            if (r0 < r5) goto L34
            goto L35
        L34:
            r4 = r5
        L35:
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            r7.f4155 = r3
            java.lang.Object[] r3 = r7.f4156
            int r4 = r4 << 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r7.f4156 = r3
            int r3 = r7.f4157
            if (r0 != r3) goto L4a
            goto L50
        L4a:
            java.util.ConcurrentModificationException r7 = new java.util.ConcurrentModificationException
            r7.<init>()
            throw r7
        L50:
            if (r2 >= r0) goto L66
            int[] r3 = r7.f4155
            int r4 = r2 + 1
            p000.AbstractC0312g7.m2235(r4, r2, r0, r3, r3)
            java.lang.Object[] r3 = r7.f4156
            int r4 = r4 << 1
            int r5 = r2 << 1
            int r6 = r7.f4157
            int r6 = r6 << 1
            p000.AbstractC0312g7.m2238(r3, r3, r4, r5, r6)
        L66:
            int r3 = r7.f4157
            if (r0 != r3) goto L81
            int[] r0 = r7.f4155
            int r4 = r0.length
            if (r2 >= r4) goto L81
            r0[r2] = r1
            java.lang.Object[] r0 = r7.f4156
            int r1 = r2 << 1
            r0[r1] = r8
            int r1 = r1 + 1
            r0[r1] = r9
            int r3 = r3 + 1
            r7.f4157 = r3
            r7 = 0
            return r7
        L81:
            java.util.ConcurrentModificationException r7 = new java.util.ConcurrentModificationException
            r7.<init>()
            throw r7
    }

    public final java.lang.Object putIfAbsent(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto Lb
            java.lang.Object r1 = r1.put(r2, r3)
            return r1
        Lb:
            return r0
    }

    public java.lang.Object remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.m2213(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r0 = r0.m2216(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r1.m2213(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.m2218(r2)
            boolean r3 = p000.ln0.m3626(r3, r0)
            if (r3 == 0) goto L15
            r1.m2216(r2)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final java.lang.Object replace(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.m2213(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r0 = r0.m2217(r1, r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean replace(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r1.m2213(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.m2218(r2)
            boolean r3 = p000.ln0.m3626(r3, r0)
            if (r3 == 0) goto L15
            r1.m2217(r2, r4)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final int size() {
            r0 = this;
            int r0 = r0.f4157
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r5 = "{}"
            return r5
        L9:
            int r0 = r5.f4157
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.f4157
            r2 = 0
        L1a:
            if (r2 >= r0) goto L47
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            java.lang.Object r3 = r5.m2215(r2)
            java.lang.String r4 = "(this Map)"
            if (r3 == r1) goto L2f
            r1.append(r3)
            goto L32
        L2f:
            r1.append(r4)
        L32:
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.m2218(r2)
            if (r3 == r1) goto L41
            r1.append(r3)
            goto L44
        L41:
            r1.append(r4)
        L44:
            int r2 = r2 + 1
            goto L1a
        L47:
            r5 = 125(0x7d, float:1.75E-43)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final int m2211(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f4157
            int r0 = r0 * 2
            java.lang.Object[] r4 = r4.f4156
            r1 = 1
            if (r5 != 0) goto L16
            r5 = r1
        La:
            if (r5 >= r0) goto L27
            r2 = r4[r5]
            if (r2 != 0) goto L13
            int r4 = r5 >> 1
            return r4
        L13:
            int r5 = r5 + 2
            goto La
        L16:
            r2 = r1
        L17:
            if (r2 >= r0) goto L27
            r3 = r4[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L24
            int r4 = r2 >> 1
            return r4
        L24:
            int r2 = r2 + 2
            goto L17
        L27:
            r4 = -1
            return r4
    }

    /* JADX INFO: renamed from: β */
    public final int m2212(int r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f4157
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r5.f4155
            int r1 = p000.AbstractC1021yh.m6880(r0, r6, r1)
            if (r1 >= 0) goto Lf
            goto L1b
        Lf:
            java.lang.Object[] r2 = r5.f4156
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = p000.ln0.m3626(r7, r2)
            if (r2 == 0) goto L1c
        L1b:
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r5.f4155
            r3 = r3[r2]
            if (r3 != r6) goto L36
            java.lang.Object[] r3 = r5.f4156
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = p000.ln0.m3626(r7, r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r1 = r1 + (-1)
        L38:
            if (r1 < 0) goto L50
            int[] r0 = r5.f4155
            r0 = r0[r1]
            if (r0 != r6) goto L50
            java.lang.Object[] r0 = r5.f4156
            int r3 = r1 << 1
            r0 = r0[r3]
            boolean r0 = p000.ln0.m3626(r7, r0)
            if (r0 == 0) goto L4d
            return r1
        L4d:
            int r1 = r1 + (-1)
            goto L38
        L50:
            int r5 = ~r2
            return r5
    }

    /* JADX INFO: renamed from: γ */
    public final int m2213(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r1 = r1.m2214()
            return r1
        L7:
            int r0 = r2.hashCode()
            int r1 = r1.m2212(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public final int m2214() {
            r5 = this;
            int r0 = r5.f4157
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r5.f4155
            r2 = 0
            int r1 = p000.AbstractC1021yh.m6880(r0, r2, r1)
            if (r1 >= 0) goto L10
            goto L18
        L10:
            java.lang.Object[] r2 = r5.f4156
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
        L18:
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r5.f4155
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r5.f4156
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            int r1 = r1 + (-1)
        L31:
            if (r1 < 0) goto L45
            int[] r0 = r5.f4155
            r0 = r0[r1]
            if (r0 != 0) goto L45
            java.lang.Object[] r0 = r5.f4156
            int r3 = r1 << 1
            r0 = r0[r3]
            if (r0 != 0) goto L42
            return r1
        L42:
            int r1 = r1 + (-1)
            goto L31
        L45:
            int r5 = ~r2
            return r5
    }

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object m2215(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 < 0) goto L9
            int r2 = r3.f4157
            if (r4 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L11
            java.lang.Object[] r3 = r3.f4156
            int r4 = r4 << r1
            r3 = r3[r4]
            return r3
        L11:
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r3 = p000.a12.m17(r3, r4)
            p000.C1080.m7275(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object m2216(int r10) {
            r9 = this;
            if (r10 < 0) goto L88
            int r0 = r9.f4157
            if (r10 >= r0) goto L88
            java.lang.Object[] r1 = r9.f4156
            int r2 = r10 << 1
            int r3 = r2 + 1
            r3 = r1[r3]
            r4 = 1
            if (r0 > r4) goto L15
            r9.clear()
            return r3
        L15:
            int r5 = r0 + (-1)
            int[] r6 = r9.f4155
            int r7 = r6.length
            r8 = 8
            if (r7 <= r8) goto L62
            int r7 = r6.length
            int r7 = r7 / 3
            if (r0 >= r7) goto L62
            if (r0 <= r8) goto L29
            int r7 = r0 >> 1
            int r8 = r0 + r7
        L29:
            int[] r7 = java.util.Arrays.copyOf(r6, r8)
            r9.f4155 = r7
            java.lang.Object[] r7 = r9.f4156
            int r8 = r8 << r4
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            r9.f4156 = r7
            int r7 = r9.f4157
            if (r0 != r7) goto L5c
            if (r10 <= 0) goto L49
            int[] r7 = r9.f4155
            r8 = 0
            p000.AbstractC0312g7.m2235(r8, r8, r10, r6, r7)
            java.lang.Object[] r7 = r9.f4156
            p000.AbstractC0312g7.m2238(r1, r7, r8, r8, r2)
        L49:
            if (r10 >= r5) goto L7b
            int[] r7 = r9.f4155
            int r8 = r10 + 1
            p000.AbstractC0312g7.m2235(r10, r8, r0, r6, r7)
            java.lang.Object[] r10 = r9.f4156
            int r4 = r8 << 1
            int r6 = r0 << 1
            p000.AbstractC0312g7.m2238(r1, r10, r2, r4, r6)
            goto L7b
        L5c:
            java.util.ConcurrentModificationException r9 = new java.util.ConcurrentModificationException
            r9.<init>()
            throw r9
        L62:
            if (r10 >= r5) goto L71
            int r1 = r10 + 1
            p000.AbstractC0312g7.m2235(r10, r1, r0, r6, r6)
            java.lang.Object[] r10 = r9.f4156
            int r1 = r1 << r4
            int r6 = r0 << 1
            p000.AbstractC0312g7.m2238(r10, r10, r2, r1, r6)
        L71:
            java.lang.Object[] r10 = r9.f4156
            int r1 = r5 << 1
            r2 = 0
            r10[r1] = r2
            int r1 = r1 + r4
            r10[r1] = r2
        L7b:
            int r10 = r9.f4157
            if (r0 != r10) goto L82
            r9.f4157 = r5
            return r3
        L82:
            java.util.ConcurrentModificationException r9 = new java.util.ConcurrentModificationException
            r9.<init>()
            throw r9
        L88:
            java.lang.String r9 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r9 = p000.a12.m17(r9, r10)
            p000.C1080.m7275(r9)
            r9 = 0
            return r9
    }

    /* JADX INFO: renamed from: η */
    public final java.lang.Object m2217(int r4, java.lang.Object r5) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 < 0) goto L9
            int r2 = r3.f4157
            if (r4 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L14
            int r4 = r4 << r1
            int r4 = r4 + r1
            java.lang.Object[] r3 = r3.f4156
            r0 = r3[r4]
            r3[r4] = r5
            return r0
        L14:
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r3 = p000.a12.m17(r3, r4)
            p000.C1080.m7275(r3)
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public final java.lang.Object m2218(int r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            if (r4 < 0) goto L9
            int r2 = r3.f4157
            if (r4 >= r2) goto L9
            r0 = r1
        L9:
            if (r0 == 0) goto L12
            java.lang.Object[] r3 = r3.f4156
            int r4 = r4 << r1
            int r4 = r4 + r1
            r3 = r3[r4]
            return r3
        L12:
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            java.lang.String r3 = p000.a12.m17(r3, r4)
            p000.C1080.m7275(r3)
            r3 = 0
            return r3
    }
}
