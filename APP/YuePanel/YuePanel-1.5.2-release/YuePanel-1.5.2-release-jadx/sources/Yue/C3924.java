package Yue;

import Yue.C7060;
import Yue.InterfaceC4225;
import java.io.Serializable;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
@InterfaceC7507({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
public final class C3924 implements InterfaceC4225, Serializable {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225 f7518;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225.InterfaceC0357 f7519;

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۤۡ$ۥ */
    @InterfaceC7507({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,196:1\n12720#2,3:197\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n193#1:197,3\n*E\n"})
    public static final class C0290 implements Serializable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public static final C3925 f7520 = new C3925(null);

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final long f7521 = 0;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final InterfaceC4225[] f7522;

        /* JADX INFO: renamed from: Yue.ۥ۟ۥۤۡ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C3925 {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۥۤۡ.ۥ.ۥ.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ C3925(C4335 c4335) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            public C3925() {
            }
        }

        public C0290(@InterfaceC6399 InterfaceC4225[] interfaceC4225Arr) {
            C5499.m17103(interfaceC4225Arr, "elements");
            this.f7522 = interfaceC4225Arr;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final InterfaceC4225[] m943() {
            return this.f7522;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final Object m944() {
            InterfaceC4225[] interfaceC4225Arr = this.f7522;
            InterfaceC4225 interfaceC4225Plus = C4629.f9940;
            for (InterfaceC4225 interfaceC4225 : interfaceC4225Arr) {
                interfaceC4225Plus = interfaceC4225Plus.plus(interfaceC4225);
            }
            return interfaceC4225Plus;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۤۡ$ۥ۟ */
    public static final class C0291 extends AbstractC5673 implements InterfaceC5138<String, InterfaceC4225.InterfaceC0357, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C0291 f7523 = new C0291();

        public C0291() {
            super(2);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            C5499.m17103(str, "acc");
            C5499.m17103(interfaceC0357, "element");
            if (str.length() == 0) {
                return interfaceC0357.toString();
            }
            return str + ", " + interfaceC0357;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۥۤۡ$ۥ۟۟, reason: contains not printable characters */
    public static final class C3926 extends AbstractC5673 implements InterfaceC5138<C8107, InterfaceC4225.InterfaceC0357, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4225[] f7524;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7064 f7525;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3926(InterfaceC4225[] interfaceC4225Arr, C7060.C7064 c7064) {
            super(2);
            this.f7524 = interfaceC4225Arr;
            this.f7525 = c7064;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ C8107 invoke(C8107 c8107, InterfaceC4225.InterfaceC0357 interfaceC0357) {
            m11182(c8107, interfaceC0357);
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m11182(@InterfaceC6399 C8107 c8107, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            C5499.m17103(c8107, "<anonymous parameter 0>");
            C5499.m17103(interfaceC0357, "element");
            InterfaceC4225[] interfaceC4225Arr = this.f7524;
            C7060.C7064 c7064 = this.f7525;
            int i = c7064.f21351;
            c7064.f21351 = i + 1;
            interfaceC4225Arr[i] = interfaceC0357;
        }
    }

    public C3924(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
        C5499.m17103(interfaceC4225, "left");
        C5499.m17103(interfaceC0357, "element");
        this.f7518 = interfaceC4225;
        this.f7519 = interfaceC0357;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    private final int m11178() {
        int i = 2;
        C3924 c3924 = this;
        while (true) {
            InterfaceC4225 interfaceC4225 = c3924.f7518;
            c3924 = interfaceC4225 instanceof C3924 ? (C3924) interfaceC4225 : null;
            if (c3924 == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        if (this != obj) {
            if (obj instanceof C3924) {
                C3924 c3924 = (C3924) obj;
                if (c3924.m11178() != m11178() || !c3924.m11179(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // Yue.InterfaceC4225
    public <R> R fold(R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4225.InterfaceC0357, ? extends R> interfaceC5138) {
        C5499.m17103(interfaceC5138, "operation");
        return interfaceC5138.invoke((Object) this.f7518.fold(r, interfaceC5138), this.f7519);
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6489
    public <E extends InterfaceC4225.InterfaceC0357> E get(@InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
        C5499.m17103(interfaceC4228, C6659.f17103);
        C3924 c3924 = this;
        while (true) {
            E e = (E) c3924.f7519.get(interfaceC4228);
            if (e != null) {
                return e;
            }
            InterfaceC4225 interfaceC4225 = c3924.f7518;
            if (!(interfaceC4225 instanceof C3924)) {
                return (E) interfaceC4225.get(interfaceC4228);
            }
            c3924 = (C3924) interfaceC4225;
        }
    }

    public int hashCode() {
        return this.f7518.hashCode() + this.f7519.hashCode();
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        C5499.m17103(interfaceC4228, C6659.f17103);
        if (this.f7519.get(interfaceC4228) != null) {
            return this.f7518;
        }
        InterfaceC4225 interfaceC4225MinusKey = this.f7518.minusKey(interfaceC4228);
        return interfaceC4225MinusKey == this.f7518 ? this : interfaceC4225MinusKey == C4629.f9940 ? this.f7519 : new C3924(interfaceC4225MinusKey, this.f7519);
    }

    @Override // Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 plus(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return InterfaceC4225.C0356.m1190(this, interfaceC4225);
    }

    @InterfaceC6399
    public String toString() {
        return TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH + ((String) fold("", C0291.f7523)) + ']';
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m942(InterfaceC4225.InterfaceC0357 interfaceC0357) {
        return C5499.m17094(get(interfaceC0357.getKey()), interfaceC0357);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean m11179(C3924 c3924) {
        while (m942(c3924.f7519)) {
            InterfaceC4225 interfaceC4225 = c3924.f7518;
            if (!(interfaceC4225 instanceof C3924)) {
                C5499.m17101(interfaceC4225, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m942((InterfaceC4225.InterfaceC0357) interfaceC4225);
            }
            c3924 = (C3924) interfaceC4225;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final Object m11180() {
        int iM11178 = m11178();
        InterfaceC4225[] interfaceC4225Arr = new InterfaceC4225[iM11178];
        C7060.C7064 c7064 = new C7060.C7064();
        fold(C8107.f3222, new C3926(interfaceC4225Arr, c7064));
        if (c7064.f21351 == iM11178) {
            return new C0290(interfaceC4225Arr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
