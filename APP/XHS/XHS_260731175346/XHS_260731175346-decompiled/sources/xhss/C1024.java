package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛳᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1024 extends xhss.AbstractC0660 {

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static final xhss.InterfaceC0869 f3323 = null;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.EnumC1203 f3324;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.AbstractC0052 f3325;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.AbstractC0052 f3326;

    static {
            java.lang.Class<xhss.ᲇᛳᛸᛱ> r0 = xhss.C1024.class
            xhss.ᲀᛶᛶᲀ r0 = xhss.AbstractC0993.m1628(r0)
            xhss.C1024.f3323 = r0
            return
    }

    public C1024(xhss.AbstractC0052 r1, xhss.EnumC1203 r2, xhss.AbstractC0052 r3) {
            r0 = this;
            r0.<init>()
            r0.f3326 = r1
            r0.f3324 = r2
            r0.f3325 = r3
            xhss.ᲀᛶᛶᲀ r1 = xhss.C1024.f3323
            java.lang.String r0 = r0.toString()
            r1.mo387(r0)
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            xhss.ᲈᲈᛳᛳ r0 = r3.f3324
            xhss.ᲈᲈᛳᛳ r1 = xhss.EnumC1203.f3902
            xhss.ᛱᛶᛶᛱ r2 = r3.f3326
            if (r0 != r1) goto Ld
            java.lang.String r3 = r2.toString()
            return r3
        Ld:
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = r0.f3914
            xhss.ᛱᛶᛶᛱ r3 = r3.f3325
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            r2.append(r0)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            return r3
    }

    @Override // xhss.InterfaceC0786
    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public final boolean mo223(xhss.C1180 r4) {
            r3 = this;
            xhss.ᛱᛶᛶᛱ r0 = r3.f3326
            r0.getClass()
            boolean r1 = r0 instanceof xhss.C0861
            if (r1 == 0) goto L11
            xhss.ᲀᛴᲇ r0 = r0.mo170()
            xhss.ᛱᛶᛶᛱ r0 = r0.m1436(r4)
        L11:
            xhss.ᛱᛶᛶᛱ r1 = r3.f3325
            r1.getClass()
            boolean r2 = r1 instanceof xhss.C0861
            if (r2 == 0) goto L22
            xhss.ᲀᛴᲇ r1 = r1.mo170()
            xhss.ᛱᛶᛶᛱ r1 = r1.m1436(r4)
        L22:
            xhss.ᲈᲈᛳᛳ r3 = r3.f3324
            java.util.HashMap r2 = xhss.AbstractC1040.f3360
            java.lang.Object r3 = r2.get(r3)
            xhss.ᛲᛲᛴᛲ r3 = (xhss.C0131) r3
            if (r3 == 0) goto L33
            boolean r3 = r3.m363(r0, r1, r4)
            return r3
        L33:
            r3 = 0
            return r3
    }
}
