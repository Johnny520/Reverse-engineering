package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONWriter$Feature;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3654 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final /* synthetic */ int f9128 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f9130 = JSONWriter$Feature.EscapeNoneAscii.mask;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final long f9129 = JSONWriter$Feature.BrowserSecure.mask;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m6219(int i, byte[] bArr, int i2) {
        AbstractC3682.m6325(i, bArr, AbstractC3659.f9144);
        int i3 = ((i2 & 15) << 8) | ((i2 & 240) >> 4);
        int i4 = (101058054 + i3) & 269488144;
        AbstractC3682.m6321(bArr, i + 4, (short) ((((i4 << 1) + (i4 >> 1)) - (i4 >> 4)) + 808464432 + i3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m6220(int i, int i2, char[] cArr) {
        AbstractC3682.m6306(cArr, i, AbstractC3655.f9132);
        int i3 = ((i2 & 15) << 16) | ((i2 & 240) >> 4);
        int i4 = (393222 + i3) & 1048592;
        AbstractC3682.m6326(i + 4, (((i4 << 1) + (i4 >> 1)) - (i4 >> 4)) + 3145776 + i3, cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m6221(char[] cArr, int i, byte[] bArr, int i2, char c, long j) {
        int i3;
        boolean z = (JSONWriter$Feature.EscapeNoneAscii.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.BrowserSecure.mask) != 0;
        while (i2 < bArr.length) {
            char c2 = (char) (bArr[i2] & DefaultClassResolver.NAME);
            if (c2 == '\"') {
                if (c2 == c) {
                    cArr[i] = '\\';
                    i++;
                }
                i3 = i + 1;
                cArr[i] = c2;
                i = i3;
            } else if (c2 != '<' && c2 != '>') {
                if (c2 != '\\') {
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 11:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                            m6220(i, c2, cArr);
                            i += 6;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                            break;
                        default:
                            switch (c2) {
                                case '\'':
                                    break;
                                case '(':
                                case ')':
                                    break;
                                default:
                                    if (z && c2 > 127) {
                                        m6226(i, c2, cArr);
                                        i += 6;
                                    } else {
                                        i3 = i + 1;
                                        cArr[i] = c2;
                                    }
                                    break;
                            }
                            i = i3;
                            break;
                    }
                }
                m6223(i, c2, cArr);
                i += 2;
            } else if (z2) {
                m6226(i, c2, cArr);
                i += 6;
            } else {
                i3 = i + 1;
                cArr[i] = c2;
                i = i3;
            }
            i2++;
        }
        cArr[i] = c;
        return i + 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m6222(int i, byte[] bArr, int i2) {
        AbstractC3682.m6321(bArr, i, AbstractC3659.f9143[i2 & 127]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m6223(int i, int i2, char[] cArr) {
        AbstractC3682.m6324(i, AbstractC3655.f9131[i2 & 127], cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m6224(long j, long j2) {
        return ((6944656592455360608L + j) & (-9187201950435737472L)) == -9187201950435737472L && (((j2 ^ j) + 72340172838076673L) & (-9187201950435737472L)) == -9187201950435737472L && (((j ^ (-6655295901103053917L)) + 72340172838076673L) & (-9187201950435737472L)) == -9187201950435737472L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static void m6225(int i, byte[] bArr, int i2) {
        AbstractC3682.m6317(bArr, i, AbstractC3659.f9145);
        int i3 = ((i2 & 15) << 24) | ((61440 & i2) >> 12) | (i2 & 3840) | ((i2 & 240) << 12);
        AbstractC3682.m6327(i + 2, bArr, ((((101058054 + i3) & 269488144) * 7) >> 4) + 808464432 + i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static void m6226(int i, int i2, char[] cArr) {
        AbstractC3682.m6324(i, AbstractC3655.f9133, cArr);
        long j = i2;
        long j2 = ((j & 15) << 48) | ((61440 & j) >> 12) | ((3840 & j) << 8) | ((240 & j) << 28);
        long j3 = (1688875630460934L + j2) & 4503668347895824L;
        AbstractC3682.m6307(cArr, i + 2, ((j3 >> 1) - (j3 >> 4)) + 13511005043687472L + j2);
    }
}
