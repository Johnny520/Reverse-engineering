package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪兰苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6719 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Class cls = Void.TYPE;
        "classLoader";
        classLoader.getClass();
        Method method = null;
        try {
            XposedBridge.hookMethod(AbstractC7166.m12425("com.tencent.rfix.lib.download.PatchDownloadTask").getDeclaredMethod("run", null), new C6745(12));
        } catch (Exception unused) {
        }
        try {
            Class clsM12425 = AbstractC7166.m12425("com.tencent.rfix.lib.engine.PatchEngineBase");
            Class clsM124252 = AbstractC7166.m12425("com.tencent.rfix.lib.config.PatchConfig");
            Method[] declaredMethods = clsM12425.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                if (AbstractC5227.m9466(method2.getReturnType(), cls) && method2.getParameterCount() == 2 && AbstractC5227.m9466(method2.getParameterTypes()[0], String.class) && AbstractC5227.m9466(method2.getParameterTypes()[1], clsM124252)) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C6745(13));
            }
        } catch (Exception unused2) {
        }
        try {
            Method[] declaredMethods2 = AbstractC7166.m12425("com.tencent.mobileqq.msf.core.net.patch.PatchReporter").getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method3 : declaredMethods2) {
                String name = method3.getName();
                "getName(...)";
                name.getClass();
                if (AbstractC5971.m10698(name, "report", false) && AbstractC5227.m9466(method3.getReturnType(), cls)) {
                    arrayList.add(method3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                XposedBridge.hookMethod((Method) it.next(), new C6745(14));
            }
        } catch (Exception unused3) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "重启生效";
    }
}
