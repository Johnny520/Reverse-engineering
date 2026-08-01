package p089;

import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.types.C5703;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7770 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f18858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C7754 f18859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C7754 f18860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7754 f18861 = new C7754(NullabilityQualifier.NULLABLE, false);

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f18860 = new C7754(nullabilityQualifier, false);
        f18859 = new C7754(nullabilityQualifier, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        C7766 c7766 = new C7766(0);
        new C5703(9, c7766, "java/util/".concat("Iterator"), false).m10318("forEachRemaining", null, new C7768(strConcat4, 0));
        new C5703(9, c7766, "java/lang/".concat("Iterable"), false).m10318("spliterator", null, new C7763(4));
        C5703 c5703 = new C5703(9, c7766, "java/util/".concat("Collection"), false);
        c5703.m10318("removeIf", null, new C7768(strConcat2, 17));
        c5703.m10318("stream", null, new C7768(strConcat8, 26));
        c5703.m10318("parallelStream", null, new C7773(strConcat8, 1));
        C5703 c57032 = new C5703(9, c7766, "java/util/".concat("List"), false);
        c57032.m10318("replaceAll", null, new C7773(strConcat7, 2));
        c57032.m10318("addFirst", "2.1", new C7773(strConcat, 3));
        c57032.m10318("addLast", "2.1", new C7773(strConcat, 4));
        c57032.m10318("removeFirst", "2.1", new C7773(strConcat, 5));
        c57032.m10318("removeLast", "2.1", new C7773(strConcat, 6));
        C5703 c57033 = new C5703(9, c7766, "java/util/".concat("LinkedList"), false);
        c57033.m10318("addFirst", "2.1", new C7768(strConcat, 1));
        c57033.m10318("addLast", "2.1", new C7768(strConcat, 2));
        c57033.m10318("removeFirst", "2.1", new C7768(strConcat, 3));
        c57033.m10318("removeLast", "2.1", new C7768(strConcat, 4));
        C5703 c57034 = new C5703(9, c7766, "java/util/".concat("LinkedHashSet"), false);
        c57034.m10318("addFirst", "2.2", new C7768(strConcat, 5));
        c57034.m10318("addLast", "2.2", new C7768(strConcat, 6));
        c57034.m10318("removeFirst", "2.2", new C7768(strConcat, 7));
        c57034.m10318("removeLast", "2.2", new C7768(strConcat, 8));
        c57034.m10318("getFirst", "2.2", new C7768(strConcat, 9));
        c57034.m10318("getLast", "2.2", new C7768(strConcat, 10));
        C5703 c57035 = new C5703(9, c7766, "java/util/".concat("Map"), false);
        c57035.m10318("forEach", null, new C7768(strConcat6, 11));
        c57035.m10318("putIfAbsent", null, new C7768(strConcat, 12));
        c57035.m10318("replace", null, new C7768(strConcat, 13));
        c57035.m10318("replace", null, new C7768(strConcat, 14));
        c57035.m10318("replaceAll", null, new C7768(strConcat5, 15));
        c57035.m10318("compute", null, new C7772(0, strConcat, strConcat5));
        c57035.m10318("computeIfAbsent", null, new C7772(1, strConcat, strConcat3));
        c57035.m10318("computeIfPresent", null, new C7772(2, strConcat, strConcat5));
        c57035.m10318("merge", null, new C7772(3, strConcat, strConcat5));
        C5703 c57036 = new C5703(9, c7766, "java/util/".concat("LinkedHashMap"), false);
        c57036.m10318("putFirst", "2.2", new C7768(strConcat, 16));
        c57036.m10318("putLast", "2.2", new C7768(strConcat, 18));
        C5703 c57037 = new C5703(9, c7766, strConcat9, false);
        c57037.m10318("empty", null, new C7768(strConcat9, 19));
        c57037.m10318("of", null, new C7772(4, strConcat, strConcat9));
        c57037.m10318("ofNullable", null, new C7772(5, strConcat, strConcat9));
        c57037.m10318("get", null, new C7768(strConcat, 20));
        c57037.m10318("ifPresent", null, new C7768(strConcat4, 21));
        new C5703(9, c7766, "java/lang/".concat("ref/Reference"), false).m10318("get", null, new C7768(strConcat, 22));
        new C5703(9, c7766, strConcat2, false).m10318("test", null, new C7768(strConcat, 23));
        new C5703(9, c7766, "java/util/function/".concat("BiPredicate"), false).m10318("test", null, new C7768(strConcat, 24));
        new C5703(9, c7766, strConcat4, false).m10318("accept", null, new C7768(strConcat, 25));
        new C5703(9, c7766, strConcat6, false).m10318("accept", null, new C7768(strConcat, 27));
        new C5703(9, c7766, strConcat3, false).m10318("apply", null, new C7768(strConcat, 28));
        new C5703(9, c7766, strConcat5, false).m10318("apply", null, new C7768(strConcat, 29));
        new C5703(9, c7766, "java/util/function/".concat("Supplier"), false).m10318("get", null, new C7773(strConcat, 0));
        f18858 = c7766.f18849;
    }
}
