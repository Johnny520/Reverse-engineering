package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class db1 {

    /* JADX INFO: renamed from: α */
    public final int f3025;

    /* JADX INFO: renamed from: β */
    public final int f3026;

    /* JADX INFO: renamed from: γ */
    public final p000.a80 f3027;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f3028;

    /* JADX INFO: renamed from: ε */
    public final java.util.LinkedHashMap f3029;

    /* JADX INFO: renamed from: ζ */
    public final java.util.LinkedHashSet f3030;

    /* JADX INFO: renamed from: η */
    public p000.rc1 f3031;

    /* JADX INFO: renamed from: θ */
    public int f3032;

    /* JADX INFO: renamed from: ι */
    public int f3033;

    /* JADX INFO: renamed from: κ */
    public int f3034;

    /* JADX INFO: renamed from: λ */
    public int f3035;

    /* JADX INFO: renamed from: μ */
    public int f3036;

    /* JADX INFO: renamed from: ν */
    public int f3037;

    /* JADX INFO: renamed from: ξ */
    public int f3038;

    /* JADX INFO: renamed from: ο */
    public int f3039;

    /* JADX INFO: renamed from: π */
    public int f3040;

    /* JADX INFO: renamed from: ρ */
    public int f3041;

    /* JADX INFO: renamed from: σ */
    public int f3042;

    /* JADX INFO: renamed from: τ */
    public int f3043;

    /* JADX INFO: renamed from: υ */
    public int f3044;

    public db1(p000.rc1 r3, int r4, int r5, java.util.LinkedHashMap r6) {
            r2 = this;
            f71 r0 = new f71
            r1 = 9
            r0.<init>(r1)
            r2.<init>()
            r2.f3025 = r4
            r2.f3026 = r5
            r2.f3027 = r0
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r2.f3028 = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r5 = r6.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L26:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r5.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r0 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 >= 0) goto L43
            r6 = 0
        L43:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.put(r0, r6)
            goto L26
        L4b:
            r2.f3029 = r4
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r2.f3030 = r4
            r2.f3031 = r3
            return
    }

    /* JADX INFO: renamed from: α */
    public final p000.cb1 m1680(p000.EnumC0619od r6, boolean r7) {
            r5 = this;
            java.lang.Object r0 = r5.f3028
            monitor-enter(r0)
            int r1 = r6.ordinal()     // Catch: java.lang.Throwable -> L17
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto L19
            if (r1 != r3) goto L11
            goto L2c
        L11:
            pm r5 = new pm     // Catch: java.lang.Throwable -> L17
            r5.<init>()     // Catch: java.lang.Throwable -> L17
            throw r5     // Catch: java.lang.Throwable -> L17
        L17:
            r5 = move-exception
            goto L78
        L19:
            int r1 = r5.f3033     // Catch: java.lang.Throwable -> L17
            int r1 = r1 - r4
            if (r1 >= 0) goto L1f
            goto L20
        L1f:
            r2 = r1
        L20:
            r5.f3033 = r2     // Catch: java.lang.Throwable -> L17
            goto L2c
        L23:
            int r1 = r5.f3032     // Catch: java.lang.Throwable -> L17
            int r1 = r1 - r4
            if (r1 >= 0) goto L29
            goto L2a
        L29:
            r2 = r1
        L2a:
            r5.f3032 = r2     // Catch: java.lang.Throwable -> L17
        L2c:
            int r1 = r5.f3042     // Catch: java.lang.Throwable -> L17
            int r1 = r1 + r4
            r5.f3042 = r1     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L68
            int r7 = r5.f3043     // Catch: java.lang.Throwable -> L17
            int r7 = r7 + r4
            r5.f3043 = r7     // Catch: java.lang.Throwable -> L17
            int r7 = r6.ordinal()     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto L54
            if (r7 == r4) goto L4e
            if (r7 != r3) goto L48
            int r7 = r5.f3038     // Catch: java.lang.Throwable -> L17
            int r7 = r7 + r4
            r5.f3038 = r7     // Catch: java.lang.Throwable -> L17
            goto L59
        L48:
            pm r5 = new pm     // Catch: java.lang.Throwable -> L17
            r5.<init>()     // Catch: java.lang.Throwable -> L17
            throw r5     // Catch: java.lang.Throwable -> L17
        L4e:
            int r7 = r5.f3037     // Catch: java.lang.Throwable -> L17
            int r7 = r7 + r4
            r5.f3037 = r7     // Catch: java.lang.Throwable -> L17
            goto L59
        L54:
            int r7 = r5.f3036     // Catch: java.lang.Throwable -> L17
            int r7 = r7 + r4
            r5.f3036 = r7     // Catch: java.lang.Throwable -> L17
        L59:
            od r7 = p000.EnumC0619od.f8036     // Catch: java.lang.Throwable -> L17
            if (r6 == r7) goto L72
            a80 r7 = r5.f3027     // Catch: java.lang.Throwable -> L17
            java.lang.Object r6 = r7.invoke(r6)     // Catch: java.lang.Throwable -> L17
            rc1 r6 = (p000.rc1) r6     // Catch: java.lang.Throwable -> L17
            r5.f3031 = r6     // Catch: java.lang.Throwable -> L17
            goto L72
        L68:
            int r6 = r5.f3040     // Catch: java.lang.Throwable -> L17
            int r6 = r6 + r4
            r5.f3040 = r6     // Catch: java.lang.Throwable -> L17
            int r6 = r5.f3044     // Catch: java.lang.Throwable -> L17
            int r6 = r6 + r4
            r5.f3044 = r6     // Catch: java.lang.Throwable -> L17
        L72:
            cb1 r5 = r5.m1686()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r5
        L78:
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: β */
    public final p000.rc1 m1681() {
            r5 = this;
            java.lang.Object r0 = r5.f3028
            monitor-enter(r0)
            rc1 r1 = new rc1     // Catch: java.lang.Throwable -> L16
            rc1 r2 = r5.f3031     // Catch: java.lang.Throwable -> L16
            int r3 = r2.f9332     // Catch: java.lang.Throwable -> L16
            int r4 = r5.f3032     // Catch: java.lang.Throwable -> L16
            int r3 = r3 + r4
            int r2 = r2.f9333     // Catch: java.lang.Throwable -> L16
            int r5 = r5.f3033     // Catch: java.lang.Throwable -> L16
            int r2 = r2 + r5
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return r1
        L16:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: γ */
    public final void m1682(long r2, p000.EnumC0619od r4, int r5) {
            r1 = this;
            java.lang.Object r0 = r1.f3028
            monitor-enter(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L22
            l91 r3 = new l91     // Catch: java.lang.Throwable -> L22
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L22
            java.util.LinkedHashMap r2 = r1.f3029     // Catch: java.lang.Throwable -> L22
            if (r5 >= 0) goto L11
            r5 = 0
        L11:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L22
            r2.put(r3, r4)     // Catch: java.lang.Throwable -> L22
            java.util.LinkedHashSet r2 = r1.f3030     // Catch: java.lang.Throwable -> L22
            r2.add(r3)     // Catch: java.lang.Throwable -> L22
            r1.m1686()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            return
        L22:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    /* JADX INFO: renamed from: δ */
    public final void m1683(int r3) {
            r2 = this;
            java.lang.Object r0 = r2.f3028
            monitor-enter(r0)
            int r1 = r2.f3034     // Catch: java.lang.Throwable -> L16
            int r1 = r1 + 1
            r2.f3034 = r1     // Catch: java.lang.Throwable -> L16
            int r1 = r2.f3035     // Catch: java.lang.Throwable -> L16
            if (r3 >= 0) goto Le
            r3 = 0
        Le:
            int r1 = r1 + r3
            r2.f3035 = r1     // Catch: java.lang.Throwable -> L16
            r2.m1686()     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return
        L16:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ε */
    public final void m1684() {
            r2 = this;
            java.lang.Object r0 = r2.f3028
            monitor-enter(r0)
            int r1 = r2.f3040     // Catch: java.lang.Throwable -> Le
            int r1 = r1 + 1
            r2.f3040 = r1     // Catch: java.lang.Throwable -> Le
            r2.m1686()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ζ */
    public final void m1685() {
            r2 = this;
            java.lang.Object r0 = r2.f3028
            monitor-enter(r0)
            int r1 = r2.f3033     // Catch: java.lang.Throwable -> Le
            int r1 = r1 + (-1)
            if (r1 >= 0) goto La
            r1 = 0
        La:
            r2.f3033 = r1     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: η */
    public final p000.cb1 m1686() {
            r14 = this;
            cb1 r0 = new cb1
            int r1 = r14.f3034
            int r2 = r14.f3035
            int r3 = r14.f3036
            int r4 = r14.f3037
            int r5 = r14.f3038
            int r6 = r14.f3039
            int r7 = r14.f3040
            int r8 = r14.f3041
            int r9 = r14.f3042
            java.util.LinkedHashMap r10 = r14.f3029
            java.util.Collection r10 = r10.values()
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r11 = 0
        L24:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L36
            java.lang.Object r12 = r10.next()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            int r11 = r11 + r12
            goto L24
        L36:
            int r10 = r14.f3042
            if (r11 >= r10) goto L3b
            goto L3c
        L3b:
            r10 = r11
        L3c:
            int r11 = r14.f3043
            int r12 = r14.f3044
            rc1 r13 = r14.f3031
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public final boolean m1687(p000.EnumC0619od r6) {
            r5 = this;
            java.lang.Object r0 = r5.f3028
            monitor-enter(r0)
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L18
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L2e
            if (r6 == r2) goto L1a
            r5 = 2
            if (r6 != r5) goto L12
        L10:
            r1 = r2
            goto L42
        L12:
            pm r5 = new pm     // Catch: java.lang.Throwable -> L18
            r5.<init>()     // Catch: java.lang.Throwable -> L18
            throw r5     // Catch: java.lang.Throwable -> L18
        L18:
            r5 = move-exception
            goto L44
        L1a:
            int r6 = r5.f3026     // Catch: java.lang.Throwable -> L18
            if (r6 <= 0) goto L28
            rc1 r3 = r5.f3031     // Catch: java.lang.Throwable -> L18
            int r3 = r3.f9333     // Catch: java.lang.Throwable -> L18
            int r4 = r5.f3033     // Catch: java.lang.Throwable -> L18
            int r3 = r3 + r4
            if (r3 < r6) goto L28
            goto L42
        L28:
            int r6 = r5.f3033     // Catch: java.lang.Throwable -> L18
            int r6 = r6 + r2
            r5.f3033 = r6     // Catch: java.lang.Throwable -> L18
            goto L10
        L2e:
            int r6 = r5.f3025     // Catch: java.lang.Throwable -> L18
            if (r6 <= 0) goto L3c
            rc1 r3 = r5.f3031     // Catch: java.lang.Throwable -> L18
            int r3 = r3.f9332     // Catch: java.lang.Throwable -> L18
            int r4 = r5.f3032     // Catch: java.lang.Throwable -> L18
            int r3 = r3 + r4
            if (r3 < r6) goto L3c
            goto L42
        L3c:
            int r6 = r5.f3032     // Catch: java.lang.Throwable -> L18
            int r6 = r6 + r2
            r5.f3032 = r6     // Catch: java.lang.Throwable -> L18
            goto L10
        L42:
            monitor-exit(r0)
            return r1
        L44:
            monitor-exit(r0)
            throw r5
    }
}
