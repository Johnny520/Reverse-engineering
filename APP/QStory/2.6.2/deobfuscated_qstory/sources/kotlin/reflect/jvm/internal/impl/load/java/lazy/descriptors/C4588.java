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
import kotlin.reflect.jvm.internal.C5027;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4434;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4691;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4842;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p052.InterfaceC6557;
import p070.C6897;
import p079.AbstractC6988;
import p083.C7040;
import p101.C7247;
import p101.C7261;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4588 extends AbstractC4570 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final C4434 f13374;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4847 f13375;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final C4591 f13376;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4842 f13377;

    public C4588(C0325 c0325, C4434 c4434, C4591 c4591) {
        super(c0325, null);
        this.f13374 = c4434;
        this.f13376 = c4591;
        C4844 c4844 = ((C7040) c0325.f1095).f18899;
        C5027 c5027 = new C5027(c0325, 7, this);
        c4844.getClass();
        this.f13377 = new C4842(c4844, c5027);
        this.f13375 = c4844.m9588(new C1311(this, 4, c0325));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574, p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return EmptyList.INSTANCE;
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return m9198(c4690, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574, p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        if (!c7247.m12447(C7247.f19328 | C7247.f19315)) {
            return EmptyList.INSTANCE;
        }
        Iterable iterable = (Iterable) this.f13330.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC4498 interfaceC4498 = (InterfaceC4498) obj;
            if (interfaceC4498 instanceof AbstractC6988) {
                C4690 name = ((AbstractC6988) interfaceC4498).getName();
                name.getClass();
                if (((Boolean) interfaceC6557.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C6897 m9197() {
        ((C7040) this.f13332.f1095).f18896.m9266().f14086.getClass();
        return C6897.f18361;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC6988 m9198(C4690 c4690, C4451 c4451) {
        C4690 c46902 = AbstractC4691.f13707;
        c4690.getClass();
        String strM9345 = c4690.m9345();
        strM9345.getClass();
        if (strM9345.length() <= 0 || c4690.f13700) {
            return null;
        }
        Set set = (Set) this.f13377.invoke();
        if (c4451 == null && set != null && !set.contains(c4690.m9345())) {
            return null;
        }
        return (AbstractC6988) this.f13375.invoke(new C4592(c4690, c4451));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo9166(LinkedHashSet linkedHashSet, C4690 c4690) {
        c4690.getClass();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final InterfaceC4498 mo9167() {
        return this.f13376;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final Set mo9168(C7247 c7247) {
        c7247.getClass();
        return EmptySet.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final Set mo9169(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        if (!c7247.m12447(C7247.f19315)) {
            return EmptySet.INSTANCE;
        }
        Set set = (Set) this.f13377.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(C4690.m9340((String) it.next()));
            }
            return hashSet;
        }
        this.f13374.getClass();
        EmptyList<C4451> emptyList = EmptyList.INSTANCE;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C4451 c4451 : emptyList) {
            c4451.getClass();
            C4690 c4690M8998 = LightClassOriginKind.SOURCE == null ? null : c4451.m8998();
            if (c4690M8998 != null) {
                linkedHashSet.add(c4690M8998);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC4580 mo9170() {
        return C4581.f13360;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.AbstractC4574
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Set mo9171(C7247 c7247, C7261 c7261) {
        c7247.getClass();
        return EmptySet.INSTANCE;
    }
}
