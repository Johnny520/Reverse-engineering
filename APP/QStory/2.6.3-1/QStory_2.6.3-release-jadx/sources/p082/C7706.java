package p082;

import androidx.compose.runtime.C2146;
import androidx.fragment.app.C3141;
import com.alibaba.fastjson2.C3775;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5295;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Contract;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5728;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.C5703;
import kotlin.reflect.jvm.internal.impl.types.C5704;
import kotlin.reflect.jvm.internal.impl.types.C5723;
import kotlin.reflect.jvm.internal.impl.types.checker.AbstractC5692;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5683;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC5684;
import net.bytebuddy.description.method.MethodDescription;
import p068.InterfaceC7387;
import p095.AbstractC7806;
import p095.AbstractC7818;
import p095.AbstractC7823;
import p095.AbstractC7831;
import p095.C7819;
import p095.C7821;
import p095.C7835;
import p119.AbstractC8104;
import p119.C8102;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7706 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7701 f18664;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7706 f18665;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final List f18666 = AbstractC5176.m9356(ServiceLoader.load(InterfaceC7709.class, InterfaceC7709.class.getClassLoader()));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5684 f18667;

    static {
        C7701 c7701 = new C7701();
        f18664 = c7701;
        f18665 = new C7706(c7701);
    }

    public C7706(InterfaceC5684 interfaceC5684) {
        if (interfaceC5684 != null) {
            this.f18667 = interfaceC5684;
        } else {
            m12699(5);
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0192, code lost:
    
        if (r2 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0194, code lost:
    
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321.f13469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0197, code lost:
    
        r0 = kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321.f13470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0199, code lost:
    
        r12 = ((kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312) m12700(r11, new p082.C7713(0))).mo9588(r12, r1, r0, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind.FAKE_OVERRIDE);
        r13.mo12694(r12, r11);
        r13.mo10097(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b0, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m12695(Collection collection, AbstractC7818 abstractC7818, AbstractC7705 abstractC7705) {
        Modality modalityMo9568;
        if (collection == null) {
            m12699(83);
            throw null;
        }
        if (abstractC7818 == null) {
            m12699(84);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            InterfaceC5312 interfaceC5312 = (InterfaceC5312) obj;
            if (!AbstractC5321.m9626(interfaceC5312.getVisibility()) && AbstractC5321.m9625(interfaceC5312, abstractC7818)) {
                arrayList.add(obj);
            }
        }
        boolean zIsEmpty = arrayList.isEmpty();
        if (!zIsEmpty) {
            collection = arrayList;
        }
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (it.hasNext()) {
                InterfaceC5312 interfaceC53122 = (InterfaceC5312) it.next();
                int i = AbstractC7710.f18669[interfaceC53122.mo9568().ordinal()];
                if (i == 1) {
                    modalityMo9568 = Modality.FINAL;
                    if (modalityMo9568 == null) {
                        m12699(88);
                        throw null;
                    }
                } else if (i == 2) {
                    C8376.m13333(interfaceC53122, "Member cannot have SEALED modality: ");
                    return;
                } else if (i == 3) {
                    z = true;
                } else if (i == 4) {
                    z2 = true;
                }
            } else {
                boolean z3 = (!abstractC7818.mo9567() || abstractC7818.mo9568() == Modality.ABSTRACT || abstractC7818.mo9568() == Modality.SEALED) ? false : true;
                if (z && !z2) {
                    modalityMo9568 = Modality.OPEN;
                    if (modalityMo9568 == null) {
                        m12699(89);
                        throw null;
                    }
                } else if (z || !z2) {
                    HashSet<InterfaceC5312> hashSet = new HashSet();
                    for (InterfaceC5312 interfaceC53123 : collection) {
                        if (interfaceC53123 == null) {
                            m12699(15);
                            throw null;
                        }
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        m12697(interfaceC53123, linkedHashSet);
                        hashSet.addAll(linkedHashSet);
                    }
                    if (!hashSet.isEmpty()) {
                        InterfaceC5331 interfaceC5331 = (InterfaceC5331) hashSet.iterator().next();
                        int i2 = AbstractC5605.f14254;
                        interfaceC5331.getClass();
                        InterfaceC5318 interfaceC5318M12663 = AbstractC7699.m12663(interfaceC5331);
                        interfaceC5318M12663.getClass();
                        if (interfaceC5318M12663.mo9624(AbstractC5692.f14488) != null) {
                            C3775.m6954();
                            return;
                        }
                    }
                    if (hashSet.size() > 1) {
                        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                        for (Object obj2 : hashSet) {
                            Iterator it2 = linkedHashSet2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    linkedHashSet2.add(obj2);
                                    break;
                                }
                                Pair pair = new Pair((InterfaceC5313) obj2, (InterfaceC5313) it2.next());
                                InterfaceC5313 interfaceC5313 = (InterfaceC5313) pair.component1();
                                InterfaceC5313 interfaceC53132 = (InterfaceC5313) pair.component2();
                                if (!m12701(interfaceC5313, interfaceC53132)) {
                                    if (m12701(interfaceC53132, interfaceC5313)) {
                                        break;
                                    }
                                } else {
                                    it2.remove();
                                }
                            }
                        }
                        hashSet = linkedHashSet2;
                    }
                    Modality modalityMo95682 = abstractC7818.mo9568();
                    if (modalityMo95682 == null) {
                        m12699(92);
                        throw null;
                    }
                    Modality modality = Modality.ABSTRACT;
                    for (InterfaceC5312 interfaceC53124 : hashSet) {
                        Modality modalityMo95683 = (z3 && interfaceC53124.mo9568() == Modality.ABSTRACT) ? modalityMo95682 : interfaceC53124.mo9568();
                        if (modalityMo95683.compareTo(modality) < 0) {
                            modality = modalityMo95683;
                        }
                    }
                    if (modality == null) {
                        m12699(93);
                        throw null;
                    }
                    modalityMo9568 = modality;
                } else {
                    modalityMo9568 = z3 ? abstractC7818.mo9568() : Modality.ABSTRACT;
                    if (modalityMo9568 == null) {
                        m12699(90);
                        throw null;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static ArrayList m12696(InterfaceC5313 interfaceC5313) {
        C7835 c7835Mo9591 = interfaceC5313.mo9591();
        ArrayList arrayList = new ArrayList();
        if (c7835Mo9591 != null) {
            arrayList.add(c7835Mo9591.getType());
        }
        Iterator it = interfaceC5313.mo9594().iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC7806) ((InterfaceC5288) it.next())).getType());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m12697(InterfaceC5312 interfaceC5312, LinkedHashSet linkedHashSet) {
        if (interfaceC5312 == null) {
            m12699(17);
            throw null;
        }
        if (interfaceC5312.getKind().isReal()) {
            linkedHashSet.add(interfaceC5312);
        } else {
            if (interfaceC5312.mo9589().isEmpty()) {
                C8376.m13333(interfaceC5312, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator it = interfaceC5312.mo9589().iterator();
            while (it.hasNext()) {
                m12697((InterfaceC5312) it.next(), linkedHashSet);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m12698(AbstractC5714 abstractC5714, AbstractC5714 abstractC57142, C5704 c5704) {
        if (abstractC5714 == null) {
            m12699(44);
            throw null;
        }
        if (abstractC57142 == null) {
            m12699(45);
            throw null;
        }
        if (AbstractC5725.m10388(abstractC5714) && AbstractC5725.m10388(abstractC57142)) {
            return true;
        }
        return C5723.m10349(c5704, abstractC5714.mo10331(), abstractC57142.mo10331());
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m12699(int i) {
        String str;
        int i2;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case 38:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case 39:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case 41:
                objArr[0] = "secondParameters";
                break;
            case 44:
                objArr[0] = "typeInSuper";
                break;
            case 45:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case 75:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case 51:
                objArr[0] = "membersFromSupertypes";
                break;
            case 52:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case 59:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case 54:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case 58:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case 67:
            case 71:
                objArr[0] = "a";
                break;
            case 66:
            case 68:
            case 73:
                objArr[0] = "b";
                break;
            case 69:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case 74:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case 77:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i == 11 || i == 12) {
            objArr[1] = "filterOverrides";
        } else if (i == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 42:
            case 43:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 38:
            case 39:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case 41:
                objArr[2] = "createTypeCheckerState";
                break;
            case 44:
            case 45:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case 58:
            case 59:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case 67:
            case 68:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case 77:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                        default:
                            switch (i) {
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    break;
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Object m12700(Collection collection, InterfaceC7387 interfaceC7387) {
        Object next;
        if (collection.size() == 1) {
            Object objM9378 = AbstractC5176.m9378(collection);
            if (objM9378 != null) {
                return objM9378;
            }
            m12699(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(interfaceC7387.invoke(it.next()));
        }
        Object objM93782 = AbstractC5176.m9378(collection);
        InterfaceC5313 interfaceC5313 = (InterfaceC5313) interfaceC7387.invoke(objM93782);
        for (Object obj : collection) {
            InterfaceC5313 interfaceC53132 = (InterfaceC5313) interfaceC7387.invoke(obj);
            if (interfaceC53132 == null) {
                m12699(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(obj);
                    break;
                }
                if (!m12706(interfaceC53132, (InterfaceC5313) it2.next())) {
                    break;
                }
            }
            if (m12706(interfaceC53132, interfaceC5313) && !m12706(interfaceC5313, interfaceC53132)) {
                objM93782 = obj;
            }
        }
        if (arrayList.isEmpty()) {
            if (objM93782 != null) {
                return objM93782;
            }
            m12699(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            Object objM93783 = AbstractC5176.m9378(arrayList);
            if (objM93783 != null) {
                return objM93783;
            }
            m12699(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next = null;
                break;
            }
            next = it3.next();
            AbstractC5714 returnType = ((InterfaceC5313) interfaceC7387.invoke(next)).getReturnType();
            returnType.getClass();
            if (!(returnType.mo10331() instanceof AbstractC5728)) {
                break;
            }
        }
        if (next != null) {
            return next;
        }
        Object objM93784 = AbstractC5176.m9378(arrayList);
        if (objM93784 != null) {
            return objM93784;
        }
        m12699(82);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m12701(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132) {
        if (interfaceC5313 == null) {
            m12699(13);
            throw null;
        }
        if (interfaceC53132 == null) {
            m12699(14);
            throw null;
        }
        boolean zEquals = interfaceC5313.equals(interfaceC53132);
        C7701 c7701 = C7701.f18658;
        if (!zEquals && c7701.m12681(interfaceC5313.mo9561(), interfaceC53132.mo9561(), false)) {
            return true;
        }
        InterfaceC5313 interfaceC5313Mo9561 = interfaceC53132.mo9561();
        int i = AbstractC7699.f18657;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC7699.m12664(interfaceC5313.mo9561(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (c7701.m12681(interfaceC5313Mo9561, (InterfaceC5313) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m12702(InterfaceC5312 interfaceC5312, InterfaceC7387 interfaceC7387) {
        C5322 c5322;
        C5322 c5322M9631;
        C5322 c53222;
        if (interfaceC5312 == null) {
            m12699(105);
            throw null;
        }
        for (InterfaceC5312 interfaceC53122 : interfaceC5312.mo9589()) {
            if (interfaceC53122.getVisibility() == AbstractC5321.f13470) {
                m12702(interfaceC53122, interfaceC7387);
            }
        }
        if (interfaceC5312.getVisibility() != AbstractC5321.f13470) {
            return;
        }
        Collection<InterfaceC5312> collectionMo9589 = interfaceC5312.mo9589();
        if (collectionMo9589 == null) {
            m12699(107);
            throw null;
        }
        if (collectionMo9589.isEmpty()) {
            c5322M9631 = AbstractC5321.f13474;
        } else {
            Iterator it = collectionMo9589.iterator();
            loop3: while (true) {
                c5322 = null;
                while (it.hasNext()) {
                    C5322 visibility = ((InterfaceC5312) it.next()).getVisibility();
                    if (c5322 != null) {
                        Integer numM9629 = AbstractC5321.m9629(visibility, c5322);
                        if (numM9629 == null) {
                            break;
                        } else if (numM9629.intValue() > 0) {
                        }
                    }
                    c5322 = visibility;
                }
            }
            if (c5322 == null) {
                c5322M9631 = null;
                break;
            }
            Iterator it2 = collectionMo9589.iterator();
            while (it2.hasNext()) {
                Integer numM96292 = AbstractC5321.m9629(c5322, ((InterfaceC5312) it2.next()).getVisibility());
                if (numM96292 == null || numM96292.intValue() < 0) {
                    c5322M9631 = null;
                    break;
                }
            }
            c5322M9631 = c5322;
        }
        if (c5322M9631 == null) {
            c5322M9631 = null;
            break;
        }
        if (interfaceC5312.getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
            for (InterfaceC5312 interfaceC53123 : collectionMo9589) {
                if (interfaceC53123.mo9568() != Modality.ABSTRACT && !interfaceC53123.getVisibility().equals(c5322M9631)) {
                    c5322M9631 = null;
                    break;
                }
            }
        } else {
            c5322M9631 = AbstractC5321.m9631(c5322M9631.f13476.mo9657());
        }
        if (c5322M9631 == null) {
            if (interfaceC7387 != null) {
                interfaceC7387.invoke(interfaceC5312);
            }
            c53222 = AbstractC5321.f13461;
        } else {
            c53222 = c5322M9631;
        }
        if (interfaceC5312 instanceof C7821) {
            C7821 c7821 = (C7821) interfaceC5312;
            if (c53222 == null) {
                C7821.m12877(20);
                throw null;
            }
            c7821.f19064 = c53222;
            Iterator it3 = ((InterfaceC5305) interfaceC5312).mo9582().iterator();
            while (it3.hasNext()) {
                m12702((AbstractC7823) it3.next(), c5322M9631 == null ? null : interfaceC7387);
            }
            return;
        }
        if (interfaceC5312 instanceof AbstractC7831) {
            AbstractC7831 abstractC7831 = (AbstractC7831) interfaceC5312;
            if (c53222 != null) {
                abstractC7831.f19117 = c53222;
                return;
            } else {
                AbstractC7831.m12891(10);
                throw null;
            }
        }
        AbstractC7823 abstractC7823 = (AbstractC7823) interfaceC5312;
        abstractC7823.f19087 = c53222;
        if (c53222 != abstractC7823.m12885().getVisibility()) {
            abstractC7823.f19089 = false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m12703(InterfaceC5313 interfaceC5313, AbstractC5714 abstractC5714, InterfaceC5313 interfaceC53132, AbstractC5714 abstractC57142, C5704 c5704) {
        if (interfaceC5313 == null) {
            m12699(71);
            throw null;
        }
        if (abstractC5714 == null) {
            m12699(72);
            throw null;
        }
        if (interfaceC53132 == null) {
            m12699(73);
            throw null;
        }
        if (abstractC57142 == null) {
            m12699(74);
            throw null;
        }
        AbstractC5746 abstractC5746Mo10331 = abstractC5714.mo10331();
        AbstractC5746 abstractC5746Mo103312 = abstractC57142.mo10331();
        if (abstractC5746Mo10331 == abstractC5746Mo103312) {
            return true;
        }
        if (!c5704.m10323(abstractC5746Mo10331, abstractC5746Mo103312)) {
            return false;
        }
        return C5723.f14556.m10352(c5704, c5704.f14515, abstractC5746Mo10331, abstractC5746Mo103312);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m12704(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132) {
        if (interfaceC5313 == null) {
            m12699(67);
            throw null;
        }
        if (interfaceC53132 != null) {
            Integer numM9629 = AbstractC5321.m9629(interfaceC5313.getVisibility(), interfaceC53132.getVisibility());
            return numM9629 == null || numM9629.intValue() >= 0;
        }
        m12699(68);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static ArrayList m12705(Object obj, LinkedList linkedList, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872) {
        if (obj == null) {
            m12699(97);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC5313 interfaceC5313 = (InterfaceC5313) interfaceC7387.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC5313 interfaceC53132 = (InterfaceC5313) interfaceC7387.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12708 = m12708(interfaceC5313, interfaceC53132);
                if (overridingUtil$OverrideCompatibilityInfo$ResultM12708 == OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (overridingUtil$OverrideCompatibilityInfo$ResultM12708 == OverridingUtil$OverrideCompatibilityInfo$Result.CONFLICT) {
                    interfaceC73872.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m12706(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132) {
        if (interfaceC5313 == null) {
            m12699(65);
            throw null;
        }
        if (interfaceC53132 == null) {
            m12699(66);
            throw null;
        }
        AbstractC5714 returnType = interfaceC5313.getReturnType();
        AbstractC5714 returnType2 = interfaceC53132.getReturnType();
        if (m12704(interfaceC5313, interfaceC53132)) {
            C5704 c5704M12709 = f18665.m12709(interfaceC5313.getTypeParameters(), interfaceC53132.getTypeParameters());
            if (interfaceC5313 instanceof InterfaceC5316) {
                return m12703(interfaceC5313, returnType, interfaceC53132, returnType2, c5704M12709);
            }
            if (!(interfaceC5313 instanceof InterfaceC5305)) {
                C8376.m13323(interfaceC5313.getClass(), "Unexpected callable: ");
                return false;
            }
            InterfaceC5305 interfaceC5305 = (InterfaceC5305) interfaceC5313;
            InterfaceC5305 interfaceC53052 = (InterfaceC5305) interfaceC53132;
            C7819 setter = interfaceC5305.getSetter();
            C7819 setter2 = interfaceC53052.getSetter();
            if ((setter == null || setter2 == null) ? true : m12704(setter, setter2)) {
                if (interfaceC5305.mo9554() && interfaceC53052.mo9554()) {
                    return C5723.m10349(c5704M12709, returnType.mo10331(), returnType2.mo10331());
                }
                if ((interfaceC5305.mo9554() || !interfaceC53052.mo9554()) && m12703(interfaceC5313, returnType, interfaceC53132, returnType2, c5704M12709)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C7711 m12707(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132) {
        boolean z;
        if (interfaceC5313 == null) {
            m12699(38);
            throw null;
        }
        if (interfaceC53132 == null) {
            m12699(39);
            throw null;
        }
        boolean z2 = interfaceC5313 instanceof InterfaceC5316;
        if ((z2 && !(interfaceC53132 instanceof InterfaceC5316)) || (((z = interfaceC5313 instanceof InterfaceC5305)) && !(interfaceC53132 instanceof InterfaceC5305))) {
            return C7711.m12716("Member kind mismatch");
        }
        if (!z2 && !z) {
            C5043.m9163(interfaceC5313, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!interfaceC5313.getName().equals(interfaceC53132.getName())) {
            return C7711.m12716("Name mismatch");
        }
        C7711 c7711M12716 = (interfaceC5313.mo9591() == null) != (interfaceC53132.mo9591() == null) ? C7711.m12716("Receiver presence mismatch") : interfaceC5313.mo9594().size() != interfaceC53132.mo9594().size() ? C7711.m12716("Value parameter number mismatch") : null;
        if (c7711M12716 != null) {
            return c7711M12716;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static OverridingUtil$OverrideCompatibilityInfo$Result m12708(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132) {
        C7706 c7706 = f18665;
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12718 = c7706.m12713(interfaceC53132, interfaceC5313, null).m12718();
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM127182 = c7706.m12711(interfaceC5313, interfaceC53132, null, false).m12718();
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result = OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE;
        if (overridingUtil$OverrideCompatibilityInfo$ResultM12718 == overridingUtil$OverrideCompatibilityInfo$Result && overridingUtil$OverrideCompatibilityInfo$ResultM127182 == overridingUtil$OverrideCompatibilityInfo$Result) {
            return overridingUtil$OverrideCompatibilityInfo$Result;
        }
        OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$Result2 = OverridingUtil$OverrideCompatibilityInfo$Result.CONFLICT;
        return (overridingUtil$OverrideCompatibilityInfo$ResultM12718 == overridingUtil$OverrideCompatibilityInfo$Result2 || overridingUtil$OverrideCompatibilityInfo$ResultM127182 == overridingUtil$OverrideCompatibilityInfo$Result2) ? overridingUtil$OverrideCompatibilityInfo$Result2 : OverridingUtil$OverrideCompatibilityInfo$Result.INCOMPATIBLE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C5704 m12709(List list, List list2) {
        if (list == null) {
            m12699(40);
            throw null;
        }
        if (list2 == null) {
            m12699(41);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        InterfaceC5684 interfaceC5684 = this.f18667;
        if (zIsEmpty) {
            return new C5703((HashMap) null, interfaceC5684).m10309();
        }
        HashMap map = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            map.put(((InterfaceC5295) list.get(i)).mo9560(), ((InterfaceC5295) list2.get(i)).mo9560());
        }
        return new C5703(map, interfaceC5684).m10309();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        r10.remove();
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C7711 m12710(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132, boolean z) {
        if (interfaceC5313 == null) {
            m12699(28);
            throw null;
        }
        if (interfaceC53132 == null) {
            m12699(29);
            throw null;
        }
        C7711 c7711M12707 = m12707(interfaceC5313, interfaceC53132);
        if (c7711M12707 != null) {
            return c7711M12707;
        }
        ArrayList arrayListM12696 = m12696(interfaceC5313);
        ArrayList arrayListM126962 = m12696(interfaceC53132);
        List typeParameters = interfaceC5313.getTypeParameters();
        List typeParameters2 = interfaceC53132.getTypeParameters();
        if (typeParameters.size() != typeParameters2.size()) {
            for (int i = 0; i < arrayListM12696.size(); i++) {
                if (!InterfaceC5683.f14478.m10158((AbstractC5714) arrayListM12696.get(i), (AbstractC5714) arrayListM126962.get(i))) {
                    return C7711.m12716("Type parameter number mismatch");
                }
            }
            return new C7711(OverridingUtil$OverrideCompatibilityInfo$Result.CONFLICT, "Type parameter number mismatch");
        }
        C5704 c5704M12709 = m12709(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            InterfaceC5295 interfaceC5295 = (InterfaceC5295) typeParameters.get(i2);
            InterfaceC5295 interfaceC52952 = (InterfaceC5295) typeParameters2.get(i2);
            if (interfaceC5295 == null) {
                m12699(47);
                throw null;
            }
            if (interfaceC52952 == null) {
                m12699(48);
                throw null;
            }
            List<AbstractC5714> upperBounds = interfaceC5295.getUpperBounds();
            ArrayList arrayList = new ArrayList(interfaceC52952.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (AbstractC5714 abstractC5714 : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (m12698(abstractC5714, (AbstractC5714) listIterator.next(), c5704M12709)) {
                            break;
                        }
                    }
                }
            }
            return C7711.m12716("Type parameter bounds mismatch");
        }
        for (int i3 = 0; i3 < arrayListM12696.size(); i3++) {
            if (!m12698((AbstractC5714) arrayListM12696.get(i3), (AbstractC5714) arrayListM126962.get(i3), c5704M12709)) {
                return C7711.m12716("Value parameter type mismatch");
            }
        }
        if ((interfaceC5313 instanceof InterfaceC5316) && (interfaceC53132 instanceof InterfaceC5316) && ((InterfaceC5316) interfaceC5313).isSuspend() != ((InterfaceC5316) interfaceC53132).isSuspend()) {
            return new C7711(OverridingUtil$OverrideCompatibilityInfo$Result.CONFLICT, "Incompatible suspendability");
        }
        if (z) {
            AbstractC5714 returnType = interfaceC5313.getReturnType();
            AbstractC5714 returnType2 = interfaceC53132.getReturnType();
            if (returnType != null && returnType2 != null && (!AbstractC5725.m10388(returnType2) || !AbstractC5725.m10388(returnType))) {
                AbstractC5746 abstractC5746Mo10331 = returnType2.mo10331();
                AbstractC5746 abstractC5746Mo103312 = returnType.mo10331();
                if (!(abstractC5746Mo10331 == abstractC5746Mo103312 ? true : C5723.f14556.m10352(c5704M12709, c5704M12709.f14515, abstractC5746Mo10331, abstractC5746Mo103312))) {
                    return new C7711(OverridingUtil$OverrideCompatibilityInfo$Result.CONFLICT, "Return type mismatch");
                }
            }
        }
        C7711 c7711 = C7711.f18672;
        if (c7711 != null) {
            return c7711;
        }
        C7711.m12717(0);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C7711 m12711(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132, AbstractC7818 abstractC7818, boolean z) {
        if (interfaceC5313 == null) {
            m12699(22);
            throw null;
        }
        if (interfaceC53132 == null) {
            m12699(23);
            throw null;
        }
        C7711 c7711M12710 = m12710(interfaceC5313, interfaceC53132, z);
        boolean z2 = c7711M12710.m12718() == OverridingUtil$OverrideCompatibilityInfo$Result.OVERRIDABLE;
        List<InterfaceC7709> list = f18666;
        for (InterfaceC7709 interfaceC7709 : list) {
            if (interfaceC7709.mo9794() != ExternalOverridabilityCondition$Contract.CONFLICTS_ONLY && (!z2 || interfaceC7709.mo9794() != ExternalOverridabilityCondition$Contract.SUCCESS_ONLY)) {
                int i = AbstractC7710.f18671[interfaceC7709.mo9793(interfaceC5313, interfaceC53132, abstractC7818).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    return C7711.m12716("External condition");
                }
            }
        }
        if (!z2) {
            return c7711M12710;
        }
        for (InterfaceC7709 interfaceC77092 : list) {
            if (interfaceC77092.mo9794() == ExternalOverridabilityCondition$Contract.CONFLICTS_ONLY) {
                int i2 = AbstractC7710.f18671[interfaceC77092.mo9793(interfaceC5313, interfaceC53132, abstractC7818).ordinal()];
                if (i2 == 1) {
                    C3141.m4914(interfaceC77092.getClass().getName(), "Contract violation in ", " condition. It's not supposed to end with success");
                    return null;
                }
                if (i2 == 2) {
                    return C7711.m12716("External condition");
                }
            }
        }
        C7711 c7711 = C7711.f18672;
        if (c7711 != null) {
            return c7711;
        }
        C7711.m12717(0);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m12712(C5523 c5523, Collection collection, Collection collection2, AbstractC7818 abstractC7818, AbstractC7705 abstractC7705) {
        Integer numM9629;
        if (c5523 == null) {
            m12699(50);
            throw null;
        }
        if (collection == null) {
            m12699(51);
            throw null;
        }
        if (collection2 == null) {
            m12699(52);
            throw null;
        }
        if (abstractC7818 == null) {
            m12699(53);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            InterfaceC5312 interfaceC5312 = (InterfaceC5312) it.next();
            if (interfaceC5312 == null) {
                m12699(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            int i = C8102.f19715;
            C8102 c8102M13048 = AbstractC8104.m13048();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                InterfaceC5312 interfaceC53122 = (InterfaceC5312) it2.next();
                OverridingUtil$OverrideCompatibilityInfo$Result overridingUtil$OverrideCompatibilityInfo$ResultM12718 = m12713(interfaceC53122, interfaceC5312, abstractC7818).m12718();
                boolean z = !AbstractC5321.m9626(interfaceC53122.getVisibility()) && AbstractC5321.m9625(interfaceC53122, interfaceC5312);
                int i2 = AbstractC7710.f18670[overridingUtil$OverrideCompatibilityInfo$ResultM12718.ordinal()];
                if (i2 == 1) {
                    if (z) {
                        c8102M13048.add(interfaceC53122);
                    }
                    arrayList.add(interfaceC53122);
                } else if (i2 == 2) {
                    if (z) {
                        abstractC7705.mo10096(interfaceC53122, interfaceC5312);
                    }
                    arrayList.add(interfaceC53122);
                }
            }
            abstractC7705.mo12694(interfaceC5312, c8102M13048);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            InterfaceC5331 interfaceC5331Mo9587 = ((InterfaceC5312) linkedHashSet.iterator().next()).mo9587();
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (((InterfaceC5312) it3.next()).mo9587() != interfaceC5331Mo9587) {
                        LinkedList<InterfaceC5312> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            InterfaceC5312 interfaceC53123 = null;
                            for (InterfaceC5312 interfaceC53124 : linkedList) {
                                if (interfaceC53123 == null || ((numM9629 = AbstractC5321.m9629(interfaceC53123.getVisibility(), interfaceC53124.getVisibility())) != null && numM9629.intValue() < 0)) {
                                    interfaceC53123 = interfaceC53124;
                                }
                            }
                            interfaceC53123.getClass();
                            m12695(m12705(interfaceC53123, linkedList, new C7713(1), new C2146(abstractC7705, 7, interfaceC53123)), abstractC7818, abstractC7705);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            m12695(Collections.singleton((InterfaceC5312) it4.next()), abstractC7818, abstractC7705);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7711 m12713(InterfaceC5313 interfaceC5313, InterfaceC5313 interfaceC53132, AbstractC7818 abstractC7818) {
        if (interfaceC5313 == null) {
            m12699(19);
            throw null;
        }
        if (interfaceC53132 != null) {
            return m12711(interfaceC5313, interfaceC53132, abstractC7818, false);
        }
        m12699(20);
        throw null;
    }
}
