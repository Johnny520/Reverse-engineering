package p319;

import android.widget.LinearLayout;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import top.suzhelan.qstory.hook.item.stickerpanel.StickerPanelSettingsConfig$SortMode;
import top.suzhelan.qstory.ui.views.CustomMaterialCheckBox;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8690 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final StickerPanelSettingsConfig$SortMode f24498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final CustomMaterialCheckBox f24499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final LinearLayout f24500;

    public C8690(LinearLayout linearLayout, CustomMaterialCheckBox customMaterialCheckBox, StickerPanelSettingsConfig$SortMode stickerPanelSettingsConfig$SortMode) {
        "row";
        "checkBox";
        "mode";
        stickerPanelSettingsConfig$SortMode.getClass();
        this.f24500 = linearLayout;
        this.f24499 = customMaterialCheckBox;
        this.f24498 = stickerPanelSettingsConfig$SortMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8690)) {
            return false;
        }
        C8690 c8690 = (C8690) obj;
        return AbstractC4394.m8917(this.f24500, c8690.f24500) && AbstractC4394.m8917(this.f24499, c8690.f24499) && this.f24498 == c8690.f24498;
    }

    public final int hashCode() {
        return this.f24498.hashCode() + ((this.f24499.hashCode() + (this.f24500.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CheckOption(row=" + this.f24500 + ", checkBox=" + this.f24499 + ", mode=" + this.f24498 + ')';
    }
}
