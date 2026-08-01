package p055;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.C2080;
import p035.C7092;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p049.C7164;
import p321.C9452;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7216 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        try {
            C7164 c7164M12413 = C7164.m12413(AbstractC7166.m12425("com.tencent.mobileqq.troop.troopsetting.activity.TroopSettingFragmentV2"));
            String strM14531 = "onViewCreatedAfterPartInit";
            C2080 c2080 = c7164M12413.f17803;
            c2080.f3963 = strM14531;
            c2080.f3964 = new Class[]{View.class, Bundle.class};
            c2080.f3962 = Void.TYPE;
            m12390(c7164M12413.m12414(), new C7092(21));
        } catch (Exception unused) {
            C7164 c7164M12412 = C7164.m12412("com.tencent.mobileqq.troop.troopsetting.activity.TroopSettingActivity");
            C2080 c20802 = c7164M12412.f17803;
            c20802.f3962 = Boolean.TYPE;
            c20802.f3964 = new Class[]{Bundle.class};
            c7164M12412.f17803.f3963 = "doOnCreate";
            m12389(c7164M12412.m12414(), new C9452(28));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "将群文件卡片所在位置重新排序到上方";
    }
}
