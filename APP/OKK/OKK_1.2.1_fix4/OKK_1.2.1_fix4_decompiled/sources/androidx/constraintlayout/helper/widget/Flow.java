package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p071n.C0998c;
import p071n.C0999d;
import p071n.C1000e;
import p071n.C1001f;
import p071n.C1002g;
import p071n.C1003h;
import p073o.C1013b;
import p075p.AbstractC1052r;
import p075p.AbstractC1053s;
import p075p.C1040f;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC1053s {

    /* JADX INFO: renamed from: i */
    public C1002g f1257i;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3870a = new int[32];
        this.f3875f = new HashMap();
        this.f3872c = context;
        mo1155e(attributeSet);
    }

    @Override // p075p.AbstractC1053s, p075p.AbstractC1037c
    /* JADX INFO: renamed from: e */
    public final void mo1155e(AttributeSet attributeSet) {
        super.mo1155e(attributeSet);
        C1002g c1002g = new C1002g();
        c1002g.f3687f0 = 0;
        c1002g.f3688g0 = 0;
        c1002g.f3689h0 = 0;
        c1002g.f3690i0 = 0;
        c1002g.f3691j0 = 0;
        c1002g.f3692k0 = 0;
        c1002g.f3693l0 = false;
        c1002g.f3694m0 = 0;
        c1002g.f3695n0 = 0;
        c1002g.f3696o0 = new C1013b();
        c1002g.f3697p0 = null;
        c1002g.f3698q0 = -1;
        c1002g.f3699r0 = -1;
        c1002g.f3700s0 = -1;
        c1002g.f3701t0 = -1;
        c1002g.f3702u0 = -1;
        c1002g.f3703v0 = -1;
        c1002g.f3704w0 = 0.5f;
        c1002g.f3705x0 = 0.5f;
        c1002g.f3706y0 = 0.5f;
        c1002g.f3707z0 = 0.5f;
        c1002g.f3672A0 = 0.5f;
        c1002g.f3673B0 = 0.5f;
        c1002g.f3674C0 = 0;
        c1002g.f3675D0 = 0;
        c1002g.f3676E0 = 2;
        c1002g.f3677F0 = 2;
        c1002g.f3678G0 = 0;
        c1002g.f3679H0 = -1;
        c1002g.f3680I0 = 0;
        c1002g.f3681J0 = new ArrayList();
        c1002g.f3682K0 = null;
        c1002g.f3683L0 = null;
        c1002g.f3684M0 = null;
        c1002g.f3686O0 = 0;
        this.f1257i = c1002g;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1052r.f4051b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f1257i.f3680I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C1002g c1002g2 = this.f1257i;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1002g2.f3687f0 = dimensionPixelSize;
                    c1002g2.f3688g0 = dimensionPixelSize;
                    c1002g2.f3689h0 = dimensionPixelSize;
                    c1002g2.f3690i0 = dimensionPixelSize;
                } else if (index == 11) {
                    C1002g c1002g3 = this.f1257i;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c1002g3.f3689h0 = dimensionPixelSize2;
                    c1002g3.f3691j0 = dimensionPixelSize2;
                    c1002g3.f3692k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f1257i.f3690i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1257i.f3691j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1257i.f3687f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1257i.f3692k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1257i.f3688g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f1257i.f3678G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f1257i.f3698q0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f1257i.f3699r0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f1257i.f3700s0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f1257i.f3702u0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f1257i.f3701t0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f1257i.f3703v0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f1257i.f3704w0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f1257i.f3706y0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f1257i.f3672A0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f1257i.f3707z0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f1257i.f3673B0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f1257i.f3705x0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f1257i.f3676E0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f1257i.f3677F0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f1257i.f3674C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f1257i.f3675D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f1257i.f3679H0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f3873d = this.f1257i;
        m2517g();
    }

    @Override // p075p.AbstractC1037c
    /* JADX INFO: renamed from: f */
    public final void mo1156f(C0999d c0999d, boolean z2) {
        C1002g c1002g = this.f1257i;
        int i2 = c1002g.f3689h0;
        if (i2 > 0 || c1002g.f3690i0 > 0) {
            if (z2) {
                c1002g.f3691j0 = c1002g.f3690i0;
                c1002g.f3692k0 = i2;
            } else {
                c1002g.f3691j0 = i2;
                c1002g.f3692k0 = c1002g.f3690i0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00d4 A[EDGE_INSN: B:338:0x00d4->B:63:0x00d4 BREAK  A[LOOP:1: B:57:0x00c0->B:62:0x00d0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    @Override // p075p.AbstractC1053s
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1157h(C1002g c1002g, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int[] iArr;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        char c;
        C1001f c1001f;
        char c2;
        int i20;
        int i21;
        int iMin;
        char c3;
        int i22;
        int i23;
        int i24;
        C0999d[] c0999dArr;
        int i25;
        C0998c c0998c;
        int i26;
        int i27;
        C0999d c0999d;
        int i28;
        int iCeil;
        int iCeil2;
        boolean z2;
        C0999d c0999d2;
        int i29;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (c1002g == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (c1002g.f3714e0 <= 0) {
            int i30 = c1002g.f3691j0;
            int i31 = c1002g.f3692k0;
            int i32 = c1002g.f3687f0;
            int i33 = c1002g.f3688g0;
            int[] iArr2 = new int[2];
            int i34 = (size - i30) - i31;
            i4 = c1002g.f3680I0;
            if (i4 == 1) {
                i34 = (size2 - i32) - i33;
            }
            if (i4 != 0) {
                if (c1002g.f3698q0 == -1) {
                    c1002g.f3698q0 = 0;
                }
                if (c1002g.f3699r0 == -1) {
                    c1002g.f3699r0 = 0;
                }
            } else {
                if (c1002g.f3698q0 == -1) {
                    c1002g.f3698q0 = 0;
                }
                if (c1002g.f3699r0 == -1) {
                    c1002g.f3699r0 = 0;
                }
            }
            C0999d[] c0999dArr2 = c1002g.f3713d0;
            i5 = 0;
            i6 = 0;
            while (true) {
                i7 = c1002g.f3714e0;
                if (i5 < i7) {
                    break;
                }
                if (c1002g.f3713d0[i5].f3605V == 8) {
                    i6++;
                }
                i5++;
            }
            if (i6 <= 0) {
                c0999dArr2 = new C0999d[i7 - i6];
                int i35 = 0;
                i10 = 0;
                while (i35 < c1002g.f3714e0) {
                    C0999d c0999d3 = c1002g.f3713d0[i35];
                    int i36 = i33;
                    int i37 = i32;
                    if (c0999d3.f3605V != 8) {
                        c0999dArr2[i10] = c0999d3;
                        i10++;
                    }
                    i35++;
                    i33 = i36;
                    i32 = i37;
                }
                i8 = i33;
                i9 = i32;
            } else {
                i8 = i33;
                i9 = i32;
                i10 = i7;
            }
            C0999d[] c0999dArr3 = c0999dArr2;
            c1002g.f3685N0 = c0999dArr3;
            c1002g.f3686O0 = i10;
            i11 = c1002g.f3678G0;
            ArrayList arrayList = c1002g.f3681J0;
            if (i11 == 0) {
                if (i11 == 1) {
                    c3 = 1;
                    i22 = i31;
                    i23 = i30;
                    i17 = size2;
                    int i38 = c1002g.f3680I0;
                    if (i10 != 0) {
                        arrayList.clear();
                        int i39 = i34;
                        iArr = iArr2;
                        i18 = i8;
                        i19 = i9;
                        i12 = i22;
                        i13 = i23;
                        i16 = mode2;
                        c = 1;
                        C1001f c1001f2 = new C1001f(c1002g, i38, c1002g.f3636x, c1002g.f3637y, c1002g.f3638z, c1002g.f3584A, i39);
                        arrayList.add(c1001f2);
                        if (i38 == 0) {
                            C1001f c1001f3 = c1001f2;
                            int i40 = 0;
                            i24 = 0;
                            int i41 = 0;
                            while (i40 < i10) {
                                C0999d c0999d4 = c0999dArr3[i40];
                                int i42 = i39;
                                int iM2434D = c1002g.m2434D(c0999d4, i42);
                                if (c0999d4.f3615c0[0] == 3) {
                                    i24++;
                                }
                                int i43 = i24;
                                boolean z3 = (i41 == i42 || (c1002g.f3674C0 + i41) + iM2434D > i42) && c1001f3.f3655b != null;
                                if (!z3 && i40 > 0 && (i28 = c1002g.f3679H0) > 0 && i40 % i28 == 0) {
                                    z3 = true;
                                }
                                if (z3) {
                                    i39 = i42;
                                    i27 = size;
                                    i26 = mode;
                                    c0999d = c0999d4;
                                    C1001f c1001f4 = new C1001f(c1002g, i38, c1002g.f3636x, c1002g.f3637y, c1002g.f3638z, c1002g.f3584A, i39);
                                    c1001f4.f3667n = i40;
                                    arrayList.add(c1001f4);
                                    c1001f3 = c1001f4;
                                } else {
                                    i39 = i42;
                                    i26 = mode;
                                    i27 = size;
                                    c0999d = c0999d4;
                                    if (i40 > 0) {
                                        i41 = c1002g.f3674C0 + iM2434D + i41;
                                    }
                                    c1001f3.m2426a(c0999d);
                                    i40++;
                                    i24 = i43;
                                    size = i27;
                                    mode = i26;
                                }
                                i41 = iM2434D;
                                c1001f3.m2426a(c0999d);
                                i40++;
                                i24 = i43;
                                size = i27;
                                mode = i26;
                            }
                            i14 = mode;
                            i15 = size;
                        } else {
                            i14 = mode;
                            i15 = size;
                            C1001f c1001f5 = c1001f2;
                            int i44 = 0;
                            i24 = 0;
                            int i45 = 0;
                            while (i44 < i10) {
                                C0999d c0999d5 = c0999dArr3[i44];
                                int i46 = i39;
                                int iM2433C = c1002g.m2433C(c0999d5, i46);
                                if (c0999d5.f3615c0[1] == 3) {
                                    i24++;
                                }
                                int i47 = i24;
                                boolean z4 = (i45 == i46 || (c1002g.f3675D0 + i45) + iM2433C > i46) && c1001f5.f3655b != null;
                                if (!z4 && i44 > 0 && (i25 = c1002g.f3679H0) > 0 && i44 % i25 == 0) {
                                    z4 = true;
                                }
                                if (z4) {
                                    c0999dArr = c0999dArr3;
                                    C1001f c1001f6 = new C1001f(c1002g, i38, c1002g.f3636x, c1002g.f3637y, c1002g.f3638z, c1002g.f3584A, i46);
                                    c1001f6.f3667n = i44;
                                    arrayList.add(c1001f6);
                                    c1001f5 = c1001f6;
                                } else {
                                    c0999dArr = c0999dArr3;
                                    if (i44 > 0) {
                                        i45 = c1002g.f3675D0 + iM2433C + i45;
                                    }
                                    c1001f5.m2426a(c0999d5);
                                    i44++;
                                    i24 = i47;
                                    c0999dArr3 = c0999dArr;
                                    i39 = i46;
                                }
                                i45 = iM2433C;
                                c1001f5.m2426a(c0999d5);
                                i44++;
                                i24 = i47;
                                c0999dArr3 = c0999dArr;
                                i39 = i46;
                            }
                        }
                        int i48 = i39;
                        int size3 = arrayList.size();
                        int i49 = c1002g.f3691j0;
                        int i50 = c1002g.f3687f0;
                        int i51 = c1002g.f3692k0;
                        int i52 = c1002g.f3688g0;
                        int[] iArr3 = c1002g.f3615c0;
                        boolean z5 = iArr3[0] == 2 || iArr3[1] == 2;
                        if (i24 > 0 && z5) {
                            for (int i53 = 0; i53 < size3; i53++) {
                                C1001f c1001f7 = (C1001f) arrayList.get(i53);
                                if (i38 == 0) {
                                    c1001f7.m2430e(i48 - c1001f7.m2429d());
                                } else {
                                    c1001f7.m2430e(i48 - c1001f7.m2428c());
                                }
                            }
                        }
                        C0998c c0998c2 = c1002g.f3584A;
                        C0998c c0998c3 = c1002g.f3638z;
                        C0998c c0998c4 = c1002g.f3636x;
                        C0998c c0998c5 = c1002g.f3637y;
                        C0998c c0998c6 = c0998c2;
                        C0998c c0998c7 = c0998c3;
                        int i54 = 0;
                        int i55 = 0;
                        int i56 = 0;
                        while (i54 < size3) {
                            C0998c c0998c8 = c0998c2;
                            C1001f c1001f8 = (C1001f) arrayList.get(i54);
                            if (i38 == 0) {
                                if (i54 < size3 - 1) {
                                    c0998c6 = ((C1001f) arrayList.get(i54 + 1)).f3655b.f3637y;
                                    c0998c = c0998c3;
                                    i52 = 0;
                                } else {
                                    i52 = c1002g.f3688g0;
                                    c0998c6 = c0998c8;
                                    c0998c = c0998c3;
                                }
                                C0998c c0998c9 = c1001f8.f3655b.f3584A;
                                c1001f8.m2431f(i38, c0998c4, c0998c5, c0998c7, c0998c6, i49, i50, i51, i52, i48);
                                int iMax = Math.max(i55, c1001f8.m2429d());
                                int iM2428c = c1001f8.m2428c() + i56;
                                if (i54 > 0) {
                                    iM2428c += c1002g.f3675D0;
                                }
                                i56 = iM2428c;
                                i55 = iMax;
                                c0998c5 = c0998c9;
                                i50 = 0;
                            } else {
                                c0998c = c0998c3;
                                if (i54 < size3 - 1) {
                                    c0998c7 = ((C1001f) arrayList.get(i54 + 1)).f3655b.f3636x;
                                    i51 = 0;
                                } else {
                                    i51 = c1002g.f3692k0;
                                    c0998c7 = c0998c;
                                }
                                C0998c c0998c10 = c1001f8.f3655b.f3638z;
                                c1001f8.m2431f(i38, c0998c4, c0998c5, c0998c7, c0998c6, i49, i50, i51, i52, i48);
                                int iM2429d = c1001f8.m2429d() + i55;
                                int iMax2 = Math.max(i56, c1001f8.m2428c());
                                if (i54 > 0) {
                                    iM2429d += c1002g.f3674C0;
                                }
                                i56 = iMax2;
                                i55 = iM2429d;
                                c0998c4 = c0998c10;
                                i49 = 0;
                            }
                            i54++;
                            c0998c2 = c0998c8;
                            c0998c3 = c0998c;
                        }
                        iArr[0] = i55;
                        iArr[1] = i56;
                    }
                    c2 = 0;
                    int i57 = iArr[c2] + i13 + i12;
                    int i58 = iArr[c] + i19 + i18;
                    i20 = i14;
                    if (i20 != 1073741824) {
                    }
                    if (i21 != 1073741824) {
                    }
                    c1002g.f3694m0 = iMin;
                    c1002g.f3695n0 = iMin;
                    c1002g.m2420y(iMin);
                    c1002g.m2417v(iMin);
                    c1002g.f3693l0 = c1002g.f3714e0 <= 0 ? c : 0;
                } else if (i11 != 2) {
                    iArr = iArr2;
                    i12 = i31;
                    i13 = i30;
                    i14 = mode;
                    i15 = size;
                    i16 = mode2;
                    i17 = size2;
                    i18 = i8;
                    i19 = i9;
                    c2 = 0;
                    c = 1;
                    int i572 = iArr[c2] + i13 + i12;
                    int i582 = iArr[c] + i19 + i18;
                    i20 = i14;
                    if (i20 != 1073741824) {
                        i21 = i16;
                        iMin = i15;
                    } else {
                        if (i20 == Integer.MIN_VALUE) {
                            iMin = Math.min(i572, i15);
                        } else if (i20 == 0) {
                            iMin = i572;
                        } else {
                            i21 = i16;
                            iMin = 0;
                        }
                        i21 = i16;
                    }
                    int iMin2 = i21 != 1073741824 ? i17 : i21 == Integer.MIN_VALUE ? Math.min(i582, i17) : i21 == 0 ? i582 : 0;
                    c1002g.f3694m0 = iMin;
                    c1002g.f3695n0 = iMin2;
                    c1002g.m2420y(iMin);
                    c1002g.m2417v(iMin2);
                    c1002g.f3693l0 = c1002g.f3714e0 <= 0 ? c : 0;
                } else {
                    int i59 = c1002g.f3680I0;
                    if (i59 == 0) {
                        int i60 = c1002g.f3679H0;
                        if (i60 <= 0) {
                            int i61 = 0;
                            int i62 = 0;
                            iCeil2 = 0;
                            while (true) {
                                i22 = i31;
                                if (i61 >= i10) {
                                    break;
                                }
                                if (i61 > 0) {
                                    i62 += c1002g.f3674C0;
                                }
                                C0999d c0999d6 = c0999dArr3[i61];
                                if (c0999d6 != null) {
                                    int iM2434D2 = c1002g.m2434D(c0999d6, i34) + i62;
                                    if (iM2434D2 > i34) {
                                        break;
                                    }
                                    iCeil2++;
                                    i62 = iM2434D2;
                                }
                                i61++;
                                i31 = i22;
                            }
                        } else {
                            i22 = i31;
                            iCeil2 = i60;
                        }
                        iCeil = 0;
                    } else {
                        i22 = i31;
                        iCeil = c1002g.f3679H0;
                        if (iCeil <= 0) {
                            int i63 = 0;
                            int i64 = 0;
                            for (int i65 = 0; i65 < i10; i65++) {
                                if (i65 > 0) {
                                    i63 += c1002g.f3675D0;
                                }
                                C0999d c0999d7 = c0999dArr3[i65];
                                if (c0999d7 != null) {
                                    int iM2433C2 = c1002g.m2433C(c0999d7, i34) + i63;
                                    if (iM2433C2 > i34) {
                                        break;
                                    }
                                    i64++;
                                    i63 = iM2433C2;
                                }
                            }
                            iCeil = i64;
                        }
                        iCeil2 = 0;
                    }
                    if (c1002g.f3684M0 == null) {
                        c1002g.f3684M0 = new int[2];
                    }
                    boolean z6 = (iCeil == 0 && i59 == 1) || (iCeil2 == 0 && i59 == 0);
                    while (!z6) {
                        if (i59 == 0) {
                            z2 = z6;
                            iCeil = (int) Math.ceil(i10 / iCeil2);
                        } else {
                            z2 = z6;
                            iCeil2 = (int) Math.ceil(i10 / iCeil);
                        }
                        C0999d[] c0999dArr4 = c1002g.f3683L0;
                        if (c0999dArr4 == null || c0999dArr4.length < iCeil2) {
                            c1002g.f3683L0 = new C0999d[iCeil2];
                        } else {
                            Arrays.fill(c0999dArr4, (Object) null);
                        }
                        C0999d[] c0999dArr5 = c1002g.f3682K0;
                        if (c0999dArr5 == null || c0999dArr5.length < iCeil) {
                            c1002g.f3682K0 = new C0999d[iCeil];
                        } else {
                            Arrays.fill(c0999dArr5, (Object) null);
                        }
                        for (int i66 = 0; i66 < iCeil2; i66++) {
                            int i67 = 0;
                            while (i67 < iCeil) {
                                int i68 = (i67 * iCeil2) + i66;
                                int i69 = i30;
                                if (i59 == 1) {
                                    i68 = (i66 * iCeil) + i67;
                                }
                                int i70 = i68;
                                if (i70 < c0999dArr3.length && (c0999d2 = c0999dArr3[i70]) != null) {
                                    int iM2434D3 = c1002g.m2434D(c0999d2, i34);
                                    i29 = size2;
                                    C0999d c0999d8 = c1002g.f3683L0[i66];
                                    if (c0999d8 == null || c0999d8.m2407l() < iM2434D3) {
                                        c1002g.f3683L0[i66] = c0999d2;
                                    }
                                    int iM2433C3 = c1002g.m2433C(c0999d2, i34);
                                    C0999d c0999d9 = c1002g.f3682K0[i67];
                                    if (c0999d9 == null || c0999d9.m2404i() < iM2433C3) {
                                        c1002g.f3682K0[i67] = c0999d2;
                                    }
                                } else {
                                    i29 = size2;
                                }
                                i67++;
                                i30 = i69;
                                size2 = i29;
                            }
                        }
                        int i71 = i30;
                        int i72 = size2;
                        int iM2434D4 = 0;
                        for (int i73 = 0; i73 < iCeil2; i73++) {
                            C0999d c0999d10 = c1002g.f3683L0[i73];
                            if (c0999d10 != null) {
                                if (i73 > 0) {
                                    iM2434D4 += c1002g.f3674C0;
                                }
                                iM2434D4 = c1002g.m2434D(c0999d10, i34) + iM2434D4;
                            }
                        }
                        int iM2433C4 = 0;
                        for (int i74 = 0; i74 < iCeil; i74++) {
                            C0999d c0999d11 = c1002g.f3682K0[i74];
                            if (c0999d11 != null) {
                                if (i74 > 0) {
                                    iM2433C4 += c1002g.f3675D0;
                                }
                                iM2433C4 = c1002g.m2433C(c0999d11, i34) + iM2433C4;
                            }
                        }
                        iArr2[0] = iM2434D4;
                        iArr2[1] = iM2433C4;
                        if (i59 == 0) {
                            if (iM2434D4 > i34 && iCeil2 > 1) {
                                iCeil2--;
                                z6 = z2;
                            }
                            z6 = true;
                        } else {
                            if (iM2433C4 > i34 && iCeil > 1) {
                                iCeil--;
                                z6 = z2;
                            }
                            z6 = true;
                        }
                        i30 = i71;
                        size2 = i72;
                    }
                    i23 = i30;
                    i17 = size2;
                    c3 = 1;
                    int[] iArr4 = c1002g.f3684M0;
                    iArr4[0] = iCeil2;
                    iArr4[1] = iCeil;
                }
                c = c3;
                iArr = iArr2;
                i14 = mode;
                i15 = size;
                i16 = mode2;
                i12 = i22;
                i18 = i8;
                i19 = i9;
                i13 = i23;
                c2 = 0;
                int i5722 = iArr[c2] + i13 + i12;
                int i5822 = iArr[c] + i19 + i18;
                i20 = i14;
                if (i20 != 1073741824) {
                }
                if (i21 != 1073741824) {
                }
                c1002g.f3694m0 = iMin;
                c1002g.f3695n0 = iMin2;
                c1002g.m2420y(iMin);
                c1002g.m2417v(iMin2);
                c1002g.f3693l0 = c1002g.f3714e0 <= 0 ? c : 0;
            } else {
                iArr = iArr2;
                i12 = i31;
                i13 = i30;
                i14 = mode;
                i15 = size;
                i16 = mode2;
                i17 = size2;
                i18 = i8;
                i19 = i9;
                c = 1;
                int i75 = i34;
                int i76 = c1002g.f3680I0;
                if (i10 == 0) {
                    c2 = 0;
                } else {
                    if (arrayList.size() == 0) {
                        c1001f = new C1001f(c1002g, i76, c1002g.f3636x, c1002g.f3637y, c1002g.f3638z, c1002g.f3584A, i75);
                        arrayList.add(c1001f);
                    } else {
                        c1001f = (C1001f) arrayList.get(0);
                        c1001f.f3656c = 0;
                        c1001f.f3655b = null;
                        c1001f.f3665l = 0;
                        c1001f.f3666m = 0;
                        c1001f.f3667n = 0;
                        c1001f.f3668o = 0;
                        c1001f.f3669p = 0;
                        c1001f.m2431f(i76, c1002g.f3636x, c1002g.f3637y, c1002g.f3638z, c1002g.f3584A, c1002g.f3691j0, c1002g.f3687f0, c1002g.f3692k0, c1002g.f3688g0, i75);
                    }
                    for (int i77 = 0; i77 < i10; i77++) {
                        c1001f.m2426a(c0999dArr3[i77]);
                    }
                    c2 = 0;
                    iArr[0] = c1001f.m2429d();
                    iArr[1] = c1001f.m2428c();
                }
                int i57222 = iArr[c2] + i13 + i12;
                int i58222 = iArr[c] + i19 + i18;
                i20 = i14;
                if (i20 != 1073741824) {
                }
                if (i21 != 1073741824) {
                }
                c1002g.f3694m0 = iMin;
                c1002g.f3695n0 = iMin2;
                c1002g.m2420y(iMin);
                c1002g.m2417v(iMin2);
                c1002g.f3693l0 = c1002g.f3714e0 <= 0 ? c : 0;
            }
        } else {
            C0999d c0999d12 = c1002g.f3592I;
            C1040f c1040f = c0999d12 != null ? ((C1000e) c0999d12).f3642g0 : null;
            if (c1040f == null) {
                c1002g.f3694m0 = 0;
                c1002g.f3695n0 = 0;
                c1002g.f3693l0 = false;
            } else {
                for (int i78 = 0; i78 < c1002g.f3714e0; i78++) {
                    C0999d c0999d13 = c1002g.f3713d0[i78];
                    if (c0999d13 != null && !(c0999d13 instanceof C1003h)) {
                        int iM2403h = c0999d13.m2403h(0);
                        int iM2403h2 = c0999d13.m2403h(1);
                        if (iM2403h != 3 || c0999d13.f3622j == 1 || iM2403h2 != 3 || c0999d13.f3623k == 1) {
                            if (iM2403h == 3) {
                                iM2403h = 2;
                            }
                            if (iM2403h2 == 3) {
                                iM2403h2 = 2;
                            }
                            C1013b c1013b = c1002g.f3696o0;
                            c1013b.f3724a = iM2403h;
                            c1013b.f3725b = iM2403h2;
                            c1013b.f3726c = c0999d13.m2407l();
                            c1013b.f3727d = c0999d13.m2404i();
                            c1040f.m2519a(c0999d13, c1013b);
                            c0999d13.m2420y(c1013b.f3728e);
                            c0999d13.m2417v(c1013b.f3729f);
                            int i79 = c1013b.f3730g;
                            c0999d13.f3599P = i79;
                            c0999d13.f3635w = i79 > 0;
                        }
                    }
                }
                int i302 = c1002g.f3691j0;
                int i312 = c1002g.f3692k0;
                int i322 = c1002g.f3687f0;
                int i332 = c1002g.f3688g0;
                int[] iArr22 = new int[2];
                int i342 = (size - i302) - i312;
                i4 = c1002g.f3680I0;
                if (i4 == 1) {
                }
                if (i4 != 0) {
                }
                C0999d[] c0999dArr22 = c1002g.f3713d0;
                i5 = 0;
                i6 = 0;
                while (true) {
                    i7 = c1002g.f3714e0;
                    if (i5 < i7) {
                    }
                    i5++;
                }
                if (i6 <= 0) {
                }
                C0999d[] c0999dArr32 = c0999dArr22;
                c1002g.f3685N0 = c0999dArr32;
                c1002g.f3686O0 = i10;
                i11 = c1002g.f3678G0;
                ArrayList arrayList2 = c1002g.f3681J0;
                if (i11 == 0) {
                }
            }
        }
        setMeasuredDimension(c1002g.f3694m0, c1002g.f3695n0);
    }

    @Override // p075p.AbstractC1037c, android.view.View
    public final void onMeasure(int i2, int i3) {
        mo1157h(this.f1257i, i2, i3);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f1257i.f3706y0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i2) {
        this.f1257i.f3700s0 = i2;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f1257i.f3707z0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i2) {
        this.f1257i.f3701t0 = i2;
        requestLayout();
    }

    public void setHorizontalAlign(int i2) {
        this.f1257i.f3676E0 = i2;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f1257i.f3704w0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i2) {
        this.f1257i.f3674C0 = i2;
        requestLayout();
    }

    public void setHorizontalStyle(int i2) {
        this.f1257i.f3698q0 = i2;
        requestLayout();
    }

    public void setMaxElementsWrap(int i2) {
        this.f1257i.f3679H0 = i2;
        requestLayout();
    }

    public void setOrientation(int i2) {
        this.f1257i.f3680I0 = i2;
        requestLayout();
    }

    public void setPadding(int i2) {
        C1002g c1002g = this.f1257i;
        c1002g.f3687f0 = i2;
        c1002g.f3688g0 = i2;
        c1002g.f3689h0 = i2;
        c1002g.f3690i0 = i2;
        requestLayout();
    }

    public void setPaddingBottom(int i2) {
        this.f1257i.f3688g0 = i2;
        requestLayout();
    }

    public void setPaddingLeft(int i2) {
        this.f1257i.f3691j0 = i2;
        requestLayout();
    }

    public void setPaddingRight(int i2) {
        this.f1257i.f3692k0 = i2;
        requestLayout();
    }

    public void setPaddingTop(int i2) {
        this.f1257i.f3687f0 = i2;
        requestLayout();
    }

    public void setVerticalAlign(int i2) {
        this.f1257i.f3677F0 = i2;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f1257i.f3705x0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i2) {
        this.f1257i.f3675D0 = i2;
        requestLayout();
    }

    public void setVerticalStyle(int i2) {
        this.f1257i.f3699r0 = i2;
        requestLayout();
    }

    public void setWrapMode(int i2) {
        this.f1257i.f3678G0 = i2;
        requestLayout();
    }
}
