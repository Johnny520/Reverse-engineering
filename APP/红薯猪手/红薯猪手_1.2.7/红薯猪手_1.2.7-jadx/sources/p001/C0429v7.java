package p001;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: ۟.v7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0429v7 extends AbstractC0335o4 implements InterfaceC0208f3<TextView> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ Context f1154;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ AlertDialogC0403t7 f1155;

    public C0429v7(Activity activity, AlertDialogC0403t7 alertDialogC0403t7) {
        this.f1154 = activity;
        this.f1155 = alertDialogC0403t7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0208f3
    /* JADX INFO: renamed from: ۥ */
    public final TextView mo7() {
        TextView textView = new TextView(this.f1154);
        AlertDialogC0403t7 alertDialogC0403t7 = this.f1155;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        layoutParams.setMargins(0, (int) C0167c4.m1038(1, 50.0f), 0, 0);
        textView.setLayoutParams(layoutParams);
        textView.setTextSize(15.0f);
        textView.setTextColor(Color.parseColor(C0341oa.m915(new byte[]{66, 116, -63, -23, -93, -116, 36, 119, -62}, new byte[]{97, 50, -121, -84, -26, -55})));
        textView.setGravity(17);
        if (alertDialogC0403t7.f1817.size() > 1) {
            textView.setText((alertDialogC0403t7.f1818 + 1) + "/" + alertDialogC0403t7.f1817.size());
        }
        return textView;
    }
}
