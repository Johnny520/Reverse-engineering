package kotlin.collections;

import androidx.core.view.C2268;
import java.util.Iterator;
import kotlin.sequences.InterfaceC5127;
import p052.InterfaceC6543;
import p054.InterfaceC6567;
import p087.C7108;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4342 implements Iterable, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f12925;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12926;

    public /* synthetic */ C4342(Object obj, int i) {
        this.f12926 = i;
        this.f12925 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f12926;
        Object obj = this.f12925;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new C2268(objArr);
            case 1:
                return new C4338((Iterator) ((InterfaceC6543) obj).invoke());
            case 2:
                return ((InterfaceC5127) obj).iterator();
            case 3:
                return new C2268((InterfaceC7191) obj);
            default:
                return new C2268((C7108) obj);
        }
    }
}
