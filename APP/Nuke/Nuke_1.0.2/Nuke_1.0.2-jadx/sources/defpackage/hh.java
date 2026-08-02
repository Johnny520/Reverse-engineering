package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hh extends gx2 {
    public static final hh d = new hh(false);
    public static final int e = R.string.auto_receive_redpacket;
    public static final int f = R.string.auto_receive_redpacket_description;
    public static final wm0 g = wm0.i;
    public static final String h = "AutoReceiveRedPacket";
    public static final boolean i = true;
    public static final ConcurrentHashMap j = new ConcurrentHashMap();
    public static final Set k = mg.u0(new Integer[]{436207665, 469762097});
    public static final Set l = mg.u0(new Integer[]{0, 1});
    public static final int[] m = {10, 109, 10, 10, 76, 97, 117, 110, 99, 104, 101, 114, 85, 73, 18, 36, 48, 54, 99, 48, 55, 49, 101, 56, 45, 55, 52, 50, 98, 45, 52, 48, 97, 99, 45, 97, 100, 54, 48, 45, 57, 57, 101, 51, 102, 55, 100, 98, 99, 50, 55, 49, 24, -57, -89, -128, -79, -41, 50, 32, 0, 40, 1, 50, 46, 8, 9, 18, 42, 10, 20, 49, 49, 53, 56, 51, 50, 56, 48, 50, 54, 57, 52, 51, 53, 57, 56, 49, 56, 52, 54, 40, 0, 48, 0, 56, 0, 64, 0, 72, 0, 80, 0, 96, 0, 104, 0, 112, 0, 120, 0};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object q(gh ghVar, String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        zm1.d.getClass();
        Object value = zm1.g.getValue();
        value.getClass();
        Class cls = Integer.TYPE;
        cls.getClass();
        Constructor declaredConstructor = ((Class) value).getDeclaredConstructor(cls, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class);
        declaredConstructor.setAccessible(true);
        Object objNewInstance = declaredConstructor.newInstance(Integer.valueOf(ghVar.e), Integer.valueOf(ghVar.f), ghVar.a, ghVar.b, ghVar.g, ghVar.h, ghVar.c, "v1.0", str, "");
        objNewInstance.getClass();
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object r(gh ghVar) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        dn1.d.getClass();
        Object value = dn1.g.getValue();
        value.getClass();
        Class cls = Integer.TYPE;
        cls.getClass();
        Constructor declaredConstructor = ((Class) value).getDeclaredConstructor(cls, cls, String.class, String.class, cls, String.class, String.class);
        declaredConstructor.getClass();
        ig1.a(declaredConstructor);
        Object objNewInstance = declaredConstructor.newInstance(Integer.valueOf(ghVar.e), Integer.valueOf(ghVar.f), ghVar.a, ghVar.b, 1, "v1.0", ghVar.c);
        objNewInstance.getClass();
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ch s() {
        pp1 pp1Var = pp1.a;
        ch chVar = (ch) pp1.c().b(se.D(ch.Companion.serializer()), new ch(), "AutoReceiveRedPacket/config");
        if (chVar == null) {
            chVar = new ch();
        }
        long jE = ci0.E(chVar.a, 0L, AIChatConfig.MaxReplyDelayMs);
        int i2 = chVar.b;
        Integer numValueOf = Integer.valueOf(i2);
        if (!l.contains(Integer.valueOf(i2))) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
        Set set = chVar.d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!pv2.s0((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        Set set2 = chVar.e;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj2 : set2) {
            if (!pv2.s0((String) obj2)) {
                linkedHashSet2.add(obj2);
            }
        }
        boolean z = chVar.c;
        fh fhVar = chVar.f;
        fhVar.getClass();
        return new ch(jE, iIntValue, z, linkedHashSet, linkedHashSet2, fhVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String t(String str, String str2) {
        int length;
        int iQ0;
        String strJ = vi0.j("<", str2, ">");
        String strJ2 = vi0.j("</", str2, ">");
        int iQ02 = pv2.q0(str, strJ, 0, false, 6);
        if (iQ02 < 0 || (iQ0 = pv2.q0(str, strJ2, (length = strJ.length() + iQ02), false, 4)) < 0) {
            return "";
        }
        String string = pv2.I0(str.substring(length, iQ0)).toString();
        return (wv2.d0(string, "<![CDATA[", false) && wv2.W(string, "]]>", false)) ? string.substring(9, string.length() - 3) : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void u() {
        Method[] declaredMethods = up0.H("com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI").getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList<Method> arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (t11.l(method.getName(), "onSceneEnd")) {
                arrayList.add(method);
            }
        }
        if (arrayList.isEmpty()) {
            s.l("com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.onSceneEnd was not found");
            return;
        }
        for (Method method2 : arrayList) {
            method2.getClass();
            XposedBridge.hookMethod(method2, new kg3(d, null, new w(15))).getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void v(gh ghVar) {
        Object x92Var;
        try {
            x92Var = up0.k;
            if (x92Var == null) {
                t11.S("hostAct");
                throw null;
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Activity activity = (Activity) (x92Var instanceof x92 ? null : x92Var);
        if (activity == null) {
            s.l("No foreground activity is available for click receive mode");
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) up0.H("com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI"));
        intent.putExtra("Nuke.AutoReceiveRedPacket.ClickReceive", true);
        intent.putExtra("KEY_HOME_PAGE_CLS", "com.tencent.mm.ui.LauncherUI");
        intent.putExtra("key_username", ghVar.d);
        intent.putExtra("key_way", 1);
        intent.putExtra("key_native_url", ghVar.b);
        intent.putExtra("ReportKey.CommonReportObjKey", m);
        intent.putExtra("key_cropname", "");
        activity.runOnUiThread(new lb(activity, intent, ghVar, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gh w(yi1 yi1Var, int i2) {
        String str;
        Integer numE0;
        Integer numE02;
        String str2 = yi1Var.h;
        int iQ0 = pv2.q0(str2, "<msg", 0, false, 6);
        String strSubstring = iQ0 >= 0 ? str2.substring(iQ0) : str2;
        String strB0 = wv2.b0(t(strSubstring, "nativeurl"), "&amp;", "&");
        String str3 = null;
        if (!pv2.s0(strB0)) {
            Uri uri = Uri.parse(strB0);
            String queryParameter = uri.getQueryParameter("sendid");
            if (queryParameter == null) {
                queryParameter = "";
            }
            String str4 = queryParameter;
            if (!pv2.s0(str4)) {
                String str5 = yi1Var.c;
                if (wv2.W(str5, "@chatroom", false)) {
                    String string = pv2.I0(pv2.G0(str2, ':')).toString();
                    if (!pv2.s0(string) && !pv2.i0(string, '<')) {
                        str3 = string;
                    }
                    if (str3 != null) {
                        str = str3;
                    }
                } else {
                    str = str5;
                }
                String queryParameter2 = uri.getQueryParameter("msgtype");
                int iIntValue = 1;
                int iIntValue2 = (queryParameter2 == null || (numE02 = wv2.e0(queryParameter2)) == null) ? 1 : numE02.intValue();
                String queryParameter3 = uri.getQueryParameter("channelid");
                if (queryParameter3 != null && (numE0 = wv2.e0(queryParameter3)) != null) {
                    iIntValue = numE0.intValue();
                }
                return new gh(str4, strB0, str5, str, iIntValue2, iIntValue, t(strSubstring, "headimgurl"), t(strSubstring, "sendertitle"), i2);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void g() {
        Object x92Var;
        try {
            u();
            x92Var = a83.a;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thA = y92.a(x92Var);
        if (thA != null) {
            d.getClass();
            hg3.d(h, "Install click receive UI hook failed: ".concat(fg1.Q(thA)));
        }
        dn1.d.getClass();
        Method method = (Method) dn1.f.getValue();
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new w(13))).getClass();
        zm1.d.getClass();
        Method method2 = (Method) zm1.f.getValue();
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, null, new w(14))).getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void h(vb1 vb1Var) {
        s();
        vb1Var.a(id3.e, new w(12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void i() {
        j.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.gw
    public final String j(Context context) {
        context.getClass();
        ch chVarS = s();
        String string = context.getString(chVarS.b == 0 ? R.string.auto_receive_redpacket_mode_click : R.string.auto_receive_redpacket_mode_network);
        string.getClass();
        String string2 = chVarS.f.a ? context.getString(R.string.auto_receive_redpacket_auto_reply_enabled) : context.getString(R.string.auto_receive_redpacket_auto_reply_disabled);
        string2.getClass();
        String string3 = context.getString(R.string.auto_receive_redpacket_config_summary, string, Long.valueOf(chVarS.a), string2);
        string3.getClass();
        return string3;
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
        int i2 = 4;
        activity.runOnUiThread(new t7(i2, activity, new kw(-1066088789, true, new x(i2, s(), xm0Var))));
    }
}
