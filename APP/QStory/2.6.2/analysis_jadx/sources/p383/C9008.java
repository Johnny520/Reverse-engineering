package p383;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子兰哲.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C9008 {
    public static final C9019 Companion = new C9019();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f25299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9009 f25300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f25301;

    public /* synthetic */ C9008(int i, long j, C9009 c9009, int i2) {
        if (2 != (i & 2)) {
            AbstractC7143.m12393(i, 2, C9020.f25314.getDescriptor());
            throw null;
        }
        this.f25301 = (i & 1) == 0 ? 0L : j;
        this.f25300 = c9009;
        if ((i & 4) == 0) {
            this.f25299 = 0;
        } else {
            this.f25299 = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9008)) {
            return false;
        }
        C9008 c9008 = (C9008) obj;
        return this.f25301 == c9008.f25301 && AbstractC4394.m8917(this.f25300, c9008.f25300) && this.f25299 == c9008.f25299;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25299) + ((this.f25300.hashCode() + (Long.hashCode(this.f25301) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937694255498397095L));
        AbstractC6136.m11532(sb, this.f25301, -3937711714540455335L);
        sb.append(this.f25300);
        sb.append(AbstractC3056.m6668(-3937685549599688103L));
        return AbstractC0053.m154(sb, this.f25299, ')');
    }

    public C9008(long j, C9009 c9009, int i) {
        AbstractC3056.m6668(-3937696381507208615L);
        this.f25301 = j;
        this.f25300 = c9009;
        this.f25299 = i;
    }
}
