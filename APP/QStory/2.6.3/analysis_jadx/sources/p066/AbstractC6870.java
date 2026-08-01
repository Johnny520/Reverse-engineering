package p066;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489;
import kotlin.reflect.jvm.internal.impl.descriptors.C4461;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4466;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4500;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4692;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC4873;
import p079.AbstractC6986;
import p079.AbstractC6989;
import p079.C6990;
import p079.C7004;
import p098.C7240;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6870 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f18312 = 0;

    static {
        new C4687("kotlin.jvm.JvmName");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C4686 m12101(InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 != null) {
            C4687 c4687M12114 = m12114(interfaceC4499);
            return c4687M12114 != null ? c4687M12114.f13696 : m12101(interfaceC4499.mo9028()).m9316(interfaceC4499.getName());
        }
        m12106(2);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C4461 m12102(InterfaceC4499 interfaceC4499) {
        C4461 c4461 = C4461.f13088;
        if (interfaceC4499 == null) {
            m12106(81);
            throw null;
        }
        if (interfaceC4499 instanceof C6990) {
            interfaceC4499 = ((C6990) interfaceC4499).m12326();
        }
        if (interfaceC4499 instanceof InterfaceC4500) {
            ((InterfaceC4500) interfaceC4499).mo9026().getClass();
        }
        return c4461;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static InterfaceC4486 m12103(InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 == null) {
            m12106(23);
            throw null;
        }
        while (interfaceC4499 != null) {
            if (interfaceC4499 instanceof InterfaceC4486) {
                return (InterfaceC4486) interfaceC4499;
            }
            if (interfaceC4499 instanceof C7004) {
                return ((C7004) interfaceC4499).f18815;
            }
            interfaceC4499 = interfaceC4499.mo9028();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC4486 m12104(InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 == null) {
            m12106(21);
            throw null;
        }
        InterfaceC4486 interfaceC4486M12103 = m12103(interfaceC4499);
        if (interfaceC4486M12103 != null) {
            return interfaceC4486M12103;
        }
        m12106(22);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12105(InterfaceC4481 interfaceC4481, LinkedHashSet linkedHashSet) {
        if (interfaceC4481 == null) {
            m12106(72);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC4481)) {
            return;
        }
        Iterator it = interfaceC4481.mo9002().mo9030().iterator();
        while (it.hasNext()) {
            InterfaceC4481 interfaceC4481Mo9002 = ((InterfaceC4481) it.next()).mo9002();
            m12105(interfaceC4481Mo9002, linkedHashSet);
            linkedHashSet.add(interfaceC4481Mo9002);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12106(int i) {
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
    public static boolean m12107(AbstractC4882 abstractC4882, InterfaceC4499 interfaceC4499) {
        if (abstractC4882 == null) {
            m12106(30);
            throw null;
        }
        if (interfaceC4499 == null) {
            m12106(31);
            throw null;
        }
        InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
        if (interfaceC4477Mo9211 == null) {
            return false;
        }
        InterfaceC4499 interfaceC4499Mo9002 = interfaceC4477Mo9211.mo9002();
        return (interfaceC4499Mo9002 instanceof InterfaceC4477) && (interfaceC4499 instanceof InterfaceC4477) && ((InterfaceC4477) interfaceC4499).mo9001().equals(((InterfaceC4477) interfaceC4499Mo9002).mo9001());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m12108(InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 == null) {
            m12106(1);
            throw null;
        }
        while (interfaceC4499 != null) {
            if (m12118(interfaceC4499) || ((interfaceC4499 instanceof InterfaceC4498) && ((InterfaceC4498) interfaceC4499).getVisibility() == AbstractC4489.f13115)) {
                return true;
            }
            interfaceC4499 = interfaceC4499.mo9028();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m12109(InterfaceC4499 interfaceC4499) {
        return interfaceC4499 != null && (interfaceC4499.mo9028() instanceof InterfaceC4466);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static InterfaceC4480 m12110(InterfaceC4480 interfaceC4480) {
        if (interfaceC4480 == null) {
            m12106(58);
            throw null;
        }
        while (interfaceC4480.getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
            Collection collectionMo9030 = interfaceC4480.mo9030();
            if (collectionMo9030.isEmpty()) {
                C7547.m12774(interfaceC4480, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            interfaceC4480 = (InterfaceC4480) collectionMo9030.iterator().next();
        }
        return interfaceC4480;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m12111(InterfaceC4499 interfaceC4499) {
        return (m12116(interfaceC4499, ClassKind.CLASS) || m12116(interfaceC4499, ClassKind.INTERFACE)) && ((AbstractC6989) interfaceC4499).mo9009() == Modality.SEALED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m12112(AbstractC4882 abstractC4882, InterfaceC4499 interfaceC4499) {
        if (abstractC4882 == null) {
            m12106(32);
            throw null;
        }
        if (interfaceC4499 == null) {
            m12106(33);
            throw null;
        }
        if (m12107(abstractC4882, interfaceC4499)) {
            return true;
        }
        Iterator it = abstractC4882.mo9722().mo9494().iterator();
        while (it.hasNext()) {
            if (m12112((AbstractC4882) it.next(), interfaceC4499)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC4499 m12113(InterfaceC4499 interfaceC4499, Class cls, boolean z) {
        if (interfaceC4499 == null) {
            return null;
        }
        if (z) {
            interfaceC4499 = interfaceC4499.mo9028();
        }
        while (interfaceC4499 != null) {
            if (cls.isInstance(interfaceC4499)) {
                return interfaceC4499;
            }
            interfaceC4499 = interfaceC4499.mo9028();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C4687 m12114(InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 == null) {
            m12106(5);
            throw null;
        }
        if ((interfaceC4499 instanceof InterfaceC4486) || C7240.m12467(interfaceC4499)) {
            return C4687.f13694;
        }
        if (interfaceC4499 instanceof C7004) {
            return ((C7004) interfaceC4499).f18812;
        }
        if (interfaceC4499 instanceof InterfaceC4466) {
            return ((AbstractC6986) ((InterfaceC4466) interfaceC4499)).f18687;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m12115(InterfaceC4499 interfaceC4499) {
        return m12116(interfaceC4499, ClassKind.OBJECT) && ((AbstractC6989) interfaceC4499).mo9013();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m12116(InterfaceC4499 interfaceC4499, ClassKind classKind) {
        if (classKind != null) {
            return (interfaceC4499 instanceof AbstractC6989) && ((AbstractC6989) interfaceC4499).mo9010() == classKind;
        }
        m12106(37);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static AbstractC6989 m12117(AbstractC6989 abstractC6989) {
        if (abstractC6989 == null) {
            m12106(44);
            throw null;
        }
        for (AbstractC4882 abstractC4882 : abstractC6989.mo9001().mo9494()) {
            if (abstractC4882 == null) {
                m12106(45);
                throw null;
            }
            InterfaceC4873 interfaceC4873Mo9722 = abstractC4882.mo9722();
            if (interfaceC4873Mo9722 == null) {
                m12106(46);
                throw null;
            }
            AbstractC6989 abstractC69892 = (AbstractC6989) interfaceC4873Mo9722.mo9211();
            if (abstractC69892 == null) {
                m12106(47);
                throw null;
            }
            if (abstractC69892.mo9010() != ClassKind.INTERFACE) {
                return abstractC69892;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m12118(InterfaceC4499 interfaceC4499) {
        return m12116(interfaceC4499, ClassKind.CLASS) && interfaceC4499.getName().equals(AbstractC4692.f13711);
    }
}
