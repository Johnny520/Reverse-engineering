package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4909 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ$ۥ */
    public static final class C0536<T> implements InterfaceC4890<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3592 f11368;

        public C0536(InterfaceC3592 interfaceC3592) {
            this.f11368 = interfaceC3592;
        }

        @Override // Yue.InterfaceC4890
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ */
        public Object mo48(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
            Object objM15209 = C4896.m15209(interfaceC4892, this.f11368.mo6940(), interfaceC4199);
            return objM15209 == C5508.m17142() ? objM15209 : C8107.f3222;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۢۤ$ۥ۟ */
    @InterfaceC4313(m1272c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", m1273f = "Channels.kt", m1274i = {0, 0, 0, 1, 1, 1}, m1275l = {51, 62}, m1276m = "emitAllImpl$FlowKt__ChannelsKt", m1277n = {"$this$emitAllImpl", "channel", "consume", "$this$emitAllImpl", "channel", "consume"}, m1278s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class C0537<T> extends AbstractC4201 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public Object f11369;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public Object f11370;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f11371;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public /* synthetic */ Object f11372;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f11373;

        public C0537(InterfaceC4199<? super C0537> interfaceC4199) {
            super(interfaceC4199);
        }

        @Override // Yue.AbstractC3513
        @InterfaceC6489
        public final Object invokeSuspend(@InterfaceC6399 Object obj) {
            this.f11372 = obj;
            this.f11373 |= Integer.MIN_VALUE;
            return C4909.m15323(null, null, false, this);
        }
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8970, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> InterfaceC4890<T> m1810(@InterfaceC6399 InterfaceC3592<T> interfaceC3592) {
        return new C0536(interfaceC3592);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15321(@InterfaceC6399 InterfaceC7042<? extends T> interfaceC7042) {
        return new C3714(interfaceC7042, true, null, 0, null, 28, null);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> Object m15322(@InterfaceC6399 InterfaceC4892<? super T> interfaceC4892, @InterfaceC6399 InterfaceC7042<? extends T> interfaceC7042, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objM15323 = m15323(interfaceC4892, interfaceC7042, true, interfaceC4199);
        return objM15323 == C5508.m17142() ? objM15323 : C8107.f3222;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:15:0x0039 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:0x0022 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:20:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:13:0x0032, B:27:0x006f, B:29:0x0075, B:35:0x0084, B:36:0x0085, B:20:0x004d), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v0, types: [Yue.ۥۣۣ۠ۢ, Yue.ۥۣۣ۠ۢ<? super T>] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v3, types: [Yue.ۥۣۣ۠ۢ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0095 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object m15323(InterfaceC4892<? super T> interfaceC4892, InterfaceC7042<? extends T> interfaceC7042, boolean z, InterfaceC4199<? super C8107> interfaceC4199) {
        C0537 c0537;
        Object objMo5726;
        ?? r8;
        ?? r82;
        ?? r6;
        if (interfaceC4199 instanceof C0537) {
            c0537 = (C0537) interfaceC4199;
            int i = c0537.f11373;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0537.f11373 = i - Integer.MIN_VALUE;
            } else {
                c0537 = new C0537(interfaceC4199);
            }
        }
        Object obj = c0537.f11372;
        Object objM17142 = C5508.m17142();
        int i2 = c0537.f11373;
        try {
        } catch (Throwable th) {
            th = th;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z2 = (InterfaceC4892<? super T>) c0537.f11371;
                interfaceC7042 = (InterfaceC7042) c0537.f11370;
                InterfaceC4892 interfaceC48922 = (InterfaceC4892) c0537.f11369;
                C7149.m22422(obj);
                objMo5726 = ((C3732) obj).m10211();
                interfaceC4892 = z2;
                r8 = interfaceC48922;
                if (!C3732.m10207(objMo5726)) {
                }
                throw th;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = (InterfaceC4892<? super T>) c0537.f11371;
            interfaceC7042 = (InterfaceC7042) c0537.f11370;
            InterfaceC4892 interfaceC48923 = (InterfaceC4892) c0537.f11369;
            C7149.m22422(obj);
            ?? r62 = z3;
            ?? r83 = interfaceC48923;
            ?? r5 = r83;
            r82 = r62;
            r6 = (InterfaceC4892<? super T>) r5;
            try {
                c0537.f11369 = r6;
                c0537.f11370 = interfaceC7042;
                c0537.f11371 = r82;
                c0537.f11373 = 1;
                objMo5726 = interfaceC7042.mo5726(c0537);
            } catch (Throwable th2) {
                ?? r52 = r82;
                th = th2;
                interfaceC4892 = r52 == true ? 1 : 0;
            }
            if (objMo5726 == objM17142) {
                return objM17142;
            }
            ?? r53 = r82;
            r8 = r6;
            interfaceC4892 = (InterfaceC4892<? super T>) (r53 == true ? 1 : 0 ? 1 : 0);
            if (!C3732.m10207(objMo5726)) {
                Throwable thM10202 = C3732.m10202(objMo5726);
                if (thM10202 != null) {
                    throw thM10202;
                }
                if (interfaceC4892 != 0) {
                    C3734.m810(interfaceC7042, null);
                }
                return C8107.f3222;
            }
            Object objM10205 = C3732.m10205(objMo5726);
            c0537.f11369 = r8;
            c0537.f11370 = interfaceC7042;
            c0537.f11371 = (boolean) interfaceC4892;
            c0537.f11373 = 2;
            Object objMo10059 = r8.mo10059(objM10205, c0537);
            r62 = interfaceC4892;
            r83 = r8;
            if (objMo10059 == objM17142) {
                return objM17142;
            }
            ?? r54 = r83;
            r82 = r62;
            r6 = (InterfaceC4892<? super T>) r54;
            c0537.f11369 = r6;
            c0537.f11370 = interfaceC7042;
            c0537.f11371 = r82;
            c0537.f11373 = 1;
            objMo5726 = interfaceC7042.mo5726(c0537);
            if (objMo5726 == objM17142) {
            }
            try {
                throw th;
            } catch (Throwable th3) {
                if (interfaceC4892 != 0) {
                    C3734.m810(interfaceC7042, th);
                }
                throw th3;
            }
        }
        C7149.m22422(obj);
        C4896.m15211(interfaceC4892);
        r6 = interfaceC4892;
        r82 = z;
        c0537.f11369 = r6;
        c0537.f11370 = interfaceC7042;
        c0537.f11371 = r82;
        c0537.f11373 = 1;
        objMo5726 = interfaceC7042.mo5726(c0537);
        if (objMo5726 == objM17142) {
        }
    }

    @InterfaceC6399
    @InterfaceC5039
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> InterfaceC7042<T> m15324(@InterfaceC6399 InterfaceC4890<? extends T> interfaceC4890, @InterfaceC6399 InterfaceC4243 interfaceC4243) {
        return C3718.m800(interfaceC4890).mo10174(interfaceC4243);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> InterfaceC4890<T> m15325(@InterfaceC6399 InterfaceC7042<? extends T> interfaceC7042) {
        return new C3714(interfaceC7042, false, null, 0, null, 28, null);
    }
}
