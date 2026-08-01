package p361;

import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言苏子世楪兰哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8934 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8935 f25140;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8935 f25141;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8935 f25142;

    public C8934() {
        C8935 c8935 = new C8935();
        C8935 c89352 = new C8935();
        C8935 c89353 = new C8935();
        this.f25142 = c8935;
        this.f25141 = c89352;
        this.f25140 = c89353;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8934)) {
            return false;
        }
        C8934 c8934 = (C8934) obj;
        return this.f25142.equals(c8934.f25142) && this.f25141.equals(c8934.f25141) && this.f25140.equals(c8934.f25140);
    }

    public final int hashCode() {
        return Objects.hash(this.f25142, this.f25141, this.f25140);
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(this.f25140.f25143), Long.valueOf(this.f25141.f25143), Long.valueOf(this.f25142.f25143));
    }
}
