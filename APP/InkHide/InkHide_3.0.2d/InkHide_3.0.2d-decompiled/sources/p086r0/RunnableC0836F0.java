package p086r0;

import android.app.Activity;
import android.view.Window;
import java.util.List;

/* JADX INFO: renamed from: r0.F0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0836F0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2798a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0842H0 f2799b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f2800c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0836F0(C0842H0 c0842h0, Activity activity, int i2) {
        this.f2798a = i2;
        this.f2799b = c0842h0;
        this.f2800c = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.f2800c;
        C0842H0 c0842h0 = this.f2799b;
        switch (this.f2798a) {
            case 0:
                List list = C0842H0.f2813g0;
                if (c0842h0.m1660A1(activity)) {
                    Window window = activity.getWindow();
                    c0842h0.m1691n0(window != null ? window.getDecorView() : null);
                }
                break;
            default:
                List list2 = C0842H0.f2813g0;
                if (c0842h0.m1660A1(activity)) {
                    Window window2 = activity.getWindow();
                    c0842h0.m1691n0(window2 != null ? window2.getDecorView() : null);
                }
                break;
        }
    }
}
