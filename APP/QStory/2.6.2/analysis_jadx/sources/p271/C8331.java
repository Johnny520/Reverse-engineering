package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3248;
import org.slf4j.Marker;
import p260.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8331 implements InterfaceC3248 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f22993;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3250 f22994;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Class f22995;

    public C8331(Class cls, Class cls2, AbstractC3250 abstractC3250) {
        this.f22995 = cls;
        this.f22993 = cls2;
        this.f22994 = abstractC3250;
    }

    public final String toString() {
        return "Factory[type=" + this.f22993.getName() + Marker.ANY_NON_NULL_MARKER + this.f22995.getName() + ",adapter=" + this.f22994 + "]";
    }

    @Override // com.google.gson.InterfaceC3248
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3250 mo7334(C3252 c3252, C8245 c8245) {
        Class cls = c8245.f22816;
        if (cls == this.f22995 || cls == this.f22993) {
            return this.f22994;
        }
        return null;
    }
}
