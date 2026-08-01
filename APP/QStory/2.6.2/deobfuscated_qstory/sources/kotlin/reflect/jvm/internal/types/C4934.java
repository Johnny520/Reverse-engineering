package kotlin.reflect.jvm.internal.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.C4988;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC4860;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p082.C7028;
import p082.C7033;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.types.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4934 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC6988 f14284;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14285;

    public C4934(AbstractC6988 abstractC6988, C7028 c7028, AbstractC4877 abstractC4877, C7033 c7033) {
        this.f14285 = 2;
        this.f14284 = abstractC6988;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f14285;
        AbstractC6988 abstractC6988 = this.f14284;
        switch (i) {
            case 0:
                C4928 c4928 = (C4928) obj;
                c4928.getClass();
                List<InterfaceC4462> listMo9025 = abstractC6988.mo9025();
                listMo9025.getClass();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listMo9025, 10));
                for (InterfaceC4462 interfaceC4462 : listMo9025) {
                    interfaceC4462.getClass();
                    arrayList.add(new C4988(c4928, interfaceC4462));
                }
                return arrayList;
            case 1:
                ((C4928) obj).getClass();
                Collection collectionMo9504 = abstractC6988.mo9011().mo9504();
                collectionMo9504.getClass();
                Collection collection = collectionMo9504;
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C4937((AbstractC4881) it.next(), 0));
                }
                return arrayList2;
            default:
                ((AbstractC4860) obj).getClass();
                AbstractC4772.m9508(abstractC6988);
                return null;
        }
    }

    public /* synthetic */ C4934(AbstractC6988 abstractC6988, int i) {
        this.f14285 = i;
        this.f14284 = abstractC6988;
    }
}
