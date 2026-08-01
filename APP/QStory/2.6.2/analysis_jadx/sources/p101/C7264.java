package p101;

import androidx.compose.runtime.C1322;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p066.AbstractC6875;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7264 implements InterfaceC7253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f19365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f19366 = 0;

    public C7264(C4844 c4844, InterfaceC6542 interfaceC6542) {
        c4844.getClass();
        this.f19365 = new C4846(c4844, new C1322(interfaceC6542, 21));
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        switch (this.f19366) {
            case 1:
                c4690.getClass();
                noLookupLocation.getClass();
                return AbstractC6875.m12099(m12455(c4690, noLookupLocation), C7261.f19361);
            default:
                return m12455(c4690, noLookupLocation);
        }
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9176() {
        return m12453().mo9176();
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        switch (this.f19366) {
            case 1:
                c4690.getClass();
                noLookupLocation.getClass();
                return AbstractC6875.m12099(m12452(c4690, noLookupLocation), C7261.f19359);
            default:
                return m12452(c4690, noLookupLocation);
        }
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return m12453().mo9165(c4690, noLookupLocation);
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9178() {
        return m12453().mo9178();
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        switch (this.f19366) {
            case 1:
                c7247.getClass();
                Collection collectionM12454 = m12454(c7247, interfaceC6557);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionM12454) {
                    if (((InterfaceC4498) obj) instanceof InterfaceC4480) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                Pair pair = new Pair(arrayList, arrayList2);
                List list = (List) pair.component1();
                List list2 = (List) pair.component2();
                list.getClass();
                return AbstractC4343.m8825(list2, AbstractC6875.m12099(list, C7261.f19358));
            default:
                return m12454(c7247, interfaceC6557);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC7253 m12451() {
        if (!(m12453() instanceof C7264)) {
            return m12453();
        }
        InterfaceC7253 interfaceC7253M12453 = m12453();
        interfaceC7253M12453.getClass();
        return ((C7264) interfaceC7253M12453).m12451();
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9182() {
        return m12453().mo9182();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final Collection m12452(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return m12453().mo9177(c4690, noLookupLocation);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC7253 m12453() {
        switch (this.f19366) {
            case 0:
                return (InterfaceC7253) ((C4846) this.f19365).invoke();
            default:
                return (InterfaceC7253) this.f19365;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Collection m12454(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        return m12453().mo9179(c7247, interfaceC6557);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Collection m12455(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return m12453().mo9175(c4690, noLookupLocation);
    }

    public C7264(InterfaceC7253 interfaceC7253) {
        this.f19365 = interfaceC7253;
    }
}
