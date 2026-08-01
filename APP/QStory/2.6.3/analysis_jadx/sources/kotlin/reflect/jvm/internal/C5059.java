package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import java.util.HashMap;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5059 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f14600;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f14601;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f14602;

    public C5059(HashMap map, boolean z, boolean z2) {
        this.f14602 = map;
        this.f14601 = z;
        this.f14600 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5059)) {
            return false;
        }
        C5059 c5059 = (C5059) obj;
        return this.f14602.equals(c5059.f14602) && this.f14601 == c5059.f14601 && this.f14600 == c5059.f14600;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14600) + AbstractC0053.m141(this.f14602.hashCode() * 31, 31, this.f14601);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeOverrideMembers(members=");
        sb.append(this.f14602);
        sb.append(", containsInheritedStatics=");
        sb.append(this.f14601);
        sb.append(", containsPackagePrivate=");
        return AbstractC0053.m152(sb, this.f14600, ')');
    }
}
