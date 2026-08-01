package p082;

import androidx.compose.foundation.text.C1850;
import com.bumptech.glide.AbstractC3898;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5522;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.name.C5525;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.C5706;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.text.Regex;
import p062.C7311;
import p062.InterfaceC7310;
import p065.AbstractC7355;
import p068.InterfaceC7387;
import p095.AbstractC7818;
import p095.AbstractC7825;
import p095.C7808;
import p095.C7810;
import p095.C7819;
import p095.C7820;
import p095.C7821;
import p095.C7835;
import p116.C8075;
import p116.C8076;
import p117.C8077;
import p117.InterfaceC8083;
import p119.AbstractC8104;
import p119.C8102;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7705 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5317 f18662;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5317 f18663;

    static {
        int i = 0;
        f18663 = new C5317("ResolutionAnchorProvider", i);
        f18662 = new C5317("StdlibClassFinder", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C7820 m12682(InterfaceC5305 interfaceC5305, InterfaceC7310 interfaceC7310) {
        return m12691(interfaceC5305, interfaceC7310, true, interfaceC5305.mo9585());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7835 m12683(InterfaceC5313 interfaceC5313, AbstractC5714 abstractC5714, C5523 c5523, InterfaceC7310 interfaceC7310, int i) {
        if (interfaceC5313 == null) {
            m12685(32);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12685(33);
            throw null;
        }
        if (abstractC5714 == null) {
            return null;
        }
        C8076 c8076 = new C8076(interfaceC5313, abstractC5714, c5523);
        Regex regex = AbstractC5522.f14048;
        return new C7835(interfaceC5313, c8076, interfaceC7310, C5523.m9889(AbstractC5522.f14047 + '_' + i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m12684(AbstractC7818 abstractC7818, LinkedHashSet linkedHashSet, InterfaceC8083 interfaceC8083, boolean z) {
        for (InterfaceC5331 interfaceC5331 : AbstractC3898.m7420(interfaceC8083, C8077.f19663, 2)) {
            if (interfaceC5331 instanceof AbstractC7818) {
                AbstractC7818 abstractC7818Mo10078 = (AbstractC7818) interfaceC5331;
                if (abstractC7818Mo10078.mo9567()) {
                    C5523 name = abstractC7818Mo10078.getName();
                    name.getClass();
                    InterfaceC5309 interfaceC5309Mo9714 = interfaceC8083.mo9714(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    abstractC7818Mo10078 = interfaceC5309Mo9714 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo9714 : interfaceC5309Mo9714 instanceof AbstractC7825 ? ((AbstractC7825) interfaceC5309Mo9714).mo10078() : null;
                }
                if (abstractC7818Mo10078 != null) {
                    int i = AbstractC7699.f18657;
                    Iterator it = abstractC7818Mo10078.mo9560().mo10053().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC7699.m12666((AbstractC5714) it.next(), abstractC7818.mo9561())) {
                                linkedHashSet.add(abstractC7818Mo10078);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        InterfaceC8083 interfaceC8083Mo9774 = abstractC7818Mo10078.mo9774();
                        interfaceC8083Mo9774.getClass();
                        m12684(abstractC7818, linkedHashSet, interfaceC8083Mo9774, z);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12685(int i) {
        String str = (i == 12 || i == 23 || i == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 12 || i == 23 || i == 25) ? 2 : 3];
        switch (i) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case 31:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i == 12) {
            objArr[1] = "createSetter";
        } else if (i == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case 31:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 12 && i != 23 && i != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Collection m12686(Collection collection, InterfaceC7387 interfaceC7387) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = C8102.f19715;
        C8102 c8102M13048 = AbstractC8104.m13048();
        while (!linkedList.isEmpty()) {
            Object objM9379 = AbstractC5176.m9379(linkedList);
            int i2 = C8102.f19715;
            C8102 c8102M130482 = AbstractC8104.m13048();
            ArrayList arrayListM12705 = C7706.m12705(objM9379, linkedList, interfaceC7387, new C1850(c8102M130482, 21));
            if (arrayListM12705.size() == 1 && c8102M130482.isEmpty()) {
                Object objM9339 = AbstractC5176.m9339(arrayListM12705);
                objM9339.getClass();
                c8102M13048.add(objM9339);
            } else {
                Object objM12700 = C7706.m12700(arrayListM12705, interfaceC7387);
                InterfaceC5313 interfaceC5313 = (InterfaceC5313) interfaceC7387.invoke(objM12700);
                for (Object obj : arrayListM12705) {
                    obj.getClass();
                    if (!C7706.m12706(interfaceC5313, (InterfaceC5313) interfaceC7387.invoke(obj))) {
                        c8102M130482.add(obj);
                    }
                }
                if (!c8102M130482.isEmpty()) {
                    c8102M13048.addAll(c8102M130482);
                }
                c8102M13048.add(objM12700);
            }
        }
        return c8102M13048;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C7819 m12687(InterfaceC5305 interfaceC5305, InterfaceC7310 interfaceC7310, InterfaceC7310 interfaceC73102, boolean z, C5322 c5322, InterfaceC5294 interfaceC5294) {
        if (interfaceC7310 == null) {
            m12685(8);
            throw null;
        }
        if (interfaceC73102 == null) {
            m12685(9);
            throw null;
        }
        if (c5322 == null) {
            m12685(10);
            throw null;
        }
        if (interfaceC5294 == null) {
            m12685(11);
            throw null;
        }
        C7819 c7819 = new C7819(interfaceC5305, interfaceC7310, interfaceC5305.mo9568(), c5322, z, false, false, CallableMemberDescriptor$Kind.DECLARATION, null, interfaceC5294);
        c7819.f19051 = C7819.m12869(c7819, interfaceC5305.getType(), interfaceC73102);
        return c7819;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C7821 m12688(AbstractC7818 abstractC7818) {
        if (abstractC7818 == null) {
            m12685(26);
            throw null;
        }
        InterfaceC5318 interfaceC5318M12663 = AbstractC7699.m12663(abstractC7818);
        interfaceC5318M12663.getClass();
        AbstractC7818 abstractC7818M9636 = AbstractC5323.m9636(interfaceC5318M12663, C5525.f14058);
        if (abstractC7818M9636 == null) {
            return null;
        }
        Modality modality = Modality.FINAL;
        C5322 c5322 = AbstractC5321.f13461;
        C5523 c5523 = AbstractC7355.f18187;
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.SYNTHESIZED;
        C7821 c7821M12876 = C7821.m12876(abstractC7818, modality, c5322, false, c5523, callableMemberDescriptor$Kind, abstractC7818.mo9585());
        C7820 c7820 = new C7820(c7821M12876, C7311.f18113, modality, c5322, false, false, false, callableMemberDescriptor$Kind, null, abstractC7818.mo9585());
        c7821M12876.m12880(c7820, null, null, null);
        C5706.f14520.getClass();
        C5706 c5706 = C5706.f14521;
        InterfaceC5705 interfaceC5705Mo9560 = abstractC7818M9636.mo9560();
        List listSingletonList = Collections.singletonList(new C5717(abstractC7818.mo9584()));
        c5706.getClass();
        interfaceC5705Mo9560.getClass();
        listSingletonList.getClass();
        AbstractC5710 abstractC5710M10377 = AbstractC5725.m10377(listSingletonList, c5706, interfaceC5705Mo9560, false);
        List list = Collections.EMPTY_LIST;
        c7821M12876.m12879(abstractC5710M10377, list, null, null, list);
        c7820.m12873(c7821M12876.getReturnType());
        return c7821M12876;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C7819 m12689(InterfaceC5305 interfaceC5305, InterfaceC7310 interfaceC7310) {
        InterfaceC5294 interfaceC5294Mo9585 = interfaceC5305.mo9585();
        if (interfaceC5294Mo9585 != null) {
            return m12687(interfaceC5305, interfaceC7310, C7311.f18113, true, interfaceC5305.getVisibility(), interfaceC5294Mo9585);
        }
        m12685(6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C7835 m12690(InterfaceC5313 interfaceC5313, AbstractC5714 abstractC5714, InterfaceC7310 interfaceC7310) {
        if (abstractC5714 == null) {
            return null;
        }
        return new C7835(interfaceC5313, new C8075(interfaceC5313, abstractC5714), interfaceC7310);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C7820 m12691(InterfaceC5305 interfaceC5305, InterfaceC7310 interfaceC7310, boolean z, InterfaceC5294 interfaceC5294) {
        if (interfaceC7310 == null) {
            m12685(18);
            throw null;
        }
        if (interfaceC5294 != null) {
            return new C7820(interfaceC5305, interfaceC7310, interfaceC5305.mo9568(), interfaceC5305.getVisibility(), z, false, false, CallableMemberDescriptor$Kind.DECLARATION, null, interfaceC5294);
        }
        m12685(19);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C7810 m12692(AbstractC7818 abstractC7818) {
        if (abstractC7818 == null) {
            m12685(24);
            throw null;
        }
        C7810 c7810M12852 = C7810.m12852(abstractC7818, AbstractC7355.f18186, CallableMemberDescriptor$Kind.SYNTHESIZED, abstractC7818.mo9585());
        C7808 c7808 = new C7808(c7810M12852, null, 0, C7311.f18113, C5523.m9889("value"), AbstractC5605.m10058(abstractC7818).m12588(), false, false, false, null, abstractC7818.mo9585());
        List list = Collections.EMPTY_LIST;
        return c7810M12852.mo12856(null, null, list, list, Collections.singletonList(c7808), abstractC7818.mo9584(), Modality.FINAL, AbstractC5321.f13461);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C7810 m12693(AbstractC7818 abstractC7818) {
        if (abstractC7818 == null) {
            m12685(22);
            throw null;
        }
        C7810 c7810M12852 = C7810.m12852(abstractC7818, AbstractC7355.f18188, CallableMemberDescriptor$Kind.SYNTHESIZED, abstractC7818.mo9585());
        List list = Collections.EMPTY_LIST;
        return c7810M12852.mo12856(null, null, list, list, list, AbstractC5605.m10058(abstractC7818).m12593(abstractC7818.mo9584(), Variance.INVARIANT), Modality.FINAL, AbstractC5321.f13461);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo10096(InterfaceC5312 interfaceC5312, InterfaceC5312 interfaceC53122);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo10097(InterfaceC5312 interfaceC5312);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void mo12694(InterfaceC5312 interfaceC5312, Collection collection) {
        interfaceC5312.getClass();
        interfaceC5312.mo9590(collection);
    }
}
