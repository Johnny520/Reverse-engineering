package p000;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.hardware.SensorManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import java.util.LinkedList;

/* JADX INFO: renamed from: vh */
/* JADX INFO: loaded from: classes.dex */
public class C0819vh implements InterfaceC0221fe, InterfaceC0128cv {

    /* JADX INFO: renamed from: d */
    public static float f4845d = -1.0f;

    /* JADX INFO: renamed from: e */
    public static float f4846e;

    /* JADX INFO: renamed from: f */
    public static float f4847f;

    /* JADX INFO: renamed from: g */
    public static float f4848g;

    /* JADX INFO: renamed from: k */
    public static SensorManager f4852k;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4858a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ C0819vh f4843b = new C0819vh(1);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ C0819vh f4844c = new C0819vh(2);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ C0819vh f4849h = new C0819vh(4);

    /* JADX INFO: renamed from: i */
    public static final C0819vh f4850i = new C0819vh(5);

    /* JADX INFO: renamed from: j */
    public static final C0819vh f4851j = new C0819vh(7);

    /* JADX INFO: renamed from: l */
    public static final m80 f4853l = new m80();

    /* JADX INFO: renamed from: m */
    public static final C0819vh f4854m = new C0819vh(9);

    /* JADX INFO: renamed from: n */
    public static final C0819vh f4855n = new C0819vh(10);

    /* JADX INFO: renamed from: o */
    public static final C0819vh f4856o = new C0819vh(11);

    /* JADX INFO: renamed from: p */
    public static final C0819vh f4857p = new C0819vh(12);

