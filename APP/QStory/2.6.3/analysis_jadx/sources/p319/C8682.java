package p319;

import com.bumptech.glide.C3070;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p010.C6184;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p144.C7547;
import p287.AbstractC8405;
import p392.C9098;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8682 extends AbstractC6311 implements InterfaceC6317 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m14403() {
        C9098 c9098 = new C9098();
        c9098.m14688(AbstractC8405.m13972(2783));
        c9098.m14687(AbstractC8405.m13972(2784), AbstractC8405.m13972(2785));
        return c9098.m14686();
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        Method methodM14403 = m14403();
        if (methodM14403 != null) {
            XposedBridge.hookMethod(methodM14403, new C6184(new C7547(13)));
        } else {
            C5925.m11311(AbstractC8405.m13972(1413));
        }
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        m14403();
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
    }
}
