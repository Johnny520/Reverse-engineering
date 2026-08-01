package defpackage;

/* JADX INFO: renamed from: ᲁᛷᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1889 extends defpackage.AbstractC0758 {
    public C1889() {
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
            long r0 = r4.longValue()
            r3.m1070(r0)
            return
    }

    @Override // defpackage.AbstractC0758
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final java.lang.Object mo562(defpackage.C1103 r2) {
            r1 = this;
            int r1 = r2.m2090()
            r0 = 9
            if (r1 != r0) goto Ld
            r2.m2108()
            r1 = 0
            return r1
        Ld:
            long r1 = r2.m2098()     // Catch: java.lang.NumberFormatException -> L16
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L16
            return r1
        L16:
            r1 = move-exception
            ᛲᛱᛶᲀ r2 = new ᛲᛱᛶᲀ
            r2.<init>(r1)
            throw r2
    }
}
