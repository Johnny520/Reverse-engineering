package kotlin.reflect;

import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;
import org.slf4j.Marker;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5084 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5084 f14636 = new C5084(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5086 f14637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final KVariance f14638;

    public C5084(InterfaceC5086 interfaceC5086, KVariance kVariance) {
        String str;
        this.f14638 = kVariance;
        this.f14637 = interfaceC5086;
        if ((kVariance == null) == (interfaceC5086 == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        C5919.m11253(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5084)) {
            return false;
        }
        C5084 c5084 = (C5084) obj;
        return this.f14638 == c5084.f14638 && AbstractC4394.m8917(this.f14637, c5084.f14637);
    }

    public final int hashCode() {
        KVariance kVariance = this.f14638;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        InterfaceC5086 interfaceC5086 = this.f14637;
        return iHashCode + (interfaceC5086 != null ? interfaceC5086.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.f14638;
        int i = kVariance == null ? -1 : AbstractC5085.f14639[kVariance.ordinal()];
        if (i == -1) {
            return Marker.ANY_MARKER;
        }
        InterfaceC5086 interfaceC5086 = this.f14637;
        if (i == 1) {
            return String.valueOf(interfaceC5086);
        }
        if (i == 2) {
            return "in " + interfaceC5086;
        }
        if (i != 3) {
            C4210.m8621();
            return null;
        }
        return "out " + interfaceC5086;
    }
}
