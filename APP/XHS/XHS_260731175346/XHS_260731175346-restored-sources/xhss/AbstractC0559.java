package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛴᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0559 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.lang.String f1983 = null;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final java.util.TimeZone f1984 = null;

    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            xhss.AbstractC0559.f1984 = r0
            java.lang.Class<xhss.ᛵᛸᛷᛲ> r0 = xhss.C0504.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "okhttp3."
            java.lang.String r0 = xhss.AbstractC0120.m349(r0, r1)
            java.lang.String r1 = "Client"
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L27
            int r1 = r0.length()
            int r1 = r1 + (-6)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
        L27:
            xhss.AbstractC0559.f1983 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final int m986(long r6) {
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
            xhss.C0532.m946(r6)
            return r5
        L27:
            int r6 = (int) r6
            return r6
        L29:
            java.lang.String r6 = " too large"
            java.lang.String r6 = r3.concat(r6)
            xhss.C0532.m946(r6)
            return r5
        L33:
            java.lang.String r6 = " < 0"
            java.lang.String r6 = r3.concat(r6)
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static final void m987(java.net.Socket r2) {
            r2.close()     // Catch: java.lang.Exception -> L3 java.lang.RuntimeException -> L4 java.lang.AssertionError -> L13
        L3:
            return
        L4:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            java.lang.String r1 = "bio == null"
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L12
            return
        L12:
            throw r2
        L13:
            r2 = move-exception
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public static final long m988(xhss.C0871 r3) {
            xhss.ᲁᛸᛱᛵ r3 = r3.f2820
            java.lang.String r0 = "Content-Length"
            java.lang.String r3 = r3.m1605(r0)
            r0 = -1
            if (r3 == 0) goto L12
            byte[] r2 = xhss.AbstractC0577.f2010
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L12
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final boolean m989(xhss.C0669 r2, xhss.C0669 r3) {
            java.lang.String r0 = r2.f2288
            java.lang.String r1 = r3.f2288
            boolean r0 = xhss.AbstractC0007.m97(r0, r1)
            if (r0 == 0) goto L1c
            int r0 = r2.f2284
            int r1 = r3.f2284
            if (r0 != r1) goto L1c
            java.lang.String r2 = r2.f2285
            java.lang.String r3 = r3.f2285
            boolean r2 = xhss.AbstractC0007.m97(r2, r3)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static final java.util.List m990(java.util.List r2) {
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L9
            xhss.ᛵᛷᛶᛱ r2 = xhss.C0492.f1802
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

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static final java.lang.String m991(xhss.C0669 r4, boolean r5) {
            int r0 = r4.f2284
            java.lang.String r1 = r4.f2288
            java.lang.String r2 = ":"
            r3 = 0
            boolean r2 = xhss.AbstractC0120.m339(r1, r2, r3)
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
            java.lang.String r4 = r4.f2285
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

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public static final java.util.List m992(java.lang.Object[] r2) {
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
            xhss.ᛵᛷᛶᛱ r2 = xhss.C0492.f1802
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static final xhss.C0972 m993(java.util.List r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 20
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L32
            java.lang.Object r1 = r3.next()
            xhss.ᛱᛵᲀᛱ r1 = (xhss.C0047) r1
            xhss.ᛳᛶᲈᲈ r2 = r1.f327
            xhss.ᛳᛶᲈᲈ r1 = r1.f325
            java.lang.String r2 = r2.m614()
            java.lang.String r1 = r1.m614()
            r0.add(r2)
            java.lang.CharSequence r1 = xhss.AbstractC0120.m346(r1)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
            goto Lb
        L32:
            xhss.ᲁᛸᛱᛵ r3 = new xhss.ᲁᛸᛱᛵ
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r3.<init>(r0)
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final java.lang.String m994(java.lang.String r2, java.lang.Object... r3) {
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            int r1 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            java.lang.String r2 = java.lang.String.format(r0, r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public static final boolean m995(xhss.InterfaceC1095 r11, int r12) {
            long r0 = java.lang.System.nanoTime()
            xhss.ᛲᲁᲈᛲ r2 = r11.mo250()
            boolean r2 = r2.mo479()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L1d
            xhss.ᛲᲁᲈᛲ r2 = r11.mo250()
            long r5 = r2.mo478()
            long r5 = r5 - r0
            goto L1e
        L1d:
            r5 = r3
        L1e:
            xhss.ᛲᲁᲈᛲ r2 = r11.mo250()
            long r7 = (long) r12
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = r12.toNanos(r7)
            long r7 = java.lang.Math.min(r5, r7)
            long r7 = r7 + r0
            r2.mo482(r7)
            xhss.ᛴᛲᛴᛶ r12 = new xhss.ᛴᛲᛴᛶ     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
            r12.<init>()     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
        L36:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.mo235(r7, r12)     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 == 0) goto L48
            long r7 = r12.f1261     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
            r12.m696(r7)     // Catch: java.lang.Throwable -> L5e java.io.InterruptedIOException -> L74
            goto L36
        L48:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r2 = 1
            if (r12 != 0) goto L55
            xhss.ᛲᲁᲈᛲ r11 = r11.mo250()
            r11.mo480()
            return r2
        L55:
            xhss.ᛲᲁᲈᛲ r11 = r11.mo250()
            long r0 = r0 + r5
            r11.mo482(r0)
            return r2
        L5e:
            r12 = move-exception
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 != 0) goto L6b
            xhss.ᛲᲁᲈᛲ r11 = r11.mo250()
            r11.mo480()
            goto L73
        L6b:
            xhss.ᛲᲁᲈᛲ r11 = r11.mo250()
            long r0 = r0 + r5
            r11.mo482(r0)
        L73:
            throw r12
        L74:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L80
            xhss.ᛲᲁᲈᛲ r11 = r11.mo250()
            r11.mo480()
            goto L88
        L80:
            xhss.ᛲᲁᲈᛲ r11 = r11.mo250()
            long r0 = r0 + r5
            r11.mo482(r0)
        L88:
            r11 = 0
            return r11
    }
}
