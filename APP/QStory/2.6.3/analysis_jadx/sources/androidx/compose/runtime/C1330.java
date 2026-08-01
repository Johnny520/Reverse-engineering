package androidx.compose.runtime;

import androidx.collection.AbstractC0285;
import androidx.collection.C0235;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.C1267;
import kotlin.collections.AbstractC4344;
import kotlinx.coroutines.channels.InterfaceC5200;
import kotlinx.coroutines.channels.InterfaceC5207;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1330 extends AbstractC1332 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C0235 f3887;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0235 f3888;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C1267 f3889;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC5200 f3890;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C1385 f3891;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f3892;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3893;

    public C1330() {
        super(0);
        this.f3891 = new C1385(this, 2);
        C1381 c1381 = new C1381(this, 4);
        AbstractC1280.m2259(AbstractC1280.f3747);
        synchronized (AbstractC1280.f3745) {
            AbstractC1280.f3748 = AbstractC4344.m8794(AbstractC1280.f3748, c1381);
        }
        this.f3889 = new C1267(c1381);
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final void mo2400(InterfaceC5207 interfaceC5207) {
        this.f3890 = null;
        this.f3893 = null;
        this.f3887 = null;
        mo2404();
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final InterfaceC6558 mo2401(InterfaceC5200 interfaceC5200) {
        InterfaceC5200 interfaceC52002 = this.f3890;
        if (interfaceC52002 != null && !interfaceC52002.equals(interfaceC5200)) {
            AbstractC1392.m2537("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f3890 = interfaceC5200;
        return this.f3891;
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void mo2402(InterfaceC5200 interfaceC5200) {
        this.f3893 = null;
        this.f3887 = null;
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void mo2403() {
        this.f3889.m2225();
        this.f3893 = null;
        this.f3887 = null;
        synchronized (this.f3895) {
            this.f3890 = null;
            this.f3892 = null;
            this.f3888 = null;
        }
    }

    @Override // androidx.compose.runtime.AbstractC1332
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void mo2404() {
        synchronized (this.f3895) {
            try {
                this.f3892 = this.f3893;
                if (this.f3887 == null) {
                    this.f3888 = null;
                } else {
                    if (this.f3888 == null) {
                        C0235 c0235 = AbstractC0285.f997;
                        this.f3888 = new C0235();
                    }
                    C0235 c02352 = this.f3888;
                    this.f3888 = this.f3887;
                    this.f3887 = c02352;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
