package retrofit2;

import java.util.concurrent.Executor;
import kotlin.reflect.jvm.internal.impl.types.C4871;
import p007.C6125;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5793 implements InterfaceC5778 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5778 f15890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Executor f15891;

    public C5793(Executor executor, InterfaceC5778 interfaceC5778) {
        this.f15891 = executor;
        this.f15890 = interfaceC5778;
    }

    @Override // retrofit2.InterfaceC5778
    public final void cancel() {
        this.f15890.cancel();
    }

    @Override // retrofit2.InterfaceC5778
    public final InterfaceC5778 clone() {
        return new C5793(this.f15891, this.f15890.clone());
    }

    @Override // retrofit2.InterfaceC5778
    public final C5755 execute() {
        return this.f15890.execute();
    }

    @Override // retrofit2.InterfaceC5778
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C6125 mo11161() {
        return this.f15890.mo11161();
    }

    @Override // retrofit2.InterfaceC5778
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11162() {
        return this.f15890.mo11162();
    }

    @Override // retrofit2.InterfaceC5778
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo11163(InterfaceC5795 interfaceC5795) {
        this.f15890.mo11163(new C4871(2, this, interfaceC5795, false));
    }
}
