package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0076;
import io.ktor.util.C4210;
import io.ktor.websocket.C4269;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C5175;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4393;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.InterfaceC4388;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.InterfaceC5086;
import kotlin.reflect.InterfaceC5091;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4409;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4461;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4476;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4494;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4498;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4430;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4440;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4429;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4451;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4614;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4634;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4754;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4767;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4746;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4748;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4752;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4755;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4756;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4758;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4763;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4770;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4822;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4832;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4801;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4869;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4881;
import kotlin.reflect.jvm.internal.types.AbstractC4925;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import p015.C6230;
import p045.C6461;
import p045.C6471;
import p046.InterfaceC6477;
import p046.InterfaceC6478;
import p046.InterfaceC6480;
import p049.AbstractC6526;
import p049.AbstractC6529;
import p052.InterfaceC6553;
import p053.AbstractC6560;
import p070.AbstractC6902;
import p070.C6905;
import p070.InterfaceC6907;
import p077.C6966;
import p077.C6971;
import p077.C6972;
import p079.AbstractC6988;
import p079.AbstractC7001;
import p079.C7005;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5066 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f14607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4686 f14608 = new C4686("kotlin.jvm.JvmStatic");

    static {
        StringBuilder sb = new StringBuilder();
        C6471 c6471 = C6471.f17758;
        sb.append(c6471.f17761.f13692.f13689);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(c6471.f17760);
        f14607 = sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC4480 m10056(Class cls, InterfaceC4801 interfaceC4801, GeneratedMessageLite.ExtendableMessage extendableMessage, InterfaceC6907 interfaceC6907, C6230 c6230, AbstractC6902 abstractC6902, InterfaceC6553 interfaceC6553) {
        List<ProtoBuf$TypeParameter> typeParameterList;
        cls.getClass();
        extendableMessage.getClass();
        interfaceC6907.getClass();
        abstractC6902.getClass();
        interfaceC6553.getClass();
        C6966 c6966M10055 = AbstractC5064.m10055(cls);
        if (extendableMessage instanceof ProtoBuf$Function) {
            typeParameterList = ((ProtoBuf$Function) extendableMessage).getTypeParameterList();
        } else {
            if (!(extendableMessage instanceof ProtoBuf$Property)) {
                C4210.m8602(extendableMessage, "Unsupported message: ");
                return null;
            }
            typeParameterList = ((ProtoBuf$Property) extendableMessage).getTypeParameterList();
        }
        List<ProtoBuf$TypeParameter> list = typeParameterList;
        C4832 c4832 = c6966M10055.f18661;
        InterfaceC4485 interfaceC4485 = c4832.f14087;
        C6905 c6905 = C6905.f18426;
        list.getClass();
        return (InterfaceC4480) interfaceC6553.invoke(new C4822(new C4823(c4832, interfaceC6907, interfaceC4485, c6230, c6905, abstractC6902, interfaceC4801, null, list)), extendableMessage);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object m10057(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    C5919.m11250("Parameter with void type is illegal");
                    return null;
                }
                C4210.m8606(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Class m10058(Class cls) {
        cls.getClass();
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List m10059(InterfaceC6478 interfaceC6478) {
        Annotation annotationM10067;
        interfaceC6478.getClass();
        InterfaceC6480<InterfaceC6477> annotations = interfaceC6478.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6477 interfaceC6477 : annotations) {
            InterfaceC4461 interfaceC4461Mo9187 = interfaceC6477.mo9187();
            if (interfaceC4461Mo9187 instanceof C6971) {
                annotationM10067 = ((C6971) interfaceC4461Mo9187).f18668;
            } else if (interfaceC4461Mo9187 instanceof C6972) {
                AbstractC4440 abstractC4440 = ((C6972) interfaceC4461Mo9187).f18669;
                C4429 c4429 = abstractC4440 instanceof C4429 ? (C4429) abstractC4440 : null;
                annotationM10067 = c4429 != null ? c4429.f13047 : null;
            } else {
                annotationM10067 = m10067(interfaceC6477);
            }
            if (annotationM10067 != null) {
                arrayList.add(annotationM10067);
            }
        }
        return m10062(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5074 m10060(Object obj) {
        if (obj instanceof AbstractC4974) {
            return m10060(((AbstractC4974) obj).m9966());
        }
        if (obj instanceof InterfaceC5074) {
            return (InterfaceC5074) obj;
        }
        if (obj instanceof PropertyReference) {
            InterfaceC5093 interfaceC5093Compute = ((PropertyReference) obj).compute();
            if (interfaceC5093Compute == obj) {
                interfaceC5093Compute = null;
            }
            if (interfaceC5093Compute != null) {
                return m10060(interfaceC5093Compute);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5063 m10061(InterfaceC5093 interfaceC5093) {
        if (interfaceC5093 instanceof AbstractC4974) {
            return m10061(((AbstractC4974) interfaceC5093).m9966());
        }
        if (interfaceC5093 instanceof InterfaceC5063) {
            return (InterfaceC5063) interfaceC5093;
        }
        if (interfaceC5093 instanceof CallableReference) {
            InterfaceC5093 interfaceC5093Compute = ((CallableReference) interfaceC5093).compute();
            if (interfaceC5093Compute == interfaceC5093) {
                interfaceC5093Compute = null;
            }
            if (interfaceC5093Compute != null) {
                return m10061(interfaceC5093Compute);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final List m10062(List list) throws IllegalAccessException, InvocationTargetException {
        List listM13660;
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC6560.m12029(AbstractC6560.m12033((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        InterfaceC5092 interfaceC5092M12033 = AbstractC6560.m12033(annotation);
                        Class clsM12029 = AbstractC6560.m12029(interfaceC5092M12033);
                        if (!clsM12029.getSimpleName().equals("Container") || clsM12029.getAnnotation(InterfaceC4388.class) == null) {
                            listM13660 = AbstractC8189.m13660(annotation);
                        } else {
                            Object objInvoke = AbstractC6560.m12029(interfaceC5092M12033).getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listM13660 = Arrays.asList((Annotation[]) objInvoke);
                            listM13660.getClass();
                        }
                        AbstractC4343.m8794(listM13660, arrayList);
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C4269 m10063(String str) {
        int iM10151;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (AbstractC5143.m10172("VZCBSIFJD", cCharAt)) {
                iM10151 = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                iM10151 = AbstractC5143.m10151(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, i, 4) + 1;
            }
            arrayList.add(str.substring(i, iM10151));
            i = iM10151;
        }
        return new C4269(arrayList, str.substring(i + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class m10064(ClassLoader classLoader, String str, int i, int i2) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            String strReplace = str.substring(i + 1, i2 - 1).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            strReplace.getClass();
            Class<?> clsLoadClass = classLoader.loadClass(strReplace);
            clsLoadClass.getClass();
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class cls = Void.TYPE;
            cls.getClass();
            return cls;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return m10058(m10064(classLoader, str, i + 1, i2));
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final Object m10065(AbstractC4767 abstractC4767, ClassLoader classLoader) {
        AbstractC4881 abstractC4881;
        Class clsM10071;
        if (abstractC4767 instanceof C4753) {
            return m10067((InterfaceC6477) ((C4753) abstractC4767).f13901);
        }
        int i = 0;
        if (abstractC4767 instanceof C4752) {
            C4752 c4752 = (C4752) abstractC4767;
            C4746 c4746 = c4752 instanceof C4746 ? (C4746) c4752 : null;
            if (c4746 != null && (abstractC4881 = c4746.f13890) != null) {
                Object obj = c4752.f13901;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC4344.m8832(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(m10065((AbstractC4767) it.next(), classLoader));
                }
                C4690 c4690 = AbstractC6529.f17924;
                InterfaceC4476 interfaceC4476Mo9221 = abstractC4881.mo9732().mo9221();
                PrimitiveType primitiveTypeM11980 = interfaceC4476Mo9221 == null ? null : AbstractC6529.m11980(interfaceC4476Mo9221);
                switch (primitiveTypeM11980 == null ? -1 : AbstractC5070.f14614[primitiveTypeM11980.ordinal()]) {
                    case -1:
                        if (!AbstractC6529.m11970(abstractC4881)) {
                            C4210.m8625(abstractC4881, "Not an array type: ");
                            return null;
                        }
                        AbstractC4881 abstractC4881Mo9751 = ((AbstractC4869) AbstractC4343.m8818(abstractC4881.mo9736())).mo9751();
                        abstractC4881Mo9751.getClass();
                        InterfaceC4476 interfaceC4476Mo92212 = abstractC4881Mo9751.mo9732().mo9221();
                        AbstractC6988 abstractC6988 = interfaceC4476Mo92212 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo92212 : null;
                        if (abstractC6988 == null) {
                            C4210.m8602(abstractC4881Mo9751, "Not a class type: ");
                            return null;
                        }
                        if (AbstractC6529.m11973(abstractC4881Mo9751)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                obj2.getClass();
                                strArr[i] = obj2;
                                i++;
                            }
                            return strArr;
                        }
                        if (AbstractC6529.m11976(abstractC6988, AbstractC6526.f17863)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj3 = arrayList.get(i);
                                obj3.getClass();
                                clsArr[i] = obj3;
                                i++;
                            }
                            return clsArr;
                        }
                        C4687 c4687M9508 = AbstractC4772.m9508(abstractC6988);
                        if (c4687M9508 != null && (clsM10071 = m10071(classLoader, c4687M9508, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsM10071, ((List) obj).size());
                            objNewInstance.getClass();
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        C4210.m8621();
                        return null;
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj4 = arrayList.get(i);
                            obj4.getClass();
                            zArr[i] = ((Boolean) obj4).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj5 = arrayList.get(i);
                            obj5.getClass();
                            cArr[i] = ((Character) obj5).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj6 = arrayList.get(i);
                            obj6.getClass();
                            bArr[i] = ((Byte) obj6).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj7 = arrayList.get(i);
                            obj7.getClass();
                            sArr[i] = ((Short) obj7).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj8 = arrayList.get(i);
                            obj8.getClass();
                            iArr[i] = ((Integer) obj8).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj9 = arrayList.get(i);
                            obj9.getClass();
                            fArr[i] = ((Float) obj9).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj10 = arrayList.get(i);
                            obj10.getClass();
                            jArr[i] = ((Long) obj10).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj11 = arrayList.get(i);
                            obj11.getClass();
                            dArr[i] = ((Double) obj11).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (abstractC4767 instanceof C4770) {
            Pair pair = (Pair) ((C4770) abstractC4767).f13901;
            C4687 c4687 = (C4687) pair.component1();
            C4690 c46902 = (C4690) pair.component2();
            Class clsM100712 = m10071(classLoader, c4687, 0);
            if (clsM100712 != null) {
                return Enum.valueOf(clsM100712, c46902.m9345());
            }
        } else {
            if (!(abstractC4767 instanceof C4758)) {
                if ((abstractC4767 instanceof C4771) || (abstractC4767 instanceof C4756)) {
                    return null;
                }
                return abstractC4767.mo9507();
            }
            AbstractC4754 abstractC4754 = (AbstractC4754) ((C4758) abstractC4767).f13901;
            if (abstractC4754 instanceof C4755) {
                C4748 c4748 = ((C4755) abstractC4754).f13895;
                return m10071(classLoader, c4748.f13892, c4748.f13891);
            }
            if (!(abstractC4754 instanceof C4763)) {
                C4210.m8621();
                return null;
            }
            InterfaceC4476 interfaceC4476Mo92213 = ((C4763) abstractC4754).f13898.mo9732().mo9221();
            AbstractC6988 abstractC69882 = interfaceC4476Mo92213 instanceof AbstractC6988 ? (AbstractC6988) interfaceC4476Mo92213 : null;
            if (abstractC69882 != null) {
                return m10068(abstractC69882);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final InterfaceC5086 m10066(InterfaceC5086 interfaceC5086) {
        interfaceC5086.getClass();
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        C5003 c5003 = interfaceC5091Mo8909 instanceof C5003 ? (C5003) interfaceC5091Mo8909 : null;
        if (c5003 != null) {
            return (InterfaceC5086) ((C5044) c5003.f14423.getValue()).f14545.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Annotation m10067(InterfaceC6477 interfaceC6477) {
        AbstractC6988 abstractC6988M9510 = AbstractC4772.m9510(interfaceC6477);
        Class clsM10068 = abstractC6988M9510 != null ? m10068(abstractC6988M9510) : null;
        if (clsM10068 == null) {
            clsM10068 = null;
        }
        if (clsM10068 == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC6477.mo9186().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            C4690 c4690 = (C4690) entry.getKey();
            AbstractC4767 abstractC4767 = (AbstractC4767) entry.getValue();
            ClassLoader classLoader = clsM10068.getClassLoader();
            classLoader.getClass();
            Object objM10065 = m10065(abstractC4767, classLoader);
            Pair pair = objM10065 != null ? new Pair(c4690.m9345(), objM10065) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) AbstractC5061.m10047(clsM10068, AbstractC4338.m8783(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Class m10068(AbstractC6988 abstractC6988) {
        InterfaceC4461 interfaceC4461Mo9036 = abstractC6988.mo9036();
        interfaceC4461Mo9036.getClass();
        if (interfaceC4461Mo9036 instanceof C4634) {
            return ((C4634) interfaceC4461Mo9036).f13550.f18666;
        }
        if (interfaceC4461Mo9036 instanceof C6972) {
            AbstractC4440 abstractC4440 = ((C6972) interfaceC4461Mo9036).f18669;
            abstractC4440.getClass();
            return ((C4451) abstractC4440).f13079;
        }
        C4687 c4687M9508 = AbstractC4772.m9508(abstractC6988);
        if (c4687M9508 == null) {
            return null;
        }
        return m10071(AbstractC4430.m8984(abstractC6988.getClass()), c4687M9508, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m10069(InterfaceC5086 interfaceC5086) {
        interfaceC5086.getClass();
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        C5003 c5003 = interfaceC5091Mo8909 instanceof C5003 ? (C5003) interfaceC5091Mo8909 : null;
        return c5003 != null && c5003.mo8894();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C7005 m10070(AbstractC5023 abstractC5023) {
        abstractC5023.getClass();
        C7005 c7005 = abstractC5023.f14487.f14579;
        if (c7005 != null) {
            return c7005;
        }
        InterfaceC4479 interfaceC4479Mo9945 = abstractC5023.mo9945();
        if (interfaceC4479Mo9945 instanceof InterfaceC4494) {
            return ((AbstractC7001) ((InterfaceC4494) interfaceC4479Mo9945)).f18779;
        }
        if (interfaceC4479Mo9945.mo9044() == null) {
            return null;
        }
        InterfaceC4498 interfaceC4498Mo9038 = interfaceC4479Mo9945.mo9038();
        interfaceC4498Mo9038.getClass();
        return ((AbstractC6988) interfaceC4498Mo9038).mo12280();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class m10071(ClassLoader classLoader, C4687 c4687, int i) {
        c4687.getClass();
        C4685 c4685 = c4687.m9337().f13692;
        String str = c4685.f13689;
        Integer numM10136 = AbstractC5138.m10136(AbstractC5143.m10139(str, f14607, str));
        if (numM10136 != null) {
            int iIntValue = numM10136.intValue();
            C6461 c6461 = C6461.f17738;
            return m10071(classLoader, new C4687(c6461.f17761, c6461.m11949(iIntValue + 1)), i);
        }
        String str2 = C4409.f12983;
        C4687 c4687M8955 = C4409.m8955(c4685);
        if (c4687M8955 == null) {
            c4687M8955 = c4687;
        }
        if (!c4687M8955.equals(c4687)) {
            classLoader = AbstractC4430.m8984(C5175.class);
        }
        String str3 = c4687M8955.f13695.f13692.f13689;
        String str4 = c4687M8955.f13694.f13692.f13689;
        if (AbstractC4394.m8917(str3, "kotlin")) {
            switch (str4.hashCode()) {
                case -901856463:
                    if (str4.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str4.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str4.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str4.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str4.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str4.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str4.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str4.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str4.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str3.length() > 0) {
            sb.append(str3.concat("."));
        }
        sb.append(AbstractC5138.m10129(str4, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$'));
        if (i > 0) {
            sb.append(";");
        }
        try {
            return Class.forName(sb.toString(), false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C0076 m10072(ClassLoader classLoader, String str, boolean z) {
        Class clsM10064;
        str.getClass();
        C4269 c4269M10063 = m10063(str);
        ArrayList<String> arrayList = c4269M10063.f12812;
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(m10064(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = c4269M10063.f12811;
            clsM10064 = m10064(classLoader, str3, 0, str3.length());
        } else {
            clsM10064 = null;
        }
        return new C0076(arrayList2, 25, clsM10064);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m10073(InterfaceC5092 interfaceC5092) {
        Method declaredMethod;
        Class<?> componentType;
        Annotation annotation;
        Object objInvoke;
        Class clsM12029 = AbstractC6560.m12029(interfaceC5092);
        try {
            declaredMethod = clsM12029.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        if (declaredMethod != null && (componentType = declaredMethod.getReturnType().getComponentType()) != null && componentType.isAnnotation()) {
            Annotation[] annotations = componentType.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (AbstractC6560.m12029(AbstractC6560.m12033(annotation)).getName().equals(AbstractC4614.f13490.f13692.f13689)) {
                    break;
                }
                i++;
            }
            if (annotation != null && (objInvoke = AbstractC6560.m12029(AbstractC6560.m12033(annotation)).getMethod("value", null).invoke(annotation, null)) != null) {
                return clsM12029.equals(objInvoke);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m10074(InterfaceC5086 interfaceC5086) {
        interfaceC5086.getClass();
        if (interfaceC5086.mo8906()) {
            return true;
        }
        AbstractC4925 abstractC4925 = (AbstractC4925) interfaceC5086;
        AbstractC4925 abstractC4925Mo9916 = abstractC4925.mo9916();
        if (abstractC4925Mo9916 != null && m10074(abstractC4925Mo9916)) {
            return true;
        }
        if (abstractC4925.mo9925()) {
            return false;
        }
        InterfaceC5091 interfaceC5091Mo8909 = interfaceC5086.mo8909();
        if (!(interfaceC5091Mo8909 instanceof AbstractC4393)) {
            return false;
        }
        List upperBounds = ((AbstractC4393) interfaceC5091Mo8909).getUpperBounds();
        if (upperBounds.isEmpty()) {
            return false;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (m10074((InterfaceC5086) it.next())) {
                return true;
            }
        }
        return false;
    }
}
