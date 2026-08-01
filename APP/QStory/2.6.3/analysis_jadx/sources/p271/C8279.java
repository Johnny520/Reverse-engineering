package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3249;
import p260.C8246;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8279 implements InterfaceC3249 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f22902;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC3251 f22903;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f22904;

    public /* synthetic */ C8279(Class cls, AbstractC3251 abstractC3251, int i) {
        this.f22904 = i;
        this.f22902 = cls;
        this.f22903 = abstractC3251;
    }

    public final String toString() {
        int i = this.f22904;
        AbstractC3251 abstractC3251 = this.f22903;
        Class cls = this.f22902;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + abstractC3251 + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + abstractC3251 + "]";
        }
    }

    @Override // com.google.gson.InterfaceC3249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
        int i = this.f22904;
        Class cls = this.f22902;
        switch (i) {
            case 0:
                if (c8246.f22815 == cls) {
                    return this.f22903;
                }
                return null;
            default:
                Class<?> cls2 = c8246.f22815;
                if (cls.isAssignableFrom(cls2)) {
                    return new C8306(this, cls2);
                }
                return null;
        }
    }
}
