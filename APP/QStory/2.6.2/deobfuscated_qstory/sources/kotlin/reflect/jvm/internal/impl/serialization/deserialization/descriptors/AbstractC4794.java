package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC4335;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4834;
import kotlin.reflect.jvm.internal.impl.storage.C4842;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p066.C6882;
import p079.AbstractC6988;
import p079.AbstractC6995;
import p101.AbstractC7257;
import p101.C7247;
import p103.AbstractC7274;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4794 extends AbstractC7257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13969 = {new PropertyReference1Impl(AbstractC4794.class, "classNames", "getClassNames$deserialization()Ljava/util/Set;", 0), new PropertyReference1Impl(AbstractC4794.class, "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4842 f13970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4846 f13971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C4790 f13972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4823 f13973;

    public AbstractC4794(C4823 c4823, List list, List list2, List list3, InterfaceC6542 interfaceC6542) {
        c4823.getClass();
        this.f13973 = c4823;
        C4832 c4832 = c4823.f14058;
        c4832.f14086.getClass();
        this.f13972 = new C4790(this, list, list2, list3);
        C4844 c4844 = c4832.f14088;
        C4781 c4781 = new C4781(interfaceC6542, 2);
        c4844.getClass();
        this.f13971 = new C4846(c4844, c4781);
        C4781 c47812 = new C4781(this, 3);
        c4844.getClass();
        this.f13970 = new C4842(c4844, c47812);
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        C4790 c4790 = this.f13972;
        c4790.getClass();
        return !((Set) AbstractC9124.m14672(c4790.f13954, C4790.f13946[0])).contains(c4690) ? EmptyList.INSTANCE : (Collection) c4790.f13949.invoke(c4690);
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Set mo9176() {
        InterfaceC5087 interfaceC5087 = f13969[1];
        C4842 c4842 = this.f13970;
        c4842.getClass();
        interfaceC5087.getClass();
        return (Set) c4842.invoke();
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        C4790 c4790 = this.f13972;
        c4790.getClass();
        return !((Set) AbstractC9124.m14672(c4790.f13953, C4790.f13946[1])).contains(c4690) ? EmptyList.INSTANCE : (Collection) c4790.f13948.invoke(c4690);
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC4476 mo9165(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        if (mo9536(c4690)) {
            C4832 c4832 = this.f13973.f14058;
            C4687 c4687Mo9542 = mo9542(c4690);
            C4834 c4834 = c4832.f14089;
            Set set = C4834.f14105;
            return c4834.m9577(c4687Mo9542, null);
        }
        C4790 c4790 = this.f13972;
        if (!c4790.f13950.keySet().contains(c4690)) {
            return null;
        }
        c4790.getClass();
        return (AbstractC6995) c4790.f13947.invoke(c4690);
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo9178() {
        return (Set) AbstractC9124.m14672(this.f13972.f13954, C4790.f13946[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public abstract Set mo9534();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final Set m9535() {
        return (Set) AbstractC9124.m14672(this.f13971, f13969[0]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean mo9536(C4690 c4690) {
        c4690.getClass();
        return m9535().contains(c4690);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean mo9537(C4793 c4793) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public abstract Set mo9538();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public abstract Set mo9539();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public abstract void mo9540(ArrayList arrayList, InterfaceC6557 interfaceC6557);

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final Set mo9182() {
        return (Set) AbstractC9124.m14672(this.f13972.f13953, C4790.f13946[1]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public void mo9541(ArrayList arrayList, C4690 c4690) {
        c4690.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public abstract C4687 mo9542(C4690 c4690);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final List m9543(C7247 c7247, InterfaceC6557 interfaceC6557, NoLookupLocation noLookupLocation) {
        c7247.getClass();
        noLookupLocation.getClass();
        ArrayList arrayList = new ArrayList(0);
        if (c7247.m12447(C7247.f19314)) {
            mo9540(arrayList, interfaceC6557);
        }
        C4790 c4790 = this.f13972;
        c4790.getClass();
        C4846 c4846 = c4790.f13954;
        C4846 c48462 = c4790.f13953;
        boolean zM12447 = c7247.m12447(C7247.f19330);
        C6882 c6882 = C6882.f18335;
        if (zM12447) {
            Set<C4690> set = (Set) AbstractC9124.m14672(c48462, C4790.f13946[1]);
            ArrayList arrayList2 = new ArrayList();
            for (C4690 c4690 : set) {
                if (((Boolean) interfaceC6557.invoke(c4690)).booleanValue()) {
                    c4690.getClass();
                    arrayList2.addAll(!((Set) AbstractC9124.m14672(c48462, C4790.f13946[1])).contains(c4690) ? EmptyList.INSTANCE : (Collection) c4790.f13948.invoke(c4690));
                }
            }
            AbstractC4335.m8776(arrayList2, c6882);
            arrayList.addAll(arrayList2);
        }
        if (c7247.m12447(C7247.f19329)) {
            Set<C4690> set2 = (Set) AbstractC9124.m14672(c4846, C4790.f13946[0]);
            ArrayList arrayList3 = new ArrayList();
            for (C4690 c46902 : set2) {
                if (((Boolean) interfaceC6557.invoke(c46902)).booleanValue()) {
                    c46902.getClass();
                    arrayList3.addAll(!((Set) AbstractC9124.m14672(c4846, C4790.f13946[0])).contains(c46902) ? EmptyList.INSTANCE : (Collection) c4790.f13949.invoke(c46902));
                }
            }
            AbstractC4335.m8776(arrayList3, c6882);
            arrayList.addAll(arrayList3);
        }
        if (c7247.m12447(C7247.f19328)) {
            for (C4690 c46903 : m9535()) {
                if (((Boolean) interfaceC6557.invoke(c46903)).booleanValue()) {
                    C4832 c4832 = this.f13973.f14058;
                    C4687 c4687Mo9542 = mo9542(c46903);
                    C4834 c4834 = c4832.f14089;
                    Set set3 = C4834.f14105;
                    AbstractC6988 abstractC6988M9577 = c4834.m9577(c4687Mo9542, null);
                    if (abstractC6988M9577 != null) {
                        arrayList.add(abstractC6988M9577);
                    }
                }
            }
        }
        if (c7247.m12447(C7247.f19326)) {
            for (C4690 c46904 : c4790.f13950.keySet()) {
                if (((Boolean) interfaceC6557.invoke(c46904)).booleanValue()) {
                    c4790.getClass();
                    c46904.getClass();
                    AbstractC6995 abstractC6995 = (AbstractC6995) c4790.f13947.invoke(c46904);
                    if (abstractC6995 != null) {
                        arrayList.add(abstractC6995);
                    }
                }
            }
        }
        return AbstractC7274.m12463(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public void mo9544(ArrayList arrayList, C4690 c4690) {
        c4690.getClass();
    }
}
