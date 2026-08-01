package p328;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import p000.AbstractC6087;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p035.AbstractC6340;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8780 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f24723;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f24724;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        if (AbstractC6340.f17461 < 6368) {
            C7546 c7546 = new C7546(24);
            Method method = this.f24723;
            if (method != null) {
                m11803(method, c7546);
            }
            Method method2 = this.f24724;
            if (method2 != null) {
                m11803(method2, c7546);
                return;
            }
            return;
        }
        for (Constructor<?> constructor : classLoader.loadClass(AbstractC3056.m6668(-3937674545893475751L)).getDeclaredConstructors()) {
            m11803(constructor, new C7546(22));
        }
        Class clsM11838 = AbstractC6318.m11838(AbstractC3056.m6668(-3937674275310536103L));
        Class cls = Integer.TYPE;
        m11803(AbstractC6087.m11403(clsM11838, new Class[]{String.class, cls, Boolean.TYPE, cls}), new C7546(23));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937674683332429223L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        this.f24723 = c3069.m6902(AbstractC3056.m6668(-3937673884468512167L));
        this.f24724 = c3069.m6902(AbstractC3056.m6668(-3937673622475507111L));
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        for (Method method : C3069.m6899(AbstractC3056.m6668(-3937674180821255591L))) {
            String name = method.getDeclaringClass().getName();
            if (name.startsWith(AbstractC3056.m6668(-3937674086331975079L))) {
                c3069.m6900(method, AbstractC3056.m6668(-3937673884468512167L));
            }
            if (name.startsWith(AbstractC3056.m6668(-3937673832928904615L))) {
                c3069.m6900(method, AbstractC3056.m6668(-3937673622475507111L));
            }
        }
    }
}
