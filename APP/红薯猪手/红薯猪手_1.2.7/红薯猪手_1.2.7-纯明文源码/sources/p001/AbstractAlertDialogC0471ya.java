package p001;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: ۟.ya */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAlertDialogC0471ya extends AlertDialog {

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public static final int f1877 = C0407tb.m1249(10.0f);

    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public static final int f1878 = C0407tb.m1249(15.0f);

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static final float f1879 = 16.0f;

    /* JADX INFO: renamed from: ۥ۟ۧ, reason: contains not printable characters */
    public static final float f1880 = 14.0f;

    /* JADX INFO: renamed from: ۥ۟ۨ, reason: contains not printable characters */
    public static final int f1881 = C0407tb.m1249(40.0f);

    /* JADX INFO: renamed from: ۥ۠ */
    public static final int f1216 = C0407tb.m1249(30.0f);

    /* JADX INFO: renamed from: ۥ۠۟, reason: contains not printable characters */
    public static final int f1882 = Color.parseColor("#F9E27E");

    /* JADX INFO: renamed from: ۥ۠۠, reason: contains not printable characters */
    public static final int f1883;

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    public static final int f1884;

    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public static final int f1885;

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public static final int f1886;

    /* JADX INFO: renamed from: ۥ */
    public final Context f1217;

    /* JADX INFO: renamed from: ۥ۟ */
    public View f1218;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f1887;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public boolean f1888;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public boolean f1889;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public int f1890;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public int f1891;

    static {
        Color.parseColor("#EEEEEE");
        f1883 = Color.argb(255, 255, 248, 196);
        f1884 = Color.argb(255, 245, 123, 0);
        f1885 = C0407tb.m1249(10.0f);
        f1886 = C0407tb.m1249(5.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractAlertDialogC0471ya(Context context, int i) {
        super(context, i);
        C0237h4.m1090("cxt", context);
        this.f1217 = context;
        this.f1887 = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.AlertDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(1024);
        }
        super.onCreate(bundle);
        View viewMo1046 = mo1046();
        this.f1218 = viewMo1046;
        if (viewMo1046 != null) {
            setContentView(viewMo1046);
            return;
        }
        int i = C0330o.f1000;
        C0330o.m1173(0, "打开模块设置失败，请联系开发者");
        dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Dialog
    public void show() {
        int i;
        View decorView;
        super.show();
        if (this.f1218 != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = this.f1217.getSystemService("window");
            C0237h4.m1088("null cannot be cast to non-null type android.view.WindowManager", systemService);
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = 1;
            if (this.f1889) {
                Window window = getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#66000000")));
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    Context context = this.f1217;
                    C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", context);
                    attributes.height = ((Activity) context).getWindow().getDecorView().getHeight();
                    attributes.width = displayMetrics.widthPixels;
                    window.getDecorView().setSystemUiVisibility(1280);
                    if (Build.VERSION.SDK_INT >= 28) {
                        attributes.layoutInDisplayCutoutMode = 1;
                    }
                    window.setAttributes(attributes);
                    View view = new View(this.f1217);
                    view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    view.setBackgroundColor(0);
                    view.setOnClickListener(new ViewOnClickListenerC0445wa(this, i2));
                    View decorView2 = window.getDecorView();
                    C0237h4.m1088("null cannot be cast to non-null type android.widget.FrameLayout", decorView2);
                    ((FrameLayout) decorView2).addView(view, 0);
                }
            } else {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
                }
            }
            Window window3 = getWindow();
            if (window3 != null && (decorView = window3.getDecorView()) != null) {
                decorView.setPadding(0, 0, 0, 0);
            }
            View view2 = this.f1218;
            C0237h4.m865(view2);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            C0237h4.m1088("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams", layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(0, 0, 0, 0);
            layoutParams2.gravity = 17;
            int i3 = this.f1890;
            if (i3 != 0 && (i = this.f1891) != 0) {
                layoutParams2.width = i3;
                layoutParams2.height = i;
            } else if (this.f1888) {
                layoutParams2.width = displayMetrics.widthPixels;
                Context context2 = this.f1217;
                C0237h4.m1088("null cannot be cast to non-null type android.app.Activity", context2);
                layoutParams2.height = ((Activity) context2).getWindow().getDecorView().getHeight();
            } else {
                float f = (((float) displayMetrics.heightPixels) * 1.0f) / ((float) displayMetrics.widthPixels) < 1.7f ? 50.0f : 18.0f;
                layoutParams2.setMargins((int) C0167c4.m1038(1, f), 0, (int) C0167c4.m1038(1, f), 0);
                layoutParams2.height = this.f1887 ? -2 : (int) (displayMetrics.heightPixels * 0.9f);
                if (this.f1889) {
                    int iM1038 = (int) C0167c4.m1038(1, 35.0f);
                    layoutParams2.setMargins(0, iM1038, 0, iM1038);
                }
                View view3 = this.f1218;
                C0237h4.m865(view3);
                int iApplyDimension = (int) TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics());
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setGradientType(0);
                gradientDrawable.setCornerRadius(iApplyDimension);
                gradientDrawable.setColor(-1);
                view3.setBackground(gradientDrawable);
            }
            View view4 = this.f1218;
            C0237h4.m865(view4);
            view4.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final TextView m969() {
        TextView textView = new TextView(this.f1217);
        textView.setGravity(16);
        textView.setBackgroundColor(-1);
        textView.setTextSize(f1880);
        textView.setTextColor(-7829368);
        int i = f1878;
        textView.setPadding(i, 0, i, 0);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return textView;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final TextView m970() {
        TextView textView = new TextView(this.f1217);
        textView.setText("返回");
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, (f1881 * 3) / 2));
        textView.setPadding(0, 0, f1878, 0);
        textView.setGravity(21);
        textView.setTextSize(f1879);
        textView.setTextColor(-7829368);
        textView.setOnClickListener(new ViewOnClickListenerC0445wa(this, 0));
        return textView;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final LinearLayout m1277() {
        LinearLayout linearLayout = new LinearLayout(this.f1217);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(-1);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final RelativeLayout m1278(String str) {
        "title";
        RelativeLayout relativeLayout = new RelativeLayout(this.f1217);
        int iM1249 = C0407tb.m1249(10.0f);
        int i = f1882;
        relativeLayout.setBackground(C0407tb.m944(iM1249, i));
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, C0407tb.m1249(55.0f)));
        TextView textViewM1279 = m1279(i);
        textViewM1279.setText(str);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C0407tb.m1249(55.0f));
        layoutParams.addRule(9);
        relativeLayout.addView(textViewM1279, layoutParams);
        TextView textViewM12792 = m1279(i);
        textViewM12792.setBackground(C0407tb.m1248(C0407tb.m1249(5.0f), -1));
        textViewM12792.setText("重启");
        textViewM12792.setTextSize(14.0f);
        textViewM12792.setVisibility(8);
        textViewM12792.setTypeface(Typeface.DEFAULT);
        textViewM12792.setOnClickListener(new ViewOnClickListenerC0458xa(0));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, C0407tb.m1249(30.0f));
        layoutParams2.setMargins(0, 0, C0407tb.m1249(45.0f), 0);
        layoutParams2.addRule(11);
        layoutParams2.addRule(15);
        relativeLayout.addView(textViewM12792, layoutParams2);
        TextView textViewM12793 = m1279(i);
        textViewM12793.setText("⋮");
        textViewM12793.setGravity(17);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(C0407tb.m1249(45.0f), C0407tb.m1249(55.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        relativeLayout.addView(textViewM12793, layoutParams3);
        textViewM12793.setOnClickListener(new ViewOnClickListenerC0358q1(2, textViewM12792));
        return relativeLayout;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final TextView m1279(int i) {
        TextView textView = new TextView(this.f1217);
        int i2 = f1878;
        textView.setPadding(i2, 0, i2, 0);
        textView.setTextColor(-16777216);
        textView.setBackground(C0407tb.m944(C0407tb.m1249(10.0f), i));
        textView.setTextSize(f1879 + 5);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(16);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, C0407tb.m1249(55.0f)));
        return textView;
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public final Context m1280() {
        return this.f1217;
    }

    /* JADX INFO: renamed from: ۥۣ۟ */
    public abstract View mo1046();

    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final void m1281(boolean z) {
        this.f1889 = z;
        show();
    }
}
