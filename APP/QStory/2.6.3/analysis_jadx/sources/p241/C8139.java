package p241;

import io.ktor.client.engine.AbstractC3879;
import io.ktor.client.plugins.C3926;
import io.ktor.http.content.AbstractC3987;
import io.ktor.util.C4204;
import java.util.Map;
import kotlin.collections.EmptySet;
import kotlinx.coroutines.C5422;
import kotlinx.coroutines.InterfaceC5452;
import p236.C8093;
import p236.C8099;
import p236.C8117;

/* JADX INFO: renamed from: 飘花落叶言楪兰世苏子哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8139 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4204 f22449;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5452 f22450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3987 f22451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8117 f22452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8099 f22453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8093 f22454;

    public C8139(C8093 c8093, C8099 c8099, C8117 c8117, AbstractC3987 abstractC3987, C5422 c5422, C4204 c4204) {
        c8099.getClass();
        c5422.getClass();
        c4204.getClass();
        this.f22454 = c8093;
        this.f22453 = c8099;
        this.f22452 = c8117;
        this.f22451 = abstractC3987;
        this.f22450 = c5422;
        this.f22449 = c4204;
        Map map = (Map) c4204.m8587(AbstractC3879.f12093);
        if (map == null || map.keySet() == null) {
            EmptySet emptySet = EmptySet.INSTANCE;
        }
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.f22454 + ", method=" + this.f22453 + ')';
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m13592() {
        Map map = (Map) this.f22449.m8587(AbstractC3879.f12093);
        if (map != null) {
            return map.get(C3926.f12138);
        }
        return null;
    }
}
