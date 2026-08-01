package p320;

import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.AbstractC5061;
import net.bytebuddy.description.method.MethodDescription;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p144.C7546;
import p394.C9127;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"L飘花落叶言苏世兰哲楪子/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8714 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f24578;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f24579;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        Method methodM14391 = m14391();
        if (methodM14391 != null) {
            AbstractC5061.m10019(methodM14391, new C2358(methodM14391, 26));
        }
        Method methodM14390 = m14390();
        if (methodM14390 != null) {
            AbstractC5061.m10019(methodM14390, new C7546(16));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937827975010190759L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        AbstractC3056.m6668(-3937729770582967719L);
        m14391();
        m14390();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Method m14390() {
        Method methodM14693;
        Method method = this.f24579;
        if (method != null) {
            return method;
        }
        try {
            C9127 c9127 = new C9127();
            c9127.m14689(AbstractC3056.m6668(-3937827618527905191L));
            c9127.m14688(AbstractC3056.m6668(-3937827416664442279L));
            methodM14693 = c9127.m14693();
        } catch (Exception unused) {
            methodM14693 = null;
        }
        this.f24579 = methodM14693;
        return methodM14693;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Method m14391() {
        Method methodM14693;
        Method method = this.f24578;
        if (method != null) {
            return method;
        }
        try {
            C9127 c9127 = new C9127();
            c9127.m14689(AbstractC3056.m6668(-3937827884815877543L));
            c9127.m14688(AbstractC3056.m6668(-3937827644297708967L));
            methodM14693 = c9127.m14693();
        } catch (Exception unused) {
            methodM14693 = null;
        }
        this.f24578 = methodM14693;
        return methodM14693;
    }
}
