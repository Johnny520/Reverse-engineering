package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class di1 extends gx2 {
    public static final di1 d = new di1(false);
    public static final int e = R.string.modify_friends_count;
    public static final int f = R.string.modify_friends_count_desc;
    public static final wm0 g = wm0.j;
    public static final String h = "ModifyFriendsCount";
    public static final boolean i = true;
    public static final o72 j = new o72("\\d+(?=个朋友)");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ci1 q() {
        pp1 pp1Var = pp1.a;
        ci1 ci1Var = (ci1) pp1.c().b(se.D(ci1.Companion.serializer()), new ci1(), "ModifyFriendsCount/config");
        return ci1Var == null ? new ci1() : ci1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        Class cls;
        sg1 sg1VarV = op0.y(d72.a(TextView.class)).v();
        sg1VarV.b = "setText";
        cls = CharSequence.class;
        Class<CharSequence> clsA = p40.A(d72.a(cls));
        sg1VarV.d(clsA != null ? clsA : CharSequence.class);
        Method method = ((zg1) du.o0(sg1VarV.c())).j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, new nx0(29), null)).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void h(vb1 vb1Var) {
        q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final String j(Context context) {
        context.getClass();
        int i2 = q().a;
        if (i2 == -1) {
            String string = context.getString(R.string.modify_friends_count_summary_hidden);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.modify_friends_count_summary, Integer.valueOf(i2));
        string2.getClass();
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final Integer k() {
        return Integer.valueOf(f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final boolean l() {
        return i;
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
    public final void p(View view, xm0 xm0Var) {
        Activity activity;
        view.getClass();
        xm0Var.getClass();
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
        activity.runOnUiThread(new t7(4, activity, new kw(1732080831, true, new x(9, q(), xm0Var))));
    }
}
