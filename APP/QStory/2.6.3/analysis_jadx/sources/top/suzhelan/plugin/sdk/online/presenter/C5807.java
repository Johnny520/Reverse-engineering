package top.suzhelan.plugin.sdk.online.presenter;

import androidx.compose.foundation.C1060;
import androidx.compose.runtime.internal.C1251;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.C5417;
import kotlinx.coroutines.internal.C5351;
import p052.InterfaceC6558;
import p095.C7207;
import p095.ExecutorC7208;
import p385.C9072;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5807 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C9072 f15924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5351 f15925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f15926;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1251 f15927;

    public C5807(C1251 c1251) {
        this.f15927 = c1251;
        C5808 c5808 = new C5808(this);
        C7207 c7207 = AbstractC5395.f15030;
        this.f15925 = AbstractC5399.m10489(ExecutorC7208.f19225.plus(c5808));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5417 m11222(String str, InterfaceC6558 interfaceC6558) {
        str.getClass();
        return AbstractC5399.m10477(this.f15925, null, null, new CommentPresenter$getComments$2(str, this, interfaceC6558, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11223(String str, String str2, C1060 c1060) {
        str.getClass();
        str2.getClass();
        AbstractC5399.m10477(this.f15925, null, null, new CommentPresenter$addComment$1(this, str2, str, c1060, null), 3);
    }
}
