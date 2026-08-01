package p066;

import androidx.compose.foundation.text.C1012;
import com.bumptech.glide.AbstractC3066;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4491;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.reflect.jvm.internal.impl.descriptors.C4490;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4473;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4690;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.name.C4693;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4878;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4893;
import kotlin.reflect.jvm.internal.impl.types.C4874;
import kotlin.reflect.jvm.internal.impl.types.C4885;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.text.Regex;
import p046.C6482;
import p046.InterfaceC6481;
import p049.AbstractC6526;
import p052.InterfaceC6558;
import p079.AbstractC6989;
import p079.AbstractC6996;
import p079.C6979;
import p079.C6981;
import p079.C6990;
import p079.C6991;
import p079.C6992;
import p079.C7006;
import p100.C7246;
import p100.C7247;
import p101.C7248;
import p101.InterfaceC7254;
import p103.AbstractC7275;
import p103.C7273;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6876 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4485 f18317;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4485 f18318;

    static {
        int i = 0;
        f18318 = new C4485("ResolutionAnchorProvider", i);
        f18317 = new C4485("StdlibClassFinder", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C6991 m12123(InterfaceC4473 interfaceC4473, InterfaceC6481 interfaceC6481) {
        return m12132(interfaceC4473, interfaceC6481, true, interfaceC4473.mo9026());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7006 m12124(InterfaceC4481 interfaceC4481, AbstractC4882 abstractC4882, C4691 c4691, InterfaceC6481 interfaceC6481, int i) {
        if (interfaceC4481 == null) {
            m12126(32);
            throw null;
        }
        if (interfaceC6481 == null) {
            m12126(33);
            throw null;
        }
        if (abstractC4882 == null) {
            return null;
        }
        C7247 c7247 = new C7247(interfaceC4481, abstractC4882, c4691);
        Regex regex = AbstractC4690.f13703;
        return new C7006(interfaceC4481, c7247, interfaceC6481, C4691.m9330(AbstractC4690.f13702 + '_' + i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m12125(AbstractC6989 abstractC6989, LinkedHashSet linkedHashSet, InterfaceC7254 interfaceC7254, boolean z) {
        for (InterfaceC4499 interfaceC4499 : AbstractC3066.m6860(interfaceC7254, C7248.f19318, 2)) {
            if (interfaceC4499 instanceof AbstractC6989) {
                AbstractC6989 abstractC6989Mo9519 = (AbstractC6989) interfaceC4499;
                if (abstractC6989Mo9519.mo9008()) {
                    C4691 name = abstractC6989Mo9519.getName();
                    name.getClass();
                    InterfaceC4477 interfaceC4477Mo9155 = interfaceC7254.mo9155(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    abstractC6989Mo9519 = interfaceC4477Mo9155 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo9155 : interfaceC4477Mo9155 instanceof AbstractC6996 ? ((AbstractC6996) interfaceC4477Mo9155).mo9519() : null;
                }
                if (abstractC6989Mo9519 != null) {
                    int i = AbstractC6870.f18312;
                    Iterator it = abstractC6989Mo9519.mo9001().mo9494().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC6870.m12107((AbstractC4882) it.next(), abstractC6989.mo9002())) {
                                linkedHashSet.add(abstractC6989Mo9519);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        InterfaceC7254 interfaceC7254Mo9215 = abstractC6989Mo9519.mo9215();
                        interfaceC7254Mo9215.getClass();
                        m12125(abstractC6989, linkedHashSet, interfaceC7254Mo9215, z);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12126(int i) {
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
    public static final Collection m12127(Collection collection, InterfaceC6558 interfaceC6558) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = C7273.f19370;
        C7273 c7273M12489 = AbstractC7275.m12489();
        while (!linkedList.isEmpty()) {
            Object objM8820 = AbstractC4344.m8820(linkedList);
            int i2 = C7273.f19370;
            C7273 c7273M124892 = AbstractC7275.m12489();
            ArrayList arrayListM12146 = C6877.m12146(objM8820, linkedList, interfaceC6558, new C1012(c7273M124892, 21));
            if (arrayListM12146.size() == 1 && c7273M124892.isEmpty()) {
                Object objM8780 = AbstractC4344.m8780(arrayListM12146);
                objM8780.getClass();
                c7273M12489.add(objM8780);
            } else {
                Object objM12141 = C6877.m12141(arrayListM12146, interfaceC6558);
                InterfaceC4481 interfaceC4481 = (InterfaceC4481) interfaceC6558.invoke(objM12141);
                for (Object obj : arrayListM12146) {
                    obj.getClass();
                    if (!C6877.m12147(interfaceC4481, (InterfaceC4481) interfaceC6558.invoke(obj))) {
                        c7273M124892.add(obj);
                    }
                }
                if (!c7273M124892.isEmpty()) {
                    c7273M12489.addAll(c7273M124892);
                }
                c7273M12489.add(objM12141);
            }
        }
        return c7273M12489;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C6990 m12128(InterfaceC4473 interfaceC4473, InterfaceC6481 interfaceC6481, InterfaceC6481 interfaceC64812, boolean z, C4490 c4490, InterfaceC4462 interfaceC4462) {
        if (interfaceC6481 == null) {
            m12126(8);
            throw null;
        }
        if (interfaceC64812 == null) {
            m12126(9);
            throw null;
        }
        if (c4490 == null) {
            m12126(10);
            throw null;
        }
        if (interfaceC4462 == null) {
            m12126(11);
            throw null;
        }
        C6990 c6990 = new C6990(interfaceC4473, interfaceC6481, interfaceC4473.mo9009(), c4490, z, false, false, CallableMemberDescriptor$Kind.DECLARATION, null, interfaceC4462);
        c6990.f18706 = C6990.m12310(c6990, interfaceC4473.getType(), interfaceC64812);
        return c6990;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C6992 m12129(AbstractC6989 abstractC6989) {
        if (abstractC6989 == null) {
            m12126(26);
            throw null;
        }
        InterfaceC4486 interfaceC4486M12104 = AbstractC6870.m12104(abstractC6989);
        interfaceC4486M12104.getClass();
        AbstractC6989 abstractC6989M9077 = AbstractC4491.m9077(interfaceC4486M12104, C4693.f13713);
        if (abstractC6989M9077 == null) {
            return null;
        }
        Modality modality = Modality.FINAL;
        C4490 c4490 = AbstractC4489.f13116;
        C4691 c4691 = AbstractC6526.f17842;
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.SYNTHESIZED;
        C6992 c6992M12317 = C6992.m12317(abstractC6989, modality, c4490, false, c4691, callableMemberDescriptor$Kind, abstractC6989.mo9026());
        C6991 c6991 = new C6991(c6992M12317, C6482.f17768, modality, c4490, false, false, false, callableMemberDescriptor$Kind, null, abstractC6989.mo9026());
        c6992M12317.m12321(c6991, null, null, null);
        C4874.f14175.getClass();
        C4874 c4874 = C4874.f14176;
        InterfaceC4873 interfaceC4873Mo9001 = abstractC6989M9077.mo9001();
        List listSingletonList = Collections.singletonList(new C4885(abstractC6989.mo9025()));
        c4874.getClass();
        interfaceC4873Mo9001.getClass();
        listSingletonList.getClass();
        AbstractC4878 abstractC4878M9818 = AbstractC4893.m9818(listSingletonList, c4874, interfaceC4873Mo9001, false);
        List list = Collections.EMPTY_LIST;
        c6992M12317.m12320(abstractC4878M9818, list, null, null, list);
        c6991.m12314(c6992M12317.getReturnType());
        return c6992M12317;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C6990 m12130(InterfaceC4473 interfaceC4473, InterfaceC6481 interfaceC6481) {
        InterfaceC4462 interfaceC4462Mo9026 = interfaceC4473.mo9026();
        if (interfaceC4462Mo9026 != null) {
            return m12128(interfaceC4473, interfaceC6481, C6482.f17768, true, interfaceC4473.getVisibility(), interfaceC4462Mo9026);
        }
        m12126(6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C7006 m12131(InterfaceC4481 interfaceC4481, AbstractC4882 abstractC4882, InterfaceC6481 interfaceC6481) {
        if (abstractC4882 == null) {
            return null;
        }
        return new C7006(interfaceC4481, new C7246(interfaceC4481, abstractC4882), interfaceC6481);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C6991 m12132(InterfaceC4473 interfaceC4473, InterfaceC6481 interfaceC6481, boolean z, InterfaceC4462 interfaceC4462) {
        if (interfaceC6481 == null) {
            m12126(18);
            throw null;
        }
        if (interfaceC4462 != null) {
            return new C6991(interfaceC4473, interfaceC6481, interfaceC4473.mo9009(), interfaceC4473.getVisibility(), z, false, false, CallableMemberDescriptor$Kind.DECLARATION, null, interfaceC4462);
        }
        m12126(19);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C6981 m12133(AbstractC6989 abstractC6989) {
        if (abstractC6989 == null) {
            m12126(24);
            throw null;
        }
        C6981 c6981M12293 = C6981.m12293(abstractC6989, AbstractC6526.f17841, CallableMemberDescriptor$Kind.SYNTHESIZED, abstractC6989.mo9026());
        C6979 c6979 = new C6979(c6981M12293, null, 0, C6482.f17768, C4691.m9330("value"), AbstractC4773.m9499(abstractC6989).m12029(), false, false, false, null, abstractC6989.mo9026());
        List list = Collections.EMPTY_LIST;
        return c6981M12293.mo12297(null, null, list, list, Collections.singletonList(c6979), abstractC6989.mo9025(), Modality.FINAL, AbstractC4489.f13116);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C6981 m12134(AbstractC6989 abstractC6989) {
        if (abstractC6989 == null) {
            m12126(22);
            throw null;
        }
        C6981 c6981M12293 = C6981.m12293(abstractC6989, AbstractC6526.f17843, CallableMemberDescriptor$Kind.SYNTHESIZED, abstractC6989.mo9026());
        List list = Collections.EMPTY_LIST;
        return c6981M12293.mo12297(null, null, list, list, list, AbstractC4773.m9499(abstractC6989).m12034(abstractC6989.mo9025(), Variance.INVARIANT), Modality.FINAL, AbstractC4489.f13116);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo9537(InterfaceC4480 interfaceC4480, InterfaceC4480 interfaceC44802);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo9538(InterfaceC4480 interfaceC4480);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void mo12135(InterfaceC4480 interfaceC4480, Collection collection) {
        interfaceC4480.getClass();
        interfaceC4480.mo9031(collection);
    }
}
