package p101;

import androidx.compose.runtime.C1322;
import io.ktor.util.C4211;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4464;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import p018.AbstractC6253;
import p019.C6263;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7257 implements InterfaceC7254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5184 f19342;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public HashMap f19343;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4919 f19344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7254 f19345;

    public C7257(InterfaceC7254 interfaceC7254, C4919 c4919) {
        interfaceC7254.getClass();
        c4919.getClass();
        this.f19345 = interfaceC7254;
        AbstractC5187.m10214(new C1322(c4919, 22));
        this.f19344 = new C4919(AbstractC6253.m11735(c4919.f14249));
        this.f19342 = AbstractC5187.m10214(new C1322(this, 23));
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return m12476(this.f19345.mo9165(c4691, noLookupLocation));
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9166() {
        return this.f19345.mo9166();
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return m12476(this.f19345.mo9167(c4691, noLookupLocation));
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        InterfaceC4477 interfaceC4477Mo9155 = this.f19345.mo9155(c4691, noLookupLocation);
        if (interfaceC4477Mo9155 != null) {
            return (InterfaceC4477) m12477(interfaceC4477Mo9155);
        }
        return null;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9168() {
        return this.f19345.mo9168();
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        return (Collection) this.f19342.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Collection m12476(Collection collection) {
        if (this.f19344.f14249.mo9734() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(m12477((InterfaceC4499) it.next()));
        }
        return linkedHashSet;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9172() {
        return this.f19345.mo9172();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC4499 m12477(InterfaceC4499 interfaceC4499) {
        C4919 c4919 = this.f19344;
        if (c4919.f14249.mo9734()) {
            return interfaceC4499;
        }
        if (this.f19343 == null) {
            this.f19343 = new HashMap();
        }
        HashMap map = this.f19343;
        map.getClass();
        Object objMo9005 = map.get(interfaceC4499);
        if (objMo9005 == null) {
            if (!(interfaceC4499 instanceof InterfaceC4464)) {
                C4211.m8592(interfaceC4499, "Unknown descriptor in scope: ");
                return null;
            }
            objMo9005 = ((InterfaceC4464) interfaceC4499).mo9005(c4919);
            if (objMo9005 == null) {
                C6263.m11776(interfaceC4499, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", " substitution fails");
                return null;
            }
            map.put(interfaceC4499, objMo9005);
        }
        return (InterfaceC4499) objMo9005;
    }
}
