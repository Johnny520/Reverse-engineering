package w4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements java.lang.Comparable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f14842k = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f14843g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w4.c f14844h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w4.b f14845i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w4.b f14846j;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 10000(0x2710, float:1.4013E-41)
            r2 = 1061158912(0x3f400000, float:0.75)
            r0.<init>(r1, r2)
            w4.a.f14842k = r0
            return
    }

    public a(java.lang.String r1, w4.c r2, w4.b r3) {
            r0 = this;
            r0.<init>()
            if (r1 == 0) goto L18
            if (r2 == 0) goto L11
            r0.f14843g = r1
            r0.f14844h = r2
            r0.f14845i = r3
            r1 = 0
            r0.f14846j = r1
            return
        L11:
            java.lang.String r1 = "returnType == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
        L18:
            java.lang.String r1 = "descriptor == null"
            bsh.j.c(r1)
            r1 = 0
            throw r1
    }

    public static w4.a b(java.lang.String r11) {
            java.util.concurrent.ConcurrentHashMap r0 = w4.a.f14842k
            java.lang.Object r0 = r0.get(r11)
            w4.a r0 = (w4.a) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = r11.length()
            r1 = 0
            char r2 = r11.charAt(r1)
            r3 = 40
            java.lang.String r4 = "bad descriptor"
            if (r2 != r3) goto La3
            r2 = 1
            r5 = r1
            r3 = r2
        L1d:
            r6 = 41
            if (r3 >= r0) goto L35
            char r7 = r11.charAt(r3)
            if (r7 != r6) goto L28
            goto L36
        L28:
            r6 = 65
            if (r7 < r6) goto L32
            r6 = 90
            if (r7 > r6) goto L32
            int r5 = r5 + 1
        L32:
            int r3 = r3 + 1
            goto L1d
        L35:
            r3 = r1
        L36:
            if (r3 == 0) goto L9f
            int r0 = r0 - r2
            if (r3 == r0) goto L9f
            int r3 = r3 + r2
            int r0 = r11.indexOf(r6, r3)
            r3 = -1
            if (r0 != r3) goto L9b
            w4.c[] r0 = new w4.c[r5]
            r7 = r1
            r5 = r2
        L47:
            char r8 = r11.charAt(r5)
            if (r8 != r6) goto L6b
            int r5 = r5 + r2
            java.lang.String r2 = r11.substring(r5)
            w4.c r2 = w4.c.o(r2)
            w4.b r3 = new w4.b
            r3.<init>(r7)
        L5b:
            if (r1 >= r7) goto L65
            r4 = r0[r1]
            r3.m(r1, r4)
            int r1 = r1 + 1
            goto L5b
        L65:
            w4.a r0 = new w4.a
            r0.<init>(r11, r2, r3)
            return r0
        L6b:
            r9 = r5
        L6c:
            r10 = 91
            if (r8 != r10) goto L77
            int r9 = r9 + 1
            char r8 = r11.charAt(r9)
            goto L6c
        L77:
            r10 = 76
            if (r8 != r10) goto L8b
            r8 = 59
            int r8 = r11.indexOf(r8, r9)
            if (r8 == r3) goto L86
            int r8 = r8 + 1
            goto L8d
        L86:
            j8.o.t(r4)
        L89:
            r11 = 0
            return r11
        L8b:
            int r8 = r9 + 1
        L8d:
            java.lang.String r5 = r11.substring(r5, r8)
            w4.c r5 = w4.c.m(r5)
            r0[r7] = r5
            int r7 = r7 + 1
            r5 = r8
            goto L47
        L9b:
            j8.o.t(r4)
            goto L89
        L9f:
            j8.o.t(r4)
            goto L89
        La3:
            j8.o.t(r4)
            goto L89
    }

    public static w4.a d(java.lang.String r2) {
            if (r2 == 0) goto L1d
            java.util.concurrent.ConcurrentHashMap r0 = w4.a.f14842k
            java.lang.Object r1 = r0.get(r2)
            w4.a r1 = (w4.a) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            w4.a r2 = b(r2)
            java.lang.String r1 = r2.f14843g
            java.lang.Object r0 = r0.putIfAbsent(r1, r2)
            w4.a r0 = (w4.a) r0
            if (r0 == 0) goto L1c
            return r0
        L1c:
            return r2
        L1d:
            java.lang.String r2 = "descriptor == null"
            bsh.j.c(r2)
            r2 = 0
            return r2
    }

    public final int a(w4.a r9) {
            r8 = this;
            r0 = 0
            if (r8 != r9) goto L4
            goto L46
        L4:
            w4.c r1 = r9.f14844h
            w4.b r9 = r9.f14845i
            w4.c r2 = r8.f14844h
            java.lang.String r2 = r2.f14878g
            java.lang.String r1 = r1.f14878g
            int r1 = r2.compareTo(r1)
            if (r1 == 0) goto L15
            return r1
        L15:
            w4.b r1 = r8.f14845i
            java.lang.Object[] r2 = r1.f22543h
            int r2 = r2.length
            java.lang.Object[] r3 = r9.f22543h
            int r3 = r3.length
            int r4 = java.lang.Math.min(r2, r3)
            r5 = r0
        L22:
            if (r5 >= r4) goto L3e
            java.lang.Object r6 = r1.l(r5)
            w4.c r6 = (w4.c) r6
            java.lang.Object r7 = r9.l(r5)
            w4.c r7 = (w4.c) r7
            java.lang.String r6 = r6.f14878g
            java.lang.String r7 = r7.f14878g
            int r6 = r6.compareTo(r7)
            if (r6 == 0) goto L3b
            return r6
        L3b:
            int r5 = r5 + 1
            goto L22
        L3e:
            if (r2 >= r3) goto L42
            r9 = -1
            return r9
        L42:
            if (r2 <= r3) goto L46
            r9 = 1
            return r9
        L46:
            return r0
    }

    public final w4.b c() {
            r7 = this;
            w4.b r0 = r7.f14846j
            if (r0 != 0) goto L2c
            w4.b r0 = r7.f14845i
            java.lang.Object[] r1 = r0.f22543h
            int r1 = r1.length
            w4.b r2 = new w4.b
            r2.<init>(r1)
            r3 = 0
            r4 = r3
        L10:
            if (r3 >= r1) goto L27
            java.lang.Object r5 = r0.l(r3)
            w4.c r5 = (w4.c) r5
            boolean r6 = r5.s()
            if (r6 == 0) goto L21
            w4.c r5 = w4.c.f14871t
            r4 = 1
        L21:
            r2.m(r3, r5)
            int r3 = r3 + 1
            goto L10
        L27:
            if (r4 == 0) goto L2a
            r0 = r2
        L2a:
            r7.f14846j = r0
        L2c:
            w4.b r0 = r7.f14846j
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            w4.a r1 = (w4.a) r1
            int r1 = r0.a(r1)
            return r1
    }

    public final w4.a e(w4.c r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.String r1 = r8.f14878g
            r0.append(r1)
            java.lang.String r1 = r7.f14843g
            r2 = 1
            java.lang.String r1 = r1.substring(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            w4.b r1 = r7.f14845i
            java.lang.Object[] r2 = r1.f22543h
            int r2 = r2.length
            w4.b r3 = new w4.b
            int r4 = r2 + 1
            r3.<init>(r4)
            r4 = 0
            r3.m(r4, r8)
            r8 = r4
        L2b:
            if (r8 >= r2) goto L38
            int r5 = r8 + 1
            java.lang.Object[] r6 = r1.f22543h
            r8 = r6[r8]
            r3.m(r5, r8)
            r8 = r5
            goto L2b
        L38:
            r3.f22555g = r4
            w4.a r8 = new w4.a
            w4.c r1 = r7.f14844h
            r8.<init>(r0, r1, r3)
            java.util.concurrent.ConcurrentHashMap r1 = w4.a.f14842k
            java.lang.Object r0 = r1.putIfAbsent(r0, r8)
            w4.a r0 = (w4.a) r0
            if (r0 == 0) goto L4c
            return r0
        L4c:
            return r8
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof w4.a
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            w4.a r2 = (w4.a) r2
            java.lang.String r2 = r2.f14843g
            java.lang.String r0 = r1.f14843g
            boolean r2 = r0.equals(r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f14843g
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f14843g
            return r0
    }
}
