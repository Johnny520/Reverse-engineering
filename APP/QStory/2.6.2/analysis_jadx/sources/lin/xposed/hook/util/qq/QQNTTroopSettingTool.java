package lin.xposed.hook.util.qq;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import p010.AbstractC6157;
import p032.AbstractC6318;
import p032.C6316;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTTroopSettingTool {
    public static void quitGroup(String str) {
        try {
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC6318.m11838(AbstractC3056.m6668(-3937653161251308967L)));
            C6316 c6316M11826 = C6316.m11826(qRouteApi.getClass());
            String strM6668 = AbstractC3056.m6668(-3937652980862682535L);
            C1245 c1245 = c6316M11826.f17409;
            c1245.f3617 = strM6668;
            c1245.f3618 = new Class[]{String.class, Boolean.TYPE, Object.class, String.class, Object.class};
            c1245.f3616 = Void.TYPE;
            c6316M11826.m11828(qRouteApi, str, Boolean.FALSE, null, AbstractC3056.m6668(-3937652989452617127L), null);
        } catch (Exception e) {
            String strM66682 = AbstractC3056.m6668(-3937652980862682535L);
            String str2 = AbstractC6157.f16779;
            AbstractC6157.m11574(strM66682, e.toString(), e, true);
        }
    }
}
