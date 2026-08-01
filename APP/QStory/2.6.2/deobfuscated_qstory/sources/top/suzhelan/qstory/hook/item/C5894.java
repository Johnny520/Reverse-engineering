package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p035.AbstractC6340;
import p253.AbstractC8189;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世苏楪哲兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5894 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            if (AbstractC6340.f17461 < 5282) {
                return;
            }
            m11232(classLoader);
            m11231(classLoader);
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u5c4f\u853d\u90e8\u5206\u5173\u952e\u8bcd\u89e6\u53d1\u7684\u7279\u6b8a\u5f39\u7a97";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11231(ClassLoader classLoader) {
        Iterator it = AbstractC8189.m13659("com.tencent.mobileqq.aio.animation.pag.PagEasterEggPopManager", "com.tencent.mobileqq.animation.pag.PagEasterEggPopManager").iterator();
        while (it.hasNext()) {
            try {
                Class<?> clsLoadClass = classLoader.loadClass((String) it.next());
                Class<?> clsLoadClass2 = classLoader.loadClass("androidx.fragment.app.Fragment");
                Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
                "getDeclaredMethods(...)";
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length != 0 && AbstractC4394.m8917(parameterTypes[0], clsLoadClass2)) {
                        XposedBridge.hookMethod(method, new C5883(this, 1));
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11232(ClassLoader classLoader) {
        Iterator it = AbstractC8189.m13659("com.tencent.mobileqq.springhb.interactive.ui.InteractivePopManager", "com.tencent.mobileqq.springhb.ui.InteractivePopManager", "com.tencent.mobileqq.interactive.ui.InteractivePopManager").iterator();
        while (it.hasNext()) {
            try {
                Class<?> clsLoadClass = classLoader.loadClass((String) it.next());
                Class<?> clsLoadClass2 = classLoader.loadClass("androidx.fragment.app.Fragment");
                Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
                "getDeclaredMethods(...)";
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length != 0 && AbstractC4394.m8917(parameterTypes[0], clsLoadClass2)) {
                        XposedBridge.hookMethod(method, new C5883(this, 0));
                        return;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
