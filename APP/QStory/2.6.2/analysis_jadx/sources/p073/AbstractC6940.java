package p073;

import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.types.C4870;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6940 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f18518;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6924 f18519;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6924 f18520;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6924 f18521 = new C6924(NullabilityQualifier.NULLABLE, false);

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f18520 = new C6924(nullabilityQualifier, false);
        f18519 = new C6924(nullabilityQualifier, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        C6936 c6936 = new C6936(0);
        new C4870(9, c6936, "java/util/".concat("Iterator"), false).m9767("forEachRemaining", null, new C6938(strConcat4, 0));
        new C4870(9, c6936, "java/lang/".concat("Iterable"), false).m9767("spliterator", null, new C6933(4));
        C4870 c4870 = new C4870(9, c6936, "java/util/".concat("Collection"), false);
        c4870.m9767("removeIf", null, new C6938(strConcat2, 17));
        c4870.m9767("stream", null, new C6938(strConcat8, 26));
        c4870.m9767("parallelStream", null, new C6943(strConcat8, 1));
        C4870 c48702 = new C4870(9, c6936, "java/util/".concat("List"), false);
        c48702.m9767("replaceAll", null, new C6943(strConcat7, 2));
        c48702.m9767("addFirst", "2.1", new C6943(strConcat, 3));
        c48702.m9767("addLast", "2.1", new C6943(strConcat, 4));
        c48702.m9767("removeFirst", "2.1", new C6943(strConcat, 5));
        c48702.m9767("removeLast", "2.1", new C6943(strConcat, 6));
        C4870 c48703 = new C4870(9, c6936, "java/util/".concat("LinkedList"), false);
        c48703.m9767("addFirst", "2.1", new C6938(strConcat, 1));
        c48703.m9767("addLast", "2.1", new C6938(strConcat, 2));
        c48703.m9767("removeFirst", "2.1", new C6938(strConcat, 3));
        c48703.m9767("removeLast", "2.1", new C6938(strConcat, 4));
        C4870 c48704 = new C4870(9, c6936, "java/util/".concat("LinkedHashSet"), false);
        c48704.m9767("addFirst", "2.2", new C6938(strConcat, 5));
        c48704.m9767("addLast", "2.2", new C6938(strConcat, 6));
        c48704.m9767("removeFirst", "2.2", new C6938(strConcat, 7));
        c48704.m9767("removeLast", "2.2", new C6938(strConcat, 8));
        c48704.m9767("getFirst", "2.2", new C6938(strConcat, 9));
        c48704.m9767("getLast", "2.2", new C6938(strConcat, 10));
        C4870 c48705 = new C4870(9, c6936, "java/util/".concat("Map"), false);
        c48705.m9767("forEach", null, new C6938(strConcat6, 11));
        c48705.m9767("putIfAbsent", null, new C6938(strConcat, 12));
        c48705.m9767("replace", null, new C6938(strConcat, 13));
        c48705.m9767("replace", null, new C6938(strConcat, 14));
        c48705.m9767("replaceAll", null, new C6938(strConcat5, 15));
        c48705.m9767("compute", null, new C6942(0, strConcat, strConcat5));
        c48705.m9767("computeIfAbsent", null, new C6942(1, strConcat, strConcat3));
        c48705.m9767("computeIfPresent", null, new C6942(2, strConcat, strConcat5));
        c48705.m9767("merge", null, new C6942(3, strConcat, strConcat5));
        C4870 c48706 = new C4870(9, c6936, "java/util/".concat("LinkedHashMap"), false);
        c48706.m9767("putFirst", "2.2", new C6938(strConcat, 16));
        c48706.m9767("putLast", "2.2", new C6938(strConcat, 18));
        C4870 c48707 = new C4870(9, c6936, strConcat9, false);
        c48707.m9767("empty", null, new C6938(strConcat9, 19));
        c48707.m9767("of", null, new C6942(4, strConcat, strConcat9));
        c48707.m9767("ofNullable", null, new C6942(5, strConcat, strConcat9));
        c48707.m9767("get", null, new C6938(strConcat, 20));
        c48707.m9767("ifPresent", null, new C6938(strConcat4, 21));
        new C4870(9, c6936, "java/lang/".concat("ref/Reference"), false).m9767("get", null, new C6938(strConcat, 22));
        new C4870(9, c6936, strConcat2, false).m9767("test", null, new C6938(strConcat, 23));
        new C4870(9, c6936, "java/util/function/".concat("BiPredicate"), false).m9767("test", null, new C6938(strConcat, 24));
        new C4870(9, c6936, strConcat4, false).m9767("accept", null, new C6938(strConcat, 25));
        new C4870(9, c6936, strConcat6, false).m9767("accept", null, new C6938(strConcat, 27));
        new C4870(9, c6936, strConcat3, false).m9767("apply", null, new C6938(strConcat, 28));
        new C4870(9, c6936, strConcat5, false).m9767("apply", null, new C6938(strConcat, 29));
        new C4870(9, c6936, "java/util/function/".concat("Supplier"), false).m9767("get", null, new C6943(strConcat, 0));
        f18518 = c6936.f18509;
    }
}
