package p000;

import android.R;
import android.app.Activity;
import android.app.C0986;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.graphics.drawable.C0987;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.window.C0990;
import androidx.activity.C0995;
import androidx.activity.C0996;
import androidx.activity.result.C0994;
import androidx.appcompat.view.menu.C0999;
import androidx.appcompat.widget.C1000;
import androidx.core.app.C1005;
import androidx.core.content.C1006;
import androidx.core.graphics.drawable.C1009;
import androidx.core.graphics.drawable.C1010;
import androidx.core.widget.C1011;
import androidx.legacy.content.C1014;
import androidx.startup.C1015;
import com.github.megatronking.stringfog.C1019;
import com.github.megatronking.stringfog.annotation.C1016;
import com.github.megatronking.stringfog.annotation.C1017;
import com.github.megatronking.stringfog.xor.C1018;
import com.google.android.material.appbar.C1020;
import com.google.android.material.behavior.C1022;
import com.google.android.material.bottomappbar.C1023;
import com.google.android.material.carousel.C1027;
import com.google.android.material.carousel.C1028;
import com.google.android.material.carousel.C1030;
import com.google.android.material.datepicker.C1031;
import com.google.android.material.datepicker.C1032;
import com.google.android.material.datepicker.C1033;
import com.google.android.material.datepicker.C1034;
import com.google.android.material.datepicker.C1036;
import com.google.android.material.internal.C1038;
import com.google.android.material.timepicker.C1043;
import com.google.android.material.timepicker.C1044;
import com.google.android.material.transformation.C1045;
import com.google.android.material.transformation.C1046;
import com.ljx.wechatmod.hook.C1049;
import io.fastkv.C1052;
import io.fastkv.C1053;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z20 {

    /* JADX INFO: renamed from: a */
    public static final z20 f5534a;

    static {
        int iM3002 = C1023.m3002("ۢۧ۟");
        while (true) {
            switch (iM3002) {
                case 56443:
                    return;
                case 56444:
                    f5534a = new z20();
                    iM3002 = C1052.f5699 > 0 ? C1049.f5696 + C1028.f5675 + 57403 : C1017.m2981("ۢۧ۟");
                    break;
                case 1749818:
                    "key_show_floating_entrance";
                    iM3002 = C1022.m3001("ۤ۠");
                    break;
                case 1750660:
                    if (C1045.f5692 - (C1018.f5665 * (-9001)) > 0) {
                        iM3002 = (C1043.f5690 ^ C1027.f5674) + 1750485;
                    } else {
                        C1059.m3144();
                        iM3002 = C1053.m3122("۟ۤۦ");
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m2784a(final Activity activity) {
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
        int iArgb;
        int i;
        final C0713sn c0713sn;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        AbstractC0493mp.m1857g("act", activity);
        C0417kn c0417kn = C0417kn.f2847a;
        String strM492a = "key_dark_mode";
        c0417kn.getClass();
        int iM1691b = C0417kn.m1691b(strM492a, 0);
        if (iM1691b == 1) {
            z = false;
        } else {
            if (iM1691b != 2) {
                if (Build.VERSION.SDK_INT >= 29) {
                    int i2 = activity.getResources().getConfiguration().uiMode;
                    if ((i2 & (i2 ^ (-49))) == 32) {
                    }
                }
                z = false;
            }
            z = true;
        }
        char c = C0417kn.m1691b("key_ui_layout_style", 0) >= 1 ? (char) 1 : (char) 0;
        String[] strArr = AbstractC0750tn.f4567a;
        "context";
        int i3 = c >= 1 ? 1 : 0;
        try {
            color = Color.parseColor(C0417kn.m1693d("key_custom_accent_color", "#00A4FF"));
        } catch (Exception e) {
            g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "UIFactory_ParseColor", "tw==\n", "0vI8ySRxU5w=\n");
            color = Color.parseColor("#00A4FF");
        }
        if (!g40.m1154q("HB9w6Fkoe+MaE2roXj557QU=\n", "d3oJtz1RFYI=\n", C0417kn.f2847a) || Build.VERSION.SDK_INT < 31) {
            color2 = color;
        } else {
            try {
                color2 = activity.getResources().getColor(R.color.system_accent1_500, activity.getTheme());
            } catch (Exception e2) {
                g40.m1152o("06ke\n", "p8h5VTpLcuY=\n", "UIFactory_SysColor", "tw==\n", "0vI8ySRxU5w=\n");
                color2 = color;
            }
        }
        C0417kn c0417kn2 = C0417kn.f2847a;
        String strM492a2 = "key_show_icons";
        c0417kn2.getClass();
        boolean zM1690a = C0417kn.m1690a(strM492a2, true);
        boolean zM1690a2 = C0417kn.m1690a("key_icon_tint_accent", false);
        String str17 = i3 + "_" + z + "_" + color2 + "_" + zM1690a + "_" + zM1690a2;
        ConcurrentHashMap concurrentHashMap = AbstractC0750tn.f4568b;
        C0713sn c0713sn2 = (C0713sn) concurrentHashMap.get(str17);
        if (c0713sn2 != null) {
            c0713sn = c0713sn2;
        } else {
            kb0 kb0Var = kb0.f2802k;
            int i4 = (color2 ^ (-256)) & color2;
            double dM1208w = g80.m1208w((((-16711681) ^ color2) & color2) >> 16);
            double dM1208w2 = g80.m1208w((((-65281) ^ color2) & color2) >> 8);
            double dM1208w3 = g80.m1208w(i4);
            double d = ((((0.35762064d * dM1208w2) - 14.0d) + (0.41233895d * dM1208w)) + 14.0d) - (0.0d - (0.18051042d * dM1208w3));
            double d2 = ((0.7152d * dM1208w2) - (0.0d - (0.2126d * dM1208w))) - (0.0d - (0.0722d * dM1208w3));
            double d3 = ((((dM1208w * 0.01932141d) + ((dM1208w2 * 0.11916382d) + 3.0d)) - 3.0d) + ((dM1208w3 * 0.95034478d) + 9.0d)) - 9.0d;
            double[][] dArr = g80.f1907a;
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
            double[] dArr5 = kb0Var.f2809g;
            double d13 = kb0Var.f2811i;
            double d14 = kb0Var.f2806d;
            double d15 = kb0Var.f2803a;
            double d16 = (((((d4 * d) + ((d5 * d2) + 0.0d)) - 0.0d) + ((d6 * d3) + 4.0d)) - 4.0d) * dArr5[0];
            double d17 = dArr5[1] * ((d9 * d3) - (0.0d - (((d7 * d) + ((d8 * d2) + 19.0d)) - 19.0d)));
            double d18 = (((d3 * d12) - 6.0d) + ((d2 * d11) - (0.0d - (d * d10))) + 6.0d) * dArr5[2];
            double d19 = kb0Var.f2810h;
            double dPow = Math.pow((Math.abs(d16) * d19) / 100.0d, 0.42d);
            double dPow2 = Math.pow((Math.abs(d17) * d19) / 100.0d, 0.42d);
            double dPow3 = Math.pow((d19 * Math.abs(d18)) / 100.0d, 0.42d);
            double dSignum = ((Math.signum(d16) * 400.0d) * dPow) / (27.13d - (0.0d - dPow));
            double dSignum2 = ((Math.signum(d17) * 400.0d) * dPow2) / (((dPow2 - 14.0d) + 27.13d) + 14.0d);
            double dSignum3 = ((Math.signum(d18) * 400.0d) * dPow3) / (27.13d - (0.0d - dPow3));
            double d20 = ((((0.0d - ((0.0d - ((-12.0d) * dSignum2)) - (11.0d * dSignum))) + 8.0d) + dSignum3) - 8.0d) / 11.0d;
            double d21 = ((((((4.0d + dSignum) + dSignum2) - 4.0d) + 25.0d) - (2.0d * dSignum3)) - 25.0d) / 9.0d;
            double d22 = 20.0d * dSignum2;
            double d23 = ((((21.0d * dSignum3) + 5.0d) + (0.0d - ((0.0d - (20.0d * dSignum)) - d22))) - 5.0d) / 20.0d;
            double d24 = (0.0d - ((0.0d - ((d22 + ((dSignum * 40.0d) + 13.0d)) - 13.0d)) - dSignum3)) / 20.0d;
            double degrees = Math.toDegrees(Math.atan2(d21, d20));
            if (degrees < 0.0d) {
                degrees = 0.0d - ((0.0d - degrees) - 360.0d);
            } else if (degrees >= 360.0d) {
                degrees = ((degrees - 23.0d) - 360.0d) + 23.0d;
            }
            double radians = Math.toRadians(degrees);
            double dPow4 = (Math.pow((d24 * kb0Var.f2804b) / d15, kb0Var.f2812j * d14) * 100.0d) / 100.0d;
            Math.sqrt(dPow4);
            double dPow5 = Math.pow(((((((3.8d - (0.0d - Math.cos(Math.toRadians(degrees < 20.14d ? 360.0d - (0.0d - degrees) : degrees) - (0.0d - 2.0d)))) * 0.25d) * 3846.153846153846d) * kb0Var.f2807e) * kb0Var.f2805c) * Math.hypot(d20, d21)) / (0.0d - ((0.0d - d23) - 0.305d)), 0.9d) * Math.pow(((1.64d + 26.0d) - Math.pow(0.29d, kb0Var.f2808f)) - 26.0d, 0.73d);
            double dSqrt = Math.sqrt(dPow4) * dPow5;
            Math.sqrt((dPow5 * d14) / (4.0d - (0.0d - d15)));
            Math.log1p(dSqrt * d13 * 0.0228d);
            Math.cos(radians);
            Math.sin(radians);
            int i5 = color2 >> 16;
            double dM1208w4 = g80.m1208w(i5 & (i5 ^ (-256)));
            int i6 = color2 >> 8;
            double d25 = AbstractC0498mu.m1900u(new double[]{dM1208w4, g80.m1208w(i6 & (i6 ^ (-256))), g80.m1208w(i4)}, g80.f1908b)[1] / 100.0d;
            if (d25 > 0.008856451679035631d) {
                Math.pow(d25, 0.3333333333333333d);
            }
            h70 h70VarM1359a = h70.m1359a(degrees, Math.max(dSqrt, 50.0d));
            h70 h70VarM1359a2 = h70.m1359a(degrees, 8.0d);
            h70 h70VarM1359a3 = h70.m1359a(degrees, 12.0d);
            int iM1360b = h70VarM1359a.m1360b(z ? 80 : 45);
            if (i3 == 1) {
                int iM1360b2 = h70VarM1359a2.m1360b(z ? 6 : 98);
                color3 = h70VarM1359a2.m1360b(z ? 12 : 95);
                color5 = h70VarM1359a3.m1360b(z ? 20 : 90);
                color6 = h70VarM1359a2.m1360b(z ? 95 : 15);
                int iArgb2 = z ? Color.argb(160, 255, 255, 255) : h70VarM1359a3.m1360b(40);
                color4 = 0;
                iArgb = iArgb2;
                i = iM1360b2;
            } else {
                if (z) {
                    str = "8f8V4oWeDg==\n";
                    str2 = "0s8l0rWuPmQ=\n";
                } else {
                    str = "Pc2V6S/Rlw==\n";
                    str2 = "HoumrxuXoaE=\n";
                }
                int color7 = Color.parseColor(b50.m492a(str, str2));
                if (z) {
                    str3 = "wfK+TUArqg==\n";
                    str4 = "4sP9fAMa70Q=\n";
                } else {
                    str3 = "y41XrwBgPg==\n";
                    str4 = "6MsR6UYmeDY=\n";
                }
                color3 = Color.parseColor(b50.m492a(str3, str4));
                if (z) {
                    str5 = "AqMSnowBCNNn\n";
                    str6 = "IZIg2MpHTpU=\n";
                } else {
                    str5 = "oxKi1K5tXKKw\n";
                    str6 = "gCLj5J5dbJI=\n";
                }
                color4 = Color.parseColor(b50.m492a(str5, str6));
                if (z) {
                    str7 = "Mz+z9aO6Cg==\n";
                    str8 = "EA2Fx5WIMo8=\n";
                } else {
                    str7 = "VSAt6oUVnA==\n";
                    str8 = "dmUYr7BQ3cs=\n";
                }
                color5 = Color.parseColor(b50.m492a(str7, str8));
                if (z) {
                    str9 = "0YDf0CxjPQ==\n";
                    str10 = "8saZlmole9g=\n";
                } else {
                    str9 = "dweTzqE7cg==\n";
                    str10 = "VDai/5AKQ+I=\n";
                }
                color6 = Color.parseColor(b50.m492a(str9, str10));
                iArgb = z ? Color.argb(160, 255, 255, 255) : Color.parseColor("#8E8E93");
                i = color7;
            }
            boolean z2 = (i3 & (-2)) | ((i3 ^ (-1)) & 1);
            C0713sn c0713sn3 = new C0713sn(i3, i, color3, color4, color6, iArgb, iM1360b, color5, Color.argb(i3 == 1 ? 35 : 20, Color.red(iM1360b), Color.green(iM1360b), Color.blue(iM1360b)), AbstractC0493mp.m1866p(i3 == 1 ? 28.0f : 24.0f), i3 == 1 ? 0.0f : AbstractC0493mp.m1866p(12.0f), z2, z2, zM1690a, zM1690a2, z);
            concurrentHashMap.put(str17, c0713sn3);
            c0713sn = c0713sn3;
        }
        int i7 = c0713sn.f4346g;
        int i8 = c0713sn.f4345f;
        boolean z3 = c0713sn.f4355p;
        int i9 = c0713sn.f4342c;
        int i10 = c0713sn.f4340a;
        final Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(0);
        frameLayout.setOnClickListener(new ViewOnClickListenerC0177e7(dialog, 14));
        final int i11 = (int) (((double) activity.getResources().getDisplayMetrics().heightPixels) * 0.95d);
        final LinearLayout linearLayoutM1144g = g40.m1144g(activity, 1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i11);
        layoutParams.gravity = 80;
        linearLayoutM1144g.setLayoutParams(layoutParams);
        linearLayoutM1144g.setClickable(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(c0713sn.f4341b);
        float f = c0713sn.f4349j;
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f});
        linearLayoutM1144g.setBackground(gradientDrawable);
        int i12 = Build.VERSION.SDK_INT;
        linearLayoutM1144g.setOutlineProvider(new C0250g6(6, c0713sn));
        linearLayoutM1144g.setClipToOutline(true);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view = new View(activity);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC0493mp.m1867q(36), AbstractC0493mp.m1867q(5));
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = AbstractC0493mp.m1867q(16);
        layoutParams2.bottomMargin = AbstractC0493mp.m1867q(16);
        view.setLayoutParams(layoutParams2);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(i8);
        gradientDrawable2.setAlpha(80);
        gradientDrawable2.setCornerRadius(AbstractC0493mp.m1866p(10.0f));
        view.setBackground(gradientDrawable2);
        frameLayout2.addView(view);
        linearLayoutM1144g.addView(frameLayout2);
        frameLayout2.setOnTouchListener(new y20(i11, dialog, linearLayoutM1144g));
        FrameLayout frameLayout3 = new FrameLayout(activity);
        frameLayout3.setPadding(AbstractC0493mp.m1867q(24), AbstractC0493mp.m1867q(0), AbstractC0493mp.m1867q(24), AbstractC0493mp.m1867q(20));
        TextView textView = new TextView(activity);
        g40.m1151n("wt2F2Q==\n", "hbjgsgZUJjo=\n", textView, 20.0f, i7);
        textView.setTypeface(AbstractC0639qn.f3927a, 3);
        textView.setPadding(AbstractC0493mp.m1867q(20), AbstractC0493mp.m1867q(8), AbstractC0493mp.m1867q(20), AbstractC0493mp.m1867q(8));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(i9);
        gradientDrawable3.setCornerRadius(AbstractC0493mp.m1866p(100.0f));
        textView.setBackground(gradientDrawable3);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 8388627;
        textView.setLayoutParams(layoutParams3);
        textView.setOnClickListener(new ViewOnClickListenerC0214f7(textView, dialog, 1));
        frameLayout3.addView(textView);
        TextView textView2 = new TextView(activity);
        g40.m1151n("Vwzv\n", "uItZbjc828c=\n", textView2, 20.0f, i8);
        Typeface typeface = C0075bo.f745a;
        Typeface typeface2 = C0075bo.f745a;
        if (typeface2 != null) {
            textView2.setTypeface(typeface2);
        }
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(i9);
        gradientDrawable4.setShape(1);
        textView2.setBackground(gradientDrawable4);
        textView2.setGravity(17);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC0493mp.m1867q(40), AbstractC0493mp.m1867q(40));
        layoutParams4.gravity = 8388629;
        textView2.setLayoutParams(layoutParams4);
        textView2.setOnClickListener(new ViewOnClickListenerC0918y5(activity, 6, c0713sn));
        C0075bo.m526c(textView2, c0713sn);
        frameLayout3.addView(textView2);
        linearLayoutM1144g.addView(frameLayout3);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        frameLayout4.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        int iM1867q = i10 == 0 ? AbstractC0493mp.m1867q(120) : AbstractC0493mp.m1867q(90);
        final ScrollView scrollViewM2785b = m2785b(activity, iM1867q);
        scrollViewM2785b.setVisibility(0);
        final ScrollView scrollViewM2785b2 = m2785b(activity, iM1867q);
        scrollViewM2785b2.setVisibility(8);
        final ScrollView scrollViewM2785b3 = m2785b(activity, iM1867q);
        scrollViewM2785b3.setVisibility(8);
        final ScrollView scrollViewM2785b4 = m2785b(activity, iM1867q);
        scrollViewM2785b4.setVisibility(8);
        final LinearLayout linearLayoutM1144g2 = g40.m1144g(activity, 1);
        linearLayoutM1144g2.setPadding(0, AbstractC0493mp.m1867q(8), 0, AbstractC0493mp.m1867q(24));
        final LinearLayout linearLayoutM1144g3 = g40.m1144g(activity, 1);
        linearLayoutM1144g3.setPadding(0, AbstractC0493mp.m1867q(8), 0, AbstractC0493mp.m1867q(24));
        final LinearLayout linearLayoutM1144g4 = g40.m1144g(activity, 1);
        linearLayoutM1144g4.setPadding(0, AbstractC0493mp.m1867q(8), 0, AbstractC0493mp.m1867q(24));
        final LinearLayout linearLayoutM1144g5 = g40.m1144g(activity, 1);
        linearLayoutM1144g5.setPadding(0, AbstractC0493mp.m1867q(8), 0, AbstractC0493mp.m1867q(24));
        scrollViewM2785b.addView(linearLayoutM1144g2);
        scrollViewM2785b2.addView(linearLayoutM1144g3);
        scrollViewM2785b3.addView(linearLayoutM1144g4);
        scrollViewM2785b4.addView(linearLayoutM1144g5);
        frameLayout4.addView(scrollViewM2785b);
        frameLayout4.addView(scrollViewM2785b2);
        frameLayout4.addView(scrollViewM2785b3);
        frameLayout4.addView(scrollViewM2785b4);
        linearLayoutM1144g.addView(frameLayout4);
        "act";
        "dialog";
        "theme";
        "coreContainer";
        "chatContainer";
        "appearanceContainer";
        "privacyContainer";
        final int i13 = 0;
        C0075bo.m524a(activity, linearLayoutM1144g2, g80.m1193h("bcf2fbbfc7cdbcfbdcbcc4ec"), c0713sn, new InterfaceC0786um(activity, c0713sn, dialog, i13) { // from class: a30

            /* JADX INFO: renamed from: a */
            public final int f19a;

            /* JADX INFO: renamed from: b */
            public final Activity f20b;

            /* JADX INFO: renamed from: c */
            public final C0713sn f21c;

            /* JADX INFO: renamed from: d */
            public final Dialog f22d;

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0013. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0058 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:38:0x004c A[SYNTHETIC] */
            {
                /*
                    r3 = this;
                    r3.f19a = r7
                    r3.f20b = r4
                    r3.f21c = r5
                    r3.f22d = r6
                    r3.<init>()
                    r0 = 0
                    java.lang.String r1 = "ۤۧۡ"
                    int r2 = com.google.android.material.floatingactionbutton.C1037.m3059(r1)
                    r1 = r0
                L13:
                    switch(r2) {
                        case 56508: goto L17;
                        case 1749822: goto L18;
                        case 1751742: goto L2c;
                        case 1752673: goto L78;
                        case 1752676: goto L46;
                        case 1755497: goto L63;
                        default: goto L16;
                    }
                L16:
                    goto L13
                L17:
                    return
                L18:
                    int r0 = androidx.activity.result.C0992.f5639
                    int r2 = com.google.android.material.appbar.C1020.f5667
                    r2 = r2 | 3529(0xdc9, float:4.945E-42)
                    int r0 = r0 + r2
                    if (r0 < 0) goto L29
                    java.lang.String r0 = "ۥۡۦ"
                L23:
                    int r0 = p000.C1058.m3140(r0)
                    r2 = r0
                    goto L13
                L29:
                    java.lang.String r0 = "ۤۧۡ"
                    goto L23
                L2c:
                    int r0 = com.ljx.wechatmod.p001ui.C1051.m3112()
                    if (r0 > 0) goto L46
                    int r0 = androidx.core.app.C1005.f5652
                    int r2 = com.google.android.material.carousel.C1028.f5675
                    r2 = r2 ^ 4411(0x113b, float:6.181E-42)
                    int r0 = r0 / r2
                    if (r0 == 0) goto L87
                    com.google.android.material.internal.C1038.m3062()
                    java.lang.String r0 = "ۦۢ"
                    int r0 = android.support.v4.graphics.drawable.C0987.m2861(r0)
                    r2 = r0
                    goto L13
                L46:
                    int r0 = androidx.coordinatorlayout.widget.C1003.m2923()
                    if (r0 < 0) goto L58
                    r0 = 51
                    com.google.android.material.transformation.C1045.f5692 = r0
                    java.lang.String r0 = "۟۠ۥ"
                    int r0 = androidx.activity.result.C0992.m2881(r0)
                    r2 = r0
                    goto L13
                L58:
                    int r0 = com.github.megatronking.stringfog.annotation.C1017.f5664
                    int r2 = androidx.appcompat.widget.C1000.f5647
                    int r0 = r0 + r2
                    r2 = 56237(0xdbad, float:7.8805E-41)
                    int r0 = r0 + r2
                    r2 = r0
                    goto L13
                L63:
                    java.lang.String r0 = "o5FLk"
                    java.lang.String r0 = androidx.legacy.content.C1014.m2967(r0)
                    int r0 = java.lang.Integer.parseInt(r0)
                    int r1 = androidx.core.graphics.drawable.C1010.f5657
                    int r2 = androidx.core.content.C1008.f5655
                    int r1 = r1 + r2
                    r2 = -1751717(0xffffffffffe5455b, float:NaN)
                    r2 = r2 ^ r1
                    r1 = r0
                    goto L13
                L78:
                    java.io.PrintStream r0 = java.lang.System.out
                    r0.println(r1)
                    int r0 = androidx.core.content.C1008.m2943()
                    if (r0 < 0) goto L8f
                    r0 = 81
                    com.google.android.material.datepicker.C1036.f5683 = r0
                L87:
                    java.lang.String r0 = "ۨۤۥ"
                    int r0 = com.google.android.material.datepicker.C1033.m3042(r0)
                    r2 = r0
                    goto L13
                L8f:
                    int r0 = androidx.core.content.C1007.f5654
                    int r2 = androidx.activity.result.C0992.f5639
                    int r0 = r0 - r2
                    r2 = 54735(0xd5cf, float:7.67E-41)
                    int r0 = r0 + r2
                    r2 = r0
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.a30.<init>(android.app.Activity, sn, android.app.Dialog, int):void");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x003e. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:100:0x0326  */
            /* JADX WARN: Removed duplicated region for block: B:210:0x027f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:215:0x0275 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:98:0x031a  */
            /* JADX INFO: renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m23a(java.lang.Object r55) {
                /*
                    Method dump skipped, instruction units count: 1448
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.a30.m23a(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x003e. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:175:0x02df A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:177:0x02d7 A[SYNTHETIC] */
            /* JADX INFO: renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m24b(java.lang.Object r58) {
                /*
                    Method dump skipped, instruction units count: 1510
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.a30.m24b(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0066. Please report as an issue. */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:239:0x02a5 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:242:0x0297 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:77:0x03e1  */
            /* JADX WARN: Removed duplicated region for block: B:78:0x03ef  */
            /* JADX WARN: Type inference failed for: r2v154 */
            /* JADX WARN: Type inference failed for: r2v155 */
            /* JADX WARN: Type inference failed for: r2v4 */
            /* JADX WARN: Type inference failed for: r67v0 */
            /* JADX WARN: Type inference failed for: r67v1 */
            /* JADX WARN: Type inference failed for: r67v2 */
            /* JADX WARN: Type inference failed for: r67v3 */
            /* JADX WARN: Type inference failed for: r67v4 */
            /* JADX WARN: Type inference failed for: r67v5 */
            /* JADX INFO: renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private final java.lang.Object m25c(java.lang.Object r80) {
                /*
                    Method dump skipped, instruction units count: 2354
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.a30.m25c(java.lang.Object):java.lang.Object");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:39:0x066b. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:496:0x1fd1  */
            /* JADX WARN: Removed duplicated region for block: B:497:0x1fd9  */
            /* JADX WARN: Removed duplicated region for block: B:709:0x0b2f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:710:0x0b1d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:724:0x06b8 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:733:0x0990 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:734:0x0982 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:735:0x1c8d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:737:0x1c85 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:738:0x1dc9 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:739:0x1dbc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:740:0x1e0f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:741:0x1e02 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:743:0x1e6b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:745:0x1e5d A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:747:0x207a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:752:0x2058 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:753:0x06ae A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:755:0x0cf9 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:763:0x2060 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:782:0x1bfb A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:784:0x1bf1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:820:0x0fc0 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:822:0x2170 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:824:0x2163 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:832:0x0cdc A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:833:0x0cce A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:834:0x0cf1 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:840:0x2195 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:842:0x2185 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:846:0x2086 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:850:0x1c1e A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:851:0x1c0b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:862:0x0fb9 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:881:0x10ee A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:882:0x10df A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:894:0x177b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:896:0x1767 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:926:0x1da9 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:928:0x1d9a A[SYNTHETIC] */
            @Override // p000.InterfaceC0786um
            /* JADX INFO: renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo26f(java.lang.Object r144) {
                /*
                    Method dump skipped, instruction units count: 9438
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.a30.mo26f(java.lang.Object):java.lang.Object");
            }
        });
        final int i14 = 1;
        C0075bo.m524a(activity, linearLayoutM1144g2, g80.m1193h("bcfae2bfe5d9bfd7d5b2f4f4"), c0713sn, new InterfaceC0786um(activity, c0713sn, i14) { // from class: f30

            /* JADX INFO: renamed from: a */
            public final int f1725a;

            /* JADX INFO: renamed from: b */
            public final Activity f1726b;

            /* JADX INFO: renamed from: c */
            public final C0713sn f1727c;

            {
                this.f1725a = i14;
                this.f1726b = activity;
                this.f1727c = c0713sn;
                Double dDecode = null;
                int iM3036 = C1031.m3036("ۨۥۥ");
                while (true) {
                    switch (iM3036) {
                        case 56323:
                            System.out.println(dDecode);
                            iM3036 = (C1006.f5653 - C1005.f5652) + 1753093;
                            continue;
                        case 1746813:
                            if (C1018.f5665 / (C1036.f5683 | (-4444)) != 0) {
                                iM3036 = C1030.m3032("ۨ۟ۡ");
                            } else {
                                iM3036 = (C0990.f5637 - C1020.f5667) + 1754645;
                                continue;
                            }
                            break;
                        case 1747745:
                            dDecode = Double.decode(C1058.m3143("KpzlyqJ2sSDgG7CiXu4"));
                            if ((C1049.f5696 ^ (C1018.f5665 - 9397)) <= 0) {
                            }
                            iM3036 = C1028.m3025("ۣ۠");
                            continue;
                        case 1749601:
                            break;
                        case 1753606:
                            return;
                        case 1755528:
                            if (C1006.m2937() >= 0) {
                                iM3036 = (C1016.f5663 * C0999.f5646) + 1713061;
                            }
                            break;
                    }
                    if (C1009.f5656 >= 0) {
                        C0995.m2892();
                        iM3036 = C1020.m2993("ۣۣۨ");
                    } else {
                        iM3036 = C1028.f5675 + C1000.f5647 + 1753130;
                    }
                }
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00ce. Please report as an issue. */
            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0078. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:114:0x0730  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:199:0x0683 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:200:0x0676 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:201:0x076b A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:203:0x0763 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:234:0x0721 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:236:0x0715 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:237:0x07ba A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:239:0x07b3 A[SYNTHETIC] */
            @Override // p000.InterfaceC0786um
            /* JADX INFO: renamed from: f */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object mo26f(java.lang.Object r73) {
                /*
                    Method dump skipped, instruction units count: 2416
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.f30.mo26f(java.lang.Object):java.lang.Object");
            }
        });
        final int i15 = 4;
        C0075bo.m524a(activity, linearLayoutM1144g2, g80.m1193h("b2e4dfbfd0f3bee2d4bff4c4bfcad7"), c0713sn, new InterfaceC0786um
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x045a: INVOKE 
              (r48v0 'activity' android.app.Activity)
              (r10v91 'linearLayoutM1144g2' android.widget.LinearLayout)
              (wrap:java.lang.String:0x0447: INVOKE 
              (wrap:java.lang.String:0x0443: INVOKE ("3vejFuowgo3Y9aAR7DOF2djxpEToYoPf3qOlQ+ph
            "), ("vMXGIo5W4Os=
            ") STATIC call: b50.a(java.lang.String, java.lang.String):java.lang.String A[MD:(java.lang.String, java.lang.String):java.lang.String (m), WRAPPED])
             STATIC call: g80.h(java.lang.String):java.lang.String A[MD:(java.lang.String):java.lang.String (m), WRAPPED])
              (r5v13 'c0713sn' sn)
              (wrap:um:0x0455: CONSTRUCTOR 
              (r48v0 'activity' android.app.Activity A[DONT_INLINE])
              (r5v13 'c0713sn' sn A[DONT_INLINE])
              (r33v0 'dialog' android.app.Dialog A[DONT_INLINE])
              (r19v8 'i15' int A[DONT_INLINE])
             A[MD:(android.app.Activity, sn, android.app.Dialog, int):void (m), WRAPPED] call: a30.<init>(android.app.Activity, sn, android.app.Dialog, int):void type: CONSTRUCTOR)
             STATIC call: bo.a(android.app.Activity, android.widget.LinearLayout, java.lang.String, sn, um):void A[MD:(android.app.Activity, android.widget.LinearLayout, java.lang.String, sn, um):void (m)] in method: z20.a(android.app.Activity):void, file: classes.dex
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
            Method dump skipped, instruction units count: 3412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z20.m2784a(android.app.Activity):void");
    }

    /* JADX INFO: renamed from: b */
    public static final ScrollView m2785b(Activity activity, int i) {
        String str;
        ViewOnTouchListenerC0251g7 viewOnTouchListenerC0251g7;
        String str2;
        int iM3032 = C1030.m3032("ۧۢۦ");
        ViewOnTouchListenerC0251g7 viewOnTouchListenerC0251g72 = null;
        ScrollView scrollView = null;
        while (true) {
            switch (iM3032) {
                case 1746908:
                    viewOnTouchListenerC0251g7 = new ViewOnTouchListenerC0251g7(C0994.f5641 ^ 412);
                    if (C0986.f5633 > 0) {
                        str = "ۥۤ۟";
                    } else {
                        C0987.m2860();
                        iM3032 = C1044.m3085("۠ۡۡ");
                        viewOnTouchListenerC0251g72 = viewOnTouchListenerC0251g7;
                    }
                    break;
                case 1747712:
                    scrollView.setPadding(0, 0, 0, i);
                    iM3032 = C1016.f5663 + C1010.f5657 + 1747793;
                    continue;
                case 1747867:
                    if (C1031.m3037() <= 0) {
                        C1015.m2972();
                        iM3032 = C0987.m2861("ۢۤۨ");
                    } else {
                        iM3032 = (C1014.f5661 / C1019.f5666) ^ 1754475;
                        continue;
                    }
                    break;
                case 1749636:
                    scrollView.setVerticalScrollBarEnabled(false);
                    iM3032 = (C1034.f5681 / C1006.f5653) ^ 1752483;
                    continue;
                case 1751681:
                    return scrollView;
                case 1752489:
                    scrollView.setOverScrollMode(C1046.f5693 ^ (-181));
                    if (C1023.m3003() >= 0) {
                        C1019.m2988();
                        iM3032 = C0999.m2906("ۤۥۢ");
                    } else {
                        iM3032 = C0996.m2894("ۥۣۣ");
                        continue;
                    }
                    break;
                case 1752581:
                    scrollView.setClipToPadding(false);
                    str = "۠ۡۡ";
                    viewOnTouchListenerC0251g7 = viewOnTouchListenerC0251g72;
                    break;
                case 1752608:
                    viewOnTouchListenerC0251g72.f1898c = -1.0f;
                    if (C1033.f5680 <= 0) {
                        C0990.m2872();
                        str2 = "ۥۤ۟";
                    } else {
                        str2 = "ۥۧۡ";
                    }
                    iM3032 = C1034.m3046(str2);
                    continue;
                case 1752703:
                    scrollView.setOnTouchListener(viewOnTouchListenerC0251g72);
                    if (C1028.m3022() <= 0) {
                        C1038.f5685 = 82;
                        iM3032 = C1019.m2989("ۥ۠ۤ");
                    } else {
                        iM3032 = (C0994.f5641 % C1027.f5674) + 1751266;
                        continue;
                    }
                    break;
                case 1754475:
                    scrollView = new ScrollView(activity);
                    if (C1032.m3040() < 0) {
                        iM3032 = C1019.m2989("ۣۢۡ");
                    } else {
                        C1030.m3031();
                        str = "ۧۢۦ";
                        viewOnTouchListenerC0251g7 = viewOnTouchListenerC0251g72;
                    }
                    break;
            }
            iM3032 = C1011.m2955(str);
            viewOnTouchListenerC0251g72 = viewOnTouchListenerC0251g7;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0020. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.widget.LinearLayout m2786c(android.app.Activity r28, final p000.C0713sn r29, final android.widget.ScrollView r30, final android.widget.ScrollView r31, final android.widget.ScrollView r32, final android.widget.ScrollView r33, final android.widget.LinearLayout r34, final android.widget.LinearLayout r35, final android.widget.LinearLayout r36, final android.widget.LinearLayout r37, final android.widget.LinearLayout r38, final android.view.View r39, final p000.o40 r40, final p000.o40 r41, final int r42, java.lang.String r43, java.lang.String r44) {
        /*
            Method dump skipped, instruction units count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z20.m2786c(android.app.Activity, sn, android.widget.ScrollView, android.widget.ScrollView, android.widget.ScrollView, android.widget.ScrollView, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.view.View, o40, o40, int, java.lang.String, java.lang.String):android.widget.LinearLayout");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0048. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0636 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x05a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0596 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x08c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x08b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x08af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:374:0x08a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0944 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0940 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0631 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x07f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07ee A[SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2787d(android.widget.ScrollView r46, android.widget.ScrollView r47, android.widget.ScrollView r48, android.widget.ScrollView r49, android.widget.LinearLayout r50, android.widget.LinearLayout r51, android.widget.LinearLayout r52, android.widget.LinearLayout r53, android.widget.LinearLayout r54, p000.C0713sn r55, android.view.View r56, p000.o40 r57, p000.o40 r58, int r59, boolean r60) {
        /*
            Method dump skipped, instruction units count: 2680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.z20.m2787d(android.widget.ScrollView, android.widget.ScrollView, android.widget.ScrollView, android.widget.ScrollView, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, android.widget.LinearLayout, sn, android.view.View, o40, o40, int, boolean):void");
    }
}
