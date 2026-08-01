package p000;

import android.app.Activity;
import android.app.Dialog;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.activity.result.C0994;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.datepicker.C1044;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class p50 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final int f3669a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ p50(int r4) {
        /*
            r3 = this;
            r3.f3669a = r4
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۨۡۡ"
            int r1 = androidx.profileinstaller.C1016.m2966(r1)
        Lc:
            switch(r1) {
                case 56351: goto L10;
                case 56448: goto L73;
                case 1748710: goto L89;
                case 1748734: goto L4e;
                case 1751618: goto L44;
                case 1755400: goto L29;
                default: goto Lf;
            }
        Lf:
            goto Lc
        L10:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            int r1 = android.app.C0989.f5633
            int r2 = com.google.android.material.theme.C1048.f5692
            r2 = r2 | 7607(0x1db7, float:1.066E-41)
            int r1 = r1 - r2
            if (r1 > 0) goto L69
            r1 = 91
            p000.C1059.f5703 = r1
        L22:
            java.lang.String r1 = "ۡ۠"
            int r1 = androidx.activity.result.C0995.m2884(r1)
            goto Lc
        L29:
            int r1 = androidx.versionedparcelable.C1028.m3015()
            if (r1 > 0) goto L73
            int r1 = androidx.constraintlayout.widget.C1006.f5650
            if (r1 < 0) goto L3d
            com.google.android.material.behavior.C1036.m3047()
            java.lang.String r1 = "ۤۤ"
            int r1 = androidx.savedstate.C1020.m2984(r1)
            goto Lc
        L3d:
            java.lang.String r1 = "ۣۡ۠"
        L3f:
            int r1 = androidx.lifecycle.C1015.m2962(r1)
            goto Lc
        L44:
            int r1 = com.google.android.material.floatingactionbutton.C1046.f5690
            int r2 = androidx.activity.C0997.f5641
            r1 = r1 | r2
            r2 = 1755466(0x1ac94a, float:2.459932E-39)
            int r1 = r1 + r2
            goto Lc
        L4e:
            java.lang.String r0 = "QAz"
            java.lang.String r0 = com.google.android.material.behavior.C1036.m3046(r0)
            java.lang.Double r0 = java.lang.Double.decode(r0)
            int r1 = androidx.startup.C1023.m2996()
            if (r1 > 0) goto L22
            r1 = 56
            android.app.C0989.f5633 = r1
            java.lang.String r1 = "ۣۤۡ"
            int r1 = androidx.appcompat.widget.C0999.m2899(r1)
            goto Lc
        L69:
            int r1 = androidx.versionedparcelable.C1028.f5672
            int r2 = androidx.constraintlayout.widget.C1006.f5650
            int r1 = r1 % r2
            r2 = 1748787(0x1aaf33, float:2.450573E-39)
            int r1 = r1 + r2
            goto Lc
        L73:
            int r1 = androidx.appcompat.widget.C1001.f5645
            int r2 = com.github.megatronking.stringfog.xor.C1032.f5676
            int r2 = r2 + 5363
            int r1 = r1 - r2
            if (r1 < 0) goto L7f
            java.lang.String r1 = "ۢۥۥ"
            goto L3f
        L7f:
            int r1 = p000.C1059.f5703
            int r2 = androidx.versionedparcelable.C1027.f5671
            r1 = r1 | r2
            r2 = 1748777(0x1aaf29, float:2.450559E-39)
            r1 = r1 ^ r2
            goto Lc
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p50.<init>(int):void");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v136, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v152, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v203, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Throwable] */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Method method;
        Integer numM532R;
        int iIntValue;
        int i;
        int iM1282b;
        View decorView;
        String lowerCase;
        h40 h40Var;
        WindowManager.LayoutParams attributes;
        View contentView;
        String lowerCase2;
        h40 h40Var2;
        switch (this.f3669a) {
            case Base64.NO_PADDING /* 1 */:
                AbstractC0346ip.m1503o("p", methodHookParam);
                if (z30.m2772q("gAY704Bws0u0Dy3vjGu5T4U=\n", "62NCjO0f0CA=\n", C0267gn.f2144a)) {
                    Object result = methodHookParam.getResult();
                    List list = result instanceof List ? (List) result : null;
                    if (list != null) {
                        Iterator it = list.iterator();
                        AbstractC0346ip.m1502n("iterator(...)", it);
                        while (it.hasNext()) {
                            Object next = it.next();
                            if (next != null) {
                                try {
                                    Method[] methods = next.getClass().getMethods();
                                    AbstractC0346ip.m1502n("getMethods(...)", methods);
                                    int length = methods.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                            method = methods[i2];
                                            if (!AbstractC0346ip.m1497i(method.getName(), "setRegistered")) {
                                                i2 = 1 - (0 - i2);
                                            }
                                        } else {
                                            method = null;
                                        }
                                    }
                                    if (method != null) {
                                        method.invoke(next, Boolean.FALSE);
                                    }
                                } catch (Throwable th) {
                                }
                            }
                        }
                    }
                }
                break;
            case Base64.NO_WRAP /* 2 */:
                AbstractC0346ip.m1503o("p", methodHookParam);
                C0267gn c0267gn = C0267gn.f2144a;
                if (z30.m2772q("Ud1p1g7N3ABl1H/qAtbWBFQ=\n", "OrgQiWOiv2s=\n", c0267gn)) {
                    if (AbstractC0346ip.m1497i(methodHookParam.method.getName(), "getLatitude")) {
                        String strM2419a = "key_mock_lat";
                        String strM2419a2 = "39.9042";
                        AbstractC0346ip.m1503o(z30.m2766k("3f5Z\n", "tpsgeLwwj7M=\n", strM2419a, "lNdk\n", "8LICxVL6724=\n"), strM2419a2);
                        try {
                            c0267gn.getClass();
                            strM2419a2 = C0267gn.m1284d(strM2419a, strM2419a2);
                            break;
                        } catch (Throwable th2) {
                            try {
                                C0267gn c0267gn2 = C0267gn.f2144a;
                                Integer numM532R2 = b50.m532R(strM2419a2);
                                int iIntValue2 = numM532R2 != null ? numM532R2.intValue() : 0;
                                c0267gn2.getClass();
                                strM2419a2 = String.valueOf(C0267gn.m1282b(strM2419a, iIntValue2));
                                break;
                            } catch (Throwable th3) {
                            }
                        }
                        Double dM17A = a50.m17A(strM2419a2);
                        if (dM17A == null) {
                            dM17A = Double.valueOf(39.9042d);
                        }
                        methodHookParam.setResult(dM17A);
                    }
                    if (AbstractC0346ip.m1497i(methodHookParam.method.getName(), "getLongitude")) {
                        String strM2419a3 = "key_mock_lng";
                        String strM2419a4 = "116.4074";
                        AbstractC0346ip.m1503o(z30.m2766k("3f5Z\n", "tpsgeLwwj7M=\n", strM2419a3, "lNdk\n", "8LICxVL6724=\n"), strM2419a4);
                        try {
                            C0267gn.f2144a.getClass();
                            strM2419a4 = C0267gn.m1284d(strM2419a3, strM2419a4);
                            break;
                        } catch (Throwable th4) {
                            try {
                                C0267gn c0267gn3 = C0267gn.f2144a;
                                Integer numM532R3 = b50.m532R(strM2419a4);
                                int iIntValue3 = numM532R3 != null ? numM532R3.intValue() : 0;
                                c0267gn3.getClass();
                                strM2419a4 = String.valueOf(C0267gn.m1282b(strM2419a3, iIntValue3));
                                break;
                            } catch (Throwable th5) {
                            }
                        }
                        Double dM17A2 = a50.m17A(strM2419a4);
                        if (dM17A2 == null) {
                            dM17A2 = Double.valueOf(116.4074d);
                        }
                        methodHookParam.setResult(dM17A2);
                    }
                }
                break;
            case 3:
            case 5:
            default:
                super.afterHookedMethod(methodHookParam);
                if (C0994.m2879() <= 0) {
                    System.out.println(Integer.parseInt(C1044.m3080("3g")));
                }
                break;
            case 4:
                AbstractC0346ip.m1503o("p", methodHookParam);
                C0267gn c0267gn4 = C0267gn.f2144a;
                if (z30.m2772q("eAQEuzJK3TNMDRKHPlHXN30=\n", "E2F95F8lvlg=\n", c0267gn4)) {
                    Object[] objArr = methodHookParam.args;
                    AbstractC0346ip.m1502n("args", objArr);
                    Object obj = objArr.length == 0 ? null : objArr[0];
                    String str = obj instanceof String ? (String) obj : null;
                    if (str != null && str.length() <= 15) {
                        if (str.equalsIgnoreCase("latitude") || str.equalsIgnoreCase("lat") || str.equalsIgnoreCase("pointy")) {
                            String strM2419a5 = "key_mock_lat";
                            String strM2419a6 = "39.9042";
                            AbstractC0346ip.m1503o(z30.m2766k("3f5Z\n", "tpsgeLwwj7M=\n", strM2419a5, "lNdk\n", "8LICxVL6724=\n"), strM2419a6);
                            try {
                                c0267gn4.getClass();
                                strM2419a6 = C0267gn.m1284d(strM2419a5, strM2419a6);
                                break;
                            } catch (Throwable th6) {
                                try {
                                    C0267gn c0267gn5 = C0267gn.f2144a;
                                    Integer numM532R4 = b50.m532R(strM2419a6);
                                    int iIntValue4 = numM532R4 != null ? numM532R4.intValue() : 0;
                                    c0267gn5.getClass();
                                    strM2419a6 = String.valueOf(C0267gn.m1282b(strM2419a5, iIntValue4));
                                    break;
                                } catch (Throwable th7) {
                                }
                            }
                            Double dM17A3 = a50.m17A(strM2419a6);
                            double dDoubleValue = dM17A3 != null ? dM17A3.doubleValue() : 39.9042d;
                            String name = methodHookParam.method.getName();
                            AbstractC0346ip.m1502n("getName(...)", name);
                            methodHookParam.setResult(b50.m516B(name, "String", false) ? String.valueOf(dDoubleValue) : Double.valueOf(dDoubleValue));
                        }
                        if (str.equalsIgnoreCase("longitude") || str.equalsIgnoreCase("lng") || str.equalsIgnoreCase("pointx")) {
                            String strM2419a7 = "key_mock_lng";
                            String strM2419a8 = "116.4074";
                            AbstractC0346ip.m1503o(z30.m2766k("3f5Z\n", "tpsgeLwwj7M=\n", strM2419a7, "lNdk\n", "8LICxVL6724=\n"), strM2419a8);
                            try {
                                C0267gn.f2144a.getClass();
                                strM2419a8 = C0267gn.m1284d(strM2419a7, strM2419a8);
                                break;
                            } catch (Throwable th8) {
                                try {
                                    C0267gn c0267gn6 = C0267gn.f2144a;
                                    Integer numM532R5 = b50.m532R(strM2419a8);
                                    int iIntValue5 = numM532R5 != null ? numM532R5.intValue() : 0;
                                    c0267gn6.getClass();
                                    strM2419a8 = String.valueOf(C0267gn.m1282b(strM2419a7, iIntValue5));
                                    break;
                                } catch (Throwable th9) {
                                }
                            }
                            Double dM17A4 = a50.m17A(strM2419a8);
                            double dDoubleValue2 = dM17A4 != null ? dM17A4.doubleValue() : 116.4074d;
                            String name2 = methodHookParam.method.getName();
                            AbstractC0346ip.m1502n("getName(...)", name2);
                            methodHookParam.setResult(b50.m516B(name2, "String", false) ? String.valueOf(dDoubleValue2) : Double.valueOf(dDoubleValue2));
                        }
                        break;
                    }
                }
                break;
            case 6:
                m80 m80Var = C0819vh.f4853l;
                AbstractC0346ip.m1503o("p", methodHookParam);
                Object obj2 = methodHookParam.thisObject;
                AbstractC0346ip.m1501m("null cannot be cast to non-null type android.app.Activity", obj2);
                Activity activity = (Activity) obj2;
                String name3 = activity.getClass().getName();
                View decorView2 = activity.getWindow().getDecorView();
                ViewGroup viewGroup = decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null;
                if (viewGroup != null) {
                    new WeakReference(activity);
                    try {
                        C0267gn.f2144a.getClass();
                        "<set-?>";
                        C0267gn.f2148e = name3;
                    } catch (Throwable th10) {
                        z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", "UIHook_TopAct", "Fg==\n", "c8HJlSTQVfc=\n");
                    }
                    C0267gn c0267gn7 = C0267gn.f2144a;
                    if (z30.m2772q("KiWE8kEHkYE1H4jE\n", "QUD9rSJv9OA=\n", c0267gn7) && (b50.m516B(name3, "LauncherUI", false) || b50.m516B(name3, "ChattingUI", false))) {
                        if (C0819vh.f4852k == null) {
                            Object systemService = activity.getApplicationContext().getSystemService("sensor");
                            C0819vh.f4852k = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                        }
                        SensorManager sensorManager = C0819vh.f4852k;
                        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
                        if (defaultSensor != null) {
                            SensorManager sensorManager2 = C0819vh.f4852k;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(m80Var);
                            }
                            SensorManager sensorManager3 = C0819vh.f4852k;
                            if (sensorManager3 != null) {
                                sensorManager3.registerListener(m80Var, defaultSensor, 2);
                            }
                        }
                    }
                    if (b50.m516B(name3, "LauncherUI", false)) {
                        if (C0267gn.m1285e("key_floating_settings")) {
                            z30.m2770o("ddas\n", "AbfL95mQedY=\n", "SetBtn", "ITa66yE=\n", "Q1rViEo8ya8=\n");
                            try {
                                C0819vh.m2510c(viewGroup, activity, "geek_settings_btn", "\u2699\ufe0f", 300, new k80(activity, 0));
                            } catch (Throwable th11) {
                                "tag";
                                "e";
                            }
                        } else {
                            View viewFindViewWithTag = viewGroup.findViewWithTag("geek_settings_btn");
                            if (viewFindViewWithTag != null) {
                                viewFindViewWithTag.setVisibility(8);
                            }
                        }
                    }
                    if (b50.m516B(name3, "LauncherUI", false) || b50.m516B(name3, "ChattingUI", false)) {
                        String strM2419a9 = "key_cheat_mode";
                        AbstractC0346ip.m1503o("key", strM2419a9);
                        try {
                            c0267gn7.getClass();
                            iIntValue = C0267gn.m1282b(strM2419a9, 0);
                        } catch (Throwable th12) {
                            try {
                                C0267gn.f2144a.getClass();
                                numM532R = b50.m532R(C0267gn.m1284d(strM2419a9, String.valueOf(0)));
                            } catch (Throwable th13) {
                            }
                            iIntValue = numM532R != null ? numM532R.intValue() : 0;
                        }
                        if (C0267gn.m1285e("key_cheat_ui") && iIntValue == 0) {
                            C0267gn.m1290j("CheatBtn", new C0312hv(viewGroup, 2, activity));
                        } else {
                            View viewFindViewWithTag2 = viewGroup.findViewWithTag("geek_cheat_btn");
                            if (viewFindViewWithTag2 != null) {
                                viewFindViewWithTag2.setVisibility(8);
                            }
                        }
                    }
                    if (b50.m516B(name3, "ChattingUI", false)) {
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0733t5(activity, 10, viewGroup), 800L);
                    }
                }
                break;
            case 7:
                AbstractC0346ip.m1503o("param", methodHookParam);
                Object obj3 = methodHookParam.thisObject;
                Dialog dialog = obj3 instanceof Dialog ? (Dialog) obj3 : null;
                if (dialog != null) {
                    Window window = dialog.getWindow();
                    if (window == null || (attributes = window.getAttributes()) == null) {
                        i = 0;
                    } else {
                        int i3 = attributes.flags;
                        i = i3 & (i3 ^ (-9));
                    }
                    if (!(i != 0)) {
                        Window window2 = dialog.getWindow();
                        if (window2 != null && (decorView = window2.getDecorView()) != null) {
                            String name4 = decorView.getClass().getName();
                            "getName(...)";
                            Locale locale = Locale.ROOT;
                            String lowerCase3 = name4.toLowerCase(locale);
                            AbstractC0346ip.m1502n("toLowerCase(...)", lowerCase3);
                            if (decorView.getId() != -1) {
                                String resourceEntryName = decorView.getContext().getResources().getResourceEntryName(decorView.getId());
                                AbstractC0346ip.m1502n("getResourceEntryName(...)", resourceEntryName);
                                lowerCase = resourceEntryName.toLowerCase(locale);
                                AbstractC0346ip.m1502n("toLowerCase(...)", lowerCase);
                            } else {
                                lowerCase = "";
                            }
                            if (!b50.m516B(lowerCase3, "voice", false) && !b50.m516B(lowerCase3, "mic", false) && !b50.m516B(lowerCase3, "record", false) && !b50.m516B(lowerCase, "voice", false) && !b50.m516B(lowerCase, "mic", false) && !b50.m516B(lowerCase, "record", false) && !b50.m516B(lowerCase, "rcd", false)) {
                                decorView.animate().cancel();
                                Object tag = decorView.getTag(2114453521);
                                h40 h40Var3 = tag instanceof h40 ? (h40) tag : null;
                                if (h40Var3 != null) {
                                    h40Var3.m1341c();
                                }
                                Object tag2 = decorView.getTag(2114453522);
                                h40 h40Var4 = tag2 instanceof h40 ? (h40) tag2 : null;
                                if (h40Var4 != null) {
                                    h40Var4.m1341c();
                                }
                                decorView.setScaleX(0.8f);
                                decorView.setScaleY(0.8f);
                                decorView.setAlpha(0.0f);
                                decorView.setLayerType(2, null);
                                decorView.animate().alpha(1.0f).setDuration(250L).withEndAction(new RunnableC0272gs(decorView, 3)).start();
                                Object tag3 = decorView.getTag(2114453521);
                                h40 h40Var5 = tag3 instanceof h40 ? (h40) tag3 : null;
                                if (h40Var5 == null) {
                                    h40 h40Var6 = new h40(decorView, h40.f2219n);
                                    decorView.setTag(2114453521, h40Var6);
                                    h40Var = h40Var6;
                                } else {
                                    h40Var = h40Var5;
                                }
                                Object tag4 = decorView.getTag(2114453522);
                                h40 h40Var7 = tag4 instanceof h40 ? (h40) tag4 : null;
                                if (h40Var7 == null) {
                                    h40Var7 = new h40(decorView, h40.f2220o);
                                    decorView.setTag(2114453522, h40Var7);
                                }
                                h40Var.f2234j = z30.m2761f(1.0f, 200.0f, 0.65f);
                                h40Var7.f2234j = z30.m2761f(1.0f, 200.0f, 0.65f);
                                h40Var.m1346h();
                                h40Var7.m1346h();
                            }
                        }
                        if (z30.m2772q("qdf/gwmw1xqy7eSwDK34AKw=\n", "wrKG3Hnfp28=\n", C0267gn.f2144a) && Build.VERSION.SDK_INT >= 31) {
                            try {
                                Window window3 = dialog.getWindow();
                                if (window3 != null && (iM1282b = C0267gn.m1282b("key_popup_blur_intensity", 100)) > 0) {
                                    window3.addFlags(Integer.MIN_VALUE);
                                    window3.setStatusBarColor(0);
                                    window3.setNavigationBarColor(0);
                                    window3.clearFlags(2);
                                    window3.addFlags(4);
                                    WindowManager.LayoutParams attributes2 = window3.getAttributes();
                                    int i4 = (int) ((iM1282b / 100.0f) * 150);
                                    if (i4 < 1) {
                                        i4 = 1;
                                    }
                                    attributes2.setBlurBehindRadius(i4);
                                    attributes2.dimAmount = 0.0f;
                                    window3.setAttributes(attributes2);
                                    break;
                                }
                            } catch (Throwable th14) {
                                z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", "PopupEngine_BlurDialog", "Fg==\n", "c8HJlSTQVfc=\n");
                                return;
                            }
                        }
                    }
                }
                break;
            case 8:
                AbstractC0346ip.m1503o("param", methodHookParam);
                Object obj4 = methodHookParam.thisObject;
                PopupWindow popupWindow = obj4 instanceof PopupWindow ? (PopupWindow) obj4 : null;
                if (popupWindow != null && (contentView = popupWindow.getContentView()) != null) {
                    if (popupWindow.isFocusable() || popupWindow.isOutsideTouchable()) {
                        String name5 = contentView.getClass().getName();
                        "getName(...)";
                        Locale locale2 = Locale.ROOT;
                        String lowerCase4 = name5.toLowerCase(locale2);
                        AbstractC0346ip.m1502n("toLowerCase(...)", lowerCase4);
                        if (contentView.getId() != -1) {
                            String resourceEntryName2 = contentView.getContext().getResources().getResourceEntryName(contentView.getId());
                            AbstractC0346ip.m1502n("getResourceEntryName(...)", resourceEntryName2);
                            lowerCase2 = resourceEntryName2.toLowerCase(locale2);
                            AbstractC0346ip.m1502n("toLowerCase(...)", lowerCase2);
                        } else {
                            lowerCase2 = "";
                        }
                        if (!b50.m516B(lowerCase4, "voice", false) && !b50.m516B(lowerCase4, "mic", false) && !b50.m516B(lowerCase4, "record", false) && !b50.m516B(lowerCase2, "voice", false) && !b50.m516B(lowerCase2, "mic", false) && !b50.m516B(lowerCase2, "record", false) && !b50.m516B(lowerCase2, "rcd", false)) {
                            contentView.animate().cancel();
                            Object tag5 = contentView.getTag(2114453521);
                            h40 h40Var8 = tag5 instanceof h40 ? (h40) tag5 : null;
                            if (h40Var8 != null) {
                                h40Var8.m1341c();
                            }
                            Object tag6 = contentView.getTag(2114453522);
                            h40 h40Var9 = tag6 instanceof h40 ? (h40) tag6 : null;
                            if (h40Var9 != null) {
                                h40Var9.m1341c();
                            }
                            contentView.setPivotX(contentView.getWidth() * 0.9f);
                            contentView.setPivotY(0.0f);
                            contentView.setScaleX(0.6f);
                            contentView.setScaleY(0.6f);
                            contentView.setAlpha(0.0f);
                            contentView.setLayerType(2, null);
                            contentView.animate().alpha(1.0f).setDuration(250L).withEndAction(new RunnableC0272gs(contentView, 4)).start();
                            Object tag7 = contentView.getTag(2114453521);
                            h40 h40Var10 = tag7 instanceof h40 ? (h40) tag7 : null;
                            if (h40Var10 == null) {
                                h40 h40Var11 = new h40(contentView, h40.f2219n);
                                contentView.setTag(2114453521, h40Var11);
                                h40Var2 = h40Var11;
                            } else {
                                h40Var2 = h40Var10;
                            }
                            Object tag8 = contentView.getTag(2114453522);
                            h40 h40Var12 = tag8 instanceof h40 ? (h40) tag8 : null;
                            if (h40Var12 == null) {
                                h40Var12 = new h40(contentView, h40.f2220o);
                                contentView.setTag(2114453522, h40Var12);
                            }
                            h40Var2.f2234j = z30.m2761f(1.0f, 200.0f, 0.65f);
                            h40Var12.f2234j = z30.m2761f(1.0f, 200.0f, 0.65f);
                            h40Var2.m1346h();
                            h40Var12.m1346h();
                            contentView.post(new RunnableC0272gs(contentView, 5));
                            break;
                        }
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:274:0x085f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x004a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0902 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x08f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:472:0x03bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:473:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x064d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0640 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x010b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x066d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0660 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:500:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0509 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x058a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0482 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0476 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x06ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:548:0x06ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x04e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x04d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0501 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:571:0x0712 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0706 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0755 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0748 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x089c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:589:0x088f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r51) {
        /*
            Method dump skipped, instruction units count: 3192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.p50.beforeHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }
}
