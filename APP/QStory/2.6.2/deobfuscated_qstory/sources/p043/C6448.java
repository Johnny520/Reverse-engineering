package p043;

import android.view.View;
import com.bumptech.glide.AbstractC3056;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.reflect.jvm.internal.AbstractC5061;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import p331.C8799;
import p336.AbstractC8805;
import top.suzhelan.qstory.hook.api.C5815;
import top.suzhelan.qstory.hook.api.C5816;
import top.suzhelan.qstory.hook.api.C5820;
import top.suzhelan.qstory.hook.item.C5907;

/* JADX INFO: renamed from: 飘花落叶言世哲苏楪兰子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6448 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Set f17683;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f17684 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public HashMap f17685;

    public C6448() {
        "\u9700\u8981\u68c0\u6d4b\u7fa4.json";
        "\u8b66\u544a\u7ec4.json";
        this.f17685 = new HashMap();
        this.f17683 = new HashSet();
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Set setM10020 = AbstractC5061.m10020("\u9700\u8981\u68c0\u6d4b\u7fa4.json");
        this.f17683 = setM10020;
        if (setM10020.size() == 0) {
            this.f17683.add("2971017318");
            this.f17683.add("638537273");
        }
        this.f17685 = AbstractC5061.m10023("\u8b66\u544a\u7ec4.json");
        m11940();
        C5907 c5907 = new C5907(this, 2);
        C5820 c5820 = C5816.f15946;
        "hookItem";
        "onMsgListener";
        C5816.f15943.add(new C5815(this, c5907));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u529f\u80fd\u5df2\u5173\u95ed \u8bf7\u52ff\u4f7f\u7528 \n\u4ec5\u4f9b\u5a31\u4e50 \u4f7f\u7528\u65b9\u6cd5 \n\u5728" + AbstractC5061.m10021() + "\u9700\u8981\u68c0\u6d4b\u7fa4.json" + "\u91cc\u7f16\u8f91\u8981\u5f00\u542f\u6b64\u529f\u80fd\u7684\u7fa4\u7ec4(\u6309\u7167\u7559\u4e0b\u7684json\u683c\u5f0f\u6dfb\u52a0\u7fa4)\n\u5355\u51fb\u53ef\u590d\u5236\u8def\u5f84 \u4fee\u6539\u5b8c\u91cd\u542fQQ\u751f\u6548\n\u9f99\u56fe\u8b66\u544a\u6b21\u6570+1\n\u732b\u56fe\u8b66\u544a\u6b21\u6570-1\n\u8b66\u544a\u6b21\u65703\u6b21\u4f1a\u6267\u884c\u8e22\u51fa";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC5532(this);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11940() {
        AbstractC5061.m10015("\u8b66\u544a\u7ec4.json", this.f17685);
        AbstractC5061.m10014("\u9700\u8981\u68c0\u6d4b\u7fa4.json", this.f17683);
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return true;
    }
}
