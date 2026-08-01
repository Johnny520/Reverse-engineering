package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import p089.InterfaceC7180;
import p332.C8801;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9037 {
    public static final C9034 Companion = new C9034();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final InterfaceC5183[] f25333 = {null, AbstractC5186.m10211(LazyThreadSafetyMode.PUBLICATION, new C8801(11)), null, null};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f25334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9036 f25335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f25336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9036 f25337;

    public /* synthetic */ C9037(int i, C9036 c9036, List list, C9036 c90362, int i2) {
        if ((i & 1) == 0) {
            this.f25337 = null;
        } else {
            this.f25337 = c9036;
        }
        if ((i & 2) == 0) {
            this.f25336 = null;
        } else {
            this.f25336 = list;
        }
        if ((i & 4) == 0) {
            this.f25335 = null;
        } else {
            this.f25335 = c90362;
        }
        if ((i & 8) == 0) {
            this.f25334 = 0;
        } else {
            this.f25334 = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9037)) {
            return false;
        }
        C9037 c9037 = (C9037) obj;
        return AbstractC4394.m8917(this.f25337, c9037.f25337) && AbstractC4394.m8917(this.f25336, c9037.f25336) && AbstractC4394.m8917(this.f25335, c9037.f25335) && this.f25334 == c9037.f25334;
    }

    public final int hashCode() {
        C9036 c9036 = this.f25337;
        int iHashCode = (c9036 == null ? 0 : Long.hashCode(c9036.f25332)) * 31;
        List list = this.f25336;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        C9036 c90362 = this.f25335;
        return Integer.hashCode(this.f25334) + ((iHashCode2 + (c90362 != null ? Long.hashCode(c90362.f25332) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937699443818890663L));
        sb.append(this.f25337);
        sb.append(AbstractC3056.m6668(-3937699220480591271L));
        sb.append(this.f25336);
        sb.append(AbstractC3056.m6668(-3937699151761114535L));
        sb.append(this.f25335);
        sb.append(AbstractC3056.m6668(-3937697871860860327L));
        return AbstractC0053.m154(sb, this.f25334, ')');
    }

    public C9037(C9036 c9036, List list, C9036 c90362, int i) {
        this.f25337 = c9036;
        this.f25336 = list;
        this.f25335 = c90362;
        this.f25334 = i;
    }
}
