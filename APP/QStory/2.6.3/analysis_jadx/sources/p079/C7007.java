package p079;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p018.AbstractC6253;
import p052.InterfaceC6543;
import p101.C7255;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7007 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7004 f18825;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f18826;

    public /* synthetic */ C7007(C7004 c7004, int i) {
        this.f18826 = i;
        this.f18825 = c7004;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f18826;
        C7004 c7004 = this.f18825;
        switch (i) {
            case 0:
                C6988 c6988 = c7004.f18815;
                c6988.m12305();
                C7017 c7017 = (C7017) c6988.f18696.getValue();
                C4687 c4687 = c7004.f18812;
                c7017.getClass();
                c4687.getClass();
                ArrayList arrayList = new ArrayList();
                c7017.mo8953(c4687, arrayList);
                return arrayList;
            case 1:
                C6988 c69882 = c7004.f18815;
                c69882.m12305();
                return Boolean.valueOf(AbstractC4491.m9081((C7017) c69882.f18696.getValue(), c7004.f18812));
            default:
                C4847 c4847 = c7004.f18813;
                InterfaceC5088[] interfaceC5088Arr = C7004.f18810;
                boolean zBooleanValue = ((Boolean) AbstractC6253.m11749(c4847, interfaceC5088Arr[1])).booleanValue();
                C4687 c46872 = c7004.f18812;
                C6988 c69883 = c7004.f18815;
                if (zBooleanValue) {
                    return C7255.f19336;
                }
                List list = (List) AbstractC6253.m11749(c7004.f18811, interfaceC5088Arr[0]);
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((InterfaceC4466) it.next()).mo8950());
                }
                return AbstractC3056.m6722("package view scope for " + c46872 + " in " + c69883.getName(), AbstractC4344.m8794(arrayList2, new C6980(c69883, c46872)));
        }
    }
}
