package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3249;
import org.slf4j.Marker;
import p260.C8246;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8332 implements InterfaceC3249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f22992;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3251 f22993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Class f22994;

    public C8332(Class cls, Class cls2, AbstractC3251 abstractC3251) {
        this.f22994 = cls;
        this.f22992 = cls2;
        this.f22993 = abstractC3251;
    }

    public final String toString() {
        return "Factory[type=" + this.f22992.getName() + Marker.ANY_NON_NULL_MARKER + this.f22994.getName() + ",adapter=" + this.f22993 + "]";
    }

    @Override // com.google.gson.InterfaceC3249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
        Class cls = c8246.f22815;
        if (cls == this.f22994 || cls == this.f22992) {
            return this.f22993;
        }
        return null;
    }
}
