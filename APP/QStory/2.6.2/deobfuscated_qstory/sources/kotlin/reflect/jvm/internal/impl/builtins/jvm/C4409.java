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
import kotlin.reflect.jvm.internal.impl.name.AbstractC4683;
import kotlin.reflect.jvm.internal.impl.name.AbstractC4691;
import kotlin.reflect.jvm.internal.impl.name.C4685;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.name.C4692;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;
import p045.C6461;
import p045.C6467;
import p045.C6468;
import p045.C6471;
import p049.AbstractC6521;
import p049.AbstractC6525;
import p049.AbstractC6526;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4409 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4686 f12978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4687 f12979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final String f12980;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final String f12981;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String f12982;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String f12983;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final LinkedHashSet f12984;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final HashMap f12985;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final List f12986;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final HashMap f12987;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4687 f12988;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final HashMap f12989;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final HashMap f12990;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final HashMap f12991;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final HashMap f12992;

    static {
        StringBuilder sb = new StringBuilder();
        C6461 c6461 = C6461.f17738;
        sb.append(c6461.f17761);
        sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb.append(c6461.f17760);
        f12983 = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        C6468 c6468 = C6468.f17752;
        sb2.append(c6468.f17761);
        sb2.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb2.append(c6468.f17760);
        f12982 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        C6471 c6471 = C6471.f17758;
        sb3.append(c6471.f17761);
        sb3.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb3.append(c6471.f17760);
        f12981 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        C6467 c6467 = C6467.f17751;
        sb4.append(c6467.f17761);
        sb4.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        sb4.append(c6467.f17760);
        f12980 = sb4.toString();
        C4687 c4687M9317 = AbstractC4683.m9317(new C4686("kotlin.jvm.functions.FunctionN"));
        f12979 = c4687M9317;
        f12978 = c4687M9317.m9337();
        f12988 = C4692.f13722;
        m8950(Class.class);
        f12987 = new HashMap();
        f12991 = new HashMap();
        f12992 = new HashMap();
        f12989 = new HashMap();
        f12990 = new HashMap();
        f12985 = new HashMap();
        f12984 = new LinkedHashSet();
        C4687 c4687M93172 = AbstractC4683.m9317(AbstractC6526.f17874);
        C4686 c4686 = AbstractC6526.f17878;
        C4686 c46862 = c4687M93172.f13695;
        C4410 c4410 = new C4410(m8950(Iterable.class), c4687M93172, new C4687(c46862, AbstractC4683.m9320(c4686, c46862), false));
        C4687 c4687M93173 = AbstractC4683.m9317(AbstractC6526.f17875);
        C4686 c46863 = AbstractC6526.f17879;
        C4686 c46864 = c4687M93173.f13695;
        C4410 c44102 = new C4410(m8950(Iterator.class), c4687M93173, new C4687(c46864, AbstractC4683.m9320(c46863, c46864), false));
        C4687 c4687M93174 = AbstractC4683.m9317(AbstractC6526.f17873);
        C4686 c46865 = AbstractC6526.f17869;
        C4686 c46866 = c4687M93174.f13695;
        C4410 c44103 = new C4410(m8950(Collection.class), c4687M93174, new C4687(c46866, AbstractC4683.m9320(c46865, c46866), false));
        C4687 c4687M93175 = AbstractC4683.m9317(AbstractC6526.f17872);
        C4686 c46867 = AbstractC6526.f17868;
        C4686 c46868 = c4687M93175.f13695;
        C4410 c44104 = new C4410(m8950(List.class), c4687M93175, new C4687(c46868, AbstractC4683.m9320(c46867, c46868), false));
        C4687 c4687M93176 = AbstractC4683.m9317(AbstractC6526.f17882);
        C4686 c46869 = AbstractC6526.f17870;
        C4686 c468610 = c4687M93176.f13695;
        C4410 c44105 = new C4410(m8950(Set.class), c4687M93176, new C4687(c468610, AbstractC4683.m9320(c46869, c468610), false));
        C4687 c4687M93177 = AbstractC4683.m9317(AbstractC6526.f17883);
        C4686 c468611 = AbstractC6526.f17871;
        C4686 c468612 = c4687M93177.f13695;
        C4410 c44106 = new C4410(m8950(ListIterator.class), c4687M93177, new C4687(c468612, AbstractC4683.m9320(c468611, c468612), false));
        C4686 c468613 = AbstractC6526.f17881;
        C4687 c4687M93178 = AbstractC4683.m9317(c468613);
        C4686 c468614 = AbstractC6526.f17866;
        C4686 c468615 = c4687M93178.f13695;
        C4410 c44107 = new C4410(m8950(Map.class), c4687M93178, new C4687(c468615, AbstractC4683.m9320(c468614, c468615), false));
        C4687 c4687M9335 = AbstractC4683.m9317(c468613).m9335(AbstractC6526.f17880.f13692.m9328());
        C4686 c468616 = AbstractC6526.f17867;
        C4686 c468617 = c4687M9335.f13695;
        List<C4410> listM13659 = AbstractC8189.m13659(c4410, c44102, c44103, c44104, c44105, c44106, c44107, new C4410(m8950(Map.Entry.class), c4687M9335, new C4687(c468617, AbstractC4683.m9320(c468616, c468617), false)));
        f12986 = listM13659;
        m8951(Object.class, AbstractC6526.f17889);
        m8951(String.class, AbstractC6526.f17884);
        m8951(CharSequence.class, AbstractC6526.f17885);
        m8952(Throwable.class, AbstractC6526.f17904);
        m8951(Cloneable.class, AbstractC6526.f17887);
        m8951(Number.class, AbstractC6526.f17906);
        m8952(Comparable.class, AbstractC6526.f17905);
        m8951(Enum.class, AbstractC6526.f17907);
        m8952(Annotation.class, AbstractC6526.f17891);
        for (C4410 c44108 : listM13659) {
            C4687 c4687 = c44108.f12995;
            C4687 c46872 = c44108.f12994;
            C4687 c46873 = c44108.f12993;
            m8954(c4687, c46872);
            m8953(c46873.m9337(), c4687);
            f12990.put(c46873, c46872);
            f12985.put(c46872, c46873);
            C4686 c4686M9337 = c46872.m9337();
            C4686 c4686M93372 = c46873.m9337();
            f12992.put(c46873.m9337().f13692, c4686M9337);
            f12989.put(c4686M9337.f13692, c4686M93372);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            C4686 wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            wrapperFqName.getClass();
            C4687 c46874 = new C4687(wrapperFqName.m9330(), wrapperFqName.f13692.m9328());
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            primitiveType.getClass();
            C4686 c4686M9331 = AbstractC6525.f17857.m9331(primitiveType.getTypeName());
            m8954(c46874, new C4687(c4686M9331.m9330(), c4686M9331.f13692.m9328()));
        }
        for (C4687 c46875 : AbstractC6521.f17835) {
            C4686 c468618 = new C4686("kotlin.jvm.internal." + c46875.m9333().m9345() + "CompanionObject");
            m8954(new C4687(c468618.m9330(), c468618.f13692.m9328()), c46875.m9335(AbstractC4691.f13706));
        }
        for (int i = 0; i < 23; i++) {
            C4686 c468619 = new C4686(AbstractC6136.m11556(i, "kotlin.jvm.functions.Function"));
            m8954(new C4687(c468619.m9330(), c468619.f13692.m9328()), new C4687(AbstractC6525.f17857, C4690.m9340("Function" + i)));
            m8953(new C4686(f12982 + i), f12988);
        }
        for (int i2 = 0; i2 < 22; i2++) {
            m8953(new C4686(f12980 + i2), f12988);
        }
        m8953(new C4686("kotlin.concurrent.atomics.AtomicInt"), m8950(AtomicInteger.class));
        m8953(new C4686("kotlin.concurrent.atomics.AtomicLong"), m8950(AtomicLong.class));
        m8953(new C4686("kotlin.concurrent.atomics.AtomicBoolean"), m8950(AtomicBoolean.class));
        m8953(new C4686("kotlin.concurrent.atomics.AtomicReference"), m8950(AtomicReference.class));
        m8953(new C4686("kotlin.concurrent.atomics.AtomicIntArray"), m8950(AtomicIntegerArray.class));
        m8953(new C4686("kotlin.concurrent.atomics.AtomicLongArray"), m8950(AtomicLongArray.class));
        m8953(new C4686("kotlin.concurrent.atomics.AtomicArray"), m8950(AtomicReferenceArray.class));
        m8953(AbstractC6526.f17888.m9329(), m8950(Void.class));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m8949(C4685 c4685, String str, boolean z) {
        String str2 = c4685.f13689;
        if (AbstractC5138.m10125(str2, str, false)) {
            String strSubstring = str2.substring(str.length());
            if (!AbstractC5143.m10146(strSubstring, '0')) {
                Integer numM10136 = AbstractC5138.m10136(strSubstring);
                int i = z ? 22 : 23;
                if (numM10136 != null && numM10136.intValue() >= i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C4687 m8950(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass != null) {
            return m8950(declaringClass).m9335(C4690.m9340(cls.getSimpleName()));
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        C4686 c4686 = new C4686(canonicalName);
        return new C4687(c4686.m9330(), c4686.f13692.m9328());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m8951(Class cls, C4685 c4685) {
        m8952(cls, c4685.m9329());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m8952(Class cls, C4686 c4686) {
        C4687 c4687M8950 = m8950(cls);
        c4686.getClass();
        m8954(c4687M8950, new C4687(c4686.m9330(), c4686.f13692.m9328()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m8953(C4686 c4686, C4687 c4687) {
        f12984.add(c4686);
        f12991.put(c4686.f13692, c4687);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m8954(C4687 c4687, C4687 c46872) {
        f12987.put(c4687.m9337().f13692, c46872);
        m8953(c46872.m9337(), c4687);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C4687 m8955(C4685 c4685) {
        c4685.getClass();
        return (m8949(c4685, f12983, false) || m8949(c4685, f12981, true)) ? f12979 : (m8949(c4685, f12982, false) || m8949(c4685, f12980, true)) ? f12988 : (C4687) f12991.get(c4685);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C4687 m8956(C4686 c4686) {
        c4686.getClass();
        return (C4687) f12987.get(c4686.f13692);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static C4686 m8957(C4685 c4685) {
        return (C4686) f12989.get(c4685);
    }
}
