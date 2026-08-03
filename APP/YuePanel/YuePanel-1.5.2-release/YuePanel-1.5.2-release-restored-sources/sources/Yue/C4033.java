package Yue;

import java.util.Comparator;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4033 {

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ$ۥ */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class C0311<T> implements Comparator {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, Comparable<?>> f8099;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends java.lang.Comparable<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0311(InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124) {
            this.f8099 = interfaceC5124;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            InterfaceC5124<T, Comparable<?>> interfaceC5124 = this.f8099;
            return C4033.m11389(interfaceC5124.invoke(t), interfaceC5124.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ$ۥ۟ */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    public static final class C0312<T> implements Comparator {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Comparator<? super K> f8100;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, K> f8101;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends K> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0312(Comparator<? super K> comparator, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
            this.f8100 = comparator;
            this.f8101 = interfaceC5124;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f8100;
            InterfaceC5124<T, K> interfaceC5124 = this.f8101;
            return comparator.compare((Object) interfaceC5124.invoke(t), (Object) interfaceC5124.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C4034<T> implements Comparator {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, Comparable<?>> f8102;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends java.lang.Comparable<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4034(InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124) {
            this.f8102 = interfaceC5124;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            InterfaceC5124<T, Comparable<?>> interfaceC5124 = this.f8102;
            return C4033.m11389(interfaceC5124.invoke(t2), interfaceC5124.invoke(t));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class C4035<T> implements Comparator {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Comparator<? super K> f8103;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, K> f8104;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends K> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4035(Comparator<? super K> comparator, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
            this.f8103 = comparator;
            this.f8104 = interfaceC5124;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f8103;
            InterfaceC5124<T, K> interfaceC5124 = this.f8104;
            return comparator.compare((Object) interfaceC5124.invoke(t2), (Object) interfaceC5124.invoke(t));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C4036<T> implements Comparator {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Comparator<T> f8105;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, Comparable<?>> f8106;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends java.lang.Comparable<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4036(Comparator<T> comparator, InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124) {
            this.f8105 = comparator;
            this.f8106 = interfaceC5124;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f8105.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            InterfaceC5124<T, Comparable<?>> interfaceC5124 = this.f8106;
            return C4033.m11389(interfaceC5124.invoke(t), interfaceC5124.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    public static final class C4037<T> implements Comparator {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Comparator<T> f8107;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Comparator<? super K> f8108;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, K> f8109;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends K> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4037(Comparator<T> comparator, Comparator<? super K> comparator2, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
            this.f8107 = comparator;
            this.f8108 = comparator2;
            this.f8109 = interfaceC5124;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f8107.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f8108;
            InterfaceC5124<T, K> interfaceC5124 = this.f8109;
            return comparator.compare((Object) interfaceC5124.invoke(t), (Object) interfaceC5124.invoke(t2));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C4038<T> implements Comparator {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Comparator<T> f8110;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, Comparable<?>> f8111;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends java.lang.Comparable<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4038(Comparator<T> comparator, InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124) {
            this.f8110 = comparator;
            this.f8111 = interfaceC5124;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f8110.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            InterfaceC5124<T, Comparable<?>> interfaceC5124 = this.f8111;
            return C4033.m11389(interfaceC5124.invoke(t2), interfaceC5124.invoke(t));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    public static final class C4039<T> implements Comparator {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Comparator<T> f8112;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ Comparator<? super K> f8113;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, K> f8114;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends K> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4039(Comparator<T> comparator, Comparator<? super K> comparator2, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
            this.f8112 = comparator;
            this.f8113 = comparator2;
            this.f8114 = interfaceC5124;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f8112.compare(t, t2);
            if (iCompare != 0) {
                return iCompare;
            }
            Comparator<? super K> comparator = this.f8113;
            InterfaceC5124<T, K> interfaceC5124 = this.f8114;
            return comparator.compare((Object) interfaceC5124.invoke(t2), (Object) interfaceC5124.invoke(t));
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۦۣۢ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    public static final class C4040<T> implements Comparator {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Comparator<T> f8115;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<T, T, Integer> f8116;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super T, ? super T, java.lang.Integer> */
        /* JADX WARN: Multi-variable type inference failed */
        public C4040(Comparator<T> comparator, InterfaceC5138<? super T, ? super T, Integer> interfaceC5138) {
            this.f8115 = comparator;
            this.f8116 = interfaceC5138;
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.f8115.compare(t, t2);
            return iCompare != 0 ? iCompare : this.f8116.invoke(t, t2).intValue();
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> Comparator<T> m11383(InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124) {
        C5499.m17103(interfaceC5124, "selector");
        return new C0311(interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T, K> Comparator<T> m11384(Comparator<? super K> comparator, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        return new C0312(comparator, interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T> Comparator<T> m11385(@InterfaceC6399 final InterfaceC5124<? super T, ? extends Comparable<?>>... interfaceC5124Arr) {
        C5499.m17103(interfaceC5124Arr, "selectors");
        if (interfaceC5124Arr.length > 0) {
            return new Comparator() { // from class: Yue.ۥ۟ۦۢۡ
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return C4033.m11386(interfaceC5124Arr, obj, obj2);
                }
            };
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int m11386(InterfaceC5124[] interfaceC5124Arr, Object obj, Object obj2) {
        C5499.m17103(interfaceC5124Arr, "$selectors");
        return m11393(obj, obj2, interfaceC5124Arr);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T> Comparator<T> m11387(InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124) {
        C5499.m17103(interfaceC5124, "selector");
        return new C4034(interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T, K> Comparator<T> m11388(Comparator<? super K> comparator, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        return new C4035(comparator, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static <T extends Comparable<?>> int m11389(@InterfaceC6489 T t, @InterfaceC6489 T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final <T> int m11390(T t, T t2, InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124) {
        C5499.m17103(interfaceC5124, "selector");
        return m11389(interfaceC5124.invoke(t), interfaceC5124.invoke(t2));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final <T, K> int m11391(T t, T t2, Comparator<? super K> comparator, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        return comparator.compare(interfaceC5124.invoke(t), interfaceC5124.invoke(t2));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> int m11392(T t, T t2, @InterfaceC6399 InterfaceC5124<? super T, ? extends Comparable<?>>... interfaceC5124Arr) {
        C5499.m17103(interfaceC5124Arr, "selectors");
        if (interfaceC5124Arr.length > 0) {
            return m11393(t, t2, interfaceC5124Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> int m11393(T t, T t2, InterfaceC5124<? super T, ? extends Comparable<?>>[] interfaceC5124Arr) {
        for (InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124 : interfaceC5124Arr) {
            int iM11389 = m11389(interfaceC5124.invoke(t), interfaceC5124.invoke(t2));
            if (iM11389 != 0) {
                return iM11389;
            }
        }
        return 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static <T extends Comparable<? super T>> Comparator<T> m11394() {
        C6353 c6353 = C6353.f16122;
        C5499.m17101(c6353, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return c6353;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> Comparator<T> m11395() {
        return m11396(m11394());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <T> Comparator<T> m11396(@InterfaceC6399 final Comparator<? super T> comparator) {
        C5499.m17103(comparator, "comparator");
        return new Comparator() { // from class: Yue.ۥ۟ۦۢۢ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4033.m11397(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int m11397(Comparator comparator, Object obj, Object obj2) {
        C5499.m17103(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> Comparator<T> m11398() {
        return m11399(m11394());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final <T> Comparator<T> m11399(@InterfaceC6399 final Comparator<? super T> comparator) {
        C5499.m17103(comparator, "comparator");
        return new Comparator() { // from class: Yue.ۥ۟ۦۢ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4033.m11400(comparator, obj, obj2);
            }
        };
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int m11400(Comparator comparator, Object obj, Object obj2) {
        C5499.m17103(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static <T extends Comparable<? super T>> Comparator<T> m11401() {
        C7163 c7163 = C7163.f21577;
        C5499.m17101(c7163, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return c7163;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final <T> Comparator<T> m11402(@InterfaceC6399 Comparator<T> comparator) {
        C5499.m17103(comparator, "<this>");
        if (comparator instanceof C7164) {
            return ((C7164) comparator).m3451();
        }
        Comparator<T> c7164 = C6353.f16122;
        if (C5499.m17094(comparator, c7164)) {
            C7163 c7163 = C7163.f21577;
            C5499.m17101(c7163, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return c7163;
        }
        if (C5499.m17094(comparator, C7163.f21577)) {
            C5499.m17101(c7164, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            c7164 = new C7164<>(comparator);
        }
        return c7164;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final <T> Comparator<T> m11403(@InterfaceC6399 final Comparator<T> comparator, @InterfaceC6399 final Comparator<? super T> comparator2) {
        C5499.m17103(comparator, "<this>");
        C5499.m17103(comparator2, "comparator");
        return new Comparator() { // from class: Yue.ۥ۟ۦۢ۠
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4033.m11404(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int m11404(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        C5499.m17103(comparator, "$this_then");
        C5499.m17103(comparator2, "$comparator");
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj, obj2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final <T> Comparator<T> m11405(Comparator<T> comparator, InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124) {
        C5499.m17103(comparator, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        return new C4036(comparator, interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final <T, K> Comparator<T> m11406(Comparator<T> comparator, Comparator<? super K> comparator2, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(comparator, "<this>");
        C5499.m17103(comparator2, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        return new C4037(comparator, comparator2, interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final <T> Comparator<T> m11407(Comparator<T> comparator, InterfaceC5124<? super T, ? extends Comparable<?>> interfaceC5124) {
        C5499.m17103(comparator, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        return new C4038(comparator, interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final <T, K> Comparator<T> m11408(Comparator<T> comparator, Comparator<? super K> comparator2, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(comparator, "<this>");
        C5499.m17103(comparator2, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        return new C4039(comparator, comparator2, interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final <T> Comparator<T> m11409(Comparator<T> comparator, InterfaceC5138<? super T, ? super T, Integer> interfaceC5138) {
        C5499.m17103(comparator, "<this>");
        C5499.m17103(interfaceC5138, "comparison");
        return new C4040(comparator, interfaceC5138);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final <T> Comparator<T> m11410(@InterfaceC6399 final Comparator<T> comparator, @InterfaceC6399 final Comparator<? super T> comparator2) {
        C5499.m17103(comparator, "<this>");
        C5499.m17103(comparator2, "comparator");
        return new Comparator() { // from class: Yue.ۥ۟ۦۢ۟
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C4033.m11411(comparator, comparator2, obj, obj2);
            }
        };
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int m11411(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        C5499.m17103(comparator, "$this_thenDescending");
        C5499.m17103(comparator2, "$comparator");
        int iCompare = comparator.compare(obj, obj2);
        return iCompare != 0 ? iCompare : comparator2.compare(obj2, obj);
    }
}
