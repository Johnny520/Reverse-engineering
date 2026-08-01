package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import androidx.compose.runtime.C1311;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4692;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4843;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4848;
import p052.InterfaceC6558;
import p070.C6898;
import p079.AbstractC6989;
import p083.C7041;
import p101.C7248;
import p101.C7262;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4589 extends AbstractC4571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4435 f13378;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4848 f13379;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C4592 f13380;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4843 f13381;

    public C4589(C0325 c0325, C4435 c4435, C4592 c4592) {
        super(c0325, null);
        this.f13378 = c4435;
        this.f13380 = c4592;
        C4845 c4845 = ((C7041) c0325.f1095).f18894;
        C5028 c5028 = new C5028(c0325, 7, this);
        c4845.getClass();
        this.f13381 = new C4843(c4845, c5028);
        this.f13379 = c4845.m9578(new C1311(this, 4, c0325));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575, p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return m9188(c4691, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575, p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        if (!c7248.m12474(C7248.f19323 | C7248.f19310)) {
            return EmptyList.INSTANCE;
        }
        Iterable iterable = (Iterable) this.f13334.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC4499 interfaceC4499 = (InterfaceC4499) obj;
            if (interfaceC4499 instanceof AbstractC6989) {
                C4691 name = ((AbstractC6989) interfaceC4499).getName();
                name.getClass();
                if (((Boolean) interfaceC6558.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6898 m9187() {
        ((C7041) this.f13336.f1095).f18891.m9256().f14090.getClass();
        return C6898.f18356;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6989 m9188(C4691 c4691, C4452 c4452) {
        C4691 c46912 = AbstractC4692.f13711;
        c4691.getClass();
        String strM9335 = c4691.m9335();
        strM9335.getClass();
        if (strM9335.length() <= 0 || c4691.f13704) {
            return null;
        }
        Set set = (Set) this.f13381.invoke();
        if (c4452 == null && set != null && !set.contains(c4691.m9335())) {
            return null;
        }
        return (AbstractC6989) this.f13379.invoke(new C4593(c4691, c4452));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9156(LinkedHashSet linkedHashSet, C4691 c4691) {
        c4691.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC4499 mo9157() {
        return this.f13380;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Set mo9158(C7248 c7248) {
        c7248.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Set mo9159(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        if (!c7248.m12474(C7248.f19310)) {
            return EmptySet.INSTANCE;
        }
        Set set = (Set) this.f13381.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(C4691.m9330((String) it.next()));
            }
            return hashSet;
        }
        this.f13378.getClass();
        EmptyList<C4452> emptyList = EmptyList.INSTANCE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C4452 c4452 : emptyList) {
            c4452.getClass();
            C4691 c4691M8988 = LightClassOriginKind.SOURCE == null ? null : c4452.m8988();
            if (c4691M8988 != null) {
                linkedHashSet.add(c4691M8988);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC4581 mo9160() {
        return C4582.f13364;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4575
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Set mo9161(C7248 c7248, C7262 c7262) {
        c7248.getClass();
        return EmptySet.INSTANCE;
    }
}
