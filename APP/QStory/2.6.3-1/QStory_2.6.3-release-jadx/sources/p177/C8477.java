package p177;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8477 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Resources.Theme f21113;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Resources f21114;

    public C8477(Resources resources, Resources.Theme theme) {
        this.f21114 = resources;
        this.f21113 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8477.class == obj.getClass()) {
            C8477 c8477 = (C8477) obj;
            if (this.f21114.equals(c8477.f21114) && Objects.equals(this.f21113, c8477.f21113)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f21114, this.f21113);
    }
}
