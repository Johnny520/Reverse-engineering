package top.suzhelan.plugin.sdk.online.presenter;

import androidx.activity.compose.C0004;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6557;
import p095.C7206;
import p095.ExecutorC7207;
import p116.C7341;
import p385.C9088;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5350 f15921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f15922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9088 f15923;

    public C5805(C9088 c9088) {
        this.f15923 = c9088;
        C5807 c5807 = new C5807(this);
        C7206 c7206 = AbstractC5394.f15030;
        this.f15921 = AbstractC5398.m10485(ExecutorC7207.f19230.plus(c5807));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11162(int i, C0004 c0004) {
        AbstractC5398.m10473(this.f15921, null, null, new MessagePresenter$markAsRead$1(i, this, c0004, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11163(C7341 c7341) {
        AbstractC5398.m10473(this.f15921, null, null, new MessagePresenter$markAllAsRead$1(this, c7341, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11164(int i, int i2, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572) {
        AbstractC5398.m10473(this.f15921, null, null, new MessagePresenter$getMessages$2(i, i2, this, interfaceC6557, interfaceC65572, null), 3);
    }
}
