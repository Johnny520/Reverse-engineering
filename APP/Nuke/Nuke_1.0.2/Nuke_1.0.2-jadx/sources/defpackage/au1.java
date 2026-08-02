package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class au1 extends gw {
    public static final au1 d = new au1(false);
    public static final int e = R.string.open_user_card;
    public static final int f = R.string.open_user_card_description;
    public static final wm0 g = wm0.j;
    public static final String h = "OpenUserCard";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final int m() {
        return e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final wm0 n() {
        return g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final void o(View view) {
        Activity activity;
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
                context.getClass();
            }
        }
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new t7(4, activity, new kw(-8933108, true, new wt0(6, activity))));
    }
}
