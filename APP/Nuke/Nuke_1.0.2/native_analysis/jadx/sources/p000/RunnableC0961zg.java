package p000;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

/* JADX INFO: renamed from: zg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0961zg implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13885h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13886i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f13887j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f13888k;

    public /* synthetic */ RunnableC0961zg(p70 p70Var, int i, Object obj) {
        this.f13885h = 2;
        this.f13886i = p70Var;
        this.f13888k = i;
        this.f13887j = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13885h;
        int i2 = 1;
        Object obj = this.f13887j;
        int i3 = this.f13888k;
        Object obj2 = this.f13886i;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                Button button = (Button) obj;
                String str = C0277hh.f4008h;
                C0277hh c0277hh = C0277hh.f4004d;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    if (button.isShown() && button.isEnabled() && button.performClick()) {
                        c0277hh.getClass();
                        hg3.m2168f(str, "Red packet open button performClick succeeded");
                    } else if (i3 > 1) {
                        button.postDelayed(new RunnableC0961zg(activity, button, i3, i2), 80L);
                    } else {
                        Intent intent = activity.getIntent();
                        if (intent != null) {
                            intent.removeExtra("Nuke.AutoReceiveRedPacket.ClickReceiveScheduled");
                        }
                        c0277hh.getClass();
                        hg3.m2166d(str, "Red packet open button was not clickable");
                    }
                    break;
                }
                break;
            case 1:
                Button button2 = (Button) obj;
                C0277hh.f4004d.getClass();
                button2.post(new RunnableC0961zg((Activity) obj2, button2, i3 - 1, 0));
                break;
            default:
                ((p70) obj2).f8004a.m2180C(i3, obj);
                break;
        }
    }

    public /* synthetic */ RunnableC0961zg(Activity activity, Button button, int i, int i2) {
        this.f13885h = i2;
        this.f13886i = activity;
        this.f13887j = button;
        this.f13888k = i;
    }
}
