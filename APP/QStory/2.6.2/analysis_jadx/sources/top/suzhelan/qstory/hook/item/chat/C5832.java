package top.suzhelan.qstory.hook.item.chat;

import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪哲兰苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5832 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method method;
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC3056.m6668(-3937576015048738215L));
        AbstractC3056.m6668(-3937693817411732903L);
        clsLoadClass.getClass();
        Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
        AbstractC3056.m6668(-3937714304405734823L);
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && AbstractC4394.m8917(parameterTypes[0], Integer.TYPE) && AbstractC4394.m8917(parameterTypes[1], String.class)) {
                break;
            } else {
                i++;
            }
        }
        if (method != null) {
            m11802(method, new C5864(4));
        } else {
            C2632.m5294(AbstractC3056.m6668(-3937575838955079079L));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937783973070243239L);
    }
}
