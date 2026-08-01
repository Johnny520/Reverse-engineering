package p336;

import p026.AbstractC6311;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "头像圆形和view太难测算 直到找到挂饰的实现方法时再使用")
public class C8796 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(1149));
        C6335 c6335M11853 = C6335.m11853(AbstractC8405.m13972(1150));
        c6335M11853.f17458.f3617 = clsLoadClass;
        m11830(c6335M11853.m11855(), new C8800(classLoader));
    }
}
