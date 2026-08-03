package Yue;

import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4334<T, R> extends AbstractC4333<T, R> implements InterfaceC4199<R> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public InterfaceC5140<? super AbstractC4333<?, ?>, Object, ? super InterfaceC4199<Object>, ? extends Object> f8890;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public Object f8891;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6489
    public InterfaceC4199<Object> f8892;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public Object f8893;

    /* JADX INFO: renamed from: Yue.ۥ۟ۨۥۡ$ۥ */
    @InterfaceC7507({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,161:1\n184#2,6:162\n*E\n"})
    public static final class C0382 implements InterfaceC4199<Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4225 f8894;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C4334 f8895;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5140 f8896;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4199 f8897;

        public C0382(InterfaceC4225 interfaceC4225, C4334 c4334, InterfaceC5140 interfaceC5140, InterfaceC4199 interfaceC4199) {
            this.f8894 = interfaceC4225;
            this.f8895 = c4334;
            this.f8896 = interfaceC5140;
            this.f8897 = interfaceC4199;
        }

        @Override // Yue.InterfaceC4199
        @InterfaceC6399
        public InterfaceC4225 getContext() {
            return this.f8894;
        }

        @Override // Yue.InterfaceC4199
        public void resumeWith(@InterfaceC6399 Object obj) {
            this.f8895.f8890 = this.f8896;
            this.f8895.f8892 = this.f8897;
            this.f8895.f8893 = obj;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۤ<? super Yue.ۥ۟ۨۥ۠<T, R>, ? super T, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4334(@InterfaceC6399 InterfaceC5140<? super AbstractC4333<T, R>, ? super T, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5140, T t) {
        super(null);
        C5499.m17103(interfaceC5140, "block");
        this.f8890 = interfaceC5140;
        this.f8891 = t;
        C5499.m17101(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f8892 = this;
        this.f8893 = C4332.f823;
    }

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        return C4629.f9940;
    }

    @Override // Yue.InterfaceC4199
    public void resumeWith(@InterfaceC6399 Object obj) {
        this.f8892 = null;
        this.f8893 = obj;
    }

    @Override // Yue.AbstractC4333
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public <U, S> Object mo1301(@InterfaceC6399 C4331<U, S> c4331, U u, @InterfaceC6399 InterfaceC4199<? super S> interfaceC4199) {
        InterfaceC5140<AbstractC4333<U, S>, U, InterfaceC4199<? super S>, Object> interfaceC5140M1298 = c4331.m1298();
        C5499.m17101(interfaceC5140M1298, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        InterfaceC5140<? super AbstractC4333<?, ?>, Object, ? super InterfaceC4199<Object>, ? extends Object> interfaceC5140 = this.f8890;
        if (interfaceC5140M1298 != interfaceC5140) {
            this.f8890 = interfaceC5140M1298;
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f8892 = m12584(interfaceC5140, interfaceC4199);
        } else {
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f8892 = interfaceC4199;
        }
        this.f8891 = u;
        Object objM17142 = C5508.m17142();
        if (objM17142 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM17142;
    }

    @Override // Yue.AbstractC4333
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public Object mo1302(T t, @InterfaceC6399 InterfaceC4199<? super R> interfaceC4199) {
        C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f8892 = interfaceC4199;
        this.f8891 = t;
        Object objM17142 = C5508.m17142();
        if (objM17142 == C5508.m17142()) {
            C4324.m12513(interfaceC4199);
        }
        return objM17142;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final InterfaceC4199<Object> m12584(InterfaceC5140<? super AbstractC4333<?, ?>, Object, ? super InterfaceC4199<Object>, ? extends Object> interfaceC5140, InterfaceC4199<Object> interfaceC4199) {
        return new C0382(C4629.f9940, this, interfaceC5140, interfaceC4199);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final R m12585() {
        while (true) {
            R r = (R) this.f8893;
            InterfaceC4199<Object> interfaceC4199 = this.f8892;
            if (interfaceC4199 == null) {
                C7149.m22422(r);
                return r;
            }
            if (C7148.m22402(C4332.f823, r)) {
                try {
                    InterfaceC5140<? super AbstractC4333<?, ?>, Object, ? super InterfaceC4199<Object>, ? extends Object> interfaceC5140 = this.f8890;
                    Object obj = this.f8891;
                    Object objM17141 = !(interfaceC5140 instanceof AbstractC3513) ? C5501.m17141(interfaceC5140, this, obj, interfaceC4199) : ((InterfaceC5140) C8012.m25265(interfaceC5140, 3)).mo15350(this, obj, interfaceC4199);
                    if (objM17141 != C5508.m17142()) {
                        C7148.C1189 c1189 = C7148.f21560;
                        interfaceC4199.resumeWith(C7148.m3438(objM17141));
                    }
                } catch (Throwable th) {
                    C7148.C1189 c11892 = C7148.f21560;
                    interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(th)));
                }
            } else {
                this.f8893 = C4332.f823;
                interfaceC4199.resumeWith(r);
            }
        }
    }
}
