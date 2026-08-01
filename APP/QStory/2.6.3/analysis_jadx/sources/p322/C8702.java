package p322;

import android.view.View;
import androidx.activity.AbstractC0053;
import androidx.compose.material.ripple.RunnableC1107;
import com.google.android.material.textfield.ViewOnClickListenerC3183;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p037.AbstractC6370;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;
import p391.C9095;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8702 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24528 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9095 f24529 = new C9095(AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵呜呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵喵喵"), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24530 = Executors.newSingleThreadScheduledExecutor();

    static {
        AbstractC8405.m13972(1170);
        AbstractC8405.m13972(1193);
        AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵呜喵呜呜喵~呜喵喵喵呜呜喵呜~呜呜喵呜呜喵喵呜~呜呜呜喵呜呜喵喵");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m14424(String str, boolean z) {
        String strM13973 = z ? AbstractC8405.m13973("喵呜喵喵喵喵呜喵") : AbstractC8405.m13973("喵呜喵喵喵呜喵呜~喵呜喵喵喵喵喵呜");
        String str2 = AbstractC8405.m13972(1174) + Hook_cookie.getG_TK(AbstractC8405.m13972(946));
        StringBuilder sbM140 = AbstractC0053.m140(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin());
        sbM140.append(AbstractC8405.m13973("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵"));
        sbM140.append(Hook_cookie.getSkey());
        StringBuilder sbM1402 = AbstractC0053.m140(sbM140.toString());
        sbM1402.append(AbstractC8405.m13972(948));
        sbM1402.append(Hook_cookie.getPskey(AbstractC8405.m13972(946)));
        String string = sbM1402.toString();
        HashMap map = new HashMap();
        map.put(AbstractC8405.m13972(1175), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC8405.m13972(1176), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC8405.m13972(1177), "");
        map.put(AbstractC8405.m13972(1178), "");
        map.put(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜呜喵呜"), "");
        map.put(AbstractC8405.m13972(1179), "");
        map.put(AbstractC8405.m13972(1180), "");
        map.put(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵"), str);
        map.put(AbstractC8405.m13972(1181), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵"), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC8405.m13972(1182), strM13973);
        map.put(AbstractC8405.m13973("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜喵喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜呜"), AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"), QQEnvTool.getCurrentUin());
        map.put(AbstractC8405.m13972(1183), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵"));
        map.put(AbstractC8405.m13972(1184), AbstractC8405.m13972(1185) + QQEnvTool.getCurrentUin() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜"));
        return AbstractC6370.m11947(str2, string, map);
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        this.f24530.scheduleWithFixedDelay(new RunnableC1107(this, 28), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1172);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC3183(this, 23);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() >= 1;
    }
}
