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
import p000.AbstractC0222ff;
import p000.AbstractC0346ip;
import p000.RunnableC0272gs;
import p000.RunnableC0385js;
import p000.ViewOnTouchListenerC0589p9;
import p000.h40;
import p000.i40;
import p000.u40;
import p000.z30;

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
            Method dump skipped, instruction units count: 236
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
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getPaint().measureText(textView.getText().toString()), textView.getTextSize() * 1.5f, new int[]{i, Color.parseColor(u40.m2419a("845Ji0lbfw==\n", "0Mp8s3odOY4=\n"))}, (float[]) null, Shader.TileMode.CLAMP));
        textView.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSukiStyleUI$lambda$46$lambda$45(MainActivity mainActivity, View view) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(u40.m2419a("XE6suMqUK1NaT7W405w=\n", "PyHBlr7xRTA=\n"), u40.m2419a("E9cue7CRM4AV1jd7qZlzlhmWDzSxmj6LFcoWHA==\n", "cLhDVcT0XeM=\n")));
            intent.setFlags(335544320);
            mainActivity.startActivity(intent);
        } catch (Exception unused) {
            mainActivity.showCapsuleToast(u40.m2419a("9e1wunuhOUqYlFLsPZ9xG6zQMuNIyX5z9P91uXqi\n", "E3HaXNgh3/8=\n"), true);
        }
    }

    private final void injectJellyTouchAnimation(View view) {
        view.setOnTouchListener(new ViewOnTouchListenerC0589p9(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean injectJellyTouchAnimation$lambda$51(View view, MotionEvent motionEvent) {
        Object tag = view.getTag(2114519042);
        h40 h40Var = tag instanceof h40 ? (h40) tag : null;
        if (h40Var == null) {
            h40Var = new h40(view, h40.f2219n);
            view.setTag(2114519042, h40Var);
        }
        Object tag2 = view.getTag(2114519043);
        h40 h40Var2 = tag2 instanceof h40 ? (h40) tag2 : null;
        if (h40Var2 == null) {
            h40Var2 = new h40(view, h40.f2220o);
            view.setTag(2114519043, h40Var2);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            h40Var.f2234j = z30.m2761f(0.94f, 1500.0f, 0.4f);
            h40Var2.f2234j = z30.m2761f(0.94f, 1500.0f, 0.4f);
            h40Var.m1346h();
            h40Var2.m1346h();
            return true;
        }
        if (actionMasked == 1 || actionMasked == 3) {
            h40Var.f2234j = z30.m2761f(1.0f, 200.0f, 0.3f);
            h40Var2.f2234j = z30.m2761f(1.0f, 200.0f, 0.3f);
            h40Var.m1346h();
            h40Var2.m1346h();
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
        linearLayout.setPadding(AbstractC0222ff.m1195q(18), AbstractC0222ff.m1195q(12), AbstractC0222ff.m1195q(22), AbstractC0222ff.m1195q(12));
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (z2) {
            str2 = "IhuUmClIyrEw\n";
            str3 = "AV6iqRh5+4A=\n";
        } else {
            str2 = "sjehaN48g93X\n";
            str3 = "kXKXLph6xZs=\n";
        }
        gradientDrawable.setColor(Color.parseColor(u40.m2419a(str2, str3)));
        gradientDrawable.setCornerRadius(AbstractC0222ff.m1194p(100.0f));
        int iM1195q = AbstractC0222ff.m1195q(1);
        if (z2) {
            str4 = "LH8OSqN2V2lJ\n";
            str5 = "D004DOUwES8=\n";
        } else {
            str4 = "m2yAhmALIkuI\n";
            str5 = "uF3BtlA7Ens=\n";
        }
        gradientDrawable.setStroke(iM1195q, Color.parseColor(u40.m2419a(str4, str5)));
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setElevation(AbstractC0222ff.m1194p(30.0f));
        if (i >= 28) {
            linearLayout.setOutlineAmbientShadowColor(Color.parseColor(u40.m2419a("EFWG6ZcU2A==\n", "M2W22ack6Cc=\n")));
            if (z) {
                str10 = "L1O+ccV26U48\n";
                str11 = "DGCNN4NFq30=\n";
            } else {
                str10 = "lr/Ol8PKerOF\n";
                str11 = "tY3+p/P6SoM=\n";
            }
            linearLayout.setOutlineSpotShadowColor(Color.parseColor(u40.m2419a(str10, str11)));
        }
        View view2 = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0222ff.m1195q(8), AbstractC0222ff.m1195q(8));
        layoutParams.rightMargin = AbstractC0222ff.m1195q(12);
        view2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        if (z) {
            str6 = "wI85IX+qRA==\n";
            str7 = "48l/Ej2ZdE8=\n";
        } else {
            str6 = "pGIdhTk2HA==\n";
            str7 = "h1Epxg4DJRI=\n";
        }
        gradientDrawable2.setColor(Color.parseColor(u40.m2419a(str6, str7)));
        view2.setBackground(gradientDrawable2);
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(13.5f);
        if (z2) {
            str8 = "RF8RUBe0zQ==\n";
            str9 = "ZxkkFiLy+H8=\n";
        } else {
            str8 = "MMgOfGOHfA==\n";
            str9 = "E/k/TVK2TUY=\n";
        }
        textView.setTextColor(Color.parseColor(u40.m2419a(str8, str9)));
        textView.setTypeface(Typeface.create(u40.m2419a("fwW/pIX0BcFlAvy6zeMJxmE=\n", "DGTR16iHYLM=\n"), 0), 1);
        textView.setLetterSpacing(0.02f);
        linearLayout.addView(view2);
        linearLayout.addView(textView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 49;
        layoutParams2.topMargin = AbstractC0222ff.m1195q(55);
        viewGroup.addView(linearLayout, layoutParams2);
        this.activeToast = linearLayout;
        linearLayout.setTranslationY(-AbstractC0222ff.m1194p(60.0f));
        linearLayout.setAlpha(0.0f);
        linearLayout.setScaleX(0.85f);
        linearLayout.setScaleY(0.85f);
        linearLayout.animate().alpha(1.0f).setDuration(200L).start();
        h40 h40Var = new h40(linearLayout, h40.f2218m);
        h40Var.f2234j = z30.m2761f(0.0f, 200.0f, 0.6f);
        h40Var.m1346h();
        h40 h40Var2 = new h40(linearLayout, h40.f2219n);
        h40Var2.f2234j = z30.m2761f(1.0f, 200.0f, 0.6f);
        h40Var2.m1346h();
        h40 h40Var3 = new h40(linearLayout, h40.f2220o);
        h40Var3.f2234j = z30.m2761f(1.0f, 200.0f, 0.6f);
        h40Var3.m1346h();
        linearLayout.postDelayed(new RunnableC0385js(linearLayout, viewGroup), 2500L);
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
            linearLayout.animate().alpha(0.0f).setDuration(250L).withEndAction(new RunnableC0385js(viewGroup, linearLayout)).start();
            h40 h40Var = new h40(linearLayout, h40.f2218m);
            i40 i40Var = new i40(-AbstractC0222ff.m1194p(60.0f));
            i40Var.m1394b(200.0f);
            i40Var.m1393a(1.0f);
            h40Var.f2234j = i40Var;
            h40Var.m1346h();
            h40 h40Var2 = new h40(linearLayout, h40.f2219n);
            h40Var2.f2234j = z30.m2761f(0.85f, 200.0f, 1.0f);
            h40Var2.m1346h();
            h40 h40Var3 = new h40(linearLayout, h40.f2220o);
            h40Var3.f2234j = z30.m2761f(0.85f, 200.0f, 1.0f);
            h40Var3.m1346h();
        }
    }

    private final void startCascadingEntranceAnimation(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setAlpha(0.0f);
            childAt.setTranslationY(AbstractC0222ff.m1194p(100.0f));
            long j = ((long) i) * 90;
            childAt.animate().alpha(1.0f).setDuration(600L).setStartDelay(j).setInterpolator(new AccelerateDecelerateInterpolator()).start();
            childAt.postDelayed(new RunnableC0272gs(childAt, 2), j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startCascadingEntranceAnimation$lambda$53(View view) {
        h40 h40Var = new h40(view, h40.f2218m);
        h40Var.f2234j = z30.m2761f(0.0f, 200.0f, 0.65f);
        h40Var.m1346h();
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
                showCapsuleToast(u40.m2419a("10bIXiNUZPm+PNQ/Y0MFlIVsoBg6PBXe2EfLXxxFZsubM888Y0E8lYJPriULPTf02GDY\n", "PtpItoXVgnA=\n"), true);
                Intent intent = new Intent(u40.m2419a("6jTh4Cmt4fL4P/HmL6rir6UXxNwHg8CDygrVzQeIyYPNE8nXFZvEn8gf1sEZlMCOxhPWwQ+Lyw==\n", "i1qFkkbEhdw=\n"));
                intent.setData(Uri.parse("package:" + getPackageName()));
                startActivity(intent);
            }
            initSukiStyleUI();
        } catch (Throwable th) {
            ScrollView scrollView = new ScrollView(this);
            TextView textView = new TextView(this);
            textView.setText("App 启动异常：\n\n".concat(AbstractC0346ip.m1484W(th)));
            textView.setTextColor(Color.parseColor(u40.m2419a("XL04w48VaQ==\n", "f/t+9r0gWxk=\n")));
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
