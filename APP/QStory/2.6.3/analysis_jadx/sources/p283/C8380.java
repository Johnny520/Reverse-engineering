package p283;

import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import p297.C8587;
import p297.C8589;
import p297.C8593;
import p297.C8594;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8380 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public short f23176;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int[] f23177;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int[] f23178;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f23179;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f23180;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23181;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f23182;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public short f23183;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] f23184;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object f23185;

    public /* synthetic */ C8380(Object obj, int i) {
        this.f23181 = i;
        this.f23185 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m13911(p297.C8594 r20, java.lang.String r21, int r22) {
        /*
            Method dump skipped, instruction units count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p283.C8380.m13911(飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏世哲兰, java.lang.String, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m13912(C8384 c8384, String str, int i) {
        int iM13951;
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return 16777218;
        }
        if (cCharAt == 'L') {
            return c8384.m13951(str.substring(i + 1, str.length() - 1)) | 33554432;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 16777220;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i2 = i + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 == 'F') {
                            iM13951 = 16777218;
                        } else if (cCharAt2 == 'L') {
                            iM13951 = c8384.m13951(str.substring(i2 + 1, str.length() - 1)) | 33554432;
                        } else if (cCharAt2 == 'S') {
                            iM13951 = 16777228;
                        } else if (cCharAt2 == 'Z') {
                            iM13951 = 16777225;
                        } else if (cCharAt2 == 'I') {
                            iM13951 = 16777217;
                        } else if (cCharAt2 != 'J') {
                            switch (cCharAt2) {
                                case 'B':
                                    iM13951 = 16777226;
                                    break;
                                case 'C':
                                    iM13951 = 16777227;
                                    break;
                                case 'D':
                                    iM13951 = 16777219;
                                    break;
                                default:
                                    C5925.m11306();
                                    return 0;
                            }
                        } else {
                            iM13951 = 16777220;
                        }
                        return ((i2 - i) << 28) | iM13951;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 16777219;
                        default:
                            C5925.m11306();
                            return 0;
                    }
                }
            }
        }
        return 16777217;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m13913(p283.C8384 r19, int r20, int[] r21, int r22) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p283.C8380.m13913(飘花落叶言楪子世苏哲兰.飘花落叶言子楪苏世哲兰, int, int[], int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m13914(p297.C8594 r23, int r24, int[] r25, int r26) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p283.C8380.m13914(飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏世哲兰, int, int[], int):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m13915(int i, int i2, C8377 c8377, C8594 c8594) {
        int iM14225;
        switch (i) {
            case 0:
            case 116:
            case 117:
            case 118:
            case 119:
            case 145:
            case 146:
            case 147:
            case 167:
            case 177:
                break;
            case 1:
                m13925(4194309);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
            case 21:
                m13925(4194305);
                break;
            case 9:
            case 10:
            case 22:
                m13925(4194308);
                m13925(4194304);
                break;
            case 11:
            case 12:
            case 13:
            case 23:
                m13925(4194306);
                break;
            case 14:
            case 15:
            case 24:
                m13925(4194307);
                m13925(4194304);
                break;
            case 18:
                int i3 = c8377.f23132;
                switch (i3) {
                    case 3:
                        m13925(4194305);
                        break;
                    case 4:
                        m13925(4194306);
                        break;
                    case 5:
                        m13925(4194308);
                        m13925(4194304);
                        break;
                    case 6:
                        m13925(4194307);
                        m13925(4194304);
                        break;
                    case 7:
                        m13925(c8594.m14226(TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME) | 8388608);
                        break;
                    case 8:
                        m13925(c8594.m14226("java/lang/String") | 8388608);
                        break;
                    default:
                        switch (i3) {
                            case 15:
                                m13925(c8594.m14226("java/lang/invoke/MethodHandle") | 8388608);
                                break;
                            case 16:
                                m13925(c8594.m14226("java/lang/invoke/MethodType") | 8388608);
                                break;
                            case 17:
                                m13923(c8594, c8377.f23129);
                                break;
                            default:
                                C5554.m10870();
                                break;
                        }
                        break;
                }
                break;
            case 19:
            case 20:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 90:
            case 91:
            case 93:
            case 94:
            case 98:
            case 99:
            case 102:
            case 103:
            case 106:
            case 107:
            case 110:
            case 111:
            case 114:
            case 115:
            case 137:
            case 138:
            case 141:
            case 144:
            case 168:
            case 169:
            case 186:
            case 188:
            case 196:
            case 197:
            default:
                C5925.m11306();
                break;
            case 25:
                m13925(m13929(i2));
                break;
            case 46:
            case 51:
            case 52:
            case 53:
            case 96:
            case 100:
            case 104:
            case 108:
            case 112:
            case 120:
            case 122:
            case 124:
            case 126:
            case 128:
            case 130:
            case 136:
            case 142:
            case 149:
            case 150:
                m13920(2);
                m13925(4194305);
                break;
            case 47:
            case 143:
                m13920(2);
                m13925(4194308);
                m13925(4194304);
                break;
            case 50:
                m13920(1);
                int iM13921 = m13921();
                if (iM13921 != 4194309) {
                    iM13921 -= 67108864;
                }
                m13925(iM13921);
                break;
            case 54:
            case 56:
            case 58:
                m13919(i2, m13921());
                if (i2 > 0) {
                    int i4 = i2 - 1;
                    int iM13929 = m13929(i4);
                    if (iM13929 == 4194308 || iM13929 == 4194307) {
                        m13919(i4, 4194304);
                    } else {
                        int i5 = iM13929 & 62914560;
                        if (i5 == 16777216 || i5 == 20971520) {
                            m13919(i4, iM13929 | 1048576);
                        }
                    }
                }
                break;
            case 55:
            case 57:
                m13920(1);
                m13919(i2, m13921());
                m13919(i2 + 1, 4194304);
                if (i2 > 0) {
                    int i6 = i2 - 1;
                    int iM139292 = m13929(i6);
                    if (iM139292 == 4194308 || iM139292 == 4194307) {
                        m13919(i6, 4194304);
                    } else {
                        int i7 = iM139292 & 62914560;
                        if (i7 == 16777216 || i7 == 20971520) {
                            m13919(i6, iM139292 | 1048576);
                        }
                    }
                }
                break;
            case 79:
            case 83:
            case 84:
            case 85:
                m13920(3);
                break;
            case 87:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 174:
            case 176:
            case 191:
            case 194:
            case 195:
            case 198:
            case 199:
                m13920(1);
                break;
            case 88:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 173:
            case 175:
                m13920(2);
                break;
            case 89:
                int iM139212 = m13921();
                m13925(iM139212);
                m13925(iM139212);
                break;
            case 92:
                int iM139213 = m13921();
                int iM139214 = m13921();
                m13925(iM139214);
                m13925(iM139213);
                m13925(iM139214);
                m13925(iM139213);
                break;
            case 95:
                int iM139215 = m13921();
                int iM139216 = m13921();
                m13925(iM139215);
                m13925(iM139216);
                break;
            case 97:
            case 101:
            case 105:
            case 109:
            case 113:
            case 127:
            case 129:
            case 131:
                m13920(4);
                m13925(4194308);
                m13925(4194304);
                break;
            case 121:
            case 123:
            case 125:
                m13920(3);
                m13925(4194308);
                m13925(4194304);
                break;
            case 132:
                m13919(i2, 4194305);
                break;
            case 133:
            case 140:
                m13920(1);
                m13925(4194308);
                m13925(4194304);
                break;
            case 134:
                m13920(1);
                m13925(4194306);
                break;
            case 135:
                m13920(1);
                m13925(4194307);
                m13925(4194304);
                break;
            case 139:
            case 190:
            case 193:
                m13920(1);
                m13925(4194305);
                break;
            case 148:
            case 151:
            case 152:
                m13920(4);
                m13925(4194305);
                break;
            case 178:
                m13923(c8594, c8377.f23129);
                break;
            case 179:
                m13924(c8377.f23129);
                break;
            case 180:
                m13920(1);
                m13923(c8594, c8377.f23129);
                break;
            case 181:
                m13924(c8377.f23129);
                m13921();
                break;
            case 182:
            case 183:
            case 184:
            case 185:
                m13924(c8377.f23129);
                if (i != 184) {
                    int iM139217 = m13921();
                    if (i == 183 && c8377.f23130.charAt(0) == '<') {
                        if (this.f23184 == null) {
                            this.f23184 = new int[2];
                        }
                        int length = this.f23184.length;
                        int i8 = this.f23182;
                        if (i8 >= length) {
                            int[] iArr = new int[Math.max(i8 + 1, length * 2)];
                            System.arraycopy(this.f23184, 0, iArr, 0, length);
                            this.f23184 = iArr;
                        }
                        int[] iArr2 = this.f23184;
                        int i9 = this.f23182;
                        this.f23182 = i9 + 1;
                        iArr2[i9] = iM139217;
                    }
                }
                m13923(c8594, c8377.f23129);
                break;
            case 187:
                String str = c8377.f23129;
                c8594.getClass();
                int iHashCode = (str.hashCode() + 129 + i2) & Integer.MAX_VALUE;
                C8377[] c8377Arr = c8594.f24055;
                C8377 c83772 = c8377Arr[iHashCode % c8377Arr.length];
                while (true) {
                    if (c83772 == null) {
                        iM14225 = c8594.m14225(new C8377(c8594.f24060, 129, null, null, str, i2, iHashCode, 1));
                    } else if (c83772.f23132 == 129 && c83772.f23134 == iHashCode && c83772.f23128 == i2 && c83772.f23129.equals(str)) {
                        iM14225 = c83772.f23133;
                    } else {
                        c83772 = (C8377) c83772.f23136;
                    }
                }
                m13925(iM14225 | 12582912);
                break;
            case 189:
                String str2 = c8377.f23129;
                m13921();
                if (str2.charAt(0) != '[') {
                    m13925(c8594.m14226(str2) | 75497472);
                } else {
                    m13923(c8594, "[".concat(str2));
                }
                break;
            case 192:
                String str3 = c8377.f23129;
                m13921();
                if (str3.charAt(0) != '[') {
                    m13925(c8594.m14226(str3) | 8388608);
                } else {
                    m13923(c8594, str3);
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0371  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m13916(int r19, int r20, p283.C8377 r21, p283.C8384 r22) {
        /*
            Method dump skipped, instruction units count: 1270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p283.C8380.m13916(int, int, 飘花落叶言楪子世苏哲兰.飘花落叶言子楪世兰哲苏, 飘花落叶言楪子世苏哲兰.飘花落叶言子楪苏世哲兰):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m13917(C8587 c8587) {
        int[] iArr = this.f23180;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != 4194308 && i6 != 4194307) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 4194304) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.f23179;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        c8587.m14159(((C8589) this.f23185).f23958, i3, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 4194308 || i13 == 4194307) ? 2 : 1;
            c8587.f23938[i10] = i13;
            i3 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 <= 0) {
                c8587.m14163();
                return;
            }
            int i15 = iArr2[i];
            i += (i15 == 4194308 || i15 == 4194307) ? 2 : 1;
            c8587.f23938[i10] = i15;
            i8 = i14;
            i10++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m13918(C8378 c8378) {
        int[] iArr = this.f23180;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != 16777220 && i6 != 16777219) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 16777216) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.f23179;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 16777220 || i9 == 16777219) ? 2 : 1;
            i8++;
        }
        c8378.m13891(((C8379) this.f23185).f23169, i3, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 16777220 || i13 == 16777219) ? 2 : 1;
            c8378.f23148[i10] = i13;
            i3 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 <= 0) {
                c8378.m13892();
                return;
            }
            int i15 = iArr2[i];
            i += (i15 == 16777220 || i15 == 16777219) ? 2 : 1;
            c8378.f23148[i10] = i15;
            i8 = i14;
            i10++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13919(int i, int i2) {
        switch (this.f23181) {
            case 0:
                if (this.f23178 == null) {
                    this.f23178 = new int[10];
                }
                int length = this.f23178.length;
                if (i >= length) {
                    int[] iArr = new int[Math.max(i + 1, length * 2)];
                    System.arraycopy(this.f23178, 0, iArr, 0, length);
                    this.f23178 = iArr;
                }
                this.f23178[i] = i2;
                break;
            default:
                if (this.f23178 == null) {
                    this.f23178 = new int[10];
                }
                int length2 = this.f23178.length;
                if (i >= length2) {
                    int[] iArr2 = new int[Math.max(i + 1, length2 * 2)];
                    System.arraycopy(this.f23178, 0, iArr2, 0, length2);
                    this.f23178 = iArr2;
                }
                this.f23178[i] = i2;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m13920(int i) {
        switch (this.f23181) {
            case 0:
                short s = this.f23183;
                if (s < i) {
                    this.f23176 = (short) (this.f23176 - (i - s));
                    this.f23183 = (short) 0;
                } else {
                    this.f23183 = (short) (s - i);
                }
                break;
            default:
                short s2 = this.f23183;
                if (s2 < i) {
                    this.f23176 = (short) (this.f23176 - (i - s2));
                    this.f23183 = (short) 0;
                } else {
                    this.f23183 = (short) (s2 - i);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m13921() {
        switch (this.f23181) {
            case 0:
                short s = this.f23183;
                if (s <= 0) {
                    short s2 = (short) (this.f23176 - 1);
                    this.f23176 = s2;
                    return (-s2) | 83886080;
                }
                int[] iArr = this.f23177;
                short s3 = (short) (s - 1);
                this.f23183 = s3;
                return iArr[s3];
            default:
                short s4 = this.f23183;
                if (s4 <= 0) {
                    short s5 = (short) (this.f23176 - 1);
                    this.f23176 = s5;
                    return (-s5) | 20971520;
                }
                int[] iArr2 = this.f23177;
                short s6 = (short) (s4 - 1);
                this.f23183 = s6;
                return iArr2[s6];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m13922(C8384 c8384, String str) {
        int iM13912 = m13912(c8384, str, str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0);
        if (iM13912 != 0) {
            m13925(iM13912);
            if (iM13912 == 16777220 || iM13912 == 16777219) {
                m13925(16777216);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m13923(C8594 c8594, String str) {
        int i;
        str.getClass();
        i = 20;
        switch (str) {
            case "(Ljava/lang/Enum;)V":
                i = 18;
                break;
            case "(Ljava/lang/String;)V":
            case "(Ljava/lang/Object;)V":
            case "(Ljava/lang/Object;)Z":
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
                i = 97;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
                i = 60;
                break;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                i = 72;
                break;
            case "()Ljava/lang/Class;":
            case "()I":
            case "()J":
            case "()V":
            case "()Z":
                i = 2;
                break;
            case "(I)V":
            case "(J)V":
            case "(J)Z":
            case "(I)Ljava/lang/Object;":
            case "(I)Ljava/lang/Integer;":
                i = 3;
                break;
            case "(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;":
                i = 62;
                break;
            case "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z":
                i = 44;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;)Z":
                i = 36;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/List;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
                i = 53;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Enum;)V":
                i = 52;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;I)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;J)V":
                i = 37;
                break;
            default:
                if (str.charAt(0) != '(') {
                    i = 0;
                    break;
                } else {
                    int iMax = 1;
                    while (str.charAt(iMax) != ')') {
                        while (str.charAt(iMax) == '[') {
                            iMax++;
                        }
                        int i2 = iMax + 1;
                        iMax = str.charAt(iMax) == 'L' ? Math.max(i2, str.indexOf(59, i2) + 1) : i2;
                    }
                    i = iMax + 1;
                    break;
                }
                break;
        }
        int iM13911 = m13911(c8594, str, i);
        if (iM13911 != 0) {
            m13925(iM13911);
            if (iM13911 == 4194308 || iM13911 == 4194307) {
                m13925(4194304);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13924(String str) {
        switch (this.f23181) {
            case 0:
                char cCharAt = str.charAt(0);
                if (cCharAt == '(') {
                    m13920((C8383.m13942(str) >> 2) - 1);
                } else if (cCharAt == 'J' || cCharAt == 'D') {
                    m13920(2);
                } else {
                    m13920(1);
                }
                break;
            default:
                char cCharAt2 = str.charAt(0);
                if (cCharAt2 == '(') {
                    m13920((C8593.m14220(str) >> 2) - 1);
                } else if (cCharAt2 == 'J' || cCharAt2 == 'D') {
                    m13920(2);
                } else {
                    m13920(1);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13925(int i) {
        switch (this.f23181) {
            case 0:
                if (this.f23177 == null) {
                    this.f23177 = new int[10];
                }
                int length = this.f23177.length;
                short s = this.f23183;
                if (s >= length) {
                    int[] iArr = new int[Math.max(s + 1, length * 2)];
                    System.arraycopy(this.f23177, 0, iArr, 0, length);
                    this.f23177 = iArr;
                }
                int[] iArr2 = this.f23177;
                short s2 = this.f23183;
                short s3 = (short) (s2 + 1);
                this.f23183 = s3;
                iArr2[s2] = i;
                short s4 = (short) (this.f23176 + s3);
                C8379 c8379 = (C8379) this.f23185;
                if (s4 > c8379.f23165) {
                    c8379.f23165 = s4;
                }
                break;
            default:
                if (this.f23177 == null) {
                    this.f23177 = new int[10];
                }
                int length2 = this.f23177.length;
                short s5 = this.f23183;
                if (s5 >= length2) {
                    int[] iArr3 = new int[Math.max(s5 + 1, length2 * 2)];
                    System.arraycopy(this.f23177, 0, iArr3, 0, length2);
                    this.f23177 = iArr3;
                }
                int[] iArr4 = this.f23177;
                short s6 = this.f23183;
                short s7 = (short) (s6 + 1);
                this.f23183 = s7;
                iArr4[s6] = i;
                short s8 = (short) (this.f23176 + s7);
                C8589 c8589 = (C8589) this.f23185;
                if (s8 > c8589.f23956) {
                    c8589.f23956 = s8;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[LOOP:0: B:7:0x000d->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m13926(p283.C8384 r9, int r10) {
        /*
            r8 = this;
            r0 = 16777222(0x1000006, float:2.3509904E-38)
            if (r10 == r0) goto Lc
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r10
            r2 = 50331648(0x3000000, float:3.761582E-37)
            if (r1 != r2) goto L52
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.f23182
            if (r1 >= r2) goto L52
            int[] r2 = r8.f23184
            r2 = r2[r1]
            r3 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r3 = r3 & r2
            r4 = 251658240(0xf000000, float:6.3108872E-30)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            if (r4 != r7) goto L2a
            int[] r2 = r8.f23180
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 83886080(0x5000000, float:6.018531E-36)
            if (r4 != r7) goto L35
            int[] r2 = r8.f23179
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L4f
            r8 = 33554432(0x2000000, float:9.403955E-38)
            if (r10 != r0) goto L43
            java.lang.String r10 = r9.f23219
            int r9 = r9.m13951(r10)
        L41:
            r8 = r8 | r9
            return r8
        L43:
            r10 = r10 & r5
            飘花落叶言楪子世苏哲兰.飘花落叶言子楪世兰哲苏[] r0 = r9.f23221
            r10 = r0[r10]
            java.lang.String r10 = r10.f23129
            int r9 = r9.m13951(r10)
            goto L41
        L4f:
            int r1 = r1 + 1
            goto Ld
        L52:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p283.C8380.m13926(飘花落叶言楪子世苏哲兰.飘花落叶言子楪苏世哲兰, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int m13927(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 16777216) {
            int i5 = i3 + this.f23180[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 20971520) {
            return i;
        }
        int i6 = i3 + this.f23179[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[LOOP:0: B:7:0x000d->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m13928(p297.C8594 r9, int r10) {
        /*
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto Lc
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 != r2) goto L52
        Lc:
            r1 = 0
        Ld:
            int r2 = r8.f23182
            if (r1 >= r2) goto L52
            int[] r2 = r8.f23184
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 16777216(0x1000000, float:2.3509887E-38)
            if (r4 != r7) goto L2a
            int[] r2 = r8.f23180
            r2 = r2[r6]
        L28:
            int r2 = r2 + r3
            goto L35
        L2a:
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L35
            int[] r2 = r8.f23179
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L28
        L35:
            if (r10 != r2) goto L4f
            r8 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L43
            java.lang.String r10 = r9.f24057
            int r9 = r9.m14226(r10)
        L41:
            r8 = r8 | r9
            return r8
        L43:
            飘花落叶言楪子世苏哲兰.飘花落叶言子楪世兰哲苏[] r0 = r9.f24059
            r10 = r10 & r5
            r10 = r0[r10]
            java.lang.String r10 = r10.f23129
            int r9 = r9.m14226(r10)
            goto L41
        L4f:
            int r1 = r1 + 1
            goto Ld
        L52:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p283.C8380.m13928(飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏世哲兰, int):int");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m13929(int i) {
        switch (this.f23181) {
            case 0:
                int[] iArr = this.f23178;
                if (iArr == null || i >= iArr.length) {
                    return i | 67108864;
                }
                int i2 = iArr[i];
                if (i2 != 0) {
                    return i2;
                }
                int i3 = i | 67108864;
                iArr[i] = i3;
                return i3;
            default:
                int[] iArr2 = this.f23178;
                if (iArr2 == null || i >= iArr2.length) {
                    return i | 16777216;
                }
                int i4 = iArr2[i];
                if (i4 != 0) {
                    return i4;
                }
                int i5 = i | 16777216;
                iArr2[i] = i5;
                return i5;
        }
    }
}
