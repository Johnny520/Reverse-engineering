package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ee extends gx2 {
    public static final ee d = new ee(false);
    public static final int e = R.string.anti_revoke;
    public static final int f = R.string.anti_revoke_description;
    public static final wm0 g = wm0.i;
    public static final String h = "AntiRevoke";
    public static final boolean i = true;
    public static final o72 j = new o72("([\\\"「])(.*?)([」\\\"])");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Pattern.compile("^wxid_[^:]+:\\n(.*)$", 32).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String q(de deVar, String str, yi1 yi1Var, long j2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(deVar.b, Locale.getDefault());
        simpleDateFormat.setLenient(false);
        String strB0 = wv2.b0(deVar.a, "$sender", str);
        String str2 = simpleDateFormat.format(new Date(yi1Var.i));
        str2.getClass();
        String strB02 = wv2.b0(strB0, "$sendTime", str2);
        String str3 = simpleDateFormat.format(new Date(j2));
        str3.getClass();
        return wv2.b0(wv2.b0(strB02, "$recallTime", str3), "$content", yi1Var.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static de r(Context context) {
        Object x92Var;
        String string;
        Context context2;
        if (context == null || (string = context.getString(R.string.anti_revoke_default_pattern)) == null) {
            try {
                context2 = up0.i;
            } catch (Throwable th) {
                x92Var = new x92(th);
            }
            if (context2 == null) {
                t11.S("hostContext");
                throw null;
            }
            x92Var = context2.getString(R.string.anti_revoke_default_pattern);
            if (x92Var instanceof x92) {
                x92Var = "\"$sender\"尝试撤回一条消息";
            }
            string = (String) x92Var;
        }
        de deVar = new de(string, "yyyy/MM/dd HH:mm:ss");
        pp1 pp1Var = pp1.a;
        de deVar2 = (de) pp1.c().b(se.D(de.Companion.serializer()), deVar, "AntiRevoke/config");
        return deVar2 == null ? deVar : deVar2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void h(vb1 vb1Var) {
        r(null);
        vb1Var.a(nd3.e, new e2(1, this, ee.class, "handleXmlParse", "handleXmlParse(Lnuke/module/wechat/listener/WeXmlParseListener$Event;)V", 0, 0, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final String j(Context context) {
        context.getClass();
        return r(context).b;
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
        activity.runOnUiThread(new t7(4, activity, new kw(286471947, true, new x(2, r(activity), xm0Var))));
    }
}
