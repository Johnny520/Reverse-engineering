package kotlin.io;

import java.util.Iterator;
import kotlin.sequences.C5122;
import kotlin.sequences.InterfaceC5126;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.io.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4379 implements InterfaceC5126 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f12955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f12956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12957;

    public C4379(InterfaceC6542 interfaceC6542, InterfaceC6557 interfaceC6557) {
        this.f12957 = 1;
        interfaceC6557.getClass();
        this.f12956 = interfaceC6542;
        this.f12955 = interfaceC6557;
    }

    @Override // kotlin.sequences.InterfaceC5126
    public final Iterator iterator() {
        switch (this.f12957) {
            case 0:
                return new C4378(this);
            case 1:
                return new C5122(this, (byte) 0);
            default:
                return new C5122(this);
        }
    }

    public /* synthetic */ C4379(Object obj, int i, Object obj2) {
        this.f12957 = i;
        this.f12956 = obj;
        this.f12955 = obj2;
    }
}
