package androidx.compose.runtime;

import androidx.compose.runtime.internal.C1253;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1357 implements InterfaceC1325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6557 f3929;

    public C1357(InterfaceC6557 interfaceC6557) {
        this.f3929 = interfaceC6557;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1357) && AbstractC4394.m8917(this.f3929, ((C1357) obj).f3929);
    }

    public final int hashCode() {
        return this.f3929.hashCode();
    }

    public final String toString() {
        return "ComputedValueHolder(compute=" + this.f3929 + ')';
    }

    @Override // androidx.compose.runtime.InterfaceC1325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2296(C1253 c1253) {
        return this.f3929.invoke(c1253);
    }
}
