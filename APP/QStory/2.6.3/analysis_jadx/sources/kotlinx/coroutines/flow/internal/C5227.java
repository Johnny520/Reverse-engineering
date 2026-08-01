package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4360;
import kotlin.coroutines.InterfaceC4361;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5227 implements InterfaceC4360 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Throwable f14819;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC4360 f14820;

    public C5227(InterfaceC4360 interfaceC4360, Throwable th) {
        this.f14820 = interfaceC4360;
        this.f14819 = th;
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final Object fold(Object obj, InterfaceC6554 interfaceC6554) {
        return this.f14820.fold(obj, interfaceC6554);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4354 get(InterfaceC4361 interfaceC4361) {
        return this.f14820.get(interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 minusKey(InterfaceC4361 interfaceC4361) {
        return this.f14820.minusKey(interfaceC4361);
    }

    @Override // kotlin.coroutines.InterfaceC4360
    public final InterfaceC4360 plus(InterfaceC4360 interfaceC4360) {
        return this.f14820.plus(interfaceC4360);
    }
}
