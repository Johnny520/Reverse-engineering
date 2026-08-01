package p082;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5321;
import kotlin.reflect.jvm.internal.impl.descriptors.C5293;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5330;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5332;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5524;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p095.C7819;
import p095.C7833;
import p114.C8069;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世楪兰子哲苏.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7699 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f18657 = 0;

    static {
        new C5519("kotlin.jvm.JvmName");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static C5518 m12660(InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 != null) {
            C5519 c5519M12673 = m12673(interfaceC5331);
            return c5519M12673 != null ? c5519M12673.f14041 : m12660(interfaceC5331.mo9587()).m9875(interfaceC5331.getName());
        }
        m12665(2);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5293 m12661(InterfaceC5331 interfaceC5331) {
        C5293 c5293 = C5293.f13433;
        if (interfaceC5331 == null) {
            m12665(81);
            throw null;
        }
        if (interfaceC5331 instanceof C7819) {
            interfaceC5331 = ((C7819) interfaceC5331).m12885();
        }
        if (interfaceC5331 instanceof InterfaceC5332) {
            ((InterfaceC5332) interfaceC5331).mo9585().getClass();
        }
        return c5293;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static InterfaceC5318 m12662(InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 == null) {
            m12665(23);
            throw null;
        }
        while (interfaceC5331 != null) {
            if (interfaceC5331 instanceof InterfaceC5318) {
                return (InterfaceC5318) interfaceC5331;
            }
            if (interfaceC5331 instanceof C7833) {
                return ((C7833) interfaceC5331).f19160;
            }
            interfaceC5331 = interfaceC5331.mo9587();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC5318 m12663(InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 == null) {
            m12665(21);
            throw null;
        }
        InterfaceC5318 interfaceC5318M12662 = m12662(interfaceC5331);
        if (interfaceC5318M12662 != null) {
            return interfaceC5318M12662;
        }
        m12665(22);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m12664(InterfaceC5313 interfaceC5313, LinkedHashSet linkedHashSet) {
        if (interfaceC5313 == null) {
            m12665(72);
            throw null;
        }
        if (linkedHashSet.contains(interfaceC5313)) {
            return;
        }
        Iterator it = interfaceC5313.mo9561().mo9589().iterator();
        while (it.hasNext()) {
            InterfaceC5313 interfaceC5313Mo9561 = ((InterfaceC5313) it.next()).mo9561();
            m12664(interfaceC5313Mo9561, linkedHashSet);
            linkedHashSet.add(interfaceC5313Mo9561);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m12665(int i) {
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
    public static boolean m12666(AbstractC5714 abstractC5714, InterfaceC5331 interfaceC5331) {
        if (abstractC5714 == null) {
            m12665(30);
            throw null;
        }
        if (interfaceC5331 == null) {
            m12665(31);
            throw null;
        }
        InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
        if (interfaceC5309Mo9770 == null) {
            return false;
        }
        InterfaceC5331 interfaceC5331Mo9561 = interfaceC5309Mo9770.mo9561();
        return (interfaceC5331Mo9561 instanceof InterfaceC5309) && (interfaceC5331 instanceof InterfaceC5309) && ((InterfaceC5309) interfaceC5331).mo9560().equals(((InterfaceC5309) interfaceC5331Mo9561).mo9560());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static boolean m12667(InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 == null) {
            m12665(1);
            throw null;
        }
        while (interfaceC5331 != null) {
            if (m12677(interfaceC5331) || ((interfaceC5331 instanceof InterfaceC5330) && ((InterfaceC5330) interfaceC5331).getVisibility() == AbstractC5321.f13460)) {
                return true;
            }
            interfaceC5331 = interfaceC5331.mo9587();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static boolean m12668(InterfaceC5331 interfaceC5331) {
        return interfaceC5331 != null && (interfaceC5331.mo9587() instanceof InterfaceC5298);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static InterfaceC5312 m12669(InterfaceC5312 interfaceC5312) {
        if (interfaceC5312 == null) {
            m12665(58);
            throw null;
        }
        while (interfaceC5312.getKind() == CallableMemberDescriptor$Kind.FAKE_OVERRIDE) {
            Collection collectionMo9589 = interfaceC5312.mo9589();
            if (collectionMo9589.isEmpty()) {
                C8376.m13333(interfaceC5312, "Fake override should have at least one overridden descriptor: ");
                return null;
            }
            interfaceC5312 = (InterfaceC5312) collectionMo9589.iterator().next();
        }
        return interfaceC5312;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static boolean m12670(InterfaceC5331 interfaceC5331) {
        return (m12675(interfaceC5331, ClassKind.CLASS) || m12675(interfaceC5331, ClassKind.INTERFACE)) && ((AbstractC7818) interfaceC5331).mo9568() == Modality.SEALED;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static boolean m12671(AbstractC5714 abstractC5714, InterfaceC5331 interfaceC5331) {
        if (abstractC5714 == null) {
            m12665(32);
            throw null;
        }
        if (interfaceC5331 == null) {
            m12665(33);
            throw null;
        }
        if (m12666(abstractC5714, interfaceC5331)) {
            return true;
        }
        Iterator it = abstractC5714.mo10281().mo10053().iterator();
        while (it.hasNext()) {
            if (m12671((AbstractC5714) it.next(), interfaceC5331)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static InterfaceC5331 m12672(InterfaceC5331 interfaceC5331, Class cls, boolean z) {
        if (interfaceC5331 == null) {
            return null;
        }
        if (z) {
            interfaceC5331 = interfaceC5331.mo9587();
        }
        while (interfaceC5331 != null) {
            if (cls.isInstance(interfaceC5331)) {
                return interfaceC5331;
            }
            interfaceC5331 = interfaceC5331.mo9587();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C5519 m12673(InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 == null) {
            m12665(5);
            throw null;
        }
        if ((interfaceC5331 instanceof InterfaceC5318) || C8069.m13026(interfaceC5331)) {
            return C5519.f14039;
        }
        if (interfaceC5331 instanceof C7833) {
            return ((C7833) interfaceC5331).f19157;
        }
        if (interfaceC5331 instanceof InterfaceC5298) {
            return ((AbstractC7815) ((InterfaceC5298) interfaceC5331)).f19032;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static boolean m12674(InterfaceC5331 interfaceC5331) {
        return m12675(interfaceC5331, ClassKind.OBJECT) && ((AbstractC7818) interfaceC5331).mo9572();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static boolean m12675(InterfaceC5331 interfaceC5331, ClassKind classKind) {
        if (classKind != null) {
            return (interfaceC5331 instanceof AbstractC7818) && ((AbstractC7818) interfaceC5331).mo9569() == classKind;
        }
        m12665(37);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static AbstractC7818 m12676(AbstractC7818 abstractC7818) {
        if (abstractC7818 == null) {
            m12665(44);
            throw null;
        }
        for (AbstractC5714 abstractC5714 : abstractC7818.mo9560().mo10053()) {
            if (abstractC5714 == null) {
                m12665(45);
                throw null;
            }
            InterfaceC5705 interfaceC5705Mo10281 = abstractC5714.mo10281();
            if (interfaceC5705Mo10281 == null) {
                m12665(46);
                throw null;
            }
            AbstractC7818 abstractC78182 = (AbstractC7818) interfaceC5705Mo10281.mo9770();
            if (abstractC78182 == null) {
                m12665(47);
                throw null;
            }
            if (abstractC78182.mo9569() != ClassKind.INTERFACE) {
                return abstractC78182;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static boolean m12677(InterfaceC5331 interfaceC5331) {
        return m12675(interfaceC5331, ClassKind.CLASS) && interfaceC5331.getName().equals(AbstractC5524.f14056);
    }
}
