package top.suzhelan.plugin.sdk.online.presenter;

import androidx.compose.foundation.C1060;
import androidx.compose.runtime.internal.C1251;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.C5416;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6557;
import p095.C7206;
import p095.ExecutorC7207;
import p388.C9105;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5806 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C9105 f15924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5350 f15925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f15926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1251 f15927;

    public C5806(C1251 c1251) {
        this.f15927 = c1251;
        C5807 c5807 = new C5807(this);
        C7206 c7206 = AbstractC5394.f15030;
        this.f15925 = AbstractC5398.m10485(ExecutorC7207.f19230.plus(c5807));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5416 m11165(String str, InterfaceC6557 interfaceC6557) {
        str.getClass();
        return AbstractC5398.m10473(this.f15925, null, null, new CommentPresenter$getComments$2(str, this, interfaceC6557, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11166(String str, String str2, C1060 c1060) {
        str.getClass();
        str2.getClass();
        AbstractC5398.m10473(this.f15925, null, null, new CommentPresenter$addComment$1(this, str2, str, c1060, null), 3);
    }
}
