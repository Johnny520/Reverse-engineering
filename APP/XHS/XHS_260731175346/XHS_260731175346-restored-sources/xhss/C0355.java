package xhss;

/* JADX INFO: renamed from: xhss.ᛴᛴᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0355 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object f1313;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.Object f1314;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public java.lang.Object f1315;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1316;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.Object f1317;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public java.lang.Object f1318;

    public C0355(android.widget.LinearLayout r2, android.widget.LinearLayout r3, android.widget.LinearLayout r4, android.widget.TextView r5, android.widget.TextView r6) {
            r1 = this;
            r0 = 2
            r1.f1316 = r0
            r1.<init>()
            r1.f1313 = r2
            r1.f1315 = r3
            r1.f1318 = r4
            r1.f1314 = r5
            r1.f1317 = r6
            return
    }

    public C0355(android.widget.LinearLayout r1, android.widget.TextView r2, android.widget.GridLayout r3, android.widget.ScrollView r4, android.widget.TextView r5, android.widget.TextView r6) {
            r0 = this;
            r3 = 0
            r0.f1316 = r3
            r0.<init>()
            r0.f1313 = r1
            r0.f1314 = r2
            r0.f1318 = r4
            r0.f1317 = r5
            r0.f1315 = r6
            return
    }

    public C0355(xhss.C0723 r2) {
            r1 = this;
            r0 = 1
            r1.f1316 = r0
            r1.<init>()
            r1.f1313 = r2
            xhss.ᛳᛲᛳᛳ r2 = xhss.AbstractC1075.f3466
            r1.f1315 = r2
            xhss.ᛵᛷᛷᲀ r2 = xhss.C0494.f1807
            r1.f1318 = r2
            return
    }

    public C0355(xhss.C1068 r2) {
            r1 = this;
            r0 = 3
            r1.f1316 = r0
            r1.<init>()
            java.lang.Object r0 = r2.f3444
            xhss.ᛷᛶᲁᛵ r0 = (xhss.C0669) r0
            if (r0 == 0) goto L28
            r1.f1313 = r0
            java.lang.Object r0 = r2.f3446
            java.lang.String r0 = (java.lang.String) r0
            r1.f1314 = r0
            java.lang.Object r0 = r2.f3445
            xhss.ᛴᲈᛱᲁ r0 = (xhss.C0425) r0
            r0.getClass()
            xhss.ᲁᛸᛱᛵ r0 = xhss.AbstractC0694.m1221(r0)
            r1.f1317 = r0
            java.lang.Object r2 = r2.f3447
            xhss.ᛳᛴᲀᲁ r2 = (xhss.C0263) r2
            r1.f1315 = r2
            return
        L28:
            java.lang.String r1 = "url == null"
            xhss.C0532.m950(r1)
            r1 = 0
            throw r1
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0355 m712(android.view.View r8) {
            r0 = 1678246038(0x64080096, float:1.0035198E22)
            android.view.View r1 = xhss.AbstractC0775.m1320(r8, r0)
            r4 = r1
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            if (r4 == 0) goto L39
            r0 = 1678246039(0x64080097, float:1.0035199E22)
            android.view.View r1 = xhss.AbstractC0775.m1320(r8, r0)
            r5 = r1
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            if (r5 == 0) goto L39
            r0 = 1678246173(0x6408011d, float:1.003535E22)
            android.view.View r1 = xhss.AbstractC0775.m1320(r8, r0)
            r6 = r1
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r6 == 0) goto L39
            r0 = 1678246175(0x6408011f, float:1.0035352E22)
            android.view.View r1 = xhss.AbstractC0775.m1320(r8, r0)
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L39
            r3 = r8
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            xhss.ᛴᛴᛴᛵ r2 = new xhss.ᛴᛴᛴᛵ
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L39:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r0)
            r0 = -353858522286149(0xfffebe2ae47a77bb, double:NaN)
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r8 = r0.concat(r8)
            xhss.C0532.m953(r8)
            r8 = 0
            return r8
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.f1316
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r6 = super.toString()
            return r6
        La:
            java.lang.Object r0 = r6.f1315
            xhss.ᛳᛴᲀᲁ r0 = (xhss.C0263) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 32
            r1.<init>(r2)
            java.lang.String r2 = "Request{method="
            r1.append(r2)
            java.lang.Object r2 = r6.f1314
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            java.lang.String r2 = ", url="
            r1.append(r2)
            java.lang.Object r2 = r6.f1313
            xhss.ᛷᛶᲁᛵ r2 = (xhss.C0669) r2
            r1.append(r2)
            java.lang.Object r6 = r6.f1317
            xhss.ᲁᛸᛱᛵ r6 = (xhss.C0972) r6
            int r2 = r6.size()
            if (r2 == 0) goto L82
            java.lang.String r2 = ", headers=["
            r1.append(r2)
            java.util.Iterator r6 = r6.iterator()
            r2 = 0
        L41:
            r3 = r6
            xhss.ᛸᛲᲀᛵ r3 = (xhss.C0737) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7d
            java.lang.Object r3 = r3.next()
            int r4 = r2 + 1
            if (r2 < 0) goto L78
            xhss.ᲀᛴᛳᛸ r3 = (xhss.C0857) r3
            java.lang.Object r5 = r3.f2767
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.f2768
            java.lang.String r3 = (java.lang.String) r3
            if (r2 <= 0) goto L63
            java.lang.String r2 = ", "
            r1.append(r2)
        L63:
            r1.append(r5)
            r2 = 58
            r1.append(r2)
            boolean r2 = xhss.AbstractC0577.m1043(r5)
            if (r2 == 0) goto L73
            java.lang.String r3 = "██"
        L73:
            r1.append(r3)
            r2 = r4
            goto L41
        L78:
            xhss.AbstractC0086.m244()
            r6 = 0
            throw r6
        L7d:
            r6 = 93
            r1.append(r6)
        L82:
            xhss.ᛳᛴᲀᲁ r6 = xhss.C0263.f974
            boolean r6 = xhss.AbstractC0007.m97(r0, r6)
            if (r6 != 0) goto L92
            java.lang.String r6 = ", tags="
            r1.append(r6)
            r1.append(r0)
        L92:
            r6 = 125(0x7d, float:1.75E-43)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            return r6
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.C1068 m713() {
            r2 = this;
            xhss.ᲇᛸᛶ r0 = new xhss.ᲇᛸᛶ
            r1 = 0
            r0.<init>(r1)
            java.lang.Object r1 = r2.f1313
            xhss.ᛷᛶᲁᛵ r1 = (xhss.C0669) r1
            r0.f3444 = r1
            java.lang.Object r1 = r2.f1314
            java.lang.String r1 = (java.lang.String) r1
            r0.f3446 = r1
            java.lang.Object r1 = r2.f1315
            xhss.ᛳᛴᲀᲁ r1 = (xhss.C0263) r1
            r0.f3447 = r1
            java.lang.Object r2 = r2.f1317
            xhss.ᲁᛸᛱᛵ r2 = (xhss.C0972) r2
            xhss.ᛴᲈᛱᲁ r2 = xhss.AbstractC0694.m1209(r2)
            r0.f3445 = r2
            return r0
    }
}
