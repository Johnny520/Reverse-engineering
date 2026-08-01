package p117;

import androidx.compose.runtime.C2157;
import io.ktor.util.C5043;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import p034.AbstractC7082;
import p035.C7092;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8086 implements InterfaceC8083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC6016 f19687;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public HashMap f19688;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5751 f19689;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8083 f19690;

    public C8086(InterfaceC8083 interfaceC8083, C5751 c5751) {
        interfaceC8083.getClass();
        c5751.getClass();
        this.f19690 = interfaceC8083;
        AbstractC6019.m10773(new C2157(c5751, 22));
        this.f19689 = new C5751(AbstractC7082.m12294(c5751.f14594));
        this.f19687 = AbstractC6019.m10773(new C2157(this, 23));
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return m13035(this.f19690.mo9724(c5523, noLookupLocation));
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9725() {
        return this.f19690.mo9725();
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return m13035(this.f19690.mo9726(c5523, noLookupLocation));
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        InterfaceC5309 interfaceC5309Mo9714 = this.f19690.mo9714(c5523, noLookupLocation);
        if (interfaceC5309Mo9714 != null) {
            return (InterfaceC5309) m13036(interfaceC5309Mo9714);
        }
        return null;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9727() {
        return this.f19690.mo9727();
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        return (Collection) this.f19687.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Collection m13035(Collection collection) {
        if (this.f19689.f14594.mo10293() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(m13036((InterfaceC5331) it.next()));
        }
        return linkedHashSet;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9731() {
        return this.f19690.mo9731();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC5331 m13036(InterfaceC5331 interfaceC5331) {
        C5751 c5751 = this.f19689;
        if (c5751.f14594.mo10293()) {
            return interfaceC5331;
        }
        if (this.f19688 == null) {
            this.f19688 = new HashMap();
        }
        HashMap map = this.f19688;
        map.getClass();
        Object objMo9564 = map.get(interfaceC5331);
        if (objMo9564 == null) {
            if (!(interfaceC5331 instanceof InterfaceC5296)) {
                C5043.m9151(interfaceC5331, "Unknown descriptor in scope: ");
                return null;
            }
            objMo9564 = ((InterfaceC5296) interfaceC5331).mo9564(c5751);
            if (objMo9564 == null) {
                C7092.m12335(interfaceC5331, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", " substitution fails");
                return null;
            }
            map.put(interfaceC5331, objMo9564);
        }
        return (InterfaceC5331) objMo9564;
    }
}
