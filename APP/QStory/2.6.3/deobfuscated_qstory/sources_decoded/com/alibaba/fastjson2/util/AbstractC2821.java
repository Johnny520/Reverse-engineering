package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONWriter$Feature;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2821 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int f8783 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f8785 = JSONWriter$Feature.EscapeNoneAscii.mask;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f8784 = JSONWriter$Feature.BrowserSecure.mask;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m5659(int i, byte[] bArr, int i2) {
        AbstractC2849.m5765(i, bArr, AbstractC2826.f8799);
        int i3 = ((i2 & 15) << 8) | ((i2 & 240) >> 4);
        int i4 = (101058054 + i3) & 269488144;
        AbstractC2849.m5761(bArr, i + 4, (short) ((((i4 << 1) + (i4 >> 1)) - (i4 >> 4)) + 808464432 + i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m5660(int i, int i2, char[] cArr) {
        AbstractC2849.m5746(cArr, i, AbstractC2822.f8787);
        int i3 = ((i2 & 15) << 16) | ((i2 & 240) >> 4);
        int i4 = (393222 + i3) & 1048592;
        AbstractC2849.m5766(i + 4, (((i4 << 1) + (i4 >> 1)) - (i4 >> 4)) + 3145776 + i3, cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m5661(char[] r7, int r8, byte[] r9, int r10, char r11, long r12) {
        /*
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter$Feature.EscapeNoneAscii
            long r0 = r0.mask
            long r0 = r0 & r12
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            com.alibaba.fastjson2.JSONWriter$Feature r5 = com.alibaba.fastjson2.JSONWriter$Feature.BrowserSecure
            long r5 = r5.mask
            long r12 = r12 & r5
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L1a
            r1 = r4
        L1a:
            int r12 = r9.length
            if (r10 >= r12) goto L6e
            r12 = r9[r10]
            r12 = r12 & 255(0xff, float:3.57E-43)
            char r12 = (char) r12
            r13 = 34
            r2 = 92
            if (r12 == r13) goto L5f
            r13 = 60
            if (r12 == r13) goto L54
            r13 = 62
            if (r12 == r13) goto L54
            if (r12 == r2) goto L4e
            switch(r12) {
                case 0: goto L4a;
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L4a;
                case 4: goto L4a;
                case 5: goto L4a;
                case 6: goto L4a;
                case 7: goto L4a;
                case 8: goto L4e;
                case 9: goto L4e;
                case 10: goto L4e;
                case 11: goto L4a;
                case 12: goto L4e;
                case 13: goto L4e;
                case 14: goto L4a;
                case 15: goto L4a;
                case 16: goto L4a;
                case 17: goto L4a;
                case 18: goto L4a;
                case 19: goto L4a;
                case 20: goto L4a;
                case 21: goto L4a;
                case 22: goto L4a;
                case 23: goto L4a;
                case 24: goto L4a;
                case 25: goto L4a;
                case 26: goto L4a;
                case 27: goto L4a;
                case 28: goto L4a;
                case 29: goto L4a;
                case 30: goto L4a;
                case 31: goto L4a;
                default: goto L35;
            }
        L35:
            switch(r12) {
                case 39: goto L5f;
                case 40: goto L54;
                case 41: goto L54;
                default: goto L38;
            }
        L38:
            if (r0 == 0) goto L44
            r13 = 127(0x7f, float:1.78E-43)
            if (r12 <= r13) goto L44
            m5666(r8, r12, r7)
        L41:
            int r8 = r8 + 6
            goto L6b
        L44:
            int r13 = r8 + 1
            r7[r8] = r12
        L48:
            r8 = r13
            goto L6b
        L4a:
            m5660(r8, r12, r7)
            goto L41
        L4e:
            m5663(r8, r12, r7)
            int r8 = r8 + 2
            goto L6b
        L54:
            if (r1 == 0) goto L5a
            m5666(r8, r12, r7)
            goto L41
        L5a:
            int r13 = r8 + 1
            r7[r8] = r12
            goto L48
        L5f:
            if (r12 != r11) goto L66
            int r13 = r8 + 1
            r7[r8] = r2
            r8 = r13
        L66:
            int r13 = r8 + 1
            r7[r8] = r12
            goto L48
        L6b:
            int r10 = r10 + 1
            goto L1a
        L6e:
            r7[r8] = r11
            int r8 = r8 + r4
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2821.m5661(char[], int, byte[], int, char, long):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m5662(int i, byte[] bArr, int i2) {
        AbstractC2849.m5761(bArr, i, AbstractC2826.f8798[i2 & 127]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5663(int i, int i2, char[] cArr) {
        AbstractC2849.m5764(i, AbstractC2822.f8786[i2 & 127], cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m5664(long j, long j2) {
        return ((6944656592455360608L + j) & (-9187201950435737472L)) == -9187201950435737472L && (((j2 ^ j) + 72340172838076673L) & (-9187201950435737472L)) == -9187201950435737472L && (((j ^ (-6655295901103053917L)) + 72340172838076673L) & (-9187201950435737472L)) == -9187201950435737472L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m5665(int i, byte[] bArr, int i2) {
        AbstractC2849.m5757(bArr, i, AbstractC2826.f8800);
        int i3 = ((i2 & 15) << 24) | ((61440 & i2) >> 12) | (i2 & 3840) | ((i2 & 240) << 12);
        AbstractC2849.m5767(i + 2, bArr, ((((101058054 + i3) & 269488144) * 7) >> 4) + 808464432 + i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m5666(int i, int i2, char[] cArr) {
        AbstractC2849.m5764(i, AbstractC2822.f8788, cArr);
        long j = i2;
        long j2 = ((j & 15) << 48) | ((61440 & j) >> 12) | ((3840 & j) << 8) | ((240 & j) << 28);
        long j3 = (1688875630460934L + j2) & 4503668347895824L;
        AbstractC2849.m5747(cArr, i + 2, ((j3 >> 1) - (j3 >> 4)) + 13511005043687472L + j2);
    }
}
