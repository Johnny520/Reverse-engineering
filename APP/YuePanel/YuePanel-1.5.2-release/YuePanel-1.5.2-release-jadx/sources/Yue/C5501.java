package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n204#1,4:270\n225#1:274\n204#1,4:275\n225#1:279\n*S KotlinDebug\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n130#1:270,4\n130#1:274\n165#1:275,4\n165#1:279\n*E\n"})
public class C5501 {

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧۢ$ۥ */
    @InterfaceC7507({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n*L\n1#1,269:1\n*E\n"})
    public static final class C0780 extends AbstractC7145 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f13468;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<InterfaceC4199<? super T>, Object> f13469;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۟ۧۤۢ<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0780(InterfaceC4199<? super T> interfaceC4199, InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124) {
            super(interfaceC4199);
            this.f13469 = interfaceC5124;
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to Yue.ￛﾥￛﾠￛﾥￛﾧￛﾢ$ￛﾥ for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // Yue.AbstractC3513
        @Yue.InterfaceC6489
        public java.lang.Object invokeSuspend(@Yue.InterfaceC6399 java.lang.Object r3) {
            /*
                r2 = this;
                int r0 = r2.f13468
                r1 = 1
                if (r0 == 0) goto L1a
                if (r0 != r1) goto Le
                r0 = 2
                r2.f13468 = r0
                Yue.C7149.m22422(r3)
                goto L25
            Le:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This coroutine had already completed"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L1a:
                r2.f13468 = r1
                Yue.C7149.m22422(r3)
                Yue.ۥۣ۠ۡ۟<Yue.ۥ۟ۧۤۢ<? super T>, java.lang.Object> r3 = r2.f13469
                java.lang.Object r3 = r3.invoke(r2)
            L25:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C5501.C0780.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧۢ$ۥ۟ */
    @InterfaceC7507({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n*L\n1#1,269:1\n*E\n"})
    public static final class C0781 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f13470;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124<InterfaceC4199<? super T>, Object> f13471;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۟ۧۤۢ<? super T>, ? extends java.lang.Object> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0781(InterfaceC4199<? super T> interfaceC4199, InterfaceC4225 interfaceC4225, InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124) {
            super(interfaceC4199, interfaceC4225);
            this.f13471 = interfaceC5124;
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to Yue.ￛﾥￛﾠￛﾥￛﾧￛﾢ$ￛﾥￛﾟ for r2v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // Yue.AbstractC3513
        @Yue.InterfaceC6489
        public java.lang.Object invokeSuspend(@Yue.InterfaceC6399 java.lang.Object r3) {
            /*
                r2 = this;
                int r0 = r2.f13470
                r1 = 1
                if (r0 == 0) goto L1a
                if (r0 != r1) goto Le
                r0 = 2
                r2.f13470 = r0
                Yue.C7149.m22422(r3)
                goto L25
            Le:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "This coroutine had already completed"
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
            L1a:
                r2.f13470 = r1
                Yue.C7149.m22422(r3)
                Yue.ۥۣ۠ۡ۟<Yue.ۥ۟ۧۤۢ<? super T>, java.lang.Object> r3 = r2.f13471
                java.lang.Object r3 = r3.invoke(r2)
            L25:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C5501.C0781.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧۢ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    public static final class C5502 extends AbstractC7145 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f13472;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124 f13473;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5502(InterfaceC4199 interfaceC4199, InterfaceC5124 interfaceC5124) {
            super(interfaceC4199);
            this.f13473 = interfaceC5124;
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public Object invokeSuspend(@InterfaceC6399 Object obj) {
            int i = this.f13472;
            if (i == 0) {
                this.f13472 = 1;
                C7149.m22422(obj);
                C5499.m17101(this.f13473, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((InterfaceC5124) C8012.m25265(this.f13473, 1)).invoke(this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f13472 = 2;
            C7149.m22422(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧۢ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n131#2:270\n*E\n"})
    public static final class C5503 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f13474;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5124 f13475;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5503(InterfaceC4199 interfaceC4199, InterfaceC4225 interfaceC4225, InterfaceC5124 interfaceC5124) {
            super(interfaceC4199, interfaceC4225);
            this.f13475 = interfaceC5124;
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public Object invokeSuspend(@InterfaceC6399 Object obj) {
            int i = this.f13474;
            if (i == 0) {
                this.f13474 = 1;
                C7149.m22422(obj);
                C5499.m17101(this.f13475, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                return ((InterfaceC5124) C8012.m25265(this.f13475, 1)).invoke(this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f13474 = 2;
            C7149.m22422(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    public static final class C5504 extends AbstractC7145 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f13476;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f13477;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Object f13478;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5504(InterfaceC4199 interfaceC4199, InterfaceC5138 interfaceC5138, Object obj) {
            super(interfaceC4199);
            this.f13477 = interfaceC5138;
            this.f13478 = obj;
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public Object invokeSuspend(@InterfaceC6399 Object obj) {
            int i = this.f13476;
            if (i == 0) {
                this.f13476 = 1;
                C7149.m22422(obj);
                C5499.m17101(this.f13477, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC5138) C8012.m25265(this.f13477, 2)).invoke(this.f13478, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f13476 = 2;
            C7149.m22422(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nIntrinsicsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2\n+ 2 IntrinsicsJvm.kt\nkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt\n*L\n1#1,269:1\n166#2:270\n*E\n"})
    public static final class C5505 extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f13479;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC5138 f13480;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ Object f13481;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5505(InterfaceC4199 interfaceC4199, InterfaceC4225 interfaceC4225, InterfaceC5138 interfaceC5138, Object obj) {
            super(interfaceC4199, interfaceC4225);
            this.f13480 = interfaceC5138;
            this.f13481 = obj;
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public Object invokeSuspend(@InterfaceC6399 Object obj) {
            int i = this.f13479;
            if (i == 0) {
                this.f13479 = 1;
                C7149.m22422(obj);
                C5499.m17101(this.f13480, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((InterfaceC5138) C8012.m25265(this.f13480, 2)).invoke(this.f13481, this);
            }
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f13479 = 2;
            C7149.m22422(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final class C5506 extends AbstractC7145 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5506(InterfaceC4199<? super T> interfaceC4199) {
            super(interfaceC4199);
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public Object invokeSuspend(@InterfaceC6399 Object obj) {
            C7149.m22422(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۧۢ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final class C5507 extends AbstractC4201 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5507(InterfaceC4199<? super T> interfaceC4199, InterfaceC4225 interfaceC4225) {
            super(interfaceC4199, interfaceC4225);
            C5499.m17101(interfaceC4199, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public Object invokeSuspend(@InterfaceC6399 Object obj) {
            C7149.m22422(obj);
            return obj;
        }
    }

    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC4199<C8107> m2257(InterfaceC4199<? super T> interfaceC4199, InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124) {
        InterfaceC4225 context = interfaceC4199.getContext();
        return context == C4629.f9940 ? new C0780(interfaceC4199, interfaceC5124) : new C0781(interfaceC4199, context, interfaceC5124);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۟ۧۤۢ<? super T>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟ */
    public static <T> InterfaceC4199<C8107> m2258(@InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5124, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        InterfaceC4199<?> interfaceC4199M1286 = C4324.m1286(interfaceC4199);
        if (interfaceC5124 instanceof AbstractC3513) {
            return ((AbstractC3513) interfaceC5124).create(interfaceC4199M1286);
        }
        InterfaceC4225 context = interfaceC4199M1286.getContext();
        return context == C4629.f9940 ? new C5502(interfaceC4199M1286, interfaceC5124) : new C5503(interfaceC4199M1286, context, interfaceC5124);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۣ۠ۢۢ<? super R, ? super Yue.ۥ۟ۧۤۢ<? super T>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static <R, T> InterfaceC4199<C8107> m17133(@InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, R r, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5138, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        InterfaceC4199<?> interfaceC4199M1286 = C4324.m1286(interfaceC4199);
        if (interfaceC5138 instanceof AbstractC3513) {
            return ((AbstractC3513) interfaceC5138).create(r, interfaceC4199M1286);
        }
        InterfaceC4225 context = interfaceC4199M1286.getContext();
        return context == C4629.f9940 ? new C5504(interfaceC4199M1286, interfaceC5138, r) : new C5505(interfaceC4199M1286, context, interfaceC5138, r);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4199<T> m17134(InterfaceC4199<? super T> interfaceC4199) {
        InterfaceC4225 context = interfaceC4199.getContext();
        return context == C4629.f9940 ? new C5506(interfaceC4199) : new C5507(interfaceC4199, context);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6399
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static <T> InterfaceC4199<T> m17135(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        InterfaceC4199<T> interfaceC41992;
        C5499.m17103(interfaceC4199, "<this>");
        AbstractC4201 abstractC4201 = interfaceC4199 instanceof AbstractC4201 ? (AbstractC4201) interfaceC4199 : null;
        return (abstractC4201 == null || (interfaceC41992 = (InterfaceC4199<T>) abstractC4201.intercepted()) == null) ? interfaceC4199 : interfaceC41992;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> Object m17136(InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124, InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5124, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        return !(interfaceC5124 instanceof AbstractC3513) ? m17139(interfaceC5124, interfaceC4199) : ((InterfaceC5124) C8012.m25265(interfaceC5124, 1)).invoke(interfaceC4199);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <R, T> Object m17137(InterfaceC5138<? super R, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, R r, InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5138, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        return !(interfaceC5138 instanceof AbstractC3513) ? m17140(interfaceC5138, r, interfaceC4199) : ((InterfaceC5138) C8012.m25265(interfaceC5138, 2)).invoke(r, interfaceC4199);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final <R, P, T> Object m17138(InterfaceC5140<? super R, ? super P, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5140, R r, P p, InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5140, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        return !(interfaceC5140 instanceof AbstractC3513) ? m17141(interfaceC5140, r, p, interfaceC4199) : ((InterfaceC5140) C8012.m25265(interfaceC5140, 3)).mo15350(r, p, interfaceC4199);
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final <T> Object m17139(@InterfaceC6399 InterfaceC5124<? super InterfaceC4199<? super T>, ? extends Object> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5124, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        return ((InterfaceC5124) C8012.m25265(interfaceC5124, 1)).invoke(m17134(C4324.m1286(interfaceC4199)));
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final <R, T> Object m17140(@InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138, R r, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5138, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        return ((InterfaceC5138) C8012.m25265(interfaceC5138, 2)).invoke(r, m17134(C4324.m1286(interfaceC4199)));
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static <R, P, T> Object m17141(@InterfaceC6399 InterfaceC5140<? super R, ? super P, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5140, R r, P p, @InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        C5499.m17103(interfaceC5140, "<this>");
        C5499.m17103(interfaceC4199, "completion");
        return ((InterfaceC5140) C8012.m25265(interfaceC5140, 3)).mo15350(r, p, m17134(C4324.m1286(interfaceC4199)));
    }
}
