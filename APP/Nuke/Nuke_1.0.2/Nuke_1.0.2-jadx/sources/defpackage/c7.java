package defpackage;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class c7 extends n4 {
    public final /* synthetic */ h7 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(h7 h7Var) {
        super(0);
        this.j = h7Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n4
    public final void i(int i, l4 l4Var, String str, Bundle bundle) {
        this.j.c(i, l4Var, str, bundle);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:634:0x0306 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:637:0x0350 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:643:0x03b5 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:650:0x041c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:660:0x07ed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x075e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x07e6 A[LOOP:9: B:365:0x07c9->B:376:0x07e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:387:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x09f3  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0a89  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0aa2  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0c40  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:604:0x0c51  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0c6e  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0c9b  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x07ed A[EDGE_INSN: B:660:0x07ed->B:378:0x07ed BREAK  A[LOOP:9: B:365:0x07c9->B:376:0x07e6], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v100 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28, types: [h7] */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v5, types: [h7] */
    /* JADX WARN: Type inference failed for: r13v0, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v51 */
    /* JADX WARN: Type inference failed for: r13v53 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v115 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r2v22, types: [be0] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1 */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r3v104 */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v107 */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v19, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v60 */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r3v78, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v81, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v82 */
    /* JADX WARN: Type inference failed for: r3v83, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v89, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v90, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r44v1 */
    /* JADX WARN: Type inference failed for: r44v2, types: [java.lang.Throwable, l4] */
    /* JADX WARN: Type inference failed for: r44v3 */
    /* JADX WARN: Type inference failed for: r4v5, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r5v100 */
    /* JADX WARN: Type inference failed for: r5v101 */
    /* JADX WARN: Type inference failed for: r5v102 */
    /* JADX WARN: Type inference failed for: r5v103 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v53 */
    /* JADX WARN: Type inference failed for: r6v54 */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r8v119 */
    /* JADX WARN: Type inference failed for: r8v120 */
    /* JADX WARN: Type inference failed for: r8v121 */
    /* JADX WARN: Type inference failed for: r8v122 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v45, types: [r61] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v47, types: [r61] */
    /* JADX WARN: Type inference failed for: r8v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v56 */
    @Override // defpackage.n4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l4 l(int i) {
        ?? r44;
        xj1 xj1Var;
        h7 h7Var;
        b7 b7Var;
        nt2 nt2Var;
        qn2 qn2Var;
        rk1 rk1Var;
        Resources resources;
        r61 r61Var;
        ln2 ln2Var;
        ?? r35;
        ?? r0;
        ?? r3;
        int i2;
        h7 h7Var2;
        boolean z;
        ?? r12;
        qn2 qn2VarL;
        boolean z2;
        q3 q3Var;
        q3 q3Var2;
        q3 q3Var3;
        String strM;
        ArrayList arrayList;
        CharSequence charSequenceE;
        s32 s32Var;
        Object objG;
        ?? r1;
        el2 el2Var;
        el2 el2Var2;
        int i3;
        int iD;
        ?? r32;
        b7 b7Var2;
        int iD2;
        String str;
        l4 l4Var;
        ic icVarV;
        Object objG2;
        ?? r33;
        Object objG3;
        ?? r5;
        r61 r61Var2;
        boolean zL;
        boolean z3;
        boolean z4;
        boolean zBooleanValue;
        ?? arrayList2;
        ?? arrayList3;
        int i4;
        boolean zL2;
        qn2 qn2Var2;
        ?? r122;
        Float fValueOf = Float.valueOf(0.0f);
        h7 h7Var3 = this.j;
        AccessibilityManager accessibilityManager = h7Var3.n;
        b7 b7Var3 = h7Var3.k;
        if (((la1) b7Var3.getComposeViewContext().c.getLifecycle()).h == aa1.h) {
            l4Var = !accessibilityManager.isEnabled() ? new l4(AccessibilityNodeInfo.obtain()) : null;
            i2 = i;
            r122 = h7Var3;
        } else {
            sn2 sn2Var = (sn2) h7Var3.l().b(i);
            if (sn2Var == null) {
                if (!accessibilityManager.isEnabled()) {
                    l4Var = new l4(AccessibilityNodeInfo.obtain());
                }
                i2 = i;
                r122 = h7Var3;
            } else {
                qn2 qn2Var3 = sn2Var.a;
                ln2 ln2VarK = qn2Var3.k();
                r61 r61Var3 = qn2Var3.c;
                Object objG4 = ln2VarK.h.g(vn2.o);
                if (objG4 == null) {
                    objG4 = null;
                }
                boolean zL3 = t11.l(objG4, Boolean.TRUE);
                if (!zL3) {
                    ?? Obtain = AccessibilityNodeInfo.obtain();
                    l4 l4Var2 = new l4(Obtain);
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 34) {
                        u3.g(Obtain, zL3);
                        r44 = 0;
                    } else {
                        r44 = 0;
                        l4Var2.f(64, zL3);
                    }
                    if (i == -1) {
                        Object parentForAccessibility = b7Var3.getParentForAccessibility();
                        ?? r13 = parentForAccessibility instanceof View ? (View) parentForAccessibility : r44;
                        l4Var2.b = -1;
                        Obtain.setParent(r13);
                    } else {
                        qn2 qn2VarL2 = qn2Var3.l();
                        ?? ValueOf = qn2VarL2 != null ? Integer.valueOf(qn2VarL2.f) : r44;
                        if (ValueOf == 0) {
                            kz0.c("semanticsNode " + i + " has null parent");
                            s.b();
                            return null;
                        }
                        int iIntValue = ValueOf.intValue();
                        if (iIntValue == b7Var3.getSemanticsOwner().a().f) {
                            iIntValue = -1;
                        }
                        l4Var2.b = iIntValue;
                        Obtain.setParent(b7Var3, iIntValue);
                    }
                    l4Var2.c = i;
                    Obtain.setSource(b7Var3, i);
                    Obtain.setBoundsInScreen(h7Var3.d(sn2Var));
                    xj1 xj1Var2 = h7Var3.Q;
                    nt2 nt2Var2 = h7Var3.z;
                    Resources resources2 = b7Var3.getContext().getResources();
                    l4Var2.g("android.view.View");
                    ln2 ln2Var2 = qn2Var3.d;
                    rk1 rk1Var2 = ln2Var2.h;
                    if (rk1Var2.c(vn2.G)) {
                        l4Var2.g("android.widget.EditText");
                    }
                    if (rk1Var2.c(vn2.C)) {
                        l4Var2.g("android.widget.TextView");
                    }
                    Object objG5 = rk1Var2.g(vn2.z);
                    ?? r11 = objG5;
                    if (objG5 == null) {
                        r11 = r44;
                    }
                    if (((va2) r11) != null && ((qn2Var3.o() || qn2.j(4, qn2Var3).isEmpty()) && (qn2Var3.q() || ln2Var2.j))) {
                        l4Var2.g("android.widget.ImageView");
                    }
                    Obtain.setPackageName(b7Var3.getContext().getPackageName());
                    Obtain.setImportantForAccessibility(xe1.M(qn2Var3));
                    boolean zE = i5 >= 34 ? u3.e(accessibilityManager) : true;
                    List listJ = qn2.j(4, qn2Var3);
                    int size = listJ.size();
                    boolean z5 = zE;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size) {
                        int i8 = i6;
                        qn2 qn2Var4 = (qn2) listJ.get(i6);
                        List list = listJ;
                        x01 x01VarL = h7Var3.l();
                        int i9 = size;
                        int i10 = qn2Var4.f;
                        if (x01VarL.a(i10)) {
                            ic icVar = b7Var3.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(qn2Var4.c);
                            if (i10 != -1) {
                                if (icVar != null) {
                                    Obtain.addChild(icVar);
                                } else {
                                    sn2 sn2Var2 = (sn2) h7Var3.l().b(i10);
                                    if (sn2Var2 == null || (qn2Var2 = sn2Var2.a) == null) {
                                        zL2 = false;
                                    } else {
                                        Object objG6 = qn2Var2.k().h.g(vn2.o);
                                        ?? r2 = objG6;
                                        if (objG6 == null) {
                                            r2 = r44;
                                        }
                                        zL2 = t11.l(r2, Boolean.TRUE);
                                    }
                                    if (z5 || !zL2) {
                                        Obtain.addChild(b7Var3, i10);
                                    }
                                }
                                xj1Var2.f(i10, i7);
                                i7++;
                            }
                        }
                        i6 = i8 + 1;
                        listJ = list;
                        size = i9;
                    }
                    int i11 = h7Var3.r;
                    ?? r4 = l4Var2.a;
                    if (i == i11) {
                        r4.setAccessibilityFocused(true);
                        l4Var2.a(f4.d);
                    } else {
                        r4.setAccessibilityFocused(false);
                        l4Var2.a(f4.c);
                    }
                    sd sdVarB = rg3.B(qn2Var3);
                    if (sdVarB != null) {
                        b7Var3.getFontFamilyResolver();
                        e70 density = b7Var3.getDensity();
                        vu2 vu2Var = h7Var3.M;
                        b7Var = b7Var3;
                        String str2 = sdVarB.i;
                        nt2Var = nt2Var2;
                        List list2 = sdVarB.h;
                        SpannableString spannableString = new SpannableString(str2);
                        ArrayList arrayList4 = sdVarB.j;
                        if (arrayList4 != null) {
                            int size2 = arrayList4.size();
                            r61Var = r61Var3;
                            int i12 = 0;
                            Obtain = Obtain;
                            while (i12 < size2) {
                                ArrayList arrayList5 = arrayList4;
                                rd rdVar = (rd) arrayList4.get(i12);
                                int i13 = size2;
                                lt2 lt2Var = (lt2) rdVar.a;
                                int i14 = i12;
                                int i15 = rdVar.b;
                                int i16 = rdVar.c;
                                h7 h7Var4 = h7Var3;
                                xj1 xj1Var3 = xj1Var2;
                                long jB = lt2Var.a.b();
                                ln2 ln2Var3 = ln2Var2;
                                ?? r34 = Obtain;
                                long j = lt2Var.b;
                                im0 im0Var = lt2Var.c;
                                gm0 gm0Var = lt2Var.d;
                                m03 m03Var = lt2Var.j;
                                kc1 kc1Var = lt2Var.k;
                                qn2 qn2Var5 = qn2Var3;
                                rk1 rk1Var3 = rk1Var2;
                                long j2 = lt2Var.l;
                                gz2 gz2Var = lt2Var.m;
                                l03 wuVar = lt2Var.a;
                                Resources resources3 = resources2;
                                if (!ju.c(jB, wuVar.b())) {
                                    wuVar = jB != 16 ? new wu(jB) : sn.U;
                                }
                                eu.W(spannableString, wuVar.b(), i15, i16);
                                SpannableString spannableString2 = spannableString;
                                eu.X(spannableString2, j, density, i15, i16);
                                if (im0Var == null && gm0Var == null) {
                                    i4 = 33;
                                } else {
                                    StyleSpan styleSpan = new StyleSpan(tl.A(im0Var == null ? im0.j : im0Var, gm0Var != null ? gm0Var.a : 0));
                                    i4 = 33;
                                    spannableString2.setSpan(styleSpan, i15, i16, 33);
                                }
                                if (gz2Var != null) {
                                    int i17 = gz2Var.a;
                                    if ((i17 | 1) == i17) {
                                        spannableString2.setSpan(new UnderlineSpan(), i15, i16, i4);
                                    }
                                    if ((i17 | 2) == i17) {
                                        spannableString2.setSpan(new StrikethroughSpan(), i15, i16, i4);
                                    }
                                }
                                if (m03Var != null) {
                                    spannableString2.setSpan(new ScaleXSpan(m03Var.a), i15, i16, i4);
                                }
                                eu.Y(spannableString2, kc1Var, i15, i16);
                                if (j2 != 16) {
                                    spannableString2.setSpan(new BackgroundColorSpan(sp0.j0(j2)), i15, i16, i4);
                                }
                                i12 = i14 + 1;
                                spannableString = spannableString2;
                                arrayList4 = arrayList5;
                                size2 = i13;
                                h7Var3 = h7Var4;
                                xj1Var2 = xj1Var3;
                                ln2Var2 = ln2Var3;
                                Obtain = r34;
                                qn2Var3 = qn2Var5;
                                rk1Var2 = rk1Var3;
                                resources2 = resources3;
                            }
                        } else {
                            r61Var = r61Var3;
                        }
                        xj1Var = xj1Var2;
                        h7Var = h7Var3;
                        qn2Var = qn2Var3;
                        rk1Var = rk1Var2;
                        resources = resources2;
                        ln2Var = ln2Var2;
                        r35 = Obtain;
                        SpannableString spannableString3 = spannableString;
                        int length = str2.length();
                        ?? arrayList6 = be0.h;
                        if (list2 != null) {
                            arrayList2 = new ArrayList(list2.size());
                            int size3 = list2.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                Object obj = list2.get(i18);
                                rd rdVar2 = (rd) obj;
                                if ((rdVar2.a instanceof ha3) && td.b(0, length, rdVar2.b, rdVar2.c)) {
                                    arrayList2.add(obj);
                                }
                            }
                        } else {
                            arrayList2 = arrayList6;
                        }
                        int size4 = arrayList2.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            rd rdVar3 = (rd) arrayList2.get(i19);
                            ha3 ha3Var = (ha3) rdVar3.a;
                            int i20 = rdVar3.b;
                            int i21 = rdVar3.c;
                            if (!(ha3Var instanceof ha3)) {
                                c80.s();
                                return r44;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(ha3Var.a).build(), i20, i21, 33);
                        }
                        int length2 = str2.length();
                        if (list2 != null) {
                            arrayList3 = new ArrayList(list2.size());
                            int size5 = list2.size();
                            for (int i22 = 0; i22 < size5; i22++) {
                                Object obj2 = list2.get(i22);
                                rd rdVar4 = (rd) obj2;
                                if ((rdVar4.a instanceof v83) && td.b(0, length2, rdVar4.b, rdVar4.c)) {
                                    arrayList3.add(obj2);
                                }
                            }
                        } else {
                            arrayList3 = arrayList6;
                        }
                        int size6 = arrayList3.size();
                        for (int i23 = 0; i23 < size6; i23++) {
                            rd rdVar5 = (rd) arrayList3.get(i23);
                            v83 v83Var = (v83) rdVar5.a;
                            int i24 = rdVar5.b;
                            int i25 = rdVar5.c;
                            WeakHashMap weakHashMap = (WeakHashMap) vu2Var.a;
                            Object uRLSpan = weakHashMap.get(v83Var);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(v83Var.a);
                                weakHashMap.put(v83Var, uRLSpan);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan, i24, i25, 33);
                        }
                        int length3 = str2.length();
                        if (list2 != null) {
                            arrayList6 = new ArrayList(list2.size());
                            int size7 = list2.size();
                            for (int i26 = 0; i26 < size7; i26++) {
                                Object obj3 = list2.get(i26);
                                rd rdVar6 = (rd) obj3;
                                if ((rdVar6.a instanceof fb1) && td.b(0, length3, rdVar6.b, rdVar6.c)) {
                                    arrayList6.add(obj3);
                                }
                            }
                        }
                        int size8 = arrayList6.size();
                        for (int i27 = 0; i27 < size8; i27++) {
                            rd rdVar7 = (rd) arrayList6.get(i27);
                            int i28 = rdVar7.b;
                            Object obj4 = rdVar7.a;
                            int i29 = rdVar7.c;
                            if (i28 != i29) {
                                fb1 fb1Var = (fb1) obj4;
                                if (fb1Var instanceof eb1) {
                                    obj4.getClass();
                                    eb1 eb1Var = (eb1) obj4;
                                    rd rdVar8 = new rd(i28, i29, eb1Var);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) vu2Var.b;
                                    Object uRLSpan2 = weakHashMap2.get(rdVar8);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(eb1Var.a);
                                        weakHashMap2.put(rdVar8, uRLSpan2);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan2, i28, i29, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) vu2Var.c;
                                    Object twVar = weakHashMap3.get(rdVar7);
                                    if (twVar == null) {
                                        twVar = new tw(fb1Var);
                                        weakHashMap3.put(rdVar7, twVar);
                                    }
                                    spannableString3.setSpan((ClickableSpan) twVar, i28, i29, 33);
                                }
                            }
                        }
                        r0 = (SpannableString) h7.I(spannableString3);
                    } else {
                        xj1Var = xj1Var2;
                        h7Var = h7Var3;
                        b7Var = b7Var3;
                        nt2Var = nt2Var2;
                        qn2Var = qn2Var3;
                        rk1Var = rk1Var2;
                        resources = resources2;
                        r61Var = r61Var3;
                        ln2Var = ln2Var2;
                        r35 = Obtain;
                        r0 = r44;
                    }
                    r4.setText(r0);
                    yn2 yn2Var = vn2.M;
                    rk1 rk1Var4 = rk1Var;
                    if (rk1Var4.c(yn2Var)) {
                        ?? r36 = r35;
                        r36.setContentInvalid(true);
                        Object objG7 = rk1Var4.g(yn2Var);
                        ?? r02 = objG7;
                        if (objG7 == null) {
                            r02 = r44;
                        }
                        r36.setError((CharSequence) r02);
                        r3 = r36;
                    } else {
                        r3 = r35;
                    }
                    qn2 qn2Var6 = qn2Var;
                    Resources resources4 = resources;
                    String strA = rg3.A(qn2Var6, resources4);
                    if (Build.VERSION.SDK_INT >= 30) {
                        g4.h(r4, strA);
                    } else {
                        r4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strA);
                    }
                    r3.setCheckable(rg3.z(qn2Var6));
                    Object objG8 = rk1Var4.g(vn2.K);
                    ?? r52 = objG8;
                    if (objG8 == null) {
                        r52 = r44;
                    }
                    u23 u23Var = (u23) r52;
                    if (u23Var != null) {
                        if (u23Var == u23.h) {
                            r4.setChecked(true);
                        } else if (u23Var == u23.i) {
                            r4.setChecked(false);
                        }
                    }
                    Object objG9 = rk1Var4.g(vn2.J);
                    ?? r53 = objG9;
                    if (objG9 == null) {
                        r53 = r44;
                    }
                    Boolean bool = (Boolean) r53;
                    if (bool != null) {
                        r4.setChecked(bool.booleanValue());
                    }
                    ln2 ln2Var4 = ln2Var;
                    if (!ln2Var4.j || qn2.j(4, qn2Var6).isEmpty()) {
                        Object objG10 = rk1Var4.g(vn2.a);
                        ?? r6 = objG10;
                        if (objG10 == null) {
                            r6 = r44;
                        }
                        List list3 = (List) r6;
                        r3.setContentDescription(list3 != null ? (String) du.q0(list3) : r44);
                    }
                    Object objG11 = rk1Var4.g(vn2.A);
                    ?? r62 = objG11;
                    if (objG11 == null) {
                        r62 = r44;
                    }
                    String str3 = (String) r62;
                    if (str3 != null) {
                        qn2 qn2VarL3 = qn2Var6;
                        while (true) {
                            if (qn2VarL3 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            ln2 ln2Var5 = qn2VarL3.d;
                            yn2 yn2Var2 = wn2.a;
                            if (ln2Var5.h.c(yn2Var2)) {
                                zBooleanValue = ((Boolean) ln2Var5.c(yn2Var2)).booleanValue();
                                break;
                            }
                            qn2VarL3 = qn2VarL3.l();
                        }
                        if (zBooleanValue) {
                            r3.setViewIdResourceName(str3);
                        }
                    }
                    Object objG12 = rk1Var4.g(vn2.h);
                    ?? r63 = objG12;
                    if (objG12 == null) {
                        r63 = r44;
                    }
                    if (((a83) r63) != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            r4.setHeading(true);
                        } else {
                            l4Var2.f(2, true);
                        }
                    }
                    Object objG13 = rk1Var4.g(vn2.i);
                    ?? r64 = objG13;
                    if (objG13 == null) {
                        r64 = r44;
                    }
                    if (((a83) r64) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            r3.setTextEntryKey(true);
                        } else {
                            l4Var2.f(8, true);
                        }
                    }
                    i2 = i;
                    if (i2 != -1) {
                        int iD3 = xj1Var.d(qn2Var6.f);
                        if (iD3 != -1) {
                            r3.setDrawingOrder(iD3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    r3.setPassword(rk1Var4.c(vn2.L));
                    Object objG14 = rk1Var4.g(vn2.O);
                    ?? r10 = objG14;
                    if (objG14 == null) {
                        r10 = r44;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    r3.setEditable(t11.l(r10, bool2));
                    Integer num = (Integer) pp0.x(ln2Var4, vn2.P);
                    r3.setMaxTextLength(num != null ? num.intValue() : -1);
                    r3.setEnabled(rg3.j(qn2Var6));
                    yn2 yn2Var3 = vn2.l;
                    r3.setFocusable(rk1Var4.c(yn2Var3));
                    if (r3.isFocusable()) {
                        r3.setFocused(((Boolean) ln2Var4.c(yn2Var3)).booleanValue());
                        if (r3.isFocused()) {
                            r4.addAction(2);
                            h7 h7Var5 = h7Var;
                            h7Var5.s = i2;
                            h7Var2 = h7Var5;
                        } else {
                            r12 = h7Var;
                            z = true;
                            r4.addAction(1);
                            r4.setVisibleToUser(xe1.L(qn2Var6) ^ z);
                            if (qn2Var6.o()) {
                                qn2VarL = qn2Var6;
                            } else {
                                qn2VarL = qn2Var6.l();
                                qn2VarL.getClass();
                            }
                            if (qn2VarL.m().f()) {
                                z2 = false;
                            } else {
                                z2 = false;
                                r4.setVisibleToUser(false);
                            }
                            vi0.t(pp0.x(ln2Var4, vn2.k));
                            r4.setClickable(z2);
                            q3Var = (q3) pp0.x(ln2Var4, kn2.b);
                            if (q3Var != null) {
                                t11.l(pp0.x(ln2Var4, vn2.J), bool2);
                                r4.setClickable(true);
                                if (rg3.j(qn2Var6) && r3.isClickable()) {
                                    l4Var2.a(new f4(q3Var.a, 16));
                                }
                            }
                            r4.setLongClickable(false);
                            q3Var2 = (q3) pp0.x(ln2Var4, kn2.c);
                            if (q3Var2 != null) {
                                r4.setLongClickable(true);
                                if (rg3.j(qn2Var6)) {
                                    l4Var2.a(new f4(q3Var2.a, 32));
                                }
                            }
                            q3Var3 = (q3) pp0.x(ln2Var4, kn2.q);
                            if (q3Var3 != null) {
                                l4Var2.a(new f4(q3Var3.a, 16384));
                            }
                            if (rg3.j(qn2Var6)) {
                                q3 q3Var4 = (q3) pp0.x(ln2Var4, kn2.k);
                                if (q3Var4 != null) {
                                    l4Var2.a(new f4(q3Var4.a, 2097152));
                                }
                                q3 q3Var5 = (q3) pp0.x(ln2Var4, kn2.p);
                                if (q3Var5 != null) {
                                    l4Var2.a(new f4(q3Var5.a, R.id.accessibilityActionImeEnter));
                                }
                                q3 q3Var6 = (q3) pp0.x(ln2Var4, kn2.r);
                                if (q3Var6 != null) {
                                    l4Var2.a(new f4(q3Var6.a, 65536));
                                }
                                q3 q3Var7 = (q3) pp0.x(ln2Var4, kn2.s);
                                if (q3Var7 != null && r3.isFocused()) {
                                    ClipDescription primaryClipDescription = b7Var.m6getClipboardManager().a().getPrimaryClipDescription();
                                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                        l4Var2.a(new f4(q3Var7.a, AIChatConfig.MaxOutputTokens));
                                    }
                                }
                            }
                            strM = h7.m(qn2Var6);
                            if (!(strM != null || strM.length() == 0)) {
                                r3.setTextSelection(r12.k(qn2Var6), r12.j(qn2Var6));
                                q3 q3Var8 = (q3) pp0.x(ln2Var4, kn2.j);
                                l4Var2.a(new f4(q3Var8 != null ? q3Var8.a : r44, 131072));
                                r4.addAction(256);
                                r4.addAction(AIChatConfig.DefaultMaxTokens);
                                r4.setMovementGranularities(11);
                                List list4 = (List) pp0.x(ln2Var4, vn2.a);
                                if ((list4 == null || list4.isEmpty()) && rk1Var4.c(kn2.a)) {
                                    if (!rk1Var4.c(vn2.G) || t11.l(pp0.x(ln2Var4, yn2Var3), bool2)) {
                                        ?? U = r61Var.u();
                                        while (true) {
                                            if (U == 0) {
                                                U = r44;
                                                break;
                                            }
                                            ln2 ln2VarW = U.w();
                                            if (ln2VarW == null || !ln2VarW.j) {
                                                z3 = false;
                                                if (!z3) {
                                                    break;
                                                }
                                                U = U.u();
                                            } else {
                                                if (ln2VarW.h.c(vn2.G)) {
                                                    z3 = true;
                                                }
                                                if (!z3) {
                                                }
                                            }
                                        }
                                        if (U != 0) {
                                            ln2 ln2VarW2 = U.w();
                                            if (ln2VarW2 != null) {
                                                Object objG15 = ln2VarW2.h.g(vn2.l);
                                                ?? r8 = objG15;
                                                if (objG15 == null) {
                                                    r8 = r44;
                                                }
                                                zL = t11.l(r8, Boolean.TRUE);
                                            } else {
                                                zL = false;
                                            }
                                            z4 = zL ? false : true;
                                            if (!z4) {
                                                r4.setMovementGranularities(r3.getMovementGranularities() | 20);
                                            }
                                        }
                                        if (!z4) {
                                        }
                                    }
                                }
                            }
                            arrayList = new ArrayList();
                            arrayList.add("androidx.compose.ui.semantics.id");
                            charSequenceE = l4Var2.e();
                            if (!(charSequenceE != null || charSequenceE.length() == 0) && rk1Var4.c(kn2.a)) {
                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (rk1Var4.c(vn2.A)) {
                                arrayList.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (rk1Var4.c(vn2.Q)) {
                                arrayList.add("androidx.compose.ui.semantics.shapeType");
                                arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            r3.setAvailableExtraData(arrayList);
                            s32Var = (s32) pp0.x(ln2Var4, vn2.c);
                            if (s32Var != null) {
                                float f = s32Var.a;
                                tt ttVar = s32Var.b;
                                yn2 yn2Var4 = kn2.i;
                                if (rk1Var4.c(yn2Var4)) {
                                    l4Var2.g("android.widget.SeekBar");
                                } else {
                                    l4Var2.g("android.widget.ProgressBar");
                                }
                                if (s32Var != s32.c) {
                                    r4.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new k4(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, ttVar.a, f)).h);
                                }
                                if (rk1Var4.c(yn2Var4) && rg3.j(qn2Var6)) {
                                    if (f < ci0.A(Float.valueOf(ttVar.a).floatValue(), fValueOf.floatValue())) {
                                        l4Var2.a(f4.e);
                                    }
                                    float fFloatValue = fValueOf.floatValue();
                                    float fFloatValue2 = Float.valueOf(ttVar.a).floatValue();
                                    if (fFloatValue > fFloatValue2) {
                                        fFloatValue = fFloatValue2;
                                    }
                                    if (f > fFloatValue) {
                                        l4Var2.a(f4.f);
                                    }
                                }
                            }
                            fg1.j(l4Var2, qn2Var6);
                            rp0.k0(l4Var2, qn2Var6);
                            objG = qn2Var6.k().h.g(vn2.g);
                            r1 = objG;
                            if (objG == null) {
                                r1 = r44;
                            }
                            if (r1 != 0) {
                                qn2 qn2VarL4 = qn2Var6.l();
                                if (qn2VarL4 != null) {
                                    Object objG16 = qn2VarL4.k().h.g(vn2.e);
                                    ?? r37 = objG16;
                                    if (objG16 == null) {
                                        r37 = r44;
                                    }
                                    if (r37 != 0) {
                                        Object objG17 = qn2VarL4.k().h.g(vn2.f);
                                        ?? r38 = objG17;
                                        if (objG17 == null) {
                                            r38 = r44;
                                        }
                                        zt ztVar = (zt) r38;
                                        if (ztVar == null || (ztVar.a >= 0 && ztVar.b >= 0)) {
                                            if (qn2Var6.k().h.c(vn2.J)) {
                                                ArrayList arrayList7 = new ArrayList();
                                                List listJ2 = qn2.j(4, qn2VarL4);
                                                int size9 = listJ2.size();
                                                int i30 = 0;
                                                for (int i31 = 0; i31 < size9; i31++) {
                                                    qn2 qn2Var7 = (qn2) listJ2.get(i31);
                                                    if (qn2Var7.k().h.c(vn2.J)) {
                                                        arrayList7.add(qn2Var7);
                                                        if (qn2Var7.c.v() < qn2Var6.c.v()) {
                                                            i30++;
                                                        }
                                                    }
                                                }
                                                if (!arrayList7.isEmpty()) {
                                                    boolean zV = rp0.V(arrayList7);
                                                    int i32 = zV ? 0 : i30;
                                                    int i33 = zV ? i30 : 0;
                                                    Object objG18 = qn2Var6.k().h.g(vn2.J);
                                                    if (objG18 == null) {
                                                        objG18 = Boolean.FALSE;
                                                    }
                                                    r4.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i32, 1, i33, 1, false, ((Boolean) objG18).booleanValue()));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                c80.g();
                            }
                            el2Var = (el2) pp0.x(qn2Var6.n(), vn2.v);
                            q3 q3Var9 = (q3) pp0.x(qn2Var6.n(), kn2.d);
                            if (el2Var != null && q3Var9 != null) {
                                objG3 = qn2Var6.k().h.g(vn2.f);
                                r5 = objG3;
                                if (objG3 == null) {
                                    r5 = r44;
                                }
                                if (r5 != 0) {
                                    Object objG19 = qn2Var6.k().h.g(vn2.e);
                                    ?? r54 = objG19;
                                    if (objG19 == null) {
                                        r54 = r44;
                                    }
                                    boolean z6 = r54 != 0;
                                    if (!z6) {
                                        l4Var2.g("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) el2Var.b.a()).floatValue() > 0.0f) {
                                        r4.setScrollable(true);
                                    }
                                    if (rg3.j(qn2Var6)) {
                                        boolean zS = h7.s(el2Var);
                                        d61 d61Var = d61.i;
                                        if (zS) {
                                            l4Var2.a(f4.e);
                                            r61Var2 = r61Var;
                                            l4Var2.a(!(r61Var2.G == d61Var) ? f4.j : f4.h);
                                        } else {
                                            r61Var2 = r61Var;
                                        }
                                        if (h7.r(el2Var)) {
                                            l4Var2.a(f4.f);
                                            l4Var2.a(!(r61Var2.G == d61Var) ? f4.h : f4.j);
                                        }
                                    }
                                }
                            }
                            el2Var2 = (el2) pp0.x(qn2Var6.n(), vn2.w);
                            if (el2Var2 != null && q3Var9 != null) {
                                objG2 = qn2Var6.k().h.g(vn2.f);
                                r33 = objG2;
                                if (objG2 == null) {
                                    r33 = r44;
                                }
                                if (r33 != 0) {
                                    Object objG20 = qn2Var6.k().h.g(vn2.e);
                                    ?? r39 = objG20;
                                    if (objG20 == null) {
                                        r39 = r44;
                                    }
                                    boolean z7 = r39 != 0;
                                    if (!z7) {
                                        l4Var2.g("android.widget.ScrollView");
                                    }
                                    if (((Number) el2Var2.b.a()).floatValue() > 0.0f) {
                                        r4.setScrollable(true);
                                    }
                                    if (rg3.j(qn2Var6)) {
                                        if (h7.s(el2Var2)) {
                                            l4Var2.a(f4.e);
                                            l4Var2.a(f4.i);
                                        }
                                        if (h7.r(el2Var2)) {
                                            l4Var2.a(f4.f);
                                            l4Var2.a(f4.g);
                                        }
                                    }
                                }
                            }
                            i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 29) {
                                xe1.c(l4Var2, qn2Var6);
                            }
                            CharSequence charSequence = (CharSequence) pp0.x(qn2Var6.n(), vn2.d);
                            if (i3 < 28) {
                                r4.setPaneTitle(charSequence);
                            } else {
                                r4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                            }
                            if (rg3.j(qn2Var6)) {
                                q3 q3Var10 = (q3) pp0.x(qn2Var6.n(), kn2.t);
                                if (q3Var10 != null) {
                                    l4Var2.a(new f4(q3Var10.a, 262144));
                                }
                                q3 q3Var11 = (q3) pp0.x(qn2Var6.n(), kn2.u);
                                if (q3Var11 != null) {
                                    l4Var2.a(new f4(q3Var11.a, 524288));
                                }
                                q3 q3Var12 = (q3) pp0.x(qn2Var6.n(), kn2.v);
                                if (q3Var12 != null) {
                                    l4Var2.a(new f4(q3Var12.a, 1048576));
                                }
                                ln2 ln2VarN = qn2Var6.n();
                                yn2 yn2Var5 = kn2.x;
                                if (ln2VarN.h.c(yn2Var5)) {
                                    List list5 = (List) qn2Var6.n().c(yn2Var5);
                                    int size10 = list5.size();
                                    yj1 yj1Var = h7.U;
                                    if (size10 >= yj1Var.b) {
                                        throw new IllegalStateException("Can't have more than " + yj1Var.b + " custom actions for one widget");
                                    }
                                    nt2 nt2Var3 = new nt2();
                                    gk1 gk1VarA = hs1.a();
                                    nt2 nt2Var4 = nt2Var;
                                    if (rg3.p(nt2Var4.h, nt2Var4.j, i2) >= 0) {
                                        gk1 gk1Var = (gk1) nt2Var4.d(i2);
                                        int[] iArr = yj1Var.a;
                                        int i34 = yj1Var.b;
                                        int[] iArrCopyOf = new int[16];
                                        int i35 = 0;
                                        int i36 = 0;
                                        while (i35 < i34) {
                                            int i37 = iArr[i35];
                                            int i38 = i34;
                                            int i39 = i36 + 1;
                                            gk1 gk1Var2 = gk1Var;
                                            if (iArrCopyOf.length < i39) {
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i39, (iArrCopyOf.length * 3) / 2));
                                            }
                                            iArrCopyOf[i36] = i37;
                                            i35++;
                                            i36 = i39;
                                            i34 = i38;
                                            gk1Var = gk1Var2;
                                        }
                                        gk1 gk1Var3 = gk1Var;
                                        ArrayList arrayList8 = new ArrayList();
                                        if (list5.size() > 0) {
                                            vi0.t(list5.get(0));
                                            gk1Var3.getClass();
                                            throw r44;
                                        }
                                        if (arrayList8.size() > 0) {
                                            vi0.t(arrayList8.get(0));
                                            if (i36 <= 0) {
                                                s.d("Index must be between 0 and size");
                                                return r44;
                                            }
                                            int i40 = iArrCopyOf[0];
                                            throw r44;
                                        }
                                    } else if (list5.size() > 0) {
                                        vi0.t(list5.get(0));
                                        yj1Var.c(0);
                                        throw r44;
                                    }
                                    r12.y.f(i2, nt2Var3);
                                    nt2Var4.f(i2, gk1VarA);
                                }
                            }
                            boolean zK = rg3.k(qn2Var6, resources4);
                            if (Build.VERSION.SDK_INT < 28) {
                                r4.setScreenReaderFocusable(zK);
                            } else {
                                l4Var2.f(1, zK);
                            }
                            iD = r12.I.d(i2);
                            if (iD == -1) {
                                ic icVarV2 = eu.V(b7Var.getAndroidViewsHandler$ui(), iD);
                                if (icVarV2 != null) {
                                    r4.setTraversalBefore(icVarV2);
                                    b7Var2 = b7Var;
                                } else {
                                    b7Var2 = b7Var;
                                    r4.setTraversalBefore(b7Var2, iD);
                                }
                                ?? r310 = r44;
                                r12.c(i2, l4Var2, r12.K, r310);
                                r32 = r310;
                            } else {
                                r32 = r44;
                                b7Var2 = b7Var;
                            }
                            iD2 = r12.J.d(i2);
                            if (iD2 != -1 && (icVarV = eu.V(b7Var2.getAndroidViewsHandler$ui(), iD2)) != null) {
                                r4.setTraversalAfter(icVarV);
                                r12.c(i2, l4Var2, r12.L, r32);
                            }
                            str = (String) pp0.x(qn2Var6.n(), wn2.b);
                            if (str != null) {
                                l4Var2.g(str);
                            }
                            l4Var = l4Var2;
                            r122 = r12;
                        }
                    } else {
                        h7Var2 = h7Var;
                    }
                    z = true;
                    r12 = h7Var2;
                    r4.setVisibleToUser(xe1.L(qn2Var6) ^ z);
                    if (qn2Var6.o()) {
                    }
                    if (qn2VarL.m().f()) {
                    }
                    vi0.t(pp0.x(ln2Var4, vn2.k));
                    r4.setClickable(z2);
                    q3Var = (q3) pp0.x(ln2Var4, kn2.b);
                    if (q3Var != null) {
                    }
                    r4.setLongClickable(false);
                    q3Var2 = (q3) pp0.x(ln2Var4, kn2.c);
                    if (q3Var2 != null) {
                    }
                    q3Var3 = (q3) pp0.x(ln2Var4, kn2.q);
                    if (q3Var3 != null) {
                    }
                    if (rg3.j(qn2Var6)) {
                    }
                    strM = h7.m(qn2Var6);
                    if (strM != null) {
                        if (!(strM != null || strM.length() == 0)) {
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceE = l4Var2.e();
                        if (charSequenceE != null) {
                            if (!(charSequenceE != null || charSequenceE.length() == 0)) {
                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (rk1Var4.c(vn2.A)) {
                            }
                            if (rk1Var4.c(vn2.Q)) {
                            }
                            r3.setAvailableExtraData(arrayList);
                            s32Var = (s32) pp0.x(ln2Var4, vn2.c);
                            if (s32Var != null) {
                            }
                            fg1.j(l4Var2, qn2Var6);
                            rp0.k0(l4Var2, qn2Var6);
                            objG = qn2Var6.k().h.g(vn2.g);
                            r1 = objG;
                            if (objG == null) {
                            }
                            if (r1 != 0) {
                            }
                            el2Var = (el2) pp0.x(qn2Var6.n(), vn2.v);
                            q3 q3Var92 = (q3) pp0.x(qn2Var6.n(), kn2.d);
                            if (el2Var != null) {
                                objG3 = qn2Var6.k().h.g(vn2.f);
                                r5 = objG3;
                                if (objG3 == null) {
                                }
                                if (r5 != 0) {
                                }
                            }
                            el2Var2 = (el2) pp0.x(qn2Var6.n(), vn2.w);
                            if (el2Var2 != null) {
                                objG2 = qn2Var6.k().h.g(vn2.f);
                                r33 = objG2;
                                if (objG2 == null) {
                                }
                                if (r33 != 0) {
                                }
                            }
                            i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 29) {
                            }
                            CharSequence charSequence2 = (CharSequence) pp0.x(qn2Var6.n(), vn2.d);
                            if (i3 < 28) {
                            }
                            if (rg3.j(qn2Var6)) {
                            }
                            boolean zK2 = rg3.k(qn2Var6, resources4);
                            if (Build.VERSION.SDK_INT < 28) {
                            }
                            iD = r12.I.d(i2);
                            if (iD == -1) {
                            }
                            iD2 = r12.J.d(i2);
                            if (iD2 != -1) {
                                r4.setTraversalAfter(icVarV);
                                r12.c(i2, l4Var2, r12.L, r32);
                            }
                            str = (String) pp0.x(qn2Var6.n(), wn2.b);
                            if (str != null) {
                            }
                            l4Var = l4Var2;
                            r122 = r12;
                        }
                    }
                } else if (!(Build.VERSION.SDK_INT >= 34 ? u3.e(accessibilityManager) : true)) {
                    i2 = i;
                    r122 = h7Var3;
                    l4Var = null;
                }
            }
        }
        if (r122.v) {
            if (i2 == r122.r) {
                r122.t = l4Var;
            }
            if (i2 == r122.s) {
                r122.u = l4Var;
            }
        }
        return l4Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.n4
    public final l4 s(int i) {
        h7 h7Var = this.j;
        if (i != 1) {
            if (i == 2) {
                return l(h7Var.r);
            }
            s.j(vi0.g("Unknown focus type: ", i));
            return null;
        }
        int i2 = h7Var.s;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return l(i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:127:0x01af) to fix multi-entry loop: BACK_EDGE: B:127:0x01af -> B:128:0x01b0 */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x01b0, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0761  */
    @Override // defpackage.n4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean w(int i, int i2, Bundle bundle) {
        qn2 qn2Var;
        int i3;
        Integer num;
        v3 v3Var;
        int iK;
        int i4;
        y03 y03VarN;
        xm0 xm0Var;
        xm0 xm0Var2;
        xm0 xm0Var3;
        xm0 xm0Var4;
        xm0 xm0Var5;
        xm0 xm0Var6;
        xm0 xm0Var7;
        xm0 xm0Var8;
        xm0 xm0Var9;
        in0 in0Var;
        q3 q3Var;
        long jM;
        float f;
        float f2;
        float f3;
        float f4;
        long jFloatToRawIntBits;
        long jFloatToRawIntBits2;
        in0 in0Var2;
        xm0 xm0Var10;
        Float f5;
        boolean z;
        q3 q3Var2;
        xm0 xm0Var11;
        float fIntBitsToFloat;
        q3 q3Var3;
        xm0 xm0Var12;
        in0 in0Var3;
        xm0 xm0Var13;
        xm0 xm0Var14;
        xm0 xm0Var15;
        xm0 xm0Var16;
        h7 h7Var = this.j;
        AccessibilityManager accessibilityManager = h7Var.n;
        Float fValueOf = Float.valueOf(0.0f);
        b7 b7Var = h7Var.k;
        sn2 sn2Var = (sn2) h7Var.l().b(i);
        if (sn2Var == null || (qn2Var = sn2Var.a) == null) {
            return false;
        }
        r61 r61Var = qn2Var.c;
        int i5 = qn2Var.f;
        ln2 ln2Var = qn2Var.d;
        rk1 rk1Var = ln2Var.h;
        Object objG = rk1Var.g(vn2.o);
        if (objG == null) {
            objG = null;
        }
        Boolean bool = Boolean.TRUE;
        if (t11.l(objG, bool)) {
            if (!(Build.VERSION.SDK_INT >= 34 ? u3.e(accessibilityManager) : true)) {
                return false;
            }
        }
        if (i2 == 64) {
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                return false;
            }
            int i6 = h7Var.r;
            if (i6 == i) {
                return false;
            }
            if (i6 != Integer.MIN_VALUE) {
                i3 = 12;
                num = null;
                h7.x(h7Var, i6, 65536, null, 12);
            } else {
                i3 = 12;
                num = null;
            }
            h7Var.r = i;
            b7Var.invalidate();
            h7.x(h7Var, i, AIChatConfig.MaxOutputTokens, num, i3);
            return true;
        }
        if (i2 == 128) {
            if (!(h7Var.r == i)) {
                return false;
            }
            h7Var.r = Integer.MIN_VALUE;
            h7Var.t = null;
            b7Var.invalidate();
            h7.x(h7Var, i, 65536, null, 12);
            return true;
        }
        if (i2 == 256 || i2 == 512) {
            if (bundle == null) {
                return false;
            }
            int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
            boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
            boolean z3 = i2 == 256;
            Integer num2 = h7Var.B;
            if (num2 == null || i5 != num2.intValue()) {
                h7Var.A = -1;
                h7Var.B = Integer.valueOf(i5);
            }
            String strM = h7.m(qn2Var);
            if (strM == null || strM.length() == 0) {
                return false;
            }
            String strM2 = h7.m(qn2Var);
            if (strM2 == null || strM2.length() == 0) {
                v3Var = null;
            } else if (i7 == 1) {
                Locale locale = b7Var.getContext().getResources().getConfiguration().locale;
                if (w3.l == null) {
                    w3 w3Var = new w3(0);
                    w3Var.k = BreakIterator.getCharacterInstance(locale);
                    w3.l = w3Var;
                }
                w3 w3Var2 = w3.l;
                w3Var2.getClass();
                w3Var2.l(strM2);
                v3Var = w3Var2;
            } else if (i7 == 2) {
                Locale locale2 = b7Var.getContext().getResources().getConfiguration().locale;
                if (w3.m == null) {
                    w3 w3Var3 = new w3(1);
                    w3Var3.k = BreakIterator.getWordInstance(locale2);
                    w3.m = w3Var3;
                }
                w3 w3Var4 = w3.m;
                w3Var4.getClass();
                w3Var4.l(strM2);
                v3Var = w3Var4;
            } else if (i7 == 4) {
                if (rk1Var.c(kn2.a) && (y03VarN = eu.N(ln2Var)) != null) {
                    if (i7 == 4) {
                        if (w3.n == null) {
                            w3.n = new w3(2);
                        }
                        w3 w3Var5 = w3.n;
                        w3Var5.getClass();
                        w3Var5.h = strM2;
                        w3Var5.k = y03VarN;
                        v3Var = w3Var5;
                    } else {
                        if (x3.l == null) {
                            x3 x3Var = new x3();
                            new Rect();
                            x3.l = x3Var;
                        }
                        x3 x3Var2 = x3.l;
                        x3Var2.getClass();
                        x3Var2.h = strM2;
                        x3Var2.j = y03VarN;
                        x3Var2.k = qn2Var;
                        v3Var = x3Var2;
                    }
                }
            } else if (i7 == 8) {
                if (y3.j == null) {
                    y3.j = new y3();
                }
                y3 y3Var = y3.j;
                y3Var.getClass();
                y3Var.h = strM2;
                v3Var = y3Var;
            } else if (i7 != 16) {
            }
            if (v3Var == null) {
                return false;
            }
            int iJ = h7Var.j(qn2Var);
            if (iJ == -1) {
                iJ = z3 ? 0 : strM.length();
            }
            int[] iArrA = z3 ? v3Var.a(iJ) : v3Var.i(iJ);
            if (iArrA == null) {
                return false;
            }
            int i8 = iArrA[0];
            int i9 = iArrA[1];
            if (z2 && !rk1Var.c(vn2.a) && rk1Var.c(vn2.G)) {
                iK = h7Var.k(qn2Var);
                if (iK == -1) {
                    iK = z3 ? i8 : i9;
                }
                i4 = z3 ? i9 : i8;
            } else {
                iK = z3 ? i9 : i8;
                i4 = iK;
            }
            h7Var.F = new d7(qn2Var, z3 ? 256 : 512, i7, i8, i9, SystemClock.uptimeMillis());
            h7Var.D(qn2Var, iK, i4, true);
            return true;
        }
        if (i2 == 16384) {
            Object objG2 = rk1Var.g(kn2.q);
            q3 q3Var4 = (q3) (objG2 == null ? null : objG2);
            if (q3Var4 == null || (xm0Var = (xm0) q3Var4.b) == null) {
                return false;
            }
            return ((Boolean) xm0Var.a()).booleanValue();
        }
        if (i2 == 131072) {
            boolean zD = h7Var.D(qn2Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (zD) {
                h7.x(h7Var, h7Var.t(i5), 0, null, 12);
            }
            return zD;
        }
        if (!rg3.j(qn2Var)) {
            return false;
        }
        if (i2 == 1) {
            if (b7Var.isInTouchMode()) {
                b7Var.requestFocusFromTouch();
            }
            Object objG3 = rk1Var.g(kn2.w);
            q3 q3Var5 = (q3) (objG3 == null ? null : objG3);
            if (q3Var5 == null || (xm0Var2 = (xm0) q3Var5.b) == null) {
                return false;
            }
            return ((Boolean) xm0Var2.a()).booleanValue();
        }
        if (i2 == 2) {
            Object objG4 = rk1Var.g(vn2.l);
            if (objG4 == null) {
                objG4 = null;
            }
            if (!t11.l(objG4, bool)) {
                return false;
            }
            ((bl0) b7Var.getFocusOwner()).b(8, false, true);
            return true;
        }
        d61 d61Var = d61.i;
        switch (i2) {
            case 16:
                Object objG5 = rk1Var.g(kn2.b);
                if (objG5 == null) {
                    objG5 = null;
                }
                q3 q3Var6 = (q3) objG5;
                Boolean bool2 = (q3Var6 == null || (xm0Var3 = (xm0) q3Var6.b) == null) ? null : (Boolean) xm0Var3.a();
                h7.x(h7Var, i, 1, null, 12);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return false;
            case 32:
                Object objG6 = rk1Var.g(kn2.c);
                q3 q3Var7 = (q3) (objG6 == null ? null : objG6);
                if (q3Var7 == null || (xm0Var4 = (xm0) q3Var7.b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var4.a()).booleanValue();
            case 4096:
            case 8192:
                break;
            case AIChatConfig.MaxOutputTokens /* 32768 */:
                Object objG7 = rk1Var.g(kn2.s);
                q3 q3Var8 = (q3) (objG7 == null ? null : objG7);
                if (q3Var8 == null || (xm0Var5 = (xm0) q3Var8.b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var5.a()).booleanValue();
            case 65536:
                Object objG8 = rk1Var.g(kn2.r);
                q3 q3Var9 = (q3) (objG8 == null ? null : objG8);
                if (q3Var9 == null || (xm0Var6 = (xm0) q3Var9.b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var6.a()).booleanValue();
            case 262144:
                Object objG9 = rk1Var.g(kn2.t);
                q3 q3Var10 = (q3) (objG9 == null ? null : objG9);
                if (q3Var10 == null || (xm0Var7 = (xm0) q3Var10.b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var7.a()).booleanValue();
            case 524288:
                Object objG10 = rk1Var.g(kn2.u);
                q3 q3Var11 = (q3) (objG10 == null ? null : objG10);
                if (q3Var11 == null || (xm0Var8 = (xm0) q3Var11.b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var8.a()).booleanValue();
            case 1048576:
                Object objG11 = rk1Var.g(kn2.v);
                q3 q3Var12 = (q3) (objG11 == null ? null : objG11);
                if (q3Var12 == null || (xm0Var9 = (xm0) q3Var12.b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var9.a()).booleanValue();
            case 2097152:
                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                Object objG12 = rk1Var.g(kn2.k);
                q3 q3Var13 = (q3) (objG12 == null ? null : objG12);
                if (q3Var13 == null || (in0Var = (in0) q3Var13.b) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((Boolean) in0Var.j(new sd(string))).booleanValue();
            case R.id.accessibilityActionShowOnScreen:
                qn2 qn2VarL = qn2Var.l();
                if (qn2VarL != null) {
                    Object objG13 = qn2VarL.d.h.g(kn2.d);
                    if (objG13 == null) {
                        objG13 = null;
                    }
                    q3Var = (q3) objG13;
                    while (q3Var == null && qn2VarL != null) {
                        qn2VarL = qn2VarL.l();
                        if (qn2VarL != null) {
                            Object objG14 = qn2VarL.d.h.g(kn2.d);
                            if (objG14 == null) {
                                objG14 = null;
                            }
                            q3Var = (q3) objG14;
                        }
                    }
                    if (qn2VarL == null) {
                        o62 o62VarG = qn2Var.g();
                        return b7Var.requestRectangleOnScreen(new Rect((int) Math.floor(o62VarG.a), (int) Math.floor(o62VarG.b), gf1.Q((float) Math.ceil(o62VarG.c)), gf1.Q((float) Math.ceil(o62VarG.d))));
                    }
                    long j = 0;
                    long jD = 0;
                    boolean z4 = false;
                    while (qn2VarL != null) {
                        r61 r61Var2 = qn2VarL.c;
                        rk1 rk1Var2 = qn2VarL.d.h;
                        Object objG15 = rk1Var2.g(kn2.d);
                        if (objG15 == null) {
                            objG15 = null;
                        }
                        q3 q3Var14 = (q3) objG15;
                        if (q3Var14 != null) {
                            o62 o62VarV = s11.v((qz0) r61Var2.M.d);
                            c61 c61VarJ = ((qz0) r61Var2.M.d).j();
                            o62 o62VarI = o62VarV.i(c61VarJ != null ? ((zn1) c61VarJ).M(j) : j);
                            zn1 zn1VarD = qn2Var.d();
                            if (zn1VarD == null) {
                                jM = j;
                                long jE = rs1.e(jM, jD);
                                zn1 zn1VarD2 = qn2Var.d();
                                o62 o62VarQ = eu.q(jE, s11.q0(zn1VarD2 == null ? zn1VarD2.j : 0L));
                                f = o62VarQ.a - o62VarI.a;
                                f2 = o62VarQ.c - o62VarI.c;
                                if (Math.signum(f) == Math.signum(f2)) {
                                    f = 0.0f;
                                } else if (Math.abs(f) >= Math.abs(f2)) {
                                    f = f2;
                                }
                                f3 = o62VarQ.b - o62VarI.b;
                                f4 = o62VarQ.d - o62VarI.d;
                                if (Math.signum(f3) == Math.signum(f4)) {
                                    f3 = 0.0f;
                                } else if (Math.abs(f3) >= Math.abs(f4)) {
                                    f3 = f4;
                                }
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                if (rs1.b(jFloatToRawIntBits, 0L)) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                                    Object objG16 = rk1Var2.g(vn2.v);
                                    if (objG16 == null) {
                                        objG16 = null;
                                    }
                                    if (r61Var.G == d61Var) {
                                        fIntBitsToFloat2 = -fIntBitsToFloat2;
                                    }
                                    Object objG17 = rk1Var2.g(vn2.w);
                                    if (objG17 == null) {
                                        objG17 = null;
                                    }
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                                } else {
                                    jFloatToRawIntBits2 = jFloatToRawIntBits;
                                }
                                mn0 mn0Var = (mn0) q3Var14.b;
                                z4 = (mn0Var == null && ((Boolean) mn0Var.g(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))))).booleanValue()) || z4;
                                jD = rs1.d(jD, jFloatToRawIntBits);
                            } else {
                                if (!zn1VarD.S0().u) {
                                    zn1VarD = null;
                                }
                                if (zn1VarD != null) {
                                    jM = zn1VarD.M(j);
                                }
                                long jE2 = rs1.e(jM, jD);
                                zn1 zn1VarD22 = qn2Var.d();
                                o62 o62VarQ2 = eu.q(jE2, s11.q0(zn1VarD22 == null ? zn1VarD22.j : 0L));
                                f = o62VarQ2.a - o62VarI.a;
                                f2 = o62VarQ2.c - o62VarI.c;
                                if (Math.signum(f) == Math.signum(f2)) {
                                }
                                f3 = o62VarQ2.b - o62VarI.b;
                                f4 = o62VarQ2.d - o62VarI.d;
                                if (Math.signum(f3) == Math.signum(f4)) {
                                }
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                if (rs1.b(jFloatToRawIntBits, 0L)) {
                                }
                                mn0 mn0Var2 = (mn0) q3Var14.b;
                                if (mn0Var2 == null) {
                                    jD = rs1.d(jD, jFloatToRawIntBits);
                                } else {
                                    jD = rs1.d(jD, jFloatToRawIntBits);
                                }
                            }
                        }
                        qn2VarL = qn2VarL.l();
                        j = 0;
                    }
                    return z4;
                }
                q3Var = null;
                break;
            case R.id.accessibilityActionSetProgress:
                if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                Object objG18 = rk1Var.g(kn2.i);
                q3 q3Var15 = (q3) (objG18 == null ? null : objG18);
                if (q3Var15 == null || (in0Var2 = (in0) q3Var15.b) == null) {
                    return false;
                }
                return ((Boolean) in0Var2.j(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case R.id.accessibilityActionImeEnter:
                Object objG19 = rk1Var.g(kn2.p);
                q3 q3Var16 = (q3) (objG19 == null ? null : objG19);
                if (q3Var16 == null || (xm0Var10 = (xm0) q3Var16.b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var10.a()).booleanValue();
            default:
                switch (i2) {
                    case R.id.accessibilityActionScrollUp:
                    case R.id.accessibilityActionScrollLeft:
                    case R.id.accessibilityActionScrollDown:
                    case R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (i2) {
                            case R.id.accessibilityActionPageUp:
                                Object objG20 = rk1Var.g(kn2.y);
                                q3 q3Var17 = (q3) (objG20 == null ? null : objG20);
                                if (q3Var17 == null || (xm0Var13 = (xm0) q3Var17.b) == null) {
                                    return false;
                                }
                                return ((Boolean) xm0Var13.a()).booleanValue();
                            case R.id.accessibilityActionPageDown:
                                Object objG21 = rk1Var.g(kn2.A);
                                q3 q3Var18 = (q3) (objG21 == null ? null : objG21);
                                if (q3Var18 == null || (xm0Var14 = (xm0) q3Var18.b) == null) {
                                    return false;
                                }
                                return ((Boolean) xm0Var14.a()).booleanValue();
                            case R.id.accessibilityActionPageLeft:
                                Object objG22 = rk1Var.g(kn2.z);
                                q3 q3Var19 = (q3) (objG22 == null ? null : objG22);
                                if (q3Var19 == null || (xm0Var15 = (xm0) q3Var19.b) == null) {
                                    return false;
                                }
                                return ((Boolean) xm0Var15.a()).booleanValue();
                            case R.id.accessibilityActionPageRight:
                                Object objG23 = rk1Var.g(kn2.B);
                                q3 q3Var20 = (q3) (objG23 == null ? null : objG23);
                                if (q3Var20 == null || (xm0Var16 = (xm0) q3Var20.b) == null) {
                                    return false;
                                }
                                return ((Boolean) xm0Var16.a()).booleanValue();
                            default:
                                nt2 nt2Var = (nt2) h7Var.y.d(i);
                                if (nt2Var == null || ((CharSequence) nt2Var.d(i2)) == null) {
                                    return false;
                                }
                                Object objG24 = rk1Var.g(kn2.x);
                                List list = (List) (objG24 == null ? null : objG24);
                                if (list == null || list.size() <= 0) {
                                    return false;
                                }
                                list.get(0).getClass();
                                c80.g();
                                return false;
                        }
                }
                break;
        }
        boolean z5 = i2 == 4096;
        boolean z6 = i2 == 8192;
        boolean z7 = i2 == 16908345;
        boolean z8 = i2 == 16908347;
        boolean z9 = i2 == 16908344;
        boolean z10 = i2 == 16908346;
        boolean z11 = z7 || z8 || z5 || z6;
        boolean z12 = z9 || z10 || z5 || z6;
        if (z5 || z6) {
            Object objG25 = rk1Var.g(vn2.c);
            if (objG25 == null) {
                objG25 = null;
            }
            s32 s32Var = (s32) objG25;
            Object objG26 = rk1Var.g(kn2.i);
            if (objG26 == null) {
                objG26 = null;
            }
            q3 q3Var21 = (q3) objG26;
            if (s32Var != null) {
                tt ttVar = s32Var.b;
                if (q3Var21 != null) {
                    float f6 = ttVar.a;
                    float f7 = ((f6 < 0.0f ? 0.0f : f6) - (0.0f > f6 ? f6 : 0.0f)) / 20.0f;
                    if (z6) {
                        f7 = -f7;
                    }
                    in0 in0Var4 = (in0) q3Var21.b;
                    if (in0Var4 != null) {
                        return ((Boolean) in0Var4.j(Float.valueOf(s32Var.a + f7))).booleanValue();
                    }
                    return false;
                }
            }
        }
        long jC = s11.v((qz0) r61Var.M.d).c();
        ArrayList arrayList = new ArrayList();
        Object objG27 = rk1Var.g(kn2.C);
        if (objG27 == null) {
            objG27 = null;
        }
        q3 q3Var22 = (q3) objG27;
        Float f8 = (q3Var22 == null || (in0Var3 = (in0) q3Var22.b) == null || !((Boolean) in0Var3.j(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
        Object objG28 = rk1Var.g(kn2.d);
        if (objG28 == null) {
            objG28 = null;
        }
        q3 q3Var23 = (q3) objG28;
        if (q3Var23 == null) {
            return false;
        }
        un0 un0Var = q3Var23.b;
        Object objG29 = rk1Var.g(vn2.v);
        if (objG29 == null) {
            objG29 = null;
        }
        el2 el2Var = (el2) objG29;
        if (el2Var == null || !z11) {
            f5 = f8;
            z = z12;
        } else {
            if (f8 != null) {
                fIntBitsToFloat = f8.floatValue();
                f5 = f8;
                z = z12;
            } else {
                f5 = f8;
                z = z12;
                fIntBitsToFloat = Float.intBitsToFloat((int) (jC >> 32));
            }
            if (z7 || z6) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if ((r61Var.G == d61Var) && (z7 || z8)) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if (h7.q(el2Var, fIntBitsToFloat)) {
                yn2 yn2Var = kn2.z;
                if (!rk1Var.c(yn2Var) && !rk1Var.c(kn2.B)) {
                    mn0 mn0Var3 = (mn0) un0Var;
                    if (mn0Var3 != null) {
                        return ((Boolean) mn0Var3.g(Float.valueOf(fIntBitsToFloat), fValueOf)).booleanValue();
                    }
                    return false;
                }
                if (fIntBitsToFloat > 0.0f) {
                    Object objG30 = rk1Var.g(kn2.B);
                    q3Var3 = (q3) (objG30 == null ? null : objG30);
                } else {
                    Object objG31 = rk1Var.g(yn2Var);
                    q3Var3 = (q3) (objG31 == null ? null : objG31);
                }
                if (q3Var3 == null || (xm0Var12 = (xm0) q3Var3.b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var12.a()).booleanValue();
            }
        }
        Object objG32 = rk1Var.g(vn2.w);
        if (objG32 == null) {
            objG32 = null;
        }
        el2 el2Var2 = (el2) objG32;
        if (el2Var2 == null || !z) {
            return false;
        }
        float fFloatValue = f5 != null ? f5.floatValue() : Float.intBitsToFloat((int) (jC & 4294967295L));
        if (z9 || z6) {
            fFloatValue = -fFloatValue;
        }
        if (!h7.q(el2Var2, fFloatValue)) {
            return false;
        }
        yn2 yn2Var2 = kn2.y;
        if (!rk1Var.c(yn2Var2) && !rk1Var.c(kn2.A)) {
            mn0 mn0Var4 = (mn0) un0Var;
            if (mn0Var4 != null) {
                return ((Boolean) mn0Var4.g(fValueOf, Float.valueOf(fFloatValue))).booleanValue();
            }
            return false;
        }
        if (fFloatValue > 0.0f) {
            Object objG33 = rk1Var.g(kn2.A);
            q3Var2 = (q3) (objG33 == null ? null : objG33);
        } else {
            Object objG34 = rk1Var.g(yn2Var2);
            q3Var2 = (q3) (objG34 == null ? null : objG34);
        }
        if (q3Var2 == null || (xm0Var11 = (xm0) q3Var2.b) == null) {
            return false;
        }
        return ((Boolean) xm0Var11.a()).booleanValue();
    }
}
