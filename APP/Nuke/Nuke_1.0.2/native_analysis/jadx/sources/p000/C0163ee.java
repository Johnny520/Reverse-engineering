package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: ee */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0163ee extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final C0163ee f2406d = new C0163ee(false);

    /* JADX INFO: renamed from: e */
    public static final int f2407e = R.string.anti_revoke;

    /* JADX INFO: renamed from: f */
    public static final int f2408f = R.string.anti_revoke_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f2409g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f2410h = "AntiRevoke";

    /* JADX INFO: renamed from: i */
    public static final boolean f2411i = true;

    /* JADX INFO: renamed from: j */
    public static final o72 f2412j = new o72("([\\\"「])(.*?)([」\\\"])");

    static {
        Pattern.compile("^wxid_[^:]+:\\n(.*)$", 32).getClass();
    }

    /* JADX INFO: renamed from: q */
    public static String m1341q(C0127de c0127de, String str, yi1 yi1Var, long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(c0127de.f2004b, Locale.getDefault());
        simpleDateFormat.setLenient(false);
        String strM6010b0 = wv2.m6010b0(c0127de.f2003a, "$sender", str);
        String str2 = simpleDateFormat.format(new Date(yi1Var.f13476i));
        str2.getClass();
        String strM6010b02 = wv2.m6010b0(strM6010b0, "$sendTime", str2);
        String str3 = simpleDateFormat.format(new Date(j));
        str3.getClass();
        return wv2.m6010b0(wv2.m6010b0(strM6010b02, "$recallTime", str3), "$content", yi1Var.f13475h);
    }

    /* JADX INFO: renamed from: r */
    public static C0127de m1342r(Context context) {
        Object x92Var;
        String string;
        Context context2;
        if (context == null || (string = context.getString(R.string.anti_revoke_default_pattern)) == null) {
            try {
                context2 = up0.f11401i;
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            if (context2 == null) {
                t11.m5067S("hostContext");
                throw null;
            }
            x92Var = context2.getString(R.string.anti_revoke_default_pattern);
            if (x92Var instanceof x92) {
                x92Var = "\"$sender\"尝试撤回一条消息";
            }
            string = (String) x92Var;
        }
        C0127de c0127de = new C0127de(string, "yyyy/MM/dd HH:mm:ss");
        pp1 pp1Var = pp1.f8445a;
        C0127de c0127de2 = (C0127de) pp1.m3931c().m3605b(AbstractC0691se.m4815D(C0127de.Companion.serializer()), c0127de, "AntiRevoke/config");
        return c0127de2 == null ? c0127de : c0127de2;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f2410h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: h */
    public final void mo319h(vb1 vb1Var) {
        m1342r(null);
        vb1Var.m5664a(nd3.f7114e, new C0151e2(1, this, C0163ee.class, "handleXmlParse", "handleXmlParse(Lnuke/module/wechat/listener/WeXmlParseListener$Event;)V", 0, 0, 1));
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: j */
    public final String mo321j(Context context) {
        context.getClass();
        return m1342r(context).f2004b;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f2408f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: l */
    public final boolean mo322l() {
        return f2411i;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f2407e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f2409g;
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
        activity.runOnUiThread(new RunnableC0724t7(4, activity, new C0402kw(286471947, true, new C0866x(2, m1342r(activity), xm0Var))));
    }
}
