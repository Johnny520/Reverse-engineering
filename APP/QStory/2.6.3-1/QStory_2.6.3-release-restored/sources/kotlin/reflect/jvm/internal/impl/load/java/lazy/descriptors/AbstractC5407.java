package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import androidx.recyclerview.widget.C3328;
import androidx.window.area.AbstractC3400;
import bsh.C3455;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.InterfaceC6016;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.C5170;
import kotlin.collections.C5173;
import kotlin.collections.C5174;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.C5320;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5269;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5260;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5268;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5270;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5283;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C5397;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5671;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.storage.C5680;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import lin.xposed.hook.javaplugin.C6385;
import p034.AbstractC7082;
import p068.InterfaceC7387;
import p093.C7797;
import p095.AbstractC7831;
import p095.C7808;
import p095.C7835;
import p098.C7863;
import p099.C7868;
import p099.C7870;
import p099.InterfaceC7866;
import p117.AbstractC8087;
import p117.C8077;
import p117.C8091;
import p267.AbstractC9004;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5407 extends AbstractC8087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13676 = {new PropertyReference1Impl(AbstractC5407.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new PropertyReference1Impl(AbstractC5407.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new PropertyReference1Impl(AbstractC5407.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5669 f13677;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5679 f13678;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5671 f13679;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5407 f13680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1171 f13681;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C5669 f13682;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5680 f13683;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C5679 f13684;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C5669 f13685;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C5679 f13686;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C5679 f13687;

    public AbstractC5407(C1171 c1171, C5422 c5422) {
        c1171.getClass();
        this.f13681 = c1171;
        this.f13680 = c5422;
        C5677 c5677 = ((C7870) c1171.f1440).f19239;
        int i = 0;
        C5418 c5418 = new C5418(this, i);
        EmptyList emptyList = EmptyList.INSTANCE;
        c5677.getClass();
        if (emptyList == null) {
            C5677.m10136(27);
            throw null;
        }
        this.f13679 = new C5671(c5677, c5418, emptyList);
        int i2 = 1;
        C5418 c54182 = new C5418(this, i2);
        c5677.getClass();
        this.f13678 = new C5679(c5677, c54182);
        this.f13677 = c5677.m10138(new C5419(this, i));
        this.f13683 = c5677.m10137(new C5419(this, i2));
        int i3 = 2;
        this.f13682 = c5677.m10138(new C5419(this, i3));
        C5418 c54183 = new C5418(this, i3);
        c5677.getClass();
        this.f13686 = new C5679(c5677, c54183);
        int i4 = 3;
        C5418 c54184 = new C5418(this, i4);
        c5677.getClass();
        this.f13687 = new C5679(c5677, c54184);
        C5418 c54185 = new C5418(this, 4);
        c5677.getClass();
        this.f13684 = new C5679(c5677, c54185);
        this.f13685 = c5677.m10138(new C5419(this, i4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C3455 m9722(C1171 c1171, AbstractC7831 abstractC7831, List list) {
        Pair pair;
        AbstractC5714 abstractC5714;
        C5523 c5523;
        C5523 c5523M9889;
        C0955 c0955 = (C0955) c1171.f1438;
        C7870 c7870 = (C7870) c1171.f1440;
        InterfaceC5318 interfaceC5318 = c7870.f19250;
        list.getClass();
        C5174 c5174M9346 = AbstractC5176.m9346(list);
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(c5174M9346, 10));
        Iterator it = c5174M9346.iterator();
        boolean z = false;
        while (true) {
            C5170 c5170 = (C5170) it;
            if (!c5170.f13264.hasNext()) {
                return new C3455(AbstractC5176.m9356(arrayList), z);
            }
            C5173 c5173 = (C5173) c5170.next();
            int i = c5173.f13269;
            C5260 c5260 = (C5260) c5173.f13268;
            C7868 c7868M5620 = AbstractC3400.m5620(c1171, c5260);
            C7863 c7863M14920 = C9496.m14920(TypeUsage.COMMON, false, null, 7);
            boolean z2 = c5260.f13391;
            AbstractC5269 abstractC5269 = c5260.f13394;
            if (z2) {
                C5283 c5283 = abstractC5269 instanceof C5283 ? (C5283) abstractC5269 : null;
                if (c5283 == null) {
                    C6385.m11443(c5260, "Vararg parameter should be an array: ");
                    return null;
                }
                AbstractC5746 abstractC5746M916 = c0955.m916(c5283, c7863M14920, true);
                pair = new Pair(abstractC5746M916, interfaceC5318.mo9620().m12583(abstractC5746M916));
            } else {
                pair = new Pair(c0955.m917(abstractC5269, c7863M14920), null);
            }
            AbstractC5714 abstractC57142 = (AbstractC5714) pair.component1();
            AbstractC5714 abstractC57143 = (AbstractC5714) pair.component2();
            if (AbstractC5227.m9466(abstractC7831.getName().m9894(), "equals") && list.size() == 1 && interfaceC5318.mo9620().m12592().equals(abstractC57142)) {
                c5523M9889 = C5523.m9889("other");
            } else {
                String str = c5260.f13392;
                C5523 c5523M9890 = str != null ? C5523.m9890(str) : null;
                if (c5523M9890 == null) {
                    z = true;
                }
                if (c5523M9890 == null) {
                    c5523M9889 = C5523.m9889("p" + i);
                } else {
                    abstractC5714 = abstractC57142;
                    c5523 = c5523M9890;
                    c7870.f19257.getClass();
                    arrayList.add(new C7808(abstractC7831, null, i, c7868M5620, c5523, abstractC5714, false, false, false, abstractC57143, C7797.m12843(c5260)));
                }
            }
            abstractC5714 = abstractC57142;
            c5523 = c5523M9889;
            c7870.f19257.getClass();
            arrayList.add(new C7808(abstractC7831, null, i, c7868M5620, c5523, abstractC5714, false, false, false, abstractC57143, C7797.m12843(c5260)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static AbstractC5714 m9723(C5268 c5268, C1171 c1171) {
        c5268.getClass();
        Class<?> declaringClass = ((Method) c5268.mo9538()).getDeclaringClass();
        declaringClass.getClass();
        return ((C0955) c1171.f1438).m917(c5268.m9537(), C9496.m14920(TypeUsage.COMMON, declaringClass.isAnnotation(), null, 6));
    }

    public String toString() {
        return "Lazy scope for " + mo9716();
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Collection mo9724(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return !mo9727().contains(c5523) ? EmptyList.INSTANCE : (Collection) this.f13682.invoke(c5523);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set mo9725() {
        return (Set) AbstractC7082.m12308(this.f13684, f13676[2]);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Collection mo9726(C5523 c5523, NoLookupLocation noLookupLocation) {
        c5523.getClass();
        noLookupLocation.getClass();
        return !mo9731().contains(c5523) ? EmptyList.INSTANCE : (Collection) this.f13685.invoke(c5523);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Set mo9727() {
        return (Set) AbstractC7082.m12308(this.f13686, f13676[0]);
    }

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Collection mo9728(C8077 c8077, InterfaceC7387 interfaceC7387) {
        c8077.getClass();
        return (Collection) this.f13679.invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5397 m9729(C5268 c5268) {
        c5268.getClass();
        C1171 c1171 = this.f13681;
        C7868 c7868M5620 = AbstractC3400.m5620(c1171, c5268);
        InterfaceC5331 interfaceC5331Mo9716 = mo9716();
        C5523 c5523M9543 = c5268.m9543();
        ((C7870) c1171.f1440).f19257.getClass();
        C5397 c5397M9699 = C5397.m9699(interfaceC5331Mo9716, c7868M5620, c5523M9543, C7797.m12843(c5268), ((InterfaceC5413) this.f13678.invoke()).mo9744(c5268.m9543()) != null && ((ArrayList) c5268.m9539()).isEmpty());
        c1171.getClass();
        C1171 c11712 = new C1171((C7870) c1171.f1440, new C3328(c1171, c5397M9699, c5268, 0), (InterfaceC6016) c1171.f1439);
        ArrayList typeParameters = c5268.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC5295 interfaceC5295Mo5503 = ((InterfaceC7866) c11712.f1441).mo5503((C5270) it.next());
            interfaceC5295Mo5503.getClass();
            arrayList.add(interfaceC5295Mo5503);
        }
        C3455 c3455M9722 = m9722(c11712, c5397M9699, c5268.m9539());
        C5408 c5408Mo9710 = mo9710(c5268, arrayList, m9723(c5268, c11712), c3455M9722.f8208);
        List list = c5408Mo9710.f13688;
        C7835 c7835Mo9712 = mo9712();
        EmptyList emptyList = EmptyList.INSTANCE;
        ArrayList arrayList2 = c5408Mo9710.f13689;
        List list2 = c5408Mo9710.f13690;
        AbstractC5714 abstractC5714 = c5408Mo9710.f13691;
        C5320 c5320 = Modality.Companion;
        boolean zIsAbstract = Modifier.isAbstract(((Method) c5268.mo9538()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) c5268.mo9538()).getModifiers());
        c5320.getClass();
        c5397M9699.mo9701(null, c7835Mo9712, emptyList, arrayList2, list2, abstractC5714, zIsAbstract ? Modality.ABSTRACT : !zIsFinal ? Modality.OPEN : Modality.FINAL, AbstractC9004.m14185(c5268.m9541()), AbstractC5171.m9335());
        c5397M9699.f19114 = Modifier.isNative(c5268.f13411.getModifiers());
        c5397M9699.m9702(false, c3455M9722.f8207);
        if (list.isEmpty()) {
            return c5397M9699;
        }
        ((C7870) c11712.f1440).f19235.getClass();
        C6755.m11867("Should not be called");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public abstract C5408 mo9710(C5268 c5268, ArrayList arrayList, AbstractC5714 abstractC5714, List list);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract void mo9711(ArrayList arrayList, C5523 c5523);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo9715(LinkedHashSet linkedHashSet, C5523 c5523);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract InterfaceC5331 mo9716();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean mo9730(C5397 c5397) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract Set mo9717(C8077 c8077);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract C7835 mo9712();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract Set mo9718(C8077 c8077, InterfaceC7387 interfaceC7387);

    @Override // p117.AbstractC8087, p117.InterfaceC8083
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Set mo9731() {
        return (Set) AbstractC7082.m12308(this.f13687, f13676[1]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract InterfaceC5413 mo9719();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract Set mo9720(C8077 c8077, C8091 c8091);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo9721(ArrayList arrayList, C5523 c5523) {
        c5523.getClass();
    }
}
