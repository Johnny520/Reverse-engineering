package xhss;

/* JADX INFO: renamed from: xhss.ᲀᛳᛲᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0847 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0501 f2754;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L9
            xhss.ᲀᛳᛲᛶ r0 = xhss.C0163.f672
            return
        L9:
            xhss.ᲀᛳᛲᛶ r0 = xhss.C0880.f2838
            return
    }

    public C0847() {
            r1 = this;
            r1.<init>()
            xhss.ᛵᛸᛱ r0 = new xhss.ᛵᛸᛱ
            r0.<init>(r1)
            r1.f2754 = r0
            return
    }

    public C0847(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 35
            if (r0 < r1) goto L11
            xhss.ᛴᛸᛴᲈ r0 = new xhss.ᛴᛸᛴᲈ
            r0.<init>(r2, r3)
            r2.f2754 = r0
            return
        L11:
            r1 = 34
            if (r0 < r1) goto L1d
            xhss.ᛲᛵᲁᛲ r0 = new xhss.ᛲᛵᲁᛲ
            r0.<init>(r2, r3)
            r2.f2754 = r0
            return
        L1d:
            r1 = 31
            if (r0 < r1) goto L29
            xhss.ᛶᛳᛶᛳ r0 = new xhss.ᛶᛳᛶᛳ
            r0.<init>(r2, r3)
            r2.f2754 = r0
            return
        L29:
            xhss.ᲀᛷᲇᛷ r0 = new xhss.ᲀᛷᲇᛷ
            r0.<init>(r2, r3)
            r2.f2754 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static xhss.C0847 m1430(android.view.View r2, android.view.WindowInsets r3) {
            xhss.ᲀᛳᛲᛶ r0 = new xhss.ᲀᛳᛲᛶ
            r3.getClass()
            r0.<init>(r3)
            if (r2 == 0) goto L2f
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L2f
            int r3 = xhss.AbstractC0624.f2154
            xhss.ᲀᛳᛲᛶ r3 = xhss.AbstractC0989.m1625(r2)
            xhss.ᛵᛸᛱ r1 = r0.f2754
            r1.mo329(r3)
            android.view.View r3 = r2.getRootView()
            r1.mo907(r3)
            r1.mo336(r3)
            r1.mo328()
            int r2 = r2.getWindowSystemUiVisibility()
            r1.mo325(r2)
        L2f:
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof xhss.C0847
            if (r0 != 0) goto La
            r1 = 0
            return r1
        La:
            xhss.ᲀᛳᛲᛶ r2 = (xhss.C0847) r2
            xhss.ᛵᛸᛱ r1 = r1.f2754
            xhss.ᛵᛸᛱ r2 = r2.f2754
            boolean r1 = java.util.Objects.equals(r1, r2)
            return r1
    }

    public final int hashCode() {
            r0 = this;
            xhss.ᛵᛸᛱ r0 = r0.f2754
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.view.WindowInsets m1431() {
            r1 = this;
            xhss.ᛵᛸᛱ r1 = r1.f2754
            boolean r0 = r1 instanceof xhss.AbstractC0119
            if (r0 == 0) goto Lb
            xhss.ᛲᛱᛱᛵ r1 = (xhss.AbstractC0119) r1
            android.view.WindowInsets r1 = r1.f540
            return r1
        Lb:
            r1 = 0
            return r1
    }
}
