package p000;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends p000.ya {

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public final p000.p0 f281;

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public final java.util.List<p000.p0> f282;

    /* JADX INFO: renamed from: ۥ۠ۦ, reason: contains not printable characters */
    public final java.lang.String f283;

    /* JADX INFO: renamed from: ۥ۠ۧ, reason: contains not printable characters */
    public final int f284;

    public static final class a extends p000.o4 implements p000.f3<p000.vb> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.n1 f285;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ p000.d0 f286;

        public a(p000.n1 r1, p000.d0 r2) {
                r0 = this;
                r0.f285 = r1
                r0.f286 = r2
                r0.<init>()
                return
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000.f3
        /* JADX INFO: renamed from: ۥ */
        public final p000.vb mo11() {
                r5 = this;
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                ۟.n1 r1 = r5.f285
                java.util.List<۟.p0> r1 = r1.f813
                java.util.Iterator r1 = r1.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L29
                java.lang.Object r2 = r1.next()
                ۟.p0 r2 = (p000.p0) r2
                java.lang.Boolean r3 = r2.f874
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                boolean r3 = p000.h4.m185(r3, r4)
                if (r3 == 0) goto Ld
                java.lang.String r2 = r2.f865
                r0.add(r2)
                goto Ld
            L29:
                ۟.kb r1 = p000.d1.f287
                ۟.x3 r1 = ۟.d1.b.m121()
                ۟.d0 r2 = r5.f286
                ۟.p0 r2 = r2.f281
                java.lang.String r2 = r2.f865
                r1.mo141(r2, r0)
                ۟.vb r0 = p000.vb.f1114
                return r0
        }
    }

    public d0(p000.p0 r4, java.util.ArrayList r5, android.content.Context r6, java.lang.String r7) {
            r3 = this;
            r0 = 10
            byte[] r0 = new byte[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [-63, -102, -114, -7, 24, -110, -11, -102, -120, -3} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x005e: FILL_ARRAY_DATA , data: [-79, -5, -4, -100, 118, -26} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r4)
            r0 = 8
            byte[] r0 = new byte[r0]
            r0 = {x0066: FILL_ARRAY_DATA , data: [-55, 89, 25, 91, 60, 111, -47, 81} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x006e: FILL_ARRAY_DATA , data: [-91, 48, 106, 47, 120, 14} // fill-array
            p000.oa.m332(r0, r2)
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x0076: FILL_ARRAY_DATA , data: [102, 28, -86} // fill-array
            byte[] r2 = new byte[r1]
            r2 = {x007c: FILL_ARRAY_DATA , data: [5, 100, -34, 63, -121, -11} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r6)
            r0 = 11
            byte[] r0 = new byte[r0]
            r0 = {x0084: FILL_ARRAY_DATA , data: [-63, 46, -7, 124, -94, -78, -36, 38, -31, 127, -96} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x008e: FILL_ARRAY_DATA , data: [-75, 71, -115, 16, -57, -10} // fill-array
            p000.oa.m332(r0, r1)
            r0 = 0
            r3.<init>(r6, r0)
            r3.f281 = r4
            r3.f282 = r5
            r3.f283 = r7
            r4 = 291(0x123, float:4.08E-43)
            r3.f284 = r4
            return
    }

    @Override // p000.ya
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final android.view.View mo120() {
            r5 = this;
            android.widget.LinearLayout r0 = r5.m481()     // Catch: java.lang.Exception -> L83
            r1 = -1
            android.widget.TextView r2 = r5.m483(r1)     // Catch: java.lang.Exception -> L83
            java.lang.String r3 = r5.f283     // Catch: java.lang.Exception -> L83
            int r3 = r3.length()     // Catch: java.lang.Exception -> L83
            if (r3 <= 0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 == 0) goto L19
            java.lang.String r3 = r5.f283     // Catch: java.lang.Exception -> L83
            goto L1d
        L19:
            ۟.p0 r3 = r5.f281     // Catch: java.lang.Exception -> L83
            java.lang.CharSequence r3 = r3.f866     // Catch: java.lang.Exception -> L83
        L1d:
            r2.setText(r3)     // Catch: java.lang.Exception -> L83
            r0.addView(r2)     // Catch: java.lang.Exception -> L83
            androidx.recyclerview.widget.RecyclerView r2 = new androidx.recyclerview.widget.RecyclerView     // Catch: java.lang.Exception -> L83
            android.content.Context r3 = r5.m484()     // Catch: java.lang.Exception -> L83
            r2.<init>(r3)     // Catch: java.lang.Exception -> L83
            int r3 = r5.f284     // Catch: java.lang.Exception -> L83
            r2.setId(r3)     // Catch: java.lang.Exception -> L83
            androidx.recyclerview.widget.LinearLayoutManager r3 = new androidx.recyclerview.widget.LinearLayoutManager     // Catch: java.lang.Exception -> L83
            android.content.Context r4 = r5.m484()     // Catch: java.lang.Exception -> L83
            r3.<init>(r4)     // Catch: java.lang.Exception -> L83
            r2.setLayoutManager(r3)     // Catch: java.lang.Exception -> L83
            ۟.j8 r3 = new ۟.j8     // Catch: java.lang.Exception -> L83
            r3.<init>()     // Catch: java.lang.Exception -> L83
            r2.addItemDecoration(r3)     // Catch: java.lang.Exception -> L83
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch: java.lang.Exception -> L83
            r3.<init>(r1, r1)     // Catch: java.lang.Exception -> L83
            r1 = 1065353216(0x3f800000, float:1.0)
            r3.weight = r1     // Catch: java.lang.Exception -> L83
            r2.setLayoutParams(r3)     // Catch: java.lang.Exception -> L83
            ۟.n1 r1 = new ۟.n1     // Catch: java.lang.Exception -> L83
            java.util.List<۟.p0> r3 = r5.f282     // Catch: java.lang.Exception -> L83
            r1.<init>(r3)     // Catch: java.lang.Exception -> L83
            ۟.d0$a r3 = new ۟.d0$a     // Catch: java.lang.Exception -> L83
            r3.<init>(r1, r5)     // Catch: java.lang.Exception -> L83
            r1.m292(r3)     // Catch: java.lang.Exception -> L83
            r2.setAdapter(r1)     // Catch: java.lang.Exception -> L83
            r0.addView(r2)     // Catch: java.lang.Exception -> L83
            android.widget.TextView r1 = r5.m480()     // Catch: java.lang.Exception -> L83
            java.util.List r1 = p000.jb.m214(r1)     // Catch: java.lang.Exception -> L83
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L83
        L72:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L83
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L83
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Exception -> L83
            r0.addView(r2)     // Catch: java.lang.Exception -> L83
            goto L72
        L82:
            return r0
        L83:
            r0 = 0
            return r0
    }
}
