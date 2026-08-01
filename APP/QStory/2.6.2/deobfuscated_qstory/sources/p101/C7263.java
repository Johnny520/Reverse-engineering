package p101;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p079.AbstractC6995;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7263 extends AbstractC7257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7253 f19364;

    public C7263(InterfaceC7253 interfaceC7253) {
        interfaceC7253.getClass();
        this.f19364 = interfaceC7253;
    }

    public final String toString() {
        return "Classes from " + this.f19364;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9176() {
        return this.f19364.mo9176();
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        InterfaceC4476 interfaceC4476Mo9165 = this.f19364.mo9165(c4690, noLookupLocation);
        if (interfaceC4476Mo9165 != null) {
            AbstractC6988 abstractC6988 = interfaceC4476Mo9165 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9165 : null;
            if (abstractC6988 != null) {
                return abstractC6988;
            }
            if (interfaceC4476Mo9165 instanceof AbstractC6995) {
                return (AbstractC6995) interfaceC4476Mo9165;
            }
        }
        return null;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9178() {
        return this.f19364.mo9178();
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        int i = C7247.f19328 & c7247.f19331;
        C7247 c72472 = i == 0 ? null : new C7247(i, c7247.f19332);
        if (c72472 == null) {
            return EmptyList.INSTANCE;
        }
        Collection collectionMo9179 = this.f19364.mo9179(c72472, interfaceC6557);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo9179) {
            if (obj instanceof InterfaceC4495) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9182() {
        return this.f19364.mo9182();
    }
}
