package p101;

import androidx.compose.runtime.C1322;
import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4210;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.types.C4918;
import p022.C6267;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7256 implements InterfaceC7253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final InterfaceC5183 f19347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public HashMap f19348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4918 f19349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7253 f19350;

    public C7256(InterfaceC7253 interfaceC7253, C4918 c4918) {
        interfaceC7253.getClass();
        c4918.getClass();
        this.f19350 = interfaceC7253;
        AbstractC5186.m10210(new C1322(c4918, 22));
        this.f19349 = new C4918(AbstractC3056.m6709(c4918.f14245));
        this.f19347 = AbstractC5186.m10210(new C1322(this, 23));
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return m12449(this.f19350.mo9175(c4690, noLookupLocation));
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9176() {
        return this.f19350.mo9176();
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return m12449(this.f19350.mo9177(c4690, noLookupLocation));
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        InterfaceC4476 interfaceC4476Mo9165 = this.f19350.mo9165(c4690, noLookupLocation);
        if (interfaceC4476Mo9165 != null) {
            return (InterfaceC4476) m12450(interfaceC4476Mo9165);
        }
        return null;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9178() {
        return this.f19350.mo9178();
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        return (Collection) this.f19347.getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Collection m12449(Collection collection) {
        if (this.f19349.f14245.mo9744() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(m12450((InterfaceC4498) it.next()));
        }
        return linkedHashSet;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9182() {
        return this.f19350.mo9182();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC4498 m12450(InterfaceC4498 interfaceC4498) {
        C4918 c4918 = this.f19349;
        if (c4918.f14245.mo9744()) {
            return interfaceC4498;
        }
        if (this.f19348 == null) {
            this.f19348 = new HashMap();
        }
        HashMap map = this.f19348;
        map.getClass();
        Object objMo9015 = map.get(interfaceC4498);
        if (objMo9015 == null) {
            if (!(interfaceC4498 instanceof InterfaceC4463)) {
                C4210.m8602(interfaceC4498, "Unknown descriptor in scope: ");
                return null;
            }
            objMo9015 = ((InterfaceC4463) interfaceC4498).mo9015(c4918);
            if (objMo9015 == null) {
                C6267.m11759(interfaceC4498, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ", " substitution fails");
                return null;
            }
            map.put(interfaceC4498, objMo9015);
        }
        return (InterfaceC4498) objMo9015;
    }
}
