package p257;

import io.ktor.client.engine.AbstractC4711;
import io.ktor.client.plugins.C4758;
import io.ktor.http.content.AbstractC4819;
import io.ktor.util.C5036;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.C6254;
import kotlinx.coroutines.InterfaceC6284;
import p252.C8922;
import p252.C8928;
import p252.C8946;

/* JADX INFO: renamed from: 飘花落叶言楪兰世苏子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5036 f22794;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6284 f22795;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC4819 f22796;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8946 f22797;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8928 f22798;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8922 f22799;

    public C8968(C8922 c8922, C8928 c8928, C8946 c8946, AbstractC4819 abstractC4819, C6254 c6254, C5036 c5036) {
        c8928.getClass();
        c6254.getClass();
        c5036.getClass();
        this.f22799 = c8922;
        this.f22798 = c8928;
        this.f22797 = c8946;
        this.f22796 = abstractC4819;
        this.f22795 = c6254;
        this.f22794 = c5036;
        Map map = (Map) c5036.m9146(AbstractC4711.f12438);
        if (map == null || map.keySet() == null) {
            EmptySet emptySet = EmptySet.INSTANCE;
        }
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f22799 + ", method=" + this.f22798 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m14151() {
        Map map = (Map) this.f22794.m9146(AbstractC4711.f12438);
        if (map != null) {
            return map.get(C4758.f12483);
        }
        return null;
    }
}
