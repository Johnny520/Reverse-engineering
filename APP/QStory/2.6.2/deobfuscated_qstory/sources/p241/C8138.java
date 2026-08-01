package p241;

import io.ktor.client.engine.AbstractC3878;
import io.ktor.client.plugins.C3925;
import io.ktor.http.content.AbstractC3986;
import io.ktor.util.C4203;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.C5421;
import kotlinx.coroutines.InterfaceC5451;
import p236.C8092;
import p236.C8098;
import p236.C8116;

/* JADX INFO: renamed from: 飘花落叶言楪兰世苏子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8138 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4203 f22451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5451 f22452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3986 f22453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8116 f22454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8098 f22455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8092 f22456;

    public C8138(C8092 c8092, C8098 c8098, C8116 c8116, AbstractC3986 abstractC3986, C5421 c5421, C4203 c4203) {
        c8098.getClass();
        c5421.getClass();
        c4203.getClass();
        this.f22456 = c8092;
        this.f22455 = c8098;
        this.f22454 = c8116;
        this.f22453 = abstractC3986;
        this.f22452 = c5421;
        this.f22451 = c4203;
        Map map = (Map) c4203.m8597(AbstractC3878.f12088);
        if (map == null || map.keySet() == null) {
            EmptySet emptySet = EmptySet.INSTANCE;
        }
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f22456 + ", method=" + this.f22455 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m13563() {
        Map map = (Map) this.f22451.m8597(AbstractC3878.f12088);
        if (map != null) {
            return map.get(C3925.f12133);
        }
        return null;
    }
}
