package kotlin.reflect;

import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import org.slf4j.Marker;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5917 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5917 f14981 = new C5917(null, null);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5919 f14982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final KVariance f14983;

    public C5917(InterfaceC5919 interfaceC5919, KVariance kVariance) {
        String str;
        this.f14983 = kVariance;
        this.f14982 = interfaceC5919;
        if ((kVariance == null) == (interfaceC5919 == null)) {
            return;
        }
        if (kVariance == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + kVariance + " requires type to be specified.";
        }
        C6755.m11873(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5917)) {
            return false;
        }
        C5917 c5917 = (C5917) obj;
        return this.f14983 == c5917.f14983 && AbstractC5227.m9466(this.f14982, c5917.f14982);
    }

    public final int hashCode() {
        KVariance kVariance = this.f14983;
        int iHashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        InterfaceC5919 interfaceC5919 = this.f14982;
        return iHashCode + (interfaceC5919 != null ? interfaceC5919.hashCode() : 0);
    }

    public final String toString() {
        KVariance kVariance = this.f14983;
        int i = kVariance == null ? -1 : AbstractC5918.f14984[kVariance.ordinal()];
        if (i == -1) {
            return Marker.ANY_MARKER;
        }
        InterfaceC5919 interfaceC5919 = this.f14982;
        if (i == 1) {
            return String.valueOf(interfaceC5919);
        }
        if (i == 2) {
            return "in " + interfaceC5919;
        }
        if (i != 3) {
            C5043.m9170();
            return null;
        }
        return "out " + interfaceC5919;
    }
}
