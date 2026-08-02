package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;
import nuke.p003ui.HomeActivity;

/* JADX INFO: renamed from: af */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0016af implements mn0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f179h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f180i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f181j;

    public /* synthetic */ C0016af(List list, in0 in0Var, int i) {
        this.f179h = 12;
        this.f181j = list;
        this.f180i = in0Var;
    }

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
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m144d(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        g81 g81Var;
        C0429lm c0429lm;
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
        int iM6225a;
        Object obj3;
        int i19;
        int iMax2;
        int i20;
        int iM6283c;
        boolean zM2041a = h11.m2041a(0L, 0L);
        z71 z71Var = (z71) this.f180i;
        w81 w81Var = (w81) this.f181j;
        iw2 iw2Var2 = (iw2) obj;
        c81 c81Var2 = new c81(z71Var, iw2Var2);
        long j3 = ((C0221fz) obj2).f3199a;
        w81Var.getClass();
        InterfaceC0921yf interfaceC0921yf = w81Var.f12400d;
        jw1 jw1Var = w81Var.f12398b;
        d91 d91Var2 = w81Var.f12397a;
        xk1 xk1Var = d91Var2.f1934s;
        C0554os c0554os = d91Var2.f1920e;
        xk1Var.getValue();
        boolean z5 = d91Var2.f1917b || iw2Var2.mo699u();
        qv1 qv1Var = qv1.f9205h;
        AbstractC0731te.m5228p(j3, qv1Var);
        d61 layoutDirection = iw2Var2.getLayoutDirection();
        d61 d61Var = d61.f1885h;
        int iMo692T = iw2Var2.mo692T(layoutDirection == d61Var ? jw1Var.f5244a : jw1Var.f5246c);
        int iMo692T2 = iw2Var2.mo692T(iw2Var2.getLayoutDirection() == d61Var ? jw1Var.f5246c : jw1Var.f5244a);
        int iMo692T3 = iw2Var2.mo692T(jw1Var.f5245b);
        int iMo692T4 = iw2Var2.mo692T(jw1Var.f5247d) + iMo692T3;
        int i21 = iMo692T2 + iMo692T;
        int i22 = iMo692T4 - iMo692T3;
        long jM2035i = AbstractC0258gz.m2035i(-i21, -iMo692T4, j3);
        t81 t81Var = (t81) w81Var.f12399c.mo6a();
        o71 o71Var = t81Var.f10609c;
        int iM1763h = C0221fz.m1763h(jM2035i);
        int iM1762g = C0221fz.m1762g(jM2035i);
        o71Var.f7571a.m2760h(iM1763h);
        o71Var.f7572b.m2760h(iM1762g);
        if (interfaceC0921yf == null) {
            nz0.m3457b("null verticalArrangement when isVertical == true");
            C0676s.m4644b();
            return null;
        }
        int iMo692T5 = iw2Var2.mo692T(interfaceC0921yf.mo5883b());
        int iM5133c = t81Var.m5133c();
        int iM1762g2 = C0221fz.m1762g(j3) - iMo692T4;
        v81 v81Var2 = new v81(jM2035i, t81Var, c81Var2, iM5133c, iMo692T5, w81Var.f12403g, iMo692T3, i22, (((long) iMo692T) << 32) | (((long) iMo692T3) & 4294967295L), w81Var.f12397a);
        vr2 vr2VarM5275B = AbstractC0738tl.m5275B();
        in0 in0VarMo77e = vr2VarM5275B != null ? vr2VarM5275B.mo77e() : null;
        vr2 vr2VarM5283K = AbstractC0738tl.m5283K(vr2VarM5275B);
        try {
            int iM2759g = ((kx1) c0554os.f7821b).m2759g();
            int iM5242y = AbstractC0731te.m5242y(iM2759g, t81Var, c0554os.f7823d);
            if (iM2759g != iM5242y) {
                i = iM1762g2;
                ((kx1) c0554os.f7821b).m2760h(iM5242y);
                d81 d81Var = (d81) c0554os.f7824e;
                i2 = iM5133c;
                if (iM2759g != d81Var.f1910i) {
                    d81Var.f1910i = iM2759g;
                    int i23 = (iM2759g / 30) * 30;
                    i3 = iM5242y;
                    d81Var.f1909h.setValue(ci0.m799X(Math.max(i23 - 100, 0), i23 + 130));
                }
                int iM2759g2 = ((kx1) c0554os.f7822c).m2759g();
                AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
                g81Var = d91Var2.f1933r;
                c0429lm = d91Var2.f1930o;
                zk1 zk1Var = c0429lm.f6190a;
                z = zk1Var.f13936j == 0;
                be0 be0Var = be0.f819h;
                if (z && g81Var.f3351h.isEmpty()) {
                    i4 = iM2759g2;
                    arrayList = be0Var;
                    r39 = arrayList;
                } else {
                    arrayList = new ArrayList();
                    if (c0429lm.f6190a.f13936j == 0) {
                        int i24 = zk1Var.f13936j;
                        if (i24 == 0) {
                            um2.m5519i("MutableVector is empty.");
                            return null;
                        }
                        i4 = iM2759g2;
                        Object[] objArr = zk1Var.f13934h;
                        r39 = be0Var;
                        int i25 = ((p71) objArr[0]).f8011a;
                        int i26 = 0;
                        while (i26 < i24) {
                            int i27 = i26;
                            int i28 = ((p71) objArr[i26]).f8011a;
                            if (i28 < i25) {
                                i25 = i28;
                            }
                            i26 = i27 + 1;
                        }
                        if (i25 < 0) {
                            nz0.m3456a("negative minIndex");
                        }
                        int i29 = zk1Var.f13936j;
                        if (i29 == 0) {
                            um2.m5519i("MutableVector is empty.");
                            return null;
                        }
                        Object[] objArr2 = zk1Var.f13934h;
                        int i30 = ((p71) objArr2[0]).f8012b;
                        int i31 = 0;
                        while (i31 < i29) {
                            Object[] objArr3 = objArr2;
                            int i32 = ((p71) objArr2[i31]).f8012b;
                            if (i32 > i30) {
                                i30 = i32;
                            }
                            i31++;
                            objArr2 = objArr3;
                        }
                        c11Var = new c11(i25, Math.min(i30, t81Var.m5133c() - 1), 1);
                    } else {
                        i4 = iM2759g2;
                        r39 = be0Var;
                        c11Var = c11.f1105k;
                    }
                    size = g81Var.f3351h.size();
                    for (i5 = 0; i5 < size; i5++) {
                        e81 e81Var = (e81) g81Var.get(i5);
                        int iM5242y2 = AbstractC0731te.m5242y(e81Var.f2346c, t81Var, e81Var.f2344a);
                        int i33 = c11Var.f25h;
                        if ((iM5242y2 > c11Var.f26i || i33 > iM5242y2) && iM5242y2 >= 0 && iM5242y2 < t81Var.m5133c()) {
                            arrayList.add(Integer.valueOf(iM5242y2));
                        }
                    }
                    i6 = c11Var.f25h;
                    i7 = c11Var.f26i;
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
                float fFloatValue = (iw2Var2.mo699u() && z5) ? ((Number) ((C0310id) d91Var2.f1938w.f10437j).f4561i.getValue()).floatValue() : d91Var2.f1923h;
                x71 x71Var = d91Var2.f1929n;
                boolean zMo699u = iw2Var2.mo699u();
                j20 j20Var = w81Var.f12401e;
                xk1 xk1Var2 = d91Var2.f1937v;
                j51 j51Var = w81Var.f12402f;
                if (iMo692T3 < 0) {
                    nz0.m3456a("invalid beforeContentPadding");
                }
                if (i22 < 0) {
                    nz0.m3456a("invalid afterContentPadding");
                }
                ce0 ce0Var = ce0.f1492h;
                t81 t81Var2 = v81Var2.f11822b;
                if (i2 > 0) {
                    int iM1765j = C0221fz.m1765j(jM2035i);
                    int iM1764i = C0221fz.m1764i(jM2035i);
                    x71Var.m6042b(iM1765j, iM1764i, new ArrayList(), t81Var2.f10610d, v81Var2, zMo699u, z5, 0, 0);
                    if (!zMo699u) {
                        x71Var.m6041a();
                        if (!zM2041a) {
                            iM1765j = AbstractC0258gz.m2033g(jM2035i, 0);
                            iM1764i = AbstractC0258gz.m2032f(jM2035i, 0);
                        }
                    }
                    x81Var = new x81(null, 0, false, 0.0f, iw2Var2.mo696j0(AbstractC0258gz.m2033g(j3, iM1765j + i21), AbstractC0258gz.m2032f(j3, iM1764i + iMo692T4), ce0Var, new C0829w(24)), 0.0f, false, j20Var, c81Var2, v81Var2.f11824d, r39, -iMo692T3, i + i22, 0, qv1Var, i22, iMo692T5);
                    d91Var = d91Var2;
                    iw2Var = iw2Var2;
                } else {
                    float f2 = fFloatValue;
                    int i34 = i3;
                    int i35 = i2;
                    if (i34 >= i35) {
                        i34 = i35 - 1;
                        i4 = 0;
                    }
                    int iRound = Math.round(f2);
                    int i36 = i4 - iRound;
                    if (i34 == 0 && i36 < 0) {
                        iRound += i36;
                        i36 = 0;
                    }
                    int i37 = i34;
                    C0017ag c0017ag = new C0017ag();
                    d91Var = d91Var2;
                    int i38 = -iMo692T3;
                    int i39 = i38 + (iMo692T5 < 0 ? iMo692T5 : 0);
                    int i40 = i36 + i39;
                    int iMax3 = 0;
                    while (true) {
                        j = v81Var2.f11824d;
                        if (i40 >= 0 || i37 <= 0) {
                            break;
                        }
                        xk1 xk1Var3 = xk1Var2;
                        int i41 = i37 - 1;
                        y81 y81VarM5654a = v81Var2.m5654a(j, i41);
                        c0017ag.add(0, y81VarM5654a);
                        iMax3 = Math.max(iMax3, y81VarM5654a.f13359m);
                        i40 += y81VarM5654a.f13358l;
                        i37 = i41;
                        xk1Var2 = xk1Var3;
                    }
                    xk1 xk1Var4 = xk1Var2;
                    if (i40 < i39) {
                        iRound -= i39 - i40;
                        i40 = i39;
                    }
                    int i42 = iRound;
                    int i43 = i40 - i39;
                    int i44 = i + i22;
                    int i45 = iMax3;
                    int i46 = i44 < 0 ? 0 : i44;
                    int i47 = i38;
                    int i48 = -i43;
                    int i49 = i43;
                    int i50 = i37;
                    int i51 = 0;
                    boolean z6 = false;
                    while (i51 < c0017ag.f190j) {
                        if (i48 >= i46) {
                            c0017ag.mo153b(i51);
                            z6 = true;
                        } else {
                            i50++;
                            i48 += ((y81) c0017ag.get(i51)).f13358l;
                            i51++;
                        }
                    }
                    int i52 = i45;
                    int i53 = i50;
                    boolean z7 = z6;
                    while (i53 < i35 && (i48 < i46 || i48 <= 0 || c0017ag.isEmpty())) {
                        int i54 = i46;
                        y81 y81VarM5654a2 = v81Var2.m5654a(j, i53);
                        int i55 = i35;
                        int i56 = y81VarM5654a2.f13358l;
                        i48 += i56;
                        if (i48 > i39 || i53 == i55 - 1) {
                            int iMax4 = Math.max(i52, y81VarM5654a2.f13359m);
                            c0017ag.addLast(y81VarM5654a2);
                            i52 = iMax4;
                        } else {
                            i49 -= i56;
                            i37 = i53 + 1;
                            z7 = true;
                        }
                        i53++;
                        i46 = i54;
                        i35 = i55;
                    }
                    int i57 = i35;
                    int i58 = i;
                    if (i48 < i58) {
                        int i59 = i58 - i48;
                        int i60 = i48 + i59;
                        iMax = i52;
                        i11 = i49 - i59;
                        while (i11 < iMo692T3 && i37 > 0) {
                            int i61 = i60;
                            int i62 = i37 - 1;
                            int i63 = i59;
                            y81 y81VarM5654a3 = v81Var2.m5654a(j, i62);
                            i37 = i62;
                            c0017ag.add(0, y81VarM5654a3);
                            iMax = Math.max(iMax, y81VarM5654a3.f13359m);
                            i11 += y81VarM5654a3.f13358l;
                            i60 = i61;
                            i59 = i63;
                        }
                        int i64 = i60;
                        i8 = i42 + i59;
                        if (i11 < 0) {
                            i8 += i11;
                            i48 = i64 + i11;
                            i9 = iMo692T3;
                            i10 = i37;
                            i11 = 0;
                        } else {
                            i48 = i64;
                            i9 = iMo692T3;
                            i10 = i37;
                        }
                    } else {
                        i8 = i42;
                        iMax = i52;
                        i9 = iMo692T3;
                        i10 = i37;
                        i11 = i49;
                    }
                    int i65 = iMax;
                    int i66 = i53;
                    float f3 = (Integer.signum(Math.round(f2)) != Integer.signum(i8) || Math.abs(Math.round(f2)) < Math.abs(i8)) ? f2 : i8;
                    float f4 = f2 - f3;
                    float f5 = 0.0f;
                    if (zMo699u && i8 > i42 && f4 <= 0.0f) {
                        f5 = (i8 - i42) + f4;
                    }
                    float f6 = f5;
                    if (i11 < 0) {
                        nz0.m3456a("negative currentFirstItemScrollOffset");
                    }
                    int i67 = -i11;
                    if (c0017ag.isEmpty()) {
                        um2.m5519i("ArrayDeque is empty.");
                        return null;
                    }
                    y81 y81Var2 = (y81) c0017ag.f189i[c0017ag.f188h];
                    if (i9 > 0 || iMo692T5 < 0) {
                        int iMo152a = c0017ag.mo152a();
                        y81 y81Var3 = y81Var2;
                        int i68 = i11;
                        int i69 = 0;
                        while (true) {
                            if (i69 >= iMo152a) {
                                i12 = i68;
                                i13 = i67;
                                break;
                            }
                            i13 = i67;
                            int i70 = ((y81) c0017ag.get(i69)).f13358l;
                            if (i68 == 0 || i70 > i68) {
                                break;
                            }
                            i12 = i68;
                            if (i69 == c0017ag.mo152a() - 1) {
                                break;
                            }
                            i68 = i12 - i70;
                            i69++;
                            y81Var3 = (y81) c0017ag.get(i69);
                            i67 = i13;
                        }
                        i12 = i68;
                        y81Var = y81Var3;
                        i11 = i12;
                    } else {
                        i13 = i67;
                        y81Var = y81Var2;
                    }
                    int iMax5 = Math.max(0, i10);
                    int i71 = i10 - 1;
                    if (iMax5 <= i71) {
                        arrayList2 = 0;
                        while (true) {
                            if (arrayList2 == 0) {
                                arrayList2 = new ArrayList();
                            }
                            i14 = i11;
                            arrayList2.add(v81Var2.m5654a(j, i71));
                            if (i71 == iMax5) {
                                break;
                            }
                            i71--;
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
                            int i72 = size2 - 1;
                            int iIntValue = ((Number) arrayList.get(size2)).intValue();
                            ?? arrayList4 = r3;
                            arrayList2 = r3;
                            if (iIntValue < iMax5) {
                                if (r3 == 0) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(v81Var2.m5654a(j, iIntValue));
                                arrayList2 = arrayList4;
                            }
                            if (i72 < 0) {
                                break;
                            }
                            size2 = i72;
                            r3 = arrayList2;
                        }
                    }
                    if (arrayList2 == 0) {
                        arrayList2 = r39;
                    }
                    int iMax6 = i65;
                    int i73 = 0;
                    for (int size3 = arrayList2.size(); i73 < size3; size3 = size3) {
                        iMax6 = Math.max(iMax6, ((y81) arrayList2.get(i73)).f13359m);
                        i73++;
                    }
                    int iMin = Math.min(((y81) AbstractC0142du.m1166v0(c0017ag)).f13347a, i57 - 1);
                    int i74 = ((y81) AbstractC0142du.m1166v0(c0017ag)).f13347a + 1;
                    if (i74 <= iMin) {
                        ArrayList arrayList5 = null;
                        while (true) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            f = f3;
                            arrayList3 = arrayList5;
                            i15 = iMax6;
                            arrayList3.add(v81Var2.m5654a(j, i74));
                            if (i74 == iMin) {
                                break;
                            }
                            i74++;
                            iMax6 = i15;
                            arrayList5 = arrayList3;
                            f3 = f;
                        }
                    } else {
                        f = f3;
                        i15 = iMax6;
                        arrayList3 = null;
                    }
                    if (arrayList3 != null && ((y81) AbstractC0142du.m1166v0(arrayList3)).f13347a > iMin) {
                        iMin = ((y81) AbstractC0142du.m1166v0(arrayList3)).f13347a;
                    }
                    int size4 = arrayList.size();
                    ArrayList arrayList6 = arrayList3;
                    int i75 = 0;
                    ?? r10 = arrayList;
                    while (i75 < size4) {
                        ?? r52 = r10;
                        int iIntValue2 = ((Number) r10.get(i75)).intValue();
                        if (iIntValue2 > iMin) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(v81Var2.m5654a(j, iIntValue2));
                        }
                        i75++;
                        r10 = r52;
                    }
                    ?? r122 = arrayList6 == null ? r39 : arrayList6;
                    int size5 = r122.size();
                    int iMax7 = i15;
                    for (int i76 = 0; i76 < size5; i76++) {
                        iMax7 = Math.max(iMax7, ((y81) r122.get(i76)).f13359m);
                    }
                    if (c0017ag.isEmpty()) {
                        um2.m5519i("ArrayDeque is empty.");
                        return null;
                    }
                    boolean z8 = t11.m5086l(y81Var, c0017ag.f189i[c0017ag.f188h]) && arrayList2.isEmpty() && r122.isEmpty();
                    int iM2033g = AbstractC0258gz.m2033g(jM2035i, iMax7);
                    int iM2032f = AbstractC0258gz.m2032f(jM2035i, i48);
                    boolean z9 = i48 < Math.min(iM2032f, i58);
                    if (z9 && i13 != 0) {
                        nz0.m3458c("non-zero itemsScrollOffset");
                    }
                    int i77 = i48;
                    y81 y81Var4 = y81Var;
                    ArrayList arrayList7 = new ArrayList(r122.size() + arrayList2.size() + c0017ag.mo152a());
                    if (z9) {
                        if (!arrayList2.isEmpty() || !r122.isEmpty()) {
                            nz0.m3456a("no extra items");
                        }
                        int iMo152a2 = c0017ag.mo152a();
                        int[] iArr2 = new int[iMo152a2];
                        for (int i78 = 0; i78 < iMo152a2; i78++) {
                            iArr2[i78] = ((y81) c0017ag.get(i78)).f13357k;
                        }
                        int[] iArr3 = new int[iMo152a2];
                        if (interfaceC0921yf == null) {
                            nz0.m3457b("null verticalArrangement when isVertical == true");
                            C0676s.m4644b();
                            return null;
                        }
                        interfaceC0921yf.mo5670f(iM2032f, c81Var2, iArr2, iArr3);
                        v81Var = v81Var2;
                        c11 c11Var2 = new c11(0, iMo152a2 - 1, 1);
                        int i79 = c11Var2.f26i;
                        int i80 = c11Var2.f27j;
                        if ((i80 > 0 && i79 >= 0) || (i80 < 0 && i79 <= 0)) {
                            int i81 = 0;
                            while (true) {
                                int i82 = iArr3[i81];
                                int i83 = i80;
                                y81 y81Var5 = (y81) c0017ag.get(i81);
                                y81Var5.m6227c(i82, iM2033g, iM2032f);
                                arrayList7.add(y81Var5);
                                if (i81 == i79) {
                                    break;
                                }
                                i81 += i83;
                                i80 = i83;
                            }
                        }
                    } else {
                        v81Var = v81Var2;
                        int size6 = arrayList2.size();
                        int i84 = i13;
                        int i85 = 0;
                        ?? r32 = arrayList2;
                        while (i85 < size6) {
                            ?? r53 = r32;
                            y81 y81Var6 = (y81) r32.get(i85);
                            i84 -= y81Var6.f13358l;
                            y81Var6.m6227c(i84, iM2033g, iM2032f);
                            arrayList7.add(y81Var6);
                            i85++;
                            size6 = size6;
                            r32 = r53;
                        }
                        int iMo152a3 = c0017ag.mo152a();
                        int i86 = i13;
                        for (int i87 = 0; i87 < iMo152a3; i87++) {
                            y81 y81Var7 = (y81) c0017ag.get(i87);
                            y81Var7.m6227c(i86, iM2033g, iM2032f);
                            arrayList7.add(y81Var7);
                            i86 += y81Var7.f13358l;
                        }
                        int size7 = r122.size();
                        for (int i88 = 0; i88 < size7; i88++) {
                            y81 y81Var8 = (y81) r122.get(i88);
                            y81Var8.m6227c(i86, iM2033g, iM2032f);
                            arrayList7.add(y81Var8);
                            i86 += y81Var8.f13358l;
                        }
                    }
                    int i89 = i14;
                    x71Var.m6042b(iM2033g, iM2032f, arrayList7, t81Var2.f10610d, v81Var, zMo699u, z5, i89, i77);
                    v81 v81Var3 = v81Var;
                    boolean z10 = zMo699u;
                    if (!z10) {
                        x71Var.m6041a();
                        if (zM2041a) {
                            z2 = z8;
                        } else {
                            iM2033g = AbstractC0258gz.m2033g(jM2035i, Math.max(iM2033g, 0));
                            z2 = z8;
                            int iM2032f2 = AbstractC0258gz.m2032f(jM2035i, Math.max(iM2032f, 0));
                            if (iM2032f2 != iM2032f) {
                                int size8 = arrayList7.size();
                                for (int i90 = 0; i90 < size8; i90++) {
                                    ((y81) arrayList7.get(i90)).f13361o = iM2032f2;
                                }
                            }
                            iM2032f = iM2032f2;
                        }
                        y81 y81Var9 = (y81) (c0017ag.isEmpty() ? null : c0017ag.f189i[c0017ag.f188h]);
                        int i91 = y81Var9 != null ? y81Var9.f13347a : 0;
                        y81 y81Var10 = (y81) c0017ag.m157f();
                        int i92 = y81Var10 != null ? y81Var10.f13347a : 0;
                        t81Var2.f10608b.getClass();
                        yj1 yj1Var2 = w01.f12239a;
                        if (j51Var == null || arrayList7.isEmpty() || (i17 = yj1Var2.f13491b) == 0) {
                            z3 = z10;
                            c81Var = c81Var2;
                            i16 = i47;
                            z4 = true;
                            r8 = r39;
                        } else {
                            if (i92 - i91 < 0 || i17 == 0) {
                                c81Var = c81Var2;
                                yj1Var = yj1Var2;
                            } else {
                                c11 c11VarM799X = ci0.m799X(0, i17);
                                int i93 = c11VarM799X.f25h;
                                int i94 = c11VarM799X.f26i;
                                c81Var = c81Var2;
                                if (i93 <= i94) {
                                    iM6283c = -1;
                                    while (yj1Var2.m6283c(i93) <= i91) {
                                        iM6283c = yj1Var2.m6283c(i93);
                                        if (i93 == i94) {
                                            break;
                                        }
                                        i93++;
                                    }
                                    i20 = -1;
                                } else {
                                    i20 = -1;
                                    iM6283c = -1;
                                }
                                if (iM6283c == i20) {
                                    yj1Var = w01.f12239a;
                                } else {
                                    yj1Var = new yj1(1);
                                    yj1Var.m6281a(iM6283c);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList();
                            ArrayList arrayList9 = new ArrayList(arrayList7.size());
                            int size9 = arrayList7.size();
                            int i95 = 0;
                            while (i95 < size9) {
                                int i96 = size9;
                                Object obj4 = arrayList7.get(i95);
                                int i97 = i95;
                                int i98 = ((y81) obj4).f13347a;
                                boolean z11 = z10;
                                int[] iArr4 = yj1Var2.f13490a;
                                int i99 = yj1Var2.f13491b;
                                yj1 yj1Var3 = yj1Var2;
                                int i100 = 0;
                                while (true) {
                                    if (i100 < i99) {
                                        int i101 = i99;
                                        if (iArr4[i100] == i98) {
                                            arrayList9.add(obj4);
                                            break;
                                        }
                                        i100++;
                                        i99 = i101;
                                    }
                                }
                                i95 = i97 + 1;
                                size9 = i96;
                                z10 = z11;
                                yj1Var2 = yj1Var3;
                            }
                            z3 = z10;
                            int[] iArr5 = yj1Var.f13490a;
                            int i102 = yj1Var.f13491b;
                            int i103 = 0;
                            while (i103 < i102) {
                                int i104 = iArr5[i103];
                                Iterator it = arrayList7.iterator();
                                int i105 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        iArr = iArr5;
                                        i18 = -1;
                                        break;
                                    }
                                    iArr = iArr5;
                                    if (((y81) it.next()).f13347a == i104) {
                                        i18 = i105;
                                        break;
                                    }
                                    i105++;
                                    iArr5 = iArr;
                                }
                                y81 y81VarM5654a4 = i18 == -1 ? v81Var3.m5654a(j, i104) : (y81) arrayList7.remove(i18);
                                int i106 = i102;
                                int i107 = y81VarM5654a4.f13358l;
                                if (i18 == -1) {
                                    j2 = j;
                                    iM6225a = Integer.MIN_VALUE;
                                } else {
                                    j2 = j;
                                    iM6225a = (int) (y81VarM5654a4.m6225a(0) & 4294967295L);
                                }
                                int size10 = arrayList9.size();
                                int i108 = 0;
                                while (true) {
                                    if (i108 >= size10) {
                                        obj3 = null;
                                        break;
                                    }
                                    obj3 = arrayList9.get(i108);
                                    int i109 = size10;
                                    if (((y81) obj3).f13347a != i104) {
                                        break;
                                    }
                                    i108++;
                                    size10 = i109;
                                }
                                y81 y81Var11 = (y81) obj3;
                                int iM6225a2 = y81Var11 != null ? (int) (y81Var11.m6225a(0) & 4294967295L) : Integer.MIN_VALUE;
                                if (iM6225a == Integer.MIN_VALUE) {
                                    iMax2 = i47;
                                    i19 = iMax2;
                                } else {
                                    i19 = i47;
                                    iMax2 = Math.max(i19, iM6225a);
                                }
                                if (iM6225a2 != Integer.MIN_VALUE) {
                                    iMax2 = Math.min(iMax2, iM6225a2 - i107);
                                }
                                y81VarM5654a4.f13360n = true;
                                y81VarM5654a4.m6227c(iMax2, iM2033g, iM2032f);
                                arrayList8.add(y81VarM5654a4);
                                i103++;
                                i47 = i19;
                                i102 = i106;
                                iArr5 = iArr;
                                j = j2;
                            }
                            i16 = i47;
                            z4 = true;
                            r8 = arrayList8;
                        }
                        if (z2) {
                            y81 y81Var12 = (y81) AbstractC0142du.m1161q0(arrayList7);
                            numValueOf = y81Var12 != null ? Integer.valueOf(y81Var12.f13347a) : null;
                            if (z2) {
                                y81 y81Var13 = (y81) c0017ag.m157f();
                                if (y81Var13 != null) {
                                    numValueOf2 = Integer.valueOf(y81Var13.f13347a);
                                }
                                if (i66 >= i57) {
                                    z4 = false;
                                }
                                of1 of1VarMo696j0 = iw2Var2.mo696j0(AbstractC0258gz.m2033g(j3, iM2033g + i21), AbstractC0258gz.m2032f(j3, iM2032f + iMo692T4), ce0Var, new C0444m0(xk1Var4, arrayList7, (List) r8, z3));
                                if (numValueOf == null) {
                                }
                                if (numValueOf2 == null) {
                                }
                                if (arrayList7.isEmpty()) {
                                }
                                iw2Var = iw2Var2;
                                x81Var = new x81(y81Var4, i89, z4, f, of1VarMo696j0, f6, z7, j20Var, c81Var, v81Var3.f11824d, r12, i16, i44, i57, qv1Var, i22, iMo692T5);
                            } else {
                                y81 y81Var14 = (y81) AbstractC0142du.m1167w0(arrayList7);
                                numValueOf2 = y81Var14 != null ? Integer.valueOf(y81Var14.f13347a) : null;
                                if (i66 >= i57 && i77 <= i58) {
                                    z4 = false;
                                }
                                of1 of1VarMo696j02 = iw2Var2.mo696j0(AbstractC0258gz.m2033g(j3, iM2033g + i21), AbstractC0258gz.m2032f(j3, iM2032f + iMo692T4), ce0Var, new C0444m0(xk1Var4, arrayList7, (List) r8, z3));
                                int iIntValue3 = numValueOf == null ? numValueOf.intValue() : 0;
                                int iIntValue4 = numValueOf2 == null ? numValueOf2.intValue() : 0;
                                if (arrayList7.isEmpty()) {
                                    ArrayList arrayList10 = new ArrayList((Collection) r8);
                                    int size11 = arrayList7.size();
                                    for (int i110 = 0; i110 < size11; i110++) {
                                        y81 y81Var15 = (y81) arrayList7.get(i110);
                                        int i111 = y81Var15.f13347a;
                                        if (iIntValue3 <= i111 && i111 <= iIntValue4) {
                                            arrayList10.add(y81Var15);
                                        }
                                    }
                                    AbstractC0290hu.m2231f0(arrayList10, rg3.f9569k);
                                    r12 = arrayList10;
                                } else {
                                    r12 = r39;
                                }
                                iw2Var = iw2Var2;
                                x81Var = new x81(y81Var4, i89, z4, f, of1VarMo696j02, f6, z7, j20Var, c81Var, v81Var3.f11824d, r12, i16, i44, i57, qv1Var, i22, iMo692T5);
                            }
                        } else {
                            y81 y81Var16 = (y81) (c0017ag.isEmpty() ? null : c0017ag.f189i[c0017ag.f188h]);
                            if (y81Var16 != null) {
                                numValueOf = Integer.valueOf(y81Var16.f13347a);
                            }
                            if (z2) {
                            }
                        }
                    }
                }
                d91Var.m972f(x81Var, iw2Var.mo699u(), false);
                return x81Var;
            }
            i = iM1762g2;
            i2 = iM5133c;
            i3 = iM5242y;
            int iM2759g22 = ((kx1) c0554os.f7822c).m2759g();
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
            g81Var = d91Var2.f1933r;
            c0429lm = d91Var2.f1930o;
            zk1 zk1Var2 = c0429lm.f6190a;
            if (zk1Var2.f13936j == 0) {
            }
            be0 be0Var2 = be0.f819h;
            if (z) {
                arrayList = new ArrayList();
                if (c0429lm.f6190a.f13936j == 0) {
                }
                size = g81Var.f3351h.size();
                while (i5 < size) {
                }
                i6 = c11Var.f25h;
                i7 = c11Var.f26i;
                if (i6 <= i7) {
                }
            }
            if (iw2Var2.mo699u()) {
            }
            x71 x71Var2 = d91Var2.f1929n;
            boolean zMo699u2 = iw2Var2.mo699u();
            j20 j20Var2 = w81Var.f12401e;
            xk1 xk1Var22 = d91Var2.f1937v;
            j51 j51Var2 = w81Var.f12402f;
            if (iMo692T3 < 0) {
            }
            if (i22 < 0) {
            }
            ce0 ce0Var2 = ce0.f1492h;
            t81 t81Var22 = v81Var2.f11822b;
            if (i2 > 0) {
            }
            d91Var.m972f(x81Var, iw2Var.mo699u(), false);
            return x81Var;
        } catch (Throwable th) {
            AbstractC0738tl.m5292U(vr2VarM5275B, vr2VarM5283K, in0VarMo77e);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x03e6  */
    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12g(Object obj, Object obj2) {
        Object x92Var;
        int i;
        f13 f13Var;
        TextClassification textClassification;
        int i2 = this.f179h;
        C0160eb c0160eb = C0520nx.f7360a;
        final int i3 = 2;
        final int i4 = 1;
        Object obj3 = a83.f116a;
        Object obj4 = this.f181j;
        Object obj5 = this.f180i;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0691se.m4836g((in0) obj5, (in0) obj4, (InterfaceC0596px) obj, pp0.m3902N(1));
                return obj3;
            case 1:
                C0971zq c0971zq = (C0971zq) obj4;
                in0 in0Var = (in0) obj5;
                InterfaceC0596px interfaceC0596px = (InterfaceC0596px) obj;
                int iIntValue = ((Integer) obj2).intValue();
                go0 go0Var = (go0) interfaceC0596px;
                if (go0Var.m1958O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    sp0.m4944i(c0971zq.f14024c, in0Var, fg1.m1615G(rh1.f9587a, 0.0f, 0.0f, 14.0f, 0.0f, 11), false, 0, go0Var, 384, 56);
                } else {
                    go0Var.m1961R();
                }
                return obj3;
            case 2:
                ((Integer) obj2).getClass();
                ((n00) obj5).m3224a((m00) obj4, (InterfaceC0596px) obj, pp0.m3902N(1));
                return obj3;
            case 3:
                ry2 ry2Var = (ry2) obj5;
                cz2 cz2Var = (cz2) obj4;
                InterfaceC0596px interfaceC0596px2 = (InterfaceC0596px) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                go0 go0Var2 = (go0) interfaceC0596px2;
                if (go0Var2.m1958O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zM1980f = go0Var2.m1980f(ry2Var);
                    Object objM1956L = go0Var2.m1956L();
                    if (zM1980f || objM1956L == c0160eb) {
                        objM1956L = op0.m3590m(new C0645r6(0, ry2Var, ry2.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 1));
                        go0Var2.m1981f0(objM1956L);
                    }
                    k60.m2606a(cz2Var, (qy2) ((gu2) objM1956L).getValue(), go0Var2, 0);
                } else {
                    go0Var2.m1961R();
                }
                return obj3;
            case 4:
                ((Integer) obj2).getClass();
                k60.m2606a((cz2) obj5, (qy2) obj4, (InterfaceC0596px) obj, pp0.m3902N(1));
                return obj3;
            case 5:
                a72 a72Var = (a72) obj5;
                b72 b72Var = (b72) obj4;
                long jLongValue = ((Long) obj).longValue();
                long jLongValue2 = ((Long) obj2).longValue();
                sz0 sz0Var = AbstractC0731te.f10689a;
                if (jLongValue2 > 0) {
                    int iM779D = ci0.m779D((int) ((100 * jLongValue) / jLongValue2), 0, 100);
                    if (iM779D != a72Var.f108h) {
                        a72Var.f108h = iM779D;
                        sz0Var.m5041N(AbstractC0731te.m5217j0(R.string.nuke_core_dex_analysis_download_native_runtime_progress, Integer.valueOf(iM779D), AbstractC0731te.m5173A(jLongValue), AbstractC0731te.m5173A(jLongValue2)), Float.valueOf(((iM779D / 100.0f) * 0.25f) + 0.05f));
                    }
                } else {
                    long j = jLongValue / 1048576;
                    if (j != b72Var.f722h) {
                        b72Var.f722h = j;
                        sz0Var.m5041N(AbstractC0731te.m5217j0(R.string.nuke_core_dex_analysis_download_native_runtime_size, AbstractC0731te.m5173A(jLongValue)), Float.valueOf(0.08f));
                    }
                }
                return obj3;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                z72 z72Var = (z72) obj5;
                tr2 tr2Var = (tr2) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                if (obj2 instanceof InterfaceC0788uw) {
                    z72Var.f13773f.m6423b((InterfaceC0788uw) obj2);
                } else if (!(obj2 instanceof ba2)) {
                    if (obj2 instanceof lo0) {
                        AbstractC0570p7.m3755K(tr2Var, iIntValue3, obj2);
                        z72Var.m6394e((lo0) obj2);
                    } else if (obj2 instanceof b62) {
                        AbstractC0570p7.m3755K(tr2Var, iIntValue3, obj2);
                        ((b62) obj2).m443c();
                    }
                }
                return obj3;
            case 7:
                return HomeActivity.onCreate$lambda$0$17$0$0$2$0((Map) obj5, (xk1) obj4, (gx2) obj, ((Boolean) obj2).booleanValue());
            case 8:
                List list = (List) obj5;
                mn0 mn0Var = (mn0) obj4;
                InterfaceC0596px interfaceC0596px3 = (InterfaceC0596px) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                go0 go0Var3 = (go0) interfaceC0596px3;
                if (go0Var3.m1958O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    int i5 = 0;
                    for (Object obj6 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            AbstractC0179eu.m1447a0();
                            throw null;
                        }
                        yp2 yp2Var = (yp2) obj6;
                        String strM4462P = rg3.m4462P(yp2Var.f13555a, go0Var3);
                        C0402kw c0402kwM6126i0 = xe1.m6126i0(516358002, new C0686s9(9, yp2Var), go0Var3);
                        String str = yp2Var.f13558d;
                        C0363ju c0363ju = yp2Var.f13559e ? new C0363ju(sp0.m4932c(4292617766L)) : null;
                        boolean zM1980f2 = go0Var3.m1980f(mn0Var) | go0Var3.m1980f(yp2Var);
                        Object objM1956L2 = go0Var3.m1956L();
                        if (zM1980f2 || objM1956L2 == c0160eb) {
                            objM1956L2 = new C0115d2(15, mn0Var, yp2Var);
                            go0Var3.m1981f0(objM1956L2);
                        }
                        qp0.m4253h(strM4462P, null, null, null, c0402kwM6126i0, str, c0363ju, false, (in0) objM1956L2, go0Var3, 24576, 142);
                        if (i5 < list.size() - 1) {
                            go0Var3.m1966W(-1459329960);
                            ci0.m805f(64.0f, go0Var3, 6, 0);
                            go0Var3.m1994p(false);
                        } else {
                            go0Var3.m1966W(-1459267495);
                            go0Var3.m1994p(false);
                        }
                        i5 = i6;
                    }
                } else {
                    go0Var3.m1961R();
                }
                return obj3;
            case 9:
                Context context = (Context) obj5;
                mn0 mn0Var2 = (mn0) obj4;
                yp2 yp2Var2 = (yp2) obj;
                rs1 rs1Var = (rs1) obj2;
                yp2Var2.getClass();
                if (yp2Var2.f13555a == R.string.home_settings_reward_us) {
                    context.getClass();
                    try {
                        Intent intent = new Intent(context, (Class<?>) up0.m5529H("com.tencent.mm.plugin.collect.reward.ui.QrRewardSelectMoneyUI"));
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
                        mn0Var2.mo12g(yp2Var2, rs1Var);
                    }
                }
                return obj3;
            case 10:
                gx2 gx2Var = (gx2) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                gx2Var.getClass();
                ((rs2) obj5).put(gx2Var.mo9d(), bool);
                ((mn0) obj4).mo12g(gx2Var, bool);
                return obj3;
            case 11:
                final xt0 xt0Var = (xt0) obj5;
                xm0 xm0Var = (xm0) obj4;
                InterfaceC0596px interfaceC0596px4 = (InterfaceC0596px) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                go0 go0Var4 = (go0) interfaceC0596px4;
                if (go0Var4.m1958O(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    final int i7 = 0;
                    sp0.m4940g(xt0Var.f13168b, null, xt0Var.f13171e + "\n" + xt0Var.f13167a.mo9d(), xe1.m6126i0(-803223509, new mn0() { // from class: vt0
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj7, Object obj8) {
                            int i8 = i7;
                            a83 a83Var = a83.f116a;
                            xt0 xt0Var2 = xt0Var;
                            InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj7;
                            int iIntValue6 = ((Integer) obj8).intValue();
                            switch (i8) {
                                case 0:
                                    go0 go0Var5 = (go0) interfaceC0596px5;
                                    if (!go0Var5.m1958O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        go0Var5.m1961R();
                                    } else {
                                        s11.m4704l(xt0Var2.f13170d, go0Var5, 0);
                                    }
                                    break;
                                default:
                                    go0 go0Var6 = (go0) interfaceC0596px5;
                                    if (!go0Var6.m1958O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        go0Var6.m1961R();
                                    } else {
                                        s11.m4706m(xt0Var2.f13170d, go0Var6, 0);
                                    }
                                    break;
                            }
                            return a83Var;
                        }
                    }, go0Var4), xe1.m6126i0(-1843515348, new mn0() { // from class: vt0
                        @Override // p000.mn0
                        /* JADX INFO: renamed from: g */
                        public final Object mo12g(Object obj7, Object obj8) {
                            int i8 = i4;
                            a83 a83Var = a83.f116a;
                            xt0 xt0Var2 = xt0Var;
                            InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj7;
                            int iIntValue6 = ((Integer) obj8).intValue();
                            switch (i8) {
                                case 0:
                                    go0 go0Var5 = (go0) interfaceC0596px5;
                                    if (!go0Var5.m1958O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        go0Var5.m1961R();
                                    } else {
                                        s11.m4704l(xt0Var2.f13170d, go0Var5, 0);
                                    }
                                    break;
                                default:
                                    go0 go0Var6 = (go0) interfaceC0596px5;
                                    if (!go0Var6.m1958O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                                        go0Var6.m1961R();
                                    } else {
                                        s11.m4706m(xt0Var2.f13170d, go0Var6, 0);
                                    }
                                    break;
                            }
                            return a83Var;
                        }
                    }, go0Var4), null, false, xm0Var, null, go0Var4, 27648, 354);
                } else {
                    go0Var4.m1961R();
                }
                return obj3;
            case 12:
                ((Integer) obj2).getClass();
                s11.m4698i((List) obj4, (in0) obj5, (InterfaceC0596px) obj, pp0.m3902N(1));
                return obj3;
            case 13:
                z71 z71Var = (z71) obj5;
                y71 y71Var = (y71) obj4;
                Object obj7 = y71Var.f13331a;
                InterfaceC0596px interfaceC0596px5 = (InterfaceC0596px) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                go0 go0Var5 = (go0) interfaceC0596px5;
                if (go0Var5.m1958O(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    t81 t81Var = (t81) z71Var.f13766b.mo6a();
                    int iM1300g = y71Var.f13333c;
                    if (iM1300g >= t81Var.m5133c() || !t81Var.m5134d(iM1300g).equals(obj7)) {
                        iM1300g = t81Var.f10610d.m1300g(obj7);
                        i = -1;
                        if (iM1300g != -1) {
                            y71Var.f13333c = iM1300g;
                        }
                    } else {
                        i = -1;
                    }
                    int i8 = iM1300g;
                    if (i8 != i) {
                        go0Var5.m1966W(-1664741271);
                        AbstractC0691se.m4848s(t81Var, z71Var.f13765a, i8, obj7, go0Var5, 0);
                        go0Var5.m1994p(false);
                    } else {
                        go0Var5.m1966W(-1664505826);
                        go0Var5.m1994p(false);
                    }
                    boolean zM1984h = go0Var5.m1984h(y71Var);
                    Object objM1956L3 = go0Var5.m1956L();
                    if (zM1984h || objM1956L3 == c0160eb) {
                        objM1956L3 = new C0792v(11, y71Var);
                        go0Var5.m1981f0(objM1956L3);
                    }
                    AbstractC0179eu.m1450c(obj7, (in0) objM1956L3, go0Var5);
                } else {
                    go0Var5.m1961R();
                }
                return obj3;
            case 14:
                return m144d(obj, obj2);
            case 15:
                C0402kw c0402kw = (C0402kw) obj5;
                g91 g91Var = (g91) obj4;
                InterfaceC0596px interfaceC0596px6 = (InterfaceC0596px) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                go0 go0Var6 = (go0) interfaceC0596px6;
                if (go0Var6.m1958O(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    c0402kw.mo489e(g91Var, go0Var6, 0);
                } else {
                    go0Var6.m1961R();
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
                String str2 = xf2Var.f13010a;
                if (str2 == null) {
                    str2 = yk2Var.f13503b;
                }
                AlertDialog.Builder title = builder.setTitle(str2);
                ar1 ar1Var = ar1.f359h;
                String str3 = xf2Var.f13011b;
                AlertDialog alertDialogCreate = title.setMessage("来自脚本：" + yk2Var.f13503b + "\n\n" + str3).setPositiveButton(xf2Var.f13012c, new DialogInterface.OnClickListener() { // from class: vq1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        int i10 = i4;
                        in0 in0Var3 = in0Var2;
                        switch (i10) {
                            case 0:
                                in0Var3.mo5j(a83.f116a);
                                break;
                            case 1:
                                in0Var3.mo5j(Boolean.TRUE);
                                break;
                            default:
                                in0Var3.mo5j(Boolean.FALSE);
                                break;
                        }
                    }
                }).setNegativeButton(xf2Var.f13013d, new DialogInterface.OnClickListener() { // from class: vq1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i9) {
                        int i10 = i3;
                        in0 in0Var3 = in0Var2;
                        switch (i10) {
                            case 0:
                                in0Var3.mo5j(a83.f116a);
                                break;
                            case 1:
                                in0Var3.mo5j(Boolean.TRUE);
                                break;
                            default:
                                in0Var3.mo5j(Boolean.FALSE);
                                break;
                        }
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: wq1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        int i9 = i4;
                        in0 in0Var3 = in0Var2;
                        switch (i9) {
                            case 0:
                                in0Var3.mo5j(a83.f116a);
                                break;
                            default:
                                in0Var3.mo5j(Boolean.FALSE);
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
                String str4 = jd2Var.f4986a;
                if (str4 == null) {
                    str4 = yk2Var2.f13503b;
                }
                AlertDialog.Builder title2 = builder2.setTitle(str4);
                ar1 ar1Var2 = ar1.f359h;
                String str5 = jd2Var.f4987b;
                final int i9 = 0;
                AlertDialog alertDialogCreate2 = title2.setMessage("来自脚本：" + yk2Var2.f13503b + "\n\n" + str5).setPositiveButton(jd2Var.f4988c, new DialogInterface.OnClickListener() { // from class: vq1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i92) {
                        int i10 = i9;
                        in0 in0Var32 = in0Var3;
                        switch (i10) {
                            case 0:
                                in0Var32.mo5j(a83.f116a);
                                break;
                            case 1:
                                in0Var32.mo5j(Boolean.TRUE);
                                break;
                            default:
                                in0Var32.mo5j(Boolean.FALSE);
                                break;
                        }
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: wq1
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        int i92 = i9;
                        in0 in0Var32 = in0Var3;
                        switch (i92) {
                            case 0:
                                in0Var32.mo5j(a83.f116a);
                                break;
                            default:
                                in0Var32.mo5j(Boolean.FALSE);
                                break;
                        }
                    }
                }).create();
                alertDialogCreate2.getClass();
                return alertDialogCreate2;
            case 18:
                ((Integer) obj2).getClass();
                rg3.m4472h((uh1) obj5, (C0402kw) obj4, (InterfaceC0596px) obj, pp0.m3902N(49));
                return obj3;
            case 19:
                ((Integer) obj2).getClass();
                ((gd3) obj5).m1839a((Drawable) obj4, (InterfaceC0596px) obj, pp0.m3902N(49));
                return obj3;
            case AIChatConfig.MaxContextRounds /* 20 */:
                b03 b03Var = (b03) obj5;
                j20 j20Var = (j20) obj4;
                oy2 oy2Var = (oy2) obj;
                Context context2 = (Context) obj2;
                boolean zM346j = b03Var.m346j();
                C0690sd c0690sdM349m = b03Var.m349m();
                String str6 = c0690sdM349m != null ? c0690sdM349m.f10051i : null;
                f13 f13Var2 = b03Var.f502w;
                if (f13Var2 != null) {
                    long j2 = f13Var2.f2739a;
                    us1 us1Var = b03Var.f481b;
                    f13Var = new f13(fg1.m1636i(us1Var.mo2451p((int) (j2 >> 32)), us1Var.mo2451p((int) (j2 & 4294967295L))));
                } else {
                    f13Var = null;
                }
                p02 p02Var = b03Var.f489j;
                C0444m0 c0444m0 = new C0444m0(b03Var, j20Var, context2, 14);
                tu2 tu2Var = r02.f9309a;
                if (Build.VERSION.SDK_INT < 28 || str6 == null || f13Var == null || p02Var == null || !(p02Var instanceof p02)) {
                    c0444m0.mo5j(oy2Var);
                    if (str6 != null && f13Var != null) {
                        AbstractC0731te.m5220l(oy2Var, context2, zM346j, str6, f13Var.f2739a);
                    }
                } else {
                    long j3 = f13Var.f2739a;
                    Object obj8 = p02Var.f7914h;
                    kl1 kl1Var = p02Var.f7911e;
                    if (kl1Var.m2721e()) {
                        ny2 ny2Var = (ny2) p02Var.f7913g.getValue();
                        TextClassification textClassification2 = (ny2Var != null && f13.m1493b(j3, ny2Var.f7370b) && t11.m5086l(str6, ny2Var.f7369a)) ? ny2Var.f7371c : null;
                        kl1Var.m2722f(null);
                        textClassification = textClassification2;
                    } else {
                        textClassification = null;
                    }
                    if (textClassification == null) {
                        c0444m0.mo5j(oy2Var);
                    } else {
                        if (!textClassification.getActions().isEmpty()) {
                            oy2Var.f7885a.m2925a(new dz2(obj8, textClassification, 0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            oy2Var.f7885a.m2925a(new dz2(obj8, textClassification, -1));
                        }
                        c0444m0.mo5j(oy2Var);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            if (i10 > 0) {
                                oy2Var.f7885a.m2925a(new dz2(obj8, textClassification, i10));
                            }
                        }
                    }
                    AbstractC0731te.m5220l(oy2Var, context2, zM346j, str6, f13Var.f2739a);
                }
                return obj3;
            case 21:
                ((Integer) obj2).getClass();
                v03.m5600a((m13) obj5, (C0402kw) obj4, (InterfaceC0596px) obj, pp0.m3902N(1));
                return obj3;
            default:
                ((Integer) obj2).getClass();
                ((y33) obj5).m6211a(obj4, (InterfaceC0596px) obj, pp0.m3902N(1));
                return obj3;
        }
    }

    public /* synthetic */ C0016af(int i, Object obj, Object obj2) {
        this.f179h = i;
        this.f180i = obj;
        this.f181j = obj2;
    }

    public /* synthetic */ C0016af(C0971zq c0971zq, in0 in0Var) {
        this.f179h = 1;
        this.f181j = c0971zq;
        this.f180i = in0Var;
    }

    public /* synthetic */ C0016af(int i, int i2, Object obj, Object obj2) {
        this.f179h = i2;
        this.f180i = obj;
        this.f181j = obj2;
    }
}
