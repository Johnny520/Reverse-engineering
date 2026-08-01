package p084fd;

import cd.C1517b;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.core.config.AppConfig;
import me.yun.fkwechat.loader.api.HookEngine;
import okhttp3.internal.url._UrlKt;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: fd.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2422b {

    /* JADX INFO: renamed from: a */
    public static Class f6556a;

    /* JADX INFO: renamed from: b */
    public static Method f6557b;

    /* JADX INFO: renamed from: c */
    public static Method f6558c;

    /* JADX INFO: renamed from: d */
    public static Method f6559d;

    /* JADX INFO: renamed from: e */
    public static Class f6560e;

    /* JADX INFO: renamed from: f */
    public static Method f6561f;

    /* JADX INFO: renamed from: g */
    public static final WeakHashMap f6562g = new WeakHashMap();

    /* JADX INFO: renamed from: fd.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo8727a(String str);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8717a(InterfaceC5154i interfaceC5154i) {
        Object thisObject = interfaceC5154i.getThisObject();
        a aVar = (a) f6562g.remove(thisObject);
        try {
            String str = (String) AbstractC5161p.getObjectField(AbstractC5161p.getObjectField(thisObject, "r"), "f");
            if (aVar != null) {
                aVar.mo8727a(str);
            }
        } catch (Exception e10) {
            if (aVar != null) {
                aVar.mo8727a(null);
            }
            AbstractC8924d.m34265e("error", e10);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m8718b() {
        try {
            return (String) f6558c.invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Map m8719c() {
        try {
            return (Map) f6559d.invoke(null, null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m8720d() {
        try {
            return (String) f6557b.invoke(null, null);
        } catch (Throwable unused) {
            return m8722f();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8721e(String str, String str2, a aVar) {
        try {
            Object objNewInstance = AbstractC5161p.newInstance(f6560e, str2, str);
            f6562g.put(objNewInstance, aVar);
            m8726j(objNewInstance);
        } catch (Throwable th) {
            aVar.mo8727a(null);
            AbstractC8924d.m34265e("getPayName", th);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m8722f() {
        return AppConfig.hostContext.getSharedPreferences("com.tencent.mm_preferences", 0).getString("login_weixin_username", _UrlKt.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: renamed from: g */
    public static String m8723g() {
        Map mapM8719c = m8719c();
        if (mapM8719c != null) {
            return (String) mapM8719c.get("last_login_uin");
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static void m8724h() {
        try {
            f6556a = C1517b.findClass().usingStrings("MicroMsg.ConfigStorageLogic", "mmcore has not ready").get();
            f6557b = C1517b.findMethod().inClass(f6556a.getName()).returnType("java.lang.String").paramCount(0).usingNumbers(2).get();
            f6558c = C1517b.findMethod().inClass(f6556a.getName()).returnType("java.lang.String").paramCount(0).usingNumbers(4).get();
            f6559d = C1517b.findMethod().inClass(f6556a.getName()).returnType("java.util.Map").paramCount(0).usingStrings("login_weixin_username", "last_login_alias").get();
            f6560e = C1517b.findClass().usingStrings("/cgi-bin/mmpay-bin/beforetransfer").get();
            f6561f = C1517b.findMethod().inClass(f6560e.getName()).usingStrings("MicroMsg.NetSceneBeforeTransfer").get();
            m8725i();
        } catch (Throwable th) {
            AbstractC8924d.m34264d("AccountBridge", "init error", th);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m8725i() {
        try {
            HookEngine.hookAfter(f6561f, new InterfaceC5156k() { // from class: fd.a
                @Override // md.InterfaceC5156k
                /* JADX INFO: renamed from: a */
                public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                    AbstractC2422b.m8717a(interfaceC5154i);
                }
            });
        } catch (Throwable th) {
            AbstractC8924d.m34264d("AccountBridge", "initTransferHook error", th);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m8726j(Object obj) {
        AbstractC2429i.m8778c(obj);
    }
}
