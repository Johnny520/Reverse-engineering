package p328;

import androidx.fragment.app.C2358;
import com.bumptech.glide.AbstractC3056;
import p026.AbstractC6293;
import p032.C6316;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子楪兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated(since = "头像圆形和view太难测算 直到找到挂饰的实现方法时再使用")
public class C8783 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> clsLoadClass = classLoader.loadClass("com.tencent.mobileqq.aio.widget.AvatarContainer");
        C6316 c6316M11825 = C6316.m11825("com.tencent.mobileqq.aio.msglist.holder.component.avatar.AIOAvatarContentComponent");
        c6316M11825.f17409.f3616 = clsLoadClass;
        m11802(c6316M11825.m11827(), new C2358(classLoader, 29));
    }
}
