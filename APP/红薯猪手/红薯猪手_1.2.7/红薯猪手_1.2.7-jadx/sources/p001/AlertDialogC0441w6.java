package p001;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: renamed from: ۟.w6 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0441w6 extends AbstractAlertDialogC0230gb {

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public final CharSequence f1838;

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public TextView f1839;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0441w6(Context context, String str, CharSequence charSequence) {
        super(context, str);
        C0237h4.m1090(C0341oa.m915(new byte[]{-92, -16, 75}, new byte[]{-57, -120, 63, -35, -22, -21}), context);
        C0341oa.m915(new byte[]{-122, -12, -123, -102, 7}, new byte[]{-14, -99, -15, -10, 98, -52});
        C0341oa.m915(new byte[]{42, 0, -26, 55}, new byte[]{73, 111, -120, 67, -27, 117});
        this.f1838 = charSequence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0230gb
    /* JADX INFO: renamed from: ۥ۟ۦ */
    public final List<View> mo1003() {
        TextView textView = new TextView(this.f1217);
        textView.setTextSize(16.0f);
        textView.setTextColor(-12303292);
        textView.setText(this.f1838);
        textView.setLineSpacing(0.0f, 1.1f);
        int i = AbstractAlertDialogC0471ya.f1878;
        textView.setPadding(i, 0, i, i);
        int i2 = C0330o.f1000;
        C0330o.m1172(textView);
        C0341oa.m915(new byte[]{-60, 51, -68, 57, -26, 22, -58}, new byte[]{-8, 64, -39, 77, -53, 41});
        this.f1839 = textView;
        ScrollView scrollView = new ScrollView(this.f1217);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.weight = 1.0f;
        scrollView.setLayoutParams(layoutParams);
        LinearLayout linearLayout = new LinearLayout(this.f1217);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOrientation(1);
        TextView textView2 = this.f1839;
        if (textView2 == null) {
            C0237h4.m1092(C0341oa.m915(new byte[]{-52, 41, -51, 68, 8, 27, -56, 24, -33}, new byte[]{-95, 125, -88, 60, 124, 77}));
            throw null;
        }
        linearLayout.addView(textView2);
        scrollView.addView(linearLayout);
        return C0272jb.m874(scrollView);
    }
}
