package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世楪兰苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5889 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Class cls = Void.TYPE;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Method method = null;
        try {
            XposedBridge.hookMethod(AbstractC6337.m11866(AbstractC8405.m13972(1856)).getDeclaredMethod(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵"), null), new C5915(12));
        } catch (Exception unused) {
        }
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1857));
            Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(1858));
            Method[] declaredMethods = clsM11866.getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods.getClass();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method2 = declaredMethods[i];
                if (AbstractC4395.m8907(method2.getReturnType(), cls) && method2.getParameterCount() == 2 && AbstractC4395.m8907(method2.getParameterTypes()[0], String.class) && AbstractC4395.m8907(method2.getParameterTypes()[1], clsM118662)) {
                    method = method2;
                    break;
                }
                i++;
            }
            if (method != null) {
                XposedBridge.hookMethod(method, new C5915(13));
            }
        } catch (Exception unused2) {
        }
        try {
            Method[] declaredMethods2 = AbstractC6337.m11866(AbstractC8405.m13972(1859)).getDeclaredMethods();
            AbstractC8405.m13972(1555);
            declaredMethods2.getClass();
            ArrayList arrayList = new ArrayList();
            for (Method method3 : declaredMethods2) {
                String name = method3.getName();
                AbstractC8405.m13972(1820);
                name.getClass();
                if (AbstractC5139.m10139(name, AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜呜喵喵喵"), false) && AbstractC4395.m8907(method3.getReturnType(), cls)) {
                    arrayList.add(method3);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                XposedBridge.hookMethod((Method) it.next(), new C5915(14));
            }
        } catch (Exception unused3) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(105);
    }
}
