package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;
import nuke.ui.HomeActivity;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class af implements mn0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ af(List list, in0 in0Var, int i) {
        this.h = 12;
        this.j = list;
        this.i = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:202:0x04d7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:218:0x051c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:468:0x04f2 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:469:0x051c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:514:0x024e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x08cd  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x08eb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0242 A[LOOP:27: B:84:0x0242->B:86:0x024b, LOOP_START, PHI: r2
  0x0242: PHI (r2v8 int) = (r2v7 int), (r2v9 int) binds: [B:83:0x0240, B:86:0x024b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0285  */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r17v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r39v0 */
    /* JADX WARN: Type inference failed for: r39v1 */
    /* JADX WARN: Type inference failed for: r39v2 */
    /* JADX WARN: Type inference failed for: r39v3 */
    /* JADX WARN: Type inference failed for: r39v4 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v71 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v87 */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v94 */
    /* JADX WARN: Type inference failed for: r52v1 */
    /* JADX WARN: Type inference failed for: r53v0 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        g81 g81Var;
        lm lmVar;
        boolean z;
        ?? arrayList;
        int i4;
        ?? r39;
        c11 c11Var;
        int size;
        int i5;
        int i6;
        int i7;
        d91 d91Var;
        long j;
        int i8;
        int iMax;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        y81 y81Var;
        int i14;
        ?? arrayList2;
        float f;
        int i15;
        ArrayList arrayList3;
        v81 v81Var;
        boolean z2;
        boolean z3;
        c81 c81Var;
        int i16;
        boolean z4;
        ?? r8;
        Integer numValueOf;
        Integer numValueOf2;
        ?? r12;
        x81 x81Var;
        iw2 iw2Var;
        int i17;
        yj1 yj1Var;
        int[] iArr;
        int i18;
        long j2;
        int iA;
        Object obj3;
        int i19;
        int iMax2;
        int i20;
        int iC;
        boolean zA = h11.a(0L, 0L);
        z71 z71Var = (z71) this.i;
        w81 w81Var = (w81) this.j;
        iw2 iw2Var2 = (iw2) obj;
        c81 c81Var2 = new c81(z71Var, iw2Var2);
        long j3 = ((fz) obj2).a;
        w81Var.getClass();
        yf yfVar = w81Var.d;
        jw1 jw1Var = w81Var.b;
        d91 d91Var2 = w81Var.a;
        xk1 xk1Var = d91Var2.s;
        os osVar = d91Var2.e;
        xk1Var.getValue();
        boolean z5 = d91Var2.b || iw2Var2.u();
        qv1 qv1Var = qv1.h;
        te.p(j3, qv1Var);
        d61 layoutDirection = iw2Var2.getLayoutDirection();
        d61 d61Var = d61.h;
        int iT = iw2Var2.T(layoutDirection == d61Var ? jw1Var.a : jw1Var.c);
        int iT2 = iw2Var2.T(iw2Var2.getLayoutDirection() == d61Var ? jw1Var.c : jw1Var.a);
        int iT3 = iw2Var2.T(jw1Var.b);
        int iT4 = iw2Var2.T(jw1Var.d) + iT3;
        int i21 = iT2 + iT;
        int i22 = iT4 - iT3;
        long jI = gz.i(-i21, -iT4, j3);
        t81 t81Var = (t81) w81Var.c.a();
        o71 o71Var = t81Var.c;
        int iH = fz.h(jI);
        int iG = fz.g(jI);
        o71Var.a.h(iH);
        o71Var.b.h(iG);
        if (yfVar == null) {
            nz0.b("null verticalArrangement when isVertical == true");
            s.b();
            return null;
        }
        int iT5 = iw2Var2.T(yfVar.b());
        int iC2 = t81Var.c();
        int iG2 = fz.g(j3) - iT4;
        v81 v81Var2 = new v81(jI, t81Var, c81Var2, iC2, iT5, w81Var.g, iT3, i22, (((long) iT) << 32) | (((long) iT3) & 4294967295L), w81Var.a);
        vr2 vr2VarB = tl.B();
        in0 in0VarE = vr2VarB != null ? vr2VarB.e() : null;
        vr2 vr2VarK = tl.K(vr2VarB);
        try {
            int iG3 = ((kx1) osVar.b).g();
            int iY = te.y(iG3, t81Var, osVar.d);
            if (iG3 != iY) {
                i = iG2;
                ((kx1) osVar.b).h(iY);
                d81 d81Var = (d81) osVar.e;
                i2 = iC2;
                if (iG3 != d81Var.i) {
                    d81Var.i = iG3;
                    int i23 = (iG3 / 30) * 30;
                    i3 = iY;
                    d81Var.h.setValue(ci0.X(Math.max(i23 - 100, 0), i23 + 130));
                }
                int iG4 = ((kx1) osVar.c).g();
                tl.U(vr2VarB, vr2VarK, in0VarE);
                g81Var = d91Var2.r;
                lmVar = d91Var2.o;
                zk1 zk1Var = lmVar.a;
                z = zk1Var.j == 0;
                be0 be0Var = be0.h;
                if (z && g81Var.h.isEmpty()) {
                    i4 = iG4;
                    arrayList = be0Var;
                    r39 = arrayList;
                } else {
                    arrayList = new ArrayList();
                    if (lmVar.a.j == 0) {
                        int i24 = zk1Var.j;
                        if (i24 == 0) {
                            um2.i("MutableVector is empty.");
                            return null;
                        }
                        i4 = iG4;
                        Object[] objArr = zk1Var.h;
                        r39 = be0Var;
                        int i25 = ((p71) objArr[0]).a;
                        int i26 = 0;
                        while (i26 < i24) {
                            int i27 = i26;
                            int i28 = ((p71) objArr[i26]).a;
                            if (i28 < i25) {
                                i25 = i28;
                            }
                            i26 = i27 + 1;
                        }
                        if (i25 < 0) {
                            nz0.a("negative minIndex");
                        }
                        int i29 = zk1Var.j;
                        if (i29 == 0) {
                            um2.i("MutableVector is empty.");
                            return null;
                        }
                        Object[] objArr2 = zk1Var.h;
                        int i30 = ((p71) objArr2[0]).b;
                        int i31 = 0;
                        while (i31 < i29) {
                            Object[] objArr3 = objArr2;
                            int i32 = ((p71) objArr2[i31]).b;
                            if (i32 > i30) {
                                i30 = i32;
                            }
                            i31++;
                            objArr2 = objArr3;
                        }
                        c11Var = new c11(i25, Math.min(i30, t81Var.c() - 1), 1);
                    } else {
                        i4 = iG4;
                        r39 = be0Var;
                        c11Var = c11.k;
                    }
                    size = g81Var.h.size();
                    for (i5 = 0; i5 < size; i5++) {
                        e81 e81Var = (e81) g81Var.get(i5);
                        int iY2 = te.y(e81Var.c, t81Var, e81Var.a);
                        int i33 = c11Var.h;
                        if ((iY2 > c11Var.i || i33 > iY2) && iY2 >= 0 && iY2 < t81Var.c()) {
                            arrayList.add(Integer.valueOf(iY2));
                        }
                    }
                    i6 = c11Var.h;
                    i7 = c11Var.i;
                    if (i6 <= i7) {
                        while (true) {
                            arrayList.add(Integer.valueOf(i6));
                            if (i6 == i7) {
                                break;
                            }
                            i6++;
                        }
                    }
                }
                float fFloatValue = (iw2Var2.u() && z5) ? ((Number) ((id) d91Var2.w.j).i.getValue()).floatValue() : d91Var2.h;
                x71 x71Var = d91Var2.n;
                boolean zU = iw2Var2.u();
                j20 j20Var = w81Var.e;
                xk1 xk1Var2 = d91Var2.v;
                j51 j51Var = w81Var.f;
                if (iT3 < 0) {
                    nz0.a("invalid beforeContentPadding");
                }
                if (i22 < 0) {
                    nz0.a("invalid afterContentPadding");
                }
                ce0 ce0Var = ce0.h;
                t81 t81Var2 = v81Var2.b;
                if (i2 > 0) {
                    int iJ = fz.j(jI);
                    int i34 = fz.i(jI);
                    x71Var.b(iJ, i34, new ArrayList(), t81Var2.d, v81Var2, zU, z5, 0, 0);
                    if (!zU) {
                        x71Var.a();
                        if (!zA) {
                            iJ = gz.g(jI, 0);
                            i34 = gz.f(jI, 0);
                        }
                    }
                    x81Var = new x81(null, 0, false, 0.0f, iw2Var2.j0(gz.g(j3, iJ + i21), gz.f(j3, i34 + iT4), ce0Var, new w(24)), 0.0f, false, j20Var, c81Var2, v81Var2.d, r39, -iT3, i + i22, 0, qv1Var, i22, iT5);
                    d91Var = d91Var2;
                    iw2Var = iw2Var2;
                } else {
                    float f2 = fFloatValue;
                    int i35 = i3;
                    int i36 = i2;
                    if (i35 >= i36) {
                        i35 = i36 - 1;
                        i4 = 0;
                    }
                    int iRound = Math.round(f2);
                    int i37 = i4 - iRound;
                    if (i35 == 0 && i37 < 0) {
                        iRound += i37;
                        i37 = 0;
                    }
                    int i38 = i35;
                    ag agVar = new ag();
                    d91Var = d91Var2;
                    int i39 = -iT3;
                    int i40 = i39 + (iT5 < 0 ? iT5 : 0);
                    int i41 = i37 + i40;
                    int iMax3 = 0;
                    while (true) {
                        j = v81Var2.d;
                        if (i41 >= 0 || i38 <= 0) {
                            break;
                        }
                        xk1 xk1Var3 = xk1Var2;
                        int i42 = i38 - 1;
                        y81 y81VarA = v81Var2.a(j, i42);
                        agVar.add(0, y81VarA);
                        iMax3 = Math.max(iMax3, y81VarA.m);
                        i41 += y81VarA.l;
                        i38 = i42;
                        xk1Var2 = xk1Var3;
                    }
                    xk1 xk1Var4 = xk1Var2;
                    if (i41 < i40) {
                        iRound -= i40 - i41;
                        i41 = i40;
                    }
                    int i43 = iRound;
                    int i44 = i41 - i40;
                    int i45 = i + i22;
                    int i46 = iMax3;
                    int i47 = i45 < 0 ? 0 : i45;
                    int i48 = i39;
                    int i49 = -i44;
                    int i50 = i44;
                    int i51 = i38;
                    int i52 = 0;
                    boolean z6 = false;
                    while (i52 < agVar.j) {
                        if (i49 >= i47) {
                            agVar.b(i52);
                            z6 = true;
                        } else {
                            i51++;
                            i49 += ((y81) agVar.get(i52)).l;
                            i52++;
                        }
                    }
                    int i53 = i46;
                    int i54 = i51;
                    boolean z7 = z6;
                    while (i54 < i36 && (i49 < i47 || i49 <= 0 || agVar.isEmpty())) {
                        int i55 = i47;
                        y81 y81VarA2 = v81Var2.a(j, i54);
                        int i56 = i36;
                        int i57 = y81VarA2.l;
                        i49 += i57;
                        if (i49 > i40 || i54 == i56 - 1) {
                            int iMax4 = Math.max(i53, y81VarA2.m);
                            agVar.addLast(y81VarA2);
                            i53 = iMax4;
                        } else {
                            i50 -= i57;
                            i38 = i54 + 1;
                            z7 = true;
                        }
                        i54++;
                        i47 = i55;
                        i36 = i56;
                    }
                    int i58 = i36;
                    int i59 = i;
                    if (i49 < i59) {
                        int i60 = i59 - i49;
                        int i61 = i49 + i60;
                        iMax = i53;
                        i11 = i50 - i60;
                        while (i11 < iT3 && i38 > 0) {
                            int i62 = i61;
                            int i63 = i38 - 1;
                            int i64 = i60;
                            y81 y81VarA3 = v81Var2.a(j, i63);
                            i38 = i63;
                            agVar.add(0, y81VarA3);
                            iMax = Math.max(iMax, y81VarA3.m);
                            i11 += y81VarA3.l;
                            i61 = i62;
                            i60 = i64;
                        }
                        int i65 = i61;
                        i8 = i43 + i60;
                        if (i11 < 0) {
                            i8 += i11;
                            i49 = i65 + i11;
                            i9 = iT3;
                            i10 = i38;
                            i11 = 0;
                        } else {
                            i49 = i65;
                            i9 = iT3;
                            i10 = i38;
                        }
                    } else {
                        i8 = i43;
                        iMax = i53;
                        i9 = iT3;
                        i10 = i38;
                        i11 = i50;
                    }
                    int i66 = iMax;
                    int i67 = i54;
                    float f3 = (Integer.signum(Math.round(f2)) != Integer.signum(i8) || Math.abs(Math.round(f2)) < Math.abs(i8)) ? f2 : i8;
                    float f4 = f2 - f3;
                    float f5 = 0.0f;
                    if (zU && i8 > i43 && f4 <= 0.0f) {
                        f5 = (i8 - i43) + f4;
                    }
                    float f6 = f5;
                    if (i11 < 0) {
                        nz0.a("negative currentFirstItemScrollOffset");
                    }
                    int i68 = -i11;
                    if (agVar.isEmpty()) {
                        um2.i("ArrayDeque is empty.");
                        return null;
                    }
                    y81 y81Var2 = (y81) agVar.i[agVar.h];
                    if (i9 > 0 || iT5 < 0) {
                        int iA2 = agVar.a();
                        y81 y81Var3 = y81Var2;
                        int i69 = i11;
                        int i70 = 0;
                        while (true) {
                            if (i70 >= iA2) {
                                i12 = i69;
                                i13 = i68;
                                break;
                            }
                            i13 = i68;
                            int i71 = ((y81) agVar.get(i70)).l;
                            if (i69 == 0 || i71 > i69) {
                                break;
                            }
                            i12 = i69;
                            if (i70 == agVar.a() - 1) {
                                break;
                            }
                            i69 = i12 - i71;
                            i70++;
                            y81Var3 = (y81) agVar.get(i70);
                            i68 = i13;
                        }
                        i12 = i69;
                        y81Var = y81Var3;
                        i11 = i12;
                    } else {
                        i13 = i68;
                        y81Var = y81Var2;
                    }
                    int iMax5 = Math.max(0, i10);
                    int i72 = i10 - 1;
                    if (iMax5 <= i72) {
                        arrayList2 = 0;
                        while (true) {
                            if (arrayList2 == 0) {
                                arrayList2 = new ArrayList();
                            }
                            i14 = i11;
                            arrayList2.add(v81Var2.a(j, i72));
                            if (i72 == iMax5) {
                                break;
                            }
                            i72--;
                            i11 = i14;
                            arrayList2 = arrayList2;
                        }
                    } else {
                        i14 = i11;
                        arrayList2 = 0;
                    }
                    int size2 = arrayList.size() - 1;
                    ?? r3 = arrayList2;
                    if (size2 >= 0) {
                        while (true) {
                            int i73 = size2 - 1;
                            int iIntValue = ((Number) arrayList.get(size2)).intValue();
                            ?? arrayList4 = r3;
                            arrayList2 = r3;
                            if (iIntValue < iMax5) {
                                if (r3 == 0) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(v81Var2.a(j, iIntValue));
                                arrayList2 = arrayList4;
                            }
                            if (i73 < 0) {
                                break;
                            }
                            size2 = i73;
                            r3 = arrayList2;
                        }
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = r39;
                    }
                    int iMax6 = i66;
                    int i74 = 0;
                    for (int size3 = arrayList2.size(); i74 < size3; size3 = size3) {
                        iMax6 = Math.max(iMax6, ((y81) arrayList2.get(i74)).m);
                        i74++;
                    }
                    int iMin = Math.min(((y81) du.v0(agVar)).a, i58 - 1);
                    int i75 = ((y81) du.v0(agVar)).a + 1;
                    if (i75 <= iMin) {
                        ArrayList arrayList5 = null;
                        while (true) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            f = f3;
                            arrayList3 = arrayList5;
                            i15 = iMax6;
                            arrayList3.add(v81Var2.a(j, i75));
                            if (i75 == iMin) {
                                break;
                            }
                            i75++;
                            iMax6 = i15;
                            arrayList5 = arrayList3;
                            f3 = f;
                        }
                    } else {
                        f = f3;
                        i15 = iMax6;
                        arrayList3 = null;
                    }
                    if (arrayList3 != null && ((y81) du.v0(arrayList3)).a > iMin) {
                        iMin = ((y81) du.v0(arrayList3)).a;
                    }
                    int size4 = arrayList.size();
                    ArrayList arrayList6 = arrayList3;
                    int i76 = 0;
                    ?? r10 = arrayList;
                    while (i76 < size4) {
                        ?? r52 = r10;
                        int iIntValue2 = ((Number) r10.get(i76)).intValue();
                        if (iIntValue2 > iMin) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(v81Var2.a(j, iIntValue2));
                        }
                        i76++;
                        r10 = r52;
                    }
                    ?? r122 = arrayList6 == null ? r39 : arrayList6;
                    int size5 = r122.size();
                    int iMax7 = i15;
                    for (int i77 = 0; i77 < size5; i77++) {
                        iMax7 = Math.max(iMax7, ((y81) r122.get(i77)).m);
                    }
                    if (agVar.isEmpty()) {
                        um2.i("ArrayDeque is empty.");
                        return null;
                    }
                    boolean z8 = t11.l(y81Var, agVar.i[agVar.h]) && arrayList2.isEmpty() && r122.isEmpty();
                    int iG5 = gz.g(jI, iMax7);
                    int iF = gz.f(jI, i49);
                    boolean z9 = i49 < Math.min(iF, i59);
                    if (z9 && i13 != 0) {
                        nz0.c("non-zero itemsScrollOffset");
                    }
                    int i78 = i49;
                    y81 y81Var4 = y81Var;
                    ArrayList arrayList7 = new ArrayList(r122.size() + arrayList2.size() + agVar.a());
                    if (z9) {
                        if (!arrayList2.isEmpty() || !r122.isEmpty()) {
                            nz0.a("no extra items");
                        }
                        int iA3 = agVar.a();
                        int[] iArr2 = new int[iA3];
                        for (int i79 = 0; i79 < iA3; i79++) {
                            iArr2[i79] = ((y81) agVar.get(i79)).k;
                        }
                        int[] iArr3 = new int[iA3];
                        if (yfVar == null) {
                            nz0.b("null verticalArrangement when isVertical == true");
                            s.b();
                            return null;
                        }
                        yfVar.f(iF, c81Var2, iArr2, iArr3);
                        v81Var = v81Var2;
                        c11 c11Var2 = new c11(0, iA3 - 1, 1);
                        int i80 = c11Var2.i;
                        int i81 = c11Var2.j;
                        if ((i81 > 0 && i80 >= 0) || (i81 < 0 && i80 <= 0)) {
                            int i82 = 0;
                            while (true) {
                                int i83 = iArr3[i82];
                                int i84 = i81;
                                y81 y81Var5 = (y81) agVar.get(i82);
                                y81Var5.c(i83, iG5, iF);
                                arrayList7.add(y81Var5);
                                if (i82 == i80) {
                                    break;
                                }
                                i82 += i84;
                                i81 = i84;
                            }
                        }
                    } else {
                        v81Var = v81Var2;
                        int size6 = arrayList2.size();
                        int i85 = i13;
                        int i86 = 0;
                        ?? r32 = arrayList2;
                        while (i86 < size6) {
                            ?? r53 = r32;
                            y81 y81Var6 = (y81) r32.get(i86);
                            i85 -= y81Var6.l;
                            y81Var6.c(i85, iG5, iF);
                            arrayList7.add(y81Var6);
                            i86++;
                            size6 = size6;
                            r32 = r53;
                        }
                        int iA4 = agVar.a();
                        int i87 = i13;
                        for (int i88 = 0; i88 < iA4; i88++) {
                            y81 y81Var7 = (y81) agVar.get(i88);
                            y81Var7.c(i87, iG5, iF);
                            arrayList7.add(y81Var7);
                            i87 += y81Var7.l;
                        }
                        int size7 = r122.size();
                        for (int i89 = 0; i89 < size7; i89++) {
                            y81 y81Var8 = (y81) r122.get(i89);
                            y81Var8.c(i87, iG5, iF);
                            arrayList7.add(y81Var8);
                            i87 += y81Var8.l;
                        }
                    }
                    int i90 = i14;
                    x71Var.b(iG5, iF, arrayList7, t81Var2.d, v81Var, zU, z5, i90, i78);
                    v81 v81Var3 = v81Var;
                    boolean z10 = zU;
                    if (!z10) {
                        x71Var.a();
                        if (zA) {
                            z2 = z8;
                        } else {
                            iG5 = gz.g(jI, Math.max(iG5, 0));
                            z2 = z8;
                            int iF2 = gz.f(jI, Math.max(iF, 0));
                            if (iF2 != iF) {
                                int size8 = arrayList7.size();
                                for (int i91 = 0; i91 < size8; i91++) {
                                    ((y81) arrayList7.get(i91)).o = iF2;
                                }
                            }
                            iF = iF2;
                        }
                        y81 y81Var9 = (y81) (agVar.isEmpty() ? null : agVar.i[agVar.h]);
                        int i92 = y81Var9 != null ? y81Var9.a : 0;
                        y81 y81Var10 = (y81) agVar.f();
                        int i93 = y81Var10 != null ? y81Var10.a : 0;
                        t81Var2.b.getClass();
                        yj1 yj1Var2 = w01.a;
                        if (j51Var == null || arrayList7.isEmpty() || (i17 = yj1Var2.b) == 0) {
                            z3 = z10;
                            c81Var = c81Var2;
                            i16 = i48;
                            z4 = true;
                            r8 = r39;
                        } else {
                            if (i93 - i92 < 0 || i17 == 0) {
                                c81Var = c81Var2;
                                yj1Var = yj1Var2;
                            } else {
                                c11 c11VarX = ci0.X(0, i17);
                                int i94 = c11VarX.h;
                                int i95 = c11VarX.i;
                                c81Var = c81Var2;
                                if (i94 <= i95) {
                                    iC = -1;
                                    while (yj1Var2.c(i94) <= i92) {
                                        iC = yj1Var2.c(i94);
                                        if (i94 == i95) {
                                            break;
                                        }
                                        i94++;
                                    }
                                    i20 = -1;
                                } else {
                                    i20 = -1;
                                    iC = -1;
                                }
                                if (iC == i20) {
                                    yj1Var = w01.a;
                                } else {
                                    yj1Var = new yj1(1);
                                    yj1Var.a(iC);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList(arrayList7.size());
                            int size9 = arrayList7.size();
                            int i96 = 0;
                            while (i96 < size9) {
                                int i97 = size9;
                                Object obj4 = arrayList7.get(i96);
                                int i98 = i96;
                                int i99 = ((y81) obj4).a;
                                boolean z11 = z10;
                                int[] iArr4 = yj1Var2.a;
                                int i100 = yj1Var2.b;
                                yj1 yj1Var3 = yj1Var2;
                                int i101 = 0;
                                while (true) {
                                    if (i101 < i100) {
                                        int i102 = i100;
                                        if (iArr4[i101] == i99) {
                                            arrayList9.add(obj4);
                                            break;
                                        }
                                        i101++;
                                        i100 = i102;
                                    }
                                }
                                i96 = i98 + 1;
                                size9 = i97;
                                z10 = z11;
                                yj1Var2 = yj1Var3;
                            }
                            z3 = z10;
                            int[] iArr5 = yj1Var.a;
                            int i103 = yj1Var.b;
                            int i104 = 0;
                            while (i104 < i103) {
                                int i105 = iArr5[i104];
                                Iterator it = arrayList7.iterator();
                                int i106 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        iArr = iArr5;
                                        i18 = -1;
                                        break;
                                    }
                                    iArr = iArr5;
                                    if (((y81) it.next()).a == i105) {
                                        i18 = i106;
                                        break;
                                    }
                                    i106++;
                                    iArr5 = iArr;
                                }
                                y81 y81VarA4 = i18 == -1 ? v81Var3.a(j, i105) : (y81) arrayList7.remove(i18);
                                int i107 = i103;
                                int i108 = y81VarA4.l;
                                if (i18 == -1) {
                                    j2 = j;
                                    iA = Integer.MIN_VALUE;
                                } else {
                                    j2 = j;
                                    iA = (int) (y81VarA4.a(0) & 4294967295L);
                                }
                                int size10 = arrayList9.size();
                                int i109 = 0;
                                while (true) {
                                    if (i109 >= size10) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = arrayList9.get(i109);
                                    int i110 = size10;
                                    if (((y81) obj3).a != i105) {
                                        break;
                                    }
                                    i109++;
                                    size10 = i110;
                                }
                                y81 y81Var11 = (y81) obj3;
                                int iA5 = y81Var11 != null ? (int) (y81Var11.a(0) & 4294967295L) : Integer.MIN_VALUE;
                                if (iA == Integer.MIN_VALUE) {
                                    iMax2 = i48;
                                    i19 = iMax2;
                                } else {
                                    i19 = i48;
                                    iMax2 = Math.max(i19, iA);
                                }
                                if (iA5 != Integer.MIN_VALUE) {
                                    iMax2 = Math.min(iMax2, iA5 - i108);
                                }
                                y81VarA4.n = true;
                                y81VarA4.c(iMax2, iG5, iF);
                                arrayList8.add(y81VarA4);
                                i104++;
                                i48 = i19;
                                i103 = i107;
                                iArr5 = iArr;
                                j = j2;
                            }
                            i16 = i48;
                            z4 = true;
                            r8 = arrayList8;
                        }
                        if (z2) {
                            y81 y81Var12 = (y81) du.q0(arrayList7);
                            numValueOf = y81Var12 != null ? Integer.valueOf(y81Var12.a) : null;
                            if (z2) {
                                y81 y81Var13 = (y81) agVar.f();
                                if (y81Var13 != null) {
                                    numValueOf2 = Integer.valueOf(y81Var13.a);
                                }
                                if (i67 >= i58) {
                                    z4 = false;
                                }
                                of1 of1VarJ0 = iw2Var2.j0(gz.g(j3, iG5 + i21), gz.f(j3, iF + iT4), ce0Var, new m0(xk1Var4, arrayList7, (List) r8, z3));
                                if (numValueOf == null) {
                                }
                                if (numValueOf2 == null) {
                                }
                                if (arrayList7.isEmpty()) {
                                }
                                iw2Var = iw2Var2;
                                x81Var = new x81(y81Var4, i90, z4, f, of1VarJ0, f6, z7, j20Var, c81Var, v81Var3.d, r12, i16, i45, i58, qv1Var, i22, iT5);
                            } else {
                                y81 y81Var14 = (y81) du.w0(arrayList7);
                                numValueOf2 = y81Var14 != null ? Integer.valueOf(y81Var14.a) : null;
                                if (i67 >= i58 && i78 <= i59) {
                                    z4 = false;
                                }
                                of1 of1VarJ02 = iw2Var2.j0(gz.g(j3, iG5 + i21), gz.f(j3, iF + iT4), ce0Var, new m0(xk1Var4, arrayList7, (List) r8, z3));
                                int iIntValue3 = numValueOf == null ? numValueOf.intValue() : 0;
                                int iIntValue4 = numValueOf2 == null ? numValueOf2.intValue() : 0;
                                if (arrayList7.isEmpty()) {
                                    ArrayList arrayList10 = new ArrayList((Collection) r8);
                                    int size11 = arrayList7.size();
                                    for (int i111 = 0; i111 < size11; i111++) {
                                        y81 y81Var15 = (y81) arrayList7.get(i111);
                                        int i112 = y81Var15.a;
                                        if (iIntValue3 <= i112 && i112 <= iIntValue4) {
                                            arrayList10.add(y81Var15);
                                        }
                                    }
                                    hu.f0(arrayList10, rg3.k);
                                    r12 = arrayList10;
                                } else {
                                    r12 = r39;
                                }
                                iw2Var = iw2Var2;
                                x81Var = new x81(y81Var4, i90, z4, f, of1VarJ02, f6, z7, j20Var, c81Var, v81Var3.d, r12, i16, i45, i58, qv1Var, i22, iT5);
                            }
                        } else {
                            y81 y81Var16 = (y81) (agVar.isEmpty() ? null : agVar.i[agVar.h]);
                            if (y81Var16 != null) {
                                numValueOf = Integer.valueOf(y81Var16.a);
                            }
                            if (z2) {
                            }
                        }
                    }
                }
                d91Var.f(x81Var, iw2Var.u(), false);
                return x81Var;
            }
            i = iG2;
            i2 = iC2;
            i3 = iY;
            int iG42 = ((kx1) osVar.c).g();
            tl.U(vr2VarB, vr2VarK, in0VarE);
            g81Var = d91Var2.r;
            lmVar = d91Var2.o;
            zk1 zk1Var2 = lmVar.a;
            if (zk1Var2.j == 0) {
            }
            be0 be0Var2 = be0.h;
            if (z) {
                arrayList = new ArrayList();
                if (lmVar.a.j == 0) {
                }
                size = g81Var.h.size();
                while (i5 < size) {
                }
                i6 = c11Var.h;
                i7 = c11Var.i;
                if (i6 <= i7) {
                }
            }
            if (iw2Var2.u()) {
            }
            x71 x71Var2 = d91Var2.n;
            boolean zU2 = iw2Var2.u();
            j20 j20Var2 = w81Var.e;
            xk1 xk1Var22 = d91Var2.v;
            j51 j51Var2 = w81Var.f;
            if (iT3 < 0) {
            }
            if (i22 < 0) {
            }
            ce0 ce0Var2 = ce0.h;
            t81 t81Var22 = v81Var2.b;
            if (i2 > 0) {
            }
            d91Var.f(x81Var, iw2Var.u(), false);
            return x81Var;
        } catch (Throwable th) {
            tl.U(vr2VarB, vr2VarK, in0VarE);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03e6  */
    @Override // defpackage.mn0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2) {
        Object x92Var;
        int i;
        f13 f13Var;
        TextClassification textClassification;
        int i2 = this.h;
        eb ebVar = nx.a;
        final int i3 = 2;
        final int i4 = 1;
        Object obj3 = a83.a;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                se.g((in0) obj5, (in0) obj4, (px) obj, pp0.N(1));
                return obj3;
            case 1:
                zq zqVar = (zq) obj4;
                in0 in0Var = (in0) obj5;
                px pxVar = (px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sp0.i(zqVar.c, in0Var, fg1.G(rh1.a, 0.0f, 0.0f, 14.0f, 0.0f, 11), false, 0, go0Var, 384, 56);
                } else {
                    go0Var.R();
                }
                return obj3;
            case 2:
                ((Integer) obj2).getClass();
                ((n00) obj5).a((m00) obj4, (px) obj, pp0.N(1));
                return obj3;
            case 3:
                ry2 ry2Var = (ry2) obj5;
                cz2 cz2Var = (cz2) obj4;
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zF = go0Var2.f(ry2Var);
                    Object objL = go0Var2.L();
                    if (zF || objL == ebVar) {
                        objL = op0.m(new r6(0, ry2Var, ry2.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 1));
                        go0Var2.f0(objL);
                    }
                    k60.a(cz2Var, (qy2) ((gu2) objL).getValue(), go0Var2, 0);
                } else {
                    go0Var2.R();
                }
                return obj3;
            case 4:
                ((Integer) obj2).getClass();
                k60.a((cz2) obj5, (qy2) obj4, (px) obj, pp0.N(1));
                return obj3;
            case 5:
                a72 a72Var = (a72) obj5;
                b72 b72Var = (b72) obj4;
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                sz0 sz0Var = te.a;
                if (jLongValue2 > 0) {
                    int iD = ci0.D((int) ((100 * jLongValue) / jLongValue2), 0, 100);
                    if (iD != a72Var.h) {
                        a72Var.h = iD;
                        sz0Var.N(te.j0(R.string.nuke_core_dex_analysis_download_native_runtime_progress, Integer.valueOf(iD), te.A(jLongValue), te.A(jLongValue2)), Float.valueOf(((iD / 100.0f) * 0.25f) + 0.05f));
                    }
                } else {
                    long j = jLongValue / 1048576;
                    if (j != b72Var.h) {
                        b72Var.h = j;
                        sz0Var.N(te.j0(R.string.nuke_core_dex_analysis_download_native_runtime_size, te.A(jLongValue)), Float.valueOf(0.08f));
                    }
                }
                return obj3;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                z72 z72Var = (z72) obj5;
                tr2 tr2Var = (tr2) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                if (obj2 instanceof uw) {
                    z72Var.f.b((uw) obj2);
                } else if (!(obj2 instanceof ba2)) {
                    if (obj2 instanceof lo0) {
                        p7.K(tr2Var, iIntValue3, obj2);
                        z72Var.e((lo0) obj2);
                    } else if (obj2 instanceof b62) {
                        p7.K(tr2Var, iIntValue3, obj2);
                        ((b62) obj2).c();
                    }
                }
                return obj3;
            case 7:
                return HomeActivity.onCreate$lambda$0$17$0$0$2$0((Map) obj5, (xk1) obj4, (gx2) obj, ((Boolean) obj2).booleanValue());
            case 8:
                List list = (List) obj5;
                mn0 mn0Var = (mn0) obj4;
                px pxVar3 = (px) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) pxVar3;
                if (go0Var3.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int i5 = 0;
                    for (Object obj6 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            eu.a0();
                            throw null;
                        }
                        yp2 yp2Var = (yp2) obj6;
                        String strP = rg3.P(yp2Var.a, go0Var3);
                        kw kwVarI0 = xe1.i0(516358002, new s9(9, yp2Var), go0Var3);
                        String str = yp2Var.d;
                        ju juVar = yp2Var.e ? new ju(sp0.c(4292617766L)) : null;
                        boolean zF2 = go0Var3.f(mn0Var) | go0Var3.f(yp2Var);
                        Object objL2 = go0Var3.L();
                        if (zF2 || objL2 == ebVar) {
                            objL2 = new d2(15, mn0Var, yp2Var);
                            go0Var3.f0(objL2);
                        }
                        qp0.h(strP, null, null, null, kwVarI0, str, juVar, false, (in0) objL2, go0Var3, 24576, 142);
                        if (i5 < list.size() - 1) {
                            go0Var3.W(-1459329960);
                            ci0.f(64.0f, go0Var3, 6, 0);
                            go0Var3.p(false);
                        } else {
                            go0Var3.W(-1459267495);
                            go0Var3.p(false);
                        }
                        i5 = i6;
                    }
                } else {
                    go0Var3.R();
                }
                return obj3;
            case 9:
                Context context = (Context) obj5;
                mn0 mn0Var2 = (mn0) obj4;
                yp2 yp2Var2 = (yp2) obj;
                rs1 rs1Var = (rs1) obj2;
                yp2Var2.getClass();
                if (yp2Var2.a == R.string.home_settings_reward_us) {
                    context.getClass();
                    try {
                        Intent intent = new Intent(context, (Class<?>) up0.H("com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI"));
                        intent.putExtra("key_web_url", "");
                        intent.putExtra("key_scene", 2);
                        intent.putExtra("key_send_type", 2);
                        intent.putExtra("KEY_HOME_PAGE_CLS", "com.tencent.mm.ui.LauncherUI");
                        intent.putExtra("key_chat_type", 3);
                        intent.putExtra("key_channel", 13);
                        intent.putExtra("key_qrcode_url", "m0x1'W:GZO0Tv5_f;1W0Op");
                        context.startActivity(intent);
                        x92Var = obj3;
                    } catch (Throwable th) {
                        x92Var = new x92(th);
                    }
                    if (x92Var instanceof x92) {
                        mn0Var2.g(yp2Var2, rs1Var);
                    }
                }
                return obj3;
            case 10:
                gx2 gx2Var = (gx2) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                gx2Var.getClass();
                ((rs2) obj5).put(gx2Var.d(), bool);
                ((mn0) obj4).g(gx2Var, bool);
                return obj3;
            case 11:
                final xt0 xt0Var = (xt0) obj5;
                xm0 xm0Var = (xm0) obj4;
                px pxVar4 = (px) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                go0 go0Var4 = (go0) pxVar4;
                if (go0Var4.O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    final int i7 = 0;
                    sp0.g(xt0Var.b, null, xt0Var.e + "\n" + xt0Var.a.d(), xe1.i0(-803223509, new mn0() { // from class: vt0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj7, Object obj8) {
                            int i8 = i7;
                            a83 a83Var = a83.a;
                            xt0 xt0Var2 = xt0Var;
                            px pxVar5 = (px) obj7;
                            int iIntValue6 = ((Integer) obj8).intValue();
                            switch (i8) {
                                case 0:
                                    go0 go0Var5 = (go0) pxVar5;
                                    if (!go0Var5.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        go0Var5.R();
                                    } else {
                                        s11.l(xt0Var2.d, go0Var5, 0);
                                    }
                                    break;
                                default:
                                    go0 go0Var6 = (go0) pxVar5;
                                    if (!go0Var6.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        go0Var6.R();
                                    } else {
                                        s11.m(xt0Var2.d, go0Var6, 0);
                                    }
                                    break;
                            }
                            return a83Var;
                        }
                    }, go0Var4), xe1.i0(-1843515348, new mn0() { // from class: vt0
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // defpackage.mn0
                        public final Object g(Object obj7, Object obj8) {
                            int i8 = i4;
                            a83 a83Var = a83.a;
                            xt0 xt0Var2 = xt0Var;
                            px pxVar5 = (px) obj7;
                            int iIntValue6 = ((Integer) obj8).intValue();
                            switch (i8) {
                                case 0:
                                    go0 go0Var5 = (go0) pxVar5;
                                    if (!go0Var5.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        go0Var5.R();
                                    } else {
                                        s11.l(xt0Var2.d, go0Var5, 0);
                                    }
                                    break;
                                default:
                                    go0 go0Var6 = (go0) pxVar5;
                                    if (!go0Var6.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        go0Var6.R();
                                    } else {
                                        s11.m(xt0Var2.d, go0Var6, 0);
                                    }
                                    break;
                            }
                            return a83Var;
                        }
                    }, go0Var4), null, false, xm0Var, null, go0Var4, 27648, 354);
                } else {
                    go0Var4.R();
                }
                return obj3;
            case 12:
                ((Integer) obj2).getClass();
                s11.i((List) obj4, (in0) obj5, (px) obj, pp0.N(1));
                return obj3;
            case 13:
                z71 z71Var = (z71) obj5;
                y71 y71Var = (y71) obj4;
                Object obj7 = y71Var.a;
                px pxVar5 = (px) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                go0 go0Var5 = (go0) pxVar5;
                if (go0Var5.O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    t81 t81Var = (t81) z71Var.b.a();
                    int iG = y71Var.c;
                    if (iG >= t81Var.c() || !t81Var.d(iG).equals(obj7)) {
                        iG = t81Var.d.g(obj7);
                        i = -1;
                        if (iG != -1) {
                            y71Var.c = iG;
                        }
                    } else {
                        i = -1;
                    }
                    int i8 = iG;
                    if (i8 != i) {
                        go0Var5.W(-1664741271);
                        se.s(t81Var, z71Var.a, i8, obj7, go0Var5, 0);
                        go0Var5.p(false);
                    } else {
                        go0Var5.W(-1664505826);
                        go0Var5.p(false);
                    }
                    boolean zH = go0Var5.h(y71Var);
                    Object objL3 = go0Var5.L();
                    if (zH || objL3 == ebVar) {
                        objL3 = new v(11, y71Var);
                        go0Var5.f0(objL3);
                    }
                    eu.c(obj7, (in0) objL3, go0Var5);
                } else {
                    go0Var5.R();
                }
                return obj3;
            case 14:
                return d(obj, obj2);
            case 15:
                kw kwVar = (kw) obj5;
                g91 g91Var = (g91) obj4;
                px pxVar6 = (px) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                go0 go0Var6 = (go0) pxVar6;
                if (go0Var6.O(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    kwVar.e(g91Var, go0Var6, 0);
                } else {
                    go0Var6.R();
                }
                return obj3;
            case 16:
                xf2 xf2Var = (xf2) obj5;
                yk2 yk2Var = (yk2) obj4;
                Activity activity = (Activity) obj;
                final in0 in0Var2 = (in0) obj2;
                activity.getClass();
                in0Var2.getClass();
                AlertDialog.Builder builder = new AlertDialog.Builder(activity);
                String str2 = xf2Var.a;
                if (str2 == null) {
                    str2 = yk2Var.b;
                }
                AlertDialog.Builder title = builder.setTitle(str2);
                ar1 ar1Var = ar1.h;
                String str3 = xf2Var.b;
                AlertDialog alertDialogCreate = title.setMessage("来自脚本：" + yk2Var.b + "\n\n" + str3).setPositiveButton(xf2Var.c, new DialogInterface.OnClickListener() { // from class: vq1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        int i10 = i4;
                        in0 in0Var3 = in0Var2;
                        switch (i10) {
                            case 0:
                                in0Var3.j(a83.a);
                                break;
                            case 1:
                                in0Var3.j(Boolean.TRUE);
                                break;
                            default:
                                in0Var3.j(Boolean.FALSE);
                                break;
                        }
                    }
                }).setNegativeButton(xf2Var.d, new DialogInterface.OnClickListener() { // from class: vq1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        int i10 = i3;
                        in0 in0Var3 = in0Var2;
                        switch (i10) {
                            case 0:
                                in0Var3.j(a83.a);
                                break;
                            case 1:
                                in0Var3.j(Boolean.TRUE);
                                break;
                            default:
                                in0Var3.j(Boolean.FALSE);
                                break;
                        }
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: wq1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        int i9 = i4;
                        in0 in0Var3 = in0Var2;
                        switch (i9) {
                            case 0:
                                in0Var3.j(a83.a);
                                break;
                            default:
                                in0Var3.j(Boolean.FALSE);
                                break;
                        }
                    }
                }).create();
                alertDialogCreate.getClass();
                return alertDialogCreate;
            case 17:
                jd2 jd2Var = (jd2) obj5;
                yk2 yk2Var2 = (yk2) obj4;
                Activity activity2 = (Activity) obj;
                final in0 in0Var3 = (in0) obj2;
                activity2.getClass();
                in0Var3.getClass();
                AlertDialog.Builder builder2 = new AlertDialog.Builder(activity2);
                String str4 = jd2Var.a;
                if (str4 == null) {
                    str4 = yk2Var2.b;
                }
                AlertDialog.Builder title2 = builder2.setTitle(str4);
                ar1 ar1Var2 = ar1.h;
                String str5 = jd2Var.b;
                final int i9 = 0;
                AlertDialog alertDialogCreate2 = title2.setMessage("来自脚本：" + yk2Var2.b + "\n\n" + str5).setPositiveButton(jd2Var.c, new DialogInterface.OnClickListener() { // from class: vq1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i92) {
                        int i10 = i9;
                        in0 in0Var32 = in0Var3;
                        switch (i10) {
                            case 0:
                                in0Var32.j(a83.a);
                                break;
                            case 1:
                                in0Var32.j(Boolean.TRUE);
                                break;
                            default:
                                in0Var32.j(Boolean.FALSE);
                                break;
                        }
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: wq1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        int i92 = i9;
                        in0 in0Var32 = in0Var3;
                        switch (i92) {
                            case 0:
                                in0Var32.j(a83.a);
                                break;
                            default:
                                in0Var32.j(Boolean.FALSE);
                                break;
                        }
                    }
                }).create();
                alertDialogCreate2.getClass();
                return alertDialogCreate2;
            case 18:
                ((Integer) obj2).getClass();
                rg3.h((uh1) obj5, (kw) obj4, (px) obj, pp0.N(49));
                return obj3;
            case 19:
                ((Integer) obj2).getClass();
                ((gd3) obj5).a((Drawable) obj4, (px) obj, pp0.N(49));
                return obj3;
            case AIChatConfig.MaxContextRounds /* 20 */:
                b03 b03Var = (b03) obj5;
                j20 j20Var = (j20) obj4;
                oy2 oy2Var = (oy2) obj;
                Context context2 = (Context) obj2;
                boolean zJ = b03Var.j();
                sd sdVarM = b03Var.m();
                String str6 = sdVarM != null ? sdVarM.i : null;
                f13 f13Var2 = b03Var.w;
                if (f13Var2 != null) {
                    long j2 = f13Var2.a;
                    us1 us1Var = b03Var.b;
                    f13Var = new f13(fg1.i(us1Var.p((int) (j2 >> 32)), us1Var.p((int) (j2 & 4294967295L))));
                } else {
                    f13Var = null;
                }
                p02 p02Var = b03Var.j;
                m0 m0Var = new m0(b03Var, j20Var, context2, 14);
                tu2 tu2Var = r02.a;
                if (Build.VERSION.SDK_INT < 28 || str6 == null || f13Var == null || p02Var == null || !(p02Var instanceof p02)) {
                    m0Var.j(oy2Var);
                    if (str6 != null && f13Var != null) {
                        te.l(oy2Var, context2, zJ, str6, f13Var.a);
                    }
                } else {
                    long j3 = f13Var.a;
                    Object obj8 = p02Var.h;
                    kl1 kl1Var = p02Var.e;
                    if (kl1Var.e()) {
                        ny2 ny2Var = (ny2) p02Var.g.getValue();
                        TextClassification textClassification2 = (ny2Var != null && f13.b(j3, ny2Var.b) && t11.l(str6, ny2Var.a)) ? ny2Var.c : null;
                        kl1Var.f(null);
                        textClassification = textClassification2;
                    } else {
                        textClassification = null;
                    }
                    if (textClassification == null) {
                        m0Var.j(oy2Var);
                    } else {
                        if (!textClassification.getActions().isEmpty()) {
                            oy2Var.a.a(new dz2(obj8, textClassification, 0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            oy2Var.a.a(new dz2(obj8, textClassification, -1));
                        }
                        m0Var.j(oy2Var);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            if (i10 > 0) {
                                oy2Var.a.a(new dz2(obj8, textClassification, i10));
                            }
                        }
                    }
                    te.l(oy2Var, context2, zJ, str6, f13Var.a);
                }
                return obj3;
            case 21:
                ((Integer) obj2).getClass();
                v03.a((m13) obj5, (kw) obj4, (px) obj, pp0.N(1));
                return obj3;
            default:
                ((Integer) obj2).getClass();
                ((y33) obj5).a(obj4, (px) obj, pp0.N(1));
                return obj3;
        }
    }

    public /* synthetic */ af(int i, Object obj, Object obj2) {
        this.h = i;
        this.i = obj;
        this.j = obj2;
    }

    public /* synthetic */ af(zq zqVar, in0 in0Var) {
        this.h = 1;
        this.j = zqVar;
        this.i = in0Var;
    }

    public /* synthetic */ af(int i, int i2, Object obj, Object obj2) {
        this.h = i2;
        this.i = obj;
        this.j = obj2;
    }
}
