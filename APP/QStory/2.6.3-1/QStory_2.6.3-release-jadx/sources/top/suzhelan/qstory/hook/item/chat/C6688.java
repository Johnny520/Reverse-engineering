package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p050.AbstractC7176;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6748;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰苏哲世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6688 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final List f16361 = AbstractC7176.m12490(AbstractC9234.m14531(2174), AbstractC9234.m14531(2175), AbstractC9234.m14531(2176), AbstractC9234.m14531(2177));

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method method;
        Method method2;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        try {
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(2179));
            Method[] declaredMethods = clsM12425.getDeclaredMethods();
            AbstractC9234.m14531(1555);
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
                if (Modifier.isPublic(method2.getModifiers()) && AbstractC5227.m9466(method2.getReturnType(), Void.TYPE) && method2.getParameterTypes().length == 3 && AbstractC5227.m9466(method2.getParameterTypes()[0], Integer.TYPE) && AbstractC5227.m9466(method2.getParameterTypes()[2], List.class)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (method2 == null) {
                return;
            }
            Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(2132));
            Method[] declaredMethods2 = clsM12425.getDeclaredMethods();
            AbstractC9234.m14531(1555);
            declaredMethods2.getClass();
            int length2 = declaredMethods2.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = declaredMethods2[i];
                if (Modifier.isPrivate(method3.getModifiers()) && AbstractC5227.m9466(method3.getReturnType(), clsM124252)) {
                    method = method3;
                    break;
                }
                i++;
            }
            if (method == null) {
                return;
            }
            method.setAccessible(true);
            XposedBridge.hookMethod(method2, new C6748(method, 4, this));
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2178);
    }
}
