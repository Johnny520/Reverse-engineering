package p000;

import android.R;
import android.app.Activity;
import android.app.C0986;
import android.app.C0987;
import android.app.C0988;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0990;
import android.support.v4.graphics.drawable.C0992;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.C0997;
import androidx.activity.result.C0995;
import androidx.appcompat.widget.C0999;
import androidx.appcompat.widget.C1001;
import androidx.appcompat.widget.C1002;
import androidx.constraintlayout.helper.widget.C1003;
import androidx.constraintlayout.widget.C1004;
import androidx.constraintlayout.widget.C1005;
import androidx.coordinatorlayout.widget.C1008;
import androidx.core.content.C1009;
import androidx.fragment.app.C1013;
import androidx.profileinstaller.C1017;
import androidx.savedstate.C1020;
import androidx.versionedparcelable.C1024;
import androidx.versionedparcelable.C1026;
import androidx.versionedparcelable.C1027;
import com.github.megatronking.stringfog.C1033;
import com.github.megatronking.stringfog.C1034;
import com.github.megatronking.stringfog.xor.C1032;
import com.google.android.material.behavior.C1036;
import com.google.android.material.carousel.C1041;
import com.google.android.material.chip.C1042;
import com.google.android.material.datepicker.C1044;
import com.google.android.material.floatingactionbutton.C1046;
import com.google.android.material.internal.C1047;
import com.ljx.wechatmod.auth.C1051;
import com.ljx.wechatmod.hook.C1052;
import com.ljx.wechatmod.p001ui.C1053;
import io.fastkv.C1054;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.C1055;

/* JADX INFO: loaded from: classes.dex */
public final class s20 {

    /* JADX INFO: renamed from: a */
    public static final s20 f4378a;

