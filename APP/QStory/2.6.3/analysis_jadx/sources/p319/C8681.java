package p319;

import androidx.fragment.app.C2358;
import com.bumptech.glide.C3070;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.AbstractC5062;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p144.C7547;
import p287.AbstractC8405;
import p392.C9098;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8681 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f24488;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f24489;

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Method methodM14402 = m14402();
        if (methodM14402 != null) {
            AbstractC5062.m10039(methodM14402, new C2358(methodM14402, 26));
        }
        Method methodM14401 = m14401();
        if (methodM14401 != null) {
            AbstractC5062.m10039(methodM14401, new C7547(14));
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2787);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        m14402();
        m14401();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Method m14401() {
        Method methodM14686;
        Method method = this.f24489;
        if (method != null) {
            return method;
        }
        try {
            C9098 c9098 = new C9098();
            c9098.m14688(AbstractC8405.m13972(2790));
            c9098.m14687(AbstractC8405.m13972(2791));
            methodM14686 = c9098.m14686();
        } catch (Exception unused) {
            methodM14686 = null;
        }
        this.f24489 = methodM14686;
        return methodM14686;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Method m14402() {
        Method methodM14686;
        Method method = this.f24488;
        if (method != null) {
            return method;
        }
        try {
            C9098 c9098 = new C9098();
            c9098.m14688(AbstractC8405.m13972(2788));
            c9098.m14687(AbstractC8405.m13972(2789));
            methodM14686 = c9098.m14686();
        } catch (Exception unused) {
            methodM14686 = null;
        }
        this.f24488 = methodM14686;
        return methodM14686;
    }
}
