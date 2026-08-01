package p062;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.types.C5731;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7313 implements InterfaceC7310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5731 f18115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7310 f18116;

    public C7313(InterfaceC7310 interfaceC7310, C5731 c5731) {
        this.f18116 = interfaceC7310;
        this.f18115 = c5731;
    }

    @Override // p062.InterfaceC7310
    public final boolean isEmpty() {
        InterfaceC7310 interfaceC7310 = this.f18116;
        if ((interfaceC7310 instanceof Collection) && ((Collection) interfaceC7310).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC7310.iterator();
        while (it.hasNext()) {
            C5519 c5519Mo9737 = ((InterfaceC7307) it.next()).mo9737();
            if (c5519Mo9737 != null && ((Boolean) this.f18115.invoke(c5519Mo9737)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f18116) {
            C5519 c5519Mo9737 = ((InterfaceC7307) obj).mo9737();
            if (c5519Mo9737 != null && ((Boolean) this.f18115.invoke(c5519Mo9737)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC7307 mo10076(C5519 c5519) {
        c5519.getClass();
        if (((Boolean) this.f18115.invoke(c5519)).booleanValue()) {
            return this.f18116.mo10076(c5519);
        }
        return null;
    }

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final boolean mo10077(C5519 c5519) {
        c5519.getClass();
        if (((Boolean) this.f18115.invoke(c5519)).booleanValue()) {
            return this.f18116.mo10077(c5519);
        }
        return false;
    }
}
