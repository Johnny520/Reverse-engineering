package p046;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.types.C4899;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲苏楪.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6484 implements InterfaceC6481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4899 f17770;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC6481 f17771;

    public C6484(InterfaceC6481 interfaceC6481, C4899 c4899) {
        this.f17771 = interfaceC6481;
        this.f17770 = c4899;
    }

    @Override // p046.InterfaceC6481
    public final boolean isEmpty() {
        InterfaceC6481 interfaceC6481 = this.f17771;
        if ((interfaceC6481 instanceof Collection) && ((Collection) interfaceC6481).isEmpty()) {
            return false;
        }
        Iterator it = interfaceC6481.iterator();
        while (it.hasNext()) {
            C4687 c4687Mo9178 = ((InterfaceC6478) it.next()).mo9178();
            if (c4687Mo9178 != null && ((Boolean) this.f17770.invoke(c4687Mo9178)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f17771) {
            C4687 c4687Mo9178 = ((InterfaceC6478) obj).mo9178();
            if (c4687Mo9178 != null && ((Boolean) this.f17770.invoke(c4687Mo9178)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final InterfaceC6478 mo9517(C4687 c4687) {
        c4687.getClass();
        if (((Boolean) this.f17770.invoke(c4687)).booleanValue()) {
            return this.f17771.mo9517(c4687);
        }
        return null;
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final boolean mo9518(C4687 c4687) {
        c4687.getClass();
        if (((Boolean) this.f17770.invoke(c4687)).booleanValue()) {
            return this.f17771.mo9518(c4687);
        }
        return false;
    }
}
