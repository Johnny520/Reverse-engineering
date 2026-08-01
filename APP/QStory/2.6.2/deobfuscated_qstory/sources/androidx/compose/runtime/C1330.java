package androidx.compose.runtime;

import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.C1267;
import kotlin.collections.AbstractC4343;
import kotlinx.coroutines.channels.InterfaceC5199;
import kotlinx.coroutines.channels.InterfaceC5206;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1330 extends AbstractC1332 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0235 f3886;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0235 f3887;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C1267 f3888;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC5199 f3889;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C1385 f3890;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f3891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3892;

    public C1330() {
        super(0);
        this.f3890 = new C1385(this, 2);
        C1381 c1381 = new C1381(this, 4);
        AbstractC1280.m2249(AbstractC1280.f3746);
        synchronized (AbstractC1280.f3744) {
            AbstractC1280.f3747 = AbstractC4343.m8821(AbstractC1280.f3747, c1381);
        }
        this.f3888 = new C1267(c1381);
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final void mo2390(InterfaceC5206 interfaceC5206) {
        this.f3889 = null;
        this.f3892 = null;
        this.f3886 = null;
        mo2394();
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final InterfaceC6557 mo2391(InterfaceC5199 interfaceC5199) {
        InterfaceC5199 interfaceC51992 = this.f3889;
        if (interfaceC51992 != null && !interfaceC51992.equals(interfaceC5199)) {
            AbstractC1392.m2527("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f3889 = interfaceC5199;
        return this.f3890;
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void mo2392(InterfaceC5199 interfaceC5199) {
        this.f3892 = null;
        this.f3886 = null;
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void mo2393() {
        this.f3888.m2215();
        this.f3892 = null;
        this.f3886 = null;
        synchronized (this.f3894) {
            this.f3889 = null;
            this.f3891 = null;
            this.f3887 = null;
        }
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void mo2394() {
        synchronized (this.f3894) {
            try {
                this.f3891 = this.f3892;
                if (this.f3886 == null) {
                    this.f3887 = null;
                } else {
                    if (this.f3887 == null) {
                        C0235 c0235 = AbstractC0285.f997;
                        this.f3887 = new C0235();
                    }
                    C0235 c02352 = this.f3887;
                    this.f3887 = this.f3886;
                    this.f3886 = c02352;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
