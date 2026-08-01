package p103;

import androidx.activity.AbstractC0900;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.AbstractC5971;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p105.C8011;
import p105.InterfaceC8010;
import p105.InterfaceC8012;
import p105.InterfaceC8013;
import p107.InterfaceC8020;
import p269.AbstractC9019;
import top.yukonga.miuix.kmp.utils.C6886;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7973 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC8020[] f19449 = new InterfaceC8020[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC8013[] f19448 = new InterfaceC8013[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Object f19447 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC8013 m12970(Object obj, InterfaceC8013... interfaceC8013Arr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (interfaceC8013Arr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = interfaceC8013Arr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = InterfaceC8013.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(interfaceC8013Arr, interfaceC8013Arr.length));
            if (objInvoke instanceof InterfaceC8013) {
                return (InterfaceC8013) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final int m12971(InterfaceC8020 interfaceC8020, InterfaceC8020[] interfaceC8020Arr) {
        interfaceC8020Arr.getClass();
        int iHashCode = (interfaceC8020.mo12941().hashCode() * 31) + Arrays.hashCode(interfaceC8020Arr);
        int iMo12939 = interfaceC8020.mo12939();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo12939 > 0)) {
                break;
            }
            int i2 = iMo12939 - 1;
            int i3 = i * 31;
            String strMo12941 = interfaceC8020.mo12942(interfaceC8020.mo12939() - iMo12939).mo12941();
            if (strMo12941 != null) {
                iHashCode2 = strMo12941.hashCode();
            }
            i = i3 + iHashCode2;
            iMo12939 = i2;
        }
        int iMo129392 = interfaceC8020.mo12939();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo129392 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMo129392 - 1;
            int i5 = iHashCode3 * 31;
            AbstractC9019 kind = interfaceC8020.mo12942(interfaceC8020.mo12939() - iMo129392).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iMo129392 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC8013 m12972(Class cls, InterfaceC8013... interfaceC8013Arr) {
        Object obj;
        InterfaceC8013 interfaceC8013;
        Field field;
        Object obj2;
        Object obj3;
        InterfaceC8013 interfaceC8013M12970;
        Field field2;
        if (cls.isEnum() && cls.getAnnotation(InterfaceC8010.class) == null && cls.getAnnotation(InterfaceC8012.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new C7938(canonicalName, (Enum[]) enumConstants);
        }
        InterfaceC8013[] interfaceC8013Arr2 = (InterfaceC8013[]) Arrays.copyOf(interfaceC8013Arr, interfaceC8013Arr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        InterfaceC8013 interfaceC8013M129702 = obj == null ? null : m12970(obj, (InterfaceC8013[]) Arrays.copyOf(interfaceC8013Arr2, interfaceC8013Arr2.length));
        if (interfaceC8013M129702 != null) {
            return interfaceC8013M129702;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 == null || AbstractC5971.m10698(canonicalName2, "java.", false) || AbstractC5971.m10698(canonicalName2, "kotlin.", false)) {
            interfaceC8013 = null;
        } else {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field3 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                } else {
                    Field field4 = declaredFields[i];
                    if (AbstractC5227.m9466(field4.getName(), "INSTANCE") && AbstractC5227.m9466(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field3 = field4;
                    }
                    i++;
                }
            }
            if (field3 != null) {
                Object obj4 = field3.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                    } else {
                        Method method2 = methods[i2];
                        if (AbstractC5227.m9466(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && AbstractC5227.m9466(method2.getReturnType(), InterfaceC8013.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i2++;
                    }
                }
                method = null;
                if (method != null) {
                    Object objInvoke = method.invoke(obj4, null);
                    if (objInvoke instanceof InterfaceC8013) {
                        interfaceC8013 = (InterfaceC8013) objInvoke;
                    }
                }
            }
        }
        if (interfaceC8013 != null) {
            return interfaceC8013;
        }
        InterfaceC8013[] interfaceC8013Arr3 = (InterfaceC8013[]) Arrays.copyOf(interfaceC8013Arr, interfaceC8013Arr.length);
        Field[] declaredFields2 = cls.getDeclaredFields();
        declaredFields2.getClass();
        int length3 = declaredFields2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                field = null;
                break;
            }
            field = declaredFields2[i3];
            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(InterfaceC7894.class) != null) {
                break;
            }
            i3++;
        }
        if (field == null) {
            obj2 = null;
        } else {
            try {
                field.setAccessible(true);
                obj2 = field.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (interfaceC8013M12970 = m12970(obj2, (InterfaceC8013[]) Arrays.copyOf(interfaceC8013Arr3, interfaceC8013Arr3.length))) == null) {
            try {
                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                declaredClasses.getClass();
                int length4 = declaredClasses.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses[i4];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (z3) {
                                break;
                            }
                            z3 = true;
                            cls2 = cls3;
                        }
                        i4++;
                    } else if (!z3) {
                    }
                }
                cls2 = null;
                obj3 = (cls2 == null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
            } catch (NoSuchFieldException unused3) {
            }
            interfaceC8013M12970 = obj3 instanceof InterfaceC8013 ? (InterfaceC8013) obj3 : null;
        }
        if (interfaceC8013M12970 != null) {
            return interfaceC8013M12970;
        }
        if (cls.getAnnotation(InterfaceC8012.class) == null) {
            InterfaceC8010 interfaceC8010 = (InterfaceC8010) cls.getAnnotation(InterfaceC8010.class);
            if (interfaceC8010 == null) {
                return null;
            }
            Class clsWith = interfaceC8010.with();
            C5229 c5229 = AbstractC5228.f13320;
            if (!c5229.mo9476(clsWith).equals(c5229.mo9476(C8011.class))) {
                return null;
            }
        }
        return new C8011(AbstractC5228.f13320.mo9476(cls));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final InterfaceC8020[] m12973(List list) {
        InterfaceC8020[] interfaceC8020Arr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (interfaceC8020Arr = (InterfaceC8020[]) list.toArray(new InterfaceC8020[0])) == null) ? f19449 : interfaceC8020Arr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set m12974(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (interfaceC8020 instanceof InterfaceC7949) {
            return ((InterfaceC7949) interfaceC8020).mo12964();
        }
        HashSet hashSet = new HashSet(interfaceC8020.mo12939());
        int iMo12939 = interfaceC8020.mo12939();
        for (int i = 0; i < iMo12939; i++) {
            hashSet.add(interfaceC8020.mo12938(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7917 m12975(String str, InterfaceC8013 interfaceC8013) {
        return new C7917(str, new C7916(interfaceC8013));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final String m12976(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        String simpleName = interfaceC5925.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return AbstractC0900.m718("Serializer for class '", simpleName, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final InterfaceC5925 m12977(InterfaceC5919 interfaceC5919) {
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        if (interfaceC5924Mo9458 instanceof InterfaceC5925) {
            return (InterfaceC5925) interfaceC5924Mo9458;
        }
        if (!(interfaceC5924Mo9458 instanceof AbstractC5226)) {
            C5043.m9163(interfaceC5924Mo9458, "Only KClass supported as classifier, got ");
            return null;
        }
        throw new IllegalArgumentException("Captured type parameter " + interfaceC5924Mo9458 + " from generic non-reified function. Such functionality cannot be supported because " + interfaceC5924Mo9458 + " is erased, either specify serializer explicitly or make calling function inline with reified " + interfaceC5924Mo9458 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final String m12978(InterfaceC8020 interfaceC8020) {
        return AbstractC5176.m9369(AbstractC3400.m5627(0, interfaceC8020.mo12939()), ", ", interfaceC8020.mo12941() + '(', ")", new C6886(interfaceC8020, 2), 24);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final void m12979(int i, int i2, InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(interfaceC8020.mo12938(i4));
            }
            i3 >>>= 1;
        }
        throw new MissingFieldException(arrayList, interfaceC8020.mo12941());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m12980(String str, InterfaceC5925 interfaceC5925) {
        String string;
        interfaceC5925.getClass();
        String str2 = "in the polymorphic scope of '" + interfaceC5925.getSimpleName() + '\'';
        if (str == null) {
            string = AbstractC7012.m12149(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbM12141 = AbstractC7012.m12141("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AbstractC7012.m12136(sbM12141, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM12141.append(interfaceC5925.getSimpleName());
            sbM12141.append("' has to be sealed and '@Serializable'.");
            string = sbM12141.toString();
        }
        throw new SerializationException(string);
    }
}
