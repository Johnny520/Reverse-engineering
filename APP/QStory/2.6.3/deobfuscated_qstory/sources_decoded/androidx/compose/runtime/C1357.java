package androidx.compose.runtime;

import androidx.compose.runtime.internal.C1253;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1357 implements InterfaceC1325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6558 f3930;

    public C1357(InterfaceC6558 interfaceC6558) {
        this.f3930 = interfaceC6558;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1357) && AbstractC4395.m8907(this.f3930, ((C1357) obj).f3930);
    }

    public final int hashCode() {
        return this.f3930.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f3930 + ')';
    }

    @Override // androidx.compose.runtime.InterfaceC1325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2306(C1253 c1253) {
        return this.f3930.invoke(c1253);
    }
}
