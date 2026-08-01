package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲀᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0513 extends xhss.AbstractC0121 {
    public C0513() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public final java.lang.Object mo119(xhss.C0385 r2) {
            r1 = this;
            int r1 = r2.m762()
            r0 = 9
            if (r1 != r0) goto Ld
            r2.m756()
            r1 = 0
            return r1
        Ld:
            int r1 = r2.m741()     // Catch: java.lang.NumberFormatException -> L16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L16
            return r1
        L16:
            r1 = move-exception
            xhss.ᛱᲈᛲᛷ r2 = new xhss.ᛱᲈᛲᛷ
            r2.<init>(r1)
            throw r2
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
            int r2 = r4.intValue()
            long r0 = (long) r2
            r3.m1397(r0)
            return
    }
}
