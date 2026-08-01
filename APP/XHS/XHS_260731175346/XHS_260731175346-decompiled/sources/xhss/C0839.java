package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛲᛵᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0839 implements xhss.InterfaceC0341 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2721;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Class f2722;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0121 f2723;

    public /* synthetic */ C0839(java.lang.Class r1, xhss.AbstractC0121 r2, int r3) {
            r0 = this;
            r0.f2721 = r3
            r0.f2722 = r1
            r0.f2723 = r2
            r0.<init>()
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            int r0 = r5.f2721
            java.lang.String r1 = "]"
            xhss.ᛲᛱᛶᛴ r2 = r5.f2723
            java.lang.String r3 = ",adapter="
            java.lang.Class r5 = r5.f2722
            switch(r0) {
                case 0: goto L29;
                default: goto Ld;
            }
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Factory[typeHierarchy="
            r0.<init>(r4)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            return r5
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Factory[type="
            r0.<init>(r4)
            java.lang.String r5 = r5.getName()
            r0.append(r5)
            r0.append(r3)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r5 = r0.toString()
            return r5
    }

    @Override // xhss.InterfaceC0341
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.AbstractC0121 mo160(xhss.C1125 r3, xhss.C0032 r4) {
            r2 = this;
            int r3 = r2.f2721
            r0 = 0
            java.lang.Class r1 = r2.f2722
            switch(r3) {
                case 0: goto L17;
                default: goto L8;
            }
        L8:
            java.lang.Class r3 = r4.f211
            boolean r4 = r1.isAssignableFrom(r3)
            if (r4 != 0) goto L11
            goto L16
        L11:
            xhss.ᛸᛴᛴᛳ r0 = new xhss.ᛸᛴᛴᛳ
            r0.<init>(r2, r3)
        L16:
            return r0
        L17:
            java.lang.Class r3 = r4.f211
            if (r3 != r1) goto L1d
            xhss.ᛲᛱᛶᛴ r0 = r2.f2723
        L1d:
            return r0
    }
}
