package p321;

import android.content.Context;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p035.AbstractC6340;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏世哲兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8723 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method method;
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        if (AbstractC6340.f17461 < 12290) {
            return;
        }
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC3056.m6668(-3937818225434428839L));
        Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC3056.m6668(-3937566896833168807L));
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
            if (AbstractC4394.m8917(method.getName(), AbstractC3056.m6668(-3937818019275998631L)) && method.getParameterCount() == 2 && AbstractC4394.m8917(method.getParameterTypes()[0], Context.class) && AbstractC4394.m8917(method.getParameterTypes()[1], clsLoadClass2)) {
                break;
            } else {
                i++;
            }
        }
        if (method == null) {
            return;
        }
        XposedBridge.hookMethod(method, new C5811(this, 22));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937818315628742055L);
    }
}
