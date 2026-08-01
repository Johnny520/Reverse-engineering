package p352;

import p042.AbstractC7140;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "头像圆形和view太难测算 直到找到挂饰的实现方法时再使用")
public class C9625 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC9234.m14531(1149));
        C7164 c7164M12412 = C7164.m12412(AbstractC9234.m14531(1150));
        c7164M12412.f17803.f3962 = clsLoadClass;
        m12389(c7164M12412.m12414(), new C9629(classLoader));
    }
}
