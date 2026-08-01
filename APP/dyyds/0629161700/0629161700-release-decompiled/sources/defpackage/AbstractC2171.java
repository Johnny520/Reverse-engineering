package defpackage;

/* JADX INFO: renamed from: ᲈᛱᛴᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2171 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicLong f9245 = null;

    static {
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            defpackage.AbstractC2171.f9245 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3570(java.lang.Object r5) {
            if (r5 != 0) goto L4
            goto Lc1
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6e
            r0.<init>()     // Catch: java.lang.Exception -> L6e
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L6e
            r2 = -278327050280494(0xffff02dcef0961d2, double:NaN)
            java.lang.String r2 = "MM-dd-HH-mm-ss"     // Catch: java.lang.Exception -> L6e
            r1.<init>(r2)     // Catch: java.lang.Exception -> L6e
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Exception -> L6e
            r2.<init>()     // Catch: java.lang.Exception -> L6e
            java.lang.String r1 = r1.format(r2)     // Catch: java.lang.Exception -> L6e
            r0.append(r1)     // Catch: java.lang.Exception -> L6e
            r1 = 95
            r0.append(r1)     // Catch: java.lang.Exception -> L6e
            java.util.concurrent.atomic.AtomicLong r1 = defpackage.AbstractC2171.f9245     // Catch: java.lang.Exception -> L6e
            long r1 = r1.incrementAndGet()     // Catch: java.lang.Exception -> L6e
            r0.append(r1)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L6e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6e
            r1.<init>()     // Catch: java.lang.Exception -> L6e
            r2 = -278391474789934(0xffff02cdef0961d2, double:NaN)
            java.lang.String r2 = "dy_data_"     // Catch: java.lang.Exception -> L6e
            r1.append(r2)     // Catch: java.lang.Exception -> L6e
            r1.append(r0)     // Catch: java.lang.Exception -> L6e
            r2 = -278430129495598(0xffff02c4ef0961d2, double:NaN)
            java.lang.String r0 = ".json"     // Catch: java.lang.Exception -> L6e
            r1.append(r0)     // Catch: java.lang.Exception -> L6e
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L6e
            ᛲᲀᛱᲁ r1 = defpackage.C0346.f1773     // Catch: java.lang.Exception -> L6e
            r1.getClass()     // Catch: java.lang.Exception -> L6e
            java.io.File r0 = defpackage.C0346.m1033(r0)     // Catch: java.lang.Exception -> L6e
            ᲁᲇᲀᛸ r1 = defpackage.AbstractC1140.m2169()     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = r1.m3365(r5)     // Catch: java.lang.Exception -> L6e
            defpackage.AbstractC0893.m1865(r0, r5)     // Catch: java.lang.Exception -> L6e
            return
        L6e:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -278455899299374(0xffff02beef0961d2, double:NaN)
            java.lang.String r1 = "writeJson error "
            r0.<init>(r1)
            java.lang.String r5 = r5.getMessage()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r0 = -514687690513966(0xfffe2be4ef0961d2, double:NaN)
            r0 = -514588906266158(0xfffe2bfbef0961d2, double:NaN)
            int r0 = r5.length()
            if (r0 != 0) goto L9f
            goto Lc1
        L9f:
            int r0 = r5.length()
            r1 = 0
        La4:
            if (r1 >= r0) goto Lc1
            int r2 = r1 + 2000
            if (r2 <= r0) goto Lab
            r2 = r0
        Lab:
            java.lang.String r1 = r5.substring(r1, r2)
            r3 = -514623266004526(0xfffe2bf3ef0961d2, double:NaN)
            ᛲᲀᛱᲁ r3 = defpackage.C0346.f1773
            r3.getClass()
            defpackage.C0346.m1040(r1)
            r1 = r2
            goto La4
        Lc1:
            return
    }
}
