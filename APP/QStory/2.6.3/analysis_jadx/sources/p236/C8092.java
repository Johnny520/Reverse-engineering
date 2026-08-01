package p236;

import io.ktor.util.AbstractC4213;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4345;
import p316.C8667;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8092 implements InterfaceC8094 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8105 f22323;

    public C8092(C8105 c8105) {
        this.f22323 = c8105;
    }

    @Override // p236.InterfaceC8094
    public final InterfaceC8095 build() {
        return C8667.m14385(this.f22323);
    }

    @Override // io.ktor.util.InterfaceC4215
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo2409(String str, List list) {
        str.getClass();
        list.getClass();
        String strM13576 = AbstractC8111.m13576(str, false);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(AbstractC8111.m13576(str2, true));
        }
        this.f22323.mo2409(strM13576, arrayList);
    }

    @Override // io.ktor.util.InterfaceC4215
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo2418() {
        return ((AbstractC4213) C8667.m14385(this.f22323)).mo8353();
    }

    @Override // io.ktor.util.InterfaceC4215
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo2423(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22323.mo2423(AbstractC8111.m13576(str, false), AbstractC8111.m13576(str2, true));
    }
}
