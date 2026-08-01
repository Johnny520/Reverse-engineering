package com.esotericsoftware.asm;

import net.bytebuddy.implementation.auxiliary.TypeProxy;

/* JADX INFO: loaded from: classes.dex */
final class Frame {
    static final int[] a;
    Label b;
    int[] c;
    int[] d;
    private int[] e;
    private int[] f;
    private int g;
    private int h;
    private int[] i;

    static {
        _clinit_();
        int[] iArr = new int[com.android.dx.io.Opcodes.REM_FLOAT_2ADDR];
        for (int i = 0; i < 202; i++) {
            iArr[i] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i) - 'E';
        }
        a = iArr;
    }

    private static int b(ClassWriter classWriter, String str) {
        int iIndexOf = str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0;
        char cCharAt = str.charAt(iIndexOf);
        int iC = 16777218;
        if (cCharAt == 'F') {
            return 16777218;
        }
        if (cCharAt == 'L') {
            return classWriter.c(str.substring(iIndexOf + 1, str.length() - 1)) | 24117248;
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
                                iC = 16777228;
                            } else if (cCharAt2 == 'Z') {
                                iC = 16777225;
                            } else if (cCharAt2 == 'I') {
                                iC = 16777217;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iC = 16777226;
                                        break;
                                    case 'C':
                                        iC = 16777227;
                                        break;
                                    case 'D':
                                        iC = 16777219;
                                        break;
                                    default:
                                        iC = classWriter.c(str.substring(i + 1, str.length() - 1)) | 24117248;
                                        break;
                                }
                            } else {
                                iC = 16777220;
                            }
                        }
                        return ((i - iIndexOf) << 28) | iC;
                }
            }
        }
        return 16777217;
    }

    private void c(int i) {
        int i2 = this.g;
        if (i2 >= i) {
            this.g = i2 - i;
            return;
        }
        this.b.f -= i - i2;
        this.g = 0;
    }

    private void d(int i) {
        if (this.i == null) {
            this.i = new int[2];
        }
        int length = this.i.length;
        int i2 = this.h;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.i, 0, iArr, 0, length);
            this.i = iArr;
        }
        int[] iArr2 = this.i;
        int i3 = this.h;
        this.h = i3 + 1;
        iArr2[i3] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r18, int r19, com.esotericsoftware.asm.ClassWriter r20, com.esotericsoftware.asm.Item r21) {
        /*
            Method dump skipped, instruction units count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.Frame.a(int, int, com.esotericsoftware.asm.ClassWriter, com.esotericsoftware.asm.Item):void");
    }

    public static /* synthetic */ void _clinit_() {
    }

    private void b(int i) {
        if (this.f == null) {
            this.f = new int[10];
        }
        int length = this.f.length;
        int i2 = this.g;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.f, 0, iArr, 0, length);
            this.f = iArr;
        }
        int[] iArr2 = this.f;
        int i3 = this.g;
        int i4 = i3 + 1;
        this.g = i4;
        iArr2[i3] = i;
        Label label = this.b;
        int i5 = label.f + i4;
        if (i5 > label.g) {
            label.g = i5;
        }
    }

    private int a(int i) {
        int[] iArr = this.e;
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(com.esotericsoftware.asm.ClassWriter r7, int r8) {
        /*
            r6 = this;
            r0 = 16777222(0x1000006, float:2.3509904E-38)
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r8 != r0) goto Lf
            java.lang.String r0 = r7.I
        L9:
            int r7 = r7.c(r0)
            r7 = r7 | r1
            goto L21
        Lf:
            r0 = -1048576(0xfffffffffff00000, float:NaN)
            r0 = r0 & r8
            r2 = 25165824(0x1800000, float:4.7019774E-38)
            if (r0 != r2) goto L50
            com.esotericsoftware.asm.Item[] r0 = r7.H
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r8
            r0 = r0[r2]
            java.lang.String r0 = r0.g
            goto L9
        L21:
            r0 = 0
        L22:
            int r1 = r6.h
            if (r0 >= r1) goto L50
            int[] r1 = r6.i
            r1 = r1[r0]
            r2 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r2 = r2 & r1
            r3 = 251658240(0xf000000, float:6.3108872E-30)
            r3 = r3 & r1
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r5 = 8388607(0x7fffff, float:1.1754942E-38)
            if (r3 != r4) goto L3e
            int[] r3 = r6.c
            r1 = r1 & r5
            r1 = r3[r1]
        L3c:
            int r1 = r1 + r2
            goto L4a
        L3e:
            r4 = 50331648(0x3000000, float:3.761582E-37)
            if (r3 != r4) goto L4a
            int[] r3 = r6.d
            int r4 = r3.length
            r1 = r1 & r5
            int r4 = r4 - r1
            r1 = r3[r4]
            goto L3c
        L4a:
            if (r8 != r1) goto L4d
            return r7
        L4d:
            int r0 = r0 + 1
            goto L22
        L50:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.Frame.a(com.esotericsoftware.asm.ClassWriter, int):int");
    }

    private void a(int i, int i2) {
        if (this.e == null) {
            this.e = new int[10];
        }
        int length = this.e.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.e, 0, iArr, 0, length);
            this.e = iArr;
        }
        this.e[i] = i2;
    }

    private int a() {
        int i = this.g;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            this.g = i2;
            return iArr[i2];
        }
        Label label = this.b;
        int i3 = label.f - 1;
        label.f = i3;
        return (-i3) | 50331648;
    }

    public void a(ClassWriter classWriter, int i, Type[] typeArr, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.c = iArr;
        this.d = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & net.bytebuddy.jar.asm.Opcodes.ASM8) == 0) {
                iArr[0] = classWriter.c(classWriter.I) | 24117248;
            } else {
                iArr[0] = 16777222;
            }
        } else {
            i3 = 0;
        }
        for (Type type : typeArr) {
            int iB = b(classWriter, type.getDescriptor());
            int[] iArr2 = this.c;
            int i4 = i3 + 1;
            iArr2[i3] = iB;
            if (iB == 16777220 || iB == 16777219) {
                i3 += 2;
                iArr2[i4] = 16777216;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.c[i3] = 16777216;
            i3++;
        }
    }

    private void a(ClassWriter classWriter, String str) {
        int iB = b(classWriter, str);
        if (iB != 0) {
            b(iB);
            if (iB == 16777220 || iB == 16777219) {
                b(16777216);
            }
        }
    }

    private void a(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            c((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            c(2);
        } else {
            c(1);
        }
    }

    private static boolean a(ClassWriter classWriter, int i, int[] iArr, int i2) {
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
        int iC = 16777216;
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
                    iC = iMin | 24117248 | classWriter.c(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                }
            } else if (i4 == 24117248) {
                iC = (i & (-268435456)) | 24117248 | classWriter.a(i & 1048575, 1048575 & i3);
            } else {
                iMin = (i3 & (-268435456)) - 268435456;
                iC = iMin | 24117248 | classWriter.c(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
            }
        } else if (i3 == 16777221) {
            if ((i & 267386880) != 24117248 && (i & (-268435456)) == 0) {
                i = 16777216;
            }
            iC = i;
        }
        if (i3 == iC) {
            return false;
        }
        iArr[i2] = iC;
        return true;
    }

    public boolean a(ClassWriter classWriter, Frame frame, int i) {
        boolean zA;
        int i2;
        int length = this.c.length;
        int length2 = this.d.length;
        boolean zA2 = true;
        if (frame.c == null) {
            frame.c = new int[length];
            zA = true;
        } else {
            zA = false;
        }
        int i3 = 0;
        while (true) {
            int iA = 16777216;
            if (i3 >= length) {
                break;
            }
            int[] iArr = this.e;
            if (iArr == null || i3 >= iArr.length || (i2 = iArr[i3]) == 0) {
                iA = this.c[i3];
            } else {
                int i4 = i2 & (-268435456);
                int i5 = i2 & 251658240;
                if (i5 == 16777216) {
                    iA = i2;
                } else {
                    int i6 = i4 + (i5 == 33554432 ? this.c[i2 & 8388607] : this.d[length2 - (i2 & 8388607)]);
                    if ((i2 & 8388608) == 0 || (i6 != 16777220 && i6 != 16777219)) {
                        iA = i6;
                    }
                }
            }
            if (this.i != null) {
                iA = a(classWriter, iA);
            }
            zA |= a(classWriter, iA, frame.c, i3);
            i3++;
        }
        if (i > 0) {
            for (int i7 = 0; i7 < length; i7++) {
                zA |= a(classWriter, this.c[i7], frame.c, i7);
            }
            if (frame.d == null) {
                frame.d = new int[1];
            } else {
                zA2 = zA;
            }
            return a(classWriter, i, frame.d, 0) | zA2;
        }
        int length3 = this.d.length + this.b.f;
        if (frame.d == null) {
            frame.d = new int[this.g + length3];
        } else {
            zA2 = zA;
        }
        for (int i8 = 0; i8 < length3; i8++) {
            int iA2 = this.d[i8];
            if (this.i != null) {
                iA2 = a(classWriter, iA2);
            }
            zA2 |= a(classWriter, iA2, frame.d, i8);
        }
        for (int i9 = 0; i9 < this.g; i9++) {
            int iA3 = this.f[i9];
            int i10 = iA3 & (-268435456);
            int i11 = iA3 & 251658240;
            if (i11 != 16777216) {
                int i12 = i10 + (i11 == 33554432 ? this.c[iA3 & 8388607] : this.d[length2 - (iA3 & 8388607)]);
                iA3 = ((iA3 & 8388608) == 0 || !(i12 == 16777220 || i12 == 16777219)) ? i12 : 16777216;
            }
            if (this.i != null) {
                iA3 = a(classWriter, iA3);
            }
            zA2 |= a(classWriter, iA3, frame.d, length3 + i9);
        }
        return zA2;
    }
}
