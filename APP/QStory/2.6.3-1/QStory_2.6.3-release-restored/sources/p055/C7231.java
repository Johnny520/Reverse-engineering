package p055;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C2080;
import p035.C7092;
import p049.AbstractC7162;
import p049.C7164;
import p348.C9614;
import p353.AbstractC9632;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7231 extends AbstractC9632 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        try {
            m12389(AbstractC7162.m12409("com.tencent.mobileqq.activity.ChatSettingActivity", "doOnCreate", Boolean.TYPE, new Class[]{Bundle.class}), new C7092(15));
        } catch (Exception unused) {
            C7164 c7164M12412 = C7164.m12412("com.tencent.mobileqq.activity.ChatSettingFragment");
            String strM14531 = "onViewCreated";
            C2080 c2080 = c7164M12412.f17803;
            c2080.f3963 = strM14531;
            c2080.f3962 = Void.TYPE;
            c2080.f3964 = new Class[]{View.class, Bundle.class};
            m12389(c7164M12412.m12414(), new C7092(14));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "主页搜索-游戏消息-聊天界面右上角";
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() >= 1;
    }
}
