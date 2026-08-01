package top.suzhelan.plugin.sdk.online.presenter;

import com.bumptech.glide.load.engine.C3005;
import java.util.LinkedHashMap;
import kotlinx.coroutines.AbstractC5395;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.internal.C5351;
import p052.InterfaceC6558;
import p087.C7068;
import p095.C7207;
import p095.ExecutorC7208;
import p252.C8188;
import p385.C9066;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f15916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5351 f15917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5808 f15918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f15919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3005 f15920;

    public C5805(C3005 c3005) {
        this.f15920 = c3005;
        C5808 c5808 = new C5808(this);
        this.f15918 = c5808;
        C7207 c7207 = AbstractC5395.f15030;
        this.f15917 = AbstractC5399.m10489(ExecutorC7208.f19225.plus(c5808));
        this.f15916 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11215(String str, String str2, C8188 c8188) {
        str2.getClass();
        AbstractC5399.m10477(this.f15917, null, null, new PluginPresenter$unzipPlugin$1(str, str2, c8188, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11216() {
        AbstractC5399.m10477(this.f15917, null, null, new PluginPresenter$getTags$1(this, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11217(String str, InterfaceC6558 interfaceC6558) {
        str.getClass();
        AbstractC5399.m10477(this.f15917, null, null, new PluginPresenter$getPlugins$1(str, "time", this, interfaceC6558, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11218(C9066 c9066, String str, C7068 c7068) {
        c9066.getClass();
        C7207 c7207 = AbstractC5395.f15030;
        AbstractC5399.m10477(this.f15917, ExecutorC7208.f19225.plus(this.f15918), null, new PluginPresenter$downloadPlugin$1(str, c9066, c7068, null), 2);
    }
}
