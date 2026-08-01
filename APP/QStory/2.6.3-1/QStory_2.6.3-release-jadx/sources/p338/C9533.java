package p338;

import android.util.Pair;
import androidx.activity.AbstractC0900;
import androidx.compose.material.ripple.RunnableC1945;
import bsh.C3466;
import com.alibaba.fastjson2.InterfaceC3749;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
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

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9533 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9924 f24878 = new C9924(AbstractC9234.m14532("喵喵呜喵喵喵呜喵~喵喵呜喵呜呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵喵喵"), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24879 = Executors.newSingleThreadScheduledExecutor();

    static {
        AbstractC9234.m14531(1170);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m14984(String str, String str2) {
        String str3 = AbstractC9234.m14531(1158) + Hook_cookie.getG_TK(AbstractC9234.m14531(946));
        StringBuilder sbM700 = AbstractC0900.m700(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin());
        sbM700.append(AbstractC9234.m14531(947));
        sbM700.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
        sbM7002.append(AbstractC9234.m14532("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵"));
        sbM7002.append(Hook_cookie.getSkey());
        StringBuilder sbM7003 = AbstractC0900.m700(sbM7002.toString());
        sbM7003.append(AbstractC9234.m14531(948));
        sbM7003.append(Hook_cookie.getPskey(AbstractC9234.m14531(946)));
        String string = sbM7003.toString();
        HashMap map = new HashMap();
        map.put(AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜"), QQEnvTool.getCurrentUin());
        map.put(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜"), str);
        map.put(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜"), str2);
        map.put(AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵喵喵呜"), AbstractC9234.m14532("喵呜喵喵喵喵喵喵~喵呜喵喵喵呜喵喵~喵呜喵喵呜喵呜呜"));
        map.put(AbstractC9234.m14531(1159), AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜"));
        map.put(AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC9234.m14531(1160));
        return InterfaceC3749.m6934(AbstractC7199.m12506(str3, string, map)).getIntValue(AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵")) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Pair m14985() {
        String str = AbstractC9234.m14531(1161) + Hook_cookie.getG_TK(AbstractC9234.m14531(946));
        StringBuilder sbM700 = AbstractC0900.m700(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin());
        sbM700.append(AbstractC9234.m14531(947));
        sbM700.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM7002 = AbstractC0900.m700(sbM700.toString());
        sbM7002.append(AbstractC9234.m14532("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵"));
        sbM7002.append(Hook_cookie.getSkey());
        StringBuilder sbM7003 = AbstractC0900.m700(sbM7002.toString());
        sbM7003.append(AbstractC9234.m14531(948));
        sbM7003.append(Hook_cookie.getPskey(AbstractC9234.m14531(946)));
        String string = sbM7003.toString();
        HashMap map = new HashMap();
        map.put(AbstractC9234.m14531(1162), AbstractC9234.m14532("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC9234.m14531(1163), AbstractC9234.m14532("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC9234.m14532("喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵"));
        JSONObject jSONObjectM6934 = InterfaceC3749.m6934(AbstractC7199.m12506(str, string, map));
        if (jSONObjectM6934.getIntValue(AbstractC9234.m14532("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), -1) != 0) {
            throw new RuntimeException(AbstractC9234.m14531(1167) + jSONObjectM6934);
        }
        JSONArray jSONArray = jSONObjectM6934.getJSONObject(AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜")).getJSONArray(AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵呜呜喵喵呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵呜呜呜呜呜"));
        if (jSONArray.isEmpty()) {
            C3466.m5899(AbstractC9234.m14531(1164));
            return null;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0).getJSONObject(AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜"));
        return new Pair(jSONObject.getString(AbstractC9234.m14531(1165)), jSONObject.getString(AbstractC9234.m14531(1166)));
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        this.f24879.scheduleWithFixedDelay(new RunnableC1945(this, 27), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(1157);
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
