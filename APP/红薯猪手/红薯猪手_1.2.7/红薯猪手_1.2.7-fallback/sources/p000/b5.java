package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b5 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f151;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f152;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f153;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f154;

    public /* synthetic */ b5(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.f151 = r4
            r0.f152 = r1
            r0.f153 = r2
            r0.f154 = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.f151
            r1 = 4
            r2 = 1
            r3 = 6
            switch(r0) {
                case 0: goto L18f;
                case 1: goto Lfb;
                case 2: goto La;
                default: goto L8;
            }
        L8:
            goto L1ff
        La:
            java.lang.Object r0 = r10.f152
            ۟.o5 r0 = (p000.o5) r0
            java.lang.Object r1 = r10.f153
            ۟.h2 r1 = (p000.h2) r1
            java.lang.Object r4 = r10.f154
            android.app.Activity r4 = (android.app.Activity) r4
            byte[] r5 = new byte[r3]
            r5 = {x024a: FILL_ARRAY_DATA , data: [16, -26, 64, 42, -20, -40} // fill-array
            byte[] r6 = new byte[r3]
            r6 = {x0252: FILL_ARRAY_DATA , data: [100, -114, 41, 89, -56, -24} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            p000.h4.m189(r5, r1)
            r5 = 8
            byte[] r5 = new byte[r5]
            r5 = {x025a: FILL_ARRAY_DATA , data: [-63, 14, 4, -43, 70, 100, -99, 25} // fill-array
            byte[] r6 = new byte[r3]
            r6 = {x0262: FILL_ARRAY_DATA , data: [-27, 109, 107, -69, 50, 1} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            p000.h4.m189(r5, r4)
            ۟.o1 r5 = p000.m5.f771
            ۟.o1 r5 = r0.f850
            p000.m5.f771 = r5
            ۟.wb r5 = r0.f854
            p000.m5.f772 = r5
            ۟.p1 r5 = r0.f849
            r6 = 0
            if (r5 == 0) goto L52
            java.lang.Boolean r5 = r5.f881
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r5 = p000.h4.m185(r5, r7)
            goto L53
        L52:
            r5 = r6
        L53:
            if (r5 == 0) goto Lf5
            ۟.p1 r5 = r0.f849
            if (r5 == 0) goto L69
            java.lang.String r5 = r5.f879
            if (r5 == 0) goto L69
            int r5 = r5.length()
            if (r5 <= 0) goto L65
            r5 = r2
            goto L66
        L65:
            r5 = r6
        L66:
            if (r5 != r2) goto L69
            goto L6a
        L69:
            r2 = r6
        L6a:
            if (r2 == 0) goto Lf5
            ۟.p1 r2 = r0.f849
            p000.h4.m186(r2)
            ۟.i2 r5 = new ۟.i2
            r5.<init>(r4, r0, r1)
            ۟.h2$a r0 = p000.h2.f427
            ۟.o7 r0 = p000.o7.f856
            java.lang.String r0 = p000.h2.f428
            int r1 = p000.o7.m325(r0)
            java.lang.Boolean r7 = r2.f877
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r7 = p000.h4.m185(r7, r8)
            if (r7 != 0) goto L99
            java.lang.Integer r7 = r2.f885
            if (r7 != 0) goto L8f
            goto L99
        L8f:
            int r7 = r7.intValue()
            if (r1 != r7) goto L99
            r5.mo11()
            goto Lfa
        L99:
            ۟.w6 r1 = new ۟.w6
            java.lang.String r7 = r2.f878
            if (r7 != 0) goto Lad
            byte[] r7 = new byte[r3]
            r7 = {x026a: FILL_ARRAY_DATA , data: [-109, -48, -112, 111, 88, -39} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x0272: FILL_ARRAY_DATA , data: [117, 95, 0, -120, -4, 99} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r3)
        Lad:
            java.lang.String r3 = r2.f879
            if (r3 == 0) goto Lb8
            int r9 = p000.o.f829
            android.text.Spanned r3 = p000.o.m321(r3)
            goto Lba
        Lb8:
            java.lang.String r3 = ""
        Lba:
            r1.<init>(r4, r7, r3)
            java.lang.Integer r3 = r2.f884
            if (r3 == 0) goto Lc6
            int r3 = r3.intValue()
            goto Lc7
        Lc6:
            r3 = r6
        Lc7:
            p000.jb.m219(r1, r3)
            ۟.n2 r3 = new ۟.n2
            r3.<init>(r2, r5)
            r1.m175(r3)
            java.lang.Boolean r3 = r2.f882
            boolean r3 = p000.h4.m185(r3, r8)
            if (r3 == 0) goto Le1
            r1.m172()
            r1.setCancelable(r6)
            goto Le9
        Le1:
            ۟.m2 r3 = new ۟.m2
            r3.<init>(r2, r5)
            r1.m173(r3)
        Le9:
            r1.show()
            java.lang.Integer r1 = r2.f885
            p000.h4.m186(r1)
            p000.o7.m329(r0, r1)
            goto Lfa
        Lf5:
            ۟.wb r0 = r0.f854
            p000.h2.m180(r1, r4, r0)
        Lfa:
            return
        Lfb:
            java.lang.Object r0 = r10.f152
            ۟.ac r0 = (p000.ac) r0
            java.lang.Object r1 = r10.f153
            ۟.p8 r1 = (p000.p8) r1
            java.lang.Object r4 = r10.f154
            ۟.p8 r4 = (p000.p8) r4
            byte[] r5 = new byte[r3]
            r5 = {x027a: FILL_ARRAY_DATA , data: [0, 99, -117, -4, -86, 104} // fill-array
            byte[] r6 = new byte[r3]
            r6 = {x0282: FILL_ARRAY_DATA , data: [116, 11, -30, -113, -114, 88} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            p000.h4.m189(r5, r0)
            r5 = 7
            byte[] r6 = new byte[r5]
            r6 = {x028a: FILL_ARRAY_DATA , data: [123, -31, -89, -12, 77, -60, 50} // fill-array
            byte[] r7 = new byte[r3]
            r7 = {x0292: FILL_ARRAY_DATA , data: [95, -128, -53, -104, 3, -79} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r7)
            p000.h4.m189(r6, r1)
            byte[] r5 = new byte[r5]
            r5 = {x029a: FILL_ARRAY_DATA , data: [-25, 95, -118, 16, -88, -103, -82} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x02a2: FILL_ARRAY_DATA , data: [-61, 59, -17, 124, -26, -20} // fill-array
            java.lang.String r3 = p000.oa.m332(r5, r3)
            p000.h4.m189(r3, r4)
            int r3 = p000.ac.f112
            ۟.ac$b r3 = r0.m50()
            java.util.List<۟.j3> r3 = r3.f118
            java.lang.String r5 = "<this>"
            p000.h4.m189(r5, r3)
            int r3 = r3.size()
            r5 = -1
            int r3 = r3 + r5
        L14e:
            if (r5 >= r3) goto L186
            ۟.ac$b r6 = r0.m50()
            java.util.List<۟.j3> r6 = r6.f118
            java.lang.Object r6 = r6.get(r3)
            ۟.j3 r6 = (p000.j3) r6
            boolean r7 = r6.f506
            if (r7 == 0) goto L183
            int r7 = r1.f896
            int r7 = r7 + r2
            r1.f896 = r7
            ۟.k r7 = p000.k8.f660
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase r7 = ۟.k8.a.m234()
            ۟.yb r7 = r7.mo13()
            int r6 = r7.mo488(r6)
            if (r6 == r5) goto L183
            int r6 = r4.f896
            int r6 = r6 + r2
            r4.f896 = r6
            ۟.ac$b r6 = r0.m50()
            java.util.List<۟.j3> r6 = r6.f118
            r6.remove(r3)
        L183:
            int r3 = r3 + (-1)
            goto L14e
        L186:
            ۟.ec r2 = new ۟.ec
            r2.<init>(r0, r1, r4)
            p000.l3.m268(r2)
            return
        L18f:
            java.lang.Object r0 = r10.f152
            ۟.c5 r0 = (p000.c5) r0
            java.lang.Object r2 = r10.f153
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r10.f154
            java.lang.String r4 = (java.lang.String) r4
            byte[] r5 = new byte[r3]
            r5 = {x02aa: FILL_ARRAY_DATA , data: [3, -54, -49, -67, -64, -78} // fill-array
            byte[] r6 = new byte[r3]
            r6 = {x02b2: FILL_ARRAY_DATA , data: [119, -94, -90, -50, -28, -126} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            p000.h4.m189(r5, r0)
            byte[] r5 = new byte[r1]
            r5 = {x02ba: FILL_ARRAY_DATA , data: [70, -9, -122, 35} // fill-array
            byte[] r6 = new byte[r3]
            r6 = {x02c0: FILL_ARRAY_DATA , data: [98, -101, -24, 68, -55, 113} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            p000.h4.m189(r5, r2)
            byte[] r1 = new byte[r1]
            r1 = {x02c8: FILL_ARRAY_DATA , data: [29, -54, 31, 67} // fill-array
            byte[] r5 = new byte[r3]
            r5 = {x02ce: FILL_ARRAY_DATA , data: [57, -90, 126, 55, -52, -65} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r5)
            p000.h4.m189(r1, r4)
            android.widget.EditText r0 = r0.f255
            if (r0 == 0) goto L1ea
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = ","
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            return
        L1ea:
            r0 = 13
            byte[] r0 = new byte[r0]
            r0 = {x02d6: FILL_ARRAY_DATA , data: [-73, -118, 90, 17, 119, 48, -75, -84, 95, 12, 106, 19, -76} // fill-array
            byte[] r1 = new byte[r3]
            r1 = {x02e2: FILL_ARRAY_DATA , data: [-38, -49, 62, 120, 3, 124} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m191(r0)
            r0 = 0
            throw r0
        L1ff:
            java.lang.Object r0 = r10.f152
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            java.lang.Object r2 = r10.f153
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r4 = r10.f154
            ۟.f3 r4 = (p000.f3) r4
            ۟.n8 r5 = p000.n8.f823
            byte[] r1 = new byte[r1]
            r1 = {x02ea: FILL_ARRAY_DATA , data: [50, 104, -53, -14} // fill-array
            byte[] r5 = new byte[r3]
            r5 = {x02f0: FILL_ARRAY_DATA , data: [22, 9, -88, -122, 34, 32} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r5)
            p000.h4.m189(r1, r2)
            r1 = 10
            byte[] r1 = new byte[r1]
            r1 = {x02f8: FILL_ARRAY_DATA , data: [-24, -22, -123, 74, -26, -58, -114, -24, -118, 72} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x0302: FILL_ARRAY_DATA , data: [-52, -119, -23, 35, -123, -83} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r4)
            ۟.v8 r1 = new ۟.v8
            ۟.n8$a r3 = new ۟.n8$a
            r3.<init>(r4)
            r1.<init>(r2, r3)
            r0.addView(r1)
            return
    }
}
