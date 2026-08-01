package p347;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p089.InterfaceC7180;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C8858 {
    public static final C8852 Companion = new C8852();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f24969;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final int f24970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f24972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f24973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final long f24974;

    public /* synthetic */ C8858(int i, long j, long j2, String str, int i2, int i3, int i4) {
        if (63 != (i & 63)) {
            AbstractC7143.m12393(i, 63, C8853.f24960.getDescriptor());
            throw null;
        }
        this.f24974 = j;
        this.f24973 = j2;
        this.f24972 = str;
        this.f24971 = i2;
        this.f24970 = i3;
        this.f24969 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8858)) {
            return false;
        }
        C8858 c8858 = (C8858) obj;
        return this.f24974 == c8858.f24974 && this.f24973 == c8858.f24973 && AbstractC4394.m8917(this.f24972, c8858.f24972) && this.f24971 == c8858.f24971 && this.f24970 == c8858.f24970 && this.f24969 == c8858.f24969;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24969) + AbstractC0053.m143(this.f24970, AbstractC0053.m143(this.f24971, AbstractC6136.m11539(AbstractC0053.m141(Long.hashCode(this.f24974) * 31, 31, this.f24973), 31, this.f24972), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TroopReplyEmoji(troopUin=");
        AbstractC6136.m11532(sb, this.f24974, -3937685549599688103L);
        AbstractC6136.m11532(sb, this.f24973, -3937277712390161831L);
        AbstractC6136.m11531(sb, this.f24972, -3937834464705775015L);
        AbstractC6136.m11533(sb, this.f24971, -3937277622195848615L);
        AbstractC6136.m11533(sb, this.f24970, -3937277647965652391L);
        return AbstractC0053.m154(sb, this.f24969, ')');
    }

    public C8858(long j, long j2, String str, int i) {
        "emojiId";
        str.getClass();
        this.f24974 = j;
        this.f24973 = j2;
        this.f24972 = str;
        this.f24971 = i;
        this.f24970 = 0;
        this.f24969 = 0;
    }
}
