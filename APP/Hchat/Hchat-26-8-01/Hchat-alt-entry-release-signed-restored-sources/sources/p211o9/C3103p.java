package p211o9;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import bb.C0250l;
import be.C0285i;
import ca.C0532s;
import ca.RunnableC0537x;
import gg.AbstractC1416l;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p015b0.C0153s;
import p025bc.AbstractC0255e;
import p069f.C0939i0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p092g4.AbstractC1341a;
import p096g8.C1362c;
import p096g8.C1363d;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatChatroom;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p136j8.C2105p;
import p142jg.AbstractC2133a;
import p142jg.AbstractC2136d;
import p153k8.C2341e;
import p153k8.C2343g;
import p174m.C2576b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p218og.InterfaceC3142f;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: renamed from: o9.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3103p {

    /* JADX INFO: renamed from: k */
    public static final List f10020k = AbstractC0000a.m101y0("邀请", "invited");

    /* JADX INFO: renamed from: l */
    public static final List f10021l = AbstractC0000a.m101y0("加入了群聊", "joined the group chat", "join the group chat");

    /* JADX INFO: renamed from: m */
    public static final List f10022m = AbstractC0000a.m101y0("移出了群聊", "退出了群聊", "left the group chat", "removed from the group chat");

    /* JADX INFO: renamed from: n */
    public static final C3147k f10023n = new C3147k("<(?:link|member)\\b[^>]*>", 0);

    /* JADX INFO: renamed from: o */
    public static final C3147k f10024o = new C3147k("([A-Za-z0-9_:-]+)\\s*=\\s*\"([^\"]*)\"");

    /* JADX INFO: renamed from: a */
    public final C2026t f10025a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f10026b;

    /* JADX INFO: renamed from: c */
    public final C0250l f10027c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f10028d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f10029e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f10030f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f10031g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f10032h;

    /* JADX INFO: renamed from: i */
    public final Object f10033i;

    /* JADX INFO: renamed from: j */
    public final C3147k f10034j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3103p(C3742g c3742g, C2026t c2026t) {
        c3742g.getClass();
        this.f10025a = c2026t;
        Context context = c3742g.f12143a;
        this.f10026b = AbstractC4302b.m8640c(context, "Hchat_group_leave_monitor_config");
        this.f10027c = new C0250l(context);
        this.f10028d = new ConcurrentHashMap();
        this.f10029e = new ConcurrentHashMap();
        this.f10030f = new ConcurrentHashMap();
        this.f10031g = new ConcurrentHashMap();
        this.f10032h = new ConcurrentHashMap();
        this.f10033i = new Object();
        this.f10034j = new C3147k("\\[AtWx=([^\\]]+)]");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: A */
    public static String m6574A(String str, C3104q c3104q) {
        switch (str.hashCode()) {
            case -1945814489:
                if (str.equals("group_member_reply_left_card_title")) {
                    return c3104q.f10056l;
                }
                return null;
            case -1587269406:
                if (str.equals("group_member_reply_left_card_desc")) {
                    return c3104q.f10057m;
                }
                return null;
            case -931160507:
                if (str.equals("group_member_reply_join_card_desc")) {
                    return c3104q.f10055k;
                }
                return null;
            case -709348824:
                if (str.equals("group_member_reply_join_text")) {
                    return c3104q.f10052h;
                }
                return null;
            case 1213692196:
                if (str.equals("group_member_reply_join_card_title")) {
                    return c3104q.f10054j;
                }
                return null;
            case 1526706539:
                if (str.equals("group_member_reply_left_text")) {
                    return c3104q.f10053i;
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static void m6575F(long j3) {
        if (j3 <= 0) {
            return;
        }
        try {
            Thread.sleep(j3);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static ArrayList m6576G(String str) {
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{'|', ','}, 6);
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
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m6577b(String str, C3101n c3101n) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "%userName%", c3101n.f10013b, false), "%groupNickname%", c3101n.f10014c, false), "%userWxid%", c3101n.f10012a, false), "%realNameTail%", c3101n.f10015d, false), "%gender%", c3101n.f10016e, false), "%region%", c3101n.f10017f, false), "%groupName%", c3101n.f10018g, false), "%time%", c3101n.f10019h, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m6578e(String str, String str2) {
        return AbstractC4855en.m9264h(str, "|", str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m6579h(String str, String str2, LinkedHashMap linkedHashMap) {
        String str3;
        String string;
        int iM6716o0;
        if (AbstractC3149m.m6721t0(str2)) {
            return;
        }
        C0939i0 c0939i0 = new C0939i0(C3147k.m6681c(f10023n, str2));
        while (c0939i0.hasNext()) {
            C3145i c3145i = (C3145i) ((InterfaceC3142f) c0939i0.next());
            String strM6678c = c3145i.m6678c();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            C0939i0 c0939i02 = new C0939i0(C3147k.m6681c(f10024o, strM6678c));
            while (true) {
                boolean zHasNext = c0939i02.hasNext();
                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (!zHasNext) {
                    break;
                }
                C3145i c3145i2 = (C3145i) ((InterfaceC3142f) c0939i02.next());
                String str4 = (String) AbstractC4166m.m8425w1(1, c3145i2.m6676a());
                if (str4 != null) {
                    Locale locale = Locale.US;
                    string = AbstractC2091b.m5165l(locale, str4, locale);
                }
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String str5 = (String) AbstractC4166m.m8425w1(2, c3145i2.m6676a());
                if (str5 != null) {
                    str3 = str5;
                }
                String strM6580i = m6580i(str3);
                if (!AbstractC3149m.m6721t0(string)) {
                    linkedHashMap2.put(string, strM6580i);
                }
            }
            String str6 = (String) linkedHashMap2.get("username");
            string = str6 != null ? AbstractC3149m.m6703R0(str6).toString() : null;
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (m6584r(str, string) && !linkedHashMap.containsKey(string)) {
                String str7 = (String) linkedHashMap2.get("name");
                String str8 = (String) linkedHashMap2.get("nickname");
                int i9 = c3145i.m6677b().f8313h + 1;
                String[] strArr = {str7, str8, (i9 <= 0 || i9 >= str2.length() || (iM6716o0 = AbstractC3149m.m6716o0(str2, "</link>", i9, true)) <= i9) ? HttpUrl.FRAGMENT_ENCODE_SET : AbstractC2091b.m5161h("<[^>]+>", m6580i(str2.substring(i9, iM6716o0)), HttpUrl.FRAGMENT_ENCODE_SET)};
                int i10 = 0;
                while (true) {
                    if (i10 >= 3) {
                        break;
                    }
                    String str9 = strArr[i10];
                    if (str9 != null && !AbstractC3149m.m6721t0(str9)) {
                        str3 = str9;
                        break;
                    }
                    i10++;
                }
                linkedHashMap.put(string, new C3096i(string, AbstractC3149m.m6703R0(str3).toString()));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m6580i(String str) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&lt;", "<", false), "&gt;", ">", false), "&quot;", "\"", false), "&apos;", "'", false), "&amp;", "&", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m6581k(String str) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&", "&amp;", false), "<", "&lt;", false), ">", "&gt;", false), "\"", "&quot;", false), "'", "&apos;", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m6582m(String str) {
        String strM3674f;
        String strDisplayName;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String str2 = null;
        WeChatContact weChatContactM3725n = c1368iM9259c != null ? c1368iM9259c.m3725n(str) : null;
        if (weChatContactM3725n != null && (strDisplayName = weChatContactM3725n.displayName()) != null) {
            if (!((AbstractC3149m.m6721t0(strDisplayName) || strDisplayName.equals(str)) ? false : true)) {
                strDisplayName = null;
            }
            if (strDisplayName != null) {
                return strDisplayName;
            }
        }
        C1363d c1363dM5159f = AbstractC2091b.m5159f();
        if (c1363dM5159f != null && (strM3674f = c1363dM5159f.m3674f(str)) != null && !AbstractC3149m.m6721t0(strM3674f)) {
            str2 = strM3674f;
        }
        return str2 != null ? str2 : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m6583n(String str, String str2) {
        return AbstractC4855en.m9264h(str, "_", str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m6584r(String str, String str2) {
        String string = str2 != null ? AbstractC3149m.m6703R0(str2).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return (string.length() <= 0 || string.equals(str) || string.equals("notify@all") || AbstractC3156t.m6733W(string, "@chatroom", false) || AbstractC3156t.m6733W(string, "@im.chatroom", false)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static String m6585v(String str) {
        int iHashCode = str.hashCode();
        return (iHashCode == -1392885889 ? str.equals("before") : iHashCode == 3387192 ? str.equals("none") : iHashCode == 92734940 && str.equals("after")) ? str : "none";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m6586w(String str) {
        int iHashCode = str.hashCode();
        return (iHashCode == 3029889 ? str.equals("both") : iHashCode == 3046160 ? str.equals(WeChatSnsPost.TYPE_CARD) : iHashCode == 3556653 && str.equals(WeChatSnsPost.TYPE_TEXT)) ? str : WeChatSnsPost.TYPE_TEXT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static String m6587y(String str) {
        List listM6692G0 = AbstractC3149m.m6692G0(str, new String[]{"||"});
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6692G0));
        Iterator it = listM6692G0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        AbstractC2133a abstractC2133a = AbstractC2136d.f7122g;
        return (String) arrayList2.get(AbstractC2136d.f7122g.m5360g(arrayList2.size()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m6588B(String str, LinkedHashSet linkedHashSet) {
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
            String strM6578e = m6578e(str, str2);
            ConcurrentHashMap concurrentHashMap = this.f10030f;
            concurrentHashMap.remove(strM6578e);
            if (string.length() > 0 && !string.equals(str2)) {
                concurrentHashMap.put(m6578e(str, str2), string);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final void m6589C(String str, C3096i c3096i) {
        String str2 = c3096i.f10000b;
        String str3 = c3096i.f9999a;
        String string = AbstractC3149m.m6703R0(str2).toString();
        if (string.length() <= 0 || string.equals(str3)) {
            return;
        }
        this.f10030f.put(m6578e(str, str3), string);
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: byte[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m6590D(String str, String str2, C3101n c3101n, C3104q c3104q) {
        Object c3959f;
        String str3;
        C2343g c2343gMessages;
        String str4 = str.equals("join") ? "group_member_reply_join_card_title" : "group_member_reply_left_card_title";
        String str5 = str.equals("join") ? "group_member_reply_join_card_desc" : "group_member_reply_left_card_desc";
        String str6 = str.equals("join") ? "欢迎：%userName%" : "离群：%userName%";
        str.equals("join");
        String strM6577b = m6577b(m6587y(m6596f(str2, str4, str6, c3104q)), c3101n);
        String strM6577b2 = m6577b(m6587y(m6596f(str2, str5, "ID：%userWxid%\n名片：%groupNickname%\n时间：%time%", c3104q)), c3101n);
        if (AbstractC3149m.m6721t0(strM6577b) && AbstractC3149m.m6721t0(strM6577b2)) {
            return;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String strM3724m = c1368iM9259c != null ? c1368iM9259c.m3724m(c3101n.f10012a, true) : null;
        if (strM3724m == null) {
            strM3724m = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str7 = strM3724m;
        if (!AbstractC3149m.m6721t0(str7)) {
            try {
                URLConnection uRLConnectionOpenConnection = new URL(str7).openConnection();
                uRLConnectionOpenConnection.getClass();
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                httpURLConnection.setConnectTimeout(1200);
                httpURLConnection.setReadTimeout(1200);
                httpURLConnection.setRequestMethod("GET");
                InputStream inputStream = httpURLConnection.getInputStream();
                try {
                    inputStream.getClass();
                    c3959f = AbstractC1341a.m3576G(inputStream);
                    inputStream.close();
                    httpURLConnection.disconnect();
                } finally {
                }
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            obj = (byte[]) (c3959f instanceof C3959f ? null : c3959f);
        }
        byte[] bArr = obj;
        C2105p c2105pMedia = WeChatApis.media();
        if (c2105pMedia != null) {
            str3 = str2;
            if (c2105pMedia.m5303c(str3, strM6577b, strM6577b2, str7, bArr, HttpUrl.FRAGMENT_ENCODE_SET)) {
                return;
            }
        } else {
            str3 = str2;
        }
        if ((AbstractC3149m.m6721t0(strM6577b) && AbstractC3149m.m6721t0(strM6577b2)) || (c2343gMessages = WeChatApis.messages()) == null) {
            return;
        }
        List listM101y0 = AbstractC0000a.m101y0(strM6577b, strM6577b2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM101y0) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList.add(obj);
            }
        }
        c2343gMessages.m5601x(str3, AbstractC4166m.m8392A1(arrayList, "\n", null, null, null, 62));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[PHI: r8
  0x0034: PHI (r8v4 java.lang.String) = (r8v2 java.lang.String), (r8v3 java.lang.String), (r8v12 java.lang.String) binds: [B:25:0x004d, B:22:0x0046, B:17:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6591E(String str, String str2, C3101n c3101n, C3104q c3104q) {
        String string;
        String str3 = str.equals("join") ? "group_member_reply_join_text" : "group_member_reply_left_text";
        String string2 = str.equals("join") ? "[AtWx=%userWxid%]\n欢迎进群\n时间：%time%\n群昵称：%groupName%\n进群者微信昵称：%userName%\n进群者群内昵称：%groupNickname%\n进群者ID：%userWxid%" : "退群通知：\n时间：%time%\n群昵称：%groupName%\n退群者微信昵称：%userName%\n退群者群内昵称：%groupNickname%\n退群者ID：%userWxid%";
        SharedPreferences sharedPreferences = this.f10026b;
        if (c3104q != null) {
            String strM6574A = m6574A(str3, c3104q);
            if (c3104q.f10050f.equals("global") || strM6574A == null) {
                string = sharedPreferences.getString(str3, string2);
                if (string != null) {
                    string2 = string;
                }
            } else {
                string2 = strM6574A;
            }
        } else if (m6592H(str2)) {
            String strM6583n = m6583n(str3, str2);
            string = HttpUrl.FRAGMENT_ENCODE_SET;
            string2 = sharedPreferences.getString(strM6583n, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string2 == null) {
            }
        } else {
            string = sharedPreferences.getString(str3, string2);
            if (string != null) {
            }
        }
        String strM6587y = m6587y(string2);
        if (AbstractC3149m.m6721t0(strM6587y)) {
            return;
        }
        String strM6577b = m6577b(strM6587y, c3101n);
        if (AbstractC3149m.m6721t0(strM6577b)) {
            return;
        }
        C2343g c2343gM6844q = AbstractC3199a.m6844q();
        if (c2343gM6844q == null) {
            c2343gM6844q = WeChatApis.messages();
        }
        if (c2343gM6844q == null) {
            this.f10025a.invoke("进退群自动回复发送失败: 消息发送 API 未就绪", null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C3098k c3098k = arrayList.isEmpty() ? null : new C3098k(this.f10034j.m6684e(strM6577b, new C0153s(arrayList, this, str2, 13)), AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)));
        if (c3098k == null) {
            c2343gM6844q.m5601x(str2, strM6577b);
            return;
        }
        List list = c3098k.f10006b;
        String str4 = c3098k.f10005a;
        if ((list.isEmpty() ? c2343gM6844q.m5601x(str2, str4) : c2343gM6844q.m5602y(str2, str4, list)) || AbstractC3149m.m6721t0(str4)) {
            return;
        }
        c2343gM6844q.m5601x(str2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final boolean m6592H(String str) {
        String string = this.f10026b.getString(m6583n("group_member_reply_prompt_type", str), "global");
        if (string == null) {
            string = "global";
        }
        return !string.equals("global");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m6593a(String str, Map map, Map map2) {
        LinkedHashSet linkedHashSetM8353U = AbstractC4156d0.m8353U(map.keySet(), map2.keySet());
        return linkedHashSetM8353U.isEmpty() ? str : new C3147k(AbstractC4166m.m8392A1(AbstractC4166m.m8402K1(linkedHashSetM8353U, new C3102o()), "|", null, null, new C3092e(0), 30)).m6684e(str, new C0153s(map2, this, map, 12));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m6594c(String str, C3097j c3097j, C3097j c3097j2, int i9) {
        String string = this.f10026b.getString("group_invite_detail_notice_text", "邀请者：%inviterName% (%inviterWxid%)\n被邀请者：%inviteeName% (%inviteeWxid%)\n累计邀请：%inviteCount%");
        String str2 = string != null ? string : "邀请者：%inviterName% (%inviterWxid%)\n被邀请者：%inviteeName% (%inviteeWxid%)\n累计邀请：%inviteCount%";
        C3958e c3958e = new C3958e("%inviterName%", c3097j.m6572a());
        C3958e c3958e2 = new C3958e("%inviterGroupNickname%", c3097j.f10001a);
        C3958e c3958e3 = new C3958e("%inviteeName%", c3097j2.m6572a());
        C3958e c3958e4 = new C3958e("%inviteeGroupNickname%", c3097j2.f10001a);
        if (i9 < 1) {
            i9 = 1;
        }
        return m6593a(str2, AbstractC4178y.m8439b0(c3958e, c3958e2, c3958e3, c3958e4, new C3958e("%inviteCount%", String.valueOf(i9)), new C3958e("%groupName%", m6582m(str)), new C3958e("%time%", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date()))), AbstractC4178y.m8439b0(new C3958e("%inviterWxid%", c3097j.f10004d), new C3958e("%inviteeWxid%", c3097j2.f10004d)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m6595d(String str, C3097j c3097j) {
        String strM6573b = c3097j.m6573b();
        String str2 = c3097j.f10001a;
        String str3 = c3097j.f10004d;
        String str4 = c3097j.f10003c;
        String str5 = c3097j.f10002b;
        String str6 = AbstractC3149m.m6721t0(str5) ? str3 : str5;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strM6573b);
        strM6573b.getClass();
        if (!AbstractC3149m.m6721t0(str2) && !AbstractC3149m.m6721t0(str5) && !strM6573b.equals(str5)) {
            sb2.append('(');
            sb2.append(str6);
            sb2.append(')');
        }
        str6.getClass();
        if (!AbstractC3149m.m6721t0(str4) && !str4.equals(strM6573b) && !str4.equals(str6)) {
            sb2.append('[');
            sb2.append(str4);
            sb2.append(']');
        }
        String string = sb2.toString();
        String string2 = this.f10026b.getString("group_leave_monitor_notice_text", "%displayName%(%userWxid%) 退出了群聊");
        String str7 = string2 != null ? string2 : "%displayName%(%userWxid%) 退出了群聊";
        Map mapM8439b0 = AbstractC4178y.m8439b0(new C3958e("%displayName%", string), new C3958e("%groupNickname%", str2), new C3958e("%userName%", str5), new C3958e("%remarkName%", str4), new C3958e("%groupName%", m6582m(str)), new C3958e("%time%", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date())));
        Map mapSingletonMap = Collections.singletonMap("%userWxid%", str3);
        mapSingletonMap.getClass();
        return m6593a(str7, mapM8439b0, mapSingletonMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m6596f(String str, String str2, String str3, C3104q c3104q) {
        SharedPreferences sharedPreferences = this.f10026b;
        String string = sharedPreferences.getString(str2, str3);
        if (string != null) {
            str3 = string;
        }
        if (c3104q != null) {
            String strM6574A = m6574A(str2, c3104q);
            if (!c3104q.f10050f.equals("global") && strM6574A != null && !AbstractC3149m.m6721t0(strM6574A)) {
                return strM6574A;
            }
        } else if (m6592H(str)) {
            String strM6583n = m6583n(str2, str);
            String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
            String string2 = sharedPreferences.getString(strM6583n, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string2 != null) {
                str4 = string2;
            }
            if (!AbstractC3149m.m6721t0(str4)) {
                return str4;
            }
        }
        return str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m6597g(String str) {
        this.f10032h.keySet().removeIf(new C0285i(new C0532s(AbstractC0255e.m1020i(str, "|"), 15), 21));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070  */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m6598j(String str, String str2, int i9, C3104q c3104q) {
        int i10;
        SharedPreferences sharedPreferences = this.f10026b;
        int i11 = sharedPreferences.getInt(str2, i9);
        if (i11 < 0) {
            i11 = 0;
        }
        if (c3104q == null) {
            if (AbstractC1416l.m3825a(sharedPreferences.getString("group_member_reply_delay_mode_" + str, "global"), "custom")) {
                i11 = sharedPreferences.getInt(m6583n(str2, str), i11);
            }
        } else if (c3104q.f10037C.equals("custom")) {
            switch (str2.hashCode()) {
                case -1459240629:
                    i10 = !str2.equals("group_member_reply_file_delay_ms") ? 100 : c3104q.f10043I;
                    break;
                case -1204580096:
                    if (str2.equals("group_member_reply_image_delay_ms")) {
                        i10 = c3104q.f10039E;
                        break;
                    }
                    break;
                case -292247072:
                    if (str2.equals("group_member_reply_video_delay_ms")) {
                        i10 = c3104q.f10042H;
                        break;
                    }
                    break;
                case -143181047:
                    if (str2.equals("group_member_reply_voice_delay_ms")) {
                        i10 = c3104q.f10040F;
                        break;
                    }
                    break;
                case -41214421:
                    if (str2.equals("group_member_reply_favorite_delay_ms")) {
                        i10 = c3104q.f10044J;
                        break;
                    }
                    break;
                case 666720483:
                    if (str2.equals("group_member_reply_prompt_delay_ms")) {
                        i10 = c3104q.f10038D;
                        break;
                    }
                    break;
                case 742871669:
                    if (str2.equals("group_member_reply_emoji_delay_ms")) {
                        i10 = c3104q.f10041G;
                        break;
                    }
                    break;
            }
            i11 = i10;
        }
        return i11 >= 0 ? i11 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:145:0x00b7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022d A[LOOP:1: B:74:0x0227->B:76:0x022d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025a  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v42, types: [tf.t] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r3v49, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v51, types: [java.util.Collection] */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6599l(final String str, final String str2, final C3101n c3101n, final C3104q c3104q) {
        String strM6586w;
        String str3;
        String str4;
        C3104q c3104q2;
        Iterator it;
        ?? arrayList;
        Iterator it2;
        ?? r16;
        final C3103p c3103p;
        String str5;
        List<C3100m> listM99x0;
        String string;
        Object c3959f;
        final C3103p c3103p2 = this;
        String str6 = c3104q != null ? c3104q.f10050f : null;
        String str7 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str6 == null) {
            str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        SharedPreferences sharedPreferences = c3103p2.f10026b;
        if (c3104q == null) {
            String string2 = sharedPreferences.getString(m6583n("group_member_reply_prompt_type", str2), "global");
            if (string2 == null) {
                string2 = "global";
            }
            if (string2.equals("global")) {
                String string3 = sharedPreferences.getString("group_member_reply_prompt_type", WeChatSnsPost.TYPE_TEXT);
                if (string3 == null) {
                    string3 = WeChatSnsPost.TYPE_TEXT;
                }
                strM6586w = m6586w(string3);
            } else {
                strM6586w = m6586w(string2);
            }
        } else if (AbstractC3149m.m6721t0(str6) || str6.equals("global")) {
            String string4 = sharedPreferences.getString("group_member_reply_prompt_type", WeChatSnsPost.TYPE_TEXT);
            if (string4 == null) {
                string4 = WeChatSnsPost.TYPE_TEXT;
            }
            strM6586w = m6586w(string4);
        } else {
            strM6586w = m6586w(str6);
        }
        String str8 = strM6586w;
        String string5 = sharedPreferences.getString("group_member_reply_media_order", "none");
        if (string5 == null) {
            string5 = "none";
        }
        String strM6585v = m6585v(string5);
        if (c3104q != null) {
            String str9 = c3104q.f10058n;
            if (!str9.equals("none")) {
                if (str9.equals("custom")) {
                    strM6585v = m6585v(c3104q.f10059o);
                }
                str3 = strM6585v;
            }
            str3 = "none";
        } else {
            String strM6603s = c3103p2.m6603s(str2, null);
            if (!strM6603s.equals("none")) {
                if (strM6603s.equals("custom")) {
                    String string6 = sharedPreferences.getString(m6583n("group_member_reply_media_order", str2), strM6585v);
                    if (string6 != null) {
                        strM6585v = string6;
                    }
                    strM6585v = m6585v(strM6585v);
                }
                str3 = strM6585v;
            }
            str3 = "none";
        }
        if (str3.equals("none")) {
            arrayList = C4173t.f13710g;
            str4 = str2;
            c3104q2 = c3104q;
        } else {
            String string7 = sharedPreferences.getString("group_member_reply_media_sequence", "image,voice,emoji,video,file,favorite");
            String str10 = string7 != null ? string7 : "image,voice,emoji,video,file,favorite";
            if (c3104q == null) {
                if (!c3103p2.m6603s(str2, null).equals("custom") || (string = sharedPreferences.getString(m6583n("group_member_reply_media_sequence", str2), str10)) == null) {
                }
                str4 = str2;
                c3104q2 = c3104q;
                c3103p2 = this;
                Map mapM8439b0 = AbstractC4178y.m8439b0(new C3958e(WeChatSnsPost.TYPE_IMAGE, c3103p2.m6606x(WeChatSnsPost.TYPE_IMAGE, c3103p2.m6604t(str2, str, "group_member_reply_join_image_paths", "group_member_reply_left_image_paths", c3104q), c3103p2.m6598j(str4, "group_member_reply_image_delay_ms", 100, c3104q2), new C0532s(str4, 10))), new C3958e("voice", m6606x("voice", m6604t(str4, str, "group_member_reply_join_voice_paths", "group_member_reply_left_voice_paths", c3104q2), m6598j(str4, "group_member_reply_voice_delay_ms", 100, c3104q2), new C2576b(this, 4, str4))), new C3958e("emoji", m6606x("emoji", m6604t(str4, str, "group_member_reply_join_emoji_paths", "group_member_reply_left_emoji_paths", c3104q2), m6598j(str4, "group_member_reply_emoji_delay_ms", 100, c3104q2), new C0532s(str4, 11))), new C3958e(WeChatSnsPost.TYPE_VIDEO, m6606x(WeChatSnsPost.TYPE_VIDEO, m6604t(str4, str, "group_member_reply_join_video_paths", "group_member_reply_left_video_paths", c3104q2), m6598j(str4, "group_member_reply_video_delay_ms", 100, c3104q2), new C0532s(str4, 12))), new C3958e("file", m6606x("file", m6604t(str4, str, "group_member_reply_join_file_paths", "group_member_reply_left_file_paths", c3104q2), m6598j(str4, "group_member_reply_file_delay_ms", 100, c3104q2), new C0532s(str4, 13))), new C3958e("favorite", c3103p2.m6606x("favorite", c3103p2.m6604t(str4, str, "group_member_reply_join_favorite_paths", "group_member_reply_left_favorite_paths", c3104q2), c3103p2.m6598j(str4, "group_member_reply_favorite_delay_ms", 100, c3104q2), new C0532s(str4, 14))));
                List listM6691F0 = AbstractC3149m.m6691F0(string, new char[]{','}, 6);
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
                it = listM6691F0.iterator();
                while (it.hasNext()) {
                }
                arrayList = new ArrayList();
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
            } else if (c3104q.f10058n.equals("custom")) {
                String string8 = c3104q.f10060p;
                if (AbstractC3149m.m6721t0(string8)) {
                    string8 = str10;
                }
                str4 = str2;
                c3104q2 = c3104q;
                c3103p2 = this;
                Map mapM8439b02 = AbstractC4178y.m8439b0(new C3958e(WeChatSnsPost.TYPE_IMAGE, c3103p2.m6606x(WeChatSnsPost.TYPE_IMAGE, c3103p2.m6604t(str2, str, "group_member_reply_join_image_paths", "group_member_reply_left_image_paths", c3104q), c3103p2.m6598j(str4, "group_member_reply_image_delay_ms", 100, c3104q2), new C0532s(str4, 10))), new C3958e("voice", m6606x("voice", m6604t(str4, str, "group_member_reply_join_voice_paths", "group_member_reply_left_voice_paths", c3104q2), m6598j(str4, "group_member_reply_voice_delay_ms", 100, c3104q2), new C2576b(this, 4, str4))), new C3958e("emoji", m6606x("emoji", m6604t(str4, str, "group_member_reply_join_emoji_paths", "group_member_reply_left_emoji_paths", c3104q2), m6598j(str4, "group_member_reply_emoji_delay_ms", 100, c3104q2), new C0532s(str4, 11))), new C3958e(WeChatSnsPost.TYPE_VIDEO, m6606x(WeChatSnsPost.TYPE_VIDEO, m6604t(str4, str, "group_member_reply_join_video_paths", "group_member_reply_left_video_paths", c3104q2), m6598j(str4, "group_member_reply_video_delay_ms", 100, c3104q2), new C0532s(str4, 12))), new C3958e("file", m6606x("file", m6604t(str4, str, "group_member_reply_join_file_paths", "group_member_reply_left_file_paths", c3104q2), m6598j(str4, "group_member_reply_file_delay_ms", 100, c3104q2), new C0532s(str4, 13))), new C3958e("favorite", c3103p2.m6606x("favorite", c3103p2.m6604t(str4, str, "group_member_reply_join_favorite_paths", "group_member_reply_left_favorite_paths", c3104q2), c3103p2.m6598j(str4, "group_member_reply_favorite_delay_ms", 100, c3104q2), new C0532s(str4, 14))));
                List listM6691F02 = AbstractC3149m.m6691F0(string8, new char[]{','}, 6);
                ArrayList arrayList22 = new ArrayList(AbstractC4167n.m8429e1(listM6691F02));
                it = listM6691F02.iterator();
                while (it.hasNext()) {
                    String string9 = AbstractC3149m.m6703R0((String) it.next()).toString();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = string9.toLowerCase(locale);
                    lowerCase.getClass();
                    arrayList22.add(lowerCase);
                }
                arrayList = new ArrayList();
                it2 = arrayList22.iterator();
                while (it2.hasNext()) {
                    C3100m c3100m = (C3100m) mapM8439b02.get((String) it2.next());
                    if (c3100m != null) {
                        arrayList.add(c3100m);
                    }
                }
            }
        }
        ?? r15 = arrayList;
        long jM6598j = c3103p2.m6598j(str4, "group_member_reply_prompt_delay_ms", 0, c3104q2);
        if (str8.equals(WeChatSnsPost.TYPE_CARD)) {
            final int i9 = 0;
            final String str11 = str4;
            final C3104q c3104q3 = c3104q2;
            listM99x0 = AbstractC0000a.m99x0(new C3100m(WeChatSnsPost.TYPE_CARD, jM6598j, new InterfaceC1220a(c3103p2) { // from class: o9.f

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C3103p f9989h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f9989h = c3103p2;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1220a
                public final Object invoke() {
                    switch (i9) {
                        case 0:
                            this.f9989h.m6590D(str, str11, c3101n, c3104q3);
                            break;
                        case 1:
                            this.f9989h.m6591E(str, str11, c3101n, c3104q3);
                            break;
                        case 2:
                            this.f9989h.m6590D(str, str11, c3101n, c3104q3);
                            break;
                        default:
                            this.f9989h.m6591E(str, str11, c3101n, c3104q3);
                            break;
                    }
                    return C3967n.f12976a;
                }
            }));
            c3103p = this;
            str5 = str2;
            r16 = r15;
        } else if (str8.equals("both")) {
            final int i10 = 1;
            r16 = r15;
            C3100m c3100m2 = new C3100m(WeChatSnsPost.TYPE_TEXT, jM6598j, new InterfaceC1220a(this) { // from class: o9.f

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C3103p f9989h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f9989h = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1220a
                public final Object invoke() {
                    switch (i10) {
                        case 0:
                            this.f9989h.m6590D(str, str2, c3101n, c3104q);
                            break;
                        case 1:
                            this.f9989h.m6591E(str, str2, c3101n, c3104q);
                            break;
                        case 2:
                            this.f9989h.m6590D(str, str2, c3101n, c3104q);
                            break;
                        default:
                            this.f9989h.m6591E(str, str2, c3101n, c3104q);
                            break;
                    }
                    return C3967n.f12976a;
                }
            });
            final int i11 = 2;
            str5 = str2;
            C3100m c3100m3 = new C3100m(WeChatSnsPost.TYPE_CARD, 120L, new InterfaceC1220a(this) { // from class: o9.f

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C3103p f9989h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f9989h = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1220a
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            this.f9989h.m6590D(str, str2, c3101n, c3104q);
                            break;
                        case 1:
                            this.f9989h.m6591E(str, str2, c3101n, c3104q);
                            break;
                        case 2:
                            this.f9989h.m6590D(str, str2, c3101n, c3104q);
                            break;
                        default:
                            this.f9989h.m6591E(str, str2, c3101n, c3104q);
                            break;
                    }
                    return C3967n.f12976a;
                }
            });
            String str12 = "text_first";
            if (c3104q != null) {
                if (c3104q.f10050f.equals("both")) {
                    string = c3104q.f10051g;
                } else {
                    string = sharedPreferences.getString("group_member_reply_both_order", "text_first");
                    if (string == null) {
                        string = "text_first";
                    }
                }
                if (string.equals("card_first")) {
                    str12 = "card_first";
                }
                listM99x0 = !str12.equals("card_first") ? AbstractC0000a.m101y0(c3100m3, c3100m2) : AbstractC0000a.m101y0(c3100m2, c3100m3);
                c3103p = this;
            } else {
                String string10 = sharedPreferences.getString(m6583n("group_member_reply_both_order", str5), HttpUrl.FRAGMENT_ENCODE_SET);
                if (string10 != null) {
                    str7 = string10;
                }
                if (AbstractC3149m.m6721t0(str7)) {
                    String string11 = sharedPreferences.getString("group_member_reply_both_order", "text_first");
                    str7 = string11 != null ? string11 : "text_first";
                }
                if (str7.equals("card_first")) {
                }
                if (!str12.equals("card_first")) {
                }
                c3103p = this;
            }
        } else {
            r16 = r15;
            final int i12 = 3;
            c3103p = this;
            str5 = str2;
            listM99x0 = AbstractC0000a.m99x0(new C3100m(WeChatSnsPost.TYPE_TEXT, jM6598j, new InterfaceC1220a(c3103p) { // from class: o9.f

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C3103p f9989h;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f9989h = c3103p;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1220a
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            this.f9989h.m6590D(str, str2, c3101n, c3104q);
                            break;
                        case 1:
                            this.f9989h.m6591E(str, str2, c3101n, c3104q);
                            break;
                        case 2:
                            this.f9989h.m6590D(str, str2, c3101n, c3104q);
                            break;
                        default:
                            this.f9989h.m6591E(str, str2, c3101n, c3104q);
                            break;
                    }
                    return C3967n.f12976a;
                }
            }));
        }
        if (str3.equals("before")) {
            listM99x0 = AbstractC4166m.m8397F1(r16, listM99x0);
        } else {
            ?? r32 = r16;
            if (str3.equals("after")) {
                listM99x0 = AbstractC4166m.m8397F1(listM99x0, r32);
            }
        }
        for (C3100m c3100m4 : listM99x0) {
            m6575F(c3100m4.f10010b);
            try {
                c3100m4.f10011c.invoke();
                c3959f = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c3103p.f10025a.invoke(AbstractC0255e.m1021j("进退群自动回复发送失败: ", str5, "/", c3100m4.f10009a), thM8182b);
            }
            m6575F(300L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m6600o(int i9, String str, String str2) {
        String string;
        int i10;
        Object c3959f;
        C1362c c1362c;
        C1363d c1363dM5159f = AbstractC2091b.m5159f();
        if (c1363dM5159f != null) {
            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (c1362c = (C1362c) c1363dM5159f.m3679k(str).get(str2)) != null && !TextUtils.isEmpty(c1362c.f4514b)) {
                String strTrim = c1362c.f4514b.trim();
                if (!str2.equals(strTrim)) {
                    str3 = strTrim;
                }
            }
            string = str3 != null ? AbstractC3149m.m6703R0(str3).toString() : null;
        }
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str4 = string;
        if (!m6584r(str, str4) || str4.equals(str2)) {
            return false;
        }
        str2.getClass();
        synchronized (this.f10033i) {
            String str5 = "group_invite_detail_count_" + str + "|" + str4;
            int i11 = this.f10026b.getInt("group_invite_detail_count_" + str + "|" + str4, 0);
            if (i11 < 0) {
                i11 = 0;
            }
            int i12 = i9;
            if (i12 < 1) {
                i12 = 1;
            }
            i10 = i11 + i12;
            this.f10026b.edit().putInt(str5, i10).commit();
        }
        if (this.f10026b.getBoolean("group_invite_detail_enable", false) && m6602q(str)) {
            C2026t c2026t = this.f10025a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            WeChatApis.message().getClass();
            C2341e c2341e = WeChatApis.localMessageApi;
            if (c2341e == null) {
                c2026t.invoke("邀请详情插入失败: 本地消息 API 未就绪", null);
            } else {
                try {
                    c2341e.m5570c();
                    if (c2341e.m5572e(str, m6594c(str, m6605u(str, str4), m6605u(str, str2), i10), jCurrentTimeMillis, true) <= 0) {
                        c2026t.invoke("邀请详情插入失败: " + str + "/" + str4 + "/" + str2, null);
                    }
                    c3959f = C3967n.f12976a;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    c2026t.invoke("邀请详情插入异常", thM8182b);
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: o9.q */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final void m6601p(String str, String str2, String str3) {
        Object obj;
        Object next;
        SharedPreferences sharedPreferences = this.f10026b;
        if (sharedPreferences.getBoolean("group_member_reply_enable", false)) {
            String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
            String string = sharedPreferences.getString("group_member_reply_listen_groups", HttpUrl.FRAGMENT_ENCODE_SET);
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC4166m.m8412U1(m6576G(string)).contains(str2)) {
                String string2 = sharedPreferences.getString("group_member_reply_template_bindings", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string2 == null) {
                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Iterator it = AbstractC3754e0.m7875R(string2).iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (AbstractC1416l.m3825a(((C3105r) next).f10071a, str2)) {
                            break;
                        }
                    }
                }
                C3105r c3105r = (C3105r) next;
                if (c3105r != null) {
                    String string3 = sharedPreferences.getString("group_member_reply_templates", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string3 == null) {
                        string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    Iterator it2 = AbstractC3754e0.m7881X(string3).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (((C3104q) next2).f10045a.equals(c3105r.f10073c)) {
                            obj = next2;
                            break;
                        }
                    }
                    obj = (C3104q) obj;
                }
                C3104q c3104q = obj;
                if (str.equals("join")) {
                    if (c3104q != 0) {
                        if (!c3104q.f10047c || !c3104q.f10048d) {
                            return;
                        }
                    } else {
                        if (!sharedPreferences.getBoolean("group_member_reply_join_enable", true)) {
                            return;
                        }
                        String string4 = sharedPreferences.getString("group_member_reply_join_disabled_groups", HttpUrl.FRAGMENT_ENCODE_SET);
                        if (string4 == null) {
                            string4 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (m6576G(string4).contains(str2)) {
                            return;
                        }
                    }
                }
                if (str.equals("left")) {
                    if (c3104q != 0) {
                        if (!c3104q.f10047c || !c3104q.f10049e) {
                            return;
                        }
                    } else {
                        if (!sharedPreferences.getBoolean("group_member_reply_left_enable", true)) {
                            return;
                        }
                        String string5 = sharedPreferences.getString("group_member_reply_left_disabled_groups", HttpUrl.FRAGMENT_ENCODE_SET);
                        if (string5 != null) {
                            str4 = string5;
                        }
                        if (m6576G(str4).contains(str2)) {
                            return;
                        }
                    }
                }
                new Thread(new RunnableC0537x(this, str2, str3, str, c3104q, 10), "Hchat-GroupMemberReply").start();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m6602q(String str) {
        SharedPreferences sharedPreferences = this.f10026b;
        String string = sharedPreferences.getString("group_monitor_notice_scope", "all");
        if (!(string != null ? string : "all").equals("specific")) {
            return true;
        }
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String string2 = sharedPreferences.getString("group_monitor_notice_groups", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string2 != null) {
            str2 = string2;
        }
        return m6576G(str2).contains(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m6603s(String str, C3104q c3104q) {
        if (c3104q != null) {
            String str2 = c3104q.f10058n;
            if (!str2.equals("custom")) {
                return str2.equals("none") ? "none" : "global";
            }
            return "custom";
        }
        String string = this.f10026b.getString("group_member_reply_media_mode_" + str, "global");
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1349088399) {
                if (iHashCode == 3387192 && string.equals("none")) {
                }
            } else if (string.equals("custom")) {
                return "custom";
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: t */
    public final String m6604t(String str, String str2, String str3, String str4, C3104q c3104q) {
        if (!str2.equals("join")) {
            str3 = str4;
        }
        boolean zEquals = m6603s(str, c3104q).equals("custom");
        SharedPreferences sharedPreferences = this.f10026b;
        if (zEquals) {
            String str5 = null;
            if (c3104q != null) {
                switch (str3.hashCode()) {
                    case -1933938394:
                        if (str3.equals("group_member_reply_join_file_paths")) {
                            str5 = c3104q.f10069y;
                        }
                        break;
                    case -1489647034:
                        if (str3.equals("group_member_reply_join_voice_paths")) {
                            str5 = c3104q.f10063s;
                        }
                        break;
                    case -798477783:
                        if (str3.equals("group_member_reply_left_file_paths")) {
                            str5 = c3104q.f10070z;
                        }
                        break;
                    case -650106461:
                        if (str3.equals("group_member_reply_left_voice_paths")) {
                            str5 = c3104q.f10064t;
                        }
                        break;
                    case -387472689:
                        if (str3.equals("group_member_reply_join_video_paths")) {
                            str5 = c3104q.f10067w;
                        }
                        break;
                    case -3224998:
                        if (str3.equals("group_member_reply_join_emoji_paths")) {
                            str5 = c3104q.f10065u;
                        }
                        break;
                    case 452067884:
                        if (str3.equals("group_member_reply_left_video_paths")) {
                            str5 = c3104q.f10068x;
                        }
                        break;
                    case 611178438:
                        if (str3.equals("group_member_reply_join_favorite_paths")) {
                            str5 = c3104q.f10035A;
                        }
                        break;
                    case 744951727:
                        if (str3.equals("group_member_reply_join_image_paths")) {
                            str5 = c3104q.f10061q;
                        }
                        break;
                    case 836315575:
                        if (str3.equals("group_member_reply_left_emoji_paths")) {
                            str5 = c3104q.f10066v;
                        }
                        break;
                    case 1584492300:
                        if (str3.equals("group_member_reply_left_image_paths")) {
                            str5 = c3104q.f10062r;
                        }
                        break;
                    case 1769824073:
                        if (str3.equals("group_member_reply_left_favorite_paths")) {
                            str5 = c3104q.f10036B;
                        }
                        break;
                }
            }
            if (str5 != null) {
                return str5;
            }
            String string = sharedPreferences.getString(m6583n(str3, str), HttpUrl.FRAGMENT_ENCODE_SET);
            if (string != null) {
                return string;
            }
        } else {
            String string2 = sharedPreferences.getString(str3, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string2 != null) {
                return string2;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3097j m6605u(String str, String str2) {
        String strM3733v;
        String str3;
        String str4;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String str5 = (String) this.f10030f.get(m6578e(str, str2));
        String str6 = HttpUrl.FRAGMENT_ENCODE_SET;
        boolean z9 = false;
        if (str5 == null) {
            if (c1368iM9259c == null || (strM3733v = c1368iM9259c.m3733v(str, str2)) == null) {
                str5 = null;
            } else {
                if (!((AbstractC3149m.m6721t0(strM3733v) || strM3733v.equals(str2)) ? false : true)) {
                    strM3733v = null;
                }
                str5 = strM3733v;
            }
            if (str5 == null) {
                str5 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        } else {
            if (!((AbstractC3149m.m6721t0(str5) || str5.equals(str2)) ? false : true)) {
                str5 = null;
            }
            if (str5 == null) {
            }
        }
        WeChatContact weChatContactM3725n = c1368iM9259c != null ? c1368iM9259c.m3725n(str2) : null;
        if (weChatContactM3725n == null || (str3 = weChatContactM3725n.nickname) == null) {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            if (!((AbstractC3149m.m6721t0(str3) || str3.equals(str2)) ? false : true)) {
                str3 = null;
            }
            if (str3 == null) {
            }
        }
        if (weChatContactM3725n != null && (str4 = weChatContactM3725n.remarkName) != null) {
            if (!AbstractC3149m.m6721t0(str4) && !str4.equals(str2)) {
                z9 = true;
            }
            String str7 = z9 ? str4 : null;
            if (str7 != null) {
                str6 = str7;
            }
        }
        return new C3097j(str5, str3, str6, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final C3100m m6606x(String str, String str2, long j3, InterfaceC1231l interfaceC1231l) {
        ArrayList arrayListM6576G = m6576G(str2);
        if (arrayListM6576G.isEmpty()) {
            return null;
        }
        return new C3100m(str, j3, new C3094g(arrayListM6576G, this, interfaceC1231l));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m6607z() {
        Object c3959f;
        try {
            WeChatApis.contact().getClass();
            C1363d c1363d = WeChatApis.chatroomApi;
            if (c1363d == null) {
                return;
            }
            for (WeChatChatroom weChatChatroom : c1363d.m3675g()) {
                String string = AbstractC3149m.m6703R0(weChatChatroom.chatroomId).toString();
                if (string.length() != 0) {
                    C3011i c3011i = new C3011i(AbstractC3015m.m6413W(AbstractC4166m.m8415m1(weChatChatroom.memberIds), new C3092e(1)), true, new C3092e(2));
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    AbstractC3015m.m6417a0(c3011i, linkedHashSet);
                    if (!linkedHashSet.isEmpty()) {
                        this.f10028d.putIfAbsent(string, linkedHashSet);
                        m6588B(string, linkedHashSet);
                    }
                }
            }
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f10025a.invoke("预加载群成员快照失败", thM8182b);
        }
    }
}
