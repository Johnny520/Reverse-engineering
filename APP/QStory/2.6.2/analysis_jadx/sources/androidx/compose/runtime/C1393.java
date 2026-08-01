package androidx.compose.runtime;

import androidx.activity.compose.C0002;
import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.C1267;
import com.bumptech.glide.AbstractC3054;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC4343;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1393 extends AbstractC1332 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0236 f4051;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0235 f4052;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1267 f4053;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0236 f4054;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f4055;

    public C1393() {
        super(0);
        this.f4054 = AbstractC3054.m6614();
        this.f4055 = new ArrayList();
        C0235 c0235 = AbstractC0285.f997;
        this.f4052 = new C0235();
        this.f4051 = new C0236();
        C1381 c1381 = new C1381(this, 3);
        AbstractC1280.m2249(AbstractC1280.f3746);
        synchronized (AbstractC1280.f3744) {
            AbstractC1280.f3747 = AbstractC4343.m8821(AbstractC1280.f3747, c1381);
        }
        this.f4053 = new C1267(c1381);
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final void mo2390(InterfaceC5206 interfaceC5206) {
        this.f4051.m757(interfaceC5206);
        mo2392(interfaceC5206);
        mo2394();
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final InterfaceC6557 mo2391(InterfaceC5199 interfaceC5199) {
        C0236 c0236 = this.f4051;
        InterfaceC6557 c0002 = (InterfaceC6557) c0236.m756(interfaceC5199);
        if (c0002 == null) {
            c0002 = new C0002(this, 15, interfaceC5199);
            int iM748 = c0236.m748(interfaceC5199);
            if (iM748 < 0) {
                iM748 = ~iM748;
            }
            Object[] objArr = c0236.f879;
            Object obj = objArr[iM748];
            c0236.f880[iM748] = interfaceC5199;
            objArr[iM748] = c0002;
        }
        return c0002;
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo2392(InterfaceC5199 interfaceC5199) {
        this.f4055.add(new C1302(interfaceC5199));
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo2393() {
        this.f4053.m2215();
        this.f4055.clear();
        this.f4051.m753();
        synchronized (this.f3894) {
            this.f4054.m753();
        }
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo2394() {
        synchronized (this.f3894) {
            try {
                ArrayList arrayList = this.f4055;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1394 interfaceC1394 = (InterfaceC1394) arrayList.get(i);
                    if (interfaceC1394 instanceof C1301) {
                        AbstractC3054.m6598(this.f4054, ((C1301) interfaceC1394).f3789, ((C1301) interfaceC1394).f3788);
                    } else {
                        if (!(interfaceC1394 instanceof C1302)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC3054.m6586(this.f4054, ((C1302) interfaceC1394).f3790);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4055.clear();
    }
}
