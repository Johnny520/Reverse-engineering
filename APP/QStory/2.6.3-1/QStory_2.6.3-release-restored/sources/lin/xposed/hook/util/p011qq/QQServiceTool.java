package lin.xposed.hook.util.p011qq;

import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XposedHelpers;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQServiceTool {
    public static Object getMsgServiceOfKernel() {
        Object service = getService(AbstractC7166.m12425("com.tencent.qqnt.kernel.api.IKernelService"));
        C7164 c7164M12413 = C7164.m12413(service.getClass());
        c7164M12413.f17803.f3963 = "getMsgService";
        return c7164M12413.m12415(service, new Object[0]);
    }

    public static Object getRuntime() {
        return XposedHelpers.callMethod(XposedHelpers.callStaticMethod(AbstractC7166.m12425("com.tencent.common.app.BaseApplicationImpl"), "getApplication", new Object[0]), "getRuntime", new Object[0]);
    }

    public static Object getService(Class<?> cls, String str) {
        Object runtime = getRuntime();
        if (runtime == null) {
            return null;
        }
        C7164 c7164M12413 = C7164.m12413(runtime.getClass());
        String strM14531 = "getRuntimeService";
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3963 = strM14531;
        c2080.f3964 = new Class[]{Class.class, String.class};
        return c7164M12413.m12415(runtime, cls, str);
    }

    public static Object getService(Class<?> cls) {
        return getService(cls, "");
    }
}
