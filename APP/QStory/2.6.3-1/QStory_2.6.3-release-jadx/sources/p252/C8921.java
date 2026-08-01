package p252;

import io.ktor.util.AbstractC5045;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5177;
import p332.C9496;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8921 implements InterfaceC8923 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8934 f22668;

    public C8921(C8934 c8934) {
        this.f22668 = c8934;
    }

    @Override // p252.InterfaceC8923
    public final InterfaceC8924 build() {
        return C9496.m14944(this.f22668);
    }

    @Override // io.ktor.util.InterfaceC5047
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo2969(String str, List list) {
        str.getClass();
        list.getClass();
        String strM14135 = AbstractC8940.m14135(str, false);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(AbstractC8940.m14135(str2, true));
        }
        this.f22668.mo2969(strM14135, arrayList);
    }

    @Override // io.ktor.util.InterfaceC5047
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo2978() {
        return ((AbstractC5045) C9496.m14944(this.f22668)).mo8912();
    }

    @Override // io.ktor.util.InterfaceC5047
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo2983(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22668.mo2983(AbstractC8940.m14135(str, false), AbstractC8940.m14135(str2, true));
    }
}
