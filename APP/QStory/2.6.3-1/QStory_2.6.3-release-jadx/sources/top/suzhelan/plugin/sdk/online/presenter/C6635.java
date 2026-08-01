package top.suzhelan.plugin.sdk.online.presenter;

import com.bumptech.glide.load.engine.C3837;
import java.util.LinkedHashMap;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.internal.C6183;
import p068.InterfaceC7387;
import p103.C7897;
import p111.C8036;
import p111.ExecutorC8037;
import p268.C9017;
import p401.C9895;

/* JADX INFO: renamed from: top.suzhelan.plugin.sdk.online.presenter.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6635 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final LinkedHashMap f16261;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6183 f16262;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C6638 f16263;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f16264;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3837 f16265;

    public C6635(C3837 c3837) {
        this.f16265 = c3837;
        C6638 c6638 = new C6638(this);
        this.f16263 = c6638;
        C8036 c8036 = AbstractC6227.f15375;
        this.f16262 = AbstractC6231.m11048(ExecutorC8037.f19570.plus(c6638));
        this.f16261 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11774(String str, String str2, C9017 c9017) {
        str2.getClass();
        AbstractC6231.m11036(this.f16262, null, null, new PluginPresenter$unzipPlugin$1(str, str2, c9017, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m11775() {
        AbstractC6231.m11036(this.f16262, null, null, new PluginPresenter$getTags$1(this, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m11776(String str, InterfaceC7387 interfaceC7387) {
        str.getClass();
        AbstractC6231.m11036(this.f16262, null, null, new PluginPresenter$getPlugins$1(str, "time", this, interfaceC7387, null), 3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m11777(C9895 c9895, String str, C7897 c7897) {
        c9895.getClass();
        C8036 c8036 = AbstractC6227.f15375;
        AbstractC6231.m11036(this.f16262, ExecutorC8037.f19570.plus(this.f16263), null, new PluginPresenter$downloadPlugin$1(str, c9895, c7897, null), 2);
    }
}
