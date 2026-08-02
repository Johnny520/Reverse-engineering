package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: hh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0277hh extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final C0277hh f4004d = new C0277hh(false);

    /* JADX INFO: renamed from: e */
    public static final int f4005e = R.string.auto_receive_redpacket;

    /* JADX INFO: renamed from: f */
    public static final int f4006f = R.string.auto_receive_redpacket_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f4007g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f4008h = "AutoReceiveRedPacket";

    /* JADX INFO: renamed from: i */
    public static final boolean f4009i = true;

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap f4010j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public static final Set f4011k = AbstractC0460mg.m3106u0(new Integer[]{436207665, 469762097});

    /* JADX INFO: renamed from: l */
    public static final Set f4012l = AbstractC0460mg.m3106u0(new Integer[]{0, 1});

    /* JADX INFO: renamed from: m */
    public static final int[] f4013m = {10, 109, 10, 10, 76, 97, 117, 110, 99, 104, 101, 114, 85, 73, 18, 36, 48, 54, 99, 48, 55, 49, 101, 56, 45, 55, 52, 50, 98, 45, 52, 48, 97, 99, 45, 97, 100, 54, 48, 45, 57, 57, 101, 51, 102, 55, 100, 98, 99, 50, 55, 49, 24, -57, -89, -128, -79, -41, 50, 32, 0, 40, 1, 50, 46, 8, 9, 18, 42, 10, 20, 49, 49, 53, 56, 51, 50, 56, 48, 50, 54, 57, 52, 51, 53, 57, 56, 49, 56, 52, 54, 40, 0, 48, 0, 56, 0, 64, 0, 72, 0, 80, 0, 96, 0, 104, 0, 112, 0, 120, 0};

    /* JADX INFO: renamed from: q */
    public static Object m2172q(C0240gh c0240gh, String str) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        zm1.f13950d.getClass();
        Object value = zm1.f13953g.getValue();
        value.getClass();
        Class cls = Integer.TYPE;
        cls.getClass();
        Constructor declaredConstructor = ((Class) value).getDeclaredConstructor(cls, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class);
        declaredConstructor.setAccessible(true);
        Object objNewInstance = declaredConstructor.newInstance(Integer.valueOf(c0240gh.f3517e), Integer.valueOf(c0240gh.f3518f), c0240gh.f3513a, c0240gh.f3514b, c0240gh.f3519g, c0240gh.f3520h, c0240gh.f3515c, "v1.0", str, "");
        objNewInstance.getClass();
        return objNewInstance;
    }

    /* JADX INFO: renamed from: r */
    public static Object m2173r(C0240gh c0240gh) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
        dn1.f2122d.getClass();
        Object value = dn1.f2125g.getValue();
        value.getClass();
        Class cls = Integer.TYPE;
        cls.getClass();
        Constructor declaredConstructor = ((Class) value).getDeclaredConstructor(cls, cls, String.class, String.class, cls, String.class, String.class);
        declaredConstructor.getClass();
        ig1.m2344a(declaredConstructor);
        Object objNewInstance = declaredConstructor.newInstance(Integer.valueOf(c0240gh.f3517e), Integer.valueOf(c0240gh.f3518f), c0240gh.f3513a, c0240gh.f3514b, 1, "v1.0", c0240gh.f3515c);
        objNewInstance.getClass();
        return objNewInstance;
    }

    /* JADX INFO: renamed from: s */
    public static C0091ch m2174s() {
        pp1 pp1Var = pp1.f8445a;
        C0091ch c0091ch = (C0091ch) pp1.m3931c().m3605b(AbstractC0691se.m4815D(C0091ch.Companion.serializer()), new C0091ch(), "AutoReceiveRedPacket/config");
        if (c0091ch == null) {
            c0091ch = new C0091ch();
        }
        long jM780E = ci0.m780E(c0091ch.f1534a, 0L, AIChatConfig.MaxReplyDelayMs);
        int i = c0091ch.f1535b;
        Integer numValueOf = Integer.valueOf(i);
        if (!f4012l.contains(Integer.valueOf(i))) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
        Set set = c0091ch.f1537d;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!pv2.m4006s0((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        Set set2 = c0091ch.f1538e;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj2 : set2) {
            if (!pv2.m4006s0((String) obj2)) {
                linkedHashSet2.add(obj2);
            }
        }
        boolean z = c0091ch.f1536c;
        C0203fh c0203fh = c0091ch.f1539f;
        c0203fh.getClass();
        return new C0091ch(jM780E, iIntValue, z, linkedHashSet, linkedHashSet2, c0203fh);
    }

    /* JADX INFO: renamed from: t */
    public static String m2175t(String str, String str2) {
        int length;
        int iM4004q0;
        String strM5691j = vi0.m5691j("<", str2, ">");
        String strM5691j2 = vi0.m5691j("</", str2, ">");
        int iM4004q02 = pv2.m4004q0(str, strM5691j, 0, false, 6);
        if (iM4004q02 < 0 || (iM4004q0 = pv2.m4004q0(str, strM5691j2, (length = strM5691j.length() + iM4004q02), false, 4)) < 0) {
            return "";
        }
        String string = pv2.m3993I0(str.substring(length, iM4004q0)).toString();
        return (wv2.m6012d0(string, "<![CDATA[", false) && wv2.m6005W(string, "]]>", false)) ? string.substring(9, string.length() - 3) : string;
    }

    /* JADX INFO: renamed from: u */
    public static void m2176u() {
        Method[] declaredMethods = up0.m5529H("com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI").getDeclaredMethods();
        declaredMethods.getClass();
        ArrayList<Method> arrayList = new ArrayList();
        for (Method method : declaredMethods) {
            if (t11.m5086l(method.getName(), "onSceneEnd")) {
                arrayList.add(method);
            }
        }
        if (arrayList.isEmpty()) {
            C0676s.m4653l("com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI.onSceneEnd was not found");
            return;
        }
        for (Method method2 : arrayList) {
            method2.getClass();
            XposedBridge.hookMethod(method2, new kg3(f4004d, null, new C0829w(15))).getClass();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m2177v(C0240gh c0240gh) {
        Object x92Var;
        try {
            x92Var = up0.f11403k;
            if (x92Var == null) {
                t11.m5067S("hostAct");
                throw null;
            }
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Activity activity = (Activity) (x92Var instanceof x92 ? null : x92Var);
        if (activity == null) {
            C0676s.m4653l("No foreground activity is available for click receive mode");
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) up0.m5529H("com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI"));
        intent.putExtra("Nuke.AutoReceiveRedPacket.ClickReceive", true);
        intent.putExtra("KEY_HOME_PAGE_CLS", "com.tencent.mm.ui.LauncherUI");
        intent.putExtra("key_username", c0240gh.f3516d);
        intent.putExtra("key_way", 1);
        intent.putExtra("key_native_url", c0240gh.f3514b);
        intent.putExtra("ReportKey.CommonReportObjKey", f4013m);
        intent.putExtra("key_cropname", "");
        activity.runOnUiThread(new RunnableC0418lb(activity, intent, c0240gh, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0240gh m2178w(yi1 yi1Var, int i) {
        String str;
        Integer numM6013e0;
        Integer numM6013e02;
        String str2 = yi1Var.f13475h;
        int iM4004q0 = pv2.m4004q0(str2, "<msg", 0, false, 6);
        String strSubstring = iM4004q0 >= 0 ? str2.substring(iM4004q0) : str2;
        String strM6010b0 = wv2.m6010b0(m2175t(strSubstring, "nativeurl"), "&amp;", "&");
        String str3 = null;
        if (!pv2.m4006s0(strM6010b0)) {
            Uri uri = Uri.parse(strM6010b0);
            String queryParameter = uri.getQueryParameter("sendid");
            if (queryParameter == null) {
                queryParameter = "";
            }
            String str4 = queryParameter;
            if (!pv2.m4006s0(str4)) {
                String str5 = yi1Var.f13470c;
                if (wv2.m6005W(str5, "@chatroom", false)) {
                    String string = pv2.m3993I0(pv2.m3991G0(str2, ':')).toString();
                    if (!pv2.m4006s0(string) && !pv2.m3996i0(string, '<')) {
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
                int iIntValue2 = (queryParameter2 == null || (numM6013e02 = wv2.m6013e0(queryParameter2)) == null) ? 1 : numM6013e02.intValue();
                String queryParameter3 = uri.getQueryParameter("channelid");
                if (queryParameter3 != null && (numM6013e0 = wv2.m6013e0(queryParameter3)) != null) {
                    iIntValue = numM6013e0.intValue();
                }
                return new C0240gh(str4, strM6010b0, str5, str, iIntValue2, iIntValue, m2175t(strSubstring, "headimgurl"), m2175t(strSubstring, "sendertitle"), i);
            }
        }
        return null;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f4008h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: g */
    public final void mo140g() {
        Object x92Var;
        try {
            m2176u();
            x92Var = a83.f116a;
        } catch (Throwable th) {
            x92Var = new x92(th);
        }
        Throwable thM6237a = y92.m6237a(x92Var);
        if (thM6237a != null) {
            f4004d.getClass();
            hg3.m2166d(f4008h, "Install click receive UI hook failed: ".concat(fg1.m1624Q(thM6237a)));
        }
        dn1.f2122d.getClass();
        Method method = (Method) dn1.f2124f.getValue();
        method.getClass();
        XposedBridge.hookMethod(method, new kg3(this, null, new C0829w(13))).getClass();
        zm1.f13950d.getClass();
        Method method2 = (Method) zm1.f13952f.getValue();
        method2.getClass();
        XposedBridge.hookMethod(method2, new kg3(this, null, new C0829w(14))).getClass();
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: h */
    public final void mo319h(vb1 vb1Var) {
        m2174s();
        vb1Var.m5664a(id3.f4575e, new C0829w(12));
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: i */
    public final void mo320i() {
        f4010j.clear();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: j */
    public final String mo321j(Context context) {
        context.getClass();
        C0091ch c0091chM2174s = m2174s();
        String string = context.getString(c0091chM2174s.f1535b == 0 ? R.string.auto_receive_redpacket_mode_click : R.string.auto_receive_redpacket_mode_network);
        string.getClass();
        String string2 = c0091chM2174s.f1539f.f2998a ? context.getString(R.string.auto_receive_redpacket_auto_reply_enabled) : context.getString(R.string.auto_receive_redpacket_auto_reply_disabled);
        string2.getClass();
        String string3 = context.getString(R.string.auto_receive_redpacket_config_summary, string, Long.valueOf(c0091chM2174s.f1534a), string2);
        string3.getClass();
        return string3;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f4006f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: l */
    public final boolean mo322l() {
        return f4009i;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f4005e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f4007g;
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
        int i = 4;
        activity.runOnUiThread(new RunnableC0724t7(i, activity, new C0402kw(-1066088789, true, new C0866x(i, m2174s(), xm0Var))));
    }
}
