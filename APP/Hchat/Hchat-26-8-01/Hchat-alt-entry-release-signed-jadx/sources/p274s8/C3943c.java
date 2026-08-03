package p274s8;

import ac.AbstractC0063p;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p010aa.C0035c;
import p010aa.C0036d;
import p025bc.AbstractC0255e;
import p062e8.C0828b;
import p063e9.C0830a;
import p068eh.AbstractC0921a;
import p077f8.C1082b;
import p077f8.C1083c;
import p077f8.C1085e;
import p077f8.C1087g;
import p080fb.AbstractC1184v0;
import p086fh.C1253k;
import p096g8.C1360a;
import p096g8.C1368i;
import p096g8.C1370k;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p136j8.AbstractC2091b;
import p153k8.C2341e;
import p153k8.C2345i;
import p153k8.C2347k;
import p153k8.C2349m;
import p153k8.C2355s;
import p162l3.C2469w;
import p167l8.C2529d;
import p167l8.C2531f;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p243q9.C3465a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: s8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3943c extends AbstractC3736a {

    /* JADX INFO: renamed from: n */
    public static final Set f12926n = AbstractC0063p.m404N("rowid");

    /* JADX INFO: renamed from: e */
    public final Set f12927e = AbstractC2091b.m5168o();

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f12928f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    public final Set f12929g = AbstractC2091b.m5168o();

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f12930h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public SharedPreferences f12931i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f12932j;

    /* JADX INFO: renamed from: k */
    public volatile boolean f12933k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f12934l;

    /* JADX INFO: renamed from: m */
    public volatile boolean f12935m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m8135A(Class cls) {
        if (KavaReflector.findMethod(cls, "getMsgId", new Class[0]) != null && KavaReflector.findMethod(cls, "getType", new Class[0]) != null) {
            Class cls2 = Integer.TYPE;
            cls2.getClass();
            if (KavaReflector.findMethod(cls, "setType", cls2) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m8136B(int i9) {
        return i9 == 268445456 || i9 == 268445458 || i9 == 285222674;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m8137C(C3742g c3742g) {
        return AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_anti_recall_config").getBoolean("anti_recall_keep_self", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static boolean m8138G(Object obj) {
        String[] strArr = {"isSend", "field_isSend"};
        for (int i9 = 0; i9 < 2; i9++) {
            Object field = KavaReflector.readField(obj, strArr[i9]);
            Number number = field instanceof Number ? (Number) field : null;
            if (number != null && number.intValue() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static long m8139H(Object obj) {
        try {
            Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "getMsgId", new Class[0]), obj, new Object[0]);
            if (objInvoke instanceof Number) {
                return ((Number) objInvoke).longValue();
            }
        } catch (Throwable unused) {
        }
        String[] strArr = {"msgId", "field_msgId"};
        for (int i9 = 0; i9 < 2; i9++) {
            Object field = KavaReflector.readField(obj, strArr[i9]);
            if (field instanceof Number) {
                return ((Number) field).longValue();
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static int m8140I(Object obj) {
        Object c3959f;
        try {
            Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(obj.getClass(), "getType", new Class[0]), obj, new Object[0]);
            c3959f = objInvoke instanceof Number ? (Number) objInvoke : null;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Number number = (Number) (c3959f instanceof C3959f ? null : c3959f);
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static String m8141J(C3742g c3742g) {
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        return C3087k.m6557a(context, classLoader).f8202h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static long m8142K(long j3) {
        return (j3 <= 0 || j3 >= RealConnection.IDLE_CONNECTION_HEALTHY_NS) ? j3 : j3 * 1000;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static Map m8143L(long j3, String str) {
        WeChatDatabaseApi weChatDatabaseApiDatabase;
        Object c3959f;
        if (AbstractC3149m.m6721t0(str) || (weChatDatabaseApiDatabase = WeChatApis.database()) == null) {
            return null;
        }
        try {
            List<Map<String, Object>> listQuery = weChatDatabaseApiDatabase.query("SELECT * FROM " + ("`" + AbstractC3156t.m6737a0(str, "`", "``", false) + "`") + " WHERE msgId=? LIMIT 1", new String[]{String.valueOf(j3)});
            listQuery.getClass();
            c3959f = (Map) AbstractC4166m.m8424v1(listQuery);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Map) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static ArrayList m8144M(long j3, C2531f c2531f) {
        LinkedHashSet linkedHashSetM8350R = AbstractC4156d0.m8350R(Long.valueOf(c2531f != null ? c2531f.f8185a : 0L), Long.valueOf(j3), Long.valueOf(c2531f != null ? c2531f.f8186b : 0L));
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetM8350R) {
            if (((Number) obj).longValue() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static Long m8145P(String str, String str2) {
        String str3;
        if (!AbstractC3149m.m6721t0(str)) {
            Pattern patternCompile = Pattern.compile(AbstractC0255e.m1022k("<", str2, "\\b[^>]*>\\s*(.*?)\\s*</", str2, ">"), C2469w.m5864f(2));
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
            String string = (c3145iM238b == null || (str3 = (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a())) == null) ? null : AbstractC3149m.m6703R0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str3, "<![CDATA[", HttpUrl.FRAGMENT_ENCODE_SET, false), "]]>", HttpUrl.FRAGMENT_ENCODE_SET, false)).toString();
            if (string != null) {
                return AbstractC3156t.m6743g0(string);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final boolean m8146k(C3943c c3943c, C3742g c3742g) {
        return AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_anti_recall_config").getBoolean("anti_recall_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m8147l(Object obj, String str) {
        Object field = KavaReflector.readField(obj, str);
        if (field == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (field instanceof String) {
            return (String) field;
        }
        String[] strArr = {"d", "e", "f", "g", "a"};
        for (int i9 = 0; i9 < 5; i9++) {
            Object field2 = KavaReflector.readField(field, strArr[i9]);
            if ((field2 instanceof String) && !AbstractC3149m.m6721t0((CharSequence) field2)) {
                return (String) field2;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m8148m(long j3, String str) {
        Object c3959f;
        if (j3 <= 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            c3959f = new SimpleDateFormat(str, Locale.getDefault()).format(new Date(j3));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j3));
        }
        c3959f.getClass();
        return (String) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0114  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m8149o(C3742g c3742g, String str, long j3, C2531f c2531f, long j4, boolean z9) {
        long jM5659a;
        long jM8142K;
        String string;
        long j5;
        String strSendTalker;
        String str2;
        C2341e c2341e;
        String str3;
        String strBodyContent;
        boolean z10;
        String string2;
        String str4;
        String strM3731t;
        String string3;
        String strM6737a0;
        WeChatMessage weChatMessage;
        String strM5949o;
        String string4;
        WeChatMessage weChatMessageM5661c;
        if (AbstractC3149m.m6721t0(str) || j3 <= 0) {
            AbstractC1184v0.m3203m("[Hchat:AntiRecall] 插入提示失败: talker/newmsgid为空 talker=" + str + " newmsgid=" + j3);
            return;
        }
        C2341e c2341eLocalMessages = WeChatApis.localMessages();
        if (c2341eLocalMessages == null) {
            AbstractC1184v0.m3203m("[Hchat:AntiRecall] 插入提示失败: LocalMessage API为空");
            return;
        }
        c2341eLocalMessages.m5570c();
        Iterator it = m8144M(j3, c2531f).iterator();
        while (true) {
            if (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                C2355s c2355sMessageStore = WeChatApis.messageStore();
                jM8142K = m8142K((c2355sMessageStore == null || (weChatMessageM5661c = c2355sMessageStore.m5661c(jLongValue)) == null) ? 0L : weChatMessageM5661c.createTime);
                if (jM8142K > 0) {
                    break;
                }
            } else {
                C2355s c2355sMessageStore2 = WeChatApis.messageStore();
                if (c2355sMessageStore2 != null) {
                    jM5659a = c2355sMessageStore2.m5659a(c2531f != null ? c2531f.f8186b : 0L);
                } else {
                    jM5659a = 0;
                }
                jM8142K = m8142K(jM5659a);
                if (jM8142K <= 0) {
                    jM8142K = m8142K(c2531f != null ? c2531f.m5950a() : 0L);
                    if (jM8142K <= 0) {
                        C2355s c2355sMessageStore3 = WeChatApis.messageStore();
                        jM8142K = m8142K(c2355sMessageStore3 != null ? c2355sMessageStore3.m5659a(j3) : 0L);
                    }
                }
            }
        }
        if (z9) {
            strM6737a0 = "你撤回了上一条消息";
            c2341e = c2341eLocalMessages;
            str3 = " newmsgid=";
            j5 = 0;
        } else {
            String string5 = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_anti_recall_config").getString("anti_recall_notice_text", "{name}撤回了上一条消息 {content}");
            if (string5 == null) {
                string5 = "{name}撤回了上一条消息 {content}";
                String str5 = string5.equals("已阻止一条撤回消息") ? "{name}撤回了上一条消息 {content}" : string5;
                String str6 = "yyyy-MM-dd HH:mm:ss";
                string = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_anti_recall_config").getString("anti_recall_notice_time_format", "yyyy-MM-dd HH:mm:ss");
                if (string != null && (string4 = AbstractC3149m.m6703R0(string).toString()) != null) {
                    if (string4.length() <= 0) {
                        string4 = null;
                    }
                    if (string4 != null) {
                        str6 = string4;
                    }
                }
                if (c2531f == null) {
                    String strSubstring = c2531f.f8188d;
                    if (strSubstring.isEmpty()) {
                        WeChatMessage weChatMessage2 = c2531f.f8194j;
                        strSubstring = weChatMessage2 != null ? weChatMessage2.sendTalker() : HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (strSubstring == null || AbstractC3149m.m6721t0(strSubstring) || !m8157z(str, strSubstring)) {
                        strSubstring = null;
                    }
                    j5 = 0;
                    if (strSubstring != null) {
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        c2341e = c2341eLocalMessages;
                        str3 = " newmsgid=";
                    } else {
                        WeChatMessage weChatMessage3 = c2531f != null ? c2531f.f8194j : null;
                        if (weChatMessage3 == null || (strSendTalker = weChatMessage3.sendTalker()) == null || AbstractC3149m.m6721t0(strSendTalker) || !m8157z(str, strSendTalker)) {
                            strSendTalker = null;
                        }
                        if (strSendTalker != null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            c2341e = c2341eLocalMessages;
                            str3 = " newmsgid=";
                            strSubstring = strSendTalker;
                        } else {
                            if (weChatMessage3 != null) {
                                String msgSource = weChatMessage3.getMsgSource();
                                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                String strBodyContent2 = weChatMessage3.bodyContent();
                                String str7 = weChatMessage3.reserved;
                                WeChatMessage.Companion.getClass();
                                c2341e = c2341eLocalMessages;
                                str3 = " newmsgid=";
                                String[] strArr = {C2529d.m5949o(strBodyContent2, "fromusername"), C2529d.m5949o(strBodyContent2, "fromusr"), C2529d.m5949o(strBodyContent2, "sender"), C2529d.m5949o(msgSource, "fromusername"), C2529d.m5949o(msgSource, "fromusr"), C2529d.m5949o(str7, "fromusername"), C2529d.m5949o(str7, "fromusr"), C2529d.m5943i(msgSource, ".msgsource.fromusername"), C2529d.m5943i(msgSource, "fromusername"), C2529d.m5943i(msgSource, ".msgsource.fromusr"), C2529d.m5943i(msgSource, "fromusr"), C2529d.m5943i(msgSource, ".msgsource.sender"), C2529d.m5943i(msgSource, "sender")};
                                int i9 = 0;
                                while (true) {
                                    if (i9 < 13) {
                                        strSubstring = AbstractC3149m.m6703R0(AbstractC3149m.m6699N0(strArr[i9], ":")).toString();
                                        if (!AbstractC3149m.m6721t0(strSubstring) && m8157z(str, strSubstring)) {
                                            break;
                                        } else {
                                            i9++;
                                        }
                                    } else {
                                        strSubstring = str2;
                                        break;
                                    }
                                }
                            } else {
                                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                c2341e = c2341eLocalMessages;
                                str3 = " newmsgid=";
                                strSubstring = null;
                            }
                            if (strSubstring == null || AbstractC3149m.m6721t0(strSubstring)) {
                                if (c2531f != null) {
                                    WeChatMessage weChatMessage4 = c2531f.f8194j;
                                    strBodyContent = weChatMessage4 != null ? weChatMessage4.bodyContent() : c2531f.f8191g;
                                } else {
                                    strBodyContent = null;
                                }
                                if (strBodyContent == null) {
                                    strBodyContent = str2;
                                }
                                z10 = false;
                                int iM6719r0 = AbstractC3149m.m6719r0(strBodyContent, ":\n", 0, false, 6);
                                strSubstring = ((AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false)) && iM6719r0 > 0) ? strBodyContent.substring(0, iM6719r0) : str2;
                            }
                            string2 = AbstractC3149m.m6703R0(AbstractC3149m.m6699N0(strSubstring, ":")).toString();
                            if (AbstractC3149m.m6721t0(string2)) {
                                C1370k c1370kUsers = WeChatApis.users();
                                if (!AbstractC3156t.m6733W(str, "@chatroom", z10) && !AbstractC3156t.m6733W(str, "@im.chatroom", z10)) {
                                    C1368i c1368iContacts = WeChatApis.contacts();
                                    WeChatContact weChatContactM3725n = c1368iContacts != null ? c1368iContacts.m3725n(string2) : null;
                                    String str8 = weChatContactM3725n != null ? weChatContactM3725n.remarkName : null;
                                    String str9 = weChatContactM3725n != null ? weChatContactM3725n.nickname : null;
                                    C1370k c1370kUsers2 = WeChatApis.users();
                                    String[] strArr2 = {str8, str9, c1370kUsers2 != null ? c1370kUsers2.m3739a(string2) : null};
                                    int i10 = 0;
                                    while (true) {
                                        if (i10 >= 3) {
                                            str4 = null;
                                            break;
                                        }
                                        str4 = strArr2[i10];
                                        if (str4 != null && !AbstractC3149m.m6721t0(str4)) {
                                            break;
                                        } else {
                                            i10++;
                                        }
                                    }
                                    if (str4 == null) {
                                        str4 = str2;
                                    }
                                } else if (c1370kUsers == null) {
                                    str4 = null;
                                } else if (TextUtils.isEmpty(string2)) {
                                    strM3731t = str2;
                                    str4 = strM3731t;
                                } else {
                                    strM3731t = c1370kUsers.f4555b.m3731t(str, string2);
                                    if (TextUtils.isEmpty(strM3731t)) {
                                        strM3731t = string2;
                                    } else if (strM3731t == null) {
                                    }
                                    str4 = strM3731t;
                                }
                                if (str4 != null) {
                                    if (AbstractC3149m.m6721t0(str4)) {
                                        str4 = null;
                                    }
                                    if (str4 != null) {
                                        string2 = str4;
                                    }
                                }
                            } else {
                                string2 = str2;
                            }
                            if (c2531f != null || (weChatMessage = c2531f.f8194j) == null) {
                                string3 = str2;
                                strM6737a0 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str5, "{name}", string2, false), "{content}", string3, false), "{sendTime}", m8148m(jM8142K, str6), false), "{recallTime}", m8148m(j4, str6), false);
                            } else {
                                if (weChatMessage.isText()) {
                                    strM5949o = weChatMessage.bodyContent();
                                } else {
                                    String strBodyContent3 = weChatMessage.bodyContent();
                                    if (!weChatMessage.isQuote()) {
                                        WeChatMessage.Companion.getClass();
                                        if (AbstractC1416l.m3825a(C2529d.m5949o(strBodyContent3, "type"), "57") || AbstractC3149m.m6709h0(strBodyContent3, "<refermsg>", true)) {
                                            C2529d c2529d = WeChatMessage.Companion;
                                            String strBodyContent4 = weChatMessage.bodyContent();
                                            c2529d.getClass();
                                            strM5949o = C2529d.m5949o(strBodyContent4, "title");
                                        } else {
                                            strM5949o = str2;
                                        }
                                    }
                                }
                                if (AbstractC3149m.m6721t0(strM5949o)) {
                                    strM5949o = null;
                                }
                                if (strM5949o != null) {
                                    String strReplace = strM5949o.replace('\n', ' ');
                                    strReplace.getClass();
                                    string3 = AbstractC3149m.m6703R0(strReplace).toString();
                                } else {
                                    string3 = null;
                                }
                                if (string3 == null) {
                                }
                                strM6737a0 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str5, "{name}", string2, false), "{content}", string3, false), "{sendTime}", m8148m(jM8142K, str6), false), "{recallTime}", m8148m(j4, str6), false);
                            }
                        }
                    }
                    z10 = false;
                    string2 = AbstractC3149m.m6703R0(AbstractC3149m.m6699N0(strSubstring, ":")).toString();
                    if (AbstractC3149m.m6721t0(string2)) {
                    }
                    if (c2531f != null) {
                        string3 = str2;
                        strM6737a0 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str5, "{name}", string2, false), "{content}", string3, false), "{sendTime}", m8148m(jM8142K, str6), false), "{recallTime}", m8148m(j4, str6), false);
                    }
                }
            } else {
                if (AbstractC3149m.m6721t0(string5)) {
                    string5 = null;
                }
                if (string5 == null) {
                }
                if (string5.equals("已阻止一条撤回消息")) {
                }
                String str62 = "yyyy-MM-dd HH:mm:ss";
                string = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_anti_recall_config").getString("anti_recall_notice_time_format", "yyyy-MM-dd HH:mm:ss");
                if (string != null) {
                    if (string4.length() <= 0) {
                    }
                    if (string4 != null) {
                    }
                }
                if (c2531f == null) {
                }
            }
        }
        if (jM8142K <= j5) {
            long j10 = c2531f != null ? c2531f.f8185a : j5;
            long j11 = c2531f != null ? c2531f.f8186b : j5;
            StringBuilder sbM2259v = AbstractC0921a.m2259v("[Hchat:AntiRecall] 插入提示失败: 未定位原消息时间 talker=", str, " id=", j3);
            AbstractC2091b.m5172s(sbM2259v, " origin=", j10, " new=");
            sbM2259v.append(j11);
            AbstractC1184v0.m3203m(sbM2259v.toString());
            return;
        }
        if (c2341e.m5572e(str, strM6737a0, jM8142K + 1, false) <= j5) {
            AbstractC1184v0.m3203m("[Hchat:AntiRecall] 插入提示失败: talker=" + str + str3 + j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m8150s(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 2) {
            Class<?> cls = parameterTypes[0];
            cls.getClass();
            if (m8135A(cls) && AbstractC1416l.m3825a(parameterTypes[1], Boolean.TYPE)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m8151t(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if ((parameterTypes.length == 2 || parameterTypes.length == 3) && AbstractC1416l.m3825a(parameterTypes[0], Long.TYPE)) {
            Class<?> cls = parameterTypes[1];
            cls.getClass();
            if (m8135A(cls)) {
                int length = parameterTypes.length;
                Class cls2 = Boolean.TYPE;
                if ((length != 3 || AbstractC1416l.m3825a(parameterTypes[2], cls2) || AbstractC1416l.m3825a(parameterTypes[2], Boolean.class)) && (AbstractC1416l.m3825a(method.getReturnType(), Integer.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), cls2) || AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m8152u(String str) {
        String strM6704S0 = AbstractC3149m.m6704S0(str, '`', '\"', '[', ']');
        return AbstractC3156t.m6734X(strM6704S0, "message") || AbstractC3156t.m6740d0(strM6704S0, "message", true) || AbstractC3149m.m6709h0(strM6704S0, "message", true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static boolean m8153v(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], Long.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m8154w(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 1) {
            Class<?> cls = parameterTypes[0];
            cls.getClass();
            if (m8135A(cls)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static boolean m8155x(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 6 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], Long.TYPE) && AbstractC1416l.m3825a(parameterTypes[3], String.class) && AbstractC1416l.m3825a(parameterTypes[4], String.class) && AbstractC1416l.m3825a(parameterTypes[5], String.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static boolean m8156y(C2531f c2531f) {
        String strSendTalker = null;
        WeChatMessage weChatMessage = c2531f != null ? c2531f.f8194j : null;
        if (weChatMessage == null || !weChatMessage.isSend()) {
            C1360a c1360aAccount = WeChatApis.account();
            String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (strM3652c == null) {
                strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (c2531f != null) {
                strSendTalker = c2531f.f8188d;
                if (strSendTalker.isEmpty()) {
                    WeChatMessage weChatMessage2 = c2531f.f8194j;
                    strSendTalker = weChatMessage2 != null ? weChatMessage2.sendTalker() : HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
            if (strSendTalker != null) {
                str = strSendTalker;
            }
            String string = AbstractC3149m.m6703R0(AbstractC3149m.m6699N0(str, ":")).toString();
            if (!AbstractC1416l.m3825a(string, "你") && !AbstractC3156t.m6740d0(string, "你撤回", false) && (AbstractC3149m.m6721t0(strM3652c) || !string.equals(strM3652c))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m8157z(String str, String str2) {
        return (AbstractC3149m.m6721t0(str2) || ((AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false)) && str2.equals(str)) || AbstractC3156t.m6733W(str2, "@chatroom", false) || AbstractC3156t.m6733W(str2, "@im.chatroom", false)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final List m8158D(String str, C3742g c3742g) {
        SharedPreferences sharedPreferences = this.f12931i;
        return sharedPreferences != null ? C0828b.m2090f(sharedPreferences, m8141J(c3742g), c3742g.f12145c, str) : C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:76:0x00e4 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: E */
    public final List m8159E(C3742g c3742g) {
        Object c3959f;
        Object c3959f2;
        List listM8158D = m8158D("revoke_entries", c3742g);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM8158D) {
            if (m8155x((Method) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            arrayList = null;
        }
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new C3941a((Method) it.next(), null));
            }
            return arrayList2;
        }
        String[][] strArr = {new String[]{"doRevokeMsg xmlSrvMsgId", "summerbadcr get a revoke"}, new String[]{"MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE", ".sysmsg.revokemsg.newmsgid"}, new String[]{"ashutest::[oneliang][xml parse]", ".sysmsg.revokemsg.replacemsg"}};
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i9 = 0; i9 < 3; i9++) {
            String[] strArr2 = strArr[i9];
            String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
            try {
                DexKitBridge dexKitBridge = c3742g.f12146d;
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                C1253k.m3367u0(c1253k, AbstractC4165l.m8375L0(strArr3));
                c0570e.f1764h = c1253k;
                C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                c3959f = new ArrayList();
                for (C1730o c1730o : c1731pFindMethod) {
                    try {
                        c3959f2 = c1730o.m4350r(c3742g.f12145c);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    Method method = (Method) c3959f2;
                    C3941a c3941a = (method == null || !m8155x(method)) ? null : new C3941a(method, c1730o);
                    if (c3941a != null) {
                        c3959f.add(c3941a);
                    }
                }
            } catch (Throwable th3) {
                c3959f = new C3959f(th3);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            Object obj2 = c3959f;
            if (thM8182b != null) {
                m7750e("防撤回入口定位失败", thM8182b);
                obj2 = C4173t.f13710g;
            }
            for (C3941a c3941a2 : (List) obj2) {
                linkedHashMap.put(c3941a2.f12921a.toGenericString(), c3941a2);
            }
            if (!linkedHashMap.isEmpty()) {
                break;
            }
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Collection collection = collectionValues;
        ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(collection));
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C3941a) it2.next()).f12921a);
        }
        m8162O(c3742g, "revoke_entries", arrayList3);
        Collection collectionValues2 = linkedHashMap.values();
        collectionValues2.getClass();
        return AbstractC4166m.m8407P1(collectionValues2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public final void m8160F(long j3) {
        if (j3 <= 0) {
            return;
        }
        Long lValueOf = Long.valueOf(j3);
        Set set = this.f12929g;
        set.add(lValueOf);
        if (set.size() > 1000) {
            set.getClass();
            Iterator it = AbstractC4166m.m8403L1(set.size() - 1000, set).iterator();
            while (it.hasNext()) {
                set.remove((Long) it.next());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m8161N(WeChatMessage weChatMessage) {
        if (weChatMessage == null || AbstractC3149m.m6721t0(weChatMessage.talker) || weChatMessage.msgSvrId <= 0 || weChatMessage.isRecalled()) {
            return;
        }
        String str = weChatMessage.talker + ":" + weChatMessage.msgSvrId;
        ConcurrentHashMap concurrentHashMap = this.f12928f;
        concurrentHashMap.put(str, weChatMessage);
        if (concurrentHashMap.size() > 1000) {
            Set setKeySet = concurrentHashMap.keySet();
            setKeySet.getClass();
            Iterator it = AbstractC4166m.m8403L1(concurrentHashMap.size() - 1000, setKeySet).iterator();
            while (it.hasNext()) {
                concurrentHashMap.remove((String) it.next());
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final void m8162O(C3742g c3742g, String str, List list) {
        SharedPreferences sharedPreferences = this.f12931i;
        if (sharedPreferences != null) {
            if (!list.isEmpty()) {
                C0828b.f2478a.m2097j(sharedPreferences, m8141J(c3742g), str, list);
                return;
            }
            String strM8141J = m8141J(c3742g);
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM8141J)) {
                    editorEdit.clear().putString("cache.key", strM8141J);
                }
                editorEdit.remove(str).apply();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "anti_recall";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C3944d("anti_recall", "防撤回", "保留被撤回的消息", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo299g(C3742g c3742g) {
        C1082b c1082bM2716c;
        c3742g.getClass();
        this.f12931i = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_anti_recall_method_cache");
        C2347k c2347kMessageEvents = WeChatApis.messageEvents();
        if (c2347kMessageEvents != null) {
            C3465a c3465a = new C3465a(this, 5);
            C1083c c1083c = c2347kMessageEvents.f7704d;
            c1082bM2716c = c1083c != null ? c1083c.m2716c(C1087g.class, c3465a) : null;
        }
        m7753j(c1082bM2716c);
        C2345i c2345iMessageChanges = WeChatApis.messageChanges();
        m7753j(c2345iMessageChanges != null ? c2345iMessageChanges.m5608e(new C2349m(this, 2)) : null);
        m8163n("com.tencent.wcdb.database.SQLiteDatabase", c3742g);
        m8163n("android.database.sqlite.SQLiteDatabase", c3742g);
        C3740e.m7759f(12, new C0035c(this, 29, c3742g), "anti_recall", "防撤回", null);
        m7752i(C1085e.class, new C0830a(this, 7, c3742g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m8163n(String str, C3742g c3742g) {
        Class<?> clsLoadClass = KavaReflector.loadClass(str, c3742g.f12145c);
        if (clsLoadClass != null) {
            for (Method method : KavaReflector.declaredMethods(clsLoadClass)) {
                if (AbstractC1416l.m3825a(method.getReturnType(), Integer.TYPE) && (AbstractC1416l.m3825a(method.getName(), "update") || AbstractC1416l.m3825a(method.getName(), "updateWithOnConflict"))) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    int length = parameterTypes.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            break;
                        }
                        if (ContentValues.class.isAssignableFrom(parameterTypes[i9])) {
                            C3744i.f12154b.m7763b(method, new C3942b(this, c3742g, 0));
                            break;
                        }
                        i9++;
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "防撤回";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0034 */
    /* JADX INFO: renamed from: p */
    public final void m8164p(C3742g c3742g) {
        Object c3959f;
        Object c3959f2;
        if (this.f12935m) {
            return;
        }
        List listM8158D = m8158D("legacy_self_recall_media_cleanup", c3742g);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM8158D) {
            if (m8150s((Method) obj)) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List list = arrayList;
        if (zIsEmpty) {
            list = null;
        }
        if (list == null) {
            try {
                DexKitBridge dexKitBridge = c3742g.f12146d;
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("MicroMsg.NetSceneRevokeMsg", "[oneliang][doSceneEnd.revokeMsg]", "cannot find the msg:%d after revoke."));
                c0570e.f1764h = c1253k;
                C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = c1731pFindMethod.iterator();
                while (it.hasNext()) {
                    C1731p c1731pM4349q = ((C1730o) it.next()).m4349q();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = c1731pM4349q.iterator();
                    while (it2.hasNext()) {
                        try {
                            c3959f2 = ((C1730o) it2.next()).m4350r(c3742g.f12145c);
                        } catch (Throwable th2) {
                            c3959f2 = new C3959f(th2);
                        }
                        if (c3959f2 instanceof C3959f) {
                            c3959f2 = null;
                        }
                        Method method = (Method) c3959f2;
                        if (method != null) {
                            arrayList3.add(method);
                        }
                    }
                    AbstractC4171r.m8432h1(arrayList2, arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (m8150s((Method) obj2)) {
                        arrayList4.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList4) {
                    if (hashSet.add(((Method) obj3).toGenericString())) {
                        arrayList5.add(obj3);
                    }
                }
                m8162O(c3742g, "legacy_self_recall_media_cleanup", arrayList5);
                c3959f = arrayList5;
            } catch (Throwable th3) {
                c3959f = new C3959f(th3);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            Object obj4 = c3959f;
            if (thM8182b != null) {
                m7750e("定位旧版自己撤回媒体清理方法失败", thM8182b);
                obj4 = C4173t.f13710g;
            }
            list = (List) obj4;
        }
        Iterator it3 = list.iterator();
        boolean z9 = false;
        while (it3.hasNext()) {
            try {
                C3744i.f12154b.m7763b((Method) it3.next(), new C3942b(this, c3742g, 2));
                z9 = true;
            } catch (Throwable th4) {
                m7750e("旧版自己撤回媒体清理Hook安装失败", th4);
            }
        }
        this.f12935m = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m8165q(C3742g c3742g, List list) {
        ClassLoader classLoader;
        Object c3959f;
        Object c3959f2;
        List listM8407P1;
        Class<?> declaringClass;
        Object c3959f3;
        Object c3959f4;
        if (this.f12933k) {
            return;
        }
        List list2 = C4173t.f13710g;
        List listM8158D = m8158D("message_storage_update", c3742g);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM8158D) {
            if (m8151t((Method) obj)) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List list3 = arrayList;
        if (zIsEmpty) {
            list3 = null;
        }
        boolean z9 = false;
        List<Method> list4 = list3;
        if (list3 == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C1730o c1730o = ((C3941a) it.next()).f12922b;
                if (c1730o != null) {
                    try {
                        c3959f3 = c1730o.m4349q();
                    } catch (Throwable th2) {
                        c3959f3 = new C3959f(th2);
                    }
                    if (c3959f3 instanceof C3959f) {
                        c3959f3 = list2;
                    }
                    Iterator it2 = ((List) c3959f3).iterator();
                    while (it2.hasNext()) {
                        try {
                            c3959f4 = ((C1730o) it2.next()).m4350r(c3742g.f12145c);
                        } catch (Throwable th3) {
                            c3959f4 = new C3959f(th3);
                        }
                        if (c3959f4 instanceof C3959f) {
                            c3959f4 = null;
                        }
                        Method method = (Method) c3959f4;
                        if (method != null && m8151t(method)) {
                            linkedHashSet.add(method);
                        }
                    }
                }
            }
            if (linkedHashSet.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((C3941a) it3.next()).f12921a);
                }
                Method method2 = (Method) AbstractC4166m.m8424v1(arrayList2);
                if (method2 == null || (declaringClass = method2.getDeclaringClass()) == null || (classLoader = declaringClass.getClassLoader()) == null) {
                    classLoader = c3742g.f12145c;
                }
                try {
                    c3959f = classLoader.loadClass("com.tencent.mm.storage.m9");
                } catch (Throwable th4) {
                    c3959f = new C3959f(th4);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                Class cls = (Class) c3959f;
                if (cls != null) {
                    try {
                        c3959f2 = classLoader.loadClass("com.tencent.mm.storage.k9");
                    } catch (Throwable th5) {
                        c3959f2 = new C3959f(th5);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    Class cls2 = (Class) c3959f2;
                    if (cls2 != null) {
                        List<Method> listDeclaredMethods = KavaReflector.declaredMethods(cls);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : listDeclaredMethods) {
                            Method method3 = (Method) obj2;
                            if (method3.getParameterTypes().length == 2 && AbstractC1416l.m3825a(method3.getParameterTypes()[0], Long.TYPE) && AbstractC1416l.m3825a(method3.getParameterTypes()[1], cls2)) {
                                arrayList3.add(obj2);
                            }
                        }
                        list2 = arrayList3;
                    }
                }
                listM8407P1 = list2;
            } else {
                listM8407P1 = AbstractC4166m.m8407P1(linkedHashSet);
            }
            m8162O(c3742g, "message_storage_update", listM8407P1);
            list4 = listM8407P1;
        }
        for (Method method4 : list4) {
            try {
                C3744i.f12154b.m7763b(method4, new C0036d(this, c3742g, method4));
                z9 = true;
            } catch (Throwable th6) {
                m7750e("自己撤回消息存储Hook安装失败", th6);
            }
        }
        this.f12933k = z9;
        if (list4.isEmpty()) {
            m7750e("自己撤回消息存储Hook未找到", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0039 */
    /* JADX INFO: renamed from: r */
    public final void m8166r(C3742g c3742g) {
        Object c3959f;
        if (this.f12934l) {
            return;
        }
        List listM8158D = m8158D("msg_processing_clear", c3742g);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM8158D) {
            Method method = (Method) obj;
            if (m8154w(method) || m8153v(method)) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List list = arrayList;
        if (zIsEmpty) {
            list = null;
        }
        if (list == null) {
            try {
                DexKitBridge dexKitBridge = c3742g.f12146d;
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("MicroMsg.MsgProcessingManager", "chris: can not parse from mmkv data!"));
                c0570e.f1764h = c1253k;
                C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = c1731pFindMethod.iterator();
                while (it.hasNext()) {
                    List<Method> listDeclaredMethods = KavaReflector.declaredMethods(((C1730o) it.next()).m4350r(c3742g.f12145c).getDeclaringClass());
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : listDeclaredMethods) {
                        Method method2 = (Method) obj2;
                        if (m8154w(method2) || m8153v(method2)) {
                            arrayList3.add(obj2);
                        }
                    }
                    AbstractC4171r.m8432h1(arrayList2, arrayList3);
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (hashSet.add(((Method) obj3).toGenericString())) {
                        arrayList4.add(obj3);
                    }
                }
                m8162O(c3742g, "msg_processing_clear", arrayList4);
                c3959f = arrayList4;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            Object obj4 = c3959f;
            if (thM8182b != null) {
                m7750e("定位媒体处理信息清理方法失败", thM8182b);
                obj4 = C4173t.f13710g;
            }
            list = (List) obj4;
        }
        Iterator it2 = list.iterator();
        boolean z9 = false;
        while (it2.hasNext()) {
            try {
                C3744i.f12154b.m7763b((Method) it2.next(), new C3942b(this, c3742g, 3));
                z9 = true;
            } catch (Throwable th3) {
                m7750e("媒体处理信息清理Hook安装失败", th3);
            }
        }
        this.f12934l = z9;
    }
}
