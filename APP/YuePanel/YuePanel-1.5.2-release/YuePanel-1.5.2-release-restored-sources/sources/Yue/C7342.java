package Yue;

import Yue.C4033;
import Yue.C7060;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۡۨۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3112:1\n179#1,2:3113\n316#1,7:3115\n1324#1,3:3123\n739#1,4:3126\n704#1,4:3130\n722#1,4:3134\n775#1,4:3138\n1017#1,3:3142\n1020#1,3:3152\n1037#1,3:3155\n1040#1,3:3165\n1324#1,3:3182\n1313#1,2:3185\n1#2:3122\n372#3,7:3145\n372#3,7:3158\n372#3,7:3168\n372#3,7:3175\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n87#1:3113,2\n99#1:3115,7\n458#1:3123,3\n658#1:3126,4\n674#1:3130,4\n689#1:3134,4\n760#1:3138,4\n988#1:3142,3\n988#1:3152,3\n1003#1:3155,3\n1003#1:3165,3\n1106#1:3182,3\n1144#1:3185,2\n988#1:3145,7\n1003#1:3158,7\n1019#1:3168,7\n1039#1:3175,7\n*E\n"})
public class C7342 extends C7341 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ */
    @InterfaceC7507({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n2921#2:71\n*E\n"})
    public static final class C1236<T> implements Iterable<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326 f22175;

        public C1236(InterfaceC7326 interfaceC7326) {
            this.f22175 = interfaceC7326;
        }

        @Override // java.lang.Iterable
        @InterfaceC6399
        public Iterator<T> iterator() {
            return this.f22175.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟ */
    public static final class C1237<T> extends AbstractC5673 implements InterfaceC5124<T, T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1237 f22176 = new C1237();

        public C1237() {
            super(1);
        }

        @Override // Yue.InterfaceC5124
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7343<T> extends AbstractC5673 implements InterfaceC5124<Integer, T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ int f22177;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7343(int i) {
            super(1);
            this.f22177 = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // Yue.InterfaceC5124
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return m23094(num.intValue());
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final T m23094(int i) {
            throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f22177 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C7344<T> extends AbstractC5673 implements InterfaceC5124<C5428<? extends T>, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<Integer, T, Boolean> f22178;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.lang.Integer, ? super T, java.lang.Boolean> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7344(InterfaceC5138<? super Integer, ? super T, Boolean> interfaceC5138) {
            super(1);
            this.f22178 = interfaceC5138;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6399 C5428<? extends T> c5428) {
            C5499.m17103(c5428, "it");
            return this.f22178.invoke(Integer.valueOf(c5428.m16914()), c5428.m16915());
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7345<T> extends AbstractC5673 implements InterfaceC5124<C5428<? extends T>, T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7345 f22179 = new C7345();

        public C7345() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final T invoke(@InterfaceC6399 C5428<? extends T> c5428) {
            C5499.m17103(c5428, "it");
            return c5428.m16915();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$filterIsInstance$1\n*L\n1#1,3112:1\n*E\n"})
    public static final class C7346 extends AbstractC5673 implements InterfaceC5124<Object, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7346 f22180 = new C7346();

        public C7346() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6489 Object obj) {
            C5499.m17112(3, "R");
            return Boolean.valueOf(obj instanceof Object);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C7347<T> extends AbstractC5673 implements InterfaceC5124<T, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7347 f22181 = new C7347();

        public C7347() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6489 T t) {
            return Boolean.valueOf(t == null);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public /* synthetic */ class C7348<R> extends C5153 implements InterfaceC5124<Iterable<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7348 f22182 = new C7348();

        public C7348() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(@InterfaceC6399 Iterable<? extends R> iterable) {
            C5499.m17103(iterable, "p0");
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥۣ۟۟۟, reason: contains not printable characters */
    public /* synthetic */ class C7349<R> extends C5153 implements InterfaceC5124<InterfaceC7326<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7349 f22183 = new C7349();

        public C7349() {
            super(1, InterfaceC7326.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(@InterfaceC6399 InterfaceC7326<? extends R> interfaceC7326) {
            C5499.m17103(interfaceC7326, "p0");
            return interfaceC7326.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public /* synthetic */ class C7350<R> extends C5153 implements InterfaceC5124<Iterable<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7350 f22184 = new C7350();

        public C7350() {
            super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(@InterfaceC6399 Iterable<? extends R> iterable) {
            C5499.m17103(iterable, "p0");
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public /* synthetic */ class C7351<R> extends C5153 implements InterfaceC5124<InterfaceC7326<? extends R>, Iterator<? extends R>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7351 f22185 = new C7351();

        public C7351() {
            super(1, InterfaceC7326.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Iterator<R> invoke(@InterfaceC6399 InterfaceC7326<? extends R> interfaceC7326) {
            C5499.m17103(interfaceC7326, "p0");
            return interfaceC7326.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, K] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$groupingBy$1\n*L\n1#1,3112:1\n*E\n"})
    public static final class C7352<K, T> implements InterfaceC5218<T, K> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC7326<T> f2814;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ InterfaceC5124<T, K> f2815;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, ? extends K> */
        /* JADX WARN: Multi-variable type inference failed */
        public C7352(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends K> interfaceC5124) {
            this.f2814 = interfaceC7326;
            this.f2815 = interfaceC5124;
        }

        @Override // Yue.InterfaceC5218
        /* JADX INFO: renamed from: ۥ */
        public K mo500(T t) {
            return this.f2815.invoke(t);
        }

        @Override // Yue.InterfaceC5218
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public Iterator<T> mo501() {
            return this.f2814.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final class C7353<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC7326<T> f2816;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ T f2817;

        /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟ۧ$ۥ */
        public static final class C1238 extends AbstractC5673 implements InterfaceC5124<T, Boolean> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ C7060.C1153 f22186;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ T f22187;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1238(C7060.C1153 c1153, T t) {
                super(1);
                this.f22186 = c1153;
                this.f22187 = t;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Boolean invoke(T t) {
                boolean z = true;
                if (!this.f22186.f21346 && C5499.m17094(t, this.f22187)) {
                    this.f22186.f21346 = true;
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C7353(InterfaceC7326<? extends T> interfaceC7326, T t) {
            this.f2816 = interfaceC7326;
            this.f2817 = t;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            return C7342.m22938(this.f2816, new C1238(new C7060.C1153(), this.f2817)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final class C7354<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC7326<T> f2818;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ T[] f2819;

        /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۟ۨ$ۥ */
        public static final class C1239 extends AbstractC5673 implements InterfaceC5124<T, Boolean> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ T[] f22188;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1239(T[] tArr) {
                super(1);
                this.f22188 = tArr;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Boolean invoke(T t) {
                return Boolean.valueOf(C3411.m7560(this.f22188, t));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C7354(InterfaceC7326<? extends T> interfaceC7326, T[] tArr) {
            this.f2818 = interfaceC7326;
            this.f2819 = tArr;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            return C7342.m22943(this.f2818, new C1239(this.f2819)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠, reason: contains not printable characters */
    public static final class C7355<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Iterable<T> f2820;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ InterfaceC7326<T> f2821;

        /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠$ۥ */
        public static final class C1240 extends AbstractC5673 implements InterfaceC5124<T, Boolean> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Collection<T> f22189;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.Collection<? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1240(Collection<? extends T> collection) {
                super(1);
                this.f22189 = collection;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Boolean invoke(T t) {
                return Boolean.valueOf(this.f22189.contains(t));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Iterable<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C7355(Iterable<? extends T> iterable, InterfaceC7326<? extends T> interfaceC7326) {
            this.f2820 = iterable;
            this.f2821 = interfaceC7326;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            Collection collectionM10774 = C3885.m10774(this.f2820);
            return collectionM10774.isEmpty() ? this.f2821.iterator() : C7342.m22943(this.f2821, new C1240(collectionM10774)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠۟, reason: contains not printable characters */
    public static final class C7356<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC7326<T> f2822;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ InterfaceC7326<T> f2823;

        /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠۟$ۥ */
        public static final class C1241 extends AbstractC5673 implements InterfaceC5124<T, Boolean> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ List<T> f22190;

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends T> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1241(List<? extends T> list) {
                super(1);
                this.f22190 = list;
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6399
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final Boolean invoke(T t) {
                return Boolean.valueOf(this.f22190.contains(t));
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C7356(InterfaceC7326<? extends T> interfaceC7326, InterfaceC7326<? extends T> interfaceC73262) {
            this.f2822 = interfaceC7326;
            this.f2823 = interfaceC73262;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            List listM23081 = C7342.m23081(this.f2822);
            return listM23081.isEmpty() ? this.f2823.iterator() : C7342.m22943(this.f2823, new C1241(listM23081)).iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠۠, reason: contains not printable characters */
    public static final class C7357<T> extends AbstractC5673 implements InterfaceC5124<T, T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<T, C8107> f22191;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7357(InterfaceC5124<? super T, C8107> interfaceC5124) {
            super(1);
            this.f22191 = interfaceC5124;
        }

        @Override // Yue.InterfaceC5124
        public final T invoke(T t) {
            this.f22191.invoke(t);
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final class C7358<T> extends AbstractC5673 implements InterfaceC5138<Integer, T, T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<Integer, T, C8107> f22192;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.lang.Integer, ? super T, Yue.ۥۣۢ۠ۤ> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7358(InterfaceC5138<? super Integer, ? super T, C8107> interfaceC5138) {
            super(2);
            this.f22192 = interfaceC5138;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ Object invoke(Integer num, Object obj) {
            return m23107(num.intValue(), obj);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final T m23107(int i, T t) {
            this.f22192.invoke(Integer.valueOf(i), t);
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final class C7359<T> extends AbstractC5673 implements InterfaceC5124<T, T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326<T> f22193;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7359(InterfaceC7326<? extends T> interfaceC7326) {
            super(1);
            this.f22193 = interfaceC7326;
        }

        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        public final T invoke(@InterfaceC6489 T t) {
            if (t != null) {
                return t;
            }
            throw new IllegalArgumentException("null element found in " + this.f22193 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlin.sequences.SequencesKt___SequencesKt$runningFold$1", m1273f = "_Sequences.kt", m1274i = {0, 1, 1}, m1275l = {2308, 2312}, m1276m = "invokeSuspend", m1277n = {"$this$sequence", "$this$sequence", "accumulator"}, m1278s = {"L$0", "L$0", "L$1"})
    public static final class C7360<R> extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super R>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22194;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f22195;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f22196;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f22197;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ R f22198;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326<T> f22199;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<R, T, R> f22200;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۢ<? super R, ? super T, ? extends R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7360(R r, InterfaceC7326<? extends T> interfaceC7326, InterfaceC5138<? super R, ? super T, ? extends R> interfaceC5138, InterfaceC4199<? super C7360> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22198 = r;
            this.f22199 = interfaceC7326;
            this.f22200 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7360 c7360 = new C7360(this.f22198, this.f22199, this.f22200, interfaceC4199);
            c7360.f22197 = obj;
            return c7360;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0068 -> B:7:0x001b). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            AbstractC7328 abstractC7328;
            Object obj2;
            AbstractC7328 abstractC73282;
            Iterator it;
            Object objM17142 = C5508.m17142();
            int i = this.f22196;
            if (i == 0) {
                C7149.m22422(obj);
                abstractC7328 = (AbstractC7328) this.f22197;
                R r = this.f22198;
                this.f22197 = abstractC7328;
                this.f22196 = 1;
                if (abstractC7328.mo3574(r, this) == objM17142) {
                    return objM17142;
                }
            } else if (i == 1) {
                abstractC7328 = (AbstractC7328) this.f22197;
                C7149.m22422(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.f22195;
                Object objInvoke = this.f22194;
                abstractC73282 = (AbstractC7328) this.f22197;
                C7149.m22422(obj);
                obj2 = objInvoke;
                if (it.hasNext()) {
                    objInvoke = this.f22200.invoke((R) obj2, (T) it.next());
                    this.f22197 = abstractC73282;
                    this.f22194 = objInvoke;
                    this.f22195 = it;
                    this.f22196 = 2;
                    if (abstractC73282.mo3574(objInvoke, this) == objM17142) {
                        return objM17142;
                    }
                    obj2 = objInvoke;
                    if (it.hasNext()) {
                        return C8107.f3222;
                    }
                }
            }
            obj2 = this.f22198;
            abstractC73282 = abstractC7328;
            it = this.f22199.iterator();
            if (it.hasNext()) {
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super R> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7360) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlin.sequences.SequencesKt___SequencesKt$runningFoldIndexed$1", m1273f = "_Sequences.kt", m1274i = {0, 1, 1, 1}, m1275l = {2336, 2341}, m1276m = "invokeSuspend", m1277n = {"$this$sequence", "$this$sequence", "accumulator", "index"}, m1278s = {"L$0", "L$0", "L$1", "I$0"})
    public static final class C7361<R> extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super R>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22201;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f22202;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f22203;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f22204;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public /* synthetic */ Object f22205;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ R f22206;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326<T> f22207;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<Integer, R, T, R> f22208;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.lang.Integer, ? super R, ? super T, ? extends R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7361(R r, InterfaceC7326<? extends T> interfaceC7326, InterfaceC5140<? super Integer, ? super R, ? super T, ? extends R> interfaceC5140, InterfaceC4199<? super C7361> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22206 = r;
            this.f22207 = interfaceC7326;
            this.f22208 = interfaceC5140;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7361 c7361 = new C7361(this.f22206, this.f22207, this.f22208, interfaceC4199);
            c7361.f22205 = obj;
            return c7361;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            AbstractC7328 abstractC7328;
            Object obj2;
            Iterator it;
            int i;
            AbstractC7328 abstractC73282;
            Object objM17142 = C5508.m17142();
            int i2 = this.f22204;
            if (i2 == 0) {
                C7149.m22422(obj);
                abstractC7328 = (AbstractC7328) this.f22205;
                R r = this.f22206;
                this.f22205 = abstractC7328;
                this.f22204 = 1;
                if (abstractC7328.mo3574(r, this) == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = this.f22203;
                    it = (Iterator) this.f22202;
                    Object obj3 = this.f22201;
                    abstractC73282 = (AbstractC7328) this.f22205;
                    C7149.m22422(obj);
                    obj2 = obj3;
                    i = i3;
                    while (it.hasNext()) {
                        Object next = it.next();
                        InterfaceC5140<Integer, R, T, R> interfaceC5140 = this.f22208;
                        int i4 = i + 1;
                        if (i < 0) {
                            C3880.m10753();
                        }
                        R rMo15350 = interfaceC5140.mo15350(C3590.m9584(i), (R) obj2, (T) next);
                        this.f22205 = abstractC73282;
                        this.f22201 = rMo15350;
                        this.f22202 = it;
                        this.f22203 = i4;
                        this.f22204 = 2;
                        if (abstractC73282.mo3574(rMo15350, this) == objM17142) {
                            return objM17142;
                        }
                        obj2 = rMo15350;
                        i = i4;
                    }
                    return C8107.f3222;
                }
                abstractC7328 = (AbstractC7328) this.f22205;
                C7149.m22422(obj);
            }
            obj2 = this.f22206;
            it = this.f22207.iterator();
            i = 0;
            abstractC73282 = abstractC7328;
            while (it.hasNext()) {
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super R> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7361) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduce$1", m1273f = "_Sequences.kt", m1274i = {0, 0, 0, 1, 1, 1}, m1275l = {2366, 2369}, m1276m = "invokeSuspend", m1277n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator"}, m1278s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class C7362<S> extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super S>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22209;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f22210;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f22211;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f22212;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326<T> f22213;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<S, T, S> f22214;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super S, ? super T, ? extends S> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7362(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5138<? super S, ? super T, ? extends S> interfaceC5138, InterfaceC4199<? super C7362> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22213 = interfaceC7326;
            this.f22214 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7362 c7362 = new C7362(this.f22213, this.f22214, interfaceC4199);
            c7362.f22212 = obj;
            return c7362;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            AbstractC7328 abstractC7328;
            Object next;
            Iterator it;
            Object objM17142 = C5508.m17142();
            int i = this.f22211;
            if (i == 0) {
                C7149.m22422(obj);
                abstractC7328 = (AbstractC7328) this.f22212;
                Iterator it2 = this.f22213.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    this.f22212 = abstractC7328;
                    this.f22209 = it2;
                    this.f22210 = next;
                    this.f22211 = 1;
                    if (abstractC7328.mo3574(next, this) == objM17142) {
                        return objM17142;
                    }
                    it = it2;
                }
                return C8107.f3222;
            }
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.f22210;
            it = (Iterator) this.f22209;
            abstractC7328 = (AbstractC7328) this.f22212;
            C7149.m22422(obj);
            while (it.hasNext()) {
                next = this.f22214.invoke((S) next, (T) it.next());
                this.f22212 = abstractC7328;
                this.f22209 = it;
                this.f22210 = next;
                this.f22211 = 2;
                if (abstractC7328.mo3574(next, this) == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super S> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7362) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlin.sequences.SequencesKt___SequencesKt$runningReduceIndexed$1", m1273f = "_Sequences.kt", m1274i = {0, 0, 0, 1, 1, 1, 1}, m1275l = {2395, 2399}, m1276m = "invokeSuspend", m1277n = {"$this$sequence", "iterator", "accumulator", "$this$sequence", "iterator", "accumulator", "index"}, m1278s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0"})
    public static final class C7363<S> extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super S>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22215;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f22216;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f22217;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f22218;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public /* synthetic */ Object f22219;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326<T> f22220;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140<Integer, S, T, S> f22221;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super java.lang.Integer, ? super S, ? super T, ? extends S> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7363(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5140<? super Integer, ? super S, ? super T, ? extends S> interfaceC5140, InterfaceC4199<? super C7363> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22220 = interfaceC7326;
            this.f22221 = interfaceC5140;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7363 c7363 = new C7363(this.f22220, this.f22221, interfaceC4199);
            c7363.f22219 = obj;
            return c7363;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            AbstractC7328 abstractC7328;
            Iterator it;
            Object next;
            Object objM17142 = C5508.m17142();
            int i = this.f22218;
            int i2 = 1;
            if (i == 0) {
                C7149.m22422(obj);
                abstractC7328 = (AbstractC7328) this.f22219;
                it = this.f22220.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    this.f22219 = abstractC7328;
                    this.f22215 = it;
                    this.f22216 = next;
                    this.f22218 = 1;
                    if (abstractC7328.mo3574(next, this) == objM17142) {
                        return objM17142;
                    }
                }
                return C8107.f3222;
            }
            if (i == 1) {
                next = this.f22216;
                it = (Iterator) this.f22215;
                abstractC7328 = (AbstractC7328) this.f22219;
                C7149.m22422(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = this.f22217;
                Object obj2 = this.f22216;
                it = (Iterator) this.f22215;
                abstractC7328 = (AbstractC7328) this.f22219;
                C7149.m22422(obj);
                i2 = i3;
                next = obj2;
            }
            while (it.hasNext()) {
                InterfaceC5140<Integer, S, T, S> interfaceC5140 = this.f22221;
                int i4 = i2 + 1;
                if (i2 < 0) {
                    C3880.m10753();
                }
                S sMo15350 = interfaceC5140.mo15350(C3590.m9584(i2), (S) next, (T) it.next());
                this.f22219 = abstractC7328;
                this.f22215 = it;
                this.f22216 = sMo15350;
                this.f22217 = i4;
                this.f22218 = 2;
                if (abstractC7328.mo3574(sMo15350, this) == objM17142) {
                    return objM17142;
                }
                next = sMo15350;
                i2 = i4;
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super S> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7363) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final class C7364<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC7326<T> f2824;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C7364(InterfaceC7326<? extends T> interfaceC7326) {
            this.f2824 = interfaceC7326;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            List listM23082 = C7342.m23082(this.f2824);
            C3884.m10767(listM23082);
            return listM23082.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final class C7365<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC7326<T> f2825;

        /* JADX INFO: renamed from: ۥ۟ */
        public final /* synthetic */ Comparator<? super T> f2826;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C7365(InterfaceC7326<? extends T> interfaceC7326, Comparator<? super T> comparator) {
            this.f2825 = interfaceC7326;
            this.f2826 = comparator;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            List listM23082 = C7342.m23082(this.f2825);
            C3884.m10770(listM23082, this.f2826);
            return listM23082.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟ۡ, reason: contains not printable characters */
    public static final class C7366<R, T> extends AbstractC5673 implements InterfaceC5138<T, R, C6599<? extends T, ? extends R>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7366 f22222 = new C7366();

        public C7366() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C6599<T, R> invoke(T t, R r) {
            return C8003.m4014(t, r);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final class C7367<T> extends AbstractC5673 implements InterfaceC5138<T, T, C6599<? extends T, ? extends T>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7367 f22223 = new C7367();

        public C7367() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final C6599<T, T> invoke(T t, T t2) {
            return C8003.m4014(t, t2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۦ$ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlin.sequences.SequencesKt___SequencesKt$zipWithNext$2", m1273f = "_Sequences.kt", m1274i = {0, 0, 0}, m1275l = {2873}, m1276m = "invokeSuspend", m1277n = {"$this$result", "iterator", "next"}, m1278s = {"L$0", "L$1", "L$2"})
    public static final class C7368<R> extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super R>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22224;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public Object f22225;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f22226;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f22227;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326<T> f22228;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<T, T, R> f22229;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super T, ? super T, ? extends R> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7368(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5138<? super T, ? super T, ? extends R> interfaceC5138, InterfaceC4199<? super C7368> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22228 = interfaceC7326;
            this.f22229 = interfaceC5138;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7368 c7368 = new C7368(this.f22228, this.f22229, interfaceC4199);
            c7368.f22227 = obj;
            return c7368;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005b -> B:6:0x0018). Please report as a decompilation issue!!! */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            AbstractC7328 abstractC7328;
            Object next;
            Iterator it;
            Object objM17142 = C5508.m17142();
            int i = this.f22226;
            if (i == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC73282 = (AbstractC7328) this.f22227;
                Iterator it2 = this.f22228.iterator();
                if (!it2.hasNext()) {
                    return C8107.f3222;
                }
                abstractC7328 = abstractC73282;
                next = it2.next();
                it = it2;
                if (it.hasNext()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object next2 = this.f22225;
                it = (Iterator) this.f22224;
                abstractC7328 = (AbstractC7328) this.f22227;
                C7149.m22422(obj);
                next = next2;
                if (it.hasNext()) {
                    next2 = it.next();
                    R rInvoke = this.f22229.invoke((T) next, (T) next2);
                    this.f22227 = abstractC7328;
                    this.f22224 = it;
                    this.f22225 = next2;
                    this.f22226 = 1;
                    if (abstractC7328.mo3574(rInvoke, this) == objM17142) {
                        return objM17142;
                    }
                    next = next2;
                    if (it.hasNext()) {
                        return C8107.f3222;
                    }
                }
            }
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super R> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7368) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final <T> boolean m22907(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            if (!interfaceC5124.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final <T> boolean m22908(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return interfaceC7326.iterator().hasNext();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final <T> boolean m22909(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static <T> Iterable<T> m22910(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return new C1236(interfaceC7326);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22911(InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return interfaceC7326;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final <T, K, V> Map<K, V> m22912(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends C6599<? extends K, ? extends V>> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            C6599<? extends K, ? extends V> c6599Invoke = interfaceC5124.invoke(it.next());
            linkedHashMap.put(c6599Invoke.m20938(), c6599Invoke.m20939());
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final <T, K> Map<K, T> m22913(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : interfaceC7326) {
            linkedHashMap.put(interfaceC5124.invoke(t), t);
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final <T, K, V> Map<K, V> m22914(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super T, ? extends V> interfaceC51242) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : interfaceC7326) {
            linkedHashMap.put(interfaceC5124.invoke(t), interfaceC51242.invoke(t));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final <T, K, M extends Map<? super K, ? super T>> M m22915(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        for (T t : interfaceC7326) {
            m.put(interfaceC5124.invoke(t), t);
        }
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m22916(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super T, ? extends V> interfaceC51242) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        for (T t : interfaceC7326) {
            m.put(interfaceC5124.invoke(t), interfaceC51242.invoke(t));
        }
        return m;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m22917(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends C6599<? extends K, ? extends V>> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            C6599<? extends K, ? extends V> c6599Invoke = interfaceC5124.invoke(it.next());
            m.put(c6599Invoke.m20938(), c6599Invoke.m20939());
        }
        return m;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final <K, V> Map<K, V> m22918(@InterfaceC6399 InterfaceC7326<? extends K> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super K, ? extends V> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k : interfaceC7326) {
            linkedHashMap.put(k, interfaceC5124.invoke(k));
        }
        return linkedHashMap;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> M m22919(@InterfaceC6399 InterfaceC7326<? extends K> interfaceC7326, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super K, ? extends V> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "valueSelector");
        for (K k : interfaceC7326) {
            m.put(k, interfaceC5124.invoke(k));
        }
        return m;
    }

    @InterfaceC5572(name = "averageOfByte")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final double m22920(@InterfaceC6399 InterfaceC7326<Byte> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Byte> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final double m22921(@InterfaceC6399 InterfaceC7326<Double> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Double> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final double m22922(@InterfaceC6399 InterfaceC7326<Float> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Float> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final double m22923(@InterfaceC6399 InterfaceC7326<Integer> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Integer> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final double m22924(@InterfaceC6399 InterfaceC7326<Long> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Long> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final double m22925(@InterfaceC6399 InterfaceC7326<Short> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Short> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<List<T>> m22926(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i) {
        C5499.m17103(interfaceC7326, "<this>");
        return m23085(interfaceC7326, i, i, true);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m22927(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i, @InterfaceC6399 InterfaceC5124<? super List<? extends T>, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        return m23086(interfaceC7326, i, i, true, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <T> boolean m22928(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, T t) {
        C5499.m17103(interfaceC7326, "<this>");
        return m22973(interfaceC7326, t) >= 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static <T> int m22929(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
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

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final <T> int m22930(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        Iterator<? extends T> it = interfaceC7326.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue() && (i = i + 1) < 0) {
                C3880.m10752();
            }
        }
        return i;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22931(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return m22932(interfaceC7326, C1237.f22176);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final <T, K> InterfaceC7326<T> m22932(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        return new C4439(interfaceC7326, interfaceC5124);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m22933(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i) {
        C5499.m17103(interfaceC7326, "<this>");
        if (i >= 0) {
            return i == 0 ? interfaceC7326 : interfaceC7326 instanceof InterfaceC4552 ? ((InterfaceC4552) interfaceC7326).mo1494(i) : new C4551(interfaceC7326, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22934(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        return new C4553(interfaceC7326, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final <T> T m22935(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i) {
        C5499.m17103(interfaceC7326, "<this>");
        return (T) m22936(interfaceC7326, i, new C7343(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final <T> T m22936(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i, @InterfaceC6399 InterfaceC5124<? super Integer, ? extends T> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "defaultValue");
        if (i < 0) {
            return interfaceC5124.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T t : interfaceC7326) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return interfaceC5124.invoke(Integer.valueOf(i));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final <T> T m22937(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i) {
        C5499.m17103(interfaceC7326, "<this>");
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T t : interfaceC7326) {
            int i3 = i2 + 1;
            if (i == i2) {
                return t;
            }
            i2 = i3;
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m22938(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        return new C4841(interfaceC7326, true, interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22939(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, Boolean> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "predicate");
        return new C7954(new C4841(new C5431(interfaceC7326), true, new C7344(interfaceC5138)), C7345.f22179);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m22940(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, Boolean> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "predicate");
        int i = 0;
        for (T t : interfaceC7326) {
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

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final /* synthetic */ <R> InterfaceC7326<R> m22941(InterfaceC7326<?> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17110();
        InterfaceC7326<R> interfaceC7326M22938 = m22938(interfaceC7326, C7346.f22180);
        C5499.m17101(interfaceC7326M22938, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return interfaceC7326M22938;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final /* synthetic */ <R, C extends Collection<? super R>> C m22942(InterfaceC7326<?> interfaceC7326, C c) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        for (Object obj : interfaceC7326) {
            C5499.m17112(3, "R");
            if (obj instanceof Object) {
                c.add(obj);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22943(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        return new C4841(interfaceC7326, false, interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22944(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        InterfaceC7326<T> interfaceC7326M22943 = m22943(interfaceC7326, C7347.f22181);
        C5499.m17101(interfaceC7326M22943, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return interfaceC7326M22943;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final <C extends Collection<? super T>, T> C m22945(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        for (T t : interfaceC7326) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m22946(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : interfaceC7326) {
            if (!interfaceC5124.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m22947(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : interfaceC7326) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                c.add(t);
            }
        }
        return c;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final <T> T m22948(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : interfaceC7326) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final <T> T m22949(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        T t = null;
        for (T t2 : interfaceC7326) {
            if (interfaceC5124.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final <T> T m22950(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final <T> T m22951(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : interfaceC7326) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                return t;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final <T, R> R m22952(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        R rInvoke;
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final <T, R> R m22953(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                return rInvoke;
            }
        }
        return null;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static <T> T m22954(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.Object] */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final <T> T m22955(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        for (T t : interfaceC7326) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                return t;
            }
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m22956(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends InterfaceC7326<? extends R>> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        return new C4868(interfaceC7326, interfaceC5124, C7349.f22183);
    }

    @InterfaceC6399
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedIterable")
    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m22957(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends Iterable<? extends R>> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        return C7332.m22872(interfaceC7326, interfaceC5138, C7350.f22184);
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedIterableTo")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m22958(InterfaceC7326<? extends T> interfaceC7326, C c, InterfaceC5138<? super Integer, ? super T, ? extends Iterable<? extends R>> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        for (T t : interfaceC7326) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            C3885.m10772(c, interfaceC5138.invoke(Integer.valueOf(i), t));
            i = i2;
        }
        return c;
    }

    @InterfaceC6399
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedSequence")
    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m22959(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends InterfaceC7326<? extends R>> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        return C7332.m22872(interfaceC7326, interfaceC5138, C7351.f22185);
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIndexedSequenceTo")
    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m22960(InterfaceC7326<? extends T> interfaceC7326, C c, InterfaceC5138<? super Integer, ? super T, ? extends InterfaceC7326<? extends R>> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        for (T t : interfaceC7326) {
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
    @InterfaceC5572(name = "flatMapIterable")
    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m22961(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends Iterable<? extends R>> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        return new C4868(interfaceC7326, interfaceC5124, C7348.f22182);
    }

    @InterfaceC6399
    @InterfaceC6587
    @InterfaceC7470(version = "1.4")
    @InterfaceC5572(name = "flatMapIterableTo")
    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m22962(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, ? extends Iterable<? extends R>> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            C3885.m10772(c, interfaceC5124.invoke(it.next()));
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m22963(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, ? extends InterfaceC7326<? extends R>> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            C3885.m10771(c, interfaceC5124.invoke(it.next()));
        }
        return c;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final <T, R> R m22964(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            r = interfaceC5138.invoke(r, it.next());
        }
        return r;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final <T, R> R m22965(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super R, ? super T, ? extends R> interfaceC5140) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        int i = 0;
        for (T t : interfaceC7326) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            r = interfaceC5140.mo15350(Integer.valueOf(i), r, t);
            i = i2;
        }
        return r;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final <T> void m22966(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, C8107> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "action");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            interfaceC5124.invoke(it.next());
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <T> void m22967(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, C8107> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "action");
        int i = 0;
        for (T t : interfaceC7326) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            interfaceC5138.invoke(Integer.valueOf(i), t);
            i = i2;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final <T, K> Map<K, List<T>> m22968(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : interfaceC7326) {
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
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final <T, K, V> Map<K, List<V>> m22969(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super T, ? extends V> interfaceC51242) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t : interfaceC7326) {
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
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final <T, K, M extends Map<? super K, List<T>>> M m22970(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        for (T t : interfaceC7326) {
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
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M m22971(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124, @InterfaceC6399 InterfaceC5124<? super T, ? extends V> interfaceC51242) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(m, "destination");
        C5499.m17103(interfaceC5124, "keySelector");
        C5499.m17103(interfaceC51242, "valueTransform");
        for (T t : interfaceC7326) {
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
    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final <T, K> InterfaceC5218<T, K> m22972(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends K> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "keySelector");
        return new C7352(interfaceC7326, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final <T> int m22973(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, T t) {
        C5499.m17103(interfaceC7326, "<this>");
        int i = 0;
        for (T t2 : interfaceC7326) {
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

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final <T> int m22974(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int i = 0;
        for (T t : interfaceC7326) {
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

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final <T> int m22975(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int i = -1;
        int i2 = 0;
        for (T t : interfaceC7326) {
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

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final <T, A extends Appendable> A m22976(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 A a, @InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, @InterfaceC6399 CharSequence charSequence3, int i, @InterfaceC6399 CharSequence charSequence4, @InterfaceC6489 InterfaceC5124<? super T, ? extends CharSequence> interfaceC5124) throws IOException {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(a, "buffer");
        C5499.m17103(charSequence, "separator");
        C5499.m17103(charSequence2, "prefix");
        C5499.m17103(charSequence3, "postfix");
        C5499.m17103(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : interfaceC7326) {
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
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <T> String m22978(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, @InterfaceC6399 CharSequence charSequence3, int i, @InterfaceC6399 CharSequence charSequence4, @InterfaceC6489 InterfaceC5124<? super T, ? extends CharSequence> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(charSequence, "separator");
        C5499.m17103(charSequence2, "prefix");
        C5499.m17103(charSequence3, "postfix");
        C5499.m17103(charSequence4, "truncated");
        String string = ((StringBuilder) m22976(interfaceC7326, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, interfaceC5124)).toString();
        C5499.m17102(string, "joinTo(StringBuilder(), …ed, transform).toString()");
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static /* synthetic */ String m22979(InterfaceC7326 interfaceC7326, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC5124 interfaceC5124, int i2, Object obj) {
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
        return m22978(interfaceC7326, charSequence, charSequence5, charSequence6, i3, charSequence7, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static <T> T m22980(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final <T> T m22981(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : interfaceC7326) {
            if (interfaceC5124.invoke(t2).booleanValue()) {
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final <T> int m22982(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, T t) {
        C5499.m17103(interfaceC7326, "<this>");
        int i = -1;
        int i2 = 0;
        for (T t2 : interfaceC7326) {
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

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final <T> T m22983(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final <T> T m22984(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        T t = null;
        for (T t2 : interfaceC7326) {
            if (interfaceC5124.invoke(t2).booleanValue()) {
                t = t2;
            }
        }
        return t;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static <T, R> InterfaceC7326<R> m22985(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        return new C7954(interfaceC7326, interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m22986(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        return new C7953(interfaceC7326, interfaceC5138);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m22987(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        return m22944(new C7953(interfaceC7326, interfaceC5138));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m22988(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        for (T t : interfaceC7326) {
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
    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m22989(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5138, "transform");
        int i = 0;
        for (T t : interfaceC7326) {
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
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static <T, R> InterfaceC7326<R> m22990(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        return m22944(new C7954(interfaceC7326, interfaceC5124));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m22991(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            R rInvoke = interfaceC5124.invoke(it.next());
            if (rInvoke != null) {
                c.add(rInvoke);
            }
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public static final <T, R, C extends Collection<? super R>> C m22992(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        C5499.m17103(interfaceC5124, "transform");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> T m22993(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> T m22994(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static final <T> double m22995(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public static final <T> float m22996(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Float> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> R m22997(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> R m22998(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public static final <T> Double m22999(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public static final <T> Float m23000(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Float> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final <T, R> R m23001(InterfaceC7326<? extends T> interfaceC7326, Comparator<? super R> comparator, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public static final <T, R> R m23002(InterfaceC7326<? extends T> interfaceC7326, Comparator<? super R> comparator, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m23003(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public static final Double m23004(@InterfaceC6399 InterfaceC7326<Double> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Double> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public static final Float m23005(@InterfaceC6399 InterfaceC7326<Float> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Float> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public static final double m23006(@InterfaceC6399 InterfaceC7326<Double> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Double> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public static final float m23007(@InterfaceC6399 InterfaceC7326<Float> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Float> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m23008(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public static final <T> T m23009(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public static final <T> T m23010(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> T m23011(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> T m23012(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public static final <T> double m23013(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public static final <T> float m23014(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Float> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> R m23015(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> R m23016(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public static final <T> Double m23017(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public static final <T> Float m23018(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Float> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public static final <T, R> R m23019(InterfaceC7326<? extends T> interfaceC7326, Comparator<? super R> comparator, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public static final <T, R> R m23020(InterfaceC7326<? extends T> interfaceC7326, Comparator<? super R> comparator, InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m23021(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public static final Double m23022(@InterfaceC6399 InterfaceC7326<Double> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Double> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final Float m23023(@InterfaceC6399 InterfaceC7326<Float> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Float> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public static final double m23024(@InterfaceC6399 InterfaceC7326<Double> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Double> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public static final float m23025(@InterfaceC6399 InterfaceC7326<Float> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Float> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> T m23026(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public static final <T> T m23027(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static final <T> T m23028(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23029(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC73262) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC73262, "elements");
        return new C7356(interfaceC73262, interfaceC7326);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23030(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(iterable, "elements");
        return new C7355(iterable, interfaceC7326);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23031(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, T t) {
        C5499.m17103(interfaceC7326, "<this>");
        return new C7353(interfaceC7326, t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23032(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 T[] tArr) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(tArr, "elements");
        return tArr.length == 0 ? interfaceC7326 : new C7354(interfaceC7326, tArr);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23033(InterfaceC7326<? extends T> interfaceC7326, T t) {
        C5499.m17103(interfaceC7326, "<this>");
        return m23031(interfaceC7326, t);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public static final <T> boolean m23034(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return !interfaceC7326.iterator().hasNext();
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final <T> boolean m23035(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            if (interfaceC5124.invoke(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.1")
    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23036(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, C8107> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "action");
        return m22985(interfaceC7326, new C7357(interfaceC5124));
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23037(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, C8107> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "action");
        return m22986(interfaceC7326, new C7358(interfaceC5138));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static final <T> C6599<List<T>, List<T>> m23038(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t : interfaceC7326) {
            if (interfaceC5124.invoke(t).booleanValue()) {
                arrayList.add(t);
            } else {
                arrayList2.add(t);
            }
        }
        return new C6599<>(arrayList, arrayList2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23039(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC7326<? extends T> interfaceC73262) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC73262, "elements");
        return C7332.m22873(C7332.m22881(interfaceC7326, interfaceC73262));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23040(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 Iterable<? extends T> iterable) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(iterable, "elements");
        return C7332.m22873(C7332.m22881(interfaceC7326, C3888.m10833(iterable)));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23041(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, T t) {
        C5499.m17103(interfaceC7326, "<this>");
        return C7332.m22873(C7332.m22881(interfaceC7326, C7332.m22881(t)));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23042(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 T[] tArr) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(tArr, "elements");
        return m23040(interfaceC7326, C3404.m7069(tArr));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23043(InterfaceC7326<? extends T> interfaceC7326, T t) {
        C5499.m17103(interfaceC7326, "<this>");
        return m23041(interfaceC7326, t);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public static final <S, T extends S> S m23044(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super S, ? super T, ? extends S> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S next = it.next();
        while (it.hasNext()) {
            next = interfaceC5138.invoke(next, it.next());
        }
        return next;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public static final <S, T extends S> S m23045(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5140<? super Integer, ? super S, ? super T, ? extends S> interfaceC5140) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
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
    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters */
    public static final <S, T extends S> S m23046(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5140<? super Integer, ? super S, ? super T, ? extends S> interfaceC5140) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public static final <S, T extends S> S m23047(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super S, ? super T, ? extends S> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S next = it.next();
        while (it.hasNext()) {
            next = interfaceC5138.invoke(next, it.next());
        }
        return next;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23048(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return m22985(interfaceC7326, new C7359(interfaceC7326));
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m23049(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        return C7330.m3577(new C7360(r, interfaceC7326, interfaceC5138, null));
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m23050(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super R, ? super T, ? extends R> interfaceC5140) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        return C7330.m3577(new C7361(r, interfaceC7326, interfaceC5140, null));
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public static final <S, T extends S> InterfaceC7326<S> m23051(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super S, ? super T, ? extends S> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        return C7330.m3577(new C7362(interfaceC7326, interfaceC5138, null));
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public static final <S, T extends S> InterfaceC7326<S> m23052(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5140<? super Integer, ? super S, ? super T, ? extends S> interfaceC5140) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        return C7330.m3577(new C7363(interfaceC7326, interfaceC5140, null));
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m23053(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "operation");
        return m23049(interfaceC7326, r, interfaceC5138);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m23054(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, R r, @InterfaceC6399 InterfaceC5140<? super Integer, ? super R, ? super T, ? extends R> interfaceC5140) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5140, "operation");
        return m23050(interfaceC7326, r, interfaceC5140);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public static final <T> T m23055(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        return next;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public static final <T> T m23056(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        T t = null;
        boolean z = false;
        for (T t2 : interfaceC7326) {
            if (interfaceC5124.invoke(t2).booleanValue()) {
                if (z) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z = true;
                t = t2;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters */
    public static final <T> T m23057(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public static final <T> T m23058(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        boolean z = false;
        T t = null;
        for (T t2 : interfaceC7326) {
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

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> InterfaceC7326<T> m23059(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return new C7364(interfaceC7326);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> InterfaceC7326<T> m23060(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        return m23063(interfaceC7326, new C4033.C0311(interfaceC5124));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public static final <T, R extends Comparable<? super R>> InterfaceC7326<T> m23061(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        return m23063(interfaceC7326, new C4033.C4034(interfaceC5124));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> InterfaceC7326<T> m23062(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return m23063(interfaceC7326, C4033.m11401());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۦ۟, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m23063(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 Comparator<? super T> comparator) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(comparator, "comparator");
        return new C7365(interfaceC7326, comparator);
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC4372(message = "Use sumOf instead.", replaceWith = @InterfaceC7097(expression = "this.sumOf(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public static final <T> int m23064(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Integer> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += interfaceC5124.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @InterfaceC4374(warningSince = "1.5")
    @InterfaceC4372(message = "Use sumOf instead.", replaceWith = @InterfaceC7097(expression = "this.sumOf(selector)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public static final <T> double m23065(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += interfaceC5124.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC5572(name = "sumOfByte")
    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public static final int m23066(@InterfaceC6399 InterfaceC7326<Byte> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Byte> it = interfaceC7326.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    @InterfaceC5572(name = "sumOfDouble")
    /* JADX INFO: renamed from: ۥ۟۠ۦۣ, reason: contains not printable characters */
    public static final double m23067(@InterfaceC6399 InterfaceC7326<Double> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Double> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۦۤ, reason: contains not printable characters */
    public static final <T> double m23068(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Double> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += interfaceC5124.invoke(it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    @InterfaceC5572(name = "sumOfFloat")
    /* JADX INFO: renamed from: ۥ۟۠ۦۥ, reason: contains not printable characters */
    public static final float m23069(@InterfaceC6399 InterfaceC7326<Float> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Float> it = interfaceC7326.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    @InterfaceC5572(name = "sumOfInt")
    /* JADX INFO: renamed from: ۥ۟۠ۦۦ, reason: contains not printable characters */
    public static final int m23070(@InterfaceC6399 InterfaceC7326<Integer> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Integer> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۦۧ, reason: contains not printable characters */
    public static final <T> int m23071(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Integer> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += interfaceC5124.invoke(it.next()).intValue();
        }
        return iIntValue;
    }

    @InterfaceC5572(name = "sumOfLong")
    /* JADX INFO: renamed from: ۥ۟۠ۦۨ, reason: contains not printable characters */
    public static final long m23072(@InterfaceC6399 InterfaceC7326<Long> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Long> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public static final <T> long m23073(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, Long> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        Iterator<? extends T> it = interfaceC7326.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += interfaceC5124.invoke(it.next()).longValue();
        }
        return jLongValue;
    }

    @InterfaceC5572(name = "sumOfShort")
    /* JADX INFO: renamed from: ۥ۟۠ۧ۟, reason: contains not printable characters */
    public static final int m23074(@InterfaceC6399 InterfaceC7326<Short> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<Short> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۧ۠, reason: contains not printable characters */
    public static final <T> int m23075(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, C8057> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        int iM26318 = C8057.m26318(0);
        Iterator<? extends T> it = interfaceC7326.iterator();
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
    /* JADX INFO: renamed from: ۥ۟۠ۧۡ, reason: contains not printable characters */
    public static final <T> long m23076(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, C8064> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "selector");
        long jM26408 = C8064.m26408(0L);
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            jM26408 = C8064.m26408(jM26408 + interfaceC5124.invoke(it.next()).m26462());
        }
        return jM26408;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧۢ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23077(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i) {
        C5499.m17103(interfaceC7326, "<this>");
        if (i >= 0) {
            return i == 0 ? C7332.m22871() : interfaceC7326 instanceof InterfaceC4552 ? ((InterfaceC4552) interfaceC7326).mo1493(i) : new C7720(interfaceC7326, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m23078(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        return new C7721(interfaceC7326, interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧۤ, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m23079(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 C c) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(c, "destination");
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            c.add(it.next());
        }
        return c;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧۥ, reason: contains not printable characters */
    public static final <T> HashSet<T> m23080(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return (HashSet) m23079(interfaceC7326, new HashSet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧۦ, reason: contains not printable characters */
    public static <T> List<T> m23081(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (!it.hasNext()) {
            return C3880.m10735();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return C3879.m10715(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧۧ, reason: contains not printable characters */
    public static final <T> List<T> m23082(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return (List) m23079(interfaceC7326, new ArrayList());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۧۨ, reason: contains not printable characters */
    public static final <T> Set<T> m23083(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends T> it = interfaceC7326.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters */
    public static final <T> Set<T> m23084(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        Iterator<? extends T> it = interfaceC7326.iterator();
        if (!it.hasNext()) {
            return C7387.m23125();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return C7386.m23120(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۠ۨ۟, reason: contains not printable characters */
    public static final <T> InterfaceC7326<List<T>> m23085(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i, int i2, boolean z) {
        C5499.m17103(interfaceC7326, "<this>");
        return C7487.m23442(interfaceC7326, i, i2, z, false);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۠ۨ۠, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m23086(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, int i, int i2, boolean z, @InterfaceC6399 InterfaceC5124<? super List<? extends T>, ? extends R> interfaceC5124) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        return m22985(C7487.m23442(interfaceC7326, i, i2, z, true), interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۡ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m23087(InterfaceC7326 interfaceC7326, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m23085(interfaceC7326, i, i2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۢ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m23088(InterfaceC7326 interfaceC7326, int i, int i2, boolean z, InterfaceC5124 interfaceC5124, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m23086(interfaceC7326, i, i2, z, interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<C5428<T>> m23089(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return new C5431(interfaceC7326);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۤ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<C6599<T, R>> m23090(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC7326<? extends R> interfaceC73262) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC73262, "other");
        return new C6168(interfaceC7326, interfaceC73262, C7366.f22222);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨۥ, reason: contains not printable characters */
    public static final <T, R, V> InterfaceC7326<V> m23091(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC7326<? extends R> interfaceC73262, @InterfaceC6399 InterfaceC5138<? super T, ? super R, ? extends V> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC73262, "other");
        C5499.m17103(interfaceC5138, "transform");
        return new C6168(interfaceC7326, interfaceC73262, interfaceC5138);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۠ۨۦ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<C6599<T, T>> m23092(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return m23093(interfaceC7326, C7367.f22223);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۠ۨۧ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m23093(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super T, ? super T, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5138, "transform");
        return C7330.m3577(new C7368(interfaceC7326, interfaceC5138, null));
    }
}
