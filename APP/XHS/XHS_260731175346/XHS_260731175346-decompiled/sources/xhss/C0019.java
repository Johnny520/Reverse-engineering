package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛲᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0019 extends xhss.AbstractC0121 {
    public C0019() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object mo119(xhss.C0385 r4) {
            r3 = this;
            int r3 = r4.m762()
            r0 = 9
            r1 = 0
            if (r3 != r0) goto Ld
            r4.m756()
            return r1
        Ld:
            java.lang.String r3 = r4.m739()
            java.util.UUID r3 = java.util.UUID.fromString(r3)     // Catch: java.lang.IllegalArgumentException -> L16
            return r3
        L16:
            r0 = move-exception
            r2 = 1
            java.lang.String r4 = r4.m764(r2)
            java.lang.String r2 = "' as UUID; at path "
            xhss.C0532.m951(r3, r2, r4, r0)
            return r1
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.util.UUID r2 = (java.util.UUID) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.toString()
        La:
            r1.m1405(r0)
            return
    }
}
