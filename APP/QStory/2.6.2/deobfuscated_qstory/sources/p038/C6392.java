package p038;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import p022.C6267;
import p032.AbstractC6314;
import p032.C6316;
import p331.C8799;
import p336.AbstractC8805;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6392 extends AbstractC8805 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        try {
            m11802(AbstractC6314.m11822("com.tencent.mobileqq.activity.ChatSettingActivity", "doOnCreate", Boolean.TYPE, new Class[]{Bundle.class}), new C6267(15));
        } catch (Exception unused) {
            C6316 c6316M11825 = C6316.m11825("com.tencent.mobileqq.activity.ChatSettingFragment");
            String strM6668 = "onViewCreated";
            C1245 c1245 = c6316M11825.f17409;
            c1245.f3617 = strM6668;
            c1245.f3616 = Void.TYPE;
            c1245.f3618 = new Class[]{View.class, Bundle.class};
            m11802(c6316M11825.m11827(), new C6267(14));
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u4e3b\u9875\u641c\u7d22-\u6e38\u620f\u6d88\u606f-\u804a\u5929\u754c\u9762\u53f3\u4e0a\u89d2";
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() >= 1;
    }
}
