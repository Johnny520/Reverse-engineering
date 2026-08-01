package androidx.compose.animation.core;

import androidx.activity.AbstractC0900;
import androidx.appcompat.app.C0960;
import androidx.collection.C1093;
import androidx.collection.C1094;
import kotlin.jvm.internal.AbstractC5227;
import p160.C8376;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1165 implements InterfaceC1168 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C0960 f1418;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float[] f1419;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float[] f1420;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public AbstractC1189 f1421;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int[] f1422 = AbstractC1205.f1577;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC1181 f1423;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractC1189 f1424;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public AbstractC1189 f1425;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float[] f1426;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractC1189 f1427;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1093 f1428;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f1429;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C1094 f1430;

    public C1165(C1094 c1094, C1093 c1093, int i, InterfaceC1181 interfaceC1181) {
        this.f1430 = c1094;
        this.f1428 = c1093;
        this.f1429 = i;
        this.f1423 = interfaceC1181;
        float[] fArr = AbstractC1205.f1576;
        this.f1426 = fArr;
        this.f1420 = fArr;
        this.f1419 = fArr;
        this.f1418 = AbstractC1205.f1575;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m1511(AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        float[] fArr;
        boolean z = this.f1418 != AbstractC1205.f1575;
        AbstractC1189 abstractC11894 = this.f1427;
        C1093 c1093 = this.f1428;
        C1094 c1094 = this.f1430;
        if (abstractC11894 == null) {
            this.f1427 = abstractC1189.mo1599();
            this.f1424 = abstractC11893.mo1599();
            int i = c1094.f1330;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = c1094.m1416(i2) / 1000.0f;
            }
            this.f1426 = fArr2;
            int i3 = c1094.f1330;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.f1422 = iArr;
        }
        if (z) {
            if (this.f1418 != AbstractC1205.f1575 && AbstractC5227.m9466(this.f1425, abstractC1189) && AbstractC5227.m9466(this.f1421, abstractC11892)) {
                return;
            }
            this.f1425 = abstractC1189;
            this.f1421 = abstractC11892;
            int iMo1600 = abstractC1189.mo1600() + (abstractC1189.mo1600() % 2);
            this.f1420 = new float[iMo1600];
            this.f1419 = new float[iMo1600];
            int i5 = c1094.f1330;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iM1416 = c1094.m1416(i6);
                C1170 c1170 = (C1170) c1093.m1393(iM1416);
                if (iM1416 == 0 && c1170 == null) {
                    fArr = new float[iMo1600];
                    for (int i7 = 0; i7 < iMo1600; i7++) {
                        fArr[i7] = abstractC1189.mo1601(i7);
                    }
                } else if (iM1416 == this.f1429 && c1170 == null) {
                    fArr = new float[iMo1600];
                    for (int i8 = 0; i8 < iMo1600; i8++) {
                        fArr[i8] = abstractC11892.mo1601(i8);
                    }
                } else {
                    c1170.getClass();
                    AbstractC1189 abstractC11895 = c1170.f1437;
                    float[] fArr4 = new float[iMo1600];
                    for (int i9 = 0; i9 < iMo1600; i9++) {
                        fArr4[i9] = abstractC11895.mo1601(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.f1418 = new C0960(this.f1422, this.f1426, fArr3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m1512(int i, int i2, boolean z) {
        InterfaceC1181 interfaceC1181;
        float f;
        C1094 c1094 = this.f1430;
        if (i >= c1094.f1330 - 1) {
            f = i2;
        } else {
            int iM1416 = c1094.m1416(i);
            int iM14162 = c1094.m1416(i + 1);
            if (i2 != iM1416) {
                int i3 = iM14162 - iM1416;
                C1170 c1170 = (C1170) this.f1428.m1393(iM1416);
                if (c1170 == null || (interfaceC1181 = c1170.f1436) == null) {
                    interfaceC1181 = this.f1423;
                }
                float f2 = i3;
                float fMo1411 = interfaceC1181.mo1411((i2 - iM1416) / f2);
                return z ? fMo1411 : ((f2 * fMo1411) + iM1416) / 1000.0f;
            }
            f = iM1416;
        }
        return f / 1000.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m1513(int i) {
        int i2;
        C1094 c1094 = this.f1430;
        int i3 = c1094.f1330;
        int i4 = 0;
        if (i3 <= 0) {
            C8376.m13331("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = c1094.f1331[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC1189 mo1003(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        AbstractC1189 abstractC11894;
        AbstractC1189 abstractC11895;
        C1190[][] c1190Arr;
        AbstractC1189 abstractC11896 = abstractC1189;
        long j2 = j / 1000000;
        int[] iArr = AbstractC1205.f1577;
        int i = this.f1429;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        C1093 c1093 = this.f1428;
        C1170 c1170 = (C1170) c1093.m1393(i2);
        if (c1170 != null) {
            return c1170.f1437;
        }
        if (i2 >= i) {
            return abstractC11892;
        }
        if (i2 <= 0) {
            return abstractC11896;
        }
        m1511(abstractC11896, abstractC11892, abstractC11893);
        AbstractC1189 abstractC11897 = this.f1427;
        abstractC11897.getClass();
        int i3 = 0;
        if (this.f1418 != AbstractC1205.f1575) {
            float fM1512 = m1512(m1513(i2), i2, false);
            float[] fArr = this.f1420;
            C1190[][] c1190Arr2 = (C1190[][]) this.f1418.f702;
            int length = c1190Arr2.length - 1;
            float f = c1190Arr2[0][0].f1514;
            float f2 = c1190Arr2[length][0].f1513;
            int length2 = fArr.length;
            if (fM1512 < f || fM1512 > f2) {
                if (fM1512 > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fM1512 - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    C1190 c1190 = c1190Arr2[length][i5];
                    boolean z = c1190.f1520;
                    float f4 = c1190.f1518;
                    float f5 = c1190.f1517;
                    if (z) {
                        float f6 = c1190.f1514;
                        float f7 = c1190.f1523;
                        float f8 = c1190.f1512;
                        c1190Arr = c1190Arr2;
                        fArr[i4] = (f5 * f3) + AbstractC0900.m706(c1190.f1510, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = c1190.f1511;
                        fArr[i4 + 1] = (f4 * f3) + AbstractC0900.m706(c1190.f1509, f10, f9, f10);
                    } else {
                        c1190Arr = c1190Arr2;
                        c1190.m1602(f);
                        fArr[i4] = (c1190.m1604() * f3) + (c1190.f1515 * c1190.f1521) + f5;
                        fArr[i4 + 1] = (c1190.m1603() * f3) + (c1190.f1519 * c1190.f1525) + f4;
                    }
                    i4 += 2;
                    i5++;
                    c1190Arr2 = c1190Arr;
                }
            } else {
                int length3 = c1190Arr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        C1190 c11902 = c1190Arr2[i6][i8];
                        if (fM1512 <= c11902.f1513) {
                            if (c11902.f1520) {
                                float f11 = c11902.f1514;
                                float f12 = c11902.f1523;
                                float f13 = c11902.f1512;
                                fArr[i7] = AbstractC0900.m706(c11902.f1510, f13, (fM1512 - f11) * f12, f13);
                                float f14 = c11902.f1511;
                                fArr[i7 + 1] = AbstractC0900.m706(c11902.f1509, f14, (fM1512 - f11) * f12, f14);
                            } else {
                                c11902.m1602(fM1512);
                                fArr[i7] = (c11902.f1515 * c11902.f1521) + c11902.f1517;
                                fArr[i7 + 1] = (c11902.f1519 * c11902.f1525) + c11902.f1518;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                abstractC11897.mo1597(fArr[i9], i9);
            }
        } else {
            int iM1513 = m1513(i2);
            float fM15122 = m1512(iM1513, i2, true);
            C1094 c1094 = this.f1430;
            C1170 c11702 = (C1170) c1093.m1393(c1094.m1416(iM1513));
            if (c11702 != null && (abstractC11895 = c11702.f1437) != null) {
                abstractC11896 = abstractC11895;
            }
            C1170 c11703 = (C1170) c1093.m1393(c1094.m1416(iM1513 + 1));
            if (c11703 == null || (abstractC11894 = c11703.f1437) == null) {
                abstractC11894 = abstractC11892;
            }
            int iMo1600 = abstractC11897.mo1600();
            for (int i10 = 0; i10 < iMo1600; i10++) {
                abstractC11897.mo1597((abstractC11894.mo1601(i10) * fM15122) + ((1.0f - fM15122) * abstractC11896.mo1601(i10)), i10);
            }
        }
        return abstractC11897;
    }

    @Override // androidx.compose.animation.core.InterfaceC1168
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo1504() {
        return this.f1429;
    }

    @Override // androidx.compose.animation.core.InterfaceC1206
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC1189 mo1006(long j, AbstractC1189 abstractC1189, AbstractC1189 abstractC11892, AbstractC1189 abstractC11893) {
        long j2 = j / 1000000;
        int[] iArr = AbstractC1205.f1577;
        long j3 = this.f1429;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return abstractC11893;
        }
        m1511(abstractC1189, abstractC11892, abstractC11893);
        AbstractC1189 abstractC11894 = this.f1424;
        abstractC11894.getClass();
        int i = 0;
        if (this.f1418 != AbstractC1205.f1575) {
            int i2 = (int) j4;
            float fM1512 = m1512(m1513(i2), i2, false);
            float[] fArr = this.f1419;
            C1190[][] c1190Arr = (C1190[][]) this.f1418.f702;
            float f = c1190Arr[0][0].f1514;
            float f2 = c1190Arr[c1190Arr.length - 1][0].f1513;
            if (fM1512 < f) {
                fM1512 = f;
            }
            if (fM1512 <= f2) {
                f2 = fM1512;
            }
            int length = fArr.length;
            boolean z = false;
            for (C1190[] c1190Arr2 : c1190Arr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    C1190 c1190 = c1190Arr2[i4];
                    if (f2 <= c1190.f1513) {
                        if (c1190.f1520) {
                            fArr[i3] = c1190.f1517;
                            fArr[i3 + 1] = c1190.f1518;
                        } else {
                            c1190.m1602(f2);
                            fArr[i3] = c1190.m1604();
                            fArr[i3 + 1] = c1190.m1603();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                abstractC11894.mo1597(fArr[i], i);
                i++;
            }
        } else {
            AbstractC1189 abstractC1189Mo1003 = mo1003((j4 - 1) * 1000000, abstractC1189, abstractC11892, abstractC11893);
            AbstractC1189 abstractC1189Mo10032 = mo1003(j4 * 1000000, abstractC1189, abstractC11892, abstractC11893);
            int iMo1600 = abstractC1189Mo1003.mo1600();
            while (i < iMo1600) {
                abstractC11894.mo1597((abstractC1189Mo1003.mo1601(i) - abstractC1189Mo10032.mo1601(i)) * 1000.0f, i);
                i++;
            }
        }
        return abstractC11894;
    }

    @Override // androidx.compose.animation.core.InterfaceC1168
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final int mo1505() {
        return 0;
    }
}
