package p271;

import com.google.gson.AbstractC3251;
import com.google.gson.C3253;
import com.google.gson.InterfaceC3249;
import p260.C8246;

/* JADX INFO: renamed from: 飘花落叶言楪哲子苏世兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8325 implements InterfaceC3249 {
    @Override // com.google.gson.InterfaceC3249
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final AbstractC3251 mo7321(C3253 c3253, C8246 c8246) {
        Class superclass = c8246.f22815;
        if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
            return null;
        }
        if (!superclass.isEnum()) {
            superclass = superclass.getSuperclass();
        }
        return new C8326(superclass);
    }
}
