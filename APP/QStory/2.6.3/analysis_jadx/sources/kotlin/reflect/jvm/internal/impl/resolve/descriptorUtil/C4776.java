package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import p079.C6979;
import p103.InterfaceC7272;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4776 implements InterfaceC7272 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4776 f13914 = new C4776(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13915;

    public /* synthetic */ C4776(int i) {
        this.f13915 = i;
    }

    @Override // p103.InterfaceC7272
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Iterable mo4160(Object obj) {
        Collection collectionMo9030;
        switch (this.f13915) {
            case 0:
                int i = AbstractC4773.f13909;
                Collection collectionMo90302 = ((C6979) ((InterfaceC4456) obj)).mo9030();
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(collectionMo90302, 10));
                Iterator it = ((ArrayList) collectionMo90302).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6979) ((InterfaceC4456) it.next())).mo9002());
                }
                return arrayList;
            default:
                InterfaceC4480 interfaceC4480 = (InterfaceC4480) obj;
                return (interfaceC4480 == null || (collectionMo9030 = interfaceC4480.mo9030()) == null) ? EmptyList.INSTANCE : collectionMo9030;
        }
    }
}
