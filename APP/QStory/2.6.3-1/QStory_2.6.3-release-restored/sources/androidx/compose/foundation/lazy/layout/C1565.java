package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0900;
import p192.AbstractC8570;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1565 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f2379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f2380;

    public C1565(int i, int i2) {
        this.f2380 = i;
        this.f2379 = i2;
        if (!(i >= 0)) {
            AbstractC8570.m13656("negative start index");
        }
        if (i2 >= i) {
            return;
        }
        AbstractC8570.m13656("end index greater than start");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1565)) {
            return false;
        }
        C1565 c1565 = (C1565) obj;
        return this.f2380 == c1565.f2380 && this.f2379 == c1565.f2379;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2379) + (Integer.hashCode(this.f2380) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.f2380);
        sb.append(", end=");
        return AbstractC0900.m716(sb, this.f2379, ')');
    }
}
