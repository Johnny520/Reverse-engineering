package retrofit2;

import java.util.concurrent.Executor;
import kotlin.reflect.jvm.internal.impl.types.C4870;
import p015.C6198;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5792 implements InterfaceC5777 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5777 f15890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Executor f15891;

    public C5792(Executor executor, InterfaceC5777 interfaceC5777) {
        this.f15891 = executor;
        this.f15890 = interfaceC5777;
    }

    @Override // retrofit2.InterfaceC5777
    public final void cancel() {
        this.f15890.cancel();
    }

    @Override // retrofit2.InterfaceC5777
    public final InterfaceC5777 clone() {
        return new C5792(this.f15891, this.f15890.clone());
    }

    @Override // retrofit2.InterfaceC5777
    public final C5754 execute() {
        return this.f15890.execute();
    }

    @Override // retrofit2.InterfaceC5777
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C6198 mo11104() {
        return this.f15890.mo11104();
    }

    @Override // retrofit2.InterfaceC5777
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11105() {
        return this.f15890.mo11105();
    }

    @Override // retrofit2.InterfaceC5777
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo11106(InterfaceC5794 interfaceC5794) {
        this.f15890.mo11106(new C4870(2, this, interfaceC5794, false));
    }
}
