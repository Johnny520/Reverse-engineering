package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y5 extends p000.o4 implements p000.g3<java.lang.String, java.lang.Boolean> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ p000.u5 f1200;

    public y5(p000.u5 r1) {
            r0 = this;
            r0.f1200 = r1
            r0.<init>()
            return
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final java.lang.Boolean mo12(java.lang.String r12) {
            r11 = this;
            java.lang.String r12 = (java.lang.String) r12
            r0 = 4
            byte[] r1 = new byte[r0]
            r1 = {x0196: FILL_ARRAY_DATA , data: [-66, 81, 10, 2} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x019c: FILL_ARRAY_DATA , data: [-54, 52, 114, 118, 67, -37} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r12)
            java.io.File r1 = new java.io.File
            r1.<init>(r12)
            boolean r1 = r1.isDirectory()
            r3 = 0
            r4 = 18
            if (r1 == 0) goto L17f
            ۟.u5 r1 = r11.f1200
            ۟.z5 r5 = p000.u5.f1066
            r1.getClass()
            java.io.File r1 = new java.io.File
            ۟.kb r5 = p000.d1.f287
            ۟.x3 r5 = ۟.d1.b.m121()
            java.lang.String r5 = r5.getPath()
            r1.<init>(r5)
            boolean r5 = r1.exists()
            if (r5 != 0) goto L56
            int r12 = p000.o.f829
            r12 = 24
            byte[] r12 = new byte[r12]
            r12 = {x01a4: FILL_ARRAY_DATA , data: [-74, 88, 1, 69, -67, -113, -73, 95, 63, 74, -82, -123, -76, 89, 39, 72, -128, -113, -75, 79, 9, 73, -92, -86} // fill-array
            byte[] r0 = new byte[r2]
            r0 = {x01b4: FILL_ARRAY_DATA , data: [80, -30, -111, -84, 56, 2} // fill-array
            java.lang.String r12 = p000.oa.m332(r12, r0)
        L51:
            p000.o.m318(r3, r12)
            goto L17a
        L56:
            int r5 = p000.va.m439(r12)
            char r5 = r12.charAt(r5)
            char r6 = java.io.File.separatorChar
            if (r5 == r6) goto L74
            java.lang.String r5 = java.io.File.separator
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L75
        L74:
            r5 = r12
        L75:
            r6 = 12
            byte[] r6 = new byte[r6]
            r6 = {x01bc: FILL_ARRAY_DATA , data: [-104, -60, -9, 10, 48, 78, -104, -14, -1, 4, 47, 106} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x01c6: FILL_ARRAY_DATA , data: [127, 126, 85, -30, -90, -31} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r7)
            byte[] r7 = new byte[r2]
            r7 = {x01ce: FILL_ARRAY_DATA , data: [3, -11, 43, -36, -32, -6} // fill-array
            byte[] r8 = new byte[r2]
            r8 = {x01d6: FILL_ARRAY_DATA , data: [-22, 112, -90, 59, 93, 84} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r8)
            java.lang.StringBuilder r6 = p000.r2.m354(r6, r7)
            int r7 = p000.o.f829
            r7 = 19
            byte[] r7 = new byte[r7]
            r7 = {x01de: FILL_ARRAY_DATA , data: [16, -123, 56, 57, -47, -59, 13, -104, 108, 40, -12, 111, -21, 69, 44, 45, 121, 0, -17} // fill-array
            byte[] r8 = new byte[r2]
            r8 = {x01ec: FILL_ARRAY_DATA , data: [105, -4, 65, 64, -100, -120} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r8)
            byte[] r8 = new byte[r2]
            r8 = {x01f4: FILL_ARRAY_DATA , data: [70, -33, 77, -74, -90, -3} // fill-array
            byte[] r9 = new byte[r2]
            r9 = {x01fc: FILL_ARRAY_DATA , data: [32, -80, 63, -37, -57, -119} // fill-array
            p000.oa.m332(r8, r9)
            java.text.SimpleDateFormat r8 = new java.text.SimpleDateFormat
            java.util.Locale r9 = java.util.Locale.CHINESE
            r8.<init>(r7, r9)
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            java.lang.String r7 = r8.format(r7)
            r8 = 11
            byte[] r9 = new byte[r8]
            r9 = {x0204: FILL_ARRAY_DATA , data: [-105, 35, 106, 81, -21, -105, -39, 98, 54, 18, -93} // fill-array
            byte[] r10 = new byte[r2]
            r10 = {x020e: FILL_ARRAY_DATA , data: [-15, 76, 24, 60, -118, -29} // fill-array
            java.lang.String r9 = p000.oa.m332(r9, r10)
            p000.h4.m188(r9, r7)
            r6.append(r7)
            byte[] r0 = new byte[r0]
            r0 = {x0216: FILL_ARRAY_DATA , data: [-67, -69, -103, 91} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x021c: FILL_ARRAY_DATA , data: [-109, -61, -12, 55, -5, -88} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r7)
            r6.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L167
            r5.<init>(r0)     // Catch: java.lang.Exception -> L167
            r5.createNewFile()     // Catch: java.lang.Exception -> L167
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            p000.k0.m224(r1, r5)
            boolean r1 = r5.exists()
            if (r1 == 0) goto L157
            ۟.x3 r1 = ۟.d1.b.m121()
            byte[] r3 = new byte[r8]
            r3 = {x0224: FILL_ARRAY_DATA , data: [-118, 48, -38, -43, -35, -119, -80, 56, -53, -50, -57} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x022e: FILL_ARRAY_DATA , data: [-17, 72, -86, -70, -81, -3} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r4)
            r1.mo140(r3, r12)
            r12 = 21
            byte[] r12 = new byte[r12]
            r12 = {x0236: FILL_ARRAY_DATA , data: [100, 112, 125, -84, -76, -73, 104, 90, 76, -82, -114, -93, 103, 87, 81, -84, -71, -110, 110, 99, 91} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x0246: FILL_ARRAY_DATA , data: [-127, -33, -63, 73, 51, 13} // fill-array
            java.lang.String r12 = p000.oa.m332(r12, r1)
            java.lang.StringBuilder r12 = p000.r2.m354(r12, r0)
            java.lang.String r12 = r12.toString()
            r0 = 13
            byte[] r0 = new byte[r0]
            r0 = {x024e: FILL_ARRAY_DATA , data: [60, -66, -15, 82, -84, -52, 38, -74, -118, 8, -16, -117, 97} // fill-array
            byte[] r1 = new byte[r2]
            r1 = {x025a: FILL_ARRAY_DATA , data: [72, -47, -94, 38, -34, -91} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.h4.m188(r0, r12)
            r3 = 1
        L153:
            p000.o.m318(r3, r12)
            goto L17a
        L157:
            byte[] r12 = new byte[r4]
            r12 = {x0262: FILL_ARRAY_DATA , data: [117, 52, -119, 89, -29, 88, 121, 30, -72, 91, -39, 76, 117, 63, -124, 84, -48, 71} // fill-array
            byte[] r0 = new byte[r2]
            r0 = {x0270: FILL_ARRAY_DATA , data: [-112, -101, 53, -68, 100, -30} // fill-array
            java.lang.String r12 = p000.oa.m332(r12, r0)
            goto L51
        L167:
            int r12 = p000.o.f829
            r12 = 39
            byte[] r12 = new byte[r12]
            r12 = {x0278: FILL_ARRAY_DATA , data: [3, 0, 63, -49, 12, 117, 0, 30, 35, -50, 12, 121, 3, 44, 21, -62, 3, 106, 9, 52, 40, -52, 58, 109, 2, 48, 14, -51, 44, 97, 3, 53, 49, -62, 24, 90, 14, 39, 49} // fill-array
            byte[] r0 = new byte[r2]
            r0 = {x0290: FILL_ARRAY_DATA , data: [-26, -120, -92, 42, -73, -49} // fill-array
            java.lang.String r12 = p000.oa.m332(r12, r0)
            goto L153
        L17a:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            goto L194
        L17f:
            int r12 = p000.o.f829
            byte[] r12 = new byte[r4]
            r12 = {x0298: FILL_ARRAY_DATA , data: [29, -109, 90, -111, -36, 30, 18, -122, 67, -111, -18, 29, 16, -71, 92, -100, -25, 45} // fill-array
            byte[] r0 = new byte[r2]
            r0 = {x02a6: FILL_ARRAY_DATA , data: [-11, 29, -19, 116, 83, -120} // fill-array
            java.lang.String r12 = p000.oa.m332(r12, r0)
            p000.o.m318(r3, r12)
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
        L194:
            return r12
    }
}
