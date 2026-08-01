package p000;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import p000.C0439lp;

/* JADX INFO: renamed from: kp */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC0402kp extends Dialog {

    /* JADX INFO: renamed from: u */
    public static final int f3231u = 8;

    /* JADX INFO: renamed from: d */
    private final Handler f3232d;

    /* JADX INFO: renamed from: e */
    private long f3233e;

    /* JADX INFO: renamed from: f */
    private long f3234f;

    /* JADX INFO: renamed from: g */
    private String f3235g;

    /* JADX INFO: renamed from: h */
    private TextView f3236h;

    /* JADX INFO: renamed from: i */
    private View f3237i;

    /* JADX INFO: renamed from: j */
    private View f3238j;

    /* JADX INFO: renamed from: k */
    private TextView f3239k;

    /* JADX INFO: renamed from: l */
    private TextView f3240l;

    /* JADX INFO: renamed from: m */
    private TextView f3241m;

    /* JADX INFO: renamed from: n */
    private TextView f3242n;

    /* JADX INFO: renamed from: o */
    private final int f3243o;

    /* JADX INFO: renamed from: p */
    private final int f3244p;

    /* JADX INFO: renamed from: q */
    private final int f3245q;

    /* JADX INFO: renamed from: r */
    private final int f3246r;

    /* JADX INFO: renamed from: s */
    private final int f3247s;

    /* JADX INFO: renamed from: t */
    private final int f3248t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0402kp(Context context, String str) {
        super(context, R.style.Theme.DeviceDefault.Dialog.NoActionBar);
        context.getClass();
        str.getClass();
        this.f3232d = new Handler(Looper.getMainLooper());
        this.f3235g = "";
        this.f3243o = Color.argb(255, 40, 40, 45);
        this.f3244p = Color.argb(255, 33, 150, 243);
        this.f3245q = Color.argb(230, 255, 255, 255);
        this.f3246r = Color.argb(160, 255, 255, 255);
        this.f3247s = Color.argb(100, 255, 255, 255);
        this.f3248t = Color.argb(200, 80, 80, 85);
        this.f3235g = str;
        m1946e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final void m1946e() {
        Window window = getWindow();
        int i = 0;
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-2, -2);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setGravity(17);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(m1948g(24), m1948g(20), m1948g(24), m1948g(16));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(m1948g(16));
        gradientDrawable.setColor(this.f3243o);
        linearLayout.setBackground(gradientDrawable);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(m1948g(320), -2));
        TextView textView = new TextView(getContext());
        textView.setText("下载中: " + this.f3235g);
        textView.setTextSize(15.0f);
        textView.setTextColor(this.f3245q);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, m1948g(14));
        this.f3236h = textView;
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(0, 0, 0, m1948g(10));
        View view = new View(getContext());
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(m1948g(4));
        gradientDrawableM4150h.setColor(this.f3247s);
        view.setBackground(gradientDrawableM4150h);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, m1948g(8)));
        this.f3237i = view;
        linearLayout2.addView(view);
        FrameLayout frameLayout = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, m1948g(8));
        layoutParams.topMargin = -m1948g(8);
        frameLayout.setLayoutParams(layoutParams);
        View view2 = new View(getContext());
        GradientDrawable gradientDrawableM4150h2 = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h2.setCornerRadius(m1948g(4));
        gradientDrawableM4150h2.setColor(this.f3244p);
        view2.setBackground(gradientDrawableM4150h2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(0, m1948g(8));
        layoutParams2.gravity = 8388627;
        view2.setLayoutParams(layoutParams2);
        this.f3238j = view2;
        frameLayout.addView(view2);
        linearLayout2.addView(frameLayout);
        linearLayout.addView(linearLayout2);
        TextView textView2 = new TextView(getContext());
        textView2.setText("0%");
        textView2.setTextSize(28.0f);
        textView2.setTextColor(this.f3245q);
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, m1948g(6));
        this.f3239k = textView2;
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(getContext());
        textView3.setText("0 B / --");
        textView3.setTextSize(12.0f);
        textView3.setTextColor(this.f3246r);
        textView3.setGravity(17);
        this.f3240l = textView3;
        linearLayout.addView(textView3);
        TextView textView4 = new TextView(getContext());
        textView4.setText("");
        textView4.setTextSize(11.0f);
        textView4.setTextColor(this.f3246r);
        textView4.setGravity(17);
        textView4.setPadding(0, m1948g(2), 0, m1948g(12));
        this.f3241m = textView4;
        linearLayout.addView(textView4);
        TextView textView5 = new TextView(getContext());
        textView5.setText("取消下载");
        textView5.setTextSize(14.0f);
        textView5.setTextColor(-1);
        textView5.setGravity(17);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(m1948g(22));
        gradientDrawable2.setColor(this.f3248t);
        textView5.setBackground(gradientDrawable2);
        textView5.setPadding(m1948g(16), m1948g(10), m1948g(16), m1948g(10));
        textView5.setOnClickListener(new ViewOnClickListenerC0363jp(textView5, i));
        this.f3242n = textView5;
        linearLayout.addView(textView5);
        setContentView(linearLayout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final void m1947f(TextView textView, View view) {
        textView.setEnabled(false);
        textView.setText("取消中...");
        C0439lp.f3566a.m2045a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final int m1948g(int i) {
        return (int) (i * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final String m1949h(long j) {
        if (j >= 1024) {
            return j < 1048576 ? String.format("%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1024.0d)}, 1)) : j < 1073741824 ? String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1)) : String.format("%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(j / 1.073741824E9d)}, 1));
        }
        return j + " B";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final String m1950i(long j) {
        if (j <= 0) {
            return "";
        }
        if (j >= 1024) {
            return j < 1048576 ? String.format("%.1f KB/s", Arrays.copyOf(new Object[]{Double.valueOf(j / 1024.0d)}, 1)) : String.format("%.1f MB/s", Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1));
        }
        return j + " B/s";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    private final void m1951j(C0439lp.a aVar) {
        if (aVar == null) {
            return;
        }
        if (aVar.m2065k() || aVar.m2066l()) {
            this.f3232d.post(new RunnableC0327ip(this, 0));
        } else {
            this.f3232d.post(new RunnableC0751t4(2, this, aVar));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final void m1952k(DialogC0402kp dialogC0402kp) {
        dialogC0402kp.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final void m1953l(DialogC0402kp dialogC0402kp, C0439lp.a aVar) {
        dialogC0402kp.m1955n(aVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final na1 m1954m(DialogC0402kp dialogC0402kp, C0439lp.a aVar) {
        dialogC0402kp.m1951j(aVar);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    private final void m1955n(C0439lp.a aVar) {
        if (aVar.m2063i().length() > 0 && !p30.m3002l(aVar.m2063i(), this.f3235g)) {
            String strM2063i = aVar.m2063i();
            this.f3235g = strM2063i;
            TextView textView = this.f3236h;
            if (textView == null) {
                p30.m2986V("titleView");
                throw null;
            }
            textView.setText("下载中: " + strM2063i);
        }
        long jM2064j = aVar.m2064j();
        long jM2062h = aVar.m2062h();
        int iM4907n = w60.m4907n(jM2064j > 0 ? (int) ((100 * jM2062h) / jM2064j) : 0, 0, 100);
        int iM1948g = m1948g(272);
        int i = jM2064j > 0 ? (int) ((((long) iM1948g) * jM2062h) / jM2064j) : 0;
        View view = this.f3238j;
        if (view == null) {
            p30.m2986V("progressBarFill");
            throw null;
        }
        if (view == null) {
            p30.m2986V("progressBarFill");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        int i2 = i >= 0 ? i : 0;
        if (i2 <= iM1948g) {
            iM1948g = i2;
        }
        layoutParams.width = iM1948g;
        view.setLayoutParams(layoutParams);
        View view2 = this.f3238j;
        if (view2 == null) {
            p30.m2986V("progressBarFill");
            throw null;
        }
        view2.requestLayout();
        TextView textView2 = this.f3239k;
        if (textView2 == null) {
            p30.m2986V("percentView");
            throw null;
        }
        textView2.setText(iM4907n + "%");
        TextView textView3 = this.f3240l;
        if (textView3 == null) {
            p30.m2986V("sizeView");
            throw null;
        }
        textView3.setText(m1949h(jM2062h) + " / " + (jM2064j > 0 ? m1949h(jM2064j) : "--"));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!p30.m3002l(aVar.m2063i(), this.f3235g)) {
            this.f3233e = jCurrentTimeMillis;
            this.f3234f = jM2062h;
            TextView textView4 = this.f3241m;
            if (textView4 != null) {
                textView4.setText("");
                return;
            } else {
                p30.m2986V("speedView");
                throw null;
            }
        }
        long j = this.f3233e;
        if (j <= 0 || jCurrentTimeMillis <= j) {
            this.f3233e = jCurrentTimeMillis;
            this.f3234f = jM2062h;
            return;
        }
        double d = (jCurrentTimeMillis - j) / 1000.0d;
        if (d > 0.3d) {
            long j2 = (long) ((jM2062h - this.f3234f) / d);
            TextView textView5 = this.f3241m;
            if (textView5 == null) {
                p30.m2986V("speedView");
                throw null;
            }
            textView5.setText(m1950i(j2));
            this.f3233e = jCurrentTimeMillis;
            this.f3234f = jM2062h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        C0439lp.f3566a.m2052h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void show() {
        super.show();
        C0439lp.f3566a.m2051g(new C0532o(4, this));
    }
}
