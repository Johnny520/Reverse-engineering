package p062;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C5297;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5948;
import p089.C7756;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7314 implements InterfaceC7310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f18117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18118;

    public C7314(int i, List list) {
        this.f18118 = i;
        switch (i) {
            case 1:
                list.getClass();
                this.f18117 = list;
                break;
            default:
                this.f18117 = list;
                break;
        }
    }

    @Override // p062.InterfaceC7310
    public final boolean isEmpty() {
        int i = this.f18118;
        Object obj = this.f18117;
        switch (i) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC7310) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f18118;
        Object obj = this.f18117;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new C5948(AbstractC5954.m10673(AbstractC5176.m9362((List) obj), C7312.f18114));
            default:
                return EmptyList.INSTANCE.iterator();
        }
    }

    public String toString() {
        switch (this.f18118) {
            case 0:
                return ((List) this.f18117).toString();
            default:
                return super.toString();
        }
    }

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC7307 mo10076(C5519 c5519) {
        int i = this.f18118;
        Object obj = this.f18117;
        switch (i) {
            case 0:
                return AbstractC9019.m14243(this, c5519);
            case 1:
                c5519.getClass();
                C5948 c5948 = new C5948(AbstractC5954.m10671(AbstractC5176.m9362((List) obj), new C5297(c5519, 1)));
                return (InterfaceC7307) (c5948.hasNext() ? c5948.next() : null);
            default:
                c5519.getClass();
                if (c5519.equals((C5519) obj)) {
                    return C7756.f18826;
                }
                return null;
        }
    }

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final boolean mo10077(C5519 c5519) {
        switch (this.f18118) {
            case 1:
                c5519.getClass();
                Iterator it = ((Iterable) AbstractC5176.m9362((List) this.f18117).f13273).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC7310) it.next()).mo10077(c5519)) {
                        break;
                    }
                }
                break;
        }
        return AbstractC9019.m14259(this, c5519);
    }

    public C7314(C5519 c5519) {
        this.f18118 = 2;
        c5519.getClass();
        this.f18117 = c5519;
    }
}
