package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x2 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m459() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r1 = 7
            byte[] r1 = new byte[r1]
            r1 = {x002a: FILL_ARRAY_DATA , data: [101, 55, 66, 116, 23, 58, 108} // fill-array
            r2 = 6
            byte[] r2 = new byte[r2]
            r2 = {x0032: FILL_ARRAY_DATA , data: [8, 88, 55, 26, 99, 95} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.toString()
            return r0
        L27:
            java.lang.String r0 = ""
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m460(java.lang.String r11) {
            java.lang.String r0 = m459()
            boolean r1 = r11.contains(r0)
            r2 = 1
            java.lang.String r3 = ""
            r4 = 89
            r5 = 6
            r6 = 0
            if (r1 != 0) goto L43
            java.lang.StringBuilder r0 = p000.c4.m108(r0)
            byte[] r1 = new byte[r2]
            r7 = -124(0xffffffffffffff84, float:NaN)
            r1[r6] = r7
            byte[] r7 = new byte[r5]
            r7 = {x00e4: FILL_ARRAY_DATA , data: [-85, 96, -54, -110, 91, 4} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r7)
            int r1 = r11.indexOf(r1)
            if (r1 != 0) goto L2c
            r1 = r3
            goto L39
        L2c:
            byte[] r1 = new byte[r2]
            r1[r6] = r4
            byte[] r7 = new byte[r5]
            r7 = {x00ec: FILL_ARRAY_DATA , data: [118, 50, -20, -114, -66, 55} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r7)
        L39:
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
        L43:
            java.io.File r0 = new java.io.File
            r0.<init>(r11)
            byte[] r1 = new byte[r2]
            r7 = 87
            r1[r6] = r7
            byte[] r7 = new byte[r5]
            r7 = {x00f4: FILL_ARRAY_DATA , data: [121, -95, 0, -124, 108, -78} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r7)
            int r1 = r11.lastIndexOf(r1)
            byte[] r7 = new byte[r2]
            r8 = -11
            r7[r6] = r8
            byte[] r8 = new byte[r5]
            r8 = {x00fc: FILL_ARRAY_DATA , data: [-38, 112, -88, 57, 113, -31} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r8)
            int r11 = r11.lastIndexOf(r7)
            if (r1 <= r11) goto L7a
            java.io.File r11 = new java.io.File
            java.lang.String r0 = r0.getParent()
            r11.<init>(r0)
            r0 = r11
        L7a:
            boolean r11 = r0.exists()
            if (r11 != 0) goto Le2
            java.lang.String r11 = r0.getAbsolutePath()
            java.lang.String r0 = m459()
            java.lang.String r11 = r11.replace(r0, r3)
            byte[] r1 = new byte[r2]
            r1[r6] = r4
            byte[] r4 = new byte[r5]
            r4 = {x0104: FILL_ARRAY_DATA , data: [118, -58, 71, 50, -99, 65} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r4)
            java.lang.String[] r11 = r11.split(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r4 = r11.length
            r7 = r6
        La4:
            if (r7 >= r4) goto Le2
            r8 = r11[r7]
            boolean r9 = r3.equals(r8)
            if (r9 != 0) goto Ldf
            boolean r9 = r8.equals(r0)
            if (r9 != 0) goto Ldf
            byte[] r9 = new byte[r2]
            r10 = -9
            r9[r6] = r10
            byte[] r10 = new byte[r5]
            r10 = {x010c: FILL_ARRAY_DATA , data: [-40, -108, 37, -99, -64, 34} // fill-array
            java.lang.String r9 = p000.oa.m332(r9, r10)
            r1.append(r9)
            r1.append(r8)
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r1.toString()
            r8.<init>(r9)
            boolean r9 = r8.exists()
            if (r9 != 0) goto Ldf
            boolean r8 = r8.mkdirs()
            if (r8 != 0) goto Ldf
            goto Le2
        Ldf:
            int r7 = r7 + 1
            goto La4
        Le2:
            return
    }
}
