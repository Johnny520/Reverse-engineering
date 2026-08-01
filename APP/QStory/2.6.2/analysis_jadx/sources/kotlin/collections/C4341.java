package kotlin.collections;

import androidx.core.view.C2268;
import java.util.Iterator;
import kotlin.sequences.InterfaceC5126;
import p052.InterfaceC6542;
import p054.InterfaceC6566;
import p087.C7107;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlin.collections.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4341 implements Iterable, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f12921;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f12922;

    public /* synthetic */ C4341(Object obj, int i) {
        this.f12922 = i;
        this.f12921 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f12922;
        Object obj = this.f12921;
        switch (i) {
            case 0:
                Object[] objArr = (Object[]) obj;
                objArr.getClass();
                return new C2268(objArr);
            case 1:
                return new C4337((Iterator) ((InterfaceC6542) obj).invoke());
            case 2:
                return ((InterfaceC5126) obj).iterator();
            case 3:
                return new C2268((InterfaceC7190) obj);
            default:
                return new C2268((C7107) obj);
        }
    }
}
