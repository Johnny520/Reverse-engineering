package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2052 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f6079;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6080;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6081;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f6082;

    public C2052(String str, int i, Object obj, int i2) {
        this.f6082 = obj;
        this.f6081 = i;
        this.f6080 = i2;
        this.f6079 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2052)) {
            return false;
        }
        C2052 c2052 = (C2052) obj;
        return AbstractC4394.m8917(this.f6082, c2052.f6082) && this.f6081 == c2052.f6081 && this.f6080 == c2052.f6080 && AbstractC4394.m8917(this.f6079, c2052.f6079);
    }

    public final int hashCode() {
        Object obj = this.f6082;
        return this.f6079.hashCode() + AbstractC0053.m143(this.f6080, AbstractC0053.m143(this.f6081, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f6082);
        sb.append(", start=");
        sb.append(this.f6081);
        sb.append(", end=");
        sb.append(this.f6080);
        sb.append(", tag=");
        return AbstractC0053.m155(sb, this.f6079, ')');
    }
}
