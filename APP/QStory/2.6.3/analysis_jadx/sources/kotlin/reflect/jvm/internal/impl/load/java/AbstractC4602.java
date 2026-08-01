package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4602 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Set f13438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Set f13439;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f13440;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f13441;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ArrayList f13442;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ArrayList f13443;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Map f13444;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4603 f13445;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final LinkedHashMap f13446;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final LinkedHashMap f13447;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final HashSet f13448;

    static {
        Set<String> setM8845 = AbstractC4347.m8845(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC4345.m8822(setM8845, 10));
        for (String str : setM8845) {
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            desc.getClass();
            arrayList.add(C4625.m9236("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f13443 = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4603) it.next()).f13449);
        }
        f13442 = arrayList2;
        ArrayList arrayList3 = f13443;
        ArrayList arrayList4 = new ArrayList(AbstractC4345.m8822(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C4603) it2.next()).f13452.m9335());
        }
        String strConcat = "java/util/".concat("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        desc2.getClass();
        C4603 c4603M9236 = C4625.m9236(strConcat, "contains", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc2);
        SpecialGenericSignatures$TypeSafeBarrierDescription specialGenericSignatures$TypeSafeBarrierDescription = SpecialGenericSignatures$TypeSafeBarrierDescription.FALSE;
        Pair pair = new Pair(c4603M9236, specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat2 = "java/util/".concat("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        desc3.getClass();
        Pair pair2 = new Pair(C4625.m9236(strConcat2, "remove", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc3), specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat3 = "java/util/".concat("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        desc4.getClass();
        Pair pair3 = new Pair(C4625.m9236(strConcat3, "containsKey", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc4), specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat4 = "java/util/".concat("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        desc5.getClass();
        Pair pair4 = new Pair(C4625.m9236(strConcat4, "containsValue", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc5), specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat5 = "java/util/".concat("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        desc6.getClass();
        Pair pair5 = new Pair(C4625.m9236(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), specialGenericSignatures$TypeSafeBarrierDescription);
        Pair pair6 = new Pair(C4625.m9236("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), SpecialGenericSignatures$TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        C4603 c4603M92362 = C4625.m9236("java/util/".concat("Map"), "get", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR);
        SpecialGenericSignatures$TypeSafeBarrierDescription specialGenericSignatures$TypeSafeBarrierDescription2 = SpecialGenericSignatures$TypeSafeBarrierDescription.NULL;
        Pair pair7 = new Pair(c4603M92362, specialGenericSignatures$TypeSafeBarrierDescription2);
        Pair pair8 = new Pair(C4625.m9236("java/util/".concat("Map"), "remove", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), specialGenericSignatures$TypeSafeBarrierDescription2);
        String strConcat6 = "java/util/".concat("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        desc7.getClass();
        C4603 c4603M92363 = C4625.m9236(strConcat6, "indexOf", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc7);
        SpecialGenericSignatures$TypeSafeBarrierDescription specialGenericSignatures$TypeSafeBarrierDescription3 = SpecialGenericSignatures$TypeSafeBarrierDescription.INDEX;
        Pair pair9 = new Pair(c4603M92363, specialGenericSignatures$TypeSafeBarrierDescription3);
        String strConcat7 = "java/util/".concat("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        desc8.getClass();
        Map mapM8774 = AbstractC4339.m8774(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(C4625.m9236(strConcat7, "lastIndexOf", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc8), specialGenericSignatures$TypeSafeBarrierDescription3));
        f13441 = mapM8774;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC4339.m8772(mapM8774.size()));
        for (Map.Entry entry : mapM8774.entrySet()) {
            linkedHashMap.put(((C4603) entry.getKey()).f13449, entry.getValue());
        }
        f13440 = linkedHashMap;
        LinkedHashSet linkedHashSetM13054 = AbstractC7739.m13054(f13441.keySet(), f13443);
        ArrayList arrayList5 = new ArrayList(AbstractC4345.m8822(linkedHashSetM13054, 10));
        Iterator it3 = linkedHashSetM13054.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C4603) it3.next()).f13452);
        }
        f13439 = AbstractC4344.m8788(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC4345.m8822(linkedHashSetM13054, 10));
        Iterator it4 = linkedHashSetM13054.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C4603) it4.next()).f13449);
        }
        f13438 = AbstractC4344.m8788(arrayList6);
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        desc9.getClass();
        C4603 c4603M92364 = C4625.m9236("java/util/List", "removeAt", desc9, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR);
        f13445 = c4603M92364;
        String strConcat8 = "java/lang/".concat("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        desc10.getClass();
        Pair pair10 = new Pair(C4625.m9236(strConcat8, "toByte", "", desc10), C4691.m9330("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        desc11.getClass();
        Pair pair11 = new Pair(C4625.m9236(strConcat9, "toShort", "", desc11), C4691.m9330("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        desc12.getClass();
        Pair pair12 = new Pair(C4625.m9236(strConcat10, "toInt", "", desc12), C4691.m9330("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        desc13.getClass();
        Pair pair13 = new Pair(C4625.m9236(strConcat11, "toLong", "", desc13), C4691.m9330("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        desc14.getClass();
        Pair pair14 = new Pair(C4625.m9236(strConcat12, "toFloat", "", desc14), C4691.m9330("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        desc15.getClass();
        Pair pair15 = new Pair(C4625.m9236(strConcat13, "toDouble", "", desc15), C4691.m9330("doubleValue"));
        Pair pair16 = new Pair(c4603M92364, C4691.m9330("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        desc16.getClass();
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        desc17.getClass();
        Map mapM87742 = AbstractC4339.m8774(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(C4625.m9236(strConcat14, "get", desc16, desc17), C4691.m9330("charAt")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), C4691.m9330("get")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), C4691.m9330("set")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), C4691.m9330("getAndSet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), C4691.m9330("getAndAdd")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), C4691.m9330("addAndGet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), C4691.m9330("get")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), C4691.m9330("set")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), C4691.m9330("getAndSet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), C4691.m9330("getAndAdd")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), C4691.m9330("addAndGet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), C4691.m9330("get")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), C4691.m9330("set")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), C4691.m9330("getAndSet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C4691.m9330("get")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicReference"), "store", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "V"), C4691.m9330("set")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C4691.m9330("getAndSet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), C4691.m9330("get")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), C4691.m9330("set")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), C4691.m9330("getAndSet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), C4691.m9330("compareAndSet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), C4691.m9330("getAndAdd")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), C4691.m9330("addAndGet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), C4691.m9330("get")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), C4691.m9330("set")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), C4691.m9330("getAndSet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), C4691.m9330("compareAndSet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), C4691.m9330("getAndAdd")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), C4691.m9330("addAndGet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C4691.m9330("get")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), C4691.m9330("set")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C4691.m9330("getAndSet")), new Pair(C4625.m9236("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), C4691.m9330("compareAndSet")));
        f13444 = mapM87742;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4339.m8772(mapM87742.size()));
        for (Map.Entry entry2 : mapM87742.entrySet()) {
            linkedHashMap2.put(((C4603) entry2.getKey()).f13449, entry2.getValue());
        }
        f13447 = linkedHashMap2;
        Map map = f13444;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            C4603 c4603 = (C4603) entry3.getKey();
            C4691 c4691 = (C4691) entry3.getValue();
            String str2 = c4603.f13453;
            String str3 = c4603.f13451;
            String str4 = c4603.f13450;
            c4691.getClass();
            linkedHashSet.add(str2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + (c4691 + '(' + str3 + ')' + str4));
        }
        Set setKeySet = f13444.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((C4603) it5.next()).f13452);
        }
        f13448 = hashSet;
        Set<Map.Entry> setEntrySet = f13444.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(AbstractC4345.m8822(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new Pair(((C4603) entry4.getKey()).f13452, entry4.getValue()));
        }
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(arrayList7, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM8772);
        for (Pair pair17 : arrayList7) {
            linkedHashMap3.put((C4691) pair17.getSecond(), (C4691) pair17.getFirst());
        }
        f13446 = linkedHashMap3;
    }
}
