package p065eb;

import be.C0285i;
import ca.C0512c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p063e9.C0837h;
import p069f.C0939i0;
import p096g8.C1363d;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.model.WeChatChatroom;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3143g;
import p218og.C3145i;
import p218og.C3147k;
import p218og.InterfaceC3142f;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;
import tf.C4174u;

/* JADX INFO: renamed from: eb.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0861d {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f2641b;

    /* JADX INFO: renamed from: a */
    public static final C0861d f2640a = new C0861d();

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f2642c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap f2643d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap f2644e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public static final List f2645f = AbstractC0000a.m101y0("加入了群聊", "joined the group chat", "invited", "邀请", "二维码", "scan the qr code", "通过扫描");

    /* JADX INFO: renamed from: g */
    public static final List f2646g = AbstractC0000a.m101y0("移出了群聊", "removed from the group chat", "退出了群聊", "left the group chat");

    /* JADX INFO: renamed from: h */
    public static final C3147k f2647h = new C3147k("<link\\b[^>]*\\bname=\"([^\"]+)\"[^>]*\\busername=\"([^\"]+)\"", 0);

    /* JADX INFO: renamed from: i */
    public static final C3147k f2648i = new C3147k("<link\\b[^>]*\\busername=\"([^\"]+)\"[^>]*\\bname=\"([^\"]+)\"", 0);

    /* JADX INFO: renamed from: j */
    public static final C3147k f2649j = new C3147k("<member\\b[^>]*\\bnickname=\"([^\"]+)\"[^>]*\\busername=\"([^\"]+)\"", 0);

    /* JADX INFO: renamed from: k */
    public static final C3147k f2650k = new C3147k("<member\\b[^>]*\\busername=\"([^\"]+)\"[^>]*\\bnickname=\"([^\"]+)\"", 0);

    /* JADX INFO: renamed from: l */
    public static final C3147k f2651l = new C3147k("\\busername=\"([^\"]+)\"[^>]{0,160}?\\bname=\"([^\"]+)\"", 0);

    /* JADX INFO: renamed from: m */
    public static final C3147k f2652m = new C3147k("\\bname=\"([^\"]+)\"[^>]{0,160}?\\busername=\"([^\"]+)\"", 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m2163a(String str, String str2) {
        return AbstractC4855en.m9264h(str, "|", str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m2164b(String str, String str2) {
        String str3;
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string2 = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
        if (string2 != null) {
            str4 = string2;
        }
        if (string.length() != 0 && str4.length() != 0 && (str3 = (String) f2643d.get(m2163a(string, str4))) != null) {
            if ((AbstractC3149m.m6721t0(str3) || str3.equals(str4)) ? false : true) {
                return str3;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2165c(String str, LinkedHashMap linkedHashMap) {
        if (AbstractC3149m.m6721t0(str)) {
            return;
        }
        C0939i0 c0939i0 = new C0939i0(C3147k.m6681c(f2647h, str));
        while (c0939i0.hasNext()) {
            C3145i c3145i = (C3145i) ((InterfaceC3142f) c0939i0.next());
            String string = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i.m6676a()).get(1))).toString();
            String string2 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i.m6676a()).get(2))).toString();
            if (string2.length() > 0) {
                linkedHashMap.put(string2, string);
            }
        }
        C0939i0 c0939i02 = new C0939i0(C3147k.m6681c(f2648i, str));
        while (c0939i02.hasNext()) {
            C3145i c3145i2 = (C3145i) ((InterfaceC3142f) c0939i02.next());
            String string3 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i2.m6676a()).get(1))).toString();
            String string4 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i2.m6676a()).get(2))).toString();
            if (string3.length() > 0) {
                linkedHashMap.put(string3, string4);
            }
        }
        C0939i0 c0939i03 = new C0939i0(C3147k.m6681c(f2649j, str));
        while (c0939i03.hasNext()) {
            C3145i c3145i3 = (C3145i) ((InterfaceC3142f) c0939i03.next());
            String string5 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i3.m6676a()).get(1))).toString();
            String string6 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i3.m6676a()).get(2))).toString();
            if (string6.length() > 0) {
                linkedHashMap.put(string6, string5);
            }
        }
        C0939i0 c0939i04 = new C0939i0(C3147k.m6681c(f2650k, str));
        while (c0939i04.hasNext()) {
            C3145i c3145i4 = (C3145i) ((InterfaceC3142f) c0939i04.next());
            String string7 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i4.m6676a()).get(1))).toString();
            String string8 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i4.m6676a()).get(2))).toString();
            if (string7.length() > 0) {
                linkedHashMap.put(string7, string8);
            }
        }
        C0939i0 c0939i05 = new C0939i0(C3147k.m6681c(f2651l, str));
        while (c0939i05.hasNext()) {
            C3145i c3145i5 = (C3145i) ((InterfaceC3142f) c0939i05.next());
            String string9 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i5.m6676a()).get(1))).toString();
            String string10 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i5.m6676a()).get(2))).toString();
            if (string9.length() > 0 && string10.length() > 0 && !linkedHashMap.containsKey(string9)) {
                linkedHashMap.put(string9, string10);
            }
        }
        C0939i0 c0939i06 = new C0939i0(C3147k.m6681c(f2652m, str));
        while (c0939i06.hasNext()) {
            C3145i c3145i6 = (C3145i) ((InterfaceC3142f) c0939i06.next());
            String string11 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i6.m6676a()).get(1))).toString();
            String string12 = AbstractC3149m.m6703R0(m2166d((String) ((C3143g) c3145i6.m6676a()).get(2))).toString();
            if (string12.length() > 0 && string11.length() > 0 && !linkedHashMap.containsKey(string12)) {
                linkedHashMap.put(string12, string11);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2166d(String str) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&lt;", "<", false), "&gt;", ">", false), "&quot;", "\"", false), "&apos;", "'", false), "&amp;", "&", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m2167e(String str, String str2, String str3, String str4) {
        String string = AbstractC3149m.m6703R0(str3).toString();
        if (string.length() == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ConcurrentHashMap concurrentHashMap = f2644e;
        if (concurrentHashMap.size() >= 128) {
            concurrentHashMap.entrySet().removeIf(new C0285i(new C0512c(jCurrentTimeMillis, 3), 9));
        }
        String strM1033v = AbstractC0255e.m1033v(str, "|", str2, "|", string);
        Long l10 = (Long) concurrentHashMap.get(strM1033v);
        if (l10 == null || jCurrentTimeMillis - l10.longValue() >= 5000) {
            concurrentHashMap.put(strM1033v, Long.valueOf(jCurrentTimeMillis));
            ScriptPluginRuntime.INSTANCE.dispatchOnMemberChange(str, str2, string, str4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m2168f(String str, String str2) {
        String strM3676h;
        String strM3729r;
        String strM2164b = m2164b(str, str2);
        if (strM2164b != null) {
            return strM2164b;
        }
        C1363d c1363dM5159f = AbstractC2091b.m5159f();
        String str3 = null;
        if (c1363dM5159f == null || (strM3676h = c1363dM5159f.m3676h(str, str2)) == null || AbstractC3149m.m6721t0(strM3676h)) {
            strM3676h = null;
        }
        if (strM3676h != null) {
            return strM3676h;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (c1368iM9259c != null && (strM3729r = c1368iM9259c.m3729r(str2)) != null && !AbstractC3149m.m6721t0(strM3729r)) {
            str3 = strM3729r;
        }
        return str3 != null ? str3 : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m2169g() {
        C1363d c1363dM5159f = AbstractC2091b.m5159f();
        if (c1363dM5159f != null) {
            for (WeChatChatroom weChatChatroom : c1363dM5159f.m3675g()) {
                String string = AbstractC3149m.m6703R0(weChatChatroom.chatroomId).toString();
                if (string.length() != 0) {
                    C3011i c3011i = new C3011i(AbstractC3015m.m6413W(AbstractC4166m.m8415m1(weChatChatroom.memberIds), new C0837h(9)), true, new C0837h(10));
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    AbstractC3015m.m6417a0(c3011i, linkedHashSet);
                    if (!linkedHashSet.isEmpty()) {
                        f2642c.putIfAbsent(string, linkedHashSet);
                        m2170h(string, linkedHashSet);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m2170h(String str, LinkedHashSet linkedHashSet) {
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        Map mapM3734w = c1368iM9259c != null ? c1368iM9259c.m3734w(str) : null;
        if (mapM3734w == null) {
            mapM3734w = C4174u.f13711g;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            String str3 = (String) mapM3734w.get(str2);
            String string = str3 != null ? AbstractC3149m.m6703R0(str3).toString() : null;
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String strM2163a = m2163a(str, str2);
            ConcurrentHashMap concurrentHashMap = f2643d;
            concurrentHashMap.remove(strM2163a);
            if (string.length() > 0 && !string.equals(str2)) {
                concurrentHashMap.put(m2163a(str, str2), string);
            }
        }
    }
}
