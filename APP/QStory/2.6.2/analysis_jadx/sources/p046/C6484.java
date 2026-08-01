package p046;

import io.ktor.client.plugins.AbstractC3932;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.C4464;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5115;
import p073.C6926;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6484 implements InterfaceC6480 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f17776;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17777;

    public C6484(int i, List list) {
        this.f17777 = i;
        switch (i) {
            case 1:
                list.getClass();
                this.f17776 = list;
                break;
            default:
                this.f17776 = list;
                break;
        }
    }

    @Override // p046.InterfaceC6480
    public final boolean isEmpty() {
        int i = this.f17777;
        Object obj = this.f17776;
        switch (i) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC6480) it.next()).isEmpty()) {
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
        int i = this.f17777;
        Object obj = this.f17776;
        switch (i) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new C5115(AbstractC5121.m10105(AbstractC4343.m8790((List) obj), C6482.f17773));
            default:
                return EmptyList.INSTANCE.iterator();
        }
    }

    public String toString() {
        switch (this.f17777) {
            case 0:
                return ((List) this.f17776).toString();
            default:
                return super.toString();
        }
    }

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC6477 mo9527(C4686 c4686) {
        int i = this.f17777;
        Object obj = this.f17776;
        switch (i) {
            case 0:
                return AbstractC3932.m8318(this, c4686);
            case 1:
                c4686.getClass();
                C5115 c5115 = new C5115(AbstractC5121.m10107(AbstractC4343.m8790((List) obj), new C4464(c4686, 1)));
                return (InterfaceC6477) (c5115.hasNext() ? c5115.next() : null);
            default:
                c4686.getClass();
                if (c4686.equals((C4686) obj)) {
                    return C6926.f18486;
                }
                return null;
        }
    }

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final boolean mo9528(C4686 c4686) {
        switch (this.f17777) {
            case 1:
                c4686.getClass();
                Iterator it = ((Iterable) AbstractC4343.m8790((List) this.f17776).f12924).iterator();
                while (it.hasNext()) {
                    if (((InterfaceC6480) it.next()).mo9528(c4686)) {
                        break;
                    }
                }
                break;
        }
        return AbstractC3932.m8314(this, c4686);
    }

    public C6484(C4686 c4686) {
        this.f17777 = 2;
        c4686.getClass();
        this.f17776 = c4686;
    }
}
