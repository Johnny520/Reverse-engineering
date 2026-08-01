package kotlin.reflect.jvm.internal.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.C5821;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5693;
import p068.InterfaceC7387;
import p095.AbstractC7818;
import p098.C7858;
import p098.C7863;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5767 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC7818 f14631;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14632;

    public C5767(AbstractC7818 abstractC7818, C7858 c7858, AbstractC5710 abstractC5710, C7863 c7863) {
        this.f14632 = 2;
        this.f14631 = abstractC7818;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        int i = this.f14632;
        AbstractC7818 abstractC7818 = this.f14631;
        switch (i) {
            case 0:
                C5761 c5761 = (C5761) obj;
                c5761.getClass();
                List<InterfaceC5295> listMo9574 = abstractC7818.mo9574();
                listMo9574.getClass();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listMo9574, 10));
                for (InterfaceC5295 interfaceC5295 : listMo9574) {
                    interfaceC5295.getClass();
                    arrayList.add(new C5821(c5761, interfaceC5295));
                }
                return arrayList;
            case 1:
                ((C5761) obj).getClass();
                Collection collectionMo10053 = abstractC7818.mo9560().mo10053();
                collectionMo10053.getClass();
                Collection collection = collectionMo10053;
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C5770((AbstractC5714) it.next(), 0));
                }
                return arrayList2;
            default:
                ((AbstractC5693) obj).getClass();
                AbstractC5605.m10057(abstractC7818);
                return null;
        }
    }

    public /* synthetic */ C5767(AbstractC7818 abstractC7818, int i) {
        this.f14632 = i;
        this.f14631 = abstractC7818;
    }
}
