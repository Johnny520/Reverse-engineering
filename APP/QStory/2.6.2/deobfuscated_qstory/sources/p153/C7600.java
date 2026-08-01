package p153;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7600 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f20615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f20616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f20617;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7600)) {
            return false;
        }
        C7600 c7600 = (C7600) obj;
        return Objects.equals(this.f20617, c7600.f20617) && Objects.equals(this.f20616, c7600.f20616) && Objects.equals(this.f20615, c7600.f20615);
    }

    public final int hashCode() {
        return Objects.hash(this.f20617, this.f20616, this.f20615);
    }
}
