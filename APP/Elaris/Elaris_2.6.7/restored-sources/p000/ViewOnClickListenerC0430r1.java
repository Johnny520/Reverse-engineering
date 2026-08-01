package p000;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: renamed from: r1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0430r1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f779a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Dialog f780b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0193e2 f781c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0307l1 f782d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ViewOnClickListenerC0430r1(Dialog dialog, C0193e2 c0193e2, C0307l1 c0307l1, int i) {
        this.f779a = i;
        this.f780b = dialog;
        this.f781c = c0193e2;
        this.f782d = c0307l1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        int i = this.f779a;
        C0307l1 c0307l1 = this.f782d;
        C0193e2 c0193e2 = this.f781c;
        Dialog dialog = this.f780b;
        int i2 = 0;
        switch (i) {
            case 0:
                dialog.dismiss();
                AbstractC0225g2.f293c.execute(new RunnableC0446s1(c0193e2, c0307l1, 0));
                break;
            case 1:
                dialog.dismiss();
                AbstractC0225g2.m429o(c0193e2, c0307l1);
                break;
            default:
                dialog.dismiss();
                Activity activity = c0193e2.f215b;
                String str2 = c0307l1.f508b;
                if (str2.isEmpty()) {
                    str = "确定举报这个表情吗？";
                } else {
                    str = "确定举报“" + str2 + "”吗？";
                }
                C0540y c0540yM416b = AbstractC0225g2.m416b(activity, "举报表情", str);
                Dialog dialog2 = (Dialog) c0540yM416b.f1082b;
                LinearLayout linearLayout = (LinearLayout) c0540yM416b.f1081a;
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setGravity(16);
                TextView textViewM420f = AbstractC0225g2.m420f(activity, "取消");
                TextView textViewM420f2 = AbstractC0225g2.m420f(activity, "举报");
                linearLayout2.addView(textViewM420f, new LinearLayout.LayoutParams(0, AbstractC0225g2.m421g(activity, 42.0f), 1.0f));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, AbstractC0225g2.m421g(activity, 42.0f), 1.0f);
                layoutParams.leftMargin = AbstractC0225g2.m421g(activity, 10.0f);
                linearLayout2.addView(textViewM420f2, layoutParams);
                linearLayout.addView(linearLayout2, AbstractC0225g2.m417c(activity));
                textViewM420f.setOnClickListener(new ViewOnClickListenerC0414q1(dialog2, 0));
                textViewM420f2.setOnClickListener(new ViewOnClickListenerC0430r1(dialog2, c0193e2, c0307l1, i2));
                AbstractC0225g2.m430p(dialog2, activity);
                break;
        }
    }
}