    static {
        String str;
        int iM3108 = C1051.m3108("ۦۨۨ");
        while (true) {
            switch (iM3108) {
                case 1748646:
                    f4378a = new s20();
                    if (C1027.f5671 / (C1004.f5648 | 581) == 0) {
                        str = "ۦۥۤ";
                    } else {
                        C1052.m3110();
                        iM3108 = C1024.m2999("ۦۨۨ");
                    }
                    break;
                case 1748826:
                    if (C1001.m2907() > 0) {
                        iM3108 = C1042.f5686 + C1053.f5697 + 1754128;
                    } else {
                        str = "ۣ۠۠";
                    }
                    break;
                case 1753605:
                    return;
                case 1753702:
                    "key_show_floating_entrance";
                    iM3108 = (C1032.f5676 * C0990.f5634) ^ (-1670410);
                    continue;
            }
            iM3108 = C1054.m3117(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m2300a(final Activity activity) {
        boolean z;
        int color;
        int color2;
        String str;
        String str2;
        String str3;
        String str4;
        int color3;
        String str5;
        String str6;
        int color4;
        String str7;
        String str8;
        int color5;
        String str9;
        String str10;
        int color6;
        int i;
        int iArgb;
        final C0565on c0565on;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        AbstractC0346ip.m1503o("act", activity);
        C0267gn c0267gn = C0267gn.f2144a;
        String strM2419a = "key_dark_mode";
        c0267gn.getClass();
        int iM1282b = C0267gn.m1282b(strM2419a, 0);
        if (iM1282b == 1) {
            z = false;
        } else {
            if (iM1282b != 2) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i2 = activity.getResources().getConfiguration().uiMode;
                    if ((i2 & (i2 ^ (-49))) == 32) {
                    }
                }
                z = false;
            }
            z = true;
        }
        char c = C0267gn.m1282b("key_ui_layout_style", 0) >= 1 ? (char) 1 : (char) 0;
        String[] strArr = AbstractC0603pn.f3917a;
        "context";
        int i3 = c >= 1 ? 1 : 0;
        try {
            color = Color.parseColor(C0267gn.m1284d("key_custom_accent_color", "#00A4FF"));
        } catch (Exception e) {
            z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", "UIFactory_ParseColor", "Fg==\n", "c8HJlSTQVfc=\n");
            color = Color.parseColor("#00A4FF");
        }
        if (!z30.m2772q("jh3JsDwgDOaIEdOwOzYO6Jc=\n", "5Xiw71hZYoc=\n", C0267gn.f2144a) || Build.VERSION.SDK_INT < 31) {
            color2 = color;
        } else {
            try {
                color2 = activity.getResources().getColor(R.color.system_accent1_500, activity.getTheme());
            } catch (Exception e2) {
                z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", "UIFactory_SysColor", "Fg==\n", "c8HJlSTQVfc=\n");
                color2 = color;
            }
        }
        C0267gn c0267gn2 = C0267gn.f2144a;
        String strM2419a2 = "key_show_icons";
        c0267gn2.getClass();
        boolean zM1281a = C0267gn.m1281a(strM2419a2, true);
        boolean zM1281a2 = C0267gn.m1281a("key_icon_tint_accent", false);
        String str17 = i3 + "_" + z + "_" + color2 + "_" + zM1281a + "_" + zM1281a2;
        ConcurrentHashMap concurrentHashMap = AbstractC0603pn.f3918b;
        C0565on c0565on2 = (C0565on) concurrentHashMap.get(str17);
        if (c0565on2 != null) {
            c0565on = c0565on2;
        } else {
            fb0 fb0Var = fb0.f1917k;
            int i4 = (color2 ^ (-256)) & color2;
            double dM54s = a80.m54s((((-16711681) ^ color2) & color2) >> 16);
            double dM54s2 = a80.m54s((((-65281) ^ color2) & color2) >> 8);
            double dM54s3 = a80.m54s(i4);
            double d = (((0.18051042d * dM54s3) + 17.0d) + ((((0.35762064d * dM54s2) - 5.0d) + (0.41233895d * dM54s)) + 5.0d)) - 17.0d;
            double d2 = (0.0722d * dM54s3) - (0.0d - ((0.7152d * dM54s2) - (0.0d - (0.2126d * dM54s))));
            double d3 = 0.0d - ((0.0d - (dM54s3 * 0.95034478d)) - ((dM54s2 * 0.11916382d) - (0.0d - (dM54s * 0.01932141d))));
            double[][] dArr = a80.f68a;
            double[] dArr2 = dArr[0];
            double d4 = dArr2[0];
            double d5 = dArr2[1];
            double d6 = dArr2[2];
            double[] dArr3 = dArr[1];
            double d7 = dArr3[0];
            double d8 = dArr3[1];
            double d9 = dArr3[2];
            double[] dArr4 = dArr[2];
            double d10 = dArr4[0];
            double d11 = dArr4[1];
            double d12 = dArr4[2];
            double[] dArr5 = fb0Var.f1924g;
            double d13 = fb0Var.f1926i;
            double d14 = fb0Var.f1921d;
            double d15 = fb0Var.f1918a;
            double d16 = (0.0d - ((0.0d - (d6 * d3)) - ((d4 * d) - (0.0d - (d5 * d2))))) * dArr5[0];
            double d17 = dArr5[1] * (((d7 * d) - (0.0d - (d8 * d2))) - (0.0d - (d9 * d3)));
            double d18 = (0.0d - ((0.0d - (d3 * d12)) - ((d2 * d11) - (0.0d - (d * d10))))) * dArr5[2];
            double d19 = fb0Var.f1925h;
            double dPow = Math.pow((Math.abs(d16) * d19) / 100.0d, 0.42d);
            double dPow2 = Math.pow((Math.abs(d17) * d19) / 100.0d, 0.42d);
            double dPow3 = Math.pow((d19 * Math.abs(d18)) / 100.0d, 0.42d);
            double dSignum = ((Math.signum(d16) * 400.0d) * dPow) / (dPow - (0.0d - 27.13d));
            double dSignum2 = ((Math.signum(d17) * 400.0d) * dPow2) / (27.13d - (0.0d - dPow2));
            double dSignum3 = ((Math.signum(d18) * 400.0d) * dPow3) / (((dPow3 + 15.0d) + 27.13d) - 15.0d);
            double d20 = (dSignum3 - (0.0d - (0.0d - ((0.0d - ((-12.0d) * dSignum2)) - (11.0d * dSignum))))) / 11.0d;
            double d21 = ((((((21.0d + dSignum) + dSignum2) - 21.0d) + 21.0d) - (2.0d * dSignum3)) - 21.0d) / 9.0d;
            double d22 = 20.0d * dSignum2;
            double d23 = (0.0d - ((0.0d - (21.0d * dSignum3)) - ((((20.0d * dSignum) + 29.0d) + d22) - 29.0d))) / 20.0d;
            double d24 = (dSignum3 - (0.0d - ((d22 + ((dSignum * 40.0d) - 31.0d)) + 31.0d))) / 20.0d;
            double degrees = Math.toDegrees(Math.atan2(d21, d20));
            if (degrees < 0.0d) {
                degrees = 360.0d - (0.0d - degrees);
            } else if (degrees >= 360.0d) {
                degrees = ((degrees + 11.0d) - 360.0d) - 11.0d;
            }
            double radians = Math.toRadians(degrees);
            double dPow4 = (Math.pow((d24 * fb0Var.f1919b) / d15, fb0Var.f1927j * d14) * 100.0d) / 100.0d;
            Math.sqrt(dPow4);
            double dPow5 = Math.pow(((((((0.0d - ((0.0d - Math.cos(2.0d - (0.0d - Math.toRadians(degrees < 20.14d ? degrees - (0.0d - 360.0d) : degrees)))) - 3.8d)) * 0.25d) * 3846.153846153846d) * fb0Var.f1922e) * fb0Var.f1920c) * Math.hypot(d20, d21)) / (((d23 - 2.0d) + 0.305d) + 2.0d), 0.9d) * Math.pow(((1.64d + 25.0d) - Math.pow(0.29d, fb0Var.f1923f)) - 25.0d, 0.73d);
            double dSqrt = Math.sqrt(dPow4) * dPow5;
            Math.sqrt((dPow5 * d14) / (d15 - (0.0d - 4.0d)));
            Math.log1p(dSqrt * d13 * 0.0228d);
            Math.cos(radians);
            Math.sin(radians);
            int i5 = color2 >> 16;
            double dM54s4 = a80.m54s(i5 & (i5 ^ (-256)));
            int i6 = color2 >> 8;
            double d25 = AbstractC0979zt.m2815F(new double[]{dM54s4, a80.m54s(i6 & (i6 ^ (-256))), a80.m54s(i4)}, a80.f69b)[1] / 100.0d;
            if (d25 > 0.008856451679035631d) {
                Math.pow(d25, 0.3333333333333333d);
            }
            b70 b70VarM539a = b70.m539a(degrees, Math.max(dSqrt, 50.0d));
            b70 b70VarM539a2 = b70.m539a(degrees, 8.0d);
            b70 b70VarM539a3 = b70.m539a(degrees, 12.0d);
            int iM540b = b70VarM539a.m540b(z ? 80 : 45);
            if (i3 == 1) {
                int iM540b2 = b70VarM539a2.m540b(z ? 6 : 98);
                color3 = b70VarM539a2.m540b(z ? 12 : 95);
                color5 = b70VarM539a3.m540b(z ? 20 : 90);
                color6 = b70VarM539a2.m540b(z ? 95 : 15);
                int iArgb2 = z ? Color.argb(160, 255, 255, 255) : b70VarM539a3.m540b(40);
                color4 = 0;
                i = iM540b2;
                iArgb = iArgb2;
            } else {
                if (z) {
                    str = "RRvmj3SlBA==\n";
                    str2 = "ZivWv0SVNA4=\n";
                } else {
                    str = "M1jAtL2vjw==\n";
                    str2 = "EB7z8onpubI=\n";
                }
                int color7 = Color.parseColor("#F3F4F6");
                if (z) {
                    str3 = "Svz3k8Oo8A==\n";
                    str4 = "ac20ooCZtXA=\n";
                } else {
                    str3 = "FCP8aJtyYw==\n";
                    str4 = "N2W6Lt00JUE=\n";
                }
                color3 = Color.parseColor("#FFFFFF");
                if (z) {
                    str5 = "iP8rEbHUnsft\n";
                    str6 = "q84ZV/eS2IE=\n";
                } else {
                    str5 = "LxODVoCy2Z48\n";
                    str6 = "DCPCZrCC6a4=\n";
                }
                color4 = Color.parseColor("#0A000000");
                if (z) {
                    str7 = "ni4gbYT66A==\n";
                    str8 = "vRwWX7LI0Hg=\n";
                } else {
                    str7 = "D3y4QF7ekw==\n";
                    str8 = "LDmNBWub0tc=\n";
                }
                color5 = Color.parseColor("#E5E5EA");
                if (z) {
                    str9 = "ES+GIVCOLQ==\n";
                    str10 = "MmnAZxbIa6o=\n";
                } else {
                    str9 = "ciQYlT1wCw==\n";
                    str10 = "URUppAxBOnY=\n";
                }
                color6 = Color.parseColor("#111111");
                i = color7;
                iArgb = z ? Color.argb(160, 255, 255, 255) : Color.parseColor("#8E8E93");
            }
            boolean z2 = (i3 & (-2)) | ((i3 ^ (-1)) & 1);
            C0565on c0565on3 = new C0565on(i3, i, color3, color4, color6, iArgb, iM540b, color5, Color.argb(i3 == 1 ? 35 : 20, Color.red(iM540b), Color.green(iM540b), Color.blue(iM540b)), AbstractC0222ff.m1194p(i3 == 1 ? 28.0f : 24.0f), i3 == 1 ? 0.0f : AbstractC0222ff.m1194p(12.0f), z2, z2, zM1281a, zM1281a2, z);
            concurrentHashMap.put(str17, c0565on3);
            c0565on = c0565on3;
        }
        int i7 = c0565on.f3561g;
        int i8 = c0565on.f3560f;
        boolean z3 = c0565on.f3570p;
        int i9 = c0565on.f3557c;
        int i10 = c0565on.f3555a;
        final Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        frameLayout.setOnClickListener(new ViewOnClickListenerC0771u6(dialog, 14));
        final int i11 = (int) (((double) activity.getResources().getDisplayMetrics().heightPixels) * 0.95d);
        final LinearLayout linearLayoutM2762g = z30.m2762g(activity, 1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i11);
        layoutParams.gravity = 80;
        linearLayoutM2762g.setLayoutParams(layoutParams);
        linearLayoutM2762g.setClickable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(c0565on.f3556b);
        float f = c0565on.f3564j;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        linearLayoutM2762g.setBackground(gradientDrawable);
        int i12 = Build.VERSION.SDK_INT;
        linearLayoutM2762g.setOutlineProvider(new C0250g6(6, c0565on));
        linearLayoutM2762g.setClipToOutline(true);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view = new View(activity);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0222ff.m1195q(36), AbstractC0222ff.m1195q(5));
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = AbstractC0222ff.m1195q(16);
        layoutParams2.bottomMargin = AbstractC0222ff.m1195q(16);
        view.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i8);
        gradientDrawable2.setAlpha(80);
        gradientDrawable2.setCornerRadius(AbstractC0222ff.m1194p(10.0f));
        view.setBackground(gradientDrawable2);
        frameLayout2.addView(view);
        linearLayoutM2762g.addView(frameLayout2);
        frameLayout2.setOnTouchListener(new r20(i11, dialog, linearLayoutM2762g));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        frameLayout3.setPadding(AbstractC0222ff.m1195q(24), AbstractC0222ff.m1195q(0), AbstractC0222ff.m1195q(24), AbstractC0222ff.m1195q(20));
        TextView textView = new TextView(activity);
        z30.m2769n("DzVIeg==\n", "SFAtEYnsH4w=\n", textView, 20.0f, i7);
        textView.setTypeface(AbstractC0491mn.f3267a, 3);
        textView.setPadding(AbstractC0222ff.m1195q(20), AbstractC0222ff.m1195q(8), AbstractC0222ff.m1195q(20), AbstractC0222ff.m1195q(8));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(i9);
        gradientDrawable3.setCornerRadius(AbstractC0222ff.m1194p(100.0f));
        textView.setBackground(gradientDrawable3);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388627;
        textView.setLayoutParams(layoutParams3);
        textView.setOnClickListener(new ViewOnClickListenerC0808v6(textView, dialog, 1));
        frameLayout3.addView(textView);
        TextView textView2 = new TextView(activity);
        z30.m2769n("wL7a\n", "LzlsMVMe3co=\n", textView2, 20.0f, i8);
        Typeface typeface = C0899xn.f5174a;
        Typeface typeface2 = C0899xn.f5174a;
        if (typeface2 != null) {
            textView2.setTypeface(typeface2);
        }
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(i9);
        gradientDrawable4.setShape(1);
        textView2.setBackground(gradientDrawable4);
        textView2.setGravity(17);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC0222ff.m1195q(40), AbstractC0222ff.m1195q(40));
        layoutParams4.gravity = 8388629;
        textView2.setLayoutParams(layoutParams4);
        textView2.setOnClickListener(new ViewOnClickListenerC0918y5(activity, 5, c0565on));
        C0899xn.m2632c(textView2, c0565on);
        frameLayout3.addView(textView2);
        linearLayoutM2762g.addView(frameLayout3);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        frameLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        int iM1195q = i10 == 0 ? AbstractC0222ff.m1195q(120) : AbstractC0222ff.m1195q(90);
        final ScrollView scrollViewM2301b = m2301b(activity, iM1195q);
        scrollViewM2301b.setVisibility(0);
        final ScrollView scrollViewM2301b2 = m2301b(activity, iM1195q);
        scrollViewM2301b2.setVisibility(8);
        final ScrollView scrollViewM2301b3 = m2301b(activity, iM1195q);
        scrollViewM2301b3.setVisibility(8);
        final ScrollView scrollViewM2301b4 = m2301b(activity, iM1195q);
        scrollViewM2301b4.setVisibility(8);
        final LinearLayout linearLayoutM2762g2 = z30.m2762g(activity, 1);
        linearLayoutM2762g2.setPadding(0, AbstractC0222ff.m1195q(8), 0, AbstractC0222ff.m1195q(24));
        final LinearLayout linearLayoutM2762g3 = z30.m2762g(activity, 1);
        linearLayoutM2762g3.setPadding(0, AbstractC0222ff.m1195q(8), 0, AbstractC0222ff.m1195q(24));
        final LinearLayout linearLayoutM2762g4 = z30.m2762g(activity, 1);
        linearLayoutM2762g4.setPadding(0, AbstractC0222ff.m1195q(8), 0, AbstractC0222ff.m1195q(24));
        final LinearLayout linearLayoutM2762g5 = z30.m2762g(activity, 1);
        linearLayoutM2762g5.setPadding(0, AbstractC0222ff.m1195q(8), 0, AbstractC0222ff.m1195q(24));
        scrollViewM2301b.addView(linearLayoutM2762g2);
        scrollViewM2301b2.addView(linearLayoutM2762g3);
        scrollViewM2301b3.addView(linearLayoutM2762g4);
        scrollViewM2301b4.addView(linearLayoutM2762g5);
        frameLayout4.addView(scrollViewM2301b);
        frameLayout4.addView(scrollViewM2301b2);
        frameLayout4.addView(scrollViewM2301b3);
        frameLayout4.addView(scrollViewM2301b4);
        linearLayoutM2762g.addView(frameLayout4);
        "act";
        "dialog";
        "theme";
        "coreContainer";
        "chatContainer";
        "appearanceContainer";
        "privacyContainer";
        final int i13 = 0;
        C0899xn.m2630a(activity, linearLayoutM2762g2, a80.m44h("bcf2fbbfc7cdbcfbdcbcc4ec"), c0565on, new InterfaceC0713sm(activity, c0565on, dialog, i13) { // from class: t20

            /* JADX INFO: renamed from: a */
            public final int f4484a;

            /* JADX INFO: renamed from: b */
            public final Activity f4485b;

            /* JADX INFO: renamed from: c */
            public final C0565on f4486c;

            /* JADX INFO: renamed from: d */
            public final Dialog f4487d;

            {
                String str18;
                this.f4484a = i13;
                this.f4485b = activity;
                this.f4486c = c0565on;
                this.f4487d = dialog;
                Double dValueOf = null;
                int iM3079 = C1044.m3079("ۤۢ۠");
                while (true) {
                    switch (iM3079) {
                        case 1749858:
                            System.out.println(dValueOf);
                            if (C1034.f5678 % (C1005.f5649 + 8989) <= 0) {
                                C1036.m3047();
                                iM3079 = C1002.m2911("ۥۥۥ");
                            } else {
                                iM3079 = (C1041.f5685 * C1042.f5686) ^ 1579877;
                                continue;
                            }
                            break;
                        case 1751586:
                            if (C1004.m2921() <= 0) {
                                iM3079 = C1046.f5690 * (C1032.f5676 % (-8078)) <= 0 ? C1047.m3091("ۤۢ۠") : (C1055.f5699 * C1042.f5686) + 1745995;
                            }
                            break;
                        case 1751617:
                            break;
                        case 1751647:
                            return;
                        case 1752645:
                            if (C1034.f5678 % (C1042.f5686 | (-8947)) <= 0) {
                                C1009.m2938();
                                str18 = "ۣۤۤ";
                            } else {
                                str18 = "ۤۢ۠";
                            }
                            iM3079 = C1026.m3006(str18);
                            continue;
                        case 1755585:
                            dValueOf = Double.valueOf(C1003.m2914("ZF"));
                            if ((C0997.f5641 ^ (C1017.f5661 - 856)) <= 0) {
                                C1055.f5699 = 36;
                            }
                            iM3079 = C0992.m2872("ۢۨۨ");
                            continue;
                    }
                    iM3079 = C1004.m2919(C0997.m2890() <= 0 ? "ۡۧ۟" : "ۤۤ۟");
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0077. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:295:0x04c4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:297:0x01dd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:300:0x01cd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:303:0x022a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:307:0x0210 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:315:0x053a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:317:0x04bc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:318:0x0530 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:345:0x08d0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:347:0x08c7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:348:0x06d0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:352:0x06bd A[SYNTHETIC] */
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m2350a(java.lang.Object r74) {
                /*
                    Method dump skipped, instruction units count: 3100
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.m2350a(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x004a. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:183:0x01bb A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:184:0x01aa A[SYNTHETIC] */
            /* JADX INFO: renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m2351b(java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 1610
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.m2351b(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0065. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:221:0x02c7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:230:0x02c1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:237:0x01de A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:238:0x01cd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01f3  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0200  */
            /* JADX WARN: Type inference failed for: r33v0 */
            /* JADX WARN: Type inference failed for: r33v1 */
            /* JADX WARN: Type inference failed for: r33v2 */
            /* JADX WARN: Type inference failed for: r33v3 */
            /* JADX WARN: Type inference failed for: r33v4 */
            /* JADX WARN: Type inference failed for: r33v5 */
            /* JADX WARN: Type inference failed for: r33v6 */
            /* JADX WARN: Type inference failed for: r33v7 */
            /* JADX WARN: Type inference failed for: r33v8 */
            /* JADX WARN: Type inference failed for: r33v9 */
            /* JADX WARN: Type inference failed for: r7v49 */
            /* JADX WARN: Type inference failed for: r7v56 */
            /* JADX WARN: Type inference failed for: r7v57 */
            /* JADX INFO: renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m2352c(java.lang.Object r64) {
                /*
                    Method dump skipped, instruction units count: 2132
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.m2352c(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:327:0x10bc. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:740:0x19cf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:741:0x0173 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:744:0x08cf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:745:0x19bf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:750:0x0182 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:753:0x2042 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:765:0x10c8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:772:0x0243 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:773:0x203d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:774:0x0235 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:775:0x0266 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:777:0x1106 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:778:0x0259 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:799:0x0b56 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:801:0x0b4c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:803:0x169c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:834:0x20bc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:835:0x0b9d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:836:0x11e5 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:839:0x07f2 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:841:0x07c8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:852:0x08c4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:853:0x08f7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:855:0x08e7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:862:0x219a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:865:0x2193 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:877:0x14c6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:881:0x1f6a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:882:0x106a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:883:0x1f5f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:887:0x0b96 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:897:0x10f8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:909:0x11ed A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:913:0x107e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:930:0x14d4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:931:0x1695 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:932:0x20ca A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:933:0x10d2 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:950:0x1379 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:951:0x136b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:959:0x16c0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:960:0x16b1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:975:0x1ac6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:977:0x1ab4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:984:0x2027 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:985:0x201d A[SYNTHETIC] */
            @Override // p000.InterfaceC0713sm
            /* JADX INFO: renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo96f(java.lang.Object r151) {
                /*
                    Method dump skipped, instruction units count: 9592
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.mo96f(java.lang.Object):java.lang.Object");
            }
        });
        final int i14 = 2;
        C0899xn.m2630a(activity, linearLayoutM2762g2, a80.m44h("bcfae2bfe5d9bfd7d5b2f4f4"), c0565on, new InterfaceC0713sm(activity, c0565on, i14) { // from class: u20

            /* JADX INFO: renamed from: a */
            public final int f4650a;

            /* JADX INFO: renamed from: b */
            public final Activity f4651b;

            /* JADX INFO: renamed from: c */
            public final C0565on f4652c;

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0011. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0055 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0049 A[SYNTHETIC] */
            {
                /*
                    r3 = this;
                    r3.f4650a = r6
                    r3.f4651b = r4
                    r3.f4652c = r5
                    r3.<init>()
                    r1 = 0
                    java.lang.String r0 = "۟ۧۥ"
                    int r0 = android.support.v4.graphics.drawable.C0991.m2869(r0)
                    r2 = r0
                L11:
                    switch(r2) {
                        case 1746941: goto L15;
                        case 1751555: goto L8c;
                        case 1753697: goto L5d;
                        case 1754535: goto L7e;
                        case 1754654: goto L40;
                        case 1754661: goto L2c;
                        default: goto L14;
                    }
                L14:
                    goto L11
                L15:
                    int r0 = android.support.v4.graphics.drawable.C0990.m2864()
                    if (r0 < 0) goto L40
                    int r0 = androidx.versionedparcelable.C1025.f5669
                    int r2 = com.github.megatronking.stringfog.annotation.C1030.f5674
                    r2 = r2 | 1217(0x4c1, float:1.705E-42)
                    int r0 = r0 / r2
                    if (r0 == 0) goto L7b
                    java.lang.String r0 = "ۧۨۦ"
                    int r0 = kotlinx.coroutines.C1055.m3122(r0)
                    r2 = r0
                    goto L11
                L2c:
                    int r0 = androidx.emoji2.text.C1012.m2952()
                    if (r0 > 0) goto L3d
                    androidx.coordinatorlayout.widget.C1007.m2930()
                    java.lang.String r0 = "ۥۧۥ"
                L37:
                    int r0 = com.ljx.wechatmod.auth.C1051.m3108(r0)
                    r2 = r0
                    goto L11
                L3d:
                    java.lang.String r0 = "۟ۧۥ"
                    goto L37
                L40:
                    int r0 = androidx.activity.C0996.f5640
                    int r2 = androidx.activity.C0997.f5641
                    int r2 = r2 % (-7668)
                    int r0 = r0 / r2
                    if (r0 > 0) goto L55
                    androidx.core.widget.C1011.m2949()
                    java.lang.String r2 = "ۣ۟۠"
                    r0 = r1
                L4f:
                    int r2 = kotlinx.coroutines.C1055.m3122(r2)
                    r1 = r0
                    goto L11
                L55:
                    java.lang.String r0 = "ۤۡ۠"
                    int r0 = androidx.coordinatorlayout.widget.C1008.m2936(r0)
                    r2 = r0
                    goto L11
                L5d:
                    java.io.PrintStream r0 = java.lang.System.out
                    r0.println(r1)
                    int r0 = com.google.android.material.internal.C1047.f5691
                    int r2 = com.google.android.material.carousel.C1039.f5683
                    r2 = r2 | 393(0x189, float:5.51E-43)
                    int r0 = r0 - r2
                    if (r0 > 0) goto L73
                    java.lang.String r0 = "ۧۤۤ"
                    int r0 = com.google.android.material.theme.C1049.m3099(r0)
                    r2 = r0
                    goto L11
                L73:
                    java.lang.String r0 = "ۤۡ۠"
                    int r0 = androidx.activity.C0996.m2889(r0)
                    r2 = r0
                    goto L11
                L7b:
                    java.lang.String r0 = "ۧۤۤ"
                    goto L37
                L7e:
                    java.lang.String r0 = "xmlcRJibILeY3mgPHYNd"
                    java.lang.String r0 = androidx.constraintlayout.helper.widget.C1003.m2914(r0)
                    float r0 = java.lang.Float.parseFloat(r0)
                    java.lang.String r1 = "ۦۣۨ"
                    r2 = r1
                    goto L4f
                L8c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.u20.<init>(android.app.Activity, on, int):void");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:37:0x02c3. Please report as an issue. */
            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0077. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:215:0x05b2 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:229:0x070b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:230:0x0702 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:231:0x05a0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:264:0x05d1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:266:0x05c6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:40:0x02cf  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x02db  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x031a  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0326  */
            @Override // p000.InterfaceC0713sm
            /* JADX INFO: renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo96f(java.lang.Object r70) {
                /*
                    Method dump skipped, instruction units count: 2498
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.u20.mo96f(java.lang.Object):java.lang.Object");
            }
        });
        final int i15 = 5;
        C0899xn.m2630a(activity, linearLayoutM2762g2, a80.m44h("b2e4dfbfd0f3bee2d4bff4c4bfcad7"), c0565on, new InterfaceC0713sm(activity, c0565on, dialog, i15) { // from class: t20

            /* JADX INFO: renamed from: a */
            public final int f4484a;

            /* JADX INFO: renamed from: b */
            public final Activity f4485b;

            /* JADX INFO: renamed from: c */
            public final C0565on f4486c;

            /* JADX INFO: renamed from: d */
            public final Dialog f4487d;

            {
                String str18;
                this.f4484a = i15;
                this.f4485b = activity;
                this.f4486c = c0565on;
                this.f4487d = dialog;
                Double dValueOf = null;
                int iM3079 = C1044.m3079("ۤۢ۠");
                while (true) {
                    switch (iM3079) {
                        case 1749858:
                            System.out.println(dValueOf);
                            if (C1034.f5678 % (C1005.f5649 + 8989) <= 0) {
                                C1036.m3047();
                                iM3079 = C1002.m2911("ۥۥۥ");
                            } else {
                                iM3079 = (C1041.f5685 * C1042.f5686) ^ 1579877;
                                continue;
                            }
                            break;
                        case 1751586:
                            if (C1004.m2921() <= 0) {
                                iM3079 = C1046.f5690 * (C1032.f5676 % (-8078)) <= 0 ? C1047.m3091("ۤۢ۠") : (C1055.f5699 * C1042.f5686) + 1745995;
                            }
                            break;
                        case 1751617:
                            break;
                        case 1751647:
                            return;
                        case 1752645:
                            if (C1034.f5678 % (C1042.f5686 | (-8947)) <= 0) {
                                C1009.m2938();
                                str18 = "ۣۤۤ";
                            } else {
                                str18 = "ۤۢ۠";
                            }
                            iM3079 = C1026.m3006(str18);
                            continue;
                        case 1755585:
                            dValueOf = Double.valueOf(C1003.m2914("ZF"));
                            if ((C0997.f5641 ^ (C1017.f5661 - 856)) <= 0) {
                                C1055.f5699 = 36;
                            }
                            iM3079 = C0992.m2872("ۢۨۨ");
                            continue;
                    }
                    iM3079 = C1004.m2919(C0997.m2890() <= 0 ? "ۡۧ۟" : "ۤۤ۟");
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0077. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:295:0x04c4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:297:0x01dd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:300:0x01cd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:303:0x022a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:307:0x0210 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:315:0x053a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:317:0x04bc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:318:0x0530 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:345:0x08d0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:347:0x08c7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:348:0x06d0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:352:0x06bd A[SYNTHETIC] */
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m2350a(java.lang.Object r74) {
                /*
                    Method dump skipped, instruction units count: 3100
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.m2350a(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x004a. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:183:0x01bb A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:184:0x01aa A[SYNTHETIC] */
            /* JADX INFO: renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m2351b(java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 1610
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.m2351b(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0065. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:221:0x02c7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:230:0x02c1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:237:0x01de A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:238:0x01cd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01f3  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0200  */
            /* JADX WARN: Type inference failed for: r33v0 */
            /* JADX WARN: Type inference failed for: r33v1 */
            /* JADX WARN: Type inference failed for: r33v2 */
            /* JADX WARN: Type inference failed for: r33v3 */
            /* JADX WARN: Type inference failed for: r33v4 */
            /* JADX WARN: Type inference failed for: r33v5 */
            /* JADX WARN: Type inference failed for: r33v6 */
            /* JADX WARN: Type inference failed for: r33v7 */
            /* JADX WARN: Type inference failed for: r33v8 */
            /* JADX WARN: Type inference failed for: r33v9 */
            /* JADX WARN: Type inference failed for: r7v49 */
            /* JADX WARN: Type inference failed for: r7v56 */
            /* JADX WARN: Type inference failed for: r7v57 */
            /* JADX INFO: renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m2352c(java.lang.Object r64) {
                /*
                    Method dump skipped, instruction units count: 2132
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.m2352c(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:327:0x10bc. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:740:0x19cf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:741:0x0173 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:744:0x08cf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:745:0x19bf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:750:0x0182 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:753:0x2042 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:765:0x10c8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:772:0x0243 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:773:0x203d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:774:0x0235 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:775:0x0266 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:777:0x1106 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:778:0x0259 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:799:0x0b56 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:801:0x0b4c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:803:0x169c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:834:0x20bc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:835:0x0b9d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:836:0x11e5 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:839:0x07f2 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:841:0x07c8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:852:0x08c4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:853:0x08f7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:855:0x08e7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:862:0x219a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:865:0x2193 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:877:0x14c6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:881:0x1f6a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:882:0x106a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:883:0x1f5f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:887:0x0b96 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:897:0x10f8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:909:0x11ed A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:913:0x107e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:930:0x14d4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:931:0x1695 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:932:0x20ca A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:933:0x10d2 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:950:0x1379 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:951:0x136b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:959:0x16c0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:960:0x16b1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:975:0x1ac6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:977:0x1ab4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:984:0x2027 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:985:0x201d A[SYNTHETIC] */
            @Override // p000.InterfaceC0713sm
            /* JADX INFO: renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo96f(java.lang.Object r151) {
                /*
                    Method dump skipped, instruction units count: 9592
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.mo96f(java.lang.Object):java.lang.Object");
            }
        });
        final int i16 = 6;
        C0899xn.m2630a(activity, linearLayoutM2762g2, a80.m44h("bde0f8bfd6dfbfe6cfbcc9d4"), c0565on, new InterfaceC0713sm(activity, c0565on, dialog, i16) { // from class: t20

            /* JADX INFO: renamed from: a */
            public final int f4484a;

            /* JADX INFO: renamed from: b */
            public final Activity f4485b;

            /* JADX INFO: renamed from: c */
            public final C0565on f4486c;

            /* JADX INFO: renamed from: d */
            public final Dialog f4487d;

            {
                String str18;
                this.f4484a = i16;
                this.f4485b = activity;
                this.f4486c = c0565on;
                this.f4487d = dialog;
                Double dValueOf = null;
                int iM3079 = C1044.m3079("ۤۢ۠");
                while (true) {
                    switch (iM3079) {
                        case 1749858:
                            System.out.println(dValueOf);
                            if (C1034.f5678 % (C1005.f5649 + 8989) <= 0) {
                                C1036.m3047();
                                iM3079 = C1002.m2911("ۥۥۥ");
                            } else {
                                iM3079 = (C1041.f5685 * C1042.f5686) ^ 1579877;
                                continue;
                            }
                            break;
                        case 1751586:
                            if (C1004.m2921() <= 0) {
                                iM3079 = C1046.f5690 * (C1032.f5676 % (-8078)) <= 0 ? C1047.m3091("ۤۢ۠") : (C1055.f5699 * C1042.f5686) + 1745995;
                            }
                            break;
                        case 1751617:
                            break;
                        case 1751647:
                            return;
                        case 1752645:
                            if (C1034.f5678 % (C1042.f5686 | (-8947)) <= 0) {
                                C1009.m2938();
                                str18 = "ۣۤۤ";
                            } else {
                                str18 = "ۤۢ۠";
                            }
                            iM3079 = C1026.m3006(str18);
                            continue;
                        case 1755585:
                            dValueOf = Double.valueOf(C1003.m2914("ZF"));
                            if ((C0997.f5641 ^ (C1017.f5661 - 856)) <= 0) {
                                C1055.f5699 = 36;
                            }
                            iM3079 = C0992.m2872("ۢۨۨ");
                            continue;
                    }
                    iM3079 = C1004.m2919(C0997.m2890() <= 0 ? "ۡۧ۟" : "ۤۤ۟");
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0077. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:295:0x04c4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:297:0x01dd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:300:0x01cd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:303:0x022a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:307:0x0210 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:315:0x053a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:317:0x04bc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:318:0x0530 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:345:0x08d0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:347:0x08c7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:348:0x06d0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:352:0x06bd A[SYNTHETIC] */
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m2350a(java.lang.Object r74) {
                /*
                    Method dump skipped, instruction units count: 3100
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.m2350a(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x004a. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:183:0x01bb A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:184:0x01aa A[SYNTHETIC] */
            /* JADX INFO: renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m2351b(java.lang.Object r45) {
                /*
                    Method dump skipped, instruction units count: 1610
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.m2351b(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0065. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:221:0x02c7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:230:0x02c1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:237:0x01de A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:238:0x01cd A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:45:0x01f3  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0200  */
            /* JADX WARN: Type inference failed for: r33v0 */
            /* JADX WARN: Type inference failed for: r33v1 */
            /* JADX WARN: Type inference failed for: r33v2 */
            /* JADX WARN: Type inference failed for: r33v3 */
            /* JADX WARN: Type inference failed for: r33v4 */
            /* JADX WARN: Type inference failed for: r33v5 */
            /* JADX WARN: Type inference failed for: r33v6 */
            /* JADX WARN: Type inference failed for: r33v7 */
            /* JADX WARN: Type inference failed for: r33v8 */
            /* JADX WARN: Type inference failed for: r33v9 */
            /* JADX WARN: Type inference failed for: r7v49 */
            /* JADX WARN: Type inference failed for: r7v56 */
            /* JADX WARN: Type inference failed for: r7v57 */
            /* JADX INFO: renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m2352c(java.lang.Object r64) {
                /*
                    Method dump skipped, instruction units count: 2132
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.m2352c(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:327:0x10bc. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:740:0x19cf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:741:0x0173 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:744:0x08cf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:745:0x19bf A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:750:0x0182 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:753:0x2042 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:765:0x10c8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:772:0x0243 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:773:0x203d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:774:0x0235 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:775:0x0266 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:777:0x1106 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:778:0x0259 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:799:0x0b56 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:801:0x0b4c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:803:0x169c A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:834:0x20bc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:835:0x0b9d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:836:0x11e5 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:839:0x07f2 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:841:0x07c8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:852:0x08c4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:853:0x08f7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:855:0x08e7 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:862:0x219a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:865:0x2193 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:877:0x14c6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:881:0x1f6a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:882:0x106a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:883:0x1f5f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:887:0x0b96 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:897:0x10f8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:909:0x11ed A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:913:0x107e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:930:0x14d4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:931:0x1695 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:932:0x20ca A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:933:0x10d2 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:950:0x1379 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:951:0x136b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:959:0x16c0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:960:0x16b1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:975:0x1ac6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:977:0x1ab4 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:984:0x2027 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:985:0x201d A[SYNTHETIC] */
            @Override // p000.InterfaceC0713sm
            /* JADX INFO: renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo96f(java.lang.Object r151) {
                /*
                    Method dump skipped, instruction units count: 9592
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.t20.mo96f(java.lang.Object):java.lang.Object");
            }
        });
        final int i17 = 3;
        C0899xn.m2630a(activity, linearLayoutM2762g2, a80.m44h("bff0c8bee7c9bdf4fbbcd4fd"), c0565on, new InterfaceC0713sm
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0494: INVOKE 
              (r50v0 'activity' android.app.Activity)
              (r10v88 'linearLayoutM2762g2' android.widget.LinearLayout)
              (wrap:java.lang.String:0x0483: INVOKE 
              (wrap:java.lang.String:0x047f: INVOKE ("5DxnI34z5dXjbWIqf2/hhOA4Y3B5P+HU
            "), ("hloBEx0Lh7A=
            ") STATIC call: u40.a(java.lang.String, java.lang.String):java.lang.String A[MD:(java.lang.String, java.lang.String):java.lang.String (m), WRAPPED])
             STATIC call: a80.h(java.lang.String):java.lang.String A[MD:(java.lang.String):java.lang.String (m), WRAPPED])
              (r5v13 'c0565on' on)
              (wrap:sm:0x048f: CONSTRUCTOR 
              (r50v0 'activity' android.app.Activity A[DONT_INLINE])
              (r5v13 'c0565on' on A[DONT_INLINE])
              (r19v10 'i17' int A[DONT_INLINE])
             A[MD:(android.app.Activity, on, int):void (m), WRAPPED] call: u20.<init>(android.app.Activity, on, int):void type: CONSTRUCTOR)
             STATIC call: xn.a(android.app.Activity, android.widget.LinearLayout, java.lang.String, on, sm):void A[MD:(android.app.Activity, android.widget.LinearLayout, java.lang.String, on, sm):void (m)] in method: s20.a(android.app.Activity):void, file: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:88)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
            Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.setCodeVar(jadx.core.dex.instructions.args.CodeVar)" because the return value of "jadx.core.dex.instructions.args.RegisterArg.getSVar()" is null
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:836)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 35 more
            */
        /*
            Method dump skipped, instruction units count: 3450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s20.m2300a(android.app.Activity):void");
    }

    /* JADX INFO: renamed from: b */
    public static final ScrollView m2301b(Activity activity, int i) {
        String str;
        int iM2854 = C0988.m2854("ۧۨ۟");
        ScrollView scrollView = null;
        ViewOnTouchListenerC0845w6 viewOnTouchListenerC0845w6 = null;
        while (true) {
            switch (iM2854) {
                case 56325:
                    scrollView.setOnTouchListener(viewOnTouchListenerC0845w6);
                    iM2854 = (C1004.f5648 ^ C0999.f5643) + 1748003;
                    continue;
                case 1747718:
                    return scrollView;
                case 1748802:
                    scrollView.setPadding(0, 0, 0, i);
                    iM2854 = (C1013.f5657 - C1034.f5678) + 1756120;
                    continue;
                case 1749695:
                    if (C1001.m2907() > 0) {
                        str = "ۧۨ۟";
                    } else {
                        C0986.f5630 = 29;
                        str = "ۣ۠ۨ";
                    }
                    break;
                case 1750655:
                    scrollView.setVerticalScrollBarEnabled(false);
                    str = "ۨۧ۠";
                    break;
                case 1750812:
                    scrollView.setClipToPadding(false);
                    str = "ۡۥۦ";
                    break;
                case 1751778:
                    viewOnTouchListenerC0845w6.f4924c = -1.0f;
                    iM2854 = C1008.m2936("۠ۥ");
                    continue;
                case 1754654:
                    scrollView = new ScrollView(activity);
                    str = "ۣۣ۟";
                    break;
                case 1755374:
                    ViewOnTouchListenerC0845w6 viewOnTouchListenerC0845w62 = new ViewOnTouchListenerC0845w6(C1013.f5657 ^ (-442));
                    iM2854 = (-1751409) ^ (C1020.f5664 - C1033.f5677);
                    viewOnTouchListenerC0845w6 = viewOnTouchListenerC0845w62;
                    continue;
                case 1755585:
                    scrollView.setOverScrollMode(C1013.f5657 ^ (-441));
                    if (C0995.f5639 >= 0) {
                    }
                    iM2854 = C0987.m2851("ۣۨۡ");
                    continue;
            }
            iM2854 = C1057.m3131(str);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x001f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:135:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x008b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02bb A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.widget.LinearLayout m2302c(android.app.Activity r28, final p000.C0565on r29, final android.widget.ScrollView r30, final android.widget.ScrollView r31, final android.widget.ScrollView r32, final android.widget.ScrollView r33, final android.widget.LinearLayout r34, final android.widget.LinearLayout r35, final android.widget.LinearLayout r36, final android.widget.LinearLayout r37, final android.widget.LinearLayout r38, final android.view.View r39, final p000.h40 r40, final p000.h40 r41, final int r42, java.lang.String r43, java.lang.String r44) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s20.m2302c(android.app.Activity, on, android.widget.ScrollView, android.widget.ScrollView, android.widget.ScrollView, android.widget.ScrollView, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.view.View, h40, h40, int, java.lang.String, java.lang.String):android.widget.LinearLayout");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x004c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:325:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:335:0x016d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x01a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03fd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:346:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0398 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:363:0x034c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:364:0x033e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x03f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0760 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0756 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0239  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2303d(android.widget.ScrollView r50, android.widget.ScrollView r51, android.widget.ScrollView r52, android.widget.ScrollView r53, android.widget.LinearLayout r54, android.widget.LinearLayout r55, android.widget.LinearLayout r56, android.widget.LinearLayout r57, android.widget.LinearLayout r58, p000.C0565on r59, android.view.View r60, p000.h40 r61, p000.h40 r62, int r63, boolean r64) {
        /*
            Method dump skipped, instruction units count: 2602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.s20.m2303d(android.widget.ScrollView, android.widget.ScrollView, android.widget.ScrollView, android.widget.ScrollView, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, on, android.view.View, h40, h40, int, boolean):void");
    }
}
