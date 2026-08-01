package kotlinx.coroutines;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: kotlinx.coroutines.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5393 implements InterfaceC5470 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f15024;

    public C5393(boolean z) {
        this.f15024 = z;
    }

    public final String toString() {
        return AbstractC0053.m148(new StringBuilder("Empty{"), this.f15024 ? "Active" : "New", '}');
    }

    @Override // kotlinx.coroutines.InterfaceC5470
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean mo10458() {
        return this.f15024;
    }

    @Override // kotlinx.coroutines.InterfaceC5470
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5458 mo10459() {
        return null;
    }
}
