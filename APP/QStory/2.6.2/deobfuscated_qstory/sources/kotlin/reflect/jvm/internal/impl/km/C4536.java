package kotlin.reflect.jvm.internal.impl.km;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import p085.C7052;
import p085.C7053;
import p086.C7060;
import p086.InterfaceC7059;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4536 implements InterfaceC4528 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ArrayList f13224;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final ArrayList f13227 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f13226 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ArrayList f13225 = new ArrayList(0);

    public C4536() {
        InterfaceC7059.f18965.getClass();
        List listM12351 = C7060.m12351();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM12351, 10));
        Iterator it = listM12351.iterator();
        while (it.hasNext()) {
            ((C7053) ((InterfaceC7059) it.next())).getClass();
            arrayList.add(new C7052());
        }
        this.f13224 = arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.InterfaceC4528
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final ArrayList mo9138() {
        return this.f13225;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.InterfaceC4528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final ArrayList mo9139() {
        return this.f13227;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.InterfaceC4528
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final ArrayList mo9140() {
        return this.f13226;
    }
}
