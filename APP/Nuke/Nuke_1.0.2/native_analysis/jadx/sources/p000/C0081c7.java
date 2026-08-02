package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: c7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0081c7 extends C0485n4 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0267h7 f1216j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0081c7(ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7) {
        super(0);
        this.f1216j = viewOnAttachStateChangeListenerC0267h7;
    }

    @Override // p000.C0485n4
    /* JADX INFO: renamed from: i */
    public final void mo654i(int i, C0411l4 c0411l4, String str, Bundle bundle) {
        this.f1216j.m2097c(i, c0411l4, str, bundle);
    }

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
    @Override // p000.C0485n4
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0411l4 mo655l(int i) {
        ?? r44;
        xj1 xj1Var;
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7;
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
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h72;
        boolean z;
        ?? r12;
        qn2 qn2VarM4210l;
        boolean z2;
        C0603q3 c0603q3;
        C0603q3 c0603q32;
        C0603q3 c0603q33;
        String strM2085m;
        ArrayList arrayList;
        CharSequence charSequenceM2804e;
        s32 s32Var;
        Object objM4505g;
        ?? r1;
        el2 el2Var;
        el2 el2Var2;
        int i3;
        int iM6155d;
        ?? r32;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b72;
        int iM6155d2;
        String str;
        C0411l4 c0411l4;
        AbstractC0309ic abstractC0309icM1441V;
        Object objM4505g2;
        ?? r33;
        Object objM4505g3;
        ?? r5;
        r61 r61Var2;
        boolean zM5086l;
        boolean z3;
        boolean z4;
        boolean zBooleanValue;
        ?? arrayList2;
        ?? arrayList3;
        int i4;
        boolean zM5086l2;
        qn2 qn2Var2;
        ?? r122;
        Float fValueOf = Float.valueOf(0.0f);
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h73 = this.f1216j;
        AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC0267h73.f3867n;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b73 = viewOnAttachStateChangeListenerC0267h73.f3864k;
        if (((la1) viewTreeObserverOnGlobalLayoutListenerC0045b73.getComposeViewContext().f6350c.getLifecycle()).f6009h == aa1.f119h) {
            c0411l4 = !accessibilityManager.isEnabled() ? new C0411l4(AccessibilityNodeInfo.obtain()) : null;
            i2 = i;
            r122 = viewOnAttachStateChangeListenerC0267h73;
        } else {
            sn2 sn2Var = (sn2) viewOnAttachStateChangeListenerC0267h73.m2106l().m6022b(i);
            if (sn2Var == null) {
                if (!accessibilityManager.isEnabled()) {
                    c0411l4 = new C0411l4(AccessibilityNodeInfo.obtain());
                }
                i2 = i;
                r122 = viewOnAttachStateChangeListenerC0267h73;
            } else {
                qn2 qn2Var3 = sn2Var.f10248a;
                ln2 ln2VarM4209k = qn2Var3.m4209k();
                r61 r61Var3 = qn2Var3.f9049c;
                Object objM4505g4 = ln2VarM4209k.f6221h.m4505g(vn2.f12072o);
                if (objM4505g4 == null) {
                    objM4505g4 = null;
                }
                boolean zM5086l3 = t11.m5086l(objM4505g4, Boolean.TRUE);
                if (!zM5086l3) {
                    ?? Obtain = AccessibilityNodeInfo.obtain();
                    C0411l4 c0411l42 = new C0411l4(Obtain);
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 34) {
                        AbstractC0759u3.m5461g(Obtain, zM5086l3);
                        r44 = 0;
                    } else {
                        r44 = 0;
                        c0411l42.m2805f(64, zM5086l3);
                    }
                    if (i == -1) {
                        Object parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC0045b73.getParentForAccessibility();
                        ?? r13 = parentForAccessibility instanceof View ? (View) parentForAccessibility : r44;
                        c0411l42.f5915b = -1;
                        Obtain.setParent(r13);
                    } else {
                        qn2 qn2VarM4210l2 = qn2Var3.m4210l();
                        ?? ValueOf = qn2VarM4210l2 != null ? Integer.valueOf(qn2VarM4210l2.f9052f) : r44;
                        if (ValueOf == 0) {
                            kz0.m2765c("semanticsNode " + i + " has null parent");
                            C0676s.m4644b();
                            return null;
                        }
                        int iIntValue = ValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC0045b73.getSemanticsOwner().m5334a().f9052f) {
                            iIntValue = -1;
                        }
                        c0411l42.f5915b = iIntValue;
                        Obtain.setParent(viewTreeObserverOnGlobalLayoutListenerC0045b73, iIntValue);
                    }
                    c0411l42.f5916c = i;
                    Obtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0045b73, i);
                    Obtain.setBoundsInScreen(viewOnAttachStateChangeListenerC0267h73.m2098d(sn2Var));
                    xj1 xj1Var2 = viewOnAttachStateChangeListenerC0267h73.f3860Q;
                    nt2 nt2Var2 = viewOnAttachStateChangeListenerC0267h73.f3879z;
                    Resources resources2 = viewTreeObserverOnGlobalLayoutListenerC0045b73.getContext().getResources();
                    c0411l42.m2806g("android.view.View");
                    ln2 ln2Var2 = qn2Var3.f9050d;
                    rk1 rk1Var2 = ln2Var2.f6221h;
                    if (rk1Var2.m4501c(vn2.f12047G)) {
                        c0411l42.m2806g("android.widget.EditText");
                    }
                    if (rk1Var2.m4501c(vn2.f12043C)) {
                        c0411l42.m2806g("android.widget.TextView");
                    }
                    Object objM4505g5 = rk1Var2.m4505g(vn2.f12083z);
                    ?? r11 = objM4505g5;
                    if (objM4505g5 == null) {
                        r11 = r44;
                    }
                    if (((va2) r11) != null && ((qn2Var3.m4213o() || qn2.m4199j(4, qn2Var3).isEmpty()) && (qn2Var3.m4215q() || ln2Var2.f6223j))) {
                        c0411l42.m2806g("android.widget.ImageView");
                    }
                    Obtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0045b73.getContext().getPackageName());
                    Obtain.setImportantForAccessibility(xe1.m6095M(qn2Var3));
                    boolean zM5459e = i5 >= 34 ? AbstractC0759u3.m5459e(accessibilityManager) : true;
                    List listM4199j = qn2.m4199j(4, qn2Var3);
                    int size = listM4199j.size();
                    boolean z5 = zM5459e;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size) {
                        int i8 = i6;
                        qn2 qn2Var4 = (qn2) listM4199j.get(i6);
                        List list = listM4199j;
                        x01 x01VarM2106l = viewOnAttachStateChangeListenerC0267h73.m2106l();
                        int i9 = size;
                        int i10 = qn2Var4.f9052f;
                        if (x01VarM2106l.m6021a(i10)) {
                            AbstractC0309ic abstractC0309ic = viewTreeObserverOnGlobalLayoutListenerC0045b73.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(qn2Var4.f9049c);
                            if (i10 != -1) {
                                if (abstractC0309ic != null) {
                                    Obtain.addChild(abstractC0309ic);
                                } else {
                                    sn2 sn2Var2 = (sn2) viewOnAttachStateChangeListenerC0267h73.m2106l().m6022b(i10);
                                    if (sn2Var2 == null || (qn2Var2 = sn2Var2.f10248a) == null) {
                                        zM5086l2 = false;
                                    } else {
                                        Object objM4505g6 = qn2Var2.m4209k().f6221h.m4505g(vn2.f12072o);
                                        ?? r2 = objM4505g6;
                                        if (objM4505g6 == null) {
                                            r2 = r44;
                                        }
                                        zM5086l2 = t11.m5086l(r2, Boolean.TRUE);
                                    }
                                    if (z5 || !zM5086l2) {
                                        Obtain.addChild(viewTreeObserverOnGlobalLayoutListenerC0045b73, i10);
                                    }
                                }
                                xj1Var2.m6157f(i10, i7);
                                i7++;
                            }
                        }
                        i6 = i8 + 1;
                        listM4199j = list;
                        size = i9;
                    }
                    int i11 = viewOnAttachStateChangeListenerC0267h73.f3871r;
                    ?? r4 = c0411l42.f5914a;
                    if (i == i11) {
                        r4.setAccessibilityFocused(true);
                        c0411l42.m2801a(C0190f4.f2775d);
                    } else {
                        r4.setAccessibilityFocused(false);
                        c0411l42.m2801a(C0190f4.f2774c);
                    }
                    C0690sd c0690sdM4448B = rg3.m4448B(qn2Var3);
                    if (c0690sdM4448B != null) {
                        viewTreeObserverOnGlobalLayoutListenerC0045b73.getFontFamilyResolver();
                        e70 density = viewTreeObserverOnGlobalLayoutListenerC0045b73.getDensity();
                        vu2 vu2Var = viewOnAttachStateChangeListenerC0267h73.f3856M;
                        viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewTreeObserverOnGlobalLayoutListenerC0045b73;
                        String str2 = c0690sdM4448B.f10051i;
                        nt2Var = nt2Var2;
                        List list2 = c0690sdM4448B.f10050h;
                        SpannableString spannableString = new SpannableString(str2);
                        ArrayList arrayList4 = c0690sdM4448B.f10052j;
                        if (arrayList4 != null) {
                            int size2 = arrayList4.size();
                            r61Var = r61Var3;
                            int i12 = 0;
                            Obtain = Obtain;
                            while (i12 < size2) {
                                ArrayList arrayList5 = arrayList4;
                                C0652rd c0652rd = (C0652rd) arrayList4.get(i12);
                                int i13 = size2;
                                lt2 lt2Var = (lt2) c0652rd.f9514a;
                                int i14 = i12;
                                int i15 = c0652rd.f9515b;
                                int i16 = c0652rd.f9516c;
                                ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h74 = viewOnAttachStateChangeListenerC0267h73;
                                xj1 xj1Var3 = xj1Var2;
                                long jMo864b = lt2Var.f6301a.mo864b();
                                ln2 ln2Var3 = ln2Var2;
                                ?? r34 = Obtain;
                                long j = lt2Var.f6302b;
                                im0 im0Var = lt2Var.f6303c;
                                gm0 gm0Var = lt2Var.f6304d;
                                m03 m03Var = lt2Var.f6310j;
                                kc1 kc1Var = lt2Var.f6311k;
                                qn2 qn2Var5 = qn2Var3;
                                rk1 rk1Var3 = rk1Var2;
                                long j2 = lt2Var.f6312l;
                                gz2 gz2Var = lt2Var.f6313m;
                                l03 c0860wu = lt2Var.f6301a;
                                Resources resources3 = resources2;
                                if (!C0363ju.m2566c(jMo864b, c0860wu.mo864b())) {
                                    c0860wu = jMo864b != 16 ? new C0860wu(jMo864b) : C0700sn.f10217U;
                                }
                                AbstractC0179eu.m1442W(spannableString, c0860wu.mo864b(), i15, i16);
                                SpannableString spannableString2 = spannableString;
                                AbstractC0179eu.m1443X(spannableString2, j, density, i15, i16);
                                if (im0Var == null && gm0Var == null) {
                                    i4 = 33;
                                } else {
                                    StyleSpan styleSpan = new StyleSpan(AbstractC0738tl.m5274A(im0Var == null ? im0.f4680j : im0Var, gm0Var != null ? gm0Var.f3581a : 0));
                                    i4 = 33;
                                    spannableString2.setSpan(styleSpan, i15, i16, 33);
                                }
                                if (gz2Var != null) {
                                    int i17 = gz2Var.f3749a;
                                    if ((i17 | 1) == i17) {
                                        spannableString2.setSpan(new UnderlineSpan(), i15, i16, i4);
                                    }
                                    if ((i17 | 2) == i17) {
                                        spannableString2.setSpan(new StrikethroughSpan(), i15, i16, i4);
                                    }
                                }
                                if (m03Var != null) {
                                    spannableString2.setSpan(new ScaleXSpan(m03Var.f6427a), i15, i16, i4);
                                }
                                AbstractC0179eu.m1444Y(spannableString2, kc1Var, i15, i16);
                                if (j2 != 16) {
                                    spannableString2.setSpan(new BackgroundColorSpan(sp0.m4947j0(j2)), i15, i16, i4);
                                }
                                i12 = i14 + 1;
                                spannableString = spannableString2;
                                arrayList4 = arrayList5;
                                size2 = i13;
                                viewOnAttachStateChangeListenerC0267h73 = viewOnAttachStateChangeListenerC0267h74;
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
                        viewOnAttachStateChangeListenerC0267h7 = viewOnAttachStateChangeListenerC0267h73;
                        qn2Var = qn2Var3;
                        rk1Var = rk1Var2;
                        resources = resources2;
                        ln2Var = ln2Var2;
                        r35 = Obtain;
                        SpannableString spannableString3 = spannableString;
                        int length = str2.length();
                        ?? arrayList6 = be0.f819h;
                        if (list2 != null) {
                            arrayList2 = new ArrayList(list2.size());
                            int size3 = list2.size();
                            for (int i18 = 0; i18 < size3; i18++) {
                                Object obj = list2.get(i18);
                                C0652rd c0652rd2 = (C0652rd) obj;
                                if ((c0652rd2.f9514a instanceof ha3) && AbstractC0730td.m5163b(0, length, c0652rd2.f9515b, c0652rd2.f9516c)) {
                                    arrayList2.add(obj);
                                }
                            }
                        } else {
                            arrayList2 = arrayList6;
                        }
                        int size4 = arrayList2.size();
                        for (int i19 = 0; i19 < size4; i19++) {
                            C0652rd c0652rd3 = (C0652rd) arrayList2.get(i19);
                            ha3 ha3Var = (ha3) c0652rd3.f9514a;
                            int i20 = c0652rd3.f9515b;
                            int i21 = c0652rd3.f9516c;
                            if (!(ha3Var instanceof ha3)) {
                                c80.m675s();
                                return r44;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(ha3Var.f3935a).build(), i20, i21, 33);
                        }
                        int length2 = str2.length();
                        if (list2 != null) {
                            arrayList3 = new ArrayList(list2.size());
                            int size5 = list2.size();
                            for (int i22 = 0; i22 < size5; i22++) {
                                Object obj2 = list2.get(i22);
                                C0652rd c0652rd4 = (C0652rd) obj2;
                                if ((c0652rd4.f9514a instanceof v83) && AbstractC0730td.m5163b(0, length2, c0652rd4.f9515b, c0652rd4.f9516c)) {
                                    arrayList3.add(obj2);
                                }
                            }
                        } else {
                            arrayList3 = arrayList6;
                        }
                        int size6 = arrayList3.size();
                        for (int i23 = 0; i23 < size6; i23++) {
                            C0652rd c0652rd5 = (C0652rd) arrayList3.get(i23);
                            v83 v83Var = (v83) c0652rd5.f9514a;
                            int i24 = c0652rd5.f9515b;
                            int i25 = c0652rd5.f9516c;
                            WeakHashMap weakHashMap = (WeakHashMap) vu2Var.f12178a;
                            Object uRLSpan = weakHashMap.get(v83Var);
                            if (uRLSpan == null) {
                                uRLSpan = new URLSpan(v83Var.f11844a);
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
                                C0652rd c0652rd6 = (C0652rd) obj3;
                                if ((c0652rd6.f9514a instanceof fb1) && AbstractC0730td.m5163b(0, length3, c0652rd6.f9515b, c0652rd6.f9516c)) {
                                    arrayList6.add(obj3);
                                }
                            }
                        }
                        int size8 = arrayList6.size();
                        for (int i27 = 0; i27 < size8; i27++) {
                            C0652rd c0652rd7 = (C0652rd) arrayList6.get(i27);
                            int i28 = c0652rd7.f9515b;
                            Object obj4 = c0652rd7.f9514a;
                            int i29 = c0652rd7.f9516c;
                            if (i28 != i29) {
                                fb1 fb1Var = (fb1) obj4;
                                if (fb1Var instanceof eb1) {
                                    obj4.getClass();
                                    eb1 eb1Var = (eb1) obj4;
                                    C0652rd c0652rd8 = new C0652rd(i28, i29, eb1Var);
                                    WeakHashMap weakHashMap2 = (WeakHashMap) vu2Var.f12179b;
                                    Object uRLSpan2 = weakHashMap2.get(c0652rd8);
                                    if (uRLSpan2 == null) {
                                        uRLSpan2 = new URLSpan(eb1Var.f2379a);
                                        weakHashMap2.put(c0652rd8, uRLSpan2);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan2, i28, i29, 33);
                                } else {
                                    WeakHashMap weakHashMap3 = (WeakHashMap) vu2Var.f12180c;
                                    Object c0751tw = weakHashMap3.get(c0652rd7);
                                    if (c0751tw == null) {
                                        c0751tw = new C0751tw(fb1Var);
                                        weakHashMap3.put(c0652rd7, c0751tw);
                                    }
                                    spannableString3.setSpan((ClickableSpan) c0751tw, i28, i29, 33);
                                }
                            }
                        }
                        r0 = (SpannableString) ViewOnAttachStateChangeListenerC0267h7.m2084I(spannableString3);
                    } else {
                        xj1Var = xj1Var2;
                        viewOnAttachStateChangeListenerC0267h7 = viewOnAttachStateChangeListenerC0267h73;
                        viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewTreeObserverOnGlobalLayoutListenerC0045b73;
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
                    yn2 yn2Var = vn2.f12053M;
                    rk1 rk1Var4 = rk1Var;
                    if (rk1Var4.m4501c(yn2Var)) {
                        ?? r36 = r35;
                        r36.setContentInvalid(true);
                        Object objM4505g7 = rk1Var4.m4505g(yn2Var);
                        ?? r02 = objM4505g7;
                        if (objM4505g7 == null) {
                            r02 = r44;
                        }
                        r36.setError((CharSequence) r02);
                        r3 = r36;
                    } else {
                        r3 = r35;
                    }
                    qn2 qn2Var6 = qn2Var;
                    Resources resources4 = resources;
                    String strM4447A = rg3.m4447A(qn2Var6, resources4);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AbstractC0227g4.m1800h(r4, strM4447A);
                    } else {
                        r4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strM4447A);
                    }
                    r3.setCheckable(rg3.m4490z(qn2Var6));
                    Object objM4505g8 = rk1Var4.m4505g(vn2.f12051K);
                    ?? r52 = objM4505g8;
                    if (objM4505g8 == null) {
                        r52 = r44;
                    }
                    u23 u23Var = (u23) r52;
                    if (u23Var != null) {
                        if (u23Var == u23.f11081h) {
                            r4.setChecked(true);
                        } else if (u23Var == u23.f11082i) {
                            r4.setChecked(false);
                        }
                    }
                    Object objM4505g9 = rk1Var4.m4505g(vn2.f12050J);
                    ?? r53 = objM4505g9;
                    if (objM4505g9 == null) {
                        r53 = r44;
                    }
                    Boolean bool = (Boolean) r53;
                    if (bool != null) {
                        r4.setChecked(bool.booleanValue());
                    }
                    ln2 ln2Var4 = ln2Var;
                    if (!ln2Var4.f6223j || qn2.m4199j(4, qn2Var6).isEmpty()) {
                        Object objM4505g10 = rk1Var4.m4505g(vn2.f12058a);
                        ?? r6 = objM4505g10;
                        if (objM4505g10 == null) {
                            r6 = r44;
                        }
                        List list3 = (List) r6;
                        r3.setContentDescription(list3 != null ? (String) AbstractC0142du.m1161q0(list3) : r44);
                    }
                    Object objM4505g11 = rk1Var4.m4505g(vn2.f12041A);
                    ?? r62 = objM4505g11;
                    if (objM4505g11 == null) {
                        r62 = r44;
                    }
                    String str3 = (String) r62;
                    if (str3 != null) {
                        qn2 qn2VarM4210l3 = qn2Var6;
                        while (true) {
                            if (qn2VarM4210l3 == null) {
                                zBooleanValue = false;
                                break;
                            }
                            ln2 ln2Var5 = qn2VarM4210l3.f9050d;
                            yn2 yn2Var2 = wn2.f12595a;
                            if (ln2Var5.f6221h.m4501c(yn2Var2)) {
                                zBooleanValue = ((Boolean) ln2Var5.m2948c(yn2Var2)).booleanValue();
                                break;
                            }
                            qn2VarM4210l3 = qn2VarM4210l3.m4210l();
                        }
                        if (zBooleanValue) {
                            r3.setViewIdResourceName(str3);
                        }
                    }
                    Object objM4505g12 = rk1Var4.m4505g(vn2.f12065h);
                    ?? r63 = objM4505g12;
                    if (objM4505g12 == null) {
                        r63 = r44;
                    }
                    if (((a83) r63) != null) {
                        if (Build.VERSION.SDK_INT >= 28) {
                            r4.setHeading(true);
                        } else {
                            c0411l42.m2805f(2, true);
                        }
                    }
                    Object objM4505g13 = rk1Var4.m4505g(vn2.f12066i);
                    ?? r64 = objM4505g13;
                    if (objM4505g13 == null) {
                        r64 = r44;
                    }
                    if (((a83) r64) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            r3.setTextEntryKey(true);
                        } else {
                            c0411l42.m2805f(8, true);
                        }
                    }
                    i2 = i;
                    if (i2 != -1) {
                        int iM6155d3 = xj1Var.m6155d(qn2Var6.f9052f);
                        if (iM6155d3 != -1) {
                            r3.setDrawingOrder(iM6155d3);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    r3.setPassword(rk1Var4.m4501c(vn2.f12052L));
                    Object objM4505g14 = rk1Var4.m4505g(vn2.f12055O);
                    ?? r10 = objM4505g14;
                    if (objM4505g14 == null) {
                        r10 = r44;
                    }
                    Boolean bool2 = Boolean.TRUE;
                    r3.setEditable(t11.m5086l(r10, bool2));
                    Integer num = (Integer) pp0.m3926x(ln2Var4, vn2.f12056P);
                    r3.setMaxTextLength(num != null ? num.intValue() : -1);
                    r3.setEnabled(rg3.m4474j(qn2Var6));
                    yn2 yn2Var3 = vn2.f12069l;
                    r3.setFocusable(rk1Var4.m4501c(yn2Var3));
                    if (r3.isFocusable()) {
                        r3.setFocused(((Boolean) ln2Var4.m2948c(yn2Var3)).booleanValue());
                        if (r3.isFocused()) {
                            r4.addAction(2);
                            ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h75 = viewOnAttachStateChangeListenerC0267h7;
                            viewOnAttachStateChangeListenerC0267h75.f3872s = i2;
                            viewOnAttachStateChangeListenerC0267h72 = viewOnAttachStateChangeListenerC0267h75;
                        } else {
                            r12 = viewOnAttachStateChangeListenerC0267h7;
                            z = true;
                            r4.addAction(1);
                            r4.setVisibleToUser(xe1.m6094L(qn2Var6) ^ z);
                            if (qn2Var6.m4213o()) {
                                qn2VarM4210l = qn2Var6;
                            } else {
                                qn2VarM4210l = qn2Var6.m4210l();
                                qn2VarM4210l.getClass();
                            }
                            if (qn2VarM4210l.m4211m().m3518f()) {
                                z2 = false;
                            } else {
                                z2 = false;
                                r4.setVisibleToUser(false);
                            }
                            vi0.m5701t(pp0.m3926x(ln2Var4, vn2.f12068k));
                            r4.setClickable(z2);
                            c0603q3 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5660b);
                            if (c0603q3 != null) {
                                t11.m5086l(pp0.m3926x(ln2Var4, vn2.f12050J), bool2);
                                r4.setClickable(true);
                                if (rg3.m4474j(qn2Var6) && r3.isClickable()) {
                                    c0411l42.m2801a(new C0190f4(c0603q3.f8712a, 16));
                                }
                            }
                            r4.setLongClickable(false);
                            c0603q32 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5661c);
                            if (c0603q32 != null) {
                                r4.setLongClickable(true);
                                if (rg3.m4474j(qn2Var6)) {
                                    c0411l42.m2801a(new C0190f4(c0603q32.f8712a, 32));
                                }
                            }
                            c0603q33 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5675q);
                            if (c0603q33 != null) {
                                c0411l42.m2801a(new C0190f4(c0603q33.f8712a, 16384));
                            }
                            if (rg3.m4474j(qn2Var6)) {
                                C0603q3 c0603q34 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5669k);
                                if (c0603q34 != null) {
                                    c0411l42.m2801a(new C0190f4(c0603q34.f8712a, 2097152));
                                }
                                C0603q3 c0603q35 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5674p);
                                if (c0603q35 != null) {
                                    c0411l42.m2801a(new C0190f4(c0603q35.f8712a, R.id.accessibilityActionImeEnter));
                                }
                                C0603q3 c0603q36 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5676r);
                                if (c0603q36 != null) {
                                    c0411l42.m2801a(new C0190f4(c0603q36.f8712a, 65536));
                                }
                                C0603q3 c0603q37 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5677s);
                                if (c0603q37 != null && r3.isFocused()) {
                                    ClipDescription primaryClipDescription = viewTreeObserverOnGlobalLayoutListenerC0045b7.m6528getClipboardManager().m2455a().getPrimaryClipDescription();
                                    if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                        c0411l42.m2801a(new C0190f4(c0603q37.f8712a, AIChatConfig.MaxOutputTokens));
                                    }
                                }
                            }
                            strM2085m = ViewOnAttachStateChangeListenerC0267h7.m2085m(qn2Var6);
                            if (!(strM2085m != null || strM2085m.length() == 0)) {
                                r3.setTextSelection(r12.m2105k(qn2Var6), r12.m2104j(qn2Var6));
                                C0603q3 c0603q38 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5668j);
                                c0411l42.m2801a(new C0190f4(c0603q38 != null ? c0603q38.f8712a : r44, 131072));
                                r4.addAction(256);
                                r4.addAction(AIChatConfig.DefaultMaxTokens);
                                r4.setMovementGranularities(11);
                                List list4 = (List) pp0.m3926x(ln2Var4, vn2.f12058a);
                                if ((list4 == null || list4.isEmpty()) && rk1Var4.m4501c(kn2.f5659a)) {
                                    if (!rk1Var4.m4501c(vn2.f12047G) || t11.m5086l(pp0.m3926x(ln2Var4, yn2Var3), bool2)) {
                                        ?? M4389u = r61Var.m4389u();
                                        while (true) {
                                            if (M4389u == 0) {
                                                M4389u = r44;
                                                break;
                                            }
                                            ln2 ln2VarM4391w = M4389u.m4391w();
                                            if (ln2VarM4391w == null || !ln2VarM4391w.f6223j) {
                                                z3 = false;
                                                if (!z3) {
                                                    break;
                                                }
                                                M4389u = M4389u.m4389u();
                                            } else {
                                                if (ln2VarM4391w.f6221h.m4501c(vn2.f12047G)) {
                                                    z3 = true;
                                                }
                                                if (!z3) {
                                                }
                                            }
                                        }
                                        if (M4389u != 0) {
                                            ln2 ln2VarM4391w2 = M4389u.m4391w();
                                            if (ln2VarM4391w2 != null) {
                                                Object objM4505g15 = ln2VarM4391w2.f6221h.m4505g(vn2.f12069l);
                                                ?? r8 = objM4505g15;
                                                if (objM4505g15 == null) {
                                                    r8 = r44;
                                                }
                                                zM5086l = t11.m5086l(r8, Boolean.TRUE);
                                            } else {
                                                zM5086l = false;
                                            }
                                            z4 = zM5086l ? false : true;
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
                            charSequenceM2804e = c0411l42.m2804e();
                            if (!(charSequenceM2804e != null || charSequenceM2804e.length() == 0) && rk1Var4.m4501c(kn2.f5659a)) {
                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (rk1Var4.m4501c(vn2.f12041A)) {
                                arrayList.add("androidx.compose.ui.semantics.testTag");
                            }
                            if (rk1Var4.m4501c(vn2.f12057Q)) {
                                arrayList.add("androidx.compose.ui.semantics.shapeType");
                                arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                            }
                            r3.setAvailableExtraData(arrayList);
                            s32Var = (s32) pp0.m3926x(ln2Var4, vn2.f12060c);
                            if (s32Var != null) {
                                float f = s32Var.f9898a;
                                C0748tt c0748tt = s32Var.f9899b;
                                yn2 yn2Var4 = kn2.f5667i;
                                if (rk1Var4.m4501c(yn2Var4)) {
                                    c0411l42.m2806g("android.widget.SeekBar");
                                } else {
                                    c0411l42.m2806g("android.widget.ProgressBar");
                                }
                                if (s32Var != s32.f9897c) {
                                    r4.setRangeInfo((AccessibilityNodeInfo.RangeInfo) new C0374k4(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, c0748tt.f10957a, f)).f5331h);
                                }
                                if (rk1Var4.m4501c(yn2Var4) && rg3.m4474j(qn2Var6)) {
                                    if (f < ci0.m776A(Float.valueOf(c0748tt.f10957a).floatValue(), fValueOf.floatValue())) {
                                        c0411l42.m2801a(C0190f4.f2776e);
                                    }
                                    float fFloatValue = fValueOf.floatValue();
                                    float fFloatValue2 = Float.valueOf(c0748tt.f10957a).floatValue();
                                    if (fFloatValue > fFloatValue2) {
                                        fFloatValue = fFloatValue2;
                                    }
                                    if (f > fFloatValue) {
                                        c0411l42.m2801a(C0190f4.f2777f);
                                    }
                                }
                            }
                            fg1.m1637j(c0411l42, qn2Var6);
                            rp0.m4550k0(c0411l42, qn2Var6);
                            objM4505g = qn2Var6.m4209k().f6221h.m4505g(vn2.f12064g);
                            r1 = objM4505g;
                            if (objM4505g == null) {
                                r1 = r44;
                            }
                            if (r1 != 0) {
                                qn2 qn2VarM4210l4 = qn2Var6.m4210l();
                                if (qn2VarM4210l4 != null) {
                                    Object objM4505g16 = qn2VarM4210l4.m4209k().f6221h.m4505g(vn2.f12062e);
                                    ?? r37 = objM4505g16;
                                    if (objM4505g16 == null) {
                                        r37 = r44;
                                    }
                                    if (r37 != 0) {
                                        Object objM4505g17 = qn2VarM4210l4.m4209k().f6221h.m4505g(vn2.f12063f);
                                        ?? r38 = objM4505g17;
                                        if (objM4505g17 == null) {
                                            r38 = r44;
                                        }
                                        C0974zt c0974zt = (C0974zt) r38;
                                        if (c0974zt == null || (c0974zt.f14088a >= 0 && c0974zt.f14089b >= 0)) {
                                            if (qn2Var6.m4209k().f6221h.m4501c(vn2.f12050J)) {
                                                ArrayList arrayList7 = new ArrayList();
                                                List listM4199j2 = qn2.m4199j(4, qn2VarM4210l4);
                                                int size9 = listM4199j2.size();
                                                int i30 = 0;
                                                for (int i31 = 0; i31 < size9; i31++) {
                                                    qn2 qn2Var7 = (qn2) listM4199j2.get(i31);
                                                    if (qn2Var7.m4209k().f6221h.m4501c(vn2.f12050J)) {
                                                        arrayList7.add(qn2Var7);
                                                        if (qn2Var7.f9049c.m4390v() < qn2Var6.f9049c.m4390v()) {
                                                            i30++;
                                                        }
                                                    }
                                                }
                                                if (!arrayList7.isEmpty()) {
                                                    boolean zM4536V = rp0.m4536V(arrayList7);
                                                    int i32 = zM4536V ? 0 : i30;
                                                    int i33 = zM4536V ? i30 : 0;
                                                    Object objM4505g18 = qn2Var6.m4209k().f6221h.m4505g(vn2.f12050J);
                                                    if (objM4505g18 == null) {
                                                        objM4505g18 = Boolean.FALSE;
                                                    }
                                                    r4.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i32, 1, i33, 1, false, ((Boolean) objM4505g18).booleanValue()));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                c80.m664g();
                            }
                            el2Var = (el2) pp0.m3926x(qn2Var6.m4212n(), vn2.f12079v);
                            C0603q3 c0603q39 = (C0603q3) pp0.m3926x(qn2Var6.m4212n(), kn2.f5662d);
                            if (el2Var != null && c0603q39 != null) {
                                objM4505g3 = qn2Var6.m4209k().f6221h.m4505g(vn2.f12063f);
                                r5 = objM4505g3;
                                if (objM4505g3 == null) {
                                    r5 = r44;
                                }
                                if (r5 != 0) {
                                    Object objM4505g19 = qn2Var6.m4209k().f6221h.m4505g(vn2.f12062e);
                                    ?? r54 = objM4505g19;
                                    if (objM4505g19 == null) {
                                        r54 = r44;
                                    }
                                    boolean z6 = r54 != 0;
                                    if (!z6) {
                                        c0411l42.m2806g("android.widget.HorizontalScrollView");
                                    }
                                    if (((Number) el2Var.f2498b.mo6a()).floatValue() > 0.0f) {
                                        r4.setScrollable(true);
                                    }
                                    if (rg3.m4474j(qn2Var6)) {
                                        boolean zM2088s = ViewOnAttachStateChangeListenerC0267h7.m2088s(el2Var);
                                        d61 d61Var = d61.f1886i;
                                        if (zM2088s) {
                                            c0411l42.m2801a(C0190f4.f2776e);
                                            r61Var2 = r61Var;
                                            c0411l42.m2801a(!(r61Var2.f9366G == d61Var) ? C0190f4.f2781j : C0190f4.f2779h);
                                        } else {
                                            r61Var2 = r61Var;
                                        }
                                        if (ViewOnAttachStateChangeListenerC0267h7.m2087r(el2Var)) {
                                            c0411l42.m2801a(C0190f4.f2777f);
                                            c0411l42.m2801a(!(r61Var2.f9366G == d61Var) ? C0190f4.f2779h : C0190f4.f2781j);
                                        }
                                    }
                                }
                            }
                            el2Var2 = (el2) pp0.m3926x(qn2Var6.m4212n(), vn2.f12080w);
                            if (el2Var2 != null && c0603q39 != null) {
                                objM4505g2 = qn2Var6.m4209k().f6221h.m4505g(vn2.f12063f);
                                r33 = objM4505g2;
                                if (objM4505g2 == null) {
                                    r33 = r44;
                                }
                                if (r33 != 0) {
                                    Object objM4505g20 = qn2Var6.m4209k().f6221h.m4505g(vn2.f12062e);
                                    ?? r39 = objM4505g20;
                                    if (objM4505g20 == null) {
                                        r39 = r44;
                                    }
                                    boolean z7 = r39 != 0;
                                    if (!z7) {
                                        c0411l42.m2806g("android.widget.ScrollView");
                                    }
                                    if (((Number) el2Var2.f2498b.mo6a()).floatValue() > 0.0f) {
                                        r4.setScrollable(true);
                                    }
                                    if (rg3.m4474j(qn2Var6)) {
                                        if (ViewOnAttachStateChangeListenerC0267h7.m2088s(el2Var2)) {
                                            c0411l42.m2801a(C0190f4.f2776e);
                                            c0411l42.m2801a(C0190f4.f2780i);
                                        }
                                        if (ViewOnAttachStateChangeListenerC0267h7.m2087r(el2Var2)) {
                                            c0411l42.m2801a(C0190f4.f2777f);
                                            c0411l42.m2801a(C0190f4.f2778g);
                                        }
                                    }
                                }
                            }
                            i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 29) {
                                xe1.m6113c(c0411l42, qn2Var6);
                            }
                            CharSequence charSequence = (CharSequence) pp0.m3926x(qn2Var6.m4212n(), vn2.f12061d);
                            if (i3 < 28) {
                                r4.setPaneTitle(charSequence);
                            } else {
                                r4.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                            }
                            if (rg3.m4474j(qn2Var6)) {
                                C0603q3 c0603q310 = (C0603q3) pp0.m3926x(qn2Var6.m4212n(), kn2.f5678t);
                                if (c0603q310 != null) {
                                    c0411l42.m2801a(new C0190f4(c0603q310.f8712a, 262144));
                                }
                                C0603q3 c0603q311 = (C0603q3) pp0.m3926x(qn2Var6.m4212n(), kn2.f5679u);
                                if (c0603q311 != null) {
                                    c0411l42.m2801a(new C0190f4(c0603q311.f8712a, 524288));
                                }
                                C0603q3 c0603q312 = (C0603q3) pp0.m3926x(qn2Var6.m4212n(), kn2.f5680v);
                                if (c0603q312 != null) {
                                    c0411l42.m2801a(new C0190f4(c0603q312.f8712a, 1048576));
                                }
                                ln2 ln2VarM4212n = qn2Var6.m4212n();
                                yn2 yn2Var5 = kn2.f5682x;
                                if (ln2VarM4212n.f6221h.m4501c(yn2Var5)) {
                                    List list5 = (List) qn2Var6.m4212n().m2948c(yn2Var5);
                                    int size10 = list5.size();
                                    yj1 yj1Var = ViewOnAttachStateChangeListenerC0267h7.f3843U;
                                    if (size10 >= yj1Var.f13491b) {
                                        throw new IllegalStateException("Can't have more than " + yj1Var.f13491b + " custom actions for one widget");
                                    }
                                    nt2 nt2Var3 = new nt2();
                                    gk1 gk1VarM2228a = hs1.m2228a();
                                    nt2 nt2Var4 = nt2Var;
                                    if (rg3.m4480p(nt2Var4.f7325h, nt2Var4.f7327j, i2) >= 0) {
                                        gk1 gk1Var = (gk1) nt2Var4.m3406d(i2);
                                        int[] iArr = yj1Var.f13490a;
                                        int i34 = yj1Var.f13491b;
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
                                            vi0.m5701t(list5.get(0));
                                            gk1Var3.getClass();
                                            throw r44;
                                        }
                                        if (arrayList8.size() > 0) {
                                            vi0.m5701t(arrayList8.get(0));
                                            if (i36 <= 0) {
                                                C0676s.m4646d("Index must be between 0 and size");
                                                return r44;
                                            }
                                            int i40 = iArrCopyOf[0];
                                            throw r44;
                                        }
                                    } else if (list5.size() > 0) {
                                        vi0.m5701t(list5.get(0));
                                        yj1Var.m6283c(0);
                                        throw r44;
                                    }
                                    r12.f3878y.m3407f(i2, nt2Var3);
                                    nt2Var4.m3407f(i2, gk1VarM2228a);
                                }
                            }
                            boolean zM4475k = rg3.m4475k(qn2Var6, resources4);
                            if (Build.VERSION.SDK_INT < 28) {
                                r4.setScreenReaderFocusable(zM4475k);
                            } else {
                                c0411l42.m2805f(1, zM4475k);
                            }
                            iM6155d = r12.f3852I.m6155d(i2);
                            if (iM6155d == -1) {
                                AbstractC0309ic abstractC0309icM1441V2 = AbstractC0179eu.m1441V(viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui(), iM6155d);
                                if (abstractC0309icM1441V2 != null) {
                                    r4.setTraversalBefore(abstractC0309icM1441V2);
                                    viewTreeObserverOnGlobalLayoutListenerC0045b72 = viewTreeObserverOnGlobalLayoutListenerC0045b7;
                                } else {
                                    viewTreeObserverOnGlobalLayoutListenerC0045b72 = viewTreeObserverOnGlobalLayoutListenerC0045b7;
                                    r4.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0045b72, iM6155d);
                                }
                                ?? r310 = r44;
                                r12.m2097c(i2, c0411l42, r12.f3854K, r310);
                                r32 = r310;
                            } else {
                                r32 = r44;
                                viewTreeObserverOnGlobalLayoutListenerC0045b72 = viewTreeObserverOnGlobalLayoutListenerC0045b7;
                            }
                            iM6155d2 = r12.f3853J.m6155d(i2);
                            if (iM6155d2 != -1 && (abstractC0309icM1441V = AbstractC0179eu.m1441V(viewTreeObserverOnGlobalLayoutListenerC0045b72.getAndroidViewsHandler$ui(), iM6155d2)) != null) {
                                r4.setTraversalAfter(abstractC0309icM1441V);
                                r12.m2097c(i2, c0411l42, r12.f3855L, r32);
                            }
                            str = (String) pp0.m3926x(qn2Var6.m4212n(), wn2.f12596b);
                            if (str != null) {
                                c0411l42.m2806g(str);
                            }
                            c0411l4 = c0411l42;
                            r122 = r12;
                        }
                    } else {
                        viewOnAttachStateChangeListenerC0267h72 = viewOnAttachStateChangeListenerC0267h7;
                    }
                    z = true;
                    r12 = viewOnAttachStateChangeListenerC0267h72;
                    r4.setVisibleToUser(xe1.m6094L(qn2Var6) ^ z);
                    if (qn2Var6.m4213o()) {
                    }
                    if (qn2VarM4210l.m4211m().m3518f()) {
                    }
                    vi0.m5701t(pp0.m3926x(ln2Var4, vn2.f12068k));
                    r4.setClickable(z2);
                    c0603q3 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5660b);
                    if (c0603q3 != null) {
                    }
                    r4.setLongClickable(false);
                    c0603q32 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5661c);
                    if (c0603q32 != null) {
                    }
                    c0603q33 = (C0603q3) pp0.m3926x(ln2Var4, kn2.f5675q);
                    if (c0603q33 != null) {
                    }
                    if (rg3.m4474j(qn2Var6)) {
                    }
                    strM2085m = ViewOnAttachStateChangeListenerC0267h7.m2085m(qn2Var6);
                    if (strM2085m != null) {
                        if (!(strM2085m != null || strM2085m.length() == 0)) {
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceM2804e = c0411l42.m2804e();
                        if (charSequenceM2804e != null) {
                            if (!(charSequenceM2804e != null || charSequenceM2804e.length() == 0)) {
                                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                            }
                            if (rk1Var4.m4501c(vn2.f12041A)) {
                            }
                            if (rk1Var4.m4501c(vn2.f12057Q)) {
                            }
                            r3.setAvailableExtraData(arrayList);
                            s32Var = (s32) pp0.m3926x(ln2Var4, vn2.f12060c);
                            if (s32Var != null) {
                            }
                            fg1.m1637j(c0411l42, qn2Var6);
                            rp0.m4550k0(c0411l42, qn2Var6);
                            objM4505g = qn2Var6.m4209k().f6221h.m4505g(vn2.f12064g);
                            r1 = objM4505g;
                            if (objM4505g == null) {
                            }
                            if (r1 != 0) {
                            }
                            el2Var = (el2) pp0.m3926x(qn2Var6.m4212n(), vn2.f12079v);
                            C0603q3 c0603q392 = (C0603q3) pp0.m3926x(qn2Var6.m4212n(), kn2.f5662d);
                            if (el2Var != null) {
                                objM4505g3 = qn2Var6.m4209k().f6221h.m4505g(vn2.f12063f);
                                r5 = objM4505g3;
                                if (objM4505g3 == null) {
                                }
                                if (r5 != 0) {
                                }
                            }
                            el2Var2 = (el2) pp0.m3926x(qn2Var6.m4212n(), vn2.f12080w);
                            if (el2Var2 != null) {
                                objM4505g2 = qn2Var6.m4209k().f6221h.m4505g(vn2.f12063f);
                                r33 = objM4505g2;
                                if (objM4505g2 == null) {
                                }
                                if (r33 != 0) {
                                }
                            }
                            i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 29) {
                            }
                            CharSequence charSequence2 = (CharSequence) pp0.m3926x(qn2Var6.m4212n(), vn2.f12061d);
                            if (i3 < 28) {
                            }
                            if (rg3.m4474j(qn2Var6)) {
                            }
                            boolean zM4475k2 = rg3.m4475k(qn2Var6, resources4);
                            if (Build.VERSION.SDK_INT < 28) {
                            }
                            iM6155d = r12.f3852I.m6155d(i2);
                            if (iM6155d == -1) {
                            }
                            iM6155d2 = r12.f3853J.m6155d(i2);
                            if (iM6155d2 != -1) {
                                r4.setTraversalAfter(abstractC0309icM1441V);
                                r12.m2097c(i2, c0411l42, r12.f3855L, r32);
                            }
                            str = (String) pp0.m3926x(qn2Var6.m4212n(), wn2.f12596b);
                            if (str != null) {
                            }
                            c0411l4 = c0411l42;
                            r122 = r12;
                        }
                    }
                } else if (!(Build.VERSION.SDK_INT >= 34 ? AbstractC0759u3.m5459e(accessibilityManager) : true)) {
                    i2 = i;
                    r122 = viewOnAttachStateChangeListenerC0267h73;
                    c0411l4 = null;
                }
            }
        }
        if (r122.f3875v) {
            if (i2 == r122.f3871r) {
                r122.f3873t = c0411l4;
            }
            if (i2 == r122.f3872s) {
                r122.f3874u = c0411l4;
            }
        }
        return c0411l4;
    }

    @Override // p000.C0485n4
    /* JADX INFO: renamed from: s */
    public final C0411l4 mo656s(int i) {
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = this.f1216j;
        if (i != 1) {
            if (i == 2) {
                return mo655l(viewOnAttachStateChangeListenerC0267h7.f3871r);
            }
            C0676s.m4651j(vi0.m5688g("Unknown focus type: ", i));
            return null;
        }
        int i2 = viewOnAttachStateChangeListenerC0267h7.f3872s;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo655l(i2);
    }

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
    @Override // p000.C0485n4
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo657w(int i, int i2, Bundle bundle) {
        qn2 qn2Var;
        int i3;
        Integer num;
        AbstractC0796v3 abstractC0796v3;
        int iM2105k;
        int i4;
        y03 y03VarM1433N;
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
        C0603q3 c0603q3;
        long jMo646M;
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
        C0603q3 c0603q32;
        xm0 xm0Var11;
        float fIntBitsToFloat;
        C0603q3 c0603q33;
        xm0 xm0Var12;
        in0 in0Var3;
        xm0 xm0Var13;
        xm0 xm0Var14;
        xm0 xm0Var15;
        xm0 xm0Var16;
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = this.f1216j;
        AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC0267h7.f3867n;
        Float fValueOf = Float.valueOf(0.0f);
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = viewOnAttachStateChangeListenerC0267h7.f3864k;
        sn2 sn2Var = (sn2) viewOnAttachStateChangeListenerC0267h7.m2106l().m6022b(i);
        if (sn2Var == null || (qn2Var = sn2Var.f10248a) == null) {
            return false;
        }
        r61 r61Var = qn2Var.f9049c;
        int i5 = qn2Var.f9052f;
        ln2 ln2Var = qn2Var.f9050d;
        rk1 rk1Var = ln2Var.f6221h;
        Object objM4505g = rk1Var.m4505g(vn2.f12072o);
        if (objM4505g == null) {
            objM4505g = null;
        }
        Boolean bool = Boolean.TRUE;
        if (t11.m5086l(objM4505g, bool)) {
            if (!(Build.VERSION.SDK_INT >= 34 ? AbstractC0759u3.m5459e(accessibilityManager) : true)) {
                return false;
            }
        }
        if (i2 == 64) {
            if (!(accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled())) {
                return false;
            }
            int i6 = viewOnAttachStateChangeListenerC0267h7.f3871r;
            if (i6 == i) {
                return false;
            }
            if (i6 != Integer.MIN_VALUE) {
                i3 = 12;
                num = null;
                ViewOnAttachStateChangeListenerC0267h7.m2089x(viewOnAttachStateChangeListenerC0267h7, i6, 65536, null, 12);
            } else {
                i3 = 12;
                num = null;
            }
            viewOnAttachStateChangeListenerC0267h7.f3871r = i;
            viewTreeObserverOnGlobalLayoutListenerC0045b7.invalidate();
            ViewOnAttachStateChangeListenerC0267h7.m2089x(viewOnAttachStateChangeListenerC0267h7, i, AIChatConfig.MaxOutputTokens, num, i3);
            return true;
        }
        if (i2 == 128) {
            if (!(viewOnAttachStateChangeListenerC0267h7.f3871r == i)) {
                return false;
            }
            viewOnAttachStateChangeListenerC0267h7.f3871r = Integer.MIN_VALUE;
            viewOnAttachStateChangeListenerC0267h7.f3873t = null;
            viewTreeObserverOnGlobalLayoutListenerC0045b7.invalidate();
            ViewOnAttachStateChangeListenerC0267h7.m2089x(viewOnAttachStateChangeListenerC0267h7, i, 65536, null, 12);
            return true;
        }
        if (i2 == 256 || i2 == 512) {
            if (bundle == null) {
                return false;
            }
            int i7 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
            boolean z2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
            boolean z3 = i2 == 256;
            Integer num2 = viewOnAttachStateChangeListenerC0267h7.f3845B;
            if (num2 == null || i5 != num2.intValue()) {
                viewOnAttachStateChangeListenerC0267h7.f3844A = -1;
                viewOnAttachStateChangeListenerC0267h7.f3845B = Integer.valueOf(i5);
            }
            String strM2085m = ViewOnAttachStateChangeListenerC0267h7.m2085m(qn2Var);
            if (strM2085m == null || strM2085m.length() == 0) {
                return false;
            }
            String strM2085m2 = ViewOnAttachStateChangeListenerC0267h7.m2085m(qn2Var);
            if (strM2085m2 == null || strM2085m2.length() == 0) {
                abstractC0796v3 = null;
            } else if (i7 == 1) {
                Locale locale = viewTreeObserverOnGlobalLayoutListenerC0045b7.getContext().getResources().getConfiguration().locale;
                if (C0833w3.f12281l == null) {
                    C0833w3 c0833w3 = new C0833w3(0);
                    c0833w3.f12287k = BreakIterator.getCharacterInstance(locale);
                    C0833w3.f12281l = c0833w3;
                }
                C0833w3 c0833w32 = C0833w3.f12281l;
                c0833w32.getClass();
                c0833w32.m5829l(strM2085m2);
                abstractC0796v3 = c0833w32;
            } else if (i7 == 2) {
                Locale locale2 = viewTreeObserverOnGlobalLayoutListenerC0045b7.getContext().getResources().getConfiguration().locale;
                if (C0833w3.f12282m == null) {
                    C0833w3 c0833w33 = new C0833w3(1);
                    c0833w33.f12287k = BreakIterator.getWordInstance(locale2);
                    C0833w3.f12282m = c0833w33;
                }
                C0833w3 c0833w34 = C0833w3.f12282m;
                c0833w34.getClass();
                c0833w34.m5829l(strM2085m2);
                abstractC0796v3 = c0833w34;
            } else if (i7 == 4) {
                if (rk1Var.m4501c(kn2.f5659a) && (y03VarM1433N = AbstractC0179eu.m1433N(ln2Var)) != null) {
                    if (i7 == 4) {
                        if (C0833w3.f12283n == null) {
                            C0833w3.f12283n = new C0833w3(2);
                        }
                        C0833w3 c0833w35 = C0833w3.f12283n;
                        c0833w35.getClass();
                        c0833w35.f11660h = strM2085m2;
                        c0833w35.f12287k = y03VarM1433N;
                        abstractC0796v3 = c0833w35;
                    } else {
                        if (C0870x3.f12782l == null) {
                            C0870x3 c0870x3 = new C0870x3();
                            new Rect();
                            C0870x3.f12782l = c0870x3;
                        }
                        C0870x3 c0870x32 = C0870x3.f12782l;
                        c0870x32.getClass();
                        c0870x32.f11660h = strM2085m2;
                        c0870x32.f12785j = y03VarM1433N;
                        c0870x32.f12786k = qn2Var;
                        abstractC0796v3 = c0870x32;
                    }
                }
            } else if (i7 == 8) {
                if (C0909y3.f13286j == null) {
                    C0909y3.f13286j = new C0909y3();
                }
                C0909y3 c0909y3 = C0909y3.f13286j;
                c0909y3.getClass();
                c0909y3.f11660h = strM2085m2;
                abstractC0796v3 = c0909y3;
            } else if (i7 != 16) {
            }
            if (abstractC0796v3 == null) {
                return false;
            }
            int iM2104j = viewOnAttachStateChangeListenerC0267h7.m2104j(qn2Var);
            if (iM2104j == -1) {
                iM2104j = z3 ? 0 : strM2085m.length();
            }
            int[] iArrMo5611a = z3 ? abstractC0796v3.mo5611a(iM2104j) : abstractC0796v3.mo5618i(iM2104j);
            if (iArrMo5611a == null) {
                return false;
            }
            int i8 = iArrMo5611a[0];
            int i9 = iArrMo5611a[1];
            if (z2 && !rk1Var.m4501c(vn2.f12058a) && rk1Var.m4501c(vn2.f12047G)) {
                iM2105k = viewOnAttachStateChangeListenerC0267h7.m2105k(qn2Var);
                if (iM2105k == -1) {
                    iM2105k = z3 ? i8 : i9;
                }
                i4 = z3 ? i9 : i8;
            } else {
                iM2105k = z3 ? i9 : i8;
                i4 = iM2105k;
            }
            viewOnAttachStateChangeListenerC0267h7.f3849F = new C0120d7(qn2Var, z3 ? 256 : 512, i7, i8, i9, SystemClock.uptimeMillis());
            viewOnAttachStateChangeListenerC0267h7.m2093D(qn2Var, iM2105k, i4, true);
            return true;
        }
        if (i2 == 16384) {
            Object objM4505g2 = rk1Var.m4505g(kn2.f5675q);
            C0603q3 c0603q34 = (C0603q3) (objM4505g2 == null ? null : objM4505g2);
            if (c0603q34 == null || (xm0Var = (xm0) c0603q34.f8713b) == null) {
                return false;
            }
            return ((Boolean) xm0Var.mo6a()).booleanValue();
        }
        if (i2 == 131072) {
            boolean zM2093D = viewOnAttachStateChangeListenerC0267h7.m2093D(qn2Var, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, bundle != null ? bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (zM2093D) {
                ViewOnAttachStateChangeListenerC0267h7.m2089x(viewOnAttachStateChangeListenerC0267h7, viewOnAttachStateChangeListenerC0267h7.m2110t(i5), 0, null, 12);
            }
            return zM2093D;
        }
        if (!rg3.m4474j(qn2Var)) {
            return false;
        }
        if (i2 == 1) {
            if (viewTreeObserverOnGlobalLayoutListenerC0045b7.isInTouchMode()) {
                viewTreeObserverOnGlobalLayoutListenerC0045b7.requestFocusFromTouch();
            }
            Object objM4505g3 = rk1Var.m4505g(kn2.f5681w);
            C0603q3 c0603q35 = (C0603q3) (objM4505g3 == null ? null : objM4505g3);
            if (c0603q35 == null || (xm0Var2 = (xm0) c0603q35.f8713b) == null) {
                return false;
            }
            return ((Boolean) xm0Var2.mo6a()).booleanValue();
        }
        if (i2 == 2) {
            Object objM4505g4 = rk1Var.m4505g(vn2.f12069l);
            if (objM4505g4 == null) {
                objM4505g4 = null;
            }
            if (!t11.m5086l(objM4505g4, bool)) {
                return false;
            }
            ((bl0) viewTreeObserverOnGlobalLayoutListenerC0045b7.getFocusOwner()).m557b(8, false, true);
            return true;
        }
        d61 d61Var = d61.f1886i;
        switch (i2) {
            case 16:
                Object objM4505g5 = rk1Var.m4505g(kn2.f5660b);
                if (objM4505g5 == null) {
                    objM4505g5 = null;
                }
                C0603q3 c0603q36 = (C0603q3) objM4505g5;
                Boolean bool2 = (c0603q36 == null || (xm0Var3 = (xm0) c0603q36.f8713b) == null) ? null : (Boolean) xm0Var3.mo6a();
                ViewOnAttachStateChangeListenerC0267h7.m2089x(viewOnAttachStateChangeListenerC0267h7, i, 1, null, 12);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return false;
            case 32:
                Object objM4505g6 = rk1Var.m4505g(kn2.f5661c);
                C0603q3 c0603q37 = (C0603q3) (objM4505g6 == null ? null : objM4505g6);
                if (c0603q37 == null || (xm0Var4 = (xm0) c0603q37.f8713b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var4.mo6a()).booleanValue();
            case 4096:
            case 8192:
                break;
            case AIChatConfig.MaxOutputTokens /* 32768 */:
                Object objM4505g7 = rk1Var.m4505g(kn2.f5677s);
                C0603q3 c0603q38 = (C0603q3) (objM4505g7 == null ? null : objM4505g7);
                if (c0603q38 == null || (xm0Var5 = (xm0) c0603q38.f8713b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var5.mo6a()).booleanValue();
            case 65536:
                Object objM4505g8 = rk1Var.m4505g(kn2.f5676r);
                C0603q3 c0603q39 = (C0603q3) (objM4505g8 == null ? null : objM4505g8);
                if (c0603q39 == null || (xm0Var6 = (xm0) c0603q39.f8713b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var6.mo6a()).booleanValue();
            case 262144:
                Object objM4505g9 = rk1Var.m4505g(kn2.f5678t);
                C0603q3 c0603q310 = (C0603q3) (objM4505g9 == null ? null : objM4505g9);
                if (c0603q310 == null || (xm0Var7 = (xm0) c0603q310.f8713b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var7.mo6a()).booleanValue();
            case 524288:
                Object objM4505g10 = rk1Var.m4505g(kn2.f5679u);
                C0603q3 c0603q311 = (C0603q3) (objM4505g10 == null ? null : objM4505g10);
                if (c0603q311 == null || (xm0Var8 = (xm0) c0603q311.f8713b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var8.mo6a()).booleanValue();
            case 1048576:
                Object objM4505g11 = rk1Var.m4505g(kn2.f5680v);
                C0603q3 c0603q312 = (C0603q3) (objM4505g11 == null ? null : objM4505g11);
                if (c0603q312 == null || (xm0Var9 = (xm0) c0603q312.f8713b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var9.mo6a()).booleanValue();
            case 2097152:
                String string = bundle != null ? bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                Object objM4505g12 = rk1Var.m4505g(kn2.f5669k);
                C0603q3 c0603q313 = (C0603q3) (objM4505g12 == null ? null : objM4505g12);
                if (c0603q313 == null || (in0Var = (in0) c0603q313.f8713b) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((Boolean) in0Var.mo5j(new C0690sd(string))).booleanValue();
            case R.id.accessibilityActionShowOnScreen:
                qn2 qn2VarM4210l = qn2Var.m4210l();
                if (qn2VarM4210l != null) {
                    Object objM4505g13 = qn2VarM4210l.f9050d.f6221h.m4505g(kn2.f5662d);
                    if (objM4505g13 == null) {
                        objM4505g13 = null;
                    }
                    c0603q3 = (C0603q3) objM4505g13;
                    while (c0603q3 == null && qn2VarM4210l != null) {
                        qn2VarM4210l = qn2VarM4210l.m4210l();
                        if (qn2VarM4210l != null) {
                            Object objM4505g14 = qn2VarM4210l.f9050d.f6221h.m4505g(kn2.f5662d);
                            if (objM4505g14 == null) {
                                objM4505g14 = null;
                            }
                            c0603q3 = (C0603q3) objM4505g14;
                        }
                    }
                    if (qn2VarM4210l == null) {
                        o62 o62VarM4206g = qn2Var.m4206g();
                        return viewTreeObserverOnGlobalLayoutListenerC0045b7.requestRectangleOnScreen(new Rect((int) Math.floor(o62VarM4206g.f7536a), (int) Math.floor(o62VarM4206g.f7537b), gf1.m1869Q((float) Math.ceil(o62VarM4206g.f7538c)), gf1.m1869Q((float) Math.ceil(o62VarM4206g.f7539d))));
                    }
                    long j = 0;
                    long jM4611d = 0;
                    boolean z4 = false;
                    while (qn2VarM4210l != null) {
                        r61 r61Var2 = qn2VarM4210l.f9049c;
                        rk1 rk1Var2 = qn2VarM4210l.f9050d.f6221h;
                        Object objM4505g15 = rk1Var2.m4505g(kn2.f5662d);
                        if (objM4505g15 == null) {
                            objM4505g15 = null;
                        }
                        C0603q3 c0603q314 = (C0603q3) objM4505g15;
                        if (c0603q314 != null) {
                            o62 o62VarM4723v = s11.m4723v((qz0) r61Var2.f9372M.f12033d);
                            c61 c61VarMo650j = ((qz0) r61Var2.f9372M.f12033d).mo650j();
                            o62 o62VarM3521i = o62VarM4723v.m3521i(c61VarMo650j != null ? ((zn1) c61VarMo650j).mo646M(j) : j);
                            zn1 zn1VarM4203d = qn2Var.m4203d();
                            if (zn1VarM4203d == null) {
                                jMo646M = j;
                                long jM4612e = rs1.m4612e(jMo646M, jM4611d);
                                zn1 zn1VarM4203d2 = qn2Var.m4203d();
                                o62 o62VarM1467q = AbstractC0179eu.m1467q(jM4612e, s11.m4715q0(zn1VarM4203d2 == null ? zn1VarM4203d2.f10440j : 0L));
                                f = o62VarM1467q.f7536a - o62VarM3521i.f7536a;
                                f2 = o62VarM1467q.f7538c - o62VarM3521i.f7538c;
                                if (Math.signum(f) == Math.signum(f2)) {
                                    f = 0.0f;
                                } else if (Math.abs(f) >= Math.abs(f2)) {
                                    f = f2;
                                }
                                f3 = o62VarM1467q.f7537b - o62VarM3521i.f7537b;
                                f4 = o62VarM1467q.f7539d - o62VarM3521i.f7539d;
                                if (Math.signum(f3) == Math.signum(f4)) {
                                    f3 = 0.0f;
                                } else if (Math.abs(f3) >= Math.abs(f4)) {
                                    f3 = f4;
                                }
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                if (rs1.m4609b(jFloatToRawIntBits, 0L)) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                                    Object objM4505g16 = rk1Var2.m4505g(vn2.f12079v);
                                    if (objM4505g16 == null) {
                                        objM4505g16 = null;
                                    }
                                    if (r61Var.f9366G == d61Var) {
                                        fIntBitsToFloat2 = -fIntBitsToFloat2;
                                    }
                                    Object objM4505g17 = rk1Var2.m4505g(vn2.f12080w);
                                    if (objM4505g17 == null) {
                                        objM4505g17 = null;
                                    }
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
                                } else {
                                    jFloatToRawIntBits2 = jFloatToRawIntBits;
                                }
                                mn0 mn0Var = (mn0) c0603q314.f8713b;
                                z4 = (mn0Var == null && ((Boolean) mn0Var.mo12g(Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L))))).booleanValue()) || z4;
                                jM4611d = rs1.m4611d(jM4611d, jFloatToRawIntBits);
                            } else {
                                if (!zn1VarM4203d.mo2843S0().f10770u) {
                                    zn1VarM4203d = null;
                                }
                                if (zn1VarM4203d != null) {
                                    jMo646M = zn1VarM4203d.mo646M(j);
                                }
                                long jM4612e2 = rs1.m4612e(jMo646M, jM4611d);
                                zn1 zn1VarM4203d22 = qn2Var.m4203d();
                                o62 o62VarM1467q2 = AbstractC0179eu.m1467q(jM4612e2, s11.m4715q0(zn1VarM4203d22 == null ? zn1VarM4203d22.f10440j : 0L));
                                f = o62VarM1467q2.f7536a - o62VarM3521i.f7536a;
                                f2 = o62VarM1467q2.f7538c - o62VarM3521i.f7538c;
                                if (Math.signum(f) == Math.signum(f2)) {
                                }
                                f3 = o62VarM1467q2.f7537b - o62VarM3521i.f7537b;
                                f4 = o62VarM1467q2.f7539d - o62VarM3521i.f7539d;
                                if (Math.signum(f3) == Math.signum(f4)) {
                                }
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L);
                                if (rs1.m4609b(jFloatToRawIntBits, 0L)) {
                                }
                                mn0 mn0Var2 = (mn0) c0603q314.f8713b;
                                if (mn0Var2 == null) {
                                    jM4611d = rs1.m4611d(jM4611d, jFloatToRawIntBits);
                                } else {
                                    jM4611d = rs1.m4611d(jM4611d, jFloatToRawIntBits);
                                }
                            }
                        }
                        qn2VarM4210l = qn2VarM4210l.m4210l();
                        j = 0;
                    }
                    return z4;
                }
                c0603q3 = null;
                break;
            case R.id.accessibilityActionSetProgress:
                if (bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    return false;
                }
                Object objM4505g18 = rk1Var.m4505g(kn2.f5667i);
                C0603q3 c0603q315 = (C0603q3) (objM4505g18 == null ? null : objM4505g18);
                if (c0603q315 == null || (in0Var2 = (in0) c0603q315.f8713b) == null) {
                    return false;
                }
                return ((Boolean) in0Var2.mo5j(Float.valueOf(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case R.id.accessibilityActionImeEnter:
                Object objM4505g19 = rk1Var.m4505g(kn2.f5674p);
                C0603q3 c0603q316 = (C0603q3) (objM4505g19 == null ? null : objM4505g19);
                if (c0603q316 == null || (xm0Var10 = (xm0) c0603q316.f8713b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var10.mo6a()).booleanValue();
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
                                Object objM4505g20 = rk1Var.m4505g(kn2.f5683y);
                                C0603q3 c0603q317 = (C0603q3) (objM4505g20 == null ? null : objM4505g20);
                                if (c0603q317 == null || (xm0Var13 = (xm0) c0603q317.f8713b) == null) {
                                    return false;
                                }
                                return ((Boolean) xm0Var13.mo6a()).booleanValue();
                            case R.id.accessibilityActionPageDown:
                                Object objM4505g21 = rk1Var.m4505g(kn2.f5656A);
                                C0603q3 c0603q318 = (C0603q3) (objM4505g21 == null ? null : objM4505g21);
                                if (c0603q318 == null || (xm0Var14 = (xm0) c0603q318.f8713b) == null) {
                                    return false;
                                }
                                return ((Boolean) xm0Var14.mo6a()).booleanValue();
                            case R.id.accessibilityActionPageLeft:
                                Object objM4505g22 = rk1Var.m4505g(kn2.f5684z);
                                C0603q3 c0603q319 = (C0603q3) (objM4505g22 == null ? null : objM4505g22);
                                if (c0603q319 == null || (xm0Var15 = (xm0) c0603q319.f8713b) == null) {
                                    return false;
                                }
                                return ((Boolean) xm0Var15.mo6a()).booleanValue();
                            case R.id.accessibilityActionPageRight:
                                Object objM4505g23 = rk1Var.m4505g(kn2.f5657B);
                                C0603q3 c0603q320 = (C0603q3) (objM4505g23 == null ? null : objM4505g23);
                                if (c0603q320 == null || (xm0Var16 = (xm0) c0603q320.f8713b) == null) {
                                    return false;
                                }
                                return ((Boolean) xm0Var16.mo6a()).booleanValue();
                            default:
                                nt2 nt2Var = (nt2) viewOnAttachStateChangeListenerC0267h7.f3878y.m3406d(i);
                                if (nt2Var == null || ((CharSequence) nt2Var.m3406d(i2)) == null) {
                                    return false;
                                }
                                Object objM4505g24 = rk1Var.m4505g(kn2.f5682x);
                                List list = (List) (objM4505g24 == null ? null : objM4505g24);
                                if (list == null || list.size() <= 0) {
                                    return false;
                                }
                                list.get(0).getClass();
                                c80.m664g();
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
            Object objM4505g25 = rk1Var.m4505g(vn2.f12060c);
            if (objM4505g25 == null) {
                objM4505g25 = null;
            }
            s32 s32Var = (s32) objM4505g25;
            Object objM4505g26 = rk1Var.m4505g(kn2.f5667i);
            if (objM4505g26 == null) {
                objM4505g26 = null;
            }
            C0603q3 c0603q321 = (C0603q3) objM4505g26;
            if (s32Var != null) {
                C0748tt c0748tt = s32Var.f9899b;
                if (c0603q321 != null) {
                    float f6 = c0748tt.f10957a;
                    float f7 = ((f6 < 0.0f ? 0.0f : f6) - (0.0f > f6 ? f6 : 0.0f)) / 20.0f;
                    if (z6) {
                        f7 = -f7;
                    }
                    in0 in0Var4 = (in0) c0603q321.f8713b;
                    if (in0Var4 != null) {
                        return ((Boolean) in0Var4.mo5j(Float.valueOf(s32Var.f9898a + f7))).booleanValue();
                    }
                    return false;
                }
            }
        }
        long jM3515c = s11.m4723v((qz0) r61Var.f9372M.f12033d).m3515c();
        ArrayList arrayList = new ArrayList();
        Object objM4505g27 = rk1Var.m4505g(kn2.f5658C);
        if (objM4505g27 == null) {
            objM4505g27 = null;
        }
        C0603q3 c0603q322 = (C0603q3) objM4505g27;
        Float f8 = (c0603q322 == null || (in0Var3 = (in0) c0603q322.f8713b) == null || !((Boolean) in0Var3.mo5j(arrayList)).booleanValue()) ? null : (Float) arrayList.get(0);
        Object objM4505g28 = rk1Var.m4505g(kn2.f5662d);
        if (objM4505g28 == null) {
            objM4505g28 = null;
        }
        C0603q3 c0603q323 = (C0603q3) objM4505g28;
        if (c0603q323 == null) {
            return false;
        }
        un0 un0Var = c0603q323.f8713b;
        Object objM4505g29 = rk1Var.m4505g(vn2.f12079v);
        if (objM4505g29 == null) {
            objM4505g29 = null;
        }
        el2 el2Var = (el2) objM4505g29;
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
                fIntBitsToFloat = Float.intBitsToFloat((int) (jM3515c >> 32));
            }
            if (z7 || z6) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if ((r61Var.f9366G == d61Var) && (z7 || z8)) {
                fIntBitsToFloat = -fIntBitsToFloat;
            }
            if (ViewOnAttachStateChangeListenerC0267h7.m2086q(el2Var, fIntBitsToFloat)) {
                yn2 yn2Var = kn2.f5684z;
                if (!rk1Var.m4501c(yn2Var) && !rk1Var.m4501c(kn2.f5657B)) {
                    mn0 mn0Var3 = (mn0) un0Var;
                    if (mn0Var3 != null) {
                        return ((Boolean) mn0Var3.mo12g(Float.valueOf(fIntBitsToFloat), fValueOf)).booleanValue();
                    }
                    return false;
                }
                if (fIntBitsToFloat > 0.0f) {
                    Object objM4505g30 = rk1Var.m4505g(kn2.f5657B);
                    c0603q33 = (C0603q3) (objM4505g30 == null ? null : objM4505g30);
                } else {
                    Object objM4505g31 = rk1Var.m4505g(yn2Var);
                    c0603q33 = (C0603q3) (objM4505g31 == null ? null : objM4505g31);
                }
                if (c0603q33 == null || (xm0Var12 = (xm0) c0603q33.f8713b) == null) {
                    return false;
                }
                return ((Boolean) xm0Var12.mo6a()).booleanValue();
            }
        }
        Object objM4505g32 = rk1Var.m4505g(vn2.f12080w);
        if (objM4505g32 == null) {
            objM4505g32 = null;
        }
        el2 el2Var2 = (el2) objM4505g32;
        if (el2Var2 == null || !z) {
            return false;
        }
        float fFloatValue = f5 != null ? f5.floatValue() : Float.intBitsToFloat((int) (jM3515c & 4294967295L));
        if (z9 || z6) {
            fFloatValue = -fFloatValue;
        }
        if (!ViewOnAttachStateChangeListenerC0267h7.m2086q(el2Var2, fFloatValue)) {
            return false;
        }
        yn2 yn2Var2 = kn2.f5683y;
        if (!rk1Var.m4501c(yn2Var2) && !rk1Var.m4501c(kn2.f5656A)) {
            mn0 mn0Var4 = (mn0) un0Var;
            if (mn0Var4 != null) {
                return ((Boolean) mn0Var4.mo12g(fValueOf, Float.valueOf(fFloatValue))).booleanValue();
            }
            return false;
        }
        if (fFloatValue > 0.0f) {
            Object objM4505g33 = rk1Var.m4505g(kn2.f5656A);
            c0603q32 = (C0603q3) (objM4505g33 == null ? null : objM4505g33);
        } else {
            Object objM4505g34 = rk1Var.m4505g(yn2Var2);
            c0603q32 = (C0603q3) (objM4505g34 == null ? null : objM4505g34);
        }
        if (c0603q32 == null || (xm0Var11 = (xm0) c0603q32.f8713b) == null) {
            return false;
        }
        return ((Boolean) xm0Var11.mo6a()).booleanValue();
    }
}
