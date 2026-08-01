package xhss;

/* JADX INFO: renamed from: xhss.ᛸᛲᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0738 implements java.util.Comparator {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2472;

    public /* synthetic */ C0738(int r1) {
            r0 = this;
            r0.f2472 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r3 = r3.f2472
            switch(r3) {
                case 0: goto L3e;
                case 1: goto L35;
                case 2: goto L28;
                case 3: goto L1b;
                case 4: goto Le;
                default: goto L5;
            }
        L5:
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            int r3 = r4.compareTo(r5)
            return r3
        Le:
            xhss.ᛳᛸᛸᛵ r4 = (xhss.C0303) r4
            java.lang.String r3 = r4.f1153
            xhss.ᛳᛸᛸᛵ r5 = (xhss.C0303) r5
            java.lang.String r4 = r5.f1153
            int r3 = xhss.AbstractC0775.m1305(r3, r4)
            return r3
        L1b:
            xhss.ᲀᛷᲀᲇ r4 = (xhss.C0877) r4
            java.lang.String r3 = r4.f2828
            xhss.ᲀᛷᲀᲇ r5 = (xhss.C0877) r5
            java.lang.String r4 = r5.f2828
            int r3 = xhss.AbstractC0775.m1305(r3, r4)
            return r3
        L28:
            xhss.ᲇᛸᛳᛸ r4 = (xhss.C1062) r4
            java.lang.String r3 = r4.f3427
            xhss.ᲇᛸᛳᛸ r5 = (xhss.C1062) r5
            java.lang.String r4 = r5.f3427
            int r3 = xhss.AbstractC0775.m1305(r3, r4)
            return r3
        L35:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            int r3 = r4.compareToIgnoreCase(r5)
            return r3
        L3e:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = (java.lang.String) r5
            int r3 = r4.length()
            int r0 = r5.length()
            int r3 = java.lang.Math.min(r3, r0)
            r0 = 4
        L4f:
            if (r0 >= r3) goto L65
            char r1 = r4.charAt(r0)
            char r2 = r5.charAt(r0)
            if (r1 == r2) goto L62
            int r3 = xhss.AbstractC0007.m102(r1, r2)
            if (r3 >= 0) goto L73
            goto L71
        L62:
            int r0 = r0 + 1
            goto L4f
        L65:
            int r3 = r4.length()
            int r4 = r5.length()
            if (r3 == r4) goto L75
            if (r3 >= r4) goto L73
        L71:
            r3 = -1
            goto L76
        L73:
            r3 = 1
            goto L76
        L75:
            r3 = 0
        L76:
            return r3
    }
}
