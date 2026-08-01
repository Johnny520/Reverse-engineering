package p073;

import java.util.LinkedHashMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.types.C4871;

/* JADX INFO: renamed from: 飘花落叶言世楪哲子苏兰.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6941 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f18513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6925 f18514;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6925 f18515;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6925 f18516 = new C6925(NullabilityQualifier.NULLABLE, false);

    static {
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        f18515 = new C6925(nullabilityQualifier, false);
        f18514 = new C6925(nullabilityQualifier, true);
        String strConcat = "java/lang/".concat("Object");
        String strConcat2 = "java/util/function/".concat("Predicate");
        String strConcat3 = "java/util/function/".concat("Function");
        String strConcat4 = "java/util/function/".concat("Consumer");
        String strConcat5 = "java/util/function/".concat("BiFunction");
        String strConcat6 = "java/util/function/".concat("BiConsumer");
        String strConcat7 = "java/util/function/".concat("UnaryOperator");
        String strConcat8 = "java/util/".concat("stream/Stream");
        String strConcat9 = "java/util/".concat("Optional");
        C6937 c6937 = new C6937(0);
        new C4871(9, c6937, "java/util/".concat("Iterator"), false).m9759("forEachRemaining", null, new C6939(strConcat4, 0));
        new C4871(9, c6937, "java/lang/".concat("Iterable"), false).m9759("spliterator", null, new C6934(4));
        C4871 c4871 = new C4871(9, c6937, "java/util/".concat("Collection"), false);
        c4871.m9759("removeIf", null, new C6939(strConcat2, 17));
        c4871.m9759("stream", null, new C6939(strConcat8, 26));
        c4871.m9759("parallelStream", null, new C6944(strConcat8, 1));
        C4871 c48712 = new C4871(9, c6937, "java/util/".concat("List"), false);
        c48712.m9759("replaceAll", null, new C6944(strConcat7, 2));
        c48712.m9759("addFirst", "2.1", new C6944(strConcat, 3));
        c48712.m9759("addLast", "2.1", new C6944(strConcat, 4));
        c48712.m9759("removeFirst", "2.1", new C6944(strConcat, 5));
        c48712.m9759("removeLast", "2.1", new C6944(strConcat, 6));
        C4871 c48713 = new C4871(9, c6937, "java/util/".concat("LinkedList"), false);
        c48713.m9759("addFirst", "2.1", new C6939(strConcat, 1));
        c48713.m9759("addLast", "2.1", new C6939(strConcat, 2));
        c48713.m9759("removeFirst", "2.1", new C6939(strConcat, 3));
        c48713.m9759("removeLast", "2.1", new C6939(strConcat, 4));
        C4871 c48714 = new C4871(9, c6937, "java/util/".concat("LinkedHashSet"), false);
        c48714.m9759("addFirst", "2.2", new C6939(strConcat, 5));
        c48714.m9759("addLast", "2.2", new C6939(strConcat, 6));
        c48714.m9759("removeFirst", "2.2", new C6939(strConcat, 7));
        c48714.m9759("removeLast", "2.2", new C6939(strConcat, 8));
        c48714.m9759("getFirst", "2.2", new C6939(strConcat, 9));
        c48714.m9759("getLast", "2.2", new C6939(strConcat, 10));
        C4871 c48715 = new C4871(9, c6937, "java/util/".concat("Map"), false);
        c48715.m9759("forEach", null, new C6939(strConcat6, 11));
        c48715.m9759("putIfAbsent", null, new C6939(strConcat, 12));
        c48715.m9759("replace", null, new C6939(strConcat, 13));
        c48715.m9759("replace", null, new C6939(strConcat, 14));
        c48715.m9759("replaceAll", null, new C6939(strConcat5, 15));
        c48715.m9759("compute", null, new C6943(0, strConcat, strConcat5));
        c48715.m9759("computeIfAbsent", null, new C6943(1, strConcat, strConcat3));
        c48715.m9759("computeIfPresent", null, new C6943(2, strConcat, strConcat5));
        c48715.m9759("merge", null, new C6943(3, strConcat, strConcat5));
        C4871 c48716 = new C4871(9, c6937, "java/util/".concat("LinkedHashMap"), false);
        c48716.m9759("putFirst", "2.2", new C6939(strConcat, 16));
        c48716.m9759("putLast", "2.2", new C6939(strConcat, 18));
        C4871 c48717 = new C4871(9, c6937, strConcat9, false);
        c48717.m9759("empty", null, new C6939(strConcat9, 19));
        c48717.m9759("of", null, new C6943(4, strConcat, strConcat9));
        c48717.m9759("ofNullable", null, new C6943(5, strConcat, strConcat9));
        c48717.m9759("get", null, new C6939(strConcat, 20));
        c48717.m9759("ifPresent", null, new C6939(strConcat4, 21));
        new C4871(9, c6937, "java/lang/".concat("ref/Reference"), false).m9759("get", null, new C6939(strConcat, 22));
        new C4871(9, c6937, strConcat2, false).m9759("test", null, new C6939(strConcat, 23));
        new C4871(9, c6937, "java/util/function/".concat("BiPredicate"), false).m9759("test", null, new C6939(strConcat, 24));
        new C4871(9, c6937, strConcat4, false).m9759("accept", null, new C6939(strConcat, 25));
        new C4871(9, c6937, strConcat6, false).m9759("accept", null, new C6939(strConcat, 27));
        new C4871(9, c6937, strConcat3, false).m9759("apply", null, new C6939(strConcat, 28));
        new C4871(9, c6937, strConcat5, false).m9759("apply", null, new C6939(strConcat, 29));
        new C4871(9, c6937, "java/util/function/".concat("Supplier"), false).m9759("get", null, new C6944(strConcat, 0));
        f18513 = c6937.f18504;
    }
}
