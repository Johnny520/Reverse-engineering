package p101;

import com.alibaba.fastjson2.AbstractC2904;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.C4341;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p052.InterfaceC6557;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7252 implements InterfaceC7253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7253[] f19338;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19339;

    public C7252(String str, InterfaceC7253[] interfaceC7253Arr) {
        this.f19339 = str;
        this.f19338 = interfaceC7253Arr;
    }

    public final String toString() {
        return this.f19339;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        InterfaceC7253[] interfaceC7253Arr = this.f19338;
        int length = interfaceC7253Arr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return interfaceC7253Arr[0].mo9175(c4690, noLookupLocation);
        }
        Collection collectionM6271 = null;
        for (InterfaceC7253 interfaceC7253 : interfaceC7253Arr) {
            collectionM6271 = AbstractC2904.m6271(collectionM6271, interfaceC7253.mo9175(c4690, noLookupLocation));
        }
        return collectionM6271 == null ? EmptySet.INSTANCE : collectionM6271;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9176() {
        InterfaceC7253[] interfaceC7253Arr = this.f19338;
        interfaceC7253Arr.getClass();
        return AbstractC9124.m14678(interfaceC7253Arr.length == 0 ? EmptyList.INSTANCE : new C4341(interfaceC7253Arr, 0));
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        InterfaceC7253[] interfaceC7253Arr = this.f19338;
        int length = interfaceC7253Arr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return interfaceC7253Arr[0].mo9177(c4690, noLookupLocation);
        }
        Collection collectionM6271 = null;
        for (InterfaceC7253 interfaceC7253 : interfaceC7253Arr) {
            collectionM6271 = AbstractC2904.m6271(collectionM6271, interfaceC7253.mo9177(c4690, noLookupLocation));
        }
        return collectionM6271 == null ? EmptySet.INSTANCE : collectionM6271;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        InterfaceC4476 interfaceC4476 = null;
        for (InterfaceC7253 interfaceC7253 : this.f19338) {
            InterfaceC4476 interfaceC4476Mo9165 = interfaceC7253.mo9165(c4690, noLookupLocation);
            if (interfaceC4476Mo9165 != null) {
                if (!(interfaceC4476Mo9165 instanceof InterfaceC4495) || !((InterfaceC4486) interfaceC4476Mo9165).mo9018()) {
                    return interfaceC4476Mo9165;
                }
                if (interfaceC4476 == null) {
                    interfaceC4476 = interfaceC4476Mo9165;
                }
            }
        }
        return interfaceC4476;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9178() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7253 interfaceC7253 : this.f19338) {
            AbstractC4343.m8794(interfaceC7253.mo9178(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        InterfaceC7253[] interfaceC7253Arr = this.f19338;
        int length = interfaceC7253Arr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return interfaceC7253Arr[0].mo9179(c7247, interfaceC6557);
        }
        Collection collectionM6271 = null;
        for (InterfaceC7253 interfaceC7253 : interfaceC7253Arr) {
            collectionM6271 = AbstractC2904.m6271(collectionM6271, interfaceC7253.mo9179(c7247, interfaceC6557));
        }
        return collectionM6271 == null ? EmptySet.INSTANCE : collectionM6271;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9182() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7253 interfaceC7253 : this.f19338) {
            AbstractC4343.m8794(interfaceC7253.mo9182(), linkedHashSet);
        }
        return linkedHashSet;
    }
}
