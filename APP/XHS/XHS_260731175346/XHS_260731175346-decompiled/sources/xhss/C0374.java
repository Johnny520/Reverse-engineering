package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛶᛸᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0374 extends xhss.AbstractC0121 {
    public C0374() {
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
            r0 = 6
            if (r1 != r0) goto L1d
            java.lang.String r1 = r2.m739()
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L1d:
            boolean r1 = r2.m751()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto L8
            r1.m1396()
            goto L1e
        L8:
            r1.m1406()
            r1.m1393()
            java.io.Writer r0 = r1.f2691
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L19
            java.lang.String r1 = "true"
            goto L1b
        L19:
            java.lang.String r1 = "false"
        L1b:
            r0.write(r1)
        L1e:
            return
    }
}
