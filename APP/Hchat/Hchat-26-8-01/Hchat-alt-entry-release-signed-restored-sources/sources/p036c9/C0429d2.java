package p036c9;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import ch.C0570e;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3019q;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p019b4.C0178b;
import p054dg.C0791j;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p106h8.C1624a;
import p210o8.C3087k;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p304uf.C4333g;
import tf.AbstractC4151b;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.AbstractC4178y;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: renamed from: c9.d2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0429d2 {

    /* JADX INFO: renamed from: a */
    public static final C0429d2 f1235a = new C0429d2();

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f1236b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f1237c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f1238d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap.KeySetView f1239e = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: f */
    public static final Map f1240f = AbstractC3199a.m6843p();

    /* JADX INFO: renamed from: g */
    public static final Map f1241g = AbstractC3199a.m6843p();

    /* JADX INFO: renamed from: h */
    public static final Map f1242h = AbstractC3199a.m6843p();

    /* JADX INFO: renamed from: i */
    public static final Map f1243i = AbstractC3199a.m6843p();

    /* JADX INFO: renamed from: j */
    public static final ThreadLocal f1244j = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    public static final ThreadLocal f1245k = new ThreadLocal();

    /* JADX INFO: renamed from: l */
    public static final ThreadLocal f1246l = new ThreadLocal();

    /* JADX INFO: renamed from: m */
    public static final ExecutorService f1247m = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(1));

    /* JADX INFO: renamed from: n */
    public static final Handler f1248n = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: o */
    public static volatile Method f1249o;

    /* JADX INFO: renamed from: p */
    public static volatile Method f1250p;

    /* JADX INFO: renamed from: q */
    public static volatile Object f1251q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static void m1416A(Object obj, Context context) {
        String strM1442v;
        Object next;
        String str;
        if (obj == null || (strM1442v = m1442v(obj)) == null) {
            return;
        }
        Iterator it = AbstractC0473o2.m1485i(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (m1421F(((C0414a) next).f1179a).equals(strM1442v)) {
                    break;
                }
            }
        }
        C0414a c0414a = (C0414a) next;
        if (c0414a == null || (str = c0414a.f1180b) == null) {
            return;
        }
        m1444x(strM1442v, obj, str, KavaReflector.readField(obj, "adapter"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m1417B(Object obj) {
        String strM1442v;
        WeChatDatabaseApi weChatDatabaseApiDatabase;
        String strQueryFirstString;
        Integer numM6741e0;
        if (obj == null || (strM1442v = m1442v(obj)) == null || (weChatDatabaseApiDatabase = WeChatApis.database()) == null || (strQueryFirstString = weChatDatabaseApiDatabase.queryFirstString("SELECT IFNULL(unReadCount,0) AS unReadCount FROM rconversation WHERE username=? LIMIT 1", new String[]{strM1442v}, "unReadCount")) == null || (numM6741e0 = AbstractC3156t.m6741e0(10, strQueryFirstString)) == null) {
            return;
        }
        int iIntValue = numM6741e0.intValue();
        if (iIntValue < 0) {
            iIntValue = 0;
        }
        Class<?> cls = obj.getClass();
        Integer numValueOf = Integer.valueOf(iIntValue);
        Boolean bool = Boolean.TRUE;
        if (KavaReflector.invokeSuccessfully(KavaReflector.findCompatibleMethod(cls, "setUnread", numValueOf, bool), obj, Integer.valueOf(iIntValue), bool)) {
            return;
        }
        AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 同步微信原生分组页未读数失败: talker=" + strM1442v + " unread=" + iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m1418C(WeChatDatabaseApi weChatDatabaseApi, List list, String str) {
        Object c3959f;
        int iIntValue;
        if (list.isEmpty()) {
            return true;
        }
        Method method = f1249o;
        if (method != null) {
            Object objStorageObjectForMethod = f1251q;
            Object obj = null;
            if (objStorageObjectForMethod != null) {
                Class<?> declaringClass = method.getDeclaringClass();
                declaringClass.getClass();
                if (!declaringClass.isInstance(objStorageObjectForMethod)) {
                    objStorageObjectForMethod = null;
                }
                if (objStorageObjectForMethod != null) {
                    obj = objStorageObjectForMethod;
                    if (obj != null) {
                        try {
                            String[] strArr = (String[]) list.toArray(new String[0]);
                            if (method.getParameterTypes().length == 2) {
                                KavaReflector.invokeOrThrow(method, obj, strArr, str);
                            } else {
                                Boolean bool = Boolean.TRUE;
                                KavaReflector.invokeOrThrow(method, obj, strArr, str, bool, bool);
                            }
                            int size = list.size();
                            ArrayList arrayList = new ArrayList(size);
                            for (int i9 = 0; i9 < size; i9++) {
                                arrayList.add("?");
                            }
                            String strM8392A1 = AbstractC4166m.m8392A1(arrayList, ",", null, null, null, 62);
                            String strQueryFirstString = weChatDatabaseApi.queryFirstString("SELECT COUNT(*) AS matched FROM rconversation WHERE username IN (" + strM8392A1 + ") AND IFNULL(parentRef,'')=?", (String[]) AbstractC4166m.m8398G1(list, str).toArray(new String[0]), "matched");
                            strQueryFirstString.getClass();
                            Integer numM6741e0 = AbstractC3156t.m6741e0(10, strQueryFirstString);
                            iIntValue = numM6741e0 != null ? numM6741e0.intValue() : 0;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        if (iIntValue != list.size()) {
                            throw new IllegalStateException("数据库仅更新 " + iIntValue + "/" + list.size() + " 条会话");
                        }
                        c3959f = Boolean.TRUE;
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC1184v0.m3204n("[Hchat:ConversationGroup] 调用微信原生会话归拢失败: count=" + list.size() + " " + thM8182b.getMessage(), thM8182b);
                        }
                        Boolean bool2 = Boolean.FALSE;
                        if (c3959f instanceof C3959f) {
                            c3959f = bool2;
                        }
                        return ((Boolean) c3959f).booleanValue();
                    }
                } else {
                    objStorageObjectForMethod = weChatDatabaseApi.storageObjectForMethod(method);
                    if (objStorageObjectForMethod != null) {
                        f1251q = objStorageObjectForMethod;
                        obj = objStorageObjectForMethod;
                    }
                    if (obj != null) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m1419D(WeChatDatabaseApi weChatDatabaseApi, String str, String str2, ContentValues contentValues) {
        boolean z9 = false;
        if (!AbstractC1416l.m3825a(weChatDatabaseApi.queryFirstString(AbstractC0921a.m2251n("SELECT username FROM ", str, " WHERE username=? LIMIT 1"), new String[]{str2}, "username"), str2) ? weChatDatabaseApi.insert(str, "username", contentValues) >= 0 : weChatDatabaseApi.update(str, contentValues, "username=?", new String[]{str2}) > 0) {
            z9 = true;
        }
        if (!z9) {
            AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 写入虚拟分组入口失败: table=" + str + " talker=" + str2);
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static String m1420E(String str, Map map) {
        Object obj = map.get(str);
        String string = obj != null ? obj.toString() : null;
        return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final String m1421F(String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        char[] cArr = new char[32];
        for (int i9 = 0; i9 < 16; i9++) {
            byte b10 = bArrDigest[i9];
            int i10 = i9 * 2;
            cArr[i10] = "0123456789abcdef".charAt((b10 & 255) >>> 4);
            cArr[i10 + 1] = "0123456789abcdef".charAt(b10 & 15);
        }
        return "wxid_hchat_group_".concat(new String(cArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final boolean m1422a(C0429d2 c0429d2, Method method) {
        c0429d2.getClass();
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && parameterTypes.length == 4 && AdapterView.class.isAssignableFrom(parameterTypes[0]) && View.class.isAssignableFrom(parameterTypes[1]) && AbstractC1416l.m3825a(parameterTypes[2], Integer.TYPE) && AbstractC1416l.m3825a(parameterTypes[3], Long.TYPE) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final boolean m1423b(C0429d2 c0429d2, Method method) {
        c0429d2.getClass();
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) && parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], String.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m1424c(C0429d2 c0429d2, Method method) {
        c0429d2.getClass();
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (!Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && Cursor.class.isAssignableFrom(method.getReturnType()) && parameterTypes.length == 4) {
            Class<?> cls = parameterTypes[0];
            Class cls2 = Integer.TYPE;
            if (AbstractC1416l.m3825a(cls, cls2) && List.class.isAssignableFrom(parameterTypes[1]) && AbstractC1416l.m3825a(parameterTypes[2], String.class) && AbstractC1416l.m3825a(parameterTypes[3], cls2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final boolean m1425d(C0429d2 c0429d2, Method method) {
        List<Constructor<?>> listDeclaredConstructors;
        c0429d2.getClass();
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (!Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE)) {
            parameterTypes.getClass();
            if (parameterTypes.length == 0 && ((listDeclaredConstructors = KavaReflector.declaredConstructors(method.getDeclaringClass())) == null || !listDeclaredConstructors.isEmpty())) {
                Iterator<T> it = listDeclaredConstructors.iterator();
                while (it.hasNext()) {
                    Class<?>[] parameterTypes2 = ((Constructor) it.next()).getParameterTypes();
                    if (parameterTypes2.length == 3 && Context.class.isAssignableFrom(parameterTypes2[0]) && AbstractC1416l.m3825a(parameterTypes2[1], String.class)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m1426e(C0429d2 c0429d2, Method method) {
        c0429d2.getClass();
        Class<?>[] parameterTypes = method.getParameterTypes();
        return Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], Integer.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m1427f(C0429d2 c0429d2, Method method) {
        c0429d2.getClass();
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (!Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && AbstractC4156d0.m8355W(2, 4).contains(Integer.valueOf(parameterTypes.length)) && parameterTypes[0].isArray() && AbstractC1416l.m3825a(parameterTypes[0].getComponentType(), String.class) && AbstractC1416l.m3825a(parameterTypes[1], String.class)) {
            if (parameterTypes.length != 2) {
                Class<?> cls = parameterTypes[2];
                Class cls2 = Boolean.TYPE;
                if (!AbstractC1416l.m3825a(cls, cls2) || !AbstractC1416l.m3825a(parameterTypes[3], cls2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static final boolean m1428g(C0429d2 c0429d2, Method method) {
        c0429d2.getClass();
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isAbstract(method.getModifiers()) && Cursor.class.isAssignableFrom(method.getReturnType()) && parameterTypes.length == 5 && AbstractC1416l.m3825a(parameterTypes[0], Integer.TYPE) && List.class.isAssignableFrom(parameterTypes[1]) && AbstractC1416l.m3825a(parameterTypes[2], String.class) && AbstractC1416l.m3825a(parameterTypes[3], Boolean.TYPE) && AbstractC1416l.m3825a(parameterTypes[4], String.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final void m1429h(Activity activity, String str) throws NoSuchAlgorithmException {
        Object next;
        Object c3959f;
        Iterator it = AbstractC0473o2.m1485i(activity).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (AbstractC1416l.m3825a(((C0414a) next).f1179a, str)) {
                    break;
                }
            }
        }
        C0414a c0414a = (C0414a) next;
        if (c0414a != null) {
            String str2 = c0414a.f1179a;
            String strM1421F = m1421F(str2);
            try {
                Intent className = new Intent().setClassName(activity, "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI");
                className.putExtra("Contact_User", strM1421F);
                activity.startActivity(className);
                c3959f = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC0921a.m2260w("[Hchat:ConversationGroup] 打开微信原生分组页面失败: group=", str2, " ", thM8182b.getMessage(), thM8182b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m1430i(Object obj) {
        Object next;
        C3010h c3010h = new C3010h(AbstractC3015m.m6414X(AbstractC4165l.m8376k0(new String[]{"field_username", "username", "userName"}), new C0456k1(obj, 1)));
        while (true) {
            if (!c3010h.hasNext()) {
                next = null;
                break;
            }
            next = c3010h.next();
            if (!AbstractC3149m.m6721t0((String) next)) {
                break;
            }
        }
        return (String) next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static LinkedHashSet m1431j(String str, List list) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str2 = ((C0414a) obj).f1181c;
            Object arrayList = linkedHashMap.get(str2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str2, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list));
        if (iM8438a0 < 16) {
            iM8438a0 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM8438a0);
        for (Object obj2 : list) {
            linkedHashMap2.put(((C0414a) obj2).f1179a, obj2);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m1432k(new HashSet(), linkedHashMap2, linkedHashMap, linkedHashSet, str);
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final void m1432k(HashSet hashSet, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashSet linkedHashSet, String str) {
        List<String> list;
        if (hashSet.add(str)) {
            C0414a c0414a = (C0414a) linkedHashMap.get(str);
            if (c0414a != null && (list = c0414a.f1183e) != null) {
                for (String str2 : list) {
                    if (!AbstractC3149m.m6721t0(str2)) {
                        linkedHashSet.add(str2);
                    }
                }
            }
            Iterable iterable = (List) linkedHashMap2.get(str);
            if (iterable == null) {
                iterable = C4173t.f13710g;
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                m1432k(hashSet, linkedHashMap, linkedHashMap2, linkedHashSet, ((C0414a) it.next()).f1179a);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Activity m1433l(Context context) {
        for (int i9 = 0; i9 < 8; i9++) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m1434m(Method method, XC_MethodHook xC_MethodHook) {
        Object c3959f;
        ConcurrentHashMap.KeySetView keySetView = f1239e;
        if (!keySetView.add(method)) {
            return true;
        }
        try {
            C3744i.f12154b.m7763b(method, xC_MethodHook);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            keySetView.remove(method);
            AbstractC0921a.m2260w("[Hchat:ConversationGroup] Hook 安装失败: ", method.toGenericString(), " ", thM8182b.getMessage(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static int m1435n(String str, Map map) {
        Object obj = map.get(str);
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return number.intValue();
        }
        Integer numM6741e0 = AbstractC3156t.m6741e0(10, m1420E(str, map));
        if (numM6741e0 != null) {
            return numM6741e0.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m1436o(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 2 && MenuItem.class.isAssignableFrom(parameterTypes[0]) && AbstractC1416l.m3825a(parameterTypes[1], Integer.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m1437p(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 3 && ContextMenu.class.isAssignableFrom(parameterTypes[0]) && View.class.isAssignableFrom(parameterTypes[1]) && parameterTypes[2].getName().equals("android.view.ContextMenu$ContextMenuInfo") && m1440t(method) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final boolean m1438q(String str) {
        return str != null && AbstractC3156t.m6740d0(str, "wxid_hchat_group_", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static long m1439s(String str, Map map) {
        Object obj = map.get(str);
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return number.longValue();
        }
        Long lM6743g0 = AbstractC3156t.m6743g0(m1420E(str, map));
        if (lM6743g0 != null) {
            return lM6743g0.longValue();
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static Class m1440t(Method method) {
        Object next;
        Iterator it = AbstractC3015m.m6409S(new C0791j(AbstractC4166m.m8415m1(KavaReflector.declaredConstructors(method.getDeclaringClass())), new C0178b(3), C3019q.f9816n)).iterator();
        while (true) {
            AbstractC4151b abstractC4151b = (AbstractC4151b) it;
            if (!abstractC4151b.hasNext()) {
                next = null;
                break;
            }
            next = abstractC4151b.next();
            Class cls = (Class) next;
            List<Field> listDeclaredFields = KavaReflector.declaredFields(cls);
            boolean z9 = false;
            if (listDeclaredFields == null || !listDeclaredFields.isEmpty()) {
                Iterator<T> it2 = listDeclaredFields.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((Field) it2.next()).getType().getName().equals("com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI")) {
                        Class cls2 = Integer.TYPE;
                        cls2.getClass();
                        Class cls3 = Long.TYPE;
                        cls3.getClass();
                        Method methodFindMethod = KavaReflector.findMethod(cls, "onItemLongClick", AdapterView.class, View.class, cls2, cls3);
                        if (methodFindMethod != null) {
                            if (AbstractC1416l.m3825a(methodFindMethod.getReturnType(), Boolean.TYPE) && !Modifier.isAbstract(methodFindMethod.getModifiers())) {
                                z9 = true;
                            }
                        }
                    }
                }
            }
            if (z9) {
                break;
            }
        }
        return (Class) next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static Class m1441u(Method method, Method method2) {
        Class clsM1440t;
        if (!m1437p(method) || !m1436o(method2) || (clsM1440t = m1440t(method)) == null) {
            return null;
        }
        List<Constructor<?>> listDeclaredConstructors = KavaReflector.declaredConstructors(method2.getDeclaringClass());
        boolean z9 = false;
        if (listDeclaredConstructors == null || !listDeclaredConstructors.isEmpty()) {
            Iterator<T> it = listDeclaredConstructors.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Class<?>[] parameterTypes = ((Constructor) it.next()).getParameterTypes();
                parameterTypes.getClass();
                if (AbstractC4165l.m8378m0(parameterTypes, clsM1440t)) {
                    z9 = true;
                    break;
                }
            }
        }
        if (z9) {
            return clsM1440t;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static String m1442v(Object obj) {
        if (obj != null) {
            Object objInvokeMethod = KavaReflector.invokeMethod(obj, "getUserName", new Object[0]);
            String str = objInvokeMethod instanceof String ? (String) objInvokeMethod : null;
            if (m1438q(str)) {
                return str;
            }
            Object field = KavaReflector.readField(obj, "superUsername");
            String str2 = field instanceof String ? (String) field : null;
            if (str2 != null && m1438q(str2)) {
                return str2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m1443w(Object obj, Context context) {
        Object field = KavaReflector.readField(obj, "adapter");
        if (field != null) {
            String strM1442v = m1442v(obj);
            if (strM1442v != null) {
                Map map = f1242h;
                map.getClass();
                map.put(field, strM1442v);
            }
            if (!KavaReflector.invokeSuccessfully(f1250p, field, new Object[0])) {
                AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 刷新微信原生分组列表失败: adapter=".concat(field.getClass().getName()));
            }
            m1416A(obj, context);
            m1417B(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m1444x(String str, Object obj, String str2, Object obj2) {
        Adapter adapter = obj2 instanceof Adapter ? (Adapter) obj2 : null;
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.getCount()) : null;
        if (numValueOf != null) {
            str2 = str2 + " (" + numValueOf.intValue() + ")";
        }
        if (KavaReflector.invokeSuccessfully(KavaReflector.findMethodRecursive(obj.getClass(), "setMMTitle", String.class), obj, str2)) {
            return;
        }
        AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 设置微信原生分组页标题失败: talker=" + str + " title=" + str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final void m1445y(Context context) {
        context.getClass();
        f1238d.set(true);
        if (f1237c.compareAndSet(false, true)) {
            f1247m.execute(new RunnableC0476p1(context, 0));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't wrap try/catch for region: R(77:7|(79:9|(2:12|10)|592|13|(7:18|(4:21|(2:23|594)(1:595)|24|19)|593|25|(8:28|(1:30)|597|31|(4:34|(3:599|36|602)(1:601)|600|32)|598|37|26)|596|38)|(4:42|(15:45|(4:48|(2:50|607)(1:608)|51|46)|606|52|(4:55|(2:57|610)(1:611)|58|53)|609|59|(1:61)(2:62|(1:64)(2:65|(3:66|(1:68)|69)))|71|(1:77)(1:76)|(1:80)|(1:82)(1:83)|(2:85|604)(1:605)|86|43)|603|87)(1:89)|88|90|(2:91|(3:93|(2:95|616)(2:96|(9:114|(2:121|123)(1:122)|124|(1:126)(1:127)|128|(1:130)(1:132)|131|(1:140)(1:139)|(12:211|212|(1:214)(1:215)|(1:217)|218|(1:220)(1:221)|222|(1:224)(1:225)|226|(1:228)(1:229)|230|(10:242|241|243|(1:(1:246)(1:247))(1:248)|249|(3:251|(1:253)|254)(2:255|(1:257))|258|(1:261)|262|(4:272|271|273|(2:275|617)(2:276|615))(5:(1:266)(1:267)|(0)(1:270)|271|273|(0)(0)))(13:(1:233)(1:234)|(1:236)|237|(1:(1:240)(0))|241|243|(0)(0)|249|(0)(0)|258|(1:261)|262|(4:272|271|273|(0)(0))(0)))(13:(1:143)(1:144)|(7:146|(2:148|(2:171|166)(3:150|(2:152|(2:154|(1:168)(2:158|(2:160|(2:162|(1:164)(1:165))(1:167))(0)))(1:169))(1:170)|166))(1:172)|173|(14:574|178|(1:186)(1:182)|188|(1:190)|191|(1:193)|194|(1:197)|586|198|202|(1:205)|206)|207|(1:209)|210)(0)|212|(0)(0)|(0)|218|(0)(0)|222|(0)(0)|226|(0)(0)|230|(0)(0)))(3:(1:99)(1:100)|(6:582|102|(1:104)(1:108)|110|(1:112)|113)(0)|(10:116|118|121|123|124|(0)(0)|128|(0)(0)|131|(2:140|(0)(0))(0))(0)))|277)(1:614))|278|(1:280)|281|(2:284|282)|618|285|(7:288|(2:290|(2:292|(1:298)(2:627|294))(1:625))|624|299|(3:619|301|623)(1:622)|621|286)|620|(7:303|(4:306|(3:629|308|632)(1:631)|630|304)|628|309|(4:312|(4:315|(3:635|317|638)(1:637)|636|313)|634|310)|633|318)(1:320)|319|321|580|322|(1:324)|325|(1:327)|328|332|(1:334)|335|(4:337|(4:340|(2:342|640)(1:641)|343|338)|639|344)(1:345)|346|(4:349|(2:355|644)(6:356|(1:358)(1:359)|360|(1:362)(1:363)|364|643)|365|347)|642|366|(4:369|(2:371|647)(6:372|(1:378)|379|(1:381)|382|646)|383|367)|645|384|(4:387|(4:390|(6:392|(4:395|(2:397|653)(1:654)|398|393)|652|399|(2:402|400)|651)(2:403|650)|404|388)|649|385)|648|405|(4:408|(3:656|410|659)(1:658)|657|406)|655|411|(7:414|(1:416)(1:417)|(1:419)|420|(2:422|661)(1:662)|423|412)|660|424|(7:427|(2:430|428)|665|431|(2:434|432)|664|425)|663|435|(4:438|(3:667|440|670)(1:669)|668|436)|666|441|(2:446|(3:448|(1:451)|(6:457|(7:460|(1:462)(1:463)|(1:465)|466|(2:468|686)(1:687)|469|458)|685|470|(7:473|(2:476|474)|690|477|(9:480|576|481|482|(2:584|484)(1:487)|492|(2:494|692)(2:495|691)|496|478)|689|471)|688)(2:454|(7:456|457|(1:458)|685|470|(1:471)|688)))(0))|443|590|497|(1:499)|500|(1:502)|503|507|(1:509)|510|(1:512)(4:513|(2:516|514)|684|517)|518|(1:523)|524|(4:527|(3:671|529|675)(1:674)|673|525)|672|530|(2:533|531)|676|534|(4:537|(5:540|(1:543)|(2:545|679)(1:680)|546|538)|678|535)|677|547|(12:550|578|551|(1:560)(1:556)|588|561|565|(1:567)|568|(2:570|683)(2:571|682)|572|548)|681|694)(1:39)|40|(0)(0)|88|90|(3:91|(0)(0)|277)|278|(0)|281|(1:282)|618|285|(1:286)|620|(0)(0)|319|321|580|322|(0)|325|(0)|328|332|(0)|335|(0)(0)|346|(1:347)|642|366|(1:367)|645|384|(1:385)|648|405|(1:406)|655|411|(1:412)|660|424|(1:425)|663|435|(1:436)|666|441|(3:444|446|(0)(0))|443|590|497|(0)|500|(0)|503|507|(0)|510|(0)(0)|518|(2:521|523)|524|(1:525)|672|530|(1:531)|676|534|(1:535)|677|547|(1:548)|681|694) */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0664, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0665, code lost:
    
        r13 = new p276sf.C3959f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0a7f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0a80, code lost:
    
        r1 = new p276sf.C3959f(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0590 A[LOOP:10: B:282:0x058a->B:284:0x0590, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0644  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0932  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0944  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x099c  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0a78  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0a9b  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0b29 A[LOOP:30: B:531:0x0b23->B:533:0x0b29, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0b5a  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0bae  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x056d A[EDGE_INSN: B:614:0x056d->B:278:0x056d BREAK  A[LOOP:9: B:91:0x0277->B:277:0x0559], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x028f  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1446z(Context context) throws JSONException, NoSuchAlgorithmException {
        WeChatDatabaseApi weChatDatabaseApiDatabase;
        String str;
        WeChatDatabaseApi weChatDatabaseApi;
        List<C0414a> list;
        String str2;
        Map linkedHashMap;
        String str3;
        String str4;
        Iterable iterable;
        LinkedHashSet linkedHashSet;
        Iterator it;
        Iterable iterable2;
        boolean zHasNext;
        String str5;
        Iterable iterable3;
        Iterator it2;
        String str6;
        LinkedHashSet linkedHashSet2;
        int iM8438a0;
        Map mapM8780c;
        SharedPreferences sharedPreferencesM8640c;
        String str7;
        Object c3959f;
        JSONObject jSONObjectOptJSONObject;
        String str8;
        Map mapM8780c2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        ArrayList arrayList;
        Method method;
        Object objStorageObjectForMethod;
        Iterator it6;
        LinkedHashMap linkedHashMap2;
        Object c3959f2;
        Method method2;
        LinkedHashMap linkedHashMap3;
        Object c3959f3;
        String string;
        Iterator it7;
        Iterator it8;
        Object c3959f4;
        String str9;
        C1624a c1624aConversations;
        String string2;
        Iterator it9;
        String str10;
        Map map;
        Iterator it10;
        String string3;
        boolean z9;
        WeChatContact weChatContact;
        String str11;
        int i9;
        String strConcat;
        String strM1421F;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        LinkedHashSet linkedHashSet3;
        Object c3959f5;
        Object c3959f6;
        WeChatContact weChatContactM3725n;
        String str21;
        Object c3959f7;
        Object next;
        String str22;
        String str23;
        WeChatDatabaseApi weChatDatabaseApiDatabase2;
        String str24 = "{}";
        C4174u c4174u = C4174u.f13711g;
        String strM1477a = AbstractC0473o2.m1477a();
        if (AbstractC3149m.m6721t0(strM1477a) || (weChatDatabaseApiDatabase = WeChatApis.database()) == null) {
            return;
        }
        List listM1485i = AbstractC0473o2.m1485i(context);
        String str25 = "Hchat_conversation_groups";
        boolean z10 = AbstractC4302b.m8640c(context, "Hchat_conversation_groups").getBoolean("enabled", false);
        String str26 = "digestUser";
        String str27 = "digest";
        String str28 = "flag";
        String str29 = "msgType";
        String str30 = "content";
        String str31 = "conversationTime";
        String str32 = "isSend";
        String str33 = "unReadCount";
        String str34 = "username";
        if (z10) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it11 = listM1485i.iterator();
            while (it11.hasNext()) {
                AbstractC4171r.m8432h1(arrayList2, ((C0414a) it11.next()).f1183e);
                str24 = str24;
            }
            str = str24;
            if (!arrayList2.isEmpty() && (weChatDatabaseApiDatabase2 = WeChatApis.database()) != null) {
                linkedHashMap = new LinkedHashMap();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    String str35 = str25;
                    if (!AbstractC3149m.m6721t0((String) obj)) {
                        arrayList3.add(obj);
                    }
                    str25 = str35;
                }
                str2 = str25;
                Iterator it12 = AbstractC4166m.m8416n1(400, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3))).iterator();
                while (it12.hasNext()) {
                    List list2 = (List) it12.next();
                    Iterator it13 = it12;
                    int size = list2.size();
                    WeChatDatabaseApi weChatDatabaseApi2 = weChatDatabaseApiDatabase;
                    ArrayList arrayList4 = new ArrayList(size);
                    List list3 = listM1485i;
                    int i10 = 0;
                    while (i10 < size) {
                        arrayList4.add("?");
                        i10++;
                        size = size;
                    }
                    List<Map<String, Object>> listQuery = weChatDatabaseApiDatabase2.query(AbstractC0921a.m2251n("SELECT username,unReadCount,status,isSend,conversationTime,content,msgType,flag,digest,digestUser FROM rconversation WHERE username IN (", AbstractC4166m.m8392A1(arrayList4, ",", null, null, null, 62), ")"), (String[]) list2.toArray(new String[0]));
                    listQuery.getClass();
                    Iterator<T> it14 = listQuery.iterator();
                    while (it14.hasNext()) {
                        Map map2 = (Map) it14.next();
                        map2.getClass();
                        String strM1420E = m1420E("username", map2);
                        C0486s1 c0486s1 = new C0486s1(strM1420E, m1435n("unReadCount", map2), m1435n("status", map2), m1435n("isSend", map2), m1439s("conversationTime", map2), m1420E("content", map2), m1435n("msgType", map2), m1439s("flag", map2), m1420E("digest", map2), m1420E("digestUser", map2));
                        if (!AbstractC3149m.m6721t0(strM1420E)) {
                            linkedHashMap.put(strM1420E, c0486s1);
                        }
                    }
                    it12 = it13;
                    weChatDatabaseApiDatabase = weChatDatabaseApi2;
                    listM1485i = list3;
                }
                weChatDatabaseApi = weChatDatabaseApiDatabase;
                list = listM1485i;
            }
            if (z10) {
                str3 = "digestUser";
                str4 = "digest";
                iterable = C4173t.f13710g;
            } else {
                ArrayList arrayList5 = new ArrayList();
                for (C0414a c0414a : list) {
                    List list4 = list;
                    LinkedHashSet linkedHashSetM1431j = m1431j(c0414a.f1179a, list4);
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it15 = linkedHashSetM1431j.iterator();
                    while (it15.hasNext()) {
                        List list5 = list4;
                        C0486s1 c0486s12 = (C0486s1) linkedHashMap.get((String) it15.next());
                        if (c0486s12 != null) {
                            arrayList6.add(c0486s12);
                        }
                        list4 = list5;
                    }
                    list = list4;
                    int size2 = arrayList6.size();
                    Iterator it16 = arrayList6.iterator();
                    Map map3 = linkedHashMap;
                    int i11 = 0;
                    while (it16.hasNext()) {
                        ArrayList arrayList7 = arrayList6;
                        int i12 = ((C0486s1) it16.next()).f1452b;
                        if (i12 < 0) {
                            i12 = 0;
                        }
                        i11 += i12;
                        arrayList6 = arrayList7;
                    }
                    Iterator it17 = arrayList6.iterator();
                    if (it17.hasNext()) {
                        next = it17.next();
                        if (it17.hasNext()) {
                            str22 = str26;
                            str23 = str27;
                            Long lValueOf = Long.valueOf(((C0486s1) next).f1455e);
                            do {
                                Object next2 = it17.next();
                                Long lValueOf2 = Long.valueOf(((C0486s1) next2).f1455e);
                                if (lValueOf.compareTo(lValueOf2) < 0) {
                                    lValueOf = lValueOf2;
                                    next = next2;
                                }
                            } while (it17.hasNext());
                        } else {
                            str22 = str26;
                            str23 = str27;
                        }
                    } else {
                        str22 = str26;
                        str23 = str27;
                        next = null;
                    }
                    C0489t1 c0489t1 = new C0489t1(size2, i11, (C0486s1) next);
                    if (!(size2 > 0 || c0414a.f1190l)) {
                        c0414a = null;
                    }
                    C3958e c3958e = c0414a != null ? new C3958e(c0414a, c0489t1) : null;
                    if (c3958e != null) {
                        arrayList5.add(c3958e);
                    }
                    linkedHashMap = map3;
                    str26 = str22;
                    str27 = str23;
                }
                str3 = str26;
                str4 = str27;
                iterable = arrayList5;
            }
            linkedHashSet = new LinkedHashSet();
            it = iterable.iterator();
            iterable2 = iterable;
            while (true) {
                zHasNext = it.hasNext();
                str5 = "username=?";
                iterable3 = iterable2;
                it2 = it;
                str6 = "parentRef";
                linkedHashSet2 = linkedHashSet;
                if (zHasNext) {
                    break;
                }
                C3958e c3958e2 = (C3958e) it2.next();
                C0414a c0414a2 = (C0414a) c3958e2.f12961g;
                String str36 = str28;
                C0489t1 c0489t12 = (C0489t1) c3958e2.f12962h;
                String str37 = c0414a2.f1179a;
                String str38 = str29;
                boolean z11 = c0414a2.f1188j;
                String strM1421F2 = m1421F(str37);
                ContentValues contentValues = new ContentValues();
                contentValues.put("username", strM1421F2);
                String str39 = str30;
                String str40 = str31;
                contentValues.put("nickname", c0414a2.f1180b);
                contentValues.put("encryptUsername", HttpUrl.FRAGMENT_ENCODE_SET);
                contentValues.put("type", (Integer) 0);
                contentValues.put("verifyFlag", (Integer) 0);
                WeChatDatabaseApi weChatDatabaseApi3 = weChatDatabaseApi;
                if (m1419D(weChatDatabaseApi3, "rcontact", strM1421F2, contentValues)) {
                    C0486s1 c0486s13 = c0489t12.f1474c;
                    if (c0486s13 == null) {
                        weChatContact = null;
                        if (weChatContact != null || (AbstractC3149m.m6721t0(weChatContact.avatarUrl) && AbstractC3149m.m6721t0(weChatContact.avatarBackupUrl))) {
                            str11 = HttpUrl.FRAGMENT_ENCODE_SET;
                            weChatDatabaseApi3.delete("img_flag", "username=?", new String[]{strM1421F2});
                        } else {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("username", strM1421F2);
                            str11 = HttpUrl.FRAGMENT_ENCODE_SET;
                            contentValues2.put("reserved1", weChatContact.avatarUrl);
                            contentValues2.put("reserved2", weChatContact.avatarBackupUrl);
                            m1419D(weChatDatabaseApi3, "img_flag", strM1421F2, contentValues2);
                        }
                        int i13 = !c0414a2.f1187i ? c0489t12.f1473b : 0;
                        int i14 = c0489t12.f1472a;
                        String strM6836i = i13 <= 0 ? i14 + " 个会话 · " + i13 + " 条未读" : AbstractC3199a.m6836i(i14, " 个会话");
                        boolean z12 = (z11 || c0486s13 == null || (AbstractC3149m.m6721t0(c0486s13.f1456f) && AbstractC3149m.m6721t0(c0486s13.f1459i))) ? false : true;
                        if (c0486s13 == null) {
                            i9 = i13;
                            strConcat = null;
                            ContentValues contentValues3 = new ContentValues();
                            contentValues3.put("username", strM1421F2);
                            String str41 = c0414a2.f1181c;
                            strM1421F = str41 == null ? m1421F(str41) : null;
                            if (strM1421F == null) {
                                strM1421F = str11;
                            }
                            contentValues3.put("parentRef", strM1421F);
                            contentValues3.put(str33, Integer.valueOf(i9));
                            contentValues3.put("status", Integer.valueOf(c0486s13 == null ? c0486s13.f1453c : 0));
                            contentValues3.put(str32, Integer.valueOf(c0486s13 == null ? c0486s13.f1454d : 0));
                            long j3 = 0;
                            str12 = str32;
                            str13 = str33;
                            contentValues3.put(str40, Long.valueOf(c0486s13 == null ? c0486s13.f1455e : 0L));
                            if (z11) {
                                str14 = c0486s13 != null ? c0486s13.f1456f : null;
                                if (str14 == null) {
                                    str14 = str11;
                                }
                                if (AbstractC3149m.m6721t0(str14)) {
                                    if (z12) {
                                        str14 = str11;
                                    }
                                }
                                str15 = str39;
                                contentValues3.put(str15, str14);
                                str16 = str38;
                                contentValues3.put(str16, Integer.valueOf(!z11 ? c0486s13 != null ? c0486s13.f1457g : 0 : 1));
                                if (c0414a2.f1185g) {
                                }
                                str17 = str36;
                                contentValues3.put(str17, Long.valueOf(j3));
                                if (z11) {
                                    strM6836i = strConcat;
                                }
                                str18 = str4;
                                contentValues3.put(str18, strM6836i);
                                if (z11) {
                                    str19 = str11;
                                    str20 = str3;
                                    contentValues3.put(str20, str19);
                                    contentValues3.put("hasTrunc", (Integer) 0);
                                    if (m1419D(weChatDatabaseApi3, "rconversation", strM1421F2, contentValues3)) {
                                    }
                                }
                            } else {
                                str14 = strM6836i;
                                str15 = str39;
                                contentValues3.put(str15, str14);
                                str16 = str38;
                                contentValues3.put(str16, Integer.valueOf(!z11 ? c0486s13 != null ? c0486s13.f1457g : 0 : 1));
                                if (c0414a2.f1185g) {
                                    str40 = str40;
                                    if (c0486s13 != null) {
                                        j3 = c0486s13.f1455e;
                                    }
                                } else {
                                    int i15 = c0414a2.f1182d;
                                    if (i15 < 0) {
                                        i15 = 0;
                                    }
                                    str40 = str40;
                                    j3 = Long.MAX_VALUE - ((long) i15);
                                }
                                str17 = str36;
                                contentValues3.put(str17, Long.valueOf(j3));
                                if (z11 && strConcat != null) {
                                    strM6836i = strConcat;
                                }
                                str18 = str4;
                                contentValues3.put(str18, strM6836i);
                                if (z11 || strConcat == null) {
                                    str19 = str11;
                                    str20 = str3;
                                    contentValues3.put(str20, str19);
                                    contentValues3.put("hasTrunc", (Integer) 0);
                                    if (m1419D(weChatDatabaseApi3, "rconversation", strM1421F2, contentValues3)) {
                                        String str42 = c0414a2.f1179a;
                                        linkedHashSet3 = linkedHashSet2;
                                        linkedHashSet3.add(str42);
                                    } else {
                                        linkedHashSet3 = linkedHashSet2;
                                    }
                                } else {
                                    String str43 = c0486s13 != null ? c0486s13.f1451a : null;
                                    if (str43 != null) {
                                        str19 = str43;
                                    }
                                    str20 = str3;
                                    contentValues3.put(str20, str19);
                                    contentValues3.put("hasTrunc", (Integer) 0);
                                    if (m1419D(weChatDatabaseApi3, "rconversation", strM1421F2, contentValues3)) {
                                    }
                                }
                            }
                        } else {
                            C0486s1 c0486s14 = z12 ? c0486s13 : null;
                            if (c0486s14 != null) {
                                String str44 = c0486s14.f1459i;
                                String str45 = c0486s14.f1460j;
                                if (AbstractC3149m.m6721t0(str44)) {
                                    int i16 = c0486s14.f1457g;
                                    i9 = i13;
                                    if (i16 == 1) {
                                        str21 = c0486s14.f1456f;
                                        str44 = str21;
                                    } else {
                                        if (i16 == 3) {
                                            str21 = "[图片]";
                                        } else if (i16 == 34) {
                                            str21 = "[语音]";
                                        } else if (i16 == 43 || i16 == 62) {
                                            str21 = "[视频]";
                                        } else if (i16 != 10000) {
                                            if (i16 == 47) {
                                                str21 = "[动画表情]";
                                            } else if (i16 != 48) {
                                                str44 = "[消息]";
                                            } else {
                                                str21 = "[位置]";
                                            }
                                        }
                                        str44 = str21;
                                    }
                                } else {
                                    i9 = i13;
                                }
                                if (!AbstractC3149m.m6721t0(str45) && AbstractC3149m.m6710i0(str44, '%')) {
                                    try {
                                        WeChatApis.contact().getClass();
                                        C1368i c1368i = WeChatApis.contactApi;
                                        c3959f5 = (c1368i == null || (weChatContactM3725n = c1368i.m3725n(str45)) == null) ? null : weChatContactM3725n.displayName();
                                    } catch (Throwable th2) {
                                        c3959f5 = new C3959f(th2);
                                    }
                                    if (c3959f5 instanceof C3959f) {
                                        c3959f5 = null;
                                    }
                                    String str46 = (String) c3959f5;
                                    if (str46 == null) {
                                        str46 = str11;
                                    }
                                    if (!AbstractC3149m.m6721t0(str46)) {
                                        str45 = str46;
                                    }
                                    try {
                                        c3959f6 = String.format(str44, Arrays.copyOf(new Object[]{str45}, 1));
                                    } catch (Throwable th3) {
                                        c3959f6 = new C3959f(th3);
                                    }
                                    if (C3960g.m8182b(c3959f6) != null) {
                                        c3959f6 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str44, "%1$s", str45, false), "%s", str45, false);
                                    }
                                    str44 = (String) c3959f6;
                                }
                                String string4 = AbstractC3149m.m6703R0(str44).toString();
                                if (AbstractC3149m.m6721t0(string4)) {
                                    string4 = "[消息]";
                                }
                                strConcat = "%s: ".concat(AbstractC3156t.m6737a0(string4, "%", "%%", false));
                            }
                            ContentValues contentValues32 = new ContentValues();
                            contentValues32.put("username", strM1421F2);
                            String str412 = c0414a2.f1181c;
                            if (str412 == null) {
                            }
                            if (strM1421F == null) {
                            }
                            contentValues32.put("parentRef", strM1421F);
                            contentValues32.put(str33, Integer.valueOf(i9));
                            contentValues32.put("status", Integer.valueOf(c0486s13 == null ? c0486s13.f1453c : 0));
                            contentValues32.put(str32, Integer.valueOf(c0486s13 == null ? c0486s13.f1454d : 0));
                            long j32 = 0;
                            str12 = str32;
                            str13 = str33;
                            contentValues32.put(str40, Long.valueOf(c0486s13 == null ? c0486s13.f1455e : 0L));
                            if (z11) {
                            }
                        }
                    } else {
                        C0486s1 c0486s15 = z11 ? c0486s13 : null;
                        if (c0486s15 != null) {
                            try {
                                WeChatApis.contact().getClass();
                                C1368i c1368i2 = WeChatApis.contactApi;
                                c3959f7 = c1368i2 != null ? c1368i2.m3725n(c0486s15.f1451a) : null;
                            } catch (Throwable th4) {
                                c3959f7 = new C3959f(th4);
                            }
                            if (c3959f7 instanceof C3959f) {
                                c3959f7 = null;
                            }
                            weChatContact = (WeChatContact) c3959f7;
                        }
                        if (weChatContact != null) {
                            str11 = HttpUrl.FRAGMENT_ENCODE_SET;
                            weChatDatabaseApi3.delete("img_flag", "username=?", new String[]{strM1421F2});
                            if (!c0414a2.f1187i) {
                            }
                            int i142 = c0489t12.f1472a;
                            if (i13 <= 0) {
                            }
                            String strM6836i2 = i13 <= 0 ? i142 + " 个会话 · " + i13 + " 条未读" : AbstractC3199a.m6836i(i142, " 个会话");
                            if (z11) {
                                if (c0486s13 == null) {
                                }
                            }
                        }
                    }
                } else {
                    str12 = str32;
                    str13 = str33;
                    linkedHashSet3 = linkedHashSet2;
                    str20 = str3;
                    str18 = str4;
                    str17 = str36;
                    str16 = str38;
                    str15 = str39;
                }
                str4 = str18;
                linkedHashSet = linkedHashSet3;
                weChatDatabaseApi = weChatDatabaseApi3;
                str29 = str16;
                str3 = str20;
                str32 = str12;
                iterable2 = iterable3;
                str31 = str40;
                str28 = str17;
                str33 = str13;
                str30 = str15;
                it = it2;
            }
            WeChatDatabaseApi weChatDatabaseApi4 = weChatDatabaseApi;
            iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list));
            if (iM8438a0 < 16) {
                iM8438a0 = 16;
            }
            LinkedHashMap linkedHashMap4 = new LinkedHashMap(iM8438a0);
            for (Object obj2 : list) {
                linkedHashMap4.put(((C0414a) obj2).f1179a, obj2);
            }
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            for (Object obj3 : linkedHashSet2) {
                C0414a c0414a3 = (C0414a) linkedHashMap4.get((String) obj3);
                HashSet hashSet = new HashSet();
                while (c0414a3 != null) {
                    String str47 = c0414a3.f1181c;
                    if (str47 == null) {
                        break;
                    }
                    if (!hashSet.add(c0414a3.f1179a) || !linkedHashSet2.contains(str47)) {
                        z9 = false;
                        break;
                    }
                    c0414a3 = (C0414a) linkedHashMap4.get(str47);
                }
                z9 = true;
                if (z9) {
                    linkedHashSet4.add(obj3);
                }
            }
            if (z10) {
                mapM8780c = c4174u;
            } else {
                C4333g c4333g = new C4333g();
                ArrayList<C0414a> arrayList8 = new ArrayList();
                for (Object obj4 : list) {
                    if (linkedHashSet4.contains(((C0414a) obj4).f1179a)) {
                        arrayList8.add(obj4);
                    }
                }
                for (C0414a c0414a4 : arrayList8) {
                    for (String str48 : c0414a4.f1183e) {
                        if (!AbstractC3149m.m6721t0(str48)) {
                            c4333g.put(str48, c0414a4.f1179a);
                        }
                    }
                }
                mapM8780c = c4333g.m8780c();
            }
            sharedPreferencesM8640c = AbstractC4302b.m8640c(context, str2);
            str7 = str;
            string3 = sharedPreferencesM8640c.getString("original_parent_refs", str7);
            if (string3 == null) {
                string3 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(string3)) {
                string3 = str7;
            }
            c3959f = new JSONObject(string3);
            Object jSONObject = new JSONObject();
            if (c3959f instanceof C3959f) {
                c3959f = jSONObject;
            }
            jSONObjectOptJSONObject = ((JSONObject) c3959f).optJSONObject(strM1477a);
            if (jSONObjectOptJSONObject == null) {
                C4333g c4333g2 = new C4333g();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    Iterator<String> it18 = itKeys;
                    String next3 = itKeys.next();
                    next3.getClass();
                    String str49 = str5;
                    if (!AbstractC3149m.m6721t0(next3)) {
                        String strOptString = jSONObjectOptJSONObject.optString(next3);
                        strOptString.getClass();
                        c4333g2.put(next3, strOptString);
                    }
                    itKeys = it18;
                    str5 = str49;
                }
                str8 = str5;
                mapM8780c2 = c4333g2.m8780c();
            } else {
                str8 = "username=?";
                mapM8780c2 = c4174u;
            }
            LinkedHashMap linkedHashMap5 = new LinkedHashMap(mapM8780c2);
            LinkedHashMap linkedHashMap6 = new LinkedHashMap();
            HashSet hashSet2 = new HashSet();
            List<Map<String, Object>> listQuery2 = weChatDatabaseApi4.query("SELECT username,parentRef FROM rconversation WHERE parentRef LIKE ? OR parentRef LIKE ?", new String[]{"hchat_conv_group:%", "wxid_hchat_group_%"});
            listQuery2.getClass();
            it3 = listQuery2.iterator();
            while (it3.hasNext()) {
                Map map4 = (Map) it3.next();
                map4.getClass();
                String strM1420E2 = m1420E("username", map4);
                if (AbstractC3149m.m6721t0(strM1420E2) || m1438q(strM1420E2) || mapM8780c.containsKey(strM1420E2)) {
                    map = mapM8780c;
                    it10 = it3;
                } else {
                    String str50 = (String) linkedHashMap5.get(strM1420E2);
                    map = mapM8780c;
                    String str51 = str50 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str50;
                    Object obj5 = linkedHashMap6.get(str51);
                    if (obj5 == null) {
                        it10 = it3;
                        ArrayList arrayList9 = new ArrayList();
                        linkedHashMap6.put(str51, arrayList9);
                        obj5 = arrayList9;
                    } else {
                        it10 = it3;
                    }
                    ((List) obj5).add(strM1420E2);
                    hashSet2.add(strM1420E2);
                }
                mapM8780c = map;
                it3 = it10;
            }
            it4 = mapM8780c.entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                String str52 = (String) entry.getKey();
                String strM1421F3 = m1421F((String) entry.getValue());
                Iterator it19 = it4;
                String str53 = str34;
                String strQueryFirstString = weChatDatabaseApi4.queryFirstString("SELECT IFNULL(parentRef,'') AS parentRef FROM rconversation WHERE username=? LIMIT 1", new String[]{str52}, str6);
                if (AbstractC1416l.m3825a(strQueryFirstString, strM1421F3)) {
                    str10 = str6;
                } else {
                    strQueryFirstString.getClass();
                    str10 = str6;
                    if (!AbstractC3156t.m6740d0(strQueryFirstString, "hchat_conv_group:", false) && !m1438q(strQueryFirstString) && !linkedHashMap5.containsKey(str52)) {
                        linkedHashMap5.put(str52, strQueryFirstString);
                    }
                    Object arrayList10 = linkedHashMap6.get(strM1421F3);
                    if (arrayList10 == null) {
                        arrayList10 = new ArrayList();
                        linkedHashMap6.put(strM1421F3, arrayList10);
                    }
                    ((List) arrayList10).add(str52);
                }
                it4 = it19;
                str34 = str53;
                str6 = str10;
            }
            String str54 = str34;
            it5 = linkedHashMap6.entrySet().iterator();
            while (it5.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it5.next();
                String str55 = (String) entry2.getKey();
                for (List list6 : AbstractC4166m.m8416n1(200, AbstractC4166m.m8418p1((List) entry2.getValue()))) {
                    if (m1418C(weChatDatabaseApi4, list6, str55)) {
                        ArrayList<String> arrayList11 = new ArrayList();
                        for (Object obj6 : list6) {
                            Iterator it20 = it5;
                            if (hashSet2.contains((String) obj6)) {
                                arrayList11.add(obj6);
                            }
                            it5 = it20;
                        }
                        it9 = it5;
                        for (String str56 : arrayList11) {
                            linkedHashMap5.remove(str56);
                            hashSet2.remove(str56);
                        }
                    } else {
                        it9 = it5;
                    }
                    it5 = it9;
                }
            }
            ArrayList arrayList12 = new ArrayList();
            for (Object obj7 : iterable3) {
                if (linkedHashSet4.contains(((C0414a) ((C3958e) obj7).f12961g).f1179a)) {
                    arrayList12.add(obj7);
                }
            }
            LinkedHashMap linkedHashMap7 = new LinkedHashMap();
            for (Object obj8 : arrayList12) {
                String str57 = ((C0414a) ((C3958e) obj8).f12961g).f1181c;
                String strM1421F4 = str57 != null ? m1421F(str57) : null;
                if (strM1421F4 == null) {
                    strM1421F4 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Object arrayList13 = linkedHashMap7.get(strM1421F4);
                if (arrayList13 == null) {
                    arrayList13 = new ArrayList();
                    linkedHashMap7.put(strM1421F4, arrayList13);
                }
                ((List) arrayList13).add(obj8);
            }
            for (Map.Entry entry3 : linkedHashMap7.entrySet()) {
                String str58 = (String) entry3.getKey();
                List list7 = (List) entry3.getValue();
                ArrayList arrayList14 = new ArrayList(AbstractC4167n.m8429e1(list7));
                Iterator it21 = list7.iterator();
                while (it21.hasNext()) {
                    arrayList14.add(m1421F(((C0414a) ((C3958e) it21.next()).f12961g).f1179a));
                }
                Iterator it22 = AbstractC4166m.m8416n1(200, arrayList14).iterator();
                while (it22.hasNext()) {
                    m1418C(weChatDatabaseApi4, (List) it22.next(), str58);
                }
            }
            arrayList = new ArrayList();
            for (Object obj9 : iterable3) {
                if (linkedHashSet4.contains(((C0414a) ((C3958e) obj9).f12961g).f1179a)) {
                    arrayList.add(obj9);
                }
            }
            if (!arrayList.isEmpty() && (method = f1249o) != null) {
                objStorageObjectForMethod = f1251q;
                if (objStorageObjectForMethod == null) {
                    Class<?> declaringClass = method.getDeclaringClass();
                    declaringClass.getClass();
                    if (!declaringClass.isInstance(objStorageObjectForMethod)) {
                        objStorageObjectForMethod = null;
                    }
                    if (objStorageObjectForMethod != null) {
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                        for (Object obj10 : arrayList) {
                            String str59 = ((C0414a) ((C3958e) obj10).f12961g).f1181c;
                            String strM1421F5 = str59 != null ? m1421F(str59) : null;
                            if (strM1421F5 == null) {
                                strM1421F5 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            Object obj11 = linkedHashMap8.get(strM1421F5);
                            if (obj11 == null) {
                                ArrayList arrayList15 = new ArrayList();
                                linkedHashMap8.put(strM1421F5, arrayList15);
                                obj11 = arrayList15;
                            }
                            ((List) obj11).add(obj10);
                        }
                        it6 = linkedHashMap8.entrySet().iterator();
                        while (it6.hasNext()) {
                            Map.Entry entry4 = (Map.Entry) it6.next();
                            String str60 = (String) entry4.getKey();
                            List list8 = (List) entry4.getValue();
                            ArrayList arrayList16 = new ArrayList(AbstractC4167n.m8429e1(list8));
                            Iterator it23 = list8.iterator();
                            while (it23.hasNext()) {
                                arrayList16.add(m1421F(((C0414a) ((C3958e) it23.next()).f12961g).f1179a));
                            }
                            for (List list9 : AbstractC4166m.m8416n1(200, arrayList16)) {
                                Iterator it24 = it6;
                                try {
                                    String[] strArr = (String[]) list9.toArray(new String[0]);
                                    linkedHashMap2 = linkedHashMap5;
                                    if (method.getParameterTypes().length == 2) {
                                        try {
                                            c3959f2 = KavaReflector.invokeOrThrow(method, objStorageObjectForMethod, strArr, str60);
                                        } catch (Throwable th5) {
                                            th = th5;
                                            c3959f2 = new C3959f(th);
                                        }
                                    } else {
                                        c3959f2 = KavaReflector.invokeOrThrow(method, objStorageObjectForMethod, strArr, str60, Boolean.TRUE, Boolean.valueOf(!AbstractC3149m.m6721t0(str60)));
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    linkedHashMap2 = linkedHashMap5;
                                }
                                Throwable thM8182b = C3960g.m8182b(c3959f2);
                                if (thM8182b != null) {
                                    method2 = method;
                                    AbstractC1184v0.m3204n("[Hchat:ConversationGroup] 通知虚拟分组会话刷新失败: count=" + list9.size() + " parent=" + str60 + " " + thM8182b.getMessage(), thM8182b);
                                } else {
                                    method2 = method;
                                }
                                it6 = it24;
                                linkedHashMap5 = linkedHashMap2;
                                method = method2;
                            }
                        }
                    } else {
                        objStorageObjectForMethod = weChatDatabaseApi4.storageObjectForMethod(method);
                        if (objStorageObjectForMethod != null) {
                            f1251q = objStorageObjectForMethod;
                            LinkedHashMap linkedHashMap82 = new LinkedHashMap();
                            while (r0.hasNext()) {
                            }
                            it6 = linkedHashMap82.entrySet().iterator();
                            while (it6.hasNext()) {
                            }
                        }
                    }
                }
            }
            linkedHashMap3 = linkedHashMap5;
            string2 = sharedPreferencesM8640c.getString("original_parent_refs", str7);
            if (string2 == null) {
                string2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(string2)) {
                string2 = str7;
            }
            c3959f3 = new JSONObject(string2);
            Object jSONObject2 = new JSONObject();
            if (c3959f3 instanceof C3959f) {
                c3959f3 = jSONObject2;
            }
            JSONObject jSONObject3 = (JSONObject) c3959f3;
            if (linkedHashMap3.isEmpty()) {
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry entry5 : linkedHashMap3.entrySet()) {
                    jSONObject4.put((String) entry5.getKey(), (String) entry5.getValue());
                }
                jSONObject3.put(strM1477a, jSONObject4);
            } else {
                jSONObject3.remove(strM1477a);
            }
            string = jSONObject3.toString();
            string.getClass();
            if (!string.equals(sharedPreferencesM8640c.getString("original_parent_refs", str7)) && !sharedPreferencesM8640c.edit().putString("original_parent_refs", string).commit()) {
                AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 保存原始 parentRef 失败: account=".concat(strM1477a));
            }
            ArrayList arrayList17 = new ArrayList();
            for (Object obj12 : iterable3) {
                if (linkedHashSet4.contains(((C0414a) ((C3958e) obj12).f12961g).f1179a)) {
                    arrayList17.add(obj12);
                }
            }
            ArrayList arrayList18 = new ArrayList(AbstractC4167n.m8429e1(arrayList17));
            it7 = arrayList17.iterator();
            while (it7.hasNext()) {
                arrayList18.add(m1421F(((C0414a) ((C3958e) it7.next()).f12961g).f1179a));
            }
            Set setM8412U1 = AbstractC4166m.m8412U1(arrayList18);
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            it8 = AbstractC0000a.m101y0("rconversation", "rcontact", "img_flag").iterator();
            while (it8.hasNext()) {
                List<Map<String, Object>> listQuery3 = weChatDatabaseApi4.query(AbstractC0921a.m2251n("SELECT username FROM ", (String) it8.next(), " WHERE username LIKE ?"), new String[]{"wxid_hchat_group_%"});
                listQuery3.getClass();
                Iterator<T> it25 = listQuery3.iterator();
                while (it25.hasNext()) {
                    Map map5 = (Map) it25.next();
                    map5.getClass();
                    String str61 = str54;
                    String strM1420E3 = m1420E(str61, map5);
                    if (AbstractC3149m.m6721t0(strM1420E3)) {
                        strM1420E3 = null;
                    }
                    if (strM1420E3 != null) {
                        linkedHashSet5.add(strM1420E3);
                    }
                    str54 = str61;
                }
            }
            for (String str62 : AbstractC4156d0.m8352T(linkedHashSet5, setM8412U1)) {
                try {
                    c1624aConversations = WeChatApis.conversations();
                } catch (Throwable th7) {
                    th = th7;
                }
                try {
                    c3959f4 = Boolean.valueOf(c1624aConversations != null && c1624aConversations.m4142a(str62));
                } catch (Throwable th8) {
                    th = th8;
                    c3959f4 = new C3959f(th);
                }
                Object obj13 = Boolean.FALSE;
                if (c3959f4 instanceof C3959f) {
                    c3959f4 = obj13;
                }
                if (((Boolean) c3959f4).booleanValue()) {
                    str9 = str8;
                } else {
                    str9 = str8;
                    weChatDatabaseApi4.delete("rconversation", str9, new String[]{str62});
                }
                weChatDatabaseApi4.delete("rcontact", str9, new String[]{str62});
                weChatDatabaseApi4.delete("img_flag", str9, new String[]{str62});
                str8 = str9;
            }
        }
        str = "{}";
        weChatDatabaseApi = weChatDatabaseApiDatabase;
        list = listM1485i;
        str2 = "Hchat_conversation_groups";
        linkedHashMap = c4174u;
        if (z10) {
        }
        linkedHashSet = new LinkedHashSet();
        it = iterable.iterator();
        iterable2 = iterable;
        while (true) {
            zHasNext = it.hasNext();
            str5 = "username=?";
            iterable3 = iterable2;
            it2 = it;
            str6 = "parentRef";
            linkedHashSet2 = linkedHashSet;
            if (zHasNext) {
            }
            str4 = str18;
            linkedHashSet = linkedHashSet3;
            weChatDatabaseApi = weChatDatabaseApi3;
            str29 = str16;
            str3 = str20;
            str32 = str12;
            iterable2 = iterable3;
            str31 = str40;
            str28 = str17;
            str33 = str13;
            str30 = str15;
            it = it2;
        }
        WeChatDatabaseApi weChatDatabaseApi42 = weChatDatabaseApi;
        iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list));
        if (iM8438a0 < 16) {
        }
        LinkedHashMap linkedHashMap42 = new LinkedHashMap(iM8438a0);
        while (r0.hasNext()) {
        }
        LinkedHashSet linkedHashSet42 = new LinkedHashSet();
        while (r0.hasNext()) {
        }
        if (z10) {
        }
        sharedPreferencesM8640c = AbstractC4302b.m8640c(context, str2);
        str7 = str;
        string3 = sharedPreferencesM8640c.getString("original_parent_refs", str7);
        if (string3 == null) {
        }
        if (AbstractC3149m.m6721t0(string3)) {
        }
        c3959f = new JSONObject(string3);
        Object jSONObject5 = new JSONObject();
        if (c3959f instanceof C3959f) {
        }
        jSONObjectOptJSONObject = ((JSONObject) c3959f).optJSONObject(strM1477a);
        if (jSONObjectOptJSONObject == null) {
        }
        LinkedHashMap linkedHashMap52 = new LinkedHashMap(mapM8780c2);
        LinkedHashMap linkedHashMap62 = new LinkedHashMap();
        HashSet hashSet22 = new HashSet();
        List<Map<String, Object>> listQuery22 = weChatDatabaseApi42.query("SELECT username,parentRef FROM rconversation WHERE parentRef LIKE ? OR parentRef LIKE ?", new String[]{"hchat_conv_group:%", "wxid_hchat_group_%"});
        listQuery22.getClass();
        it3 = listQuery22.iterator();
        while (it3.hasNext()) {
        }
        it4 = mapM8780c.entrySet().iterator();
        while (it4.hasNext()) {
        }
        String str542 = str34;
        it5 = linkedHashMap62.entrySet().iterator();
        while (it5.hasNext()) {
        }
        ArrayList arrayList122 = new ArrayList();
        while (r1.hasNext()) {
        }
        LinkedHashMap linkedHashMap72 = new LinkedHashMap();
        while (r0.hasNext()) {
        }
        while (r0.hasNext()) {
        }
        arrayList = new ArrayList();
        while (r1.hasNext()) {
        }
        if (!arrayList.isEmpty()) {
            objStorageObjectForMethod = f1251q;
            if (objStorageObjectForMethod == null) {
            }
        }
        linkedHashMap3 = linkedHashMap52;
        string2 = sharedPreferencesM8640c.getString("original_parent_refs", str7);
        if (string2 == null) {
        }
        if (AbstractC3149m.m6721t0(string2)) {
        }
        c3959f3 = new JSONObject(string2);
        Object jSONObject22 = new JSONObject();
        if (c3959f3 instanceof C3959f) {
        }
        JSONObject jSONObject32 = (JSONObject) c3959f3;
        if (linkedHashMap3.isEmpty()) {
        }
        string = jSONObject32.toString();
        string.getClass();
        if (!string.equals(sharedPreferencesM8640c.getString("original_parent_refs", str7))) {
            AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 保存原始 parentRef 失败: account=".concat(strM1477a));
        }
        ArrayList arrayList172 = new ArrayList();
        while (r1.hasNext()) {
        }
        ArrayList arrayList182 = new ArrayList(AbstractC4167n.m8429e1(arrayList172));
        it7 = arrayList172.iterator();
        while (it7.hasNext()) {
        }
        Set setM8412U12 = AbstractC4166m.m8412U1(arrayList182);
        LinkedHashSet linkedHashSet52 = new LinkedHashSet();
        it8 = AbstractC0000a.m101y0("rconversation", "rcontact", "img_flag").iterator();
        while (it8.hasNext()) {
        }
        while (r1.hasNext()) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Method m1447r(C3742g c3742g, String str, C0570e c0570e, InterfaceC1231l interfaceC1231l) {
        Object c3959f;
        Object next;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_conversation_group_method_cache");
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str2 = C3087k.m6557a(context, classLoader).f8202h;
        try {
            C3010h c3010h = new C3010h(AbstractC3015m.m6414X(AbstractC4166m.m8415m1(c3742g.f12146d.findMethod(c0570e)), new C0472o1(this, c3742g, 0)));
            while (true) {
                if (!c3010h.hasNext()) {
                    next = null;
                    break;
                }
                next = c3010h.next();
                if (((Boolean) interfaceC1231l.invoke(next)).booleanValue()) {
                    break;
                }
            }
            c3959f = (Method) next;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2260w("[Hchat:ConversationGroup] 定位微信会话入口失败 key=", str, ": ", thM8182b.getMessage(), thM8182b);
        }
        Method method = (Method) (c3959f instanceof C3959f ? null : c3959f);
        if (method != null) {
            C0828b.m2092h(sharedPreferencesM8640c, str2, str, method);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferencesM8640c.edit();
                if (!AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str2)) {
                    editorEdit.clear().putString("cache.key", str2);
                }
                editorEdit.remove(str).apply();
            } catch (Throwable unused) {
            }
        }
        return method;
    }
}
