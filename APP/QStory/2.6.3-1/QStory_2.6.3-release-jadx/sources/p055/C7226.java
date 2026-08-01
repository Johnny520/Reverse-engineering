package p055;

import androidx.compose.runtime.internal.C2080;
import androidx.fragment.app.C3191;
import com.bumptech.glide.C3902;
import java.lang.reflect.Method;
import lin.xposed.BuildConfig;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p049.C7164;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7226 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f17905;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC9234.m14531(261));
        Class<?> clsLoadClass2 = classLoader.loadClass(AbstractC9234.m14531(262));
        C7164 c7164M12413 = C7164.m12413(clsLoadClass);
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3964 = new Class[]{clsLoadClass2};
        c2080.f3962 = Void.TYPE;
        m12390(c7164M12413.m12414(), new C3191(this, 17));
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        this.f17905 = c3902.m7449(AbstractC9234.m14531(BuildConfig.VERSION_CODE));
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        for (Method method : C3902.m7446(AbstractC9234.m14531(BuildConfig.VERSION_CODE))) {
            if (method.getDeclaringClass().getName().equals(AbstractC9234.m14531(261))) {
                this.f17905 = method;
                c3902.m7447(this.f17905, AbstractC9234.m14531(BuildConfig.VERSION_CODE));
                return;
            }
        }
    }
}
