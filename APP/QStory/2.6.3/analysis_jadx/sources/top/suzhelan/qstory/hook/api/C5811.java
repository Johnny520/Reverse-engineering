package top.suzhelan.qstory.hook.api;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6316;
import p287.AbstractC8405;
import p389.AbstractC9090;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5811 extends AbstractC6316 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public String f15933;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Method[] declaredMethods = AbstractC9090.m14669(AbstractC8405.m13972(122)).getDeclaredMethods();
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
            if (AbstractC4395.m8907(method.getName(), AbstractC8405.m13972(73)) && method.getParameterCount() == 1) {
                break;
            } else {
                i++;
            }
        }
        if (method == null) {
            return;
        }
        AbstractC5399.m10477(AbstractC5399.m10489(AbstractC5395.f15030), null, null, new OnAccountChangeApi$loadHook$1(this, null), 3);
        XposedBridge.hookMethod(method, new C5812(this, 0));
    }
}
