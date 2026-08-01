package kotlin.p008io;

import java.util.Iterator;
import kotlin.sequences.C5955;
import kotlin.sequences.InterfaceC5959;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5212 implements InterfaceC5959 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f13304;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f13305;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f13306;

    public C5212(InterfaceC7372 interfaceC7372, InterfaceC7387 interfaceC7387) {
        this.f13306 = 1;
        interfaceC7387.getClass();
        this.f13305 = interfaceC7372;
        this.f13304 = interfaceC7387;
    }

    @Override // kotlin.sequences.InterfaceC5959
    public final Iterator iterator() {
        switch (this.f13306) {
            case 0:
                return new C5211(this);
            case 1:
                return new C5955(this, (byte) 0);
            default:
                return new C5955(this);
        }
    }

    public /* synthetic */ C5212(Object obj, int i, Object obj2) {
        this.f13306 = i;
        this.f13305 = obj;
        this.f13304 = obj2;
    }
}
