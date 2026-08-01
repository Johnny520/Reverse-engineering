package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.C1322;
import com.bumptech.glide.AbstractC3055;
import io.ktor.client.plugins.AbstractC3933;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4342;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4487;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4496;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p018.AbstractC6253;
import p052.InterfaceC6558;
import p079.AbstractC6989;
import p083.C7041;
import p101.C7248;
import p101.InterfaceC7254;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4580 implements InterfaceC7254 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13359 = {new PropertyReference1Impl(C4580.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4847 f13360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4589 f13361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4592 f13362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f13363;

    public C4580(C0325 c0325, C4435 c4435, C4592 c4592) {
        this.f13363 = c0325;
        this.f13362 = c4592;
        this.f13361 = new C4589(c0325, c4435, c4592);
        C4845 c4845 = ((C7041) c0325.f1095).f18894;
        C1322 c1322 = new C1322(this, 4);
        c4845.getClass();
        this.f13360 = new C4847(c4845, c1322);
    }

    public final String toString() {
        return "scope for " + this.f13362;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        m9180(c4691, noLookupLocation);
        InterfaceC7254[] interfaceC7254ArrM9179 = m9179();
        Collection collectionMo9165 = this.f13361.mo9165(c4691, noLookupLocation);
        for (InterfaceC7254 interfaceC7254 : interfaceC7254ArrM9179) {
            collectionMo9165 = AbstractC3933.m8318(collectionMo9165, interfaceC7254.mo9165(c4691, noLookupLocation));
        }
        return collectionMo9165 == null ? EmptySet.INSTANCE : collectionMo9165;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9166() {
        InterfaceC7254[] interfaceC7254ArrM9179 = m9179();
        interfaceC7254ArrM9179.getClass();
        HashSet hashSetM6655 = AbstractC3055.m6655(interfaceC7254ArrM9179.length == 0 ? EmptyList.INSTANCE : new C4342(interfaceC7254ArrM9179, 0));
        if (hashSetM6655 == null) {
            return null;
        }
        hashSetM6655.addAll(this.f13361.mo9166());
        return hashSetM6655;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        m9180(c4691, noLookupLocation);
        InterfaceC7254[] interfaceC7254ArrM9179 = m9179();
        this.f13361.getClass();
        Collection collectionM8318 = EmptyList.INSTANCE;
        for (InterfaceC7254 interfaceC7254 : interfaceC7254ArrM9179) {
            collectionM8318 = AbstractC3933.m8318(collectionM8318, interfaceC7254.mo9167(c4691, noLookupLocation));
        }
        return collectionM8318 == null ? EmptySet.INSTANCE : collectionM8318;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        m9180(c4691, noLookupLocation);
        C4589 c4589 = this.f13361;
        c4589.getClass();
        InterfaceC4477 interfaceC4477 = null;
        AbstractC6989 abstractC6989M9188 = c4589.m9188(c4691, null);
        if (abstractC6989M9188 != null) {
            return abstractC6989M9188;
        }
        for (InterfaceC7254 interfaceC7254 : m9179()) {
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
        InterfaceC7254[] interfaceC7254ArrM9179 = m9179();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7254 interfaceC7254 : interfaceC7254ArrM9179) {
            AbstractC4344.m8804(interfaceC7254.mo9168(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13361.mo9168());
        return linkedHashSet;
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        InterfaceC7254[] interfaceC7254ArrM9179 = m9179();
        Collection collectionMo9169 = this.f13361.mo9169(c7248, interfaceC6558);
        for (InterfaceC7254 interfaceC7254 : interfaceC7254ArrM9179) {
            collectionMo9169 = AbstractC3933.m8318(collectionMo9169, interfaceC7254.mo9169(c7248, interfaceC6558));
        }
        return collectionMo9169 == null ? EmptySet.INSTANCE : collectionMo9169;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC7254[] m9179() {
        return (InterfaceC7254[]) AbstractC6253.m11749(this.f13360, f13359[0]);
    }

    @Override // p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9172() {
        InterfaceC7254[] interfaceC7254ArrM9179 = m9179();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC7254 interfaceC7254 : interfaceC7254ArrM9179) {
            AbstractC4344.m8804(interfaceC7254.mo9172(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13361.mo9172());
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m9180(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        AbstractC7739.m13056(((C7041) this.f13363.f1095).f18901, noLookupLocation, this.f13362, c4691);
    }
}
