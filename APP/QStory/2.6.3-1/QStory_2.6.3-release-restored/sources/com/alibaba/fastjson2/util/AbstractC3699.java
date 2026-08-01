package com.alibaba.fastjson2.util;

import androidx.activity.AbstractC0900;
import androidx.profileinstaller.AbstractC3275;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.AbstractC3766;
import com.alibaba.fastjson2.C3734;
import com.alibaba.fastjson2.C3735;
import com.alibaba.fastjson2.C3736;
import com.alibaba.fastjson2.C3776;
import com.alibaba.fastjson2.reader.C3574;
import com.android.p002dx.p005io.Opcodes;
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
import java.util.TimeZone;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static DateTimeFormatter f9367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final LocalDate f9368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ZoneId f9369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ZoneRules f9370;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ZoneId f9371;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ZoneId f9372;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static DateTimeFormatter f9373;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static DateTimeFormatter f9374;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final int[] f9375;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static DateTimeFormatter f9376;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final int f9377;

    static {
        int iM6417;
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        f9372 = zoneIdSystemDefault;
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
        f9371 = zoneIdSystemDefault;
        f9370 = rules;
        f9369 = ZoneId.of("+08:00");
        f9368 = LocalDate.of(1970, 1, 1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        ZoneId zoneId = f9372;
        long jFloorDiv = Math.floorDiv(jCurrentTimeMillis, 1000L);
        if (zoneId == zoneIdSystemDefault || zoneId.getRules() == rules) {
            iM6417 = m6417(jFloorDiv);
        } else {
            iM6417 = zoneId.getRules().getOffset(Instant.ofEpochMilli(jCurrentTimeMillis)).getTotalSeconds();
        }
        f9377 = (int) Math.floorDiv(jFloorDiv + ((long) iM6417), 86400L);
        f9375 = new int[]{1, 10, 100, DescriptorProtos$Edition.EDITION_2023_VALUE, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 0, 0, 0, 0, 0, 0};
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public static LocalTime m6392(byte[] bArr, int i) {
        if (i + 15 <= bArr.length) {
            long jM6435 = m6435(bArr, i);
            if (jM6435 != -1 && bArr[i + 8] == 46) {
                int i2 = ((int) jM6435) & Opcodes.CONST_METHOD_TYPE;
                int i3 = ((int) (jM6435 >> 24)) & Opcodes.CONST_METHOD_TYPE;
                int i4 = ((int) (jM6435 >> 48)) & Opcodes.CONST_METHOD_TYPE;
                int iM6447 = m6447(6, bArr, i + 9);
                if (iM6447 < 0) {
                    return null;
                }
                return LocalTime.of(i2, i3, i4, iM6447);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public static LocalTime m6393(byte[] bArr, int i) {
        if (i + 18 <= bArr.length) {
            long jM6435 = m6435(bArr, i);
            if (jM6435 != -1 && bArr[i + 8] == 46) {
                int i2 = ((int) jM6435) & Opcodes.CONST_METHOD_TYPE;
                int i3 = ((int) (jM6435 >> 24)) & Opcodes.CONST_METHOD_TYPE;
                int i4 = ((int) (jM6435 >> 48)) & Opcodes.CONST_METHOD_TYPE;
                int iM6447 = m6447(9, bArr, i + 9);
                if (iM6447 < 0) {
                    return null;
                }
                return LocalTime.of(i2, i3, i4, iM6447);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public static LocalTime m6394(byte[] bArr, int i) {
        if (i + 10 > bArr.length || bArr[i + 2] != 58 || bArr[i + 5] != 58 || bArr[i + 8] != 46) {
            return null;
        }
        int iM6280 = AbstractC3682.m6280(bArr, i);
        int iM62802 = AbstractC3682.m6280(bArr, i + 3);
        int iM62803 = AbstractC3682.m6280(bArr, i + 6);
        int iM6282 = AbstractC3682.m6282(bArr, i + 9);
        if (iM6282 > 0) {
            iM6282 *= 100000000;
        }
        if ((iM6280 | iM62802 | iM62803 | iM62802) < 0) {
            return null;
        }
        return LocalTime.of(iM6280, iM62802, iM62803, iM6282);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public static LocalDateTime m6395(int i, byte[] bArr, int i2) {
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
            return m6438(c17, c13, c19, c20, c22, c23, c2, c3, c4, c9, c10, c32, c11, c12, c, c37, c14, c15, c16, c5, c6, c7, c8);
        }
        int i3 = i + i2;
        if (bArr[i3 - 15] != 45 || bArr[i3 - 12] != 45) {
            return null;
        }
        byte b = bArr[i3 - 9];
        if ((b == 32 || b == 84) && bArr[i3 - 6] == 58 && bArr[i3 - 3] == 58) {
            return LocalDateTime.of(AbstractC3700.m6491(i, bArr, i2 - 15), AbstractC3700.m6491(i3 - 14, bArr, 2), AbstractC3700.m6491(i3 - 11, bArr, 2), AbstractC3700.m6491(i3 - 8, bArr, 2), AbstractC3700.m6491(i3 - 5, bArr, 2), AbstractC3700.m6491(i3 - 2, bArr, 2));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public static LocalTime m6396(byte[] bArr, int i) {
        if (i + 12 > bArr.length) {
            return null;
        }
        long jM6435 = m6435(bArr, i);
        if (jM6435 == -1 || bArr[i + 8] != 46) {
            return null;
        }
        int i2 = ((int) jM6435) & Opcodes.CONST_METHOD_TYPE;
        int i3 = ((int) (jM6435 >> 24)) & Opcodes.CONST_METHOD_TYPE;
        int i4 = ((int) (jM6435 >> 48)) & Opcodes.CONST_METHOD_TYPE;
        int iM6300 = (AbstractC3682.m6300(bArr, i + 11) << 16) | AbstractC3682.m6257(bArr, i + 9);
        int i5 = 986895 & iM6300;
        int i6 = ((15790320 & (394758 + i5)) | ((iM6300 & 15790320) - 3158064)) != 0 ? -1 : ((((iM6300 & 15) * 10) + ((i5 >> 8) & 15)) * 10) + (i5 >> 16);
        if (i6 > 0) {
            i6 *= 1000000;
        }
        return LocalTime.of(i2, i3, i4, i6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public static LocalTime m6397(byte[] bArr, int i) {
        if (i + 11 > bArr.length) {
            return null;
        }
        long jM6435 = m6435(bArr, i);
        if (jM6435 == -1 || bArr[i + 8] != 46) {
            return null;
        }
        int i2 = ((int) jM6435) & Opcodes.CONST_METHOD_TYPE;
        int i3 = ((int) (jM6435 >> 24)) & Opcodes.CONST_METHOD_TYPE;
        int i4 = ((int) (jM6435 >> 48)) & Opcodes.CONST_METHOD_TYPE;
        int iM6280 = AbstractC3682.m6280(bArr, i + 9);
        if (iM6280 > 0) {
            iM6280 *= 10000000;
        }
        return LocalTime.of(i2, i3, i4, iM6280);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public static LocalDateTime m6398(byte[] bArr, int i) {
        if (i + 19 <= bArr.length && bArr[i + 2] == 32 && bArr[i + 6] == 32 && bArr[i + 11] == 32) {
            long jM6435 = m6435(bArr, i + 12);
            if (jM6435 != -1) {
                int iM6280 = AbstractC3682.m6280(bArr, i);
                int iM6437 = m6437(bArr[i + 3], bArr[i + 4], bArr[i + 5]);
                int iM6298 = AbstractC3682.m6298(bArr, i + 7);
                int i2 = ((int) jM6435) & Opcodes.CONST_METHOD_TYPE;
                int i3 = ((int) (jM6435 >> 24)) & Opcodes.CONST_METHOD_TYPE;
                int i4 = ((int) (jM6435 >> 48)) & Opcodes.CONST_METHOD_TYPE;
                if ((iM6298 | iM6437 | iM6280 | i2 | i3 | i4) > 0 && i2 <= 24 && i3 <= 59 && i4 <= 60) {
                    return LocalDateTime.of(iM6298, iM6437, iM6280, i2, i3, i4);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public static LocalDateTime m6399(int i, int i2, char[] cArr) {
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
            return m6438(c10, c19, c20, c21, c23, c24, c26, c27, c29, c, c32, c2, c35, c3, c12, c4, c6, c11, c13, c5, c9, c7, c8);
        }
        int i3 = i + i2;
        if (cArr[i3 - 15] != '-' || cArr[i3 - 12] != '-') {
            return null;
        }
        char c60 = cArr[i3 - 9];
        if ((c60 == ' ' || c60 == 'T') && cArr[i3 - 6] == ':' && cArr[i3 - 3] == ':') {
            return LocalDateTime.of(AbstractC3700.m6490(i, i2 - 15, cArr), AbstractC3700.m6490(i3 - 14, 2, cArr), AbstractC3700.m6490(i3 - 11, 2, cArr), AbstractC3700.m6490(i3 - 8, 2, cArr), AbstractC3700.m6490(i3 - 5, 2, cArr), AbstractC3700.m6490(i3 - 2, 2, cArr));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static LocalDateTime m6400(int i, char[] cArr) {
        int iM6281;
        int iM62812;
        int iM6283;
        int iM6429;
        int iM6299;
        int iM62813;
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
            iM6299 = AbstractC3682.m6299(i, cArr);
            iM6429 = AbstractC3682.m6281(i3, cArr);
            iM6283 = AbstractC3682.m6281(i + 8, cArr);
            iM62812 = AbstractC3682.m6281(i + 11, cArr);
            iM6281 = AbstractC3682.m6281(i + 14, cArr);
            iM62813 = AbstractC3682.m6281(i + 17, cArr);
        } else if (c2 == '/' && c5 == '/' && ((c7 == ' ' || c7 == 'T') && c8 == ':' && c9 == ':')) {
            iM6283 = AbstractC3682.m6281(i, cArr);
            iM6429 = AbstractC3682.m6281(i2, cArr);
            iM6299 = AbstractC3682.m6299(i + 6, cArr);
            iM62812 = AbstractC3682.m6281(i + 11, cArr);
            iM6281 = AbstractC3682.m6281(i + 14, cArr);
            iM62813 = AbstractC3682.m6281(i + 17, cArr);
        } else {
            if (c != ' ' || c5 != ' ' || c7 != ' ' || c8 != ':' || c9 != ':') {
                return null;
            }
            iM6283 = AbstractC3682.m6283(i, cArr);
            iM6429 = m6429(c2, c3, c4);
            iM6299 = AbstractC3682.m6299(i + 6, cArr);
            iM62812 = AbstractC3682.m6281(i + 11, cArr);
            iM6281 = AbstractC3682.m6281(i + 14, cArr);
            iM62813 = AbstractC3682.m6281(i + 17, cArr);
        }
        int i4 = iM62813;
        int i5 = iM6299;
        int i6 = iM6429;
        int i7 = iM6283;
        int i8 = iM62812;
        int i9 = iM6281;
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
    */
    public static LocalDateTime m6401(byte[] bArr, int i) {
        int i2;
        byte b;
        byte b2;
        byte b3;
        int i3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        byte b8;
        int i4;
        int i5;
        int iM6280;
        int iM6437;
        int iM6298;
        int iM6282;
        int iM62822;
        int iM62802;
        if (i + 18 > bArr.length) {
            String str = new String(bArr, i, bArr.length - i);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        byte b9 = bArr[i + 1];
        byte b10 = bArr[i + 2];
        byte b11 = bArr[i + 3];
        byte b12 = bArr[i + 4];
        int i6 = i + 5;
        byte b13 = bArr[i6];
        int i7 = i + 6;
        byte b14 = bArr[i7];
        int i8 = i + 7;
        byte b15 = bArr[i8];
        byte b16 = bArr[i + 9];
        int i9 = i + 10;
        byte b17 = bArr[i9];
        int i10 = i + 11;
        byte b18 = bArr[i10];
        int i11 = i + 12;
        byte b19 = bArr[i11];
        int i12 = i + 13;
        byte b20 = bArr[i12];
        int i13 = i + 14;
        byte b21 = bArr[i13];
        int i14 = i + 15;
        byte b22 = bArr[i14];
        int i15 = i + 16;
        byte b23 = bArr[i15];
        if (b12 == 45 && b14 == 45 && ((b16 == 32 || b16 == 84) && b19 == 58 && b22 == 58)) {
            iM6298 = AbstractC3682.m6298(bArr, i);
            iM6437 = AbstractC3682.m6282(bArr, i6);
            iM6280 = AbstractC3682.m6280(bArr, i8);
            iM6282 = AbstractC3682.m6280(bArr, i9);
            iM62822 = AbstractC3682.m6280(bArr, i12);
            iM62802 = AbstractC3682.m6280(bArr, i15);
        } else if (b12 == 45 && b15 == 45 && ((b16 == 32 || b16 == 84) && b19 == 58 && b22 == 58)) {
            iM6298 = AbstractC3682.m6298(bArr, i);
            iM6437 = AbstractC3682.m6280(bArr, i6);
            iM6280 = AbstractC3682.m6282(bArr, i + 8);
            iM6282 = AbstractC3682.m6280(bArr, i9);
            iM62822 = AbstractC3682.m6280(bArr, i12);
            iM62802 = AbstractC3682.m6280(bArr, i15);
        } else if (b12 == 45 && b15 == 45 && ((b17 == 32 || b17 == 84) && b19 == 58 && b22 == 58)) {
            iM6298 = AbstractC3682.m6298(bArr, i);
            iM6437 = AbstractC3682.m6280(bArr, i6);
            iM6280 = AbstractC3682.m6280(bArr, i + 8);
            iM6282 = AbstractC3682.m6282(bArr, i10);
            iM62822 = AbstractC3682.m6280(bArr, i12);
            iM62802 = AbstractC3682.m6280(bArr, i15);
        } else {
            if (b12 == 45 && b15 == 45 && (b17 == 32 || b17 == 84)) {
                b = b20;
                if (b == 58 && b22 == 58) {
                    iM6298 = AbstractC3682.m6298(bArr, i);
                    iM6437 = AbstractC3682.m6280(bArr, i6);
                    iM6280 = AbstractC3682.m6280(bArr, i + 8);
                    iM6282 = AbstractC3682.m6280(bArr, i10);
                    iM62822 = AbstractC3682.m6282(bArr, i13);
                    iM62802 = AbstractC3682.m6280(bArr, i15);
                } else {
                    i2 = i13;
                }
            } else {
                i2 = i13;
                b = b20;
            }
            if (b12 != 45 || b15 != 45) {
                b2 = b23;
                b3 = b9;
                if (b3 == 32) {
                    b6 = b13;
                    if (b6 == 32 && b17 == 32 && b19 == 58 && b22 == 58) {
                        iM6280 = AbstractC3682.m6282(bArr, i);
                        iM6437 = m6437(b10, b11, b12);
                        iM6298 = AbstractC3682.m6298(bArr, i7);
                        iM6282 = AbstractC3682.m6282(bArr, i10);
                        iM62822 = AbstractC3682.m6280(bArr, i12);
                        iM62802 = AbstractC3682.m6280(bArr, i15);
                    } else {
                        i3 = i7;
                        b4 = b10;
                        b5 = b11;
                    }
                } else {
                    i3 = i7;
                    b4 = b10;
                    b5 = b11;
                    b6 = b13;
                }
                b7 = 32;
                if (b3 == 32 && b6 == 32 && b17 == 32) {
                    if (b == 58 && b22 == 58) {
                        iM6280 = AbstractC3682.m6282(bArr, i);
                        iM6437 = m6437(b4, b5, b12);
                        iM6298 = AbstractC3682.m6298(bArr, i3);
                        iM6282 = AbstractC3682.m6280(bArr, i10);
                        iM62822 = AbstractC3682.m6282(bArr, i2);
                        iM62802 = AbstractC3682.m6280(bArr, i15);
                    } else {
                        b7 = 32;
                        if (b3 != b7) {
                            if (b4 == b7) {
                            }
                        }
                    }
                } else if (b3 != b7 || b6 != b7 || b17 != b7) {
                    if (b4 == b7 && b14 == b7) {
                        b8 = b18;
                        if (b8 == b7) {
                            if (b21 == 58 && b2 == 58) {
                                iM6280 = AbstractC3682.m6280(bArr, i);
                                iM6437 = m6437(b5, b12, b6);
                                iM6298 = AbstractC3682.m6298(bArr, i8);
                                iM6282 = AbstractC3682.m6280(bArr, i11);
                                iM62822 = AbstractC3682.m6282(bArr, i14);
                                iM62802 = AbstractC3682.m6282(bArr, i + 17);
                            } else {
                                i4 = i11;
                                i5 = i8;
                                b7 = 32;
                            }
                        }
                        if (b4 == b7 && b14 == b7 && b8 == b7) {
                            if (b != 58 || b2 != 58) {
                                b7 = 32;
                                if (b4 == b7) {
                                }
                                String str2 = new String(bArr, i, 18);
                                throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                            }
                            iM6280 = AbstractC3682.m6280(bArr, i);
                            iM6437 = m6437(b5, b12, b6);
                            iM6298 = AbstractC3682.m6298(bArr, i5);
                            iM6282 = AbstractC3682.m6282(bArr, i4);
                            iM62822 = AbstractC3682.m6280(bArr, i2);
                            iM62802 = AbstractC3682.m6282(bArr, i + 17);
                        } else {
                            if (b4 == b7 || b14 != b7 || b8 != b7 || b != 58 || b22 != 58) {
                                String str22 = new String(bArr, i, 18);
                                throw new DateTimeParseException("illegal input ".concat(str22), str22, 0);
                            }
                            iM6280 = AbstractC3682.m6280(bArr, i);
                            iM6437 = m6437(b5, b12, b6);
                            iM6298 = AbstractC3682.m6298(bArr, i5);
                            iM6282 = AbstractC3682.m6282(bArr, i4);
                            iM62822 = AbstractC3682.m6282(bArr, i2);
                            iM62802 = AbstractC3682.m6280(bArr, i15);
                        }
                    } else {
                        b8 = b18;
                    }
                    i4 = i11;
                    i5 = i8;
                    if (b4 == b7) {
                        if (b4 == b7) {
                        }
                        String str222 = new String(bArr, i, 18);
                        throw new DateTimeParseException("illegal input ".concat(str222), str222, 0);
                    }
                } else if (b == 58 && b2 == 58) {
                    iM6280 = AbstractC3682.m6282(bArr, i);
                    iM6437 = m6437(b4, b5, b12);
                    iM6298 = AbstractC3682.m6298(bArr, i3);
                    iM6282 = AbstractC3682.m6280(bArr, i10);
                    iM62822 = AbstractC3682.m6280(bArr, i2);
                    iM62802 = AbstractC3682.m6282(bArr, i + 17);
                } else {
                    b7 = 32;
                    if (b4 == b7) {
                        b8 = b18;
                        i4 = i11;
                        i5 = i8;
                        if (b4 == b7) {
                        }
                    }
                }
            } else if (b17 == 32 || b17 == 84) {
                if (b == 58) {
                    b2 = b23;
                    if (b2 == 58) {
                        iM6298 = AbstractC3682.m6298(bArr, i);
                        iM6437 = AbstractC3682.m6280(bArr, i6);
                        iM6280 = AbstractC3682.m6280(bArr, i + 8);
                        iM6282 = AbstractC3682.m6280(bArr, i10);
                        iM62822 = AbstractC3682.m6280(bArr, i2);
                        iM62802 = AbstractC3682.m6282(bArr, i + 17);
                    }
                }
                b3 = b9;
                if (b3 == 32) {
                }
                b7 = 32;
                if (b3 == 32) {
                    if (b3 != b7) {
                    }
                }
            } else {
                b3 = b9;
                b2 = b23;
                if (b3 == 32) {
                }
                b7 = 32;
                if (b3 == 32) {
                }
            }
        }
        int i16 = iM62802;
        int i17 = iM6298;
        int i18 = iM6437;
        int i19 = iM6280;
        int i20 = iM6282;
        int i21 = iM62822;
        if ((i17 | i18 | i19 | i20 | i21 | i16) < 0) {
            return null;
        }
        return LocalDateTime.of(i17, i18, i19, i20, i21, i16);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public static LocalDateTime m6402(int i, char[] cArr) {
        if (i + 19 <= cArr.length && cArr[i + 2] == ' ' && cArr[i + 6] == ' ' && cArr[i + 11] == ' ' && cArr[i + 14] == ':' && cArr[i + 17] == ':') {
            int iM6281 = AbstractC3682.m6281(i, cArr);
            int iM6429 = m6429(cArr[i + 3], cArr[i + 4], cArr[i + 5]);
            int iM6299 = AbstractC3682.m6299(i + 7, cArr);
            int iM62812 = AbstractC3682.m6281(i + 12, cArr);
            int iM62813 = AbstractC3682.m6281(i + 15, cArr);
            int iM62814 = AbstractC3682.m6281(i + 18, cArr);
            if ((iM6299 | iM6429 | iM6281 | iM62812 | iM62813 | iM62814) > 0 && iM62812 <= 24 && iM62813 <= 59 && iM62814 <= 60) {
                return LocalDateTime.of(iM6299, iM6429, iM6281, iM62812, iM62813, iM62814);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDateTime m6403(byte[] bArr, int i) {
        int iM6282;
        int iM6437;
        int iM6298;
        int iM62982;
        int iM6280;
        int i2;
        long jM6435;
        if (i + 19 > bArr.length) {
            return null;
        }
        byte b = bArr[i + 1];
        byte b2 = bArr[i + 2];
        int i3 = i + 3;
        byte b3 = bArr[i3];
        byte b4 = bArr[i + 4];
        int i4 = i + 5;
        byte b5 = bArr[i4];
        byte b6 = bArr[i + 7];
        byte b7 = bArr[i + 10];
        if (((b4 == 45 && b6 == 45) || (b4 == 47 && b6 == 47)) && (b7 == 32 || b7 == 84)) {
            iM6298 = AbstractC3682.m6298(bArr, i);
            iM6437 = AbstractC3682.m6280(bArr, i4);
            iM6282 = AbstractC3682.m6280(bArr, i + 8);
        } else {
            if (b2 == 47 && b5 == 47 && (b7 == 32 || b7 == 84)) {
                int iM62802 = AbstractC3682.m6280(bArr, i);
                i2 = iM62802;
                iM6280 = AbstractC3682.m6280(bArr, i3);
                iM62982 = AbstractC3682.m6298(bArr, i + 6);
                jM6435 = m6435(bArr, i + 11);
                if ((((long) (iM62982 | iM6280 | i2)) | jM6435) > 0) {
                    return null;
                }
                return LocalDateTime.of(iM62982, iM6280, i2, ((int) jM6435) & Opcodes.CONST_METHOD_TYPE, ((int) (jM6435 >> 24)) & Opcodes.CONST_METHOD_TYPE, ((int) (jM6435 >> 48)) & Opcodes.CONST_METHOD_TYPE);
            }
            if (b != 32 || b5 != 32 || b7 != 32) {
                return null;
            }
            iM6282 = AbstractC3682.m6282(bArr, i);
            iM6437 = m6437(b2, b3, b4);
            iM6298 = AbstractC3682.m6298(bArr, i + 6);
        }
        iM62982 = iM6298;
        iM6280 = iM6437;
        i2 = iM6282;
        jM6435 = m6435(bArr, i + 11);
        if ((((long) (iM62982 | iM6280 | i2)) | jM6435) > 0) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static LocalDateTime m6404(int i, char[] cArr) {
        if (i + 14 > cArr.length) {
            return null;
        }
        int iM6299 = AbstractC3682.m6299(i, cArr);
        int iM6281 = AbstractC3682.m6281(i + 4, cArr);
        int iM62812 = AbstractC3682.m6281(i + 6, cArr);
        int iM62813 = AbstractC3682.m6281(i + 8, cArr);
        int iM62814 = AbstractC3682.m6281(i + 10, cArr);
        int iM62815 = AbstractC3682.m6281(i + 12, cArr);
        if ((iM6299 | iM6281 | iM62812 | iM62813 | iM62814 | iM62815) < 0) {
            return null;
        }
        return LocalDateTime.of(iM6299, iM6281, iM62812, iM62813, iM62814, iM62815);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static LocalDateTime m6405(byte[] bArr, int i) {
        int i2 = i + 12;
        if (i2 > bArr.length) {
            String str = new String(bArr, i, bArr.length - i);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        int iM6298 = AbstractC3682.m6298(bArr, i);
        int iM6280 = AbstractC3682.m6280(bArr, i + 4);
        int iM62802 = AbstractC3682.m6280(bArr, i + 6);
        int iM62803 = AbstractC3682.m6280(bArr, i + 8);
        int iM62804 = AbstractC3682.m6280(bArr, i + 10);
        if ((iM6298 | iM6280 | iM62802 | iM62803 | iM62804) < 0) {
            String str2 = new String(bArr, i, i2);
            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
        }
        if (iM6298 == 0 && iM6280 == 0 && iM62802 == 0 && iM62803 == 0 && iM62804 == 0) {
            return null;
        }
        return LocalDateTime.of(iM6298, iM6280, iM62802, iM62803, iM62804, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static LocalDateTime m6406(int i, char[] cArr) {
        int i2 = i + 12;
        if (i2 > cArr.length) {
            String str = new String(cArr, i, cArr.length - i);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        int iM6299 = AbstractC3682.m6299(i, cArr);
        int iM6281 = AbstractC3682.m6281(i + 4, cArr);
        int iM62812 = AbstractC3682.m6281(i + 6, cArr);
        int iM62813 = AbstractC3682.m6281(i + 8, cArr);
        int iM62814 = AbstractC3682.m6281(i + 10, cArr);
        if ((iM6299 | iM6281 | iM62812 | iM62813 | iM62814) < 0) {
            String str2 = new String(cArr, i, i2);
            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
        }
        if (iM6299 == 0 && iM6281 == 0 && iM62812 == 0 && iM62813 == 0 && iM62814 == 0) {
            return null;
        }
        return LocalDateTime.of(iM6299, iM6281, iM62812, iM62813, iM62814, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static LocalDateTime m6407(byte[] bArr, int i) {
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
                return m6395(0, bArr, i);
            case 8:
                LocalDate localDateM6427 = m6427(bArr, 0);
                if (localDateM6427 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM6427, LocalTime.MIN);
            case 9:
                LocalDate localDateM6425 = m6425(bArr, 0);
                if (localDateM6425 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM6425, LocalTime.MIN);
            case 10:
                LocalDate localDateM6431 = m6431(bArr, 0);
                if (localDateM6431 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM6431, LocalTime.MIN);
            case 11:
                return LocalDateTime.of(m6422(bArr, 0), LocalTime.MIN);
            case 12:
                return m6405(bArr, 0);
            case 14:
                return m6415(bArr, 0);
            case 16:
                return m6413(bArr, 0);
            case 17:
                return m6411(bArr, 0);
            case 18:
                return m6401(bArr, 0);
            case 19:
                return m6403(bArr, 0);
            case 20:
                return m6398(bArr, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static LocalDateTime m6408(int i, char[] cArr) {
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
                return m6399(0, i, cArr);
            case 8:
                if (cArr[2] == ':' && cArr[5] == ':') {
                    return LocalDateTime.of(f9368, m6457(0, cArr));
                }
                LocalDate localDateM6426 = m6426(0, cArr);
                if (localDateM6426 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM6426, LocalTime.MIN);
            case 9:
                LocalDate localDateM6424 = m6424(0, cArr);
                if (localDateM6424 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM6424, LocalTime.MIN);
            case 10:
                LocalDate localDateM6430 = m6430(0, cArr);
                if (localDateM6430 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM6430, LocalTime.MIN);
            case 11:
                LocalDate localDateM6423 = m6423(0, cArr);
                if (localDateM6423 == null) {
                    return null;
                }
                return LocalDateTime.of(localDateM6423, LocalTime.MIN);
            case 12:
                return m6406(0, cArr);
            case 14:
                return m6404(0, cArr);
            case 16:
                return m6414(0, cArr);
            case 17:
                return m6412(0, cArr);
            case 18:
                return m6410(0, cArr);
            case 19:
                return m6400(0, cArr);
            case 20:
                return m6402(0, cArr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static LocalDateTime m6409(int i, String str) {
        LocalDateTime localDateTimeM6408;
        Function function;
        if (i != 0) {
            ToIntFunction toIntFunction = AbstractC3687.f9271;
            if (toIntFunction != null && (function = AbstractC3687.f9272) != null && toIntFunction.applyAsInt(str) == 0) {
                localDateTimeM6408 = m6407((byte[]) function.apply(str), i);
            } else if (AbstractC3687.f9263 != 8 || AbstractC3687.f9280) {
                char[] cArr = new char[i];
                str.getChars(0, i, cArr, 0);
                localDateTimeM6408 = m6408(i, cArr);
            } else {
                localDateTimeM6408 = m6408(i, AbstractC3687.m6330(str));
            }
            if (localDateTimeM6408 != null) {
                return localDateTimeM6408;
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
    */
    public static LocalDateTime m6410(int i, char[] cArr) {
        int i2;
        char c;
        char c2;
        char c3;
        int i3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        int i4;
        int i5;
        int iM6281;
        int iM6429;
        int iM6299;
        int iM6283;
        int iM62832;
        int iM62812;
        if (i + 18 > cArr.length) {
            String str = new String(cArr, i, cArr.length - i);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        char c9 = cArr[i + 1];
        char c10 = cArr[i + 2];
        char c11 = cArr[i + 3];
        char c12 = cArr[i + 4];
        int i6 = i + 5;
        char c13 = cArr[i6];
        int i7 = i + 6;
        char c14 = cArr[i7];
        int i8 = i + 7;
        char c15 = cArr[i8];
        char c16 = cArr[i + 9];
        int i9 = i + 10;
        char c17 = cArr[i9];
        int i10 = i + 11;
        char c18 = cArr[i10];
        int i11 = i + 12;
        char c19 = cArr[i11];
        int i12 = i + 13;
        char c20 = cArr[i12];
        int i13 = i + 14;
        char c21 = cArr[i13];
        int i14 = i + 15;
        char c22 = cArr[i14];
        int i15 = i + 16;
        char c23 = cArr[i15];
        if (c12 == '-' && c14 == '-' && ((c16 == ' ' || c16 == 'T') && c19 == ':' && c22 == ':')) {
            iM6299 = AbstractC3682.m6299(i, cArr);
            iM6429 = AbstractC3682.m6283(i6, cArr);
            iM6281 = AbstractC3682.m6281(i8, cArr);
            iM6283 = AbstractC3682.m6281(i9, cArr);
            iM62832 = AbstractC3682.m6281(i12, cArr);
            iM62812 = AbstractC3682.m6281(i15, cArr);
        } else if (c12 == '-' && c15 == '-' && ((c16 == ' ' || c16 == 'T') && c19 == ':' && c22 == ':')) {
            iM6299 = AbstractC3682.m6299(i, cArr);
            iM6429 = AbstractC3682.m6281(i6, cArr);
            iM6281 = AbstractC3682.m6283(i + 8, cArr);
            iM6283 = AbstractC3682.m6281(i9, cArr);
            iM62832 = AbstractC3682.m6281(i12, cArr);
            iM62812 = AbstractC3682.m6281(i15, cArr);
        } else if (c12 == '-' && c15 == '-' && ((c17 == ' ' || c17 == 'T') && c19 == ':' && c22 == ':')) {
            iM6299 = AbstractC3682.m6299(i, cArr);
            iM6429 = AbstractC3682.m6281(i6, cArr);
            iM6281 = AbstractC3682.m6281(i + 8, cArr);
            iM6283 = AbstractC3682.m6283(i10, cArr);
            iM62832 = AbstractC3682.m6281(i12, cArr);
            iM62812 = AbstractC3682.m6281(i15, cArr);
        } else {
            if (c12 == '-' && c15 == '-' && (c17 == ' ' || c17 == 'T')) {
                c = c20;
                if (c == ':' && c22 == ':') {
                    iM6299 = AbstractC3682.m6299(i, cArr);
                    iM6429 = AbstractC3682.m6281(i6, cArr);
                    iM6281 = AbstractC3682.m6281(i + 8, cArr);
                    iM6283 = AbstractC3682.m6281(i10, cArr);
                    iM62832 = AbstractC3682.m6283(i13, cArr);
                    iM62812 = AbstractC3682.m6281(i15, cArr);
                } else {
                    i2 = i13;
                }
            } else {
                i2 = i13;
                c = c20;
            }
            if (c12 != '-' || c15 != '-') {
                c2 = c23;
                c3 = c9;
                if (c3 == ' ') {
                    c6 = c13;
                    if (c6 == ' ' && c17 == ' ' && c19 == ':' && c22 == ':') {
                        iM6281 = AbstractC3682.m6283(i, cArr);
                        iM6429 = m6429(c10, c11, c12);
                        iM6299 = AbstractC3682.m6299(i7, cArr);
                        iM6283 = AbstractC3682.m6283(i10, cArr);
                        iM62832 = AbstractC3682.m6281(i12, cArr);
                        iM62812 = AbstractC3682.m6281(i15, cArr);
                    } else {
                        i3 = i7;
                        c4 = c10;
                        c5 = c11;
                    }
                } else {
                    i3 = i7;
                    c4 = c10;
                    c5 = c11;
                    c6 = c13;
                }
                c7 = ' ';
                if (c3 == ' ' && c6 == ' ' && c17 == ' ') {
                    if (c == ':' && c22 == ':') {
                        iM6281 = AbstractC3682.m6283(i, cArr);
                        iM6429 = m6429(c4, c5, c12);
                        iM6299 = AbstractC3682.m6299(i3, cArr);
                        iM6283 = AbstractC3682.m6281(i10, cArr);
                        iM62832 = AbstractC3682.m6283(i2, cArr);
                        iM62812 = AbstractC3682.m6281(i15, cArr);
                    } else {
                        c7 = ' ';
                        if (c3 != c7) {
                            if (c4 == c7) {
                            }
                        }
                    }
                } else if (c3 != c7 || c6 != c7 || c17 != c7) {
                    if (c4 == c7 && c14 == c7) {
                        c8 = c18;
                        if (c8 == c7) {
                            if (c21 == ':' && c2 == ':') {
                                iM6281 = AbstractC3682.m6281(i, cArr);
                                iM6429 = m6429(c5, c12, c6);
                                iM6299 = AbstractC3682.m6299(i8, cArr);
                                iM6283 = AbstractC3682.m6281(i11, cArr);
                                iM62832 = AbstractC3682.m6283(i14, cArr);
                                iM62812 = AbstractC3682.m6283(i + 17, cArr);
                            } else {
                                i4 = i11;
                                i5 = i8;
                                c7 = ' ';
                            }
                        }
                        if (c4 == c7 && c14 == c7 && c8 == c7) {
                            if (c != ':' || c2 != ':') {
                                c7 = ' ';
                                if (c4 == c7) {
                                }
                                String str2 = new String(cArr, i, 18);
                                throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                            }
                            iM6281 = AbstractC3682.m6281(i, cArr);
                            iM6429 = m6429(c5, c12, c6);
                            iM6299 = AbstractC3682.m6299(i5, cArr);
                            iM6283 = AbstractC3682.m6283(i4, cArr);
                            iM62832 = AbstractC3682.m6281(i2, cArr);
                            iM62812 = AbstractC3682.m6283(i + 17, cArr);
                        } else {
                            if (c4 == c7 || c14 != c7 || c8 != c7 || c != ':' || c22 != ':') {
                                String str22 = new String(cArr, i, 18);
                                throw new DateTimeParseException("illegal input ".concat(str22), str22, 0);
                            }
                            iM6281 = AbstractC3682.m6281(i, cArr);
                            iM6429 = m6429(c5, c12, c6);
                            iM6299 = AbstractC3682.m6299(i5, cArr);
                            iM6283 = AbstractC3682.m6283(i4, cArr);
                            iM62832 = AbstractC3682.m6283(i2, cArr);
                            iM62812 = AbstractC3682.m6281(i15, cArr);
                        }
                    } else {
                        c8 = c18;
                    }
                    i4 = i11;
                    i5 = i8;
                    if (c4 == c7) {
                        if (c4 == c7) {
                        }
                        String str222 = new String(cArr, i, 18);
                        throw new DateTimeParseException("illegal input ".concat(str222), str222, 0);
                    }
                } else if (c == ':' && c2 == ':') {
                    iM6281 = AbstractC3682.m6283(i, cArr);
                    iM6429 = m6429(c4, c5, c12);
                    iM6299 = AbstractC3682.m6299(i3, cArr);
                    iM6283 = AbstractC3682.m6281(i10, cArr);
                    iM62832 = AbstractC3682.m6281(i2, cArr);
                    iM62812 = AbstractC3682.m6283(i + 17, cArr);
                } else {
                    c7 = ' ';
                    if (c4 == c7) {
                        c8 = c18;
                        i4 = i11;
                        i5 = i8;
                        if (c4 == c7) {
                        }
                    }
                }
            } else if (c17 == ' ' || c17 == 'T') {
                if (c == ':') {
                    c2 = c23;
                    if (c2 == ':') {
                        iM6299 = AbstractC3682.m6299(i, cArr);
                        iM6429 = AbstractC3682.m6281(i6, cArr);
                        iM6281 = AbstractC3682.m6281(i + 8, cArr);
                        iM6283 = AbstractC3682.m6281(i10, cArr);
                        iM62832 = AbstractC3682.m6281(i2, cArr);
                        iM62812 = AbstractC3682.m6283(i + 17, cArr);
                    }
                }
                c3 = c9;
                if (c3 == ' ') {
                }
                c7 = ' ';
                if (c3 == ' ') {
                    if (c3 != c7) {
                    }
                }
            } else {
                c3 = c9;
                c2 = c23;
                if (c3 == ' ') {
                }
                c7 = ' ';
                if (c3 == ' ') {
                }
            }
        }
        int i16 = iM6299;
        int i17 = iM62812;
        int i18 = iM6429;
        int i19 = iM6281;
        int i20 = iM6283;
        int i21 = iM62832;
        if ((i16 | i18 | i19 | i20 | i21 | i17) < 0) {
            return null;
        }
        return LocalDateTime.of(i16, i18, i19, i20, i21, i17);
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
    */
    public static LocalDateTime m6411(byte[] bArr, int i) {
        int i2;
        int i3;
        int i4;
        byte b;
        int i5;
        int i6;
        int iM6280;
        int iM62802;
        int i7;
        int iM6282;
        int iM62803;
        int iM62804;
        int iM6437;
        int iM6298;
        int iM62822;
        int iM62823;
        int i8;
        int i9;
        int i10;
        byte b2;
        byte b3;
        byte b4;
        int i11;
        int iM6447;
        int iM62824;
        int iM64372;
        int iM62982;
        int iM62805;
        int iM62825;
        if (i + 17 > bArr.length) {
            String str = new String(bArr, i, bArr.length - i);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        byte b5 = bArr[i + 1];
        byte b6 = bArr[i + 2];
        byte b7 = bArr[i + 3];
        int i12 = i + 4;
        byte b8 = bArr[i12];
        int i13 = i + 5;
        byte b9 = bArr[i13];
        int i14 = i + 6;
        byte b10 = bArr[i14];
        int i15 = i + 7;
        byte b11 = bArr[i15];
        int i16 = i + 8;
        byte b12 = bArr[i16];
        int i17 = i + 9;
        byte b13 = bArr[i17];
        int i18 = i + 10;
        byte b14 = bArr[i18];
        int i19 = i + 11;
        byte b15 = bArr[i19];
        int i20 = i + 12;
        byte b16 = bArr[i20];
        int i21 = i + 13;
        byte b17 = bArr[i21];
        int i22 = i + 14;
        byte b18 = bArr[i22];
        int i23 = i + 15;
        byte b19 = bArr[i23];
        int i24 = i + 16;
        byte b20 = bArr[i24];
        if (b8 != 45 || b11 != 45 || ((b14 != 84 && b14 != 32) || b17 != 58 || b20 != 90)) {
            if (b8 != 45 || b10 != 45) {
                i2 = i20;
                i3 = i23;
                i4 = i15;
                b = b6;
                if (b == 32 && b10 == 32 && b15 == 32 && b18 == 58) {
                    int iM62806 = AbstractC3682.m6280(bArr, i);
                    int iM64373 = m6437(b7, b8, b9);
                    int iM62983 = AbstractC3682.m6298(bArr, i4);
                    int iM62807 = AbstractC3682.m6280(bArr, i2);
                    iM62803 = AbstractC3682.m6280(bArr, i3);
                    iM6280 = iM62806;
                    i7 = iM62983;
                    iM62802 = iM64373;
                    i6 = iM62807;
                } else {
                    i8 = i2;
                    if (b5 != 32 && b9 == 32 && b14 == 32) {
                        i9 = i4;
                        b2 = b16;
                        if (b2 == 58 && b18 == 58) {
                            iM62804 = AbstractC3682.m6282(bArr, i);
                            iM6437 = m6437(b, b7, b8);
                            iM6298 = AbstractC3682.m6298(bArr, i14);
                            iM62822 = AbstractC3682.m6282(bArr, i19);
                            iM6282 = AbstractC3682.m6282(bArr, i21);
                            iM62823 = AbstractC3682.m6280(bArr, i3);
                            i5 = iM62823;
                            i6 = iM62822;
                            i7 = iM6298;
                            iM62802 = iM6437;
                            iM6280 = iM62804;
                            iM62803 = iM6282;
                            iM6447 = 0;
                        } else {
                            i10 = i14;
                        }
                    } else {
                        i9 = i4;
                        i10 = i14;
                        b2 = b16;
                    }
                    b3 = 32;
                    if (b5 != 32 && b9 == 32 && b14 == 32) {
                        if (b2 == 58) {
                            b4 = b19;
                            if (b4 == 58) {
                                iM62824 = AbstractC3682.m6282(bArr, i);
                                iM64372 = m6437(b, b7, b8);
                                iM62982 = AbstractC3682.m6298(bArr, i10);
                                iM62805 = AbstractC3682.m6282(bArr, i19);
                                iM6282 = AbstractC3682.m6280(bArr, i21);
                                iM62825 = AbstractC3682.m6282(bArr, i24);
                                i5 = iM62825;
                                i6 = iM62805;
                                iM6280 = iM62824;
                                iM62802 = iM64372;
                                i7 = iM62982;
                                iM62803 = iM6282;
                                iM6447 = 0;
                            }
                        } else {
                            b4 = b19;
                        }
                        i11 = i24;
                        b3 = 32;
                    } else {
                        b4 = b19;
                        i11 = i24;
                    }
                    if (b5 == b3 && b9 == b3 && b14 == b3) {
                        if (b17 == 58 || b4 != 58) {
                            b3 = 32;
                        } else {
                            iM62824 = AbstractC3682.m6282(bArr, i);
                            iM64372 = m6437(b, b7, b8);
                            iM62982 = AbstractC3682.m6298(bArr, i10);
                            iM62805 = AbstractC3682.m6280(bArr, i19);
                            iM6282 = AbstractC3682.m6282(bArr, i22);
                            iM62825 = AbstractC3682.m6282(bArr, i11);
                            i5 = iM62825;
                            i6 = iM62805;
                            iM6280 = iM62824;
                            iM62802 = iM64372;
                            i7 = iM62982;
                            iM62803 = iM6282;
                            iM6447 = 0;
                        }
                    }
                    if (b != b3 && b10 == b3 && b15 == b3 && b17 == 58 && b4 == 58) {
                        iM62804 = AbstractC3682.m6280(bArr, i);
                        iM6437 = m6437(b7, b8, b9);
                        iM6298 = AbstractC3682.m6298(bArr, i9);
                        iM62822 = AbstractC3682.m6282(bArr, i8);
                        iM6282 = AbstractC3682.m6282(bArr, i22);
                        iM62823 = AbstractC3682.m6282(bArr, i11);
                        i5 = iM62823;
                        i6 = iM62822;
                        i7 = iM6298;
                        iM62802 = iM6437;
                        iM6280 = iM62804;
                        iM62803 = iM6282;
                        iM6447 = 0;
                    } else {
                        int i25 = i9;
                        if (b8 != -27 && b9 == -71 && b10 == -76 && b13 == -26 && b14 == -100 && b15 == -120 && b18 == -26 && b4 == -105 && b20 == -91) {
                            int iM62984 = AbstractC3682.m6298(bArr, i);
                            i7 = iM62984;
                            iM62802 = AbstractC3682.m6280(bArr, i25);
                            iM6280 = AbstractC3682.m6280(bArr, i8);
                            i6 = 0;
                            iM62803 = 0;
                        } else {
                            int iM62985 = AbstractC3682.m6298(bArr, i);
                            int iM62808 = AbstractC3682.m6280(bArr, i12);
                            int iM62809 = AbstractC3682.m6280(bArr, i10);
                            int iM628010 = AbstractC3682.m6280(bArr, i16);
                            int iM628011 = AbstractC3682.m6280(bArr, i18);
                            int iM628012 = AbstractC3682.m6280(bArr, i8);
                            iM6447 = m6447(3, bArr, i22);
                            i6 = iM628010;
                            i7 = iM62985;
                            iM62802 = iM62808;
                            iM6280 = iM62809;
                            i5 = iM628012;
                            iM62803 = iM628011;
                        }
                    }
                }
            } else if (b12 == 32 || b12 == 84) {
                if (b15 == 58 && b18 == 58) {
                    iM6298 = AbstractC3682.m6298(bArr, i);
                    iM6437 = AbstractC3682.m6282(bArr, i13);
                    iM62804 = AbstractC3682.m6282(bArr, i15);
                    iM62822 = AbstractC3682.m6280(bArr, i17);
                    iM6282 = AbstractC3682.m6280(bArr, i20);
                    iM62823 = AbstractC3682.m6280(bArr, i23);
                    i5 = iM62823;
                    i6 = iM62822;
                    i7 = iM6298;
                    iM62802 = iM6437;
                    iM6280 = iM62804;
                    iM62803 = iM6282;
                    iM6447 = 0;
                }
                i2 = i20;
                i3 = i23;
                i4 = i15;
                b = b6;
                if (b == 32) {
                    i8 = i2;
                    if (b5 != 32) {
                        i9 = i4;
                        i10 = i14;
                        b2 = b16;
                        b3 = 32;
                        if (b5 != 32) {
                            b4 = b19;
                            i11 = i24;
                            if (b5 == b3) {
                                if (b17 == 58) {
                                }
                                b3 = 32;
                            }
                            if (b != b3) {
                            }
                            int i252 = i9;
                            if (b8 != -27) {
                            }
                            int iM629852 = AbstractC3682.m6298(bArr, i);
                            int iM628082 = AbstractC3682.m6280(bArr, i12);
                            int iM628092 = AbstractC3682.m6280(bArr, i10);
                            int iM6280102 = AbstractC3682.m6280(bArr, i16);
                            int iM6280112 = AbstractC3682.m6280(bArr, i18);
                            int iM6280122 = AbstractC3682.m6280(bArr, i8);
                            iM6447 = m6447(3, bArr, i22);
                            i6 = iM6280102;
                            i7 = iM629852;
                            iM62802 = iM628082;
                            iM6280 = iM628092;
                            i5 = iM6280122;
                            iM62803 = iM6280112;
                        }
                    }
                }
            } else {
                b = b6;
                i2 = i20;
                i3 = i23;
                i4 = i15;
                if (b == 32) {
                }
            }
            if ((i7 | iM62802 | iM6280 | i6 | iM62803 | i5 | iM6447) >= 0) {
                return null;
            }
            return LocalDateTime.of(i7, iM62802, iM6280, i6, iM62803, i5, iM6447);
        }
        int iM62986 = AbstractC3682.m6298(bArr, i);
        int iM628013 = AbstractC3682.m6280(bArr, i13);
        int iM628014 = AbstractC3682.m6280(bArr, i16);
        int iM628015 = AbstractC3682.m6280(bArr, i19);
        iM62803 = AbstractC3682.m6280(bArr, i22);
        i6 = iM628015;
        i7 = iM62986;
        iM62802 = iM628013;
        iM6280 = iM628014;
        i5 = 0;
        iM6447 = 0;
        if ((i7 | iM62802 | iM6280 | i6 | iM62803 | i5 | iM6447) >= 0) {
        }
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
    */
    public static LocalDateTime m6412(int i, char[] cArr) {
        int i2;
        int i3;
        int i4;
        char c;
        int iM6283;
        int iM62832;
        int iM6281;
        int iM6429;
        int iM62833;
        int iM6299;
        int i5;
        int iM62834;
        int i6;
        int i7;
        int i8;
        int iM62812;
        int i9;
        int i10;
        int i11;
        char c2;
        int i12;
        char c3;
        char c4;
        char c5;
        int iM6451;
        int iM62813;
        if (i + 17 > cArr.length) {
            String str = new String(cArr, i, cArr.length - i);
            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
        }
        char c6 = cArr[i + 1];
        char c7 = cArr[i + 2];
        char c8 = cArr[i + 3];
        int i13 = i + 4;
        char c9 = cArr[i13];
        int i14 = i + 5;
        char c10 = cArr[i14];
        int i15 = i + 6;
        char c11 = cArr[i15];
        int i16 = i + 7;
        char c12 = cArr[i16];
        int i17 = i + 8;
        char c13 = cArr[i17];
        int i18 = i + 10;
        char c14 = cArr[i18];
        int i19 = i + 11;
        char c15 = cArr[i19];
        int i20 = i + 12;
        char c16 = cArr[i20];
        int i21 = i + 13;
        char c17 = cArr[i21];
        int i22 = i + 14;
        char c18 = cArr[i22];
        int i23 = i + 15;
        char c19 = cArr[i23];
        int i24 = i + 16;
        char c20 = cArr[i24];
        if (c9 != '-' || c12 != '-' || ((c14 != 'T' && c14 != ' ') || c17 != ':' || c20 != 'Z')) {
            if (c9 != '-' || c11 != '-') {
                i2 = i23;
                i3 = i20;
                i4 = i16;
                c = c7;
                if (c != ' ' && c11 == ' ' && c15 == ' ' && c18 == ':') {
                    int iM62814 = AbstractC3682.m6281(i, cArr);
                    int iM64292 = m6429(c8, c9, c10);
                    int iM62992 = AbstractC3682.m6299(i4, cArr);
                    iM62813 = AbstractC3682.m6281(i3, cArr);
                    int iM62815 = AbstractC3682.m6281(i2, cArr);
                    i7 = iM62814;
                    iM62812 = iM62815;
                    i6 = iM64292;
                    i5 = iM62992;
                } else {
                    if (c6 == ' ') {
                        i10 = i3;
                        c3 = c10;
                        if (c3 == ' ' && c14 == ' ') {
                            i9 = i4;
                            c2 = c16;
                            if (c2 == ':' && c18 == ':') {
                                iM6281 = AbstractC3682.m6283(i, cArr);
                                iM6429 = m6429(c, c8, c9);
                                iM6299 = AbstractC3682.m6299(i15, cArr);
                                iM62832 = AbstractC3682.m6283(i19, cArr);
                                iM6283 = AbstractC3682.m6283(i21, cArr);
                                iM62833 = AbstractC3682.m6281(i2, cArr);
                                i5 = iM6299;
                                iM62834 = iM62833;
                                i6 = iM6429;
                                i7 = iM6281;
                                i8 = iM62832;
                                iM62812 = iM6283;
                                iM6451 = 0;
                            } else {
                                i11 = i15;
                            }
                        } else {
                            i9 = i4;
                            i11 = i15;
                            c2 = c16;
                        }
                        i12 = i21;
                    } else {
                        i9 = i4;
                        i10 = i3;
                        i11 = i15;
                        c2 = c16;
                        i12 = i21;
                        c3 = c10;
                    }
                    if (c6 == ' ' && c3 == ' ' && c14 == ' ' && c2 == ':') {
                        c4 = c19;
                        if (c4 == ':') {
                            int iM62835 = AbstractC3682.m6283(i, cArr);
                            int iM64293 = m6429(c, c8, c9);
                            int iM62993 = AbstractC3682.m6299(i11, cArr);
                            int iM62836 = AbstractC3682.m6283(i19, cArr);
                            int iM62816 = AbstractC3682.m6281(i12, cArr);
                            i7 = iM62835;
                            iM62834 = AbstractC3682.m6283(i24, cArr);
                            i6 = iM64293;
                            iM62812 = iM62816;
                            i8 = iM62836;
                            i5 = iM62993;
                            iM6451 = 0;
                        }
                    } else {
                        c4 = c19;
                    }
                    c5 = ' ';
                    if (c6 != ' ' && c3 == ' ' && c14 == ' ') {
                        if (c17 == ':' && c4 == ':') {
                            iM6281 = AbstractC3682.m6283(i, cArr);
                            iM6429 = m6429(c, c8, c9);
                            iM6299 = AbstractC3682.m6299(i11, cArr);
                            iM62832 = AbstractC3682.m6281(i19, cArr);
                            iM6283 = AbstractC3682.m6283(i22, cArr);
                            iM62833 = AbstractC3682.m6283(i24, cArr);
                            i5 = iM6299;
                            iM62834 = iM62833;
                            i6 = iM6429;
                            i7 = iM6281;
                            i8 = iM62832;
                            iM62812 = iM6283;
                            iM6451 = 0;
                        } else {
                            c5 = ' ';
                            if (c != c5) {
                            }
                            int iM62994 = AbstractC3682.m6299(i, cArr);
                            int iM62817 = AbstractC3682.m6281(i13, cArr);
                            int iM62818 = AbstractC3682.m6281(i11, cArr);
                            int iM62819 = AbstractC3682.m6281(i17, cArr);
                            int iM628110 = AbstractC3682.m6281(i18, cArr);
                            int iM628111 = AbstractC3682.m6281(i10, cArr);
                            i5 = iM62994;
                            iM6451 = m6451(3, i22, cArr);
                            i6 = iM62817;
                            i7 = iM62818;
                            i8 = iM62819;
                            iM62812 = iM628110;
                            iM62834 = iM628111;
                        }
                    } else if (c != c5 && c11 == c5 && c15 == c5 && c17 == ':' && c4 == ':') {
                        iM6281 = AbstractC3682.m6281(i, cArr);
                        iM6429 = m6429(c8, c9, c3);
                        iM6299 = AbstractC3682.m6299(i9, cArr);
                        iM62832 = AbstractC3682.m6283(i10, cArr);
                        iM6283 = AbstractC3682.m6283(i22, cArr);
                        iM62833 = AbstractC3682.m6283(i24, cArr);
                        i5 = iM6299;
                        iM62834 = iM62833;
                        i6 = iM6429;
                        i7 = iM6281;
                        i8 = iM62832;
                        iM62812 = iM6283;
                        iM6451 = 0;
                    } else {
                        int iM629942 = AbstractC3682.m6299(i, cArr);
                        int iM628172 = AbstractC3682.m6281(i13, cArr);
                        int iM628182 = AbstractC3682.m6281(i11, cArr);
                        int iM628192 = AbstractC3682.m6281(i17, cArr);
                        int iM6281102 = AbstractC3682.m6281(i18, cArr);
                        int iM6281112 = AbstractC3682.m6281(i10, cArr);
                        i5 = iM629942;
                        iM6451 = m6451(3, i22, cArr);
                        i6 = iM628172;
                        i7 = iM628182;
                        i8 = iM628192;
                        iM62812 = iM6281102;
                        iM62834 = iM6281112;
                    }
                }
            } else if (c13 == ' ' || c13 == 'T') {
                if (c15 == ':' && c18 == ':') {
                    iM6299 = AbstractC3682.m6299(i, cArr);
                    iM6429 = AbstractC3682.m6283(i14, cArr);
                    iM6281 = AbstractC3682.m6283(i16, cArr);
                    iM62832 = AbstractC3682.m6281(i + 9, cArr);
                    iM6283 = AbstractC3682.m6281(i20, cArr);
                    iM62833 = AbstractC3682.m6281(i23, cArr);
                    i5 = iM6299;
                    iM62834 = iM62833;
                    i6 = iM6429;
                    i7 = iM6281;
                    i8 = iM62832;
                    iM62812 = iM6283;
                    iM6451 = 0;
                }
                i2 = i23;
                i3 = i20;
                i4 = i16;
                c = c7;
                if (c != ' ') {
                }
                if (c6 == ' ') {
                }
                if (c6 == ' ') {
                    c4 = c19;
                    c5 = ' ';
                    if (c6 != ' ') {
                        if (c != c5) {
                        }
                        int iM6299422 = AbstractC3682.m6299(i, cArr);
                        int iM6281722 = AbstractC3682.m6281(i13, cArr);
                        int iM6281822 = AbstractC3682.m6281(i11, cArr);
                        int iM6281922 = AbstractC3682.m6281(i17, cArr);
                        int iM62811022 = AbstractC3682.m6281(i18, cArr);
                        int iM62811122 = AbstractC3682.m6281(i10, cArr);
                        i5 = iM6299422;
                        iM6451 = m6451(3, i22, cArr);
                        i6 = iM6281722;
                        i7 = iM6281822;
                        i8 = iM6281922;
                        iM62812 = iM62811022;
                        iM62834 = iM62811122;
                    }
                }
            } else {
                c = c7;
                i2 = i23;
                i3 = i20;
                i4 = i16;
                if (c != ' ') {
                }
                if (c6 == ' ') {
                }
                if (c6 == ' ') {
                }
            }
            if ((i5 | i6 | i7 | i8 | iM62812 | iM62834 | iM6451) >= 0) {
                return null;
            }
            return LocalDateTime.of(i5, i6, i7, i8, iM62812, iM62834, iM6451);
        }
        int iM62995 = AbstractC3682.m6299(i, cArr);
        int iM628112 = AbstractC3682.m6281(i14, cArr);
        int iM628113 = AbstractC3682.m6281(i17, cArr);
        iM62813 = AbstractC3682.m6281(i19, cArr);
        i5 = iM62995;
        iM62812 = AbstractC3682.m6281(i22, cArr);
        i6 = iM628112;
        i7 = iM628113;
        i8 = iM62813;
        iM62834 = 0;
        iM6451 = 0;
        if ((i5 | i6 | i7 | i8 | iM62812 | iM62834 | iM6451) >= 0) {
        }
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
    */
    public static LocalDateTime m6413(byte[] bArr, int i) {
        byte b;
        int i2;
        byte b2;
        byte b3;
        byte b4;
        byte b5;
        byte b6;
        byte b7;
        int i3;
        byte b8;
        byte b9;
        int iM6298;
        int iM6280;
        int iM6282;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iM62822;
        int iM6437;
        int iM62982;
        int iM62823;
        int iM62824;
        int iM62825;
        int iM62826;
        int iM64372;
        int iM62983;
        int iM62802;
        int iM62803;
        if (i + 16 > bArr.length) {
            return null;
        }
        byte b10 = bArr[i + 1];
        byte b11 = bArr[i + 2];
        byte b12 = bArr[i + 3];
        int i10 = i + 4;
        byte b13 = bArr[i10];
        int i11 = i + 5;
        byte b14 = bArr[i11];
        int i12 = i + 6;
        byte b15 = bArr[i12];
        int i13 = i + 7;
        byte b16 = bArr[i13];
        int i14 = i + 8;
        byte b17 = bArr[i14];
        int i15 = i + 9;
        byte b18 = bArr[i15];
        byte b19 = bArr[i + 10];
        int i16 = i + 11;
        byte b20 = bArr[i16];
        int i17 = i + 12;
        byte b21 = bArr[i17];
        int i18 = i + 13;
        byte b22 = bArr[i18];
        int i19 = i + 14;
        byte b23 = bArr[i19];
        int i20 = i + 15;
        byte b24 = bArr[i20];
        if (b13 == 45 && b16 == 45 && ((b19 == 84 || b19 == 32) && b22 == 58)) {
            iM62983 = AbstractC3682.m6298(bArr, i);
            iM64372 = AbstractC3682.m6280(bArr, i11);
            iM62826 = AbstractC3682.m6280(bArr, i14);
            iM62802 = AbstractC3682.m6280(bArr, i16);
            iM62803 = AbstractC3682.m6280(bArr, i19);
        } else {
            if (b17 == 84 && b24 == 90) {
                iM62982 = AbstractC3682.m6298(bArr, i);
                iM6437 = AbstractC3682.m6280(bArr, i10);
                iM62822 = AbstractC3682.m6280(bArr, i12);
                iM62823 = AbstractC3682.m6280(bArr, i15);
                iM62824 = AbstractC3682.m6280(bArr, i16);
                iM62825 = AbstractC3682.m6280(bArr, i18);
            } else {
                if (b13 != 45 || b16 != 45) {
                    b = b23;
                    i2 = i20;
                    b2 = b21;
                } else if (b19 == 84 || b19 == 32) {
                    b2 = b21;
                    b = b23;
                    if (b2 == 58 && b == 58) {
                        iM62982 = AbstractC3682.m6298(bArr, i);
                        iM6437 = AbstractC3682.m6280(bArr, i11);
                        iM62822 = AbstractC3682.m6280(bArr, i14);
                        iM62823 = AbstractC3682.m6282(bArr, i16);
                        iM62824 = AbstractC3682.m6282(bArr, i18);
                        iM62825 = AbstractC3682.m6282(bArr, i20);
                    } else {
                        i2 = i20;
                    }
                } else {
                    b3 = b10;
                    b = b23;
                    i2 = i20;
                    b2 = b21;
                    if (b3 != 32) {
                        b6 = b14;
                        if (b6 == 32 && b19 == 32 && b22 == 58) {
                            iM62826 = AbstractC3682.m6282(bArr, i);
                            iM64372 = m6437(b11, b12, b13);
                            iM62983 = AbstractC3682.m6298(bArr, i12);
                            iM62802 = AbstractC3682.m6280(bArr, i16);
                            iM62803 = AbstractC3682.m6280(bArr, i19);
                        } else {
                            b4 = b11;
                            b5 = b12;
                        }
                    } else {
                        b4 = b11;
                        b5 = b12;
                        b6 = b14;
                    }
                    if (b3 == 32 || b6 != 32 || b19 != 32 || b2 != 58 || b != 58) {
                        if (b13 == -27 || b6 != -71) {
                            b7 = b18;
                            i3 = i13;
                            b8 = b15;
                        } else {
                            b8 = b15;
                            if (b8 == -76 && b17 == -26) {
                                b7 = b18;
                                if (b7 == -100 && b19 == -120 && b22 == -26 && b == -105) {
                                    b9 = b24;
                                    if (b9 == -91) {
                                        iM6298 = AbstractC3682.m6298(bArr, i);
                                        iM6280 = AbstractC3682.m6282(bArr, i13);
                                        iM6282 = AbstractC3682.m6280(bArr, i16);
                                        i4 = iM6298;
                                        i5 = iM6280;
                                        i6 = iM6282;
                                        i7 = 0;
                                        i8 = 0;
                                        i9 = 0;
                                        if ((i4 | i5 | i6 | i7 | i8 | i9) < 0) {
                                            return null;
                                        }
                                        return LocalDateTime.of(i4, i5, i6, i7, i8, i9);
                                    }
                                    i3 = i13;
                                    if (b13 == -27 || b6 != -71 || b8 != -76 || b7 != -26 || b19 != -100 || b20 != -120 || b22 != -26 || b != -105 || b9 != -91) {
                                        return null;
                                    }
                                    iM6298 = AbstractC3682.m6298(bArr, i);
                                    iM6280 = AbstractC3682.m6280(bArr, i3);
                                    iM6282 = AbstractC3682.m6282(bArr, i17);
                                    i4 = iM6298;
                                    i5 = iM6280;
                                    i6 = iM6282;
                                    i7 = 0;
                                    i8 = 0;
                                    i9 = 0;
                                    if ((i4 | i5 | i6 | i7 | i8 | i9) < 0) {
                                    }
                                }
                            } else {
                                b7 = b18;
                            }
                            i3 = i13;
                        }
                        b9 = b24;
                        if (b13 == -27) {
                        }
                        return null;
                    }
                    iM62822 = AbstractC3682.m6282(bArr, i);
                    iM6437 = m6437(b4, b5, b13);
                    iM62982 = AbstractC3682.m6298(bArr, i12);
                    iM62823 = AbstractC3682.m6282(bArr, i16);
                    iM62824 = AbstractC3682.m6282(bArr, i18);
                    iM62825 = AbstractC3682.m6282(bArr, i2);
                }
                b3 = b10;
                if (b3 != 32) {
                }
                if (b3 == 32) {
                }
                if (b13 == -27) {
                    b7 = b18;
                    i3 = i13;
                    b8 = b15;
                    b9 = b24;
                    if (b13 == -27) {
                    }
                    return null;
                }
                if ((i4 | i5 | i6 | i7 | i8 | i9) < 0) {
                }
            }
            i9 = iM62825;
            i4 = iM62982;
            i5 = iM6437;
            i8 = iM62824;
            i6 = iM62822;
            i7 = iM62823;
            if ((i4 | i5 | i6 | i7 | i8 | i9) < 0) {
            }
        }
        i8 = iM62803;
        i4 = iM62983;
        i5 = iM64372;
        i7 = iM62802;
        i6 = iM62826;
        i9 = 0;
        if ((i4 | i5 | i6 | i7 | i8 | i9) < 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDateTime m6414(int i, char[] cArr) {
        char c;
        int iM6283;
        int iM6429;
        int iM6299;
        int iM62832;
        int iM62833;
        int iM62834;
        int iM64292;
        int iM62992;
        int iM6281;
        int iM62812;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i + 16 > cArr.length) {
            return null;
        }
        char c2 = cArr[i + 1];
        char c3 = cArr[i + 2];
        char c4 = cArr[i + 3];
        int i8 = i + 4;
        char c5 = cArr[i8];
        int i9 = i + 5;
        char c6 = cArr[i9];
        char c7 = cArr[i + 7];
        char c8 = cArr[i + 10];
        char c9 = cArr[i + 12];
        int i10 = i + 13;
        char c10 = cArr[i10];
        int i11 = i + 14;
        char c11 = cArr[i11];
        int iM62835 = 0;
        if (c5 == '-' && c7 == '-' && ((c8 == 'T' || c8 == ' ') && c10 == ':')) {
            iM62992 = AbstractC3682.m6299(i, cArr);
            iM64292 = AbstractC3682.m6281(i9, cArr);
            iM62834 = AbstractC3682.m6281(i + 8, cArr);
            iM6281 = AbstractC3682.m6281(i + 11, cArr);
            iM62812 = AbstractC3682.m6281(i11, cArr);
        } else {
            int i12 = i + 8;
            if (cArr[i12] != 'T' || cArr[i + 15] != 'Z') {
                if (c5 == '-' && c7 == '-') {
                    if (c8 != 'T') {
                        c = ' ';
                        if (c8 != ' ') {
                            if (c2 != c) {
                            }
                            if (c2 == ' ') {
                            }
                            return null;
                        }
                    }
                    if (c9 == ':' && c11 == ':') {
                        iM6299 = AbstractC3682.m6299(i, cArr);
                        iM6429 = AbstractC3682.m6281(i9, cArr);
                        iM6283 = AbstractC3682.m6281(i12, cArr);
                        iM62832 = AbstractC3682.m6283(i + 11, cArr);
                        iM62833 = AbstractC3682.m6283(i10, cArr);
                        iM62835 = AbstractC3682.m6283(i + 15, cArr);
                    }
                    c = ' ';
                    if (c2 != c) {
                    }
                    if (c2 == ' ') {
                    }
                    return null;
                }
                c = ' ';
                if (c2 != c && c6 == c && c8 == c && c10 == ':') {
                    iM62834 = AbstractC3682.m6283(i, cArr);
                    iM64292 = m6429(c3, c4, c5);
                    iM62992 = AbstractC3682.m6299(i + 6, cArr);
                    iM6281 = AbstractC3682.m6281(i + 11, cArr);
                    iM62812 = AbstractC3682.m6281(i11, cArr);
                } else {
                    if (c2 == ' ' || c6 != ' ' || c8 != ' ' || c9 != ':' || c11 != ':') {
                        return null;
                    }
                    iM6283 = AbstractC3682.m6283(i, cArr);
                    iM6429 = m6429(c3, c4, c5);
                    iM6299 = AbstractC3682.m6299(i + 6, cArr);
                    iM62832 = AbstractC3682.m6283(i + 11, cArr);
                    iM62833 = AbstractC3682.m6283(i10, cArr);
                    iM62835 = AbstractC3682.m6283(i + 15, cArr);
                }
                i7 = iM62835;
                if ((i2 | i3 | i4 | i5 | i6 | i7) < 0) {
                    return null;
                }
                return LocalDateTime.of(i2, i3, i4, i5, i6, i7);
            }
            iM6299 = AbstractC3682.m6299(i, cArr);
            iM6429 = AbstractC3682.m6281(i8, cArr);
            iM6283 = AbstractC3682.m6281(i + 6, cArr);
            iM62832 = AbstractC3682.m6281(i + 9, cArr);
            iM62833 = AbstractC3682.m6281(i + 11, cArr);
            iM62835 = AbstractC3682.m6281(i10, cArr);
            i2 = iM6299;
            i3 = iM6429;
            i4 = iM6283;
            i5 = iM62832;
            i6 = iM62833;
            i7 = iM62835;
            if ((i2 | i3 | i4 | i5 | i6 | i7) < 0) {
            }
        }
        i6 = iM62812;
        i2 = iM62992;
        i3 = iM64292;
        i4 = iM62834;
        i5 = iM6281;
        i7 = iM62835;
        if ((i2 | i3 | i4 | i5 | i6 | i7) < 0) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static LocalDateTime m6415(byte[] bArr, int i) {
        if (i + 14 > bArr.length) {
            return null;
        }
        int iM6298 = AbstractC3682.m6298(bArr, i);
        int iM6280 = AbstractC3682.m6280(bArr, i + 4);
        int iM62802 = AbstractC3682.m6280(bArr, i + 6);
        int iM62803 = AbstractC3682.m6280(bArr, i + 8);
        int iM62804 = AbstractC3682.m6280(bArr, i + 10);
        int iM62805 = AbstractC3682.m6280(bArr, i + 12);
        if ((iM6298 | iM6280 | iM62802 | iM62803 | iM62804 | iM62805) < 0) {
            return null;
        }
        return LocalDateTime.of(iM6298, iM6280, iM62802, iM62803, iM62804, iM62805);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static ZoneId m6416(String str, ZoneId zoneId) {
        int iIndexOf;
        char cCharAt;
        if (str == null) {
            return zoneId != null ? zoneId : f9372;
        }
        switch (str) {
            case "000":
                return ZoneOffset.UTC;
            case "CST":
                return f9371;
            case "+08:00":
                return f9369;
            default:
                if (str.length() > 0 && (((cCharAt = str.charAt(0)) == '+' || cCharAt == '-') && str.charAt(str.length() - 1) != ']')) {
                    return ZoneOffset.of(str);
                }
                int iIndexOf2 = str.indexOf(91);
                return (iIndexOf2 <= 0 || (iIndexOf = str.indexOf(93, iIndexOf2)) <= 0) ? ZoneId.of(str) : ZoneId.of(str.substring(iIndexOf2 + 1, iIndexOf));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m6417(long j) {
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
    public static String m6418(long j, DateUtils$DateTimeFormatPattern dateUtils$DateTimeFormatPattern) {
        int iM6417;
        long j2;
        long jFloorDiv = Math.floorDiv(j, 1000L);
        ZoneId zoneId = f9371;
        ZoneId zoneId2 = f9372;
        if (zoneId2 == zoneId || zoneId2.getRules() == f9370) {
            iM6417 = m6417(jFloorDiv);
        } else {
            iM6417 = zoneId2.getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds();
        }
        long j3 = jFloorDiv + ((long) iM6417);
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
            throw new DateTimeException(AbstractC3275.m5143(j8, "Invalid year "));
        }
        int i5 = (int) j8;
        if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DASH || dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_SLASH || dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
            return m6419(i5, i3, i4, dateUtils$DateTimeFormatPattern);
        }
        long j9 = iFloorMod;
        if (j9 < 0 || j9 > 86399) {
            throw new DateTimeException(AbstractC3275.m5143(j9, "Invalid secondOfDay "));
        }
        int i6 = (int) (j9 / 3600);
        long j10 = j9 - ((long) (i6 * 3600));
        int i7 = (int) (j10 / 60);
        return m6420(i5, i3, i4, i6, i7, (int) (j10 - ((long) (i7 * 60))), dateUtils$DateTimeFormatPattern);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String m6419(int i, int i2, int i3, DateUtils$DateTimeFormatPattern dateUtils$DateTimeFormatPattern) {
        int i4 = i / 100;
        int i5 = i - (i4 * 100);
        BiFunction biFunction = AbstractC3687.f9267;
        if (biFunction != null) {
            byte[] bArr = new byte[10];
            if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
                AbstractC3682.m6315(0, bArr, i3);
                bArr[2] = 46;
                AbstractC3682.m6315(3, bArr, i2);
                bArr[5] = 46;
                AbstractC3682.m6315(6, bArr, i4);
                AbstractC3682.m6315(8, bArr, i5);
            } else {
                byte b = (byte) (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DASH ? 45 : 47);
                AbstractC3682.m6315(0, bArr, i4);
                AbstractC3682.m6315(2, bArr, i5);
                bArr[4] = b;
                AbstractC3682.m6315(5, bArr, i2);
                bArr[7] = b;
                AbstractC3682.m6315(8, bArr, i3);
            }
            return (String) biFunction.apply(bArr, (byte) 0);
        }
        char[] cArr = new char[10];
        if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DOT) {
            AbstractC3682.m6314(0, i3, cArr);
            cArr[2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            AbstractC3682.m6314(3, i2, cArr);
            cArr[5] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            AbstractC3682.m6314(6, i4, cArr);
            AbstractC3682.m6314(8, i5, cArr);
        } else {
            char c = dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DASH ? '-' : '/';
            AbstractC3682.m6314(0, i4, cArr);
            AbstractC3682.m6314(2, i5, cArr);
            cArr[4] = c;
            AbstractC3682.m6314(5, i2, cArr);
            cArr[7] = c;
            AbstractC3682.m6314(8, i3, cArr);
        }
        BiFunction biFunction2 = AbstractC3687.f9268;
        return biFunction2 != null ? (String) biFunction2.apply(cArr, Boolean.TRUE) : new String(cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m6420(int i, int i2, int i3, int i4, int i5, int i6, DateUtils$DateTimeFormatPattern dateUtils$DateTimeFormatPattern) {
        int i7 = i / 100;
        int i8 = i - (i7 * 100);
        BiFunction biFunction = AbstractC3687.f9267;
        if (biFunction != null) {
            byte[] bArr = new byte[19];
            if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT) {
                AbstractC3682.m6315(0, bArr, i3);
                bArr[2] = 46;
                AbstractC3682.m6315(3, bArr, i2);
                bArr[5] = 46;
                AbstractC3682.m6315(6, bArr, i7);
                AbstractC3682.m6315(8, bArr, i8);
                bArr[10] = 32;
            } else {
                int i9 = dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH ? 32 : 84;
                byte b = (byte) (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH ? 47 : 45);
                AbstractC3682.m6315(0, bArr, i7);
                AbstractC3682.m6315(2, bArr, i8);
                bArr[4] = b;
                AbstractC3682.m6315(5, bArr, i2);
                bArr[7] = b;
                AbstractC3682.m6315(8, bArr, i3);
                bArr[10] = (byte) i9;
            }
            AbstractC3682.m6278(bArr, 11, i4, i5, i6);
            return (String) biFunction.apply(bArr, (byte) 0);
        }
        char[] cArr = new char[19];
        if (dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT) {
            AbstractC3682.m6314(0, i3, cArr);
            cArr[2] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            AbstractC3682.m6314(3, i2, cArr);
            cArr[5] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            AbstractC3682.m6314(6, i7, cArr);
            AbstractC3682.m6314(8, i8, cArr);
            cArr[10] = ' ';
        } else {
            char c = dateUtils$DateTimeFormatPattern != DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH ? 'T' : ' ';
            char c2 = dateUtils$DateTimeFormatPattern == DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH ? '/' : SignatureVisitor.SUPER;
            AbstractC3682.m6314(0, i7, cArr);
            AbstractC3682.m6314(2, i8, cArr);
            cArr[4] = c2;
            AbstractC3682.m6314(5, i2, cArr);
            cArr[7] = c2;
            AbstractC3682.m6314(8, i3, cArr);
            cArr[10] = c;
        }
        AbstractC3682.m6279(cArr, 11, i4, i5, i6);
        BiFunction biFunction2 = AbstractC3687.f9268;
        return biFunction2 != null ? (String) biFunction2.apply(cArr, Boolean.TRUE) : new String(cArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static long m6421(int i, int i2, int i3) {
        long j = (i3 - 1) + (((i2 * 367) - 362) / 12) + ((i + 399) / 400) + (((i + 3) / 4) - ((i + 99) / 100)) + (i * 365);
        if (i2 > 2) {
            j = ((i & 3) != 0 || (i % 100 == 0 && i % 400 != 0)) ? j - 2 : j - 1;
        }
        return j - 719528;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static LocalDate m6422(byte[] bArr, int i) {
        int iM6280;
        int iM62802;
        int iM6298;
        if (i + 11 > bArr.length) {
            return null;
        }
        int i2 = i + 4;
        if (bArr[i2] != 45 || bArr[i + 7] != 45 || bArr[i + 10] != 90) {
            if (bArr[i + 2] == 32 && bArr[i + 6] == 32) {
                int iM62982 = AbstractC3682.m6298(bArr, i + 7);
                int iM6429 = m6429((char) bArr[i + 3], (char) bArr[i2], (char) bArr[i + 5]);
                iM6280 = AbstractC3682.m6280(bArr, i);
                iM62802 = iM6429;
                iM6298 = iM62982;
            }
            return null;
        }
        iM6298 = AbstractC3682.m6298(bArr, i);
        iM62802 = AbstractC3682.m6280(bArr, i + 5);
        iM6280 = AbstractC3682.m6280(bArr, i + 8);
        if ((iM6298 | iM62802 | iM6280) >= 0 && (iM6298 != 0 || iM62802 != 0 || iM6280 != 0)) {
            return LocalDate.of(iM6298, iM62802, iM6280);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static LocalDate m6423(int i, char[] cArr) {
        int iM6281;
        int iM62812;
        int iM6299;
        if (i + 11 > cArr.length) {
            return null;
        }
        char c = cArr[i + 4];
        int i2 = i + 7;
        char c2 = cArr[i2];
        char c3 = cArr[i + 10];
        if ((c != 24180 || c2 != 26376 || c3 != 26085) && ((c != '-' || c2 != '-' || c3 != 'Z') && (c != 45380 || c2 != 50900 || c3 != 51068))) {
            if (cArr[i + 2] == ' ' && cArr[i + 6] == ' ') {
                int iM62992 = AbstractC3682.m6299(i2, cArr);
                int iM6429 = m6429(cArr[i + 3], c, cArr[i + 5]);
                iM6281 = AbstractC3682.m6281(i, cArr);
                iM62812 = iM6429;
                iM6299 = iM62992;
            }
            return null;
        }
        iM6299 = AbstractC3682.m6299(i, cArr);
        iM62812 = AbstractC3682.m6281(i + 5, cArr);
        iM6281 = AbstractC3682.m6281(i + 8, cArr);
        if ((iM6299 | iM62812 | iM6281) >= 0 && (iM6299 != 0 || iM62812 != 0 || iM6281 != 0)) {
            return LocalDate.of(iM6299, iM62812, iM6281);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static LocalDate m6424(int i, char[] cArr) {
        int iM6281;
        int iM6283;
        int iM6299;
        int iM62992;
        int iM6429;
        int iM62832;
        int iM62833;
        int iM62812;
        int iM62993;
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
            iM62992 = AbstractC3682.m6299(i, cArr);
            iM6429 = AbstractC3682.m6281(i + 5, cArr);
            iM62832 = AbstractC3682.m6283(i4, cArr);
        } else if ((c3 == '-' && c4 == '-') || (c3 == '/' && c4 == '/')) {
            iM62992 = AbstractC3682.m6299(i, cArr);
            iM6429 = AbstractC3682.m6283(i + 5, cArr);
            iM62832 = AbstractC3682.m6281(i3, cArr);
        } else if ((c3 == 24180 && c4 == 26376 && c6 == 26085) || (c3 == 45380 && c4 == 50900 && c6 == 51068)) {
            iM62992 = AbstractC3682.m6299(i, cArr);
            iM6429 = AbstractC3682.m6283(i + 5, cArr);
            iM62832 = AbstractC3682.m6283(i3, cArr);
        } else {
            if (c == '.' && c3 == '.') {
                iM62833 = AbstractC3682.m6283(i, cArr);
                iM62812 = AbstractC3682.m6281(i2, cArr);
                iM62993 = AbstractC3682.m6299(i + 5, cArr);
            } else if ((c2 == '.' && c3 == '.') || (c2 == '-' && c3 == '-')) {
                iM62833 = AbstractC3682.m6281(i, cArr);
                iM62812 = AbstractC3682.m6283(i + 3, cArr);
                iM62993 = AbstractC3682.m6299(i + 5, cArr);
            } else if (c == '-' && c3 == '-') {
                iM62833 = AbstractC3682.m6283(i, cArr);
                iM62812 = AbstractC3682.m6281(i2, cArr);
                iM62993 = AbstractC3682.m6299(i + 5, cArr);
            } else if (c2 == '-' && c4 == '-') {
                int iM62813 = AbstractC3682.m6281(i, cArr);
                iM6429 = m6429(cArr[i + 3], c3, cArr[i + 5]);
                int iM62814 = AbstractC3682.m6281(i3, cArr);
                if (iM62814 != -1) {
                    iM62814 += 2000;
                }
                iM62992 = iM62814;
                iM62832 = iM62813;
            } else {
                if (c == '/' && c3 == '/') {
                    iM6281 = AbstractC3682.m6283(i, cArr);
                    iM6283 = AbstractC3682.m6281(i2, cArr);
                    iM6299 = AbstractC3682.m6299(i + 5, cArr);
                } else {
                    if (c2 != '/' || c3 != '/') {
                        return null;
                    }
                    iM6281 = AbstractC3682.m6281(i, cArr);
                    iM6283 = AbstractC3682.m6283(i + 3, cArr);
                    iM6299 = AbstractC3682.m6299(i + 5, cArr);
                }
                int i5 = iM6281;
                iM62992 = iM6299;
                iM6429 = i5;
                iM62832 = iM6283;
            }
            iM62832 = iM62833;
            iM62992 = iM62993;
            iM6429 = iM62812;
        }
        if ((iM62992 | iM6429 | iM62832) <= 0) {
            return null;
        }
        return LocalDate.of(iM62992, iM6429, iM62832);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static LocalDate m6425(byte[] bArr, int i) {
        int iM6280;
        int iM6282;
        int iM6298;
        int iM62982;
        int iM62802;
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
            iM62982 = AbstractC3682.m6298(bArr, i);
            iM6280 = AbstractC3682.m6280(bArr, i + 5);
            iM62802 = AbstractC3682.m6282(bArr, i + 8);
        } else if ((c3 == '-' && c4 == '-') || (c3 == '/' && c4 == '/')) {
            iM62982 = AbstractC3682.m6298(bArr, i);
            iM6280 = AbstractC3682.m6282(bArr, i + 5);
            iM62802 = AbstractC3682.m6280(bArr, i3);
        } else {
            if (c == '.' && c3 == '.') {
                iM6282 = AbstractC3682.m6282(bArr, i);
                iM6280 = AbstractC3682.m6280(bArr, i2);
                iM6298 = AbstractC3682.m6298(bArr, i + 5);
            } else if ((c2 == '.' && c3 == '.') || (c2 == '-' && c3 == '-')) {
                iM6282 = AbstractC3682.m6280(bArr, i);
                iM6280 = AbstractC3682.m6282(bArr, i + 3);
                iM6298 = AbstractC3682.m6298(bArr, i + 5);
            } else if (c == '-' && c3 == '-') {
                iM6282 = AbstractC3682.m6282(bArr, i);
                iM6280 = AbstractC3682.m6280(bArr, i2);
                iM6298 = AbstractC3682.m6298(bArr, i + 5);
            } else if (c2 == '-' && c4 == '-') {
                iM6282 = AbstractC3682.m6280(bArr, i);
                iM6280 = m6429((char) bArr[i + 3], c3, (char) bArr[i + 5]);
                iM6298 = AbstractC3682.m6280(bArr, i3);
                if (iM6298 != -1) {
                    iM6298 += 2000;
                }
            } else if (c == '/' && c3 == '/') {
                int iM62822 = AbstractC3682.m6282(bArr, i);
                int iM62803 = AbstractC3682.m6280(bArr, i2);
                iM62982 = AbstractC3682.m6298(bArr, i + 5);
                iM62802 = iM62803;
                iM6280 = iM62822;
            } else {
                if (c2 != '/' || c3 != '/') {
                    return null;
                }
                iM6280 = AbstractC3682.m6280(bArr, i);
                iM6282 = AbstractC3682.m6282(bArr, i + 3);
                iM6298 = AbstractC3682.m6298(bArr, i + 5);
            }
            int i4 = iM6282;
            iM62982 = iM6298;
            iM62802 = i4;
        }
        if ((iM62982 | iM6280 | iM62802) <= 0) {
            return null;
        }
        return LocalDate.of(iM62982, iM6280, iM62802);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static LocalDate m6426(int i, char[] cArr) {
        int iM6299;
        int iM6281;
        int iM62812;
        if (i + 8 > cArr.length) {
            return null;
        }
        char c = cArr[i + 1];
        char c2 = cArr[i + 3];
        int i2 = i + 4;
        char c3 = cArr[i2];
        if (c3 == '-' && cArr[i + 6] == '-') {
            iM6299 = AbstractC3682.m6299(i, cArr);
            iM6281 = AbstractC3682.m6283(i + 5, cArr);
            iM62812 = AbstractC3682.m6283(i + 7, cArr);
        } else if (c == '/' && c2 == '/') {
            iM6281 = AbstractC3682.m6283(i, cArr);
            iM62812 = AbstractC3682.m6283(i + 2, cArr);
            iM6299 = AbstractC3682.m6299(i2, cArr);
        } else if (c == '-' && cArr[i + 5] == '-') {
            int iM6283 = AbstractC3682.m6283(i, cArr);
            iM6281 = m6429(cArr[i + 2], c2, c3);
            int iM62813 = AbstractC3682.m6281(i + 6, cArr);
            if (iM62813 != -1) {
                iM62813 += 2000;
            }
            iM6299 = iM62813;
            iM62812 = iM6283;
        } else {
            iM6299 = AbstractC3682.m6299(i, cArr);
            iM6281 = AbstractC3682.m6281(i2, cArr);
            iM62812 = AbstractC3682.m6281(i + 6, cArr);
        }
        if ((iM6299 | iM6281 | iM62812) <= 0) {
            return null;
        }
        return LocalDate.of(iM6299, iM6281, iM62812);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static LocalDate m6427(byte[] bArr, int i) {
        int iM6298;
        int iM6280;
        int iM62802;
        if (i + 8 > bArr.length) {
            return null;
        }
        char c = (char) bArr[i + 1];
        char c2 = (char) bArr[i + 3];
        int i2 = i + 4;
        char c3 = (char) bArr[i2];
        if (c3 == '-' && bArr[i + 6] == 45) {
            iM6298 = AbstractC3682.m6298(bArr, i);
            iM6280 = AbstractC3682.m6282(bArr, i + 5);
            iM62802 = AbstractC3682.m6282(bArr, i + 7);
        } else if (c == '/' && c2 == '/') {
            iM6280 = AbstractC3682.m6282(bArr, i);
            int iM6282 = AbstractC3682.m6282(bArr, i + 2);
            iM6298 = AbstractC3682.m6298(bArr, i2);
            iM62802 = iM6282;
        } else if (c == '-' && bArr[i + 5] == 45) {
            int iM62822 = AbstractC3682.m6282(bArr, i);
            iM6280 = m6429((char) bArr[i + 2], c2, c3);
            int iM62803 = AbstractC3682.m6280(bArr, i + 6);
            if (iM62803 != -1) {
                iM62803 += 2000;
            }
            iM6298 = iM62803;
            iM62802 = iM62822;
        } else {
            iM6298 = AbstractC3682.m6298(bArr, i);
            iM6280 = AbstractC3682.m6280(bArr, i2);
            iM62802 = AbstractC3682.m6280(bArr, i + 6);
        }
        if ((iM6298 | iM6280 | iM62802) <= 0) {
            return null;
        }
        return LocalDate.of(iM6298, iM6280, iM62802);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static Date m6428(String str) {
        long jM6455 = m6455(str, f9372);
        if (jM6455 == 0) {
            return null;
        }
        return new Date(jM6455);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static int m6429(char c, char c2, char c3) {
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
    */
    public static LocalDate m6430(int i, char[] cArr) {
        LocalDate localDate;
        int iM6429;
        int iM6299;
        int iM6283;
        int iM6281;
        int iM62992;
        if (i + 10 > cArr.length) {
            return null;
        }
        char c = cArr[i + 1];
        char c2 = cArr[i + 2];
        char c3 = cArr[i + 4];
        int i2 = i + 5;
        char c4 = cArr[i2];
        int i3 = i + 6;
        char c5 = cArr[i3];
        int i4 = i + 7;
        char c6 = cArr[i4];
        char c7 = cArr[i + 9];
        if ((c3 == '-' && c6 == '-') || (c3 == '/' && c6 == '/')) {
            iM6299 = AbstractC3682.m6299(i, cArr);
            iM6429 = AbstractC3682.m6281(i2, cArr);
            iM6283 = AbstractC3682.m6281(i + 8, cArr);
        } else {
            if ((c2 == '.' && c4 == '.') || (c2 == '-' && c4 == '-')) {
                iM6281 = AbstractC3682.m6281(i, cArr);
                iM6429 = AbstractC3682.m6281(i + 3, cArr);
                iM62992 = AbstractC3682.m6299(i3, cArr);
            } else if (c2 == '/' && c4 == '/') {
                iM6429 = AbstractC3682.m6281(i, cArr);
                iM6281 = AbstractC3682.m6281(i + 3, cArr);
                iM62992 = AbstractC3682.m6299(i3, cArr);
            } else {
                if (c3 != 24180 || c5 != 26376 || c7 != 26085) {
                    localDate = null;
                    if (c3 != 45380 || c5 != 50900 || c7 != 51068) {
                        if ((c3 == 24180 && c6 == 26376 && c7 == 26085) || (c3 == 45380 && c6 == 50900 && c7 == 51068)) {
                            iM6299 = AbstractC3682.m6299(i, cArr);
                            iM6429 = AbstractC3682.m6281(i2, cArr);
                            iM6283 = AbstractC3682.m6283(i + 8, cArr);
                        } else {
                            if (c != ' ' || c4 != ' ') {
                                return null;
                            }
                            int iM62832 = AbstractC3682.m6283(i, cArr);
                            iM6429 = m6429(c2, cArr[i + 3], c3);
                            iM6299 = AbstractC3682.m6299(i3, cArr);
                            iM6283 = iM62832;
                        }
                    }
                    return ((iM6299 | iM6429) | iM6283) <= 0 ? localDate : LocalDate.of(iM6299, iM6429, iM6283);
                }
                localDate = null;
                iM6299 = AbstractC3682.m6299(i, cArr);
                iM6429 = AbstractC3682.m6283(i2, cArr);
                iM6283 = AbstractC3682.m6281(i4, cArr);
                if (((iM6299 | iM6429) | iM6283) <= 0) {
                }
            }
            int i5 = iM6281;
            iM6299 = iM62992;
            iM6283 = i5;
        }
        localDate = null;
        if (((iM6299 | iM6429) | iM6283) <= 0) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static LocalDate m6431(byte[] bArr, int i) {
        int iM6429;
        int iM6298;
        int iM6280;
        int iM62802;
        int iM62982;
        if (i + 10 > bArr.length) {
            return null;
        }
        char c = (char) bArr[i + 2];
        char c2 = (char) bArr[i + 4];
        int i2 = i + 5;
        char c3 = (char) bArr[i2];
        char c4 = (char) bArr[i + 7];
        if ((c2 == '-' && c4 == '-') || (c2 == '/' && c4 == '/')) {
            iM6298 = AbstractC3682.m6298(bArr, i);
            iM6429 = AbstractC3682.m6280(bArr, i2);
            iM6280 = AbstractC3682.m6280(bArr, i + 8);
        } else {
            if ((c == '.' && c3 == '.') || (c == '-' && c3 == '-')) {
                iM62802 = AbstractC3682.m6280(bArr, i);
                iM6429 = AbstractC3682.m6280(bArr, i + 3);
                iM62982 = AbstractC3682.m6298(bArr, i + 6);
            } else if (c == '/' && c3 == '/') {
                iM6429 = AbstractC3682.m6280(bArr, i);
                iM62802 = AbstractC3682.m6280(bArr, i + 3);
                iM62982 = AbstractC3682.m6298(bArr, i + 6);
            } else {
                if (bArr[i + 1] != 32 || c3 != ' ') {
                    return null;
                }
                int iM6282 = AbstractC3682.m6282(bArr, i);
                iM6429 = m6429(c, (char) bArr[i + 3], c2);
                iM6298 = AbstractC3682.m6298(bArr, i + 6);
                iM6280 = iM6282;
            }
            int i3 = iM62802;
            iM6298 = iM62982;
            iM6280 = i3;
        }
        if ((iM6298 | iM6429 | iM6280) <= 0) {
            return null;
        }
        return LocalDate.of(iM6298, iM6429, iM6280);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static Date m6432(String str, String str2, ZoneId zoneId) {
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
            long jM6455 = m6455(str, zoneId);
            if (jM6455 == 0) {
                return null;
            }
            return new Date(jM6455);
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
        ZoneId zoneId3 = f9372;
        switch (b) {
            case 0:
                return new Date(m6455(str, zoneId3));
            case 1:
                LocalDate localDate = LocalDate.parse(str, DateTimeFormatter.ofPattern(str2));
                return new Date(m6436(zoneId, localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), 0, 0, 0, 0));
            case 2:
                return new Date(m6445(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DASH));
            case 3:
                return new Date(m6445(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_SLASH));
            case 4:
                return new Date(m6444(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_SLASH));
            case 5:
                if (AbstractC3687.f9263 == 8) {
                    char[] cArrM6330 = AbstractC3687.m6330(str);
                    if (cArrM6330.length != 19) {
                        throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                    }
                    cCharAt = cArrM6330[0];
                    cCharAt2 = cArrM6330[1];
                    cCharAt3 = cArrM6330[2];
                    cCharAt4 = cArrM6330[3];
                    char c15 = cArrM6330[4];
                    cCharAt5 = cArrM6330[5];
                    char c16 = cArrM6330[6];
                    c9 = cArrM6330[7];
                    c10 = cArrM6330[8];
                    char c17 = cArrM6330[9];
                    char c18 = cArrM6330[10];
                    char c19 = cArrM6330[11];
                    char c20 = cArrM6330[12];
                    char c21 = cArrM6330[13];
                    char c22 = cArrM6330[14];
                    char c23 = cArrM6330[15];
                    char c24 = cArrM6330[16];
                    char c25 = cArrM6330[17];
                    c11 = c24;
                    c = c16;
                    c2 = c17;
                    c12 = c18;
                    c4 = c19;
                    c5 = c20;
                    cCharAt7 = cArrM6330[18];
                    c3 = c21;
                    c6 = c22;
                    c7 = c23;
                    cCharAt6 = c25;
                    zoneId2 = zoneId3;
                    c8 = c15;
                } else {
                    ToIntFunction toIntFunction = AbstractC3687.f9271;
                    if (toIntFunction == null || toIntFunction.applyAsInt(str) != 0 || (function = AbstractC3687.f9272) == null) {
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
                int iM703 = (cCharAt4 - '0') + AbstractC0900.m703(cCharAt3, 48, 10, AbstractC0900.m703(cCharAt2, 48, 100, (cCharAt - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
                if (cCharAt5 < '0' || cCharAt5 > '9' || c < '0' || c > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i = (c - '0') + ((cCharAt5 - '0') * 10);
                if ((i == 0 && iM703 != 0) || i > 12) {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                if (c10 < '0' || c10 > '9' || c2 < '0' || c2 > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i2 = (c2 - '0') + ((c10 - '0') * 10);
                int i3 = i != 2 ? (i == 4 || i == 6 || i == 9 || i == 11) ? 30 : 31 : ((iM703 & 3) != 0 || (iM703 % 100 == 0 && iM703 % 400 != 0)) ? 28 : 29;
                if ((i2 == 0 && iM703 != 0) || i2 > i3) {
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
                if (iM703 == 0 && i == 0 && i2 == 0) {
                    iM703 = 1970;
                    i2 = 1;
                    i = 1;
                }
                long jM6421 = (m6421(iM703, i, i2) * 86400) + ((long) (i4 * 3600)) + ((long) (i5 * 60)) + ((long) i6);
                ZoneId zoneId4 = zoneId == null ? zoneId2 : zoneId;
                return new Date((jM6421 - ((long) ((!(zoneId4 == f9371 || zoneId4.getRules() == f9370) || jM6421 < 684900000) ? (zoneId4 == ZoneOffset.UTC || "UTC".equals(zoneId4.getId())) ? 0 : zoneId4.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM703, i, i2), LocalTime.of(i4, i5, i6, 0))).getTotalSeconds() : 28800))) * 1000);
            case 6:
                return new Date(m6444(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DOT));
            case 7:
                return new Date(m6444(str, zoneId, DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T));
            case 8:
                return m6428(str);
            default:
                ZoneId zoneId5 = zoneId == null ? zoneId3 : zoneId;
                LocalDateTime localDateTime = LocalDateTime.parse(str, DateTimeFormatter.ofPattern(str2));
                return new Date(m6436(zoneId5, localDateTime.getYear(), localDateTime.getMonthValue(), localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LocalDate m6433(String str) {
        LocalDate localDateM6426;
        Function function;
        if (str == null) {
            return null;
        }
        ToIntFunction toIntFunction = AbstractC3687.f9271;
        if (toIntFunction == null || (function = AbstractC3687.f9272) == null || toIntFunction.applyAsInt(str) != 0) {
            char[] cArrM6330 = AbstractC3687.m6330(str);
            int length = cArrM6330.length;
            if (length == 0) {
                localDateM6426 = null;
            } else {
                if (length > cArrM6330.length) {
                    String str2 = new String(cArrM6330, 0, length);
                    throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                }
                switch (length) {
                    case 8:
                        localDateM6426 = m6426(0, cArrM6330);
                        break;
                    case 9:
                        localDateM6426 = m6424(0, cArrM6330);
                        break;
                    case 10:
                        localDateM6426 = m6430(0, cArrM6330);
                        break;
                    case 11:
                        localDateM6426 = m6423(0, cArrM6330);
                        break;
                    default:
                        if (length != 4 || cArrM6330[0] != 'n' || cArrM6330[1] != 'u' || cArrM6330[2] != 'l' || cArrM6330[3] != 'l') {
                            String str3 = new String(cArrM6330, 0, length);
                            throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
                        }
                        localDateM6426 = null;
                        break;
                }
            }
        } else {
            byte[] bArr = (byte[]) function.apply(str);
            int length2 = bArr.length;
            if (length2 != 0) {
                if (length2 > bArr.length) {
                    String str4 = new String(bArr, 0, length2);
                    throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
                }
                switch (length2) {
                    case 8:
                        localDateM6426 = m6427(bArr, 0);
                        break;
                    case 9:
                        localDateM6426 = m6425(bArr, 0);
                        break;
                    case 10:
                        localDateM6426 = m6431(bArr, 0);
                        break;
                    case 11:
                        localDateM6426 = m6422(bArr, 0);
                        break;
                    default:
                        if (length2 != 4 || bArr[0] != 110 || bArr[1] != 117 || bArr[2] != 108 || bArr[3] != 108) {
                            String str5 = new String(bArr, 0, length2);
                            throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
                        }
                        localDateM6426 = null;
                        break;
                }
            }
        }
        if (localDateM6426 != null) {
            return localDateM6426;
        }
        switch (str) {
            case "0000-0-00":
            case "00000000":
            case "":
            case "null":
            case "0000年00月00日":
            case "0000-00-00":
                return null;
            default:
                throw new DateTimeParseException(str, str, 0);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m6434(char c, char c2) {
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
    public static long m6435(byte[] bArr, int i) {
        long jReverseBytes = AbstractC3687.f9266.getLong(bArr, AbstractC3687.f9265 + ((long) i));
        if (AbstractC3687.f9276) {
            jReverseBytes = Long.reverseBytes(jReverseBytes);
        }
        if (((((-1085102592571150096L) & jReverseBytes) - 3472328296227680304L) | (((1085102592571150095L & jReverseBytes) + 434034439958300166L) & (-1085366475377544976L))) != 0 || (16492675399680L & jReverseBytes) != 10995116933120L) {
            return -1L;
        }
        long j = 4222124902318095L & jReverseBytes;
        return (j << 3) + (j << 1) + ((jReverseBytes & 1080863974993432320L) >> 8);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static long m6436(ZoneId zoneId, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (zoneId == null) {
            zoneId = f9372;
        }
        long jM6421 = (m6421(i, i2, i3) * 86400) + ((long) (i4 * 3600)) + ((long) (i5 * 60)) + ((long) i6);
        int totalSeconds = 0;
        if ((zoneId == f9371 || zoneId.getRules() == f9370) && jM6421 >= 684900000) {
            totalSeconds = 28800;
        } else if (zoneId != ZoneOffset.UTC && !"UTC".equals(zoneId.getId())) {
            totalSeconds = zoneId.getRules().getOffset(LocalDateTime.of(LocalDate.of(i, i2, i3), LocalTime.of(i4, i5, i6, i7))).getTotalSeconds();
        }
        long j = (jM6421 - ((long) totalSeconds)) * 1000;
        return i7 != 0 ? j + ((long) (i7 / 1000000)) : j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static int m6437(byte b, byte b2, byte b3) {
        return m6429((char) b, (char) b2, (char) b3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static LocalDateTime m6438(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9, char c10, char c11, char c12, char c13, char c14, char c15, char c16, char c17, char c18, char c19, char c20, char c21, char c22, char c23) {
        if (c >= '0' && c <= '9' && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            int iM703 = (c4 - '0') + AbstractC0900.m703(c3, 48, 10, AbstractC0900.m703(c2, 48, 100, (c - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
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
                                    return LocalDateTime.of(iM703, i, i2, i3, i4, i5, (c23 - '0') + AbstractC0900.m703(c22, 48, 10, AbstractC0900.m703(c21, 48, 100, AbstractC0900.m703(c20, 48, DescriptorProtos$Edition.EDITION_2023_VALUE, AbstractC0900.m703(c19, 48, 10000, AbstractC0900.m703(c18, 48, 100000, AbstractC0900.m703(c17, 48, 1000000, AbstractC0900.m703(c16, 48, 10000000, (c15 - '0') * 100000000))))))));
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
    public static LocalTime m6439(int i, int i2, int i3) {
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
    */
    public static ZonedDateTime m6440(char[] cArr, int i, int i2, ZoneId zoneId) {
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
        int i3;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        char c20;
        char c21;
        char c22;
        char c23;
        char c24;
        char c25;
        char c26;
        char c27;
        char c28;
        char c29;
        char c30;
        char c31;
        char c32;
        char c33;
        char c34;
        char c35;
        char c36;
        char c37;
        char[] cArr2;
        char c38;
        int i4;
        boolean z;
        String str;
        boolean z2;
        int i5;
        char c39;
        char c40;
        char c41;
        char c42;
        char c43;
        char c44;
        int i6;
        char c45;
        char c46;
        char c47;
        char c48;
        char c49;
        char c50;
        char c51;
        char c52;
        char c53;
        char c54;
        char c55;
        char c56;
        char c57;
        char c58;
        char c59;
        char c60;
        char c61;
        char c62;
        char c63;
        char c64;
        char c65;
        char c66;
        char c67;
        char c68;
        char c69;
        char c70;
        char c71;
        char c72;
        char c73;
        char c74;
        char c75;
        char c76;
        char c77;
        char c78;
        char c79;
        char c80;
        char c81;
        char c82;
        char c83;
        char c84;
        char c85;
        char c86;
        char c87;
        char c88;
        char c89;
        char c90;
        char c91;
        char c92;
        char c93;
        char c94;
        char c95;
        char c96;
        char c97;
        char c98;
        char c99;
        char c100;
        char c101;
        char c102;
        char c103;
        char c104;
        char c105;
        char c106;
        char c107;
        char c108;
        char c109;
        char c110;
        char c111;
        char c112;
        char c113;
        char c114;
        char c115;
        char c116;
        char c117;
        char c118;
        char c119;
        char c120;
        char c121;
        char c122;
        char c123;
        char c124;
        char c125;
        char c126;
        char c127;
        char c128;
        char c129;
        char c130;
        char c131;
        char c132;
        char c133;
        char c134;
        char c135;
        ZoneId zoneId2;
        ZoneId zoneIdM6416;
        ZoneId zoneId3;
        if (cArr == null || i2 == 0) {
            return null;
        }
        if (i2 == 16) {
            if (i + 16 > cArr.length) {
                String str2 = new String(cArr, i, cArr.length - i);
                throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
            }
            char c136 = cArr[i];
            char c137 = cArr[i + 1];
            char c138 = cArr[i + 2];
            char c139 = cArr[i + 3];
            char c140 = cArr[i + 4];
            char c141 = cArr[i + 5];
            char c142 = cArr[i + 6];
            char c143 = cArr[i + 7];
            char c144 = cArr[i + 8];
            char c145 = cArr[i + 9];
            int i7 = i + 10;
            char c146 = cArr[i7];
            char c147 = cArr[i + 13];
            if (c140 != '-' || c143 != '-' || ((c146 != '+' && c146 != '-') || c147 != ':')) {
                String str3 = new String(cArr, i, 16);
                throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
            }
            if (c136 < '0' || c136 > '9' || c137 < '0' || c137 > '9' || c138 < '0' || c138 > '9' || c139 < '0' || c139 > '9') {
                String str4 = new String(cArr, i, 16);
                throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
            }
            int iM703 = (c139 - '0') + AbstractC0900.m703(c138, 48, 10, AbstractC0900.m703(c137, 48, 100, (c136 - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
            if (c141 < '0' || c141 > '9' || c142 < '0' || c142 > '9') {
                String str5 = new String(cArr, i, 16);
                throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
            }
            int i8 = (c142 - '0') + ((c141 - '0') * 10);
            if (c144 < '0' || c144 > '9' || c145 < '0' || c145 > '9') {
                String str6 = new String(cArr, i, 16);
                throw new DateTimeParseException("illegal input ".concat(str6), str6, 0);
            }
            return ZonedDateTime.of(LocalDateTime.of(LocalDate.of(iM703, i8, (c145 - '0') + ((c144 - '0') * 10)), LocalTime.MIN), m6416(new String(cArr, i7, 6), zoneId));
        }
        if (i2 < 19) {
            String str7 = new String(cArr, i, cArr.length - i);
            throw new DateTimeParseException("illegal input ".concat(str7), str7, 0);
        }
        char c148 = cArr[i];
        char c149 = cArr[i + 1];
        char c150 = cArr[i + 2];
        char c151 = cArr[i + 3];
        char c152 = cArr[i + 4];
        char c153 = cArr[i + 5];
        char c154 = cArr[i + 6];
        char c155 = cArr[i + 7];
        char c156 = cArr[i + 8];
        char c157 = cArr[i + 9];
        char c158 = cArr[i + 10];
        char c159 = cArr[i + 11];
        char c160 = cArr[i + 12];
        char c161 = cArr[i + 13];
        char c162 = cArr[i + 14];
        char c163 = cArr[i + 15];
        char c164 = cArr[i + 16];
        char c165 = cArr[i + 17];
        char c166 = cArr[i + 18];
        char c167 = i2 == 19 ? ' ' : cArr[i + 19];
        switch (i2) {
            case 19:
            case 20:
                c = c148;
                c2 = c149;
                c3 = '0';
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c11 = 0;
                c12 = 0;
                break;
            case 21:
                c2 = c149;
                c11 = cArr[i + 20];
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                c = c148;
                c3 = '0';
                break;
            case 22:
                char c168 = cArr[i + 20];
                c13 = cArr[i + 21];
                c11 = c168;
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                c = c148;
                c3 = c13;
                c2 = c149;
                break;
            case 23:
                char c169 = cArr[i + 20];
                c13 = cArr[i + 21];
                c4 = cArr[i + 22];
                c11 = c169;
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                c = c148;
                c3 = c13;
                c2 = c149;
                break;
            case 24:
                char c170 = cArr[i + 20];
                c13 = cArr[i + 21];
                c4 = cArr[i + 22];
                c11 = c170;
                c5 = cArr[i + 23];
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                c = c148;
                c3 = c13;
                c2 = c149;
                break;
            case 25:
                char c171 = cArr[i + 20];
                c13 = cArr[i + 21];
                c4 = cArr[i + 22];
                c11 = c171;
                c5 = cArr[i + 23];
                c6 = cArr[i + 24];
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                c = c148;
                c3 = c13;
                c2 = c149;
                break;
            case 26:
                char c172 = cArr[i + 20];
                c13 = cArr[i + 21];
                c4 = cArr[i + 22];
                c11 = c172;
                c5 = cArr[i + 23];
                c6 = cArr[i + 24];
                c7 = cArr[i + 25];
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                c = c148;
                c3 = c13;
                c2 = c149;
                break;
            case 27:
                char c173 = cArr[i + 20];
                c13 = cArr[i + 21];
                c4 = cArr[i + 22];
                c11 = c173;
                c5 = cArr[i + 23];
                c6 = cArr[i + 24];
                c7 = cArr[i + 25];
                c8 = cArr[i + 26];
                c9 = '0';
                c10 = '0';
                c12 = 0;
                c = c148;
                c3 = c13;
                c2 = c149;
                break;
            case 28:
                char c174 = cArr[i + 20];
                c13 = cArr[i + 21];
                c4 = cArr[i + 22];
                char c175 = cArr[i + 23];
                c11 = c174;
                c5 = c175;
                c6 = cArr[i + 24];
                c7 = cArr[i + 25];
                c8 = cArr[i + 26];
                c9 = cArr[i + 27];
                c10 = '0';
                c12 = 0;
                c = c148;
                c3 = c13;
                c2 = c149;
                break;
            case 29:
                char c176 = cArr[i + 20];
                c13 = cArr[i + 21];
                c4 = cArr[i + 22];
                char c177 = cArr[i + 23];
                char c178 = cArr[i + 24];
                c11 = c176;
                c5 = c177;
                c6 = c178;
                c7 = cArr[i + 25];
                c8 = cArr[i + 26];
                c9 = cArr[i + 27];
                c10 = cArr[i + 28];
                c12 = 0;
                c = c148;
                c3 = c13;
                c2 = c149;
                break;
            default:
                char c179 = cArr[i + 20];
                c13 = cArr[i + 21];
                c4 = cArr[i + 22];
                char c180 = cArr[i + 23];
                char c181 = cArr[i + 24];
                char c182 = cArr[i + 25];
                c11 = c179;
                c5 = c180;
                c6 = c181;
                c7 = c182;
                c8 = cArr[i + 26];
                c9 = cArr[i + 27];
                c10 = cArr[i + 28];
                c12 = cArr[i + 29];
                c = c148;
                c3 = c13;
                c2 = c149;
                break;
        }
        if (c152 == '-' && c155 == '-' && ((c158 == ' ' || c158 == 'T') && c161 == ':' && c164 == ':' && (c167 == '[' || c167 == 'Z' || c167 == '+' || c167 == '-' || c167 == ' '))) {
            z = false;
            cArr2 = cArr;
            i4 = i2;
            c34 = c150;
            c33 = c151;
            c32 = c153;
            c31 = c154;
            c28 = c162;
            c26 = c165;
            c25 = c166;
            str = null;
            c36 = c;
            c30 = c156;
            c29 = c157;
            c27 = c163;
            c37 = c160;
            c35 = c2;
            z2 = false;
            c24 = '0';
            c23 = '0';
            c22 = '0';
            c21 = '0';
            c20 = '0';
            c19 = '0';
            c18 = '0';
            c17 = '0';
            c16 = '0';
            c38 = c159;
            i5 = 19;
        } else {
            if (c152 == '-' && c155 == '-' && c158 == ' ' && c159 == ' ' && c162 == ':' && c165 == ':') {
                i3 = 20;
                if (i2 == 20) {
                    cArr2 = cArr;
                    c27 = c164;
                    i4 = i2;
                    c37 = c161;
                    c25 = c167;
                    i5 = 20;
                    c34 = c150;
                    c33 = c151;
                    c32 = c153;
                    c31 = c154;
                    c26 = c166;
                    str = null;
                    c36 = c;
                    c30 = c156;
                    c29 = c157;
                    c28 = c163;
                    c38 = c160;
                    c35 = c2;
                    z2 = false;
                    c24 = '0';
                    c23 = '0';
                    c22 = '0';
                    c21 = '0';
                    c20 = '0';
                    c19 = '0';
                    c18 = '0';
                }
                c17 = '0';
                c16 = '0';
                z = false;
            } else {
                i3 = 20;
            }
            if (i2 == i3 && c150 == ' ' && c154 == ' ' && c159 == ' ' && c162 == ':' && c165 == ':') {
                int iM6429 = m6429(c151, c152, c153);
                if (iM6429 > 0) {
                    c135 = (char) ((iM6429 / 10) + 48);
                    c134 = (char) ((iM6429 % 10) + 48);
                } else {
                    c134 = '0';
                    c135 = '0';
                }
                c27 = c164;
                c31 = c134;
                c37 = c161;
                c33 = c158;
                c25 = c167;
                c32 = c135;
                c36 = c155;
                c26 = c166;
                c30 = c;
                c35 = c156;
                c34 = c157;
                c28 = c163;
                c38 = c160;
                c29 = c2;
                z2 = false;
                i5 = 20;
                c24 = '0';
                c23 = '0';
                c22 = '0';
                c21 = '0';
                c20 = '0';
                c19 = '0';
                c18 = '0';
                c17 = '0';
                c16 = '0';
                z = false;
                cArr2 = cArr;
            } else if (c152 == '-' && c155 == '-' && ((c158 == ' ' || c158 == 'T') && c161 == ':' && c164 == ':' && c167 == '.' && (i2 == 21 || c3 == '[' || c3 == '+' || c3 == '-' || c3 == 'Z'))) {
                boolean z3 = c3 == '|';
                cArr2 = cArr;
                i4 = i2;
                z2 = z3;
                c34 = c150;
                c33 = c151;
                c32 = c153;
                c31 = c154;
                c28 = c162;
                c26 = c165;
                c25 = c166;
                str = null;
                c36 = c;
                c30 = c156;
                c29 = c157;
                c27 = c163;
                c37 = c160;
                c35 = c2;
                c24 = c11;
                c23 = '0';
                c22 = '0';
                c21 = '0';
                c20 = '0';
                c19 = '0';
                c18 = '0';
                c17 = '0';
                c16 = '0';
                z = false;
                c38 = c159;
                i5 = 21;
            } else {
                if (c152 == '-' && c155 == '-' && ((c158 == ' ' || c158 == 'T') && c161 == ':' && c164 == ':' && c167 == '.')) {
                    if (i2 != 22) {
                        c14 = c4;
                        c15 = c162;
                        if (c14 == '[' || c14 == '+' || c14 == '-' || c14 == 'Z') {
                        }
                        i5 = 22;
                    } else {
                        c14 = c4;
                        c15 = c162;
                    }
                    cArr2 = cArr;
                    z2 = c14 == '|';
                    c23 = c3;
                    c34 = c150;
                    c33 = c151;
                    c32 = c153;
                    c31 = c154;
                    c26 = c165;
                    c25 = c166;
                    c36 = c;
                    c30 = c156;
                    c29 = c157;
                    c27 = c163;
                    c37 = c160;
                    c35 = c2;
                    c28 = c15;
                    c24 = c11;
                    c22 = '0';
                    c21 = '0';
                    c20 = '0';
                    c19 = '0';
                    c18 = '0';
                    c17 = '0';
                    c16 = '0';
                    z = false;
                    c38 = c159;
                    i4 = i2;
                    str = null;
                    i5 = 22;
                } else {
                    c14 = c4;
                    c15 = c162;
                }
                if (c152 == '-' && c155 == '-' && ((c158 == ' ' || c158 == 'T') && c161 == ':' && c164 == 'Z' && c165 == '[' && c3 == ']' && i2 == 22)) {
                    z = false;
                    cArr2 = cArr;
                    i4 = i2;
                    c34 = c150;
                    c33 = c151;
                    c32 = c153;
                    c31 = c154;
                    str = null;
                    c36 = c;
                    c30 = c156;
                    c29 = c157;
                    c27 = c163;
                    c37 = c160;
                    c35 = c2;
                    c28 = c15;
                    z2 = true;
                    c26 = '0';
                    c25 = '0';
                    c24 = '0';
                    c23 = '0';
                    c22 = '0';
                    c21 = '0';
                    c20 = '0';
                    c19 = '0';
                    c18 = '0';
                    c17 = '0';
                    c16 = '0';
                    c38 = c159;
                    i5 = 17;
                } else {
                    if (i2 == 22 && c151 == ' ') {
                        c39 = c152;
                        if (c153 == ',' && c154 == ' ' && c159 == ' ' && c161 == ':' && c164 == ':' && c167 == ' ') {
                            c41 = c11;
                            if ((c41 == 'A' || c41 == 'P') && c3 == 'M') {
                                int iM64292 = m6429(c, c2, c150);
                                if (iM64292 > 0) {
                                    c133 = (char) ((iM64292 / 10) + 48);
                                    c132 = (char) ((iM64292 % 10) + 48);
                                } else {
                                    c132 = '0';
                                    c133 = '0';
                                }
                                z = c41 == 'P';
                                c38 = '0';
                                cArr2 = cArr;
                                c31 = c132;
                                c32 = c133;
                                i4 = i2;
                                c33 = c158;
                                c26 = c165;
                                c25 = c166;
                                str = null;
                                c36 = c155;
                                c35 = c156;
                                c34 = c157;
                                c27 = c163;
                                c37 = c160;
                                c28 = c15;
                                c29 = c39;
                                z2 = false;
                                i5 = 22;
                                c30 = '0';
                                c24 = '0';
                                c23 = '0';
                                c22 = '0';
                                c21 = '0';
                                c20 = '0';
                                c19 = '0';
                                c18 = '0';
                                c17 = '0';
                                c16 = '0';
                            } else {
                                c40 = c;
                            }
                        }
                        if (i2 != 22 && c150 == '/' && c153 == '/' && c158 == ' ' && c161 == ':' && c164 == ':' && c167 == ' ') {
                            if (c41 != 'A') {
                                c131 = 'P';
                                if (c41 == 'P') {
                                }
                                if (i2 != 23) {
                                    c43 = c2;
                                    c44 = c15;
                                    i6 = 23;
                                    if (i2 != 23) {
                                    }
                                    if (i2 == i6) {
                                        c49 = c46;
                                        if (i2 != 24) {
                                            c50 = c163;
                                            c51 = c49;
                                            c52 = c44;
                                            c53 = c41;
                                            c54 = c166;
                                            c55 = c5;
                                            c56 = c165;
                                            c57 = c159;
                                            c58 = c39;
                                            if (c58 == '-') {
                                            }
                                        }
                                    }
                                }
                            } else {
                                c131 = 'P';
                            }
                            c42 = c167;
                            if (c3 == 'M') {
                                z = c41 == c131;
                                cArr2 = cArr;
                                i4 = i2;
                                c30 = c151;
                                c36 = c154;
                                c32 = c40;
                                c26 = c165;
                                c25 = c166;
                                str = null;
                                c35 = c155;
                                c34 = c156;
                                c33 = c157;
                                c27 = c163;
                                c37 = c160;
                                c31 = c2;
                                c28 = c15;
                                c29 = c39;
                                z2 = false;
                                c24 = '0';
                                c23 = '0';
                                c22 = '0';
                                c21 = '0';
                                c20 = '0';
                                c19 = '0';
                                c18 = '0';
                                c17 = '0';
                                c16 = '0';
                                c38 = c159;
                                i5 = 22;
                            }
                            if (i2 != 23) {
                            }
                        } else {
                            c42 = c167;
                            if (i2 != 23 && c151 == ' ' && c153 == ',' && c154 == ' ' && c159 == ' ') {
                                c44 = c15;
                                if (c44 == ':' && c165 == ':' && c41 == ' ' && ((c3 == 'A' || c3 == 'P') && c14 == 'M')) {
                                    int iM64293 = m6429(c40, c2, c150);
                                    if (iM64293 > 0) {
                                        c130 = (char) ((iM64293 / 10) + 48);
                                        c129 = (char) ((iM64293 % 10) + 48);
                                    } else {
                                        c129 = '0';
                                        c130 = '0';
                                    }
                                    cArr2 = cArr;
                                    c27 = c164;
                                    c31 = c129;
                                    c37 = c161;
                                    c33 = c158;
                                    c32 = c130;
                                    z = c3 == 'P';
                                    c26 = c166;
                                    c36 = c155;
                                    c35 = c156;
                                    c34 = c157;
                                    c28 = c163;
                                    c38 = c160;
                                    c25 = c42;
                                    c29 = c39;
                                    z2 = false;
                                    i5 = 23;
                                    c30 = '0';
                                    c24 = '0';
                                    c23 = '0';
                                    c22 = '0';
                                    c21 = '0';
                                    c20 = '0';
                                    c19 = '0';
                                    c18 = '0';
                                    c17 = '0';
                                    c16 = '0';
                                } else {
                                    c43 = c2;
                                }
                            } else {
                                c43 = c2;
                                c44 = c15;
                            }
                            i6 = 23;
                            if (i2 != 23) {
                                c45 = c161;
                                if (c151 == ' ' && c154 == ',') {
                                    c46 = c155;
                                    c47 = c158;
                                    c48 = c160;
                                    if (c46 == ' ' && c48 == ' ' && c44 == ':' && c165 == ':' && c41 == ' ' && ((c3 == 'A' || c3 == 'P') && c14 == 'M')) {
                                        int iM64294 = m6429(c40, c43, c150);
                                        if (iM64294 > 0) {
                                            c128 = (char) ((iM64294 / 10) + 48);
                                            c127 = (char) ((iM64294 % 10) + 48);
                                        } else {
                                            c127 = '0';
                                            c128 = '0';
                                        }
                                        boolean z4 = c3 == 'P';
                                        cArr2 = cArr;
                                        c31 = c127;
                                        c33 = c159;
                                        i4 = i2;
                                        c32 = c128;
                                        z = z4;
                                        c29 = c153;
                                        c26 = c166;
                                        str = null;
                                        c34 = c47;
                                        c36 = c156;
                                        c35 = c157;
                                        c28 = c163;
                                        c27 = c164;
                                        c37 = c45;
                                        c25 = c42;
                                        c30 = c39;
                                        z2 = false;
                                        i5 = 23;
                                        c38 = '0';
                                        c24 = '0';
                                        c23 = '0';
                                        c22 = '0';
                                        c21 = '0';
                                        c20 = '0';
                                        c19 = '0';
                                        c18 = '0';
                                        c17 = '0';
                                        c16 = '0';
                                    }
                                } else {
                                    c46 = c155;
                                    c47 = c158;
                                    c48 = c160;
                                }
                                i6 = 23;
                            } else {
                                c45 = c161;
                                c46 = c155;
                                c47 = c158;
                                c48 = c160;
                            }
                            if (i2 == i6 || c151 != ' ') {
                                c49 = c46;
                            } else {
                                c49 = c46;
                                if (c153 == ',' && c154 == ' ' && c159 == ',' && c48 == ' ' && c44 == ':' && c165 == ':' && c41 == ' ' && ((c3 == 'A' || c3 == 'P') && c14 == 'M')) {
                                    int iM64295 = m6429(c40, c43, c150);
                                    if (iM64295 > 0) {
                                        c126 = (char) ((iM64295 / 10) + 48);
                                        c125 = (char) ((iM64295 % 10) + 48);
                                    } else {
                                        c125 = '0';
                                        c126 = '0';
                                    }
                                    z = c3 == 'P';
                                    c38 = '0';
                                    cArr2 = cArr;
                                    c31 = c125;
                                    c32 = c126;
                                    i4 = i2;
                                    c26 = c166;
                                    str = null;
                                    c33 = c47;
                                    c35 = c156;
                                    c34 = c157;
                                    c28 = c163;
                                    c36 = c49;
                                    c27 = c164;
                                    c37 = c45;
                                    c25 = c42;
                                    c29 = c39;
                                    z2 = false;
                                    i5 = 23;
                                }
                                c30 = '0';
                                c24 = '0';
                                c23 = '0';
                                c22 = '0';
                                c21 = '0';
                                c20 = '0';
                                c19 = '0';
                                c18 = '0';
                                c17 = '0';
                                c16 = '0';
                            }
                            if (i2 != 24 && c151 == ' ' && c154 == ',') {
                                c51 = c49;
                                if (c51 == ' ' && c48 == ' ') {
                                    c50 = c163;
                                    c53 = c41;
                                    c52 = c44;
                                    c54 = c166;
                                    if (c50 == ':') {
                                        if (c54 == ':' && c3 == ' ') {
                                            if (c14 == 'A' || c14 == 'P') {
                                                c56 = c165;
                                                c55 = c5;
                                                if (c55 == 'M') {
                                                    int iM64296 = m6429(c40, c43, c150);
                                                    if (iM64296 > 0) {
                                                        c124 = (char) ((iM64296 / 10) + 48);
                                                        c123 = (char) ((iM64296 % 10) + 48);
                                                    } else {
                                                        c123 = '0';
                                                        c124 = '0';
                                                    }
                                                    cArr2 = cArr;
                                                    c31 = c123;
                                                    c33 = c159;
                                                    i4 = i2;
                                                    c32 = c124;
                                                    z = c14 == 'P';
                                                    c29 = c153;
                                                    c27 = c56;
                                                    str = null;
                                                    c34 = c47;
                                                    c36 = c156;
                                                    c35 = c157;
                                                    c25 = c53;
                                                    c37 = c52;
                                                    c28 = c164;
                                                    c38 = c45;
                                                    c26 = c42;
                                                    c30 = c39;
                                                    z2 = false;
                                                    i5 = 24;
                                                    c24 = '0';
                                                    c23 = '0';
                                                    c22 = '0';
                                                    c21 = '0';
                                                    c20 = '0';
                                                    c19 = '0';
                                                    c18 = '0';
                                                    c17 = '0';
                                                    c16 = '0';
                                                }
                                            } else {
                                                c56 = c165;
                                                c55 = c5;
                                                c58 = c39;
                                                c57 = c159;
                                                if (c58 == '-' && c51 == '-') {
                                                    c60 = c47;
                                                    c62 = c153;
                                                    if (c60 == ' ' || c60 == 'T') {
                                                        c64 = c45;
                                                        c65 = c150;
                                                        c59 = c43;
                                                        c61 = c164;
                                                        if (c64 == ':') {
                                                            c63 = c40;
                                                            if (c61 == ':') {
                                                                c66 = c42;
                                                                if (c66 == '.') {
                                                                    if (i2 == 23 || c55 == '[') {
                                                                        c122 = '|';
                                                                        z2 = c55 == c122;
                                                                        cArr2 = cArr;
                                                                        c27 = c50;
                                                                        c37 = c48;
                                                                        c25 = c54;
                                                                        c23 = c3;
                                                                        c22 = c14;
                                                                        c33 = c151;
                                                                        c31 = c154;
                                                                        c26 = c56;
                                                                        c32 = c62;
                                                                        c30 = c156;
                                                                        c29 = c157;
                                                                        c24 = c53;
                                                                        c28 = c52;
                                                                        c36 = c63;
                                                                        c34 = c65;
                                                                        c38 = c57;
                                                                        c35 = c59;
                                                                        i5 = 23;
                                                                        c21 = '0';
                                                                        c20 = '0';
                                                                        c19 = '0';
                                                                        c18 = '0';
                                                                        c17 = '0';
                                                                        c16 = '0';
                                                                        z = false;
                                                                    } else if (c55 != '|') {
                                                                        if (c55 != '+') {
                                                                            if (c55 != '-') {
                                                                            }
                                                                        }
                                                                        c122 = '|';
                                                                        if (c55 == c122) {
                                                                        }
                                                                        cArr2 = cArr;
                                                                        c27 = c50;
                                                                        c37 = c48;
                                                                        c25 = c54;
                                                                        c23 = c3;
                                                                        c22 = c14;
                                                                        c33 = c151;
                                                                        c31 = c154;
                                                                        c26 = c56;
                                                                        c32 = c62;
                                                                        c30 = c156;
                                                                        c29 = c157;
                                                                        c24 = c53;
                                                                        c28 = c52;
                                                                        c36 = c63;
                                                                        c34 = c65;
                                                                        c38 = c57;
                                                                        c35 = c59;
                                                                        i5 = 23;
                                                                        c21 = '0';
                                                                        c20 = '0';
                                                                        c19 = '0';
                                                                        c18 = '0';
                                                                        c17 = '0';
                                                                        c16 = '0';
                                                                        z = false;
                                                                    } else {
                                                                        c122 = '|';
                                                                        if (c55 == c122) {
                                                                        }
                                                                        cArr2 = cArr;
                                                                        c27 = c50;
                                                                        c37 = c48;
                                                                        c25 = c54;
                                                                        c23 = c3;
                                                                        c22 = c14;
                                                                        c33 = c151;
                                                                        c31 = c154;
                                                                        c26 = c56;
                                                                        c32 = c62;
                                                                        c30 = c156;
                                                                        c29 = c157;
                                                                        c24 = c53;
                                                                        c28 = c52;
                                                                        c36 = c63;
                                                                        c34 = c65;
                                                                        c38 = c57;
                                                                        c35 = c59;
                                                                        i5 = 23;
                                                                        c21 = '0';
                                                                        c20 = '0';
                                                                        c19 = '0';
                                                                        c18 = '0';
                                                                        c17 = '0';
                                                                        c16 = '0';
                                                                        z = false;
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            c66 = c42;
                                                            c63 = c40;
                                                        }
                                                        if (c58 == '-' && c51 == '-' && ((c60 == ' ' || c60 == 'T') && c64 == ':' && c61 == ':' && c66 == '.')) {
                                                            if (i2 != 24) {
                                                                c67 = c66;
                                                                c68 = c6;
                                                                if (c68 != '[') {
                                                                    if (c68 == '|') {
                                                                        c121 = '|';
                                                                        z2 = c68 != c121;
                                                                        cArr2 = cArr;
                                                                        c27 = c50;
                                                                        c37 = c48;
                                                                        c25 = c54;
                                                                        c23 = c3;
                                                                        c22 = c14;
                                                                        c33 = c151;
                                                                        c21 = c55;
                                                                        c31 = c154;
                                                                        c26 = c56;
                                                                        c32 = c62;
                                                                        c30 = c156;
                                                                        c29 = c157;
                                                                        c24 = c53;
                                                                        c28 = c52;
                                                                        c36 = c63;
                                                                        c34 = c65;
                                                                        c38 = c57;
                                                                        c35 = c59;
                                                                        i5 = 24;
                                                                        c20 = '0';
                                                                        c19 = '0';
                                                                        c18 = '0';
                                                                        c17 = '0';
                                                                        c16 = '0';
                                                                        z = false;
                                                                    } else if (c68 != '+') {
                                                                        if (c68 != '-') {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c68 = c6;
                                                            }
                                                            c121 = '|';
                                                            if (c68 != c121) {
                                                            }
                                                            cArr2 = cArr;
                                                            c27 = c50;
                                                            c37 = c48;
                                                            c25 = c54;
                                                            c23 = c3;
                                                            c22 = c14;
                                                            c33 = c151;
                                                            c21 = c55;
                                                            c31 = c154;
                                                            c26 = c56;
                                                            c32 = c62;
                                                            c30 = c156;
                                                            c29 = c157;
                                                            c24 = c53;
                                                            c28 = c52;
                                                            c36 = c63;
                                                            c34 = c65;
                                                            c38 = c57;
                                                            c35 = c59;
                                                            i5 = 24;
                                                            c20 = '0';
                                                            c19 = '0';
                                                            c18 = '0';
                                                            c17 = '0';
                                                            c16 = '0';
                                                            z = false;
                                                        } else {
                                                            c67 = c66;
                                                            c68 = c6;
                                                        }
                                                        if (i2 == 24 || c151 != ' ') {
                                                            c69 = c68;
                                                        } else {
                                                            c69 = c68;
                                                            if (c154 == ',' && c51 == ' ' && c48 == ',' && c64 == ' ' && c50 == ':' && c54 == ':' && c3 == ' ' && ((c14 == 'A' || c14 == 'P') && c55 == 'M')) {
                                                                char c183 = c61;
                                                                int iM64297 = m6429(c63, c59, c65);
                                                                if (iM64297 > 0) {
                                                                    c120 = (char) ((iM64297 / 10) + 48);
                                                                    c119 = (char) ((iM64297 % 10) + 48);
                                                                } else {
                                                                    c119 = '0';
                                                                    c120 = '0';
                                                                }
                                                                cArr2 = cArr;
                                                                c31 = c119;
                                                                c34 = c60;
                                                                i4 = i2;
                                                                c32 = c120;
                                                                z = c14 == 'P';
                                                                c30 = c58;
                                                                c27 = c56;
                                                                str = null;
                                                                c29 = c62;
                                                                c36 = c156;
                                                                c35 = c157;
                                                                c25 = c53;
                                                                c37 = c52;
                                                                c28 = c183;
                                                                c33 = c57;
                                                                c26 = c67;
                                                                z2 = false;
                                                                i5 = 24;
                                                                c38 = '0';
                                                                c24 = '0';
                                                                c23 = '0';
                                                                c22 = '0';
                                                                c21 = '0';
                                                                c20 = '0';
                                                                c19 = '0';
                                                                c18 = '0';
                                                                c17 = '0';
                                                                c16 = '0';
                                                            }
                                                        }
                                                        char c184 = c63;
                                                        char c185 = c59;
                                                        char c186 = c61;
                                                        char c187 = c65;
                                                        char c188 = c64;
                                                        if (i2 == 24 || c151 != ' ') {
                                                            c70 = c151;
                                                        } else {
                                                            c70 = c151;
                                                            char c189 = c62;
                                                            if (c189 == ',' && c154 == ' ') {
                                                                c62 = c189;
                                                                c71 = c57;
                                                                if (c71 == ',' && c48 == ' ' && c50 == ':' && c54 == ':' && c3 == ' ' && ((c14 == 'A' || c14 == 'P') && c55 == 'M')) {
                                                                    int iM64298 = m6429(c184, c185, c187);
                                                                    if (iM64298 > 0) {
                                                                        c118 = (char) ((iM64298 / 10) + 48);
                                                                        c117 = (char) ((iM64298 % 10) + 48);
                                                                    } else {
                                                                        c117 = '0';
                                                                        c118 = '0';
                                                                    }
                                                                    cArr2 = cArr;
                                                                    i4 = i2;
                                                                    c36 = c51;
                                                                    c33 = c60;
                                                                    c31 = c117;
                                                                    c32 = c118;
                                                                    z = c14 == 'P';
                                                                    c29 = c58;
                                                                    c27 = c56;
                                                                    str = null;
                                                                    c35 = c156;
                                                                    c34 = c157;
                                                                    c25 = c53;
                                                                    c37 = c52;
                                                                    c28 = c186;
                                                                    c38 = c188;
                                                                    c26 = c67;
                                                                    z2 = false;
                                                                    i5 = 24;
                                                                } else {
                                                                    if (c58 == '-' && c51 == '-' && (c60 == ' ' || c60 == 'T')) {
                                                                        c74 = c188;
                                                                        c72 = c71;
                                                                        c73 = c186;
                                                                        if (c74 == ':') {
                                                                            c77 = c3;
                                                                            if (c73 == ':') {
                                                                                c79 = c67;
                                                                                if (c79 == '.') {
                                                                                    i4 = i2;
                                                                                    c75 = c54;
                                                                                    if (i4 != 25) {
                                                                                        c78 = c7;
                                                                                        c76 = c50;
                                                                                        if (c78 != '[') {
                                                                                            if (c78 == '|') {
                                                                                                c116 = '|';
                                                                                                z2 = c78 != c116;
                                                                                                c37 = c48;
                                                                                                c22 = c14;
                                                                                                c35 = c185;
                                                                                                c21 = c55;
                                                                                                c31 = c154;
                                                                                                c34 = c187;
                                                                                                c36 = c184;
                                                                                                c26 = c56;
                                                                                                str = null;
                                                                                                c32 = c62;
                                                                                                c30 = c156;
                                                                                                c29 = c157;
                                                                                                c24 = c53;
                                                                                                c28 = c52;
                                                                                                c23 = c77;
                                                                                                c38 = c72;
                                                                                                c20 = c69;
                                                                                                c27 = c76;
                                                                                                c25 = c75;
                                                                                                c33 = c70;
                                                                                                i5 = 25;
                                                                                                c19 = '0';
                                                                                                c18 = '0';
                                                                                                c17 = '0';
                                                                                                c16 = '0';
                                                                                                z = false;
                                                                                                cArr2 = cArr;
                                                                                            } else if (c78 != '+') {
                                                                                                if (c78 != '-') {
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        c78 = c7;
                                                                                        c76 = c50;
                                                                                    }
                                                                                    c116 = '|';
                                                                                    z2 = c78 != c116;
                                                                                    c37 = c48;
                                                                                    c22 = c14;
                                                                                    c35 = c185;
                                                                                    c21 = c55;
                                                                                    c31 = c154;
                                                                                    c34 = c187;
                                                                                    c36 = c184;
                                                                                    c26 = c56;
                                                                                    str = null;
                                                                                    c32 = c62;
                                                                                    c30 = c156;
                                                                                    c29 = c157;
                                                                                    c24 = c53;
                                                                                    c28 = c52;
                                                                                    c23 = c77;
                                                                                    c38 = c72;
                                                                                    c20 = c69;
                                                                                    c27 = c76;
                                                                                    c25 = c75;
                                                                                    c33 = c70;
                                                                                    i5 = 25;
                                                                                    c19 = '0';
                                                                                    c18 = '0';
                                                                                    c17 = '0';
                                                                                    c16 = '0';
                                                                                    z = false;
                                                                                    cArr2 = cArr;
                                                                                }
                                                                            } else {
                                                                                c79 = c67;
                                                                            }
                                                                            i4 = i2;
                                                                            c75 = c54;
                                                                            c78 = c7;
                                                                        }
                                                                        c76 = c50;
                                                                        if (i4 == 25) {
                                                                            char c190 = c70;
                                                                            c82 = c78;
                                                                            c81 = c190;
                                                                            if (c190 == ' ' && c154 == ',' && c51 == ' ' && c48 == ',' && c74 == ' ' && c73 == ':' && c79 == ':' && c14 == ' ' && (c55 == 'A' || c55 == 'P')) {
                                                                                c80 = c69;
                                                                                if (c80 == 'M') {
                                                                                    int iM64299 = m6429(c184, c185, c187);
                                                                                    if (iM64299 > 0) {
                                                                                        c115 = (char) ((iM64299 / 10) + 48);
                                                                                        c114 = (char) ((iM64299 % 10) + 48);
                                                                                    } else {
                                                                                        c114 = '0';
                                                                                        c115 = '0';
                                                                                    }
                                                                                    z = c55 == 'P';
                                                                                    cArr2 = cArr;
                                                                                    c31 = c114;
                                                                                    c34 = c60;
                                                                                    c32 = c115;
                                                                                    c30 = c58;
                                                                                    c28 = c56;
                                                                                    str = null;
                                                                                    c29 = c62;
                                                                                    c36 = c156;
                                                                                    c35 = c157;
                                                                                    c26 = c53;
                                                                                    c38 = c52;
                                                                                    c25 = c77;
                                                                                    c33 = c72;
                                                                                    c37 = c76;
                                                                                    c27 = c75;
                                                                                    z2 = false;
                                                                                    i5 = 25;
                                                                                }
                                                                                c24 = '0';
                                                                                c23 = '0';
                                                                                c22 = '0';
                                                                                c21 = '0';
                                                                                c20 = '0';
                                                                                c19 = '0';
                                                                                c18 = '0';
                                                                                c17 = '0';
                                                                                c16 = '0';
                                                                            } else {
                                                                                c80 = c69;
                                                                            }
                                                                        } else {
                                                                            c80 = c69;
                                                                            c81 = c70;
                                                                            c82 = c78;
                                                                        }
                                                                        if (c58 == '-' && c51 == '-' && ((c60 == ' ' || c60 == 'T') && c74 == ':' && c73 == ':' && c79 == '.')) {
                                                                            if (i4 != 26) {
                                                                                c83 = c8;
                                                                                c84 = c185;
                                                                                if (c83 != '[') {
                                                                                    if (c83 == '|') {
                                                                                        c113 = '|';
                                                                                        z2 = c83 != c113;
                                                                                        c20 = c80;
                                                                                        c37 = c48;
                                                                                        c22 = c14;
                                                                                        c21 = c55;
                                                                                        c31 = c154;
                                                                                        c34 = c187;
                                                                                        c36 = c184;
                                                                                        c26 = c56;
                                                                                        str = null;
                                                                                        c32 = c62;
                                                                                        c30 = c156;
                                                                                        c29 = c157;
                                                                                        c24 = c53;
                                                                                        c28 = c52;
                                                                                        c23 = c77;
                                                                                        c38 = c72;
                                                                                        c27 = c76;
                                                                                        c35 = c84;
                                                                                        c25 = c75;
                                                                                        c19 = c82;
                                                                                        c33 = c81;
                                                                                        i5 = 26;
                                                                                        c18 = '0';
                                                                                        c17 = '0';
                                                                                        c16 = '0';
                                                                                        z = false;
                                                                                        cArr2 = cArr;
                                                                                    } else if (c83 != '+') {
                                                                                        if (c83 != '-') {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c83 = c8;
                                                                                c84 = c185;
                                                                            }
                                                                            c113 = '|';
                                                                            if (c83 != c113) {
                                                                            }
                                                                            c20 = c80;
                                                                            c37 = c48;
                                                                            c22 = c14;
                                                                            c21 = c55;
                                                                            c31 = c154;
                                                                            c34 = c187;
                                                                            c36 = c184;
                                                                            c26 = c56;
                                                                            str = null;
                                                                            c32 = c62;
                                                                            c30 = c156;
                                                                            c29 = c157;
                                                                            c24 = c53;
                                                                            c28 = c52;
                                                                            c23 = c77;
                                                                            c38 = c72;
                                                                            c27 = c76;
                                                                            c35 = c84;
                                                                            c25 = c75;
                                                                            c19 = c82;
                                                                            c33 = c81;
                                                                            i5 = 26;
                                                                            c18 = '0';
                                                                            c17 = '0';
                                                                            c16 = '0';
                                                                            z = false;
                                                                            cArr2 = cArr;
                                                                        } else {
                                                                            c83 = c8;
                                                                            c84 = c185;
                                                                        }
                                                                        if (c58 != '-' && c51 == '-' && ((c60 == ' ' || c60 == 'T') && c74 == ':' && c73 == ':' && c79 == '.')) {
                                                                            if (i4 != 27) {
                                                                                c85 = c9;
                                                                                c86 = c187;
                                                                                if (c85 != '[') {
                                                                                    if (c85 != '|') {
                                                                                        if (c85 != '+') {
                                                                                            if (c85 != '-') {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c85 = c9;
                                                                                c86 = c187;
                                                                            }
                                                                            if (c55 == ' ') {
                                                                                z = false;
                                                                                cArr2 = cArr;
                                                                                c37 = c48;
                                                                                c22 = c14;
                                                                                c31 = c154;
                                                                                c36 = c184;
                                                                                c26 = c56;
                                                                                str = null;
                                                                                c32 = c62;
                                                                                c30 = c156;
                                                                                c29 = c157;
                                                                                c24 = c53;
                                                                                c28 = c52;
                                                                                c23 = c77;
                                                                                c38 = c72;
                                                                                c27 = c76;
                                                                                c35 = c84;
                                                                                c34 = c86;
                                                                                c25 = c75;
                                                                                c33 = c81;
                                                                                z2 = false;
                                                                                i5 = 23;
                                                                                c21 = '0';
                                                                                c20 = '0';
                                                                                c19 = '0';
                                                                                c18 = '0';
                                                                                c17 = '0';
                                                                                c16 = '0';
                                                                            } else {
                                                                                z2 = c85 == '|';
                                                                                cArr2 = cArr;
                                                                                c20 = c80;
                                                                                c37 = c48;
                                                                                c18 = c83;
                                                                                c22 = c14;
                                                                                c21 = c55;
                                                                                c31 = c154;
                                                                                c36 = c184;
                                                                                c26 = c56;
                                                                                str = null;
                                                                                c32 = c62;
                                                                                c30 = c156;
                                                                                c29 = c157;
                                                                                c24 = c53;
                                                                                c28 = c52;
                                                                                c23 = c77;
                                                                                c38 = c72;
                                                                                c27 = c76;
                                                                                c35 = c84;
                                                                                c34 = c86;
                                                                                c25 = c75;
                                                                                c19 = c82;
                                                                                c33 = c81;
                                                                                i5 = 27;
                                                                                c17 = '0';
                                                                                c16 = '0';
                                                                                z = false;
                                                                            }
                                                                        } else {
                                                                            c85 = c9;
                                                                            c86 = c187;
                                                                        }
                                                                        if (c58 != '-' && c51 == '-' && ((c60 == ' ' || c60 == 'T') && c74 == ':' && c73 == ':' && c79 == '.')) {
                                                                            if (i4 != 28) {
                                                                                c87 = c10;
                                                                                c88 = c184;
                                                                                if (c87 != '[') {
                                                                                    if (c87 == '|') {
                                                                                        c112 = '|';
                                                                                        z2 = c87 != c112;
                                                                                        cArr2 = cArr;
                                                                                        c20 = c80;
                                                                                        c37 = c48;
                                                                                        c18 = c83;
                                                                                        c22 = c14;
                                                                                        c17 = c85;
                                                                                        c21 = c55;
                                                                                        c31 = c154;
                                                                                        c26 = c56;
                                                                                        str = null;
                                                                                        c32 = c62;
                                                                                        c30 = c156;
                                                                                        c29 = c157;
                                                                                        c24 = c53;
                                                                                        c28 = c52;
                                                                                        c23 = c77;
                                                                                        c38 = c72;
                                                                                        c27 = c76;
                                                                                        c35 = c84;
                                                                                        c34 = c86;
                                                                                        c36 = c88;
                                                                                        c25 = c75;
                                                                                        c19 = c82;
                                                                                        c33 = c81;
                                                                                        i5 = 28;
                                                                                        c16 = '0';
                                                                                        z = false;
                                                                                    } else if (c87 != '+') {
                                                                                        if (c87 != '-') {
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                c87 = c10;
                                                                                c88 = c184;
                                                                            }
                                                                            c112 = '|';
                                                                            if (c87 != c112) {
                                                                            }
                                                                            cArr2 = cArr;
                                                                            c20 = c80;
                                                                            c37 = c48;
                                                                            c18 = c83;
                                                                            c22 = c14;
                                                                            c17 = c85;
                                                                            c21 = c55;
                                                                            c31 = c154;
                                                                            c26 = c56;
                                                                            str = null;
                                                                            c32 = c62;
                                                                            c30 = c156;
                                                                            c29 = c157;
                                                                            c24 = c53;
                                                                            c28 = c52;
                                                                            c23 = c77;
                                                                            c38 = c72;
                                                                            c27 = c76;
                                                                            c35 = c84;
                                                                            c34 = c86;
                                                                            c36 = c88;
                                                                            c25 = c75;
                                                                            c19 = c82;
                                                                            c33 = c81;
                                                                            i5 = 28;
                                                                            c16 = '0';
                                                                            z = false;
                                                                        } else {
                                                                            c87 = c10;
                                                                            c88 = c184;
                                                                        }
                                                                        char c191 = c87;
                                                                        if (i4 != 28) {
                                                                            c89 = c81;
                                                                            if (c89 == ' ' && c51 == ' ' && c60 == ' ' && c74 == ':' && c73 == ':' && c79 == ' ' && c55 == ' ') {
                                                                                int iM642910 = m6429(c58, c62, c154);
                                                                                if (iM642910 > 0) {
                                                                                    c111 = (char) ((iM642910 / 10) + 48);
                                                                                    c110 = (char) ((iM642910 % 10) + 48);
                                                                                } else {
                                                                                    c110 = '0';
                                                                                    c111 = '0';
                                                                                }
                                                                                str = new String(cArr, i + 20, 3);
                                                                                c31 = c110;
                                                                                c32 = c111;
                                                                                c36 = c80;
                                                                                c37 = c48;
                                                                                c34 = c83;
                                                                                c33 = c85;
                                                                                cArr2 = cArr;
                                                                                c26 = c56;
                                                                                c30 = c156;
                                                                                c29 = c157;
                                                                                c28 = c52;
                                                                                c38 = c72;
                                                                                c27 = c76;
                                                                                c25 = c75;
                                                                                c35 = c82;
                                                                                z2 = false;
                                                                                i5 = 19;
                                                                                z = false;
                                                                                c24 = '0';
                                                                                c23 = '0';
                                                                                c22 = '0';
                                                                                c21 = '0';
                                                                                c20 = '0';
                                                                                c19 = '0';
                                                                                c18 = '0';
                                                                                c17 = '0';
                                                                                c16 = '0';
                                                                            }
                                                                        } else {
                                                                            c89 = c81;
                                                                        }
                                                                        cArr2 = cArr;
                                                                        char c192 = c85;
                                                                        if (i4 != 28 && c89 == ',' && c58 == ' ' && c154 == ' ' && c60 == ' ') {
                                                                            c90 = c48;
                                                                            c91 = c76;
                                                                            c92 = c83;
                                                                            if (c91 == ' ' && c75 == ':') {
                                                                                char c193 = c77;
                                                                                if (c193 == ':' && c80 == ' ') {
                                                                                    int iM642911 = m6429(c51, c156, c157);
                                                                                    if (iM642911 > 0) {
                                                                                        c109 = (char) ((iM642911 / 10) + 48);
                                                                                        c108 = (char) ((iM642911 % 10) + 48);
                                                                                    } else {
                                                                                        c108 = '0';
                                                                                        c109 = '0';
                                                                                    }
                                                                                    c31 = c108;
                                                                                    c32 = c109;
                                                                                    c28 = c79;
                                                                                    c26 = c14;
                                                                                    c38 = c73;
                                                                                    c25 = c55;
                                                                                    c34 = c74;
                                                                                    c37 = c56;
                                                                                    str = null;
                                                                                    c29 = c62;
                                                                                    c27 = c53;
                                                                                    c33 = c52;
                                                                                    z2 = true;
                                                                                    c36 = c72;
                                                                                    c35 = c90;
                                                                                    i5 = 24;
                                                                                    z = false;
                                                                                } else {
                                                                                    c93 = c156;
                                                                                    c94 = c80;
                                                                                    c95 = c157;
                                                                                    c77 = c193;
                                                                                }
                                                                            }
                                                                            if (i4 == 29 && c89 == ',' && c58 == ' ' && c51 == ' ') {
                                                                                c96 = c89;
                                                                                c97 = c72;
                                                                                if (c97 == ' ' && c73 == ' ' && c79 == ':' && c14 == ':') {
                                                                                    c100 = c55;
                                                                                    c98 = c82;
                                                                                    if (c98 == ' ') {
                                                                                        int iM642912 = m6429(c93, c95, c60);
                                                                                        if (iM642912 > 0) {
                                                                                            c105 = '0';
                                                                                            c107 = (char) ((iM642912 / 10) + 48);
                                                                                            c106 = (char) ((iM642912 % 10) + 48);
                                                                                        } else {
                                                                                            c105 = '0';
                                                                                            c106 = '0';
                                                                                            c107 = '0';
                                                                                        }
                                                                                        c31 = c106;
                                                                                        c32 = c107;
                                                                                        c33 = c91;
                                                                                        c35 = c74;
                                                                                        c29 = c154;
                                                                                        c38 = c56;
                                                                                        c24 = c105;
                                                                                        c23 = c24;
                                                                                        c22 = c23;
                                                                                        c21 = c22;
                                                                                        c20 = c21;
                                                                                        c19 = c20;
                                                                                        c18 = c19;
                                                                                        c17 = c18;
                                                                                        c16 = c17;
                                                                                        str = null;
                                                                                        c30 = c62;
                                                                                        c25 = c94;
                                                                                        c28 = c53;
                                                                                        c34 = c52;
                                                                                        c27 = c77;
                                                                                        z2 = true;
                                                                                        c26 = c100;
                                                                                        c36 = c90;
                                                                                        c37 = c75;
                                                                                        i5 = 25;
                                                                                        z = false;
                                                                                    }
                                                                                } else {
                                                                                    c100 = c55;
                                                                                    c98 = c82;
                                                                                }
                                                                                c99 = '0';
                                                                            } else {
                                                                                c96 = c89;
                                                                                c97 = c72;
                                                                                c98 = c82;
                                                                                c99 = '0';
                                                                                c100 = c55;
                                                                            }
                                                                            if (c58 != '-' && c51 == '-' && ((c60 == ' ' || c60 == 'T') && c74 == ':' && c73 == ':' && c79 == '.')) {
                                                                                if (i4 != 29) {
                                                                                    c101 = c58;
                                                                                    c103 = c12;
                                                                                    if (c103 != '[') {
                                                                                        if (c103 == '|') {
                                                                                            c104 = '|';
                                                                                            z2 = c103 != c104;
                                                                                            c29 = c95;
                                                                                            c27 = c91;
                                                                                            c30 = c93;
                                                                                            c22 = c14;
                                                                                            c19 = c98;
                                                                                            c31 = c154;
                                                                                            c38 = c97;
                                                                                            c26 = c56;
                                                                                            str = null;
                                                                                            c32 = c62;
                                                                                            c20 = c94;
                                                                                            c24 = c53;
                                                                                            c28 = c52;
                                                                                            c17 = c192;
                                                                                            c23 = c77;
                                                                                            c21 = c100;
                                                                                            c37 = c90;
                                                                                            c18 = c92;
                                                                                            c35 = c84;
                                                                                            c34 = c86;
                                                                                            c36 = c88;
                                                                                            c25 = c75;
                                                                                            c16 = c191;
                                                                                            c33 = c96;
                                                                                            i5 = 29;
                                                                                            z = false;
                                                                                        } else if (c103 != '+') {
                                                                                            if (c103 != '-') {
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    c103 = c12;
                                                                                }
                                                                                c104 = '|';
                                                                                if (c103 != c104) {
                                                                                }
                                                                                c29 = c95;
                                                                                c27 = c91;
                                                                                c30 = c93;
                                                                                c22 = c14;
                                                                                c19 = c98;
                                                                                c31 = c154;
                                                                                c38 = c97;
                                                                                c26 = c56;
                                                                                str = null;
                                                                                c32 = c62;
                                                                                c20 = c94;
                                                                                c24 = c53;
                                                                                c28 = c52;
                                                                                c17 = c192;
                                                                                c23 = c77;
                                                                                c21 = c100;
                                                                                c37 = c90;
                                                                                c18 = c92;
                                                                                c35 = c84;
                                                                                c34 = c86;
                                                                                c36 = c88;
                                                                                c25 = c75;
                                                                                c16 = c191;
                                                                                c33 = c96;
                                                                                i5 = 29;
                                                                                z = false;
                                                                            } else {
                                                                                c101 = c58;
                                                                            }
                                                                            if (i4 != 22) {
                                                                                c102 = c56;
                                                                                if (c102 == '+' || c102 == '-') {
                                                                                    c29 = c51;
                                                                                    c28 = c60;
                                                                                    c37 = c95;
                                                                                    c23 = c91;
                                                                                    c22 = c73;
                                                                                    c25 = c74;
                                                                                    c30 = c154;
                                                                                    c27 = c97;
                                                                                    c21 = c99;
                                                                                    c20 = c21;
                                                                                    c19 = c20;
                                                                                    c18 = c19;
                                                                                    c17 = c18;
                                                                                    c16 = c17;
                                                                                    str = null;
                                                                                    c31 = c62;
                                                                                    c24 = c52;
                                                                                    c26 = c90;
                                                                                    c35 = c84;
                                                                                    c34 = c86;
                                                                                    c36 = c88;
                                                                                    c32 = c101;
                                                                                    c33 = c96;
                                                                                    z2 = false;
                                                                                    i5 = 17;
                                                                                    z = false;
                                                                                    c38 = c93;
                                                                                }
                                                                            } else {
                                                                                c102 = c56;
                                                                            }
                                                                            if ((i4 != 32 && c154 == ',' && c51 == ' ' && c60 == '-' && c52 == '-' && c79 == ' ' && c14 == ':' && c98 == ':' && cArr[i + 28] == ' ') || ((i4 == 33 && c51 == ',' && c93 == ' ' && c97 == '-' && c91 == '-' && c53 == ' ' && c100 == ':' && c92 == ':' && cArr[i + 29] == ' ') || ((i4 == 34 && c93 == ',' && c95 == ' ' && c90 == '-' && c73 == '-' && c77 == ' ' && c94 == ':' && c192 == ':' && cArr[i + 30] == ' ') || (i4 == 35 && c95 == ',' && c60 == ' ' && c74 == '-' && c102 == '-' && c14 == ' ' && c98 == ':' && c191 == ':' && cArr[i + 31] == ' ')))) {
                                                                                return m6450(new String(cArr, i, i4));
                                                                            }
                                                                            if (i4 == 34) {
                                                                                DateTimeFormatter dateTimeFormatterOfPattern = f9367;
                                                                                if (dateTimeFormatterOfPattern == null) {
                                                                                    dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss O yyyy", Locale.ENGLISH);
                                                                                    f9367 = dateTimeFormatterOfPattern;
                                                                                }
                                                                                return ZonedDateTime.parse(new String(cArr, i, i4), dateTimeFormatterOfPattern);
                                                                            }
                                                                            if (i4 != 31 || c96 != ',') {
                                                                                return null;
                                                                            }
                                                                            DateTimeFormatter dateTimeFormatterOfPattern2 = f9376;
                                                                            if (dateTimeFormatterOfPattern2 == null) {
                                                                                dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
                                                                                f9376 = dateTimeFormatterOfPattern2;
                                                                            }
                                                                            return ZonedDateTime.parse(new String(cArr, i, i4), dateTimeFormatterOfPattern2);
                                                                        }
                                                                        c90 = c48;
                                                                        c91 = c76;
                                                                        c92 = c83;
                                                                        c93 = c156;
                                                                        c94 = c80;
                                                                        c95 = c157;
                                                                        if (i4 == 29) {
                                                                            c96 = c89;
                                                                            c97 = c72;
                                                                            c98 = c82;
                                                                            c99 = '0';
                                                                            c100 = c55;
                                                                            if (c58 != '-') {
                                                                                c101 = c58;
                                                                                if (i4 != 22) {
                                                                                }
                                                                                if (i4 != 32) {
                                                                                    if (i4 == 34) {
                                                                                    }
                                                                                } else if (i4 == 34) {
                                                                                }
                                                                                return m6450(new String(cArr, i, i4));
                                                                            }
                                                                        }
                                                                    } else {
                                                                        c72 = c71;
                                                                        c73 = c186;
                                                                        c74 = c188;
                                                                    }
                                                                    c79 = c67;
                                                                    c75 = c54;
                                                                    c77 = c3;
                                                                    c78 = c7;
                                                                    i4 = i2;
                                                                    c76 = c50;
                                                                    if (i4 == 25) {
                                                                    }
                                                                    if (c58 == '-') {
                                                                        c83 = c8;
                                                                        c84 = c185;
                                                                        if (c58 != '-') {
                                                                            c85 = c9;
                                                                            c86 = c187;
                                                                            if (c58 != '-') {
                                                                                c87 = c10;
                                                                                c88 = c184;
                                                                                char c1912 = c87;
                                                                                if (i4 != 28) {
                                                                                }
                                                                                cArr2 = cArr;
                                                                                char c1922 = c85;
                                                                                if (i4 != 28) {
                                                                                    c90 = c48;
                                                                                    c91 = c76;
                                                                                    c92 = c83;
                                                                                    c93 = c156;
                                                                                    c94 = c80;
                                                                                    c95 = c157;
                                                                                    if (i4 == 29) {
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                c30 = '0';
                                                                c24 = '0';
                                                                c23 = '0';
                                                                c22 = '0';
                                                                c21 = '0';
                                                                c20 = '0';
                                                                c19 = '0';
                                                                c18 = '0';
                                                                c17 = '0';
                                                                c16 = '0';
                                                            } else {
                                                                c62 = c189;
                                                            }
                                                        }
                                                        c71 = c57;
                                                        if (c58 == '-') {
                                                            c72 = c71;
                                                            c73 = c186;
                                                            c74 = c188;
                                                            c79 = c67;
                                                            c75 = c54;
                                                            c77 = c3;
                                                            c78 = c7;
                                                            i4 = i2;
                                                            c76 = c50;
                                                            if (i4 == 25) {
                                                            }
                                                            if (c58 == '-') {
                                                            }
                                                        }
                                                    } else {
                                                        c59 = c43;
                                                        c61 = c164;
                                                        c64 = c45;
                                                        c65 = c150;
                                                        c63 = c40;
                                                    }
                                                } else {
                                                    c59 = c43;
                                                    c60 = c47;
                                                    c61 = c164;
                                                    c62 = c153;
                                                    c63 = c40;
                                                    c64 = c45;
                                                    c65 = c150;
                                                }
                                                c66 = c42;
                                                if (c58 == '-') {
                                                    c67 = c66;
                                                    c68 = c6;
                                                    if (i2 == 24) {
                                                        c69 = c68;
                                                        char c1842 = c63;
                                                        char c1852 = c59;
                                                        char c1862 = c61;
                                                        char c1872 = c65;
                                                        char c1882 = c64;
                                                        if (i2 == 24) {
                                                            c70 = c151;
                                                            c71 = c57;
                                                            if (c58 == '-') {
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c57 = c159;
                                    c58 = c39;
                                    if (c58 == '-') {
                                        c59 = c43;
                                        c60 = c47;
                                        c61 = c164;
                                        c62 = c153;
                                        c63 = c40;
                                        c64 = c45;
                                        c65 = c150;
                                        c66 = c42;
                                        if (c58 == '-') {
                                        }
                                    }
                                } else {
                                    c52 = c44;
                                    c54 = c166;
                                    c50 = c163;
                                    c53 = c41;
                                }
                                c56 = c165;
                                c55 = c5;
                                c57 = c159;
                                c58 = c39;
                                if (c58 == '-') {
                                }
                            } else {
                                c50 = c163;
                                c51 = c49;
                                c52 = c44;
                                c53 = c41;
                                c54 = c166;
                            }
                            c55 = c5;
                            c56 = c165;
                            c57 = c159;
                            c58 = c39;
                            if (c58 == '-') {
                            }
                        }
                    } else {
                        c39 = c152;
                    }
                    c40 = c;
                    c41 = c11;
                    if (i2 != 22) {
                        c42 = c167;
                        if (i2 != 23) {
                        }
                    }
                }
            }
            i4 = i2;
            str = null;
        }
        if ((z && c38 == '1' && c37 == '2') ? false : z) {
            int iM6434 = m6434(c38, c37);
            c38 = (char) (iM6434 >> 16);
            c37 = (char) ((short) iM6434);
        }
        LocalDateTime localDateTimeM6438 = m6438(c36, c35, c34, c33, c32, c31, c30, c29, c38, c37, c28, c27, c26, c25, c24, c23, c22, c21, c20, c19, c18, c17, c16);
        if (localDateTimeM6438 == null) {
            return null;
        }
        if (!z2) {
            if (i5 == i4) {
                zoneId2 = zoneId;
                zoneIdM6416 = zoneId2;
            } else {
                int i9 = i + i5;
                char c194 = cArr2[i9];
                if (c194 == 'Z') {
                    zoneId3 = ZoneOffset.UTC;
                } else {
                    if (str == null) {
                        if (c194 == '+' || c194 == '-') {
                            str = new String(cArr2, i9, i4 - i5);
                        } else if (c194 == ' ') {
                            str = new String(cArr2, i9 + 1, (i4 - i5) - 1);
                        } else if (i5 < i4) {
                            str = new String(cArr2, i9 + 1, (i4 - i5) - 2);
                        }
                    }
                    zoneId2 = zoneId;
                    zoneIdM6416 = m6416(str, zoneId2);
                }
            }
            if (zoneIdM6416 != null) {
                zoneId2 = zoneIdM6416;
            }
            if (zoneId2 == null) {
                zoneId2 = f9372;
            }
            return ZonedDateTime.ofLocal(localDateTimeM6438, zoneId2, null);
        }
        String str8 = new String(cArr2, i5, i4 - i5);
        zoneId3 = (str8.equals("UTC") || str8.equals("[UTC]")) ? ZoneOffset.UTC : TimeZone.getTimeZone(str8).toZoneId();
        zoneIdM6416 = zoneId3;
        zoneId2 = zoneId;
        if (zoneIdM6416 != null) {
        }
        if (zoneId2 == null) {
        }
        return ZonedDateTime.ofLocal(localDateTimeM6438, zoneId2, null);
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
    */
    public static ZonedDateTime m6441(byte[] bArr, int i, int i2, ZoneId zoneId) {
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
        int i3;
        char c13;
        char c14;
        char c15;
        char c16;
        char c17;
        char c18;
        char c19;
        char c20;
        char c21;
        char c22;
        char c23;
        char c24;
        char c25;
        char c26;
        char c27;
        char c28;
        char c29;
        byte[] bArr2;
        char c30;
        String str;
        boolean z;
        int i4;
        boolean z2;
        char c31;
        char c32;
        char c33;
        char c34;
        int i5;
        char c35;
        char c36;
        char c37;
        char c38;
        char c39;
        char c40;
        char c41;
        char c42;
        char c43;
        char c44;
        char c45;
        int i6;
        char c46;
        char c47;
        char c48;
        char c49;
        char c50;
        char c51;
        char c52;
        char c53;
        char c54;
        char c55;
        char c56;
        char c57;
        char c58;
        char c59;
        char c60;
        char c61;
        char c62;
        char c63;
        char c64;
        char c65;
        char c66;
        char c67;
        char c68;
        char c69;
        char c70;
        char c71;
        char c72;
        char c73;
        char c74;
        char c75;
        char c76;
        char c77;
        char c78;
        char c79;
        char c80;
        char c81;
        char c82;
        char c83;
        char c84;
        char c85;
        char c86;
        char c87;
        char c88;
        char c89;
        char c90;
        char c91;
        char c92;
        char c93;
        char c94;
        char c95;
        char c96;
        char c97;
        char c98;
        char c99;
        char c100;
        char c101;
        char c102;
        char c103;
        char c104;
        char c105;
        char c106;
        char c107;
        char c108;
        char c109;
        char c110;
        char c111;
        char c112;
        char c113;
        char c114;
        char c115;
        char c116;
        char c117;
        char c118;
        char c119;
        char c120;
        char c121;
        char c122;
        char c123;
        char c124;
        char c125;
        char c126;
        char c127;
        LocalDateTime localDateTimeM6438;
        ZoneId zoneId2;
        ZoneId zoneIdM6416;
        ZoneId zoneId3;
        if (bArr == null || i2 == 0) {
            return null;
        }
        if (i2 == 16) {
            if (i + 16 > bArr.length) {
                String str2 = new String(bArr, i, bArr.length - i);
                throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
            }
            char c128 = (char) bArr[i];
            char c129 = (char) bArr[i + 1];
            char c130 = (char) bArr[i + 2];
            char c131 = (char) bArr[i + 3];
            char c132 = (char) bArr[i + 4];
            char c133 = (char) bArr[i + 5];
            char c134 = (char) bArr[i + 6];
            char c135 = (char) bArr[i + 7];
            char c136 = (char) bArr[i + 8];
            char c137 = (char) bArr[i + 9];
            int i7 = i + 10;
            char c138 = (char) bArr[i7];
            char c139 = (char) bArr[i + 13];
            if (c132 != '-' || c135 != '-' || ((c138 != '+' && c138 != '-') || c139 != ':')) {
                String str3 = new String(bArr, i, 16);
                throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
            }
            if (c128 < '0' || c128 > '9' || c129 < '0' || c129 > '9' || c130 < '0' || c130 > '9' || c131 < '0' || c131 > '9') {
                String str4 = new String(bArr, i, 16);
                throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
            }
            int iM703 = (c131 - '0') + AbstractC0900.m703(c130, 48, 10, AbstractC0900.m703(c129, 48, 100, (c128 - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
            if (c133 < '0' || c133 > '9' || c134 < '0' || c134 > '9') {
                String str5 = new String(bArr, i, 16);
                throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
            }
            int i8 = (c134 - '0') + ((c133 - '0') * 10);
            if (c136 < '0' || c136 > '9' || c137 < '0' || c137 > '9') {
                String str6 = new String(bArr, i, 16);
                throw new DateTimeParseException("illegal input ".concat(str6), str6, 0);
            }
            return ZonedDateTime.of(LocalDateTime.of(LocalDate.of(iM703, i8, (c137 - '0') + ((c136 - '0') * 10)), LocalTime.MIN), m6416(new String(bArr, i7, 6), zoneId));
        }
        if (i2 < 19) {
            return null;
        }
        char c140 = (char) bArr[i];
        char c141 = (char) bArr[i + 1];
        char c142 = (char) bArr[i + 2];
        byte b = bArr[i + 3];
        char c143 = (char) b;
        char c144 = (char) bArr[i + 4];
        char c145 = (char) bArr[i + 5];
        char c146 = (char) bArr[i + 6];
        char c147 = (char) bArr[i + 7];
        char c148 = (char) bArr[i + 8];
        char c149 = (char) bArr[i + 9];
        char c150 = (char) bArr[i + 10];
        char c151 = (char) bArr[i + 11];
        char c152 = (char) bArr[i + 12];
        char c153 = (char) bArr[i + 13];
        char c154 = (char) bArr[i + 14];
        char c155 = (char) bArr[i + 15];
        char c156 = (char) bArr[i + 16];
        char c157 = (char) bArr[i + 17];
        char c158 = (char) bArr[i + 18];
        char c159 = i2 == 19 ? ' ' : (char) bArr[i + 19];
        switch (i2) {
            case 19:
            case 20:
                c = c140;
                c2 = c141;
                c3 = '0';
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c11 = 0;
                c12 = 0;
                break;
            case 21:
                c = c140;
                c11 = (char) bArr[i + 20];
                c2 = c141;
                c3 = '0';
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                break;
            case 22:
                c = c140;
                char c160 = (char) bArr[i + 20];
                c3 = (char) bArr[i + 21];
                c2 = c141;
                c11 = c160;
                c4 = '0';
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                break;
            case 23:
                c = c140;
                char c161 = (char) bArr[i + 20];
                char c162 = (char) bArr[i + 21];
                c2 = c141;
                c11 = c161;
                c5 = '0';
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                c4 = (char) bArr[i + 22];
                c3 = c162;
                break;
            case 24:
                c = c140;
                char c163 = (char) bArr[i + 20];
                char c164 = (char) bArr[i + 21];
                char c165 = (char) bArr[i + 22];
                c5 = (char) bArr[i + 23];
                c2 = c141;
                c11 = c163;
                c3 = c164;
                c4 = c165;
                c6 = '0';
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                break;
            case 25:
                c = c140;
                char c166 = (char) bArr[i + 20];
                char c167 = (char) bArr[i + 21];
                char c168 = (char) bArr[i + 22];
                char c169 = (char) bArr[i + 23];
                c6 = (char) bArr[i + 24];
                c2 = c141;
                c11 = c166;
                c3 = c167;
                c4 = c168;
                c5 = c169;
                c7 = '0';
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                break;
            case 26:
                c = c140;
                char c170 = (char) bArr[i + 20];
                char c171 = (char) bArr[i + 21];
                char c172 = (char) bArr[i + 22];
                char c173 = (char) bArr[i + 23];
                char c174 = (char) bArr[i + 24];
                c7 = (char) bArr[i + 25];
                c2 = c141;
                c11 = c170;
                c3 = c171;
                c4 = c172;
                c5 = c173;
                c6 = c174;
                c8 = '0';
                c9 = '0';
                c10 = '0';
                c12 = 0;
                break;
            case 27:
                c = c140;
                char c175 = (char) bArr[i + 20];
                char c176 = (char) bArr[i + 21];
                char c177 = (char) bArr[i + 22];
                char c178 = (char) bArr[i + 23];
                char c179 = (char) bArr[i + 24];
                char c180 = (char) bArr[i + 25];
                c8 = (char) bArr[i + 26];
                c2 = c141;
                c11 = c175;
                c3 = c176;
                c4 = c177;
                c5 = c178;
                c6 = c179;
                c7 = c180;
                c9 = '0';
                c10 = '0';
                c12 = 0;
                break;
            case 28:
                c = c140;
                char c181 = (char) bArr[i + 20];
                char c182 = (char) bArr[i + 21];
                char c183 = (char) bArr[i + 22];
                char c184 = (char) bArr[i + 23];
                char c185 = (char) bArr[i + 24];
                char c186 = (char) bArr[i + 25];
                char c187 = (char) bArr[i + 26];
                c9 = (char) bArr[i + 27];
                c2 = c141;
                c11 = c181;
                c3 = c182;
                c4 = c183;
                c5 = c184;
                c6 = c185;
                c7 = c186;
                c8 = c187;
                c10 = '0';
                c12 = 0;
                break;
            case 29:
                c = c140;
                char c188 = (char) bArr[i + 20];
                char c189 = (char) bArr[i + 21];
                char c190 = (char) bArr[i + 22];
                char c191 = (char) bArr[i + 23];
                char c192 = (char) bArr[i + 24];
                char c193 = (char) bArr[i + 25];
                char c194 = (char) bArr[i + 26];
                char c195 = (char) bArr[i + 27];
                c10 = (char) bArr[i + 28];
                c2 = c141;
                c11 = c188;
                c3 = c189;
                c4 = c190;
                c5 = c191;
                c6 = c192;
                c7 = c193;
                c8 = c194;
                c9 = c195;
                c12 = 0;
                break;
            default:
                c = c140;
                char c196 = (char) bArr[i + 20];
                char c197 = (char) bArr[i + 21];
                char c198 = (char) bArr[i + 22];
                char c199 = (char) bArr[i + 23];
                char c200 = (char) bArr[i + 24];
                char c201 = (char) bArr[i + 25];
                char c202 = (char) bArr[i + 26];
                char c203 = (char) bArr[i + 27];
                char c204 = (char) bArr[i + 28];
                c12 = (char) bArr[i + 29];
                c2 = c141;
                c11 = c196;
                c3 = c197;
                c4 = c198;
                c5 = c199;
                c6 = c200;
                c7 = c201;
                c8 = c202;
                c9 = c203;
                c10 = c204;
                break;
        }
        if (c144 == '-' && c147 == '-' && ((c150 == ' ' || c150 == 'T') && c153 == ':' && c156 == ':' && (c159 == '[' || c159 == 'Z' || c159 == '+' || c159 == '-' || c159 == ' '))) {
            bArr2 = bArr;
            c22 = c154;
            c20 = c157;
            c27 = c142;
            c26 = c143;
            c25 = c145;
            c24 = c146;
            c19 = c158;
            str = null;
            c28 = c2;
            c23 = c149;
            c31 = c148;
            c21 = c155;
            c153 = c152;
            c29 = c;
            z2 = false;
            i4 = 19;
            c60 = '0';
        } else {
            if (c144 == '-' && c147 == '-' && c150 == ' ' && c151 == ' ' && c154 == ':' && c157 == ':') {
                i3 = 20;
                if (i2 == 20) {
                    z = false;
                    bArr2 = bArr;
                    c21 = c156;
                    c19 = c159;
                    i4 = 20;
                    c27 = c142;
                    c26 = c143;
                    c25 = c145;
                    c24 = c146;
                    c20 = c158;
                    str = null;
                    c28 = c2;
                    c23 = c149;
                    c31 = c148;
                    c22 = c155;
                    c30 = c152;
                    c29 = c;
                    z2 = false;
                }
                c60 = '0';
                c59 = '0';
                c58 = '0';
                c57 = '0';
                c61 = '0';
                c62 = '0';
                c63 = '0';
                c64 = '0';
                c65 = '0';
                if ((!z && c30 == '1' && c153 == '2') ? false : z) {
                    int iM6434 = m6434(c30, c153);
                    c30 = (char) (iM6434 >> 16);
                    c153 = (char) ((short) iM6434);
                }
                localDateTimeM6438 = m6438(c29, c28, c27, c26, c25, c24, c31, c23, c30, c153, c22, c21, c20, c19, c60, c59, c58, c57, c61, c62, c63, c64, c65);
                if (localDateTimeM6438 != null) {
                    return null;
                }
                if (!z2) {
                    if (i4 == i2) {
                        zoneId2 = zoneId;
                        zoneIdM6416 = zoneId2;
                    } else {
                        int i9 = i + i4;
                        char c205 = (char) bArr2[i9];
                        if (c205 == 'Z') {
                            zoneId3 = ZoneOffset.UTC;
                        } else {
                            if (str == null) {
                                if (c205 == '+' || c205 == '-') {
                                    str = new String(bArr2, i9, i2 - i4);
                                } else if (c205 == ' ') {
                                    str = new String(bArr2, i9 + 1, (i2 - i4) - 1);
                                } else if (i4 < i2) {
                                    str = new String(bArr2, i9 + 1, (i2 - i4) - 2);
                                }
                            }
                            zoneId2 = zoneId;
                            zoneIdM6416 = m6416(str, zoneId2);
                        }
                    }
                    if (zoneIdM6416 != null) {
                        zoneId2 = zoneIdM6416;
                    }
                    if (zoneId2 == null) {
                        zoneId2 = f9372;
                    }
                    return ZonedDateTime.ofLocal(localDateTimeM6438, zoneId2, null);
                }
                String str7 = new String(bArr2, i4, i2 - i4);
                zoneId3 = (str7.equals("UTC") || str7.equals("[UTC]")) ? ZoneOffset.UTC : TimeZone.getTimeZone(str7).toZoneId();
                zoneIdM6416 = zoneId3;
                zoneId2 = zoneId;
                if (zoneIdM6416 != null) {
                }
                if (zoneId2 == null) {
                }
                return ZonedDateTime.ofLocal(localDateTimeM6438, zoneId2, null);
            }
            i3 = 20;
            if (i2 == i3 && c142 == ' ' && c146 == ' ' && c151 == ' ' && c154 == ':' && c157 == ':') {
                int iM6429 = m6429(c143, c144, c145);
                if (iM6429 > 0) {
                    c127 = (char) ((iM6429 / 10) + 48);
                    c126 = (char) ((iM6429 % 10) + 48);
                } else {
                    c126 = '0';
                    c127 = '0';
                }
                bArr2 = bArr;
                c21 = c156;
                c26 = c150;
                c24 = c126;
                c19 = c159;
                c25 = c127;
                c29 = c147;
                c20 = c158;
                str = null;
                c23 = c2;
                c27 = c149;
                c28 = c148;
                c22 = c155;
                c30 = c152;
                c31 = c;
                z2 = false;
                i4 = 20;
                c60 = '0';
                c59 = '0';
                c58 = '0';
                c57 = '0';
                c61 = '0';
                c62 = '0';
                c63 = '0';
            } else if (c144 == '-' && c147 == '-' && ((c150 == ' ' || c150 == 'T') && c153 == ':' && c156 == ':' && c159 == '.' && (i2 == 21 || c3 == '[' || c3 == '+' || c3 == '-' || c3 == 'Z'))) {
                z2 = c3 == '|';
                bArr2 = bArr;
                c22 = c154;
                c20 = c157;
                c27 = c142;
                c26 = c143;
                c25 = c145;
                c24 = c146;
                c19 = c158;
                str = null;
                c28 = c2;
                c23 = c149;
                c31 = c148;
                c21 = c155;
                c153 = c152;
                c29 = c;
                c60 = c11;
                i4 = 21;
            } else {
                if (c144 == '-' && c147 == '-' && ((c150 == ' ' || c150 == 'T') && c153 == ':' && c156 == ':' && c159 == '.')) {
                    if (i2 != 22) {
                        c13 = c4;
                        c14 = c154;
                        if (c13 != '[') {
                            if (c13 != '+') {
                                if (c13 != '-') {
                                }
                            }
                        }
                    } else {
                        c13 = c4;
                        c14 = c154;
                    }
                    bArr2 = bArr;
                    z2 = c13 == '|';
                    c20 = c157;
                    c59 = c3;
                    c27 = c142;
                    c26 = c143;
                    c25 = c145;
                    c24 = c146;
                    c19 = c158;
                    str = null;
                    c28 = c2;
                    c23 = c149;
                    c31 = c148;
                    c21 = c155;
                    c153 = c152;
                    c29 = c;
                    c22 = c14;
                    c60 = c11;
                    i4 = 22;
                    c58 = '0';
                    c57 = '0';
                    c61 = '0';
                    c62 = '0';
                    c63 = '0';
                    c64 = '0';
                    c65 = '0';
                    z = false;
                    c30 = c151;
                    if ((!z && c30 == '1' && c153 == '2') ? false : z) {
                    }
                    localDateTimeM6438 = m6438(c29, c28, c27, c26, c25, c24, c31, c23, c30, c153, c22, c21, c20, c19, c60, c59, c58, c57, c61, c62, c63, c64, c65);
                    if (localDateTimeM6438 != null) {
                    }
                } else {
                    c13 = c4;
                    c14 = c154;
                }
                if (c144 == '-' && c147 == '-' && ((c150 == ' ' || c150 == 'T') && c153 == ':' && c156 == 'Z' && c157 == '[' && c3 == ']' && i2 == 22)) {
                    z = false;
                    bArr2 = bArr;
                    c27 = c142;
                    c26 = c143;
                    c25 = c145;
                    c24 = c146;
                    str = null;
                    c28 = c2;
                    c23 = c149;
                    c31 = c148;
                    c21 = c155;
                    c153 = c152;
                    c29 = c;
                    c22 = c14;
                    z2 = true;
                    i4 = 17;
                    c20 = '0';
                    c19 = '0';
                } else {
                    if (i2 == 22 && c143 == ' ') {
                        c17 = c144;
                        if (c145 == ',' && c146 == ' ' && c151 == ' ' && c153 == ':' && c156 == ':' && c159 == ' ') {
                            c18 = c11;
                            if (c18 != 'A' && c18 != 'P') {
                                char c206 = c2;
                                c15 = c147;
                                c16 = c206;
                            } else if (c3 == 'M') {
                                int iM64292 = m6429(c, c2, c142);
                                if (iM64292 > 0) {
                                    c125 = (char) ((iM64292 / 10) + 48);
                                    c124 = (char) ((iM64292 % 10) + 48);
                                } else {
                                    c124 = '0';
                                    c125 = '0';
                                }
                                z = c18 == 'P';
                                c30 = '0';
                                bArr2 = bArr;
                                c24 = c124;
                                c26 = c150;
                                c25 = c125;
                                c20 = c157;
                                c19 = c158;
                                str = null;
                                c29 = c147;
                                c27 = c149;
                                c28 = c148;
                                c21 = c155;
                                c153 = c152;
                                c22 = c14;
                                c23 = c17;
                                z2 = false;
                                i4 = 22;
                                c31 = '0';
                                c60 = '0';
                                c59 = '0';
                                c58 = '0';
                                c57 = '0';
                                c61 = '0';
                                c62 = '0';
                                c63 = '0';
                                c64 = '0';
                                c65 = '0';
                                if ((!z && c30 == '1' && c153 == '2') ? false : z) {
                                }
                                localDateTimeM6438 = m6438(c29, c28, c27, c26, c25, c24, c31, c23, c30, c153, c22, c21, c20, c19, c60, c59, c58, c57, c61, c62, c63, c64, c65);
                                if (localDateTimeM6438 != null) {
                                }
                            } else {
                                char c207 = c2;
                                c15 = c147;
                                c16 = c207;
                            }
                            if (i2 != 22 && c142 == '/' && c145 == '/' && c150 == ' ' && c153 == ':' && c156 == ':' && c159 == ' ') {
                                if (c18 != 'A') {
                                    c123 = 'P';
                                    if (c18 == 'P') {
                                    }
                                    if (i2 != 23) {
                                        c33 = c;
                                        c34 = c14;
                                        i5 = 23;
                                        if (i2 != 23) {
                                        }
                                        if (i2 == i5) {
                                            c38 = c36;
                                            if (i2 != 24) {
                                                c39 = c155;
                                                c40 = c38;
                                                c41 = c18;
                                                c42 = c34;
                                                c43 = c158;
                                                c44 = c5;
                                                c45 = c157;
                                                i6 = 24;
                                                if (i2 != 24) {
                                                }
                                                if (i2 == i6) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c123 = 'P';
                                }
                                c32 = c159;
                                if (c3 == 'M') {
                                    z = c18 == c123;
                                    bArr2 = bArr;
                                    c20 = c157;
                                    c31 = c143;
                                    c29 = c146;
                                    c24 = c16;
                                    c19 = c158;
                                    str = null;
                                    c28 = c15;
                                    c26 = c149;
                                    c27 = c148;
                                    c21 = c155;
                                    c153 = c152;
                                    c25 = c;
                                    c22 = c14;
                                    c23 = c17;
                                    z2 = false;
                                    i4 = 22;
                                }
                                if (i2 != 23) {
                                }
                            } else {
                                c32 = c159;
                                if (i2 != 23 && c143 == ' ' && c145 == ',' && c146 == ' ' && c151 == ' ') {
                                    c34 = c14;
                                    if (c34 == ':' && c157 == ':' && c18 == ' ' && ((c3 == 'A' || c3 == 'P') && c13 == 'M')) {
                                        int iM64293 = m6429(c, c16, c142);
                                        if (iM64293 > 0) {
                                            c122 = (char) ((iM64293 / 10) + 48);
                                            c121 = (char) ((iM64293 % 10) + 48);
                                        } else {
                                            c121 = '0';
                                            c122 = '0';
                                        }
                                        bArr2 = bArr;
                                        c21 = c156;
                                        c26 = c150;
                                        c24 = c121;
                                        c25 = c122;
                                        z = c3 == 'P';
                                        c20 = c158;
                                        str = null;
                                        c29 = c15;
                                        c27 = c149;
                                        c28 = c148;
                                        c22 = c155;
                                        c30 = c152;
                                        c19 = c32;
                                        c23 = c17;
                                        z2 = false;
                                        i4 = 23;
                                        c31 = '0';
                                        c60 = '0';
                                        c59 = '0';
                                        c58 = '0';
                                        c57 = '0';
                                        c61 = '0';
                                        c62 = '0';
                                        c63 = '0';
                                        c64 = '0';
                                        c65 = '0';
                                    } else {
                                        c33 = c;
                                    }
                                } else {
                                    c33 = c;
                                    c34 = c14;
                                }
                                i5 = 23;
                                if (i2 != 23) {
                                    c35 = c150;
                                    if (c143 == ' ' && c146 == ',') {
                                        c36 = c15;
                                        c37 = c153;
                                        c153 = c152;
                                        if (c36 == ' ' && c153 == ' ' && c34 == ':' && c157 == ':' && c18 == ' ' && ((c3 == 'A' || c3 == 'P') && c13 == 'M')) {
                                            int iM64294 = m6429(c33, c16, c142);
                                            if (iM64294 > 0) {
                                                c120 = (char) ((iM64294 / 10) + 48);
                                                c119 = (char) ((iM64294 % 10) + 48);
                                            } else {
                                                c119 = '0';
                                                c120 = '0';
                                            }
                                            z = c3 == 'P';
                                            c30 = '0';
                                            bArr2 = bArr;
                                            c24 = c119;
                                            c25 = c120;
                                            c26 = c151;
                                            c23 = c145;
                                            c20 = c158;
                                            str = null;
                                            c153 = c37;
                                            c28 = c149;
                                            c29 = c148;
                                            c22 = c155;
                                            c21 = c156;
                                            c27 = c35;
                                            c19 = c32;
                                            c31 = c17;
                                            z2 = false;
                                            i4 = 23;
                                            c60 = '0';
                                            c59 = '0';
                                            c58 = '0';
                                            c57 = '0';
                                            c61 = '0';
                                            c62 = '0';
                                            c63 = '0';
                                            c64 = '0';
                                            c65 = '0';
                                        }
                                    } else {
                                        c36 = c15;
                                        c37 = c153;
                                        c153 = c152;
                                    }
                                    i5 = 23;
                                } else {
                                    c35 = c150;
                                    c36 = c15;
                                    c37 = c153;
                                    c153 = c152;
                                }
                                if (i2 == i5 || c143 != ' ') {
                                    c38 = c36;
                                } else {
                                    c38 = c36;
                                    if (c145 == ',' && c146 == ' ' && c151 == ',' && c153 == ' ' && c34 == ':' && c157 == ':' && c18 == ' ' && ((c3 == 'A' || c3 == 'P') && c13 == 'M')) {
                                        int iM64295 = m6429(c33, c16, c142);
                                        if (iM64295 > 0) {
                                            c118 = (char) ((iM64295 / 10) + 48);
                                            c117 = (char) ((iM64295 % 10) + 48);
                                        } else {
                                            c117 = '0';
                                            c118 = '0';
                                        }
                                        z = c3 == 'P';
                                        c30 = '0';
                                        bArr2 = bArr;
                                        c24 = c117;
                                        c25 = c118;
                                        c20 = c158;
                                        str = null;
                                        c153 = c37;
                                        c27 = c149;
                                        c28 = c148;
                                        c22 = c155;
                                        c29 = c38;
                                        c21 = c156;
                                        c26 = c35;
                                        c19 = c32;
                                        c23 = c17;
                                        z2 = false;
                                        i4 = 23;
                                        c31 = '0';
                                        c60 = '0';
                                        c59 = '0';
                                        c58 = '0';
                                        c57 = '0';
                                        c61 = '0';
                                        c62 = '0';
                                        c63 = '0';
                                        c64 = '0';
                                        c65 = '0';
                                    }
                                }
                                if (i2 != 24 && c143 == ' ' && c146 == ',') {
                                    c40 = c38;
                                    if (c40 == ' ' && c153 == ' ') {
                                        c39 = c155;
                                        c41 = c18;
                                        c42 = c34;
                                        c43 = c158;
                                        if (c39 == ':') {
                                            if (c43 == ':' && c3 == ' ' && (c13 == 'A' || c13 == 'P')) {
                                                c45 = c157;
                                                c44 = c5;
                                                if (c44 == 'M') {
                                                    int iM64296 = m6429(c33, c16, c142);
                                                    if (iM64296 > 0) {
                                                        c116 = (char) ((iM64296 / 10) + 48);
                                                        c115 = (char) ((iM64296 % 10) + 48);
                                                    } else {
                                                        c115 = '0';
                                                        c116 = '0';
                                                    }
                                                    z = c13 == 'P';
                                                    bArr2 = bArr;
                                                    c24 = c115;
                                                    c25 = c116;
                                                    c26 = c151;
                                                    c23 = c145;
                                                    c21 = c45;
                                                    str = null;
                                                    c30 = c37;
                                                    c28 = c149;
                                                    c29 = c148;
                                                    c19 = c41;
                                                    c153 = c42;
                                                    c22 = c156;
                                                    c27 = c35;
                                                }
                                                c20 = c32;
                                                c31 = c17;
                                                z2 = false;
                                                i4 = 24;
                                                c60 = '0';
                                                c59 = '0';
                                                c58 = '0';
                                                c57 = '0';
                                                c61 = '0';
                                                c62 = '0';
                                                c63 = '0';
                                                c64 = '0';
                                                c65 = '0';
                                            }
                                        }
                                        i6 = 24;
                                        if (i2 != 24) {
                                            c46 = c151;
                                            if (c143 == ' ' && c146 == ',' && c40 == ' ' && c153 == ',') {
                                                c47 = c37;
                                                if (c47 == ' ' && c39 == ':' && c43 == ':' && c3 == ' ' && ((c13 == 'A' || c13 == 'P') && c44 == 'M')) {
                                                    int iM64297 = m6429(c33, c16, c142);
                                                    if (iM64297 > 0) {
                                                        c114 = (char) ((iM64297 / 10) + 48);
                                                        c113 = (char) ((iM64297 % 10) + 48);
                                                    } else {
                                                        c113 = '0';
                                                        c114 = '0';
                                                    }
                                                    z = c13 == 'P';
                                                    c30 = '0';
                                                    bArr2 = bArr;
                                                    c24 = c113;
                                                    c25 = c114;
                                                    c23 = c145;
                                                    c21 = c45;
                                                    str = null;
                                                    c28 = c149;
                                                    c29 = c148;
                                                    c19 = c41;
                                                    c153 = c42;
                                                    c22 = c156;
                                                    c27 = c35;
                                                    c26 = c46;
                                                    c20 = c32;
                                                    c31 = c17;
                                                    z2 = false;
                                                    i4 = 24;
                                                    c60 = '0';
                                                    c59 = '0';
                                                    c58 = '0';
                                                    c57 = '0';
                                                    c61 = '0';
                                                    c62 = '0';
                                                    c63 = '0';
                                                    c64 = '0';
                                                    c65 = '0';
                                                }
                                            } else {
                                                c47 = c37;
                                            }
                                            i6 = 24;
                                        } else {
                                            c46 = c151;
                                            c47 = c37;
                                        }
                                        if (i2 == i6 || c143 != ' ') {
                                            c48 = c143;
                                        } else {
                                            c48 = c143;
                                            if (c145 == ',' && c146 == ' ') {
                                                c49 = c145;
                                                c50 = c46;
                                                if (c50 == ',' && c153 == ' ' && c39 == ':' && c43 == ':' && c3 == ' ' && ((c13 == 'A' || c13 == 'P') && c44 == 'M')) {
                                                    int iM64298 = m6429(c33, c16, c142);
                                                    if (iM64298 > 0) {
                                                        c112 = (char) ((iM64298 / 10) + 48);
                                                        c111 = (char) ((iM64298 % 10) + 48);
                                                    } else {
                                                        c111 = '0';
                                                        c112 = '0';
                                                    }
                                                    z = c13 == 'P';
                                                    bArr2 = bArr;
                                                    c29 = c40;
                                                    c24 = c111;
                                                    c25 = c112;
                                                    c30 = c47;
                                                    c21 = c45;
                                                    str = null;
                                                    c27 = c149;
                                                    c28 = c148;
                                                    c19 = c41;
                                                    c153 = c42;
                                                    c22 = c156;
                                                    c26 = c35;
                                                    c20 = c32;
                                                    c23 = c17;
                                                    z2 = false;
                                                    i4 = 24;
                                                }
                                                c31 = '0';
                                                c60 = '0';
                                                c59 = '0';
                                                c58 = '0';
                                                c57 = '0';
                                                c61 = '0';
                                                c62 = '0';
                                                c63 = '0';
                                                c64 = '0';
                                                c65 = '0';
                                            }
                                            c51 = c17;
                                            if (c51 == '-' && c40 == '-') {
                                                c52 = c50;
                                                c53 = c35;
                                                if ((c53 == ' ' || c53 == 'T') && c47 == ':') {
                                                    c55 = c3;
                                                    c56 = c156;
                                                    c66 = c43;
                                                    if (c56 == ':') {
                                                        c54 = c32;
                                                        if (c54 == '.') {
                                                            if (i2 == 23 || c44 == '[') {
                                                                c110 = '|';
                                                                c21 = c39;
                                                                z2 = c44 == c110;
                                                                c58 = c13;
                                                                c27 = c142;
                                                                c29 = c33;
                                                                c24 = c146;
                                                                c28 = c16;
                                                                c20 = c45;
                                                                str = null;
                                                                c26 = c48;
                                                                c23 = c149;
                                                                c31 = c148;
                                                                c60 = c41;
                                                                c22 = c42;
                                                                c19 = c66;
                                                                c59 = c55;
                                                                c30 = c52;
                                                                c25 = c49;
                                                                i4 = 23;
                                                                c57 = '0';
                                                                c61 = '0';
                                                                c62 = '0';
                                                                c63 = '0';
                                                                c64 = '0';
                                                                c65 = '0';
                                                                z = false;
                                                                bArr2 = bArr;
                                                            } else if (c44 != '|') {
                                                                if (c44 != '+') {
                                                                    if (c44 != '-') {
                                                                    }
                                                                }
                                                                c110 = '|';
                                                                c21 = c39;
                                                                z2 = c44 == c110;
                                                                c58 = c13;
                                                                c27 = c142;
                                                                c29 = c33;
                                                                c24 = c146;
                                                                c28 = c16;
                                                                c20 = c45;
                                                                str = null;
                                                                c26 = c48;
                                                                c23 = c149;
                                                                c31 = c148;
                                                                c60 = c41;
                                                                c22 = c42;
                                                                c19 = c66;
                                                                c59 = c55;
                                                                c30 = c52;
                                                                c25 = c49;
                                                                i4 = 23;
                                                                c57 = '0';
                                                                c61 = '0';
                                                                c62 = '0';
                                                                c63 = '0';
                                                                c64 = '0';
                                                                c65 = '0';
                                                                z = false;
                                                                bArr2 = bArr;
                                                            } else {
                                                                c110 = '|';
                                                                c21 = c39;
                                                                z2 = c44 == c110;
                                                                c58 = c13;
                                                                c27 = c142;
                                                                c29 = c33;
                                                                c24 = c146;
                                                                c28 = c16;
                                                                c20 = c45;
                                                                str = null;
                                                                c26 = c48;
                                                                c23 = c149;
                                                                c31 = c148;
                                                                c60 = c41;
                                                                c22 = c42;
                                                                c19 = c66;
                                                                c59 = c55;
                                                                c30 = c52;
                                                                c25 = c49;
                                                                i4 = 23;
                                                                c57 = '0';
                                                                c61 = '0';
                                                                c62 = '0';
                                                                c63 = '0';
                                                                c64 = '0';
                                                                c65 = '0';
                                                                z = false;
                                                                bArr2 = bArr;
                                                            }
                                                        }
                                                    } else {
                                                        c54 = c32;
                                                    }
                                                    if (c51 == '-' && c40 == '-' && ((c53 == ' ' || c53 == 'T') && c47 == ':' && c56 == ':' && c54 == '.')) {
                                                        if (i2 != 24) {
                                                            c67 = c6;
                                                            c68 = c39;
                                                            if (c67 != '[') {
                                                                if (c67 == '|') {
                                                                    c109 = '|';
                                                                    z2 = c67 != c109;
                                                                    c57 = c44;
                                                                    c58 = c13;
                                                                    c27 = c142;
                                                                    c29 = c33;
                                                                    c24 = c146;
                                                                    c28 = c16;
                                                                    c20 = c45;
                                                                    str = null;
                                                                    c26 = c48;
                                                                    c23 = c149;
                                                                    c31 = c148;
                                                                    c60 = c41;
                                                                    c22 = c42;
                                                                    c19 = c66;
                                                                    c59 = c55;
                                                                    c30 = c52;
                                                                    c21 = c68;
                                                                    c25 = c49;
                                                                    i4 = 24;
                                                                    c61 = '0';
                                                                    c62 = '0';
                                                                    c63 = '0';
                                                                    c64 = '0';
                                                                    c65 = '0';
                                                                    z = false;
                                                                    bArr2 = bArr;
                                                                } else if (c67 != '+') {
                                                                    if (c67 != '-') {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            c67 = c6;
                                                            c68 = c39;
                                                        }
                                                        c109 = '|';
                                                        if (c67 != c109) {
                                                        }
                                                        c57 = c44;
                                                        c58 = c13;
                                                        c27 = c142;
                                                        c29 = c33;
                                                        c24 = c146;
                                                        c28 = c16;
                                                        c20 = c45;
                                                        str = null;
                                                        c26 = c48;
                                                        c23 = c149;
                                                        c31 = c148;
                                                        c60 = c41;
                                                        c22 = c42;
                                                        c19 = c66;
                                                        c59 = c55;
                                                        c30 = c52;
                                                        c21 = c68;
                                                        c25 = c49;
                                                        i4 = 24;
                                                        c61 = '0';
                                                        c62 = '0';
                                                        c63 = '0';
                                                        c64 = '0';
                                                        c65 = '0';
                                                        z = false;
                                                        bArr2 = bArr;
                                                    } else {
                                                        c67 = c6;
                                                        c68 = c39;
                                                    }
                                                    if (c51 != '-' && c40 == '-' && ((c53 == ' ' || c53 == 'T') && c47 == ':' && c56 == ':' && c54 == '.')) {
                                                        if (i2 != 25) {
                                                            c69 = c7;
                                                            c70 = c53;
                                                            if (c69 != '[') {
                                                                if (c69 == '|') {
                                                                    c108 = '|';
                                                                    z2 = c69 != c108;
                                                                    c57 = c44;
                                                                    c61 = c67;
                                                                    c58 = c13;
                                                                    c27 = c142;
                                                                    c29 = c33;
                                                                    c24 = c146;
                                                                    c28 = c16;
                                                                    c20 = c45;
                                                                    str = null;
                                                                    c26 = c48;
                                                                    c23 = c149;
                                                                    c31 = c148;
                                                                    c60 = c41;
                                                                    c22 = c42;
                                                                    c19 = c66;
                                                                    c59 = c55;
                                                                    c30 = c52;
                                                                    c21 = c68;
                                                                    c25 = c49;
                                                                    i4 = 25;
                                                                    c62 = '0';
                                                                    c63 = '0';
                                                                    c64 = '0';
                                                                    c65 = '0';
                                                                    z = false;
                                                                    bArr2 = bArr;
                                                                } else if (c69 != '+') {
                                                                    if (c69 != '-') {
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            c69 = c7;
                                                        }
                                                        c108 = '|';
                                                        if (c69 != c108) {
                                                        }
                                                        c57 = c44;
                                                        c61 = c67;
                                                        c58 = c13;
                                                        c27 = c142;
                                                        c29 = c33;
                                                        c24 = c146;
                                                        c28 = c16;
                                                        c20 = c45;
                                                        str = null;
                                                        c26 = c48;
                                                        c23 = c149;
                                                        c31 = c148;
                                                        c60 = c41;
                                                        c22 = c42;
                                                        c19 = c66;
                                                        c59 = c55;
                                                        c30 = c52;
                                                        c21 = c68;
                                                        c25 = c49;
                                                        i4 = 25;
                                                        c62 = '0';
                                                        c63 = '0';
                                                        c64 = '0';
                                                        c65 = '0';
                                                        z = false;
                                                        bArr2 = bArr;
                                                    } else {
                                                        c69 = c7;
                                                        c70 = c53;
                                                    }
                                                    if (i2 != 25) {
                                                        char c208 = c48;
                                                        c72 = c69;
                                                        c71 = c208;
                                                        if (c208 == ' ' && c146 == ',' && c40 == ' ' && c153 == ',' && c47 == ' ' && c56 == ':' && c54 == ':' && c13 == ' ' && ((c44 == 'A' || c44 == 'P') && c67 == 'M')) {
                                                            int iM64299 = m6429(c33, c16, c142);
                                                            if (iM64299 > 0) {
                                                                c107 = (char) ((iM64299 / 10) + 48);
                                                                c106 = (char) ((iM64299 % 10) + 48);
                                                            } else {
                                                                c106 = '0';
                                                                c107 = '0';
                                                            }
                                                            z = c44 == 'P';
                                                            bArr2 = bArr;
                                                            c24 = c106;
                                                            c25 = c107;
                                                            c31 = c51;
                                                            c22 = c45;
                                                            str = null;
                                                            c28 = c149;
                                                            c29 = c148;
                                                            c20 = c41;
                                                            c30 = c42;
                                                            c21 = c66;
                                                            c19 = c55;
                                                            c26 = c52;
                                                            c153 = c68;
                                                            c27 = c70;
                                                            c23 = c49;
                                                            z2 = false;
                                                            i4 = 25;
                                                        }
                                                        c60 = '0';
                                                        c59 = '0';
                                                        c58 = '0';
                                                        c57 = '0';
                                                        c61 = '0';
                                                        c62 = '0';
                                                        c63 = '0';
                                                        c64 = '0';
                                                        c65 = '0';
                                                    } else {
                                                        c71 = c48;
                                                        c72 = c69;
                                                    }
                                                    if (c51 == '-' || c40 != '-') {
                                                        c73 = c70;
                                                    } else {
                                                        c73 = c70;
                                                        if ((c73 == ' ' || c73 == 'T') && c47 == ':' && c56 == ':' && c54 == '.') {
                                                            if (i2 != 26) {
                                                                c75 = c8;
                                                                c74 = c142;
                                                                if (c75 != '[') {
                                                                    if (c75 == '|') {
                                                                        c105 = '|';
                                                                        z2 = c75 != c105;
                                                                        c57 = c44;
                                                                        c61 = c67;
                                                                        c58 = c13;
                                                                        c29 = c33;
                                                                        c24 = c146;
                                                                        c28 = c16;
                                                                        c20 = c45;
                                                                        str = null;
                                                                        c62 = c72;
                                                                        c23 = c149;
                                                                        c31 = c148;
                                                                        c60 = c41;
                                                                        c22 = c42;
                                                                        c19 = c66;
                                                                        c59 = c55;
                                                                        c30 = c52;
                                                                        c21 = c68;
                                                                        c27 = c74;
                                                                        c26 = c71;
                                                                        c25 = c49;
                                                                        i4 = 26;
                                                                        c63 = '0';
                                                                        c64 = '0';
                                                                        c65 = '0';
                                                                        z = false;
                                                                        bArr2 = bArr;
                                                                    } else if (c75 != '+') {
                                                                        if (c75 != '-') {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c75 = c8;
                                                                c74 = c142;
                                                            }
                                                            c105 = '|';
                                                            if (c75 != c105) {
                                                            }
                                                            c57 = c44;
                                                            c61 = c67;
                                                            c58 = c13;
                                                            c29 = c33;
                                                            c24 = c146;
                                                            c28 = c16;
                                                            c20 = c45;
                                                            str = null;
                                                            c62 = c72;
                                                            c23 = c149;
                                                            c31 = c148;
                                                            c60 = c41;
                                                            c22 = c42;
                                                            c19 = c66;
                                                            c59 = c55;
                                                            c30 = c52;
                                                            c21 = c68;
                                                            c27 = c74;
                                                            c26 = c71;
                                                            c25 = c49;
                                                            i4 = 26;
                                                            c63 = '0';
                                                            c64 = '0';
                                                            c65 = '0';
                                                            z = false;
                                                            bArr2 = bArr;
                                                        }
                                                        if (c51 == '-' && c40 == '-' && ((c73 == ' ' || c73 == 'T') && c47 == ':' && c56 == ':' && c54 == '.')) {
                                                            if (i2 != 27) {
                                                                c76 = c9;
                                                                c77 = c33;
                                                                if (c76 != '[') {
                                                                    if (c76 != '|') {
                                                                        if (c76 != '+') {
                                                                            if (c76 != '-') {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c76 = c9;
                                                                c77 = c33;
                                                            }
                                                            if (c44 == ' ') {
                                                                z = false;
                                                                bArr2 = bArr;
                                                                c58 = c13;
                                                                c24 = c146;
                                                                c28 = c16;
                                                                c20 = c45;
                                                                str = null;
                                                                c23 = c149;
                                                                c31 = c148;
                                                                c60 = c41;
                                                                c22 = c42;
                                                                c19 = c66;
                                                                c59 = c55;
                                                                c30 = c52;
                                                                c21 = c68;
                                                                c27 = c74;
                                                                c29 = c77;
                                                                c26 = c71;
                                                                c25 = c49;
                                                                z2 = false;
                                                                i4 = 23;
                                                                c57 = '0';
                                                                c61 = '0';
                                                                c62 = '0';
                                                                c63 = '0';
                                                                c64 = '0';
                                                                c65 = '0';
                                                            } else {
                                                                z2 = c76 == '|';
                                                                bArr2 = bArr;
                                                                c63 = c75;
                                                                c57 = c44;
                                                                c61 = c67;
                                                                c58 = c13;
                                                                c24 = c146;
                                                                c28 = c16;
                                                                c20 = c45;
                                                                str = null;
                                                                c62 = c72;
                                                                c23 = c149;
                                                                c31 = c148;
                                                                c60 = c41;
                                                                c22 = c42;
                                                                c19 = c66;
                                                                c59 = c55;
                                                                c30 = c52;
                                                                c21 = c68;
                                                                c27 = c74;
                                                                c29 = c77;
                                                                c26 = c71;
                                                                c25 = c49;
                                                                i4 = 27;
                                                            }
                                                        } else {
                                                            c76 = c9;
                                                            c77 = c33;
                                                        }
                                                        if (c51 != '-' && c40 == '-' && ((c73 == ' ' || c73 == 'T') && c47 == ':' && c56 == ':' && c54 == '.')) {
                                                            if (i2 != 28) {
                                                                c78 = c10;
                                                                c79 = c16;
                                                                if (c78 != '[') {
                                                                    if (c78 == '|') {
                                                                        c104 = '|';
                                                                        z2 = c78 != c104;
                                                                        bArr2 = bArr;
                                                                        c63 = c75;
                                                                        c57 = c44;
                                                                        c61 = c67;
                                                                        c58 = c13;
                                                                        c64 = c76;
                                                                        c24 = c146;
                                                                        c20 = c45;
                                                                        str = null;
                                                                        c62 = c72;
                                                                        c23 = c149;
                                                                        c31 = c148;
                                                                        c60 = c41;
                                                                        c22 = c42;
                                                                        c19 = c66;
                                                                        c59 = c55;
                                                                        c30 = c52;
                                                                        c21 = c68;
                                                                        c27 = c74;
                                                                        c29 = c77;
                                                                        c28 = c79;
                                                                        c26 = c71;
                                                                        c25 = c49;
                                                                        i4 = 28;
                                                                        c65 = '0';
                                                                        z = false;
                                                                    } else if (c78 != '+') {
                                                                        if (c78 != '-') {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c78 = c10;
                                                                c79 = c16;
                                                            }
                                                            c104 = '|';
                                                            if (c78 != c104) {
                                                            }
                                                            bArr2 = bArr;
                                                            c63 = c75;
                                                            c57 = c44;
                                                            c61 = c67;
                                                            c58 = c13;
                                                            c64 = c76;
                                                            c24 = c146;
                                                            c20 = c45;
                                                            str = null;
                                                            c62 = c72;
                                                            c23 = c149;
                                                            c31 = c148;
                                                            c60 = c41;
                                                            c22 = c42;
                                                            c19 = c66;
                                                            c59 = c55;
                                                            c30 = c52;
                                                            c21 = c68;
                                                            c27 = c74;
                                                            c29 = c77;
                                                            c28 = c79;
                                                            c26 = c71;
                                                            c25 = c49;
                                                            i4 = 28;
                                                            c65 = '0';
                                                            z = false;
                                                        } else {
                                                            c78 = c10;
                                                            c79 = c16;
                                                        }
                                                        char c209 = c78;
                                                        if (i2 != 28) {
                                                            c80 = c71;
                                                            if (c80 == ' ' && c40 == ' ' && c73 == ' ' && c47 == ':' && c56 == ':' && c54 == ' ' && c44 == ' ') {
                                                                int iM642910 = m6429(c51, c49, c146);
                                                                if (iM642910 > 0) {
                                                                    c103 = (char) ((iM642910 / 10) + 48);
                                                                    c102 = (char) ((iM642910 % 10) + 48);
                                                                } else {
                                                                    c102 = '0';
                                                                    c103 = '0';
                                                                }
                                                                str = new String(bArr, i + 20, 3);
                                                                c24 = c102;
                                                                c27 = c75;
                                                                c25 = c103;
                                                                c29 = c67;
                                                                c26 = c76;
                                                                bArr2 = bArr;
                                                                c20 = c45;
                                                                c28 = c72;
                                                                c23 = c149;
                                                                c31 = c148;
                                                                c22 = c42;
                                                                c19 = c66;
                                                                c30 = c52;
                                                                c21 = c68;
                                                                z2 = false;
                                                                i4 = 19;
                                                                z = false;
                                                                c60 = '0';
                                                                c59 = '0';
                                                                c58 = '0';
                                                                c57 = '0';
                                                                c61 = '0';
                                                                c62 = '0';
                                                                c63 = '0';
                                                                c64 = '0';
                                                                c65 = '0';
                                                            }
                                                        } else {
                                                            c80 = c71;
                                                        }
                                                        bArr2 = bArr;
                                                        char c210 = c76;
                                                        if (i2 != 28 && c80 == ',' && c51 == ' ' && c146 == ' ' && c73 == ' ') {
                                                            c83 = c153;
                                                            c84 = c68;
                                                            if (c84 == ' ') {
                                                                char c211 = c66;
                                                                c86 = c75;
                                                                if (c211 == ':') {
                                                                    c85 = c211;
                                                                    char c212 = c55;
                                                                    if (c212 == ':' && c67 == ' ') {
                                                                        int iM642911 = m6429(c40, c148, c149);
                                                                        if (iM642911 > 0) {
                                                                            c101 = (char) ((iM642911 / 10) + 48);
                                                                            c100 = (char) ((iM642911 % 10) + 48);
                                                                        } else {
                                                                            c100 = '0';
                                                                            c101 = '0';
                                                                        }
                                                                        c24 = c100;
                                                                        c25 = c101;
                                                                        c19 = c44;
                                                                        c30 = c56;
                                                                        c20 = c13;
                                                                        c27 = c47;
                                                                        c22 = c54;
                                                                        c153 = c45;
                                                                        str = null;
                                                                        c21 = c41;
                                                                        c26 = c42;
                                                                        z2 = true;
                                                                        c29 = c52;
                                                                        c28 = c83;
                                                                        c23 = c49;
                                                                        i4 = 24;
                                                                        z = false;
                                                                        c31 = '0';
                                                                        c60 = '0';
                                                                        c59 = '0';
                                                                        c58 = '0';
                                                                        c57 = '0';
                                                                        c61 = '0';
                                                                        c62 = '0';
                                                                        c63 = '0';
                                                                        c64 = '0';
                                                                        c65 = '0';
                                                                    } else {
                                                                        c81 = c67;
                                                                        c82 = c149;
                                                                        c87 = c148;
                                                                        c55 = c212;
                                                                        if (i2 != 29 && c80 == ',' && c51 == ' ' && c40 == ' ') {
                                                                            c88 = c80;
                                                                            c90 = c52;
                                                                            if (c90 == ' ' && c56 == ' ' && c54 == ':' && c13 == ':') {
                                                                                c89 = c72;
                                                                                c92 = c44;
                                                                                if (c89 != ' ') {
                                                                                    c91 = '0';
                                                                                    if (c51 == '-' && c40 == '-' && ((c73 == ' ' || c73 == 'T') && c47 == ':' && c56 == ':' && c54 == '.')) {
                                                                                        if (i2 != 29) {
                                                                                            c93 = c51;
                                                                                            c95 = c12;
                                                                                            if (c95 != '[') {
                                                                                                if (c95 == '|') {
                                                                                                    c96 = '|';
                                                                                                    c31 = c87;
                                                                                                    c21 = c84;
                                                                                                    z2 = c95 != c96;
                                                                                                    c23 = c82;
                                                                                                    c58 = c13;
                                                                                                    c62 = c89;
                                                                                                    c24 = c146;
                                                                                                    c30 = c90;
                                                                                                    c20 = c45;
                                                                                                    str = null;
                                                                                                    c57 = c92;
                                                                                                    c61 = c81;
                                                                                                    c60 = c41;
                                                                                                    c22 = c42;
                                                                                                    c64 = c210;
                                                                                                    c63 = c86;
                                                                                                    c59 = c55;
                                                                                                    c19 = c85;
                                                                                                    c153 = c83;
                                                                                                    c27 = c74;
                                                                                                    c29 = c77;
                                                                                                    c28 = c79;
                                                                                                    c65 = c209;
                                                                                                    c26 = c88;
                                                                                                    c25 = c49;
                                                                                                    i4 = 29;
                                                                                                    z = false;
                                                                                                } else if (c95 != '+') {
                                                                                                    if (c95 != '-') {
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else {
                                                                                            c95 = c12;
                                                                                        }
                                                                                        c96 = '|';
                                                                                        c31 = c87;
                                                                                        c21 = c84;
                                                                                        z2 = c95 != c96;
                                                                                        c23 = c82;
                                                                                        c58 = c13;
                                                                                        c62 = c89;
                                                                                        c24 = c146;
                                                                                        c30 = c90;
                                                                                        c20 = c45;
                                                                                        str = null;
                                                                                        c57 = c92;
                                                                                        c61 = c81;
                                                                                        c60 = c41;
                                                                                        c22 = c42;
                                                                                        c64 = c210;
                                                                                        c63 = c86;
                                                                                        c59 = c55;
                                                                                        c19 = c85;
                                                                                        c153 = c83;
                                                                                        c27 = c74;
                                                                                        c29 = c77;
                                                                                        c28 = c79;
                                                                                        c65 = c209;
                                                                                        c26 = c88;
                                                                                        c25 = c49;
                                                                                        i4 = 29;
                                                                                        z = false;
                                                                                    } else {
                                                                                        c93 = c51;
                                                                                    }
                                                                                    if (i2 != 22) {
                                                                                        c94 = c45;
                                                                                        if (c94 == '+' || c94 == '-') {
                                                                                            c23 = c40;
                                                                                            c59 = c84;
                                                                                            c153 = c82;
                                                                                            c58 = c56;
                                                                                            c19 = c47;
                                                                                            c22 = c73;
                                                                                            c31 = c146;
                                                                                            c21 = c90;
                                                                                            c25 = c93;
                                                                                            c57 = c91;
                                                                                            c61 = c57;
                                                                                            c62 = c61;
                                                                                            c63 = c62;
                                                                                            c64 = c63;
                                                                                            c65 = c64;
                                                                                            str = null;
                                                                                            c60 = c42;
                                                                                            c20 = c83;
                                                                                            c27 = c74;
                                                                                            c29 = c77;
                                                                                            c28 = c79;
                                                                                            c26 = c88;
                                                                                            c24 = c49;
                                                                                            z2 = false;
                                                                                            z = false;
                                                                                            c30 = c87;
                                                                                            i4 = 17;
                                                                                        }
                                                                                    } else {
                                                                                        c94 = c45;
                                                                                    }
                                                                                    if ((i2 != 32 && c146 == ',' && c40 == ' ' && c73 == '-' && c42 == '-' && c54 == ' ' && c13 == ':' && c89 == ':' && bArr[i + 28] == 32) || ((i2 == 33 && c40 == ',' && c87 == ' ' && c90 == '-' && c84 == '-' && c41 == ' ' && c92 == ':' && c86 == ':' && bArr[i + 29] == 32) || ((i2 == 34 && c87 == ',' && c82 == ' ' && c83 == '-' && c56 == '-' && c55 == ' ' && c81 == ':' && c210 == ':' && bArr[i + 30] == 32) || (i2 == 35 && c82 == ',' && c73 == ' ' && c47 == '-' && c94 == '-' && c13 == ' ' && c89 == ':' && c209 == ':' && bArr[i + 31] == 32)))) {
                                                                                        return m6450(new String(bArr, i, i2));
                                                                                    }
                                                                                    if (i2 == 34) {
                                                                                        DateTimeFormatter dateTimeFormatterOfPattern = f9367;
                                                                                        if (dateTimeFormatterOfPattern == null) {
                                                                                            dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss O yyyy", Locale.ENGLISH);
                                                                                            f9367 = dateTimeFormatterOfPattern;
                                                                                        }
                                                                                        return ZonedDateTime.parse(new String(bArr, i, i2), dateTimeFormatterOfPattern);
                                                                                    }
                                                                                    if (i2 != 31 || b != 44) {
                                                                                        return null;
                                                                                    }
                                                                                    DateTimeFormatter dateTimeFormatterOfPattern2 = f9376;
                                                                                    if (dateTimeFormatterOfPattern2 == null) {
                                                                                        dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("EEE, dd MMM yyyy HH:mm:ss Z", Locale.ENGLISH);
                                                                                        f9376 = dateTimeFormatterOfPattern2;
                                                                                    }
                                                                                    return ZonedDateTime.parse(new String(bArr, i, i2), dateTimeFormatterOfPattern2);
                                                                                }
                                                                                int iM642912 = m6429(c87, c82, c73);
                                                                                if (iM642912 > 0) {
                                                                                    c97 = '0';
                                                                                    c99 = (char) ((iM642912 / 10) + 48);
                                                                                    c98 = (char) ((iM642912 % 10) + 48);
                                                                                } else {
                                                                                    c97 = '0';
                                                                                    c98 = '0';
                                                                                    c99 = '0';
                                                                                }
                                                                                c24 = c98;
                                                                                c25 = c99;
                                                                                c26 = c84;
                                                                                c28 = c47;
                                                                                c23 = c146;
                                                                                c30 = c45;
                                                                                c60 = c97;
                                                                                c59 = c60;
                                                                                c58 = c59;
                                                                                c57 = c58;
                                                                                c61 = c57;
                                                                                c62 = c61;
                                                                                c63 = c62;
                                                                                c64 = c63;
                                                                                c65 = c64;
                                                                                str = null;
                                                                                c20 = c92;
                                                                                c19 = c81;
                                                                                c22 = c41;
                                                                                c27 = c42;
                                                                                c21 = c55;
                                                                                z2 = true;
                                                                                c153 = c85;
                                                                                c29 = c83;
                                                                                c31 = c49;
                                                                                i4 = 25;
                                                                                z = false;
                                                                            } else {
                                                                                c89 = c72;
                                                                            }
                                                                        } else {
                                                                            c88 = c80;
                                                                            c89 = c72;
                                                                            c90 = c52;
                                                                        }
                                                                        c91 = '0';
                                                                        c92 = c44;
                                                                        if (c51 == '-') {
                                                                            c93 = c51;
                                                                            if (i2 != 22) {
                                                                            }
                                                                            if (i2 != 32) {
                                                                                if (i2 == 34) {
                                                                                }
                                                                            } else if (i2 == 34) {
                                                                            }
                                                                            return m6450(new String(bArr, i, i2));
                                                                        }
                                                                    }
                                                                } else {
                                                                    c81 = c67;
                                                                    c82 = c149;
                                                                    c85 = c211;
                                                                    c87 = c148;
                                                                    if (i2 != 29) {
                                                                        c88 = c80;
                                                                        c89 = c72;
                                                                        c90 = c52;
                                                                        c91 = '0';
                                                                        c92 = c44;
                                                                        if (c51 == '-') {
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                c81 = c67;
                                                                c82 = c149;
                                                            }
                                                        } else {
                                                            c81 = c67;
                                                            c82 = c149;
                                                            c83 = c153;
                                                            c84 = c68;
                                                        }
                                                        c85 = c66;
                                                        c86 = c75;
                                                        c87 = c148;
                                                        if (i2 != 29) {
                                                        }
                                                    }
                                                    c75 = c8;
                                                    c74 = c142;
                                                    if (c51 == '-') {
                                                        c76 = c9;
                                                        c77 = c33;
                                                        if (c51 != '-') {
                                                            c78 = c10;
                                                            c79 = c16;
                                                            char c2092 = c78;
                                                            if (i2 != 28) {
                                                            }
                                                            bArr2 = bArr;
                                                            char c2102 = c76;
                                                            if (i2 != 28) {
                                                                c81 = c67;
                                                                c82 = c149;
                                                                c83 = c153;
                                                                c84 = c68;
                                                                c85 = c66;
                                                                c86 = c75;
                                                                c87 = c148;
                                                                if (i2 != 29) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    c55 = c3;
                                                    c56 = c156;
                                                    c54 = c32;
                                                }
                                            } else {
                                                c52 = c50;
                                                c53 = c35;
                                                c54 = c32;
                                                c55 = c3;
                                                c56 = c156;
                                            }
                                            c66 = c43;
                                            if (c51 == '-') {
                                                c67 = c6;
                                                c68 = c39;
                                                if (c51 != '-') {
                                                    c69 = c7;
                                                    c70 = c53;
                                                    if (i2 != 25) {
                                                    }
                                                    if (c51 == '-') {
                                                        c73 = c70;
                                                        c75 = c8;
                                                        c74 = c142;
                                                        if (c51 == '-') {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        c49 = c145;
                                        c50 = c46;
                                        c51 = c17;
                                        if (c51 == '-') {
                                            c52 = c50;
                                            c53 = c35;
                                            c54 = c32;
                                            c55 = c3;
                                            c56 = c156;
                                            c66 = c43;
                                            if (c51 == '-') {
                                            }
                                        }
                                    } else {
                                        c42 = c34;
                                        c43 = c158;
                                        c39 = c155;
                                        c41 = c18;
                                    }
                                    c45 = c157;
                                    c44 = c5;
                                    i6 = 24;
                                    if (i2 != 24) {
                                    }
                                    if (i2 == i6) {
                                        c48 = c143;
                                        c49 = c145;
                                        c50 = c46;
                                        c51 = c17;
                                        if (c51 == '-') {
                                        }
                                    }
                                } else {
                                    c39 = c155;
                                    c40 = c38;
                                    c41 = c18;
                                    c42 = c34;
                                    c43 = c158;
                                }
                                c44 = c5;
                                c45 = c157;
                                i6 = 24;
                                if (i2 != 24) {
                                }
                                if (i2 == i6) {
                                }
                            }
                            if ((!z && c30 == '1' && c153 == '2') ? false : z) {
                            }
                            localDateTimeM6438 = m6438(c29, c28, c27, c26, c25, c24, c31, c23, c30, c153, c22, c21, c20, c19, c60, c59, c58, c57, c61, c62, c63, c64, c65);
                            if (localDateTimeM6438 != null) {
                            }
                        } else {
                            char c213 = c2;
                            c15 = c147;
                            c16 = c213;
                        }
                    } else {
                        char c214 = c2;
                        c15 = c147;
                        c16 = c214;
                        c17 = c144;
                    }
                    c18 = c11;
                    if (i2 != 22) {
                        c32 = c159;
                        if (i2 != 23) {
                        }
                    }
                    if ((!z && c30 == '1' && c153 == '2') ? false : z) {
                    }
                    localDateTimeM6438 = m6438(c29, c28, c27, c26, c25, c24, c31, c23, c30, c153, c22, c21, c20, c19, c60, c59, c58, c57, c61, c62, c63, c64, c65);
                    if (localDateTimeM6438 != null) {
                    }
                }
                c60 = '0';
                c59 = '0';
                c58 = '0';
                c57 = '0';
                c61 = '0';
                c62 = '0';
                c63 = '0';
                c64 = '0';
                c65 = '0';
                c30 = c151;
                if ((!z && c30 == '1' && c153 == '2') ? false : z) {
                }
                localDateTimeM6438 = m6438(c29, c28, c27, c26, c25, c24, c31, c23, c30, c153, c22, c21, c20, c19, c60, c59, c58, c57, c61, c62, c63, c64, c65);
                if (localDateTimeM6438 != null) {
                }
            }
            c64 = '0';
            c65 = '0';
            z = false;
            if ((!z && c30 == '1' && c153 == '2') ? false : z) {
            }
            localDateTimeM6438 = m6438(c29, c28, c27, c26, c25, c24, c31, c23, c30, c153, c22, c21, c20, c19, c60, c59, c58, c57, c61, c62, c63, c64, c65);
            if (localDateTimeM6438 != null) {
            }
        }
        c59 = '0';
        c58 = '0';
        c57 = '0';
        c61 = '0';
        c62 = '0';
        c63 = '0';
        c64 = '0';
        c65 = '0';
        z = false;
        c30 = c151;
        if ((!z && c30 == '1' && c153 == '2') ? false : z) {
        }
        localDateTimeM6438 = m6438(c29, c28, c27, c26, c25, c24, c31, c23, c30, c153, c22, c21, c20, c19, c60, c59, c58, c57, c61, c62, c63, c64, c65);
        if (localDateTimeM6438 != null) {
        }
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
    */
    public static long m6442(char[] cArr, int i, ZoneId zoneId) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        String str;
        char c8;
        cArr.getClass();
        char c9 = cArr[i];
        char c10 = cArr[i + 1];
        char c11 = cArr[i + 2];
        char c12 = cArr[i + 3];
        char c13 = cArr[i + 4];
        char c14 = cArr[i + 5];
        char c15 = cArr[i + 6];
        char c16 = cArr[i + 7];
        char c17 = cArr[i + 8];
        char c18 = cArr[i + 9];
        char c19 = cArr[i + 10];
        char c20 = cArr[i + 11];
        char c21 = cArr[i + 12];
        char c22 = cArr[i + 13];
        char c23 = cArr[i + 14];
        char c24 = cArr[i + 15];
        char c25 = cArr[i + 16];
        char c26 = cArr[i + 17];
        char c27 = cArr[i + 18];
        if (c13 == '-' && c16 == '-' && ((c19 == ' ' || c19 == 'T') && c22 == ':' && c25 == ':')) {
            c16 = c10;
            c6 = c11;
            c19 = c12;
            c25 = c24;
            c5 = c17;
            c2 = c18;
            c22 = c21;
            c7 = c26;
            c4 = c23;
            str = "illegal input ";
            c3 = c9;
            c8 = '0';
        } else {
            char c28 = '/';
            if (c13 == '/' && c16 == '/') {
                if ((c19 != ' ' && c19 != 'T') || c22 != ':' || c25 != ':') {
                    c28 = '/';
                }
                c16 = c10;
                c6 = c11;
                c19 = c12;
                c25 = c24;
                c5 = c17;
                c2 = c18;
                c22 = c21;
                c7 = c26;
                c4 = c23;
                str = "illegal input ";
                c3 = c9;
                c8 = '0';
            }
            if ((c11 == c28 && c14 == c28) || ((c11 == '-' && c14 == '-') || (c11 == '.' && c14 == '.'))) {
                c = ' ';
                if (c19 != ' ') {
                    if (c10 == c) {
                        if (c22 == ':') {
                        }
                        c = ' ';
                    }
                    if (c11 == c) {
                        if (c11 == c) {
                        }
                    }
                } else {
                    if (c22 == ':' && c25 == ':') {
                        c2 = c10;
                        c14 = c12;
                        c25 = c24;
                        c5 = c9;
                        c19 = c18;
                        c22 = c21;
                        c7 = c26;
                        c4 = c23;
                        c3 = c15;
                        str = "illegal input ";
                        c8 = '0';
                    }
                    c = ' ';
                    if (c10 == c) {
                    }
                    if (c11 == c) {
                    }
                }
                c15 = c13;
                c6 = c17;
            } else {
                c = ' ';
                if (c10 == c && c14 == c && c19 == c) {
                    if (c22 == ':' || c25 != ':') {
                        c = ' ';
                    } else {
                        int iM6429 = m6429(c11, c12, c13);
                        if (iM6429 <= 0) {
                            String str2 = new String(cArr, i, 19);
                            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                        }
                        c13 = (char) ((iM6429 % 10) + 48);
                        c14 = (char) ((iM6429 / 10) + 48);
                        c25 = c24;
                        c2 = c9;
                        c19 = c18;
                        c22 = c21;
                        c7 = c26;
                        c5 = '0';
                        c4 = c23;
                        c3 = c15;
                        str = "illegal input ";
                        c8 = '0';
                        c15 = c13;
                        c6 = c17;
                    }
                }
                if (c11 == c && c15 == c && c20 == c) {
                    if (c22 == ':' && c25 == ':') {
                        int iM64292 = m6429(c12, c13, c14);
                        if (iM64292 <= 0) {
                            String str3 = new String(cArr, i, 19);
                            throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
                        }
                        char c29 = (char) ((iM64292 / 10) + 48);
                        char c30 = (char) ((iM64292 % 10) + 48);
                        c2 = c10;
                        c14 = c29;
                        c15 = c30;
                        c25 = c24;
                        c5 = c9;
                        c6 = c18;
                        c22 = c21;
                        c7 = c26;
                        c20 = '0';
                        c4 = c23;
                        c3 = c16;
                        str = "illegal input ";
                        c16 = c17;
                        c8 = '0';
                    } else {
                        c = ' ';
                        if (c11 == c) {
                            if (c11 == c) {
                            }
                            String str4 = new String(cArr, i, 19);
                            throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
                        }
                    }
                } else if (c11 == c && c15 == c && c20 == c) {
                    if (c23 != ':' || c25 != ':') {
                        c = ' ';
                        if (c11 == c) {
                        }
                        String str42 = new String(cArr, i, 19);
                        throw new DateTimeParseException("illegal input ".concat(str42), str42, 0);
                    }
                    int iM64293 = m6429(c12, c13, c14);
                    if (iM64293 <= 0) {
                        String str5 = new String(cArr, i, 19);
                        throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
                    }
                    c2 = c10;
                    c14 = (char) ((iM64293 / 10) + 48);
                    c15 = (char) ((iM64293 % 10) + 48);
                    c3 = c16;
                    c25 = c24;
                    c5 = c9;
                    c16 = c17;
                    c6 = c18;
                    c20 = c21;
                    c7 = c26;
                    c4 = '0';
                    str = "illegal input ";
                    c8 = '0';
                } else {
                    if (c11 == c || c15 != c || c20 != c || c23 != ':' || c26 != ':') {
                        String str422 = new String(cArr, i, 19);
                        throw new DateTimeParseException("illegal input ".concat(str422), str422, 0);
                    }
                    int iM64294 = m6429(c12, c13, c14);
                    if (iM64294 <= 0) {
                        String str6 = new String(cArr, i, 19);
                        throw new DateTimeParseException("illegal input ".concat(str6), str6, 0);
                    }
                    c2 = c10;
                    c14 = (char) ((iM64294 / 10) + 48);
                    c15 = (char) ((iM64294 % 10) + 48);
                    c3 = c16;
                    c4 = c24;
                    c5 = c9;
                    c16 = c17;
                    c6 = c18;
                    c20 = c21;
                    c7 = '0';
                    str = "illegal input ";
                    c8 = '0';
                }
            }
        }
        if (c3 < c8 || c3 > '9' || c16 < c8 || c16 > '9' || c6 < c8 || c6 > '9' || c19 < c8 || c19 > '9') {
            char[] cArr2 = cArr;
            String str7 = str;
            String str8 = new String(cArr2, i, 19);
            throw new DateTimeParseException(str7.concat(str8), str8, 0);
        }
        int iM703 = (c19 - c8) + AbstractC0900.m703(c6, c8, 10, AbstractC0900.m703(c16, c8, 100, (c3 - c8) * DescriptorProtos$Edition.EDITION_2023_VALUE));
        if (c14 < c8 || c14 > '9' || c15 < c8 || c15 > '9') {
            String str9 = new String(cArr, i, 19);
            throw new DateTimeParseException(str.concat(str9), str9, 0);
        }
        int i2 = (c15 - c8) + ((c14 - c8) * 10);
        if ((i2 == 0 && iM703 != 0) || i2 > 12) {
            String str10 = str;
            String str11 = new String(cArr, i, 19);
            throw new DateTimeParseException(str10.concat(str11), str11, 0);
        }
        if (c5 < c8 || c5 > '9' || c2 < c8 || c2 > '9') {
            String str12 = new String(cArr, i, 19);
            throw new DateTimeParseException(str.concat(str12), str12, 0);
        }
        int i3 = (c2 - c8) + ((c5 - c8) * 10);
        int i4 = i2 != 2 ? (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31 : ((iM703 & 3) != 0 || (iM703 % 100 == 0 && iM703 % 400 != 0)) ? 28 : 29;
        if ((i3 == 0 && iM703 != 0) || i3 > i4) {
            String str13 = str;
            String str14 = new String(cArr, i, 19);
            throw new DateTimeParseException(str13.concat(str14), str14, 0);
        }
        if (c20 < '0' || c20 > '9' || c22 < '0' || c22 > '9') {
            String str15 = new String(cArr, i, 19);
            throw new DateTimeParseException(str.concat(str15), str15, 0);
        }
        int i5 = (c22 - '0') + ((c20 - '0') * 10);
        if (c4 < '0' || c4 > '9' || c25 < '0' || c25 > '9') {
            String str16 = new String(cArr, i, 19);
            throw new DateTimeParseException(str.concat(str16), str16, 0);
        }
        int i6 = (c25 - '0') + ((c4 - '0') * 10);
        if (c7 < '0' || c7 > '9' || c27 < '0' || c27 > '9') {
            String str17 = new String(cArr, i, 19);
            throw new DateTimeParseException(str.concat(str17), str17, 0);
        }
        int i7 = (c27 - '0') + ((c7 - '0') * 10);
        boolean z = true;
        if (iM703 == 0 && i2 == 0 && i3 == 0) {
            iM703 = 1970;
            i3 = 1;
            i2 = 1;
        }
        long jM6421 = (m6421(iM703, i2, i3) * 86400) + ((long) (i5 * 3600)) + ((long) (i6 * 60)) + ((long) i7);
        ZoneId zoneId2 = zoneId == null ? f9372 : zoneId;
        if (zoneId2 != f9371 && zoneId2.getRules() != f9370) {
            z = false;
        }
        return (jM6421 - ((long) ((!z || jM6421 < 684900000) ? (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : zoneId2.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM703, i2, i3), LocalTime.of(i5, i6, i7, 0))).getTotalSeconds() : 28800))) * 1000;
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
    */
    public static long m6443(byte[] bArr, int i, ZoneId zoneId) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        String str;
        char c8;
        bArr.getClass();
        char c9 = (char) bArr[i];
        char c10 = (char) bArr[i + 1];
        char c11 = (char) bArr[i + 2];
        char c12 = (char) bArr[i + 3];
        char c13 = (char) bArr[i + 4];
        char c14 = (char) bArr[i + 5];
        char c15 = (char) bArr[i + 6];
        char c16 = (char) bArr[i + 7];
        char c17 = (char) bArr[i + 8];
        char c18 = (char) bArr[i + 9];
        char c19 = (char) bArr[i + 10];
        char c20 = (char) bArr[i + 11];
        char c21 = (char) bArr[i + 12];
        char c22 = (char) bArr[i + 13];
        char c23 = (char) bArr[i + 14];
        char c24 = (char) bArr[i + 15];
        char c25 = (char) bArr[i + 16];
        char c26 = (char) bArr[i + 17];
        char c27 = (char) bArr[i + 18];
        if (c13 == '-' && c16 == '-' && ((c19 == ' ' || c19 == 'T') && c22 == ':' && c25 == ':')) {
            c16 = c10;
            c6 = c11;
            c19 = c12;
            c4 = c17;
            c25 = c24;
            c2 = c18;
            c22 = c21;
            c7 = c26;
            c5 = c23;
            c3 = c9;
            str = "illegal input ";
            c8 = '0';
        } else {
            char c28 = '/';
            if (c13 == '/' && c16 == '/') {
                if ((c19 != ' ' && c19 != 'T') || c22 != ':' || c25 != ':') {
                    c28 = '/';
                }
                c16 = c10;
                c6 = c11;
                c19 = c12;
                c4 = c17;
                c25 = c24;
                c2 = c18;
                c22 = c21;
                c7 = c26;
                c5 = c23;
                c3 = c9;
                str = "illegal input ";
                c8 = '0';
            }
            if ((c11 == c28 && c14 == c28) || ((c11 == '-' && c14 == '-') || (c11 == '.' && c14 == '.'))) {
                c = ' ';
                if (c19 != ' ') {
                    if (c10 == c) {
                        if (c22 == ':') {
                        }
                        c = ' ';
                    }
                    if (c11 == c) {
                        if (c11 == c) {
                        }
                    }
                } else {
                    if (c22 == ':' && c25 == ':') {
                        c2 = c10;
                        c14 = c12;
                        c4 = c9;
                        c25 = c24;
                        c19 = c18;
                        c22 = c21;
                        c7 = c26;
                        c5 = c23;
                        c3 = c15;
                        str = "illegal input ";
                        c8 = '0';
                    }
                    c = ' ';
                    if (c10 == c) {
                    }
                    if (c11 == c) {
                    }
                }
                c15 = c13;
                c6 = c17;
            } else {
                c = ' ';
                if (c10 == c && c14 == c && c19 == c) {
                    if (c22 == ':' || c25 != ':') {
                        c = ' ';
                    } else {
                        int iM6429 = m6429(c11, c12, c13);
                        if (iM6429 <= 0) {
                            String str2 = new String(bArr, i, 19);
                            throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                        }
                        c13 = (char) ((iM6429 % 10) + 48);
                        c14 = (char) ((iM6429 / 10) + 48);
                        c2 = c9;
                        c25 = c24;
                        c19 = c18;
                        c22 = c21;
                        c7 = c26;
                        c4 = '0';
                        c5 = c23;
                        c3 = c15;
                        str = "illegal input ";
                        c8 = '0';
                        c15 = c13;
                        c6 = c17;
                    }
                }
                if (c11 == c && c15 == c && c20 == c) {
                    if (c22 == ':' && c25 == ':') {
                        int iM64292 = m6429(c12, c13, c14);
                        if (iM64292 <= 0) {
                            String str3 = new String(bArr, i, 19);
                            throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
                        }
                        char c29 = (char) ((iM64292 / 10) + 48);
                        char c30 = (char) ((iM64292 % 10) + 48);
                        c2 = c10;
                        c14 = c29;
                        c15 = c30;
                        c4 = c9;
                        c25 = c24;
                        c6 = c18;
                        c22 = c21;
                        c7 = c26;
                        c20 = '0';
                        c5 = c23;
                        c3 = c16;
                        str = "illegal input ";
                        c16 = c17;
                        c8 = '0';
                    } else {
                        c = ' ';
                        if (c11 == c) {
                            if (c11 == c) {
                            }
                            String str4 = new String(bArr, i, 19);
                            throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
                        }
                    }
                } else if (c11 == c && c15 == c && c20 == c) {
                    if (c23 != ':' || c25 != ':') {
                        c = ' ';
                        if (c11 == c) {
                        }
                        String str42 = new String(bArr, i, 19);
                        throw new DateTimeParseException("illegal input ".concat(str42), str42, 0);
                    }
                    int iM64293 = m6429(c12, c13, c14);
                    if (iM64293 <= 0) {
                        String str5 = new String(bArr, i, 19);
                        throw new DateTimeParseException("illegal input ".concat(str5), str5, 0);
                    }
                    c2 = c10;
                    c14 = (char) ((iM64293 / 10) + 48);
                    c15 = (char) ((iM64293 % 10) + 48);
                    c3 = c16;
                    c4 = c9;
                    c16 = c17;
                    c25 = c24;
                    c6 = c18;
                    c20 = c21;
                    c7 = c26;
                    c5 = '0';
                    str = "illegal input ";
                    c8 = '0';
                } else {
                    if (c11 == c || c15 != c || c20 != c || c23 != ':' || c26 != ':') {
                        String str422 = new String(bArr, i, 19);
                        throw new DateTimeParseException("illegal input ".concat(str422), str422, 0);
                    }
                    int iM64294 = m6429(c12, c13, c14);
                    if (iM64294 <= 0) {
                        String str6 = new String(bArr, i, 19);
                        throw new DateTimeParseException("illegal input ".concat(str6), str6, 0);
                    }
                    c2 = c10;
                    c14 = (char) ((iM64294 / 10) + 48);
                    c15 = (char) ((iM64294 % 10) + 48);
                    c3 = c16;
                    c4 = c9;
                    c16 = c17;
                    c5 = c24;
                    c6 = c18;
                    c20 = c21;
                    c7 = '0';
                    str = "illegal input ";
                    c8 = '0';
                }
            }
        }
        if (c3 < c8 || c3 > '9' || c16 < c8 || c16 > '9' || c6 < c8 || c6 > '9' || c19 < c8 || c19 > '9') {
            byte[] bArr2 = bArr;
            String str7 = str;
            String str8 = new String(bArr2, i, 19);
            throw new DateTimeParseException(str7.concat(str8), str8, 0);
        }
        int iM703 = (c19 - c8) + AbstractC0900.m703(c6, c8, 10, AbstractC0900.m703(c16, c8, 100, (c3 - c8) * DescriptorProtos$Edition.EDITION_2023_VALUE));
        if (c14 < c8 || c14 > '9' || c15 < c8 || c15 > '9') {
            String str9 = new String(bArr, i, 19);
            throw new DateTimeParseException(str.concat(str9), str9, 0);
        }
        int i2 = (c15 - c8) + ((c14 - c8) * 10);
        if ((i2 == 0 && iM703 != 0) || i2 > 12) {
            String str10 = str;
            String str11 = new String(bArr, i, 19);
            throw new DateTimeParseException(str10.concat(str11), str11, 0);
        }
        if (c4 < c8 || c4 > '9' || c2 < c8 || c2 > '9') {
            String str12 = new String(bArr, i, 19);
            throw new DateTimeParseException(str.concat(str12), str12, 0);
        }
        int i3 = (c2 - c8) + ((c4 - c8) * 10);
        int i4 = i2 != 2 ? (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31 : ((iM703 & 3) != 0 || (iM703 % 100 == 0 && iM703 % 400 != 0)) ? 28 : 29;
        if ((i3 == 0 && iM703 != 0) || i3 > i4) {
            String str13 = str;
            String str14 = new String(bArr, i, 19);
            throw new DateTimeParseException(str13.concat(str14), str14, 0);
        }
        if (c20 < '0' || c20 > '9' || c22 < '0' || c22 > '9') {
            String str15 = new String(bArr, i, 19);
            throw new DateTimeParseException(str.concat(str15), str15, 0);
        }
        int i5 = (c22 - '0') + ((c20 - '0') * 10);
        if (c5 < '0' || c5 > '9' || c25 < '0' || c25 > '9') {
            String str16 = new String(bArr, i, 19);
            throw new DateTimeParseException(str.concat(str16), str16, 0);
        }
        int i6 = (c25 - '0') + ((c5 - '0') * 10);
        if (c7 < '0' || c7 > '9' || c27 < '0' || c27 > '9') {
            String str17 = new String(bArr, i, 19);
            throw new DateTimeParseException(str.concat(str17), str17, 0);
        }
        int i7 = (c27 - '0') + ((c7 - '0') * 10);
        boolean z = true;
        if (iM703 == 0 && i2 == 0 && i3 == 0) {
            iM703 = 1970;
            i3 = 1;
            i2 = 1;
        }
        long jM6421 = (m6421(iM703, i2, i3) * 86400) + ((long) (i5 * 3600)) + ((long) (i6 * 60)) + ((long) i7);
        ZoneId zoneId2 = zoneId == null ? f9372 : zoneId;
        if (zoneId2 != f9371 && zoneId2.getRules() != f9370) {
            z = false;
        }
        return (jM6421 - ((long) ((!z || jM6421 < 684900000) ? (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : zoneId2.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM703, i2, i3), LocalTime.of(i5, i6, i7, 0))).getTotalSeconds() : 28800))) * 1000;
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024c  */
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m6444(String str, ZoneId zoneId, DateUtils$DateTimeFormatPattern dateUtils$DateTimeFormatPattern) {
        char cCharAt;
        char cCharAt2;
        char cCharAt3;
        char cCharAt4;
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
        Function function;
        char c17;
        char c18;
        char c19;
        char c20;
        char c21;
        String str2;
        int i;
        if (str != null && !"null".equals(str)) {
            if (dateUtils$DateTimeFormatPattern.length == 19) {
                if (AbstractC3687.f9263 == 8) {
                    char[] cArrM6330 = AbstractC3687.m6330(str);
                    if (cArrM6330.length != 19) {
                        throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                    }
                    char c22 = cArrM6330[0];
                    char c23 = cArrM6330[1];
                    cCharAt = cArrM6330[2];
                    char c24 = cArrM6330[3];
                    char c25 = cArrM6330[4];
                    char c26 = cArrM6330[5];
                    char c27 = cArrM6330[6];
                    cCharAt2 = cArrM6330[7];
                    char c28 = cArrM6330[8];
                    char c29 = cArrM6330[9];
                    char c30 = cArrM6330[10];
                    char c31 = cArrM6330[11];
                    char c32 = cArrM6330[12];
                    char c33 = cArrM6330[13];
                    char c34 = cArrM6330[14];
                    char c35 = cArrM6330[15];
                    char c36 = cArrM6330[16];
                    char c37 = cArrM6330[17];
                    cCharAt4 = cArrM6330[18];
                    c14 = c37;
                    c12 = c36;
                    c4 = c35;
                    c5 = c34;
                    c16 = c33;
                    c6 = c24;
                    c11 = c25;
                    c = c26;
                    c2 = c27;
                    c15 = c29;
                    c3 = c30;
                    c13 = c28;
                    c7 = c22;
                    c8 = c23;
                    c9 = c31;
                    c10 = c32;
                } else {
                    ToIntFunction toIntFunction = AbstractC3687.f9271;
                    if (toIntFunction != null && (function = AbstractC3687.f9272) != null && toIntFunction.applyAsInt(str) == 0) {
                        byte[] bArr = (byte[]) function.apply(str);
                        if (bArr.length != 19) {
                            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                        }
                        char c38 = (char) bArr[0];
                        char c39 = (char) bArr[1];
                        cCharAt = (char) bArr[2];
                        c6 = (char) bArr[3];
                        char c40 = (char) bArr[4];
                        char c41 = (char) bArr[5];
                        char c42 = (char) bArr[6];
                        char c43 = (char) bArr[7];
                        char c44 = (char) bArr[8];
                        char c45 = (char) bArr[9];
                        char c46 = (char) bArr[10];
                        char c47 = (char) bArr[11];
                        char c48 = (char) bArr[12];
                        cCharAt3 = (char) bArr[13];
                        char c49 = (char) bArr[14];
                        char c50 = (char) bArr[15];
                        char c51 = (char) bArr[16];
                        char c52 = (char) bArr[17];
                        cCharAt4 = (char) bArr[18];
                        c = c41;
                        cCharAt2 = c43;
                        c11 = c40;
                        c9 = c47;
                        c3 = c46;
                        c2 = c42;
                        c14 = c52;
                        c12 = c51;
                        c13 = c44;
                        c15 = c45;
                        c4 = c50;
                        c5 = c49;
                        c7 = c38;
                        c8 = c39;
                        c10 = c48;
                    } else {
                        if (str.length() != 19) {
                            throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                        }
                        char cCharAt5 = str.charAt(0);
                        char cCharAt6 = str.charAt(1);
                        cCharAt = str.charAt(2);
                        char cCharAt7 = str.charAt(3);
                        char cCharAt8 = str.charAt(4);
                        char cCharAt9 = str.charAt(5);
                        char cCharAt10 = str.charAt(6);
                        cCharAt2 = str.charAt(7);
                        char cCharAt11 = str.charAt(8);
                        char cCharAt12 = str.charAt(9);
                        char cCharAt13 = str.charAt(10);
                        char cCharAt14 = str.charAt(11);
                        char cCharAt15 = str.charAt(12);
                        cCharAt3 = str.charAt(13);
                        char cCharAt16 = str.charAt(14);
                        char cCharAt17 = str.charAt(15);
                        char cCharAt18 = str.charAt(16);
                        char cCharAt19 = str.charAt(17);
                        cCharAt4 = str.charAt(18);
                        c = cCharAt9;
                        c2 = cCharAt10;
                        c3 = cCharAt13;
                        c4 = cCharAt17;
                        c5 = cCharAt16;
                        c6 = cCharAt7;
                        c7 = cCharAt5;
                        c8 = cCharAt6;
                        c9 = cCharAt14;
                        c10 = cCharAt15;
                        c11 = cCharAt8;
                        c12 = cCharAt18;
                        c13 = cCharAt11;
                        c14 = cCharAt19;
                        c15 = cCharAt12;
                    }
                    c16 = cCharAt3;
                }
                int iOrdinal = dateUtils$DateTimeFormatPattern.ordinal();
                char c53 = c6;
                char c54 = cCharAt4;
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            if (iOrdinal != 6) {
                                throw new DateTimeParseException("illegal input", str, 0);
                            }
                            if (cCharAt != '.' || c != '.' || c3 != ' ' || c16 != ':' || c12 != ':') {
                                throw new DateTimeParseException("illegal input", str, 0);
                            }
                            c20 = c2;
                            c21 = c15;
                            cCharAt = c13;
                            c19 = c7;
                            c18 = c8;
                            c17 = c53;
                            if (c20 >= '0') {
                                str2 = str;
                                i = 0;
                            } else {
                                if (c20 <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9' && cCharAt >= '0' && cCharAt <= '9' && c21 >= '0' && c21 <= '9') {
                                    int iM703 = (c21 - '0') + AbstractC0900.m703(cCharAt, 48, 10, AbstractC0900.m703(cCharAt2, 48, 100, (c20 - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
                                    if (c17 < '0' || c17 > '9' || c11 < '0' || c11 > '9') {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    int i2 = (c11 - '0') + ((c17 - '0') * 10);
                                    if ((i2 == 0 && iM703 != 0) || i2 > 12) {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    if (c19 < '0' || c19 > '9' || c18 < '0' || c18 > '9') {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    int i3 = (c18 - '0') + ((c19 - '0') * 10);
                                    int i4 = i2 != 2 ? (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31 : ((iM703 & 3) != 0 || (iM703 % 100 == 0 && iM703 % 400 != 0)) ? 28 : 29;
                                    if ((i3 == 0 && iM703 != 0) || i3 > i4) {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    if (c9 < '0' || c9 > '9' || c10 < '0' || c10 > '9') {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    int i5 = (c10 - '0') + ((c9 - '0') * 10);
                                    if (c5 < '0' || c5 > '9' || c4 < '0' || c4 > '9') {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    int i6 = (c4 - '0') + ((c5 - '0') * 10);
                                    if (c14 < '0' || c14 > '9' || c54 < '0' || c54 > '9') {
                                        throw new DateTimeParseException("illegal input", str, 0);
                                    }
                                    int i7 = (c54 - '0') + ((c14 - '0') * 10);
                                    if (iM703 == 0 && i2 == 0 && i3 == 0) {
                                        iM703 = 1970;
                                        i3 = 1;
                                        i2 = 1;
                                    }
                                    long jM6421 = (m6421(iM703, i2, i3) * 86400) + ((long) (i5 * 3600)) + ((long) (i6 * 60)) + ((long) i7);
                                    ZoneId zoneId2 = zoneId == null ? f9372 : zoneId;
                                    return (jM6421 - ((long) ((!(zoneId2 == f9371 || zoneId2.getRules() == f9370) || jM6421 < 684900000) ? (zoneId2 == ZoneOffset.UTC || "UTC".equals(zoneId2.getId())) ? 0 : zoneId2.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM703, i2, i3), LocalTime.of(i5, i6, i7, 0))).getTotalSeconds() : 28800))) * 1000;
                                }
                                i = 0;
                                str2 = str;
                            }
                            throw new DateTimeParseException("illegal input", str2, i);
                        }
                        if (c11 != '/' || cCharAt2 != '/' || c3 != ' ' || c16 != ':' || c12 != ':') {
                            throw new DateTimeParseException("illegal input", str, 0);
                        }
                    } else if (c11 != '-' || cCharAt2 != '-' || c3 != 'T' || c16 != ':' || c12 != ':') {
                        throw new DateTimeParseException("illegal input", str, 0);
                    }
                } else if (c11 != '-' || cCharAt2 != '-' || c3 != ' ' || c16 != ':' || c12 != ':') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                c17 = c;
                c11 = c2;
                c18 = c15;
                c19 = c13;
                c20 = c7;
                cCharAt2 = c8;
                c21 = c53;
                if (c20 >= '0') {
                }
                throw new DateTimeParseException("illegal input", str2, i);
            }
            C6385.m11441();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public static long m6445(String str, ZoneId zoneId, DateUtils$DateTimeFormatPattern dateUtils$DateTimeFormatPattern) {
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
                if (AbstractC3687.f9263 == 8) {
                    char[] cArrM6330 = AbstractC3687.m6330(str);
                    if (cArrM6330.length != 10) {
                        throw new DateTimeParseException("illegal input ".concat(str), str, 0);
                    }
                    cCharAt = cArrM6330[0];
                    cCharAt2 = cArrM6330[1];
                    char c5 = cArrM6330[2];
                    cCharAt3 = cArrM6330[3];
                    char c6 = cArrM6330[4];
                    cCharAt4 = cArrM6330[5];
                    char c7 = cArrM6330[6];
                    c4 = cArrM6330[7];
                    cCharAt5 = cArrM6330[8];
                    cCharAt6 = cArrM6330[9];
                    c3 = c5;
                    c2 = c6;
                    c = c7;
                } else {
                    ToIntFunction toIntFunction = AbstractC3687.f9271;
                    if (toIntFunction != null && (function = AbstractC3687.f9272) != null && toIntFunction.applyAsInt(str) == 0) {
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
                int iM703 = (cCharAt3 - '0') + AbstractC0900.m703(c3, 48, 10, AbstractC0900.m703(cCharAt2, 48, 100, (cCharAt - '0') * DescriptorProtos$Edition.EDITION_2023_VALUE));
                if (cCharAt4 < '0' || cCharAt4 > '9' || c < '0' || c > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i = (c - '0') + ((cCharAt4 - '0') * 10);
                if ((i == 0 && iM703 != 0) || i > 12) {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                if (cCharAt5 < '0' || cCharAt5 > '9' || cCharAt6 < '0' || cCharAt6 > '9') {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                int i2 = (cCharAt6 - '0') + ((cCharAt5 - '0') * 10);
                int i3 = i != 2 ? (i == 4 || i == 6 || i == 9 || i == 11) ? 30 : 31 : ((iM703 & 3) != 0 || (iM703 % 100 == 0 && iM703 % 400 != 0)) ? 28 : 29;
                if ((i2 == 0 && iM703 != 0) || i2 > i3) {
                    throw new DateTimeParseException("illegal input", str, 0);
                }
                if (iM703 == 0 && i == 0 && i2 == 0) {
                    iM703 = 1970;
                    i2 = 1;
                    i = 1;
                }
                long jM6421 = m6421(iM703, i, i2) * 86400;
                if (zoneId != f9371 && zoneId.getRules() != f9370) {
                    z = false;
                }
                if (z && jM6421 >= 684900000) {
                    totalSeconds = 28800;
                } else if (zoneId != ZoneOffset.UTC && !"UTC".equals(zoneId.getId())) {
                    totalSeconds = zoneId.getRules().getOffset(LocalDateTime.of(LocalDate.of(iM703, i, i2), LocalTime.MIN)).getTotalSeconds();
                }
                return (jM6421 - ((long) totalSeconds)) * 1000;
            }
            C6385.m11441();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public static String m6446(long j, ZoneId zoneId) {
        long j2;
        int i;
        long jFloorDiv = Math.floorDiv(j, 1000L);
        long jM6417 = jFloorDiv + ((long) ((zoneId == f9371 || zoneId.getRules() == f9370) ? m6417(jFloorDiv) : zoneId.getRules().getOffset(Instant.ofEpochMilli(j)).getTotalSeconds()));
        long jFloorDiv2 = Math.floorDiv(jM6417, 86400L);
        int iFloorMod = (int) Math.floorMod(jM6417, 86400L);
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
            throw new DateTimeException(AbstractC3275.m5143(j7, "Invalid year "));
        }
        int i6 = (int) j7;
        long j8 = iFloorMod;
        if (j8 < 0 || j8 > 86399) {
            throw new DateTimeException(AbstractC3275.m5143(j8, "Invalid secondOfDay "));
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
        if (AbstractC3687.f9268 != null) {
            char[] cArr = new char[i10];
            AbstractC3682.m6270(cArr, 0, i6, i4, i5);
            cArr[10] = ' ';
            AbstractC3682.m6279(cArr, 11, i7, i8, i9);
            if (i > 0) {
                cArr[19] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                for (int i11 = 20; i11 < i10; i11++) {
                    cArr[i11] = '0';
                }
                if (iFloorMod2 < 10) {
                    AbstractC3682.m6292(iFloorMod2, i10, cArr);
                } else if (iFloorMod2 % 100 == 0) {
                    AbstractC3682.m6292(iFloorMod2 / 100, i10, cArr);
                } else if (iFloorMod2 % 10 == 0) {
                    AbstractC3682.m6292(iFloorMod2 / 10, i10, cArr);
                } else {
                    AbstractC3682.m6292(iFloorMod2, i10, cArr);
                }
            }
            return (String) AbstractC3687.f9268.apply(cArr, Boolean.TRUE);
        }
        byte[] bArr = new byte[i10];
        AbstractC3682.m6271(bArr, 0, i6, i4, i5);
        bArr[10] = 32;
        AbstractC3682.m6278(bArr, 11, i7, i8, i9);
        if (i > 0) {
            bArr[19] = 46;
            for (int i12 = 20; i12 < i10; i12++) {
                bArr[i12] = 48;
            }
            if (iFloorMod2 < 10) {
                AbstractC3682.m6296(iFloorMod2, bArr, i10);
            } else if (iFloorMod2 % 100 == 0) {
                AbstractC3682.m6296(iFloorMod2 / 100, bArr, i10);
            } else if (iFloorMod2 % 10 == 0) {
                AbstractC3682.m6296(iFloorMod2 / 10, bArr, i10);
            } else {
                AbstractC3682.m6296(iFloorMod2, bArr, i10);
            }
        }
        BiFunction biFunction = AbstractC3687.f9267;
        return biFunction != null ? (String) biFunction.apply(bArr, (byte) 0) : new String(bArr, 0, i10, StandardCharsets.ISO_8859_1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public static int m6447(int i, byte[] bArr, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = bArr[i2 + i4] - 48;
            if ((i5 < 0) || (i5 > 9)) {
                return -1;
            }
            i3 = (i3 * 10) + i5;
        }
        return i3 * f9375[(9 - i) & 15];
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public static int m6448(byte[] bArr, int i) {
        short sReverseBytes = AbstractC3687.f9266.getShort(bArr, AbstractC3687.f9265 + ((long) i));
        if (AbstractC3687.f9276) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        int i2 = sReverseBytes & 3855;
        if (((61680 & (i2 + 1542)) | ((sReverseBytes & 61680) - 12336)) != 0) {
            return -1;
        }
        return ((i2 >> 8) * 100) + ((sReverseBytes & 15) * DescriptorProtos$Edition.EDITION_2023_VALUE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public static long m6449(byte[] bArr, int i) {
        long jReverseBytes = AbstractC3687.f9266.getLong(bArr, AbstractC3687.f9265 + ((long) i));
        if (AbstractC3687.f9276) {
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
    public static ZonedDateTime m6450(String str) {
        if (str.endsWith(" CST")) {
            DateTimeFormatter dateTimeFormatterOfPattern = f9373;
            if (dateTimeFormatterOfPattern == null) {
                dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("EEEE, dd-MMM-yyyy HH:mm:ss", Locale.ENGLISH);
                f9373 = dateTimeFormatterOfPattern;
            }
            return ZonedDateTime.of(LocalDateTime.parse(str.substring(0, str.length() - 4), dateTimeFormatterOfPattern), f9371);
        }
        DateTimeFormatter dateTimeFormatterOfPattern2 = f9374;
        if (dateTimeFormatterOfPattern2 == null) {
            dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("EEEE, dd-MMM-yyyy HH:mm:ss zzz", Locale.ENGLISH);
            f9374 = dateTimeFormatterOfPattern2;
        }
        return ZonedDateTime.parse(str, dateTimeFormatterOfPattern2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public static int m6451(int i, int i2, char[] cArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = cArr[i2 + i4] - '0';
            if ((i5 < 0) || (i5 > 9)) {
                return -1;
            }
            i3 = (i3 * 10) + i5;
        }
        return i3 * f9375[(9 - i) & 15];
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public static LocalTime m6452(byte[] bArr, int i) {
        int iM6282;
        int iM62822;
        int iM6280;
        int i2 = i + 5;
        if (i2 > bArr.length) {
            return null;
        }
        byte b = bArr[i + 1];
        int i3 = i + 4;
        byte b2 = bArr[i3];
        int i4 = i + 2;
        if (bArr[i4] == 58 && b2 == 58) {
            iM6282 = AbstractC3682.m6280(bArr, i);
            iM62822 = AbstractC3682.m6282(bArr, i + 3);
            iM6280 = AbstractC3682.m6282(bArr, i2);
        } else if (b == 58 && b2 == 58) {
            iM6282 = AbstractC3682.m6282(bArr, i);
            iM62822 = AbstractC3682.m6280(bArr, i4);
            iM6280 = AbstractC3682.m6282(bArr, i2);
        } else {
            if (b != 58 || bArr[i + 3] != 58) {
                return null;
            }
            iM6282 = AbstractC3682.m6282(bArr, i);
            iM62822 = AbstractC3682.m6282(bArr, i4);
            iM6280 = AbstractC3682.m6280(bArr, i3);
        }
        return m6439(iM6282, iM62822, iM6280);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static LocalTime m6453(byte[] bArr, int i) {
        int iM6282;
        int iM6280;
        int iM62802;
        if (i + 5 > bArr.length) {
            return null;
        }
        int i2 = i + 2;
        if (bArr[i2] == 58) {
            iM62802 = AbstractC3682.m6280(bArr, i);
            iM6280 = AbstractC3682.m6280(bArr, i + 3);
            iM6282 = 0;
        } else {
            if (bArr[i + 1] != 58 || bArr[i + 3] != 58) {
                return null;
            }
            int iM62822 = AbstractC3682.m6282(bArr, i);
            int iM62823 = AbstractC3682.m6282(bArr, i2);
            iM6282 = AbstractC3682.m6282(bArr, i + 4);
            iM6280 = iM62823;
            iM62802 = iM62822;
        }
        return m6439(iM62802, iM6280, iM6282);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public static LocalTime m6454(byte[] bArr, int i) {
        if (i + 8 > bArr.length) {
            return null;
        }
        long jM6435 = m6435(bArr, i);
        if (jM6435 == -1) {
            return null;
        }
        return LocalTime.of(((int) jM6435) & Opcodes.CONST_METHOD_TYPE, ((int) (jM6435 >> 24)) & Opcodes.CONST_METHOD_TYPE, ((int) (jM6435 >> 48)) & Opcodes.CONST_METHOD_TYPE);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public static long m6455(String str, ZoneId zoneId) {
        int i;
        int iM6281;
        char c;
        Function function;
        int i2;
        int iM6280;
        char c2;
        AbstractC3732 c3736;
        ZoneId zoneId2 = zoneId;
        if (str == null) {
            return 0L;
        }
        ToIntFunction toIntFunction = AbstractC3687.f9271;
        long j = 1;
        if (toIntFunction == null || (function = AbstractC3687.f9272) == null || toIntFunction.applyAsInt(str) != 0) {
            char[] cArrM6330 = AbstractC3687.m6330(str);
            int length = cArrM6330.length;
            if (length == 0) {
                return 0L;
            }
            if (length == 4 && AbstractC3682.m6289(0, cArrM6330) == AbstractC3682.f9223) {
                return 0L;
            }
            char c3 = cArrM6330[0];
            if (c3 != '\"' || cArrM6330[length - 1] != '\"') {
                if (length == 19) {
                    return m6442(cArrM6330, 0, zoneId2);
                }
                if (length > 19 || (length == 16 && ((c = cArrM6330[10]) == '+' || c == '-'))) {
                    ZonedDateTime zonedDateTimeM6440 = m6440(cArrM6330, 0, length, zoneId2);
                    if (zonedDateTimeM6440 != null) {
                        return zonedDateTimeM6440.toInstant().toEpochMilli();
                    }
                    String str2 = new String(cArrM6330, 0, length);
                    throw new DateTimeParseException("illegal input ".concat(str2), str2, 0);
                }
                if (c3 == '-' || (c3 >= '0' && c3 <= '9')) {
                    short s = AbstractC3682.f9228;
                    if (length > 0) {
                        for (int i3 = 0; i3 < length; i3++) {
                            char c4 = cArrM6330[i3];
                            if (c4 == '+' || c4 == '-') {
                                if (i3 == 0 && length != 1) {
                                }
                            } else if (c4 >= '0' && c4 <= '9') {
                            }
                        }
                        Class cls = AbstractC3700.f9396;
                        char c5 = cArrM6330[0];
                        if (AbstractC3682.m6250(c5)) {
                            j = '0' - c5;
                        } else if (length != 1 && (c5 == '-' || c5 == '+')) {
                            j = 0;
                        }
                        int i4 = 1;
                        while (true) {
                            i = i4 + 1;
                            if (i >= length || (iM6281 = AbstractC3682.m6281(i4, cArrM6330)) == -1) {
                                break;
                            }
                            if (!(-92233720368547758L <= j) || !(j <= 0)) {
                                break;
                            }
                            j = (j * 100) - ((long) iM6281);
                            i4 += 2;
                        }
                        if (i4 < length) {
                            char c6 = cArrM6330[i4];
                            if (AbstractC3682.m6250(c6)) {
                                if ((-922337203685477580L <= j) & (j <= 0)) {
                                    j = ((j * 10) + 48) - ((long) c6);
                                    i4 = i;
                                }
                            }
                        }
                        long j2 = j;
                        if (!((i4 == length) & (j2 <= 0)) || !(Long.MIN_VALUE < j2 || c5 == '-')) {
                            throw new NumberFormatException("parseInt error ".concat(new String(cArrM6330, i4, length)));
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
                if (cArrM6330[length - 1] == 'Z') {
                    length--;
                    zoneId2 = ZoneOffset.UTC;
                }
                LocalDateTime localDateTimeM6408 = m6408(length, cArrM6330);
                if (localDateTimeM6408 == null && AbstractC3682.m6291(0, cArrM6330) == 13511005043687472L && AbstractC3682.m6291(4, cArrM6330) == 12666580113555501L && AbstractC3682.m6294(8, cArrM6330) == 3145776) {
                    localDateTimeM6408 = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
                }
                if (localDateTimeM6408 == null) {
                    String str3 = new String(cArrM6330, 0, length);
                    throw new DateTimeParseException("illegal input ".concat(str3), str3, 0);
                }
                long epochSecond = ZonedDateTime.ofLocal(localDateTimeM6408, zoneId2, null).toEpochSecond();
                int nano = localDateTimeM6408.getNano();
                return (epochSecond >= 0 || nano <= 0) ? (epochSecond * 1000) + ((long) (nano / 1000000)) : (((epochSecond + 1) * 1000) + ((long) (nano / 1000000))) - 1000;
            }
            boolean[] zArr = AbstractC3732.f9524;
            C3734 c3734 = new C3734(AbstractC3766.m6949(), null, cArrM6330, length);
            try {
                long time = C3574.f8723.m6098(c3734).getTime();
                c3734.close();
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
            if (length2 == 4 && AbstractC3682.m6252(bArr, 0)) {
                return 0L;
            }
            char c7 = (char) bArr[0];
            if (c7 != '\"' || bArr[length2 - 1] != 34) {
                if (length2 == 19) {
                    return m6443(bArr, 0, zoneId2);
                }
                if (length2 > 19 || (length2 == 16 && ((c2 = (char) bArr[10]) == '+' || c2 == '-'))) {
                    ZonedDateTime zonedDateTimeM6441 = m6441(bArr, 0, length2, zoneId2);
                    if (zonedDateTimeM6441 != null) {
                        return zonedDateTimeM6441.toInstant().toEpochMilli();
                    }
                    String str4 = new String(bArr, 0, length2);
                    throw new DateTimeParseException("illegal input ".concat(str4), str4, 0);
                }
                if (c7 == '-' || (c7 >= '0' && c7 <= '9')) {
                    short s2 = AbstractC3682.f9228;
                    if (length2 > 0) {
                        for (int i9 = 0; i9 < length2; i9++) {
                            char c8 = (char) bArr[i9];
                            if (c8 == '+' || c8 == '-') {
                                if (i9 == 0 && length2 != 1) {
                                }
                            } else if (c8 >= '0' && c8 <= '9') {
                            }
                        }
                        Class cls2 = AbstractC3700.f9396;
                        byte b = bArr[0];
                        if (AbstractC3682.m6250(b)) {
                            j = 48 - b;
                        } else if (length2 != 1 && (b == 45 || b == 43)) {
                            j = 0;
                        }
                        int i10 = 1;
                        while (true) {
                            i2 = i10 + 1;
                            if (i2 >= length2 || (iM6280 = AbstractC3682.m6280(bArr, i10)) == -1) {
                                break;
                            }
                            if (!(-92233720368547758L <= j) || !(j <= 0)) {
                                break;
                            }
                            j = (j * 100) - ((long) iM6280);
                            i10 += 2;
                        }
                        if (i10 < length2) {
                            byte b2 = bArr[i10];
                            if (AbstractC3682.m6250(b2)) {
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
                LocalDateTime localDateTimeM6407 = m6407(bArr, length2);
                if (localDateTimeM6407 == null && AbstractC3682.m6288(bArr, 0) == 3256155501228994608L && AbstractC3682.m6257(bArr, 8) == 12336) {
                    localDateTimeM6407 = LocalDateTime.of(1970, 1, 1, 0, 0, 0);
                }
                long epochSecond2 = ZonedDateTime.ofLocal(localDateTimeM6407, zoneId2, null).toEpochSecond();
                int nano2 = localDateTimeM6407.getNano();
                return (epochSecond2 >= 0 || nano2 <= 0) ? (epochSecond2 * 1000) + ((long) (nano2 / 1000000)) : (((epochSecond2 + 1) * 1000) + ((long) (nano2 / 1000000))) - 1000;
            }
            boolean[] zArr2 = AbstractC3732.f9524;
            C3776 c3776M6949 = AbstractC3766.m6949();
            if (charset == StandardCharsets.UTF_8) {
                c3736 = C3735.m6819(length2, c3776M6949, bArr);
            } else if (charset == StandardCharsets.UTF_16) {
                c3736 = new C3734(length2, c3776M6949, bArr);
            } else {
                Charset charset2 = StandardCharsets.US_ASCII;
                c3736 = new C3736(c3776M6949, null, bArr, length2);
            }
            try {
                long time2 = C3574.f8723.m6098(c3736).getTime();
                c3736.close();
                return time2;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public static LocalTime m6456(byte[] bArr, int i) {
        int iM6280;
        int iM6282;
        int iM62822;
        int i2 = i + 5;
        if (i2 > bArr.length) {
            return null;
        }
        int i3 = i + 2;
        byte b = bArr[i3];
        byte b2 = bArr[i + 4];
        if (bArr[i + 1] == 58 && b2 == 58) {
            iM62822 = AbstractC3682.m6282(bArr, i);
            iM6280 = AbstractC3682.m6280(bArr, i3);
            iM6282 = AbstractC3682.m6280(bArr, i2);
        } else if (b == 58 && b2 == 58) {
            int iM62802 = AbstractC3682.m6280(bArr, i);
            int iM62823 = AbstractC3682.m6282(bArr, i + 3);
            iM6282 = AbstractC3682.m6280(bArr, i2);
            iM6280 = iM62823;
            iM62822 = iM62802;
        } else {
            if (b != 58 || bArr[i2] != 58) {
                return null;
            }
            int iM62803 = AbstractC3682.m6280(bArr, i);
            iM6280 = AbstractC3682.m6280(bArr, i + 3);
            iM6282 = AbstractC3682.m6282(bArr, i + 6);
            iM62822 = iM62803;
        }
        return m6439(iM62822, iM6280, iM6282);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public static LocalTime m6457(int i, char[] cArr) {
        if (i + 8 <= cArr.length && cArr[i + 2] == ':' && cArr[i + 5] == ':') {
            return m6439(AbstractC3682.m6281(i, cArr), AbstractC3682.m6281(i + 3, cArr), AbstractC3682.m6281(i + 6, cArr));
        }
        return null;
    }
}
