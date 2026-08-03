package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f516;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f517;

    public /* synthetic */ j4(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f516 = r1
            r0.f517 = r2
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r15 = this;
            int r0 = r15.f516
            r1 = 1
            r2 = 0
            r3 = 5
            r4 = 6
            switch(r0) {
                case 0: goto L55;
                case 1: goto L3a;
                case 2: goto La;
                default: goto L9;
            }
        L9:
            goto L6f
        La:
            java.lang.Object r0 = r15.f517
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r1 = p000.z1.f1230
            r1 = 13
            byte[] r1 = new byte[r1]
            r1 = {x02b8: FILL_ARRAY_DATA , data: [-8, -94, 118, -121, 85, 59, -82, -126, 126, -112, 95, 47, -88} // fill-array
            byte[] r2 = new byte[r4]
            r2 = {x02c4: FILL_ARRAY_DATA , data: [-36, -50, 31, -23, 48, 90} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m189(r1, r0)
            ۟.k r1 = p000.k8.f660
            com.skyhand.redbookhelper.utils.sqllite.AppDatabase r1 = ۟.k8.a.m234()
            ۟.yb r1 = r1.mo13()
            java.util.ArrayList r1 = r1.getAll()
            ۟.a2 r2 = new ۟.a2
            r2.<init>(r1, r0)
            p000.l3.m268(r2)
            return
        L3a:
            java.lang.Object r0 = r15.f517
            java.lang.String r0 = (java.lang.String) r0
            byte[] r1 = new byte[r3]
            r1 = {x02cc: FILL_ARRAY_DATA , data: [71, -55, 108, -86, -13} // fill-array
            byte[] r3 = new byte[r4]
            r3 = {x02d4: FILL_ARRAY_DATA , data: [99, -67, 9, -46, -121, -109} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r0)
            int r1 = p000.o.f829
            p000.o.m318(r2, r0)
            return
        L55:
            java.lang.Object r0 = r15.f517
            ۟.k4 r0 = (p000.k4) r0
            monitor-enter(r0)
            r0.f645 = r2     // Catch: java.lang.Throwable -> L6c
            ۟.k4$b r3 = r0.f647     // Catch: java.lang.Throwable -> L6c
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L6c
            boolean[] r4 = r3.f653     // Catch: java.lang.Throwable -> L69
            java.util.Arrays.fill(r4, r2)     // Catch: java.lang.Throwable -> L69
            r3.f655 = r1     // Catch: java.lang.Throwable -> L69
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            return
        L69:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L69
            throw r1     // Catch: java.lang.Throwable -> L6c
        L6c:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r1
        L6f:
            java.lang.Object r0 = r15.f517
            android.app.Application r0 = (android.app.Application) r0
            r5 = 12
            byte[] r5 = new byte[r5]
            r5 = {x02dc: FILL_ARRAY_DATA , data: [-57, 124, 6, -101, -123, 46, -128, 124, 2, -126, -122, 41} // fill-array
            byte[] r6 = new byte[r4]
            r6 = {x02e6: FILL_ARRAY_DATA , data: [-29, 29, 118, -21, -23, 71} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            p000.h4.m189(r5, r0)
            com.tendcloud.tenddata.TalkingDataSDK.startA(r0)
            ۟.kb r5 = p000.q.f899
            boolean r5 = ۟.q.c.m348(r0)
            r6 = 2
            if (r5 != 0) goto L94
            goto L106
        L94:
            java.util.List r5 = p000.nb.m303()
            java.lang.Object r7 = r5.get(r1)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.length()
            if (r8 <= 0) goto La6
            r8 = r1
            goto La7
        La6:
            r8 = r2
        La7:
            if (r8 == 0) goto L106
            java.lang.Object r8 = r5.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r9 = p000.b6.m68()
            int r9 = r9.length()
            if (r9 <= 0) goto Lc1
            r9 = r1
            goto Lc2
        Lc1:
            r9 = r2
        Lc2:
            if (r9 == 0) goto Lc7
            com.tendcloud.tenddata.TalkingDataProfileType r9 = com.tendcloud.tenddata.TalkingDataProfileType.TYPE1
            goto Lf6
        Lc7:
            boolean r9 = p000.b6.m67()
            if (r9 == 0) goto Ld0
            com.tendcloud.tenddata.TalkingDataProfileType r9 = com.tendcloud.tenddata.TalkingDataProfileType.TYPE2
            goto Lf6
        Ld0:
            boolean r9 = p000.b6.m66()
            if (r9 == 0) goto Ld9
            com.tendcloud.tenddata.TalkingDataProfileType r9 = com.tendcloud.tenddata.TalkingDataProfileType.TYPE3
            goto Lf6
        Ld9:
            boolean r9 = p000.b6.m71()
            if (r9 == 0) goto Le2
            com.tendcloud.tenddata.TalkingDataProfileType r9 = com.tendcloud.tenddata.TalkingDataProfileType.TYPE7
            goto Lf6
        Le2:
            boolean r9 = p000.b6.m70()
            if (r9 == 0) goto Leb
            com.tendcloud.tenddata.TalkingDataProfileType r9 = com.tendcloud.tenddata.TalkingDataProfileType.TYPE4
            goto Lf6
        Leb:
            boolean r9 = p000.b6.m72()
            if (r9 == 0) goto Lf4
            com.tendcloud.tenddata.TalkingDataProfileType r9 = com.tendcloud.tenddata.TalkingDataProfileType.TYPE5
            goto Lf6
        Lf4:
            com.tendcloud.tenddata.TalkingDataProfileType r9 = com.tendcloud.tenddata.TalkingDataProfileType.TYPE6
        Lf6:
            com.tendcloud.tenddata.TalkingDataProfile r10 = com.tendcloud.tenddata.TalkingDataProfile.createProfile()
            r10.setName(r8)
            r10.setType(r9)
            r10.setProperty1(r5)
            com.tendcloud.tenddata.TalkingDataSDK.onLogin(r7, r10)
        L106:
            java.util.List r5 = p000.nb.m303()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r5)
            java.lang.Object r5 = r7.get(r1)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L11d
            r5 = r1
            goto L11e
        L11d:
            r5 = r2
        L11e:
            r8 = 4
            r9 = 3
            if (r5 == 0) goto L1df
            java.lang.Object r5 = r7.get(r2)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r10 = r7.get(r1)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r7 = r7.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r12 = 8
            byte[] r13 = new byte[r12]
            r13 = {x02ee: FILL_ARRAY_DATA , data: [-73, -36, 42, 98, 105, -78, -81, -54} // fill-array
            byte[] r14 = new byte[r4]
            r14 = {x02f6: FILL_ARRAY_DATA , data: [-62, -81, 79, 16, 39, -45} // fill-array
            java.lang.String r13 = p000.oa.m332(r13, r14)
            r11.put(r13, r5)
            byte[] r5 = new byte[r9]
            r5 = {x02fe: FILL_ARRAY_DATA , data: [-118, 78, 66} // fill-array
            byte[] r13 = new byte[r4]
            r13 = {x0304: FILL_ARRAY_DATA , data: [-1, 39, 38, -21, 34, -48} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r13)
            r11.put(r5, r10)
            byte[] r5 = new byte[r3]
            r5 = {x030c: FILL_ARRAY_DATA , data: [-38, -123, 99, -36, -15} // fill-array
            byte[] r10 = new byte[r4]
            r10 = {x0314: FILL_ARRAY_DATA , data: [-88, -32, 7, -75, -107, -26} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r10)
            r11.put(r5, r7)
            byte[] r5 = new byte[r8]
            r5 = {x031c: FILL_ARRAY_DATA , data: [38, -106, -102, -102} // fill-array
            byte[] r7 = new byte[r4]
            r7 = {x0322: FILL_ARRAY_DATA , data: [71, -64, -1, -24, -80, 21} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r7)
            int r7 = p000.l3.f739
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r11.put(r5, r7)
            java.lang.String r5 = p000.b6.m69()
            byte[] r7 = new byte[r8]
            r7 = {x032a: FILL_ARRAY_DATA , data: [-39, 80, -45, -118} // fill-array
            byte[] r10 = new byte[r4]
            r10 = {x0330: FILL_ARRAY_DATA , data: [-76, 6, -74, -8, 48, -29} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r10)
            byte[] r10 = new byte[r6]
            r10 = {x0338: FILL_ARRAY_DATA , data: [-55, 20} // fill-array
            byte[] r13 = new byte[r4]
            r13 = {x033e: FILL_ARRAY_DATA , data: [-6, 38, 49, -113, 74, -128} // fill-array
            java.lang.String r10 = p000.oa.m332(r10, r13)
            r11.put(r7, r10)
            byte[] r7 = new byte[r12]
            r7 = {x0346: FILL_ARRAY_DATA , data: [102, 76, 84, -29, 115, 74, 100, 77} // fill-array
            byte[] r10 = new byte[r4]
            r10 = {x034e: FILL_ARRAY_DATA , data: [22, 32, 53, -105, 21, 37} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r10)
            r11.put(r7, r5)
            byte[] r5 = new byte[r3]
            r5 = {x0356: FILL_ARRAY_DATA , data: [21, -10, -42, -65, 32} // fill-array
            byte[] r7 = new byte[r4]
            r7 = {x035e: FILL_ARRAY_DATA , data: [120, -103, -78, -38, 76, 65} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r7)
            java.lang.String r7 = android.os.Build.MODEL
            r11.put(r5, r7)
            r5 = 10
            byte[] r5 = new byte[r5]
            r5 = {x0366: FILL_ARRAY_DATA , data: [-75, 7, -53, 42, 35, -42, -107, 25, -5, 55} // fill-array
            byte[] r7 = new byte[r4]
            r7 = {x0370: FILL_ARRAY_DATA , data: [-38, 105, -98, 89, 70, -92} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r7)
            com.tendcloud.tenddata.TalkingDataSDK.onEvent(r0, r5, r11)
        L1df:
            java.lang.String r5 = p000.k8.f661
            int r5 = r5.length()
            if (r5 != 0) goto L1e9
            r5 = r1
            goto L1ea
        L1e9:
            r5 = r2
        L1ea:
            if (r5 != 0) goto L2ac
            r5 = 32
            byte[] r5 = new byte[r5]
            r5 = {x0378: FILL_ARRAY_DATA , data: [-57, -35, -104, 72, -51, 124, -70, -94, -73, 6, -3, 76, -60, -17, -99, 5, -79, 2, -70, -38, -87, 73, -4, 83, -58, -16, -100, 86, -78, 82, -60, -20} // fill-array
            byte[] r7 = new byte[r4]
            r7 = {x038c: FILL_ARRAY_DATA , data: [-5, -98, -39, 56, -115, 61} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r7)
            java.lang.String r5 = p000.jb.m208(r5)
            java.lang.String r7 = p000.k8.f661
            boolean r5 = p000.h4.m185(r5, r7)
            if (r5 == 0) goto L20a
            goto L2ac
        L20a:
            java.util.List r5 = p000.nb.m303()
            java.lang.Object r7 = r5.get(r1)
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L21c
            r7 = r1
            goto L21d
        L21c:
            r7 = r2
        L21d:
            if (r7 == 0) goto L2ac
            java.lang.Object r7 = r5.get(r2)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r10 = r5.get(r1)
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            int r11 = r5.length()
            if (r11 <= 0) goto L239
            r11 = r1
            goto L23a
        L239:
            r11 = r2
        L23a:
            if (r11 == 0) goto L2ac
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "sign_"
            r11.append(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            ۟.q7[] r12 = new p000.q7[r9]
            byte[] r13 = new byte[r9]
            r13 = {x0394: FILL_ARRAY_DATA , data: [12, -37, 103} // fill-array
            byte[] r14 = new byte[r4]
            r14 = {x039a: FILL_ARRAY_DATA , data: [121, -78, 3, 26, 76, 83} // fill-array
            java.lang.String r13 = p000.oa.m332(r13, r14)
            ۟.q7 r14 = new ۟.q7
            r14.<init>(r13, r10)
            r12[r2] = r14
            byte[] r3 = new byte[r3]
            r3 = {x03a2: FILL_ARRAY_DATA , data: [-23, 120, -52, 78, -74} // fill-array
            byte[] r10 = new byte[r4]
            r10 = {x03aa: FILL_ARRAY_DATA , data: [-101, 29, -88, 39, -46, 20} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r10)
            ۟.q7 r10 = new ۟.q7
            r10.<init>(r3, r5)
            r12[r1] = r10
            byte[] r1 = new byte[r8]
            r1 = {x03b2: FILL_ARRAY_DATA , data: [17, 120, 58, 33} // fill-array
            byte[] r3 = new byte[r4]
            r3 = {x03b8: FILL_ARRAY_DATA , data: [127, 17, 89, 74, -18, -105} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            ۟.q7 r3 = new ۟.q7
            r3.<init>(r1, r7)
            r12[r6] = r3
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            float r3 = (float) r9
            r4 = 1061158912(0x3f400000, float:0.75)
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 + r4
            int r3 = (int) r3
            r1.<init>(r3)
        L29b:
            if (r2 >= r9) goto L2a9
            r3 = r12[r2]
            A r4 = r3.f918
            B r3 = r3.f919
            r1.put(r4, r3)
            int r2 = r2 + 1
            goto L29b
        L2a9:
            com.tendcloud.tenddata.TalkingDataSDK.onEvent(r0, r11, r1)
        L2ac:
            return
    }
}
