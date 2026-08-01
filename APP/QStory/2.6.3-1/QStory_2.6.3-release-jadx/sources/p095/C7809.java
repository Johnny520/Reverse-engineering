package p095;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p034.AbstractC7082;
import p068.InterfaceC7387;
import p117.AbstractC8087;
import p117.C8077;
import p117.C8080;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7809 extends AbstractC8087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5519 f19021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5318 f19022;

    public C7809(InterfaceC5318 interfaceC5318, C5519 c5519) {
        interfaceC5318.getClass();
        c5519.getClass();
        this.f19022 = interfaceC5318;
        this.f19021 = c5519;
    }

    public final String toString() {
        return "subpackages of " + this.f19021 + " from " + this.f19022;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9725() {
        return EmptySet.INSTANCE;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        if (!c8077.m13033(C8077.f19665)) {
            return EmptyList.INSTANCE;
        }
        C5519 c5519 = this.f19021;
        if (c5519.f14041.m9873() && c8077.f19672.contains(C8080.f19675)) {
            return EmptyList.INSTANCE;
        }
        InterfaceC5318 interfaceC5318 = this.f19022;
        Collection collectionMo9622 = interfaceC5318.mo9622(c5519, interfaceC7387);
        ArrayList arrayList = new ArrayList(collectionMo9622.size());
        Iterator it = collectionMo9622.iterator();
        while (it.hasNext()) {
            C5523 c5523M9877 = ((C5519) it.next()).f14041.m9877();
            if (((Boolean) interfaceC7387.invoke(c5523M9877)).booleanValue()) {
                C7833 c7833 = null;
                if (!c5523M9877.f14049) {
                    C7833 c7833Mo9621 = interfaceC5318.mo9621(c5519.m9880(c5523M9877));
                    if (!((Boolean) AbstractC7082.m12308(c7833Mo9621.f19158, C7833.f19155[1])).booleanValue()) {
                        c7833 = c7833Mo9621;
                    }
                }
                if (c7833 != null) {
                    arrayList.add(c7833);
                }
            }
        }
        return arrayList;
    }
}
