package p117;

import com.bumptech.glide.AbstractC3887;
import io.ktor.client.plugins.AbstractC4765;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5174;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: 飘花落叶言世苏子楪哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8082 implements InterfaceC8083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8083[] f19678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f19679;

    public C8082(String str, InterfaceC8083[] interfaceC8083Arr) {
        this.f19679 = str;
        this.f19678 = interfaceC8083Arr;
    }

    public final String toString() {
        return this.f19679;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        InterfaceC8083[] interfaceC8083Arr = this.f19678;
        int length = interfaceC8083Arr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return interfaceC8083Arr[0].mo9724(c5523, noLookupLocation);
        }
        Collection collectionM8877 = null;
        for (InterfaceC8083 interfaceC8083 : interfaceC8083Arr) {
            collectionM8877 = AbstractC4765.m8877(collectionM8877, interfaceC8083.mo9724(c5523, noLookupLocation));
        }
        return collectionM8877 == null ? EmptySet.INSTANCE : collectionM8877;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9725() {
        InterfaceC8083[] interfaceC8083Arr = this.f19678;
        interfaceC8083Arr.getClass();
        return AbstractC3887.m7215(interfaceC8083Arr.length == 0 ? EmptyList.INSTANCE : new C5174(interfaceC8083Arr, 0));
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        InterfaceC8083[] interfaceC8083Arr = this.f19678;
        int length = interfaceC8083Arr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return interfaceC8083Arr[0].mo9726(c5523, noLookupLocation);
        }
        Collection collectionM8877 = null;
        for (InterfaceC8083 interfaceC8083 : interfaceC8083Arr) {
            collectionM8877 = AbstractC4765.m8877(collectionM8877, interfaceC8083.mo9726(c5523, noLookupLocation));
        }
        return collectionM8877 == null ? EmptySet.INSTANCE : collectionM8877;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        InterfaceC5309 interfaceC5309 = null;
        for (InterfaceC8083 interfaceC8083 : this.f19678) {
            InterfaceC5309 interfaceC5309Mo9714 = interfaceC8083.mo9714(c5523, noLookupLocation);
            if (interfaceC5309Mo9714 != null) {
                if (!(interfaceC5309Mo9714 instanceof InterfaceC5328) || !((InterfaceC5319) interfaceC5309Mo9714).mo9567()) {
                    return interfaceC5309Mo9714;
                }
                if (interfaceC5309 == null) {
                    interfaceC5309 = interfaceC5309Mo9714;
                }
            }
        }
        return interfaceC5309;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9727() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC8083 interfaceC8083 : this.f19678) {
            AbstractC5176.m9363(interfaceC8083.mo9727(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        InterfaceC8083[] interfaceC8083Arr = this.f19678;
        int length = interfaceC8083Arr.length;
        if (length == 0) {
            return EmptyList.INSTANCE;
        }
        if (length == 1) {
            return interfaceC8083Arr[0].mo9728(c8077, interfaceC7387);
        }
        Collection collectionM8877 = null;
        for (InterfaceC8083 interfaceC8083 : interfaceC8083Arr) {
            collectionM8877 = AbstractC4765.m8877(collectionM8877, interfaceC8083.mo9728(c8077, interfaceC7387));
        }
        return collectionM8877 == null ? EmptySet.INSTANCE : collectionM8877;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9731() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC8083 interfaceC8083 : this.f19678) {
            AbstractC5176.m9363(interfaceC8083.mo9731(), linkedHashSet);
        }
        return linkedHashSet;
    }
}
