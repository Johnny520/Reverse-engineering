package p319;

import java.util.Iterator;
import java.util.List;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8692 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14379(List list, StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8690 c8690 = (C8690) it.next();
            if (c8690.f24498 == stickerPanelSettingsConfig$SortMode) {
                c8690.f24499.setCheckedImmediate(true);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C8690 c86902 = (C8690) it2.next();
            c86902.f24499.setClickable(false);
            c86902.f24500.setOnClickListener(new ViewOnClickListenerC5561(list, 12, c86902));
        }
    }
}
