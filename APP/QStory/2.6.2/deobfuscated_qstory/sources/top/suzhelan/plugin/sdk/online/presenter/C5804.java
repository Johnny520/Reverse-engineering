package top.suzhelan.plugin.sdk.online.presenter;

import com.bumptech.glide.load.engine.C3004;
import java.util.LinkedHashMap;
import kotlinx.coroutines.AbstractC5394;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.internal.C5350;
import p052.InterfaceC6557;
import p087.C7067;
import p095.C7206;
import p095.ExecutorC7207;
import p252.C8187;
import p388.C9099;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5804 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f15916;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5350 f15917;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5807 f15918;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f15919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3004 f15920;

    public C5804(C3004 c3004) {
        this.f15920 = c3004;
        C5807 c5807 = new C5807(this);
        this.f15918 = c5807;
        C7206 c7206 = AbstractC5394.f15030;
        this.f15917 = AbstractC5398.m10485(ExecutorC7207.f19230.plus(c5807));
        this.f15916 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11158(String str, String str2, C8187 c8187) {
        str2.getClass();
        AbstractC5398.m10473(this.f15917, null, null, new PluginPresenter$unzipPlugin$1(str, str2, c8187, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11159() {
        AbstractC5398.m10473(this.f15917, null, null, new PluginPresenter$getTags$1(this, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11160(String str, InterfaceC6557 interfaceC6557) {
        str.getClass();
        AbstractC5398.m10473(this.f15917, null, null, new PluginPresenter$getPlugins$1(str, "time", this, interfaceC6557, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11161(C9099 c9099, String str, C7067 c7067) {
        c9099.getClass();
        C7206 c7206 = AbstractC5394.f15030;
        AbstractC5398.m10473(this.f15917, ExecutorC7207.f19230.plus(this.f15918), null, new PluginPresenter$downloadPlugin$1(str, c9099, c7067, null), 2);
    }
}
