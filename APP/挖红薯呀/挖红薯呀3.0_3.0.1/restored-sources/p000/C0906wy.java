package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p000.m00;

/* JADX INFO: renamed from: wy */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0906wy {

    /* JADX INFO: renamed from: a */
    public static final C0906wy f7212a = new C0906wy();

    /* JADX INFO: renamed from: b */
    private static final String f7213b = "HRHook";

    /* JADX INFO: renamed from: c */
    private static final Set<Integer> f7214c;

    /* JADX INFO: renamed from: d */
    private static volatile boolean f7215d;

    /* JADX INFO: renamed from: e */
    private static volatile View f7216e;

    /* JADX INFO: renamed from: f */
    private static volatile Class<?> f7217f;

    /* JADX INFO: renamed from: g */
    public static final int f7218g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet(md0.m2495x(1));
        linkedHashSet.add(new Integer[]{2131302711}[0]);
        f7214c = linkedHashSet;
        f7218g = 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0906wy() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final boolean m5028A(View view, int i) {
        Set<Integer> set = f7214c;
        if (set.contains(Integer.valueOf(i))) {
            return true;
        }
        try {
            int identifier = view.getContext().getResources().getIdentifier("index_home", "id", view.getContext().getPackageName());
            if (identifier == 0 || identifier != i) {
                return false;
            }
            set.add(Integer.valueOf(identifier));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    private final void m5029B(Context context, final InterfaceC0742sw interfaceC0742sw) {
        try {
            float f = context.getResources().getDisplayMetrics().density;
            final Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            final int i = 0;
            linearLayout.setBackgroundColor(Color.argb(160, 0, 0, 0));
            C0906wy c0906wy = f7212a;
            linearLayout.setPadding(c0906wy.m5049m(f, 32), 0, c0906wy.m5049m(f, 32), 0);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(c0906wy.m5049m(f, 24), c0906wy.m5049m(f, 24), c0906wy.m5049m(f, 24), c0906wy.m5049m(f, 20));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(c0906wy.m5049m(f, 16));
            gradientDrawable.setColor(Color.argb(255, 255, 255, 255));
            linearLayout2.setBackground(gradientDrawable);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(context);
            textView.setText("确认刷新");
            textView.setTextSize(18.0f);
            textView.setTextColor(Color.argb(255, 30, 30, 30));
            textView.setGravity(17);
            textView.setPadding(0, 0, 0, c0906wy.m5049m(f, 8));
            linearLayout2.addView(textView);
            TextView textView2 = new TextView(context);
            textView2.setText("是否刷新首页内容？");
            textView2.setTextSize(14.0f);
            textView2.setTextColor(Color.argb(200, 80, 80, 80));
            textView2.setGravity(17);
            textView2.setPadding(0, 0, 0, c0906wy.m5049m(f, 20));
            linearLayout2.addView(textView2);
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(17);
            TextView textView3 = new TextView(context);
            textView3.setText("否");
            textView3.setTextSize(14.0f);
            textView3.setTextColor(Color.argb(255, 100, 100, 100));
            textView3.setGravity(17);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(c0906wy.m5049m(f, 24));
            gradientDrawable2.setColor(Color.argb(60, 200, 200, 200));
            textView3.setBackground(gradientDrawable2);
            textView3.setPadding(c0906wy.m5049m(f, 28), c0906wy.m5049m(f, 10), c0906wy.m5049m(f, 28), c0906wy.m5049m(f, 10));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.setMargins(0, 0, c0906wy.m5049m(f, 10), 0);
            textView3.setLayoutParams(layoutParams);
            textView3.setOnClickListener(new View.OnClickListener() { // from class: ty
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    InterfaceC0742sw interfaceC0742sw2 = interfaceC0742sw;
                    Dialog dialog2 = dialog;
                    switch (i2) {
                        case 0:
                            C0906wy.m5030C(dialog2, interfaceC0742sw2, view);
                            break;
                        default:
                            C0906wy.m5031D(dialog2, interfaceC0742sw2, view);
                            break;
                    }
                }
            });
            linearLayout3.addView(textView3);
            TextView textView4 = new TextView(context);
            textView4.setText("是");
            textView4.setTextSize(14.0f);
            textView4.setTextColor(-1);
            textView4.setGravity(17);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(c0906wy.m5049m(f, 24));
            gradientDrawable3.setColor(Color.argb(220, 254, 44, 85));
            textView4.setBackground(gradientDrawable3);
            textView4.setPadding(c0906wy.m5049m(f, 28), c0906wy.m5049m(f, 10), c0906wy.m5049m(f, 28), c0906wy.m5049m(f, 10));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams2.setMargins(c0906wy.m5049m(f, 10), 0, 0, 0);
            textView4.setLayoutParams(layoutParams2);
            final int i2 = 1;
            textView4.setOnClickListener(new View.OnClickListener() { // from class: ty
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i2;
                    InterfaceC0742sw interfaceC0742sw2 = interfaceC0742sw;
                    Dialog dialog2 = dialog;
                    switch (i22) {
                        case 0:
                            C0906wy.m5030C(dialog2, interfaceC0742sw2, view);
                            break;
                        default:
                            C0906wy.m5031D(dialog2, interfaceC0742sw2, view);
                            break;
                    }
                }
            });
            linearLayout3.addView(textView4);
            linearLayout2.addView(linearLayout3);
            linearLayout.addView(linearLayout2);
            dialog.setContentView(linearLayout);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
            dialog.setCancelable(false);
            dialog.show();
        } catch (Exception unused) {
            interfaceC0742sw.invoke(Boolean.FALSE);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m5030C(Dialog dialog, InterfaceC0742sw interfaceC0742sw, View view) {
        dialog.dismiss();
        interfaceC0742sw.invoke(Boolean.FALSE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m5031D(Dialog dialog, InterfaceC0742sw interfaceC0742sw, View view) {
        dialog.dismiss();
        interfaceC0742sw.invoke(Boolean.TRUE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    private final void m5032E(Context context, View view, InterfaceC0742sw interfaceC0742sw) {
        try {
            float f = context.getResources().getDisplayMetrics().density;
            Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            int i = 0;
            linearLayout.setBackgroundColor(Color.argb(160, 0, 0, 0));
            C0906wy c0906wy = f7212a;
            linearLayout.setPadding(c0906wy.m5049m(f, 32), 0, c0906wy.m5049m(f, 32), 0);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(c0906wy.m5049m(f, 24), c0906wy.m5049m(f, 24), c0906wy.m5049m(f, 24), c0906wy.m5049m(f, 20));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(c0906wy.m5049m(f, 16));
            gradientDrawable.setColor(Color.argb(255, 255, 255, 255));
            linearLayout2.setBackground(gradientDrawable);
            linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            TextView textView = new TextView(context);
            textView.setText("确认刷新");
            textView.setTextSize(18.0f);
            textView.setTextColor(Color.argb(255, 30, 30, 30));
            textView.setGravity(17);
            textView.setPadding(0, 0, 0, c0906wy.m5049m(f, 8));
            linearLayout2.addView(textView);
            TextView textView2 = new TextView(context);
            textView2.setText("是否刷新首页内容？");
            textView2.setTextSize(14.0f);
            textView2.setTextColor(Color.argb(200, 80, 80, 80));
            textView2.setGravity(17);
            textView2.setPadding(0, 0, 0, c0906wy.m5049m(f, 20));
            linearLayout2.addView(textView2);
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(17);
            TextView textView3 = new TextView(context);
            textView3.setText("否");
            textView3.setTextSize(14.0f);
            textView3.setTextColor(Color.argb(255, 100, 100, 100));
            textView3.setGravity(17);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(c0906wy.m5049m(f, 24));
            gradientDrawable2.setColor(Color.argb(60, 200, 200, 200));
            textView3.setBackground(gradientDrawable2);
            textView3.setPadding(c0906wy.m5049m(f, 28), c0906wy.m5049m(f, 10), c0906wy.m5049m(f, 28), c0906wy.m5049m(f, 10));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.setMargins(0, 0, c0906wy.m5049m(f, 10), 0);
            textView3.setLayoutParams(layoutParams);
            textView3.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, i));
            linearLayout3.addView(textView3);
            TextView textView4 = new TextView(context);
            textView4.setText("是");
            textView4.setTextSize(14.0f);
            textView4.setTextColor(-1);
            textView4.setGravity(17);
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setShape(0);
            gradientDrawable3.setCornerRadius(c0906wy.m5049m(f, 24));
            gradientDrawable3.setColor(Color.argb(220, 254, 44, 85));
            textView4.setBackground(gradientDrawable3);
            textView4.setPadding(c0906wy.m5049m(f, 28), c0906wy.m5049m(f, 10), c0906wy.m5049m(f, 28), c0906wy.m5049m(f, 10));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams2.setMargins(c0906wy.m5049m(f, 10), 0, 0, 0);
            textView4.setLayoutParams(layoutParams2);
            textView4.setOnClickListener(new ViewOnClickListenerC0869vy(dialog, interfaceC0742sw, view, i));
            linearLayout3.addView(textView4);
            linearLayout2.addView(linearLayout3);
            linearLayout.addView(linearLayout2);
            dialog.setContentView(linearLayout);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
            dialog.setCancelable(false);
            dialog.show();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m5033F(C0906wy c0906wy, Context context, View view, InterfaceC0742sw interfaceC0742sw, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC0742sw = null;
        }
        c0906wy.m5032E(context, view, interfaceC0742sw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m5034G(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m5035H(Dialog dialog, InterfaceC0742sw interfaceC0742sw, View view, View view2) {
        dialog.dismiss();
        if (interfaceC0742sw != null) {
            interfaceC0742sw.invoke(view);
        } else {
            f7212a.m5036I(view);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    private final void m5036I(View view) {
        try {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0) {
                width = view.getMeasuredWidth();
            }
            if (height <= 0) {
                height = view.getMeasuredHeight();
            }
            if (width <= 0) {
                width = 100;
            }
            if (height <= 0) {
                height = 50;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, f, f2, 0);
            MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis, 50 + jUptimeMillis, 1, f, f2, 0);
            f7215d = true;
            view.dispatchTouchEvent(motionEventObtain);
            view.dispatchTouchEvent(motionEventObtain2);
            f7215d = false;
            motionEventObtain.recycle();
            motionEventObtain2.recycle();
        } catch (Exception unused) {
            f7215d = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    private final int m5049m(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    private final View m5050n(Activity activity, Class<?> cls) {
        View view = f7216e;
        if (view != null && view.isAttachedToWindow() && view.getId() != -1 && f7212a.m5028A(view, view.getId())) {
            return view;
        }
        Window window = activity.getWindow();
        return m5051o(window != null ? window.getDecorView() : null, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    private final View m5051o(View view, Class<?> cls) {
        int id;
        if (view == null) {
            return null;
        }
        if (cls.isInstance(view) && (id = view.getId()) != -1 && m5028A(view, id)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View viewM5051o = m5051o(viewGroup.getChildAt(i), cls);
                if (viewM5051o != null) {
                    return viewM5051o;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final Object m5052q(Class cls, XposedInterface.Chain chain) {
        chain.getClass();
        if (f7215d) {
            return chain.proceed();
        }
        try {
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            View view = (View) thisObject;
            if (!cls.isInstance(view)) {
                return chain.proceed();
            }
            int id = view.getId();
            if (id == -1) {
                return chain.proceed();
            }
            if (!f7212a.m5028A(view, id)) {
                return chain.proceed();
            }
            f7216e = view;
            if (!view.isSelected()) {
                return chain.proceed();
            }
            Object obj = chain.getArgs().get(0);
            obj.getClass();
            if (((MotionEvent) obj).getAction() != 0) {
                return chain.proceed();
            }
            Context context = view.getContext();
            m00.C0452a c0452a = m00.f3663S;
            if (!context.getSharedPreferences(c0452a.m2362Y(), 0).getBoolean(c0452a.m2345H(), false)) {
                return chain.proceed();
            }
            view.post(new RunnableC0744sy(context, view, 1));
            return Boolean.TRUE;
        } catch (Exception unused) {
            return chain.proceed();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final void m5053r(Context context, View view) {
        C0906wy c0906wy = f7212a;
        context.getClass();
        m5033F(c0906wy, context, view, null, 4, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final Object m5054t(Class cls, Method method, XposedInterface.Chain chain) {
        chain.getClass();
        try {
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            Activity activity = (Activity) thisObject;
            if (!activity.getClass().getName().equals("com.xingin.xhs.index.v2.IndexActivityV2")) {
                return chain.proceed();
            }
            View viewM5050n = f7212a.m5050n(activity, cls);
            if (viewM5050n == null) {
                return chain.proceed();
            }
            f7216e = viewM5050n;
            if (!viewM5050n.isSelected()) {
                return chain.proceed();
            }
            m00.C0452a c0452a = m00.f3663S;
            if (!activity.getSharedPreferences(c0452a.m2362Y(), 0).getBoolean(c0452a.m2345H(), false)) {
                return chain.proceed();
            }
            Object thisObject2 = chain.getThisObject();
            List args = chain.getArgs();
            args.getClass();
            new Handler(Looper.getMainLooper()).post(new RunnableC0669qy(activity, method, thisObject2, args, 0));
            return null;
        } catch (Exception unused) {
            return chain.proceed();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final void m5055u(Activity activity, Method method, Object obj, List list) {
        f7212a.m5029B(activity, new C1006zj(method, obj, list, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final na1 m5056v(Method method, Object obj, List list, boolean z) {
        XposedInterface.Invoker invoker;
        XposedInterface.Invoker type;
        if (z) {
            try {
                kf1 kf1VarM1887b = kf1.f3100G.m1887b();
                if (kf1VarM1887b != null && (invoker = kf1VarM1887b.getInvoker(method)) != null && (type = invoker.setType(XposedInterface.Invoker.Type.ORIGIN)) != null) {
                    Object[] array = list.toArray(new Object[0]);
                    type.invoke(obj, Arrays.copyOf(array, array.length));
                }
            } catch (Exception unused) {
            }
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final Object m5057x(XposedInterface.Chain chain) {
        Activity activity;
        chain.getClass();
        int i = 0;
        Object obj = chain.getArgs().get(0);
        obj.getClass();
        if (!((Boolean) obj).booleanValue()) {
            return chain.proceed();
        }
        Object thisObject = chain.getThisObject();
        View view = thisObject instanceof View ? (View) thisObject : null;
        if (view == null) {
            return chain.proceed();
        }
        Context context = view.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activity == null || !activity.getClass().getName().equals("com.xingin.xhs.index.v2.IndexActivityV2")) {
            return chain.proceed();
        }
        Context context2 = view.getContext();
        m00.C0452a c0452a = m00.f3663S;
        if (!context2.getSharedPreferences(c0452a.m2362Y(), 0).getBoolean(c0452a.m2345H(), false)) {
            return chain.proceed();
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0744sy(context2, view, i));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final void m5058y(Context context, View view) {
        C0906wy c0906wy = f7212a;
        context.getClass();
        c0906wy.m5032E(context, view, new C0621pn(23));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final na1 m5059z(View view) {
        view.getClass();
        f7212a.m5060J(view);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public final void m5060J(View view) {
        view.getClass();
        try {
            Class<?> cls = f7217f;
            if (cls == null) {
                lb0.f3404a.m2014a(f7213b, "triggerFromView: targetClass is null");
                return;
            }
            Context context = view.getContext();
            while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (!(context instanceof Activity)) {
                lb0.f3404a.m2014a(f7213b, "triggerFromView: no Activity found");
                return;
            }
            View viewM5050n = m5050n((Activity) context, cls);
            if (viewM5050n == null) {
                lb0.f3404a.m2014a(f7213b, "triggerFromView: homeTab not found");
            } else {
                m5036I(viewM5050n);
            }
        } catch (Exception e) {
            AbstractC0748t1.m4161s("triggerFromView_err: ", e.getMessage(), lb0.f3404a, f7213b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m5061p(ClassLoader classLoader, Class<?> cls) {
        XposedInterface.HookBuilder hookBuilderHook;
        classLoader.getClass();
        if (cls == null) {
            return;
        }
        f7217f = cls;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("onTouchEvent", MotionEvent.class);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0430lg(2, cls));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m5062s(ClassLoader classLoader, Class<?> cls) {
        XposedInterface.HookBuilder hookBuilderHook;
        classLoader.getClass();
        if (cls == null) {
            return;
        }
        f7217f = cls;
        try {
            Method declaredMethod = classLoader.loadClass("com.xingin.android.redutils.base.XhsActivity").getDeclaredMethod("onBackPressed", null);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0706ry(cls, declaredMethod));
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m5063w(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        classLoader.getClass();
        try {
            Class<?> clsLoadClass = classLoader.loadClass("androidx.swiperefreshlayout.widget.SwipeRefreshLayout");
            Class cls = Boolean.TYPE;
            Method declaredMethod = clsLoadClass.getDeclaredMethod("setRefreshing", cls, cls);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(11));
        } catch (Exception unused) {
        }
    }
}
