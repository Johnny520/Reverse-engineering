package p206;

import androidx.constraintlayout.core.SolverVariable$Type;
import androidx.core.util.C2185;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.Arrays;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p193.C7827;
import p203.C7880;

/* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7910 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean f21900 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7909 f21903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7827 f21908;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C7911 f21910;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f21906 = DescriptorProtos$Edition.EDITION_2023_VALUE;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f21905 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f21904 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int f21902 = 32;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public int f21901 = 32;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public boolean f21911 = false;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public boolean[] f21915 = new boolean[32];

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public int f21916 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f21913 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public int f21914 = 32;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public C7908[] f21907 = new C7908[DescriptorProtos$Edition.EDITION_2023_VALUE];

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public int f21909 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C7911[] f21912 = new C7911[32];

    public C7910() {
        m13355();
        C7827 c7827 = new C7827();
        c7827.f21371 = new C2185();
        c7827.f21369 = new C2185();
        c7827.f21370 = new C7908[32];
        this.f21908 = c7827;
        C7909 c7909 = new C7909(c7827);
        c7909.f21896 = new C7908[128];
        c7909.f21898 = new C7908[128];
        c7909.f21897 = 0;
        c7909.f21899 = new C4870(c7909, 25);
        this.f21903 = c7909;
        this.f21910 = new C7911(c7827);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static int m13347(Object obj) {
        C7908 c7908 = ((C7880) obj).f21771;
        if (c7908 != null) {
            return (int) (c7908.f21887 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m13348(C7908 c7908, C7908 c79082, int i, int i2) {
        C7911 c7911M13364 = m13364();
        C7908 c7908M13356 = m13356();
        c7908M13356.f21888 = 0;
        c7911M13364.m13369(c7908, c79082, c7908M13356, i);
        if (i2 != 8) {
            c7911M13364.f21918.m13380(m13366(i2), (int) (c7911M13364.f21918.m13376(c7908M13356) * (-1.0f)));
        }
        m13351(c7911M13364);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13349(C7908 c7908, C7908 c79082, int i, int i2) {
        if (i2 == 8 && c79082.f21891 && c7908.f21894 == -1) {
            c7908.m13338(this, c79082.f21887 + i);
            return;
        }
        C7911 c7911M13364 = m13364();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c7911M13364.f21920 = i;
        }
        C7912 c7912 = c7911M13364.f21918;
        if (z) {
            c7912.m13380(c7908, 1.0f);
            c7911M13364.f21918.m13380(c79082, -1.0f);
        } else {
            c7912.m13380(c7908, -1.0f);
            c7911M13364.f21918.m13380(c79082, 1.0f);
        }
        if (i2 != 8) {
            c7911M13364.m13370(this, i2);
        }
        m13351(c7911M13364);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13350(C7908 c7908, int i) {
        int i2 = c7908.f21894;
        if (i2 == -1) {
            c7908.m13338(this, i);
            for (int i3 = 0; i3 < this.f21904 + 1; i3++) {
                C7908 c79082 = ((C7908[]) this.f21908.f21370)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C7911 c7911M13364 = m13364();
            c7911M13364.f21921 = c7908;
            float f = i;
            c7908.f21887 = f;
            c7911M13364.f21920 = f;
            c7911M13364.f21917 = true;
            m13351(c7911M13364);
            return;
        }
        C7911 c7911 = this.f21912[i2];
        if (c7911.f21917) {
            c7911.f21920 = i;
            return;
        }
        if (c7911.f21918.m13375() == 0) {
            c7911.f21917 = true;
            c7911.f21920 = i;
            return;
        }
        C7911 c7911M133642 = m13364();
        if (i < 0) {
            c7911M133642.f21920 = i * (-1);
            c7911M133642.f21918.m13380(c7908, 1.0f);
        } else {
            c7911M133642.f21920 = i;
            c7911M133642.f21918.m13380(c7908, -1.0f);
        }
        m13351(c7911M133642);
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
    public final void m13351(p206.C7911 r18) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p206.C7910.m13351(飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏兰哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13352(C7908 c7908, C7908 c79082, int i, float f, C7908 c79083, C7908 c79084, int i2, int i3) {
        C7911 c7911M13364 = m13364();
        if (c79082 == c79083) {
            c7911M13364.f21918.m13380(c7908, 1.0f);
            c7911M13364.f21918.m13380(c79084, 1.0f);
            c7911M13364.f21918.m13380(c79082, -2.0f);
        } else {
            C7912 c7912 = c7911M13364.f21918;
            if (f == 0.5f) {
                c7912.m13380(c7908, 1.0f);
                c7911M13364.f21918.m13380(c79082, -1.0f);
                c7911M13364.f21918.m13380(c79083, -1.0f);
                c7911M13364.f21918.m13380(c79084, 1.0f);
                if (i > 0 || i2 > 0) {
                    c7911M13364.f21920 = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                c7912.m13380(c7908, -1.0f);
                c7911M13364.f21918.m13380(c79082, 1.0f);
                c7911M13364.f21920 = i;
            } else if (f >= 1.0f) {
                c7912.m13380(c79084, -1.0f);
                c7911M13364.f21918.m13380(c79083, 1.0f);
                c7911M13364.f21920 = -i2;
            } else {
                float f2 = 1.0f - f;
                c7912.m13380(c7908, f2 * 1.0f);
                c7911M13364.f21918.m13380(c79082, f2 * (-1.0f));
                c7911M13364.f21918.m13380(c79083, (-1.0f) * f);
                c7911M13364.f21918.m13380(c79084, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c7911M13364.f21920 = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            c7911M13364.m13370(this, i3);
        }
        m13351(c7911M13364);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7908 m13353(SolverVariable$Type solverVariable$Type) {
        C2185 c2185 = (C2185) this.f21908.f21369;
        int i = c2185.f6456;
        Object obj = null;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c2185.f6457;
            Object obj2 = objArr[i2];
            objArr[i2] = null;
            c2185.f6456 = i2;
            obj = obj2;
        }
        C7908 c7908 = (C7908) obj;
        if (c7908 == null) {
            c7908 = new C7908(solverVariable$Type);
            c7908.f21890 = solverVariable$Type;
        } else {
            c7908.m13339();
            c7908.f21890 = solverVariable$Type;
        }
        int i3 = this.f21909;
        int i4 = this.f21906;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            this.f21906 = i5;
            this.f21907 = (C7908[]) Arrays.copyOf(this.f21907, i5);
        }
        C7908[] c7908Arr = this.f21907;
        int i6 = this.f21909;
        this.f21909 = i6 + 1;
        c7908Arr[i6] = c7908;
        return c7908;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m13354() {
        C7827 c7827;
        int i = 0;
        while (true) {
            c7827 = this.f21908;
            C7908[] c7908Arr = (C7908[]) c7827.f21370;
            if (i >= c7908Arr.length) {
                break;
            }
            C7908 c7908 = c7908Arr[i];
            if (c7908 != null) {
                c7908.m13339();
            }
            i++;
        }
        C2185 c2185 = (C2185) c7827.f21369;
        C7908[] c7908Arr2 = this.f21907;
        int length = this.f21909;
        c2185.getClass();
        if (length > c7908Arr2.length) {
            length = c7908Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            C7908 c79082 = c7908Arr2[i2];
            int i3 = c2185.f6456;
            Object[] objArr = c2185.f6457;
            if (i3 < objArr.length) {
                objArr[i3] = c79082;
                c2185.f6456 = i3 + 1;
            }
        }
        this.f21909 = 0;
        Arrays.fill((C7908[]) c7827.f21370, (Object) null);
        this.f21904 = 0;
        C7909 c7909 = this.f21903;
        c7909.f21897 = 0;
        c7909.f21920 = 0.0f;
        this.f21916 = 1;
        for (int i4 = 0; i4 < this.f21913; i4++) {
            C7911 c7911 = this.f21912[i4];
        }
        m13355();
        this.f21913 = 0;
        this.f21910 = new C7911(c7827);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m13355() {
        for (int i = 0; i < this.f21913; i++) {
            C7911 c7911 = this.f21912[i];
            if (c7911 != null) {
                ((C2185) this.f21908.f21371).m3980(c7911);
            }
            this.f21912[i] = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7908 m13356() {
        if (this.f21916 + 1 >= this.f21901) {
            m13359();
        }
        C7908 c7908M13353 = m13353(SolverVariable$Type.SLACK);
        int i = this.f21904 + 1;
        this.f21904 = i;
        this.f21916++;
        c7908M13353.f21893 = i;
        ((C7908[]) this.f21908.f21370)[i] = c7908M13353;
        return c7908M13353;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final void m13357(C7909 c7909) {
        int i = 0;
        while (true) {
            if (i >= this.f21913) {
                break;
            }
            C7911 c7911 = this.f21912[i];
            if (c7911.f21921.f21890 != SolverVariable$Type.UNRESTRICTED) {
                float f = 0.0f;
                if (c7911.f21920 < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = -1;
                        int i4 = -1;
                        int i5 = 0;
                        int i6 = 0;
                        while (i5 < this.f21913) {
                            C7911 c79112 = this.f21912[i5];
                            if (c79112.f21921.f21890 != SolverVariable$Type.UNRESTRICTED && !c79112.f21917 && c79112.f21920 < f) {
                                int iM13375 = c79112.f21918.m13375();
                                int i7 = 0;
                                while (i7 < iM13375) {
                                    C7908 c7908M13374 = c79112.f21918.m13374(i7);
                                    float fM13376 = c79112.f21918.m13376(c7908M13374);
                                    if (fM13376 > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = c7908M13374.f21892[i8] / fM13376;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i4 = c7908M13374.f21893;
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
                            C7911 c79113 = this.f21912[i3];
                            c79113.f21921.f21894 = -1;
                            c79113.m13372(((C7908[]) this.f21908.f21370)[i4]);
                            C7908 c7908 = c79113.f21921;
                            c7908.f21894 = i3;
                            c7908.m13337(this, c79113);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f21916 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                }
            }
            i++;
        }
        m13358(c7909);
        m13365();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0093 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13358(p206.C7911 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L6:
            int r4 = r0.f21916
            if (r3 >= r4) goto L11
            boolean[] r4 = r0.f21915
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
            int r6 = r0.f21916
            int r6 = r6 * 2
            if (r4 < r6) goto L1f
            goto Lb0
        L1f:
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r6 = r1.f21921
            if (r6 == 0) goto L29
            boolean[] r7 = r0.f21915
            int r6 = r6.f21893
            r7[r6] = r5
        L29:
            boolean[] r6 = r0.f21915
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r6 = r1.mo13343(r6)
            if (r6 == 0) goto L3d
            boolean[] r7 = r0.f21915
            int r8 = r6.f21893
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
            int r11 = r0.f21913
            if (r9 >= r11) goto L97
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏兰哲[] r11 = r0.f21912
            r11 = r11[r9]
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r12 = r11.f21921
            androidx.constraintlayout.core.SolverVariable$Type r12 = r12.f21890
            androidx.constraintlayout.core.SolverVariable$Type r13 = androidx.constraintlayout.core.SolverVariable$Type.UNRESTRICTED
            if (r12 != r13) goto L56
            goto L93
        L56:
            boolean r12 = r11.f21917
            if (r12 == 0) goto L5b
            goto L93
        L5b:
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏哲兰 r12 = r11.f21918
            int r13 = r12.f21928
            if (r13 != r7) goto L62
            goto L7b
        L62:
            r14 = r2
        L63:
            if (r13 == r7) goto L7b
            int r15 = r12.f21927
            if (r14 >= r15) goto L7b
            int[] r15 = r12.f21923
            r15 = r15[r13]
            int r2 = r6.f21893
            if (r15 != r2) goto L73
            r2 = r5
            goto L7c
        L73:
            int[] r2 = r12.f21922
            r13 = r2[r13]
            int r14 = r14 + 1
            r2 = 0
            goto L63
        L7b:
            r2 = 0
        L7c:
            if (r2 == 0) goto L93
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏哲兰 r2 = r11.f21918
            float r2 = r2.m13376(r6)
            r12 = 0
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 >= 0) goto L93
            float r11 = r11.f21920
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
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏兰哲[] r2 = r0.f21912
            r2 = r2[r10]
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r5 = r2.f21921
            r5.f21894 = r7
            r2.m13372(r6)
            飘花落叶言子苏哲兰世楪.飘花落叶言子楪世兰苏哲 r5 = r2.f21921
            r5.f21894 = r10
            r5.m13337(r0, r2)
            goto Lad
        Lac:
            r3 = r5
        Lad:
            r2 = 0
            goto L13
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p206.C7910.m13358(飘花落叶言子苏哲兰世楪.飘花落叶言子楪世苏兰哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m13359() {
        int i = this.f21902 * 2;
        this.f21902 = i;
        this.f21912 = (C7911[]) Arrays.copyOf(this.f21912, i);
        C7827 c7827 = this.f21908;
        c7827.f21370 = (C7908[]) Arrays.copyOf((C7908[]) c7827.f21370, this.f21902);
        int i2 = this.f21902;
        this.f21915 = new boolean[i2];
        this.f21901 = i2;
        this.f21914 = i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m13360() {
        C7909 c7909 = this.f21903;
        if (c7909.mo13342()) {
            m13365();
            return;
        }
        if (!this.f21911) {
            m13357(c7909);
            return;
        }
        for (int i = 0; i < this.f21913; i++) {
            if (!this.f21912[i].f21917) {
                m13357(c7909);
                return;
            }
        }
        m13365();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m13361(C7911 c7911) {
        int i;
        if (c7911.f21917) {
            c7911.f21921.m13338(this, c7911.f21920);
        } else {
            C7911[] c7911Arr = this.f21912;
            int i2 = this.f21913;
            c7911Arr[i2] = c7911;
            C7908 c7908 = c7911.f21921;
            c7908.f21894 = i2;
            this.f21913 = i2 + 1;
            c7908.m13337(this, c7911);
        }
        if (this.f21905) {
            int i3 = 0;
            while (i3 < this.f21913) {
                if (this.f21912[i3] == null) {
                    System.out.println("WTF");
                }
                C7911 c79112 = this.f21912[i3];
                if (c79112 != null && c79112.f21917) {
                    c79112.f21921.m13338(this, c79112.f21920);
                    ((C2185) this.f21908.f21371).m3980(c79112);
                    this.f21912[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f21913;
                        if (i4 >= i) {
                            break;
                        }
                        C7911[] c7911Arr2 = this.f21912;
                        int i6 = i4 - 1;
                        C7911 c79113 = c7911Arr2[i4];
                        c7911Arr2[i6] = c79113;
                        C7908 c79082 = c79113.f21921;
                        if (c79082.f21894 == i4) {
                            c79082.f21894 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f21912[i5] = null;
                    }
                    this.f21913 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f21905 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m13362(C7908 c7908, C7908 c79082, int i, int i2) {
        C7911 c7911M13364 = m13364();
        C7908 c7908M13356 = m13356();
        c7908M13356.f21888 = 0;
        c7911M13364.m13368(c7908, c79082, c7908M13356, i);
        if (i2 != 8) {
            c7911M13364.f21918.m13380(m13366(i2), (int) (c7911M13364.f21918.m13376(c7908M13356) * (-1.0f)));
        }
        m13351(c7911M13364);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C7908 m13363(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f21916 + 1 >= this.f21901) {
            m13359();
        }
        if (!(obj instanceof C7880)) {
            return null;
        }
        C7880 c7880 = (C7880) obj;
        C7908 c7908 = c7880.f21771;
        if (c7908 == null) {
            c7880.m13263();
            c7908 = c7880.f21771;
        }
        int i = c7908.f21893;
        C7827 c7827 = this.f21908;
        if (i != -1 && i <= this.f21904 && ((C7908[]) c7827.f21370)[i] != null) {
            return c7908;
        }
        if (i != -1) {
            c7908.m13339();
        }
        int i2 = this.f21904 + 1;
        this.f21904 = i2;
        this.f21916++;
        c7908.f21893 = i2;
        c7908.f21890 = SolverVariable$Type.UNRESTRICTED;
        ((C7908[]) c7827.f21370)[i2] = c7908;
        return c7908;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7911 m13364() {
        Object obj;
        C7827 c7827 = this.f21908;
        C2185 c2185 = (C2185) c7827.f21371;
        int i = c2185.f6456;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = c2185.f6457;
            obj = objArr[i2];
            objArr[i2] = null;
            c2185.f6456 = i2;
        } else {
            obj = null;
        }
        C7911 c7911 = (C7911) obj;
        if (c7911 == null) {
            return new C7911(c7827);
        }
        c7911.f21921 = null;
        c7911.f21918.m13377();
        c7911.f21920 = 0.0f;
        c7911.f21917 = false;
        return c7911;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m13365() {
        for (int i = 0; i < this.f21913; i++) {
            C7911 c7911 = this.f21912[i];
            c7911.f21921.f21887 = c7911.f21920;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C7908 m13366(int i) {
        if (this.f21916 + 1 >= this.f21901) {
            m13359();
        }
        C7908 c7908M13353 = m13353(SolverVariable$Type.ERROR);
        float[] fArr = c7908M13353.f21889;
        int i2 = this.f21904 + 1;
        this.f21904 = i2;
        this.f21916++;
        c7908M13353.f21893 = i2;
        c7908M13353.f21888 = i;
        ((C7908[]) this.f21908.f21370)[i2] = c7908M13353;
        C7909 c7909 = this.f21903;
        c7909.f21899.f14160 = c7908M13353;
        Arrays.fill(fArr, 0.0f);
        fArr[c7908M13353.f21888] = 1.0f;
        c7909.m13346(c7908M13353);
        return c7908M13353;
    }
}
