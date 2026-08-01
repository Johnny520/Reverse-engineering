package p101;

import com.bumptech.glide.AbstractC3055;
import io.ktor.client.plugins.AbstractC3933;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4342;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7253 implements InterfaceC7254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7254[] f19333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19334;

    public C7253(String str, InterfaceC7254[] interfaceC7254Arr) {
        this.f19334 = str;
        this.f19333 = interfaceC7254Arr;
    }

    public final String toString() {
        return this.f19334;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        InterfaceC7254[] interfaceC7254Arr = this.f19333;
        int length = interfaceC7254Arr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return interfaceC7254Arr[0].mo9165(c4691, noLookupLocation);
        }
        Collection collectionM8318 = null;
        for (InterfaceC7254 interfaceC7254 : interfaceC7254Arr) {
            collectionM8318 = AbstractC3933.m8318(collectionM8318, interfaceC7254.mo9165(c4691, noLookupLocation));
        }
        return collectionM8318 == null ? EmptySet.INSTANCE : collectionM8318;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9166() {
        InterfaceC7254[] interfaceC7254Arr = this.f19333;
        interfaceC7254Arr.getClass();
        return AbstractC3055.m6655(interfaceC7254Arr.length == 0 ? EmptyList.INSTANCE : new C4342(interfaceC7254Arr, 0));
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        InterfaceC7254[] interfaceC7254Arr = this.f19333;
        int length = interfaceC7254Arr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return interfaceC7254Arr[0].mo9167(c4691, noLookupLocation);
        }
        Collection collectionM8318 = null;
        for (InterfaceC7254 interfaceC7254 : interfaceC7254Arr) {
            collectionM8318 = AbstractC3933.m8318(collectionM8318, interfaceC7254.mo9167(c4691, noLookupLocation));
        }
        return collectionM8318 == null ? EmptySet.INSTANCE : collectionM8318;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        InterfaceC4477 interfaceC4477 = null;
        for (InterfaceC7254 interfaceC7254 : this.f19333) {
            InterfaceC4477 interfaceC4477Mo9155 = interfaceC7254.mo9155(c4691, noLookupLocation);
            if (interfaceC4477Mo9155 != null) {
                if (!(interfaceC4477Mo9155 instanceof InterfaceC4496) || !((InterfaceC4487) interfaceC4477Mo9155).mo9008()) {
                    return interfaceC4477Mo9155;
                }
                if (interfaceC4477 == null) {
                    interfaceC4477 = interfaceC4477Mo9155;
                }
            }
        }
        return interfaceC4477;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9168() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7254 interfaceC7254 : this.f19333) {
            AbstractC4344.m8804(interfaceC7254.mo9168(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        InterfaceC7254[] interfaceC7254Arr = this.f19333;
        int length = interfaceC7254Arr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return interfaceC7254Arr[0].mo9169(c7248, interfaceC6558);
        }
        Collection collectionM8318 = null;
        for (InterfaceC7254 interfaceC7254 : interfaceC7254Arr) {
            collectionM8318 = AbstractC3933.m8318(collectionM8318, interfaceC7254.mo9169(c7248, interfaceC6558));
        }
        return collectionM8318 == null ? EmptySet.INSTANCE : collectionM8318;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9172() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7254 interfaceC7254 : this.f19333) {
            AbstractC4344.m8804(interfaceC7254.mo9172(), linkedHashSet);
        }
        return linkedHashSet;
    }
}
