package p287;

import com.google.gson.AbstractC4083;
import com.google.gson.C4085;
import com.google.gson.InterfaceC4081;
import p276.C9075;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9108 implements InterfaceC4081 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Class f23247;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ AbstractC4083 f23248;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f23249;

    public /* synthetic */ C9108(Class cls, AbstractC4083 abstractC4083, int i) {
        this.f23249 = i;
        this.f23247 = cls;
        this.f23248 = abstractC4083;
    }

    public final String toString() {
        int i = this.f23249;
        AbstractC4083 abstractC4083 = this.f23248;
        Class cls = this.f23247;
        switch (i) {
            case 0:
                return "Factory[type=" + cls.getName() + ",adapter=" + abstractC4083 + "]";
            default:
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + abstractC4083 + "]";
        }
    }

    @Override // com.google.gson.InterfaceC4081
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC4083 mo7880(C4085 c4085, C9075 c9075) {
        int i = this.f23249;
        Class cls = this.f23247;
        switch (i) {
            case 0:
                if (c9075.f23160 == cls) {
                    return this.f23248;
                }
                return null;
            default:
                Class<?> cls2 = c9075.f23160;
                if (cls.isAssignableFrom(cls2)) {
                    return new C9135(this, cls2);
                }
                return null;
        }
    }
}
