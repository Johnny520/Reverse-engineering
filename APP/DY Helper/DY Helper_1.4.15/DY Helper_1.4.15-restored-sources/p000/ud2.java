package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ud2 {

    /* JADX INFO: renamed from: α */
    public static final java.util.TimeZone f10709 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.String f10710 = null;

    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            r0.getClass()
            p000.ud2.f10709 = r0
            java.lang.Class<t41> r0 = p000.t41.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "okhttp3."
            java.lang.String r0 = p000.q02.m4678(r0, r1)
            java.lang.String r1 = "Client"
            java.lang.String r0 = p000.q02.m4679(r0, r1)
            p000.ud2.f10710 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m5843(p000.og0 r2, p000.og0 r3) {
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = r2.f8093
            java.lang.String r1 = r3.f8093
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L22
            int r0 = r2.f8094
            int r1 = r3.f8094
            if (r0 != r1) goto L22
            java.lang.String r2 = r2.f8090
            java.lang.String r3 = r3.f8090
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 == 0) goto L22
            r2 = 1
            return r2
        L22:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static final int m5844(long r7) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r0.getClass()
            r1 = 0
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            java.lang.String r4 = "timeout"
            if (r3 < 0) goto L36
            long r7 = r0.toMillis(r7)
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 > 0) goto L2c
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L2a
            if (r3 > 0) goto L1f
            goto L2a
        L1f:
            java.lang.String r7 = " too small"
            java.lang.String r7 = r4.concat(r7)
            p000.C1080.m7266(r7)
        L28:
            r7 = 0
            return r7
        L2a:
            int r7 = (int) r7
            return r7
        L2c:
            java.lang.String r7 = " too large"
            java.lang.String r7 = r4.concat(r7)
            p000.C1080.m7266(r7)
            goto L28
        L36:
            java.lang.String r7 = " < 0"
            java.lang.String r7 = r4.concat(r7)
            p000.C1080.m7273(r7)
            goto L28
    }

    /* JADX INFO: renamed from: γ */
    public static final void m5845(java.net.Socket r2) {
            r2.getClass()
            r2.close()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> L7 java.lang.AssertionError -> L16
        L6:
            return
        L7:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "bio == null"
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L15
            return
        L15:
            throw r2
        L16:
            r2 = move-exception
            throw r2
    }

    /* JADX INFO: renamed from: δ */
    public static final java.lang.String m5846(java.lang.String r2, java.lang.Object... r3) {
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static final long m5847(p000.zn1 r3) {
            vc0 r3 = r3.f13202
            java.lang.String r0 = "Content-Length"
            java.lang.String r3 = r3.m6168(r0)
            r0 = -1
            if (r3 == 0) goto L12
            byte[] r2 = p000.sd2.f9867
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L12
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static final boolean m5848(p000.rx1 r12, int r13) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.getClass()
            long r1 = java.lang.System.nanoTime()
            m42 r3 = r12.mo2105()
            boolean r3 = r3.mo2872()
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L22
            m42 r3 = r12.mo2105()
            long r6 = r3.mo2870()
            long r6 = r6 - r1
            goto L23
        L22:
            r6 = r4
        L23:
            m42 r3 = r12.mo2105()
            long r8 = (long) r13
            long r8 = r0.toNanos(r8)
            long r8 = java.lang.Math.min(r6, r8)
            long r8 = r8 + r1
            r3.mo2871(r8)
            sc r13 = new sc     // Catch: java.lang.Throwable -> L61 java.io.InterruptedIOException -> L77
            r13.<init>()     // Catch: java.lang.Throwable -> L61 java.io.InterruptedIOException -> L77
        L39:
            r8 = 8192(0x2000, double:4.0474E-320)
            long r8 = r12.mo2106(r8, r13)     // Catch: java.lang.Throwable -> L61 java.io.InterruptedIOException -> L77
            r10 = -1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 == 0) goto L4b
            long r8 = r13.f9828     // Catch: java.lang.Throwable -> L61 java.io.InterruptedIOException -> L77
            r13.skip(r8)     // Catch: java.lang.Throwable -> L61 java.io.InterruptedIOException -> L77
            goto L39
        L4b:
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = 1
            if (r13 != 0) goto L58
            m42 r12 = r12.mo2105()
            r12.mo2868()
            return r0
        L58:
            m42 r12 = r12.mo2105()
            long r1 = r1 + r6
            r12.mo2871(r1)
            return r0
        L61:
            r13 = move-exception
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L6e
            m42 r12 = r12.mo2105()
            r12.mo2868()
            goto L76
        L6e:
            m42 r12 = r12.mo2105()
            long r1 = r1 + r6
            r12.mo2871(r1)
        L76:
            throw r13
        L77:
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 != 0) goto L83
            m42 r12 = r12.mo2105()
            r12.mo2868()
            goto L8b
        L83:
            m42 r12 = r12.mo2105()
            long r1 = r1 + r6
            r12.mo2871(r1)
        L8b:
            r12 = 0
            return r12
    }

    /* JADX INFO: renamed from: η */
    public static final p000.vc0 m5849(java.util.List r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            tc0 r1 = (p000.tc0) r1
            dd r2 = r1.f10311
            dd r1 = r1.f10312
            java.lang.String r2 = r2.m1710()
            java.lang.String r1 = r1.m1710()
            r0.add(r2)
            java.lang.CharSequence r1 = p000.q02.m4660(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto Lb
        L32:
            vc0 r3 = new vc0
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.<init>(r0)
            return r3
    }

    /* JADX INFO: renamed from: θ */
    public static final java.lang.String m5850(p000.og0 r4, boolean r5) {
            r4.getClass()
            int r0 = r4.f8094
            java.lang.String r1 = r4.f8093
            java.lang.String r2 = ":"
            r3 = 0
            boolean r2 = p000.q02.m4654(r1, r2, r3)
            if (r2 == 0) goto L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            r2.append(r1)
            r1 = 93
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L23:
            if (r5 != 0) goto L45
            java.lang.String r4 = r4.f8090
            r4.getClass()
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L35
            r4 = 80
            goto L41
        L35:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L40
            r4 = 443(0x1bb, float:6.21E-43)
            goto L41
        L40:
            r4 = -1
        L41:
            if (r0 == r4) goto L44
            goto L45
        L44:
            return r1
        L45:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r5 = 58
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    /* JADX INFO: renamed from: ι */
    public static final java.util.List m5851(java.util.List r2) {
            r2.getClass()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc
            jz r2 = p000.C0450jz.f5672
            return r2
        Lc:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L20
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r2.getClass()
            return r2
        L20:
            java.lang.Object[] r2 = r2.toArray()
            r2.getClass()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r2.getClass()
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r2.getClass()
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static final java.util.List m5852(java.lang.Object[] r2) {
            if (r2 == 0) goto L2d
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto L2d
        L6:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L15
            r0 = 0
            r2 = r2[r0]
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r2.getClass()
            return r2
        L15:
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r2.getClass()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r2.getClass()
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r2.getClass()
            return r2
        L2d:
            jz r2 = p000.C0450jz.f5672
            return r2
    }
}
