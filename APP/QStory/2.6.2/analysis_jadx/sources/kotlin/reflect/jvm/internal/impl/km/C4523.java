package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import p085.C7053;
import p085.C7057;
import p086.C7060;
import p086.InterfaceC7059;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final ArrayList f13170;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ArrayList f13171;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final KmVariance f13172;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f13173;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f13174;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f13175;

    public C4523(int i, String str, int i2, KmVariance kmVariance) {
        str.getClass();
        kmVariance.getClass();
        this.f13175 = i;
        this.f13174 = str;
        this.f13173 = i2;
        this.f13172 = kmVariance;
        this.f13171 = new ArrayList(1);
        InterfaceC7059.f18965.getClass();
        List listM12351 = C7060.m12351();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM12351, 10));
        Iterator it = listM12351.iterator();
        while (it.hasNext()) {
            ((C7053) ((InterfaceC7059) it.next())).getClass();
            arrayList.add(new C7057());
        }
        this.f13170 = arrayList;
    }
}
