package p001;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

/* JADX INFO: renamed from: ۟.z4 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0478z4 extends AbstractAlertDialogC0471ya {

    /* JADX INFO: renamed from: ۥ۠ۤ, reason: contains not printable characters */
    public final C0286kb f1904;

    /* JADX INFO: renamed from: ۥ۠ۥ, reason: contains not printable characters */
    public final C0286kb f1905;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0478z4(Activity activity) {
        super(activity, 0);
        String strM915 = "正在下载...";
        "context";
        "defText";
        this.f1904 = new C0286kb(new C0465y4(activity, strM915));
        this.f1905 = new C0286kb(new C0452x4(activity));
    }

    @Override // p001.AbstractAlertDialogC0471ya, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    @Override // p001.AbstractAlertDialogC0471ya, android.app.Dialog
    public final void show() {
        super.show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0471ya
    /* JADX INFO: renamed from: ۥۣ۟ */
    public final View mo1046() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        int iApplyDimension = (int) TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setCornerRadius(iApplyDimension);
        gradientDrawable.setColor(-1);
        linearLayout.setBackground(gradientDrawable);
        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 10.0f, Resources.getSystem().getDisplayMetrics());
        linearLayout.setPadding(iApplyDimension2, iApplyDimension2, iApplyDimension2, iApplyDimension2);
        linearLayout.addView((ProgressBar) this.f1905.m886());
        linearLayout.addView((TextView) this.f1904.m886());
        return linearLayout;
    }
}
