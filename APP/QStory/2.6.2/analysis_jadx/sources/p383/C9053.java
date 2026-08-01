package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9053 {
    public static final C9046 Companion = new C9046();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f25352;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25353;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25354;

    public /* synthetic */ C9053(int i, int i2, long j, String str) {
        this.f25354 = (i & 1) == 0 ? 0L : j;
        this.f25353 = (i & 2) == 0 ? 0 : i2;
        if ((i & 4) == 0) {
            this.f25352 = AbstractC3056.m6668(-3937561979095614887L);
        } else {
            this.f25352 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9053)) {
            return false;
        }
        C9053 c9053 = (C9053) obj;
        return this.f25354 == c9053.f25354 && this.f25353 == c9053.f25353 && AbstractC4394.m8917(this.f25352, c9053.f25352);
    }

    public final int hashCode() {
        return this.f25352.hashCode() + AbstractC0053.m143(this.f25353, Long.hashCode(this.f25354) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937708368760931751L));
        AbstractC6136.m11532(sb, this.f25354, -3937709086020470183L);
        AbstractC6136.m11533(sb, this.f25353, -3937708278566618535L);
        return AbstractC0053.m155(sb, this.f25352, ')');
    }
}
