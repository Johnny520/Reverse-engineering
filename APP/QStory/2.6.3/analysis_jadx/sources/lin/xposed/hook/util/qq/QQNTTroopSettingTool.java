package lin.xposed.hook.util.qq;

import androidx.compose.runtime.internal.C1245;
import p010.AbstractC6188;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTTroopSettingTool {
    public static void quitGroup(String str) {
        try {
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6337.m11866(AbstractC8405.m13972(975)));
            C6335 c6335M11854 = C6335.m11854(qRouteApi.getClass());
            String strM13972 = AbstractC8405.m13972(976);
            C1245 c1245 = c6335M11854.f17458;
            c1245.f3618 = strM13972;
            c1245.f3619 = new Class[]{String.class, Boolean.TYPE, Object.class, String.class, Object.class};
            c1245.f3617 = Void.TYPE;
            c6335M11854.m11856(qRouteApi, str, Boolean.FALSE, null, AbstractC8405.m13972(977), null);
        } catch (Exception e) {
            String strM139722 = AbstractC8405.m13972(976);
            String str2 = AbstractC6188.f17016;
            AbstractC6188.m11605(strM139722, e.toString(), e, true);
        }
    }
}
