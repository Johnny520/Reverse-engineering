package androidx.compose.runtime;

import androidx.activity.compose.C0002;
import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.C1267;
import com.bumptech.glide.AbstractC3055;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC4344;
import kotlinx.coroutines.channels.InterfaceC5200;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1393 extends AbstractC1332 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C0236 f4052;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C0235 f4053;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1267 f4054;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0236 f4055;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f4056;

    public C1393() {
        super(0);
        this.f4055 = AbstractC3055.m6663();
        this.f4056 = new ArrayList();
        C0235 c0235 = AbstractC0285.f997;
        this.f4053 = new C0235();
        this.f4052 = new C0236();
        C1381 c1381 = new C1381(this, 3);
        AbstractC1280.m2259(AbstractC1280.f3747);
        synchronized (AbstractC1280.f3745) {
            AbstractC1280.f3748 = AbstractC4344.m8794(AbstractC1280.f3748, c1381);
        }
        this.f4054 = new C1267(c1381);
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final void mo2400(InterfaceC5207 interfaceC5207) {
        this.f4052.m758(interfaceC5207);
        mo2402(interfaceC5207);
        mo2404();
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final InterfaceC6558 mo2401(InterfaceC5200 interfaceC5200) {
        C0236 c0236 = this.f4052;
        InterfaceC6558 c0002 = (InterfaceC6558) c0236.m757(interfaceC5200);
        if (c0002 == null) {
            c0002 = new C0002(this, 15, interfaceC5200);
            int iM749 = c0236.m749(interfaceC5200);
            if (iM749 < 0) {
                iM749 = ~iM749;
            }
            Object[] objArr = c0236.f879;
            Object obj = objArr[iM749];
            c0236.f880[iM749] = interfaceC5200;
            objArr[iM749] = c0002;
        }
        return c0002;
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo2402(InterfaceC5200 interfaceC5200) {
        this.f4056.add(new C1302(interfaceC5200));
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo2403() {
        this.f4054.m2225();
        this.f4056.clear();
        this.f4052.m754();
        synchronized (this.f3895) {
            this.f4055.m754();
        }
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo2404() {
        synchronized (this.f3895) {
            try {
                ArrayList arrayList = this.f4056;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1394 interfaceC1394 = (InterfaceC1394) arrayList.get(i);
                    if (interfaceC1394 instanceof C1301) {
                        AbstractC3055.m6648(this.f4055, ((C1301) interfaceC1394).f3790, ((C1301) interfaceC1394).f3789);
                    } else {
                        if (!(interfaceC1394 instanceof C1302)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC3055.m6636(this.f4055, ((C1302) interfaceC1394).f3791);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4056.clear();
    }
}
