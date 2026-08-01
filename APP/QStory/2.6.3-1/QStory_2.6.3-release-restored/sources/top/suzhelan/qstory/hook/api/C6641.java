package top.suzhelan.qstory.hook.api;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7145;
import p405.AbstractC9919;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.api.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6641 extends AbstractC7145 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public String f16278;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        "classLoader";
        classLoader.getClass();
        Method[] declaredMethods = AbstractC9919.m15228("com.tencent.mobileqq.app.QQAppInterface").getDeclaredMethods();
        "getDeclaredMethods(...)";
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            if (AbstractC5227.m9466(method.getName(), "onCreate") && method.getParameterCount() == 1) {
                break;
            } else {
                i++;
            }
        }
        if (method == null) {
            return;
        }
        AbstractC6231.m11036(AbstractC6231.m11048(AbstractC6227.f15375), null, null, new OnAccountChangeApi$loadHook$1(this, null), 3);
        XposedBridge.hookMethod(method, new C6642(this, 0));
    }
}
