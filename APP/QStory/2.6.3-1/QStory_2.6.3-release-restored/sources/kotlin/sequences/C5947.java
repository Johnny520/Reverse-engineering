package kotlin.sequences;

import java.util.Iterator;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5947 implements InterfaceC5959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7387 f14989;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f14990;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5959 f14991;

    public C5947(InterfaceC5959 interfaceC5959, boolean z, InterfaceC7387 interfaceC7387) {
        interfaceC7387.getClass();
        this.f14991 = interfaceC5959;
        this.f14990 = z;
        this.f14989 = interfaceC7387;
    }

    @Override // kotlin.sequences.InterfaceC5959
    public final Iterator iterator() {
        return new C5948(this);
    }
}