    public /* synthetic */ C0819vh(int i) {
        this.f4858a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x032a A[Catch: all -> 0x0254, TryCatch #1 {all -> 0x0254, blocks: (B:94:0x0242, B:97:0x0257, B:99:0x025b, B:101:0x0261, B:103:0x0265, B:108:0x026d, B:110:0x027b, B:112:0x028b, B:113:0x029f, B:115:0x02b5, B:116:0x02cb, B:117:0x02d0, B:119:0x02d4, B:121:0x02da, B:123:0x02de, B:128:0x02e6, B:130:0x02ec, B:132:0x0302, B:133:0x0318, B:134:0x032a, B:135:0x033c, B:137:0x0340, B:139:0x0346, B:141:0x034a, B:146:0x0352, B:148:0x0360, B:150:0x036f, B:151:0x0383, B:153:0x0399), top: B:224:0x0228 }] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2509b(android.view.ViewGroup r18, p000.C0179e9 r19, p000.C0253g9 r20, android.view.MotionEvent r21, p000.C0216f9 r22, de.robv.android.xposed.XC_MethodHook.MethodHookParam r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 1460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0819vh.m2509b(android.view.ViewGroup, e9, g9, android.view.MotionEvent, f9, de.robv.android.xposed.XC_MethodHook$MethodHookParam, boolean):void");
    }

    /* JADX INFO: renamed from: c */
    public static final void m2510c(ViewGroup viewGroup, Activity activity, String str, String str2, int i, final InterfaceC0303hm interfaceC0303hm) {
        String str3;
        String str4;
        View viewFindViewWithTag = viewGroup.findViewWithTag(str);
        if (viewFindViewWithTag != null) {
            viewFindViewWithTag.setVisibility(0);
            return;
        }
        TextView textView = new TextView(activity);
        textView.setTag(str);
        textView.setText(str2);
        textView.setTextSize(24.0f);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (AbstractC0346ip.m1497i(str2, u40.m2419a("3URGVaIG\n", "P97fuhqJSNY=\n"))) {
            str3 = "PzbvSPR9x05a\n";
            str4 = "HHPZDrI7gQg=\n";
        } else {
            str3 = "LA+jJvHIOZ0/\n";
            str4 = "DzaaFsH4Ca0=\n";
        }
        gradientDrawable.setColor(Color.parseColor(u40.m2419a(str3, str4)));
        gradientDrawable.setCornerRadius(45.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(15, 15, 15, 15);
        textView.setElevation(10.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(120, 120);
        layoutParams.gravity = 8388659;
        layoutParams.leftMargin = 50;
        layoutParams.topMargin = i;
        final f00 f00Var = new f00();
        final f00 f00Var2 = new f00();
        final e00 e00Var = new e00();
        textView.setOnTouchListener(new View.OnTouchListener(f00Var, f00Var2, e00Var, interfaceC0303hm) { // from class: j80

            /* JADX INFO: renamed from: a */
            public final f00 f2591a;

            /* JADX INFO: renamed from: b */
            public final f00 f2592b;

            /* JADX INFO: renamed from: c */
            public final e00 f2593c;

            /* JADX INFO: renamed from: d */
            public final InterfaceC0303hm f2594d;

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000b. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00da A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00cd A[SYNTHETIC] */
            {
                /*
                    Method dump skipped, instruction units count: 300
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.j80.<init>(f00, f00, e00, hm):void");
            }

            /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0013. Please report as an issue. */
            /* JADX WARN: Removed duplicated region for block: B:116:0x00c3 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:118:0x00b6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:123:0x007a A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:127:0x0072 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:128:0x00a6 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:130:0x0190 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:131:0x0183 A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:133:0x009f A[SYNTHETIC] */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
                /*
                    Method dump skipped, instruction units count: 662
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.j80.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        });
        if (viewGroup instanceof FrameLayout) {
            viewGroup.addView(textView, layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m2511d(Activity activity, ViewGroup viewGroup) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        float f = viewGroup.getResources().getDisplayMetrics().density;
        float f2 = viewGroup.getResources().getDisplayMetrics().heightPixels * 0.15f;
        TextView textView = null;
        while (!linkedList.isEmpty()) {
            View view = (View) linkedList.poll();
            if (view instanceof TextView) {
                TextView textView2 = (TextView) view;
                if (textView2.getVisibility() == 0) {
                    CharSequence text = textView2.getText();
                    AbstractC0346ip.m1502n(u40.m2419a("uIdok0pzLo/xzDLu\n", "3+Icxy8LWqc=\n"), text);
                    if (text.length() > 0) {
                        int[] iArr = new int[2];
                        textView2.getLocationOnScreen(iArr);
                        float f3 = iArr[1];
                        if (f3 > 10 * f && f3 < f2 && textView2.getTextSize() > 14.0f * f && (textView == null || textView2.getTextSize() > textView.getTextSize())) {
                            textView = textView2;
                        }
                    }
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                int childCount = viewGroup2.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    linkedList.add(viewGroup2.getChildAt(i));
                }
            }
        }
        if (textView == null) {
            return;
        }
        Object tag = textView.getTag(2115108885);
        Boolean bool = Boolean.TRUE;
        if (AbstractC0346ip.m1497i(tag, bool)) {
            return;
        }
        textView.setTag(2115108885, bool);
        Object tag2 = textView.getTag(2115108871);
        Integer num = tag2 instanceof Integer ? (Integer) tag2 : null;
        int iIntValue = num != null ? num.intValue() : textView.getCurrentTextColor();
        textView.setTag(2115108871, Integer.valueOf(iIntValue));
        i00 i00Var = new i00();
        i00Var.f2326b = textView.getText().toString();
        textView.addTextChangedListener(new l80(textView, i00Var, iIntValue));
        textView.setClickable(true);
        textView.setOnClickListener(new ViewOnClickListenerC0811v9(activity, textView, i00Var, 3));
        textView.setText(textView.getText());
    }

    /* JADX INFO: renamed from: e */
    public static final byte[] m2512e(byte[] bArr, ClassLoader classLoader) {
        if (bArr == null) {
            return null;
        }
        try {
            Object objNewInstance = XposedHelpers.findClass(pb0.f3763f1, classLoader).newInstance();
            XposedHelpers.callMethod(objNewInstance, pb0.f3769h1, new Object[]{bArr});
            Object objectField = XposedHelpers.getObjectField(objNewInstance, pb0.f3766g1);
            if ((objectField instanceof String) && !b50.m528N((String) objectField, pb0.f3760e1, false)) {
                XposedHelpers.setObjectField(objNewInstance, pb0.f3766g1, pb0.f3760e1 + objectField);
            }
            Object objCallMethod = XposedHelpers.callMethod(objNewInstance, pb0.f3772i1, new Object[0]);
            AbstractC0346ip.m1501m(u40.m2419a("16WQemD+JwPXv4g2IvhmDtijiDY08mYD1r7ReDXxKk3NqYxzYPYpGdW5kjgC5DII+KKOdzk=\n", "udD8FkCdRm0=\n"), objCallMethod);
            return (byte[]) objCallMethod;
        } catch (Throwable unused) {
            z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.m2419a("YD7Lfxc0r9xdJOhOFy2t8Vw/0w==\n", "M1C4PHhZwrk=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
            return bArr;
        }
    }

    /* JADX INFO: renamed from: f */
    public static C0819vh m2513f(Context context, int i) {
        AbstractC0979zt.m2823d("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0873wy.f5054m);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 9);
        AbstractC0126ct.m816n(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        f30.m1135a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C0169e(0)).m982a();
        typedArrayObtainStyledAttributes.recycle();
        C0819vh c0819vh = new C0819vh(15);
        AbstractC0979zt.m2824e(rect.left);
        AbstractC0979zt.m2824e(rect.top);
        AbstractC0979zt.m2824e(rect.right);
        AbstractC0979zt.m2824e(rect.bottom);
        return c0819vh;
    }

    /* JADX INFO: renamed from: h */
    public static h40 m2514h(ViewGroup viewGroup, AbstractC0346ip abstractC0346ip, int i) {
        Object tag = viewGroup.getTag(i);
        h40 h40Var = tag instanceof h40 ? (h40) tag : null;
        if (h40Var == null) {
            h40Var = new h40(viewGroup, abstractC0346ip);
            h40Var.f2234j = new i40();
            if (abstractC0346ip.equals(h40.f2219n) || abstractC0346ip.equals(h40.f2220o)) {
                h40Var.m1344f(0.002f);
            } else if (abstractC0346ip.equals(h40.f2221p) || abstractC0346ip.equals(h40.f2222q) || abstractC0346ip.equals(h40.f2223r)) {
                h40Var.m1344f(0.1f);
            } else {
                h40Var.m1344f(1.0f);
            }
            viewGroup.setTag(i, h40Var);
        }
        return h40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m2515i(p000.C0375ji r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0819vh.m2515i(ji, android.text.Editable, int, int, boolean):boolean");
    }

    /* JADX INFO: renamed from: j */
    public static void m2516j(View view, C0179e9 c0179e9) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction;
        AbstractC0346ip.m1503o(u40.m2419a("8Q==\n", "h/xAW8uC8O8=\n"), view);
        view.animate().setListener(null).setUpdateListener(null).withStartAction(null).withEndAction(null);
        View view2 = c0179e9.f1752e;
        if (view2 != null && (viewPropertyAnimatorAnimate2 = view2.animate()) != null && (listener = viewPropertyAnimatorAnimate2.setListener(null)) != null && (updateListener = listener.setUpdateListener(null)) != null && (viewPropertyAnimatorWithStartAction = updateListener.withStartAction(null)) != null) {
            viewPropertyAnimatorWithStartAction.withEndAction(null);
        }
        view.animate().cancel();
        View view3 = c0179e9.f1752e;
        if (view3 != null && (viewPropertyAnimatorAnimate = view3.animate()) != null) {
            viewPropertyAnimatorAnimate.cancel();
        }
        Object tag = view.getTag(2114191367);
        Runnable runnable = tag instanceof Runnable ? (Runnable) tag : null;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            view.setTag(2114191367, null);
        }
        Object tag2 = view.getTag(2114191361);
        h40 h40Var = tag2 instanceof h40 ? (h40) tag2 : null;
        if (h40Var != null && h40Var.f2229e) {
            h40Var.m1341c();
        }
        Object tag3 = view.getTag(2114191362);
        h40 h40Var2 = tag3 instanceof h40 ? (h40) tag3 : null;
        if (h40Var2 != null && h40Var2.f2229e) {
            h40Var2.m1341c();
        }
        Object tag4 = view.getTag(2114191363);
        h40 h40Var3 = tag4 instanceof h40 ? (h40) tag4 : null;
        if (h40Var3 != null && h40Var3.f2229e) {
            h40Var3.m1341c();
        }
        Object tag5 = view.getTag(2114191364);
        h40 h40Var4 = tag5 instanceof h40 ? (h40) tag5 : null;
        if (h40Var4 != null && h40Var4.f2229e) {
            h40Var4.m1341c();
        }
        Object tag6 = view.getTag(2114191366);
        h40 h40Var5 = tag6 instanceof h40 ? (h40) tag6 : null;
        if (h40Var5 != null && h40Var5.f2229e) {
            h40Var5.m1341c();
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        view.setTranslationZ(0.0f);
        View view4 = c0179e9.f1752e;
        if (view4 != null) {
            view4.setAlpha(1.0f);
        }
        View view5 = c0179e9.f1752e;
        if (view5 != null) {
            view5.setScaleX(1.0f);
        }
        View view6 = c0179e9.f1752e;
        if (view6 != null) {
            view6.setScaleY(1.0f);
        }
        view.setLayerType(0, null);
        C0253g9 c0253g9 = c0179e9.f1754g;
        if (c0253g9 != null) {
            c0253g9.f2043c = false;
            c0253g9.f2044d = false;
            c0253g9.f2045e = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static byte[] m2517k(byte[] bArr, ClassLoader classLoader) {
        u40.m2419a("8haBOE5T\n", "nnngXCshwt8=\n");
        if (bArr == null) {
            return null;
        }
        try {
            Object objNewInstance = XposedHelpers.findClass(pb0.f3748a1, classLoader).newInstance();
            XposedHelpers.callMethod(objNewInstance, pb0.f3751b1, new Object[]{bArr});
            Object objectField = XposedHelpers.getObjectField(objNewInstance, pb0.f3757d1);
            if ((objectField instanceof String) && !b50.m528N((String) objectField, pb0.f3760e1, false)) {
                XposedHelpers.setObjectField(objNewInstance, pb0.f3757d1, pb0.f3760e1 + objectField);
            }
            Object objCallMethod = XposedHelpers.callMethod(objNewInstance, pb0.f3754c1, new Object[0]);
            AbstractC0346ip.m1501m(u40.m2419a("JZdz+FwfjnUljWu0HhnPeCqRa7QIE891JIwy+gkQgzs/m2/xXBeAbyeLcbo+BZt+CpBt9QU=\n", "S+IflHx87xs=\n"), objCallMethod);
            return (byte[]) objCallMethod;
        } catch (Throwable unused) {
            z30.m2770o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.m2419a("sHmS8O/L7fKreI7L\n", "4xfhoJ2kmZ0=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
            return bArr;
        }
    }

    /* JADX INFO: renamed from: l */
    public static TextView m2518l(Activity activity, FrameLayout frameLayout, LinearLayout linearLayout, String str, String str2, String str3) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(Color.parseColor(u40.m2419a("DH8GmhtHbw==\n", "L08x2SpxX98=\n")));
        textView.setTypeface(null, 1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadius(24.0f);
        textView.setBackground(gradientDrawable);
        textView.setPadding(0, 30, 0, 30);
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(10, 10, 10, 10);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new ViewOnClickListenerC0007a6(activity, str2, str3, frameLayout, linearLayout));
        return textView;
    }

    /* JADX INFO: renamed from: g */
    public Signature[] mo1594g(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // p000.InterfaceC0128cv
    /* JADX INFO: renamed from: q */
    public boolean mo830q(MenuC0424ku menuC0424ku) {
        return false;
    }

    public String toString() {
        switch (this.f4858a) {
            case 10:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }

    public C0819vh(C0934yl c0934yl) {
        this.f4858a = 23;
    }

    @Override // p000.InterfaceC0128cv
    /* JADX INFO: renamed from: a */
    public void mo829a(MenuC0424ku menuC0424ku, boolean z) {
    }
}
