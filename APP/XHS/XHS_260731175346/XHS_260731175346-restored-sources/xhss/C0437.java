package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛱᛴᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0437 {

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f1567 = 0;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final boolean f1568;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f1569;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final boolean f1570;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final boolean f1571;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final boolean f1572;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final int f1573;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int f1574;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public java.lang.String f1575;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final boolean f1576;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final boolean f1577;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final int f1578;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final boolean f1579;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final boolean f1580;

    static {
            xhss.ᛳᛴᲀᲁ r0 = xhss.AbstractC0012.f154
            r0 = 2147483647(0x7fffffff, float:NaN)
            xhss.ᛶᛲᛲᲁ r1 = xhss.EnumC0540.f1958
            long r2 = xhss.AbstractC0694.m1198(r0, r1)
            long r0 = xhss.AbstractC0012.m113(r2, r1)
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L16
            return
        L16:
            java.lang.String r2 = "maxStale < 0: "
            xhss.C0532.m952(r2, r0)
            return
    }

    public C0437(boolean r1, boolean r2, int r3, int r4, boolean r5, boolean r6, boolean r7, int r8, int r9, boolean r10, boolean r11, boolean r12, java.lang.String r13) {
            r0 = this;
            r0.<init>()
            r0.f1571 = r1
            r0.f1568 = r2
            r0.f1569 = r3
            r0.f1578 = r4
            r0.f1570 = r5
            r0.f1579 = r6
            r0.f1577 = r7
            r0.f1574 = r8
            r0.f1573 = r9
            r0.f1576 = r10
            r0.f1580 = r11
            r0.f1572 = r12
            r0.f1575 = r13
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.f1575
            if (r0 != 0) goto Lac
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r1 = r5.f1571
            if (r1 == 0) goto L12
            java.lang.String r1 = "no-cache, "
            r0.append(r1)
        L12:
            boolean r1 = r5.f1568
            if (r1 == 0) goto L1b
            java.lang.String r1 = "no-store, "
            r0.append(r1)
        L1b:
            java.lang.String r1 = ", "
            r2 = -1
            int r3 = r5.f1569
            if (r3 == r2) goto L2d
            java.lang.String r4 = "max-age="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L2d:
            int r3 = r5.f1578
            if (r3 == r2) goto L3c
            java.lang.String r4 = "s-maxage="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L3c:
            boolean r3 = r5.f1570
            if (r3 == 0) goto L45
            java.lang.String r3 = "private, "
            r0.append(r3)
        L45:
            boolean r3 = r5.f1579
            if (r3 == 0) goto L4e
            java.lang.String r3 = "public, "
            r0.append(r3)
        L4e:
            boolean r3 = r5.f1577
            if (r3 == 0) goto L57
            java.lang.String r3 = "must-revalidate, "
            r0.append(r3)
        L57:
            int r3 = r5.f1574
            if (r3 == r2) goto L66
            java.lang.String r4 = "max-stale="
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
        L66:
            int r3 = r5.f1573
            if (r3 == r2) goto L75
            java.lang.String r2 = "min-fresh="
            r0.append(r2)
            r0.append(r3)
            r0.append(r1)
        L75:
            boolean r1 = r5.f1576
            if (r1 == 0) goto L7e
            java.lang.String r1 = "only-if-cached, "
            r0.append(r1)
        L7e:
            boolean r1 = r5.f1580
            if (r1 == 0) goto L87
            java.lang.String r1 = "no-transform, "
            r0.append(r1)
        L87:
            boolean r1 = r5.f1572
            if (r1 == 0) goto L90
            java.lang.String r1 = "immutable, "
            r0.append(r1)
        L90:
            int r1 = r0.length()
            if (r1 != 0) goto L99
            java.lang.String r5 = ""
            return r5
        L99:
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            r0.delete(r1, r2)
            java.lang.String r0 = r0.toString()
            r5.f1575 = r0
        Lac:
            return r0
    }
}
