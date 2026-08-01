package androidx.compose.ui.text;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4394;
import p195.AbstractC7833;

/* JADX INFO: renamed from: androidx.compose.ui.text.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2050 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f6073;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f6074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f6075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f6076;

    public C2050(String str, int i, Object obj, int i2) {
        this.f6076 = obj;
        this.f6075 = i;
        this.f6074 = i2;
        this.f6073 = str;
        if (i <= i2) {
            return;
        }
        AbstractC7833.m13170("Reversed range is not supported");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2050)) {
            return false;
        }
        C2050 c2050 = (C2050) obj;
        return AbstractC4394.m8917(this.f6076, c2050.f6076) && this.f6075 == c2050.f6075 && this.f6074 == c2050.f6074 && AbstractC4394.m8917(this.f6073, c2050.f6073);
    }

    public final int hashCode() {
        Object obj = this.f6076;
        return this.f6073.hashCode() + AbstractC0053.m143(this.f6074, AbstractC0053.m143(this.f6075, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f6076);
        sb.append(", start=");
        sb.append(this.f6075);
        sb.append(", end=");
        sb.append(this.f6074);
        sb.append(", tag=");
        return AbstractC0053.m155(sb, this.f6073, ')');
    }

    public C2050(Object obj, int i, int i2) {
        this("", i, obj, i2);
    }
}
