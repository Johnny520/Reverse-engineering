package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.recyclerview.widget.C2495;
import androidx.window.area.AbstractC2567;
import bsh.C2622;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.InterfaceC5184;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.C4338;
import kotlin.collections.C4341;
import kotlin.collections.C4342;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.descriptors.C4488;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4463;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4437;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4428;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4436;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4438;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4565;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4839;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.storage.C4848;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4914;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import lin.xposed.hook.javaplugin.C5554;
import p018.AbstractC6253;
import p052.InterfaceC6558;
import p077.C6968;
import p079.AbstractC7002;
import p079.C6979;
import p079.C7006;
import p082.C7034;
import p083.C7039;
import p083.C7041;
import p083.InterfaceC7037;
import p101.AbstractC7258;
import p101.C7248;
import p101.C7262;
import p251.AbstractC8175;
import p316.C8667;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4575 extends AbstractC7258 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13331 = {new PropertyReference1Impl(AbstractC4575.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new PropertyReference1Impl(AbstractC4575.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new PropertyReference1Impl(AbstractC4575.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4837 f13332;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4847 f13333;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4839 f13334;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4575 f13335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f13336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4837 f13337;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4848 f13338;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C4847 f13339;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C4837 f13340;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4847 f13341;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C4847 f13342;

    public AbstractC4575(C0325 c0325, C4590 c4590) {
        c0325.getClass();
        this.f13336 = c0325;
        this.f13335 = c4590;
        C4845 c4845 = ((C7041) c0325.f1095).f18894;
        int i = 0;
        C4586 c4586 = new C4586(this, i);
        EmptyList emptyList = EmptyList.INSTANCE;
        c4845.getClass();
        if (emptyList == null) {
            C4845.m9577(27);
            throw null;
        }
        this.f13334 = new C4839(c4845, c4586, emptyList);
        int i2 = 1;
        C4586 c45862 = new C4586(this, i2);
        c4845.getClass();
        this.f13333 = new C4847(c4845, c45862);
        this.f13332 = c4845.m9579(new C4587(this, i));
        this.f13338 = c4845.m9578(new C4587(this, i2));
        int i3 = 2;
        this.f13337 = c4845.m9579(new C4587(this, i3));
        C4586 c45863 = new C4586(this, i3);
        c4845.getClass();
        this.f13341 = new C4847(c4845, c45863);
        int i4 = 3;
        C4586 c45864 = new C4586(this, i4);
        c4845.getClass();
        this.f13342 = new C4847(c4845, c45864);
        C4586 c45865 = new C4586(this, 4);
        c4845.getClass();
        this.f13339 = new C4847(c4845, c45865);
        this.f13340 = c4845.m9579(new C4587(this, i4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C2622 m9163(C0325 c0325, AbstractC7002 abstractC7002, List list) {
        Pair pair;
        AbstractC4882 abstractC4882;
        C4691 c4691;
        C4691 c4691M9330;
        C0108 c0108 = (C0108) c0325.f1093;
        C7041 c7041 = (C7041) c0325.f1095;
        InterfaceC4486 interfaceC4486 = c7041.f18905;
        list.getClass();
        C4342 c4342M8787 = AbstractC4344.m8787(list);
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(c4342M8787, 10));
        Iterator it = c4342M8787.iterator();
        boolean z = false;
        while (true) {
            C4338 c4338 = (C4338) it;
            if (!c4338.f12919.hasNext()) {
                return new C2622(AbstractC4344.m8797(arrayList), z);
            }
            C4341 c4341 = (C4341) c4338.next();
            int i = c4341.f12924;
            C4428 c4428 = (C4428) c4341.f12923;
            C7039 c7039M5060 = AbstractC2567.m5060(c0325, c4428);
            C7034 c7034M14361 = C8667.m14361(TypeUsage.COMMON, false, null, 7);
            boolean z2 = c4428.f13046;
            AbstractC4437 abstractC4437 = c4428.f13049;
            if (z2) {
                C4451 c4451 = abstractC4437 instanceof C4451 ? (C4451) abstractC4437 : null;
                if (c4451 == null) {
                    C5554.m10884(c4428, "Vararg parameter should be an array: ");
                    return null;
                }
                AbstractC4914 abstractC4914M356 = c0108.m356(c4451, c7034M14361, true);
                pair = new Pair(abstractC4914M356, interfaceC4486.mo9061().m12024(abstractC4914M356));
            } else {
                pair = new Pair(c0108.m357(abstractC4437, c7034M14361), null);
            }
            AbstractC4882 abstractC48822 = (AbstractC4882) pair.component1();
            AbstractC4882 abstractC48823 = (AbstractC4882) pair.component2();
            if (AbstractC4395.m8907(abstractC7002.getName().m9335(), "equals") && list.size() == 1 && interfaceC4486.mo9061().m12033().equals(abstractC48822)) {
                c4691M9330 = C4691.m9330("other");
            } else {
                String str = c4428.f13047;
                C4691 c4691M9331 = str != null ? C4691.m9331(str) : null;
                if (c4691M9331 == null) {
                    z = true;
                }
                if (c4691M9331 == null) {
                    c4691M9330 = C4691.m9330("p" + i);
                } else {
                    abstractC4882 = abstractC48822;
                    c4691 = c4691M9331;
                    c7041.f18912.getClass();
                    arrayList.add(new C6979(abstractC7002, null, i, c7039M5060, c4691, abstractC4882, false, false, false, abstractC48823, C6968.m12284(c4428)));
                }
            }
            abstractC4882 = abstractC48822;
            c4691 = c4691M9330;
            c7041.f18912.getClass();
            arrayList.add(new C6979(abstractC7002, null, i, c7039M5060, c4691, abstractC4882, false, false, false, abstractC48823, C6968.m12284(c4428)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static AbstractC4882 m9164(C4436 c4436, C0325 c0325) {
        c4436.getClass();
        Class<?> declaringClass = ((Method) c4436.mo8979()).getDeclaringClass();
        declaringClass.getClass();
        return ((C0108) c0325.f1093).m357(c4436.m8978(), C8667.m14361(TypeUsage.COMMON, declaringClass.isAnnotation(), null, 6));
    }

    public String toString() {
        return "Lazy scope for " + mo9157();
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Collection mo9165(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return !mo9168().contains(c4691) ? EmptyList.INSTANCE : (Collection) this.f13337.invoke(c4691);
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set mo9166() {
        return (Set) AbstractC6253.m11749(this.f13339, f13331[2]);
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Collection mo9167(C4691 c4691, NoLookupLocation noLookupLocation) {
        c4691.getClass();
        noLookupLocation.getClass();
        return !mo9172().contains(c4691) ? EmptyList.INSTANCE : (Collection) this.f13340.invoke(c4691);
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Set mo9168() {
        return (Set) AbstractC6253.m11749(this.f13341, f13331[0]);
    }

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Collection mo9169(C7248 c7248, InterfaceC6558 interfaceC6558) {
        c7248.getClass();
        return (Collection) this.f13334.invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4565 m9170(C4436 c4436) {
        c4436.getClass();
        C0325 c0325 = this.f13336;
        C7039 c7039M5060 = AbstractC2567.m5060(c0325, c4436);
        InterfaceC4499 interfaceC4499Mo9157 = mo9157();
        C4691 c4691M8984 = c4436.m8984();
        ((C7041) c0325.f1095).f18912.getClass();
        C4565 c4565M9140 = C4565.m9140(interfaceC4499Mo9157, c7039M5060, c4691M8984, C6968.m12284(c4436), ((InterfaceC4581) this.f13333.invoke()).mo9185(c4436.m8984()) != null && ((ArrayList) c4436.m8980()).isEmpty());
        c0325.getClass();
        C0325 c03252 = new C0325((C7041) c0325.f1095, new C2495(c0325, c4565M9140, c4436, 0), (InterfaceC5184) c0325.f1094);
        ArrayList typeParameters = c4436.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC4463 interfaceC4463Mo4943 = ((InterfaceC7037) c03252.f1096).mo4943((C4438) it.next());
            interfaceC4463Mo4943.getClass();
            arrayList.add(interfaceC4463Mo4943);
        }
        C2622 c2622M9163 = m9163(c03252, c4565M9140, c4436.m8980());
        C4576 c4576Mo9151 = mo9151(c4436, arrayList, m9164(c4436, c03252), c2622M9163.f7863);
        List list = c4576Mo9151.f13343;
        C7006 c7006Mo9153 = mo9153();
        EmptyList emptyList = EmptyList.INSTANCE;
        ArrayList arrayList2 = c4576Mo9151.f13344;
        List list2 = c4576Mo9151.f13345;
        AbstractC4882 abstractC4882 = c4576Mo9151.f13346;
        C4488 c4488 = Modality.Companion;
        boolean zIsAbstract = Modifier.isAbstract(((Method) c4436.mo8979()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) c4436.mo8979()).getModifiers());
        c4488.getClass();
        c4565M9140.mo9142(null, c7006Mo9153, emptyList, arrayList2, list2, abstractC4882, zIsAbstract ? Modality.ABSTRACT : !zIsFinal ? Modality.OPEN : Modality.FINAL, AbstractC8175.m13626(c4436.m8982()), AbstractC4339.m8776());
        c4565M9140.f18769 = Modifier.isNative(c4436.f13066.getModifiers());
        c4565M9140.m9143(false, c2622M9163.f7862);
        if (list.isEmpty()) {
            return c4565M9140;
        }
        ((C7041) c03252.f1095).f18890.getClass();
        C5925.m11308("Should not be called");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public abstract C4576 mo9151(C4436 c4436, ArrayList arrayList, AbstractC4882 abstractC4882, List list);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract void mo9152(ArrayList arrayList, C4691 c4691);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo9156(LinkedHashSet linkedHashSet, C4691 c4691);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract InterfaceC4499 mo9157();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean mo9171(C4565 c4565) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract Set mo9158(C7248 c7248);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract C7006 mo9153();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract Set mo9159(C7248 c7248, InterfaceC6558 interfaceC6558);

    @Override // p101.AbstractC7258, p101.InterfaceC7254
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Set mo9172() {
        return (Set) AbstractC6253.m11749(this.f13342, f13331[1]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract InterfaceC4581 mo9160();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract Set mo9161(C7248 c7248, C7262 c7262);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo9162(ArrayList arrayList, C4691 c4691) {
        c4691.getClass();
    }
}
