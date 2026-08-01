package top.suzhelan.plugin.sdk.online.presenter;

import androidx.activity.compose.C0004;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.internal.C5351;
import p052.InterfaceC6558;
import p095.C7207;
import p095.ExecutorC7208;
import p116.C7342;
import p386.C9075;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5351 f15921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f15922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9075 f15923;

    public C5806(C9075 c9075) {
        this.f15923 = c9075;
        C5808 c5808 = new C5808(this);
        C7207 c7207 = AbstractC5395.f15030;
        this.f15921 = AbstractC5399.m10489(ExecutorC7208.f19225.plus(c5808));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11219(int i, C0004 c0004) {
        AbstractC5399.m10477(this.f15921, null, null, new MessagePresenter$markAsRead$1(i, this, c0004, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11220(C7342 c7342) {
        AbstractC5399.m10477(this.f15921, null, null, new MessagePresenter$markAllAsRead$1(this, c7342, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11221(int i, int i2, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582) {
        AbstractC5399.m10477(this.f15921, null, null, new MessagePresenter$getMessages$2(i, i2, this, interfaceC6558, interfaceC65582, null), 3);
    }
}
