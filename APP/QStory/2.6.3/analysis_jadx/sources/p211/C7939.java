package p211;

import android.content.res.Resources;
import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7939 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f21972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Resources.Theme f21973;

    public C7939(Resources.Theme theme, int i) {
        this.f21973 = theme;
        this.f21972 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7939)) {
            return false;
        }
        C7939 c7939 = (C7939) obj;
        return AbstractC4395.m8907(this.f21973, c7939.f21973) && this.f21972 == c7939.f21972;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21972) + (this.f21973.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f21973);
        sb.append(", id=");
        return AbstractC0053.m156(sb, this.f21972, ')');
    }
}
