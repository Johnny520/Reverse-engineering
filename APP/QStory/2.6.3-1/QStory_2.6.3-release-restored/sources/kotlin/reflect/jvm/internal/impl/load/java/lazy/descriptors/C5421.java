package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C1171;
import androidx.compose.runtime.C2146;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5267;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5524;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5675;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5680;
import p068.InterfaceC7387;
import p086.C7727;
import p095.AbstractC7818;
import p099.C7870;
import p117.C8077;
import p117.C8091;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5421 extends AbstractC5403 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C5267 f13723;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5680 f13724;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C5424 f13725;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5675 f13726;

    public C5421(C1171 c1171, C5267 c5267, C5424 c5424) {
        super(c1171, null);
        this.f13723 = c5267;
        this.f13725 = c5424;
        C5677 c5677 = ((C7870) c1171.f1440).f19239;
        C5860 c5860 = new C5860(c1171, 7, this);
        c5677.getClass();
        this.f13726 = new C5675(c5677, c5860);
        this.f13724 = c5677.m10137(new C2146(this, 4, c1171));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407, p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC5309 mo9714(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return m9747(c5523, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407, p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        if (!c8077.m13033(C8077.f19668 | C8077.f19655)) {
            return EmptyList.INSTANCE;
        }
        Iterable iterable = (Iterable) this.f13679.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC5331 interfaceC5331 = (InterfaceC5331) obj;
            if (interfaceC5331 instanceof AbstractC7818) {
                C5523 name = ((AbstractC7818) interfaceC5331).getName();
                name.getClass();
                if (((Boolean) interfaceC7387.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C7727 m9746() {
        ((C7870) this.f13681.f1440).f19236.m9815().f14435.getClass();
        return C7727.f18701;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC7818 m9747(C5523 c5523, C5284 c5284) {
        C5523 c55232 = AbstractC5524.f14056;
        c5523.getClass();
        String strM9894 = c5523.m9894();
        strM9894.getClass();
        if (strM9894.length() <= 0 || c5523.f14049) {
            return null;
        }
        Set set = (Set) this.f13726.invoke();
        if (c5284 == null && set != null && !set.contains(c5523.m9894())) {
            return null;
        }
        return (AbstractC7818) this.f13724.invoke(new C5425(c5523, c5284));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9715(LinkedHashSet linkedHashSet, C5523 c5523) {
        c5523.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC5331 mo9716() {
        return this.f13725;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Set mo9717(C8077 c8077) {
        c8077.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Set mo9718(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        if (!c8077.m13033(C8077.f19655)) {
            return EmptySet.INSTANCE;
        }
        Set set = (Set) this.f13726.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(C5523.m9889((String) it.next()));
            }
            return hashSet;
        }
        this.f13723.getClass();
        EmptyList<C5284> emptyList = EmptyList.INSTANCE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C5284 c5284 : emptyList) {
            c5284.getClass();
            C5523 c5523M9547 = LightClassOriginKind.SOURCE == null ? null : c5284.m9547();
            if (c5523M9547 != null) {
                linkedHashSet.add(c5523M9547);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC5413 mo9719() {
        return C5414.f13709;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC5407
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Set mo9720(C8077 c8077, C8091 c8091) {
        c8077.getClass();
        return EmptySet.INSTANCE;
    }
}
