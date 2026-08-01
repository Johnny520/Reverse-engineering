package xhss;

/* JADX INFO: renamed from: xhss.ᛸᲁᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0814 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final android.widget.TextView f2637;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final android.widget.TextView f2638;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final android.widget.TextView f2639;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final android.widget.LinearLayout f2640;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final android.widget.TextView f2641;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final android.widget.TextView f2642;

    public C0814(android.widget.LinearLayout r1, android.widget.TextView r2, android.widget.TextView r3, android.widget.TextView r4, android.widget.TextView r5, android.widget.TextView r6) {
            r0 = this;
            r0.<init>()
            r0.f2640 = r1
            r0.f2637 = r2
            r0.f2638 = r3
            r0.f2641 = r4
            r0.f2639 = r5
            r0.f2642 = r6
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0814 m1376(android.view.LayoutInflater r8, android.widget.LinearLayout r9) {
            r0 = 1678442542(0x640b002e, float:1.0256441E22)
            r1 = 0
            android.view.View r8 = r8.inflate(r0, r9, r1)
            r9 = 1678245987(0x64080063, float:1.003514E22)
            android.view.View r0 = xhss.AbstractC0775.m1320(r8, r9)
            r3 = r0
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L4d
            r9 = 1678245995(0x6408006b, float:1.0035149E22)
            android.view.View r0 = xhss.AbstractC0775.m1320(r8, r9)
            r4 = r0
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L4d
            r9 = 1678246042(0x6408009a, float:1.0035202E22)
            android.view.View r0 = xhss.AbstractC0775.m1320(r8, r9)
            r5 = r0
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L4d
            r9 = 1678246086(0x640800c6, float:1.0035252E22)
            android.view.View r0 = xhss.AbstractC0775.m1320(r8, r9)
            r6 = r0
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L4d
            r9 = 1678246091(0x640800cb, float:1.0035257E22)
            android.view.View r0 = xhss.AbstractC0775.m1320(r8, r9)
            r7 = r0
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L4d
            xhss.ᛸᲁᲈᛷ r1 = new xhss.ᛸᲁᲈᛷ
            r2 = r8
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L4d:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r9)
            r0 = -355546444433477(0xfffebca1e47a77bb, double:NaN)
            java.lang.String r9 = xhss.AbstractC0775.m1313(r0)
            java.lang.String r8 = r9.concat(r8)
            xhss.C0532.m953(r8)
            r8 = 0
            return r8
    }
}
