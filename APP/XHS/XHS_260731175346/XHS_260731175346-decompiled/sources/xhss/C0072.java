package xhss;

/* JADX INFO: renamed from: xhss.ᛱᛸᛳᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0072 implements xhss.InterfaceC0786 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.InterfaceC0786 f372;

    public C0072(xhss.AbstractC0660 r1) {
            r0 = this;
            r0.<init>()
            r0.f372 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            xhss.ᛸᛷᲁᛵ r2 = r2.f372
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "("
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L17
            java.lang.String r0 = "[?"
            java.lang.String r1 = "]"
            java.lang.String r2 = xhss.AbstractC0390.m781(r0, r2, r1)
            return r2
        L17:
            java.lang.String r0 = "[?("
            java.lang.String r1 = ")]"
            java.lang.String r2 = xhss.AbstractC0390.m781(r0, r2, r1)
            return r2
    }

    @Override // xhss.InterfaceC0786
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean mo223(xhss.C1180 r1) {
            r0 = this;
            xhss.ᛸᛷᲁᛵ r0 = r0.f372
            boolean r0 = r0.mo223(r1)
            return r0
    }
}
