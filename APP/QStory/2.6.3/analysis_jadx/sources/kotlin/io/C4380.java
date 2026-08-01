package kotlin.io;

import java.util.Iterator;
import kotlin.sequences.C5123;
import kotlin.sequences.InterfaceC5127;
import p052.InterfaceC6543;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4380 implements InterfaceC5127 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f12959;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f12960;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12961;

    public C4380(InterfaceC6543 interfaceC6543, InterfaceC6558 interfaceC6558) {
        this.f12961 = 1;
        interfaceC6558.getClass();
        this.f12960 = interfaceC6543;
        this.f12959 = interfaceC6558;
    }

    @Override // kotlin.sequences.InterfaceC5127
    public final Iterator iterator() {
        switch (this.f12961) {
            case 0:
                return new C4379(this);
            case 1:
                return new C5123(this, (byte) 0);
            default:
                return new C5123(this);
        }
    }

    public /* synthetic */ C4380(Object obj, int i, Object obj2) {
        this.f12961 = i;
        this.f12960 = obj;
        this.f12959 = obj2;
    }
}
