package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5516;
import kotlin.reflect.jvm.internal.impl.name.AbstractC5524;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.name.C5525;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;
import p050.AbstractC7176;
import p061.C7291;
import p061.C7297;
import p061.C7298;
import p061.C7301;
import p065.AbstractC7351;
import p065.AbstractC7355;
import p065.AbstractC7356;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5242 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5519 f13327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5520 f13328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f13329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f13330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f13331;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f13332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final LinkedHashSet f13333;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final HashMap f13334;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final List f13335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final HashMap f13336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5520 f13337;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final HashMap f13338;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final HashMap f13339;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final HashMap f13340;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final HashMap f13341;

    static {
        StringBuilder sb = new StringBuilder();
        C7291 c7291 = C7291.f18079;
        sb.append(c7291.f18102);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(c7291.f18101);
        f13332 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        C7298 c7298 = C7298.f18093;
        sb2.append(c7298.f18102);
        sb2.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb2.append(c7298.f18101);
        f13331 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        C7301 c7301 = C7301.f18099;
        sb3.append(c7301.f18102);
        sb3.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb3.append(c7301.f18101);
        f13330 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        C7297 c7297 = C7297.f18092;
        sb4.append(c7297.f18102);
        sb4.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb4.append(c7297.f18101);
        f13329 = sb4.toString();
        C5520 c5520M9866 = AbstractC5516.m9866(new C5519("kotlin.jvm.functions.FunctionN"));
        f13328 = c5520M9866;
        f13327 = c5520M9866.m9886();
        f13337 = C5525.f14071;
        m9499(Class.class);
        f13336 = new HashMap();
        f13340 = new HashMap();
        f13341 = new HashMap();
        f13338 = new HashMap();
        f13339 = new HashMap();
        f13334 = new HashMap();
        f13333 = new LinkedHashSet();
        C5520 c5520M98662 = AbstractC5516.m9866(AbstractC7356.f18215);
        C5519 c5519 = AbstractC7356.f18219;
        C5519 c55192 = c5520M98662.f14044;
        C5243 c5243 = new C5243(m9499(Iterable.class), c5520M98662, new C5520(c55192, AbstractC5516.m9869(c5519, c55192), false));
        C5520 c5520M98663 = AbstractC5516.m9866(AbstractC7356.f18216);
        C5519 c55193 = AbstractC7356.f18220;
        C5519 c55194 = c5520M98663.f14044;
        C5243 c52432 = new C5243(m9499(Iterator.class), c5520M98663, new C5520(c55194, AbstractC5516.m9869(c55193, c55194), false));
        C5520 c5520M98664 = AbstractC5516.m9866(AbstractC7356.f18214);
        C5519 c55195 = AbstractC7356.f18210;
        C5519 c55196 = c5520M98664.f14044;
        C5243 c52433 = new C5243(m9499(Collection.class), c5520M98664, new C5520(c55196, AbstractC5516.m9869(c55195, c55196), false));
        C5520 c5520M98665 = AbstractC5516.m9866(AbstractC7356.f18213);
        C5519 c55197 = AbstractC7356.f18209;
        C5519 c55198 = c5520M98665.f14044;
        C5243 c52434 = new C5243(m9499(List.class), c5520M98665, new C5520(c55198, AbstractC5516.m9869(c55197, c55198), false));
        C5520 c5520M98666 = AbstractC5516.m9866(AbstractC7356.f18223);
        C5519 c55199 = AbstractC7356.f18211;
        C5519 c551910 = c5520M98666.f14044;
        C5243 c52435 = new C5243(m9499(Set.class), c5520M98666, new C5520(c551910, AbstractC5516.m9869(c55199, c551910), false));
        C5520 c5520M98667 = AbstractC5516.m9866(AbstractC7356.f18224);
        C5519 c551911 = AbstractC7356.f18212;
        C5519 c551912 = c5520M98667.f14044;
        C5243 c52436 = new C5243(m9499(ListIterator.class), c5520M98667, new C5520(c551912, AbstractC5516.m9869(c551911, c551912), false));
        C5519 c551913 = AbstractC7356.f18222;
        C5520 c5520M98668 = AbstractC5516.m9866(c551913);
        C5519 c551914 = AbstractC7356.f18207;
        C5519 c551915 = c5520M98668.f14044;
        C5243 c52437 = new C5243(m9499(Map.class), c5520M98668, new C5520(c551915, AbstractC5516.m9869(c551914, c551915), false));
        C5520 c5520M9884 = AbstractC5516.m9866(c551913).m9884(AbstractC7356.f18221.f14041.m9877());
        C5519 c551916 = AbstractC7356.f18208;
        C5519 c551917 = c5520M9884.f14044;
        List<C5243> listM12490 = AbstractC7176.m12490(c5243, c52432, c52433, c52434, c52435, c52436, c52437, new C5243(m9499(Map.Entry.class), c5520M9884, new C5520(c551917, AbstractC5516.m9869(c551916, c551917), false)));
        f13335 = listM12490;
        m9500(Object.class, AbstractC7356.f18230);
        m9500(String.class, AbstractC7356.f18225);
        m9500(CharSequence.class, AbstractC7356.f18226);
        m9501(Throwable.class, AbstractC7356.f18245);
        m9500(Cloneable.class, AbstractC7356.f18228);
        m9500(Number.class, AbstractC7356.f18247);
        m9501(Comparable.class, AbstractC7356.f18246);
        m9500(Enum.class, AbstractC7356.f18248);
        m9501(Annotation.class, AbstractC7356.f18232);
        for (C5243 c52438 : listM12490) {
            C5520 c5520 = c52438.f13344;
            C5520 c55202 = c52438.f13343;
            C5520 c55203 = c52438.f13342;
            m9503(c5520, c55202);
            m9502(c55203.m9886(), c5520);
            f13339.put(c55203, c55202);
            f13334.put(c55202, c55203);
            C5519 c5519M9886 = c55202.m9886();
            C5519 c5519M98862 = c55203.m9886();
            f13341.put(c55203.m9886().f14041, c5519M9886);
            f13338.put(c5519M9886.f14041, c5519M98862);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            C5519 wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            wrapperFqName.getClass();
            C5520 c55204 = new C5520(wrapperFqName.m9879(), wrapperFqName.f14041.m9877());
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            primitiveType.getClass();
            C5519 c5519M9880 = AbstractC7355.f18198.m9880(primitiveType.getTypeName());
            m9503(c55204, new C5520(c5519M9880.m9879(), c5519M9880.f14041.m9877()));
        }
        for (C5520 c55205 : AbstractC7351.f18176) {
            C5519 c551918 = new C5519("kotlin.jvm.internal." + c55205.m9882().m9894() + "CompanionObject");
            m9503(new C5520(c551918.m9879(), c551918.f14041.m9877()), c55205.m9884(AbstractC5524.f14055));
        }
        for (int i = 0; i < 23; i++) {
            C5519 c551919 = new C5519(AbstractC7012.m12147(i, "kotlin.jvm.functions.Function"));
            m9503(new C5520(c551919.m9879(), c551919.f14041.m9877()), new C5520(AbstractC7355.f18198, C5523.m9889("Function" + i)));
            m9502(new C5519(f13331 + i), f13337);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            m9502(new C5519(f13329 + i2), f13337);
        }
        m9502(new C5519("kotlin.concurrent.atomics.AtomicInt"), m9499(AtomicInteger.class));
        m9502(new C5519("kotlin.concurrent.atomics.AtomicLong"), m9499(AtomicLong.class));
        m9502(new C5519("kotlin.concurrent.atomics.AtomicBoolean"), m9499(AtomicBoolean.class));
        m9502(new C5519("kotlin.concurrent.atomics.AtomicReference"), m9499(AtomicReference.class));
        m9502(new C5519("kotlin.concurrent.atomics.AtomicIntArray"), m9499(AtomicIntegerArray.class));
        m9502(new C5519("kotlin.concurrent.atomics.AtomicLongArray"), m9499(AtomicLongArray.class));
        m9502(new C5519("kotlin.concurrent.atomics.AtomicArray"), m9499(AtomicReferenceArray.class));
        m9502(AbstractC7356.f18229.m9878(), m9499(Void.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m9498(C5518 c5518, String str, boolean z) {
        String str2 = c5518.f14038;
        if (AbstractC5971.m10698(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            if (!AbstractC5976.m10705(strSubstring, '0')) {
                Integer numM10699 = AbstractC5971.m10699(strSubstring);
                int i = z ? 22 : 23;
                if (numM10699 != null && numM10699.intValue() >= i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C5520 m9499(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return m9499(declaringClass).m9884(C5523.m9889(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        C5519 c5519 = new C5519(canonicalName);
        return new C5520(c5519.m9879(), c5519.f14041.m9877());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m9500(Class cls, C5518 c5518) {
        m9501(cls, c5518.m9878());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m9501(Class cls, C5519 c5519) {
        C5520 c5520M9499 = m9499(cls);
        c5519.getClass();
        m9503(c5520M9499, new C5520(c5519.m9879(), c5519.f14041.m9877()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m9502(C5519 c5519, C5520 c5520) {
        f13333.add(c5519);
        f13340.put(c5519.f14041, c5520);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m9503(C5520 c5520, C5520 c55202) {
        f13336.put(c5520.m9886().f14041, c55202);
        m9502(c55202.m9886(), c5520);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C5520 m9504(C5518 c5518) {
        c5518.getClass();
        return (m9498(c5518, f13332, false) || m9498(c5518, f13330, true)) ? f13328 : (m9498(c5518, f13331, false) || m9498(c5518, f13329, true)) ? f13337 : (C5520) f13340.get(c5518);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C5520 m9505(C5519 c5519) {
        c5519.getClass();
        return (C5520) f13336.get(c5519.f14041);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C5519 m9506(C5518 c5518) {
        return (C5519) f13338.get(c5518);
    }
}
