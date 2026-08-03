package Yue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۨۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7332 extends C7331 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥ */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,680:1\n*E\n"})
    public static final class C1233<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ InterfaceC5122<Iterator<T>> f2812;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends java.util.Iterator<? extends T>> */
        /* JADX WARN: Multi-variable type inference failed */
        public C1233(InterfaceC5122<? extends Iterator<? extends T>> interfaceC5122) {
            this.f2812 = interfaceC5122;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            return this.f2812.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥ۟ */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,680:1\n30#2:681\n*E\n"})
    public static final class C1234<T> implements InterfaceC7326<T> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ Iterator f2813;

        public C1234(Iterator it) {
            this.f2813 = it;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<T> iterator() {
            return this.f2813;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", m1273f = "Sequences.kt", m1274i = {0, 0}, m1275l = {332}, m1276m = "invokeSuspend", m1277n = {"$this$sequence", "index"}, m1278s = {"L$0", "I$0"})
    public static final class C7333<R> extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super R>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22153;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f22154;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public int f22155;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public /* synthetic */ Object f22156;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326<T> f22157;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138<Integer, T, C> f22158;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<C, Iterator<R>> f22159;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super java.lang.Integer, ? super T, ? extends C> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super C, ? extends java.util.Iterator<? extends R>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7333(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5138<? super Integer, ? super T, ? extends C> interfaceC5138, InterfaceC5124<? super C, ? extends Iterator<? extends R>> interfaceC5124, InterfaceC4199<? super C7333> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22157 = interfaceC7326;
            this.f22158 = interfaceC5138;
            this.f22159 = interfaceC5124;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7333 c7333 = new C7333(this.f22157, this.f22158, this.f22159, interfaceC4199);
            c7333.f22156 = obj;
            return c7333;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            AbstractC7328 abstractC7328;
            int i;
            Iterator it;
            Object objM17142 = C5508.m17142();
            int i2 = this.f22155;
            if (i2 == 0) {
                C7149.m22422(obj);
                abstractC7328 = (AbstractC7328) this.f22156;
                i = 0;
                it = this.f22157.iterator();
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i3 = this.f22154;
                it = (Iterator) this.f22153;
                abstractC7328 = (AbstractC7328) this.f22156;
                C7149.m22422(obj);
                i = i3;
            }
            while (it.hasNext()) {
                Object next = it.next();
                InterfaceC5138<Integer, T, C> interfaceC5138 = this.f22158;
                int i4 = i + 1;
                if (i < 0) {
                    C3880.m10753();
                }
                Iterator<R> itInvoke = this.f22159.invoke((C) interfaceC5138.invoke(C3590.m9584(i), (T) next));
                this.f22156 = abstractC7328;
                this.f22153 = it;
                this.f22154 = i4;
                this.f22155 = 1;
                if (abstractC7328.mo22861(itInvoke, this) == objM17142) {
                    return objM17142;
                }
                i = i4;
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super R> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7333) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C7334<T> extends AbstractC5673 implements InterfaceC5124<InterfaceC7326<? extends T>, Iterator<? extends T>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7334 f22160 = new C7334();

        public C7334() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Iterator<T> invoke(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
            C5499.m17103(interfaceC7326, "it");
            return interfaceC7326.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7335<T> extends AbstractC5673 implements InterfaceC5124<Iterable<? extends T>, Iterator<? extends T>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7335 f22161 = new C7335();

        public C7335() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Iterator<T> invoke(@InterfaceC6399 Iterable<? extends T> iterable) {
            C5499.m17103(iterable, "it");
            return iterable.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C7336<T> extends AbstractC5673 implements InterfaceC5124<T, T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7336 f22162 = new C7336();

        public C7336() {
            super(1);
        }

        @Override // Yue.InterfaceC5124
        public final T invoke(T t) {
            return t;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C7337<T> extends AbstractC5673 implements InterfaceC5124<T, T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<T> f22163;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7337(InterfaceC5122<? extends T> interfaceC5122) {
            super(1);
            this.f22163 = interfaceC5122;
        }

        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        public final T invoke(@InterfaceC6399 T t) {
            C5499.m17103(t, "it");
            return this.f22163.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C7338<T> extends AbstractC5673 implements InterfaceC5122<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ T f22164;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7338(T t) {
            super(0);
            this.f22164 = t;
        }

        @Override // Yue.InterfaceC5122
        @InterfaceC6489
        public final T invoke() {
            return this.f22164;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", m1273f = "Sequences.kt", m1274i = {}, m1275l = {69, 71}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C7339<T> extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super T>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f22165;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public /* synthetic */ Object f22166;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326<T> f22167;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5122<InterfaceC7326<T>> f22168;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠۠ۨ<? extends Yue.ۥۡۨۢ<? extends T>> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7339(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5122<? extends InterfaceC7326<? extends T>> interfaceC5122, InterfaceC4199<? super C7339> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22167 = interfaceC7326;
            this.f22168 = interfaceC5122;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7339 c7339 = new C7339(this.f22167, this.f22168, interfaceC4199);
            c7339.f22166 = obj;
            return c7339;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            Object objM17142 = C5508.m17142();
            int i = this.f22165;
            if (i == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC7328 = (AbstractC7328) this.f22166;
                Iterator<? extends T> it = this.f22167.iterator();
                if (it.hasNext()) {
                    this.f22165 = 1;
                    if (abstractC7328.mo22861(it, this) == objM17142) {
                        return objM17142;
                    }
                } else {
                    InterfaceC7326<T> interfaceC7326Invoke = this.f22168.invoke();
                    this.f22165 = 2;
                    if (abstractC7328.m3575(interfaceC7326Invoke, this) == objM17142) {
                        return objM17142;
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super T> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7339) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۨۢۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    @InterfaceC4313(m1272c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", m1273f = "Sequences.kt", m1274i = {0, 0}, m1275l = {145}, m1276m = "invokeSuspend", m1277n = {"$this$sequence", "buffer"}, m1278s = {"L$0", "L$1"})
    public static final class C7340<T> extends AbstractC7146 implements InterfaceC5138<AbstractC7328<? super T>, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f22169;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f22170;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f22171;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC7326<T> f22172;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ AbstractC7000 f22173;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C7340(InterfaceC7326<? extends T> interfaceC7326, AbstractC7000 abstractC7000, InterfaceC4199<? super C7340> interfaceC4199) {
            super(2, interfaceC4199);
            this.f22172 = interfaceC7326;
            this.f22173 = abstractC7000;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C7340 c7340 = new C7340(this.f22172, this.f22173, interfaceC4199);
            c7340.f22171 = obj;
            return c7340;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۡۨۢ۠ */
        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Yue.ۥۡۨۢ۠ */
        /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Yue.ۥۡۨۢ۠ */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            List listM23082;
            AbstractC7328 abstractC7328;
            Object objM17142 = C5508.m17142();
            int i = this.f22170;
            if (i == 0) {
                C7149.m22422(obj);
                AbstractC7328 abstractC73282 = (AbstractC7328) this.f22171;
                listM23082 = C7342.m23082(this.f22172);
                abstractC7328 = abstractC73282;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                listM23082 = (List) this.f22169;
                AbstractC7328 abstractC73283 = (AbstractC7328) this.f22171;
                C7149.m22422(obj);
                abstractC7328 = abstractC73283;
            }
            while (!listM23082.isEmpty()) {
                int iMo5817 = this.f22173.mo5817(listM23082.size());
                Object objM10795 = C3885.m10795(listM23082);
                if (iMo5817 < listM23082.size()) {
                    objM10795 = listM23082.set(iMo5817, objM10795);
                }
                this.f22171 = abstractC7328;
                this.f22169 = listM23082;
                this.f22170 = 1;
                if (abstractC7328.mo3574(objM10795, this) == objM17142) {
                    return objM17142;
                }
            }
            return C8107.f3222;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(@InterfaceC6399 AbstractC7328<? super T> abstractC7328, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C7340) create(abstractC7328, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22868(InterfaceC5122<? extends Iterator<? extends T>> interfaceC5122) {
        C5499.m17103(interfaceC5122, "iterator");
        return new C1233(interfaceC5122);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m22869(@InterfaceC6399 Iterator<? extends T> it) {
        C5499.m17103(it, "<this>");
        return m22870(new C1234(it));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m22870(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return interfaceC7326 instanceof C4124 ? interfaceC7326 : new C4124(interfaceC7326);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m22871() {
        return C4635.f1026;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <T, C, R> InterfaceC7326<R> m22872(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5138<? super Integer, ? super T, ? extends C> interfaceC5138, @InterfaceC6399 InterfaceC5124<? super C, ? extends Iterator<? extends R>> interfaceC5124) {
        C5499.m17103(interfaceC7326, "source");
        C5499.m17103(interfaceC5138, "transform");
        C5499.m17103(interfaceC5124, "iterator");
        return C7330.m3577(new C7333(interfaceC7326, interfaceC5138, interfaceC5124, null));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22873(@InterfaceC6399 InterfaceC7326<? extends InterfaceC7326<? extends T>> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return m22874(interfaceC7326, C7334.f22160);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <T, R> InterfaceC7326<R> m22874(InterfaceC7326<? extends T> interfaceC7326, InterfaceC5124<? super T, ? extends Iterator<? extends R>> interfaceC5124) {
        return interfaceC7326 instanceof C7954 ? ((C7954) interfaceC7326).m25103(interfaceC5124) : new C4868(interfaceC7326, C7336.f22162, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "flattenSequenceOfIterable")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22875(@InterfaceC6399 InterfaceC7326<? extends Iterable<? extends T>> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return m22874(interfaceC7326, C7335.f22161);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22876(@InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(interfaceC5122, "nextFunction");
        return m22870(new C5155(interfaceC5122, new C7337(interfaceC5122)));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m22877(@InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122, @InterfaceC6399 InterfaceC5124<? super T, ? extends T> interfaceC5124) {
        C5499.m17103(interfaceC5122, "seedFunction");
        C5499.m17103(interfaceC5124, "nextFunction");
        return new C5155(interfaceC5122, interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC5890
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m22878(@InterfaceC6489 T t, @InterfaceC6399 InterfaceC5124<? super T, ? extends T> interfaceC5124) {
        C5499.m17103(interfaceC5124, "nextFunction");
        return t == null ? C4635.f1026 : new C5155(new C7338(t), interfaceC5124);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22879(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC5122<? extends InterfaceC7326<? extends T>> interfaceC5122) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(interfaceC5122, "defaultValue");
        return C7330.m3577(new C7339(interfaceC7326, interfaceC5122, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22880(InterfaceC7326<? extends T> interfaceC7326) {
        return interfaceC7326 == 0 ? m22871() : interfaceC7326;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static <T> InterfaceC7326<T> m22881(@InterfaceC6399 T... tArr) {
        C5499.m17103(tArr, "elements");
        return tArr.length == 0 ? m22871() : C3411.m7422(tArr);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22882(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        return m22883(interfaceC7326, AbstractC7000.f21141);
    }

    @InterfaceC6399
    @InterfaceC7470(version = "1.4")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <T> InterfaceC7326<T> m22883(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 AbstractC7000 abstractC7000) {
        C5499.m17103(interfaceC7326, "<this>");
        C5499.m17103(abstractC7000, "random");
        return C7330.m3577(new C7340(interfaceC7326, abstractC7000, null));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <T, R> C6599<List<T>, List<R>> m22884(@InterfaceC6399 InterfaceC7326<? extends C6599<? extends T, ? extends R>> interfaceC7326) {
        C5499.m17103(interfaceC7326, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C6599<? extends T, ? extends R> c6599 : interfaceC7326) {
            arrayList.add(c6599.m20938());
            arrayList2.add(c6599.m20939());
        }
        return C8003.m4014(arrayList, arrayList2);
    }
}
