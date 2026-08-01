package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.recyclerview.widget.C2495;
import bsh.C2621;
import com.bumptech.glide.AbstractC3056;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.InterfaceC5183;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.C4337;
import kotlin.collections.C4340;
import kotlin.collections.C4341;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.descriptors.C4487;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4436;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4427;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4437;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4450;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.C4564;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4838;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4913;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import lin.xposed.hook.javaplugin.C5553;
import p033.AbstractC6325;
import p052.InterfaceC6557;
import p077.C6967;
import p079.AbstractC7001;
import p079.C6978;
import p079.C7005;
import p082.C7033;
import p083.C7038;
import p083.C7040;
import p083.InterfaceC7036;
import p101.AbstractC7257;
import p101.C7247;
import p101.C7261;
import p392.AbstractC9124;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4574 extends AbstractC7257 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13327 = {new PropertyReference1Impl(AbstractC4574.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new PropertyReference1Impl(AbstractC4574.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new PropertyReference1Impl(AbstractC4574.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4836 f13328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4846 f13329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4838 f13330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4574 f13331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0325 f13332;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C4836 f13333;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4847 f13334;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final C4846 f13335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C4836 f13336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C4846 f13337;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C4846 f13338;

    public AbstractC4574(C0325 c0325, C4589 c4589) {
        c0325.getClass();
        this.f13332 = c0325;
        this.f13331 = c4589;
        C4844 c4844 = ((C7040) c0325.f1095).f18899;
        int i = 0;
        C4585 c4585 = new C4585(this, i);
        EmptyList emptyList = EmptyList.INSTANCE;
        c4844.getClass();
        if (emptyList == null) {
            C4844.m9587(27);
            throw null;
        }
        this.f13330 = new C4838(c4844, c4585, emptyList);
        int i2 = 1;
        C4585 c45852 = new C4585(this, i2);
        c4844.getClass();
        this.f13329 = new C4846(c4844, c45852);
        this.f13328 = c4844.m9589(new C4586(this, i));
        this.f13334 = c4844.m9588(new C4586(this, i2));
        int i3 = 2;
        this.f13333 = c4844.m9589(new C4586(this, i3));
        C4585 c45853 = new C4585(this, i3);
        c4844.getClass();
        this.f13337 = new C4846(c4844, c45853);
        int i4 = 3;
        C4585 c45854 = new C4585(this, i4);
        c4844.getClass();
        this.f13338 = new C4846(c4844, c45854);
        C4585 c45855 = new C4585(this, 4);
        c4844.getClass();
        this.f13335 = new C4846(c4844, c45855);
        this.f13336 = c4844.m9589(new C4586(this, i4));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static C2621 m9173(C0325 c0325, AbstractC7001 abstractC7001, List list) {
        Pair pair;
        AbstractC4881 abstractC4881;
        C4690 c4690;
        C4690 c4690M9340;
        C0108 c0108 = (C0108) c0325.f1093;
        C7040 c7040 = (C7040) c0325.f1095;
        InterfaceC4485 interfaceC4485 = c7040.f18910;
        list.getClass();
        C4341 c4341M8796 = AbstractC4343.m8796(list);
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(c4341M8796, 10));
        Iterator it = c4341M8796.iterator();
        boolean z = false;
        while (true) {
            C4337 c4337 = (C4337) it;
            if (!c4337.f12915.hasNext()) {
                return new C2621(AbstractC4343.m8804(arrayList), z);
            }
            C4340 c4340 = (C4340) c4337.next();
            int i = c4340.f12920;
            C4427 c4427 = (C4427) c4340.f12919;
            C7038 c7038M11852 = AbstractC6325.m11852(c0325, c4427);
            C7033 c7033M9872 = AbstractC4921.m9872(TypeUsage.COMMON, false, null, 7);
            boolean z2 = c4427.f13042;
            AbstractC4436 abstractC4436 = c4427.f13045;
            if (z2) {
                C4450 c4450 = abstractC4436 instanceof C4450 ? (C4450) abstractC4436 : null;
                if (c4450 == null) {
                    C5553.m10827(c4427, "Vararg parameter should be an array: ");
                    return null;
                }
                AbstractC4913 abstractC4913M355 = c0108.m355(c4450, c7033M9872, true);
                pair = new Pair(abstractC4913M355, interfaceC4485.mo9071().m11981(abstractC4913M355));
            } else {
                pair = new Pair(c0108.m356(abstractC4436, c7033M9872), null);
            }
            AbstractC4881 abstractC48812 = (AbstractC4881) pair.component1();
            AbstractC4881 abstractC48813 = (AbstractC4881) pair.component2();
            if (AbstractC4394.m8917(abstractC7001.getName().m9345(), "equals") && list.size() == 1 && interfaceC4485.mo9071().m11990().equals(abstractC48812)) {
                c4690M9340 = C4690.m9340("other");
            } else {
                String str = c4427.f13043;
                C4690 c4690M9341 = str != null ? C4690.m9341(str) : null;
                if (c4690M9341 == null) {
                    z = true;
                }
                if (c4690M9341 == null) {
                    c4690M9340 = C4690.m9340("p" + i);
                } else {
                    abstractC4881 = abstractC48812;
                    c4690 = c4690M9341;
                    c7040.f18917.getClass();
                    arrayList.add(new C6978(abstractC7001, null, i, c7038M11852, c4690, abstractC4881, false, false, false, abstractC48813, C6967.m12257(c4427)));
                }
            }
            abstractC4881 = abstractC48812;
            c4690 = c4690M9340;
            c7040.f18917.getClass();
            arrayList.add(new C6978(abstractC7001, null, i, c7038M11852, c4690, abstractC4881, false, false, false, abstractC48813, C6967.m12257(c4427)));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static AbstractC4881 m9174(C4435 c4435, C0325 c0325) {
        c4435.getClass();
        Class<?> declaringClass = ((Method) c4435.mo8989()).getDeclaringClass();
        declaringClass.getClass();
        return ((C0108) c0325.f1093).m356(c4435.m8988(), AbstractC4921.m9872(TypeUsage.COMMON, declaringClass.isAnnotation(), null, 6));
    }

    public String toString() {
        return "Lazy scope for " + mo9167();
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Collection mo9175(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return !mo9178().contains(c4690) ? EmptyList.INSTANCE : (Collection) this.f13333.invoke(c4690);
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Set mo9176() {
        return (Set) AbstractC9124.m14672(this.f13335, f13327[2]);
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Collection mo9177(C4690 c4690, NoLookupLocation noLookupLocation) {
        c4690.getClass();
        noLookupLocation.getClass();
        return !mo9182().contains(c4690) ? EmptyList.INSTANCE : (Collection) this.f13336.invoke(c4690);
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Set mo9178() {
        return (Set) AbstractC9124.m14672(this.f13337, f13327[0]);
    }

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Collection mo9179(C7247 c7247, InterfaceC6557 interfaceC6557) {
        c7247.getClass();
        return (Collection) this.f13330.invoke();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C4564 m9180(C4435 c4435) {
        c4435.getClass();
        C0325 c0325 = this.f13332;
        C7038 c7038M11852 = AbstractC6325.m11852(c0325, c4435);
        InterfaceC4498 interfaceC4498Mo9167 = mo9167();
        C4690 c4690M8994 = c4435.m8994();
        ((C7040) c0325.f1095).f18917.getClass();
        C4564 c4564M9150 = C4564.m9150(interfaceC4498Mo9167, c7038M11852, c4690M8994, C6967.m12257(c4435), ((InterfaceC4580) this.f13329.invoke()).mo9195(c4435.m8994()) != null && ((ArrayList) c4435.m8990()).isEmpty());
        c0325.getClass();
        C0325 c03252 = new C0325((C7040) c0325.f1095, new C2495(c0325, c4564M9150, c4435, 0), (InterfaceC5183) c0325.f1094);
        ArrayList typeParameters = c4435.getTypeParameters();
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            InterfaceC4462 interfaceC4462Mo4933 = ((InterfaceC7036) c03252.f1096).mo4933((C4437) it.next());
            interfaceC4462Mo4933.getClass();
            arrayList.add(interfaceC4462Mo4933);
        }
        C2621 c2621M9173 = m9173(c03252, c4564M9150, c4435.m8990());
        C4575 c4575Mo9161 = mo9161(c4435, arrayList, m9174(c4435, c03252), c2621M9173.f7861);
        List list = c4575Mo9161.f13339;
        C7005 c7005Mo9163 = mo9163();
        EmptyList emptyList = EmptyList.INSTANCE;
        ArrayList arrayList2 = c4575Mo9161.f13340;
        List list2 = c4575Mo9161.f13341;
        AbstractC4881 abstractC4881 = c4575Mo9161.f13342;
        C4487 c4487 = Modality.Companion;
        boolean zIsAbstract = Modifier.isAbstract(((Method) c4435.mo8989()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) c4435.mo8989()).getModifiers());
        c4487.getClass();
        c4564M9150.mo9152(null, c7005Mo9163, emptyList, arrayList2, list2, abstractC4881, zIsAbstract ? Modality.ABSTRACT : !zIsFinal ? Modality.OPEN : Modality.FINAL, AbstractC3056.m6711(c4435.m8992()), AbstractC4338.m8781());
        c4564M9150.f18774 = Modifier.isNative(c4435.f13062.getModifiers());
        c4564M9150.m9153(false, c2621M9173.f7860);
        if (list.isEmpty()) {
            return c4564M9150;
        }
        ((C7040) c03252.f1095).f18895.getClass();
        C5919.m11247("Should not be called");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public abstract C4575 mo9161(C4435 c4435, ArrayList arrayList, AbstractC4881 abstractC4881, List list);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public abstract void mo9162(ArrayList arrayList, C4690 c4690);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public abstract void mo9166(LinkedHashSet linkedHashSet, C4690 c4690);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public abstract InterfaceC4498 mo9167();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean mo9181(C4564 c4564) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public abstract Set mo9168(C7247 c7247);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public abstract C7005 mo9163();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public abstract Set mo9169(C7247 c7247, InterfaceC6557 interfaceC6557);

    @Override // p101.AbstractC7257, p101.InterfaceC7253
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Set mo9182() {
        return (Set) AbstractC9124.m14672(this.f13338, f13327[1]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public abstract InterfaceC4580 mo9170();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public abstract Set mo9171(C7247 c7247, C7261 c7261);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public void mo9172(ArrayList arrayList, C4690 c4690) {
        c4690.getClass();
    }
}
