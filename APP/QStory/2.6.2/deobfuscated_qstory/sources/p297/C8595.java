package p297;

import com.android.dx.io.Opcodes;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p230.C8052;
import p283.C8376;
import p283.C8379;
import p283.C8381;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8595 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f23938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f23939;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f23940;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f23941;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8602 f23942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C8595 f23943;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f23944;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C8597 f23945;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C8597 f23946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int[] f23947;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f23948;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C8597 f23949;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f23950;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f23951;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f23952;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f23953;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C8381 f23954;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f23955;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8381 f23956;

    public C8595(C8602 c8602, String str, String str2, int i) {
        this.f23942 = c8602;
        this.f23941 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(str) ? 262145 : 1;
        this.f23940 = c8602.m14209(str);
        this.f23939 = str;
        this.f23938 = c8602.m14209(str2);
        this.f23952 = str2;
        this.f23956 = new C8381(i);
        this.f23955 = C8601.m14201(str2) >> 2;
        C8597 c8597 = new C8597();
        this.f23946 = c8597;
        m14139(c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m14134(long j) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        int i3 = (i + 5 + i2) & Integer.MAX_VALUE;
        C8602 c8602 = this.f23942;
        C8376[] c8376Arr = c8602.f24064;
        C8376 c8376 = c8376Arr[i3 % c8376Arr.length];
        while (true) {
            if (c8376 == null) {
                int i4 = c8602.f24063;
                C8381 c83812 = c8602.f24062;
                c83812.m13917(5);
                int i5 = c83812.f23200;
                int i6 = i5 + 8;
                if (i6 > c83812.f23201.length) {
                    c83812.m13921(8);
                }
                byte[] bArr = c83812.f23201;
                bArr[i5] = (byte) (i2 >>> 24);
                bArr[i5 + 1] = (byte) (i2 >>> 16);
                bArr[i5 + 2] = (byte) (i2 >>> 8);
                bArr[i5 + 3] = (byte) i2;
                bArr[i5 + 4] = (byte) (i >>> 24);
                bArr[i5 + 5] = (byte) (i >>> 16);
                bArr[i5 + 6] = (byte) (i >>> 8);
                bArr[i5 + 7] = (byte) i;
                c83812.f23200 = i6;
                c8602.f24063 += 2;
                C8376 c83762 = new C8376(i4, 5, null, null, null, j, i3, 1);
                c8602.m14205(c83762);
                c8376 = c83762;
            } else if (c8376.f23133 == 5 && c8376.f23135 == i3 && c8376.f23129 == j) {
                break;
            } else {
                c8376 = (C8376) c8376.f23137;
            }
        }
        c8381.m13919(20, c8376.f23134);
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(18, 0, c8376, c8602);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m14135(Class cls) {
        String strM14199 = AbstractC8599.m14199(cls);
        C8601 c8601M14200 = C8601.m14200(0, strM14199.length(), strM14199);
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        int i = c8601M14200.f24061;
        if (i == 12) {
            i = 10;
        }
        C8602 c8602 = this.f23942;
        C8376 c8376M14208 = i == 10 ? c8602.m14208(7, c8601M14200.f24060.substring(c8601M14200.f24059, c8601M14200.f24058)) : c8602.m14208(7, c8601M14200.m14203());
        int i2 = c8376M14208.f23134;
        if (i2 >= 256) {
            c8381.m13919(19, i2);
        } else {
            c8381.m13920(18, i2);
        }
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(18, 0, c8376M14208, c8602);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m14136(int i, C8597 c8597) {
        boolean z;
        C8381 c8381 = this.f23956;
        int i2 = c8381.f23200;
        this.f23944 = i2;
        int i3 = i >= 200 ? i - 33 : i;
        if ((c8597.f23968 & 4) == 0 || c8597.f23967 - i2 >= -32768) {
            if (i3 != i) {
                c8381.m13917(i);
                c8597.m14190(c8381, c8381.f23200 - 1, true);
            } else {
                c8381.m13917(i3);
                c8597.m14190(c8381, c8381.f23200 - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                c8381.m13917(200);
            } else if (i3 == 168) {
                c8381.m13917(201);
            } else {
                c8381.m13917(i3 >= 198 ? i3 ^ 1 : ((i3 + 1) ^ 1) - 1);
                c8381.m13922(8);
                c8381.m13917(Opcodes.REM_INT_LIT8);
                this.f23948 = true;
                z = true;
                c8597.m14190(c8381, c8381.f23200 - 1, true);
            }
            z = false;
            c8597.m14190(c8381, c8381.f23200 - 1, true);
        }
        C8597 c85972 = this.f23949;
        if (c85972 != null) {
            c85972.f23964.m13898(i3, 0, null, null);
            C8379 c8379 = c8597.f23964;
            C8597 c85973 = c8379 == null ? c8597 : (C8597) c8379.f23186;
            c85973.f23968 = (short) (c85973.f23968 | 2);
            C8597 c85974 = this.f23949;
            c85974.f23970 = new C8052(c8597, c85974.f23970);
            C8597 c85975 = i3 != 167 ? new C8597() : null;
            if (c85975 != null) {
                if (z) {
                    c85975.f23968 = (short) (c85975.f23968 | 2);
                }
                m14139(c85975);
            }
            if (i3 == 167) {
                m14176();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14137(int i) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        c8381.m13917(i);
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(i, 0, null, null);
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m14176();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m14138(int i) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        int i2 = (i + 3) & Integer.MAX_VALUE;
        C8602 c8602 = this.f23942;
        C8376[] c8376Arr = c8602.f24064;
        C8376 c8376 = c8376Arr[i2 % c8376Arr.length];
        while (true) {
            if (c8376 == null) {
                C8381 c83812 = c8602.f24062;
                c83812.m13917(3);
                c83812.m13923(i);
                int i3 = c8602.f24063;
                c8602.f24063 = i3 + 1;
                C8376 c83762 = new C8376(i3, 3, null, null, null, i, i2, 1);
                c8602.m14205(c83762);
                c8376 = c83762;
                break;
            }
            if (c8376.f23133 == 3 && c8376.f23135 == i2 && c8376.f23129 == i) {
                break;
            } else {
                c8376 = (C8376) c8376.f23137;
            }
        }
        int i4 = c8376.f23134;
        if (i4 >= 256) {
            c8381.m13919(19, i4);
        } else {
            c8381.m13920(18, i4);
        }
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(18, 0, c8376, c8602);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m14139(C8597 c8597) {
        boolean z = this.f23948;
        C8381 c8381 = this.f23956;
        this.f23948 = z | c8597.m14189(c8381.f23201, c8381.f23200);
        short s = c8597.f23968;
        if ((s & 1) != 0) {
            return;
        }
        C8597 c85972 = this.f23949;
        if (c85972 != null) {
            if (c8597.f23967 == c85972.f23967) {
                c85972.f23968 = (short) (c85972.f23968 | (s & 2));
                c8597.f23964 = c85972.f23964;
                return;
            }
            c85972.f23970 = new C8052(c8597, c85972.f23970);
        }
        C8597 c85973 = this.f23945;
        if (c85973 != null) {
            if (c8597.f23967 == c85973.f23967) {
                c85973.f23968 = (short) ((s & 2) | c85973.f23968);
                c8597.f23964 = c85973.f23964;
                this.f23949 = c85973;
                return;
            }
            c85973.f23963 = c8597;
        }
        this.f23945 = c8597;
        this.f23949 = c8597;
        c8597.f23964 = new C8379(c8597, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m14140(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f23947;
        if (iArr == null || iArr.length < i4) {
            this.f23947 = new int[i4];
        }
        int[] iArr2 = this.f23947;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m14141(int i, int i2) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        if (i > 255 || i2 > 127 || i2 < -128) {
            c8381.m13917(196);
            c8381.m13919(132, i);
            c8381.m13922(i2);
        } else {
            c8381.m13917(132);
            c8381.m13920(i, i2);
        }
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(132, i, null, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m14142(int i, Class cls) {
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE || cls == Boolean.TYPE) {
            m14182(54, i);
            return;
        }
        if (cls == Long.TYPE) {
            m14182(55, i);
            return;
        }
        if (cls == Float.TYPE) {
            m14182(56, i);
        } else if (cls == Double.TYPE) {
            m14182(57, i);
        } else {
            m14182(58, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m14143() {
        m14137(177);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m14144() {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p297.C8595.m14144():void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14145(int i, String str, String str2, String str3) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        C8602 c8602 = this.f23942;
        C8376 c8376M14210 = c8602.m14210(9, str, str2, str3);
        c8381.m13919(i, c8376M14210.f23134);
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(i, 0, c8376M14210, c8602);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m14146(int i, Class cls) {
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE || cls == Boolean.TYPE) {
            m14182(21, i);
            return;
        }
        if (cls == Long.TYPE) {
            m14182(22, i);
            return;
        }
        if (cls == Float.TYPE) {
            m14182(23, i);
        } else if (cls == Double.TYPE) {
            m14182(24, i);
        } else {
            m14182(25, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m14147(int i) {
        m14182(22, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m14148() {
        m14137(9);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14149() {
        m14137(148);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14150() {
        m14137(127);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m14151(int i) {
        m14182(54, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m14152(String str, String str2, String str3) {
        m14145(181, str, str2, str3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m14153(int i, int i2) {
        while (i < i2) {
            int i3 = this.f23947[i];
            C8381 c8381 = this.f23954;
            int i4 = ((-67108864) & i3) >> 26;
            C8602 c8602 = this.f23942;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 62914560;
                if (i6 == 4194304) {
                    c8381.m13917(i5);
                } else if (i6 == 8388608) {
                    c8381.m13917(7);
                    c8381.m13922(c8602.m14208(7, c8602.f24068[i5].f23130).f23134);
                } else if (i6 != 12582912) {
                    C5553.m10813();
                    return;
                } else {
                    c8381.m13917(8);
                    c8381.m13922((int) c8602.f24068[i5].f23129);
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
                            sb.append(c8602.f24068[i3 & 1048575].f23130);
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
                                        C5553.m10813();
                                        return;
                                }
                            } else {
                                sb.append('J');
                            }
                        }
                        c8381.m13917(7);
                        c8381.m13922(c8602.m14208(7, sb.toString()).f23134);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m14154() {
        m14137(87);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m14155(String str) {
        m14186(187, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m14156(int i) {
        m14182(55, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m14157() {
        m14137(129);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14158(Class cls) {
        if (cls == Long.TYPE) {
            m14137(9);
            m14137(148);
        } else if (cls == Double.TYPE) {
            m14137(14);
            m14137(151);
        } else if (cls == Float.TYPE) {
            m14137(11);
            m14137(149);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14159(String str) {
        m14186(192, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14160(int i) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        c8381.m13920(16, i);
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(16, i, null, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14161(int i) {
        m14182(58, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14162() {
        m14137(176);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14163(int i) {
        m14182(25, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14164(String str, String str2, String str3) {
        m14185(185, str, str2, str3, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14165(int i) {
        m14182(21, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m14166(String str, String str2, String str3) {
        m14185(184, str, str2, str3, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m14167(String str, String str2, String str3) {
        m14185(182, str, str2, str3, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m14168(String str, String str2, String str3) {
        m14185(183, str, str2, str3, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m14169(String str, String str2, String str3) {
        m14185(184, str, str2, str3, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m14170(C8597 c8597) {
        m14136(166, c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14171(int i) {
        switch (i) {
            case -1:
                m14137(2);
                break;
            case 0:
                m14137(3);
                break;
            case 1:
                m14137(4);
                break;
            case 2:
                m14137(5);
                break;
            case 3:
                m14137(6);
                break;
            case 4:
                m14137(7);
                break;
            case 5:
                m14137(8);
                break;
            default:
                if (i >= -128 && i < 127) {
                    m14160(i);
                } else if (i >= -32768 && i < 32767) {
                    C8381 c8381 = this.f23956;
                    this.f23944 = c8381.f23200;
                    c8381.m13919(17, i);
                    C8597 c8597 = this.f23949;
                    if (c8597 != null) {
                        c8597.f23964.m13898(17, i, null, null);
                    }
                } else {
                    m14138(i);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14172(C8597 c8597) {
        m14136(199, c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14173(C8597 c8597) {
        m14136(198, c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m14174(C8597 c8597) {
        m14136(153, c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m14175(C8597 c8597) {
        m14136(154, c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14176() {
        C8597 c8597 = new C8597();
        c8597.f23964 = new C8379(c8597, 1);
        C8381 c8381 = this.f23956;
        c8597.m14189(c8381.f23201, c8381.f23200);
        this.f23945.f23963 = c8597;
        this.f23945 = c8597;
        this.f23949 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14177() {
        m14137(89);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14178(C8597 c8597) {
        m14136(167, c8597);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14179() {
        m14137(96);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m14180(String str, String str2, String str3) {
        m14145(180, str, str2, str3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14181(String str, String str2, String str3) {
        m14145(178, str, str2, str3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m14182(int i, int i2) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        if (i2 < 4 && i != 169) {
            c8381.m13917((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            c8381.m13917(196);
            c8381.m13919(i, i2);
        } else {
            c8381.m13920(i, i2);
        }
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(i, i2, null, null);
        }
        int i3 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
        if (i3 > this.f23955) {
            this.f23955 = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m14183(String str) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        C8602 c8602 = this.f23942;
        C8376 c8376M14208 = c8602.m14208(8, str);
        int i = c8376M14208.f23134;
        if (i >= 256) {
            c8381.m13919(19, i);
        } else {
            c8381.m13920(18, i);
        }
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(18, 0, c8376M14208, c8602);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m14184(Number number) {
        if (number instanceof Integer) {
            m14138(number.intValue());
        } else if (number instanceof Long) {
            m14134(number.longValue());
        } else {
            C5919.m11247(number.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m14185(int i, String str, String str2, String str3, boolean z) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        int i2 = z ? 11 : 10;
        C8602 c8602 = this.f23942;
        C8376 c8376M14210 = c8602.m14210(i2, str, str2, str3);
        int i3 = c8376M14210.f23134;
        if (i == 185) {
            c8381.m13919(185, i3);
            if (c8376M14210.f23136 == 0) {
                c8376M14210.f23136 = C8601.m14201(c8376M14210.f23130);
            }
            c8381.m13920(c8376M14210.f23136 >> 2, 0);
        } else {
            c8381.m13919(i, i3);
        }
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(i, 0, c8376M14210, c8602);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m14186(int i, String str) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        C8602 c8602 = this.f23942;
        C8376 c8376M14208 = c8602.m14208(7, str);
        c8381.m13919(i, c8376M14208.f23134);
        C8597 c8597 = this.f23949;
        if (c8597 != null) {
            c8597.f23964.m13898(i, this.f23944, c8376M14208, c8602);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m14187(C8597 c8597, int[] iArr, C8597[] c8597Arr) {
        C8381 c8381 = this.f23956;
        this.f23944 = c8381.f23200;
        c8381.m13917(171);
        c8381.m13916(null, (4 - (c8381.f23200 % 4)) % 4);
        c8597.m14190(c8381, this.f23944, true);
        c8381.m13923(c8597Arr.length);
        for (int i = 0; i < c8597Arr.length; i++) {
            c8381.m13923(iArr[i]);
            c8597Arr[i].m14190(c8381, this.f23944, true);
        }
        C8597 c85972 = this.f23949;
        if (c85972 != null) {
            c85972.f23964.m13898(171, 0, null, null);
            C8597 c85973 = this.f23949;
            c85973.f23970 = new C8052(c8597, c85973.f23970);
            C8379 c8379 = c8597.f23964;
            if (c8379 != null) {
                c8597 = (C8597) c8379.f23186;
            }
            c8597.f23968 = (short) (c8597.f23968 | 2);
            for (C8597 c85974 : c8597Arr) {
                C8597 c85975 = this.f23949;
                c85975.f23970 = new C8052(c85974, c85975.f23970);
                C8379 c83792 = c85974.f23964;
                if (c83792 != null) {
                    c85974 = (C8597) c83792.f23186;
                }
                c85974.f23968 = (short) (c85974.f23968 | 2);
            }
            m14176();
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
    public final void m14188() {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p297.C8595.m14188():void");
    }
}
