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
import kotlin.reflect.jvm.internal.impl.name.AbstractC4684;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4692;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.name.C4693;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;
import p034.AbstractC6347;
import p045.C6462;
import p045.C6468;
import p045.C6469;
import p045.C6472;
import p049.AbstractC6522;
import p049.AbstractC6526;
import p049.AbstractC6527;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4410 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4687 f12982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4688 f12983;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f12984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f12985;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f12986;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f12987;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final LinkedHashSet f12988;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final HashMap f12989;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final List f12990;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final HashMap f12991;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4688 f12992;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final HashMap f12993;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final HashMap f12994;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final HashMap f12995;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final HashMap f12996;

    static {
        StringBuilder sb = new StringBuilder();
        C6462 c6462 = C6462.f17734;
        sb.append(c6462.f17757);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(c6462.f17756);
        f12987 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        C6469 c6469 = C6469.f17748;
        sb2.append(c6469.f17757);
        sb2.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb2.append(c6469.f17756);
        f12986 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        C6472 c6472 = C6472.f17754;
        sb3.append(c6472.f17757);
        sb3.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb3.append(c6472.f17756);
        f12985 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        C6468 c6468 = C6468.f17747;
        sb4.append(c6468.f17757);
        sb4.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb4.append(c6468.f17756);
        f12984 = sb4.toString();
        C4688 c4688M9307 = AbstractC4684.m9307(new C4687("kotlin.jvm.functions.FunctionN"));
        f12983 = c4688M9307;
        f12982 = c4688M9307.m9327();
        f12992 = C4693.f13726;
        m8940(Class.class);
        f12991 = new HashMap();
        f12995 = new HashMap();
        f12996 = new HashMap();
        f12993 = new HashMap();
        f12994 = new HashMap();
        f12989 = new HashMap();
        f12988 = new LinkedHashSet();
        C4688 c4688M93072 = AbstractC4684.m9307(AbstractC6527.f17870);
        C4687 c4687 = AbstractC6527.f17874;
        C4687 c46872 = c4688M93072.f13699;
        C4411 c4411 = new C4411(m8940(Iterable.class), c4688M93072, new C4688(c46872, AbstractC4684.m9310(c4687, c46872), false));
        C4688 c4688M93073 = AbstractC4684.m9307(AbstractC6527.f17871);
        C4687 c46873 = AbstractC6527.f17875;
        C4687 c46874 = c4688M93073.f13699;
        C4411 c44112 = new C4411(m8940(Iterator.class), c4688M93073, new C4688(c46874, AbstractC4684.m9310(c46873, c46874), false));
        C4688 c4688M93074 = AbstractC4684.m9307(AbstractC6527.f17869);
        C4687 c46875 = AbstractC6527.f17865;
        C4687 c46876 = c4688M93074.f13699;
        C4411 c44113 = new C4411(m8940(Collection.class), c4688M93074, new C4688(c46876, AbstractC4684.m9310(c46875, c46876), false));
        C4688 c4688M93075 = AbstractC4684.m9307(AbstractC6527.f17868);
        C4687 c46877 = AbstractC6527.f17864;
        C4687 c46878 = c4688M93075.f13699;
        C4411 c44114 = new C4411(m8940(List.class), c4688M93075, new C4688(c46878, AbstractC4684.m9310(c46877, c46878), false));
        C4688 c4688M93076 = AbstractC4684.m9307(AbstractC6527.f17878);
        C4687 c46879 = AbstractC6527.f17866;
        C4687 c468710 = c4688M93076.f13699;
        C4411 c44115 = new C4411(m8940(Set.class), c4688M93076, new C4688(c468710, AbstractC4684.m9310(c46879, c468710), false));
        C4688 c4688M93077 = AbstractC4684.m9307(AbstractC6527.f17879);
        C4687 c468711 = AbstractC6527.f17867;
        C4687 c468712 = c4688M93077.f13699;
        C4411 c44116 = new C4411(m8940(ListIterator.class), c4688M93077, new C4688(c468712, AbstractC4684.m9310(c468711, c468712), false));
        C4687 c468713 = AbstractC6527.f17877;
        C4688 c4688M93078 = AbstractC4684.m9307(c468713);
        C4687 c468714 = AbstractC6527.f17862;
        C4687 c468715 = c4688M93078.f13699;
        C4411 c44117 = new C4411(m8940(Map.class), c4688M93078, new C4688(c468715, AbstractC4684.m9310(c468714, c468715), false));
        C4688 c4688M9325 = AbstractC4684.m9307(c468713).m9325(AbstractC6527.f17876.f13696.m9318());
        C4687 c468716 = AbstractC6527.f17863;
        C4687 c468717 = c4688M9325.f13699;
        List<C4411> listM11931 = AbstractC6347.m11931(c4411, c44112, c44113, c44114, c44115, c44116, c44117, new C4411(m8940(Map.Entry.class), c4688M9325, new C4688(c468717, AbstractC4684.m9310(c468716, c468717), false)));
        f12990 = listM11931;
        m8941(Object.class, AbstractC6527.f17885);
        m8941(String.class, AbstractC6527.f17880);
        m8941(CharSequence.class, AbstractC6527.f17881);
        m8942(Throwable.class, AbstractC6527.f17900);
        m8941(Cloneable.class, AbstractC6527.f17883);
        m8941(Number.class, AbstractC6527.f17902);
        m8942(Comparable.class, AbstractC6527.f17901);
        m8941(Enum.class, AbstractC6527.f17903);
        m8942(Annotation.class, AbstractC6527.f17887);
        for (C4411 c44118 : listM11931) {
            C4688 c4688 = c44118.f12999;
            C4688 c46882 = c44118.f12998;
            C4688 c46883 = c44118.f12997;
            m8944(c4688, c46882);
            m8943(c46883.m9327(), c4688);
            f12994.put(c46883, c46882);
            f12989.put(c46882, c46883);
            C4687 c4687M9327 = c46882.m9327();
            C4687 c4687M93272 = c46883.m9327();
            f12996.put(c46883.m9327().f13696, c4687M9327);
            f12993.put(c4687M9327.f13696, c4687M93272);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            C4687 wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            wrapperFqName.getClass();
            C4688 c46884 = new C4688(wrapperFqName.m9320(), wrapperFqName.f13696.m9318());
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            primitiveType.getClass();
            C4687 c4687M9321 = AbstractC6526.f17853.m9321(primitiveType.getTypeName());
            m8944(c46884, new C4688(c4687M9321.m9320(), c4687M9321.f13696.m9318()));
        }
        for (C4688 c46885 : AbstractC6522.f17831) {
            C4687 c468718 = new C4687("kotlin.jvm.internal." + c46885.m9323().m9335() + "CompanionObject");
            m8944(new C4688(c468718.m9320(), c468718.f13696.m9318()), c46885.m9325(AbstractC4692.f13710));
        }
        for (int i = 0; i < 23; i++) {
            C4687 c468719 = new C4687(AbstractC6183.m11588(i, "kotlin.jvm.functions.Function"));
            m8944(new C4688(c468719.m9320(), c468719.f13696.m9318()), new C4688(AbstractC6526.f17853, C4691.m9330("Function" + i)));
            m8943(new C4687(f12986 + i), f12992);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            m8943(new C4687(f12984 + i2), f12992);
        }
        m8943(new C4687("kotlin.concurrent.atomics.AtomicInt"), m8940(AtomicInteger.class));
        m8943(new C4687("kotlin.concurrent.atomics.AtomicLong"), m8940(AtomicLong.class));
        m8943(new C4687("kotlin.concurrent.atomics.AtomicBoolean"), m8940(AtomicBoolean.class));
        m8943(new C4687("kotlin.concurrent.atomics.AtomicReference"), m8940(AtomicReference.class));
        m8943(new C4687("kotlin.concurrent.atomics.AtomicIntArray"), m8940(AtomicIntegerArray.class));
        m8943(new C4687("kotlin.concurrent.atomics.AtomicLongArray"), m8940(AtomicLongArray.class));
        m8943(new C4687("kotlin.concurrent.atomics.AtomicArray"), m8940(AtomicReferenceArray.class));
        m8943(AbstractC6527.f17884.m9319(), m8940(Void.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m8939(C4686 c4686, String str, boolean z) {
        String str2 = c4686.f13693;
        if (AbstractC5139.m10139(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            if (!AbstractC5144.m10146(strSubstring, '0')) {
                Integer numM10140 = AbstractC5139.m10140(strSubstring);
                int i = z ? 22 : 23;
                if (numM10140 != null && numM10140.intValue() >= i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C4688 m8940(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return m8940(declaringClass).m9325(C4691.m9330(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        C4687 c4687 = new C4687(canonicalName);
        return new C4688(c4687.m9320(), c4687.f13696.m9318());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m8941(Class cls, C4686 c4686) {
        m8942(cls, c4686.m9319());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8942(Class cls, C4687 c4687) {
        C4688 c4688M8940 = m8940(cls);
        c4687.getClass();
        m8944(c4688M8940, new C4688(c4687.m9320(), c4687.f13696.m9318()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8943(C4687 c4687, C4688 c4688) {
        f12988.add(c4687);
        f12995.put(c4687.f13696, c4688);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8944(C4688 c4688, C4688 c46882) {
        f12991.put(c4688.m9327().f13696, c46882);
        m8943(c46882.m9327(), c4688);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C4688 m8945(C4686 c4686) {
        c4686.getClass();
        return (m8939(c4686, f12987, false) || m8939(c4686, f12985, true)) ? f12983 : (m8939(c4686, f12986, false) || m8939(c4686, f12984, true)) ? f12992 : (C4688) f12995.get(c4686);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C4688 m8946(C4687 c4687) {
        c4687.getClass();
        return (C4688) f12991.get(c4687.f13696);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C4687 m8947(C4686 c4686) {
        return (C4687) f12993.get(c4686);
    }
}
