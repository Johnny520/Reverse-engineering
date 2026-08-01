package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.appcompat.app.C0108;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4474;
import p022.C6267;
import p049.AbstractC6525;
import p052.InterfaceC6542;
import p079.C6987;
import p079.C7016;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4420 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6987 f13023;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13024;

    public /* synthetic */ C4420(C6987 c6987, int i) {
        this.f13024 = i;
        this.f13023 = c6987;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13024;
        C6987 c6987 = this.f13023;
        switch (i) {
            case 0:
                return new C4424(c6987);
            case 1:
                return c6987.mo9072(AbstractC6525.f17858).f18819;
            default:
                C0108 c0108 = c6987.f18708;
                if (c0108 == null) {
                    String str = c6987.getName().f13701;
                    str.getClass();
                    C6267.m11759(str, "Dependencies of module ", " were not set before querying module content");
                    return null;
                }
                List list = (List) c0108.f319;
                c6987.m12278();
                list.contains(c6987);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C6987) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC4474 interfaceC4474 = ((C6987) it2.next()).f18705;
                    interfaceC4474.getClass();
                    arrayList.add(interfaceC4474);
                }
                return new C7016(arrayList, "CompositeProvider@ModuleDescriptor for " + c6987.getName());
        }
    }
}
