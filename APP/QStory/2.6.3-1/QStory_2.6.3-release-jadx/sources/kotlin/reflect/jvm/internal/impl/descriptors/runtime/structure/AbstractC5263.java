package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3889;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5516;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.sequences.AbstractC5954;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p068.InterfaceC7367;
import p068.InterfaceC7368;
import p068.InterfaceC7369;
import p068.InterfaceC7370;
import p068.InterfaceC7371;
import p068.InterfaceC7372;
import p068.InterfaceC7373;
import p068.InterfaceC7374;
import p068.InterfaceC7375;
import p068.InterfaceC7376;
import p068.InterfaceC7377;
import p068.InterfaceC7378;
import p068.InterfaceC7379;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7382;
import p068.InterfaceC7383;
import p068.InterfaceC7384;
import p068.InterfaceC7385;
import p068.InterfaceC7386;
import p068.InterfaceC7387;
import p068.InterfaceC7388;
import p068.InterfaceC7389;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5263 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Map f13397;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f13398;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f13399;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f13400;

    static {
        C5229 c5229 = AbstractC5228.f13320;
        int i = 0;
        List<InterfaceC5925> listM12490 = AbstractC7176.m12490(c5229.mo9476(Boolean.TYPE), c5229.mo9476(Byte.TYPE), c5229.mo9476(Character.TYPE), c5229.mo9476(Double.TYPE), c5229.mo9476(Float.TYPE), c5229.mo9476(Integer.TYPE), c5229.mo9476(Long.TYPE), c5229.mo9476(Short.TYPE));
        f13400 = listM12490;
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM12490, 10));
        for (InterfaceC5925 interfaceC5925 : listM12490) {
            arrayList.add(new Pair(AbstractC3889.m7317(interfaceC5925), AbstractC3889.m7310(interfaceC5925)));
        }
        f13399 = AbstractC5171.m9330(arrayList);
        List<InterfaceC5925> list = f13400;
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(list, 10));
        for (InterfaceC5925 interfaceC59252 : list) {
            arrayList2.add(new Pair(AbstractC3889.m7310(interfaceC59252), AbstractC3889.m7317(interfaceC59252)));
        }
        f13398 = AbstractC5171.m9330(arrayList2);
        List listM124902 = AbstractC7176.m12490(InterfaceC7372.class, InterfaceC7387.class, InterfaceC7383.class, InterfaceC7380.class, InterfaceC7381.class, InterfaceC7374.class, InterfaceC7373.class, InterfaceC7376.class, InterfaceC7377.class, InterfaceC7375.class, InterfaceC7371.class, InterfaceC7370.class, InterfaceC7369.class, InterfaceC7368.class, InterfaceC7367.class, InterfaceC7385.class, InterfaceC7384.class, InterfaceC7388.class, InterfaceC7389.class, InterfaceC7386.class, InterfaceC7379.class, InterfaceC7378.class, InterfaceC7382.class);
        ArrayList arrayList3 = new ArrayList(AbstractC5177.m9381(listM124902, 10));
        for (Object obj : listM124902) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7176.m12479();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f13397 = AbstractC5171.m9330(arrayList3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ClassLoader m9533(Class cls) {
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
    public static final List m9534(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.INSTANCE;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return AbstractC5954.m10669(AbstractC5954.m10673(AbstractC5954.m10674(type, C5264.f13403), C5264.f13404));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return AbstractC5179.m9405(actualTypeArguments);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m9535(Class cls) {
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
        C6755.m11869(AbstractC0900.m714(cls, "Unsupported primitive type: "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5520 m9536(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            C6755.m11869(AbstractC0900.m714(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            C6755.m11869(AbstractC0900.m714(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            C5519 c5519 = new C5519(cls.getName());
            return new C5520(c5519.m9879(), AbstractC5516.m9867(c5519.f14041.m9877()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return m9536(declaringClass).m9884(C5523.m9889(cls.getSimpleName()));
        }
        C5519 c55192 = new C5519(cls.getName());
        return new C5520(c55192.m9879(), c55192.f14041.m9877());
    }
}
