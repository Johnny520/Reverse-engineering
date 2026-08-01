package kotlinx.coroutines.internal;

import androidx.window.area.AbstractC2567;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.InterfaceC4360;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.AbstractC5429;
import kotlinx.coroutines.DispatchException;
import p063.InterfaceC6863;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5360 extends AbstractC5429 implements InterfaceC6863 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC4357 f14942;

    public C5360(InterfaceC4357 interfaceC4357, InterfaceC4360 interfaceC4360) {
        super(interfaceC4360, true, true);
        this.f14942 = interfaceC4357;
    }

    @Override // p063.InterfaceC6863
    public final InterfaceC6863 getCallerFrame() {
        InterfaceC4357 interfaceC4357 = this.f14942;
        if (interfaceC4357 instanceof InterfaceC6863) {
            return (InterfaceC6863) interfaceC4357;
        }
        return null;
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void mo10383(Object obj) throws DispatchException {
        AbstractC5353.m10370(AbstractC5399.m10475(obj), AbstractC2567.m5064(this.f14942));
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void mo10384(Object obj) {
        this.f14942.resumeWith(AbstractC5399.m10475(obj));
    }

    @Override // kotlinx.coroutines.C5460
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final boolean mo10386() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public void mo10385() {
    }
}
