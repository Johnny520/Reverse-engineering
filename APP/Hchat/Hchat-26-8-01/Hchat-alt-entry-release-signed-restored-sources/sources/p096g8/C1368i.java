package p096g8;

import android.content.ContentValues;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p014b.C0126e;
import p025bc.AbstractC0255e;
import p062e8.C0827a;
import p068eh.AbstractC0921a;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.model.ContactLabelBean;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p129ig.AbstractC2043a;
import p136j8.C2104o;
import p183m8.C2815c;
import p331wa.AbstractC4699j;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: g8.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1368i {

    /* JADX INFO: renamed from: k */
    public static final String[] f4534k = {"ContactLabel", "contactlabel"};

    /* JADX INFO: renamed from: l */
    public static final String[] f4535l = {"labelID", "labelId", "labelid"};

    /* JADX INFO: renamed from: m */
    public static final String[] f4536m = {"labelName", "labelname"};

    /* JADX INFO: renamed from: n */
    public static final String[] f4537n = {"contactLabelIds", "contactLabelids"};

    /* JADX INFO: renamed from: o */
    public static final String[] f4538o = {"u", "r", "ig", "hh"};

    /* JADX INFO: renamed from: a */
    public final WeChatDatabaseApi f4539a;

    /* JADX INFO: renamed from: b */
    public final DexFinder f4540b;

    /* JADX INFO: renamed from: c */
    public final C2815c f4541c;

    /* JADX INFO: renamed from: d */
    public final C2002f f4542d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap f4543e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: f */
    public volatile boolean f4544f;

    /* JADX INFO: renamed from: g */
    public volatile Class f4545g;

    /* JADX INFO: renamed from: h */
    public volatile Object f4546h;

    /* JADX INFO: renamed from: i */
    public volatile Method f4547i;

    /* JADX INFO: renamed from: j */
    public volatile Method f4548j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1368i(WeChatDatabaseApi weChatDatabaseApi, DexFinder dexFinder, C2815c c2815c, C2002f c2002f) {
        this.f4539a = weChatDatabaseApi;
        this.f4540b = dexFinder;
        this.f4541c = c2815c;
        this.f4542d = c2002f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static Object m3684E(Object obj, String str, Method method) {
        if (obj == null || method == null || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            Object objInvoke = KavaReflector.invoke(method, obj, str, Boolean.TRUE);
            if (m3687J(objInvoke, str)) {
                return objInvoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m3685F(Method method, Object obj, String str, Object obj2) {
        Object objInvoke;
        if (method != null && obj != null) {
            try {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    objInvoke = KavaReflector.invoke(method, obj, obj2);
                } else if (parameterTypes.length == 2 && parameterTypes[0] == String.class) {
                    objInvoke = KavaReflector.invoke(method, obj, str, obj2);
                }
                if (objInvoke instanceof Boolean) {
                    if (((Boolean) objInvoke).booleanValue()) {
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m3686I(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith("@chatroom") || str.endsWith("@im.chatroom");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static boolean m3687J(Object obj, String str) {
        if (obj == null) {
            return false;
        }
        if (str.equals(KavaReflector.readField(obj, "field_username")) || str.equals(KavaReflector.readField(obj, "username"))) {
            return true;
        }
        if (KavaReflector.findFieldRecursive(obj.getClass(), "field_username") == null || KavaReflector.findFieldRecursive(obj.getClass(), "field_conRemark") == null) {
            return (KavaReflector.findFieldRecursive(obj.getClass(), "username") == null || KavaReflector.findFieldRecursive(obj.getClass(), "conRemark") == null) ? false : true;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static boolean m3688K(Object obj) {
        return (obj == null || KavaReflector.findMethodRecursive(obj.getClass(), "toByteArray", new Class[0]) == null || KavaReflector.findMethodRecursive(obj.getClass(), "parseFrom", byte[].class) == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static ArrayList m3689M(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList();
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str)) {
                    String strTrim = str.trim();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ContactLabelBean contactLabelBean = (ContactLabelBean) it2.next();
                        if (strTrim.equals(contactLabelBean.getLabelName()) || strTrim.equals(contactLabelBean.getName())) {
                            String labelId = contactLabelBean.getLabelId();
                            if (!TextUtils.isEmpty(labelId) && !arrayList2.contains(labelId)) {
                                arrayList2.add(labelId);
                            }
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static C0827a m3690T(byte[] bArr) {
        String str;
        String str2;
        C0827a c0827a = new C0827a();
        try {
            C1361b c1361b = new C1361b(bArr, 1, (byte) 0);
            while (true) {
                if (c1361b.f4512c >= c1361b.f4511b.length) {
                    return c0827a;
                }
                int iM3662j = c1361b.m3662j();
                int i9 = iM3662j >>> 3;
                int i10 = iM3662j & 7;
                if (i10 == 2 && i9 == 1) {
                    byte[] bArrM3660h = c1361b.m3660h();
                    try {
                        str2 = new String(bArrM3660h, "UTF-8");
                    } catch (Throwable unused) {
                        str2 = new String(bArrM3660h);
                    }
                    c0827a.f2476b = str2.trim();
                } else if (i10 == 2 && i9 == 2) {
                    byte[] bArrM3660h2 = c1361b.m3660h();
                    try {
                        str = new String(bArrM3660h2, "UTF-8");
                    } catch (Throwable unused2) {
                        str = new String(bArrM3660h2);
                    }
                    c0827a.f2477c = str.trim();
                } else {
                    c1361b.m3664l(i10);
                }
            }
        } catch (Throwable unused3) {
            return new C0827a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static String m3691V(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_'))) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        return AbstractC0921a.m2251n("`", str, "`");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static String m3692W(ByteBuffer byteBuffer) {
        m3696f(2, byteBuffer);
        int i9 = byteBuffer.getShort() & 65535;
        if (i9 == 0) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (i9 > 1048576) {
            C2104o.m5276A(AbstractC0921a.m2249l(i9, "字符串长度异常: "));
            return null;
        }
        m3696f(i9, byteBuffer);
        byte[] bArr = new byte[i9];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, "UTF-8");
        } catch (Throwable unused) {
            return new String(bArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static ArrayList m3693Z(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str)) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else if (str.endsWith("\u0000")) {
                str = AbstractC4855en.m9262f(1, 0, str);
            }
            for (String str2 : str.split(",")) {
                if (!TextUtils.isEmpty(str2)) {
                    String strTrim = str2.trim();
                    if (!TextUtils.isEmpty(strTrim) && !arrayList.contains(strTrim)) {
                        arrayList.add(strTrim);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static String m3694a0(String str, Map map) {
        Object obj = map != null ? map.get(str) : null;
        return obj != null ? String.valueOf(obj) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m3695e(Object obj, IdentityHashMap identityHashMap, ArrayList arrayList) {
        if (obj == null || identityHashMap.containsKey(obj)) {
            return;
        }
        identityHashMap.put(obj, Boolean.TRUE);
        if (m3688K(obj)) {
            arrayList.add(obj);
        }
        try {
            Iterator<Field> it = KavaReflector.declaredFields(obj.getClass()).iterator();
            while (it.hasNext()) {
                Object field = KavaReflector.readField(it.next(), obj);
                if (field != null && field != obj) {
                    m3695e(field, identityHashMap, arrayList);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m3696f(int i9, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= i9) {
            return;
        }
        C2104o.m5276A("lvbuff长度不足");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Class<?>[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.lang.Class */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static Method m3697g(Class cls, String str, Class... clsArr) {
        Class<?>[] parameterTypes;
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (str.equals(method.getName()) && (parameterTypes = method.getParameterTypes()) != 0 && parameterTypes.length == clsArr.length) {
                for (int i9 = 0; i9 < parameterTypes.length; i9++) {
                    if (!parameterTypes[i9].isAssignableFrom(clsArr[i9])) {
                        break;
                    }
                }
                return method;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Object m3698i(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            Object field = KavaReflector.readField(obj, "d");
            Object field2 = field != null ? KavaReflector.readField(field, "a") : null;
            Object field3 = field2 != null ? KavaReflector.readField(field2, "a") : null;
            if (field3 != null) {
                return field3;
            }
        } catch (Throwable unused) {
        }
        Object objM3699k = m3699k(obj, new IdentityHashMap());
        if (objM3699k != null) {
            return objM3699k;
        }
        ArrayList arrayList = new ArrayList();
        m3695e(obj, new IdentityHashMap(), arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Object m3699k(Object obj, IdentityHashMap identityHashMap) {
        if (obj == null || identityHashMap.containsKey(obj)) {
            return null;
        }
        identityHashMap.put(obj, Boolean.TRUE);
        if (m3688K(obj)) {
            return obj;
        }
        try {
            Iterator<Field> it = KavaReflector.declaredFields(obj.getClass()).iterator();
            while (it.hasNext()) {
                Object field = KavaReflector.readField(it.next(), obj);
                if (field != null && field != obj) {
                    if (m3688K(field)) {
                        return field;
                    }
                    Object objM3699k = m3699k(field, identityHashMap);
                    if (objM3699k != null) {
                        return objM3699k;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final LinkedHashMap m3700A(byte[] bArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bArr != null && bArr.length != 0) {
            try {
                C1361b c1361b = new C1361b(bArr, 1, (byte) 0);
                while (true) {
                    if (c1361b.f4512c >= c1361b.f4511b.length) {
                        break;
                    }
                    int iM3662j = c1361b.m3662j();
                    int i9 = iM3662j >>> 3;
                    int i10 = iM3662j & 7;
                    if (i9 == 1 && i10 == 2) {
                        C0827a c0827aM3690T = m3690T(c1361b.m3660h());
                        if (!TextUtils.isEmpty(c0827aM3690T.f2476b)) {
                            String str = c0827aM3690T.f2477c;
                            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                            if (str == null) {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            String str3 = c0827aM3690T.f2476b;
                            if (!str3.equals(str)) {
                                str2 = str;
                            }
                            linkedHashMap.put(str3, str2);
                        }
                    } else {
                        c1361b.m3664l(i10);
                    }
                }
            } catch (Throwable th2) {
                m3707N("解析群roomdata失败: " + th2.getMessage());
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m3701B(String str, String str2) {
        WeChatDatabaseApi weChatDatabaseApi;
        boolean z9 = false;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && (weChatDatabaseApi = this.f4539a) != null) {
            String strM9264h = AbstractC4855en.m9264h(str, ":", str2);
            ConcurrentHashMap concurrentHashMap = this.f4543e;
            Boolean bool = (Boolean) concurrentHashMap.get(strM9264h);
            if (bool != null) {
                return bool.booleanValue();
            }
            try {
                Iterator<Map<String, Object>> it = weChatDatabaseApi.query("PRAGMA table_info(" + str + ")", null).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (str2.equalsIgnoreCase(m3694a0("name", it.next()))) {
                        z9 = true;
                        break;
                    }
                }
            } catch (Throwable th2) {
                StringBuilder sbM1027p = AbstractC0255e.m1027p("检测字段失败: ", str, ".", str2, " ");
                sbM1027p.append(th2.getMessage());
                m3707N(sbM1027p.toString());
            }
            concurrentHashMap.put(strM9264h, Boolean.valueOf(z9));
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public final boolean m3702C(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ArrayList arrayListM3689M = m3689M(m3727p(), Collections.singletonList(str2.trim()));
            if (arrayListM3689M.size() == 1) {
                String strM3723l = m3723l("rcontact", f4537n);
                if (!TextUtils.isEmpty(strM3723l)) {
                    return m3693Z(this.f4539a.queryFirstString("SELECT " + m3691V(strM3723l) + " AS labelIds FROM rcontact WHERE username=? LIMIT 1", new String[]{str}, "labelIds")).contains(arrayListM3689M.get(0));
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public final void m3703D() {
        DexFinder dexFinder;
        if (this.f4544f || this.f4541c == null || (dexFinder = this.f4540b) == null) {
            return;
        }
        if (dexFinder.netQueueClass == null && dexFinder.netQueueCandidateClasses.isEmpty()) {
            return;
        }
        C2815c c2815c = this.f4541c;
        DexFinder dexFinder2 = this.f4540b;
        c2815c.m6212c(dexFinder2.netQueueClass, dexFinder2.netQueueCandidateClasses);
        this.f4544f = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public final boolean m3704G() {
        WeChatDatabaseApi weChatDatabaseApi = this.f4539a;
        return weChatDatabaseApi != null && weChatDatabaseApi.isAvailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public final boolean m3705H(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !this.f4539a.query("SELECT r.username FROM rcontact r WHERE r.username=? AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom' AND (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) LIMIT 1", new String[]{str}).isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public final boolean m3706L(String str) {
        return !TextUtils.isEmpty(str) && str.equals(m3715Y(2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public final void m3707N(String str) {
        if (this.f4542d != null) {
            C2005i.m4939f("[WeChatContactApi] ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public final boolean m3708O(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        return m3709P(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public final boolean m3709P(String str, List list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        String strM3723l = m3723l("rcontact", f4537n);
        if (TextUtils.isEmpty(strM3723l)) {
            return false;
        }
        String strM3719c = m3719c(this.f4539a.queryFirstString("SELECT " + m3691V(strM3723l) + " AS labelIds FROM rcontact WHERE username=? LIMIT 1", new String[]{str}, "labelIds"), list);
        if (strM3719c == null) {
            return false;
        }
        return m3717b(str, strM3723l, strM3719c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3710Q(String str, String str2) {
        boolean zM9237a;
        C0126e c0126eM3711R;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strTrim = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2.trim();
        if (TextUtils.isEmpty(str)) {
            zM9237a = false;
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("2", str);
                jSONObject.put("3", new JSONObject().put("1", strTrim == null ? HttpUrl.FRAGMENT_ENCODE_SET : strTrim));
                if (!TextUtils.isEmpty(HttpUrl.FRAGMENT_ENCODE_SET)) {
                    jSONObject.put("4", HttpUrl.FRAGMENT_ENCODE_SET);
                }
                zM9237a = AbstractC4699j.m9237a("/cgi-bin/micromsg-bin/setcontactproperty", 10022, 0, 0, jSONObject.toString(), null);
            } catch (Throwable th2) {
                m3707N("修改好友备注PB发包异常: " + th2.getMessage());
                zM9237a = false;
            }
        }
        if (!zM9237a) {
            if (TextUtils.isEmpty(str)) {
                zM9237a = false;
            } else {
                try {
                    c0126eM3711R = m3711R(str);
                } catch (Throwable th3) {
                    m3707N("修改好友备注原生存储异常: " + th3.getMessage());
                }
                if (c0126eM3711R != null) {
                    Object obj = c0126eM3711R.f333i;
                    if (c0126eM3711R.f332h != null) {
                        if (KavaReflector.writeField(obj, "field_conRemark", strTrim) || KavaReflector.writeField(obj, "conRemark", strTrim)) {
                            if (!m3685F(this.f4548j, c0126eM3711R.f332h, str, c0126eM3711R.f333i)) {
                                Class<?> cls = c0126eM3711R.f332h.getClass();
                                Class<?> cls2 = c0126eM3711R.f333i.getClass();
                                Method methodM3697g = m3697g(cls, "l0", cls2);
                                if (methodM3697g == null) {
                                    String[] strArr = {"p0", "o0"};
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= 2) {
                                            methodM3697g = null;
                                            break;
                                        }
                                        Method methodM3697g2 = m3697g(cls, strArr[i9], String.class, cls2);
                                        if (methodM3697g2 != null) {
                                            methodM3697g = methodM3697g2;
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                                if (methodM3697g != null && m3685F(methodM3697g, c0126eM3711R.f332h, str, c0126eM3711R.f333i)) {
                                    this.f4548j = methodM3697g;
                                }
                            }
                            zM9237a = true;
                        } else {
                            m3707N("修改好友备注失败: 未找到原生备注字段 username=" + str + " contact=" + c0126eM3711R.f333i.getClass().getName());
                        }
                    }
                    zM9237a = false;
                }
            }
        }
        if (!zM9237a) {
            m3707N("修改好友备注失败: 同步接口不可用 username=".concat(str));
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("conRemark", strTrim);
        int iUpdate = this.f4539a.update("rcontact", contentValues, "username=?", new String[]{str});
        if (iUpdate > 0) {
            return true;
        }
        m3707N("修改好友备注本地刷新失败: username=" + str + " rows=" + iUpdate);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0126e m3711R(String str) {
        Object objInvoke;
        Object objM3684E;
        C0126e c0126e;
        Object obj = this.f4546h;
        Object objM3684E2 = m3684E(obj, str, this.f4547i);
        if (objM3684E2 != null) {
            return new C0126e(obj, 9, objM3684E2);
        }
        DexFinder dexFinder = this.f4540b;
        if (dexFinder == null) {
            c0126e = null;
        } else {
            Method method = dexFinder.contactStorageGetterMethod;
            Method method2 = dexFinder.contactStorageQueryMethod;
            if (method != null && method2 != null) {
                try {
                    Object objM4995A = AbstractC2043a.m4995A(dexFinder, method.getDeclaringClass());
                    if (objM4995A != null && (objInvoke = KavaReflector.invoke(method, objM4995A, new Object[0])) != null && method2.getDeclaringClass().isInstance(objInvoke) && (objM3684E = m3684E(objInvoke, str, method2)) != null) {
                        this.f4546h = objInvoke;
                        this.f4547i = method2;
                        c0126e = new C0126e(objInvoke, 9, objM3684E);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        if (c0126e != null) {
            return c0126e;
        }
        WeChatDatabaseApi weChatDatabaseApi = this.f4539a;
        Object coreStorage = weChatDatabaseApi != null ? weChatDatabaseApi.getCoreStorage() : null;
        if (coreStorage == null) {
            return null;
        }
        return m3722j(coreStorage, str, Collections.newSetFromMap(new IdentityHashMap()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public final String m3712S(C1367h c1367h) {
        if (c1367h == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb2 = new StringBuilder("SELECT MAX(CAST(");
        sb2.append(m3691V(c1367h.f4532c));
        sb2.append(" AS INTEGER)) AS maxId FROM ");
        String str = c1367h.f4531b;
        WeChatDatabaseApi weChatDatabaseApi = this.f4539a;
        sb2.append(weChatDatabaseApi.quoteTable(str));
        String strQueryFirstString = weChatDatabaseApi.queryFirstString(sb2.toString(), null, "maxId");
        int i9 = 0;
        if (!TextUtils.isEmpty(strQueryFirstString)) {
            try {
                i9 = Integer.parseInt(strQueryFirstString);
            } catch (Throwable unused) {
            }
        }
        int i10 = i9 + 1;
        return String.valueOf(i10 > 0 ? i10 : 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public final ArrayList m3713U(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, Object>> it = this.f4539a.query(str, strArr).iterator();
        while (it.hasNext()) {
            arrayList.add(m3718b0(it.next()));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public final Class m3714X(Constructor constructor) {
        Type[] actualTypeArguments;
        Class cls = this.f4545g;
        if (cls != null) {
            return cls;
        }
        try {
            Object objM3698i = m3698i(KavaReflector.newInstance(constructor, new LinkedList()));
            if (objM3698i != null) {
                for (Field field : KavaReflector.declaredFields(objM3698i.getClass())) {
                    if (List.class.isAssignableFrom(field.getType())) {
                        Type genericType = field.getGenericType();
                        if ((genericType instanceof ParameterizedType) && (actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments()) != null && actualTypeArguments.length == 1) {
                            Type type = actualTypeArguments[0];
                            if (type instanceof Class) {
                                Class cls2 = (Class) type;
                                Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(cls2, "d");
                                Field fieldFindFieldRecursive2 = KavaReflector.findFieldRecursive(cls2, "e");
                                if (fieldFindFieldRecursive != null && fieldFindFieldRecursive2 != null && fieldFindFieldRecursive.getType() == String.class && fieldFindFieldRecursive2.getType() == String.class) {
                                    this.f4545g = cls2;
                                    return this.f4545g;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        } catch (Throwable th2) {
            m3707N("解析标签请求项类型失败: " + th2.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public final String m3715Y(int i9) {
        WeChatDatabaseApi weChatDatabaseApi = this.f4539a;
        return weChatDatabaseApi == null ? HttpUrl.FRAGMENT_ENCODE_SET : weChatDatabaseApi.queryFirstString("SELECT value FROM userinfo WHERE id=?", new String[]{String.valueOf(i9)}, "value");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m3716a(String str) {
        String strM3712S;
        C2815c c2815c;
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strTrim = str.trim();
        for (ContactLabelBean contactLabelBean : m3727p()) {
            if (strTrim.equals(contactLabelBean.getLabelName()) || strTrim.equals(contactLabelBean.getName())) {
                return contactLabelBean.getLabelId();
            }
        }
        try {
            strM3712S = m3712S(m3721h());
        } catch (Throwable unused) {
            strM3712S = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        DexFinder dexFinder = this.f4540b;
        Constructor<?> constructor = dexFinder != null ? dexFinder.addContactLabelCtorString : null;
        boolean z9 = false;
        if (constructor == null || (c2815c = this.f4541c) == null || dexFinder == null) {
            m3707N("增加联系人标签失败: 网络API未就绪");
        } else {
            m3703D();
            try {
                boolean zM6216j = c2815c.m6216j(KavaReflector.newInstance(constructor, strTrim));
                if (!zM6216j) {
                    m3707N("增加联系人标签发包失败: " + strTrim);
                }
                z9 = zM6216j;
            } catch (Throwable th2) {
                m3707N("增加联系人标签发包异常: " + th2.getMessage());
            }
        }
        return z9 ? strM3712S : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m3717b(String str, String str2, String str3) {
        boolean zM9237a;
        boolean zM6216j;
        C2815c c2815c;
        if (TextUtils.isEmpty(str)) {
            zM9237a = false;
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("1", str);
                jSONObject.put("2", str3);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("2", 1);
                jSONObject2.put("3", jSONObject);
                zM9237a = AbstractC4699j.m9237a("/cgi-bin/micromsg-bin/modifycontactlabellist", 638, 0, 0, jSONObject2.toString(), null);
            } catch (Throwable th2) {
                m3707N("修改好友标签PB发包异常: " + th2.getMessage());
                zM9237a = false;
            }
        }
        if (zM9237a) {
            zM6216j = true;
        } else {
            DexFinder dexFinder = this.f4540b;
            Constructor<?> constructor = dexFinder != null ? dexFinder.modifyContactLabelListCtor : null;
            if (constructor == null || (c2815c = this.f4541c) == null || dexFinder == null) {
                m3707N("修改好友标签失败: 网络API未就绪");
            } else {
                m3703D();
                try {
                    Object objM3720d = m3720d(constructor, str, str3);
                    if (objM3720d == null) {
                        m3707N("修改好友标签失败: 构造请求项为空");
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(objM3720d);
                        zM6216j = c2815c.m6216j(KavaReflector.newInstance(constructor, linkedList));
                        if (!zM6216j) {
                            m3707N("修改好友标签发包失败: username=" + str);
                        }
                    }
                } catch (Throwable th3) {
                    m3707N("修改好友标签发包异常: " + th3.getMessage());
                }
            }
            zM6216j = false;
        }
        if (!zM6216j) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(str2, str3);
        int iUpdate = this.f4539a.update("rcontact", contentValues, "username=?", new String[]{str});
        if (iUpdate > 0) {
            return true;
        }
        m3707N("修改好友标签失败: username=" + str + " rows=" + iUpdate);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f8  */
    /* JADX INFO: renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final WeChatContact m3718b0(Map map) {
        int i9;
        String str;
        String str2;
        Object obj;
        int i10;
        String strM3692W;
        Object obj2 = map != null ? map.get("lvbuff") : null;
        byte[] bArr = obj2 instanceof byte[] ? (byte[]) obj2 : null;
        int iIntValue = 0;
        String strM3692W2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (bArr == null || bArr.length < 2 || bArr[0] != 123 || bArr[bArr.length - 1] != 125) {
            i9 = 0;
            str = HttpUrl.FRAGMENT_ENCODE_SET;
            str2 = str;
        } else {
            try {
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.position(1);
                m3696f(4, byteBufferWrap);
                byteBufferWrap.getInt();
                m3696f(4, byteBufferWrap);
                i10 = byteBufferWrap.getInt();
                try {
                    m3692W(byteBufferWrap);
                    m3696f(8, byteBufferWrap);
                    byteBufferWrap.getLong();
                    m3696f(4, byteBufferWrap);
                    byteBufferWrap.getInt();
                    m3692W(byteBufferWrap);
                    m3692W(byteBufferWrap);
                    m3696f(4, byteBufferWrap);
                    byteBufferWrap.getInt();
                    m3696f(4, byteBufferWrap);
                    byteBufferWrap.getInt();
                    m3692W(byteBufferWrap);
                    m3692W(byteBufferWrap);
                    m3696f(4, byteBufferWrap);
                    byteBufferWrap.getInt();
                    m3696f(4, byteBufferWrap);
                    byteBufferWrap.getInt();
                    m3692W(byteBufferWrap);
                    strM3692W = m3692W(byteBufferWrap);
                    try {
                        strM3692W2 = m3692W(byteBufferWrap);
                    } catch (Throwable th2) {
                        th = th2;
                        m3707N("解析联系人lvbuff失败: " + th.getMessage());
                    }
                } catch (Throwable th3) {
                    th = th3;
                    strM3692W = HttpUrl.FRAGMENT_ENCODE_SET;
                    m3707N("解析联系人lvbuff失败: " + th.getMessage());
                    str2 = strM3692W2;
                    str = strM3692W;
                    i9 = i10;
                    String strM3694a0 = m3694a0("username", map);
                    String strM3694a02 = m3694a0("nickname", map);
                    String strM3694a03 = m3694a0("alias", map);
                    String strM3694a04 = m3694a0("conRemark", map);
                    String strM3694a05 = m3694a0("avatarUrl", map);
                    String strM3694a06 = m3694a0("avatarBackupUrl", map);
                    String strM3694a07 = m3694a0("encryptUsername", map);
                    if (map != null) {
                    }
                    if (!(obj instanceof Number)) {
                    }
                    return new WeChatContact(strM3694a0, strM3694a02, strM3694a03, strM3694a04, strM3694a05, strM3694a06, strM3694a07, str, str2, i9, iIntValue);
                }
            } catch (Throwable th4) {
                th = th4;
                i10 = 0;
            }
            str2 = strM3692W2;
            str = strM3692W;
            i9 = i10;
        }
        String strM3694a08 = m3694a0("username", map);
        String strM3694a022 = m3694a0("nickname", map);
        String strM3694a032 = m3694a0("alias", map);
        String strM3694a042 = m3694a0("conRemark", map);
        String strM3694a052 = m3694a0("avatarUrl", map);
        String strM3694a062 = m3694a0("avatarBackupUrl", map);
        String strM3694a072 = m3694a0("encryptUsername", map);
        obj = map != null ? map.get("type") : null;
        if (!(obj instanceof Number)) {
            iIntValue = ((Number) obj).intValue();
        } else if (obj != null) {
            try {
                iIntValue = Integer.parseInt(String.valueOf(obj));
            } catch (Throwable unused) {
            }
        }
        return new WeChatContact(strM3694a08, strM3694a022, strM3694a032, strM3694a042, strM3694a052, strM3694a062, strM3694a072, str, str2, i9, iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m3719c(String str, List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!TextUtils.isEmpty(str2)) {
                String strTrim = str2.trim();
                if (!TextUtils.isEmpty(strTrim) && !arrayList.contains(strTrim)) {
                    arrayList.add(strTrim);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayListM3727p = m3727p();
            ArrayList<String> arrayListM3689M = m3689M(arrayListM3727p, arrayList);
            if (arrayListM3689M.size() != arrayList.size()) {
                m3707N("生成好友标签ID失败: 存在尚未同步的标签 names=" + arrayList);
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayListM3727p.iterator();
            while (it2.hasNext()) {
                String labelId = ((ContactLabelBean) it2.next()).getLabelId();
                if (!TextUtils.isEmpty(labelId) && !arrayList2.contains(labelId)) {
                    arrayList2.add(labelId);
                }
            }
            if (!arrayListM3689M.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (String str3 : m3693Z(str)) {
                    if (arrayList2.contains(str3) && !arrayList3.contains(str3)) {
                        arrayList3.add(str3);
                    }
                }
                for (String str4 : arrayListM3689M) {
                    String strTrim2 = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4.trim();
                    if (!TextUtils.isEmpty(strTrim2) && !arrayList3.contains(strTrim2)) {
                        arrayList3.add(strTrim2);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    return TextUtils.join(",", arrayList3) + (char) 0;
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final Object m3720d(Constructor constructor, String str, String str2) {
        try {
            Class clsM3714X = m3714X(constructor);
            if (clsM3714X != null) {
                Object objNewInstanceByArgs = KavaReflector.newInstanceByArgs(clsM3714X, new Object[0]);
                if (objNewInstanceByArgs == null) {
                    objNewInstanceByArgs = KavaReflector.newInstance(KavaReflector.findConstructor(clsM3714X, new Class[0]), new Object[0]);
                }
                if (objNewInstanceByArgs != null) {
                    boolean zWriteField = KavaReflector.writeField(objNewInstanceByArgs, "d", str);
                    boolean zWriteField2 = KavaReflector.writeField(objNewInstanceByArgs, "e", str2);
                    if (zWriteField && zWriteField2) {
                        return objNewInstanceByArgs;
                    }
                    m3707N("构造标签请求项失败: 字段写入失败 username=" + zWriteField + " labelIds=" + zWriteField2);
                    return null;
                }
            }
            return null;
        } catch (Throwable th2) {
            m3707N("构造标签请求项失败: " + th2.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final C1367h m3721h() {
        boolean z9;
        WeChatDatabaseApi weChatDatabaseApi = this.f4539a;
        if (weChatDatabaseApi == null) {
            return null;
        }
        for (int i9 = 0; i9 < 2; i9++) {
            String str = f4534k[i9];
            if (TextUtils.isEmpty(str)) {
                z9 = false;
            } else {
                try {
                    z9 = !TextUtils.isEmpty(weChatDatabaseApi.queryFirstString("SELECT name FROM sqlite_master WHERE type='table' AND name=? LIMIT 1", new String[]{str}, "name"));
                } catch (Throwable unused) {
                    z9 = false;
                }
            }
            if (z9) {
                String strM3723l = m3723l(str, f4535l);
                String strM3723l2 = m3723l(str, f4536m);
                if (!TextUtils.isEmpty(strM3723l) && !TextUtils.isEmpty(strM3723l2)) {
                    return new C1367h(str, strM3723l, strM3723l2);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0079, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0126e m3722j(Object obj, String str, Set set) {
        Method next;
        C0126e c0126eM3722j;
        Class<?> type;
        C0126e c0126eM3722j2;
        Class<?> returnType;
        Class<?> cls;
        if (obj != null && !set.contains(obj)) {
            set.add(obj);
            Iterator<Method> it = KavaReflector.declaredMethods(obj.getClass()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Class<?>[] parameterTypes = next.getParameterTypes();
                if (parameterTypes != null && parameterTypes.length == 2 && parameterTypes[0] == String.class && ((cls = parameterTypes[1]) == Boolean.TYPE || cls == Boolean.class)) {
                    try {
                        if (m3687J(KavaReflector.invoke(next, obj, str, Boolean.TRUE), str)) {
                            break;
                        }
                    } catch (Throwable unused) {
                        continue;
                    }
                }
            }
            Object objM3684E = m3684E(obj, str, next);
            if (objM3684E != null) {
                this.f4546h = obj;
                this.f4547i = next;
                return new C0126e(obj, 9, objM3684E);
            }
            loop1: for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Method method : KavaReflector.declaredMethods(superclass)) {
                    if (method != null && !KavaReflector.isStatic(method) && method.getParameterTypes().length == 0 && (returnType = method.getReturnType()) != null && !returnType.isPrimitive() && returnType != String.class && returnType != Void.TYPE) {
                        String name = method.getName();
                        String[] strArr = f4538o;
                        int i9 = 0;
                        while (true) {
                            if (i9 >= 4) {
                                break;
                            }
                            if (strArr[i9].equals(name)) {
                                try {
                                    c0126eM3722j = m3722j(KavaReflector.invoke(method, obj, new Object[0]), str, set);
                                    if (c0126eM3722j != null) {
                                        break loop1;
                                    }
                                } catch (Throwable unused2) {
                                    continue;
                                }
                            } else {
                                i9++;
                            }
                        }
                    }
                }
            }
            c0126eM3722j = null;
            if (c0126eM3722j != null) {
                return c0126eM3722j;
            }
            for (Field field : KavaReflector.declaredFields(obj.getClass())) {
                try {
                    if (!KavaReflector.isStatic(field) && (type = field.getType()) != null && !type.isPrimitive() && type != String.class && (c0126eM3722j2 = m3722j(KavaReflector.readField(field, obj), str, set)) != null) {
                        return c0126eM3722j2;
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final String m3723l(String str, String[] strArr) {
        for (String str2 : strArr) {
            if (m3701B(str, str2)) {
                return str2;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final String m3724m(String str, boolean z9) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List<Map<String, Object>> listQuery = this.f4539a.query("SELECT reserved2, reserved1 FROM img_flag WHERE username=? LIMIT 1", new String[]{str});
        if (listQuery.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM3694a0 = m3694a0("reserved1", listQuery.get(0));
        String strM3694a02 = m3694a0("reserved2", listQuery.get(0));
        return (!z9 ? !TextUtils.isEmpty(strM3694a02) : TextUtils.isEmpty(strM3694a0)) ? strM3694a0 : strM3694a02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final WeChatContact m3725n(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List<Map<String, Object>> listQuery = this.f4539a.query("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username=? LIMIT 1", new String[]{str});
        if (listQuery.isEmpty()) {
            return null;
        }
        return m3718b0(listQuery.get(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final ArrayList m3726o(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String strM3723l = m3723l("rcontact", f4537n);
            if (!TextUtils.isEmpty(strM3723l)) {
                try {
                    String str2 = "SELECT username FROM rcontact WHERE " + m3691V(strM3723l) + "=? OR " + m3691V(strM3723l) + " LIKE ? OR " + m3691V(strM3723l) + " LIKE ? OR " + m3691V(strM3723l) + " LIKE ?";
                    Iterator<Map<String, Object>> it = this.f4539a.query(str2, new String[]{str, str + ",%", "%," + str + ",%", "%," + str}).iterator();
                    while (it.hasNext()) {
                        String strM3694a0 = m3694a0("username", it.next());
                        if (!TextUtils.isEmpty(strM3694a0) && !arrayList.contains(strM3694a0)) {
                            arrayList.add(strM3694a0);
                        }
                    }
                } catch (Throwable th2) {
                    m3707N("按标签ID获取联系人失败: " + th2.getMessage());
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final ArrayList m3727p() {
        WeChatDatabaseApi weChatDatabaseApi = this.f4539a;
        ArrayList arrayList = new ArrayList();
        C1367h c1367hM3721h = m3721h();
        if (c1367hM3721h != null) {
            try {
                String str = c1367hM3721h.f4533d;
                String str2 = c1367hM3721h.f4532c;
                for (Map<String, Object> map : weChatDatabaseApi.query("SELECT " + m3691V(str2) + " AS labelId, " + m3691V(str) + " AS labelName FROM " + weChatDatabaseApi.quoteTable(c1367hM3721h.f4531b) + " ORDER BY CAST(" + m3691V(str2) + " AS INTEGER), " + m3691V(str), null)) {
                    String strM3694a0 = m3694a0("labelId", map);
                    String strM3694a02 = m3694a0("labelName", map);
                    if (!TextUtils.isEmpty(strM3694a0) || !TextUtils.isEmpty(strM3694a02)) {
                        arrayList.add(new ContactLabelBean(strM3694a0, strM3694a02, m3726o(strM3694a0)));
                    }
                }
            } catch (Throwable th2) {
                m3707N("获取标签列表失败: " + th2.getMessage());
                return arrayList;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final ArrayList m3728q(List list) {
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty() && this.f4539a != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!TextUtils.isEmpty(str) && !arrayList2.contains(str)) {
                    arrayList2.add(str);
                }
            }
            if (!arrayList2.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                    if (i9 > 0) {
                        sb2.append(',');
                    }
                    sb2.append('?');
                }
                HashMap map = new HashMap();
                for (WeChatContact weChatContact : m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username IN (" + ((Object) sb2) + ")", (String[]) arrayList2.toArray(new String[0]))) {
                    map.put(weChatContact.wxId, weChatContact);
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    WeChatContact weChatContact2 = (WeChatContact) map.get(str2);
                    if (weChatContact2 == null) {
                        weChatContact2 = new WeChatContact(str2, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0);
                    }
                    arrayList.add(weChatContact2);
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final String m3729r(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            if (m3686I(str)) {
                String strQueryFirstString = this.f4539a.queryFirstString("SELECT nickname FROM rcontact WHERE username=?", new String[]{str}, "nickname");
                return !TextUtils.isEmpty(strQueryFirstString) ? strQueryFirstString : str;
            }
            WeChatContact weChatContactM3725n = m3725n(str);
            return weChatContactM3725n != null ? weChatContactM3725n.displayName() : str;
        } catch (Throwable th2) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("获取显示名失败: ", str, " ");
            sbM1026o.append(th2.getMessage());
            m3707N(sbM1026o.toString());
            return str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final int m3730s(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (m3706L(str)) {
                String strM3715Y = m3715Y(12290);
                if (TextUtils.isEmpty(strM3715Y)) {
                    return 0;
                }
                try {
                    return Integer.parseInt(strM3715Y);
                } catch (Throwable unused) {
                    return 0;
                }
            }
            WeChatContact weChatContactM3725n = m3725n(str);
            if (weChatContactM3725n != null) {
                return weChatContactM3725n.gender;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final String m3731t(String str, String str2) {
        DexFinder dexFinder;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zIsEmpty) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (m3686I(str) && !TextUtils.isEmpty(str2) && (dexFinder = this.f4540b) != null) {
            try {
                Method method = dexFinder.groupMemberDisplayNameMethod;
                if (method == null) {
                    m3707N("微信内部群昵称方法未解析: group=" + str + " member=" + str2);
                } else {
                    Object objInvoke = KavaReflector.invoke(method, null, str2, str);
                    String strTrim = objInvoke instanceof String ? ((String) objInvoke).trim() : HttpUrl.FRAGMENT_ENCODE_SET;
                    m3707N("微信内部群昵称返回: method=" + method.getDeclaringClass().getName() + "#" + method.getName() + " group=" + str + " member=" + str2 + " name=" + strTrim);
                    if (!TextUtils.isEmpty(strTrim) && !str2.equals(strTrim)) {
                        str3 = strTrim;
                    }
                }
            } catch (Throwable th2) {
                StringBuilder sbM1027p = AbstractC0255e.m1027p("微信内部群昵称方法失败: group=", str, " member=", str2, " ");
                sbM1027p.append(th2.getMessage());
                m3707N(sbM1027p.toString());
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        String strM3733v = m3733v(str, str2);
        if (!TextUtils.isEmpty(strM3733v)) {
            return strM3733v;
        }
        String strM3729r = m3729r(str2);
        StringBuilder sbM1027p2 = AbstractC0255e.m1027p("群成员昵称回退: group=", str, " member=", str2, " contactName=");
        sbM1027p2.append(strM3729r);
        m3707N(sbM1027p2.toString());
        return !TextUtils.isEmpty(strM3729r) ? strM3729r : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final ArrayList m3732u(String str) {
        ArrayList arrayList = new ArrayList();
        if (m3686I(str)) {
            String strQueryFirstString = this.f4539a.queryFirstString("SELECT memberlist FROM chatroom WHERE chatroomname=?", new String[]{str}, "memberlist");
            if (!TextUtils.isEmpty(strQueryFirstString)) {
                for (String str2 : strQueryFirstString.split(";")) {
                    if (!TextUtils.isEmpty(str2)) {
                        arrayList.add(str2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final String m3733v(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str3 = (String) m3734w(str).get(str2);
        return !TextUtils.isEmpty(str3) ? str3 : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final LinkedHashMap m3734w(String str) {
        String[] strArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (m3686I(str)) {
            try {
                boolean zM3701B = m3701B("chatroom", "roomdata");
                WeChatDatabaseApi weChatDatabaseApi = this.f4539a;
                StringBuilder sb2 = new StringBuilder("SELECT memberlist, displayname");
                sb2.append(zM3701B ? ", roomdata" : HttpUrl.FRAGMENT_ENCODE_SET);
                sb2.append(" FROM chatroom WHERE chatroomname=? LIMIT 1");
                List<Map<String, Object>> listQuery = weChatDatabaseApi.query(sb2.toString(), new String[]{str});
                if (!listQuery.isEmpty()) {
                    Map<String, Object> map = listQuery.get(0);
                    if (zM3701B) {
                        Object obj = map != null ? map.get("roomdata") : null;
                        linkedHashMap.putAll(m3700A(obj instanceof byte[] ? (byte[]) obj : null));
                    }
                    String strM3694a0 = m3694a0("memberlist", map);
                    String strM3694a02 = m3694a0("displayname", map);
                    if (!TextUtils.isEmpty(strM3694a0) && !TextUtils.isEmpty(strM3694a02)) {
                        String[] strArrSplit = TextUtils.isEmpty(strM3694a0) ? new String[0] : strM3694a0.split(";");
                        int length = strArrSplit.length;
                        if (TextUtils.isEmpty(strM3694a02)) {
                            strArr = new String[0];
                        } else {
                            String[] strArr2 = {"\u0001", "\u0002", "\n", ";"};
                            for (int i9 = 0; i9 < 4; i9++) {
                                String[] strArrSplit2 = strM3694a02.split(Pattern.quote(strArr2[i9]), -1);
                                if (length > 0 && strArrSplit2.length != length) {
                                }
                                strArr = strArrSplit2;
                            }
                            strArr = new String[]{strM3694a02};
                        }
                        if (strArrSplit.length == 0 || strArrSplit.length != strArr.length) {
                            m3707N("chatroom.displayname无法对齐: group=" + str + " members=" + strArrSplit.length + " names=" + strArr.length);
                        } else {
                            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                                String str2 = strArrSplit[i10];
                                String str3 = strArr[i10];
                                String strTrim = str3 != null ? str3.trim() : HttpUrl.FRAGMENT_ENCODE_SET;
                                if (!TextUtils.isEmpty(str2) && !linkedHashMap.containsKey(str2) && !TextUtils.isEmpty(strTrim) && !str2.equals(strTrim)) {
                                    linkedHashMap.put(str2, strTrim);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                StringBuilder sbM1026o = AbstractC0255e.m1026o("获取群成员昵称失败: group=", str, " ");
                sbM1026o.append(th2.getMessage());
                m3707N(sbM1026o.toString());
                return linkedHashMap;
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final ArrayList m3735x() {
        return m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.username LIKE '%@chatroom' OR r.username LIKE '%@im.chatroom'", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final ArrayList m3736y() {
        ArrayList<WeChatContact> arrayListM3713U = m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE r.verifyFlag=0 AND r.username NOT LIKE '%@chatroom' AND r.username NOT LIKE '%@im.chatroom' AND r.username NOT LIKE 'gh\\_%' ESCAPE '\\' AND r.username NOT IN ('filehelper','fmessage','tmessage','qqmail','weixin','floatbottle','medianote','medianote@chatroom','newsapp','masssend','feedsapp','blogapp')", null);
        if (arrayListM3713U.isEmpty()) {
            return arrayListM3713U;
        }
        HashSet hashSet = new HashSet();
        for (WeChatContact weChatContact : m3713U("SELECT r.username, r.alias, r.conRemark, r.nickname, r.encryptUsername, r.type, r.lvbuff AS lvbuff, i.reserved1 AS avatarUrl, i.reserved2 AS avatarBackupUrl FROM rcontact r LEFT JOIN img_flag i ON r.username = i.username WHERE (r.encryptUsername!='' OR r.username=(SELECT value FROM userinfo WHERE id=2)) AND r.verifyFlag=0 AND (r.type & 1)!=0 AND (r.type & 8)=0 AND (r.type & 32)=0 AND r.username NOT LIKE '%chatroom'", null)) {
            if (weChatContact != null && !TextUtils.isEmpty(weChatContact.wxId)) {
                hashSet.add(weChatContact.wxId);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (WeChatContact weChatContact2 : arrayListM3713U) {
            if (weChatContact2 != null && (hashSet.contains(weChatContact2.wxId) || weChatContact2.wxId.endsWith("@openim"))) {
                arrayList.add(weChatContact2);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final String m3737z(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String strTrim = HttpUrl.FRAGMENT_ENCODE_SET;
        if (zIsEmpty) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (!m3706L(str)) {
            WeChatContact weChatContactM3725n = m3725n(str);
            return weChatContactM3725n != null ? weChatContactM3725n.getRegion() : HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM3715Y = m3715Y(12293);
        String strM3715Y2 = m3715Y(12292);
        String strTrim2 = strM3715Y == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM3715Y.trim();
        if (strM3715Y2 != null) {
            strTrim = strM3715Y2.trim();
        }
        return TextUtils.isEmpty(strTrim2) ? strTrim : (TextUtils.isEmpty(strTrim) || strTrim2.equals(strTrim)) ? strTrim2 : AbstractC4855en.m9264h(strTrim2, " ", strTrim);
    }
}
