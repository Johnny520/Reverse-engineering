package Yue;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import com.kongzue.dialogx.dialogs.InputDialog;
import com.kongzue.dialogx.dialogs.MessageMenu;
import com.kongzue.dialogx.interfaces.BaseDialog;
import com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener;
import com.kongzue.dialogx.interfaces.OnMenuItemClickListener;
import com.yuexin.panel.myClass.itemInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4478 extends AbstractC5391 {

    /* JADX INFO: renamed from: ۥ */
    public static final String[] f913 = {yue_xin_awa(33), yue_xin_awa(34), yue_xin_awa(35)};

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Handler f914 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static List<View> f9366 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static List<View> f9367 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static List<View> f9368 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static List<View> f9369 = new ArrayList();

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static float f9370 = m12961(C4093.m11557(yue_xin_awa(22)));

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static float f9371 = m12961(C4093.m11557(yue_xin_awa(24)));

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static float f9372 = m12961(C4093.m11557(yue_xin_awa(23)));

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static float f9373 = m12961(C4093.m11557(yue_xin_awa(36)));

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Handler f9374 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9375;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9376;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9377;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9378;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9379;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9380;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9381;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9382;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9383;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9384;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9385;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9386;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9387;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9388;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9389;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9390;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9391;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9392;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9393;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9394;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9395;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9396;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9397;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9398;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9399;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9400;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9401;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9402;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9403;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9404;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9405;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9406;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9407;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9408;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9409;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9410;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static volatile /* synthetic */ String f9411;

    private static /* synthetic */ String yue_xin_awa(int i) {
        switch (i) {
            case 0:
                String str = f9375;
                if (str != null) {
                    return str;
                }
                String strM2267 = C5523.m2267(57962203418947942L);
                f9375 = strM2267;
                return strM2267;
            case 1:
                String str2 = f9376;
                if (str2 != null) {
                    return str2;
                }
                String strM22672 = C5523.m2267(-747258212160101525L);
                f9376 = strM22672;
                return strM22672;
            case 2:
                String str3 = f9377;
                if (str3 != null) {
                    return str3;
                }
                String strM22673 = C5523.m2267(7410653766009130995L);
                f9377 = strM22673;
                return strM22673;
            case 3:
                String str4 = f9378;
                if (str4 != null) {
                    return str4;
                }
                String strM22674 = C5523.m2267(-4617611074946671212L);
                f9378 = strM22674;
                return strM22674;
            case 4:
                String str5 = f9379;
                if (str5 != null) {
                    return str5;
                }
                String strM22675 = C5523.m2267(-1045473442438000208L);
                f9379 = strM22675;
                return strM22675;
            case 5:
                String str6 = f9380;
                if (str6 != null) {
                    return str6;
                }
                String strM22676 = C5523.m2267(5540935251596366719L);
                f9380 = strM22676;
                return strM22676;
            case 6:
                String str7 = f9381;
                if (str7 != null) {
                    return str7;
                }
                String strM22677 = C5523.m2267(-6141961744606256237L);
                f9381 = strM22677;
                return strM22677;
            case 7:
                String str8 = f9382;
                if (str8 != null) {
                    return str8;
                }
                String strM22678 = C5523.m2267(-8134899696129177494L);
                f9382 = strM22678;
                return strM22678;
            case 8:
                String str9 = f9383;
                if (str9 != null) {
                    return str9;
                }
                String strM22679 = C5523.m2267(6469788901783917435L);
                f9383 = strM22679;
                return strM22679;
            case 9:
                String str10 = f9384;
                if (str10 != null) {
                    return str10;
                }
                String strM226710 = C5523.m2267(-3296823039064950511L);
                f9384 = strM226710;
                return strM226710;
            case 10:
                String str11 = f9385;
                if (str11 != null) {
                    return str11;
                }
                String strM226711 = C5523.m2267(-3952483241604560957L);
                f9385 = strM226711;
                return strM226711;
            case 11:
                String str12 = f9386;
                if (str12 != null) {
                    return str12;
                }
                String strM226712 = C5523.m2267(7853957453252658176L);
                f9386 = strM226712;
                return strM226712;
            case 12:
                String str13 = f9387;
                if (str13 != null) {
                    return str13;
                }
                String strM226713 = C5523.m2267(2553796727245769467L);
                f9387 = strM226713;
                return strM226713;
            case 13:
                String str14 = f9388;
                if (str14 != null) {
                    return str14;
                }
                String strM226714 = C5523.m2267(-5063415054494518969L);
                f9388 = strM226714;
                return strM226714;
            case 14:
                String str15 = f9389;
                if (str15 != null) {
                    return str15;
                }
                String strM226715 = C5523.m2267(-6514239620714057473L);
                f9389 = strM226715;
                return strM226715;
            case 15:
                String str16 = f9390;
                if (str16 != null) {
                    return str16;
                }
                String strM226716 = C5523.m2267(-4320074154666661687L);
                f9390 = strM226716;
                return strM226716;
            case 16:
                String str17 = f9391;
                if (str17 != null) {
                    return str17;
                }
                String strM226717 = C5523.m2267(6757760757163895932L);
                f9391 = strM226717;
                return strM226717;
            case 17:
                String str18 = f9392;
                if (str18 != null) {
                    return str18;
                }
                String strM226718 = C5523.m2267(8330621410826985291L);
                f9392 = strM226718;
                return strM226718;
            case 18:
                String str19 = f9393;
                if (str19 != null) {
                    return str19;
                }
                String strM226719 = C5523.m2267(-2219127284634868393L);
                f9393 = strM226719;
                return strM226719;
            case 19:
                String str20 = f9394;
                if (str20 != null) {
                    return str20;
                }
                String strM226720 = C5523.m2267(-7193977127208465736L);
                f9394 = strM226720;
                return strM226720;
            case 20:
                String str21 = f9395;
                if (str21 != null) {
                    return str21;
                }
                String strM226721 = C5523.m2267(3789815853883083743L);
                f9395 = strM226721;
                return strM226721;
            case 21:
                String str22 = f9396;
                if (str22 != null) {
                    return str22;
                }
                String strM226722 = C5523.m2267(8695461673153662147L);
                f9396 = strM226722;
                return strM226722;
            case 22:
                String str23 = f9397;
                if (str23 != null) {
                    return str23;
                }
                String strM226723 = C5523.m2267(-6624485560030078076L);
                f9397 = strM226723;
                return strM226723;
            case 23:
                String str24 = f9398;
                if (str24 != null) {
                    return str24;
                }
                String strM226724 = C5523.m2267(-4834053187162802027L);
                f9398 = strM226724;
                return strM226724;
            case 24:
                String str25 = f9399;
                if (str25 != null) {
                    return str25;
                }
                String strM226725 = C5523.m2267(2789400473395041594L);
                f9399 = strM226725;
                return strM226725;
            case 25:
                String str26 = f9400;
                if (str26 != null) {
                    return str26;
                }
                String strM226726 = C5523.m2267(-3298017912616944282L);
                f9400 = strM226726;
                return strM226726;
            case 26:
                String str27 = f9401;
                if (str27 != null) {
                    return str27;
                }
                String strM226727 = C5523.m2267(-9155206362240736573L);
                f9401 = strM226727;
                return strM226727;
            case 27:
                String str28 = f9402;
                if (str28 != null) {
                    return str28;
                }
                String strM226728 = C5523.m2267(-1427366544525735100L);
                f9402 = strM226728;
                return strM226728;
            case 28:
                String str29 = f9403;
                if (str29 != null) {
                    return str29;
                }
                String strM226729 = C5523.m2267(87064465079858188L);
                f9403 = strM226729;
                return strM226729;
            case 29:
                String str30 = f9404;
                if (str30 != null) {
                    return str30;
                }
                String strM226730 = C5523.m2267(7139754222167825334L);
                f9404 = strM226730;
                return strM226730;
            case 30:
                String str31 = f9405;
                if (str31 != null) {
                    return str31;
                }
                String strM226731 = C5523.m2267(3872915734481463977L);
                f9405 = strM226731;
                return strM226731;
            case 31:
                String str32 = f9406;
                if (str32 != null) {
                    return str32;
                }
                String strM226732 = C5523.m2267(-5441561674633049103L);
                f9406 = strM226732;
                return strM226732;
            case 32:
                String str33 = f9407;
                if (str33 != null) {
                    return str33;
                }
                String strM226733 = C5523.m2267(1261002866824531692L);
                f9407 = strM226733;
                return strM226733;
            case 33:
                String str34 = f9408;
                if (str34 != null) {
                    return str34;
                }
                String strM226734 = C5523.m2267(6491406803201075308L);
                f9408 = strM226734;
                return strM226734;
            case 34:
                String str35 = f9409;
                if (str35 != null) {
                    return str35;
                }
                String strM226735 = C5523.m2267(2957326853529433692L);
                f9409 = strM226735;
                return strM226735;
            case 35:
                String str36 = f9410;
                if (str36 != null) {
                    return str36;
                }
                String strM226736 = C5523.m2267(-3703174843038817803L);
                f9410 = strM226736;
                return strM226736;
            case 36:
                String str37 = f9411;
                if (str37 != null) {
                    return str37;
                }
                String strM226737 = C5523.m2267(8037719881061525556L);
                f9411 = strM226737;
                return strM226737;
            default:
                return null;
        }
    }

    private static /* synthetic */ void yue_xin_qaq() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static void m12958(final View view) {
        if (f9370 == 0.0f) {
            return;
        }
        String simpleName = view.getClass().getSimpleName();
        if (simpleName.equals(yue_xin_awa(5)) || simpleName.equals(yue_xin_awa(6)) || simpleName.equals(yue_xin_awa(7)) || (view instanceof SeekBar) || simpleName.equals(yue_xin_awa(8))) {
            f9374.post(new Runnable() { // from class: Yue.ۥ۠۟ۦ۠
                @Override // java.lang.Runnable
                public final void run() {
                    C4478.m12963(view);
                }
            });
            if (f9366.contains(view)) {
                return;
            }
            f9366.add(view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static void m12959(final View view) {
        if (f9371 == 0.0f) {
            return;
        }
        String simpleName = view.getClass().getSimpleName();
        if (!simpleName.equals(yue_xin_awa(11))) {
            if (simpleName.equals(yue_xin_awa(14)) || simpleName.equals(yue_xin_awa(15)) || simpleName.equals(yue_xin_awa(16))) {
                f9374.post(new Runnable() { // from class: Yue.ۥ۠۟ۦۣ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4478.m12964(view);
                    }
                });
                if (f9367.contains(view)) {
                    return;
                }
                f9367.add(view);
                return;
            }
            return;
        }
        for (View view2 : C8369.m27916(view)) {
            if (view2 instanceof TextView) {
                final TextView textView = (TextView) view2;
                String string = textView.getText().toString();
                if (string.contains(yue_xin_awa(12)) || string.equals(yue_xin_awa(13))) {
                    f9374.post(new Runnable() { // from class: Yue.ۥ۠۟ۦ۟
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4478.m12965(textView, view);
                        }
                    });
                    if (!f9367.contains(view)) {
                        f9367.add(view);
                    }
                    if (f9367.contains(textView)) {
                        return;
                    }
                    f9367.add(textView);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static void m12960(final View view) {
        if (f9372 == 0.0f) {
            return;
        }
        String simpleName = view.getClass().getSimpleName();
        if (simpleName.equals(yue_xin_awa(5)) || simpleName.equals(yue_xin_awa(9)) || simpleName.equals(yue_xin_awa(10))) {
            f9374.post(new Runnable() { // from class: Yue.ۥ۠۟ۧ
                @Override // java.lang.Runnable
                public final void run() {
                    C4478.m12966(view);
                }
            });
            if (f9368.contains(view)) {
                return;
            }
            f9368.add(view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static float m12961(float f) {
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m12962(final int i) {
        new Thread(new Runnable() { // from class: Yue.ۥ۠۟ۧ۟
            @Override // java.lang.Runnable
            public final void run() {
                C4478.m12970(i);
            }
        }).start();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m12963(View view) {
        view.setAlpha(f9370);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m12964(View view) {
        view.setAlpha(f9371);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m12965(TextView textView, View view) {
        textView.setAlpha(f9371);
        view.setAlpha(f9371);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m12966(View view) {
        view.setAlpha(f9372);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ void m12967(View view) {
        view.setAlpha(f9372);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ void m12968(View view) {
        view.setAlpha(f9370);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m12969(View view) {
        view.setAlpha(f9371);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m12970(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            C7477.m3677(100L);
            if (C3989.m964()) {
                return;
            }
            for (final View view : new ArrayList(f9368)) {
                f9374.post(new Runnable() { // from class: Yue.ۥ۠۟ۦۥ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4478.m12967(view);
                    }
                });
            }
            for (final View view2 : new ArrayList(f9366)) {
                f9374.post(new Runnable() { // from class: Yue.ۥ۠۟ۦۦ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4478.m12968(view2);
                    }
                });
            }
            for (final View view3 : new ArrayList(f9367)) {
                f9374.post(new Runnable() { // from class: Yue.ۥ۠۟ۦۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4478.m12969(view3);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m12971(String str, InputDialog inputDialog, View view, String str2) {
        try {
            float f = Float.parseFloat(str2);
            if (f > 1.0f) {
                C6334.m19807(yue_xin_awa(30), 3);
                return true;
            }
            if (0.0f >= f) {
                C4093.m11566(str, null);
                return true;
            }
            C4093.m11566(str, Float.valueOf(f));
            C6334.m19807(yue_xin_awa(31), 2);
            return false;
        } catch (Exception unused) {
            C6334.m19807(yue_xin_awa(32), 3);
            return false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ boolean m12972(MessageMenu messageMenu, CharSequence charSequence, int i) {
        String strYue_xin_awa;
        final String strYue_xin_awa2 = i == 0 ? yue_xin_awa(22) : i == 1 ? yue_xin_awa(23) : yue_xin_awa(24);
        InputDialog cancelable = new InputDialog(yue_xin_awa(17), yue_xin_awa(25), yue_xin_awa(26), yue_xin_awa(27)).setCancelable(false);
        if (C4093.m11557(strYue_xin_awa2) == 0.0f) {
            strYue_xin_awa = yue_xin_awa(28);
        } else {
            strYue_xin_awa = C4093.m11557(strYue_xin_awa2) + yue_xin_awa(29);
        }
        cancelable.setInputText(strYue_xin_awa).setOkButton(new OnInputDialogButtonClickListener() { // from class: Yue.ۥ۠۟ۦۡ
            @Override // com.kongzue.dialogx.interfaces.OnInputDialogButtonClickListener
            public final boolean onClick(BaseDialog baseDialog, View view, String str) {
                return C4478.m12971(strYue_xin_awa2, (InputDialog) baseDialog, view, str);
            }
        }).show();
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ void m12973(View view) {
        view.setAlpha(f9370);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m12975(View view) {
        for (int i = 0; i < 15; i++) {
            C7477.m3677(100L);
            if (C3989.m964()) {
                return;
            }
            for (View view2 : C8369.m27916(view)) {
                m12959(view2);
                m12960(view2);
                m12958(view2);
                m12978(view2);
            }
            m12962(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static void m12976() {
        if (C4093.m11556(yue_xin_awa(2))) {
            m12962(1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static void m12977() {
        if (C4093.m11556(yue_xin_awa(2))) {
            m12979();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static void m12978(View view) {
        if ((view instanceof TextView) && ((TextView) view).getText().toString().equals(yue_xin_awa(4))) {
            final View view2 = (View) view.getParent();
            f9374.post(new Runnable() { // from class: Yue.ۥ۠۟ۦۨ
                @Override // java.lang.Runnable
                public final void run() {
                    C4478.m12973(view2);
                }
            });
            if (f9366.contains(view2)) {
                return;
            }
            f9366.add(view2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static void m12979() {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(f9368);
            arrayList.addAll(f9366);
            arrayList.addAll(f9367);
            for (final View view : new ArrayList(arrayList)) {
                f9374.post(new Runnable() { // from class: Yue.ۥ۠۟ۧ۠
                    @Override // java.lang.Runnable
                    public final void run() {
                        view.setAlpha(1.0f);
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static void m12980(boolean z) {
        Activity activityM6710;
        if (C4093.m11556(yue_xin_awa(2)) && C6263.m2730() && (activityM6710 = C3270.m6710()) != null) {
            final View rootView = activityM6710.getWindow().getDecorView().getRootView();
            new Thread(new Runnable() { // from class: Yue.ۥ۠۟ۦۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C4478.m12975(rootView);
                }
            }).start();
        }
    }

    @Override // Yue.AbstractC5391
    public HashMap<String, FindMethod> dexKit(DexKitBridge dexKitBridge, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(yue_xin_awa(18), FindMethod.create().matcher(MethodMatcher.create().usingStrings(yue_xin_awa(19), yue_xin_awa(20), yue_xin_awa(21))));
        return linkedHashMap;
    }

    @Override // Yue.AbstractC5391
    public String[] getClickStrings() {
        return f913;
    }

    @Override // Yue.AbstractC5391
    public itemInfo info() {
        itemInfo iteminfo = new itemInfo();
        iteminfo.add = true;
        iteminfo.name = yue_xin_awa(0);
        iteminfo.desc = yue_xin_awa(1);
        iteminfo.f4200id = yue_xin_awa(2);
        iteminfo.checkID = yue_xin_awa(2);
        iteminfo.permission = yue_xin_awa(3);
        iteminfo.firstHook = true;
        iteminfo.click = true;
        iteminfo.dexKit = true;
        iteminfo.items = true;
        return iteminfo;
    }

    @Override // Yue.AbstractC5391
    public void load(C3829 c3829, ClassLoader classLoader) {
    }

    @Override // Yue.AbstractC5391
    public void onClick() {
        MessageMenu.show(f913).setTitle((CharSequence) yue_xin_awa(17)).setOnMenuItemClickListener(new OnMenuItemClickListener() { // from class: Yue.ۥ۠۟ۦۤ
            @Override // com.kongzue.dialogx.interfaces.OnMenuItemClickListener
            public final boolean onClick(Object obj, CharSequence charSequence, int i) {
                return C4478.m12972((MessageMenu) obj, charSequence, i);
            }
        });
    }
}
