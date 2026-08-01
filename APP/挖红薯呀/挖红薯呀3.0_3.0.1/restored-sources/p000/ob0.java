package p000;

import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ob0 {

    /* JADX INFO: renamed from: a */
    public static final ob0 f4502a = new ob0();

    /* JADX INFO: renamed from: b */
    private static final u60 f4503b = new x51(new a00(28));

    /* JADX INFO: renamed from: c */
    private static final u60 f4504c = new x51(new a00(27));

    /* JADX INFO: renamed from: d */
    public static final int f4505d = 8;

    /* JADX INFO: renamed from: ob0$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0545a {

        /* JADX INFO: renamed from: a */
        private final int f4506a;

        /* JADX INFO: renamed from: b */
        private final int f4507b;

        /* JADX INFO: renamed from: c */
        private final int f4508c;

        /* JADX INFO: renamed from: d */
        private final int f4509d;

        /* JADX INFO: renamed from: e */
        private final int f4510e;

        /* JADX INFO: renamed from: f */
        private final int f4511f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0545a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f4506a = i;
            this.f4507b = i2;
            this.f4508c = i3;
            this.f4509d = i4;
            this.f4510e = i5;
            this.f4511f = i6;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final int m2867a() {
            return this.f4507b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final int m2868b() {
            return this.f4508c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final int m2869c() {
            return this.f4511f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final int m2870d() {
            return this.f4509d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final int m2871e() {
            return this.f4510e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final int m2872f() {
            return this.f4506a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ob0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final na1 m2816A(int i, DialogC0402kp dialogC0402kp, Context context, int i2, int i3) {
        boolean zM2048d = C0439lp.f3566a.m2048d();
        if (i2 >= i) {
            f4502a.m2831P().post(new RunnableC0178en(dialogC0402kp, context, i));
        }
        if (zM2048d) {
            f4502a.m2831P().post(new nb0(context, 0));
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m2817B(DialogC0402kp dialogC0402kp, Context context, int i) {
        dialogC0402kp.dismiss();
        Toast.makeText(context, "已保存 " + i + " 张到红薯仓", 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m2818C(Context context) {
        Toast.makeText(context, "已取消下载", 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final na1 m2819D(int i, Context context, int i2, int i3) {
        if (i2 >= i) {
            f4502a.m2831P().post(new RunnableC0943xy(i, 1, context));
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m2820E(Context context, int i) {
        Toast.makeText(context, "已保存 " + i + " 张到红薯仓", 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    private final LinearLayout m2821F(Context context, float f, Dialog dialog, C0545a c0545a) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int i = (int) (16.0f * f);
        int i2 = (int) (12.0f * f);
        linearLayout.setPadding(i, i2, i, i2);
        int i3 = (int) (8.0f * f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(i2, i3, i2, i3);
        linearLayout.setLayoutParams(layoutParams);
        ob0 ob0Var = f4502a;
        linearLayout.setBackground(ob0Var.m2822G(f, c0545a));
        linearLayout.setElevation(4.0f * f);
        linearLayout.setTag(ob0Var.m2832Q());
        if (C1021zy.f8036a.m5634p()) {
            m2825J(context, f, dialog, c0545a, linearLayout);
            return linearLayout;
        }
        m2861v(context, f, dialog, c0545a, linearLayout);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    private final GradientDrawable m2822G(float f, C0545a c0545a) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(24.0f * f);
        gradientDrawable.setColor(c0545a.m2867a());
        int i = (int) (1.0f * f);
        if (i < 1) {
            i = 1;
        }
        gradientDrawable.setStroke(i, c0545a.m2868b());
        return gradientDrawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    private final View m2823H(Context context, float f, C0545a c0545a) {
        View view = new View(context);
        int i = (int) (1.0f * f);
        if (i < 1) {
            i = 1;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i);
        int i2 = (int) (8.0f * f);
        int i3 = (int) (6.0f * f);
        layoutParams.setMargins(i2, i3, i2, i3);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(c0545a.m2869c());
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final TextView m2824I(Context context, float f, C0545a c0545a) {
        TextView textView = new TextView(context);
        textView.setText("⚙ 模块设置");
        textView.setTextSize(16.0f);
        textView.setTextColor(c0545a.m2871e());
        textView.setGravity(17);
        int i = (int) (12.0f * f);
        textView.setPadding(0, i, 0, i);
        textView.setMinHeight((int) (48.0f * f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int i2 = (int) (4.0f * f);
        layoutParams.setMargins(0, i2, 0, i2);
        textView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(14.0f * f);
        int i3 = (int) (1.0f * f);
        if (i3 < 1) {
            i3 = 1;
        }
        gradientDrawable.setStroke(i3, c0545a.m2868b());
        gradientDrawable.setColor(c0545a.m2870d());
        textView.setBackground(gradientDrawable);
        textView.setClickable(true);
        textView.setFocusable(true);
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    private final void m2825J(Context context, float f, Dialog dialog, C0545a c0545a, LinearLayout linearLayout) {
        boolean z = C1021zy.f8036a.m5635q() != null;
        String str = z ? "▶ 下载视频" : "▶ 视频加载中...";
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textViewM2860u = m2860u(context, f, "⚙ 模块设置");
        textViewM2860u.setOnClickListener(new ViewOnClickListenerC0282hg(context, 2, dialog));
        linearLayout2.addView(textViewM2860u);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams((int) (8.0f * f), -1));
        linearLayout2.addView(view);
        TextView textViewM2860u2 = m2860u(context, f, str);
        textViewM2860u2.setOnClickListener(new ViewOnClickListenerC0282hg(context, 3, dialog));
        textViewM2860u2.setClickable(z);
        textViewM2860u2.setFocusable(z);
        if (!z) {
            textViewM2860u2.setAlpha(0.5f);
        }
        linearLayout2.addView(textViewM2860u2);
        linearLayout.addView(linearLayout2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public static final void m2826K(Context context, Dialog dialog, View view) {
        try {
            m00.f3663S.m2387l0(context);
        } catch (Exception unused) {
        }
        try {
            dialog.dismiss();
        } catch (Exception unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public static final void m2827L(Context context, Dialog dialog, View view) {
        C1021zy c1021zy = C1021zy.f8036a;
        String strM5635q = c1021zy.m5635q();
        if (strM5635q != null) {
            C0291hp.f2335a.m1488P(context, strM5635q, c1021zy.m5629k(), c1021zy.m5630l());
        }
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    private final C0545a m2828M(Context context) {
        Object systemService = context.getSystemService("uimode");
        systemService.getClass();
        return ((UiModeManager) systemService).getNightMode() == 2 ? new C0545a(-1, Color.argb(230, 30, 30, 38), Color.argb(30, 255, 255, 255), Color.argb(80, 120, 120, 130), -1, Color.argb(40, 255, 255, 255)) : new C0545a(Color.argb(255, 30, 30, 38), Color.argb(230, 255, 255, 255), Color.argb(30, 0, 0, 0), Color.argb(80, 180, 180, 190), Color.argb(255, 60, 60, 70), Color.argb(40, 0, 0, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    private final ViewGroup m2829N(ViewGroup viewGroup) {
        ViewGroup viewGroupM2829N;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (m2837W(childAt)) {
                    return (ViewGroup) childAt;
                }
                if ((childAt instanceof ViewGroup) && (viewGroupM2829N = m2829N((ViewGroup) childAt)) != null) {
                    return viewGroupM2829N;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:5:0x000c) to fix multi-entry loop: BACK_EDGE: B:5:0x000c -> B:6:0x000d */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x000d, code lost:
    
        r5 = null;
     */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewGroup m2830O(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
            while (viewGroup2 != null) {
                String name = viewGroup2.getClass().getName();
                if (!(viewGroup2 instanceof ScrollView) && !k41.m1764V(name, "ScrollView", false) && !m2837W(viewGroup2) && !k41.m1764V(name, "CoordinatorLayout", false) && (k41.m1764V(name, "LinearLayout", false) || k41.m1764V(name, "RelativeLayout", false) || k41.m1764V(name, "FrameLayout", false) || k41.m1764V(name, "ConstraintLayout", false) || k41.m1764V(name, "PanelView", false) || k41.m1764V(name, "ContentFrameLayout", false))) {
                    return viewGroup2;
                }
                ViewParent parent2 = viewGroup2.getParent();
                if (parent2 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) parent2;
                }
            }
            return null;
        }
        viewGroup2 = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    private final Handler m2831P() {
        return (Handler) f4504c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    private final String m2832Q() {
        return (String) f4503b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public static final Handler m2833R() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public static final Object m2834T(XposedInterface.Chain chain) {
        Context contextM5627i;
        chain.getClass();
        try {
            List args = chain.getArgs();
            args.getClass();
            if (!args.isEmpty()) {
                Object obj = chain.getArgs().get(0);
                Context context = obj instanceof Context ? (Context) obj : null;
                if (context != null) {
                    C1021zy.f8036a.m5638t(context);
                }
            }
            if (chain.getArgs().size() > 3) {
                ec1 ec1Var = ec1.f1395a;
                List args2 = chain.getArgs();
                args2.getClass();
                Object objM5242L = AbstractC0960ye.m5242L(4, args2);
                if (objM5242L == null) {
                    List args3 = chain.getArgs();
                    args3.getClass();
                    objM5242L = AbstractC0960ye.m5242L(3, args3);
                }
                ec1Var.m922R(objM5242L);
            }
            if (chain.getArgs().size() > 1) {
                Object obj2 = chain.getArgs().get(1);
                List<?> list = obj2 instanceof List ? (List) obj2 : null;
                if (list != null) {
                    ec1.f1395a.m921Q(list);
                }
            }
        } catch (Exception unused) {
        }
        Object objProceed = chain.proceed();
        try {
            Object thisObject = chain.getThisObject();
            Dialog dialog = thisObject instanceof Dialog ? (Dialog) thisObject : null;
            if (dialog != null && (contextM5627i = C1021zy.f8036a.m5627i()) != null) {
                f4502a.m2838X(dialog, contextM5627i);
            }
        } catch (Exception unused2) {
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    private final void m2835U(Dialog dialog, Context context) {
        try {
            C1021zy c1021zy = C1021zy.f8036a;
            c1021zy.m5641w(false);
            Window window = dialog.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup == null) {
                return;
            }
            boolean z = c1021zy.m5621c() != null;
            boolean z2 = c1021zy.m5635q() != null;
            boolean zM5634p = c1021zy.m5634p();
            if ((z || z2 || zM5634p) && viewGroup.findViewWithTag(m2832Q()) == null) {
                ViewGroup viewGroupM2829N = m2829N(viewGroup);
                ViewGroup viewGroupM2830O = viewGroupM2829N != null ? m2830O(viewGroupM2829N) : null;
                if (viewGroupM2830O == null || viewGroupM2829N == null) {
                    m2856q(viewGroup, dialog, context);
                } else {
                    m2836V(viewGroupM2830O, viewGroupM2829N, dialog, context);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    private final void m2836V(ViewGroup viewGroup, ViewGroup viewGroup2, Dialog dialog, Context context) {
        try {
            LinearLayout linearLayoutM2821F = m2821F(context, context.getResources().getDisplayMetrics().density, dialog, m2828M(context));
            linearLayoutM2821F.setTag(m2832Q());
            int iIndexOfChild = viewGroup.indexOfChild(viewGroup2);
            if (iIndexOfChild >= 0) {
                viewGroup.addView(linearLayoutM2821F, iIndexOfChild);
            } else {
                viewGroup.addView(linearLayoutM2821F, 0);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    private final boolean m2837W(View view) {
        return k41.m1764V(view.getClass().getName(), "RecyclerView", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    private final void m2838X(Dialog dialog, Context context) {
        m2831P().postDelayed(new RunnableC0751t4(8, dialog, context), 250L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public static final void m2839Y(Dialog dialog, Context context) {
        f4502a.m2835U(dialog, context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m2855p() {
        return "xp1_btn_tag";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    private final void m2856q(ViewGroup viewGroup, Dialog dialog, Context context) {
        try {
            C0545a c0545aM2828M = m2828M(context);
            float f = context.getResources().getDisplayMetrics().density;
            LinearLayout linearLayoutM2821F = m2821F(context, f, dialog, c0545aM2828M);
            linearLayoutM2821F.setTag(f4502a.m2832Q());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            int i = (int) (16.0f * f);
            layoutParams.setMargins(i, 0, i, i);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setPadding(0, 0, 0, (int) (56.0f * f));
            frameLayout.addView(linearLayoutM2821F, layoutParams);
            viewGroup.addView(frameLayout);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    private final TextView m2857r(Context context, float f, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.rgb(40, 40, 40));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        int i = (int) (12.0f * f);
        int i2 = (int) (8.0f * f);
        textView.setPadding(i2, i, i2, i);
        textView.setMinHeight((int) (48.0f * f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int i3 = (int) (4.0f * f);
        layoutParams.setMargins(0, i3, 0, i3);
        textView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(10.0f * f);
        gradientDrawable.setColor(-1);
        int i4 = (int) (1.0f * f);
        if (i4 < 1) {
            i4 = 1;
        }
        gradientDrawable.setStroke(i4, Color.argb(60, 0, 0, 0));
        textView.setBackground(gradientDrawable);
        textView.setClickable(true);
        textView.setFocusable(true);
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    private final TextView m2858s(Context context, float f, String str) {
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, str, 15.0f, -1);
        textViewM4151i.setTypeface(Typeface.DEFAULT_BOLD);
        textViewM4151i.setGravity(17);
        float f2 = 12.0f * f;
        int i = (int) f2;
        int i2 = (int) (20.0f * f);
        textViewM4151i.setPadding(i2, i, i2, i);
        textViewM4151i.setMinHeight((int) (48.0f * f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i3 = (int) (4.0f * f);
        layoutParams.setMargins(0, i3, 0, i3);
        textViewM4151i.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f2);
        gradientDrawable.setColor(Color.argb(220, 254, 44, 85));
        textViewM4151i.setBackground(gradientDrawable);
        textViewM4151i.setClickable(true);
        textViewM4151i.setFocusable(true);
        return textViewM4151i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    private final TextView m2859t(Context context, float f, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(Color.rgb(40, 40, 40));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        float f2 = 12.0f * f;
        int i = (int) f2;
        int i2 = (int) (20.0f * f);
        textView.setPadding(i2, i, i2, i);
        textView.setMinHeight((int) (48.0f * f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i3 = (int) (4.0f * f);
        layoutParams.setMargins(0, i3, 0, i3);
        textView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f2);
        gradientDrawable.setColor(-1);
        int i4 = (int) (1.0f * f);
        if (i4 < 1) {
            i4 = 1;
        }
        gradientDrawable.setStroke(i4, Color.argb(60, 0, 0, 0));
        textView.setBackground(gradientDrawable);
        textView.setClickable(true);
        textView.setFocusable(true);
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    private final TextView m2860u(Context context, float f, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(Color.rgb(40, 40, 40));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        float f2 = 12.0f * f;
        int i = (int) f2;
        int i2 = (int) (10.0f * f);
        textView.setPadding(i2, i, i2, i);
        textView.setMinHeight((int) (48.0f * f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        int i3 = (int) (4.0f * f);
        layoutParams.setMargins(0, i3, 0, i3);
        textView.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f2);
        gradientDrawable.setColor(-1);
        int i4 = (int) (1.0f * f);
        if (i4 < 1) {
            i4 = 1;
        }
        gradientDrawable.setStroke(i4, Color.argb(60, 0, 0, 0));
        textView.setBackground(gradientDrawable);
        textView.setClickable(true);
        textView.setFocusable(true);
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    private final void m2861v(Context context, float f, Dialog dialog, C0545a c0545a, LinearLayout linearLayout) {
        C1021zy c1021zy = C1021zy.f8036a;
        boolean z = c1021zy.m5621c() != null;
        String str = c1021zy.m5623e() ? " (作者限制)" : "";
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textViewM2824I = m2824I(context, f, c0545a);
        textViewM2824I.setOnClickListener(new ViewOnClickListenerC0282hg(context, 4, dialog));
        linearLayout2.addView(textViewM2824I);
        if (z) {
            View view = new View(context);
            view.setLayoutParams(new LinearLayout.LayoutParams((int) (8.0f * f), -1));
            linearLayout2.addView(view);
            TextView textViewM2857r = m2857r(context, f, "↓ 下载当前原图".concat(str));
            textViewM2857r.setOnClickListener(new ViewOnClickListenerC0282hg(context, 5, dialog));
            linearLayout2.addView(textViewM2857r);
        }
        linearLayout.addView(linearLayout2);
        List<String> listM4121i = C0745sz.f5862a.m4121i();
        if (c1021zy.m5636r() && c1021zy.m5628j() != null) {
            linearLayout.addView(m2823H(context, f, c0545a));
            View viewM2859t = m2859t(context, f, "⬡ 下载当前 Live 原图");
            viewM2859t.setOnClickListener(new ViewOnClickListenerC0282hg(context, 6, dialog));
            linearLayout.addView(viewM2859t);
        }
        if (listM4121i.isEmpty()) {
            return;
        }
        linearLayout.addView(m2823H(context, f, c0545a));
        TextView textViewM2858s = m2858s(context, f, "📥 一键下载全部原图 (" + listM4121i.size() + "张)");
        textViewM2858s.setOnClickListener(new ViewOnClickListenerC0318ig(dialog, listM4121i, context));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.addView(textViewM2858s);
        linearLayout.addView(linearLayout3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final void m2862w(Context context, Dialog dialog, View view) {
        try {
            m00.f3663S.m2387l0(context);
        } catch (Exception unused) {
        }
        try {
            dialog.dismiss();
        } catch (Exception unused2) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final void m2863x(Context context, Dialog dialog, View view) {
        C1021zy c1021zy = C1021zy.f8036a;
        String strM5621c = c1021zy.m5621c();
        if (strM5621c != null) {
            C0291hp.f2335a.m1486C(context, strM5621c, c1021zy.m5625g());
        }
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m2864y(Context context, Dialog dialog, View view) {
        C1021zy c1021zy = C1021zy.f8036a;
        String strM5621c = c1021zy.m5621c();
        String strM5628j = c1021zy.m5628j();
        if (strM5621c != null && strM5628j != null) {
            C0291hp.f2335a.m1487F(context, strM5621c, strM5628j, c1021zy.m5625g());
        }
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final void m2865z(Dialog dialog, List list, Context context, View view) {
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(list));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                o30.m2757A();
                throw null;
            }
            arrayList.add(new uo0((String) obj, Integer.valueOf(i)));
            i = i2;
        }
        int size = arrayList.size();
        Context applicationContext = context.getApplicationContext();
        C0439lp c0439lp = C0439lp.f3566a;
        if (c0439lp.m2050f(context)) {
            c0439lp.m2053i();
            DialogC0402kp dialogC0402kp = new DialogC0402kp(context, AbstractC0748t1.m4154l("图片 0/", size));
            dialogC0402kp.show();
            C0870vz.f6878a.m4819i(context, arrayList, new C0355jh(dialogC0402kp, applicationContext, size));
            return;
        }
        Toast.makeText(applicationContext, "开始下载 " + size + " 张原图...", 0).show();
        C0870vz.f6878a.m4818f(context, arrayList, new q80(applicationContext, size));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final void m2866S(ClassLoader classLoader, Class<?> cls) {
        XposedInterface.HookBuilder hookBuilderHook;
        classLoader.getClass();
        if (cls == null) {
            return;
        }
        try {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(cls.getDeclaredConstructors());
            while (c0822vM1933s.hasNext()) {
                Constructor constructor = (Constructor) c0822vM1933s.next();
                kf1 kf1VarM1887b = kf1.f3100G.m1887b();
                if (kf1VarM1887b != null && (hookBuilderHook = kf1VarM1887b.hook(constructor)) != null) {
                    hookBuilderHook.intercept(new C0796ua(16));
                }
            }
        } catch (Exception unused) {
        }
    }
}
