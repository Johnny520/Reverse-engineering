package p313;

import com.android.p002dx.p005io.Opcodes;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;
import p246.C8882;
import p299.C9206;
import p299.C9209;
import p299.C9211;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9416 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f24274;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f24275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9423 f24278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C9416 f24279;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f24280;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C9418 f24281;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C9418 f24282;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int[] f24283;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f24284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public C9418 f24285;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public int[] f24286;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f24287;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f24288;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f24289;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public C9211 f24290;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f24291;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C9211 f24292;

    public C9416(C9423 c9423, String str, String str2, int i) {
        this.f24278 = c9423;
        this.f24277 = MethodDescription.CONSTRUCTOR_INTERNAL_NAME.equals(str) ? 262145 : 1;
        this.f24276 = c9423.m14787(str);
        this.f24275 = str;
        this.f24274 = c9423.m14787(str2);
        this.f24288 = str2;
        this.f24292 = new C9211(i);
        this.f24291 = C9422.m14779(str2) >> 2;
        C9418 c9418 = new C9418();
        this.f24282 = c9418;
        m14717(c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
    public final void m14712(long j) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        int i3 = (i + 5 + i2) & Integer.MAX_VALUE;
        C9423 c9423 = this.f24278;
        C9206[] c9206Arr = c9423.f24400;
        C9206 c9206 = c9206Arr[i3 % c9206Arr.length];
        while (true) {
            if (c9206 == null) {
                int i4 = c9423.f24399;
                C9211 c92112 = c9423.f24398;
                c92112.m14493(5);
                int i5 = c92112.f23544;
                int i6 = i5 + 8;
                if (i6 > c92112.f23545.length) {
                    c92112.m14497(8);
                }
                byte[] bArr = c92112.f23545;
                bArr[i5] = (byte) (i2 >>> 24);
                bArr[i5 + 1] = (byte) (i2 >>> 16);
                bArr[i5 + 2] = (byte) (i2 >>> 8);
                bArr[i5 + 3] = (byte) i2;
                bArr[i5 + 4] = (byte) (i >>> 24);
                bArr[i5 + 5] = (byte) (i >>> 16);
                bArr[i5 + 6] = (byte) (i >>> 8);
                bArr[i5 + 7] = (byte) i;
                c92112.f23544 = i6;
                c9423.f24399 += 2;
                C9206 c92062 = new C9206(i4, 5, null, null, null, j, i3, 1);
                c9423.m14783(c92062);
                c9206 = c92062;
            } else if (c9206.f23477 == 5 && c9206.f23479 == i3 && c9206.f23473 == j) {
                break;
            } else {
                c9206 = (C9206) c9206.f23481;
            }
        }
        c9211.m14495(20, c9206.f23478);
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(18, 0, c9206, c9423);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final void m14713(Class cls) {
        String strM14777 = AbstractC9420.m14777(cls);
        C9422 c9422M14778 = C9422.m14778(0, strM14777.length(), strM14777);
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        int i = c9422M14778.f24397;
        if (i == 12) {
            i = 10;
        }
        C9423 c9423 = this.f24278;
        C9206 c9206M14786 = i == 10 ? c9423.m14786(7, c9422M14778.f24396.substring(c9422M14778.f24395, c9422M14778.f24394)) : c9423.m14786(7, c9422M14778.m14781());
        int i2 = c9206M14786.f23478;
        if (i2 >= 256) {
            c9211.m14495(19, i2);
        } else {
            c9211.m14496(18, i2);
        }
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(18, 0, c9206M14786, c9423);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final void m14714(int i, C9418 c9418) {
        boolean z;
        C9211 c9211 = this.f24292;
        int i2 = c9211.f23544;
        this.f24280 = i2;
        int i3 = i >= 200 ? i - 33 : i;
        if ((c9418.f24304 & 4) == 0 || c9418.f24303 - i2 >= -32768) {
            if (i3 != i) {
                c9211.m14493(i);
                c9418.m14768(c9211, c9211.f23544 - 1, true);
            } else {
                c9211.m14493(i3);
                c9418.m14768(c9211, c9211.f23544 - 1, false);
            }
            z = false;
        } else {
            if (i3 == 167) {
                c9211.m14493(200);
            } else if (i3 == 168) {
                c9211.m14493(201);
            } else {
                c9211.m14493(i3 >= 198 ? i3 ^ 1 : ((i3 + 1) ^ 1) - 1);
                c9211.m14498(8);
                c9211.m14493(Opcodes.REM_INT_LIT8);
                this.f24284 = true;
                z = true;
                c9418.m14768(c9211, c9211.f23544 - 1, true);
            }
            z = false;
            c9418.m14768(c9211, c9211.f23544 - 1, true);
        }
        C9418 c94182 = this.f24285;
        if (c94182 != null) {
            c94182.f24300.m14474(i3, 0, null, null);
            C9209 c9209 = c9418.f24300;
            C9418 c94183 = c9209 == null ? c9418 : (C9418) c9209.f23530;
            c94183.f24304 = (short) (c94183.f24304 | 2);
            C9418 c94184 = this.f24285;
            c94184.f24306 = new C8882(c9418, c94184.f24306);
            C9418 c94185 = i3 != 167 ? new C9418() : null;
            if (c94185 != null) {
                if (z) {
                    c94185.f24304 = (short) (c94185.f24304 | 2);
                }
                m14717(c94185);
            }
            if (i3 == 167) {
                m14754();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final void m14715(int i) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        c9211.m14493(i);
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(i, 0, null, null);
            if ((i < 172 || i > 177) && i != 191) {
                return;
            }
            m14754();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final void m14716(int i) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        int i2 = (i + 3) & Integer.MAX_VALUE;
        C9423 c9423 = this.f24278;
        C9206[] c9206Arr = c9423.f24400;
        C9206 c9206 = c9206Arr[i2 % c9206Arr.length];
        while (true) {
            if (c9206 == null) {
                C9211 c92112 = c9423.f24398;
                c92112.m14493(3);
                c92112.m14499(i);
                int i3 = c9423.f24399;
                c9423.f24399 = i3 + 1;
                C9206 c92062 = new C9206(i3, 3, null, null, null, i, i2, 1);
                c9423.m14783(c92062);
                c9206 = c92062;
                break;
            }
            if (c9206.f23477 == 3 && c9206.f23479 == i2 && c9206.f23473 == i) {
                break;
            } else {
                c9206 = (C9206) c9206.f23481;
            }
        }
        int i4 = c9206.f23478;
        if (i4 >= 256) {
            c9211.m14495(19, i4);
        } else {
            c9211.m14496(18, i4);
        }
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(18, 0, c9206, c9423);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final void m14717(C9418 c9418) {
        boolean z = this.f24284;
        C9211 c9211 = this.f24292;
        this.f24284 = z | c9418.m14767(c9211.f23545, c9211.f23544);
        short s = c9418.f24304;
        if ((s & 1) != 0) {
            return;
        }
        C9418 c94182 = this.f24285;
        if (c94182 != null) {
            if (c9418.f24303 == c94182.f24303) {
                c94182.f24304 = (short) (c94182.f24304 | (s & 2));
                c9418.f24300 = c94182.f24300;
                return;
            }
            c94182.f24306 = new C8882(c9418, c94182.f24306);
        }
        C9418 c94183 = this.f24281;
        if (c94183 != null) {
            if (c9418.f24303 == c94183.f24303) {
                c94183.f24304 = (short) ((s & 2) | c94183.f24304);
                c9418.f24300 = c94183.f24300;
                this.f24285 = c94183;
                return;
            }
            c94183.f24299 = c9418;
        }
        this.f24281 = c9418;
        this.f24285 = c9418;
        c9418.f24300 = new C9209(c9418, 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void m14718(int i, int i2, int i3) {
        int i4 = i2 + 3 + i3;
        int[] iArr = this.f24283;
        if (iArr == null || iArr.length < i4) {
            this.f24283 = new int[i4];
        }
        int[] iArr2 = this.f24283;
        iArr2[0] = i;
        iArr2[1] = i2;
        iArr2[2] = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public final void m14719(int i, int i2) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        if (i > 255 || i2 > 127 || i2 < -128) {
            c9211.m14493(196);
            c9211.m14495(132, i);
            c9211.m14498(i2);
        } else {
            c9211.m14493(132);
            c9211.m14496(i, i2);
        }
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(132, i, null, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public final void m14720(int i, Class cls) {
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE || cls == Boolean.TYPE) {
            m14760(54, i);
            return;
        }
        if (cls == Long.TYPE) {
            m14760(55, i);
            return;
        }
        if (cls == Float.TYPE) {
            m14760(56, i);
        } else if (cls == Double.TYPE) {
            m14760(57, i);
        } else {
            m14760(58, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m14721() {
        m14715(177);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14722() {
        char c;
        int i;
        if (this.f24286 != null) {
            if (this.f24290 == null) {
                this.f24290 = new C9211(2048);
            }
            int[] iArr = this.f24283;
            boolean z = true;
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = 0;
            int i5 = this.f24289 == 0 ? iArr[0] : (iArr[0] - this.f24286[0]) - 1;
            int i6 = this.f24286[1];
            int i7 = i2 - i6;
            if (i3 == 0) {
                switch (i7) {
                    case -3:
                    case -2:
                    case -1:
                        c = 248;
                        break;
                    case 0:
                        c = i5 >= 64 ? (char) 251 : (char) 0;
                        break;
                    case 1:
                    case 2:
                    case 3:
                        c = 252;
                        break;
                    default:
                        c = 255;
                        break;
                }
            } else {
                c = (i7 == 0 && i3 == 1) ? i5 < 63 ? '@' : (char) 247 : (char) 255;
            }
            if (c != 255) {
                int i8 = 3;
                while (i4 < i6 && i4 < i2) {
                    boolean z2 = z;
                    i = 3;
                    if (this.f24283[i8] != this.f24286[i8]) {
                        c = 255;
                        if (c == 0) {
                            this.f24290.m14493(i5);
                        } else if (c == '@') {
                            this.f24290.m14493(i5 + 64);
                            m14731(i2 + 3, i2 + 4);
                        } else if (c != 247) {
                            C9211 c9211 = this.f24290;
                            if (c == 248) {
                                c9211.m14493(i7 + Opcodes.INVOKE_POLYMORPHIC_RANGE);
                                c9211.m14498(i5);
                            } else if (c == 251) {
                                c9211.m14493(Opcodes.INVOKE_POLYMORPHIC_RANGE);
                                c9211.m14498(i5);
                            } else if (c != 252) {
                                c9211.m14493(Opcodes.CONST_METHOD_TYPE);
                                c9211.m14498(i5);
                                c9211.m14498(i2);
                                int i9 = i2 + 3;
                                m14731(i, i9);
                                this.f24290.m14498(i3);
                                m14731(i9, i3 + i9);
                            } else {
                                int i10 = i;
                                c9211.m14493(i7 + Opcodes.INVOKE_POLYMORPHIC_RANGE);
                                c9211.m14498(i5);
                                m14731(i6 + i10, i2 + i10);
                            }
                        } else {
                            C9211 c92112 = this.f24290;
                            c92112.m14493(247);
                            c92112.m14498(i5);
                            m14731(i2 + 3, i2 + 4);
                        }
                        this.f24289++;
                    } else {
                        i8++;
                        i4++;
                        z = z2;
                    }
                }
                i = 3;
                if (c == 0) {
                }
                this.f24289++;
            } else {
                i = 3;
                if (c == 0) {
                }
                this.f24289++;
            }
        }
        this.f24286 = this.f24283;
        this.f24283 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void m14723(int i, String str, String str2, String str3) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        C9423 c9423 = this.f24278;
        C9206 c9206M14788 = c9423.m14788(9, str, str2, str3);
        c9211.m14495(i, c9206M14788.f23478);
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(i, 0, c9206M14788, c9423);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void m14724(int i, Class cls) {
        if (cls == Byte.TYPE || cls == Short.TYPE || cls == Integer.TYPE || cls == Character.TYPE || cls == Boolean.TYPE) {
            m14760(21, i);
            return;
        }
        if (cls == Long.TYPE) {
            m14760(22, i);
            return;
        }
        if (cls == Float.TYPE) {
            m14760(23, i);
        } else if (cls == Double.TYPE) {
            m14760(24, i);
        } else {
            m14760(25, i);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final void m14725(int i) {
        m14760(22, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void m14726() {
        m14715(9);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void m14727() {
        m14715(148);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m14728() {
        m14715(127);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void m14729(int i) {
        m14760(54, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void m14730(String str, String str2, String str3) {
        m14723(181, str, str2, str3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final void m14731(int i, int i2) {
        while (i < i2) {
            int i3 = this.f24283[i];
            C9211 c9211 = this.f24290;
            int i4 = ((-67108864) & i3) >> 26;
            C9423 c9423 = this.f24278;
            if (i4 == 0) {
                int i5 = i3 & 1048575;
                int i6 = i3 & 62914560;
                if (i6 == 4194304) {
                    c9211.m14493(i5);
                } else if (i6 == 8388608) {
                    c9211.m14493(7);
                    c9211.m14498(c9423.m14786(7, c9423.f24404[i5].f23474).f23478);
                } else if (i6 != 12582912) {
                    C6385.m11429();
                    return;
                } else {
                    c9211.m14493(8);
                    c9211.m14498((int) c9423.f24404[i5].f23473);
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
                            sb.append(c9423.f24404[i3 & 1048575].f23474);
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
                                        C6385.m11429();
                                        return;
                                }
                            } else {
                                sb.append('J');
                            }
                        }
                        c9211.m14493(7);
                        c9211.m14498(c9423.m14786(7, sb.toString()).f23478);
                    }
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final void m14732() {
        m14715(87);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m14733(String str) {
        m14764(187, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final void m14734(int i) {
        m14760(55, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m14735() {
        m14715(129);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m14736(Class cls) {
        if (cls == Long.TYPE) {
            m14715(9);
            m14715(148);
        } else if (cls == Double.TYPE) {
            m14715(14);
            m14715(151);
        } else if (cls == Float.TYPE) {
            m14715(11);
            m14715(149);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14737(String str) {
        m14764(192, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14738(int i) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        c9211.m14496(16, i);
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(16, i, null, null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m14739(int i) {
        m14760(58, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14740() {
        m14715(176);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14741(int i) {
        m14760(25, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m14742(String str, String str2, String str3) {
        m14763(185, str, str2, str3, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14743(int i) {
        m14760(21, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final void m14744(String str, String str2, String str3) {
        m14763(184, str, str2, str3, true);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final void m14745(String str, String str2, String str3) {
        m14763(182, str, str2, str3, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m14746(String str, String str2, String str3) {
        m14763(183, str, str2, str3, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final void m14747(String str, String str2, String str3) {
        m14763(184, str, str2, str3, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m14748(C9418 c9418) {
        m14714(166, c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void m14749(int i) {
        switch (i) {
            case -1:
                m14715(2);
                break;
            case 0:
                m14715(3);
                break;
            case 1:
                m14715(4);
                break;
            case 2:
                m14715(5);
                break;
            case 3:
                m14715(6);
                break;
            case 4:
                m14715(7);
                break;
            case 5:
                m14715(8);
                break;
            default:
                if (i >= -128 && i < 127) {
                    m14738(i);
                } else if (i >= -32768 && i < 32767) {
                    C9211 c9211 = this.f24292;
                    this.f24280 = c9211.f23544;
                    c9211.m14495(17, i);
                    C9418 c9418 = this.f24285;
                    if (c9418 != null) {
                        c9418.f24300.m14474(17, i, null, null);
                    }
                } else {
                    m14716(i);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m14750(C9418 c9418) {
        m14714(199, c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void m14751(C9418 c9418) {
        m14714(198, c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m14752(C9418 c9418) {
        m14714(153, c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m14753(C9418 c9418) {
        m14714(154, c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m14754() {
        C9418 c9418 = new C9418();
        c9418.f24300 = new C9209(c9418, 1);
        C9211 c9211 = this.f24292;
        c9418.m14767(c9211.f23545, c9211.f23544);
        this.f24281.f24299 = c9418;
        this.f24281 = c9418;
        this.f24285 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m14755() {
        m14715(89);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m14756(C9418 c9418) {
        m14714(167, c9418);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m14757() {
        m14715(96);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m14758(String str, String str2, String str3) {
        m14723(180, str, str2, str3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m14759(String str, String str2, String str3) {
        m14723(178, str, str2, str3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public final void m14760(int i, int i2) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        if (i2 < 4 && i != 169) {
            c9211.m14493((i < 54 ? ((i - 21) << 2) + 26 : ((i - 54) << 2) + 59) + i2);
        } else if (i2 >= 256) {
            c9211.m14493(196);
            c9211.m14495(i, i2);
        } else {
            c9211.m14496(i, i2);
        }
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(i, i2, null, null);
        }
        int i3 = (i == 22 || i == 24 || i == 55 || i == 57) ? i2 + 2 : i2 + 1;
        if (i3 > this.f24291) {
            this.f24291 = i3;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void m14761(String str) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        C9423 c9423 = this.f24278;
        C9206 c9206M14786 = c9423.m14786(8, str);
        int i = c9206M14786.f23478;
        if (i >= 256) {
            c9211.m14495(19, i);
        } else {
            c9211.m14496(18, i);
        }
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(18, 0, c9206M14786, c9423);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void m14762(Number number) {
        if (number instanceof Integer) {
            m14716(number.intValue());
        } else if (number instanceof Long) {
            m14712(number.longValue());
        } else {
            C6755.m11867(number.getClass().getName());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final void m14763(int i, String str, String str2, String str3, boolean z) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        int i2 = z ? 11 : 10;
        C9423 c9423 = this.f24278;
        C9206 c9206M14788 = c9423.m14788(i2, str, str2, str3);
        int i3 = c9206M14788.f23478;
        if (i == 185) {
            c9211.m14495(185, i3);
            if (c9206M14788.f23480 == 0) {
                c9206M14788.f23480 = C9422.m14779(c9206M14788.f23474);
            }
            c9211.m14496(c9206M14788.f23480 >> 2, 0);
        } else {
            c9211.m14495(i, i3);
        }
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(i, 0, c9206M14788, c9423);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m14764(int i, String str) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        C9423 c9423 = this.f24278;
        C9206 c9206M14786 = c9423.m14786(7, str);
        c9211.m14495(i, c9206M14786.f23478);
        C9418 c9418 = this.f24285;
        if (c9418 != null) {
            c9418.f24300.m14474(i, this.f24280, c9206M14786, c9423);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
    public final void m14765(C9418 c9418, int[] iArr, C9418[] c9418Arr) {
        C9211 c9211 = this.f24292;
        this.f24280 = c9211.f23544;
        c9211.m14493(171);
        c9211.m14492(null, (4 - (c9211.f23544 % 4)) % 4);
        c9418.m14768(c9211, this.f24280, true);
        c9211.m14499(c9418Arr.length);
        for (int i = 0; i < c9418Arr.length; i++) {
            c9211.m14499(iArr[i]);
            c9418Arr[i].m14768(c9211, this.f24280, true);
        }
        C9418 c94182 = this.f24285;
        if (c94182 != null) {
            c94182.f24300.m14474(171, 0, null, null);
            C9418 c94183 = this.f24285;
            c94183.f24306 = new C8882(c9418, c94183.f24306);
            C9209 c9209 = c9418.f24300;
            if (c9209 != null) {
                c9418 = (C9418) c9209.f23530;
            }
            c9418.f24304 = (short) (c9418.f24304 | 2);
            for (C9418 c94184 : c9418Arr) {
                C9418 c94185 = this.f24285;
                c94185.f24306 = new C8882(c94184, c94185.f24306);
                C9209 c92092 = c94184.f24300;
                if (c92092 != null) {
                    c94184 = (C9418) c92092.f23530;
                }
                c94184.f24304 = (short) (c94184.f24304 | 2);
            }
            m14754();
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
    */
    public final void m14766() {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p313.C9416.m14766():void");
    }
}
