package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2886 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f6425;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6426;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6427;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f6428;

    public C2886(String str, int i, Object obj, int i2) {
        this.f6428 = obj;
        this.f6427 = i;
        this.f6426 = i2;
        this.f6425 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2886)) {
            return false;
        }
        C2886 c2886 = (C2886) obj;
        return AbstractC5227.m9466(this.f6428, c2886.f6428) && this.f6427 == c2886.f6427 && this.f6426 == c2886.f6426 && AbstractC5227.m9466(this.f6425, c2886.f6425);
    }

    public final int hashCode() {
        Object obj = this.f6428;
        return this.f6425.hashCode() + AbstractC0900.m704(this.f6426, AbstractC0900.m704(this.f6427, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f6428);
        sb.append(", start=");
        sb.append(this.f6427);
        sb.append(", end=");
        sb.append(this.f6426);
        sb.append(", tag=");
        return AbstractC0900.m708(sb, this.f6425, ')');
    }
}
