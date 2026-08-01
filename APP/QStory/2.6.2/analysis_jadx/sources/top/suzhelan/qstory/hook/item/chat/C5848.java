package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p394.C9131;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰世哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5848 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        int i;
        Object next;
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        try {
            C9131 c9131 = new C9131();
            c9131.f25544.addAll(Arrays.asList(AbstractC3056.m6668(-3937786623065064871L)));
            c9131.m14699(AbstractC3056.m6668(-3937786610180162983L), AbstractC3056.m6668(-3937786511395915175L));
            ArrayList arrayListM14700 = c9131.m14700();
            AbstractC3056.m6668(-3937741495843685799L);
            Iterator it = arrayListM14700.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String name = ((Class) next).getName();
                AbstractC3056.m6668(-3937741817966232999L);
                if (AbstractC5143.m10171(name, AbstractC3056.m6668(-3937786429791536551L), false)) {
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
                    if (AbstractC4394.m8917(cls2, cls3) || AbstractC4394.m8917(parameterTypes[1], cls3)) {
                        XposedBridge.hookMethod(constructor, new C5811(this, 14));
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937786786273822119L);
    }
}
