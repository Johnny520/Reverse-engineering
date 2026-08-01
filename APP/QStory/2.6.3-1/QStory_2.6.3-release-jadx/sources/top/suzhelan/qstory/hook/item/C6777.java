package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.C3902;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p303.AbstractC9234;
import p405.AbstractC9919;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲世楪兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6777 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f16485;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        Method method = this.f16485;
        if (method != null) {
            m12390(method, new C6755(11));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2045);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        Method method;
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        Class clsM15228 = AbstractC9919.m15228(AbstractC9234.m14531(2044));
        clsM15228.getClass();
        Method[] declaredMethods = clsM15228.getDeclaredMethods();
        AbstractC9234.m14531(1555);
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            boolean zM9466 = AbstractC5227.m9466(method.getReturnType(), Void.TYPE);
            boolean zIsPublic = Modifier.isPublic(method.getModifiers());
            Class<?>[] parameterTypes = method.getParameterTypes();
            boolean z = parameterTypes.length == 2;
            boolean zM94662 = AbstractC5227.m9466(AbstractC5179.m9383(1, parameterTypes), Long.TYPE);
            Class cls = (Class) AbstractC5179.m9383(0, parameterTypes);
            boolean zIsPrimitive = cls != null ? cls.isPrimitive() : true;
            if (zM9466 && zIsPublic && z && zM94662 && zIsPrimitive) {
                break;
            } else {
                i++;
            }
        }
        this.f16485 = method;
    }
}
