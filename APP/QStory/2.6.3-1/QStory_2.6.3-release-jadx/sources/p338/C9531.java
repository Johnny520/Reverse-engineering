package p338;

import android.view.View;
import androidx.activity.AbstractC0900;
import androidx.compose.material.ripple.RunnableC1945;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.p011qq.Hook_cookie;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p053.AbstractC7199;
import p303.AbstractC9234;
import p348.C9614;
import p353.AbstractC9632;
import p407.C9924;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9531 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24873 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9924 f24874 = new C9924(AbstractC9234.m14532("喵喵呜喵喵喵呜喵~喵喵呜喵呜呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵喵喵"), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24875 = Executors.newSingleThreadScheduledExecutor();

    static {
        AbstractC9234.m14531(1170);
        AbstractC9234.m14531(1193);
        AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵呜喵呜呜喵~呜喵喵喵呜呜喵呜~呜呜喵呜呜喵喵呜~呜呜呜喵呜呜喵喵");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static String m14983(String str, boolean z) {
        String strM14532 = z ? AbstractC9234.m14532("喵呜喵喵喵喵呜喵") : AbstractC9234.m14532("喵呜喵喵喵呜喵呜~喵呜喵喵喵喵喵呜");
        String str2 = AbstractC9234.m14531(1174) + Hook_cookie.getG_TK(AbstractC9234.m14531(946));
        StringBuilder sbM700 = AbstractC0900.m700(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin());
        sbM700.append(AbstractC9234.m14532("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵"));
        sbM700.append(Hook_cookie.getSkey());
        StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
        sbM7002.append(AbstractC9234.m14531(948));
        sbM7002.append(Hook_cookie.getPskey(AbstractC9234.m14531(946)));
        String string = sbM7002.toString();
        HashMap map = new HashMap();
        map.put(AbstractC9234.m14531(1175), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC9234.m14531(1176), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC9234.m14531(1177), "");
        map.put(AbstractC9234.m14531(1178), "");
        map.put(AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵喵呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵呜呜喵呜"), "");
        map.put(AbstractC9234.m14531(1179), "");
        map.put(AbstractC9234.m14531(1180), "");
        map.put(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵"), str);
        map.put(AbstractC9234.m14531(1181), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜喵喵喵"), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC9234.m14531(1182), strM14532);
        map.put(AbstractC9234.m14532("喵喵喵喵喵呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜喵喵呜喵呜~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜呜"), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"), QQEnvTool.getCurrentUin());
        map.put(AbstractC9234.m14531(1183), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵"));
        map.put(AbstractC9234.m14531(1184), AbstractC9234.m14531(1185) + QQEnvTool.getCurrentUin() + AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵喵呜呜喵喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜"));
        return AbstractC7199.m12506(str2, string, map);
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        this.f24875.scheduleWithFixedDelay(new RunnableC1945(this, 28), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1172);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 23);
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
