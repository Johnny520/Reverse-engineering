package com.alibaba.fastjson2.util;

import androidx.activity.AbstractC0053;
import androidx.profileinstaller.AbstractC2442;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.AbstractC2932;
import com.alibaba.fastjson2.C2900;
import com.alibaba.fastjson2.C2901;
import com.alibaba.fastjson2.C2902;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.reader.C2740;
import com.android.dx.io.Opcodes;
import com.google.protobuf.DescriptorProtos$Edition;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.zone.ZoneRules;
import java.util.Date;
import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2865 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static DateTimeFormatter f9020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final LocalDate f9021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ZoneId f9022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ZoneRules f9023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ZoneId f9024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ZoneId f9025;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static DateTimeFormatter f9026;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static DateTimeFormatter f9027;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int[] f9028;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static DateTimeFormatter f9029;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int f9030;

    static {
        int iM5812;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        f9025 = zoneIdSystemDefault;
        ZoneRules rules = null;
        try {
            if (!"Asia/Shanghai".equals(zoneIdSystemDefault.getId())) {
                zoneIdSystemDefault = ZoneId.of("Asia/Shanghai");
            }
            try {
                rules = zoneIdSystemDefault.getRules();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            zoneIdSystemDefault = null;
        }
        f9024 = zoneIdSystemDefault;
        f9023 = rules;
        f9022 = ZoneId.of("+08:00");
        f9021 = LocalDate.of(1970, 1, 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ZoneId zoneId = f9025;
        long jFloorDiv = Math.floorDiv(jCurrentTimeMillis, 1000L);
        if (zoneId == zoneIdSystemDefault || zoneId.getRules() == rules) {
            iM5812 = m5812(jFloorDiv);
        } else {
            iM5812 = zoneId.getRules().getOffset(Instant.ofEpochMilli(jCurrentTimeMillis)).getTotalSeconds();
        }
        f9030 = (int) Math.floorDiv(jFloorDiv + ((long) iM5812), 86400L);
        f9028 = new int[]{1, 10, 100, DescriptorProtos$Edition.EDITION_2023_VALUE, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 0, 0, 0, 0, 0, 0};
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static LocalTime m5787(byte[] bArr, int i) {
        if (i + 15 <= bArr.length) {
            long jM5830 = m5830(bArr, i);
            if (jM5830 != -1 && bArr[i + 8] == 46) {
                int i2 = ((int) jM5830) & Opcodes.CONST_METHOD_TYPE;
                int i3 = ((int) (jM5830 >> 24)) & Opcodes.CONST_METHOD_TYPE;
                int i4 = ((int) (jM5830 >> 48)) & Opcodes.CONST_METHOD_TYPE;
                int iM5842 = m5842(6, bArr, i + 9);
                if (iM5842 < 0) {
                    return null;
                }
                return LocalTime.of(i2, i3, i4, iM5842);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static LocalTime m5788(byte[] bArr, int i) {
        if (i + 18 <= bArr.length) {
            long jM5830 = m5830(bArr, i);
            if (jM5830 != -1 && bArr[i + 8] == 46) {
                int i2 = ((int) jM5830) & Opcodes.CONST_METHOD_TYPE;
                int i3 = ((int) (jM5830 >> 24)) & Opcodes.CONST_METHOD_TYPE;
                int i4 = ((int) (jM5830 >> 48)) & Opcodes.CONST_METHOD_TYPE;
                int iM5842 = m5842(9, bArr, i + 9);
                if (iM5842 < 0) {
                    return null;
                }
                return LocalTime.of(i2, i3, i4, iM5842);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static LocalTime m5789(byte[] bArr, int i) {
        if (i + 10 > bArr.length || bArr[i + 2] != 58 || bArr[i + 5] != 58 || bArr[i + 8] != 46) {
            return null;
        }
        int iM5675 = AbstractC2848.m5675(bArr, i);
        int iM56752 = AbstractC2848.m5675(bArr, i + 3);
        int iM56753 = AbstractC2848.m5675(bArr, i + 6);
        int iM5677 = AbstractC2848.m5677(bArr, i + 9);
        if (iM5677 > 0) {
            iM5677 *= 100000000;
        }
        if ((iM5675 | iM56752 | iM56753 | iM56752) < 0) {
            return null;
        }
        return LocalTime.of(iM5675, iM56752, iM56753, iM5677);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static LocalDateTime m5790(int i, byte[] bArr, int i2) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        if (bArr == null || i2 == 0 || i2 < 21 || i2 > 29) {
            return null;
        }
        char c17 = (char) bArr[i];
        char c18 = (char) bArr[i + 1];
        char c19 = (char) bArr[i + 2];
        char c20 = (char) bArr[i + 3];
        char c21 = (char) bArr[i + 4];
        char c22 = (char) bArr[i + 5];
        char c23 = (char) bArr[i + 6];
        char c24 = (char) bArr[i + 7];
        char c25 = (char) bArr[i + 8];
        char c26 = (char) bArr[i + 9];
        char c27 = (char) bArr[i + 10];
        char c28 = (char) bArr[i + 11];
        char c29 = (char) bArr[i + 12];
        char c30 = (char) bArr[i + 13];
        char c31 = (char) bArr[i + 14];
        char c32 = (char) bArr[i + 15];
        char c33 = (char) bArr[i + 16];
        char c34 = (char) bArr[i + 17];
        char c35 = (char) bArr[i + 18];
        char c36 = (char) bArr[i + 19];
        char c37 = '0';
        switch (i2) {
            case 21:
                c = (char) bArr[i + 20];
                c2 = c25;
                c3 = c26;
                c4 = c28;
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = c29;
                c10 = c31;
                c11 = c34;
                c12 = c35;
                c13 = c18;
                c14 = '0';
                c15 = '0';
                c16 = '0';
                break;
            case 22:
                char c38 = (char) bArr[i + 20];
                c2 = c25;
                c3 = c26;
                c4 = c28;
                c5 = '0';
                c7 = '0';
                c8 = '0';
                c9 = c29;
                c10 = c31;
                c11 = c34;
                c12 = c35;
                c13 = c18;
                c37 = (char) bArr[i + 21];
                c14 = '0';
                c15 = '0';
                c16 = '0';
                c = c38;
                c6 = '0';
                break;
            case 23:
                char c39 = (char) bArr[i + 20];
                char c40 = (char) bArr[i + 21];
                c2 = c25;
                c3 = c26;
                c4 = c28;
                c5 = '0';
                c8 = '0';
                c9 = c29;
                c10 = c31;
                c11 = c34;
                c12 = c35;
                c13 = c18;
                c14 = (char) bArr[i + 22];
                c15 = '0';
                c16 = '0';
                c = c39;
                c37 = c40;
                c6 = '0';
                c7 = c6;
                break;
            case 24:
                char c41 = (char) bArr[i + 20];
                char c42 = (char) bArr[i + 21];
                c2 = c25;
                c3 = c26;
                c4 = c28;
                c5 = '0';
                c9 = c29;
                c10 = c31;
                c11 = c34;
                c12 = c35;
                c13 = c18;
                c14 = (char) bArr[i + 22];
                c15 = (char) bArr[i + 23];
                c16 = '0';
                c8 = '0';
                c = c41;
                c37 = c42;
                c6 = '0';
                c7 = c6;
                break;
            case 25:
                char c43 = (char) bArr[i + 20];
                char c44 = (char) bArr[i + 21];
                char c45 = (char) bArr[i + 22];
                c2 = c25;
                c3 = c26;
                c4 = c28;
                c5 = '0';
                c9 = c29;
                c10 = c31;
                c11 = c34;
                c12 = c35;
                c14 = c45;
                c15 = (char) bArr[i + 23];
                c8 = '0';
                c13 = c18;
                c37 = c44;
                c16 = (char) bArr[i + 24];
                c7 = '0';
                c = c43;
                c6 = '0';
                break;
            case 26:
                char c46 = (char) bArr[i + 20];
                char c47 = (char) bArr[i + 21];
                char c48 = (char) bArr[i + 22];
                char c49 = (char) bArr[i + 23];
                char c50 = (char) bArr[i + 24];
                c5 = (char) bArr[i + 25];
                c2 = c25;
                c3 = c26;
                c4 = c28;
                c10 = c31;
                c12 = c35;
                c = c46;
                c15 = c49;
                c6 = '0';
                c13 = c18;
                c16 = c50;
                c9 = c29;
                c11 = c34;
                c37 = c47;
                c14 = c48;
                c7 = '0';
                c8 = '0';
                break;
            case 27:
                char c51 = (char) bArr[i + 20];
                char c52 = (char) bArr[i + 21];
                char c53 = (char) bArr[i + 22];
                char c54 = (char) bArr[i + 23];
                char c55 = (char) bArr[i + 24];
                char c56 = (char) bArr[i + 25];
                c6 = (char) bArr[i + 26];
                c = c51;
                c5 = c56;
                c2 = c25;
                c3 = c26;
                c4 = c28;
                c10 = c31;
                c12 = c35;
                c15 = c54;
                c13 = c18;
                c16 = c55;
                c9 = c29;
                c11 = c34;
                c14 = c53;
                c8 = '0';
                c37 = c52;
                c7 = '0';
                break;
            case 28:
                char c57 = (char) bArr[i + 20];
                char c58 = (char) bArr[i + 21];
                char c59 = (char) bArr[i + 22];
                char c60 = (char) bArr[i + 23];
                char c61 = (char) bArr[i + 24];
                char c62 = (char) bArr[i + 25];
                char c63 = (char) bArr[i + 26];
                c5 = c62;
                c2 = c25;
                c3 = c26;
                c4 = c28;
                c10 = c31;
                c12 = c35;
                c15 = c60;
                c13 = c18;
                c16 = c61;
                c9 = c29;
                c11 = c34;
                c14 = c59;
                c8 = '0';
                c37 = c58;
                c7 = (char) bArr[i + 27];
                c = c57;
                c6 = c63;
                break;
            default:
                char c64 = (char) bArr[i + 20];
                char c65 = (char) bArr[i + 21];
                char c66 = (char) bArr[i + 22];
                char c67 = (char) bArr[i + 23];
                char c68 = (char) bArr[i + 24];
                char c69 = (char) bArr[i + 25];
                char c70 = (char) bArr[i + 26];
                char c71 = (char) bArr[i + 27];
                c13 = c18;
                c16 = c68;
                c37 = c65;
                c6 = c70;
                c2 = c25;
                c3 = c26;
                c4 = c28;
                c10 = c31;
                c12 = c35;
                c15 = c67;
                c8 = (char) bArr[i + 28];
                c = c64;
                c5 = c69;
                c9 = c29;
                c11 = c34;
                c14 = c66;
                c7 = c71;
                break;
        }
        if (c21 == '-' && c24 == '-' && ((c27 == ' ' || c27 == 'T') && c30 == ':' && c33 == ':' && c36 == '.')) {
            return m5833(c17, c13, c19, c20, c22, c23, c2, c3, c4, c9, c10, c32, c11, c12, c, c37, c14, c15, c16, c5, c6, c7, c8);
        }
        int i3 = i + i2;
        if (bArr[i3 - 15] != 45 || bArr[i3 - 12] != 45) {
            return null;
        }
        byte b = bArr[i3 - 9];
        if ((b == 32 || b == 84) && bArr[i3 - 6] == 58 && bArr[i3 - 3] == 58) {
            return LocalDateTime.of(AbstractC2866.m5886(i, bArr, i2 - 15), AbstractC2866.m5886(i3 - 14, bArr, 2), AbstractC2866.m5886(i3 - 11, bArr, 2), AbstractC2866.m5886(i3 - 8, bArr, 2), AbstractC2866.m5886(i3 - 5, bArr, 2), AbstractC2866.m5886(i3 - 2, bArr, 2));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static LocalTime m5791(byte[] bArr, int i) {
        if (i + 12 > bArr.length) {
            return null;
        }
        long jM5830 = m5830(bArr, i);
        if (jM5830 == -1 || bArr[i + 8] != 46) {
            return null;
        }
        int i2 = ((int) jM5830) & Opcodes.CONST_METHOD_TYPE;
        int i3 = ((int) (jM5830 >> 24)) & Opcodes.CONST_METHOD_TYPE;
        int i4 = ((int) (jM5830 >> 48)) & Opcodes.CONST_METHOD_TYPE;
        int iM5695 = (AbstractC2848.m5695(bArr, i + 11) << 16) | AbstractC2848.m5652(bArr, i + 9);
        int i5 = 986895 & iM5695;
        int i6 = ((15790320 & (394758 + i5)) | ((iM5695 & 15790320) - 3158064)) != 0 ? -1 : ((((iM5695 & 15) * 10) + ((i5 >> 8) & 15)) * 10) + (i5 >> 16);
        if (i6 > 0) {
            i6 *= 1000000;
        }
        return LocalTime.of(i2, i3, i4, i6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static LocalTime m5792(byte[] bArr, int i) {
        if (i + 11 > bArr.length) {
            return null;
        }
        long jM5830 = m5830(bArr, i);
        if (jM5830 == -1 || bArr[i + 8] != 46) {
            return null;
        }
        int i2 = ((int) jM5830) & Opcodes.CONST_METHOD_TYPE;
        int i3 = ((int) (jM5830 >> 24)) & Opcodes.CONST_METHOD_TYPE;
        int i4 = ((int) (jM5830 >> 48)) & Opcodes.CONST_METHOD_TYPE;
        int iM5675 = AbstractC2848.m5675(bArr, i + 9);
        if (iM5675 > 0) {
            iM5675 *= 10000000;
        }
        return LocalTime.of(i2, i3, i4, iM5675);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static LocalDateTime m5793(byte[] bArr, int i) {
        if (i + 19 <= bArr.length && bArr[i + 2] == 32 && bArr[i + 6] == 32 && bArr[i + 11] == 32) {
            long jM5830 = m5830(bArr, i + 12);
            if (jM5830 != -1) {
                int iM5675 = AbstractC2848.m5675(bArr, i);
                int iM5832 = m5832(bArr[i + 3], bArr[i + 4], bArr[i + 5]);
                int iM5693 = AbstractC2848.m5693(bArr, i + 7);
                int i2 = ((int) jM5830) & Opcodes.CONST_METHOD_TYPE;
                int i3 = ((int) (jM5830 >> 24)) & Opcodes.CONST_METHOD_TYPE;
                int i4 = ((int) (jM5830 >> 48)) & Opcodes.CONST_METHOD_TYPE;
                if ((iM5693 | iM5832 | iM5675 | i2 | i3 | i4) > 0 && i2 <= 24 && i3 <= 59 && i4 <= 60) {
                    return LocalDateTime.of(iM5693, iM5832, iM5675, i2, i3, i4);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static LocalDateTime m5794(int i, int i2, char[] cArr) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        char c9;
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        if (cArr == null || i2 == 0 || i2 < 21 || i2 > 29) {
            return null;
        }
        char c18 = cArr[i];
        char c19 = cArr[i + 1];
        char c20 = cArr[i + 2];
        char c21 = cArr[i + 3];
        char c22 = cArr[i + 4];
        char c23 = cArr[i + 5];
        char c24 = cArr[i + 6];
        char c25 = cArr[i + 7];
        char c26 = cArr[i + 8];
        char c27 = cArr[i + 9];
        char c28 = cArr[i + 10];
        char c29 = cArr[i + 11];
        char c30 = cArr[i + 12];
        char c31 = cArr[i + 13];
        char c32 = cArr[i + 14];
        char c33 = cArr[i + 15];
        char c34 = cArr[i + 16];
        char c35 = cArr[i + 17];
        char c36 = cArr[i + 18];
        char c37 = cArr[i + 19];
        switch (i2) {
            case 21:
                c = c30;
                c2 = c33;
                c3 = c36;
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = c18;
                c11 = '0';
                c12 = cArr[i + 20];
                c13 = '0';
                break;
            case 22:
                c14 = cArr[i + 20];
                c15 = cArr[i + 21];
                c = c30;
                c2 = c33;
                c3 = c36;
                c6 = '0';
                c7 = '0';
                c8 = c7;
                c9 = c8;
                c10 = c18;
                c4 = c15;
                c11 = c9;
                c5 = c11;
                c12 = c14;
                c13 = c5;
                break;
            case 23:
                c14 = cArr[i + 20];
                c15 = cArr[i + 21];
                c6 = cArr[i + 22];
                c = c30;
                c2 = c33;
                c3 = c36;
                c7 = '0';
                c8 = c7;
                c9 = c8;
                c10 = c18;
                c4 = c15;
                c11 = c9;
                c5 = c11;
                c12 = c14;
                c13 = c5;
                break;
            case 24:
                char c38 = cArr[i + 20];
                char c39 = cArr[i + 21];
                c6 = cArr[i + 22];
                c = c30;
                c2 = c33;
                c3 = c36;
                c8 = '0';
                c9 = '0';
                c10 = c18;
                c4 = c39;
                c11 = cArr[i + 23];
                c5 = '0';
                c7 = '0';
                c12 = c38;
                c13 = '0';
                break;
            case 25:
                c16 = cArr[i + 20];
                char c40 = cArr[i + 21];
                c6 = cArr[i + 22];
                char c41 = cArr[i + 23];
                c17 = cArr[i + 24];
                c = c30;
                c2 = c33;
                c3 = c36;
                c9 = '0';
                c10 = c18;
                c4 = c40;
                c11 = c41;
                c5 = '0';
                c7 = '0';
                c12 = c16;
                c13 = c17;
                c8 = c7;
                break;
            case 26:
                char c42 = cArr[i + 20];
                char c43 = cArr[i + 21];
                c6 = cArr[i + 22];
                char c44 = cArr[i + 23];
                char c45 = cArr[i + 24];
                c = c30;
                c2 = c33;
                c3 = c36;
                c9 = '0';
                c4 = c43;
                c5 = cArr[i + 25];
                c10 = c18;
                c12 = c42;
                c11 = c44;
                c13 = c45;
                c7 = '0';
                c8 = c7;
                break;
            case 27:
                c16 = cArr[i + 20];
                char c46 = cArr[i + 21];
                c6 = cArr[i + 22];
                char c47 = cArr[i + 23];
                c17 = cArr[i + 24];
                char c48 = cArr[i + 25];
                c9 = cArr[i + 26];
                c = c30;
                c2 = c33;
                c3 = c36;
                c4 = c46;
                c5 = c48;
                c10 = c18;
                c11 = c47;
                c7 = '0';
                c12 = c16;
                c13 = c17;
                c8 = c7;
                break;
            case 28:
                char c49 = cArr[i + 20];
                char c50 = cArr[i + 21];
                c6 = cArr[i + 22];
                char c51 = cArr[i + 23];
                char c52 = cArr[i + 24];
                char c53 = cArr[i + 25];
                c9 = cArr[i + 26];
                c = c30;
                c2 = c33;
                c3 = c36;
                c4 = c50;
                c5 = c53;
                c10 = c18;
                c11 = c51;
                c7 = cArr[i + 27];
                c8 = '0';
                c12 = c49;
                c13 = c52;
                break;
            default:
                c12 = cArr[i + 20];
                char c54 = cArr[i + 21];
                char c55 = cArr[i + 22];
                char c56 = cArr[i + 23];
                char c57 = cArr[i + 24];
                char c58 = cArr[i + 25];
                char c59 = cArr[i + 26];
                c = c30;
                c2 = c33;
                c3 = c36;
                c4 = c54;
                c13 = c57;
                c7 = cArr[i + 27];
                c9 = c59;
                c10 = c18;
                c11 = c56;
                c6 = c55;
                c5 = c58;
                c8 = cArr[i + 28];
                break;
        }
        if (c22 == '-' && c25 == '-' && ((c28 == ' ' || c28 == 'T') && c31 == ':' && c34 == ':' && c37 == '.')) {
            return m5833(c10, c19, c20, c21, c23, c24, c26, c27, c29, c, c32, c2, c35, c3, c12, c4, c6, c11, c13, c5, c9, c7, c8);
        }
        int i3 = i + i2;
        if (cArr[i3 - 15] != '-' || cArr[i3 - 12] != '-') {
            return null;
        }
        char c60 = cArr[i3 - 9];
        if ((c60 == ' ' || c60 == 'T') && cArr[i3 - 6] == ':' && cArr[i3 - 3] == ':') {
            return LocalDateTime.of(AbstractC2866.m5885(i, i2 - 15, cArr), AbstractC2866.m5885(i3 - 14, 2, cArr), AbstractC2866.m5885(i3 - 11, 2, cArr), AbstractC2866.m5885(i3 - 8, 2, cArr), AbstractC2866.m5885(i3 - 5, 2, cArr), AbstractC2866.m5885(i3 - 2, 2, cArr));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static LocalDateTime m5795(int i, char[] cArr) {
        int iM5676;
        int iM56762;
        int iM5678;
        int iM5824;
        int iM5694;
        int iM56763;
        if (i + 19 > cArr.length) {
            return null;
        }
        char c = cArr[i + 1];
        char c2 = cArr[i + 2];
        int i2 = i + 3;
        char c3 = cArr[i2];
        char c4 = cArr[i + 4];
        int i3 = i + 5;
        char c5 = cArr[i3];
        char c6 = cArr[i + 7];
        char c7 = cArr[i + 10];
        char c8 = cArr[i + 13];
        char c9 = cArr[i + 16];
        if (((c4 == '-' && c6 == '-') || (c4 == '/' && c6 == '/')) && ((c7 == ' ' || c7 == 'T') && c8 == ':' && c9 == ':')) {
            iM5694 = AbstractC2848.m5694(i, cArr);
            iM5824 = AbstractC2848.m5676(i3, cArr);
            iM5678 = AbstractC2848.m5676(i + 8, cArr);
            iM56762 = AbstractC2848.m5676(i + 11, cArr);
            iM5676 = AbstractC2848.m5676(i + 14, cArr);
            iM56763 = AbstractC2848.m5676(i + 17, cArr);
        } else if (c2 == '/' && c5 == '/' && ((c7 == ' ' || c7 == 'T') && c8 == ':' && c9 == ':')) {
            iM5678 = AbstractC2848.m5676(i, cArr);
            iM5824 = AbstractC2848.m5676(i2, cArr);
            iM5694 = AbstractC2848.m5694(i + 6, cArr);
            iM56762 = AbstractC2848.m5676(i + 11, cArr);
            iM5676 = AbstractC2848.m5676(i + 14, cArr);
            iM56763 = AbstractC2848.m5676(i + 17, cArr);
        } else {
            if (c != ' ' || c5 != ' ' || c7 != ' ' || c8 != ':' || c9 != ':') {
                return null;
            }
            iM5678 = AbstractC2848.m5678(i, cArr);
            iM5824 = m5824(c2, c3, c4);
            iM5694 = AbstractC2848.m5694(i + 6, cArr);
            iM56762 = AbstractC2848.m5676(i + 11, cArr);
            iM5676 = AbstractC2848.m5676(i + 14, cArr);
            iM56763 = AbstractC2848.m5676(i + 17, cArr);
        }
        int i4 = iM56763;
        int i5 = iM5694;
        int i6 = iM5824;
        int i7 = iM5678;
        int i8 = iM56762;
        int i9 = iM5676;
        if ((i5 | i6 | i7 | i8 | i9 | i4) <= 0) {
            return null;
        }
        return LocalDateTime.of(i5, i6, i7, i8, i9, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0266 A[PHI: r12
  0x0266: PHI (r12v5 byte) = (r12v4 byte), (r12v4 byte), (r12v4 byte), (r12v8 byte) binds: [B:100:0x023c, B:101:0x023e, B:102:0x0240, B:107:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1 A[PHI: r12
  0x01d1: PHI (r12v2 byte) = (r12v1 byte), (r12v1 byte), (r12v1 byte), (r12v12 byte) binds: [B:73:0x01a9, B:74:0x01ab, B:75:0x01ad, B:80:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fb A[PHI: r12
  0x01fb: PHI (r12v3 byte) = (r12v2 byte), (r12v2 byte), (r12v2 byte), (r12v10 byte) binds: [B:81:0x01d1, B:82:0x01d3, B:83:0x01d5, B:88:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime m5796(byte[] r29, int r30) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5796(byte[], int):java.time.LocalDateTime");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static LocalDateTime m5797(int i, char[] cArr) {
        if (i + 19 <= cArr.length && cArr[i + 2] == ' ' && cArr[i + 6] == ' ' && cArr[i + 11] == ' ' && cArr[i + 14] == ':' && cArr[i + 17] == ':') {
            int iM5676 = AbstractC2848.m5676(i, cArr);
            int iM5824 = m5824(cArr[i + 3], cArr[i + 4], cArr[i + 5]);
            int iM5694 = AbstractC2848.m5694(i + 7, cArr);
            int iM56762 = AbstractC2848.m5676(i + 12, cArr);
            int iM56763 = AbstractC2848.m5676(i + 15, cArr);
            int iM56764 = AbstractC2848.m5676(i + 18, cArr);
            if ((iM5694 | iM5824 | iM5676 | iM56762 | iM56763 | iM56764) > 0 && iM56762 <= 24 && iM56763 <= 59 && iM56764 <= 60) {
                return LocalDateTime.of(iM5694, iM5824, iM5676, iM56762, iM56763, iM56764);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime m5798(byte[] r14, int r15) {
        /*
            int r0 = r15 + 19
            int r1 = r14.length
            r2 = 0
            if (r0 <= r1) goto L7
            return r2
        L7:
            int r0 = r15 + 1
            r0 = r14[r0]
            int r1 = r15 + 2
            r1 = r14[r1]
            int r3 = r15 + 3
            r4 = r14[r3]
            int r5 = r15 + 4
            r5 = r14[r5]
            int r6 = r15 + 5
            r7 = r14[r6]
            int r8 = r15 + 7
            r8 = r14[r8]
            int r9 = r15 + 10
            r9 = r14[r9]
            r10 = 84
            r11 = 45
            r12 = 47
            r13 = 32
            if (r5 != r11) goto L2f
            if (r8 == r11) goto L33
        L2f:
            if (r5 != r12) goto L49
            if (r8 != r12) goto L49
        L33:
            if (r9 == r13) goto L37
            if (r9 != r10) goto L49
        L37:
            int r0 = com.alibaba.fastjson2.util.AbstractC2848.m5693(r14, r15)
            int r1 = com.alibaba.fastjson2.util.AbstractC2848.m5675(r14, r6)
            int r3 = r15 + 8
            int r3 = com.alibaba.fastjson2.util.AbstractC2848.m5675(r14, r3)
        L45:
            r4 = r0
            r5 = r1
            r6 = r3
            goto L78
        L49:
            if (r1 != r12) goto L63
            if (r7 != r12) goto L63
            if (r9 == r13) goto L51
            if (r9 != r10) goto L63
        L51:
            int r0 = com.alibaba.fastjson2.util.AbstractC2848.m5675(r14, r15)
            int r1 = com.alibaba.fastjson2.util.AbstractC2848.m5675(r14, r3)
            int r3 = r15 + 6
            int r3 = com.alibaba.fastjson2.util.AbstractC2848.m5693(r14, r3)
            r6 = r0
            r5 = r1
            r4 = r3
            goto L78
        L63:
            if (r0 != r13) goto L9f
            if (r7 != r13) goto L9f
            if (r9 != r13) goto L9f
            int r3 = com.alibaba.fastjson2.util.AbstractC2848.m5677(r14, r15)
            int r1 = m5832(r1, r4, r5)
            int r0 = r15 + 6
            int r0 = com.alibaba.fastjson2.util.AbstractC2848.m5693(r14, r0)
            goto L45
        L78:
            int r15 = r15 + 11
            long r14 = m5830(r14, r15)
            r0 = r4 | r5
            r0 = r0 | r6
            long r0 = (long) r0
            long r0 = r0 | r14
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 > 0) goto L8a
            return r2
        L8a:
            int r0 = (int) r14
            r7 = r0 & 255(0xff, float:3.57E-43)
            r0 = 24
            long r0 = r14 >> r0
            int r0 = (int) r0
            r8 = r0 & 255(0xff, float:3.57E-43)
            r0 = 48
            long r14 = r14 >> r0
            int r14 = (int) r14
            r9 = r14 & 255(0xff, float:3.57E-43)
            java.time.LocalDateTime r14 = java.time.LocalDateTime.of(r4, r5, r6, r7, r8, r9)
            return r14
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5798(byte[], int):java.time.LocalDateTime");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static LocalDateTime m5799(int i, char[] cArr) {
        if (i + 14 > cArr.length) {
            return null;
        }
        int iM5694 = AbstractC2848.m5694(i, cArr);
        int iM5676 = AbstractC2848.m5676(i + 4, cArr);
        int iM56762 = AbstractC2848.m5676(i + 6, cArr);
        int iM56763 = AbstractC2848.m5676(i + 8, cArr);
        int iM56764 = AbstractC2848.m5676(i + 10, cArr);
        int iM56765 = AbstractC2848.m5676(i + 12, cArr);
        if ((iM5694 | iM5676 | iM56762 | iM56763 | iM56764 | iM56765) < 0) {
            return null;
        }
        return LocalDateTime.of(iM5694, iM5676, iM56762, iM56763, iM56764, iM56765);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static LocalDateTime m5800(byte[] bArr, int i) {
        int i2 = i + 12;
        if (i2 > bArr.length) {
            String str = new String(bArr, i, bArr.length - i);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        int iM5693 = AbstractC2848.m5693(bArr, i);
        int iM5675 = AbstractC2848.m5675(bArr, i + 4);
        int iM56752 = AbstractC2848.m5675(bArr, i + 6);
        int iM56753 = AbstractC2848.m5675(bArr, i + 8);
        int iM56754 = AbstractC2848.m5675(bArr, i + 10);
        if ((iM5693 | iM5675 | iM56752 | iM56753 | iM56754) < 0) {
            String str2 = new String(bArr, i, i2);
            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
        }
        if (iM5693 == 0 && iM5675 == 0 && iM56752 == 0 && iM56753 == 0 && iM56754 == 0) {
            return null;
        }
        return LocalDateTime.of(iM5693, iM5675, iM56752, iM56753, iM56754, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static LocalDateTime m5801(int i, char[] cArr) {
        int i2 = i + 12;
        if (i2 > cArr.length) {
            String str = new String(cArr, i, cArr.length - i);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        int iM5694 = AbstractC2848.m5694(i, cArr);
        int iM5676 = AbstractC2848.m5676(i + 4, cArr);
        int iM56762 = AbstractC2848.m5676(i + 6, cArr);
        int iM56763 = AbstractC2848.m5676(i + 8, cArr);
        int iM56764 = AbstractC2848.m5676(i + 10, cArr);
        if ((iM5694 | iM5676 | iM56762 | iM56763 | iM56764) < 0) {
            String str2 = new String(cArr, i, i2);
            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
        }
        if (iM5694 == 0 && iM5676 == 0 && iM56762 == 0 && iM56763 == 0 && iM56764 == 0) {
            return null;
        }
        return LocalDateTime.of(iM5694, iM5676, iM56762, iM56763, iM56764, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static LocalDateTime m5802(byte[] bArr, int i) {
        if (bArr == null || i == 0) {
            return null;
        }
        switch (i) {
            case 4:
                if (bArr[0] == 110 && bArr[1] == 117 && bArr[2] == 108 && bArr[3] == 108) {
                    return null;
                }
                String str = new String(bArr, 0, i);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            case 5:
            case 6:
            case 7:
            case 13:
            case 15:
            default:
                return m5790(0, bArr, i);
            case 8:
                LocalDate localDateM5822 = m5822(bArr, 0);
                if (localDateM5822 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM5822, LocalTime.MIN);
            case 9:
                LocalDate localDateM5820 = m5820(bArr, 0);
                if (localDateM5820 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM5820, LocalTime.MIN);
            case 10:
                LocalDate localDateM5826 = m5826(bArr, 0);
                if (localDateM5826 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM5826, LocalTime.MIN);
            case 11:
                return LocalDateTime.of(m5817(bArr, 0), LocalTime.MIN);
            case 12:
                return m5800(bArr, 0);
            case 14:
                return m5810(bArr, 0);
            case 16:
                return m5808(bArr, 0);
            case 17:
                return m5806(bArr, 0);
            case 18:
                return m5796(bArr, 0);
            case 19:
                return m5798(bArr, 0);
            case 20:
                return m5793(bArr, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static LocalDateTime m5803(int i, char[] cArr) {
        if (cArr == null || i == 0) {
            return null;
        }
        switch (i) {
            case 4:
                if (cArr[0] == 'n' && cArr[1] == 'u' && cArr[2] == 'l' && cArr[3] == 'l') {
                    return null;
                }
                String str = new String(cArr, 0, i);
                throw new DateTimeParseException("illegal input ".concat(str), str, 0);
            case 5:
            case 6:
            case 7:
            case 13:
            case 15:
            default:
                return m5794(0, i, cArr);
            case 8:
                if (cArr[2] == ':' && cArr[5] == ':') {
                    return LocalDateTime.of(f9021, m5852(0, cArr));
                }
                LocalDate localDateM5821 = m5821(0, cArr);
                if (localDateM5821 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM5821, LocalTime.MIN);
            case 9:
                LocalDate localDateM5819 = m5819(0, cArr);
                if (localDateM5819 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM5819, LocalTime.MIN);
            case 10:
                LocalDate localDateM5825 = m5825(0, cArr);
                if (localDateM5825 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM5825, LocalTime.MIN);
            case 11:
                LocalDate localDateM5818 = m5818(0, cArr);
                if (localDateM5818 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM5818, LocalTime.MIN);
            case 12:
                return m5801(0, cArr);
            case 14:
                return m5799(0, cArr);
            case 16:
                return m5809(0, cArr);
            case 17:
                return m5807(0, cArr);
            case 18:
                return m5805(0, cArr);
            case 19:
                return m5795(0, cArr);
            case 20:
                return m5797(0, cArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static LocalDateTime m5804(int i, String str) {
        LocalDateTime localDateTimeM5803;
        Function function;
        if (i != 0) {
            ToIntFunction toIntFunction = AbstractC2853.f8924;
            if (toIntFunction != null && (function = AbstractC2853.f8925) != null && toIntFunction.applyAsInt(str) == 0) {
                localDateTimeM5803 = m5802((byte[]) function.apply(str), i);
            } else if (AbstractC2853.f8916 != 8 || AbstractC2853.f8933) {
                char[] cArr = new char[i];
                str.getChars(0, i, cArr, 0);
                localDateTimeM5803 = m5803(i, cArr);
            } else {
                localDateTimeM5803 = m5803(i, AbstractC2853.m5725(str));
            }
            if (localDateTimeM5803 != null) {
                return localDateTimeM5803;
            }
            switch (str) {
                case "0000-0-00":
                case "0000-00-0":
                case "000000000000":
                case "00000000":
                case "":
                case "null":
                case "0000年00月00日":
                case "0000-00-00":
                    break;
                default:
                    throw new DateTimeParseException(str, str, 0);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0266 A[PHI: r12
  0x0266: PHI (r12v5 char) = (r12v4 char), (r12v4 char), (r12v4 char), (r12v8 char) binds: [B:100:0x023c, B:101:0x023e, B:102:0x0240, B:107:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0268 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d1 A[PHI: r12
  0x01d1: PHI (r12v2 char) = (r12v1 char), (r12v1 char), (r12v1 char), (r12v12 char) binds: [B:73:0x01a9, B:74:0x01ab, B:75:0x01ad, B:80:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fb A[PHI: r12
  0x01fb: PHI (r12v3 char) = (r12v2 char), (r12v2 char), (r12v2 char), (r12v10 char) binds: [B:81:0x01d1, B:82:0x01d3, B:83:0x01d5, B:88:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime m5805(int r29, char[] r30) {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5805(int, char[]):java.time.LocalDateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0256  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime m5806(byte[] r32, int r33) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5806(byte[], int):java.time.LocalDateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b6 A[PHI: r3
  0x01b6: PHI (r3v15 char) = (r3v14 char), (r3v14 char), (r3v14 char), (r3v20 char) binds: [B:59:0x018e, B:60:0x0190, B:61:0x0192, B:66:0x01b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0215 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0217  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime m5807(int r31, char[] r32) {
        /*
            Method dump skipped, instruction units count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5807(int, char[]):java.time.LocalDateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e4  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime m5808(byte[] r31, int r32) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5808(byte[], int):java.time.LocalDateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDateTime m5809(int r20, char[] r21) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5809(int, char[]):java.time.LocalDateTime");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static LocalDateTime m5810(byte[] bArr, int i) {
        if (i + 14 > bArr.length) {
            return null;
        }
        int iM5693 = AbstractC2848.m5693(bArr, i);
        int iM5675 = AbstractC2848.m5675(bArr, i + 4);
        int iM56752 = AbstractC2848.m5675(bArr, i + 6);
        int iM56753 = AbstractC2848.m5675(bArr, i + 8);
        int iM56754 = AbstractC2848.m5675(bArr, i + 10);
        int iM56755 = AbstractC2848.m5675(bArr, i + 12);
        if ((iM5693 | iM5675 | iM56752 | iM56753 | iM56754 | iM56755) < 0) {
            return null;
        }
        return LocalDateTime.of(iM5693, iM5675, iM56752, iM56753, iM56754, iM56755);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static ZoneId m5811(String str, ZoneId zoneId) {
        int iIndexOf;
        char cCharAt;
        if (str == null) {
            return zoneId != null ? zoneId : f9025;
        }
        switch (str) {
            case "000":
                return ZoneOffset.UTC;
            case "CST":
                return f9024;
            case "+08:00":
                return f9022;
            default:
                if (str.length() > 0 && (((cCharAt = str.charAt(0)) == '+' || cCharAt == '-') && str.charAt(str.length() - 1) != ']')) {
                    return ZoneOffset.of(str);
                }
                int iIndexOf2 = str.indexOf(91);
                return (iIndexOf2 <= 0 || (iIndexOf = str.indexOf(93, iIndexOf2)) <= 0) ? ZoneId.of(str) : ZoneId.of(str.substring(iIndexOf2 + 1, iIndexOf));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m5812(long j) {
        if (j >= 684900000) {
            return 28800;
        }
        if (j >= 671598000) {
            return 32400;
        }
        if (j >= 653450400) {
            return 28800;
        }
        if (j >= 640148400) {
            return 32400;
        }
        if (j >= 622000800) {
            return 28800;
        }
        if (j >= 608698800) {
            return 32400;
        }
        if (j >= 589946400) {
            return 28800;
        }
        if (j >= 577249200) {
            return 32400;
        }
        if (j >= 558496800) {
            return 28800;
        }
        if (j >= 545194800) {
            return 32400;
        }
        if (j >= 527047200) {
            return 28800;
        }
        if (j >= 515559600) {
            return 32400;
        }
        if (j >= -649987200) {
            return 28800;
        }
        if (j >= -652316400) {
            return 32400;
        }
        if (j >= -670636800) {
            return 28800;
        }
        if (j >= -683852400) {
            return 32400;
        }
        if (j >= -699580800) {
            return 28800;
        }
        if (j >= -716857200) {
            return 32400;
        }
        if (j >= -733795200) {
            return 28800;
        }
        if (j >= -745801200) {
            return 32400;
        }
        if (j >= -767836800) {
            return 28800;
        }
        if (j >= -881017200) {
            return 32400;
        }
        if (j >= -888796800) {
            return 28800;
        }
        if (j >= -908838000) {
            return 32400;
        }
        if (j >= -922060800) {
            return 28800;
        }
        if (j >= -933634800) {
            return 32400;
        }
        if (j >= -1585872000) {
            return 28800;
        }
        if (j >= -1600642800) {
            return 32400;
        }
        return j >= -2177452800L ? 28800 : 29143;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static String m5813(long j, DateUtils$DateTimeFormatPattern dateUtils$DateTimeFormatPattern) {
        int iM5812;
        long j2;
        long jFloorDiv = Math.floorDiv(j, 1000L);
        ZoneId zoneId = f9024;
        ZoneId zoneId2 = f9025;
        if (zoneId2 == zoneId || zoneId2.getRules() == f9023) {
            iM5812 = m5812(jFloorDiv);
        } else {
            iM5812 = zoneId2.getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds();
        }
        long j3 = jFloorDiv + ((long) iM5812);
        long jFloorDiv2 = Math.floorDiv(j3, 86400L);
        int iFloorMod = (int) Math.floorMod(j3, 86400L);
        long j4 = 719468 + jFloorDiv2;
        if (j4 < 0) {
            long j5 = ((jFloorDiv2 + 719469) / 146097) - 1;
            j2 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j2 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((j6 / 400) + (((j6 / 4) + (j6 * 365)) - (j6 / 100)));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((j6 / 400) + (((j6 / 4) + (365 * j6)) - (j6 / 100)));
        }
        int i = (int) j7;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j8 = j6 + j2 + ((long) (i2 / 10));
        if (j8 < -999999999 || j8 > 999999999) {
            throw new DateTimeException(AbstractC2442.m4572(j8, "Invalid year "));
        }
        int i5 = (int) j8;
        if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DASH || dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_SLASH || dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
            return m5814(i5, i3, i4, dateUtils$DateTimeFormatPattern);
        }
        long j9 = iFloorMod;
        if (j9 < 0 || j9 > 86399) {
            throw new DateTimeException(AbstractC2442.m4572(j9, "Invalid secondOfDay "));
        }
        int i6 = (int) (j9 / 3600);
        long j10 = j9 - ((long) (i6 * 3600));
        int i7 = (int) (j10 / 60);
        return m5815(i5, i3, i4, i6, i7, (int) (j10 - ((long) (i7 * 60))), dateUtils$DateTimeFormatPattern);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m5814(int i, int i2, int i3, DateUtils$DateTimeFormatPattern dateUtils$DateTimeFormatPattern) {
        int i4 = i / 100;
        int i5 = i - (i4 * 100);
        BiFunction biFunction = AbstractC2853.f8920;
        if (biFunction != null) {
            byte[] bArr = new byte[10];
            if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
                AbstractC2848.m5710(0, bArr, i3);
                bArr[2] = 46;
                AbstractC2848.m5710(3, bArr, i2);
                bArr[5] = 46;
                AbstractC2848.m5710(6, bArr, i4);
                AbstractC2848.m5710(8, bArr, i5);
            } else {
                byte b = (byte) (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DASH ? 45 : 47);
                AbstractC2848.m5710(0, bArr, i4);
                AbstractC2848.m5710(2, bArr, i5);
                bArr[4] = b;
                AbstractC2848.m5710(5, bArr, i2);
                bArr[7] = b;
                AbstractC2848.m5710(8, bArr, i3);
            }
            return (String) biFunction.apply(bArr, (byte) 0);
        }
        char[] cArr = new char[10];
        if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
            AbstractC2848.m5709(0, i3, cArr);
            cArr[2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            AbstractC2848.m5709(3, i2, cArr);
            cArr[5] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            AbstractC2848.m5709(6, i4, cArr);
            AbstractC2848.m5709(8, i5, cArr);
        } else {
            char c = dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DASH ? '-' : '/';
            AbstractC2848.m5709(0, i4, cArr);
            AbstractC2848.m5709(2, i5, cArr);
            cArr[4] = c;
            AbstractC2848.m5709(5, i2, cArr);
            cArr[7] = c;
            AbstractC2848.m5709(8, i3, cArr);
        }
        BiFunction biFunction2 = AbstractC2853.f8921;
        return biFunction2 != null ? (String) biFunction2.apply(cArr, Boolean.TRUE) : new String(cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m5815(int i, int i2, int i3, int i4, int i5, int i6, DateUtils$DateTimeFormatPattern dateUtils$DateTimeFormatPattern) {
        int i7 = i / 100;
        int i8 = i - (i7 * 100);
        BiFunction biFunction = AbstractC2853.f8920;
        if (biFunction != null) {
            byte[] bArr = new byte[19];
            if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT) {
                AbstractC2848.m5710(0, bArr, i3);
                bArr[2] = 46;
                AbstractC2848.m5710(3, bArr, i2);
                bArr[5] = 46;
                AbstractC2848.m5710(6, bArr, i7);
                AbstractC2848.m5710(8, bArr, i8);
                bArr[10] = 32;
            } else {
                int i9 = dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH ? 32 : 84;
                byte b = (byte) (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH ? 47 : 45);
                AbstractC2848.m5710(0, bArr, i7);
                AbstractC2848.m5710(2, bArr, i8);
                bArr[4] = b;
                AbstractC2848.m5710(5, bArr, i2);
                bArr[7] = b;
                AbstractC2848.m5710(8, bArr, i3);
                bArr[10] = (byte) i9;
            }
            AbstractC2848.m5673(bArr, 11, i4, i5, i6);
            return (String) biFunction.apply(bArr, (byte) 0);
        }
        char[] cArr = new char[19];
        if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT) {
            AbstractC2848.m5709(0, i3, cArr);
            cArr[2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            AbstractC2848.m5709(3, i2, cArr);
            cArr[5] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            AbstractC2848.m5709(6, i7, cArr);
            AbstractC2848.m5709(8, i8, cArr);
            cArr[10] = ' ';
        } else {
            char c = dateUtils$DateTimeFormatPattern != DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH ? 'T' : ' ';
            char c2 = dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH ? '/' : SignatureVisitor.SUPER;
            AbstractC2848.m5709(0, i7, cArr);
            AbstractC2848.m5709(2, i8, cArr);
            cArr[4] = c2;
            AbstractC2848.m5709(5, i2, cArr);
            cArr[7] = c2;
            AbstractC2848.m5709(8, i3, cArr);
            cArr[10] = c;
        }
        AbstractC2848.m5674(cArr, 11, i4, i5, i6);
        BiFunction biFunction2 = AbstractC2853.f8921;
        return biFunction2 != null ? (String) biFunction2.apply(cArr, Boolean.TRUE) : new String(cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m5816(int i, int i2, int i3) {
        long j = (i3 - 1) + (((i2 * 367) - 362) / 12) + ((i + 399) / 400) + (((i + 3) / 4) - ((i + 99) / 100)) + (i * 365);
        if (i2 > 2) {
            j = ((i & 3) != 0 || (i % 100 == 0 && i % 400 != 0)) ? j - 2 : j - 1;
        }
        return j - 719528;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static LocalDate m5817(byte[] bArr, int i) {
        int iM5675;
        int iM56752;
        int iM5693;
        if (i + 11 > bArr.length) {
            return null;
        }
        int i2 = i + 4;
        if (bArr[i2] != 45 || bArr[i + 7] != 45 || bArr[i + 10] != 90) {
            if (bArr[i + 2] == 32 && bArr[i + 6] == 32) {
                int iM56932 = AbstractC2848.m5693(bArr, i + 7);
                int iM5824 = m5824((char) bArr[i + 3], (char) bArr[i2], (char) bArr[i + 5]);
                iM5675 = AbstractC2848.m5675(bArr, i);
                iM56752 = iM5824;
                iM5693 = iM56932;
            }
            return null;
        }
        iM5693 = AbstractC2848.m5693(bArr, i);
        iM56752 = AbstractC2848.m5675(bArr, i + 5);
        iM5675 = AbstractC2848.m5675(bArr, i + 8);
        if ((iM5693 | iM56752 | iM5675) >= 0 && (iM5693 != 0 || iM56752 != 0 || iM5675 != 0)) {
            return LocalDate.of(iM5693, iM56752, iM5675);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static LocalDate m5818(int i, char[] cArr) {
        int iM5676;
        int iM56762;
        int iM5694;
        if (i + 11 > cArr.length) {
            return null;
        }
        char c = cArr[i + 4];
        int i2 = i + 7;
        char c2 = cArr[i2];
        char c3 = cArr[i + 10];
        if ((c != 24180 || c2 != 26376 || c3 != 26085) && ((c != '-' || c2 != '-' || c3 != 'Z') && (c != 45380 || c2 != 50900 || c3 != 51068))) {
            if (cArr[i + 2] == ' ' && cArr[i + 6] == ' ') {
                int iM56942 = AbstractC2848.m5694(i2, cArr);
                int iM5824 = m5824(cArr[i + 3], c, cArr[i + 5]);
                iM5676 = AbstractC2848.m5676(i, cArr);
                iM56762 = iM5824;
                iM5694 = iM56942;
            }
            return null;
        }
        iM5694 = AbstractC2848.m5694(i, cArr);
        iM56762 = AbstractC2848.m5676(i + 5, cArr);
        iM5676 = AbstractC2848.m5676(i + 8, cArr);
        if ((iM5694 | iM56762 | iM5676) >= 0 && (iM5694 != 0 || iM56762 != 0 || iM5676 != 0)) {
            return LocalDate.of(iM5694, iM56762, iM5676);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static LocalDate m5819(int i, char[] cArr) {
        int iM5676;
        int iM5678;
        int iM5694;
        int iM56942;
        int iM5824;
        int iM56782;
        int iM56783;
        int iM56762;
        int iM56943;
        if (i + 9 > cArr.length) {
            return null;
        }
        char c = cArr[i + 1];
        int i2 = i + 2;
        char c2 = cArr[i2];
        char c3 = cArr[i + 4];
        char c4 = cArr[i + 6];
        int i3 = i + 7;
        char c5 = cArr[i3];
        int i4 = i + 8;
        char c6 = cArr[i4];
        if ((c3 == '-' && c5 == '-') || (c3 == '/' && c5 == '/')) {
            iM56942 = AbstractC2848.m5694(i, cArr);
            iM5824 = AbstractC2848.m5676(i + 5, cArr);
            iM56782 = AbstractC2848.m5678(i4, cArr);
        } else if ((c3 == '-' && c4 == '-') || (c3 == '/' && c4 == '/')) {
            iM56942 = AbstractC2848.m5694(i, cArr);
            iM5824 = AbstractC2848.m5678(i + 5, cArr);
            iM56782 = AbstractC2848.m5676(i3, cArr);
        } else if ((c3 == 24180 && c4 == 26376 && c6 == 26085) || (c3 == 45380 && c4 == 50900 && c6 == 51068)) {
            iM56942 = AbstractC2848.m5694(i, cArr);
            iM5824 = AbstractC2848.m5678(i + 5, cArr);
            iM56782 = AbstractC2848.m5678(i3, cArr);
        } else {
            if (c == '.' && c3 == '.') {
                iM56783 = AbstractC2848.m5678(i, cArr);
                iM56762 = AbstractC2848.m5676(i2, cArr);
                iM56943 = AbstractC2848.m5694(i + 5, cArr);
            } else if ((c2 == '.' && c3 == '.') || (c2 == '-' && c3 == '-')) {
                iM56783 = AbstractC2848.m5676(i, cArr);
                iM56762 = AbstractC2848.m5678(i + 3, cArr);
                iM56943 = AbstractC2848.m5694(i + 5, cArr);
            } else if (c == '-' && c3 == '-') {
                iM56783 = AbstractC2848.m5678(i, cArr);
                iM56762 = AbstractC2848.m5676(i2, cArr);
                iM56943 = AbstractC2848.m5694(i + 5, cArr);
            } else if (c2 == '-' && c4 == '-') {
                int iM56763 = AbstractC2848.m5676(i, cArr);
                iM5824 = m5824(cArr[i + 3], c3, cArr[i + 5]);
                int iM56764 = AbstractC2848.m5676(i3, cArr);
                if (iM56764 != -1) {
                    iM56764 += 2000;
                }
                iM56942 = iM56764;
                iM56782 = iM56763;
            } else {
                if (c == '/' && c3 == '/') {
                    iM5676 = AbstractC2848.m5678(i, cArr);
                    iM5678 = AbstractC2848.m5676(i2, cArr);
                    iM5694 = AbstractC2848.m5694(i + 5, cArr);
                } else {
                    if (c2 != '/' || c3 != '/') {
                        return null;
                    }
                    iM5676 = AbstractC2848.m5676(i, cArr);
                    iM5678 = AbstractC2848.m5678(i + 3, cArr);
                    iM5694 = AbstractC2848.m5694(i + 5, cArr);
                }
                int i5 = iM5676;
                iM56942 = iM5694;
                iM5824 = i5;
                iM56782 = iM5678;
            }
            iM56782 = iM56783;
            iM56942 = iM56943;
            iM5824 = iM56762;
        }
        if ((iM56942 | iM5824 | iM56782) <= 0) {
            return null;
        }
        return LocalDate.of(iM56942, iM5824, iM56782);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static LocalDate m5820(byte[] bArr, int i) {
        int iM5675;
        int iM5677;
        int iM5693;
        int iM56932;
        int iM56752;
        if (i + 9 > bArr.length) {
            return null;
        }
        char c = (char) bArr[i + 1];
        int i2 = i + 2;
        char c2 = (char) bArr[i2];
        char c3 = (char) bArr[i + 4];
        char c4 = (char) bArr[i + 6];
        int i3 = i + 7;
        char c5 = (char) bArr[i3];
        if ((c3 == '-' && c5 == '-') || (c3 == '/' && c5 == '/')) {
            iM56932 = AbstractC2848.m5693(bArr, i);
            iM5675 = AbstractC2848.m5675(bArr, i + 5);
            iM56752 = AbstractC2848.m5677(bArr, i + 8);
        } else if ((c3 == '-' && c4 == '-') || (c3 == '/' && c4 == '/')) {
            iM56932 = AbstractC2848.m5693(bArr, i);
            iM5675 = AbstractC2848.m5677(bArr, i + 5);
            iM56752 = AbstractC2848.m5675(bArr, i3);
        } else {
            if (c == '.' && c3 == '.') {
                iM5677 = AbstractC2848.m5677(bArr, i);
                iM5675 = AbstractC2848.m5675(bArr, i2);
                iM5693 = AbstractC2848.m5693(bArr, i + 5);
            } else if ((c2 == '.' && c3 == '.') || (c2 == '-' && c3 == '-')) {
                iM5677 = AbstractC2848.m5675(bArr, i);
                iM5675 = AbstractC2848.m5677(bArr, i + 3);
                iM5693 = AbstractC2848.m5693(bArr, i + 5);
            } else if (c == '-' && c3 == '-') {
                iM5677 = AbstractC2848.m5677(bArr, i);
                iM5675 = AbstractC2848.m5675(bArr, i2);
                iM5693 = AbstractC2848.m5693(bArr, i + 5);
            } else if (c2 == '-' && c4 == '-') {
                iM5677 = AbstractC2848.m5675(bArr, i);
                iM5675 = m5824((char) bArr[i + 3], c3, (char) bArr[i + 5]);
                iM5693 = AbstractC2848.m5675(bArr, i3);
                if (iM5693 != -1) {
                    iM5693 += 2000;
                }
            } else if (c == '/' && c3 == '/') {
                int iM56772 = AbstractC2848.m5677(bArr, i);
                int iM56753 = AbstractC2848.m5675(bArr, i2);
                iM56932 = AbstractC2848.m5693(bArr, i + 5);
                iM56752 = iM56753;
                iM5675 = iM56772;
            } else {
                if (c2 != '/' || c3 != '/') {
                    return null;
                }
                iM5675 = AbstractC2848.m5675(bArr, i);
                iM5677 = AbstractC2848.m5677(bArr, i + 3);
                iM5693 = AbstractC2848.m5693(bArr, i + 5);
            }
            int i4 = iM5677;
            iM56932 = iM5693;
            iM56752 = i4;
        }
        if ((iM56932 | iM5675 | iM56752) <= 0) {
            return null;
        }
        return LocalDate.of(iM56932, iM5675, iM56752);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static LocalDate m5821(int i, char[] cArr) {
        int iM5694;
        int iM5676;
        int iM56762;
        if (i + 8 > cArr.length) {
            return null;
        }
        char c = cArr[i + 1];
        char c2 = cArr[i + 3];
        int i2 = i + 4;
        char c3 = cArr[i2];
        if (c3 == '-' && cArr[i + 6] == '-') {
            iM5694 = AbstractC2848.m5694(i, cArr);
            iM5676 = AbstractC2848.m5678(i + 5, cArr);
            iM56762 = AbstractC2848.m5678(i + 7, cArr);
        } else if (c == '/' && c2 == '/') {
            iM5676 = AbstractC2848.m5678(i, cArr);
            iM56762 = AbstractC2848.m5678(i + 2, cArr);
            iM5694 = AbstractC2848.m5694(i2, cArr);
        } else if (c == '-' && cArr[i + 5] == '-') {
            int iM5678 = AbstractC2848.m5678(i, cArr);
            iM5676 = m5824(cArr[i + 2], c2, c3);
            int iM56763 = AbstractC2848.m5676(i + 6, cArr);
            if (iM56763 != -1) {
                iM56763 += 2000;
            }
            iM5694 = iM56763;
            iM56762 = iM5678;
        } else {
            iM5694 = AbstractC2848.m5694(i, cArr);
            iM5676 = AbstractC2848.m5676(i2, cArr);
            iM56762 = AbstractC2848.m5676(i + 6, cArr);
        }
        if ((iM5694 | iM5676 | iM56762) <= 0) {
            return null;
        }
        return LocalDate.of(iM5694, iM5676, iM56762);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static LocalDate m5822(byte[] bArr, int i) {
        int iM5693;
        int iM5675;
        int iM56752;
        if (i + 8 > bArr.length) {
            return null;
        }
        char c = (char) bArr[i + 1];
        char c2 = (char) bArr[i + 3];
        int i2 = i + 4;
        char c3 = (char) bArr[i2];
        if (c3 == '-' && bArr[i + 6] == 45) {
            iM5693 = AbstractC2848.m5693(bArr, i);
            iM5675 = AbstractC2848.m5677(bArr, i + 5);
            iM56752 = AbstractC2848.m5677(bArr, i + 7);
        } else if (c == '/' && c2 == '/') {
            iM5675 = AbstractC2848.m5677(bArr, i);
            int iM5677 = AbstractC2848.m5677(bArr, i + 2);
            iM5693 = AbstractC2848.m5693(bArr, i2);
            iM56752 = iM5677;
        } else if (c == '-' && bArr[i + 5] == 45) {
            int iM56772 = AbstractC2848.m5677(bArr, i);
            iM5675 = m5824((char) bArr[i + 2], c2, c3);
            int iM56753 = AbstractC2848.m5675(bArr, i + 6);
            if (iM56753 != -1) {
                iM56753 += 2000;
            }
            iM5693 = iM56753;
            iM56752 = iM56772;
        } else {
            iM5693 = AbstractC2848.m5693(bArr, i);
            iM5675 = AbstractC2848.m5675(bArr, i2);
            iM56752 = AbstractC2848.m5675(bArr, i + 6);
        }
        if ((iM5693 | iM5675 | iM56752) <= 0) {
            return null;
        }
        return LocalDate.of(iM5693, iM5675, iM56752);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Date m5823(String str) {
        long jM5850 = m5850(str, f9025);
        if (jM5850 == 0) {
            return null;
        }
        return new Date(jM5850);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static int m5824(char c, char c2, char c3) {
        switch ((c << 16) | (c2 << '\b') | c3) {
            case 4288626:
                return 4;
            case 4289895:
                return 8;
            case 4482403:
                return 12;
            case 4613474:
                return 2;
            case 4874606:
                return 1;
            case 4879724:
                return 7;
            case 4879726:
                return 6;
            case 5071218:
                return 3;
            case 5071225:
                return 5;
            case 5140342:
                return 11;
            case 5202804:
                return 10;
            case 5465456:
                return 9;
            default:
                return -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDate m5825(int r18, char[] r19) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5825(int, char[]):java.time.LocalDate");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static LocalDate m5826(byte[] bArr, int i) {
        int iM5824;
        int iM5693;
        int iM5675;
        int iM56752;
        int iM56932;
        if (i + 10 > bArr.length) {
            return null;
        }
        char c = (char) bArr[i + 2];
        char c2 = (char) bArr[i + 4];
        int i2 = i + 5;
        char c3 = (char) bArr[i2];
        char c4 = (char) bArr[i + 7];
        if ((c2 == '-' && c4 == '-') || (c2 == '/' && c4 == '/')) {
            iM5693 = AbstractC2848.m5693(bArr, i);
            iM5824 = AbstractC2848.m5675(bArr, i2);
            iM5675 = AbstractC2848.m5675(bArr, i + 8);
        } else {
            if ((c == '.' && c3 == '.') || (c == '-' && c3 == '-')) {
                iM56752 = AbstractC2848.m5675(bArr, i);
                iM5824 = AbstractC2848.m5675(bArr, i + 3);
                iM56932 = AbstractC2848.m5693(bArr, i + 6);
            } else if (c == '/' && c3 == '/') {
                iM5824 = AbstractC2848.m5675(bArr, i);
                iM56752 = AbstractC2848.m5675(bArr, i + 3);
                iM56932 = AbstractC2848.m5693(bArr, i + 6);
            } else {
                if (bArr[i + 1] != 32 || c3 != ' ') {
                    return null;
                }
                int iM5677 = AbstractC2848.m5677(bArr, i);
                iM5824 = m5824(c, (char) bArr[i + 3], c2);
                iM5693 = AbstractC2848.m5693(bArr, i + 6);
                iM5675 = iM5677;
            }
            int i3 = iM56752;
            iM5693 = iM56932;
            iM5675 = i3;
        }
        if ((iM5693 | iM5824 | iM5675) <= 0) {
            return null;
        }
        return LocalDate.of(iM5693, iM5824, iM5675);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Date m5827(String str, String str2, ZoneId zoneId) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char cCharAt6;
        ZoneId zoneId2;
        char c8;
        char c9;
        char c10;
        char c11;
        char cCharAt7;
        char c12;
        Function function;
        char c13;
        char c14;
        if (str == null || str.isEmpty() || "null".equals(str)) {
            return null;
        }
        if (str2 == null || str2.isEmpty() || "string".equals(str2)) {
            long jM5850 = m5850(str, zoneId);
            if (jM5850 == 0) {
                return null;
            }
            return new Date(jM5850);
        }
        byte b = -1;
        switch (str2.hashCode()) {
            case -347789785:
                if (str2.equals("yyyyMMddHHmmssSSSZ")) {
                    b = 0;
                }
                break;
            case -276306848:
                if (str2.equals("yyyyMMdd")) {
                    b = 1;
                }
                break;
            case -159776256:
                if (str2.equals("yyyy-MM-dd")) {
                    b = 2;
                }
                break;
            case -102516032:
                if (str2.equals("yyyy/MM/dd")) {
                    b = 3;
                }
                break;
            case 311496928:
                if (str2.equals("yyyy/MM/dd HH:mm:ss")) {
                    b = 4;
                }
                break;
            case 1333195168:
                if (str2.equals("yyyy-MM-dd HH:mm:ss")) {
                    b = 5;
                }
                break;
            case 1397504320:
                if (str2.equals("dd.MM.yyyy HH:mm:ss")) {
                    b = 6;
                }
                break;
            case 1798231098:
                if (str2.equals("yyyy-MM-dd'T'HH:mm:ss")) {
                    b = 7;
                }
                break;
            case 2095190916:
                if (str2.equals("iso8601")) {
                    b = 8;
                }
                break;
        }
        ZoneId zoneId3 = f9025;
        switch (b) {
            case 0:
                return new Date(m5850(str, zoneId3));
            case 1:
                LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
                return new Date(m5831(zoneId, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 0, 0, 0, 0));
            case 2:
                return new Date(m5840(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DASH));
            case 3:
                return new Date(m5840(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
            case 4:
                return new Date(m5839(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
            case 5:
                if (AbstractC2853.f8916 == 8) {
                    char[] cArrM5725 = AbstractC2853.m5725(str);
                    if (cArrM5725.length != 19) {
                        throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                    }
                    cCharAt = cArrM5725[0];
                    cCharAt2 = cArrM5725[1];
                    cCharAt3 = cArrM5725[2];
                    cCharAt4 = cArrM5725[3];
                    char c15 = cArrM5725[4];
                    cCharAt5 = cArrM5725[5];
                    char c16 = cArrM5725[6];
                    c9 = cArrM5725[7];
                    c10 = cArrM5725[8];
                    char c17 = cArrM5725[9];
                    char c18 = cArrM5725[10];
                    char c19 = cArrM5725[11];
                    char c20 = cArrM5725[12];
                    char c21 = cArrM5725[13];
                    char c22 = cArrM5725[14];
                    char c23 = cArrM5725[15];
                    char c24 = cArrM5725[16];
                    char c25 = cArrM5725[17];
                    c11 = c24;
                    c = c16;
                    c2 = c17;
                    c12 = c18;
                    c4 = c19;
                    c5 = c20;
                    cCharAt7 = cArrM5725[18];
                    c3 = c21;
                    c6 = c22;
                    c7 = c23;
                    cCharAt6 = c25;
                    zoneId2 = zoneId3;
                    c8 = c15;
                } else {
                    ToIntFunction toIntFunction = AbstractC2853.f8924;
                    if (toIntFunction == null || toIntFunction.applyAsInt(str) != 0 || (function = AbstractC2853.f8925) == null) {
                        if (str.length() != 19) {
                            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                        }
                        cCharAt = str.charAt(0);
                        cCharAt2 = str.charAt(1);
                        cCharAt3 = str.charAt(2);
                        cCharAt4 = str.charAt(3);
                        char cCharAt8 = str.charAt(4);
                        cCharAt5 = str.charAt(5);
                        char cCharAt9 = str.charAt(6);
                        char cCharAt10 = str.charAt(7);
                        char cCharAt11 = str.charAt(8);
                        char cCharAt12 = str.charAt(9);
                        char cCharAt13 = str.charAt(10);
                        char cCharAt14 = str.charAt(11);
                        char cCharAt15 = str.charAt(12);
                        char cCharAt16 = str.charAt(13);
                        char cCharAt17 = str.charAt(14);
                        char cCharAt18 = str.charAt(15);
                        char cCharAt19 = str.charAt(16);
                        c = cCharAt9;
                        c2 = cCharAt12;
                        c3 = cCharAt16;
                        c4 = cCharAt14;
                        c5 = cCharAt15;
                        c6 = cCharAt17;
                        c7 = cCharAt18;
                        cCharAt6 = str.charAt(17);
                        zoneId2 = zoneId3;
                        c8 = cCharAt8;
                        c9 = cCharAt10;
                        c10 = cCharAt11;
                        c11 = cCharAt19;
                        cCharAt7 = str.charAt(18);
                        c12 = cCharAt13;
                    } else {
                        byte[] bArr = (byte[]) function.apply(str);
                        if (bArr.length != 19) {
                            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                        }
                        cCharAt = (char) bArr[0];
                        cCharAt2 = (char) bArr[1];
                        cCharAt3 = (char) bArr[2];
                        cCharAt4 = (char) bArr[3];
                        char c26 = (char) bArr[4];
                        cCharAt5 = (char) bArr[5];
                        char c27 = (char) bArr[6];
                        char c28 = (char) bArr[7];
                        char c29 = (char) bArr[8];
                        char c30 = (char) bArr[9];
                        char c31 = (char) bArr[10];
                        char c32 = (char) bArr[11];
                        char c33 = (char) bArr[12];
                        char c34 = (char) bArr[13];
                        char c35 = (char) bArr[14];
                        char c36 = (char) bArr[15];
                        char c37 = (char) bArr[16];
                        char c38 = (char) bArr[17];
                        cCharAt7 = (char) bArr[18];
                        c3 = c34;
                        c6 = c35;
                        c7 = c36;
                        cCharAt6 = c38;
                        zoneId2 = zoneId3;
                        c8 = c26;
                        c10 = c29;
                        c11 = c37;
                        c = c27;
                        c9 = c28;
                        c2 = c30;
                        c12 = c31;
                        c4 = c32;
                        c5 = c33;
                    }
                }
                char c39 = c5;
                if (c8 != '-' || c9 != '-' || c12 != ' ' || c3 != ':' || c11 != ':') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9' || cCharAt3 < '0' || cCharAt3 > '9' || cCharAt4 < '0' || cCharAt4 > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int iM142 = (cCharAt4 - '0') + AbstractC0053.m142(cCharAt3, 48, 10, AbstractC0053.m142(cCharAt2, 48, 100, (cCharAt - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
                if (cCharAt5 < '0' || cCharAt5 > '9' || c < '0' || c > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i = (c - '0') + ((cCharAt5 - '0') * 10);
                if ((i == 0 && iM142 != 0) || i > 12) {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                if (c10 < '0' || c10 > '9' || c2 < '0' || c2 > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i2 = (c2 - '0') + ((c10 - '0') * 10);
                int i3 = i != 2 ? (i == 4 || i == 6 || i == 9 || i == 11) ? 30 : 31 : ((iM142 & 3) != 0 || (iM142 % 100 == 0 && iM142 % 400 != 0)) ? 28 : 29;
                if ((i2 == 0 && iM142 != 0) || i2 > i3) {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                if (c4 < '0' || c4 > '9' || c39 < '0' || c39 > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i4 = (c39 - '0') + ((c4 - '0') * 10);
                char c40 = c6;
                if (c40 < '0' || c40 > '9' || (c13 = c7) < '0' || c13 > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i5 = (c13 - '0') + ((c40 - '0') * 10);
                char c41 = cCharAt6;
                if (c41 < '0' || c41 > '9' || (c14 = cCharAt7) < '0' || c14 > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i6 = (c14 - '0') + ((c41 - '0') * 10);
                if (iM142 == 0 && i == 0 && i2 == 0) {
                    iM142 = 1970;
                    i2 = 1;
                    i = 1;
                }
                long jM5816 = (m5816(iM142, i, i2) * 86400) + ((long) (i4 * 3600)) + ((long) (i5 * 60)) + ((long) i6);
                ZoneId zoneId4 = zoneId == null ? zoneId2 : zoneId;
                return new Date((jM5816 - ((long) ((!(zoneId4 == f9024 || zoneId4.getRules() == f9023) || jM5816 < 684900000) ? (zoneId4 == ZoneOffset.UTC || "UTC".equals(zoneId4.getId())) ? 0 : zoneId4.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM142, i, i2), LocalTime.of(i4, i5, i6, 0))).getTotalSeconds() : 28800))) * 1000);
            case 6:
                return new Date(m5839(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
            case 7:
                return new Date(m5839(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T));
            case 8:
                return m5823(str);
            default:
                ZoneId zoneId5 = zoneId == null ? zoneId3 : zoneId;
                LocalDateTime localDateTime = LocalDateTime.parse(str, DateTimeFormatter.ofPattern(str2));
                return new Date(m5831(zoneId5, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.LocalDate m5828(java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5828(java.lang.String):java.time.LocalDate");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m5829(char c, char c2) {
        if (c != '0') {
            if (c == '1') {
                switch (c2) {
                    case '0':
                        c = '2';
                        c2 = '2';
                        break;
                    case '1':
                        c2 = '3';
                        c = '2';
                        break;
                    case '2':
                        c2 = '4';
                        c = '2';
                        break;
                }
            }
        } else {
            switch (c2) {
                case '0':
                    c2 = '2';
                    c = '1';
                    break;
                case '1':
                    c2 = '3';
                    c = '1';
                    break;
                case '2':
                    c2 = '4';
                    c = '1';
                    break;
                case '3':
                    c2 = '5';
                    c = '1';
                    break;
                case '4':
                    c2 = '6';
                    c = '1';
                    break;
                case '5':
                    c2 = '7';
                    c = '1';
                    break;
                case '6':
                    c2 = '8';
                    c = '1';
                    break;
                case '7':
                    c2 = '9';
                    c = '1';
                    break;
                case '8':
                    c = '2';
                    c2 = '0';
                    break;
                case '9':
                    c = '2';
                    c2 = '1';
                    break;
            }
        }
        return (c << 16) | c2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static long m5830(byte[] bArr, int i) {
        long jReverseBytes = AbstractC2853.f8919.getLong(bArr, AbstractC2853.f8918 + ((long) i));
        if (AbstractC2853.f8929) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        if (((((-1085102592571150096L) & jReverseBytes) - 3472328296227680304L) | (((1085102592571150095L & jReverseBytes) + 434034439958300166L) & (-1085366475377544976L))) != 0 || (16492675399680L & jReverseBytes) != 10995116933120L) {
            return -1L;
        }
        long j = 4222124902318095L & jReverseBytes;
        return (j << 3) + (j << 1) + ((jReverseBytes & 1080863974993432320L) >> 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static long m5831(ZoneId zoneId, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (zoneId == null) {
            zoneId = f9025;
        }
        long jM5816 = (m5816(i, i2, i3) * 86400) + ((long) (i4 * 3600)) + ((long) (i5 * 60)) + ((long) i6);
        int totalSeconds = 0;
        if ((zoneId == f9024 || zoneId.getRules() == f9023) && jM5816 >= 684900000) {
            totalSeconds = 28800;
        } else if (zoneId != ZoneOffset.UTC && !"UTC".equals(zoneId.getId())) {
            totalSeconds = zoneId.getRules().getOffset(LocalDateTime.of(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5, i6, i7))).getTotalSeconds();
        }
        long j = (jM5816 - ((long) totalSeconds)) * 1000;
        return i7 != 0 ? j + ((long) (i7 / 1000000)) : j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m5832(byte b, byte b2, byte b3) {
        return m5824((char) b, (char) b2, (char) b3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static LocalDateTime m5833(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9, char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18, char c19, char c20, char c21, char c22, char c23) {
        if (c >= '0' && c <= '9' && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            int iM142 = (c4 - '0') + AbstractC0053.m142(c3, 48, 10, AbstractC0053.m142(c2, 48, 100, (c - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
            if (c5 >= '0' && c5 <= '9' && c6 >= '0' && c6 <= '9') {
                int i = (c6 - '0') + ((c5 - '0') * 10);
                if (c7 >= '0' && c7 <= '9' && c8 >= '0' && c8 <= '9') {
                    int i2 = (c8 - '0') + ((c7 - '0') * 10);
                    if (c9 >= '0' && c9 <= '9' && c10 >= '0' && c10 <= '9') {
                        int i3 = (c10 - '0') + ((c9 - '0') * 10);
                        if (c11 >= '0' && c11 <= '9' && c12 >= '0' && c12 <= '9') {
                            int i4 = (c12 - '0') + ((c11 - '0') * 10);
                            if (c13 >= '0' && c13 <= '9' && c14 >= '0' && c14 <= '9') {
                                int i5 = (c14 - '0') + ((c13 - '0') * 10);
                                if (c15 >= '0' && c15 <= '9' && c16 >= '0' && c16 <= '9' && c17 >= '0' && c17 <= '9' && c18 >= '0' && c18 <= '9' && c19 >= '0' && c19 <= '9' && c20 >= '0' && c20 <= '9' && c21 >= '0' && c21 <= '9' && c22 >= '0' && c22 <= '9' && c23 >= '0' && c23 <= '9') {
                                    return LocalDateTime.of(iM142, i, i2, i3, i4, i5, (c23 - '0') + AbstractC0053.m142(c22, 48, 10, AbstractC0053.m142(c21, 48, 100, AbstractC0053.m142(c20, 48, DescriptorProtos$Edition.EDITION_2023_VALUE, AbstractC0053.m142(c19, 48, 10000, AbstractC0053.m142(c18, 48, 100000, AbstractC0053.m142(c17, 48, 1000000, AbstractC0053.m142(c16, 48, 10000000, (c15 - '0') * 100000000))))))));
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static LocalTime m5834(int i, int i2, int i3) {
        if ((i | i2 | i3) < 0) {
            return null;
        }
        return LocalTime.of(i, i2, i3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:415:0x08d7, code lost:
    
        if (r10 != 'Z') goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0964, code lost:
    
        if (r14 != 'Z') goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0af6, code lost:
    
        if (r5 != 'Z') goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0c03, code lost:
    
        if (r5 != 'Z') goto L595;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0c79, code lost:
    
        if (r8 != 'Z') goto L652;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0d24, code lost:
    
        if (r13 != 'Z') goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x0f0e, code lost:
    
        if (r10 != 'Z') goto L759;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x088c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x092d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:432:0x093a  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0973  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0a20  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0aa3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0b07  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0b4c  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0bc3  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0bcc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0bd9  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0c11  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0c51  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0d35  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:703:0x0dd1  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0e47  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0e52  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0ee6  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x0f1a  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x0f1d  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x0f53  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x102a  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x102d  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x1036  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x10dc  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x10f4  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.ZonedDateTime m5835(char[] r70, int r71, int r72, java.time.ZoneId r73) {
        /*
            Method dump skipped, instruction units count: 4424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5835(char[], int, int, java.time.ZoneId):java.time.ZonedDateTime");
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x058b, code lost:
    
        if (r8 != 'Z') goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x0a40, code lost:
    
        if (r4 != 'Z') goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0ac7, code lost:
    
        if (r5 != 'Z') goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0b3c, code lost:
    
        if (r1 != 'Z') goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0c2b, code lost:
    
        if (r1 != 'Z') goto L593;
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x0ca3, code lost:
    
        if (r9 != 'Z') goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x0d4c, code lost:
    
        if (r12 != 'Z') goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:778:0x0f47, code lost:
    
        if (r4 != 'Z') goto L762;
     */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x09f8  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x09fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0a4b  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0a92 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0b78  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0beb  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0c3c  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x0c6e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0d22  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0d5a  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0d94  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0df7  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0e7e  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0e8d  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0f09  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0f12 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:761:0x0f1f  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x0f53  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x0f56  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x0f8d  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x0fd0  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x0fda  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x0fdd  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x0ff0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0ff1  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x1064  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x1067  */
    /* JADX WARN: Removed duplicated region for block: B:840:0x1070  */
    /* JADX WARN: Removed duplicated region for block: B:909:0x1116  */
    /* JADX WARN: Removed duplicated region for block: B:914:0x112e  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.time.ZonedDateTime m5836(byte[] r73, int r74, int r75, java.time.ZoneId r76) {
        /*
            Method dump skipped, instruction units count: 4462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5836(byte[], int, int, java.time.ZoneId):java.time.ZonedDateTime");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0167 A[PHI: r11
  0x0167: PHI (r11v10 char) = (r11v9 char), (r11v9 char), (r11v9 char), (r11v18 char) binds: [B:54:0x011f, B:55:0x0121, B:56:0x0123, B:65:0x0165] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0169 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ad A[PHI: r11
  0x01ad: PHI (r11v11 char) = (r11v10 char), (r11v10 char), (r11v10 char), (r11v15 char) binds: [B:66:0x0167, B:67:0x0169, B:68:0x016b, B:77:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01af A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m5837(char[] r25, int r26, java.time.ZoneId r27) {
        /*
            Method dump skipped, instruction units count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5837(char[], int, java.time.ZoneId):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c A[PHI: r11
  0x017c: PHI (r11v12 char) = (r11v11 char), (r11v11 char), (r11v11 char), (r11v20 char) binds: [B:54:0x0134, B:55:0x0136, B:56:0x0138, B:65:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c2 A[PHI: r11
  0x01c2: PHI (r11v13 char) = (r11v12 char), (r11v12 char), (r11v12 char), (r11v17 char) binds: [B:66:0x017c, B:67:0x017e, B:68:0x0180, B:77:0x01c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c4 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m5838(byte[] r25, int r26, java.time.ZoneId r27) {
        /*
            Method dump skipped, instruction units count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5838(byte[], int, java.time.ZoneId):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024c  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m5839(java.lang.String r35, java.time.ZoneId r36, com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern r37) {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2865.m5839(java.lang.String, java.time.ZoneId, com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern):long");
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static long m5840(String str, ZoneId zoneId, DateUtils$DateTimeFormatPattern dateUtils$DateTimeFormatPattern) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        char c;
        char c2;
        char c3;
        char c4;
        char cCharAt6;
        Function function;
        if (str != null && !"null".equals(str)) {
            if (dateUtils$DateTimeFormatPattern.length == 10) {
                boolean z = true;
                int totalSeconds = 0;
                if (AbstractC2853.f8916 == 8) {
                    char[] cArrM5725 = AbstractC2853.m5725(str);
                    if (cArrM5725.length != 10) {
                        throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                    }
                    cCharAt = cArrM5725[0];
                    cCharAt2 = cArrM5725[1];
                    char c5 = cArrM5725[2];
                    cCharAt3 = cArrM5725[3];
                    char c6 = cArrM5725[4];
                    cCharAt4 = cArrM5725[5];
                    char c7 = cArrM5725[6];
                    c4 = cArrM5725[7];
                    cCharAt5 = cArrM5725[8];
                    cCharAt6 = cArrM5725[9];
                    c3 = c5;
                    c2 = c6;
                    c = c7;
                } else {
                    ToIntFunction toIntFunction = AbstractC2853.f8924;
                    if (toIntFunction != null && (function = AbstractC2853.f8925) != null && toIntFunction.applyAsInt(str) == 0) {
                        byte[] bArr = (byte[]) function.apply(str);
                        if (bArr.length != 10) {
                            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                        }
                        cCharAt = (char) bArr[0];
                        cCharAt2 = (char) bArr[1];
                        char c8 = (char) bArr[2];
                        cCharAt3 = (char) bArr[3];
                        char c9 = (char) bArr[4];
                        cCharAt4 = (char) bArr[5];
                        char c10 = (char) bArr[6];
                        char c11 = (char) bArr[7];
                        char c12 = (char) bArr[8];
                        cCharAt6 = (char) bArr[9];
                        c2 = c9;
                        c4 = c11;
                        c = c10;
                        c3 = c8;
                        cCharAt5 = c12;
                    } else {
                        if (str.length() != 10) {
                            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                        }
                        cCharAt = str.charAt(0);
                        cCharAt2 = str.charAt(1);
                        char cCharAt7 = str.charAt(2);
                        cCharAt3 = str.charAt(3);
                        char cCharAt8 = str.charAt(4);
                        cCharAt4 = str.charAt(5);
                        char cCharAt9 = str.charAt(6);
                        char cCharAt10 = str.charAt(7);
                        cCharAt5 = str.charAt(8);
                        c = cCharAt9;
                        c2 = cCharAt8;
                        c3 = cCharAt7;
                        c4 = cCharAt10;
                        cCharAt6 = str.charAt(9);
                    }
                }
                int iOrdinal = dateUtils$DateTimeFormatPattern.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        throw new DateTimeParseException("illegal input", str, 0);
                    }
                    if (c2 != '/' || c4 != '/') {
                        throw new DateTimeParseException("illegal input", str, 0);
                    }
                } else if (c2 != '-' || c4 != '-') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                if (cCharAt < '0' || cCharAt > '9' || cCharAt2 < '0' || cCharAt2 > '9' || c3 < '0' || c3 > '9' || cCharAt3 < '0' || cCharAt3 > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int iM142 = (cCharAt3 - '0') + AbstractC0053.m142(c3, 48, 10, AbstractC0053.m142(cCharAt2, 48, 100, (cCharAt - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
                if (cCharAt4 < '0' || cCharAt4 > '9' || c < '0' || c > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i = (c - '0') + ((cCharAt4 - '0') * 10);
                if ((i == 0 && iM142 != 0) || i > 12) {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                if (cCharAt5 < '0' || cCharAt5 > '9' || cCharAt6 < '0' || cCharAt6 > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i2 = (cCharAt6 - '0') + ((cCharAt5 - '0') * 10);
                int i3 = i != 2 ? (i == 4 || i == 6 || i == 9 || i == 11) ? 30 : 31 : ((iM142 & 3) != 0 || (iM142 % 100 == 0 && iM142 % 400 != 0)) ? 28 : 29;
                if ((i2 == 0 && iM142 != 0) || i2 > i3) {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                if (iM142 == 0 && i == 0 && i2 == 0) {
                    iM142 = 1970;
                    i2 = 1;
                    i = 1;
                }
                long jM5816 = m5816(iM142, i, i2) * 86400;
                if (zoneId != f9024 && zoneId.getRules() != f9023) {
                    z = false;
                }
                if (z && jM5816 >= 684900000) {
                    totalSeconds = 28800;
                } else if (zoneId != ZoneOffset.UTC && !"UTC".equals(zoneId.getId())) {
                    totalSeconds = zoneId.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM142, i, i2), LocalTime.MIN)).getTotalSeconds();
                }
                return (jM5816 - ((long) totalSeconds)) * 1000;
            }
            C5553.m10825();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static String m5841(long j, ZoneId zoneId) {
        long j2;
        int i;
        long jFloorDiv = Math.floorDiv(j, 1000L);
        long jM5812 = jFloorDiv + ((long) ((zoneId == f9024 || zoneId.getRules() == f9023) ? m5812(jFloorDiv) : zoneId.getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds()));
        long jFloorDiv2 = Math.floorDiv(jM5812, 86400L);
        int iFloorMod = (int) Math.floorMod(jM5812, 86400L);
        long j3 = 719468 + jFloorDiv2;
        if (j3 < 0) {
            long j4 = ((jFloorDiv2 + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i2 = (int) j6;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i3 / 10));
        if (j7 < -999999999 || j7 > 999999999) {
            throw new DateTimeException(AbstractC2442.m4572(j7, "Invalid year "));
        }
        int i6 = (int) j7;
        long j8 = iFloorMod;
        if (j8 < 0 || j8 > 86399) {
            throw new DateTimeException(AbstractC2442.m4572(j8, "Invalid secondOfDay "));
        }
        int i7 = (int) (j8 / 3600);
        long j9 = j8 - ((long) (i7 * 3600));
        int i8 = (int) (j9 / 60);
        int i9 = (int) (j9 - ((long) (i8 * 60)));
        int iFloorMod2 = (int) Math.floorMod(j, 1000L);
        if (iFloorMod2 == 0) {
            i = 0;
        } else {
            i = 4;
            if (iFloorMod2 >= 10) {
                if (iFloorMod2 % 100 == 0) {
                    i = 2;
                } else if (iFloorMod2 % 10 == 0) {
                    i = 3;
                }
            }
        }
        int i10 = i + 19;
        if (AbstractC2853.f8921 != null) {
            char[] cArr = new char[i10];
            AbstractC2848.m5665(cArr, 0, i6, i4, i5);
            cArr[10] = ' ';
            AbstractC2848.m5674(cArr, 11, i7, i8, i9);
            if (i > 0) {
                cArr[19] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                for (int i11 = 20; i11 < i10; i11++) {
                    cArr[i11] = '0';
                }
                if (iFloorMod2 < 10) {
                    AbstractC2848.m5687(iFloorMod2, i10, cArr);
                } else if (iFloorMod2 % 100 == 0) {
                    AbstractC2848.m5687(iFloorMod2 / 100, i10, cArr);
                } else if (iFloorMod2 % 10 == 0) {
                    AbstractC2848.m5687(iFloorMod2 / 10, i10, cArr);
                } else {
                    AbstractC2848.m5687(iFloorMod2, i10, cArr);
                }
            }
            return (String) AbstractC2853.f8921.apply(cArr, Boolean.TRUE);
        }
        byte[] bArr = new byte[i10];
        AbstractC2848.m5666(bArr, 0, i6, i4, i5);
        bArr[10] = 32;
        AbstractC2848.m5673(bArr, 11, i7, i8, i9);
        if (i > 0) {
            bArr[19] = 46;
            for (int i12 = 20; i12 < i10; i12++) {
                bArr[i12] = 48;
            }
            if (iFloorMod2 < 10) {
                AbstractC2848.m5691(iFloorMod2, bArr, i10);
            } else if (iFloorMod2 % 100 == 0) {
                AbstractC2848.m5691(iFloorMod2 / 100, bArr, i10);
            } else if (iFloorMod2 % 10 == 0) {
                AbstractC2848.m5691(iFloorMod2 / 10, bArr, i10);
            } else {
                AbstractC2848.m5691(iFloorMod2, bArr, i10);
            }
        }
        BiFunction biFunction = AbstractC2853.f8920;
        return biFunction != null ? (String) biFunction.apply(bArr, (byte) 0) : new String(bArr, 0, i10, StandardCharsets.ISO_8859_1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static int m5842(int i, byte[] bArr, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = bArr[i2 + i4] - 48;
            if ((i5 < 0) || (i5 > 9)) {
                return -1;
            }
            i3 = (i3 * 10) + i5;
        }
        return i3 * f9028[(9 - i) & 15];
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static int m5843(byte[] bArr, int i) {
        short sReverseBytes = AbstractC2853.f8919.getShort(bArr, AbstractC2853.f8918 + ((long) i));
        if (AbstractC2853.f8929) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        int i2 = sReverseBytes & 3855;
        if (((61680 & (i2 + 1542)) | ((sReverseBytes & 61680) - 12336)) != 0) {
            return -1;
        }
        return ((i2 >> 8) * 100) + ((sReverseBytes & 15) * DescriptorProtos$Edition.EDITION_2023_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static long m5844(byte[] bArr, int i) {
        long jReverseBytes = AbstractC2853.f8919.getLong(bArr, AbstractC2853.f8918 + ((long) i));
        if (AbstractC2853.f8929) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        if ((280375481794560L & jReverseBytes) != 49478026199040L) {
            return -1L;
        }
        if ((((-1085366475377544976L) & ((1085086099895750415L & jReverseBytes) + 434034439958300166L)) | ((jReverseBytes & (-1085366475377544976L)) - 3472275519666401328L)) != 0) {
            return -1L;
        }
        long j = 4222124902318095L & jReverseBytes;
        return (j << 3) + (j << 1) + ((jReverseBytes & 1080863974993432320L) >> 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static ZonedDateTime m5845(String str) {
        if (str.endsWith(" CST")) {
            DateTimeFormatter dateTimeFormatterOfPattern = f9026;
            if (dateTimeFormatterOfPattern == null) {
                dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEEE, dd-MMM-yyyy HH:mm:ss", Locale.ENGLISH);
                f9026 = dateTimeFormatterOfPattern;
            }
            return ZonedDateTime.of(LocalDateTime.parse(str.substring(0, str.length() - 4), dateTimeFormatterOfPattern), f9024);
        }
        DateTimeFormatter dateTimeFormatterOfPattern2 = f9027;
        if (dateTimeFormatterOfPattern2 == null) {
            dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("EEEE, dd-MMM-yyyy HH:mm:ss zzz", Locale.ENGLISH);
            f9027 = dateTimeFormatterOfPattern2;
        }
        return ZonedDateTime.parse(str, dateTimeFormatterOfPattern2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static int m5846(int i, int i2, char[] cArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = cArr[i2 + i4] - '0';
            if ((i5 < 0) || (i5 > 9)) {
                return -1;
            }
            i3 = (i3 * 10) + i5;
        }
        return i3 * f9028[(9 - i) & 15];
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static LocalTime m5847(byte[] bArr, int i) {
        int iM5677;
        int iM56772;
        int iM5675;
        int i2 = i + 5;
        if (i2 > bArr.length) {
            return null;
        }
        byte b = bArr[i + 1];
        int i3 = i + 4;
        byte b2 = bArr[i3];
        int i4 = i + 2;
        if (bArr[i4] == 58 && b2 == 58) {
            iM5677 = AbstractC2848.m5675(bArr, i);
            iM56772 = AbstractC2848.m5677(bArr, i + 3);
            iM5675 = AbstractC2848.m5677(bArr, i2);
        } else if (b == 58 && b2 == 58) {
            iM5677 = AbstractC2848.m5677(bArr, i);
            iM56772 = AbstractC2848.m5675(bArr, i4);
            iM5675 = AbstractC2848.m5677(bArr, i2);
        } else {
            if (b != 58 || bArr[i + 3] != 58) {
                return null;
            }
            iM5677 = AbstractC2848.m5677(bArr, i);
            iM56772 = AbstractC2848.m5677(bArr, i4);
            iM5675 = AbstractC2848.m5675(bArr, i3);
        }
        return m5834(iM5677, iM56772, iM5675);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static LocalTime m5848(byte[] bArr, int i) {
        int iM5677;
        int iM5675;
        int iM56752;
        if (i + 5 > bArr.length) {
            return null;
        }
        int i2 = i + 2;
        if (bArr[i2] == 58) {
            iM56752 = AbstractC2848.m5675(bArr, i);
            iM5675 = AbstractC2848.m5675(bArr, i + 3);
            iM5677 = 0;
        } else {
            if (bArr[i + 1] != 58 || bArr[i + 3] != 58) {
                return null;
            }
            int iM56772 = AbstractC2848.m5677(bArr, i);
            int iM56773 = AbstractC2848.m5677(bArr, i2);
            iM5677 = AbstractC2848.m5677(bArr, i + 4);
            iM5675 = iM56773;
            iM56752 = iM56772;
        }
        return m5834(iM56752, iM5675, iM5677);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static LocalTime m5849(byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            return null;
        }
        long jM5830 = m5830(bArr, i);
        if (jM5830 == -1) {
            return null;
        }
        return LocalTime.of(((int) jM5830) & Opcodes.CONST_METHOD_TYPE, ((int) (jM5830 >> 24)) & Opcodes.CONST_METHOD_TYPE, ((int) (jM5830 >> 48)) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static long m5850(String str, ZoneId zoneId) {
        int i;
        int iM5676;
        char c;
        Function function;
        int i2;
        int iM5675;
        char c2;
        AbstractC2898 c2902;
        ZoneId zoneId2 = zoneId;
        if (str == null) {
            return 0L;
        }
        ToIntFunction toIntFunction = AbstractC2853.f8924;
        long j = 1;
        if (toIntFunction == null || (function = AbstractC2853.f8925) == null || toIntFunction.applyAsInt(str) != 0) {
            char[] cArrM5725 = AbstractC2853.m5725(str);
            int length = cArrM5725.length;
            if (length == 0) {
                return 0L;
            }
            if (length == 4 && AbstractC2848.m5684(0, cArrM5725) == AbstractC2848.f8876) {
                return 0L;
            }
            char c3 = cArrM5725[0];
            if (c3 != '\"' || cArrM5725[length - 1] != '\"') {
                if (length == 19) {
                    return m5837(cArrM5725, 0, zoneId2);
                }
                if (length > 19 || (length == 16 && ((c = cArrM5725[10]) == '+' || c == '-'))) {
                    ZonedDateTime zonedDateTimeM5835 = m5835(cArrM5725, 0, length, zoneId2);
                    if (zonedDateTimeM5835 != null) {
                        return zonedDateTimeM5835.toInstant().toEpochMilli();
                    }
                    String str2 = new String(cArrM5725, 0, length);
                    throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                }
                if (c3 == '-' || (c3 >= '0' && c3 <= '9')) {
                    short s = AbstractC2848.f8881;
                    if (length > 0) {
                        for (int i3 = 0; i3 < length; i3++) {
                            char c4 = cArrM5725[i3];
                            if (c4 == '+' || c4 == '-') {
                                if (i3 == 0 && length != 1) {
                                }
                            } else if (c4 >= '0' && c4 <= '9') {
                            }
                        }
                        Class cls = AbstractC2866.f9049;
                        char c5 = cArrM5725[0];
                        if (AbstractC2848.m5645(c5)) {
                            j = '0' - c5;
                        } else if (length != 1 && (c5 == '-' || c5 == '+')) {
                            j = 0;
                        }
                        int i4 = 1;
                        while (true) {
                            i = i4 + 1;
                            if (i >= length || (iM5676 = AbstractC2848.m5676(i4, cArrM5725)) == -1) {
                                break;
                            }
                            if (!(-92233720368547758L <= j) || !(j <= 0)) {
                                break;
                            }
                            j = (j * 100) - ((long) iM5676);
                            i4 += 2;
                        }
                        if (i4 < length) {
                            char c6 = cArrM5725[i4];
                            if (AbstractC2848.m5645(c6)) {
                                if ((-922337203685477580L <= j) & (j <= 0)) {
                                    j = ((j * 10) + 48) - ((long) c6);
                                    i4 = i;
                                }
                            }
                        }
                        long j2 = j;
                        if (!((i4 == length) & (j2 <= 0)) || !(Long.MIN_VALUE < j2 || c5 == '-')) {
                            throw new NumberFormatException("parseInt error ".concat(new String(cArrM5725, i4, length)));
                        }
                        if (c5 != '-') {
                            j2 = -j2;
                        }
                        if (length == 8 && j2 >= 19700101 && j2 <= 21000101) {
                            int i5 = (int) j2;
                            int i6 = i5 / 10000;
                            int i7 = (i5 % 10000) / 100;
                            int i8 = i5 % 100;
                            if (i7 >= 1 && i7 <= 12) {
                                if (i8 <= (i7 != 2 ? (i7 == 4 || i7 == 6 || i7 == 9 || i7 == 11) ? 30 : 31 : ((i6 & 3) != 0 || (i6 % 100 == 0 && i6 % 400 != 0)) ? 28 : 29)) {
                                    return ZonedDateTime.ofLocal(LocalDateTime.of(i6, i7, i8, 0, 0, 0), zoneId2, null).toEpochSecond() * 1000;
                                }
                            }
                        }
                        return j2;
                    }
                }
                if (cArrM5725[length - 1] == 'Z') {
                    length--;
                    zoneId2 = ZoneOffset.UTC;
                }
                LocalDateTime localDateTimeM5803 = m5803(length, cArrM5725);
                if (localDateTimeM5803 == null && AbstractC2848.m5686(0, cArrM5725) == 13511005043687472L && AbstractC2848.m5686(4, cArrM5725) == 12666580113555501L && AbstractC2848.m5689(8, cArrM5725) == 3145776) {
                    localDateTimeM5803 = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
                }
                if (localDateTimeM5803 == null) {
                    String str3 = new String(cArrM5725, 0, length);
                    throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
                }
                long epochSecond = ZonedDateTime.ofLocal(localDateTimeM5803, zoneId2, null).toEpochSecond();
                int nano = localDateTimeM5803.getNano();
                return (epochSecond >= 0 || nano <= 0) ? (epochSecond * 1000) + ((long) (nano / 1000000)) : (((epochSecond + 1) * 1000) + ((long) (nano / 1000000))) - 1000;
            }
            boolean[] zArr = AbstractC2898.f9177;
            C2900 c2900 = new C2900(AbstractC2932.m6331(), null, cArrM5725, length);
            try {
                long time = C2740.f8376.m5493(c2900).getTime();
                c2900.close();
                return time;
            } finally {
            }
        } else {
            byte[] bArr = (byte[]) function.apply(str);
            int length2 = bArr.length;
            Charset charset = StandardCharsets.ISO_8859_1;
            if (length2 == 0) {
                return 0L;
            }
            if (length2 == 4 && AbstractC2848.m5647(bArr, 0)) {
                return 0L;
            }
            char c7 = (char) bArr[0];
            if (c7 != '\"' || bArr[length2 - 1] != 34) {
                if (length2 == 19) {
                    return m5838(bArr, 0, zoneId2);
                }
                if (length2 > 19 || (length2 == 16 && ((c2 = (char) bArr[10]) == '+' || c2 == '-'))) {
                    ZonedDateTime zonedDateTimeM5836 = m5836(bArr, 0, length2, zoneId2);
                    if (zonedDateTimeM5836 != null) {
                        return zonedDateTimeM5836.toInstant().toEpochMilli();
                    }
                    String str4 = new String(bArr, 0, length2);
                    throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
                }
                if (c7 == '-' || (c7 >= '0' && c7 <= '9')) {
                    short s2 = AbstractC2848.f8881;
                    if (length2 > 0) {
                        for (int i9 = 0; i9 < length2; i9++) {
                            char c8 = (char) bArr[i9];
                            if (c8 == '+' || c8 == '-') {
                                if (i9 == 0 && length2 != 1) {
                                }
                            } else if (c8 >= '0' && c8 <= '9') {
                            }
                        }
                        Class cls2 = AbstractC2866.f9049;
                        byte b = bArr[0];
                        if (AbstractC2848.m5645(b)) {
                            j = 48 - b;
                        } else if (length2 != 1 && (b == 45 || b == 43)) {
                            j = 0;
                        }
                        int i10 = 1;
                        while (true) {
                            i2 = i10 + 1;
                            if (i2 >= length2 || (iM5675 = AbstractC2848.m5675(bArr, i10)) == -1) {
                                break;
                            }
                            if (!(-92233720368547758L <= j) || !(j <= 0)) {
                                break;
                            }
                            j = (j * 100) - ((long) iM5675);
                            i10 += 2;
                        }
                        if (i10 < length2) {
                            byte b2 = bArr[i10];
                            if (AbstractC2848.m5645(b2)) {
                                if ((-922337203685477580L <= j) & (j <= 0)) {
                                    j = ((j * 10) + 48) - ((long) b2);
                                    i10 = i2;
                                }
                            }
                        }
                        long j3 = j;
                        if (!((i10 == length2) & (j3 <= 0)) || !(Long.MIN_VALUE < j3 || b == 45)) {
                            throw new NumberFormatException("parseInt error ".concat(new String(bArr, i10, length2)));
                        }
                        if (b != 45) {
                            j3 = -j3;
                        }
                        if (length2 == 8 && j3 >= 19700101 && j3 <= 21000101) {
                            int i11 = (int) j3;
                            int i12 = i11 / 10000;
                            int i13 = (i11 % 10000) / 100;
                            int i14 = i11 % 100;
                            if (i13 >= 1 && i13 <= 12) {
                                if (i14 <= (i13 != 2 ? (i13 == 4 || i13 == 6 || i13 == 9 || i13 == 11) ? 30 : 31 : ((i12 & 3) != 0 || (i12 % 100 == 0 && i12 % 400 != 0)) ? 28 : 29)) {
                                    return ZonedDateTime.ofLocal(LocalDateTime.of(i12, i13, i14, 0, 0, 0), zoneId2, null).toEpochSecond() * 1000;
                                }
                            }
                        }
                        return j3;
                    }
                }
                if (((char) bArr[length2 - 1]) == 'Z') {
                    zoneId2 = ZoneOffset.UTC;
                }
                LocalDateTime localDateTimeM5802 = m5802(bArr, length2);
                if (localDateTimeM5802 == null && AbstractC2848.m5683(bArr, 0) == 3256155501228994608L && AbstractC2848.m5652(bArr, 8) == 12336) {
                    localDateTimeM5802 = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
                }
                long epochSecond2 = ZonedDateTime.ofLocal(localDateTimeM5802, zoneId2, null).toEpochSecond();
                int nano2 = localDateTimeM5802.getNano();
                return (epochSecond2 >= 0 || nano2 <= 0) ? (epochSecond2 * 1000) + ((long) (nano2 / 1000000)) : (((epochSecond2 + 1) * 1000) + ((long) (nano2 / 1000000))) - 1000;
            }
            boolean[] zArr2 = AbstractC2898.f9177;
            C2942 c2942M6331 = AbstractC2932.m6331();
            if (charset == StandardCharsets.UTF_8) {
                c2902 = C2901.m6214(length2, c2942M6331, bArr);
            } else if (charset == StandardCharsets.UTF_16) {
                c2902 = new C2900(length2, c2942M6331, bArr);
            } else {
                Charset charset2 = StandardCharsets.US_ASCII;
                c2902 = new C2902(c2942M6331, null, bArr, length2);
            }
            try {
                long time2 = C2740.f8376.m5493(c2902).getTime();
                c2902.close();
                return time2;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static LocalTime m5851(byte[] bArr, int i) {
        int iM5675;
        int iM5677;
        int iM56772;
        int i2 = i + 5;
        if (i2 > bArr.length) {
            return null;
        }
        int i3 = i + 2;
        byte b = bArr[i3];
        byte b2 = bArr[i + 4];
        if (bArr[i + 1] == 58 && b2 == 58) {
            iM56772 = AbstractC2848.m5677(bArr, i);
            iM5675 = AbstractC2848.m5675(bArr, i3);
            iM5677 = AbstractC2848.m5675(bArr, i2);
        } else if (b == 58 && b2 == 58) {
            int iM56752 = AbstractC2848.m5675(bArr, i);
            int iM56773 = AbstractC2848.m5677(bArr, i + 3);
            iM5677 = AbstractC2848.m5675(bArr, i2);
            iM5675 = iM56773;
            iM56772 = iM56752;
        } else {
            if (b != 58 || bArr[i2] != 58) {
                return null;
            }
            int iM56753 = AbstractC2848.m5675(bArr, i);
            iM5675 = AbstractC2848.m5675(bArr, i + 3);
            iM5677 = AbstractC2848.m5677(bArr, i + 6);
            iM56772 = iM56753;
        }
        return m5834(iM56772, iM5675, iM5677);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static LocalTime m5852(int i, char[] cArr) {
        if (i + 8 <= cArr.length && cArr[i + 2] == ':' && cArr[i + 5] == ':') {
            return m5834(AbstractC2848.m5676(i, cArr), AbstractC2848.m5676(i + 3, cArr), AbstractC2848.m5676(i + 6, cArr));
        }
        return null;
    }
}
