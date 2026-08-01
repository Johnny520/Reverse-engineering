package p339;

import java.util.Iterator;
import java.util.List;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9547 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m14986(List list, StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9543 c9543 = (C9543) it.next();
            if (c9543.f24892 == stickerPanelSettingsConfig$SortMode) {
                c9543.f24893.setCheckedImmediate(true);
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C9543 c95432 = (C9543) it2.next();
            c95432.f24893.setClickable(false);
            c95432.f24894.setOnClickListener(new ViewOnClickListenerC6392(list, 12, c95432));
        }
    }
}
