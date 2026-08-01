package androidx.activity;

import androidx.lifecycle.InterfaceC2388;
import com.bumptech.glide.AbstractC3056;
import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0033 extends AbstractC3056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC0034 f64;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC2388 f65;

    public C0033(AbstractC0034 abstractC0034, InterfaceC2388 interfaceC2388) {
        abstractC0034.getClass();
        this.f64 = abstractC0034;
        this.f65 = interfaceC2388;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0033)) {
            return false;
        }
        C0033 c0033 = (C0033) obj;
        return AbstractC4395.m8907(this.f64, c0033.f64) && AbstractC4395.m8907(this.f65, c0033.f65);
    }

    public final int hashCode() {
        int iHashCode = this.f64.hashCode() * 31;
        InterfaceC2388 interfaceC2388 = this.f65;
        return iHashCode + (interfaceC2388 == null ? 0 : interfaceC2388.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f64 + ", owner=" + this.f65 + ')';
    }
}
