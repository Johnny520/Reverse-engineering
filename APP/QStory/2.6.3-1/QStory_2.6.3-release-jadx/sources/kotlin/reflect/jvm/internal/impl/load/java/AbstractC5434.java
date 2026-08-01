package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5434 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final Set f13783;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Set f13784;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final LinkedHashMap f13785;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Map f13786;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ArrayList f13787;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final ArrayList f13788;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Map f13789;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5435 f13790;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final LinkedHashMap f13791;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final LinkedHashMap f13792;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final HashSet f13793;

    static {
        Set<String> setM9404 = AbstractC5179.m9404(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(AbstractC5177.m9381(setM9404, 10));
        for (String str : setM9404) {
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            desc.getClass();
            arrayList.add(C5457.m9795("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f13788 = arrayList;
        ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C5435) it.next()).f13794);
        }
        f13787 = arrayList2;
        ArrayList arrayList3 = f13788;
        ArrayList arrayList4 = new ArrayList(AbstractC5177.m9381(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((C5435) it2.next()).f13797.m9894());
        }
        String strConcat = "java/util/".concat("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        desc2.getClass();
        C5435 c5435M9795 = C5457.m9795(strConcat, "contains", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc2);
        SpecialGenericSignatures$TypeSafeBarrierDescription specialGenericSignatures$TypeSafeBarrierDescription = SpecialGenericSignatures$TypeSafeBarrierDescription.FALSE;
        Pair pair = new Pair(c5435M9795, specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat2 = "java/util/".concat("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        desc3.getClass();
        Pair pair2 = new Pair(C5457.m9795(strConcat2, "remove", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc3), specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat3 = "java/util/".concat("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        desc4.getClass();
        Pair pair3 = new Pair(C5457.m9795(strConcat3, "containsKey", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc4), specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat4 = "java/util/".concat("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        desc5.getClass();
        Pair pair4 = new Pair(C5457.m9795(strConcat4, "containsValue", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc5), specialGenericSignatures$TypeSafeBarrierDescription);
        String strConcat5 = "java/util/".concat("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        desc6.getClass();
        Pair pair5 = new Pair(C5457.m9795(strConcat5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), specialGenericSignatures$TypeSafeBarrierDescription);
        Pair pair6 = new Pair(C5457.m9795("java/util/".concat("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), SpecialGenericSignatures$TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        C5435 c5435M97952 = C5457.m9795("java/util/".concat("Map"), "get", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR);
        SpecialGenericSignatures$TypeSafeBarrierDescription specialGenericSignatures$TypeSafeBarrierDescription2 = SpecialGenericSignatures$TypeSafeBarrierDescription.NULL;
        Pair pair7 = new Pair(c5435M97952, specialGenericSignatures$TypeSafeBarrierDescription2);
        Pair pair8 = new Pair(C5457.m9795("java/util/".concat("Map"), "remove", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), specialGenericSignatures$TypeSafeBarrierDescription2);
        String strConcat6 = "java/util/".concat("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        desc7.getClass();
        C5435 c5435M97953 = C5457.m9795(strConcat6, "indexOf", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc7);
        SpecialGenericSignatures$TypeSafeBarrierDescription specialGenericSignatures$TypeSafeBarrierDescription3 = SpecialGenericSignatures$TypeSafeBarrierDescription.INDEX;
        Pair pair9 = new Pair(c5435M97953, specialGenericSignatures$TypeSafeBarrierDescription3);
        String strConcat7 = "java/util/".concat("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        desc8.getClass();
        Map mapM9333 = AbstractC5171.m9333(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(C5457.m9795(strConcat7, "lastIndexOf", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, desc8), specialGenericSignatures$TypeSafeBarrierDescription3));
        f13786 = mapM9333;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5171.m9331(mapM9333.size()));
        for (Map.Entry entry : mapM9333.entrySet()) {
            linkedHashMap.put(((C5435) entry.getKey()).f13794, entry.getValue());
        }
        f13785 = linkedHashMap;
        LinkedHashSet linkedHashSetM13613 = AbstractC8568.m13613(f13786.keySet(), f13788);
        ArrayList arrayList5 = new ArrayList(AbstractC5177.m9381(linkedHashSetM13613, 10));
        Iterator it3 = linkedHashSetM13613.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((C5435) it3.next()).f13797);
        }
        f13784 = AbstractC5176.m9347(arrayList5);
        ArrayList arrayList6 = new ArrayList(AbstractC5177.m9381(linkedHashSetM13613, 10));
        Iterator it4 = linkedHashSetM13613.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((C5435) it4.next()).f13794);
        }
        f13783 = AbstractC5176.m9347(arrayList6);
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        desc9.getClass();
        C5435 c5435M97954 = C5457.m9795("java/util/List", "removeAt", desc9, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR);
        f13790 = c5435M97954;
        String strConcat8 = "java/lang/".concat("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        desc10.getClass();
        Pair pair10 = new Pair(C5457.m9795(strConcat8, "toByte", "", desc10), C5523.m9889("byteValue"));
        String strConcat9 = "java/lang/".concat("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        desc11.getClass();
        Pair pair11 = new Pair(C5457.m9795(strConcat9, "toShort", "", desc11), C5523.m9889("shortValue"));
        String strConcat10 = "java/lang/".concat("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        desc12.getClass();
        Pair pair12 = new Pair(C5457.m9795(strConcat10, "toInt", "", desc12), C5523.m9889("intValue"));
        String strConcat11 = "java/lang/".concat("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        desc13.getClass();
        Pair pair13 = new Pair(C5457.m9795(strConcat11, "toLong", "", desc13), C5523.m9889("longValue"));
        String strConcat12 = "java/lang/".concat("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        desc14.getClass();
        Pair pair14 = new Pair(C5457.m9795(strConcat12, "toFloat", "", desc14), C5523.m9889("floatValue"));
        String strConcat13 = "java/lang/".concat("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        desc15.getClass();
        Pair pair15 = new Pair(C5457.m9795(strConcat13, "toDouble", "", desc15), C5523.m9889("doubleValue"));
        Pair pair16 = new Pair(c5435M97954, C5523.m9889("remove"));
        String strConcat14 = "java/lang/".concat("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        desc16.getClass();
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        desc17.getClass();
        Map mapM93332 = AbstractC5171.m9333(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(C5457.m9795(strConcat14, "get", desc16, desc17), C5523.m9889("charAt")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicInteger"), "load", "", "I"), C5523.m9889("get")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicInteger"), "store", "I", "V"), C5523.m9889("set")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicInteger"), "exchange", "I", "I"), C5523.m9889("getAndSet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicInteger"), "fetchAndAdd", "I", "I"), C5523.m9889("getAndAdd")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicInteger"), "addAndFetch", "I", "I"), C5523.m9889("addAndGet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLong"), "load", "", "J"), C5523.m9889("get")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLong"), "store", "J", "V"), C5523.m9889("set")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLong"), "exchange", "J", "J"), C5523.m9889("getAndSet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLong"), "fetchAndAdd", "J", "J"), C5523.m9889("getAndAdd")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLong"), "addAndFetch", "J", "J"), C5523.m9889("addAndGet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicBoolean"), "load", "", "Z"), C5523.m9889("get")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicBoolean"), "store", "Z", "V"), C5523.m9889("set")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicBoolean"), "exchange", "Z", "Z"), C5523.m9889("getAndSet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicReference"), "load", "", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C5523.m9889("get")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicReference"), "store", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, "V"), C5523.m9889("set")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicReference"), "exchange", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C5523.m9889("getAndSet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "loadAt", "I", "I"), C5523.m9889("get")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "storeAt", "II", "V"), C5523.m9889("set")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "exchangeAt", "II", "I"), C5523.m9889("getAndSet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), C5523.m9889("compareAndSet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), C5523.m9889("getAndAdd")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), C5523.m9889("addAndGet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLongArray"), "loadAt", "I", "J"), C5523.m9889("get")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLongArray"), "storeAt", "IJ", "V"), C5523.m9889("set")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLongArray"), "exchangeAt", "IJ", "J"), C5523.m9889("getAndSet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), C5523.m9889("compareAndSet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), C5523.m9889("getAndAdd")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), C5523.m9889("addAndGet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "loadAt", "I", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C5523.m9889("get")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), C5523.m9889("set")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR), C5523.m9889("getAndSet")), new Pair(C5457.m9795("java/util/concurrent/atomic/".concat("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), C5523.m9889("compareAndSet")));
        f13789 = mapM93332;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5171.m9331(mapM93332.size()));
        for (Map.Entry entry2 : mapM93332.entrySet()) {
            linkedHashMap2.put(((C5435) entry2.getKey()).f13794, entry2.getValue());
        }
        f13792 = linkedHashMap2;
        Map map = f13789;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : map.entrySet()) {
            C5435 c5435 = (C5435) entry3.getKey();
            C5523 c5523 = (C5523) entry3.getValue();
            String str2 = c5435.f13798;
            String str3 = c5435.f13796;
            String str4 = c5435.f13795;
            c5523.getClass();
            linkedHashSet.add(str2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + (c5523 + '(' + str3 + ')' + str4));
        }
        Set setKeySet = f13789.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((C5435) it5.next()).f13797);
        }
        f13793 = hashSet;
        Set<Map.Entry> setEntrySet = f13789.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(AbstractC5177.m9381(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new Pair(((C5435) entry4.getKey()).f13797, entry4.getValue()));
        }
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(arrayList7, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iM9331);
        for (Pair pair17 : arrayList7) {
            linkedHashMap3.put((C5523) pair17.getSecond(), (C5523) pair17.getFirst());
        }
        f13791 = linkedHashMap3;
    }
}
