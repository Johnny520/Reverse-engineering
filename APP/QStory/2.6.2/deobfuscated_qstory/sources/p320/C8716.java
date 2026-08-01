package p320;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p009.InterfaceC6152;
import p010.C6153;
import p026.AbstractC6293;
import p144.C7546;
import p394.C9127;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"L飘花落叶言苏世兰哲楪子/飘花落叶言子楪苏哲世兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8716 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f24580;

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        Method methodM14393 = m14393();
        if (methodM14393 != null) {
            XposedBridge.hookMethod(methodM14393, new C6153(new C7546(17)));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u79fb\u9664\u7fa4\u804a\u9876\u90e8\u7684\u98ce\u9669\u63d0\u9192\u6a2a\u5e45";
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        "finder";
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        "finder";
        m14393();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Method m14393() {
        Method methodM14693;
        Method method = this.f24580;
        if (method != null) {
            return method;
        }
        try {
            C9127 c9127 = new C9127();
            c9127.m14689("com.tencent.mobileqq.troop.tipsbar");
            c9127.m14688("[doOnCreate]", "TroopSecurityTipsBar");
            methodM14693 = c9127.m14693();
        } catch (Exception unused) {
            methodM14693 = null;
        }
        this.f24580 = methodM14693;
        return methodM14693;
    }
}
