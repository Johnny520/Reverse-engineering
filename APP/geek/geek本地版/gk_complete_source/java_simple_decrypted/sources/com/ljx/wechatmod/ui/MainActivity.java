package com.ljx.wechatmod.ui;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
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
import android.util.Log;
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
import defpackage.bb;
import defpackage.c0;
import defpackage.d0;
import defpackage.ff;
import defpackage.gs;
import defpackage.h40;
import defpackage.i40;
import defpackage.ip;
import defpackage.js;
import defpackage.ks;
import defpackage.kx;
import defpackage.p9;
import defpackage.qa;
import defpackage.u40;
import defpackage.z30;
import defpackage.zt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends Activity {
    private View activeToast;

    public MainActivity() {
    }

    public static /* synthetic */ void a(TextView r0, int r1) {
        initSukiStyleUI$lambda$24$lambda$23(r0, r1);
    }

    public static /* synthetic */ void b(ViewGroup r0, LinearLayout r1) {
        showCapsuleToast$lambda$18$lambda$14(r0, r1);
    }

    public static /* synthetic */ boolean c(View r0, MotionEvent r1) {
        return injectJellyTouchAnimation$lambda$51(r0, r1);
    }

    public static /* synthetic */ void d(View r0) {
        startCascadingEntranceAnimation$lambda$53(r0);
    }

    public static /* synthetic */ void e(ViewGroup r0, LinearLayout r1) {
        showCapsuleToast$lambda$18(r1, r0);
    }

    private final void extractFontToStealthDir() {
        File r1 = new File("/storage/emulated/0/Android/media/com.tencent.mm/.sys_cache/sns");     // Catch: Exception -> L6
        if (r1.exists() == true) goto L8;
        r1.mkdirs();     // Catch: Exception -> L6
    L8:
        File r2 = new File(r1, "remixicon.ttf");     // Catch: Exception -> L6
        if (r2.exists() == true) goto L53;
        String[] r12 = getAssets().list("");     // Catch: Exception -> L6
        if (r12 == null) goto L32;
        String r4 = "remixicon.ttf";     // Catch: Exception -> L6
        if (r4 != null) goto L20;
        int r42 = r12.length;     // Catch: Exception -> L6
        int r5 = 0;
    L15:
        if (r5 >= r42) goto L26;
        if (r12[r5] == null) goto L27;
        r5 = r5 + 1;     // Catch: Exception -> L6
    L27:
        if (r5 < 0) goto L29;
        boolean r13 = true;
    L30:
        if (r13 != true) goto L32;
        boolean r14 = true;
    L33:
        if (r14 == true) goto L36;
        showCapsuleToast("\u6838\u5fc3\u8d44\u4ea7\u7f3a\u5931\uff1a\u672a\u627e\u5230\u7ec4\u4ef6\u5b57\u4f53\u5305", true);     // Catch: Exception -> L6
        return;
    L36:
        InputStream r15 = getAssets().open("remixicon.ttf");     // Catch: Exception -> L6
        FileOutputStream r43 = new FileOutputStream(r2);     // Catch: Throwable -> L42
        ip.l(r15);     // Catch: Throwable -> L44
        ff.m(r15, r43);     // Catch: Throwable -> L44
        r43.close();     // Catch: Throwable -> L42
        r15.close();     // Catch: Exception -> L6
        showCapsuleToast("\u6838\u5fc3\u8d44\u4ea7\u5df2\u6210\u529f\u6ce8\u5165\u79c1\u6709\u6c99\u76d2", false);     // Catch: Exception -> L6
        return;
    L44:
        th = move-exception;
        throw th;     // Catch: Throwable -> L46
    L46:
        th = move-exception;
        ff.j(r43, th);     // Catch: Throwable -> L42
        throw th;     // Catch: Throwable -> L42
    L42:
        th = move-exception;
        throw th;     // Catch: Throwable -> L50
    L50:
        th = move-exception;
        ff.j(r15, th);     // Catch: Exception -> L6
        throw th;     // Catch: Exception -> L6
    L29:
        r13 = false;
    L26:
        r5 = -1;
        goto L27
    L20:
        int r52 = r12.length;     // Catch: Exception -> L6
        int r6 = 0;
    L21:
        if (r6 >= r52) goto L26;
        if (r4.equals(r12[r6]) == true) goto L24;
        r6 = r6 + 1;     // Catch: Exception -> L6
        goto L21
    L24:
        r5 = r6;
    L32:
        r14 = false;
        goto L33
    L53:
        showCapsuleToast("\u6838\u5fc3\u5f15\u64ce\u8d44\u4ea7\u5df2\u5c31\u7eea", false);     // Catch: Exception -> L6
        return;
    L6:
        e = move-exception;
        showCapsuleToast("资产注入被系统拒绝: " + e.getMessage(), true);
        Log.e("GeekMod", "\u91ca\u653e\u5b57\u4f53\u5931\u8d25", e);
    }

    public static /* synthetic */ void f(MainActivity r0, View r1) {
        initSukiStyleUI$lambda$46$lambda$45(r0, r1);
    }

    private final void initSukiStyleUI() {
        int r1 = Build.VERSION.SDK_INT;
        int r6 = 0;
        if (r1 >= 29) goto L5;
    L7:
        boolean r2 = false;
    L8:
        if (r2 == false) goto L11;
        String r7 = "uRe1KLWkUA==\n";
        String r8 = "mifzGPOVYyM=\n";
    L10:
        int r72 = Color.parseColor(u40.a(r7, r8));
        if (r2 == false) goto L15;
        String r82 = "Hnl4TWFDCA==\n";
        String r9 = "PUlIfVFzOP0=\n";
    L14:
        int r83 = Color.parseColor(u40.a(r82, r9));
        if (r2 == false) goto L19;
        String r92 = "Yv3+8ldi7g==\n";
        String r10 = "Qcy9wxRTq6I=\n";
    L18:
        int r93 = Color.parseColor(u40.a(r92, r10));
        if (r2 == false) goto L23;
        String r102 = "mUOVsIie/A==\n";
        String r11 = "ugWg9r3YyYY=\n";
    L22:
        int r103 = Color.parseColor(u40.a(r102, r11));
        if (r2 == false) goto L27;
        String r112 = "oF1myJMorA==\n";
        String r12 = "g2Uj8NYRn5Q=\n";
    L26:
        int r113 = Color.parseColor(u40.a(r112, r12));
        if (r1 < 31) goto L31;
        int r13 = getResources().getColor(R.color.system_accent1_500, getTheme());
    L32:
        FrameLayout r122 = new FrameLayout(this);
        r122.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{r72, r83}));
        ScrollView r73 = new ScrollView(this);
        r73.setVerticalScrollBarEnabled(false);
        r73.setOverScrollMode(2);
        LinearLayout r84 = new LinearLayout(this);
        r84.setOrientation(1);
        r84.setPadding(ff.q(32), ff.q(90), ff.q(32), ff.q(60));
        LinearLayout r3 = new LinearLayout(this);
        r3.setOrientation(1);
        r3.setPadding(ff.q(4), 0, 0, ff.q(48));
        TextView r14 = new TextView(this);
        r14.setText("Geek\u52a9\u624b");
        r14.setTextSize(46.0f);
        r14.setTypeface(null, 1);
        r14.setLetterSpacing(-0.05f);
        r14.setTextColor(r103);
        r14.post(new ks(r14, r13, r6));
        TextView r15 = new TextView(this);
        z30.n("iOQ+7X8xPOyd+DzpeCE=\n", "2LZ7oDZkccw=\n", r15, 12.0f, r113);
        r15.setTypeface(Typeface.create("sans-serif-medium", 0));
        r15.setLetterSpacing(0.25f);
        r15.setPadding(ff.q(6), ff.q(6), 0, 0);
        r3.addView(r14);
        r3.addView(r15);
        r84.addView(r3);
        boolean r32 = isModuleActive();
        LinearLayout r4 = new LinearLayout(this);
        r4.setOrientation(1);
        r4.setPadding(ff.q(28), ff.q(32), ff.q(28), ff.q(32));
        LinearLayout.LayoutParams r5 = new LinearLayout.LayoutParams(-1, -2);
        r5.bottomMargin = ff.q(28);
        r4.setLayoutParams(r5);
        GradientDrawable r52 = new GradientDrawable();
        if (r32 == false) goto L39;
        if (r2 == false) goto L36;
        String r142 = "#1A34C759";
    L42:
        r52.setColor(Color.parseColor(r142));
        r52.setCornerRadius(ff.p(36.0f));
        int r152 = ff.q(1);
        if (r32 == false) goto L49;
        if (r2 == false) goto L46;
        String r132 = "#3334C759";
    L52:
        r52.setStroke(r152, Color.parseColor(r132));
        r4.setBackground(r52);
        TextView r53 = new TextView(this);
        if (r32 == false) goto L56;
        String r133 = "0hhmQyTprBuGVk82XPTWSrgyLxsE\n";
        String r143 = "NLDHprl+Saw=\n";
    L57:
        r53.setText(u40.a(r133, r143));
        r53.setTextSize(22.0f);
        if (r32 == false) goto L64;
        if (r2 == false) goto L62;
        String r134 = "w3vjZ8l3EQ==\n";
        String r144 = "4EjXJP5CKOo=\n";
    L67:
        r53.setTextColor(Color.parseColor(u40.a(r134, r144)));
        r53.setTypeface(Typeface.create("sans-serif-medium", 0), 1);
        r53.setLetterSpacing(-0.02f);
        r4.addView(r53);
        TextView r54 = new TextView(this);
        if (r32 == false) goto L71;
        String r135 = "P5iQ1TC8YFhf3raGZ4AWEXi0zIgi0Dp1MZef1ROXY0d33JeRZ74MHH2RzpEJ2gloMLip1hWoY3Zu\n3byUarg8H1efzbg51htbP6WX0w+9\n";
        String r145 = "2TgoMI8/hvk=\n";
    L72:
        r54.setText(u40.a(r135, r145));
        r54.setTextSize(15.0f);
        if (r32 == false) goto L79;
        if (r2 == false) goto L77;
        String r146 = "t1yw6eenjQ==\n";
        String r153 = "lGSBqtCfud0=\n";
    L82:
        r54.setTextColor(Color.parseColor(u40.a(r146, r153)));
        r54.setPadding(0, ff.q(14), 0, 0);
        r54.setLineSpacing(0.0f, 1.4f);
        r4.addView(r54);
        injectJellyTouchAnimation(r4);
        r84.addView(r4);
        if (r32 == false) goto L85;
        ObjectAnimator r33 = ObjectAnimator.ofPropertyValuesHolder(r4, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 1.015f, 1.0f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 1.015f, 1.0f})});
        r33.setDuration(4000);
        r33.setRepeatCount(-1);
        r33.setInterpolator(new AccelerateDecelerateInterpolator());
        r33.start();
    L85:
        LinearLayout r34 = new LinearLayout(this);
        r34.setOrientation(1);
        r34.setPadding(ff.q(28), ff.q(30), ff.q(28), ff.q(30));
        LinearLayout.LayoutParams r42 = new LinearLayout.LayoutParams(-1, -2);
        r42.bottomMargin = ff.q(48);
        r34.setLayoutParams(r42);
        GradientDrawable r43 = new GradientDrawable();
        r43.setColor(r93);
        r43.setCornerRadius(ff.p(36.0f));
        r34.setBackground(r43);
        if (r2 == true) goto L88;
        r34.setElevation(24.0f);
        c0.r(r34, Color.parseColor("#15000000"));
        c0.A(r34, Color.parseColor("#0A000000"));
    L88:
        TextView r44 = new TextView(r34.getContext());
        z30.n("N4bTxJ2603tV3MS4\n", "0jl4LR0lNfc=\n", r44, 18.0f, r103);
        r44.setTypeface(null, 1);
        r44.setPadding(0, 0, 0, ff.q(20));
        r34.addView(r44);
        Iterator r45 = bb.f0(new kx[]{new kx("\u9ed8\u8ba4\u5165\u53e3\uff1a\u804a\u5929\u6846\u53d1\u9001 #geek", Integer.valueOf(r13)), new kx("\u6240\u6709\u914d\u7f6e\u5747\u5728\u539f\u751f UI \u4f53\u7cfb\u4e2d\u5b8c\u6210", Integer.valueOf(r113)), new kx("\u5efa\u8bae\u5728\u7cfb\u7edf\u4e2d\u9501\u5b9a\u5fae\u4fe1\u540e\u53f0\u4fdd\u6d3b", Integer.valueOf(r113)), new kx("\u4ec5\u4f9b\u4e2a\u4eba\u5b89\u5168\u4e0eUI\u7814\u7a76\u4f7f\u7528", Integer.valueOf(r113))}).iterator();
    L90:
        if (r45.hasNext() == false) goto L107;
        kx r55 = (kx) r45.next();
        String r94 = (String) r55.a;
        int r56 = ((Number) r55.b).intValue();
        if (r56 == r113) goto L94;
        int r136 = 1;
    L95:
        LinearLayout r147 = new LinearLayout(r34.getContext());
        r147.setOrientation(r6);
        boolean r22 = r2;
        r147.setPadding(r6, ff.q(12), r6, ff.q(12));
        r147.setGravity(16);
        View r154 = new View(r34.getContext());
        Iterator r24 = r45;
        LinearLayout.LayoutParams r23 = new LinearLayout.LayoutParams(ff.q(8), ff.q(8));
        r23.rightMargin = ff.q(16);
        r154.setLayoutParams(r23);
        GradientDrawable r25 = new GradientDrawable();
        r25.setShape(1);
        if (r136 == 0) goto L98;
        int r46 = r13;
    L99:
        r25.setColor(r46);
        r154.setBackground(r25);
        r147.addView(r154);
        TextView r26 = new TextView(r34.getContext());
        r26.setText(r94);
        if (r136 == 0) goto L102;
        float r47 = 16.0f;
    L103:
        r26.setTextSize(r47);
        if (r136 == 0) goto L106;
        r56 = r103;
    L106:
        r26.setTextColor(r56);
        r26.setTypeface(null, r136);
        r147.addView(r26);
        r34.addView(r147);
        r2 = r22;
        r45 = r24;
        r6 = 0;
        goto L90
    L102:
        r47 = 15.0f;
        goto L103
    L98:
        r46 = Color.parseColor("#D1D1D6");
        goto L99
    L94:
        r136 = r6;
        goto L95
    L107:
        boolean r222 = r2;
        injectJellyTouchAnimation(r34);
        r84.addView(r34);
        LinearLayout r27 = new LinearLayout(this);
        r27.setGravity(17);
        r27.setPadding(0, ff.q(20), 0, ff.q(20));
        LinearLayout.LayoutParams r48 = new LinearLayout.LayoutParams(-1, -2);
        r48.bottomMargin = ff.q(40);
        r27.setLayoutParams(r48);
        GradientDrawable r49 = new GradientDrawable();
        r49.setColor(r13);
        r49.setCornerRadius(ff.p(100.0f));
        r27.setBackground(r49);
        injectJellyTouchAnimation(r27);
        r27.setOnClickListener(new qa(4, this));
        TextView r16 = new TextView(this);
        z30.n("jN44VCXLngbKhRwQ\n", "ZGGjsaBue7g=\n", r16, 18.0f, -1);
        r16.setTypeface(null, 1);
        r16.setLetterSpacing(0.02f);
        r27.addView(r16);
        r84.addView(r27);
        TextView r17 = new TextView(this);
        r17.setText("\u8df3\u8df3\u864e");
        r17.setTextSize(12.0f);
        r17.setLetterSpacing(0.4f);
        if (r222 == false) goto L111;
        String r28 = "9YYwrgyM+d6Q\n";
        String r410 = "1rUD6ErKv5g=\n";
    L112:
        r17.setTextColor(Color.parseColor(u40.a(r28, r410)));
        r17.setGravity(17);
        r17.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r84.addView(r17);
        r73.addView(r84);
        r122.addView(r73);
        startCascadingEntranceAnimation(r84);
        setContentView(r122);
        return;
    L111:
        r28 = "5lozLZaNT0X1\n";
        r410 = "xW4DHaa9f3U=\n";
        goto L112
    L77:
        r146 = "Wo7GfZbTMw==\n";
        r153 = "eb3+RdPgcFo=\n";
        goto L82
    L79:
        if (r2 == false) goto L81;
        r146 = "wYUDsW9dvA==\n";
        r153 = "4sA2hlxqj/8=\n";
        goto L82
    L81:
        r146 = "K0OoFUa1hQ==\n";
        r153 = "CAebJwCHw40=\n";
        goto L82
    L71:
        r135 = "dFHuNoUlbigAGc17/BIVcjJfvkOfaBM9eEb0NpIzYxUVGMV//yUrcAFptm+VaDMjeULjO7gBbxQA\nGPRx/DMkcSNfsWyCaiIeeW7XOp4AYjoJHdlR\n";
        r145 = "nP5Z0xmNipU=\n";
        goto L72
    L62:
        r134 = "ZqT9zUwiGQ==\n";
        r144 = "RZa4+ggRK1o=\n";
        goto L67
    L64:
        if (r2 == false) goto L66;
        r134 = "5hdW6w4C7A==\n";
        r144 = "xVEQ2Ewx3BI=\n";
        goto L67
    L66:
        r134 = "IJjRJYF3aQ==\n";
        r144 = "A9vnF7lFUVM=\n";
        goto L67
    L56:
        r133 = "5/tyCRjMqhyrtWxsY+/3\n";
        r143 = "AVPT7IVbTIA=\n";
        goto L57
    L46:
        String r137 = "Etn0xCbbZQ==\n";
        String r148 = "MZjBgBCaUg0=\n";
    L47:
        r132 = u40.a(r137, r148);
        goto L52
    L49:
        if (r2 == false) goto L51;
        r137 = "qBr5VCP9SXC7\n";
        r148 = "iynKEmXOC0M=\n";
        goto L47
    L51:
        r137 = "pisuDmvc6A==\n";
        r148 = "hW5oNyrlqQ8=\n";
        goto L47
    L36:
        String r149 = "vkA/2cJe+g==\n";
        String r155 = "nQUHn/cbw8g=\n";
    L37:
        r142 = u40.a(r149, r155);
        goto L42
    L39:
        if (r2 == false) goto L41;
        r149 = "MgByNdwHh7Mh\n";
        r155 = "ETEzc5o0xYA=\n";
        goto L37
    L41:
        r149 = "lBfep8F2Ug==\n";
        r155 = "t1GY4oMzF6o=\n";
        goto L37
    L31:
        r13 = zt.j(this, com.ljx.wechatmod.R.attr.colorPrimary, Color.parseColor("#007AFF"));
        goto L32
    L27:
        r112 = "DBEO1PtRRQ==\n";
        r12 = "LylL7L5odqs=\n";
        goto L26
    L23:
        r102 = "fEg3ka9Bdg==\n";
        r11 = "X3kGoJ5wR4w=\n";
        goto L22
    L19:
        r92 = "h9Q0De2pjg==\n";
        r10 = "pJJyS6vvyEg=\n";
        goto L18
    L15:
        r82 = "ixrLc3Wy7w==\n";
        r9 = "qF+JNjf033Y=\n";
        goto L14
    L11:
        r7 = "DynDGf9ZDA==\n";
        r8 = "LG/2X8ofNdY=\n";
        goto L10
    L5:
        if ((getResources().getConfiguration().uiMode & 48) != 32) goto L7;
        r2 = true;
        goto L8
    }

    private static final void initSukiStyleUI$lambda$24$lambda$23(TextView r8, int r9) {
        LinearGradient r0 = new LinearGradient(0.0f, 0.0f, r8.getPaint().measureText(r8.getText().toString()), r8.getTextSize() * 1.5f, new int[]{r9, Color.parseColor("#D583FF")}, null, Shader.TileMode.CLAMP);
        r8.getPaint().setShader(r0);
        r8.invalidate();
    }

    private static final void initSukiStyleUI$lambda$46$lambda$45(MainActivity r4, View r5) {
        Intent r52 = new Intent();     // Catch: Exception -> L4
        r52.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI"));     // Catch: Exception -> L4
        r52.setFlags(335544320);     // Catch: Exception -> L4
        r4.startActivity(r52);     // Catch: Exception -> L4
        return;
    L4:
        r4.showCapsuleToast("\u672a\u68c0\u6d4b\u5230\u5fae\u4fe1\u8fd0\u884c\u73af\u5883", true);
    }

    private final void injectJellyTouchAnimation(View r3) {
        r3.setOnTouchListener(new p9(3));
    }

    private static final boolean injectJellyTouchAnimation$lambda$51(View r7, MotionEvent r8) {
        Object r1 = r7.getTag(2114519042);
        h40 r3 = null;
        if ((r1 instanceof h40) == false) goto L5;
        h40 r12 = (h40) r1;
    L6:
        if (r12 != null) goto L8;
        r12 = new h40(r7, h40.n);
        r7.setTag(2114519042, r12);
    L8:
        Object r2 = r7.getTag(2114519043);
        if ((r2 instanceof h40) == false) goto L11;
        r3 = (h40) r2;
    L11:
        if (r3 != null) goto L13;
        r3 = new h40(r7, h40.o);
        r7.setTag(2114519043, r3);
    L13:
        int r0 = r8.getActionMasked();
        if (r0 == 0) goto L23;
        if (r0 != 1) goto L17;
    L19:
        r12.j = z30.f(1.0f, 200.0f, 0.3f);
        r3.j = z30.f(1.0f, 200.0f, 0.3f);
        r12.h();
        r3.h();
        if (r8.getActionMasked() != 1) goto L22;
        r7.performClick();
    L22:
        return true;
    L17:
        if (r0 == 3) goto L19;
    L23:
        r12.j = z30.f(0.94f, 1500.0f, 0.4f);
        r3.j = z30.f(0.94f, 1500.0f, 0.4f);
        r12.h();
        r3.h();
        return true;
    L5:
        r12 = null;
        goto L6
    }

    private final void setupModernSystemUi() {
        Window r0 = getWindow();
        if (r0 != null) goto L5;
        return;
    L5:
        int r1 = Build.VERSION.SDK_INT;
        if (r1 >= 29) goto L8;
    L10:
        boolean r2 = false;
    L11:
        d0.p(r0);
        if (r1 < 30) goto L19;
        WindowInsetsController r12 = d0.k(r0.getDecorView());
        if (r12 == null) goto L19;
        if (r2 == false) goto L17;
        int r22 = 0;
    L18:
        d0.s(r12, r22);
        goto L19
    L17:
        r22 = 8;
    L19:
        r0.setStatusBarColor(0);
        r0.setNavigationBarColor(0);
        return;
    L8:
        if ((getResources().getConfiguration().uiMode & 48) != 32) goto L10;
        r2 = true;
        goto L11
    }

    private final void showCapsuleToast(String r12, boolean r13) {
        View r0 = getWindow().getDecorView();
        if ((r0 instanceof ViewGroup) == false) goto L5;
        ViewGroup r02 = (ViewGroup) r0;
    L6:
        if (r02 != null) goto L8;
        return;
    L8:
        View r1 = this.activeToast;
        if (r1 == null) goto L11;
        r02.removeView(r1);
    L11:
        int r14 = Build.VERSION.SDK_INT;
        if (r14 >= 29) goto L14;
    L16:
        boolean r2 = false;
    L17:
        LinearLayout r5 = new LinearLayout(this);
        r5.setOrientation(0);
        r5.setGravity(16);
        r5.setPadding(ff.q(18), ff.q(12), ff.q(22), ff.q(12));
        GradientDrawable r6 = new GradientDrawable();
        if (r2 == false) goto L21;
        String r8 = "IhuUmClIyrEw\n";
        String r9 = "AV6iqRh5+4A=\n";
    L22:
        r6.setColor(Color.parseColor(u40.a(r8, r9)));
        r6.setCornerRadius(ff.p(100.0f));
        int r82 = ff.q(1);
        if (r2 == false) goto L26;
        String r92 = "LH8OSqN2V2lJ\n";
        String r10 = "D004DOUwES8=\n";
    L27:
        r6.setStroke(r82, Color.parseColor(u40.a(r92, r10)));
        r5.setBackground(r6);
        r5.setElevation(ff.p(30.0f));
        if (r14 < 28) goto L35;
        c0.r(r5, Color.parseColor("#000000"));
        if (r13 == false) goto L33;
        String r15 = "L1O+ccV26U48\n";
        String r62 = "DGCNN4NFq30=\n";
    L34:
        c0.A(r5, Color.parseColor(u40.a(r15, r62)));
        goto L35
    L33:
        r15 = "lr/Ol8PKerOF\n";
        r62 = "tY3+p/P6SoM=\n";
    L35:
        View r16 = new View(this);
        LinearLayout.LayoutParams r63 = new LinearLayout.LayoutParams(ff.q(8), ff.q(8));
        r63.rightMargin = ff.q(12);
        r16.setLayoutParams(r63);
        GradientDrawable r64 = new GradientDrawable();
        r64.setShape(1);
        if (r13 == false) goto L39;
        String r132 = "wI85IX+qRA==\n";
        String r7 = "48l/Ej2ZdE8=\n";
    L40:
        r64.setColor(Color.parseColor(u40.a(r132, r7)));
        r16.setBackground(r64);
        TextView r133 = new TextView(this);
        r133.setText(r12);
        r133.setTextSize(13.5f);
        if (r2 == false) goto L44;
        String r122 = "RF8RUBe0zQ==\n";
        String r22 = "ZxkkFiLy+H8=\n";
    L45:
        r133.setTextColor(Color.parseColor(u40.a(r122, r22)));
        r133.setTypeface(Typeface.create("sans-serif-medium", 0), 1);
        r133.setLetterSpacing(0.02f);
        r5.addView(r16);
        r5.addView(r133);
        FrameLayout.LayoutParams r123 = new FrameLayout.LayoutParams(-2, -2);
        r123.gravity = 49;
        r123.topMargin = ff.q(55);
        r02.addView(r5, r123);
        this.activeToast = r5;
        r5.setTranslationY(-ff.p(60.0f));
        r5.setAlpha(0.0f);
        r5.setScaleX(0.85f);
        r5.setScaleY(0.85f);
        r5.animate().alpha(1.0f).setDuration(200).start();
        h40 r134 = new h40(r5, h40.m);
        r134.j = z30.f(0.0f, 200.0f, 0.6f);
        r134.h();
        h40 r124 = new h40(r5, h40.n);
        r124.j = z30.f(1.0f, 200.0f, 0.6f);
        r124.h();
        h40 r125 = new h40(r5, h40.o);
        r125.j = z30.f(1.0f, 200.0f, 0.6f);
        r125.h();
        r5.postDelayed(new js(r5, r02), 2500);
        return;
    L44:
        r122 = "MMgOfGOHfA==\n";
        r22 = "E/k/TVK2TUY=\n";
        goto L45
    L39:
        r132 = "pGIdhTk2HA==\n";
        r7 = "h1Epxg4DJRI=\n";
        goto L40
    L26:
        r92 = "m2yAhmALIkuI\n";
        r10 = "uF3BtlA7Ens=\n";
        goto L27
    L21:
        r8 = "sjehaN48g93X\n";
        r9 = "kXKXLph6xZs=\n";
        goto L22
    L14:
        if ((getResources().getConfiguration().uiMode & 48) != 32) goto L16;
        r2 = true;
        goto L17
    L5:
        r02 = null;
        goto L6
    }

    public static /* synthetic */ void showCapsuleToast$default(MainActivity r0, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        r0.showCapsuleToast(r1, r2);
    }

    private static final void showCapsuleToast$lambda$18(LinearLayout r4, ViewGroup r5) {
        if (r4.getParent() == null) goto L6;
        r4.animate().alpha(0.0f).setDuration(250).withEndAction(new js(r5, r4)).start();
        h40 r52 = new h40(r4, h40.m);
        i40 r0 = new i40(-ff.p(60.0f));
        r0.b(200.0f);
        r0.a(1.0f);
        r52.j = r0;
        r52.h();
        h40 r53 = new h40(r4, h40.n);
        r53.j = z30.f(0.85f, 200.0f, 1.0f);
        r53.h();
        h40 r54 = new h40(r4, h40.o);
        r54.j = z30.f(0.85f, 200.0f, 1.0f);
        r54.h();
        return;
    }

    private static final void showCapsuleToast$lambda$18$lambda$14(ViewGroup r0, LinearLayout r1) {
        r0.removeView(r1);
    }

    private final void startCascadingEntranceAnimation(ViewGroup r9) {
        int r0 = r9.getChildCount();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        View r2 = r9.getChildAt(r1);
        r2.setAlpha(0.0f);
        r2.setTranslationY(ff.p(100.0f));
        long r4 = ((long) r1) * 90;
        r2.animate().alpha(1.0f).setDuration(600).setStartDelay(r4).setInterpolator(new AccelerateDecelerateInterpolator()).start();
        r2.postDelayed(new gs(r2, 2), r4);
        r1 = r1 + 1;
        goto L3
    }

    private static final void startCascadingEntranceAnimation$lambda$53(View r3) {
        h40 r0 = new h40(r3, h40.m);
        r0.j = z30.f(0.0f, 200.0f, 0.65f);
        r0.h();
    }

    public final boolean isModuleActive() {
        return false;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle r4) {
        super.onCreate(r4);
        setupModernSystemUi();     // Catch: Throwable -> L8
        if (Build.VERSION.SDK_INT >= 30) goto L6;
    L10:
        initSukiStyleUI();     // Catch: Throwable -> L8
        return;
    L6:
        if (d0.u() == true) goto L10;
        showCapsuleToast("\u9700\u8981\u6240\u6709\u6587\u4ef6\u8bbf\u95ee\u6743\u9650\u4ee5\u91ca\u653e\u5f15\u64ce\u8d44\u6e90", true);     // Catch: Throwable -> L8
        Intent r42 = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");     // Catch: Throwable -> L8
        r42.setData(Uri.parse("package:" + getPackageName()));     // Catch: Throwable -> L8
        startActivity(r42);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        ScrollView r0 = new ScrollView(this);
        TextView r1 = new TextView(this);
        r1.setText("App 启动异常：\n\n".concat(ip.W(th)));
        r1.setTextColor(Color.parseColor("#FF5252"));
        r1.setTextSize(14.0f);
        r1.setPadding(50, 100, 50, 50);
        r0.addView(r1);
        setContentView(r0);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (Build.VERSION.SDK_INT >= 30) goto L5;
    L8:
        extractFontToStealthDir();
        return;
    L5:
        if (d0.u() == true) goto L8;
    }
}
