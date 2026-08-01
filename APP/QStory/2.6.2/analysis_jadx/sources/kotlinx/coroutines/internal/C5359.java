package kotlinx.coroutines.internal;

import com.bumptech.glide.AbstractC3054;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.InterfaceC4359;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.AbstractC5428;
import kotlinx.coroutines.DispatchException;
import p063.InterfaceC6862;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5359 extends AbstractC5428 implements InterfaceC6862 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC4356 f14942;

    public C5359(InterfaceC4356 interfaceC4356, InterfaceC4359 interfaceC4359) {
        super(interfaceC4359, true, true);
        this.f14942 = interfaceC4356;
    }

    @Override // p063.InterfaceC6862
    public final InterfaceC6862 getCallerFrame() {
        InterfaceC4356 interfaceC4356 = this.f14942;
        if (interfaceC4356 instanceof InterfaceC6862) {
            return (InterfaceC6862) interfaceC4356;
        }
        return null;
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public void mo10379(Object obj) throws DispatchException {
        AbstractC5352.m10366(AbstractC5398.m10471(obj), AbstractC3054.m6602(this.f14942));
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public void mo10380(Object obj) {
        this.f14942.resumeWith(AbstractC5398.m10471(obj));
    }

    @Override // kotlinx.coroutines.C5459
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final boolean mo10382() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public void mo10381() {
    }
}
