package p066;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.C1012;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4490;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlin.reflect.jvm.internal.impl.descriptors.C4489;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4472;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4689;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.name.C4692;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4877;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4892;
import kotlin.reflect.jvm.internal.impl.types.C4873;
import kotlin.reflect.jvm.internal.impl.types.C4884;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.text.Regex;
import p046.C6481;
import p046.InterfaceC6480;
import p049.AbstractC6525;
import p052.InterfaceC6557;
import p079.AbstractC6988;
import p079.AbstractC6995;
import p079.C6978;
import p079.C6980;
import p079.C6989;
import p079.C6990;
import p079.C6991;
import p079.C7005;
import p100.C7245;
import p100.C7246;
import p101.C7247;
import p101.InterfaceC7253;
import p103.AbstractC7274;
import p103.C7272;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6875 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4484 f18322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4484 f18323;

    static {
        int i = 0;
        f18323 = new C4484("ResolutionAnchorProvider", i);
        f18322 = new C4484("StdlibClassFinder", i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C6990 m12095(InterfaceC4472 interfaceC4472, InterfaceC6480 interfaceC6480) {
        return m12104(interfaceC4472, interfaceC6480, true, interfaceC4472.mo9036());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C7005 m12096(InterfaceC4480 interfaceC4480, AbstractC4881 abstractC4881, C4690 c4690, InterfaceC6480 interfaceC6480, int i) {
        if (interfaceC4480 == null) {
            m12098(32);
            throw null;
        }
        if (interfaceC6480 == null) {
            m12098(33);
            throw null;
        }
        if (abstractC4881 == null) {
            return null;
        }
        C7246 c7246 = new C7246(interfaceC4480, abstractC4881, c4690);
        Regex regex = AbstractC4689.f13699;
        return new C7005(interfaceC4480, c7246, interfaceC6480, C4690.m9340(AbstractC4689.f13698 + '_' + i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final void m12097(AbstractC6988 abstractC6988, LinkedHashSet linkedHashSet, InterfaceC7253 interfaceC7253, boolean z) {
        for (InterfaceC4498 interfaceC4498 : AbstractC0455.m1162(interfaceC7253, C7247.f19323, 2)) {
            if (interfaceC4498 instanceof AbstractC6988) {
                AbstractC6988 abstractC6988Mo9529 = (AbstractC6988) interfaceC4498;
                if (abstractC6988Mo9529.mo9018()) {
                    C4690 name = abstractC6988Mo9529.getName();
                    name.getClass();
                    InterfaceC4476 interfaceC4476Mo9165 = interfaceC7253.mo9165(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    abstractC6988Mo9529 = interfaceC4476Mo9165 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo9165 : interfaceC4476Mo9165 instanceof AbstractC6995 ? ((AbstractC6995) interfaceC4476Mo9165).mo9529() : null;
                }
                if (abstractC6988Mo9529 != null) {
                    int i = AbstractC6869.f18317;
                    Iterator it = abstractC6988Mo9529.mo9011().mo9504().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AbstractC6869.m12079((AbstractC4881) it.next(), abstractC6988.mo9012())) {
                                linkedHashSet.add(abstractC6988Mo9529);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z) {
                        InterfaceC7253 interfaceC7253Mo9225 = abstractC6988Mo9529.mo9225();
                        interfaceC7253Mo9225.getClass();
                        m12097(abstractC6988, linkedHashSet, interfaceC7253Mo9225, z);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12098(int i) {
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
    public static final Collection m12099(Collection collection, InterfaceC6557 interfaceC6557) {
        collection.getClass();
        if (collection.size() <= 1) {
            return collection;
        }
        LinkedList linkedList = new LinkedList(collection);
        int i = C7272.f19375;
        C7272 c7272M12462 = AbstractC7274.m12462();
        while (!linkedList.isEmpty()) {
            Object objM8827 = AbstractC4343.m8827(linkedList);
            int i2 = C7272.f19375;
            C7272 c7272M124622 = AbstractC7274.m12462();
            ArrayList arrayListM12118 = C6876.m12118(objM8827, linkedList, interfaceC6557, new C1012(c7272M124622, 21));
            if (arrayListM12118.size() == 1 && c7272M124622.isEmpty()) {
                Object objM8822 = AbstractC4343.m8822(arrayListM12118);
                objM8822.getClass();
                c7272M12462.add(objM8822);
            } else {
                Object objM12113 = C6876.m12113(arrayListM12118, interfaceC6557);
                InterfaceC4480 interfaceC4480 = (InterfaceC4480) interfaceC6557.invoke(objM12113);
                for (Object obj : arrayListM12118) {
                    obj.getClass();
                    if (!C6876.m12119(interfaceC4480, (InterfaceC4480) interfaceC6557.invoke(obj))) {
                        c7272M124622.add(obj);
                    }
                }
                if (!c7272M124622.isEmpty()) {
                    c7272M12462.addAll(c7272M124622);
                }
                c7272M12462.add(objM12113);
            }
        }
        return c7272M12462;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static C6989 m12100(InterfaceC4472 interfaceC4472, InterfaceC6480 interfaceC6480, InterfaceC6480 interfaceC64802, boolean z, C4489 c4489, InterfaceC4461 interfaceC4461) {
        if (interfaceC6480 == null) {
            m12098(8);
            throw null;
        }
        if (interfaceC64802 == null) {
            m12098(9);
            throw null;
        }
        if (c4489 == null) {
            m12098(10);
            throw null;
        }
        if (interfaceC4461 == null) {
            m12098(11);
            throw null;
        }
        C6989 c6989 = new C6989(interfaceC4472, interfaceC6480, interfaceC4472.mo9019(), c4489, z, false, false, CallableMemberDescriptor$Kind.DECLARATION, null, interfaceC4461);
        c6989.f18711 = C6989.m12283(c6989, interfaceC4472.getType(), interfaceC64802);
        return c6989;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C6991 m12101(AbstractC6988 abstractC6988) {
        if (abstractC6988 == null) {
            m12098(26);
            throw null;
        }
        InterfaceC4485 interfaceC4485M12076 = AbstractC6869.m12076(abstractC6988);
        interfaceC4485M12076.getClass();
        AbstractC6988 abstractC6988M9087 = AbstractC4490.m9087(interfaceC4485M12076, C4692.f13709);
        if (abstractC6988M9087 == null) {
            return null;
        }
        Modality modality = Modality.FINAL;
        C4489 c4489 = AbstractC4488.f13112;
        C4690 c4690 = AbstractC6525.f17846;
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = CallableMemberDescriptor$Kind.SYNTHESIZED;
        C6991 c6991M12290 = C6991.m12290(abstractC6988, modality, c4489, false, c4690, callableMemberDescriptor$Kind, abstractC6988.mo9036());
        C6990 c6990 = new C6990(c6991M12290, C6481.f17772, modality, c4489, false, false, false, callableMemberDescriptor$Kind, null, abstractC6988.mo9036());
        c6991M12290.m12294(c6990, null, null, null);
        C4873.f14171.getClass();
        C4873 c4873 = C4873.f14172;
        InterfaceC4872 interfaceC4872Mo9011 = abstractC6988M9087.mo9011();
        List listSingletonList = Collections.singletonList(new C4884(abstractC6988.mo9035()));
        c4873.getClass();
        interfaceC4872Mo9011.getClass();
        listSingletonList.getClass();
        AbstractC4877 abstractC4877M9824 = AbstractC4892.m9824(listSingletonList, c4873, interfaceC4872Mo9011, false);
        List list = Collections.EMPTY_LIST;
        c6991M12290.m12293(abstractC4877M9824, list, null, null, list);
        c6990.m12287(c6991M12290.getReturnType());
        return c6991M12290;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C6989 m12102(InterfaceC4472 interfaceC4472, InterfaceC6480 interfaceC6480) {
        InterfaceC4461 interfaceC4461Mo9036 = interfaceC4472.mo9036();
        if (interfaceC4461Mo9036 != null) {
            return m12100(interfaceC4472, interfaceC6480, C6481.f17772, true, interfaceC4472.getVisibility(), interfaceC4461Mo9036);
        }
        m12098(6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static C7005 m12103(InterfaceC4480 interfaceC4480, AbstractC4881 abstractC4881, InterfaceC6480 interfaceC6480) {
        if (abstractC4881 == null) {
            return null;
        }
        return new C7005(interfaceC4480, new C7245(interfaceC4480, abstractC4881), interfaceC6480);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static C6990 m12104(InterfaceC4472 interfaceC4472, InterfaceC6480 interfaceC6480, boolean z, InterfaceC4461 interfaceC4461) {
        if (interfaceC6480 == null) {
            m12098(18);
            throw null;
        }
        if (interfaceC4461 != null) {
            return new C6990(interfaceC4472, interfaceC6480, interfaceC4472.mo9019(), interfaceC4472.getVisibility(), z, false, false, CallableMemberDescriptor$Kind.DECLARATION, null, interfaceC4461);
        }
        m12098(19);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C6980 m12105(AbstractC6988 abstractC6988) {
        if (abstractC6988 == null) {
            m12098(24);
            throw null;
        }
        C6980 c6980M12266 = C6980.m12266(abstractC6988, AbstractC6525.f17845, CallableMemberDescriptor$Kind.SYNTHESIZED, abstractC6988.mo9036());
        C6978 c6978 = new C6978(c6980M12266, null, 0, C6481.f17772, C4690.m9340("value"), AbstractC4772.m9509(abstractC6988).m11986(), false, false, false, null, abstractC6988.mo9036());
        List list = Collections.EMPTY_LIST;
        return c6980M12266.mo12270(null, null, list, list, Collections.singletonList(c6978), abstractC6988.mo9035(), Modality.FINAL, AbstractC4488.f13112);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C6980 m12106(AbstractC6988 abstractC6988) {
        if (abstractC6988 == null) {
            m12098(22);
            throw null;
        }
        C6980 c6980M12266 = C6980.m12266(abstractC6988, AbstractC6525.f17847, CallableMemberDescriptor$Kind.SYNTHESIZED, abstractC6988.mo9036());
        List list = Collections.EMPTY_LIST;
        return c6980M12266.mo12270(null, null, list, list, list, AbstractC4772.m9509(abstractC6988).m11991(abstractC6988.mo9035(), Variance.INVARIANT), Modality.FINAL, AbstractC4488.f13112);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public abstract void mo9547(InterfaceC4479 interfaceC4479, InterfaceC4479 interfaceC44792);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public abstract void mo9548(InterfaceC4479 interfaceC4479);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public void mo12107(InterfaceC4479 interfaceC4479, Collection collection) {
        interfaceC4479.getClass();
        interfaceC4479.mo9041(collection);
    }
}
