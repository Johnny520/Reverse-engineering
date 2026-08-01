package xhss;

/* JADX INFO: renamed from: xhss.ᛶᲇᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0603 extends xhss.AbstractC0121 {
    public C0603() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r4) {
            r3 = this;
            int r3 = r4.m762()
            r0 = 9
            r1 = 0
            if (r3 != r0) goto Ld
            r4.m756()
            return r1
        Ld:
            int r3 = r4.m741()     // Catch: java.lang.NumberFormatException -> L2d
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r0) goto L20
            r0 = -32768(0xffffffffffff8000, float:NaN)
            if (r3 < r0) goto L20
            short r3 = (short) r3
            java.lang.Short r3 = java.lang.Short.valueOf(r3)
            return r3
        L20:
            r0 = 1
            java.lang.String r4 = r4.m764(r0)
            java.lang.String r0 = "Lossy conversion from "
            java.lang.String r2 = " to short; at path "
            xhss.C0349.m710(r0, r3, r2, r4)
            return r1
        L2d:
            r3 = move-exception
            xhss.ᛱᲈᛲᛷ r4 = new xhss.ᛱᲈᛲᛷ
            r4.<init>(r3)
            throw r4
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 != 0) goto L8
            r3.m1396()
            return
        L8:
            short r2 = r4.shortValue()
            long r0 = (long) r2
            r3.m1397(r0)
            return
    }
}
