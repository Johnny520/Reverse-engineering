package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3057;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.reflect.InterfaceC5093;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4684;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.sequences.AbstractC5122;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC6347;
import p052.InterfaceC6538;
import p052.InterfaceC6539;
import p052.InterfaceC6540;
import p052.InterfaceC6541;
import p052.InterfaceC6542;
import p052.InterfaceC6543;
import p052.InterfaceC6544;
import p052.InterfaceC6545;
import p052.InterfaceC6546;
import p052.InterfaceC6547;
import p052.InterfaceC6548;
import p052.InterfaceC6549;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p052.InterfaceC6552;
import p052.InterfaceC6553;
import p052.InterfaceC6554;
import p052.InterfaceC6555;
import p052.InterfaceC6556;
import p052.InterfaceC6557;
import p052.InterfaceC6558;
import p052.InterfaceC6559;
import p052.InterfaceC6560;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4431 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Map f13052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f13053;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f13054;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f13055;

    static {
        C4397 c4397 = AbstractC4396.f12975;
        int i = 0;
        List<InterfaceC5093> listM11931 = AbstractC6347.m11931(c4397.mo8917(Boolean.TYPE), c4397.mo8917(Byte.TYPE), c4397.mo8917(Character.TYPE), c4397.mo8917(Double.TYPE), c4397.mo8917(Float.TYPE), c4397.mo8917(Integer.TYPE), c4397.mo8917(Long.TYPE), c4397.mo8917(Short.TYPE));
        f13055 = listM11931;
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(listM11931, 10));
        for (InterfaceC5093 interfaceC5093 : listM11931) {
            arrayList.add(new Pair(AbstractC3057.m6757(interfaceC5093), AbstractC3057.m6750(interfaceC5093)));
        }
        f13054 = AbstractC4339.m8771(arrayList);
        List<InterfaceC5093> list = f13055;
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(list, 10));
        for (InterfaceC5093 interfaceC50932 : list) {
            arrayList2.add(new Pair(AbstractC3057.m6750(interfaceC50932), AbstractC3057.m6757(interfaceC50932)));
        }
        f13053 = AbstractC4339.m8771(arrayList2);
        List listM119312 = AbstractC6347.m11931(InterfaceC6543.class, InterfaceC6558.class, InterfaceC6554.class, InterfaceC6551.class, InterfaceC6552.class, InterfaceC6545.class, InterfaceC6544.class, InterfaceC6547.class, InterfaceC6548.class, InterfaceC6546.class, InterfaceC6542.class, InterfaceC6541.class, InterfaceC6540.class, InterfaceC6539.class, InterfaceC6538.class, InterfaceC6556.class, InterfaceC6555.class, InterfaceC6559.class, InterfaceC6560.class, InterfaceC6557.class, InterfaceC6550.class, InterfaceC6549.class, InterfaceC6553.class);
        ArrayList arrayList3 = new ArrayList(AbstractC4345.m8822(listM119312, 10));
        for (Object obj : listM119312) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC6347.m11920();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f13052 = AbstractC4339.m8771(arrayList3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ClassLoader m8974(Class cls) {
        cls.getClass();
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        systemClassLoader.getClass();
        return systemClassLoader;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final List m8975(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.INSTANCE;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return AbstractC5122.m10110(AbstractC5122.m10114(AbstractC5122.m10115(type, C4432.f13058), C4432.f13059));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return AbstractC4347.m8846(actualTypeArguments);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m8976(Class cls) {
        cls.getClass();
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String strReplace = cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                strReplace.getClass();
                return strReplace;
            }
            StringBuilder sb = new StringBuilder("L");
            String strReplace2 = cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
            strReplace2.getClass();
            sb.append(strReplace2);
            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
            return sb.toString();
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        C5925.m11310(AbstractC0053.m154(cls, "Unsupported primitive type: "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4688 m8977(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            C5925.m11310(AbstractC0053.m154(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            C5925.m11310(AbstractC0053.m154(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            C4687 c4687 = new C4687(cls.getName());
            return new C4688(c4687.m9320(), AbstractC4684.m9308(c4687.f13696.m9318()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return m8977(declaringClass).m9325(C4691.m9330(cls.getSimpleName()));
        }
        C4687 c46872 = new C4687(cls.getName());
        return new C4688(c46872.m9320(), c46872.f13696.m9318());
    }
}
