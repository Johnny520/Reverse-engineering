package kotlin.sequences;

import io.ktor.util.C5043;
import java.util.Iterator;
import kotlin.collections.C5170;

/* JADX INFO: renamed from: kotlin.sequences.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5951 implements InterfaceC5959, InterfaceC5950 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f14998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5959 f14999;

    public C5951(InterfaceC5959 interfaceC5959, int i) {
        interfaceC5959.getClass();
        this.f14999 = interfaceC5959;
        this.f14998 = i;
        if (i >= 0) {
            return;
        }
        C5043.m9160(i, 46, "count must be non-negative, but was ");
        throw null;
    }

    @Override // kotlin.sequences.InterfaceC5959
    public final Iterator iterator() {
        return new C5170(this);
    }

    @Override // kotlin.sequences.InterfaceC5950
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5959 mo10666(int i) {
        int i2 = this.f14998 + i;
        return i2 < 0 ? new C5951(this, i) : new C5951(this.f14999, i2);
    }
}
