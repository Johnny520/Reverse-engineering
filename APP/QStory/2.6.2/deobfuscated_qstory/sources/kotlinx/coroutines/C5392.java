package kotlinx.coroutines;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5392 implements InterfaceC5469 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f15024;

    public C5392(boolean z) {
        this.f15024 = z;
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("Empty{"), this.f15024 ? "Active" : "New", '}');
    }

    @Override // kotlinx.coroutines.InterfaceC5469
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo10454() {
        return this.f15024;
    }

    @Override // kotlinx.coroutines.InterfaceC5469
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5457 mo10455() {
        return null;
    }
}
