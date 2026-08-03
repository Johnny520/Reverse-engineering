package p001;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.TextView;

/* JADX INFO: renamed from: ۟.y4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0465y4 extends AbstractC0335o4 implements InterfaceC0208f3<TextView> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ Context f1209;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ String f1210;

    public C0465y4(Activity activity, String str) {
        this.f1209 = activity;
        this.f1210 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0208f3
    /* JADX INFO: renamed from: ۥ */
    public final TextView mo7() {
        TextView textView = new TextView(this.f1209);
        String str = this.f1210;
        textView.setTextSize(13.0f);
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextColor(-12303292);
        textView.setPadding(0, (int) TypedValue.applyDimension(1, 15.0f, Resources.getSystem().getDisplayMetrics()), 0, 0);
        return textView;
    }
}
