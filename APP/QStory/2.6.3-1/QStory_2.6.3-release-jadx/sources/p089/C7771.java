package p089;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7771 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C7771 f18862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f18863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f18864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7764 f18865;

    public C7771(C7764 c7764, List list, String str) {
        list.getClass();
        this.f18865 = c7764;
        this.f18864 = list;
        this.f18863 = str;
        C7771 c7771 = null;
        if (str != null) {
            C7764 c7764M12790 = c7764 != null ? c7764.m12790() : null;
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7764 c77642 = (C7764) it.next();
                arrayList.add(c77642 != null ? c77642.m12790() : null);
            }
            c7771 = new C7771(c7764M12790, arrayList, null);
        }
        this.f18862 = c7771;
    }
}
