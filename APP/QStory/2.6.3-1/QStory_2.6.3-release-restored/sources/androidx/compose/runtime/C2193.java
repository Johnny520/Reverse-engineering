package androidx.compose.runtime;

import androidx.activity.compose.C0858;
import androidx.appcompat.widget.C1041;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2193 extends AbstractC2225 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f4276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f4277 = 1;

    public C2193(InterfaceC7387 interfaceC7387) {
        super(new C0858(24));
        this.f4276 = new C2192(interfaceC7387);
    }

    @Override // androidx.compose.runtime.AbstractC2225
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC2160 mo2998() {
        switch (this.f4277) {
            case 0:
                return (C2192) this.f4276;
            default:
                return super.mo2998();
        }
    }

    @Override // androidx.compose.runtime.AbstractC2225
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C1041 mo2988(Object obj) {
        switch (this.f4277) {
            case 0:
                return new C1041(this, obj, obj == null, null, true);
            default:
                return new C1041(this, obj, obj == null, (C2188) this.f4276, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2193(InterfaceC7372 interfaceC7372) {
        super(interfaceC7372);
        C2188 c2188 = C2188.f4267;
        this.f4276 = c2188;
    }
}
