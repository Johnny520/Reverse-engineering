package p339;

import android.widget.LinearLayout;
import kotlin.jvm.internal.AbstractC5227;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;
import top.suzhelan.qstory.p015ui.views.CustomMaterialCheckBox;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final StickerPanelSettingsConfig$SortMode f24892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CustomMaterialCheckBox f24893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinearLayout f24894;

    public C9543(LinearLayout linearLayout, CustomMaterialCheckBox customMaterialCheckBox, StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode) {
        "row";
        "checkBox";
        "mode";
        stickerPanelSettingsConfig$SortMode.getClass();
        this.f24894 = linearLayout;
        this.f24893 = customMaterialCheckBox;
        this.f24892 = stickerPanelSettingsConfig$SortMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9543)) {
            return false;
        }
        C9543 c9543 = (C9543) obj;
        return AbstractC5227.m9466(this.f24894, c9543.f24894) && AbstractC5227.m9466(this.f24893, c9543.f24893) && this.f24892 == c9543.f24892;
    }

    public final int hashCode() {
        return this.f24892.hashCode() + ((this.f24893.hashCode() + (this.f24894.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CheckOption(row=" + this.f24894 + ", checkBox=" + this.f24893 + ", mode=" + this.f24892 + ')';
    }
}
