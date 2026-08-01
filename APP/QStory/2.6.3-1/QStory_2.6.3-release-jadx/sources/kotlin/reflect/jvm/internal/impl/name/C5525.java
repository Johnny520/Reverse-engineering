package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5525 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C5520 f14058;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C5520 f14059;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C5520 f14060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5519 f14061;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C5519 f14062;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5519 f14063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5519 f14064;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5519 f14065;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5519 f14066;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5520 f14067;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5520 f14068;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final Set f14069;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C5520 f14070;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5520 f14071;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Set f14072;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C5520 f14073;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C5520 f14074;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5520 f14075;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5520 f14076;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C5520 f14077;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C5520 f14078;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5519 f14079;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5519 f14080;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C5520 f14081;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C5520 f14082;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C5520 f14083;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C5520 f14084;

    static {
        C5519 c5519 = new C5519("kotlin");
        f14066 = c5519;
        C5519 c5519M9880 = c5519.m9880(C5523.m9889("reflect"));
        f14065 = c5519M9880;
        c5519.m9880(C5523.m9889("experimental"));
        C5519 c5519M98802 = c5519.m9880(C5523.m9889("collections"));
        f14064 = c5519M98802;
        c5519.m9880(C5523.m9889("sequences"));
        C5519 c5519M98803 = c5519.m9880(C5523.m9889("ranges"));
        f14063 = c5519M98803;
        C5519 c5519M98804 = c5519.m9880(C5523.m9889("jvm"));
        c5519.m9880(C5523.m9889("js"));
        c5519.m9880(C5523.m9889("annotations")).m9880(C5523.m9889("jvm"));
        c5519M98804.m9880(C5523.m9889("internal"));
        c5519M98804.m9880(C5523.m9889("functions"));
        C5519 c5519M98805 = c5519.m9880(C5523.m9889("annotation"));
        f14062 = c5519M98805;
        C5519 c5519M98806 = c5519.m9880(C5523.m9889("internal"));
        c5519M98806.m9880(C5523.m9889("ir"));
        C5519 c5519M98807 = c5519.m9880(C5523.m9889("coroutines"));
        f14061 = c5519M98807;
        c5519M98807.m9880(C5523.m9889("intrinsics"));
        f14080 = c5519.m9880(C5523.m9889("enums"));
        c5519.m9880(C5523.m9889("contracts"));
        C5519 c5519M98808 = c5519.m9880(C5523.m9889("concurrent")).m9880(C5523.m9889("atomics"));
        f14079 = c5519M98808;
        c5519.m9880(C5523.m9889("test"));
        c5519.m9880(C5523.m9889("text"));
        AbstractC5179.m9404(new C5519[]{c5519, c5519M98802, c5519M98803, c5519M98805});
        AbstractC5179.m9404(new C5519[]{c5519, c5519M98802, c5519M98803, c5519M98805, c5519M9880, c5519M98806, c5519M98807, c5519M98808});
        AbstractC5516.m9862("Nothing");
        f14083 = AbstractC5516.m9862("Unit");
        f14084 = AbstractC5516.m9862("Any");
        f14081 = AbstractC5516.m9862("Enum");
        AbstractC5516.m9862("Annotation");
        f14082 = AbstractC5516.m9862("Array");
        C5520 c5520M9862 = AbstractC5516.m9862("Boolean");
        f14074 = c5520M9862;
        C5520 c5520M98622 = AbstractC5516.m9862("Char");
        C5520 c5520M98623 = AbstractC5516.m9862("Byte");
        C5520 c5520M98624 = AbstractC5516.m9862("Short");
        C5520 c5520M98625 = AbstractC5516.m9862("Int");
        f14073 = c5520M98625;
        C5520 c5520M98626 = AbstractC5516.m9862("Long");
        f14077 = c5520M98626;
        C5520 c5520M98627 = AbstractC5516.m9862("Float");
        C5520 c5520M98628 = AbstractC5516.m9862("Double");
        f14078 = AbstractC5516.m9865(c5520M98623);
        f14075 = AbstractC5516.m9865(c5520M98624);
        f14076 = AbstractC5516.m9865(c5520M98625);
        f14068 = AbstractC5516.m9865(c5520M98626);
        AbstractC5516.m9862("CharSequence");
        f14067 = AbstractC5516.m9862("String");
        AbstractC5516.m9862("Throwable");
        AbstractC5516.m9862("Cloneable");
        AbstractC5516.m9858("KProperty");
        AbstractC5516.m9858("KMutableProperty");
        AbstractC5516.m9858("KProperty0");
        AbstractC5516.m9858("KMutableProperty0");
        AbstractC5516.m9858("KProperty1");
        AbstractC5516.m9858("KMutableProperty1");
        AbstractC5516.m9858("KProperty2");
        AbstractC5516.m9858("KMutableProperty2");
        f14071 = AbstractC5516.m9858("KFunction");
        AbstractC5516.m9858("KClass");
        AbstractC5516.m9858("KCallable");
        AbstractC5516.m9858("KType");
        AbstractC5516.m9867(C5523.m9889("Sequence")).f14041.m9873();
        AbstractC5516.m9862("Comparable");
        AbstractC5516.m9862("Number");
        AbstractC5516.m9862("Function");
        AbstractC5516.m9867(C5523.m9889("SuspendFunction")).f14041.m9873();
        Set setM9404 = AbstractC5179.m9404(new C5520[]{c5520M9862, c5520M98622, c5520M98623, c5520M98624, c5520M98625, c5520M98626, c5520M98627, c5520M98628});
        f14072 = setM9404;
        AbstractC5179.m9404(new C5520[]{c5520M98623, c5520M98624, c5520M98625, c5520M98626});
        Set set = setM9404;
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(set, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        for (Object obj : set) {
            linkedHashMap.put(obj, AbstractC5516.m9859(((C5520) obj).m9882()));
        }
        AbstractC5516.m9860(linkedHashMap);
        Set setM94042 = AbstractC5179.m9404(new C5520[]{f14078, f14075, f14076, f14068});
        f14069 = setM94042;
        Set set2 = setM94042;
        int iM93312 = AbstractC5171.m9331(AbstractC5177.m9381(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM93312 >= 16 ? iM93312 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, AbstractC5516.m9859(((C5520) obj2).m9882()));
        }
        AbstractC5516.m9860(linkedHashMap2);
        Set set3 = f14072;
        Set set4 = f14069;
        LinkedHashSet linkedHashSetM13613 = AbstractC8568.m13613(set3, set4);
        C5520 c5520 = f14067;
        AbstractC8568.m13612(linkedHashSetM13613, c5520);
        C5519 c55192 = f14061;
        C5523 c5523M9889 = C5523.m9889("Continuation");
        c55192.getClass();
        C5519 c55193 = C5519.f14039;
        AbstractC5516.m9867(c5523M9889).f14041.m9873();
        AbstractC5516.m9861("Iterator");
        AbstractC5516.m9861("Iterable");
        AbstractC5516.m9861("Collection");
        AbstractC5516.m9861("List");
        AbstractC5516.m9861("ListIterator");
        AbstractC5516.m9861("Set");
        C5520 c5520M9861 = AbstractC5516.m9861("Map");
        AbstractC5516.m9861("AbstractMap");
        AbstractC5516.m9861("MutableIterator");
        AbstractC5516.m9861("CharIterator");
        AbstractC5516.m9861("MutableIterable");
        AbstractC5516.m9861("MutableCollection");
        f14070 = AbstractC5516.m9861("MutableList");
        AbstractC5516.m9861("MutableListIterator");
        f14060 = AbstractC5516.m9861("MutableSet");
        C5520 c5520M98612 = AbstractC5516.m9861("MutableMap");
        f14059 = c5520M98612;
        c5520M9861.m9884(C5523.m9889("Entry"));
        c5520M98612.m9884(C5523.m9889("MutableEntry"));
        AbstractC5516.m9862("Result");
        C5519 c55194 = f14063;
        C5523 c5523M98892 = C5523.m9889("IntRange");
        c55194.getClass();
        AbstractC5516.m9867(c5523M98892).f14041.m9873();
        AbstractC5516.m9867(C5523.m9889("LongRange")).f14041.m9873();
        AbstractC5516.m9867(C5523.m9889("CharRange")).f14041.m9873();
        C5519 c55195 = f14062;
        C5523 c5523M98893 = C5523.m9889("AnnotationRetention");
        c55195.getClass();
        AbstractC5516.m9867(c5523M98893).f14041.m9873();
        AbstractC5516.m9867(C5523.m9889("AnnotationTarget")).f14041.m9873();
        AbstractC5516.m9862("DeprecationLevel");
        f14058 = new C5520(f14080, C5523.m9889("EnumEntries"));
        C5520 c5520M9863 = AbstractC5516.m9863("AtomicBoolean");
        C5520 c5520M98632 = AbstractC5516.m9863("AtomicInt");
        C5520 c5520M98633 = AbstractC5516.m9863("AtomicLong");
        AbstractC5516.m9863("AtomicReference");
        Pair pair = new Pair(f14074, c5520M9863);
        C5520 c55202 = f14073;
        Pair pair2 = new Pair(c55202, c5520M98632);
        C5520 c55203 = f14077;
        AbstractC5171.m9333(pair, pair2, new Pair(c55203, c5520M98633));
        AbstractC5516.m9863("AtomicArray");
        AbstractC5171.m9333(new Pair(c55202, AbstractC5516.m9863("AtomicIntArray")), new Pair(c55203, AbstractC5516.m9863("AtomicLongArray")));
        AbstractC8568.m13612(AbstractC8568.m13612(AbstractC8568.m13612(AbstractC8568.m13612(AbstractC8568.m13613(set3, set4), c5520), f14083), f14084), f14081);
    }
}
