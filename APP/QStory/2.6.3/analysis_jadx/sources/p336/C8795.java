package p336;

import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.C3070;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p144.C7547;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8795 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f24762;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f24763;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC6358.f17508 < 6368) {
            C7547 c7547 = new C7547(29);
            Method method = this.f24762;
            if (method != null) {
                m11831(method, c7547);
            }
            Method method2 = this.f24763;
            if (method2 != null) {
                m11831(method2, c7547);
                return;
            }
            return;
        }
        for (Constructor<?> constructor : classLoader.loadClass(AbstractC8405.m13972(1120)).getDeclaredConstructors()) {
            m11831(constructor, new C7547(27));
        }
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(1121));
        Class cls = Integer.TYPE;
        m11831(AbstractC2905.m6322(clsM11866, new Class[]{String.class, cls, Boolean.TYPE, cls}), new C7547(28));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1119);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        this.f24762 = c3070.m6889(AbstractC8405.m13972(1124));
        this.f24763 = c3070.m6889(AbstractC8405.m13972(1126));
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        for (Method method : C3070.m6886(AbstractC8405.m13972(1122))) {
            String name = method.getDeclaringClass().getName();
            if (name.startsWith(AbstractC8405.m13972(1123))) {
                c3070.m6887(method, AbstractC8405.m13972(1124));
            }
            if (name.startsWith(AbstractC8405.m13972(1125))) {
                c3070.m6887(method, AbstractC8405.m13972(1126));
            }
        }
    }
}
