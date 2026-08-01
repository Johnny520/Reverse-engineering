package p101;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p052.InterfaceC6558;
import p079.AbstractC6989;
import p079.AbstractC6996;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7264 extends AbstractC7258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7254 f19359;

    public C7264(InterfaceC7254 interfaceC7254) {
        interfaceC7254.getClass();
        this.f19359 = interfaceC7254;
    }

    public final String toString() {
        return "Classes from " + this.f19359;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9166() {
        return this.f19359.mo9166();
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        InterfaceC4477 interfaceC4477Mo9155 = this.f19359.mo9155(c4691, noLookupLocation);
        if (interfaceC4477Mo9155 != null) {
            AbstractC6989 abstractC6989 = interfaceC4477Mo9155 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9155 : null;
            if (abstractC6989 != null) {
                return abstractC6989;
            }
            if (interfaceC4477Mo9155 instanceof AbstractC6996) {
                return (AbstractC6996) interfaceC4477Mo9155;
            }
        }
        return null;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9168() {
        return this.f19359.mo9168();
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        int i = C7248.f19323 & c7248.f19326;
        C7248 c72482 = i == 0 ? null : new C7248(i, c7248.f19327);
        if (c72482 == null) {
            return EmptyList.INSTANCE;
        }
        Collection collectionMo9169 = this.f19359.mo9169(c72482, interfaceC6558);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo9169) {
            if (obj instanceof InterfaceC4496) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9172() {
        return this.f19359.mo9172();
    }
}
