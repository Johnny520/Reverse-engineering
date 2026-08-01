package kotlin.reflect.jvm.internal.impl.name;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4693 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public static final C4688 f13713;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C4688 f13714;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C4688 f13715;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4687 f13716;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4687 f13717;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4687 f13718;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4687 f13719;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4687 f13720;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4687 f13721;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4688 f13722;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4688 f13723;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final Set f13724;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C4688 f13725;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C4688 f13726;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final Set f13727;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C4688 f13728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C4688 f13729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4688 f13730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4688 f13731;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C4688 f13732;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C4688 f13733;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4687 f13734;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4687 f13735;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C4688 f13736;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C4688 f13737;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4688 f13738;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4688 f13739;

    static {
        C4687 c4687 = new C4687("kotlin");
        f13721 = c4687;
        C4687 c4687M9321 = c4687.m9321(C4691.m9330("reflect"));
        f13720 = c4687M9321;
        c4687.m9321(C4691.m9330("experimental"));
        C4687 c4687M93212 = c4687.m9321(C4691.m9330("collections"));
        f13719 = c4687M93212;
        c4687.m9321(C4691.m9330("sequences"));
        C4687 c4687M93213 = c4687.m9321(C4691.m9330("ranges"));
        f13718 = c4687M93213;
        C4687 c4687M93214 = c4687.m9321(C4691.m9330("jvm"));
        c4687.m9321(C4691.m9330("js"));
        c4687.m9321(C4691.m9330("annotations")).m9321(C4691.m9330("jvm"));
        c4687M93214.m9321(C4691.m9330("internal"));
        c4687M93214.m9321(C4691.m9330("functions"));
        C4687 c4687M93215 = c4687.m9321(C4691.m9330("annotation"));
        f13717 = c4687M93215;
        C4687 c4687M93216 = c4687.m9321(C4691.m9330("internal"));
        c4687M93216.m9321(C4691.m9330("ir"));
        C4687 c4687M93217 = c4687.m9321(C4691.m9330("coroutines"));
        f13716 = c4687M93217;
        c4687M93217.m9321(C4691.m9330("intrinsics"));
        f13735 = c4687.m9321(C4691.m9330("enums"));
        c4687.m9321(C4691.m9330("contracts"));
        C4687 c4687M93218 = c4687.m9321(C4691.m9330("concurrent")).m9321(C4691.m9330("atomics"));
        f13734 = c4687M93218;
        c4687.m9321(C4691.m9330("test"));
        c4687.m9321(C4691.m9330("text"));
        AbstractC4347.m8845(new C4687[]{c4687, c4687M93212, c4687M93213, c4687M93215});
        AbstractC4347.m8845(new C4687[]{c4687, c4687M93212, c4687M93213, c4687M93215, c4687M9321, c4687M93216, c4687M93217, c4687M93218});
        AbstractC4684.m9303("Nothing");
        f13738 = AbstractC4684.m9303("Unit");
        f13739 = AbstractC4684.m9303("Any");
        f13736 = AbstractC4684.m9303("Enum");
        AbstractC4684.m9303("Annotation");
        f13737 = AbstractC4684.m9303("Array");
        C4688 c4688M9303 = AbstractC4684.m9303("Boolean");
        f13729 = c4688M9303;
        C4688 c4688M93032 = AbstractC4684.m9303("Char");
        C4688 c4688M93033 = AbstractC4684.m9303("Byte");
        C4688 c4688M93034 = AbstractC4684.m9303("Short");
        C4688 c4688M93035 = AbstractC4684.m9303("Int");
        f13728 = c4688M93035;
        C4688 c4688M93036 = AbstractC4684.m9303("Long");
        f13732 = c4688M93036;
        C4688 c4688M93037 = AbstractC4684.m9303("Float");
        C4688 c4688M93038 = AbstractC4684.m9303("Double");
        f13733 = AbstractC4684.m9306(c4688M93033);
        f13730 = AbstractC4684.m9306(c4688M93034);
        f13731 = AbstractC4684.m9306(c4688M93035);
        f13723 = AbstractC4684.m9306(c4688M93036);
        AbstractC4684.m9303("CharSequence");
        f13722 = AbstractC4684.m9303("String");
        AbstractC4684.m9303("Throwable");
        AbstractC4684.m9303("Cloneable");
        AbstractC4684.m9299("KProperty");
        AbstractC4684.m9299("KMutableProperty");
        AbstractC4684.m9299("KProperty0");
        AbstractC4684.m9299("KMutableProperty0");
        AbstractC4684.m9299("KProperty1");
        AbstractC4684.m9299("KMutableProperty1");
        AbstractC4684.m9299("KProperty2");
        AbstractC4684.m9299("KMutableProperty2");
        f13726 = AbstractC4684.m9299("KFunction");
        AbstractC4684.m9299("KClass");
        AbstractC4684.m9299("KCallable");
        AbstractC4684.m9299("KType");
        AbstractC4684.m9308(C4691.m9330("Sequence")).f13696.m9314();
        AbstractC4684.m9303("Comparable");
        AbstractC4684.m9303("Number");
        AbstractC4684.m9303("Function");
        AbstractC4684.m9308(C4691.m9330("SuspendFunction")).f13696.m9314();
        Set setM8845 = AbstractC4347.m8845(new C4688[]{c4688M9303, c4688M93032, c4688M93033, c4688M93034, c4688M93035, c4688M93036, c4688M93037, c4688M93038});
        f13727 = setM8845;
        AbstractC4347.m8845(new C4688[]{c4688M93033, c4688M93034, c4688M93035, c4688M93036});
        Set set = setM8845;
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(set, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        for (Object obj : set) {
            linkedHashMap.put(obj, AbstractC4684.m9300(((C4688) obj).m9323()));
        }
        AbstractC4684.m9301(linkedHashMap);
        Set setM88452 = AbstractC4347.m8845(new C4688[]{f13733, f13730, f13731, f13723});
        f13724 = setM88452;
        Set set2 = setM88452;
        int iM87722 = AbstractC4339.m8772(AbstractC4345.m8822(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM87722 >= 16 ? iM87722 : 16);
        for (Object obj2 : set2) {
            linkedHashMap2.put(obj2, AbstractC4684.m9300(((C4688) obj2).m9323()));
        }
        AbstractC4684.m9301(linkedHashMap2);
        Set set3 = f13727;
        Set set4 = f13724;
        LinkedHashSet linkedHashSetM13054 = AbstractC7739.m13054(set3, set4);
        C4688 c4688 = f13722;
        AbstractC7739.m13053(linkedHashSetM13054, c4688);
        C4687 c46872 = f13716;
        C4691 c4691M9330 = C4691.m9330("Continuation");
        c46872.getClass();
        C4687 c46873 = C4687.f13694;
        AbstractC4684.m9308(c4691M9330).f13696.m9314();
        AbstractC4684.m9302("Iterator");
        AbstractC4684.m9302("Iterable");
        AbstractC4684.m9302("Collection");
        AbstractC4684.m9302("List");
        AbstractC4684.m9302("ListIterator");
        AbstractC4684.m9302("Set");
        C4688 c4688M9302 = AbstractC4684.m9302("Map");
        AbstractC4684.m9302("AbstractMap");
        AbstractC4684.m9302("MutableIterator");
        AbstractC4684.m9302("CharIterator");
        AbstractC4684.m9302("MutableIterable");
        AbstractC4684.m9302("MutableCollection");
        f13725 = AbstractC4684.m9302("MutableList");
        AbstractC4684.m9302("MutableListIterator");
        f13715 = AbstractC4684.m9302("MutableSet");
        C4688 c4688M93022 = AbstractC4684.m9302("MutableMap");
        f13714 = c4688M93022;
        c4688M9302.m9325(C4691.m9330("Entry"));
        c4688M93022.m9325(C4691.m9330("MutableEntry"));
        AbstractC4684.m9303("Result");
        C4687 c46874 = f13718;
        C4691 c4691M93302 = C4691.m9330("IntRange");
        c46874.getClass();
        AbstractC4684.m9308(c4691M93302).f13696.m9314();
        AbstractC4684.m9308(C4691.m9330("LongRange")).f13696.m9314();
        AbstractC4684.m9308(C4691.m9330("CharRange")).f13696.m9314();
        C4687 c46875 = f13717;
        C4691 c4691M93303 = C4691.m9330("AnnotationRetention");
        c46875.getClass();
        AbstractC4684.m9308(c4691M93303).f13696.m9314();
        AbstractC4684.m9308(C4691.m9330("AnnotationTarget")).f13696.m9314();
        AbstractC4684.m9303("DeprecationLevel");
        f13713 = new C4688(f13735, C4691.m9330("EnumEntries"));
        C4688 c4688M9304 = AbstractC4684.m9304("AtomicBoolean");
        C4688 c4688M93042 = AbstractC4684.m9304("AtomicInt");
        C4688 c4688M93043 = AbstractC4684.m9304("AtomicLong");
        AbstractC4684.m9304("AtomicReference");
        Pair pair = new Pair(f13729, c4688M9304);
        C4688 c46882 = f13728;
        Pair pair2 = new Pair(c46882, c4688M93042);
        C4688 c46883 = f13732;
        AbstractC4339.m8774(pair, pair2, new Pair(c46883, c4688M93043));
        AbstractC4684.m9304("AtomicArray");
        AbstractC4339.m8774(new Pair(c46882, AbstractC4684.m9304("AtomicIntArray")), new Pair(c46883, AbstractC4684.m9304("AtomicLongArray")));
        AbstractC7739.m13053(AbstractC7739.m13053(AbstractC7739.m13053(AbstractC7739.m13053(AbstractC7739.m13054(set3, set4), c4688), f13738), f13739), f13736);
    }
}
