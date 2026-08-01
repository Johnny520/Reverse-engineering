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
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲楪子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"L飘花落叶言苏世兰哲楪子/飘花落叶言子楪苏世哲兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8715 extends AbstractC6293 implements InterfaceC6152 {
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Method m14392() {
        C9127 c9127 = new C9127();
        c9127.m14689("com.tencent.mobileqq.notification.modularize");
        c9127.m14688("TianShuOfflineMsgCenter", "deal0x135Msg online:");
        return c9127.m14693();
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Method methodM14392 = m14392();
        if (methodM14392 != null) {
            XposedBridge.hookMethod(methodM14392, new C6153(new C7546(15)));
        } else {
            C5919.m11250("Check failed.");
        }
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) {
        m14392();
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
    }
}
