package kotlin.sequences;

import androidx.core.view.C3040;
import java.util.Iterator;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5953 implements InterfaceC5959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f15001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5959 f15002;

    public C5953(InterfaceC5959 interfaceC5959, InterfaceC7387 interfaceC7387) {
        interfaceC5959.getClass();
        interfaceC7387.getClass();
        this.f15002 = interfaceC5959;
        this.f15001 = interfaceC7387;
    }

    @Override // kotlin.sequences.InterfaceC5959
    public final Iterator iterator() {
        return new C3040(this);
    }
}
