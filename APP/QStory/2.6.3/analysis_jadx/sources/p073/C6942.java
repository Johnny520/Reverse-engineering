package p073;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6942 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C6942 f18517;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f18519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6935 f18520;

    public C6942(C6935 c6935, List list, String str) {
        list.getClass();
        this.f18520 = c6935;
        this.f18519 = list;
        this.f18518 = str;
        C6942 c6942 = null;
        if (str != null) {
            C6935 c6935M12231 = c6935 != null ? c6935.m12231() : null;
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6935 c69352 = (C6935) it.next();
                arrayList.add(c69352 != null ? c69352.m12231() : null);
            }
            c6942 = new C6942(c6935M12231, arrayList, null);
        }
        this.f18517 = c6942;
    }
}
