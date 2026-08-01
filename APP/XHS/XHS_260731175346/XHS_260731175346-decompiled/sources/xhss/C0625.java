package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛱᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0625 extends xhss.AbstractC0121 {
    public C0625() {
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
            java.lang.String r3 = r4.m739()
            int r0 = r3.length()
            r2 = 1
            if (r0 != r2) goto L22
            r4 = 0
            char r3 = r3.charAt(r4)
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            return r3
        L22:
            java.lang.String r0 = "; at "
            java.lang.String r4 = r4.m764(r2)
            java.lang.String r2 = "Expecting character, got: "
            xhss.C0532.m957(r2, r3, r0, r4)
            return r1
    }

    @Override // xhss.AbstractC0121
    /* JADX INFO: renamed from: ᛳᲁᲇᛸ */
    public final void mo120(xhss.C0827 r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Character r2 = (java.lang.Character) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = java.lang.String.valueOf(r2)
        La:
            r1.m1405(r0)
            return
    }
}
