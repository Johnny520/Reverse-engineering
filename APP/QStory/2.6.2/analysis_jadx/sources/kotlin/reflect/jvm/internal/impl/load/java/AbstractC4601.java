package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4601 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Set f13434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Set f13435;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f13436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f13437;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ArrayList f13438;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ArrayList f13439;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Map f13440;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4602 f13441;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final LinkedHashMap f13442;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final LinkedHashMap f13443;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final HashSet f13444;

    static {
        Set<String> setM8852 = AbstractC4346.m8852(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC4344.m8832(setM8852, 10));
        for (String str : setM8852) {
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            desc.getClass();
            arrayList.add(C4624.m9246("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f13439 = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C4602) it.next()).f13445);
        }
        f13438 = arrayList2;
        ArrayList arrayList3 = f13439;
        ArrayList arrayList4 = new ArrayList(AbstractC4344.m8832(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C4602) it2.next()).f13448.m9345());
        }
        String strConcat = "java/util/".concat("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        desc2.getClass();
        C4602 c4602M9246 = C4624.m9246(strConcat, "contains", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc2);
        SpecialGenericSignatures$TypeSafeBarrierDescription specialGenericSignatures$TypeSafeBarrierDescription = SpecialGenericSignatures$TypeSafeBarrierDescription.FALSE;
        Pair pair = new Pair(c4602M9246, specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat2 = "java/util/".concat("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        desc3.getClass();
        Pair pair2 = new Pair(C4624.m9246(strConcat2, "remove", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc3), specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat3 = "java/util/".concat("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        desc4.getClass();
        Pair pair3 = new Pair(C4624.m9246(strConcat3, "containsKey", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc4), specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat4 = "java/util/".concat("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        desc5.getClass();
        Pair pair4 = new Pair(C4624.m9246(strConcat4, "containsValue", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc5), specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat5 = "java/util/".concat("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        desc6.getClass();
        Pair pair5 = new Pair(C4624.m9246(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), specialGenericSignatures$TypeSafeBarrierDescription);
        Pair pair6 = new Pair(C4624.m9246("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), SpecialGenericSignatures$TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        C4602 c4602M92462 = C4624.m9246("java/util/".concat("Map"), "get", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR);
        SpecialGenericSignatures$TypeSafeBarrierDescription specialGenericSignatures$TypeSafeBarrierDescription2 = SpecialGenericSignatures$TypeSafeBarrierDescription.NULL;
        Pair pair7 = new Pair(c4602M92462, specialGenericSignatures$TypeSafeBarrierDescription2);
        Pair pair8 = new Pair(C4624.m9246("java/util/".concat("Map"), "remove", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), specialGenericSignatures$TypeSafeBarrierDescription2);
        String strConcat6 = "java/util/".concat("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        desc7.getClass();
        C4602 c4602M92463 = C4624.m9246(strConcat6, "indexOf", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc7);
        SpecialGenericSignatures$TypeSafeBarrierDescription specialGenericSignatures$TypeSafeBarrierDescription3 = SpecialGenericSignatures$TypeSafeBarrierDescription.INDEX;
        Pair pair9 = new Pair(c4602M92463, specialGenericSignatures$TypeSafeBarrierDescription3);
        String strConcat7 = "java/util/".concat("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        desc8.getClass();
        Map mapM8777 = AbstractC4338.m8777(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(C4624.m9246(strConcat7, "lastIndexOf", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc8), specialGenericSignatures$TypeSafeBarrierDescription3));
        f13437 = mapM8777;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC4338.m8779(mapM8777.size()));
        for (Map.Entry entry : mapM8777.entrySet()) {
            linkedHashMap.put(((C4602) entry.getKey()).f13445, entry.getValue());
        }
        f13436 = linkedHashMap;
        LinkedHashSet linkedHashSetM1156 = AbstractC0455.m1156(f13437.keySet(), f13439);
        ArrayList arrayList5 = new ArrayList(AbstractC4344.m8832(linkedHashSetM1156, 10));
        Iterator it3 = linkedHashSetM1156.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C4602) it3.next()).f13448);
        }
        f13435 = AbstractC4343.m8800(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC4344.m8832(linkedHashSetM1156, 10));
        Iterator it4 = linkedHashSetM1156.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C4602) it4.next()).f13445);
        }
        f13434 = AbstractC4343.m8800(arrayList6);
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        desc9.getClass();
        C4602 c4602M92464 = C4624.m9246("java/util/List", "removeAt", desc9, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR);
        f13441 = c4602M92464;
        String strConcat8 = "java/lang/".concat("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        desc10.getClass();
        Pair pair10 = new Pair(C4624.m9246(strConcat8, "toByte", "", desc10), C4690.m9340("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        desc11.getClass();
        Pair pair11 = new Pair(C4624.m9246(strConcat9, "toShort", "", desc11), C4690.m9340("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        desc12.getClass();
        Pair pair12 = new Pair(C4624.m9246(strConcat10, "toInt", "", desc12), C4690.m9340("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        desc13.getClass();
        Pair pair13 = new Pair(C4624.m9246(strConcat11, "toLong", "", desc13), C4690.m9340("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        desc14.getClass();
        Pair pair14 = new Pair(C4624.m9246(strConcat12, "toFloat", "", desc14), C4690.m9340("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        desc15.getClass();
        Pair pair15 = new Pair(C4624.m9246(strConcat13, "toDouble", "", desc15), C4690.m9340("doubleValue"));
        Pair pair16 = new Pair(c4602M92464, C4690.m9340("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        desc16.getClass();
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        desc17.getClass();
        Map mapM87772 = AbstractC4338.m8777(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(C4624.m9246(strConcat14, "get", desc16, desc17), C4690.m9340("charAt")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), C4690.m9340("get")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), C4690.m9340("set")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), C4690.m9340("getAndSet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), C4690.m9340("getAndAdd")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), C4690.m9340("addAndGet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), C4690.m9340("get")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), C4690.m9340("set")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), C4690.m9340("getAndSet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), C4690.m9340("getAndAdd")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), C4690.m9340("addAndGet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), C4690.m9340("get")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), C4690.m9340("set")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), C4690.m9340("getAndSet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C4690.m9340("get")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicReference"), "store", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "V"), C4690.m9340("set")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C4690.m9340("getAndSet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), C4690.m9340("get")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), C4690.m9340("set")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), C4690.m9340("getAndSet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), C4690.m9340("compareAndSet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), C4690.m9340("getAndAdd")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), C4690.m9340("addAndGet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), C4690.m9340("get")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), C4690.m9340("set")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), C4690.m9340("getAndSet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), C4690.m9340("compareAndSet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), C4690.m9340("getAndAdd")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), C4690.m9340("addAndGet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C4690.m9340("get")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), C4690.m9340("set")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C4690.m9340("getAndSet")), new Pair(C4624.m9246("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), C4690.m9340("compareAndSet")));
        f13440 = mapM87772;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4338.m8779(mapM87772.size()));
        for (Map.Entry entry2 : mapM87772.entrySet()) {
            linkedHashMap2.put(((C4602) entry2.getKey()).f13445, entry2.getValue());
        }
        f13443 = linkedHashMap2;
        Map map = f13440;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            C4602 c4602 = (C4602) entry3.getKey();
            C4690 c4690 = (C4690) entry3.getValue();
            String str2 = c4602.f13449;
            String str3 = c4602.f13447;
            String str4 = c4602.f13446;
            c4690.getClass();
            linkedHashSet.add(str2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + (c4690 + '(' + str3 + ')' + str4));
        }
        Set setKeySet = f13440.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((C4602) it5.next()).f13448);
        }
        f13444 = hashSet;
        Set<Map.Entry> setEntrySet = f13440.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(AbstractC4344.m8832(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new Pair(((C4602) entry4.getKey()).f13448, entry4.getValue()));
        }
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(arrayList7, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM8779);
        for (Pair pair17 : arrayList7) {
            linkedHashMap3.put((C4690) pair17.getSecond(), (C4690) pair17.getFirst());
        }
        f13442 = linkedHashMap3;
    }
}
