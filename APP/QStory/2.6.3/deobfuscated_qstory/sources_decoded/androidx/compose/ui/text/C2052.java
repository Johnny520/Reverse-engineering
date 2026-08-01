package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2052 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f6080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6081;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6082;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f6083;

    public C2052(String str, int i, Object obj, int i2) {
        this.f6083 = obj;
        this.f6082 = i;
        this.f6081 = i2;
        this.f6080 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2052)) {
            return false;
        }
        C2052 c2052 = (C2052) obj;
        return AbstractC4395.m8907(this.f6083, c2052.f6083) && this.f6082 == c2052.f6082 && this.f6081 == c2052.f6081 && AbstractC4395.m8907(this.f6080, c2052.f6080);
    }

    public final int hashCode() {
        Object obj = this.f6083;
        return this.f6080.hashCode() + AbstractC0053.m144(this.f6081, AbstractC0053.m144(this.f6082, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f6083);
        sb.append(", start=");
        sb.append(this.f6082);
        sb.append(", end=");
        sb.append(this.f6081);
        sb.append(", tag=");
        return AbstractC0053.m148(sb, this.f6080, ')');
    }
}
