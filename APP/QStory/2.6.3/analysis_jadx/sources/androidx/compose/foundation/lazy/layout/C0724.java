package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0053;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0724 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2034;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2035;

    public C0724(int i, int i2) {
        this.f2035 = i;
        this.f2034 = i2;
        if (!(i >= 0)) {
            AbstractC7741.m13097("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        AbstractC7741.m13097("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0724)) {
            return false;
        }
        C0724 c0724 = (C0724) obj;
        return this.f2035 == c0724.f2035 && this.f2034 == c0724.f2034;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2034) + (Integer.hashCode(this.f2035) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f2035);
        sb.append(", end=");
        return AbstractC0053.m156(sb, this.f2034, ')');
    }
}
