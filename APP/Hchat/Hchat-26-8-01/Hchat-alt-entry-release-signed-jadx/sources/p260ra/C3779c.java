package p260ra;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import gg.AbstractC1428x;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ke.C2399h;
import lb.RunnableC2539a;
import na.C2913a;
import na.C2914b;
import na.C2917e;
import na.C2923k;
import okhttp3.HttpUrl;
import p002a1.RunnableC0003a;
import p020b5.C0184c;
import p024b9.RunnableC0217c;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p162l3.C2458l;
import p183m8.C2815c;
import p210o8.C3086j;
import p212oa.AbstractC3107b;
import p258r8.C3744i;
import p258r8.RunnableC3737b;
import p332wb.AbstractC4855en;
import pa.AbstractC3375a;
import sa.C3947a;
import sa.C3948b;

/* JADX INFO: renamed from: ra.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3779c {

    /* JADX INFO: renamed from: a */
    public boolean f12371a;

    /* JADX INFO: renamed from: b */
    public boolean f12372b;

    /* JADX INFO: renamed from: c */
    public final Object f12373c;

    /* JADX INFO: renamed from: d */
    public final Object f12374d;

    /* JADX INFO: renamed from: e */
    public final Object f12375e;

    /* JADX INFO: renamed from: f */
    public final Object f12376f;

    /* JADX INFO: renamed from: g */
    public final Object f12377g;

    /* JADX INFO: renamed from: h */
    public final Object f12378h;

    /* JADX INFO: renamed from: i */
    public final Object f12379i;

    /* JADX INFO: renamed from: j */
    public Object f12380j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3779c(Context context, C2458l c2458l, C0184c c0184c, C2914b c2914b) {
        this.f12376f = new Handler(Looper.getMainLooper());
        this.f12377g = new ArrayDeque();
        this.f12378h = AbstractC2091b.m5168o();
        this.f12379i = AbstractC2091b.m5168o();
        this.f12373c = context;
        this.f12374d = c0184c;
        this.f12375e = c2914b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m7926c(String str) {
        try {
            WeChatApis.runtime().getClass();
            C3086j c3086j = WeChatApis.taskApi;
            if (c3086j != null) {
                c3086j.m6550a(str);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m7927g(String str, String... strArr) {
        String strSubstring;
        int iIndexOf;
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    try {
                        String str3 = str2 + "=";
                        int iIndexOf2 = str.indexOf(63);
                        for (int i9 = iIndexOf2 >= 0 ? iIndexOf2 + 1 : 0; i9 < str.length(); i9 = iIndexOf + 1) {
                            iIndexOf = str.indexOf(38, i9);
                            if (iIndexOf < 0) {
                                iIndexOf = str.length();
                            }
                            if (str.startsWith(str3, i9)) {
                                strSubstring = str.substring(i9 + str3.length(), iIndexOf);
                                break;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!TextUtils.isEmpty(strSubstring)) {
                    return strSubstring;
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m7928t(String str, long j3, Runnable runnable) {
        try {
            WeChatApis.runtime().getClass();
            C3086j c3086j = WeChatApis.taskApi;
            if (c3086j != null) {
                c3086j.m6555f(str, j3, runnable);
                return;
            }
        } catch (Throwable unused) {
        }
        new Handler(Looper.getMainLooper()).postDelayed(runnable, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m7929a(String str, String str2, String str3, C2913a c2913a) {
        String strM9263g;
        if (c2913a.f9420I) {
            String str4 = c2913a.f9421J;
            if (TextUtils.isEmpty(str4)) {
                str4 = "抢到红包 {amount} 元";
            }
            String strTrim = ((C0184c) this.f12374d).m817n(str4, str, str2, str3).trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            if (TextUtils.isEmpty(str3)) {
                strM9263g = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                String strM7927g = m7927g(str3, "sendid", "sendId");
                if (TextUtils.isEmpty(strM7927g)) {
                    String strM7927g2 = m7927g(str3, "msgid", "msgId");
                    String strM7927g3 = m7927g(str3, "channelid", "channelId");
                    strM9263g = (TextUtils.isEmpty(strM7927g2) && TextUtils.isEmpty(strM7927g3)) ? AbstractC4855en.m9263g("url:", str3) : AbstractC0255e.m1021j("msg:", strM7927g2, "|channel:", strM7927g3);
                } else {
                    strM9263g = "sendid:".concat(strM7927g);
                }
            }
            if (TextUtils.isEmpty(strM9263g) ? true : ((Set) this.f12379i).contains(strM9263g) ? false : ((Set) this.f12378h).add(strM9263g)) {
                ((Handler) this.f12376f).post(new RunnableC3737b(this, strM9263g, strTrim, 3));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public ArrayList m7930b(String str, String str2) {
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        boolean z10 = false;
        try {
            z9 = ((C2458l) this.f12374d).m5853b().getBoolean("hb_fake_packet_receive_enable", false);
        } catch (Throwable unused) {
            z9 = false;
        }
        if (z9) {
            ConcurrentHashMap concurrentHashMap = AbstractC3375a.f10902a;
            if (!TextUtils.isEmpty(str) && str.replace("%40", "@").matches("^[0-9]+@chatroom$")) {
                z10 = true;
            }
            if (z10) {
                String strReplace = TextUtils.isEmpty(str) ? str : str.replace("%40", "%40%40").replace("@", "@@");
                AbstractC3375a.m7155b(str, strReplace);
                if (!TextUtils.isEmpty(strReplace) && !arrayList.contains(strReplace)) {
                    arrayList.add(strReplace);
                }
                String str3 = str + "@chatroom";
                AbstractC3375a.m7155b(str, str3);
                if (!TextUtils.isEmpty(str3) && !arrayList.contains(str3)) {
                    arrayList.add(str3);
                }
                String strM6614d = AbstractC3107b.m6614d(str2, "sendusername");
                if (!TextUtils.isEmpty(strM6614d)) {
                    String str4 = str + strM6614d + "@chatroom";
                    AbstractC3375a.m7155b(str, str4);
                    if (!TextUtils.isEmpty(str4) && !arrayList.contains(str4)) {
                        arrayList.add(str4);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public void m7931d(String str) {
        m7926c("redpacket_receive_timeout:" + str);
        m7926c("redpacket_open_timeout:" + str);
        C2923k c2923k = (C2923k) this.f12375e;
        ConcurrentHashMap concurrentHashMap = c2923k.f9548k;
        if (TextUtils.isEmpty(str) || str == null) {
            return;
        }
        Map map = (Map) concurrentHashMap.get(str);
        if (map != null) {
            Object obj = map.get("nativeurl");
            String str2 = obj instanceof String ? (String) obj : null;
            if (!TextUtils.isEmpty(str2)) {
                AbstractC1428x.m3837b(c2923k.f9543f).remove(str2);
                AbstractC1428x.m3837b(c2923k.f9544g).remove(str2);
                AbstractC1428x.m3837b(c2923k.f9545h).remove(str2);
                AbstractC1428x.m3837b(c2923k.f9546i).remove(str2);
            }
        }
        c2923k.f9552o.remove(str);
        c2923k.f9553p.remove(str);
        c2923k.f9550m.remove(str);
        c2923k.f9551n.remove(str);
        concurrentHashMap.remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m7932e() {
        C3948b c3948b;
        while (this.f12371a && ((TextToSpeech) this.f12380j) != null && (c3948b = (C3948b) ((ArrayDeque) this.f12377g).poll()) != null) {
            if (!m7947v(c3948b)) {
                m7945s(c3948b);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public void m7933f() {
        Context context = (Context) this.f12373c;
        if (this.f12371a && ((TextToSpeech) this.f12380j) != null) {
            m7932e();
            return;
        }
        if (this.f12372b) {
            return;
        }
        this.f12372b = true;
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f12380j = new TextToSpeech(context, new C3947a(this, 0));
        } catch (Throwable th2) {
            this.f12372b = false;
            m7937k("红包播报初始化失败: " + th2.getMessage(), th2);
            m7943q("初始化异常");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public boolean m7934h(Class cls, String str) {
        Method next;
        if (cls != null) {
            try {
                Iterator<Method> it = KavaReflector.declaredMethods(cls).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if ("onGYNetEnd".equals(next.getName()) && next.getParameterTypes().length == 3) {
                        break;
                    }
                }
                if (next != null) {
                    C3744i.f12154b.m7763b(next, new C3778b(this, 1));
                    m7936j("Hook拆红包回调成功: " + str + " -> " + cls.getName());
                    return true;
                }
            } catch (Throwable th2) {
                StringBuilder sbM1026o = AbstractC0255e.m1026o("Hook拆红包回调失败(", str, "): ");
                sbM1026o.append(th2.getMessage());
                m7936j(sbM1026o.toString());
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public boolean m7935i(Class cls, String str) {
        Method next;
        if (cls != null) {
            try {
                Iterator<Method> it = KavaReflector.declaredMethods(cls).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if ("onGYNetEnd".equals(next.getName()) && next.getParameterTypes().length == 3) {
                        break;
                    }
                }
                if (next != null) {
                    C3744i.f12154b.m7763b(next, new C3778b(this, 0));
                    m7936j("Hook收红包回调成功: " + str + " -> " + cls.getName());
                    return true;
                }
            } catch (Throwable th2) {
                StringBuilder sbM1026o = AbstractC0255e.m1026o("Hook收红包回调失败(", str, "): ");
                sbM1026o.append(th2.getMessage());
                m7936j(sbM1026o.toString());
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m7936j(String str) {
        ((C2914b) this.f12380j).f9449h.m6327d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void m7937k(String str, Throwable th2) {
        String strConcat = "ERROR ".concat(str);
        C2914b c2914b = (C2914b) this.f12375e;
        if (c2914b != null) {
            c2914b.mo3415a(strConcat);
        }
        AbstractC1184v0.m3204n("[Hchat:RedPacketAnnouncer] ".concat(str), th2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public Object m7938l(Class cls, Constructor constructor, Object[] objArr) {
        Object objNewInstance;
        Object objNewInstanceByArgs = null;
        if (constructor != null) {
            try {
                objNewInstance = KavaReflector.newInstance(constructor, objArr);
            } catch (Throwable th2) {
                m7936j("  ctor.newInstance 失败: " + th2.getMessage());
                objNewInstance = null;
            }
        } else {
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            if (cls != null) {
                try {
                    objNewInstanceByArgs = KavaReflector.newInstanceByArgs(cls, objArr);
                } catch (Throwable unused) {
                }
            }
            objNewInstance = objNewInstanceByArgs;
        }
        if (objNewInstance != null) {
            m7936j("  请求对象已创建: ".concat(objNewInstance.getClass().getName()));
        }
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public String m7939m(String str, String str2) {
        boolean z9;
        boolean z10 = false;
        try {
            z9 = ((C2458l) this.f12374d).m5853b().getBoolean("hb_fake_packet_receive_enable", false);
        } catch (Throwable unused) {
            z9 = false;
        }
        if (!z9) {
            return str;
        }
        ConcurrentHashMap concurrentHashMap = AbstractC3375a.f10902a;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!(!TextUtils.isEmpty(str2) && str2.replace("%40", "@").matches("^[0-9]+@chatroom$"))) {
            return str;
        }
        try {
            StringBuilder sb2 = new StringBuilder(str);
            int iIndexOf = str.indexOf(63);
            int i9 = iIndexOf >= 0 ? iIndexOf + 1 : 0;
            while (i9 < sb2.length()) {
                int iIndexOf2 = sb2.indexOf("&", i9);
                if (iIndexOf2 < 0) {
                    iIndexOf2 = sb2.length();
                }
                int iIndexOf3 = sb2.indexOf("=", i9);
                if (iIndexOf3 > i9 && iIndexOf3 < iIndexOf2) {
                    int i10 = iIndexOf3 + 1;
                    String strSubstring = sb2.substring(i10, iIndexOf2);
                    if (strSubstring.replace("%40", "@").toLowerCase().contains("chatroom") && !str2.equals(strSubstring.replace("%40", "@"))) {
                        String strReplace = strSubstring.contains("%40") ? str2.replace("@", "%40") : str2;
                        sb2.replace(i10, iIndexOf2, strReplace);
                        iIndexOf2 += strReplace.length() - strSubstring.length();
                        z10 = true;
                    }
                }
                i9 = iIndexOf2 + 1;
            }
            return z10 ? sb2.toString() : str;
        } catch (Throwable unused2) {
            return str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m7940n(String str, Map map) {
        C2914b c2914b = (C2914b) this.f12379i;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String str3 = map != null ? (String) map.get("talker") : HttpUrl.FRAGMENT_ENCODE_SET;
        if (map != null) {
            str2 = (String) map.get("nativeurl");
        }
        C2917e c2917e = c2914b.f9449h;
        c2917e.f9464h.m1204m(str3, str2, str, c2917e.m6330g(str2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public void m7941o(C3948b c3948b) {
        String str = c3948b.f12947a;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((Set) this.f12378h).remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public boolean m7942p(Map map, String str, String str2) {
        Object obj;
        ConcurrentHashMap concurrentHashMap = ((C2923k) this.f12375e).f9551n;
        if (map != null && !TextUtils.isEmpty(str)) {
            int iIntValue = concurrentHashMap.get(str) != null ? ((Integer) concurrentHashMap.get(str)).intValue() : 0;
            if (iIntValue < 1 && (obj = map.get("openReq")) != null) {
                int i9 = iIntValue + 1;
                concurrentHashMap.put(str, Integer.valueOf(i9));
                m7936j("静默拆包重试: sendid=" + str + " attempt=" + i9 + " reason=" + str2);
                StringBuilder sb2 = new StringBuilder("redpacket_open_retry:");
                sb2.append(str);
                m7928t(sb2.toString(), 1200 * ((long) i9), new RunnableC0217c((Object) this, str, obj, (Object) map, 17));
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public void m7943q(String str) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f12377g;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        for (int i9 = 0; i9 < size; i9++) {
            C3948b c3948b = (C3948b) arrayDeque.poll();
            if (c3948b != null) {
                int i10 = c3948b.f12949c;
                if (i10 >= 1) {
                    m7941o(c3948b);
                    m7937k("红包播报放弃: ".concat(str), null);
                } else {
                    arrayDeque.offer(new C3948b(i10 + 1, c3948b.f12947a, c3948b.f12948b));
                }
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        ((Handler) this.f12376f).postDelayed(new RunnableC0003a(this, 27), 800L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public boolean m7944r(String str, String str2) {
        C2923k c2923k = (C2923k) this.f12375e;
        ConcurrentHashMap concurrentHashMap = c2923k.f9550m;
        Map map = (Map) c2923k.f9548k.get(str);
        if (map != null) {
            int iIntValue = concurrentHashMap.get(str) != null ? ((Integer) concurrentHashMap.get(str)).intValue() : 0;
            if (iIntValue < 2) {
                String strValueOf = String.valueOf(map.get("content"));
                String str3 = (String) map.get("talker");
                String str4 = (String) map.get("nativeurl");
                if (!TextUtils.isEmpty(str4)) {
                    c2923k.f9552o.remove(str);
                    c2923k.f9553p.remove(str);
                    int i9 = iIntValue + 1;
                    StringBuilder sbM2258u = AbstractC0921a.m2258u(i9, "静默收包重试: sendid=", str, " attempt=", " reason=");
                    sbM2258u.append(str2);
                    m7936j(sbM2258u.toString());
                    m7928t("redpacket_receive_retry:" + str, ((long) i9) * 900, new RunnableC2539a(this, strValueOf, str3, str4, i9));
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void m7945s(C3948b c3948b) {
        try {
            TextToSpeech textToSpeech = (TextToSpeech) this.f12380j;
            if (textToSpeech != null) {
                textToSpeech.shutdown();
            }
        } catch (Throwable unused) {
        }
        this.f12380j = null;
        this.f12371a = false;
        int i9 = c3948b.f12949c;
        if (i9 >= 1) {
            m7941o(c3948b);
            m7937k("红包播报放弃: speak 返回错误", null);
        } else {
            ((ArrayDeque) this.f12377g).offer(new C3948b(i9 + 1, c3948b.f12947a, c3948b.f12948b));
            ((Handler) this.f12376f).postDelayed(new RunnableC0003a(this, 27), 800L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public boolean m7946u(Object obj, HashMap map, String str) {
        HashMap map2 = new HashMap(map);
        map2.put("requestTalker", str);
        Map map3 = ((C2923k) this.f12375e).f9549l;
        map3.put(obj, map2);
        if (((C2815c) this.f12376f).m6216j(obj)) {
            return true;
        }
        m7936j("  sendNetworkRequest 失败!");
        map3.remove(obj);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public boolean m7947v(C3948b c3948b) {
        String str = c3948b.f12948b;
        if (((TextToSpeech) this.f12380j) == null || TextUtils.isEmpty(str)) {
            m7941o(c3948b);
            return true;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("streamType", String.valueOf(3));
            if (((TextToSpeech) this.f12380j).speak(str, 1, bundle, "hchat_redpacket_" + System.currentTimeMillis()) == -1) {
                m7937k("红包播报失败", null);
                return false;
            }
            String str2 = c3948b.f12947a;
            if (TextUtils.isEmpty(str2)) {
                return true;
            }
            ((Set) this.f12379i).add(str2);
            ((Set) this.f12378h).remove(str2);
            return true;
        } catch (Throwable th2) {
            m7937k("红包播报失败: " + th2.getMessage(), th2);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public void m7948w(int i9, String str, String str2, String str3) {
        int i10;
        int i11;
        int i12;
        String str4;
        int i13;
        C2815c c2815c = (C2815c) this.f12376f;
        C2923k c2923k = (C2923k) this.f12375e;
        Set set = c2923k.f9552o;
        StringBuilder sb2 = new StringBuilder("trySilentReceive 开始, mode=");
        C2458l c2458l = (C2458l) this.f12374d;
        try {
            i10 = c2458l.m5853b().getInt("hb_grab_mode", 1);
        } catch (Throwable unused) {
            i10 = 1;
        }
        sb2.append(i10);
        sb2.append(" recvClass=");
        DexFinder dexFinder = (DexFinder) this.f12373c;
        sb2.append(dexFinder.receiveLuckyMoneyClass != null);
        sb2.append(" openClass=");
        sb2.append(dexFinder.openLuckyMoneyClass != null);
        sb2.append(" dispatcher=");
        sb2.append(c2815c.f9082c != null);
        sb2.append(" method=");
        sb2.append(((Method) c2815c.f9083d) != null);
        m7936j(sb2.toString());
        if (!c2458l.m5857f()) {
            m7936j("  放弃: silentGrabEnabled=false");
            return;
        }
        if (dexFinder.receiveLuckyMoneyClass == null && dexFinder.receiveLuckyMoneyUnionClass == null) {
            m7936j("  放弃: receiveLuckyMoneyClass=null union=null");
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            m7936j("  放弃: nu=empty");
            return;
        }
        try {
            String strM6614d = AbstractC3107b.m6614d(str3, "sendid");
            m7936j("  sendid=" + strM6614d);
            if (TextUtils.isEmpty(strM6614d)) {
                return;
            }
            if (!c2923k.f9554q.contains(strM6614d) && !set.contains(strM6614d) && !c2923k.f9553p.contains(strM6614d)) {
                if (!set.add(strM6614d)) {
                    m7936j("  放弃: sendid add竞争失败");
                    return;
                }
                c2923k.f9550m.put(strM6614d, Integer.valueOf(i9));
                String strM6614d2 = AbstractC3107b.m6614d(str3, "msgtype");
                if (TextUtils.isEmpty(strM6614d2)) {
                    i11 = 1;
                } else {
                    try {
                        i11 = Integer.parseInt(strM6614d2);
                    } catch (Throwable unused2) {
                        i11 = 1;
                    }
                }
                String strM6614d3 = AbstractC3107b.m6614d(str3, "channelid");
                if (TextUtils.isEmpty(strM6614d3)) {
                    i12 = 1;
                } else {
                    try {
                        i12 = Integer.parseInt(strM6614d3);
                    } catch (Throwable unused3) {
                        i12 = 1;
                    }
                }
                String strM6615e = AbstractC3107b.m6615e(str, "headimgurl");
                String strM6615e2 = AbstractC3107b.m6615e(str, "sendertitle");
                String strM7939m = m7939m(str3, str2);
                boolean z9 = AbstractC3107b.m6613c(str, str2, str3) == 1005 && dexFinder.receiveLuckyMoneyUnionClass != null;
                HashMap map = new HashMap();
                map.put("sendid", strM6614d);
                String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                map.put("content", str != null ? str : HttpUrl.FRAGMENT_ENCODE_SET);
                map.put("nativeurl", str3);
                map.put("requestNativeUrl", strM7939m);
                map.put("talker", str2);
                map.put("msgtype", Integer.valueOf(i11));
                map.put("channelid", Integer.valueOf(i12));
                map.put("headimg", strM6615e != null ? strM6615e : HttpUrl.FRAGMENT_ENCODE_SET);
                map.put("nickname", strM6615e2 != null ? strM6615e2 : HttpUrl.FRAGMENT_ENCODE_SET);
                map.put("isUnion", Boolean.valueOf(z9));
                c2923k.f9548k.put(strM6614d, map);
                StringBuilder sb3 = new StringBuilder("  构造请求: mt=");
                sb3.append(i11);
                sb3.append(" ci=");
                sb3.append(i12);
                sb3.append(" union=");
                sb3.append(z9);
                sb3.append(" ctor=");
                sb3.append(dexFinder.receiveCtor != null);
                m7936j(sb3.toString());
                if (z9) {
                    str4 = strM6614d;
                    Object objM7938l = m7938l(dexFinder.receiveLuckyMoneyUnionClass, dexFinder.unionReceiveCtor, new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), str4, strM7939m, 1, "v1.0"});
                    i13 = (objM7938l == null || !m7946u(objM7938l, map, str2)) ? 0 : 1;
                } else {
                    str4 = strM6614d;
                    int i14 = 0;
                    for (String str6 : m7930b(str2, str3)) {
                        String str7 = str4;
                        Object objM7938l2 = m7938l(dexFinder.receiveLuckyMoneyClass, dexFinder.receiveCtor, new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), str4, strM7939m, 1, "v1.0", str6});
                        if (objM7938l2 != null && m7946u(objM7938l2, map, str6)) {
                            i14++;
                        }
                        str4 = str7;
                    }
                    i13 = i14;
                }
                String str8 = str4;
                if (i13 <= 0) {
                    if (m7944r(str8, "无法创建或发送请求对象")) {
                        return;
                    }
                    m7931d(str8);
                    m7936j("  放弃: 无法创建或发送请求对象");
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("静默收包: ");
                sb4.append(str8);
                sb4.append(" count=");
                sb4.append(i13);
                if (z9) {
                    str5 = " [Union]";
                }
                sb4.append(str5);
                m7936j(sb4.toString());
                m7928t("redpacket_receive_timeout:" + str8, 4500L, new RunnableC3777a(this, str8, 1));
                return;
            }
            m7936j("  放弃: sendid 已处理中");
        } catch (Throwable th2) {
            m7936j("ERROR trySilentReceive: " + th2.getMessage());
            th2.printStackTrace();
        }
    }

    public C3779c(DexFinder dexFinder, C2458l c2458l, C2923k c2923k, C2815c c2815c, C2399h c2399h, C2914b c2914b, C2914b c2914b2, C2914b c2914b3) {
        this.f12371a = false;
        this.f12372b = false;
        this.f12373c = dexFinder;
        this.f12374d = c2458l;
        this.f12375e = c2923k;
        this.f12376f = c2815c;
        this.f12377g = c2399h;
        this.f12378h = c2914b;
        this.f12379i = c2914b2;
        this.f12380j = c2914b3;
    }
}
