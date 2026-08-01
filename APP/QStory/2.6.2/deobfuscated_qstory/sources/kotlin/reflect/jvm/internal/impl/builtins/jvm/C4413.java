package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import net.bytebuddy.pool.TypePool;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4413 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final LinkedHashSet f12998;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final LinkedHashSet f12999;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashSet f13000;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final LinkedHashSet f13001;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final LinkedHashSet f13002;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final LinkedHashSet f13003 = AbstractC0455.m1157(C4651.m9270("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final LinkedHashSet f13004;

    static {
        List<JvmPrimitiveType> listM13659 = AbstractC8189.m13659(JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JvmPrimitiveType jvmPrimitiveType : listM13659) {
            String strM9345 = jvmPrimitiveType.getWrapperFqName().f13692.m9328().m9345();
            strM9345.getClass();
            String[] strArr = {jvmPrimitiveType.getJavaKeywordName() + "Value()" + jvmPrimitiveType.getDesc()};
            String strConcat = "java/lang/".concat(strM9345);
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, 1);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (String str : strArr2) {
                linkedHashSet2.add(strConcat + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str);
            }
            AbstractC4343.m8794(linkedHashSet2, linkedHashSet);
        }
        f13002 = AbstractC0455.m1156(AbstractC0455.m1156(AbstractC0455.m1156(AbstractC0455.m1156(AbstractC0455.m1156(AbstractC0455.m1156(linkedHashSet, C4651.m9270("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), C4651.m9271("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), C4651.m9271("Double", "isInfinite()Z", "isNaN()Z")), C4651.m9271("Float", "isInfinite()Z", "isNaN()Z")), C4651.m9271("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), C4651.m9271("CharSequence", "isEmpty()Z"));
        f13001 = C4651.m9270("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f13000 = AbstractC0455.m1156(AbstractC0455.m1156(AbstractC0455.m1156(AbstractC0455.m1156(AbstractC0455.m1156(AbstractC0455.m1156(C4651.m9271("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), C4651.m9270("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), C4651.m9271("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), C4651.m9271("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), C4651.m9270("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), C4651.m9270("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C4651.m9270("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f12999 = AbstractC0455.m1156(AbstractC0455.m1156(C4651.m9270("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), C4651.m9270("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), C4651.m9270("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.BOOLEAN;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.BYTE;
        List listM136592 = AbstractC8189.m13659(jvmPrimitiveType2, jvmPrimitiveType3, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, jvmPrimitiveType3, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT);
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        Iterator it = listM136592.iterator();
        while (it.hasNext()) {
            String strM93452 = ((JvmPrimitiveType) it.next()).getWrapperFqName().f13692.m9328().m9345();
            strM93452.getClass();
            String[] strArrM9274 = C4651.m9274("Ljava/lang/String;");
            AbstractC4343.m8794(C4651.m9271(strM93452, (String[]) Arrays.copyOf(strArrM9274, strArrM9274.length)), linkedHashSet3);
        }
        String[] strArrM92742 = C4651.m9274("D");
        LinkedHashSet linkedHashSetM1156 = AbstractC0455.m1156(linkedHashSet3, C4651.m9271("Float", (String[]) Arrays.copyOf(strArrM92742, strArrM92742.length)));
        String[] strArrM92743 = C4651.m9274("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f12998 = AbstractC0455.m1156(linkedHashSetM1156, C4651.m9271("String", (String[]) Arrays.copyOf(strArrM92743, strArrM92743.length)));
        String[] strArrM92744 = C4651.m9274("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f13004 = C4651.m9271("Throwable", (String[]) Arrays.copyOf(strArrM92744, strArrM92744.length));
    }
}
