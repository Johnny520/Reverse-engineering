package com.esotericsoftware.asm;

import bsh.C3466;
import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: loaded from: classes.dex */
final class Frame {

    /* JADX INFO: renamed from: a */
    static final int[] f189a;

    /* JADX INFO: renamed from: b */
    Label f190b;

    /* JADX INFO: renamed from: c */
    int[] f191c;

    /* JADX INFO: renamed from: d */
    int[] f192d;

    /* JADX INFO: renamed from: e */
    private int[] f193e;

    /* JADX INFO: renamed from: f */
    private int[] f194f;

    /* JADX INFO: renamed from: g */
    private int f195g;

    /* JADX INFO: renamed from: h */
    private int f196h;

    /* JADX INFO: renamed from: i */
    private int[] f197i;

    static {
        _clinit_();
        int[] iArr = new int[com.android.p002dx.p005io.Opcodes.REM_FLOAT_2ADDR];
        for (int i = 0; i < 202; i++) {
            iArr[i] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i) - 'E';
        }
        f189a = iArr;
    }

    /* JADX INFO: renamed from: b */
    private static int m91b(ClassWriter classWriter, String str) {
        int iIndexOf = str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0;
        char cCharAt = str.charAt(iIndexOf);
        int iM80c = 16777218;
        if (cCharAt == 'F') {
            return 16777218;
        }
        if (cCharAt == 'L') {
            return classWriter.m80c(str.substring(iIndexOf + 1, str.length() - 1)) | 24117248;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'Z' && cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 16777220;
                }
                switch (cCharAt) {
                    case 'B':
                    case 'C':
                        break;
                    case 'D':
                        return 16777219;
                    default:
                        int i = iIndexOf + 1;
                        while (str.charAt(i) == '[') {
                            i++;
                        }
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 != 'F') {
                            if (cCharAt2 == 'S') {
                                iM80c = 16777228;
                            } else if (cCharAt2 == 'Z') {
                                iM80c = 16777225;
                            } else if (cCharAt2 == 'I') {
                                iM80c = 16777217;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iM80c = 16777226;
                                        break;
                                    case 'C':
                                        iM80c = 16777227;
                                        break;
                                    case 'D':
                                        iM80c = 16777219;
                                        break;
                                    default:
                                        iM80c = classWriter.m80c(str.substring(i + 1, str.length() - 1)) | 24117248;
                                        break;
                                }
                            } else {
                                iM80c = 16777220;
                            }
                        }
                        return ((i - iIndexOf) << 28) | iM80c;
                }
            }
        }
        return 16777217;
    }

    /* JADX INFO: renamed from: c */
    private void m93c(int i) {
        int i2 = this.f195g;
        if (i2 >= i) {
            this.f195g = i2 - i;
            return;
        }
        this.f190b.f223f -= i - i2;
        this.f195g = 0;
    }

    /* JADX INFO: renamed from: d */
    private void m94d(int i) {
        if (this.f197i == null) {
            this.f197i = new int[2];
        }
        int length = this.f197i.length;
        int i2 = this.f196h;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.f197i, 0, iArr, 0, length);
            this.f197i = iArr;
        }
        int[] iArr2 = this.f197i;
        int i3 = this.f196h;
        this.f196h = i3 + 1;
        iArr2[i3] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fc  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m95a(int i, int i2, ClassWriter classWriter, Item item) {
        if (i != 198 && i != 199) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    m92b(16777221);
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
                    m92b(16777217);
                    break;
                case 9:
                case 10:
                    m92b(16777220);
                    m92b(16777216);
                    break;
                case 11:
                case 12:
                case 13:
                    m92b(16777218);
                    break;
                case 14:
                case 15:
                    m92b(16777219);
                    m92b(16777216);
                    break;
                case 18:
                    int i3 = item.f210b;
                    if (i3 != 16) {
                        switch (i3) {
                            case 3:
                                m92b(16777217);
                                break;
                            case 4:
                                m92b(16777218);
                                break;
                            case 5:
                                m92b(16777220);
                                m92b(16777216);
                                break;
                            case 6:
                                m92b(16777219);
                                m92b(16777216);
                                break;
                            case 7:
                                m92b(classWriter.m80c(TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME) | 24117248);
                                break;
                            case 8:
                                m92b(classWriter.m80c("java/lang/String") | 24117248);
                                break;
                            default:
                                m92b(classWriter.m80c("java/lang/invoke/MethodHandle") | 24117248);
                                break;
                        }
                    } else {
                        m92b(classWriter.m80c("java/lang/invoke/MethodType") | 24117248);
                        break;
                    }
                    break;
                default:
                    switch (i) {
                        case 21:
                            break;
                        case 22:
                            break;
                        case 23:
                            break;
                        case 24:
                            break;
                        case 25:
                            m92b(m85a(i2));
                            break;
                        default:
                            switch (i) {
                                case 46:
                                case 51:
                                case 52:
                                case 53:
                                    m93c(2);
                                    m92b(16777217);
                                    break;
                                case 47:
                                    m93c(2);
                                    m92b(16777220);
                                    m92b(16777216);
                                    break;
                                case 48:
                                    m93c(2);
                                    m92b(16777218);
                                    break;
                                case 49:
                                    m93c(2);
                                    m92b(16777219);
                                    m92b(16777216);
                                    break;
                                case 50:
                                    m93c(1);
                                    m92b(m84a() - 268435456);
                                    break;
                                case 54:
                                case 56:
                                case 58:
                                    m87a(i2, m84a());
                                    if (i2 > 0) {
                                        int i4 = i2 - 1;
                                        int iM85a = m85a(i4);
                                        if (iM85a == 16777220 || iM85a == 16777219) {
                                            m87a(i4, 16777216);
                                        } else if ((iM85a & 251658240) != 16777216) {
                                            m87a(i4, iM85a | 8388608);
                                        }
                                    }
                                    break;
                                case 55:
                                case 57:
                                    m93c(1);
                                    m87a(i2, m84a());
                                    m87a(i2 + 1, 16777216);
                                    if (i2 > 0) {
                                        int i5 = i2 - 1;
                                        int iM85a2 = m85a(i5);
                                        if (iM85a2 == 16777220 || iM85a2 == 16777219) {
                                            m87a(i5, 16777216);
                                        } else if ((iM85a2 & 251658240) != 16777216) {
                                            m87a(i5, iM85a2 | 8388608);
                                        }
                                    }
                                    break;
                                default:
                                    switch (i) {
                                        case 79:
                                        case 81:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                            m93c(3);
                                            break;
                                        case 80:
                                        case 82:
                                            m93c(4);
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
                                            m93c(2);
                                            break;
                                        case 89:
                                            int iM84a = m84a();
                                            m92b(iM84a);
                                            m92b(iM84a);
                                            break;
                                        case 90:
                                            int iM84a2 = m84a();
                                            int iM84a3 = m84a();
                                            m92b(iM84a2);
                                            m92b(iM84a3);
                                            m92b(iM84a2);
                                            break;
                                        case 91:
                                            int iM84a4 = m84a();
                                            int iM84a5 = m84a();
                                            int iM84a6 = m84a();
                                            m92b(iM84a4);
                                            m92b(iM84a6);
                                            m92b(iM84a5);
                                            m92b(iM84a4);
                                            break;
                                        case 92:
                                            int iM84a7 = m84a();
                                            int iM84a8 = m84a();
                                            m92b(iM84a8);
                                            m92b(iM84a7);
                                            m92b(iM84a8);
                                            m92b(iM84a7);
                                            break;
                                        case 93:
                                            int iM84a9 = m84a();
                                            int iM84a10 = m84a();
                                            int iM84a11 = m84a();
                                            m92b(iM84a10);
                                            m92b(iM84a9);
                                            m92b(iM84a11);
                                            m92b(iM84a10);
                                            m92b(iM84a9);
                                            break;
                                        case 94:
                                            int iM84a12 = m84a();
                                            int iM84a13 = m84a();
                                            int iM84a14 = m84a();
                                            int iM84a15 = m84a();
                                            m92b(iM84a13);
                                            m92b(iM84a12);
                                            m92b(iM84a15);
                                            m92b(iM84a14);
                                            m92b(iM84a13);
                                            m92b(iM84a12);
                                            break;
                                        case 95:
                                            int iM84a16 = m84a();
                                            int iM84a17 = m84a();
                                            m92b(iM84a16);
                                            m92b(iM84a17);
                                            break;
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
                                            m93c(2);
                                            m92b(16777217);
                                            break;
                                        case 97:
                                        case 101:
                                        case 105:
                                        case 109:
                                        case 113:
                                        case 127:
                                        case 129:
                                        case 131:
                                            m93c(4);
                                            m92b(16777220);
                                            m92b(16777216);
                                            break;
                                        case 98:
                                        case 102:
                                        case 106:
                                        case 110:
                                        case 114:
                                        case 137:
                                        case 144:
                                            m93c(2);
                                            m92b(16777218);
                                            break;
                                        case 99:
                                        case 103:
                                        case 107:
                                        case 111:
                                        case 115:
                                            m93c(4);
                                            m92b(16777219);
                                            m92b(16777216);
                                            break;
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
                                        case 121:
                                        case 123:
                                        case 125:
                                            m93c(3);
                                            m92b(16777220);
                                            m92b(16777216);
                                            break;
                                        case 132:
                                            m87a(i2, 16777217);
                                            break;
                                        case 133:
                                        case 140:
                                            m93c(1);
                                            m92b(16777220);
                                            m92b(16777216);
                                            break;
                                        case 134:
                                            m93c(1);
                                            m92b(16777218);
                                            break;
                                        case 135:
                                        case 141:
                                            m93c(1);
                                            m92b(16777219);
                                            m92b(16777216);
                                            break;
                                        case 138:
                                            break;
                                        case 139:
                                        case 190:
                                        case 193:
                                            m93c(1);
                                            m92b(16777217);
                                            break;
                                        case 143:
                                            break;
                                        case 148:
                                        case 151:
                                        case 152:
                                            m93c(4);
                                            m92b(16777217);
                                            break;
                                        case 168:
                                        case 169:
                                            C3466.m5899("JSR/RET are not supported with computeFrames option");
                                            break;
                                        case 178:
                                            m88a(classWriter, item.f215i);
                                            break;
                                        case 179:
                                            m89a(item.f215i);
                                            break;
                                        case 180:
                                            m93c(1);
                                            m88a(classWriter, item.f215i);
                                            break;
                                        case 181:
                                            m89a(item.f215i);
                                            m84a();
                                            break;
                                        case 182:
                                        case 183:
                                        case 184:
                                        case 185:
                                            m89a(item.f215i);
                                            if (i != 184) {
                                                int iM84a18 = m84a();
                                                if (i == 183 && item.f214h.charAt(0) == '<') {
                                                    m94d(iM84a18);
                                                }
                                            }
                                            m88a(classWriter, item.f215i);
                                            break;
                                        case 186:
                                            m89a(item.f214h);
                                            m88a(classWriter, item.f214h);
                                            break;
                                        case 187:
                                            m92b(classWriter.m68a(item.f213g, i2) | 25165824);
                                            break;
                                        case 188:
                                            m84a();
                                            switch (i2) {
                                                case 4:
                                                    m92b(285212681);
                                                    break;
                                                case 5:
                                                    m92b(285212683);
                                                    break;
                                                case 6:
                                                    m92b(285212674);
                                                    break;
                                                case 7:
                                                    m92b(285212675);
                                                    break;
                                                case 8:
                                                    m92b(285212682);
                                                    break;
                                                case 9:
                                                    m92b(285212684);
                                                    break;
                                                case 10:
                                                    m92b(285212673);
                                                    break;
                                                default:
                                                    m92b(285212676);
                                                    break;
                                            }
                                            break;
                                        case 189:
                                            String str = item.f213g;
                                            m84a();
                                            if (str.charAt(0) != '[') {
                                                m92b(classWriter.m80c(str) | 292552704);
                                            } else {
                                                m88a(classWriter, "[".concat(str));
                                            }
                                            break;
                                        case 192:
                                            String str2 = item.f213g;
                                            m84a();
                                            if (str2.charAt(0) != '[') {
                                                m92b(classWriter.m80c(str2) | 24117248);
                                            } else {
                                                m88a(classWriter, str2);
                                            }
                                            break;
                                        default:
                                            m93c(i2);
                                            m88a(classWriter, item.f213g);
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
            return;
        }
        m93c(1);
    }

    public static /* synthetic */ void _clinit_() {
    }

    /* JADX INFO: renamed from: b */
    private void m92b(int i) {
        if (this.f194f == null) {
            this.f194f = new int[10];
        }
        int length = this.f194f.length;
        int i2 = this.f195g;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.f194f, 0, iArr, 0, length);
            this.f194f = iArr;
        }
        int[] iArr2 = this.f194f;
        int i3 = this.f195g;
        int i4 = i3 + 1;
        this.f195g = i4;
        iArr2[i3] = i;
        Label label = this.f190b;
        int i5 = label.f223f + i4;
        if (i5 > label.f224g) {
            label.f224g = i5;
        }
    }

    /* JADX INFO: renamed from: a */
    private int m85a(int i) {
        int[] iArr = this.f193e;
        if (iArr == null || i >= iArr.length) {
            return i | 33554432;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 33554432 | i;
        iArr[i] = i3;
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004d A[LOOP:0: B:10:0x0022->B:21:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int m86a(ClassWriter classWriter, int i) {
        String str;
        int i2;
        if (i != 16777222) {
            if (((-1048576) & i) == 25165824) {
                str = classWriter.f121H[1048575 & i].f213g;
            }
            return i;
        }
        str = classWriter.f122I;
        int iM80c = classWriter.m80c(str) | 24117248;
        for (int i3 = 0; i3 < this.f196h; i3++) {
            int i4 = this.f197i[i3];
            int i5 = (-268435456) & i4;
            int i6 = 251658240 & i4;
            if (i6 == 33554432) {
                i2 = this.f191c[i4 & 8388607];
            } else {
                if (i6 == 50331648) {
                    int[] iArr = this.f192d;
                    i2 = iArr[iArr.length - (i4 & 8388607)];
                }
                if (i != i4) {
                    return iM80c;
                }
            }
            i4 = i2 + i5;
            if (i != i4) {
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    private void m87a(int i, int i2) {
        if (this.f193e == null) {
            this.f193e = new int[10];
        }
        int length = this.f193e.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.f193e, 0, iArr, 0, length);
            this.f193e = iArr;
        }
        this.f193e[i] = i2;
    }

    /* JADX INFO: renamed from: a */
    private int m84a() {
        int i = this.f195g;
        if (i > 0) {
            int[] iArr = this.f194f;
            int i2 = i - 1;
            this.f195g = i2;
            return iArr[i2];
        }
        Label label = this.f190b;
        int i3 = label.f223f - 1;
        label.f223f = i3;
        return (-i3) | 50331648;
    }

    /* JADX INFO: renamed from: a */
    public void m96a(ClassWriter classWriter, int i, Type[] typeArr, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.f191c = iArr;
        this.f192d = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & net.bytebuddy.jar.asm.Opcodes.ASM8) == 0) {
                iArr[0] = classWriter.m80c(classWriter.f122I) | 24117248;
            } else {
                iArr[0] = 16777222;
            }
        } else {
            i3 = 0;
        }
        for (Type type : typeArr) {
            int iM91b = m91b(classWriter, type.getDescriptor());
            int[] iArr2 = this.f191c;
            int i4 = i3 + 1;
            iArr2[i3] = iM91b;
            if (iM91b == 16777220 || iM91b == 16777219) {
                i3 += 2;
                iArr2[i4] = 16777216;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.f191c[i3] = 16777216;
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m88a(ClassWriter classWriter, String str) {
        int iM91b = m91b(classWriter, str);
        if (iM91b != 0) {
            m92b(iM91b);
            if (iM91b == 16777220 || iM91b == 16777219) {
                m92b(16777216);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m89a(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            m93c((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            m93c(2);
        } else {
            m93c(1);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m90a(ClassWriter classWriter, int i, int[] iArr, int i2) {
        int iMin;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((268435455 & i) == 16777221) {
            if (i3 == 16777221) {
                return false;
            }
            i = 16777221;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & 267386880;
        int iM80c = 16777216;
        if (i4 == 24117248 || (i3 & (-268435456)) != 0) {
            if (i == 16777221) {
                return false;
            }
            if ((i & (-1048576)) != ((-1048576) & i3)) {
                int i5 = i & 267386880;
                if (i5 == 24117248 || (i & (-268435456)) != 0) {
                    int i6 = i & (-268435456);
                    int i7 = ((i6 == 0 || i5 == 24117248) ? 0 : -268435456) + i6;
                    int i8 = i3 & (-268435456);
                    iMin = Math.min(i7, ((i8 == 0 || i4 == 24117248) ? 0 : -268435456) + i8);
                    iM80c = iMin | 24117248 | classWriter.m80c(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                }
            } else if (i4 == 24117248) {
                iM80c = (i & (-268435456)) | 24117248 | classWriter.m67a(i & 1048575, 1048575 & i3);
            } else {
                iMin = (i3 & (-268435456)) - 268435456;
                iM80c = iMin | 24117248 | classWriter.m80c(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
            }
        } else if (i3 == 16777221) {
            if ((i & 267386880) != 24117248 && (i & (-268435456)) == 0) {
                i = 16777216;
            }
            iM80c = i;
        }
        if (i3 == iM80c) {
            return false;
        }
        iArr[i2] = iM80c;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m97a(ClassWriter classWriter, Frame frame, int i) {
        boolean zM90a;
        int i2;
        int length = this.f191c.length;
        int length2 = this.f192d.length;
        boolean zM90a2 = true;
        if (frame.f191c == null) {
            frame.f191c = new int[length];
            zM90a = true;
        } else {
            zM90a = false;
        }
        int i3 = 0;
        while (true) {
            int iM86a = 16777216;
            if (i3 >= length) {
                break;
            }
            int[] iArr = this.f193e;
            if (iArr == null || i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                iM86a = this.f191c[i3];
            } else {
                int i4 = i2 & (-268435456);
                int i5 = i2 & 251658240;
                if (i5 == 16777216) {
                    iM86a = i2;
                } else {
                    int i6 = i4 + (i5 == 33554432 ? this.f191c[i2 & 8388607] : this.f192d[length2 - (i2 & 8388607)]);
                    if ((i2 & 8388608) == 0 || (i6 != 16777220 && i6 != 16777219)) {
                        iM86a = i6;
                    }
                }
            }
            if (this.f197i != null) {
                iM86a = m86a(classWriter, iM86a);
            }
            zM90a |= m90a(classWriter, iM86a, frame.f191c, i3);
            i3++;
        }
        if (i > 0) {
            for (int i7 = 0; i7 < length; i7++) {
                zM90a |= m90a(classWriter, this.f191c[i7], frame.f191c, i7);
            }
            if (frame.f192d == null) {
                frame.f192d = new int[1];
            } else {
                zM90a2 = zM90a;
            }
            return m90a(classWriter, i, frame.f192d, 0) | zM90a2;
        }
        int length3 = this.f192d.length + this.f190b.f223f;
        if (frame.f192d == null) {
            frame.f192d = new int[this.f195g + length3];
        } else {
            zM90a2 = zM90a;
        }
        for (int i8 = 0; i8 < length3; i8++) {
            int iM86a2 = this.f192d[i8];
            if (this.f197i != null) {
                iM86a2 = m86a(classWriter, iM86a2);
            }
            zM90a2 |= m90a(classWriter, iM86a2, frame.f192d, i8);
        }
        for (int i9 = 0; i9 < this.f195g; i9++) {
            int iM86a3 = this.f194f[i9];
            int i10 = iM86a3 & (-268435456);
            int i11 = iM86a3 & 251658240;
            if (i11 != 16777216) {
                int i12 = i10 + (i11 == 33554432 ? this.f191c[iM86a3 & 8388607] : this.f192d[length2 - (iM86a3 & 8388607)]);
                iM86a3 = ((iM86a3 & 8388608) == 0 || !(i12 == 16777220 || i12 == 16777219)) ? i12 : 16777216;
            }
            if (this.f197i != null) {
                iM86a3 = m86a(classWriter, iM86a3);
            }
            zM90a2 |= m90a(classWriter, iM86a3, frame.f192d, length3 + i9);
        }
        return zM90a2;
    }
}
