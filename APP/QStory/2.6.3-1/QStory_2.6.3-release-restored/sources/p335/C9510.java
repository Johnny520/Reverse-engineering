package p335;

import androidx.fragment.app.C3191;
import com.bumptech.glide.C3902;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.AbstractC5894;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p160.C8376;
import p408.C9927;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世兰哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C9510 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Method f24833;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Method f24834;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        Method methodM14961 = m14961();
        if (methodM14961 != null) {
            AbstractC5894.m10598(methodM14961, new C3191(methodM14961, 26));
        }
        Method methodM14960 = m14960();
        if (methodM14960 != null) {
            AbstractC5894.m10598(methodM14960, new C8376(14));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "隐藏聊天输入框上方快捷栏展示的群应用";
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        "finder";
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        "finder";
        m14961();
        m14960();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Method m14960() {
        Method methodM15245;
        Method method = this.f24834;
        if (method != null) {
            return method;
        }
        try {
            C9927 c9927 = new C9927();
            c9927.m15247("com.tencent.mobileqq.activity.aio.helper");
            c9927.m15246("isShortcutBarVisibleOrGoingToBeVisible return false for AIOIceBreakViewShowing");
            methodM15245 = c9927.m15245();
        } catch (Exception unused) {
            methodM15245 = null;
        }
        this.f24834 = methodM15245;
        return methodM15245;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Method m14961() {
        Method methodM15245;
        Method method = this.f24833;
        if (method != null) {
            return method;
        }
        try {
            C9927 c9927 = new C9927();
            c9927.m15247("com.tencent.mobileqq.troop.shortcut.aio");
            c9927.m15246(",isShowingCustomShortcut:");
            methodM15245 = c9927.m15245();
        } catch (Exception unused) {
            methodM15245 = null;
        }
        this.f24833 = methodM15245;
        return methodM15245;
    }
}
