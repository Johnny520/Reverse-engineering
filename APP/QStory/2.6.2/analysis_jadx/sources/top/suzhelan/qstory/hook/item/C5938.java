package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪世哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5938 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        Class cls;
        Class cls2;
        Method method2;
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        try {
            Method[] declaredMethods = Class.forName(AbstractC3056.m6668(-3937766518323152295L)).getDeclaredMethods();
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                cls = Boolean.TYPE;
                cls2 = Void.TYPE;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods[i2];
                if (AbstractC4394.m8917(method2.getReturnType(), cls2) && method2.getParameterCount() == 3 && AbstractC4394.m8917(method2.getParameterTypes()[0], cls)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method2 == null) {
                int length2 = declaredMethods.length;
                while (true) {
                    if (i >= length2) {
                        break;
                    }
                    Method method3 = declaredMethods[i];
                    if (AbstractC4394.m8917(method3.getReturnType(), cls2) && method3.getParameterCount() == 4 && AbstractC4394.m8917(method3.getParameterTypes()[1], cls)) {
                        method = method3;
                        break;
                    }
                    i++;
                }
                if (method == null) {
                    return;
                } else {
                    method2 = method;
                }
            }
            XposedBridge.hookMethod(method2, new C5811(this, 8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937766582747661735L);
    }
}
