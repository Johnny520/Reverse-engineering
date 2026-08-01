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
import androidx.activity.result.C0992;
import com.github.megatronking.stringfog.Base64;
import de.robv.android.xposed.XC_MethodHook;
import io.fastkv.C1053;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class w50 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final int f5061a;

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ w50(int r4) {
        /*
            r3 = this;
            r3.f5061a = r4
            r3.<init>()
            r0 = 0
            java.lang.String r1 = "ۣۢۢ"
            int r1 = p000.C1058.m3140(r1)
        Lc:
            switch(r1) {
                case 56445: goto L10;
                case 1747842: goto L2e;
                case 1749697: goto L36;
                case 1750630: goto L76;
                case 1751492: goto L88;
                case 1755494: goto L60;
                default: goto Lf;
            }
        Lf:
            goto Lc
        L10:
            java.lang.String r0 = "dAiP5qzc4"
            java.lang.String r0 = com.google.android.material.internal.C1038.m3065(r0)
            java.lang.Long r0 = java.lang.Long.decode(r0)
            int r1 = p000.C1057.f5704
            int r2 = android.support.v4.graphics.drawable.C0987.f5634
            int r2 = r2 + (-7696)
            r1 = r1 ^ r2
            if (r1 < 0) goto L59
            r1 = 33
            com.ljx.wechatmod.p001ui.C1050.f5697 = r1
            java.lang.String r1 = "ۤ۟۟"
        L29:
            int r1 = com.google.android.material.appbar.C1020.m2993(r1)
            goto Lc
        L2e:
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            java.lang.String r1 = "ۤ۟۟"
            goto L29
        L36:
            int r1 = p000.C1057.m3136()
            if (r1 < 0) goto L76
            int r1 = com.google.android.material.bottomappbar.C1023.f5670
            int r2 = kotlinx.coroutines.C1056.f5703
            int r2 = r2 * (-2054)
            r1 = r1 | r2
            if (r1 < 0) goto L4f
            com.google.android.material.carousel.C1030.m3031()
            java.lang.String r1 = "ۨۤۢ"
            int r1 = com.google.android.material.timepicker.C1044.m3085(r1)
            goto Lc
        L4f:
            int r1 = androidx.core.graphics.drawable.C1009.f5656
            int r2 = androidx.coordinatorlayout.widget.C1004.f5651
            int r1 = r1 - r2
            r2 = 56675(0xdd63, float:7.9419E-41)
            int r1 = r1 + r2
            goto Lc
        L59:
            java.lang.String r1 = "۠ۥۧ"
        L5b:
            int r1 = com.google.android.material.snackbar.C1040.m3072(r1)
            goto Lc
        L60:
            int r1 = com.google.android.material.behavior.C1022.f5669
            if (r1 < 0) goto L6f
            r1 = 86
            android.support.v4.graphics.drawable.C0987.f5634 = r1
            java.lang.String r1 = "ۣۨۢ"
        L6a:
            int r1 = com.ljx.wechatmod.auth.C1047.m3096(r1)
            goto Lc
        L6f:
            java.lang.String r1 = "ۣۢۢ"
            int r1 = com.google.android.material.datepicker.C1034.m3046(r1)
            goto Lc
        L76:
            int r1 = android.window.C0989.f5636
            int r2 = com.ljx.wechatmod.hook.C1048.f5695
            int r2 = r2 / (-3667)
            r1 = r1 ^ r2
            if (r1 > 0) goto L85
            androidx.core.graphics.drawable.C1009.m2948()
            java.lang.String r1 = "۠ۥۤ"
            goto L5b
        L85:
            java.lang.String r1 = "ۤ۟۟"
            goto L6a
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w50.<init>(int):void");
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Integer numM1472O;
        int iIntValue;
        int i;
        int iM1691b;
        View decorView;
        String lowerCase;
        o40 o40Var;
        WindowManager.LayoutParams attributes;
        View contentView;
        String lowerCase2;
        o40 o40Var2;
        switch (this.f5061a) {
            case Base64.NO_PADDING /* 1 */:
                r80 r80Var = C0893xh.f5256l;
                AbstractC0493mp.m1857g(b50.m492a("3A==\n", "rGmy28j+QYQ=\n"), methodHookParam);
                Object obj = methodHookParam.thisObject;
                AbstractC0493mp.m1855e(b50.m492a("fHx2Zr6gPD98Zm4q/KZ9MnN6birqrH0/fWc3ZOuvMXFmcGpvvqIzNWBmc26woi0hPEh5fve1NCVr\n", "EgkaCp7DXVE=\n"), obj);
                Activity activity = (Activity) obj;
                String name = activity.getClass().getName();
                View decorView2 = activity.getWindow().getDecorView();
                ViewGroup viewGroup = decorView2 instanceof ViewGroup ? (ViewGroup) decorView2 : null;
                if (viewGroup != null) {
                    new WeakReference(activity);
                    try {
                        C0417kn.f2847a.getClass();
                        b50.m492a("mejd3rtDEA==\n", "pZu4qpZ8Lro=\n");
                        C0417kn.f2851e = name;
                    } catch (Throwable th) {
                        g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", b50.m492a("77nn/cP7dp3VgO7x2A==\n", "uvCvkqyQKck=\n"), "tw==\n", "0vI8ySRxU5w=\n");
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C0770u6.f4638a.getClass();
                    if (((jCurrentTimeMillis - 1) - C0770u6.f4642e) + 1 > 3000000) {
                        C0770u6.f4642e = jCurrentTimeMillis;
                        C0417kn.f2847a.getClass();
                        g80.m1206u(C0417kn.f2855i, AbstractC0929yg.f5431b, new C0058b7(activity, null, 1), 2);
                    }
                    C0417kn c0417kn = C0417kn.f2847a;
                    if (g40.m1154q("tUlKKr5TQBuqc0Yc\n", "3iwzdd07JXo=\n", c0417kn) && (i50.m1475z(name, b50.m492a("ZtK1IrUwSG5/+g==\n", "KrPATNZYLRw=\n"), false) || i50.m1475z(name, b50.m492a("sicmzD67obWkBg==\n", "8U9HuErSz9I=\n"), false))) {
                        if (C0893xh.f5255k == null) {
                            Object systemService = activity.getApplicationContext().getSystemService(b50.m492a("lrDJ3v52\n", "5dWnrZEEP6g=\n"));
                            C0893xh.f5255k = systemService instanceof SensorManager ? (SensorManager) systemService : null;
                        }
                        SensorManager sensorManager = C0893xh.f5255k;
                        Sensor defaultSensor = sensorManager != null ? sensorManager.getDefaultSensor(1) : null;
                        if (defaultSensor != null) {
                            SensorManager sensorManager2 = C0893xh.f5255k;
                            if (sensorManager2 != null) {
                                sensorManager2.unregisterListener(r80Var);
                            }
                            SensorManager sensorManager3 = C0893xh.f5255k;
                            if (sensorManager3 != null) {
                                sensorManager3.registerListener(r80Var, defaultSensor, 2);
                            }
                        }
                    }
                    if (i50.m1475z(name, b50.m492a("Mw7CUHKp+Y4qJg==\n", "f2+3PhHBnPw=\n"), false)) {
                        if (C0417kn.m1694e(b50.m492a("DVNCmslu8W4SX1Wi8HH7exJfVaLc\n", "ZjY7xa8Cng8=\n"))) {
                            g40.m1152o("bdYc\n", "Gbd7MCENE9g=\n", b50.m492a("85B8UnZb\n", "oPUIEAI14nA=\n"), "MI5Od4o=\n", "UuIhFOEuZWs=\n");
                            try {
                                C0893xh.m2684d(viewGroup, activity, b50.m492a("z0wuCpMGQo3cQCUGvypFjcY=\n", "qClLYcx1J/k=\n"), b50.m492a("KWnBCanK\n", "y/NY5hFF2d4=\n"), 300, new p80(activity, 0));
                            } catch (Throwable th2) {
                                b50.m492a("06ke\n", "p8h5VTpLcuY=\n");
                                b50.m492a("tw==\n", "0vI8ySRxU5w=\n");
                            }
                        } else {
                            View viewFindViewWithTag = viewGroup.findViewWithTag(b50.m492a("PwojNQwl+44sBig5IAn8jjY=\n", "WG9GXlNWnvo=\n"));
                            if (viewFindViewWithTag != null) {
                                viewFindViewWithTag.setVisibility(8);
                            }
                        }
                    }
                    if (i50.m1475z(name, b50.m492a("qg619CA9C3uzJg==\n", "5m/AmkNVbgk=\n"), false) || i50.m1475z(name, b50.m492a("7iHnZxVZKk/4AA==\n", "rUmGE2EwRCg=\n"), false)) {
                        String strM492a = b50.m492a("V4OxlQPXtcdIuaWlBNo=\n", "PObIymC/0KY=\n");
                        AbstractC0493mp.m1857g(b50.m492a("5u6W\n", "jYvvLSYfAis=\n"), strM492a);
                        try {
                            c0417kn.getClass();
                            iIntValue = C0417kn.m1691b(strM492a, 0);
                        } catch (Throwable th3) {
                            try {
                                C0417kn.f2847a.getClass();
                                numM1472O = i50.m1472O(C0417kn.m1693d(strM492a, String.valueOf(0)));
                            } catch (Throwable th4) {
                            }
                            iIntValue = numM1472O != null ? numM1472O.intValue() : 0;
                        }
                        if (C0417kn.m1694e(b50.m492a("CNt450SotSIX4XTR\n", "Y74BuCfA0EM=\n")) && iIntValue == 0) {
                            C0417kn.m1699j(b50.m492a("Zea3smCqFhA=\n", "Jo7S0xToYn4=\n"), new C0610pv(viewGroup, 2, activity));
                        } else {
                            View viewFindViewWithTag2 = viewGroup.findViewWithTag(b50.m492a("z+g2eXv4AI/J+QxwUPU=\n", "qI1TEiSbaOo=\n"));
                            if (viewFindViewWithTag2 != null) {
                                viewFindViewWithTag2.setVisibility(8);
                            }
                        }
                    }
                    if (i50.m1475z(name, b50.m492a("zEUiiL3jpU/aZA==\n", "jy1D/MmKyyg=\n"), false)) {
                        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0732t5(activity, 10, viewGroup), 800L);
                    }
                }
                if (C1053.m3123() >= 0) {
                    System.out.println(Integer.valueOf(C0992.m2880("hb5luw3UoWo")));
                }
                break;
            case Base64.NO_WRAP /* 2 */:
                AbstractC0493mp.m1857g(b50.m492a("R3DxK7Y=\n", "NxGDSttZrAo=\n"), methodHookParam);
                Object obj2 = methodHookParam.thisObject;
                Dialog dialog = obj2 instanceof Dialog ? (Dialog) obj2 : null;
                if (dialog != null) {
                    Window window = dialog.getWindow();
                    if (window == null || (attributes = window.getAttributes()) == null) {
                        i = 0;
                    } else {
                        int i2 = attributes.flags;
                        i = i2 & (i2 ^ (-9));
                    }
                    if (!(i != 0)) {
                        Window window2 = dialog.getWindow();
                        if (window2 != null && (decorView = window2.getDecorView()) != null) {
                            String name2 = decorView.getClass().getName();
                            b50.m492a("M+0yPuZdSNl6pmhZ\n", "VIhGcIcwLfE=\n");
                            Locale locale = Locale.ROOT;
                            String lowerCase3 = name2.toLowerCase(locale);
                            AbstractC0493mp.m1856f(b50.m492a("drs3dtFSG79jpx4xiBlH1Q==\n", "AtR7GaY3afw=\n"), lowerCase3);
                            if (decorView.getId() != -1) {
                                String resourceEntryName = decorView.getContext().getResources().getResourceEntryName(decorView.getId());
                                AbstractC0493mp.m1856f(b50.m492a("FT4PpUcpPKIAOB6yTC4hrjw6FpIKdH35Ww==\n", "clt79yJaU9c=\n"), resourceEntryName);
                                lowerCase = resourceEntryName.toLowerCase(locale);
                                AbstractC0493mp.m1856f(b50.m492a("StxFQVehRJ9fwGwGDuoY9Q==\n", "PrMJLiDENtw=\n"), lowerCase);
                            } else {
                                lowerCase = "";
                            }
                            if (!i50.m1475z(lowerCase3, b50.m492a("aysIagc=\n", "HURhCWLzPgA=\n"), false) && !i50.m1475z(lowerCase3, b50.m492a("TziN\n", "IlHurrAY6y0=\n"), false) && !i50.m1475z(lowerCase3, b50.m492a("cRv8ryIX\n", "A36fwFBz6PQ=\n"), false) && !i50.m1475z(lowerCase, b50.m492a("n30B81E=\n", "6RJokDRMs0s=\n"), false) && !i50.m1475z(lowerCase, b50.m492a("U5kB\n", "PvBiN1Powe0=\n"), false) && !i50.m1475z(lowerCase, b50.m492a("iC09Fqbe\n", "+kheedS6tlY=\n"), false) && !i50.m1475z(lowerCase, b50.m492a("B7z0\n", "dd+QsRjJLKA=\n"), false)) {
                                decorView.animate().cancel();
                                Object tag = decorView.getTag(2114453521);
                                o40 o40Var3 = tag instanceof o40 ? (o40) tag : null;
                                if (o40Var3 != null) {
                                    o40Var3.m1986c();
                                }
                                Object tag2 = decorView.getTag(2114453522);
                                o40 o40Var4 = tag2 instanceof o40 ? (o40) tag2 : null;
                                if (o40Var4 != null) {
                                    o40Var4.m1986c();
                                }
                                decorView.setScaleX(0.8f);
                                decorView.setScaleY(0.8f);
                                decorView.setAlpha(0.0f);
                                decorView.setLayerType(2, null);
                                decorView.animate().alpha(1.0f).setDuration(250L).withEndAction(new RunnableC0422ks(decorView, 3)).start();
                                Object tag3 = decorView.getTag(2114453521);
                                o40 o40Var5 = tag3 instanceof o40 ? (o40) tag3 : null;
                                if (o40Var5 == null) {
                                    o40 o40Var6 = new o40(decorView, o40.f3384o);
                                    decorView.setTag(2114453521, o40Var6);
                                    o40Var = o40Var6;
                                } else {
                                    o40Var = o40Var5;
                                }
                                Object tag4 = decorView.getTag(2114453522);
                                o40 o40Var7 = tag4 instanceof o40 ? (o40) tag4 : null;
                                if (o40Var7 == null) {
                                    o40Var7 = new o40(decorView, o40.f3385p);
                                    decorView.setTag(2114453522, o40Var7);
                                }
                                o40Var.f3400k = g40.m1143f(1.0f, 200.0f, 0.65f);
                                o40Var7.f3400k = g40.m1143f(1.0f, 200.0f, 0.65f);
                                o40Var.m1991h();
                                o40Var7.m1991h();
                            }
                        }
                        if (g40.m1154q("aDQvRdg0x9RzDjR23Snozm0=\n", "A1FWGqhbt6E=\n", C0417kn.f2847a) && Build.VERSION.SDK_INT >= 31) {
                            try {
                                Window window3 = dialog.getWindow();
                                if (window3 != null && (iM1691b = C0417kn.m1691b(b50.m492a("V7bsna1RcV5MjPeuqExeQlKn8KyuV3VS\n", "PNOVwt0+ASs=\n"), 100)) > 0) {
                                    window3.addFlags(Integer.MIN_VALUE);
                                    window3.setStatusBarColor(0);
                                    window3.setNavigationBarColor(0);
                                    window3.clearFlags(2);
                                    window3.addFlags(4);
                                    WindowManager.LayoutParams attributes2 = window3.getAttributes();
                                    int i3 = (int) ((iM1691b / 100.0f) * 150);
                                    if (i3 < 1) {
                                        i3 = 1;
                                    }
                                    attributes2.setBlurBehindRadius(i3);
                                    attributes2.dimAmount = 0.0f;
                                    window3.setAttributes(attributes2);
                                    break;
                                }
                            } catch (Throwable th5) {
                                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", b50.m492a("fd8Rxy5H+VhE3gTtHG7iTWnZAN4xZQ==\n", "LbBhsl4Clz8=\n"), "tw==\n", "0vI8ySRxU5w=\n");
                                return;
                            }
                        }
                    }
                }
                break;
            case 3:
                AbstractC0493mp.m1857g(b50.m492a("6wJgugw=\n", "m2MS22GaeKc=\n"), methodHookParam);
                Object obj3 = methodHookParam.thisObject;
                PopupWindow popupWindow = obj3 instanceof PopupWindow ? (PopupWindow) obj3 : null;
                if (popupWindow != null && (contentView = popupWindow.getContentView()) != null) {
                    if (popupWindow.isFocusable() || popupWindow.isOutsideTouchable()) {
                        String name3 = contentView.getClass().getName();
                        b50.m492a("f79gByURdaA29Dpg\n", "GNoUSUR8EIg=\n");
                        Locale locale2 = Locale.ROOT;
                        String lowerCase4 = name3.toLowerCase(locale2);
                        AbstractC0493mp.m1856f(b50.m492a("PSl6ojdwrcIoNVPlbjvxqA==\n", "SUY2zUAV34E=\n"), lowerCase4);
                        if (contentView.getId() != -1) {
                            String resourceEntryName2 = contentView.getContext().getResources().getResourceEntryName(contentView.getId());
                            AbstractC0493mp.m1856f(b50.m492a("4CAJBaVBeZr1JhgSrkZklskkEDLoHDjBrg==\n", "h0V9V8AyFu8=\n"), resourceEntryName2);
                            lowerCase2 = resourceEntryName2.toLowerCase(locale2);
                            AbstractC0493mp.m1856f(b50.m492a("hE46sa2ygDORUhP29PncWQ==\n", "8CF23trX8nA=\n"), lowerCase2);
                        } else {
                            lowerCase2 = "";
                        }
                        if (!i50.m1475z(lowerCase4, b50.m492a("4HIIrbA=\n", "lh1hztUI6xM=\n"), false) && !i50.m1475z(lowerCase4, b50.m492a("YMKL\n", "DavoTbO0TrU=\n"), false) && !i50.m1475z(lowerCase4, b50.m492a("jSGadZUq\n", "/0T5GudOulA=\n"), false) && !i50.m1475z(lowerCase2, b50.m492a("GQAo26c=\n", "b29BuMK1EzQ=\n"), false) && !i50.m1475z(lowerCase2, b50.m492a("q5no\n", "xvCLegM04B0=\n"), false) && !i50.m1475z(lowerCase2, b50.m492a("bGdHXHKP\n", "HgIkMwDrUmU=\n"), false) && !i50.m1475z(lowerCase2, b50.m492a("xUWp\n", "tybNWchCbBc=\n"), false)) {
                            contentView.animate().cancel();
                            Object tag5 = contentView.getTag(2114453521);
                            o40 o40Var8 = tag5 instanceof o40 ? (o40) tag5 : null;
                            if (o40Var8 != null) {
                                o40Var8.m1986c();
                            }
                            Object tag6 = contentView.getTag(2114453522);
                            o40 o40Var9 = tag6 instanceof o40 ? (o40) tag6 : null;
                            if (o40Var9 != null) {
                                o40Var9.m1986c();
                            }
                            contentView.setPivotX(contentView.getWidth() * 0.9f);
                            contentView.setPivotY(0.0f);
                            contentView.setScaleX(0.6f);
                            contentView.setScaleY(0.6f);
                            contentView.setAlpha(0.0f);
                            contentView.setLayerType(2, null);
                            contentView.animate().alpha(1.0f).setDuration(250L).withEndAction(new RunnableC0422ks(contentView, 4)).start();
                            Object tag7 = contentView.getTag(2114453521);
                            o40 o40Var10 = tag7 instanceof o40 ? (o40) tag7 : null;
                            if (o40Var10 == null) {
                                o40 o40Var11 = new o40(contentView, o40.f3384o);
                                contentView.setTag(2114453521, o40Var11);
                                o40Var2 = o40Var11;
                            } else {
                                o40Var2 = o40Var10;
                            }
                            Object tag8 = contentView.getTag(2114453522);
                            o40 o40Var12 = tag8 instanceof o40 ? (o40) tag8 : null;
                            if (o40Var12 == null) {
                                o40Var12 = new o40(contentView, o40.f3385p);
                                contentView.setTag(2114453522, o40Var12);
                            }
                            o40Var2.f3400k = g40.m1143f(1.0f, 200.0f, 0.65f);
                            o40Var12.f3400k = g40.m1143f(1.0f, 200.0f, 0.65f);
                            o40Var2.m1991h();
                            o40Var12.m1991h();
                            contentView.post(new RunnableC0422ks(contentView, 5));
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:191:0x0600. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0038. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0466 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0462 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x035a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x034f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:386:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x04a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x061c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0611 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r39) {
        /*
            Method dump skipped, instruction units count: 2154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w50.beforeHookedMethod(de.robv.android.xposed.XC_MethodHook$MethodHookParam):void");
    }
}
