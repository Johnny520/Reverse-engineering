package androidx.compose.runtime;

import androidx.compose.runtime.internal.C2088;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2173 implements InterfaceC2160 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f4245;

    public C2173(Object obj) {
        this.f4245 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2173) && AbstractC5227.m9466(this.f4245, ((C2173) obj).f4245);
    }

    public final int hashCode() {
        Object obj = this.f4245;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f4245 + ')';
    }

    @Override // androidx.compose.runtime.InterfaceC2160
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Object mo2866(C2088 c2088) {
        return this.f4245;
    }
}
