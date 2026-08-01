package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4336;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4835;
import kotlin.reflect.jvm.internal.impl.storage.C4843;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p018.AbstractC6253;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p066.C6883;
import p079.AbstractC6989;
import p079.AbstractC6996;
import p101.AbstractC7258;
import p101.C7248;
import p103.AbstractC7275;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4795 extends AbstractC7258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13973 = {new PropertyReference1Impl(AbstractC4795.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0), new PropertyReference1Impl(AbstractC4795.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4843 f13974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4847 f13975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4791 f13976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4824 f13977;

    public AbstractC4795(C4824 c4824, List list, List list2, List list3, InterfaceC6543 interfaceC6543) {
        c4824.getClass();
        this.f13977 = c4824;
        C4833 c4833 = c4824.f14062;
        c4833.f14090.getClass();
        this.f13976 = new C4791(this, list, list2, list3);
        C4845 c4845 = c4833.f14092;
        C4782 c4782 = new C4782(interfaceC6543, 2);
        c4845.getClass();
        this.f13975 = new C4847(c4845, c4782);
        C4782 c47822 = new C4782(this, 3);
        c4845.getClass();
        this.f13974 = new C4843(c4845, c47822);
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        C4791 c4791 = this.f13976;
        c4791.getClass();
        return !((Set) AbstractC6253.m11749(c4791.f13958, C4791.f13950[0])).contains(c4691) ? EmptyList.INSTANCE : (Collection) c4791.f13953.invoke(c4691);
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9166() {
        InterfaceC5088 interfaceC5088 = f13973[1];
        C4843 c4843 = this.f13974;
        c4843.getClass();
        interfaceC5088.getClass();
        return (Set) c4843.invoke();
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        C4791 c4791 = this.f13976;
        c4791.getClass();
        return !((Set) AbstractC6253.m11749(c4791.f13957, C4791.f13950[1])).contains(c4691) ? EmptyList.INSTANCE : (Collection) c4791.f13952.invoke(c4691);
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4477 mo9155(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        if (mo9526(c4691)) {
            C4833 c4833 = this.f13977.f14062;
            C4688 c4688Mo9532 = mo9532(c4691);
            C4835 c4835 = c4833.f14093;
            Set set = C4835.f14109;
            return c4835.m9567(c4688Mo9532, null);
        }
        C4791 c4791 = this.f13976;
        if (!c4791.f13954.keySet().contains(c4691)) {
            return null;
        }
        c4791.getClass();
        return (AbstractC6996) c4791.f13951.invoke(c4691);
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9168() {
        return (Set) AbstractC6253.m11749(this.f13976.f13958, C4791.f13950[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract Set mo9524();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Set m9525() {
        return (Set) AbstractC6253.m11749(this.f13975, f13973[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean mo9526(C4691 c4691) {
        c4691.getClass();
        return m9525().contains(c4691);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean mo9527(C4794 c4794) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract Set mo9528();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract Set mo9529();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract void mo9530(ArrayList arrayList, InterfaceC6558 interfaceC6558);

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9172() {
        return (Set) AbstractC6253.m11749(this.f13976.f13957, C4791.f13950[1]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo9531(ArrayList arrayList, C4691 c4691) {
        c4691.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract C4688 mo9532(C4691 c4691);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List m9533(C7248 c7248, InterfaceC6558 interfaceC6558, NoLookupLocation noLookupLocation) {
        c7248.getClass();
        noLookupLocation.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (c7248.m12474(C7248.f19309)) {
            mo9530(arrayList, interfaceC6558);
        }
        C4791 c4791 = this.f13976;
        c4791.getClass();
        C4847 c4847 = c4791.f13958;
        C4847 c48472 = c4791.f13957;
        boolean zM12474 = c7248.m12474(C7248.f19325);
        C6883 c6883 = C6883.f18330;
        if (zM12474) {
            Set<C4691> set = (Set) AbstractC6253.m11749(c48472, C4791.f13950[1]);
            ArrayList arrayList2 = new ArrayList();
            for (C4691 c4691 : set) {
                if (((Boolean) interfaceC6558.invoke(c4691)).booleanValue()) {
                    c4691.getClass();
                    arrayList2.addAll(!((Set) AbstractC6253.m11749(c48472, C4791.f13950[1])).contains(c4691) ? EmptyList.INSTANCE : (Collection) c4791.f13952.invoke(c4691));
                }
            }
            AbstractC4336.m8766(arrayList2, c6883);
            arrayList.addAll(arrayList2);
        }
        if (c7248.m12474(C7248.f19324)) {
            Set<C4691> set2 = (Set) AbstractC6253.m11749(c4847, C4791.f13950[0]);
            ArrayList arrayList3 = new ArrayList();
            for (C4691 c46912 : set2) {
                if (((Boolean) interfaceC6558.invoke(c46912)).booleanValue()) {
                    c46912.getClass();
                    arrayList3.addAll(!((Set) AbstractC6253.m11749(c4847, C4791.f13950[0])).contains(c46912) ? EmptyList.INSTANCE : (Collection) c4791.f13953.invoke(c46912));
                }
            }
            AbstractC4336.m8766(arrayList3, c6883);
            arrayList.addAll(arrayList3);
        }
        if (c7248.m12474(C7248.f19323)) {
            for (C4691 c46913 : m9525()) {
                if (((Boolean) interfaceC6558.invoke(c46913)).booleanValue()) {
                    C4833 c4833 = this.f13977.f14062;
                    C4688 c4688Mo9532 = mo9532(c46913);
                    C4835 c4835 = c4833.f14093;
                    Set set3 = C4835.f14109;
                    AbstractC6989 abstractC6989M9567 = c4835.m9567(c4688Mo9532, null);
                    if (abstractC6989M9567 != null) {
                        arrayList.add(abstractC6989M9567);
                    }
                }
            }
        }
        if (c7248.m12474(C7248.f19321)) {
            for (C4691 c46914 : c4791.f13954.keySet()) {
                if (((Boolean) interfaceC6558.invoke(c46914)).booleanValue()) {
                    c4791.getClass();
                    c46914.getClass();
                    AbstractC6996 abstractC6996 = (AbstractC6996) c4791.f13951.invoke(c46914);
                    if (abstractC6996 != null) {
                        arrayList.add(abstractC6996);
                    }
                }
            }
        }
        return AbstractC7275.m12490(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo9534(ArrayList arrayList, C4691 c4691) {
        c4691.getClass();
    }
}
