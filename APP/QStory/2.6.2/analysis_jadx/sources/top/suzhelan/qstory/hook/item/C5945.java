package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p392.AbstractC9121;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲楪兰世;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5945 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f16134;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        Method method = this.f16134;
        if (method != null) {
            m11803(method, new C5919(11));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937767720913995175L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        Method method;
        AbstractC3056.m6668(-3937729770582967719L);
        Class clsM14657 = AbstractC9121.m14657(AbstractC3056.m6668(-3937768124640920999L));
        clsM14657.getClass();
        Method[] declaredMethods = clsM14657.getDeclaredMethods();
        AbstractC3056.m6668(-3937714304405734823L);
        declaredMethods.getClass();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            boolean zM8917 = AbstractC4394.m8917(method.getReturnType(), Void.TYPE);
            boolean zIsPublic = Modifier.isPublic(method.getModifiers());
            Class<?>[] parameterTypes = method.getParameterTypes();
            boolean z = parameterTypes.length == 2;
            boolean zM89172 = AbstractC4394.m8917(AbstractC4346.m8845(1, parameterTypes), Long.TYPE);
            Class cls = (Class) AbstractC4346.m8845(0, parameterTypes);
            boolean zIsPrimitive = cls != null ? cls.isPrimitive() : true;
            if (zM8917 && zIsPublic && z && zM89172 && zIsPrimitive) {
                break;
            } else {
                i++;
            }
        }
        this.f16134 = method;
    }
}
