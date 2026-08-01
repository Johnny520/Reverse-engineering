package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import java.util.HashMap;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f14945;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f14946;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f14947;

    public C5891(HashMap map, boolean z, boolean z2) {
        this.f14947 = map;
        this.f14946 = z;
        this.f14945 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5891)) {
            return false;
        }
        C5891 c5891 = (C5891) obj;
        return this.f14947.equals(c5891.f14947) && this.f14946 == c5891.f14946 && this.f14945 == c5891.f14945;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14945) + AbstractC0900.m701(this.f14947.hashCode() * 31, 31, this.f14946);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeOverrideMembers(members=");
        sb.append(this.f14947);
        sb.append(", containsInheritedStatics=");
        sb.append(this.f14946);
        sb.append(", containsPackagePrivate=");
        return AbstractC0900.m712(sb, this.f14945, ')');
    }
}
