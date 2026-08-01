package kotlin.reflect.jvm.internal.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.C4989;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4861;
import p052.InterfaceC6558;
import p079.AbstractC6989;
import p082.C7029;
import p082.C7034;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4935 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC6989 f14286;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14287;

    public C4935(AbstractC6989 abstractC6989, C7029 c7029, AbstractC4878 abstractC4878, C7034 c7034) {
        this.f14287 = 2;
        this.f14286 = abstractC6989;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        int i = this.f14287;
        AbstractC6989 abstractC6989 = this.f14286;
        switch (i) {
            case 0:
                C4929 c4929 = (C4929) obj;
                c4929.getClass();
                List<InterfaceC4463> listMo9015 = abstractC6989.mo9015();
                listMo9015.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listMo9015, 10));
                for (InterfaceC4463 interfaceC4463 : listMo9015) {
                    interfaceC4463.getClass();
                    arrayList.add(new C4989(c4929, interfaceC4463));
                }
                return arrayList;
            case 1:
                ((C4929) obj).getClass();
                Collection collectionMo9494 = abstractC6989.mo9001().mo9494();
                collectionMo9494.getClass();
                Collection collection = collectionMo9494;
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C4938((AbstractC4882) it.next(), 0));
                }
                return arrayList2;
            default:
                ((AbstractC4861) obj).getClass();
                AbstractC4773.m9498(abstractC6989);
                return null;
        }
    }

    public /* synthetic */ C4935(AbstractC6989 abstractC6989, int i) {
        this.f14287 = i;
        this.f14286 = abstractC6989;
    }
}
