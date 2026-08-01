package p054;

import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.p011qq.C6390;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p025.AbstractC7012;
import p042.AbstractC7145;
import p049.AbstractC7166;
import p049.C7164;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏兰子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7204 extends AbstractC7145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ int f17874 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ExecutorService f17875 = Executors.newCachedThreadPool();

    static {
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
        AbstractC9234.m14532("喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜呜喵~喵喵喵喵喵呜喵喵");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static String m12518(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            CompletableFuture completableFuture = new CompletableFuture();
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425(AbstractC9234.m14531(316)));
            C7164 c7164M12413 = C7164.m12413(qRouteApi.getClass());
            String strM14531 = AbstractC9234.m14531(318);
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            Class cls = Boolean.TYPE;
            c2080.f3964 = new Class[]{String.class, cls, cls, Object.class};
            Method methodM12414 = c7164M12413.m12414();
            methodM12414.invoke(qRouteApi, str, Boolean.FALSE, Boolean.TRUE, Proxy.newProxyInstance(AbstractC7166.f17805, new Class[]{methodM12414.getParameterTypes()[3]}, new C6390(completableFuture, 1)));
            String str2 = (String) completableFuture.get(500L, TimeUnit.MILLISECONDS);
            return m12519(str2) ? str2 : "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static boolean m12519(String str) {
        Object objM12146 = AbstractC7012.m12146(316);
        C7164 c7164M12413 = C7164.m12413(objM12146.getClass());
        String strM14531 = AbstractC9234.m14531(317);
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3963 = strM14531;
        c2080.f3964 = new Class[]{String.class};
        return ((Boolean) c7164M12413.m12415(objM12146, str)).booleanValue();
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        XposedHelpers.findAndHookMethod(AbstractC9234.m14531(313), classLoader, AbstractC9234.m14531(314), new Object[]{AbstractC7166.m12425(AbstractC9234.m14531(315)), new C6642(this, 20)});
    }
}
