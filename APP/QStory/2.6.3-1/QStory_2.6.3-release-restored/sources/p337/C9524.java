package p337;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9524 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static StickerPanelSettingsConfig$SortMode m14976(String str) {
        Object next;
        "key";
        Iterator<E> it = StickerPanelSettingsConfig$SortMode.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5227.m9466(((StickerPanelSettingsConfig$SortMode) next).getKey(), str)) {
                break;
            }
        }
        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode = (StickerPanelSettingsConfig$SortMode) next;
        return stickerPanelSettingsConfig$SortMode == null ? StickerPanelSettingsConfig$SortMode.TIME_DESC : stickerPanelSettingsConfig$SortMode;
    }
}
