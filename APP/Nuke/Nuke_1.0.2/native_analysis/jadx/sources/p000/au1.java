package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class au1 extends AbstractC0255gw {

    /* JADX INFO: renamed from: d */
    public static final au1 f395d = new au1(false);

    /* JADX INFO: renamed from: e */
    public static final int f396e = R.string.open_user_card;

    /* JADX INFO: renamed from: f */
    public static final int f397f = R.string.open_user_card_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f398g = wm0.f12576j;

    /* JADX INFO: renamed from: h */
    public static final String f399h = "OpenUserCard";

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f399h;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f397f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f396e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f398g;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: o */
    public final void mo280o(View view) {
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
        activity.runOnUiThread(new RunnableC0724t7(4, activity, new C0402kw(-8933108, true, new wt0(6, activity))));
    }
}
