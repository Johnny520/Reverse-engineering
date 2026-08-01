package p322;

import android.util.Pair;
import androidx.activity.AbstractC0053;
import androidx.compose.material.ripple.RunnableC1107;
import bsh.C2633;
import com.alibaba.fastjson2.InterfaceC2916;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
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

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8704 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9095 f24533 = new C9095(AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵呜呜呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵喵喵"), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24534 = Executors.newSingleThreadScheduledExecutor();

    static {
        AbstractC8405.m13972(1170);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m14425(String str, String str2) {
        String str3 = AbstractC8405.m13972(1158) + Hook_cookie.getG_TK(AbstractC8405.m13972(946));
        StringBuilder sbM140 = AbstractC0053.m140(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin());
        sbM140.append(AbstractC8405.m13972(947));
        sbM140.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM1402 = AbstractC0053.m140(sbM140.toString());
        sbM1402.append(AbstractC8405.m13973("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵"));
        sbM1402.append(Hook_cookie.getSkey());
        StringBuilder sbM1403 = AbstractC0053.m140(sbM1402.toString());
        sbM1403.append(AbstractC8405.m13972(948));
        sbM1403.append(Hook_cookie.getPskey(AbstractC8405.m13972(946)));
        String string = sbM1403.toString();
        HashMap map = new HashMap();
        map.put(AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜"), QQEnvTool.getCurrentUin());
        map.put(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵喵呜呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜"), str);
        map.put(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜"), str2);
        map.put(AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜喵呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵喵喵呜"), AbstractC8405.m13973("喵呜喵喵喵喵喵喵~喵呜喵喵喵呜喵喵~喵呜喵喵呜喵呜呜"));
        map.put(AbstractC8405.m13972(1159), AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜呜喵呜"));
        map.put(AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC8405.m13972(1160));
        return InterfaceC2916.m6374(AbstractC6370.m11947(str3, string, map)).getIntValue(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵")) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Pair m14426() {
        String str = AbstractC8405.m13972(1161) + Hook_cookie.getG_TK(AbstractC8405.m13972(946));
        StringBuilder sbM140 = AbstractC0053.m140(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵呜喵") + QQEnvTool.getCurrentUin());
        sbM140.append(AbstractC8405.m13972(947));
        sbM140.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM1402 = AbstractC0053.m140(sbM140.toString());
        sbM1402.append(AbstractC8405.m13973("喵呜喵喵呜喵喵喵~喵呜喵呜喵呜喵呜~喵喵喵喵呜喵喵呜~喵喵喵喵喵喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵呜~喵呜喵呜呜呜喵喵"));
        sbM1402.append(Hook_cookie.getSkey());
        StringBuilder sbM1403 = AbstractC0053.m140(sbM1402.toString());
        sbM1403.append(AbstractC8405.m13972(948));
        sbM1403.append(Hook_cookie.getPskey(AbstractC8405.m13972(946)));
        String string = sbM1403.toString();
        HashMap map = new HashMap();
        map.put(AbstractC8405.m13972(1162), AbstractC8405.m13973("喵呜喵喵喵喵呜呜"));
        map.put(AbstractC8405.m13972(1163), AbstractC8405.m13973("喵呜喵喵喵喵呜喵"));
        map.put(AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵喵喵"), AbstractC8405.m13973("喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵"));
        JSONObject jSONObjectM6374 = InterfaceC2916.m6374(AbstractC6370.m11947(str, string, map));
        if (jSONObjectM6374.getIntValue(AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), -1) != 0) {
            throw new RuntimeException(AbstractC8405.m13972(1167) + jSONObjectM6374);
        }
        JSONArray jSONArray = jSONObjectM6374.getJSONObject(AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜喵喵呜")).getJSONArray(AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵呜呜喵喵呜呜~喵喵喵呜呜呜呜呜~喵喵喵喵呜呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵呜呜呜呜呜"));
        if (jSONArray.isEmpty()) {
            C2633.m5339(AbstractC8405.m13972(1164));
            return null;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0).getJSONObject(AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜喵呜"));
        return new Pair(jSONObject.getString(AbstractC8405.m13972(1165)), jSONObject.getString(AbstractC8405.m13972(1166)));
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        this.f24534.scheduleWithFixedDelay(new RunnableC1107(this, 27), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1157);
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
