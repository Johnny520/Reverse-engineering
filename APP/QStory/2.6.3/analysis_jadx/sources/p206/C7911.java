package p206;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.core.util.C2185;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p193.C7828;
import p203.C7881;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7911 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean f21897 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7910 f21900;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7828 f21905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7912 f21907;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21903 = DescriptorProtos$Edition.EDITION_2023_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f21902 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21901 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f21899 = 32;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f21898 = 32;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f21908 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean[] f21912 = new boolean[32];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21913 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f21910 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f21911 = 32;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C7909[] f21904 = new C7909[DescriptorProtos$Edition.EDITION_2023_VALUE];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f21906 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C7912[] f21909 = new C7912[32];

    public C7911() {
        m13383();
        C7828 c7828 = new C7828();
        c7828.f21368 = new C2185();
        c7828.f21366 = new C2185();
        c7828.f21367 = new C7909[32];
        this.f21905 = c7828;
        C7910 c7910 = new C7910(c7828);
        c7910.f21893 = new C7909[128];
        c7910.f21895 = new C7909[128];
        c7910.f21894 = 0;
        c7910.f21896 = new C4871(c7910, 25);
        this.f21900 = c7910;
        this.f21907 = new C7912(c7828);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static int m13375(Object obj) {
        C7909 c7909 = ((C7881) obj).f21768;
        if (c7909 != null) {
            return (int) (c7909.f21884 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13376(C7909 c7909, C7909 c79092, int i, int i2) {
        C7912 c7912M13392 = m13392();
        C7909 c7909M13384 = m13384();
        c7909M13384.f21885 = 0;
        c7912M13392.m13397(c7909, c79092, c7909M13384, i);
        if (i2 != 8) {
            c7912M13392.f21915.m13408(m13394(i2), (int) (c7912M13392.f21915.m13404(c7909M13384) * (-1.0f)));
        }
        m13379(c7912M13392);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13377(C7909 c7909, C7909 c79092, int i, int i2) {
        if (i2 == 8 && c79092.f21888 && c7909.f21891 == -1) {
            c7909.m13366(this, c79092.f21884 + i);
            return;
        }
        C7912 c7912M13392 = m13392();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c7912M13392.f21917 = i;
        }
        C7913 c7913 = c7912M13392.f21915;
        if (z) {
            c7913.m13408(c7909, 1.0f);
            c7912M13392.f21915.m13408(c79092, -1.0f);
        } else {
            c7913.m13408(c7909, -1.0f);
            c7912M13392.f21915.m13408(c79092, 1.0f);
        }
        if (i2 != 8) {
            c7912M13392.m13398(this, i2);
        }
        m13379(c7912M13392);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13378(C7909 c7909, int i) {
        int i2 = c7909.f21891;
        if (i2 == -1) {
            c7909.m13366(this, i);
            for (int i3 = 0; i3 < this.f21901 + 1; i3++) {
                C7909 c79092 = ((C7909[]) this.f21905.f21367)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C7912 c7912M13392 = m13392();
            c7912M13392.f21918 = c7909;
            float f = i;
            c7909.f21884 = f;
            c7912M13392.f21917 = f;
            c7912M13392.f21914 = true;
            m13379(c7912M13392);
            return;
        }
        C7912 c7912 = this.f21909[i2];
        if (c7912.f21914) {
            c7912.f21917 = i;
            return;
        }
        if (c7912.f21915.m13403() == 0) {
            c7912.f21914 = true;
            c7912.f21917 = i;
            return;
        }
        C7912 c7912M133922 = m13392();
        if (i < 0) {
            c7912M133922.f21917 = i * (-1);
            c7912M133922.f21915.m13408(c7909, 1.0f);
        } else {
            c7912M133922.f21917 = i;
            c7912M133922.f21915.m13408(c7909, -1.0f);
        }
        m13379(c7912M133922);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13379(p206.C7912 r18) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p206.C7911.m13379(飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏兰哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13380(C7909 c7909, C7909 c79092, int i, float f, C7909 c79093, C7909 c79094, int i2, int i3) {
        C7912 c7912M13392 = m13392();
        if (c79092 == c79093) {
            c7912M13392.f21915.m13408(c7909, 1.0f);
            c7912M13392.f21915.m13408(c79094, 1.0f);
            c7912M13392.f21915.m13408(c79092, -2.0f);
        } else {
            C7913 c7913 = c7912M13392.f21915;
            if (f == 0.5f) {
                c7913.m13408(c7909, 1.0f);
                c7912M13392.f21915.m13408(c79092, -1.0f);
                c7912M13392.f21915.m13408(c79093, -1.0f);
                c7912M13392.f21915.m13408(c79094, 1.0f);
                if (i > 0 || i2 > 0) {
                    c7912M13392.f21917 = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                c7913.m13408(c7909, -1.0f);
                c7912M13392.f21915.m13408(c79092, 1.0f);
                c7912M13392.f21917 = i;
            } else if (f >= 1.0f) {
                c7913.m13408(c79094, -1.0f);
                c7912M13392.f21915.m13408(c79093, 1.0f);
                c7912M13392.f21917 = -i2;
            } else {
                float f2 = 1.0f - f;
                c7913.m13408(c7909, f2 * 1.0f);
                c7912M13392.f21915.m13408(c79092, f2 * (-1.0f));
                c7912M13392.f21915.m13408(c79093, (-1.0f) * f);
                c7912M13392.f21915.m13408(c79094, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c7912M13392.f21917 = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            c7912M13392.m13398(this, i3);
        }
        m13379(c7912M13392);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7909 m13381(SolverVariable$Type solverVariable$Type) {
        C2185 c2185 = (C2185) this.f21905.f21366;
        int i = c2185.f6457;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c2185.f6458;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            c2185.f6457 = i2;
            obj = obj2;
        }
        C7909 c7909 = (C7909) obj;
        if (c7909 == null) {
            c7909 = new C7909(solverVariable$Type);
            c7909.f21887 = solverVariable$Type;
        } else {
            c7909.m13367();
            c7909.f21887 = solverVariable$Type;
        }
        int i3 = this.f21906;
        int i4 = this.f21903;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f21903 = i5;
            this.f21904 = (C7909[]) Arrays.copyOf(this.f21904, i5);
        }
        C7909[] c7909Arr = this.f21904;
        int i6 = this.f21906;
        this.f21906 = i6 + 1;
        c7909Arr[i6] = c7909;
        return c7909;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13382() {
        C7828 c7828;
        int i = 0;
        while (true) {
            c7828 = this.f21905;
            C7909[] c7909Arr = (C7909[]) c7828.f21367;
            if (i >= c7909Arr.length) {
                break;
            }
            C7909 c7909 = c7909Arr[i];
            if (c7909 != null) {
                c7909.m13367();
            }
            i++;
        }
        C2185 c2185 = (C2185) c7828.f21366;
        C7909[] c7909Arr2 = this.f21904;
        int length = this.f21906;
        c2185.getClass();
        if (length > c7909Arr2.length) {
            length = c7909Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C7909 c79092 = c7909Arr2[i2];
            int i3 = c2185.f6457;
            Object[] objArr = c2185.f6458;
            if (i3 < objArr.length) {
                objArr[i3] = c79092;
                c2185.f6457 = i3 + 1;
            }
        }
        this.f21906 = 0;
        Arrays.fill((C7909[]) c7828.f21367, (Object) null);
        this.f21901 = 0;
        C7910 c7910 = this.f21900;
        c7910.f21894 = 0;
        c7910.f21917 = 0.0f;
        this.f21913 = 1;
        for (int i4 = 0; i4 < this.f21910; i4++) {
            C7912 c7912 = this.f21909[i4];
        }
        m13383();
        this.f21910 = 0;
        this.f21907 = new C7912(c7828);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13383() {
        for (int i = 0; i < this.f21910; i++) {
            C7912 c7912 = this.f21909[i];
            if (c7912 != null) {
                ((C2185) this.f21905.f21368).m3990(c7912);
            }
            this.f21909[i] = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7909 m13384() {
        if (this.f21913 + 1 >= this.f21898) {
            m13387();
        }
        C7909 c7909M13381 = m13381(SolverVariable$Type.SLACK);
        int i = this.f21901 + 1;
        this.f21901 = i;
        this.f21913++;
        c7909M13381.f21890 = i;
        ((C7909[]) this.f21905.f21367)[i] = c7909M13381;
        return c7909M13381;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m13385(C7910 c7910) {
        int i = 0;
        while (true) {
            if (i >= this.f21910) {
                break;
            }
            C7912 c7912 = this.f21909[i];
            if (c7912.f21918.f21887 != SolverVariable$Type.UNRESTRICTED) {
                float f = 0.0f;
                if (c7912.f21917 < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.f21910) {
                            C7912 c79122 = this.f21909[i5];
                            if (c79122.f21918.f21887 != SolverVariable$Type.UNRESTRICTED && !c79122.f21914 && c79122.f21917 < f) {
                                int iM13403 = c79122.f21915.m13403();
                                int i7 = 0;
                                while (i7 < iM13403) {
                                    C7909 c7909M13402 = c79122.f21915.m13402(i7);
                                    float fM13404 = c79122.f21915.m13404(c7909M13402);
                                    if (fM13404 > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = c7909M13402.f21889[i8] / fM13404;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i4 = c7909M13402.f21890;
                                                i3 = i5;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i5++;
                            f = 0.0f;
                        }
                        if (i3 != -1) {
                            C7912 c79123 = this.f21909[i3];
                            c79123.f21918.f21891 = -1;
                            c79123.m13400(((C7909[]) this.f21905.f21367)[i4]);
                            C7909 c7909 = c79123.f21918;
                            c7909.f21891 = i3;
                            c7909.m13365(this, c79123);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f21913 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        m13386(c7910);
        m13393();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0093 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13386(p206.C7912 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.f21913
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.f21912
            r4[r3] = r2
            int r3 = r3 + 1
            goto L6
        L11:
            r3 = r2
            r4 = r3
        L13:
            if (r3 != 0) goto Lb0
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.f21913
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lb0
        L1f:
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r6 = r1.f21918
            if (r6 == 0) goto L29
            boolean[] r7 = r0.f21912
            int r6 = r6.f21890
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.f21912
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r6 = r1.mo13371(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.f21912
            int r8 = r6.f21890
            boolean r9 = r7[r8]
            if (r9 == 0) goto L3b
            goto Lb0
        L3b:
            r7[r8] = r5
        L3d:
            if (r6 == 0) goto Lac
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r2
            r10 = r7
        L45:
            int r11 = r0.f21910
            if (r9 >= r11) goto L97
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏兰哲[] r11 = r0.f21909
            r11 = r11[r9]
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r12 = r11.f21918
            androidx.constraintlayout.core.SolverVariable$Type r12 = r12.f21887
            androidx.constraintlayout.core.SolverVariable$Type r13 = androidx.constraintlayout.core.SolverVariable$Type.UNRESTRICTED
            if (r12 != r13) goto L56
            goto L93
        L56:
            boolean r12 = r11.f21914
            if (r12 == 0) goto L5b
            goto L93
        L5b:
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏哲兰 r12 = r11.f21915
            int r13 = r12.f21925
            if (r13 != r7) goto L62
            goto L7b
        L62:
            r14 = r2
        L63:
            if (r13 == r7) goto L7b
            int r15 = r12.f21924
            if (r14 >= r15) goto L7b
            int[] r15 = r12.f21920
            r15 = r15[r13]
            int r2 = r6.f21890
            if (r15 != r2) goto L73
            r2 = r5
            goto L7c
        L73:
            int[] r2 = r12.f21919
            r13 = r2[r13]
            int r14 = r14 + 1
            r2 = 0
            goto L63
        L7b:
            r2 = 0
        L7c:
            if (r2 == 0) goto L93
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏哲兰 r2 = r11.f21915
            float r2 = r2.m13404(r6)
            r12 = 0
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 >= 0) goto L93
            float r11 = r11.f21917
            float r11 = -r11
            float r11 = r11 / r2
            int r2 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r2 >= 0) goto L93
            r10 = r9
            r8 = r11
        L93:
            int r9 = r9 + 1
            r2 = 0
            goto L45
        L97:
            if (r10 <= r7) goto Lad
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏兰哲[] r2 = r0.f21909
            r2 = r2[r10]
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r5 = r2.f21918
            r5.f21891 = r7
            r2.m13400(r6)
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r5 = r2.f21918
            r5.f21891 = r10
            r5.m13365(r0, r2)
            goto Lad
        Lac:
            r3 = r5
        Lad:
            r2 = 0
            goto L13
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p206.C7911.m13386(飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏兰哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13387() {
        int i = this.f21899 * 2;
        this.f21899 = i;
        this.f21909 = (C7912[]) Arrays.copyOf(this.f21909, i);
        C7828 c7828 = this.f21905;
        c7828.f21367 = (C7909[]) Arrays.copyOf((C7909[]) c7828.f21367, this.f21899);
        int i2 = this.f21899;
        this.f21912 = new boolean[i2];
        this.f21898 = i2;
        this.f21911 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13388() {
        C7910 c7910 = this.f21900;
        if (c7910.mo13370()) {
            m13393();
            return;
        }
        if (!this.f21908) {
            m13385(c7910);
            return;
        }
        for (int i = 0; i < this.f21910; i++) {
            if (!this.f21909[i].f21914) {
                m13385(c7910);
                return;
            }
        }
        m13393();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13389(C7912 c7912) {
        int i;
        if (c7912.f21914) {
            c7912.f21918.m13366(this, c7912.f21917);
        } else {
            C7912[] c7912Arr = this.f21909;
            int i2 = this.f21910;
            c7912Arr[i2] = c7912;
            C7909 c7909 = c7912.f21918;
            c7909.f21891 = i2;
            this.f21910 = i2 + 1;
            c7909.m13365(this, c7912);
        }
        if (this.f21902) {
            int i3 = 0;
            while (i3 < this.f21910) {
                if (this.f21909[i3] == null) {
                    System.out.println("WTF");
                }
                C7912 c79122 = this.f21909[i3];
                if (c79122 != null && c79122.f21914) {
                    c79122.f21918.m13366(this, c79122.f21917);
                    ((C2185) this.f21905.f21368).m3990(c79122);
                    this.f21909[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f21910;
                        if (i4 >= i) {
                            break;
                        }
                        C7912[] c7912Arr2 = this.f21909;
                        int i6 = i4 - 1;
                        C7912 c79123 = c7912Arr2[i4];
                        c7912Arr2[i6] = c79123;
                        C7909 c79092 = c79123.f21918;
                        if (c79092.f21891 == i4) {
                            c79092.f21891 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f21909[i5] = null;
                    }
                    this.f21910 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f21902 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13390(C7909 c7909, C7909 c79092, int i, int i2) {
        C7912 c7912M13392 = m13392();
        C7909 c7909M13384 = m13384();
        c7909M13384.f21885 = 0;
        c7912M13392.m13396(c7909, c79092, c7909M13384, i);
        if (i2 != 8) {
            c7912M13392.f21915.m13408(m13394(i2), (int) (c7912M13392.f21915.m13404(c7909M13384) * (-1.0f)));
        }
        m13379(c7912M13392);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7909 m13391(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f21913 + 1 >= this.f21898) {
            m13387();
        }
        if (!(obj instanceof C7881)) {
            return null;
        }
        C7881 c7881 = (C7881) obj;
        C7909 c7909 = c7881.f21768;
        if (c7909 == null) {
            c7881.m13291();
            c7909 = c7881.f21768;
        }
        int i = c7909.f21890;
        C7828 c7828 = this.f21905;
        if (i != -1 && i <= this.f21901 && ((C7909[]) c7828.f21367)[i] != null) {
            return c7909;
        }
        if (i != -1) {
            c7909.m13367();
        }
        int i2 = this.f21901 + 1;
        this.f21901 = i2;
        this.f21913++;
        c7909.f21890 = i2;
        c7909.f21887 = SolverVariable$Type.UNRESTRICTED;
        ((C7909[]) c7828.f21367)[i2] = c7909;
        return c7909;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7912 m13392() {
        Object obj;
        C7828 c7828 = this.f21905;
        C2185 c2185 = (C2185) c7828.f21368;
        int i = c2185.f6457;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c2185.f6458;
            obj = objArr[i2];
            objArr[i2] = null;
            c2185.f6457 = i2;
        } else {
            obj = null;
        }
        C7912 c7912 = (C7912) obj;
        if (c7912 == null) {
            return new C7912(c7828);
        }
        c7912.f21918 = null;
        c7912.f21915.m13405();
        c7912.f21917 = 0.0f;
        c7912.f21914 = false;
        return c7912;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13393() {
        for (int i = 0; i < this.f21910; i++) {
            C7912 c7912 = this.f21909[i];
            c7912.f21918.f21884 = c7912.f21917;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C7909 m13394(int i) {
        if (this.f21913 + 1 >= this.f21898) {
            m13387();
        }
        C7909 c7909M13381 = m13381(SolverVariable$Type.ERROR);
        float[] fArr = c7909M13381.f21886;
        int i2 = this.f21901 + 1;
        this.f21901 = i2;
        this.f21913++;
        c7909M13381.f21890 = i2;
        c7909M13381.f21885 = i;
        ((C7909[]) this.f21905.f21367)[i2] = c7909M13381;
        C7910 c7910 = this.f21900;
        c7910.f21896.f14164 = c7909M13381;
        Arrays.fill(fArr, 0.0f);
        fArr[c7909M13381.f21885] = 1.0f;
        c7910.m13374(c7909M13381);
        return c7909M13381;
    }
}
