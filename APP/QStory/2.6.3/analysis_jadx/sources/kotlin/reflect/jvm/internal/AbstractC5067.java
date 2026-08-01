package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0076;
import com.bumptech.glide.AbstractC3057;
import io.ktor.util.C4211;
import io.ktor.websocket.C4270;
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
import kotlin.C5176;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.InterfaceC4389;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.InterfaceC5094;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C4410;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4462;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4477;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4481;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4486;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4495;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4499;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4431;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4441;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4430;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4452;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC4615;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4635;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4755;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC4768;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4747;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4749;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4753;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4754;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4756;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4757;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4759;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4764;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4771;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C4772;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4823;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4824;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C4833;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC4802;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4870;
import kotlin.reflect.jvm.internal.impl.types.AbstractC4882;
import kotlin.reflect.jvm.internal.types.AbstractC4926;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import p007.C6157;
import p034.AbstractC6347;
import p045.C6462;
import p045.C6472;
import p046.InterfaceC6478;
import p046.InterfaceC6479;
import p046.InterfaceC6481;
import p049.AbstractC6527;
import p049.AbstractC6530;
import p052.InterfaceC6554;
import p070.AbstractC6903;
import p070.C6906;
import p070.InterfaceC6908;
import p077.C6967;
import p077.C6972;
import p077.C6973;
import p079.AbstractC6989;
import p079.AbstractC7002;
import p079.C7006;
import p316.C8667;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5067 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f14607;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4687 f14608 = new C4687("kotlin.jvm.JvmStatic");

    static {
        StringBuilder sb = new StringBuilder();
        C6472 c6472 = C6472.f17754;
        sb.append(c6472.f17757.f13696.f13693);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(c6472.f17756);
        f14607 = sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC4481 m10060(Class cls, InterfaceC4802 interfaceC4802, GeneratedMessageLite.ExtendableMessage extendableMessage, InterfaceC6908 interfaceC6908, C6157 c6157, AbstractC6903 abstractC6903, InterfaceC6554 interfaceC6554) {
        List<ProtoBuf$TypeParameter> typeParameterList;
        cls.getClass();
        extendableMessage.getClass();
        interfaceC6908.getClass();
        abstractC6903.getClass();
        interfaceC6554.getClass();
        C6967 c6967M10059 = AbstractC5065.m10059(cls);
        if (extendableMessage instanceof ProtoBuf$Function) {
            typeParameterList = ((ProtoBuf$Function) extendableMessage).getTypeParameterList();
        } else {
            if (!(extendableMessage instanceof ProtoBuf$Property)) {
                C4211.m8592(extendableMessage, "Unsupported message: ");
                return null;
            }
            typeParameterList = ((ProtoBuf$Property) extendableMessage).getTypeParameterList();
        }
        List<ProtoBuf$TypeParameter> list = typeParameterList;
        C4833 c4833 = c6967M10059.f18656;
        InterfaceC4486 interfaceC4486 = c4833.f14091;
        C6906 c6906 = C6906.f18421;
        list.getClass();
        return (InterfaceC4481) interfaceC6554.invoke(new C4823(new C4824(c4833, interfaceC6908, interfaceC4486, c6157, c6906, abstractC6903, interfaceC4802, null, list)), extendableMessage);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object m10061(Type type) {
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
                    C5925.m11311("Parameter with void type is illegal");
                    return null;
                }
                C4211.m8596(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Class m10062(Class cls) {
        cls.getClass();
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List m10063(InterfaceC6479 interfaceC6479) {
        Annotation annotationM10071;
        interfaceC6479.getClass();
        InterfaceC6481<InterfaceC6478> annotations = interfaceC6479.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC6478 interfaceC6478 : annotations) {
            InterfaceC4462 interfaceC4462Mo9177 = interfaceC6478.mo9177();
            if (interfaceC4462Mo9177 instanceof C6972) {
                annotationM10071 = ((C6972) interfaceC4462Mo9177).f18663;
            } else if (interfaceC4462Mo9177 instanceof C6973) {
                AbstractC4441 abstractC4441 = ((C6973) interfaceC4462Mo9177).f18664;
                C4430 c4430 = abstractC4441 instanceof C4430 ? (C4430) abstractC4441 : null;
                annotationM10071 = c4430 != null ? c4430.f13051 : null;
            } else {
                annotationM10071 = m10071(interfaceC6478);
            }
            if (annotationM10071 != null) {
                arrayList.add(annotationM10071);
            }
        }
        return m10066(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5075 m10064(Object obj) {
        if (obj instanceof AbstractC4975) {
            return m10064(((AbstractC4975) obj).m9963());
        }
        if (obj instanceof InterfaceC5075) {
            return (InterfaceC5075) obj;
        }
        if (obj instanceof PropertyReference) {
            InterfaceC5094 interfaceC5094Compute = ((PropertyReference) obj).compute();
            if (interfaceC5094Compute == obj) {
                interfaceC5094Compute = null;
            }
            if (interfaceC5094Compute != null) {
                return m10064(interfaceC5094Compute);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5064 m10065(InterfaceC5094 interfaceC5094) {
        if (interfaceC5094 instanceof AbstractC4975) {
            return m10065(((AbstractC4975) interfaceC5094).m9963());
        }
        if (interfaceC5094 instanceof InterfaceC5064) {
            return (InterfaceC5064) interfaceC5094;
        }
        if (interfaceC5094 instanceof CallableReference) {
            InterfaceC5094 interfaceC5094Compute = ((CallableReference) interfaceC5094).compute();
            if (interfaceC5094Compute == interfaceC5094) {
                interfaceC5094Compute = null;
            }
            if (interfaceC5094Compute != null) {
                return m10065(interfaceC5094Compute);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final List m10066(List list) throws IllegalAccessException, InvocationTargetException {
        List listM11928;
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC3057.m6756(AbstractC3057.m6759((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        InterfaceC5093 interfaceC5093M6759 = AbstractC3057.m6759(annotation);
                        Class clsM6756 = AbstractC3057.m6756(interfaceC5093M6759);
                        if (!clsM6756.getSimpleName().equals("Container") || clsM6756.getAnnotation(InterfaceC4389.class) == null) {
                            listM11928 = AbstractC6347.m11928(annotation);
                        } else {
                            Object objInvoke = AbstractC3057.m6756(interfaceC5093M6759).getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listM11928 = Arrays.asList((Annotation[]) objInvoke);
                            listM11928.getClass();
                        }
                        AbstractC4344.m8804(listM11928, arrayList);
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C4270 m10067(String str) {
        int iM10171;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (AbstractC5144.m10163("VZCBSIFJD", cCharAt)) {
                iM10171 = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                iM10171 = AbstractC5144.m10171(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, i, 4) + 1;
            }
            arrayList.add(str.substring(i, iM10171));
            i = iM10171;
        }
        return new C4270(arrayList, str.substring(i + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class m10068(ClassLoader classLoader, String str, int i, int i2) throws ClassNotFoundException {
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
            return m10062(m10068(classLoader, str, i + 1, i2));
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
    public static final Object m10069(AbstractC4768 abstractC4768, ClassLoader classLoader) {
        AbstractC4882 abstractC4882;
        Class clsM10075;
        if (abstractC4768 instanceof C4754) {
            return m10071((InterfaceC6478) ((C4754) abstractC4768).f13905);
        }
        int i = 0;
        if (abstractC4768 instanceof C4753) {
            C4753 c4753 = (C4753) abstractC4768;
            C4747 c4747 = c4753 instanceof C4747 ? (C4747) c4753 : null;
            if (c4747 != null && (abstractC4882 = c4747.f13894) != null) {
                Object obj = c4753.f13905;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC4345.m8822(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(m10069((AbstractC4768) it.next(), classLoader));
                }
                C4691 c4691 = AbstractC6530.f17920;
                InterfaceC4477 interfaceC4477Mo9211 = abstractC4882.mo9722().mo9211();
                PrimitiveType primitiveTypeM12023 = interfaceC4477Mo9211 == null ? null : AbstractC6530.m12023(interfaceC4477Mo9211);
                switch (primitiveTypeM12023 == null ? -1 : AbstractC5071.f14614[primitiveTypeM12023.ordinal()]) {
                    case -1:
                        if (!AbstractC6530.m12013(abstractC4882)) {
                            C4211.m8615(abstractC4882, "Not an array type: ");
                            return null;
                        }
                        AbstractC4882 abstractC4882Mo9741 = ((AbstractC4870) AbstractC4344.m8779(abstractC4882.mo9726())).mo9741();
                        abstractC4882Mo9741.getClass();
                        InterfaceC4477 interfaceC4477Mo92112 = abstractC4882Mo9741.mo9722().mo9211();
                        AbstractC6989 abstractC6989 = interfaceC4477Mo92112 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo92112 : null;
                        if (abstractC6989 == null) {
                            C4211.m8592(abstractC4882Mo9741, "Not a class type: ");
                            return null;
                        }
                        if (AbstractC6530.m12016(abstractC4882Mo9741)) {
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
                        if (AbstractC6530.m12019(abstractC6989, AbstractC6527.f17859)) {
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
                        C4688 c4688M9498 = AbstractC4773.m9498(abstractC6989);
                        if (c4688M9498 != null && (clsM10075 = m10075(classLoader, c4688M9498, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsM10075, ((List) obj).size());
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
                        C4211.m8611();
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
        } else if (abstractC4768 instanceof C4771) {
            Pair pair = (Pair) ((C4771) abstractC4768).f13905;
            C4688 c4688 = (C4688) pair.component1();
            C4691 c46912 = (C4691) pair.component2();
            Class clsM100752 = m10075(classLoader, c4688, 0);
            if (clsM100752 != null) {
                return Enum.valueOf(clsM100752, c46912.m9335());
            }
        } else {
            if (!(abstractC4768 instanceof C4759)) {
                if ((abstractC4768 instanceof C4772) || (abstractC4768 instanceof C4757)) {
                    return null;
                }
                return abstractC4768.mo9497();
            }
            AbstractC4755 abstractC4755 = (AbstractC4755) ((C4759) abstractC4768).f13905;
            if (abstractC4755 instanceof C4756) {
                C4749 c4749 = ((C4756) abstractC4755).f13899;
                return m10075(classLoader, c4749.f13896, c4749.f13895);
            }
            if (!(abstractC4755 instanceof C4764)) {
                C4211.m8611();
                return null;
            }
            InterfaceC4477 interfaceC4477Mo92113 = ((C4764) abstractC4755).f13902.mo9722().mo9211();
            AbstractC6989 abstractC69892 = interfaceC4477Mo92113 instanceof AbstractC6989 ? (AbstractC6989) interfaceC4477Mo92113 : null;
            if (abstractC69892 != null) {
                return m10072(abstractC69892);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final InterfaceC5087 m10070(InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5087.mo8899();
        C5004 c5004 = interfaceC5092Mo8899 instanceof C5004 ? (C5004) interfaceC5092Mo8899 : null;
        if (c5004 != null) {
            return (InterfaceC5087) ((C5045) c5004.f14425.getValue()).f14547.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Annotation m10071(InterfaceC6478 interfaceC6478) {
        AbstractC6989 abstractC6989M9500 = AbstractC4773.m9500(interfaceC6478);
        Class clsM10072 = abstractC6989M9500 != null ? m10072(abstractC6989M9500) : null;
        if (clsM10072 == null) {
            clsM10072 = null;
        }
        if (clsM10072 == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC6478.mo9176().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            C4691 c4691 = (C4691) entry.getKey();
            AbstractC4768 abstractC4768 = (AbstractC4768) entry.getValue();
            ClassLoader classLoader = clsM10072.getClassLoader();
            classLoader.getClass();
            Object objM10069 = m10069(abstractC4768, classLoader);
            Pair pair = objM10069 != null ? new Pair(c4691.m9335(), objM10069) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) C8667.m14380(clsM10072, AbstractC4339.m8771(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Class m10072(AbstractC6989 abstractC6989) {
        InterfaceC4462 interfaceC4462Mo9026 = abstractC6989.mo9026();
        interfaceC4462Mo9026.getClass();
        if (interfaceC4462Mo9026 instanceof C4635) {
            return ((C4635) interfaceC4462Mo9026).f13554.f18661;
        }
        if (interfaceC4462Mo9026 instanceof C6973) {
            AbstractC4441 abstractC4441 = ((C6973) interfaceC4462Mo9026).f18664;
            abstractC4441.getClass();
            return ((C4452) abstractC4441).f13083;
        }
        C4688 c4688M9498 = AbstractC4773.m9498(abstractC6989);
        if (c4688M9498 == null) {
            return null;
        }
        return m10075(AbstractC4431.m8974(abstractC6989.getClass()), c4688M9498, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m10073(InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5087.mo8899();
        C5004 c5004 = interfaceC5092Mo8899 instanceof C5004 ? (C5004) interfaceC5092Mo8899 : null;
        return c5004 != null && c5004.mo8884();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C7006 m10074(AbstractC5024 abstractC5024) {
        abstractC5024.getClass();
        C7006 c7006 = abstractC5024.f14489.f14581;
        if (c7006 != null) {
            return c7006;
        }
        InterfaceC4480 interfaceC4480Mo9942 = abstractC5024.mo9942();
        if (interfaceC4480Mo9942 instanceof InterfaceC4495) {
            return ((AbstractC7002) ((InterfaceC4495) interfaceC4480Mo9942)).f18774;
        }
        if (interfaceC4480Mo9942.mo9034() == null) {
            return null;
        }
        InterfaceC4499 interfaceC4499Mo9028 = interfaceC4480Mo9942.mo9028();
        interfaceC4499Mo9028.getClass();
        return ((AbstractC6989) interfaceC4499Mo9028).mo12307();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class m10075(ClassLoader classLoader, C4688 c4688, int i) {
        c4688.getClass();
        C4686 c4686 = c4688.m9327().f13696;
        String str = c4686.f13693;
        Integer numM10140 = AbstractC5139.m10140(AbstractC5144.m10141(str, f14607, str));
        if (numM10140 != null) {
            int iIntValue = numM10140.intValue();
            C6462 c6462 = C6462.f17734;
            return m10075(classLoader, new C4688(c6462.f17757, c6462.m11992(iIntValue + 1)), i);
        }
        String str2 = C4410.f12987;
        C4688 c4688M8945 = C4410.m8945(c4686);
        if (c4688M8945 == null) {
            c4688M8945 = c4688;
        }
        if (!c4688M8945.equals(c4688)) {
            classLoader = AbstractC4431.m8974(C5176.class);
        }
        String str3 = c4688M8945.f13699.f13696.f13693;
        String str4 = c4688M8945.f13698.f13696.f13693;
        if (AbstractC4395.m8907(str3, "kotlin")) {
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
        sb.append(AbstractC5139.m10129(str4, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$'));
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
    public static final C0076 m10076(ClassLoader classLoader, String str, boolean z) {
        Class clsM10068;
        str.getClass();
        C4270 c4270M10067 = m10067(str);
        ArrayList<String> arrayList = c4270M10067.f12816;
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(m10068(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = c4270M10067.f12815;
            clsM10068 = m10068(classLoader, str3, 0, str3.length());
        } else {
            clsM10068 = null;
        }
        return new C0076(arrayList2, 25, clsM10068);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m10077(InterfaceC5093 interfaceC5093) {
        Method declaredMethod;
        Class<?> componentType;
        Annotation annotation;
        Object objInvoke;
        Class clsM6756 = AbstractC3057.m6756(interfaceC5093);
        try {
            declaredMethod = clsM6756.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
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
                if (AbstractC3057.m6756(AbstractC3057.m6759(annotation)).getName().equals(AbstractC4615.f13494.f13696.f13693)) {
                    break;
                }
                i++;
            }
            if (annotation != null && (objInvoke = AbstractC3057.m6756(AbstractC3057.m6759(annotation)).getMethod("value", null).invoke(annotation, null)) != null) {
                return clsM6756.equals(objInvoke);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m10078(InterfaceC5087 interfaceC5087) {
        interfaceC5087.getClass();
        if (interfaceC5087.mo8896()) {
            return true;
        }
        AbstractC4926 abstractC4926 = (AbstractC4926) interfaceC5087;
        AbstractC4926 abstractC4926Mo9913 = abstractC4926.mo9913();
        if (abstractC4926Mo9913 != null && m10078(abstractC4926Mo9913)) {
            return true;
        }
        if (abstractC4926.mo9922()) {
            return false;
        }
        InterfaceC5092 interfaceC5092Mo8899 = interfaceC5087.mo8899();
        if (!(interfaceC5092Mo8899 instanceof AbstractC4394)) {
            return false;
        }
        List upperBounds = ((AbstractC4394) interfaceC5092Mo8899).getUpperBounds();
        if (upperBounds.isEmpty()) {
            return false;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (m10078((InterfaceC5087) it.next())) {
                return true;
            }
        }
        return false;
    }
}
