package io.ktor.server.routing;

import androidx.activity.AbstractC0900;
import kotlin.jvm.internal.AbstractC5227;
import p252.C8947;
import p252.InterfaceC8924;

/* JADX INFO: renamed from: io.ktor.server.routing.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4993 extends AbstractC4992 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final double f12952;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC8924 f12953;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int f12954;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4993(double d, int i, int i2) {
        this(d, C8947.f22759, (i2 & 4) != 0 ? 0 : i);
        InterfaceC8924.f22683.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4993)) {
            return false;
        }
        C4993 c4993 = (C4993) obj;
        return Double.compare(this.f12952, c4993.f12952) == 0 && AbstractC5227.m9466(this.f12953, c4993.f12953) && this.f12954 == c4993.f12954;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12954) + ((this.f12953.hashCode() + (Double.hashCode(this.f12952) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(quality=");
        sb.append(this.f12952);
        sb.append(", parameters=");
        sb.append(this.f12953);
        sb.append(", segmentIncrement=");
        return AbstractC0900.m716(sb, this.f12954, ')');
    }

    public C4993(double d, InterfaceC8924 interfaceC8924, int i) {
        this.f12952 = d;
        this.f12953 = interfaceC8924;
        this.f12954 = i;
    }
}
