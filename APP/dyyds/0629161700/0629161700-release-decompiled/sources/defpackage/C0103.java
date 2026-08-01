package defpackage;

/* JADX INFO: renamed from: ᛱᛵᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0103 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f912;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f913;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f914;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public boolean f915;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final int[] f916;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f917;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public int f918;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f919;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int f920;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f921;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f922;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int f923;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final byte[] f924;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int[] f925;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int[] f926;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public int f927;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int[] f928;

    public C0103(int r5, byte[] r6) {
            r4 = this;
            r0 = 1
            r4.f921 = r0
            r0 = -1151463836786222(0xfffbe8bfef0961d2, double:NaN)
            r4.<init>()
            int r0 = r6.length
            int[] r1 = new int[r0]
            r2 = 0
        L12:
            if (r2 >= r0) goto L1d
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L12
        L1d:
            r4.f925 = r1
            r6 = 2
            int r5 = java.lang.Math.max(r6, r5)
            r4.f920 = r5
            r5 = 5003(0x138b, float:7.01E-42)
            int[] r6 = new int[r5]
            r4.f926 = r6
            int[] r5 = new int[r5]
            r4.f928 = r5
            r5 = 17
            int[] r5 = new int[r5]
            r5 = {x0040: FILL_ARRAY_DATA , data: [0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535} // fill-array
            r4.f916 = r5
            r5 = 256(0x100, float:3.59E-43)
            byte[] r5 = new byte[r5]
            r4.f924 = r5
            return
    }

    public C0103(byte[] r5) {
            r4 = this;
            r0 = 0
            r4.f921 = r0
            r1 = -1147104444980782(0xfffbecb6ef0961d2, double:NaN)
            r4.<init>()
            int r1 = r5.length
            int[] r2 = new int[r1]
        L11:
            if (r0 >= r1) goto L1c
            r3 = r5[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2[r0] = r3
            int r0 = r0 + 1
            goto L11
        L1c:
            r4.f925 = r2
            r5 = 2
            r0 = 8
            int r5 = java.lang.Math.max(r5, r0)
            r4.f920 = r5
            r5 = 5003(0x138b, float:7.01E-42)
            int[] r0 = new int[r5]
            r4.f926 = r0
            int[] r5 = new int[r5]
            r4.f928 = r5
            r5 = 17
            int[] r5 = new int[r5]
            r5 = {x0042: FILL_ARRAY_DATA , data: [0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535} // fill-array
            r4.f916 = r5
            r5 = 256(0x100, float:3.59E-43)
            byte[] r5 = new byte[r5]
            r4.f924 = r5
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m595(int r11, java.io.BufferedOutputStream r12) {
            r10 = this;
            int r0 = r10.f921
            r1 = 4096(0x1000, float:5.74E-42)
            r2 = 12
            int[] r3 = r10.f916
            r4 = 8
            r5 = 1
            r6 = 0
            byte[] r7 = r10.f924
            r8 = 254(0xfe, float:3.56E-43)
            switch(r0) {
                case 0: goto Lb9;
                default: goto L13;
            }
        L13:
            int r0 = r10.f918
            int r9 = r10.f923
            r3 = r3[r9]
            r0 = r0 & r3
            r10.f918 = r0
            if (r9 <= 0) goto L22
            int r3 = r11 << r9
            r0 = r0 | r3
            goto L23
        L22:
            r0 = r11
        L23:
            r10.f918 = r0
            int r0 = r10.f919
            int r9 = r9 + r0
            r10.f923 = r9
        L2a:
            int r0 = r10.f923
            if (r0 < r4) goto L54
            int r0 = r10.f918
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r3 = r10.f927
            int r9 = r3 + 1
            r10.f927 = r9
            r7[r3] = r0
            if (r9 < r8) goto L49
            if (r9 <= 0) goto L49
            r12.write(r9)
            int r0 = r10.f927
            r12.write(r7, r6, r0)
            r10.f927 = r6
        L49:
            int r0 = r10.f918
            int r0 = r0 >> r4
            r10.f918 = r0
            int r0 = r10.f923
            int r0 = r0 - r4
            r10.f923 = r0
            goto L2a
        L54:
            int r0 = r10.f912
            int r3 = r10.f917
            if (r0 > r3) goto L5e
            boolean r0 = r10.f915
            if (r0 == 0) goto L7c
        L5e:
            boolean r0 = r10.f915
            if (r0 == 0) goto L6e
            int r0 = r10.f922
            r10.f919 = r0
            int r0 = r5 << r0
            int r0 = r0 - r5
            r10.f917 = r0
            r10.f915 = r6
            goto L7c
        L6e:
            int r0 = r10.f919
            int r0 = r0 + r5
            r10.f919 = r0
            if (r0 != r2) goto L76
            goto L7a
        L76:
            int r0 = r5 << r0
            int r1 = r0 + (-1)
        L7a:
            r10.f917 = r1
        L7c:
            int r0 = r10.f914
            if (r11 != r0) goto Lb8
        L80:
            int r11 = r10.f923
            if (r11 <= 0) goto Laa
            int r11 = r10.f918
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            int r0 = r10.f927
            int r1 = r0 + 1
            r10.f927 = r1
            r7[r0] = r11
            if (r1 < r8) goto L9f
            if (r1 <= 0) goto L9f
            r12.write(r1)
            int r11 = r10.f927
            r12.write(r7, r6, r11)
            r10.f927 = r6
        L9f:
            int r11 = r10.f918
            int r11 = r11 >> r4
            r10.f918 = r11
            int r11 = r10.f923
            int r11 = r11 - r4
            r10.f923 = r11
            goto L80
        Laa:
            int r11 = r10.f927
            if (r11 <= 0) goto Lb8
            r12.write(r11)
            int r11 = r10.f927
            r12.write(r7, r6, r11)
            r10.f927 = r6
        Lb8:
            return
        Lb9:
            int r0 = r10.f918
            int r9 = r10.f923
            r3 = r3[r9]
            r0 = r0 & r3
            r10.f918 = r0
            if (r9 <= 0) goto Lc8
            int r3 = r11 << r9
            r0 = r0 | r3
            goto Lc9
        Lc8:
            r0 = r11
        Lc9:
            r10.f918 = r0
            int r0 = r10.f919
            int r9 = r9 + r0
            r10.f923 = r9
        Ld0:
            int r0 = r10.f923
            if (r0 < r4) goto Lfa
            int r0 = r10.f918
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r3 = r10.f927
            int r9 = r3 + 1
            r10.f927 = r9
            r7[r3] = r0
            if (r9 < r8) goto Lef
            if (r9 <= 0) goto Lef
            r12.write(r9)
            int r0 = r10.f927
            r12.write(r7, r6, r0)
            r10.f927 = r6
        Lef:
            int r0 = r10.f918
            int r0 = r0 >> r4
            r10.f918 = r0
            int r0 = r10.f923
            int r0 = r0 - r4
            r10.f923 = r0
            goto Ld0
        Lfa:
            int r0 = r10.f912
            int r3 = r10.f917
            if (r0 > r3) goto L104
            boolean r0 = r10.f915
            if (r0 == 0) goto L122
        L104:
            boolean r0 = r10.f915
            if (r0 == 0) goto L114
            int r0 = r10.f922
            r10.f919 = r0
            int r0 = r5 << r0
            int r0 = r0 - r5
            r10.f917 = r0
            r10.f915 = r6
            goto L122
        L114:
            int r0 = r10.f919
            int r0 = r0 + r5
            r10.f919 = r0
            if (r0 != r2) goto L11c
            goto L120
        L11c:
            int r0 = r5 << r0
            int r1 = r0 + (-1)
        L120:
            r10.f917 = r1
        L122:
            int r0 = r10.f914
            if (r11 != r0) goto L15e
        L126:
            int r11 = r10.f923
            if (r11 <= 0) goto L150
            int r11 = r10.f918
            r11 = r11 & 255(0xff, float:3.57E-43)
            byte r11 = (byte) r11
            int r0 = r10.f927
            int r1 = r0 + 1
            r10.f927 = r1
            r7[r0] = r11
            if (r1 < r8) goto L145
            if (r1 <= 0) goto L145
            r12.write(r1)
            int r11 = r10.f927
            r12.write(r7, r6, r11)
            r10.f927 = r6
        L145:
            int r11 = r10.f918
            int r11 = r11 >> r4
            r10.f918 = r11
            int r11 = r10.f923
            int r11 = r11 - r4
            r10.f923 = r11
            goto L126
        L150:
            int r11 = r10.f927
            if (r11 <= 0) goto L15e
            r12.write(r11)
            int r11 = r10.f927
            r12.write(r7, r6, r11)
            r10.f927 = r6
        L15e:
            return
    }
}
