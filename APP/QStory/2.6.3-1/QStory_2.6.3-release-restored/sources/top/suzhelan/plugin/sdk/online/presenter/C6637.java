package top.suzhelan.plugin.sdk.online.presenter;

import androidx.compose.foundation.C1898;
import androidx.compose.runtime.internal.C2086;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.internal.C6183;
import p068.InterfaceC7387;
import p111.C8036;
import p111.ExecutorC8037;
import p401.C9901;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6637 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public C9901 f16269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6183 f16270;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f16271;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2086 f16272;

    public C6637(C2086 c2086) {
        this.f16272 = c2086;
        C6638 c6638 = new C6638(this);
        C8036 c8036 = AbstractC6227.f15375;
        this.f16270 = AbstractC6231.m11048(ExecutorC8037.f19570.plus(c6638));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6249 m11781(String str, InterfaceC7387 interfaceC7387) {
        str.getClass();
        return AbstractC6231.m11036(this.f16270, null, null, new CommentPresenter$getComments$2(str, this, interfaceC7387, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11782(String str, String str2, C1898 c1898) {
        str.getClass();
        str2.getClass();
        AbstractC6231.m11036(this.f16270, null, null, new CommentPresenter$addComment$1(this, str2, str, c1898, null), 3);
    }
}
