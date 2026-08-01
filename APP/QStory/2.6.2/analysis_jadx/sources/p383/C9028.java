package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9028 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f25322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25323;

    public C9028(int i, int i2) {
        this.f25323 = i;
        this.f25322 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9028)) {
            return false;
        }
        C9028 c9028 = (C9028) obj;
        return this.f25323 == c9028.f25323 && this.f25322 == c9028.f25322;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25322) + (Integer.hashCode(this.f25323) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937697571213149607L));
        AbstractC6136.m11533(sb, this.f25323, -3937697515378574759L);
        return AbstractC0053.m154(sb, this.f25322, ')');
    }
}
