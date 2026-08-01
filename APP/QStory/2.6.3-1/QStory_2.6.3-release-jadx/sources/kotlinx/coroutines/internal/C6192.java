package kotlinx.coroutines.internal;

import androidx.window.area.AbstractC3400;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.AbstractC6261;
import kotlinx.coroutines.DispatchException;
import p079.InterfaceC7692;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6192 extends AbstractC6261 implements InterfaceC7692 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final InterfaceC5189 f15287;

    public C6192(InterfaceC5189 interfaceC5189, InterfaceC5192 interfaceC5192) {
        super(interfaceC5192, true, true);
        this.f15287 = interfaceC5189;
    }

    @Override // p079.InterfaceC7692
    public final InterfaceC7692 getCallerFrame() {
        InterfaceC5189 interfaceC5189 = this.f15287;
        if (interfaceC5189 instanceof InterfaceC7692) {
            return (InterfaceC7692) interfaceC5189;
        }
        return null;
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public void mo10942(Object obj) throws DispatchException {
        AbstractC6185.m10929(AbstractC6231.m11034(obj), AbstractC3400.m5624(this.f15287));
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public void mo10943(Object obj) {
        this.f15287.resumeWith(AbstractC6231.m11034(obj));
    }

    @Override // kotlinx.coroutines.C6292
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public final boolean mo10945() {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public void mo10944() {
    }
}
