package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.appcompat.app.C0108;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4475;
import p019.C6263;
import p049.AbstractC6526;
import p052.InterfaceC6543;
import p079.C6988;
import p079.C7017;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4421 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6988 f13027;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13028;

    public /* synthetic */ C4421(C6988 c6988, int i) {
        this.f13028 = i;
        this.f13027 = c6988;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13028;
        C6988 c6988 = this.f13027;
        switch (i) {
            case 0:
                return new C4425(c6988);
            case 1:
                return c6988.mo9062(AbstractC6526.f17854).f18814;
            default:
                C0108 c0108 = c6988.f18703;
                if (c0108 == null) {
                    String str = c6988.getName().f13705;
                    str.getClass();
                    C6263.m11776(str, "Dependencies of module ", " were not set before querying module content");
                    return null;
                }
                List list = (List) c0108.f319;
                c6988.m12305();
                list.contains(c6988);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C6988) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC4475 interfaceC4475 = ((C6988) it2.next()).f18700;
                    interfaceC4475.getClass();
                    arrayList.add(interfaceC4475);
                }
                return new C7017(arrayList, "CompositeProvider@ModuleDescriptor for " + c6988.getName());
        }
    }
}
