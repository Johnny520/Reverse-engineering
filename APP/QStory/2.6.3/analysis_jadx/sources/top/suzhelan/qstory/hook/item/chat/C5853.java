package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p287.AbstractC8405;
import p392.C9102;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰世哲苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5853 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        int i;
        Object next;
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        try {
            C9102 c9102 = new C9102();
            c9102.f25521.addAll(Arrays.asList(AbstractC8405.m13972(2168)));
            c9102.m14695(AbstractC8405.m13972(2169), AbstractC8405.m13972(2170));
            ArrayList arrayListM14697 = c9102.m14697();
            AbstractC8405.m13972(1824);
            Iterator it = arrayListM14697.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String name = ((Class) next).getName();
                AbstractC8405.m13972(1820);
                if (AbstractC5144.m10176(name, AbstractC8405.m13972(2171), false)) {
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
                    if (AbstractC4395.m8907(cls2, cls3) || AbstractC4395.m8907(parameterTypes[1], cls3)) {
                        XposedBridge.hookMethod(constructor, new C5812(this, 14));
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2167);
    }
}
