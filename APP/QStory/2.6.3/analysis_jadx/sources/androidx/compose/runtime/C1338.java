package androidx.compose.runtime;

import androidx.compose.runtime.internal.C1253;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1338 implements InterfaceC1325 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f3900;

    public C1338(Object obj) {
        this.f3900 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1338) && AbstractC4395.m8907(this.f3900, ((C1338) obj).f3900);
    }

    public final int hashCode() {
        Object obj = this.f3900;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f3900 + ')';
    }

    @Override // androidx.compose.runtime.InterfaceC1325
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2306(C1253 c1253) {
        return this.f3900;
    }
}
