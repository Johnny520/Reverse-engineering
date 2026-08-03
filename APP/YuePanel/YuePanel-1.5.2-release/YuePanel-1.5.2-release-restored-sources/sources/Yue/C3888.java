package Yue;

import Yue.C2954;
import Yue.C4033;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3683:1\n288#1,2:3684\n518#1,7:3686\n533#1,6:3693\n857#1,2:3700\n788#1:3702\n1864#1,2:3703\n789#1,2:3705\n1866#1:3707\n791#1:3708\n1864#1,3:3709\n809#1,2:3712\n847#1,2:3714\n1253#1,4:3720\n1222#1,4:3724\n1238#1,4:3728\n1285#1,4:3732\n1446#1,5:3736\n1461#1,5:3741\n1502#1,3:3746\n1505#1,3:3756\n1520#1,3:3759\n1523#1,3:3769\n1620#1,3:3786\n1590#1,4:3789\n1579#1:3793\n1864#1,2:3794\n1866#1:3797\n1580#1:3798\n1864#1,3:3799\n1611#1:3802\n1855#1:3803\n1856#1:3805\n1612#1:3806\n1855#1,2:3807\n1864#1,3:3809\n2847#1,3:3812\n2850#1,6:3816\n2872#1,3:3822\n2875#1,7:3826\n857#1,2:3833\n819#1:3835\n847#1,2:3836\n819#1:3838\n847#1,2:3839\n819#1:3841\n847#1,2:3842\n3405#1,8:3848\n3433#1,7:3856\n3464#1,10:3863\n1#2:3699\n1#2:3796\n1#2:3804\n1#2:3815\n1#2:3825\n37#3,2:3716\n37#3,2:3718\n372#4,7:3749\n372#4,7:3762\n372#4,7:3772\n372#4,7:3779\n32#5,2:3844\n32#5,2:3846\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n167#1:3684,2\n177#1:3686,7\n187#1:3693,6\n766#1:3700,2\n777#1:3702\n777#1:3703,2\n777#1:3705,2\n777#1:3707\n777#1:3708\n788#1:3709,3\n800#1:3712,2\n819#1:3714,2\n1180#1:3720,4\n1195#1:3724,4\n1209#1:3728,4\n1272#1:3732,4\n1360#1:3736,5\n1373#1:3741,5\n1477#1:3746,3\n1477#1:3756,3\n1490#1:3759,3\n1490#1:3769,3\n1549#1:3786,3\n1559#1:3789,4\n1569#1:3793\n1569#1:3794,2\n1569#1:3797\n1569#1:3798\n1579#1:3799,3\n1603#1:3802\n1603#1:3803\n1603#1:3805\n1603#1:3806\n1611#1:3807,2\n2645#1:3809,3\n2949#1:3812,3\n2949#1:3816,6\n2967#1:3822,3\n2967#1:3826,7\n3143#1:3833,2\n3151#1:3835\n3151#1:3836,2\n3161#1:3838\n3161#1:3839,2\n3171#1:3841\n3171#1:3842,2\n3394#1:3848,8\n3422#1:3856,7\n3451#1:3863,10\n1569#1:3796\n1603#1:3804\n2949#1:3815\n2967#1:3825\n1032#1:3716,2\n1075#1:3718,2\n1477#1:3749,7\n1490#1:3762,7\n1504#1:3772,7\n1522#1:3779,7\n3339#1:3844,2\n3381#1:3846,2\n*E\n"})
public class C3888 extends C3887 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۢ۠$ۥ */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,680:1\n3524#2:681\n*E\n"})
    public static final class C0280<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Iterable f566;

        public C0280(Iterable iterable) {
            this.f566 = iterable;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            return this.f566.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۢ۠$ۥ۟ */
    public static final class C0281<T> extends AbstractC5673 implements InterfaceC5124<Integer, T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f7430;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0281(int i) {
            super(1);
            this.f7430 = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return m11081(num.intValue());
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final T m11081(int i) {
            throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f7430 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۢ۠$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n*L\n1#1,3683:1\n*E\n"})
    public static final class C3889<K, T> implements InterfaceC5218<T, K> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Iterable<T> f567;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ InterfaceC5124<T, K> f568;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Iterable<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends K> */
        /* JADX WARN: Multi-variable type inference failed */
        public C3889(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
            this.f567 = iterable;
            this.f568 = interfaceC5124;
        }

        @Override // Yue.InterfaceC5218
        /* JADX INFO: renamed from: ۥ */
        public K mo500(T t) {
            return this.f568.invoke(t);
        }

        @Override // Yue.InterfaceC5218
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public Iterator<T> mo501() {
            return this.f567.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۢ۠$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C3890<T> extends AbstractC5673 implements InterfaceC5122<Iterator<? extends T>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Iterable<T> f7431;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Iterable<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C3890(Iterable<? extends T> iterable) {
            super(0);
            this.f7431 = iterable;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Iterator<T> invoke() {
            return this.f7431.iterator();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static final <T> boolean m10829(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!interfaceC5124.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final <T> boolean m10830(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final <T> boolean m10831(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Iterable<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final <T> Iterable<T> m10832(Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return iterable;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m10833(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return new C0280(iterable);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final <T, K, V> Map<K, V> m10834(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends C6599<? extends K, ? extends V>> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(C3881.m10756(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C6599<? extends K, ? extends V> c6599Invoke = interfaceC5124.invoke(it.next());
            linkedHashMap.put(c6599Invoke.m20938(), c6599Invoke.m20939());
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final <T, K> Map<K, T> m10835(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(C3881.m10756(iterable, 10)), 16));
        for (T t : iterable) {
            linkedHashMap.put(interfaceC5124.invoke(t), t);
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final <T, K, V> Map<K, V> m10836(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super T, ? extends V> interfaceC51242) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(C3881.m10756(iterable, 10)), 16));
        for (T t : iterable) {
            linkedHashMap.put(interfaceC5124.invoke(t), interfaceC51242.invoke(t));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final <T, K, M extends Map<? super K, ? super T>> M m10837(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        for (T t : iterable) {
            m.put(interfaceC5124.invoke(t), t);
        }
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m10838(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super T, ? extends V> interfaceC51242) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        for (T t : iterable) {
            m.put(interfaceC5124.invoke(t), interfaceC51242.invoke(t));
        }
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m10839(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends C6599<? extends K, ? extends V>> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C6599<? extends K, ? extends V> c6599Invoke = interfaceC5124.invoke(it.next());
            m.put(c6599Invoke.m20938(), c6599Invoke.m20939());
        }
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m10840(@InterfaceC6399 Iterable<? extends K> iterable, @InterfaceC6399 InterfaceC5124<? super K, ? extends V> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C7007.m21661(C5942.m18568(C3881.m10756(iterable, 10)), 16));
        for (K k : iterable) {
            linkedHashMap.put(k, interfaceC5124.invoke(k));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m10841(@InterfaceC6399 Iterable<? extends K> iterable, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super K, ? extends V> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "valueSelector");
        for (K k : iterable) {
            m.put(k, interfaceC5124.invoke(k));
        }
        return m;
    }

    @InterfaceC5572(name = "averageOfByte")
    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static final double m10842(@InterfaceC6399 Iterable<Byte> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double dByteValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dByteValue += (double) it.next().byteValue();
            i++;
            if (i < 0) {
                C3880.m10752();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dByteValue / ((double) i);
    }

    @InterfaceC5572(name = "averageOfDouble")
    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static final double m10843(@InterfaceC6399 Iterable<Double> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i++;
            if (i < 0) {
                C3880.m10752();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dDoubleValue / ((double) i);
    }

    @InterfaceC5572(name = "averageOfFloat")
    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static final double m10844(@InterfaceC6399 Iterable<Float> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) it.next().floatValue();
            i++;
            if (i < 0) {
                C3880.m10752();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    @InterfaceC5572(name = "averageOfInt")
    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static final double m10845(@InterfaceC6399 Iterable<Integer> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dIntValue += (double) it.next().intValue();
            i++;
            if (i < 0) {
                C3880.m10752();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i);
    }

    @InterfaceC5572(name = "averageOfLong")
    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static final double m10846(@InterfaceC6399 Iterable<Long> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i++;
            if (i < 0) {
                C3880.m10752();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dLongValue / ((double) i);
    }

    @InterfaceC5572(name = "averageOfShort")
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final double m10847(@InterfaceC6399 Iterable<Short> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double dShortValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dShortValue += (double) it.next().shortValue();
            i++;
            if (i < 0) {
                C3880.m10752();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dShortValue / ((double) i);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static final <T> List<List<T>> m10848(@InterfaceC6399 Iterable<? extends T> iterable, int i) {
        C5499.m17103(iterable, "<this>");
        return m11070(iterable, i, i, true);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static final <T, R> List<R> m10849(@InterfaceC6399 Iterable<? extends T> iterable, int i, @InterfaceC6399 InterfaceC5124<? super List<? extends T>, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        return m11071(iterable, i, i, true, interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static final <T> T m10850(List<? extends T> list) {
        C5499.m17103(list, "<this>");
        return list.get(0);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static final <T> T m10851(List<? extends T> list) {
        C5499.m17103(list, "<this>");
        return list.get(1);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static final <T> T m10852(List<? extends T> list) {
        C5499.m17103(list, "<this>");
        return list.get(2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static final <T> T m10853(List<? extends T> list) {
        C5499.m17103(list, "<this>");
        return list.get(3);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static final <T> T m10854(List<? extends T> list) {
        C5499.m17103(list, "<this>");
        return list.get(4);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static <T> boolean m10855(@InterfaceC6399 Iterable<? extends T> iterable, T t) {
        C5499.m17103(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t) : m10913(iterable, t) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static final <T> int m10856(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C3880.m10752();
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static final <T> int m10857(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int i = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue() && (i = i + 1) < 0) {
                C3880.m10752();
            }
        }
        return i;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final <T> int m10858(Collection<? extends T> collection) {
        C5499.m17103(collection, "<this>");
        return collection.size();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static final <T> List<T> m10859(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return m11062(m11066(iterable));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static final <T, K> List<T> m10860(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (hashSet.add(interfaceC5124.invoke(t))) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static <T> List<T> m10861(@InterfaceC6399 Iterable<? extends T> iterable, int i) {
        ArrayList arrayList;
        C5499.m17103(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return m11062(iterable);
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size() - i;
            if (size <= 0) {
                return C3880.m10735();
            }
            if (size == 1) {
                return C3879.m10715(m10924(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    int size2 = collection.size();
                    while (i < size2) {
                        arrayList.add(((List) iterable).get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (T t : iterable) {
            if (i2 >= i) {
                arrayList.add(t);
            } else {
                i2++;
            }
        }
        return C3880.m10747(arrayList);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static <T> List<T> m10862(@InterfaceC6399 List<? extends T> list, int i) {
        C5499.m17103(list, "<this>");
        if (i >= 0) {
            return m11050(list, C7007.m21661(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static final <T> List<T> m10863(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!interfaceC5124.invoke(listIterator.previous()).booleanValue()) {
                    return m11050(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return C3880.m10735();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static final <T> List<T> m10864(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (T t : iterable) {
            if (z) {
                arrayList.add(t);
            } else if (!interfaceC5124.invoke(t).booleanValue()) {
                arrayList.add(t);
                z = true;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final <T> T m10865(@InterfaceC6399 Iterable<? extends T> iterable, int i) {
        C5499.m17103(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i) : (T) m10867(iterable, i, new C0281(i));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final <T> T m10866(List<? extends T> list, int i) {
        C5499.m17103(list, "<this>");
        return list.get(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final <T> T m10867(@InterfaceC6399 Iterable<? extends T> iterable, int i, @InterfaceC6399 InterfaceC5124<? super Integer, ? extends T> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i < 0 || i > C3880.m10737(list)) ? interfaceC5124.invoke(Integer.valueOf(i)) : (T) list.get(i);
        }
        if (i < 0) {
            return interfaceC5124.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return interfaceC5124.invoke(Integer.valueOf(i));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final <T> T m10868(List<? extends T> list, int i, InterfaceC5124<? super Integer, ? extends T> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "defaultValue");
        return (i < 0 || i > C3880.m10737(list)) ? interfaceC5124.invoke(Integer.valueOf(i)) : list.get(i);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static final <T> T m10869(@InterfaceC6399 Iterable<? extends T> iterable, int i) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m10907((List) iterable, i);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return null;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final <T> T m10870(List<? extends T> list, int i) {
        C5499.m17103(list, "<this>");
        return (T) m10907(list, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static final <T> List<T> m10871(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static final <T> List<T> m10872(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, Boolean> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "predicate");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            if (interfaceC5138.invoke(Integer.valueOf(i), t).booleanValue()) {
                arrayList.add(t);
            }
            i = i2;
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m10873(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, Boolean> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "predicate");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            if (interfaceC5138.invoke(Integer.valueOf(i), t).booleanValue()) {
                c.add(t);
            }
            i = i2;
        }
        return c;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final /* synthetic */ <R> List<R> m10874(Iterable<?> iterable) {
        C5499.m17103(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            C5499.m17112(3, "R");
            if (obj instanceof Object) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static final /* synthetic */ <R, C extends Collection<? super R>> C m10875(Iterable<?> iterable, C c) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        for (Object obj : iterable) {
            C5499.m17112(3, "R");
            if (obj instanceof Object) {
                c.add(obj);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public static final <T> List<T> m10876(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!interfaceC5124.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public static final <T> List<T> m10877(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return (List) m10878(iterable, new ArrayList());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public static final <C extends Collection<? super T>, T> C m10878(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        for (T t : iterable) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m10879(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : iterable) {
            if (!interfaceC5124.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m10880(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : iterable) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public static final <T> T m10881(Iterable<? extends T> iterable, InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : iterable) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public static final <T> T m10882(Iterable<? extends T> iterable, InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        T t = null;
        for (T t2 : iterable) {
            if (interfaceC5124.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public static final <T> T m10883(List<? extends T> list, InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (interfaceC5124.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public static final <T> T m10884(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m10886((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public static final <T> T m10885(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : iterable) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static <T> T m10886(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public static final <T, R> R m10887(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        R rInvoke;
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                rInvoke = null;
                break;
            }
            rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                break;
            }
        }
        if (rInvoke != null) {
            return rInvoke;
        }
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public static final <T, R> R m10888(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static final <T> T m10889(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public static final <T> T m10890(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : iterable) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public static <T> T m10891(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters */
    public static final <T, R> List<R> m10892(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends Iterable<? extends R>> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C3885.m10772(arrayList, interfaceC5124.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedIterable")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public static final <T, R> List<R> m10893(Iterable<? extends T> iterable, InterfaceC5138<? super Integer, ? super T, ? extends Iterable<? extends R>> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            C3885.m10772(arrayList, interfaceC5138.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return arrayList;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedIterableTo")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m10894(Iterable<? extends T> iterable, C c, InterfaceC5138<? super Integer, ? super T, ? extends Iterable<? extends R>> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            C3885.m10772(c, interfaceC5138.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedSequence")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static final <T, R> List<R> m10895(Iterable<? extends T> iterable, InterfaceC5138<? super Integer, ? super T, ? extends InterfaceC7326<? extends R>> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            C3885.m10771(arrayList, interfaceC5138.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return arrayList;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedSequenceTo")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m10896(Iterable<? extends T> iterable, C c, InterfaceC5138<? super Integer, ? super T, ? extends InterfaceC7326<? extends R>> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            C3885.m10771(c, interfaceC5138.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @InterfaceC6399
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapSequence")
    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static final <T, R> List<R> m10897(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends InterfaceC7326<? extends R>> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C3885.m10771(arrayList, interfaceC5124.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapSequenceTo")
    /* JADX INFO: renamed from: ۥ۟۠ۦ۟, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m10898(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, ? extends InterfaceC7326<? extends R>> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C3885.m10771(c, interfaceC5124.invoke(it.next()));
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m10899(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, ? extends Iterable<? extends R>> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            C3885.m10772(c, interfaceC5124.invoke(it.next()));
        }
        return c;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public static final <T, R> R m10900(@InterfaceC6399 Iterable<? extends T> iterable, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = interfaceC5138.invoke(r, it.next());
        }
        return r;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public static final <T, R> R m10901(@InterfaceC6399 Iterable<? extends T> iterable, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super R, ? super T, ? extends R> interfaceC5140) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            r = interfaceC5140.mo15350(Integer.valueOf(i), r, t);
            i = i2;
        }
        return r;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۣ, reason: contains not printable characters */
    public static final <T, R> R m10902(@InterfaceC6399 List<? extends T> list, R r, @InterfaceC6399 InterfaceC5138<? super T, ? super R, ? extends R> interfaceC5138) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r = interfaceC5138.invoke(listIterator.previous(), r);
            }
        }
        return r;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۤ, reason: contains not printable characters */
    public static final <T, R> R m10903(@InterfaceC6399 List<? extends T> list, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super T, ? super R, ? extends R> interfaceC5140) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r = interfaceC5140.mo15350(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r);
            }
        }
        return r;
    }

    @InterfaceC5289
    /* JADX INFO: renamed from: ۥ۟۠ۦۥ, reason: contains not printable characters */
    public static final <T> void m10904(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, C8107> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            interfaceC5124.invoke(it.next());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۦ, reason: contains not printable characters */
    public static final <T> void m10905(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, C8107> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "action");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            interfaceC5138.invoke(Integer.valueOf(i), t);
            i = i2;
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۦۧ, reason: contains not printable characters */
    public static final <T> T m10906(List<? extends T> list, int i, InterfaceC5124<? super Integer, ? extends T> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "defaultValue");
        return (i < 0 || i > C3880.m10737(list)) ? interfaceC5124.invoke(Integer.valueOf(i)) : list.get(i);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۦۨ, reason: contains not printable characters */
    public static final <T> T m10907(@InterfaceC6399 List<? extends T> list, int i) {
        C5499.m17103(list, "<this>");
        if (i < 0 || i > C3880.m10737(list)) {
            return null;
        }
        return list.get(i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public static final <T, K> Map<K, List<T>> m10908(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : iterable) {
            K kInvoke = interfaceC5124.invoke(t);
            Object arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧ۟, reason: contains not printable characters */
    public static final <T, K, V> Map<K, List<V>> m10909(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super T, ? extends V> interfaceC51242) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : iterable) {
            K kInvoke = interfaceC5124.invoke(t);
            List<V> arrayList = linkedHashMap.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(kInvoke, arrayList);
            }
            arrayList.add(interfaceC51242.invoke(t));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧ۠, reason: contains not printable characters */
    public static final <T, K, M extends Map<? super K, List<T>>> M m10910(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        for (T t : iterable) {
            K kInvoke = interfaceC5124.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(t);
        }
        return m;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: M extends java.util.Map<? super K, java.util.List<V>> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧۡ, reason: contains not printable characters */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M m10911(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super T, ? extends V> interfaceC51242) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        for (T t : iterable) {
            K kInvoke = interfaceC5124.invoke(t);
            Object arrayList = m.get(kInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                m.put(kInvoke, arrayList);
            }
            ((List) arrayList).add(interfaceC51242.invoke(t));
        }
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۠ۧۢ, reason: contains not printable characters */
    public static final <T, K> InterfaceC5218<T, K> m10912(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        return new C3889(iterable, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static final <T> int m10913(@InterfaceC6399 Iterable<? extends T> iterable, T t) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                C3880.m10753();
            }
            if (C5499.m17094(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۤ, reason: contains not printable characters */
    public static final <T> int m10914(@InterfaceC6399 List<? extends T> list, T t) {
        C5499.m17103(list, "<this>");
        return list.indexOf(t);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۥ, reason: contains not printable characters */
    public static final <T> int m10915(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int i = 0;
        for (T t : iterable) {
            if (i < 0) {
                C3880.m10753();
            }
            if (interfaceC5124.invoke(t).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۦ, reason: contains not printable characters */
    public static final <T> int m10916(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۧ, reason: contains not printable characters */
    public static final <T> int m10917(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int i = -1;
        int i2 = 0;
        for (T t : iterable) {
            if (i2 < 0) {
                C3880.m10753();
            }
            if (interfaceC5124.invoke(t).booleanValue()) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۨ, reason: contains not printable characters */
    public static final <T> int m10918(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (interfaceC5124.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters */
    public static final <T> Set<T> m10919(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Iterable<? extends T> iterable2) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(iterable2, "other");
        Set<T> setM11066 = m11066(iterable);
        C3885.m10799(setM11066, iterable2);
        return setM11066;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨ۟, reason: contains not printable characters */
    public static final <T, A extends Appendable> A m10920(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 A a, @InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, @InterfaceC6399 CharSequence charSequence3, int i, @InterfaceC6399 CharSequence charSequence4, @InterfaceC6489 InterfaceC5124<? super T, ? extends CharSequence> interfaceC5124) throws IOException {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(a, "buffer");
        C5499.m17103(charSequence, "separator");
        C5499.m17103(charSequence2, "prefix");
        C5499.m17103(charSequence3, "postfix");
        C5499.m17103(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C7618.m3769(a, t, interfaceC5124);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۡ, reason: contains not printable characters */
    public static final <T> String m10922(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, @InterfaceC6399 CharSequence charSequence3, int i, @InterfaceC6399 CharSequence charSequence4, @InterfaceC6489 InterfaceC5124<? super T, ? extends CharSequence> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(charSequence, "separator");
        C5499.m17103(charSequence2, "prefix");
        C5499.m17103(charSequence3, "postfix");
        C5499.m17103(charSequence4, "truncated");
        String string = ((StringBuilder) m10920(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC5124)).toString();
        C5499.m17102(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۢ, reason: contains not printable characters */
    public static /* synthetic */ String m10923(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC5124 interfaceC5124, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            interfaceC5124 = null;
        }
        return m10922(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final <T> T m10924(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m10926((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۤ, reason: contains not printable characters */
    public static final <T> T m10925(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : iterable) {
            if (interfaceC5124.invoke(t2).booleanValue()) {
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۥ, reason: contains not printable characters */
    public static <T> T m10926(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(C3880.m10737(list));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: ۥ۟۠ۨۦ, reason: contains not printable characters */
    public static final <T> T m10927(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (interfaceC5124.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۧ, reason: contains not printable characters */
    public static final <T> int m10928(@InterfaceC6399 Iterable<? extends T> iterable, T t) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t);
        }
        int i = -1;
        int i2 = 0;
        for (T t2 : iterable) {
            if (i2 < 0) {
                C3880.m10753();
            }
            if (C5499.m17094(t, t2)) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۨ, reason: contains not printable characters */
    public static final <T> int m10929(@InterfaceC6399 List<? extends T> list, T t) {
        C5499.m17103(list, "<this>");
        return list.lastIndexOf(t);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final <T> T m10930(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡ۟, reason: contains not printable characters */
    public static final <T> T m10931(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        T t = null;
        for (T t2 : iterable) {
            if (interfaceC5124.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡ۟۟, reason: contains not printable characters */
    public static final <T> T m10932(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡ۟۠, reason: contains not printable characters */
    public static final <T> T m10933(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (interfaceC5124.invoke(tPrevious).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۡ, reason: contains not printable characters */
    public static final <T, R> List<R> m10934(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList(C3881.m10756(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC5124.invoke(it.next()));
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۢ, reason: contains not printable characters */
    public static final <T, R> List<R> m10935(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        ArrayList arrayList = new ArrayList(C3881.m10756(iterable, 10));
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            arrayList.add(interfaceC5138.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final <T, R> List<R> m10936(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            R rInvoke = interfaceC5138.invoke(Integer.valueOf(i), t);
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
            i = i2;
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۤ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m10937(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            R rInvoke = interfaceC5138.invoke(Integer.valueOf(i), t);
            if (rInvoke != null) {
                c.add(rInvoke);
            }
            i = i2;
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۥ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m10938(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        for (T t : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            c.add(interfaceC5138.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۦ, reason: contains not printable characters */
    public static final <T, R> List<R> m10939(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                arrayList.add(rInvoke);
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۧ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m10940(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۨ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m10941(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(interfaceC5124.invoke(it.next()));
        }
        return c;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:? */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡ۠, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> T m10942(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = interfaceC5124.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = interfaceC5124.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:? */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxByOrThrow")
    /* JADX INFO: renamed from: ۥ۟ۡ۠۟, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> T m10943(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = interfaceC5124.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = interfaceC5124.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡ۠۠, reason: contains not printable characters */
    public static final <T> double m10944(Iterable<? extends T> iterable, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = interfaceC5124.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, interfaceC5124.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۡ, reason: contains not printable characters */
    public static final <T> float m10945(Iterable<? extends T> iterable, InterfaceC5124<? super T, Float> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = interfaceC5124.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, interfaceC5124.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۢ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> R m10946(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> R m10947(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۤ, reason: contains not printable characters */
    public static final <T> Double m10948(Iterable<? extends T> iterable, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = interfaceC5124.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, interfaceC5124.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۥ, reason: contains not printable characters */
    public static final <T> Float m10949(Iterable<? extends T> iterable, InterfaceC5124<? super T, Float> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = interfaceC5124.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, interfaceC5124.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۦ, reason: contains not printable characters */
    public static final <T, R> R m10950(Iterable<? extends T> iterable, Comparator<? super R> comparator, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۧ, reason: contains not printable characters */
    public static final <T, R> R m10951(Iterable<? extends T> iterable, Comparator<? super R> comparator, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) < 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۨ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m10952(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۡ, reason: contains not printable characters */
    public static final Double m10953(@InterfaceC6399 Iterable<Double> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۡ۟, reason: contains not printable characters */
    public static final Float m10954(@InterfaceC6399 Iterable<Float> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxOrThrow")
    /* JADX INFO: renamed from: ۥ۟ۡۡ۠, reason: contains not printable characters */
    public static final double m10955(@InterfaceC6399 Iterable<Double> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxOrThrow")
    /* JADX INFO: renamed from: ۥ۟ۡۡۡ, reason: contains not printable characters */
    public static final float m10956(@InterfaceC6399 Iterable<Float> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxOrThrow")
    /* JADX INFO: renamed from: ۥ۟ۡۡۢ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m10957(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static final <T> T m10958(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "maxWithOrThrow")
    /* JADX INFO: renamed from: ۥ۟ۡۡۤ, reason: contains not printable characters */
    public static final <T> T m10959(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:? */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۡۥ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> T m10960(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = interfaceC5124.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = interfaceC5124.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:? */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [T] */
    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minByOrThrow")
    /* JADX INFO: renamed from: ۥ۟ۡۡۦ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> T m10961(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        R rInvoke = interfaceC5124.invoke(next);
        do {
            T next2 = it.next();
            R rInvoke2 = interfaceC5124.invoke(next2);
            next = next;
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
                next = next2;
            }
        } while (it.hasNext());
        return (T) next;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۡۧ, reason: contains not printable characters */
    public static final <T> double m10962(Iterable<? extends T> iterable, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = interfaceC5124.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, interfaceC5124.invoke(it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۡۨ, reason: contains not printable characters */
    public static final <T> float m10963(Iterable<? extends T> iterable, InterfaceC5124<? super T, Float> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = interfaceC5124.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, interfaceC5124.invoke(it.next()).floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> R m10964(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۢ۟, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> R m10965(Iterable<? extends T> iterable, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(it.next());
            if (rInvoke.compareTo(rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۢ۠, reason: contains not printable characters */
    public static final <T> Double m10966(Iterable<? extends T> iterable, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = interfaceC5124.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, interfaceC5124.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۢۡ, reason: contains not printable characters */
    public static final <T> Float m10967(Iterable<? extends T> iterable, InterfaceC5124<? super T, Float> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = interfaceC5124.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, interfaceC5124.invoke(it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۢۢ, reason: contains not printable characters */
    public static final <T, R> R m10968(Iterable<? extends T> iterable, Comparator<? super R> comparator, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        R rInvoke = interfaceC5124.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC5438
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static final <T, R> R m10969(Iterable<? extends T> iterable, Comparator<? super R> comparator, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        R rInvoke = interfaceC5124.invoke(it.next());
        while (it.hasNext()) {
            R rInvoke2 = interfaceC5124.invoke(it.next());
            if (comparator.compare(rInvoke, rInvoke2) > 0) {
                rInvoke = rInvoke2;
            }
        }
        return rInvoke;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۢۤ, reason: contains not printable characters */
    public static <T extends Comparable<? super T>> T m10970(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۢۥ, reason: contains not printable characters */
    public static final Double m10971(@InterfaceC6399 Iterable<Double> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۢۦ, reason: contains not printable characters */
    public static final Float m10972(@InterfaceC6399 Iterable<Float> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minOrThrow")
    /* JADX INFO: renamed from: ۥ۟ۡۢۧ, reason: contains not printable characters */
    public static final double m10973(@InterfaceC6399 Iterable<Double> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minOrThrow")
    /* JADX INFO: renamed from: ۥ۟ۡۢۨ, reason: contains not printable characters */
    public static final float m10974(@InterfaceC6399 Iterable<Float> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return fFloatValue;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minOrThrow")
    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m10975(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final <T> T m10976(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC7470(version = "1.7")
    @InterfaceC5572(name = "minWithOrThrow")
    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static final <T> T m10977(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static final <T> List<T> m10978(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        List listM23081 = C7342.m23081(interfaceC7326);
        if (listM23081.isEmpty()) {
            return m11062(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!listM23081.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static <T> List<T> m10979(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Iterable<? extends T> iterable2) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(iterable2, "elements");
        Collection collectionM10774 = C3885.m10774(iterable2);
        if (collectionM10774.isEmpty()) {
            return m11062(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!collectionM10774.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟ۡ, reason: contains not printable characters */
    public static final <T> List<T> m10980(@InterfaceC6399 Iterable<? extends T> iterable, T t) {
        C5499.m17103(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C3881.m10756(iterable, 10));
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && C5499.m17094(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static final <T> List<T> m10981(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 T[] tArr) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(tArr, "elements");
        if (tArr.length == 0) {
            return m11062(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!C3411.m7560(tArr, t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۥ, reason: contains not printable characters */
    public static final <T> List<T> m10982(Iterable<? extends T> iterable, T t) {
        C5499.m17103(iterable, "<this>");
        return m10980(iterable, t);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۦ, reason: contains not printable characters */
    public static final <T> boolean m10983(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final <T> boolean m10984(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static final <T, C extends Iterable<? extends T>> C m10985(@InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, C8107> interfaceC5124) {
        C5499.m17103(c, "<this>");
        C5499.m17103(interfaceC5124, "action");
        Iterator<T> it = c.iterator();
        while (it.hasNext()) {
            interfaceC5124.invoke(it.next());
        }
        return c;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۤ, reason: contains not printable characters */
    public static final <T, C extends Iterable<? extends T>> C m10986(@InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, C8107> interfaceC5138) {
        C5499.m17103(c, "<this>");
        C5499.m17103(interfaceC5138, "action");
        int i = 0;
        for (T t : c) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            interfaceC5138.invoke(Integer.valueOf(i), t);
            i = i2;
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤ۟, reason: contains not printable characters */
    public static final <T> C6599<List<T>, List<T>> m10987(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : iterable) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new C6599<>(arrayList, arrayList2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤ۠, reason: contains not printable characters */
    public static final <T> List<T> m10988(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        ArrayList arrayList = new ArrayList();
        C3885.m10772(arrayList, iterable);
        C3885.m10771(arrayList, interfaceC7326);
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۡ, reason: contains not printable characters */
    public static final <T> List<T> m10989(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Iterable<? extends T> iterable2) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(iterable2, "elements");
        if (iterable instanceof Collection) {
            return m10993((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        C3885.m10772(arrayList, iterable);
        C3885.m10772(arrayList, iterable2);
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۢ, reason: contains not printable characters */
    public static final <T> List<T> m10990(@InterfaceC6399 Iterable<? extends T> iterable, T t) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m10994((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        C3885.m10772(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static final <T> List<T> m10991(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 T[] tArr) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(tArr, "elements");
        if (iterable instanceof Collection) {
            return m10995((Collection) iterable, tArr);
        }
        ArrayList arrayList = new ArrayList();
        C3885.m10772(arrayList, iterable);
        C3885.m10773(arrayList, tArr);
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۤ, reason: contains not printable characters */
    public static final <T> List<T> m10992(@InterfaceC6399 Collection<? extends T> collection, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(interfaceC7326, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        C3885.m10771(arrayList, interfaceC7326);
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۥ, reason: contains not printable characters */
    public static <T> List<T> m10993(@InterfaceC6399 Collection<? extends T> collection, @InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(iterable, "elements");
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            C3885.m10772(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۦ, reason: contains not printable characters */
    public static <T> List<T> m10994(@InterfaceC6399 Collection<? extends T> collection, T t) {
        C5499.m17103(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۧ, reason: contains not printable characters */
    public static final <T> List<T> m10995(@InterfaceC6399 Collection<? extends T> collection, @InterfaceC6399 T[] tArr) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(tArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        C3885.m10773(arrayList, tArr);
        return arrayList;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۤۨ, reason: contains not printable characters */
    public static final <T> List<T> m10996(Iterable<? extends T> iterable, T t) {
        C5499.m17103(iterable, "<this>");
        return m10990(iterable, t);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static final <T> List<T> m10997(Collection<? extends T> collection, T t) {
        C5499.m17103(collection, "<this>");
        return m10994(collection, t);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ۡۥ۟, reason: contains not printable characters */
    public static final <T> T m10998(Collection<? extends T> collection) {
        C5499.m17103(collection, "<this>");
        return (T) m10999(collection, AbstractC7000.f21141);
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ۡۥ۠, reason: contains not printable characters */
    public static final <T> T m10999(@InterfaceC6399 Collection<? extends T> collection, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(abstractC7000, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) m10865(collection, abstractC7000.mo5817(collection.size()));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۥۡ, reason: contains not printable characters */
    public static final <T> T m11000(Collection<? extends T> collection) {
        C5499.m17103(collection, "<this>");
        return (T) m11001(collection, AbstractC7000.f21141);
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۥۢ, reason: contains not printable characters */
    public static final <T> T m11001(@InterfaceC6399 Collection<? extends T> collection, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(abstractC7000, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) m10865(collection, abstractC7000.mo5817(collection.size()));
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۣ, reason: contains not printable characters */
    public static final <S, T extends S> S m11002(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5138<? super S, ? super T, ? extends S> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = interfaceC5138.invoke(next, it.next());
        }
        return next;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۤ, reason: contains not printable characters */
    public static final <S, T extends S> S m11003(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5140<? super Integer, ? super S, ? super T, ? extends S> interfaceC5140) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S next = it.next();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            next = interfaceC5140.mo15350(Integer.valueOf(i), next, it.next());
            i = i2;
        }
        return next;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۥۥ, reason: contains not printable characters */
    public static final <S, T extends S> S m11004(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5140<? super Integer, ? super S, ? super T, ? extends S> interfaceC5140) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        int i = 1;
        while (it.hasNext()) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            next = interfaceC5140.mo15350(Integer.valueOf(i), next, it.next());
            i = i2;
        }
        return next;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۥۦ, reason: contains not printable characters */
    public static final <S, T extends S> S m11005(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5138<? super S, ? super T, ? extends S> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = interfaceC5138.invoke(next, it.next());
        }
        return next;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۧ, reason: contains not printable characters */
    public static final <S, T extends S> S m11006(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5138<? super T, ? super S, ? extends S> interfaceC5138) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = interfaceC5138.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۨ, reason: contains not printable characters */
    public static final <S, T extends S> S m11007(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5140<? super Integer, ? super T, ? super S, ? extends S> interfaceC5140) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = interfaceC5140.mo15350(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۦ, reason: contains not printable characters */
    public static final <S, T extends S> S m11008(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5140<? super Integer, ? super T, ? super S, ? extends S> interfaceC5140) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = interfaceC5140.mo15350(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۦ۟, reason: contains not printable characters */
    public static final <S, T extends S> S m11009(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5138<? super T, ? super S, ? extends S> interfaceC5138) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        S sPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            sPrevious = interfaceC5138.invoke(listIterator.previous(), sPrevious);
        }
        return sPrevious;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Iterable<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۦ۠, reason: contains not printable characters */
    public static final <T> Iterable<T> m11010(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
        }
        return iterable;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۦۡ, reason: contains not printable characters */
    public static final <T> List<T> m11011(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
        }
        return list;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۦۢ, reason: contains not printable characters */
    public static final <T> List<T> m11012(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m11062(iterable);
        }
        List<T> listM11064 = m11064(iterable);
        C3887.m10824(listM11064);
        return listM11064;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۦۣ, reason: contains not printable characters */
    public static final <T, R> List<R> m11013(@InterfaceC6399 Iterable<? extends T> iterable, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        int iM10756 = C3881.m10756(iterable, 9);
        if (iM10756 == 0) {
            return C3879.m10715(r);
        }
        ArrayList arrayList = new ArrayList(iM10756 + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = interfaceC5138.invoke(r, it.next());
            arrayList.add(r);
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۦۤ, reason: contains not printable characters */
    public static final <T, R> List<R> m11014(@InterfaceC6399 Iterable<? extends T> iterable, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super R, ? super T, ? extends R> interfaceC5140) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        int iM10756 = C3881.m10756(iterable, 9);
        if (iM10756 == 0) {
            return C3879.m10715(r);
        }
        ArrayList arrayList = new ArrayList(iM10756 + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            r = interfaceC5140.mo15350(Integer.valueOf(i), r, it.next());
            arrayList.add(r);
            i++;
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۦۥ, reason: contains not printable characters */
    public static final <S, T extends S> List<S> m11015(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5138<? super S, ? super T, ? extends S> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C3880.m10735();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(C3881.m10756(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = interfaceC5138.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۦۦ, reason: contains not printable characters */
    public static final <S, T extends S> List<S> m11016(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5140<? super Integer, ? super S, ? super T, ? extends S> interfaceC5140) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C3880.m10735();
        }
        S next = it.next();
        ArrayList arrayList = new ArrayList(C3881.m10756(iterable, 10));
        arrayList.add(next);
        int i = 1;
        while (it.hasNext()) {
            next = interfaceC5140.mo15350(Integer.valueOf(i), next, it.next());
            arrayList.add(next);
            i++;
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۦۧ, reason: contains not printable characters */
    public static final <T, R> List<R> m11017(@InterfaceC6399 Iterable<? extends T> iterable, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        int iM10756 = C3881.m10756(iterable, 9);
        if (iM10756 == 0) {
            return C3879.m10715(r);
        }
        ArrayList arrayList = new ArrayList(iM10756 + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r = interfaceC5138.invoke(r, it.next());
            arrayList.add(r);
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟ۡۦۨ, reason: contains not printable characters */
    public static final <T, R> List<R> m11018(@InterfaceC6399 Iterable<? extends T> iterable, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super R, ? super T, ? extends R> interfaceC5140) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        int iM10756 = C3881.m10756(iterable, 9);
        if (iM10756 == 0) {
            return C3879.m10715(r);
        }
        ArrayList arrayList = new ArrayList(iM10756 + 1);
        arrayList.add(r);
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            r = interfaceC5140.mo15350(Integer.valueOf(i), r, it.next());
            arrayList.add(r);
            i++;
        }
        return arrayList;
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static final <T> void m11019(@InterfaceC6399 List<T> list, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(list, "<this>");
        C5499.m17103(abstractC7000, "random");
        for (int iM10737 = C3880.m10737(list); iM10737 > 0; iM10737--) {
            int iMo5817 = abstractC7000.mo5817(iM10737 + 1);
            list.set(iMo5817, list.set(iM10737, list.get(iMo5817)));
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ۟, reason: contains not printable characters */
    public static <T> T m11020(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) m11022((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ۠, reason: contains not printable characters */
    public static final <T> T m11021(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : iterable) {
            if (interfaceC5124.invoke(t2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧۡ, reason: contains not printable characters */
    public static final <T> T m11022(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۧۢ, reason: contains not printable characters */
    public static final <T> T m11023(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final <T> T m11024(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        boolean z = false;
        T t = null;
        for (T t2 : iterable) {
            if (interfaceC5124.invoke(t2).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۡۧۤ, reason: contains not printable characters */
    public static <T> T m11025(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۧۥ, reason: contains not printable characters */
    public static final <T> List<T> m11026(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(list, "<this>");
        C5499.m17103(c5458, "indices");
        return c5458.isEmpty() ? C3880.m10735() : m11062(list.subList(c5458.mo830().intValue(), c5458.mo10384().intValue() + 1));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۧۦ, reason: contains not printable characters */
    public static final <T> List<T> m11027(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 Iterable<Integer> iterable) {
        C5499.m17103(list, "<this>");
        C5499.m17103(iterable, "indices");
        int iM10756 = C3881.m10756(iterable, 10);
        if (iM10756 == 0) {
            return C3880.m10735();
        }
        ArrayList arrayList = new ArrayList(iM10756);
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧۧ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> void m11028(@InterfaceC6399 List<T> list, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (list.size() > 1) {
            C3884.m10770(list, new C4033.C0311(interfaceC5124));
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧۨ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> void m11029(@InterfaceC6399 List<T> list, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        if (list.size() > 1) {
            C3884.m10770(list, new C4033.C4034(interfaceC5124));
        }
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> void m11030(@InterfaceC6399 List<T> list) {
        C5499.m17103(list, "<this>");
        C3884.m10770(list, C4033.m11401());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨ۟, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> List<T> m11031(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> listM11064 = m11064(iterable);
            C3884.m10767(listM11064);
            return listM11064;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m11062(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        C3404.m7304((Comparable[]) array);
        return C3404.m7069(array);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨ۠, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> List<T> m11032(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        return m11035(iterable, new C4033.C0311(interfaceC5124));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨۡ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> List<T> m11033(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        return m11035(iterable, new C4033.C4034(interfaceC5124));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨۢ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> List<T> m11034(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return m11035(iterable, C4033.m11401());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: java.util.Collection */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static <T> List<T> m11035(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> listM11064 = m11064(iterable);
            C3884.m10770(listM11064, comparator);
            return listM11064;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m11062(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        C3404.m7317(array, comparator);
        return C3404.m7069(array);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨۤ, reason: contains not printable characters */
    public static final <T> Set<T> m11036(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Iterable<? extends T> iterable2) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(iterable2, "other");
        Set<T> setM11066 = m11066(iterable);
        C3885.m10789(setM11066, iterable2);
        return setM11066;
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC4372(message = "Use sumOf instead.", replaceWith = @InterfaceC7097(expression = "this.sumOf(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۡۨۥ, reason: contains not printable characters */
    public static final <T> int m11037(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Integer> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += interfaceC5124.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC4372(message = "Use sumOf instead.", replaceWith = @InterfaceC7097(expression = "this.sumOf(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۡۨۦ, reason: contains not printable characters */
    public static final <T> double m11038(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += interfaceC5124.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC5572(name = "sumOfByte")
    /* JADX INFO: renamed from: ۥ۟ۡۨۧ, reason: contains not printable characters */
    public static final int m11039(@InterfaceC6399 Iterable<Byte> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    @InterfaceC5572(name = "sumOfDouble")
    /* JADX INFO: renamed from: ۥ۟ۡۨۨ, reason: contains not printable characters */
    public static final double m11040(@InterfaceC6399 Iterable<Double> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfDouble")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final <T> double m11041(Iterable<? extends T> iterable, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += interfaceC5124.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC5572(name = "sumOfFloat")
    /* JADX INFO: renamed from: ۥ۟ۢ۟, reason: contains not printable characters */
    public static final float m11042(@InterfaceC6399 Iterable<Float> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @InterfaceC5572(name = "sumOfInt")
    /* JADX INFO: renamed from: ۥ۟ۢ۟۟, reason: contains not printable characters */
    public static final int m11043(@InterfaceC6399 Iterable<Integer> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfInt")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢ۟۠, reason: contains not printable characters */
    public static final <T> int m11044(Iterable<? extends T> iterable, InterfaceC5124<? super T, Integer> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += interfaceC5124.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @InterfaceC5572(name = "sumOfLong")
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۡ, reason: contains not printable characters */
    public static final long m11045(@InterfaceC6399 Iterable<Long> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "sumOfLong")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۢ, reason: contains not printable characters */
    public static final <T> long m11046(Iterable<? extends T> iterable, InterfaceC5124<? super T, Long> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += interfaceC5124.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    @InterfaceC5572(name = "sumOfShort")
    /* JADX INFO: renamed from: ۥۣ۟ۢ۟, reason: contains not printable characters */
    public static final int m11047(@InterfaceC6399 Iterable<Short> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfUInt")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۤ, reason: contains not printable characters */
    public static final <T> int m11048(Iterable<? extends T> iterable, InterfaceC5124<? super T, C8057> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        int iM26318 = C8057.m26318(0);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            iM26318 = C8057.m26318(iM26318 + interfaceC5124.invoke(it.next()).m26372());
        }
        return iM26318;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "sumOfULong")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4776.class})
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۥ, reason: contains not printable characters */
    public static final <T> long m11049(Iterable<? extends T> iterable, InterfaceC5124<? super T, C8064> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        long jM26408 = C8064.m26408(0L);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            jM26408 = C8064.m26408(jM26408 + interfaceC5124.invoke(it.next()).m26462());
        }
        return jM26408;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۦ, reason: contains not printable characters */
    public static final <T> List<T> m11050(@InterfaceC6399 Iterable<? extends T> iterable, int i) {
        C5499.m17103(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return C3880.m10735();
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return m11062(iterable);
            }
            if (i == 1) {
                return C3879.m10715(m10884(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator<? extends T> it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return C3880.m10747(arrayList);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۧ, reason: contains not printable characters */
    public static final <T> List<T> m11051(@InterfaceC6399 List<? extends T> list, int i) {
        C5499.m17103(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return C3880.m10735();
        }
        int size = list.size();
        if (i >= size) {
            return m11062(list);
        }
        if (i == 1) {
            return C3879.m10715(m10926(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۨ, reason: contains not printable characters */
    public static final <T> List<T> m11052(@InterfaceC6399 List<? extends T> list, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        if (list.isEmpty()) {
            return C3880.m10735();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!interfaceC5124.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return C3880.m10735();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return m11062(list);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠, reason: contains not printable characters */
    public static final <T> List<T> m11053(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!interfaceC5124.invoke(t).booleanValue()) {
                break;
            }
            arrayList.add(t);
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠۟, reason: contains not printable characters */
    public static final boolean[] m11054(@InterfaceC6399 Collection<Boolean> collection) {
        C5499.m17103(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = it.next().booleanValue();
            i++;
        }
        return zArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠۠, reason: contains not printable characters */
    public static byte[] m11055(@InterfaceC6399 Collection<Byte> collection) {
        C5499.m17103(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = it.next().byteValue();
            i++;
        }
        return bArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۡ, reason: contains not printable characters */
    public static final char[] m11056(@InterfaceC6399 Collection<Character> collection) {
        C5499.m17103(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            cArr[i] = it.next().charValue();
            i++;
        }
        return cArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۢ, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m11057(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 C c) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(c, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢ۠, reason: contains not printable characters */
    public static final double[] m11058(@InterfaceC6399 Collection<Double> collection) {
        C5499.m17103(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            dArr[i] = it.next().doubleValue();
            i++;
        }
        return dArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۤ, reason: contains not printable characters */
    public static final float[] m11059(@InterfaceC6399 Collection<Float> collection) {
        C5499.m17103(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = it.next().floatValue();
            i++;
        }
        return fArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۥ, reason: contains not printable characters */
    public static final <T> HashSet<T> m11060(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return (HashSet) m11057(iterable, new HashSet(C5942.m18568(C3881.m10756(iterable, 12))));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۦ, reason: contains not printable characters */
    public static int[] m11061(@InterfaceC6399 Collection<Integer> collection) {
        C5499.m17103(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۧ, reason: contains not printable characters */
    public static <T> List<T> m11062(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C3880.m10747(m11064(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C3880.m10735();
        }
        if (size != 1) {
            return m11065(collection);
        }
        return C3879.m10715(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۨ, reason: contains not printable characters */
    public static long[] m11063(@InterfaceC6399 Collection<Long> collection) {
        C5499.m17103(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۡ, reason: contains not printable characters */
    public static final <T> List<T> m11064(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return iterable instanceof Collection ? m11065((Collection) iterable) : (List) m11057(iterable, new ArrayList());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۡ۟, reason: contains not printable characters */
    public static <T> List<T> m11065(@InterfaceC6399 Collection<? extends T> collection) {
        C5499.m17103(collection, "<this>");
        return new ArrayList(collection);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۡ۠, reason: contains not printable characters */
    public static <T> Set<T> m11066(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) m11057(iterable, new LinkedHashSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۡۡ, reason: contains not printable characters */
    public static <T> Set<T> m11067(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C7387.m23132((Set) m11057(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C7387.m23125();
        }
        if (size != 1) {
            return (Set) m11057(iterable, new LinkedHashSet(C5942.m18568(collection.size())));
        }
        return C7386.m23120(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۡۢ, reason: contains not printable characters */
    public static short[] m11068(@InterfaceC6399 Collection<Short> collection) {
        C5499.m17103(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            sArr[i] = it.next().shortValue();
            i++;
        }
        return sArr;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢۡ, reason: contains not printable characters */
    public static final <T> Set<T> m11069(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Iterable<? extends T> iterable2) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(iterable2, "other");
        Set<T> setM11066 = m11066(iterable);
        C3885.m10772(setM11066, iterable2);
        return setM11066;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟ۢۡۤ, reason: contains not printable characters */
    public static final <T> List<List<T>> m11070(@InterfaceC6399 Iterable<? extends T> iterable, int i, int i2, boolean z) {
        C5499.m17103(iterable, "<this>");
        C7487.m3680(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM3681 = C7487.m3681(iterable.iterator(), i, i2, z, false);
            while (itM3681.hasNext()) {
                arrayList.add((List) itM3681.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int iM21668 = C7007.m21668(i, size - i3);
            if (iM21668 < i && !z) {
                break;
            }
            ArrayList arrayList3 = new ArrayList(iM21668);
            for (int i4 = 0; i4 < iM21668; i4++) {
                arrayList3.add(list.get(i4 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟ۢۡۥ, reason: contains not printable characters */
    public static final <T, R> List<R> m11071(@InterfaceC6399 Iterable<? extends T> iterable, int i, int i2, boolean z, @InterfaceC6399 InterfaceC5124<? super List<? extends T>, ? extends R> interfaceC5124) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        C7487.m3680(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itM3681 = C7487.m3681(iterable.iterator(), i, i2, z, true);
            while (itM3681.hasNext()) {
                arrayList.add(interfaceC5124.invoke((List) itM3681.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i3 = 0;
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        C6286 c6286 = new C6286(list);
        while (i3 >= 0 && i3 < size) {
            int iM21668 = C7007.m21668(i, size - i3);
            if (!z && iM21668 < i) {
                break;
            }
            c6286.m2760(i3, iM21668 + i3);
            arrayList2.add(interfaceC5124.invoke(c6286));
            i3 += i2;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ۥ۟ۢۡۦ, reason: contains not printable characters */
    public static /* synthetic */ List m11072(Iterable iterable, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m11070(iterable, i, i2, z);
    }

    /* JADX INFO: renamed from: ۥ۟ۢۡۧ, reason: contains not printable characters */
    public static /* synthetic */ List m11073(Iterable iterable, int i, int i2, boolean z, InterfaceC5124 interfaceC5124, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m11071(iterable, i, i2, z, interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۡۨ, reason: contains not printable characters */
    public static final <T> Iterable<C5428<T>> m11074(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        return new C5429(new C3890(iterable));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢ, reason: contains not printable characters */
    public static <T, R> List<C6599<T, R>> m11075(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Iterable<? extends R> iterable2) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C3881.m10756(iterable, 10), C3881.m10756(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C8003.m4014(it.next(), it2.next()));
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢ۟, reason: contains not printable characters */
    public static final <T, R, V> List<V> m11076(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 Iterable<? extends R> iterable2, @InterfaceC6399 InterfaceC5138<? super T, ? super R, ? extends V> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(iterable2, "other");
        C5499.m17103(interfaceC5138, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C3881.m10756(iterable, 10), C3881.m10756(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(interfaceC5138.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢ۠, reason: contains not printable characters */
    public static final <T, R> List<C6599<T, R>> m11077(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 R[] rArr) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(rArr, "other");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C3881.m10756(iterable, 10), length));
        int i = 0;
        for (T t : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(C8003.m4014(t, rArr[i]));
            i++;
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Yue.ۥ۟۟۟ۢ$ۥ */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢۢۡ, reason: contains not printable characters */
    public static final <T, R, V> List<V> m11078(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 R[] rArr, @InterfaceC6399 InterfaceC5138<? super T, ? super R, ? extends V> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(rArr, "other");
        C5499.m17103(interfaceC5138, "transform");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C3881.m10756(iterable, 10), length));
        int i = 0;
        for (T t : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(interfaceC5138.invoke(t, rArr[i]));
            i++;
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟ۢۢۢ, reason: contains not printable characters */
    public static final <T> List<C6599<T, T>> m11079(@InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C3880.m10735();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(C8003.m4014(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟ۢۢ, reason: contains not printable characters */
    public static final <T, R> List<R> m11080(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC5138<? super T, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return C3880.m10735();
        }
        ArrayList arrayList = new ArrayList();
        C2954.C0003 next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(interfaceC5138.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }
}
