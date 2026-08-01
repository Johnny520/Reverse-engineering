package top.suzhelan.qstory.hook.item;

import com.alibaba.fastjson2.AbstractC3738;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰苏哲楪;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6710 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        Method declaredMethod = classLoader.loadClass(AbstractC9234.m14531(1931)).getDeclaredMethod(AbstractC9234.m14531(1932), null);
        AbstractC9234.m14531(1933);
        declaredMethod.getClass();
        m12389(declaredMethod, new C6755(6));
        Constructor constructorM6882 = AbstractC3738.m6882(AbstractC7166.m12425(AbstractC9234.m14531(1934)), new Class[]{Long.TYPE, String.class, String.class, Boolean.TYPE, AbstractC7166.m12425(AbstractC9234.m14531(1935))});
        AbstractC9234.m14531(1936);
        m12390(constructorM6882, new C6755(7));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1930);
    }
}
