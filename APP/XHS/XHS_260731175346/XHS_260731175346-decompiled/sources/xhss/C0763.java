package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛵᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0763 implements xhss.InterfaceC0341 {
    public C0763() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // xhss.InterfaceC0341
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.AbstractC0121 mo160(xhss.C1125 r1, xhss.C0032 r2) {
            r0 = this;
            java.lang.Class r0 = r2.f211
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            boolean r2 = r1.isAssignableFrom(r0)
            if (r2 == 0) goto L1d
            if (r0 != r1) goto Ld
            goto L1d
        Ld:
            boolean r1 = r0.isEnum()
            if (r1 != 0) goto L17
            java.lang.Class r0 = r0.getSuperclass()
        L17:
            xhss.ᛵᛳᲀᛶ r1 = new xhss.ᛵᛳᲀᛶ
            r1.<init>(r0)
            return r1
        L1d:
            r0 = 0
            return r0
    }
}
