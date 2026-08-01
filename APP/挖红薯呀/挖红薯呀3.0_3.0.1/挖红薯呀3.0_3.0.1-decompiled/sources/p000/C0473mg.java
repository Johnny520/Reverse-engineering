package p000;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.libxposed.api.XposedInterface;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p000.C0291hp;

/* JADX INFO: renamed from: mg */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0473mg {

    /* JADX INFO: renamed from: b */
    private static final String f3949b = "CommentImgDl";

    /* JADX INFO: renamed from: h */
    private static volatile String f3955h;

    /* JADX INFO: renamed from: i */
    private static volatile Activity f3956i;

    /* JADX INFO: renamed from: j */
    private static volatile List<String> f3957j;

    /* JADX INFO: renamed from: k */
    private static volatile boolean f3958k;

    /* JADX INFO: renamed from: l */
    private static volatile boolean f3959l;

    /* JADX INFO: renamed from: m */
    private static volatile String f3960m;

    /* JADX INFO: renamed from: n */
    private static volatile String f3961n;

    /* JADX INFO: renamed from: o */
    private static volatile List<C0291hp.a> f3962o;

    /* JADX INFO: renamed from: p */
    private static volatile boolean f3963p;

    /* JADX INFO: renamed from: q */
    private static Class<?> f3964q;

    /* JADX INFO: renamed from: r */
    private static Class<?> f3965r;

    /* JADX INFO: renamed from: s */
    public static final int f3966s;

    /* JADX INFO: renamed from: a */
    public static final C0473mg f3948a = new C0473mg();

    /* JADX INFO: renamed from: c */
    private static final String f3950c = "xp1whs_comment_dl_panel";

    /* JADX INFO: renamed from: d */
    private static final u60 f3951d = new x51(new C0003a2(23));

    /* JADX INFO: renamed from: e */
    private static final u60 f3952e = new x51(new C0003a2(24));

    /* JADX INFO: renamed from: f */
    private static final u60 f3953f = new x51(new C0003a2(21));

    /* JADX INFO: renamed from: g */
    private static final u60 f3954g = new x51(new C0003a2(22));

    /* JADX INFO: renamed from: mg$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final int f3967a;

        /* JADX INFO: renamed from: b */
        private final int f3968b;

        /* JADX INFO: renamed from: c */
        private final int f3969c;

        /* JADX INFO: renamed from: d */
        private final int f3970d;

        /* JADX INFO: renamed from: e */
        private final int f3971e;

        /* JADX INFO: renamed from: f */
        private final int f3972f;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f3967a = i;
            this.f3968b = i2;
            this.f3969c = i3;
            this.f3970d = i4;
            this.f3971e = i5;
            this.f3972f = i6;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final int m2578a() {
            return this.f3968b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final int m2579b() {
            return this.f3969c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final int m2580c() {
            return this.f3972f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final int m2581d() {
            return this.f3970d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final int m2582e() {
            return this.f3971e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final int m2583f() {
            return this.f3967a;
        }
    }

    /* JADX INFO: renamed from: mg$b */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f3973a;

        /* JADX INFO: renamed from: b */
        private final long f3974b;

        /* JADX INFO: renamed from: c */
        private final boolean f3975c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(String str, long j, boolean z) {
            str.getClass();
            this.f3973a = str;
            this.f3974b = j;
            this.f3975c = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ b m2584e(b bVar, String str, long j, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bVar.f3973a;
            }
            if ((i & 2) != 0) {
                j = bVar.f3974b;
            }
            if ((i & 4) != 0) {
                z = bVar.f3975c;
            }
            return bVar.m2588d(str, j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final String m2585a() {
            return this.f3973a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final long m2586b() {
            return this.f3974b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final boolean m2587c() {
            return this.f3975c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final b m2588d(String str, long j, boolean z) {
            str.getClass();
            return new b(str, j, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p30.m3002l(this.f3973a, bVar.f3973a) && this.f3974b == bVar.f3974b && this.f3975c == bVar.f3975c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final long m2589f() {
            return this.f3974b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public final String m2590g() {
            return this.f3973a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: h */
        public final boolean m2591h() {
            return this.f3975c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Boolean.hashCode(this.f3975c) + AbstractC0748t1.m4146d(this.f3974b, this.f3973a.hashCode() * 31, 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "Entry(url=" + this.f3973a + ", score=" + this.f3974b + ", isDefault=" + this.f3975c + ")";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C0294hs c0294hs = C0294hs.f2354d;
        f3957j = c0294hs;
        f3962o = c0294hs;
        f3966s = 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0473mg() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    private final LinearLayout m2500A(Context context, float f, a aVar, Dialog dialog) {
        int i;
        LinearLayout linearLayout = new LinearLayout(context);
        int i2 = 1;
        linearLayout.setOrientation(1);
        int i3 = (int) (16.0f * f);
        int i4 = (int) (12.0f * f);
        linearLayout.setPadding(i3, i4, i3, i4);
        linearLayout.setBackground(f3948a.m2512M(f, aVar));
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i5 = 0;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textViewM2514O = m2514O(context, f, aVar);
        textViewM2514O.setOnClickListener(new ViewOnClickListenerC0245gg(context, i5));
        linearLayout2.addView(textViewM2514O);
        View view = new View(context);
        int i6 = (int) (8.0f * f);
        view.setLayoutParams(new LinearLayout.LayoutParams(i6, -1));
        linearLayout2.addView(view);
        if (f3959l) {
            TextView textViewM2511L = m2511L(context, f, "↓ 下载视频");
            textViewM2511L.setOnClickListener(new ViewOnClickListenerC0282hg(context, i5, dialog));
            linearLayout2.addView(textViewM2511L);
            linearLayout.addView(linearLayout2);
            return linearLayout;
        }
        TextView textViewM2509J = m2509J(context, f, "↓ 下载当前原图");
        textViewM2509J.setOnClickListener(new ViewOnClickListenerC0282hg(context, i2, dialog));
        linearLayout2.addView(textViewM2509J);
        linearLayout.addView(linearLayout2);
        String strM2576z0 = m2576z0();
        List<C0291hp.a> list = f3962o;
        boolean z = strM2576z0 != null;
        boolean z2 = list.size() > 1 || (list.size() == 1 && strM2576z0 == null);
        if (z || z2) {
            linearLayout.addView(m2513N(context, f, aVar));
            if (z && z2) {
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                TextView textViewM2511L2 = m2511L(context, f, "⬡ 下载全部 Live(" + list.size() + ")");
                textViewM2511L2.setOnClickListener(new ViewOnClickListenerC0318ig(context, list, dialog, i5));
                linearLayout3.addView(textViewM2511L2);
                View view2 = new View(context);
                view2.setLayoutParams(new LinearLayout.LayoutParams(i6, -1));
                linearLayout3.addView(view2);
                TextView textViewM2511L3 = m2511L(context, f, "⬡ 下载当前 Live");
                textViewM2511L3.setOnClickListener(new ViewOnClickListenerC0354jg(context, strM2576z0, dialog, i5));
                linearLayout3.addView(textViewM2511L3);
                linearLayout.addView(linearLayout3);
            } else if (z) {
                TextView textViewM2510K = m2510K(context, f, "⬡ 下载当前 Live 原图");
                textViewM2510K.setOnClickListener(new ViewOnClickListenerC0354jg(context, strM2576z0, dialog, 1));
                linearLayout.addView(textViewM2510K);
            } else {
                TextView textViewM2510K2 = m2510K(context, f, "⬡ 下载全部 Live(" + list.size() + ")");
                i = 1;
                textViewM2510K2.setOnClickListener(new ViewOnClickListenerC0318ig(context, list, dialog, i));
                linearLayout.addView(textViewM2510K2);
            }
            i = 1;
        } else {
            i = 1;
        }
        List<String> list2 = f3957j;
        if (list2.size() > i) {
            linearLayout.addView(m2513N(context, f, aVar));
            TextView textViewM2510K3 = m2510K(context, f, "↓ 下载全部原图(" + list2.size() + ")");
            textViewM2510K3.setOnClickListener(new ViewOnClickListenerC0318ig(context, list2, dialog, 2));
            linearLayout.addView(textViewM2510K3);
        }
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final void m2501B(Context context, View view) {
        try {
            m00.f3663S.m2387l0(context);
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final void m2502C(Context context, Dialog dialog, View view) {
        String str = f3960m;
        if (str != null) {
            C0291hp.f2335a.m1488P(context, str, null, null);
        }
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final void m2503D(Context context, Dialog dialog, View view) {
        String str = f3955h;
        if (str != null) {
            C0291hp.f2335a.m1486C(context, str, 0);
        }
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final void m2504E(Context context, List list, Dialog dialog, View view) {
        C0291hp.f2335a.m1490z(context, list);
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final void m2505F(Context context, String str, Dialog dialog, View view) {
        String str2 = f3955h;
        if (str2 != null) {
            C0291hp.f2335a.m1487F(context, str2, str, 0);
        }
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final void m2506G(Context context, String str, Dialog dialog, View view) {
        String str2 = f3955h;
        if (str2 != null) {
            C0291hp.f2335a.m1487F(context, str2, str, 0);
        }
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public static final void m2507H(Context context, List list, Dialog dialog, View view) {
        C0291hp.f2335a.m1490z(context, list);
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final void m2508I(Context context, List list, Dialog dialog, View view) {
        C0291hp.f2335a.m1489v(context, list);
        try {
            dialog.dismiss();
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    private final TextView m2509J(Context context, float f, String str) {
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
    /* JADX INFO: renamed from: K */
    private final TextView m2510K(Context context, float f, String str) {
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
    /* JADX INFO: renamed from: L */
    private final TextView m2511L(Context context, float f, String str) {
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, str, 14.0f, -1);
        textViewM4151i.setTypeface(Typeface.DEFAULT_BOLD);
        textViewM4151i.setGravity(17);
        float f2 = 12.0f * f;
        int i = (int) f2;
        int i2 = (int) (8.0f * f);
        textViewM4151i.setPadding(i2, i, i2, i);
        textViewM4151i.setMinHeight((int) (48.0f * f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
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
    /* JADX INFO: renamed from: M */
    private final GradientDrawable m2512M(float f, a aVar) {
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(24.0f * f);
        gradientDrawableM4150h.setColor(aVar.m2578a());
        int i = (int) (1.0f * f);
        if (i < 1) {
            i = 1;
        }
        gradientDrawableM4150h.setStroke(i, aVar.m2579b());
        return gradientDrawableM4150h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    private final View m2513N(Context context, float f, a aVar) {
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
        view.setBackgroundColor(aVar.m2580c());
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    private final TextView m2514O(Context context, float f, a aVar) {
        TextView textView = new TextView(context);
        textView.setText("⚙ 模块设置");
        textView.setTextSize(16.0f);
        textView.setTextColor(aVar.m2582e());
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
        gradientDrawable.setStroke(i3, aVar.m2579b());
        gradientDrawable.setColor(aVar.m2581d());
        textView.setBackground(gradientDrawable);
        textView.setClickable(true);
        textView.setFocusable(true);
        return textView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    private final a m2515P(Context context) {
        Object systemService = context.getSystemService("uimode");
        systemService.getClass();
        return ((UiModeManager) systemService).getNightMode() == 2 ? new a(-1, Color.argb(230, 30, 30, 38), Color.argb(30, 255, 255, 255), Color.argb(80, 120, 120, 130), -1, Color.argb(40, 255, 255, 255)) : new a(Color.argb(255, 30, 30, 38), Color.argb(230, 255, 255, 255), Color.argb(30, 0, 0, 0), Color.argb(80, 180, 180, 190), Color.argb(255, 60, 60, 70), Color.argb(40, 0, 0, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    private final String m2516Q(Object obj) throws IllegalAccessException, InvocationTargetException {
        String str;
        Method[] declaredMethods = obj.getClass().getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            if (parameterTypes.length == 0 && p30.m3002l(method.getReturnType(), String.class)) {
                arrayList.add(method);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object objInvoke = ((Method) it.next()).invoke(obj, null);
            String str2 = objInvoke instanceof String ? (String) objInvoke : null;
            if (str2 != null) {
                str = k41.m1764V(str2, "xhscdn.com", false) ? str2 : null;
                if (str != null) {
                    break;
                }
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    private final String m2517R(Object obj) {
        String strM2572x0 = m2572x0(obj);
        return strM2572x0 != null ? strM2572x0 : m2521V(obj, new C0881w9(7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public static final boolean m2518S(String str) {
        str.getClass();
        return k41.m1764V(str, "xhscdn.com", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    private final List<?> m2519T(Object obj) {
        Object objInvoke;
        Class<?> cls = f3964q;
        String name = cls != null ? cls.getName() : m2531c0();
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(superclass.getDeclaredMethods());
            while (c0822vM1933s.hasNext()) {
                Method method = (Method) c0822vM1933s.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && List.class.isAssignableFrom(method.getReturnType()) && k41.m1764V(method.getGenericReturnType().toString(), name, false)) {
                    try {
                        objInvoke = method.invoke(obj, null);
                    } catch (Exception unused) {
                    }
                    List<?> list = objInvoke instanceof List ? (List) objInvoke : null;
                    if (list != null && !list.isEmpty()) {
                        return list;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    private final ViewGroup m2520U(ViewGroup viewGroup) {
        ViewGroup viewGroupM2520U;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (k41.m1764V(childAt.getClass().getName(), "RecyclerView", false)) {
                    return viewGroup;
                }
                if ((childAt instanceof ViewGroup) && (viewGroupM2520U = m2520U((ViewGroup) childAt)) != null) {
                    return viewGroupM2520U;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    private final String m2521V(Object obj, InterfaceC0742sw interfaceC0742sw) {
        String str;
        C0822v c0822vM1933s = AbstractC0398kl.m1933s(obj.getClass().getDeclaredMethods());
        while (true) {
            if (!c0822vM1933s.hasNext()) {
                break;
            }
            Method method = (Method) c0822vM1933s.next();
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            if (parameterTypes.length == 0 && p30.m3002l(method.getReturnType(), String.class)) {
                try {
                    Object objInvoke = method.invoke(obj, null);
                    str = objInvoke instanceof String ? (String) objInvoke : null;
                    if (str != null && ((Boolean) interfaceC0742sw.invoke(str)).booleanValue()) {
                        break;
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    private final String m2522W(Object obj) {
        String strM2574y0 = m2574y0(obj);
        return strM2574y0 != null ? strM2574y0 : m2521V(obj, new C0881w9(6));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public static final boolean m2523X(String str) {
        str.getClass();
        return k41.m1764V(str, "\"stream\"", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    private final List<?> m2524Y(Object obj) {
        Object objInvoke;
        Class<?> cls = f3965r;
        String name = cls != null ? cls.getName() : m2533d0();
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(superclass.getDeclaredMethods());
            while (c0822vM1933s.hasNext()) {
                Method method = (Method) c0822vM1933s.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && List.class.isAssignableFrom(method.getReturnType()) && k41.m1764V(method.getGenericReturnType().toString(), name, false)) {
                    try {
                        objInvoke = method.invoke(obj, null);
                    } catch (Exception unused) {
                    }
                    List<?> list = objInvoke instanceof List ? (List) objInvoke : null;
                    if (list != null && !list.isEmpty()) {
                        return list;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: k41.Z(java.lang.CharSequence, java.lang.String, int, boolean, int):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    private final String m2525Z(String str) {
        int iM1768Z = k41.m1768Z(str, m2529b0(), 0, false, 6);
        if (iM1768Z >= 0) {
            str = str.substring(iM1768Z);
        }
        String strM2527a0 = m2527a0();
        int iM1768Z2 = k41.m1768Z(str, "?", 0, false, 6);
        if (iM1768Z2 != -1) {
            str = str.substring(0, iM1768Z2);
        }
        return strM2527a0 + str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    private final String m2527a0() {
        return (String) f3952e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    private final String m2529b0() {
        return (String) f3951d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    private final String m2531c0() {
        return (String) f3953f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    private final String m2533d0() {
        return (String) f3954g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    private final boolean m2535e0(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (k41.m1764V(childAt.getClass().getName(), "RecyclerView", false)) {
                    return true;
                }
                if ((childAt instanceof ViewGroup) && m2535e0((ViewGroup) childAt)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    private final void m2538g0(ClassLoader classLoader) {
        XposedInterface.HookBuilder hookBuilderHook;
        XposedInterface.HookBuilder hookBuilderHook2;
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.xingin.comment.media.browser.CommentMediaBrowserActivity");
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(clsLoadClass.getDeclaredMethods());
            while (true) {
                if (!c0822vM1933s.hasNext()) {
                    break;
                }
                Method method = (Method) c0822vM1933s.next();
                if (p30.m3002l(method.getName(), "onCreate") && method.getParameterTypes().length == 1) {
                    kf1 kf1VarM1887b = kf1.f3100G.m1887b();
                    if (kf1VarM1887b != null && (hookBuilderHook2 = kf1VarM1887b.hook(method)) != null) {
                        hookBuilderHook2.intercept(new C0796ua(3));
                    }
                }
            }
            C0822v c0822vM1933s2 = AbstractC0398kl.m1933s(clsLoadClass.getDeclaredMethods());
            while (c0822vM1933s2.hasNext()) {
                Method method2 = (Method) c0822vM1933s2.next();
                if (p30.m3002l(method2.getName(), "onDestroy")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0) {
                        kf1 kf1VarM1887b2 = kf1.f3100G.m1887b();
                        if (kf1VarM1887b2 == null || (hookBuilderHook = kf1VarM1887b2.hook(method2)) == null) {
                            return;
                        }
                        hookBuilderHook.intercept(new C0796ua(5));
                        return;
                    }
                }
            }
        } catch (Exception e) {
            AbstractC0748t1.m4161s("browser_hook_fail: ", e.getMessage(), lb0.f3404a, f3949b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public static final Object m2540h0(XposedInterface.Chain chain) {
        chain.getClass();
        f3963p = true;
        C0294hs c0294hs = C0294hs.f2354d;
        f3957j = c0294hs;
        f3962o = c0294hs;
        f3959l = false;
        f3960m = null;
        f3961n = null;
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i0 */
    public static final na1 m2542i0(XposedInterface.Chain chain) {
        chain.getClass();
        chain.proceed();
        f3963p = false;
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    private final void m2544j0(ClassLoader classLoader) {
        kf1 kf1VarM1887b;
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(classLoader.loadClass("com.xingin.entities.CommentCommentInfo").getDeclaredMethods());
            while (c0822vM1933s.hasNext()) {
                Method method = (Method) c0822vM1933s.next();
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 0 && List.class.isAssignableFrom(method.getReturnType()) && (kf1VarM1887b = kf1.f3100G.m1887b()) != null && (hookBuilderHook = kf1VarM1887b.hook(method)) != null) {
                    hookBuilderHook.intercept(new C0430lg(0, method));
                }
            }
        } catch (Exception e) {
            AbstractC0748t1.m4161s("cci_hook_fail: ", e.getMessage(), lb0.f3404a, f3949b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public static final Object m2546k0(Method method, XposedInterface.Chain chain) {
        Object obj;
        C0473mg c0473mg;
        String strM2572x0;
        String strM2570w0;
        chain.getClass();
        Object objProceed = chain.proceed();
        List list = objProceed instanceof List ? (List) objProceed : null;
        if (list != null && !list.isEmpty() && f3963p && (obj = list.get(0)) != null) {
            String name = obj.getClass().getName();
            try {
                if (k41.m1764V(name, "CommentVideoInfo", false)) {
                    if (f3957j.isEmpty()) {
                        f3959l = true;
                        f3955h = null;
                        C0294hs c0294hs = C0294hs.f2354d;
                        f3957j = c0294hs;
                        f3962o = c0294hs;
                        f3961n = null;
                        C0473mg c0473mg2 = f3948a;
                        String strM2574y0 = c0473mg2.m2574y0(obj);
                        if (strM2574y0 != null) {
                            f3960m = c0473mg2.m2570w0(strM2574y0);
                            return list;
                        }
                    }
                } else if (k41.m1764V(name, "CommentPictureInfo", false)) {
                    f3959l = false;
                    f3960m = null;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list) {
                        if (obj2 != null && (strM2572x0 = (c0473mg = f3948a).m2572x0(obj2)) != null) {
                            String strM2525Z = c0473mg.m2525Z(strM2572x0);
                            arrayList.add(strM2525Z);
                            String strM2574y02 = c0473mg.m2574y0(obj2);
                            if (strM2574y02 != null && (strM2570w0 = c0473mg.m2570w0(strM2574y02)) != null) {
                                arrayList2.add(new C0291hp.a(strM2525Z, strM2570w0));
                            }
                        }
                    }
                    f3957j = arrayList;
                    f3962o = arrayList2;
                }
            } catch (Exception e) {
                lb0.f3404a.m2014a(f3949b, "cci_generic_err(" + method.getName() + "): " + e.getMessage());
                return list;
            }
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    private final void m2548l0() {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method declaredMethod = Dialog.class.getDeclaredMethod("show", null);
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(declaredMethod)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(6));
        } catch (Exception e) {
            AbstractC0748t1.m4161s("dialog_hook_fail: ", e.getMessage(), lb0.f3404a, f3949b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public static final Object m2550m0(XposedInterface.Chain chain) {
        chain.getClass();
        Object objProceed = chain.proceed();
        if (f3958k) {
            Object thisObject = chain.getThisObject();
            thisObject.getClass();
            Dialog dialog = (Dialog) thisObject;
            C0473mg c0473mg = f3948a;
            if (c0473mg.m2566u0(dialog)) {
                c0473mg.m2560r0(dialog);
                return objProceed;
            }
        }
        return objProceed;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    private final void m2552n0(ClassLoader classLoader, Class<?> cls, Class<?> cls2) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(cls.getDeclaredMethods());
            while (c0822vM1933s.hasNext()) {
                Method method = (Method) c0822vM1933s.next();
                if (method.getParameterTypes().length == 8 && p30.m3002l(method.getParameterTypes()[3], cls2) && p30.m3002l(method.getParameterTypes()[0], Activity.class)) {
                    kf1 kf1VarM1887b = kf1.f3100G.m1887b();
                    if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(method)) == null) {
                        return;
                    }
                    hookBuilderHook.intercept(new C0796ua(7));
                    return;
                }
            }
            lb0.f3404a.m2014a(f3949b, "share_hook_not_found");
        } catch (Exception e) {
            AbstractC0748t1.m4161s("share_install_fail: ", e.getMessage(), lb0.f3404a, f3949b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public static final Object m2554o0(XposedInterface.Chain chain) {
        C0633pz c0633pzM3366r;
        String strM3177m;
        chain.getClass();
        f3958k = true;
        try {
            Object obj = chain.getArgs().get(3);
            C0670qz c0670qz = C0670qz.f5241a;
            obj.getClass();
            c0633pzM3366r = c0670qz.m3366r(obj);
            strM3177m = c0633pzM3366r.m3177m();
        } catch (Exception e) {
            AbstractC0748t1.m4161s("share_err: ", e.getMessage(), lb0.f3404a, f3949b);
        }
        if (strM3177m == null && (strM3177m = c0633pzM3366r.m3178n()) == null) {
            return chain.proceed();
        }
        f3955h = f3948a.m2525Z(strM3177m);
        Object obj2 = chain.getArgs().get(0);
        f3956i = obj2 instanceof Activity ? (Activity) obj2 : null;
        if (c0633pzM3366r.m3180p() && c0633pzM3366r.m3175k() != null) {
            f3961n = ab0.f88a.m45j(c0633pzM3366r.m3175k());
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    private final void m2556p0(Class<?> cls) {
        XposedInterface.HookBuilder hookBuilderHook;
        try {
            Method methodM3916r4 = C0695rn.f5457a.m3916r4(cls);
            if (methodM3916r4 == null) {
                lb0.f3404a.m2014a(f3949b, "s1_hook_not_found");
                return;
            }
            kf1 kf1VarM1887b = kf1.f3100G.m1887b();
            if (kf1VarM1887b == null || (hookBuilderHook = kf1VarM1887b.hook(methodM3916r4)) == null) {
                return;
            }
            hookBuilderHook.intercept(new C0796ua(4));
        } catch (Exception e) {
            AbstractC0748t1.m4161s("s1_install_fail: ", e.getMessage(), lb0.f3404a, f3949b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1 A[Catch: Exception -> 0x0054, TryCatch #1 {Exception -> 0x0054, blocks: (B:3:0x0008, B:6:0x0017, B:8:0x001d, B:9:0x0025, B:11:0x002b, B:13:0x003b, B:15:0x0045, B:17:0x0051, B:35:0x00a3, B:37:0x00bd, B:42:0x00c8, B:45:0x00d0, B:47:0x00e1, B:48:0x00f6, B:50:0x00fc, B:53:0x0103, B:55:0x010b, B:65:0x012e, B:66:0x0133, B:21:0x0059, B:22:0x005e, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007c, B:31:0x008c, B:33:0x009b, B:34:0x009e), top: B:74:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133 A[Catch: Exception -> 0x0054, TRY_LEAVE, TryCatch #1 {Exception -> 0x0054, blocks: (B:3:0x0008, B:6:0x0017, B:8:0x001d, B:9:0x0025, B:11:0x002b, B:13:0x003b, B:15:0x0045, B:17:0x0051, B:35:0x00a3, B:37:0x00bd, B:42:0x00c8, B:45:0x00d0, B:47:0x00e1, B:48:0x00f6, B:50:0x00fc, B:53:0x0103, B:55:0x010b, B:65:0x012e, B:66:0x0133, B:21:0x0059, B:22:0x005e, B:24:0x0068, B:26:0x006e, B:27:0x0076, B:29:0x007c, B:31:0x008c, B:33:0x009b, B:34:0x009e), top: B:74:0x0008 }] */
    /* JADX INFO: renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m2558q0(XposedInterface.Chain chain) {
        Class<?> superclass;
        Activity activity;
        List<?> listM2524Y;
        boolean z;
        C0473mg c0473mg;
        String strM2517R;
        String strM2570w0;
        C0294hs c0294hs = C0294hs.f2354d;
        chain.getClass();
        f3958k = true;
        try {
        } catch (Exception e) {
            AbstractC0748t1.m4161s("s1_err: ", e.getMessage(), lb0.f3404a, f3949b);
        }
        for (superclass = chain.getThisObject().getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(superclass.getDeclaredMethods());
            while (c0822vM1933s.hasNext()) {
                Method method = (Method) c0822vM1933s.next();
                if (p30.m3002l(method.getReturnType(), Activity.class)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0) {
                        Object objInvoke = method.invoke(chain.getThisObject(), null);
                        activity = objInvoke instanceof Activity ? (Activity) objInvoke : null;
                        f3956i = activity;
                        Object obj = chain.getArgs().get(0);
                        C0473mg c0473mg2 = f3948a;
                        obj.getClass();
                        List<?> listM2519T = c0473mg2.m2519T(obj);
                        listM2524Y = c0473mg2.m2524Y(obj);
                        z = listM2519T == null && !listM2519T.isEmpty();
                        if (listM2524Y == null && !listM2524Y.isEmpty() && !z) {
                            f3959l = true;
                            f3955h = null;
                            f3957j = c0294hs;
                            f3962o = c0294hs;
                            f3960m = c0473mg2.m2568v0(listM2524Y);
                        } else if (z) {
                            f3959l = false;
                            f3960m = null;
                            f3957j = c0294hs;
                            f3962o = c0294hs;
                        } else {
                            f3959l = false;
                            f3960m = null;
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            listM2519T.getClass();
                            for (Object obj2 : listM2519T) {
                                if (obj2 != null && (strM2517R = (c0473mg = f3948a).m2517R(obj2)) != null) {
                                    String strM2525Z = c0473mg.m2525Z(strM2517R);
                                    arrayList.add(strM2525Z);
                                    try {
                                        String strM2522W = c0473mg.m2522W(obj2);
                                        if (strM2522W != null && strM2522W.length() != 0 && (strM2570w0 = c0473mg.m2570w0(strM2522W)) != null) {
                                            arrayList2.add(new C0291hp.a(strM2525Z, strM2570w0));
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                            f3957j = arrayList;
                            f3962o = arrayList2;
                        }
                        return chain.proceed();
                    }
                }
            }
        }
        Class<?> superclass2 = chain.getThisObject().getClass();
        while (true) {
            if (superclass2 == null || superclass2.equals(Object.class)) {
                break;
            }
            C0822v c0822vM1933s2 = AbstractC0398kl.m1933s(superclass2.getDeclaredFields());
            while (c0822vM1933s2.hasNext()) {
                Field field = (Field) c0822vM1933s2.next();
                if (p30.m3002l(field.getType(), Activity.class)) {
                    field.setAccessible(true);
                    Object obj3 = field.get(chain.getThisObject());
                    if (obj3 instanceof Activity) {
                        activity = (Activity) obj3;
                    }
                }
            }
            superclass2 = superclass2.getSuperclass();
        }
        f3956i = activity;
        Object obj4 = chain.getArgs().get(0);
        C0473mg c0473mg22 = f3948a;
        obj4.getClass();
        List<?> listM2519T2 = c0473mg22.m2519T(obj4);
        listM2524Y = c0473mg22.m2524Y(obj4);
        if (listM2519T2 == null) {
            if (listM2524Y == null) {
                if (z) {
                }
            }
        }
        return chain.proceed();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    private final void m2560r0(Dialog dialog) {
        try {
            Window window = dialog.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            final ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup == null) {
                return;
            }
            Context context = dialog.getContext();
            context.getClass();
            final LinearLayout linearLayoutM2500A = m2500A(context, context.getResources().getDisplayMetrics().density, m2515P(context), dialog);
            linearLayoutM2500A.setTag(f3950c);
            final ViewGroup viewGroupM2520U = m2520U(viewGroup);
            if (viewGroupM2520U != null) {
                final int i = 0;
                viewGroupM2520U.addView(linearLayoutM2500A, 0);
                dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: kg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        int i2 = i;
                        LinearLayout linearLayout = linearLayoutM2500A;
                        ViewGroup viewGroup2 = viewGroupM2520U;
                        switch (i2) {
                            case 0:
                                C0473mg.m2564t0(viewGroup2, linearLayout, dialogInterface);
                                break;
                            default:
                                C0473mg.m2562s0(viewGroup2, linearLayout, dialogInterface);
                                break;
                        }
                    }
                });
            } else {
                viewGroup.addView(linearLayoutM2500A);
                final int i2 = 1;
                dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: kg
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        int i22 = i2;
                        LinearLayout linearLayout = linearLayoutM2500A;
                        ViewGroup viewGroup2 = viewGroup;
                        switch (i22) {
                            case 0:
                                C0473mg.m2564t0(viewGroup2, linearLayout, dialogInterface);
                                break;
                            default:
                                C0473mg.m2562s0(viewGroup2, linearLayout, dialogInterface);
                                break;
                        }
                    }
                });
            }
        } catch (Exception e) {
            AbstractC0748t1.m4161s("dialog_inject_fail: ", e.getMessage(), lb0.f3404a, f3949b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s0 */
    public static final void m2562s0(ViewGroup viewGroup, LinearLayout linearLayout, DialogInterface dialogInterface) {
        try {
            viewGroup.removeView(linearLayout);
        } catch (Exception unused) {
        }
        f3958k = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public static final void m2564t0(ViewGroup viewGroup, LinearLayout linearLayout, DialogInterface dialogInterface) {
        try {
            viewGroup.removeView(linearLayout);
        } catch (Exception unused) {
        }
        f3958k = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u0 */
    private final boolean m2566u0(Dialog dialog) {
        Window window = dialog.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return false;
        }
        return m2535e0(viewGroup);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v0 */
    private final String m2568v0(List<?> list) {
        String strM2570w0;
        for (Object obj : list) {
            if (obj != null) {
                try {
                    String strM2522W = m2522W(obj);
                    if (strM2522W != null && strM2522W.length() != 0 && (strM2570w0 = m2570w0(strM2522W)) != null) {
                        return strM2570w0;
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final String m2569w() {
        return ik0.f2579a.m1592a(35, 12, 4, 65, 56, 66, 95, 30, 56, 22, 3, 28, 34, 21, 23, 28, 35, 15, 94, 73, 35, 11, 19, 85, 37, 86, 19, 94, 38);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w0 */
    private final String m2570w0(String str) {
        Object next;
        JSONArray jSONArrayOptJSONArray;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("stream");
            if (jSONObjectOptJSONObject == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(itKeys.next());
                if (jSONArrayOptJSONArray2 != null) {
                    int length = jSONArrayOptJSONArray2.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i);
                        if (jSONObjectOptJSONObject2 != null) {
                            String strOptString = jSONObjectOptJSONObject2.optString("master_url", "");
                            if (strOptString.length() == 0 && ((jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("backup_urls")) == null || (strOptString = jSONArrayOptJSONArray.optString(0, "")) == null)) {
                                strOptString = "";
                            }
                            if (strOptString.length() != 0) {
                                boolean z = true;
                                if (jSONObjectOptJSONObject2.optInt("default_stream", 1) != 0) {
                                    z = false;
                                }
                                b bVar = new b(strOptString, (jSONObjectOptJSONObject2.optLong("avg_bitrate", 0L) * 100) + (jSONObjectOptJSONObject2.optLong("weight", 0L) * 100000000) + jSONObjectOptJSONObject2.optLong("height", 0L), z);
                                if (z) {
                                    arrayList.add(bVar);
                                } else {
                                    arrayList2.add(bVar);
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = arrayList2;
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long jM2589f = ((b) next).m2589f();
                    do {
                        Object next2 = it.next();
                        long jM2589f2 = ((b) next2).m2589f();
                        if (jM2589f < jM2589f2) {
                            next = next2;
                            jM2589f = jM2589f2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            b bVar2 = (b) next;
            if (bVar2 != null) {
                return bVar2.m2590g();
            }
            return null;
        } catch (Exception e) {
            AbstractC0748t1.m4161s("parse_json_err: ", e.getMessage(), lb0.f3404a, f3949b);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final String m2571x() {
        return ik0.f2579a.m1592a(100, 27, 31, 92, 38, 29, 30, 69, 100);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    private final String m2572x0(Object obj) {
        try {
            String[] strArr = {"picUrl", "originalPicUrl"};
            for (int i = 0; i < 2; i++) {
                try {
                    Field declaredField = obj.getClass().getDeclaredField(strArr[i]);
                    declaredField.setAccessible(true);
                    if (p30.m3002l(declaredField.getType(), String.class)) {
                        Object obj2 = declaredField.get(obj);
                        String str = obj2 instanceof String ? (String) obj2 : null;
                        if (str != null && str.length() != 0 && k41.m1764V(str, "xhscdn.com", false)) {
                            return str;
                        }
                    } else {
                        continue;
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final String m2573y() {
        return ik0.f2579a.m1592a(8, 23, 29, 92, 46, 22, 4, 97, 34, 27, 4, 68, 57, 29, 57, 95, 45, 23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y0 */
    private final String m2574y0(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("videoInfo");
            declaredField.setAccessible(true);
            if (p30.m3002l(declaredField.getType(), String.class)) {
                Object obj2 = declaredField.get(obj);
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null && str.length() != 0) {
                    if (k41.m1764V(str, "stream", false)) {
                        return str;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final String m2575z() {
        return ik0.f2579a.m1592a(8, 23, 29, 92, 46, 22, 4, 103, 34, 28, 21, 94, 2, 22, 22, 94);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z0 */
    private final String m2576z0() {
        Object next;
        if (f3961n != null) {
            return f3961n;
        }
        String str = f3955h;
        if (str == null) {
            return null;
        }
        Iterator<T> it = f3962o.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (p30.m3002l(((C0291hp.a) next).m1495e(), str)) {
                break;
            }
        }
        C0291hp.a aVar = (C0291hp.a) next;
        if (aVar != null) {
            return aVar.m1496f();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public final void m2577f0(ClassLoader classLoader, Class<?> cls, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5) {
        classLoader.getClass();
        f3964q = cls4;
        f3965r = cls5;
        if (cls != null && cls3 != null) {
            m2552n0(classLoader, cls, cls3);
        }
        if (cls2 != null) {
            m2556p0(cls2);
        }
        m2538g0(classLoader);
        m2544j0(classLoader);
        m2548l0();
    }
}
