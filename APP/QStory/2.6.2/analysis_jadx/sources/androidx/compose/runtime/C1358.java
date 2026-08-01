package androidx.compose.runtime;

import androidx.activity.compose.C0011;
import androidx.appcompat.widget.C0194;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1358 extends AbstractC1390 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f3930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f3931 = 1;

    public C1358(InterfaceC6557 interfaceC6557) {
        super(new C0011(24));
        this.f3930 = new C1357(interfaceC6557);
    }

    @Override // androidx.compose.runtime.AbstractC1390
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1325 mo2428() {
        switch (this.f3931) {
            case 0:
                return (C1357) this.f3930;
            default:
                return super.mo2428();
        }
    }

    @Override // androidx.compose.runtime.AbstractC1390
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C0194 mo2418(Object obj) {
        switch (this.f3931) {
            case 0:
                return new C0194(this, obj, obj == null, null, true);
            default:
                return new C0194(this, obj, obj == null, (C1353) this.f3930, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358(InterfaceC6542 interfaceC6542) {
        super(interfaceC6542);
        C1353 c1353 = C1353.f3921;
        this.f3930 = c1353;
    }
}
