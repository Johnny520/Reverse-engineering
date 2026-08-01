package p211;

import android.content.res.Resources;
import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7938 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Resources.Theme f21976;

    public C7938(Resources.Theme theme, int i) {
        this.f21976 = theme;
        this.f21975 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7938)) {
            return false;
        }
        C7938 c7938 = (C7938) obj;
        return AbstractC4394.m8917(this.f21976, c7938.f21976) && this.f21975 == c7938.f21975;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21975) + (this.f21976.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f21976);
        sb.append(", id=");
        return AbstractC0053.m154(sb, this.f21975, ')');
    }
}
