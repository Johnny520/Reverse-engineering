package p065;

import androidx.appcompat.app.C0955;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC5323;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5305;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5610;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5611;
import kotlin.reflect.jvm.internal.impl.storage.C5669;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5710;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5725;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5746;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5749;
import kotlin.reflect.jvm.internal.impl.types.C5717;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC5705;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import net.bytebuddy.description.method.MethodDescription;
import p061.C7296;
import p061.C7301;
import p062.C7305;
import p062.C7311;
import p062.InterfaceC7310;
import p082.AbstractC7699;
import p095.AbstractC7815;
import p095.AbstractC7818;
import p095.C7817;
import p095.C7819;
import p095.C7820;
import p096.C7853;
import p096.InterfaceC7850;
import p096.InterfaceC7852;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世子兰苏哲楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7359 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5523 f18265 = C5523.m9892("<built-ins module>");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5677 f18266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5669 f18267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5679 f18268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C7817 f18269;

    public AbstractC7359(C5677 c5677) {
        this.f18266 = c5677;
        c5677.m10139(new C7349(this, 0));
        int i = 1;
        this.f18268 = new C5679(c5677, new C7349(this, i));
        this.f18267 = c5677.m10138(new C7305(this, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public static boolean m12567(AbstractC5714 abstractC5714, C5518 c5518) {
        if (abstractC5714 == null) {
            m12579(105);
            throw null;
        }
        if (c5518 != null) {
            return !abstractC5714.mo10284() && m12570(abstractC5714, c5518);
        }
        m12579(106);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public static boolean m12568(InterfaceC5316 interfaceC5316) {
        if (interfaceC5316.mo9561().getAnnotations().mo10077(AbstractC7356.f18238)) {
            return true;
        }
        if (!(interfaceC5316 instanceof InterfaceC5305)) {
            return false;
        }
        InterfaceC5305 interfaceC5305 = (InterfaceC5305) interfaceC5316;
        boolean zMo9554 = interfaceC5305.mo9554();
        C7820 getter = interfaceC5305.getGetter();
        C7819 setter = interfaceC5305.getSetter();
        if (getter == null || !m12568(getter)) {
            return false;
        }
        if (zMo9554) {
            return setter != null && m12568(setter);
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public static boolean m12569(AbstractC5714 abstractC5714, C5518 c5518) {
        if (c5518 != null) {
            return m12570(abstractC5714, c5518) && !abstractC5714.mo10284();
        }
        m12579(135);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static boolean m12570(AbstractC5714 abstractC5714, C5518 c5518) {
        if (abstractC5714 == null) {
            m12579(97);
            throw null;
        }
        if (c5518 != null) {
            return m12574(abstractC5714.mo10281(), c5518);
        }
        m12579(98);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static boolean m12571(InterfaceC5331 interfaceC5331) {
        if (interfaceC5331 != null) {
            return AbstractC7699.m12672(interfaceC5331, C5610.class, false) != null;
        }
        m12579(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static boolean m12572(AbstractC5714 abstractC5714) {
        if (abstractC5714 != null) {
            return m12570(abstractC5714, AbstractC7356.f18244);
        }
        m12579(88);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public static boolean m12573(InterfaceC5309 interfaceC5309) {
        if (interfaceC5309 == null) {
            m12579(10);
            throw null;
        }
        for (InterfaceC5331 interfaceC5331Mo9587 = interfaceC5309; interfaceC5331Mo9587 != null; interfaceC5331Mo9587 = interfaceC5331Mo9587.mo9587()) {
            if (interfaceC5331Mo9587 instanceof InterfaceC5298) {
                C5519 c5519 = ((AbstractC7815) ((InterfaceC5298) interfaceC5331Mo9587)).f19032;
                C5523 c5523 = AbstractC7355.f18197;
                c5519.getClass();
                c5523.getClass();
                return c5519.f14041.m9876(c5523);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public static boolean m12574(InterfaceC5705 interfaceC5705, C5518 c5518) {
        if (interfaceC5705 == null) {
            m12579(101);
            throw null;
        }
        if (c5518 != null) {
            InterfaceC5309 interfaceC5309Mo9770 = interfaceC5705.mo9770();
            return (interfaceC5309Mo9770 instanceof AbstractC7818) && m12578((AbstractC7818) interfaceC5309Mo9770, c5518);
        }
        m12579(102);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public static boolean m12575(AbstractC5714 abstractC5714) {
        return m12567(abstractC5714, AbstractC7356.f18225);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static boolean m12576(AbstractC5714 abstractC5714) {
        if (abstractC5714.mo10284()) {
            return false;
        }
        InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
        return (interfaceC5309Mo9770 instanceof AbstractC7818) && m12580((AbstractC7818) interfaceC5309Mo9770) != null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public static boolean m12577(AbstractC5714 abstractC5714) {
        if (abstractC5714 != null) {
            return m12570(abstractC5714, AbstractC7356.f18229) && !AbstractC5749.m10403(abstractC5714);
        }
        m12579(136);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m12578(AbstractC7818 abstractC7818, C5518 c5518) {
        if (abstractC7818 == null) {
            m12579(103);
            throw null;
        }
        if (c5518 != null) {
            return abstractC7818.getName().equals(c5518.m9877()) && c5518.equals(AbstractC7699.m12660(abstractC7818));
        }
        m12579(104);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m12579(int i) {
        String str;
        int i2;
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                            }
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                    }
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 143:
            case 146:
            case 147:
            case 149:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 54:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 144:
            case 145:
            case 148:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 161:
                objArr[0] = "type";
                break;
            case 47:
                objArr[0] = "classSimpleName";
                break;
            case 68:
            case 70:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i == 11) {
            objArr[1] = "getBuiltInsPackageScope";
        } else if (i == 13) {
            objArr[1] = "getBuiltInClassByFqName";
        } else if (i == 15) {
            objArr[1] = "getBuiltInClassByName";
        } else if (i == 69) {
            objArr[1] = "getArrayElementType";
        } else if (i == 74) {
            objArr[1] = "getPrimitiveArrayKotlinType";
        } else if (i == 81 || i == 84) {
            objArr[1] = "getArrayType";
        } else if (i == 86) {
            objArr[1] = "getEnumType";
        } else if (i != 87) {
            switch (i) {
                case 3:
                    objArr[1] = "getAdditionalClassPartsProvider";
                    break;
                case 4:
                    objArr[1] = "getPlatformDependentDeclarationFilter";
                    break;
                case 5:
                    objArr[1] = "getClassDescriptorFactories";
                    break;
                case 6:
                    objArr[1] = "getStorageManager";
                    break;
                case 7:
                    objArr[1] = "getBuiltInsModule";
                    break;
                case 8:
                    objArr[1] = "getBuiltInPackagesImportedByDefault";
                    break;
                default:
                    switch (i) {
                        case 18:
                            objArr[1] = "getSuspendFunction";
                            break;
                        case 19:
                            objArr[1] = "getKFunction";
                            break;
                        case 20:
                            objArr[1] = "getKSuspendFunction";
                            break;
                        case 21:
                            objArr[1] = "getKClass";
                            break;
                        case 22:
                            objArr[1] = "getKType";
                            break;
                        case 23:
                            objArr[1] = "getKCallable";
                            break;
                        case 24:
                            objArr[1] = "getKProperty";
                            break;
                        case 25:
                            objArr[1] = "getKProperty0";
                            break;
                        case 26:
                            objArr[1] = "getKProperty1";
                            break;
                        case 27:
                            objArr[1] = "getKProperty2";
                            break;
                        case 28:
                            objArr[1] = "getKMutableProperty0";
                            break;
                        case 29:
                            objArr[1] = "getKMutableProperty1";
                            break;
                        case 30:
                            objArr[1] = "getKMutableProperty2";
                            break;
                        case 31:
                            objArr[1] = "getIterator";
                            break;
                        case 32:
                            objArr[1] = "getIterable";
                            break;
                        case 33:
                            objArr[1] = "getMutableIterable";
                            break;
                        case 34:
                            objArr[1] = "getMutableIterator";
                            break;
                        case 35:
                            objArr[1] = "getCollection";
                            break;
                        case 36:
                            objArr[1] = "getMutableCollection";
                            break;
                        case 37:
                            objArr[1] = "getList";
                            break;
                        case 38:
                            objArr[1] = "getMutableList";
                            break;
                        case 39:
                            objArr[1] = "getSet";
                            break;
                        case 40:
                            objArr[1] = "getMutableSet";
                            break;
                        case 41:
                            objArr[1] = "getMap";
                            break;
                        case 42:
                            objArr[1] = "getMutableMap";
                            break;
                        case 43:
                            objArr[1] = "getMapEntry";
                            break;
                        case 44:
                            objArr[1] = "getMutableMapEntry";
                            break;
                        case 45:
                            objArr[1] = "getListIterator";
                            break;
                        case 46:
                            objArr[1] = "getMutableListIterator";
                            break;
                        default:
                            switch (i) {
                                case 48:
                                    objArr[1] = "getBuiltInTypeByClassName";
                                    break;
                                case 49:
                                    objArr[1] = "getNothingType";
                                    break;
                                case 50:
                                    objArr[1] = "getNullableNothingType";
                                    break;
                                case 51:
                                    objArr[1] = "getAnyType";
                                    break;
                                case 52:
                                    objArr[1] = "getNullableAnyType";
                                    break;
                                case 53:
                                    objArr[1] = "getDefaultBound";
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                            objArr[1] = "getPrimitiveKotlinType";
                                            break;
                                        case 56:
                                            objArr[1] = "getNumberType";
                                            break;
                                        case 57:
                                            objArr[1] = "getByteType";
                                            break;
                                        case 58:
                                            objArr[1] = "getShortType";
                                            break;
                                        case 59:
                                            objArr[1] = "getIntType";
                                            break;
                                        case 60:
                                            objArr[1] = "getLongType";
                                            break;
                                        case 61:
                                            objArr[1] = "getFloatType";
                                            break;
                                        case 62:
                                            objArr[1] = "getDoubleType";
                                            break;
                                        case 63:
                                            objArr[1] = "getCharType";
                                            break;
                                        case 64:
                                            objArr[1] = "getBooleanType";
                                            break;
                                        case 65:
                                            objArr[1] = "getUnitType";
                                            break;
                                        case 66:
                                            objArr[1] = "getStringType";
                                            break;
                                        case 67:
                                            objArr[1] = "getIterableType";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "getAnnotationType";
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 69:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 47:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 54:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 68:
                objArr[2] = "getArrayElementType";
                break;
            case 70:
                objArr[2] = "getArrayElementTypeOrNull";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "mayReturnNonUnitValue";
                break;
            case 144:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 145:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 146:
                objArr[2] = "isMemberOfAny";
                break;
            case 147:
            case 148:
                objArr[2] = "isEnum";
                break;
            case 149:
            case 150:
                objArr[2] = "isComparable";
                break;
            case 151:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 152:
                objArr[2] = "isListOrNullableList";
                break;
            case 153:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 154:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 155:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 156:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 157:
                objArr[2] = "isThrowable";
                break;
            case 158:
                objArr[2] = "isKClass";
                break;
            case 159:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 11 && i != 13 && i != 15 && i != 69 && i != 74 && i != 81 && i != 84 && i != 86 && i != 87) {
            switch (i) {
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (i) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                            break;
                        default:
                            switch (i) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i) {
                                        case 55:
                                        case 56:
                                        case 57:
                                        case 58:
                                        case 59:
                                        case 60:
                                        case 61:
                                        case 62:
                                        case 63:
                                        case 64:
                                        case 65:
                                        case 66:
                                        case 67:
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

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static PrimitiveType m12580(AbstractC7818 abstractC7818) {
        if (AbstractC7356.f18252.contains(abstractC7818.getName())) {
            return (PrimitiveType) AbstractC7356.f18250.get(AbstractC7699.m12660(abstractC7818));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static boolean m12581(AbstractC5714 abstractC5714) {
        if (abstractC5714 != null) {
            return m12570(abstractC5714, AbstractC7356.f18230);
        }
        m12579(139);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static PrimitiveType m12582(InterfaceC5309 interfaceC5309) {
        if (interfaceC5309 == null) {
            m12579(77);
            throw null;
        }
        if (AbstractC7356.f18251.contains(interfaceC5309.getName())) {
            return (PrimitiveType) AbstractC7356.f18249.get(AbstractC7699.m12660(interfaceC5309));
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final AbstractC5714 m12583(AbstractC5714 abstractC5714) {
        if (abstractC5714 == null) {
            m12579(68);
            throw null;
        }
        AbstractC5714 abstractC5714M12594 = m12594(abstractC5714);
        if (abstractC5714M12594 != null) {
            return abstractC5714M12594;
        }
        C8376.m13333(abstractC5714, "not array: ");
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC5710 m12584() {
        AbstractC5710 abstractC5710Mo9584 = m12595("Any").mo9584();
        if (abstractC5710Mo9584 != null) {
            return abstractC5710Mo9584;
        }
        m12579(51);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public InterfaceC7852 mo9527() {
        return C7853.f19207;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m12585(boolean z) {
        C5523 c5523 = f18265;
        c5523.getClass();
        C5677 c5677 = this.f18266;
        C7817 c7817 = new C7817(c5523, c5677, this, 48);
        this.f18269 = c7817;
        InterfaceC7352.f18177.getClass();
        c7817.f19045 = ((C5611) ((InterfaceC7352) C7353.f18178.getValue())).m10069(c5677, this.f18269, mo9528(), mo9507(), mo9527(), z);
        C7817 c78172 = this.f18269;
        c78172.getClass();
        List listM9405 = AbstractC5179.m9405(new C7817[]{c78172});
        listM9405.getClass();
        EmptySet emptySet = EmptySet.INSTANCE;
        emptySet.getClass();
        c78172.f19048 = new C0955(listM9405, emptySet, EmptyList.INSTANCE, emptySet);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC5710 m12586(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m12579(54);
            throw null;
        }
        AbstractC5710 abstractC5710Mo9584 = m12595(primitiveType.getTypeName().m9894()).mo9584();
        if (abstractC5710Mo9584 != null) {
            return abstractC5710Mo9584;
        }
        m12579(55);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final AbstractC5710 m12587() {
        AbstractC5710 abstractC5710Mo9584 = m12595("Unit").mo9584();
        if (abstractC5710Mo9584 != null) {
            return abstractC5710Mo9584;
        }
        m12579(65);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final AbstractC5710 m12588() {
        AbstractC5710 abstractC5710Mo9584 = m12595("String").mo9584();
        if (abstractC5710Mo9584 != null) {
            return abstractC5710Mo9584;
        }
        m12579(66);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final AbstractC7818 m12589(int i) {
        AbstractC7818 abstractC7818M12598 = m12598(AbstractC7355.f18183.m9880(C5523.m9889(C7301.f18099.f18101 + i)));
        if (abstractC7818M12598 != null) {
            return abstractC7818M12598;
        }
        m12579(18);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final AbstractC5710 m12590() {
        AbstractC5710 abstractC5710Mo9584 = m12595("Nothing").mo9584();
        if (abstractC5710Mo9584 != null) {
            return abstractC5710Mo9584;
        }
        m12579(49);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public Iterable mo9528() {
        List listSingletonList = Collections.singletonList(new C7296(this.f18266, m12596()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        m12579(5);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC5710 m12591(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m12579(73);
            throw null;
        }
        AbstractC5710 abstractC5710 = (AbstractC5710) ((C7360) this.f18268.invoke()).f18271.get(primitiveType);
        if (abstractC5710 != null) {
            return abstractC5710;
        }
        m12579(74);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final AbstractC5710 m12592() {
        AbstractC5710 abstractC5710Mo10287 = m12584().mo10290(true);
        if (abstractC5710Mo10287 != null) {
            return abstractC5710Mo10287;
        }
        m12579(52);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public InterfaceC7850 mo9507() {
        return C7853.f19205;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final AbstractC5710 m12593(AbstractC5714 abstractC5714, Variance variance) {
        if (variance == null) {
            m12579(82);
            throw null;
        }
        if (abstractC5714 != null) {
            return m12597(variance, abstractC5714, C7311.f18113);
        }
        m12579(83);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e A[RETURN] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC5714 m12594(AbstractC5714 abstractC5714) {
        C5520 c5520M10057;
        C5520 c5520;
        AbstractC7818 abstractC7818M9636;
        AbstractC5710 abstractC5710Mo9584;
        if (abstractC5714 == null) {
            m12579(70);
            throw null;
        }
        if (!m12572(abstractC5714)) {
            AbstractC5746 abstractC5746M10409 = AbstractC5749.m10409(abstractC5714, false);
            AbstractC5714 abstractC57142 = (AbstractC5714) ((C7360) this.f18268.invoke()).f18270.get(abstractC5746M10409);
            if (abstractC57142 != null) {
                return abstractC57142;
            }
            int i = AbstractC7699.f18657;
            InterfaceC5309 interfaceC5309Mo9770 = abstractC5746M10409.mo10281().mo9770();
            InterfaceC5318 interfaceC5318M12662 = interfaceC5309Mo9770 == null ? null : AbstractC7699.m12662(interfaceC5309Mo9770);
            if (interfaceC5318M12662 != null) {
                InterfaceC5309 interfaceC5309Mo97702 = abstractC5746M10409.mo10281().mo9770();
                if (interfaceC5309Mo97702 == null) {
                    abstractC5710Mo9584 = null;
                    if (abstractC5710Mo9584 == null) {
                        return abstractC5710Mo9584;
                    }
                } else {
                    Set set = AbstractC7358.f18264;
                    C5523 name = interfaceC5309Mo97702.getName();
                    name.getClass();
                    if (AbstractC7358.f18261.contains(name) && (c5520M10057 = AbstractC5605.m10057(interfaceC5309Mo97702)) != null && (c5520 = (C5520) AbstractC7358.f18263.get(c5520M10057)) != null && (abstractC7818M9636 = AbstractC5323.m9636(interfaceC5318M12662, c5520)) != null) {
                        abstractC5710Mo9584 = abstractC7818M9636.mo9584();
                    }
                    if (abstractC5710Mo9584 == null) {
                    }
                }
            }
        } else if (abstractC5714.mo10285().size() == 1) {
            return ((AbstractC5702) abstractC5714.mo10285().get(0)).mo10300();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final AbstractC7818 m12595(String str) {
        if (str != null) {
            return (AbstractC7818) this.f18267.invoke(C5523.m9889(str));
        }
        m12579(14);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C7817 m12596() {
        this.f18269.getClass();
        C7817 c7817 = this.f18269;
        if (c7817 != null) {
            return c7817;
        }
        m12579(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC5710 m12597(Variance variance, AbstractC5714 abstractC5714, InterfaceC7310 interfaceC7310) {
        if (variance == null) {
            m12579(78);
            throw null;
        }
        if (abstractC5714 != null) {
            return AbstractC5725.m10373(AbstractC5725.m10358(interfaceC7310), m12595("Array"), Collections.singletonList(new C5717(abstractC5714, variance)));
        }
        m12579(79);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final AbstractC7818 m12598(C5519 c5519) {
        if (c5519 == null) {
            m12579(12);
            throw null;
        }
        AbstractC7818 abstractC7818M9639 = AbstractC5323.m9639(m12596(), c5519, NoLookupLocation.FROM_BUILTINS);
        if (abstractC7818M9639 != null) {
            return abstractC7818M9639;
        }
        m12579(13);
        throw null;
    }
}
