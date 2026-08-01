package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4081;
import org.slf4j.Marker;
import p276.C9075;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9161 implements InterfaceC4081 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f23337;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4083 f23338;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ Class f23339;

    public C9161(Class cls, Class cls2, AbstractC4083 abstractC4083) {
        this.f23339 = cls;
        this.f23337 = cls2;
        this.f23338 = abstractC4083;
    }

    public final String toString() {
        return "Factory[type=" + this.f23337.getName() + Marker.ANY_NON_NULL_MARKER + this.f23339.getName() + ",adapter=" + this.f23338 + "]";
    }

    @Override // com.google.gson.InterfaceC4081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4083 mo7880(C4085 c4085, C9075 c9075) {
        Class cls = c9075.f23160;
        if (cls == this.f23339 || cls == this.f23337) {
            return this.f23338;
        }
        return null;
    }
}
