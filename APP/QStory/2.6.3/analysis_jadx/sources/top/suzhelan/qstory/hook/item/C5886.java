package top.suzhelan.qstory.hook.item;

import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p287.AbstractC8405;
import p337.AbstractC8804;
import p389.C9092;
import top.sacz.xphelper.util.DexMethodDescriptor;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲苏兰楪;", "L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5886 extends AbstractC8804 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16063 = AbstractC8405.m13972(1888);

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        String strM13972 = AbstractC8405.m13972(1890);
        int i = C9092.f25480;
        Method methodInstance = new DexMethodDescriptor(strM13972).getMethodInstance(classLoader);
        methodInstance.setAccessible(true);
        m11830(methodInstance, new C5925(1));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1889);
    }

    @Override // p337.AbstractC8804
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters and from getter */
    public final String getF16063() {
        return this.f16063;
    }
}
