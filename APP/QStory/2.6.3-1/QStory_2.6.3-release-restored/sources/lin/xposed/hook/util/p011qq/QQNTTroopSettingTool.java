package lin.xposed.hook.util.p011qq;

import androidx.compose.runtime.internal.C2080;
import p026.AbstractC7017;
import p049.AbstractC7166;
import p049.C7164;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class QQNTTroopSettingTool {
    public static void quitGroup(String str) {
        try {
            Object qRouteApi = QQEnvTool.getQRouteApi(AbstractC7166.m12425("com.tencent.qqnt.troop.ITroopOperationRepoApi"));
            C7164 c7164M12413 = C7164.m12413(qRouteApi.getClass());
            String strM14531 = "quitGroup";
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3964 = new Class[]{String.class, Boolean.TYPE, Object.class, String.class, Object.class};
            c2080.f3962 = Void.TYPE;
            c7164M12413.m12415(qRouteApi, str, Boolean.FALSE, null, "TroopSettingViewModel", null);
        } catch (Exception e) {
            String strM145312 = "quitGroup";
            String str2 = AbstractC7017.f17361;
            AbstractC7017.m12164(strM145312, e.toString(), e, true);
        }
    }
}
