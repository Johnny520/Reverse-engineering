package p161;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7648 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Resources.Theme f20768;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Resources f20769;

    public C7648(Resources resources, Resources.Theme theme) {
        this.f20769 = resources;
        this.f20768 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7648.class == obj.getClass()) {
            C7648 c7648 = (C7648) obj;
            if (this.f20769.equals(c7648.f20769) && Objects.equals(this.f20768, c7648.f20768)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20769, this.f20768);
    }
}
