package xhss;

/* JADX INFO: renamed from: xhss.ᛶᛶᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0570 implements java.lang.Cloneable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public /* synthetic */ int[] f2004;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public /* synthetic */ java.lang.Object[] f2005;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public /* synthetic */ int f2006;

    public final java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()
            xhss.ᛶᛶᛸᛶ r0 = (xhss.C0570) r0
            int[] r1 = r2.f2004
            java.lang.Object r1 = r1.clone()
            int[] r1 = (int[]) r1
            r0.f2004 = r1
            java.lang.Object[] r2 = r2.f2005
            java.lang.Object r2 = r2.clone()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0.f2005 = r2
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r0 = r4.f2006
            if (r0 > 0) goto L7
            java.lang.String r4 = "{}"
            return r4
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 * 28
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r4.f2006
            r2 = 0
        L16:
            if (r2 >= r0) goto L3d
            if (r2 <= 0) goto L1f
            java.lang.String r3 = ", "
            r1.append(r3)
        L1f:
            int[] r3 = r4.f2004
            r3 = r3[r2]
            r1.append(r3)
            r3 = 61
            r1.append(r3)
            java.lang.Object[] r3 = r4.f2005
            r3 = r3[r2]
            if (r3 == r4) goto L35
            r1.append(r3)
            goto L3a
        L35:
            java.lang.String r3 = "(this Map)"
            r1.append(r3)
        L3a:
            int r2 = r2 + 1
            goto L16
        L3d:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }
}
