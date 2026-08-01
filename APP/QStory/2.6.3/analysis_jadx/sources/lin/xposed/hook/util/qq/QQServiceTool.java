package lin.xposed.hook.util.qq;

import androidx.compose.runtime.internal.C1245;
import de.robv.android.xposed.XposedHelpers;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQServiceTool {
    public static Object getMsgServiceOfKernel() {
        Object service = getService(AbstractC6337.m11866(AbstractC8405.m13972(1013)));
        C6335 c6335M11854 = C6335.m11854(service.getClass());
        c6335M11854.f17458.f3618 = AbstractC8405.m13972(1014);
        return c6335M11854.m11856(service, new Object[0]);
    }

    public static Object getRuntime() {
        return XposedHelpers.callMethod(XposedHelpers.callStaticMethod(AbstractC6337.m11866(AbstractC8405.m13972(72)), AbstractC8405.m13972(897), new Object[0]), AbstractC8405.m13972(898), new Object[0]);
    }

    public static Object getService(Class<?> cls, String str) {
        Object runtime = getRuntime();
        if (runtime == null) {
            return null;
        }
        C6335 c6335M11854 = C6335.m11854(runtime.getClass());
        String strM13972 = AbstractC8405.m13972(936);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3618 = strM13972;
        c1245.f3619 = new Class[]{Class.class, String.class};
        return c6335M11854.m11856(runtime, cls, str);
    }

    public static Object getService(Class<?> cls) {
        return getService(cls, "");
    }
}
