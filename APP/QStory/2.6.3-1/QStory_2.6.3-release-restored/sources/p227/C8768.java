package p227;

import android.content.res.Resources;
import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8768 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Resources.Theme f22318;

    public C8768(Resources.Theme theme, int i) {
        this.f22318 = theme;
        this.f22317 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8768)) {
            return false;
        }
        C8768 c8768 = (C8768) obj;
        return AbstractC5227.m9466(this.f22318, c8768.f22318) && this.f22317 == c8768.f22317;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22317) + (this.f22318.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f22318);
        sb.append(", id=");
        return AbstractC0900.m716(sb, this.f22317, ')');
    }
}
