package p324;

import com.bumptech.glide.AbstractC3056;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8745 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static StickerPanelSettingsConfig$SortMode m14412(String str) {
        Object next;
        AbstractC3056.m6668(-3937803416387192231L);
        Iterator<E> it = StickerPanelSettingsConfig$SortMode.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC4394.m8917(((StickerPanelSettingsConfig$SortMode) next).getKey(), str)) {
                break;
            }
        }
        StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode = (StickerPanelSettingsConfig$SortMode) next;
        return stickerPanelSettingsConfig$SortMode == null ? StickerPanelSettingsConfig$SortMode.TIME_DESC : stickerPanelSettingsConfig$SortMode;
    }
}
