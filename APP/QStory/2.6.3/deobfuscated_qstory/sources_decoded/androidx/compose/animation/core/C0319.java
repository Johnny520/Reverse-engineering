package androidx.compose.animation.core;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0113;
import androidx.collection.C0246;
import androidx.collection.C0247;
import kotlin.jvm.internal.AbstractC4395;
import p144.C7547;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0319 implements InterfaceC0322 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public C0113 f1073;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public float[] f1074;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public float[] f1075;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public AbstractC0343 f1076;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public int[] f1077 = AbstractC0359.f1232;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC0335 f1078;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public AbstractC0343 f1079;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public AbstractC0343 f1080;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public float[] f1081;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public AbstractC0343 f1082;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0246 f1083;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f1084;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C0247 f1085;

    public C0319(C0247 c0247, C0246 c0246, int i, InterfaceC0335 interfaceC0335) {
        this.f1085 = c0247;
        this.f1083 = c0246;
        this.f1084 = i;
        this.f1078 = interfaceC0335;
        float[] fArr = AbstractC0359.f1231;
        this.f1081 = fArr;
        this.f1075 = fArr;
        this.f1074 = fArr;
        this.f1073 = AbstractC0359.f1230;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m951(AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        float[] fArr;
        boolean z = this.f1073 != AbstractC0359.f1230;
        AbstractC0343 abstractC03434 = this.f1082;
        C0246 c0246 = this.f1083;
        C0247 c0247 = this.f1085;
        if (abstractC03434 == null) {
            this.f1082 = abstractC0343.mo1039();
            this.f1079 = abstractC03433.mo1039();
            int i = c0247.f985;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = c0247.m856(i2) / 1000.0f;
            }
            this.f1081 = fArr2;
            int i3 = c0247.f985;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.f1077 = iArr;
        }
        if (z) {
            if (this.f1073 != AbstractC0359.f1230 && AbstractC4395.m8907(this.f1080, abstractC0343) && AbstractC4395.m8907(this.f1076, abstractC03432)) {
                return;
            }
            this.f1080 = abstractC0343;
            this.f1076 = abstractC03432;
            int iMo1040 = abstractC0343.mo1040() + (abstractC0343.mo1040() % 2);
            this.f1075 = new float[iMo1040];
            this.f1074 = new float[iMo1040];
            int i5 = c0247.f985;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iM856 = c0247.m856(i6);
                C0324 c0324 = (C0324) c0246.m833(iM856);
                if (iM856 == 0 && c0324 == null) {
                    fArr = new float[iMo1040];
                    for (int i7 = 0; i7 < iMo1040; i7++) {
                        fArr[i7] = abstractC0343.mo1041(i7);
                    }
                } else if (iM856 == this.f1084 && c0324 == null) {
                    fArr = new float[iMo1040];
                    for (int i8 = 0; i8 < iMo1040; i8++) {
                        fArr[i8] = abstractC03432.mo1041(i8);
                    }
                } else {
                    c0324.getClass();
                    AbstractC0343 abstractC03435 = c0324.f1092;
                    float[] fArr4 = new float[iMo1040];
                    for (int i9 = 0; i9 < iMo1040; i9++) {
                        fArr4[i9] = abstractC03435.mo1041(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.f1073 = new C0113(this.f1077, this.f1081, fArr3);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float m952(int i, int i2, boolean z) {
        InterfaceC0335 interfaceC0335;
        float f;
        C0247 c0247 = this.f1085;
        if (i >= c0247.f985 - 1) {
            f = i2;
        } else {
            int iM856 = c0247.m856(i);
            int iM8562 = c0247.m856(i + 1);
            if (i2 != iM856) {
                int i3 = iM8562 - iM856;
                C0324 c0324 = (C0324) this.f1083.m833(iM856);
                if (c0324 == null || (interfaceC0335 = c0324.f1091) == null) {
                    interfaceC0335 = this.f1078;
                }
                float f2 = i3;
                float fMo851 = interfaceC0335.mo851((i2 - iM856) / f2);
                return z ? fMo851 : ((f2 * fMo851) + iM856) / 1000.0f;
            }
            f = iM856;
        }
        return f / 1000.0f;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m953(int i) {
        int i2;
        C0247 c0247 = this.f1085;
        int i3 = c0247.f985;
        int i4 = 0;
        if (i3 <= 0) {
            C7547.m12772("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = c0247.f986[i2];
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

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final AbstractC0343 mo443(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        AbstractC0343 abstractC03434;
        AbstractC0343 abstractC03435;
        C0344[][] c0344Arr;
        AbstractC0343 abstractC03436 = abstractC0343;
        long j2 = j / 1000000;
        int[] iArr = AbstractC0359.f1232;
        int i = this.f1084;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        C0246 c0246 = this.f1083;
        C0324 c0324 = (C0324) c0246.m833(i2);
        if (c0324 != null) {
            return c0324.f1092;
        }
        if (i2 >= i) {
            return abstractC03432;
        }
        if (i2 <= 0) {
            return abstractC03436;
        }
        m951(abstractC03436, abstractC03432, abstractC03433);
        AbstractC0343 abstractC03437 = this.f1082;
        abstractC03437.getClass();
        int i3 = 0;
        if (this.f1073 != AbstractC0359.f1230) {
            float fM952 = m952(m953(i2), i2, false);
            float[] fArr = this.f1075;
            C0344[][] c0344Arr2 = (C0344[][]) this.f1073.f357;
            int length = c0344Arr2.length - 1;
            float f = c0344Arr2[0][0].f1169;
            float f2 = c0344Arr2[length][0].f1168;
            int length2 = fArr.length;
            if (fM952 < f || fM952 > f2) {
                if (fM952 > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fM952 - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    C0344 c0344 = c0344Arr2[length][i5];
                    boolean z = c0344.f1175;
                    float f4 = c0344.f1173;
                    float f5 = c0344.f1172;
                    if (z) {
                        float f6 = c0344.f1169;
                        float f7 = c0344.f1178;
                        float f8 = c0344.f1167;
                        c0344Arr = c0344Arr2;
                        fArr[i4] = (f5 * f3) + AbstractC0053.m146(c0344.f1165, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = c0344.f1166;
                        fArr[i4 + 1] = (f4 * f3) + AbstractC0053.m146(c0344.f1164, f10, f9, f10);
                    } else {
                        c0344Arr = c0344Arr2;
                        c0344.m1042(f);
                        fArr[i4] = (c0344.m1044() * f3) + (c0344.f1170 * c0344.f1176) + f5;
                        fArr[i4 + 1] = (c0344.m1043() * f3) + (c0344.f1174 * c0344.f1180) + f4;
                    }
                    i4 += 2;
                    i5++;
                    c0344Arr2 = c0344Arr;
                }
            } else {
                int length3 = c0344Arr2.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        C0344 c03442 = c0344Arr2[i6][i8];
                        if (fM952 <= c03442.f1168) {
                            if (c03442.f1175) {
                                float f11 = c03442.f1169;
                                float f12 = c03442.f1178;
                                float f13 = c03442.f1167;
                                fArr[i7] = AbstractC0053.m146(c03442.f1165, f13, (fM952 - f11) * f12, f13);
                                float f14 = c03442.f1166;
                                fArr[i7 + 1] = AbstractC0053.m146(c03442.f1164, f14, (fM952 - f11) * f12, f14);
                            } else {
                                c03442.m1042(fM952);
                                fArr[i7] = (c03442.f1170 * c03442.f1176) + c03442.f1172;
                                fArr[i7 + 1] = (c03442.f1174 * c03442.f1180) + c03442.f1173;
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
                abstractC03437.mo1037(fArr[i9], i9);
            }
        } else {
            int iM953 = m953(i2);
            float fM9522 = m952(iM953, i2, true);
            C0247 c0247 = this.f1085;
            C0324 c03242 = (C0324) c0246.m833(c0247.m856(iM953));
            if (c03242 != null && (abstractC03435 = c03242.f1092) != null) {
                abstractC03436 = abstractC03435;
            }
            C0324 c03243 = (C0324) c0246.m833(c0247.m856(iM953 + 1));
            if (c03243 == null || (abstractC03434 = c03243.f1092) == null) {
                abstractC03434 = abstractC03432;
            }
            int iMo1040 = abstractC03437.mo1040();
            for (int i10 = 0; i10 < iMo1040; i10++) {
                abstractC03437.mo1037((abstractC03434.mo1041(i10) * fM9522) + ((1.0f - fM9522) * abstractC03436.mo1041(i10)), i10);
            }
        }
        return abstractC03437;
    }

    @Override // androidx.compose.animation.core.InterfaceC0322
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo944() {
        return this.f1084;
    }

    @Override // androidx.compose.animation.core.InterfaceC0360
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC0343 mo446(long j, AbstractC0343 abstractC0343, AbstractC0343 abstractC03432, AbstractC0343 abstractC03433) {
        long j2 = j / 1000000;
        int[] iArr = AbstractC0359.f1232;
        long j3 = this.f1084;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return abstractC03433;
        }
        m951(abstractC0343, abstractC03432, abstractC03433);
        AbstractC0343 abstractC03434 = this.f1079;
        abstractC03434.getClass();
        int i = 0;
        if (this.f1073 != AbstractC0359.f1230) {
            int i2 = (int) j4;
            float fM952 = m952(m953(i2), i2, false);
            float[] fArr = this.f1074;
            C0344[][] c0344Arr = (C0344[][]) this.f1073.f357;
            float f = c0344Arr[0][0].f1169;
            float f2 = c0344Arr[c0344Arr.length - 1][0].f1168;
            if (fM952 < f) {
                fM952 = f;
            }
            if (fM952 <= f2) {
                f2 = fM952;
            }
            int length = fArr.length;
            boolean z = false;
            for (C0344[] c0344Arr2 : c0344Arr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    C0344 c0344 = c0344Arr2[i4];
                    if (f2 <= c0344.f1168) {
                        if (c0344.f1175) {
                            fArr[i3] = c0344.f1172;
                            fArr[i3 + 1] = c0344.f1173;
                        } else {
                            c0344.m1042(f2);
                            fArr[i3] = c0344.m1044();
                            fArr[i3 + 1] = c0344.m1043();
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
                abstractC03434.mo1037(fArr[i], i);
                i++;
            }
        } else {
            AbstractC0343 abstractC0343Mo443 = mo443((j4 - 1) * 1000000, abstractC0343, abstractC03432, abstractC03433);
            AbstractC0343 abstractC0343Mo4432 = mo443(j4 * 1000000, abstractC0343, abstractC03432, abstractC03433);
            int iMo1040 = abstractC0343Mo443.mo1040();
            while (i < iMo1040) {
                abstractC03434.mo1037((abstractC0343Mo443.mo1041(i) - abstractC0343Mo4432.mo1041(i)) * 1000.0f, i);
                i++;
            }
        }
        return abstractC03434;
    }

    @Override // androidx.compose.animation.core.InterfaceC0322
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final int mo945() {
        return 0;
    }
}
