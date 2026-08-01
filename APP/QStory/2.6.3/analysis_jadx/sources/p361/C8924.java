package p361;

import java.util.Objects;

/* JADX INFO: renamed from: 飘花落叶言苏子世楪哲兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8924 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8925 f25129;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8925 f25130;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8925 f25131;

    public C8924() {
        C8925 c8925 = new C8925();
        C8925 c89252 = new C8925();
        C8925 c89253 = new C8925();
        this.f25131 = c8925;
        this.f25130 = c89252;
        this.f25129 = c89253;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8924)) {
            return false;
        }
        C8924 c8924 = (C8924) obj;
        return this.f25131.equals(c8924.f25131) && this.f25130.equals(c8924.f25130) && this.f25129.equals(c8924.f25129);
    }

    public final int hashCode() {
        return Objects.hash(this.f25131, this.f25130, this.f25129);
    }

    public final String toString() {
        return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(this.f25129.f25132), Long.valueOf(this.f25130.f25132), Long.valueOf(this.f25131.f25132));
    }
}
