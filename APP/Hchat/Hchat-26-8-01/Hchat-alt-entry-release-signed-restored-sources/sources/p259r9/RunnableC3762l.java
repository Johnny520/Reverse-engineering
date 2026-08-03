package p259r9;

import android.widget.TextView;
import gg.AbstractC1416l;

/* JADX INFO: renamed from: r9.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3762l implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12296g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ TextView f12297h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3752d0 f12298i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC3762l(TextView textView, C3752d0 c3752d0, int i9) {
        this.f12296g = i9;
        this.f12297h = textView;
        this.f12298i = c3752d0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12296g) {
            case 0:
                TextView textView = this.f12297h;
                if (textView.getParent() != null && AbstractC1416l.m3825a(textView.getTag(), "hchat_message_details_view")) {
                    this.f12298i.m7837e(textView);
                    textView.invalidate();
                    break;
                }
                break;
            default:
                TextView textView2 = this.f12297h;
                if (textView2.getParent() != null && AbstractC1416l.m3825a(textView2.getTag(), "hchat_message_details_view")) {
                    this.f12298i.m7837e(textView2);
                    textView2.invalidate();
                    break;
                }
                break;
        }
    }
}
