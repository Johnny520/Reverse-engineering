package p010aa;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.HttpUrl;
import p003a2.C0014a;
import p064ea.C0851c;
import p077f8.C1086f;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p153k8.C2351o;
import p153k8.C2353q;
import p167l8.C2526a;
import p167l8.C2529d;
import p167l8.C2530e;
import p210o8.C3080d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p258r8.C3742g;
import p274s8.C3943c;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p304uf.C4330d;
import p346x9.AbstractC5737d;
import p346x9.C5735b;
import p346x9.C5738e;
import tf.AbstractC4165l;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: aa.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0036d extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f128c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f129d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036d(C3742g c3742g, List list, C0037e c0037e, C2353q c2353q) {
        super(10000);
        this.f126a = 0;
        this.f127b = c3742g;
        this.f128c = list;
        this.f129d = c0037e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object obj;
        Object obj2;
        switch (this.f126a) {
            case 2:
                C3080d c3080d = (C3080d) this.f129d;
                ThreadLocal threadLocal = c3080d.f9955e;
                int iIntValue = ((Integer) threadLocal.get()).intValue();
                int i9 = 1;
                if (iIntValue > 1) {
                    threadLocal.set(Integer.valueOf(iIntValue - 1));
                    break;
                } else {
                    threadLocal.remove();
                    String str = (String) this.f127b;
                    Method method = (Method) this.f128c;
                    Object[] objArr = methodHookParam.args;
                    Object result = methodHookParam.getResult();
                    if (!c3080d.f9954d.isEmpty() && objArr != null) {
                        long jLongValue = result instanceof Number ? ((Number) result).longValue() : 0L;
                        if (!"insert".equals(str)) {
                            boolean zEquals = "update".equals(str);
                            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            if (!zEquals) {
                                if ("delete".equals(str) && jLongValue > 0 && objArr.length >= 3) {
                                    String strM6544h = C3080d.m6544h(objArr);
                                    int i10 = 1;
                                    while (true) {
                                        if (i10 < objArr.length) {
                                            Object obj3 = objArr[i10];
                                            if (obj3 instanceof String) {
                                                str2 = (String) obj3;
                                            } else {
                                                i10++;
                                            }
                                        }
                                    }
                                    String str3 = str2;
                                    int length = objArr.length;
                                    int i11 = 0;
                                    while (true) {
                                        if (i11 < length) {
                                            obj = objArr[i11];
                                            if (!(obj instanceof String[])) {
                                                i11++;
                                            }
                                        } else {
                                            obj = null;
                                        }
                                    }
                                    String[] strArr = obj instanceof String[] ? (String[]) obj : null;
                                    method.getName();
                                    c3080d.m6545b(new C2526a(str, strM6544h, null, str3, strArr, jLongValue));
                                    break;
                                }
                            } else if (jLongValue > 0) {
                                String strM6544h2 = C3080d.m6544h(objArr);
                                ContentValues contentValuesM6542a = C3080d.m6542a(objArr);
                                int length2 = objArr.length;
                                int i12 = 0;
                                int i13 = 0;
                                while (true) {
                                    if (i12 < length2) {
                                        int i14 = i9;
                                        Object obj4 = objArr[i12];
                                        if (obj4 instanceof ContentValues) {
                                            i13 = i14;
                                        } else if (i13 != 0 && (obj4 instanceof String)) {
                                            str2 = (String) obj4;
                                        }
                                        i12++;
                                        i9 = i14;
                                    }
                                }
                                String str4 = str2;
                                int length3 = objArr.length;
                                int i15 = 0;
                                while (true) {
                                    if (i15 < length3) {
                                        obj2 = objArr[i15];
                                        if (!(obj2 instanceof String[])) {
                                            i15++;
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                String[] strArr2 = obj2 instanceof String[] ? (String[]) obj2 : null;
                                method.getName();
                                c3080d.m6545b(new C2526a(str, strM6544h2, contentValuesM6542a, str4, strArr2, jLongValue));
                                break;
                            }
                        } else if (jLongValue >= 0) {
                            String strM6544h3 = C3080d.m6544h(objArr);
                            while (i9 < objArr.length) {
                                Object obj5 = objArr[i9];
                                if ((obj5 instanceof String) || (obj5 instanceof ContentValues)) {
                                    ContentValues contentValuesM6542a2 = C3080d.m6542a(objArr);
                                    method.getName();
                                    c3080d.m6545b(new C2526a(str, strM6544h3, contentValuesM6542a2, null, null, jLongValue));
                                } else {
                                    i9++;
                                }
                                break;
                            }
                            ContentValues contentValuesM6542a22 = C3080d.m6542a(objArr);
                            method.getName();
                            c3080d.m6545b(new C2526a(str, strM6544h3, contentValuesM6542a22, null, null, jLongValue));
                            break;
                        }
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04be A[LOOP:9: B:276:0x04b8->B:278:0x04be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0768  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0685 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016e  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean z9;
        Object c3959f;
        String str;
        String str2;
        String str3;
        Object[] objArr;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean zM296l;
        String str8;
        String str9;
        String str10;
        String str11;
        boolean z10;
        boolean z11;
        boolean z12;
        String strM5614a;
        String strM10426j;
        String strM10423g;
        boolean z13;
        Object c3959f2;
        String string;
        String string2;
        String string3;
        String string4;
        C0034b c0034bM190x;
        String string5;
        String string6;
        ArrayList<C0033a> arrayList;
        Iterator it;
        Iterator it2;
        ArrayList<C0040h> arrayList2;
        String str12;
        boolean zM301b;
        ContentValues contentValuesM6542a;
        String strValueOf;
        byte[] asByteArray;
        Object objM8366C0;
        int i9 = this.f126a;
        Class cls = Integer.TYPE;
        String strM6543c = HttpUrl.FRAGMENT_ENCODE_SET;
        Object obj = null;
        ?? r72 = this.f128c;
        Object obj2 = this.f127b;
        Object obj3 = this.f129d;
        switch (i9) {
            case 0:
                String str13 = "message_block_templates";
                C0037e c0037e = (C0037e) obj3;
                C3742g c3742g = (C3742g) obj2;
                methodHookParam.getClass();
                Object[] objArr2 = methodHookParam.args;
                if (objArr2 != null) {
                    SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_message_block_config");
                    try {
                        z9 = sharedPreferencesM8640c.getBoolean("message_block_enable", false);
                    } catch (Throwable unused) {
                        z9 = false;
                    }
                    if (z9) {
                        C1360a c1360aAccount = WeChatApis.account();
                        String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
                        String str14 = strM3652c == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3652c;
                        Iterator it3 = r72.iterator();
                        while (it3.hasNext()) {
                            Object objM8366C02 = AbstractC4165l.m8366C0(((Number) it3.next()).intValue(), objArr2);
                            if (objM8366C02 != null) {
                                try {
                                    c3959f = C2353q.m5651k(objM8366C02, str14);
                                } catch (Throwable th2) {
                                    c3959f = new C3959f(th2);
                                }
                                if (c3959f instanceof C3959f) {
                                    c3959f = obj;
                                }
                                C2530e c2530e = (C2530e) c3959f;
                                if (c2530e != null) {
                                    String str15 = c2530e.f8182i;
                                    String str16 = c2530e.f8179f;
                                    String str17 = c2530e.f8183j;
                                    String str18 = c2530e.f8178e;
                                    String str19 = c2530e.f8181h;
                                    String str20 = c2530e.f8180g;
                                    String str21 = str18;
                                    String str22 = c2530e.f8184k;
                                    Iterator it4 = it3;
                                    long j3 = c2530e.f8176c;
                                    if (AbstractC3149m.m6721t0(str19) || AbstractC3149m.m6721t0(str20) || (!AbstractC3149m.m6721t0(str22) && str20.equals(str22))) {
                                        str = str13;
                                        str2 = str22;
                                        str3 = str19;
                                        objArr = objArr2;
                                        str4 = str14;
                                        str5 = str15;
                                        str6 = str16;
                                        str7 = str20;
                                    } else {
                                        C2529d c2529d = WeChatMessage.Companion;
                                        long jCurrentTimeMillis = j3 > 0 ? j3 * 1000 : System.currentTimeMillis();
                                        int i10 = c2530e.f8175b;
                                        str4 = str14;
                                        str5 = str15;
                                        long j4 = c2530e.f8177d;
                                        c2529d.getClass();
                                        str2 = str22;
                                        WeChatMessage weChatMessageM5945k = C2529d.m5945k(str19, str20, str21, jCurrentTimeMillis, false, i10, j4, str17, str2);
                                        str3 = str19;
                                        str7 = str20;
                                        try {
                                            string = sharedPreferencesM8640c.getString(str13, HttpUrl.FRAGMENT_ENCODE_SET);
                                            break;
                                        } catch (Throwable unused2) {
                                        }
                                        if (string == null) {
                                            string = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        List listM167C = C0014a.m167C(string);
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator it5 = listM167C.iterator();
                                        while (it5.hasNext()) {
                                            Object[] objArr3 = objArr2;
                                            Object next = it5.next();
                                            Iterator it6 = it5;
                                            if (((C0040h) next).f133c) {
                                                arrayList3.add(next);
                                            }
                                            objArr2 = objArr3;
                                            it5 = it6;
                                        }
                                        objArr = objArr2;
                                        int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(arrayList3));
                                        if (iM8438a0 < 16) {
                                            iM8438a0 = 16;
                                        }
                                        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
                                        Iterator it7 = arrayList3.iterator();
                                        while (it7.hasNext()) {
                                            Iterator it8 = it7;
                                            Object next2 = it8.next();
                                            linkedHashMap.put(((C0040h) next2).f131a, next2);
                                            it7 = it8;
                                            arrayList3 = arrayList3;
                                        }
                                        ArrayList<C0040h> arrayList4 = arrayList3;
                                        try {
                                            string2 = sharedPreferencesM8640c.getString("message_block_bindings", HttpUrl.FRAGMENT_ENCODE_SET);
                                            break;
                                        } catch (Throwable unused3) {
                                        }
                                        if (string2 == null) {
                                            string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                        }
                                        List listM189w = C0014a.m189w(string2);
                                        if (AbstractC3149m.m6721t0(string2)) {
                                            try {
                                                string3 = sharedPreferencesM8640c.getString(str13, HttpUrl.FRAGMENT_ENCODE_SET);
                                                break;
                                            } catch (Throwable unused4) {
                                            }
                                            if (string3 == null) {
                                                string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            listM189w = C0014a.m179m(C0014a.m167C(string3));
                                        }
                                        if (listM189w.isEmpty()) {
                                            str = str13;
                                            str6 = str16;
                                        } else {
                                            ArrayList arrayList5 = new ArrayList();
                                            Iterator it9 = listM189w.iterator();
                                            while (it9.hasNext()) {
                                                String str23 = str13;
                                                Object next3 = it9.next();
                                                Iterator it10 = it9;
                                                C0033a c0033a = (C0033a) next3;
                                                c0033a.getClass();
                                                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str7)) {
                                                    str12 = str16;
                                                    zM301b = false;
                                                } else {
                                                    str12 = str16;
                                                    boolean zM3825a = AbstractC1416l.m3825a(c0033a.f104b, "group_member");
                                                    String str24 = c0033a.f105c;
                                                    zM301b = zM3825a ? AbstractC0038f.m301b(str24, str3, str7) : AbstractC0038f.m306g(str24, str3, str7);
                                                }
                                                if (zM301b) {
                                                    arrayList5.add(next3);
                                                }
                                                str13 = str23;
                                                it9 = it10;
                                                str16 = str12;
                                            }
                                            str = str13;
                                            str6 = str16;
                                            if (!arrayList5.isEmpty()) {
                                                ArrayList<C0033a> arrayList6 = new ArrayList();
                                                for (Object obj4 : arrayList5) {
                                                    if (((C0033a) obj4).f107e) {
                                                        arrayList6.add(obj4);
                                                    }
                                                }
                                                if (!arrayList6.isEmpty()) {
                                                    if (arrayList6.isEmpty()) {
                                                        arrayList = new ArrayList();
                                                        for (Object obj5 : arrayList6) {
                                                            if (AbstractC1416l.m3825a(((C0033a) obj5).f108f, "block")) {
                                                                arrayList.add(obj5);
                                                            }
                                                        }
                                                        if (arrayList.isEmpty()) {
                                                            for (C0033a c0033a2 : arrayList) {
                                                                if (c0033a2.f110h && C0037e.m295k(c0033a2, linkedHashMap) && C0037e.m296l(c0033a2.f111i, c0033a2.f112j, c0033a2.f113k, c2530e, weChatMessageM5945k)) {
                                                                    zM296l = true;
                                                                }
                                                            }
                                                            ArrayList arrayList7 = new ArrayList();
                                                            while (r3.hasNext()) {
                                                            }
                                                            ArrayList arrayList8 = new ArrayList();
                                                            it = arrayList7.iterator();
                                                            while (it.hasNext()) {
                                                            }
                                                            ArrayList arrayList9 = new ArrayList();
                                                            it2 = arrayList8.iterator();
                                                            while (it2.hasNext()) {
                                                            }
                                                            HashSet hashSet = new HashSet();
                                                            arrayList2 = new ArrayList();
                                                            while (r2.hasNext()) {
                                                            }
                                                            if (!arrayList2.isEmpty()) {
                                                            }
                                                        } else {
                                                            ArrayList arrayList72 = new ArrayList();
                                                            for (Object obj6 : arrayList) {
                                                                if (!((C0033a) obj6).f110h) {
                                                                    arrayList72.add(obj6);
                                                                }
                                                            }
                                                            ArrayList arrayList82 = new ArrayList();
                                                            it = arrayList72.iterator();
                                                            while (it.hasNext()) {
                                                                AbstractC4171r.m8432h1(arrayList82, ((C0033a) it.next()).f109g);
                                                            }
                                                            ArrayList arrayList92 = new ArrayList();
                                                            it2 = arrayList82.iterator();
                                                            while (it2.hasNext()) {
                                                                C0040h c0040h = (C0040h) linkedHashMap.get((String) it2.next());
                                                                if (c0040h != null) {
                                                                    arrayList92.add(c0040h);
                                                                }
                                                            }
                                                            HashSet hashSet2 = new HashSet();
                                                            arrayList2 = new ArrayList();
                                                            for (Object obj7 : arrayList92) {
                                                                if (hashSet2.add(((C0040h) obj7).f131a)) {
                                                                    arrayList2.add(obj7);
                                                                }
                                                            }
                                                            if (!arrayList2.isEmpty()) {
                                                                for (C0040h c0040h2 : arrayList2) {
                                                                    if (C0037e.m296l(c0040h2.f139i, c0040h2.f140j, c0040h2.f141k, c2530e, weChatMessageM5945k)) {
                                                                        zM296l = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        for (C0033a c0033a3 : arrayList6) {
                                                            if (AbstractC1416l.m3825a(c0033a3.f108f, "exclude") && C0037e.m295k(c0033a3, linkedHashMap)) {
                                                            }
                                                        }
                                                        arrayList = new ArrayList();
                                                        while (r2.hasNext()) {
                                                        }
                                                        if (arrayList.isEmpty()) {
                                                        }
                                                    }
                                                }
                                            }
                                            if (zM296l) {
                                                AtomicInteger atomicInteger = AbstractC5737d.f23377a;
                                                C5738e c5738e = new C5738e(c3742g.f12143a);
                                                if (!c5738e.m10431a("keyword_notify_enable", false) || AbstractC3149m.m6721t0(str3) || AbstractC3149m.m6721t0(str7) || AbstractC3149m.m6721t0(str21) || !c5738e.m10435e(str3)) {
                                                    str10 = str7;
                                                    str8 = str17;
                                                    str9 = str5;
                                                    str11 = str6;
                                                    z10 = false;
                                                } else {
                                                    C2529d c2529d2 = WeChatMessage.Companion;
                                                    long jCurrentTimeMillis2 = j3 > 0 ? j3 * 1000 : System.currentTimeMillis();
                                                    int i11 = c2530e.f8175b;
                                                    long j5 = c2530e.f8177d;
                                                    c2529d2.getClass();
                                                    String str25 = str7;
                                                    WeChatMessage weChatMessageM5945k2 = C2529d.m5945k(str3, str25, str21, jCurrentTimeMillis2, false, i11, j5, str17, str2);
                                                    str8 = str17;
                                                    String strM10424h = AbstractC5737d.m10424h(weChatMessageM5945k2);
                                                    boolean z14 = weChatMessageM5945k2.isGroupChat() || AbstractC3156t.m6733W(str3, "@chatroom", false) || AbstractC3156t.m6733W(str3, "@im.chatroom", false);
                                                    str9 = str5;
                                                    String str26 = str6;
                                                    C2351o c2351o = new C2351o("message_block_precheck", strM10424h, str3, str25, str21, str26, str9, z14, false, null, weChatMessageM5945k2);
                                                    str10 = str25;
                                                    str21 = str21;
                                                    str11 = str26;
                                                    if (z14 || c2351o.m5623j()) {
                                                        z10 = false;
                                                    } else {
                                                        z10 = false;
                                                        if (!AbstractC3156t.m6733W(str3, "@chatroom", false) && !AbstractC3156t.m6733W(str3, "@im.chatroom", false)) {
                                                            z11 = false;
                                                        }
                                                        z12 = (!z14 || c2351o.m5623j() || AbstractC3156t.m6733W(str3, "@chatroom", z10) || AbstractC3156t.m6733W(str3, "@im.chatroom", z10)) ? true : z10;
                                                        strM5614a = c2351o.f7717e;
                                                        if (AbstractC3149m.m6721t0(strM5614a)) {
                                                            strM5614a = c2351o.m5614a();
                                                        }
                                                        strM5614a.getClass();
                                                        strM10426j = AbstractC5737d.m10426j(c2351o, strM5614a);
                                                        if (((AbstractC3149m.m6721t0(strM10426j) || (strM10423g = AbstractC5737d.m10423g(c5738e, c2351o, z12, strM5614a, strM10426j)) == null) ? null : new C5735b(strM10423g, strM10426j, z12)) == null) {
                                                            z13 = true;
                                                        } else if (z11) {
                                                            z13 = true;
                                                            if ((c5738e.m10431a("keyword_notify_at_all", true) && (c2351o.m5627n() || c2351o.m5618e())) || (c5738e.m10431a("keyword_notify_at_me", true) && c2351o.m5620g())) {
                                                            }
                                                        }
                                                        z10 = z13;
                                                    }
                                                    z11 = true;
                                                    if (z14) {
                                                        strM5614a = c2351o.f7717e;
                                                        if (AbstractC3149m.m6721t0(strM5614a)) {
                                                        }
                                                        strM5614a.getClass();
                                                        strM10426j = AbstractC5737d.m10426j(c2351o, strM5614a);
                                                        if (AbstractC3149m.m6721t0(strM10426j)) {
                                                            if (((AbstractC3149m.m6721t0(strM10426j) || (strM10423g = AbstractC5737d.m10423g(c5738e, c2351o, z12, strM5614a, strM10426j)) == null) ? null : new C5735b(strM10423g, strM10426j, z12)) == null) {
                                                            }
                                                            z10 = z13;
                                                        }
                                                    }
                                                }
                                                if (!z10) {
                                                    try {
                                                        c3742g.f12148f.m2715b(new C1086f(str11, str10, str3, str21, String.valueOf(c2530e.f8175b), c2530e.f8176c, c2530e.f8177d, str8, str2, str9));
                                                        c3959f2 = C3967n.f12976a;
                                                    } catch (Throwable th3) {
                                                        c3959f2 = new C3959f(th3);
                                                    }
                                                    Throwable thM8182b = C3960g.m8182b(c3959f2);
                                                    if (thM8182b != null) {
                                                        c0037e.m7750e("屏蔽消息派发内部事件失败", thM8182b);
                                                    }
                                                    methodHookParam.setResult((Object) null);
                                                    break;
                                                }
                                            } else {
                                                objArr2 = objArr;
                                                str13 = str;
                                                it3 = it4;
                                                str14 = str4;
                                                obj = null;
                                            }
                                        }
                                        if (weChatMessageM5945k.isOfficialAccount()) {
                                            try {
                                                string6 = sharedPreferencesM8640c.getString("message_block_default_official", HttpUrl.FRAGMENT_ENCODE_SET);
                                                break;
                                            } catch (Throwable unused5) {
                                            }
                                            if (string6 == null) {
                                                string6 = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            c0034bM190x = C0014a.m190x(string6, false, true);
                                        } else if (AbstractC3156t.m6733W(str3, "@chatroom", false) || AbstractC3156t.m6733W(str3, "@im.chatroom", false)) {
                                            try {
                                                string4 = sharedPreferencesM8640c.getString("message_block_default_group", HttpUrl.FRAGMENT_ENCODE_SET);
                                                break;
                                            } catch (Throwable unused6) {
                                            }
                                            if (string4 == null) {
                                                string4 = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            c0034bM190x = C0014a.m190x(string4, true, false);
                                        } else {
                                            try {
                                                string5 = sharedPreferencesM8640c.getString("message_block_default_private", HttpUrl.FRAGMENT_ENCODE_SET);
                                                break;
                                            } catch (Throwable unused7) {
                                            }
                                            if (string5 == null) {
                                                string5 = HttpUrl.FRAGMENT_ENCODE_SET;
                                            }
                                            c0034bM190x = C0014a.m190x(string5, false, false);
                                        }
                                        if (c0034bM190x.f117d) {
                                            if (c0034bM190x.f119f) {
                                                zM296l = C0037e.m296l(c0034bM190x.f120g, c0034bM190x.f121h, c0034bM190x.f122i, c2530e, weChatMessageM5945k);
                                            } else {
                                                Set set = c0034bM190x.f118e;
                                                ArrayList arrayList10 = new ArrayList();
                                                Iterator it11 = set.iterator();
                                                while (it11.hasNext()) {
                                                    C0040h c0040h3 = (C0040h) linkedHashMap.get((String) it11.next());
                                                    if (c0040h3 != null) {
                                                        arrayList10.add(c0040h3);
                                                    }
                                                }
                                                HashSet hashSet3 = new HashSet();
                                                ArrayList<C0040h> arrayList11 = new ArrayList();
                                                for (Object obj8 : arrayList10) {
                                                    if (hashSet3.add(((C0040h) obj8).f131a)) {
                                                        arrayList11.add(obj8);
                                                    }
                                                }
                                                if (!arrayList11.isEmpty()) {
                                                    for (C0040h c0040h4 : arrayList11) {
                                                        if (C0037e.m296l(c0040h4.f139i, c0040h4.f140j, c0040h4.f141k, c2530e, weChatMessageM5945k)) {
                                                            zM296l = true;
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (!arrayList4.isEmpty()) {
                                            if (!arrayList4.isEmpty()) {
                                                for (C0040h c0040h5 : arrayList4) {
                                                    if (AbstractC0038f.m305f(c0040h5.f137g, str3, str7) || AbstractC0038f.m300a(c0040h5.f138h, str3, str7)) {
                                                    }
                                                }
                                                if (!arrayList4.isEmpty()) {
                                                }
                                            } else if (!arrayList4.isEmpty()) {
                                                for (C0040h c0040h6 : arrayList4) {
                                                    if ((c0040h6.f134d == 1 || AbstractC0038f.m305f(c0040h6.f135e, str3, str7) || AbstractC0038f.m300a(c0040h6.f136f, str3, str7)) ? C0037e.m296l(c0040h6.f139i, c0040h6.f140j, c0040h6.f141k, c2530e, weChatMessageM5945k) : false) {
                                                        zM296l = true;
                                                    }
                                                }
                                            }
                                        }
                                        if (zM296l) {
                                        }
                                    }
                                    zM296l = false;
                                    if (zM296l) {
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            case 1:
                methodHookParam.getClass();
                C0851c c0851c = (C0851c) obj2;
                if (((SharedPreferences) c0851c.f2603b).getBoolean("enable", false)) {
                    String string7 = ((SharedPreferences) c0851c.f2603b).getString("sdk_id", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string7 == null) {
                        string7 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String string8 = AbstractC3149m.m6703R0(string7).toString();
                    String string9 = ((SharedPreferences) c0851c.f2603b).getString("sdk_app_name", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string9 != null) {
                        strM6543c = string9;
                    }
                    String string10 = AbstractC3149m.m6703R0(strM6543c).toString();
                    if (!AbstractC3149m.m6721t0(string8) && !AbstractC3149m.m6721t0(string10)) {
                        KavaReflector.invoke((Method) r72, methodHookParam.thisObject, string8);
                        KavaReflector.invoke((Method) obj3, methodHookParam.thisObject, string10);
                        break;
                    }
                }
                break;
            case 2:
                ThreadLocal threadLocal = ((C3080d) obj3).f9955e;
                threadLocal.set(Integer.valueOf(((Integer) threadLocal.get()).intValue() + 1));
                String str27 = (String) obj2;
                Object obj9 = methodHookParam.thisObject;
                Object[] objArr4 = methodHookParam.args;
                if (objArr4 != null) {
                    if (("insert".equals(str27) || "update".equals(str27)) && (contentValuesM6542a = C3080d.m6542a(objArr4)) != null) {
                        String strM6544h = C3080d.m6544h(objArr4);
                        if (!TextUtils.isEmpty(strM6544h)) {
                            String lowerCase = strM6544h.toLowerCase();
                            if ("message".equals(lowerCase) || lowerCase.startsWith("message_") || lowerCase.endsWith("_message")) {
                                if ((contentValuesM6542a.containsKey("msgSource") || contentValuesM6542a.containsKey("lvbuffer") || contentValuesM6542a.containsKey("msgId") || contentValuesM6542a.containsKey("msgSvrId")) && contentValuesM6542a.containsKey("msgSource")) {
                                    if (TextUtils.isEmpty("msgSource") || !contentValuesM6542a.containsKey("msgSource")) {
                                        strValueOf = HttpUrl.FRAGMENT_ENCODE_SET;
                                    } else {
                                        try {
                                            strValueOf = contentValuesM6542a.getAsString("msgSource");
                                            if (strValueOf == null) {
                                            }
                                        } catch (Throwable unused8) {
                                            Object obj10 = contentValuesM6542a.get("msgSource");
                                            if (obj10 != null) {
                                                strValueOf = String.valueOf(obj10);
                                            }
                                        }
                                    }
                                    if (TextUtils.isEmpty(strValueOf)) {
                                        if (contentValuesM6542a.containsKey("lvbuffer")) {
                                            try {
                                                asByteArray = contentValuesM6542a.getAsByteArray("lvbuffer");
                                            } catch (Throwable unused9) {
                                            }
                                            if (asByteArray == null || asByteArray.length <= 0) {
                                                try {
                                                    Object obj11 = contentValuesM6542a.get("lvbuffer");
                                                    if (obj11 != null) {
                                                        strM6543c = C3080d.m6543c(String.valueOf(obj11));
                                                    }
                                                    break;
                                                } catch (Throwable unused10) {
                                                }
                                            } else {
                                                String strM6543c2 = C3080d.m6543c(new String(asByteArray, StandardCharsets.UTF_8));
                                                if (!TextUtils.isEmpty(strM6543c2)) {
                                                    strM6543c = strM6543c2;
                                                }
                                            }
                                        }
                                        if (!TextUtils.isEmpty(strM6543c)) {
                                            contentValuesM6542a.put("msgSource", strM6543c);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 3:
                methodHookParam.getClass();
                C3943c c3943c = (C3943c) r72;
                C3742g c3742g2 = (C3742g) obj2;
                if (C3943c.m8146k(c3943c, c3742g2) && C3943c.m8137C(c3742g2)) {
                    Object[] objArr5 = methodHookParam.args;
                    Object objM8366C03 = objArr5 != null ? AbstractC4165l.m8366C0(0, objArr5) : null;
                    Number number = objM8366C03 instanceof Number ? (Number) objM8366C03 : null;
                    if (number != null) {
                        long jLongValue = number.longValue();
                        Object[] objArr6 = methodHookParam.args;
                        if (objArr6 != null && (objM8366C0 = AbstractC4165l.m8366C0(1, objArr6)) != null && C3943c.m8136B(C3943c.m8140I(objM8366C0))) {
                            if (c3943c.f12929g.contains(Long.valueOf(jLongValue)) || C3943c.m8138G(objM8366C0)) {
                                c3943c.m8160F(jLongValue);
                                Class<?> returnType = ((Method) obj3).getReturnType();
                                if (AbstractC1416l.m3825a(returnType, cls)) {
                                    obj = 0;
                                } else if (AbstractC1416l.m3825a(returnType, Boolean.TYPE)) {
                                    obj = Boolean.FALSE;
                                }
                                methodHookParam.setResult(obj);
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                methodHookParam.getClass();
                Object[] objArr7 = methodHookParam.args;
                objArr7.getClass();
                Object objM8366C04 = AbstractC4165l.m8366C0(1, objArr7);
                Intent intent = objM8366C04 instanceof Intent ? (Intent) objM8366C04 : null;
                try {
                    Method declaredMethod = ((ClassLoader) obj3).loadClass("com.tencent.tinker.loader.shareutil.ShareIntentUtil").getDeclaredMethod("setIntentReturnCode", Intent.class, cls);
                    declaredMethod.setAccessible(true);
                    if (intent != null) {
                        declaredMethod.invoke(null, intent, -1);
                    }
                    break;
                } catch (Throwable unused11) {
                }
                methodHookParam.setResult(C4330d.m8751a((C4330d) obj2, (Method) r72));
                break;
        }
    }

    public /* synthetic */ C0036d(Object obj, Method method, Object obj2, int i9) {
        this.f126a = i9;
        this.f127b = obj;
        this.f128c = method;
        this.f129d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0036d(C3080d c3080d, String str, Method method) {
        super(-10000);
        this.f126a = 2;
        this.f129d = c3080d;
        this.f127b = str;
        this.f128c = method;
    }

    public C0036d(C3943c c3943c, C3742g c3742g, Method method) {
        this.f126a = 3;
        this.f128c = c3943c;
        this.f127b = c3742g;
        this.f129d = method;
    }
}
