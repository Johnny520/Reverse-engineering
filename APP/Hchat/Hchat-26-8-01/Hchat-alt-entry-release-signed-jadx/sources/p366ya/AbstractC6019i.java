package p366ya;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p036c9.C0434f;
import p062e8.C0828b;
import p065eb.RunnableC0900w;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p086fh.C1253k;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: ya.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6019i {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f24449a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static volatile C3742g f24450b;

    /* JADX INFO: renamed from: c */
    public static volatile Method f24451c;

    /* JADX INFO: renamed from: d */
    public static volatile Object f24452d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m10780a(C3742g c3742g) {
        WeChatDatabaseApi weChatDatabaseApiDatabase;
        c3742g.getClass();
        f24450b = c3742g;
        if (f24449a.compareAndSet(false, true)) {
            Method methodM10783d = m10783d(c3742g, false);
            if (methodM10783d != null && (weChatDatabaseApiDatabase = WeChatApis.database()) != null) {
                m10786g(weChatDatabaseApiDatabase, methodM10783d);
            }
            Handler handler = C3740e.f12138a;
            C3740e.m7759f(8, new C0434f(c3742g, 9), "quick_mark_read:native_mark_read", "快捷已读原生已读入口", EnumC3738c.WARMUP);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m10781b(Method method) {
        if (!KavaReflector.isStatic(method)) {
            Class<?> returnType = method.getReturnType();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if ((AbstractC1416l.m3825a(returnType, Boolean.TYPE) || AbstractC1416l.m3825a(returnType, Boolean.class)) && parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], String.class)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m10782c(Context context) {
        if (context == null) {
            return false;
        }
        return AbstractC4302b.m8640c(context, "Hchat_quick_mark_read_config").getBoolean("plus_menu_read_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x0090 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [sf.f] */
    /* JADX INFO: renamed from: d */
    public static Method m10783d(C3742g c3742g, boolean z9) {
        Object c3959f;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_quick_mark_read_method_cache");
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|quick_mark_read_native_v1") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strConcat, c3742g.f12145c, "native_mark_read");
        if (methodM2087c != null && m10781b(methodM2087c)) {
            f24451c = methodM2087c;
            return methodM2087c;
        }
        if (methodM2087c != null) {
            C0828b.m2085a(sharedPreferencesM8640c, strConcat, "native_mark_read");
            f24451c = null;
            f24452d = null;
        }
        if (!z9) {
            return null;
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            c1253k.m3374r0("updateUnreadByTalker %s", "unReadMuteCount", "atCount");
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                c3959f.add(((C1730o) it.next()).m4350r(c3742g.f12145c));
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj = c3959f;
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:QuickRead] DexKit 定位原生已读入口失败: ", thM8182b.getMessage(), thM8182b);
            obj = C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) obj) {
            if (m10781b((Method) obj2)) {
                arrayList.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (hashSet.add(((Method) obj3).toGenericString())) {
                arrayList2.add(obj3);
            }
        }
        Method method = (Method) AbstractC4166m.m8400I1(arrayList2);
        if (method != null) {
            f24451c = method;
            f24452d = null;
            C0828b.m2092h(sharedPreferencesM8640c, strConcat, "native_mark_read", method);
            return method;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferencesM8640c.edit();
            if (!AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                editorEdit.clear().putString("cache.key", strConcat);
            }
            editorEdit.remove("native_mark_read").apply();
        } catch (Throwable unused) {
        }
        f24451c = null;
        f24452d = null;
        AbstractC1184v0.m3203m("[Hchat:QuickRead] 原生已读入口定位失败，候选数=" + arrayList2.size());
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final int m10784e(Context context, boolean z9) {
        Object c3959f;
        String string;
        Context applicationContext;
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        WeChatDatabaseApi weChatDatabaseApiDatabase = WeChatApis.database();
        if (weChatDatabaseApiDatabase != null) {
            Object c3959f2 = null;
            List<Map<String, Object>> listQuery = weChatDatabaseApiDatabase.query("SELECT username FROM rconversation WHERE IFNULL(unReadCount,0)>0 OR IFNULL(unReadMuteCount,0)>0 OR IFNULL(atCount,0)>0", null);
            listQuery.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listQuery.iterator();
            while (it.hasNext()) {
                Object obj = ((Map) it.next()).get("username");
                if (obj == null || (string = obj.toString()) == null || AbstractC3149m.m6721t0(string)) {
                    string = null;
                }
                if (string != null) {
                    arrayList.add(string);
                }
            }
            List<String> listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList));
            if (weChatDatabaseApiDatabase.isReady()) {
                int i9 = 0;
                if (listM8407P1.isEmpty()) {
                    if (z9) {
                        m10787h(context, "没有未读会话");
                    }
                    return 0;
                }
                Method methodM10783d = f24451c;
                if (methodM10783d == null) {
                    C3742g c3742g = f24450b;
                    methodM10783d = c3742g != null ? m10783d(c3742g, false) : null;
                }
                if (methodM10783d != null) {
                    Object objM10786g = m10786g(weChatDatabaseApiDatabase, methodM10783d);
                    if (objM10786g != null) {
                        for (String str : listM8407P1) {
                            try {
                                Object objInvokeOrThrow = KavaReflector.invokeOrThrow(methodM10783d, objM10786g, str);
                                c3959f = Boolean.valueOf(AbstractC1416l.m3825a(objInvokeOrThrow instanceof Boolean ? (Boolean) objInvokeOrThrow : null, Boolean.TRUE));
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            Throwable thM8182b = C3960g.m8182b(c3959f);
                            if (thM8182b != null) {
                                AbstractC0921a.m2261x("[Hchat:QuickRead] 调用原生已读失败: ", str, thM8182b);
                            }
                            Boolean bool = Boolean.FALSE;
                            if (c3959f instanceof C3959f) {
                                c3959f = bool;
                            }
                            if (((Boolean) c3959f).booleanValue()) {
                                i9++;
                            }
                        }
                        if (i9 <= 0) {
                            if (z9) {
                                m10787h(context, "全部已读失败");
                            }
                            AbstractC1184v0.m3203m("[Hchat:QuickRead] 原生已读未成功处理会话");
                            return -1;
                        }
                        if (context != null) {
                            try {
                                Object systemService = context.getSystemService("notification");
                                NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                                if (notificationManager != null) {
                                    notificationManager.cancelAll();
                                    c3959f2 = C3967n.f12976a;
                                }
                            } catch (Throwable th3) {
                                c3959f2 = new C3959f(th3);
                            }
                            Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                            if (thM8182b2 != null) {
                                AbstractC1184v0.m3204n("[Hchat:QuickRead] 清理微信通知失败", thM8182b2);
                            }
                        }
                        if (z9) {
                            m10787h(context, "已读 " + i9 + " 个会话");
                        }
                        return i9;
                    }
                    if (z9) {
                        m10787h(context, "原生会话存储未就绪");
                    }
                } else if (z9) {
                    m10787h(context, "原生已读入口未就绪");
                    return -1;
                }
            } else if (z9) {
                m10787h(context, "数据库未就绪");
                return -1;
            }
        } else if (z9) {
            m10787h(context, "数据库未就绪");
            return -1;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final boolean m10785f(Context context, String str, boolean z9) {
        Object c3959f;
        Context applicationContext;
        if (context != null && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.length() != 0) {
            WeChatDatabaseApi weChatDatabaseApiDatabase = WeChatApis.database();
            if (weChatDatabaseApiDatabase != null && weChatDatabaseApiDatabase.isReady()) {
                Method methodM10783d = f24451c;
                if (methodM10783d == null) {
                    C3742g c3742g = f24450b;
                    methodM10783d = c3742g != null ? m10783d(c3742g, false) : null;
                }
                if (methodM10783d != null) {
                    Object objM10786g = m10786g(weChatDatabaseApiDatabase, methodM10783d);
                    if (objM10786g != null) {
                        try {
                            Object objInvokeOrThrow = KavaReflector.invokeOrThrow(methodM10783d, objM10786g, string);
                            c3959f = Boolean.valueOf(AbstractC1416l.m3825a(objInvokeOrThrow instanceof Boolean ? (Boolean) objInvokeOrThrow : null, Boolean.TRUE));
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            AbstractC1184v0.m3204n("[Hchat:QuickRead] 调用原生已读失败: ".concat(string), thM8182b);
                        }
                        Boolean bool = Boolean.FALSE;
                        if (c3959f instanceof C3959f) {
                            c3959f = bool;
                        }
                        boolean zBooleanValue = ((Boolean) c3959f).booleanValue();
                        if (!zBooleanValue && z9) {
                            m10787h(context, "会话已读失败");
                        }
                        return zBooleanValue;
                    }
                    if (z9) {
                        m10787h(context, "原生会话存储未就绪");
                        return false;
                    }
                } else if (z9) {
                    m10787h(context, "原生已读入口未就绪");
                    return false;
                }
            } else if (z9) {
                m10787h(context, "数据库未就绪");
            }
        } else if (z9) {
            m10787h(context, "会话无效");
            return false;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Object m10786g(WeChatDatabaseApi weChatDatabaseApi, Method method) {
        Object obj = f24452d;
        if (obj != null) {
            if (method.getDeclaringClass().isInstance(obj)) {
                return obj;
            }
            f24452d = null;
        }
        Object objStorageObjectForMethod = weChatDatabaseApi.storageObjectForMethod(method);
        if (objStorageObjectForMethod == null) {
            return null;
        }
        f24452d = objStorageObjectForMethod;
        return objStorageObjectForMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m10787h(Context context, String str) {
        if (context == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new RunnableC0900w(context, str, 8));
    }
}
