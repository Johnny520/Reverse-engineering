package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p303.AbstractC9234;
import p408.C9931;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰世哲苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6683 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        int i;
        Object next;
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        try {
            C9931 c9931 = new C9931();
            c9931.f25866.addAll(Arrays.asList(AbstractC9234.m14531(2168)));
            c9931.m15254(AbstractC9234.m14531(2169), AbstractC9234.m14531(2170));
            ArrayList arrayListM15256 = c9931.m15256();
            AbstractC9234.m14531(1824);
            Iterator it = arrayListM15256.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String name = ((Class) next).getName();
                AbstractC9234.m14531(1820);
                if (AbstractC5976.m10735(name, AbstractC9234.m14531(2171), false)) {
                    break;
                }
            }
            Class cls = (Class) next;
            if (cls == null) {
                return;
            }
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 5) {
                    Class<?> cls2 = parameterTypes[1];
                    Class cls3 = Boolean.TYPE;
                    if (AbstractC5227.m9466(cls2, cls3) || AbstractC5227.m9466(parameterTypes[1], cls3)) {
                        XposedBridge.hookMethod(constructor, new C6642(this, 14));
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2167);
    }
}
