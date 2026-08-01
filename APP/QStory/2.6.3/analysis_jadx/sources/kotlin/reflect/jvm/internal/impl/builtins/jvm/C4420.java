package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.C1322;
import com.alibaba.fastjson2.AbstractC2905;
import com.bumptech.glide.AbstractC3055;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.C5028;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4590;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C4600;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4652;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C4794;
import kotlin.reflect.jvm.internal.impl.storage.C4836;
import kotlin.reflect.jvm.internal.impl.storage.C4837;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.C4880;
import kotlin.reflect.jvm.internal.impl.types.C4919;
import net.bytebuddy.pool.TypePool;
import p018.AbstractC6253;
import p034.AbstractC6347;
import p046.InterfaceC6481;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p065.C6868;
import p066.AbstractC6870;
import p066.C6877;
import p079.AbstractC6977;
import p079.AbstractC6989;
import p079.AbstractC7002;
import p079.C6988;
import p079.C7003;
import p079.C7016;
import p079.C7018;
import p080.AbstractC7020;
import p080.InterfaceC7021;
import p080.InterfaceC7023;
import p101.C7255;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4420 implements InterfaceC7023, InterfaceC7021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13019 = {new PropertyReference1Impl(C4420.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new PropertyReference1Impl(C4420.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new PropertyReference1Impl(C4420.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4847 f13020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C4837 f13021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C4847 f13022;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC4878 f13023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4847 f13024;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6988 f13025;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4837 f13026;

    public C4420(C6988 c6988, C4845 c4845, C1322 c1322) {
        this.f13025 = c6988;
        this.f13024 = new C4847(c4845, c1322);
        C7016 c7016 = new C7016(new C4415(c6988, new C4687("java.io"), 0), C4691.m9330("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, AbstractC6347.m11928(new C4880(c4845, new C4424(this, 1))), c4845);
        c7016.m12357(C7255.f19336, EmptySet.INSTANCE, null);
        this.f13023 = c7016.mo9025();
        this.f13022 = new C4847(c4845, new C5028(this, 5, c4845));
        this.f13021 = new C4837(c4845, new ConcurrentHashMap(3, 1.0f, 2), new C4836(), 0);
        this.f13020 = new C4847(c4845, new C4424(this, 0));
        this.f13026 = c4845.m9579(new C1012(this, 3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C4600 m8957(AbstractC6989 abstractC6989) {
        C4687 c4687M9327;
        if (abstractC6989 == null) {
            AbstractC6530.m12020(108);
            throw null;
        }
        if (!AbstractC6530.m12019(abstractC6989, AbstractC6527.f17885) && AbstractC6530.m12014(abstractC6989)) {
            int i = AbstractC4773.f13909;
            C4686 c4686M12101 = AbstractC6870.m12101(abstractC6989);
            c4686M12101.getClass();
            if (c4686M12101.m9313()) {
                String str = C4410.f12987;
                C4688 c4688M8945 = C4410.m8945(c4686M12101);
                if (c4688M8945 != null && (c4687M9327 = c4688M8945.m9327()) != null) {
                    AbstractC6989 abstractC6989M9080 = AbstractC4491.m9080(m8963().f13042, c4687M9327, NoLookupLocation.FROM_BUILTINS);
                    if (abstractC6989M9080 instanceof C4600) {
                        return (C4600) abstractC6989M9080;
                    }
                }
            }
        }
        return null;
    }

    @Override // p080.InterfaceC7023
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Collection mo8958(AbstractC6989 abstractC6989) throws Exception {
        C4686 c4686M12101;
        C4652 c4652 = C4652.f13593;
        if (abstractC6989.mo9010() != ClassKind.CLASS) {
            return EmptyList.INSTANCE;
        }
        m8963().getClass();
        C4600 c4600M8957 = m8957(abstractC6989);
        if (c4600M8957 == null) {
            return EmptyList.INSTANCE;
        }
        C4687 c4687M9505 = AbstractC4773.m9505(c4600M8957);
        C4412 c4412 = C4412.f13000;
        c4412.getClass();
        String str = C4410.f12987;
        C4688 c4688M8946 = C4410.m8946(c4687M9505);
        AbstractC6989 abstractC6989M12039 = c4688M8946 != null ? c4412.m12039(c4688M8946.m9327()) : null;
        if (abstractC6989M12039 == null) {
            return EmptyList.INSTANCE;
        }
        C4919 c4919 = new C4919(AbstractC2905.m6319(abstractC6989M12039, c4600M8957));
        List list = (List) c4600M8957.f13430.f13387.invoke();
        ArrayList<C7018> arrayList = new ArrayList();
        for (Object obj : list) {
            C7018 c7018 = (C7018) obj;
            if (c7018.getVisibility().f13131.f13139) {
                Collection collectionMo9007 = abstractC6989M12039.mo9007();
                collectionMo9007.getClass();
                Collection<C7018> collection = collectionMo9007;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (C7018 c70182 : collection) {
                        c70182.getClass();
                        if (C6877.m12149(c70182, c7018.mo9005(c4919)) == OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE) {
                            break;
                        }
                    }
                }
                if (c7018.mo9035().size() == 1) {
                    List listMo9035 = c7018.mo9035();
                    listMo9035.getClass();
                    InterfaceC4477 interfaceC4477Mo9211 = ((AbstractC6977) ((InterfaceC4456) AbstractC4344.m8779(listMo9035))).getType().mo9722().mo9211();
                    if (interfaceC4477Mo9211 != null) {
                        int i = AbstractC4773.f13909;
                        c4686M12101 = AbstractC6870.m12101(interfaceC4477Mo9211);
                        c4686M12101.getClass();
                    } else {
                        c4686M12101 = null;
                    }
                    C4686 c4686M121012 = AbstractC6870.m12101(abstractC6989);
                    c4686M121012.getClass();
                    if (AbstractC4395.m8907(c4686M12101, c4686M121012)) {
                    }
                }
                if (!AbstractC6530.m12009(c7018)) {
                    LinkedHashSet linkedHashSet = C4414.f13002;
                    String strM6660 = AbstractC3055.m6660(c7018, 3);
                    String str2 = C4410.f12987;
                    C4688 c4688M8945 = C4410.m8945(AbstractC4773.m9505(c4600M8957).f13696);
                    if (!linkedHashSet.contains((c4688M8945 != null ? C6868.m12088(c4688M8945) : AbstractC2905.m6307(c4600M8957, c4652)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM6660)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        for (C7018 c70183 : arrayList) {
            c70183.getClass();
            C7003 c7003M12336 = c70183.m12336(C4919.f14248);
            c7003M12336.f18807 = abstractC6989;
            c7003M12336.mo9097(abstractC6989.mo9025());
            c7003M12336.f18789 = true;
            c7003M12336.f18809 = c4919.f14249;
            LinkedHashSet linkedHashSet2 = C4414.f13008;
            String strM66602 = AbstractC3055.m6660(c70183, 3);
            String str3 = C4410.f12987;
            C4688 c4688M89452 = C4410.m8945(AbstractC4773.m9505(c4600M8957).f13696);
            if (!linkedHashSet2.contains((c4688M89452 != null ? C6868.m12088(c4688M89452) : AbstractC2905.m6307(c4600M8957, c4652)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM66602)) {
                c7003M12336.mo9083((InterfaceC6481) AbstractC6253.m11749(this.f13020, f13019[2]));
            }
            AbstractC7002 abstractC7002Mo11990 = c7003M12336.f18788.mo11990(c7003M12336);
            abstractC7002Mo11990.getClass();
            arrayList2.add((C7018) abstractC7002Mo11990);
        }
        return arrayList2;
    }

    @Override // p080.InterfaceC7023
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Collection mo8959(AbstractC6989 abstractC6989) {
        Set setMo9168;
        abstractC6989.getClass();
        m8963().getClass();
        C4600 c4600M8957 = m8957(abstractC6989);
        if (c4600M8957 == null || (setMo9168 = c4600M8957.m9216().mo9168()) == null) {
            setMo9168 = EmptySet.INSTANCE;
        }
        return setMo9168;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    @Override // p080.InterfaceC7023
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection mo8960(kotlin.reflect.jvm.internal.impl.name.C4691 r14, p079.AbstractC6989 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.jvm.C4420.mo8960(kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰, 飘花落叶言世楪子苏兰哲.飘花落叶言子世楪苏哲兰):java.util.Collection");
    }

    @Override // p080.InterfaceC7023
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Collection mo8961(AbstractC6989 abstractC6989) {
        int i = AbstractC4773.f13909;
        C4686 c4686M12101 = AbstractC6870.m12101(abstractC6989);
        c4686M12101.getClass();
        LinkedHashSet linkedHashSet = C4414.f13007;
        C4686 c4686 = AbstractC6527.f17899;
        boolean zEquals = c4686M12101.equals(c4686);
        boolean zIsAssignableFrom = false;
        AbstractC4878 abstractC4878 = this.f13023;
        if (!zEquals) {
            HashMap map = AbstractC6527.f17904;
            if (map.get(c4686M12101) == null) {
                if (c4686M12101.equals(c4686) || map.get(c4686M12101) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = C4410.f12987;
                    C4688 c4688M8945 = C4410.m8945(c4686M12101);
                    if (c4688M8945 != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(c4688M8945.m9327().f13696.f13693));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? AbstractC6347.m11928(abstractC4878) : EmptyList.INSTANCE;
            }
        }
        return AbstractC6347.m11931((AbstractC4878) AbstractC6253.m11749(this.f13022, f13019[1]), abstractC4878);
    }

    @Override // p080.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo8962(AbstractC6989 abstractC6989, C4794 c4794) {
        abstractC6989.getClass();
        C4600 c4600M8957 = m8957(abstractC6989);
        if (c4600M8957 == null || !c4794.getAnnotations().mo9518(AbstractC7020.f18859)) {
            return true;
        }
        m8963().getClass();
        String strM6660 = AbstractC3055.m6660(c4794, 3);
        C4590 c4590M9216 = c4600M8957.m9216();
        C4691 name = c4794.getName();
        name.getClass();
        Collection collectionMo9165 = c4590M9216.mo9165(name, NoLookupLocation.FROM_BUILTINS);
        if ((collectionMo9165 instanceof Collection) && collectionMo9165.isEmpty()) {
            return false;
        }
        Iterator it = collectionMo9165.iterator();
        while (it.hasNext()) {
            if (AbstractC3055.m6660((InterfaceC4471) it.next(), 3).equals(strM6660)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C4425 m8963() {
        return (C4425) AbstractC6253.m11749(this.f13024, f13019[0]);
    }
}
