package xhss;

/* JADX INFO: renamed from: xhss.ᛴᲈᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0433 extends xhss.AbstractC0121 {
    public C0433() {
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
            java.lang.String r1 = r2.m739()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 != 0) goto L7
            java.lang.String r0 = "null"
            goto Lb
        L7:
            java.lang.String r0 = r2.toString()
        Lb:
            r1.m1405(r0)
            return
    }
}
