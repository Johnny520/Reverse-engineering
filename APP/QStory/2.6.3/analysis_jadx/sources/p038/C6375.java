package p038;

import androidx.compose.runtime.internal.C1245;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.qq.C5559;
import lin.xposed.hook.util.qq.QQEnvTool;
import p009.AbstractC6183;
import p026.AbstractC6316;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6375 extends AbstractC6316 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ int f17529 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ExecutorService f17530 = Executors.newCachedThreadPool();

    static {
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC8405.m13973("喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m11959(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            CompletableFuture completableFuture = new CompletableFuture();
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(316)));
            C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
            String strM13972 = AbstractC8405.m13972(318);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            Class cls = Boolean.TYPE;
            c1245.f3619 = new Class[]{String.class, cls, cls, Object.class};
            Method methodM11855 = c6335M11854.m11855();
            methodM11855.invoke(qRouteApi, str, Boolean.FALSE, Boolean.TRUE, Proxy.newProxyInstance(AbstractC6337.f17460, new Class[]{methodM11855.getParameterTypes()[3]}, new C5559(completableFuture, 1)));
            String str2 = (String) completableFuture.get(500L, TimeUnit.MILLISECONDS);
            return m11960(str2) ? str2 : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m11960(String str) {
        Object objM11587 = AbstractC6183.m11587(316);
        C6335 c6335M11854 = C6335.m11854(objM11587.getClass());
        String strM13972 = AbstractC8405.m13972(317);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3618 = strM13972;
        c1245.f3619 = new Class[]{String.class};
        return ((Boolean) c6335M11854.m11856(objM11587, str)).booleanValue();
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        XposedHelpers.findAndHookMethod(AbstractC8405.m13972(313), classLoader, AbstractC8405.m13972(314), new Object[]{AbstractC6337.m11866(AbstractC8405.m13972(315)), new C5812(this, 20)});
    }
}
