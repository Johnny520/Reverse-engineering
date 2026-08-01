package p095;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.C5322;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5314;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.storage.C5675;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5748;
import kotlin.reflect.jvm.internal.impl.types.C5751;
import net.bytebuddy.description.method.MethodDescription;
import p062.C7311;
import p062.InterfaceC7310;
import p068.InterfaceC7372;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7821 extends AbstractC7806 implements InterfaceC5305 {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public C7840 f19054;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public C7820 f19055;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public ArrayList f19056;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public C7840 f19057;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public C7819 f19058;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final boolean f19059;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final boolean f19060;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final CallableMemberDescriptor$Kind f19061;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final InterfaceC5305 f19062;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public Collection f19063;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public C5322 f19064;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public C7835 f19065;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public C7835 f19066;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public List f19067;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final boolean f19068;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final boolean f19069;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final boolean f19070;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public InterfaceC7372 f19071;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final Modality f19072;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f19073;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public C5675 f19074;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7821(InterfaceC5331 interfaceC5331, InterfaceC5305 interfaceC5305, InterfaceC7310 interfaceC7310, Modality modality, C5322 c5322, boolean z, C5523 c5523, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5294 interfaceC5294, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(interfaceC5331, interfaceC7310, c5523, null, interfaceC5294);
        if (interfaceC5331 == null) {
            m12877(0);
            throw null;
        }
        if (interfaceC7310 == null) {
            m12877(1);
            throw null;
        }
        if (modality == null) {
            m12877(2);
            throw null;
        }
        if (c5322 == null) {
            m12877(3);
            throw null;
        }
        if (c5523 == null) {
            m12877(4);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12877(5);
            throw null;
        }
        if (interfaceC5294 == null) {
            m12877(6);
            throw null;
        }
        this.f19073 = z;
        this.f19063 = null;
        this.f19067 = Collections.EMPTY_LIST;
        this.f19072 = modality;
        this.f19064 = c5322;
        this.f19062 = interfaceC5305 == null ? this : interfaceC5305;
        this.f19061 = callableMemberDescriptor$Kind;
        this.f19060 = z2;
        this.f19059 = z3;
        this.f19070 = z4;
        this.f19069 = z5;
        this.f19068 = z6;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public static InterfaceC5316 m12875(C5751 c5751, AbstractC7823 abstractC7823) {
        if (abstractC7823 == null) {
            m12877(31);
            throw null;
        }
        InterfaceC5316 interfaceC5316 = abstractC7823.f19086;
        if (interfaceC5316 != null) {
            return interfaceC5316.mo9564(c5751);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public static C7821 m12876(InterfaceC5331 interfaceC5331, Modality modality, C5322 c5322, boolean z, C5523 c5523, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, InterfaceC5294 interfaceC5294) {
        if (interfaceC5331 == null) {
            m12877(7);
            throw null;
        }
        if (modality == null) {
            m12877(9);
            throw null;
        }
        if (c5322 == null) {
            m12877(10);
            throw null;
        }
        if (c5523 == null) {
            m12877(11);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12877(12);
            throw null;
        }
        if (interfaceC5294 != null) {
            return new C7821(interfaceC5331, null, C7311.f18113, modality, c5322, z, c5523, callableMemberDescriptor$Kind, interfaceC5294, false, false, false, false, false);
        }
        m12877(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m12877(int i) {
        String str;
        int i2;
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case 37:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case 31:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i == 38) {
            objArr[1] = "getOriginal";
        } else if (i == 39) {
            objArr[1] = "getKind";
        } else if (i == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i != 42) {
            switch (i) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 38:
            case 39:
            case 41:
            case 42:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case 31:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 28 && i != 38 && i != 39 && i != 41 && i != 42) {
            switch (i) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305
    public final C7820 getGetter() {
        return this.f19055;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312
    public final CallableMemberDescriptor$Kind getKind() {
        CallableMemberDescriptor$Kind callableMemberDescriptor$Kind = this.f19061;
        if (callableMemberDescriptor$Kind != null) {
            return callableMemberDescriptor$Kind;
        }
        m12877(39);
        throw null;
    }

    @Override // p095.AbstractC7806, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    public final AbstractC5714 getReturnType() {
        AbstractC5714 type = getType();
        if (type != null) {
            return type;
        }
        m12877(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305
    public final C7819 getSetter() {
        return this.f19058;
    }

    @Override // p095.AbstractC7806, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    public final List getTypeParameters() {
        ArrayList arrayList = this.f19056;
        if (arrayList != null) {
            return arrayList;
        }
        C8376.m13333(this, "typeParameters == null for ");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5330
    public final C5322 getVisibility() {
        C5322 c5322 = this.f19064;
        if (c5322 != null) {
            return c5322;
        }
        m12877(25);
        throw null;
    }

    public boolean isConst() {
        return this.f19059;
    }

    public boolean isExternal() {
        return this.f19069;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5287
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final boolean mo9554() {
        return this.f19073;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final C7840 mo9580() {
        return this.f19054;
    }

    @Override // p095.AbstractC7806, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲 */
    public final C7835 mo9591() {
        return this.f19065;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public Object mo9592(InterfaceC5314 interfaceC5314) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final C7835 mo9593() {
        return this.f19066;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5287
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final AbstractC5600 mo9555() {
        C5675 c5675 = this.f19074;
        if (c5675 != null) {
            return (AbstractC5600) c5675.invoke();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final boolean mo9581() {
        return this.f19068;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312
    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C7821 mo9588(InterfaceC5331 interfaceC5331, Modality modality, C5322 c5322, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind) throws Exception {
        C7822 c7822 = new C7822(this);
        if (interfaceC5331 == null) {
            C7822.m12882(0);
            throw null;
        }
        c7822.f19080 = interfaceC5331;
        c7822.f19077 = null;
        c7822.f19079 = modality;
        if (c5322 == null) {
            C7822.m12882(8);
            throw null;
        }
        c7822.f19078 = c5322;
        if (callableMemberDescriptor$Kind == null) {
            C7822.m12882(10);
            throw null;
        }
        c7822.f19076 = callableMemberDescriptor$Kind;
        c7822.f19082 = false;
        C7821 c7821M12883 = c7822.m12883();
        if (c7821M12883 != null) {
            return c7821M12883;
        }
        m12877(42);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final void m12879(AbstractC5714 abstractC5714, List list, C7835 c7835, C7835 c78352, List list2) {
        if (abstractC5714 == null) {
            m12877(17);
            throw null;
        }
        if (list == null) {
            m12877(18);
            throw null;
        }
        if (list2 == null) {
            m12877(19);
            throw null;
        }
        this.f19013 = abstractC5714;
        this.f19056 = new ArrayList(list);
        this.f19065 = c78352;
        this.f19066 = c7835;
        this.f19067 = list2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public final void m12880(C7820 c7820, C7819 c7819, C7840 c7840, C7840 c78402) {
        this.f19055 = c7820;
        this.f19058 = c7819;
        this.f19057 = c7840;
        this.f19054 = c78402;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public final void m12881(C5675 c5675, InterfaceC7372 interfaceC7372) {
        if (interfaceC7372 == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "compileTimeInitializerFactory", "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl", "setCompileTimeInitializer"));
        }
        this.f19071 = interfaceC7372;
        if (c5675 == null) {
            c5675 = (C5675) interfaceC7372.invoke();
        }
        this.f19074 = c5675;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世 */
    public C7821 mo9698(InterfaceC5331 interfaceC5331, Modality modality, C5322 c5322, InterfaceC5305 interfaceC5305, CallableMemberDescriptor$Kind callableMemberDescriptor$Kind, C5523 c5523) {
        if (interfaceC5331 == null) {
            m12877(32);
            throw null;
        }
        if (modality == null) {
            m12877(33);
            throw null;
        }
        if (c5322 == null) {
            m12877(34);
            throw null;
        }
        if (callableMemberDescriptor$Kind == null) {
            m12877(35);
            throw null;
        }
        if (c5523 == null) {
            m12877(36);
            throw null;
        }
        return new C7821(interfaceC5331, interfaceC5305, getAnnotations(), modality, c5322, this.f19073, c5523, callableMemberDescriptor$Kind, InterfaceC5294.f13436, this.f19060, isConst(), this.f19070, isExternal(), this.f19068);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5296
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final InterfaceC5305 mo9564(C5751 c5751) {
        if (c5751 == null) {
            m12877(27);
            throw null;
        }
        AbstractC5748 abstractC5748 = c5751.f14594;
        if (abstractC5748.mo10293()) {
            return this;
        }
        C7822 c7822 = new C7822(this);
        c7822.f19075 = abstractC5748;
        c7822.f19077 = mo9561();
        return c7822.m12883();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子世苏哲兰楪] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // p095.AbstractC7837, p095.AbstractC7838, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final InterfaceC5305 mo9561() {
        InterfaceC5305 interfaceC5305 = this.f19062;
        ?? Mo9561 = this;
        if (interfaceC5305 != this) {
            Mo9561 = interfaceC5305.mo9561();
        }
        if (Mo9561 != 0) {
            return Mo9561;
        }
        m12877(38);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return interfaceC5329.mo861(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final boolean mo9567() {
        return this.f19070;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final Modality mo9568() {
        Modality modality = this.f19072;
        if (modality != null) {
            return modality;
        }
        m12877(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final ArrayList mo9582() {
        ArrayList arrayList = new ArrayList(2);
        C7820 c7820 = this.f19055;
        if (c7820 != null) {
            arrayList.add(c7820);
        }
        C7819 c7819 = this.f19058;
        if (c7819 != null) {
            arrayList.add(c7819);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final Collection mo9589() {
        Collection collection = this.f19063;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        m12877(41);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo9590(Collection collection) {
        if (collection != null) {
            this.f19063 = collection;
        } else {
            m12877(40);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5287
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰 */
    public final boolean mo9556() {
        return this.f19060;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5319
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final boolean mo9575() {
        return false;
    }

    @Override // p095.AbstractC7806, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final List mo9596() {
        List list = this.f19067;
        if (list != null) {
            return list;
        }
        m12877(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final C7840 mo9583() {
        return this.f19057;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪 */
    public void mo9697(AbstractC5714 abstractC5714) {
    }
}
