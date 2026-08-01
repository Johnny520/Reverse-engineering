package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p068.InterfaceC7387;
import p095.AbstractC7818;
import p098.C7863;
import p114.C8068;
import p114.C8069;
import p119.AbstractC8104;
import p119.C8102;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5749 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8068 f14592 = C8069.m13029(ErrorTypeKind.DONT_CARE, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C8068 f14591 = C8069.m13029(ErrorTypeKind.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5752 f14590 = new C5752("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5752 f14589 = new C5752("UNIT_EXPECTED_TYPE");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m10402(AbstractC5714 abstractC5714) {
        if (abstractC5714 == null) {
            m10407(60);
            throw null;
        }
        if ((abstractC5714.mo10281().mo9770() instanceof InterfaceC5295 ? (InterfaceC5295) abstractC5714.mo10281().mo9770() : null) != null) {
            return true;
        }
        abstractC5714.mo10281();
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m10403(AbstractC5714 abstractC5714) throws Exception {
        if (abstractC5714 == null) {
            m10407(27);
            throw null;
        }
        if (!abstractC5714.mo10284() && (!(abstractC5714.mo10331() instanceof AbstractC5728) || !m10403(((AbstractC5728) abstractC5714.mo10331()).f14562))) {
            if (!(abstractC5714.mo10331() instanceof C5738)) {
                if (m10402(abstractC5714)) {
                    if (!(abstractC5714.mo10281().mo9770() instanceof AbstractC7818)) {
                        C5751 c5751M10415 = C5751.m10415(abstractC5714);
                        Collection<AbstractC5714> collectionMo10053 = abstractC5714.mo10281().mo10053();
                        ArrayList arrayList = new ArrayList(collectionMo10053.size());
                        for (AbstractC5714 abstractC57142 : collectionMo10053) {
                            if (abstractC57142 == null) {
                                m10407(21);
                                throw null;
                            }
                            AbstractC5714 abstractC5714M10421 = c5751M10415.m10421(abstractC57142, Variance.INVARIANT);
                            AbstractC5714 abstractC5714M10408 = abstractC5714M10421 != null ? m10408(abstractC5714M10421, abstractC5714.mo10284()) : null;
                            if (abstractC5714M10408 != null) {
                                arrayList.add(abstractC5714M10408);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (m10403((AbstractC5714) it.next())) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
                InterfaceC5705 interfaceC5705Mo10281 = abstractC5714.mo10281();
                if (interfaceC5705Mo10281 instanceof C5715) {
                    Iterator it2 = ((C5715) interfaceC5705Mo10281).f14537.iterator();
                    while (it2.hasNext()) {
                        if (m10403((AbstractC5714) it2.next())) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static List m10404(List list) {
        if (list == null) {
            m10407(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5717(((InterfaceC5295) it.next()).mo9584()));
        }
        List listM9356 = AbstractC5176.m9356(arrayList);
        if (listM9356 != null) {
            return listM9356;
        }
        m10407(17);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m10405(AbstractC5714 abstractC5714, InterfaceC7387 interfaceC7387, C8102 c8102) {
        if (abstractC5714 == null) {
            return false;
        }
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        if (m10411(abstractC5714)) {
            return ((Boolean) interfaceC7387.invoke(abstractC5746Mo10331)).booleanValue();
        }
        if (c8102 != null && c8102.contains(abstractC5714)) {
            return false;
        }
        if (((Boolean) interfaceC7387.invoke(abstractC5746Mo10331)).booleanValue()) {
            return true;
        }
        if (c8102 == null) {
            int i = C8102.f19715;
            c8102 = AbstractC8104.m13048();
        }
        c8102.add(abstractC5714);
        AbstractC5728 abstractC5728 = abstractC5746Mo10331 instanceof AbstractC5728 ? (AbstractC5728) abstractC5746Mo10331 : null;
        if (abstractC5728 != null && (m10405(abstractC5728.f14561, interfaceC7387, c8102) || m10405(abstractC5728.f14562, interfaceC7387, c8102))) {
            return true;
        }
        if ((abstractC5746Mo10331 instanceof C5738) && m10405(((C5738) abstractC5746Mo10331).f14575, interfaceC7387, c8102)) {
            return true;
        }
        InterfaceC5705 interfaceC5705Mo10281 = abstractC5714.mo10281();
        if (interfaceC5705Mo10281 instanceof C5715) {
            Iterator it = ((C5715) interfaceC5705Mo10281).f14537.iterator();
            while (it.hasNext()) {
                if (m10405((AbstractC5714) it.next(), interfaceC7387, c8102)) {
                    return true;
                }
            }
            return false;
        }
        for (AbstractC5702 abstractC5702 : abstractC5714.mo10285()) {
            if (!abstractC5702.mo10299() && m10405(abstractC5702.mo10300(), interfaceC7387, c8102)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m10406(AbstractC5714 abstractC5714) {
        if (abstractC5714 == null) {
            m10407(28);
            throw null;
        }
        if (abstractC5714.mo10284()) {
            return true;
        }
        return (abstractC5714.mo10331() instanceof AbstractC5728) && m10406(((AbstractC5728) abstractC5714.mo10331()).f14562);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m10407(int i) {
        String str;
        int i2;
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case 38:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case 31:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case 37:
                objArr[0] = "b";
                break;
            case 39:
                objArr[0] = "typeParameters";
                break;
            case 41:
                objArr[0] = "typeParameterConstructors";
                break;
            case 42:
                objArr[0] = "specialType";
                break;
            case 43:
            case 44:
                objArr[0] = "isSpecialType";
                break;
            case 45:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case 51:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case 52:
            case 55:
                objArr[0] = "expectedType";
                break;
            case 54:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i == 11 || i == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i != 53) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case 31:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case 37:
                objArr[2] = "equalTypes";
                break;
            case 38:
            case 39:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case 41:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case 42:
            case 43:
            case 44:
                objArr[2] = "contains";
                break;
            case 45:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case 51:
            case 52:
            case 54:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 4 && i != 9 && i != 11 && i != 15 && i != 17 && i != 19 && i != 26 && i != 35 && i != 48 && i != 53 && i != 6 && i != 7) {
            switch (i) {
                case 56:
                case 57:
                case 58:
                case 59:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static AbstractC5714 m10408(AbstractC5714 abstractC5714, boolean z) {
        if (abstractC5714 != null) {
            return z ? m10409(abstractC5714, true) : abstractC5714;
        }
        m10407(8);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static AbstractC5746 m10409(AbstractC5714 abstractC5714, boolean z) {
        if (abstractC5714 == null) {
            m10407(3);
            throw null;
        }
        AbstractC5746 abstractC5746Mo10290 = abstractC5714.mo10331().mo10290(z);
        if (abstractC5746Mo10290 != null) {
            return abstractC5746Mo10290;
        }
        m10407(4);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static AbstractC5702 m10410(InterfaceC5295 interfaceC5295, C7863 c7863) {
        if (interfaceC5295 != null) {
            return c7863.f19224 == TypeUsage.SUPERTYPE ? new C5717(AbstractC5725.m10376(interfaceC5295)) : new C5717(interfaceC5295);
        }
        m10407(46);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m10411(AbstractC5714 abstractC5714) {
        if (abstractC5714 != null) {
            return abstractC5714 == f14590 || abstractC5714 == f14589;
        }
        m10407(0);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static AbstractC5710 m10412(AbstractC5710 abstractC5710, boolean z) {
        if (abstractC5710 == null) {
            m10407(5);
            throw null;
        }
        if (!z) {
            return abstractC5710;
        }
        AbstractC5710 abstractC5710Mo10290 = abstractC5710.mo10290(true);
        if (abstractC5710Mo10290 != null) {
            return abstractC5710Mo10290;
        }
        m10407(6);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static C5717 m10413(InterfaceC5295 interfaceC5295) {
        if (interfaceC5295 != null) {
            return new C5717(interfaceC5295);
        }
        m10407(45);
        throw null;
    }
}
