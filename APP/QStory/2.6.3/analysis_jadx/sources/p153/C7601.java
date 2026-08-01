package p153;

import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7601 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public List f20610;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public String f20611;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f20612;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7601)) {
            return false;
        }
        C7601 c7601 = (C7601) obj;
        return Objects.equals(this.f20612, c7601.f20612) && Objects.equals(this.f20611, c7601.f20611) && Objects.equals(this.f20610, c7601.f20610);
    }

    public final int hashCode() {
        return Objects.hash(this.f20612, this.f20611, this.f20610);
    }
}
