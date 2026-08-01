package p323;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import p007.AbstractC6136;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8731 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final float f24615;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final float f24616;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f24617;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24618;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24619;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24620;

    public C8731(int i, int i2, int i3, float f, float f2, float f3) {
        this.f24620 = i;
        this.f24619 = i2;
        this.f24618 = i3;
        this.f24617 = f;
        this.f24616 = f2;
        this.f24615 = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8731)) {
            return false;
        }
        C8731 c8731 = (C8731) obj;
        return this.f24620 == c8731.f24620 && this.f24619 == c8731.f24619 && this.f24618 == c8731.f24618 && Float.compare(this.f24617, c8731.f24617) == 0 && Float.compare(this.f24616, c8731.f24616) == 0 && Float.compare(this.f24615, c8731.f24615) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f24615) + AbstractC0053.m144(AbstractC0053.m144(AbstractC0053.m143(this.f24618, AbstractC0053.m143(this.f24619, Integer.hashCode(this.f24620) * 31, 31), 31), this.f24617, 31), this.f24616, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC3056.m6668(-3937832510495655335L));
        AbstractC6136.m11533(sb, this.f24620, -3937832312927159719L);
        AbstractC6136.m11533(sb, this.f24619, -3937832274272454055L);
        AbstractC6136.m11533(sb, this.f24618, -3937832192668075431L);
        sb.append(this.f24617);
        sb.append(AbstractC3056.m6668(-3937832231322781095L));
        sb.append(this.f24616);
        sb.append(AbstractC3056.m6668(-3937832132538533287L));
        return AbstractC0053.m157(sb, this.f24615, ')');
    }
}
