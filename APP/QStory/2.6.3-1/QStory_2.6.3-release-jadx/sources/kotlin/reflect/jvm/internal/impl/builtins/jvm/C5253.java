package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.appcompat.app.C0955;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5307;
import p035.C7092;
import p065.AbstractC7355;
import p068.InterfaceC7372;
import p095.C7817;
import p095.C7846;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5253 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7817 f13372;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13373;

    public /* synthetic */ C5253(C7817 c7817, int i) {
        this.f13373 = i;
        this.f13372 = c7817;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13373;
        C7817 c7817 = this.f13372;
        switch (i) {
            case 0:
                return new C5257(c7817);
            case 1:
                return c7817.mo9621(AbstractC7355.f18199).f19159;
            default:
                C0955 c0955 = c7817.f19048;
                if (c0955 == null) {
                    String str = c7817.getName().f14050;
                    str.getClass();
                    C7092.m12335(str, "Dependencies of module ", " were not set before querying module content");
                    return null;
                }
                List list = (List) c0955.f664;
                c7817.m12864();
                list.contains(c7817);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C7817) it.next()).getClass();
                }
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC5307 interfaceC5307 = ((C7817) it2.next()).f19045;
                    interfaceC5307.getClass();
                    arrayList.add(interfaceC5307);
                }
                return new C7846(arrayList, "CompositeProvider@ModuleDescriptor for " + c7817.getName());
        }
    }
}
