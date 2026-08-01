package p000;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import io.github.libxposed.api.XposedModule;
import io.github.libxposed.api.XposedModuleInterface;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p000.C0695rn;
import p000.m90;
import p000.n90;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class kf1 extends XposedModule {

    /* JADX INFO: renamed from: G */
    public static final C0391a f3100G = new C0391a(null);

    /* JADX INFO: renamed from: H */
    public static final int f3101H = 8;

    /* JADX INFO: renamed from: I */
    private static volatile kf1 f3102I = null;

    /* JADX INFO: renamed from: J */
    private static volatile boolean f3103J = false;

    /* JADX INFO: renamed from: K */
    private static final String f3104K = "DBF2DDFE68DC6C3D7BDBD1C70AAE13993F50FA99B51D6F0C668A284EE9E6FDCD";

    /* JADX INFO: renamed from: L */
    private static final String f3105L = "F375F0F6AF7C94C364B35CD6F6A66D64AEFAE66E32F935B48773C0FAAD04C121";

    /* JADX INFO: renamed from: A */
    private boolean f3106A;

    /* JADX INFO: renamed from: B */
    private boolean f3107B;

    /* JADX INFO: renamed from: C */
    private boolean f3108C;

    /* JADX INFO: renamed from: D */
    private boolean f3109D;

    /* JADX INFO: renamed from: E */
    private boolean f3110E;

    /* JADX INFO: renamed from: F */
    private boolean f3111F;

    /* JADX INFO: renamed from: a */
    private boolean f3112a;

    /* JADX INFO: renamed from: b */
    private boolean f3113b;

    /* JADX INFO: renamed from: c */
    private boolean f3114c;

    /* JADX INFO: renamed from: n */
    private final u60 f3125n;

    /* JADX INFO: renamed from: o */
    private final u60 f3126o;

    /* JADX INFO: renamed from: p */
    private final u60 f3127p;

    /* JADX INFO: renamed from: q */
    private final u60 f3128q;

    /* JADX INFO: renamed from: s */
    private ClassLoader f3130s;

    /* JADX INFO: renamed from: t */
    private String f3131t;

    /* JADX INFO: renamed from: u */
    private String f3132u;

    /* JADX INFO: renamed from: v */
    private String f3133v;

    /* JADX INFO: renamed from: w */
    private long f3134w;

    /* JADX INFO: renamed from: x */
    private String f3135x;

    /* JADX INFO: renamed from: y */
    private String f3136y;

    /* JADX INFO: renamed from: z */
    private boolean f3137z;

    /* JADX INFO: renamed from: d */
    private final u60 f3115d = new x51(new cc1(29));

    /* JADX INFO: renamed from: e */
    private final u60 f3116e = new x51(new cc1(20));

    /* JADX INFO: renamed from: f */
    private final u60 f3117f = new x51(new cc1(21));

    /* JADX INFO: renamed from: g */
    private final u60 f3118g = new x51(new cc1(22));

    /* JADX INFO: renamed from: h */
    private final u60 f3119h = new x51(new cc1(23));

    /* JADX INFO: renamed from: i */
    private final u60 f3120i = new x51(new cc1(24));

    /* JADX INFO: renamed from: j */
    private final u60 f3121j = new x51(new cc1(25));

    /* JADX INFO: renamed from: k */
    private final u60 f3122k = new x51(new cc1(26));

    /* JADX INFO: renamed from: l */
    private final u60 f3123l = new x51(new cc1(27));

    /* JADX INFO: renamed from: m */
    private final u60 f3124m = new x51(new cc1(28));

    /* JADX INFO: renamed from: r */
    private final u60 f3129r = new x51(new cc1(19));

    /* JADX INFO: renamed from: kf1$b */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0392b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f3138a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0392b(float f) {
            this.f3138a = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            view.getClass();
            outline.getClass();
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f3138a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kf1() {
        final int i = 0;
        this.f3125n = new x51(new InterfaceC0298hw() { // from class: jf1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return kf1.m1816N();
                    case 1:
                        return kf1.m1796D();
                    case 2:
                        return kf1.m1798E();
                    default:
                        return kf1.m1822Q();
                }
            }
        });
        final int i2 = 1;
        this.f3126o = new x51(new InterfaceC0298hw() { // from class: jf1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return kf1.m1816N();
                    case 1:
                        return kf1.m1796D();
                    case 2:
                        return kf1.m1798E();
                    default:
                        return kf1.m1822Q();
                }
            }
        });
        final int i3 = 2;
        this.f3127p = new x51(new InterfaceC0298hw() { // from class: jf1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return kf1.m1816N();
                    case 1:
                        return kf1.m1796D();
                    case 2:
                        return kf1.m1798E();
                    default:
                        return kf1.m1822Q();
                }
            }
        });
        final int i4 = 3;
        this.f3128q = new x51(new InterfaceC0298hw() { // from class: jf1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return kf1.m1816N();
                    case 1:
                        return kf1.m1796D();
                    case 2:
                        return kf1.m1798E();
                    default:
                        return kf1.m1822Q();
                }
            }
        });
        f3102I = this;
        lb0.f3404a.m2018g(this);
        this.f3135x = "unknown";
        this.f3136y = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m1791A0(kf1 kf1Var, Activity activity, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = null;
        }
        kf1Var.m1885z0(activity);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B0 */
    private final void m1793B0() {
        String str = this.f3132u;
        if (str == null) {
            return;
        }
        try {
            AbstractC0627pt.m3157d0("30121|" + this.f3134w + "|" + this.f3135x + "|" + this.f3136y, new File(str, "files/xp1_scan_suppress"));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C0 */
    private final void m1795C0(final Activity activity) {
        final C0695rn.a aVarM1430K;
        this.f3114c = true;
        C0289hn c0289hn = C0289hn.f2299a;
        if (!c0289hn.m1431L() || (aVarM1430K = c0289hn.m1430K()) == null || m1817N0()) {
            return;
        }
        final float f = activity.getResources().getDisplayMetrics().density;
        boolean z = (activity.getResources().getConfiguration().uiMode & 48) == 32;
        int iArgb = z ? Color.argb(255, 30, 30, 35) : -1;
        final int i = z ? -1 : -16777216;
        final int iArgb2 = z ? Color.argb(200, 200, 200, 210) : -7829368;
        final int iM3939U = aVarM1430K.m3939U();
        final int iM3920B = aVarM1430K.m3920B();
        final int i2 = iM3939U - iM3920B;
        boolean z2 = iM3920B >= iM3939U;
        final long jM1433O = c0289hn.m1433O();
        final int i3 = iArgb;
        final boolean z3 = z2;
        m1851i0().post(new Runnable() { // from class: if1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                kf1.m1797D0(activity, this, f, i, i3, z3, aVarM1430K, false, jM1433O, iArgb2, iM3939U, iM3920B, i2);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final String m1796D() {
        return "C*";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public static final void m1797D0(final Activity activity, final kf1 kf1Var, final float f, final int i, final int i2, final boolean z, final C0695rn.a aVar, final boolean z2, final long j, final int i3, final int i4, final int i5, final int i6) {
        try {
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(17);
                linearLayout.setPadding(0, 0, 0, kf1Var.m1841d0(16, f));
                TextView textView = new TextView(activity);
                textView.setText("挖红薯呀-WHS");
                textView.setTextSize(22.0f);
                textView.setTextColor(i);
                Typeface typeface = Typeface.DEFAULT_BOLD;
                textView.setTypeface(typeface);
                linearLayout.addView(textView);
                TextView textView2 = new TextView(activity);
                textView2.setText("3.0");
                textView2.setTextSize(13.0f);
                textView2.setTextColor(-1);
                textView2.setTypeface(typeface);
                textView2.setGravity(17);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(kf1Var.m1841d0(4, f));
                gradientDrawable.setColor(Color.argb(255, 33, 150, 243));
                textView2.setBackground(gradientDrawable);
                textView2.setPadding(kf1Var.m1841d0(8, f), kf1Var.m1841d0(3, f), kf1Var.m1841d0(8, f), kf1Var.m1841d0(3, f));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(kf1Var.m1841d0(8, f), 0, 0, 0);
                textView2.setLayoutParams(layoutParams);
                linearLayout.addView(textView2);
                TextView textView3 = new TextView(activity);
                textView3.setText("您好呀，挖呀挖呀挖...");
                textView3.setTextSize(18.0f);
                textView3.setTextColor(Color.parseColor("#E65100"));
                textView3.setGravity(17);
                textView3.setPadding(0, kf1Var.m1841d0(8, f), 0, kf1Var.m1841d0(12, f));
                ProgressBar progressBar = new ProgressBar(activity);
                progressBar.setIndeterminate(true);
                progressBar.setPadding(kf1Var.m1841d0(40, f), kf1Var.m1841d0(8, f), kf1Var.m1841d0(40, f), kf1Var.m1841d0(8, f));
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(1);
                linearLayout2.setGravity(17);
                linearLayout2.setBackgroundColor(i2);
                linearLayout2.setPadding(kf1Var.m1841d0(32, f), kf1Var.m1841d0(24, f), kf1Var.m1841d0(32, f), kf1Var.m1841d0(24, f));
                linearLayout2.addView(linearLayout);
                linearLayout2.addView(textView3);
                linearLayout2.addView(progressBar);
                final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayout2).setCancelable(false).create();
                alertDialogCreate.setCanceledOnTouchOutside(false);
                Window window = alertDialogCreate.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                alertDialogCreate.show();
                kf1Var.m1813L0(alertDialogCreate, 28, f);
                kf1Var.m1851i0().postDelayed(new Runnable() { // from class: gf1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        kf1.m1799E0(activity, alertDialogCreate, z, aVar, kf1Var, f, i, z2, j, i3, i4, i5, i6, i2);
                    }
                }, 1500L);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final String m1798E() {
        return "C+";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E0 */
    public static final void m1799E0(Activity activity, AlertDialog alertDialog, boolean z, C0695rn.a aVar, final kf1 kf1Var, float f, int i, boolean z2, long j, int i2, int i3, int i4, int i5, int i6) {
        try {
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            try {
                alertDialog.dismiss();
            } catch (Exception unused) {
            }
            String str = z ? "✅ 适配成功" : "⚠️ 适配不完整";
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(17);
            linearLayout.setPadding(0, 0, 0, kf1Var.m1841d0(12, f));
            TextView textView = new TextView(activity);
            textView.setText("挖红薯呀-WHS");
            textView.setTextSize(20.0f);
            textView.setTextColor(i);
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView.setTypeface(typeface);
            linearLayout.addView(textView);
            TextView textView2 = new TextView(activity);
            textView2.setText("3.0");
            textView2.setTextSize(12.0f);
            textView2.setTextColor(-1);
            textView2.setTypeface(typeface);
            textView2.setGravity(17);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(kf1Var.m1841d0(4, f));
            gradientDrawable.setColor(Color.argb(255, 33, 150, 243));
            textView2.setBackground(gradientDrawable);
            textView2.setPadding(kf1Var.m1841d0(6, f), kf1Var.m1841d0(2, f), kf1Var.m1841d0(6, f), kf1Var.m1841d0(2, f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(kf1Var.m1841d0(8, f), 0, 0, 0);
            textView2.setLayoutParams(layoutParams);
            linearLayout.addView(textView2);
            TextView textView3 = new TextView(activity);
            textView3.setText(str);
            textView3.setTextSize(20.0f);
            textView3.setTextColor((z || z2) ? Color.parseColor("#2E7D32") : Color.parseColor("#E65100"));
            textView3.setGravity(17);
            textView3.setPadding(0, kf1Var.m1841d0(6, f), 0, kf1Var.m1841d0(4, f));
            TextView textView4 = new TextView(activity);
            textView4.setText("耗时 " + j + "ms");
            textView4.setTextSize(13.0f);
            textView4.setTextColor(i2);
            textView4.setGravity(17);
            TextView textView5 = new TextView(activity);
            textView5.setText(i3 + "颗种子");
            textView5.setTextSize(14.0f);
            textView5.setTextColor(i2);
            textView5.setGravity(17);
            TextView textView6 = new TextView(activity);
            textView6.setText("找到" + i4 + "颗，失败" + i5 + "颗");
            textView6.setTextSize(16.0f);
            textView6.setTextColor(z ? Color.parseColor("#2E7D32") : Color.parseColor("#E65100"));
            textView6.setGravity(17);
            textView6.setPadding(0, kf1Var.m1841d0(4, f), 0, kf1Var.m1841d0(4, f));
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("请重启小红书以生效Hook");
            } else {
                sb.append("未找到的目标:");
                if (aVar.m3923E() == null) {
                    sb.append("\n- " + kf1Var.m1855k0());
                }
                if (aVar.m3929K() == null) {
                    sb.append("\n- " + kf1Var.m1861n0());
                }
                if (aVar.m3924F().isEmpty()) {
                    sb.append("\n- " + kf1Var.m1863o0());
                }
                if (aVar.m3927I() == null) {
                    sb.append("\n- " + kf1Var.m1865p0());
                }
                if (aVar.m3940V() == null) {
                    sb.append("\n- " + kf1Var.m1867q0());
                }
                if (aVar.m3928J() == null) {
                    sb.append("\n- " + kf1Var.m1869r0());
                }
                if (aVar.m3921C() == null) {
                    sb.append("\n- " + kf1Var.m1871s0());
                }
                if (aVar.m3964y() == null) {
                    sb.append("\n- " + kf1Var.m1873t0());
                }
                if (aVar.m3937S() == null) {
                    sb.append("\n- " + kf1Var.m1875u0());
                }
                if (aVar.m3933O() == null) {
                    sb.append("\n- " + kf1Var.m1857l0());
                }
                if (aVar.m3922D() == null) {
                    sb.append("\n- " + kf1Var.m1859m0());
                }
                if (aVar.m3938T() == null) {
                    sb.append("\n- 侧边栏数据模型");
                }
                if (aVar.m3935Q() == null) {
                    sb.append("\n- 设置页条目模型");
                }
                if (aVar.m3934P() == null) {
                    sb.append("\n- 设置页条目类型");
                }
                if (aVar.m3936R() == null) {
                    sb.append("\n- 设置页埋点数据");
                }
                sb.append("\n\n请反馈给作者更新适配");
            }
            TextView textView7 = new TextView(activity);
            textView7.setText(sb.toString());
            textView7.setTextSize(13.0f);
            textView7.setTextColor(i2);
            textView7.setGravity(17);
            textView7.setPadding(kf1Var.m1841d0(16, f), kf1Var.m1841d0(6, f), kf1Var.m1841d0(16, f), kf1Var.m1841d0(4, f));
            ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
            progressBar.setIndeterminate(false);
            progressBar.setMax(i3);
            progressBar.setProgress(i4);
            progressBar.setPadding(kf1Var.m1841d0(40, f), kf1Var.m1841d0(6, f), kf1Var.m1841d0(40, f), kf1Var.m1841d0(6, f));
            final zt0 zt0Var = new zt0();
            LinearLayout linearLayout2 = new LinearLayout(activity);
            linearLayout2.setOrientation(1);
            linearLayout2.setGravity(17);
            linearLayout2.setBackgroundColor(i6);
            linearLayout2.setPadding(kf1Var.m1841d0(24, f), kf1Var.m1841d0(20, f), kf1Var.m1841d0(24, f), kf1Var.m1841d0(16, f));
            linearLayout2.addView(linearLayout);
            linearLayout2.addView(textView3);
            linearLayout2.addView(textView4);
            linearLayout2.addView(progressBar);
            linearLayout2.addView(textView5);
            linearLayout2.addView(textView6);
            linearLayout2.addView(textView7);
            LinearLayout linearLayout3 = new LinearLayout(activity);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(17);
            linearLayout3.setPadding(0, kf1Var.m1841d0(10, f), 0, 0);
            Button button = new Button(activity);
            button.setText("立即重启");
            button.setTextSize(14.0f);
            button.setTextColor(-1);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(kf1Var.m1841d0(24, f));
            gradientDrawable2.setColor(Color.parseColor("#FE2C55"));
            button.setBackground(gradientDrawable2);
            final int i7 = 0;
            button.setOnClickListener(new View.OnClickListener() { // from class: ff1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i8 = i7;
                    kf1 kf1Var2 = kf1Var;
                    zt0 zt0Var2 = zt0Var;
                    switch (i8) {
                        case 0:
                            kf1.m1801F0(zt0Var2, kf1Var2, view);
                            break;
                        default:
                            kf1.m1803G0(zt0Var2, kf1Var2, view);
                            break;
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, kf1Var.m1841d0(44, f), 1.0f);
            layoutParams2.setMargins(0, 0, kf1Var.m1841d0(6, f), 0);
            linearLayout3.addView(button, layoutParams2);
            Button button2 = new Button(activity);
            button2.setText("稍后重启");
            button2.setTextSize(14.0f);
            button2.setTextColor(Color.parseColor("#FE2C55"));
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(kf1Var.m1841d0(24, f));
            gradientDrawable3.setStroke(kf1Var.m1841d0(1, f), Color.parseColor("#FE2C55"));
            gradientDrawable3.setColor(0);
            button2.setBackground(gradientDrawable3);
            final int i8 = 1;
            button2.setOnClickListener(new View.OnClickListener() { // from class: ff1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i82 = i8;
                    kf1 kf1Var2 = kf1Var;
                    zt0 zt0Var2 = zt0Var;
                    switch (i82) {
                        case 0:
                            kf1.m1801F0(zt0Var2, kf1Var2, view);
                            break;
                        default:
                            kf1.m1803G0(zt0Var2, kf1Var2, view);
                            break;
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, kf1Var.m1841d0(44, f), 1.0f);
            layoutParams3.setMargins(kf1Var.m1841d0(6, f), 0, 0, 0);
            linearLayout3.addView(button2, layoutParams3);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(kf1Var.m1841d0(280, f), -2);
            layoutParams4.topMargin = kf1Var.m1841d0(10, f);
            layoutParams4.gravity = 17;
            linearLayout2.addView(linearLayout3, layoutParams4);
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayout2).setCancelable(false).create();
            alertDialogCreate.setCanceledOnTouchOutside(false);
            zt0Var.f7995d = alertDialogCreate;
            Window window = alertDialogCreate.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) zt0Var.f7995d).show();
            Object obj = zt0Var.f7995d;
            obj.getClass();
            kf1Var.m1813L0((AlertDialog) obj, 28, f);
        } catch (Exception unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final String m1800F() {
        return "C1";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F0 */
    public static final void m1801F0(zt0 zt0Var, kf1 kf1Var, View view) {
        try {
            AlertDialog alertDialog = (AlertDialog) zt0Var.f7995d;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
        kf1Var.m1793B0();
        System.exit(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final String m1802G() {
        return "C2";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G0 */
    public static final void m1803G0(zt0 zt0Var, kf1 kf1Var, View view) {
        try {
            AlertDialog alertDialog = (AlertDialog) zt0Var.f7995d;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
        kf1Var.m1793B0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final String m1804H() {
        return "C3";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8 A[Catch: Exception -> 0x0105, TryCatch #1 {Exception -> 0x0105, blocks: (B:9:0x001b, B:11:0x001f, B:13:0x0023, B:15:0x0027, B:17:0x0033, B:19:0x003b, B:21:0x003f, B:23:0x0043, B:25:0x0047, B:27:0x004b, B:29:0x004f, B:31:0x0055, B:33:0x005b, B:36:0x0063, B:38:0x006a, B:41:0x0070, B:45:0x009b, B:47:0x00a5, B:48:0x00b5, B:50:0x00b9, B:52:0x00bd, B:54:0x00c1, B:55:0x00d8, B:57:0x00de, B:59:0x00e6, B:60:0x00f8, B:62:0x00fc, B:63:0x0100), top: B:84:0x001b }] */
    /* JADX INFO: renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1805H0(kf1 kf1Var, XposedInterface.Chain chain) {
        String str;
        String str2;
        String str3;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        chain.getClass();
        Object objProceed = chain.proceed();
        Object thisObject = chain.getThisObject();
        Activity activity = thisObject instanceof Activity ? (Activity) thisObject : null;
        if (activity != null) {
            if (kf1Var.f3108C) {
                kf1Var.m1819O0(activity);
                return objProceed;
            }
            if (!kf1Var.f3109D && p30.m3002l(activity.getPackageName(), kf1Var.f3133v)) {
                kf1Var.f3109D = true;
                PackageInfo packageInfoM1811K0 = kf1Var.m1811K0(activity);
                kf1Var.f3131t = (packageInfoM1811K0 == null || (applicationInfo2 = packageInfoM1811K0.applicationInfo) == null) ? null : applicationInfo2.sourceDir;
                kf1Var.f3132u = (packageInfoM1811K0 == null || (applicationInfo = packageInfoM1811K0.applicationInfo) == null) ? null : applicationInfo.dataDir;
                long longVersionCode = packageInfoM1811K0 != null ? packageInfoM1811K0.getLongVersionCode() : 0L;
                kf1Var.f3134w = longVersionCode;
                if (longVersionCode == 0 && packageInfoM1811K0 != null) {
                    kf1Var.f3134w = packageInfoM1811K0.versionCode;
                }
                if (packageInfoM1811K0 == null || (str = packageInfoM1811K0.versionName) == null) {
                    str = "unknown";
                }
                kf1Var.f3135x = str;
                try {
                    String str4 = kf1Var.f3131t;
                    str4.getClass();
                    File file = new File(str4);
                    str2 = file.lastModified() + "_" + file.length();
                } catch (Exception unused) {
                    str2 = "";
                }
                kf1Var.f3136y = str2;
                boolean zM1839c0 = m1839c0(kf1Var, null, 1, null);
                kf1Var.f3137z = zM1839c0;
                if (zM1839c0) {
                    kf1Var.f3108C = true;
                    f3103J = true;
                    C0289hn.f2299a.m1428G();
                    ue0.f6203a.m4321c();
                } else {
                    String str5 = kf1Var.f3131t;
                    if (str5 != null && (str3 = kf1Var.f3132u) != null && kf1Var.f3130s != null) {
                        C0289hn c0289hn = C0289hn.f2299a;
                        str3.getClass();
                        ClassLoader classLoader = kf1Var.f3130s;
                        classLoader.getClass();
                        c0289hn.m1432M(str5, str3, classLoader, kf1Var.f3134w, kf1Var.f3135x, C0013ac.f96d, kf1Var.f3136y);
                    }
                    long j = kf1Var.f3134w;
                    if (j > 0 && !tu0.f6046a.m4230d(j)) {
                        kf1Var.f3106A = true;
                        f3103J = true;
                        C0289hn.f2299a.m1428G();
                        ue0.f6203a.m4321c();
                        kf1Var.m1823Q0(activity);
                    }
                }
            } else if (kf1Var.f3106A) {
                kf1Var.m1823Q0(activity);
            } else {
                DialogC0076c2.f628j.m433g(activity);
                if (DialogC0076c2.f628j.m432f(activity)) {
                    if (!kf1Var.f3111F && !kf1Var.f3110E) {
                        kf1Var.f3111F = true;
                        wb1.f7062a.m4974s(activity, kf1Var.f3134w, new C0073c(25, kf1Var, activity));
                    } else if (!kf1Var.f3110E && !kf1Var.f3112a) {
                        kf1Var.m1829V(activity);
                    }
                    if (!kf1Var.f3114c) {
                        kf1Var.m1795C0(activity);
                    }
                }
            }
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final String m1806I() {
        return "C4";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I0 */
    public static final na1 m1807I0(kf1 kf1Var, Activity activity, boolean z) {
        kf1Var.f3111F = false;
        kf1Var.f3110E = z;
        if (z) {
            lb0.f3404a.m2014a(kf1Var.m1881x0(), "vc blocked");
        } else if (!kf1Var.f3112a) {
            kf1Var.m1829V(activity);
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public static final String m1808J() {
        return "C5";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J0 */
    private final long m1809J0(Activity activity) {
        try {
            PackageInfo packageInfo = activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
            long longVersionCode = packageInfo != null ? packageInfo.getLongVersionCode() : 0L;
            return (longVersionCode != 0 || packageInfo == null) ? longVersionCode : packageInfo.versionCode;
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final String m1810K() {
        return "C6";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K0 */
    private final PackageInfo m1811K0(Activity activity) {
        try {
            return activity.getPackageManager().getPackageInfo(activity.getPackageName(), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final String m1812L() {
        return "C7";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L0 */
    private final void m1813L0(final AlertDialog alertDialog, final int i, final float f) {
        View decorView;
        Window window = alertDialog.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new Runnable() { // from class: df1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                kf1.m1815M0(i, f, alertDialog);
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public static final String m1814M() {
        return "C(";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0 */
    public static final void m1815M0(int i, float f, AlertDialog alertDialog) {
        View decorView;
        float f2 = i * f;
        Window window = alertDialog.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setClipToOutline(true);
        decorView.setOutlineProvider(new C0392b(f2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public static final String m1816N() {
        return "C)";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N0 */
    private final boolean m1817N0() {
        Integer numM3383T;
        String str = this.f3132u;
        if (str != null) {
            try {
                File file = new File(str, "files/xp1_scan_suppress");
                if (file.exists()) {
                    List listM1773e0 = k41.m1773e0(AbstractC0627pt.m3156c0(file), new String[]{"|"}, 6);
                    if (listM1773e0.size() >= 3 && (numM3383T = r41.m3383T((String) listM1773e0.get(0))) != null) {
                        int iIntValue = numM3383T.intValue();
                        Long lM3384U = r41.m3384U((String) listM1773e0.get(1));
                        if (lM3384U != null) {
                            long jLongValue = lM3384U.longValue();
                            String str2 = (String) listM1773e0.get(2);
                            String str3 = listM1773e0.size() >= 4 ? (String) listM1773e0.get(3) : "";
                            if (iIntValue == 30121 && jLongValue == this.f3134w && p30.m3002l(str2, this.f3135x)) {
                                if (str3.length() > 0 && this.f3136y.length() > 0) {
                                    if (!str3.equals(this.f3136y)) {
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public static final String m1818O() {
        return "com.xingin.xhs";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O0 */
    private final void m1819O0(Activity activity) {
        try {
            String strM4228b = tu0.f6046a.m4228b();
            new AlertDialog.Builder(activity).setTitle("不支持谷歌商店版").setMessage("不支持谷歌商店渠道版本，请换成模块适配的对应版本号的国内版。\n\n推荐版本：" + strM4228b + "\n\n不会加载任何Hook功能。").setPositiveButton("确定", new ef1(1)).setCancelable(false).show();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P */
    public static final String m1820P() {
        return "X1lic";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P0 */
    public static final void m1821P0(DialogInterface dialogInterface, int i) {
        Process.killProcess(Process.myPid());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public static final String m1822Q() {
        return "X1";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q0 */
    private final void m1823Q0(Activity activity) {
        if (this.f3107B) {
            return;
        }
        this.f3107B = true;
        try {
            String strM4228b = tu0.f6046a.m4228b();
            new AlertDialog.Builder(activity).setTitle("版本不匹配").setMessage("当前宿主版本不符合模块要求，请更新到推荐版本：\n\n" + strM4228b + "\n\n其他版本不会加载任何Hook功能。").setPositiveButton("确定", new ef1(0)).setCancelable(false).show();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    private final void m1829V(final Activity activity) {
        String str;
        ClassLoader classLoader;
        Context contextM1853j0;
        if (this.f3112a || (str = this.f3132u) == null || (classLoader = this.f3130s) == null || (contextM1853j0 = m1853j0()) == null) {
            return;
        }
        cf1 cf1Var = cf1.f801a;
        boolean zM520f = cf1Var.m520f(classLoader);
        String strM517c = zM520f ? cf1Var.m517c(str, classLoader) : null;
        if (!zM520f || strM517c == null) {
            m90.C0465a c0465a = m90.f3876m;
            if (strM517c == null) {
                strM517c = "";
            }
            final int i = 0;
            c0465a.m2484b(activity, strM517c, zM520f, new InterfaceC0298hw(this) { // from class: hf1

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ kf1 f2251e;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f2251e = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0298hw
                public final Object invoke() {
                    int i2 = i;
                    Activity activity2 = activity;
                    kf1 kf1Var = this.f2251e;
                    switch (i2) {
                        case 0:
                            return kf1.m1830W(kf1Var, activity2);
                        default:
                            return kf1.m1831X(kf1Var, activity2);
                    }
                }
            });
            return;
        }
        n90 n90Var = n90.f4211a;
        if (!n90Var.m2674J(contextM1853j0, strM517c)) {
            final int i2 = 1;
            m90.f3876m.m2484b(activity, strM517c, true, new InterfaceC0298hw(this) { // from class: hf1

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ kf1 f2251e;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f2251e = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0298hw
                public final Object invoke() {
                    int i22 = i2;
                    Activity activity2 = activity;
                    kf1 kf1Var = this.f2251e;
                    switch (i22) {
                        case 0:
                            return kf1.m1830W(kf1Var, activity2);
                        default:
                            return kf1.m1831X(kf1Var, activity2);
                    }
                }
            });
            return;
        }
        m1885z0(activity);
        hk0.f2275a.m1371v(activity);
        String strM2677x = n90Var.m2677x(contextM1853j0);
        if (strM2677x == null) {
            return;
        }
        new Thread(new RunnableC0084ca(contextM1853j0, strM2677x, strM517c, this, activity)).start();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public static final na1 m1830W(kf1 kf1Var, Activity activity) {
        kf1Var.m1885z0(activity);
        hk0.f2275a.m1371v(activity);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final na1 m1831X(kf1 kf1Var, Activity activity) {
        kf1Var.m1885z0(activity);
        hk0.f2275a.m1371v(activity);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m1832Y(Context context, String str, String str2, kf1 kf1Var, Activity activity) {
        kf1Var.m1851i0().post(new RunnableC0669qy(n90.f4211a.m2675O(context, str, str2), context, activity, str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public static final void m1833Z(n90.C0504a c0504a, Context context, Activity activity, String str) {
        if (c0504a.m2683e()) {
            return;
        }
        n90.f4211a.m2676v(context);
        m90.f3876m.m2484b(activity, str, true, new cc1(18));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public static final na1 m1835a0() {
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    private final boolean m1837b0(String str) {
        try {
            String strM1843e0 = m1843e0(str);
            if (strM1843e0 == null) {
                return false;
            }
            return strM1843e0.equals(f3104K);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ boolean m1839c0(kf1 kf1Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kf1Var.f3131t;
        }
        return kf1Var.m1837b0(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    private final int m1841d0(int i, float f) {
        return (int) (i * f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: e0 */
    private final String m1843e0(String str) {
        int i;
        Object next;
        if (str != null) {
            try {
                ZipFile zipFile = new ZipFile(str);
                try {
                    Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                    enumerationEntries.getClass();
                    Iterator it = new C0553oj(new qa0(1, new C0016af(enumerationEntries))).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        ZipEntry zipEntry = (ZipEntry) next;
                        String name = zipEntry.getName();
                        name.getClass();
                        if (r41.m3382S(name, "META-INF/", false)) {
                            String name2 = zipEntry.getName();
                            name2.getClass();
                            if (r41.m3380Q(name2, ".RSA", false)) {
                                break;
                            }
                            String name3 = zipEntry.getName();
                            name3.getClass();
                            if (r41.m3380Q(name3, ".DSA", false)) {
                                break;
                            }
                        }
                    }
                    ZipEntry zipEntry2 = (ZipEntry) next;
                    if (zipEntry2 == null) {
                        zipFile.close();
                        return null;
                    }
                    InputStream inputStream = zipFile.getInputStream(zipEntry2);
                    inputStream.getClass();
                    byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(p30.m2983S(inputStream))).getEncoded());
                    bArrDigest.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "");
                    int i2 = 0;
                    for (byte b : bArrDigest) {
                        i2++;
                        if (i2 > 1) {
                            sb.append((CharSequence) "");
                        }
                        sb.append(m1847g0(b));
                    }
                    sb.append((CharSequence) "");
                    String string = sb.toString();
                    zipFile.close();
                    return string;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ String m1845f0(kf1 kf1Var, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kf1Var.f3131t;
        }
        return kf1Var.m1843e0(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    private static final CharSequence m1847g0(byte b) {
        return String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    private final String m1849h0() {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        ClassLoader classLoader;
        String absolutePath;
        try {
            classLoader = this.f3130s;
        } catch (Exception unused) {
        }
        try {
            if (classLoader == null) {
                return null;
            }
            Field declaredField = Class.forName("dalvik.system.BaseDexClassLoader").getDeclaredField("pathList");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(classLoader);
            Field declaredField2 = obj.getClass().getDeclaredField("dexElements");
            declaredField2.setAccessible(true);
            Object obj2 = declaredField2.get(obj);
            obj2.getClass();
            for (Object obj3 : (Object[]) obj2) {
                try {
                    Field declaredField3 = obj3.getClass().getDeclaredField("path");
                    declaredField3.setAccessible(true);
                    Object obj4 = declaredField3.get(obj3);
                    File file = obj4 instanceof File ? (File) obj4 : null;
                    if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
                        if (!r41.m3380Q(absolutePath, ".apk", false)) {
                            absolutePath = null;
                        }
                        if (absolutePath != null) {
                            return absolutePath;
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            Context contextM1853j0 = m1853j0();
            if (contextM1853j0 != null) {
                PackageManager packageManager = contextM1853j0.getPackageManager();
                String str = this.f3133v;
                if (str == null || (packageInfo = packageManager.getPackageInfo(str, 0)) == null || (applicationInfo = packageInfo.applicationInfo) == null) {
                    return null;
                }
                return applicationInfo.sourceDir;
            }
            return null;
        } catch (Exception unused3) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    private final Handler m1851i0() {
        return (Handler) this.f3116e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    private final Context m1853j0() {
        try {
            Object objInvoke = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
            if (objInvoke instanceof Context) {
                return (Context) objInvoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    private final String m1855k0() {
        return (String) this.f3117f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    private final String m1857l0() {
        return (String) this.f3126o.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    private final String m1859m0() {
        return (String) this.f3127p.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    private final String m1861n0() {
        return (String) this.f3118g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o0 */
    private final String m1863o0() {
        return (String) this.f3119h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    private final String m1865p0() {
        return (String) this.f3120i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    private final String m1867q0() {
        return (String) this.f3121j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    private final String m1869r0() {
        return (String) this.f3122k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    private final String m1871s0() {
        return (String) this.f3123l.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t0 */
    private final String m1873t0() {
        return (String) this.f3124m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    private final String m1875u0() {
        return (String) this.f3125n.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    private final String m1877v0() {
        return (String) this.f3115d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    private final String m1879w0() {
        return (String) this.f3128q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    private final String m1881x0() {
        return (String) this.f3129r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public static final Handler m1883y0() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    private final void m1885z0(Activity activity) {
        if (this.f3112a) {
            return;
        }
        Context contextM1853j0 = m1853j0();
        if (contextM1853j0 != null && wb1.f7062a.m4971H(contextM1853j0)) {
            lb0.f3404a.m2014a(m1881x0(), "vc blocked (sp)");
            return;
        }
        this.f3112a = true;
        ClassLoader classLoader = this.f3130s;
        if (classLoader == null) {
            log(6, "XP1", "installAllHooks: null classLoader");
            return;
        }
        String str = this.f3131t;
        if (str == null) {
            log(6, "XP1", "installAllHooks: null apkPath");
            return;
        }
        String str2 = this.f3132u;
        if (str2 == null) {
            log(6, "XP1", "installAllHooks: null dataDir");
            return;
        }
        if (this.f3133v == null) {
            return;
        }
        String strM2677x = contextM1853j0 != null ? n90.f4211a.m2677x(contextM1853j0) : null;
        boolean z = (strM2677x == null || r41.m3382S(strM2677x, "WHS-Y-", false)) ? false : true;
        C0695rn.a aVarM1432M = C0289hn.f2299a.m1432M(str, str2, classLoader, this.f3134w, this.f3135x, C0013ac.f96d, this.f3136y);
        k11.f2987a.m1760j(aVarM1432M.m3921C());
        if (activity != null) {
            C0833va.f6617a.m4429d(activity);
        }
        xa1.f7291a.m5113g(classLoader);
        vs0.f6811a.m4788w(classLoader, aVarM1432M.m3933O(), aVarM1432M.m3932N());
        ck0.f840a.m587D(classLoader, aVarM1432M.m3929K());
        fk0.f1746a.m1161X(classLoader, aVarM1432M.m3929K());
        o00.f4379a.m2750b(classLoader, aVarM1432M.m3924F());
        ob0.f4502a.m2866S(classLoader, aVarM1432M.m3927I());
        ec1.f1395a.m924t0(classLoader, aVarM1432M.m3940V(), aVarM1432M.m3928J());
        C0473mg.f3948a.m2577f0(classLoader, aVarM1432M.m3937S(), aVarM1432M.m3964y(), aVarM1432M.m3923E(), aVarM1432M.m3965z(), aVarM1432M.m3919A());
        if (z) {
            Context contextM1853j02 = m1853j0();
            if (contextM1853j02 != null) {
                C0443lt.f3583a.m2083q(contextM1853j02);
            }
            C0443lt.f3583a.m2082h(classLoader);
        }
        C0906wy c0906wy = C0906wy.f7212a;
        c0906wy.m5061p(classLoader, aVarM1432M.m3922D());
        c0906wy.m5062s(classLoader, aVarM1432M.m3922D());
        c0906wy.m5063w(classLoader);
        C0980yy.f7715a.m5346O(classLoader);
        if (z) {
            C0015ae c0015ae = C0015ae.f111a;
            c0015ae.m127Z(classLoader);
            Context contextM1853j03 = m1853j0();
            if (contextM1853j03 != null) {
                c0015ae.m128e0(contextM1853j03);
            }
        }
        C0026ap.f217a.m194b(classLoader);
        yu0.f7694a.m5297b(classLoader, aVarM1432M.m3925G(), aVarM1432M.m3926H());
        af1.f152a.m167n(classLoader);
        m11.f3778a.m2424j(classLoader, aVarM1432M.m3921C(), aVarM1432M.m3938T(), aVarM1432M.m3935Q(), aVarM1432M.m3934P(), aVarM1432M.m3936R());
        C1021zy.f8036a.m5640v(aVarM1432M.m3930L());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onModuleLoaded(XposedModuleInterface.ModuleLoadedParam moduleLoadedParam) {
        moduleLoadedParam.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onPackageLoaded(XposedModuleInterface.PackageLoadedParam packageLoadedParam) {
        packageLoadedParam.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onPackageReady(XposedModuleInterface.PackageReadyParam packageReadyParam) {
        packageReadyParam.getClass();
        try {
            if (p30.m3002l(packageReadyParam.getPackageName(), m1877v0())) {
                if (!C0311i8.f2476a.m1565g()) {
                    lb0.f3404a.m2014a(m1879w0(), "at");
                    return;
                }
                ue0.f6203a.m4323f();
                this.f3130s = packageReadyParam.getClassLoader();
                this.f3133v = packageReadyParam.getPackageName();
                String strM1849h0 = m1849h0();
                if (strM1849h0 != null && m1837b0(strM1849h0)) {
                    this.f3108C = true;
                    f3103J = true;
                }
                if (this.f3113b) {
                    return;
                }
                this.f3113b = true;
                if (!this.f3108C) {
                    C0833va.f6617a.m4430f();
                }
                try {
                    hook(Activity.class.getDeclaredMethod("onCreate", Bundle.class)).intercept(new C0430lg(3, this)).getClass();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            log(6, "XP1", "onPackageReady CRASH: " + th.getClass().getSimpleName() + ": " + th.getMessage());
        }
    }

    /* JADX INFO: renamed from: kf1$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0391a {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: kf1.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0391a(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final boolean m1886a() {
            return kf1.f3103J;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final kf1 m1887b() {
            return kf1.f3102I;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final void m1888c(boolean z) {
            kf1.f3103J = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final void m1889d(kf1 kf1Var) {
            kf1.f3102I = kf1Var;
        }

        private C0391a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R0 */
    public static final void m1825R0(DialogInterface dialogInterface, int i) {
    }
}
