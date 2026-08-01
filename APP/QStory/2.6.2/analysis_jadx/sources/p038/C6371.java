package p038;

import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import java.lang.reflect.Method;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6371 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17506;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC3056.m6668(-3937583368032748967L));
        Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC3056.m6668(-3937583097449809319L));
        C6316 c6316M11826 = C6316.m11826(clsLoadClass);
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3618 = new Class[]{clsLoadClass2};
        c1245.f3616 = Void.TYPE;
        m11803(c6316M11826.m11827(), new C2358(this, 17));
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        this.f17506 = c3069.m6902(AbstractC3056.m6668(-3937582904176280999L));
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        for (Method method : C3069.m6899(AbstractC3056.m6668(-3937582904176280999L))) {
            if (method.getDeclaringClass().getName().equals(AbstractC3056.m6668(-3937583368032748967L))) {
                this.f17506 = method;
                c3069.m6900(this.f17506, AbstractC3056.m6668(-3937582904176280999L));
                return;
            }
        }
    }
}
