package androidx.compose.runtime;

import androidx.compose.runtime.internal.C2088;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2152 implements InterfaceC2160 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2230 f4166;

    public C2152(InterfaceC2230 interfaceC2230) {
        this.f4166 = interfaceC2230;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2152) && this.f4166 == ((C2152) obj).f4166;
    }

    public final int hashCode() {
        return this.f4166.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f4166 + ')';
    }

    @Override // androidx.compose.runtime.InterfaceC2160
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2866(C2088 c2088) {
        return ((AbstractC2182) this.f4166).getValue();
    }
}
