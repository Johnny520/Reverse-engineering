package p344;

import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7143;
import p049.AbstractC7166;
import top.suzhelan.qstory.hook.item.chat.C6696;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"L飘花落叶言苏世哲子楪兰/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C9582 extends AbstractC7143 {
    @Override // p042.AbstractC7143
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.app.message.cleanup.CleanUpThoroughManager");
        Method[] declaredMethods = clsM12425.getDeclaredMethods();
        "getDeclaredMethods(...)";
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            method.setAccessible(true);
            if (method.getParameterTypes().length >= 6 && AbstractC5227.m9466(method.getParameterTypes()[0], File.class)) {
                XposedBridge.hookMethod(method, new C6696(clsM12425, 1));
            }
        }
    }
}
