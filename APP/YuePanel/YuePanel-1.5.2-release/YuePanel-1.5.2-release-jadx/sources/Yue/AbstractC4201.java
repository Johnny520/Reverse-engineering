package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
@InterfaceC7507({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class AbstractC4201 extends AbstractC3513 {

    @InterfaceC6489
    private final InterfaceC4225 _context;

    @InterfaceC6489
    private transient InterfaceC4199<Object> intercepted;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4201(@InterfaceC6489 InterfaceC4199<Object> interfaceC4199, @InterfaceC6489 InterfaceC4225 interfaceC4225) {
        super(interfaceC4199);
        this._context = interfaceC4225;
    }

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        InterfaceC4225 interfaceC4225 = this._context;
        C5499.m17100(interfaceC4225);
        return interfaceC4225;
    }

    @InterfaceC6399
    public final InterfaceC4199<Object> intercepted() {
        InterfaceC4199<Object> interfaceC4199InterceptContinuation = this.intercepted;
        if (interfaceC4199InterceptContinuation == null) {
            InterfaceC4202 interfaceC4202 = (InterfaceC4202) getContext().get(InterfaceC4202.f8519);
            if (interfaceC4202 == null || (interfaceC4199InterceptContinuation = interfaceC4202.interceptContinuation(this)) == null) {
                interfaceC4199InterceptContinuation = this;
            }
            this.intercepted = interfaceC4199InterceptContinuation;
        }
        return interfaceC4199InterceptContinuation;
    }

    @Override // Yue.AbstractC3513
    public void releaseIntercepted() {
        InterfaceC4199<?> interfaceC4199 = this.intercepted;
        if (interfaceC4199 != null && interfaceC4199 != this) {
            InterfaceC4225.InterfaceC0357 interfaceC0357 = getContext().get(InterfaceC4202.f8519);
            C5499.m17100(interfaceC0357);
            ((InterfaceC4202) interfaceC0357).releaseInterceptedContinuation(interfaceC4199);
        }
        this.intercepted = C4049.f8120;
    }

    public AbstractC4201(@InterfaceC6489 InterfaceC4199<Object> interfaceC4199) {
        this(interfaceC4199, interfaceC4199 != null ? interfaceC4199.getContext() : null);
    }
}
