package lin.xposed.hook.util.qq;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQServiceTool {
    public static Object getMsgServiceOfKernel() {
        Object service = getService(AbstractC6318.m11838("com.tencent.qqnt.kernel.api.IKernelService"));
        C6316 c6316M11826 = C6316.m11826(service.getClass());
        c6316M11826.f17409.f3617 = "getMsgService";
        return c6316M11826.m11828(service, new Object[0]);
    }

    public static Object getRuntime() {
        return XposedHelpers.callMethod(XposedHelpers.callStaticMethod(AbstractC6318.m11838("com.tencent.common.app.BaseApplicationImpl"), "getApplication", new Object[0]), "getRuntime", new Object[0]);
    }

    public static Object getService(Class<?> cls, String str) {
        Object runtime = getRuntime();
        if (runtime == null) {
            return null;
        }
        C6316 c6316M11826 = C6316.m11826(runtime.getClass());
        String strM6668 = "getRuntimeService";
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3617 = strM6668;
        c1245.f3618 = new Class[]{Class.class, String.class};
        return c6316M11826.m11828(runtime, cls, str);
    }

    public static Object getService(Class<?> cls) {
        return getService(cls, "");
    }
}
