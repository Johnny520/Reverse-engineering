package androidx.activity;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.lifecycle.InterfaceC2388;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0033 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC2388 f64;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC0034 f65;

    public C0033(AbstractC0034 abstractC0034, InterfaceC2388 interfaceC2388) {
        abstractC0034.getClass();
        this.f65 = abstractC0034;
        this.f64 = interfaceC2388;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0033)) {
            return false;
        }
        C0033 c0033 = (C0033) obj;
        return AbstractC4394.m8917(this.f65, c0033.f65) && AbstractC4394.m8917(this.f64, c0033.f64);
    }

    public final int hashCode() {
        int iHashCode = this.f65.hashCode() * 31;
        InterfaceC2388 interfaceC2388 = this.f64;
        return iHashCode + (interfaceC2388 == null ? 0 : interfaceC2388.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f65 + ", owner=" + this.f64 + ')';
    }
}
