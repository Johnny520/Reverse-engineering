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
    public static final int f1882 = Color.parseColor(C0341oa.m915(new byte[]{-39, -70, -70, -9, -40, -112, -65}, new byte[]{-6, -4, -125, -78, -22, -89}));

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
        Color.parseColor(C0341oa.m915(new byte[]{3, 106, -57, -95, -59, -71, 101}, new byte[]{32, 47, -126, -28, -128, -4}));
        f1883 = Color.argb(255, 255, 248, 196);
        f1884 = Color.argb(255, 245, 123, 0);
        f1885 = C0407tb.m1249(10.0f);
        f1886 = C0407tb.m1249(5.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractAlertDialogC0471ya(Context context, int i) {
        super(context, i);
        C0237h4.m1090(C0341oa.m915(new byte[]{-5, 125, -105}, new byte[]{-104, 5, -29, -26, 115, 39}), context);
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
        C0330o.m1173(0, C0341oa.m915(new byte[]{-36, -117, -96, 103, -117, 6, -36, -86, -110, 103, -86, 17, -46, -84, -115, 101, -118, 40, -33, -90, -126, 106, -125, 35, -43, -66, -65, 106, -104, 49, -46, -125, -89, 101, -124, 61, -33, -66, -77, 103, -72, 23, -46, -126, -74}, new byte[]{58, 2, 51, -126, 55, -122}));
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
            Object systemService = this.f1217.getSystemService(C0341oa.m915(new byte[]{-24, -15, 17, -102, -33, 43}, new byte[]{-97, -104, 127, -2, -80, 92}));
            C0237h4.m1088(C0341oa.m915(new byte[]{62, 5, -94, 105, 89, -96, 49, 30, -96, 106, 13, -29, 50, 21, -18, 102, 24, -80, 36, 80, -70, 106, 89, -83, 63, 30, -29, 107, 12, -81, 60, 80, -70, 124, 9, -90, 112, 17, -96, 97, 11, -84, 57, 20, -32, 115, 16, -90, 39, 94, -103, 108, 23, -89, 63, 7, -125, 100, 23, -94, 55, 21, -68}, new byte[]{80, 112, -50, 5, 121, -61}), systemService);
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            int i2 = 1;
            if (this.f1889) {
                Window window = getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(Color.parseColor(C0341oa.m915(new byte[]{2, 16, -65, -27, 49, 118, 17, 22, -71}, new byte[]{33, 38, -119, -43, 1, 70}))));
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    Context context = this.f1217;
                    C0237h4.m1088(C0341oa.m915(new byte[]{-3, 66, 78, 31, -72, -8, -14, 89, 76, 28, -20, -69, -15, 82, 2, 16, -7, -24, -25, 23, 86, 28, -72, -11, -4, 89, 15, 29, -19, -9, -1, 23, 86, 10, -24, -2, -77, 86, 76, 23, -22, -12, -6, 83, 12, 18, -24, -21, -67, 118, 65, 7, -15, -19, -6, 67, 91}, new byte[]{-109, 55, 34, 115, -104, -101}), context);
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
                    C0237h4.m1088(C0341oa.m915(new byte[]{64, -1, -122, 71, -57, -118, 79, -28, -124, 68, -109, -55, 76, -17, -54, 72, -122, -102, 90, -86, -98, 68, -57, -121, 65, -28, -57, 69, -110, -123, 66, -86, -98, 82, -105, -116, 14, -21, -124, 79, -107, -122, 71, -18, -60, 92, -114, -115, 73, -17, -98, 5, -95, -101, 79, -25, -113, 103, -122, -112, 65, -1, -98}, new byte[]{46, -118, -22, 43, -25, -23}), decorView2);
                    ((FrameLayout) decorView2).addView(view, 0);
                }
            } else {
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(Color.parseColor(C0341oa.m915(new byte[]{-69, -55, 10, 31, -46, 4, -88, -55, 10}, new byte[]{-104, -7, 58, 47, -30, 52}))));
                }
            }
            Window window3 = getWindow();
            if (window3 != null && (decorView = window3.getDecorView()) != null) {
                decorView.setPadding(0, 0, 0, 0);
            }
            View view2 = this.f1218;
            C0237h4.m865(view2);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            C0237h4.m1088(C0341oa.m915(new byte[]{105, -16, -108, -116, 21, 67, 102, -21, -106, -113, 65, 0, 101, -32, -40, -125, 84, 83, 115, -91, -116, -113, 21, 78, 104, -21, -43, -114, 64, 76, 107, -91, -116, -103, 69, 69, 39, -28, -106, -124, 71, 79, 110, -31, -42, -105, 92, 68, 96, -32, -116, -50, 115, 82, 102, -24, -99, -84, 84, 89, 104, -16, -116, -50, 121, 65, 126, -22, -115, -108, 101, 65, 117, -28, -107, -109}, new byte[]{7, -123, -8, -32, 53, 32}), layoutParams);
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
                C0237h4.m1088(C0341oa.m915(new byte[]{-96, -63, -126, -107, -54, 108, -81, -38, -128, -106, -98, 47, -84, -47, -50, -102, -117, 124, -70, -108, -102, -106, -54, 97, -95, -38, -61, -105, -97, 99, -94, -108, -102, -128, -102, 106, -18, -43, -128, -99, -104, 96, -89, -48, -64, -104, -102, 127, -32, -11, -115, -115, -125, 121, -89, -64, -105}, new byte[]{-50, -76, -18, -7, -22, 15}), context2);
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
        textView.setText(C0341oa.m915(new byte[]{-64, -103, -42, 74, -13, -113}, new byte[]{40, 38, 66, -81, 104, 17}));
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
        C0341oa.m915(new byte[]{2, -31, 53, 22, -64}, new byte[]{118, -120, 65, 122, -91, 77});
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
        textViewM12792.setText(C0341oa.m915(new byte[]{41, 37, -76, -102, 94, -105}, new byte[]{-64, -94, 57, 127, -50, 56}));
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
        textViewM12793.setText(C0341oa.m915(new byte[]{-49, -111, -89}, new byte[]{45, 26, 9, 121, 111, -115}));
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
