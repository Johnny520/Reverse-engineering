package p259r9;

import ac.AbstractC0063p;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.system.Os;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import bi.AbstractC0316d;
import bi.AbstractC0325m;
import bi.C0314b;
import bi.C0324l;
import bsh.C0353j;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import ke.InterfaceC2396e;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p015b0.AbstractC0149o;
import p015b0.C0136d0;
import p015b0.C0152r;
import p016b1.C0168h;
import p017b2.AbstractC0170b;
import p021b6.C0200h;
import p025bc.AbstractC0255e;
import p036c9.C0479q0;
import p040d0.C0646c;
import p054dg.AbstractC0793l;
import p061e5.C0826a;
import p068eh.AbstractC0921a;
import p071f1.C0993b;
import p071f1.C1003g;
import p071f1.C1005h;
import p071f1.C1034w;
import p080fb.C1107c;
import p080fb.C1165q1;
import p080fb.C1169r1;
import p080fb.C1173s1;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.utils.KavaReflector;
import p101h1.C1565b;
import p117i0.AbstractC1869p1;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p119i2.C1941n0;
import p120i3.AbstractC1956a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p172lg.C2561a;
import p172lg.C2562b;
import p172lg.C2564d;
import p178m3.AbstractC2777c;
import p187n.C2857k;
import p189n1.InterfaceC2862a;
import p195n7.C2907f;
import p211o9.C3104q;
import p211o9.C3105r;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p222p.AbstractC3208d;
import p222p.C3216f1;
import p222p.C3246p1;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3873c;
import p266s0.C3874d;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p280t2.C4095k;
import p281t3.AbstractC4106c;
import p288tb.C4143c;
import p293u2.C4236f;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4318n;
import p304uf.C4329c;
import p304uf.C4331e;
import p304uf.C4335i;
import p321w.C4638u;
import p332wb.AbstractC4855en;
import p332wb.C4913gf;
import p332wb.C4960ht;
import p339x1.AbstractC5618k;
import p339x1.C5639r;
import p345x8.C5726s;
import p354xh.AbstractC5837v;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.C5956y1;
import p374z2.AbstractFutureC6081g;
import p374z2.C6077c;
import p374z2.C6080f;
import sh.AbstractC3990b;
import sh.AbstractC4045s;
import sh.C3986a;
import sh.C4027m;
import sh.C4048t;
import sh.EnumC4010g0;
import tf.AbstractC4160g;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: r9.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3754e0 implements InterfaceC2396e {

    /* JADX INFO: renamed from: g */
    public static C1003g f12221g;

    /* JADX INFO: renamed from: h */
    public static C0993b f12222h;

    /* JADX INFO: renamed from: i */
    public static C1565b f12223i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m7858A(List list) throws JSONException {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C3105r c3105r = (C3105r) obj;
            if ((AbstractC3149m.m6721t0(c3105r.f10071a) || AbstractC3149m.m6721t0(c3105r.f10073c)) ? false : true) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<C3105r> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(AbstractC3149m.m6703R0(((C3105r) obj2).f10071a).toString())) {
                arrayList2.add(obj2);
            }
        }
        for (C3105r c3105r2 : arrayList2) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("groupId", AbstractC3149m.m6703R0(c3105r2.f10071a).toString());
            jSONObject.put("label", c3105r2.f10072b);
            jSONObject.put("templateId", AbstractC3149m.m6703R0(c3105r2.f10073c).toString());
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static String m7859B(List list) throws JSONException {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5726s c5726s = (C5726s) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", c5726s.f23312a);
            jSONObject.put("mode", c5726s.f23313b);
            jSONObject.put("content", c5726s.f23314c);
            jSONObject.put("delayMs", m7911s(c5726s.f23315d, 0L, 600000L));
            jSONObject.put("randomDelay", c5726s.f23316e);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static JSONArray m7860C(Set set) {
        set.getClass();
        JSONArray jSONArray = new JSONArray();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(set2));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)).iterator();
        while (it2.hasNext()) {
            jSONArray.put((String) it2.next());
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static String m7861D(ArrayList arrayList) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3104q c3104q = (C3104q) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", c3104q.f10045a);
            jSONObject.put("name", c3104q.f10046b);
            jSONObject.put("enabled", c3104q.f10047c);
            jSONObject.put("joinEnabled", c3104q.f10048d);
            jSONObject.put("leftEnabled", c3104q.f10049e);
            jSONObject.put("promptType", m7873P(c3104q.f10050f));
            jSONObject.put("bothOrder", c3104q.f10051g.equals("card_first") ? "card_first" : "text_first");
            jSONObject.put("joinText", c3104q.f10052h);
            jSONObject.put("leftText", c3104q.f10053i);
            jSONObject.put("joinCardTitle", c3104q.f10054j);
            jSONObject.put("joinCardDesc", c3104q.f10055k);
            jSONObject.put("leftCardTitle", c3104q.f10056l);
            jSONObject.put("leftCardDesc", c3104q.f10057m);
            jSONObject.put("mediaMode", m7871N(c3104q.f10058n));
            jSONObject.put("mediaOrder", m7872O(c3104q.f10059o));
            jSONObject.put("mediaSequence", c3104q.f10060p);
            jSONObject.put("joinImages", c3104q.f10061q);
            jSONObject.put("leftImages", c3104q.f10062r);
            jSONObject.put("joinVoices", c3104q.f10063s);
            jSONObject.put("leftVoices", c3104q.f10064t);
            jSONObject.put("joinEmojis", c3104q.f10065u);
            jSONObject.put("leftEmojis", c3104q.f10066v);
            jSONObject.put("joinVideos", c3104q.f10067w);
            jSONObject.put("leftVideos", c3104q.f10068x);
            jSONObject.put("joinFiles", c3104q.f10069y);
            jSONObject.put("leftFiles", c3104q.f10070z);
            jSONObject.put("joinFavorites", c3104q.f10035A);
            jSONObject.put("leftFavorites", c3104q.f10036B);
            jSONObject.put("delayMode", c3104q.f10037C.equals("custom") ? "custom" : "global");
            int i9 = c3104q.f10038D;
            int i10 = 0;
            if (i9 < 0) {
                i9 = 0;
            }
            jSONObject.put("promptDelayMs", i9);
            int i11 = c3104q.f10039E;
            if (i11 < 0) {
                i11 = 0;
            }
            jSONObject.put("imageDelayMs", i11);
            int i12 = c3104q.f10040F;
            if (i12 < 0) {
                i12 = 0;
            }
            jSONObject.put("voiceDelayMs", i12);
            int i13 = c3104q.f10041G;
            if (i13 < 0) {
                i13 = 0;
            }
            jSONObject.put("emojiDelayMs", i13);
            int i14 = c3104q.f10042H;
            if (i14 < 0) {
                i14 = 0;
            }
            jSONObject.put("videoDelayMs", i14);
            int i15 = c3104q.f10043I;
            if (i15 < 0) {
                i15 = 0;
            }
            jSONObject.put("fileDelayMs", i15);
            int i16 = c3104q.f10044J;
            if (i16 >= 0) {
                i10 = i16;
            }
            jSONObject.put("favoriteDelayMs", i10);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static String m7862E(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isError", true);
        jSONObject.put("message", str);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static String m7863F(int i9, int i10) {
        StringBuilder sb2 = new StringBuilder();
        if (m7864G(i9, 1)) {
            sb2.append("public ");
        }
        if (m7864G(i9, 2)) {
            sb2.append("private ");
        }
        if (m7864G(i9, 4)) {
            sb2.append("protected ");
        }
        if (m7864G(i9, 8)) {
            sb2.append("static ");
        }
        if (m7864G(i9, 16)) {
            sb2.append("final ");
        }
        if (m7864G(i9, 1024)) {
            sb2.append("abstract ");
        }
        if (m7864G(i9, Opcodes.ACC_NATIVE)) {
            sb2.append("native ");
        }
        int iM8279b = AbstractC4106c.m8279b(i10);
        if (iM8279b == 0) {
            if (m7864G(i9, 32768)) {
                sb2.append("module ");
            }
            if (m7864G(i9, Opcodes.ACC_STRICT)) {
                sb2.append("strict ");
            }
            if (m7864G(i9, 32)) {
                sb2.append("super ");
            }
            if (m7864G(i9, 16384)) {
                sb2.append("enum ");
            }
            if (m7864G(i9, Opcodes.ASM4)) {
                sb2.append("data ");
            }
        } else if (iM8279b == 1) {
            if (m7864G(i9, 64)) {
                sb2.append("volatile ");
            }
            if (m7864G(i9, 128)) {
                sb2.append("transient ");
            }
        } else if (iM8279b == 2) {
            if (m7864G(i9, 32)) {
                sb2.append("synchronized ");
            }
            if (m7864G(i9, 64)) {
                sb2.append("bridge ");
            }
            if (m7864G(i9, 128)) {
                sb2.append("varargs ");
            }
        }
        if (m7864G(i9, 4096)) {
            sb2.append("synthetic ");
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static boolean m7864G(int i9, int i10) {
        return (i9 & i10) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m7865H(String str, String str2) {
        int iIntValue;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Integer numM7878U = m7878U(str);
        if (numM7878U == null) {
            return true;
        }
        int iIntValue2 = numM7878U.intValue();
        Integer numM7878U2 = m7878U(str2);
        if (numM7878U2 == null || iIntValue2 == (iIntValue = numM7878U2.intValue())) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i9 = calendar.get(13) + (calendar.get(12) * 60) + (calendar.get(11) * 3600);
        return iIntValue2 < iIntValue ? iIntValue2 <= i9 && i9 < iIntValue : i9 >= iIntValue2 || i9 < iIntValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static String m7866I(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb2 = new StringBuilder((objArr.length * 16) + str.length());
        int i9 = 0;
        int i10 = 0;
        while (i9 < objArr.length && (iIndexOf = str.indexOf("%s", i10)) != -1) {
            sb2.append((CharSequence) str, i10, iIndexOf);
            sb2.append(m7867J(objArr[i9]));
            i10 = iIndexOf + 2;
            i9++;
        }
        sb2.append((CharSequence) str, i10, str.length());
        if (i9 < objArr.length) {
            String str2 = " [";
            while (i9 < objArr.length) {
                sb2.append(str2);
                sb2.append(m7867J(objArr[i9]));
                i9++;
                str2 = ", ";
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static String m7867J(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e6) {
            String str = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
            Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for ".concat(str), (Throwable) e6);
            StringBuilder sbM1026o = AbstractC0255e.m1026o("<", str, " threw ");
            sbM1026o.append(e6.getClass().getName());
            sbM1026o.append(">");
            return sbM1026o.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0112  */
    /* JADX INFO: renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m7868K(Context context, String str, ArrayList arrayList) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArrayOptJSONArray2;
        int length;
        int i9;
        String strOptString;
        JSONArray jSONArrayOptJSONArray3;
        String strOptString2;
        str.getClass();
        try {
            c3959f = new JSONArray(m7889f0(context, arrayList));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = new JSONArray();
        }
        JSONArray jSONArray = (JSONArray) c3959f;
        if (jSONArray.length() == 0) {
            try {
                c3959f2 = new JSONArray(str);
            } catch (Throwable th3) {
                c3959f2 = new C3959f(th3);
            }
            if (c3959f2 instanceof C3959f) {
                c3959f2 = null;
            }
            JSONArray jSONArray2 = (JSONArray) c3959f2;
            if (jSONArray2 != null) {
                if (!(jSONArray2.length() > 0)) {
                    jSONArray2 = null;
                }
                if (jSONArray2 != null) {
                    string = jSONArray2.toString();
                }
            }
            return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
        }
        C4335i c4335i = new C4335i();
        int length2 = jSONArray.length();
        for (int i10 = 0; i10 < length2; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject.optJSONArray("tool_calls")) != null) {
                int length3 = jSONArrayOptJSONArray3.length();
                for (int i11 = 0; i11 < length3; i11++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray3.optJSONObject(i11);
                    if (jSONObjectOptJSONObject2 != null && (strOptString2 = jSONObjectOptJSONObject2.optString("id")) != null) {
                        if (AbstractC3149m.m6721t0(strOptString2)) {
                            strOptString2 = null;
                        }
                        if (strOptString2 != null) {
                            c4335i.add(strOptString2);
                        }
                    }
                }
            }
        }
        C4335i c4335iM415h = AbstractC0063p.m415h(c4335i);
        JSONArray jSONArray3 = new JSONArray();
        try {
            c3959f3 = new JSONArray(str);
        } catch (Throwable th4) {
            c3959f3 = new C3959f(th4);
        }
        if (C3960g.m8182b(c3959f3) != null) {
            c3959f3 = new JSONArray();
        }
        JSONArray jSONArray4 = (JSONArray) c3959f3;
        int i12 = 0;
        while (i12 < jSONArray4.length()) {
            JSONObject jSONObjectOptJSONObject3 = jSONArray4.optJSONObject(i12);
            if (jSONObjectOptJSONObject3 == null) {
                jSONArrayOptJSONArray2 = null;
            } else {
                JSONObject jSONObject = AbstractC1416l.m3825a(jSONObjectOptJSONObject3.optString("role"), "assistant") ? jSONObjectOptJSONObject3 : null;
                if (jSONObject != null) {
                    jSONArrayOptJSONArray2 = jSONObject.optJSONArray("tool_calls");
                }
            }
            if (jSONArrayOptJSONArray2 == null) {
                if (jSONObjectOptJSONObject3 != null) {
                    jSONArray3.put(jSONObjectOptJSONObject3);
                }
                i12++;
            } else {
                C4335i c4335i2 = new C4335i();
                int length4 = jSONArrayOptJSONArray2.length();
                for (int i13 = 0; i13 < length4; i13++) {
                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray2.optJSONObject(i13);
                    if (jSONObjectOptJSONObject4 != null && (strOptString = jSONObjectOptJSONObject4.optString("id")) != null) {
                        if (AbstractC3149m.m6721t0(strOptString)) {
                            strOptString = null;
                        }
                        if (strOptString != null) {
                            c4335i2.add(strOptString);
                        }
                    }
                }
                C4335i c4335iM415h2 = AbstractC0063p.m415h(c4335i2);
                int length5 = jSONArrayOptJSONArray2.length() + 1;
                if (c4335iM415h2 == null || !c4335iM415h2.f14493g.isEmpty()) {
                    Object it = c4335iM415h2.iterator();
                    while (((AbstractC2777c) it).hasNext()) {
                        if (c4335iM415h.f14493g.containsKey((String) ((C4331e) it).next())) {
                            break;
                        }
                    }
                    length = jSONArray4.length() - i12;
                    if (length5 <= length) {
                        length = length5;
                    }
                    for (i9 = 0; i9 < length; i9++) {
                        JSONObject jSONObjectOptJSONObject5 = jSONArray4.optJSONObject(i9 + i12);
                        if (jSONObjectOptJSONObject5 != null) {
                            jSONArray3.put(jSONObjectOptJSONObject5);
                        }
                    }
                    i12 += length5;
                } else {
                    length = jSONArray4.length() - i12;
                    if (length5 <= length) {
                    }
                    while (i9 < length) {
                    }
                    i12 += length5;
                }
            }
        }
        int length6 = jSONArray.length();
        for (int i14 = 0; i14 < length6; i14++) {
            JSONObject jSONObjectOptJSONObject6 = jSONArray.optJSONObject(i14);
            if (jSONObjectOptJSONObject6 != null) {
                jSONArray3.put(jSONObjectOptJSONObject6);
            }
        }
        while (m7870M(jSONArray3) > 1 && jSONArray3.toString().length() > 120000) {
            JSONObject jSONObjectOptJSONObject7 = jSONArray3.optJSONObject(0);
            int length7 = (!AbstractC1416l.m3825a(jSONObjectOptJSONObject7 != null ? jSONObjectOptJSONObject7.optString("role") : null, "assistant") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject7.optJSONArray("tool_calls")) == null) ? 0 : jSONArrayOptJSONArray.length();
            jSONArray3.remove(0);
            int length8 = jSONArray3.length();
            if (length7 > length8) {
                length7 = length8;
            }
            for (int i15 = 0; i15 < length7; i15++) {
                jSONArray3.remove(0);
            }
        }
        if (!(jSONArray3.length() > 0)) {
            jSONArray3 = null;
        }
        string = jSONArray3 != null ? jSONArray3.toString() : null;
        return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static final String m7869L(Object obj) {
        obj.getClass();
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "getTimeLine", new Object[0]);
        if (objInvokeMethod == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String[] strArr = {"ContentDesc", "contentDesc", "desc", "description"};
        for (int i9 = 0; i9 < 4; i9++) {
            Object field = KavaReflector.readField(objInvokeMethod, strArr[i9]);
            String string = field != null ? field.toString() : null;
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3149m.m6721t0(string)) {
                return string;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static int m7870M(JSONArray jSONArray) {
        int length = jSONArray.length();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            if (AbstractC1416l.m3825a(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("role") : null, "assistant")) {
                i9++;
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static String m7871N(String str) {
        str.getClass();
        return str.equals("custom") ? "custom" : str.equals("none") ? "none" : "global";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static String m7872O(String str) {
        str.getClass();
        int iHashCode = str.hashCode();
        return (iHashCode == -1392885889 ? str.equals("before") : iHashCode == 3387192 ? str.equals("none") : iHashCode == 92734940 && str.equals("after")) ? str : "none";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f A[RETURN] */
    /* JADX INFO: renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m7873P(String str) {
        str.getClass();
        switch (str.hashCode()) {
            case -1243020381:
                return !str.equals("global") ? WeChatSnsPost.TYPE_TEXT : str;
            case 3029889:
                if (!str.equals("both")) {
                }
                break;
            case 3046160:
                if (!str.equals(WeChatSnsPost.TYPE_CARD)) {
                }
                break;
            case 3556653:
                if (!str.equals(WeChatSnsPost.TYPE_TEXT)) {
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static String m7874Q(int i9, int i10, String str, String str2, int i11) throws JSONException {
        int i12 = i10 + i9;
        int length = str2.length();
        if (i12 > length) {
            i12 = length;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("handle", str);
        jSONObject.put("offset", i9);
        jSONObject.put("totalChars", i11);
        jSONObject.put("content", str2.substring(i9, i12));
        jSONObject.put("truncated", i12 < i11);
        if (i12 < i11) {
            jSONObject.put("nextOffset", i12);
        }
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static List m7875R(String str) {
        if (!AbstractC3149m.m6721t0(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("groupId");
                        strOptString.getClass();
                        String string = AbstractC3149m.m6703R0(strOptString).toString();
                        String strOptString2 = jSONObjectOptJSONObject.optString("templateId");
                        strOptString2.getClass();
                        String string2 = AbstractC3149m.m6703R0(strOptString2).toString();
                        if (string.length() != 0 && string2.length() != 0) {
                            String strOptString3 = jSONObjectOptJSONObject.optString("label");
                            if (AbstractC3149m.m6721t0(strOptString3)) {
                                strOptString3 = string;
                            }
                            linkedHashMap.put(string, new C3105r(string, strOptString3, string2));
                        }
                    }
                }
                Collection collectionValues = linkedHashMap.values();
                collectionValues.getClass();
                return AbstractC4166m.m8407P1(collectionValues);
            } catch (Throwable unused) {
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static final Set m7876S(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{',', '|', ';', '\n', 65292, 65307}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return AbstractC4166m.m8412U1(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static final Set m7877T(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{',', '|', ';', '\n', 65292, 65307}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            String string = AbstractC3149m.m6703R0((String) it.next()).toString();
            Locale locale = Locale.ROOT;
            locale.getClass();
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            arrayList.add(lowerCase);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return AbstractC4166m.m8412U1(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static final Integer m7878U(String str) {
        Integer numM6742f0;
        Integer numM6741e0;
        int iIntValue = 0;
        List listM6691F0 = AbstractC3149m.m6691F0(AbstractC3149m.m6703R0(str).toString(), new char[]{':'}, 6);
        int size = listM6691F0.size();
        if (2 > size || size >= 4 || (numM6742f0 = AbstractC3156t.m6742f0((String) listM6691F0.get(0))) == null) {
            return null;
        }
        int iIntValue2 = numM6742f0.intValue();
        Integer numM6742f02 = AbstractC3156t.m6742f0((String) listM6691F0.get(1));
        if (numM6742f02 == null) {
            return null;
        }
        int iIntValue3 = numM6742f02.intValue();
        String str2 = (String) AbstractC4166m.m8425w1(2, listM6691F0);
        if (str2 != null && (numM6741e0 = AbstractC3156t.m6741e0(10, str2)) != null) {
            iIntValue = numM6741e0.intValue();
        }
        if (iIntValue2 < 0 || iIntValue2 >= 24 || iIntValue3 < 0 || iIntValue3 >= 60 || iIntValue < 0 || iIntValue >= 60) {
            return null;
        }
        return Integer.valueOf((iIntValue3 * 60) + (iIntValue2 * 3600) + iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:7:0x000e, B:9:0x001f, B:12:0x0028, B:14:0x002e, B:27:0x0058, B:29:0x0064, B:30:0x007c), top: B:39:0x000e }] */
    /* JADX INFO: renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m7879V(String str) {
        Object c3959f;
        C4173t c4173t = C4173t.f13710g;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return c4173t;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null) {
                    int iOptInt = jSONObjectOptJSONObject.optInt("mode", 0);
                    String strOptString = jSONObjectOptJSONObject.optString("content", HttpUrl.FRAGMENT_ENCODE_SET);
                    strOptString.getClass();
                    if (!AbstractC3149m.m6721t0(strOptString)) {
                        String strOptString2 = jSONObjectOptJSONObject.optString("id");
                        if (AbstractC3149m.m6721t0(strOptString2)) {
                            strOptString2 = System.currentTimeMillis() + "_" + i9;
                        }
                        c4329cM7E.add(new C5726s(strOptString2, iOptInt, strOptString, m7911s(jSONObjectOptJSONObject.optLong("delayMs", 0L), 0L, 600000L), jSONObjectOptJSONObject.optBoolean("randomDelay", false)));
                    } else if (!(iOptInt == 10 || iOptInt == 11 || iOptInt == 12)) {
                    }
                }
            }
            c3959f = AbstractC0000a.m90t(c4329cM7E);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4173t;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static Set m7880W(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C4175v.f13712g;
        }
        C4335i c4335i = new C4335i();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            String strOptString = jSONArray.optString(i9);
            strOptString.getClass();
            String string = AbstractC3149m.m6703R0(strOptString).toString();
            if (string.length() > 0) {
                c4335i.add(string);
            }
        }
        return AbstractC0063p.m415h(c4335i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static List m7881X(String str) {
        if (!AbstractC3149m.m6721t0(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("id");
                        if (AbstractC3149m.m6721t0(strOptString)) {
                            strOptString = System.currentTimeMillis() + "_" + i9;
                        }
                        String str2 = strOptString;
                        String strOptString2 = jSONObjectOptJSONObject.optString("name");
                        if (AbstractC3149m.m6721t0(strOptString2)) {
                            strOptString2 = "模板 " + (i9 + 1);
                        }
                        String str3 = strOptString2;
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", true);
                        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("joinEnabled", true);
                        boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("leftEnabled", true);
                        String strOptString3 = jSONObjectOptJSONObject.optString("promptType", WeChatSnsPost.TYPE_TEXT);
                        strOptString3.getClass();
                        String strM7873P = m7873P(strOptString3);
                        String strOptString4 = jSONObjectOptJSONObject.optString("bothOrder", "text_first");
                        strOptString4.getClass();
                        String str4 = strOptString4.equals("card_first") ? "card_first" : "text_first";
                        String strOptString5 = jSONObjectOptJSONObject.optString("joinText", "[AtWx=%userWxid%]\n欢迎进群\n时间：%time%\n群昵称：%groupName%\n进群者微信昵称：%userName%\n进群者群内昵称：%groupNickname%\n进群者ID：%userWxid%");
                        strOptString5.getClass();
                        String strOptString6 = jSONObjectOptJSONObject.optString("leftText", "退群通知：\n时间：%time%\n群昵称：%groupName%\n退群者微信昵称：%userName%\n退群者群内昵称：%groupNickname%\n退群者ID：%userWxid%");
                        strOptString6.getClass();
                        String strOptString7 = jSONObjectOptJSONObject.optString("joinCardTitle", "欢迎：%userName%");
                        strOptString7.getClass();
                        String strOptString8 = jSONObjectOptJSONObject.optString("joinCardDesc", "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%");
                        strOptString8.getClass();
                        String strOptString9 = jSONObjectOptJSONObject.optString("leftCardTitle", "离群：%userName%");
                        strOptString9.getClass();
                        String strOptString10 = jSONObjectOptJSONObject.optString("leftCardDesc", "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%");
                        strOptString10.getClass();
                        String strOptString11 = jSONObjectOptJSONObject.optString("mediaMode", "global");
                        strOptString11.getClass();
                        String strM7871N = m7871N(strOptString11);
                        String strOptString12 = jSONObjectOptJSONObject.optString("mediaOrder", "none");
                        strOptString12.getClass();
                        String strM7872O = m7872O(strOptString12);
                        String strOptString13 = jSONObjectOptJSONObject.optString("mediaSequence", "image,voice,emoji,video,file,favorite");
                        strOptString13.getClass();
                        String strOptString14 = jSONObjectOptJSONObject.optString("joinImages");
                        strOptString14.getClass();
                        String strOptString15 = jSONObjectOptJSONObject.optString("leftImages");
                        strOptString15.getClass();
                        String strOptString16 = jSONObjectOptJSONObject.optString("joinVoices");
                        strOptString16.getClass();
                        String strOptString17 = jSONObjectOptJSONObject.optString("leftVoices");
                        strOptString17.getClass();
                        String strOptString18 = jSONObjectOptJSONObject.optString("joinEmojis");
                        strOptString18.getClass();
                        String strOptString19 = jSONObjectOptJSONObject.optString("leftEmojis");
                        strOptString19.getClass();
                        String strOptString20 = jSONObjectOptJSONObject.optString("joinVideos");
                        strOptString20.getClass();
                        String strOptString21 = jSONObjectOptJSONObject.optString("leftVideos");
                        strOptString21.getClass();
                        String strOptString22 = jSONObjectOptJSONObject.optString("joinFiles");
                        strOptString22.getClass();
                        String strOptString23 = jSONObjectOptJSONObject.optString("leftFiles");
                        strOptString23.getClass();
                        String strOptString24 = jSONObjectOptJSONObject.optString("joinFavorites");
                        strOptString24.getClass();
                        String strOptString25 = jSONObjectOptJSONObject.optString("leftFavorites");
                        strOptString25.getClass();
                        String strOptString26 = jSONObjectOptJSONObject.optString("delayMode", "global");
                        strOptString26.getClass();
                        String str5 = strOptString26.equals("custom") ? "custom" : "global";
                        int iOptInt = jSONObjectOptJSONObject.optInt("promptDelayMs", 0);
                        int i10 = iOptInt < 0 ? 0 : iOptInt;
                        int iOptInt2 = jSONObjectOptJSONObject.optInt("imageDelayMs", 100);
                        int i11 = iOptInt2 < 0 ? 0 : iOptInt2;
                        int iOptInt3 = jSONObjectOptJSONObject.optInt("voiceDelayMs", 100);
                        int i12 = iOptInt3 < 0 ? 0 : iOptInt3;
                        int iOptInt4 = jSONObjectOptJSONObject.optInt("emojiDelayMs", 100);
                        int i13 = iOptInt4 < 0 ? 0 : iOptInt4;
                        int iOptInt5 = jSONObjectOptJSONObject.optInt("videoDelayMs", 100);
                        int i14 = iOptInt5 < 0 ? 0 : iOptInt5;
                        int iOptInt6 = jSONObjectOptJSONObject.optInt("fileDelayMs", 100);
                        int i15 = iOptInt6 < 0 ? 0 : iOptInt6;
                        int iOptInt7 = jSONObjectOptJSONObject.optInt("favoriteDelayMs", 100);
                        arrayList.add(new C3104q(str2, str3, zOptBoolean, zOptBoolean2, zOptBoolean3, strM7873P, str4, strOptString5, strOptString6, strOptString7, strOptString8, strOptString9, strOptString10, strM7871N, strM7872O, strOptString13, strOptString14, strOptString15, strOptString16, strOptString17, strOptString18, strOptString19, strOptString20, strOptString21, strOptString22, strOptString23, strOptString24, strOptString25, str5, i10, i11, i12, i13, i14, i15, iOptInt7 < 0 ? 0 : iOptInt7));
                    }
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static Set m7882Y(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{',', 65292, ';', 65307, '\n', '\r'}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return AbstractC4166m.m8412U1(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static final String m7883Z(WeChatContact weChatContact, boolean z9) {
        weChatContact.getClass();
        if (!z9) {
            String strDisplayName = weChatContact.displayName();
            return AbstractC3149m.m6721t0(strDisplayName) ? weChatContact.wxId : strDisplayName;
        }
        String string = AbstractC3149m.m6703R0(weChatContact.remarkName).toString();
        String string2 = AbstractC3149m.m6703R0(weChatContact.nickname).toString();
        return (string.length() <= 0 || string2.length() <= 0 || AbstractC1416l.m3825a(string, string2)) ? string.length() > 0 ? string : string2.length() > 0 ? string2 : weChatContact.wxId : AbstractC4855en.m9265i(string, "(", string2, ")");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static Serializable m7884c0(Context context, String str) {
        context.getClass();
        str.getClass();
        try {
            File fileM7893h0 = m7893h0(context, str);
            if (fileM7893h0.isFile()) {
                return AbstractC0793l.m2028h0(fileM7893h0, AbstractC3137a.f10177a);
            }
            throw new IllegalArgumentException("工具结果已不存在");
        } catch (Throwable th2) {
            return new C3959f(th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static String m7885d0(Context context, JSONObject jSONObject) {
        String strM1023l = AbstractC0255e.m1023l("handle", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject);
        if (AbstractC3149m.m6721t0(strM1023l)) {
            return m7862E("结果 handle 为空");
        }
        Serializable serializableM7884c0 = m7884c0(context, strM1023l);
        Throwable thM8182b = C3960g.m8182b(serializableM7884c0);
        if (thM8182b == null) {
            String str = (String) serializableM7884c0;
            return m7874Q(m7909r(jSONObject.optInt("offset", 0), 0, str.length()), m7909r(jSONObject.optInt("max_chars", C4143c.DEFAULT_HZ), 1000, 48000), strM1023l, str, str.length());
        }
        String message = thM8182b.getMessage();
        if (message == null) {
            message = "工具结果不存在";
        }
        return m7862E(message);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m7886e(InterfaceC5853o interfaceC5853o, AbstractC1869p1 abstractC1869p1, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-714464401);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4534f(abstractC1869p1) ? 32 : 16;
        }
        int i11 = i9 & 384;
        C3874d c3874d2 = AbstractC0149o.f392a;
        if (i11 == 0) {
            i10 |= c1836h0.m4538h(c3874d2) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? Opcodes.ACC_STRICT : 1024;
        }
        if (c1836h0.m4516S(i10 & 1, (i10 & 1171) != 1170)) {
            Object objM4514P = c1836h0.m4514P();
            if (objM4514P == C1851l.f6155a) {
                Object c1845j1 = new C1845j1(null, C1823e.f6049j);
                c1836h0.m4545k0(c1845j1);
                objM4514P = c1845j1;
            }
            C0646c c0646cM7896j = m7896j(c3874d2, c1836h0, (i10 >> 6) & 14);
            AbstractC1874r.m4619a(abstractC1869p1.mo4582a(c0646cM7896j), AbstractC3879i.m8071e(274270255, new C0479q0(interfaceC5853o, (InterfaceC1809a1) objM4514P, c3874d, c0646cM7896j, 1), c1836h0), c1836h0, 56);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(interfaceC5853o, abstractC1869p1, c3874d, i9, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static final String m7887e0(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i9 = reader.read(cArr);
        while (i9 >= 0) {
            stringWriter.write(cArr, 0, i9);
            i9 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m7888f(final ArrayList arrayList, final int i9, final String str, InterfaceC5853o interfaceC5853o, C3986a c3986a, final String str2, C3986a c3986a2, C4048t c4048t, InterfaceC3268x0 interfaceC3268x0, final boolean z9, final InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, final int i10, final int i11) {
        int i12;
        final InterfaceC5853o interfaceC5853o2;
        final C3986a c3986a3;
        final C3986a c3986a4;
        final C4048t c4048t2;
        final InterfaceC3268x0 interfaceC3268x02;
        int i13;
        int i14;
        final C4048t c4048t3;
        InterfaceC3268x0 interfaceC3268x03;
        InterfaceC5853o interfaceC5853o3;
        C3986a c3986a5;
        C3986a c3986a6;
        C3986a c3986a7;
        boolean z10;
        C3986a c3986a8;
        InterfaceC3268x0 interfaceC3268x04;
        long jM1233c;
        c1836h0.m4527b0(-920742512);
        if ((i10 & 6) == 0) {
            i12 = (c1836h0.m4538h(arrayList) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c1836h0.m4530d(i9) ? 32 : 16;
        }
        int i15 = i10 & 384;
        int i16 = Opcodes.ACC_NATIVE;
        if (i15 == 0) {
            i12 |= c1836h0.m4534f(str) ? 256 : 128;
        }
        int i17 = i12 | 3072;
        if ((i10 & 24576) == 0) {
            i17 = i12 | 11264;
        }
        if ((196608 & i10) == 0) {
            i17 |= c1836h0.m4534f(str2) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i17 |= 524288;
        }
        if ((12582912 & i10) == 0) {
            i17 |= 4194304;
        }
        int i18 = i17 | 905969664;
        int i19 = i11 | 54;
        if ((i11 & 384) == 0) {
            if (!c1836h0.m4536g(z9)) {
                i16 = 128;
            }
            i19 |= i16;
        }
        if ((i11 & 3072) == 0) {
            i19 |= c1836h0.m4536g(true) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i11 & 24576) == 0) {
            i19 |= c1836h0.m4538h(interfaceC1231l) ? 16384 : 8192;
        }
        if (c1836h0.m4516S(i18 & 1, ((306783379 & i18) == 306783378 && (i19 & 9363) == 9362) ? false : true)) {
            c1836h0.m4521X();
            int i20 = i10 & 1;
            C1823e c1823e = C1851l.f6155a;
            if (i20 == 0 || c1836h0.m4500B()) {
                C3272z0 c3272z0 = AbstractC3990b.f13049a;
                C1858m2 c1858m2 = AbstractC0316d.f944a;
                long jM1234d = ((C0314b) c1836h0.m4542j(c1858m2)).m1234d();
                long jM1233c2 = ((C0314b) c1836h0.m4542j(c1858m2)).m1233c();
                boolean zM4532e = c1836h0.m4532e(jM1234d) | c1836h0.m4532e(jM1233c2);
                i13 = 1572864;
                Object objM4514P = c1836h0.m4514P();
                if (zM4532e || objM4514P == c1823e) {
                    objM4514P = new C3986a(jM1234d, jM1233c2);
                    c1836h0.m4545k0(objM4514P);
                }
                C3986a c3986a9 = (C3986a) objM4514P;
                long jM1238h = ((C0314b) c1836h0.m4542j(c1858m2)).m1238h();
                long jM1233c3 = ((C0314b) c1836h0.m4542j(c1858m2)).m1233c();
                boolean zM4532e2 = c1836h0.m4532e(jM1238h) | c1836h0.m4532e(jM1233c3);
                Object objM4514P2 = c1836h0.m4514P();
                if (zM4532e2 || objM4514P2 == c1823e) {
                    objM4514P2 = new C3986a(jM1238h, jM1233c3);
                    c1836h0.m4545k0(objM4514P2);
                }
                C3986a c3986a10 = (C3986a) objM4514P2;
                C1858m2 c1858m22 = AbstractC0316d.f944a;
                long j3 = ((C1034w) ((C0314b) c1836h0.m4542j(c1858m22)).f905P.getValue()).f3265a;
                long jM1243m = ((C0314b) c1836h0.m4542j(c1858m22)).m1243m();
                long jM1240j = ((C0314b) c1836h0.m4542j(c1858m22)).m1240j();
                long jM1243m2 = ((C0314b) c1836h0.m4542j(c1858m22)).m1243m();
                boolean zM4532e3 = c1836h0.m4532e(j3) | c1836h0.m4532e(jM1243m) | c1836h0.m4532e(jM1240j) | c1836h0.m4532e(jM1243m2);
                Object objM4514P3 = c1836h0.m4514P();
                if (zM4532e3 || objM4514P3 == c1823e) {
                    objM4514P3 = new C4048t(j3, jM1243m, jM1240j, jM1243m2);
                    c1836h0.m4545k0(objM4514P3);
                }
                i14 = i18 & (-33087489);
                c4048t3 = (C4048t) objM4514P3;
                interfaceC3268x03 = AbstractC3990b.f13049a;
                interfaceC5853o3 = C5850l.f23787a;
                c3986a5 = c3986a9;
                c3986a6 = c3986a10;
            } else {
                c1836h0.m4519V();
                i14 = i18 & (-33087489);
                interfaceC5853o3 = interfaceC5853o;
                c3986a5 = c3986a;
                c3986a6 = c3986a2;
                c4048t3 = c4048t;
                interfaceC3268x03 = interfaceC3268x0;
                i13 = 1572864;
            }
            c1836h0.m4554q();
            Object objM4514P4 = c1836h0.m4514P();
            if (objM4514P4 == c1823e) {
                objM4514P4 = new C2857k();
                c1836h0.m4545k0(objM4514P4);
            }
            C2857k c2857k = (C2857k) objM4514P4;
            Object objM4514P5 = c1836h0.m4514P();
            if (objM4514P5 == c1823e) {
                objM4514P5 = AbstractC1874r.m4639u(Boolean.FALSE);
                c1836h0.m4545k0(objM4514P5);
            }
            final InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P5;
            Object objM4514P6 = c1836h0.m4514P();
            if (objM4514P6 == c1823e) {
                objM4514P6 = AbstractC1874r.m4639u(Boolean.FALSE);
                c1836h0.m4545k0(objM4514P6);
            }
            final InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) objM4514P6;
            final InterfaceC2862a interfaceC2862a = (InterfaceC2862a) c1836h0.m4542j(AbstractC5888h1.f23930l);
            InterfaceC5853o interfaceC5853o4 = interfaceC5853o3;
            InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(interfaceC2862a, c1836h0);
            boolean zIsEmpty = arrayList.isEmpty();
            final boolean z11 = !zIsEmpty;
            if (!z9 || zIsEmpty) {
                c3986a7 = c3986a5;
                z10 = false;
            } else {
                c3986a7 = c3986a5;
                z10 = true;
            }
            if (z10) {
                c3986a8 = c3986a6;
                c1836h0.m4525a0(2117080340);
                interfaceC3268x04 = interfaceC3268x03;
                jM1233c = ((C1034w) ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).f902M.getValue()).f3265a;
                c1836h0.m4553p(false);
            } else {
                c3986a8 = c3986a6;
                interfaceC3268x04 = interfaceC3268x03;
                c1836h0.m4525a0(2117147889);
                jM1233c = ((C0314b) c1836h0.m4542j(AbstractC0316d.f944a)).m1233c();
                c1836h0.m4553p(false);
            }
            final long j4 = jM1233c;
            boolean zM4536g = c1836h0.m4536g(z10);
            Object objM4514P7 = c1836h0.m4514P();
            if (zM4536g || objM4514P7 == c1823e) {
                objM4514P7 = new C4913gf(z10, interfaceC1809a1, interfaceC1809a12, interfaceC1809a1M4643y);
                c1836h0.m4545k0(objM4514P7);
            }
            boolean zBooleanValue = ((Boolean) interfaceC1809a12.getValue()).booleanValue();
            C3874d c3874dM8071e = AbstractC3879i.m8071e(-1045264474, new InterfaceC1236q() { // from class: xh.s
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1236q
                /* JADX INFO: renamed from: b */
                public final Object mo734b(Object obj, Object obj2, Object obj3) {
                    boolean z12;
                    ArrayList arrayList2;
                    boolean z13;
                    int i21;
                    long j5;
                    C3216f1 c3216f1 = (C3216f1) obj;
                    C1836h0 c1836h02 = (C1836h0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    c3216f1.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= c1836h02.m4534f(c3216f1) ? 4 : 2;
                    }
                    int i22 = iIntValue;
                    if (c1836h02.m4516S(i22 & 1, (i22 & 19) != 18)) {
                        boolean z14 = z11;
                        ArrayList arrayList3 = arrayList;
                        int i23 = i9;
                        long j10 = j4;
                        if (z14) {
                            c1836h02.m4525a0(-960972300);
                            j5 = j10;
                            arrayList2 = arrayList3;
                            i21 = i23;
                            z12 = z14;
                            z13 = false;
                            AbstractC4045s.m8250n((String) arrayList3.get(i23), c3216f1.m6897a(AbstractC3208d.m6886p(C5850l.f23787a, 0.0f, 0.0f, 8, 0.0f, 11).mo10549d(new C3246p1(C5840b.f23771q)), false), j5, ((C1941n0) ((C0324l) c1836h02.m4542j(AbstractC0325m.f972a)).f961d.getValue()).f6580a.f6514b, null, null, 0L, new C4095k(6), 0L, 0, false, 0, 0, null, null, c1836h02, 0, 0, 261096);
                            c1836h02 = c1836h02;
                            c1836h02.m4553p(false);
                        } else {
                            z12 = z14;
                            arrayList2 = arrayList3;
                            z13 = false;
                            i21 = i23;
                            j5 = j10;
                            c1836h02.m4525a0(-960550948);
                            c1836h02.m4553p(false);
                        }
                        AbstractC4045s.m8241e(c3216f1, j5, c1836h02, i22 & 14);
                        if (z12) {
                            c1836h02.m4525a0(-960408999);
                            InterfaceC1809a1 interfaceC1809a13 = interfaceC1809a1;
                            boolean zBooleanValue2 = ((Boolean) interfaceC1809a13.getValue()).booleanValue();
                            Object objM4514P8 = c1836h02.m4514P();
                            C1823e c1823e2 = C1851l.f6155a;
                            if (objM4514P8 == c1823e2) {
                                objM4514P8 = new C4960ht(interfaceC1809a13, 6);
                                c1836h02.m4545k0(objM4514P8);
                            }
                            InterfaceC1220a interfaceC1220a = (InterfaceC1220a) objM4514P8;
                            Object objM4514P9 = c1836h02.m4514P();
                            if (objM4514P9 == c1823e2) {
                                objM4514P9 = new C4960ht(interfaceC1809a12, 7);
                                c1836h02.m4545k0(objM4514P9);
                            }
                            AbstractC3754e0.m7890g(arrayList2, i21, zBooleanValue2, interfaceC1220a, (InterfaceC1220a) objM4514P9, c4048t3, interfaceC2862a, interfaceC1231l, c1836h02, 27648);
                            c1836h02.m4553p(z13);
                        } else {
                            c1836h02.m4525a0(-959852580);
                            c1836h02.m4553p(z13);
                        }
                    } else {
                        c1836h02.m4519V();
                    }
                    return C3967n.f12976a;
                }
            }, c1836h0);
            int i21 = i14 >> 9;
            int i22 = (i21 & 14) | i13 | ((i14 >> 3) & 112);
            int i23 = i14 >> 6;
            int i24 = (i23 & 29360128) | (i21 & 458752) | i22 | (i23 & 7168) | ((i19 << 24) & 234881024);
            C3986a c3986a11 = c3986a7;
            C3986a c3986a12 = c3986a8;
            boolean z12 = z10;
            int i25 = (i24 & 14) | 805306368;
            int i26 = i24 >> 12;
            InterfaceC3268x0 interfaceC3268x05 = interfaceC3268x04;
            AbstractC4045s.m8238b(interfaceC5853o4, c3874dM8071e, interfaceC3268x05, (InterfaceC1220a) objM4514P7, zBooleanValue, z12, c2857k, AbstractC3879i.m8071e(-682683637, new C4027m(str, c3986a11, z12, str2, c3986a12), c1836h0), c1836h0, i25 | (i26 & 112) | 384 | (i26 & 7168) | (i26 & 57344) | 100663296);
            interfaceC5853o2 = interfaceC5853o4;
            interfaceC3268x02 = interfaceC3268x05;
            c3986a3 = c3986a11;
            c3986a4 = c3986a12;
            c4048t2 = c4048t3;
        } else {
            c1836h0.m4519V();
            interfaceC5853o2 = interfaceC5853o;
            c3986a3 = c3986a;
            c3986a4 = c3986a2;
            c4048t2 = c4048t;
            interfaceC3268x02 = interfaceC3268x0;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: xh.t
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC3754e0.m7888f(arrayList, i9, str, interfaceC5853o2, c3986a3, str2, c3986a4, c4048t2, interfaceC3268x02, z9, interfaceC1231l, (C1836h0) obj, AbstractC1874r.m4617C(i10 | 1), AbstractC1874r.m4617C(i11));
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:112:0x0216 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: f0 */
    public static String m7889f0(Context context, List list) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        String strM7862E;
        Object c3959f;
        context.getClass();
        JSONArray jSONArray = new JSONArray();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((C1107c) obj).f3593j.isEmpty()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (!(jSONArray.length() > 0)) {
                    jSONArray = null;
                }
                String string = jSONArray != null ? jSONArray.toString() : null;
                return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
            }
            List list2 = ((C1107c) it.next()).f3593j;
            ArrayList<C1165q1> arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                C1165q1 c1165q1 = (C1165q1) obj2;
                String str = c1165q1.f3880g;
                String str2 = c1165q1.f3885l;
                if ((str.equals("running") || str.equals("queued") || str.equals("interrupted") || AbstractC3149m.m6721t0(str2) || AbstractC3149m.m6721t0(c1165q1.f3886m) || !hashSet.add(str2)) ? false : true) {
                    arrayList2.add(obj2);
                }
            }
            if (!arrayList2.isEmpty()) {
                JSONObject jSONObjectM9267k = AbstractC4855en.m9267k("role", "assistant");
                JSONArray jSONArray2 = new JSONArray();
                for (C1165q1 c1165q12 : arrayList2) {
                    JSONObject jSONObject = new JSONObject();
                    Object obj3 = c1165q12.f3885l;
                    String str3 = c1165q12.f3887n;
                    jSONObject.put("id", obj3);
                    jSONObject.put("type", "function");
                    if (!AbstractC3149m.m6721t0(str3)) {
                        jSONObject.put("provider_metadata", str3);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("name", c1165q12.f3886m);
                    String str4 = c1165q12.f3877d;
                    if (AbstractC3149m.m6721t0(str4)) {
                        str4 = "{}";
                    }
                    jSONObject2.put("arguments", str4);
                    jSONObject.put("function", jSONObject2);
                    jSONArray2.put(jSONObject);
                }
                int i9 = 1;
                jSONObjectM9267k.put("tool_calls", jSONArray2);
                jSONArray.put(jSONObjectM9267k);
                for (C1165q1 c1165q13 : arrayList2) {
                    String str5 = c1165q13.f3889p;
                    String str6 = c1165q13.f3889p;
                    if (AbstractC3149m.m6721t0(str5)) {
                        strM7862E = c1165q13.f3878e;
                    } else {
                        try {
                            File fileM7893h0 = m7893h0(context, str6);
                            if (!fileM7893h0.isFile()) {
                                throw new IllegalArgumentException("工具结果已不存在");
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileM7893h0), AbstractC3137a.f10177a), 8192);
                            try {
                                char[] cArr = new char[C4143c.DEFAULT_HZ];
                                int i10 = 0;
                                while (i10 < 24000) {
                                    int i11 = bufferedReader.read(cArr, i10, 24000 - i10);
                                    if (i11 <= 0) {
                                        break;
                                    }
                                    i10 += i11;
                                }
                                c3959f = new C1169r1(new String(cArr, 0, i10), bufferedReader.read() >= 0);
                                bufferedReader.close();
                            } finally {
                            }
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        if (C3960g.m8182b(c3959f) == null) {
                            C1169r1 c1169r1 = (C1169r1) c3959f;
                            boolean z9 = c1169r1.f3903b;
                            strM7862E = c1169r1.f3902a;
                            if (z9) {
                                int i12 = c1165q13.f3890q;
                                int length = strM7862E.length() + 1;
                                if (i12 < length) {
                                    i12 = length;
                                }
                                strM7862E = m7874Q(0, C4143c.DEFAULT_HZ, str6, strM7862E, i12);
                            }
                        } else {
                            strM7862E = m7862E("完整工具结果已不存在");
                        }
                    }
                    JSONObject jSONObjectM9267k2 = AbstractC4855en.m9267k("role", "tool");
                    jSONObjectM9267k2.put("tool_call_id", c1165q13.f3885l);
                    jSONObjectM9267k2.put("content", strM7862E);
                    jSONArray.put(jSONObjectM9267k2);
                }
                while (true) {
                    int i13 = i9;
                    if (m7870M(jSONArray) <= i13 || jSONArray.toString().length() <= 120000) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(0);
                    int length2 = (!AbstractC1416l.m3825a(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("role") : null, "assistant") || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("tool_calls")) == null) ? 0 : jSONArrayOptJSONArray.length();
                    jSONArray.remove(0);
                    int length3 = jSONArray.length();
                    if (length2 > length3) {
                        length2 = length3;
                    }
                    for (int i14 = 0; i14 < length2; i14++) {
                        jSONArray.remove(0);
                    }
                    i9 = i13;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final void m7890g(ArrayList arrayList, int i9, boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2, C4048t c4048t, InterfaceC2862a interfaceC2862a, InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, int i10) {
        c1836h0.m4527b0(-202719700);
        int i11 = i10 | (c1836h0.m4538h(arrayList) ? 4 : 2) | (c1836h0.m4530d(i9) ? 32 : 16) | (c1836h0.m4536g(z9) ? Opcodes.ACC_NATIVE : 128) | (c1836h0.m4534f(null) ? Opcodes.ACC_DEPRECATED : 65536) | (c1836h0.m4534f(c4048t) ? 1048576 : 524288) | (c1836h0.m4538h(interfaceC2862a) ? 8388608 : 4194304) | (c1836h0.m4538h(interfaceC1231l) ? 67108864 : 33554432);
        if (c1836h0.m4516S(i11 & 1, (38347923 & i11) != 38347922)) {
            AbstractC5837v.m10540a(z9, null, null, EnumC4010g0.f13126h, false, interfaceC1220a, interfaceC1220a2, 0.0f, AbstractC3879i.m8071e(93904438, new C3873c(AbstractC1874r.m4643y(interfaceC1231l, c1836h0), AbstractC1874r.m4643y(interfaceC2862a, c1836h0), arrayList, i9, c4048t, 13), c1836h0), c1836h0, ((i11 >> 6) & 14) | 807078912 | ((i11 << 6) & 29360128));
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C4638u(arrayList, i9, z9, interfaceC1220a, interfaceC1220a2, c4048t, interfaceC2862a, interfaceC1231l, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g0 */
    public static final void m7891g0(Object[] objArr, int i9, int i10) {
        objArr.getClass();
        while (i9 < i10) {
            objArr[i9] = null;
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final boolean m7892h(C0168h c0168h, long j3) {
        if (!c0168h.f23788g.f23801t) {
            return false;
        }
        C5639r c5639r = AbstractC5618k.m10167w(c0168h).f22778L.f22716c;
        if (!c5639r.f22950Y.f23801t) {
            return false;
        }
        long jMo8868m0 = c5639r.mo8868m0(0L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jMo8868m0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jMo8868m0 & 4294967295L));
        long j4 = c0168h.f443w;
        float f3 = ((int) (j4 >> 32)) + fIntBitsToFloat;
        float f10 = ((int) (j4 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f3) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h0 */
    public static File m7893h0(Context context, String str) {
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{':'}, 2);
        if (listM6691F0.size() != 2) {
            C2104o.m5294t("结果 handle 无效");
            return null;
        }
        String strM7897j0 = m7897j0((String) listM6691F0.get(0));
        String strM7897j02 = m7897j0((String) listM6691F0.get(1));
        if (strM7897j0.equals(listM6691F0.get(0)) && strM7897j02.equals(listM6691F0.get(1))) {
            return new File(new File(m7895i0(context), strM7897j0), strM7897j02.concat(".txt"));
        }
        C2104o.m5294t("结果 handle 无效");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final String m7894i(Object[] objArr, int i9, int i10, AbstractC4160g abstractC4160g) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i9 + i11];
            if (obj == abstractC4160g) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i0 */
    public static File m7895i0(Context context) {
        File file = new File(ScriptPluginRuntime.INSTANCE.scriptDir(context).getParentFile(), "Agent/tool-results");
        file.mkdirs();
        return file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final C0646c m7896j(C3874d c3874d, C1836h0 c1836h0, int i9) {
        boolean z9 = (((i9 & 14) ^ 6) > 4 && c1836h0.m4534f(c3874d)) || (i9 & 6) == 4;
        Object objM4514P = c1836h0.m4514P();
        Object obj = C1851l.f6155a;
        if (z9 || objM4514P == obj) {
            objM4514P = new C0646c(c3874d);
            c1836h0.m4545k0(objM4514P);
        }
        C0646c c0646c = (C0646c) objM4514P;
        boolean zM4534f = c1836h0.m4534f(c0646c);
        Object objM4514P2 = c1836h0.m4514P();
        if (zM4534f || objM4514P2 == obj) {
            objM4514P2 = new C0136d0(c0646c, 9);
            c1836h0.m4545k0(objM4514P2);
        }
        AbstractC1874r.m4621c(c0646c, (InterfaceC1231l) objM4514P2, c1836h0);
        return c0646c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j0 */
    public static String m7897j0(String str) {
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9_-]");
        patternCompile.getClass();
        str.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
        strReplaceAll.getClass();
        String strM6701P0 = AbstractC3149m.m6701P0(96, strReplaceAll);
        return AbstractC3149m.m6721t0(strM6701P0) ? "item" : strM6701P0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public static void m7898k0(EditorInfo editorInfo, CharSequence charSequence) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30) {
            AbstractC0170b.m763f(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        if (i9 >= 30) {
            AbstractC0170b.m763f(editorInfo, charSequence);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = charSequence.length();
        if (i12 < 0 || i10 > length) {
            m7900m0(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            m7900m0(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            m7900m0(editorInfo, charSequence, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int iMin = Math.min(charSequence.length() - i10, i16 - Math.min(i12, (int) (((double) i16) * 0.8d)));
        int iMin2 = Math.min(i12, i16 - iMin);
        int i17 = i12 - iMin2;
        if (Character.isLowSurrogate(charSequence.charAt(i17))) {
            i17++;
            iMin2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i10 + iMin) - 1))) {
            iMin--;
        }
        int i18 = iMin2 + i15;
        m7900m0(editorInfo, i15 != i14 ? TextUtils.concat(charSequence.subSequence(i17, i17 + iMin2), charSequence.subSequence(i10, iMin + i10)) : charSequence.subSequence(i17, i18 + iMin + i17), iMin2, i18);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public static void m7899l0(EditorInfo editorInfo, boolean z9) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC1956a.m4842b(editorInfo, z9);
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m0 */
    public static void m7900m0(EditorInfo editorInfo, CharSequence charSequence, int i9, int i10) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i9);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static int m7901n(int i9, int i10) {
        return i9 < i10 ? i10 : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n0 */
    public static C2562b m7902n0(C2564d c2564d, int i9) {
        c2564d.getClass();
        boolean z9 = i9 > 0;
        Integer numValueOf = Integer.valueOf(i9);
        if (!z9) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i10 = c2564d.f8312g;
        int i11 = c2564d.f8313h;
        if (c2564d.f8314i <= 0) {
            i9 = -i9;
        }
        return new C2562b(i10, i11, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Comparable m7903o(C4236f c4236f, C4236f c4236f2) {
        return c4236f.compareTo(c4236f2) > 0 ? c4236f2 : c4236f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: o0 */
    public static C1173s1 m7904o0(Context context, String str, String str2, boolean z9) throws IOException {
        boolean zRenameTo;
        IllegalStateException illegalStateException;
        str.getClass();
        str2.getClass();
        if (z9) {
            return new C1173s1(str2, str2, HttpUrl.FRAGMENT_ENCODE_SET, str2.length(), false, 0);
        }
        if (str2.length() <= 24000) {
            return new C1173s1(str2, str2, HttpUrl.FRAGMENT_ENCODE_SET, str2.length(), false, 0);
        }
        if (AbstractC3149m.m6721t0(str)) {
            str = "session";
        }
        String strM7897j0 = m7897j0(str);
        String string = UUID.randomUUID().toString();
        string.getClass();
        String strM6737a0 = AbstractC3156t.m6737a0(string, "-", HttpUrl.FRAGMENT_ENCODE_SET, false);
        File file = new File(m7895i0(context), strM7897j0);
        file.mkdirs();
        File file2 = new File(file, strM6737a0.concat(".txt"));
        File file3 = new File(file, strM6737a0.concat(".tmp"));
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        try {
            Charset charset = StandardCharsets.UTF_8;
            charset.getClass();
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            try {
                Os.rename(file3.getAbsolutePath(), file2.getAbsolutePath());
            } finally {
                if (!zRenameTo) {
                }
            }
            String strM9264h = AbstractC4855en.m9264h(strM7897j0, ":", strM6737a0);
            return new C1173s1(AbstractC3149m.m6701P0(12000, str2).concat("\n\n[结果较长，完整内容可分页读取]"), m7874Q(0, C4143c.DEFAULT_HZ, strM9264h, str2, str2.length()), strM9264h, str2.length(), true, C4143c.DEFAULT_HZ);
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static double m7905p(double d10, double d11, double d12) {
        if (d11 <= d12) {
            return d10 < d11 ? d11 : d10 > d12 ? d12 : d10;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d12 + " is less than minimum " + d11 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p0 */
    public static final long m7906p0(long j3) {
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (j3 >> 32));
        return (((long) ((int) Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (((long) iIntBitsToFloat) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static float m7907q(float f3, float f10, float f11) {
        if (f10 <= f11) {
            return f3 < f10 ? f10 : f3 > f11 ? f11 : f3;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q0 */
    public static final long m7908q0(long j3) {
        return (((long) Float.floatToRawIntBits((int) (j3 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static int m7909r(int i9, int i10, int i11) {
        if (i10 <= i11) {
            return i9 < i10 ? i10 : i9 > i11 ? i11 : i9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r0 */
    public static C2564d m7910r0(int i9, int i10) {
        if (i10 > Integer.MIN_VALUE) {
            return new C2564d(i9, i10 - 1, 1);
        }
        C2564d c2564d = C2564d.f8319j;
        return C2564d.f8319j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static long m7911s(long j3, long j4, long j5) {
        if (j4 <= j5) {
            return j3 < j4 ? j4 : j3 > j5 ? j5 : j3;
        }
        StringBuilder sbM6842o = AbstractC3199a.m6842o(j5, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbM6842o.append(j4);
        sbM6842o.append('.');
        throw new IllegalArgumentException(sbM6842o.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s0 */
    public static void m7912s0(C0826a c0826a, String str, String str2, String str3) throws IOException {
        if (str != null) {
            c0826a.m7218m(str);
        } else {
            c0826a.mo2076g(C0200h.f499g);
        }
        c0826a.write(58);
        if (str2 != null) {
            c0826a.m7221t(str2);
        } else {
            c0826a.m7221t("V");
        }
        if (str3 != null) {
            c0826a.write(", ");
            c0826a.m7218m(str3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static Comparable m7913t(Float f3, C2561a c2561a) {
        float f10 = c2561a.f8311b;
        float f11 = c2561a.f8310a;
        if (!c2561a.m6021c()) {
            return (!C2561a.m6018d(f3, Float.valueOf(f11)) || C2561a.m6018d(Float.valueOf(f11), f3)) ? (!C2561a.m6018d(Float.valueOf(f10), f3) || C2561a.m6018d(f3, Float.valueOf(f10))) ? f3 : Float.valueOf(f10) : Float.valueOf(f11);
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + c2561a + '.');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static Comparable m7914u(C4236f c4236f, C4236f c4236f2, C4236f c4236f3) {
        if (c4236f2.compareTo(c4236f3) <= 0) {
            return c4236f.compareTo(c4236f2) < 0 ? c4236f2 : c4236f.compareTo(c4236f3) > 0 ? c4236f3 : c4236f;
        }
        C0086a.m451j(c4236f3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ", c4236f2, 46);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m7915v(C1005h c1005h, BlurMaskFilter blurMaskFilter, int i9) {
        long j3 = C1034w.f3258b;
        int i10 = (i9 & 8) != 0 ? 0 : 1;
        c1005h.m2588w(j3);
        c1005h.m2587v(3);
        c1005h.m2565D(i10);
        ((Paint) c1005h.f3182i).setMaskFilter(blurMaskFilter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static int m7916w(int i9) {
        switch (AbstractC4106c.m8279b(i9)) {
            case 4:
                return 1;
            case 5:
                return 3;
            case 6:
            case 7:
                return 2;
            case 8:
                return 4;
            default:
                C0086a.m452k("Unsupported method handle type: ".concat(AbstractC2091b.m5175v(i9)));
                return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x013f */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: x */
    public static List m7917x(Context context, String str, String str2, List list) {
        ?? c3959f;
        str.getClass();
        String strM7897j0 = m7897j0(str);
        String strM7897j02 = m7897j0(str2);
        File file = new File(m7895i0(context), strM7897j0);
        File file2 = new File(m7895i0(context), strM7897j02);
        file2.mkdirs();
        try {
            c3959f = new ArrayList(AbstractC4167n.m8429e1(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1107c c1107cM2840a = (C1107c) it.next();
                if (!c1107cM2840a.f3593j.isEmpty()) {
                    List<C1165q1> list2 = c1107cM2840a.f3593j;
                    ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
                    for (C1165q1 c1165q1M2980a : list2) {
                        if (!AbstractC3149m.m6721t0(c1165q1M2980a.f3889p)) {
                            List listM6691F0 = AbstractC3149m.m6691F0(c1165q1M2980a.f3889p, new char[]{':'}, 2);
                            if (listM6691F0.size() != 2 || !AbstractC1416l.m3825a(listM6691F0.get(0), strM7897j0)) {
                                throw new IllegalArgumentException("分支工具结果不属于当前会话");
                            }
                            String strM7897j03 = m7897j0((String) listM6691F0.get(1));
                            if (!strM7897j03.equals(listM6691F0.get(1))) {
                                throw new IllegalArgumentException("工具结果 handle 无效");
                            }
                            File file3 = new File(file, strM7897j03 + ".txt");
                            File file4 = new File(file2, strM7897j03 + ".txt");
                            if (!file3.isFile()) {
                                throw new IllegalArgumentException("分支所需的完整工具结果已不存在");
                            }
                            AbstractC0793l.m2021a0(file3, file4);
                            c1165q1M2980a = C1165q1.m2980a(c1165q1M2980a, null, null, null, 0L, 0L, null, strM7897j02 + ":" + strM7897j03, 0, false, 0, 491519);
                        }
                        arrayList.add(c1165q1M2980a);
                    }
                    c1107cM2840a = C1107c.m2840a(c1107cM2840a, null, null, null, null, null, null, null, null, arrayList, null, null, false, null, 0L, 261631);
                }
                c3959f.add(c1107cM2840a);
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            return (List) c3959f;
        }
        AbstractC0793l.m2022b0(file2);
        throw new IllegalStateException("复制分支工具结果失败", thM8182b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static C5956y1 m7918y(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                C0353j.m1309g(AbstractC3199a.m6838k(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (C5956y1) objNewInstance;
            } catch (IllegalAccessException e6) {
                C0086a.m457p(AbstractC3199a.m6838k(cls, "Cannot create an instance of "), e6);
                return null;
            } catch (InstantiationException e7) {
                C0086a.m457p(AbstractC3199a.m6838k(cls, "Cannot create an instance of "), e7);
                return null;
            }
        } catch (NoSuchMethodException e10) {
            C0086a.m457p(AbstractC3199a.m6838k(cls, "Cannot create an instance of "), e10);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static String m7919z(int i9, boolean z9) {
        float f3;
        C2907f c2907f;
        int i10 = 3;
        int i11 = (i9 >> 4) & 3;
        int i12 = 1;
        if (i11 == 0) {
            i10 = 1;
        } else if (i11 == 1) {
            i10 = 2;
        } else if (i11 != 2) {
            if (i11 != 3) {
                throw new NumberFormatException(AbstractC0921a.m2249l(i11, "Unknown radix flag = "));
            }
            i10 = 4;
        }
        float f10 = i9 & (-256);
        if (i10 == 1) {
            f3 = 0.00390625f;
        } else if (i10 == 2) {
            f3 = 3.0517578E-5f;
        } else if (i10 == 3) {
            f3 = 1.1920929E-7f;
        } else {
            if (i10 != 4) {
                throw null;
            }
            f3 = 4.656613E-10f;
        }
        float f11 = f3 * f10;
        int i13 = i9 & 15;
        C2907f c2907f2 = null;
        if (z9) {
            C2907f[] c2907fArr = C2907f.f9387k;
            for (int i14 = 0; i14 < 2; i14++) {
                c2907f = c2907fArr[i14];
                if (i13 == c2907f.f4400h) {
                    c2907f2 = c2907f;
                    break;
                }
            }
        } else {
            C2907f[] c2907fArr2 = C2907f.f9386j;
            for (int i15 = 0; i15 < 7; i15++) {
                c2907f = c2907fArr2[i15];
                if (i13 == c2907f.f4400h) {
                    c2907f2 = c2907f;
                    break;
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = f11 < 0.0f;
        if (z10) {
            f11 = -f11;
        }
        for (int i16 = 0; i16 < AbstractC4106c.m8279b(i10) * 2; i16++) {
            i12 *= 10;
        }
        float f12 = i12;
        float f13 = f11 * f12;
        int i17 = (int) f13;
        if (f13 - i17 >= 0.5f) {
            i17++;
        }
        float f14 = i17 / f12;
        if (z10) {
            f14 = -f14;
        }
        if (z9) {
            f14 *= 100.0f;
        }
        sb2.append(Float.toString(f14));
        sb2.append(c2907f2);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ke.InterfaceC2396e
    /* JADX INFO: renamed from: a */
    public boolean mo2614a(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        return true;
    }

    /* JADX INFO: renamed from: a0 */
    public abstract void mo7920a0(C6080f c6080f, C6080f c6080f2);

    /* JADX INFO: renamed from: b0 */
    public abstract void mo7921b0(C6080f c6080f, Thread thread);

    /* JADX INFO: renamed from: k */
    public abstract boolean mo7922k(AbstractFutureC6081g abstractFutureC6081g, C6077c c6077c);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo7923l(AbstractFutureC6081g abstractFutureC6081g, Object obj, Object obj2);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo7924m(AbstractFutureC6081g abstractFutureC6081g, C6080f c6080f, C6080f c6080f2);

    @Override // ke.InterfaceC2396e
    /* JADX INFO: renamed from: b */
    public void mo2615b(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
    }

    @Override // ke.InterfaceC2396e
    /* JADX INFO: renamed from: d */
    public void mo2617d(C4322r c4322r, InterfaceC4312h interfaceC4312h) {
    }
}
