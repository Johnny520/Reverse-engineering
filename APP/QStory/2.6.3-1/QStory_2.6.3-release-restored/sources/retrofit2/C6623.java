package retrofit2;

import java.util.concurrent.Executor;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import p023.C6954;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6623 implements InterfaceC6608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC6608 f16235;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Executor f16236;

    public C6623(Executor executor, InterfaceC6608 interfaceC6608) {
        this.f16236 = executor;
        this.f16235 = interfaceC6608;
    }

    @Override // retrofit2.InterfaceC6608
    public final void cancel() {
        this.f16235.cancel();
    }

    @Override // retrofit2.InterfaceC6608
    public final InterfaceC6608 clone() {
        return new C6623(this.f16236, this.f16235.clone());
    }

    @Override // retrofit2.InterfaceC6608
    public final C6585 execute() {
        return this.f16235.execute();
    }

    @Override // retrofit2.InterfaceC6608
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final C6954 mo11720() {
        return this.f16235.mo11720();
    }

    @Override // retrofit2.InterfaceC6608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11721() {
        return this.f16235.mo11721();
    }

    @Override // retrofit2.InterfaceC6608
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo11722(InterfaceC6625 interfaceC6625) {
        this.f16235.mo11722(new C5703(2, this, interfaceC6625, false));
    }
}
