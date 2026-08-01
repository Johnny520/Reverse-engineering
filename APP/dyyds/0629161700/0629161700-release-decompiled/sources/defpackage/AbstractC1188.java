package defpackage;

/* JADX INFO: renamed from: ᛶᲈᛸᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1188 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0121 f5385 = null;

    static {
            ᛸᲁᛵ r0 = new ᛸᲁᛵ
            r0.<init>()
            ᛶᛸᛸᛶ r1 = defpackage.C1128.f5017
            r0.m2849(r1)
            byte[] r1 = r1.f5020
            int r1 = r1.length
            long r1 = (long) r1
            ᛱᛷᛱᛳ r3 = new ᛱᛷᛱᛳ
            r3.<init>(r1, r0)
            defpackage.AbstractC1188.f5385 = r3
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            ᲁᛲᛴᛳ r0 = r0.mo631()
            defpackage.AbstractC0709.m1611(r0)
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public abstract defpackage.C1237 mo630();

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ */
    public abstract defpackage.InterfaceC1810 mo631();

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ */
    public abstract long mo632();

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final java.lang.String m2321() {
            r3 = this;
            ᲁᛲᛴᛳ r0 = r3.mo631()
            r1 = 0
            ᛷᛳᛱᛳ r3 = r3.mo630()     // Catch: java.lang.Throwable -> L24
            if (r3 == 0) goto L11
            java.nio.charset.Charset r3 = defpackage.C1237.m2352(r3)     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L13
        L11:
            java.nio.charset.Charset r3 = defpackage.AbstractC1422.f6221     // Catch: java.lang.Throwable -> L24
        L13:
            java.nio.charset.Charset r3 = defpackage.AbstractC0508.m1298(r0, r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r0.mo2840(r3)     // Catch: java.lang.Throwable -> L24
            r0.close()     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r1 = move-exception
        L20:
            r2 = r1
            r1 = r3
            r3 = r2
            goto L2f
        L24:
            r3 = move-exception
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Throwable -> L2b
            goto L2f
        L2b:
            r0 = move-exception
            defpackage.AbstractC2193.m3595(r3, r0)
        L2f:
            if (r3 != 0) goto L32
            return r1
        L32:
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.io.InputStream m2322() {
            r0 = this;
            ᲁᛲᛴᛳ r0 = r0.mo631()
            java.io.InputStream r0 = r0.mo2853()
            return r0
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final byte[] m2323() {
            r6 = this;
            long r0 = r6.mo632()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L5a
            ᲁᛲᛴᛳ r6 = r6.mo631()
            r2 = 0
            byte[] r3 = r6.mo2851()     // Catch: java.lang.Throwable -> L1d
            r6.close()     // Catch: java.lang.Throwable -> L18
            goto L19
        L18:
            r2 = move-exception
        L19:
            r5 = r3
            r3 = r2
            r2 = r5
            goto L28
        L1d:
            r3 = move-exception
            if (r6 == 0) goto L28
            r6.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r6 = move-exception
            defpackage.AbstractC2193.m3595(r3, r6)
        L28:
            if (r3 != 0) goto L59
            int r6 = r2.length
            r3 = -1
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 == 0) goto L58
            long r3 = (long) r6
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L37
            goto L58
        L37:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Content-Length ("
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ") and stream length ("
            r3.append(r0)
            r3.append(r6)
            java.lang.String r6 = ") disagree"
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            throw r2
        L58:
            return r2
        L59:
            throw r3
        L5a:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0)
            throw r6
    }
}
