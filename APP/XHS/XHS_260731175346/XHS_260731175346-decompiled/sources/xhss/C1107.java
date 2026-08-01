package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲈᛷᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1107 implements xhss.InterfaceC0341 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3579;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0121 f3580;

    public /* synthetic */ C1107(xhss.AbstractC0121 r1, int r2) {
            r0 = this;
            r0.f3579 = r2
            r0.f3580 = r1
            r0.<init>()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f3579
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Factory[type="
            r0.<init>(r1)
            java.lang.Class<java.util.Calendar> r1 = java.util.Calendar.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "+"
            r0.append(r1)
            java.lang.Class<java.util.GregorianCalendar> r1 = java.util.GregorianCalendar.class
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ",adapter="
            r0.append(r1)
            xhss.ᛲᛱᛶᛴ r2 = r2.f3580
            xhss.ᛳᲈᛷᛸ r2 = (xhss.C0328) r2
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // xhss.InterfaceC0341
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final xhss.AbstractC0121 mo160(xhss.C1125 r2, xhss.C0032 r3) {
            r1 = this;
            int r2 = r1.f3579
            xhss.ᛲᛱᛶᛴ r1 = r1.f3580
            r0 = 0
            switch(r2) {
                case 0: goto L16;
                default: goto L8;
            }
        L8:
            java.lang.Class r2 = r3.f211
            java.lang.Class<java.util.Calendar> r3 = java.util.Calendar.class
            if (r2 == r3) goto L12
            java.lang.Class<java.util.GregorianCalendar> r3 = java.util.GregorianCalendar.class
            if (r2 != r3) goto L15
        L12:
            r0 = r1
            xhss.ᛳᲈᛷᛸ r0 = (xhss.C0328) r0
        L15:
            return r0
        L16:
            java.lang.Class r2 = r3.f211
            java.lang.Class<java.lang.Number> r3 = java.lang.Number.class
            if (r2 != r3) goto L1f
            r0 = r1
            xhss.ᛸᲁᲈᛳ r0 = (xhss.C0813) r0
        L1f:
            return r0
    }
}
