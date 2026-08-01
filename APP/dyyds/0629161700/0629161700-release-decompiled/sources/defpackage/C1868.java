package defpackage;

/* JADX INFO: renamed from: ᲁᛶᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1868 extends defpackage.AbstractC0758 {
    public C1868() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public final void mo561(defpackage.C0353 r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 != 0) goto L8
            r3.m1067()
            return
        L8:
            short r2 = r4.shortValue()
            long r0 = (long) r2
            r3.m1070(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r4) {
            r3 = this;
            int r3 = r4.m2090()
            r0 = 9
            r1 = 0
            if (r3 != r0) goto Ld
            r4.m2108()
            return r1
        Ld:
            int r3 = r4.m2099()     // Catch: java.lang.NumberFormatException -> L2d
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r0) goto L20
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r3 < r0) goto L20
            short r3 = (short) r3
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L20:
            r0 = 1
            java.lang.String r4 = r4.m2106(r0)
            java.lang.String r0 = "Lossy conversion from "
            java.lang.String r2 = " to short; at path "
            defpackage.C0086.m549(r0, r3, r2, r4)
            return r1
        L2d:
            r3 = move-exception
            ᛲᛱᛶᲀ r4 = new ᛲᛱᛶᲀ
            r4.<init>(r3)
            throw r4
    }
}
