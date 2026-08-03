package Yue;

import Yue.InterfaceC4202;
import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4232 extends AbstractC2981 implements InterfaceC4202 {

    @InterfaceC6399
    public static final C0360 Key = new C0360(null);

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۨ$ۥ */
    @InterfaceC4772
    public static final class C0360 extends AbstractC2982<InterfaceC4202, AbstractC4232> {

        /* JADX INFO: renamed from: Yue.ۥ۟ۧۦۨ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C4233 extends AbstractC5673 implements InterfaceC5124<InterfaceC4225.InterfaceC0357, AbstractC4232> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public static final C4233 f8586 = new C4233();

            public C4233() {
                super(1);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // Yue.InterfaceC5124
            @InterfaceC6489
            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
            public final AbstractC4232 invoke(@InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
                if (interfaceC0357 instanceof AbstractC4232) {
                    return (AbstractC4232) interfaceC0357;
                }
                return null;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۟ۧۦۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0360(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0360() {
            super(InterfaceC4202.f8519, C4233.f8586);
        }
    }

    public AbstractC4232() {
        super(InterfaceC4202.f8519);
    }

    public abstract void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable);

    @InterfaceC5495
    public void dispatchYield(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        dispatch(interfaceC4225, runnable);
    }

    @Override // Yue.AbstractC2981, Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6489
    public <E extends InterfaceC4225.InterfaceC0357> E get(@InterfaceC6399 InterfaceC4225.InterfaceC4228<E> interfaceC4228) {
        return (E) InterfaceC4202.C0348.m1162(this, interfaceC4228);
    }

    @Override // Yue.InterfaceC4202
    @InterfaceC6399
    public final <T> InterfaceC4199<T> interceptContinuation(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        return new C4416(this, interfaceC4199);
    }

    public boolean isDispatchNeeded(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return true;
    }

    @InterfaceC6399
    @InterfaceC4764
    public AbstractC4232 limitedParallelism(int i) {
        C5699.m2376(i);
        return new RunnableC5698(this, i);
    }

    @Override // Yue.AbstractC2981, Yue.InterfaceC4225.InterfaceC0357, Yue.InterfaceC4225
    @InterfaceC6399
    public InterfaceC4225 minusKey(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        return InterfaceC4202.C0348.m12092(this, interfaceC4228);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    public final AbstractC4232 plus(@InterfaceC6399 AbstractC4232 abstractC4232) {
        return abstractC4232;
    }

    @Override // Yue.InterfaceC4202
    public final void releaseInterceptedContinuation(@InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        ((C4416) interfaceC4199).m12831();
    }

    @InterfaceC6399
    public String toString() {
        return C4325.m1288(this) + '@' + C4325.m1289(this);
    }
}
