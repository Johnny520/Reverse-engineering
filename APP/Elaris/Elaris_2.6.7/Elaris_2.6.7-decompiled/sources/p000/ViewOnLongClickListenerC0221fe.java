package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Typeface;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.AbstractC0169w;
import java.util.Locale;

/* JADX INFO: renamed from: fe */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLongClickListenerC0221fe implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f277a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ClassLoader f278b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0410pd f279c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Dialog f280d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TextView f281e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LinearLayout f282f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0515w6[] f283g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int[] f284h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0347n9 f285i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnLongClickListenerC0221fe(Activity activity, ClassLoader classLoader, C0410pd c0410pd, Dialog dialog, TextView textView, LinearLayout linearLayout, C0515w6[] c0515w6Arr, int[] iArr, C0347n9 c0347n9) {
        this.f277a = activity;
        this.f278b = classLoader;
        this.f279c = c0410pd;
        this.f280d = dialog;
        this.f281e = textView;
        this.f282f = linearLayout;
        this.f283g = c0515w6Arr;
        this.f284h = iArr;
        this.f285i = c0347n9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    @Override // android.view.View.OnLongClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onLongClick(View view) {
        int length;
        Activity activity = this.f277a;
        if (activity != null) {
            C0347n9 c0347n9 = this.f285i;
            if (c0347n9.m768a()) {
                String str = c0347n9.f594c;
                String strM328w = AbstractC0169w.m328w(str);
                EditText editText = new EditText(activity);
                editText.setSingleLine(true);
                editText.setInputType(524289);
                editText.setText(str);
                editText.setSelectAllOnFocus(false);
                if (strM328w.length() > 0) {
                    Locale locale = Locale.US;
                    length = str.toLowerCase(locale).endsWith(strM328w.toLowerCase(locale)) ? str.length() - strM328w.length() : str.length();
                }
                try {
                    editText.setSelection(0, Math.max(0, length));
                } catch (Throwable unused) {
                }
                Dialog dialog = new Dialog(activity);
                AbstractC0486u9.m1051d(dialog);
                try {
                    dialog.requestWindowFeature(1);
                } catch (Throwable unused2) {
                }
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(1);
                linearLayout.setPadding(AbstractC0169w.m322t(activity, 14.0f), AbstractC0169w.m322t(activity, 14.0f), AbstractC0169w.m322t(activity, 14.0f), AbstractC0169w.m322t(activity, 12.0f));
                linearLayout.setBackground(AbstractC0169w.m307l0(activity));
                TextView textView = new TextView(activity);
                textView.setText("重命名");
                textView.setTextColor(AbstractC0486u9.m1045G(activity));
                textView.setTextSize(17.0f);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setSingleLine(true);
                textView.setGravity(16);
                linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
                int iM322t = AbstractC0169w.m322t(activity, 12.0f);
                editText.setTextColor(AbstractC0486u9.m1045G(activity));
                editText.setTextSize(14.0f);
                editText.setPadding(iM322t, 0, iM322t, 0);
                editText.setBackground(AbstractC0169w.m309m0(AbstractC0486u9.m1072y(activity), AbstractC0169w.m322t(activity, 12.0f), AbstractC0486u9.m1062o(activity) ? -11775650 : -1512206, AbstractC0169w.m322t(activity, 1.0f)));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0169w.m322t(activity, 38.0f));
                layoutParams.topMargin = AbstractC0169w.m322t(activity, 12.0f);
                linearLayout.addView(editText, layoutParams);
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(17);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, AbstractC0169w.m322t(activity, 34.0f));
                layoutParams2.topMargin = AbstractC0169w.m322t(activity, 12.0f);
                TextView textViewM303j0 = AbstractC0169w.m303j0(activity, "保存");
                TextView textViewM303j02 = AbstractC0169w.m303j0(activity, "取消");
                linearLayout2.addView(textViewM303j0, new LinearLayout.LayoutParams(0, -1, 1.0f));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1, 1.0f);
                layoutParams3.leftMargin = AbstractC0169w.m322t(activity, 8.0f);
                linearLayout2.addView(textViewM303j02, layoutParams3);
                linearLayout.addView(linearLayout2, layoutParams2);
                textViewM303j02.setOnClickListener(new ViewOnClickListenerC0280j6(dialog, 3));
                textViewM303j0.setOnClickListener(new ViewOnClickListenerC0253he(str, editText, activity, c0347n9, dialog, this.f278b, this.f279c, this.f280d, this.f281e, this.f282f, this.f283g, this.f284h));
                dialog.setContentView(linearLayout);
                dialog.show();
                try {
                    Window window = dialog.getWindow();
                    if (window == null) {
                        return true;
                    }
                    window.setBackgroundDrawableResource(R.color.transparent);
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    attributes.width = Math.max(AbstractC0169w.m322t(activity, 240.0f), Math.min(activity.getResources().getDisplayMetrics().widthPixels - AbstractC0169w.m322t(activity, 90.0f), AbstractC0169w.m322t(activity, 380.0f)));
                    attributes.height = -2;
                    attributes.dimAmount = 0.4f;
                    window.setAttributes(attributes);
                    return true;
                } catch (Throwable unused3) {
                    return true;
                }
            }
        }
        return true;
    }
}
