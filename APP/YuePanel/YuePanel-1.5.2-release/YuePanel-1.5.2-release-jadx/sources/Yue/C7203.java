package Yue;

import Yue.InterfaceC4225;

/* JADX INFO: renamed from: Yue.ۥۡۧۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7203<T> extends AbstractC4201 implements InterfaceC4892<T>, InterfaceC4246 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC4892<T> f21761;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public final InterfaceC4225 f21762;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC5568
    public final int f21763;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC4225 f21764;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC4199<? super C8107> f21765;

    /* JADX INFO: renamed from: Yue.ۥۡۧۢ۠$ۥ */
    public static final class C1206 extends AbstractC5673 implements InterfaceC5138<Integer, InterfaceC4225.InterfaceC0357, Integer> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1206 f21766 = new C1206();

        public C1206() {
            super(2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, InterfaceC4225.InterfaceC0357 interfaceC0357) {
            return m22581(num.intValue(), interfaceC0357);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Integer m22581(int i, @InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
            return Integer.valueOf(i + 1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7203(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        super(C6378.f16144, C4629.f9940);
        this.f21761 = interfaceC4892;
        this.f21762 = interfaceC4225;
        this.f21763 = ((Number) interfaceC4225.fold(0, C1206.f21766)).intValue();
    }

    @Override // Yue.AbstractC3513, Yue.InterfaceC4246
    @InterfaceC6489
    public InterfaceC4246 getCallerFrame() {
        InterfaceC4199<? super C8107> interfaceC4199 = this.f21765;
        if (interfaceC4199 instanceof InterfaceC4246) {
            return (InterfaceC4246) interfaceC4199;
        }
        return null;
    }

    @Override // Yue.AbstractC4201, Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        InterfaceC4225 interfaceC4225 = this.f21764;
        return interfaceC4225 == null ? C4629.f9940 : interfaceC4225;
    }

    @Override // Yue.AbstractC3513, Yue.InterfaceC4246
    @InterfaceC6489
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Yue.AbstractC3513
    @InterfaceC6399
    public Object invokeSuspend(@InterfaceC6399 Object obj) {
        Throwable thM22403 = C7148.m22403(obj);
        if (thM22403 != null) {
            this.f21764 = new C4513(thM22403, getContext());
        }
        InterfaceC4199<? super C8107> interfaceC4199 = this.f21765;
        if (interfaceC4199 != null) {
            interfaceC4199.resumeWith(obj);
        }
        return C5508.m17142();
    }

    @Override // Yue.AbstractC4201, Yue.AbstractC3513
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }

    @Override // Yue.InterfaceC4892
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        try {
            Object objM22579 = m22579(interfaceC4199, t);
            if (objM22579 == C5508.m17142()) {
                C4324.m12513(interfaceC4199);
            }
            return objM22579 == C5508.m17142() ? objM22579 : C8107.f3222;
        } catch (Throwable th) {
            this.f21764 = new C4513(th, interfaceC4199.getContext());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m22578(InterfaceC4225 interfaceC4225, InterfaceC4225 interfaceC42252, T t) {
        if (interfaceC42252 instanceof C4513) {
            m22580((C4513) interfaceC42252, t);
        }
        C7205.m3498(this, interfaceC4225);
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۡۧۢۡ.ۥ():Yue.ۥۣ۠ۢۤ */
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final Object m22579(InterfaceC4199<? super C8107> interfaceC4199, T t) {
        InterfaceC4225 context = interfaceC4199.getContext();
        C5553.m17211(context);
        InterfaceC4225 interfaceC4225 = this.f21764;
        if (interfaceC4225 != context) {
            m22578(context, interfaceC4225, t);
            this.f21764 = context;
        }
        this.f21765 = interfaceC4199;
        Object objMo15350 = C7204.f2739.mo15350(this.f21761, t, this);
        if (!C5499.m17094(objMo15350, C5508.m17142())) {
            this.f21765 = null;
        }
        return objMo15350;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final void m22580(C4513 c4513, Object obj) {
        throw new IllegalStateException(C7619.m23846("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + c4513.f9605 + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
