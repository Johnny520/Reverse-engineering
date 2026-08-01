package p101;

import androidx.compose.runtime.C1322;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p066.AbstractC6876;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7265 implements InterfaceC7254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f19360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f19361 = 0;

    public C7265(C4845 c4845, InterfaceC6543 interfaceC6543) {
        c4845.getClass();
        this.f19360 = new C4847(c4845, new C1322(interfaceC6543, 21));
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        switch (this.f19361) {
            case 1:
                c4691.getClass();
                noLookupLocation.getClass();
                return AbstractC6876.m12127(m12482(c4691, noLookupLocation), C7262.f19356);
            default:
                return m12482(c4691, noLookupLocation);
        }
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9166() {
        return m12480().mo9166();
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        switch (this.f19361) {
            case 1:
                c4691.getClass();
                noLookupLocation.getClass();
                return AbstractC6876.m12127(m12479(c4691, noLookupLocation), C7262.f19354);
            default:
                return m12479(c4691, noLookupLocation);
        }
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return m12480().mo9155(c4691, noLookupLocation);
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9168() {
        return m12480().mo9168();
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        switch (this.f19361) {
            case 1:
                c7248.getClass();
                Collection collectionM12481 = m12481(c7248, interfaceC6558);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionM12481) {
                    if (((InterfaceC4499) obj) instanceof InterfaceC4481) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                List list = (List) pair.component1();
                List list2 = (List) pair.component2();
                list.getClass();
                return AbstractC4344.m8793(list2, AbstractC6876.m12127(list, C7262.f19353));
            default:
                return m12481(c7248, interfaceC6558);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC7254 m12478() {
        if (!(m12480() instanceof C7265)) {
            return m12480();
        }
        InterfaceC7254 interfaceC7254M12480 = m12480();
        interfaceC7254M12480.getClass();
        return ((C7265) interfaceC7254M12480).m12478();
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9172() {
        return m12480().mo9172();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Collection m12479(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return m12480().mo9167(c4691, noLookupLocation);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC7254 m12480() {
        switch (this.f19361) {
            case 0:
                return (InterfaceC7254) ((C4847) this.f19360).invoke();
            default:
                return (InterfaceC7254) this.f19360;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Collection m12481(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        return m12480().mo9169(c7248, interfaceC6558);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Collection m12482(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return m12480().mo9165(c4691, noLookupLocation);
    }

    public C7265(InterfaceC7254 interfaceC7254) {
        this.f19360 = interfaceC7254;
    }
}
