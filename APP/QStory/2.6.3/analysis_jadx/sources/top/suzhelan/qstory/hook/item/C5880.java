package top.suzhelan.qstory.hook.item;

import com.alibaba.fastjson2.AbstractC2905;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰苏哲楪;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5880 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Method declaredMethod = classLoader.loadClass(AbstractC8405.m13972(1931)).getDeclaredMethod(AbstractC8405.m13972(1932), null);
        AbstractC8405.m13972(1933);
        declaredMethod.getClass();
        m11830(declaredMethod, new C5925(6));
        Constructor constructorM6322 = AbstractC2905.m6322(AbstractC6337.m11866(AbstractC8405.m13972(1934)), new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE, AbstractC6337.m11866(AbstractC8405.m13972(1935))});
        AbstractC8405.m13972(1936);
        m11831(constructorM6322, new C5925(7));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1930);
    }
}
