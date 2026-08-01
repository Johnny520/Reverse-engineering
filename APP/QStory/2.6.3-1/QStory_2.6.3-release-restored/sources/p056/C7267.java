package p056;

import android.view.View;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import p348.C9614;
import p353.AbstractC9632;
import top.suzhelan.qstory.hook.api.C6646;
import top.suzhelan.qstory.hook.api.C6647;
import top.suzhelan.qstory.hook.api.C6651;
import top.suzhelan.qstory.hook.item.C6743;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7267 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Set f17980;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ExecutorService f17981 = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public HashMap f17982;

    public C7267() {
        "需要检测群.json";
        "警告组.json";
        this.f17982 = new HashMap();
        this.f17980 = new HashSet();
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Set setM1724 = AbstractC1298.m1724("需要检测群.json");
        this.f17980 = setM1724;
        if (setM1724.size() == 0) {
            this.f17980.add("2971017318");
            this.f17980.add("638537273");
        }
        this.f17982 = AbstractC1298.m1722("警告组.json");
        m12537();
        C6743 c6743 = new C6743(this, 2);
        C6651 c6651 = C6647.f16291;
        "hookItem";
        "onMsgListener";
        C6647.f16288.add(new C6646(this, c6743));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "功能已关闭 请勿使用 \n仅供娱乐 使用方法 \n在" + AbstractC1298.m1726() + "需要检测群.json" + "里编辑要开启此功能的群组(按照留下的json格式添加群)\n单击可复制路径 修改完重启QQ生效\n龙图警告次数+1\n猫图警告次数-1\n警告次数3次会执行踢出";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC6365(this);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m12537() {
        AbstractC1298.m1711("警告组.json", this.f17982);
        AbstractC1298.m1703("需要检测群.json", this.f17980);
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return true;
    }
}
