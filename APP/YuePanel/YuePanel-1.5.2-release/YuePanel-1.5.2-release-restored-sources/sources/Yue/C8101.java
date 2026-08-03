package Yue;

import com.android.p001dx.p004io.Opcodes;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8101<T> implements InterfaceC4892<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225 f24024;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final Object f24025;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5138<T, InterfaceC4199<? super C8107>, Object> f24026;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۠$ۥ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m1273f = "ChannelFlow.kt", m1274i = {}, m1275l = {Opcodes.REM_INT_LIT16}, m1276m = "invokeSuspend", m1277n = {}, m1278s = {})
    public static final class C1434 extends AbstractC7690 implements InterfaceC5138<T, InterfaceC4199<? super C8107>, Object> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f24027;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public /* synthetic */ Object f24028;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC4892<T> f24029;

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥۣۣ۠ۢ<? super T> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C1434(InterfaceC4892<? super T> interfaceC4892, InterfaceC4199<? super C1434> interfaceC4199) {
            super(2, interfaceC4199);
            this.f24029 = interfaceC4892;
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6399
        public final InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
            C1434 c1434 = new C1434(this.f24029, interfaceC4199);
            c1434.f24028 = obj;
            return c1434;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ to Yue.ￛﾥￛﾢￛﾣￛﾠ$ￛﾥ for r3v1 'this'  Yue.ￛﾥￛﾟￛﾧￛﾤￛﾢ
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
                int r1 = r3.f24027
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                Yue.C7149.m22422(r4)
                goto L27
            Lf:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r0)
                throw r4
            L17:
                Yue.C7149.m22422(r4)
                java.lang.Object r4 = r3.f24028
                Yue.ۥۣۣ۠ۢ<T> r1 = r3.f24029
                r3.f24027 = r2
                java.lang.Object r4 = r1.mo10059(r4, r3)
                if (r4 != r0) goto L27
                return r0
            L27:
                Yue.ۥۣۢ۠ۤ r4 = Yue.C8107.f3222
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: Yue.C8101.C1434.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5138
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Object invoke(T t, @InterfaceC6489 InterfaceC4199<? super C8107> interfaceC4199) {
            return ((C1434) create(t, interfaceC4199)).invokeSuspend(C8107.f3222);
        }
    }

    public C8101(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        this.f24024 = interfaceC4225;
        this.f24025 = C7776.m3875(interfaceC4225);
        this.f24026 = new C1434(interfaceC4892, null);
    }

    @Override // Yue.InterfaceC4892
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public Object mo10059(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM10183 = C3718.m10183(this.f24024, t, this.f24025, this.f24026, interfaceC4199);
        return objM10183 == C5508.m17142() ? objM10183 : C8107.f3222;
    }
}
