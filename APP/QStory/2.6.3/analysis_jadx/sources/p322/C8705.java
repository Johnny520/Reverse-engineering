package p322;

import android.content.Context;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世兰子楪哲/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8705 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method method;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        if (AbstractC6358.f17508 < 12290) {
            return;
        }
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(2664));
        Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(118));
        Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
        AbstractC8405.m13972(1555);
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            if (AbstractC4395.m8907(method.getName(), AbstractC8405.m13972(2665)) && method.getParameterCount() == 2 && AbstractC4395.m8907(method.getParameterTypes()[0], Context.class) && AbstractC4395.m8907(method.getParameterTypes()[1], clsLoadClass2)) {
                break;
            } else {
                i++;
            }
        }
        if (method == null) {
            return;
        }
        XposedBridge.hookMethod(method, new C5812(this, 22));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2663);
    }
}
