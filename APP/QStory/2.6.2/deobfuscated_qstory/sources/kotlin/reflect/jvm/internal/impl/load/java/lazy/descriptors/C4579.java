package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.C1322;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3064;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4343;
import kotlin.collections.C4341;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4434;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p083.C7040;
import p101.C7247;
import p101.InterfaceC7253;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4579 implements InterfaceC7253 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13355 = {new PropertyReference1Impl(C4579.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4846 f13356;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4588 f13357;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4591 f13358;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f13359;

    public C4579(C0325 c0325, C4434 c4434, C4591 c4591) {
        this.f13359 = c0325;
        this.f13358 = c4591;
        this.f13357 = new C4588(c0325, c4434, c4591);
        C4844 c4844 = ((C7040) c0325.f1095).f18899;
        C1322 c1322 = new C1322(this, 4);
        c4844.getClass();
        this.f13356 = new C4846(c4844, c1322);
    }

    public final String toString() {
        return "scope for " + this.f13358;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        m9190(c4690, noLookupLocation);
        InterfaceC7253[] interfaceC7253ArrM9189 = m9189();
        Collection collectionMo9175 = this.f13357.mo9175(c4690, noLookupLocation);
        for (InterfaceC7253 interfaceC7253 : interfaceC7253ArrM9189) {
            collectionMo9175 = AbstractC2904.m6271(collectionMo9175, interfaceC7253.mo9175(c4690, noLookupLocation));
        }
        return collectionMo9175 == null ? EmptySet.INSTANCE : collectionMo9175;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9176() {
        InterfaceC7253[] interfaceC7253ArrM9189 = m9189();
        interfaceC7253ArrM9189.getClass();
        HashSet hashSetM14678 = AbstractC9124.m14678(interfaceC7253ArrM9189.length == 0 ? EmptyList.INSTANCE : new C4341(interfaceC7253ArrM9189, 0));
        if (hashSetM14678 == null) {
            return null;
        }
        hashSetM14678.addAll(this.f13357.mo9176());
        return hashSetM14678;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        m9190(c4690, noLookupLocation);
        InterfaceC7253[] interfaceC7253ArrM9189 = m9189();
        this.f13357.getClass();
        Collection collectionM6271 = EmptyList.INSTANCE;
        for (InterfaceC7253 interfaceC7253 : interfaceC7253ArrM9189) {
            collectionM6271 = AbstractC2904.m6271(collectionM6271, interfaceC7253.mo9177(c4690, noLookupLocation));
        }
        return collectionM6271 == null ? EmptySet.INSTANCE : collectionM6271;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        m9190(c4690, noLookupLocation);
        C4588 c4588 = this.f13357;
        c4588.getClass();
        InterfaceC4476 interfaceC4476 = null;
        AbstractC6988 abstractC6988M9198 = c4588.m9198(c4690, null);
        if (abstractC6988M9198 != null) {
            return abstractC6988M9198;
        }
        for (InterfaceC7253 interfaceC7253 : m9189()) {
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
        InterfaceC7253[] interfaceC7253ArrM9189 = m9189();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7253 interfaceC7253 : interfaceC7253ArrM9189) {
            AbstractC4343.m8794(interfaceC7253.mo9178(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13357.mo9178());
        return linkedHashSet;
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        InterfaceC7253[] interfaceC7253ArrM9189 = m9189();
        Collection collectionMo9179 = this.f13357.mo9179(c7247, interfaceC6557);
        for (InterfaceC7253 interfaceC7253 : interfaceC7253ArrM9189) {
            collectionMo9179 = AbstractC2904.m6271(collectionMo9179, interfaceC7253.mo9179(c7247, interfaceC6557));
        }
        return collectionMo9179 == null ? EmptySet.INSTANCE : collectionMo9179;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC7253[] m9189() {
        return (InterfaceC7253[]) AbstractC9124.m14672(this.f13356, f13355[0]);
    }

    @Override // p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9182() {
        InterfaceC7253[] interfaceC7253ArrM9189 = m9189();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7253 interfaceC7253 : interfaceC7253ArrM9189) {
            AbstractC4343.m8794(interfaceC7253.mo9182(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13357.mo9182());
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m9190(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        AbstractC3064.m6783(((C7040) this.f13359.f1095).f18906, noLookupLocation, this.f13358, c4690);
    }
}
