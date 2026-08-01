package androidx.compose.runtime;

import androidx.activity.compose.C0849;
import androidx.collection.AbstractC1132;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.C2102;
import com.bumptech.glide.AbstractC3887;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5176;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2228 extends AbstractC2167 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C1083 f4397;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C1082 f4398;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2102 f4399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1083 f4400;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final ArrayList f4401;

    public C2228() {
        super(0);
        this.f4400 = AbstractC3887.m7223();
        this.f4401 = new ArrayList();
        C1082 c1082 = AbstractC1132.f1342;
        this.f4398 = new C1082();
        this.f4397 = new C1083();
        C2216 c2216 = new C2216(this, 3);
        AbstractC2115.m2819(AbstractC2115.f4092);
        synchronized (AbstractC2115.f4090) {
            AbstractC2115.f4093 = AbstractC5176.m9353(AbstractC2115.f4093, c2216);
        }
        this.f4399 = new C2102(c2216);
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰 */
    public final void mo2960(InterfaceC6039 interfaceC6039) {
        this.f4397.m1318(interfaceC6039);
        mo2962(interfaceC6039);
        mo2964();
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世 */
    public final InterfaceC7387 mo2961(InterfaceC6032 interfaceC6032) {
        C1083 c1083 = this.f4397;
        InterfaceC7387 c0849 = (InterfaceC7387) c1083.m1317(interfaceC6032);
        if (c0849 == null) {
            c0849 = new C0849(this, 15, interfaceC6032);
            int iM1309 = c1083.m1309(interfaceC6032);
            if (iM1309 < 0) {
                iM1309 = ~iM1309;
            }
            Object[] objArr = c1083.f1224;
            Object obj = objArr[iM1309];
            c1083.f1225[iM1309] = interfaceC6032;
            objArr[iM1309] = c0849;
        }
        return c0849;
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪 */
    public final void mo2962(InterfaceC6032 interfaceC6032) {
        this.f4401.add(new C2137(interfaceC6032));
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪 */
    public final void mo2963() {
        this.f4399.m2785();
        this.f4401.clear();
        this.f4397.m1314();
        synchronized (this.f4240) {
            this.f4400.m1314();
        }
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世 */
    public final void mo2964() {
        synchronized (this.f4240) {
            try {
                ArrayList arrayList = this.f4401;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC2229 interfaceC2229 = (InterfaceC2229) arrayList.get(i);
                    if (interfaceC2229 instanceof C2136) {
                        AbstractC3887.m7208(this.f4400, ((C2136) interfaceC2229).f4135, ((C2136) interfaceC2229).f4134);
                    } else {
                        if (!(interfaceC2229 instanceof C2137)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        AbstractC3887.m7196(this.f4400, ((C2137) interfaceC2229).f4136);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4401.clear();
    }
}
