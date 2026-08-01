package p117;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p068.InterfaceC7387;
import p095.AbstractC7818;
import p095.AbstractC7825;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8093 extends AbstractC8087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8083 f19704;

    public C8093(InterfaceC8083 interfaceC8083) {
        interfaceC8083.getClass();
        this.f19704 = interfaceC8083;
    }

    public final String toString() {
        return "Classes from " + this.f19704;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9725() {
        return this.f19704.mo9725();
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        InterfaceC5309 interfaceC5309Mo9714 = this.f19704.mo9714(c5523, noLookupLocation);
        if (interfaceC5309Mo9714 != null) {
            AbstractC7818 abstractC7818 = interfaceC5309Mo9714 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9714 : null;
            if (abstractC7818 != null) {
                return abstractC7818;
            }
            if (interfaceC5309Mo9714 instanceof AbstractC7825) {
                return (AbstractC7825) interfaceC5309Mo9714;
            }
        }
        return null;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9727() {
        return this.f19704.mo9727();
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        int i = C8077.f19668 & c8077.f19671;
        C8077 c80772 = i == 0 ? null : new C8077(i, c8077.f19672);
        if (c80772 == null) {
            return EmptyList.INSTANCE;
        }
        Collection collectionMo9728 = this.f19704.mo9728(c80772, interfaceC7387);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionMo9728) {
            if (obj instanceof InterfaceC5328) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9731() {
        return this.f19704.mo9731();
    }
}
