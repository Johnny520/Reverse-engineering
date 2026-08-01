package xhss;

/* JADX INFO: renamed from: xhss.ᛵᲇᛸᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0522 implements xhss.InterfaceC0341 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Class f1894;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Class f1895;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0121 f1896;

    public C0522(java.lang.Class r1, java.lang.Class r2, xhss.AbstractC0121 r3) {
            r0 = this;
            r0.<init>()
            r0.f1894 = r1
            r0.f1895 = r2
            r0.f1896 = r3
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[type="
            r0.<init>(r1)
            java.lang.Class r1 = r2.f1895
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            java.lang.Class r1 = r2.f1894
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            xhss.ᛲᛱᛶᛴ r2 = r2.f1896
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.InterfaceC0341
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.AbstractC0121 mo160(xhss.C1125 r1, xhss.C0032 r2) {
            r0 = this;
            java.lang.Class r1 = r2.f211
            java.lang.Class r2 = r0.f1894
            if (r1 == r2) goto Ld
            java.lang.Class r2 = r0.f1895
            if (r1 != r2) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            xhss.ᛲᛱᛶᛴ r0 = r0.f1896
            return r0
    }
}
