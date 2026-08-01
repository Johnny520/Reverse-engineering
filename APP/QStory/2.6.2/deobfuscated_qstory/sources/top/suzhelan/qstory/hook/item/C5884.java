package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪兰苏哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5884 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Class cls = Void.TYPE;
        "classLoader";
        classLoader.getClass();
        Method method = null;
        try {
            XposedBridge.hookMethod(AbstractC6318.m11838("com.tencent.rfix.lib.download.PatchDownloadTask").getDeclaredMethod("run", null), new C5909(12));
        } catch (Exception unused) {
        }
        try {
            Class clsM11838 = AbstractC6318.m11838("com.tencent.rfix.lib.engine.PatchEngineBase");
            Class clsM118382 = AbstractC6318.m11838("com.tencent.rfix.lib.config.PatchConfig");
            Method[] declaredMethods = clsM11838.getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                if (AbstractC4394.m8917(method2.getReturnType(), cls) && method2.getParameterCount() == 2 && AbstractC4394.m8917(method2.getParameterTypes()[0], String.class) && AbstractC4394.m8917(method2.getParameterTypes()[1], clsM118382)) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C5909(13));
            }
        } catch (Exception unused2) {
        }
        try {
            Method[] declaredMethods2 = AbstractC6318.m11838("com.tencent.mobileqq.msf.core.net.patch.PatchReporter").getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method3 : declaredMethods2) {
                String name = method3.getName();
                "getName(...)";
                name.getClass();
                if (AbstractC5138.m10125(name, "report", false) && AbstractC4394.m8917(method3.getReturnType(), cls)) {
                    arrayList.add(method3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                XposedBridge.hookMethod((Method) it.next(), new C5909(14));
            }
        } catch (Exception unused3) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u91cd\u542f\u751f\u6548";
    }
}
