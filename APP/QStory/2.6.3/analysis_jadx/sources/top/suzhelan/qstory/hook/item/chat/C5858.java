package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p034.AbstractC6347;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5918;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏哲世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5858 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f16016 = AbstractC6347.m11931(AbstractC8405.m13972(2174), AbstractC8405.m13972(2175), AbstractC8405.m13972(2176), AbstractC8405.m13972(2177));

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        Method method2;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(2179));
            Method[] declaredMethods = clsM11866.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = declaredMethods[i2];
                if (Modifier.isPublic(method2.getModifiers()) && AbstractC4395.m8907(method2.getReturnType(), Void.TYPE) && method2.getParameterTypes().length == 3 && AbstractC4395.m8907(method2.getParameterTypes()[0], Integer.TYPE) && AbstractC4395.m8907(method2.getParameterTypes()[2], List.class)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method2 == null) {
                return;
            }
            Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(2132));
            Method[] declaredMethods2 = clsM11866.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i];
                if (Modifier.isPrivate(method3.getModifiers()) && AbstractC4395.m8907(method3.getReturnType(), clsM118662)) {
                    method = method3;
                    break;
                }
                i++;
            }
            if (method == null) {
                return;
            }
            method.setAccessible(true);
            XposedBridge.hookMethod(method2, new C5918(method, 4, this));
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2178);
    }
}
