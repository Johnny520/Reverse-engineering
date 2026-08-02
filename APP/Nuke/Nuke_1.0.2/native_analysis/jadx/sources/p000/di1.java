package p000;

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

    /* JADX INFO: renamed from: d */
    public static final di1 f2063d = new di1(false);

    /* JADX INFO: renamed from: e */
    public static final int f2064e = R.string.modify_friends_count;

    /* JADX INFO: renamed from: f */
    public static final int f2065f = R.string.modify_friends_count_desc;

    /* JADX INFO: renamed from: g */
    public static final wm0 f2066g = wm0.f12576j;

    /* JADX INFO: renamed from: h */
    public static final String f2067h = "ModifyFriendsCount";

    /* JADX INFO: renamed from: i */
    public static final boolean f2068i = true;

    /* JADX INFO: renamed from: j */
    public static final o72 f2069j = new o72("\\d+(?=个朋友)");

    /* JADX INFO: renamed from: q */
    public static ci1 m1029q() {
        pp1 pp1Var = pp1.f8445a;
        ci1 ci1Var = (ci1) pp1.m3931c().m3605b(AbstractC0691se.m4815D(ci1.Companion.serializer()), new ci1(), "ModifyFriendsCount/config");
        return ci1Var == null ? new ci1() : ci1Var;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f2067h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        Class cls;
        sg1 sg1VarM3244v = op0.m3602y(d72.m967a(TextView.class)).m3244v();
        sg1VarM3244v.f13871b = "setText";
        cls = CharSequence.class;
        Class<CharSequence> clsM3691A = p40.m3691A(d72.m967a(cls));
        sg1VarM3244v.m4864d(clsM3691A != null ? clsM3691A : CharSequence.class);
        Method method = ((zg1) AbstractC0142du.m1159o0(sg1VarM3244v.m4863c())).f13895j;
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, new nx0(29), null)).getClass();
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: h */
    public final void mo319h(vb1 vb1Var) {
        m1029q();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: j */
    public final String mo321j(Context context) {
        context.getClass();
        int i = m1029q().f1571a;
        if (i == -1) {
            String string = context.getString(R.string.modify_friends_count_summary_hidden);
            string.getClass();
            return string;
        }
        String string2 = context.getString(R.string.modify_friends_count_summary, Integer.valueOf(i));
        string2.getClass();
        return string2;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f2065f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: l */
    public final boolean mo322l() {
        return f2068i;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f2064e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f2066g;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: p */
    public final void mo323p(View view, xm0 xm0Var) {
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
        activity.runOnUiThread(new RunnableC0724t7(4, activity, new C0402kw(1732080831, true, new C0866x(9, m1029q(), xm0Var))));
    }
}
