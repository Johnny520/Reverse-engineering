package p323;

import java.util.Iterator;
import java.util.List;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8718 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14427(List list, StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8714 c8714 = (C8714) it.next();
            if (c8714.f24547 == stickerPanelSettingsConfig$SortMode) {
                c8714.f24548.setCheckedImmediate(true);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C8714 c87142 = (C8714) it2.next();
            c87142.f24548.setClickable(false);
            c87142.f24549.setOnClickListener(new ViewOnClickListenerC5562(list, 12, c87142));
        }
    }
}
