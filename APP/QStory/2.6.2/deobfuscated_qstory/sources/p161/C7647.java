package p161;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7647 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Resources.Theme f20773;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Resources f20774;

    public C7647(Resources resources, Resources.Theme theme) {
        this.f20774 = resources;
        this.f20773 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7647.class == obj.getClass()) {
            C7647 c7647 = (C7647) obj;
            if (this.f20774.equals(c7647.f20774) && Objects.equals(this.f20773, c7647.f20773)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f20774, this.f20773);
    }
}
