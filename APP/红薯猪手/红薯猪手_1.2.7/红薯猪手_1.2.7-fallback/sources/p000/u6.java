package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u6 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean f1079;

    static {
            return
    }

    public u6() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m433(java.lang.String r11, p000.g3 r12, int r13) {
            r0 = r13 & 2
            r1 = 0
            if (r0 == 0) goto L8
            ۟.e2 r0 = p000.e2.f297
            goto L9
        L8:
            r0 = r1
        L9:
            r2 = 4
            r13 = r13 & r2
            if (r13 == 0) goto Le
            r12 = r1
        Le:
            r13 = 3
            byte[] r1 = new byte[r13]
            r1 = {x0110: FILL_ARRAY_DATA , data: [127, -23, -44} // fill-array
            r3 = 6
            byte[] r4 = new byte[r3]
            r4 = {x0116: FILL_ARRAY_DATA , data: [10, -101, -72, -122, 34, -8} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r4)
            p000.h4.m189(r1, r11)
            byte[] r1 = new byte[r3]
            r1 = {x011e: FILL_ARRAY_DATA , data: [-124, 66, 83, -101, -31, -7} // fill-array
            byte[] r4 = new byte[r3]
            r4 = {x0126: FILL_ARRAY_DATA , data: [-20, 39, 50, -1, -124, -117} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r4)
            p000.h4.m189(r1, r0)
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> L10c
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L10c
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> L10c
            r1 = 8000(0x1f40, float:1.121E-41)
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L10c
            r1 = 7
            byte[] r4 = new byte[r1]     // Catch: java.lang.Throwable -> L10c
            r5 = -69
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L10c
            r5 = 21
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Throwable -> L10c
            r5 = -84
            r8 = 2
            r4[r8] = r5     // Catch: java.lang.Throwable -> L10c
            r5 = -30
            r4[r13] = r5     // Catch: java.lang.Throwable -> L10c
            r5 = -123(0xffffffffffffff85, float:NaN)
            r4[r2] = r5     // Catch: java.lang.Throwable -> L10c
            r5 = 98
            r9 = 5
            r4[r9] = r5     // Catch: java.lang.Throwable -> L10c
            r5 = -101(0xffffffffffffff9b, float:NaN)
            r4[r3] = r5     // Catch: java.lang.Throwable -> L10c
            byte[] r5 = new byte[r3]     // Catch: java.lang.Throwable -> L10c
            r10 = -23
            r5[r6] = r10     // Catch: java.lang.Throwable -> L10c
            r10 = 112(0x70, float:1.57E-43)
            r5[r7] = r10     // Catch: java.lang.Throwable -> L10c
            r10 = -54
            r5[r8] = r10     // Catch: java.lang.Throwable -> L10c
            r10 = -121(0xffffffffffffff87, float:NaN)
            r5[r13] = r10     // Catch: java.lang.Throwable -> L10c
            r10 = -9
            r5[r2] = r10     // Catch: java.lang.Throwable -> L10c
            r5[r9] = r1     // Catch: java.lang.Throwable -> L10c
            java.lang.String r4 = p000.oa.m332(r4, r5)     // Catch: java.lang.Throwable -> L10c
            r0.setRequestProperty(r4, r11)     // Catch: java.lang.Throwable -> L10c
            r0.connect()     // Catch: java.lang.Throwable -> L10c
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L10c
            java.io.InputStream r0 = r0.getInputStream()     // Catch: java.lang.Throwable -> L10c
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L10c
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L10c
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L10c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10c
            r4.<init>()     // Catch: java.lang.Throwable -> L10c
        L98:
            java.lang.String r5 = r0.readLine()     // Catch: java.lang.Throwable -> L10c
            if (r5 == 0) goto La2
            r4.append(r5)     // Catch: java.lang.Throwable -> L10c
            goto L98
        La2:
            if (r12 == 0) goto La7
            r12.mo12(r11)     // Catch: java.lang.Throwable -> L10c
        La7:
            java.lang.String r11 = r4.toString()     // Catch: java.lang.Throwable -> L10c
            r12 = 13
            byte[] r12 = new byte[r12]     // Catch: java.lang.Throwable -> L10c
            r0 = -39
            r12[r6] = r0     // Catch: java.lang.Throwable -> L10c
            r0 = -53
            r12[r7] = r0     // Catch: java.lang.Throwable -> L10c
            r0 = -43
            r12[r8] = r0     // Catch: java.lang.Throwable -> L10c
            r0 = -3
            r12[r13] = r0     // Catch: java.lang.Throwable -> L10c
            r0 = -41
            r12[r2] = r0     // Catch: java.lang.Throwable -> L10c
            r0 = 31
            r12[r9] = r0     // Catch: java.lang.Throwable -> L10c
            r0 = -61
            r12[r3] = r0     // Catch: java.lang.Throwable -> L10c
            r12[r1] = r0     // Catch: java.lang.Throwable -> L10c
            r0 = 8
            r1 = -82
            r12[r0] = r1     // Catch: java.lang.Throwable -> L10c
            r0 = 9
            r1 = -89
            r12[r0] = r1     // Catch: java.lang.Throwable -> L10c
            r0 = 10
            r1 = -117(0xffffffffffffff8b, float:NaN)
            r12[r0] = r1     // Catch: java.lang.Throwable -> L10c
            r0 = 11
            r1 = 88
            r12[r0] = r1     // Catch: java.lang.Throwable -> L10c
            r0 = 12
            r1 = -124(0xffffffffffffff84, float:NaN)
            r12[r0] = r1     // Catch: java.lang.Throwable -> L10c
            byte[] r0 = new byte[r3]     // Catch: java.lang.Throwable -> L10c
            r1 = -83
            r0[r6] = r1     // Catch: java.lang.Throwable -> L10c
            r1 = -92
            r0[r7] = r1     // Catch: java.lang.Throwable -> L10c
            r1 = -122(0xffffffffffffff86, float:NaN)
            r0[r8] = r1     // Catch: java.lang.Throwable -> L10c
            r1 = -119(0xffffffffffffff89, float:NaN)
            r0[r13] = r1     // Catch: java.lang.Throwable -> L10c
            r13 = -91
            r0[r2] = r13     // Catch: java.lang.Throwable -> L10c
            r13 = 118(0x76, float:1.65E-43)
            r0[r9] = r13     // Catch: java.lang.Throwable -> L10c
            java.lang.String r12 = p000.oa.m332(r12, r0)     // Catch: java.lang.Throwable -> L10c
            p000.h4.m188(r12, r11)     // Catch: java.lang.Throwable -> L10c
            goto L10e
        L10c:
            java.lang.String r11 = ""
        L10e:
            return r11
    }
}
