package androidx.compose.runtime;

import androidx.compose.runtime.internal.C1253;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1317 implements InterfaceC1325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f3821;

    public C1317(InterfaceC1395 interfaceC1395) {
        this.f3821 = interfaceC1395;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1317) && this.f3821 == ((C1317) obj).f3821;
    }

    public final int hashCode() {
        return this.f3821.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f3821 + ')';
    }

    @Override // androidx.compose.runtime.InterfaceC1325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2306(C1253 c1253) {
        return ((AbstractC1347) this.f3821).getValue();
    }
}
