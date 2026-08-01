package kotlin.collections;

import androidx.core.view.C3101;
import java.util.Iterator;
import kotlin.sequences.InterfaceC5959;
import p068.InterfaceC7372;
import p070.InterfaceC7396;
import p103.C7937;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5174 implements Iterable, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f13270;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13271;

    public /* synthetic */ C5174(Object obj, int i) {
        this.f13271 = i;
        this.f13270 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f13271;
        Object obj = this.f13270;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new C3101(objArr);
            case 1:
                return new C5170((Iterator) ((InterfaceC7372) obj).invoke());
            case 2:
                return ((InterfaceC5959) obj).iterator();
            case 3:
                return new C3101((InterfaceC8020) obj);
            default:
                return new C3101((C7937) obj);
        }
    }
}
