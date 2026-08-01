package androidx.compose.runtime;

import androidx.compose.runtime.internal.C1253;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1338 implements InterfaceC1325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f3899;

    public C1338(Object obj) {
        this.f3899 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1338) && AbstractC4394.m8917(this.f3899, ((C1338) obj).f3899);
    }

    public final int hashCode() {
        Object obj = this.f3899;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f3899 + ')';
    }

    @Override // androidx.compose.runtime.InterfaceC1325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2296(C1253 c1253) {
        return this.f3899;
    }
}
