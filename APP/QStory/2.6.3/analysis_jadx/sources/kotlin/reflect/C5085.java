package kotlin.reflect;

import io.ktor.util.C4211;
import kotlin.jvm.internal.AbstractC4395;
import org.slf4j.Marker;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5085 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5085 f14636 = new C5085(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5087 f14637;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final KVariance f14638;

    public C5085(InterfaceC5087 interfaceC5087, KVariance kVariance) {
        String str;
        this.f14638 = kVariance;
        this.f14637 = interfaceC5087;
        if ((kVariance == null) == (interfaceC5087 == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        C5925.m11314(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5085)) {
            return false;
        }
        C5085 c5085 = (C5085) obj;
        return this.f14638 == c5085.f14638 && AbstractC4395.m8907(this.f14637, c5085.f14637);
    }

    public final int hashCode() {
        KVariance kVariance = this.f14638;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        InterfaceC5087 interfaceC5087 = this.f14637;
        return iHashCode + (interfaceC5087 != null ? interfaceC5087.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.f14638;
        int i = kVariance == null ? -1 : AbstractC5086.f14639[kVariance.ordinal()];
        if (i == -1) {
            return Marker.ANY_MARKER;
        }
        InterfaceC5087 interfaceC5087 = this.f14637;
        if (i == 1) {
            return String.valueOf(interfaceC5087);
        }
        if (i == 2) {
            return "in " + interfaceC5087;
        }
        if (i != 3) {
            C4211.m8611();
            return null;
        }
        return "out " + interfaceC5087;
    }
}
