package p039;

import com.bumptech.glide.C3070;
import java.lang.reflect.Method;
import java.util.Iterator;
import p019.C6263;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p287.AbstractC8405;
import p392.C9098;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6424 extends AbstractC6311 implements InterfaceC6317 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        C9098 c9098 = new C9098();
        c9098.m14687(AbstractC8405.m13972(173));
        c9098.f25493 = Boolean.TYPE;
        Iterator it = c9098.m14690().iterator();
        while (it.hasNext()) {
            m11831((Method) it.next(), new C6263(9));
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(172);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        C9098 c9098 = new C9098();
        c9098.m14687(AbstractC8405.m13972(173));
        c9098.f25493 = Boolean.TYPE;
        c9098.m14690();
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
    }
}
