package p037;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.qq.C5558;
import lin.xposed.hook.util.qq.QQEnvTool;
import p007.AbstractC6136;
import p026.AbstractC6298;
import p032.AbstractC6318;
import p032.C6316;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6358 extends AbstractC6298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ int f17483 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ExecutorService f17484 = Executors.newCachedThreadPool();

    static {
        AbstractC3056.m6668(-3937594839890396583L);
        AbstractC3056.m6668(-3937594839890396583L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m11911(String str) {
        if (str == null || str.isEmpty()) {
            return AbstractC3056.m6668(-3937561979095614887L);
        }
        try {
            CompletableFuture completableFuture = new CompletableFuture();
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937595179192812967L)));
            C6316 c6316M11826 = C6316.m11826(qRouteApi.getClass());
            String strM6668 = AbstractC3056.m6668(-3937594917199807911L);
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            Class cls = Boolean.TYPE;
            c1245.f3618 = new Class[]{String.class, cls, cls, Object.class};
            Method methodM11827 = c6316M11826.m11827();
            methodM11827.invoke(qRouteApi, str, Boolean.FALSE, Boolean.TRUE, Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{methodM11827.getParameterTypes()[3]}, new C5558(completableFuture, 1)));
            String str2 = (String) completableFuture.get(500L, TimeUnit.MILLISECONDS);
            if (m11912(str2)) {
                return str2;
            }
        } catch (Exception unused) {
        }
        return AbstractC3056.m6668(-3937561979095614887L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m11912(String str) {
        Object objM11554 = AbstractC6136.m11554(-3937595179192812967L);
        C6316 c6316M11826 = C6316.m11826(objM11554.getClass());
        String strM6668 = AbstractC3056.m6668(-3937595007394121127L);
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3617 = strM6668;
        c1245.f3618 = new Class[]{String.class};
        return ((Boolean) c6316M11826.m11828(objM11554, str)).booleanValue();
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        XposedHelpers.findAndHookMethod(AbstractC3056.m6668(-3937595509905294759L), classLoader, AbstractC3056.m6668(-3937595488430458279L), new Object[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937595393941177767L)), new C5811(this, 20)});
    }
}
