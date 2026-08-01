package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5484;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5246 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final LinkedHashSet f13347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final LinkedHashSet f13348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashSet f13349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final LinkedHashSet f13350;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashSet f13351;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashSet f13352 = AbstractC8568.m13612(C5484.m9819("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final LinkedHashSet f13353;

    static {
        List<JvmPrimitiveType> listM12490 = AbstractC7176.m12490(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listM12490) {
            String strM9894 = jvmPrimitiveType.getWrapperFqName().f14041.m9877().m9894();
            strM9894.getClass();
            String[] strArr = {jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()};
            String strConcat = "java/lang/".concat(strM9894);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str : strArr2) {
                linkedHashSet2.add(strConcat + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str);
            }
            AbstractC5176.m9363(linkedHashSet2, linkedHashSet);
        }
        f13351 = AbstractC8568.m13613(AbstractC8568.m13613(AbstractC8568.m13613(AbstractC8568.m13613(AbstractC8568.m13613(AbstractC8568.m13613(linkedHashSet, C5484.m9819("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), C5484.m9820("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C5484.m9820("Double", "isInfinite()Z", "isNaN()Z")), C5484.m9820("Float", "isInfinite()Z", "isNaN()Z")), C5484.m9820("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C5484.m9820("CharSequence", "isEmpty()Z"));
        f13350 = C5484.m9819("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f13349 = AbstractC8568.m13613(AbstractC8568.m13613(AbstractC8568.m13613(AbstractC8568.m13613(AbstractC8568.m13613(AbstractC8568.m13613(C5484.m9820("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C5484.m9819("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C5484.m9820("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C5484.m9820("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C5484.m9819("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C5484.m9819("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C5484.m9819("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f13348 = AbstractC8568.m13613(AbstractC8568.m13613(C5484.m9819("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C5484.m9819("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C5484.m9819("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BOOLEAN;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.BYTE;
        List listM124902 = AbstractC7176.m12490(jvmPrimitiveType2, jvmPrimitiveType3, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType3, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = listM124902.iterator();
        while (it.hasNext()) {
            String strM98942 = ((JvmPrimitiveType) it.next()).getWrapperFqName().f14041.m9877().m9894();
            strM98942.getClass();
            String[] strArrM9823 = C5484.m9823("Ljava/lang/String;");
            AbstractC5176.m9363(C5484.m9820(strM98942, (String[]) Arrays.copyOf(strArrM9823, strArrM9823.length)), linkedHashSet3);
        }
        String[] strArrM98232 = C5484.m9823("D");
        LinkedHashSet linkedHashSetM13613 = AbstractC8568.m13613(linkedHashSet3, C5484.m9820("Float", (String[]) Arrays.copyOf(strArrM98232, strArrM98232.length)));
        String[] strArrM98233 = C5484.m9823("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f13347 = AbstractC8568.m13613(linkedHashSetM13613, C5484.m9820("String", (String[]) Arrays.copyOf(strArrM98233, strArrM98233.length)));
        String[] strArrM98234 = C5484.m9823("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f13353 = C5484.m9820("Throwable", (String[]) Arrays.copyOf(strArrM98234, strArrM98234.length));
    }
}
