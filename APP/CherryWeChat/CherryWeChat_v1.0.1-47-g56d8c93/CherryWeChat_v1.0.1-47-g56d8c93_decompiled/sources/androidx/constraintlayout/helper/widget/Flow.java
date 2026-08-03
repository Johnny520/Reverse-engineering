package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p000.AbstractC0639Ou;
import p000.AbstractC0960WE;
import p000.C0178E5;
import p000.C0325Hh;
import p000.C0368Ih;
import p000.C1259cb;
import p000.C1496hb;
import p000.C2150kk;
import p000.C2454rb;
import p000.C2497sb;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends AbstractC0960WE {

    /* JADX INFO: renamed from: j */
    public final C0368Ih f3853j;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4872a = new int[32];
        this.f4878g = new HashMap();
        this.f4874c = context;
        super.mo1835g(attributeSet);
        C0368Ih c0368Ih = new C0368Ih();
        c0368Ih.f1276s0 = 0;
        c0368Ih.f1277t0 = 0;
        c0368Ih.f1278u0 = 0;
        c0368Ih.f1279v0 = 0;
        c0368Ih.f1280w0 = 0;
        c0368Ih.f1281x0 = 0;
        c0368Ih.f1282y0 = false;
        c0368Ih.f1283z0 = 0;
        c0368Ih.f1248A0 = 0;
        c0368Ih.f1249B0 = new C0178E5();
        c0368Ih.f1250C0 = null;
        c0368Ih.f1251D0 = -1;
        c0368Ih.f1252E0 = -1;
        c0368Ih.f1253F0 = -1;
        c0368Ih.f1254G0 = -1;
        c0368Ih.f1255H0 = -1;
        c0368Ih.f1256I0 = -1;
        c0368Ih.f1257J0 = 0.5f;
        c0368Ih.f1258K0 = 0.5f;
        c0368Ih.f1259L0 = 0.5f;
        c0368Ih.f1260M0 = 0.5f;
        c0368Ih.f1261N0 = 0.5f;
        c0368Ih.f1262O0 = 0.5f;
        c0368Ih.f1263P0 = 0;
        c0368Ih.f1264Q0 = 0;
        c0368Ih.f1265R0 = 2;
        c0368Ih.f1266S0 = 2;
        c0368Ih.f1267T0 = 0;
        c0368Ih.f1268U0 = -1;
        c0368Ih.f1269V0 = 0;
        c0368Ih.f1270W0 = new ArrayList();
        c0368Ih.f1271X0 = null;
        c0368Ih.f1272Y0 = null;
        c0368Ih.f1273Z0 = null;
        c0368Ih.f1275b1 = 0;
        this.f3853j = c0368Ih;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0639Ou.f2035b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f3853j.f1269V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C0368Ih c0368Ih2 = this.f3853j;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0368Ih2.f1276s0 = dimensionPixelSize;
                    c0368Ih2.f1277t0 = dimensionPixelSize;
                    c0368Ih2.f1278u0 = dimensionPixelSize;
                    c0368Ih2.f1279v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C0368Ih c0368Ih3 = this.f3853j;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0368Ih3.f1278u0 = dimensionPixelSize2;
                    c0368Ih3.f1280w0 = dimensionPixelSize2;
                    c0368Ih3.f1281x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f3853j.f1279v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f3853j.f1280w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f3853j.f1276s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f3853j.f1281x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f3853j.f1277t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f3853j.f1267T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f3853j.f1251D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f3853j.f1252E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f3853j.f1253F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f3853j.f1255H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f3853j.f1254G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f3853j.f1256I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f3853j.f1257J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f3853j.f1259L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f3853j.f1261N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f3853j.f1260M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f3853j.f1262O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f3853j.f1258K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f3853j.f1265R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f3853j.f1266S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f3853j.f1263P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f3853j.f1264Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f3853j.f1268U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f4875d = this.f3853j;
        m2654i();
    }

    @Override // p000.AbstractC1364eb
    /* JADX INFO: renamed from: h */
    public final void mo2120h(C2454rb c2454rb, boolean z) {
        C0368Ih c0368Ih = this.f3853j;
        int i = c0368Ih.f1278u0;
        if (i > 0 || c0368Ih.f1279v0 > 0) {
            if (z) {
                c0368Ih.f1280w0 = c0368Ih.f1279v0;
                c0368Ih.f1281x0 = i;
            } else {
                c0368Ih.f1280w0 = i;
                c0368Ih.f1281x0 = c0368Ih.f1279v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x010f A[EDGE_INSN: B:430:0x010f->B:63:0x010f BREAK  A[LOOP:1: B:57:0x00f8->B:62:0x010a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    @Override // p000.AbstractC0960WE
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1836j(C0368Ih c0368Ih, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C2454rb[] c2454rbArr;
        int i11;
        int i12;
        int[] iArr;
        int i13;
        int i14;
        int i15;
        int i16;
        C0325Hh c0325Hh;
        char c;
        char c2;
        int i17;
        int i18;
        int i19;
        int iCeil;
        int iCeil2;
        Object obj;
        C2454rb c2454rb;
        char c3;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        C1259cb c1259cb;
        C1259cb c1259cb2;
        C1259cb c1259cb3;
        ArrayList arrayList;
        int i26;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c0368Ih == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = c0368Ih.f8637p0;
        C1259cb c1259cb4 = c0368Ih.f8589J;
        C1259cb c1259cb5 = c0368Ih.f8588I;
        C1259cb c1259cb6 = c0368Ih.f8590K;
        C1259cb c1259cb7 = c0368Ih.f8591L;
        ArrayList arrayList2 = c0368Ih.f1270W0;
        if (c0368Ih.f8966r0 > 0) {
            C0178E5 c0178e5 = c0368Ih.f1249B0;
            C2454rb c2454rb2 = c0368Ih.f8599T;
            C1496hb c1496hb = c2454rb2 != null ? ((C2497sb) c2454rb2).f8778u0 : null;
            if (c1496hb == null) {
                c0368Ih.f1283z0 = 0;
                c0368Ih.f1248A0 = 0;
                c0368Ih.f1282y0 = false;
            } else {
                int i27 = 0;
                while (i27 < c0368Ih.f8966r0) {
                    C2454rb c2454rb3 = c0368Ih.f8965q0[i27];
                    if (c2454rb3 == null) {
                        c1259cb = c1259cb5;
                    } else {
                        c1259cb = c1259cb5;
                        if (!(c2454rb3 instanceof C2150kk)) {
                            c1259cb2 = c1259cb6;
                            int iM4932j = c2454rb3.m4932j(0);
                            c1259cb3 = c1259cb7;
                            int iM4932j2 = c2454rb3.m4932j(1);
                            arrayList = arrayList2;
                            if (iM4932j == 3) {
                                i26 = i27;
                                if (c2454rb3.f8639r == 1 || iM4932j2 != 3 || c2454rb3.f8640s == 1) {
                                }
                            } else {
                                i26 = i27;
                            }
                            if (iM4932j == 3) {
                                iM4932j = 2;
                            }
                            if (iM4932j2 == 3) {
                                iM4932j2 = 2;
                            }
                            c0178e5.f520a = iM4932j;
                            c0178e5.f521b = iM4932j2;
                            c0178e5.f522c = c2454rb3.m4937q();
                            c0178e5.f523d = c2454rb3.m4933k();
                            c1496hb.m2865b(c2454rb3, c0178e5);
                            c2454rb3.m4924O(c0178e5.f524e);
                            c2454rb3.m4921L(c0178e5.f525f);
                            c2454rb3.m4918I(c0178e5.f526g);
                        }
                        i27 = i26 + 1;
                        c1259cb5 = c1259cb;
                        c1259cb6 = c1259cb2;
                        c1259cb7 = c1259cb3;
                        arrayList2 = arrayList;
                    }
                    c1259cb2 = c1259cb6;
                    c1259cb3 = c1259cb7;
                    arrayList = arrayList2;
                    i26 = i27;
                    i27 = i26 + 1;
                    c1259cb5 = c1259cb;
                    c1259cb6 = c1259cb2;
                    c1259cb7 = c1259cb3;
                    arrayList2 = arrayList;
                }
                C1259cb c1259cb8 = c1259cb5;
                C1259cb c1259cb9 = c1259cb6;
                C1259cb c1259cb10 = c1259cb7;
                ArrayList arrayList3 = arrayList2;
                int i28 = c0368Ih.f1280w0;
                int i29 = c0368Ih.f1281x0;
                i3 = c0368Ih.f1276s0;
                int i30 = c0368Ih.f1277t0;
                int[] iArr3 = new int[2];
                int i31 = (size - i28) - i29;
                i4 = c0368Ih.f1269V0;
                if (i4 == 1) {
                    i31 = (size2 - i3) - i30;
                }
                int i32 = i31;
                if (i4 != 0) {
                    if (c0368Ih.f1251D0 == -1) {
                        i25 = 0;
                        c0368Ih.f1251D0 = 0;
                    } else {
                        i25 = 0;
                    }
                    i5 = i29;
                    if (c0368Ih.f1252E0 == -1) {
                        c0368Ih.f1252E0 = i25;
                    }
                } else {
                    i5 = i29;
                    if (c0368Ih.f1251D0 == -1) {
                        c0368Ih.f1251D0 = 0;
                    }
                    if (c0368Ih.f1252E0 == -1) {
                        c0368Ih.f1252E0 = 0;
                    }
                }
                C2454rb[] c2454rbArr2 = c0368Ih.f8965q0;
                i6 = 0;
                i7 = 0;
                while (true) {
                    i8 = c0368Ih.f8966r0;
                    i9 = i3;
                    if (i6 < i8) {
                        break;
                    }
                    if (c0368Ih.f8965q0[i6].f8619g0 == 8) {
                        i7++;
                    }
                    i6++;
                    i3 = i9;
                }
                if (i7 <= 0) {
                    c2454rbArr = new C2454rb[i8 - i7];
                    int i33 = 0;
                    int i34 = 0;
                    while (i33 < c0368Ih.f8966r0) {
                        C2454rb c2454rb4 = c0368Ih.f8965q0[i33];
                        C2454rb[] c2454rbArr3 = c2454rbArr;
                        if (c2454rb4.f8619g0 != 8) {
                            c2454rbArr3[i34] = c2454rb4;
                            i34++;
                        }
                        i33++;
                        c2454rbArr = c2454rbArr3;
                    }
                    i10 = i34;
                } else {
                    i10 = i8;
                    c2454rbArr = c2454rbArr2;
                }
                c0368Ih.f1274a1 = c2454rbArr;
                c0368Ih.f1275b1 = i10;
                i11 = c0368Ih.f1267T0;
                if (i11 != 0) {
                    C2454rb[] c2454rbArr4 = c2454rbArr;
                    int i35 = i10;
                    i12 = i30;
                    iArr = iArr3;
                    i13 = size2;
                    i14 = i28;
                    i15 = i5;
                    i16 = i9;
                    int i36 = c0368Ih.f1269V0;
                    if (i35 != 0) {
                        if (arrayList3.size() == 0) {
                            c0325Hh = new C0325Hh(c0368Ih, i36, c0368Ih.f8588I, c0368Ih.f8589J, c0368Ih.f8590K, c0368Ih.f8591L, i32);
                            arrayList3.add(c0325Hh);
                        } else {
                            C0325Hh c0325Hh2 = (C0325Hh) arrayList3.get(0);
                            c0325Hh2.f1092c = 0;
                            c0325Hh2.f1091b = null;
                            c0325Hh2.f1101l = 0;
                            c0325Hh2.f1102m = 0;
                            c0325Hh2.f1103n = 0;
                            c0325Hh2.f1104o = 0;
                            c0325Hh2.f1105p = 0;
                            c0325Hh2.m693f(i36, c0368Ih.f8588I, c0368Ih.f8589J, c0368Ih.f8590K, c0368Ih.f8591L, c0368Ih.f1280w0, c0368Ih.f1276s0, c0368Ih.f1281x0, c0368Ih.f1277t0, i32);
                            c0325Hh = c0325Hh2;
                        }
                        for (int i37 = 0; i37 < i35; i37++) {
                            c0325Hh.m688a(c2454rbArr4[i37]);
                        }
                        c = 0;
                        iArr[0] = c0325Hh.m691d();
                        c2 = 1;
                        iArr[1] = c0325Hh.m690c();
                        int i38 = iArr[c] + i14 + i15;
                        int i39 = iArr[c2] + i16 + i12;
                        if (mode != 1073741824) {
                        }
                        if (mode2 != 1073741824) {
                        }
                        c0368Ih.f1283z0 = size;
                        c0368Ih.f1248A0 = iMin;
                        c0368Ih.m4924O(size);
                        c0368Ih.m4921L(iMin);
                        c0368Ih.f1282y0 = c0368Ih.f8966r0 <= 0 ? c2 : 0;
                    }
                } else if (i11 != 1) {
                    if (i11 == 2) {
                        C2454rb[] c2454rbArr5 = c2454rbArr;
                        int i40 = i10;
                        i12 = i30;
                        iArr = iArr3;
                        i13 = size2;
                        i14 = i28;
                        i15 = i5;
                        i16 = i9;
                        int i41 = c0368Ih.f1269V0;
                        if (i41 == 0) {
                            int i42 = c0368Ih.f1268U0;
                            if (i42 <= 0) {
                                int i43 = 0;
                                iCeil2 = 0;
                                for (int i44 = 0; i44 < i40; i44++) {
                                    if (i44 > 0) {
                                        i43 += c0368Ih.f1263P0;
                                    }
                                    C2454rb c2454rb5 = c2454rbArr5[i44];
                                    if (c2454rb5 != null) {
                                        int iM811U = c0368Ih.m811U(c2454rb5, i32) + i43;
                                        if (iM811U > i32) {
                                            break;
                                        }
                                        iCeil2++;
                                        i43 = iM811U;
                                    }
                                }
                            } else {
                                iCeil2 = i42;
                            }
                            iCeil = 0;
                        } else {
                            iCeil = c0368Ih.f1268U0;
                            if (iCeil <= 0) {
                                int i45 = 0;
                                int i46 = 0;
                                for (int i47 = 0; i47 < i40; i47++) {
                                    if (i47 > 0) {
                                        i45 += c0368Ih.f1264Q0;
                                    }
                                    C2454rb c2454rb6 = c2454rbArr5[i47];
                                    if (c2454rb6 != null) {
                                        int iM810T = c0368Ih.m810T(c2454rb6, i32) + i45;
                                        if (iM810T > i32) {
                                            break;
                                        }
                                        i46++;
                                        i45 = iM810T;
                                    }
                                }
                                iCeil = i46;
                            }
                            iCeil2 = 0;
                        }
                        if (c0368Ih.f1273Z0 == null) {
                            c0368Ih.f1273Z0 = new int[2];
                        }
                        boolean z = (iCeil == 0 && i41 == 1) || (iCeil2 == 0 && i41 == 0);
                        while (!z) {
                            if (i41 == 0) {
                                iCeil = (int) Math.ceil(i40 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i40 / iCeil);
                            }
                            C2454rb[] c2454rbArr6 = c0368Ih.f1272Y0;
                            if (c2454rbArr6 == null || c2454rbArr6.length < iCeil2) {
                                obj = null;
                                c0368Ih.f1272Y0 = new C2454rb[iCeil2];
                            } else {
                                obj = null;
                                Arrays.fill(c2454rbArr6, (Object) null);
                            }
                            C2454rb[] c2454rbArr7 = c0368Ih.f1271X0;
                            if (c2454rbArr7 == null || c2454rbArr7.length < iCeil) {
                                c0368Ih.f1271X0 = new C2454rb[iCeil];
                            } else {
                                Arrays.fill(c2454rbArr7, obj);
                            }
                            for (int i48 = 0; i48 < iCeil2; i48++) {
                                for (int i49 = 0; i49 < iCeil; i49++) {
                                    int i50 = (i49 * iCeil2) + i48;
                                    if (i41 == 1) {
                                        i50 = (i48 * iCeil) + i49;
                                    }
                                    if (i50 < c2454rbArr5.length && (c2454rb = c2454rbArr5[i50]) != null) {
                                        int iM811U2 = c0368Ih.m811U(c2454rb, i32);
                                        C2454rb c2454rb7 = c0368Ih.f1272Y0[i48];
                                        if (c2454rb7 == null || c2454rb7.m4937q() < iM811U2) {
                                            c0368Ih.f1272Y0[i48] = c2454rb;
                                        }
                                        int iM810T2 = c0368Ih.m810T(c2454rb, i32);
                                        C2454rb c2454rb8 = c0368Ih.f1271X0[i49];
                                        if (c2454rb8 == null || c2454rb8.m4933k() < iM810T2) {
                                            c0368Ih.f1271X0[i49] = c2454rb;
                                        }
                                    }
                                }
                            }
                            int iM811U3 = 0;
                            for (int i51 = 0; i51 < iCeil2; i51++) {
                                C2454rb c2454rb9 = c0368Ih.f1272Y0[i51];
                                if (c2454rb9 != null) {
                                    if (i51 > 0) {
                                        iM811U3 += c0368Ih.f1263P0;
                                    }
                                    iM811U3 = c0368Ih.m811U(c2454rb9, i32) + iM811U3;
                                }
                            }
                            int iM810T3 = 0;
                            for (int i52 = 0; i52 < iCeil; i52++) {
                                C2454rb c2454rb10 = c0368Ih.f1271X0[i52];
                                if (c2454rb10 != null) {
                                    if (i52 > 0) {
                                        iM810T3 += c0368Ih.f1264Q0;
                                    }
                                    iM810T3 = c0368Ih.m810T(c2454rb10, i32) + iM810T3;
                                }
                            }
                            iArr[0] = iM811U3;
                            iArr[1] = iM810T3;
                            if (i41 == 0) {
                                if (iM811U3 <= i32 || iCeil2 <= 1) {
                                    z = true;
                                } else {
                                    iCeil2--;
                                }
                            } else if (iM810T3 <= i32 || iCeil <= 1) {
                                z = true;
                            } else {
                                iCeil--;
                            }
                        }
                        c2 = 1;
                        int[] iArr4 = c0368Ih.f1273Z0;
                        iArr4[0] = iCeil2;
                        iArr4[1] = iCeil;
                    } else if (i11 != 3) {
                        i12 = i30;
                        iArr = iArr3;
                        i13 = size2;
                        i14 = i28;
                        i15 = i5;
                        i16 = i9;
                    } else {
                        int i53 = i10;
                        int i54 = c0368Ih.f1269V0;
                        if (i53 == 0) {
                            i12 = i30;
                            iArr = iArr3;
                            i13 = size2;
                            i14 = i28;
                            i15 = i5;
                            i16 = i9;
                            c3 = 1;
                        } else {
                            arrayList3.clear();
                            C2454rb[] c2454rbArr8 = c2454rbArr;
                            i14 = i28;
                            i12 = i30;
                            i15 = i5;
                            i16 = i9;
                            iArr = iArr3;
                            c3 = 1;
                            C0325Hh c0325Hh3 = new C0325Hh(c0368Ih, i54, c0368Ih.f8588I, c0368Ih.f8589J, c0368Ih.f8590K, c0368Ih.f8591L, i32);
                            arrayList3.add(c0325Hh3);
                            if (i54 == 0) {
                                int i55 = 0;
                                int i56 = 0;
                                i20 = 0;
                                int i57 = 0;
                                while (i55 < i53) {
                                    i56++;
                                    C2454rb c2454rb11 = c2454rbArr8[i55];
                                    int iM811U4 = c0368Ih.m811U(c2454rb11, i32);
                                    int i58 = i54;
                                    int i59 = i55;
                                    if (c2454rb11.f8637p0[0] == 3) {
                                        i20++;
                                    }
                                    int i60 = i20;
                                    boolean z2 = (i57 == i32 || (c0368Ih.f1263P0 + i57) + iM811U4 > i32) && c0325Hh3.f1091b != null;
                                    if (!z2 && i59 > 0 && (i24 = c0368Ih.f1268U0) > 0 && i56 > i24) {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        i22 = size2;
                                        i54 = i58;
                                        i23 = i59;
                                        c0325Hh3 = new C0325Hh(c0368Ih, i54, c0368Ih.f8588I, c0368Ih.f8589J, c0368Ih.f8590K, c0368Ih.f8591L, i32);
                                        c0325Hh3.f1103n = i23;
                                        arrayList3.add(c0325Hh3);
                                        i56 = 1;
                                    } else {
                                        i22 = size2;
                                        i54 = i58;
                                        i23 = i59;
                                        if (i23 > 0) {
                                            i57 = c0368Ih.f1263P0 + iM811U4 + i57;
                                        }
                                        c0325Hh3.m688a(c2454rb11);
                                        i55 = i23 + 1;
                                        i20 = i60;
                                        size2 = i22;
                                    }
                                    i57 = iM811U4;
                                    c0325Hh3.m688a(c2454rb11);
                                    i55 = i23 + 1;
                                    i20 = i60;
                                    size2 = i22;
                                }
                                i13 = size2;
                            } else {
                                i13 = size2;
                                int i61 = 0;
                                int i62 = 0;
                                int i63 = 0;
                                int i64 = 0;
                                while (i61 < i53) {
                                    i62++;
                                    C2454rb c2454rb12 = c2454rbArr8[i61];
                                    int iM810T4 = c0368Ih.m810T(c2454rb12, i32);
                                    int i65 = i54;
                                    if (c2454rb12.f8637p0[1] == 3) {
                                        i63++;
                                    }
                                    int i66 = i63;
                                    boolean z3 = (i64 == i32 || (c0368Ih.f1264Q0 + i64) + iM810T4 > i32) && c0325Hh3.f1091b != null;
                                    if (!z3 && i61 > 0 && (i21 = c0368Ih.f1268U0) > 0 && i62 > i21) {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        i54 = i65;
                                        c0325Hh3 = new C0325Hh(c0368Ih, i54, c0368Ih.f8588I, c0368Ih.f8589J, c0368Ih.f8590K, c0368Ih.f8591L, i32);
                                        c0325Hh3.f1103n = i61;
                                        arrayList3.add(c0325Hh3);
                                        i62 = 1;
                                    } else {
                                        i54 = i65;
                                        if (i61 > 0) {
                                            i64 = c0368Ih.f1264Q0 + iM810T4 + i64;
                                        }
                                        c0325Hh3.m688a(c2454rb12);
                                        i61++;
                                        i63 = i66;
                                    }
                                    i64 = iM810T4;
                                    c0325Hh3.m688a(c2454rb12);
                                    i61++;
                                    i63 = i66;
                                }
                                i20 = i63;
                            }
                            int size3 = arrayList3.size();
                            int i67 = c0368Ih.f1280w0;
                            int i68 = c0368Ih.f1276s0;
                            int i69 = c0368Ih.f1281x0;
                            int i70 = c0368Ih.f1277t0;
                            boolean z4 = iArr2[0] == 2 || iArr2[1] == 2;
                            if (i20 > 0 && z4) {
                                for (int i71 = 0; i71 < size3; i71++) {
                                    C0325Hh c0325Hh4 = (C0325Hh) arrayList3.get(i71);
                                    if (i54 == 0) {
                                        c0325Hh4.m692e(i32 - c0325Hh4.m691d());
                                    } else {
                                        c0325Hh4.m692e(i32 - c0325Hh4.m690c());
                                    }
                                }
                            }
                            int i72 = i67;
                            int i73 = i68;
                            int i74 = i69;
                            int i75 = i70;
                            C1259cb c1259cb11 = c1259cb8;
                            C1259cb c1259cb12 = c1259cb9;
                            C1259cb c1259cb13 = c1259cb10;
                            C1259cb c1259cb14 = c1259cb4;
                            int iMax = 0;
                            int i76 = 0;
                            for (int i77 = 0; i77 < size3; i77++) {
                                C0325Hh c0325Hh5 = (C0325Hh) arrayList3.get(i77);
                                if (i54 == 0) {
                                    if (i77 < size3 - 1) {
                                        c1259cb13 = ((C0325Hh) arrayList3.get(i77 + 1)).f1091b.f8589J;
                                        i75 = 0;
                                    } else {
                                        i75 = c0368Ih.f1277t0;
                                        c1259cb13 = c1259cb10;
                                    }
                                    C1259cb c1259cb15 = c0325Hh5.f1091b.f8591L;
                                    c0325Hh5.m693f(i54, c1259cb11, c1259cb14, c1259cb12, c1259cb13, i72, i73, i74, i75, i32);
                                    iMax = Math.max(iMax, c0325Hh5.m691d());
                                    int iM690c = c0325Hh5.m690c() + i76;
                                    if (i77 > 0) {
                                        iM690c += c0368Ih.f1264Q0;
                                    }
                                    i76 = iM690c;
                                    c1259cb14 = c1259cb15;
                                    i73 = 0;
                                } else {
                                    if (i77 < size3 - 1) {
                                        c1259cb12 = ((C0325Hh) arrayList3.get(i77 + 1)).f1091b.f8588I;
                                        i74 = 0;
                                    } else {
                                        i74 = c0368Ih.f1281x0;
                                        c1259cb12 = c1259cb9;
                                    }
                                    C1259cb c1259cb16 = c0325Hh5.f1091b.f8590K;
                                    c0325Hh5.m693f(i54, c1259cb11, c1259cb14, c1259cb12, c1259cb13, i72, i73, i74, i75, i32);
                                    int iM691d = c0325Hh5.m691d() + iMax;
                                    int iMax2 = Math.max(i76, c0325Hh5.m690c());
                                    if (i77 > 0) {
                                        iM691d += c0368Ih.f1263P0;
                                    }
                                    i76 = iMax2;
                                    iMax = iM691d;
                                    c1259cb11 = c1259cb16;
                                    i72 = 0;
                                }
                            }
                            iArr[0] = iMax;
                            iArr[1] = i76;
                        }
                        c2 = c3;
                    }
                    c = 0;
                    int i382 = iArr[c] + i14 + i15;
                    int i392 = iArr[c2] + i16 + i12;
                    if (mode != 1073741824) {
                        size = mode == Integer.MIN_VALUE ? Math.min(i382, size) : mode == 0 ? i382 : 0;
                    }
                    int iMin = mode2 != 1073741824 ? i13 : mode2 == Integer.MIN_VALUE ? Math.min(i392, i13) : mode2 == 0 ? i392 : 0;
                    c0368Ih.f1283z0 = size;
                    c0368Ih.f1248A0 = iMin;
                    c0368Ih.m4924O(size);
                    c0368Ih.m4921L(iMin);
                    c0368Ih.f1282y0 = c0368Ih.f8966r0 <= 0 ? c2 : 0;
                } else {
                    i12 = i30;
                    iArr = iArr3;
                    i13 = size2;
                    i14 = i28;
                    i15 = i5;
                    i16 = i9;
                    int i78 = i10;
                    C2454rb[] c2454rbArr9 = c2454rbArr;
                    int i79 = c0368Ih.f1269V0;
                    if (i78 != 0) {
                        arrayList3.clear();
                        C0325Hh c0325Hh6 = new C0325Hh(c0368Ih, i79, c0368Ih.f8588I, c0368Ih.f8589J, c0368Ih.f8590K, c0368Ih.f8591L, i32);
                        arrayList3.add(c0325Hh6);
                        if (i79 == 0) {
                            int i80 = 0;
                            i17 = 0;
                            int i81 = 0;
                            while (i80 < i78) {
                                C2454rb c2454rb13 = c2454rbArr9[i80];
                                int iM811U5 = c0368Ih.m811U(c2454rb13, i32);
                                if (c2454rb13.f8637p0[0] == 3) {
                                    i17++;
                                }
                                int i82 = i17;
                                boolean z5 = (i81 == i32 || (c0368Ih.f1263P0 + i81) + iM811U5 > i32) && c0325Hh6.f1091b != null;
                                if (!z5 && i80 > 0 && (i19 = c0368Ih.f1268U0) > 0 && i80 % i19 == 0) {
                                    z5 = true;
                                }
                                if (z5) {
                                    c0325Hh6 = new C0325Hh(c0368Ih, i79, c0368Ih.f8588I, c0368Ih.f8589J, c0368Ih.f8590K, c0368Ih.f8591L, i32);
                                    c0325Hh6.f1103n = i80;
                                    arrayList3.add(c0325Hh6);
                                } else {
                                    if (i80 > 0) {
                                        i81 = c0368Ih.f1263P0 + iM811U5 + i81;
                                    }
                                    c0325Hh6.m688a(c2454rb13);
                                    i80++;
                                    i17 = i82;
                                }
                                i81 = iM811U5;
                                c0325Hh6.m688a(c2454rb13);
                                i80++;
                                i17 = i82;
                            }
                        } else {
                            int i83 = 0;
                            i17 = 0;
                            int i84 = 0;
                            while (i83 < i78) {
                                C2454rb c2454rb14 = c2454rbArr9[i83];
                                int iM810T5 = c0368Ih.m810T(c2454rb14, i32);
                                if (c2454rb14.f8637p0[1] == 3) {
                                    i17++;
                                }
                                int i85 = i17;
                                boolean z6 = (i84 == i32 || (c0368Ih.f1264Q0 + i84) + iM810T5 > i32) && c0325Hh6.f1091b != null;
                                if (!z6 && i83 > 0 && (i18 = c0368Ih.f1268U0) > 0 && i83 % i18 == 0) {
                                    z6 = true;
                                }
                                if (z6) {
                                    c0325Hh6 = new C0325Hh(c0368Ih, i79, c0368Ih.f8588I, c0368Ih.f8589J, c0368Ih.f8590K, c0368Ih.f8591L, i32);
                                    c0325Hh6.f1103n = i83;
                                    arrayList3.add(c0325Hh6);
                                } else {
                                    if (i83 > 0) {
                                        i84 = c0368Ih.f1264Q0 + iM810T5 + i84;
                                    }
                                    c0325Hh6.m688a(c2454rb14);
                                    i83++;
                                    i17 = i85;
                                }
                                i84 = iM810T5;
                                c0325Hh6.m688a(c2454rb14);
                                i83++;
                                i17 = i85;
                            }
                        }
                        int size4 = arrayList3.size();
                        int i86 = c0368Ih.f1280w0;
                        int i87 = c0368Ih.f1276s0;
                        int i88 = c0368Ih.f1281x0;
                        int i89 = c0368Ih.f1277t0;
                        boolean z7 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i17 > 0 && z7) {
                            for (int i90 = 0; i90 < size4; i90++) {
                                C0325Hh c0325Hh7 = (C0325Hh) arrayList3.get(i90);
                                if (i79 == 0) {
                                    c0325Hh7.m692e(i32 - c0325Hh7.m691d());
                                } else {
                                    c0325Hh7.m692e(i32 - c0325Hh7.m690c());
                                }
                            }
                        }
                        int i91 = i86;
                        int i92 = i87;
                        int i93 = i88;
                        int i94 = i89;
                        C1259cb c1259cb17 = c1259cb8;
                        C1259cb c1259cb18 = c1259cb9;
                        C1259cb c1259cb19 = c1259cb10;
                        C1259cb c1259cb20 = c1259cb4;
                        int iMax3 = 0;
                        int i95 = 0;
                        for (int i96 = 0; i96 < size4; i96++) {
                            C0325Hh c0325Hh8 = (C0325Hh) arrayList3.get(i96);
                            if (i79 == 0) {
                                if (i96 < size4 - 1) {
                                    c1259cb19 = ((C0325Hh) arrayList3.get(i96 + 1)).f1091b.f8589J;
                                    i94 = 0;
                                } else {
                                    i94 = c0368Ih.f1277t0;
                                    c1259cb19 = c1259cb10;
                                }
                                C1259cb c1259cb21 = c0325Hh8.f1091b.f8591L;
                                c0325Hh8.m693f(i79, c1259cb17, c1259cb20, c1259cb18, c1259cb19, i91, i92, i93, i94, i32);
                                iMax3 = Math.max(iMax3, c0325Hh8.m691d());
                                int iM690c2 = c0325Hh8.m690c() + i95;
                                if (i96 > 0) {
                                    iM690c2 += c0368Ih.f1264Q0;
                                }
                                i95 = iM690c2;
                                c1259cb20 = c1259cb21;
                                i92 = 0;
                            } else {
                                if (i96 < size4 - 1) {
                                    c1259cb18 = ((C0325Hh) arrayList3.get(i96 + 1)).f1091b.f8588I;
                                    i93 = 0;
                                } else {
                                    i93 = c0368Ih.f1281x0;
                                    c1259cb18 = c1259cb9;
                                }
                                C1259cb c1259cb22 = c0325Hh8.f1091b.f8590K;
                                c0325Hh8.m693f(i79, c1259cb17, c1259cb20, c1259cb18, c1259cb19, i91, i92, i93, i94, i32);
                                int iM691d2 = c0325Hh8.m691d() + iMax3;
                                int iMax4 = Math.max(i95, c0325Hh8.m690c());
                                if (i96 > 0) {
                                    iM691d2 += c0368Ih.f1263P0;
                                }
                                i95 = iMax4;
                                iMax3 = iM691d2;
                                c1259cb17 = c1259cb22;
                                i91 = 0;
                            }
                        }
                        iArr[0] = iMax3;
                        iArr[1] = i95;
                    }
                }
                c2 = 1;
                c = 0;
                int i3822 = iArr[c] + i14 + i15;
                int i3922 = iArr[c2] + i16 + i12;
                if (mode != 1073741824) {
                }
                if (mode2 != 1073741824) {
                }
                c0368Ih.f1283z0 = size;
                c0368Ih.f1248A0 = iMin;
                c0368Ih.m4924O(size);
                c0368Ih.m4921L(iMin);
                c0368Ih.f1282y0 = c0368Ih.f8966r0 <= 0 ? c2 : 0;
            }
        } else {
            C1259cb c1259cb82 = c1259cb5;
            C1259cb c1259cb92 = c1259cb6;
            C1259cb c1259cb102 = c1259cb7;
            ArrayList arrayList32 = arrayList2;
            int i282 = c0368Ih.f1280w0;
            int i292 = c0368Ih.f1281x0;
            i3 = c0368Ih.f1276s0;
            int i302 = c0368Ih.f1277t0;
            int[] iArr32 = new int[2];
            int i312 = (size - i282) - i292;
            i4 = c0368Ih.f1269V0;
            if (i4 == 1) {
            }
            int i322 = i312;
            if (i4 != 0) {
            }
            C2454rb[] c2454rbArr22 = c0368Ih.f8965q0;
            i6 = 0;
            i7 = 0;
            while (true) {
                i8 = c0368Ih.f8966r0;
                i9 = i3;
                if (i6 < i8) {
                }
                i6++;
                i3 = i9;
            }
            if (i7 <= 0) {
            }
            c0368Ih.f1274a1 = c2454rbArr;
            c0368Ih.f1275b1 = i10;
            i11 = c0368Ih.f1267T0;
            if (i11 != 0) {
            }
            c2 = 1;
            c = 0;
            int i38222 = iArr[c] + i14 + i15;
            int i39222 = iArr[c2] + i16 + i12;
            if (mode != 1073741824) {
            }
            if (mode2 != 1073741824) {
            }
            c0368Ih.f1283z0 = size;
            c0368Ih.f1248A0 = iMin;
            c0368Ih.m4924O(size);
            c0368Ih.m4921L(iMin);
            c0368Ih.f1282y0 = c0368Ih.f8966r0 <= 0 ? c2 : 0;
        }
        setMeasuredDimension(c0368Ih.f1283z0, c0368Ih.f1248A0);
    }

    @Override // p000.AbstractC1364eb, android.view.View
    public final void onMeasure(int i, int i2) {
        mo1836j(this.f3853j, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f3853j.f1259L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f3853j.f1253F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f3853j.f1260M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f3853j.f1254G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f3853j.f1265R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f3853j.f1257J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f3853j.f1263P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f3853j.f1251D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f3853j.f1261N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f3853j.f1255H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f3853j.f1262O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f3853j.f1256I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f3853j.f1268U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f3853j.f1269V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C0368Ih c0368Ih = this.f3853j;
        c0368Ih.f1276s0 = i;
        c0368Ih.f1277t0 = i;
        c0368Ih.f1278u0 = i;
        c0368Ih.f1279v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f3853j.f1277t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f3853j.f1280w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f3853j.f1281x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f3853j.f1276s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f3853j.f1266S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f3853j.f1258K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f3853j.f1264Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f3853j.f1252E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f3853j.f1267T0 = i;
        requestLayout();
    }
}
