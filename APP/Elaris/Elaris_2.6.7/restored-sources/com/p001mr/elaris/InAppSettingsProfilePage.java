package com.p001mr.elaris;

import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
final class InAppSettingsProfilePage {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InAppSettingsProfilePage() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addProfile(InAppSettings inAppSettings, LinearLayout linearLayout) {
        linearLayout.addView(inAppSettings.card("资料与装扮", new View[]{inAppSettings.switchRow(Prefs.KEY_ALLOW_FORBID_CARD, "资料卡直开", "尝试打开受限制的资料卡，并压制异常弹窗"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_BLOCK_PROFILE_CARD_DECOR, "屏蔽名片装扮", "合并 DIY 名片、资料卡 QQ 秀封面和装扮兜底处理"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_BLOCK_QQ_SHOW, "屏蔽 QQ 秀", "隐藏聊天页里的 QQ 秀/装扮入口"), inAppSettings.divider(), inAppSettings.switchRow(Prefs.KEY_BLOCK_AVATAR_PENDANT, "屏蔽头像挂件", "移除头像挂件数据，并只在挂件区域做窄范围兜底")}));
    }
}
