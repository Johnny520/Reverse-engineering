package top.suzhelan.plugin.sdk.online.presenter;

import androidx.activity.compose.C0851;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.internal.C6183;
import p068.InterfaceC7387;
import p111.C8036;
import p111.ExecutorC8037;
import p132.C8171;
import p402.C9904;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6636 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6183 f16266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f16267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9904 f16268;

    public C6636(C9904 c9904) {
        this.f16268 = c9904;
        C6638 c6638 = new C6638(this);
        C8036 c8036 = AbstractC6227.f15375;
        this.f16266 = AbstractC6231.m11048(ExecutorC8037.f19570.plus(c6638));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11778(int i, C0851 c0851) {
        AbstractC6231.m11036(this.f16266, null, null, new MessagePresenter$markAsRead$1(i, this, c0851, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11779(C8171 c8171) {
        AbstractC6231.m11036(this.f16266, null, null, new MessagePresenter$markAllAsRead$1(this, c8171, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11780(int i, int i2, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        AbstractC6231.m11036(this.f16266, null, null, new MessagePresenter$getMessages$2(i, i2, this, interfaceC7387, interfaceC73872, null), 3);
    }
}
