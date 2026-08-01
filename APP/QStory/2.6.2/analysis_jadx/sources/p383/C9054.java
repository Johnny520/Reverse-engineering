package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9054 {
    public static final C9048 Companion = new C9048();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9053 f25355;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f25356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f25357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f25358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25359;

    public /* synthetic */ C9054(int i, long j, String str, long j2, String str2, C9053 c9053) {
        if ((i & 1) == 0) {
            this.f25359 = 0L;
        } else {
            this.f25359 = j;
        }
        if ((i & 2) == 0) {
            this.f25358 = AbstractC3056.m6668(-3937561979095614887L);
        } else {
            this.f25358 = str;
        }
        if ((i & 4) == 0) {
            this.f25357 = 0L;
        } else {
            this.f25357 = j2;
        }
        if ((i & 8) == 0) {
            this.f25356 = AbstractC3056.m6668(-3937561979095614887L);
        } else {
            this.f25356 = str2;
        }
        if ((i & 16) == 0) {
            this.f25355 = null;
        } else {
            this.f25355 = c9053;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9054)) {
            return false;
        }
        C9054 c9054 = (C9054) obj;
        return this.f25359 == c9054.f25359 && AbstractC4394.m8917(this.f25358, c9054.f25358) && this.f25357 == c9054.f25357 && AbstractC4394.m8917(this.f25356, c9054.f25356) && AbstractC4394.m8917(this.f25355, c9054.f25355);
    }

    public final int hashCode() {
        int iM11539 = AbstractC6136.m11539(AbstractC0053.m141(AbstractC6136.m11539(Long.hashCode(this.f25359) * 31, 31, this.f25358), 31, this.f25357), 31, this.f25356);
        C9053 c9053 = this.f25355;
        return iM11539 + (c9053 == null ? 0 : c9053.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937708227027010983L));
        AbstractC6136.m11532(sb, this.f25359, -3937694427297088935L);
        AbstractC6136.m11531(sb, this.f25358, -3937708201257207207L);
        AbstractC6136.m11532(sb, this.f25357, -3937695887585969575L);
        AbstractC6136.m11531(sb, this.f25356, -3937708106767926695L);
        sb.append(this.f25355);
        sb.append(')');
        return sb.toString();
    }
}
