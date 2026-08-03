package Yue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۣۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,481:1\n404#1:483\n1#2:482\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n398#1:483\n*E\n"})
public class C3880 extends C3879 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۣۡ$ۥ */
    @InterfaceC7507({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1\n*L\n1#1,481:1\n*E\n"})
    public static final class C0277<T> extends AbstractC5673 implements InterfaceC5124<T, Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, K> f7426;

        /* JADX INFO: Incorrect field signature: TK; */
        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Comparable f7427;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Incorrect types in method signature: (LYue/ۥۣ۠ۡ۟<-TT;+TK;>;TK;)V */
        public C0277(InterfaceC5124 interfaceC5124, Comparable comparable) {
            super(1);
            this.f7426 = interfaceC5124;
            this.f7427 = comparable;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Integer invoke(T t) {
            return Integer.valueOf(C4033.m11389((Comparable) this.f7426.invoke(t), this.f7427));
        }
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> List<T> m10719(int i, InterfaceC5124<? super Integer, ? extends T> interfaceC5124) {
        C5499.m17103(interfaceC5124, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(interfaceC5124.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> List<T> m10720(int i, InterfaceC5124<? super Integer, ? extends T> interfaceC5124) {
        C5499.m17103(interfaceC5124, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(interfaceC5124.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final <T> ArrayList<T> m10721() {
        return new ArrayList<>();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <T> ArrayList<T> m10722(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C3377(tArr, true));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <T> Collection<T> m10723(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "<this>");
        return new C3377(tArr, false);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <T> int m10724(@InterfaceC6399 List<? extends T> list, int i, int i2, @InterfaceC6399 InterfaceC5124<? super T, Integer> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "comparison");
        m10750(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iIntValue = interfaceC5124.invoke(list.get(i4)).intValue();
            if (iIntValue < 0) {
                i = i4 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> int m10725(@InterfaceC6399 List<? extends T> list, @InterfaceC6489 T t, int i, int i2) {
        C5499.m17103(list, "<this>");
        m10750(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iM11389 = C4033.m11389(list.get(i4), t);
            if (iM11389 < 0) {
                i = i4 + 1;
            } else {
                if (iM11389 <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final <T> int m10726(@InterfaceC6399 List<? extends T> list, T t, @InterfaceC6399 Comparator<? super T> comparator, int i, int i2) {
        C5499.m17103(list, "<this>");
        C5499.m17103(comparator, "comparator");
        m10750(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iCompare = comparator.compare(list.get(i4), t);
            if (iCompare < 0) {
                i = i4 + 1;
            } else {
                if (iCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ int m10727(List list, int i, int i2, InterfaceC5124 interfaceC5124, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return m10724(list, i, i2, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ int m10728(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m10725(list, comparable, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static /* synthetic */ int m10729(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return m10726(list, obj, comparator, i, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final <T, K extends Comparable<? super K>> int m10730(@InterfaceC6399 List<? extends T> list, @InterfaceC6489 K k, int i, int i2, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(list, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        return m10724(list, i, i2, new C0277(interfaceC5124, k));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static /* synthetic */ int m10731(List list, Comparable comparable, int i, int i2, InterfaceC5124 interfaceC5124, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m10724(list, i, i2, new C0277(interfaceC5124, comparable));
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final <E> List<E> m10732(int i, @InterfaceC3614 InterfaceC5124<? super List<E>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        List listM10714 = C3879.m10714(i);
        interfaceC5124.invoke(listM10714);
        return C3879.m917(listM10714);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <E> List<E> m10733(@InterfaceC3614 InterfaceC5124<? super List<E>, C8107> interfaceC5124) {
        C5499.m17103(interfaceC5124, "builderAction");
        List listM10713 = C3879.m10713();
        interfaceC5124.invoke(listM10713);
        return C3879.m917(listM10713);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final <T> boolean m10734(Collection<? extends T> collection, Collection<? extends T> collection2) {
        C5499.m17103(collection, "<this>");
        C5499.m17103(collection2, "elements");
        return collection.containsAll(collection2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static <T> List<T> m10735() {
        return C4633.f9945;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static C5458 m10736(@InterfaceC6399 Collection<?> collection) {
        C5499.m17103(collection, "<this>");
        return new C5458(0, collection.size() - 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static <T> int m10737(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARN: Incorrect types in method signature: <C::Ljava/util/Collection<*>;:TR;R:Ljava/lang/Object;>(TC;LYue/ۥۣ۠۠ۨ<+TR;>;)TR; */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final Object m10738(Collection collection, InterfaceC5122 interfaceC5122) {
        C5499.m17103(interfaceC5122, "defaultValue");
        return collection.isEmpty() ? interfaceC5122.invoke() : collection;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final <T> boolean m10739(Collection<? extends T> collection) {
        C5499.m17103(collection, "<this>");
        return !collection.isEmpty();
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final <T> boolean m10740(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final <T> List<T> m10741() {
        return m10735();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static <T> List<T> m10742(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return tArr.length > 0 ? C3404.m7069(tArr) : m10735();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final <T> List<T> m10743(@InterfaceC6489 T t) {
        return t != null ? C3879.m10715(t) : m10735();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static <T> List<T> m10744(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return C3411.m7691(tArr);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final <T> List<T> m10745() {
        return new ArrayList();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static <T> List<T> m10746(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C3377(tArr, true));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final <T> List<T> m10747(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C3879.m10715(list.get(0)) : m10735();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.Collection<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final <T> Collection<T> m10748(Collection<? extends T> collection) {
        return collection == 0 ? m10735() : collection;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final <T> List<T> m10749(List<? extends T> list) {
        return list == 0 ? m10735() : list;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final void m10750(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 <= i) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final <T> List<T> m10751(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(iterable, "<this>");
        C5499.m17103(abstractC7000, "random");
        List<T> listM11064 = C3888.m11064(iterable);
        C3888.m11019(listM11064, abstractC7000);
        return listM11064;
    }

    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static void m10752() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @InterfaceC6839
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m10753() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
