package kotlin.sequences;

import java.util.Iterator;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5956 implements InterfaceC5959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7387 f15007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f15008;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5959 f15009;

    public C5956(InterfaceC5959 interfaceC5959, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        interfaceC5959.getClass();
        interfaceC7387.getClass();
        interfaceC73872.getClass();
        this.f15009 = interfaceC5959;
        this.f15008 = interfaceC7387;
        this.f15007 = interfaceC73872;
    }

    @Override // kotlin.sequences.InterfaceC5959
    public final Iterator iterator() {
        return new C5948(this);
    }
}
