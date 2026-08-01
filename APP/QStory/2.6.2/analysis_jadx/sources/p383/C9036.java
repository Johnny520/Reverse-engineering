package p383;

import com.bumptech.glide.AbstractC3056;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9036 {
    public static final C9039 Companion = new C9039();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25332;

    public /* synthetic */ C9036(int i, long j) {
        if ((i & 1) == 0) {
            this.f25332 = 0L;
        } else {
            this.f25332 = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9036) && this.f25332 == ((C9036) obj).f25332;
    }

    public final int hashCode() {
        return Long.hashCode(this.f25332);
    }

    public final String toString() {
        return AbstractC3056.m6668(-3937699482473596327L) + this.f25332 + ')';
    }
}
