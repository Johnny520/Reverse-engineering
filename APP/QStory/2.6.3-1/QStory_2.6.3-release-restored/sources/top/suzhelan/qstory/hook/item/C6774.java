package top.suzhelan.qstory.hook.item;

import android.view.View;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰楪世哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6774 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            Method[] declaredMethods = classLoader.loadClass("com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout").getDeclaredMethods();
            "getDeclaredMethods(...)";
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (AbstractC5227.m9466(method.getReturnType(), View.class) && parameterTypes.length == 4 && AbstractC5227.m9466(parameterTypes[0], Integer.TYPE) && AbstractC5227.m9466(parameterTypes[2], Boolean.TYPE) && AbstractC5227.m9466(parameterTypes[3], float[].class)) {
                    XposedBridge.hookMethod(method, new C6642(this, 7));
                    return;
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "移除长按消息气泡菜单中的图标";
    }
}
