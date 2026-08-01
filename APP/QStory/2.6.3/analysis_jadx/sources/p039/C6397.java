package p039;

import androidx.compose.runtime.internal.C1245;
import androidx.fragment.app.C2358;
import com.bumptech.glide.C3070;
import java.lang.reflect.Method;
import lin.xposed.BuildConfig;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6397 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17560;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(261));
        Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC8405.m13972(262));
        C6335 c6335M11854 = C6335.m11854(clsLoadClass);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3619 = new Class[]{clsLoadClass2};
        c1245.f3617 = Void.TYPE;
        m11831(c6335M11854.m11855(), new C2358(this, 17));
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        this.f17560 = c3070.m6889(AbstractC8405.m13972(BuildConfig.VERSION_CODE));
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        for (Method method : C3070.m6886(AbstractC8405.m13972(BuildConfig.VERSION_CODE))) {
            if (method.getDeclaringClass().getName().equals(AbstractC8405.m13972(261))) {
                this.f17560 = method;
                c3070.m6887(this.f17560, AbstractC8405.m13972(BuildConfig.VERSION_CODE));
                return;
            }
        }
    }
}
