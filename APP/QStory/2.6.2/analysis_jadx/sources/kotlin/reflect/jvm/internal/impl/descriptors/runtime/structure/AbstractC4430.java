package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlin.reflect.InterfaceC5092;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4683;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.sequences.AbstractC5121;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6537;
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
import p053.AbstractC6560;
import p253.AbstractC8189;
import p383.AbstractC9032;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4430 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Map f13048;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f13049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Map f13050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final List f13051;

    static {
        C4396 c4396 = AbstractC4395.f12971;
        int i = 0;
        List<InterfaceC5092> listM13659 = AbstractC8189.m13659(c4396.mo8927(Boolean.TYPE), c4396.mo8927(Byte.TYPE), c4396.mo8927(Character.TYPE), c4396.mo8927(Double.TYPE), c4396.mo8927(Float.TYPE), c4396.mo8927(Integer.TYPE), c4396.mo8927(Long.TYPE), c4396.mo8927(Short.TYPE));
        f13051 = listM13659;
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(listM13659, 10));
        for (InterfaceC5092 interfaceC5092 : listM13659) {
            arrayList.add(new Pair(AbstractC6560.m12026(interfaceC5092), AbstractC6560.m12027(interfaceC5092)));
        }
        f13050 = AbstractC4338.m8783(arrayList);
        List<InterfaceC5092> list = f13051;
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(list, 10));
        for (InterfaceC5092 interfaceC50922 : list) {
            arrayList2.add(new Pair(AbstractC6560.m12027(interfaceC50922), AbstractC6560.m12026(interfaceC50922)));
        }
        f13049 = AbstractC4338.m8783(arrayList2);
        List listM136592 = AbstractC8189.m13659(InterfaceC6542.class, InterfaceC6557.class, InterfaceC6553.class, InterfaceC6550.class, InterfaceC6551.class, InterfaceC6544.class, InterfaceC6543.class, InterfaceC6546.class, InterfaceC6547.class, InterfaceC6545.class, InterfaceC6541.class, InterfaceC6540.class, InterfaceC6539.class, InterfaceC6538.class, InterfaceC6537.class, InterfaceC6555.class, InterfaceC6554.class, InterfaceC6558.class, InterfaceC6559.class, InterfaceC6556.class, InterfaceC6549.class, InterfaceC6548.class, InterfaceC6552.class);
        ArrayList arrayList3 = new ArrayList(AbstractC4344.m8832(listM136592, 10));
        for (Object obj : listM136592) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8189.m13662();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        f13048 = AbstractC4338.m8783(arrayList3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final ClassLoader m8984(Class cls) {
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
    public static final List m8985(Type type) {
        type.getClass();
        if (!(type instanceof ParameterizedType)) {
            return EmptyList.INSTANCE;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return AbstractC5121.m10106(AbstractC5121.m10105(AbstractC5121.m10112(type, C4431.f13054), C4431.f13055));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        return AbstractC4346.m8850(actualTypeArguments);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String m8986(Class cls) {
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
        C5919.m11249(AbstractC9032.m14590(cls, "Unsupported primitive type: "));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4687 m8987(Class cls) {
        cls.getClass();
        if (cls.isPrimitive()) {
            C5919.m11249(AbstractC9032.m14590(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            C5919.m11249(AbstractC9032.m14590(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() != null || cls.getEnclosingConstructor() != null || cls.getSimpleName().length() == 0) {
            C4686 c4686 = new C4686(cls.getName());
            return new C4687(c4686.m9330(), AbstractC4683.m9318(c4686.f13692.m9328()), true);
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return m8987(declaringClass).m9335(C4690.m9340(cls.getSimpleName()));
        }
        C4686 c46862 = new C4686(cls.getName());
        return new C4687(c46862.m9330(), c46862.f13692.m9328());
    }
}
