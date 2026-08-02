package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: ii */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0314ii extends gx2 {

    /* JADX INFO: renamed from: d */
    public static final C0314ii f4621d = new C0314ii(false);

    /* JADX INFO: renamed from: e */
    public static final int f4622e = R.string.auto_receive_transfer_money;

    /* JADX INFO: renamed from: f */
    public static final int f4623f = R.string.auto_receive_transfer_money_description;

    /* JADX INFO: renamed from: g */
    public static final wm0 f4624g = wm0.f12575i;

    /* JADX INFO: renamed from: h */
    public static final String f4625h = "AutoReceiveTransferMoney";

    /* JADX INFO: renamed from: i */
    public static final boolean f4626i = true;

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap.KeySetView f4627j = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: k */
    public static final hx2 f4628k = new hx2(new C0074c0(8));

    /* JADX INFO: renamed from: l */
    public static final Set f4629l = AbstractC0460mg.m3106u0(new String[]{"paysubtype", "transcationid", "transferid", "invalidtime", "payer_username", "receiver_username", "feedesc"});

    /* JADX INFO: renamed from: m */
    public static final Set f4630m = AbstractC0460mg.m3106u0(new Integer[]{10, 12, 13, 14});

    /* JADX INFO: renamed from: q */
    public static Object m2348q(C0278hi c0278hi) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        int i = c0278hi.f4027e;
        String str = c0278hi.f4024b;
        String str2 = c0278hi.f4023a;
        Constructor constructor = (Constructor) f4628k.getValue();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        Number numberM2352u = m2352u((Class) AbstractC0460mg.m3099n0(10, parameterTypes));
        switch (constructor.getParameterCount()) {
            case 10:
                objNewInstance = constructor.newInstance(str2, str, 0, "confirm", c0278hi.f4025c, Integer.valueOf(i), "", null, 1, null);
                break;
            case 11:
            default:
                c80.m677u("Unsupported transfer confirm constructor: ", constructor);
                return null;
            case 12:
                objNewInstance = constructor.newInstance(str2, str, 0, "confirm", c0278hi.f4025c, Integer.valueOf(i), "", null, 1, null, numberM2352u, c0278hi.f4025c);
                break;
            case 13:
                objNewInstance = constructor.newInstance(str2, str, 0, "confirm", c0278hi.f4025c, Integer.valueOf(i), "", null, 1, null, numberM2352u, c0278hi.f4025c, "");
                break;
            case 14:
                objNewInstance = constructor.newInstance(str2, str, 0, "confirm", c0278hi.f4025c, Integer.valueOf(i), "", null, 1, "", null, m2352u(constructor.getParameterTypes()[11]), c0278hi.f4025c, "");
                break;
        }
        objNewInstance.getClass();
        return objNewInstance;
    }

    /* JADX INFO: renamed from: r */
    public static C0131di m2349r() {
        pp1 pp1Var = pp1.f8445a;
        C0131di c0131di = (C0131di) pp1.m3931c().m3605b(AbstractC0691se.m4815D(C0131di.Companion.serializer()), new C0131di(), "AutoReceiveTransferMoney/config");
        if (c0131di == null) {
            c0131di = new C0131di();
        }
        long jM780E = ci0.m780E(c0131di.f2057a, 0L, AIChatConfig.MaxReplyDelayMs);
        Set set = c0131di.f2059c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!pv2.m4006s0((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        Set set2 = c0131di.f2060d;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj2 : set2) {
            if (!pv2.m4006s0((String) obj2)) {
                linkedHashSet2.add(obj2);
            }
        }
        boolean z = c0131di.f2058b;
        C0241gi c0241gi = c0131di.f2061e;
        c0241gi.getClass();
        return new C0131di(jM780E, z, linkedHashSet, linkedHashSet2, c0241gi);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0278hi m2350s(yi1 yi1Var) throws XmlPullParserException, IOException {
        Map linkedHashMap;
        String str = yi1Var.f13470c;
        String str2 = yi1Var.f13475h;
        int iM4004q0 = pv2.m4004q0(str2, "<msg", 0, false, 6);
        if (iM4004q0 < 0) {
            linkedHashMap = ce0.f1492h;
        } else {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str2.substring(iM4004q0)));
            linkedHashMap = new LinkedHashMap();
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2 && f4629l.contains(xmlPullParserNewPullParser.getName())) {
                    String name = xmlPullParserNewPullParser.getName();
                    String strNextText = xmlPullParserNewPullParser.nextText();
                    strNextText.getClass();
                    linkedHashMap.put(name, pv2.m3993I0(strNextText).toString());
                }
            }
        }
        String str3 = (String) linkedHashMap.get("paysubtype");
        String str4 = null;
        if (!t11.m5086l(str3, "1")) {
            hg3.m2168f(f4625h, "Skipping transfer with pay subtype " + str3);
            return null;
        }
        String str5 = (String) linkedHashMap.get("transcationid");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) linkedHashMap.get("transferid");
        if (str6 == null) {
            str6 = "";
        }
        String str7 = (String) linkedHashMap.get("invalidtime");
        Integer numM6013e0 = str7 != null ? wv2.m6013e0(str7) : null;
        if (pv2.m4006s0(str5) || pv2.m4006s0(str6) || numM6013e0 == null) {
            throw new IllegalStateException(("Incomplete transfer data: transactionId=" + (!pv2.m4006s0(str5)) + ", transferId=" + (true ^ pv2.m4006s0(str6)) + ", invalidTime=" + linkedHashMap.get("invalidtime")).toString());
        }
        String str8 = (String) linkedHashMap.get("payer_username");
        if (str8 == null) {
            str8 = "";
        }
        if (pv2.m4006s0(str8)) {
            f4621d.getClass();
            if (wv2.m6005W(str, "@chatroom", false)) {
                String string = pv2.m3993I0(pv2.m3991G0(str2, ':')).toString();
                if (!pv2.m4006s0(string) && !pv2.m3996i0(string, '<')) {
                    str4 = string;
                }
                if (str4 != null) {
                    str8 = str4;
                }
            } else {
                str8 = str;
            }
        }
        String str9 = (String) linkedHashMap.get("receiver_username");
        if (str9 == null) {
            str9 = "";
        }
        int iIntValue = numM6013e0.intValue();
        String str10 = (String) linkedHashMap.get("feedesc");
        return new C0278hi(str5, str6, str8, str9, iIntValue, str10 != null ? str10 : "", str);
    }

    /* JADX INFO: renamed from: t */
    public static void m2351t(C0278hi c0278hi, C0241gi c0241gi) {
        jo2 jo2Var;
        boolean z = c0241gi.f3529a;
        String str = c0241gi.f3530b;
        if (!z || pv2.m4006s0(str)) {
            return;
        }
        so2 so2VarM1838l = gd3.m1838l(c0278hi.f4029g, wv2.m6010b0(str, "$amount", c0278hi.f4028f));
        if (so2VarM1838l instanceof ro2) {
            jo2Var = null;
        } else {
            if (!(so2VarM1838l instanceof qo2)) {
                c80.m675s();
                return;
            }
            jo2Var = ((qo2) so2VarM1838l).f9058a;
        }
        if (jo2Var != null) {
            f4621d.getClass();
            hg3.m2166d(f4625h, "Transfer auto reply failed: ".concat(jo2Var.f5132c));
        }
    }

    /* JADX INFO: renamed from: u */
    public static Number m2352u(Class cls) {
        if (t11.m5086l(cls, Long.TYPE) || t11.m5086l(cls, Long.class)) {
            return 0L;
        }
        if (t11.m5086l(cls, Short.TYPE) || t11.m5086l(cls, Short.class)) {
            return (short) 0;
        }
        return (t11.m5086l(cls, Byte.TYPE) || t11.m5086l(cls, Byte.class)) ? (byte) 0 : 0;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: d */
    public final String mo9d() {
        return f4625h;
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: h */
    public final void mo319h(vb1 vb1Var) {
        m2349r();
        vb1Var.m5664a(id3.f4575e, new C0829w(17));
    }

    @Override // p000.AbstractC0812vj
    /* JADX INFO: renamed from: i */
    public final void mo320i() {
        f4627j.clear();
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: j */
    public final String mo321j(Context context) {
        context.getClass();
        C0131di c0131diM2349r = m2349r();
        boolean z = c0131diM2349r.f2058b;
        String string = context.getString(z ? R.string.auto_receive_transfer_money_whitelist_summary : R.string.auto_receive_transfer_money_blacklist_summary, Integer.valueOf((z ? c0131diM2349r.f2059c : c0131diM2349r.f2060d).size()));
        string.getClass();
        String string2 = context.getString(c0131diM2349r.f2061e.f3529a ? R.string.auto_receive_transfer_money_auto_reply_enabled : R.string.auto_receive_transfer_money_auto_reply_disabled);
        string2.getClass();
        String string3 = context.getString(R.string.auto_receive_transfer_money_config_summary, Long.valueOf(c0131diM2349r.f2057a), string, string2);
        string3.getClass();
        return string3;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: k */
    public final Integer mo141k() {
        return Integer.valueOf(f4623f);
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: l */
    public final boolean mo322l() {
        return f4626i;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: m */
    public final int mo142m() {
        return f4622e;
    }

    @Override // p000.AbstractC0255gw
    /* JADX INFO: renamed from: n */
    public final wm0 mo143n() {
        return f4624g;
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
        activity.runOnUiThread(new RunnableC0724t7(4, activity, new C0402kw(679568043, true, new C0866x(5, m2349r(), xm0Var))));
    }
}
