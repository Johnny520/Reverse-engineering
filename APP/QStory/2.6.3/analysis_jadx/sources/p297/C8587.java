package p297;

import com.android.dx.io.Opcodes;
import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p230.C8053;
import p283.C8377;
import p283.C8380;
import p283.C8382;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8587 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f23929;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f23930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f23931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23932;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8594 f23933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8587 f23934;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f23935;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C8589 f23936;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8589 f23937;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int[] f23938;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f23939;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C8589 f23940;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f23941;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f23942;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f23943;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f23944;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C8382 f23945;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f23946;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8382 f23947;

    public C8587(C8594 c8594, String str, String str2, int i) {
        this.f23933 = c8594;
        this.f23932 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(str) ? 262145 : 1;
        this.f23931 = c8594.m14228(str);
        this.f23930 = str;
        this.f23929 = c8594.m14228(str2);
        this.f23943 = str2;
        this.f23947 = new C8382(i);
        this.f23946 = C8593.m14220(str2) >> 2;
        C8589 c8589 = new C8589();
        this.f23937 = c8589;
        m14158(c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m14153(long j) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        int i3 = (i + 5 + i2) & Integer.MAX_VALUE;
        C8594 c8594 = this.f23933;
        C8377[] c8377Arr = c8594.f24055;
        C8377 c8377 = c8377Arr[i3 % c8377Arr.length];
        while (true) {
            if (c8377 == null) {
                int i4 = c8594.f24054;
                C8382 c83822 = c8594.f24053;
                c83822.m13934(5);
                int i5 = c83822.f23199;
                int i6 = i5 + 8;
                if (i6 > c83822.f23200.length) {
                    c83822.m13938(8);
                }
                byte[] bArr = c83822.f23200;
                bArr[i5] = (byte) (i2 >>> 24);
                bArr[i5 + 1] = (byte) (i2 >>> 16);
                bArr[i5 + 2] = (byte) (i2 >>> 8);
                bArr[i5 + 3] = (byte) i2;
                bArr[i5 + 4] = (byte) (i >>> 24);
                bArr[i5 + 5] = (byte) (i >>> 16);
                bArr[i5 + 6] = (byte) (i >>> 8);
                bArr[i5 + 7] = (byte) i;
                c83822.f23199 = i6;
                c8594.f24054 += 2;
                C8377 c83772 = new C8377(i4, 5, null, null, null, j, i3, 1);
                c8594.m14224(c83772);
                c8377 = c83772;
            } else if (c8377.f23132 == 5 && c8377.f23134 == i3 && c8377.f23128 == j) {
                break;
            } else {
                c8377 = (C8377) c8377.f23136;
            }
        }
        c8382.m13936(20, c8377.f23133);
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(18, 0, c8377, c8594);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m14154(Class cls) {
        String strM14218 = AbstractC8591.m14218(cls);
        C8593 c8593M14219 = C8593.m14219(0, strM14218.length(), strM14218);
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        int i = c8593M14219.f24052;
        if (i == 12) {
            i = 10;
        }
        C8594 c8594 = this.f23933;
        C8377 c8377M14227 = i == 10 ? c8594.m14227(7, c8593M14219.f24051.substring(c8593M14219.f24050, c8593M14219.f24049)) : c8594.m14227(7, c8593M14219.m14222());
        int i2 = c8377M14227.f23133;
        if (i2 >= 256) {
            c8382.m13936(19, i2);
        } else {
            c8382.m13937(18, i2);
        }
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(18, 0, c8377M14227, c8594);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m14155(int i, C8589 c8589) {
        boolean z;
        C8382 c8382 = this.f23947;
        int i2 = c8382.f23199;
        this.f23935 = i2;
        int i3 = i >= 200 ? i - 33 : i;
        if ((c8589.f23959 & 4) == 0 || c8589.f23958 - i2 >= -32768) {
            if (i3 != i) {
                c8382.m13934(i);
                c8589.m14209(c8382, c8382.f23199 - 1, true);
            } else {
                c8382.m13934(i3);
                c8589.m14209(c8382, c8382.f23199 - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                c8382.m13934(200);
            } else if (i3 == 168) {
                c8382.m13934(201);
            } else {
                c8382.m13934(i3 >= 198 ? i3 ^ 1 : ((i3 + 1) ^ 1) - 1);
                c8382.m13939(8);
                c8382.m13934(Opcodes.REM_INT_LIT8);
                this.f23939 = true;
                z = true;
                c8589.m14209(c8382, c8382.f23199 - 1, true);
            }
            z = false;
            c8589.m14209(c8382, c8382.f23199 - 1, true);
        }
        C8589 c85892 = this.f23940;
        if (c85892 != null) {
            c85892.f23955.m13915(i3, 0, null, null);
            C8380 c8380 = c8589.f23955;
            C8589 c85893 = c8380 == null ? c8589 : (C8589) c8380.f23185;
            c85893.f23959 = (short) (c85893.f23959 | 2);
            C8589 c85894 = this.f23940;
            c85894.f23961 = new C8053(c8589, c85894.f23961);
            C8589 c85895 = i3 != 167 ? new C8589() : null;
            if (c85895 != null) {
                if (z) {
                    c85895.f23959 = (short) (c85895.f23959 | 2);
                }
                m14158(c85895);
            }
            if (i3 == 167) {
                m14195();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14156(int i) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        c8382.m13934(i);
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(i, 0, null, null);
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m14195();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m14157(int i) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        int i2 = (i + 3) & Integer.MAX_VALUE;
        C8594 c8594 = this.f23933;
        C8377[] c8377Arr = c8594.f24055;
        C8377 c8377 = c8377Arr[i2 % c8377Arr.length];
        while (true) {
            if (c8377 == null) {
                C8382 c83822 = c8594.f24053;
                c83822.m13934(3);
                c83822.m13940(i);
                int i3 = c8594.f24054;
                c8594.f24054 = i3 + 1;
                C8377 c83772 = new C8377(i3, 3, null, null, null, i, i2, 1);
                c8594.m14224(c83772);
                c8377 = c83772;
                break;
            }
            if (c8377.f23132 == 3 && c8377.f23134 == i2 && c8377.f23128 == i) {
                break;
            } else {
                c8377 = (C8377) c8377.f23136;
            }
        }
        int i4 = c8377.f23133;
        if (i4 >= 256) {
            c8382.m13936(19, i4);
        } else {
            c8382.m13937(18, i4);
        }
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(18, 0, c8377, c8594);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m14158(C8589 c8589) {
        boolean z = this.f23939;
        C8382 c8382 = this.f23947;
        this.f23939 = z | c8589.m14208(c8382.f23200, c8382.f23199);
        short s = c8589.f23959;
        if ((s & 1) != 0) {
            return;
        }
        C8589 c85892 = this.f23940;
        if (c85892 != null) {
            if (c8589.f23958 == c85892.f23958) {
                c85892.f23959 = (short) (c85892.f23959 | (s & 2));
                c8589.f23955 = c85892.f23955;
                return;
            }
            c85892.f23961 = new C8053(c8589, c85892.f23961);
        }
        C8589 c85893 = this.f23936;
        if (c85893 != null) {
            if (c8589.f23958 == c85893.f23958) {
                c85893.f23959 = (short) ((s & 2) | c85893.f23959);
                c8589.f23955 = c85893.f23955;
                this.f23940 = c85893;
                return;
            }
            c85893.f23954 = c8589;
        }
        this.f23936 = c8589;
        this.f23940 = c8589;
        c8589.f23955 = new C8380(c8589, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m14159(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f23938;
        if (iArr == null || iArr.length < i4) {
            this.f23938 = new int[i4];
        }
        int[] iArr2 = this.f23938;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m14160(int i, int i2) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        if (i > 255 || i2 > 127 || i2 < -128) {
            c8382.m13934(196);
            c8382.m13936(132, i);
            c8382.m13939(i2);
        } else {
            c8382.m13934(132);
            c8382.m13937(i, i2);
        }
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(132, i, null, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m14161(int i, Class cls) {
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE || cls == Boolean.TYPE) {
            m14201(54, i);
            return;
        }
        if (cls == Long.TYPE) {
            m14201(55, i);
            return;
        }
        if (cls == Float.TYPE) {
            m14201(56, i);
        } else if (cls == Double.TYPE) {
            m14201(57, i);
        } else {
            m14201(58, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m14162() {
        m14156(177);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14163() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p297.C8587.m14163():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14164(int i, String str, String str2, String str3) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        C8594 c8594 = this.f23933;
        C8377 c8377M14229 = c8594.m14229(9, str, str2, str3);
        c8382.m13936(i, c8377M14229.f23133);
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(i, 0, c8377M14229, c8594);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m14165(int i, Class cls) {
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE || cls == Boolean.TYPE) {
            m14201(21, i);
            return;
        }
        if (cls == Long.TYPE) {
            m14201(22, i);
            return;
        }
        if (cls == Float.TYPE) {
            m14201(23, i);
        } else if (cls == Double.TYPE) {
            m14201(24, i);
        } else {
            m14201(25, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m14166(int i) {
        m14201(22, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m14167() {
        m14156(9);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14168() {
        m14156(148);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14169() {
        m14156(127);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m14170(int i) {
        m14201(54, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m14171(String str, String str2, String str3) {
        m14164(181, str, str2, str3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m14172(int i, int i2) {
        while (i < i2) {
            int i3 = this.f23938[i];
            C8382 c8382 = this.f23945;
            int i4 = ((-67108864) & i3) >> 26;
            C8594 c8594 = this.f23933;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 62914560;
                if (i6 == 4194304) {
                    c8382.m13934(i5);
                } else if (i6 == 8388608) {
                    c8382.m13934(7);
                    c8382.m13939(c8594.m14227(7, c8594.f24059[i5].f23129).f23133);
                } else if (i6 != 12582912) {
                    C5554.m10870();
                    return;
                } else {
                    c8382.m13934(8);
                    c8382.m13939((int) c8594.f24059[i5].f23128);
                }
            } else {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int i7 = i4 - 1;
                    if (i4 > 0) {
                        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH);
                        i4 = i7;
                    } else {
                        if ((i3 & 62914560) == 8388608) {
                            sb.append('L');
                            sb.append(c8594.f24059[i3 & 1048575].f23129);
                            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                        } else {
                            int i8 = i3 & 1048575;
                            if (i8 == 1) {
                                sb.append('I');
                            } else if (i8 == 2) {
                                sb.append('F');
                            } else if (i8 == 3) {
                                sb.append('D');
                            } else if (i8 != 4) {
                                switch (i8) {
                                    case 9:
                                        sb.append('Z');
                                        break;
                                    case 10:
                                        sb.append('B');
                                        break;
                                    case 11:
                                        sb.append('C');
                                        break;
                                    case 12:
                                        sb.append('S');
                                        break;
                                    default:
                                        C5554.m10870();
                                        return;
                                }
                            } else {
                                sb.append('J');
                            }
                        }
                        c8382.m13934(7);
                        c8382.m13939(c8594.m14227(7, sb.toString()).f23133);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m14173() {
        m14156(87);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m14174(String str) {
        m14205(187, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m14175(int i) {
        m14201(55, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m14176() {
        m14156(129);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14177(Class cls) {
        if (cls == Long.TYPE) {
            m14156(9);
            m14156(148);
        } else if (cls == Double.TYPE) {
            m14156(14);
            m14156(151);
        } else if (cls == Float.TYPE) {
            m14156(11);
            m14156(149);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14178(String str) {
        m14205(192, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14179(int i) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        c8382.m13937(16, i);
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(16, i, null, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14180(int i) {
        m14201(58, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14181() {
        m14156(176);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14182(int i) {
        m14201(25, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14183(String str, String str2, String str3) {
        m14204(185, str, str2, str3, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14184(int i) {
        m14201(21, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m14185(String str, String str2, String str3) {
        m14204(184, str, str2, str3, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m14186(String str, String str2, String str3) {
        m14204(182, str, str2, str3, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m14187(String str, String str2, String str3) {
        m14204(183, str, str2, str3, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m14188(String str, String str2, String str3) {
        m14204(184, str, str2, str3, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m14189(C8589 c8589) {
        m14155(166, c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14190(int i) {
        switch (i) {
            case -1:
                m14156(2);
                break;
            case 0:
                m14156(3);
                break;
            case 1:
                m14156(4);
                break;
            case 2:
                m14156(5);
                break;
            case 3:
                m14156(6);
                break;
            case 4:
                m14156(7);
                break;
            case 5:
                m14156(8);
                break;
            default:
                if (i >= -128 && i < 127) {
                    m14179(i);
                } else if (i >= -32768 && i < 32767) {
                    C8382 c8382 = this.f23947;
                    this.f23935 = c8382.f23199;
                    c8382.m13936(17, i);
                    C8589 c8589 = this.f23940;
                    if (c8589 != null) {
                        c8589.f23955.m13915(17, i, null, null);
                    }
                } else {
                    m14157(i);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14191(C8589 c8589) {
        m14155(199, c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14192(C8589 c8589) {
        m14155(198, c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m14193(C8589 c8589) {
        m14155(153, c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m14194(C8589 c8589) {
        m14155(154, c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14195() {
        C8589 c8589 = new C8589();
        c8589.f23955 = new C8380(c8589, 1);
        C8382 c8382 = this.f23947;
        c8589.m14208(c8382.f23200, c8382.f23199);
        this.f23936.f23954 = c8589;
        this.f23936 = c8589;
        this.f23940 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14196() {
        m14156(89);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14197(C8589 c8589) {
        m14155(167, c8589);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14198() {
        m14156(96);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m14199(String str, String str2, String str3) {
        m14164(180, str, str2, str3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14200(String str, String str2, String str3) {
        m14164(178, str, str2, str3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m14201(int i, int i2) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        if (i2 < 4 && i != 169) {
            c8382.m13934((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            c8382.m13934(196);
            c8382.m13936(i, i2);
        } else {
            c8382.m13937(i, i2);
        }
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(i, i2, null, null);
        }
        int i3 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
        if (i3 > this.f23946) {
            this.f23946 = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m14202(String str) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        C8594 c8594 = this.f23933;
        C8377 c8377M14227 = c8594.m14227(8, str);
        int i = c8377M14227.f23133;
        if (i >= 256) {
            c8382.m13936(19, i);
        } else {
            c8382.m13937(18, i);
        }
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(18, 0, c8377M14227, c8594);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m14203(Number number) {
        if (number instanceof Integer) {
            m14157(number.intValue());
        } else if (number instanceof Long) {
            m14153(number.longValue());
        } else {
            C5925.m11308(number.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m14204(int i, String str, String str2, String str3, boolean z) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        int i2 = z ? 11 : 10;
        C8594 c8594 = this.f23933;
        C8377 c8377M14229 = c8594.m14229(i2, str, str2, str3);
        int i3 = c8377M14229.f23133;
        if (i == 185) {
            c8382.m13936(185, i3);
            if (c8377M14229.f23135 == 0) {
                c8377M14229.f23135 = C8593.m14220(c8377M14229.f23129);
            }
            c8382.m13937(c8377M14229.f23135 >> 2, 0);
        } else {
            c8382.m13936(i, i3);
        }
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(i, 0, c8377M14229, c8594);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m14205(int i, String str) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        C8594 c8594 = this.f23933;
        C8377 c8377M14227 = c8594.m14227(7, str);
        c8382.m13936(i, c8377M14227.f23133);
        C8589 c8589 = this.f23940;
        if (c8589 != null) {
            c8589.f23955.m13915(i, this.f23935, c8377M14227, c8594);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m14206(C8589 c8589, int[] iArr, C8589[] c8589Arr) {
        C8382 c8382 = this.f23947;
        this.f23935 = c8382.f23199;
        c8382.m13934(171);
        c8382.m13933(null, (4 - (c8382.f23199 % 4)) % 4);
        c8589.m14209(c8382, this.f23935, true);
        c8382.m13940(c8589Arr.length);
        for (int i = 0; i < c8589Arr.length; i++) {
            c8382.m13940(iArr[i]);
            c8589Arr[i].m14209(c8382, this.f23935, true);
        }
        C8589 c85892 = this.f23940;
        if (c85892 != null) {
            c85892.f23955.m13915(171, 0, null, null);
            C8589 c85893 = this.f23940;
            c85893.f23961 = new C8053(c8589, c85893.f23961);
            C8380 c8380 = c8589.f23955;
            if (c8380 != null) {
                c8589 = (C8589) c8380.f23185;
            }
            c8589.f23959 = (short) (c8589.f23959 | 2);
            for (C8589 c85894 : c8589Arr) {
                C8589 c85895 = this.f23940;
                c85895.f23961 = new C8053(c85894, c85895.f23961);
                C8380 c83802 = c85894.f23955;
                if (c83802 != null) {
                    c85894 = (C8589) c83802.f23185;
                }
                c85894.f23959 = (short) (c85894.f23959 | 2);
            }
            m14195();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bc  */
    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14207() {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p297.C8587.m14207():void");
    }
}
