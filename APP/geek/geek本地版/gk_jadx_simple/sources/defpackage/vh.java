package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.hardware.SensorManager;
import android.os.Handler;
import android.text.Editable;
import android.text.Selection;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public class vh implements fe, cv {
    public static final /* synthetic */ vh b = null;
    public static final /* synthetic */ vh c = null;
    public static float d = -1.0f;
    public static float e;
    public static float f;
    public static float g;
    public static final /* synthetic */ vh h = null;
    public static final vh i = null;
    public static final vh j = null;
    public static SensorManager k;
    public static final m80 l = null;
    public static final vh m = null;
    public static final vh n = null;
    public static final vh o = null;
    public static final vh p = null;
    public final /* synthetic */ int a;

    static {
        b = new vh(1);
        c = new vh(2);
        h = new vh(4);
        i = new vh(5);
        j = new vh(7);
        l = new m80();
        m = new vh(9);
        n = new vh(10);
        o = new vh(11);
        p = new vh(12);
    }

    public /* synthetic */ vh(int r1) {
        this.a = r1;
    }

    public static final void b(ViewGroup r18, e9 r19, g9 r20, MotionEvent r21, f9 r22, XC_MethodHook.MethodHookParam r23, boolean r24) {
        Object r3 = r22.a;
        Object r5 = r18.getTag(2114191365);
        if ((r5 instanceof VelocityTracker) == false) goto L5;
        VelocityTracker r52 = (VelocityTracker) r5;
    L7:
        if (r52 == null) goto L9;
        r52.addMovement(r21);
    L9:
        if (r52 == null) goto L11;
        r52.computeCurrentVelocity(1000);
    L11:
        if (r52 == null) goto L13;
        float r9 = r52.getXVelocity();
    L14:
        float r92 = Math.max(-2500.0f, Math.min(2500.0f, r9));
        if (r52 == null) goto L17;
        r52.recycle();
    L17:
        r18.setTag(2114191365, null);
        if (r20.c == false) goto L215;
        float r4 = r21.getRawX() - r20.a;
        if (r20.d == true) goto L156;
        if (r24 == true) goto L156;
        float r6 = f;
        if (r4 >= (-r6)) goto L73;
        r20.d = true;
        Context r0 = r18.getContext();
        View r42 = r18.getRootView();
        ip.o(u40.a("teC9MYNzUg==\n", "2JPaeO0VPTc=\n"), r3);
        if ((r0 instanceof Activity) == false) goto L27;
        Activity r62 = (Activity) r0;
    L28:
        if (r62 == null) goto L156;
        if (r42 == null) goto L156;
        String r14 = pb0.j0;
        if (r14.length() == 0) goto L156;
        i00 r02 = new i00();     // Catch: Throwable -> L39
        gt.G(r02, r42);     // Catch: Throwable -> L39
        if (r02.b != null) goto L223;
        gn r03 = gn.a;     // Catch: Throwable -> L39
        String r32 = u40.a("9MViuAr3BC2ipGLPV/9EQ7PK\n", "EkzcXLJ64aU=\n");     // Catch: Throwable -> L39
        r03.getClass();     // Catch: Throwable -> L39
        gn.k(r62, r32);     // Catch: Throwable -> L39
        goto L156
    L223:
        Class r43 = XposedHelpers.findClassIfExists(pb0.o, d9.a);     // Catch: Throwable -> L53
        if (r43 == null) goto L156;
        Object r10 = r02.b;     // Catch: Throwable -> L53
        ip.l(r10);     // Catch: Throwable -> L53
        Method[] r102 = r10.getClass().getMethods();     // Catch: Throwable -> L53
        ip.n(u40.a("0EI0LiMiE0zTVGhNaHhS\n", "tydAY0ZWeyM=\n"), r102);     // Catch: Throwable -> L53
        int r7 = r102.length;     // Catch: Throwable -> L53
        int r11 = 0;
    L44:
        if (r11 >= r7) goto L57;
        Method r17 = r102[r11];     // Catch: Throwable -> L53
        if (ip.i(r17.getName(), r14) == false) goto L55;
        Class<?>[] r13 = r17.getParameterTypes();     // Catch: Throwable -> L53
        int r222 = r7;
        Method[] r242 = r102;
        ip.n(u40.a("zeRpcYpEACfP9XhTv08RL9mpMw/FHw==\n", "qoEdIes2YUo=\n"), r13);     // Catch: Throwable -> L53
        if (r13.length != 0) goto L51;
    L56:
        r11 = r11 + 1;     // Catch: Throwable -> L53
        r7 = r222;
        r102 = r242;
        goto L44
    L51:
        if (ip.i(r17.getParameterTypes()[0], r43) == false) goto L56;
        Method r44 = r17;
    L58:
        if (r44 == null) goto L66;
        r44.setAccessible(true);     // Catch: Throwable -> L53
        if (r44.getParameterTypes().length != 1) goto L63;
        r44.invoke(r02.b, new Object[]{r3});     // Catch: Throwable -> L53
        goto L156
    L63:
        if (r44.getParameterTypes().length != 2) goto L65;
        r44.invoke(r02.b, new Object[]{r3, null});     // Catch: Throwable -> L53
        goto L156
    L65:
        gn.a.getClass();     // Catch: Throwable -> L53
        gn.k(r62, "引用异常: 方法 [" + r14 + "] 参数数量异常");     // Catch: Throwable -> L53
        goto L156
    L66:
        gn.a.getClass();     // Catch: Throwable -> L53
        gn.k(r62, "引用执行失败: 找不到名为 [" + r14 + "] 且接收消息体的方法");     // Catch: Throwable -> L53
        goto L156
    L55:
        r222 = r7;
        r242 = r102;
        goto L56
    L57:
        r44 = null;
    L53:
        th = move-exception;
        gn r33 = gn.a;     // Catch: Throwable -> L39
        String r04 = "引用执行崩溃: " + th.getMessage();     // Catch: Throwable -> L39
        r33.getClass();     // Catch: Throwable -> L39
        gn.k(r62, r04);     // Catch: Throwable -> L39
        ip.o(u40.a("Nwje\n", "Q2m5jaPP2Zc=\n"), "QuoteAction_Exec_Failed targetMethod: " + r14);     // Catch: Throwable -> L39
        u40.a("Fg==\n", "c8HJlSTQVfc=\n");     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        gn r34 = gn.a;
        String r05 = "寻找输入框异常: " + th.getMessage();
        r34.getClass();
        gn.k(r62, r05);
        String r06 = u40.a("ayoZI+6neLRTMBgIzY91pGUZFz7ng38=\n", "Ol92V4vmG8A=\n");
    L71:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", r06, "Fg==\n", "c8HJlSTQVfc=\n");
        goto L156
    L27:
        r62 = null;
        goto L28
    L73:
        if (r4 <= r6) goto L156;
        r20.d = true;
        Context r45 = r18.getContext();
        int r63 = r22.b;
        String r72 = r22.c;
        ip.o(u40.a("0MssZ47jRA==\n", "vbhLLuCFKyc=\n"), r3);
        ip.o(u40.a("y5AfGhZ6\n", "v/FzcXMI+WM=\n"), r72);
        if ((r45 instanceof Activity) == false) goto L77;
        Activity r46 = (Activity) r45;
    L78:
        if (r46 == null) goto L156;
        String r132 = "";
        if (r63 != 1) goto L83;
        Field r103 = in.h;     // Catch: Throwable -> L95
        if (r103 == null) goto L138;
        Object r35 = r103.get(r3);     // Catch: Throwable -> L95
    L140:
        if ((r35 instanceof String) == false) goto L142;
        String r36 = (String) r35;     // Catch: Throwable -> L95
    L143:
        if (r36 == null) goto L147;
        r132 = r36;
    L147:
        if (b50.C(r72, u40.a("n5826w2a2sSy\n", "3/xeinnotas=\n")) == true) goto L149;
    L151:
        Handler r37 = uv.a;     // Catch: Throwable -> L95
        String r38 = uv.f(d9.a, r72, r132);     // Catch: Throwable -> L95
        if (ip.i(r38, u40.a("MUIip2JuaA==\n", "Yhdh5Cc9O/E=\n")) == true) goto L156;
        gn.a.getClass();     // Catch: Throwable -> L95
        gn.k(r46, "文本复读中断: " + r38);     // Catch: Throwable -> L95
        goto L156
    L149:
        if (b50.B(r132, u40.a("ERA=\n", "Kxq7Ss0V0Xw=\n"), false) == false) goto L151;
        r132 = b50.T(b50.O(r132, u40.a("AOw=\n", "Oubo4euCjgA=\n"))).toString();     // Catch: Throwable -> L95
        goto L151
    L142:
        r36 = null;
        goto L143
    L138:
        r35 = null;
        goto L140
    L83:
        if (r63 != 3) goto L85;
    L134:
        gn r07 = gn.a;     // Catch: Throwable -> L95
        String r39 = u40.a("KKTcJ4jj+e1quYtikIFyiCWQ2SW78TO0T9jTe+f+VONRlYRPkYFZkw==\n", "zT9iwAFk1gU=\n");     // Catch: Throwable -> L95
        r07.getClass();     // Catch: Throwable -> L95
        gn.k(r46, r39);     // Catch: Throwable -> L95
        goto L156
    L85:
        if (r63 != 34) goto L87;
        Field r08 = in.g;     // Catch: Throwable -> L95
        if (r08 == null) goto L120;
        Object r09 = r08.get(r3);     // Catch: Throwable -> L95
    L122:
        if ((r09 instanceof String) == false) goto L124;
        String r010 = (String) r09;     // Catch: Throwable -> L95
    L125:
        if (r010 == null) goto L129;
        r132 = r010;
    L129:
        if (r132.length() <= 0) goto L133;
        Handler r011 = uv.a;     // Catch: Throwable -> L95
        String r012 = uv.e(d9.a, r72, r132, r46);     // Catch: Throwable -> L95
        if (ip.i(r012, u40.a("T14cfq7xrQ==\n", "HAtfPeui/m0=\n")) == true) goto L156;
        gn.a.getClass();     // Catch: Throwable -> L95
        gn.k(r46, "语音复读中断: " + r012);     // Catch: Throwable -> L95
        goto L156
    L133:
        gn r013 = gn.a;     // Catch: Throwable -> L95
        String r310 = u40.a("ryjUChkzwZD7ZO1HjKjCo+pq6ndeBpPRxRqxTRthu4eiO/YHCAw=\n", "SoxZ4raIJDQ=\n");     // Catch: Throwable -> L95
        r013.getClass();     // Catch: Throwable -> L95
        gn.k(r46, r310);     // Catch: Throwable -> L95
        goto L156
    L124:
        r010 = null;
        goto L125
    L120:
        r09 = null;
        goto L122
    L87:
        if (r63 == 43) goto L134;
        if (r63 != 47) goto L91;
        gt.w(r46, r3, r72);     // Catch: Throwable -> L95
        goto L156
    L91:
        if (r63 != 49) goto L93;
    L97:
        Field r014 = in.h;     // Catch: Throwable -> L95
        if (r014 == null) goto L100;
        Object r015 = r014.get(r3);     // Catch: Throwable -> L95
    L102:
        if ((r015 instanceof String) == false) goto L104;
        String r016 = (String) r015;     // Catch: Throwable -> L95
    L105:
        if (r016 == null) goto L109;
        r132 = r016;
    L109:
        if (b50.C(r72, u40.a("sC73P+uCQmyd\n", "8E2fXp/wLQM=\n")) == true) goto L111;
    L113:
        Handler r017 = uv.a;     // Catch: Throwable -> L95
        String r018 = uv.c(d9.a, r72, r132);     // Catch: Throwable -> L95
        if (ip.i(r018, u40.a("t0cT4v8WqQ==\n", "5BJQobpF+uk=\n")) == true) goto L156;
        gn.a.getClass();     // Catch: Throwable -> L95
        gn.k(r46, "卡片复读中断: " + r018);     // Catch: Throwable -> L95
        goto L156
    L111:
        if (b50.B(r132, u40.a("wIMvzPiA8A==\n", "+okToYvnzsA=\n"), false) == false) goto L113;
        r132 = b50.T(b50.O(r132, u40.a("Dck=\n", "N8Ngx0zRR6k=\n"))).toString();     // Catch: Throwable -> L95
        goto L113
    L104:
        r016 = null;
        goto L105
    L100:
        r015 = null;
        goto L102
    L93:
        if (r63 == 822083633) goto L97;
        gn r019 = gn.a;     // Catch: Throwable -> L95
        String r311 = u40.a("3Z5ZYKf6fAqU4lcF+tMXdpS/PSm7kCsl3ppQYqn/fB+U\n", "OwTbhB93mp4=\n");     // Catch: Throwable -> L95
        r019.getClass();     // Catch: Throwable -> L95
        gn.k(r46, r311);     // Catch: Throwable -> L95
    L95:
        th = move-exception;
        gn r312 = gn.a;
        String r020 = "复读逻辑异常: " + th.getMessage();
        r312.getClass();
        gn.k(r46, r020);
        r06 = "RepeatAction_Failed for type: " + r63 + ", talker: " + r72;
        goto L71
    L77:
        r46 = null;
    L156:
        int r021 = ac.m;
        u40.a("d2ujObtTQWhqdqwosA==\n", "Iznid+gfADw=\n");
        h40 r313 = h(r18, h40.l, 2114191361);
        u40.a("Ao+wpnd0f6s=\n", "UMDk5yM9MOU=\n");
        h40 r47 = h(r18, h40.p, 2114191362);
        u40.a("5mn7OBhikQ==\n", "tSq6dF09yZs=\n");
        h40 r53 = h(r18, h40.n, 2114191363);
        u40.a("w2YvMncszQ==\n", "kCVufjJzlJA=\n");
        h40 r64 = h(r18, h40.o, 2114191364);
        u40.a("kCAq+l2PAs6NPSXrVw==\n", "xHJrtA7DQ5o=\n");
        h40 r73 = h(r18, h40.m, 2114191366);
        if (r021 == 4) goto L159;
    L162:
        if (r021 != 0) goto L164;
        float r104 = 10000.0f;
    L170:
        if (r021 != 0) goto L172;
        float r112 = 0.8f;
    L183:
        r313.a = r92;
        r47.a = r92 / 45.0f;
        i40 r022 = r313.j;
        if (r022 == null) goto L186;
        r022.i = 0.0f;
        r022.b(r104);
        r022.a(r112);
    L186:
        i40 r023 = r47.j;
        if (r023 == null) goto L189;
        r023.i = 0.0f;
        r023.b(r104);
        r023.a(r112);
    L189:
        i40 r024 = r53.j;
        if (r024 == null) goto L192;
        r024.i = 1.0f;
        r024.b(r104);
        r024.a(r112);
    L192:
        i40 r025 = r64.j;
        if (r025 == null) goto L195;
        r025.i = 1.0f;
        r025.b(r104);
        r025.a(r112);
    L195:
        i40 r026 = r73.j;
        if (r026 == null) goto L198;
        r026.i = 0.0f;
        r026.b(r104);
        r026.a(r112);
    L198:
        r313.a(new ao(r18, r313, 0));
        r313.h();
        r47.h();
        r53.h();
        r64.h();
        r73.h();
        View r027 = r19.e;
        if (r027 == null) goto L211;
        ViewPropertyAnimator r028 = r027.animate();
        if (r028 == null) goto L211;
        ViewPropertyAnimator r029 = r028.setListener(null);
        if (r029 == null) goto L211;
        ViewPropertyAnimator r030 = r029.withEndAction(null);
        if (r030 == null) goto L211;
        ViewPropertyAnimator r031 = r030.alpha(1.0f);
        if (r031 == null) goto L211;
        ViewPropertyAnimator r032 = r031.setDuration(300);
        if (r032 == null) goto L211;
        r032.start();
    L211:
        ViewPropertyAnimator r033 = r18.animate().setListener(null).withEndAction(null).alpha(1.0f).rotationX(0.0f).rotationY(0.0f).setDuration(300);
        ip.n(u40.a("yths/GxhTRrQ0naQNz0CRw==\n", "ub0YuBkTLG4=\n"), r033);
        r033.translationZ(0.0f);
        r033.start();
    L212:
        r20.c = false;
        r20.e = false;
        r23.setResult(Boolean.TRUE);
        return;
    L172:
        if (r021 != 1) goto L174;
        r112 = 0.35f;
        goto L183
    L174:
        if (r021 == 2) goto L180;
        r112 = 0.6f;
        if (r021 == 3) goto L183;
        if (r021 != 4) goto L183;
        r112 = 0.5f;
        goto L183
    L180:
        r112 = 0.45f;
        goto L183
    L164:
        if (r021 == 2) goto L168;
        if (r021 == 4) goto L167;
        r104 = 1500.0f;
        goto L170
    L167:
        r104 = 50.0f;
        goto L170
    L168:
        r104 = 200.0f;
        goto L170
    L159:
        if (r20.d == false) goto L162;
        r313.c();
        r47.c();
        r53.c();
        r64.c();
        r73.c();
        zn r034 = new zn(r18, r53, r64, 0);
        r18.animate().setListener(null).setUpdateListener(null).withStartAction(null).withEndAction(null);
        r18.animate().scaleX(1.5f).scaleY(1.5f).alpha(0.0f).setDuration(90).setInterpolator(new DecelerateInterpolator(2.0f)).withEndAction(r034).start();
        goto L212
    L215:
        if (r18.getTranslationX() == 0.0f) goto L217;
    L221:
        j(r18, r19);
        return;
    L217:
        if (r18.getScaleX() != 1.0f) goto L221;
        if (r18.getRotation() != 0.0f) goto L221;
        return;
    L13:
        r9 = 0.0f;
        goto L14
    L5:
        r52 = null;
        goto L7
    }

    public static final void c(ViewGroup r2, Activity r3, String r4, String r5, int r6, final hm r7) {
        View r0 = r2.findViewWithTag(r4);
        if (r0 == null) goto L6;
        r0.setVisibility(0);
        return;
    L6:
        TextView r02 = new TextView(r3);
        r02.setTag(r4);
        r02.setText(r5);
        r02.setTextSize(24.0f);
        r02.setGravity(17);
        GradientDrawable r32 = new GradientDrawable();
        if (ip.i(r5, u40.a("3URGVaIG\n", "P97fuhqJSNY=\n")) == false) goto L10;
        String r42 = "PzbvSPR9x05a\n";
        String r52 = "HHPZDrI7gQg=\n";
    L11:
        r32.setColor(Color.parseColor(u40.a(r42, r52)));
        r32.setCornerRadius(45.0f);
        r02.setBackground(r32);
        r02.setPadding(15, 15, 15, 15);
        r02.setElevation(10.0f);
        FrameLayout.LayoutParams r33 = new FrameLayout.LayoutParams(120, 120);
        r33.gravity = 8388659;
        r33.leftMargin = 50;
        r33.topMargin = r6;
        final f00 r43 = new f00();
        final f00 r53 = new f00();
        final e00 r62 = new e00();
        r02.setOnTouchListener(new j80(r43, r53, r62, r7));
        if ((r2 instanceof FrameLayout) == false) goto L15;
        r2.addView(r02, r33);
        return;
    L15:
        return;
    L10:
        r42 = "LA+jJvHIOZ0/\n";
        r52 = "DzaaFsH4Ca0=\n";
        goto L11
    }

    public static final void d(Activity r10, ViewGroup r11) {
        LinkedList r0 = new LinkedList();
        r0.add(r11);
        float r1 = r11.getResources().getDisplayMetrics().density;
        float r112 = r11.getResources().getDisplayMetrics().heightPixels * 0.15f;
        Integer r2 = null;
        TextView r3 = null;
    L4:
        if (r0.isEmpty() == true) goto L26;
        View r4 = (View) r0.poll();
        if ((r4 instanceof TextView) == false) goto L22;
        TextView r6 = (TextView) r4;
        if (r6.getVisibility() != 0) goto L22;
        CharSequence r7 = r6.getText();
        ip.n(u40.a("uIdok0pzLo/xzDLu\n", "3+Icxy8LWqc=\n"), r7);
        if (r7.length() <= 0) goto L22;
        int[] r72 = new int[2];
        r6.getLocationOnScreen(r72);
        float r5 = r72[1];
        if (r5 <= (10 * r1)) goto L22;
        if (r5 >= r112) goto L22;
        if (r6.getTextSize() <= (14.0f * r1)) goto L22;
        if (r3 != null) goto L19;
    L20:
        r3 = r6;
        goto L22
    L19:
        if (r6.getTextSize() > r3.getTextSize()) goto L20;
    L22:
        if ((r4 instanceof ViewGroup) == false) goto L4;
        ViewGroup r42 = (ViewGroup) r4;
        int r52 = r42.getChildCount();
        int r62 = 0;
    L24:
        if (r62 >= r52) goto L4;
        r0.add(r42.getChildAt(r62));
        r62 = r62 + 1;
        goto L24
    L26:
        if (r3 == null) goto L44;
        Object r02 = r3.getTag(2115108885);
        Boolean r12 = Boolean.TRUE;
        if (ip.i(r02, r12) == false) goto L31;
        return;
    L31:
        r3.setTag(2115108885, r12);
        Object r03 = r3.getTag(2115108871);
        if ((r03 instanceof Integer) == false) goto L34;
        r2 = (Integer) r03;
    L34:
        if (r2 == null) goto L36;
        int r04 = r2.intValue();
    L37:
        r3.setTag(2115108871, Integer.valueOf(r04));
        i00 r113 = new i00();
        r113.b = r3.getText().toString();
        r3.addTextChangedListener(new l80(r3, r113, r04));
        r3.setClickable(true);
        r3.setOnClickListener(new v9(r10, r3, r113, 3));
        r3.setText(r3.getText());
        return;
    L36:
        r04 = r3.getCurrentTextColor();
        goto L37
    }

    public static final byte[] e(byte[] r5, ClassLoader r6) {
        if (r5 != null) goto L14;
        return null;
    L14:
        Object r62 = XposedHelpers.findClass(pb0.f1, r6).newInstance();     // Catch: Throwable -> L12
        XposedHelpers.callMethod(r62, pb0.h1, new Object[]{r5});     // Catch: Throwable -> L12
        Object r0 = XposedHelpers.getObjectField(r62, pb0.g1);     // Catch: Throwable -> L12
        if ((r0 instanceof String) == true) goto L8;
    L10:
        Object r63 = XposedHelpers.callMethod(r62, pb0.i1, new Object[0]);     // Catch: Throwable -> L12
        ip.m(u40.a("16WQemD+JwPXv4g2IvhmDtijiDY08mYD1r7ReDXxKk3NqYxzYPYpGdW5kjgC5DII+KKOdzk=\n", "udD8FkCdRm0=\n"), r63);     // Catch: Throwable -> L12
        return (byte[]) r63;
    L8:
        if (b50.N((String) r0, pb0.e1, false) == true) goto L10;
        XposedHelpers.setObjectField(r62, pb0.g1, pb0.e1 + r0);     // Catch: Throwable -> L12
    L12:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("YD7Lfxc0r9xdJOhOFy2t8Vw/0w==\n", "M1C4PHhZwrk=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        return r5;
    }

    public static vh f(Context r6, int r7) {
        if (r7 == 0) goto L5;
        boolean r2 = true;
    L6:
        zt.d("Cannot create a CalendarItemStyle with a styleResId of 0", r2);
        TypedArray r72 = r6.obtainStyledAttributes(r7, wy.m);
        Rect r5 = new Rect(r72.getDimensionPixelOffset(0, 0), r72.getDimensionPixelOffset(2, 0), r72.getDimensionPixelOffset(1, 0), r72.getDimensionPixelOffset(3, 0));
        ct.n(r6, r72, 4);
        ct.n(r6, r72, 9);
        ct.n(r6, r72, 7);
        r72.getDimensionPixelSize(8, 0);
        f30.a(r6, r72.getResourceId(5, 0), r72.getResourceId(6, 0), new e(0)).a();
        r72.recycle();
        vh r62 = new vh(15);
        zt.e(r5.left);
        zt.e(r5.top);
        zt.e(r5.right);
        zt.e(r5.bottom);
        return r62;
    L5:
        r2 = false;
        goto L6
    }

    public static h40 h(ViewGroup r2, ip r3, int r4) {
        Object r0 = r2.getTag(r4);
        if ((r0 instanceof h40) == false) goto L5;
        h40 r02 = (h40) r0;
    L6:
        if (r02 != null) goto L23;
        r02 = new h40(r2, r3);
        r02.j = new i40();
        if (r3.equals(h40.n) == false) goto L10;
    L21:
        r02.f(0.002f);
    L22:
        r2.setTag(r4, r02);
        goto L23
    L10:
        if (r3.equals(h40.o) == true) goto L21;
        if (r3.equals(h40.p) == false) goto L15;
    L20:
        r02.f(0.1f);
        goto L22
    L15:
        if (r3.equals(h40.q) == true) goto L20;
        if (r3.equals(h40.r) == true) goto L20;
        r02.f(1.0f);
    L23:
        return r02;
    L5:
        r02 = null;
        goto L6
    }

    public static boolean i(ji r7, Editable r8, int r9, int r10, boolean r11) {
        if (r8 == null) goto L79;
        if (r9 < 0) goto L79;
        if (r10 < 0) goto L79;
        int r1 = Selection.getSelectionStart(r8);
        int r2 = Selection.getSelectionEnd(r8);
        if (r1 == (-1)) goto L79;
        if (r2 == (-1)) goto L79;
        if (r1 != r2) goto L79;
        if (r11 == false) goto L69;
        int r92 = Math.max(r9, 0);
        int r112 = r8.length();
        if (r1 < 0) goto L19;
        if (r112 < r1) goto L19;
        if (r92 < 0) goto L19;
    L20:
        boolean r113 = false;
    L21:
        if (r92 == 0) goto L41;
        r1 = r1 - 1;
        if (r1 < 0) goto L25;
        char r5 = r8.charAt(r1);
        if (r113 == true) goto L31;
        if (Character.isSurrogate(r5) == false) goto L36;
        if (Character.isHighSurrogate(r5) == true) goto L19;
        r113 = true;
        goto L21
    L36:
        r92 = r92 - 1;
        goto L21
    L31:
        if (Character.isHighSurrogate(r5) == false) goto L19;
        r92 = r92 - 1;
        goto L20
    L25:
        if (r113 == true) goto L19;
        r1 = 0;
    L41:
        int r93 = Math.max(r10, 0);
        int r102 = r8.length();
        if (r2 < 0) goto L46;
        if (r102 < r2) goto L46;
        if (r93 < 0) goto L46;
    L47:
        boolean r114 = false;
    L48:
        if (r93 == 0) goto L49;
        if (r2 >= r102) goto L51;
        char r52 = r8.charAt(r2);
        if (r114 == true) goto L56;
        if (Character.isSurrogate(r52) == false) goto L61;
        if (Character.isLowSurrogate(r52) == true) goto L46;
        r2 = r2 + 1;
        r114 = true;
        goto L48
    L61:
        r93 = r93 - 1;
        r2 = r2 + 1;
        goto L48
    L56:
        if (Character.isLowSurrogate(r52) == false) goto L46;
        r93 = r93 - 1;
        r2 = r2 + 1;
        goto L47
    L51:
        if (r114 == true) goto L46;
    L66:
        if (r1 == (-1)) goto L79;
        if (r102 == (-1)) goto L79;
    L70:
        g80[] r94 = (g80[]) r8.getSpans(r1, r102, g80.class);
        if (r94 == null) goto L79;
        if (r94.length <= 0) goto L79;
        int r115 = r94.length;
        int r22 = 0;
    L75:
        if (r22 >= r115) goto L77;
        g80 r3 = r94[r22];
        int r53 = r8.getSpanStart(r3);
        int r32 = r8.getSpanEnd(r3);
        r1 = Math.min(r53, r1);
        r102 = Math.max(r32, r102);
        r22 = r22 + 1;
        goto L75
    L77:
        int r95 = Math.max(r1, 0);
        int r103 = Math.min(r102, r8.length());
        r7.beginBatchEdit();
        r8.delete(r95, r103);
        r7.endBatchEdit();
        return true;
    L49:
        r102 = r2;
    L46:
        r102 = -1;
    L19:
        r1 = -1;
        goto L41
    L69:
        r1 = Math.max(r1 - r9, 0);
        r102 = Math.min(r2 + r10, r8.length());
    L79:
        return false;
    }

    public static void j(View r4, e9 r5) {
        ip.o(u40.a("8Q==\n", "h/xAW8uC8O8=\n"), r4);
        r4.animate().setListener(null).setUpdateListener(null).withStartAction(null).withEndAction(null);
        View r0 = r5.e;
        if (r0 == null) goto L13;
        ViewPropertyAnimator r02 = r0.animate();
        if (r02 == null) goto L13;
        ViewPropertyAnimator r03 = r02.setListener(null);
        if (r03 == null) goto L13;
        ViewPropertyAnimator r04 = r03.setUpdateListener(null);
        if (r04 == null) goto L13;
        ViewPropertyAnimator r05 = r04.withStartAction(null);
        if (r05 == null) goto L13;
        r05.withEndAction(null);
    L13:
        r4.animate().cancel();
        View r06 = r5.e;
        if (r06 == null) goto L18;
        ViewPropertyAnimator r07 = r06.animate();
        if (r07 == null) goto L18;
        r07.cancel();
    L18:
        Object r2 = r4.getTag(2114191367);
        if ((r2 instanceof Runnable) == false) goto L21;
        Runnable r22 = (Runnable) r2;
    L22:
        if (r22 == null) goto L24;
        r4.removeCallbacks(r22);
        r4.setTag(2114191367, null);
    L24:
        Object r08 = r4.getTag(2114191361);
        if ((r08 instanceof h40) == false) goto L27;
        h40 r09 = (h40) r08;
    L28:
        if (r09 != null) goto L30;
    L32:
        Object r010 = r4.getTag(2114191362);
        if ((r010 instanceof h40) == false) goto L35;
        h40 r011 = (h40) r010;
    L36:
        if (r011 != null) goto L38;
    L40:
        Object r012 = r4.getTag(2114191363);
        if ((r012 instanceof h40) == false) goto L43;
        h40 r013 = (h40) r012;
    L44:
        if (r013 != null) goto L46;
    L48:
        Object r014 = r4.getTag(2114191364);
        if ((r014 instanceof h40) == false) goto L51;
        h40 r015 = (h40) r014;
    L52:
        if (r015 != null) goto L54;
    L56:
        Object r016 = r4.getTag(2114191366);
        if ((r016 instanceof h40) == false) goto L59;
        h40 r017 = (h40) r016;
    L60:
        if (r017 != null) goto L62;
    L64:
        r4.setTranslationX(0.0f);
        r4.setTranslationY(0.0f);
        r4.setRotation(0.0f);
        r4.setRotationX(0.0f);
        r4.setRotationY(0.0f);
        r4.setScaleX(1.0f);
        r4.setScaleY(1.0f);
        r4.setAlpha(1.0f);
        r4.setTranslationZ(0.0f);
        View r018 = r5.e;
        if (r018 == null) goto L67;
        r018.setAlpha(1.0f);
    L67:
        View r019 = r5.e;
        if (r019 == null) goto L70;
        r019.setScaleX(1.0f);
    L70:
        View r020 = r5.e;
        if (r020 == null) goto L73;
        r020.setScaleY(1.0f);
    L73:
        r4.setLayerType(0, null);
        g9 r42 = r5.g;
        if (r42 == null) goto L77;
        r42.c = false;
        r42.d = false;
        r42.e = false;
        return;
    L77:
        return;
    L62:
        if (r017.e == false) goto L64;
        r017.c();
        goto L64
    L59:
        r017 = null;
        goto L60
    L54:
        if (r015.e == false) goto L56;
        r015.c();
        goto L56
    L51:
        r015 = null;
        goto L52
    L46:
        if (r013.e == false) goto L48;
        r013.c();
        goto L48
    L43:
        r013 = null;
        goto L44
    L38:
        if (r011.e == false) goto L40;
        r011.c();
        goto L40
    L35:
        r011 = null;
        goto L36
    L30:
        if (r09.e == false) goto L32;
        r09.c();
        goto L32
    L27:
        r09 = null;
        goto L28
    L21:
        r22 = null;
        goto L22
    }

    public static byte[] k(byte[] r5, ClassLoader r6) {
        u40.a("8haBOE5T\n", "nnngXCshwt8=\n");
        if (r5 != null) goto L15;
        return null;
    L15:
        Object r62 = XposedHelpers.findClass(pb0.a1, r6).newInstance();     // Catch: Throwable -> L13
        XposedHelpers.callMethod(r62, pb0.b1, new Object[]{r5});     // Catch: Throwable -> L13
        Object r0 = XposedHelpers.getObjectField(r62, pb0.d1);     // Catch: Throwable -> L13
        if ((r0 instanceof String) == true) goto L9;
    L11:
        Object r63 = XposedHelpers.callMethod(r62, pb0.c1, new Object[0]);     // Catch: Throwable -> L13
        ip.m(u40.a("JZdz+FwfjnUljWu0HhnPeCqRa7QIE891JIwy+gkQgzs/m2/xXBeAbyeLcbo+BZt+CpBt9QU=\n", "S+IflHx87xs=\n"), r63);     // Catch: Throwable -> L13
        return (byte[]) r63;
    L9:
        if (b50.N((String) r0, pb0.e1, false) == true) goto L11;
        XposedHelpers.setObjectField(r62, pb0.d1, pb0.e1 + r0);     // Catch: Throwable -> L13
    L13:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("sHmS8O/L7fKreI7L\n", "4xfhoJ2kmZ0=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        return r5;
    }

    public static TextView l(Activity r8, FrameLayout r9, LinearLayout r10, String r11, String r12, String r13) {
        TextView r0 = new TextView(r8);
        r0.setText(r11);
        r0.setTextSize(15.0f);
        r0.setTextColor(Color.parseColor(u40.a("DH8GmhtHbw==\n", "L08x2SpxX98=\n")));
        r0.setTypeface(null, 1);
        GradientDrawable r112 = new GradientDrawable();
        r112.setColor(-1);
        r112.setCornerRadius(24.0f);
        r0.setBackground(r112);
        r0.setPadding(0, 30, 0, 30);
        r0.setGravity(17);
        LinearLayout.LayoutParams r1 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        r1.setMargins(10, 10, 10, 10);
        r0.setLayoutParams(r1);
        r0.setOnClickListener(new a6(r8, r12, r13, r9, r10));
        return r0;
    }

    public Signature[] g(PackageManager r2, String r3) {
        return r2.getPackageInfo(r3, 64).signatures;
    }

    @Override // defpackage.cv
    public boolean q(ku r1) {
        return false;
    }

    public String toString() {
        switch(this.a) {
            case 10: goto L6;
            default: goto L5;
        };
    L6:
        return "kotlin.Unit";
    L5:
        return super.toString();
    }

    public vh(yl r1) {
        this.a = 23;
    }

    @Override // defpackage.cv
    public void a(ku r1, boolean r2) {
    }
}
