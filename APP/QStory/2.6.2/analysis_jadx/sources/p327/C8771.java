package p327;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6296;
import p032.AbstractC6318;
import top.suzhelan.qstory.hook.item.chat.C5861;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世哲子兰楪/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8771 extends AbstractC6296 {
    @Override // p026.AbstractC6296
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937792464220587431L));
        Method[] declaredMethods = clsM11838.getDeclaredMethods();
        AbstractC3056.m6668(-3937714304405734823L);
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            method.setAccessible(true);
            if (method.getParameterTypes().length >= 6 && AbstractC4394.m8917(method.getParameterTypes()[0], File.class)) {
                XposedBridge.hookMethod(method, new C5861(clsM11838, 1));
            }
        }
    }
}
