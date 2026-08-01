package p055;

import com.bumptech.glide.C3902;
import java.lang.reflect.Method;
import java.util.Iterator;
import p035.C7092;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p303.AbstractC9234;
import p408.C9927;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7253 extends AbstractC7140 implements InterfaceC7146 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        C9927 c9927 = new C9927();
        c9927.m15246(AbstractC9234.m14531(173));
        c9927.f25838 = Boolean.TYPE;
        Iterator it = c9927.m15249().iterator();
        while (it.hasNext()) {
            m12390((Method) it.next(), new C7092(9));
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(172);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        C9927 c9927 = new C9927();
        c9927.m15246(AbstractC9234.m14531(173));
        c9927.f25838 = Boolean.TYPE;
        c9927.m15249();
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
    }
}
