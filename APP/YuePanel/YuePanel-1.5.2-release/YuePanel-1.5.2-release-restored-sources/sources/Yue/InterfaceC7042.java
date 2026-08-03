package Yue;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥۡۦۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC7042<E> {

    /* JADX INFO: renamed from: Yue.ۥۡۦۡۡ$ۥ */
    public static final class C1149 {

        /* JADX INFO: renamed from: Yue.ۥۡۦۡۡ$ۥ$ۥ, reason: contains not printable characters */
        public static final class C7043 implements InterfaceC7287<E> {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ InterfaceC7042<E> f21279;

            /* JADX INFO: Add missing generic type declarations: [R] */
            /* JADX INFO: renamed from: Yue.ۥۡۦۡۡ$ۥ$ۥ$ۥ, reason: contains not printable characters */
            @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", m1273f = "Channel.kt", m1274i = {}, m1275l = {375}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
            public static final class C7044<R> extends AbstractC7690 implements InterfaceC5138<C3732<? extends E>, InterfaceC4199<? super R>, Object> {

                /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
                public int f21280;

                /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
                public /* synthetic */ Object f21281;

                /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC5138<E, InterfaceC4199<? super R>, Object> f21282;

                /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣ۠ۢۢ<? super E, ? super Yue.ۥ۟ۧۤۢ<? super R>, ? extends java.lang.Object> */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C7044(InterfaceC5138<? super E, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138, InterfaceC4199<? super C7044> interfaceC4199) {
                    super(2, interfaceC4199);
                    this.f21282 = interfaceC5138;
                }

                @Override // Yue.AbstractC3513
                @InterfaceC6399
                public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
                    C7044 c7044 = new C7044(this.f21282, interfaceC4199);
                    c7044.f21281 = obj;
                    return c7044;
                }

                @Override // Yue.InterfaceC5138
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return m21934(((C3732) obj).m10211(), (InterfaceC4199) obj2);
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to Yue.ￛﾥￛﾡￛﾦￛﾡￛﾡ$ￛﾥ$ￛﾥ$ￛﾥ<R> for r3v1 'this'  java.lang.Object
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // Yue.AbstractC3513
                @Yue.InterfaceC6489
                public final java.lang.Object invokeSuspend(@Yue.InterfaceC6399 java.lang.Object r4) {
                    /*
                        r3 = this;
                        java.lang.Object r0 = Yue.C5508.m17142()
                        int r1 = r3.f21280
                        r2 = 1
                        if (r1 == 0) goto L17
                        if (r1 != r2) goto Lf
                        Yue.C7149.m22422(r4)
                        goto L37
                    Lf:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r0)
                        throw r4
                    L17:
                        Yue.C7149.m22422(r4)
                        java.lang.Object r4 = r3.f21281
                        Yue.ۥ۟ۤۢ۟ r4 = (Yue.C3732) r4
                        java.lang.Object r4 = r4.m10211()
                        java.lang.Throwable r1 = Yue.C3732.m10202(r4)
                        if (r1 != 0) goto L38
                        Yue.ۥۣ۠ۢۢ<E, Yue.ۥ۟ۧۤۢ<? super R>, java.lang.Object> r1 = r3.f21282
                        java.lang.Object r4 = Yue.C3732.m10204(r4)
                        r3.f21280 = r2
                        java.lang.Object r4 = r1.invoke(r4, r3)
                        if (r4 != r0) goto L37
                        return r0
                    L37:
                        return r4
                    L38:
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Yue.InterfaceC7042.C1149.C7043.C7044.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @InterfaceC6489
                /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
                public final Object m21934(@InterfaceC6399 Object obj, @InterfaceC6489 InterfaceC4199<? super R> interfaceC4199) {
                    return ((C7044) create(C3732.m806(obj), interfaceC4199)).invokeSuspend(C8107.f3222);
                }
            }

            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۡۦۡۡ<? extends E> */
            /* JADX WARN: Multi-variable type inference failed */
            public C7043(InterfaceC7042<? extends E> interfaceC7042) {
                this.f21279 = interfaceC7042;
            }

            @Override // Yue.InterfaceC7287
            @InterfaceC5495
            /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
            public <R> void mo5764(@InterfaceC6399 InterfaceC7289<? super R> interfaceC7289, @InterfaceC6399 InterfaceC5138<? super E, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
                this.f21279.mo5722().mo5764(interfaceC7289, new C7044(interfaceC5138, null));
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۡۦۡۡ$ۥ$ۥ۟, reason: contains not printable characters */
        @InterfaceC4313(m1272c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", m1273f = "Channel.kt", m1274i = {}, m1275l = {354}, m1276m = "receiveOrNull", m1277n = {}, m1278s = {})
        public static final class C7045<E> extends AbstractC4201 {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public /* synthetic */ Object f21283;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f21284;

            public C7045(InterfaceC4199<? super C7045> interfaceC4199) {
                super(interfaceC4199);
            }

            @Override // Yue.AbstractC3513
            @InterfaceC6489
            public final Object invokeSuspend(@InterfaceC6399 Object obj) {
                this.f21283 = obj;
                this.f21284 |= Integer.MIN_VALUE;
                return C1149.m21933(null, this);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static /* synthetic */ void m3336(InterfaceC7042 interfaceC7042, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC7042.mo5718(cancellationException);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static /* synthetic */ boolean m21927(InterfaceC7042 interfaceC7042, Throwable th, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return interfaceC7042.mo5717(th);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static <E> InterfaceC7287<E> m21928(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042) {
            return new C7043(interfaceC7042);
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @InterfaceC7097(expression = "onReceiveCatching", imports = {}))
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ void m21929() {
        }

        @InterfaceC4764
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static /* synthetic */ void m21930() {
        }

        @InterfaceC4764
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static /* synthetic */ void m21931() {
        }

        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC7097(expression = "tryReceive().getOrNull()", imports = {}))
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static <E> E m21932(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042) throws Throwable {
            Object objMo5724 = interfaceC7042.mo5724();
            if (C3732.m10209(objMo5724)) {
                return (E) C3732.m10205(objMo5724);
            }
            Throwable thM10202 = C3732.m10202(objMo5724);
            if (thM10202 == null) {
                return null;
            }
            throw C7565.m23687(thM10202);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @InterfaceC5890
        @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @InterfaceC7097(expression = "receiveCatching().getOrNull()", imports = {}))
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static <E> Object m21933(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4199<? super E> interfaceC4199) {
            C7045 c7045;
            Object objMo5726;
            if (interfaceC4199 instanceof C7045) {
                c7045 = (C7045) interfaceC4199;
                int i = c7045.f21284;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c7045.f21284 = i - Integer.MIN_VALUE;
                } else {
                    c7045 = new C7045(interfaceC4199);
                }
            }
            Object obj = c7045.f21283;
            Object objM17142 = C5508.m17142();
            int i2 = c7045.f21284;
            if (i2 == 0) {
                C7149.m22422(obj);
                c7045.f21284 = 1;
                objMo5726 = interfaceC7042.mo5726(c7045);
                if (objMo5726 == objM17142) {
                    return objM17142;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7149.m22422(obj);
                objMo5726 = ((C3732) obj).m10211();
            }
            return C3732.m10204(objMo5726);
        }
    }

    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean isEmpty();

    @InterfaceC6399
    InterfaceC3728<E> iterator();

    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @InterfaceC7097(expression = "tryReceive().getOrNull()", imports = {}))
    @InterfaceC6489
    E poll();

    @InterfaceC4372(level = EnumC0393.f8972, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* JADX INFO: renamed from: ۥ۟۟ */
    /* synthetic */ boolean mo5717(Throwable th);

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    void mo5718(@InterfaceC6489 CancellationException cancellationException);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    Object mo5719(@InterfaceC6399 InterfaceC4199<? super E> interfaceC4199);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    boolean mo5720();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    InterfaceC7287<E> mo5721();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    InterfaceC7287<C3732<E>> mo5722();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    InterfaceC7287<E> mo5723();

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    Object mo5724();

    @InterfaceC5890
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @InterfaceC7097(expression = "receiveCatching().getOrNull()", imports = {}))
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    Object mo5725(@InterfaceC6399 InterfaceC4199<? super E> interfaceC4199);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    Object mo5726(@InterfaceC6399 InterfaceC4199<? super C3732<? extends E>> interfaceC4199);
}
