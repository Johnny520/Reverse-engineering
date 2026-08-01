package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.InterfaceC5193;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6059 implements InterfaceC5192 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Throwable f15164;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC5192 f15165;

    public C6059(InterfaceC5192 interfaceC5192, Throwable th) {
        this.f15165 = interfaceC5192;
        this.f15164 = th;
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final Object fold(Object obj, InterfaceC7383 interfaceC7383) {
        return this.f15165.fold(obj, interfaceC7383);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5186 get(InterfaceC5193 interfaceC5193) {
        return this.f15165.get(interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 minusKey(InterfaceC5193 interfaceC5193) {
        return this.f15165.minusKey(interfaceC5193);
    }

    @Override // kotlin.coroutines.InterfaceC5192
    public final InterfaceC5192 plus(InterfaceC5192 interfaceC5192) {
        return this.f15165.plus(interfaceC5192);
    }
}
