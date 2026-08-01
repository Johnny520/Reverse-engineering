package p321;

import android.util.Pair;
import androidx.activity.AbstractC0053;
import androidx.compose.material.ripple.RunnableC1107;
import bsh.C2632;
import com.alibaba.fastjson2.InterfaceC2915;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONObject;
import com.bumptech.glide.AbstractC3056;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.util.qq.Hook_cookie;
import lin.xposed.hook.util.qq.QQEnvTool;
import p036.AbstractC6353;
import p331.C8799;
import p336.AbstractC8805;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8722 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9114 f24588 = new C9114(AbstractC3056.m6668(-3937684527397471655L), 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ScheduledExecutorService f24589 = Executors.newSingleThreadScheduledExecutor();

    static {
        AbstractC3056.m6668(-3937683097173362087L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m14398(String str, String str2) {
        String str3 = AbstractC3056.m6668(-3937684493037733287L) + Hook_cookie.getG_TK(AbstractC3056.m6668(-3937656322347238823L));
        StringBuilder sbM149 = AbstractC0053.m149(AbstractC3056.m6668(-3937656275102598567L) + QQEnvTool.getCurrentUin());
        sbM149.append(AbstractC3056.m6668(-3937656266512663975L));
        sbM149.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
        sbM1492.append(AbstractC3056.m6668(-3937656210678089127L));
        sbM1492.append(Hook_cookie.getSkey());
        StringBuilder sbM1493 = AbstractC0053.m149(sbM1492.toString());
        sbM1493.append(AbstractC3056.m6668(-3937656245037827495L));
        sbM1493.append(Hook_cookie.getPskey(AbstractC3056.m6668(-3937656322347238823L)));
        String string = sbM1493.toString();
        HashMap map = new HashMap();
        map.put(AbstractC3056.m6668(-3937684029181265319L), QQEnvTool.getCurrentUin());
        map.put(AbstractC3056.m6668(-3937684054951069095L), str);
        map.put(AbstractC3056.m6668(-3937683947576886695L), str2);
        map.put(AbstractC3056.m6668(-3937684012001396135L), AbstractC3056.m6668(-3937683900332246439L));
        map.put(AbstractC3056.m6668(-3937683883152377255L), AbstractC3056.m6668(-3937656713189262759L));
        map.put(AbstractC3056.m6668(-3937683921807082919L), AbstractC3056.m6668(-3937683814432900519L));
        return InterfaceC2915.m6316(AbstractC6353.m11899(str3, string, map)).getIntValue(AbstractC3056.m6668(-3937589582850426279L)) == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static Pair m14399() {
        String str = AbstractC3056.m6668(-3937683853087606183L) + Hook_cookie.getG_TK(AbstractC3056.m6668(-3937656322347238823L));
        StringBuilder sbM149 = AbstractC0053.m149(AbstractC3056.m6668(-3937656275102598567L) + QQEnvTool.getCurrentUin());
        sbM149.append(AbstractC3056.m6668(-3937656266512663975L));
        sbM149.append(QQEnvTool.getCurrentUin());
        StringBuilder sbM1492 = AbstractC0053.m149(sbM149.toString());
        sbM1492.append(AbstractC3056.m6668(-3937656210678089127L));
        sbM1492.append(Hook_cookie.getSkey());
        StringBuilder sbM1493 = AbstractC0053.m149(sbM1492.toString());
        sbM1493.append(AbstractC3056.m6668(-3937656245037827495L));
        sbM1493.append(Hook_cookie.getPskey(AbstractC3056.m6668(-3937656322347238823L)));
        String string = sbM1493.toString();
        HashMap map = new HashMap();
        map.put(AbstractC3056.m6668(-3937683466540549543L), AbstractC3056.m6668(-3937561652678100391L));
        map.put(AbstractC3056.m6668(-3937683505195255207L), AbstractC3056.m6668(-3937595638754313639L));
        map.put(AbstractC3056.m6668(-3937683921807082919L), AbstractC3056.m6668(-3937683457950614951L));
        JSONObject jSONObjectM6316 = InterfaceC2915.m6316(AbstractC6353.m11899(str, string, map));
        if (jSONObjectM6316.getIntValue(AbstractC3056.m6668(-3937589582850426279L), -1) != 0) {
            throw new RuntimeException(AbstractC3056.m6668(-3937683243202250151L) + jSONObjectM6316);
        }
        JSONArray jSONArray = jSONObjectM6316.getJSONObject(AbstractC3056.m6668(-3937589565670557095L)).getJSONArray(AbstractC3056.m6668(-3937683445065713063L));
        if (jSONArray.isEmpty()) {
            C2632.m5294(AbstractC3056.m6668(-3937683337691530663L));
            return null;
        }
        JSONObject jSONObject = jSONArray.getJSONObject(0).getJSONObject(AbstractC3056.m6668(-3937683367756301735L));
        return new Pair(jSONObject.getString(AbstractC3056.m6668(-3937683286151923111L)), jSONObject.getString(AbstractC3056.m6668(-3937683299036824999L)));
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        this.f24589.scheduleWithFixedDelay(new RunnableC1107(this, 26), 0L, 5L, TimeUnit.MINUTES);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937684553167275431L);
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
