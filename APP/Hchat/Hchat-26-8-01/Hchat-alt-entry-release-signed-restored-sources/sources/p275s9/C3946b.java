package p275s9;

import android.content.Context;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;
import tf.C4173t;

/* JADX INFO: renamed from: s9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3946b {

    /* JADX INFO: renamed from: a */
    public final C3742g f12938a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f12939b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f12940c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f12941d;

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap.KeySetView f12942e;

    /* JADX INFO: renamed from: f */
    public final Map f12943f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f12944g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3946b(C3742g c3742g) {
        c3742g.getClass();
        this.f12938a = c3742g;
        Context context = c3742g.f12143a;
        this.f12939b = AbstractC4302b.m8640c(context, "Hchat_hide_chat_avatar_config");
        this.f12940c = AbstractC4302b.m8640c(context, "Hchat_hide_chat_avatar_method_cache");
        this.f12941d = new ConcurrentHashMap();
        this.f12942e = ConcurrentHashMap.newKeySet();
        this.f12943f = AbstractC3199a.m6843p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Boolean m8167d(Object obj) {
        Integer numM6742f0;
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (!(obj instanceof String) || (numM6742f0 = AbstractC3156t.m6742f0(AbstractC3149m.m6703R0((String) obj).toString())) == null) {
            return null;
        }
        return Boolean.valueOf(numM6742f0.intValue() == 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C3945a m8168a(Class cls) {
        ConcurrentHashMap concurrentHashMap = this.f12941d;
        C3945a c3945a = (C3945a) concurrentHashMap.get(cls);
        if (c3945a != null) {
            return c3945a;
        }
        ConcurrentHashMap.KeySetView keySetView = this.f12942e;
        if (keySetView.contains(cls)) {
            return null;
        }
        Field field = null;
        Field field2 = null;
        for (Class superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Field field3 : KavaReflector.declaredFields(superclass)) {
                if (field == null && (AbstractC1416l.m3825a(field3.getName(), "avatarIV") || AbstractC3156t.m6733W(field3.getType().getName(), ".ChattingAvatarImageView", false))) {
                    field = field3;
                } else if (field2 == null && (AbstractC1416l.m3825a(field3.getName(), "avatarMask") || field3.getType().getName().equals("com.tencent.mm.ui.base.MaskLayout"))) {
                    field2 = field3;
                }
            }
        }
        C3945a c3945a2 = field != null ? new C3945a(field, field2) : null;
        if (c3945a2 == null) {
            keySetView.add(cls);
            return c3945a2;
        }
        concurrentHashMap.put(cls, c3945a2);
        return c3945a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m8169b(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 4 && AbstractC1416l.m3825a(parameterTypes[2], String.class)) {
            Class<?> cls = parameterTypes[0];
            cls.getClass();
            if (m8168a(cls) != null) {
                for (Class<?> cls2 : parameterTypes) {
                    if (AbstractC3156t.m6740d0(cls2.getName(), "com.tencent.mm.storage.", false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:65:0x0092 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v3, types: [sf.f] */
    /* JADX INFO: renamed from: c */
    public final Method m8170c() {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f12938a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        String str = C3087k.m6557a(context, classLoader).f8202h;
        Object obj = null;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        String strConcat = str != null ? str.concat("|hide_chat_avatar_v1") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        SharedPreferences sharedPreferences = this.f12940c;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strConcat, classLoader, "avatar_bind");
        if (methodM2087c != null) {
            if (!m8169b(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        String[] strArr = {"MicroMsg.ChattingItem", "attachAvatarClickListener: getBizKfWorker:%s"};
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC4165l.m8375L0(strArr));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(classLoader);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    c3959f.add(method);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj2 = c3959f;
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:HideChatAvatar] 定位聊天头像绑定方法异常: ", thM8182b.getMessage(), thM8182b);
            obj2 = C4173t.f13710g;
        }
        Iterator it2 = ((List) obj2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (m8169b((Method) next)) {
                obj = next;
                break;
            }
        }
        Method method2 = (Method) obj;
        if (method2 != null) {
            C0828b.m2092h(sharedPreferences, strConcat, "avatar_bind", method2);
        } else {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                    editorEdit.clear().putString("cache.key", strConcat);
                }
                editorEdit.remove("avatar_bind").apply();
            } catch (Throwable unused) {
            }
        }
        return method2;
    }
}
