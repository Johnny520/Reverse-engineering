package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hb implements java.lang.Runnable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f471;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ p000.gb f472;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ java.lang.CharSequence f473;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final /* synthetic */ int f474;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final /* synthetic */ p000.p8 f475;

    public /* synthetic */ hb(p000.gb r2, java.lang.CharSequence r3, int r4, p000.p8 r5) {
            r1 = this;
            r0 = 1
            r1.f471 = r0
            r1.<init>()
            r1.f472 = r2
            r1.f473 = r3
            r1.f474 = r4
            r1.f475 = r5
            return
    }

    public /* synthetic */ hb(p000.p8 r2, int r3, p000.w6 r4, java.lang.CharSequence r5) {
            r1 = this;
            r0 = 0
            r1.f471 = r0
            r1.<init>()
            r1.f475 = r2
            r1.f474 = r3
            r1.f472 = r4
            r1.f473 = r5
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f471
            r1 = 20
            r2 = 6
            r3 = 8
            switch(r0) {
                case 0: goto Lb;
                default: goto La;
            }
        La:
            goto L83
        Lb:
            ۟.p8 r0 = r9.f475
            int r4 = r9.f474
            ۟.gb r5 = r9.f472
            java.lang.CharSequence r6 = r9.f473
            byte[] r3 = new byte[r3]
            r3 = {x00d6: FILL_ARRAY_DATA , data: [105, 70, 49, 60, -28, -30, 56, 72} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x00de: FILL_ARRAY_DATA , data: [77, 37, 68, 78, -106, -84} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r7)
            p000.h4.m189(r3, r0)
            byte[] r1 = new byte[r1]
            r1 = {x00e6: FILL_ARRAY_DATA , data: [25, -45, 62, 46, -82, 34, 78, -49, 57, 48, -97, 8, 73, -45, 57, 41, -119, 20, 80, -62} // fill-array
            byte[] r3 = new byte[r2]
            r3 = {x00f4: FILL_ARRAY_DATA , data: [61, -89, 86, 71, -35, 125} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r5)
        L35:
            int r1 = r0.f896
            r3 = 57
            if (r1 >= r4) goto L64
            android.content.Context r1 = r5.f1218
            byte[] r3 = new byte[r3]
            r3 = {x00fc: FILL_ARRAY_DATA , data: [105, 108, 107, 26, -68, 33, 102, 119, 105, 25, -24, 98, 101, 124, 39, 21, -3, 49, 115, 57, 115, 25, -68, 44, 104, 119, 42, 24, -23, 46, 107, 57, 115, 15, -20, 39, 39, 120, 105, 18, -18, 45, 110, 125, 41, 23, -20, 50, 41, 88, 100, 2, -11, 52, 110, 109, 126} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x011e: FILL_ARRAY_DATA , data: [7, 25, 7, 118, -100, 66} // fill-array
            java.lang.String r3 = p000.oa.m332(r3, r7)
            p000.h4.m187(r3, r1)
            android.app.Activity r1 = (android.app.Activity) r1
            ۟.hb r3 = new ۟.hb
            r3.<init>(r5, r6, r4, r0)
            r1.runOnUiThread(r3)
            int r1 = r0.f896
            int r1 = r1 + 1
            r0.f896 = r1
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Thread.sleep(r7)
            goto L35
        L64:
            android.content.Context r0 = r5.f1218
            byte[] r1 = new byte[r3]
            r1 = {x0126: FILL_ARRAY_DATA , data: [26, 123, -97, 118, 77, -81, 21, 96, -99, 117, 25, -20, 22, 107, -45, 121, 12, -65, 0, 46, -121, 117, 77, -94, 27, 96, -34, 116, 24, -96, 24, 46, -121, 99, 29, -87, 84, 111, -99, 126, 31, -93, 29, 106, -35, 123, 29, -68, 90, 79, -112, 110, 4, -70, 29, 122, -118} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x0148: FILL_ARRAY_DATA , data: [116, 14, -13, 26, 109, -52} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m187(r1, r0)
            android.app.Activity r0 = (android.app.Activity) r0
            ۟.ib r1 = new ۟.ib
            r2 = 0
            r1.<init>(r5, r6, r2)
            r0.runOnUiThread(r1)
            return
        L83:
            ۟.gb r0 = r9.f472
            java.lang.CharSequence r4 = r9.f473
            int r5 = r9.f474
            ۟.p8 r6 = r9.f475
            byte[] r1 = new byte[r1]
            r1 = {x0150: FILL_ARRAY_DATA , data: [-97, -89, 28, -55, -100, 87, -56, -69, 27, -41, -83, 125, -49, -89, 27, -50, -69, 97, -42, -74} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x015e: FILL_ARRAY_DATA , data: [-69, -45, 116, -96, -17, 8} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r7)
            p000.h4.m189(r1, r0)
            byte[] r1 = new byte[r3]
            r1 = {x0166: FILL_ARRAY_DATA , data: [-45, 60, -38, 71, -35, 51, -126, 50} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x016e: FILL_ARRAY_DATA , data: [-9, 95, -81, 53, -81, 125} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m189(r1, r6)
            android.widget.Button r0 = r0.f417
            int r1 = r6.f896
            int r5 = r5 - r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r2 = "("
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = ")"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            return
    }
}
