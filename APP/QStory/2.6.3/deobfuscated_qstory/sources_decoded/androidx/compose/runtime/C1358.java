package androidx.compose.runtime;

import androidx.activity.compose.C0011;
import androidx.appcompat.widget.C0194;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1358 extends AbstractC1390 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f3931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f3932 = 1;

    public C1358(InterfaceC6558 interfaceC6558) {
        super(new C0011(24));
        this.f3931 = new C1357(interfaceC6558);
    }

    @Override // androidx.compose.runtime.AbstractC1390
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC1325 mo2438() {
        switch (this.f3932) {
            case 0:
                return (C1357) this.f3931;
            default:
                return super.mo2438();
        }
    }

    @Override // androidx.compose.runtime.AbstractC1390
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C0194 mo2428(Object obj) {
        switch (this.f3932) {
            case 0:
                return new C0194(this, obj, obj == null, null, true);
            default:
                return new C0194(this, obj, obj == null, (C1353) this.f3931, true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358(InterfaceC6543 interfaceC6543) {
        super(interfaceC6543);
        C1353 c1353 = C1353.f3922;
        this.f3931 = c1353;
    }
}
