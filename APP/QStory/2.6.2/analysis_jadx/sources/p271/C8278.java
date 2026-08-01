package p271;

import com.google.gson.AbstractC3250;
import com.google.gson.C3252;
import com.google.gson.InterfaceC3248;
import p260.C8245;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8278 implements InterfaceC3248 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f22903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3250 f22904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22905;

    public /* synthetic */ C8278(Class cls, AbstractC3250 abstractC3250, int i) {
        this.f22905 = i;
        this.f22903 = cls;
        this.f22904 = abstractC3250;
    }

    public final String toString() {
        int i = this.f22905;
        AbstractC3250 abstractC3250 = this.f22904;
        Class cls = this.f22903;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + abstractC3250 + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + abstractC3250 + "]";
        }
    }

    @Override // com.google.gson.InterfaceC3248
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3250 mo7334(C3252 c3252, C8245 c8245) {
        int i = this.f22905;
        Class cls = this.f22903;
        switch (i) {
            case 0:
                if (c8245.f22816 == cls) {
                    return this.f22904;
                }
                return null;
            default:
                Class<?> cls2 = c8245.f22816;
                if (cls.isAssignableFrom(cls2)) {
                    return new C8305(this, cls2);
                }
                return null;
        }
    }
}
