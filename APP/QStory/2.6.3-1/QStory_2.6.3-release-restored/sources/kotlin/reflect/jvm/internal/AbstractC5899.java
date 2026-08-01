package kotlin.reflect.jvm.internal;

import androidx.appcompat.app.C0923;
import com.bumptech.glide.AbstractC3889;
import io.ktor.util.C5043;
import io.ktor.websocket.C5102;
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
import kotlin.C6008;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.jvm.internal.AbstractC5226;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.InterfaceC5221;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5924;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.InterfaceC5926;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.C5242;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5309;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5313;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5327;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5273;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5262;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5284;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5447;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5467;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5587;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AbstractC5600;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5579;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5581;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5585;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5586;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5588;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5589;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5591;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5596;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5603;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C5604;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5655;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5656;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.InterfaceC5634;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5702;
import kotlin.reflect.jvm.internal.impl.types.AbstractC5714;
import kotlin.reflect.jvm.internal.types.AbstractC5758;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p023.C6986;
import p050.AbstractC7176;
import p061.C7291;
import p061.C7301;
import p062.InterfaceC7307;
import p062.InterfaceC7308;
import p062.InterfaceC7310;
import p065.AbstractC7356;
import p065.AbstractC7359;
import p068.InterfaceC7383;
import p086.AbstractC7732;
import p086.C7735;
import p086.InterfaceC7737;
import p093.C7796;
import p093.C7801;
import p093.C7802;
import p095.AbstractC7818;
import p095.AbstractC7831;
import p095.C7835;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f14952;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5519 f14953 = new C5519("kotlin.jvm.JvmStatic");

    static {
        StringBuilder sb = new StringBuilder();
        C7301 c7301 = C7301.f18099;
        sb.append(c7301.f18102.f14041.f14038);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(c7301.f18101);
        f14952 = sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final InterfaceC5313 m10619(Class cls, InterfaceC5634 interfaceC5634, GeneratedMessageLite.ExtendableMessage extendableMessage, InterfaceC7737 interfaceC7737, C6986 c6986, AbstractC7732 abstractC7732, InterfaceC7383 interfaceC7383) {
        List<ProtoBuf$TypeParameter> typeParameterList;
        cls.getClass();
        extendableMessage.getClass();
        interfaceC7737.getClass();
        abstractC7732.getClass();
        interfaceC7383.getClass();
        C7796 c7796M10618 = AbstractC5897.m10618(cls);
        if (extendableMessage instanceof ProtoBuf$Function) {
            typeParameterList = ((ProtoBuf$Function) extendableMessage).getTypeParameterList();
        } else {
            if (!(extendableMessage instanceof ProtoBuf$Property)) {
                C5043.m9151(extendableMessage, "Unsupported message: ");
                return null;
            }
            typeParameterList = ((ProtoBuf$Property) extendableMessage).getTypeParameterList();
        }
        List<ProtoBuf$TypeParameter> list = typeParameterList;
        C5665 c5665 = c7796M10618.f19001;
        InterfaceC5318 interfaceC5318 = c5665.f14436;
        C7735 c7735 = C7735.f18766;
        list.getClass();
        return (InterfaceC5313) interfaceC7383.invoke(new C5655(new C5656(c5665, interfaceC7737, interfaceC5318, c6986, c7735, abstractC7732, interfaceC5634, null, list)), extendableMessage);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Object m10620(Type type) {
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
                    C6755.m11870("Parameter with void type is illegal");
                    return null;
                }
                C5043.m9155(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Class m10621(Class cls) {
        cls.getClass();
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List m10622(InterfaceC7308 interfaceC7308) {
        Annotation annotationM10630;
        interfaceC7308.getClass();
        InterfaceC7310<InterfaceC7307> annotations = interfaceC7308.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC7307 interfaceC7307 : annotations) {
            InterfaceC5294 interfaceC5294Mo9736 = interfaceC7307.mo9736();
            if (interfaceC5294Mo9736 instanceof C7801) {
                annotationM10630 = ((C7801) interfaceC5294Mo9736).f19008;
            } else if (interfaceC5294Mo9736 instanceof C7802) {
                AbstractC5273 abstractC5273 = ((C7802) interfaceC5294Mo9736).f19009;
                C5262 c5262 = abstractC5273 instanceof C5262 ? (C5262) abstractC5273 : null;
                annotationM10630 = c5262 != null ? c5262.f13396 : null;
            } else {
                annotationM10630 = m10630(interfaceC7307);
            }
            if (annotationM10630 != null) {
                arrayList.add(annotationM10630);
            }
        }
        return m10625(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5907 m10623(Object obj) {
        if (obj instanceof AbstractC5807) {
            return m10623(((AbstractC5807) obj).m10522());
        }
        if (obj instanceof InterfaceC5907) {
            return (InterfaceC5907) obj;
        }
        if (obj instanceof PropertyReference) {
            InterfaceC5926 interfaceC5926Compute = ((PropertyReference) obj).compute();
            if (interfaceC5926Compute == obj) {
                interfaceC5926Compute = null;
            }
            if (interfaceC5926Compute != null) {
                return m10623(interfaceC5926Compute);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5896 m10624(InterfaceC5926 interfaceC5926) {
        if (interfaceC5926 instanceof AbstractC5807) {
            return m10624(((AbstractC5807) interfaceC5926).m10522());
        }
        if (interfaceC5926 instanceof InterfaceC5896) {
            return (InterfaceC5896) interfaceC5926;
        }
        if (interfaceC5926 instanceof CallableReference) {
            InterfaceC5926 interfaceC5926Compute = ((CallableReference) interfaceC5926).compute();
            if (interfaceC5926Compute == interfaceC5926) {
                interfaceC5926Compute = null;
            }
            if (interfaceC5926Compute != null) {
                return m10624(interfaceC5926Compute);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final List m10625(List list) throws IllegalAccessException, InvocationTargetException {
        List listM12487;
        list.getClass();
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AbstractC3889.m7316(AbstractC3889.m7319((Annotation) it.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Annotation annotation = (Annotation) it2.next();
                        InterfaceC5925 interfaceC5925M7319 = AbstractC3889.m7319(annotation);
                        Class clsM7316 = AbstractC3889.m7316(interfaceC5925M7319);
                        if (!clsM7316.getSimpleName().equals("Container") || clsM7316.getAnnotation(InterfaceC5221.class) == null) {
                            listM12487 = AbstractC7176.m12487(annotation);
                        } else {
                            Object objInvoke = AbstractC3889.m7316(interfaceC5925M7319).getDeclaredMethod("value", null).invoke(annotation, null);
                            objInvoke.getClass();
                            listM12487 = Arrays.asList((Annotation[]) objInvoke);
                            listM12487.getClass();
                        }
                        AbstractC5176.m9363(listM12487, arrayList);
                    }
                    return arrayList;
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C5102 m10626(String str) {
        int iM10730;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (AbstractC5976.m10722("VZCBSIFJD", cCharAt)) {
                iM10730 = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                iM10730 = AbstractC5976.m10730(str, TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER, i, 4) + 1;
            }
            arrayList.add(str.substring(i, iM10730));
            i = iM10730;
        }
        return new C5102(arrayList, str.substring(i + 1));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Class m10627(ClassLoader classLoader, String str, int i, int i2) throws ClassNotFoundException {
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
            return m10621(m10627(classLoader, str, i + 1, i2));
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
    public static final Object m10628(AbstractC5600 abstractC5600, ClassLoader classLoader) {
        AbstractC5714 abstractC5714;
        Class clsM10634;
        if (abstractC5600 instanceof C5586) {
            return m10630((InterfaceC7307) ((C5586) abstractC5600).f14250);
        }
        int i = 0;
        if (abstractC5600 instanceof C5585) {
            C5585 c5585 = (C5585) abstractC5600;
            C5579 c5579 = c5585 instanceof C5579 ? (C5579) c5585 : null;
            if (c5579 != null && (abstractC5714 = c5579.f14239) != null) {
                Object obj = c5585.f14250;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(m10628((AbstractC5600) it.next(), classLoader));
                }
                C5523 c5523 = AbstractC7359.f18265;
                InterfaceC5309 interfaceC5309Mo9770 = abstractC5714.mo10281().mo9770();
                PrimitiveType primitiveTypeM12582 = interfaceC5309Mo9770 == null ? null : AbstractC7359.m12582(interfaceC5309Mo9770);
                switch (primitiveTypeM12582 == null ? -1 : AbstractC5903.f14959[primitiveTypeM12582.ordinal()]) {
                    case -1:
                        if (!AbstractC7359.m12572(abstractC5714)) {
                            C5043.m9174(abstractC5714, "Not an array type: ");
                            return null;
                        }
                        AbstractC5714 abstractC5714Mo10300 = ((AbstractC5702) AbstractC5176.m9338(abstractC5714.mo10285())).mo10300();
                        abstractC5714Mo10300.getClass();
                        InterfaceC5309 interfaceC5309Mo97702 = abstractC5714Mo10300.mo10281().mo9770();
                        AbstractC7818 abstractC7818 = interfaceC5309Mo97702 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo97702 : null;
                        if (abstractC7818 == null) {
                            C5043.m9151(abstractC5714Mo10300, "Not a class type: ");
                            return null;
                        }
                        if (AbstractC7359.m12575(abstractC5714Mo10300)) {
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
                        if (AbstractC7359.m12578(abstractC7818, AbstractC7356.f18204)) {
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
                        C5520 c5520M10057 = AbstractC5605.m10057(abstractC7818);
                        if (c5520M10057 != null && (clsM10634 = m10634(classLoader, c5520M10057, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsM10634, ((List) obj).size());
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
                        C5043.m9170();
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
        } else if (abstractC5600 instanceof C5603) {
            Pair pair = (Pair) ((C5603) abstractC5600).f14250;
            C5520 c5520 = (C5520) pair.component1();
            C5523 c55232 = (C5523) pair.component2();
            Class clsM106342 = m10634(classLoader, c5520, 0);
            if (clsM106342 != null) {
                return Enum.valueOf(clsM106342, c55232.m9894());
            }
        } else {
            if (!(abstractC5600 instanceof C5591)) {
                if ((abstractC5600 instanceof C5604) || (abstractC5600 instanceof C5589)) {
                    return null;
                }
                return abstractC5600.mo10056();
            }
            AbstractC5587 abstractC5587 = (AbstractC5587) ((C5591) abstractC5600).f14250;
            if (abstractC5587 instanceof C5588) {
                C5581 c5581 = ((C5588) abstractC5587).f14244;
                return m10634(classLoader, c5581.f14241, c5581.f14240);
            }
            if (!(abstractC5587 instanceof C5596)) {
                C5043.m9170();
                return null;
            }
            InterfaceC5309 interfaceC5309Mo97703 = ((C5596) abstractC5587).f14247.mo10281().mo9770();
            AbstractC7818 abstractC78182 = interfaceC5309Mo97703 instanceof AbstractC7818 ? (AbstractC7818) interfaceC5309Mo97703 : null;
            if (abstractC78182 != null) {
                return m10631(abstractC78182);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final InterfaceC5919 m10629(InterfaceC5919 interfaceC5919) {
        interfaceC5919.getClass();
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        C5836 c5836 = interfaceC5924Mo9458 instanceof C5836 ? (C5836) interfaceC5924Mo9458 : null;
        if (c5836 != null) {
            return (InterfaceC5919) ((C5877) c5836.f14770.getValue()).f14892.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final Annotation m10630(InterfaceC7307 interfaceC7307) {
        AbstractC7818 abstractC7818M10059 = AbstractC5605.m10059(interfaceC7307);
        Class clsM10631 = abstractC7818M10059 != null ? m10631(abstractC7818M10059) : null;
        if (clsM10631 == null) {
            clsM10631 = null;
        }
        if (clsM10631 == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = interfaceC7307.mo9735().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            C5523 c5523 = (C5523) entry.getKey();
            AbstractC5600 abstractC5600 = (AbstractC5600) entry.getValue();
            ClassLoader classLoader = clsM10631.getClassLoader();
            classLoader.getClass();
            Object objM10628 = m10628(abstractC5600, classLoader);
            Pair pair = objM10628 != null ? new Pair(c5523.m9894(), objM10628) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) C9496.m14939(clsM10631, AbstractC5171.m9330(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final Class m10631(AbstractC7818 abstractC7818) {
        InterfaceC5294 interfaceC5294Mo9585 = abstractC7818.mo9585();
        interfaceC5294Mo9585.getClass();
        if (interfaceC5294Mo9585 instanceof C5467) {
            return ((C5467) interfaceC5294Mo9585).f13899.f19006;
        }
        if (interfaceC5294Mo9585 instanceof C7802) {
            AbstractC5273 abstractC5273 = ((C7802) interfaceC5294Mo9585).f19009;
            abstractC5273.getClass();
            return ((C5284) abstractC5273).f13428;
        }
        C5520 c5520M10057 = AbstractC5605.m10057(abstractC7818);
        if (c5520M10057 == null) {
            return null;
        }
        return m10634(AbstractC5263.m9533(abstractC7818.getClass()), c5520M10057, 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final boolean m10632(InterfaceC5919 interfaceC5919) {
        interfaceC5919.getClass();
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        C5836 c5836 = interfaceC5924Mo9458 instanceof C5836 ? (C5836) interfaceC5924Mo9458 : null;
        return c5836 != null && c5836.mo9443();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C7835 m10633(AbstractC5856 abstractC5856) {
        abstractC5856.getClass();
        C7835 c7835 = abstractC5856.f14834.f14926;
        if (c7835 != null) {
            return c7835;
        }
        InterfaceC5312 interfaceC5312Mo10501 = abstractC5856.mo10501();
        if (interfaceC5312Mo10501 instanceof InterfaceC5327) {
            return ((AbstractC7831) ((InterfaceC5327) interfaceC5312Mo10501)).f19119;
        }
        if (interfaceC5312Mo10501.mo9593() == null) {
            return null;
        }
        InterfaceC5331 interfaceC5331Mo9587 = interfaceC5312Mo10501.mo9587();
        interfaceC5331Mo9587.getClass();
        return ((AbstractC7818) interfaceC5331Mo9587).mo12866();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Class m10634(ClassLoader classLoader, C5520 c5520, int i) {
        c5520.getClass();
        C5518 c5518 = c5520.m9886().f14041;
        String str = c5518.f14038;
        Integer numM10699 = AbstractC5971.m10699(AbstractC5976.m10700(str, f14952, str));
        if (numM10699 != null) {
            int iIntValue = numM10699.intValue();
            C7291 c7291 = C7291.f18079;
            return m10634(classLoader, new C5520(c7291.f18102, c7291.m12551(iIntValue + 1)), i);
        }
        String str2 = C5242.f13332;
        C5520 c5520M9504 = C5242.m9504(c5518);
        if (c5520M9504 == null) {
            c5520M9504 = c5520;
        }
        if (!c5520M9504.equals(c5520)) {
            classLoader = AbstractC5263.m9533(C6008.class);
        }
        String str3 = c5520M9504.f14044.f14041.f14038;
        String str4 = c5520M9504.f14043.f14041.f14038;
        if (AbstractC5227.m9466(str3, "kotlin")) {
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
        sb.append(AbstractC5971.m10688(str4, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$'));
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
    public static final C0923 m10635(ClassLoader classLoader, String str, boolean z) {
        Class clsM10627;
        str.getClass();
        C5102 c5102M10626 = m10626(str);
        ArrayList<String> arrayList = c5102M10626.f13161;
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(m10627(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = c5102M10626.f13160;
            clsM10627 = m10627(classLoader, str3, 0, str3.length());
        } else {
            clsM10627 = null;
        }
        return new C0923(arrayList2, 25, clsM10627);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final boolean m10636(InterfaceC5925 interfaceC5925) {
        Method declaredMethod;
        Class<?> componentType;
        Annotation annotation;
        Object objInvoke;
        Class clsM7316 = AbstractC3889.m7316(interfaceC5925);
        try {
            declaredMethod = clsM7316.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
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
                if (AbstractC3889.m7316(AbstractC3889.m7319(annotation)).getName().equals(AbstractC5447.f13839.f14041.f14038)) {
                    break;
                }
                i++;
            }
            if (annotation != null && (objInvoke = AbstractC3889.m7316(AbstractC3889.m7319(annotation)).getMethod("value", null).invoke(annotation, null)) != null) {
                return clsM7316.equals(objInvoke);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final boolean m10637(InterfaceC5919 interfaceC5919) {
        interfaceC5919.getClass();
        if (interfaceC5919.mo9455()) {
            return true;
        }
        AbstractC5758 abstractC5758 = (AbstractC5758) interfaceC5919;
        AbstractC5758 abstractC5758Mo10472 = abstractC5758.mo10472();
        if (abstractC5758Mo10472 != null && m10637(abstractC5758Mo10472)) {
            return true;
        }
        if (abstractC5758.mo10481()) {
            return false;
        }
        InterfaceC5924 interfaceC5924Mo9458 = interfaceC5919.mo9458();
        if (!(interfaceC5924Mo9458 instanceof AbstractC5226)) {
            return false;
        }
        List upperBounds = ((AbstractC5226) interfaceC5924Mo9458).getUpperBounds();
        if (upperBounds.isEmpty()) {
            return false;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (m10637((InterfaceC5919) it.next())) {
                return true;
            }
        }
        return false;
    }
}
