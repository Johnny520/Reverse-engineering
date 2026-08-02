package defpackage;

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
import nuke.module.wechat.ai.AIChatConfig;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ii extends gx2 {
    public static final ii d = new ii(false);
    public static final int e = R.string.auto_receive_transfer_money;
    public static final int f = R.string.auto_receive_transfer_money_description;
    public static final wm0 g = wm0.i;
    public static final String h = "AutoReceiveTransferMoney";
    public static final boolean i = true;
    public static final ConcurrentHashMap.KeySetView j = ConcurrentHashMap.newKeySet();
    public static final hx2 k = new hx2(new c0(8));
    public static final Set l = mg.u0(new String[]{"paysubtype", "transcationid", "transferid", "invalidtime", "payer_username", "receiver_username", "feedesc"});
    public static final Set m = mg.u0(new Integer[]{10, 12, 13, 14});

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object q(hi hiVar) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        int i2 = hiVar.e;
        String str = hiVar.b;
        String str2 = hiVar.a;
        Constructor constructor = (Constructor) k.getValue();
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        parameterTypes.getClass();
        Number numberU = u((Class) mg.n0(10, parameterTypes));
        switch (constructor.getParameterCount()) {
            case 10:
                objNewInstance = constructor.newInstance(str2, str, 0, "confirm", hiVar.c, Integer.valueOf(i2), "", null, 1, null);
                break;
            case 11:
            default:
                c80.u("Unsupported transfer confirm constructor: ", constructor);
                return null;
            case 12:
                objNewInstance = constructor.newInstance(str2, str, 0, "confirm", hiVar.c, Integer.valueOf(i2), "", null, 1, null, numberU, hiVar.c);
                break;
            case 13:
                objNewInstance = constructor.newInstance(str2, str, 0, "confirm", hiVar.c, Integer.valueOf(i2), "", null, 1, null, numberU, hiVar.c, "");
                break;
            case 14:
                objNewInstance = constructor.newInstance(str2, str, 0, "confirm", hiVar.c, Integer.valueOf(i2), "", null, 1, "", null, u(constructor.getParameterTypes()[11]), hiVar.c, "");
                break;
        }
        objNewInstance.getClass();
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static di r() {
        pp1 pp1Var = pp1.a;
        di diVar = (di) pp1.c().b(se.D(di.Companion.serializer()), new di(), "AutoReceiveTransferMoney/config");
        if (diVar == null) {
            diVar = new di();
        }
        long jE = ci0.E(diVar.a, 0L, AIChatConfig.MaxReplyDelayMs);
        Set set = diVar.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (!pv2.s0((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        Set set2 = diVar.d;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj2 : set2) {
            if (!pv2.s0((String) obj2)) {
                linkedHashSet2.add(obj2);
            }
        }
        boolean z = diVar.b;
        gi giVar = diVar.e;
        giVar.getClass();
        return new di(jE, z, linkedHashSet, linkedHashSet2, giVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hi s(yi1 yi1Var) throws XmlPullParserException, IOException {
        Map linkedHashMap;
        String str = yi1Var.c;
        String str2 = yi1Var.h;
        int iQ0 = pv2.q0(str2, "<msg", 0, false, 6);
        if (iQ0 < 0) {
            linkedHashMap = ce0.h;
        } else {
            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str2.substring(iQ0)));
            linkedHashMap = new LinkedHashMap();
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                if (eventType == 2 && l.contains(xmlPullParserNewPullParser.getName())) {
                    String name = xmlPullParserNewPullParser.getName();
                    String strNextText = xmlPullParserNewPullParser.nextText();
                    strNextText.getClass();
                    linkedHashMap.put(name, pv2.I0(strNextText).toString());
                }
            }
        }
        String str3 = (String) linkedHashMap.get("paysubtype");
        String str4 = null;
        if (!t11.l(str3, "1")) {
            hg3.f(h, "Skipping transfer with pay subtype " + str3);
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
        Integer numE0 = str7 != null ? wv2.e0(str7) : null;
        if (pv2.s0(str5) || pv2.s0(str6) || numE0 == null) {
            throw new IllegalStateException(("Incomplete transfer data: transactionId=" + (!pv2.s0(str5)) + ", transferId=" + (true ^ pv2.s0(str6)) + ", invalidTime=" + linkedHashMap.get("invalidtime")).toString());
        }
        String str8 = (String) linkedHashMap.get("payer_username");
        if (str8 == null) {
            str8 = "";
        }
        if (pv2.s0(str8)) {
            d.getClass();
            if (wv2.W(str, "@chatroom", false)) {
                String string = pv2.I0(pv2.G0(str2, ':')).toString();
                if (!pv2.s0(string) && !pv2.i0(string, '<')) {
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
        int iIntValue = numE0.intValue();
        String str10 = (String) linkedHashMap.get("feedesc");
        return new hi(str5, str6, str8, str9, iIntValue, str10 != null ? str10 : "", str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void t(hi hiVar, gi giVar) {
        jo2 jo2Var;
        boolean z = giVar.a;
        String str = giVar.b;
        if (!z || pv2.s0(str)) {
            return;
        }
        so2 so2VarL = gd3.l(hiVar.g, wv2.b0(str, "$amount", hiVar.f));
        if (so2VarL instanceof ro2) {
            jo2Var = null;
        } else {
            if (!(so2VarL instanceof qo2)) {
                c80.s();
                return;
            }
            jo2Var = ((qo2) so2VarL).a;
        }
        if (jo2Var != null) {
            d.getClass();
            hg3.d(h, "Transfer auto reply failed: ".concat(jo2Var.c));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Number u(Class cls) {
        if (t11.l(cls, Long.TYPE) || t11.l(cls, Long.class)) {
            return 0L;
        }
        if (t11.l(cls, Short.TYPE) || t11.l(cls, Short.class)) {
            return (short) 0;
        }
        return (t11.l(cls, Byte.TYPE) || t11.l(cls, Byte.class)) ? (byte) 0 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final String d() {
        return h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.vj
    public final void h(vb1 vb1Var) {
        r();
        vb1Var.a(id3.e, new w(17));
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
        di diVarR = r();
        boolean z = diVarR.b;
        String string = context.getString(z ? R.string.auto_receive_transfer_money_whitelist_summary : R.string.auto_receive_transfer_money_blacklist_summary, Integer.valueOf((z ? diVarR.c : diVarR.d).size()));
        string.getClass();
        String string2 = context.getString(diVarR.e.a ? R.string.auto_receive_transfer_money_auto_reply_enabled : R.string.auto_receive_transfer_money_auto_reply_disabled);
        string2.getClass();
        String string3 = context.getString(R.string.auto_receive_transfer_money_config_summary, Long.valueOf(diVarR.a), string, string2);
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
        activity.runOnUiThread(new t7(4, activity, new kw(679568043, true, new x(5, r(), xm0Var))));
    }
}
