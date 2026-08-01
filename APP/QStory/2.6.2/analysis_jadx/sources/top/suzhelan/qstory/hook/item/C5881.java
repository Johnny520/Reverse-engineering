package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p336.AbstractC8806;
import p392.C9125;
import top.sacz.xphelper.util.DexMethodDescriptor;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲苏兰楪;", "L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5881 extends AbstractC8806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16054 = AbstractC3056.m6668(-3937750004173899175L);

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        String strM6668 = AbstractC3056.m6668(-3937749862439978407L);
        int i = C9125.f25503;
        Method methodInstance = new DexMethodDescriptor(strM6668).getMethodInstance(classLoader);
        methodInstance.setAccessible(true);
        m11802(methodInstance, new C5919(1));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937750047123572135L);
    }

    @Override // p336.AbstractC8806
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters and from getter */
    public final String getF16054() {
        return this.f16054;
    }
}
