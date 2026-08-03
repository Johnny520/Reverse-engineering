package p230p8;

import android.content.Context;
import android.content.SharedPreferences;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import ng.AbstractC3015m;
import ng.C3010h;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p036c9.C0472o1;
import p062e8.C0828b;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p086fh.C1253k;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: p8.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3365q {

    /* JADX INFO: renamed from: a */
    public static final C3365q f10860a = new C3365q();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m7141a(Method method) {
        return Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), String.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Method m7142b(C3742g c3742g, String str, List list, InterfaceC1231l interfaceC1231l, InterfaceC1235p interfaceC1235p) {
        Object c3959f;
        Object next;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_sns_forward_local_media_method_cache");
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader, str);
        if (methodM2087c != null) {
            if (!((Boolean) interfaceC1231l.invoke(methodM2087c)).booleanValue()) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, list);
            c0570e.f1764h = c1253k;
            C3010h c3010h = new C3010h(AbstractC3015m.m6414X(AbstractC4166m.m8415m1(dexKitBridge.findMethod(c0570e)), new C0472o1(this, c3742g, 1)));
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
            String str2 = (String) AbstractC4166m.m8424v1(list);
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            interfaceC1235p.invoke("定位朋友圈本地媒体方法失败: ".concat(str2), thM8182b);
        }
        Method method = (Method) (c3959f instanceof C3959f ? null : c3959f);
        if (method == null) {
            try {
                SharedPreferences.Editor editorEdit = sharedPreferencesM8640c.edit();
                if (!AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit.clear().putString("cache.key", strM2091g);
                }
                editorEdit.remove(str).apply();
            } catch (Throwable unused) {
            }
        } else {
            C0828b.m2092h(sharedPreferencesM8640c, strM2091g, str, method);
        }
        return method;
    }
}
