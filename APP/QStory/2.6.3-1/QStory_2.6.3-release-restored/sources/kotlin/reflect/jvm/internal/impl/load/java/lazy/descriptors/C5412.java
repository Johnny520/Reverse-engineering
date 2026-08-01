package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C1171;
import androidx.compose.runtime.C2157;
import com.bumptech.glide.AbstractC3887;
import io.ktor.client.plugins.AbstractC4765;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.collections.C5174;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5328;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5267;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p034.AbstractC7082;
import p068.InterfaceC7387;
import p095.AbstractC7818;
import p099.C7870;
import p117.C8077;
import p117.InterfaceC8083;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5412 implements InterfaceC8083 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13704 = {new PropertyReference1Impl(C5412.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5679 f13705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5421 f13706;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5424 f13707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1171 f13708;

    public C5412(C1171 c1171, C5267 c5267, C5424 c5424) {
        this.f13708 = c1171;
        this.f13707 = c5424;
        this.f13706 = new C5421(c1171, c5267, c5424);
        C5677 c5677 = ((C7870) c1171.f1440).f19239;
        C2157 c2157 = new C2157(this, 4);
        c5677.getClass();
        this.f13705 = new C5679(c5677, c2157);
    }

    public final String toString() {
        return "scope for " + this.f13707;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        m9739(c5523, noLookupLocation);
        InterfaceC8083[] interfaceC8083ArrM9738 = m9738();
        Collection collectionMo9724 = this.f13706.mo9724(c5523, noLookupLocation);
        for (InterfaceC8083 interfaceC8083 : interfaceC8083ArrM9738) {
            collectionMo9724 = AbstractC4765.m8877(collectionMo9724, interfaceC8083.mo9724(c5523, noLookupLocation));
        }
        return collectionMo9724 == null ? EmptySet.INSTANCE : collectionMo9724;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9725() {
        InterfaceC8083[] interfaceC8083ArrM9738 = m9738();
        interfaceC8083ArrM9738.getClass();
        HashSet hashSetM7215 = AbstractC3887.m7215(interfaceC8083ArrM9738.length == 0 ? EmptyList.INSTANCE : new C5174(interfaceC8083ArrM9738, 0));
        if (hashSetM7215 == null) {
            return null;
        }
        hashSetM7215.addAll(this.f13706.mo9725());
        return hashSetM7215;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        m9739(c5523, noLookupLocation);
        InterfaceC8083[] interfaceC8083ArrM9738 = m9738();
        this.f13706.getClass();
        Collection collectionM8877 = EmptyList.INSTANCE;
        for (InterfaceC8083 interfaceC8083 : interfaceC8083ArrM9738) {
            collectionM8877 = AbstractC4765.m8877(collectionM8877, interfaceC8083.mo9726(c5523, noLookupLocation));
        }
        return collectionM8877 == null ? EmptySet.INSTANCE : collectionM8877;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        m9739(c5523, noLookupLocation);
        C5421 c5421 = this.f13706;
        c5421.getClass();
        InterfaceC5309 interfaceC5309 = null;
        AbstractC7818 abstractC7818M9747 = c5421.m9747(c5523, null);
        if (abstractC7818M9747 != null) {
            return abstractC7818M9747;
        }
        for (InterfaceC8083 interfaceC8083 : m9738()) {
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
        InterfaceC8083[] interfaceC8083ArrM9738 = m9738();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC8083 interfaceC8083 : interfaceC8083ArrM9738) {
            AbstractC5176.m9363(interfaceC8083.mo9727(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13706.mo9727());
        return linkedHashSet;
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        InterfaceC8083[] interfaceC8083ArrM9738 = m9738();
        Collection collectionMo9728 = this.f13706.mo9728(c8077, interfaceC7387);
        for (InterfaceC8083 interfaceC8083 : interfaceC8083ArrM9738) {
            collectionMo9728 = AbstractC4765.m8877(collectionMo9728, interfaceC8083.mo9728(c8077, interfaceC7387));
        }
        return collectionMo9728 == null ? EmptySet.INSTANCE : collectionMo9728;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC8083[] m9738() {
        return (InterfaceC8083[]) AbstractC7082.m12308(this.f13705, f13704[0]);
    }

    @Override // p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9731() {
        InterfaceC8083[] interfaceC8083ArrM9738 = m9738();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC8083 interfaceC8083 : interfaceC8083ArrM9738) {
            AbstractC5176.m9363(interfaceC8083.mo9731(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f13706.mo9731());
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m9739(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        AbstractC8568.m13615(((C7870) this.f13708.f1440).f19246, noLookupLocation, this.f13707, c5523);
    }
}
