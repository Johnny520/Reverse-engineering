package p323;

import android.widget.LinearLayout;
import kotlin.jvm.internal.AbstractC4395;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8714 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final StickerPanelSettingsConfig$SortMode f24547;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CustomMaterialCheckBox f24548;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinearLayout f24549;

    public C8714(LinearLayout linearLayout, CustomMaterialCheckBox customMaterialCheckBox, StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode) {
        AbstractC8405.m13973("喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜喵~喵喵喵喵呜呜喵呜");
        AbstractC8405.m13972(2761);
        AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵呜呜呜呜喵~喵喵喵喵呜呜喵呜");
        stickerPanelSettingsConfig$SortMode.getClass();
        this.f24549 = linearLayout;
        this.f24548 = customMaterialCheckBox;
        this.f24547 = stickerPanelSettingsConfig$SortMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8714)) {
            return false;
        }
        C8714 c8714 = (C8714) obj;
        return AbstractC4395.m8907(this.f24549, c8714.f24549) && AbstractC4395.m8907(this.f24548, c8714.f24548) && this.f24547 == c8714.f24547;
    }

    public final int hashCode() {
        return this.f24547.hashCode() + ((this.f24548.hashCode() + (this.f24549.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return AbstractC8405.m13972(2762) + this.f24549 + AbstractC8405.m13972(2763) + this.f24548 + AbstractC8405.m13973("喵呜喵呜呜呜呜呜~喵呜喵呜喵呜喵呜~喵喵喵呜喵呜呜呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵呜喵呜呜呜喵喵") + this.f24547 + ')';
    }
}
