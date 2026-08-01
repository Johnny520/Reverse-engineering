package androidx.activity;

import androidx.lifecycle.InterfaceC3221;
import com.bumptech.glide.AbstractC3888;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.activity.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0880 extends AbstractC3888 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC0881 f409;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC3221 f410;

    public C0880(AbstractC0881 abstractC0881, InterfaceC3221 interfaceC3221) {
        abstractC0881.getClass();
        this.f409 = abstractC0881;
        this.f410 = interfaceC3221;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0880)) {
            return false;
        }
        C0880 c0880 = (C0880) obj;
        return AbstractC5227.m9466(this.f409, c0880.f409) && AbstractC5227.m9466(this.f410, c0880.f410);
    }

    public final int hashCode() {
        int iHashCode = this.f409.hashCode() * 31;
        InterfaceC3221 interfaceC3221 = this.f410;
        return iHashCode + (interfaceC3221 == null ? 0 : interfaceC3221.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f409 + ", owner=" + this.f410 + ')';
    }
}
