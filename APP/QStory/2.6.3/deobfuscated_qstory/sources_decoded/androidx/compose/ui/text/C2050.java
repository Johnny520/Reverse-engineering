package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p195.AbstractC7834;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f6074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6076;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f6077;

    public C2050(String str, int i, Object obj, int i2) {
        this.f6077 = obj;
        this.f6076 = i;
        this.f6075 = i2;
        this.f6074 = str;
        if (i <= i2) {
            return;
        }
        AbstractC7834.m13198("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2050)) {
            return false;
        }
        C2050 c2050 = (C2050) obj;
        return AbstractC4395.m8907(this.f6077, c2050.f6077) && this.f6076 == c2050.f6076 && this.f6075 == c2050.f6075 && AbstractC4395.m8907(this.f6074, c2050.f6074);
    }

    public final int hashCode() {
        Object obj = this.f6077;
        return this.f6074.hashCode() + AbstractC0053.m144(this.f6075, AbstractC0053.m144(this.f6076, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f6077);
        sb.append(", start=");
        sb.append(this.f6076);
        sb.append(", end=");
        sb.append(this.f6075);
        sb.append(", tag=");
        return AbstractC0053.m148(sb, this.f6074, ')');
    }

    public C2050(Object obj, int i, int i2) {
        this("", i, obj, i2);
    }
}
