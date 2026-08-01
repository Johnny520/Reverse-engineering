package p328;

import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6314;
import p033.AbstractC6337;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.chat.C5866;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8753 extends AbstractC6314 {
    @Override // p026.AbstractC6314
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(2285));
        Method[] declaredMethods = clsM11866.getDeclaredMethods();
        AbstractC8405.m13972(1555);
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            method.setAccessible(true);
            if (method.getParameterTypes().length >= 6 && AbstractC4395.m8907(method.getParameterTypes()[0], File.class)) {
                XposedBridge.hookMethod(method, new C5866(clsM11866, 1));
            }
        }
    }
}
