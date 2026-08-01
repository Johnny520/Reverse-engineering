package p236;

import io.ktor.util.AbstractC4212;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8091 implements InterfaceC8093 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C8104 f22325;

    public C8091(C8104 c8104) {
        this.f22325 = c8104;
    }

    @Override // p236.InterfaceC8093
    public final InterfaceC8094 build() {
        return AbstractC8189.m13688(this.f22325);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final void mo2399(String str, List list) {
        str.getClass();
        list.getClass();
        String strM13547 = AbstractC8110.m13547(str, false);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(AbstractC8110.m13547(str2, true));
        }
        this.f22325.mo2399(strM13547, arrayList);
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo2408() {
        return ((AbstractC4212) AbstractC8189.m13688(this.f22325)).mo8363();
    }

    @Override // io.ktor.util.InterfaceC4214
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪 */
    public final void mo2413(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22325.mo2413(AbstractC8110.m13547(str, false), AbstractC8110.m13547(str2, true));
    }
}
