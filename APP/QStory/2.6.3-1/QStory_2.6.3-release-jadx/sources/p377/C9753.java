package p377;

import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言苏子世楪哲兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9753 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9754 f25474;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9754 f25475;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9754 f25476;

    public C9753() {
        C9754 c9754 = new C9754();
        C9754 c97542 = new C9754();
        C9754 c97543 = new C9754();
        this.f25476 = c9754;
        this.f25475 = c97542;
        this.f25474 = c97543;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9753)) {
            return false;
        }
        C9753 c9753 = (C9753) obj;
        return this.f25476.equals(c9753.f25476) && this.f25475.equals(c9753.f25475) && this.f25474.equals(c9753.f25474);
    }

    public final int hashCode() {
        return Objects.hash(this.f25476, this.f25475, this.f25474);
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(this.f25474.f25477), Long.valueOf(this.f25475.f25477), Long.valueOf(this.f25476.f25477));
    }
}
