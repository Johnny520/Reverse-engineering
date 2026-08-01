package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import p079.C6978;
import p103.InterfaceC7271;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4775 implements InterfaceC7271 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4775 f13910 = new C4775(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13911;

    public /* synthetic */ C4775(int i) {
        this.f13911 = i;
    }

    @Override // p103.InterfaceC7271
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Iterable mo4150(Object obj) {
        Collection collectionMo9040;
        switch (this.f13911) {
            case 0:
                int i = AbstractC4772.f13905;
                Collection collectionMo90402 = ((C6978) ((InterfaceC4455) obj)).mo9040();
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(collectionMo90402, 10));
                Iterator it = ((ArrayList) collectionMo90402).iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6978) ((InterfaceC4455) it.next())).mo9012());
                }
                return arrayList;
            default:
                InterfaceC4479 interfaceC4479 = (InterfaceC4479) obj;
                return (interfaceC4479 == null || (collectionMo9040 = interfaceC4479.mo9040()) == null) ? EmptyList.INSTANCE : collectionMo9040;
        }
    }
}
