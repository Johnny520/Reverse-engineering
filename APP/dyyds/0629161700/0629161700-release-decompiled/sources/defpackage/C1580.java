package defpackage;

/* JADX INFO: renamed from: ᛸᲇᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1580 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f6994;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object[] f6995;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int[] f6996;

    public C1580(int r1) {
            r0 = this;
            r0.<init>()
            int[] r1 = defpackage.AbstractC1628.f7225
            r0.f6996 = r1
            java.lang.Object[] r1 = defpackage.AbstractC1628.f7226
            r0.f6995 = r1
            return
    }

    public void clear() {
            r1 = this;
            int r0 = r1.f6994
            if (r0 <= 0) goto Lf
            int[] r0 = defpackage.AbstractC1628.f7225
            r1.f6996 = r0
            java.lang.Object[] r0 = defpackage.AbstractC1628.f7226
            r1.f6995 = r0
            r0 = 0
            r1.f6994 = r0
        Lf:
            if (r0 > 0) goto L12
            return
        L12:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.m2860(r1)
            if (r0 < 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.m2862(r1)
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
            boolean r2 = r8 instanceof defpackage.C1580     // Catch: java.lang.Throwable -> L77
            if (r2 == 0) goto L3a
            int r2 = r7.f6994     // Catch: java.lang.Throwable -> L77
            r3 = r8
            ᛸᲇᛲᛶ r3 = (defpackage.C1580) r3     // Catch: java.lang.Throwable -> L77
            int r3 = r3.f6994     // Catch: java.lang.Throwable -> L77
            if (r2 == r3) goto L13
            return r1
        L13:
            ᛸᲇᛲᛶ r8 = (defpackage.C1580) r8     // Catch: java.lang.Throwable -> L77
            r3 = r1
        L16:
            if (r3 >= r2) goto L39
            java.lang.Object r4 = r7.m2865(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r7.m2863(r3)     // Catch: java.lang.Throwable -> L77
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
            int r2 = r7.f6994     // Catch: java.lang.Throwable -> L77
            r3 = r8
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L77
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L77
            if (r2 == r3) goto L4a
            return r1
        L4a:
            int r2 = r7.f6994     // Catch: java.lang.Throwable -> L77
            r3 = r1
        L4d:
            if (r3 >= r2) goto L76
            java.lang.Object r4 = r7.m2865(r3)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r7.m2863(r3)     // Catch: java.lang.Throwable -> L77
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
            int r1 = r0.m2860(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r0 = r0.f6995
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
            int r1 = r0.m2860(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r0 = r0.f6995
            int r1 = r1 << 1
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
        Lf:
            return r2
    }

    public int hashCode() {
            r8 = this;
            int[] r0 = r8.f6996
            java.lang.Object[] r1 = r8.f6995
            int r8 = r8.f6994
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
            int r0 = r0.f6994
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public java.lang.Object put(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f6994
            if (r8 == 0) goto L9
            int r1 = r8.hashCode()
            goto La
        L9:
            r1 = 0
        La:
            if (r8 == 0) goto L11
            int r2 = r7.m2861(r1, r8)
            goto L15
        L11:
            int r2 = r7.m2859()
        L15:
            if (r2 < 0) goto L22
            int r8 = r2 << 1
            int r8 = r8 + 1
            java.lang.Object[] r7 = r7.f6995
            r0 = r7[r8]
            r7[r8] = r9
            return r0
        L22:
            int r2 = ~r2
            int[] r3 = r7.f6996
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
            r7.f6996 = r3
            java.lang.Object[] r3 = r7.f6995
            int r4 = r4 << 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            r7.f6995 = r3
            int r3 = r7.f6994
            if (r0 != r3) goto L4a
            goto L50
        L4a:
            java.util.ConcurrentModificationException r7 = new java.util.ConcurrentModificationException
            r7.<init>()
            throw r7
        L50:
            if (r2 >= r0) goto L66
            int[] r3 = r7.f6996
            int r4 = r2 + 1
            defpackage.AbstractC2315.m3770(r4, r2, r0, r3, r3)
            java.lang.Object[] r3 = r7.f6995
            int r4 = r4 << 1
            int r5 = r2 << 1
            int r6 = r7.f6994
            int r6 = r6 << 1
            defpackage.AbstractC2315.m3766(r4, r5, r6, r3, r3)
        L66:
            int r3 = r7.f6994
            if (r0 != r3) goto L81
            int[] r0 = r7.f6996
            int r4 = r0.length
            if (r2 >= r4) goto L81
            r0[r2] = r1
            java.lang.Object[] r0 = r7.f6995
            int r1 = r2 << 1
            r0[r1] = r8
            int r1 = r1 + 1
            r0[r1] = r9
            int r3 = r3 + 1
            r7.f6994 = r3
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
            int r1 = r0.m2860(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r0 = r0.mo1421(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean remove(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r2 = r1.m2860(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.m2863(r2)
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r0)
            if (r3 == 0) goto L15
            r1.mo1421(r2)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final java.lang.Object replace(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            int r1 = r0.m2860(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r0 = r0.mo1422(r1, r2)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean replace(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
            r1 = this;
            int r2 = r1.m2860(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.m2863(r2)
            boolean r3 = defpackage.AbstractC0498.m1280(r3, r0)
            if (r3 == 0) goto L15
            r1.mo1422(r2, r4)
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final int size() {
            r0 = this;
            int r0 = r0.f6994
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r5 = "{}"
            return r5
        L9:
            int r0 = r5.f6994
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.f6994
            r2 = 0
        L1a:
            if (r2 >= r0) goto L47
            if (r2 <= 0) goto L23
            java.lang.String r3 = ", "
            r1.append(r3)
        L23:
            java.lang.Object r3 = r5.m2865(r2)
            java.lang.String r4 = "(this Map)"
            if (r3 == r1) goto L2f
            r1.append(r3)
            goto L32
        L2f:
            r1.append(r4)
        L32:
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.m2863(r2)
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

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ */
    public java.lang.Object mo1421(int r11) {
            r10 = this;
            r0 = 0
            if (r11 < 0) goto L89
            int r1 = r10.f6994
            if (r11 >= r1) goto L89
            java.lang.Object[] r2 = r10.f6995
            int r3 = r11 << 1
            int r4 = r3 + 1
            r4 = r2[r4]
            r5 = 1
            if (r1 > r5) goto L16
            r10.clear()
            return r4
        L16:
            int r6 = r1 + (-1)
            int[] r7 = r10.f6996
            int r8 = r7.length
            r9 = 8
            if (r8 <= r9) goto L64
            int r8 = r7.length
            int r8 = r8 / 3
            if (r1 >= r8) goto L64
            if (r1 <= r9) goto L2a
            int r0 = r1 >> 1
            int r9 = r1 + r0
        L2a:
            int[] r0 = java.util.Arrays.copyOf(r7, r9)
            r10.f6996 = r0
            java.lang.Object[] r0 = r10.f6995
            int r8 = r9 << 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            r10.f6995 = r0
            int r0 = r10.f6994
            if (r1 != r0) goto L5e
            if (r11 <= 0) goto L4b
            int[] r0 = r10.f6996
            r8 = 0
            defpackage.AbstractC2315.m3770(r8, r8, r11, r7, r0)
            java.lang.Object[] r0 = r10.f6995
            defpackage.AbstractC2315.m3766(r8, r8, r3, r2, r0)
        L4b:
            if (r11 >= r6) goto L7c
            int[] r0 = r10.f6996
            int r8 = r11 + 1
            defpackage.AbstractC2315.m3770(r11, r8, r1, r7, r0)
            java.lang.Object[] r11 = r10.f6995
            int r0 = r8 << 1
            int r5 = r1 << 1
            defpackage.AbstractC2315.m3766(r3, r0, r5, r2, r11)
            goto L7c
        L5e:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L64:
            if (r11 >= r6) goto L73
            int r2 = r11 + 1
            defpackage.AbstractC2315.m3770(r11, r2, r1, r7, r7)
            java.lang.Object[] r11 = r10.f6995
            int r2 = r2 << r5
            int r7 = r1 << 1
            defpackage.AbstractC2315.m3766(r3, r2, r7, r11, r11)
        L73:
            java.lang.Object[] r11 = r10.f6995
            int r2 = r6 << 1
            r11[r2] = r0
            int r2 = r2 + r5
            r11[r2] = r0
        L7c:
            int r11 = r10.f6994
            if (r1 != r11) goto L83
            r10.f6994 = r6
            return r4
        L83:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
        L89:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected index to be within 0..size()-1, but was "
            r10.<init>(r1)
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            defpackage.AbstractC2279.m3697(r10)
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public java.lang.Object mo1422(int r2, java.lang.Object r3) {
            r1 = this;
            if (r2 < 0) goto L11
            int r0 = r1.f6994
            if (r2 >= r0) goto L11
            int r2 = r2 << 1
            int r2 = r2 + 1
            java.lang.Object[] r1 = r1.f6995
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected index to be within 0..size()-1, but was "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.AbstractC2279.m3697(r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int m2859() {
            r5 = this;
            int r0 = r5.f6994
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r5.f6996
            r2 = 0
            int r1 = defpackage.AbstractC1628.m2961(r0, r2, r1)
            if (r1 >= 0) goto L10
            goto L18
        L10:
            java.lang.Object[] r2 = r5.f6995
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
        L18:
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r5.f6996
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r5.f6995
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
            int[] r0 = r5.f6996
            r0 = r0[r1]
            if (r0 != 0) goto L45
            java.lang.Object[] r0 = r5.f6995
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

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int m2860(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r1 = r1.m2859()
            return r1
        L7:
            int r0 = r2.hashCode()
            int r1 = r1.m2861(r0, r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int m2861(int r6, java.lang.Object r7) {
            r5 = this;
            int r0 = r5.f6994
            if (r0 != 0) goto L6
            r5 = -1
            return r5
        L6:
            int[] r1 = r5.f6996
            int r1 = defpackage.AbstractC1628.m2961(r0, r6, r1)
            if (r1 >= 0) goto Lf
            goto L1b
        Lf:
            java.lang.Object[] r2 = r5.f6995
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = defpackage.AbstractC0498.m1280(r7, r2)
            if (r2 == 0) goto L1c
        L1b:
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r5.f6996
            r3 = r3[r2]
            if (r3 != r6) goto L36
            java.lang.Object[] r3 = r5.f6995
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = defpackage.AbstractC0498.m1280(r7, r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r1 = r1 + (-1)
        L38:
            if (r1 < 0) goto L50
            int[] r0 = r5.f6996
            r0 = r0[r1]
            if (r0 != r6) goto L50
            java.lang.Object[] r0 = r5.f6995
            int r3 = r1 << 1
            r0 = r0[r3]
            boolean r0 = defpackage.AbstractC0498.m1280(r7, r0)
            if (r0 == 0) goto L4d
            return r1
        L4d:
            int r1 = r1 + (-1)
            goto L38
        L50:
            int r5 = ~r2
            return r5
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int m2862(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f6994
            int r0 = r0 * 2
            java.lang.Object[] r4 = r4.f6995
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

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final java.lang.Object m2863(int r2) {
            r1 = this;
            if (r2 < 0) goto Lf
            int r0 = r1.f6994
            if (r2 >= r0) goto Lf
            java.lang.Object[] r1 = r1.f6995
            int r2 = r2 << 1
            int r2 = r2 + 1
            r1 = r1[r2]
            return r1
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.AbstractC2279.m3697(r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final void m2864(int r4) {
            r3 = this;
            int r0 = r3.f6994
            int[] r1 = r3.f6996
            int r2 = r1.length
            if (r2 >= r4) goto L17
            int[] r1 = java.util.Arrays.copyOf(r1, r4)
            r3.f6996 = r1
            java.lang.Object[] r1 = r3.f6995
            int r4 = r4 * 2
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            r3.f6995 = r4
        L17:
            int r3 = r3.f6994
            if (r3 != r0) goto L1c
            return
        L1c:
            java.util.ConcurrentModificationException r3 = new java.util.ConcurrentModificationException
            r3.<init>()
            throw r3
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object m2865(int r2) {
            r1 = this;
            if (r2 < 0) goto Ld
            int r0 = r1.f6994
            if (r2 >= r0) goto Ld
            java.lang.Object[] r1 = r1.f6995
            int r2 = r2 << 1
            r1 = r1[r2]
            return r1
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.AbstractC2279.m3697(r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ */
    public void mo1423(defpackage.C1499 r5) {
            r4 = this;
            int r0 = r5.f6994
            int r1 = r4.f6994
            int r1 = r1 + r0
            r4.m2864(r1)
            int r1 = r4.f6994
            r2 = 0
            if (r1 != 0) goto L22
            if (r0 <= 0) goto L32
            int[] r1 = r5.f6996
            int[] r3 = r4.f6996
            defpackage.AbstractC2315.m3770(r2, r2, r0, r1, r3)
            java.lang.Object[] r5 = r5.f6995
            java.lang.Object[] r1 = r4.f6995
            int r3 = r0 << 1
            defpackage.AbstractC2315.m3766(r2, r2, r3, r5, r1)
            r4.f6994 = r0
            return
        L22:
            if (r2 >= r0) goto L32
            java.lang.Object r1 = r5.m2865(r2)
            java.lang.Object r3 = r5.m2863(r2)
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L22
        L32:
            return
    }
}
