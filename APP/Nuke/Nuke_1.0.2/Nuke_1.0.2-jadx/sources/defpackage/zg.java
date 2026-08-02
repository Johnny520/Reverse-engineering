package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zg(p70 p70Var, int i, Object obj) {
        this.h = 2;
        this.i = p70Var;
        this.k = i;
        this.j = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.h;
        int i2 = 1;
        Object obj = this.j;
        int i3 = this.k;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                Button button = (Button) obj;
                String str = hh.h;
                hh hhVar = hh.d;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    if (button.isShown() && button.isEnabled() && button.performClick()) {
                        hhVar.getClass();
                        hg3.f(str, "Red packet open button performClick succeeded");
                    } else if (i3 > 1) {
                        button.postDelayed(new zg(activity, button, i3, i2), 80L);
                    } else {
                        Intent intent = activity.getIntent();
                        if (intent != null) {
                            intent.removeExtra("Nuke.AutoReceiveRedPacket.ClickReceiveScheduled");
                        }
                        hhVar.getClass();
                        hg3.d(str, "Red packet open button was not clickable");
                    }
                    break;
                }
                break;
            case 1:
                Button button2 = (Button) obj;
                hh.d.getClass();
                button2.post(new zg((Activity) obj2, button2, i3 - 1, 0));
                break;
            default:
                ((p70) obj2).a.C(i3, obj);
                break;
        }
    }

    public /* synthetic */ zg(Activity activity, Button button, int i, int i2) {
        this.h = i2;
        this.i = activity;
        this.j = button;
        this.k = i;
    }
}
