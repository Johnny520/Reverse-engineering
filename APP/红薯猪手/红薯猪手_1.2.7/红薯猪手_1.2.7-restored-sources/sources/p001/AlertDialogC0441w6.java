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
        C0237h4.m1090("cxt", context);
        "title";
        "cont";
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
        "<set-?>";
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
            C0237h4.m1092("mTextView");
            throw null;
        }
        linearLayout.addView(textView2);
        scrollView.addView(linearLayout);
        return C0272jb.m874(scrollView);
    }
}
