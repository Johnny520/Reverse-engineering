package p046;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C4465;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5116;
import p073.C6927;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6485 implements InterfaceC6481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f17772;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17773;

    public C6485(int i, List list) {
        this.f17773 = i;
        switch (i) {
            case 1:
                list.getClass();
                this.f17772 = list;
                break;
            default:
                this.f17772 = list;
                break;
        }
    }

    @Override // p046.InterfaceC6481
    public final boolean isEmpty() {
        int i = this.f17773;
        Object obj = this.f17772;
        switch (i) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC6481) it.next()).isEmpty()) {
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
        int i = this.f17773;
        Object obj = this.f17772;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new C5116(AbstractC5122.m10114(AbstractC4344.m8803((List) obj), C6483.f17769));
            default:
                return EmptyList.INSTANCE.iterator();
        }
    }

    public String toString() {
        switch (this.f17773) {
            case 0:
                return ((List) this.f17772).toString();
            default:
                return super.toString();
        }
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC6478 mo9517(C4687 c4687) {
        int i = this.f17773;
        Object obj = this.f17772;
        switch (i) {
            case 0:
                return AbstractC8190.m13684(this, c4687);
            case 1:
                c4687.getClass();
                C5116 c5116 = new C5116(AbstractC5122.m10112(AbstractC4344.m8803((List) obj), new C4465(c4687, 1)));
                return (InterfaceC6478) (c5116.hasNext() ? c5116.next() : null);
            default:
                c4687.getClass();
                if (c4687.equals((C4687) obj)) {
                    return C6927.f18481;
                }
                return null;
        }
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final boolean mo9518(C4687 c4687) {
        switch (this.f17773) {
            case 1:
                c4687.getClass();
                Iterator it = ((Iterable) AbstractC4344.m8803((List) this.f17772).f12928).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC6481) it.next()).mo9518(c4687)) {
                        break;
                    }
                }
                break;
        }
        return AbstractC8190.m13700(this, c4687);
    }

    public C6485(C4687 c4687) {
        this.f17773 = 2;
        c4687.getClass();
        this.f17772 = c4687;
    }
}
