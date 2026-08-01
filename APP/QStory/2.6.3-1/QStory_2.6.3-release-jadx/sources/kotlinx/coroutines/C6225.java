package kotlinx.coroutines;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6225 implements InterfaceC6302 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f15369;

    public C6225(boolean z) {
        this.f15369 = z;
    }

    public final String toString() {
        return AbstractC0900.m708(new StringBuilder("Empty{"), this.f15369 ? "Active" : "New", '}');
    }

    @Override // kotlinx.coroutines.InterfaceC6302
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo11017() {
        return this.f15369;
    }

    @Override // kotlinx.coroutines.InterfaceC6302
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C6290 mo11018() {
        return null;
    }
}
