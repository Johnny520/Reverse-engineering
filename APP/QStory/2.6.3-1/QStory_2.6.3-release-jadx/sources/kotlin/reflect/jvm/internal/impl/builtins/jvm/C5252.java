package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.collection.C1123;
import androidx.compose.foundation.text.C1850;
import androidx.compose.runtime.C2157;
import androidx.core.view.C3075;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3887;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.util.C5043;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5324;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5422;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5432;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5484;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5626;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5633;
import kotlin.reflect.jvm.internal.impl.storage.C5668;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5676;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.C5712;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC7082;
import p050.AbstractC7176;
import p062.InterfaceC7310;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p081.C7697;
import p082.AbstractC7699;
import p082.C7706;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p095.AbstractC7831;
import p095.AbstractC7837;
import p095.AbstractC7838;
import p095.C7817;
import p095.C7832;
import p095.C7845;
import p095.C7847;
import p096.AbstractC7849;
import p096.InterfaceC7850;
import p096.InterfaceC7852;
import p117.C8084;
import p117.InterfaceC8083;
import p119.AbstractC8104;
import p119.C8102;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5252 implements InterfaceC7852, InterfaceC7850 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13364 = {new PropertyReference1Impl(C5252.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new PropertyReference1Impl(C5252.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new PropertyReference1Impl(C5252.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5679 f13365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C5669 f13366;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5679 f13367;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC5710 f13368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5679 f13369;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7817 f13370;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5669 f13371;

    public C5252(C7817 c7817, C5677 c5677, C2157 c2157) {
        this.f13370 = c7817;
        this.f13369 = new C5679(c5677, c2157);
        C7845 c7845 = new C7845(new C5247(c7817, new C5519("java.io"), 0), C5523.m9889("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, AbstractC7176.m12487(new C5712(c5677, new C5256(this, 1))), c5677);
        c7845.m12916(C8084.f19681, EmptySet.INSTANCE, null);
        this.f13368 = c7845.mo9584();
        this.f13367 = new C5679(c5677, new C5860(this, 5, c5677));
        this.f13366 = new C5669(c5677, new ConcurrentHashMap(3, 1.0f, 2), new C5668(), 0);
        this.f13365 = new C5679(c5677, new C5256(this, 0));
        this.f13371 = c5677.m10138(new C1850(this, 3));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5432 m9516(AbstractC7818 abstractC7818) {
        C5519 c5519M9886;
        if (abstractC7818 == null) {
            AbstractC7359.m12579(108);
            throw null;
        }
        if (!AbstractC7359.m12578(abstractC7818, AbstractC7356.f18230) && AbstractC7359.m12573(abstractC7818)) {
            int i = AbstractC5605.f14254;
            C5518 c5518M12660 = AbstractC7699.m12660(abstractC7818);
            c5518M12660.getClass();
            if (c5518M12660.m9872()) {
                String str = C5242.f13332;
                C5520 c5520M9504 = C5242.m9504(c5518M12660);
                if (c5520M9504 != null && (c5519M9886 = c5520M9504.m9886()) != null) {
                    AbstractC7818 abstractC7818M9639 = AbstractC5323.m9639(m9522().f13387, c5519M9886, NoLookupLocation.FROM_BUILTINS);
                    if (abstractC7818M9639 instanceof C5432) {
                        return (C5432) abstractC7818M9639;
                    }
                }
            }
        }
        return null;
    }

    @Override // p096.InterfaceC7852
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Collection mo9517(AbstractC7818 abstractC7818) throws Exception {
        C5518 c5518M12660;
        C5484 c5484 = C5484.f13938;
        if (abstractC7818.mo9569() != ClassKind.CLASS) {
            return EmptyList.INSTANCE;
        }
        m9522().getClass();
        C5432 c5432M9516 = m9516(abstractC7818);
        if (c5432M9516 == null) {
            return EmptyList.INSTANCE;
        }
        C5519 c5519M10064 = AbstractC5605.m10064(c5432M9516);
        C5244 c5244 = C5244.f13345;
        c5244.getClass();
        String str = C5242.f13332;
        C5520 c5520M9505 = C5242.m9505(c5519M10064);
        AbstractC7818 abstractC7818M12598 = c5520M9505 != null ? c5244.m12598(c5520M9505.m9886()) : null;
        if (abstractC7818M12598 == null) {
            return EmptyList.INSTANCE;
        }
        C5751 c5751 = new C5751(AbstractC3738.m6879(abstractC7818M12598, c5432M9516));
        List list = (List) c5432M9516.f13775.f13732.invoke();
        ArrayList<C7847> arrayList = new ArrayList();
        for (Object obj : list) {
            C7847 c7847 = (C7847) obj;
            if (c7847.getVisibility().f13476.f13484) {
                Collection collectionMo9566 = abstractC7818M12598.mo9566();
                collectionMo9566.getClass();
                Collection<C7847> collection = collectionMo9566;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (C7847 c78472 : collection) {
                        c78472.getClass();
                        if (C7706.m12708(c78472, c7847.mo9564(c5751)) == OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE) {
                            break;
                        }
                    }
                }
                if (c7847.mo9594().size() == 1) {
                    List listMo9594 = c7847.mo9594();
                    listMo9594.getClass();
                    InterfaceC5309 interfaceC5309Mo9770 = ((AbstractC7806) ((InterfaceC5288) AbstractC5176.m9338(listMo9594))).getType().mo10281().mo9770();
                    if (interfaceC5309Mo9770 != null) {
                        int i = AbstractC5605.f14254;
                        c5518M12660 = AbstractC7699.m12660(interfaceC5309Mo9770);
                        c5518M12660.getClass();
                    } else {
                        c5518M12660 = null;
                    }
                    C5518 c5518M126602 = AbstractC7699.m12660(abstractC7818);
                    c5518M126602.getClass();
                    if (AbstractC5227.m9466(c5518M12660, c5518M126602)) {
                    }
                }
                if (!AbstractC7359.m12568(c7847)) {
                    LinkedHashSet linkedHashSet = C5246.f13347;
                    String strM7220 = AbstractC3887.m7220(c7847, 3);
                    String str2 = C5242.f13332;
                    C5520 c5520M9504 = C5242.m9504(AbstractC5605.m10064(c5432M9516).f14041);
                    if (!linkedHashSet.contains((c5520M9504 != null ? C7697.m12647(c5520M9504) : AbstractC3738.m6867(c5432M9516, c5484)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM7220)) {
                        arrayList.add(obj);
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        for (C7847 c78473 : arrayList) {
            c78473.getClass();
            C7832 c7832M12895 = c78473.m12895(C5751.f14593);
            c7832M12895.f19152 = abstractC7818;
            c7832M12895.mo9656(abstractC7818.mo9584());
            c7832M12895.f19134 = true;
            c7832M12895.f19154 = c5751.f14594;
            LinkedHashSet linkedHashSet2 = C5246.f13353;
            String strM72202 = AbstractC3887.m7220(c78473, 3);
            String str3 = C5242.f13332;
            C5520 c5520M95042 = C5242.m9504(AbstractC5605.m10064(c5432M9516).f14041);
            if (!linkedHashSet2.contains((c5520M95042 != null ? C7697.m12647(c5520M95042) : AbstractC3738.m6867(c5432M9516, c5484)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM72202)) {
                c7832M12895.mo9642((InterfaceC7310) AbstractC7082.m12308(this.f13365, f13364[2]));
            }
            AbstractC7831 abstractC7831Mo12549 = c7832M12895.f19133.mo12549(c7832M12895);
            abstractC7831Mo12549.getClass();
            arrayList2.add((C7847) abstractC7831Mo12549);
        }
        return arrayList2;
    }

    @Override // p096.InterfaceC7852
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Collection mo9518(AbstractC7818 abstractC7818) {
        Set setMo9727;
        abstractC7818.getClass();
        m9522().getClass();
        C5432 c5432M9516 = m9516(abstractC7818);
        if (c5432M9516 == null || (setMo9727 = c5432M9516.m9775().mo9727()) == null) {
            setMo9727 = EmptySet.INSTANCE;
        }
        return setMo9727;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137  */
    @Override // p096.InterfaceC7852
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection mo9519(C5523 c5523, AbstractC7818 abstractC7818) throws Throwable {
        Set setM12490;
        Object obj;
        AbstractC7818 abstractC78182;
        Iterable<InterfaceC5303> iterable;
        boolean zBooleanValue;
        InterfaceC5303 interfaceC5303;
        InterfaceC7310 interfaceC7310;
        c5523.getClass();
        abstractC7818.getClass();
        boolean zEquals = c5523.equals(C5245.f13346);
        InterfaceC5920[] interfaceC5920Arr = f13364;
        if (zEquals && (abstractC7818 instanceof C5633) && (AbstractC7359.m12578(abstractC7818, AbstractC7356.f18244) || AbstractC7359.m12582(abstractC7818) != null)) {
            C5633 c5633 = (C5633) abstractC7818;
            List<ProtoBuf$Function> functionList = c5633.f14348.getFunctionList();
            functionList.getClass();
            if (!functionList.isEmpty()) {
                Iterator<T> it = functionList.iterator();
                while (it.hasNext()) {
                    if (AbstractC4765.m8875(c5633.f14339.f14406, ((ProtoBuf$Function) it.next()).getName()).equals(C5245.f13346)) {
                        return EmptyList.INSTANCE;
                    }
                }
            }
            InterfaceC5324 interfaceC5324Mo9601 = ((InterfaceC5303) AbstractC5176.m9339(((AbstractC5710) AbstractC7082.m12308(this.f13367, interfaceC5920Arr[1])).mo10283().mo9724(c5523, NoLookupLocation.FROM_BUILTINS))).mo9601();
            interfaceC5324Mo9601.mo9652(c5633);
            interfaceC5324Mo9601.mo9651(AbstractC5321.f13461);
            interfaceC5324Mo9601.mo9656(c5633.mo9584());
            interfaceC5324Mo9601.mo9641(c5633.mo12866());
            InterfaceC5316 interfaceC5316Build = interfaceC5324Mo9601.build();
            interfaceC5316Build.getClass();
            return AbstractC7176.m12487((InterfaceC5303) interfaceC5316Build);
        }
        m9522().getClass();
        C5432 c5432M9516 = m9516(abstractC7818);
        if (c5432M9516 == null) {
            iterable = EmptyList.INSTANCE;
        } else {
            C5519 c5519M10064 = AbstractC5605.m10064(c5432M9516);
            C5244 c5244 = C5244.f13345;
            c5244.getClass();
            String str = C5242.f13332;
            C5520 c5520M9505 = C5242.m9505(c5519M10064);
            AbstractC7818 abstractC7818M12598 = c5520M9505 != null ? c5244.m12598(c5520M9505.m9886()) : null;
            if (abstractC7818M12598 == null) {
                setM12490 = EmptySet.INSTANCE;
            } else {
                C5518 c5518M12660 = AbstractC7699.m12660(abstractC7818M12598);
                c5518M12660.getClass();
                C5519 c5519M9506 = C5242.m9506(c5518M12660);
                if (c5519M9506 == null) {
                    setM12490 = AbstractC8568.m13614(abstractC7818M12598);
                } else {
                    AbstractC7818 abstractC7818M125982 = c5244.m12598(c5519M9506);
                    abstractC7818M125982.getClass();
                    setM12490 = AbstractC7176.m12490(abstractC7818M12598, abstractC7818M125982);
                }
            }
            Iterable iterable2 = setM12490;
            iterable2.getClass();
            if (iterable2 instanceof List) {
                List list = (List) iterable2;
                obj = list.isEmpty() ? null : list.get(list.size() - 1);
                abstractC78182 = (AbstractC7818) obj;
                if (abstractC78182 != null) {
                    iterable = EmptyList.INSTANCE;
                } else {
                    int i = C8102.f19715;
                    ArrayList arrayList = new ArrayList(AbstractC5177.m9381(iterable2, 10));
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(AbstractC5605.m10064((AbstractC7818) it2.next()));
                    }
                    C8102 c8102 = new C8102(0);
                    c8102.addAll(arrayList);
                    String str2 = C5242.f13332;
                    boolean zContainsKey = C5242.f13341.containsKey(AbstractC7699.m12660(abstractC7818));
                    C5519 c5519M100642 = AbstractC5605.m10064(c5432M9516);
                    C5860 c5860 = new C5860(c5432M9516, 6, abstractC78182);
                    C5669 c5669 = this.f13366;
                    c5669.getClass();
                    Object objInvoke = c5669.invoke(new C5676(c5860, c5519M100642));
                    if (objInvoke == null) {
                        C5669.m10127(3);
                        throw null;
                    }
                    InterfaceC8083 interfaceC8083Mo9773 = ((AbstractC7818) objInvoke).mo9773();
                    interfaceC8083Mo9773.getClass();
                    Collection collectionMo9724 = interfaceC8083Mo9773.mo9724(c5523, NoLookupLocation.FROM_BUILTINS);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : collectionMo9724) {
                        InterfaceC5303 interfaceC53032 = (InterfaceC5303) obj2;
                        if (((AbstractC7831) interfaceC53032).getKind() == CallableMemberDescriptor$Kind.DECLARATION) {
                            AbstractC7831 abstractC7831 = (AbstractC7831) interfaceC53032;
                            if (abstractC7831.getVisibility().f13476.f13484 && !AbstractC7359.m12568(interfaceC53032)) {
                                Collection collectionMo9589 = abstractC7831.mo9589();
                                collectionMo9589.getClass();
                                Collection collection = collectionMo9589;
                                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                    Iterator it3 = collection.iterator();
                                    while (it3.hasNext()) {
                                        InterfaceC5331 interfaceC5331Mo9587 = ((InterfaceC5316) it3.next()).mo9587();
                                        interfaceC5331Mo9587.getClass();
                                        if (c8102.contains(AbstractC5605.m10064(interfaceC5331Mo9587))) {
                                            break;
                                        }
                                    }
                                }
                                InterfaceC5331 interfaceC5331Mo95872 = ((AbstractC7837) interfaceC53032).mo9587();
                                interfaceC5331Mo95872.getClass();
                                AbstractC7818 abstractC78183 = (AbstractC7818) interfaceC5331Mo95872;
                                String strM7220 = AbstractC3887.m7220(interfaceC53032, 3);
                                LinkedHashSet linkedHashSet = C5246.f13348;
                                String str3 = C5242.f13332;
                                C5520 c5520M9504 = C5242.m9504(AbstractC5605.m10064(abstractC78183).f14041);
                                if (linkedHashSet.contains((c5520M9504 != null ? C7697.m12647(c5520M9504) : AbstractC3738.m6867(abstractC78183, C5484.f13938)) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + strM7220) ^ zContainsKey) {
                                    zBooleanValue = true;
                                } else {
                                    Boolean boolM13051 = AbstractC8104.m13051(AbstractC7176.m12487(interfaceC53032), C5241.f13326, new C5240(this));
                                    boolM13051.getClass();
                                    zBooleanValue = boolM13051.booleanValue();
                                }
                                if (!zBooleanValue) {
                                    arrayList2.add(obj2);
                                }
                            }
                        }
                    }
                    iterable = arrayList2;
                }
            } else {
                Iterator it4 = iterable2.iterator();
                if (it4.hasNext()) {
                    Object next = it4.next();
                    while (it4.hasNext()) {
                        next = it4.next();
                    }
                    obj = next;
                }
                abstractC78182 = (AbstractC7818) obj;
                if (abstractC78182 != null) {
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC5303 interfaceC53033 : iterable) {
            InterfaceC5331 interfaceC5331Mo95873 = ((AbstractC7837) interfaceC53033).mo9587();
            interfaceC5331Mo95873.getClass();
            InterfaceC5316 interfaceC5316Mo9564 = ((AbstractC7831) interfaceC53033).mo9564(new C5751(AbstractC3738.m6879((AbstractC7818) interfaceC5331Mo95873, abstractC7818)));
            interfaceC5316Mo9564.getClass();
            InterfaceC5324 interfaceC5324Mo96012 = ((InterfaceC5303) interfaceC5316Mo9564).mo9601();
            interfaceC5324Mo96012.mo9652(abstractC7818);
            interfaceC5324Mo96012.mo9641(abstractC7818.mo12866());
            interfaceC5324Mo96012.mo9653();
            InterfaceC5331 interfaceC5331Mo95874 = ((AbstractC7837) interfaceC53033).mo9587();
            interfaceC5331Mo95874.getClass();
            Object objM13047 = AbstractC8104.m13047(AbstractC7176.m12487((AbstractC7818) interfaceC5331Mo95874), new C3075(this, 18), new C5251(AbstractC3887.m7220(interfaceC53033, 3), new Ref$ObjectRef()));
            objM13047.getClass();
            int i2 = AbstractC5248.f13355[((JvmBuiltInsCustomizer$JDKMemberStatus) objM13047).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    AbstractC7838 abstractC7838 = (AbstractC7838) interfaceC53033;
                    C5523 name = abstractC7838.getName();
                    boolean zM9466 = AbstractC5227.m9466(name, AbstractC5249.f13357);
                    C5669 c56692 = this.f13371;
                    if (zM9466) {
                        interfaceC7310 = (InterfaceC7310) c56692.invoke(new Pair(abstractC7838.getName().m9894(), "first"));
                    } else {
                        if (!AbstractC5227.m9466(name, AbstractC5249.f13356)) {
                            C1123.m1405(abstractC7838.getName(), "Unexpected name: ");
                            return null;
                        }
                        interfaceC7310 = (InterfaceC7310) c56692.invoke(new Pair(abstractC7838.getName().m9894(), "last"));
                    }
                    interfaceC5324Mo96012.mo9642(interfaceC7310);
                } else if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            C5043.m9170();
                            return null;
                        }
                    }
                    interfaceC5303 = null;
                } else {
                    interfaceC5324Mo96012.mo9642((InterfaceC7310) AbstractC7082.m12308(this.f13365, interfaceC5920Arr[2]));
                }
                InterfaceC5316 interfaceC5316Build2 = interfaceC5324Mo96012.build();
                interfaceC5316Build2.getClass();
                interfaceC5303 = (InterfaceC5303) interfaceC5316Build2;
            } else {
                if (abstractC7818.mo9568() != Modality.FINAL || abstractC7818.mo9569() == ClassKind.ENUM_CLASS) {
                    interfaceC5324Mo96012.mo9650();
                    InterfaceC5316 interfaceC5316Build22 = interfaceC5324Mo96012.build();
                    interfaceC5316Build22.getClass();
                    interfaceC5303 = (InterfaceC5303) interfaceC5316Build22;
                }
                interfaceC5303 = null;
            }
            if (interfaceC5303 != null) {
                arrayList3.add(interfaceC5303);
            }
        }
        return arrayList3;
    }

    @Override // p096.InterfaceC7852
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Collection mo9520(AbstractC7818 abstractC7818) {
        int i = AbstractC5605.f14254;
        C5518 c5518M12660 = AbstractC7699.m12660(abstractC7818);
        c5518M12660.getClass();
        LinkedHashSet linkedHashSet = C5246.f13352;
        C5518 c5518 = AbstractC7356.f18244;
        boolean zEquals = c5518M12660.equals(c5518);
        boolean zIsAssignableFrom = false;
        AbstractC5710 abstractC5710 = this.f13368;
        if (!zEquals) {
            HashMap map = AbstractC7356.f18249;
            if (map.get(c5518M12660) == null) {
                if (c5518M12660.equals(c5518) || map.get(c5518M12660) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = C5242.f13332;
                    C5520 c5520M9504 = C5242.m9504(c5518M12660);
                    if (c5520M9504 != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(c5520M9504.m9886().f14041.f14038));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? AbstractC7176.m12487(abstractC5710) : EmptyList.INSTANCE;
            }
        }
        return AbstractC7176.m12490((AbstractC5710) AbstractC7082.m12308(this.f13367, f13364[1]), abstractC5710);
    }

    @Override // p096.InterfaceC7850
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean mo9521(AbstractC7818 abstractC7818, C5626 c5626) {
        abstractC7818.getClass();
        C5432 c5432M9516 = m9516(abstractC7818);
        if (c5432M9516 == null || !c5626.getAnnotations().mo10077(AbstractC7849.f19204)) {
            return true;
        }
        m9522().getClass();
        String strM7220 = AbstractC3887.m7220(c5626, 3);
        C5422 c5422M9775 = c5432M9516.m9775();
        C5523 name = c5626.getName();
        name.getClass();
        Collection collectionMo9724 = c5422M9775.mo9724(name, NoLookupLocation.FROM_BUILTINS);
        if ((collectionMo9724 instanceof Collection) && collectionMo9724.isEmpty()) {
            return false;
        }
        Iterator it = collectionMo9724.iterator();
        while (it.hasNext()) {
            if (AbstractC3887.m7220((InterfaceC5303) it.next(), 3).equals(strM7220)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C5257 m9522() {
        return (C5257) AbstractC7082.m12308(this.f13369, f13364[0]);
    }
}
