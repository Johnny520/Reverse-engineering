package androidx.compose.p001ui.text;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p211.AbstractC8663;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2884 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f6419;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6420;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6421;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f6422;

    public C2884(String str, int i, Object obj, int i2) {
        this.f6422 = obj;
        this.f6421 = i;
        this.f6420 = i2;
        this.f6419 = str;
        if (i <= i2) {
            return;
        }
        AbstractC8663.m13757("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2884)) {
            return false;
        }
        C2884 c2884 = (C2884) obj;
        return AbstractC5227.m9466(this.f6422, c2884.f6422) && this.f6421 == c2884.f6421 && this.f6420 == c2884.f6420 && AbstractC5227.m9466(this.f6419, c2884.f6419);
    }

    public final int hashCode() {
        Object obj = this.f6422;
        return this.f6419.hashCode() + AbstractC0900.m704(this.f6420, AbstractC0900.m704(this.f6421, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f6422);
        sb.append(", start=");
        sb.append(this.f6421);
        sb.append(", end=");
        sb.append(this.f6420);
        sb.append(", tag=");
        return AbstractC0900.m708(sb, this.f6419, ')');
    }

    public C2884(Object obj, int i, int i2) {
        this("", i, obj, i2);
    }
}
