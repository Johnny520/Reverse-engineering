package p212o9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p024b9.AbstractC1061t;
import p111ha.C2915f0;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5114x;
import p186m9.C5135p;
import p213oa.C5691b;
import p213oa.C5693d;
import p343xa.EnumC9476f;

/* JADX INFO: renamed from: o9.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5688x {

    /* JADX INFO: renamed from: a */
    public static final C5688x f17878a;

    /* JADX INFO: renamed from: b */
    public static final Set f17879b;

    /* JADX INFO: renamed from: c */
    public static final Set f17880c;

    /* JADX INFO: renamed from: d */
    public static final Set f17881d;

    /* JADX INFO: renamed from: e */
    public static final Set f17882e;

    /* JADX INFO: renamed from: f */
    public static final Set f17883f;

    /* JADX INFO: renamed from: g */
    public static final Set f17884g;

    /* JADX INFO: renamed from: h */
    public static final Set f17885h;

    static {
        C5688x c5688x = new C5688x();
        f17878a = c5688x;
        C2915f0 c2915f0 = C2915f0.f7680a;
        f17879b = AbstractC5071c1.m20504m(c2915f0.m10612f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f17880c = AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(c5688x.m22969b(), c2915f0.m10612f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), c2915f0.m10611e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), c2915f0.m10611e("Double", "isInfinite()Z", "isNaN()Z")), c2915f0.m10611e("Float", "isInfinite()Z", "isNaN()Z")), c2915f0.m10611e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), c2915f0.m10611e("CharSequence", "isEmpty()Z"));
        f17881d = c2915f0.m10612f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f17882e = AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(c2915f0.m10611e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), c2915f0.m10612f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), c2915f0.m10611e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), c2915f0.m10611e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), c2915f0.m10612f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), c2915f0.m10612f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c2915f0.m10612f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f17883f = AbstractC5071c1.m20503l(AbstractC5071c1.m20503l(c2915f0.m10612f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), c2915f0.m10612f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c2915f0.m10612f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set setM22968a = c5688x.m22968a();
        String[] strArrM10608b = c2915f0.m10608b("D");
        Set setM20503l = AbstractC5071c1.m20503l(setM22968a, c2915f0.m10611e("Float", (String[]) Arrays.copyOf(strArrM10608b, strArrM10608b.length)));
        String[] strArrM10608b2 = c2915f0.m10608b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f17884g = AbstractC5071c1.m20503l(setM20503l, c2915f0.m10611e("String", (String[]) Arrays.copyOf(strArrM10608b2, strArrM10608b2.length)));
        String[] strArrM10608b3 = c2915f0.m10608b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f17885h = c2915f0.m10611e("Throwable", (String[]) Arrays.copyOf(strArrM10608b3, strArrM10608b3.length));
    }

    /* JADX INFO: renamed from: a */
    public final Set m22968a() {
        C2915f0 c2915f0 = C2915f0.f7680a;
        EnumC9476f enumC9476f = EnumC9476f.BOOLEAN;
        EnumC9476f enumC9476f2 = EnumC9476f.BYTE;
        List listM20803r = AbstractC5114x.m20803r(enumC9476f, enumC9476f2, EnumC9476f.DOUBLE, EnumC9476f.FLOAT, enumC9476f2, EnumC9476f.INT, EnumC9476f.LONG, EnumC9476f.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM20803r.iterator();
        while (it.hasNext()) {
            String strM23030c = ((EnumC9476f) it.next()).m36917k().m22999f().m23030c();
            strM23030c.getClass();
            String[] strArrM10608b = c2915f0.m10608b("Ljava/lang/String;");
            AbstractC5070c0.m20492E(linkedHashSet, c2915f0.m10611e(strM23030c, (String[]) Arrays.copyOf(strArrM10608b, strArrM10608b.length)));
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public final Set m22969b() {
        C2915f0 c2915f0 = C2915f0.f7680a;
        List<EnumC9476f> listM20803r = AbstractC5114x.m20803r(EnumC9476f.BOOLEAN, EnumC9476f.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC9476f enumC9476f : listM20803r) {
            String strM23030c = enumC9476f.m36917k().m22999f().m23030c();
            strM23030c.getClass();
            AbstractC5070c0.m20492E(linkedHashSet, c2915f0.m10611e(strM23030c, enumC9476f.m36915i() + "Value()" + enumC9476f.m36914h()));
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: c */
    public final Set m22970c() {
        return f17881d;
    }

    /* JADX INFO: renamed from: d */
    public final Set m22971d() {
        return f17879b;
    }

    /* JADX INFO: renamed from: e */
    public final Set m22972e() {
        return f17884g;
    }

    /* JADX INFO: renamed from: f */
    public final Set m22973f() {
        return f17880c;
    }

    /* JADX INFO: renamed from: g */
    public final Set m22974g() {
        return f17883f;
    }

    /* JADX INFO: renamed from: h */
    public final Set m22975h() {
        return f17885h;
    }

    /* JADX INFO: renamed from: i */
    public final Set m22976i() {
        return f17882e;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m22977j(C5693d c5693d) {
        c5693d.getClass();
        return AbstractC1061t.m3842c(c5693d, C5135p.a.f15588i) || C5135p.m20965e(c5693d);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m22978k(C5693d c5693d) {
        c5693d.getClass();
        if (m22977j(c5693d)) {
            return true;
        }
        C5691b c5691bM22893n = C5667c.f17796a.m22893n(c5693d);
        if (c5691bM22893n == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(c5691bM22893n.m22982a().m22994a()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
