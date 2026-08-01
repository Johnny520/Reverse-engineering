package com.ljx.wechatmod.p001ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import p000.AbstractC0259gf;
import p000.AbstractC0493mp;
import p000.RunnableC0422ks;
import p000.RunnableC0533ns;
import p000.ViewOnTouchListenerC0959z9;
import p000.b50;
import p000.g40;
import p000.o40;
import p000.p40;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends Activity {
    private View activeToast;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void extractFontToStealthDir() {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ljx.wechatmod.p001ui.MainActivity.extractFontToStealthDir():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initSukiStyleUI() {
        /*
            Method dump skipped, instruction units count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ljx.wechatmod.p001ui.MainActivity.initSukiStyleUI():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSukiStyleUI$lambda$24$lambda$23(TextView textView, int i) {
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getPaint().measureText(textView.getText().toString()), textView.getTextSize() * 1.5f, new int[]{i, Color.parseColor("#D583FF")}, (float[]) null, Shader.TileMode.CLAMP));
        textView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSukiStyleUI$lambda$46$lambda$45(MainActivity mainActivity, View view) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI"));
            intent.setFlags(335544320);
            mainActivity.startActivity(intent);
        } catch (Exception unused) {
            mainActivity.showCapsuleToast("\u672a\u68c0\u6d4b\u5230\u5fae\u4fe1\u8fd0\u884c\u73af\u5883", true);
        }
    }

    private final void injectJellyTouchAnimation(View view) {
        view.setOnTouchListener(new ViewOnTouchListenerC0959z9(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean injectJellyTouchAnimation$lambda$51(View view, MotionEvent motionEvent) {
        Object tag = view.getTag(2114519042);
        o40 o40Var = tag instanceof o40 ? (o40) tag : null;
        if (o40Var == null) {
            o40Var = new o40(view, o40.f3384o);
            view.setTag(2114519042, o40Var);
        }
        Object tag2 = view.getTag(2114519043);
        o40 o40Var2 = tag2 instanceof o40 ? (o40) tag2 : null;
        if (o40Var2 == null) {
            o40Var2 = new o40(view, o40.f3385p);
            view.setTag(2114519043, o40Var2);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            o40Var.f3400k = g40.m1143f(0.94f, 1500.0f, 0.4f);
            o40Var2.f3400k = g40.m1143f(0.94f, 1500.0f, 0.4f);
            o40Var.m1991h();
            o40Var2.m1991h();
            return true;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            o40Var.f3400k = g40.m1143f(1.0f, 200.0f, 0.3f);
            o40Var2.f3400k = g40.m1143f(1.0f, 200.0f, 0.3f);
            o40Var.m1991h();
            o40Var2.m1991h();
            if (motionEvent.getActionMasked() == 1) {
                view.performClick();
            }
        }
        return true;
    }

    private final void setupModernSystemUi() {
        WindowInsetsController windowInsetsController;
        Window window = getWindow();
        if (window == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 29 && (getResources().getConfiguration().uiMode & 48) == 32;
        window.setDecorFitsSystemWindows(false);
        if (i >= 30 && (windowInsetsController = window.getDecorView().getWindowInsetsController()) != null) {
            windowInsetsController.setSystemBarsAppearance(z ? 0 : 8, 8);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }

    private final void showCapsuleToast(String str, boolean z) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        View decorView = getWindow().getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        View view = this.activeToast;
        if (view != null) {
            viewGroup.removeView(view);
        }
        int i = Build.VERSION.SDK_INT;
        boolean z2 = i >= 29 && (getResources().getConfiguration().uiMode & 48) == 32;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(AbstractC0493mp.m1867q(18), AbstractC0493mp.m1867q(12), AbstractC0493mp.m1867q(22), AbstractC0493mp.m1867q(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (z2) {
            str2 = "dFTI31v8QWZm\n";
            str3 = "VxH+7mrNcFc=\n";
        } else {
            str2 = "2+/Nh80op6q+\n";
            str3 = "+Kr7wYtu4ew=\n";
        }
        gradientDrawable.setColor(Color.parseColor(b50.m492a(str2, str3)));
        gradientDrawable.setCornerRadius(AbstractC0493mp.m1866p(100.0f));
        int iM1867q = AbstractC0493mp.m1867q(1);
        if (z2) {
            str4 = "RLQHMDZJ39ch\n";
            str5 = "Z4YxdnAPmZE=\n";
        } else {
            str4 = "jBF9AWNnsm6f\n";
            str5 = "ryA8MVNXgl4=\n";
        }
        gradientDrawable.setStroke(iM1867q, Color.parseColor(b50.m492a(str4, str5)));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setElevation(AbstractC0493mp.m1866p(30.0f));
        if (i >= 28) {
            linearLayout.setOutlineAmbientShadowColor(Color.parseColor("#000000"));
            if (z) {
                str10 = "/hXCwWPdU+Dt\n";
                str11 = "3SbxhyXuEdM=\n";
            } else {
                str10 = "5nB5epG365f1\n";
                str11 = "xUJJSqGH26c=\n";
            }
            linearLayout.setOutlineSpotShadowColor(Color.parseColor(b50.m492a(str10, str11)));
        }
        View view2 = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0493mp.m1867q(8), AbstractC0493mp.m1867q(8));
        layoutParams.rightMargin = AbstractC0493mp.m1867q(12);
        view2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        if (z) {
            str6 = "A8zN0jrtpg==\n";
            str7 = "IIqL4Xjell8=\n";
        } else {
            str6 = "gtVq8yHOWQ==\n";
            str7 = "oeZesBb7YCQ=\n";
        }
        gradientDrawable2.setColor(Color.parseColor(b50.m492a(str6, str7)));
        view2.setBackground(gradientDrawable2);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(13.5f);
        if (z2) {
            str8 = "S9764ARsRQ==\n";
            str9 = "aJjPpjEqcPY=\n";
        } else {
            str8 = "vdK/nrJ+1g==\n";
            str9 = "nuOOr4NP55Q=\n";
        }
        textView.setTextColor(Color.parseColor(b50.m492a(str8, str9)));
        textView.setTypeface(Typeface.create("sans-serif-medium", 0), 1);
        textView.setLetterSpacing(0.02f);
        linearLayout.addView(view2);
        linearLayout.addView(textView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 49;
        layoutParams2.topMargin = AbstractC0493mp.m1867q(55);
        viewGroup.addView(linearLayout, layoutParams2);
        this.activeToast = linearLayout;
        linearLayout.setTranslationY(-AbstractC0493mp.m1866p(60.0f));
        linearLayout.setAlpha(0.0f);
        linearLayout.setScaleX(0.85f);
        linearLayout.setScaleY(0.85f);
        linearLayout.animate().alpha(1.0f).setDuration(200L).start();
        o40 o40Var = new o40(linearLayout, o40.f3383n);
        o40Var.f3400k = g40.m1143f(0.0f, 200.0f, 0.6f);
        o40Var.m1991h();
        o40 o40Var2 = new o40(linearLayout, o40.f3384o);
        o40Var2.f3400k = g40.m1143f(1.0f, 200.0f, 0.6f);
        o40Var2.m1991h();
        o40 o40Var3 = new o40(linearLayout, o40.f3385p);
        o40Var3.f3400k = g40.m1143f(1.0f, 200.0f, 0.6f);
        o40Var3.m1991h();
        linearLayout.postDelayed(new RunnableC0533ns(linearLayout, viewGroup), 2500L);
    }

    public static /* synthetic */ void showCapsuleToast$default(MainActivity mainActivity, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        mainActivity.showCapsuleToast(str, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCapsuleToast$lambda$18(LinearLayout linearLayout, ViewGroup viewGroup) {
        if (linearLayout.getParent() != null) {
            linearLayout.animate().alpha(0.0f).setDuration(250L).withEndAction(new RunnableC0533ns(viewGroup, linearLayout)).start();
            o40 o40Var = new o40(linearLayout, o40.f3383n);
            p40 p40Var = new p40(-AbstractC0493mp.m1866p(60.0f));
            p40Var.m2064b(200.0f);
            p40Var.m2063a(1.0f);
            o40Var.f3400k = p40Var;
            o40Var.m1991h();
            o40 o40Var2 = new o40(linearLayout, o40.f3384o);
            o40Var2.f3400k = g40.m1143f(0.85f, 200.0f, 1.0f);
            o40Var2.m1991h();
            o40 o40Var3 = new o40(linearLayout, o40.f3385p);
            o40Var3.f3400k = g40.m1143f(0.85f, 200.0f, 1.0f);
            o40Var3.m1991h();
        }
    }

    private final void startCascadingEntranceAnimation(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setAlpha(0.0f);
            childAt.setTranslationY(AbstractC0493mp.m1866p(100.0f));
            long j = ((long) i) * 90;
            childAt.animate().alpha(1.0f).setDuration(600L).setStartDelay(j).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            childAt.postDelayed(new RunnableC0422ks(childAt, 2), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCascadingEntranceAnimation$lambda$53(View view) {
        o40 o40Var = new o40(view, o40.f3383n);
        o40Var.f3400k = g40.m1143f(0.0f, 200.0f, 0.65f);
        o40Var.m1991h();
    }

    public final boolean isModuleActive() {
        return false;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setupModernSystemUi();
            if (Build.VERSION.SDK_INT >= 30 && !Environment.isExternalStorageManager()) {
                showCapsuleToast("\u9700\u8981\u6240\u6709\u6587\u4ef6\u8bbf\u95ee\u6743\u9650\u4ee5\u91ca\u653e\u5f15\u64ce\u8d44\u6e90", true);
                Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
                intent.setData(Uri.parse("package:" + getPackageName()));
                startActivity(intent);
            }
            initSukiStyleUI();
        } catch (Throwable th) {
            ScrollView scrollView = new ScrollView(this);
            TextView textView = new TextView(this);
            textView.setText("App 启动异常：\n\n".concat(AbstractC0259gf.m1239X(th)));
            textView.setTextColor(Color.parseColor("#FF5252"));
            textView.setTextSize(14.0f);
            textView.setPadding(50, 100, 50, 50);
            scrollView.addView(textView);
            setContentView(scrollView);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT < 30 || Environment.isExternalStorageManager()) {
            extractFontToStealthDir();
        }
    }
}
