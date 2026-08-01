package androidx.compose.runtime;

import androidx.compose.runtime.internal.C2088;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2192 implements InterfaceC2160 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7387 f4275;

    public C2192(InterfaceC7387 interfaceC7387) {
        this.f4275 = interfaceC7387;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2192) && AbstractC5227.m9466(this.f4275, ((C2192) obj).f4275);
    }

    public final int hashCode() {
        return this.f4275.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f4275 + ')';
    }

    @Override // androidx.compose.runtime.InterfaceC2160
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2866(C2088 c2088) {
        return this.f4275.invoke(c2088);
    }
}
