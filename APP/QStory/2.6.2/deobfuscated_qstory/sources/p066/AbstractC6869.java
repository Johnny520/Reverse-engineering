package p066;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488;
import kotlin.reflect.jvm.internal.impl.descriptors.C4460;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4465;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4497;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4691;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4872;
import p079.AbstractC6985;
import p079.AbstractC6988;
import p079.C6989;
import p079.C7003;
import p098.C7239;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6869 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f18317 = 0;

    static {
        new C4686("kotlin.jvm.JvmName");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C4685 m12073(InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 != null) {
            C4686 c4686M12086 = m12086(interfaceC4498);
            return c4686M12086 != null ? c4686M12086.f13692 : m12073(interfaceC4498.mo9038()).m9326(interfaceC4498.getName());
        }
        m12078(2);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C4460 m12074(InterfaceC4498 interfaceC4498) {
        C4460 c4460 = C4460.f13084;
        if (interfaceC4498 == null) {
            m12078(81);
            throw null;
        }
        if (interfaceC4498 instanceof C6989) {
            interfaceC4498 = ((C6989) interfaceC4498).m12299();
        }
        if (interfaceC4498 instanceof InterfaceC4499) {
            ((InterfaceC4499) interfaceC4498).mo9036().getClass();
        }
        return c4460;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static InterfaceC4485 m12075(InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 == null) {
            m12078(23);
            throw null;
        }
        while (interfaceC4498 != null) {
            if (interfaceC4498 instanceof InterfaceC4485) {
                return (InterfaceC4485) interfaceC4498;
            }
            if (interfaceC4498 instanceof C7003) {
                return ((C7003) interfaceC4498).f18820;
            }
            interfaceC4498 = interfaceC4498.mo9038();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC4485 m12076(InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 == null) {
            m12078(21);
            throw null;
        }
        InterfaceC4485 interfaceC4485M12075 = m12075(interfaceC4498);
        if (interfaceC4485M12075 != null) {
            return interfaceC4485M12075;
        }
        m12078(22);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12077(InterfaceC4480 interfaceC4480, LinkedHashSet linkedHashSet) {
        if (interfaceC4480 == null) {
            m12078(72);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC4480)) {
            return;
        }
        Iterator it = interfaceC4480.mo9012().mo9040().iterator();
        while (it.hasNext()) {
            InterfaceC4480 interfaceC4480Mo9012 = ((InterfaceC4480) it.next()).mo9012();
            m12077(interfaceC4480Mo9012, linkedHashSet);
            linkedHashSet.add(interfaceC4480Mo9012);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12078(int i) {
        String str;
        int i2;
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
            case 13:
            case 14:
            case 15:
            case 21:
            case 23:
            case 24:
            case 34:
            case 35:
            case 36:
            case 57:
            case 58:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case 17:
                objArr[0] = "second";
                break;
            case 18:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case 25:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case 54:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case 46:
                objArr[0] = "typeConstructor";
                break;
            case 55:
                objArr[0] = "innerClassName";
                break;
            case 56:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case 79:
            case 80:
                objArr[0] = "annotated";
                break;
            case 84:
            case 86:
            case 89:
            case 91:
                objArr[0] = "scope";
                break;
            case 87:
            case 90:
            case 92:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case 12:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case 22:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case 64:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case 83:
                objArr[1] = "getContainingSourceFile";
                break;
            case 85:
                objArr[1] = "getAllDescriptors";
                break;
            case 88:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case 95:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case 11:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case 13:
                objArr[2] = "isExtension";
                break;
            case 14:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case 17:
                objArr[2] = "areInSameModule";
                break;
            case 18:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case 23:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case 21:
                objArr[2] = "getContainingModule";
                break;
            case 24:
                objArr[2] = "getContainingClass";
                break;
            case 25:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case 46:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case 54:
            case 55:
            case 56:
                objArr[2] = "getInnerClassByName";
                break;
            case 57:
                objArr[2] = "isStaticNestedClass";
                break;
            case 58:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case 79:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case 84:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case 87:
                objArr[2] = "getFunctionByName";
                break;
            case 89:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case 92:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 4:
            case 7:
            case 9:
            case 10:
            case 12:
            case 22:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 59:
            case 61:
            case 62:
            case 64:
            case 71:
            case 75:
            case 82:
            case 83:
            case 85:
            case 88:
            case 93:
            case 95:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m12079(AbstractC4881 abstractC4881, InterfaceC4498 interfaceC4498) {
        if (abstractC4881 == null) {
            m12078(30);
            throw null;
        }
        if (interfaceC4498 == null) {
            m12078(31);
            throw null;
        }
        InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
        if (interfaceC4476Mo9221 == null) {
            return false;
        }
        InterfaceC4498 interfaceC4498Mo9012 = interfaceC4476Mo9221.mo9012();
        return (interfaceC4498Mo9012 instanceof InterfaceC4476) && (interfaceC4498 instanceof InterfaceC4476) && ((InterfaceC4476) interfaceC4498).mo9011().equals(((InterfaceC4476) interfaceC4498Mo9012).mo9011());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m12080(InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 == null) {
            m12078(1);
            throw null;
        }
        while (interfaceC4498 != null) {
            if (m12090(interfaceC4498) || ((interfaceC4498 instanceof InterfaceC4497) && ((InterfaceC4497) interfaceC4498).getVisibility() == AbstractC4488.f13111)) {
                return true;
            }
            interfaceC4498 = interfaceC4498.mo9038();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m12081(InterfaceC4498 interfaceC4498) {
        return interfaceC4498 != null && (interfaceC4498.mo9038() instanceof InterfaceC4465);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static InterfaceC4479 m12082(InterfaceC4479 interfaceC4479) {
        if (interfaceC4479 == null) {
            m12078(58);
            throw null;
        }
        while (interfaceC4479.getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
            Collection collectionMo9040 = interfaceC4479.mo9040();
            if (collectionMo9040.isEmpty()) {
                C7546.m12745(interfaceC4479, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            interfaceC4479 = (InterfaceC4479) collectionMo9040.iterator().next();
        }
        return interfaceC4479;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m12083(InterfaceC4498 interfaceC4498) {
        return (m12088(interfaceC4498, ClassKind.CLASS) || m12088(interfaceC4498, ClassKind.INTERFACE)) && ((AbstractC6988) interfaceC4498).mo9019() == Modality.SEALED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m12084(AbstractC4881 abstractC4881, InterfaceC4498 interfaceC4498) {
        if (abstractC4881 == null) {
            m12078(32);
            throw null;
        }
        if (interfaceC4498 == null) {
            m12078(33);
            throw null;
        }
        if (m12079(abstractC4881, interfaceC4498)) {
            return true;
        }
        Iterator it = abstractC4881.mo9732().mo9504().iterator();
        while (it.hasNext()) {
            if (m12084((AbstractC4881) it.next(), interfaceC4498)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC4498 m12085(InterfaceC4498 interfaceC4498, Class cls, boolean z) {
        if (interfaceC4498 == null) {
            return null;
        }
        if (z) {
            interfaceC4498 = interfaceC4498.mo9038();
        }
        while (interfaceC4498 != null) {
            if (cls.isInstance(interfaceC4498)) {
                return interfaceC4498;
            }
            interfaceC4498 = interfaceC4498.mo9038();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C4686 m12086(InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 == null) {
            m12078(5);
            throw null;
        }
        if ((interfaceC4498 instanceof InterfaceC4485) || C7239.m12440(interfaceC4498)) {
            return C4686.f13690;
        }
        if (interfaceC4498 instanceof C7003) {
            return ((C7003) interfaceC4498).f18817;
        }
        if (interfaceC4498 instanceof InterfaceC4465) {
            return ((AbstractC6985) ((InterfaceC4465) interfaceC4498)).f18692;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m12087(InterfaceC4498 interfaceC4498) {
        return m12088(interfaceC4498, ClassKind.OBJECT) && ((AbstractC6988) interfaceC4498).mo9023();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m12088(InterfaceC4498 interfaceC4498, ClassKind classKind) {
        if (classKind != null) {
            return (interfaceC4498 instanceof AbstractC6988) && ((AbstractC6988) interfaceC4498).mo9020() == classKind;
        }
        m12078(37);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static AbstractC6988 m12089(AbstractC6988 abstractC6988) {
        if (abstractC6988 == null) {
            m12078(44);
            throw null;
        }
        for (AbstractC4881 abstractC4881 : abstractC6988.mo9011().mo9504()) {
            if (abstractC4881 == null) {
                m12078(45);
                throw null;
            }
            InterfaceC4872 interfaceC4872Mo9732 = abstractC4881.mo9732();
            if (interfaceC4872Mo9732 == null) {
                m12078(46);
                throw null;
            }
            AbstractC6988 abstractC69882 = (AbstractC6988) interfaceC4872Mo9732.mo9221();
            if (abstractC69882 == null) {
                m12078(47);
                throw null;
            }
            if (abstractC69882.mo9020() != ClassKind.INTERFACE) {
                return abstractC69882;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m12090(InterfaceC4498 interfaceC4498) {
        return m12088(interfaceC4498, ClassKind.CLASS) && interfaceC4498.getName().equals(AbstractC4691.f13707);
    }
}
