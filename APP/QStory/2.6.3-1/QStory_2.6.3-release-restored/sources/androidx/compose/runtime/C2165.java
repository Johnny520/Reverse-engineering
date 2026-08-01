package androidx.compose.runtime;

import androidx.collection.AbstractC1132;
import androidx.collection.C1082;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.C2102;
import kotlin.collections.AbstractC5176;
import kotlinx.coroutines.channels.InterfaceC6032;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2165 extends AbstractC2167 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C1082 f4232;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1082 f4233;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2102 f4234;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC6032 f4235;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C2220 f4236;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Object f4237;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f4238;

    public C2165() {
        super(0);
        this.f4236 = new C2220(this, 2);
        C2216 c2216 = new C2216(this, 4);
        AbstractC2115.m2819(AbstractC2115.f4092);
        synchronized (AbstractC2115.f4090) {
            AbstractC2115.f4093 = AbstractC5176.m9353(AbstractC2115.f4093, c2216);
        }
        this.f4234 = new C2102(c2216);
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public final void mo2960(InterfaceC6039 interfaceC6039) {
        this.f4235 = null;
        this.f4238 = null;
        this.f4232 = null;
        mo2964();
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public final InterfaceC7387 mo2961(InterfaceC6032 interfaceC6032) {
        InterfaceC6032 interfaceC60322 = this.f4235;
        if (interfaceC60322 != null && !interfaceC60322.equals(interfaceC6032)) {
            AbstractC2227.m3097("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
        }
        this.f4235 = interfaceC6032;
        return this.f4236;
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final void mo2962(InterfaceC6032 interfaceC6032) {
        this.f4238 = null;
        this.f4232 = null;
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public final void mo2963() {
        this.f4234.m2785();
        this.f4238 = null;
        this.f4232 = null;
        synchronized (this.f4240) {
            this.f4235 = null;
            this.f4237 = null;
            this.f4233 = null;
        }
    }

    @Override // androidx.compose.runtime.AbstractC2167
    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public final void mo2964() {
        synchronized (this.f4240) {
            try {
                this.f4237 = this.f4238;
                if (this.f4232 == null) {
                    this.f4233 = null;
                } else {
                    if (this.f4233 == null) {
                        C1082 c1082 = AbstractC1132.f1342;
                        this.f4233 = new C1082();
                    }
                    C1082 c10822 = this.f4233;
                    this.f4233 = this.f4232;
                    this.f4232 = c10822;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
