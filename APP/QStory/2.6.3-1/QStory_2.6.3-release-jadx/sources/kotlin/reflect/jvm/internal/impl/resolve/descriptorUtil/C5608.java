package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import p095.C7808;
import p119.InterfaceC8101;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5608 implements InterfaceC8101 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5608 f14259 = new C5608(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14260;

    public /* synthetic */ C5608(int i) {
        this.f14260 = i;
    }

    @Override // p119.InterfaceC8101
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Iterable mo4720(Object obj) {
        Collection collectionMo9589;
        switch (this.f14260) {
            case 0:
                int i = AbstractC5605.f14254;
                Collection collectionMo95892 = ((C7808) ((InterfaceC5288) obj)).mo9589();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(collectionMo95892, 10));
                Iterator it = ((ArrayList) collectionMo95892).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7808) ((InterfaceC5288) it.next())).mo9561());
                }
                return arrayList;
            default:
                InterfaceC5312 interfaceC5312 = (InterfaceC5312) obj;
                return (interfaceC5312 == null || (collectionMo9589 = interfaceC5312.mo9589()) == null) ? EmptyList.INSTANCE : collectionMo9589;
        }
    }
}
