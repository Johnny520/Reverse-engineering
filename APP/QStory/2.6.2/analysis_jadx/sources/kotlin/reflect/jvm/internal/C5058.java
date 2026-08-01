package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import java.util.HashMap;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5058 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f14598;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f14599;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f14600;

    public C5058(HashMap map, boolean z, boolean z2) {
        this.f14600 = map;
        this.f14599 = z;
        this.f14598 = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5058)) {
            return false;
        }
        C5058 c5058 = (C5058) obj;
        return this.f14600.equals(c5058.f14600) && this.f14599 == c5058.f14599 && this.f14598 == c5058.f14598;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f14598) + AbstractC0053.m140(this.f14600.hashCode() * 31, 31, this.f14599);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FakeOverrideMembers(members=");
        sb.append(this.f14600);
        sb.append(", containsInheritedStatics=");
        sb.append(this.f14599);
        sb.append(", containsPackagePrivate=");
        return AbstractC0053.m150(sb, this.f14598, ')');
    }
}
