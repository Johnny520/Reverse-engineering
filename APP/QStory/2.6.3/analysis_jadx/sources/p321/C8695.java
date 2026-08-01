package p321;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8695 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static StickerPanelSettingsConfig$SortMode m14417(String str) {
        Object next;
        AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
        Iterator<E> it = StickerPanelSettingsConfig$SortMode.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4395.m8907(((StickerPanelSettingsConfig$SortMode) next).getKey(), str)) {
                break;
            }
        }
        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode = (StickerPanelSettingsConfig$SortMode) next;
        return stickerPanelSettingsConfig$SortMode == null ? StickerPanelSettingsConfig$SortMode.TIME_DESC : stickerPanelSettingsConfig$SortMode;
    }
}
