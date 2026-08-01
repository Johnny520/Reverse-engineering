package defpackage;

/* JADX INFO: renamed from: ᛳᛶᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0508 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.TimeZone f2501 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.lang.String f2502 = null;

    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            defpackage.AbstractC0508.f2501 = r0
            java.lang.Class<ᲈᛴᛶᲁ> r0 = defpackage.C2225.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "okhttp3."
            java.lang.String r0 = defpackage.AbstractC1347.m2513(r0, r1)
            java.lang.String r1 = "Client"
            java.lang.String r0 = defpackage.AbstractC1347.m2509(r0, r1)
            defpackage.AbstractC0508.f2502 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static final defpackage.C0024 m1289(java.util.List r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            ᛵᛲᛵᲁ r1 = (defpackage.C0828) r1
            ᛶᛸᛸᛶ r2 = r1.f3833
            ᛶᛸᛸᛶ r1 = r1.f3834
            java.lang.String r2 = r2.m2157()
            java.lang.String r1 = r1.m2157()
            r0.add(r2)
            java.lang.CharSequence r1 = defpackage.AbstractC1347.m2521(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto Lb
        L32:
            ᛱᛱᛷᛳ r3 = new ᛱᛱᛷᛳ
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.<init>(r0)
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static final java.util.List m1290(java.lang.Object[] r2) {
            if (r2 == 0) goto L21
            int r0 = r2.length
            if (r0 != 0) goto L6
            goto L21
        L6:
            int r0 = r2.length
            r1 = 1
            if (r0 != r1) goto L12
            r0 = 0
            r2 = r2[r0]
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L12:
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
        L21:
            ᲀᛶᲇ r2 = defpackage.C1698.f7558
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static final java.lang.String m1291(defpackage.C0520 r4, boolean r5) {
            int r0 = r4.f2562
            java.lang.String r1 = r4.f2563
            java.lang.String r2 = ":"
            r3 = 0
            boolean r2 = defpackage.AbstractC1347.m2500(r1, r2, r3)
            if (r2 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            r2.append(r1)
            r1 = 93
            r2.append(r1)
            java.lang.String r1 = r2.toString()
        L20:
            if (r5 != 0) goto L3f
            java.lang.String r4 = r4.f2565
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L2f
            r4 = 80
            goto L3b
        L2f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L3a
            r4 = 443(0x1bb, float:6.21E-43)
            goto L3b
        L3a:
            r4 = -1
        L3b:
            if (r0 == r4) goto L3e
            goto L3f
        L3e:
            return r1
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r5 = 58
            r4.append(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public static final long m1292(defpackage.C0569 r3) {
            ᛱᛱᛷᛳ r3 = r3.f2820
            java.lang.String r0 = "Content-Length"
            java.lang.String r3 = r3.m324(r0)
            r0 = -1
            if (r3 == 0) goto L12
            byte[] r2 = defpackage.AbstractC0709.f3358
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L12
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final java.lang.String m1293(java.lang.String r2, java.lang.Object... r3) {
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final void m1294(java.net.Socket r2) {
            r2.close()     // Catch: java.lang.Exception -> L3 java.lang.RuntimeException -> L4 java.lang.AssertionError -> L13
        L3:
            return
        L4:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "bio == null"
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L12
            return
        L12:
            throw r2
        L13:
            r2 = move-exception
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final boolean m1295(defpackage.C0520 r2, defpackage.C0520 r3) {
            java.lang.String r0 = r2.f2563
            java.lang.String r1 = r3.f2563
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L1c
            int r0 = r2.f2562
            int r1 = r3.f2562
            if (r0 != r1) goto L1c
            java.lang.String r2 = r2.f2565
            java.lang.String r3 = r3.f2565
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r3)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static final java.util.List m1296(java.util.List r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            ᲀᛶᲇ r2 = defpackage.C1698.f7558
            return r2
        L9:
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            return r2
        L1a:
            java.lang.Object[] r2 = r2.toArray()
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final int m1297(long r6) {
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            java.lang.String r3 = "timeout"
            if (r2 < 0) goto L33
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            long r6 = r4.toMillis(r6)
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r5 = 0
            if (r4 > 0) goto L29
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L27
            if (r2 > 0) goto L1d
            goto L27
        L1d:
            java.lang.String r6 = " too small"
            java.lang.String r6 = r3.concat(r6)
            defpackage.C2264.m3678(r6)
            return r5
        L27:
            int r6 = (int) r6
            return r6
        L29:
            java.lang.String r6 = " too large"
            java.lang.String r6 = r3.concat(r6)
            defpackage.C2264.m3678(r6)
            return r5
        L33:
            java.lang.String r6 = " < 0"
            java.lang.String r6 = r3.concat(r6)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final java.nio.charset.Charset m1298(defpackage.InterfaceC1810 r1, java.nio.charset.Charset r2) {
            ᲈᛵᲇᛷ r0 = defpackage.AbstractC0709.f3359
            int r1 = r1.mo2854(r0)
            r0 = -1
            if (r1 == r0) goto L44
            if (r1 == 0) goto L41
            r2 = 1
            if (r1 == r2) goto L3e
            r2 = 2
            if (r1 == r2) goto L2f
            r2 = 3
            if (r1 == r2) goto L2c
            r2 = 4
            if (r1 != r2) goto L26
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6224
            if (r1 != 0) goto L25
            java.lang.String r1 = "UTF-32BE"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            defpackage.AbstractC1422.f6224 = r1
        L25:
            return r1
        L26:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L2c:
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6220
            return r1
        L2f:
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6223
            if (r1 != 0) goto L3d
            java.lang.String r1 = "UTF-32LE"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            defpackage.AbstractC1422.f6223 = r1
        L3d:
            return r1
        L3e:
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6222
            return r1
        L41:
            java.nio.charset.Charset r1 = defpackage.AbstractC1422.f6221
            return r1
        L44:
            return r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static final boolean m1299(defpackage.InterfaceC2182 r11, int r12) {
            long r0 = java.lang.System.nanoTime()
            ᛶᛵᛸᛱ r2 = r11.mo1707()
            boolean r2 = r2.mo1798()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L1d
            ᛶᛵᛸᛱ r2 = r11.mo1707()
            long r5 = r2.mo1799()
            long r5 = r5 - r0
            goto L1e
        L1d:
            r5 = r3
        L1e:
            ᛶᛵᛸᛱ r2 = r11.mo1707()
            long r7 = (long) r12
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = r12.toNanos(r7)
            long r7 = java.lang.Math.min(r5, r7)
            long r7 = r7 + r0
            r2.mo1363(r7)
            ᛸᲁᛵ r12 = new ᛸᲁᛵ     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
            r12.<init>()     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
        L36:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.mo782(r7, r12)     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L48
            long r7 = r12.f6928     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
            r12.m2847(r7)     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
            goto L36
        L48:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r2 = 1
            if (r12 != 0) goto L55
            ᛶᛵᛸᛱ r11 = r11.mo1707()
            r11.mo1800()
            return r2
        L55:
            ᛶᛵᛸᛱ r11 = r11.mo1707()
            long r0 = r0 + r5
            r11.mo1363(r0)
            return r2
        L5e:
            r12 = move-exception
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L6b
            ᛶᛵᛸᛱ r11 = r11.mo1707()
            r11.mo1800()
            goto L73
        L6b:
            ᛶᛵᛸᛱ r11 = r11.mo1707()
            long r0 = r0 + r5
            r11.mo1363(r0)
        L73:
            throw r12
        L74:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L80
            ᛶᛵᛸᛱ r11 = r11.mo1707()
            r11.mo1800()
            goto L88
        L80:
            ᛶᛵᛸᛱ r11 = r11.mo1707()
            long r0 = r0 + r5
            r11.mo1363(r0)
        L88:
            r11 = 0
            return r11
    }
}
